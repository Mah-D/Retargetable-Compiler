import x10.lang.*;

public class ToResult extends x10.lang.Object {
    
//#line 2
private double expectedReturnRate;
    
//#line 3
private double volatility;
    
//#line 4
private double volatility2;
    
//#line 5
private double finalStockPrice;
    
//#line 6
private x10.lang.DoubleReferenceArray pathValue;
    
    
//#line 8
public ToResult(final double e, final double v, final double v2,
                               final double f,
                               final x10.lang.DoubleReferenceArray p) {
        
//#line 12
super();
        
//#line 13
expectedReturnRate = e;
        
//#line 14
volatility = v;
        
//#line 15
volatility2 = v2;
        
//#line 16
finalStockPrice = f;
        
//#line 17
pathValue = p;
    }
    
    
//#line 20
public double getExpectedReturnRate() {
        
//#line 21
return expectedReturnRate;
    }
    
    
//#line 24
public double getVolatility() { 
//#line 25
return volatility; }
    
    
//#line 28
public double getVolatility2() {
        
//#line 29
return volatility2;
    }
    
    
//#line 32
public double getFinalStockPrice() {
        
//#line 33
return finalStockPrice;
    }
    
    
//#line 36
public x10.lang.DoubleReferenceArray getPathValue() {
        
//#line 37
return pathValue;
    }
}
