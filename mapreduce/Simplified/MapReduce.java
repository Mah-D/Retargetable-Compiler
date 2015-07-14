import x10.lang.*;

public class MapReduce
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
MyProgram.
                     init();
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 1
public MapReduce() {
        
//#line 1
super();
    }
}

class MyProgram
extends x10.
  lang.
  Object
{
    
//#line 6
final public static x10.
      lang.
      region
      r =
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
          300));
    
//#line 7
final public static x10.
      lang.
      dist
      d =
      new x10.
        runtime.
        RuntimeCastChecker.
        DepTypeRuntimeChecking(
        ) {
          
          
//#line 7
public x10.
                       lang.
                       dist
                       checkCast(
                       final x10.
                         lang.
                         dist x10_generated_objToCast) {
              
//#line 7
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
        x10.
          lang.
          dist.
          factory.
          block(
          r));
    
    
//#line 8
public static void
                 init(
                 ) {
        
//#line 9
final MR m =
          new MR(
          );
        
//#line 10
final int i =
          4;
        
//#line 11
run(
                      m,
                      i);
    }
    
    
//#line 13
public static void
                  run(
                  final MR x,
                  final int i) {
        
//#line 14
final java.
          lang.
          String s =
          "run: i = ";
        
//#line 15
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.print(s);
        
//#line 16
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println(i);
        
//#line 17
final int z =
          0;
        
//#line 18
final int one =
          1;
        
//#line 19
final boolean b =
          i >
          z;
        
//#line 20
if (b) {
            
//#line 21
final int imo =
              i -
              one;
            
//#line 22
go(
                          x,
                          imo);
        }
    }
    
    
//#line 25
public static void
                  go(
                  final MR y,
                  final int j) {
        
//#line 26
final java.
          lang.
          String s =
          "go: j = ";
        
//#line 27
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.print(s);
        
//#line 28
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println(j);
        
//#line 29
final int z =
          0;
        
//#line 30
final int one =
          1;
        
//#line 31
final boolean b1 =
          j >
          one;
        
//#line 32
if (b1) {
            
//#line 32
MR_run(
                          y);
        }
        
//#line 33
final boolean b2 =
          j >
          z;
        
//#line 34
if (b2) {
            
//#line 35
final int jmo =
              j -
              one;
            
//#line 36
run(
                          y,
                          jmo);
        }
    }
    
    
//#line 40
public static void
                  MR_run(
                  final MR th) {
        
//#line 41
MR_map(
                      th);
        
//#line 42
MR_reduce(
                      th);
        
//#line 43
final int tot =
          /* template:place-check { */((MR) x10.lang.Runtime.hereCheck(th))/* } */.total;
        
//#line 44
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println(tot);
    }
    
    
//#line 46
public static void
                  MR_map(
                  final MR th) {
        
//#line 47
final x10.
          lang.
          IntReferenceArray thisa =
          /* template:place-check { */((MR) x10.lang.Runtime.hereCheck(th))/* } */.a;
        
//#line 48
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 48
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
                
//#line 49
final x10.
                  lang.
                  dist di =
                  thisa.
                    distribution;
                
//#line 50
final x10.
                  lang.
                  place pla =
                  di.
                    get(
                    p);
                
//#line 51
final T1 y =
                  new T1(
                  thisa,
                  th,
                  p);
                
//#line 52
/* template:Async { */(x10.lang.Runtime.asPlace(pla)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 52
thread1(
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
    
    
//#line 55
public static int
                  MR_f(
                  final MR th,
                  final int x) {
        
//#line 56
final int res =
          x *
          x;
        
//#line 57
return res;
    }
    
    
//#line 59
public static void
                  MR_reduce(
                  final MR th) {
        
//#line 60
final x10.
          lang.
          place h =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 61
final x10.
          lang.
          IntReferenceArray thisa =
          /* template:place-check { */((MR) x10.lang.Runtime.hereCheck(th))/* } */.a;
        
//#line 62
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
            
//#line 63
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 64
final x10.
                  lang.
                  dist di =
                  thisa.
                    distribution;
                
//#line 65
final x10.
                  lang.
                  place pla =
                  di.
                    get(
                    p);
                
//#line 66
final T3 y =
                  new T3(
                  thisa,
                  th,
                  p,
                  h);
                
//#line 67
/* template:Async { */(x10.lang.Runtime.asPlace(pla)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 67
thread3(
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
    
    
//#line 71
public static void
                  thread1(
                  final T1 z) {
        
//#line 72
final x10.
          lang.
          IntReferenceArray thisa =
          z.
            thisa;
        
//#line 73
final MR th =
          z.
            th;
        
//#line 74
x10.
          lang.
          point p =
          z.
            p;
        
//#line 76
final int i =
          /* template:array_get { */((thisa).get(p))/* } */;
        
//#line 77
final int mrf =
          MR_f(
            th,
            i);
        
//#line 78
/* template:array_set { */(thisa).set(mrf,p)/* } */;
    }
    
    
//#line 81
public static void
                  thread2(
                  final T2 z) {
        
//#line 82
final MR th =
          z.
            th;
        
//#line 83
final int v =
          z.
            v;
        
//#line 85
final int i =
          /* template:place-check { */((MR) x10.lang.Runtime.hereCheck(th))/* } */.total;
        
//#line 86
final int iv =
          i +
          v;
        
//#line 87
/* template:place-check { */((MR) x10.lang.Runtime.hereCheck(th))/* } */.total =
          iv;
    }
    
    
//#line 90
public static void
                  thread3(
                  final T3 z) {
        
//#line 91
final x10.
          lang.
          IntReferenceArray thisa =
          z.
            thisa;
        
//#line 92
final MR th =
          z.
            th;
        
//#line 93
x10.
          lang.
          point p =
          z.
            p;
        
//#line 94
x10.
          lang.
          place h =
          z.
            h;
        
//#line 96
final int v =
          /* template:array_get { */((thisa).get(p))/* } */;
        
//#line 97
final T2 y =
          new T2(
          th,
          v);
        
//#line 98
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
        	(new x10.runtime.Activity() {
        		public void runX10Task() {
        			{
            
//#line 98
thread2(
                          y);
        }
        		}
        	});/* } */
    }
    
    
//#line 5
public MyProgram() {
        
//#line 5
super();
    }
}

class MR
extends x10.
  lang.
  Object
{
    
//#line 103
public x10.
      lang.
      IntReferenceArray
      a;
    
//#line 104
public int
      total;
    
    
//#line 105
public MR() {
        
//#line 105
super();
        
//#line 106
final x10.
          lang.
          dist dd =
          MyProgram.
            d;
        
//#line 107
a =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public int apply(/* Join: { */x10.
             lang.
             point __var0__/* } */, int dummy) { {
               
//#line 107
final int i =
                 /* template:array_get { */((__var0__).get(0))/* } */;
               
//#line 107
return i;
           } }
           }/* } */,true,true,false)/* } */);
        
//#line 108
total =
          0;
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
    
//#line 113
final public x10.
      lang.
      IntReferenceArray
      thisa;
    
//#line 114
final public MR
      th;
    
//#line 115
final public x10.
      lang.
      point
      p;
    
    
//#line 116
public T1(final x10.
                             lang.
                             IntReferenceArray a_thisa,
                           final MR a_th,
                           final x10.
                             lang.
                             point a_p) {
        
//#line 116
super();
        
//#line 117
thisa =
          a_thisa;
        
//#line 118
th =
          a_th;
        
//#line 119
p =
          a_p;
    }
    
    
//#line 121
public java.
                   lang.
                   String
                   toString(
                   ) {
        
//#line 121
final java.
          lang.
          String s =
          "";
        
//#line 121
return s;
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
    
//#line 125
final public MR
      th;
    
//#line 126
final public int
      v;
    
    
//#line 127
public T2(final MR a_th,
                           final int a_v) {
        
//#line 127
super();
        
//#line 128
th =
          a_th;
        
//#line 129
v =
          a_v;
    }
    
    
//#line 131
public java.
                   lang.
                   String
                   toString(
                   ) {
        
//#line 131
final java.
          lang.
          String s =
          "";
        
//#line 131
return s;
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
    
//#line 135
final public x10.
      lang.
      IntReferenceArray
      thisa;
    
//#line 136
final public MR
      th;
    
//#line 137
final public x10.
      lang.
      point
      p;
    
//#line 138
final public x10.
      lang.
      place
      h;
    
    
//#line 139
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
        
//#line 140
super();
        
//#line 141
thisa =
          a_thisa;
        
//#line 142
th =
          a_th;
        
//#line 143
p =
          a_p;
        
//#line 144
h =
          a_h;
    }
    
    
//#line 146
public java.
                   lang.
                   String
                   toString(
                   ) {
        
//#line 146
final java.
          lang.
          String s =
          "";
        
//#line 146
return s;
    }
}
