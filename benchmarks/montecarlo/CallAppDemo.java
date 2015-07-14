import x10.lang.*;

public class CallAppDemo
extends x10.
  lang.
  Object
{
    
//#line 2
private AppDemo
      ap;
    
    
//#line 4
public CallAppDemo() {
        
//#line 4
super();
        
//#line 5
ap =
          new AppDemo(
            1000,
            1000);
    }
    
    
//#line 8
public void
                 runiters(
                 ) {
        
//#line 9
/* template:place-check { */((AppDemo) x10.lang.Runtime.hereCheck(ap))/* } */.runSerial();
    }
    
    
//#line 12
public void
                  presults(
                  ) {
        
//#line 13
/* template:place-check { */((AppDemo) x10.lang.Runtime.hereCheck(ap))/* } */.processResults();
    }
    
    
//#line 16
public void
                  go(
                  ) {
        
//#line 17
init();
        
//#line 18
kernel();
        
//#line 19
validate();
    }
    
    
//#line 22
public void
                  init(
                  ) {
        
    }
    
    
//#line 25
public void
                  kernel(
                  ) {
        
//#line 26
runiters();
        
//#line 27
presults();
    }
    
    
//#line 30
public void
                  validate(
                  ) {
        
//#line 31
double ref =
          -0.03234469082617506;
        
//#line 32
double dev =
          java.
            lang.
            Math.
            abs(
            /* template:array_get { */((/* template:place-check { */((AppDemo) x10.lang.Runtime.hereCheck(ap))/* } */.result).get(0))/* } */ -
              ref);
        
//#line 34
if (dev >
                          1.0E-12) {
            
//#line 35
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                        lang.
                                                                                                        System.
                                                                                                        out))/* } */.println("Validation failed");
            
//#line 36
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                        lang.
                                                                                                        System.
                                                                                                        out))/* } */.println("ExpectedReturnRate = " +
                                                                                                                             /* template:array_get { */((/* template:place-check { */((AppDemo) x10.lang.Runtime.hereCheck(ap))/* } */.result).get(0))/* } */ +
                                                                                                                             " " +
                                                                                                                             ref +
                                                                                                                             " " +
                                                                                                                             dev);
            
//#line 37
throw new java.
              lang.
              RuntimeException(
              "Validation failed");
        }
    }
}
