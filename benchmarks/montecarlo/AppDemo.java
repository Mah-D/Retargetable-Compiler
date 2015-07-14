import x10.lang.*;

public class AppDemo
extends x10.
  lang.
  Object
{
    
//#line 2
private x10.
      lang.
      dist
      D;
    
//#line 3
final private x10.
      lang.
      DoubleReferenceArray
      expectedReturnRate;
    
//#line 4
final private x10.
      lang.
      DoubleReferenceArray
      volatility;
    
//#line 5
private x10.
      lang.
      GenericReferenceArray
      tasks;
    
//#line 6
final public x10.
      lang.
      DoubleReferenceArray
      result;
    
//#line 8
public ToInitAllTasks
      initAllTasks;
    
//#line 10
public PriceStock
      psMC;
    
//#line 13
public double
      aExpectedReturnRateMC;
    
//#line 14
public double
      aVolatilityMC;
    
//#line 15
public int
      nTimeStepsMC;
    
//#line 16
public int
      nRunsMC;
    
//#line 17
public boolean
      initialised;
    
    
//#line 20
public AppDemo(final int nTimeStepsMC0,
                               final int nRunsMC0) {
        
//#line 20
super();
        
//#line 21
x10.
          lang.
          dist dResult =
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
        
//#line 22
result =
          getDoubleArray(
            dResult);
        
//#line 23
nTimeStepsMC =
          nTimeStepsMC0;
        
//#line 24
nRunsMC =
          nRunsMC0;
        
//#line 25
initialised =
          false;
        
//#line 26
final x10.
          lang.
          dist tempD =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 26
public x10.
                            lang.
                            dist
                            checkCast(
                            final x10.
                              lang.
                              dist x10_generated_objToCast) {
                  
//#line 26
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
                  (nRunsMC0 -
                     1)))));
        
//#line 27
D =
          tempD;
        
//#line 28
expectedReturnRate =
          getDoubleArray(
            tempD);
        
//#line 29
volatility =
          getDoubleArray(
            tempD);
        
//#line 31
final double pathStartValue =
          100.0;
        
//#line 32
aExpectedReturnRateMC =
          0.0;
        
//#line 33
aVolatilityMC =
          0.0;
        
//#line 36
RatePath rateP =
          new RatePath(
          );
        
//#line 37
ReturnPath returnP =
          /* template:place-check { */((RatePath) x10.lang.Runtime.hereCheck(rateP))/* } */.getReturnCompounded();
        
//#line 38
/* template:place-check { */((ReturnPath) x10.lang.Runtime.hereCheck(returnP))/* } */.estimatePath();
        
//#line 40
double eRR =
          /* template:place-check { */((ReturnPath) x10.lang.Runtime.hereCheck(returnP))/* } */.getExpectedReturnRate();
        
//#line 41
double vol =
          /* template:place-check { */((ReturnPath) x10.lang.Runtime.hereCheck(returnP))/* } */.getVolatility();
        
//#line 43
initAllTasks =
          new ToInitAllTasks(
            returnP,
            nTimeStepsMC0,
            pathStartValue);
        
//#line 44
initTasks(
                      nRunsMC0,
                      tempD);
    }
    
    
//#line 47
public x10.
                  lang.
                  DoubleReferenceArray
                  getDoubleArray(
                  final x10.
                    lang.
                    dist d) {
        
//#line 48
return /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
    }
    
    
//#line 51
public void
                  runSerial(
                  ) {
        
//#line 52
final ToInitAllTasks t =
          initAllTasks;
        
//#line 53
final x10.
          lang.
          GenericReferenceArray mytasks =
          tasks;
        
//#line 54
final x10.
          lang.
          DoubleReferenceArray myexpectedReturnRate =
          expectedReturnRate;
        
//#line 55
final x10.
          lang.
          DoubleReferenceArray myvolatility =
          volatility;
        
//#line 56
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 56
/* template:ateach { */
            {
            	x10.lang.dist i__distCopy = expectedReturnRate.
                                           distribution; // make copy to avoid recomputation
            	for (java.util.Iterator i__ = i__distCopy.iterator();
            		 i__.hasNext(); )
            	{
            		final  x10.
              lang.
              point i = (x10.
              lang.
              point) i__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) i__distCopy.get(i)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 57
final PriceStock ps =
                  new PriceStock(
                  );
                
//#line 58
/* template:place-check { */((PriceStock) x10.lang.Runtime.hereCheck(ps))/* } */.setInitAllTasks(t);
                
//#line 59
/* template:place-check { */((PriceStock) x10.lang.Runtime.hereCheck(ps))/* } */.setTask(/* template:parametric { */((ToTask)(/* template:array_get { */((mytasks).get(i))/* } */))/* } */);
                
//#line 60
/* template:place-check { */((PriceStock) x10.lang.Runtime.hereCheck(ps))/* } */.run();
                
//#line 61
ToResult r =
                  /* template:place-check { */((PriceStock) x10.lang.Runtime.hereCheck(ps))/* } */.getResult();
                
//#line 62
/* template:array_set { */(myexpectedReturnRate).set(/* template:place-check { */((ToResult) x10.lang.Runtime.hereCheck(r))/* } */.getExpectedReturnRate(),i)/* } */;
                
//#line 63
/* template:array_set { */(myvolatility).set(/* template:place-check { */((ToResult) x10.lang.Runtime.hereCheck(r))/* } */.getVolatility(),i)/* } */;
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
    
    
//#line 67
public void
                  presults(
                  ) {
        
//#line 68
processResults();
    }
    
    
//#line 71
private void
                  initTasks(
                  final int nRunsMC,
                  final x10.
                    lang.
                    dist aD) {
        
//#line 72
tasks =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(aD,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
             lang.
             point p/* } */, x10.compilergenerated.Parameter1 dummy) { {
               
//#line 73
return new ToTask(
                 (long)
                   /* template:array_get { */((p).get(0))/* } */ *
                   11);
           } }
           }/* } */,true,true,false)/* } */);
    }
    
    
//#line 77
public void
                  processResults(
                  ) {
        
//#line 78
final double avgERRMC =
          expectedReturnRate.
            sum() /
          nRunsMC;
        
//#line 79
final double aveVol =
          volatility.
            sum() /
          nRunsMC;
        
//#line 81
/* template:array_set { */(result).set(avgERRMC,0)/* } */;
    }
}
