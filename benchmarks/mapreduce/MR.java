import x10.lang.*;

public class MR
extends x10.
  lang.
  Object
{
    
//#line 2
final public static x10.
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
          300000));
    
//#line 4
public x10.
      lang.
      IntReferenceArray
      a;
    
//#line 5
public int
      total;
    
    
//#line 7
public MR() {
        
//#line 7
super();
        
//#line 8
final x10.
          lang.
          dist d =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 8
public x10.
                           lang.
                           dist
                           checkCast(
                           final x10.
                             lang.
                             dist x10_generated_objToCast) {
                  
//#line 8
return (((((((x10.
                                            lang.
                                            dist)
                                            x10_generated_objToCast)).
                                          rank() ==
                                          1)))
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
              r));
        
//#line 9
a =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public int apply(/* Join: { */x10.
             lang.
             point p/* } */, int dummy) { {
               
//#line 9
return /* template:array_get { */((p).get(0))/* } */;
           } }
           }/* } */,true,true,false)/* } */);
        
//#line 10
total =
          0;
    }
    
    
//#line 13
public void
                  run(
                  ) {
        
//#line 14
map();
        
//#line 14
reduce();
        
//#line 14
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println(total);
    }
    
    
//#line 16
public void
                  map(
                  ) {
        
//#line 17
final x10.
          lang.
          IntReferenceArray b =
          a;
        
//#line 18
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 18
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
                
//#line 19
/* template:array_set { */(b).set(f(
                                                                /* template:array_get { */((b).get(p))/* } */),p)/* } */;
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp0) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp0);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 22
public int
                  f(
                  final int x) {
        
//#line 22
return x *
          x;
    }
    
    
//#line 23
public void
                  reduce(
                  ) {
        
//#line 24
final x10.
          lang.
          place h =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 25
final x10.
          lang.
          region reg =
          a.
            region;
        
//#line 26
final x10.
          lang.
          dist dis =
          x10.
            lang.
            dist.
            factory.
            constant(
            reg,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 27
final x10.
          lang.
          IntReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dis,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 30
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
            
//#line 31
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 32
final x10.
                  lang.
                  IntReferenceArray c =
                  a;
                
//#line 33
/* template:Async { */(x10.lang.Runtime.asPlace(a.
                                                                              distribution.
                                                                              get(
                                                                              p))).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 34
final int v =
                      /* template:array_get { */((c).get(p))/* } */;
                    
//#line 35
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 36
/* template:array_set { */(result).set(v,p)/* } */;
                    }
                    		}
                    	});/* } */
                }
                		}
                	});/* } */
            }
            	} catch (Throwable tmp1) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp1);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
        
//#line 42
/* template:forloop { */
        for (java.util.Iterator p__ = (result.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 43
total =
              total +
                /* template:array_get { */((result).get(p))/* } */;
        }/* } */
        }
        /* } */
        
    }
}
