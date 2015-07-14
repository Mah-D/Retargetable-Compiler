import x10.lang.*;

class MGOP
extends x10.
  lang.
  Object
{
    
//#line 2
final public static boolean
      PERF_On =
      Util.
        PERF_OUTPUT;
    
//#line 3
final public static double
      PERF_Comp =
      1.0 /
      Util.
        FP_PERCLOCK;
    
//#line 4
final public static double
      PERF_CommL =
      Util.
        COMM_LATENCY *
      Util.
        CLOCK_SPEED;
    
//#line 5
final public static double
      PERF_CommB =
      (((double)
          Util.
            CLOCK_SPEED /
          (double)
            Util.
              COMM_BANDWIDTH)) *
      8.0;
    
//#line 6
final public static boolean
      PERF_InLoop =
      Util.
        IN_LOOP;
    
//#line 7
final public static boolean
      PERF_CompOnly =
      Util.
        COMP_ONLY;
    
//#line 8
final public static boolean
      PERF_CommOnly =
      Util.
        COMM_ONLY;
    
//#line 9
final public static boolean
      OVERLAPPED =
      Util.
        OVERLAP_COMMANDCOMP;
    
//#line 10
final public boolean
      EXCHANGE_After;
    
//#line 11
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
    
//#line 12
final public static double
      Ac0 =
      -8.0 /
      3.0;
    
//#line 13
final public static double
      Ac1 =
      0.0;
    
//#line 14
final public static double
      Ac2 =
      1.0 /
      6.0;
    
//#line 15
final public static double
      Ac3 =
      1.0 /
      12.0;
    
//#line 16
final public static double
      Sac0 =
      -3.0 /
      8.0;
    
//#line 17
final public static double
      Sac1 =
      1.0 /
      32.0;
    
//#line 18
final public static double
      Sac2 =
      -1.0 /
      64.0;
    
//#line 19
final public static double
      Sac3 =
      0.0;
    
//#line 20
final public static double
      Pc0 =
      1.0 /
      2.0;
    
//#line 21
final public static double
      Pc1 =
      1.0 /
      4.0;
    
//#line 22
final public static double
      Pc2 =
      1.0 /
      8.0;
    
//#line 23
final public static double
      Pc3 =
      1.0 /
      16.0;
    
//#line 24
final private static int
      P2SLEVEL =
      Util.
        P2SLEVEL -
      1;
    
//#line 25
final private int
      m_size;
    
//#line 26
final private x10.
      lang.
      region
      m_problemDomain;
    
//#line 27
final private int
      m_levels;
    
//#line 28
private x10.
      lang.
      GenericReferenceArray
      m_r;
    
//#line 29
private x10.
      lang.
      GenericReferenceArray
      m_z;
    
//#line 30
private LevelData
      m_tempLD;
    
    
//#line 31
public MGOP(final int a_size) {
        
//#line 31
super();
        
//#line 32
boolean temp_EXCHANGE_After =
          false;
        
//#line 33
if (Util.
                          OVERLAP_COMMANDCOMP) {
            
//#line 34
temp_EXCHANGE_After =
              false;
        } else {
            
//#line 36
temp_EXCHANGE_After =
              Util.
                EXCHANGE_AFTER;
        }
        
//#line 37
EXCHANGE_After =
          temp_EXCHANGE_After;
        
//#line 38
int i =
          0;
        
//#line 39
int j =
          0;
        
//#line 40
int k =
          0;
        
//#line 41
m_size =
          a_size;
        
//#line 42
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
        
//#line 43
final int log_a_size =
          Util.
            log2(
            a_size);
        
//#line 44
m_levels =
          log_a_size;
        
//#line 45
if (P2SLEVEL >
                          0) {
            
//#line 46
i =
              Util.
                pow2(
                P2SLEVEL);
            
//#line 47
j =
              i *
                i *
                i;
        } else {
            
        }
        
//#line 51
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
        
//#line 52
m_r =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
             lang.
             point p/* } */, x10.compilergenerated.Parameter1 dummy) { {
               
//#line 53
return new LevelData(
                 Util.
                   pow2(
                   /* template:array_get { */((p).get(0))/* } */ +
                     1),
                 /* template:array_get { */((p).get(0))/* } */ >=
                   P2SLEVEL);
           } }
           }/* } */,true,true,true)/* } */);
        
//#line 55
m_z =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
             lang.
             point p/* } */, x10.compilergenerated.Parameter1 dummy) { {
               
//#line 56
return new LevelData(
                 Util.
                   pow2(
                   /* template:array_get { */((p).get(0))/* } */ +
                     1),
                 /* template:array_get { */((p).get(0))/* } */ >=
                   P2SLEVEL);
           } }
           }/* } */,true,true,true)/* } */);
        
//#line 58
if (P2SLEVEL >
                          0) {
            
//#line 59
m_tempLD =
              new LevelData(
                Util.
                  pow2(
                  P2SLEVEL),
                true);
        }
        
//#line 60
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("Overlapping communication and computation? " +
                                                                                                                         OVERLAPPED +
                                                                                                                         ". If not, doing exchange after computation? " +
                                                                                                                         temp_EXCHANGE_After);
    }
    
    
//#line 62
public void
                  computeResidual2(
                  final LevelData RES,
                  final LevelData a_arg) {
        
//#line 63
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 64
/* template:ateach { */
            {
            	x10.lang.dist __var0____distCopy = RES.
                                                  getPlaces(); // make copy to avoid recomputation
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
                
//#line 65
final x10.
                  lang.
                  DoubleReferenceArray res =
                  RES.
                    getArray(
                    i);
                
//#line 66
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 67
x10.
                  lang.
                  region R =
                  RES.
                    getInnerRegion(
                    i);
                
//#line 68
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 69
double d0 =
                      /* template:array_get { */((arg).get(p))/* } */;
                    
//#line 70
double d1 =
                      0;
                    
//#line 71
double d2 =
                      Util.
                        sumDIFF2(
                        p,
                        arg);
                    
//#line 72
double d3 =
                      Util.
                        sumDIFF3(
                        p,
                        arg);
                    
//#line 73
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
        	} catch (Throwable tmp44) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp44);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 76
if (EXCHANGE_After) {
            
//#line 77
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 78
RES.
                              exchange();
            }
            	} catch (Throwable tmp45) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp45);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
    }
    
    
//#line 80
private void
                  computeResidual3(
                  final LevelData a_res,
                  final LevelData a_arg1,
                  final LevelData a_arg2) {
        
//#line 81
if (OVERLAPPED) {
            
//#line 82
ComputeResidual_Overlapped(
                          a_res,
                          a_arg1,
                          a_arg2);
        } else {
            
//#line 84
ComputeResidual(
                          a_res,
                          a_arg1,
                          a_arg2);
        }
    }
    
    
//#line 86
private void
                  ComputeResidual(
                  final LevelData a_res,
                  final LevelData a_arg1,
                  final LevelData a_arg2) {
        
//#line 87
if (!EXCHANGE_After) {
            
//#line 88
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 89
a_arg2.
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
        
//#line 90
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 91
/* template:ateach { */
            {
            	x10.lang.dist __var1____distCopy = a_res.
                                                  getPlaces(); // make copy to avoid recomputation
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
                
//#line 92
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 93
final x10.
                  lang.
                  DoubleReferenceArray arg1 =
                  a_arg1.
                    getArray(
                    i);
                
//#line 94
final x10.
                  lang.
                  DoubleReferenceArray arg2 =
                  a_arg2.
                    getArray(
                    i);
                
//#line 95
x10.
                  lang.
                  region R =
                  a_res.
                    getInnerRegion(
                    i);
                
//#line 96
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 97
double d0 =
                      /* template:array_get { */((arg2).get(p))/* } */;
                    
//#line 98
double d2 =
                      Util.
                        sumDIFF2(
                        p,
                        arg2);
                    
//#line 99
double d3 =
                      Util.
                        sumDIFF3(
                        p,
                        arg2);
                    
//#line 100
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
        	} catch (Throwable tmp47) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp47);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 103
if (EXCHANGE_After) {
            
//#line 104
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 105
a_res.
                               exchange();
            }
            	} catch (Throwable tmp48) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp48);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
    }
    
    
//#line 107
private void
                   ComputeResidual_Overlapped1(
                   final LevelData a_res,
                   final LevelData a_arg1,
                   final LevelData a_arg2) {
        
//#line 108
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 109
a_arg2.
                           exchange();
            
//#line 110
/* template:ateach { */
            {
            	x10.lang.dist __var2____distCopy = a_res.
                                                  getPlaces(); // make copy to avoid recomputation
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
                
//#line 111
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 112
final x10.
                  lang.
                  DoubleReferenceArray arg1 =
                  a_arg1.
                    getArray(
                    i);
                
//#line 113
final x10.
                  lang.
                  DoubleReferenceArray arg2 =
                  a_arg2.
                    getArray(
                    i);
                
//#line 114
x10.
                  lang.
                  region R =
                  a_res.
                    getINNERRegion(
                    i);
                
//#line 115
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 116
double d0 =
                      /* template:array_get { */((arg2).get(p))/* } */;
                    
//#line 117
double d2 =
                      Util.
                        sumDIFF2(
                        p,
                        arg2);
                    
//#line 118
double d3 =
                      Util.
                        sumDIFF3(
                        p,
                        arg2);
                    
//#line 119
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
        	} catch (Throwable tmp49) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp49);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 123
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 124
/* template:ateach { */
            {
            	x10.lang.dist __var3____distCopy = a_res.
                                                  getPlaces(); // make copy to avoid recomputation
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
                
//#line 125
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 126
final x10.
                  lang.
                  DoubleReferenceArray arg1 =
                  a_arg1.
                    getArray(
                    i);
                
//#line 127
final x10.
                  lang.
                  DoubleReferenceArray arg2 =
                  a_arg2.
                    getArray(
                    i);
                
//#line 128
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
                
//#line 129
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 130
double d0 =
                      /* template:array_get { */((arg2).get(p))/* } */;
                    
//#line 131
double d2 =
                      Util.
                        sumDIFF2(
                        p,
                        arg2);
                    
//#line 132
double d3 =
                      Util.
                        sumDIFF3(
                        p,
                        arg2);
                    
//#line 133
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
        	} catch (Throwable tmp50) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp50);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 137
private void
                   ComputeResidual_Overlapped(
                   final LevelData a_res,
                   final LevelData a_arg1,
                   final LevelData a_arg2) {
        
//#line 138
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 139
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:here { */x10.lang.Runtime.here()/* } */)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 140
/* template:ateach { */
                {
                	x10.lang.dist __var4____distCopy = a_res.
                                                      getPlaces(); // make copy to avoid recomputation
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
                    
//#line 141
final x10.
                      lang.
                      DoubleReferenceArray res =
                      a_res.
                        getArray(
                        i);
                    
//#line 142
final x10.
                      lang.
                      DoubleReferenceArray arg1 =
                      a_arg1.
                        getArray(
                        i);
                    
//#line 143
final x10.
                      lang.
                      DoubleReferenceArray arg2 =
                      a_arg2.
                        getArray(
                        i);
                    
//#line 144
x10.
                      lang.
                      region R =
                      a_res.
                        getINNERRegion(
                        i);
                    
//#line 145
/* template:forloop { */
                    for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point p = (x10.
                      lang.
                      point) p__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 146
double d0 =
                          /* template:array_get { */((arg2).get(p))/* } */;
                        
//#line 147
double d2 =
                          Util.
                            sumDIFF2(
                            p,
                            arg2);
                        
//#line 148
double d3 =
                          Util.
                            sumDIFF3(
                            p,
                            arg2);
                        
//#line 149
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
                
                
//#line 152
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 153
a_arg2.
                                   exchange();
                }
                	} catch (Throwable tmp52) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp52);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 154
/* template:ateach { */
                {
                	x10.lang.dist __var5____distCopy = a_res.
                                                      getPlaces(); // make copy to avoid recomputation
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
                    
//#line 155
final x10.
                      lang.
                      DoubleReferenceArray res =
                      a_res.
                        getArray(
                        i);
                    
//#line 156
final x10.
                      lang.
                      DoubleReferenceArray arg1 =
                      a_arg1.
                        getArray(
                        i);
                    
//#line 157
final x10.
                      lang.
                      DoubleReferenceArray arg2 =
                      a_arg2.
                        getArray(
                        i);
                    
//#line 158
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
                    
//#line 159
/* template:forloop { */
                    for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point p = (x10.
                      lang.
                      point) p__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 160
double d0 =
                          /* template:array_get { */((arg2).get(p))/* } */;
                        
//#line 161
double d2 =
                          Util.
                            sumDIFF2(
                            p,
                            arg2);
                        
//#line 162
double d3 =
                          Util.
                            sumDIFF3(
                            p,
                            arg2);
                        
//#line 163
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
        	} catch (Throwable tmp51) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp51);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 168
private void
                   smooth(
                   final LevelData a_res,
                   final LevelData a_arg,
                   final boolean a_isBottom) {
        
//#line 169
if (OVERLAPPED) {
            
//#line 170
Smooth_Overlapped(
                           a_res,
                           a_arg,
                           a_isBottom);
        } else {
            
//#line 172
Smooth(
                           a_res,
                           a_arg,
                           a_isBottom);
        }
    }
    
    
//#line 174
private void
                   Smooth(
                   final LevelData a_res,
                   final LevelData a_arg,
                   final boolean a_isBottom) {
        
//#line 175
if (!EXCHANGE_After) {
            
//#line 176
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 177
a_arg.
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
        
//#line 178
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 179
/* template:ateach { */
            {
            	x10.lang.dist __var6____distCopy = a_res.
                                                  getPlaces(); // make copy to avoid recomputation
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
                
//#line 180
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 181
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 182
x10.
                  lang.
                  region R =
                  a_res.
                    getInnerRegion(
                    i);
                
//#line 183
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 184
double d0 =
                      /* template:array_get { */((arg).get(p))/* } */;
                    
//#line 185
double d1 =
                      Util.
                        sumDIFF1(
                        p,
                        arg);
                    
//#line 186
double d2 =
                      Util.
                        sumDIFF2(
                        p,
                        arg);
                    
//#line 187
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
        	} catch (Throwable tmp54) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp54);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 190
if (EXCHANGE_After) {
            
//#line 191
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 192
a_res.
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
    
    
//#line 194
private void
                   Smooth_Overlapped1(
                   final LevelData a_res,
                   final LevelData a_arg,
                   final boolean a_isBottom) {
        
//#line 195
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 196
a_arg.
                           exchange();
            
//#line 197
/* template:ateach { */
            {
            	x10.lang.dist __var7____distCopy = a_res.
                                                  getPlaces(); // make copy to avoid recomputation
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
                
//#line 198
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 199
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 200
x10.
                  lang.
                  region R =
                  a_res.
                    getINNERRegion(
                    i);
                
//#line 201
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 202
double d0 =
                      /* template:array_get { */((arg).get(p))/* } */;
                    
//#line 203
double d1 =
                      Util.
                        sumDIFF1(
                        p,
                        arg);
                    
//#line 204
double d2 =
                      Util.
                        sumDIFF2(
                        p,
                        arg);
                    
//#line 205
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
        	} catch (Throwable tmp56) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp56);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 209
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 210
/* template:ateach { */
            {
            	x10.lang.dist __var8____distCopy = a_res.
                                                  getPlaces(); // make copy to avoid recomputation
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
                
//#line 211
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 212
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 213
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
                
//#line 214
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 215
double d0 =
                      /* template:array_get { */((arg).get(p))/* } */;
                    
//#line 216
double d1 =
                      Util.
                        sumDIFF1(
                        p,
                        arg);
                    
//#line 217
double d2 =
                      Util.
                        sumDIFF2(
                        p,
                        arg);
                    
//#line 218
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
        	} catch (Throwable tmp57) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp57);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 222
private void
                   Smooth_Overlapped(
                   final LevelData a_res,
                   final LevelData a_arg,
                   final boolean a_isBottom) {
        
//#line 223
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 224
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:here { */x10.lang.Runtime.here()/* } */)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 225
/* template:ateach { */
                {
                	x10.lang.dist __var9____distCopy = a_res.
                                                      getPlaces(); // make copy to avoid recomputation
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
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var9__).get(0))/* } */;/* } */
{
                    
//#line 226
final x10.
                      lang.
                      DoubleReferenceArray res =
                      a_res.
                        getArray(
                        i);
                    
//#line 227
final x10.
                      lang.
                      DoubleReferenceArray arg =
                      a_arg.
                        getArray(
                        i);
                    
//#line 228
x10.
                      lang.
                      region R =
                      a_res.
                        getINNERRegion(
                        i);
                    
//#line 229
/* template:forloop { */
                    for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point p = (x10.
                      lang.
                      point) p__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 230
double d0 =
                          /* template:array_get { */((arg).get(p))/* } */;
                        
//#line 231
double d1 =
                          Util.
                            sumDIFF1(
                            p,
                            arg);
                        
//#line 232
double d2 =
                          Util.
                            sumDIFF2(
                            p,
                            arg);
                        
//#line 233
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
                
                
//#line 236
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 237
a_arg.
                                   exchange();
                }
                	} catch (Throwable tmp59) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp59);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 238
/* template:ateach { */
                {
                	x10.lang.dist __var10____distCopy = a_res.
                                                       getPlaces(); // make copy to avoid recomputation
                	for (java.util.Iterator __var10____ = __var10____distCopy.iterator();
                		 __var10____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var10__ = (x10.
                  lang.
                  point) __var10____.next();
                		/* Join: { */final int i =
                  /* template:array_get { */((__var10__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var10____distCopy.get(__var10__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var10__).get(0))/* } */;/* } */
{
                    
//#line 239
final x10.
                      lang.
                      DoubleReferenceArray res =
                      a_res.
                        getArray(
                        i);
                    
//#line 240
final x10.
                      lang.
                      DoubleReferenceArray arg =
                      a_arg.
                        getArray(
                        i);
                    
//#line 241
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
                        
//#line 246
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
        	} catch (Throwable tmp58) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp58);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 251
private void
                   applyOpP3(
                   final LevelData a_res,
                   final LevelData a_arg,
                   final int a_level) {
        
//#line 252
if (a_level ==
                           P2SLEVEL) {
            
//#line 253
applyOpP2(
                           m_tempLD,
                           a_arg);
            
//#line 254
final x10.
              lang.
              DoubleReferenceArray res =
              a_res.
                getArray(
                0);
            
//#line 255
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 256
/* template:ateach { */
                {
                	x10.lang.dist __var11____distCopy = m_tempLD.
                                                       getPlaces(); // make copy to avoid recomputation
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
                    
//#line 257
x10.
                      lang.
                      DoubleReferenceArray temp =
                      m_tempLD.
                        getArray(
                        i);
                    
//#line 258
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
            	} catch (Throwable tmp60) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp60);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        } else {
            
//#line 262
applyOpP2(
                           a_res,
                           a_arg);
        }
        
//#line 263
if (EXCHANGE_After) {
            
//#line 264
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 265
a_res.
                               exchange();
            }
            	} catch (Throwable tmp61) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp61);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
    }
    
    
//#line 267
private void
                   applyOpP2(
                   final LevelData a_res,
                   final LevelData a_arg) {
        
//#line 268
if (OVERLAPPED) {
            
//#line 269
ApplyOpP_Overlapped(
                           a_res,
                           a_arg);
        } else {
            
//#line 271
ApplyOpP(
                           a_res,
                           a_arg);
        }
    }
    
    
//#line 273
private void
                   ApplyOpP(
                   final LevelData a_res,
                   final LevelData a_arg) {
        
//#line 274
if (!EXCHANGE_After) {
            
//#line 275
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 276
a_arg.
                               exchange();
            }
            	} catch (Throwable tmp62) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp62);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
        
//#line 277
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 278
/* template:ateach { */
            {
            	x10.lang.dist __var12____distCopy = a_res.
                                                   getPlaces(); // make copy to avoid recomputation
            	for (java.util.Iterator __var12____ = __var12____distCopy.iterator();
            		 __var12____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var12__ = (x10.
              lang.
              point) __var12____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var12__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var12____distCopy.get(__var12__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var12__).get(0))/* } */;/* } */
{
                
//#line 279
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 280
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 281
x10.
                  lang.
                  region R =
                  a_res.
                    getInnerRegion(
                    i);
                
//#line 282
/* template:forloop { */
                for (java.util.Iterator pp__ = (R).iterator(); pp__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pp = (x10.
                  lang.
                  point) pp__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 283
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
                    
//#line 284
double d0 =
                      /* template:array_get { */((arg).get(p))/* } */;
                    
//#line 285
double d1 =
                      Util.
                        sumDIFF1(
                        p,
                        arg);
                    
//#line 286
double d2 =
                      Util.
                        sumDIFF2(
                        p,
                        arg);
                    
//#line 287
double d3 =
                      Util.
                        sumDIFF3(
                        p,
                        arg);
                    
//#line 288
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
        	} catch (Throwable tmp63) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp63);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 292
private void
                   ApplyOpP_Overlapped1(
                   final LevelData a_res,
                   final LevelData a_arg) {
        
//#line 293
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 294
a_arg.
                           exchange();
            
//#line 295
/* template:ateach { */
            {
            	x10.lang.dist __var13____distCopy = a_res.
                                                   getPlaces(); // make copy to avoid recomputation
            	for (java.util.Iterator __var13____ = __var13____distCopy.iterator();
            		 __var13____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var13__ = (x10.
              lang.
              point) __var13____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var13__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var13____distCopy.get(__var13__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var13__).get(0))/* } */;/* } */
{
                
//#line 296
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 297
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 298
x10.
                  lang.
                  region R =
                  a_res.
                    getINNERRegion(
                    i);
                
//#line 299
/* template:forloop { */
                for (java.util.Iterator pp__ = (R).iterator(); pp__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pp = (x10.
                  lang.
                  point) pp__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 300
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
                    
//#line 301
double d0 =
                      /* template:array_get { */((arg).get(p))/* } */;
                    
//#line 302
double d1 =
                      Util.
                        sumDIFF1(
                        p,
                        arg);
                    
//#line 303
double d2 =
                      Util.
                        sumDIFF2(
                        p,
                        arg);
                    
//#line 304
double d3 =
                      Util.
                        sumDIFF3(
                        p,
                        arg);
                    
//#line 305
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
        	} catch (Throwable tmp64) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp64);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 309
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 310
/* template:ateach { */
            {
            	x10.lang.dist __var14____distCopy = a_res.
                                                   getPlaces(); // make copy to avoid recomputation
            	for (java.util.Iterator __var14____ = __var14____distCopy.iterator();
            		 __var14____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var14__ = (x10.
              lang.
              point) __var14____.next();
            		/* Join: { */final int i =
              /* template:array_get { */((__var14__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var14____distCopy.get(__var14__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var14__).get(0))/* } */;/* } */
{
                
//#line 311
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 312
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 313
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
                
//#line 314
/* template:forloop { */
                for (java.util.Iterator pp__ = (R).iterator(); pp__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pp = (x10.
                  lang.
                  point) pp__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 315
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
                    
//#line 316
double d0 =
                      /* template:array_get { */((arg).get(p))/* } */;
                    
//#line 317
double d1 =
                      Util.
                        sumDIFF1(
                        p,
                        arg);
                    
//#line 318
double d2 =
                      Util.
                        sumDIFF2(
                        p,
                        arg);
                    
//#line 319
double d3 =
                      Util.
                        sumDIFF3(
                        p,
                        arg);
                    
//#line 320
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
        	} catch (Throwable tmp65) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp65);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 324
private void
                   ApplyOpP_Overlapped(
                   final LevelData a_res,
                   final LevelData a_arg) {
        
//#line 325
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 326
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:here { */x10.lang.Runtime.here()/* } */)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 327
/* template:ateach { */
                {
                	x10.lang.dist __var15____distCopy = a_res.
                                                       getPlaces(); // make copy to avoid recomputation
                	for (java.util.Iterator __var15____ = __var15____distCopy.iterator();
                		 __var15____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var15__ = (x10.
                  lang.
                  point) __var15____.next();
                		/* Join: { */final int i =
                  /* template:array_get { */((__var15__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var15____distCopy.get(__var15__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var15__).get(0))/* } */;/* } */
{
                    
//#line 328
final x10.
                      lang.
                      DoubleReferenceArray arg =
                      a_arg.
                        getArray(
                        i);
                    
//#line 329
final x10.
                      lang.
                      DoubleReferenceArray res =
                      a_res.
                        getArray(
                        i);
                    
//#line 330
x10.
                      lang.
                      region R =
                      a_res.
                        getINNERRegion(
                        i);
                    
//#line 331
/* template:forloop { */
                    for (java.util.Iterator pp__ = (R).iterator(); pp__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point pp = (x10.
                      lang.
                      point) pp__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 332
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
                        
//#line 333
double d0 =
                          /* template:array_get { */((arg).get(p))/* } */;
                        
//#line 334
double d1 =
                          Util.
                            sumDIFF1(
                            p,
                            arg);
                        
//#line 335
double d2 =
                          Util.
                            sumDIFF2(
                            p,
                            arg);
                        
//#line 336
double d3 =
                          Util.
                            sumDIFF3(
                            p,
                            arg);
                        
//#line 337
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
                
                
//#line 340
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 341
a_arg.
                                   exchange();
                }
                	} catch (Throwable tmp67) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp67);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 342
/* template:ateach { */
                {
                	x10.lang.dist __var16____distCopy = a_res.
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
                    
//#line 343
final x10.
                      lang.
                      DoubleReferenceArray arg =
                      a_arg.
                        getArray(
                        i);
                    
//#line 344
final x10.
                      lang.
                      DoubleReferenceArray res =
                      a_res.
                        getArray(
                        i);
                    
//#line 345
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
                    
//#line 346
/* template:forloop { */
                    for (java.util.Iterator pp__ = (R).iterator(); pp__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point pp = (x10.
                      lang.
                      point) pp__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 347
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
                        
//#line 348
double d0 =
                          /* template:array_get { */((arg).get(p))/* } */;
                        
//#line 349
double d1 =
                          Util.
                            sumDIFF1(
                            p,
                            arg);
                        
//#line 350
double d2 =
                          Util.
                            sumDIFF2(
                            p,
                            arg);
                        
//#line 351
double d3 =
                          Util.
                            sumDIFF3(
                            p,
                            arg);
                        
//#line 352
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
        	} catch (Throwable tmp66) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp66);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 357
private void
                   applyOpQ3(
                   final LevelData a_res,
                   final LevelData a_arg,
                   final int a_level) {
        
//#line 358
if (a_level ==
                           P2SLEVEL -
                           1) {
            
//#line 359
final x10.
              lang.
              DoubleReferenceArray arg =
              a_arg.
                getArray(
                0);
            
//#line 360
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 361
/* template:ateach { */
                {
                	x10.lang.dist __var17____distCopy = m_tempLD.
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
                    
//#line 362
x10.
                      lang.
                      DoubleReferenceArray temp =
                      m_tempLD.
                        getArray(
                        i);
                    
//#line 363
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
            	} catch (Throwable tmp68) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp68);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 365
applyOpQ2(
                           a_res,
                           m_tempLD);
        } else {
            
//#line 368
applyOpQ2(
                           a_res,
                           a_arg);
        }
    }
    
    
//#line 371
private void
                   applyOpQ2(
                   final LevelData a_res,
                   final LevelData a_arg) {
        
//#line 372
if (OVERLAPPED) {
            
//#line 373
ApplyOpQ_Overlapped(
                           a_res,
                           a_arg);
        } else {
            
//#line 375
ApplyOpQ(
                           a_res,
                           a_arg);
        }
    }
    
    
//#line 377
private void
                   ApplyOpQ(
                   final LevelData a_res,
                   final LevelData a_arg) {
        
//#line 378
if (!EXCHANGE_After) {
            
//#line 379
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 380
a_arg.
                               exchange();
            }
            	} catch (Throwable tmp69) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp69);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
        
//#line 381
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 382
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
                
//#line 383
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 384
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 385
x10.
                  lang.
                  region R =
                  a_arg.
                    getShrinkedRegion(
                    i);
                
//#line 386
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 387
double d =
                      0;
                    
//#line 388
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
                    
//#line 389
/* template:forloop-mult { */{
                    x10.lang.region __var71__ = (x10.lang.region) Util.
                                                                    UNIT_CUBE;
                    if (__var71__.size() > 0 && (__var71__ instanceof x10.array.MultiDimRegion || __var71__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var72__ = __var71__.rank(0).low(), __var73__ = __var71__.rank(0).high(); __var72__ <= __var73__; __var72__++)
                    /* } */
                    /* template:forloop-mult-each { */
                    for (int __var74__ = __var71__.rank(1).low(), __var75__ = __var71__.rank(1).high(); __var74__ <= __var75__; __var74__++)
                    /* } */
                    /* template:forloop-mult-each { */
                    for (int __var76__ = __var71__.rank(2).low(), __var77__ = __var71__.rank(2).high(); __var76__ <= __var77__; __var76__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int i2 = __var72__;
                    /* } */
                    /* template:final-var-assign { */
                    final int j2 = __var74__;
                    /* } */
                    /* template:final-var-assign { */
                    final int k2 = __var76__;
                    /* } */
                    /* } */
/* Join: { *//* template:point-create { */
                    final  x10.
                      lang.
                      point o = point.factory.point(/* Join: { */__var72__,__var74__,__var76__/* } */);/* } */
{
                        
//#line 390
d =
                          0;
                        
//#line 391
/* template:forloop-mult { */{
                        x10.lang.region __var78__ = (x10.lang.region) /* template:parametric { */((x10.
                          lang.
                          region)(/* template:array_get { */((Util.
                                                                QREGIONS).get(o))/* } */))/* } */;
                        if (__var78__.size() > 0 && (__var78__ instanceof x10.array.MultiDimRegion || __var78__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var79__ = __var78__.rank(0).low(), __var80__ = __var78__.rank(0).high(); __var79__ <= __var80__; __var79__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var81__ = __var78__.rank(1).low(), __var82__ = __var78__.rank(1).high(); __var81__ <= __var82__; __var81__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var83__ = __var78__.rank(2).low(), __var84__ = __var78__.rank(2).high(); __var83__ <= __var84__; __var83__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i1 = __var79__;
                        /* } */
                        /* template:final-var-assign { */
                        final int j1 = __var81__;
                        /* } */
                        /* template:final-var-assign { */
                        final int k1 = __var83__;
                        /* } */
                        /* } */
{
                            
//#line 392
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
                            
//#line 393
d =
                              d +
                                /* template:array_get { */((arg).get(temp))/* } */;
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var19____ = (__var78__).iterator(); __var19____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var19__ = (x10.
                          lang.
                          point) __var19____.next();
                        	/* Join: { *//* Join: { */final int i1 =
                          /* template:array_get { */((__var19__).get(0))/* } */;
final int j1 =
                          /* template:array_get { */((__var19__).get(1))/* } */;
final int k1 =
                          /* template:array_get { */((__var19__).get(2))/* } */;/* } */
{
                            
//#line 392
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
                            
//#line 393
d =
                              d +
                                /* template:array_get { */((arg).get(temp))/* } */;
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
                        
//#line 395
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
                    for (java.util.Iterator o__ = (__var71__).iterator(); o__.hasNext(); ) {
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
                        
//#line 390
d =
                          0;
                        
//#line 391
/* template:forloop-mult { */{
                        x10.lang.region __var85__ = (x10.lang.region) /* template:parametric { */((x10.
                          lang.
                          region)(/* template:array_get { */((Util.
                                                                QREGIONS).get(o))/* } */))/* } */;
                        if (__var85__.size() > 0 && (__var85__ instanceof x10.array.MultiDimRegion || __var85__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var86__ = __var85__.rank(0).low(), __var87__ = __var85__.rank(0).high(); __var86__ <= __var87__; __var86__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var88__ = __var85__.rank(1).low(), __var89__ = __var85__.rank(1).high(); __var88__ <= __var89__; __var88__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var90__ = __var85__.rank(2).low(), __var91__ = __var85__.rank(2).high(); __var90__ <= __var91__; __var90__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i1 = __var86__;
                        /* } */
                        /* template:final-var-assign { */
                        final int j1 = __var88__;
                        /* } */
                        /* template:final-var-assign { */
                        final int k1 = __var90__;
                        /* } */
                        /* } */
{
                            
//#line 392
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
                            
//#line 393
d =
                              d +
                                /* template:array_get { */((arg).get(temp))/* } */;
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var19____ = (__var85__).iterator(); __var19____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var19__ = (x10.
                          lang.
                          point) __var19____.next();
                        	/* Join: { *//* Join: { */final int i1 =
                          /* template:array_get { */((__var19__).get(0))/* } */;
final int j1 =
                          /* template:array_get { */((__var19__).get(1))/* } */;
final int k1 =
                          /* template:array_get { */((__var19__).get(2))/* } */;/* } */
{
                            
//#line 392
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
                            
//#line 393
d =
                              d +
                                /* template:array_get { */((arg).get(temp))/* } */;
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
                        
//#line 395
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
        	} catch (Throwable tmp70) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp70);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 400
private void
                   ApplyOpQ_Overlapped1(
                   final LevelData a_res,
                   final LevelData a_arg) {
        
//#line 401
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 402
a_arg.
                           exchange();
            
//#line 403
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
                
//#line 404
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 405
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
                  a_arg.
                    getINNERRegion(
                    i);
                
//#line 407
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 408
double d =
                      0;
                    
//#line 409
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
                    
//#line 410
/* template:forloop-mult { */{
                    x10.lang.region __var93__ = (x10.lang.region) Util.
                                                                    UNIT_CUBE;
                    if (__var93__.size() > 0 && (__var93__ instanceof x10.array.MultiDimRegion || __var93__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var94__ = __var93__.rank(0).low(), __var95__ = __var93__.rank(0).high(); __var94__ <= __var95__; __var94__++)
                    /* } */
                    /* template:forloop-mult-each { */
                    for (int __var96__ = __var93__.rank(1).low(), __var97__ = __var93__.rank(1).high(); __var96__ <= __var97__; __var96__++)
                    /* } */
                    /* template:forloop-mult-each { */
                    for (int __var98__ = __var93__.rank(2).low(), __var99__ = __var93__.rank(2).high(); __var98__ <= __var99__; __var98__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int i2 = __var94__;
                    /* } */
                    /* template:final-var-assign { */
                    final int j2 = __var96__;
                    /* } */
                    /* template:final-var-assign { */
                    final int k2 = __var98__;
                    /* } */
                    /* } */
/* Join: { *//* template:point-create { */
                    final  x10.
                      lang.
                      point o = point.factory.point(/* Join: { */__var94__,__var96__,__var98__/* } */);/* } */
{
                        
//#line 411
d =
                          0;
                        
//#line 412
/* template:forloop-mult { */{
                        x10.lang.region __var100__ = (x10.lang.region) /* template:parametric { */((x10.
                          lang.
                          region)(/* template:array_get { */((Util.
                                                                QREGIONS).get(o))/* } */))/* } */;
                        if (__var100__.size() > 0 && (__var100__ instanceof x10.array.MultiDimRegion || __var100__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var101__ = __var100__.rank(0).low(), __var102__ = __var100__.rank(0).high(); __var101__ <= __var102__; __var101__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var103__ = __var100__.rank(1).low(), __var104__ = __var100__.rank(1).high(); __var103__ <= __var104__; __var103__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var105__ = __var100__.rank(2).low(), __var106__ = __var100__.rank(2).high(); __var105__ <= __var106__; __var105__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i1 = __var101__;
                        /* } */
                        /* template:final-var-assign { */
                        final int j1 = __var103__;
                        /* } */
                        /* template:final-var-assign { */
                        final int k1 = __var105__;
                        /* } */
                        /* } */
{
                            
//#line 413
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
                            
//#line 414
d =
                              d +
                                /* template:array_get { */((arg).get(temp))/* } */;
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var21____ = (__var100__).iterator(); __var21____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var21__ = (x10.
                          lang.
                          point) __var21____.next();
                        	/* Join: { *//* Join: { */final int i1 =
                          /* template:array_get { */((__var21__).get(0))/* } */;
final int j1 =
                          /* template:array_get { */((__var21__).get(1))/* } */;
final int k1 =
                          /* template:array_get { */((__var21__).get(2))/* } */;/* } */
{
                            
//#line 413
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
                            
//#line 414
d =
                              d +
                                /* template:array_get { */((arg).get(temp))/* } */;
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
                        
//#line 416
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
                    for (java.util.Iterator o__ = (__var93__).iterator(); o__.hasNext(); ) {
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
                        
//#line 411
d =
                          0;
                        
//#line 412
/* template:forloop-mult { */{
                        x10.lang.region __var107__ = (x10.lang.region) /* template:parametric { */((x10.
                          lang.
                          region)(/* template:array_get { */((Util.
                                                                QREGIONS).get(o))/* } */))/* } */;
                        if (__var107__.size() > 0 && (__var107__ instanceof x10.array.MultiDimRegion || __var107__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var108__ = __var107__.rank(0).low(), __var109__ = __var107__.rank(0).high(); __var108__ <= __var109__; __var108__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var110__ = __var107__.rank(1).low(), __var111__ = __var107__.rank(1).high(); __var110__ <= __var111__; __var110__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var112__ = __var107__.rank(2).low(), __var113__ = __var107__.rank(2).high(); __var112__ <= __var113__; __var112__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i1 = __var108__;
                        /* } */
                        /* template:final-var-assign { */
                        final int j1 = __var110__;
                        /* } */
                        /* template:final-var-assign { */
                        final int k1 = __var112__;
                        /* } */
                        /* } */
{
                            
//#line 413
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
                            
//#line 414
d =
                              d +
                                /* template:array_get { */((arg).get(temp))/* } */;
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var21____ = (__var107__).iterator(); __var21____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var21__ = (x10.
                          lang.
                          point) __var21____.next();
                        	/* Join: { *//* Join: { */final int i1 =
                          /* template:array_get { */((__var21__).get(0))/* } */;
final int j1 =
                          /* template:array_get { */((__var21__).get(1))/* } */;
final int k1 =
                          /* template:array_get { */((__var21__).get(2))/* } */;/* } */
{
                            
//#line 413
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
                            
//#line 414
d =
                              d +
                                /* template:array_get { */((arg).get(temp))/* } */;
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
                        
//#line 416
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
        	} catch (Throwable tmp92) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp92);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 421
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 422
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
                
//#line 423
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 424
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 425
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
                
//#line 426
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 427
double d =
                      0;
                    
//#line 428
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
                    
//#line 429
/* template:forloop-mult { */{
                    x10.lang.region __var115__ = (x10.lang.region) Util.
                                                                     UNIT_CUBE;
                    if (__var115__.size() > 0 && (__var115__ instanceof x10.array.MultiDimRegion || __var115__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var116__ = __var115__.rank(0).low(), __var117__ = __var115__.rank(0).high(); __var116__ <= __var117__; __var116__++)
                    /* } */
                    /* template:forloop-mult-each { */
                    for (int __var118__ = __var115__.rank(1).low(), __var119__ = __var115__.rank(1).high(); __var118__ <= __var119__; __var118__++)
                    /* } */
                    /* template:forloop-mult-each { */
                    for (int __var120__ = __var115__.rank(2).low(), __var121__ = __var115__.rank(2).high(); __var120__ <= __var121__; __var120__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int i2 = __var116__;
                    /* } */
                    /* template:final-var-assign { */
                    final int j2 = __var118__;
                    /* } */
                    /* template:final-var-assign { */
                    final int k2 = __var120__;
                    /* } */
                    /* } */
/* Join: { *//* template:point-create { */
                    final  x10.
                      lang.
                      point o = point.factory.point(/* Join: { */__var116__,__var118__,__var120__/* } */);/* } */
{
                        
//#line 430
d =
                          0;
                        
//#line 431
/* template:forloop-mult { */{
                        x10.lang.region __var122__ = (x10.lang.region) /* template:parametric { */((x10.
                          lang.
                          region)(/* template:array_get { */((Util.
                                                                QREGIONS).get(o))/* } */))/* } */;
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
                        final int i1 = __var123__;
                        /* } */
                        /* template:final-var-assign { */
                        final int j1 = __var125__;
                        /* } */
                        /* template:final-var-assign { */
                        final int k1 = __var127__;
                        /* } */
                        /* } */
{
                            
//#line 432
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
                            
//#line 433
d =
                              d +
                                /* template:array_get { */((arg).get(temp))/* } */;
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var23____ = (__var122__).iterator(); __var23____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var23__ = (x10.
                          lang.
                          point) __var23____.next();
                        	/* Join: { *//* Join: { */final int i1 =
                          /* template:array_get { */((__var23__).get(0))/* } */;
final int j1 =
                          /* template:array_get { */((__var23__).get(1))/* } */;
final int k1 =
                          /* template:array_get { */((__var23__).get(2))/* } */;/* } */
{
                            
//#line 432
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
                            
//#line 433
d =
                              d +
                                /* template:array_get { */((arg).get(temp))/* } */;
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
                        
//#line 435
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
                    for (java.util.Iterator o__ = (__var115__).iterator(); o__.hasNext(); ) {
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
                        
//#line 430
d =
                          0;
                        
//#line 431
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
                            
//#line 432
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
                            
//#line 433
d =
                              d +
                                /* template:array_get { */((arg).get(temp))/* } */;
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var23____ = (__var129__).iterator(); __var23____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var23__ = (x10.
                          lang.
                          point) __var23____.next();
                        	/* Join: { *//* Join: { */final int i1 =
                          /* template:array_get { */((__var23__).get(0))/* } */;
final int j1 =
                          /* template:array_get { */((__var23__).get(1))/* } */;
final int k1 =
                          /* template:array_get { */((__var23__).get(2))/* } */;/* } */
{
                            
//#line 432
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
                            
//#line 433
d =
                              d +
                                /* template:array_get { */((arg).get(temp))/* } */;
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
                        
//#line 435
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
        	} catch (Throwable tmp114) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp114);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 440
private void
                   ApplyOpQ_Overlapped(
                   final LevelData a_res,
                   final LevelData a_arg) {
        
//#line 441
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 442
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:here { */x10.lang.Runtime.here()/* } */)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 443
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
                    
//#line 444
final x10.
                      lang.
                      DoubleReferenceArray arg =
                      a_arg.
                        getArray(
                        i);
                    
//#line 445
final x10.
                      lang.
                      DoubleReferenceArray res =
                      a_res.
                        getArray(
                        i);
                    
//#line 446
x10.
                      lang.
                      region R =
                      a_arg.
                        getINNERRegion(
                        i);
                    
//#line 447
/* template:forloop { */
                    for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point p = (x10.
                      lang.
                      point) p__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 448
double d =
                          0;
                        
//#line 449
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
                        
//#line 450
/* template:forloop-mult { */{
                        x10.lang.region __var137__ = (x10.lang.region) Util.
                                                                         UNIT_CUBE;
                        if (__var137__.size() > 0 && (__var137__ instanceof x10.array.MultiDimRegion || __var137__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var138__ = __var137__.rank(0).low(), __var139__ = __var137__.rank(0).high(); __var138__ <= __var139__; __var138__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var140__ = __var137__.rank(1).low(), __var141__ = __var137__.rank(1).high(); __var140__ <= __var141__; __var140__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var142__ = __var137__.rank(2).low(), __var143__ = __var137__.rank(2).high(); __var142__ <= __var143__; __var142__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i2 = __var138__;
                        /* } */
                        /* template:final-var-assign { */
                        final int j2 = __var140__;
                        /* } */
                        /* template:final-var-assign { */
                        final int k2 = __var142__;
                        /* } */
                        /* } */
/* Join: { *//* template:point-create { */
                        final  x10.
                          lang.
                          point o = point.factory.point(/* Join: { */__var138__,__var140__,__var142__/* } */);/* } */
{
                            
//#line 451
d =
                              0;
                            
//#line 452
/* template:forloop-mult { */{
                            x10.lang.region __var144__ = (x10.lang.region) /* template:parametric { */((x10.
                              lang.
                              region)(/* template:array_get { */((Util.
                                                                    QREGIONS).get(o))/* } */))/* } */;
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
                            final int i1 = __var145__;
                            /* } */
                            /* template:final-var-assign { */
                            final int j1 = __var147__;
                            /* } */
                            /* template:final-var-assign { */
                            final int k1 = __var149__;
                            /* } */
                            /* } */
{
                                
//#line 453
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
                                
//#line 454
d =
                                  d +
                                    /* template:array_get { */((arg).get(temp))/* } */;
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var25____ = (__var144__).iterator(); __var25____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var25__ = (x10.
                              lang.
                              point) __var25____.next();
                            	/* Join: { *//* Join: { */final int i1 =
                              /* template:array_get { */((__var25__).get(0))/* } */;
final int j1 =
                              /* template:array_get { */((__var25__).get(1))/* } */;
final int k1 =
                              /* template:array_get { */((__var25__).get(2))/* } */;/* } */
{
                                
//#line 453
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
                                
//#line 454
d =
                                  d +
                                    /* template:array_get { */((arg).get(temp))/* } */;
                            }/* } */
                            }
                            /* } */
                            
                            }
                            }
                            /* } */
                            
                            
//#line 456
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
                        for (java.util.Iterator o__ = (__var137__).iterator(); o__.hasNext(); ) {
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
                            
//#line 451
d =
                              0;
                            
//#line 452
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
                                
//#line 453
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
                                
//#line 454
d =
                                  d +
                                    /* template:array_get { */((arg).get(temp))/* } */;
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var25____ = (__var151__).iterator(); __var25____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var25__ = (x10.
                              lang.
                              point) __var25____.next();
                            	/* Join: { *//* Join: { */final int i1 =
                              /* template:array_get { */((__var25__).get(0))/* } */;
final int j1 =
                              /* template:array_get { */((__var25__).get(1))/* } */;
final int k1 =
                              /* template:array_get { */((__var25__).get(2))/* } */;/* } */
{
                                
//#line 453
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
                                
//#line 454
d =
                                  d +
                                    /* template:array_get { */((arg).get(temp))/* } */;
                            }/* } */
                            }
                            /* } */
                            
                            }
                            }
                            /* } */
                            
                            
//#line 456
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
                
                
//#line 460
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 461
a_arg.
                                   exchange();
                }
                	} catch (Throwable tmp158) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp158);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 462
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
                    
//#line 463
final x10.
                      lang.
                      DoubleReferenceArray arg =
                      a_arg.
                        getArray(
                        i);
                    
//#line 464
final x10.
                      lang.
                      DoubleReferenceArray res =
                      a_res.
                        getArray(
                        i);
                    
//#line 465
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
                    
//#line 466
/* template:forloop { */
                    for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point p = (x10.
                      lang.
                      point) p__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 467
double d =
                          0;
                        
//#line 468
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
                        
//#line 469
/* template:forloop-mult { */{
                        x10.lang.region __var159__ = (x10.lang.region) Util.
                                                                         UNIT_CUBE;
                        if (__var159__.size() > 0 && (__var159__ instanceof x10.array.MultiDimRegion || __var159__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var160__ = __var159__.rank(0).low(), __var161__ = __var159__.rank(0).high(); __var160__ <= __var161__; __var160__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var162__ = __var159__.rank(1).low(), __var163__ = __var159__.rank(1).high(); __var162__ <= __var163__; __var162__++)
                        /* } */
                        /* template:forloop-mult-each { */
                        for (int __var164__ = __var159__.rank(2).low(), __var165__ = __var159__.rank(2).high(); __var164__ <= __var165__; __var164__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i2 = __var160__;
                        /* } */
                        /* template:final-var-assign { */
                        final int j2 = __var162__;
                        /* } */
                        /* template:final-var-assign { */
                        final int k2 = __var164__;
                        /* } */
                        /* } */
/* Join: { *//* template:point-create { */
                        final  x10.
                          lang.
                          point o = point.factory.point(/* Join: { */__var160__,__var162__,__var164__/* } */);/* } */
{
                            
//#line 470
d =
                              0;
                            
//#line 471
/* template:forloop-mult { */{
                            x10.lang.region __var166__ = (x10.lang.region) /* template:parametric { */((x10.
                              lang.
                              region)(/* template:array_get { */((Util.
                                                                    QREGIONS).get(o))/* } */))/* } */;
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
                            final int i1 = __var167__;
                            /* } */
                            /* template:final-var-assign { */
                            final int j1 = __var169__;
                            /* } */
                            /* template:final-var-assign { */
                            final int k1 = __var171__;
                            /* } */
                            /* } */
{
                                
//#line 472
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
                                
//#line 473
d =
                                  d +
                                    /* template:array_get { */((arg).get(temp))/* } */;
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var27____ = (__var166__).iterator(); __var27____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var27__ = (x10.
                              lang.
                              point) __var27____.next();
                            	/* Join: { *//* Join: { */final int i1 =
                              /* template:array_get { */((__var27__).get(0))/* } */;
final int j1 =
                              /* template:array_get { */((__var27__).get(1))/* } */;
final int k1 =
                              /* template:array_get { */((__var27__).get(2))/* } */;/* } */
{
                                
//#line 472
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
                                
//#line 473
d =
                                  d +
                                    /* template:array_get { */((arg).get(temp))/* } */;
                            }/* } */
                            }
                            /* } */
                            
                            }
                            }
                            /* } */
                            
                            
//#line 475
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
                        for (java.util.Iterator o__ = (__var159__).iterator(); o__.hasNext(); ) {
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
                            
//#line 470
d =
                              0;
                            
//#line 471
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
                                
//#line 472
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
                                
//#line 473
d =
                                  d +
                                    /* template:array_get { */((arg).get(temp))/* } */;
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var27____ = (__var173__).iterator(); __var27____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var27__ = (x10.
                              lang.
                              point) __var27____.next();
                            	/* Join: { *//* Join: { */final int i1 =
                              /* template:array_get { */((__var27__).get(0))/* } */;
final int j1 =
                              /* template:array_get { */((__var27__).get(1))/* } */;
final int k1 =
                              /* template:array_get { */((__var27__).get(2))/* } */;/* } */
{
                                
//#line 472
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
                                
//#line 473
d =
                                  d +
                                    /* template:array_get { */((arg).get(temp))/* } */;
                            }/* } */
                            }
                            /* } */
                            
                            }
                            }
                            /* } */
                            
                            
//#line 475
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
        	} catch (Throwable tmp136) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp136);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 481
public double
                   MGSolve(
                   final LevelData a_u,
                   final LevelData a_v,
                   final int a_its) {
        
//#line 482
int l =
          m_levels -
          1;
        
//#line 483
/* template:parametric { */((LevelData)(/* template:array_get { */((m_r).get(l))/* } */))/* } */.
                       setLevelData(
                       a_v);
        
//#line 484
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("The init residual norm is " +
                                                                                                                          /* template:parametric { */((LevelData)(/* template:array_get { */((m_r).get(l))/* } */))/* } */.
                                                                                                                            norm2());
        
//#line 485
double res =
          0.0;
        
//#line 486
int i =
          0;
        
//#line 487
while (i <
                              a_its) {
            
//#line 488
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("Iteration " +
                                                                                                                              i);
            
//#line 489
MG();
            
//#line 490
a_u.
                           add(
                           /* template:parametric { */((LevelData)(/* template:array_get { */((m_z).get(l))/* } */))/* } */);
            
//#line 491
computeResidual3(
                           /* template:parametric { */((LevelData)(/* template:array_get { */((m_r).get(l))/* } */))/* } */,
                           a_v,
                           a_u);
            
//#line 492
res =
              /* template:parametric { */((LevelData)(/* template:array_get { */((m_r).get(l))/* } */))/* } */.
                norm2();
            
//#line 493
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("The residual norm is " +
                                                                                                                              res);
            
//#line 494
i++;
        }
        
//#line 496
return res;
    }
    
    
//#line 498
private void
                   MG(
                   ) {
        
//#line 499
int i2 =
          m_levels -
          1;
        
//#line 500
while (i2 >
                              0) {
            
//#line 501
applyOpP3(
                           /* template:parametric { */((LevelData)(/* template:array_get { */((m_r).get(i2 -
                             1))/* } */))/* } */,
                           /* template:parametric { */((LevelData)(/* template:array_get { */((m_r).get(i2))/* } */))/* } */,
                           i2);
            
//#line 502
i2--;
        }
        
//#line 504
/* template:parametric { */((LevelData)(/* template:array_get { */((m_z).get(0))/* } */))/* } */.
                       set(
                       0);
        
//#line 505
smooth(
                       /* template:parametric { */((LevelData)(/* template:array_get { */((m_z).get(0))/* } */))/* } */,
                       /* template:parametric { */((LevelData)(/* template:array_get { */((m_r).get(0))/* } */))/* } */,
                       true);
        
//#line 506
int i3 =
          1;
        
//#line 507
while (i3 <
                              m_levels) {
            
//#line 508
applyOpQ3(
                           /* template:parametric { */((LevelData)(/* template:array_get { */((m_z).get(i3))/* } */))/* } */,
                           /* template:parametric { */((LevelData)(/* template:array_get { */((m_z).get(i3 -
                             1))/* } */))/* } */,
                           i3 -
                             1);
            
//#line 509
computeResidual2(
                           /* template:parametric { */((LevelData)(/* template:array_get { */((m_r).get(i3))/* } */))/* } */,
                           /* template:parametric { */((LevelData)(/* template:array_get { */((m_z).get(i3))/* } */))/* } */);
            
//#line 510
smooth(
                           /* template:parametric { */((LevelData)(/* template:array_get { */((m_z).get(i3))/* } */))/* } */,
                           /* template:parametric { */((LevelData)(/* template:array_get { */((m_r).get(i3))/* } */))/* } */,
                           false);
            
//#line 511
i3++;
        }
    }
    
    
//#line 514
private double
                   residualNorm(
                   ) {
        
//#line 515
int l =
          m_levels -
          1;
        
//#line 516
return /* template:parametric { */((LevelData)(/* template:array_get { */((m_r).get(l))/* } */))/* } */.
                              norm2();
    }
}

public class MGMain
extends x10.
  lang.
  Object
{
    
    
//#line 521
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
        
//#line 522
/* template:place-check { */((MGDriver) x10.lang.Runtime.hereCheck(new MGDriver(
          )))/* } */.driver();
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 520
public MGMain() {
        
//#line 520
super();
    }
}

class Util
extends x10.
  lang.
  Object
{
    
//#line 528
final public static boolean
      PERF_OUTPUT =
      true;
    
//#line 529
final public static double
      CLOCK_SPEED =
      375;
    
//#line 530
final public static double
      FP_PERCLOCK =
      4;
    
//#line 531
final public static double
      COMM_LATENCY =
      1;
    
//#line 532
final public static double
      COMM_BANDWIDTH =
      2000;
    
//#line 533
final public static boolean
      IN_LOOP =
      false;
    
//#line 534
final public static boolean
      COMP_ONLY =
      false;
    
//#line 535
final public static boolean
      COMM_ONLY =
      false;
    
//#line 536
final public static int
      THREADS_PERFOREACH =
      1;
    
//#line 537
final public static boolean
      OVERLAP_COMMANDCOMP =
      false;
    
//#line 538
final public static boolean
      EXCHANGE_AFTER =
      false;
    
//#line 539
final public static int
      P2SLEVEL =
      1;
    
//#line 540
final public static int
      N_PLACES =
      x10.
        lang.
        place.
        MAX_PLACES;
    
    
//#line 541
public static double
                   sumDIFF1(
                   final x10.
                     lang.
                     point p,
                   final x10.
                     lang.
                     DoubleReferenceArray arg) {
        
//#line 542
double d1 =
          0;
        
//#line 543
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           1,
                                                                                                                                           0,
                                                                                                                                           0))))/* } */;
        
//#line 544
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           -1,
                                                                                                                                           0,
                                                                                                                                           0))))/* } */;
        
//#line 545
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           0,
                                                                                                                                           1,
                                                                                                                                           0))))/* } */;
        
//#line 546
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           0,
                                                                                                                                           -1,
                                                                                                                                           0))))/* } */;
        
//#line 547
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           0,
                                                                                                                                           0,
                                                                                                                                           1))))/* } */;
        
//#line 548
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           0,
                                                                                                                                           0,
                                                                                                                                           -1))))/* } */;
        
//#line 549
return d1;
    }
    
    
//#line 551
public static double
                   sumDIFF2(
                   final x10.
                     lang.
                     point p,
                   final x10.
                     lang.
                     DoubleReferenceArray arg) {
        
//#line 552
double d1 =
          0;
        
//#line 553
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           1,
                                                                                                                                           1,
                                                                                                                                           0))))/* } */;
        
//#line 554
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           1,
                                                                                                                                           -1,
                                                                                                                                           0))))/* } */;
        
//#line 555
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           -1,
                                                                                                                                           1,
                                                                                                                                           0))))/* } */;
        
//#line 556
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           -1,
                                                                                                                                           -1,
                                                                                                                                           0))))/* } */;
        
//#line 557
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           1,
                                                                                                                                           0,
                                                                                                                                           1))))/* } */;
        
//#line 558
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           1,
                                                                                                                                           0,
                                                                                                                                           -1))))/* } */;
        
//#line 559
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           -1,
                                                                                                                                           0,
                                                                                                                                           1))))/* } */;
        
//#line 560
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           -1,
                                                                                                                                           0,
                                                                                                                                           -1))))/* } */;
        
//#line 561
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           0,
                                                                                                                                           1,
                                                                                                                                           1))))/* } */;
        
//#line 562
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           0,
                                                                                                                                           1,
                                                                                                                                           -1))))/* } */;
        
//#line 563
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           0,
                                                                                                                                           -1,
                                                                                                                                           1))))/* } */;
        
//#line 564
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           0,
                                                                                                                                           -1,
                                                                                                                                           -1))))/* } */;
        
//#line 565
return d1;
    }
    
    
//#line 567
public static double
                   sumDIFF3(
                   final x10.
                     lang.
                     point p,
                   final x10.
                     lang.
                     DoubleReferenceArray arg) {
        
//#line 568
double d1 =
          0;
        
//#line 569
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           1,
                                                                                                                                           1,
                                                                                                                                           1))))/* } */;
        
//#line 570
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           1,
                                                                                                                                           1,
                                                                                                                                           -1))))/* } */;
        
//#line 571
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           1,
                                                                                                                                           -1,
                                                                                                                                           1))))/* } */;
        
//#line 572
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           1,
                                                                                                                                           -1,
                                                                                                                                           -1))))/* } */;
        
//#line 573
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           -1,
                                                                                                                                           1,
                                                                                                                                           1))))/* } */;
        
//#line 574
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           -1,
                                                                                                                                           1,
                                                                                                                                           -1))))/* } */;
        
//#line 575
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           -1,
                                                                                                                                           -1,
                                                                                                                                           1))))/* } */;
        
//#line 576
d1 =
          d1 +
            /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                           lang.
                                                                                                                                           point.
                                                                                                                                           factory.
                                                                                                                                           point(
                                                                                                                                           -1,
                                                                                                                                           -1,
                                                                                                                                           -1))))/* } */;
        
//#line 577
return d1;
    }
    
    
//#line 579
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
    
//#line 580
final public static x10.
      lang.
      GenericReferenceArray
      QREGIONS =
      (x10.
        lang.
        GenericReferenceArray)
        (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(UNIT_CUBE.
                                                                                                                      toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
         	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
           lang.
           point p/* } */, x10.compilergenerated.Parameter1 dummy) { {
             
//#line 580
final int a =
               /* template:array_get { */((p).get(0))/* } */;
             
//#line 580
final int b =
               /* template:array_get { */((p).get(1))/* } */;
             
//#line 580
final int c =
               /* template:array_get { */((p).get(2))/* } */;
             
//#line 581
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
         }/* } */,true,false,true)/* } */);
    
//#line 583
final public static int
      LOW =
      0;
    
//#line 584
final public static int
      HIGH =
      1;
    
    
//#line 585
public static boolean
                   powerOf2(
                   final int a_int) {
        
//#line 586
int i =
          (int)
            java.
              lang.
              Math.
              abs(
              a_int);
        
//#line 587
if (i ==
                           0) {
            
//#line 588
return false;
        } else {
            
//#line 590
if (i !=
                               ((pow2(
                                   log2(
                                     i))))) {
                
//#line 591
return false;
            }
        }
        
//#line 593
return true;
    }
    
    
//#line 595
public static int
                   log2(
                   final int a_int) {
        
//#line 596
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
    
    
//#line 598
public static int
                   pow2(
                   final int a_int) {
        
//#line 599
return (int)
                              java.
                                lang.
                                Math.
                                pow(
                                2,
                                a_int);
    }
    
    
//#line 601
public static x10.
                   lang.
                   region
                   boundary(
                   final x10.
                     lang.
                     region a_R,
                   final int a_direction,
                   final int a_padSize0,
                   final int a_padSize1,
                   final int a_padSize2) {
        
//#line 602
int i =
          (int)
            java.
              lang.
              Math.
              abs(
              a_direction);
        
//#line 603
boolean IsHigh =
          (a_direction >
             0);
        
//#line 604
int low0 =
          a_R.
            rank(
            0).
            low();
        
//#line 605
int low1 =
          a_R.
            rank(
            1).
            low();
        
//#line 606
int low2 =
          a_R.
            rank(
            2).
            low();
        
//#line 607
int high0 =
          a_R.
            rank(
            0).
            high();
        
//#line 608
int high1 =
          a_R.
            rank(
            1).
            high();
        
//#line 609
int high2 =
          a_R.
            rank(
            2).
            high();
        
//#line 610
int r =
          3;
        
//#line 611
if (i <=
                           r &&
                           r ==
                           3) {
            
//#line 612
if (IsHigh) {
                
//#line 613
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
                                            ? high0 +
                                            1
                                            : low0)) -
                                          a_padSize0,
                                        ((i ==
                                            1
                                            ? high0 +
                                            1
                                            : high0)) +
                                          a_padSize0),
                                      x10.
                                        lang.
                                        region.
                                        factory.
                                        region(
                                        ((i ==
                                            2
                                            ? high1 +
                                            1
                                            : low1)) -
                                          a_padSize1,
                                        ((i ==
                                            2
                                            ? high1 +
                                            1
                                            : high1)) +
                                          a_padSize1),
                                      x10.
                                        lang.
                                        region.
                                        factory.
                                        region(
                                        ((i ==
                                            3
                                            ? high2 +
                                            1
                                            : low2)) -
                                          a_padSize2,
                                        ((i ==
                                            3
                                            ? high2 +
                                            1
                                            : high2)) +
                                          a_padSize2));
            } else {
                
//#line 616
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
                                            ? low0 -
                                            1
                                            : low0)) -
                                          a_padSize0,
                                        ((i ==
                                            1
                                            ? low0 -
                                            1
                                            : high0)) +
                                          a_padSize0),
                                      x10.
                                        lang.
                                        region.
                                        factory.
                                        region(
                                        ((i ==
                                            2
                                            ? low1 -
                                            1
                                            : low1)) -
                                          a_padSize1,
                                        ((i ==
                                            2
                                            ? low1 -
                                            1
                                            : high1)) +
                                          a_padSize1),
                                      x10.
                                        lang.
                                        region.
                                        factory.
                                        region(
                                        ((i ==
                                            3
                                            ? low2 -
                                            1
                                            : low2)) -
                                          a_padSize2,
                                        ((i ==
                                            3
                                            ? low2 -
                                            1
                                            : high2)) +
                                          a_padSize2));
            }
        } else {
            
//#line 620
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("MG3TongValue1.boundary():Warning! invalid inputs!");
            
//#line 621
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
    
    
//#line 624
public static void
                   arraycopy3(
                   final x10.
                     lang.
                     DoubleReferenceArray a_dest,
                   final x10.
                     lang.
                     region a_destR,
                   final x10.
                     lang.
                     DoubleReferenceArray a_src) {
        
//#line 625
/* template:forloop { */
        for (java.util.Iterator p__ = (a_destR).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 626
final x10.
              lang.
              place h =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 627
/* template:Async { */(x10.lang.Runtime.asPlace(a_src.
                                                                           distribution.
                                                                           get(
                                                                           p))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 628
final double d =
                  /* template:array_get { */((a_src).get(p))/* } */;
                
//#line 629
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 630
/* template:array_set { */(a_dest).set(d,p)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }/* } */
        }
        /* } */
        
    }
    
    
//#line 635
public static void
                   arraycopy4(
                   final x10.
                     lang.
                     DoubleReferenceArray a_dest,
                   final x10.
                     lang.
                     region a_destR,
                   final x10.
                     lang.
                     DoubleReferenceArray a_src,
                   final int a_trans0,
                   final int a_trans1,
                   final int a_trans2) {
        
//#line 636
/* template:forloop { */
        for (java.util.Iterator p__ = (a_destR).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 637
final x10.
              lang.
              place h =
              /* template:here { */x10.lang.Runtime.here()/* } */;
            
//#line 638
/* template:Async { */(x10.lang.Runtime.asPlace(a_src.
                                                                           distribution.
                                                                           get(
                                                                           /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                                                     lang.
                                                                                                                                                                     point.
                                                                                                                                                                     factory.
                                                                                                                                                                     point(
                                                                                                                                                                     a_trans0,
                                                                                                                                                                     a_trans1,
                                                                                                                                                                     a_trans2))))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 639
final double d =
                  /* template:array_get { */((a_src).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                                                   lang.
                                                                                                                                                   point.
                                                                                                                                                   factory.
                                                                                                                                                   point(
                                                                                                                                                   a_trans0,
                                                                                                                                                   a_trans1,
                                                                                                                                                   a_trans2))))/* } */;
                
//#line 640
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 641
/* template:array_set { */(a_dest).set(d,p)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }/* } */
        }
        /* } */
        
    }
    
    
//#line 646
public Util() {
        
//#line 646
super();
    }
}

class MGDriver
extends x10.
  lang.
  Object
{
    
    
//#line 651
public static void
                   driver(
                   ) {
        
//#line 652
int CLASS =
          1;
        
//#line 653
final boolean isDistributed =
          true;
        
//#line 654
int problemSize =
          0;
        
//#line 655
int numberIterations =
          0;
        
//#line 656
double reference2Norm =
          0;
        
//#line 657
switch (CLASS) {
            
//#line 658
case 1:
                
//#line 659
problemSize =
                  32;
                
//#line 660
numberIterations =
                  4;
                
//#line 661
reference2Norm =
                  5.30770700573E-5;
                
//#line 662
break;
            
//#line 664
case 2:
                
//#line 665
problemSize =
                  64;
                
//#line 666
numberIterations =
                  40;
                
//#line 667
reference2Norm =
                  2.50391406439E-18;
                
//#line 668
break;
            
//#line 670
case 3:
                
//#line 671
problemSize =
                  256;
                
//#line 672
numberIterations =
                  4;
                
//#line 673
reference2Norm =
                  2.433365309E-6;
                
//#line 674
break;
            
//#line 676
case 4:
                
//#line 677
problemSize =
                  256;
                
//#line 678
numberIterations =
                  20;
                
//#line 679
reference2Norm =
                  1.80056440132E-6;
                
//#line 680
break;
            
//#line 682
case 5:
                
//#line 683
problemSize =
                  512;
                
//#line 684
numberIterations =
                  20;
                
//#line 685
reference2Norm =
                  5.70674826298E-7;
                
//#line 686
break;
            
//#line 688
case 6:
                
//#line 689
problemSize =
                  1024;
                
//#line 690
numberIterations =
                  50;
                
//#line 691
reference2Norm =
                  1.58327506043E-10;
                
//#line 692
break;
            
//#line 694
default:
                
//#line 695
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             err))/* } */.println("Class must be one of {S,W,A,B,C,D}!");
        }
        
//#line 698
LevelData u =
          new LevelData(
          problemSize,
          isDistributed);
        
//#line 699
LevelData v =
          new LevelData(
          problemSize,
          isDistributed);
        
//#line 700
v.
                       initialize(
                       CLASS);
        
//#line 701
MGOP MG =
          new MGOP(
          problemSize);
        
//#line 702
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("There are " +
                                                                                                                          Util.
                                                                                                                            N_PLACES +
                                                                                                                          " places. Running problem of class " +
                                                                                                                          CLASS);
        
//#line 703
Timer tmr =
          new Timer(
          );
        
//#line 704
int count =
          0;
        
//#line 705
/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.start(count);
        
//#line 706
double res =
          0;
        
//#line 707
res =
          /* template:place-check { */((MGOP) x10.lang.Runtime.hereCheck(MG))/* } */.MGSolve(u,
                                                                                             v,
                                                                                             numberIterations);
        
//#line 708
/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.stop(count);
        
//#line 709
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("The reference 2norm is " +
                                                                                                                          reference2Norm +
                                                                                                                          ". The difference is " +
                                                                                                                          ((res -
                                                                                                                              reference2Norm)));
        
//#line 710
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Wall-clock time for MGSolve: " +
                                                                                                                          /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.readTimer(count) +
                                                                                                                          "secs");
    }
    
    
//#line 650
public MGDriver() {
        
//#line 650
super();
    }
}

class Wrapper
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
    
//#line 715
public java.
                   lang.
                   String
                   toString(
                   ) {
        
//#line 716
return "";
    }
    
    
//#line 718
final public x10.
      lang.
      DoubleReferenceArray
      m_array;
    
    
//#line 719
public Wrapper(final x10.
                                  lang.
                                  DoubleReferenceArray a_array) {
        
//#line 719
super();
        
//#line 720
m_array =
          a_array;
    }
}

class LevelData
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
    
//#line 725
public java.
                   lang.
                   String
                   toString(
                   ) {
        
//#line 726
return "";
    }
    
    
//#line 728
final public static boolean
      PERF_On =
      Util.
        PERF_OUTPUT;
    
//#line 729
final public static double
      PERF_Comp =
      1.0 /
      Util.
        FP_PERCLOCK;
    
//#line 730
final public static double
      PERF_CommL =
      Util.
        COMM_LATENCY *
      Util.
        CLOCK_SPEED;
    
//#line 731
final public static double
      PERF_CommB =
      (((double)
          Util.
            CLOCK_SPEED /
          (double)
            Util.
              COMM_BANDWIDTH)) *
      8.0;
    
//#line 732
final public static boolean
      PERF_InLoop =
      Util.
        IN_LOOP;
    
//#line 733
final public static boolean
      PERF_CompOnly =
      Util.
        COMP_ONLY;
    
//#line 734
final public static boolean
      PERF_CommOnly =
      Util.
        COMM_ONLY;
    
//#line 735
final public boolean
      EXCHANGE_After;
    
//#line 736
final public static int
      N_PLACES =
      Util.
        N_PLACES;
    
//#line 737
final public static int
      HIGH =
      Util.
        HIGH;
    
//#line 738
final public static int
      LOW =
      Util.
        LOW;
    
//#line 739
final private int
      SIZE;
    
//#line 740
final private x10.
      lang.
      region
      P_DOMAIN;
    
//#line 741
final private boolean
      ISPARALLEL;
    
//#line 742
final private x10.
      lang.
      GenericReferenceArray
      m_regions;
    
//#line 743
final private x10.
      lang.
      GenericReferenceArray
      m_REGIONs;
    
//#line 744
final private x10.
      lang.
      GenericReferenceArray
      m_boundaries;
    
//#line 745
final private x10.
      lang.
      dist
      m_places;
    
//#line 746
final private int
      m_numPlaces;
    
//#line 747
final private x10.
      lang.
      region
      m_placeGrid;
    
//#line 748
final private int
      m_size0;
    
//#line 749
final private int
      m_size1;
    
//#line 750
final private int
      m_size2;
    
//#line 751
final private int
      m_block0;
    
//#line 752
final private int
      m_block1;
    
//#line 753
final private int
      m_block2;
    
//#line 754
final private x10.
      lang.
      GenericReferenceArray
      m_dist;
    
//#line 755
final private x10.
      lang.
      GenericReferenceArray
      m_DIST;
    
//#line 756
final private x10.
      lang.
      GenericReferenceArray
      m_u;
    
    
//#line 757
public x10.
                   lang.
                   dist
                   getPlaces(
                   ) {
        
//#line 758
return m_places;
    }
    
    
//#line 760
public x10.
                   lang.
                   DoubleReferenceArray
                   getArray(
                   final int a_idx) {
        
//#line 761
return (x10.
                              lang.
                              DoubleReferenceArray)
                              ((/* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(a_idx))/* } */))/* } */.
                                  m_array));
    }
    
    
//#line 763
public x10.
                   lang.
                   region
                   getInnerRegion(
                   final int a_idx) {
        
//#line 764
return (x10.
                              lang.
                              region)
                              get_m_regions(
                                a_idx);
    }
    
    
//#line 766
public x10.
                   lang.
                   region
                   getINNERRegion(
                   final int a_idx) {
        
//#line 767
x10.
          lang.
          region R =
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
              region)(/* template:array_get { */((m_regions).get(a_idx))/* } */))/* } */);
        
//#line 768
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
    
    
//#line 770
public x10.
                   lang.
                   region
                   getShrinkedRegion(
                   final int a_idx) {
        
//#line 771
x10.
          lang.
          region R =
          (x10.
            lang.
            region)
            get_m_REGIONs(
              a_idx);
        
//#line 772
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
    
    
//#line 774
public x10.
                   lang.
                   region
                   getRegion(
                   final int a_idx) {
        
//#line 775
return new x10.
                              runtime.
                              RuntimeCastChecker.
                              DepTypeRuntimeChecking(
                              ) {
                                
                                
//#line 775
public x10.
                                               lang.
                                               region
                                               checkCast(
                                               final x10.
                                                 lang.
                                                 region x10_generated_objToCast) {
                                    
//#line 775
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
    
    
//#line 777
private void
                   print(
                   ) {
        
//#line 778
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 779
/* template:ateach { */
            {
            	x10.lang.dist __var28____distCopy = m_places; // make copy to avoid recomputation
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
                
//#line 780
double res =
                  0;
                
//#line 781
x10.
                  lang.
                  DoubleReferenceArray temp =
                  (x10.
                    lang.
                    DoubleReferenceArray)
                    /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(i))/* } */))/* } */.
                      m_array;
                
//#line 782
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
                    
//#line 783
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
                
                
//#line 785
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
        	} catch (Throwable tmp180) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp180);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 788
private void
                   PRINT(
                   ) {
        
//#line 789
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 790
/* template:ateach { */
            {
            	x10.lang.dist __var29____distCopy = m_places; // make copy to avoid recomputation
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
                
//#line 791
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println("block at place " +
                                                                                                                                  i +
                                                                                                                                  " : ");
                
//#line 792
x10.
                  lang.
                  DoubleReferenceArray temp =
                  (x10.
                    lang.
                    DoubleReferenceArray)
                    /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(i))/* } */))/* } */.
                      m_array;
                
//#line 793
int counter =
                  0;
                
//#line 794
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
                    
//#line 795
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                 lang.
                                                                                                                 System.
                                                                                                                 out))/* } */.print(" [" +
                                                                                                                                    p +
                                                                                                                                    "]= " +
                                                                                                                                    /* template:array_get { */((temp).get(p))/* } */);
                    
//#line 796
counter++;
                    
//#line 797
if (counter ==
                                       4) {
                        
//#line 798
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                     lang.
                                                                                                                     System.
                                                                                                                     out))/* } */.print("\n");
                        
//#line 799
counter =
                          0;
                    }
                }/* } */
                }
                /* } */
                
                
//#line 802
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
        	} catch (Throwable tmp181) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp181);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 805
public double
                   norm2(
                   ) {
        
//#line 806
final x10.
          lang.
          DoubleReferenceArray results =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(m_places,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 807
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 808
/* template:ateach { */
            {
            	x10.lang.dist __var30____distCopy = m_places; // make copy to avoid recomputation
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
                
//#line 809
double res =
                  0;
                
//#line 810
final x10.
                  lang.
                  DoubleReferenceArray temp =
                  (x10.
                    lang.
                    DoubleReferenceArray)
                    /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(i))/* } */))/* } */.
                      m_array;
                
//#line 811
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
                    
//#line 812
final x10.
                      lang.
                      place h =
                      /* template:here { */x10.lang.Runtime.here()/* } */;
                    
//#line 813
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
                    
//#line 814
final x10.
                      lang.
                      DoubleReferenceArray aRecv =
                      /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dRecv,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
                    
//#line 815
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 816
/* template:Async { */(x10.lang.Runtime.asPlace(temp.
                                                                                       distribution.
                                                                                       get(
                                                                                       p))).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 817
final double temp3 =
                              /* template:array_get { */((temp).get(p))/* } */ *
                              /* template:array_get { */((temp).get(p))/* } */;
                            
//#line 818
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                            	(new x10.runtime.Activity() {
                            		public void runX10Task() {
                            			{
                                
//#line 819
/* template:array_set { */(aRecv).set(temp3,0)/* } */;
                            }
                            		}
                            	});/* } */
                        }
                        		}
                        	});/* } */
                    }
                    	} catch (Throwable tmp183) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp183);
                    	} finally {
                    		x10.lang.Runtime.getCurrentActivity().stopFinish();
                    	}
                    }
                    /* } */
                    
                    
//#line 822
res =
                      res +
                        /* template:array_get { */((aRecv).get(0))/* } */;
                }/* } */
                }
                /* } */
                
                
//#line 824
/* template:array_set { */(results).set(res,i)/* } */;
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp182) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp182);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 826
double temp =
          results.
            sum() /
          ((SIZE *
              SIZE *
              SIZE));
        
//#line 827
return java.
                              lang.
                              Math.
                              sqrt(
                              temp);
    }
    
    
//#line 829
public void
                   initialize(
                   final int a_CLASS) {
        
//#line 830
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 831
/* template:ateach { */
            {
            	x10.lang.dist __var31____distCopy = m_places; // make copy to avoid recomputation
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
                
//#line 832
final x10.
                  lang.
                  DoubleReferenceArray temp =
                  (x10.
                    lang.
                    DoubleReferenceArray)
                    /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(i))/* } */))/* } */.
                      m_array;
                
//#line 833
final x10.
                  lang.
                  region R =
                  get_m_regions(
                    i);
                
//#line 834
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
                    
//#line 835
switch (a_CLASS) {
                        
//#line 836
case 1:
                            
//#line 837
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
                                
//#line 838
/* template:array_set { */(temp).set(-1,p)/* } */;
                            }
                            
//#line 840
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
                                
//#line 841
/* template:array_set { */(temp).set(1,p)/* } */;
                            }
                            
//#line 843
break;
                        
//#line 845
case 2:
                            
//#line 846
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
                                
//#line 847
/* template:array_set { */(temp).set(-1,p)/* } */;
                            }
                            
//#line 849
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
                                
//#line 850
/* template:array_set { */(temp).set(1,p)/* } */;
                            }
                            
//#line 852
break;
                        
//#line 854
case 3:
                        
//#line 856
case 4:
                            
//#line 857
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
                                
//#line 858
/* template:array_set { */(temp).set(-1,p)/* } */;
                            }
                            
//#line 860
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
                                
//#line 861
/* template:array_set { */(temp).set(1,p)/* } */;
                            }
                            
//#line 863
break;
                        
//#line 865
case 5:
                            
//#line 866
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
                                
//#line 867
/* template:array_set { */(temp).set(-1,p)/* } */;
                            }
                            
//#line 869
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
                                
//#line 870
/* template:array_set { */(temp).set(1,p)/* } */;
                            }
                            
//#line 872
break;
                        
//#line 874
case 6:
                            
//#line 875
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
                                
//#line 876
/* template:array_set { */(temp).set(-1,p)/* } */;
                            }
                            
//#line 878
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
                                
//#line 879
/* template:array_set { */(temp).set(1,p)/* } */;
                            }
                            
//#line 881
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
        	} catch (Throwable tmp184) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp184);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 886
if (EXCHANGE_After) {
            
//#line 887
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 888
exchange();
            }
            	} catch (Throwable tmp185) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp185);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
    }
    
    
//#line 890
public void
                   set(
                   final double a_db) {
        
//#line 891
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 892
/* template:ateach { */
            {
            	x10.lang.dist __var32____distCopy = m_places; // make copy to avoid recomputation
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
                
//#line 893
final x10.
                  lang.
                  DoubleReferenceArray temp =
                  (x10.
                    lang.
                    DoubleReferenceArray)
                    get_m_u(
                      i).
                      m_array;
                
//#line 894
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
                    
//#line 895
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
        	} catch (Throwable tmp186) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp186);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 897
if (EXCHANGE_After) {
            
//#line 898
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 899
exchange();
            }
            	} catch (Throwable tmp187) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp187);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
    }
    
    
//#line 901
public void
                   setLevelData(
                   final LevelData a_LD) {
        
//#line 902
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 903
/* template:ateach { */
            {
            	x10.lang.dist __var33____distCopy = m_places; // make copy to avoid recomputation
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
                
//#line 904
final x10.
                  lang.
                  DoubleReferenceArray u =
                  (x10.
                    lang.
                    DoubleReferenceArray)
                    /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(i))/* } */))/* } */.
                      m_array;
                
//#line 905
final x10.
                  lang.
                  DoubleReferenceArray temp =
                  a_LD.
                    getArray(
                    i);
                
//#line 906
final x10.
                  lang.
                  region mri =
                  get_m_regions(
                    i);
                
//#line 907
/* template:forloop { */
                for (java.util.Iterator p__ = (mri).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 908
final double tp =
                      /* template:array_get { */((temp).get(p))/* } */;
                    
//#line 909
/* template:Async { */(x10.lang.Runtime.asPlace(u.
                                                                                   distribution.
                                                                                   get(
                                                                                   p))).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 910
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
        	} catch (Throwable tmp188) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp188);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 914
if (EXCHANGE_After) {
            
//#line 915
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 916
exchange();
            }
            	} catch (Throwable tmp189) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp189);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
    }
    
    
//#line 918
public void
                   add(
                   final LevelData a_LD) {
        
//#line 919
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 920
/* template:ateach { */
            {
            	x10.lang.dist __var34____distCopy = m_places; // make copy to avoid recomputation
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
                
//#line 921
final x10.
                  lang.
                  DoubleReferenceArray u =
                  (x10.
                    lang.
                    DoubleReferenceArray)
                    get_m_u(
                      i).
                      m_array;
                
//#line 922
final x10.
                  lang.
                  DoubleReferenceArray temp =
                  a_LD.
                    getArray(
                    i);
                
//#line 923
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
                    
//#line 924
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
        	} catch (Throwable tmp190) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp190);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 927
if (EXCHANGE_After) {
            
//#line 928
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 929
exchange();
            }
            	} catch (Throwable tmp191) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp191);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
    }
    
    
//#line 931
private void
                   Exchange(
                   ) {
        
//#line 932
/* template:forloop-mult { */{
        x10.lang.region __var192__ = (x10.lang.region) x10.
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
        if (__var192__.size() > 0 && (__var192__ instanceof x10.array.MultiDimRegion || __var192__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var193__ = __var192__.rank(0).low(), __var194__ = __var192__.rank(0).high(); __var193__ <= __var194__; __var193__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int j = __var193__;
        /* } */
        /* } */
{
            
//#line 933
final int jj =
              j;
            
//#line 934
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 935
/* template:ateach { */
                {
                	x10.lang.dist __var36____distCopy = m_places; // make copy to avoid recomputation
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
                    
//#line 936
final int dest0 =
                      /* template:array_get { */((m_placeGrid.
                                                    coord(
                                                    i)).get(0))/* } */;
                    
//#line 937
final int dest1 =
                      /* template:array_get { */((m_placeGrid.
                                                    coord(
                                                    i)).get(1))/* } */;
                    
//#line 938
final int dest2 =
                      /* template:array_get { */((m_placeGrid.
                                                    coord(
                                                    i)).get(2))/* } */;
                    
//#line 939
final int ii =
                      i;
                    
//#line 940
/* template:forloop-mult { */{
                    x10.lang.region __var196__ = (x10.lang.region) x10.
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
                    if (__var196__.size() > 0 && (__var196__ instanceof x10.array.MultiDimRegion || __var196__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var197__ = __var196__.rank(0).low(), __var198__ = __var196__.rank(0).high(); __var197__ <= __var198__; __var197__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int p = __var197__;
                    /* } */
                    /* } */
{
                        
//#line 941
int disp0 =
                          0;
                        
//#line 942
int disp1 =
                          0;
                        
//#line 943
int disp2 =
                          0;
                        
//#line 944
int source0 =
                          0;
                        
//#line 945
int source1 =
                          0;
                        
//#line 946
int source2 =
                          0;
                        
//#line 947
int trans0 =
                          0;
                        
//#line 948
int trans1 =
                          0;
                        
//#line 949
int trans2 =
                          0;
                        
//#line 950
int sourceID =
                          0;
                        
//#line 951
int k =
                          0;
                        
//#line 952
if (p ==
                                           LOW) {
                            
//#line 953
k =
                              jj *
                                2;
                            
//#line 954
disp0 =
                              ((jj ==
                                  0
                                  ? 1
                                  : 0));
                            
//#line 955
disp1 =
                              ((jj ==
                                  1
                                  ? 1
                                  : 0));
                            
//#line 956
disp2 =
                              ((jj ==
                                  2
                                  ? 1
                                  : 0));
                        } else {
                            
//#line 959
k =
                              jj *
                                2 +
                                1;
                            
//#line 960
disp0 =
                              ((jj ==
                                  0
                                  ? -1
                                  : 0));
                            
//#line 961
disp1 =
                              ((jj ==
                                  1
                                  ? -1
                                  : 0));
                            
//#line 962
disp2 =
                              ((jj ==
                                  2
                                  ? -1
                                  : 0));
                        }
                        
//#line 964
source0 =
                          dest0 -
                            disp0;
                        
//#line 965
source1 =
                          dest1 -
                            disp1;
                        
//#line 966
source2 =
                          dest2 -
                            disp2;
                        
//#line 967
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
                            
//#line 968
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
                            
//#line 969
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
                            
//#line 972
if (jj ==
                                               0) {
                                
//#line 973
source0 =
                                  dest0 +
                                    disp0 *
                                    ((m_block0 -
                                        1));
                                
//#line 974
source1 =
                                  dest1 +
                                    disp1 *
                                    ((m_block0 -
                                        1));
                                
//#line 975
source2 =
                                  dest2 +
                                    disp2 *
                                    ((m_block0 -
                                        1));
                            } else {
                                
//#line 978
if (jj ==
                                                   1) {
                                    
//#line 979
source0 =
                                      dest0 +
                                        disp0 *
                                        ((m_block1 -
                                            1));
                                    
//#line 980
source1 =
                                      dest1 +
                                        disp1 *
                                        ((m_block1 -
                                            1));
                                    
//#line 981
source2 =
                                      dest2 +
                                        disp2 *
                                        ((m_block1 -
                                            1));
                                } else {
                                    
//#line 984
source0 =
                                      dest0 +
                                        disp0 *
                                        ((m_block2 -
                                            1));
                                    
//#line 985
source1 =
                                      dest1 +
                                        disp1 *
                                        ((m_block2 -
                                            1));
                                    
//#line 986
source2 =
                                      dest2 +
                                        disp2 *
                                        ((m_block2 -
                                            1));
                                }
                            }
                            
//#line 988
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
                            
//#line 989
if (jj ==
                                               0) {
                                
//#line 990
trans0 =
                                  disp0 *
                                    m_size0;
                                
//#line 991
trans1 =
                                  disp1 *
                                    m_size0;
                                
//#line 992
trans2 =
                                  disp2 *
                                    m_size0;
                            } else {
                                
//#line 995
if (jj ==
                                                   1) {
                                    
//#line 996
trans0 =
                                      disp0 *
                                        m_size1;
                                    
//#line 997
trans1 =
                                      disp1 *
                                        m_size1;
                                    
//#line 998
trans2 =
                                      disp2 *
                                        m_size1;
                                } else {
                                    
//#line 1001
trans0 =
                                      disp0 *
                                        m_size2;
                                    
//#line 1002
trans1 =
                                      disp1 *
                                        m_size2;
                                    
//#line 1003
trans2 =
                                      disp2 *
                                        m_size2;
                                }
                            }
                            
//#line 1005
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
                                                
                                                
//#line 1005
public x10.
                                                                lang.
                                                                region
                                                                checkCast(
                                                                final x10.
                                                                  lang.
                                                                  region x10_generated_objToCast) {
                                                    
//#line 1005
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
                    for (java.util.Iterator __var37____ = (__var196__).iterator(); __var37____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var37__ = (x10.
                      lang.
                      point) __var37____.next();
                    	/* Join: { *//* Join: { */final int p =
                      /* template:array_get { */((__var37__).get(0))/* } */;/* } */
{
                        
//#line 941
int disp0 =
                          0;
                        
//#line 942
int disp1 =
                          0;
                        
//#line 943
int disp2 =
                          0;
                        
//#line 944
int source0 =
                          0;
                        
//#line 945
int source1 =
                          0;
                        
//#line 946
int source2 =
                          0;
                        
//#line 947
int trans0 =
                          0;
                        
//#line 948
int trans1 =
                          0;
                        
//#line 949
int trans2 =
                          0;
                        
//#line 950
int sourceID =
                          0;
                        
//#line 951
int k =
                          0;
                        
//#line 952
if (p ==
                                           LOW) {
                            
//#line 953
k =
                              jj *
                                2;
                            
//#line 954
disp0 =
                              ((jj ==
                                  0
                                  ? 1
                                  : 0));
                            
//#line 955
disp1 =
                              ((jj ==
                                  1
                                  ? 1
                                  : 0));
                            
//#line 956
disp2 =
                              ((jj ==
                                  2
                                  ? 1
                                  : 0));
                        } else {
                            
//#line 959
k =
                              jj *
                                2 +
                                1;
                            
//#line 960
disp0 =
                              ((jj ==
                                  0
                                  ? -1
                                  : 0));
                            
//#line 961
disp1 =
                              ((jj ==
                                  1
                                  ? -1
                                  : 0));
                            
//#line 962
disp2 =
                              ((jj ==
                                  2
                                  ? -1
                                  : 0));
                        }
                        
//#line 964
source0 =
                          dest0 -
                            disp0;
                        
//#line 965
source1 =
                          dest1 -
                            disp1;
                        
//#line 966
source2 =
                          dest2 -
                            disp2;
                        
//#line 967
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
                            
//#line 968
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
                            
//#line 969
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
                            
//#line 972
if (jj ==
                                               0) {
                                
//#line 973
source0 =
                                  dest0 +
                                    disp0 *
                                    ((m_block0 -
                                        1));
                                
//#line 974
source1 =
                                  dest1 +
                                    disp1 *
                                    ((m_block0 -
                                        1));
                                
//#line 975
source2 =
                                  dest2 +
                                    disp2 *
                                    ((m_block0 -
                                        1));
                            } else {
                                
//#line 978
if (jj ==
                                                   1) {
                                    
//#line 979
source0 =
                                      dest0 +
                                        disp0 *
                                        ((m_block1 -
                                            1));
                                    
//#line 980
source1 =
                                      dest1 +
                                        disp1 *
                                        ((m_block1 -
                                            1));
                                    
//#line 981
source2 =
                                      dest2 +
                                        disp2 *
                                        ((m_block1 -
                                            1));
                                } else {
                                    
//#line 984
source0 =
                                      dest0 +
                                        disp0 *
                                        ((m_block2 -
                                            1));
                                    
//#line 985
source1 =
                                      dest1 +
                                        disp1 *
                                        ((m_block2 -
                                            1));
                                    
//#line 986
source2 =
                                      dest2 +
                                        disp2 *
                                        ((m_block2 -
                                            1));
                                }
                            }
                            
//#line 988
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
                            
//#line 989
if (jj ==
                                               0) {
                                
//#line 990
trans0 =
                                  disp0 *
                                    m_size0;
                                
//#line 991
trans1 =
                                  disp1 *
                                    m_size0;
                                
//#line 992
trans2 =
                                  disp2 *
                                    m_size0;
                            } else {
                                
//#line 995
if (jj ==
                                                   1) {
                                    
//#line 996
trans0 =
                                      disp0 *
                                        m_size1;
                                    
//#line 997
trans1 =
                                      disp1 *
                                        m_size1;
                                    
//#line 998
trans2 =
                                      disp2 *
                                        m_size1;
                                } else {
                                    
//#line 1001
trans0 =
                                      disp0 *
                                        m_size2;
                                    
//#line 1002
trans1 =
                                      disp1 *
                                        m_size2;
                                    
//#line 1003
trans2 =
                                      disp2 *
                                        m_size2;
                                }
                            }
                            
//#line 1005
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
                                                
                                                
//#line 1005
public x10.
                                                                lang.
                                                                region
                                                                checkCast(
                                                                final x10.
                                                                  lang.
                                                                  region x10_generated_objToCast) {
                                                    
//#line 1005
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
            	} catch (Throwable tmp195) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp195);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var35____ = (__var192__).iterator(); __var35____.hasNext(); ) {
        	final  x10.
          lang.
          point __var35__ = (x10.
          lang.
          point) __var35____.next();
        	/* Join: { *//* Join: { */final int j =
          /* template:array_get { */((__var35__).get(0))/* } */;/* } */
{
            
//#line 933
final int jj =
              j;
            
//#line 934
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 935
/* template:ateach { */
                {
                	x10.lang.dist __var36____distCopy = m_places; // make copy to avoid recomputation
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
                    
//#line 936
final int dest0 =
                      /* template:array_get { */((m_placeGrid.
                                                    coord(
                                                    i)).get(0))/* } */;
                    
//#line 937
final int dest1 =
                      /* template:array_get { */((m_placeGrid.
                                                    coord(
                                                    i)).get(1))/* } */;
                    
//#line 938
final int dest2 =
                      /* template:array_get { */((m_placeGrid.
                                                    coord(
                                                    i)).get(2))/* } */;
                    
//#line 939
final int ii =
                      i;
                    
//#line 940
/* template:forloop-mult { */{
                    x10.lang.region __var200__ = (x10.lang.region) x10.
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
                    if (__var200__.size() > 0 && (__var200__ instanceof x10.array.MultiDimRegion || __var200__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var201__ = __var200__.rank(0).low(), __var202__ = __var200__.rank(0).high(); __var201__ <= __var202__; __var201__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int p = __var201__;
                    /* } */
                    /* } */
{
                        
//#line 941
int disp0 =
                          0;
                        
//#line 942
int disp1 =
                          0;
                        
//#line 943
int disp2 =
                          0;
                        
//#line 944
int source0 =
                          0;
                        
//#line 945
int source1 =
                          0;
                        
//#line 946
int source2 =
                          0;
                        
//#line 947
int trans0 =
                          0;
                        
//#line 948
int trans1 =
                          0;
                        
//#line 949
int trans2 =
                          0;
                        
//#line 950
int sourceID =
                          0;
                        
//#line 951
int k =
                          0;
                        
//#line 952
if (p ==
                                           LOW) {
                            
//#line 953
k =
                              jj *
                                2;
                            
//#line 954
disp0 =
                              ((jj ==
                                  0
                                  ? 1
                                  : 0));
                            
//#line 955
disp1 =
                              ((jj ==
                                  1
                                  ? 1
                                  : 0));
                            
//#line 956
disp2 =
                              ((jj ==
                                  2
                                  ? 1
                                  : 0));
                        } else {
                            
//#line 959
k =
                              jj *
                                2 +
                                1;
                            
//#line 960
disp0 =
                              ((jj ==
                                  0
                                  ? -1
                                  : 0));
                            
//#line 961
disp1 =
                              ((jj ==
                                  1
                                  ? -1
                                  : 0));
                            
//#line 962
disp2 =
                              ((jj ==
                                  2
                                  ? -1
                                  : 0));
                        }
                        
//#line 964
source0 =
                          dest0 -
                            disp0;
                        
//#line 965
source1 =
                          dest1 -
                            disp1;
                        
//#line 966
source2 =
                          dest2 -
                            disp2;
                        
//#line 967
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
                            
//#line 968
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
                            
//#line 969
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
                            
//#line 972
if (jj ==
                                               0) {
                                
//#line 973
source0 =
                                  dest0 +
                                    disp0 *
                                    ((m_block0 -
                                        1));
                                
//#line 974
source1 =
                                  dest1 +
                                    disp1 *
                                    ((m_block0 -
                                        1));
                                
//#line 975
source2 =
                                  dest2 +
                                    disp2 *
                                    ((m_block0 -
                                        1));
                            } else {
                                
//#line 978
if (jj ==
                                                   1) {
                                    
//#line 979
source0 =
                                      dest0 +
                                        disp0 *
                                        ((m_block1 -
                                            1));
                                    
//#line 980
source1 =
                                      dest1 +
                                        disp1 *
                                        ((m_block1 -
                                            1));
                                    
//#line 981
source2 =
                                      dest2 +
                                        disp2 *
                                        ((m_block1 -
                                            1));
                                } else {
                                    
//#line 984
source0 =
                                      dest0 +
                                        disp0 *
                                        ((m_block2 -
                                            1));
                                    
//#line 985
source1 =
                                      dest1 +
                                        disp1 *
                                        ((m_block2 -
                                            1));
                                    
//#line 986
source2 =
                                      dest2 +
                                        disp2 *
                                        ((m_block2 -
                                            1));
                                }
                            }
                            
//#line 988
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
                            
//#line 989
if (jj ==
                                               0) {
                                
//#line 990
trans0 =
                                  disp0 *
                                    m_size0;
                                
//#line 991
trans1 =
                                  disp1 *
                                    m_size0;
                                
//#line 992
trans2 =
                                  disp2 *
                                    m_size0;
                            } else {
                                
//#line 995
if (jj ==
                                                   1) {
                                    
//#line 996
trans0 =
                                      disp0 *
                                        m_size1;
                                    
//#line 997
trans1 =
                                      disp1 *
                                        m_size1;
                                    
//#line 998
trans2 =
                                      disp2 *
                                        m_size1;
                                } else {
                                    
//#line 1001
trans0 =
                                      disp0 *
                                        m_size2;
                                    
//#line 1002
trans1 =
                                      disp1 *
                                        m_size2;
                                    
//#line 1003
trans2 =
                                      disp2 *
                                        m_size2;
                                }
                            }
                            
//#line 1005
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
                                                
                                                
//#line 1005
public x10.
                                                                lang.
                                                                region
                                                                checkCast(
                                                                final x10.
                                                                  lang.
                                                                  region x10_generated_objToCast) {
                                                    
//#line 1005
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
                    for (java.util.Iterator __var37____ = (__var200__).iterator(); __var37____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var37__ = (x10.
                      lang.
                      point) __var37____.next();
                    	/* Join: { *//* Join: { */final int p =
                      /* template:array_get { */((__var37__).get(0))/* } */;/* } */
{
                        
//#line 941
int disp0 =
                          0;
                        
//#line 942
int disp1 =
                          0;
                        
//#line 943
int disp2 =
                          0;
                        
//#line 944
int source0 =
                          0;
                        
//#line 945
int source1 =
                          0;
                        
//#line 946
int source2 =
                          0;
                        
//#line 947
int trans0 =
                          0;
                        
//#line 948
int trans1 =
                          0;
                        
//#line 949
int trans2 =
                          0;
                        
//#line 950
int sourceID =
                          0;
                        
//#line 951
int k =
                          0;
                        
//#line 952
if (p ==
                                           LOW) {
                            
//#line 953
k =
                              jj *
                                2;
                            
//#line 954
disp0 =
                              ((jj ==
                                  0
                                  ? 1
                                  : 0));
                            
//#line 955
disp1 =
                              ((jj ==
                                  1
                                  ? 1
                                  : 0));
                            
//#line 956
disp2 =
                              ((jj ==
                                  2
                                  ? 1
                                  : 0));
                        } else {
                            
//#line 959
k =
                              jj *
                                2 +
                                1;
                            
//#line 960
disp0 =
                              ((jj ==
                                  0
                                  ? -1
                                  : 0));
                            
//#line 961
disp1 =
                              ((jj ==
                                  1
                                  ? -1
                                  : 0));
                            
//#line 962
disp2 =
                              ((jj ==
                                  2
                                  ? -1
                                  : 0));
                        }
                        
//#line 964
source0 =
                          dest0 -
                            disp0;
                        
//#line 965
source1 =
                          dest1 -
                            disp1;
                        
//#line 966
source2 =
                          dest2 -
                            disp2;
                        
//#line 967
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
                            
//#line 968
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
                            
//#line 969
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
                            
//#line 972
if (jj ==
                                               0) {
                                
//#line 973
source0 =
                                  dest0 +
                                    disp0 *
                                    ((m_block0 -
                                        1));
                                
//#line 974
source1 =
                                  dest1 +
                                    disp1 *
                                    ((m_block0 -
                                        1));
                                
//#line 975
source2 =
                                  dest2 +
                                    disp2 *
                                    ((m_block0 -
                                        1));
                            } else {
                                
//#line 978
if (jj ==
                                                   1) {
                                    
//#line 979
source0 =
                                      dest0 +
                                        disp0 *
                                        ((m_block1 -
                                            1));
                                    
//#line 980
source1 =
                                      dest1 +
                                        disp1 *
                                        ((m_block1 -
                                            1));
                                    
//#line 981
source2 =
                                      dest2 +
                                        disp2 *
                                        ((m_block1 -
                                            1));
                                } else {
                                    
//#line 984
source0 =
                                      dest0 +
                                        disp0 *
                                        ((m_block2 -
                                            1));
                                    
//#line 985
source1 =
                                      dest1 +
                                        disp1 *
                                        ((m_block2 -
                                            1));
                                    
//#line 986
source2 =
                                      dest2 +
                                        disp2 *
                                        ((m_block2 -
                                            1));
                                }
                            }
                            
//#line 988
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
                            
//#line 989
if (jj ==
                                               0) {
                                
//#line 990
trans0 =
                                  disp0 *
                                    m_size0;
                                
//#line 991
trans1 =
                                  disp1 *
                                    m_size0;
                                
//#line 992
trans2 =
                                  disp2 *
                                    m_size0;
                            } else {
                                
//#line 995
if (jj ==
                                                   1) {
                                    
//#line 996
trans0 =
                                      disp0 *
                                        m_size1;
                                    
//#line 997
trans1 =
                                      disp1 *
                                        m_size1;
                                    
//#line 998
trans2 =
                                      disp2 *
                                        m_size1;
                                } else {
                                    
//#line 1001
trans0 =
                                      disp0 *
                                        m_size2;
                                    
//#line 1002
trans1 =
                                      disp1 *
                                        m_size2;
                                    
//#line 1003
trans2 =
                                      disp2 *
                                        m_size2;
                                }
                            }
                            
//#line 1005
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
                                                
                                                
//#line 1005
public x10.
                                                                lang.
                                                                region
                                                                checkCast(
                                                                final x10.
                                                                  lang.
                                                                  region x10_generated_objToCast) {
                                                    
//#line 1005
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
            	} catch (Throwable tmp199) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp199);
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
    
    
//#line 1011
public void
                    exchange(
                    ) {
        
//#line 1012
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:here { */x10.lang.Runtime.here()/* } */)).runAsync
        	(new x10.runtime.Activity() {
        		public void runX10Task() {
        			{
            
//#line 1013
/* template:forloop-mult { */{
            x10.lang.region __var203__ = (x10.lang.region) x10.
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
            if (__var203__.size() > 0 && (__var203__ instanceof x10.array.MultiDimRegion || __var203__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var204__ = __var203__.rank(0).low(), __var205__ = __var203__.rank(0).high(); __var204__ <= __var205__; __var204__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int j = __var204__;
            /* } */
            /* } */
{
                
//#line 1014
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 1015
/* template:ateach { */
                    {
                    	x10.lang.dist __var39____distCopy = m_places; // make copy to avoid recomputation
                    	for (java.util.Iterator __var39____ = __var39____distCopy.iterator();
                    		 __var39____.hasNext(); )
                    	{
                    		final  x10.
                      lang.
                      point __var39__ = (x10.
                      lang.
                      point) __var39____.next();
                    		/* Join: { */final int i =
                      /* template:array_get { */((__var39__).get(0))/* } */;/* } */
                    		((x10.runtime.Place) __var39____distCopy.get(__var39__)).runAsync
                    			(new x10.runtime.Activity() {
                    				public void runX10Task() {
                    					/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var39__).get(0))/* } */;/* } */
{
                        
//#line 1016
final int jj =
                          j;
                        
//#line 1017
final int dest0 =
                          /* template:array_get { */((m_placeGrid.
                                                        coord(
                                                        i)).get(0))/* } */;
                        
//#line 1018
final int dest1 =
                          /* template:array_get { */((m_placeGrid.
                                                        coord(
                                                        i)).get(1))/* } */;
                        
//#line 1019
final int dest2 =
                          /* template:array_get { */((m_placeGrid.
                                                        coord(
                                                        i)).get(2))/* } */;
                        
//#line 1020
final int ii =
                          i;
                        
//#line 1021
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 1022
/* template:foreach { */
                            for (java.util.Iterator __var40____ = (x10.
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
                                                                       HIGH))).iterator(); __var40____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var40__ = (x10.
                              lang.
                              point) __var40____.next();
                            	/* Join: { */final int p =
                              /* template:array_get { */((__var40__).get(0))/* } */;/* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { */final int p =
                              /* template:array_get { */((__var40__).get(0))/* } */;/* } */
{
                                
//#line 1023
int disp0 =
                                  0;
                                
//#line 1024
int disp1 =
                                  0;
                                
//#line 1025
int disp2 =
                                  0;
                                
//#line 1026
int trans0 =
                                  0;
                                
//#line 1027
int trans1 =
                                  0;
                                
//#line 1028
int trans2 =
                                  0;
                                
//#line 1029
int sourceID =
                                  0;
                                
//#line 1030
int k =
                                  0;
                                
//#line 1031
if (p ==
                                                    LOW) {
                                    
//#line 1032
k =
                                      jj *
                                        2;
                                    
//#line 1033
disp0 =
                                      ((jj ==
                                          0
                                          ? 1
                                          : 0));
                                    
//#line 1034
disp1 =
                                      ((jj ==
                                          1
                                          ? 1
                                          : 0));
                                    
//#line 1035
disp2 =
                                      ((jj ==
                                          2
                                          ? 1
                                          : 0));
                                } else {
                                    
//#line 1038
k =
                                      jj *
                                        2 +
                                        1;
                                    
//#line 1039
disp0 =
                                      ((jj ==
                                          0
                                          ? -1
                                          : 0));
                                    
//#line 1040
disp1 =
                                      ((jj ==
                                          1
                                          ? -1
                                          : 0));
                                    
//#line 1041
disp2 =
                                      ((jj ==
                                          2
                                          ? -1
                                          : 0));
                                }
                                
//#line 1043
int source0 =
                                  dest0 -
                                  disp0;
                                
//#line 1044
int source1 =
                                  dest1 -
                                  disp1;
                                
//#line 1045
int source2 =
                                  dest2 -
                                  disp2;
                                
//#line 1046
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
                                    
//#line 1047
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
                                    
//#line 1048
x10.
                                      lang.
                                      DoubleReferenceArray ma =
                                      (x10.
                                        lang.
                                        DoubleReferenceArray)
                                        get_m_u(
                                          ii).
                                          m_array;
                                    
//#line 1049
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
                                    
//#line 1052
if (jj ==
                                                        0) {
                                        
//#line 1053
source0 =
                                          dest0 +
                                            disp0 *
                                            ((m_block0 -
                                                1));
                                        
//#line 1054
source1 =
                                          dest1 +
                                            disp1 *
                                            ((m_block0 -
                                                1));
                                        
//#line 1055
source2 =
                                          dest2 +
                                            disp2 *
                                            ((m_block0 -
                                                1));
                                    } else {
                                        
//#line 1058
if (jj ==
                                                            1) {
                                            
//#line 1059
source0 =
                                              dest0 +
                                                disp0 *
                                                ((m_block1 -
                                                    1));
                                            
//#line 1060
source1 =
                                              dest1 +
                                                disp1 *
                                                ((m_block1 -
                                                    1));
                                            
//#line 1061
source2 =
                                              dest2 +
                                                disp2 *
                                                ((m_block1 -
                                                    1));
                                        } else {
                                            
//#line 1064
source0 =
                                              dest0 +
                                                disp0 *
                                                ((m_block2 -
                                                    1));
                                            
//#line 1065
source1 =
                                              dest1 +
                                                disp1 *
                                                ((m_block2 -
                                                    1));
                                            
//#line 1066
source2 =
                                              dest2 +
                                                disp2 *
                                                ((m_block2 -
                                                    1));
                                        }
                                    }
                                    
//#line 1068
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
                                    
//#line 1069
if (jj ==
                                                        0) {
                                        
//#line 1070
trans0 =
                                          disp0 *
                                            m_size0;
                                        
//#line 1071
trans1 =
                                          disp1 *
                                            m_size0;
                                        
//#line 1072
trans2 =
                                          disp2 *
                                            m_size0;
                                    } else {
                                        
//#line 1075
if (jj ==
                                                            1) {
                                            
//#line 1076
trans0 =
                                              disp0 *
                                                m_size1;
                                            
//#line 1077
trans1 =
                                              disp1 *
                                                m_size1;
                                            
//#line 1078
trans2 =
                                              disp2 *
                                                m_size1;
                                        } else {
                                            
//#line 1081
trans0 =
                                              disp0 *
                                                m_size2;
                                            
//#line 1082
trans1 =
                                              disp1 *
                                                m_size2;
                                            
//#line 1083
trans2 =
                                              disp2 *
                                                m_size2;
                                        }
                                    }
                                    
//#line 1085
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
                        	} catch (Throwable tmp207) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp207);
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
                	} catch (Throwable tmp206) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp206);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var38____ = (__var203__).iterator(); __var38____.hasNext(); ) {
            	final  x10.
              lang.
              point __var38__ = (x10.
              lang.
              point) __var38____.next();
            	/* Join: { *//* Join: { */final int j =
              /* template:array_get { */((__var38__).get(0))/* } */;/* } */
{
                
//#line 1014
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 1015
/* template:ateach { */
                    {
                    	x10.lang.dist __var39____distCopy = m_places; // make copy to avoid recomputation
                    	for (java.util.Iterator __var39____ = __var39____distCopy.iterator();
                    		 __var39____.hasNext(); )
                    	{
                    		final  x10.
                      lang.
                      point __var39__ = (x10.
                      lang.
                      point) __var39____.next();
                    		/* Join: { */final int i =
                      /* template:array_get { */((__var39__).get(0))/* } */;/* } */
                    		((x10.runtime.Place) __var39____distCopy.get(__var39__)).runAsync
                    			(new x10.runtime.Activity() {
                    				public void runX10Task() {
                    					/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var39__).get(0))/* } */;/* } */
{
                        
//#line 1016
final int jj =
                          j;
                        
//#line 1017
final int dest0 =
                          /* template:array_get { */((m_placeGrid.
                                                        coord(
                                                        i)).get(0))/* } */;
                        
//#line 1018
final int dest1 =
                          /* template:array_get { */((m_placeGrid.
                                                        coord(
                                                        i)).get(1))/* } */;
                        
//#line 1019
final int dest2 =
                          /* template:array_get { */((m_placeGrid.
                                                        coord(
                                                        i)).get(2))/* } */;
                        
//#line 1020
final int ii =
                          i;
                        
//#line 1021
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 1022
/* template:foreach { */
                            for (java.util.Iterator __var40____ = (x10.
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
                                                                       HIGH))).iterator(); __var40____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var40__ = (x10.
                              lang.
                              point) __var40____.next();
                            	/* Join: { */final int p =
                              /* template:array_get { */((__var40__).get(0))/* } */;/* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { */final int p =
                              /* template:array_get { */((__var40__).get(0))/* } */;/* } */
{
                                
//#line 1023
int disp0 =
                                  0;
                                
//#line 1024
int disp1 =
                                  0;
                                
//#line 1025
int disp2 =
                                  0;
                                
//#line 1026
int trans0 =
                                  0;
                                
//#line 1027
int trans1 =
                                  0;
                                
//#line 1028
int trans2 =
                                  0;
                                
//#line 1029
int sourceID =
                                  0;
                                
//#line 1030
int k =
                                  0;
                                
//#line 1031
if (p ==
                                                    LOW) {
                                    
//#line 1032
k =
                                      jj *
                                        2;
                                    
//#line 1033
disp0 =
                                      ((jj ==
                                          0
                                          ? 1
                                          : 0));
                                    
//#line 1034
disp1 =
                                      ((jj ==
                                          1
                                          ? 1
                                          : 0));
                                    
//#line 1035
disp2 =
                                      ((jj ==
                                          2
                                          ? 1
                                          : 0));
                                } else {
                                    
//#line 1038
k =
                                      jj *
                                        2 +
                                        1;
                                    
//#line 1039
disp0 =
                                      ((jj ==
                                          0
                                          ? -1
                                          : 0));
                                    
//#line 1040
disp1 =
                                      ((jj ==
                                          1
                                          ? -1
                                          : 0));
                                    
//#line 1041
disp2 =
                                      ((jj ==
                                          2
                                          ? -1
                                          : 0));
                                }
                                
//#line 1043
int source0 =
                                  dest0 -
                                  disp0;
                                
//#line 1044
int source1 =
                                  dest1 -
                                  disp1;
                                
//#line 1045
int source2 =
                                  dest2 -
                                  disp2;
                                
//#line 1046
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
                                    
//#line 1047
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
                                    
//#line 1048
x10.
                                      lang.
                                      DoubleReferenceArray ma =
                                      (x10.
                                        lang.
                                        DoubleReferenceArray)
                                        get_m_u(
                                          ii).
                                          m_array;
                                    
//#line 1049
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
                                    
//#line 1052
if (jj ==
                                                        0) {
                                        
//#line 1053
source0 =
                                          dest0 +
                                            disp0 *
                                            ((m_block0 -
                                                1));
                                        
//#line 1054
source1 =
                                          dest1 +
                                            disp1 *
                                            ((m_block0 -
                                                1));
                                        
//#line 1055
source2 =
                                          dest2 +
                                            disp2 *
                                            ((m_block0 -
                                                1));
                                    } else {
                                        
//#line 1058
if (jj ==
                                                            1) {
                                            
//#line 1059
source0 =
                                              dest0 +
                                                disp0 *
                                                ((m_block1 -
                                                    1));
                                            
//#line 1060
source1 =
                                              dest1 +
                                                disp1 *
                                                ((m_block1 -
                                                    1));
                                            
//#line 1061
source2 =
                                              dest2 +
                                                disp2 *
                                                ((m_block1 -
                                                    1));
                                        } else {
                                            
//#line 1064
source0 =
                                              dest0 +
                                                disp0 *
                                                ((m_block2 -
                                                    1));
                                            
//#line 1065
source1 =
                                              dest1 +
                                                disp1 *
                                                ((m_block2 -
                                                    1));
                                            
//#line 1066
source2 =
                                              dest2 +
                                                disp2 *
                                                ((m_block2 -
                                                    1));
                                        }
                                    }
                                    
//#line 1068
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
                                    
//#line 1069
if (jj ==
                                                        0) {
                                        
//#line 1070
trans0 =
                                          disp0 *
                                            m_size0;
                                        
//#line 1071
trans1 =
                                          disp1 *
                                            m_size0;
                                        
//#line 1072
trans2 =
                                          disp2 *
                                            m_size0;
                                    } else {
                                        
//#line 1075
if (jj ==
                                                            1) {
                                            
//#line 1076
trans0 =
                                              disp0 *
                                                m_size1;
                                            
//#line 1077
trans1 =
                                              disp1 *
                                                m_size1;
                                            
//#line 1078
trans2 =
                                              disp2 *
                                                m_size1;
                                        } else {
                                            
//#line 1081
trans0 =
                                              disp0 *
                                                m_size2;
                                            
//#line 1082
trans1 =
                                              disp1 *
                                                m_size2;
                                            
//#line 1083
trans2 =
                                              disp2 *
                                                m_size2;
                                        }
                                    }
                                    
//#line 1085
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
                        	} catch (Throwable tmp209) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp209);
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
                	} catch (Throwable tmp208) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp208);
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
    
    
//#line 1092
public x10.
                    lang.
                    GenericReferenceArray
                    getDist3Array(
                    final x10.
                      lang.
                      dist d) {
        
//#line 1093
return (x10.
                               lang.
                               GenericReferenceArray)
                               (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d,(x10.array.Operator.Pointwise)null,true,true,true)/* } */);
    }
    
    
//#line 1095
public x10.
                    lang.
                    GenericReferenceArray
                    getRegion3Array1(
                    final x10.
                      lang.
                      dist d) {
        
//#line 1096
return (x10.
                               lang.
                               GenericReferenceArray)
                               (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d,(x10.array.Operator.Pointwise)null,true,true,true)/* } */);
    }
    
    
//#line 1098
public x10.
                    lang.
                    GenericReferenceArray
                    getRegion3Array2(
                    final x10.
                      lang.
                      dist d) {
        
//#line 1099
return (x10.
                               lang.
                               GenericReferenceArray)
                               (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d,(x10.array.Operator.Pointwise)null,true,true,true)/* } */);
    }
    
    
//#line 1101
public LevelData(final int a_problemDomainSize,
                                   final boolean a_isParallel) {
        
//#line 1101
super();
        
//#line 1102
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
        
//#line 1103
if (Util.
                            OVERLAP_COMMANDCOMP) {
            
//#line 1104
EXCHANGE_After =
              false;
        } else {
            
//#line 1107
EXCHANGE_After =
              Util.
                EXCHANGE_AFTER;
        }
        
//#line 1109
SIZE =
          a_problemDomainSize;
        
//#line 1110
ISPARALLEL =
          a_isParallel;
        
//#line 1111
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
        
//#line 1112
P_DOMAIN =
          temp_P_DOMAIN;
        
//#line 1113
int numCuts =
          0;
        
//#line 1114
int temp_m_numPlaces =
          0;
        
//#line 1115
if (a_isParallel) {
            
//#line 1116
m_places =
              ALLPLACES;
            
//#line 1117
temp_m_numPlaces =
              N_PLACES;
            
//#line 1118
numCuts =
              Util.
                log2(
                N_PLACES);
        } else {
            
//#line 1121
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
            
//#line 1122
temp_m_numPlaces =
              1;
            
//#line 1123
numCuts =
              0;
        }
        
//#line 1125
m_numPlaces =
          temp_m_numPlaces;
        
//#line 1126
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
        
//#line 1127
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
        
//#line 1128
final x10.
          lang.
          GenericReferenceArray temp_m_dist =
          (x10.
            lang.
            GenericReferenceArray)
            getDist3Array(
              d);
        
//#line 1129
m_dist =
          temp_m_dist;
        
//#line 1130
final x10.
          lang.
          GenericReferenceArray temp_m_DIST =
          (x10.
            lang.
            GenericReferenceArray)
            getDist3Array(
              d);
        
//#line 1131
m_DIST =
          temp_m_DIST;
        
//#line 1132
final int m_low0 =
          temp_P_DOMAIN.
            rank(
            0).
            low();
        
//#line 1133
final int m_low1 =
          temp_P_DOMAIN.
            rank(
            1).
            low();
        
//#line 1134
final int m_low2 =
          temp_P_DOMAIN.
            rank(
            2).
            low();
        
//#line 1135
final int m_hi0 =
          temp_P_DOMAIN.
            rank(
            0).
            high();
        
//#line 1136
final int m_hi1 =
          temp_P_DOMAIN.
            rank(
            1).
            high();
        
//#line 1137
final int m_hi2 =
          temp_P_DOMAIN.
            rank(
            2).
            high();
        
//#line 1138
final int temp_m_size0 =
          m_hi0 -
          m_low0 +
          1;
        
//#line 1139
final int temp_m_size1 =
          m_hi1 -
          m_low1 +
          1;
        
//#line 1140
final int temp_m_size2 =
          m_hi2 -
          m_low2 +
          1;
        
//#line 1141
m_size0 =
          temp_m_size0;
        
//#line 1142
m_size1 =
          temp_m_size1;
        
//#line 1143
m_size2 =
          temp_m_size2;
        
//#line 1144
int a =
          numCuts /
          3;
        
//#line 1145
int b =
          numCuts %
          3;
        
//#line 1146
final int m_cut0 =
          a +
          ((b >
              0
              ? 1
              : 0));
        
//#line 1147
final int m_cut1 =
          a +
          ((b >
              1
              ? 1
              : 0));
        
//#line 1148
final int m_cut2 =
          a;
        
//#line 1149
final int pow2_m_cut0 =
          Util.
            pow2(
            m_cut0);
        
//#line 1150
final int pow2_m_cut1 =
          Util.
            pow2(
            m_cut1);
        
//#line 1151
final int pow2_m_cut2 =
          Util.
            pow2(
            m_cut2);
        
//#line 1152
m_block0 =
          pow2_m_cut0;
        
//#line 1153
m_block1 =
          pow2_m_cut1;
        
//#line 1154
m_block2 =
          pow2_m_cut2;
        
//#line 1155
final int m_blockSize0 =
          temp_m_size0 /
          pow2_m_cut0;
        
//#line 1156
final int m_blockSize1 =
          temp_m_size1 /
          pow2_m_cut1;
        
//#line 1157
final int m_blockSize2 =
          temp_m_size2 /
          pow2_m_cut2;
        
//#line 1158
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
        
//#line 1159
m_placeGrid =
          temp_m_placeGrid;
        
//#line 1160
int i =
          0;
        
//#line 1161
x10.
          lang.
          GenericReferenceArray m_reg =
          (x10.
            lang.
            GenericReferenceArray)
            getRegion3Array1(
              d);
        
//#line 1162
x10.
          lang.
          GenericReferenceArray m_REG =
          (x10.
            lang.
            GenericReferenceArray)
            getRegion3Array1(
              d);
        
//#line 1163
/* template:forloop-mult { */{
        x10.lang.region __var210__ = (x10.lang.region) temp_m_placeGrid;
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
        final int x = __var211__;
        /* } */
        /* template:final-var-assign { */
        final int y = __var213__;
        /* } */
        /* template:final-var-assign { */
        final int z = __var215__;
        /* } */
        /* } */
{
            
//#line 1164
final int mrl0 =
              m_blockSize0 *
              x +
              m_low0;
            
//#line 1165
final int mrl1 =
              m_blockSize1 *
              y +
              m_low1;
            
//#line 1166
final int mrl2 =
              m_blockSize2 *
              z +
              m_low2;
            
//#line 1167
final int mrh0 =
              m_blockSize0 *
              ((x +
                  1)) +
              m_low0;
            
//#line 1168
final int mrh1 =
              m_blockSize1 *
              ((y +
                  1)) +
              m_low1;
            
//#line 1169
final int mrh2 =
              m_blockSize2 *
              ((z +
                  1)) +
              m_low2;
            
//#line 1170
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
            
//#line 1171
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
            
//#line 1172
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
            
//#line 1173
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
            
//#line 1174
i++;
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var41____ = (__var210__).iterator(); __var41____.hasNext(); ) {
        	final  x10.
          lang.
          point __var41__ = (x10.
          lang.
          point) __var41____.next();
        	/* Join: { *//* Join: { */final int x =
          /* template:array_get { */((__var41__).get(0))/* } */;
final int y =
          /* template:array_get { */((__var41__).get(1))/* } */;
final int z =
          /* template:array_get { */((__var41__).get(2))/* } */;/* } */
{
            
//#line 1164
final int mrl0 =
              m_blockSize0 *
              x +
              m_low0;
            
//#line 1165
final int mrl1 =
              m_blockSize1 *
              y +
              m_low1;
            
//#line 1166
final int mrl2 =
              m_blockSize2 *
              z +
              m_low2;
            
//#line 1167
final int mrh0 =
              m_blockSize0 *
              ((x +
                  1)) +
              m_low0;
            
//#line 1168
final int mrh1 =
              m_blockSize1 *
              ((y +
                  1)) +
              m_low1;
            
//#line 1169
final int mrh2 =
              m_blockSize2 *
              ((z +
                  1)) +
              m_low2;
            
//#line 1170
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
            
//#line 1171
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
            
//#line 1172
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
            
//#line 1173
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
            
//#line 1174
i++;
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 1176
m_regions =
          m_reg;
        
//#line 1177
m_REGIONs =
          m_REG;
        
//#line 1178
x10.
          lang.
          GenericReferenceArray temp_m_boundaries =
          (x10.
            lang.
            GenericReferenceArray)
            getRegion3Array2(
              di);
        
//#line 1179
/* template:forloop-mult { */{
        x10.lang.region __var217__ = (x10.lang.region) di.
                                                         region;
        if (__var217__.size() > 0 && (__var217__ instanceof x10.array.MultiDimRegion || __var217__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var218__ = __var217__.rank(0).low(), __var219__ = __var217__.rank(0).high(); __var218__ <= __var219__; __var218__++)
        /* } */
        /* template:forloop-mult-each { */
        for (int __var220__ = __var217__.rank(1).low(), __var221__ = __var217__.rank(1).high(); __var220__ <= __var221__; __var220__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int j = __var218__;
        /* } */
        /* template:final-var-assign { */
        final int ii = __var220__;
        /* } */
        /* } */
{
            
//#line 1180
if (j ==
                                0) {
                
//#line 1181
/* template:array_set { */(temp_m_boundaries).set(Util.
                                                                                  boundary(
                                                                                  new x10.
                                                                                    runtime.
                                                                                    RuntimeCastChecker.
                                                                                    DepTypeRuntimeChecking(
                                                                                    ) {
                                                                                      
                                                                                      
//#line 1181
public x10.
                                                                                                      lang.
                                                                                                      region
                                                                                                      checkCast(
                                                                                                      final x10.
                                                                                                        lang.
                                                                                                        region x10_generated_objToCast) {
                                                                                          
//#line 1181
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
            
//#line 1183
if (j ==
                                2) {
                
//#line 1184
/* template:array_set { */(temp_m_boundaries).set(Util.
                                                                                  boundary(
                                                                                  new x10.
                                                                                    runtime.
                                                                                    RuntimeCastChecker.
                                                                                    DepTypeRuntimeChecking(
                                                                                    ) {
                                                                                      
                                                                                      
//#line 1184
public x10.
                                                                                                      lang.
                                                                                                      region
                                                                                                      checkCast(
                                                                                                      final x10.
                                                                                                        lang.
                                                                                                        region x10_generated_objToCast) {
                                                                                          
//#line 1184
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
            
//#line 1186
if (j ==
                                4) {
                
//#line 1187
/* template:array_set { */(temp_m_boundaries).set(Util.
                                                                                  boundary(
                                                                                  new x10.
                                                                                    runtime.
                                                                                    RuntimeCastChecker.
                                                                                    DepTypeRuntimeChecking(
                                                                                    ) {
                                                                                      
                                                                                      
//#line 1187
public x10.
                                                                                                      lang.
                                                                                                      region
                                                                                                      checkCast(
                                                                                                      final x10.
                                                                                                        lang.
                                                                                                        region x10_generated_objToCast) {
                                                                                          
//#line 1187
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
            
//#line 1189
if (j ==
                                1) {
                
//#line 1190
/* template:array_set { */(temp_m_boundaries).set(Util.
                                                                                  boundary(
                                                                                  new x10.
                                                                                    runtime.
                                                                                    RuntimeCastChecker.
                                                                                    DepTypeRuntimeChecking(
                                                                                    ) {
                                                                                      
                                                                                      
//#line 1190
public x10.
                                                                                                      lang.
                                                                                                      region
                                                                                                      checkCast(
                                                                                                      final x10.
                                                                                                        lang.
                                                                                                        region x10_generated_objToCast) {
                                                                                          
//#line 1190
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
            
//#line 1192
if (j ==
                                3) {
                
//#line 1193
/* template:array_set { */(temp_m_boundaries).set(Util.
                                                                                  boundary(
                                                                                  new x10.
                                                                                    runtime.
                                                                                    RuntimeCastChecker.
                                                                                    DepTypeRuntimeChecking(
                                                                                    ) {
                                                                                      
                                                                                      
//#line 1193
public x10.
                                                                                                      lang.
                                                                                                      region
                                                                                                      checkCast(
                                                                                                      final x10.
                                                                                                        lang.
                                                                                                        region x10_generated_objToCast) {
                                                                                          
//#line 1193
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
            
//#line 1195
if (j ==
                                5) {
                
//#line 1196
/* template:array_set { */(temp_m_boundaries).set(Util.
                                                                                  boundary(
                                                                                  new x10.
                                                                                    runtime.
                                                                                    RuntimeCastChecker.
                                                                                    DepTypeRuntimeChecking(
                                                                                    ) {
                                                                                      
                                                                                      
//#line 1196
public x10.
                                                                                                      lang.
                                                                                                      region
                                                                                                      checkCast(
                                                                                                      final x10.
                                                                                                        lang.
                                                                                                        region x10_generated_objToCast) {
                                                                                          
//#line 1196
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
        for (java.util.Iterator __var42____ = (__var217__).iterator(); __var42____.hasNext(); ) {
        	final  x10.
          lang.
          point __var42__ = (x10.
          lang.
          point) __var42____.next();
        	/* Join: { *//* Join: { */final int j =
          /* template:array_get { */((__var42__).get(0))/* } */;
final int ii =
          /* template:array_get { */((__var42__).get(1))/* } */;/* } */
{
            
//#line 1180
if (j ==
                                0) {
                
//#line 1181
/* template:array_set { */(temp_m_boundaries).set(Util.
                                                                                  boundary(
                                                                                  new x10.
                                                                                    runtime.
                                                                                    RuntimeCastChecker.
                                                                                    DepTypeRuntimeChecking(
                                                                                    ) {
                                                                                      
                                                                                      
//#line 1181
public x10.
                                                                                                      lang.
                                                                                                      region
                                                                                                      checkCast(
                                                                                                      final x10.
                                                                                                        lang.
                                                                                                        region x10_generated_objToCast) {
                                                                                          
//#line 1181
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
            
//#line 1183
if (j ==
                                2) {
                
//#line 1184
/* template:array_set { */(temp_m_boundaries).set(Util.
                                                                                  boundary(
                                                                                  new x10.
                                                                                    runtime.
                                                                                    RuntimeCastChecker.
                                                                                    DepTypeRuntimeChecking(
                                                                                    ) {
                                                                                      
                                                                                      
//#line 1184
public x10.
                                                                                                      lang.
                                                                                                      region
                                                                                                      checkCast(
                                                                                                      final x10.
                                                                                                        lang.
                                                                                                        region x10_generated_objToCast) {
                                                                                          
//#line 1184
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
            
//#line 1186
if (j ==
                                4) {
                
//#line 1187
/* template:array_set { */(temp_m_boundaries).set(Util.
                                                                                  boundary(
                                                                                  new x10.
                                                                                    runtime.
                                                                                    RuntimeCastChecker.
                                                                                    DepTypeRuntimeChecking(
                                                                                    ) {
                                                                                      
                                                                                      
//#line 1187
public x10.
                                                                                                      lang.
                                                                                                      region
                                                                                                      checkCast(
                                                                                                      final x10.
                                                                                                        lang.
                                                                                                        region x10_generated_objToCast) {
                                                                                          
//#line 1187
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
            
//#line 1189
if (j ==
                                1) {
                
//#line 1190
/* template:array_set { */(temp_m_boundaries).set(Util.
                                                                                  boundary(
                                                                                  new x10.
                                                                                    runtime.
                                                                                    RuntimeCastChecker.
                                                                                    DepTypeRuntimeChecking(
                                                                                    ) {
                                                                                      
                                                                                      
//#line 1190
public x10.
                                                                                                      lang.
                                                                                                      region
                                                                                                      checkCast(
                                                                                                      final x10.
                                                                                                        lang.
                                                                                                        region x10_generated_objToCast) {
                                                                                          
//#line 1190
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
            
//#line 1192
if (j ==
                                3) {
                
//#line 1193
/* template:array_set { */(temp_m_boundaries).set(Util.
                                                                                  boundary(
                                                                                  new x10.
                                                                                    runtime.
                                                                                    RuntimeCastChecker.
                                                                                    DepTypeRuntimeChecking(
                                                                                    ) {
                                                                                      
                                                                                      
//#line 1193
public x10.
                                                                                                      lang.
                                                                                                      region
                                                                                                      checkCast(
                                                                                                      final x10.
                                                                                                        lang.
                                                                                                        region x10_generated_objToCast) {
                                                                                          
//#line 1193
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
            
//#line 1195
if (j ==
                                5) {
                
//#line 1196
/* template:array_set { */(temp_m_boundaries).set(Util.
                                                                                  boundary(
                                                                                  new x10.
                                                                                    runtime.
                                                                                    RuntimeCastChecker.
                                                                                    DepTypeRuntimeChecking(
                                                                                    ) {
                                                                                      
                                                                                      
//#line 1196
public x10.
                                                                                                      lang.
                                                                                                      region
                                                                                                      checkCast(
                                                                                                      final x10.
                                                                                                        lang.
                                                                                                        region x10_generated_objToCast) {
                                                                                          
//#line 1196
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
        
        
//#line 1199
m_boundaries =
          temp_m_boundaries;
        
//#line 1200
final x10.
          lang.
          GenericReferenceArray temp_m_u =
          getWrapperArray(
            ALLPLACES);
        
//#line 1201
m_u =
          temp_m_u;
        
//#line 1202
/* template:forloop-mult { */{
        x10.lang.region __var222__ = (x10.lang.region) x10.
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
        if (__var222__.size() > 0 && (__var222__ instanceof x10.array.MultiDimRegion || __var222__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var223__ = __var222__.rank(0).low(), __var224__ = __var222__.rank(0).high(); __var223__ <= __var224__; __var223__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int k = __var223__;
        /* } */
        /* } */
{
            
//#line 1203
final x10.
              lang.
              dist disi =
              new x10.
                runtime.
                RuntimeCastChecker.
                DepTypeRuntimeChecking(
                ) {
                  
                  
//#line 1203
public x10.
                                  lang.
                                  dist
                                  checkCast(
                                  final x10.
                                    lang.
                                    dist x10_generated_objToCast) {
                      
//#line 1203
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
            
//#line 1204
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1205
/* template:Async { */(x10.lang.Runtime.asPlace(temp_m_u.
                                                                                distribution.
                                                                                get(
                                                                                k))).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1206
/* template:array_set { */(temp_m_u).set(new Wrapper(
                      getDoubleArray(
                        disi)),k)/* } */;
                }
                		}
                	});/* } */
            }
            	} catch (Throwable tmp225) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp225);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var43____ = (__var222__).iterator(); __var43____.hasNext(); ) {
        	final  x10.
          lang.
          point __var43__ = (x10.
          lang.
          point) __var43____.next();
        	/* Join: { *//* Join: { */final int k =
          /* template:array_get { */((__var43__).get(0))/* } */;/* } */
{
            
//#line 1203
final x10.
              lang.
              dist disi =
              new x10.
                runtime.
                RuntimeCastChecker.
                DepTypeRuntimeChecking(
                ) {
                  
                  
//#line 1203
public x10.
                                  lang.
                                  dist
                                  checkCast(
                                  final x10.
                                    lang.
                                    dist x10_generated_objToCast) {
                      
//#line 1203
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
            
//#line 1204
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1205
/* template:Async { */(x10.lang.Runtime.asPlace(temp_m_u.
                                                                                distribution.
                                                                                get(
                                                                                k))).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1206
/* template:array_set { */(temp_m_u).set(new Wrapper(
                      getDoubleArray(
                        disi)),k)/* } */;
                }
                		}
                	});/* } */
            }
            	} catch (Throwable tmp226) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp226);
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
    
    
//#line 1210
private x10.
                    lang.
                    GenericReferenceArray
                    getWrapperArray(
                    final x10.
                      lang.
                      dist d) {
        
//#line 1211
return /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
    }
    
    
//#line 1213
private x10.
                    lang.
                    DoubleReferenceArray
                    getDoubleArray(
                    final x10.
                      lang.
                      dist d) {
        
//#line 1214
return /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point pp/* } */, double dummy) { {
            
//#line 1215
return 0;
        } }
        }/* } */,true,true,false)/* } */;
    }
    
    
//#line 1218
private x10.
                    lang.
                    region
                    get_m_regions(
                    final int i) {
        
//#line 1219
final x10.
          lang.
          place h =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 1220
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
        
//#line 1221
final x10.
          lang.
          GenericReferenceArray aRecv =
          (x10.
            lang.
            GenericReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dRecv,(x10.array.Operator.Pointwise)null,true,true,true)/* } */);
        
//#line 1222
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1223
/* template:Async { */(x10.lang.Runtime.asPlace(m_regions.
                                                                            distribution.
                                                                            get(
                                                                            i))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 1224
final x10.
                  lang.
                  region temp3 =
                  new x10.
                    runtime.
                    RuntimeCastChecker.
                    DepTypeRuntimeChecking(
                    ) {
                      
                      
//#line 1224
public x10.
                                      lang.
                                      region
                                      checkCast(
                                      final x10.
                                        lang.
                                        region x10_generated_objToCast) {
                          
//#line 1224
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
                
//#line 1225
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1226
/* template:array_set { */(aRecv).set(temp3,0)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp227) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp227);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1229
final x10.
          lang.
          region mri =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 1229
public x10.
                              lang.
                              region
                              checkCast(
                              final x10.
                                lang.
                                region x10_generated_objToCast) {
                  
//#line 1229
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
        
//#line 1230
return mri;
    }
    
    
//#line 1232
private x10.
                    lang.
                    region
                    get_m_REGIONs(
                    final int i) {
        
//#line 1233
final x10.
          lang.
          place h =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 1234
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
        
//#line 1235
final x10.
          lang.
          GenericReferenceArray aRecv =
          (x10.
            lang.
            GenericReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dRecv,(x10.array.Operator.Pointwise)null,true,true,true)/* } */);
        
//#line 1236
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1237
/* template:Async { */(x10.lang.Runtime.asPlace(m_REGIONs.
                                                                            distribution.
                                                                            get(
                                                                            i))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 1238
final x10.
                  lang.
                  region temp3 =
                  new x10.
                    runtime.
                    RuntimeCastChecker.
                    DepTypeRuntimeChecking(
                    ) {
                      
                      
//#line 1238
public x10.
                                      lang.
                                      region
                                      checkCast(
                                      final x10.
                                        lang.
                                        region x10_generated_objToCast) {
                          
//#line 1238
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
                
//#line 1239
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1240
/* template:array_set { */(aRecv).set(temp3,0)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp228) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp228);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1243
final x10.
          lang.
          region mri =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 1243
public x10.
                              lang.
                              region
                              checkCast(
                              final x10.
                                lang.
                                region x10_generated_objToCast) {
                  
//#line 1243
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
        
//#line 1244
return mri;
    }
    
    
//#line 1246
private x10.
                    lang.
                    region
                    get_m_boundaries(
                    final int i,
                    final int j) {
        
//#line 1247
final x10.
          lang.
          place h =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 1248
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
        
//#line 1249
final x10.
          lang.
          GenericReferenceArray aRecv =
          (x10.
            lang.
            GenericReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dRecv,(x10.array.Operator.Pointwise)null,true,true,true)/* } */);
        
//#line 1250
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1251
/* template:Async { */(x10.lang.Runtime.asPlace(m_boundaries.
                                                                            distribution.
                                                                            get(
                                                                            i,
                                                                            j))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 1252
final x10.
                  lang.
                  region temp4 =
                  new x10.
                    runtime.
                    RuntimeCastChecker.
                    DepTypeRuntimeChecking(
                    ) {
                      
                      
//#line 1252
public x10.
                                      lang.
                                      region
                                      checkCast(
                                      final x10.
                                        lang.
                                        region x10_generated_objToCast) {
                          
//#line 1252
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
                
//#line 1253
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1254
/* template:array_set { */(aRecv).set(temp4,0)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp229) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp229);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1257
final x10.
          lang.
          region mri =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 1257
public x10.
                              lang.
                              region
                              checkCast(
                              final x10.
                                lang.
                                region x10_generated_objToCast) {
                  
//#line 1257
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
        
//#line 1258
return mri;
    }
    
    
//#line 1260
private Wrapper
                    get_m_u(
                    final int i) {
        
//#line 1261
final x10.
          lang.
          place h =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 1262
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
        
//#line 1263
final x10.
          lang.
          GenericReferenceArray aRecv =
          (x10.
            lang.
            GenericReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dRecv,(x10.array.Operator.Pointwise)null,true,true,true)/* } */);
        
//#line 1264
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1265
/* template:Async { */(x10.lang.Runtime.asPlace(m_u.
                                                                            distribution.
                                                                            get(
                                                                            i))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 1266
final Wrapper temp4 =
                  /* template:parametric { */((Wrapper)(/* template:array_get { */((m_u).get(i))/* } */))/* } */;
                
//#line 1267
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1268
/* template:array_set { */(aRecv).set(temp4,0)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp230) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp230);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1271
final Wrapper mri =
          /* template:parametric { */((Wrapper)(/* template:array_get { */((aRecv).get(0))/* } */))/* } */;
        
//#line 1272
return mri;
    }
}

class Timer
extends x10.
  lang.
  Object
{
    
//#line 1277
final public static int
      max_counters =
      64;
    
//#line 1278
private x10.
      lang.
      DoubleReferenceArray
      start_time;
    
//#line 1279
private x10.
      lang.
      DoubleReferenceArray
      elapsed_time;
    
//#line 1280
private x10.
      lang.
      DoubleReferenceArray
      total_time;
    
    
//#line 1281
public Timer() {
        
//#line 1281
super();
        
//#line 1282
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
        
//#line 1283
start_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 1284
return 0;
           } }
           }/* } */,true,true,false)/* } */);
        
//#line 1286
elapsed_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 1287
return 0;
           } }
           }/* } */,true,true,false)/* } */);
        
//#line 1289
total_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 1290
return 0;
           } }
           }/* } */,true,true,false)/* } */);
    }
    
    
//#line 1293
public void
                    start(
                    final int n) {
        
//#line 1294
/* template:array_set { */(start_time).set(java.
                                                                   lang.
                                                                   System.
                                                                   currentTimeMillis(),n)/* } */;
    }
    
    
//#line 1296
public void
                    stop(
                    final int n) {
        
//#line 1297
/* template:array_set { */(elapsed_time).set(java.
                                                                     lang.
                                                                     System.
                                                                     currentTimeMillis() -
          /* template:array_get { */((start_time).get(n))/* } */,n)/* } */;
        
//#line 1298
/* template:array_set { */(elapsed_time).set(/* template:array_get { */((elapsed_time).get(n))/* } */ /
          1000,n)/* } */;
        
//#line 1299
/* template:array_set { */(total_time).set(/* template:array_get { */((total_time).get(n))/* } */ +
          /* template:array_get { */((elapsed_time).get(n))/* } */,n)/* } */;
    }
    
    
//#line 1301
public double
                    readTimer(
                    final int n) {
        
//#line 1302
return /* template:array_get { */((total_time).get(n))/* } */;
    }
    
    
//#line 1304
public void
                    resetTimer(
                    final int n) {
        
//#line 1305
/* template:array_set { */(total_time).set(0,n)/* } */;
        
//#line 1306
/* template:array_set { */(start_time).set(0,n)/* } */;
        
//#line 1307
/* template:array_set { */(elapsed_time).set(0,n)/* } */;
    }
    
    
//#line 1309
public void
                    resetAllTimers(
                    ) {
        
//#line 1310
int i =
          0;
        
//#line 1311
while (i <
                               max_counters) {
            
//#line 1312
resetTimer(
                            i);
            
//#line 1313
i++;
        }
    }
}
