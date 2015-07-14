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
      _A_reg =
      (x10.
        lang.
        region)
        ((Program.
            _A_reg_init()));
    
//#line 10
final public static int
      _A_f1 =
      (Program.
         _A_f1_init());
    
//#line 11
final public static x10.
      lang.
      dist
      _A_dReg =
      (x10.
        lang.
        dist)
        ((Program.
            _A_dReg_init()));
    
//#line 12
final public static x10.
      lang.
      intArray
      _A_valArray =
      (x10.
        lang.
        intArray)
        ((Program.
            _A_valArray_init()));
    
//#line 13
final public static x10.
      lang.
      IntReferenceArray
      _A_refArray =
      (x10.
        lang.
        IntReferenceArray)
        ((Program.
            _A_refArray_init()));
    
    
//#line 16
public static void
                  runMain(
                  ) {
        
//#line 17
int X10_TEMP3 =
          (0);
        
//#line 18
int X10_TEMP4 =
          (1);
        
//#line 19
final A X10_TEMP5 =
          (new A(
             X10_TEMP3,
             X10_TEMP4));
        
//#line 21
Program.
                      A_run(
                      X10_TEMP5);
    }
    
    
//#line 23
public static x10.
                  lang.
                  region
                  _A_reg_init(
                  ) {
        
//#line 24
final int X10_TEMP3 =
          (0);
        
//#line 25
final int X10_TEMP4 =
          (1);
        
//#line 26
final int X10_TEMP7 =
          (0);
        
//#line 27
final int X10_TEMP8 =
          (1);
        
//#line 28
final int X10_TEMP11 =
          (0);
        
//#line 29
final int X10_TEMP12 =
          (1);
        
//#line 31
final x10.
          lang.
          region X10_TEMP14 =
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
                  X10_TEMP3,
                  X10_TEMP4),
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP7,
                  X10_TEMP8),
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP11,
                  X10_TEMP12))));
        
//#line 32
return X10_TEMP14;
    }
    
    
//#line 34
public static x10.
                  lang.
                  dist
                  _A_dReg_init(
                  ) {
        
//#line 35
final x10.
          lang.
          place X10_TEMP1 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 37
final x10.
          lang.
          dist X10_TEMP3 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                _A_reg,
                X10_TEMP1)));
        
//#line 38
return X10_TEMP3;
    }
    
    
//#line 40
public static x10.
                  lang.
                  IntReferenceArray
                  _A_refArray_init(
                  ) {
        
//#line 41
final x10.
          lang.
          IntReferenceArray X10_TEMP4 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(_A_dReg,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public int apply(/* Join: { */x10.
                lang.
                point __var0__/* } */, int dummy) { {
                  
//#line 41
final int i =
                    /* template:array_get { */((__var0__).get(0))/* } */;
                  
//#line 41
final int j =
                    /* template:array_get { */((__var0__).get(1))/* } */;
                  
//#line 41
final int k =
                    /* template:array_get { */((__var0__).get(2))/* } */;
                  
//#line 42
final int X10_TEMP1 =
                    (i +
                       j);
                  
//#line 44
final int X10_TEMP3 =
                    (X10_TEMP1 +
                       k);
                  
//#line 45
return X10_TEMP3;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 50
return X10_TEMP4;
    }
    
    
//#line 52
public static x10.
                  lang.
                  intArray
                  _A_valArray_init(
                  ) {
        
//#line 53
final x10.
          lang.
          intArray X10_TEMP4 =
          (x10.
            lang.
            intArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(_A_reg.
                                                                                                                       toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public int apply(/* Join: { */x10.
                lang.
                point __var1__/* } */, int dummy) { {
                  
//#line 53
final int i =
                    /* template:array_get { */((__var1__).get(0))/* } */;
                  
//#line 53
final int j =
                    /* template:array_get { */((__var1__).get(1))/* } */;
                  
//#line 53
final int k =
                    /* template:array_get { */((__var1__).get(2))/* } */;
                  
//#line 54
final int X10_TEMP1 =
                    (i +
                       j);
                  
//#line 56
final int X10_TEMP3 =
                    (X10_TEMP1 +
                       k);
                  
//#line 57
return X10_TEMP3;
              } }
              }/* } */,true,false,false)/* } */));
        
//#line 62
return X10_TEMP4;
    }
    
    
//#line 64
public static int
                  _A_f1_init(
                  ) {
        
//#line 66
final int X10_TEMP2 =
          (10);
        
//#line 67
return X10_TEMP2;
    }
    
    
//#line 69
public static void
                  A_run(
                  final A X10_TEMP0) {
        
//#line 70
final int i =
          (10);
        
//#line 71
Program.
                      A_m1(
                      i);
        
//#line 72
Program.
                      A_m2(
                      X10_TEMP0,
                      i);
    }
    
    
//#line 74
public static int
                  A_m1(
                  final int i) {
        
//#line 75
int X10_TEMP1 =
          i;
        
//#line 76
final int X10_TEMP3 =
          (_A_f1 *
             X10_TEMP1);
        
//#line 77
return X10_TEMP3;
    }
    
    
//#line 79
public static int
                  A_m2(
                  final A X10_TEMP0,
                  final int i) {
        
//#line 80
int X10_TEMP1 =
          i;
        
//#line 81
final int X10_TEMP2 =
          (/* template:place-check { */((A) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.f2);
        
//#line 82
final int X10_TEMP3 =
          (/* template:place-check { */((A) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.f3);
        
//#line 84
final int X10_TEMP5 =
          (X10_TEMP2 +
             X10_TEMP3);
        
//#line 86
final int X10_TEMP7 =
          (X10_TEMP5 *
             X10_TEMP1);
        
//#line 87
return X10_TEMP7;
    }
    
    
//#line 8
public Program() {
        
//#line 8
super();
    }
}

class A
extends x10.
  lang.
  Object
{
    
//#line 93
final public int
      f2;
    
//#line 96
public int
      f3;
    
    
//#line 99
public A(final int f2_,
                         final int f3_) {
        
//#line 99
super();
        
//#line 100
int X10_TEMP1 =
          (f2_);
        
//#line 101
int X10_TEMP2 =
          (f3_);
        
//#line 102
f2 =
          ((X10_TEMP1));
        
//#line 103
f3 =
          ((X10_TEMP2));
    }
}
