import raytracer.*;
import jgfutil.*;
import harness.x10Test;
import x10.lang.*;

public class JGFRayTracerBenchSizeA
extends harness.
  x10Test
{
    
    
//#line 26
public boolean
                  run(
                  ) {
        
//#line 27
jgfutil.
                      JGFInstrumentor.
                      printHeader(
                      3,
                      0);
        
//#line 28
raytracer.
          JGFRayTracerBench rtb =
          new raytracer.
          JGFRayTracerBench(
          );
        
//#line 29
/* template:place-check { */((raytracer.JGFRayTracerBench) x10.lang.Runtime.hereCheck(rtb))/* } */.JGFrun(0);
        
//#line 30
return true;
    }
    
    
//#line 33
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
        
//#line 34
/* template:place-check { */((JGFRayTracerBenchSizeA) x10.lang.Runtime.hereCheck(new JGFRayTracerBenchSizeA(
          )))/* } */.execute();
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 24
public JGFRayTracerBenchSizeA() {
        
//#line 24
super();
    }
}
