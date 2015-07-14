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
      _MyProgram_r =
      (x10.
        lang.
        region)
        ((Program.
            _MyProgram_r_init()));
    
//#line 10
final public static x10.
      lang.
      dist
      _MyProgram_d =
      (x10.
        lang.
        dist)
        ((Program.
            _MyProgram_d_init()));
    
    
//#line 13
public static void
                  runMain(
                  ) {
        
//#line 14
Program.
                      MyProgram_init();
    }
    
    
//#line 16
public static x10.
                  lang.
                  region
                  _MyProgram_r_init(
                  ) {
        
//#line 18
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
        
//#line 19
return X10_TEMP4;
    }
    
    
//#line 21
public static x10.
                  lang.
                  dist
                  _MyProgram_d_init(
                  ) {
        
//#line 22
final x10.
          lang.
          region X10_TEMP2 =
          (x10.
            lang.
            region)
            ((Program.
                _MyProgram_r_init()));
        
//#line 23
final x10.
          lang.
          dist X10_TEMP3 =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 23
public x10.
                            lang.
                            dist
                            checkCast(
                            final x10.
                              lang.
                              dist x10_generated_objToCast) {
                  
//#line 23
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
        
//#line 25
return X10_TEMP3;
    }
    
    
//#line 27
public static void
                  MyProgram_init(
                  ) {
        
//#line 28
final MR m =
          (new MR(
             ));
        
//#line 29
final int i =
          (4);
        
//#line 30
Program.
                      MyProgram_run(
                      m,
                      i);
    }
    
    
//#line 32
public static void
                  MyProgram_run(
                  final MR x,
                  final int i) {
        
//#line 33
final java.
          lang.
          String s =
          ("run: i = ");
        
//#line 34
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.print(s);
        
//#line 35
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println(i);
        
//#line 36
final int z =
          (0);
        
//#line 37
final int one =
          (1);
        
//#line 38
final boolean b =
          (i >
             z);
        
//#line 39
if (b) {
            
//#line 40
final int imo =
              (i -
                 one);
            
//#line 41
Program.
                          MyProgram_go(
                          x,
                          imo);
        }
    }
    
    
//#line 44
public static void
                  MyProgram_go(
                  final MR y,
                  final int j) {
        
//#line 45
final java.
          lang.
          String s =
          ("go: j = ");
        
//#line 46
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.print(s);
        
//#line 47
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println(j);
        
//#line 48
final int z =
          (0);
        
//#line 49
final int one =
          (1);
        
//#line 50
final boolean b1 =
          (j >
             one);
        
//#line 51
if (b1) {
            
//#line 52
Program.
                          MyProgram_MR_run(
                          y);
        }
        
//#line 54
final boolean b2 =
          (j >
             z);
        
//#line 55
if (b2) {
            
//#line 56
final int jmo =
              (j -
                 one);
            
//#line 57
Program.
                          MyProgram_run(
                          y,
                          jmo);
        }
    }
    
    
//#line 60
public static void
                  MyProgram_MR_run(
                  final MR th) {
        
//#line 61
Program.
                      MyProgram_MR_map(
                      th);
        
//#line 62
Program.
                      MyProgram_MR_reduce(
                      th);
        
//#line 63
final int tot =
          (/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(th))/* } */.total);
        
//#line 64
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println(tot);
    }
    
    
//#line 66
public static void
                  MyProgram_MR_map(
                  final MR th) {
        
//#line 67
final x10.
          lang.
          IntReferenceArray thisa =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(th))/* } */.a));
        
//#line 68
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 69
/* template:forloop { */
            for (java.util.Iterator p__ = (thisa.
                                             distribution.
                                             region).iterator(); p__.hasNext(); ) {
            	final  x10.
              lang.
              point p = (x10.
              lang.
              point) p__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 70
final x10.
                  lang.
                  dist di =
                  (x10.
                    lang.
                    dist)
                    ((thisa.
                        distribution));
                
//#line 71
final x10.
                  lang.
                  place pla =
                  (di.
                     get(
                     p));
                
//#line 72
final T1 y =
                  (new T1(
                     thisa,
                     th,
                     p));
                
//#line 73
/* template:Async { */(x10.lang.Runtime.asPlace(pla)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 74
Program.
                                  MyProgram_thread1(
                                  y);
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
    
    
//#line 79
public static int
                  MyProgram_MR_f(
                  final MR th,
                  final int x) {
        
//#line 80
final int res =
          (x *
             x);
        
//#line 81
return res;
    }
    
    
//#line 83
public static void
                  MyProgram_MR_reduce(
                  final MR th) {
        
//#line 84
final x10.
          lang.
          place h =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 85
final x10.
          lang.
          IntReferenceArray thisa =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(th))/* } */.a));
        
//#line 86
/* template:forloop { */
        for (java.util.Iterator p__ = (thisa.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 87
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 88
final x10.
                  lang.
                  dist di =
                  (x10.
                    lang.
                    dist)
                    ((thisa.
                        distribution));
                
//#line 89
final x10.
                  lang.
                  place pla =
                  (di.
                     get(
                     p));
                
//#line 90
final T3 y =
                  (new T3(
                     thisa,
                     th,
                     p,
                     h));
                
//#line 91
/* template:Async { */(x10.lang.Runtime.asPlace(pla)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 92
Program.
                                  MyProgram_thread3(
                                  y);
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
    
    
//#line 97
public static void
                  MyProgram_thread1(
                  final T1 z) {
        
//#line 98
final x10.
          lang.
          IntReferenceArray thisa =
          (x10.
            lang.
            IntReferenceArray)
            ((z.
                thisa));
        
//#line 99
final MR th =
          (z.
             th);
        
//#line 100
x10.
          lang.
          point p =
          (z.
             p);
        
//#line 101
final int i =
          (/* template:array_get { */((thisa).get(p))/* } */);
        
//#line 102
final int mrf =
          (Program.
             MyProgram_MR_f(
             th,
             i));
        
//#line 103
final int X10_TEMP12 =
          (mrf);
        
//#line 104
/* template:array_set { */(thisa).set((X10_TEMP12),p)/* } */;
    }
    
    
//#line 106
public static void
                   MyProgram_thread2(
                   final T2 z) {
        
//#line 107
final MR th =
          (z.
             th);
        
//#line 108
final int v =
          (z.
             v);
        
//#line 109
final int i =
          (/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(th))/* } */.total);
        
//#line 110
final int iv =
          (i +
             v);
        
//#line 111
final int X10_TEMP7 =
          (iv);
        
//#line 112
/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(th))/* } */.total =
          ((X10_TEMP7));
    }
    
    
//#line 114
public static void
                   MyProgram_thread3(
                   final T3 z) {
        
//#line 115
final x10.
          lang.
          IntReferenceArray thisa =
          (x10.
            lang.
            IntReferenceArray)
            ((z.
                thisa));
        
//#line 116
final MR th =
          (z.
             th);
        
//#line 117
x10.
          lang.
          point p =
          (z.
             p);
        
//#line 118
x10.
          lang.
          place h =
          (z.
             h);
        
//#line 119
final int v =
          (/* template:array_get { */((thisa).get(p))/* } */);
        
//#line 120
final T2 y =
          (new T2(
             th,
             v));
        
//#line 121
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
        	(new x10.runtime.Activity() {
        		public void runX10Task() {
        			{
            
//#line 122
Program.
                           MyProgram_thread2(
                           y);
        }
        		}
        	});/* } */
    }
    
    
//#line 125
public static java.
                   lang.
                   String
                   T1_toString(
                   final T1 X10_TEMP0) {
        
//#line 126
final java.
          lang.
          String s =
          ("");
        
//#line 127
return s;
    }
    
    
//#line 129
public static java.
                   lang.
                   String
                   T2_toString(
                   final T2 X10_TEMP0) {
        
//#line 130
final java.
          lang.
          String s =
          ("");
        
//#line 131
return s;
    }
    
    
//#line 133
public static java.
                   lang.
                   String
                   T3_toString(
                   final T3 X10_TEMP0) {
        
//#line 134
final java.
          lang.
          String s =
          ("");
        
//#line 135
return s;
    }
    
    
//#line 8
public Program() {
        
//#line 8
super();
    }
}

class MyProgram
extends x10.
  lang.
  Object
{
    
    
//#line 140
public MyProgram() {
        
//#line 140
super();
    }
}

class MR
extends x10.
  lang.
  Object
{
    
//#line 144
public x10.
      lang.
      IntReferenceArray
      a;
    
//#line 145
public int
      total;
    
    
//#line 148
public MR() {
        
//#line 148
super();
        
//#line 149
final x10.
          lang.
          dist dd =
          (x10.
            lang.
            dist)
            ((Program.
                _MyProgram_d));
        
//#line 150
final x10.
          lang.
          IntReferenceArray X10_TEMP4 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public int apply(/* Join: { */x10.
                lang.
                point __var0__/* } */, int dummy) { {
                  
//#line 150
final int i =
                    /* template:array_get { */((__var0__).get(0))/* } */;
                  
//#line 151
return i;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 155
a =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP4));
        
//#line 156
final int X10_TEMP6 =
          (0);
        
//#line 157
total =
          ((X10_TEMP6));
    }
}

class T1
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 164
final public x10.
      lang.
      IntReferenceArray
      thisa;
    
//#line 165
final public MR
      th;
    
//#line 166
final public x10.
      lang.
      point
      p;
    
    
//#line 169
public T1(final x10.
                             lang.
                             IntReferenceArray a_thisa,
                           final MR a_th,
                           final x10.
                             lang.
                             point a_p) {
        
//#line 169
super();
        
//#line 170
thisa =
          (x10.
            lang.
            IntReferenceArray)
            ((a_thisa));
        
//#line 171
th =
          ((a_th));
        
//#line 172
p =
          ((a_p));
    }
}

class T2
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 179
final public MR
      th;
    
//#line 180
final public int
      v;
    
    
//#line 183
public T2(final MR a_th,
                           final int a_v) {
        
//#line 183
super();
        
//#line 184
th =
          ((a_th));
        
//#line 185
v =
          ((a_v));
    }
}

class T3
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 192
final public x10.
      lang.
      IntReferenceArray
      thisa;
    
//#line 193
final public MR
      th;
    
//#line 194
final public x10.
      lang.
      point
      p;
    
//#line 195
final public x10.
      lang.
      place
      h;
    
    
//#line 198
public T3(final x10.
                             lang.
                             IntReferenceArray a_thisa,
                           final MR a_th,
                           final x10.
                             lang.
                             point a_p,
                           final x10.
                             lang.
                             place a_h) {
        
//#line 198
super();
        
//#line 199
thisa =
          (x10.
            lang.
            IntReferenceArray)
            ((a_thisa));
        
//#line 200
th =
          ((a_th));
        
//#line 201
p =
          ((a_p));
        
//#line 202
h =
          ((a_h));
    }
}
