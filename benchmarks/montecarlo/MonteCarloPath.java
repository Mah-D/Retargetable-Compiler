import x10.lang.*;

public class MonteCarloPath
extends x10.
  lang.
  Object
{
    
//#line 2
private double
      dTime;
    
//#line 3
private x10.
      lang.
      DoubleReferenceArray
      fluctuations;
    
//#line 4
private x10.
      lang.
      DoubleReferenceArray
      pathValue;
    
//#line 5
private int
      returnDefinition;
    
//#line 6
private double
      expectedReturnRate;
    
//#line 7
private double
      volatility;
    
//#line 8
private int
      nTimeSteps;
    
//#line 9
private double
      pathStartValue;
    
    
//#line 11
public void
                  computeFluctuationsGaussian(
                  final long seed) {
        
//#line 12
Random rnd =
          new Random(
          seed);
        
//#line 14
double mean =
          ((expectedReturnRate -
              0.5 *
              volatility *
              volatility)) *
          dTime;
        
//#line 15
double sd =
          volatility *
          java.
            lang.
            Math.
            sqrt(
            dTime);
        
//#line 16
double gauss =
          0.0;
        
//#line 17
double meanGauss =
          0.0;
        
//#line 18
double variance =
          0.0;
        
//#line 19
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
                                           0,
                                           nTimeSteps -
                                             1))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 20
gauss =
              /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(rnd))/* } */.nextGaussian();
            
//#line 21
meanGauss =
              meanGauss +
                gauss;
            
//#line 22
variance =
              variance +
                ((gauss *
                    gauss));
            
//#line 24
/* template:array_set { */(fluctuations).set(mean +
              sd *
              gauss,i)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 26
meanGauss =
          meanGauss /
            (double)
              nTimeSteps;
        
//#line 27
variance =
          variance /
            (double)
              nTimeSteps;
    }
    
    
//#line 30
public void
                  computePathValue(
                  final double startValue) {
        
//#line 31
/* template:array_set { */(pathValue).set(startValue,0)/* } */;
        
//#line 32
if (returnDefinition ==
                          ReturnPath.
                            COMPOUNDED ||
                          returnDefinition ==
                          ReturnPath.
                            NONCOMPOUNDED) {
            
//#line 34
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
                                               nTimeSteps -
                                                 1))).iterator(); i__.hasNext(); ) {
            	final  x10.
              lang.
              point i = (x10.
              lang.
              point) i__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 35
/* template:array_set { */(pathValue).set(/* template:array_get { */((pathValue).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i))/* } */.add(x10.
                                                                                                                                                                                                           lang.
                                                                                                                                                                                                           point.
                                                                                                                                                                                                           factory.
                                                                                                                                                                                                           point(
                                                                                                                                                                                                           -1))))/* } */ *
                  java.
                    lang.
                    Math.
                    exp(
                    /* template:array_get { */((fluctuations).get(i))/* } */),i)/* } */;
            }/* } */
            }
            /* } */
            
        }
    }
    
    
//#line 40
public double
                  getDTime(
                  ) {
        
//#line 41
return dTime;
    }
    
    
//#line 44
public x10.
                  lang.
                  DoubleReferenceArray
                  getPathValue(
                  ) {
        
//#line 45
return pathValue;
    }
    
    
//#line 48
public int
                  getNTimeSteps(
                  ) {
        
//#line 49
return nTimeSteps;
    }
    
    
//#line 52
public void
                  setDTime(
                  final double d) {
        
//#line 53
dTime =
          d;
    }
    
    
//#line 56
public void
                  setReturnDefinition(
                  final int r) {
        
//#line 57
returnDefinition =
          r;
    }
    
    
//#line 60
public void
                  setExpectedReturnRate(
                  final double e) {
        
//#line 61
expectedReturnRate =
          e;
    }
    
    
//#line 64
public void
                  setVolatility(
                  final double v) {
        
//#line 65
volatility =
          v;
    }
    
    
//#line 68
public void
                  setNTimeSteps(
                  final int n) {
        
//#line 69
nTimeSteps =
          n;
    }
    
    
//#line 72
public void
                  setPathStartValue(
                  final double p) {
        
//#line 73
pathStartValue =
          p;
    }
    
    
//#line 76
public void
                  setPathValue(
                  final x10.
                    lang.
                    DoubleReferenceArray p) {
        
//#line 77
pathValue =
          p;
    }
    
    
//#line 80
public void
                  setFluctuations(
                  final x10.
                    lang.
                    DoubleReferenceArray f) {
        
//#line 81
fluctuations =
          f;
    }
    
    
//#line 1
public MonteCarloPath() {
        
//#line 1
super();
    }
}
