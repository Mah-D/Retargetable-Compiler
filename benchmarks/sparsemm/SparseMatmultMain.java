import x10.lang.*;

public class SparseMatmultMain
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
        {
            
//#line 3
Timer tmr =
              new Timer(
              );
            
//#line 4
int count =
              0;
            
//#line 5
/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.start(count);
            
//#line 6
/* template:place-check { */((SparseMatmult) x10.lang.Runtime.hereCheck(new SparseMatmult(
              )))/* } */.run(0);
            
//#line 7
/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.stop(count);
            
//#line 8
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                       lang.
                                                                                                       System.
                                                                                                       out))/* } */.println("Wall-clock time for sparsemm: " +
                                                                                                                            /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.readTimer(count) +
                                                                                                                            " secs");
        }
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 1
public SparseMatmultMain() {
        
//#line 1
super();
    }
}
