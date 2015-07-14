import x10.lang.*;

public class SparseMatmult
extends x10.
  lang.
  Object
{
    
//#line 28
public int
      nthreads;
    
//#line 30
private int
      setSize;
    
//#line 31
final private static long
      RANDOM_SEED =
      10101010;
    
//#line 35
final private static int
      SPARSE_NUM_ITER =
      200;
    
    
//#line 37
private void
                  initDataSizes_M(
                  final x10.
                    lang.
                    IntReferenceArray datasizesM) {
        
//#line 39
/* template:array_set { */(datasizesM).set(100,0)/* } */;
        
//#line 40
/* template:array_set { */(datasizesM).set(100000,1)/* } */;
        
//#line 41
/* template:array_set { */(datasizesM).set(500000,2)/* } */;
    }
    
    
//#line 45
private void
                  initDataSizes_N(
                  final x10.
                    lang.
                    IntReferenceArray datasizesN) {
        
//#line 47
/* template:array_set { */(datasizesN).set(100,0)/* } */;
        
//#line 48
/* template:array_set { */(datasizesN).set(100000,1)/* } */;
        
//#line 49
/* template:array_set { */(datasizesN).set(500000,2)/* } */;
    }
    
    
//#line 52
private void
                  initDataSizes_NZ(
                  final x10.
                    lang.
                    IntReferenceArray datasizesNZ) {
        
//#line 54
/* template:array_set { */(datasizesNZ).set(500,0)/* } */;
        
//#line 55
/* template:array_set { */(datasizesNZ).set(500000,1)/* } */;
        
//#line 56
/* template:array_set { */(datasizesNZ).set(2500000,2)/* } */;
    }
    
    
//#line 62
final private static Random
      R =
      new Random(
      RANDOM_SEED);
    
//#line 64
private x10.
      lang.
      doubleArray
      x;
    
//#line 65
private x10.
      lang.
      doubleArray
      val;
    
//#line 66
private x10.
      lang.
      intArray
      col;
    
//#line 67
private x10.
      lang.
      intArray
      row;
    
//#line 68
private x10.
      lang.
      intArray
      lowsum;
    
//#line 69
private x10.
      lang.
      intArray
      highsum;
    
//#line 71
private x10.
      lang.
      DoubleReferenceArray
      y;
    
    
//#line 73
public SparseMatmult() {
        
//#line 73
super();
        
//#line 74
this.
                      nthreads =
          x10.
            lang.
            place.
            MAX_PLACES;
    }
    
    
//#line 77
public void
                  JGFsetsize(
                  final int setSize) {
        
//#line 78
this.
                      setSize =
          setSize;
    }
    
    
//#line 81
public void
                  JGFinitialise(
                  ) {
        
//#line 82
final x10.
          lang.
          region ar =
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
              2));
        
//#line 83
final x10.
          lang.
          dist dr =
          x10.
            lang.
            dist.
            factory.
            constant(
            ar,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 84
final x10.
          lang.
          IntReferenceArray datasizes_M =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dr,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point p/* } */, int dummy) { {
            
//#line 85
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 87
final x10.
          lang.
          IntReferenceArray datasizes_N =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dr,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point p/* } */, int dummy) { {
            
//#line 88
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 90
final x10.
          lang.
          IntReferenceArray datasizes_nz =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dr,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point p/* } */, int dummy) { {
            
//#line 91
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 93
initDataSizes_M(
                      datasizes_M);
        
//#line 94
initDataSizes_N(
                      datasizes_N);
        
//#line 95
initDataSizes_NZ(
                      datasizes_nz);
        
//#line 96
final int ds_N =
          /* template:array_get { */((datasizes_N).get(setSize))/* } */;
        
//#line 97
final int ds_M =
          /* template:array_get { */((datasizes_M).get(setSize))/* } */;
        
//#line 98
final int ds_nz =
          /* template:array_get { */((datasizes_nz).get(setSize))/* } */;
        
//#line 99
final x10.
          lang.
          region r_nz =
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
              ds_nz -
                1));
        
//#line 100
final x10.
          lang.
          region r_nthreads =
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
              nthreads -
                1));
        
//#line 101
final x10.
          lang.
          dist d_M =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 101
public x10.
                             lang.
                             dist
                             checkCast(
                             final x10.
                               lang.
                               dist x10_generated_objToCast) {
                  
//#line 101
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
                  ds_M -
                    1))));
        
//#line 102
final x10.
          lang.
          region r_nthreadsPlus1 =
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
              nthreads));
        
//#line 104
final x10.
          lang.
          region ds_NReg =
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
              ds_N -
                1));
        
//#line 105
final x10.
          lang.
          dist ds_NRegDist =
          x10.
            lang.
            dist.
            factory.
            constant(
            ds_NReg,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 106
final x10.
          lang.
          DoubleReferenceArray xin =
          (x10.
            lang.
            DoubleReferenceArray)
            init(
              (x10.
                lang.
                DoubleReferenceArray)
                (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(ds_NRegDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */),
              R);
        
//#line 107
final x10.
          lang.
          region xinreg =
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
              xin.
                distribution.
                region.
                size() -
                1));
        
//#line 108
final x10.
          lang.
          dist xinregDist =
          x10.
            lang.
            dist.
            factory.
            constant(
            xinreg,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 110
x =
          (x10.
            lang.
            doubleArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(xinreg.
                                                                                                                         toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
             	public double apply(/* Join: { */x10.
               lang.
               point p/* } */, double dummy) { {
                 
//#line 110
return /* template:array_get { */((xin).get(p))/* } */;
             } }
             }/* } */,true,false,false)/* } */);
        
//#line 112
y =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d_M,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 114
final x10.
          lang.
          dist r_nthreadsregDist =
          x10.
            lang.
            dist.
            factory.
            constant(
            r_nthreads,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 115
x10.
          lang.
          IntReferenceArray ilow =
          (x10.
            lang.
            IntReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(r_nthreadsregDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 116
x10.
          lang.
          IntReferenceArray iup =
          (x10.
            lang.
            IntReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(r_nthreadsregDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 117
final x10.
          lang.
          dist r_nthreadsplus1regDist =
          x10.
            lang.
            dist.
            factory.
            constant(
            r_nthreadsPlus1,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 118
final x10.
          lang.
          dist dsnzDist =
          x10.
            lang.
            dist.
            factory.
            constant(
            r_nz,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 119
final x10.
          lang.
          IntReferenceArray rowt =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dsnzDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 120
final x10.
          lang.
          IntReferenceArray colt =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dsnzDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 121
final x10.
          lang.
          DoubleReferenceArray valt =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dsnzDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 122
x10.
          lang.
          IntReferenceArray sumT =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(r_nthreadsplus1regDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 123
int sect =
          ((ds_M +
              nthreads -
              1)) /
          nthreads;
        
//#line 125
x10.
          lang.
          IntReferenceArray rowin =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dsnzDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 126
x10.
          lang.
          IntReferenceArray colin =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dsnzDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 127
x10.
          lang.
          DoubleReferenceArray valin =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dsnzDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 128
final x10.
          lang.
          IntReferenceArray lowsumin =
          (x10.
            lang.
            IntReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(r_nthreadsregDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 129
final x10.
          lang.
          IntReferenceArray highsumin =
          (x10.
            lang.
            IntReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(r_nthreadsregDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 131
/* template:forloop { */
        for (java.util.Iterator p__ = (x10.
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
                                           ds_nz -
                                             1))).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 132
/* template:array_set { */(rowin).set(java.
                                                                 lang.
                                                                 Math.
                                                                 abs(
                                                                 /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(R))/* } */.nextInt()) %
              ds_M,p)/* } */;
            
//#line 133
/* template:array_set { */(colin).set(java.
                                                                 lang.
                                                                 Math.
                                                                 abs(
                                                                 /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(R))/* } */.nextInt()) %
              ds_N,p)/* } */;
            
//#line 134
/* template:array_set { */(valin).set(/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(R))/* } */.nextDouble(),p)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 139
/* template:forloop { */
        for (java.util.Iterator i__ = (r_nthreads).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 140
/* template:array_set { */(ilow).set(/* template:array_get { */((i).get(0))/* } */ *
              sect,i)/* } */;
            
//#line 141
/* template:array_set { */(iup).set(((((/* template:array_get { */((i).get(0))/* } */ +
                                                                   1)) *
                                                                 sect)) -
              1,i)/* } */;
            
//#line 142
if (/* template:array_get { */((iup).get(i))/* } */ >
                               ds_M) {
                
//#line 142
/* template:array_set { */(iup).set(ds_M,i)/* } */;
            }
        }/* } */
        }
        /* } */
        
        
//#line 145
/* template:forloop { */
        for (java.util.Iterator i__ = (r_nz).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 146
/* template:forloop { */
            for (java.util.Iterator j__ = (r_nthreads).iterator(); j__.hasNext(); ) {
            	final  x10.
              lang.
              point j = (x10.
              lang.
              point) j__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 147
if (((/* template:array_get { */((rowin).get(i))/* } */ >=
                                     /* template:array_get { */((ilow).get(j))/* } */)) &&
                                   ((/* template:array_get { */((rowin).get(i))/* } */ <=
                                       /* template:array_get { */((iup).get(j))/* } */))) {
                    
//#line 148
/* template:array_set { */(sumT).set(/* template:array_get { */((sumT).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(j))/* } */.add(x10.
                                                                                                                                                                                                      lang.
                                                                                                                                                                                                      point.
                                                                                                                                                                                                      factory.
                                                                                                                                                                                                      point(
                                                                                                                                                                                                      1))))/* } */ +
                      1,/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(j))/* } */.add(x10.
                                                                                                                  lang.
                                                                                                                  point.
                                                                                                                  factory.
                                                                                                                  point(
                                                                                                                  1)))/* } */;
                }
            }/* } */
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
        
//#line 153
/* template:forloop-mult { */{
        x10.lang.region __var2__ = (x10.lang.region) r_nthreads;
        if (__var2__.size() > 0 && (__var2__ instanceof x10.array.MultiDimRegion || __var2__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var3__ = __var2__.rank(0).low(), __var4__ = __var2__.rank(0).high(); __var3__ <= __var4__; __var3__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int j = __var3__;
        /* } */
        /* } */
{
            
//#line 154
/* template:forloop-mult { */{
            x10.lang.region __var5__ = (x10.lang.region) x10.
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
                                                             j));
            if (__var5__.size() > 0 && (__var5__ instanceof x10.array.MultiDimRegion || __var5__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var6__ = __var5__.rank(0).low(), __var7__ = __var5__.rank(0).high(); __var6__ <= __var7__; __var6__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var6__;
            /* } */
            /* } */
{
                
//#line 155
/* template:array_set { */(lowsumin).set(/* template:array_get { */((lowsumin).get(j))/* } */ +
                  /* template:array_get { */((sumT).get(j -
                  i))/* } */,j)/* } */;
                
//#line 156
/* template:array_set { */(highsumin).set(/* template:array_get { */((highsumin).get(j))/* } */ +
                  /* template:array_get { */((sumT).get(j -
                  i))/* } */,j)/* } */;
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var1____ = (__var5__).iterator(); __var1____.hasNext(); ) {
            	final  x10.
              lang.
              point __var1__ = (x10.
              lang.
              point) __var1____.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var1__).get(0))/* } */;/* } */
{
                
//#line 155
/* template:array_set { */(lowsumin).set(/* template:array_get { */((lowsumin).get(j))/* } */ +
                  /* template:array_get { */((sumT).get(j -
                  i))/* } */,j)/* } */;
                
//#line 156
/* template:array_set { */(highsumin).set(/* template:array_get { */((highsumin).get(j))/* } */ +
                  /* template:array_get { */((sumT).get(j -
                  i))/* } */,j)/* } */;
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
        for (java.util.Iterator __var0____ = (__var2__).iterator(); __var0____.hasNext(); ) {
        	final  x10.
          lang.
          point __var0__ = (x10.
          lang.
          point) __var0____.next();
        	/* Join: { *//* Join: { */final int j =
          /* template:array_get { */((__var0__).get(0))/* } */;/* } */
{
            
//#line 154
/* template:forloop-mult { */{
            x10.lang.region __var8__ = (x10.lang.region) x10.
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
                                                             j));
            if (__var8__.size() > 0 && (__var8__ instanceof x10.array.MultiDimRegion || __var8__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var9__ = __var8__.rank(0).low(), __var10__ = __var8__.rank(0).high(); __var9__ <= __var10__; __var9__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var9__;
            /* } */
            /* } */
{
                
//#line 155
/* template:array_set { */(lowsumin).set(/* template:array_get { */((lowsumin).get(j))/* } */ +
                  /* template:array_get { */((sumT).get(j -
                  i))/* } */,j)/* } */;
                
//#line 156
/* template:array_set { */(highsumin).set(/* template:array_get { */((highsumin).get(j))/* } */ +
                  /* template:array_get { */((sumT).get(j -
                  i))/* } */,j)/* } */;
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var1____ = (__var8__).iterator(); __var1____.hasNext(); ) {
            	final  x10.
              lang.
              point __var1__ = (x10.
              lang.
              point) __var1____.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var1__).get(0))/* } */;/* } */
{
                
//#line 155
/* template:array_set { */(lowsumin).set(/* template:array_get { */((lowsumin).get(j))/* } */ +
                  /* template:array_get { */((sumT).get(j -
                  i))/* } */,j)/* } */;
                
//#line 156
/* template:array_set { */(highsumin).set(/* template:array_get { */((highsumin).get(j))/* } */ +
                  /* template:array_get { */((sumT).get(j -
                  i))/* } */,j)/* } */;
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
        
        
//#line 160
/* template:forloop { */
        for (java.util.Iterator i1__ = (r_nz).iterator(); i1__.hasNext(); ) {
        	final  x10.
          lang.
          point i1 = (x10.
          lang.
          point) i1__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 161
/* template:forloop { */
            for (java.util.Iterator j1__ = (r_nthreads).iterator(); j1__.hasNext(); ) {
            	final  x10.
              lang.
              point j1 = (x10.
              lang.
              point) j1__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 162
if (((/* template:array_get { */((rowin).get(i1))/* } */ >=
                                     /* template:array_get { */((ilow).get(j1))/* } */)) &&
                                   ((/* template:array_get { */((rowin).get(i1))/* } */ <=
                                       /* template:array_get { */((iup).get(j1))/* } */))) {
                    
//#line 163
/* template:array_set { */(rowt).set(/* template:array_get { */((rowin).get(i1))/* } */,/* template:array_get { */((highsumin).get(j1))/* } */)/* } */;
                    
//#line 164
/* template:array_set { */(colt).set(/* template:array_get { */((colin).get(i1))/* } */,/* template:array_get { */((highsumin).get(j1))/* } */)/* } */;
                    
//#line 165
/* template:array_set { */(valt).set(/* template:array_get { */((valin).get(i1))/* } */,/* template:array_get { */((highsumin).get(j1))/* } */)/* } */;
                    
//#line 166
/* template:array_set { */(highsumin).set(/* template:array_get { */((highsumin).get(j1))/* } */ +
                      1,j1)/* } */;
                }
            }/* } */
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
        
//#line 171
final x10.
          lang.
          region rowtregion =
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
              rowt.
                distribution.
                region.
                size() -
                1));
        
//#line 172
final x10.
          lang.
          dist rowtdist =
          x10.
            lang.
            dist.
            factory.
            constant(
            rowtregion,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 173
row =
          (x10.
            lang.
            intArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(rowtregion.
                                                                                                                      toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
             	public int apply(/* Join: { */x10.
               lang.
               point i/* } */, int dummy) { {
                 
//#line 173
return /* template:array_get { */((rowt).get(i))/* } */;
             } }
             }/* } */,true,false,false)/* } */);
        
//#line 175
final x10.
          lang.
          region coltregion =
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
              colt.
                distribution.
                region.
                size() -
                1));
        
//#line 176
final x10.
          lang.
          dist coltdist =
          x10.
            lang.
            dist.
            factory.
            constant(
            coltregion,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 177
col =
          (x10.
            lang.
            intArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(coltregion.
                                                                                                                      toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
             	public int apply(/* Join: { */x10.
               lang.
               point i/* } */, int dummy) { {
                 
//#line 177
return /* template:array_get { */((colt).get(i))/* } */;
             } }
             }/* } */,true,false,false)/* } */);
        
//#line 179
final x10.
          lang.
          region valtregion =
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
              valt.
                distribution.
                region.
                size() -
                1));
        
//#line 180
final x10.
          lang.
          dist valtdist =
          x10.
            lang.
            dist.
            factory.
            constant(
            valtregion,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 181
val =
          (x10.
            lang.
            doubleArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(valtregion.
                                                                                                                         toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
             	public double apply(/* Join: { */x10.
               lang.
               point i/* } */, double dummy) { {
                 
//#line 181
return /* template:array_get { */((valt).get(i))/* } */;
             } }
             }/* } */,true,false,false)/* } */);
        
//#line 183
final x10.
          lang.
          region lowsuminregion =
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
              lowsumin.
                distribution.
                region.
                size() -
                1));
        
//#line 184
final x10.
          lang.
          dist lowsumindist =
          x10.
            lang.
            dist.
            factory.
            constant(
            lowsuminregion,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 185
lowsum =
          (x10.
            lang.
            intArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(lowsuminregion.
                                                                                                                      toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
             	public int apply(/* Join: { */x10.
               lang.
               point i/* } */, int dummy) { {
                 
//#line 185
return /* template:array_get { */((lowsumin).get(i))/* } */;
             } }
             }/* } */,true,false,false)/* } */);
        
//#line 188
final x10.
          lang.
          region highsuminregion =
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
              highsumin.
                distribution.
                region.
                size() -
                1));
        
//#line 189
final x10.
          lang.
          dist highsumindist =
          x10.
            lang.
            dist.
            factory.
            constant(
            highsuminregion,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 190
highsum =
          (x10.
            lang.
            intArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(highsuminregion.
                                                                                                                      toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
             	public int apply(/* Join: { */x10.
               lang.
               point i/* } */, int dummy) { {
                 
//#line 190
return /* template:array_get { */((highsumin).get(i))/* } */;
             } }
             }/* } */,true,false,false)/* } */);
    }
    
    
//#line 199
public void
                   JGFkernel(
                   ) {
        
//#line 200
test(
                       y,
                       val,
                       row,
                       col,
                       x,
                       SPARSE_NUM_ITER,
                       lowsum,
                       highsum);
    }
    
    
//#line 203
public void
                   initRefVal(
                   final x10.
                     lang.
                     DoubleReferenceArray refval) {
        
//#line 205
/* template:array_set { */(refval).set(0.1436496372119012,0)/* } */;
        
//#line 206
/* template:array_set { */(refval).set(150.0130719633895,1)/* } */;
        
//#line 207
/* template:array_set { */(refval).set(749.5245870753752,2)/* } */;
    }
    
    
//#line 210
public void
                   JGFvalidate(
                   ) {
        
//#line 213
x10.
          lang.
          region rtemp =
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
              2));
        
//#line 214
x10.
          lang.
          dist dtemp =
          x10.
            lang.
            dist.
            factory.
            constant(
            rtemp,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 216
x10.
          lang.
          DoubleReferenceArray refval =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dtemp,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 217
initRefVal(
                       refval);
        
//#line 218
double dev =
          java.
            lang.
            Math.
            abs(
            ytotal -
              /* template:array_get { */((refval).get(setSize))/* } */);
        
//#line 219
if (dev >
                           1.0E-10) {
            
//#line 220
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("Validation failed");
            
//#line 221
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("ytotal = " +
                                                                                                                              ytotal +
                                                                                                                              "  " +
                                                                                                                              dev +
                                                                                                                              "  " +
                                                                                                                              setSize);
            
//#line 222
throw new java.
              lang.
              RuntimeException(
              "Validation failed");
        }
    }
    
    
//#line 226
public void
                   JGFtidyup(
                   ) {
        
    }
    
    
//#line 230
public void
                   run(
                   final int setSize) {
        
//#line 232
JGFsetsize(
                       setSize);
        
//#line 233
JGFinitialise();
        
//#line 234
JGFkernel();
        
//#line 235
JGFvalidate();
        
//#line 236
JGFtidyup();
    }
    
    
//#line 243
public static x10.
                   lang.
                   DoubleReferenceArray
                   init(
                   final x10.
                     lang.
                     DoubleReferenceArray a,
                   final Random R) {
        
//#line 244
final x10.
          lang.
          region areg =
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
              a.
                distribution.
                region.
                size() -
                1));
        
//#line 245
final x10.
          lang.
          dist adist =
          x10.
            lang.
            dist.
            factory.
            constant(
            areg,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 246
/* template:forloop { */
        for (java.util.Iterator i__ = (areg).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 247
/* template:array_set { */(a).set(/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(R))/* } */.nextDouble() *
              1.0E-6,i)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 249
return a;
    }
    
    
//#line 254
public double
      ytotal;
    
    
//#line 258
public void
                   test(
                   final x10.
                     lang.
                     DoubleReferenceArray y,
                   final x10.
                     lang.
                     doubleArray val,
                   final x10.
                     lang.
                     intArray row,
                   final x10.
                     lang.
                     intArray col,
                   final x10.
                     lang.
                     doubleArray x,
                   final int NUM_ITERATIONS,
                   final x10.
                     lang.
                     intArray lowsum,
                   final x10.
                     lang.
                     intArray highsum) {
        
//#line 262
final int nz =
          val.
            region.
            size();
        
//#line 265
final x10.
          lang.
          dist dDistU =
          (x10.
            lang.
            dist)
            x10.
              lang.
              dist.
              UNIQUE;
        
//#line 266
ytotal =
          0.0;
        
//#line 271
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 271
/* template:foreach { */
            for (java.util.Iterator id1__ = (dDistU).iterator(); id1__.hasNext(); ) {
            	final  x10.
              lang.
              point id1 = (x10.
              lang.
              point) id1__.next();
            	/* Join: { *//* } */
            	x10.lang.Runtime.here().runAsync
            		(new x10.runtime.Activity() {
            			public void runX10Task() {
            				/* Join: { *//* Join: { *//* } */
{
                
//#line 272
/* template:forloop { */
                for (java.util.Iterator reps__ = (x10.
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
                                                      NUM_ITERATIONS -
                                                        1))).iterator(); reps__.hasNext(); ) {
                	final  x10.
                  lang.
                  point reps = (x10.
                  lang.
                  point) reps__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 273
/* template:forloop { */
                    for (java.util.Iterator i__ = (x10.
                                                     lang.
                                                     region.
                                                     factory.
                                                     region(
                                                     x10.
                                                       lang.
                                                       region.
                                                       factory.
                                                       region(
                                                       /* template:array_get { */((lowsum).get(id1))/* } */,
                                                       /* template:array_get { */((highsum).get(id1))/* } */ -
                                                         1))).iterator(); i__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point i = (x10.
                      lang.
                      point) i__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 279
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 279
/* template:Async { */(x10.lang.Runtime.asPlace(y.
                                                                                           distribution.
                                                                                           get(
                                                                                           /* template:array_get { */((row).get(i))/* } */))).runAsync
                            	(new x10.runtime.Activity() {
                            		public void runX10Task() {
                            			{
                                
//#line 279
/* template:array_set { */(y).set(/* template:array_get { */((y).get(/* template:array_get { */((row).get(i))/* } */))/* } */ +
                                  /* template:array_get { */((x).get(/* template:array_get { */((col).get(i))/* } */))/* } */ *
                                  /* template:array_get { */((val).get(i))/* } */,/* template:array_get { */((row).get(i))/* } */)/* } */;
                            }
                            		}
                            	});/* } */
                        }
                        	} catch (Throwable tmp12) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp12);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                    }/* } */
                    }
                    /* } */
                    
                }/* } */
                }
                /* } */
                
            }/* } */
            			}
            		});
            }
            /* } */
            
        }
        	} catch (Throwable tmp11) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp11);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 286
final x10.
          lang.
          place curr_place =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 287
final x10.
          lang.
          region tempr =
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
        
//#line 288
final x10.
          lang.
          dist tempvd =
          x10.
            lang.
            dist.
            factory.
            constant(
            tempr,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 289
final x10.
          lang.
          DoubleReferenceArray tempref =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(tempvd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point p0/* } */, double dummy) { {
            
//#line 290
return 0.0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 295
/* template:forloop { */
        for (java.util.Iterator i__ = (x10.
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
                                           nz -
                                             1))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 296
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 296
/* template:Async { */(x10.lang.Runtime.asPlace(y.
                                                                               distribution.
                                                                               get(
                                                                               /* template:array_get { */((row).get(i))/* } */))).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 298
final double temp =
                      /* template:array_get { */((y).get(/* template:array_get { */((row).get(i))/* } */))/* } */;
                    
//#line 299
/* template:Async { */(x10.lang.Runtime.asPlace(curr_place)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 301
/* template:array_set { */(tempref).set(temp,0)/* } */;
                    }
                    		}
                    	});/* } */
                }
                		}
                	});/* } */
            }
            	} catch (Throwable tmp13) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp13);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 304
ytotal =
              ytotal +
                /* template:array_get { */((tempref).get(0))/* } */;
        }/* } */
        }
        /* } */
        
    }
}
