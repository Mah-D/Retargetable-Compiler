import x10.lang.*;

public class RunMain
extends x10.
  lang.
  Object
{
    
    
//#line 2
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
        
//#line 3
Program.
                     runMain();
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 1
public RunMain() {
        
//#line 1
super();
    }
}

class Program
extends x10.
  lang.
  Object
{
    
//#line 9
final public static x10.
      lang.
      region
      _MR_r =
      (x10.
        lang.
        region)
        ((_MR_r_init()));
    
//#line 10
final public static x10.
      lang.
      dist
      _MR_d =
      (x10.
        lang.
        dist)
        ((_MR_d_init()));
    
    
//#line 13
public static void
                  runMain(
                  ) {
        
//#line 14
final MR X10_TEMP1 =
          (new MR(
             ));
        
//#line 16
Program.
                      MR_run(
                      X10_TEMP1);
    }
    
    
//#line 18
public static x10.
                  lang.
                  region
                  _MR_r_init(
                  ) {
        
//#line 20
final x10.
          lang.
          region X10_TEMP4 =
          (x10.
            lang.
            region)
            ((x10.
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
                  300))));
        
//#line 21
return X10_TEMP4;
    }
    
    
//#line 23
public static x10.
                  lang.
                  dist
                  _MR_d_init(
                  ) {
        
//#line 24
final x10.
          lang.
          region X10_TEMP2 =
          (x10.
            lang.
            region)
            ((_MR_r_init()));
        
//#line 25
final x10.
          lang.
          dist X10_TEMP3 =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 25
public x10.
                            lang.
                            dist
                            checkCast(
                            final x10.
                              lang.
                              dist x10_generated_objToCast) {
                  
//#line 25
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
            (x10.
               lang.
               dist.
               factory.
               block(
               X10_TEMP2)));
        
//#line 27
return X10_TEMP3;
    }
    
    
//#line 30
public static void
                  MR_run(
                  final MR X10_TEMP0) {
        
//#line 31
Program.
                      MR_map(
                      X10_TEMP0);
        
//#line 33
final int X10_TEMP2 =
          (/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total);
        
//#line 34
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println(X10_TEMP2);
    }
    
    
//#line 37
public static void
                  MR_map(
                  final MR X10_TEMP0) {
        
//#line 38
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 39
final x10.
              lang.
              IntReferenceArray X10_TEMP2 =
              (x10.
                lang.
                IntReferenceArray)
                ((/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a));
            
//#line 40
/* template:forloop { */
            for (java.util.Iterator p__ = (X10_TEMP2.
                                             distribution.
                                             region).iterator(); p__.hasNext(); ) {
            	final  x10.
              lang.
              point p = (x10.
              lang.
              point) p__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 41
final x10.
                  lang.
                  dist X10_TEMP3 =
                  (x10.
                    lang.
                    dist)
                    X10_TEMP2.
                      distribution;
                
//#line 42
final x10.
                  lang.
                  place X10_TEMP4 =
                  X10_TEMP3.
                    get(
                    p);
                
//#line 43
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP4)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 44
final x10.
                      lang.
                      IntReferenceArray X10_TEMP5 =
                      (x10.
                        lang.
                        IntReferenceArray)
                        ((/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a));
                }
                		}
                	});/* } */
            }/* } */
            }
            /* } */
            
        }
        	} catch (Throwable tmp1) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp1);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 53
public static int
                  MR_f(
                  final MR X10_TEMP0,
                  final int x) {
        
//#line 54
int X10_TEMP1 =
          x;
        
//#line 55
final int X10_TEMP3 =
          (X10_TEMP1 *
             X10_TEMP1);
        
//#line 56
return X10_TEMP3;
    }
    
    
//#line 58
public static void
                  MR_reduce(
                  final MR X10_TEMP0) {
        
//#line 59
final x10.
          lang.
          place h =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 60
final x10.
          lang.
          IntReferenceArray X10_TEMP3 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a));
        
//#line 61
/* template:forloop { */
        for (java.util.Iterator p__ = (X10_TEMP3.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 62
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 63
final x10.
                  lang.
                  IntReferenceArray X10_TEMP4 =
                  (x10.
                    lang.
                    IntReferenceArray)
                    ((/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a));
                
//#line 64
final x10.
                  lang.
                  dist X10_TEMP5 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP4.
                        distribution));
                
//#line 66
final x10.
                  lang.
                  place X10_TEMP8 =
                  X10_TEMP5.
                    get(
                    p);
                
//#line 67
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP8)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 68
final x10.
                      lang.
                      IntReferenceArray X10_TEMP9 =
                      (x10.
                        lang.
                        IntReferenceArray)
                        ((/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a));
                    
//#line 70
final int v =
                      (/* template:array_get { */((X10_TEMP9).get(p))/* } */);
                    
//#line 71
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 72
final int X10_TEMP13 =
                          (/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total);
                        
//#line 74
/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total =
                          ((X10_TEMP13 +
                              v));
                    }
                    		}
                    	});/* } */
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
            
        }/* } */
        }
        /* } */
        
    }
    
    
//#line 8
public Program() {
        
//#line 8
super();
    }
}

class MR
extends x10.
  lang.
  Object
{
    
//#line 84
public x10.
      lang.
      IntReferenceArray
      a;
    
//#line 85
public int
      total;
    
    
//#line 88
public MR() {
        
//#line 88
super();
        
//#line 89
final x10.
          lang.
          dist X10_TEMP1 =
          (x10.
            lang.
            dist)
            ((Program.
                _MR_d));
        
//#line 91
a =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(X10_TEMP1,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public int apply(/* Join: { */x10.
                lang.
                point __var0__/* } */, int dummy) { {
                  
//#line 91
final int i =
                    /* template:array_get { */((__var0__).get(0))/* } */;
                  
//#line 92
return i;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 96
total =
          ((0));
    }
}
