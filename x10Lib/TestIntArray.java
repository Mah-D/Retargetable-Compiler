import x10.lang.*;

public class TestIntArray
extends x10.
  lang.
  Object
{
    
//#line 4
final public static x10.
      lang.
      region
      myDummyRegion =
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
          x10.
            lang.
            place.
            MAX_PLACES -
            1));
    
    
//#line 5
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
        
//#line 7
/* template:place-check { */((TestIntArray) x10.lang.Runtime.hereCheck(new TestIntArray(
          )))/* } */.run();
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 9
public boolean
                 run(
                 ) {
        
//#line 11
int valueInsideArray =
          5;
        
//#line 12
Dist myDist =
          new Dist(
          (x10.
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
                0,
                1)),
          /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 13
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 14
myDist =
          new Dist(
            myDist,
            2,
            3,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 15
myDist =
          new Dist(
            myDist,
            4,
            5,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 16
myDist =
          new Dist(
            myDist,
            6,
            7,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 19
final IntArray myIntArray =
          new IntArray(
          myDummyRegion,
          myDist,
          new DistRun(
            ));
        
//#line 22
/* template:forloop-mult { */{
        x10.lang.region __var4__ = (x10.lang.region) x10.
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
                                                         7));
        if (__var4__.size() > 0 && (__var4__ instanceof x10.array.MultiDimRegion || __var4__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var5__ = __var4__.rank(0).low(), __var6__ = __var4__.rank(0).high(); __var5__ <= __var6__; __var5__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int p = __var5__;
        /* } */
        /* } */
{
            
//#line 23
x10.
              lang.
              place innerPlace =
              DistRun.
                getPlaceFromDist(
                myDist,
                p);
            
//#line 25
/* template:Async { */(x10.lang.Runtime.asPlace(innerPlace)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 27
myIntArray.
                              intSetValue(
                              myIntArray,
                              p,
                              /* template:here { */x10.lang.Runtime.here()/* } */,
                              p);
            }
            		}
            	});/* } */
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var0____ = (__var4__).iterator(); __var0____.hasNext(); ) {
        	final  x10.
          lang.
          point __var0__ = (x10.
          lang.
          point) __var0____.next();
        	/* Join: { *//* Join: { */final int p =
          /* template:array_get { */((__var0__).get(0))/* } */;/* } */
{
            
//#line 23
x10.
              lang.
              place innerPlace =
              DistRun.
                getPlaceFromDist(
                myDist,
                p);
            
//#line 25
/* template:Async { */(x10.lang.Runtime.asPlace(innerPlace)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 27
myIntArray.
                              intSetValue(
                              myIntArray,
                              p,
                              /* template:here { */x10.lang.Runtime.here()/* } */,
                              p);
            }
            		}
            	});/* } */
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 31
final x10.
          lang.
          dist dTemp =
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
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 32
final x10.
          lang.
          IntReferenceArray t =
          (x10.
            lang.
            IntReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dTemp,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
             	public int apply(/* Join: { */x10.
               lang.
               point p/* } */, int dummy) { {
                 
//#line 32
return 0;
             } }
             }/* } */,true,true,false)/* } */);
        
//#line 33
/* template:forloop-mult { */{
        x10.lang.region __var7__ = (x10.lang.region) x10.
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
                                                         7));
        if (__var7__.size() > 0 && (__var7__ instanceof x10.array.MultiDimRegion || __var7__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var8__ = __var7__.rank(0).low(), __var9__ = __var7__.rank(0).high(); __var8__ <= __var9__; __var8__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int p = __var8__;
        /* } */
        /* } */
{
            
//#line 34
x10.
              lang.
              place innerPlace =
              DistRun.
                getPlaceFromDist(
                myDist,
                p);
            
//#line 36
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 37
/* template:Async { */(x10.lang.Runtime.asPlace(innerPlace)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 39
final int tempVal =
                      myIntArray.
                        intGetValue(
                        myIntArray,
                        p,
                        /* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 40
/* template:Async { */(x10.lang.Runtime.asPlace(pl)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 42
/* template:array_set { */(t).addSet(tempVal,0)/* } */;
                    }
                    		}
                    	});/* } */
                }
                		}
                	});/* } */
            }
            	} catch (Throwable tmp10) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp10);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var1____ = (__var7__).iterator(); __var1____.hasNext(); ) {
        	final  x10.
          lang.
          point __var1__ = (x10.
          lang.
          point) __var1____.next();
        	/* Join: { *//* Join: { */final int p =
          /* template:array_get { */((__var1__).get(0))/* } */;/* } */
{
            
//#line 34
x10.
              lang.
              place innerPlace =
              DistRun.
                getPlaceFromDist(
                myDist,
                p);
            
//#line 36
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 37
/* template:Async { */(x10.lang.Runtime.asPlace(innerPlace)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 39
final int tempVal =
                      myIntArray.
                        intGetValue(
                        myIntArray,
                        p,
                        /* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 40
/* template:Async { */(x10.lang.Runtime.asPlace(pl)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 42
/* template:array_set { */(t).addSet(tempVal,0)/* } */;
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
            
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 47
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println(/* template:array_get { */((t).get(0))/* } */);
        
//#line 51
return true;
    }
    
    
//#line 2
public TestIntArray() {
        
//#line 1
super();
    }
}

class IntArray
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 60
final public x10.
      lang.
      GenericReferenceArray
      contents;
    
//#line 61
final public Dist
      distArray;
    
//#line 62
final public DistRun
      distRun;
    
    
//#line 63
public IntArray(final x10.
                                  lang.
                                  region myDummyRegion,
                                final Dist myDistArray,
                                final DistRun myDR) {
        
//#line 64
super();
        
//#line 65
distRun =
          myDR;
        
//#line 66
distArray =
          myDistArray;
        
//#line 67
contents =
          initilizeTO(
            myDummyRegion);
    }
    
    
//#line 72
public x10.
                  lang.
                  GenericReferenceArray
                  initilizeTO(
                  final x10.
                    lang.
                    region myDummyRegion) {
        
//#line 75
final x10.
          lang.
          dist myDistribution =
          x10.
            lang.
            dist.
            factory.
            constant(
            myDummyRegion,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 76
x10.
          lang.
          GenericReferenceArray temp =
          (x10.
            lang.
            GenericReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(myDummyRegion.
                                                                                                                          toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
             	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
               lang.
               point __var2__/* } */, x10.compilergenerated.Parameter1 dummy) { {
                 
//#line 76
final int p =
                   /* template:array_get { */((__var2__).get(0))/* } */;
                 
//#line 76
return newIntTO(
                                      p,
                                      myDummyRegion,
                                      /* template:array_get { */((distArray.
                                                                    counts).get(p))/* } */);
             } }
             }/* } */,true,false,true)/* } */);
        
//#line 77
return temp;
    }
    
    
//#line 82
public IntTO
                  newIntTO(
                  final int myPoint,
                  final x10.
                    lang.
                    region myDummyRegion,
                  final int sizeOfChunk) {
        
//#line 87
final x10.
          lang.
          dist dis =
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
                sizeOfChunk -
                  1)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 88
final x10.
          lang.
          place pl =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 91
final x10.
          lang.
          dist tempDis =
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
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 92
final x10.
          lang.
          GenericReferenceArray temp =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(tempDis,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 93
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 95
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                          lang.
                                                                          place.
                                                                          places(
                                                                          myPoint))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 96
final IntTO to =
                  new IntTO(
                  sizeOfChunk -
                    1);
                
//#line 99
/* template:Async { */(x10.lang.Runtime.asPlace(pl)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 100
/* template:array_set { */(temp).set(to,0)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp12) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp12);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 104
final IntTO to =
          /* template:parametric { */((IntTO)(/* template:array_get { */((temp).get(0))/* } */))/* } */;
        
//#line 105
return to;
    }
    
    
//#line 110
public int
                   intGetValue(
                   final IntArray myIntArray,
                   int index,
                   final x10.
                     lang.
                     place pl) {
        
//#line 111
final int placeIndex =
          pl.
            id;
        
//#line 113
final IntTO myIntTo =
          /* template:parametric { */((IntTO)(/* template:array_get { */((myIntArray.
                                                                            contents).get(placeIndex))/* } */))/* } */;
        
//#line 114
final x10.
          lang.
          IntReferenceArray disArray =
          myIntTo.
            localArray;
        
//#line 115
final Dist myDist =
          myIntArray.
            distArray;
        
//#line 116
final int localIndex =
          DistRun.
            getLocalIndex(
            myDist,
            index);
        
//#line 117
final int returnValue =
          /* template:array_get { */((disArray).get(localIndex))/* } */;
        
//#line 118
return returnValue;
    }
    
    
//#line 123
public void
                   intSetValue(
                   final IntArray myIntArray,
                   int index,
                   final x10.
                     lang.
                     place pl,
                   int value) {
        
//#line 124
final int placeIndex =
          pl.
            id;
        
//#line 126
final IntTO myIntTo =
          /* template:parametric { */((IntTO)(/* template:array_get { */((myIntArray.
                                                                            contents).get(placeIndex))/* } */))/* } */;
        
//#line 128
final x10.
          lang.
          IntReferenceArray disArray =
          myIntTo.
            localArray;
        
//#line 129
final Dist myDist =
          myIntArray.
            distArray;
        
//#line 131
final int localIndex =
          DistRun.
            getLocalIndex(
            myDist,
            index);
        
//#line 132
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println(localIndex);
        
//#line 133
/* template:array_set { */(disArray).set(value,localIndex)/* } */;
    }
}

class IntTO
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 140
final public x10.
      lang.
      IntReferenceArray
      localArray;
    
    
//#line 141
public IntTO(final int size) {
        
//#line 141
super();
        
//#line 142
localArray =
          setArrayElementsToZero(
            size);
    }
    
    
//#line 145
public x10.
                   lang.
                   IntReferenceArray
                   setArrayElementsToZero(
                   final int size) {
        
//#line 147
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
                size)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 148
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("here?  " +
                                                                                                                          (/* template:here { */x10.lang.Runtime.here()/* } */));
        
//#line 149
x10.
          lang.
          IntReferenceArray temp =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point __var3__/* } */, int dummy) { {
            
//#line 149
final int p =
              /* template:array_get { */((__var3__).get(0))/* } */;
            
//#line 149
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 150
return temp;
    }
}
