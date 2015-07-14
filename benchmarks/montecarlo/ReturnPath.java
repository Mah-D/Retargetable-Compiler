import x10.lang.*;

public class ReturnPath
extends x10.
  lang.
  Object
{
    
//#line 2
final public static int
      COMPOUNDED =
      1;
    
//#line 3
final public static int
      NONCOMPOUNDED =
      2;
    
//#line 5
private double
      dTime;
    
//#line 7
private x10.
      lang.
      DoubleReferenceArray
      pathValue;
    
//#line 8
private int
      nPathValue;
    
//#line 9
private int
      returnDefinition;
    
//#line 10
private double
      expectedReturnRate;
    
//#line 11
private double
      volatility;
    
//#line 12
private double
      volatility2;
    
//#line 13
private double
      mean;
    
//#line 14
private double
      variance;
    
    
//#line 16
public ReturnPath(final x10.
                                    lang.
                                    DoubleReferenceArray pv,
                                  final int npv,
                                  final int rd) {
        
//#line 16
super();
        
//#line 17
pathValue =
          pv;
        
//#line 18
nPathValue =
          npv;
        
//#line 19
returnDefinition =
          rd;
    }
    
    
//#line 22
public void
                  setDTime(
                  final double d) {
        
//#line 23
dTime =
          d;
    }
    
    
//#line 26
public double
                  getDTime(
                  ) {
        
//#line 27
return dTime;
    }
    
    
//#line 30
public int
                  getReturnDefinition(
                  ) {
        
//#line 31
return returnDefinition;
    }
    
    
//#line 34
public double
                  getExpectedReturnRate(
                  ) {
        
//#line 35
return expectedReturnRate;
    }
    
    
//#line 38
public double
                  getVolatility(
                  ) {
        
//#line 39
return volatility;
    }
    
    
//#line 42
public double
                  getVolatility2(
                  ) {
        
//#line 43
return volatility2;
    }
    
    
//#line 46
public void
                  estimatePath(
                  ) {
        
//#line 47
computeMean();
        
//#line 48
computeVariance();
        
//#line 49
computeExpectedReturnRate();
        
//#line 50
computeVolatility();
    }
    
    
//#line 53
public void
                  computeMean(
                  ) {
        
//#line 54
mean =
          0.0;
        
//#line 55
/* template:forloop { */
        for (java.util.Iterator i__ = (x10.
                                         lang.
                                         region.
                                         factory.
                                         region(
                                         x10.
                                           lang.
                                           region.
                                           factory.
                                           region(
                                           1,
                                           nPathValue -
                                             1))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 56
mean =
              mean +
                /* template:array_get { */((pathValue).get(i))/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 58
mean =
          mean /
            (((double)
                ((nPathValue -
                    1.0))));
    }
    
    
//#line 61
public void
                  computeVariance(
                  ) {
        
//#line 62
variance =
          0.0;
        
//#line 63
/* template:forloop { */
        for (java.util.Iterator i__ = (x10.
                                         lang.
                                         region.
                                         factory.
                                         region(
                                         x10.
                                           lang.
                                           region.
                                           factory.
                                           region(
                                           1,
                                           nPathValue -
                                             1))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 64
variance =
              variance +
                ((((/* template:array_get { */((pathValue).get(i))/* } */ -
                      mean)) *
                    ((/* template:array_get { */((pathValue).get(i))/* } */ -
                        mean))));
        }/* } */
        }
        /* } */
        
        
//#line 66
variance =
          variance /
            (((double)
                ((nPathValue -
                    1.0))));
    }
    
    
//#line 69
public void
                  computeExpectedReturnRate(
                  ) {
        
//#line 70
expectedReturnRate =
          mean /
            dTime +
            0.5 *
            volatility2;
    }
    
    
//#line 73
public void
                  computeVolatility(
                  ) {
        
//#line 74
volatility2 =
          variance /
            dTime;
        
//#line 75
volatility =
          java.
            lang.
            Math.
            sqrt(
            volatility2);
    }
}
