import x10.lang.*;

public class SORMain
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
MyProgram.
                     run();
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 1
public SORMain() {
        
//#line 1
super();
    }
}

class MyProgram
extends x10.
  lang.
  Object
{
    
//#line 8
final public static int
      JACOBI_NUM_ITER =
      100;
    
//#line 9
final public static long
      RANDOM_SEED =
      10101010;
    
//#line 10
final public static long
      multiplier =
      25214903917L;
    
//#line 11
final public static long
      addend =
      11L;
    
//#line 12
final public static long
      numberone =
      1;
    
//#line 13
final public static long
      oneL =
      1L;
    
//#line 14
final public static int
      fortyeight =
      48;
    
//#line 15
final public static long
      maskplusone =
      oneL <<
      fortyeight;
    
//#line 16
final public static long
      mask =
      maskplusone -
      numberone;
    
    
//#line 18
public static void
                  run(
                  ) {
        
//#line 19
final SOR ss =
          new SOR(
          );
        
//#line 20
kernel(
                      ss);
        
//#line 21
validate(
                      ss);
    }
    
    
//#line 24
public static void
                  kernel(
                  final SOR s) {
        
//#line 25
final int ten =
          10;
        
//#line 26
final Random rr =
          /* template:place-check { */((SOR) x10.lang.Runtime.hereCheck(s))/* } */.R;
        
//#line 27
x10.
          lang.
          DoubleReferenceArray G =
          RandomMatrix(
            ten,
            ten,
            rr);
        
//#line 28
final int jni =
          JACOBI_NUM_ITER;
        
//#line 29
final double oneandaquarter =
          1.25;
        
//#line 30
SORrun(
                      s,
                      oneandaquarter,
                      G,
                      jni);
    }
    
    
//#line 33
public static x10.
                  lang.
                  DoubleReferenceArray
                  RandomMatrix(
                  final int M,
                  final int N,
                  final Random R) {
        
//#line 36
final int one =
          1;
        
//#line 37
final int ub1 =
          M -
          one;
        
//#line 38
final int ub2 =
          N -
          one;
        
//#line 39
final x10.
          lang.
          region r1 =
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
              ub1));
        
//#line 40
final x10.
          lang.
          region r2 =
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
              ub2));
        
//#line 41
final x10.
          lang.
          dist d =
          blockStar(
            r1,
            r2);
        
//#line 42
final x10.
          lang.
          DoubleReferenceArray t =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 43
final x10.
          lang.
          region rr =
          t.
            region;
        
//#line 44
/* template:forloop-mult { */{
        x10.lang.region __var6__ = (x10.lang.region) rr;
        if (__var6__.size() > 0 && (__var6__ instanceof x10.array.MultiDimRegion || __var6__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var7__ = __var6__.rank(0).low(), __var8__ = __var6__.rank(0).high(); __var7__ <= __var8__; __var7__++)
        /* } */
        /* template:forloop-mult-each { */
        for (int __var9__ = __var6__.rank(1).low(), __var10__ = __var6__.rank(1).high(); __var9__ <= __var10__; __var9__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var7__;
        /* } */
        /* template:final-var-assign { */
        final int j = __var9__;
        /* } */
        /* } */
{
            
//#line 45
final double dd =
              nextDouble(
                R);
            
//#line 46
final double small =
              1.0E-6;
            
//#line 47
final double d2 =
              dd *
              small;
            
//#line 48
write(
                          t,
                          i,
                          j,
                          d2);
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var0____ = (__var6__).iterator(); __var0____.hasNext(); ) {
        	final  x10.
          lang.
          point __var0__ = (x10.
          lang.
          point) __var0____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var0__).get(0))/* } */;
final int j =
          /* template:array_get { */((__var0__).get(1))/* } */;/* } */
{
            
//#line 45
final double dd =
              nextDouble(
                R);
            
//#line 46
final double small =
              1.0E-6;
            
//#line 47
final double d2 =
              dd *
              small;
            
//#line 48
write(
                          t,
                          i,
                          j,
                          d2);
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 50
return t;
    }
    
    
//#line 53
public static void
                  write(
                  final x10.
                    lang.
                    DoubleReferenceArray t,
                  final int i,
                  final int j,
                  final double v) {
        
//#line 54
final x10.
          lang.
          dist d =
          t.
            distribution;
        
//#line 55
final x10.
          lang.
          place pl =
          d.
            get(
            i,
            j);
        
//#line 56
final T1 y =
          new T1(
          t,
          i,
          j,
          v);
        
//#line 57
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 57
/* template:Async { */(x10.lang.Runtime.asPlace(pl)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 57
thread1(
                              y);
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp11) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp11);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 60
public static void
                  thread1(
                  final T1 z) {
        
//#line 61
final x10.
          lang.
          DoubleReferenceArray t =
          z.
            t;
        
//#line 62
final int i =
          z.
            i;
        
//#line 63
final int j =
          z.
            j;
        
//#line 64
final double v =
          z.
            v;
        
//#line 65
/* template:array_set { */(t).set(v,/* Join: { */i,j/* } */)/* } */;
    }
    
    
//#line 68
public static x10.
                  lang.
                  dist
                  blockStar(
                  final x10.
                    lang.
                    region r1,
                  final x10.
                    lang.
                    region r2) {
        
//#line 69
final x10.
          lang.
          dist d1 =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 69
public x10.
                            lang.
                            dist
                            checkCast(
                            final x10.
                              lang.
                              dist x10_generated_objToCast) {
                  
//#line 69
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
              r1));
        
//#line 70
final x10.
          lang.
          dist dres =
          distTimesRegion(
            d1,
            r2);
        
//#line 71
return dres;
    }
    
    
//#line 74
public static x10.
                  lang.
                  dist
                  distTimesRegion(
                  final x10.
                    lang.
                    dist d,
                  final x10.
                    lang.
                    region r) {
        
//#line 75
final x10.
          lang.
          region r0 =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 75
public x10.
                            lang.
                            region
                            checkCast(
                            final x10.
                              lang.
                              region x10_generated_objToCast) {
                  
//#line 75
return (((((((x10.
                                             lang.
                                             region)
                                             x10_generated_objToCast)).
                                           rank() ==
                                           2)))
                                        ? (x10.
                                            lang.
                                            region)
                                            x10_generated_objToCast
                                        : (x10.
                                            lang.
                                            region)
                                            x10.
                                              runtime.
                                              RuntimeCastChecker.
                                              throwClassCastException(
                                              (x10.
                                                lang.
                                                region)
                                                x10_generated_objToCast,
                                              "Constraint is not meet"));
              }
          }.
            checkCast(
            x10.
              lang.
              region.
              factory.
              emptyRegion(
              2));
        
//#line 76
final x10.
          lang.
          place h =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 77
x10.
          lang.
          dist d0 =
          x10.
            lang.
            dist.
            factory.
            constant(
            r0,
            h);
        
//#line 78
final x10.
          lang.
          dist d3 =
          (x10.
            lang.
            dist)
            x10.
              lang.
              dist.
              UNIQUE;
        
//#line 79
final x10.
          lang.
          region r3 =
          d3.
            region;
        
//#line 80
/* template:forloop-mult { */{
        x10.lang.region __var12__ = (x10.lang.region) r3;
        if (__var12__.size() > 0 && (__var12__ instanceof x10.array.MultiDimRegion || __var12__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var13__ = __var12__.rank(0).low(), __var14__ = __var12__.rank(0).high(); __var13__ <= __var14__; __var13__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int pl = __var13__;
        /* } */
        /* } */
{
            
//#line 81
x10.
              lang.
              place p =
              x10.
                lang.
                place.
                places(
                pl);
            
//#line 82
final x10.
              lang.
              dist restr_d =
              d.
                restriction(
                p);
            
//#line 83
final x10.
              lang.
              region restr_r =
              restr_d.
                region;
            
//#line 84
final x10.
              lang.
              region comb_r =
              x10.
                lang.
                region.
                factory.
                region(
                restr_r,
                r);
            
//#line 85
final x10.
              lang.
              dist comb_d =
              x10.
                lang.
                dist.
                factory.
                constant(
                comb_r,
                p);
            
//#line 86
d0 =
              d0.
                union(
                comb_d);
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var1____ = (__var12__).iterator(); __var1____.hasNext(); ) {
        	final  x10.
          lang.
          point __var1__ = (x10.
          lang.
          point) __var1____.next();
        	/* Join: { *//* Join: { */final int pl =
          /* template:array_get { */((__var1__).get(0))/* } */;/* } */
{
            
//#line 81
x10.
              lang.
              place p =
              x10.
                lang.
                place.
                places(
                pl);
            
//#line 82
final x10.
              lang.
              dist restr_d =
              d.
                restriction(
                p);
            
//#line 83
final x10.
              lang.
              region restr_r =
              restr_d.
                region;
            
//#line 84
final x10.
              lang.
              region comb_r =
              x10.
                lang.
                region.
                factory.
                region(
                restr_r,
                r);
            
//#line 85
final x10.
              lang.
              dist comb_d =
              x10.
                lang.
                dist.
                factory.
                constant(
                comb_r,
                p);
            
//#line 86
d0 =
              d0.
                union(
                comb_d);
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 88
return d0;
    }
    
    
//#line 91
public static void
                  validate(
                  final SOR s) {
        
//#line 92
final double gtotal =
          /* template:place-check { */((SOR) x10.lang.Runtime.hereCheck(s))/* } */.gtotal;
        
//#line 93
final double fourandahalf =
          4.5185971433257635E-5;
        
//#line 94
final double difference =
          gtotal -
          fourandahalf;
        
//#line 95
final double dev =
          java.
            lang.
            Math.
            abs(
            difference);
        
//#line 96
final double small =
          1.0E-12;
        
//#line 97
final boolean b =
          dev >
          small;
        
//#line 98
if (b) {
            
//#line 99
final java.
              lang.
              String s1 =
              "Validation failed";
            
//#line 100
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println(s1);
            
//#line 101
final java.
              lang.
              String s2 =
              "gtotal = ";
            
//#line 102
final java.
              lang.
              String s3 =
              "  ";
            
//#line 103
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.print(s2);
            
//#line 104
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.print(gtotal);
            
//#line 105
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.print(s3);
            
//#line 106
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println(dev);
            
//#line 107
final java.
              lang.
              String s4 =
              "Validation failed";
            
//#line 108
throw new java.
              lang.
              RuntimeException(
              s4);
        }
    }
    
    
//#line 112
public static double
                   read(
                   final x10.
                     lang.
                     DoubleReferenceArray G,
                   final int i,
                   final int j) {
        
//#line 115
final x10.
          lang.
          region r =
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
              0));
        
//#line 116
final x10.
          lang.
          place h =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 117
final x10.
          lang.
          dist d =
          x10.
            lang.
            dist.
            factory.
            constant(
            r,
            h);
        
//#line 118
final x10.
          lang.
          DoubleReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 119
final x10.
          lang.
          place phere =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 120
final x10.
          lang.
          dist G_d =
          G.
            distribution;
        
//#line 121
final x10.
          lang.
          place h2 =
          G_d.
            get(
            i,
            j);
        
//#line 122
final T2 y =
          new T2(
          G,
          i,
          j,
          phere,
          result);
        
//#line 123
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 123
/* template:Async { */(x10.lang.Runtime.asPlace(h2)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 123
thread2(
                               y);
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp15) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp15);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 124
final int zero =
          0;
        
//#line 125
final double res =
          /* template:array_get { */((result).get(zero))/* } */;
        
//#line 126
return res;
    }
    
    
//#line 129
public static void
                   thread2(
                   final T2 z) {
        
//#line 130
final x10.
          lang.
          DoubleReferenceArray G =
          z.
            G;
        
//#line 131
final int i =
          z.
            i;
        
//#line 132
final int j =
          z.
            j;
        
//#line 133
final x10.
          lang.
          place phere =
          z.
            phere;
        
//#line 134
final x10.
          lang.
          DoubleReferenceArray result =
          z.
            result;
        
//#line 136
final double val =
          /* template:array_get { */((G).get(/* Join: { */i,j/* } */))/* } */;
        
//#line 137
final T3 y =
          new T3(
          result,
          val);
        
//#line 138
/* template:Async { */(x10.lang.Runtime.asPlace(phere)).runAsync
        	(new x10.runtime.Activity() {
        		public void runX10Task() {
        			{
            
//#line 138
thread3(
                           y);
        }
        		}
        	});/* } */
    }
    
    
//#line 141
public static void
                   thread3(
                   final T3 z) {
        
//#line 142
final x10.
          lang.
          DoubleReferenceArray result =
          z.
            result;
        
//#line 143
final double val =
          z.
            val;
        
//#line 145
final int zero =
          0;
        
//#line 146
/* template:array_set { */(result).set(val,zero)/* } */;
    }
    
    
//#line 149
public static void
                   SORrun(
                   final SOR s,
                   final double omega,
                   final x10.
                     lang.
                     DoubleReferenceArray G,
                   final int num_iterations) {
        
//#line 152
final int zero =
          0;
        
//#line 153
final int one =
          1;
        
//#line 154
final int two =
          2;
        
//#line 155
final x10.
          lang.
          dist g_d =
          G.
            distribution;
        
//#line 156
final x10.
          lang.
          region g_r =
          g_d.
            region;
        
//#line 157
final x10.
          lang.
          region g_r0 =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 157
public x10.
                             lang.
                             region
                             checkCast(
                             final x10.
                               lang.
                               region x10_generated_objToCast) {
                  
//#line 157
return (((((((x10.
                                              lang.
                                              region)
                                              x10_generated_objToCast)).
                                            rank() ==
                                            1)))
                                         ? (x10.
                                             lang.
                                             region)
                                             x10_generated_objToCast
                                         : (x10.
                                             lang.
                                             region)
                                             x10.
                                               runtime.
                                               RuntimeCastChecker.
                                               throwClassCastException(
                                               (x10.
                                                 lang.
                                                 region)
                                                 x10_generated_objToCast,
                                               "Constraint is not meet"));
              }
          }.
            checkCast(
            (g_r.
               rank(
               zero)));
        
//#line 158
final x10.
          lang.
          region g_r1 =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 158
public x10.
                             lang.
                             region
                             checkCast(
                             final x10.
                               lang.
                               region x10_generated_objToCast) {
                  
//#line 158
return (((((((x10.
                                              lang.
                                              region)
                                              x10_generated_objToCast)).
                                            rank() ==
                                            1)))
                                         ? (x10.
                                             lang.
                                             region)
                                             x10_generated_objToCast
                                         : (x10.
                                             lang.
                                             region)
                                             x10.
                                               runtime.
                                               RuntimeCastChecker.
                                               throwClassCastException(
                                               (x10.
                                                 lang.
                                                 region)
                                                 x10_generated_objToCast,
                                               "Constraint is not meet"));
              }
          }.
            checkCast(
            (g_r.
               rank(
               one)));
        
//#line 159
final int M =
          g_r0.
            size();
        
//#line 160
final int N =
          g_r1.
            size();
        
//#line 164
final int Mm1 =
          M -
          one;
        
//#line 165
final int Nm1 =
          N -
          one;
        
//#line 169
final int ni_plusone =
          num_iterations -
          one;
        
//#line 170
final x10.
          lang.
          region reg1 =
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
              ni_plusone));
        
//#line 171
final x10.
          lang.
          region reg2 =
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
              1));
        
//#line 172
/* template:forloop-mult { */{
        x10.lang.region __var16__ = (x10.lang.region) reg1;
        if (__var16__.size() > 0 && (__var16__ instanceof x10.array.MultiDimRegion || __var16__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var17__ = __var16__.rank(0).low(), __var18__ = __var16__.rank(0).high(); __var17__ <= __var18__; __var17__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int p = __var17__;
        /* } */
        /* } */
{
            
//#line 173
/* template:forloop-mult { */{
            x10.lang.region __var19__ = (x10.lang.region) reg2;
            if (__var19__.size() > 0 && (__var19__ instanceof x10.array.MultiDimRegion || __var19__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var20__ = __var19__.rank(0).low(), __var21__ = __var19__.rank(0).high(); __var20__ <= __var21__; __var20__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int o = __var20__;
            /* } */
            /* } */
{
                
//#line 174
final int Mm2 =
                  Mm1 -
                  one;
                
//#line 175
final int one_plus_o =
                  one +
                  o;
                
//#line 176
final int mop =
                  Mm2 -
                  one_plus_o;
                
//#line 177
final int mopdivtwo =
                  mop /
                  two;
                
//#line 178
final x10.
                  lang.
                  region reg3 =
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
                      mopdivtwo));
                
//#line 179
final x10.
                  lang.
                  place h =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 180
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 180
/* template:forloop-mult { */{
                    x10.lang.region __var23__ = (x10.lang.region) reg3;
                    if (__var23__.size() > 0 && (__var23__ instanceof x10.array.MultiDimRegion || __var23__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var24__ = __var23__.rank(0).low(), __var25__ = __var23__.rank(0).high(); __var24__ <= __var25__; __var24__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int ii = __var24__;
                    /* } */
                    /* } */
{
                        
//#line 181
final T4 y =
                          new T4(
                          ii,
                          o,
                          G,
                          Nm1,
                          omega);
                        
//#line 182
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 182
thread4(
                                           y);
                        }
                        		}
                        	});/* } */
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var4____ = (__var23__).iterator(); __var4____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var4__ = (x10.
                      lang.
                      point) __var4____.next();
                    	/* Join: { *//* Join: { */final int ii =
                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                        
//#line 181
final T4 y =
                          new T4(
                          ii,
                          o,
                          G,
                          Nm1,
                          omega);
                        
//#line 182
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 182
thread4(
                                           y);
                        }
                        		}
                        	});/* } */
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }
                	} catch (Throwable tmp22) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp22);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var3____ = (__var19__).iterator(); __var3____.hasNext(); ) {
            	final  x10.
              lang.
              point __var3__ = (x10.
              lang.
              point) __var3____.next();
            	/* Join: { *//* Join: { */final int o =
              /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                
//#line 174
final int Mm2 =
                  Mm1 -
                  one;
                
//#line 175
final int one_plus_o =
                  one +
                  o;
                
//#line 176
final int mop =
                  Mm2 -
                  one_plus_o;
                
//#line 177
final int mopdivtwo =
                  mop /
                  two;
                
//#line 178
final x10.
                  lang.
                  region reg3 =
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
                      mopdivtwo));
                
//#line 179
final x10.
                  lang.
                  place h =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 180
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 180
/* template:forloop-mult { */{
                    x10.lang.region __var27__ = (x10.lang.region) reg3;
                    if (__var27__.size() > 0 && (__var27__ instanceof x10.array.MultiDimRegion || __var27__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var28__ = __var27__.rank(0).low(), __var29__ = __var27__.rank(0).high(); __var28__ <= __var29__; __var28__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int ii = __var28__;
                    /* } */
                    /* } */
{
                        
//#line 181
final T4 y =
                          new T4(
                          ii,
                          o,
                          G,
                          Nm1,
                          omega);
                        
//#line 182
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 182
thread4(
                                           y);
                        }
                        		}
                        	});/* } */
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var4____ = (__var27__).iterator(); __var4____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var4__ = (x10.
                      lang.
                      point) __var4____.next();
                    	/* Join: { *//* Join: { */final int ii =
                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                        
//#line 181
final T4 y =
                          new T4(
                          ii,
                          o,
                          G,
                          Nm1,
                          omega);
                        
//#line 182
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 182
thread4(
                                           y);
                        }
                        		}
                        	});/* } */
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }
                	} catch (Throwable tmp26) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp26);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var2____ = (__var16__).iterator(); __var2____.hasNext(); ) {
        	final  x10.
          lang.
          point __var2__ = (x10.
          lang.
          point) __var2____.next();
        	/* Join: { *//* Join: { */final int p =
          /* template:array_get { */((__var2__).get(0))/* } */;/* } */
{
            
//#line 173
/* template:forloop-mult { */{
            x10.lang.region __var30__ = (x10.lang.region) reg2;
            if (__var30__.size() > 0 && (__var30__ instanceof x10.array.MultiDimRegion || __var30__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var31__ = __var30__.rank(0).low(), __var32__ = __var30__.rank(0).high(); __var31__ <= __var32__; __var31__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int o = __var31__;
            /* } */
            /* } */
{
                
//#line 174
final int Mm2 =
                  Mm1 -
                  one;
                
//#line 175
final int one_plus_o =
                  one +
                  o;
                
//#line 176
final int mop =
                  Mm2 -
                  one_plus_o;
                
//#line 177
final int mopdivtwo =
                  mop /
                  two;
                
//#line 178
final x10.
                  lang.
                  region reg3 =
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
                      mopdivtwo));
                
//#line 179
final x10.
                  lang.
                  place h =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 180
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 180
/* template:forloop-mult { */{
                    x10.lang.region __var34__ = (x10.lang.region) reg3;
                    if (__var34__.size() > 0 && (__var34__ instanceof x10.array.MultiDimRegion || __var34__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var35__ = __var34__.rank(0).low(), __var36__ = __var34__.rank(0).high(); __var35__ <= __var36__; __var35__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int ii = __var35__;
                    /* } */
                    /* } */
{
                        
//#line 181
final T4 y =
                          new T4(
                          ii,
                          o,
                          G,
                          Nm1,
                          omega);
                        
//#line 182
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 182
thread4(
                                           y);
                        }
                        		}
                        	});/* } */
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var4____ = (__var34__).iterator(); __var4____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var4__ = (x10.
                      lang.
                      point) __var4____.next();
                    	/* Join: { *//* Join: { */final int ii =
                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                        
//#line 181
final T4 y =
                          new T4(
                          ii,
                          o,
                          G,
                          Nm1,
                          omega);
                        
//#line 182
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 182
thread4(
                                           y);
                        }
                        		}
                        	});/* } */
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }
                	} catch (Throwable tmp33) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp33);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var3____ = (__var30__).iterator(); __var3____.hasNext(); ) {
            	final  x10.
              lang.
              point __var3__ = (x10.
              lang.
              point) __var3____.next();
            	/* Join: { *//* Join: { */final int o =
              /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                
//#line 174
final int Mm2 =
                  Mm1 -
                  one;
                
//#line 175
final int one_plus_o =
                  one +
                  o;
                
//#line 176
final int mop =
                  Mm2 -
                  one_plus_o;
                
//#line 177
final int mopdivtwo =
                  mop /
                  two;
                
//#line 178
final x10.
                  lang.
                  region reg3 =
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
                      mopdivtwo));
                
//#line 179
final x10.
                  lang.
                  place h =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 180
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 180
/* template:forloop-mult { */{
                    x10.lang.region __var38__ = (x10.lang.region) reg3;
                    if (__var38__.size() > 0 && (__var38__ instanceof x10.array.MultiDimRegion || __var38__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var39__ = __var38__.rank(0).low(), __var40__ = __var38__.rank(0).high(); __var39__ <= __var40__; __var39__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int ii = __var39__;
                    /* } */
                    /* } */
{
                        
//#line 181
final T4 y =
                          new T4(
                          ii,
                          o,
                          G,
                          Nm1,
                          omega);
                        
//#line 182
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 182
thread4(
                                           y);
                        }
                        		}
                        	});/* } */
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var4____ = (__var38__).iterator(); __var4____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var4__ = (x10.
                      lang.
                      point) __var4____.next();
                    	/* Join: { *//* Join: { */final int ii =
                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                        
//#line 181
final T4 y =
                          new T4(
                          ii,
                          o,
                          G,
                          Nm1,
                          omega);
                        
//#line 182
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 182
thread4(
                                           y);
                        }
                        		}
                        	});/* } */
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }
                	} catch (Throwable tmp37) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp37);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 188
final double gs =
          G.
            sum();
        
//#line 189
/* template:place-check { */((SOR) x10.lang.Runtime.hereCheck(s))/* } */.gtotal =
          gs;
    }
    
    
//#line 192
public static void
                   thread4(
                   final T4 z) {
        
//#line 193
final int ii =
          z.
            ii;
        
//#line 194
final int o =
          z.
            o;
        
//#line 195
final x10.
          lang.
          DoubleReferenceArray G =
          z.
            G;
        
//#line 196
final int Nm1 =
          z.
            Nm1;
        
//#line 197
final double omega =
          z.
            omega;
        
//#line 199
final int one =
          1;
        
//#line 200
final int two =
          2;
        
//#line 201
final int twoii =
          two *
          ii;
        
//#line 202
final int twoii_plusone =
          twoii +
          one;
        
//#line 203
final int i =
          twoii_plusone +
          o;
        
//#line 204
final x10.
          lang.
          dist Gd =
          G.
            distribution;
        
//#line 205
final x10.
          lang.
          place p =
          Gd.
            get(
            i,
            one);
        
//#line 206
final T5 y =
          new T5(
          Nm1,
          G,
          i,
          omega);
        
//#line 207
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 207
/* template:Async { */(x10.lang.Runtime.asPlace(p)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 207
thread5(
                               y);
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp41) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp41);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 210
public static void
                   thread5(
                   final T5 z) {
        
//#line 211
final int Nm1 =
          z.
            Nm1;
        
//#line 212
final x10.
          lang.
          DoubleReferenceArray G =
          z.
            G;
        
//#line 213
final int i =
          z.
            i;
        
//#line 214
final double omega =
          z.
            omega;
        
//#line 216
final int one =
          1;
        
//#line 217
final double quarter =
          0.25;
        
//#line 218
final double onedouble =
          1.0;
        
//#line 219
final double omega_over_four =
          omega *
          quarter;
        
//#line 220
final double one_minus_omega =
          onedouble -
          omega;
        
//#line 222
final int Nm1_minusone =
          Nm1 -
          one;
        
//#line 223
final x10.
          lang.
          region reg =
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
              1,
              Nm1_minusone));
        
//#line 224
final int i_minusone =
          i -
          one;
        
//#line 225
final int i_plusone =
          i +
          one;
        
//#line 226
/* template:forloop-mult { */{
        x10.lang.region __var42__ = (x10.lang.region) reg;
        if (__var42__.size() > 0 && (__var42__ instanceof x10.array.MultiDimRegion || __var42__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var43__ = __var42__.rank(0).low(), __var44__ = __var42__.rank(0).high(); __var43__ <= __var44__; __var43__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int j = __var43__;
        /* } */
        /* } */
{
            
//#line 227
final int j_minusone =
              j -
              one;
            
//#line 228
final int j_plusone =
              j +
              one;
            
//#line 229
final double re1 =
              read(
                G,
                i_minusone,
                j);
            
//#line 230
final double re2 =
              read(
                G,
                i_plusone,
                j);
            
//#line 231
final double resum =
              re1 +
              re2;
            
//#line 232
final double g1 =
              /* template:array_get { */((G).get(/* Join: { */i,j_minusone/* } */))/* } */;
            
//#line 233
final double g2 =
              /* template:array_get { */((G).get(/* Join: { */i,j_plusone/* } */))/* } */;
            
//#line 234
final double gsum =
              g1 +
              g2;
            
//#line 235
final double re_plus_g =
              resum +
              gsum;
            
//#line 236
final double omre =
              omega_over_four *
              re_plus_g;
            
//#line 237
final double gij =
              /* template:array_get { */((G).get(/* Join: { */i,j/* } */))/* } */;
            
//#line 238
final double og =
              one_minus_omega *
              gij;
            
//#line 239
final double omreog =
              omre +
              og;
            
//#line 240
/* template:array_set { */(G).set(omreog,/* Join: { */i,j/* } */)/* } */;
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var5____ = (__var42__).iterator(); __var5____.hasNext(); ) {
        	final  x10.
          lang.
          point __var5__ = (x10.
          lang.
          point) __var5____.next();
        	/* Join: { *//* Join: { */final int j =
          /* template:array_get { */((__var5__).get(0))/* } */;/* } */
{
            
//#line 227
final int j_minusone =
              j -
              one;
            
//#line 228
final int j_plusone =
              j +
              one;
            
//#line 229
final double re1 =
              read(
                G,
                i_minusone,
                j);
            
//#line 230
final double re2 =
              read(
                G,
                i_plusone,
                j);
            
//#line 231
final double resum =
              re1 +
              re2;
            
//#line 232
final double g1 =
              /* template:array_get { */((G).get(/* Join: { */i,j_minusone/* } */))/* } */;
            
//#line 233
final double g2 =
              /* template:array_get { */((G).get(/* Join: { */i,j_plusone/* } */))/* } */;
            
//#line 234
final double gsum =
              g1 +
              g2;
            
//#line 235
final double re_plus_g =
              resum +
              gsum;
            
//#line 236
final double omre =
              omega_over_four *
              re_plus_g;
            
//#line 237
final double gij =
              /* template:array_get { */((G).get(/* Join: { */i,j/* } */))/* } */;
            
//#line 238
final double og =
              one_minus_omega *
              gij;
            
//#line 239
final double omreog =
              omre +
              og;
            
//#line 240
/* template:array_set { */(G).set(omreog,/* Join: { */i,j/* } */)/* } */;
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
    }
    
    
//#line 244
public static int
                   nextbits(
                   final Random rand,
                   final int bits) {
        
//#line 245
final long oldseed =
          /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(rand))/* } */.seed;
        
//#line 246
final long om =
          oldseed *
          multiplier;
        
//#line 247
final long oma =
          om +
          addend;
        
//#line 248
long nextseed =
          oma &
          mask;
        
//#line 249
/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(rand))/* } */.seed =
          nextseed;
        
//#line 251
final int fortyeight =
          48;
        
//#line 252
final int fb =
          fortyeight -
          bits;
        
//#line 253
final long nfb =
          nextseed >>>
          fb;
        
//#line 254
final int infb =
          (int)
            nfb;
        
//#line 255
return infb;
    }
    
    
//#line 258
public static int
                   nextInt(
                   final Random rand) {
        
//#line 259
final int thirtytwo =
          32;
        
//#line 260
final int nb =
          nextbits(
            rand,
            thirtytwo);
        
//#line 261
return nb;
    }
    
    
//#line 264
public static long
                   nextLong(
                   final Random rand) {
        
//#line 265
final int thirtytwo =
          32;
        
//#line 266
final int nb1 =
          nextbits(
            rand,
            thirtytwo);
        
//#line 267
final long lnb =
          (long)
            nb1;
        
//#line 268
final int nb2 =
          nextbits(
            rand,
            thirtytwo);
        
//#line 269
final long lnbt =
          lnb <<
          thirtytwo;
        
//#line 270
final long l =
          lnbt +
          nb2;
        
//#line 271
return l;
    }
    
    
//#line 274
public static boolean
                   nextBoolean(
                   final Random rand) {
        
//#line 275
final int zero =
          0;
        
//#line 276
final int one =
          1;
        
//#line 277
final int nb =
          nextbits(
            rand,
            one);
        
//#line 278
final boolean b =
          nb !=
          zero;
        
//#line 279
return b;
    }
    
    
//#line 282
public static double
                   nextDouble(
                   final Random rand) {
        
//#line 283
final int twentysix =
          26;
        
//#line 284
final int twentyseven =
          27;
        
//#line 285
final int fiftythree =
          53;
        
//#line 286
final long one =
          1L;
        
//#line 287
final int nb1 =
          nextbits(
            rand,
            twentysix);
        
//#line 288
final long lnb1 =
          (long)
            nb1;
        
//#line 289
final long lnb127 =
          lnb1 <<
          twentyseven;
        
//#line 290
final int nb2 =
          nextbits(
            rand,
            twentyseven);
        
//#line 291
final long lnbsum =
          lnb127 +
          nb2;
        
//#line 292
final long of =
          one <<
          fiftythree;
        
//#line 293
final double dof =
          (double)
            of;
        
//#line 294
final double res =
          lnbsum /
          dof;
        
//#line 295
return res;
    }
    
    
//#line 7
public MyProgram() {
        
//#line 7
super();
    }
}

class SOR
extends x10.
  lang.
  Object
{
    
//#line 300
final public Random
      R;
    
//#line 301
public double
      gtotal;
    
    
//#line 303
public SOR() {
        
//#line 303
super();
        
//#line 304
final long rs =
          MyProgram.
            RANDOM_SEED;
        
//#line 305
R =
          new Random(
            rs);
        
//#line 306
gtotal =
          0.0;
    }
}

class Random
extends x10.
  lang.
  Object
{
    
//#line 311
public long
      seed;
    
    
//#line 313
public Random(final long rseed) {
        
//#line 313
super();
        
//#line 314
final long mu =
          MyProgram.
            multiplier;
        
//#line 315
final long rm =
          rseed ^
          mu;
        
//#line 316
final long ma =
          MyProgram.
            mask;
        
//#line 317
seed =
          rm &
            ma;
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
    
//#line 322
final public x10.
      lang.
      DoubleReferenceArray
      t;
    
//#line 323
final public int
      i;
    
//#line 324
final public int
      j;
    
//#line 325
final public double
      v;
    
    
//#line 326
public T1(final x10.
                             lang.
                             DoubleReferenceArray a_t,
                           final int a_i,
                           final int a_j,
                           final double a_v) {
        
//#line 326
super();
        
//#line 327
t =
          a_t;
        
//#line 328
i =
          a_i;
        
//#line 329
j =
          a_j;
        
//#line 330
v =
          a_v;
    }
    
    
//#line 332
public java.
                   lang.
                   String
                   toString(
                   ) {
        
//#line 332
final java.
          lang.
          String s =
          "";
        
//#line 332
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
    
//#line 336
final public x10.
      lang.
      DoubleReferenceArray
      G;
    
//#line 337
final public int
      i;
    
//#line 338
final public int
      j;
    
//#line 339
final public x10.
      lang.
      place
      phere;
    
//#line 340
final public x10.
      lang.
      DoubleReferenceArray
      result;
    
    
//#line 341
public T2(final x10.
                             lang.
                             DoubleReferenceArray a_G,
                           final int a_i,
                           final int a_j,
                           final x10.
                             lang.
                             place a_phere,
                           final x10.
                             lang.
                             DoubleReferenceArray a_result) {
        
//#line 342
super();
        
//#line 343
G =
          a_G;
        
//#line 344
i =
          a_i;
        
//#line 345
j =
          a_j;
        
//#line 346
phere =
          a_phere;
        
//#line 347
result =
          a_result;
    }
    
    
//#line 349
public java.
                   lang.
                   String
                   toString(
                   ) {
        
//#line 349
final java.
          lang.
          String s =
          "";
        
//#line 349
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
    
//#line 353
final public x10.
      lang.
      DoubleReferenceArray
      result;
    
//#line 354
final public double
      val;
    
    
//#line 355
public T3(final x10.
                             lang.
                             DoubleReferenceArray a_result,
                           final double a_val) {
        
//#line 355
super();
        
//#line 356
result =
          a_result;
        
//#line 357
val =
          a_val;
    }
    
    
//#line 359
public java.
                   lang.
                   String
                   toString(
                   ) {
        
//#line 359
final java.
          lang.
          String s =
          "";
        
//#line 359
return s;
    }
}

class T4
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 363
final public int
      ii;
    
//#line 364
final public int
      o;
    
//#line 365
final public x10.
      lang.
      DoubleReferenceArray
      G;
    
//#line 366
final public int
      Nm1;
    
//#line 367
final public double
      omega;
    
    
//#line 368
public T4(final int a_ii,
                           final int a_o,
                           final x10.
                             lang.
                             DoubleReferenceArray a_G,
                           final int a_Nm1,
                           final double a_omega) {
        
//#line 369
super();
        
//#line 370
ii =
          a_ii;
        
//#line 371
o =
          a_o;
        
//#line 372
G =
          a_G;
        
//#line 373
Nm1 =
          a_Nm1;
        
//#line 374
omega =
          a_omega;
    }
    
    
//#line 376
public java.
                   lang.
                   String
                   toString(
                   ) {
        
//#line 376
final java.
          lang.
          String s =
          "";
        
//#line 376
return s;
    }
}

class T5
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 380
final public int
      Nm1;
    
//#line 381
final public x10.
      lang.
      DoubleReferenceArray
      G;
    
//#line 382
final public int
      i;
    
//#line 383
final public double
      omega;
    
    
//#line 384
public T5(final int a_Nm1,
                           final x10.
                             lang.
                             DoubleReferenceArray a_G,
                           final int a_i,
                           final double a_omega) {
        
//#line 385
super();
        
//#line 386
Nm1 =
          a_Nm1;
        
//#line 387
G =
          a_G;
        
//#line 388
i =
          a_i;
        
//#line 389
omega =
          a_omega;
    }
    
    
//#line 391
public java.
                   lang.
                   String
                   toString(
                   ) {
        
//#line 391
final java.
          lang.
          String s =
          "";
        
//#line 391
return s;
    }
}
