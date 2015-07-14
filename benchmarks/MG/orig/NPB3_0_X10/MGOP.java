package NPB3_0_X10;

import x10.lang.*;

final public class MGOP
extends x10.
  lang.
  Object
{
    
//#line 32
final public static boolean
      PERF_On =
      NPB3_0_X10.
        Util.
        PERF_OUTPUT;
    
//#line 33
final public static double
      PERF_Comp =
      1.0 /
      NPB3_0_X10.
        Util.
        FP_PERCLOCK;
    
//#line 34
final public static double
      PERF_CommL =
      NPB3_0_X10.
        Util.
        COMM_LATENCY *
      NPB3_0_X10.
        Util.
        CLOCK_SPEED;
    
//#line 35
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
    
//#line 36
final public static boolean
      PERF_InLoop =
      NPB3_0_X10.
        Util.
        IN_LOOP;
    
//#line 37
final public static boolean
      PERF_CompOnly =
      NPB3_0_X10.
        Util.
        COMP_ONLY;
    
//#line 38
final public static boolean
      PERF_CommOnly =
      NPB3_0_X10.
        Util.
        COMM_ONLY;
    
//#line 39
final public static boolean
      OVERLAPPED =
      NPB3_0_X10.
        Util.
        OVERLAP_COMMANDCOMP;
    
//#line 41
final public boolean
      EXCHANGE_After;
    
//#line 43
final public static double[]
      Ac =
      { -8.0 /
      3.0,
    0.0,
    1.0 /
      6.0,
    1.0 /
      12.0 };
    
//#line 44
final public static double[]
      Sac =
      { -3.0 /
      8.0,
    1.0 /
      32.0,
    -1.0 /
      64.0,
    0 };
    
//#line 45
final public static double[]
      Pc =
      { 1.0 /
      2.0,
    1.0 /
      4.0,
    1.0 /
      8.0,
    1.0 /
      16.0 };
    
//#line 48
final int
      P2SLEVEL =
      NPB3_0_X10.
        Util.
        P2SLEVEL -
      1;
    
//#line 50
final int
      m_size;
    
//#line 51
final x10.
      lang.
      region
      m_problemDomain;
    
//#line 52
final int
      m_levels;
    
//#line 53
final NPB3_0_X10.
      LevelData[]
      m_r;
    
//#line 53
final NPB3_0_X10.
      LevelData[]
      m_z;
    
//#line 54
NPB3_0_X10.
      LevelData
      m_tempLD;
    
    
//#line 57
public MGOP(final int a_size) {
        
//#line 57
super();
        
//#line 58
if (NPB3_0_X10.
                          Util.
                          OVERLAP_COMMANDCOMP) {
            
//#line 59
EXCHANGE_After =
              false;
        } else {
            
//#line 61
EXCHANGE_After =
              NPB3_0_X10.
                Util.
                EXCHANGE_AFTER;
        }
        
//#line 63
assert NPB3_0_X10.
                             Util.
                             powerOf2(
                             a_size);
        
//#line 64
int i;
        
//#line 64
int j;
        
//#line 64
int k;
        
//#line 66
m_size =
          a_size;
        
//#line 67
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
              m_size -
                1),
            x10.
              lang.
              region.
              factory.
              region(
              0,
              m_size -
                1),
            x10.
              lang.
              region.
              factory.
              region(
              0,
              m_size -
                1));
        
//#line 68
m_levels =
          NPB3_0_X10.
            Util.
            log2(
            a_size);
        
//#line 70
if (P2SLEVEL >
                          0) {
            
//#line 71
i =
              NPB3_0_X10.
                Util.
                pow2(
                P2SLEVEL);
            
//#line 71
j =
              i *
                i *
                i;
            
//#line 72
assert (j >=
                                  NPB3_0_X10.
                                    Util.
                                    N_PLACES &&
                                  P2SLEVEL <
                                  m_levels -
                                  1);
        } else {
            
//#line 75
assert NPB3_0_X10.
                                 Util.
                                 N_PLACES <=
              8;
        }
        
//#line 78
m_r =
          (new NPB3_0_X10.
             LevelData[m_levels]);
        
//#line 78
m_z =
          (new NPB3_0_X10.
             LevelData[m_levels]);
        
//#line 79
j =
          m_size;
        
//#line 80
boolean isParallel;
        
//#line 81
for (
//#line 81
i =
                           m_levels -
                             1;
                         i >
                           -1;
                         
//#line 81
i--) {
            
//#line 82
if (i >=
                              P2SLEVEL) {
                
//#line 82
isParallel =
                  true;
            } else {
                
//#line 82
isParallel =
                  false;
            }
            
//#line 83
m_r[i] =
              new NPB3_0_X10.
                LevelData(
                j,
                isParallel);
            
//#line 84
m_z[i] =
              new NPB3_0_X10.
                LevelData(
                j,
                isParallel);
            
//#line 85
j /=
              2;
        }
        
//#line 87
if (P2SLEVEL >
                          0) {
            
//#line 87
m_tempLD =
              new NPB3_0_X10.
                LevelData(
                NPB3_0_X10.
                  Util.
                  pow2(
                  P2SLEVEL),
                true);
        }
        
//#line 88
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("Overlapping communication and computation? " +
                                                                                                                         OVERLAPPED +
                                                                                                                         ". If not, doing exchange after computation? " +
                                                                                                                         EXCHANGE_After);
    }
    
    
//#line 93
final void
                  computeResidual(
                  final NPB3_0_X10.
                    LevelData RES,
                  final NPB3_0_X10.
                    LevelData a_arg) {
        
//#line 95
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 95
/* template:ateach { */
            {
            	x10.lang.dist __var11____distCopy = RES.
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
                
//#line 96
final x10.
                  lang.
                  DoubleReferenceArray res =
                  RES.
                    getArray(
                    i);
                
//#line 97
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 99
x10.
                  lang.
                  region R =
                  RES.
                    getInnerRegion(
                    i);
                
//#line 101
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 102
double d0;
                    
//#line 102
double d1;
                    
//#line 102
double d2;
                    
//#line 102
double d3;
                    
//#line 103
d0 =
                      /* template:array_get { */((arg).get(p))/* } */;
                    
//#line 105
d2 =
                      0;
                    
//#line 105
for (
//#line 105
int j =
                                        0;
                                      j <
                                        NPB3_0_X10.
                                          Util.
                                          DIFF2.
                                          length;
                                      
//#line 105
j++) {
                        
//#line 105
d2 +=
                          /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                         Util.
                                                                                                                                                         DIFF2[j])))/* } */;
                    }
                    
//#line 106
d3 =
                      0;
                    
//#line 106
for (
//#line 106
int j =
                                        0;
                                      j <
                                        NPB3_0_X10.
                                          Util.
                                          DIFF3.
                                          length;
                                      
//#line 106
j++) {
                        
//#line 106
d3 +=
                          /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                         Util.
                                                                                                                                                         DIFF3[j])))/* } */;
                    }
                    
//#line 107
/* template:array_set { */(res).subSet((Ac[0] *
                                                                           d0 +
                                                                           Ac[2] *
                                                                           d2 +
                                                                           Ac[3] *
                                                                           d3),p)/* } */;
                    
//#line 108
if (PERF_On &&
                                       ((!PERF_CommOnly)) &&
                                       PERF_InLoop) {
                        
//#line 108
x10.
                                       lang.
                                       perf.
                                       addLocalOps(
                                       (long)
                                         ((26 *
                                             PERF_Comp)));
                    }
                }/* } */
                }
                /* } */
                
                
//#line 110
if (PERF_On &&
                                   ((!PERF_CommOnly)) &&
                                   ((!PERF_InLoop))) {
                    
//#line 110
x10.
                                   lang.
                                   perf.
                                   addLocalOps(
                                   (long)
                                     ((26 *
                                         PERF_Comp *
                                         R.
                                           size())));
                }
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
        
        
//#line 113
if (EXCHANGE_After) {
            
//#line 113
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 113
RES.
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
    
    
//#line 117
final void
                   computeResidual(
                   final NPB3_0_X10.
                     LevelData a_res,
                   final NPB3_0_X10.
                     LevelData a_arg1,
                   final NPB3_0_X10.
                     LevelData a_arg2) {
        
//#line 118
if (OVERLAPPED) {
            
//#line 119
ComputeResidual_Overlapped(
                           a_res,
                           a_arg1,
                           a_arg2);
        } else {
            
//#line 121
ComputeResidual(
                           a_res,
                           a_arg1,
                           a_arg2);
        }
    }
    
    
//#line 124
final void
                   ComputeResidual(
                   final NPB3_0_X10.
                     LevelData a_res,
                   final NPB3_0_X10.
                     LevelData a_arg1,
                   final NPB3_0_X10.
                     LevelData a_arg2) {
        
//#line 125
if (!EXCHANGE_After) {
            
//#line 125
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 125
a_arg2.
                               exchange();
            }
            	} catch (Throwable tmp54) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp54);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
        
//#line 126
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 126
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
                
//#line 127
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 128
final x10.
                  lang.
                  DoubleReferenceArray arg1 =
                  a_arg1.
                    getArray(
                    i);
                
//#line 129
final x10.
                  lang.
                  DoubleReferenceArray arg2 =
                  a_arg2.
                    getArray(
                    i);
                
//#line 131
x10.
                  lang.
                  region R =
                  a_res.
                    getInnerRegion(
                    i);
                
//#line 133
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 134
double d0;
                    
//#line 134
double d1;
                    
//#line 134
double d2;
                    
//#line 134
double d3;
                    
//#line 135
d0 =
                      /* template:array_get { */((arg2).get(p))/* } */;
                    
//#line 137
d2 =
                      0;
                    
//#line 137
for (
//#line 137
int j =
                                        0;
                                      j <
                                        NPB3_0_X10.
                                          Util.
                                          DIFF2.
                                          length;
                                      
//#line 137
j++) {
                        
//#line 137
d2 +=
                          /* template:array_get { */((arg2).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                          Util.
                                                                                                                                                          DIFF2[j])))/* } */;
                    }
                    
//#line 138
d3 =
                      0;
                    
//#line 138
for (
//#line 138
int j =
                                        0;
                                      j <
                                        NPB3_0_X10.
                                          Util.
                                          DIFF3.
                                          length;
                                      
//#line 138
j++) {
                        
//#line 138
d3 +=
                          /* template:array_get { */((arg2).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                          Util.
                                                                                                                                                          DIFF3[j])))/* } */;
                    }
                    
//#line 139
/* template:array_set { */(res).set(/* template:array_get { */((arg1).get(p))/* } */ -
                      Ac[0] *
                      d0 -
                      Ac[2] *
                      d2 -
                      Ac[3] *
                      d3,p)/* } */;
                    
//#line 140
if (PERF_On &&
                                       ((!PERF_CommOnly)) &&
                                       PERF_InLoop) {
                        
//#line 140
x10.
                                       lang.
                                       perf.
                                       addLocalOps(
                                       (long)
                                         ((26 *
                                             PERF_Comp)));
                    }
                }/* } */
                }
                /* } */
                
                
//#line 142
if (PERF_On &&
                                   ((!PERF_CommOnly)) &&
                                   ((!PERF_InLoop))) {
                    
//#line 142
x10.
                                   lang.
                                   perf.
                                   addLocalOps(
                                   (long)
                                     ((26 *
                                         PERF_Comp *
                                         R.
                                           size())));
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp55) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp55);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 145
if (EXCHANGE_After) {
            
//#line 145
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 145
a_res.
                               exchange();
            }
            	} catch (Throwable tmp56) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp56);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
    }
    
    
//#line 148
final void
                   ComputeResidual_Overlapped1(
                   final NPB3_0_X10.
                     LevelData a_res,
                   final NPB3_0_X10.
                     LevelData a_arg1,
                   final NPB3_0_X10.
                     LevelData a_arg2) {
        
//#line 149
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 150
a_arg2.
                           exchange();
            
//#line 151
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
                
//#line 152
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 153
final x10.
                  lang.
                  DoubleReferenceArray arg1 =
                  a_arg1.
                    getArray(
                    i);
                
//#line 154
final x10.
                  lang.
                  DoubleReferenceArray arg2 =
                  a_arg2.
                    getArray(
                    i);
                
//#line 156
x10.
                  lang.
                  region R =
                  a_res.
                    getINNERRegion(
                    i);
                
//#line 158
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 159
double d0;
                    
//#line 159
double d1;
                    
//#line 159
double d2;
                    
//#line 159
double d3;
                    
//#line 160
d0 =
                      /* template:array_get { */((arg2).get(p))/* } */;
                    
//#line 162
d2 =
                      0;
                    
//#line 162
for (
//#line 162
int j =
                                        0;
                                      j <
                                        NPB3_0_X10.
                                          Util.
                                          DIFF2.
                                          length;
                                      
//#line 162
j++) {
                        
//#line 162
d2 +=
                          /* template:array_get { */((arg2).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                          Util.
                                                                                                                                                          DIFF2[j])))/* } */;
                    }
                    
//#line 163
d3 =
                      0;
                    
//#line 163
for (
//#line 163
int j =
                                        0;
                                      j <
                                        NPB3_0_X10.
                                          Util.
                                          DIFF3.
                                          length;
                                      
//#line 163
j++) {
                        
//#line 163
d3 +=
                          /* template:array_get { */((arg2).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                          Util.
                                                                                                                                                          DIFF3[j])))/* } */;
                    }
                    
//#line 164
/* template:array_set { */(res).set(/* template:array_get { */((arg1).get(p))/* } */ -
                      Ac[0] *
                      d0 -
                      Ac[2] *
                      d2 -
                      Ac[3] *
                      d3,p)/* } */;
                    
//#line 165
if (PERF_On &&
                                       ((!PERF_CommOnly)) &&
                                       PERF_InLoop) {
                        
//#line 165
x10.
                                       lang.
                                       perf.
                                       addLocalOps(
                                       (long)
                                         ((26 *
                                             PERF_Comp)));
                    }
                }/* } */
                }
                /* } */
                
                
//#line 167
if (PERF_On &&
                                   ((!PERF_CommOnly)) &&
                                   ((!PERF_InLoop))) {
                    
//#line 167
x10.
                                   lang.
                                   perf.
                                   addLocalOps(
                                   (long)
                                     ((26 *
                                         PERF_Comp *
                                         R.
                                           size())));
                }
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
        
        
//#line 171
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 171
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
                
//#line 172
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 173
final x10.
                  lang.
                  DoubleReferenceArray arg1 =
                  a_arg1.
                    getArray(
                    i);
                
//#line 174
final x10.
                  lang.
                  DoubleReferenceArray arg2 =
                  a_arg2.
                    getArray(
                    i);
                
//#line 176
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
                
//#line 178
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 179
double d0;
                    
//#line 179
double d1;
                    
//#line 179
double d2;
                    
//#line 179
double d3;
                    
//#line 180
d0 =
                      /* template:array_get { */((arg2).get(p))/* } */;
                    
//#line 181
d2 =
                      0;
                    
//#line 181
for (
//#line 181
int j =
                                        0;
                                      j <
                                        NPB3_0_X10.
                                          Util.
                                          DIFF2.
                                          length;
                                      
//#line 181
j++) {
                        
//#line 181
d2 +=
                          /* template:array_get { */((arg2).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                          Util.
                                                                                                                                                          DIFF2[j])))/* } */;
                    }
                    
//#line 182
d3 =
                      0;
                    
//#line 182
for (
//#line 182
int j =
                                        0;
                                      j <
                                        NPB3_0_X10.
                                          Util.
                                          DIFF3.
                                          length;
                                      
//#line 182
j++) {
                        
//#line 182
d3 +=
                          /* template:array_get { */((arg2).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                          Util.
                                                                                                                                                          DIFF3[j])))/* } */;
                    }
                    
//#line 183
/* template:array_set { */(res).set(/* template:array_get { */((arg1).get(p))/* } */ -
                      Ac[0] *
                      d0 -
                      Ac[2] *
                      d2 -
                      Ac[3] *
                      d3,p)/* } */;
                    
//#line 184
if (PERF_On &&
                                       ((!PERF_CommOnly)) &&
                                       PERF_InLoop) {
                        
//#line 184
x10.
                                       lang.
                                       perf.
                                       addLocalOps(
                                       (long)
                                         ((26 *
                                             PERF_Comp)));
                    }
                }/* } */
                }
                /* } */
                
                
//#line 186
if (PERF_On &&
                                   ((!PERF_CommOnly)) &&
                                   ((!PERF_InLoop))) {
                    
//#line 186
x10.
                                   lang.
                                   perf.
                                   addLocalOps(
                                   (long)
                                     ((26 *
                                         PERF_Comp *
                                         R.
                                           size())));
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp58) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp58);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 191
final void
                   ComputeResidual_Overlapped(
                   final NPB3_0_X10.
                     LevelData a_res,
                   final NPB3_0_X10.
                     LevelData a_arg1,
                   final NPB3_0_X10.
                     LevelData a_arg2) {
        
//#line 192
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 192
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:here { */x10.lang.Runtime.here()/* } */)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 193
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
                    
//#line 194
final x10.
                      lang.
                      DoubleReferenceArray res =
                      a_res.
                        getArray(
                        i);
                    
//#line 195
final x10.
                      lang.
                      DoubleReferenceArray arg1 =
                      a_arg1.
                        getArray(
                        i);
                    
//#line 196
final x10.
                      lang.
                      DoubleReferenceArray arg2 =
                      a_arg2.
                        getArray(
                        i);
                    
//#line 198
x10.
                      lang.
                      region R =
                      a_res.
                        getINNERRegion(
                        i);
                    
//#line 200
/* template:forloop { */
                    for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point p = (x10.
                      lang.
                      point) p__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 201
double d0;
                        
//#line 201
double d1;
                        
//#line 201
double d2;
                        
//#line 201
double d3;
                        
//#line 202
d0 =
                          /* template:array_get { */((arg2).get(p))/* } */;
                        
//#line 204
d2 =
                          0;
                        
//#line 204
for (
//#line 204
int j =
                                            0;
                                          j <
                                            NPB3_0_X10.
                                              Util.
                                              DIFF2.
                                              length;
                                          
//#line 204
j++) {
                            
//#line 204
d2 +=
                              /* template:array_get { */((arg2).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                              Util.
                                                                                                                                                              DIFF2[j])))/* } */;
                        }
                        
//#line 205
d3 =
                          0;
                        
//#line 205
for (
//#line 205
int j =
                                            0;
                                          j <
                                            NPB3_0_X10.
                                              Util.
                                              DIFF3.
                                              length;
                                          
//#line 205
j++) {
                            
//#line 205
d3 +=
                              /* template:array_get { */((arg2).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                              Util.
                                                                                                                                                              DIFF3[j])))/* } */;
                        }
                        
//#line 206
/* template:array_set { */(res).set(/* template:array_get { */((arg1).get(p))/* } */ -
                          Ac[0] *
                          d0 -
                          Ac[2] *
                          d2 -
                          Ac[3] *
                          d3,p)/* } */;
                        
//#line 207
if (PERF_On &&
                                           ((!PERF_CommOnly)) &&
                                           PERF_InLoop) {
                            
//#line 207
x10.
                                           lang.
                                           perf.
                                           addLocalOps(
                                           (long)
                                             ((26 *
                                                 PERF_Comp)));
                        }
                    }/* } */
                    }
                    /* } */
                    
                    
//#line 209
if (PERF_On &&
                                       ((!PERF_CommOnly)) &&
                                       ((!PERF_InLoop))) {
                        
//#line 209
x10.
                                       lang.
                                       perf.
                                       addLocalOps(
                                       (long)
                                         ((26 *
                                             PERF_Comp *
                                             R.
                                               size())));
                    }
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
                
//#line 213
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 213
a_arg2.
                                   exchange();
                }
                	} catch (Throwable tmp60) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp60);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 215
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
                    
//#line 216
final x10.
                      lang.
                      DoubleReferenceArray res =
                      a_res.
                        getArray(
                        i);
                    
//#line 217
final x10.
                      lang.
                      DoubleReferenceArray arg1 =
                      a_arg1.
                        getArray(
                        i);
                    
//#line 218
final x10.
                      lang.
                      DoubleReferenceArray arg2 =
                      a_arg2.
                        getArray(
                        i);
                    
//#line 220
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
                    
//#line 222
/* template:forloop { */
                    for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point p = (x10.
                      lang.
                      point) p__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 223
double d0;
                        
//#line 223
double d1;
                        
//#line 223
double d2;
                        
//#line 223
double d3;
                        
//#line 224
d0 =
                          /* template:array_get { */((arg2).get(p))/* } */;
                        
//#line 225
d2 =
                          0;
                        
//#line 225
for (
//#line 225
int j =
                                            0;
                                          j <
                                            NPB3_0_X10.
                                              Util.
                                              DIFF2.
                                              length;
                                          
//#line 225
j++) {
                            
//#line 225
d2 +=
                              /* template:array_get { */((arg2).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                              Util.
                                                                                                                                                              DIFF2[j])))/* } */;
                        }
                        
//#line 226
d3 =
                          0;
                        
//#line 226
for (
//#line 226
int j =
                                            0;
                                          j <
                                            NPB3_0_X10.
                                              Util.
                                              DIFF3.
                                              length;
                                          
//#line 226
j++) {
                            
//#line 226
d3 +=
                              /* template:array_get { */((arg2).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                              Util.
                                                                                                                                                              DIFF3[j])))/* } */;
                        }
                        
//#line 227
/* template:array_set { */(res).set(/* template:array_get { */((arg1).get(p))/* } */ -
                          Ac[0] *
                          d0 -
                          Ac[2] *
                          d2 -
                          Ac[3] *
                          d3,p)/* } */;
                        
//#line 228
if (PERF_On &&
                                           ((!PERF_CommOnly)) &&
                                           PERF_InLoop) {
                            
//#line 228
x10.
                                           lang.
                                           perf.
                                           addLocalOps(
                                           (long)
                                             ((26 *
                                                 PERF_Comp)));
                        }
                    }/* } */
                    }
                    /* } */
                    
                    
//#line 230
if (PERF_On &&
                                       ((!PERF_CommOnly)) &&
                                       ((!PERF_InLoop))) {
                        
//#line 230
x10.
                                       lang.
                                       perf.
                                       addLocalOps(
                                       (long)
                                         ((26 *
                                             PERF_Comp *
                                             R.
                                               size())));
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
        	} catch (Throwable tmp59) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp59);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 237
final void
                   smooth(
                   final NPB3_0_X10.
                     LevelData a_res,
                   final NPB3_0_X10.
                     LevelData a_arg,
                   final boolean a_isBottom) {
        
//#line 238
if (OVERLAPPED) {
            
//#line 239
Smooth_Overlapped(
                           a_res,
                           a_arg,
                           a_isBottom);
        } else {
            
//#line 241
Smooth(
                           a_res,
                           a_arg,
                           a_isBottom);
        }
    }
    
    
//#line 243
final void
                   Smooth(
                   final NPB3_0_X10.
                     LevelData a_res,
                   final NPB3_0_X10.
                     LevelData a_arg,
                   final boolean a_isBottom) {
        
//#line 244
if (!EXCHANGE_After) {
            
//#line 244
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 244
a_arg.
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
        
//#line 246
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 246
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
                
//#line 247
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 248
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 250
x10.
                  lang.
                  region R =
                  a_res.
                    getInnerRegion(
                    i);
                
//#line 252
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 253
double d0;
                    
//#line 253
double d1;
                    
//#line 253
double d2;
                    
//#line 253
double d3;
                    
//#line 254
d0 =
                      /* template:array_get { */((arg).get(p))/* } */;
                    
//#line 255
d1 =
                      0;
                    
//#line 255
for (
//#line 255
int j =
                                        0;
                                      j <
                                        NPB3_0_X10.
                                          Util.
                                          DIFF1.
                                          length;
                                      
//#line 255
j++) {
                        
//#line 255
d1 +=
                          /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                         Util.
                                                                                                                                                         DIFF1[j])))/* } */;
                    }
                    
//#line 256
d2 =
                      0;
                    
//#line 256
for (
//#line 256
int j =
                                        0;
                                      j <
                                        NPB3_0_X10.
                                          Util.
                                          DIFF2.
                                          length;
                                      
//#line 256
j++) {
                        
//#line 256
d2 +=
                          /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                         Util.
                                                                                                                                                         DIFF2[j])))/* } */;
                    }
                    
//#line 261
/* template:array_set { */(res).addSet(Sac[0] *
                      d0 +
                      Sac[1] *
                      d1 +
                      Sac[2] *
                      d2,p)/* } */;
                    
//#line 262
if (PERF_On &&
                                       ((!PERF_CommOnly)) &&
                                       PERF_InLoop) {
                        
//#line 262
x10.
                                       lang.
                                       perf.
                                       addLocalOps(
                                       (long)
                                         ((24 *
                                             PERF_Comp)));
                    }
                }/* } */
                }
                /* } */
                
                
//#line 264
if (PERF_On &&
                                   ((!PERF_CommOnly)) &&
                                   ((!PERF_InLoop))) {
                    
//#line 264
x10.
                                   lang.
                                   perf.
                                   addLocalOps(
                                   (long)
                                     ((24 *
                                         PERF_Comp *
                                         R.
                                           size())));
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp62) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp62);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 267
if (EXCHANGE_After) {
            
//#line 267
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 267
a_res.
                               exchange();
            }
            	} catch (Throwable tmp63) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp63);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
    }
    
    
//#line 270
final void
                   Smooth_Overlapped1(
                   final NPB3_0_X10.
                     LevelData a_res,
                   final NPB3_0_X10.
                     LevelData a_arg,
                   final boolean a_isBottom) {
        
//#line 271
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 272
a_arg.
                           exchange();
            
//#line 273
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
                    getINNERRegion(
                    i);
                
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
double d0;
                    
//#line 280
double d1;
                    
//#line 280
double d2;
                    
//#line 280
double d3;
                    
//#line 281
d0 =
                      /* template:array_get { */((arg).get(p))/* } */;
                    
//#line 282
d1 =
                      0;
                    
//#line 282
for (
//#line 282
int j =
                                        0;
                                      j <
                                        NPB3_0_X10.
                                          Util.
                                          DIFF1.
                                          length;
                                      
//#line 282
j++) {
                        
//#line 282
d1 +=
                          /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                         Util.
                                                                                                                                                         DIFF1[j])))/* } */;
                    }
                    
//#line 283
d2 =
                      0;
                    
//#line 283
for (
//#line 283
int j =
                                        0;
                                      j <
                                        NPB3_0_X10.
                                          Util.
                                          DIFF2.
                                          length;
                                      
//#line 283
j++) {
                        
//#line 283
d2 +=
                          /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                         Util.
                                                                                                                                                         DIFF2[j])))/* } */;
                    }
                    
//#line 284
/* template:array_set { */(res).addSet(Sac[0] *
                      d0 +
                      Sac[1] *
                      d1 +
                      Sac[2] *
                      d2,p)/* } */;
                    
//#line 285
if (PERF_On &&
                                       ((!PERF_CommOnly)) &&
                                       PERF_InLoop) {
                        
//#line 285
x10.
                                       lang.
                                       perf.
                                       addLocalOps(
                                       (long)
                                         ((24 *
                                             PERF_Comp)));
                    }
                }/* } */
                }
                /* } */
                
                
//#line 287
if (PERF_On &&
                                   ((!PERF_CommOnly)) &&
                                   ((!PERF_InLoop))) {
                    
//#line 287
x10.
                                   lang.
                                   perf.
                                   addLocalOps(
                                   (long)
                                     ((24 *
                                         PERF_Comp *
                                         R.
                                           size())));
                }
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
        
        
//#line 291
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 291
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
                
//#line 292
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 293
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 295
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
                
//#line 297
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 298
double d0;
                    
//#line 298
double d1;
                    
//#line 298
double d2;
                    
//#line 298
double d3;
                    
//#line 299
d0 =
                      /* template:array_get { */((arg).get(p))/* } */;
                    
//#line 300
d1 =
                      0;
                    
//#line 300
for (
//#line 300
int j =
                                        0;
                                      j <
                                        NPB3_0_X10.
                                          Util.
                                          DIFF1.
                                          length;
                                      
//#line 300
j++) {
                        
//#line 300
d1 +=
                          /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                         Util.
                                                                                                                                                         DIFF1[j])))/* } */;
                    }
                    
//#line 301
d2 =
                      0;
                    
//#line 301
for (
//#line 301
int j =
                                        0;
                                      j <
                                        NPB3_0_X10.
                                          Util.
                                          DIFF2.
                                          length;
                                      
//#line 301
j++) {
                        
//#line 301
d2 +=
                          /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                         Util.
                                                                                                                                                         DIFF2[j])))/* } */;
                    }
                    
//#line 302
/* template:array_set { */(res).addSet(Sac[0] *
                      d0 +
                      Sac[1] *
                      d1 +
                      Sac[2] *
                      d2,p)/* } */;
                    
//#line 303
if (PERF_On &&
                                       ((!PERF_CommOnly)) &&
                                       PERF_InLoop) {
                        
//#line 303
x10.
                                       lang.
                                       perf.
                                       addLocalOps(
                                       (long)
                                         ((24 *
                                             PERF_Comp)));
                    }
                }/* } */
                }
                /* } */
                
                
//#line 305
if (PERF_On &&
                                   ((!PERF_CommOnly)) &&
                                   ((!PERF_InLoop))) {
                    
//#line 305
x10.
                                   lang.
                                   perf.
                                   addLocalOps(
                                   (long)
                                     ((24 *
                                         PERF_Comp *
                                         R.
                                           size())));
                }
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
    
    
//#line 310
final void
                   Smooth_Overlapped(
                   final NPB3_0_X10.
                     LevelData a_res,
                   final NPB3_0_X10.
                     LevelData a_arg,
                   final boolean a_isBottom) {
        
//#line 311
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 311
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:here { */x10.lang.Runtime.here()/* } */)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 312
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
                    
//#line 313
final x10.
                      lang.
                      DoubleReferenceArray res =
                      a_res.
                        getArray(
                        i);
                    
//#line 314
final x10.
                      lang.
                      DoubleReferenceArray arg =
                      a_arg.
                        getArray(
                        i);
                    
//#line 316
x10.
                      lang.
                      region R =
                      a_res.
                        getINNERRegion(
                        i);
                    
//#line 318
/* template:forloop { */
                    for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point p = (x10.
                      lang.
                      point) p__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 319
double d0;
                        
//#line 319
double d1;
                        
//#line 319
double d2;
                        
//#line 319
double d3;
                        
//#line 320
d0 =
                          /* template:array_get { */((arg).get(p))/* } */;
                        
//#line 321
d1 =
                          0;
                        
//#line 321
for (
//#line 321
int j =
                                            0;
                                          j <
                                            NPB3_0_X10.
                                              Util.
                                              DIFF1.
                                              length;
                                          
//#line 321
j++) {
                            
//#line 321
d1 +=
                              /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                             Util.
                                                                                                                                                             DIFF1[j])))/* } */;
                        }
                        
//#line 322
d2 =
                          0;
                        
//#line 322
for (
//#line 322
int j =
                                            0;
                                          j <
                                            NPB3_0_X10.
                                              Util.
                                              DIFF2.
                                              length;
                                          
//#line 322
j++) {
                            
//#line 322
d2 +=
                              /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                             Util.
                                                                                                                                                             DIFF2[j])))/* } */;
                        }
                        
//#line 323
/* template:array_set { */(res).addSet(Sac[0] *
                          d0 +
                          Sac[1] *
                          d1 +
                          Sac[2] *
                          d2,p)/* } */;
                        
//#line 324
if (PERF_On &&
                                           ((!PERF_CommOnly)) &&
                                           PERF_InLoop) {
                            
//#line 324
x10.
                                           lang.
                                           perf.
                                           addLocalOps(
                                           (long)
                                             ((24 *
                                                 PERF_Comp)));
                        }
                    }/* } */
                    }
                    /* } */
                    
                    
//#line 326
if (PERF_On &&
                                       ((!PERF_CommOnly)) &&
                                       ((!PERF_InLoop))) {
                        
//#line 326
x10.
                                       lang.
                                       perf.
                                       addLocalOps(
                                       (long)
                                         ((24 *
                                             PERF_Comp *
                                             R.
                                               size())));
                    }
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
                
//#line 330
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 330
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
                
                
//#line 331
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
                    
//#line 332
final x10.
                      lang.
                      DoubleReferenceArray res =
                      a_res.
                        getArray(
                        i);
                    
//#line 333
final x10.
                      lang.
                      DoubleReferenceArray arg =
                      a_arg.
                        getArray(
                        i);
                    
//#line 335
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
                    
//#line 337
/* template:forloop { */
                    for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point p = (x10.
                      lang.
                      point) p__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 338
double d0;
                        
//#line 338
double d1;
                        
//#line 338
double d2;
                        
//#line 338
double d3;
                        
//#line 339
d0 =
                          /* template:array_get { */((arg).get(p))/* } */;
                        
//#line 340
d1 =
                          0;
                        
//#line 340
for (
//#line 340
int j =
                                            0;
                                          j <
                                            NPB3_0_X10.
                                              Util.
                                              DIFF1.
                                              length;
                                          
//#line 340
j++) {
                            
//#line 340
d1 +=
                              /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                             Util.
                                                                                                                                                             DIFF1[j])))/* } */;
                        }
                        
//#line 341
d2 =
                          0;
                        
//#line 341
for (
//#line 341
int j =
                                            0;
                                          j <
                                            NPB3_0_X10.
                                              Util.
                                              DIFF2.
                                              length;
                                          
//#line 341
j++) {
                            
//#line 341
d2 +=
                              /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                             Util.
                                                                                                                                                             DIFF2[j])))/* } */;
                        }
                        
//#line 342
/* template:array_set { */(res).addSet(Sac[0] *
                          d0 +
                          Sac[1] *
                          d1 +
                          Sac[2] *
                          d2,p)/* } */;
                        
//#line 343
if (PERF_On &&
                                           ((!PERF_CommOnly)) &&
                                           PERF_InLoop) {
                            
//#line 343
x10.
                                           lang.
                                           perf.
                                           addLocalOps(
                                           (long)
                                             ((24 *
                                                 PERF_Comp)));
                        }
                    }/* } */
                    }
                    /* } */
                    
                    
//#line 345
if (PERF_On &&
                                       ((!PERF_CommOnly)) &&
                                       ((!PERF_InLoop))) {
                        
//#line 345
x10.
                                       lang.
                                       perf.
                                       addLocalOps(
                                       (long)
                                         ((24 *
                                             PERF_Comp *
                                             R.
                                               size())));
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
        	} catch (Throwable tmp66) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp66);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 352
final void
                   applyOpP(
                   final NPB3_0_X10.
                     LevelData a_res,
                   final NPB3_0_X10.
                     LevelData a_arg,
                   final int a_level) {
        
//#line 353
if (a_level ==
                           P2SLEVEL) {
            
//#line 354
applyOpP(
                           m_tempLD,
                           a_arg);
            
//#line 356
final x10.
              lang.
              DoubleReferenceArray res =
              a_res.
                getArray(
                0);
            
//#line 359
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 359
/* template:ateach { */
                {
                	x10.lang.dist __var22____distCopy = m_tempLD.
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
                    
//#line 360
x10.
                      lang.
                      DoubleReferenceArray temp =
                      m_tempLD.
                        getArray(
                        i);
                    
//#line 361
NPB3_0_X10.
                                   Util.
                                   arraycopy(
                                   res,
                                   m_tempLD.
                                     getInnerRegion(
                                     i),
                                   temp);
                    
//#line 362
if (i !=
                                       0) {
                        
//#line 363
if (PERF_On &&
                                           ((!PERF_CompOnly))) {
                            
//#line 364
x10.
                                           lang.
                                           perf.
                                           addLocalOps(
                                           (long)
                                             ((PERF_CommL +
                                                 PERF_CommB *
                                                 m_tempLD.
                                                   getInnerRegion(
                                                   i).
                                                   size())));
                        }
                    }
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
            
        } else {
            
//#line 368
applyOpP(
                           a_res,
                           a_arg);
        }
        
//#line 369
if (EXCHANGE_After) {
            
//#line 369
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 369
a_res.
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
    }
    
    
//#line 371
final void
                   applyOpP(
                   final NPB3_0_X10.
                     LevelData a_res,
                   final NPB3_0_X10.
                     LevelData a_arg) {
        
//#line 372
if (OVERLAPPED) {
            
//#line 373
ApplyOpP_Overlapped(
                           a_res,
                           a_arg);
        } else {
            
//#line 375
ApplyOpP(
                           a_res,
                           a_arg);
        }
    }
    
    
//#line 377
final void
                   ApplyOpP(
                   final NPB3_0_X10.
                     LevelData a_res,
                   final NPB3_0_X10.
                     LevelData a_arg) {
        
//#line 378
if (!EXCHANGE_After) {
            
//#line 378
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 378
a_arg.
                               exchange();
            }
            	} catch (Throwable tmp70) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp70);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
        
//#line 379
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 379
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
                
//#line 380
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 381
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 383
x10.
                  lang.
                  region R =
                  a_res.
                    getInnerRegion(
                    i);
                
//#line 385
/* template:forloop { */
                for (java.util.Iterator pp__ = (R).iterator(); pp__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pp = (x10.
                  lang.
                  point) pp__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 386
double d0;
                    
//#line 386
double d1;
                    
//#line 386
double d2;
                    
//#line 386
double d3;
                    
//#line 387
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
                    
//#line 388
d0 =
                      /* template:array_get { */((arg).get(p))/* } */;
                    
//#line 389
d1 =
                      0;
                    
//#line 389
for (
//#line 389
int j =
                                        0;
                                      j <
                                        NPB3_0_X10.
                                          Util.
                                          DIFF1.
                                          length;
                                      
//#line 389
j++) {
                        
//#line 389
d1 +=
                          /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                         Util.
                                                                                                                                                         DIFF1[j])))/* } */;
                    }
                    
//#line 390
d2 =
                      0;
                    
//#line 390
for (
//#line 390
int j =
                                        0;
                                      j <
                                        NPB3_0_X10.
                                          Util.
                                          DIFF2.
                                          length;
                                      
//#line 390
j++) {
                        
//#line 390
d2 +=
                          /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                         Util.
                                                                                                                                                         DIFF2[j])))/* } */;
                    }
                    
//#line 391
d3 =
                      0;
                    
//#line 391
for (
//#line 391
int j =
                                        0;
                                      j <
                                        NPB3_0_X10.
                                          Util.
                                          DIFF3.
                                          length;
                                      
//#line 391
j++) {
                        
//#line 391
d3 +=
                          /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                         Util.
                                                                                                                                                         DIFF3[j])))/* } */;
                    }
                    
//#line 392
/* template:array_set { */(res).set(Pc[0] *
                      d0 +
                      Pc[1] *
                      d1 +
                      Pc[2] *
                      d2 +
                      Pc[3] *
                      d3,pp)/* } */;
                    
//#line 393
if (PERF_On &&
                                       ((!PERF_CommOnly)) &&
                                       PERF_InLoop) {
                        
//#line 393
x10.
                                       lang.
                                       perf.
                                       addLocalOps(
                                       (long)
                                         ((34 *
                                             PERF_Comp)));
                    }
                }/* } */
                }
                /* } */
                
                
//#line 395
if (PERF_On &&
                                   ((!PERF_CommOnly)) &&
                                   ((!PERF_InLoop))) {
                    
//#line 395
x10.
                                   lang.
                                   perf.
                                   addLocalOps(
                                   (long)
                                     ((34 *
                                         PERF_Comp *
                                         R.
                                           size())));
                }
            }/* } */
            				}
            			});
            	}
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
        
    }
    
    
//#line 399
final void
                   ApplyOpP_Overlapped1(
                   final NPB3_0_X10.
                     LevelData a_res,
                   final NPB3_0_X10.
                     LevelData a_arg) {
        
//#line 400
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 401
a_arg.
                           exchange();
            
//#line 402
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
double d0;
                    
//#line 409
double d1;
                    
//#line 409
double d2;
                    
//#line 409
double d3;
                    
//#line 410
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
                    
//#line 411
d0 =
                      /* template:array_get { */((arg).get(p))/* } */;
                    
//#line 412
d1 =
                      0;
                    
//#line 412
for (
//#line 412
int j =
                                        0;
                                      j <
                                        NPB3_0_X10.
                                          Util.
                                          DIFF1.
                                          length;
                                      
//#line 412
j++) {
                        
//#line 412
d1 +=
                          /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                         Util.
                                                                                                                                                         DIFF1[j])))/* } */;
                    }
                    
//#line 413
d2 =
                      0;
                    
//#line 413
for (
//#line 413
int j =
                                        0;
                                      j <
                                        NPB3_0_X10.
                                          Util.
                                          DIFF2.
                                          length;
                                      
//#line 413
j++) {
                        
//#line 413
d2 +=
                          /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                         Util.
                                                                                                                                                         DIFF2[j])))/* } */;
                    }
                    
//#line 414
d3 =
                      0;
                    
//#line 414
for (
//#line 414
int j =
                                        0;
                                      j <
                                        NPB3_0_X10.
                                          Util.
                                          DIFF3.
                                          length;
                                      
//#line 414
j++) {
                        
//#line 414
d3 +=
                          /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                         Util.
                                                                                                                                                         DIFF3[j])))/* } */;
                    }
                    
//#line 415
/* template:array_set { */(res).set(Pc[0] *
                      d0 +
                      Pc[1] *
                      d1 +
                      Pc[2] *
                      d2 +
                      Pc[3] *
                      d3,pp)/* } */;
                    
//#line 416
if (PERF_On &&
                                       ((!PERF_CommOnly)) &&
                                       PERF_InLoop) {
                        
//#line 416
x10.
                                       lang.
                                       perf.
                                       addLocalOps(
                                       (long)
                                         ((34 *
                                             PERF_Comp)));
                    }
                }/* } */
                }
                /* } */
                
                
//#line 418
if (PERF_On &&
                                   ((!PERF_CommOnly)) &&
                                   ((!PERF_InLoop))) {
                    
//#line 418
x10.
                                   lang.
                                   perf.
                                   addLocalOps(
                                   (long)
                                     ((34 *
                                         PERF_Comp *
                                         R.
                                           size())));
                }
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
        
        
//#line 421
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 421
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
                
//#line 422
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 423
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
                  a_res.
                    getInnerRegion(
                    i).
                    difference(
                    a_res.
                      getINNERRegion(
                      i));
                
//#line 427
/* template:forloop { */
                for (java.util.Iterator pp__ = (R).iterator(); pp__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pp = (x10.
                  lang.
                  point) pp__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 428
double d0;
                    
//#line 428
double d1;
                    
//#line 428
double d2;
                    
//#line 428
double d3;
                    
//#line 429
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
                    
//#line 430
d0 =
                      /* template:array_get { */((arg).get(p))/* } */;
                    
//#line 431
d1 =
                      0;
                    
//#line 431
for (
//#line 431
int j =
                                        0;
                                      j <
                                        NPB3_0_X10.
                                          Util.
                                          DIFF1.
                                          length;
                                      
//#line 431
j++) {
                        
//#line 431
d1 +=
                          /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                         Util.
                                                                                                                                                         DIFF1[j])))/* } */;
                    }
                    
//#line 432
d2 =
                      0;
                    
//#line 432
for (
//#line 432
int j =
                                        0;
                                      j <
                                        NPB3_0_X10.
                                          Util.
                                          DIFF2.
                                          length;
                                      
//#line 432
j++) {
                        
//#line 432
d2 +=
                          /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                         Util.
                                                                                                                                                         DIFF2[j])))/* } */;
                    }
                    
//#line 433
d3 =
                      0;
                    
//#line 433
for (
//#line 433
int j =
                                        0;
                                      j <
                                        NPB3_0_X10.
                                          Util.
                                          DIFF3.
                                          length;
                                      
//#line 433
j++) {
                        
//#line 433
d3 +=
                          /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                         Util.
                                                                                                                                                         DIFF3[j])))/* } */;
                    }
                    
//#line 434
/* template:array_set { */(res).set(Pc[0] *
                      d0 +
                      Pc[1] *
                      d1 +
                      Pc[2] *
                      d2 +
                      Pc[3] *
                      d3,pp)/* } */;
                    
//#line 435
if (PERF_On &&
                                       ((!PERF_CommOnly)) &&
                                       PERF_InLoop) {
                        
//#line 435
x10.
                                       lang.
                                       perf.
                                       addLocalOps(
                                       (long)
                                         ((34 *
                                             PERF_Comp)));
                    }
                }/* } */
                }
                /* } */
                
                
//#line 437
if (PERF_On &&
                                   ((!PERF_CommOnly)) &&
                                   ((!PERF_InLoop))) {
                    
//#line 437
x10.
                                   lang.
                                   perf.
                                   addLocalOps(
                                   (long)
                                     ((34 *
                                         PERF_Comp *
                                         R.
                                           size())));
                }
            }/* } */
            				}
            			});
            	}
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
        
    }
    
    
//#line 441
final void
                   ApplyOpP_Overlapped(
                   final NPB3_0_X10.
                     LevelData a_res,
                   final NPB3_0_X10.
                     LevelData a_arg) {
        
//#line 442
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
                    
//#line 447
x10.
                      lang.
                      region R =
                      a_res.
                        getINNERRegion(
                        i);
                    
//#line 449
/* template:forloop { */
                    for (java.util.Iterator pp__ = (R).iterator(); pp__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point pp = (x10.
                      lang.
                      point) pp__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 450
double d0;
                        
//#line 450
double d1;
                        
//#line 450
double d2;
                        
//#line 450
double d3;
                        
//#line 451
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
                        
//#line 452
d0 =
                          /* template:array_get { */((arg).get(p))/* } */;
                        
//#line 453
d1 =
                          0;
                        
//#line 453
for (
//#line 453
int j =
                                            0;
                                          j <
                                            NPB3_0_X10.
                                              Util.
                                              DIFF1.
                                              length;
                                          
//#line 453
j++) {
                            
//#line 453
d1 +=
                              /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                             Util.
                                                                                                                                                             DIFF1[j])))/* } */;
                        }
                        
//#line 454
d2 =
                          0;
                        
//#line 454
for (
//#line 454
int j =
                                            0;
                                          j <
                                            NPB3_0_X10.
                                              Util.
                                              DIFF2.
                                              length;
                                          
//#line 454
j++) {
                            
//#line 454
d2 +=
                              /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                             Util.
                                                                                                                                                             DIFF2[j])))/* } */;
                        }
                        
//#line 455
d3 =
                          0;
                        
//#line 455
for (
//#line 455
int j =
                                            0;
                                          j <
                                            NPB3_0_X10.
                                              Util.
                                              DIFF3.
                                              length;
                                          
//#line 455
j++) {
                            
//#line 455
d3 +=
                              /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                             Util.
                                                                                                                                                             DIFF3[j])))/* } */;
                        }
                        
//#line 456
/* template:array_set { */(res).set(Pc[0] *
                          d0 +
                          Pc[1] *
                          d1 +
                          Pc[2] *
                          d2 +
                          Pc[3] *
                          d3,pp)/* } */;
                        
//#line 457
if (PERF_On &&
                                           ((!PERF_CommOnly)) &&
                                           PERF_InLoop) {
                            
//#line 457
x10.
                                           lang.
                                           perf.
                                           addLocalOps(
                                           (long)
                                             ((34 *
                                                 PERF_Comp)));
                        }
                    }/* } */
                    }
                    /* } */
                    
                    
//#line 459
if (PERF_On &&
                                       ((!PERF_CommOnly)) &&
                                       ((!PERF_InLoop))) {
                        
//#line 459
x10.
                                       lang.
                                       perf.
                                       addLocalOps(
                                       (long)
                                         ((34 *
                                             PERF_Comp *
                                             R.
                                               size())));
                    }
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
                
//#line 463
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 463
a_arg.
                                   exchange();
                }
                	} catch (Throwable tmp75) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp75);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 465
/* template:ateach { */
                {
                	x10.lang.dist __var27____distCopy = a_res.
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
                    
//#line 466
final x10.
                      lang.
                      DoubleReferenceArray arg =
                      a_arg.
                        getArray(
                        i);
                    
//#line 467
final x10.
                      lang.
                      DoubleReferenceArray res =
                      a_res.
                        getArray(
                        i);
                    
//#line 469
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
                    
//#line 471
/* template:forloop { */
                    for (java.util.Iterator pp__ = (R).iterator(); pp__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point pp = (x10.
                      lang.
                      point) pp__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 472
double d0;
                        
//#line 472
double d1;
                        
//#line 472
double d2;
                        
//#line 472
double d3;
                        
//#line 473
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
                        
//#line 474
d0 =
                          /* template:array_get { */((arg).get(p))/* } */;
                        
//#line 475
d1 =
                          0;
                        
//#line 475
for (
//#line 475
int j =
                                            0;
                                          j <
                                            NPB3_0_X10.
                                              Util.
                                              DIFF1.
                                              length;
                                          
//#line 475
j++) {
                            
//#line 475
d1 +=
                              /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                             Util.
                                                                                                                                                             DIFF1[j])))/* } */;
                        }
                        
//#line 476
d2 =
                          0;
                        
//#line 476
for (
//#line 476
int j =
                                            0;
                                          j <
                                            NPB3_0_X10.
                                              Util.
                                              DIFF2.
                                              length;
                                          
//#line 476
j++) {
                            
//#line 476
d2 +=
                              /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                             Util.
                                                                                                                                                             DIFF2[j])))/* } */;
                        }
                        
//#line 477
d3 =
                          0;
                        
//#line 477
for (
//#line 477
int j =
                                            0;
                                          j <
                                            NPB3_0_X10.
                                              Util.
                                              DIFF3.
                                              length;
                                          
//#line 477
j++) {
                            
//#line 477
d3 +=
                              /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(NPB3_0_X10.
                                                                                                                                                             Util.
                                                                                                                                                             DIFF3[j])))/* } */;
                        }
                        
//#line 478
/* template:array_set { */(res).set(Pc[0] *
                          d0 +
                          Pc[1] *
                          d1 +
                          Pc[2] *
                          d2 +
                          Pc[3] *
                          d3,pp)/* } */;
                        
//#line 479
if (PERF_On &&
                                           ((!PERF_CommOnly)) &&
                                           PERF_InLoop) {
                            
//#line 479
x10.
                                           lang.
                                           perf.
                                           addLocalOps(
                                           (long)
                                             ((34 *
                                                 PERF_Comp)));
                        }
                    }/* } */
                    }
                    /* } */
                    
                    
//#line 481
if (PERF_On &&
                                       ((!PERF_CommOnly)) &&
                                       ((!PERF_InLoop))) {
                        
//#line 481
x10.
                                       lang.
                                       perf.
                                       addLocalOps(
                                       (long)
                                         ((34 *
                                             PERF_Comp *
                                             R.
                                               size())));
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
        	} catch (Throwable tmp74) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp74);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 489
final void
                   applyOpQ(
                   final NPB3_0_X10.
                     LevelData a_res,
                   final NPB3_0_X10.
                     LevelData a_arg,
                   final int a_level) {
        
//#line 490
if (a_level ==
                           P2SLEVEL -
                           1) {
            
//#line 492
final x10.
              lang.
              DoubleReferenceArray arg =
              a_arg.
                getArray(
                0);
            
//#line 493
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 493
/* template:ateach { */
                {
                	x10.lang.dist __var28____distCopy = m_tempLD.
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
                    
//#line 494
x10.
                      lang.
                      DoubleReferenceArray temp =
                      m_tempLD.
                        getArray(
                        i);
                    
//#line 495
NPB3_0_X10.
                                   Util.
                                   arraycopy(
                                   temp,
                                   temp.
                                     region,
                                   arg);
                    
//#line 496
if (i !=
                                       0) {
                        
//#line 497
if (PERF_On &&
                                           ((!PERF_CompOnly))) {
                            
//#line 498
x10.
                                           lang.
                                           perf.
                                           addLocalOps(
                                           (long)
                                             ((PERF_CommL +
                                                 PERF_CommB *
                                                 temp.
                                                   region.
                                                   size())));
                        }
                    }
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp76) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp76);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 500
applyOpQ(
                           a_res,
                           m_tempLD);
        } else {
            
//#line 503
applyOpQ(
                           a_res,
                           a_arg);
        }
    }
    
    
//#line 505
final void
                   applyOpQ(
                   final NPB3_0_X10.
                     LevelData a_res,
                   final NPB3_0_X10.
                     LevelData a_arg) {
        
//#line 506
if (OVERLAPPED) {
            
//#line 507
ApplyOpQ_Overlapped(
                           a_res,
                           a_arg);
        } else {
            
//#line 509
ApplyOpQ(
                           a_res,
                           a_arg);
        }
    }
    
    
//#line 511
final void
                   ApplyOpQ(
                   final NPB3_0_X10.
                     LevelData a_res,
                   final NPB3_0_X10.
                     LevelData a_arg) {
        
//#line 512
if (!EXCHANGE_After) {
            
//#line 512
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 512
a_arg.
                               exchange();
            }
            	} catch (Throwable tmp77) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp77);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
        
//#line 513
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 513
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
                
//#line 514
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 515
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 517
x10.
                  lang.
                  region R =
                  a_arg.
                    getShrinkedRegion(
                    i);
                
//#line 519
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 520
double d;
                    
//#line 521
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
                    
//#line 522
/* template:forloop { */
                    for (java.util.Iterator o__ = (NPB3_0_X10.
                                                     Util.
                                                     UNIT_CUBE).iterator(); o__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point o = (x10.
                      lang.
                      point) o__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 523
d =
                          0;
                        
//#line 524
/* template:forloop { */
                        for (java.util.Iterator q__ = (/* template:parametric { */((x10.
                          lang.
                          region)(/* template:array_get { */((NPB3_0_X10.
                                                                Util.
                                                                QREGIONS).get(o))/* } */))/* } */).iterator(); q__.hasNext(); ) {
                        	final  x10.
                          lang.
                          point q = (x10.
                          lang.
                          point) q__.next();
                        	/* Join: { *//* Join: { *//* } */
{
                            
//#line 524
d +=
                              /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(q)))/* } */;
                        }/* } */
                        }
                        /* } */
                        
                        
//#line 525
/* template:array_set { */(res).set(d /
                          /* template:parametric { */((x10.
                            lang.
                            region)(/* template:array_get { */((NPB3_0_X10.
                                                                  Util.
                                                                  QREGIONS).get(o))/* } */))/* } */.
                            size(),/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pp))/* } */.add(o))/* } */;
                    }/* } */
                    }
                    /* } */
                    
                    
//#line 527
if (PERF_On &&
                                       ((!PERF_CommOnly)) &&
                                       PERF_InLoop) {
                        
//#line 527
x10.
                                       lang.
                                       perf.
                                       addLocalOps(
                                       (long)
                                         ((61.5 *
                                             PERF_Comp)));
                    }
                }/* } */
                }
                /* } */
                
                
//#line 529
if (PERF_On &&
                                   ((!PERF_CommOnly)) &&
                                   ((!PERF_InLoop))) {
                    
//#line 529
x10.
                                   lang.
                                   perf.
                                   addLocalOps(
                                   (long)
                                     ((61.5 *
                                         PERF_Comp *
                                         R.
                                           size())));
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp78) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp78);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 533
final void
                   ApplyOpQ_Overlapped1(
                   final NPB3_0_X10.
                     LevelData a_res,
                   final NPB3_0_X10.
                     LevelData a_arg) {
        
//#line 534
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 535
a_arg.
                           exchange();
            
//#line 536
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
                
//#line 537
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 538
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 540
x10.
                  lang.
                  region R =
                  a_arg.
                    getINNERRegion(
                    i);
                
//#line 542
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 543
double d;
                    
//#line 544
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
                    
//#line 545
/* template:forloop { */
                    for (java.util.Iterator o__ = (NPB3_0_X10.
                                                     Util.
                                                     UNIT_CUBE).iterator(); o__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point o = (x10.
                      lang.
                      point) o__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 546
d =
                          0;
                        
//#line 547
/* template:forloop { */
                        for (java.util.Iterator q__ = (/* template:parametric { */((x10.
                          lang.
                          region)(/* template:array_get { */((NPB3_0_X10.
                                                                Util.
                                                                QREGIONS).get(o))/* } */))/* } */).iterator(); q__.hasNext(); ) {
                        	final  x10.
                          lang.
                          point q = (x10.
                          lang.
                          point) q__.next();
                        	/* Join: { *//* Join: { *//* } */
{
                            
//#line 547
d +=
                              /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(q)))/* } */;
                        }/* } */
                        }
                        /* } */
                        
                        
//#line 548
/* template:array_set { */(res).set(d /
                          /* template:parametric { */((x10.
                            lang.
                            region)(/* template:array_get { */((NPB3_0_X10.
                                                                  Util.
                                                                  QREGIONS).get(o))/* } */))/* } */.
                            size(),/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pp))/* } */.add(o))/* } */;
                    }/* } */
                    }
                    /* } */
                    
                    
//#line 550
if (PERF_On &&
                                       ((!PERF_CommOnly)) &&
                                       PERF_InLoop) {
                        
//#line 550
x10.
                                       lang.
                                       perf.
                                       addLocalOps(
                                       (long)
                                         ((61.5 *
                                             PERF_Comp)));
                    }
                }/* } */
                }
                /* } */
                
                
//#line 552
if (PERF_On &&
                                   ((!PERF_CommOnly)) &&
                                   ((!PERF_InLoop))) {
                    
//#line 552
x10.
                                   lang.
                                   perf.
                                   addLocalOps(
                                   (long)
                                     ((61.5 *
                                         PERF_Comp *
                                         R.
                                           size())));
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp79) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp79);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 555
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 555
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
                
//#line 556
final x10.
                  lang.
                  DoubleReferenceArray arg =
                  a_arg.
                    getArray(
                    i);
                
//#line 557
final x10.
                  lang.
                  DoubleReferenceArray res =
                  a_res.
                    getArray(
                    i);
                
//#line 559
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
                
//#line 561
/* template:forloop { */
                for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 562
double d;
                    
//#line 563
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
                    
//#line 564
/* template:forloop { */
                    for (java.util.Iterator o__ = (NPB3_0_X10.
                                                     Util.
                                                     UNIT_CUBE).iterator(); o__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point o = (x10.
                      lang.
                      point) o__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 565
d =
                          0;
                        
//#line 566
/* template:forloop { */
                        for (java.util.Iterator q__ = (/* template:parametric { */((x10.
                          lang.
                          region)(/* template:array_get { */((NPB3_0_X10.
                                                                Util.
                                                                QREGIONS).get(o))/* } */))/* } */).iterator(); q__.hasNext(); ) {
                        	final  x10.
                          lang.
                          point q = (x10.
                          lang.
                          point) q__.next();
                        	/* Join: { *//* Join: { *//* } */
{
                            
//#line 566
d +=
                              /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(q)))/* } */;
                        }/* } */
                        }
                        /* } */
                        
                        
//#line 567
/* template:array_set { */(res).set(d /
                          /* template:parametric { */((x10.
                            lang.
                            region)(/* template:array_get { */((NPB3_0_X10.
                                                                  Util.
                                                                  QREGIONS).get(o))/* } */))/* } */.
                            size(),/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pp))/* } */.add(o))/* } */;
                    }/* } */
                    }
                    /* } */
                    
                    
//#line 569
if (PERF_On &&
                                       ((!PERF_CommOnly)) &&
                                       PERF_InLoop) {
                        
//#line 569
x10.
                                       lang.
                                       perf.
                                       addLocalOps(
                                       (long)
                                         ((61.5 *
                                             PERF_Comp)));
                    }
                }/* } */
                }
                /* } */
                
                
//#line 571
if (PERF_On &&
                                   ((!PERF_CommOnly)) &&
                                   ((!PERF_InLoop))) {
                    
//#line 571
x10.
                                   lang.
                                   perf.
                                   addLocalOps(
                                   (long)
                                     ((61.5 *
                                         PERF_Comp *
                                         R.
                                           size())));
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp80) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp80);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 575
final void
                   ApplyOpQ_Overlapped(
                   final NPB3_0_X10.
                     LevelData a_res,
                   final NPB3_0_X10.
                     LevelData a_arg) {
        
//#line 576
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 576
/* template:Async { */(x10.lang.Runtime.asPlace(/* template:here { */x10.lang.Runtime.here()/* } */)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 577
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
                    
//#line 578
final x10.
                      lang.
                      DoubleReferenceArray arg =
                      a_arg.
                        getArray(
                        i);
                    
//#line 579
final x10.
                      lang.
                      DoubleReferenceArray res =
                      a_res.
                        getArray(
                        i);
                    
//#line 581
x10.
                      lang.
                      region R =
                      a_arg.
                        getINNERRegion(
                        i);
                    
//#line 583
/* template:forloop { */
                    for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point p = (x10.
                      lang.
                      point) p__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 584
double d;
                        
//#line 585
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
                        
//#line 586
/* template:forloop { */
                        for (java.util.Iterator o__ = (NPB3_0_X10.
                                                         Util.
                                                         UNIT_CUBE).iterator(); o__.hasNext(); ) {
                        	final  x10.
                          lang.
                          point o = (x10.
                          lang.
                          point) o__.next();
                        	/* Join: { *//* Join: { *//* } */
{
                            
//#line 587
d =
                              0;
                            
//#line 588
/* template:forloop { */
                            for (java.util.Iterator q__ = (/* template:parametric { */((x10.
                              lang.
                              region)(/* template:array_get { */((NPB3_0_X10.
                                                                    Util.
                                                                    QREGIONS).get(o))/* } */))/* } */).iterator(); q__.hasNext(); ) {
                            	final  x10.
                              lang.
                              point q = (x10.
                              lang.
                              point) q__.next();
                            	/* Join: { *//* Join: { *//* } */
{
                                
//#line 588
d +=
                                  /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(q)))/* } */;
                            }/* } */
                            }
                            /* } */
                            
                            
//#line 589
/* template:array_set { */(res).set(d /
                              /* template:parametric { */((x10.
                                lang.
                                region)(/* template:array_get { */((NPB3_0_X10.
                                                                      Util.
                                                                      QREGIONS).get(o))/* } */))/* } */.
                                size(),/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pp))/* } */.add(o))/* } */;
                        }/* } */
                        }
                        /* } */
                        
                        
//#line 591
if (PERF_On &&
                                           ((!PERF_CommOnly)) &&
                                           PERF_InLoop) {
                            
//#line 591
x10.
                                           lang.
                                           perf.
                                           addLocalOps(
                                           (long)
                                             ((61.5 *
                                                 PERF_Comp)));
                        }
                    }/* } */
                    }
                    /* } */
                    
                    
//#line 593
if (PERF_On &&
                                       ((!PERF_CommOnly)) &&
                                       ((!PERF_InLoop))) {
                        
//#line 593
x10.
                                       lang.
                                       perf.
                                       addLocalOps(
                                       (long)
                                         ((61.5 *
                                             PERF_Comp *
                                             R.
                                               size())));
                    }
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
                
//#line 597
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 597
a_arg.
                                   exchange();
                }
                	} catch (Throwable tmp82) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp82);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 599
/* template:ateach { */
                {
                	x10.lang.dist __var33____distCopy = a_res.
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
                    
//#line 600
final x10.
                      lang.
                      DoubleReferenceArray arg =
                      a_arg.
                        getArray(
                        i);
                    
//#line 601
final x10.
                      lang.
                      DoubleReferenceArray res =
                      a_res.
                        getArray(
                        i);
                    
//#line 603
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
                    
//#line 605
/* template:forloop { */
                    for (java.util.Iterator p__ = (R).iterator(); p__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point p = (x10.
                      lang.
                      point) p__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 606
double d;
                        
//#line 607
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
                        
//#line 608
/* template:forloop { */
                        for (java.util.Iterator o__ = (NPB3_0_X10.
                                                         Util.
                                                         UNIT_CUBE).iterator(); o__.hasNext(); ) {
                        	final  x10.
                          lang.
                          point o = (x10.
                          lang.
                          point) o__.next();
                        	/* Join: { *//* Join: { *//* } */
{
                            
//#line 609
d =
                              0;
                            
//#line 610
/* template:forloop { */
                            for (java.util.Iterator q__ = (/* template:parametric { */((x10.
                              lang.
                              region)(/* template:array_get { */((NPB3_0_X10.
                                                                    Util.
                                                                    QREGIONS).get(o))/* } */))/* } */).iterator(); q__.hasNext(); ) {
                            	final  x10.
                              lang.
                              point q = (x10.
                              lang.
                              point) q__.next();
                            	/* Join: { *//* Join: { *//* } */
{
                                
//#line 610
d +=
                                  /* template:array_get { */((arg).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(q)))/* } */;
                            }/* } */
                            }
                            /* } */
                            
                            
//#line 611
/* template:array_set { */(res).set(d /
                              /* template:parametric { */((x10.
                                lang.
                                region)(/* template:array_get { */((NPB3_0_X10.
                                                                      Util.
                                                                      QREGIONS).get(o))/* } */))/* } */.
                                size(),/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pp))/* } */.add(o))/* } */;
                        }/* } */
                        }
                        /* } */
                        
                        
//#line 613
if (PERF_On &&
                                           ((!PERF_CommOnly)) &&
                                           PERF_InLoop) {
                            
//#line 613
x10.
                                           lang.
                                           perf.
                                           addLocalOps(
                                           (long)
                                             ((61.5 *
                                                 PERF_Comp)));
                        }
                    }/* } */
                    }
                    /* } */
                    
                    
//#line 615
if (PERF_On &&
                                       ((!PERF_CommOnly)) &&
                                       ((!PERF_InLoop))) {
                        
//#line 615
x10.
                                       lang.
                                       perf.
                                       addLocalOps(
                                       (long)
                                         ((61.5 *
                                             PERF_Comp *
                                             R.
                                               size())));
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
        	} catch (Throwable tmp81) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp81);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 620
final public double
                   MGSolve(
                   final NPB3_0_X10.
                     LevelData a_u,
                   final NPB3_0_X10.
                     LevelData a_v,
                   final int a_its) {
        
//#line 621
int l =
          m_levels -
          1;
        
//#line 622
m_r[l].
                       set(
                       a_v);
        
//#line 622
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("The init residual norm is " +
                                                                                                                          m_r[l].
                                                                                                                            norm2());
        
//#line 623
double res =
          0.0;
        
//#line 624
for (
//#line 624
int i =
                            0;
                          i <
                            a_its;
                          
//#line 624
i++) {
            
//#line 625
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("Iteration " +
                                                                                                                              i);
            
//#line 626
MG();
            
//#line 627
a_u.
                           add(
                           m_z[l]);
            
//#line 628
computeResidual(
                           m_r[l],
                           a_v,
                           a_u);
            
//#line 629
res =
              m_r[l].
                norm2();
            
//#line 630
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("The residual norm is " +
                                                                                                                              res);
        }
        
//#line 632
return res;
    }
    
    
//#line 636
final void
                   MG(
                   ) {
        
//#line 637
for (
//#line 637
int i =
                            m_levels -
                            1;
                          i >
                            0;
                          
//#line 637
i--) {
            
//#line 637
applyOpP(
                           m_r[i -
                                 1],
                           m_r[i],
                           i);
        }
        
//#line 638
m_z[0].
                       set(
                       0);
        
//#line 638
smooth(
                       m_z[0],
                       m_r[0],
                       true);
        
//#line 640
for (
//#line 640
int i =
                            1;
                          i <
                            m_levels;
                          
//#line 640
i++) {
            
//#line 641
applyOpQ(
                           m_z[i],
                           m_z[i -
                                 1],
                           i -
                             1);
            
//#line 642
computeResidual(
                           m_r[i],
                           m_z[i]);
            
//#line 643
smooth(
                           m_z[i],
                           m_r[i],
                           false);
        }
    }
    
    
//#line 647
final double
                   residualNorm(
                   ) {
        
//#line 648
int l =
          m_levels -
          1;
        
//#line 649
return m_r[l].
                              norm2();
    }
    
    
//#line 652
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
        
//#line 664
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("This is MGOP, finished!");
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
}
