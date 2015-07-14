package harness;

import java.util.Random;
import x10.lang.*;

abstract public class x10Test
extends x10.
  lang.
  Object
{
    
    
//#line 22
abstract protected boolean
                  run(
                  );
    
    
//#line 24
public void
                  executeAsync(
                  ) {
        
//#line 25
final boolean[] b =
          new boolean[] { false };
        
//#line 26
java.
          lang.
          Thread timer =
          startTimeoutTimer();
        
//#line 27
try {
            
//#line 28
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 28
/* template:Async { */(x10.lang.Runtime.asPlace(harness.
                                                                              x10Test.this.
                                                                              location)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 28
b[0] =
                      harness.
                        x10Test.this.
                        run();
                }
                		}
                	});/* } */
            }
            	} catch (Throwable tmp2) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp2);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
        
//#line 29
catch (java.
                             lang.
                             Throwable e) {
            
//#line 30
/* template:place-check { */((java.lang.Throwable) x10.lang.Runtime.hereCheck(e))/* } */.printStackTrace();
        }
        
//#line 32
/* template:place-check { */((java.lang.Thread) x10.lang.Runtime.hereCheck(timer))/* } */.interrupt();
        
//#line 33
reportResult(
                      b[0]);
    }
    
    
//#line 36
public void
                  execute(
                  ) {
        
//#line 37
boolean b =
          false;
        
//#line 38
java.
          lang.
          Thread timer =
          startTimeoutTimer();
        
//#line 39
try {
            
//#line 40
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 40
b =
                  this.
                    run();
            }
            	} catch (Throwable tmp3) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp3);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
        
//#line 41
catch (java.
                             lang.
                             Throwable e) {
            
//#line 42
/* template:place-check { */((java.lang.Throwable) x10.lang.Runtime.hereCheck(e))/* } */.printStackTrace();
        }
        
//#line 44
/* template:place-check { */((java.lang.Thread) x10.lang.Runtime.hereCheck(timer))/* } */.interrupt();
        
//#line 45
reportResult(
                      b);
    }
    
    
//#line 48
final public static String
      PREFIX =
      "++++++ ";
    
    
//#line 49
public static void
                  success(
                  ) {
        
//#line 50
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println(PREFIX +
                                                                                                                         "Test succeeded.");
        
//#line 51
x10.
                      lang.
                      Runtime.
                      setExitCode(
                      0);
    }
    
    
//#line 53
public static void
                  failure(
                  ) {
        
//#line 54
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println(PREFIX +
                                                                                                                         "Test failed.");
        
//#line 55
x10.
                      lang.
                      Runtime.
                      setExitCode(
                      1);
    }
    
    
//#line 57
protected static void
                  reportResult(
                  boolean b) {
        
//#line 58
if (b) {
            
//#line 58
success();
        } else {
            
//#line 58
failure();
        }
    }
    
    
//#line 64
public static void
                  chk(
                  boolean b) {
        
//#line 65
if (!b) {
            
//#line 65
throw new java.
              lang.
              Error(
              );
        }
    }
    
    
//#line 72
public static void
                  chk(
                  boolean b,
                  java.
                    lang.
                    String s) {
        
//#line 73
if (!b) {
            
//#line 73
throw new java.
              lang.
              Error(
              s);
        }
    }
    
    
//#line 76
private java.
      util.
      Random
      myRand =
      new java.
      util.
      Random(
      1L);
    
    
//#line 81
protected int
                  ranInt(
                  int lb,
                  int ub) {
        
//#line 82
return lb +
          /* template:place-check { */((java.util.Random) x10.lang.Runtime.hereCheck(myRand))/* } */.nextInt(ub -
                                                                                                               lb +
                                                                                                               1);
    }
    
    
//#line 90
private static java.
                  lang.
                  Thread
                  startTimeoutTimer(
                  ) {
        
//#line 91
final int seconds =
          /* template:place-check { */((java.lang.Integer) x10.lang.Runtime.hereCheck(java.
                                                                                        lang.
                                                                                        Integer.
                                                                                        getInteger(
                                                                                        "x10test.timeout",
                                                                                        300)))/* } */.intValue();
        
//#line 93
java.
          lang.
          Thread timer =
          new java.
          lang.
          Thread(
          new java.
            lang.
            Runnable(
            ) {
              
              
//#line 94
public void
                            run(
                            ) {
                  
//#line 95
if (x10.
                                    lang.
                                    Runtime.
                                    sleep(
                                    seconds *
                                      1000)) {
                      
//#line 96
x10.
                                    lang.
                                    Runtime.
                                    exit(
                                    128);
                  }
              }
          });
        
//#line 100
/* template:place-check { */((java.lang.Thread) x10.lang.Runtime.hereCheck(timer))/* } */.start();
        
//#line 101
return timer;
    }
    
    
//#line 16
public x10Test() {
        
//#line 16
super();
    }
}
