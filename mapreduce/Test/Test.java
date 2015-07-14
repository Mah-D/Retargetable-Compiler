import x10.lang.*;

public class Test
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
        
//#line 2
/* template:place-check { */((A) x10.lang.Runtime.hereCheck(new A(
          0,
          1)))/* } */.run();
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 1
public Test() {
        
//#line 1
super();
    }
}

class A
extends x10.
  lang.
  Object
{
    
//#line 6
final public static x10.
      lang.
      region
      reg =
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
          1),
        x10.
          lang.
          region.
          factory.
          region(
          0,
          1),
        x10.
          lang.
          region.
          factory.
          region(
          0,
          1));
    
//#line 7
final public static x10.
      lang.
      dist
      dReg =
      x10.
        lang.
        dist.
        factory.
        constant(
        reg,
        /* template:here { */x10.lang.Runtime.here()/* } */);
    
//#line 8
final public static x10.
      lang.
      IntReferenceArray
      refArray =
      (x10.
        lang.
        IntReferenceArray)
        (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dReg,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
         	public int apply(/* Join: { */x10.
           lang.
           point __var0__/* } */, int dummy) { {
             
//#line 8
final int i =
               /* template:array_get { */((__var0__).get(0))/* } */;
             
//#line 8
final int j =
               /* template:array_get { */((__var0__).get(1))/* } */;
             
//#line 8
final int k =
               /* template:array_get { */((__var0__).get(2))/* } */;
             
//#line 8
return i +
               j +
               k;
         } }
         }/* } */,true,true,false)/* } */);
    
//#line 9
final public static x10.
      lang.
      intArray
      valArray =
      (x10.
        lang.
        intArray)
        (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(reg.
                                                                                                                  toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
         	public int apply(/* Join: { */x10.
           lang.
           point __var1__/* } */, int dummy) { {
             
//#line 9
final int i =
               /* template:array_get { */((__var1__).get(0))/* } */;
             
//#line 9
final int j =
               /* template:array_get { */((__var1__).get(1))/* } */;
             
//#line 9
final int k =
               /* template:array_get { */((__var1__).get(2))/* } */;
             
//#line 9
return i +
               j +
               k;
         } }
         }/* } */,true,false,false)/* } */);
    
//#line 10
final public static int
      f1 =
      10;
    
//#line 11
final public int
      f2;
    
//#line 12
public int
      f3;
    
    
//#line 13
public A(int f2_,
                         int f3_) {
        
//#line 13
super();
        
//#line 14
f2 =
          f2_;
        
//#line 15
f3 =
          f3_;
    }
    
    
//#line 17
public void
                  run(
                  ) {
        
//#line 18
final int i =
          10;
        
//#line 19
m1(
                      i);
        
//#line 20
int r =
          reg.
            ordinal(
            x10.
              lang.
              point.
              factory.
              point(
              3,
              4,
              5));
        
//#line 21
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println(r);
        
//#line 22
m2(
                      i);
    }
    
    
//#line 24
public static int
                  m1(
                  int i) {
        
//#line 25
return f1 *
          i;
    }
    
    
//#line 27
public int
                  m2(
                  int i) {
        
//#line 28
return ((f2 +
                               f3)) *
          i;
    }
}
