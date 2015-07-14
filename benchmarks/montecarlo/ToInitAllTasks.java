import x10.lang.*;

public class ToInitAllTasks
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 2
final private double
      dTime;
    
//#line 3
final private int
      returnDefinition;
    
//#line 4
final private double
      expectedReturnRate;
    
//#line 5
final private double
      volatility;
    
//#line 6
final private int
      nTimeSteps;
    
//#line 7
final private double
      pathStartValue;
    
    
//#line 9
public ToInitAllTasks(final ReturnPath r,
                                     final int nts,
                                     final double psv) {
        
//#line 9
super();
        
//#line 10
dTime =
          /* template:place-check { */((ReturnPath) x10.lang.Runtime.hereCheck(r))/* } */.getDTime();
        
//#line 11
returnDefinition =
          /* template:place-check { */((ReturnPath) x10.lang.Runtime.hereCheck(r))/* } */.getReturnDefinition();
        
//#line 12
expectedReturnRate =
          /* template:place-check { */((ReturnPath) x10.lang.Runtime.hereCheck(r))/* } */.getExpectedReturnRate();
        
//#line 13
volatility =
          /* template:place-check { */((ReturnPath) x10.lang.Runtime.hereCheck(r))/* } */.getVolatility();
        
//#line 14
nTimeSteps =
          nts;
        
//#line 15
pathStartValue =
          psv;
    }
    
    
//#line 18
public double
                  getDTime(
                  ) {
        
//#line 19
return dTime;
    }
    
    
//#line 22
public int
                  getReturnDefinition(
                  ) {
        
//#line 23
return returnDefinition;
    }
    
    
//#line 26
public double
                  getExpectedReturnRate(
                  ) {
        
//#line 27
return expectedReturnRate;
    }
    
    
//#line 30
public double
                  getVolatility(
                  ) {
        
//#line 31
return volatility;
    }
    
    
//#line 34
public int
                  getNTimeSteps(
                  ) {
        
//#line 35
return nTimeSteps;
    }
    
    
//#line 38
public double
                  getPathStartValue(
                  ) {
        
//#line 39
return pathStartValue;
    }
    
    
//#line 42
public java.
                  lang.
                  String
                  toString(
                  ) {
        
//#line 44
return "";
    }
}
