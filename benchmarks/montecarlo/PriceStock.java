import x10.lang.*;

public class PriceStock
extends x10.
  lang.
  Object
{
    
//#line 2
final private MonteCarloPath
      mcPath;
    
//#line 3
private long
      randomSeed;
    
//#line 4
private double
      pathStartValue;
    
//#line 5
private double
      expectedReturnRate;
    
//#line 6
private double
      volatility;
    
//#line 7
private double
      volatility2;
    
//#line 8
private double
      finalStockPrice;
    
//#line 9
private x10.
      lang.
      DoubleReferenceArray
      pathValue;
    
    
//#line 11
public PriceStock() {
        
//#line 11
super();
        
//#line 12
randomSeed =
          -1;
        
//#line 13
mcPath =
          new MonteCarloPath(
            );
    }
    
    
//#line 16
public void
                  setInitAllTasks(
                  final ToInitAllTasks initAllTasks) {
        
//#line 17
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 18
/* template:place-check { */((MonteCarloPath) x10.lang.Runtime.hereCheck(mcPath))/* } */.setDTime(initAllTasks.
                                                                                                                            getDTime());
            
//#line 19
/* template:place-check { */((MonteCarloPath) x10.lang.Runtime.hereCheck(mcPath))/* } */.setReturnDefinition(initAllTasks.
                                                                                                                                       getReturnDefinition());
            
//#line 20
/* template:place-check { */((MonteCarloPath) x10.lang.Runtime.hereCheck(mcPath))/* } */.setExpectedReturnRate(initAllTasks.
                                                                                                                                         getExpectedReturnRate());
            
//#line 21
/* template:place-check { */((MonteCarloPath) x10.lang.Runtime.hereCheck(mcPath))/* } */.setVolatility(initAllTasks.
                                                                                                                                 getVolatility());
            
//#line 23
final int nTimeSteps =
              initAllTasks.
                getNTimeSteps();
            
//#line 24
/* template:place-check { */((MonteCarloPath) x10.lang.Runtime.hereCheck(mcPath))/* } */.setNTimeSteps(nTimeSteps);
            
//#line 25
pathStartValue =
              initAllTasks.
                getPathStartValue();
            
//#line 26
/* template:place-check { */((MonteCarloPath) x10.lang.Runtime.hereCheck(mcPath))/* } */.setPathStartValue(pathStartValue);
            
//#line 28
final x10.
              lang.
              dist dTS =
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
                    nTimeSteps -
                      1)),
                /* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 29
/* template:place-check { */((MonteCarloPath) x10.lang.Runtime.hereCheck(mcPath))/* } */.setPathValue(/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dTS,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
            
//#line 30
/* template:place-check { */((MonteCarloPath) x10.lang.Runtime.hereCheck(mcPath))/* } */.setFluctuations(/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dTS,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        }
        	} catch (Throwable tmp1) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp1);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 34
public void
                  setTask(
                  final ToTask task) {
        
//#line 35
randomSeed =
          /* template:place-check { */((ToTask) x10.lang.Runtime.hereCheck(task))/* } */.getRandomSeed();
    }
    
    
//#line 38
public void
                  run(
                  ) {
        
//#line 39
/* template:place-check { */((MonteCarloPath) x10.lang.Runtime.hereCheck(mcPath))/* } */.computeFluctuationsGaussian(randomSeed);
        
//#line 40
/* template:place-check { */((MonteCarloPath) x10.lang.Runtime.hereCheck(mcPath))/* } */.computePathValue(pathStartValue);
        
//#line 41
RatePath rateP =
          new RatePath(
          mcPath);
        
//#line 42
ReturnPath returnP =
          /* template:place-check { */((RatePath) x10.lang.Runtime.hereCheck(rateP))/* } */.getReturnCompounded();
        
//#line 43
/* template:place-check { */((ReturnPath) x10.lang.Runtime.hereCheck(returnP))/* } */.estimatePath();
        
//#line 44
expectedReturnRate =
          /* template:place-check { */((ReturnPath) x10.lang.Runtime.hereCheck(returnP))/* } */.getExpectedReturnRate();
        
//#line 45
volatility =
          /* template:place-check { */((ReturnPath) x10.lang.Runtime.hereCheck(returnP))/* } */.getVolatility();
        
//#line 46
volatility2 =
          /* template:place-check { */((ReturnPath) x10.lang.Runtime.hereCheck(returnP))/* } */.getVolatility2();
        
//#line 47
finalStockPrice =
          /* template:place-check { */((RatePath) x10.lang.Runtime.hereCheck(rateP))/* } */.getEndPathValue();
        
//#line 48
pathValue =
          /* template:place-check { */((MonteCarloPath) x10.lang.Runtime.hereCheck(mcPath))/* } */.getPathValue();
    }
    
    
//#line 51
public ToResult
                  getResult(
                  ) {
        
//#line 52
ToResult res =
          new ToResult(
          expectedReturnRate,
          volatility,
          volatility2,
          finalStockPrice,
          pathValue);
        
//#line 57
return res;
    }
}
