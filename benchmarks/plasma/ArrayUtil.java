import x10.lang.*;

public class ArrayUtil
extends x10.
  lang.
  Object
{
    
    
//#line 14
public static x10.
                  lang.
                  GenericReferenceArray
                  doubleToComplex(
                  final x10.
                    lang.
                    DoubleReferenceArray src) {
        
//#line 19
final x10.
          lang.
          region rSrc =
          src.
            region;
        
//#line 20
final x10.
          lang.
          region rS2 =
          X10Util.
            getRank2D(
            rSrc,
            1);
        
//#line 22
if (rS2.
                          size() %
                          2 !=
                          0) {
            
//#line 23
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                        lang.
                                                                                                        System.
                                                                                                        err))/* } */.println("Error: doubleToComplex requires the second " +
                                                                                                                             "dimension to be of even size");
            
//#line 25
final x10.
              lang.
              dist dResult =
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
                      emptyRegion(
                      2),
                    /* template:here { */x10.lang.Runtime.here()/* } */)));
            
//#line 27
return /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dResult,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        }
        
//#line 29
final x10.
          lang.
          region rD2 =
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
              rS2.
                size() /
                2 -
                1));
        
//#line 30
final x10.
          lang.
          dist dSrc =
          src.
            distribution;
        
//#line 33
final x10.
          lang.
          dist dResult =
          X10Util.
            extendDistRank2D(
            X10Util.
              get2DDistRank(
              dSrc,
              0),
            rD2);
        
//#line 35
final x10.
          lang.
          GenericReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dResult,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 37
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 37
/* template:ateach { */
            {
            	x10.lang.dist pt__distCopy = dResult; // make copy to avoid recomputation
            	for (java.util.Iterator pt__ = pt__distCopy.iterator();
            		 pt__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pt = (x10.
              lang.
              point) pt__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pt__distCopy.get(pt)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 38
/* template:array_set { */(result).set(new Complex(
                  /* template:array_get { */((src).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pt))/* } */.mul(x10.
                                                                                                                                                  lang.
                                                                                                                                                  point.
                                                                                                                                                  factory.
                                                                                                                                                  point(
                                                                                                                                                  1,
                                                                                                                                                  2))))/* } */,
                  /* template:array_get { */((src).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pt))/* } */.mul(x10.
                                                                                                                                                                                                                           lang.
                                                                                                                                                                                                                           point.
                                                                                                                                                                                                                           factory.
                                                                                                                                                                                                                           point(
                                                                                                                                                                                                                           1,
                                                                                                                                                                                                                           2))))/* } */.add(x10.
                                                                                                                                                                                                                                              lang.
                                                                                                                                                                                                                                              point.
                                                                                                                                                                                                                                              factory.
                                                                                                                                                                                                                                              point(
                                                                                                                                                                                                                                              0,
                                                                                                                                                                                                                                              1))))/* } */),pt)/* } */;
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp224) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp224);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 41
return result;
    }
    
    
//#line 49
public static x10.
                  lang.
                  DoubleReferenceArray
                  complexToDouble(
                  final x10.
                    lang.
                    GenericReferenceArray src) {
        
//#line 52
final x10.
          lang.
          region rSrc =
          src.
            region;
        
//#line 53
final x10.
          lang.
          region rS2 =
          X10Util.
            getRank2D(
            rSrc,
            1);
        
//#line 54
final x10.
          lang.
          region rD2 =
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
              2 *
                rS2.
                  size() -
                1));
        
//#line 55
final x10.
          lang.
          dist dSrc =
          src.
            distribution;
        
//#line 56
final x10.
          lang.
          dist dResult =
          X10Util.
            extendDistRank2D(
            X10Util.
              get2DDistRank(
              dSrc,
              0),
            rD2);
        
//#line 59
final x10.
          lang.
          DoubleReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dResult,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 61
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 61
/* template:ateach { */
            {
            	x10.lang.dist pt__distCopy = dResult; // make copy to avoid recomputation
            	for (java.util.Iterator pt__ = pt__distCopy.iterator();
            		 pt__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pt = (x10.
              lang.
              point) pt__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pt__distCopy.get(pt)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 62
final x10.
                  lang.
                  point ptd2 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pt))/* } */.div(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1,
                                                                                                             2));
                
//#line 63
if (/* template:array_get { */((pt).get(1))/* } */ %
                                  2 ==
                                  0) {
                    
//#line 64
/* template:array_set { */(result).set(/* template:parametric { */((Complex)(/* template:array_get { */((src).get(ptd2))/* } */))/* } */.
                                                                         getReal(),pt)/* } */;
                } else {
                    
//#line 66
/* template:array_set { */(result).set(/* template:parametric { */((Complex)(/* template:array_get { */((src).get(ptd2))/* } */))/* } */.
                                                                         getImag(),pt)/* } */;
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp225) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp225);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 70
return result;
    }
    
    
//#line 133
public static x10.
                   lang.
                   GenericReferenceArray
                   transpose(
                   final x10.
                     lang.
                     GenericReferenceArray data) {
        
//#line 135
final x10.
          lang.
          dist dData =
          (x10.
            lang.
            dist)
            data.
              distribution;
        
//#line 136
if (!X10Util.
                            isDistBlockStar(
                            dData)) {
            
//#line 137
X10Util.
                           println(
                           "Transpose only works on star block" +
                           "distributed arrays");
            
//#line 139
throw new java.
              lang.
              RuntimeException(
              "transpose: " +
              data.
                distribution);
        }
        
//#line 143
final x10.
          lang.
          dist dResult =
          X10Util.
            transposeBlockStar(
            dData);
        
//#line 147
final x10.
          lang.
          GenericReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dResult,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 148
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 148
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 149
final x10.
                  lang.
                  region rLocal =
                  X10Util.
                    get2DLRegion(
                    dData);
                
//#line 150
final x10.
                  lang.
                  region rTtmp =
                  X10Util.
                    transposeRegion(
                    rLocal);
                
//#line 152
if (rLocal.
                                   size() >
                                   0) {
                    
//#line 154
final x10.
                      lang.
                      region rTtmp1 =
                      X10Util.
                        getRank2D(
                        rTtmp,
                        0);
                    
//#line 155
final x10.
                      lang.
                      region rTtmp2 =
                      X10Util.
                        getRank2D(
                        rTtmp,
                        1);
                    
//#line 156
final x10.
                      lang.
                      region rLocalT =
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
                          rTtmp1.
                            low(),
                          rTtmp1.
                            high()),
                        x10.
                          lang.
                          region.
                          factory.
                          region(
                          rTtmp2.
                            low(),
                          rTtmp2.
                            high()));
                    
//#line 161
final x10.
                      lang.
                      region rRSBuffer =
                      (x10.
                        lang.
                        region)
                        x10.
                          lang.
                          dist.
                          UNIQUE.
                          region;
                    
//#line 162
final x10.
                      lang.
                      GenericReferenceArray rSBuffer =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(rRSBuffer.
                                                                                                                                      toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                         	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                           lang.
                           point p/* } */, x10.compilergenerated.Parameter1 dummy) { {
                             
//#line 166
final x10.
                               lang.
                               region rTLocal =
                               (x10.
                                 lang.
                                 region)
                                 ((dResult.
                                     restriction(
                                     x10.
                                       lang.
                                       dist.
                                       UNIQUE.
                                       get(
                                       p)))).
                                   region;
                             
//#line 169
return rLocalT.
                                                   intersection(
                                                   rTLocal);
                         } }
                         }/* } */,true,false,true)/* } */);
                    
//#line 173
final x10.
                      lang.
                      GenericReferenceArray sBuffer =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(rLocalT.
                                                                                                                                      toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                         	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                           lang.
                           point __var71__/* } */, x10.compilergenerated.Parameter1 dummy) { {
                             
//#line 175
final int i =
                               /* template:array_get { */((__var71__).get(0))/* } */;
                             
//#line 175
final int j =
                               /* template:array_get { */((__var71__).get(1))/* } */;
                             
//#line 176
return /* template:parametric { */((Complex)(/* template:array_get { */((data).get(/* Join: { */j,i/* } */))/* } */))/* } */;
                         } }
                         }/* } */,true,false,true)/* } */);
                    
//#line 180
/* template:foreach { */
                    for (java.util.Iterator i__ = (rSBuffer.
                                                     distribution).iterator(); i__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point i = (x10.
                      lang.
                      point) i__.next();
                    	/* Join: { *//* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { *//* } */
{
                        
//#line 181
/* template:ateach { */
                        {
                        	x10.lang.dist pt__distCopy = x10.
                                                        lang.
                                                        dist.
                                                        factory.
                                                        constant(
                                                        /* template:parametric { */((x10.
                                                          lang.
                                                          region)(/* template:array_get { */((rSBuffer).get(i))/* } */))/* } */,
                                                        x10.
                                                          lang.
                                                          dist.
                                                          UNIQUE.
                                                          get(
                                                          i)); // make copy to avoid recomputation
                        	for (java.util.Iterator pt__ = pt__distCopy.iterator();
                        		 pt__.hasNext(); )
                        	{
                        		final  x10.
                          lang.
                          point pt = (x10.
                          lang.
                          point) pt__.next();
                        		/* Join: { *//* } */
                        		((x10.runtime.Place) pt__distCopy.get(pt)).runAsync
                        			(new x10.runtime.Activity() {
                        				public void runX10Task() {
                        					/* Join: { *//* Join: { *//* } */
{
                            
//#line 182
/* template:array_set { */(result).set(/* template:parametric { */((Complex)(/* template:array_get { */((sBuffer).get(pt))/* } */))/* } */,pt)/* } */;
                        }/* } */
                        				}
                        			});
                        	}
                        }
                        /* } */
                        
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp226) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp226);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 187
return result;
    }
    
    
//#line 7
public ArrayUtil() {
        
//#line 7
super();
    }
}
