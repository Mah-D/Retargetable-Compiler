import x10.lang.*;

class PoissonSolver
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 2
final public static double
      PI4I =
      0.5 /
      6.28318530717959;
    
//#line 3
final public static double
      SQT2I =
      0.707106781186548;
    
//#line 4
final public static double
      SQT2PI =
      0.797884560802865;
    
//#line 5
final public static int
      GREENS_IDX =
      0;
    
//#line 6
final public static int
      SHAPE_IDX =
      1;
    
//#line 7
final public static int
      ELECX_IDX =
      2;
    
//#line 8
final public static int
      ELECY_IDX =
      3;
    
//#line 9
final public static double
      AR =
      0.912871;
    
//#line 10
final public int
      x;
    
//#line 11
final public int
      y;
    
//#line 12
final public int
      xBits;
    
//#line 13
final public int
      yBits;
    
//#line 14
final public double
      ari;
    
//#line 15
final public double
      affp;
    
//#line 16
final public FourierTransform2D
      fft;
    
//#line 17
final public x10.
      lang.
      DoubleReferenceArray
      ffg;
    
//#line 18
final public x10.
      lang.
      doubleArray
      ffg2;
    
    
//#line 19
public PoissonSolver(final int xBits,
                                     final int yBits,
                                     final double affp) {
        
//#line 19
super();
        
//#line 20
this.
                      xBits =
          xBits;
        
//#line 21
this.
                      yBits =
          yBits;
        
//#line 22
this.
                      affp =
          affp;
        
//#line 23
final int x0 =
          1 <<
          xBits;
        
//#line 24
final int y0 =
          1 <<
          yBits;
        
//#line 25
x =
          x0;
        
//#line 26
y =
          y0;
        
//#line 27
ari =
          0;
        
//#line 28
final FourierTransform2D fft0 =
          new FourierTransform2D(
          yBits +
            1,
          xBits +
            1);
        
//#line 29
fft =
          fft0;
        
//#line 30
final x10.
          lang.
          DoubleReferenceArray tables =
          initTables(
            fft0,
            x0,
            y0,
            affp);
        
//#line 31
ffg =
          makeFFG(
            tables,
            x0,
            y0);
        
//#line 32
ffg2 =
          makeFFG2(
            tables,
            x0,
            y0);
        
//#line 33
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("Poisson Solver initialized");
    }
    
    
//#line 35
public x10.
                  lang.
                  DoubleReferenceArray
                  initTables(
                  final FourierTransform2D fft,
                  final int x,
                  final int y,
                  final double affp) {
        
//#line 36
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
              x -
                1));
        
//#line 37
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
              y));
        
//#line 38
final x10.
          lang.
          region r3 =
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
              3));
        
//#line 39
final x10.
          lang.
          dist dTable1 =
          X10Util.
            extendDistRank3D(
            X10Util.
              distBlockStar2(
              r1,
              r2),
            r3);
        
//#line 40
final x10.
          lang.
          place first =
          x10.
            lang.
            place.
            FIRST_PLACE;
        
//#line 41
final x10.
          lang.
          dist dTable2 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
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
                    x,
                    x),
                  x10.
                    lang.
                    region.
                    factory.
                    region(
                    0,
                    y),
                  x10.
                    lang.
                    region.
                    factory.
                    region(
                    0,
                    3)),
                first)));
        
//#line 42
final x10.
          lang.
          dist dTable =
          dTable1.
            union(
            dTable2);
        
//#line 43
final x10.
          lang.
          DoubleReferenceArray table =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dTable,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 44
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("Init: Green\'s function");
        
//#line 45
initGreensFnTable(
                      table,
                      fft,
                      x,
                      y,
                      affp);
        
//#line 46
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("Init: Shape factor");
        
//#line 47
initShapeFactorTable(
                      table,
                      fft,
                      x,
                      y,
                      affp);
        
//#line 48
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("Init: X Electric field");
        
//#line 49
initElectricFieldXTable(
                      table,
                      fft,
                      x,
                      y,
                      affp);
        
//#line 50
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("Init: Y Electric field");
        
//#line 51
initElectricFieldYTable(
                      table,
                      fft,
                      x,
                      y,
                      affp);
        
//#line 52
return table;
    }
    
    
//#line 54
public x10.
                  lang.
                  DoubleReferenceArray
                  makeFFG(
                  final x10.
                    lang.
                    DoubleReferenceArray table,
                  final int x,
                  final int y) {
        
//#line 55
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
              x -
                1));
        
//#line 56
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
              y));
        
//#line 57
final x10.
          lang.
          region r3 =
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
              3));
        
//#line 58
final x10.
          lang.
          dist dResult =
          X10Util.
            extendDistRank3D(
            X10Util.
              distBlockStar2(
              r1,
              r2),
            r3);
        
//#line 59
return /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dResult,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point pt/* } */, double dummy) { {
            
//#line 60
return /* template:array_get { */((table).get(pt))/* } */;
        } }
        }/* } */,true,true,false)/* } */;
    }
    
    
//#line 63
public x10.
                  lang.
                  doubleArray
                  makeFFG2(
                  final x10.
                    lang.
                    DoubleReferenceArray table,
                  final int x,
                  final int y) {
        
//#line 64
final x10.
          lang.
          region rResult =
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
              y),
            x10.
              lang.
              region.
              factory.
              region(
              0,
              3));
        
//#line 65
return (x10.
                             lang.
                             doubleArray)
                             (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(rResult.
                                                                                                                                          toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                              	public double apply(/* Join: { */x10.
                                lang.
                                point __var0__/* } */, double dummy) { {
                                  
//#line 65
final int i =
                                    /* template:array_get { */((__var0__).get(0))/* } */;
                                  
//#line 65
final int j =
                                    /* template:array_get { */((__var0__).get(1))/* } */;
                                  
//#line 66
final x10.
                                    lang.
                                    place pHere =
                                    /* template:here { */x10.lang.Runtime.here()/* } */;
                                  
//#line 67
final x10.
                                    lang.
                                    dist dDst =
                                    x10.
                                      lang.
                                      dist.
                                      factory.
                                      constant(
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
                                          0)),
                                      /* template:here { */x10.lang.Runtime.here()/* } */);
                                  
//#line 68
final x10.
                                    lang.
                                    DoubleReferenceArray rcv =
                                    /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dDst,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
                                  
//#line 69
/* template:finish { */
                                  {
                                  	x10.lang.Runtime.getCurrentActivity().startFinish();
                                  	try {
                                  		{
                                      
//#line 70
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                                                    lang.
                                                                                                    place.
                                                                                                    FIRST_PLACE)).runAsync
                                      	(new x10.runtime.Activity() {
                                      		public void runX10Task() {
                                      			{
                                          
//#line 71
final double val =
                                            /* template:array_get { */((table).get(/* Join: { */x,i,j/* } */))/* } */;
                                          
//#line 72
/* template:finish { */
                                          {
                                          	x10.lang.Runtime.getCurrentActivity().startFinish();
                                          	try {
                                          		{
                                              
//#line 73
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                                              	(new x10.runtime.Activity() {
                                              		public void runX10Task() {
                                              			{
                                                  
//#line 74
/* template:array_set { */(rcv).set(val,0)/* } */;
                                              }
                                              		}
                                              	});/* } */
                                          }
                                          	} catch (Throwable tmp84) {
                                          		x10.lang.Runtime.getCurrentActivity().pushException(tmp84);
                                          	} finally {
                                          		x10.lang.Runtime.getCurrentActivity().stopFinish();
                                          	}
                                          }
                                          /* } */
                                          
                                      }
                                      		}
                                      	});/* } */
                                  }
                                  	} catch (Throwable tmp83) {
                                  		x10.lang.Runtime.getCurrentActivity().pushException(tmp83);
                                  	} finally {
                                  		x10.lang.Runtime.getCurrentActivity().stopFinish();
                                  	}
                                  }
                                  /* } */
                                  
                                  
//#line 77
return /* template:array_get { */((rcv).get(0))/* } */;
                              } }
                              }/* } */,true,false,false)/* } */);
    }
    
    
//#line 80
public void
                  initGreensFnTable(
                  final x10.
                    lang.
                    DoubleReferenceArray table,
                  final FourierTransform2D fft,
                  final int x,
                  final int y,
                  final double affp) {
        
//#line 81
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
              2 *
                y -
                1));
        
//#line 82
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
              2 *
                x -
                1));
        
//#line 83
final x10.
          lang.
          dist dGreen =
          X10Util.
            distBlockStar2(
            r1,
            r2);
        
//#line 84
final x10.
          lang.
          DoubleReferenceArray f =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dGreen,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 85
final double invRadius =
          ((AR >
              0.0))
          ? 1.0 /
          AR
          : 0.0;
        
//#line 86
final double N =
          4 *
          x *
          y;
        
//#line 87
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 88
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 89
if (/* template:array_get { */((pl).get(0))/* } */ <=
                                  2 *
                                  y) {
                    
//#line 90
final x10.
                      lang.
                      region rLocal =
                      X10Util.
                        get2DLRegion(
                        dGreen);
                    
//#line 91
/* template:foreach { */
                    for (java.util.Iterator p__ = (rLocal).iterator(); p__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point p = (x10.
                      lang.
                      point) p__.next();
                    	/* Join: { *//* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { *//* } */
{
                        
//#line 92
final double x1 =
                          java.
                            lang.
                            Math.
                            pow(
                            ((/* template:array_get { */((p).get(0))/* } */ >
                                y))
                              ? /* template:array_get { */((p).get(0))/* } */ -
                              ((2 *
                                  y))
                              : /* template:array_get { */((p).get(0))/* } */,
                            2);
                        
//#line 93
final double x2 =
                          java.
                            lang.
                            Math.
                            pow(
                            ((/* template:array_get { */((p).get(1))/* } */ >
                                x))
                              ? /* template:array_get { */((p).get(1))/* } */ -
                              ((2 *
                                  x))
                              : /* template:array_get { */((p).get(1))/* } */,
                            2);
                        
//#line 94
final double r =
                          java.
                            lang.
                            Math.
                            sqrt(
                            x1 +
                              x2);
                        
//#line 95
/* template:array_set { */(f).set(potentialField(
                                                                        r,
                                                                        invRadius,
                                                                        affp),p)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp85) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp85);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 99
final x10.
          lang.
          GenericReferenceArray ft =
          fft.
            inverseTransformD(
            f);
        
//#line 100
genTable1(
                       table,
                       ft,
                       GREENS_IDX,
                       x,
                       y);
    }
    
    
//#line 102
public void
                   initShapeFactorTable(
                   final x10.
                     lang.
                     DoubleReferenceArray table,
                   final FourierTransform2D fft,
                   final int x,
                   final int y,
                   final double affp) {
        
//#line 103
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
              2 *
                y -
                1));
        
//#line 104
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
              2 *
                x -
                1));
        
//#line 105
final x10.
          lang.
          dist dShape =
          X10Util.
            distBlockStar2(
            r1,
            r2);
        
//#line 106
final x10.
          lang.
          DoubleReferenceArray f =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dShape,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 107
final double invRadius =
          ((AR >
              0.0))
          ? 1.0 /
          AR
          : 0.0;
        
//#line 108
final double N =
          4 *
          x *
          y;
        
//#line 109
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 110
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 111
if (/* template:array_get { */((pl).get(0))/* } */ <=
                                   2 *
                                   y) {
                    
//#line 112
final x10.
                      lang.
                      region rLocal =
                      X10Util.
                        get2DLRegion(
                        dShape);
                    
//#line 113
/* template:foreach { */
                    for (java.util.Iterator p__ = (rLocal).iterator(); p__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point p = (x10.
                      lang.
                      point) p__.next();
                    	/* Join: { *//* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { *//* } */
{
                        
//#line 114
final double x1 =
                          java.
                            lang.
                            Math.
                            pow(
                            ((/* template:array_get { */((p).get(0))/* } */ >
                                y))
                              ? /* template:array_get { */((p).get(0))/* } */ -
                              ((2 *
                                  y))
                              : /* template:array_get { */((p).get(0))/* } */,
                            2);
                        
//#line 115
final double x2 =
                          java.
                            lang.
                            Math.
                            pow(
                            ((/* template:array_get { */((p).get(1))/* } */ >
                                x))
                              ? /* template:array_get { */((p).get(1))/* } */ -
                              ((2 *
                                  x))
                              : /* template:array_get { */((p).get(1))/* } */,
                            2);
                        
//#line 116
final double r =
                          java.
                            lang.
                            Math.
                            sqrt(
                            x1 +
                              x2);
                        
//#line 117
/* template:array_set { */(f).set(particleShape(
                                                                         r,
                                                                         invRadius,
                                                                         affp),p)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp86) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp86);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 121
final x10.
          lang.
          GenericReferenceArray ft =
          fft.
            inverseTransformD(
            f);
        
//#line 122
genTable1(
                       table,
                       ft,
                       SHAPE_IDX,
                       x,
                       y);
    }
    
    
//#line 124
public void
                   initElectricFieldXTable(
                   final x10.
                     lang.
                     DoubleReferenceArray table,
                   final FourierTransform2D fft,
                   final int x,
                   final int y,
                   final double affp) {
        
//#line 125
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
              2 *
                y -
                1));
        
//#line 126
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
              2 *
                x -
                1));
        
//#line 127
final x10.
          lang.
          dist dElecX =
          X10Util.
            distBlockStar2(
            r1,
            r2);
        
//#line 128
final x10.
          lang.
          DoubleReferenceArray f =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dElecX,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 129
final double invRadius =
          ((AR >
              0.0))
          ? 1.0 /
          AR
          : 0.0;
        
//#line 130
final double N =
          4 *
          x *
          y;
        
//#line 131
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 132
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 133
if (/* template:array_get { */((pl).get(0))/* } */ <=
                                   2 *
                                   y) {
                    
//#line 134
final x10.
                      lang.
                      region rLocal =
                      X10Util.
                        get2DLRegion(
                        dElecX);
                    
//#line 135
/* template:foreach { */
                    for (java.util.Iterator p__ = (rLocal).iterator(); p__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point p = (x10.
                      lang.
                      point) p__.next();
                    	/* Join: { *//* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { *//* } */
{
                        
//#line 136
final double x1 =
                          ((/* template:array_get { */((p).get(0))/* } */ >
                              y))
                          ? /* template:array_get { */((p).get(0))/* } */ -
                          ((2 *
                              y))
                          : /* template:array_get { */((p).get(0))/* } */;
                        
//#line 137
final double xs1 =
                          java.
                            lang.
                            Math.
                            pow(
                            x1,
                            2);
                        
//#line 138
final double x2 =
                          ((/* template:array_get { */((p).get(1))/* } */ >
                              x))
                          ? /* template:array_get { */((p).get(1))/* } */ -
                          ((2 *
                              x))
                          : /* template:array_get { */((p).get(1))/* } */;
                        
//#line 139
final double xs2 =
                          java.
                            lang.
                            Math.
                            pow(
                            x2,
                            2);
                        
//#line 140
final double r =
                          java.
                            lang.
                            Math.
                            sqrt(
                            xs1 +
                              xs2);
                        
//#line 141
final double val =
                          radialElectricField(
                            r,
                            invRadius,
                            affp);
                        
//#line 142
/* template:array_set { */(f).set(((r >
                                                                           0.0))
                          ? val *
                          ((x2 /
                              r))
                          : val,p)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp87) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp87);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 146
final x10.
          lang.
          GenericReferenceArray ft =
          fft.
            inverseTransformD(
            f);
        
//#line 147
genTable2(
                       table,
                       ft,
                       ELECX_IDX,
                       x,
                       y);
    }
    
    
//#line 149
public void
                   initElectricFieldYTable(
                   final x10.
                     lang.
                     DoubleReferenceArray table,
                   final FourierTransform2D fft,
                   final int x,
                   final int y,
                   final double affp) {
        
//#line 150
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
              2 *
                y -
                1));
        
//#line 151
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
              2 *
                x -
                1));
        
//#line 152
final x10.
          lang.
          dist dElecX =
          X10Util.
            distBlockStar2(
            r1,
            r2);
        
//#line 153
final x10.
          lang.
          DoubleReferenceArray f =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dElecX,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 154
final double invRadius =
          ((AR >
              0.0))
          ? 1.0 /
          AR
          : 0.0;
        
//#line 155
final double N =
          4 *
          x *
          y;
        
//#line 156
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 157
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 158
if (/* template:array_get { */((pl).get(0))/* } */ <=
                                   2 *
                                   y) {
                    
//#line 159
final x10.
                      lang.
                      region rLocal =
                      X10Util.
                        get2DLRegion(
                        dElecX);
                    
//#line 160
/* template:foreach { */
                    for (java.util.Iterator p__ = (rLocal).iterator(); p__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point p = (x10.
                      lang.
                      point) p__.next();
                    	/* Join: { *//* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { *//* } */
{
                        
//#line 161
final double y1 =
                          ((/* template:array_get { */((p).get(0))/* } */ >
                              y))
                          ? /* template:array_get { */((p).get(0))/* } */ -
                          ((2 *
                              y))
                          : /* template:array_get { */((p).get(0))/* } */;
                        
//#line 162
final double ys1 =
                          java.
                            lang.
                            Math.
                            pow(
                            y1,
                            2);
                        
//#line 163
final double y2 =
                          ((/* template:array_get { */((p).get(1))/* } */ >
                              x))
                          ? /* template:array_get { */((p).get(1))/* } */ -
                          ((2 *
                              x))
                          : /* template:array_get { */((p).get(1))/* } */;
                        
//#line 164
final double ys2 =
                          java.
                            lang.
                            Math.
                            pow(
                            y2,
                            2);
                        
//#line 165
final double r =
                          java.
                            lang.
                            Math.
                            sqrt(
                            ys1 +
                              ys2);
                        
//#line 166
final double val =
                          radialElectricField(
                            r,
                            invRadius,
                            affp);
                        
//#line 167
/* template:array_set { */(f).set(((r >
                                                                           0.0))
                          ? val *
                          ((y1 /
                              r))
                          : val,p)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp88) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp88);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 171
final x10.
          lang.
          GenericReferenceArray ft =
          fft.
            inverseTransformD(
            f);
        
//#line 172
genTable3(
                       table,
                       ft,
                       ELECY_IDX,
                       x,
                       y);
    }
    
    
//#line 174
public void
                   genTable1(
                   final x10.
                     lang.
                     DoubleReferenceArray table,
                   final x10.
                     lang.
                     GenericReferenceArray ft,
                   final int index,
                   final int x,
                   final int y) {
        
//#line 175
final int N =
          4 *
          x *
          y;
        
//#line 176
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 177
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 178
if (/* template:array_get { */((pl).get(0))/* } */ <=
                                   x) {
                    
//#line 179
final x10.
                      lang.
                      dist dFT =
                      ft.
                        distribution;
                    
//#line 180
final x10.
                      lang.
                      dist dTable =
                      table.
                        distribution;
                    
//#line 181
final x10.
                      lang.
                      region rLocalFT1 =
                      X10Util.
                        getLRank2D(
                        dFT,
                        0);
                    
//#line 182
final x10.
                      lang.
                      region rLocalT2 =
                      X10Util.
                        getLRank3D(
                        dTable,
                        1);
                    
//#line 183
/* template:foreach { */
                    for (java.util.Iterator __var1____ = (x10.
                                                            lang.
                                                            region.
                                                            factory.
                                                            region(
                                                            rLocalFT1,
                                                            rLocalT2)).iterator(); __var1____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var1__ = (x10.
                      lang.
                      point) __var1____.next();
                    	/* Join: { */final int i =
                      /* template:array_get { */((__var1__).get(0))/* } */;
final int j =
                      /* template:array_get { */((__var1__).get(1))/* } */;/* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var1__).get(0))/* } */;
final int j =
                      /* template:array_get { */((__var1__).get(1))/* } */;/* } */
{
                        
//#line 184
/* template:array_set { */(table).set(N *
                          /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */i,j/* } */))/* } */))/* } */.
                            getReal(),/* Join: { */i,j,index/* } */)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                    
//#line 186
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                       isFirst()) {
                        
//#line 187
/* template:foreach { */
                        for (java.util.Iterator __var2____ = (x10.
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
                                                                  y -
                                                                    1))).iterator(); __var2____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var2__ = (x10.
                          lang.
                          point) __var2____.next();
                        	/* Join: { */final int i =
                          /* template:array_get { */((__var2__).get(0))/* } */;/* } */
                        	x10.lang.Runtime.here().runAsync
                        		(new x10.runtime.Activity() {
                        			public void runX10Task() {
                        				/* Join: { *//* Join: { */final int i =
                          /* template:array_get { */((__var2__).get(0))/* } */;/* } */
{
                            
//#line 188
/* template:array_set { */(table).set(N *
                              /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,2 *
                                y -
                                i/* } */))/* } */))/* } */.
                                getReal(),/* Join: { */x,i,index/* } */)/* } */;
                        }/* } */
                        			}
                        		});
                        }
                        /* } */
                        
                        
//#line 190
/* template:array_set { */(table).set(N *
                          /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,0/* } */))/* } */))/* } */.
                            getImag(),/* Join: { */x,0,index/* } */)/* } */;
                        
//#line 191
/* template:array_set { */(table).set(N *
                          /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,y/* } */))/* } */))/* } */.
                            getImag(),/* Join: { */x,y,index/* } */)/* } */;
                    }
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp89) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp89);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 196
public void
                   genTable2(
                   final x10.
                     lang.
                     DoubleReferenceArray table,
                   final x10.
                     lang.
                     GenericReferenceArray ft,
                   final int index,
                   final int x,
                   final int y) {
        
//#line 197
final int N =
          4 *
          x *
          y;
        
//#line 198
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 199
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 200
if (/* template:array_get { */((pl).get(0))/* } */ <=
                                   x) {
                    
//#line 201
final x10.
                      lang.
                      dist dFT =
                      ft.
                        distribution;
                    
//#line 202
final x10.
                      lang.
                      dist dTable =
                      table.
                        distribution;
                    
//#line 203
final x10.
                      lang.
                      region rLocalFT1 =
                      X10Util.
                        getLRank2D(
                        dFT,
                        0);
                    
//#line 204
final x10.
                      lang.
                      region rLocalT2 =
                      X10Util.
                        getLRank3D(
                        dTable,
                        1);
                    
//#line 205
/* template:foreach { */
                    for (java.util.Iterator __var3____ = (rLocalFT1).iterator(); __var3____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var3__ = (x10.
                      lang.
                      point) __var3____.next();
                    	/* Join: { */final int i =
                      /* template:array_get { */((__var3__).get(0))/* } */;/* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                        
//#line 206
if (i >
                                           0) {
                            
//#line 207
/* template:foreach { */
                            for (java.util.Iterator __var4____ = (rLocalT2).iterator(); __var4____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var4__ = (x10.
                              lang.
                              point) __var4____.next();
                            	/* Join: { */final int j =
                              /* template:array_get { */((__var4__).get(0))/* } */;/* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { */final int j =
                              /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                                
//#line 208
/* template:array_set { */(table).set(N *
                                  /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */i,j/* } */))/* } */))/* } */.
                                    getImag(),/* Join: { */i,j,index/* } */)/* } */;
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                        }
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                    
//#line 212
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                       isFirst()) {
                        
//#line 213
/* template:foreach { */
                        for (java.util.Iterator __var5____ = (x10.
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
                                                                  y -
                                                                    1))).iterator(); __var5____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var5__ = (x10.
                          lang.
                          point) __var5____.next();
                        	/* Join: { */final int i1 =
                          /* template:array_get { */((__var5__).get(0))/* } */;/* } */
                        	x10.lang.Runtime.here().runAsync
                        		(new x10.runtime.Activity() {
                        			public void runX10Task() {
                        				/* Join: { *//* Join: { */final int i1 =
                          /* template:array_get { */((__var5__).get(0))/* } */;/* } */
{
                            
//#line 214
final int i2 =
                              2 *
                              y -
                              i1;
                            
//#line 215
/* template:array_set { */(table).set(N *
                              /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,i1/* } */))/* } */))/* } */.
                                getReal(),/* Join: { */0,i1,index/* } */)/* } */;
                            
//#line 216
/* template:array_set { */(table).set(N *
                              /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,i2/* } */))/* } */))/* } */.
                                getReal(),/* Join: { */x,i1,index/* } */)/* } */;
                        }/* } */
                        			}
                        		});
                        }
                        /* } */
                        
                        
//#line 218
/* template:array_set { */(table).set(N *
                          /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,0/* } */))/* } */))/* } */.
                            getReal(),/* Join: { */0,0,index/* } */)/* } */;
                        
//#line 219
/* template:array_set { */(table).set(N *
                          /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,0/* } */))/* } */))/* } */.
                            getImag(),/* Join: { */x,0,index/* } */)/* } */;
                        
//#line 220
/* template:array_set { */(table).set(N *
                          /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,y/* } */))/* } */))/* } */.
                            getReal(),/* Join: { */0,y,index/* } */)/* } */;
                        
//#line 221
/* template:array_set { */(table).set(N *
                          /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,y/* } */))/* } */))/* } */.
                            getImag(),/* Join: { */x,y,index/* } */)/* } */;
                    }
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp90) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp90);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 226
public void
                   genTable3(
                   final x10.
                     lang.
                     DoubleReferenceArray table,
                   final x10.
                     lang.
                     GenericReferenceArray ft,
                   final int index,
                   final int x,
                   final int y) {
        
//#line 227
final int N =
          4 *
          x *
          y;
        
//#line 228
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 229
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 230
if (/* template:array_get { */((pl).get(0))/* } */ <=
                                   x) {
                    
//#line 231
final x10.
                      lang.
                      dist dFT =
                      ft.
                        distribution;
                    
//#line 232
final x10.
                      lang.
                      dist dTable =
                      table.
                        distribution;
                    
//#line 233
final x10.
                      lang.
                      region rLocalFT1 =
                      X10Util.
                        getLRank2D(
                        dFT,
                        0);
                    
//#line 234
final x10.
                      lang.
                      region rLocalT2 =
                      X10Util.
                        getLRank3D(
                        dTable,
                        1);
                    
//#line 235
/* template:foreach { */
                    for (java.util.Iterator __var6____ = (rLocalFT1).iterator(); __var6____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var6__ = (x10.
                      lang.
                      point) __var6____.next();
                    	/* Join: { */final int i =
                      /* template:array_get { */((__var6__).get(0))/* } */;/* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var6__).get(0))/* } */;/* } */
{
                        
//#line 236
if (i >
                                           0) {
                            
//#line 237
/* template:foreach { */
                            for (java.util.Iterator __var7____ = (x10.
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
                                                                      y -
                                                                        1))).iterator(); __var7____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var7__ = (x10.
                              lang.
                              point) __var7____.next();
                            	/* Join: { */final int j =
                              /* template:array_get { */((__var7__).get(0))/* } */;/* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { */final int j =
                              /* template:array_get { */((__var7__).get(0))/* } */;/* } */
{
                                
//#line 238
/* template:array_set { */(table).set(N *
                                  /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */i,j/* } */))/* } */))/* } */.
                                    getImag(),/* Join: { */i,j,index/* } */)/* } */;
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                            
//#line 240
/* template:array_set { */(table).set(N *
                              /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */i,0/* } */))/* } */))/* } */.
                                getReal(),/* Join: { */i,0,index/* } */)/* } */;
                            
//#line 241
/* template:array_set { */(table).set(N *
                              /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */i,y/* } */))/* } */))/* } */.
                                getReal(),/* Join: { */i,y,index/* } */)/* } */;
                        }
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                    
//#line 244
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                       isFirst()) {
                        
//#line 245
/* template:foreach { */
                        for (java.util.Iterator __var8____ = (x10.
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
                                                                  y -
                                                                    1))).iterator(); __var8____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var8__ = (x10.
                          lang.
                          point) __var8____.next();
                        	/* Join: { */final int i1 =
                          /* template:array_get { */((__var8__).get(0))/* } */;/* } */
                        	x10.lang.Runtime.here().runAsync
                        		(new x10.runtime.Activity() {
                        			public void runX10Task() {
                        				/* Join: { *//* Join: { */final int i1 =
                          /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                            
//#line 246
final int i2 =
                              2 *
                              y -
                              i1;
                            
//#line 247
/* template:array_set { */(table).set(N *
                              /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,i1/* } */))/* } */))/* } */.
                                getImag(),/* Join: { */0,i1,index/* } */)/* } */;
                            
//#line 248
/* template:array_set { */(table).set(N *
                              /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,i2/* } */))/* } */))/* } */.
                                getImag(),/* Join: { */x,i1,index/* } */)/* } */;
                        }/* } */
                        			}
                        		});
                        }
                        /* } */
                        
                        
//#line 250
/* template:array_set { */(table).set(N *
                          /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,0/* } */))/* } */))/* } */.
                            getReal(),/* Join: { */0,0,index/* } */)/* } */;
                        
//#line 251
/* template:array_set { */(table).set(N *
                          /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,0/* } */))/* } */))/* } */.
                            getImag(),/* Join: { */x,0,index/* } */)/* } */;
                        
//#line 252
/* template:array_set { */(table).set(N *
                          /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,y/* } */))/* } */))/* } */.
                            getReal(),/* Join: { */0,y,index/* } */)/* } */;
                        
//#line 253
/* template:array_set { */(table).set(N *
                          /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,y/* } */))/* } */))/* } */.
                            getImag(),/* Join: { */x,y,index/* } */)/* } */;
                    }
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp91) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp91);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 258
public x10.
                   lang.
                   GenericReferenceArray
                   makeForceArray(
                   ) {
        
//#line 259
final x10.
          lang.
          dist dResult =
          X10Util.
            distBlockStar1(
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
                2 *
                  y -
                  1),
              x10.
                lang.
                region.
                factory.
                region(
                0,
                x -
                  1)));
        
//#line 260
return /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dResult,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
    }
    
    
//#line 262
public double
                   getForceCharge(
                   final x10.
                     lang.
                     GenericReferenceArray q,
                   final x10.
                     lang.
                     GenericReferenceArray forceX,
                   final x10.
                     lang.
                     GenericReferenceArray forceY) {
        
//#line 263
final x10.
          lang.
          dist dForce =
          X10Util.
            distBlockStar1(
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
                x -
                  1),
              x10.
                lang.
                region.
                factory.
                region(
                0,
                2 *
                  y -
                  1)));
        
//#line 264
final x10.
          lang.
          GenericReferenceArray fxfft =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dForce,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 265
final x10.
          lang.
          GenericReferenceArray fyfft =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dForce,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 266
final x10.
          lang.
          GenericReferenceArray qfft =
          fft.
            inverseTransformC(
            q);
        
//#line 267
final double we =
          solveForceCharge(
            qfft,
            fxfft,
            fyfft);
        
//#line 268
final x10.
          lang.
          GenericReferenceArray fx =
          fft.
            transformC(
            fxfft);
        
//#line 269
final x10.
          lang.
          GenericReferenceArray fy =
          fft.
            transformC(
            fyfft);
        
//#line 270
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 271
/* template:ateach { */
            {
            	x10.lang.dist pt__distCopy = forceX.
                                            distribution; // make copy to avoid recomputation
            	for (java.util.Iterator pt__ = pt__distCopy.iterator();
            		 pt__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pt = (x10.
              lang.
              point) pt__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pt__distCopy.get(pt)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 272
/* template:array_set { */(forceX).set(/* template:parametric { */((Complex)(/* template:array_get { */((fx).get(pt))/* } */))/* } */,pt)/* } */;
                
//#line 273
/* template:array_set { */(forceY).set(/* template:parametric { */((Complex)(/* template:array_get { */((fy).get(pt))/* } */))/* } */,pt)/* } */;
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp92) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp92);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 275
return we;
    }
    
    
//#line 277
public double
                   solveForceCharge(
                   final x10.
                     lang.
                     GenericReferenceArray q,
                   final x10.
                     lang.
                     GenericReferenceArray forceX,
                   final x10.
                     lang.
                     GenericReferenceArray forceY) {
        
//#line 278
final x10.
          lang.
          dist dUnique =
          (x10.
            lang.
            dist)
            x10.
              lang.
              dist.
              UNIQUE;
        
//#line 279
final x10.
          lang.
          DoubleReferenceArray energy =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point pt/* } */, double dummy) { {
            
//#line 280
return 0.0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 282
/* template:forloop { */
        for (java.util.Iterator pl__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pl__.hasNext(); ) {
        	final  x10.
          lang.
          point pl = (x10.
          lang.
          point) pl__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 283
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 284
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                               lang.
                                                                               dist.
                                                                               UNIQUE.
                                                                               get(
                                                                               pl))).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 285
if (/* template:array_get { */((pl).get(0))/* } */ <=
                                       x) {
                        
//#line 286
final x10.
                          lang.
                          dist dFFG =
                          ffg.
                            distribution;
                        
//#line 287
final x10.
                          lang.
                          region rLocal =
                          X10Util.
                            get3DLRegion(
                            dFFG);
                        
//#line 288
final x10.
                          lang.
                          region rLocal1 =
                          X10Util.
                            getRank3D(
                            rLocal,
                            0);
                        
//#line 289
final x10.
                          lang.
                          region rLocal2 =
                          X10Util.
                            getRank3D(
                            rLocal,
                            1);
                        
//#line 290
double tmp3 =
                          -1.0;
                        
//#line 291
/* template:forloop-mult { */{
                        x10.lang.region __var94__ = (x10.lang.region) rLocal1;
                        if (__var94__.size() > 0 && (__var94__ instanceof x10.array.MultiDimRegion || __var94__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var95__ = __var94__.rank(0).low(), __var96__ = __var94__.rank(0).high(); __var95__ <= __var96__; __var95__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i = __var95__;
                        /* } */
                        /* } */
{
                            
//#line 292
tmp3 =
                              (((i %
                                   2 ==
                                   0))
                                 ? 1.0
                                 : -1.0);
                            
//#line 293
if (i >
                                               0) {
                                
//#line 294
double tmp2 =
                                  /* template:array_get { */((ffg).get(/* Join: { */i,0,ELECY_IDX/* } */))/* } */;
                                
//#line 295
/* template:forloop-mult { */{
                                x10.lang.region __var97__ = (x10.lang.region) x10.
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
                                                                                  y -
                                                                                    1));
                                if (__var97__.size() > 0 && (__var97__ instanceof x10.array.MultiDimRegion || __var97__ instanceof x10.array.ContiguousRange)) {
                                	/* Loop: { *//* template:forloop-mult-each { */
                                for (int __var98__ = __var97__.rank(0).low(), __var99__ = __var97__.rank(0).high(); __var98__ <= __var99__; __var98__++)
                                /* } */
                                /* } */ {
                                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                                final int j1 = __var98__;
                                /* } */
                                /* } */
{
                                    
//#line 296
final int j2 =
                                      2 *
                                      y -
                                      j1;
                                    
//#line 297
final double tmp0 =
                                      ((((/* template:here { */x10.lang.Runtime.here()/* } */).
                                           isFirst()))
                                         ? /* template:array_get { */((ffg).get(/* Join: { */0,j1,ELECX_IDX/* } */))/* } */
                                         : /* template:array_get { */((ffg2).get(/* Join: { */j1,ELECX_IDX/* } */))/* } */);
                                    
//#line 298
final double tmp1 =
                                      tmp3 *
                                      tmp0;
                                    
//#line 299
tmp2 =
                                      -tmp2;
                                    
//#line 300
final Complex cx =
                                      new Complex(
                                      tmp1,
                                      /* template:array_get { */((ffg).get(/* Join: { */i,j1,ELECX_IDX/* } */))/* } */);
                                    
//#line 301
final Complex cy =
                                      new Complex(
                                      tmp2,
                                      /* template:array_get { */((ffg).get(/* Join: { */i,j1,ELECY_IDX/* } */))/* } */);
                                    
//#line 302
/* template:array_set { */(forceX).set(cx.
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j1/* } */))/* } */))/* } */),/* Join: { */i,j1/* } */)/* } */;
                                    
//#line 303
/* template:array_set { */(forceX).set(cx.
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j2/* } */))/* } */))/* } */),/* Join: { */i,j2/* } */)/* } */;
                                    
//#line 304
/* template:array_set { */(forceY).set(cy.
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j1/* } */))/* } */))/* } */),/* Join: { */i,j1/* } */)/* } */;
                                    
//#line 305
/* template:array_set { */(forceY).set(((cy.
                                                                                            getConjg())).
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j2/* } */))/* } */))/* } */),/* Join: { */i,j2/* } */)/* } */;
                                    
//#line 306
/* template:array_set { */(energy).set(/* template:array_get { */((energy).get(pl))/* } */ +
                                      ((/* template:array_get { */((ffg).get(/* Join: { */i,j1,GREENS_IDX/* } */))/* } */ *
                                          ((/* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j1/* } */))/* } */))/* } */.
                                              multConjg() +
                                              /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j2/* } */))/* } */))/* } */.
                                                multConjg())))),pl)/* } */;
                                }/* } */
                                	}
                                } else {
                                	/* template:forloop { */
                                for (java.util.Iterator __var10____ = (__var97__).iterator(); __var10____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var10__ = (x10.
                                  lang.
                                  point) __var10____.next();
                                	/* Join: { *//* Join: { */final int j1 =
                                  /* template:array_get { */((__var10__).get(0))/* } */;/* } */
{
                                    
//#line 296
final int j2 =
                                      2 *
                                      y -
                                      j1;
                                    
//#line 297
final double tmp0 =
                                      ((((/* template:here { */x10.lang.Runtime.here()/* } */).
                                           isFirst()))
                                         ? /* template:array_get { */((ffg).get(/* Join: { */0,j1,ELECX_IDX/* } */))/* } */
                                         : /* template:array_get { */((ffg2).get(/* Join: { */j1,ELECX_IDX/* } */))/* } */);
                                    
//#line 298
final double tmp1 =
                                      tmp3 *
                                      tmp0;
                                    
//#line 299
tmp2 =
                                      -tmp2;
                                    
//#line 300
final Complex cx =
                                      new Complex(
                                      tmp1,
                                      /* template:array_get { */((ffg).get(/* Join: { */i,j1,ELECX_IDX/* } */))/* } */);
                                    
//#line 301
final Complex cy =
                                      new Complex(
                                      tmp2,
                                      /* template:array_get { */((ffg).get(/* Join: { */i,j1,ELECY_IDX/* } */))/* } */);
                                    
//#line 302
/* template:array_set { */(forceX).set(cx.
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j1/* } */))/* } */))/* } */),/* Join: { */i,j1/* } */)/* } */;
                                    
//#line 303
/* template:array_set { */(forceX).set(cx.
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j2/* } */))/* } */))/* } */),/* Join: { */i,j2/* } */)/* } */;
                                    
//#line 304
/* template:array_set { */(forceY).set(cy.
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j1/* } */))/* } */))/* } */),/* Join: { */i,j1/* } */)/* } */;
                                    
//#line 305
/* template:array_set { */(forceY).set(((cy.
                                                                                            getConjg())).
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j2/* } */))/* } */))/* } */),/* Join: { */i,j2/* } */)/* } */;
                                    
//#line 306
/* template:array_set { */(energy).set(/* template:array_get { */((energy).get(pl))/* } */ +
                                      ((/* template:array_get { */((ffg).get(/* Join: { */i,j1,GREENS_IDX/* } */))/* } */ *
                                          ((/* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j1/* } */))/* } */))/* } */.
                                              multConjg() +
                                              /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j2/* } */))/* } */))/* } */.
                                                multConjg())))),pl)/* } */;
                                }/* } */
                                }
                                /* } */
                                
                                }
                                }
                                /* } */
                                
                                
//#line 308
double tmp0 =
                                  ((((/* template:here { */x10.lang.Runtime.here()/* } */).
                                       isFirst()))
                                     ? /* template:array_get { */((ffg).get(/* Join: { */0,0,ELECX_IDX/* } */))/* } */
                                     : /* template:array_get { */((ffg2).get(/* Join: { */0,ELECX_IDX/* } */))/* } */);
                                
//#line 309
double tmp1 =
                                  tmp3 *
                                  tmp0;
                                
//#line 310
final Complex x0 =
                                  new Complex(
                                  tmp1,
                                  /* template:array_get { */((ffg).get(/* Join: { */i,0,ELECX_IDX/* } */))/* } */);
                                
//#line 311
/* template:array_set { */(forceX).set(x0.
                                                                                      mult(
                                                                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,0/* } */))/* } */))/* } */),/* Join: { */i,0/* } */)/* } */;
                                
//#line 312
/* template:array_set { */(forceY).set(/* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,0/* } */))/* } */))/* } */.
                                                                                      multS(
                                                                                      /* template:array_get { */((ffg).get(/* Join: { */i,0,ELECY_IDX/* } */))/* } */),/* Join: { */i,0/* } */)/* } */;
                                
//#line 313
/* template:array_set { */(energy).set(/* template:array_get { */((energy).get(pl))/* } */ +
                                  ((/* template:array_get { */((ffg).get(/* Join: { */i,0,GREENS_IDX/* } */))/* } */ *
                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,0/* } */))/* } */))/* } */.
                                        multConjg())),pl)/* } */;
                                
//#line 314
tmp0 =
                                  (((((/* template:here { */x10.lang.Runtime.here()/* } */).
                                        isFirst()))
                                      ? /* template:array_get { */((ffg).get(/* Join: { */0,y,ELECX_IDX/* } */))/* } */
                                      : /* template:array_get { */((ffg2).get(/* Join: { */y,ELECX_IDX/* } */))/* } */));
                                
//#line 315
tmp1 =
                                  tmp3 *
                                    tmp0;
                                
//#line 316
final Complex xNY =
                                  new Complex(
                                  tmp1,
                                  /* template:array_get { */((ffg).get(/* Join: { */i,y,ELECX_IDX/* } */))/* } */);
                                
//#line 317
/* template:array_set { */(forceX).set(xNY.
                                                                                      mult(
                                                                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,y/* } */))/* } */))/* } */),/* Join: { */i,y/* } */)/* } */;
                                
//#line 318
/* template:array_set { */(forceY).set(/* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,y/* } */))/* } */))/* } */.
                                                                                      multS(
                                                                                      /* template:array_get { */((ffg).get(/* Join: { */i,y,ELECY_IDX/* } */))/* } */),/* Join: { */i,y/* } */)/* } */;
                                
//#line 319
/* template:array_set { */(energy).set(/* template:array_get { */((energy).get(pl))/* } */ +
                                  ((/* template:array_get { */((ffg).get(/* Join: { */i,y,GREENS_IDX/* } */))/* } */ *
                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,y/* } */))/* } */))/* } */.
                                        multConjg())),pl)/* } */;
                            }
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var9____ = (__var94__).iterator(); __var9____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var9__ = (x10.
                          lang.
                          point) __var9____.next();
                        	/* Join: { *//* Join: { */final int i =
                          /* template:array_get { */((__var9__).get(0))/* } */;/* } */
{
                            
//#line 292
tmp3 =
                              (((i %
                                   2 ==
                                   0))
                                 ? 1.0
                                 : -1.0);
                            
//#line 293
if (i >
                                               0) {
                                
//#line 294
double tmp2 =
                                  /* template:array_get { */((ffg).get(/* Join: { */i,0,ELECY_IDX/* } */))/* } */;
                                
//#line 295
/* template:forloop-mult { */{
                                x10.lang.region __var100__ = (x10.lang.region) x10.
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
                                                                                   y -
                                                                                     1));
                                if (__var100__.size() > 0 && (__var100__ instanceof x10.array.MultiDimRegion || __var100__ instanceof x10.array.ContiguousRange)) {
                                	/* Loop: { *//* template:forloop-mult-each { */
                                for (int __var101__ = __var100__.rank(0).low(), __var102__ = __var100__.rank(0).high(); __var101__ <= __var102__; __var101__++)
                                /* } */
                                /* } */ {
                                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                                final int j1 = __var101__;
                                /* } */
                                /* } */
{
                                    
//#line 296
final int j2 =
                                      2 *
                                      y -
                                      j1;
                                    
//#line 297
final double tmp0 =
                                      ((((/* template:here { */x10.lang.Runtime.here()/* } */).
                                           isFirst()))
                                         ? /* template:array_get { */((ffg).get(/* Join: { */0,j1,ELECX_IDX/* } */))/* } */
                                         : /* template:array_get { */((ffg2).get(/* Join: { */j1,ELECX_IDX/* } */))/* } */);
                                    
//#line 298
final double tmp1 =
                                      tmp3 *
                                      tmp0;
                                    
//#line 299
tmp2 =
                                      -tmp2;
                                    
//#line 300
final Complex cx =
                                      new Complex(
                                      tmp1,
                                      /* template:array_get { */((ffg).get(/* Join: { */i,j1,ELECX_IDX/* } */))/* } */);
                                    
//#line 301
final Complex cy =
                                      new Complex(
                                      tmp2,
                                      /* template:array_get { */((ffg).get(/* Join: { */i,j1,ELECY_IDX/* } */))/* } */);
                                    
//#line 302
/* template:array_set { */(forceX).set(cx.
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j1/* } */))/* } */))/* } */),/* Join: { */i,j1/* } */)/* } */;
                                    
//#line 303
/* template:array_set { */(forceX).set(cx.
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j2/* } */))/* } */))/* } */),/* Join: { */i,j2/* } */)/* } */;
                                    
//#line 304
/* template:array_set { */(forceY).set(cy.
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j1/* } */))/* } */))/* } */),/* Join: { */i,j1/* } */)/* } */;
                                    
//#line 305
/* template:array_set { */(forceY).set(((cy.
                                                                                            getConjg())).
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j2/* } */))/* } */))/* } */),/* Join: { */i,j2/* } */)/* } */;
                                    
//#line 306
/* template:array_set { */(energy).set(/* template:array_get { */((energy).get(pl))/* } */ +
                                      ((/* template:array_get { */((ffg).get(/* Join: { */i,j1,GREENS_IDX/* } */))/* } */ *
                                          ((/* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j1/* } */))/* } */))/* } */.
                                              multConjg() +
                                              /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j2/* } */))/* } */))/* } */.
                                                multConjg())))),pl)/* } */;
                                }/* } */
                                	}
                                } else {
                                	/* template:forloop { */
                                for (java.util.Iterator __var10____ = (__var100__).iterator(); __var10____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var10__ = (x10.
                                  lang.
                                  point) __var10____.next();
                                	/* Join: { *//* Join: { */final int j1 =
                                  /* template:array_get { */((__var10__).get(0))/* } */;/* } */
{
                                    
//#line 296
final int j2 =
                                      2 *
                                      y -
                                      j1;
                                    
//#line 297
final double tmp0 =
                                      ((((/* template:here { */x10.lang.Runtime.here()/* } */).
                                           isFirst()))
                                         ? /* template:array_get { */((ffg).get(/* Join: { */0,j1,ELECX_IDX/* } */))/* } */
                                         : /* template:array_get { */((ffg2).get(/* Join: { */j1,ELECX_IDX/* } */))/* } */);
                                    
//#line 298
final double tmp1 =
                                      tmp3 *
                                      tmp0;
                                    
//#line 299
tmp2 =
                                      -tmp2;
                                    
//#line 300
final Complex cx =
                                      new Complex(
                                      tmp1,
                                      /* template:array_get { */((ffg).get(/* Join: { */i,j1,ELECX_IDX/* } */))/* } */);
                                    
//#line 301
final Complex cy =
                                      new Complex(
                                      tmp2,
                                      /* template:array_get { */((ffg).get(/* Join: { */i,j1,ELECY_IDX/* } */))/* } */);
                                    
//#line 302
/* template:array_set { */(forceX).set(cx.
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j1/* } */))/* } */))/* } */),/* Join: { */i,j1/* } */)/* } */;
                                    
//#line 303
/* template:array_set { */(forceX).set(cx.
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j2/* } */))/* } */))/* } */),/* Join: { */i,j2/* } */)/* } */;
                                    
//#line 304
/* template:array_set { */(forceY).set(cy.
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j1/* } */))/* } */))/* } */),/* Join: { */i,j1/* } */)/* } */;
                                    
//#line 305
/* template:array_set { */(forceY).set(((cy.
                                                                                            getConjg())).
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j2/* } */))/* } */))/* } */),/* Join: { */i,j2/* } */)/* } */;
                                    
//#line 306
/* template:array_set { */(energy).set(/* template:array_get { */((energy).get(pl))/* } */ +
                                      ((/* template:array_get { */((ffg).get(/* Join: { */i,j1,GREENS_IDX/* } */))/* } */ *
                                          ((/* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j1/* } */))/* } */))/* } */.
                                              multConjg() +
                                              /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j2/* } */))/* } */))/* } */.
                                                multConjg())))),pl)/* } */;
                                }/* } */
                                }
                                /* } */
                                
                                }
                                }
                                /* } */
                                
                                
//#line 308
double tmp0 =
                                  ((((/* template:here { */x10.lang.Runtime.here()/* } */).
                                       isFirst()))
                                     ? /* template:array_get { */((ffg).get(/* Join: { */0,0,ELECX_IDX/* } */))/* } */
                                     : /* template:array_get { */((ffg2).get(/* Join: { */0,ELECX_IDX/* } */))/* } */);
                                
//#line 309
double tmp1 =
                                  tmp3 *
                                  tmp0;
                                
//#line 310
final Complex x0 =
                                  new Complex(
                                  tmp1,
                                  /* template:array_get { */((ffg).get(/* Join: { */i,0,ELECX_IDX/* } */))/* } */);
                                
//#line 311
/* template:array_set { */(forceX).set(x0.
                                                                                      mult(
                                                                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,0/* } */))/* } */))/* } */),/* Join: { */i,0/* } */)/* } */;
                                
//#line 312
/* template:array_set { */(forceY).set(/* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,0/* } */))/* } */))/* } */.
                                                                                      multS(
                                                                                      /* template:array_get { */((ffg).get(/* Join: { */i,0,ELECY_IDX/* } */))/* } */),/* Join: { */i,0/* } */)/* } */;
                                
//#line 313
/* template:array_set { */(energy).set(/* template:array_get { */((energy).get(pl))/* } */ +
                                  ((/* template:array_get { */((ffg).get(/* Join: { */i,0,GREENS_IDX/* } */))/* } */ *
                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,0/* } */))/* } */))/* } */.
                                        multConjg())),pl)/* } */;
                                
//#line 314
tmp0 =
                                  (((((/* template:here { */x10.lang.Runtime.here()/* } */).
                                        isFirst()))
                                      ? /* template:array_get { */((ffg).get(/* Join: { */0,y,ELECX_IDX/* } */))/* } */
                                      : /* template:array_get { */((ffg2).get(/* Join: { */y,ELECX_IDX/* } */))/* } */));
                                
//#line 315
tmp1 =
                                  tmp3 *
                                    tmp0;
                                
//#line 316
final Complex xNY =
                                  new Complex(
                                  tmp1,
                                  /* template:array_get { */((ffg).get(/* Join: { */i,y,ELECX_IDX/* } */))/* } */);
                                
//#line 317
/* template:array_set { */(forceX).set(xNY.
                                                                                      mult(
                                                                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,y/* } */))/* } */))/* } */),/* Join: { */i,y/* } */)/* } */;
                                
//#line 318
/* template:array_set { */(forceY).set(/* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,y/* } */))/* } */))/* } */.
                                                                                      multS(
                                                                                      /* template:array_get { */((ffg).get(/* Join: { */i,y,ELECY_IDX/* } */))/* } */),/* Join: { */i,y/* } */)/* } */;
                                
//#line 319
/* template:array_set { */(energy).set(/* template:array_get { */((energy).get(pl))/* } */ +
                                  ((/* template:array_get { */((ffg).get(/* Join: { */i,y,GREENS_IDX/* } */))/* } */ *
                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,y/* } */))/* } */))/* } */.
                                        multConjg())),pl)/* } */;
                            }
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
                        
//#line 322
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                           isFirst()) {
                            
//#line 323
tmp3 =
                              /* template:array_get { */((ffg).get(/* Join: { */0,0,ELECY_IDX/* } */))/* } */;
                            
//#line 324
/* template:forloop-mult { */{
                            x10.lang.region __var103__ = (x10.lang.region) x10.
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
                                                                               y -
                                                                                 1));
                            if (__var103__.size() > 0 && (__var103__ instanceof x10.array.MultiDimRegion || __var103__ instanceof x10.array.ContiguousRange)) {
                            	/* Loop: { *//* template:forloop-mult-each { */
                            for (int __var104__ = __var103__.rank(0).low(), __var105__ = __var103__.rank(0).high(); __var104__ <= __var105__; __var104__++)
                            /* } */
                            /* } */ {
                            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                            final int j = __var104__;
                            /* } */
                            /* } */
{
                                
//#line 325
tmp3 =
                                  -tmp3;
                                
//#line 326
final Complex s =
                                  new Complex(
                                  tmp3,
                                  /* template:array_get { */((ffg).get(/* Join: { */0,j,ELECY_IDX/* } */))/* } */);
                                
//#line 327
/* template:array_set { */(forceX).set(/* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,j/* } */))/* } */))/* } */.
                                                                                      multS(
                                                                                      /* template:array_get { */((ffg).get(/* Join: { */0,j,ELECX_IDX/* } */))/* } */),/* Join: { */0,j/* } */)/* } */;
                                
//#line 328
/* template:array_set { */(forceY).set(s.
                                                                                      mult(
                                                                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,j/* } */))/* } */))/* } */),/* Join: { */0,j/* } */)/* } */;
                                
//#line 329
/* template:array_set { */(energy).set(/* template:array_get { */((energy).get(pl))/* } */ +
                                  ((/* template:array_get { */((ffg).get(/* Join: { */0,j,GREENS_IDX/* } */))/* } */ *
                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,j/* } */))/* } */))/* } */.
                                        multConjg())),pl)/* } */;
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var11____ = (__var103__).iterator(); __var11____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var11__ = (x10.
                              lang.
                              point) __var11____.next();
                            	/* Join: { *//* Join: { */final int j =
                              /* template:array_get { */((__var11__).get(0))/* } */;/* } */
{
                                
//#line 325
tmp3 =
                                  -tmp3;
                                
//#line 326
final Complex s =
                                  new Complex(
                                  tmp3,
                                  /* template:array_get { */((ffg).get(/* Join: { */0,j,ELECY_IDX/* } */))/* } */);
                                
//#line 327
/* template:array_set { */(forceX).set(/* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,j/* } */))/* } */))/* } */.
                                                                                      multS(
                                                                                      /* template:array_get { */((ffg).get(/* Join: { */0,j,ELECX_IDX/* } */))/* } */),/* Join: { */0,j/* } */)/* } */;
                                
//#line 328
/* template:array_set { */(forceY).set(s.
                                                                                      mult(
                                                                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,j/* } */))/* } */))/* } */),/* Join: { */0,j/* } */)/* } */;
                                
//#line 329
/* template:array_set { */(energy).set(/* template:array_get { */((energy).get(pl))/* } */ +
                                  ((/* template:array_get { */((ffg).get(/* Join: { */0,j,GREENS_IDX/* } */))/* } */ *
                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,j/* } */))/* } */))/* } */.
                                        multConjg())),pl)/* } */;
                            }/* } */
                            }
                            /* } */
                            
                            }
                            }
                            /* } */
                            
                            
//#line 331
tmp3 =
                              /* template:array_get { */((ffg2).get(/* Join: { */0,ELECY_IDX/* } */))/* } */;
                            
//#line 332
/* template:forloop-mult { */{
                            x10.lang.region __var106__ = (x10.lang.region) x10.
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
                                                                               y -
                                                                                 1));
                            if (__var106__.size() > 0 && (__var106__ instanceof x10.array.MultiDimRegion || __var106__ instanceof x10.array.ContiguousRange)) {
                            	/* Loop: { *//* template:forloop-mult-each { */
                            for (int __var107__ = __var106__.rank(0).low(), __var108__ = __var106__.rank(0).high(); __var107__ <= __var108__; __var107__++)
                            /* } */
                            /* } */ {
                            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                            final int j1 = __var107__;
                            /* } */
                            /* } */
{
                                
//#line 333
tmp3 =
                                  -tmp3;
                                
//#line 334
final int j2 =
                                  2 *
                                  y -
                                  j1;
                                
//#line 335
final Complex s =
                                  new Complex(
                                  tmp3,
                                  /* template:array_get { */((ffg2).get(/* Join: { */j1,ELECY_IDX/* } */))/* } */);
                                
//#line 336
/* template:array_set { */(forceX).set(/* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,j2/* } */))/* } */))/* } */.
                                                                                      multS(
                                                                                      /* template:array_get { */((ffg).get(/* Join: { */0,j1,ELECX_IDX/* } */))/* } */),/* Join: { */0,j2/* } */)/* } */;
                                
//#line 337
/* template:array_set { */(forceY).set(s.
                                                                                      mult(
                                                                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,j2/* } */))/* } */))/* } */),/* Join: { */0,j2/* } */)/* } */;
                                
//#line 338
/* template:array_set { */(energy).set(/* template:array_get { */((energy).get(pl))/* } */ +
                                  ((/* template:array_get { */((ffg2).get(/* Join: { */j1,GREENS_IDX/* } */))/* } */ *
                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,j2/* } */))/* } */))/* } */.
                                        multConjg())),pl)/* } */;
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var12____ = (__var106__).iterator(); __var12____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var12__ = (x10.
                              lang.
                              point) __var12____.next();
                            	/* Join: { *//* Join: { */final int j1 =
                              /* template:array_get { */((__var12__).get(0))/* } */;/* } */
{
                                
//#line 333
tmp3 =
                                  -tmp3;
                                
//#line 334
final int j2 =
                                  2 *
                                  y -
                                  j1;
                                
//#line 335
final Complex s =
                                  new Complex(
                                  tmp3,
                                  /* template:array_get { */((ffg2).get(/* Join: { */j1,ELECY_IDX/* } */))/* } */);
                                
//#line 336
/* template:array_set { */(forceX).set(/* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,j2/* } */))/* } */))/* } */.
                                                                                      multS(
                                                                                      /* template:array_get { */((ffg).get(/* Join: { */0,j1,ELECX_IDX/* } */))/* } */),/* Join: { */0,j2/* } */)/* } */;
                                
//#line 337
/* template:array_set { */(forceY).set(s.
                                                                                      mult(
                                                                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,j2/* } */))/* } */))/* } */),/* Join: { */0,j2/* } */)/* } */;
                                
//#line 338
/* template:array_set { */(energy).set(/* template:array_get { */((energy).get(pl))/* } */ +
                                  ((/* template:array_get { */((ffg2).get(/* Join: { */j1,GREENS_IDX/* } */))/* } */ *
                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,j2/* } */))/* } */))/* } */.
                                        multConjg())),pl)/* } */;
                            }/* } */
                            }
                            /* } */
                            
                            }
                            }
                            /* } */
                            
                            
//#line 340
final double q00R =
                              /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,0/* } */))/* } */))/* } */.
                                getReal();
                            
//#line 341
final double q00I =
                              /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,0/* } */))/* } */))/* } */.
                                getImag();
                            
//#line 342
/* template:array_set { */(forceX).set(new Complex(
                              /* template:array_get { */((ffg).get(/* Join: { */0,0,ELECX_IDX/* } */))/* } */ *
                                q00R,
                              /* template:array_get { */((ffg2).get(/* Join: { */0,ELECX_IDX/* } */))/* } */ *
                                q00I),/* Join: { */0,0/* } */)/* } */;
                            
//#line 343
/* template:array_set { */(forceY).set(new Complex(
                              /* template:array_get { */((ffg).get(/* Join: { */0,0,ELECY_IDX/* } */))/* } */ *
                                q00R,
                              /* template:array_get { */((ffg2).get(/* Join: { */0,ELECY_IDX/* } */))/* } */ *
                                q00I),/* Join: { */0,0/* } */)/* } */;
                            
//#line 344
/* template:array_set { */(energy).set(/* template:array_get { */((energy).get(pl))/* } */ +
                              0.5 *
                              ((((/* template:array_get { */((ffg).get(/* Join: { */0,0,GREENS_IDX/* } */))/* } */ *
                                    java.
                                      lang.
                                      Math.
                                      pow(
                                      q00R,
                                      2))) +
                                  ((/* template:array_get { */((ffg2).get(/* Join: { */0,GREENS_IDX/* } */))/* } */ *
                                      java.
                                        lang.
                                        Math.
                                        pow(
                                        q00I,
                                        2))))),pl)/* } */;
                            
//#line 345
final double q0NYR =
                              /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,y/* } */))/* } */))/* } */.
                                getReal();
                            
//#line 346
final double q0NYI =
                              /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,y/* } */))/* } */))/* } */.
                                getImag();
                            
//#line 347
/* template:array_set { */(forceX).set(new Complex(
                              /* template:array_get { */((ffg).get(/* Join: { */0,y,ELECX_IDX/* } */))/* } */ *
                                q0NYR,
                              /* template:array_get { */((ffg2).get(/* Join: { */y,ELECX_IDX/* } */))/* } */ *
                                q0NYI),/* Join: { */0,y/* } */)/* } */;
                            
//#line 348
/* template:array_set { */(forceY).set(new Complex(
                              /* template:array_get { */((ffg).get(/* Join: { */0,y,ELECY_IDX/* } */))/* } */ *
                                q0NYR,
                              /* template:array_get { */((ffg2).get(/* Join: { */y,ELECY_IDX/* } */))/* } */ *
                                q0NYI),/* Join: { */0,y/* } */)/* } */;
                            
//#line 349
/* template:array_set { */(energy).set(/* template:array_get { */((energy).get(pl))/* } */ +
                              0.5 *
                              ((((/* template:array_get { */((ffg).get(/* Join: { */0,y,GREENS_IDX/* } */))/* } */ *
                                    java.
                                      lang.
                                      Math.
                                      pow(
                                      q0NYR,
                                      2))) +
                                  ((/* template:array_get { */((ffg2).get(/* Join: { */y,GREENS_IDX/* } */))/* } */ *
                                      java.
                                        lang.
                                        Math.
                                        pow(
                                        q0NYI,
                                        2))))),pl)/* } */;
                        }
                    }
                }
                		}
                	});/* } */
            }
            	} catch (Throwable tmp93) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp93);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
        
//#line 353
return 4.0 *
          x *
          y *
          energy.
            sum();
    }
    
    
//#line 355
public double
                   potentialField(
                   final double r,
                   final double ari,
                   final double affp) {
        
//#line 356
final double anorm =
          affp *
          PI4I;
        
//#line 357
if (ari >
                           0) {
            
//#line 358
if (r ==
                               0.0) {
                
//#line 359
return anorm *
                  SQT2PI *
                  ari;
            } else {
                
//#line 362
return anorm *
                  errorFn(
                    r *
                      SQT2I *
                      ari) /
                  r;
            }
        } else {
            
//#line 366
if (r ==
                               0.0) {
                
//#line 367
return 0.0;
            } else {
                
//#line 370
return anorm /
                  r;
            }
        }
    }
    
    
//#line 374
public double
                   particleShape(
                   final double r,
                   final double ari,
                   final double affp) {
        
//#line 375
final double anorm =
          affp *
          java.
            lang.
            Math.
            pow(
            0.5 *
              SQT2PI *
              ari,
            2);
        
//#line 376
if (ari >
                           0.0) {
            
//#line 377
if (r ==
                               0.0) {
                
//#line 378
return anorm;
            } else {
                
//#line 381
final double at1 =
                  X10Util.
                    minDouble(
                    r *
                      SQT2I *
                      ari,
                    8.0);
                
//#line 382
return anorm *
                  java.
                    lang.
                    Math.
                    exp(
                    -((at1 *
                         at1)));
            }
        } else {
            
//#line 386
if (r ==
                               0.0) {
                
//#line 387
return affp;
            } else {
                
//#line 390
return 0.0;
            }
        }
    }
    
    
//#line 394
public double
                   radialElectricField(
                   final double r,
                   final double ari,
                   final double affp) {
        
//#line 395
final double anorm =
          affp *
          PI4I;
        
//#line 396
if (ari >
                           0.0) {
            
//#line 397
if (r ==
                               0.0) {
                
//#line 398
return 0.0;
            } else {
                
//#line 401
final double ri =
                  1.0 /
                  r;
                
//#line 402
final double at1 =
                  X10Util.
                    minDouble(
                    r *
                      SQT2I *
                      ari,
                    8.0);
                
//#line 403
return anorm *
                  ri *
                  ((errorFn(
                      at1) *
                      ri -
                      SQT2PI *
                      ari *
                      java.
                        lang.
                        Math.
                        exp(
                        -((at1 *
                             at1)))));
            }
        } else {
            
//#line 407
if (r ==
                               0.0) {
                
//#line 408
return 0.0;
            } else {
                
//#line 411
return anorm /
                  ((r *
                      r));
            }
        }
    }
    
    
//#line 415
public double
                   errorFn(
                   final double x) {
        
//#line 416
final double p =
          0.3275911;
        
//#line 417
final double a1 =
          0.254829592;
        
//#line 418
final double a2 =
          -0.284496736;
        
//#line 419
final double a3 =
          1.421413741;
        
//#line 420
final double a4 =
          -1.453152027;
        
//#line 421
final double a5 =
          1.061405429;
        
//#line 422
final double f =
          java.
            lang.
            Math.
            abs(
            x);
        
//#line 423
final double t =
          1.0 /
          ((1.0 +
              p *
              f));
        
//#line 424
double ret =
          0.0;
        
//#line 425
if (f <=
                           8.0) {
            
//#line 426
ret =
              1.0 -
                t *
                ((a1 +
                    t *
                    ((a2 +
                        t *
                        ((a3 +
                            t *
                            ((a4 +
                                t *
                                a5)))))))) *
                java.
                  lang.
                  Math.
                  exp(
                  -x *
                    x);
        } else {
            
//#line 429
ret =
              1.0;
        }
        
//#line 431
if (x <
                           0) {
            
//#line 432
ret =
              -ret;
        }
        
//#line 434
return ret;
    }
    
    
//#line 436
public double
                   expIntNL(
                   final double x) {
        
//#line 437
final double a0 =
          -0.57721566;
        
//#line 438
final double a1 =
          0.99999193;
        
//#line 439
final double a2 =
          -0.24991055;
        
//#line 440
final double a3 =
          0.05519968;
        
//#line 441
final double a4 =
          -0.00976004;
        
//#line 442
final double a5 =
          0.00107857;
        
//#line 443
final double b1 =
          8.5733287401;
        
//#line 444
final double b2 =
          18.059016973;
        
//#line 445
final double b3 =
          8.6347608925;
        
//#line 446
final double b4 =
          0.2677737343;
        
//#line 447
final double c1 =
          9.5733223454;
        
//#line 448
final double c2 =
          25.6329561486;
        
//#line 449
final double c3 =
          21.0996530827;
        
//#line 450
final double c4 =
          3.9584969228;
        
//#line 451
if (x <
                           1.0) {
            
//#line 452
return a0 +
              x *
              ((a1 +
                  x *
                  ((a2 +
                      x *
                      ((a3 +
                          x *
                          ((a4 +
                              x *
                              a5))))))));
        } else {
            
//#line 455
if (x <
                               50.0) {
                
//#line 456
return java.
                                      lang.
                                      Math.
                                      log(
                                      x) +
                  ((((java.
                        lang.
                        Math.
                        exp(
                        -x) /
                        x)) *
                      ((((b4 +
                            x *
                            ((b3 +
                                x *
                                ((b2 +
                                    x *
                                    ((b1 +
                                        x)))))))) /
                          ((c4 +
                              x *
                              ((c3 +
                                  x *
                                  ((c2 +
                                      x *
                                      ((c1 +
                                          x))))))))))));
            } else {
                
//#line 459
return java.
                                      lang.
                                      Math.
                                      log(
                                      x);
            }
        }
    }
    
    
//#line 462
public java.
                   lang.
                   String
                   toString(
                   ) {
        
//#line 463
return "PoisonSolver: xbits = " +
        xBits +
        " ybits = " +
        yBits;
    }
}

public class LinearESOpenPIC2DMain
extends x10.
  lang.
  Object
{
    
    
//#line 468
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
            
//#line 470
Timer tmr =
              new Timer(
              );
            
//#line 471
int count =
              0;
            
//#line 472
/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.start(count);
            
//#line 473
/* template:place-check { */((LinearESOpenPIC2D) x10.lang.Runtime.hereCheck(new LinearESOpenPIC2D(
              )))/* } */.run();
            
//#line 474
/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.stop(count);
            
//#line 475
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("Wall-clock time for plasma: " +
                                                                                                                              /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.readTimer(count) +
                                                                                                                              " secs");
        }
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 467
public LinearESOpenPIC2DMain() {
        
//#line 467
super();
    }
}

class Complex
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 481
final private double
      real;
    
//#line 482
final private double
      imag;
    
    
//#line 483
public Complex(final double real,
                                final double imag) {
        
//#line 483
super();
        
//#line 484
this.
                       real =
          real;
        
//#line 485
this.
                       imag =
          imag;
    }
    
    
//#line 487
public double
                   getReal(
                   ) {
        
//#line 488
return real;
    }
    
    
//#line 490
public double
                   getImag(
                   ) {
        
//#line 491
return imag;
    }
    
    
//#line 493
public Complex
                   add(
                   final Complex n) {
        
//#line 494
return new Complex(
          getReal() +
            n.
              getReal(),
          getImag() +
            n.
              getImag());
    }
    
    
//#line 496
public Complex
                   sub(
                   final Complex n) {
        
//#line 497
return new Complex(
          getReal() -
            n.
              getReal(),
          getImag() -
            n.
              getImag());
    }
    
    
//#line 499
public Complex
                   mult(
                   final Complex n) {
        
//#line 500
final double a =
          getReal();
        
//#line 501
final double b =
          getImag();
        
//#line 502
final double c =
          n.
            getReal();
        
//#line 503
final double d =
          n.
            getImag();
        
//#line 504
return new Complex(
          a *
            c -
            b *
            d,
          a *
            d +
            b *
            c);
    }
    
    
//#line 506
public Complex
                   multS(
                   final double r) {
        
//#line 507
return new Complex(
          r *
            getReal(),
          r *
            getImag());
    }
    
    
//#line 509
public Complex
                   getConjg(
                   ) {
        
//#line 510
return new Complex(
          getReal(),
          -getImag());
    }
    
    
//#line 512
public double
                   multConjg(
                   ) {
        
//#line 513
final double a =
          getReal();
        
//#line 514
final double b =
          getImag();
        
//#line 515
return (a *
                               a +
                               b *
                               b);
    }
    
    
//#line 517
public boolean
                   complexEquals(
                   final Complex c) {
        
//#line 518
return (((java.
                                 lang.
                                 Math.
                                 abs(
                                 getReal() -
                                   c.
                                     getReal()) <
                                 X10Util.
                                   ERROR)) &&
                               ((java.
                                   lang.
                                   Math.
                                   abs(
                                   getImag() -
                                     c.
                                       getImag()) <
                                   X10Util.
                                     ERROR)));
    }
    
    
//#line 520
public java.
                   lang.
                   String
                   toString(
                   ) {
        
//#line 521
final double r =
          getReal();
        
//#line 522
final double i =
          getImag();
        
//#line 523
return "(" +
        r +
        "," +
        i +
        ")";
    }
}

class Random
extends x10.
  lang.
  Object
{
    
//#line 528
private int
      flag;
    
//#line 529
private double
      r0;
    
//#line 530
private int
      r1;
    
//#line 531
private int
      r2;
    
//#line 532
private int
      r4;
    
//#line 533
private int
      r5;
    
//#line 534
private double
      h1l;
    
//#line 535
private double
      h1u;
    
//#line 536
private double
      h2l;
    
    
//#line 537
public Random() {
        
//#line 537
super();
        
//#line 538
flag =
          0;
        
//#line 539
r0 =
          0.0;
        
//#line 540
r1 =
          885098780;
        
//#line 541
r2 =
          1824280461;
        
//#line 542
r4 =
          1396483093;
        
//#line 543
r5 =
          55318673;
        
//#line 544
h1l =
          65531.0;
        
//#line 545
h1u =
          32767.0;
        
//#line 546
h2l =
          65525.0;
    }
    
    
//#line 548
public double
                   nextNormal(
                   ) {
        
//#line 549
double ret =
          0.0;
        
//#line 550
if (flag !=
                           0) {
            
//#line 551
ret =
              r0;
            
//#line 552
r0 =
              0.0;
            
//#line 553
flag =
              0;
        } else {
            
//#line 556
int isc =
              65536;
            
//#line 557
double asc =
              isc;
            
//#line 558
double bsc =
              asc *
              asc;
            
//#line 559
int i1 =
              r1 -
              ((r1 /
                  isc)) *
              isc;
            
//#line 560
double r3 =
              h1l *
              r1 +
              asc *
              h1u *
              i1;
            
//#line 561
i1 =
              (int)
                ((r3 /
                    bsc));
            
//#line 562
r3 =
              r3 -
                ((i1 *
                    bsc));
            
//#line 563
bsc =
              0.5 *
                bsc;
            
//#line 564
i1 =
              r2 /
                isc;
            
//#line 565
isc =
              r2 -
                i1 *
                isc;
            
//#line 566
r0 =
              h1l *
                r2 +
                asc *
                h1u *
                isc;
            
//#line 567
asc =
              1.0 /
                bsc;
            
//#line 568
isc =
              (int)
                ((r0 *
                    asc));
            
//#line 569
r2 =
              (int)
                ((r0 -
                    isc *
                    bsc));
            
//#line 570
r3 =
              r3 +
                isc +
                2.0 *
                h1u *
                i1;
            
//#line 571
isc =
              (int)
                ((r3 *
                    asc));
            
//#line 572
r1 =
              (int)
                ((r3 -
                    isc *
                    bsc));
            
//#line 573
double temp =
              java.
                lang.
                Math.
                sqrt(
                -2.0 *
                  java.
                    lang.
                    Math.
                    log(
                    ((r1 +
                        r2 *
                        asc)) *
                      asc));
            
//#line 574
isc =
              65536;
            
//#line 575
asc =
              isc;
            
//#line 576
bsc =
              asc *
                asc;
            
//#line 577
i1 =
              r4 -
                ((r4 /
                    isc)) *
                isc;
            
//#line 578
r3 =
              h2l *
                r4 +
                asc *
                h1u *
                i1;
            
//#line 579
i1 =
              (int)
                ((r3 /
                    bsc));
            
//#line 580
r3 =
              r3 -
                ((i1 *
                    bsc));
            
//#line 581
bsc =
              0.5 *
                bsc;
            
//#line 582
i1 =
              r5 /
                isc;
            
//#line 583
isc =
              r5 -
                i1 *
                isc;
            
//#line 584
r0 =
              h2l *
                r5 +
                asc *
                h1u *
                isc;
            
//#line 585
asc =
              1.0 /
                bsc;
            
//#line 586
isc =
              (int)
                ((r0 *
                    asc));
            
//#line 587
r5 =
              (int)
                ((r0 -
                    isc *
                    bsc));
            
//#line 588
r3 =
              r3 +
                ((isc +
                    2.0 *
                    h1u *
                    i1));
            
//#line 589
isc =
              (int)
                ((r3 *
                    asc));
            
//#line 590
r4 =
              (int)
                ((r3 -
                    isc *
                    bsc));
            
//#line 591
r0 =
              6.28318530717959 *
                ((((r4 +
                      r5 *
                      asc)) *
                    asc));
            
//#line 592
ret =
              temp *
                java.
                  lang.
                  Math.
                  sin(
                  r0);
            
//#line 593
r0 =
              temp *
                java.
                  lang.
                  Math.
                  cos(
                  r0);
            
//#line 594
flag =
              1;
        }
        
//#line 596
return ret;
    }
}

class X10Util
extends x10.
  lang.
  Object
{
    
//#line 601
final public static boolean
      DEBUG =
      true;
    
//#line 602
final public static boolean
      ENABLE_CHECKS =
      true;
    
//#line 603
final public static double
      ERROR =
      1.0E-13;
    
    
//#line 604
public static double
                   maxDouble(
                   final double d1,
                   final double d2) {
        
//#line 605
return ((d1 >=
                                d2))
          ? d1
          : d2;
    }
    
    
//#line 607
public static double
                   minDouble(
                   final double d1,
                   final double d2) {
        
//#line 608
return ((d1 >=
                                d2))
          ? d2
          : d1;
    }
    
    
//#line 610
public static int
                   maxInt(
                   final int i1,
                   final int i2) {
        
//#line 611
return ((i1 >=
                                i2))
          ? i1
          : i2;
    }
    
    
//#line 613
public static int
                   minInt(
                   final int i1,
                   final int i2) {
        
//#line 614
return ((i1 >=
                                i2))
          ? i2
          : i1;
    }
    
    
//#line 616
public static x10.
                   lang.
                   region
                   prependRegionRank2D(
                   final x10.
                     lang.
                     region r1,
                   final x10.
                     lang.
                     region r2) {
        
//#line 617
return extendRegionRank2D(
                              r1,
                              r2);
    }
    
    
//#line 619
public static x10.
                   lang.
                   region
                   prependRegionRank3D(
                   final x10.
                     lang.
                     region r1,
                   final x10.
                     lang.
                     region r2) {
        
//#line 620
return x10.
                              lang.
                              region.
                              factory.
                              region(
                              r1,
                              getRank2D(
                                r2,
                                0),
                              getRank2D(
                                r2,
                                1));
    }
    
    
//#line 622
public static x10.
                   lang.
                   region
                   extendRegionRank2D(
                   final x10.
                     lang.
                     region r1,
                   final x10.
                     lang.
                     region r2) {
        
//#line 623
return x10.
                              lang.
                              region.
                              factory.
                              region(
                              r1,
                              r2);
    }
    
    
//#line 625
public static x10.
                   lang.
                   region
                   extendRegionRank3D(
                   final x10.
                     lang.
                     region r1,
                   final x10.
                     lang.
                     region r2) {
        
//#line 626
return x10.
                              lang.
                              region.
                              factory.
                              region(
                              getRank2D(
                                r1,
                                0),
                              getRank2D(
                                r1,
                                1),
                              r2);
    }
    
    
//#line 628
public static x10.
                   lang.
                   dist
                   prependDistRank2D(
                   final x10.
                     lang.
                     region r1,
                   final x10.
                     lang.
                     dist d2) {
        
//#line 629
x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                x10.
                  lang.
                  region.
                  factory.
                  emptyRegion(
                  2),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 630
/* template:forloop { */
        for (java.util.Iterator pl__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pl__.hasNext(); ) {
        	final  x10.
          lang.
          point pl = (x10.
          lang.
          point) pl__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 631
final x10.
              lang.
              place p =
              x10.
                lang.
                dist.
                UNIQUE.
                get(
                pl);
            
//#line 632
final x10.
              lang.
              region rLocal =
              (x10.
                lang.
                region)
                ((d2.
                    restriction(
                    p))).
                  region;
            
//#line 633
dResult =
              dResult.
                union(
                (x10.
                   lang.
                   dist.
                   factory.
                   constant(
                   prependRegionRank2D(
                     r1,
                     rLocal),
                   p)));
        }/* } */
        }
        /* } */
        
        
//#line 635
return dResult;
    }
    
    
//#line 637
public static x10.
                   lang.
                   dist
                   prependDistRank3D(
                   final x10.
                     lang.
                     region r1,
                   final x10.
                     lang.
                     dist d2) {
        
//#line 638
x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                x10.
                  lang.
                  region.
                  factory.
                  emptyRegion(
                  3),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 639
/* template:forloop { */
        for (java.util.Iterator pl__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pl__.hasNext(); ) {
        	final  x10.
          lang.
          point pl = (x10.
          lang.
          point) pl__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 640
final x10.
              lang.
              place p =
              x10.
                lang.
                dist.
                UNIQUE.
                get(
                pl);
            
//#line 641
final x10.
              lang.
              region rLocal =
              (x10.
                lang.
                region)
                ((d2.
                    restriction(
                    p))).
                  region;
            
//#line 642
dResult =
              dResult.
                union(
                (x10.
                   lang.
                   dist.
                   factory.
                   constant(
                   prependRegionRank3D(
                     r1,
                     rLocal),
                   p)));
        }/* } */
        }
        /* } */
        
        
//#line 644
return dResult;
    }
    
    
//#line 646
public static x10.
                   lang.
                   dist
                   extendDistRank2D(
                   final x10.
                     lang.
                     dist d1,
                   final x10.
                     lang.
                     region r2) {
        
//#line 647
x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                x10.
                  lang.
                  region.
                  factory.
                  emptyRegion(
                  2),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 648
/* template:forloop { */
        for (java.util.Iterator pl__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pl__.hasNext(); ) {
        	final  x10.
          lang.
          point pl = (x10.
          lang.
          point) pl__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 649
final x10.
              lang.
              place p =
              x10.
                lang.
                dist.
                UNIQUE.
                get(
                pl);
            
//#line 650
final x10.
              lang.
              region rLocal =
              (x10.
                lang.
                region)
                ((d1.
                    restriction(
                    p))).
                  region;
            
//#line 651
dResult =
              dResult.
                union(
                (x10.
                   lang.
                   dist.
                   factory.
                   constant(
                   extendRegionRank2D(
                     rLocal,
                     r2),
                   p)));
        }/* } */
        }
        /* } */
        
        
//#line 653
return dResult;
    }
    
    
//#line 655
public static x10.
                   lang.
                   dist
                   extendDistRank3D(
                   final x10.
                     lang.
                     dist d1,
                   final x10.
                     lang.
                     region r2) {
        
//#line 656
x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                x10.
                  lang.
                  region.
                  factory.
                  emptyRegion(
                  3),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 657
/* template:forloop { */
        for (java.util.Iterator pl__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pl__.hasNext(); ) {
        	final  x10.
          lang.
          point pl = (x10.
          lang.
          point) pl__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 658
final x10.
              lang.
              place p =
              x10.
                lang.
                dist.
                UNIQUE.
                get(
                pl);
            
//#line 659
final x10.
              lang.
              region rLocal =
              (x10.
                lang.
                region)
                ((d1.
                    restriction(
                    p))).
                  region;
            
//#line 660
dResult =
              dResult.
                union(
                (x10.
                   lang.
                   dist.
                   factory.
                   constant(
                   extendRegionRank3D(
                     rLocal,
                     r2),
                   p)));
        }/* } */
        }
        /* } */
        
        
//#line 662
return dResult;
    }
    
    
//#line 664
public static x10.
                   lang.
                   dist
                   distBlock(
                   final x10.
                     lang.
                     region r) {
        
//#line 665
if (r.
                           low() !=
                           0) {
            
//#line 666
throw new java.
              lang.
              RuntimeException(
              "distBlock only applies to rails");
        }
        
//#line 668
if (r.
                           high() !=
                           r.
                             size() -
                           1) {
            
//#line 669
throw new java.
              lang.
              RuntimeException(
              "distblock only applies to rails");
        }
        
//#line 671
int blockSize =
          r.
            size() /
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 672
x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                x10.
                  lang.
                  region.
                  factory.
                  emptyRegion(
                  1),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 673
/* template:forloop { */
        for (java.util.Iterator pl__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pl__.hasNext(); ) {
        	final  x10.
          lang.
          point pl = (x10.
          lang.
          point) pl__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 674
final x10.
              lang.
              place p =
              x10.
                lang.
                dist.
                UNIQUE.
                get(
                pl);
            
//#line 675
x10.
              lang.
              dist ext =
              (x10.
                lang.
                dist)
                ((x10.
                    lang.
                    dist.
                    factory.
                    constant(
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
                        /* template:array_get { */((pl).get(0))/* } */ *
                          blockSize,
                        ((((/* template:array_get { */((pl).get(0))/* } */ +
                              1)) *
                            blockSize)) -
                          1)),
                    p)));
            
//#line 676
dResult =
              dResult.
                union(
                ext);
        }/* } */
        }
        /* } */
        
        
//#line 678
int diff =
          r.
            size() -
          blockSize *
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 679
if (blockSize *
                           x10.
                             lang.
                             place.
                             MAX_PLACES !=
                           r.
                             size()) {
            
//#line 680
x10.
              lang.
              place l =
              x10.
                lang.
                place.
                places(
                x10.
                  lang.
                  place.
                  MAX_PLACES -
                  1);
            
//#line 681
x10.
              lang.
              dist ext =
              (x10.
                lang.
                dist)
                ((x10.
                    lang.
                    dist.
                    factory.
                    constant(
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
                        r.
                          size() -
                          diff,
                        r.
                          size() -
                          1)),
                    l)));
            
//#line 682
dResult =
              dResult.
                union(
                ext);
        }
        
//#line 684
return dResult;
    }
    
    
//#line 686
public static x10.
                   lang.
                   dist
                   distBlockStar1(
                   final x10.
                     lang.
                     region r) {
        
//#line 687
final x10.
          lang.
          region r1 =
          getRank2D(
            r,
            0);
        
//#line 688
final x10.
          lang.
          dist d1 =
          distBlock(
            r1);
        
//#line 689
return extendDistRank2D(
                              d1,
                              getRank2D(
                                r,
                                1));
    }
    
    
//#line 691
public static x10.
                   lang.
                   dist
                   distBlockStar2(
                   final x10.
                     lang.
                     region r1,
                   final x10.
                     lang.
                     region r2) {
        
//#line 692
return distBlockStar1(
                              x10.
                                lang.
                                region.
                                factory.
                                region(
                                r1,
                                r2));
    }
    
    
//#line 694
public static x10.
                   lang.
                   dist
                   distStarBlock1(
                   final x10.
                     lang.
                     region r) {
        
//#line 695
final x10.
          lang.
          region r2 =
          getRank2D(
            r,
            1);
        
//#line 696
final x10.
          lang.
          dist d2 =
          distBlock(
            r2);
        
//#line 697
return prependDistRank2D(
                              getRank2D(
                                r,
                                0),
                              d2);
    }
    
    
//#line 699
public static x10.
                   lang.
                   dist
                   distStarBlock2(
                   final x10.
                     lang.
                     region r1,
                   final x10.
                     lang.
                     region r2) {
        
//#line 700
return distStarBlock1(
                              x10.
                                lang.
                                region.
                                factory.
                                region(
                                r1,
                                r2));
    }
    
    
//#line 702
public static boolean
                   isDistBlockStar(
                   final x10.
                     lang.
                     dist d) {
        
//#line 703
if (ENABLE_CHECKS) {
            
//#line 704
final x10.
              lang.
              region rd =
              d.
                region;
            
//#line 705
final x10.
              lang.
              region r1 =
              getRank2D(
                rd,
                0);
            
//#line 706
final x10.
              lang.
              region r2 =
              getRank2D(
                rd,
                1);
            
//#line 707
final x10.
              lang.
              dist dRef =
              new x10.
                runtime.
                RuntimeCastChecker.
                DepTypeRuntimeChecking(
                ) {
                  
                  
//#line 707
public x10.
                                 lang.
                                 dist
                                 checkCast(
                                 final x10.
                                   lang.
                                   dist x10_generated_objToCast) {
                      
//#line 707
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
            
//#line 708
/* template:forloop { */
            for (java.util.Iterator pl__ = (x10.
                                              lang.
                                              dist.
                                              UNIQUE.
                                              region).iterator(); pl__.hasNext(); ) {
            	final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 709
final x10.
                  lang.
                  place p =
                  x10.
                    lang.
                    dist.
                    UNIQUE.
                    get(
                    pl);
                
//#line 710
final x10.
                  lang.
                  region rLocal =
                  (x10.
                    lang.
                    region)
                    ((d.
                        restriction(
                        p))).
                      region;
                
//#line 711
final x10.
                  lang.
                  region rRefLocal =
                  (x10.
                    lang.
                    region)
                    ((dRef.
                        restriction(
                        p))).
                      region;
                
//#line 712
if (!((getRank2D(
                                      rLocal,
                                      0).
                                      equals(
                                      rRefLocal)))) {
                    
//#line 713
return false;
                } else {
                    
//#line 716
if (!((getRank2D(
                                          rLocal,
                                          1).
                                          equals(
                                          r2)))) {
                        
//#line 717
if (rRefLocal.
                                           size() >
                                           0) {
                            
//#line 718
return false;
                        }
                    }
                }
            }/* } */
            }
            /* } */
            
        }
        
//#line 723
return true;
    }
    
    
//#line 725
public static boolean
                   isDistStarBlock(
                   final x10.
                     lang.
                     dist d) {
        
//#line 726
if (ENABLE_CHECKS) {
            
//#line 727
final x10.
              lang.
              region rd =
              d.
                region;
            
//#line 728
final x10.
              lang.
              region r1 =
              getRank2D(
                rd,
                0);
            
//#line 729
final x10.
              lang.
              region r2 =
              getRank2D(
                rd,
                1);
            
//#line 730
final x10.
              lang.
              dist dRef =
              new x10.
                runtime.
                RuntimeCastChecker.
                DepTypeRuntimeChecking(
                ) {
                  
                  
//#line 730
public x10.
                                 lang.
                                 dist
                                 checkCast(
                                 final x10.
                                   lang.
                                   dist x10_generated_objToCast) {
                      
//#line 730
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
                  r2));
            
//#line 731
/* template:forloop { */
            for (java.util.Iterator pl__ = (x10.
                                              lang.
                                              dist.
                                              UNIQUE.
                                              region).iterator(); pl__.hasNext(); ) {
            	final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 732
final x10.
                  lang.
                  place p =
                  x10.
                    lang.
                    dist.
                    UNIQUE.
                    get(
                    pl);
                
//#line 733
final x10.
                  lang.
                  region rLocal =
                  (x10.
                    lang.
                    region)
                    ((d.
                        restriction(
                        p))).
                      region;
                
//#line 734
final x10.
                  lang.
                  region rRefLocal =
                  (x10.
                    lang.
                    region)
                    ((dRef.
                        restriction(
                        p))).
                      region;
                
//#line 735
if (!((getRank2D(
                                      rLocal,
                                      0).
                                      equals(
                                      r1) &&
                                      getRank2D(
                                        rLocal,
                                        1).
                                        equals(
                                        rRefLocal)))) {
                    
//#line 736
return false;
                }
            }/* } */
            }
            /* } */
            
        }
        
//#line 740
return true;
    }
    
    
//#line 742
public static x10.
                   lang.
                   dist
                   get2DDistRank(
                   final x10.
                     lang.
                     dist d,
                   final int n) {
        
//#line 743
if (n >
                           2 ||
                           n <
                           0) {
            
//#line 744
throw new java.
              lang.
              RuntimeException(
              "Rank must within bounds");
        }
        
//#line 746
x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                x10.
                  lang.
                  region.
                  factory.
                  emptyRegion(
                  1),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 747
/* template:forloop { */
        for (java.util.Iterator pl__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pl__.hasNext(); ) {
        	final  x10.
          lang.
          point pl = (x10.
          lang.
          point) pl__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 748
final x10.
              lang.
              place p =
              x10.
                lang.
                dist.
                UNIQUE.
                get(
                pl);
            
//#line 749
final x10.
              lang.
              region rLocal =
              ((d.
                  restriction(
                  p))).
                region;
            
//#line 750
final x10.
              lang.
              region rLocalN =
              getRank2D(
                rLocal,
                n);
            
//#line 751
dResult =
              dResult.
                union(
                (x10.
                   lang.
                   dist.
                   factory.
                   constant(
                   (rLocalN.
                      difference(
                      dResult.
                        region)),
                   p)));
        }/* } */
        }
        /* } */
        
        
//#line 753
return dResult;
    }
    
    
//#line 755
public static x10.
                   lang.
                   region
                   transposeRegion(
                   final x10.
                     lang.
                     region r) {
        
//#line 756
return x10.
                              lang.
                              region.
                              factory.
                              region(
                              getRank2D(
                                r,
                                1),
                              getRank2D(
                                r,
                                0));
    }
    
    
//#line 758
public static x10.
                   lang.
                   dist
                   transposeDist(
                   final x10.
                     lang.
                     dist d) {
        
//#line 759
x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                x10.
                  lang.
                  region.
                  factory.
                  emptyRegion(
                  2),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 760
/* template:forloop { */
        for (java.util.Iterator pl__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pl__.hasNext(); ) {
        	final  x10.
          lang.
          point pl = (x10.
          lang.
          point) pl__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 761
final x10.
              lang.
              place p =
              x10.
                lang.
                dist.
                UNIQUE.
                get(
                pl);
            
//#line 762
final x10.
              lang.
              region rLocal =
              (x10.
                lang.
                region)
                ((d.
                    restriction(
                    p))).
                  region;
            
//#line 763
dResult =
              dResult.
                union(
                (x10.
                   lang.
                   dist.
                   factory.
                   constant(
                   transposeRegion(
                     rLocal),
                   p)));
        }/* } */
        }
        /* } */
        
        
//#line 765
return dResult;
    }
    
    
//#line 767
public static x10.
                   lang.
                   dist
                   transposeBlockStar(
                   final x10.
                     lang.
                     dist d) {
        
//#line 768
final x10.
          lang.
          region rd =
          d.
            region;
        
//#line 769
final x10.
          lang.
          region r1 =
          getRank2D(
            rd,
            0);
        
//#line 770
final x10.
          lang.
          region r2 =
          getRank2D(
            rd,
            1);
        
//#line 771
return extendDistRank2D(
                              distBlock(
                                r2),
                              r1);
    }
    
    
//#line 773
public static boolean
                   pullBoolean(
                   final x10.
                     lang.
                     BooleanReferenceArray b,
                   final x10.
                     lang.
                     point pt) {
        
//#line 774
if (!b.
                            region.
                            contains(
                            pt)) {
            
//#line 775
println(
                           "pt must be contained in b.region: " +
                           b.
                             region +
                           " " +
                           pt);
            
//#line 776
throw new java.
              lang.
              RuntimeException(
              "pullBoolean Exception: " +
              pt);
        }
        
//#line 778
final x10.
          lang.
          place pHere =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 779
final x10.
          lang.
          dist dDst =
          x10.
            lang.
            dist.
            factory.
            constant(
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
                0)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 780
final x10.
          lang.
          BooleanReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.BooleanArray(dDst,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 781
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 782
/* template:Async { */(x10.lang.Runtime.asPlace(b.
                                                                           distribution.
                                                                           get(
                                                                           pt))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 783
final boolean val =
                  /* template:array_get { */((b).get(pt))/* } */;
                
//#line 784
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 785
/* template:array_set { */(result).set(val,0)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp109) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp109);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 788
return /* template:array_get { */((result).get(0))/* } */;
    }
    
    
//#line 790
public static Complex
                   pullComplex(
                   final x10.
                     lang.
                     GenericReferenceArray c,
                   final x10.
                     lang.
                     point pt) {
        
//#line 791
if (!c.
                            region.
                            contains(
                            pt)) {
            
//#line 792
println(
                           "pt must be contained in c.region: " +
                           c.
                             region +
                           " " +
                           pt);
            
//#line 793
throw new java.
              lang.
              RuntimeException(
              "Complex Exception: " +
              pt);
        }
        
//#line 795
final x10.
          lang.
          place pHere =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 796
final x10.
          lang.
          dist dDst =
          x10.
            lang.
            dist.
            factory.
            constant(
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
                0)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 797
final x10.
          lang.
          GenericReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dDst,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 798
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 799
/* template:Async { */(x10.lang.Runtime.asPlace(c.
                                                                           distribution.
                                                                           get(
                                                                           pt))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 800
final Complex val =
                  /* template:parametric { */((Complex)(/* template:array_get { */((c).get(pt))/* } */))/* } */;
                
//#line 801
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 802
/* template:array_set { */(result).set(val,0)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp110) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp110);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 805
return /* template:parametric { */((Complex)(/* template:array_get { */((result).get(0))/* } */))/* } */;
    }
    
    
//#line 807
public static int
                   pullInt(
                   final x10.
                     lang.
                     IntReferenceArray i,
                   final x10.
                     lang.
                     point pt) {
        
//#line 808
if (!i.
                            region.
                            contains(
                            pt)) {
            
//#line 809
println(
                           "pt must be contained in i.region: " +
                           i.
                             region +
                           " " +
                           pt);
            
//#line 810
throw new java.
              lang.
              RuntimeException(
              "pullDouble Exception: " +
              pt);
        }
        
//#line 812
final x10.
          lang.
          place pHere =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 813
final x10.
          lang.
          dist dDst =
          x10.
            lang.
            dist.
            factory.
            constant(
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
                0)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 814
final x10.
          lang.
          IntReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dDst,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 815
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 816
/* template:Async { */(x10.lang.Runtime.asPlace(i.
                                                                           distribution.
                                                                           get(
                                                                           pt))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 817
final int val =
                  /* template:array_get { */((i).get(pt))/* } */;
                
//#line 818
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 819
/* template:array_set { */(result).set(val,0)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp111) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp111);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 822
return /* template:array_get { */((result).get(0))/* } */;
    }
    
    
//#line 824
public static double
                   pullDouble(
                   final x10.
                     lang.
                     DoubleReferenceArray d,
                   final x10.
                     lang.
                     point pt) {
        
//#line 825
if (!d.
                            region.
                            contains(
                            pt)) {
            
//#line 826
println(
                           "pt must be contained in d.region: " +
                           d.
                             region +
                           " " +
                           pt);
            
//#line 827
throw new java.
              lang.
              RuntimeException(
              "pullDouble Exception: " +
              pt);
        }
        
//#line 829
final x10.
          lang.
          place pHere =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 830
final x10.
          lang.
          dist dDst =
          x10.
            lang.
            dist.
            factory.
            constant(
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
                0)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 831
final x10.
          lang.
          DoubleReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dDst,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 832
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 833
/* template:Async { */(x10.lang.Runtime.asPlace(d.
                                                                           distribution.
                                                                           get(
                                                                           pt))).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 834
final double val =
                  /* template:array_get { */((d).get(pt))/* } */;
                
//#line 835
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 836
/* template:array_set { */(result).set(val,0)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp112) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp112);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 839
return /* template:array_get { */((result).get(0))/* } */;
    }
    
    
//#line 841
public static x10.
                   lang.
                   region
                   getRank2D(
                   final x10.
                     lang.
                     region r,
                   final int n) {
        
//#line 842
return new x10.
                              runtime.
                              RuntimeCastChecker.
                              DepTypeRuntimeChecking(
                              ) {
                                
                                
//#line 842
public x10.
                                               lang.
                                               region
                                               checkCast(
                                               final x10.
                                                 lang.
                                                 region x10_generated_objToCast) {
                                    
//#line 842
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
                              r.
                                rank(
                                n));
    }
    
    
//#line 844
public static x10.
                   lang.
                   region
                   getRank3D(
                   final x10.
                     lang.
                     region r,
                   final int n) {
        
//#line 845
return new x10.
                              runtime.
                              RuntimeCastChecker.
                              DepTypeRuntimeChecking(
                              ) {
                                
                                
//#line 845
public x10.
                                               lang.
                                               region
                                               checkCast(
                                               final x10.
                                                 lang.
                                                 region x10_generated_objToCast) {
                                    
//#line 845
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
                              r.
                                rank(
                                n));
    }
    
    
//#line 847
public static x10.
                   lang.
                   region
                   getLRank2D(
                   final x10.
                     lang.
                     dist d,
                   final int n) {
        
//#line 848
return getPRank2D(
                              d,
                              /* template:here { */x10.lang.Runtime.here()/* } */,
                              n);
    }
    
    
//#line 850
public static x10.
                   lang.
                   region
                   getLRank3D(
                   final x10.
                     lang.
                     dist d,
                   final int n) {
        
//#line 851
return getPRank3D(
                              d,
                              /* template:here { */x10.lang.Runtime.here()/* } */,
                              n);
    }
    
    
//#line 853
public static x10.
                   lang.
                   region
                   getPRank2D(
                   final x10.
                     lang.
                     dist d,
                   final x10.
                     lang.
                     place p,
                   final int n) {
        
//#line 854
return getRank2D(
                              ((d.
                                  restriction(
                                  p))).
                                region,
                              n);
    }
    
    
//#line 856
public static x10.
                   lang.
                   region
                   getPRank3D(
                   final x10.
                     lang.
                     dist d,
                   final x10.
                     lang.
                     place p,
                   final int n) {
        
//#line 857
return getRank3D(
                              ((d.
                                  restriction(
                                  p))).
                                region,
                              n);
    }
    
    
//#line 859
public static x10.
                   lang.
                   region
                   get1DLRegion(
                   final x10.
                     lang.
                     dist d) {
        
//#line 860
return (x10.
                              lang.
                              region)
                              ((d.
                                  restriction(
                                  /* template:here { */x10.lang.Runtime.here()/* } */))).
                                region;
    }
    
    
//#line 862
public static x10.
                   lang.
                   region
                   get1DPRegion(
                   final x10.
                     lang.
                     dist d,
                   final x10.
                     lang.
                     place p) {
        
//#line 863
return (x10.
                              lang.
                              region)
                              ((d.
                                  restriction(
                                  p))).
                                region;
    }
    
    
//#line 865
public static x10.
                   lang.
                   region
                   get2DLRegion(
                   final x10.
                     lang.
                     dist d) {
        
//#line 866
return (x10.
                              lang.
                              region)
                              ((d.
                                  restriction(
                                  /* template:here { */x10.lang.Runtime.here()/* } */))).
                                region;
    }
    
    
//#line 868
public static x10.
                   lang.
                   region
                   get2DPRegion(
                   final x10.
                     lang.
                     dist d,
                   final x10.
                     lang.
                     place p) {
        
//#line 869
return (x10.
                              lang.
                              region)
                              ((d.
                                  restriction(
                                  p))).
                                region;
    }
    
    
//#line 871
public static x10.
                   lang.
                   region
                   get3DLRegion(
                   final x10.
                     lang.
                     dist d) {
        
//#line 872
return (x10.
                              lang.
                              region)
                              ((d.
                                  restriction(
                                  /* template:here { */x10.lang.Runtime.here()/* } */))).
                                region;
    }
    
    
//#line 874
public static x10.
                   lang.
                   region
                   get3DPRegion(
                   final x10.
                     lang.
                     dist d,
                   final x10.
                     lang.
                     place p) {
        
//#line 875
return (x10.
                              lang.
                              region)
                              ((d.
                                  restriction(
                                  p))).
                                region;
    }
    
    
//#line 877
public static void
                   print(
                   final java.
                     lang.
                     String s) {
        
//#line 878
if (DEBUG) {
            
//#line 879
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.print(s);
        }
    }
    
    
//#line 882
public static void
                   println(
                   final java.
                     lang.
                     String s) {
        
//#line 883
print(
                       s);
        
//#line 884
newline();
    }
    
    
//#line 886
public static void
                   newline(
                   ) {
        
//#line 887
print(
                       "\n");
    }
    
    
//#line 600
public X10Util() {
        
//#line 600
super();
    }
}

class FourierTransform2D
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 892
final public int
      maxBits;
    
//#line 893
final public int
      nBits1;
    
//#line 894
final public int
      nBits2;
    
//#line 895
final public int
      length1;
    
//#line 896
final public int
      length2;
    
//#line 897
final public double
      invN;
    
//#line 898
final public x10.
      lang.
      intArray
      tableBitReverse;
    
//#line 899
final public x10.
      lang.
      GenericReferenceArray
      tableSineCosine;
    
    
//#line 900
public FourierTransform2D(final int nBits1,
                                           final int nBits2) {
        
//#line 900
super();
        
//#line 901
this.
                       nBits1 =
          nBits1;
        
//#line 902
this.
                       nBits2 =
          nBits2;
        
//#line 903
maxBits =
          X10Util.
            maxInt(
            nBits1,
            nBits2 -
              1);
        
//#line 904
final int len1 =
          1 <<
          nBits1;
        
//#line 905
final int len2 =
          1 <<
          nBits2;
        
//#line 906
length1 =
          len1;
        
//#line 907
length2 =
          len2;
        
//#line 908
invN =
          1.0 /
            ((2 *
                len1 *
                len2));
        
//#line 909
tableBitReverse =
          initBitReverse(
            nBits1,
            nBits2);
        
//#line 910
tableSineCosine =
          initSineCosine(
            len1,
            len2);
    }
    
    
//#line 912
public x10.
                   lang.
                   GenericReferenceArray
                   transformC(
                   final x10.
                     lang.
                     GenericReferenceArray f) {
        
//#line 913
scrambleY(
                       f);
        
//#line 914
bitReverse(
                       f,
                       0);
        
//#line 915
transformRank(
                       f,
                       0,
                       false);
        
//#line 916
final x10.
          lang.
          GenericReferenceArray g =
          ArrayUtil.
            transpose(
            f);
        
//#line 917
scrambleX(
                       g);
        
//#line 918
bitReverse(
                       g,
                       1);
        
//#line 919
transformRank(
                       g,
                       1,
                       false);
        
//#line 920
return g;
    }
    
    
//#line 922
public x10.
                   lang.
                   GenericReferenceArray
                   transformD(
                   final x10.
                     lang.
                     DoubleReferenceArray f) {
        
//#line 923
return transformC(
                              ArrayUtil.
                                doubleToComplex(
                                f));
    }
    
    
//#line 925
public x10.
                   lang.
                   GenericReferenceArray
                   inverseTransformC(
                   final x10.
                     lang.
                     GenericReferenceArray f) {
        
//#line 926
bitReverse(
                       f,
                       1);
        
//#line 927
transformRank(
                       f,
                       1,
                       true);
        
//#line 928
unscrambleX(
                       f);
        
//#line 929
final x10.
          lang.
          GenericReferenceArray g =
          ArrayUtil.
            transpose(
            f);
        
//#line 930
bitReverse(
                       g,
                       0);
        
//#line 931
transformRank(
                       g,
                       0,
                       true);
        
//#line 932
unscrambleY(
                       g);
        
//#line 933
return g;
    }
    
    
//#line 935
public x10.
                   lang.
                   GenericReferenceArray
                   inverseTransformD(
                   final x10.
                     lang.
                     DoubleReferenceArray f) {
        
//#line 936
return inverseTransformC(
                              ArrayUtil.
                                doubleToComplex(
                                f));
    }
    
    
//#line 938
public x10.
                   lang.
                   intArray
                   initBitReverse(
                   final int nBits1,
                   final int nBits2) {
        
//#line 939
final int maxBits =
          X10Util.
            maxInt(
            nBits2 -
              1,
            nBits1);
        
//#line 940
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
              ((1 <<
                  maxBits)) -
                1));
        
//#line 941
return (x10.
                              lang.
                              intArray)
                              (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(r.
                                                                                                                                        toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                               	public int apply(/* Join: { */x10.
                                 lang.
                                 point i/* } */, int dummy) { {
                                   
//#line 942
final int i0 =
                                     /* template:array_get { */((i).get(0))/* } */;
                                   
//#line 943
final int i1 =
                                     (((((i0 &
                                            65535)) <<
                                          16)) |
                                        ((((i0 >>
                                              16)) &
                                            65535)));
                                   
//#line 944
final int i2 =
                                     (((((i1 &
                                            16711935)) <<
                                          8)) |
                                        ((((i1 >>
                                              8)) &
                                            16711935)));
                                   
//#line 945
final int i3 =
                                     (((((i2 &
                                            252645135)) <<
                                          4)) |
                                        ((((i2 >>
                                              4)) &
                                            252645135)));
                                   
//#line 946
final int i4 =
                                     (((((i3 &
                                            858993459)) <<
                                          2)) |
                                        ((((i3 >>
                                              2)) &
                                            858993459)));
                                   
//#line 947
final int i5 =
                                     (((((i4 &
                                            1431655765)) <<
                                          1)) |
                                        ((((i4 >>
                                              1)) &
                                            1431655765)));
                                   
//#line 948
return i5 >>>
                                     ((java.
                                         lang.
                                         Integer.
                                         SIZE -
                                         maxBits));
                               } }
                               }/* } */,true,false,false)/* } */);
    }
    
    
//#line 951
public x10.
                   lang.
                   GenericReferenceArray
                   initSineCosine(
                   final int length1,
                   final int length2) {
        
//#line 952
final int maxLength =
          X10Util.
            maxInt(
            length1,
            length2);
        
//#line 953
final double PI2 =
          6.28318530717959;
        
//#line 954
final double k =
          PI2 /
          maxLength;
        
//#line 955
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
              ((maxLength /
                  2)) -
                1));
        
//#line 956
return (x10.
                              lang.
                              GenericReferenceArray)
                              (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(r.
                                                                                                                                            toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                               	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                                 lang.
                                 point i/* } */, x10.compilergenerated.Parameter1 dummy) { {
                                   
//#line 957
final double theta =
                                     k *
                                     /* template:array_get { */((i).get(0))/* } */;
                                   
//#line 958
return new Complex(
                                     java.
                                       lang.
                                       Math.
                                       cos(
                                       theta),
                                     -java.
                                        lang.
                                        Math.
                                        sin(
                                        theta));
                               } }
                               }/* } */,true,false,true)/* } */);
    }
    
    
//#line 961
public void
                   bitReverse(
                   final x10.
                     lang.
                     GenericReferenceArray f,
                   final int rnk) {
        
//#line 962
final int nBits =
          ((rnk ==
              0))
          ? nBits1
          : nBits2 -
          1;
        
//#line 963
final int r1Length =
          ((rnk ==
              0))
          ? length1
          : length2 /
          2;
        
//#line 964
final int nrx =
          ((1 <<
              nBits)) /
          r1Length;
        
//#line 965
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 966
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 967
final x10.
                  lang.
                  dist dF =
                  f.
                    distribution;
                
//#line 968
final x10.
                  lang.
                  region rLocal1 =
                  X10Util.
                    getLRank2D(
                    dF,
                    0);
                
//#line 969
/* template:foreach { */
                for (java.util.Iterator __var13____ = (x10.
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
                                                           r1Length -
                                                             1))).iterator(); __var13____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var13__ = (x10.
                  lang.
                  point) __var13____.next();
                	/* Join: { */final int j1 =
                  /* template:array_get { */((__var13__).get(0))/* } */;/* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { */final int j1 =
                  /* template:array_get { */((__var13__).get(0))/* } */;/* } */
{
                    
//#line 970
final int j2 =
                      /* template:array_get { */((tableBitReverse).get(j1))/* } */ >>
                      ((maxBits -
                          nBits));
                    
//#line 971
if (j1 <
                                       j2) {
                        
//#line 972
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 973
/* template:foreach { */
                            for (java.util.Iterator __var14____ = (rLocal1).iterator(); __var14____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var14__ = (x10.
                              lang.
                              point) __var14____.next();
                            	/* Join: { */final int i =
                              /* template:array_get { */((__var14__).get(0))/* } */;/* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { */final int i =
                              /* template:array_get { */((__var14__).get(0))/* } */;/* } */
{
                                
//#line 974
final Complex temp =
                                  /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j1/* } */))/* } */))/* } */;
                                
//#line 975
/* template:array_set { */(f).set(/* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j2/* } */))/* } */))/* } */,/* Join: { */i,j1/* } */)/* } */;
                                
//#line 976
/* template:array_set { */(f).set(temp,/* Join: { */i,j2/* } */)/* } */;
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                        }
                        	} catch (Throwable tmp114) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp114);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                    }
                }/* } */
                			}
                		});
                }
                /* } */
                
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp113) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp113);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 982
public void
                   scrambleX(
                   final x10.
                     lang.
                     GenericReferenceArray f) {
        
//#line 983
final int nxh =
          length2 /
          2;
        
//#line 984
final int nxhh =
          nxh /
          2;
        
//#line 985
final int kmr =
          X10Util.
            maxInt(
            length1,
            length2) /
          length2;
        
//#line 986
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 987
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 988
final x10.
                  lang.
                  dist dF =
                  f.
                    distribution;
                
//#line 989
final x10.
                  lang.
                  region rLocal =
                  X10Util.
                    get2DLRegion(
                    dF);
                
//#line 990
final x10.
                  lang.
                  region rLocal1 =
                  X10Util.
                    getRank2D(
                    rLocal,
                    0);
                
//#line 991
/* template:foreach { */
                for (java.util.Iterator pt__ = (x10.
                                                  lang.
                                                  region.
                                                  factory.
                                                  region(
                                                  rLocal1,
                                                  x10.
                                                    lang.
                                                    region.
                                                    factory.
                                                    region(
                                                    nxhh,
                                                    nxhh))).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { *//* } */
{
                    
//#line 992
/* template:array_set { */(f).set(((/* template:parametric { */((Complex)(/* template:array_get { */((f).get(pt))/* } */))/* } */.
                                                                       getConjg())).
                                                                     multS(
                                                                     2),pt)/* } */;
                    
//#line 993
final x10.
                      lang.
                      point pt0 =
                      /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pt))/* } */.mul(x10.
                                                                                                                 lang.
                                                                                                                 point.
                                                                                                                 factory.
                                                                                                                 point(
                                                                                                                 1,
                                                                                                                 0));
                    
//#line 994
final Complex t2 =
                      /* template:parametric { */((Complex)(/* template:array_get { */((f).get(pt0))/* } */))/* } */;
                    
//#line 995
final double t2Real =
                      t2.
                        getReal();
                    
//#line 996
final double t2Imag =
                      t2.
                        getImag();
                    
//#line 997
/* template:array_set { */(f).set(new Complex(
                      t2Real +
                        t2Imag,
                      t2Real -
                        t2Imag),pt0)/* } */;
                }/* } */
                			}
                		});
                }
                /* } */
                
                
//#line 999
/* template:forloop-mult { */{
                x10.lang.region __var116__ = (x10.lang.region) x10.
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
                                                                   nxhh -
                                                                     1));
                if (__var116__.size() > 0 && (__var116__ instanceof x10.array.MultiDimRegion || __var116__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var117__ = __var116__.rank(0).low(), __var118__ = __var116__.rank(0).high(); __var117__ <= __var118__; __var117__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j1 = __var117__;
                /* } */
                /* } */
{
                    
//#line 1000
final int j2 =
                      nxh -
                      j1;
                    
//#line 1001
final Complex t0 =
                      /* template:parametric { */((Complex)(/* template:array_get { */((tableSineCosine).get(kmr *
                      j1))/* } */))/* } */;
                    
//#line 1002
final Complex t1 =
                      new Complex(
                      t0.
                        getImag(),
                      t0.
                        getReal());
                    
//#line 1003
/* template:foreach { */
                    for (java.util.Iterator __var16____ = (rLocal1).iterator(); __var16____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var16__ = (x10.
                      lang.
                      point) __var16____.next();
                    	/* Join: { */final int i =
                      /* template:array_get { */((__var16__).get(0))/* } */;/* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var16__).get(0))/* } */;/* } */
{
                        
//#line 1004
final Complex t =
                          /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j2/* } */))/* } */))/* } */.
                            getConjg();
                        
//#line 1005
final Complex s =
                          /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j1/* } */))/* } */))/* } */.
                            add(
                            t);
                        
//#line 1006
final Complex t3 =
                          ((/* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j1/* } */))/* } */))/* } */.
                              sub(
                              t))).
                            mult(
                            t1);
                        
//#line 1007
/* template:array_set { */(f).set(s.
                                                                          add(
                                                                          t3),/* Join: { */i,j1/* } */)/* } */;
                        
//#line 1008
/* template:array_set { */(f).set(((s.
                                                                            sub(
                                                                            t3))).
                                                                          getConjg(),/* Join: { */i,j2/* } */)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var15____ = (__var116__).iterator(); __var15____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var15__ = (x10.
                  lang.
                  point) __var15____.next();
                	/* Join: { *//* Join: { */final int j1 =
                  /* template:array_get { */((__var15__).get(0))/* } */;/* } */
{
                    
//#line 1000
final int j2 =
                      nxh -
                      j1;
                    
//#line 1001
final Complex t0 =
                      /* template:parametric { */((Complex)(/* template:array_get { */((tableSineCosine).get(kmr *
                      j1))/* } */))/* } */;
                    
//#line 1002
final Complex t1 =
                      new Complex(
                      t0.
                        getImag(),
                      t0.
                        getReal());
                    
//#line 1003
/* template:foreach { */
                    for (java.util.Iterator __var16____ = (rLocal1).iterator(); __var16____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var16__ = (x10.
                      lang.
                      point) __var16____.next();
                    	/* Join: { */final int i =
                      /* template:array_get { */((__var16__).get(0))/* } */;/* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var16__).get(0))/* } */;/* } */
{
                        
//#line 1004
final Complex t =
                          /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j2/* } */))/* } */))/* } */.
                            getConjg();
                        
//#line 1005
final Complex s =
                          /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j1/* } */))/* } */))/* } */.
                            add(
                            t);
                        
//#line 1006
final Complex t3 =
                          ((/* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j1/* } */))/* } */))/* } */.
                              sub(
                              t))).
                            mult(
                            t1);
                        
//#line 1007
/* template:array_set { */(f).set(s.
                                                                          add(
                                                                          t3),/* Join: { */i,j1/* } */)/* } */;
                        
//#line 1008
/* template:array_set { */(f).set(((s.
                                                                            sub(
                                                                            t3))).
                                                                          getConjg(),/* Join: { */i,j2/* } */)/* } */;
                    }/* } */
                    			}
                    		});
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
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp115) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp115);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 1013
public void
                    unscrambleX(
                    final x10.
                      lang.
                      GenericReferenceArray f) {
        
//#line 1014
final int nxh =
          length2 /
          2;
        
//#line 1015
final int nxhh =
          length2 /
          4;
        
//#line 1016
final int kmr =
          X10Util.
            maxInt(
            length1,
            length2) /
          length2;
        
//#line 1017
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1018
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 1019
final x10.
                  lang.
                  dist dF =
                  f.
                    distribution;
                
//#line 1020
final x10.
                  lang.
                  region rLocal1 =
                  X10Util.
                    getLRank2D(
                    dF,
                    0);
                
//#line 1021
/* template:foreach { */
                for (java.util.Iterator __var17____ = (x10.
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
                                                           nxhh -
                                                             1))).iterator(); __var17____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var17__ = (x10.
                  lang.
                  point) __var17____.next();
                	/* Join: { */final int j1 =
                  /* template:array_get { */((__var17__).get(0))/* } */;/* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { */final int j1 =
                  /* template:array_get { */((__var17__).get(0))/* } */;/* } */
{
                    
//#line 1022
final int j2 =
                      nxh -
                      j1;
                    
//#line 1023
final Complex t0 =
                      /* template:parametric { */((Complex)(/* template:array_get { */((tableSineCosine).get(kmr *
                      j1))/* } */))/* } */;
                    
//#line 1024
final Complex t1 =
                      new Complex(
                      t0.
                        getImag(),
                      -t0.
                         getReal());
                    
//#line 1025
/* template:foreach { */
                    for (java.util.Iterator __var18____ = (rLocal1).iterator(); __var18____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var18__ = (x10.
                      lang.
                      point) __var18____.next();
                    	/* Join: { */final int i =
                      /* template:array_get { */((__var18__).get(0))/* } */;/* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var18__).get(0))/* } */;/* } */
{
                        
//#line 1026
final Complex t =
                          /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j2/* } */))/* } */))/* } */.
                            getConjg();
                        
//#line 1027
final Complex s =
                          /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j1/* } */))/* } */))/* } */.
                            add(
                            t);
                        
//#line 1028
final Complex t2 =
                          ((/* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j1/* } */))/* } */))/* } */.
                              sub(
                              t))).
                            mult(
                            t1);
                        
//#line 1029
/* template:array_set { */(f).set(((s.
                                                                            add(
                                                                            t2))).
                                                                          multS(
                                                                          invN),/* Join: { */i,j1/* } */)/* } */;
                        
//#line 1030
/* template:array_set { */(f).set(((((s.
                                                                              sub(
                                                                              t2))).
                                                                            getConjg())).
                                                                          multS(
                                                                          invN),/* Join: { */i,j2/* } */)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                }/* } */
                			}
                		});
                }
                /* } */
                
                
//#line 1033
/* template:foreach { */
                for (java.util.Iterator pt__ = (x10.
                                                  lang.
                                                  region.
                                                  factory.
                                                  region(
                                                  rLocal1,
                                                  x10.
                                                    lang.
                                                    region.
                                                    factory.
                                                    region(
                                                    nxhh,
                                                    nxhh))).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { *//* } */
{
                    
//#line 1034
final x10.
                      lang.
                      point pt0 =
                      /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pt))/* } */.mul(x10.
                                                                                                                 lang.
                                                                                                                 point.
                                                                                                                 factory.
                                                                                                                 point(
                                                                                                                 1,
                                                                                                                 0));
                    
//#line 1035
final Complex t1 =
                      /* template:parametric { */((Complex)(/* template:array_get { */((f).get(pt0))/* } */))/* } */;
                    
//#line 1036
final Complex t2 =
                      /* template:parametric { */((Complex)(/* template:array_get { */((f).get(pt))/* } */))/* } */;
                    
//#line 1037
final double t1Real =
                      t1.
                        getReal();
                    
//#line 1038
final double t1Imag =
                      t1.
                        getImag();
                    
//#line 1039
final Complex t3 =
                      new Complex(
                      t1Real +
                        t1Imag,
                      t1Real -
                        t1Imag);
                    
//#line 1040
/* template:array_set { */(f).set(((t2.
                                                                        getConjg())).
                                                                      multS(
                                                                      2 *
                                                                        invN),pt)/* } */;
                    
//#line 1041
/* template:array_set { */(f).set(t3.
                                                                      multS(
                                                                      2 *
                                                                        invN),pt0)/* } */;
                }/* } */
                			}
                		});
                }
                /* } */
                
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp119) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp119);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 1045
public void
                    scrambleY(
                    final x10.
                      lang.
                      GenericReferenceArray f) {
        
//#line 1046
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1047
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                            lang.
                                                                            place.
                                                                            FIRST_PLACE)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 1048
/* template:foreach { */
                for (java.util.Iterator __var19____ = (x10.
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
                                                           ((length1 /
                                                               2)) -
                                                             1))).iterator(); __var19____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var19__ = (x10.
                  lang.
                  point) __var19____.next();
                	/* Join: { */final int j1 =
                  /* template:array_get { */((__var19__).get(0))/* } */;/* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { */final int j1 =
                  /* template:array_get { */((__var19__).get(0))/* } */;/* } */
{
                    
//#line 1049
final int j2 =
                      length1 -
                      j1;
                    
//#line 1050
final Complex t1 =
                      /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */0,j2/* } */))/* } */))/* } */;
                    
//#line 1051
final Complex t2 =
                      /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */0,j1/* } */))/* } */))/* } */;
                    
//#line 1052
final Complex s =
                      new Complex(
                      t1.
                        getImag(),
                      t1.
                        getReal());
                    
//#line 1053
/* template:array_set { */(f).set(((t2.
                                                                        sub(
                                                                        s))).
                                                                      getConjg(),/* Join: { */0,j2/* } */)/* } */;
                    
//#line 1054
/* template:array_set { */(f).set(t2.
                                                                      add(
                                                                      s),/* Join: { */0,j1/* } */)/* } */;
                }/* } */
                			}
                		});
                }
                /* } */
                
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp120) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp120);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 1058
public void
                    unscrambleY(
                    final x10.
                      lang.
                      GenericReferenceArray f) {
        
//#line 1059
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1060
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                            lang.
                                                                            place.
                                                                            FIRST_PLACE)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 1061
/* template:foreach { */
                for (java.util.Iterator __var20____ = (x10.
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
                                                           ((length1 /
                                                               2)) -
                                                             1))).iterator(); __var20____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var20__ = (x10.
                  lang.
                  point) __var20____.next();
                	/* Join: { */final int j1 =
                  /* template:array_get { */((__var20__).get(0))/* } */;/* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { */final int j1 =
                  /* template:array_get { */((__var20__).get(0))/* } */;/* } */
{
                    
//#line 1062
final int j2 =
                      length1 -
                      j1;
                    
//#line 1063
final Complex s =
                      /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */0,j2/* } */))/* } */))/* } */;
                    
//#line 1064
final Complex t =
                      /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */0,j1/* } */))/* } */))/* } */;
                    
//#line 1065
final Complex t1 =
                      t.
                        add(
                        s);
                    
//#line 1066
final Complex t2 =
                      t.
                        sub(
                        s);
                    
//#line 1067
/* template:array_set { */(f).set(((new Complex(
                                                                        t1.
                                                                          getImag(),
                                                                        t2.
                                                                          getReal()))).
                                                                      multS(
                                                                      0.5),/* Join: { */0,j2/* } */)/* } */;
                    
//#line 1068
/* template:array_set { */(f).set(((new Complex(
                                                                        t1.
                                                                          getReal(),
                                                                        t2.
                                                                          getImag()))).
                                                                      multS(
                                                                      0.5),/* Join: { */0,j1/* } */)/* } */;
                }/* } */
                			}
                		});
                }
                /* } */
                
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp121) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp121);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 1072
public void
                    transformRank(
                    final x10.
                      lang.
                      GenericReferenceArray f,
                    final int rnk,
                    final boolean inverse) {
        
//#line 1073
final int nxy =
          X10Util.
            maxInt(
            length1,
            length2);
        
//#line 1074
final int nxh =
          length2 /
          2;
        
//#line 1075
final int nyh =
          length1 /
          2;
        
//#line 1076
final int nxhh =
          length2 /
          4;
        
//#line 1077
final int bits =
          ((rnk ==
              0))
          ? nBits1
          : nBits2 -
          1;
        
//#line 1078
final int r =
          nxy /
          ((((rnk ==
                0))
              ? length1
              : nxh));
        
//#line 1079
/* template:forloop { */
        for (java.util.Iterator exponent__ = (x10.
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
                                                  bits -
                                                    1))).iterator(); exponent__.hasNext(); ) {
        	final  x10.
          lang.
          point exponent = (x10.
          lang.
          point) exponent__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 1080
final int stride =
              1 <<
              /* template:array_get { */((exponent).get(0))/* } */;
            
//#line 1081
final int width =
              2 *
              stride;
            
//#line 1082
final int km =
              ((((rnk ==
                    0))
                  ? nyh
                  : nxhh)) /
              stride;
            
//#line 1083
final int kmr =
              km *
              r;
            
//#line 1084
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1085
/* template:ateach { */
                {
                	x10.lang.dist pl__distCopy = x10.
                                                lang.
                                                dist.
                                                UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator pl__ = pl__distCopy.iterator();
                		 pl__.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point pl = (x10.
                  lang.
                  point) pl__.next();
                		/* Join: { *//* } */
                		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { *//* } */
{
                    
//#line 1086
/* template:forloop-mult { */{
                    x10.lang.region __var123__ = (x10.lang.region) x10.
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
                                                                       km -
                                                                         1));
                    if (__var123__.size() > 0 && (__var123__ instanceof x10.array.MultiDimRegion || __var123__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var124__ = __var123__.rank(0).low(), __var125__ = __var123__.rank(0).high(); __var124__ <= __var125__; __var124__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var124__;
                    /* } */
                    /* } */
{
                        
//#line 1087
final int lb =
                          width *
                          k;
                        
//#line 1088
final int mb =
                          lb +
                          stride;
                        
//#line 1089
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 1090
/* template:foreach { */
                            for (java.util.Iterator __var22____ = (x10.
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
                                                                       stride -
                                                                         1))).iterator(); __var22____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var22__ = (x10.
                              lang.
                              point) __var22____.next();
                            	/* Join: { */final int j =
                              /* template:array_get { */((__var22__).get(0))/* } */;/* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { */final int j =
                              /* template:array_get { */((__var22__).get(0))/* } */;/* } */
{
                                
//#line 1091
final int j1 =
                                  j +
                                  lb;
                                
//#line 1092
final int j2 =
                                  j +
                                  mb;
                                
//#line 1093
final Complex s =
                                  (((inverse))
                                     ? /* template:parametric { */((Complex)(/* template:array_get { */((tableSineCosine).get(kmr *
                                     j))/* } */))/* } */
                                     : /* template:parametric { */((Complex)(/* template:array_get { */((tableSineCosine).get(kmr *
                                         j))/* } */))/* } */.
                                         getConjg());
                                
//#line 1094
final x10.
                                  lang.
                                  dist dF =
                                  f.
                                    distribution;
                                
//#line 1095
final x10.
                                  lang.
                                  region rLocal1 =
                                  X10Util.
                                    getLRank2D(
                                    dF,
                                    0);
                                
//#line 1096
/* template:foreach { */
                                for (java.util.Iterator __var23____ = (rLocal1).iterator(); __var23____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var23__ = (x10.
                                  lang.
                                  point) __var23____.next();
                                	/* Join: { */final int i =
                                  /* template:array_get { */((__var23__).get(0))/* } */;/* } */
                                	x10.lang.Runtime.here().runAsync
                                		(new x10.runtime.Activity() {
                                			public void runX10Task() {
                                				/* Join: { *//* Join: { */final int i =
                                  /* template:array_get { */((__var23__).get(0))/* } */;/* } */
{
                                    
//#line 1097
final Complex tmp1 =
                                      /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j1/* } */))/* } */))/* } */;
                                    
//#line 1098
final Complex tmp2 =
                                      s.
                                        mult(
                                        /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j2/* } */))/* } */))/* } */);
                                    
//#line 1099
/* template:array_set { */(f).set(tmp1.
                                                                                      sub(
                                                                                      tmp2),/* Join: { */i,j2/* } */)/* } */;
                                    
//#line 1100
/* template:array_set { */(f).set(tmp1.
                                                                                      add(
                                                                                      tmp2),/* Join: { */i,j1/* } */)/* } */;
                                }/* } */
                                			}
                                		});
                                }
                                /* } */
                                
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                        }
                        	} catch (Throwable tmp126) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp126);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var21____ = (__var123__).iterator(); __var21____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var21__ = (x10.
                      lang.
                      point) __var21____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var21__).get(0))/* } */;/* } */
{
                        
//#line 1087
final int lb =
                          width *
                          k;
                        
//#line 1088
final int mb =
                          lb +
                          stride;
                        
//#line 1089
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 1090
/* template:foreach { */
                            for (java.util.Iterator __var22____ = (x10.
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
                                                                       stride -
                                                                         1))).iterator(); __var22____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var22__ = (x10.
                              lang.
                              point) __var22____.next();
                            	/* Join: { */final int j =
                              /* template:array_get { */((__var22__).get(0))/* } */;/* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { */final int j =
                              /* template:array_get { */((__var22__).get(0))/* } */;/* } */
{
                                
//#line 1091
final int j1 =
                                  j +
                                  lb;
                                
//#line 1092
final int j2 =
                                  j +
                                  mb;
                                
//#line 1093
final Complex s =
                                  (((inverse))
                                     ? /* template:parametric { */((Complex)(/* template:array_get { */((tableSineCosine).get(kmr *
                                     j))/* } */))/* } */
                                     : /* template:parametric { */((Complex)(/* template:array_get { */((tableSineCosine).get(kmr *
                                         j))/* } */))/* } */.
                                         getConjg());
                                
//#line 1094
final x10.
                                  lang.
                                  dist dF =
                                  f.
                                    distribution;
                                
//#line 1095
final x10.
                                  lang.
                                  region rLocal1 =
                                  X10Util.
                                    getLRank2D(
                                    dF,
                                    0);
                                
//#line 1096
/* template:foreach { */
                                for (java.util.Iterator __var23____ = (rLocal1).iterator(); __var23____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var23__ = (x10.
                                  lang.
                                  point) __var23____.next();
                                	/* Join: { */final int i =
                                  /* template:array_get { */((__var23__).get(0))/* } */;/* } */
                                	x10.lang.Runtime.here().runAsync
                                		(new x10.runtime.Activity() {
                                			public void runX10Task() {
                                				/* Join: { *//* Join: { */final int i =
                                  /* template:array_get { */((__var23__).get(0))/* } */;/* } */
{
                                    
//#line 1097
final Complex tmp1 =
                                      /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j1/* } */))/* } */))/* } */;
                                    
//#line 1098
final Complex tmp2 =
                                      s.
                                        mult(
                                        /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j2/* } */))/* } */))/* } */);
                                    
//#line 1099
/* template:array_set { */(f).set(tmp1.
                                                                                      sub(
                                                                                      tmp2),/* Join: { */i,j2/* } */)/* } */;
                                    
//#line 1100
/* template:array_set { */(f).set(tmp1.
                                                                                      add(
                                                                                      tmp2),/* Join: { */i,j1/* } */)/* } */;
                                }/* } */
                                			}
                                		});
                                }
                                /* } */
                                
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                        }
                        	} catch (Throwable tmp127) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp127);
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
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp122) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp122);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
    }
    
    
//#line 1107
public java.
                    lang.
                    String
                    toString(
                    ) {
        
//#line 1108
return "FourierTransform: xbits = " +
        nBits1 +
        " ybits = " +
        nBits2;
    }
}

class LinearESOpenPIC2D
extends x10.
  lang.
  Object
{
    
//#line 1113
final private static int
      NUMBER_OF_XBITS =
      2;
    
//#line 1114
final private static int
      NUMBER_OF_YBITS =
      3;
    
//#line 1115
final private static int
      XLENGTH =
      1 <<
      NUMBER_OF_XBITS;
    
//#line 1116
final private static int
      YLENGTH =
      1 <<
      NUMBER_OF_YBITS;
    
//#line 1117
final private static int
      PARTICLE_XDENSITY =
      4;
    
//#line 1118
final private static int
      PARTICLE_YDENSITY =
      8;
    
//#line 1119
final private static int
      NPARTICLES =
      PARTICLE_XDENSITY *
      PARTICLE_YDENSITY;
    
//#line 1120
final private static double
      DELTA_TIME =
      0.2;
    
//#line 1121
final private static double
      ELECTRON_CHARGE =
      -1.0;
    
//#line 1122
final private static double
      THERMAL_XVELOCITY =
      1.0;
    
//#line 1123
final private static double
      THERMAL_YVELOCITY =
      1.0;
    
//#line 1124
final private static int
      BOUNDARY_CONDITION =
      2;
    
//#line 1125
final private static int
      TIME_STEPS =
      325;
    
//#line 1126
final private static int
      SORT_TIME =
      50;
    
//#line 1127
final private static double
      IMBALANCE =
      0.08;
    
//#line 1128
final private static int
      MOVE_FIELD_TO_DIST_MAX_ROWS =
      4 *
      YLENGTH /
      x10.
        lang.
        place.
        MAX_PLACES;
    
//#line 1129
final private static int
      MOVE_PARTICLES_MAX =
      4 *
      NPARTICLES /
      x10.
        lang.
        place.
        MAX_PLACES;
    
//#line 1130
final private static int
      MOVE_PARTICLES_MAX_BUFFER =
      4 *
      NPARTICLES /
      x10.
        lang.
        place.
        MAX_PLACES;
    
//#line 1131
final private Random
      r;
    
//#line 1132
final private PoissonSolver
      solver;
    
//#line 1133
private x10.
      lang.
      GenericReferenceArray
      particles;
    
//#line 1134
private x10.
      lang.
      DoubleReferenceArray
      backgroundCharge;
    
//#line 1135
private long
      totalTime;
    
//#line 1136
private long
      initTime;
    
//#line 1137
private long
      depositTime;
    
//#line 1138
private long
      redistTime;
    
//#line 1139
private long
      solverTime;
    
//#line 1140
private long
      pushTime;
    
//#line 1141
private long
      moveTime;
    
    
//#line 1142
public LinearESOpenPIC2D() {
        
//#line 1142
super();
        
//#line 1143
r =
          new Random(
            );
        
//#line 1144
double affp =
          ((((XLENGTH -
                2.0)) *
              ((YLENGTH -
                  2.0)))) /
          NPARTICLES;
        
//#line 1145
solver =
          new PoissonSolver(
            NUMBER_OF_XBITS,
            NUMBER_OF_YBITS,
            affp);
        
//#line 1146
totalTime =
          0;
        
//#line 1147
initTime =
          0;
        
//#line 1148
depositTime =
          0;
        
//#line 1149
redistTime =
          0;
        
//#line 1150
pushTime =
          0;
        
//#line 1151
moveTime =
          0;
    }
    
    
//#line 1153
public void
                    run(
                    ) {
        
//#line 1154
totalTime =
          java.
            lang.
            System.
            currentTimeMillis();
        
//#line 1155
initTime =
          java.
            lang.
            System.
            currentTimeMillis();
        
//#line 1156
initialize();
        
//#line 1157
initTime =
          java.
            lang.
            System.
            currentTimeMillis() -
            initTime;
        
//#line 1158
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
                                           TIME_STEPS -
                                             1))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 1159
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                          lang.
                                                                                                          System.
                                                                                                          out))/* } */.println("T = " +
                                                                                                                               /* template:array_get { */((i).get(0))/* } */);
            
//#line 1160
final x10.
              lang.
              DoubleReferenceArray e =
              stepTime(
                backgroundCharge);
            
//#line 1161
if (/* template:array_get { */((i).get(0))/* } */ %
                                SORT_TIME ==
                                0) {
                
//#line 1162
long time =
                  java.
                    lang.
                    System.
                    currentTimeMillis();
                
//#line 1163
sortParticles(
                                particles,
                                backgroundCharge.
                                  distribution);
                
//#line 1164
moveTime =
                  moveTime +
                    ((java.
                        lang.
                        System.
                        currentTimeMillis() -
                        time));
            }
            
//#line 1166
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                          lang.
                                                                                                          System.
                                                                                                          out))/* } */.println("field, kinetic, total energies = " +
                                                                                                                               /* template:array_get { */((e).get(0))/* } */ +
                                                                                                                               "," +
                                                                                                                               /* template:array_get { */((e).get(1))/* } */ +
                                                                                                                               "," +
                                                                                                                               /* template:array_get { */((e).get(2))/* } */);
            
//#line 1167
if (/* template:array_get { */((i).get(0))/* } */ ==
                                TIME_STEPS -
                                1) {
                
//#line 1168
final x10.
                  lang.
                  dist dRef =
                  x10.
                    lang.
                    dist.
                    factory.
                    constant(
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
                        2)),
                    /* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 1169
final x10.
                  lang.
                  DoubleReferenceArray ref =
                  /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dRef,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
                
//#line 1170
if (NUMBER_OF_XBITS ==
                                    2 &&
                                    NUMBER_OF_YBITS ==
                                    3 &&
                                    PARTICLE_XDENSITY ==
                                    4 &&
                                    PARTICLE_YDENSITY ==
                                    8) {
                    
//#line 1171
/* template:array_set { */(ref).set(0.009936711552799253,0)/* } */;
                    
//#line 1172
/* template:array_set { */(ref).set(35.7904959849017,1)/* } */;
                    
//#line 1173
/* template:array_set { */(ref).set(35.8004326964545,2)/* } */;
                    
//#line 1174
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                  lang.
                                                                                                                  System.
                                                                                                                  out))/* } */.println("final field energy diff = " +
                                                                                                                                       ((java.
                                                                                                                                           lang.
                                                                                                                                           Math.
                                                                                                                                           abs(
                                                                                                                                           /* template:array_get { */((ref).get(0))/* } */ -
                                                                                                                                             /* template:array_get { */((e).get(0))/* } */))));
                    
//#line 1175
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                  lang.
                                                                                                                  System.
                                                                                                                  out))/* } */.println("final kinetic energy diff = " +
                                                                                                                                       ((java.
                                                                                                                                           lang.
                                                                                                                                           Math.
                                                                                                                                           abs(
                                                                                                                                           /* template:array_get { */((ref).get(1))/* } */ -
                                                                                                                                             /* template:array_get { */((e).get(1))/* } */))));
                    
//#line 1176
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                  lang.
                                                                                                                  System.
                                                                                                                  out))/* } */.println("final final energy diff = " +
                                                                                                                                       ((java.
                                                                                                                                           lang.
                                                                                                                                           Math.
                                                                                                                                           abs(
                                                                                                                                           /* template:array_get { */((ref).get(2))/* } */ -
                                                                                                                                             /* template:array_get { */((e).get(2))/* } */))));
                } else {
                    
//#line 1179
if (NUMBER_OF_XBITS ==
                                        3 &&
                                        NUMBER_OF_YBITS ==
                                        4 &&
                                        PARTICLE_XDENSITY ==
                                        8 &&
                                        PARTICLE_YDENSITY ==
                                        16) {
                        
//#line 1180
/* template:array_set { */(ref).set(1.12911030199718,0)/* } */;
                        
//#line 1181
/* template:array_set { */(ref).set(138.01404855563126,1)/* } */;
                        
//#line 1182
/* template:array_set { */(ref).set(139.14315885762844,2)/* } */;
                        
//#line 1183
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                      lang.
                                                                                                                      System.
                                                                                                                      out))/* } */.println("final field energy diff = " +
                                                                                                                                           ((java.
                                                                                                                                               lang.
                                                                                                                                               Math.
                                                                                                                                               abs(
                                                                                                                                               /* template:array_get { */((ref).get(0))/* } */ -
                                                                                                                                                 /* template:array_get { */((e).get(0))/* } */))));
                        
//#line 1184
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                      lang.
                                                                                                                      System.
                                                                                                                      out))/* } */.println("final kinetic energy diff = " +
                                                                                                                                           ((java.
                                                                                                                                               lang.
                                                                                                                                               Math.
                                                                                                                                               abs(
                                                                                                                                               /* template:array_get { */((ref).get(1))/* } */ -
                                                                                                                                                 /* template:array_get { */((e).get(1))/* } */))));
                        
//#line 1185
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                      lang.
                                                                                                                      System.
                                                                                                                      out))/* } */.println("final final energy diff = " +
                                                                                                                                           ((java.
                                                                                                                                               lang.
                                                                                                                                               Math.
                                                                                                                                               abs(
                                                                                                                                               /* template:array_get { */((ref).get(2))/* } */ -
                                                                                                                                                 /* template:array_get { */((e).get(2))/* } */))));
                    } else {
                        
//#line 1188
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                      lang.
                                                                                                                      System.
                                                                                                                      out))/* } */.println("No reference values availabile");
                    }
                }
            }
        }/* } */
        }
        /* } */
        
        
//#line 1192
totalTime =
          java.
            lang.
            System.
            currentTimeMillis() -
            totalTime;
        
//#line 1193
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                      lang.
                                                                                                      System.
                                                                                                      out))/* } */.println("Total time (ms): " +
                                                                                                                           totalTime);
        
//#line 1194
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                      lang.
                                                                                                      System.
                                                                                                      out))/* } */.println("Initialization time (ms): " +
                                                                                                                           initTime +
                                                                                                                           " " +
                                                                                                                           ((100.0 *
                                                                                                                               initTime)) /
                                                                                                                             totalTime);
        
//#line 1195
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                      lang.
                                                                                                      System.
                                                                                                      out))/* } */.println("Particle Deposit time (ms): " +
                                                                                                                           depositTime +
                                                                                                                           " " +
                                                                                                                           ((100.0 *
                                                                                                                               depositTime)) /
                                                                                                                             totalTime);
        
//#line 1196
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                      lang.
                                                                                                      System.
                                                                                                      out))/* } */.println("Field Redistribution time (ms): " +
                                                                                                                           redistTime +
                                                                                                                           " " +
                                                                                                                           ((100.0 *
                                                                                                                               redistTime)) /
                                                                                                                             totalTime);
        
//#line 1197
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                      lang.
                                                                                                      System.
                                                                                                      out))/* } */.println("Solver time (ms): " +
                                                                                                                           solverTime +
                                                                                                                           " " +
                                                                                                                           ((100.0 *
                                                                                                                               solverTime)) /
                                                                                                                             totalTime);
        
//#line 1198
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                      lang.
                                                                                                      System.
                                                                                                      out))/* } */.println("Particle Push time (ms): " +
                                                                                                                           pushTime +
                                                                                                                           " " +
                                                                                                                           ((100.0 *
                                                                                                                               pushTime)) /
                                                                                                                             totalTime);
        
//#line 1199
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                      lang.
                                                                                                      System.
                                                                                                      out))/* } */.println("Particle move time (ms): " +
                                                                                                                           moveTime +
                                                                                                                           " " +
                                                                                                                           ((100.0 *
                                                                                                                               moveTime)) /
                                                                                                                             totalTime);
    }
    
    
//#line 1201
public void
                    initialize(
                    ) {
        
//#line 1202
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                      lang.
                                                                                                      System.
                                                                                                      out))/* } */.println("Init: particle position");
        
//#line 1203
final x10.
          lang.
          DoubleReferenceArray position =
          genParticlePosition(
            NPARTICLES);
        
//#line 1204
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                      lang.
                                                                                                      System.
                                                                                                      out))/* } */.println("Init: particle velocity");
        
//#line 1205
final x10.
          lang.
          DoubleReferenceArray velocity =
          genParticleVelocity(
            NPARTICLES);
        
//#line 1206
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                      lang.
                                                                                                      System.
                                                                                                      out))/* } */.println("Init: particles");
        
//#line 1207
particles =
          genParticles(
            NPARTICLES,
            position,
            velocity);
        
//#line 1208
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                      lang.
                                                                                                      System.
                                                                                                      out))/* } */.println("Init: initial field distribution");
        
//#line 1209
final x10.
          lang.
          dist dField =
          genInitialDist(
            particles);
        
//#line 1210
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                      lang.
                                                                                                      System.
                                                                                                      out))/* } */.println("Init: initial partical distribution");
        
//#line 1211
final x10.
          lang.
          IntReferenceArray info =
          makeInfoArray();
        
//#line 1212
particles =
          moveParticles(
            particles,
            dField,
            info);
        
//#line 1213
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                      lang.
                                                                                                      System.
                                                                                                      out))/* } */.println("Init: background charge");
        
//#line 1214
backgroundCharge =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dField,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 1215
final x10.
          lang.
          DoubleReferenceArray backgroundGuards =
          makeGuards(
            dField);
        
//#line 1216
depositCharge(
                        particles,
                        backgroundCharge,
                        backgroundGuards,
                        java.
                          lang.
                          Math.
                          abs(
                          ELECTRON_CHARGE));
        
//#line 1217
addGuards(
                        backgroundCharge,
                        backgroundGuards);
    }
    
    
//#line 1219
public x10.
                    lang.
                    DoubleReferenceArray
                    genParticlePosition(
                    final int np) {
        
//#line 1220
final int X =
          0;
        
//#line 1221
final int Y =
          1;
        
//#line 1222
final int MAX_PLACES =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 1223
final int MAX_ITER =
          20;
        
//#line 1224
final double ERROR =
          1.0E-4;
        
//#line 1225
final double BIG =
          0.5;
        
//#line 1226
final x10.
          lang.
          dist dResult =
          X10Util.
            distBlockStar2(
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
                np -
                  1)),
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
                1)));
        
//#line 1227
final x10.
          lang.
          DoubleReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dResult,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 1228
final int particlesPerPlace =
          ((PARTICLE_XDENSITY *
              PARTICLE_YDENSITY)) /
          MAX_PLACES;
        
//#line 1229
final int totalParticles =
          particlesPerPlace *
          MAX_PLACES;
        
//#line 1230
if (totalParticles !=
                            NPARTICLES) {
            
//#line 1231
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                          lang.
                                                                                                          System.
                                                                                                          err))/* } */.println("Particle distribution truncated, " +
                                                                                                                               "total particles = " +
                                                                                                                               totalParticles);
            
//#line 1232
return result;
        }
        
//#line 1234
final double edgelx =
          ((BOUNDARY_CONDITION ==
              2 ||
              BOUNDARY_CONDITION ==
              3))
          ? 1.0
          : 0.0;
        
//#line 1235
final double edgely =
          ((BOUNDARY_CONDITION ==
              2))
          ? 1.0
          : 0.0;
        
//#line 1236
double tx0 =
          linearDensityFnIntegral(
            edgelx,
            0.0,
            0.0,
            0.0);
        
//#line 1237
double ty0 =
          linearDensityFnIntegral(
            edgely,
            0.0,
            0.0,
            0.0);
        
//#line 1238
final double anx =
          XLENGTH -
          edgelx;
        
//#line 1239
final double any =
          YLENGTH -
          edgely;
        
//#line 1240
final double bnx =
          PARTICLE_XDENSITY /
          ((linearDensityFnIntegral(
              anx,
              0.0,
              0.0,
              0.0) -
              tx0));
        
//#line 1241
final double bny =
          PARTICLE_YDENSITY /
          ((linearDensityFnIntegral(
              any,
              0.0,
              0.0,
              0.0) -
              ty0));
        
//#line 1242
final double x0 =
          bnx *
          tx0 -
          0.5;
        
//#line 1243
final double y0 =
          bny *
          ty0 -
          0.5;
        
//#line 1244
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1245
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 1246
final x10.
                  lang.
                  region rLocal =
                  X10Util.
                    getLRank2D(
                    dResult,
                    0);
                
//#line 1247
final int offset =
                  rLocal.
                    low();
                
//#line 1248
final int koff =
                  particlesPerPlace *
                  /* template:array_get { */((pl).get(0))/* } */;
                
//#line 1249
final int noff =
                  offset;
                
//#line 1250
int kc =
                  koff /
                  PARTICLE_XDENSITY;
                
//#line 1251
double yt0 =
                  edgely;
                
//#line 1252
double yt =
                  yt0 +
                  0.5 /
                  ((bny *
                      linearDensityFn(
                        yt0,
                        0.0,
                        0.0,
                        0.0)));
                
//#line 1253
/* template:forloop { */
                for (java.util.Iterator k__ = (x10.
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
                                                   kc -
                                                     1))).iterator(); k__.hasNext(); ) {
                	final  x10.
                  lang.
                  point k = (x10.
                  lang.
                  point) k__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 1254
double yn =
                      /* template:array_get { */((k).get(0))/* } */ +
                      y0 +
                      1;
                    
//#line 1255
if (/* template:array_get { */((k).get(0))/* } */ >
                                        0) {
                        
//#line 1256
yt =
                          yt +
                            ((1.0 /
                                ((bny *
                                    linearDensityFn(
                                      yt,
                                      0.0,
                                      0.0,
                                      0.0)))));
                    }
                    
//#line 1258
yt =
                      X10Util.
                        maxDouble(
                        edgely,
                        X10Util.
                          minDouble(
                          yt,
                          any));
                    
//#line 1259
double f =
                      bny *
                      linearDensityFnIntegral(
                        yt,
                        0.0,
                        0.0,
                        0.0) -
                      yn;
                    
//#line 1260
double absf =
                      java.
                        lang.
                        Math.
                        abs(
                        f);
                    
//#line 1261
int i =
                      0;
                    
//#line 1262
while (absf >=
                                           ERROR) {
                        
//#line 1263
if (absf <
                                            BIG) {
                            
//#line 1264
double fp =
                              bny *
                              linearDensityFn(
                                yt,
                                0.0,
                                0.0,
                                0.0);
                            
//#line 1265
yt0 =
                              yt;
                            
//#line 1266
yt =
                              X10Util.
                                maxDouble(
                                edgely,
                                X10Util.
                                  minDouble(
                                  yt -
                                    f /
                                    fp,
                                  any));
                        } else {
                            
//#line 1269
if (f >
                                                0.0) {
                                
//#line 1270
yt =
                                  yt0 +
                                    ((0.5 *
                                        ((yt -
                                            yt0))));
                            } else {
                                
//#line 1273
yt =
                                  yt +
                                    yt -
                                    yt0;
                            }
                        }
                        
//#line 1275
if (i >=
                                            MAX_ITER) {
                            
//#line 1276
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                          lang.
                                                                                                                          System.
                                                                                                                          err))/* } */.println("1: Newton iteration max exceeded");
                            
//#line 1277
break;
                        } else {
                            
//#line 1280
f =
                              bny *
                                linearDensityFnIntegral(
                                  yt,
                                  0.0,
                                  0.0,
                                  0.0) -
                                yn;
                            
//#line 1281
absf =
                              java.
                                lang.
                                Math.
                                abs(
                                f);
                        }
                        
//#line 1283
i++;
                    }
                    
//#line 1285
yt0 =
                      yt;
                }/* } */
                }
                /* } */
                
                
//#line 1287
int jc =
                  koff -
                  PARTICLE_XDENSITY *
                  kc;
                
//#line 1288
double xt0 =
                  edgelx;
                
//#line 1289
double xt =
                  xt0 +
                  0.5 /
                  ((bnx *
                      linearDensityFn(
                        xt0,
                        0.0,
                        0.0,
                        0.0)));
                
//#line 1290
/* template:forloop { */
                for (java.util.Iterator j__ = (x10.
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
                                                   jc -
                                                     1))).iterator(); j__.hasNext(); ) {
                	final  x10.
                  lang.
                  point j = (x10.
                  lang.
                  point) j__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 1291
double xn =
                      /* template:array_get { */((j).get(0))/* } */ +
                      x0 +
                      1;
                    
//#line 1292
if (/* template:array_get { */((j).get(0))/* } */ >
                                        0) {
                        
//#line 1293
xt =
                          xt +
                            ((1.0 /
                                ((bnx *
                                    linearDensityFn(
                                      xt,
                                      0.0,
                                      0.0,
                                      0.0)))));
                    }
                    
//#line 1295
xt =
                      X10Util.
                        maxDouble(
                        edgelx,
                        X10Util.
                          minDouble(
                          xt,
                          anx));
                    
//#line 1296
double f =
                      bnx *
                      linearDensityFnIntegral(
                        xt,
                        0.0,
                        0.0,
                        0.0) -
                      xn;
                    
//#line 1297
double absf =
                      java.
                        lang.
                        Math.
                        abs(
                        f);
                    
//#line 1298
int i =
                      0;
                    
//#line 1299
while (absf >=
                                           ERROR) {
                        
//#line 1300
if (absf <
                                            BIG) {
                            
//#line 1301
double fp =
                              bnx *
                              linearDensityFn(
                                xt,
                                0.0,
                                0.0,
                                0.0);
                            
//#line 1302
xt0 =
                              xt;
                            
//#line 1303
xt =
                              X10Util.
                                maxDouble(
                                edgelx,
                                X10Util.
                                  minDouble(
                                  xt -
                                    f /
                                    fp,
                                  anx));
                        } else {
                            
//#line 1306
if (f >
                                                0.0) {
                                
//#line 1307
xt =
                                  xt0 +
                                    0.5 *
                                    ((xt -
                                        xt0));
                            } else {
                                
//#line 1310
xt =
                                  xt +
                                    xt -
                                    xt0;
                            }
                        }
                        
//#line 1312
if (i >=
                                            MAX_ITER) {
                            
//#line 1313
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                          lang.
                                                                                                                          System.
                                                                                                                          err))/* } */.println("2: Newton iteration max exceeded");
                            
//#line 1314
break;
                        } else {
                            
//#line 1317
f =
                              bnx *
                                linearDensityFnIntegral(
                                  xt,
                                  0.0,
                                  0.0,
                                  0.0) -
                                xn;
                            
//#line 1318
absf =
                              java.
                                lang.
                                Math.
                                abs(
                                f);
                        }
                        
//#line 1320
i++;
                    }
                    
//#line 1322
xt0 =
                      xt;
                }/* } */
                }
                /* } */
                
                
//#line 1324
kc++;
                
//#line 1325
/* template:forloop-mult { */{
                x10.lang.region __var129__ = (x10.lang.region) x10.
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
                                                                   X10Util.
                                                                     minInt(
                                                                     particlesPerPlace,
                                                                     PARTICLE_XDENSITY) -
                                                                     1));
                if (__var129__.size() > 0 && (__var129__ instanceof x10.array.MultiDimRegion || __var129__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var130__ = __var129__.rank(0).low(), __var131__ = __var129__.rank(0).high(); __var130__ <= __var131__; __var130__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int n = __var130__;
                /* } */
                /* } */
{
                    
//#line 1326
int nn =
                      n +
                      koff;
                    
//#line 1327
int k =
                      nn /
                      PARTICLE_XDENSITY;
                    
//#line 1328
int j =
                      nn %
                      PARTICLE_XDENSITY;
                    
//#line 1329
double xn =
                      j +
                      x0 +
                      1;
                    
//#line 1330
if (j ==
                                        0) {
                        
//#line 1331
xt0 =
                          edgelx;
                        
//#line 1332
xt =
                          xt0 +
                            0.5 /
                            ((bnx *
                                linearDensityFn(
                                  xt0,
                                  0.0,
                                  0.0,
                                  0.0)));
                    } else {
                        
//#line 1335
xt =
                          xt +
                            ((1.0 /
                                ((bnx *
                                    linearDensityFn(
                                      xt,
                                      0.0,
                                      0.0,
                                      0.0)))));
                    }
                    
//#line 1337
xt =
                      X10Util.
                        maxDouble(
                        edgelx,
                        X10Util.
                          minDouble(
                          xt,
                          anx));
                    
//#line 1338
double f =
                      bnx *
                      linearDensityFnIntegral(
                        xt0,
                        0.0,
                        0.0,
                        0.0) -
                      xn;
                    
//#line 1339
double absf =
                      java.
                        lang.
                        Math.
                        abs(
                        f);
                    
//#line 1340
int i =
                      0;
                    
//#line 1341
while (absf >=
                                           ERROR) {
                        
//#line 1342
if (absf <
                                            BIG) {
                            
//#line 1343
double fp =
                              bnx *
                              linearDensityFn(
                                xt,
                                0.0,
                                0.0,
                                0.0);
                            
//#line 1344
xt0 =
                              xt;
                            
//#line 1345
xt =
                              X10Util.
                                maxDouble(
                                edgelx,
                                X10Util.
                                  minDouble(
                                  xt -
                                    f /
                                    fp,
                                  anx));
                        } else {
                            
//#line 1348
if (f >
                                                0.0) {
                                
//#line 1349
xt =
                                  xt0 +
                                    0.5 *
                                    ((xt -
                                        xt0));
                            } else {
                                
//#line 1352
xt =
                                  xt +
                                    xt -
                                    xt0;
                            }
                        }
                        
//#line 1354
if (i >=
                                            MAX_ITER) {
                            
//#line 1355
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                          lang.
                                                                                                                          System.
                                                                                                                          err))/* } */.println("3: Newton iteration max exceeded");
                            
//#line 1356
break;
                        } else {
                            
//#line 1359
f =
                              bnx *
                                linearDensityFnIntegral(
                                  xt,
                                  0.0,
                                  0.0,
                                  0.0) -
                                xn;
                            
//#line 1360
absf =
                              java.
                                lang.
                                Math.
                                abs(
                                f);
                        }
                        
//#line 1362
i++;
                    }
                    
//#line 1364
/* template:array_set { */(result).set(xt,/* Join: { */n +
                      noff,X/* } */)/* } */;
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var24____ = (__var129__).iterator(); __var24____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var24__ = (x10.
                  lang.
                  point) __var24____.next();
                	/* Join: { *//* Join: { */final int n =
                  /* template:array_get { */((__var24__).get(0))/* } */;/* } */
{
                    
//#line 1326
int nn =
                      n +
                      koff;
                    
//#line 1327
int k =
                      nn /
                      PARTICLE_XDENSITY;
                    
//#line 1328
int j =
                      nn %
                      PARTICLE_XDENSITY;
                    
//#line 1329
double xn =
                      j +
                      x0 +
                      1;
                    
//#line 1330
if (j ==
                                        0) {
                        
//#line 1331
xt0 =
                          edgelx;
                        
//#line 1332
xt =
                          xt0 +
                            0.5 /
                            ((bnx *
                                linearDensityFn(
                                  xt0,
                                  0.0,
                                  0.0,
                                  0.0)));
                    } else {
                        
//#line 1335
xt =
                          xt +
                            ((1.0 /
                                ((bnx *
                                    linearDensityFn(
                                      xt,
                                      0.0,
                                      0.0,
                                      0.0)))));
                    }
                    
//#line 1337
xt =
                      X10Util.
                        maxDouble(
                        edgelx,
                        X10Util.
                          minDouble(
                          xt,
                          anx));
                    
//#line 1338
double f =
                      bnx *
                      linearDensityFnIntegral(
                        xt0,
                        0.0,
                        0.0,
                        0.0) -
                      xn;
                    
//#line 1339
double absf =
                      java.
                        lang.
                        Math.
                        abs(
                        f);
                    
//#line 1340
int i =
                      0;
                    
//#line 1341
while (absf >=
                                           ERROR) {
                        
//#line 1342
if (absf <
                                            BIG) {
                            
//#line 1343
double fp =
                              bnx *
                              linearDensityFn(
                                xt,
                                0.0,
                                0.0,
                                0.0);
                            
//#line 1344
xt0 =
                              xt;
                            
//#line 1345
xt =
                              X10Util.
                                maxDouble(
                                edgelx,
                                X10Util.
                                  minDouble(
                                  xt -
                                    f /
                                    fp,
                                  anx));
                        } else {
                            
//#line 1348
if (f >
                                                0.0) {
                                
//#line 1349
xt =
                                  xt0 +
                                    0.5 *
                                    ((xt -
                                        xt0));
                            } else {
                                
//#line 1352
xt =
                                  xt +
                                    xt -
                                    xt0;
                            }
                        }
                        
//#line 1354
if (i >=
                                            MAX_ITER) {
                            
//#line 1355
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                          lang.
                                                                                                                          System.
                                                                                                                          err))/* } */.println("3: Newton iteration max exceeded");
                            
//#line 1356
break;
                        } else {
                            
//#line 1359
f =
                              bnx *
                                linearDensityFnIntegral(
                                  xt,
                                  0.0,
                                  0.0,
                                  0.0) -
                                xn;
                            
//#line 1360
absf =
                              java.
                                lang.
                                Math.
                                abs(
                                f);
                        }
                        
//#line 1362
i++;
                    }
                    
//#line 1364
/* template:array_set { */(result).set(xt,/* Join: { */n +
                      noff,X/* } */)/* } */;
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
                
//#line 1366
/* template:forloop-mult { */{
                x10.lang.region __var132__ = (x10.lang.region) x10.
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
                                                                   particlesPerPlace -
                                                                     1));
                if (__var132__.size() > 0 && (__var132__ instanceof x10.array.MultiDimRegion || __var132__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var133__ = __var132__.rank(0).low(), __var134__ = __var132__.rank(0).high(); __var133__ <= __var134__; __var133__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int n = __var133__;
                /* } */
                /* } */
{
                    
//#line 1367
int nn =
                      n +
                      koff;
                    
//#line 1368
int k =
                      nn /
                      PARTICLE_XDENSITY +
                      1;
                    
//#line 1369
int j =
                      nn -
                      PARTICLE_XDENSITY *
                      k;
                    
//#line 1370
nn =
                      n %
                        PARTICLE_XDENSITY;
                    
//#line 1371
if (k ==
                                        kc) {
                        
//#line 1372
double yn =
                          k +
                          y0;
                        
//#line 1373
if (k >
                                            1) {
                            
//#line 1374
yt =
                              yt +
                                ((1.0 /
                                    ((bny *
                                        linearDensityFn(
                                          yt,
                                          0.0,
                                          0.0,
                                          0.0)))));
                        }
                        
//#line 1376
yt =
                          X10Util.
                            maxDouble(
                            edgelx,
                            X10Util.
                              minDouble(
                              yt,
                              any));
                        
//#line 1377
double f =
                          bny *
                          linearDensityIntegral(
                            yt,
                            0.0,
                            0.0,
                            0.0) -
                          yn;
                        
//#line 1378
double absf =
                          java.
                            lang.
                            Math.
                            abs(
                            f);
                        
//#line 1379
int i =
                          0;
                        
//#line 1380
while (absf >=
                                               ERROR) {
                            
//#line 1381
if (absf <
                                                BIG) {
                                
//#line 1382
double fp =
                                  bny *
                                  linearDensityFn(
                                    yt,
                                    0.0,
                                    0.0,
                                    0.0);
                                
//#line 1383
yt0 =
                                  yt;
                                
//#line 1384
yt =
                                  X10Util.
                                    maxDouble(
                                    edgely,
                                    X10Util.
                                      minDouble(
                                      yt -
                                        f /
                                        fp,
                                      any));
                            } else {
                                
//#line 1387
if (f >
                                                    0.0) {
                                    
//#line 1388
yt =
                                      yt0 +
                                        0.5 *
                                        ((yt -
                                            yt0));
                                } else {
                                    
//#line 1391
yt =
                                      yt +
                                        yt -
                                        yt0;
                                }
                            }
                            
//#line 1393
if (i >=
                                                MAX_ITER) {
                                
//#line 1394
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                              lang.
                                                                                                                              System.
                                                                                                                              err))/* } */.println("4: Newton iteration max exceeded");
                                
//#line 1395
break;
                            } else {
                                
//#line 1398
f =
                                  bny *
                                    linearDensityFnIntegral(
                                      yt,
                                      0.0,
                                      0.0,
                                      0.0) -
                                    yn;
                                
//#line 1399
absf =
                                  java.
                                    lang.
                                    Math.
                                    abs(
                                    f);
                            }
                            
//#line 1401
i++;
                        }
                        
//#line 1403
kc++;
                        
//#line 1404
yt0 =
                          yt;
                    }
                    
//#line 1406
/* template:array_set { */(result).set(/* template:array_get { */((result).get(/* Join: { */nn +
                      noff,X/* } */))/* } */,/* Join: { */n +
                      noff,X/* } */)/* } */;
                    
//#line 1407
/* template:array_set { */(result).set(yt,/* Join: { */n +
                      noff,Y/* } */)/* } */;
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var25____ = (__var132__).iterator(); __var25____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var25__ = (x10.
                  lang.
                  point) __var25____.next();
                	/* Join: { *//* Join: { */final int n =
                  /* template:array_get { */((__var25__).get(0))/* } */;/* } */
{
                    
//#line 1367
int nn =
                      n +
                      koff;
                    
//#line 1368
int k =
                      nn /
                      PARTICLE_XDENSITY +
                      1;
                    
//#line 1369
int j =
                      nn -
                      PARTICLE_XDENSITY *
                      k;
                    
//#line 1370
nn =
                      n %
                        PARTICLE_XDENSITY;
                    
//#line 1371
if (k ==
                                        kc) {
                        
//#line 1372
double yn =
                          k +
                          y0;
                        
//#line 1373
if (k >
                                            1) {
                            
//#line 1374
yt =
                              yt +
                                ((1.0 /
                                    ((bny *
                                        linearDensityFn(
                                          yt,
                                          0.0,
                                          0.0,
                                          0.0)))));
                        }
                        
//#line 1376
yt =
                          X10Util.
                            maxDouble(
                            edgelx,
                            X10Util.
                              minDouble(
                              yt,
                              any));
                        
//#line 1377
double f =
                          bny *
                          linearDensityIntegral(
                            yt,
                            0.0,
                            0.0,
                            0.0) -
                          yn;
                        
//#line 1378
double absf =
                          java.
                            lang.
                            Math.
                            abs(
                            f);
                        
//#line 1379
int i =
                          0;
                        
//#line 1380
while (absf >=
                                               ERROR) {
                            
//#line 1381
if (absf <
                                                BIG) {
                                
//#line 1382
double fp =
                                  bny *
                                  linearDensityFn(
                                    yt,
                                    0.0,
                                    0.0,
                                    0.0);
                                
//#line 1383
yt0 =
                                  yt;
                                
//#line 1384
yt =
                                  X10Util.
                                    maxDouble(
                                    edgely,
                                    X10Util.
                                      minDouble(
                                      yt -
                                        f /
                                        fp,
                                      any));
                            } else {
                                
//#line 1387
if (f >
                                                    0.0) {
                                    
//#line 1388
yt =
                                      yt0 +
                                        0.5 *
                                        ((yt -
                                            yt0));
                                } else {
                                    
//#line 1391
yt =
                                      yt +
                                        yt -
                                        yt0;
                                }
                            }
                            
//#line 1393
if (i >=
                                                MAX_ITER) {
                                
//#line 1394
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                              lang.
                                                                                                                              System.
                                                                                                                              err))/* } */.println("4: Newton iteration max exceeded");
                                
//#line 1395
break;
                            } else {
                                
//#line 1398
f =
                                  bny *
                                    linearDensityFnIntegral(
                                      yt,
                                      0.0,
                                      0.0,
                                      0.0) -
                                    yn;
                                
//#line 1399
absf =
                                  java.
                                    lang.
                                    Math.
                                    abs(
                                    f);
                            }
                            
//#line 1401
i++;
                        }
                        
//#line 1403
kc++;
                        
//#line 1404
yt0 =
                          yt;
                    }
                    
//#line 1406
/* template:array_set { */(result).set(/* template:array_get { */((result).get(/* Join: { */nn +
                      noff,X/* } */))/* } */,/* Join: { */n +
                      noff,X/* } */)/* } */;
                    
//#line 1407
/* template:array_set { */(result).set(yt,/* Join: { */n +
                      noff,Y/* } */)/* } */;
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp128) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp128);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1410
return result;
    }
    
    
//#line 1412
public x10.
                    lang.
                    DoubleReferenceArray
                    genParticleVelocity(
                    final int n) {
        
//#line 1413
final int X =
          0;
        
//#line 1414
final int Y =
          1;
        
//#line 1415
final x10.
          lang.
          dist dResult =
          X10Util.
            distBlockStar2(
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
                n -
                  1)),
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
                1)));
        
//#line 1416
final x10.
          lang.
          DoubleReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dResult,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 1417
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1418
/* template:forloop-mult { */{
            x10.lang.region __var136__ = (x10.lang.region) x10.
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
                                                               PARTICLE_YDENSITY -
                                                                 1));
            if (__var136__.size() > 0 && (__var136__ instanceof x10.array.MultiDimRegion || __var136__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var137__ = __var136__.rank(0).low(), __var138__ = __var136__.rank(0).high(); __var137__ <= __var138__; __var137__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var137__;
            /* } */
            /* } */
{
                
//#line 1419
final int offset =
                  PARTICLE_XDENSITY *
                  i;
                
//#line 1420
/* template:forloop-mult { */{
                x10.lang.region __var139__ = (x10.lang.region) x10.
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
                                                                   PARTICLE_XDENSITY -
                                                                     1));
                if (__var139__.size() > 0 && (__var139__ instanceof x10.array.MultiDimRegion || __var139__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var140__ = __var139__.rank(0).low(), __var141__ = __var139__.rank(0).high(); __var140__ <= __var141__; __var140__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var140__;
                /* } */
                /* } */
{
                    
//#line 1421
final int idx =
                      j +
                      offset;
                    
//#line 1422
final double vx =
                      THERMAL_XVELOCITY *
                      /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(r))/* } */.nextNormal();
                    
//#line 1423
final double vy =
                      THERMAL_YVELOCITY *
                      /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(r))/* } */.nextNormal();
                    
//#line 1424
/* template:Async { */(x10.lang.Runtime.asPlace(dResult.
                                                                                    get(
                                                                                    idx,
                                                                                    0))).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1425
/* template:array_set { */(result).set(vx,/* Join: { */idx,X/* } */)/* } */;
                        
//#line 1426
/* template:array_set { */(result).set(vy,/* Join: { */idx,Y/* } */)/* } */;
                    }
                    		}
                    	});/* } */
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var27____ = (__var139__).iterator(); __var27____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var27__ = (x10.
                  lang.
                  point) __var27____.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((__var27__).get(0))/* } */;/* } */
{
                    
//#line 1421
final int idx =
                      j +
                      offset;
                    
//#line 1422
final double vx =
                      THERMAL_XVELOCITY *
                      /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(r))/* } */.nextNormal();
                    
//#line 1423
final double vy =
                      THERMAL_YVELOCITY *
                      /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(r))/* } */.nextNormal();
                    
//#line 1424
/* template:Async { */(x10.lang.Runtime.asPlace(dResult.
                                                                                    get(
                                                                                    idx,
                                                                                    0))).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1425
/* template:array_set { */(result).set(vx,/* Join: { */idx,X/* } */)/* } */;
                        
//#line 1426
/* template:array_set { */(result).set(vy,/* Join: { */idx,Y/* } */)/* } */;
                    }
                    		}
                    	});/* } */
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
            for (java.util.Iterator __var26____ = (__var136__).iterator(); __var26____.hasNext(); ) {
            	final  x10.
              lang.
              point __var26__ = (x10.
              lang.
              point) __var26____.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var26__).get(0))/* } */;/* } */
{
                
//#line 1419
final int offset =
                  PARTICLE_XDENSITY *
                  i;
                
//#line 1420
/* template:forloop-mult { */{
                x10.lang.region __var142__ = (x10.lang.region) x10.
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
                                                                   PARTICLE_XDENSITY -
                                                                     1));
                if (__var142__.size() > 0 && (__var142__ instanceof x10.array.MultiDimRegion || __var142__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var143__ = __var142__.rank(0).low(), __var144__ = __var142__.rank(0).high(); __var143__ <= __var144__; __var143__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var143__;
                /* } */
                /* } */
{
                    
//#line 1421
final int idx =
                      j +
                      offset;
                    
//#line 1422
final double vx =
                      THERMAL_XVELOCITY *
                      /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(r))/* } */.nextNormal();
                    
//#line 1423
final double vy =
                      THERMAL_YVELOCITY *
                      /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(r))/* } */.nextNormal();
                    
//#line 1424
/* template:Async { */(x10.lang.Runtime.asPlace(dResult.
                                                                                    get(
                                                                                    idx,
                                                                                    0))).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1425
/* template:array_set { */(result).set(vx,/* Join: { */idx,X/* } */)/* } */;
                        
//#line 1426
/* template:array_set { */(result).set(vy,/* Join: { */idx,Y/* } */)/* } */;
                    }
                    		}
                    	});/* } */
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var27____ = (__var142__).iterator(); __var27____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var27__ = (x10.
                  lang.
                  point) __var27____.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((__var27__).get(0))/* } */;/* } */
{
                    
//#line 1421
final int idx =
                      j +
                      offset;
                    
//#line 1422
final double vx =
                      THERMAL_XVELOCITY *
                      /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(r))/* } */.nextNormal();
                    
//#line 1423
final double vy =
                      THERMAL_YVELOCITY *
                      /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(r))/* } */.nextNormal();
                    
//#line 1424
/* template:Async { */(x10.lang.Runtime.asPlace(dResult.
                                                                                    get(
                                                                                    idx,
                                                                                    0))).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1425
/* template:array_set { */(result).set(vx,/* Join: { */idx,X/* } */)/* } */;
                        
//#line 1426
/* template:array_set { */(result).set(vy,/* Join: { */idx,Y/* } */)/* } */;
                    }
                    		}
                    	});/* } */
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
            
        }
        	} catch (Throwable tmp135) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp135);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1431
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                      lang.
                                                                                                      System.
                                                                                                      out))/* } */.println("Init: correcting drift");
        
//#line 1432
final x10.
          lang.
          dist dUnique =
          (x10.
            lang.
            dist)
            x10.
              lang.
              dist.
              UNIQUE;
        
//#line 1433
final x10.
          lang.
          IntReferenceArray numParticles =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 1434
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 1436
final x10.
          lang.
          DoubleReferenceArray sumX =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point pt/* } */, double dummy) { {
            
//#line 1437
return 0.0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 1439
final x10.
          lang.
          DoubleReferenceArray sumY =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point pt/* } */, double dummy) { {
            
//#line 1440
return 0.0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 1442
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1443
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 1444
final x10.
                  lang.
                  region rLocal1 =
                  X10Util.
                    getLRank2D(
                    dResult,
                    0);
                
//#line 1445
/* template:forloop { */
                for (java.util.Iterator pt__ = (x10.
                                                  lang.
                                                  region.
                                                  factory.
                                                  region(
                                                  rLocal1,
                                                  x10.
                                                    lang.
                                                    region.
                                                    factory.
                                                    region(
                                                    X,
                                                    X))).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 1446
/* template:array_set { */(sumX).set(/* template:array_get { */((sumX).get(pl))/* } */ +
                      /* template:array_get { */((result).get(pt))/* } */,pl)/* } */;
                    
//#line 1447
/* template:array_set { */(numParticles).set(/* template:array_get { */((numParticles).get(pl))/* } */ +
                      1,pl)/* } */;
                }/* } */
                }
                /* } */
                
                
//#line 1449
/* template:forloop { */
                for (java.util.Iterator pt__ = (x10.
                                                  lang.
                                                  region.
                                                  factory.
                                                  region(
                                                  rLocal1,
                                                  x10.
                                                    lang.
                                                    region.
                                                    factory.
                                                    region(
                                                    Y,
                                                    Y))).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 1450
/* template:array_set { */(sumY).set(/* template:array_get { */((sumY).get(pl))/* } */ +
                      /* template:array_get { */((result).get(pt))/* } */,pl)/* } */;
                }/* } */
                }
                /* } */
                
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp145) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp145);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1453
final int totalParticles =
          numParticles.
            sum();
        
//#line 1454
final double driftX =
          sumX.
            sum() /
          totalParticles;
        
//#line 1455
final double driftY =
          sumY.
            sum() /
          totalParticles;
        
//#line 1456
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                      lang.
                                                                                                      System.
                                                                                                      out))/* } */.println("Init: updating with drift");
        
//#line 1457
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1458
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 1459
final x10.
                  lang.
                  region rLocal1 =
                  X10Util.
                    getLRank2D(
                    dResult,
                    0);
                
//#line 1460
/* template:foreach { */
                for (java.util.Iterator pt__ = (x10.
                                                  lang.
                                                  region.
                                                  factory.
                                                  region(
                                                  rLocal1,
                                                  x10.
                                                    lang.
                                                    region.
                                                    factory.
                                                    region(
                                                    X,
                                                    X))).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { *//* } */
{
                    
//#line 1461
/* template:array_set { */(result).set(/* template:array_get { */((result).get(pt))/* } */ -
                      driftX,pt)/* } */;
                }/* } */
                			}
                		});
                }
                /* } */
                
                
//#line 1463
/* template:foreach { */
                for (java.util.Iterator pt__ = (x10.
                                                  lang.
                                                  region.
                                                  factory.
                                                  region(
                                                  rLocal1,
                                                  x10.
                                                    lang.
                                                    region.
                                                    factory.
                                                    region(
                                                    Y,
                                                    Y))).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { *//* } */
{
                    
//#line 1464
/* template:array_set { */(result).set(/* template:array_get { */((result).get(pt))/* } */ -
                      driftY,pt)/* } */;
                }/* } */
                			}
                		});
                }
                /* } */
                
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp146) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp146);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1467
if (totalParticles !=
                            NPARTICLES) {
            
//#line 1468
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                          lang.
                                                                                                          System.
                                                                                                          err))/* } */.println("Velocity distribution truncated, number of " +
                                                                                                                               "particles = " +
                                                                                                                               totalParticles);
        }
        
//#line 1470
return result;
    }
    
    
//#line 1472
public x10.
                    lang.
                    GenericReferenceArray
                    genParticles(
                    final int n,
                    final x10.
                      lang.
                      DoubleReferenceArray position,
                    final x10.
                      lang.
                      DoubleReferenceArray velocity) {
        
//#line 1473
final x10.
          lang.
          dist dResult =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 1473
public x10.
                              lang.
                              dist
                              checkCast(
                              final x10.
                                lang.
                                dist x10_generated_objToCast) {
                  
//#line 1473
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
                  n -
                    1))));
        
//#line 1474
return /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dResult,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
          lang.
          point __var28__/* } */, x10.compilergenerated.Parameter1 dummy) { {
            
//#line 1474
final int i =
              /* template:array_get { */((__var28__).get(0))/* } */;
            
//#line 1475
return new Particle(
              /* template:array_get { */((position).get(/* Join: { */i,0/* } */))/* } */,
              /* template:array_get { */((position).get(/* Join: { */i,1/* } */))/* } */,
              /* template:array_get { */((velocity).get(/* Join: { */i,0/* } */))/* } */,
              /* template:array_get { */((velocity).get(/* Join: { */i,1/* } */))/* } */);
        } }
        }/* } */,true,true,true)/* } */;
    }
    
    
//#line 1478
public x10.
                    lang.
                    dist
                    genInitialDist(
                    final x10.
                      lang.
                      GenericReferenceArray particles) {
        
//#line 1479
final int MAX_PLACES =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 1480
final double edgely =
          ((BOUNDARY_CONDITION ==
              2))
          ? 1.0
          : 0.0;
        
//#line 1481
final double y =
          YLENGTH;
        
//#line 1482
final double y0 =
          linearDensityFnIntegral(
            edgely,
            0.0,
            0.0,
            0.0);
        
//#line 1483
final double nParticlesAve =
          ((linearDensityFnIntegral(
              y -
                edgely,
              0.0,
              0.0,
              0.0) -
              y0)) /
          MAX_PLACES;
        
//#line 1484
final x10.
          lang.
          dist dUnique =
          (x10.
            lang.
            dist)
            x10.
              lang.
              dist.
              UNIQUE;
        
//#line 1485
final x10.
          lang.
          GenericReferenceArray yRegions =
          (x10.
            lang.
            GenericReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dUnique,(x10.array.Operator.Pointwise)null,true,true,true)/* } */);
        
//#line 1486
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1487
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 1488
final double anpl =
                  /* template:array_get { */((pl).get(0))/* } */ *
                  nParticlesAve;
                
//#line 1489
final double anpr =
                  ((/* template:array_get { */((pl).get(0))/* } */ +
                      1)) *
                  nParticlesAve;
                
//#line 1490
double total =
                  0.0;
                
//#line 1491
double tmp =
                  0.0;
                
//#line 1492
double y1 =
                  edgely;
                
//#line 1493
do  {
                    
//#line 1494
tmp =
                      total;
                    
//#line 1495
total =
                      linearDensityFnIntegral(
                        y1,
                        0.0,
                        0.0,
                        0.0) -
                        y0;
                    
//#line 1496
y1 =
                      y1 +
                        1.0;
                }while(total <
                         anpl &&
                         y1 <=
                         y); 
                
//#line 1498
double lb =
                  (((total >
                       tmp))
                     ? ((((y1 -
                             2.0)) +
                           ((anpl -
                               tmp)) /
                           ((total -
                               tmp))))
                     : ((y1 -
                           1.0)));
                
//#line 1499
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                    isFirst()) {
                    
//#line 1500
lb =
                      0.0;
                }
                
//#line 1502
do  {
                    
//#line 1503
tmp =
                      total;
                    
//#line 1504
total =
                      linearDensityFnIntegral(
                        y1,
                        0.0,
                        0.0,
                        0.0) -
                        y0;
                    
//#line 1505
y1 =
                      y1 +
                        1.0;
                }while(total <
                         anpr &&
                         y1 <=
                         y); 
                
//#line 1507
double ub =
                  ((y1 -
                      2.0)) +
                  ((anpr -
                      tmp)) /
                  ((total -
                      tmp));
                
//#line 1508
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                    isLast()) {
                    
//#line 1509
ub =
                      y;
                }
                
//#line 1511
/* template:array_set { */(yRegions).set(x10.
                                                                         lang.
                                                                         region.
                                                                         factory.
                                                                         region(
                                                                         x10.
                                                                           lang.
                                                                           region.
                                                                           factory.
                                                                           region(
                                                                           (int)
                                                                             ((lb +
                                                                                 0.5)),
                                                                           ((int)
                                                                              ((ub +
                                                                                  0.5)) -
                                                                              1))),pl)/* } */;
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp147) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp147);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1513
final x10.
          lang.
          place pHere =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 1514
final x10.
          lang.
          dist dPlace =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
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
                    MAX_PLACES -
                      1)),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 1515
final x10.
          lang.
          GenericReferenceArray rBuffer =
          (x10.
            lang.
            GenericReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dPlace,(x10.array.Operator.Pointwise)null,true,true,true)/* } */);
        
//#line 1516
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1517
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 1518
final x10.
                  lang.
                  region r =
                  new x10.
                    runtime.
                    RuntimeCastChecker.
                    DepTypeRuntimeChecking(
                    ) {
                      
                      
//#line 1518
public x10.
                                      lang.
                                      region
                                      checkCast(
                                      final x10.
                                        lang.
                                        region x10_generated_objToCast) {
                          
//#line 1518
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
                    /* template:parametric { */((x10.
                      lang.
                      region)(/* template:array_get { */((yRegions).get(pl))/* } */))/* } */);
                
//#line 1519
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1520
/* template:array_set { */(rBuffer).set(r,pl)/* } */;
                }
                		}
                	});/* } */
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp148) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp148);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1523
x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                x10.
                  lang.
                  region.
                  factory.
                  emptyRegion(
                  2),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 1524
/* template:forloop { */
        for (java.util.Iterator pl__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pl__.hasNext(); ) {
        	final  x10.
          lang.
          point pl = (x10.
          lang.
          point) pl__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 1525
final x10.
              lang.
              place p =
              x10.
                lang.
                dist.
                UNIQUE.
                get(
                pl);
            
//#line 1526
final x10.
              lang.
              region ry =
              new x10.
                runtime.
                RuntimeCastChecker.
                DepTypeRuntimeChecking(
                ) {
                  
                  
//#line 1526
public x10.
                                  lang.
                                  region
                                  checkCast(
                                  final x10.
                                    lang.
                                    region x10_generated_objToCast) {
                      
//#line 1526
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
                /* template:parametric { */((x10.
                  lang.
                  region)(/* template:array_get { */((rBuffer).get(pl))/* } */))/* } */);
            
//#line 1527
final x10.
              lang.
              dist dLocal =
              (x10.
                lang.
                dist)
                ((x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    x10.
                      lang.
                      region.
                      factory.
                      region(
                      ry,
                      x10.
                        lang.
                        region.
                        factory.
                        region(
                        0,
                        XLENGTH)),
                    p)));
            
//#line 1528
dResult =
              dResult.
                union(
                dLocal);
        }/* } */
        }
        /* } */
        
        
//#line 1530
return dResult;
    }
    
    
//#line 1532
public double
                    linearDensityFn(
                    final double x,
                    final double anlx,
                    final double anxi,
                    final double shift) {
        
//#line 1533
final double result =
          1.0 +
          anlx *
          ((x *
              anxi -
              shift));
        
//#line 1534
if (result <
                            0.0) {
            
//#line 1535
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                          lang.
                                                                                                          System.
                                                                                                          err))/* } */.println("Linear Density Error: result = " +
                                                                                                                               result);
        }
        
//#line 1537
return result;
    }
    
    
//#line 1539
public double
                    linearDensityFnIntegral(
                    final double x,
                    final double anlx,
                    final double anxi,
                    final double shift) {
        
//#line 1540
double result =
          0.0;
        
//#line 1541
if (anxi ==
                            0.0) {
            
//#line 1542
result =
              x;
        } else {
            
//#line 1545
result =
              x +
                0.5 *
                anlx *
                x *
                ((x *
                    anxi -
                    2.0 *
                    shift));
        }
        
//#line 1547
if (result <
                            0.0) {
            
//#line 1548
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                          lang.
                                                                                                          System.
                                                                                                          err))/* } */.println("Linear Density Integral Error: " +
                                                                                                                               "result = " +
                                                                                                                               result);
        }
        
//#line 1550
return result;
    }
    
    
//#line 1552
public x10.
                    lang.
                    DoubleReferenceArray
                    stepTime(
                    final x10.
                      lang.
                      DoubleReferenceArray ionBackground) {
        
//#line 1553
long time1 =
          java.
            lang.
            System.
            currentTimeMillis();
        
//#line 1554
long time2 =
          0;
        
//#line 1555
final double CHARGE =
          ELECTRON_CHARGE;
        
//#line 1556
final x10.
          lang.
          dist dIonBG =
          ionBackground.
            distribution;
        
//#line 1557
final x10.
          lang.
          DoubleReferenceArray chargeDensityGuards =
          makeGuards(
            dIonBG);
        
//#line 1558
final x10.
          lang.
          DoubleReferenceArray chargeDensity =
          (x10.
            lang.
            DoubleReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dIonBG,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
             	public double apply(/* Join: { */x10.
               lang.
               point pt/* } */, double dummy) { {
                 
//#line 1559
return 0.0;
             } }
             }/* } */,true,true,false)/* } */);
        
//#line 1561
depositCharge(
                        particles,
                        chargeDensity,
                        chargeDensityGuards,
                        CHARGE);
        
//#line 1562
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1563
/* template:ateach { */
            {
            	x10.lang.dist pt__distCopy = dIonBG; // make copy to avoid recomputation
            	for (java.util.Iterator pt__ = pt__distCopy.iterator();
            		 pt__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pt = (x10.
              lang.
              point) pt__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pt__distCopy.get(pt)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 1564
/* template:array_set { */(chargeDensity).set(/* template:array_get { */((chargeDensity).get(pt))/* } */ +
                  /* template:array_get { */((ionBackground).get(pt))/* } */,pt)/* } */;
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp149) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp149);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1566
addGuards(
                        chargeDensity,
                        chargeDensityGuards);
        
//#line 1567
time2 =
          java.
            lang.
            System.
            currentTimeMillis();
        
//#line 1568
depositTime =
          depositTime +
            ((time2 -
                time1));
        
//#line 1569
final x10.
          lang.
          dist dOld =
          chargeDensity.
            distribution;
        
//#line 1570
final x10.
          lang.
          DoubleReferenceArray uniformChargeDensity =
          moveFieldToUniform(
            chargeDensity);
        
//#line 1571
final x10.
          lang.
          GenericReferenceArray complexChargeDensity =
          ArrayUtil.
            doubleToComplex(
            doubleDimensions(
              uniformChargeDensity));
        
//#line 1572
time1 =
          java.
            lang.
            System.
            currentTimeMillis();
        
//#line 1573
redistTime =
          redistTime +
            ((time1 -
                time2));
        
//#line 1574
final x10.
          lang.
          GenericReferenceArray complexForceX =
          solver.
            makeForceArray();
        
//#line 1575
final x10.
          lang.
          GenericReferenceArray complexForceY =
          solver.
            makeForceArray();
        
//#line 1576
double we =
          solver.
            getForceCharge(
            complexChargeDensity,
            complexForceX,
            complexForceY);
        
//#line 1577
time2 =
          java.
            lang.
            System.
            currentTimeMillis();
        
//#line 1578
solverTime =
          solverTime +
            ((time2 -
                time1));
        
//#line 1579
final x10.
          lang.
          dist dChargeDensityGuards =
          chargeDensityGuards.
            distribution;
        
//#line 1580
final x10.
          lang.
          DoubleReferenceArray gx =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dChargeDensityGuards,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 1581
final x10.
          lang.
          DoubleReferenceArray gy =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dChargeDensityGuards,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 1582
final x10.
          lang.
          DoubleReferenceArray forceX =
          cropField(
            ArrayUtil.
              complexToDouble(
              complexForceX),
            gx);
        
//#line 1583
final x10.
          lang.
          DoubleReferenceArray forceY =
          cropField(
            ArrayUtil.
              complexToDouble(
              complexForceY),
            gy);
        
//#line 1584
final x10.
          lang.
          DoubleReferenceArray fcx =
          moveFieldToDist(
            forceX,
            dOld);
        
//#line 1585
final x10.
          lang.
          DoubleReferenceArray fcy =
          moveFieldToDist(
            forceY,
            dOld);
        
//#line 1586
loadGuards(
                        fcx,
                        gx);
        
//#line 1587
loadGuards(
                        fcy,
                        gy);
        
//#line 1588
time1 =
          java.
            lang.
            System.
            currentTimeMillis();
        
//#line 1589
redistTime =
          redistTime +
            ((time1 -
                time2));
        
//#line 1590
double wk =
          pushParticles(
            particles,
            fcx,
            gx,
            fcy,
            gy);
        
//#line 1591
time2 =
          java.
            lang.
            System.
            currentTimeMillis();
        
//#line 1592
pushTime =
          pushTime +
            ((time2 -
                time1));
        
//#line 1593
final x10.
          lang.
          IntReferenceArray info =
          makeInfoArray();
        
//#line 1594
particles =
          moveParticles(
            particles,
            dOld,
            info);
        
//#line 1595
final double particleAve =
          (((double)
              /* template:array_get { */((info).get(6))/* } */)) /
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 1596
final double balance =
          X10Util.
            maxDouble(
            /* template:array_get { */((info).get(1))/* } */ -
              particleAve,
            particleAve -
              ((/* template:array_get { */((info).get(2))/* } */ /
                  particleAve)));
        
//#line 1597
if (balance >
                            IMBALANCE) {
            
//#line 1598
final x10.
              lang.
              IntReferenceArray count =
              countParticles(
                particles,
                dOld);
            
//#line 1599
final x10.
              lang.
              dist dNew =
              repartition(
                count,
                dOld,
                particleAve);
            
//#line 1600
backgroundCharge =
              moveFieldToDist(
                backgroundCharge,
                dNew);
            
//#line 1601
particles =
              moveParticles(
                particles,
                dNew,
                info);
        }
        
//#line 1603
final x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
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
                    2)),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 1604
final x10.
          lang.
          DoubleReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dResult,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 1605
/* template:array_set { */(result).set(we,0)/* } */;
        
//#line 1606
/* template:array_set { */(result).set(wk,1)/* } */;
        
//#line 1607
/* template:array_set { */(result).set(we +
          wk,2)/* } */;
        
//#line 1608
time1 =
          java.
            lang.
            System.
            currentTimeMillis();
        
//#line 1609
moveTime =
          moveTime +
            ((time1 -
                time2));
        
//#line 1610
return result;
    }
    
    
//#line 1612
public double
                    linearDensity(
                    final double x,
                    final double anlx,
                    final double anxi,
                    final double shift) {
        
//#line 1613
return 1.0 +
          anlx *
          ((x *
              anxi -
              shift));
    }
    
    
//#line 1615
public double
                    linearDensityIntegral(
                    final double x,
                    final double anlx,
                    final double anxi,
                    final double shift) {
        
//#line 1616
return ((anxi ==
                                 0))
          ? x
          : x +
          0.5 *
          anlx *
          x *
          ((x *
              anxi -
              2.0 *
              shift));
    }
    
    
//#line 1618
public x10.
                    lang.
                    DoubleReferenceArray
                    makeGuards(
                    final x10.
                      lang.
                      dist dData) {
        
//#line 1619
x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                x10.
                  lang.
                  region.
                  factory.
                  emptyRegion(
                  2),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 1620
/* template:forloop { */
        for (java.util.Iterator pl__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pl__.hasNext(); ) {
        	final  x10.
          lang.
          point pl = (x10.
          lang.
          point) pl__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 1621
final x10.
              lang.
              place p =
              x10.
                lang.
                dist.
                UNIQUE.
                get(
                pl);
            
//#line 1622
final x10.
              lang.
              region rLocal1 =
              X10Util.
                getPRank2D(
                dData,
                p,
                0);
            
//#line 1623
final x10.
              lang.
              region rLocal2 =
              X10Util.
                getPRank2D(
                dData,
                p,
                1);
            
//#line 1624
final int ub =
              rLocal1.
                high();
            
//#line 1625
dResult =
              dResult.
                union(
                (x10.
                   lang.
                   dist.
                   factory.
                   constant(
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
                       ub +
                         1,
                       ub +
                         1),
                     rLocal2),
                   p)));
        }/* } */
        }
        /* } */
        
        
//#line 1627
return /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dResult,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point pt/* } */, double dummy) { {
            
//#line 1628
return 0.0;
        } }
        }/* } */,true,true,false)/* } */;
    }
    
    
//#line 1631
public void
                    depositCharge(
                    final x10.
                      lang.
                      GenericReferenceArray particles,
                    final x10.
                      lang.
                      DoubleReferenceArray fieldCharge,
                    final x10.
                      lang.
                      DoubleReferenceArray guards,
                    final double charge) {
        
//#line 1632
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1633
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 1634
final x10.
                  lang.
                  dist dFC =
                  fieldCharge.
                    distribution;
                
//#line 1635
final x10.
                  lang.
                  region rLocalFC =
                  X10Util.
                    get2DLRegion(
                    dFC);
                
//#line 1636
final x10.
                  lang.
                  dist dG =
                  guards.
                    distribution;
                
//#line 1637
final x10.
                  lang.
                  region rLocalG =
                  X10Util.
                    get2DLRegion(
                    dG);
                
//#line 1638
final x10.
                  lang.
                  dist dLocal =
                  (x10.
                    lang.
                    dist)
                    ((x10.
                        lang.
                        dist.
                        factory.
                        constant(
                        (rLocalFC.
                           union(
                           rLocalG)),
                        /* template:here { */x10.lang.Runtime.here()/* } */)));
                
//#line 1639
final x10.
                  lang.
                  DoubleReferenceArray localCharge =
                  /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dLocal,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                	public double apply(/* Join: { */x10.
                  lang.
                  point pt/* } */, double dummy) { {
                    
//#line 1640
return 0.0;
                } }
                }/* } */,true,true,false)/* } */;
                
//#line 1642
/* template:forloop { */
                for (java.util.Iterator pt__ = (particles.
                                                  distribution.
                                                  restriction(
                                                  /* template:here { */x10.lang.Runtime.here()/* } */).
                                                  region).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 1643
final Particle p =
                      /* template:parametric { */((Particle)(/* template:array_get { */((particles).get(pt))/* } */))/* } */;
                    
//#line 1644
final int x =
                      (int)
                        p.
                          getX();
                    
//#line 1645
final int y =
                      (int)
                        p.
                          getY();
                    
//#line 1646
final double dx =
                      p.
                        getX() -
                      x;
                    
//#line 1647
final double dy =
                      p.
                        getY() -
                      y;
                    
//#line 1648
/* template:array_set { */(localCharge).set(/* template:array_get { */((localCharge).get(/* Join: { */y +
                      1,x +
                      1/* } */))/* } */ +
                      ((charge *
                          dx *
                          dy)),/* Join: { */y +
                      1,x +
                      1/* } */)/* } */;
                    
//#line 1649
/* template:array_set { */(localCharge).set(/* template:array_get { */((localCharge).get(/* Join: { */y +
                      1,x/* } */))/* } */ +
                      ((charge *
                          ((1.0 -
                              dx)) *
                          dy)),/* Join: { */y +
                      1,x/* } */)/* } */;
                    
//#line 1650
/* template:array_set { */(localCharge).set(/* template:array_get { */((localCharge).get(/* Join: { */y,x +
                      1/* } */))/* } */ +
                      ((charge *
                          dx *
                          ((1.0 -
                              dy)))),/* Join: { */y,x +
                      1/* } */)/* } */;
                    
//#line 1651
/* template:array_set { */(localCharge).set(/* template:array_get { */((localCharge).get(/* Join: { */y,x/* } */))/* } */ +
                      ((charge *
                          ((1.0 -
                              dx)) *
                          ((1.0 -
                              dy)))),/* Join: { */y,x/* } */)/* } */;
                }/* } */
                }
                /* } */
                
                
//#line 1653
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 1654
/* template:foreach { */
                    for (java.util.Iterator pt__ = (fieldCharge.
                                                      distribution.
                                                      restriction(
                                                      /* template:here { */x10.lang.Runtime.here()/* } */)).iterator(); pt__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point pt = (x10.
                      lang.
                      point) pt__.next();
                    	/* Join: { *//* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { *//* } */
{
                        
//#line 1655
/* template:array_set { */(fieldCharge).set(/* template:array_get { */((localCharge).get(pt))/* } */,pt)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                    
//#line 1657
/* template:foreach { */
                    for (java.util.Iterator pt__ = (guards.
                                                      distribution.
                                                      restriction(
                                                      /* template:here { */x10.lang.Runtime.here()/* } */)).iterator(); pt__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point pt = (x10.
                      lang.
                      point) pt__.next();
                    	/* Join: { *//* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { *//* } */
{
                        
//#line 1658
/* template:array_set { */(guards).set(/* template:array_get { */((localCharge).get(pt))/* } */,pt)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                }
                	} catch (Throwable tmp151) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp151);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp150) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp150);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 1663
public void
                    addGuards(
                    final x10.
                      lang.
                      DoubleReferenceArray data,
                    final x10.
                      lang.
                      DoubleReferenceArray guards) {
        
//#line 1664
final x10.
          lang.
          dist dGuard =
          (x10.
            lang.
            dist)
            guards.
              distribution;
        
//#line 1665
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1666
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 1667
final x10.
                  lang.
                  dist dG =
                  guards.
                    distribution;
                
//#line 1668
final x10.
                  lang.
                  region rLocalG =
                  X10Util.
                    get2DLRegion(
                    dG);
                
//#line 1669
if (!(/* template:here { */x10.lang.Runtime.here()/* } */).
                                     isLast()) {
                    
//#line 1670
final x10.
                      lang.
                      doubleArray sBuffer =
                      (x10.
                        lang.
                        doubleArray)
                        (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(rLocalG.
                                                                                                                                     toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                         	public double apply(/* Join: { */x10.
                           lang.
                           point pt/* } */, double dummy) { {
                             
//#line 1671
return /* template:array_get { */((guards).get(pt))/* } */;
                         } }
                         }/* } */,true,false,false)/* } */);
                    
//#line 1673
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 1674
/* template:Async { */(x10.lang.Runtime.asPlace((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                        next())).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 1675
final x10.
                              lang.
                              dist dData =
                              data.
                                distribution;
                            
//#line 1676
final x10.
                              lang.
                              region rLocalD =
                              X10Util.
                                get2DLRegion(
                                dData);
                            
//#line 1677
/* template:foreach { */
                            for (java.util.Iterator pt__ = ((rLocalD.
                                                               intersection(
                                                               rLocalG))).iterator(); pt__.hasNext(); ) {
                            	final  x10.
                              lang.
                              point pt = (x10.
                              lang.
                              point) pt__.next();
                            	/* Join: { *//* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { *//* } */
{
                                
//#line 1678
/* template:array_set { */(data).set(/* template:array_get { */((data).get(pt))/* } */ +
                                  /* template:array_get { */((sBuffer).get(pt))/* } */,pt)/* } */;
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                        }
                        		}
                        	});/* } */
                    }
                    	} catch (Throwable tmp153) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp153);
                    	} finally {
                    		x10.lang.Runtime.getCurrentActivity().stopFinish();
                    	}
                    }
                    /* } */
                    
                }
                
//#line 1682
/* template:foreach { */
                for (java.util.Iterator pt__ = (rLocalG).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { *//* } */
{
                    
//#line 1683
/* template:array_set { */(guards).set(0.0,pt)/* } */;
                }/* } */
                			}
                		});
                }
                /* } */
                
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp152) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp152);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 1687
public x10.
                    lang.
                    DoubleReferenceArray
                    doubleDimensions(
                    final x10.
                      lang.
                      DoubleReferenceArray data) {
        
//#line 1688
final x10.
          lang.
          region rData =
          data.
            region;
        
//#line 1689
final x10.
          lang.
          region rData1 =
          X10Util.
            getRank2D(
            rData,
            0);
        
//#line 1690
final x10.
          lang.
          region rData2 =
          X10Util.
            getRank2D(
            rData,
            1);
        
//#line 1691
final x10.
          lang.
          dist dResult =
          X10Util.
            distBlockStar2(
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
                2 *
                  rData1.
                    size() -
                  1)),
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
                2 *
                  rData2.
                    size() -
                  1)));
        
//#line 1692
final x10.
          lang.
          DoubleReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dResult,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point pt/* } */, double dummy) { {
            
//#line 1693
return 0.0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 1695
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1696
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 1697
final x10.
                  lang.
                  place pDst =
                  x10.
                    lang.
                    place.
                    places(
                    /* template:array_get { */((pl).get(0))/* } */ /
                      2);
                
//#line 1698
final x10.
                  lang.
                  dist dData =
                  data.
                    distribution;
                
//#line 1699
final x10.
                  lang.
                  region rLocal =
                  X10Util.
                    get2DLRegion(
                    dData);
                
//#line 1700
final x10.
                  lang.
                  doubleArray sBuffer =
                  (x10.
                    lang.
                    doubleArray)
                    (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(rLocal.
                                                                                                                                 toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                     	public double apply(/* Join: { */x10.
                       lang.
                       point pt/* } */, double dummy) { {
                         
//#line 1701
return /* template:array_get { */((data).get(pt))/* } */;
                     } }
                     }/* } */,true,false,false)/* } */);
                
//#line 1703
/* template:Async { */(x10.lang.Runtime.asPlace(pDst)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1704
/* template:foreach { */
                    for (java.util.Iterator pt__ = (rLocal).iterator(); pt__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point pt = (x10.
                      lang.
                      point) pt__.next();
                    	/* Join: { *//* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { *//* } */
{
                        
//#line 1705
/* template:array_set { */(result).set(/* template:array_get { */((sBuffer).get(pt))/* } */,pt)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                }
                		}
                	});/* } */
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp154) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp154);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1709
return result;
    }
    
    
//#line 1711
public x10.
                    lang.
                    DoubleReferenceArray
                    moveFieldToUniform(
                    final x10.
                      lang.
                      DoubleReferenceArray data) {
        
//#line 1712
final x10.
          lang.
          region rData =
          data.
            region;
        
//#line 1713
return moveFieldToDist(
                               data,
                               X10Util.
                                 distBlockStar1(
                                 rData));
    }
    
    
//#line 1715
public x10.
                    lang.
                    DoubleReferenceArray
                    moveFieldToDist(
                    final x10.
                      lang.
                      DoubleReferenceArray data,
                    final x10.
                      lang.
                      dist dDst) {
        
//#line 1716
final int MAX_ROWS =
          MOVE_FIELD_TO_DIST_MAX_ROWS;
        
//#line 1717
final int MAX_ITER =
          0;
        
//#line 1718
final x10.
          lang.
          dist dUnique =
          (x10.
            lang.
            dist)
            x10.
              lang.
              dist.
              UNIQUE;
        
//#line 1719
final x10.
          lang.
          region rData =
          data.
            region;
        
//#line 1720
final x10.
          lang.
          region rRank1 =
          X10Util.
            getRank2D(
            rData,
            0);
        
//#line 1721
final x10.
          lang.
          region rRank2t =
          X10Util.
            getRank2D(
            rData,
            1);
        
//#line 1722
final x10.
          lang.
          region rRank2 =
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
              rRank2t.
                size() -
                1));
        
//#line 1723
final x10.
          lang.
          region rRows =
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
              MAX_ROWS -
                1));
        
//#line 1724
final x10.
          lang.
          dist dBuffer =
          X10Util.
            extendDistRank3D(
            X10Util.
              extendDistRank2D(
              dUnique,
              rRows),
            rRank2);
        
//#line 1725
final x10.
          lang.
          DoubleReferenceArray srcBuffer =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dBuffer,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point pt/* } */, double dummy) { {
            
//#line 1726
return 0.0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 1728
final x10.
          lang.
          DoubleReferenceArray dstBuffer =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dBuffer,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point pt/* } */, double dummy) { {
            
//#line 1729
return 0.0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 1731
final x10.
          lang.
          IntReferenceArray offsets =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 1732
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 1734
final x10.
          lang.
          IntReferenceArray sizes =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 1735
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 1737
final x10.
          lang.
          IntReferenceArray inLt =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 1738
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 1740
final x10.
          lang.
          IntReferenceArray inRt =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 1741
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 1743
final x10.
          lang.
          IntReferenceArray outLt =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 1744
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 1746
final x10.
          lang.
          IntReferenceArray outRt =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 1747
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 1749
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1750
/* template:ateach { */
            {
            	x10.lang.dist __var29____distCopy = x10.
                                                   lang.
                                                   dist.
                                                   UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator __var29____ = __var29____distCopy.iterator();
            		 __var29____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var29__ = (x10.
              lang.
              point) __var29____.next();
            		/* Join: { */final int pl =
              /* template:array_get { */((__var29__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var29____distCopy.get(__var29__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int pl =
              /* template:array_get { */((__var29__).get(0))/* } */;/* } */
{
                
//#line 1751
final x10.
                  lang.
                  dist dData =
                  data.
                    distribution;
                
//#line 1752
final x10.
                  lang.
                  region rLocal =
                  X10Util.
                    get2DLRegion(
                    dData);
                
//#line 1753
final x10.
                  lang.
                  region rLocal1 =
                  X10Util.
                    getRank2D(
                    rLocal,
                    0);
                
//#line 1754
if (X10Util.
                                    ENABLE_CHECKS &&
                                    rLocal1.
                                      size() ==
                                    0) {
                    
//#line 1755
throw new java.
                      lang.
                      RuntimeException(
                      "Region empty -- should not happen");
                }
                
//#line 1757
final int offset =
                  rLocal1.
                    low();
                
//#line 1758
/* template:foreach { */
                for (java.util.Iterator __var30____ = (rLocal).iterator(); __var30____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var30__ = (x10.
                  lang.
                  point) __var30____.next();
                	/* Join: { */final int i =
                  /* template:array_get { */((__var30__).get(0))/* } */;
final int j =
                  /* template:array_get { */((__var30__).get(1))/* } */;/* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var30__).get(0))/* } */;
final int j =
                  /* template:array_get { */((__var30__).get(1))/* } */;/* } */
{
                    
//#line 1759
/* template:array_set { */(srcBuffer).set(/* template:array_get { */((data).get(/* Join: { */i,j/* } */))/* } */,/* Join: { */pl,i -
                      offset,j/* } */)/* } */;
                }/* } */
                			}
                		});
                }
                /* } */
                
                
//#line 1761
/* template:array_set { */(sizes).set(rLocal1.
                                                                      size(),pl)/* } */;
                
//#line 1762
/* template:array_set { */(offsets).set(offset,pl)/* } */;
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp155) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp155);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1764
int mter =
          MAX_ITER;
        
//#line 1765
int iter =
          0;
        
//#line 1766
boolean done =
          false;
        
//#line 1767
do  {
            
//#line 1768
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1769
/* template:ateach { */
                {
                	x10.lang.dist pl__distCopy = x10.
                                                lang.
                                                dist.
                                                UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator pl__ = pl__distCopy.iterator();
                		 pl__.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point pl = (x10.
                  lang.
                  point) pl__.next();
                		/* Join: { *//* } */
                		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { *//* } */
{
                    
//#line 1770
final x10.
                      lang.
                      region rLocalD =
                      X10Util.
                        get2DLRegion(
                        dDst);
                    
//#line 1771
final x10.
                      lang.
                      region rLocalD1 =
                      X10Util.
                        getRank2D(
                        rLocalD,
                        0);
                    
//#line 1772
if (X10Util.
                                        ENABLE_CHECKS &&
                                        rLocalD1.
                                          size() ==
                                        0) {
                        
//#line 1773
throw new java.
                          lang.
                          RuntimeException(
                          "Region empty -- " +
                          "cannot to move grids");
                    }
                    
//#line 1775
/* template:array_set { */(outLt).set(0,pl)/* } */;
                    
//#line 1776
/* template:array_set { */(outRt).set(0,pl)/* } */;
                    
//#line 1777
final int lBorder =
                      rLocalD1.
                        low();
                    
//#line 1778
final int rBorder =
                      rLocalD1.
                        high() +
                      1;
                    
//#line 1779
/* template:forloop-mult { */{
                    x10.lang.region __var157__ = (x10.lang.region) x10.
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
                                                                       /* template:array_get { */((sizes).get(pl))/* } */ -
                                                                         1));
                    if (__var157__.size() > 0 && (__var157__ instanceof x10.array.MultiDimRegion || __var157__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var158__ = __var157__.rank(0).low(), __var159__ = __var157__.rank(0).high(); __var158__ <= __var159__; __var158__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int i1 = __var158__;
                    /* } */
                    /* } */
{
                        
//#line 1780
final int i2 =
                          i1 +
                          /* template:array_get { */((offsets).get(pl))/* } */;
                        
//#line 1781
if (i2 >=
                                            rBorder) {
                            
//#line 1782
/* template:array_set { */(outRt).set(/* template:array_get { */((outRt).get(pl))/* } */ +
                              1,pl)/* } */;
                        } else {
                            
//#line 1785
if (i2 <
                                                lBorder) {
                                
//#line 1786
/* template:array_set { */(outLt).set(/* template:array_get { */((outLt).get(pl))/* } */ +
                                  1,pl)/* } */;
                            }
                        }
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var31____ = (__var157__).iterator(); __var31____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var31__ = (x10.
                      lang.
                      point) __var31____.next();
                    	/* Join: { *//* Join: { */final int i1 =
                      /* template:array_get { */((__var31__).get(0))/* } */;/* } */
{
                        
//#line 1780
final int i2 =
                          i1 +
                          /* template:array_get { */((offsets).get(pl))/* } */;
                        
//#line 1781
if (i2 >=
                                            rBorder) {
                            
//#line 1782
/* template:array_set { */(outRt).set(/* template:array_get { */((outRt).get(pl))/* } */ +
                              1,pl)/* } */;
                        } else {
                            
//#line 1785
if (i2 <
                                                lBorder) {
                                
//#line 1786
/* template:array_set { */(outLt).set(/* template:array_get { */((outLt).get(pl))/* } */ +
                                  1,pl)/* } */;
                            }
                        }
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp156) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp156);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 1790
iter++;
            
//#line 1791
final x10.
              lang.
              IntReferenceArray pr =
              /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
            	public int apply(/* Join: { */x10.
              lang.
              point pt/* } */, int dummy) { {
                
//#line 1792
return 0;
            } }
            }/* } */,true,true,false)/* } */;
            
//#line 1794
final x10.
              lang.
              IntReferenceArray ter =
              /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
            	public int apply(/* Join: { */x10.
              lang.
              point pt/* } */, int dummy) { {
                
//#line 1795
return 0;
            } }
            }/* } */,true,true,false)/* } */;
            
//#line 1797
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1798
/* template:ateach { */
                {
                	x10.lang.dist pl__distCopy = x10.
                                                lang.
                                                dist.
                                                UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator pl__ = pl__distCopy.iterator();
                		 pl__.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point pl = (x10.
                  lang.
                  point) pl__.next();
                		/* Join: { *//* } */
                		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { *//* } */
{
                    
//#line 1799
/* template:array_set { */(inLt).set(0,pl)/* } */;
                    
//#line 1800
/* template:array_set { */(inRt).set(0,pl)/* } */;
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp160) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp160);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 1802
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1803
/* template:ateach { */
                {
                	x10.lang.dist __var32____distCopy = x10.
                                                       lang.
                                                       dist.
                                                       UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator __var32____ = __var32____distCopy.iterator();
                		 __var32____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var32__ = (x10.
                  lang.
                  point) __var32____.next();
                		/* Join: { */final int pl =
                  /* template:array_get { */((__var32__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var32____distCopy.get(__var32__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int pl =
                  /* template:array_get { */((__var32__).get(0))/* } */;/* } */
{
                    
//#line 1804
if (/* template:array_get { */((outRt).get(pl))/* } */ >
                                        0) {
                        
//#line 1805
final int bsize =
                          /* template:array_get { */((outRt).get(pl))/* } */;
                        
//#line 1806
final x10.
                          lang.
                          region rBuffer =
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
                              bsize -
                                1),
                            rRank2);
                        
//#line 1807
final x10.
                          lang.
                          doubleArray sBuffer =
                          (x10.
                            lang.
                            doubleArray)
                            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(rBuffer.
                                                                                                                                         toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                             	public double apply(/* Join: { */x10.
                               lang.
                               point __var33__/* } */, double dummy) { {
                                 
//#line 1807
final int i =
                                   /* template:array_get { */((__var33__).get(0))/* } */;
                                 
//#line 1807
final int j =
                                   /* template:array_get { */((__var33__).get(1))/* } */;
                                 
//#line 1808
return /* template:array_get { */((srcBuffer).get(/* Join: { */pl,i +
                                   /* template:array_get { */((sizes).get(pl))/* } */ -
                                   /* template:array_get { */((outRt).get(pl))/* } */,j/* } */))/* } */;
                             } }
                             }/* } */,true,false,false)/* } */);
                        
//#line 1810
/* template:Async { */(x10.lang.Runtime.asPlace((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                        next())).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 1811
/* template:foreach { */
                            for (java.util.Iterator __var34____ = (rBuffer).iterator(); __var34____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var34__ = (x10.
                              lang.
                              point) __var34____.next();
                            	/* Join: { */final int i =
                              /* template:array_get { */((__var34__).get(0))/* } */;
final int j =
                              /* template:array_get { */((__var34__).get(1))/* } */;/* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { */final int i =
                              /* template:array_get { */((__var34__).get(0))/* } */;
final int j =
                              /* template:array_get { */((__var34__).get(1))/* } */;/* } */
{
                                
//#line 1812
/* template:array_set { */(dstBuffer).set(/* template:array_get { */((sBuffer).get(/* Join: { */i,j/* } */))/* } */,/* Join: { */(/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                                                                                                                 id,i,j/* } */)/* } */;
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                            
//#line 1814
/* template:array_set { */(inLt).set(bsize,(/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                       id)/* } */;
                        }
                        		}
                        	});/* } */
                    }
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp161) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp161);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 1818
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1819
/* template:ateach { */
                {
                	x10.lang.dist __var35____distCopy = x10.
                                                       lang.
                                                       dist.
                                                       UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator __var35____ = __var35____distCopy.iterator();
                		 __var35____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var35__ = (x10.
                  lang.
                  point) __var35____.next();
                		/* Join: { */final int pl =
                  /* template:array_get { */((__var35__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var35____distCopy.get(__var35__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int pl =
                  /* template:array_get { */((__var35__).get(0))/* } */;/* } */
{
                    
//#line 1820
/* template:array_set { */(sizes).set(/* template:array_get { */((sizes).get(pl))/* } */ -
                      /* template:array_get { */((outRt).get(pl))/* } */,pl)/* } */;
                    
//#line 1821
/* template:array_set { */(outRt).set(X10Util.
                                                                          maxInt(
                                                                          /* template:array_get { */((sizes).get(pl))/* } */ +
                                                                            /* template:array_get { */((inLt).get(pl))/* } */ -
                                                                            MAX_ROWS,
                                                                          0),pl)/* } */;
                    
//#line 1822
/* template:array_set { */(sizes).set(/* template:array_get { */((sizes).get(pl))/* } */ -
                      /* template:array_get { */((outRt).get(pl))/* } */,pl)/* } */;
                    
//#line 1823
if (/* template:array_get { */((outRt).get(pl))/* } */ >
                                        0) {
                        
//#line 1824
/* template:array_set { */(pr).set(X10Util.
                                                                           maxInt(
                                                                           /* template:array_get { */((pr).get(pl))/* } */,
                                                                           /* template:array_get { */((outRt).get(pl))/* } */),pl)/* } */;
                        
//#line 1825
final int rsize =
                          X10Util.
                            minInt(
                            /* template:array_get { */((outRt).get(pl))/* } */,
                            MAX_ROWS -
                              /* template:array_get { */((inLt).get(pl))/* } */);
                        
//#line 1826
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 1827
/* template:foreach { */
                            for (java.util.Iterator __var36____ = (x10.
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
                                                                       rsize -
                                                                         1),
                                                                     rRank2)).iterator(); __var36____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var36__ = (x10.
                              lang.
                              point) __var36____.next();
                            	/* Join: { */final int i =
                              /* template:array_get { */((__var36__).get(0))/* } */;
final int j =
                              /* template:array_get { */((__var36__).get(1))/* } */;/* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { */final int i =
                              /* template:array_get { */((__var36__).get(0))/* } */;
final int j =
                              /* template:array_get { */((__var36__).get(1))/* } */;/* } */
{
                                
//#line 1828
/* template:array_set { */(dstBuffer).set(/* template:array_get { */((srcBuffer).get(/* Join: { */pl,/* template:array_get { */((sizes).get(pl))/* } */ +
                                  i,j/* } */))/* } */,/* Join: { */pl,MAX_ROWS -
                                  rsize +
                                  i,j/* } */)/* } */;
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                        }
                        	} catch (Throwable tmp163) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp163);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                    }
                    
//#line 1831
if (/* template:array_get { */((sizes).get(pl))/* } */ >
                                        0 &&
                                        /* template:array_get { */((inLt).get(pl))/* } */ >
                                        0) {
                        
//#line 1832
/* template:forloop-mult { */{
                        x10.lang.region __var164__ = (x10.lang.region) x10.
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
                                                                           /* template:array_get { */((sizes).get(pl))/* } */));
                        if (__var164__.size() > 0 && (__var164__ instanceof x10.array.MultiDimRegion || __var164__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var165__ = __var164__.rank(0).low(), __var166__ = __var164__.rank(0).high(); __var165__ <= __var166__; __var165__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i1 = __var165__;
                        /* } */
                        /* } */
{
                            
//#line 1833
final int i2 =
                              /* template:array_get { */((sizes).get(pl))/* } */ -
                              i1;
                            
//#line 1834
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 1835
/* template:foreach { */
                                for (java.util.Iterator __var38____ = (rRank2).iterator(); __var38____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var38__ = (x10.
                                  lang.
                                  point) __var38____.next();
                                	/* Join: { */final int j =
                                  /* template:array_get { */((__var38__).get(0))/* } */;/* } */
                                	x10.lang.Runtime.here().runAsync
                                		(new x10.runtime.Activity() {
                                			public void runX10Task() {
                                				/* Join: { *//* Join: { */final int j =
                                  /* template:array_get { */((__var38__).get(0))/* } */;/* } */
{
                                    
//#line 1836
/* template:array_set { */(srcBuffer).set(/* template:array_get { */((srcBuffer).get(/* Join: { */pl,i2,j/* } */))/* } */,/* Join: { */pl,i2 +
                                      /* template:array_get { */((inLt).get(pl))/* } */,j/* } */)/* } */;
                                }/* } */
                                			}
                                		});
                                }
                                /* } */
                                
                            }
                            	} catch (Throwable tmp167) {
                            		x10.lang.Runtime.getCurrentActivity().pushException(tmp167);
                            	} finally {
                            		x10.lang.Runtime.getCurrentActivity().stopFinish();
                            	}
                            }
                            /* } */
                            
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var37____ = (__var164__).iterator(); __var37____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var37__ = (x10.
                          lang.
                          point) __var37____.next();
                        	/* Join: { *//* Join: { */final int i1 =
                          /* template:array_get { */((__var37__).get(0))/* } */;/* } */
{
                            
//#line 1833
final int i2 =
                              /* template:array_get { */((sizes).get(pl))/* } */ -
                              i1;
                            
//#line 1834
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 1835
/* template:foreach { */
                                for (java.util.Iterator __var38____ = (rRank2).iterator(); __var38____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var38__ = (x10.
                                  lang.
                                  point) __var38____.next();
                                	/* Join: { */final int j =
                                  /* template:array_get { */((__var38__).get(0))/* } */;/* } */
                                	x10.lang.Runtime.here().runAsync
                                		(new x10.runtime.Activity() {
                                			public void runX10Task() {
                                				/* Join: { *//* Join: { */final int j =
                                  /* template:array_get { */((__var38__).get(0))/* } */;/* } */
{
                                    
//#line 1836
/* template:array_set { */(srcBuffer).set(/* template:array_get { */((srcBuffer).get(/* Join: { */pl,i2,j/* } */))/* } */,/* Join: { */pl,i2 +
                                      /* template:array_get { */((inLt).get(pl))/* } */,j/* } */)/* } */;
                                }/* } */
                                			}
                                		});
                                }
                                /* } */
                                
                            }
                            	} catch (Throwable tmp168) {
                            		x10.lang.Runtime.getCurrentActivity().pushException(tmp168);
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
                        
                    }
                    
//#line 1840
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 1841
/* template:foreach { */
                        for (java.util.Iterator pt__ = (x10.
                                                          lang.
                                                          region.
                                                          factory.
                                                          region(
                                                          x10.
                                                            lang.
                                                            region.
                                                            factory.
                                                            region(
                                                            pl,
                                                            pl),
                                                          x10.
                                                            lang.
                                                            region.
                                                            factory.
                                                            region(
                                                            0,
                                                            /* template:array_get { */((inLt).get(pl))/* } */ -
                                                              1),
                                                          rRank2)).iterator(); pt__.hasNext(); ) {
                        	final  x10.
                          lang.
                          point pt = (x10.
                          lang.
                          point) pt__.next();
                        	/* Join: { *//* } */
                        	x10.lang.Runtime.here().runAsync
                        		(new x10.runtime.Activity() {
                        			public void runX10Task() {
                        				/* Join: { *//* Join: { *//* } */
{
                            
//#line 1842
/* template:array_set { */(srcBuffer).set(/* template:array_get { */((dstBuffer).get(pt))/* } */,pt)/* } */;
                        }/* } */
                        			}
                        		});
                        }
                        /* } */
                        
                    }
                    	} catch (Throwable tmp169) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp169);
                    	} finally {
                    		x10.lang.Runtime.getCurrentActivity().stopFinish();
                    	}
                    }
                    /* } */
                    
                    
//#line 1844
/* template:array_set { */(sizes).set(/* template:array_get { */((sizes).get(pl))/* } */ +
                      /* template:array_get { */((inLt).get(pl))/* } */,pl)/* } */;
                    
//#line 1845
/* template:array_set { */(offsets).set(/* template:array_get { */((offsets).get(pl))/* } */ -
                      /* template:array_get { */((inLt).get(pl))/* } */,pl)/* } */;
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp162) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp162);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 1847
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1848
/* template:ateach { */
                {
                	x10.lang.dist __var39____distCopy = x10.
                                                       lang.
                                                       dist.
                                                       UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator __var39____ = __var39____distCopy.iterator();
                		 __var39____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var39__ = (x10.
                  lang.
                  point) __var39____.next();
                		/* Join: { */final int pl =
                  /* template:array_get { */((__var39__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var39____distCopy.get(__var39__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int pl =
                  /* template:array_get { */((__var39__).get(0))/* } */;/* } */
{
                    
//#line 1849
if (/* template:array_get { */((outLt).get(pl))/* } */ >
                                        0) {
                        
//#line 1850
final int bsize =
                          /* template:array_get { */((outLt).get(pl))/* } */;
                        
//#line 1851
final x10.
                          lang.
                          region rBuffer =
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
                              bsize -
                                1),
                            rRank2);
                        
//#line 1852
final x10.
                          lang.
                          doubleArray sBuffer =
                          (x10.
                            lang.
                            doubleArray)
                            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(rBuffer.
                                                                                                                                         toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                             	public double apply(/* Join: { */x10.
                               lang.
                               point __var40__/* } */, double dummy) { {
                                 
//#line 1852
final int i =
                                   /* template:array_get { */((__var40__).get(0))/* } */;
                                 
//#line 1852
final int j =
                                   /* template:array_get { */((__var40__).get(1))/* } */;
                                 
//#line 1853
return /* template:array_get { */((srcBuffer).get(/* Join: { */pl,i,j/* } */))/* } */;
                             } }
                             }/* } */,true,false,false)/* } */);
                        
//#line 1855
/* template:Async { */(x10.lang.Runtime.asPlace((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                        prev())).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 1856
/* template:foreach { */
                            for (java.util.Iterator __var41____ = (rBuffer).iterator(); __var41____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var41__ = (x10.
                              lang.
                              point) __var41____.next();
                            	/* Join: { */final int i =
                              /* template:array_get { */((__var41__).get(0))/* } */;
final int j =
                              /* template:array_get { */((__var41__).get(1))/* } */;/* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { */final int i =
                              /* template:array_get { */((__var41__).get(0))/* } */;
final int j =
                              /* template:array_get { */((__var41__).get(1))/* } */;/* } */
{
                                
//#line 1857
/* template:array_set { */(dstBuffer).set(/* template:array_get { */((sBuffer).get(/* Join: { */i,j/* } */))/* } */,/* Join: { */(/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                                                                                                                 id,i,j/* } */)/* } */;
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                            
//#line 1859
/* template:array_set { */(inRt).set(bsize,(/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                       id)/* } */;
                        }
                        		}
                        	});/* } */
                    }
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp170) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp170);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 1863
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1864
/* template:ateach { */
                {
                	x10.lang.dist __var42____distCopy = x10.
                                                       lang.
                                                       dist.
                                                       UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator __var42____ = __var42____distCopy.iterator();
                		 __var42____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var42__ = (x10.
                  lang.
                  point) __var42____.next();
                		/* Join: { */final int pl =
                  /* template:array_get { */((__var42__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var42____distCopy.get(__var42__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int pl =
                  /* template:array_get { */((__var42__).get(0))/* } */;/* } */
{
                    
//#line 1865
/* template:array_set { */(sizes).set(/* template:array_get { */((sizes).get(pl))/* } */ -
                      /* template:array_get { */((outLt).get(pl))/* } */,pl)/* } */;
                    
//#line 1866
/* template:array_set { */(offsets).set(/* template:array_get { */((offsets).get(pl))/* } */ +
                      /* template:array_get { */((outLt).get(pl))/* } */,pl)/* } */;
                    
//#line 1867
if (/* template:array_get { */((sizes).get(pl))/* } */ >
                                        0 &&
                                        /* template:array_get { */((outLt).get(pl))/* } */ >
                                        0) {
                        
//#line 1868
/* template:forloop-mult { */{
                        x10.lang.region __var172__ = (x10.lang.region) x10.
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
                                                                           /* template:array_get { */((sizes).get(pl))/* } */ -
                                                                             1));
                        if (__var172__.size() > 0 && (__var172__ instanceof x10.array.MultiDimRegion || __var172__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var173__ = __var172__.rank(0).low(), __var174__ = __var172__.rank(0).high(); __var173__ <= __var174__; __var173__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i = __var173__;
                        /* } */
                        /* } */
{
                            
//#line 1869
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 1870
/* template:foreach { */
                                for (java.util.Iterator __var44____ = (rRank2).iterator(); __var44____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var44__ = (x10.
                                  lang.
                                  point) __var44____.next();
                                	/* Join: { */final int j =
                                  /* template:array_get { */((__var44__).get(0))/* } */;/* } */
                                	x10.lang.Runtime.here().runAsync
                                		(new x10.runtime.Activity() {
                                			public void runX10Task() {
                                				/* Join: { *//* Join: { */final int j =
                                  /* template:array_get { */((__var44__).get(0))/* } */;/* } */
{
                                    
//#line 1871
/* template:array_set { */(srcBuffer).set(/* template:array_get { */((srcBuffer).get(/* Join: { */pl,i +
                                      /* template:array_get { */((outLt).get(pl))/* } */,j/* } */))/* } */,/* Join: { */pl,i,j/* } */)/* } */;
                                }/* } */
                                			}
                                		});
                                }
                                /* } */
                                
                            }
                            	} catch (Throwable tmp175) {
                            		x10.lang.Runtime.getCurrentActivity().pushException(tmp175);
                            	} finally {
                            		x10.lang.Runtime.getCurrentActivity().stopFinish();
                            	}
                            }
                            /* } */
                            
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var43____ = (__var172__).iterator(); __var43____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var43__ = (x10.
                          lang.
                          point) __var43____.next();
                        	/* Join: { *//* Join: { */final int i =
                          /* template:array_get { */((__var43__).get(0))/* } */;/* } */
{
                            
//#line 1869
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 1870
/* template:foreach { */
                                for (java.util.Iterator __var44____ = (rRank2).iterator(); __var44____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var44__ = (x10.
                                  lang.
                                  point) __var44____.next();
                                	/* Join: { */final int j =
                                  /* template:array_get { */((__var44__).get(0))/* } */;/* } */
                                	x10.lang.Runtime.here().runAsync
                                		(new x10.runtime.Activity() {
                                			public void runX10Task() {
                                				/* Join: { *//* Join: { */final int j =
                                  /* template:array_get { */((__var44__).get(0))/* } */;/* } */
{
                                    
//#line 1871
/* template:array_set { */(srcBuffer).set(/* template:array_get { */((srcBuffer).get(/* Join: { */pl,i +
                                      /* template:array_get { */((outLt).get(pl))/* } */,j/* } */))/* } */,/* Join: { */pl,i,j/* } */)/* } */;
                                }/* } */
                                			}
                                		});
                                }
                                /* } */
                                
                            }
                            	} catch (Throwable tmp176) {
                            		x10.lang.Runtime.getCurrentActivity().pushException(tmp176);
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
                        
                    }
                    
//#line 1875
/* template:array_set { */(outLt).set(X10Util.
                                                                          maxInt(
                                                                          /* template:array_get { */((sizes).get(pl))/* } */ +
                                                                            /* template:array_get { */((inRt).get(pl))/* } */ -
                                                                            MAX_ROWS,
                                                                          0),pl)/* } */;
                    
//#line 1876
if (/* template:array_get { */((outLt).get(pl))/* } */ >
                                        0) {
                        
//#line 1877
/* template:array_set { */(pr).set(X10Util.
                                                                           maxInt(
                                                                           /* template:array_get { */((pr).get(pl))/* } */,
                                                                           /* template:array_get { */((outLt).get(pl))/* } */),pl)/* } */;
                        
//#line 1878
/* template:array_set { */(inRt).set(/* template:array_get { */((inRt).get(pl))/* } */ -
                          /* template:array_get { */((outLt).get(pl))/* } */,pl)/* } */;
                    } else {
                        
//#line 1881
if (/* template:array_get { */((outRt).get(pl))/* } */ >
                                            0) {
                            
                        }
                    }
                    
//#line 1883
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 1884
/* template:foreach { */
                        for (java.util.Iterator __var45____ = (x10.
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
                                                                   /* template:array_get { */((inRt).get(pl))/* } */ -
                                                                     1),
                                                                 rRank2)).iterator(); __var45____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var45__ = (x10.
                          lang.
                          point) __var45____.next();
                        	/* Join: { */final int i =
                          /* template:array_get { */((__var45__).get(0))/* } */;
final int j =
                          /* template:array_get { */((__var45__).get(1))/* } */;/* } */
                        	x10.lang.Runtime.here().runAsync
                        		(new x10.runtime.Activity() {
                        			public void runX10Task() {
                        				/* Join: { *//* Join: { */final int i =
                          /* template:array_get { */((__var45__).get(0))/* } */;
final int j =
                          /* template:array_get { */((__var45__).get(1))/* } */;/* } */
{
                            
//#line 1885
/* template:array_set { */(srcBuffer).set(/* template:array_get { */((dstBuffer).get(/* Join: { */pl,i,j/* } */))/* } */,/* Join: { */pl,i +
                              /* template:array_get { */((sizes).get(pl))/* } */,j/* } */)/* } */;
                        }/* } */
                        			}
                        		});
                        }
                        /* } */
                        
                    }
                    	} catch (Throwable tmp177) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp177);
                    	} finally {
                    		x10.lang.Runtime.getCurrentActivity().stopFinish();
                    	}
                    }
                    /* } */
                    
                    
//#line 1887
/* template:array_set { */(sizes).set(/* template:array_get { */((sizes).get(pl))/* } */ +
                      /* template:array_get { */((inRt).get(pl))/* } */,pl)/* } */;
                    
//#line 1888
final x10.
                      lang.
                      region rLocal1 =
                      X10Util.
                        getLRank2D(
                        dDst,
                        0);
                    
//#line 1889
if (X10Util.
                                        ENABLE_CHECKS &&
                                        rLocal1.
                                          size() ==
                                        0) {
                        
//#line 1890
throw new java.
                          lang.
                          RuntimeException(
                          "Destination distribution " +
                          "is empty");
                    }
                    
//#line 1892
final int rsize =
                      rLocal1.
                        size();
                    
//#line 1893
final int offset =
                      rLocal1.
                        low();
                    
//#line 1894
/* template:array_set { */(ter).set((java.
                                                                         lang.
                                                                         Math.
                                                                         abs(
                                                                         /* template:array_get { */((sizes).get(pl))/* } */ -
                                                                           rsize) +
                                                                         java.
                                                                           lang.
                                                                           Math.
                                                                           abs(
                                                                           /* template:array_get { */((offsets).get(pl))/* } */ -
                                                                             offset)),pl)/* } */;
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp171) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp171);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 1896
int ierr =
              0;
            
//#line 1897
if (iter <=
                                mter) {
                
//#line 1898
if (pr.
                                    max() !=
                                    0) {
                    
//#line 1899
ierr =
                      pr.
                        max();
                    
//#line 1900
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                  lang.
                                                                                                                  System.
                                                                                                                  err))/* } */.println("Local field overflow error, " +
                                                                                                                                       "ierr = " +
                                                                                                                                       ierr);
                    
//#line 1901
break;
                }
                
//#line 1903
if (iter <
                                    mter) {
                    
//#line 1904
continue;
                } else {
                    
//#line 1907
break;
                }
            }
            
//#line 1910
if (iter >
                                10) {
                
//#line 1911
throw new java.
                  lang.
                  RuntimeException(
                  "Too many iterations");
            }
            
//#line 1913
final x10.
              lang.
              dist dFlags =
              x10.
                lang.
                dist.
                factory.
                constant(
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
                    1)),
                /* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 1914
final x10.
              lang.
              IntReferenceArray flags =
              /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dFlags,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
            
//#line 1915
/* template:array_set { */(flags).set(pr.
                                                                  max(),0)/* } */;
            
//#line 1916
/* template:array_set { */(flags).set(ter.
                                                                  max(),1)/* } */;
            
//#line 1917
if (/* template:array_get { */((flags).get(0))/* } */ !=
                                0) {
                
//#line 1918
ierr =
                  /* template:array_get { */((flags).get(0))/* } */;
                
//#line 1919
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                              lang.
                                                                                                              System.
                                                                                                              err))/* } */.println("Global field overflow error, " +
                                                                                                                                   "ierr = " +
                                                                                                                                   ierr);
                
//#line 1920
break;
            }
            
//#line 1922
if (/* template:array_get { */((flags).get(1))/* } */ !=
                                0) {
                
//#line 1923
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                              lang.
                                                                                                              System.
                                                                                                              err))/* } */.println("Info: fields being passed " +
                                                                                                                                   "further = " +
                                                                                                                                   /* template:array_get { */((flags).get(1))/* } */);
            } else {
                
//#line 1926
mter =
                  iter;
                
//#line 1927
break;
            }
        }while(!done); 
        
//#line 1930
final x10.
          lang.
          DoubleReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dDst,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 1931
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1932
/* template:ateach { */
            {
            	x10.lang.dist __var46____distCopy = x10.
                                                   lang.
                                                   dist.
                                                   UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator __var46____ = __var46____distCopy.iterator();
            		 __var46____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var46__ = (x10.
              lang.
              point) __var46____.next();
            		/* Join: { */final int pl =
              /* template:array_get { */((__var46__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var46____distCopy.get(__var46__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int pl =
              /* template:array_get { */((__var46__).get(0))/* } */;/* } */
{
                
//#line 1933
final x10.
                  lang.
                  region rLocal1 =
                  X10Util.
                    getLRank2D(
                    dDst,
                    0);
                
//#line 1934
if (X10Util.
                                    ENABLE_CHECKS) {
                    
//#line 1935
if (/* template:array_get { */((sizes).get(pl))/* } */ <=
                                        0) {
                        
//#line 1936
throw new java.
                          lang.
                          RuntimeException(
                          "Cannot make non-existant " +
                          "region");
                    }
                    
//#line 1938
if (/* template:array_get { */((sizes).get(pl))/* } */ !=
                                        rLocal1.
                                          size() ||
                                        /* template:array_get { */((offsets).get(pl))/* } */ !=
                                        rLocal1.
                                          low()) {
                        
//#line 1939
throw new java.
                          lang.
                          RuntimeException(
                          "Regions don\'t match result " +
                          "dist");
                    }
                }
                
//#line 1942
/* template:foreach { */
                for (java.util.Iterator __var47____ = (x10.
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
                                                           /* template:array_get { */((sizes).get(pl))/* } */ -
                                                             1),
                                                         rRank2)).iterator(); __var47____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var47__ = (x10.
                  lang.
                  point) __var47____.next();
                	/* Join: { */final int i =
                  /* template:array_get { */((__var47__).get(0))/* } */;
final int j =
                  /* template:array_get { */((__var47__).get(1))/* } */;/* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var47__).get(0))/* } */;
final int j =
                  /* template:array_get { */((__var47__).get(1))/* } */;/* } */
{
                    
//#line 1943
/* template:array_set { */(result).set(/* template:array_get { */((srcBuffer).get(/* Join: { */pl,i,j/* } */))/* } */,/* Join: { *//* template:array_get { */((offsets).get(pl))/* } */ +
                      i,j/* } */)/* } */;
                }/* } */
                			}
                		});
                }
                /* } */
                
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp178) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp178);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1946
return result;
    }
    
    
//#line 1948
public x10.
                    lang.
                    DoubleReferenceArray
                    cropField(
                    final x10.
                      lang.
                      DoubleReferenceArray data,
                    final x10.
                      lang.
                      DoubleReferenceArray guards) {
        
//#line 1949
final x10.
          lang.
          region rRank1 =
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
              YLENGTH -
                1));
        
//#line 1950
final x10.
          lang.
          region rRank2 =
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
              XLENGTH));
        
//#line 1951
final x10.
          lang.
          dist dGuard =
          guards.
            distribution;
        
//#line 1952
final x10.
          lang.
          region rGuard =
          X10Util.
            get2DPRegion(
            dGuard,
            x10.
              lang.
              place.
              places(
              x10.
                lang.
                place.
                MAX_PLACES -
                1));
        
//#line 1953
final x10.
          lang.
          dist dResult =
          X10Util.
            distBlockStar2(
            rRank1,
            rRank2);
        
//#line 1954
final x10.
          lang.
          DoubleReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dResult,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 1955
/* template:forloop { */
        for (java.util.Iterator pl__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pl__.hasNext(); ) {
        	final  x10.
          lang.
          point pl = (x10.
          lang.
          point) pl__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 1956
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1957
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                                lang.
                                                                                dist.
                                                                                UNIQUE.
                                                                                get(
                                                                                pl))).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1958
final x10.
                      lang.
                      dist dData =
                      data.
                        distribution;
                    
//#line 1959
final x10.
                      lang.
                      region rLocalS =
                      X10Util.
                        get2DLRegion(
                        dData);
                    
//#line 1960
final x10.
                      lang.
                      region rLocalS1 =
                      X10Util.
                        getRank2D(
                        rLocalS,
                        0);
                    
//#line 1961
if (rLocalS.
                                        size() >
                                        0 &&
                                        rLocalS1.
                                          low() <
                                        YLENGTH) {
                        
//#line 1962
final x10.
                          lang.
                          place pDst1 =
                          x10.
                            lang.
                            place.
                            places(
                            2 *
                              /* template:array_get { */((pl).get(0))/* } */);
                        
//#line 1963
final x10.
                          lang.
                          place pDst2 =
                          x10.
                            lang.
                            place.
                            places(
                            2 *
                              /* template:array_get { */((pl).get(0))/* } */ +
                              1);
                        
//#line 1964
final x10.
                          lang.
                          doubleArray sBuffer =
                          (x10.
                            lang.
                            doubleArray)
                            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(rLocalS.
                                                                                                                                         toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                             	public double apply(/* Join: { */x10.
                               lang.
                               point pt/* } */, double dummy) { {
                                 
//#line 1965
return /* template:array_get { */((data).get(pt))/* } */;
                             } }
                             }/* } */,true,false,false)/* } */);
                        
//#line 1967
/* template:Async { */(x10.lang.Runtime.asPlace(pDst1)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 1968
final x10.
                              lang.
                              region rLocalD =
                              X10Util.
                                get2DLRegion(
                                dResult);
                            
//#line 1969
/* template:foreach { */
                            for (java.util.Iterator pt__ = (rLocalD).iterator(); pt__.hasNext(); ) {
                            	final  x10.
                              lang.
                              point pt = (x10.
                              lang.
                              point) pt__.next();
                            	/* Join: { *//* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { *//* } */
{
                                
//#line 1970
/* template:array_set { */(result).set(/* template:array_get { */((sBuffer).get(pt))/* } */,pt)/* } */;
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                        }
                        		}
                        	});/* } */
                        
//#line 1973
/* template:Async { */(x10.lang.Runtime.asPlace(pDst2)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 1974
final x10.
                              lang.
                              region rLocalD =
                              X10Util.
                                get2DLRegion(
                                dResult);
                            
//#line 1975
/* template:foreach { */
                            for (java.util.Iterator pt__ = (rLocalD).iterator(); pt__.hasNext(); ) {
                            	final  x10.
                              lang.
                              point pt = (x10.
                              lang.
                              point) pt__.next();
                            	/* Join: { *//* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { *//* } */
{
                                
//#line 1976
/* template:array_set { */(result).set(/* template:array_get { */((sBuffer).get(pt))/* } */,pt)/* } */;
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                        }
                        		}
                        	});/* } */
                    }
                    
//#line 1980
if (rLocalS1.
                                        contains(
                                        x10.
                                          lang.
                                          point.
                                          factory.
                                          point(
                                          YLENGTH))) {
                        
//#line 1981
final x10.
                          lang.
                          doubleArray sBuffer =
                          (x10.
                            lang.
                            doubleArray)
                            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(rGuard.
                                                                                                                                         toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                             	public double apply(/* Join: { */x10.
                               lang.
                               point pt/* } */, double dummy) { {
                                 
//#line 1982
return /* template:array_get { */((data).get(pt))/* } */;
                             } }
                             }/* } */,true,false,false)/* } */);
                        
//#line 1984
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                                        lang.
                                                                                        place.
                                                                                        places(
                                                                                        x10.
                                                                                          lang.
                                                                                          place.
                                                                                          MAX_PLACES -
                                                                                          1))).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 1985
/* template:foreach { */
                            for (java.util.Iterator pt__ = (rGuard).iterator(); pt__.hasNext(); ) {
                            	final  x10.
                              lang.
                              point pt = (x10.
                              lang.
                              point) pt__.next();
                            	/* Join: { *//* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { *//* } */
{
                                
//#line 1986
/* template:array_set { */(guards).set(/* template:array_get { */((sBuffer).get(pt))/* } */,pt)/* } */;
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                        }
                        		}
                        	});/* } */
                    }
                }
                		}
                	});/* } */
            }
            	} catch (Throwable tmp179) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp179);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
        
//#line 1991
return result;
    }
    
    
//#line 1993
public void
                    loadGuards(
                    final x10.
                      lang.
                      DoubleReferenceArray data,
                    final x10.
                      lang.
                      DoubleReferenceArray guards) {
        
//#line 1994
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1995
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 1996
if (!(/* template:here { */x10.lang.Runtime.here()/* } */).
                                     isFirst()) {
                    
//#line 1997
final x10.
                      lang.
                      dist dGuard =
                      guards.
                        distribution;
                    
//#line 1998
final x10.
                      lang.
                      region rGuard =
                      X10Util.
                        get2DPRegion(
                        dGuard,
                        (/* template:here { */x10.lang.Runtime.here()/* } */).
                          prev());
                    
//#line 1999
final x10.
                      lang.
                      doubleArray sBuffer =
                      (x10.
                        lang.
                        doubleArray)
                        (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(rGuard.
                                                                                                                                     toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                         	public double apply(/* Join: { */x10.
                           lang.
                           point pt/* } */, double dummy) { {
                             
//#line 2000
return /* template:array_get { */((data).get(pt))/* } */;
                         } }
                         }/* } */,true,false,false)/* } */);
                    
//#line 2002
/* template:Async { */(x10.lang.Runtime.asPlace((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                    prev())).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 2003
/* template:foreach { */
                        for (java.util.Iterator pt__ = (rGuard).iterator(); pt__.hasNext(); ) {
                        	final  x10.
                          lang.
                          point pt = (x10.
                          lang.
                          point) pt__.next();
                        	/* Join: { *//* } */
                        	x10.lang.Runtime.here().runAsync
                        		(new x10.runtime.Activity() {
                        			public void runX10Task() {
                        				/* Join: { *//* Join: { *//* } */
{
                            
//#line 2004
/* template:array_set { */(guards).set(/* template:array_get { */((sBuffer).get(pt))/* } */,pt)/* } */;
                        }/* } */
                        			}
                        		});
                        }
                        /* } */
                        
                    }
                    		}
                    	});/* } */
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp180) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp180);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 2010
public x10.
                    lang.
                    IntReferenceArray
                    makeInfoArray(
                    ) {
        
//#line 2011
final x10.
          lang.
          dist dInfo =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
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
                    6)),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 2012
return /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dInfo,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2013
return 0;
        } }
        }/* } */,true,true,false)/* } */;
    }
    
    
//#line 2016
public x10.
                    lang.
                    GenericReferenceArray
                    moveParticles(
                    final x10.
                      lang.
                      GenericReferenceArray particles,
                    final x10.
                      lang.
                      dist dFieldSpace,
                    final x10.
                      lang.
                      IntReferenceArray info) {
        
//#line 2017
final int MAX =
          MOVE_PARTICLES_MAX;
        
//#line 2018
final int MAX_BUFFER =
          MOVE_PARTICLES_MAX_BUFFER;
        
//#line 2019
final int ITER_MAX =
          20;
        
//#line 2020
final x10.
          lang.
          region rPart =
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
              MAX -
                1));
        
//#line 2021
final x10.
          lang.
          region rBuffer =
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
              MAX_BUFFER -
                1));
        
//#line 2022
final x10.
          lang.
          dist dUnique =
          (x10.
            lang.
            dist)
            x10.
              lang.
              dist.
              UNIQUE;
        
//#line 2023
final x10.
          lang.
          dist dPart =
          X10Util.
            extendDistRank2D(
            dUnique,
            rPart);
        
//#line 2024
final x10.
          lang.
          dist dBuffer =
          X10Util.
            extendDistRank2D(
            dUnique,
            rBuffer);
        
//#line 2025
final x10.
          lang.
          GenericReferenceArray part =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dPart,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 2026
final x10.
          lang.
          GenericReferenceArray sBufferL =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dBuffer,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 2027
final x10.
          lang.
          GenericReferenceArray sBufferR =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dBuffer,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 2028
final x10.
          lang.
          GenericReferenceArray rBufferL =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dBuffer,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 2029
final x10.
          lang.
          GenericReferenceArray rBufferR =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dBuffer,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 2030
final x10.
          lang.
          IntReferenceArray inLt =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2031
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2033
final x10.
          lang.
          IntReferenceArray inRt =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2034
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2036
final x10.
          lang.
          IntReferenceArray outLt =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2037
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2039
final x10.
          lang.
          IntReferenceArray outRt =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2040
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2042
final x10.
          lang.
          IntReferenceArray nPart =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2043
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2045
x10.
          lang.
          IntReferenceArray nPartOld =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2046
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2048
final x10.
          lang.
          IntReferenceArray holes =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dPart,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2049
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2051
final x10.
          lang.
          dist dFlags =
          x10.
            lang.
            dist.
            factory.
            constant(
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
                3)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 2052
final x10.
          lang.
          IntReferenceArray nSent =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2053
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2055
final x10.
          lang.
          IntReferenceArray ibflg =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dFlags,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2056
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2058
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2059
/* template:ateach { */
            {
            	x10.lang.dist __var48____distCopy = x10.
                                                   lang.
                                                   dist.
                                                   UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator __var48____ = __var48____distCopy.iterator();
            		 __var48____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var48__ = (x10.
              lang.
              point) __var48____.next();
            		/* Join: { */final int pl =
              /* template:array_get { */((__var48__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var48____distCopy.get(__var48__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int pl =
              /* template:array_get { */((__var48__).get(0))/* } */;/* } */
{
                
//#line 2060
final x10.
                  lang.
                  region rLocal =
                  (x10.
                    lang.
                    region)
                    ((particles.
                        distribution.
                        restriction(
                        /* template:here { */x10.lang.Runtime.here()/* } */))).
                      region;
                
//#line 2061
if (rLocal.
                                    size() >
                                    0) {
                    
//#line 2062
final int offset =
                      rLocal.
                        low();
                    
//#line 2063
/* template:foreach { */
                    for (java.util.Iterator __var49____ = (rLocal).iterator(); __var49____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var49__ = (x10.
                      lang.
                      point) __var49____.next();
                    	/* Join: { */final int i =
                      /* template:array_get { */((__var49__).get(0))/* } */;/* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var49__).get(0))/* } */;/* } */
{
                        
//#line 2064
/* template:array_set { */(part).set(/* template:parametric { */((Particle)(/* template:array_get { */((particles).get(i))/* } */))/* } */,/* Join: { */pl,i -
                          offset/* } */)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                }
                
//#line 2067
/* template:array_set { */(nPart).set(rLocal.
                                                                      size(),pl)/* } */;
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp181) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp181);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2069
final x10.
          lang.
          region rFieldSpace =
          dFieldSpace.
            region;
        
//#line 2070
final double rsize =
          X10Util.
            getRank2D(
            rFieldSpace,
            1).
            size();
        
//#line 2071
int iter =
          2;
        
//#line 2072
int nter =
          0;
        
//#line 2073
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2074
/* template:foreach { */
            for (java.util.Iterator pt__ = (x10.
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
                                                6))).iterator(); pt__.hasNext(); ) {
            	final  x10.
              lang.
              point pt = (x10.
              lang.
              point) pt__.next();
            	/* Join: { *//* } */
            	x10.lang.Runtime.here().runAsync
            		(new x10.runtime.Activity() {
            			public void runX10Task() {
            				/* Join: { *//* Join: { *//* } */
{
                
//#line 2075
/* template:array_set { */(info).set(0,pt)/* } */;
            }/* } */
            			}
            		});
            }
            /* } */
            
        }
        	} catch (Throwable tmp182) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp182);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2077
nPartOld =
          nPartOld.
            add(
            nPart);
        
//#line 2078
boolean doneInner =
          false;
        
//#line 2079
boolean doneOuter =
          false;
        
//#line 2080
do  {
            
//#line 2081
int mter =
              0;
            
//#line 2082
final x10.
              lang.
              IntReferenceArray overflow =
              /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
            	public int apply(/* Join: { */x10.
              lang.
              point pt/* } */, int dummy) { {
                
//#line 2083
return 0;
            } }
            }/* } */,true,true,false)/* } */;
            
//#line 2085
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 2086
/* template:ateach { */
                {
                	x10.lang.dist __var50____distCopy = x10.
                                                       lang.
                                                       dist.
                                                       UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator __var50____ = __var50____distCopy.iterator();
                		 __var50____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var50__ = (x10.
                  lang.
                  point) __var50____.next();
                		/* Join: { */final int pl =
                  /* template:array_get { */((__var50__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var50____distCopy.get(__var50__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int pl =
                  /* template:array_get { */((__var50__).get(0))/* } */;/* } */
{
                    
//#line 2087
final x10.
                      lang.
                      region rLocal =
                      (x10.
                        lang.
                        region)
                        ((dFieldSpace.
                            restriction(
                            /* template:here { */x10.lang.Runtime.here()/* } */))).
                          region;
                    
//#line 2088
final x10.
                      lang.
                      region rLocal1 =
                      X10Util.
                        getRank2D(
                        rLocal,
                        0);
                    
//#line 2089
final double ub =
                      rLocal1.
                        high() +
                      1;
                    
//#line 2090
final double lb =
                      rLocal1.
                        low();
                    
//#line 2091
/* template:array_set { */(outLt).set(0,pl)/* } */;
                    
//#line 2092
/* template:array_set { */(outRt).set(0,pl)/* } */;
                    
//#line 2093
/* template:forloop-mult { */{
                    x10.lang.region __var184__ = (x10.lang.region) x10.
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
                                                                       /* template:array_get { */((nPart).get(pl))/* } */ -
                                                                         1));
                    if (__var184__.size() > 0 && (__var184__ instanceof x10.array.MultiDimRegion || __var184__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var185__ = __var184__.rank(0).low(), __var186__ = __var184__.rank(0).high(); __var185__ <= __var186__; __var185__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int i = __var185__;
                    /* } */
                    /* } */
{
                        
//#line 2094
final Particle p =
                          /* template:parametric { */((Particle)(/* template:array_get { */((part).get(/* Join: { */pl,i/* } */))/* } */))/* } */;
                        
//#line 2095
double y =
                          p.
                            getY();
                        
//#line 2096
if (y <
                                            lb) {
                            
//#line 2097
if (/* template:array_get { */((outLt).get(pl))/* } */ <
                                                rBuffer.
                                                  size()) {
                                
//#line 2098
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                    isFirst()) {
                                    
//#line 2099
y =
                                      y +
                                        rsize;
                                }
                                
//#line 2101
/* template:array_set { */(sBufferL).set(p.
                                                                                         setY(
                                                                                         y),/* Join: { */pl,/* template:array_get { */((outLt).get(pl))/* } *//* } */)/* } */;
                                
//#line 2102
/* template:array_set { */(holes).set(i,/* Join: { */pl,/* template:array_get { */((outLt).get(pl))/* } */ +
                                  /* template:array_get { */((outRt).get(pl))/* } *//* } */)/* } */;
                                
//#line 2103
/* template:array_unary { */(outLt).postInc(pl)/* } */;
                            } else {
                                
//#line 2106
/* template:array_set { */(overflow).set(1,pl)/* } */;
                                
//#line 2107
break;
                            }
                        } else {
                            
//#line 2111
if (y >=
                                                ub) {
                                
//#line 2112
if (/* template:array_get { */((outRt).get(pl))/* } */ <
                                                    rBuffer.
                                                      size()) {
                                    
//#line 2113
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                        isLast()) {
                                        
//#line 2114
y =
                                          y -
                                            rsize;
                                    }
                                    
//#line 2116
/* template:array_set { */(sBufferR).set(p.
                                                                                             setY(
                                                                                             y),/* Join: { */pl,/* template:array_get { */((outRt).get(pl))/* } *//* } */)/* } */;
                                    
//#line 2117
/* template:array_set { */(holes).set(i,/* Join: { */pl,/* template:array_get { */((outLt).get(pl))/* } */ +
                                      /* template:array_get { */((outRt).get(pl))/* } *//* } */)/* } */;
                                    
//#line 2118
/* template:array_unary { */(outRt).postInc(pl)/* } */;
                                } else {
                                    
//#line 2121
/* template:array_set { */(overflow).set(1,pl)/* } */;
                                    
//#line 2122
break;
                                }
                            }
                        }
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var51____ = (__var184__).iterator(); __var51____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var51__ = (x10.
                      lang.
                      point) __var51____.next();
                    	/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var51__).get(0))/* } */;/* } */
{
                        
//#line 2094
final Particle p =
                          /* template:parametric { */((Particle)(/* template:array_get { */((part).get(/* Join: { */pl,i/* } */))/* } */))/* } */;
                        
//#line 2095
double y =
                          p.
                            getY();
                        
//#line 2096
if (y <
                                            lb) {
                            
//#line 2097
if (/* template:array_get { */((outLt).get(pl))/* } */ <
                                                rBuffer.
                                                  size()) {
                                
//#line 2098
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                    isFirst()) {
                                    
//#line 2099
y =
                                      y +
                                        rsize;
                                }
                                
//#line 2101
/* template:array_set { */(sBufferL).set(p.
                                                                                         setY(
                                                                                         y),/* Join: { */pl,/* template:array_get { */((outLt).get(pl))/* } *//* } */)/* } */;
                                
//#line 2102
/* template:array_set { */(holes).set(i,/* Join: { */pl,/* template:array_get { */((outLt).get(pl))/* } */ +
                                  /* template:array_get { */((outRt).get(pl))/* } *//* } */)/* } */;
                                
//#line 2103
/* template:array_unary { */(outLt).postInc(pl)/* } */;
                            } else {
                                
//#line 2106
/* template:array_set { */(overflow).set(1,pl)/* } */;
                                
//#line 2107
break;
                            }
                        } else {
                            
//#line 2111
if (y >=
                                                ub) {
                                
//#line 2112
if (/* template:array_get { */((outRt).get(pl))/* } */ <
                                                    rBuffer.
                                                      size()) {
                                    
//#line 2113
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                        isLast()) {
                                        
//#line 2114
y =
                                          y -
                                            rsize;
                                    }
                                    
//#line 2116
/* template:array_set { */(sBufferR).set(p.
                                                                                             setY(
                                                                                             y),/* Join: { */pl,/* template:array_get { */((outRt).get(pl))/* } *//* } */)/* } */;
                                    
//#line 2117
/* template:array_set { */(holes).set(i,/* Join: { */pl,/* template:array_get { */((outLt).get(pl))/* } */ +
                                      /* template:array_get { */((outRt).get(pl))/* } *//* } */)/* } */;
                                    
//#line 2118
/* template:array_unary { */(outRt).postInc(pl)/* } */;
                                } else {
                                    
//#line 2121
/* template:array_set { */(overflow).set(1,pl)/* } */;
                                    
//#line 2122
break;
                                }
                            }
                        }
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                    
//#line 2126
/* template:array_set { */(nSent).set(/* template:array_get { */((outLt).get(pl))/* } */ +
                      /* template:array_get { */((outRt).get(pl))/* } */,pl)/* } */;
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp183) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp183);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 2128
/* template:array_set { */(ibflg).set(overflow.
                                                                  max(),2)/* } */;
            
//#line 2129
do  {
                
//#line 2130
iter =
                  iter +
                    2;
                
//#line 2131
mter =
                  mter +
                    1;
                
//#line 2132
transferParticles(
                                sBufferL,
                                sBufferR,
                                outLt,
                                outRt,
                                rBufferL,
                                rBufferR,
                                inLt,
                                inRt);
                
//#line 2133
final x10.
                  lang.
                  IntReferenceArray outgoing =
                  /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
                
//#line 2134
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 2135
/* template:ateach { */
                    {
                    	x10.lang.dist __var52____distCopy = x10.
                                                           lang.
                                                           dist.
                                                           UNIQUE; // make copy to avoid recomputation
                    	for (java.util.Iterator __var52____ = __var52____distCopy.iterator();
                    		 __var52____.hasNext(); )
                    	{
                    		final  x10.
                      lang.
                      point __var52__ = (x10.
                      lang.
                      point) __var52____.next();
                    		/* Join: { */final int pl =
                      /* template:array_get { */((__var52__).get(0))/* } */;/* } */
                    		((x10.runtime.Place) __var52____distCopy.get(__var52__)).runAsync
                    			(new x10.runtime.Activity() {
                    				public void runX10Task() {
                    					/* Join: { *//* Join: { */final int pl =
                      /* template:array_get { */((__var52__).get(0))/* } */;/* } */
{
                        
//#line 2136
final x10.
                          lang.
                          region rLocal =
                          (x10.
                            lang.
                            region)
                            ((dFieldSpace.
                                restriction(
                                /* template:here { */x10.lang.Runtime.here()/* } */))).
                              region;
                        
//#line 2137
final x10.
                          lang.
                          region rLocal1 =
                          X10Util.
                            getRank2D(
                            rLocal,
                            0);
                        
//#line 2138
final double ub =
                          rLocal1.
                            high() +
                          1;
                        
//#line 2139
final double lb =
                          rLocal1.
                            low();
                        
//#line 2140
/* template:array_set { */(outLt).set(0,pl)/* } */;
                        
//#line 2141
/* template:array_set { */(outRt).set(0,pl)/* } */;
                        
//#line 2142
int belowLeft =
                          0;
                        
//#line 2143
/* template:forloop-mult { */{
                        x10.lang.region __var188__ = (x10.lang.region) x10.
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
                                                                           /* template:array_get { */((inRt).get(pl))/* } */ -
                                                                             1));
                        if (__var188__.size() > 0 && (__var188__ instanceof x10.array.MultiDimRegion || __var188__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var189__ = __var188__.rank(0).low(), __var190__ = __var188__.rank(0).high(); __var189__ <= __var190__; __var189__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i = __var189__;
                        /* } */
                        /* } */
{
                            
//#line 2144
final Particle p =
                              /* template:parametric { */((Particle)(/* template:array_get { */((rBufferR).get(/* Join: { */pl,i/* } */))/* } */))/* } */;
                            
//#line 2145
final double y =
                              p.
                                getY();
                            
//#line 2146
if (y <
                                                lb) {
                                
//#line 2147
/* template:array_unary { */(outLt).postInc(pl)/* } */;
                            }
                            
//#line 2149
if (y >=
                                                ub) {
                                
//#line 2150
/* template:array_unary { */(outRt).postInc(pl)/* } */;
                            }
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var53____ = (__var188__).iterator(); __var53____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var53__ = (x10.
                          lang.
                          point) __var53____.next();
                        	/* Join: { *//* Join: { */final int i =
                          /* template:array_get { */((__var53__).get(0))/* } */;/* } */
{
                            
//#line 2144
final Particle p =
                              /* template:parametric { */((Particle)(/* template:array_get { */((rBufferR).get(/* Join: { */pl,i/* } */))/* } */))/* } */;
                            
//#line 2145
final double y =
                              p.
                                getY();
                            
//#line 2146
if (y <
                                                lb) {
                                
//#line 2147
/* template:array_unary { */(outLt).postInc(pl)/* } */;
                            }
                            
//#line 2149
if (y >=
                                                ub) {
                                
//#line 2150
/* template:array_unary { */(outRt).postInc(pl)/* } */;
                            }
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
                        
//#line 2153
if (/* template:array_get { */((outRt).get(pl))/* } */ !=
                                            0) {
                            
//#line 2154
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                          lang.
                                                                                                                          System.
                                                                                                                          err))/* } */.println("Info: particles returning up");
                        }
                        
//#line 2156
/* template:forloop-mult { */{
                        x10.lang.region __var191__ = (x10.lang.region) x10.
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
                                                                           /* template:array_get { */((inLt).get(pl))/* } */ -
                                                                             1));
                        if (__var191__.size() > 0 && (__var191__ instanceof x10.array.MultiDimRegion || __var191__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var192__ = __var191__.rank(0).low(), __var193__ = __var191__.rank(0).high(); __var192__ <= __var193__; __var192__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i = __var192__;
                        /* } */
                        /* } */
{
                            
//#line 2157
final Particle p =
                              /* template:parametric { */((Particle)(/* template:array_get { */((rBufferL).get(/* Join: { */pl,i/* } */))/* } */))/* } */;
                            
//#line 2158
final double y =
                              p.
                                getY();
                            
//#line 2159
if (y >=
                                                ub) {
                                
//#line 2160
/* template:array_unary { */(outRt).postInc(pl)/* } */;
                            }
                            
//#line 2162
if (y <
                                                lb) {
                                
//#line 2163
belowLeft++;
                            }
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var54____ = (__var191__).iterator(); __var54____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var54__ = (x10.
                          lang.
                          point) __var54____.next();
                        	/* Join: { *//* Join: { */final int i =
                          /* template:array_get { */((__var54__).get(0))/* } */;/* } */
{
                            
//#line 2157
final Particle p =
                              /* template:parametric { */((Particle)(/* template:array_get { */((rBufferL).get(/* Join: { */pl,i/* } */))/* } */))/* } */;
                            
//#line 2158
final double y =
                              p.
                                getY();
                            
//#line 2159
if (y >=
                                                ub) {
                                
//#line 2160
/* template:array_unary { */(outRt).postInc(pl)/* } */;
                            }
                            
//#line 2162
if (y <
                                                lb) {
                                
//#line 2163
belowLeft++;
                            }
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
                        
//#line 2166
if (belowLeft !=
                                            0) {
                            
//#line 2167
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                          lang.
                                                                                                                          System.
                                                                                                                          err))/* } */.println("Info: particles returning down");
                        }
                        
//#line 2169
/* template:array_set { */(outLt).set(/* template:array_get { */((outLt).get(pl))/* } */ +
                          belowLeft,pl)/* } */;
                        
//#line 2170
/* template:array_set { */(outgoing).set(/* template:array_get { */((outLt).get(pl))/* } */ +
                          /* template:array_get { */((outRt).get(pl))/* } */,pl)/* } */;
                    }/* } */
                    				}
                    			});
                    	}
                    }
                    /* } */
                    
                }
                	} catch (Throwable tmp187) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp187);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 2172
/* template:array_set { */(ibflg).set(outgoing.
                                                                      max(),1)/* } */;
                
//#line 2173
if (/* template:array_get { */((ibflg).get(1))/* } */ !=
                                    0) {
                    
//#line 2174
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 2175
/* template:ateach { */
                        {
                        	x10.lang.dist __var55____distCopy = x10.
                                                               lang.
                                                               dist.
                                                               UNIQUE; // make copy to avoid recomputation
                        	for (java.util.Iterator __var55____ = __var55____distCopy.iterator();
                        		 __var55____.hasNext(); )
                        	{
                        		final  x10.
                          lang.
                          point __var55__ = (x10.
                          lang.
                          point) __var55____.next();
                        		/* Join: { */final int pl =
                          /* template:array_get { */((__var55__).get(0))/* } */;/* } */
                        		((x10.runtime.Place) __var55____distCopy.get(__var55__)).runAsync
                        			(new x10.runtime.Activity() {
                        				public void runX10Task() {
                        					/* Join: { *//* Join: { */final int pl =
                          /* template:array_get { */((__var55__).get(0))/* } */;/* } */
{
                            
//#line 2176
final x10.
                              lang.
                              region rLocal =
                              (x10.
                                lang.
                                region)
                                ((dFieldSpace.
                                    restriction(
                                    /* template:here { */x10.lang.Runtime.here()/* } */))).
                                  region;
                            
//#line 2177
final x10.
                              lang.
                              region rLocal1 =
                              X10Util.
                                getRank2D(
                                rLocal,
                                0);
                            
//#line 2178
final double ub =
                              rLocal1.
                                high() +
                              1;
                            
//#line 2179
final double lb =
                              rLocal1.
                                low();
                            
//#line 2180
/* template:array_set { */(outLt).set(0,pl)/* } */;
                            
//#line 2181
/* template:array_set { */(outRt).set(0,pl)/* } */;
                            
//#line 2182
/* template:array_set { */(overflow).set(0,pl)/* } */;
                            
//#line 2183
int inRightStaying =
                              0;
                            
//#line 2184
/* template:forloop-mult { */{
                            x10.lang.region __var195__ = (x10.lang.region) x10.
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
                                                                               /* template:array_get { */((inRt).get(pl))/* } */ -
                                                                                 1));
                            if (__var195__.size() > 0 && (__var195__ instanceof x10.array.MultiDimRegion || __var195__ instanceof x10.array.ContiguousRange)) {
                            	/* Loop: { *//* template:forloop-mult-each { */
                            for (int __var196__ = __var195__.rank(0).low(), __var197__ = __var195__.rank(0).high(); __var196__ <= __var197__; __var196__++)
                            /* } */
                            /* } */ {
                            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                            final int i = __var196__;
                            /* } */
                            /* } */
{
                                
//#line 2185
final Particle p =
                                  /* template:parametric { */((Particle)(/* template:array_get { */((rBufferR).get(/* Join: { */pl,i/* } */))/* } */))/* } */;
                                
//#line 2186
double y =
                                  p.
                                    getY();
                                
//#line 2187
if (y <
                                                    lb) {
                                    
//#line 2188
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                        isFirst()) {
                                        
//#line 2189
y =
                                          y +
                                            rsize;
                                    }
                                    
//#line 2191
/* template:array_set { */(sBufferL).set(p.
                                                                                             setY(
                                                                                             y),/* Join: { */pl,/* template:array_get { */((outLt).get(pl))/* } *//* } */)/* } */;
                                    
//#line 2192
/* template:array_unary { */(outLt).postInc(pl)/* } */;
                                } else {
                                    
//#line 2195
if (y >=
                                                        ub) {
                                        
//#line 2196
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                                      lang.
                                                                                                                                      System.
                                                                                                                                      err))/* } */.println("Particle returning up -- " +
                                                                                                                                                           "should not happen: " +
                                                                                                                                                           p.
                                                                                                                                                             toString());
                                        
//#line 2197
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                            isLast()) {
                                            
//#line 2198
y =
                                              y -
                                                rsize;
                                        }
                                        
//#line 2200
/* template:array_set { */(sBufferR).set(p.
                                                                                                 setY(
                                                                                                 y),/* Join: { */pl,/* template:array_get { */((outRt).get(pl))/* } *//* } */)/* } */;
                                        
//#line 2201
/* template:array_unary { */(outRt).postInc(pl)/* } */;
                                    } else {
                                        
//#line 2204
/* template:array_set { */(rBufferR).set(p,/* Join: { */pl,inRightStaying/* } */)/* } */;
                                        
//#line 2205
inRightStaying++;
                                    }
                                }
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var56____ = (__var195__).iterator(); __var56____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var56__ = (x10.
                              lang.
                              point) __var56____.next();
                            	/* Join: { *//* Join: { */final int i =
                              /* template:array_get { */((__var56__).get(0))/* } */;/* } */
{
                                
//#line 2185
final Particle p =
                                  /* template:parametric { */((Particle)(/* template:array_get { */((rBufferR).get(/* Join: { */pl,i/* } */))/* } */))/* } */;
                                
//#line 2186
double y =
                                  p.
                                    getY();
                                
//#line 2187
if (y <
                                                    lb) {
                                    
//#line 2188
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                        isFirst()) {
                                        
//#line 2189
y =
                                          y +
                                            rsize;
                                    }
                                    
//#line 2191
/* template:array_set { */(sBufferL).set(p.
                                                                                             setY(
                                                                                             y),/* Join: { */pl,/* template:array_get { */((outLt).get(pl))/* } *//* } */)/* } */;
                                    
//#line 2192
/* template:array_unary { */(outLt).postInc(pl)/* } */;
                                } else {
                                    
//#line 2195
if (y >=
                                                        ub) {
                                        
//#line 2196
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                                      lang.
                                                                                                                                      System.
                                                                                                                                      err))/* } */.println("Particle returning up -- " +
                                                                                                                                                           "should not happen: " +
                                                                                                                                                           p.
                                                                                                                                                             toString());
                                        
//#line 2197
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                            isLast()) {
                                            
//#line 2198
y =
                                              y -
                                                rsize;
                                        }
                                        
//#line 2200
/* template:array_set { */(sBufferR).set(p.
                                                                                                 setY(
                                                                                                 y),/* Join: { */pl,/* template:array_get { */((outRt).get(pl))/* } *//* } */)/* } */;
                                        
//#line 2201
/* template:array_unary { */(outRt).postInc(pl)/* } */;
                                    } else {
                                        
//#line 2204
/* template:array_set { */(rBufferR).set(p,/* Join: { */pl,inRightStaying/* } */)/* } */;
                                        
//#line 2205
inRightStaying++;
                                    }
                                }
                            }/* } */
                            }
                            /* } */
                            
                            }
                            }
                            /* } */
                            
                            
//#line 2208
/* template:array_set { */(inRt).set(inRightStaying,pl)/* } */;
                            
//#line 2209
int inLeftStaying =
                              0;
                            
//#line 2210
/* template:forloop-mult { */{
                            x10.lang.region __var198__ = (x10.lang.region) x10.
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
                                                                               /* template:array_get { */((inLt).get(pl))/* } */ -
                                                                                 1));
                            if (__var198__.size() > 0 && (__var198__ instanceof x10.array.MultiDimRegion || __var198__ instanceof x10.array.ContiguousRange)) {
                            	/* Loop: { *//* template:forloop-mult-each { */
                            for (int __var199__ = __var198__.rank(0).low(), __var200__ = __var198__.rank(0).high(); __var199__ <= __var200__; __var199__++)
                            /* } */
                            /* } */ {
                            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                            final int i = __var199__;
                            /* } */
                            /* } */
{
                                
//#line 2211
final Particle p =
                                  /* template:parametric { */((Particle)(/* template:array_get { */((rBufferL).get(/* Join: { */pl,i/* } */))/* } */))/* } */;
                                
//#line 2212
double y =
                                  p.
                                    getY();
                                
//#line 2213
if (y >=
                                                    ub) {
                                    
//#line 2214
if (/* template:array_get { */((outRt).get(pl))/* } */ <
                                                        rBuffer.
                                                          size()) {
                                        
//#line 2215
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                            isLast()) {
                                            
//#line 2216
y =
                                              y -
                                                rsize;
                                        }
                                        
//#line 2218
/* template:array_set { */(sBufferR).set(p.
                                                                                                 setY(
                                                                                                 y),/* Join: { */pl,/* template:array_get { */((outRt).get(pl))/* } *//* } */)/* } */;
                                        
//#line 2219
/* template:array_unary { */(outRt).postInc(pl)/* } */;
                                    } else {
                                        
//#line 2222
/* template:array_set { */(overflow).set(2 *
                                          rBuffer.
                                            size(),pl)/* } */;
                                        
//#line 2223
break;
                                    }
                                } else {
                                    
//#line 2227
if (y <
                                                        lb) {
                                        
//#line 2228
if (/* template:array_get { */((outLt).get(pl))/* } */ <
                                                            rBuffer.
                                                              size()) {
                                            
//#line 2229
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                isFirst()) {
                                                
//#line 2230
y =
                                                  y +
                                                    rsize;
                                            }
                                            
//#line 2232
/* template:array_set { */(sBufferL).set(p.
                                                                                                     setY(
                                                                                                     y),/* Join: { */pl,/* template:array_get { */((outLt).get(pl))/* } *//* } */)/* } */;
                                            
//#line 2233
/* template:array_unary { */(outLt).postInc(pl)/* } */;
                                        } else {
                                            
//#line 2236
/* template:array_set { */(overflow).set(2 *
                                              rBuffer.
                                                size(),pl)/* } */;
                                            
//#line 2237
break;
                                        }
                                    } else {
                                        
//#line 2241
/* template:array_set { */(rBufferL).set(p,/* Join: { */pl,inLeftStaying/* } */)/* } */;
                                        
//#line 2242
inLeftStaying++;
                                    }
                                }
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var57____ = (__var198__).iterator(); __var57____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var57__ = (x10.
                              lang.
                              point) __var57____.next();
                            	/* Join: { *//* Join: { */final int i =
                              /* template:array_get { */((__var57__).get(0))/* } */;/* } */
{
                                
//#line 2211
final Particle p =
                                  /* template:parametric { */((Particle)(/* template:array_get { */((rBufferL).get(/* Join: { */pl,i/* } */))/* } */))/* } */;
                                
//#line 2212
double y =
                                  p.
                                    getY();
                                
//#line 2213
if (y >=
                                                    ub) {
                                    
//#line 2214
if (/* template:array_get { */((outRt).get(pl))/* } */ <
                                                        rBuffer.
                                                          size()) {
                                        
//#line 2215
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                            isLast()) {
                                            
//#line 2216
y =
                                              y -
                                                rsize;
                                        }
                                        
//#line 2218
/* template:array_set { */(sBufferR).set(p.
                                                                                                 setY(
                                                                                                 y),/* Join: { */pl,/* template:array_get { */((outRt).get(pl))/* } *//* } */)/* } */;
                                        
//#line 2219
/* template:array_unary { */(outRt).postInc(pl)/* } */;
                                    } else {
                                        
//#line 2222
/* template:array_set { */(overflow).set(2 *
                                          rBuffer.
                                            size(),pl)/* } */;
                                        
//#line 2223
break;
                                    }
                                } else {
                                    
//#line 2227
if (y <
                                                        lb) {
                                        
//#line 2228
if (/* template:array_get { */((outLt).get(pl))/* } */ <
                                                            rBuffer.
                                                              size()) {
                                            
//#line 2229
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                isFirst()) {
                                                
//#line 2230
y =
                                                  y +
                                                    rsize;
                                            }
                                            
//#line 2232
/* template:array_set { */(sBufferL).set(p.
                                                                                                     setY(
                                                                                                     y),/* Join: { */pl,/* template:array_get { */((outLt).get(pl))/* } *//* } */)/* } */;
                                            
//#line 2233
/* template:array_unary { */(outLt).postInc(pl)/* } */;
                                        } else {
                                            
//#line 2236
/* template:array_set { */(overflow).set(2 *
                                              rBuffer.
                                                size(),pl)/* } */;
                                            
//#line 2237
break;
                                        }
                                    } else {
                                        
//#line 2241
/* template:array_set { */(rBufferL).set(p,/* Join: { */pl,inLeftStaying/* } */)/* } */;
                                        
//#line 2242
inLeftStaying++;
                                    }
                                }
                            }/* } */
                            }
                            /* } */
                            
                            }
                            }
                            /* } */
                            
                            
//#line 2245
/* template:array_set { */(inLt).set(inLeftStaying,pl)/* } */;
                        }/* } */
                        				}
                        			});
                        	}
                        }
                        /* } */
                        
                    }
                    	} catch (Throwable tmp194) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp194);
                    	} finally {
                    		x10.lang.Runtime.getCurrentActivity().stopFinish();
                    	}
                    }
                    /* } */
                    
                }
                
//#line 2248
final int rSize =
                  rPart.
                    size();
                
//#line 2249
final x10.
                  lang.
                  IntReferenceArray tMaxSize =
                  (nPart.
                     add(
                     inLt).
                     add(
                     inRt).
                     sub(
                     nSent));
                
//#line 2250
final x10.
                  lang.
                  IntReferenceArray tMinSize =
                  ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                    	public int apply(/* Join: { */x10.
                      lang.
                      point pt/* } */, int dummy) { {
                        
//#line 2251
return rSize;
                    } }
                    }/* } */,true,true,false)/* } */)).
                    sub(
                    tMaxSize);
                
//#line 2253
/* template:array_set { */(info).set(tMaxSize.
                                                                     max(),1)/* } */;
                
//#line 2254
/* template:array_set { */(info).set(rSize -
                  tMinSize.
                    max(),2)/* } */;
                
//#line 2255
int err =
                  /* template:array_get { */((ibflg).get(1))/* } */ -
                  rPart.
                    size();
                
//#line 2256
if (err >
                                    0) {
                    
//#line 2257
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                  lang.
                                                                                                                  System.
                                                                                                                  err))/* } */.println("Particle overflow error, err = " +
                                                                                                                                       err);
                    
//#line 2258
/* template:array_set { */(info).set(err,0)/* } */;
                    
//#line 2259
return particles;
                }
                
//#line 2261
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 2262
/* template:ateach { */
                    {
                    	x10.lang.dist __var58____distCopy = x10.
                                                           lang.
                                                           dist.
                                                           UNIQUE; // make copy to avoid recomputation
                    	for (java.util.Iterator __var58____ = __var58____distCopy.iterator();
                    		 __var58____.hasNext(); )
                    	{
                    		final  x10.
                      lang.
                      point __var58__ = (x10.
                      lang.
                      point) __var58____.next();
                    		/* Join: { */final int pl =
                      /* template:array_get { */((__var58__).get(0))/* } */;/* } */
                    		((x10.runtime.Place) __var58____distCopy.get(__var58__)).runAsync
                    			(new x10.runtime.Activity() {
                    				public void runX10Task() {
                    					/* Join: { *//* Join: { */final int pl =
                      /* template:array_get { */((__var58__).get(0))/* } */;/* } */
{
                        
//#line 2263
int holesTotal =
                          /* template:array_get { */((nSent).get(pl))/* } */;
                        
//#line 2264
int holesLeft =
                          /* template:array_get { */((nSent).get(pl))/* } */;
                        
//#line 2265
int nMove =
                          X10Util.
                            minInt(
                            holesLeft,
                            /* template:array_get { */((inLt).get(pl))/* } */);
                        
//#line 2266
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 2267
/* template:foreach { */
                            for (java.util.Iterator __var59____ = (x10.
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
                                                                       nMove -
                                                                         1))).iterator(); __var59____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var59__ = (x10.
                              lang.
                              point) __var59____.next();
                            	/* Join: { */final int i =
                              /* template:array_get { */((__var59__).get(0))/* } */;/* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { */final int i =
                              /* template:array_get { */((__var59__).get(0))/* } */;/* } */
{
                                
//#line 2268
/* template:array_set { */(part).set(/* template:parametric { */((Particle)(/* template:array_get { */((rBufferL).get(/* Join: { */pl,i/* } */))/* } */))/* } */,/* Join: { */pl,/* template:array_get { */((holes).get(/* Join: { */pl,i/* } */))/* } *//* } */)/* } */;
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                        }
                        	} catch (Throwable tmp202) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp202);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                        
//#line 2270
holesLeft =
                          holesLeft -
                            /* template:array_get { */((inLt).get(pl))/* } */;
                        
//#line 2271
if (holesLeft >
                                            0) {
                            
//#line 2272
nMove =
                              X10Util.
                                minInt(
                                holesLeft,
                                /* template:array_get { */((inRt).get(pl))/* } */);
                            
//#line 2273
/* template:forloop-mult { */{
                            x10.lang.region __var203__ = (x10.lang.region) x10.
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
                                                                               nMove -
                                                                                 1));
                            if (__var203__.size() > 0 && (__var203__ instanceof x10.array.MultiDimRegion || __var203__ instanceof x10.array.ContiguousRange)) {
                            	/* Loop: { *//* template:forloop-mult-each { */
                            for (int __var204__ = __var203__.rank(0).low(), __var205__ = __var203__.rank(0).high(); __var204__ <= __var205__; __var204__++)
                            /* } */
                            /* } */ {
                            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                            final int i = __var204__;
                            /* } */
                            /* } */
{
                                
//#line 2274
/* template:array_set { */(part).set(/* template:parametric { */((Particle)(/* template:array_get { */((rBufferR).get(/* Join: { */pl,i/* } */))/* } */))/* } */,/* Join: { */pl,/* template:array_get { */((holes).get(/* Join: { */pl,i +
                                  /* template:array_get { */((inLt).get(pl))/* } *//* } */))/* } *//* } */)/* } */;
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var60____ = (__var203__).iterator(); __var60____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var60__ = (x10.
                              lang.
                              point) __var60____.next();
                            	/* Join: { *//* Join: { */final int i =
                              /* template:array_get { */((__var60__).get(0))/* } */;/* } */
{
                                
//#line 2274
/* template:array_set { */(part).set(/* template:parametric { */((Particle)(/* template:array_get { */((rBufferR).get(/* Join: { */pl,i/* } */))/* } */))/* } */,/* Join: { */pl,/* template:array_get { */((holes).get(/* Join: { */pl,i +
                                  /* template:array_get { */((inLt).get(pl))/* } *//* } */))/* } *//* } */)/* } */;
                            }/* } */
                            }
                            /* } */
                            
                            }
                            }
                            /* } */
                            
                        } else {
                            
//#line 2278
nMove =
                              -holesLeft;
                            
//#line 2279
/* template:forloop-mult { */{
                            x10.lang.region __var206__ = (x10.lang.region) x10.
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
                                                                               nMove -
                                                                                 1));
                            if (__var206__.size() > 0 && (__var206__ instanceof x10.array.MultiDimRegion || __var206__ instanceof x10.array.ContiguousRange)) {
                            	/* Loop: { *//* template:forloop-mult-each { */
                            for (int __var207__ = __var206__.rank(0).low(), __var208__ = __var206__.rank(0).high(); __var207__ <= __var208__; __var207__++)
                            /* } */
                            /* } */ {
                            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                            final int i = __var207__;
                            /* } */
                            /* } */
{
                                
//#line 2280
/* template:array_set { */(part).set(/* template:parametric { */((Particle)(/* template:array_get { */((rBufferL).get(/* Join: { */pl,i +
                                  holesTotal/* } */))/* } */))/* } */,/* Join: { */pl,i +
                                  /* template:array_get { */((nPart).get(pl))/* } *//* } */)/* } */;
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var61____ = (__var206__).iterator(); __var61____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var61__ = (x10.
                              lang.
                              point) __var61____.next();
                            	/* Join: { *//* Join: { */final int i =
                              /* template:array_get { */((__var61__).get(0))/* } */;/* } */
{
                                
//#line 2280
/* template:array_set { */(part).set(/* template:parametric { */((Particle)(/* template:array_get { */((rBufferL).get(/* Join: { */pl,i +
                                  holesTotal/* } */))/* } */))/* } */,/* Join: { */pl,i +
                                  /* template:array_get { */((nPart).get(pl))/* } *//* } */)/* } */;
                            }/* } */
                            }
                            /* } */
                            
                            }
                            }
                            /* } */
                            
                        }
                        
//#line 2283
if (holesLeft <=
                                            0) {
                            
//#line 2284
/* template:array_set { */(nPart).set(/* template:array_get { */((nPart).get(pl))/* } */ -
                              holesLeft,pl)/* } */;
                            
//#line 2285
holesTotal =
                              /* template:array_get { */((inLt).get(pl))/* } */;
                        }
                        
//#line 2287
holesLeft =
                          holesTotal -
                            ((/* template:array_get { */((inLt).get(pl))/* } */ +
                                /* template:array_get { */((inRt).get(pl))/* } */));
                        
//#line 2288
if (holesLeft >
                                            0) {
                            
//#line 2289
holesTotal =
                              /* template:array_get { */((inLt).get(pl))/* } */ +
                                /* template:array_get { */((inRt).get(pl))/* } */;
                            
//#line 2290
/* template:array_set { */(inRt).set(holesLeft,pl)/* } */;
                        } else {
                            
//#line 2293
holesTotal =
                              holesTotal -
                                /* template:array_get { */((inLt).get(pl))/* } */;
                            
//#line 2294
/* template:array_set { */(inRt).set(-holesLeft,pl)/* } */;
                        }
                        
//#line 2296
/* template:forloop-mult { */{
                        x10.lang.region __var209__ = (x10.lang.region) x10.
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
                                                                           /* template:array_get { */((inRt).get(pl))/* } */ -
                                                                             1));
                        if (__var209__.size() > 0 && (__var209__ instanceof x10.array.MultiDimRegion || __var209__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var210__ = __var209__.rank(0).low(), __var211__ = __var209__.rank(0).high(); __var210__ <= __var211__; __var210__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i = __var210__;
                        /* } */
                        /* } */
{
                            
//#line 2297
if (holesLeft >
                                                0) {
                                
//#line 2298
final int i1 =
                                  /* template:array_get { */((nPart).get(pl))/* } */ -
                                  i -
                                  1;
                                
//#line 2299
final int i2 =
                                  holesTotal +
                                  holesLeft -
                                  i -
                                  1;
                                
//#line 2300
if (i1 >
                                                    /* template:array_get { */((holes).get(/* Join: { */pl,i2/* } */))/* } */) {
                                    
//#line 2301
/* template:array_set { */(part).set(/* template:parametric { */((Particle)(/* template:array_get { */((part).get(/* Join: { */pl,i1/* } */))/* } */))/* } */,/* Join: { */pl,/* template:array_get { */((holes).get(/* Join: { */pl,i2/* } */))/* } *//* } */)/* } */;
                                }
                            } else {
                                
//#line 2305
/* template:array_set { */(part).set(/* template:parametric { */((Particle)(/* template:array_get { */((rBufferR).get(/* Join: { */pl,i +
                                  holesTotal/* } */))/* } */))/* } */,/* Join: { */pl,i +
                                  /* template:array_get { */((nPart).get(pl))/* } *//* } */)/* } */;
                            }
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var62____ = (__var209__).iterator(); __var62____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var62__ = (x10.
                          lang.
                          point) __var62____.next();
                        	/* Join: { *//* Join: { */final int i =
                          /* template:array_get { */((__var62__).get(0))/* } */;/* } */
{
                            
//#line 2297
if (holesLeft >
                                                0) {
                                
//#line 2298
final int i1 =
                                  /* template:array_get { */((nPart).get(pl))/* } */ -
                                  i -
                                  1;
                                
//#line 2299
final int i2 =
                                  holesTotal +
                                  holesLeft -
                                  i -
                                  1;
                                
//#line 2300
if (i1 >
                                                    /* template:array_get { */((holes).get(/* Join: { */pl,i2/* } */))/* } */) {
                                    
//#line 2301
/* template:array_set { */(part).set(/* template:parametric { */((Particle)(/* template:array_get { */((part).get(/* Join: { */pl,i1/* } */))/* } */))/* } */,/* Join: { */pl,/* template:array_get { */((holes).get(/* Join: { */pl,i2/* } */))/* } *//* } */)/* } */;
                                }
                            } else {
                                
//#line 2305
/* template:array_set { */(part).set(/* template:parametric { */((Particle)(/* template:array_get { */((rBufferR).get(/* Join: { */pl,i +
                                  holesTotal/* } */))/* } */))/* } */,/* Join: { */pl,i +
                                  /* template:array_get { */((nPart).get(pl))/* } *//* } */)/* } */;
                            }
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
                        
//#line 2308
if (holesLeft >
                                            0) {
                            
//#line 2309
/* template:array_set { */(nPart).set(/* template:array_get { */((nPart).get(pl))/* } */ -
                              /* template:array_get { */((inRt).get(pl))/* } */,pl)/* } */;
                        } else {
                            
//#line 2312
/* template:array_set { */(nPart).set(/* template:array_get { */((nPart).get(pl))/* } */ +
                              /* template:array_get { */((inRt).get(pl))/* } */,pl)/* } */;
                        }
                        
//#line 2314
/* template:array_set { */(nSent).set(0,pl)/* } */;
                    }/* } */
                    				}
                    			});
                    	}
                    }
                    /* } */
                    
                }
                	} catch (Throwable tmp201) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp201);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 2316
/* template:array_set { */(info).set(X10Util.
                                                                     maxInt(
                                                                     /* template:array_get { */((info).get(4))/* } */,
                                                                     mter),4)/* } */;
                
//#line 2317
if (/* template:array_get { */((ibflg).get(1))/* } */ >
                                    0) {
                    
//#line 2318
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                  lang.
                                                                                                                  System.
                                                                                                                  err))/* } */.println("Info: particles being passed" +
                                                                                                                                       " further = " +
                                                                                                                                       /* template:array_get { */((ibflg).get(1))/* } */);
                    
//#line 2319
if (/* template:array_get { */((ibflg).get(2))/* } */ >
                                        0) {
                        
//#line 2320
/* template:array_set { */(ibflg).set(1,2)/* } */;
                    }
                    
//#line 2322
if (iter >=
                                        ITER_MAX) {
                        
//#line 2323
err =
                          -(((iter -
                                2 /
                                2)));
                        
//#line 2324
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                      lang.
                                                                                                                      System.
                                                                                                                      err))/* } */.println("Iteration overflow, " +
                                                                                                                                           "iter = " +
                                                                                                                                           err);
                        
//#line 2325
/* template:array_set { */(info).set(err,0)/* } */;
                        
//#line 2326
doneInner =
                          true;
                        
//#line 2327
doneOuter =
                          true;
                    }
                } else {
                    
//#line 2331
doneInner =
                      true;
                }
            }while(!doneInner); 
            
//#line 2334
if (!doneOuter &&
                                /* template:array_get { */((ibflg).get(2))/* } */ >
                                0) {
                
//#line 2335
nter++;
                
//#line 2336
/* template:array_set { */(info).set(nter,3)/* } */;
            } else {
                
//#line 2339
doneOuter =
                  true;
            }
        }while(!doneOuter); 
        
//#line 2342
/* template:array_set { */(info).set(nPart.
                                                             sum(),5)/* } */;
        
//#line 2343
/* template:array_set { */(info).set(nPartOld.
                                                             sum(),6)/* } */;
        
//#line 2344
if (/* template:array_get { */((info).get(5))/* } */ !=
                            /* template:array_get { */((info).get(6))/* } */) {
            
//#line 2345
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                          lang.
                                                                                                          System.
                                                                                                          err))/* } */.println("Particle number error, old/new = " +
                                                                                                                               /* template:array_get { */((info).get(0))/* } */ +
                                                                                                                               " " +
                                                                                                                               /* template:array_get { */((info).get(1))/* } */);
            
//#line 2346
/* template:array_set { */(info).set(1,0)/* } */;
        }
        
//#line 2348
if (nter >
                            0) {
            
//#line 2349
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                          lang.
                                                                                                          System.
                                                                                                          err))/* } */.println("Info: " +
                                                                                                                               nter +
                                                                                                                               " buffer overflows, " +
                                                                                                                               "nbmax = " +
                                                                                                                               rBuffer.
                                                                                                                                 size());
        }
        
//#line 2351
return packParticleArray(
                               part,
                               nPart);
    }
    
    
//#line 2353
private void
                    transferParticles(
                    final x10.
                      lang.
                      GenericReferenceArray leftOutBuffer,
                    final x10.
                      lang.
                      GenericReferenceArray rightOutBuffer,
                    final x10.
                      lang.
                      IntReferenceArray outLeft,
                    final x10.
                      lang.
                      IntReferenceArray outRight,
                    final x10.
                      lang.
                      GenericReferenceArray leftInBuffer,
                    final x10.
                      lang.
                      GenericReferenceArray rightInBuffer,
                    final x10.
                      lang.
                      IntReferenceArray inLeft,
                    final x10.
                      lang.
                      IntReferenceArray inRight) {
        
//#line 2354
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2355
/* template:ateach { */
            {
            	x10.lang.dist __var63____distCopy = x10.
                                                   lang.
                                                   dist.
                                                   UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator __var63____ = __var63____distCopy.iterator();
            		 __var63____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var63__ = (x10.
              lang.
              point) __var63____.next();
            		/* Join: { */final int pl =
              /* template:array_get { */((__var63__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var63____distCopy.get(__var63__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int pl =
              /* template:array_get { */((__var63__).get(0))/* } */;/* } */
{
                
//#line 2356
final x10.
                  lang.
                  place pLeft =
                  (/* template:here { */x10.lang.Runtime.here()/* } */).
                    prev();
                
//#line 2357
final x10.
                  lang.
                  place pRight =
                  (/* template:here { */x10.lang.Runtime.here()/* } */).
                    next();
                
//#line 2358
final x10.
                  lang.
                  region rLeft =
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
                      /* template:array_get { */((outLeft).get(pl))/* } */ -
                        1));
                
//#line 2359
final x10.
                  lang.
                  region rRight =
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
                      /* template:array_get { */((outRight).get(pl))/* } */ -
                        1));
                
//#line 2360
final x10.
                  lang.
                  GenericReferenceArray lBuffer =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(rLeft.
                                                                                                                                  toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                     	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                       lang.
                       point __var64__/* } */, x10.compilergenerated.Parameter1 dummy) { {
                         
//#line 2360
final int i =
                           /* template:array_get { */((__var64__).get(0))/* } */;
                         
//#line 2361
return /* template:parametric { */((Particle)(/* template:array_get { */((leftOutBuffer).get(/* Join: { */pl,i/* } */))/* } */))/* } */;
                     } }
                     }/* } */,true,false,true)/* } */);
                
//#line 2363
final x10.
                  lang.
                  GenericReferenceArray rBuffer =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(rRight.
                                                                                                                                  toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                     	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                       lang.
                       point __var65__/* } */, x10.compilergenerated.Parameter1 dummy) { {
                         
//#line 2363
final int i =
                           /* template:array_get { */((__var65__).get(0))/* } */;
                         
//#line 2364
return /* template:parametric { */((Particle)(/* template:array_get { */((rightOutBuffer).get(/* Join: { */pl,i/* } */))/* } */))/* } */;
                     } }
                     }/* } */,true,false,true)/* } */);
                
//#line 2366
/* template:Async { */(x10.lang.Runtime.asPlace(pLeft)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 2367
final int pid =
                      (/* template:here { */x10.lang.Runtime.here()/* } */).
                        id;
                    
//#line 2368
/* template:array_set { */(inRight).set(lBuffer.
                                                                            region.
                                                                            size(),pid)/* } */;
                    
//#line 2369
/* template:foreach { */
                    for (java.util.Iterator __var66____ = (lBuffer.
                                                             distribution).iterator(); __var66____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var66__ = (x10.
                      lang.
                      point) __var66____.next();
                    	/* Join: { */final int i =
                      /* template:array_get { */((__var66__).get(0))/* } */;/* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var66__).get(0))/* } */;/* } */
{
                        
//#line 2370
/* template:array_set { */(rightInBuffer).set(/* template:parametric { */((Particle)(/* template:array_get { */((lBuffer).get(i))/* } */))/* } */,/* Join: { */pid,i/* } */)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                }
                		}
                	});/* } */
                
//#line 2373
/* template:Async { */(x10.lang.Runtime.asPlace(pRight)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 2374
final int pid =
                      (/* template:here { */x10.lang.Runtime.here()/* } */).
                        id;
                    
//#line 2375
/* template:array_set { */(inLeft).set(rBuffer.
                                                                           region.
                                                                           size(),pid)/* } */;
                    
//#line 2376
/* template:foreach { */
                    for (java.util.Iterator __var67____ = (rBuffer.
                                                             distribution).iterator(); __var67____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var67__ = (x10.
                      lang.
                      point) __var67____.next();
                    	/* Join: { */final int i =
                      /* template:array_get { */((__var67__).get(0))/* } */;/* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var67__).get(0))/* } */;/* } */
{
                        
//#line 2377
/* template:array_set { */(leftInBuffer).set(/* template:parametric { */((Particle)(/* template:array_get { */((rBuffer).get(i))/* } */))/* } */,/* Join: { */pid,i/* } */)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                }
                		}
                	});/* } */
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp212) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp212);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 2382
private x10.
                    lang.
                    GenericReferenceArray
                    packParticleArray(
                    final x10.
                      lang.
                      GenericReferenceArray part,
                    final x10.
                      lang.
                      IntReferenceArray nParticles) {
        
//#line 2383
int lb =
          0;
        
//#line 2384
x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                x10.
                  lang.
                  region.
                  factory.
                  emptyRegion(
                  1),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 2385
/* template:forloop { */
        for (java.util.Iterator pt__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pt__.hasNext(); ) {
        	final  x10.
          lang.
          point pt = (x10.
          lang.
          point) pt__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 2386
int rsize =
              X10Util.
                pullInt(
                nParticles,
                pt);
            
//#line 2387
x10.
              lang.
              place p =
              x10.
                lang.
                place.
                places(
                /* template:array_get { */((pt).get(0))/* } */);
            
//#line 2388
dResult =
              dResult.
                union(
                (x10.
                   lang.
                   dist.
                   factory.
                   constant(
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
                       lb,
                       lb +
                         rsize -
                         1)),
                   p)));
            
//#line 2389
lb =
              lb +
                rsize;
        }/* } */
        }
        /* } */
        
        
//#line 2391
final x10.
          lang.
          GenericReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dResult,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 2392
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2393
/* template:ateach { */
            {
            	x10.lang.dist __var68____distCopy = x10.
                                                   lang.
                                                   dist.
                                                   UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator __var68____ = __var68____distCopy.iterator();
            		 __var68____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var68__ = (x10.
              lang.
              point) __var68____.next();
            		/* Join: { */final int pl =
              /* template:array_get { */((__var68__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var68____distCopy.get(__var68__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int pl =
              /* template:array_get { */((__var68__).get(0))/* } */;/* } */
{
                
//#line 2394
final x10.
                  lang.
                  region rLocal =
                  (x10.
                    lang.
                    region)
                    ((result.
                        distribution.
                        restriction(
                        /* template:here { */x10.lang.Runtime.here()/* } */))).
                      region;
                
//#line 2395
if (rLocal.
                                    size() >
                                    0) {
                    
//#line 2396
final int offset =
                      rLocal.
                        low();
                    
//#line 2397
/* template:foreach { */
                    for (java.util.Iterator __var69____ = (rLocal).iterator(); __var69____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var69__ = (x10.
                      lang.
                      point) __var69____.next();
                    	/* Join: { */final int i =
                      /* template:array_get { */((__var69__).get(0))/* } */;/* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var69__).get(0))/* } */;/* } */
{
                        
//#line 2398
/* template:array_set { */(result).set(/* template:parametric { */((Particle)(/* template:array_get { */((part).get(/* Join: { */pl,i -
                          offset/* } */))/* } */))/* } */,i)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp213) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp213);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2402
return result;
    }
    
    
//#line 2404
public double
                    pushParticles(
                    final x10.
                      lang.
                      GenericReferenceArray particles,
                    final x10.
                      lang.
                      DoubleReferenceArray forceChargeX,
                    final x10.
                      lang.
                      DoubleReferenceArray fcGuardX,
                    final x10.
                      lang.
                      DoubleReferenceArray forceChargeY,
                    final x10.
                      lang.
                      DoubleReferenceArray fcGuardY) {
        
//#line 2405
double lx =
          0.0;
        
//#line 2406
double ly =
          0.0;
        
//#line 2407
double rx =
          0.0;
        
//#line 2408
double ry =
          0.0;
        
//#line 2409
switch (BOUNDARY_CONDITION) {
            
//#line 2410
case 1:
                
//#line 2411
rx =
                  XLENGTH;
                
//#line 2412
break;
            
//#line 2414
case 2:
                
//#line 2415
lx =
                  1.0;
                
//#line 2416
ly =
                  1.0;
                
//#line 2417
rx =
                  XLENGTH -
                    1.0;
                
//#line 2418
ry =
                  YLENGTH -
                    1.0;
                
//#line 2419
break;
            
//#line 2421
case 3:
                
//#line 2422
lx =
                  1.0;
                
//#line 2423
rx =
                  XLENGTH -
                    1.0;
                
//#line 2424
break;
        }
        
//#line 2427
final double edgelx =
          lx;
        
//#line 2428
final double edgely =
          ly;
        
//#line 2429
final double edgerx =
          rx;
        
//#line 2430
final double edgery =
          ry;
        
//#line 2431
final double quantum =
          ELECTRON_CHARGE *
          DELTA_TIME;
        
//#line 2432
final x10.
          lang.
          dist dEnergy =
          particles.
            distribution;
        
//#line 2433
final x10.
          lang.
          DoubleReferenceArray energy =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dEnergy,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 2434
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2435
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 2436
final x10.
                  lang.
                  DoubleReferenceArray fcLocalX =
                  makeLocalSpace(
                    forceChargeX,
                    fcGuardX);
                
//#line 2437
final x10.
                  lang.
                  DoubleReferenceArray fcLocalY =
                  makeLocalSpace(
                    forceChargeY,
                    fcGuardY);
                
//#line 2438
/* template:foreach { */
                for (java.util.Iterator pt__ = (particles.
                                                  distribution.
                                                  restriction(
                                                  /* template:here { */x10.lang.Runtime.here()/* } */)).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { *//* } */
{
                    
//#line 2439
pushParticle(
                                    particles,
                                    pt,
                                    fcLocalX,
                                    fcLocalY,
                                    quantum,
                                    edgelx,
                                    edgely,
                                    edgerx,
                                    edgery,
                                    energy);
                }/* } */
                			}
                		});
                }
                /* } */
                
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp214) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp214);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2442
return (0.125 *
                                energy.
                                  sum());
    }
    
    
//#line 2444
private x10.
                    lang.
                    DoubleReferenceArray
                    makeLocalSpace(
                    final x10.
                      lang.
                      DoubleReferenceArray data,
                    final x10.
                      lang.
                      DoubleReferenceArray guards) {
        
//#line 2445
final x10.
          lang.
          dist dData =
          data.
            distribution;
        
//#line 2446
final x10.
          lang.
          dist dGuard =
          guards.
            distribution;
        
//#line 2447
final x10.
          lang.
          region rLocalD =
          X10Util.
            get2DLRegion(
            dData);
        
//#line 2448
final x10.
          lang.
          region rLocalG =
          X10Util.
            get2DLRegion(
            dGuard);
        
//#line 2449
final x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                (rLocalD.
                   union(
                   rLocalG)),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 2450
final x10.
          lang.
          DoubleReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dResult,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 2451
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2452
/* template:foreach { */
            for (java.util.Iterator pt__ = (data.
                                              distribution.
                                              restriction(
                                              /* template:here { */x10.lang.Runtime.here()/* } */)).iterator(); pt__.hasNext(); ) {
            	final  x10.
              lang.
              point pt = (x10.
              lang.
              point) pt__.next();
            	/* Join: { *//* } */
            	x10.lang.Runtime.here().runAsync
            		(new x10.runtime.Activity() {
            			public void runX10Task() {
            				/* Join: { *//* Join: { *//* } */
{
                
//#line 2453
/* template:array_set { */(result).set(/* template:array_get { */((data).get(pt))/* } */,pt)/* } */;
            }/* } */
            			}
            		});
            }
            /* } */
            
            
//#line 2455
/* template:foreach { */
            for (java.util.Iterator pt__ = (guards.
                                              distribution.
                                              restriction(
                                              /* template:here { */x10.lang.Runtime.here()/* } */)).iterator(); pt__.hasNext(); ) {
            	final  x10.
              lang.
              point pt = (x10.
              lang.
              point) pt__.next();
            	/* Join: { *//* } */
            	x10.lang.Runtime.here().runAsync
            		(new x10.runtime.Activity() {
            			public void runX10Task() {
            				/* Join: { *//* Join: { *//* } */
{
                
//#line 2456
/* template:array_set { */(result).set(/* template:array_get { */((guards).get(pt))/* } */,pt)/* } */;
            }/* } */
            			}
            		});
            }
            /* } */
            
        }
        	} catch (Throwable tmp215) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp215);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2459
return result;
    }
    
    
//#line 2461
private void
                    pushParticle(
                    final x10.
                      lang.
                      GenericReferenceArray particles,
                    final x10.
                      lang.
                      point pt,
                    final x10.
                      lang.
                      DoubleReferenceArray forceChargeX,
                    final x10.
                      lang.
                      DoubleReferenceArray forceChargeY,
                    final double quantum,
                    final double edgelx,
                    final double edgely,
                    final double edgerx,
                    final double edgery,
                    final x10.
                      lang.
                      DoubleReferenceArray energy) {
        
//#line 2462
final Particle p =
          /* template:parametric { */((Particle)(/* template:array_get { */((particles).get(pt))/* } */))/* } */;
        
//#line 2463
final int x =
          (int)
            p.
              getX();
        
//#line 2464
final int y =
          (int)
            p.
              getY();
        
//#line 2465
final double dx =
          p.
            getX() -
          x;
        
//#line 2466
final double dy =
          p.
            getY() -
          y;
        
//#line 2467
final double mx =
          1.0 -
          dx;
        
//#line 2468
final double my =
          1.0 -
          dy;
        
//#line 2469
final double ax =
          (dy *
             ((dx *
                 /* template:array_get { */((forceChargeX).get(/* Join: { */y +
                 1,x +
                 1/* } */))/* } */ +
                 mx *
                 /* template:array_get { */((forceChargeX).get(/* Join: { */y +
                 1,x/* } */))/* } */)) +
             my *
             ((dx *
                 /* template:array_get { */((forceChargeX).get(/* Join: { */y,x +
                 1/* } */))/* } */ +
                 mx *
                 /* template:array_get { */((forceChargeX).get(/* Join: { */y,x/* } */))/* } */)));
        
//#line 2470
final double ay =
          (dy *
             ((dx *
                 /* template:array_get { */((forceChargeY).get(/* Join: { */y +
                 1,x +
                 1/* } */))/* } */ +
                 mx *
                 /* template:array_get { */((forceChargeY).get(/* Join: { */y +
                 1,x/* } */))/* } */)) +
             my *
             ((dx *
                 /* template:array_get { */((forceChargeY).get(/* Join: { */y,x +
                 1/* } */))/* } */ +
                 mx *
                 /* template:array_get { */((forceChargeY).get(/* Join: { */y,x/* } */))/* } */)));
        
//#line 2471
double vx =
          p.
            getXVel() +
          quantum *
          ax;
        
//#line 2472
double vy =
          p.
            getYVel() +
          quantum *
          ay;
        
//#line 2473
double nx =
          p.
            getX() +
          vx *
          DELTA_TIME;
        
//#line 2474
double ny =
          p.
            getY() +
          vy *
          DELTA_TIME;
        
//#line 2475
/* template:array_set { */(energy).set((java.
                                                                lang.
                                                                Math.
                                                                pow(
                                                                vx +
                                                                  p.
                                                                    getXVel(),
                                                                2) +
                                                                java.
                                                                  lang.
                                                                  Math.
                                                                  pow(
                                                                  vy +
                                                                    p.
                                                                      getYVel(),
                                                                  2)),pt)/* } */;
        
//#line 2476
switch (BOUNDARY_CONDITION) {
            
//#line 2477
case 1:
                
//#line 2478
if (nx <
                                    edgelx) {
                    
//#line 2479
nx =
                      nx +
                        edgerx;
                }
                
//#line 2481
if (nx >=
                                    edgerx) {
                    
//#line 2482
nx =
                      nx -
                        edgerx;
                }
                
//#line 2484
break;
            
//#line 2486
case 2:
                
//#line 2487
if (ny <
                                    edgely ||
                                    ny >=
                                    edgery) {
                    
//#line 2488
ny =
                      p.
                        getY();
                    
//#line 2489
vy =
                      -vy;
                }
            
//#line 2492
case 3:
                
//#line 2493
if (nx <
                                    edgelx ||
                                    nx >=
                                    edgerx) {
                    
//#line 2494
nx =
                      p.
                        getX();
                    
//#line 2495
vx =
                      -vx;
                }
                
//#line 2497
break;
        }
        
//#line 2500
/* template:array_set { */(particles).set(new Particle(
          nx,
          ny,
          vx,
          vy),pt)/* } */;
    }
    
    
//#line 2502
public x10.
                    lang.
                    IntReferenceArray
                    countParticles(
                    final x10.
                      lang.
                      GenericReferenceArray particles,
                    final x10.
                      lang.
                      dist dField) {
        
//#line 2503
final x10.
          lang.
          dist dCount =
          X10Util.
            get2DDistRank(
            dField,
            0);
        
//#line 2504
final x10.
          lang.
          IntReferenceArray count =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dCount,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2505
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2507
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2508
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 2509
/* template:forloop { */
                for (java.util.Iterator pt__ = (particles.
                                                  distribution.
                                                  restriction(
                                                  /* template:here { */x10.lang.Runtime.here()/* } */).
                                                  region).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 2510
/* template:array_unary { */(count).postInc((int)
                                                                                /* template:parametric { */((Particle)(/* template:array_get { */((particles).get(pt))/* } */))/* } */.
                                                                                  getY())/* } */;
                }/* } */
                }
                /* } */
                
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp216) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp216);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2513
return count;
    }
    
    
//#line 2515
public x10.
                    lang.
                    dist
                    repartition(
                    final x10.
                      lang.
                      IntReferenceArray particleCount,
                    final x10.
                      lang.
                      dist dField,
                    final double countAve) {
        
//#line 2516
final int MAX =
          32;
        
//#line 2517
final x10.
          lang.
          dist dUnique =
          (x10.
            lang.
            dist)
            x10.
              lang.
              dist.
              UNIQUE;
        
//#line 2518
final x10.
          lang.
          dist dGrids =
          X10Util.
            get2DDistRank(
            dField,
            0);
        
//#line 2519
final x10.
          lang.
          region rField =
          dField.
            region;
        
//#line 2520
final x10.
          lang.
          region rRows =
          X10Util.
            getRank2D(
            rField,
            1);
        
//#line 2521
final x10.
          lang.
          DoubleReferenceArray border =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point pt/* } */, double dummy) { {
            
//#line 2522
return 0.0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2524
final x10.
          lang.
          IntReferenceArray particleTotals =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2525
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2527
final x10.
          lang.
          IntReferenceArray gridTotals =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2528
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2530
final x10.
          lang.
          dist dBuffer =
          X10Util.
            extendDistRank2D(
            (x10.
              lang.
              dist)
              x10.
                lang.
                dist.
                UNIQUE,
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
                MAX -
                  1)));
        
//#line 2531
final x10.
          lang.
          IntReferenceArray sCountBuffer =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dBuffer,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 2532
final x10.
          lang.
          IntReferenceArray rCountBuffer =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dBuffer,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 2533
final x10.
          lang.
          IntReferenceArray sendCount =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 2534
final x10.
          lang.
          IntReferenceArray sendGrids =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 2535
final x10.
          lang.
          IntReferenceArray recvCount =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 2536
final x10.
          lang.
          IntReferenceArray recvGrids =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 2537
final x10.
          lang.
          IntReferenceArray finished =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2538
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2540
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2541
/* template:ateach { */
            {
            	x10.lang.dist __var70____distCopy = x10.
                                                   lang.
                                                   dist.
                                                   UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator __var70____ = __var70____distCopy.iterator();
            		 __var70____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var70__ = (x10.
              lang.
              point) __var70____.next();
            		/* Join: { */final int pl =
              /* template:array_get { */((__var70__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var70____distCopy.get(__var70__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int pl =
              /* template:array_get { */((__var70__).get(0))/* } */;/* } */
{
                
//#line 2542
final x10.
                  lang.
                  dist dPC =
                  particleCount.
                    distribution;
                
//#line 2543
final x10.
                  lang.
                  region rLocal =
                  X10Util.
                    get1DLRegion(
                    dPC);
                
//#line 2544
final int rsize =
                  rLocal.
                    size();
                
//#line 2545
final int offset =
                  ((rsize >
                      0))
                  ? rLocal.
                      low()
                  : 0;
                
//#line 2546
int total =
                  0;
                
//#line 2547
/* template:forloop-mult { */{
                x10.lang.region __var218__ = (x10.lang.region) particleCount.
                                                                 distribution.
                                                                 restriction(
                                                                 /* template:here { */x10.lang.Runtime.here()/* } */).
                                                                 region;
                if (__var218__.size() > 0 && (__var218__ instanceof x10.array.MultiDimRegion || __var218__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var219__ = __var218__.rank(0).low(), __var220__ = __var218__.rank(0).high(); __var219__ <= __var220__; __var219__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int i = __var219__;
                /* } */
                /* } */
{
                    
//#line 2548
final int count =
                      /* template:array_get { */((particleCount).get(i))/* } */;
                    
//#line 2549
/* template:array_set { */(sCountBuffer).set(count,/* Join: { */pl,i -
                      offset/* } */)/* } */;
                    
//#line 2550
total =
                      total +
                        count;
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var71____ = (__var218__).iterator(); __var71____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var71__ = (x10.
                  lang.
                  point) __var71____.next();
                	/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var71__).get(0))/* } */;/* } */
{
                    
//#line 2548
final int count =
                      /* template:array_get { */((particleCount).get(i))/* } */;
                    
//#line 2549
/* template:array_set { */(sCountBuffer).set(count,/* Join: { */pl,i -
                      offset/* } */)/* } */;
                    
//#line 2550
total =
                      total +
                        count;
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
                
//#line 2552
/* template:array_set { */(particleTotals).set(total,pl)/* } */;
                
//#line 2553
/* template:array_set { */(gridTotals).set(rsize,pl)/* } */;
                
//#line 2554
/* template:array_set { */(sendCount).set(total,pl)/* } */;
                
//#line 2555
/* template:array_set { */(sendGrids).set(rsize,pl)/* } */;
                
//#line 2556
/* template:array_set { */(recvCount).set(0,pl)/* } */;
                
//#line 2557
/* template:array_set { */(recvGrids).set(0,pl)/* } */;
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp217) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp217);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2559
final x10.
          lang.
          IntReferenceArray runningPTotals =
          parallelPrefix(
            particleTotals);
        
//#line 2560
final x10.
          lang.
          IntReferenceArray runningGTotals =
          parallelPrefix(
            gridTotals);
        
//#line 2561
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2562
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 2563
/* template:array_set { */(particleTotals).set(/* template:array_get { */((runningPTotals).get(pl))/* } */,pl)/* } */;
                
//#line 2564
/* template:array_set { */(gridTotals).set(/* template:array_get { */((runningGTotals).get(pl))/* } */,pl)/* } */;
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp221) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp221);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2566
do  {
            
//#line 2567
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 2568
/* template:ateach { */
                {
                	x10.lang.dist __var72____distCopy = x10.
                                                       lang.
                                                       dist.
                                                       UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator __var72____ = __var72____distCopy.iterator();
                		 __var72____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var72__ = (x10.
                  lang.
                  point) __var72____.next();
                		/* Join: { */final int pl =
                  /* template:array_get { */((__var72__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var72____distCopy.get(__var72__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int pl =
                  /* template:array_get { */((__var72__).get(0))/* } */;/* } */
{
                    
//#line 2569
final int expected =
                      (int)
                        ((((pl +
                              1)) *
                            countAve +
                            0.5));
                    
//#line 2570
final int surplus =
                      /* template:array_get { */((runningPTotals).get(pl))/* } */ -
                      expected;
                    
//#line 2571
if (surplus >
                                        0.0) {
                        
//#line 2572
final x10.
                          lang.
                          region dSBuffer =
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
                              /* template:array_get { */((sendGrids).get(pl))/* } */ -
                                1));
                        
//#line 2573
final x10.
                          lang.
                          intArray sBuffer =
                          (x10.
                            lang.
                            intArray)
                            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dSBuffer.
                                                                                                                                      toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                             	public int apply(/* Join: { */x10.
                               lang.
                               point __var73__/* } */, int dummy) { {
                                 
//#line 2573
final int i =
                                   /* template:array_get { */((__var73__).get(0))/* } */;
                                 
//#line 2574
return /* template:array_get { */((sCountBuffer).get(/* Join: { */pl,i/* } */))/* } */;
                             } }
                             }/* } */,true,false,false)/* } */);
                        
//#line 2576
final int nCount =
                          /* template:array_get { */((sendCount).get(pl))/* } */;
                        
//#line 2577
final int nGrids =
                          /* template:array_get { */((sendGrids).get(pl))/* } */;
                        
//#line 2578
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 2579
/* template:Async { */(x10.lang.Runtime.asPlace((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                            next())).runAsync
                            	(new x10.runtime.Activity() {
                            		public void runX10Task() {
                            			{
                                
//#line 2580
/* template:array_set { */(recvCount).set(nCount,(/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                                 id)/* } */;
                                
//#line 2581
/* template:array_set { */(recvGrids).set(nGrids,(/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                                 id)/* } */;
                                
//#line 2582
/* template:finish { */
                                {
                                	x10.lang.Runtime.getCurrentActivity().startFinish();
                                	try {
                                		{
                                    
//#line 2583
/* template:foreach { */
                                    for (java.util.Iterator __var74____ = (dSBuffer).iterator(); __var74____.hasNext(); ) {
                                    	final  x10.
                                      lang.
                                      point __var74__ = (x10.
                                      lang.
                                      point) __var74____.next();
                                    	/* Join: { */final int i =
                                      /* template:array_get { */((__var74__).get(0))/* } */;/* } */
                                    	x10.lang.Runtime.here().runAsync
                                    		(new x10.runtime.Activity() {
                                    			public void runX10Task() {
                                    				/* Join: { *//* Join: { */final int i =
                                      /* template:array_get { */((__var74__).get(0))/* } */;/* } */
{
                                        
//#line 2584
/* template:array_set { */(rCountBuffer).set(/* template:array_get { */((sBuffer).get(i))/* } */,/* Join: { */(/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                                                                                                      id,i/* } */)/* } */;
                                    }/* } */
                                    			}
                                    		});
                                    }
                                    /* } */
                                    
                                }
                                	} catch (Throwable tmp224) {
                                		x10.lang.Runtime.getCurrentActivity().pushException(tmp224);
                                	} finally {
                                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                                	}
                                }
                                /* } */
                                
                            }
                            		}
                            	});/* } */
                        }
                        	} catch (Throwable tmp223) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp223);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                    }
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp222) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp222);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 2589
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 2590
/* template:ateach { */
                {
                	x10.lang.dist __var75____distCopy = x10.
                                                       lang.
                                                       dist.
                                                       UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator __var75____ = __var75____distCopy.iterator();
                		 __var75____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var75__ = (x10.
                  lang.
                  point) __var75____.next();
                		/* Join: { */final int pl =
                  /* template:array_get { */((__var75__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var75____distCopy.get(__var75__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int pl =
                  /* template:array_get { */((__var75__).get(0))/* } */;/* } */
{
                    
//#line 2591
/* template:array_set { */(finished).set(0,pl)/* } */;
                    
//#line 2592
final int expected1 =
                      (int)
                        ((pl *
                            countAve +
                            0.5));
                    
//#line 2593
final int expected2 =
                      (int)
                        ((((pl +
                              1)) *
                            countAve +
                            0.5));
                    
//#line 2594
final int lDeficit =
                      expected1 -
                      /* template:array_get { */((runningPTotals).get(pl))/* } */ +
                      /* template:array_get { */((sendCount).get(pl))/* } */;
                    
//#line 2595
final int rDeficit =
                      /* template:array_get { */((runningPTotals).get(pl))/* } */ -
                      expected2;
                    
//#line 2596
if (lDeficit <
                                        0.0) {
                        
//#line 2597
if (lDeficit +
                                            /* template:array_get { */((recvCount).get(pl))/* } */ >=
                                            0.0) {
                            
//#line 2598
int total =
                              0;
                            
//#line 2599
int oldTotal =
                              0;
                            
//#line 2600
int gsize =
                              /* template:array_get { */((recvGrids).get(pl))/* } */;
                            
//#line 2601
int i =
                              gsize;
                            
//#line 2602
do  {
                                
//#line 2603
i--;
                                
//#line 2604
oldTotal =
                                  total;
                                
//#line 2605
total =
                                  total -
                                    /* template:array_get { */((rCountBuffer).get(/* Join: { */pl,i/* } */))/* } */;
                            }while(total >
                                     lDeficit &&
                                     i >=
                                     0); 
                            
//#line 2607
double offset =
                              (((gsize -
                                   i)) +
                                 (((((double)
                                       ((lDeficit -
                                           oldTotal)))) /
                                     (((double)
                                         ((total -
                                             oldTotal)))))));
                            
//#line 2608
/* template:array_set { */(border).set(/* template:array_get { */((runningGTotals).get(pl))/* } */ -
                              /* template:array_get { */((sendGrids).get(pl))/* } */ -
                              offset,pl)/* } */;
                        } else {
                            
//#line 2611
/* template:array_unary { */(finished).postInc(pl)/* } */;
                        }
                    } else {
                        
//#line 2615
if (/* template:array_get { */((runningPTotals).get(pl))/* } */ >=
                                            expected1) {
                            
//#line 2616
int gsize =
                              /* template:array_get { */((sendGrids).get(pl))/* } */;
                            
//#line 2617
int i =
                              0;
                            
//#line 2618
int total =
                              0;
                            
//#line 2619
int oldTotal =
                              0;
                            
//#line 2620
do  {
                                
//#line 2621
oldTotal =
                                  total;
                                
//#line 2622
total =
                                  total +
                                    /* template:array_get { */((sCountBuffer).get(/* Join: { */pl,i/* } */))/* } */;
                                
//#line 2623
i++;
                            }while(total <
                                     lDeficit &&
                                     i <
                                     gsize); 
                            
//#line 2625
double offset =
                              i -
                              1;
                            
//#line 2626
if (total >
                                                oldTotal) {
                                
//#line 2627
offset =
                                  offset +
                                    (((((double)
                                          ((lDeficit -
                                              oldTotal)))) /
                                        (((double)
                                            ((total -
                                                oldTotal))))));
                            }
                            
//#line 2629
/* template:array_set { */(border).set(/* template:array_get { */((runningGTotals).get(pl))/* } */ -
                              /* template:array_get { */((sendGrids).get(pl))/* } */ +
                              offset,pl)/* } */;
                        }
                    }
                    
//#line 2631
if (rDeficit >
                                        /* template:array_get { */((sendCount).get(pl))/* } */) {
                        
//#line 2632
/* template:array_unary { */(finished).postInc(pl)/* } */;
                    }
                    
//#line 2634
if (!(/* template:here { */x10.lang.Runtime.here()/* } */).
                                         isFirst()) {
                        
//#line 2635
int gsize =
                          /* template:array_get { */((recvGrids).get(pl))/* } */;
                        
//#line 2636
/* template:array_set { */(runningPTotals).set(/* template:array_get { */((runningPTotals).get(pl))/* } */ -
                          /* template:array_get { */((sendCount).get(pl))/* } */,pl)/* } */;
                        
//#line 2637
/* template:array_set { */(runningGTotals).set(/* template:array_get { */((runningGTotals).get(pl))/* } */ -
                          /* template:array_get { */((sendGrids).get(pl))/* } */,pl)/* } */;
                        
//#line 2638
/* template:array_set { */(sendCount).set(/* template:array_get { */((recvCount).get(pl))/* } */,pl)/* } */;
                        
//#line 2639
/* template:array_set { */(sendGrids).set(/* template:array_get { */((recvGrids).get(pl))/* } */,pl)/* } */;
                        
//#line 2640
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 2641
/* template:foreach { */
                            for (java.util.Iterator pt__ = (x10.
                                                              lang.
                                                              region.
                                                              factory.
                                                              region(
                                                              x10.
                                                                lang.
                                                                region.
                                                                factory.
                                                                region(
                                                                pl,
                                                                pl),
                                                              x10.
                                                                lang.
                                                                region.
                                                                factory.
                                                                region(
                                                                0,
                                                                gsize -
                                                                  1))).iterator(); pt__.hasNext(); ) {
                            	final  x10.
                              lang.
                              point pt = (x10.
                              lang.
                              point) pt__.next();
                            	/* Join: { *//* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { *//* } */
{
                                
//#line 2642
/* template:array_set { */(sCountBuffer).set(/* template:array_get { */((rCountBuffer).get(pt))/* } */,pt)/* } */;
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                        }
                        	} catch (Throwable tmp226) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp226);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                    }
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp225) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp225);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }while(finished.
                 sum() !=
                 0); 
        
//#line 2647
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2648
/* template:ateach { */
            {
            	x10.lang.dist __var76____distCopy = x10.
                                                   lang.
                                                   dist.
                                                   UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator __var76____ = __var76____distCopy.iterator();
            		 __var76____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var76__ = (x10.
              lang.
              point) __var76____.next();
            		/* Join: { */final int pl =
              /* template:array_get { */((__var76__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var76____distCopy.get(__var76__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int pl =
              /* template:array_get { */((__var76__).get(0))/* } */;/* } */
{
                
//#line 2649
final x10.
                  lang.
                  dist dPC =
                  particleCount.
                    distribution;
                
//#line 2650
final x10.
                  lang.
                  region rLocal =
                  X10Util.
                    get1DLRegion(
                    dPC);
                
//#line 2651
final int rsize =
                  rLocal.
                    size();
                
//#line 2652
final int offset =
                  ((rsize >
                      0))
                  ? rLocal.
                      low()
                  : 0;
                
//#line 2653
int total =
                  0;
                
//#line 2654
/* template:forloop-mult { */{
                x10.lang.region __var228__ = (x10.lang.region) particleCount.
                                                                 distribution.
                                                                 restriction(
                                                                 /* template:here { */x10.lang.Runtime.here()/* } */).
                                                                 region;
                if (__var228__.size() > 0 && (__var228__ instanceof x10.array.MultiDimRegion || __var228__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var229__ = __var228__.rank(0).low(), __var230__ = __var228__.rank(0).high(); __var229__ <= __var230__; __var229__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int i = __var229__;
                /* } */
                /* } */
{
                    
//#line 2655
final int count =
                      /* template:array_get { */((particleCount).get(i))/* } */;
                    
//#line 2656
/* template:array_set { */(sCountBuffer).set(count,/* Join: { */pl,i -
                      offset/* } */)/* } */;
                    
//#line 2657
total =
                      total +
                        count;
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var77____ = (__var228__).iterator(); __var77____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var77__ = (x10.
                  lang.
                  point) __var77____.next();
                	/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var77__).get(0))/* } */;/* } */
{
                    
//#line 2655
final int count =
                      /* template:array_get { */((particleCount).get(i))/* } */;
                    
//#line 2656
/* template:array_set { */(sCountBuffer).set(count,/* Join: { */pl,i -
                      offset/* } */)/* } */;
                    
//#line 2657
total =
                      total +
                        count;
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
                
//#line 2659
/* template:array_set { */(runningPTotals).set(/* template:array_get { */((particleTotals).get(pl))/* } */,pl)/* } */;
                
//#line 2660
/* template:array_set { */(runningGTotals).set(/* template:array_get { */((gridTotals).get(pl))/* } */,pl)/* } */;
                
//#line 2661
/* template:array_set { */(sendCount).set(total,pl)/* } */;
                
//#line 2662
/* template:array_set { */(sendGrids).set(rsize,pl)/* } */;
                
//#line 2663
/* template:array_set { */(recvCount).set(0,pl)/* } */;
                
//#line 2664
/* template:array_set { */(recvGrids).set(0,pl)/* } */;
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp227) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp227);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2666
do  {
            
//#line 2667
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 2668
/* template:ateach { */
                {
                	x10.lang.dist __var78____distCopy = x10.
                                                       lang.
                                                       dist.
                                                       UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator __var78____ = __var78____distCopy.iterator();
                		 __var78____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var78__ = (x10.
                  lang.
                  point) __var78____.next();
                		/* Join: { */final int pl =
                  /* template:array_get { */((__var78__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var78____distCopy.get(__var78__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int pl =
                  /* template:array_get { */((__var78__).get(0))/* } */;/* } */
{
                    
//#line 2669
final int expected =
                      (int)
                        ((pl *
                            countAve +
                            0.5));
                    
//#line 2670
final int lDeficit =
                      ((((int)
                           ((((pl -
                                 1)) *
                               countAve +
                               0.5)))) -
                         /* template:array_get { */((runningPTotals).get(pl))/* } */ +
                         /* template:array_get { */((sendCount).get(pl))/* } */);
                    
//#line 2671
if (lDeficit >
                                        0) {
                        
//#line 2672
final x10.
                          lang.
                          region dSBuffer =
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
                              /* template:array_get { */((sendGrids).get(pl))/* } */ -
                                1));
                        
//#line 2673
final x10.
                          lang.
                          intArray sBuffer =
                          (x10.
                            lang.
                            intArray)
                            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dSBuffer.
                                                                                                                                      toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                             	public int apply(/* Join: { */x10.
                               lang.
                               point __var79__/* } */, int dummy) { {
                                 
//#line 2673
final int i =
                                   /* template:array_get { */((__var79__).get(0))/* } */;
                                 
//#line 2674
return /* template:array_get { */((sCountBuffer).get(/* Join: { */pl,i/* } */))/* } */;
                             } }
                             }/* } */,true,false,false)/* } */);
                        
//#line 2676
final int nCount =
                          /* template:array_get { */((sendCount).get(pl))/* } */;
                        
//#line 2677
final int nGrids =
                          /* template:array_get { */((sendGrids).get(pl))/* } */;
                        
//#line 2678
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 2679
/* template:Async { */(x10.lang.Runtime.asPlace((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                            prev())).runAsync
                            	(new x10.runtime.Activity() {
                            		public void runX10Task() {
                            			{
                                
//#line 2680
/* template:array_set { */(recvCount).set(nCount,(/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                                 id)/* } */;
                                
//#line 2681
/* template:array_set { */(recvGrids).set(nGrids,(/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                                 id)/* } */;
                                
//#line 2682
/* template:foreach { */
                                for (java.util.Iterator __var80____ = (dSBuffer).iterator(); __var80____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var80__ = (x10.
                                  lang.
                                  point) __var80____.next();
                                	/* Join: { */final int i =
                                  /* template:array_get { */((__var80__).get(0))/* } */;/* } */
                                	x10.lang.Runtime.here().runAsync
                                		(new x10.runtime.Activity() {
                                			public void runX10Task() {
                                				/* Join: { *//* Join: { */final int i =
                                  /* template:array_get { */((__var80__).get(0))/* } */;/* } */
{
                                    
//#line 2683
/* template:array_set { */(rCountBuffer).set(/* template:array_get { */((sBuffer).get(i))/* } */,/* Join: { */(/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                                                                                                  id,i/* } */)/* } */;
                                }/* } */
                                			}
                                		});
                                }
                                /* } */
                                
                            }
                            		}
                            	});/* } */
                        }
                        	} catch (Throwable tmp232) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp232);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                    }
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp231) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp231);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 2688
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 2689
/* template:ateach { */
                {
                	x10.lang.dist __var81____distCopy = x10.
                                                       lang.
                                                       dist.
                                                       UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator __var81____ = __var81____distCopy.iterator();
                		 __var81____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var81__ = (x10.
                  lang.
                  point) __var81____.next();
                		/* Join: { */final int pl =
                  /* template:array_get { */((__var81__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var81____distCopy.get(__var81__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int pl =
                  /* template:array_get { */((__var81__).get(0))/* } */;/* } */
{
                    
//#line 2690
/* template:array_set { */(finished).set(0,pl)/* } */;
                    
//#line 2691
final int expected1 =
                      (int)
                        ((pl *
                            countAve +
                            0.5));
                    
//#line 2692
final int expected2 =
                      (int)
                        ((((pl -
                              1)) *
                            countAve +
                            0.5));
                    
//#line 2693
final int lDeficit =
                      expected2 -
                      /* template:array_get { */((runningPTotals).get(pl))/* } */ +
                      /* template:array_get { */((sendCount).get(pl))/* } */;
                    
//#line 2694
final int rDeficit =
                      /* template:array_get { */((runningPTotals).get(pl))/* } */ -
                      expected1;
                    
//#line 2695
if (/* template:array_get { */((runningPTotals).get(pl))/* } */ <
                                        expected1) {
                        
//#line 2696
if (/* template:array_get { */((runningPTotals).get(pl))/* } */ +
                                            /* template:array_get { */((recvCount).get(pl))/* } */ >=
                                            expected1) {
                            
//#line 2697
final int gsize =
                              /* template:array_get { */((recvGrids).get(pl))/* } */;
                            
//#line 2698
int oldTotal =
                              0;
                            
//#line 2699
int total =
                              0;
                            
//#line 2700
int i =
                              0;
                            
//#line 2701
do  {
                                
//#line 2702
oldTotal =
                                  total;
                                
//#line 2703
total =
                                  total +
                                    /* template:array_get { */((rCountBuffer).get(/* Join: { */pl,i/* } */))/* } */;
                                
//#line 2704
i++;
                            }while(total <
                                     -rDeficit &&
                                     i <
                                     gsize); 
                            
//#line 2706
final int offset =
                              (int)
                                ((i -
                                    1 +
                                    (((((double)
                                          ((-rDeficit -
                                              oldTotal)))) /
                                        (((double)
                                            ((total -
                                                oldTotal))))))));
                            
//#line 2707
/* template:array_set { */(border).set(/* template:array_get { */((runningGTotals).get(pl))/* } */ +
                              offset,pl)/* } */;
                        } else {
                            
//#line 2710
/* template:array_unary { */(finished).postInc(pl)/* } */;
                        }
                    }
                    
//#line 2713
if (lDeficit >
                                        /* template:array_get { */((sendCount).get(pl))/* } */) {
                        
//#line 2714
/* template:array_unary { */(finished).postInc(pl)/* } */;
                    }
                    
//#line 2716
if (!(/* template:here { */x10.lang.Runtime.here()/* } */).
                                         isLast()) {
                        
//#line 2717
final int count =
                          /* template:array_get { */((recvCount).get(pl))/* } */;
                        
//#line 2718
final int gsize =
                          /* template:array_get { */((recvGrids).get(pl))/* } */;
                        
//#line 2719
/* template:array_set { */(runningPTotals).set(/* template:array_get { */((runningPTotals).get(pl))/* } */ +
                          count,pl)/* } */;
                        
//#line 2720
/* template:array_set { */(runningGTotals).set(/* template:array_get { */((runningGTotals).get(pl))/* } */ +
                          gsize,pl)/* } */;
                        
//#line 2721
/* template:array_set { */(sendCount).set(count,pl)/* } */;
                        
//#line 2722
/* template:array_set { */(sendGrids).set(gsize,pl)/* } */;
                        
//#line 2723
/* template:foreach { */
                        for (java.util.Iterator pt__ = (x10.
                                                          lang.
                                                          region.
                                                          factory.
                                                          region(
                                                          x10.
                                                            lang.
                                                            region.
                                                            factory.
                                                            region(
                                                            pl,
                                                            pl),
                                                          x10.
                                                            lang.
                                                            region.
                                                            factory.
                                                            region(
                                                            0,
                                                            gsize -
                                                              1))).iterator(); pt__.hasNext(); ) {
                        	final  x10.
                          lang.
                          point pt = (x10.
                          lang.
                          point) pt__.next();
                        	/* Join: { *//* } */
                        	x10.lang.Runtime.here().runAsync
                        		(new x10.runtime.Activity() {
                        			public void runX10Task() {
                        				/* Join: { *//* Join: { *//* } */
{
                            
//#line 2724
/* template:array_set { */(sCountBuffer).set(/* template:array_get { */((rCountBuffer).get(pt))/* } */,pt)/* } */;
                        }/* } */
                        			}
                        		});
                        }
                        /* } */
                        
                    }
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp233) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp233);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }while(finished.
                 sum() !=
                 0); 
        
//#line 2729
final x10.
          lang.
          place pHere =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2730
final x10.
          lang.
          dist dBounds =
          x10.
            lang.
            dist.
            factory.
            constant(
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
                x10.
                  lang.
                  place.
                  MAX_PLACES)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 2731
final x10.
          lang.
          IntReferenceArray lowerbounds =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dBounds,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 2732
final x10.
          lang.
          IntReferenceArray upperbounds =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dBounds,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 2733
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2734
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 2735
final double edge =
                  /* template:array_get { */((border).get(pl))/* } */;
                
//#line 2736
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 2737
/* template:array_set { */(lowerbounds).set((int)
                                                                                ((edge +
                                                                                    0.5)),pl)/* } */;
                }
                		}
                	});/* } */
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp234) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp234);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2740
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
                                           x10.
                                             lang.
                                             place.
                                             MAX_PLACES -
                                             1))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 2741
final int lb =
              /* template:array_get { */((lowerbounds).get(i))/* } */;
            
//#line 2742
/* template:forloop { */
            for (java.util.Iterator j__ = (x10.
                                             lang.
                                             region.
                                             factory.
                                             region(
                                             x10.
                                               lang.
                                               region.
                                               factory.
                                               region(
                                               /* template:array_get { */((i).get(0))/* } */ +
                                                 1,
                                               x10.
                                                 lang.
                                                 place.
                                                 MAX_PLACES -
                                                 1))).iterator(); j__.hasNext(); ) {
            	final  x10.
              lang.
              point j = (x10.
              lang.
              point) j__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 2743
if (/* template:array_get { */((lowerbounds).get(j))/* } */ <=
                                    lb) {
                    
//#line 2744
/* template:array_set { */(lowerbounds).set(lb +
                      1,j)/* } */;
                }
            }/* } */
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
        
//#line 2748
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
                                           x10.
                                             lang.
                                             place.
                                             MAX_PLACES -
                                             2))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 2749
/* template:array_set { */(upperbounds).set(/* template:array_get { */((lowerbounds).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i))/* } */.add(x10.
                                                                                                                                                                                                             lang.
                                                                                                                                                                                                             point.
                                                                                                                                                                                                             factory.
                                                                                                                                                                                                             point(
                                                                                                                                                                                                             1))))/* } */ -
              1,i)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 2751
/* template:array_set { */(upperbounds).set(YLENGTH -
          1,x10.
              lang.
              place.
              MAX_PLACES -
          1)/* } */;
        
//#line 2752
x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                x10.
                  lang.
                  region.
                  factory.
                  emptyRegion(
                  2),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 2753
/* template:forloop { */
        for (java.util.Iterator pl__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pl__.hasNext(); ) {
        	final  x10.
          lang.
          point pl = (x10.
          lang.
          point) pl__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 2754
final x10.
              lang.
              place p =
              x10.
                lang.
                dist.
                UNIQUE.
                get(
                pl);
            
//#line 2755
dResult =
              dResult.
                union(
                (x10.
                   lang.
                   dist.
                   factory.
                   constant(
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
                       /* template:array_get { */((lowerbounds).get(pl))/* } */,
                       /* template:array_get { */((upperbounds).get(pl))/* } */),
                     rRows),
                   p)));
        }/* } */
        }
        /* } */
        
        
//#line 2757
return dResult;
    }
    
    
//#line 2759
public x10.
                    lang.
                    GenericReferenceArray
                    sortParticles(
                    final x10.
                      lang.
                      GenericReferenceArray particles,
                    final x10.
                      lang.
                      dist dField) {
        
//#line 2760
final x10.
          lang.
          dist dParticles =
          particles.
            distribution;
        
//#line 2761
final x10.
          lang.
          GenericReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dParticles,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 2762
final x10.
          lang.
          IntReferenceArray indices =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dParticles,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 2763
final x10.
          lang.
          dist dCount =
          X10Util.
            get2DDistRank(
            dField,
            0);
        
//#line 2764
final x10.
          lang.
          IntReferenceArray count =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dCount,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2765
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2767
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2768
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 2769
final x10.
                  lang.
                  dist dP =
                  particles.
                    distribution;
                
//#line 2770
final x10.
                  lang.
                  region rLocalP =
                  X10Util.
                    get1DLRegion(
                    dP);
                
//#line 2771
final x10.
                  lang.
                  region rLocalC =
                  X10Util.
                    get1DLRegion(
                    dCount);
                
//#line 2772
/* template:forloop { */
                for (java.util.Iterator pt__ = (particles.
                                                  distribution.
                                                  restriction(
                                                  /* template:here { */x10.lang.Runtime.here()/* } */).
                                                  region).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 2773
final int y =
                      (int)
                        /* template:parametric { */((Particle)(/* template:array_get { */((particles).get(pt))/* } */))/* } */.
                          getY();
                    
//#line 2774
/* template:array_unary { */(count).postInc(y)/* } */;
                    
//#line 2775
/* template:array_set { */(indices).set(y,pt)/* } */;
                }/* } */
                }
                /* } */
                
                
//#line 2777
final x10.
                  lang.
                  dist dLocalC =
                  x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    rLocalC,
                    /* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 2778
int offset =
                  ((rLocalP.
                      size() >
                      0))
                  ? rLocalP.
                      low()
                  : 0;
                
//#line 2779
x10.
                  lang.
                  IntReferenceArray offsets =
                  /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dLocalC,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
                
//#line 2780
/* template:forloop { */
                for (java.util.Iterator pt__ = (rLocalC).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 2781
final int n =
                      /* template:array_get { */((count).get(pt))/* } */;
                    
//#line 2782
/* template:array_set { */(offsets).set(offset,pt)/* } */;
                    
//#line 2783
offset =
                      offset +
                        n;
                }/* } */
                }
                /* } */
                
                
//#line 2785
/* template:forloop { */
                for (java.util.Iterator pt__ = (rLocalP).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 2786
final int index =
                      /* template:array_get { */((indices).get(pt))/* } */;
                    
//#line 2787
/* template:array_set { */(indices).set(/* template:array_get { */((offsets).get(index))/* } */,pt)/* } */;
                    
//#line 2788
/* template:array_unary { */(offsets).postInc(index)/* } */;
                }/* } */
                }
                /* } */
                
                
//#line 2790
/* template:foreach { */
                for (java.util.Iterator i__ = (rLocalP).iterator(); i__.hasNext(); ) {
                	final  x10.
                  lang.
                  point i = (x10.
                  lang.
                  point) i__.next();
                	/* Join: { *//* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { *//* } */
{
                    
//#line 2791
/* template:array_set { */(result).set(/* template:parametric { */((Particle)(/* template:array_get { */((particles).get(i))/* } */))/* } */,/* template:array_get { */((indices).get(i))/* } */)/* } */;
                }/* } */
                			}
                		});
                }
                /* } */
                
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp235) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp235);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2794
return result;
    }
    
    
//#line 2796
public x10.
                    lang.
                    IntReferenceArray
                    parallelPrefix(
                    final x10.
                      lang.
                      IntReferenceArray data) {
        
//#line 2797
final x10.
          lang.
          dist dData =
          data.
            distribution;
        
//#line 2798
final x10.
          lang.
          IntReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dData,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2799
return /* template:array_get { */((data).get(pt))/* } */;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2801
final x10.
          lang.
          IntReferenceArray tmp1 =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dData,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2802
return /* template:array_get { */((data).get(pt))/* } */;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2804
final x10.
          lang.
          IntReferenceArray tmp2 =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dData,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2805
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2807
int strides =
          1;
        
//#line 2808
while (strides <
                               x10.
                                 lang.
                                 place.
                                 MAX_PLACES) {
            
//#line 2809
final int stride =
              strides;
            
//#line 2810
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 2811
/* template:ateach { */
                {
                	x10.lang.dist pl__distCopy = x10.
                                                lang.
                                                dist.
                                                UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator pl__ = pl__distCopy.iterator();
                		 pl__.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point pl = (x10.
                  lang.
                  point) pl__.next();
                		/* Join: { *//* } */
                		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { *//* } */
{
                    
//#line 2812
final int dir =
                      ((/* template:array_get { */((pl).get(0))/* } */ /
                          stride)) %
                      2;
                    
//#line 2813
final int val =
                      /* template:array_get { */((tmp1).get(pl))/* } */;
                    
//#line 2814
final x10.
                      lang.
                      place pDst =
                      x10.
                        lang.
                        place.
                        places(
                        /* template:array_get { */((pl).get(0))/* } */ +
                          ((((dir ==
                                0))
                              ? 1
                              : -1)) *
                          stride);
                    
//#line 2815
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 2816
/* template:Async { */(x10.lang.Runtime.asPlace(pDst)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 2817
if (dir ==
                                                0) {
                                
//#line 2818
/* template:array_set { */(result).set(/* template:array_get { */((result).get((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                                                               id))/* } */ +
                                  val,(/* template:here { */x10.lang.Runtime.here()/* } */).
                                        id)/* } */;
                            }
                            
//#line 2820
/* template:array_set { */(tmp2).set(val,(/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                     id)/* } */;
                        }
                        		}
                        	});/* } */
                    }
                    	} catch (Throwable tmp237) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp237);
                    	} finally {
                    		x10.lang.Runtime.getCurrentActivity().stopFinish();
                    	}
                    }
                    /* } */
                    
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp236) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp236);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 2823
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 2824
/* template:ateach { */
                {
                	x10.lang.dist pl__distCopy = x10.
                                                lang.
                                                dist.
                                                UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator pl__ = pl__distCopy.iterator();
                		 pl__.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point pl = (x10.
                  lang.
                  point) pl__.next();
                		/* Join: { *//* } */
                		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { *//* } */
{
                    
//#line 2825
/* template:array_set { */(tmp1).set(/* template:array_get { */((tmp1).get(pl))/* } */ +
                      /* template:array_get { */((tmp2).get(pl))/* } */,pl)/* } */;
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp238) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp238);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 2827
strides =
              strides +
                strides;
        }
        
//#line 2829
return result;
    }
}

class Particle
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 2834
final private double
      x;
    
//#line 2835
final private double
      y;
    
//#line 2836
final private double
      xVel;
    
//#line 2837
final private double
      yVel;
    
//#line 2838
final private int
      pid;
    
    
//#line 2839
public Particle() {
        
//#line 2839
super();
        
//#line 2840
x =
          0.0;
        
//#line 2841
y =
          0.0;
        
//#line 2842
xVel =
          0.0;
        
//#line 2843
yVel =
          0.0;
        
//#line 2844
pid =
          -1;
    }
    
    
//#line 2846
public Particle(final double x,
                                  final double y,
                                  final double xVel,
                                  final double yVel) {
        
//#line 2846
super();
        
//#line 2847
this.
                        x =
          x;
        
//#line 2848
this.
                        y =
          y;
        
//#line 2849
this.
                        xVel =
          xVel;
        
//#line 2850
this.
                        yVel =
          yVel;
        
//#line 2851
pid =
          -1;
    }
    
    
//#line 2853
public Particle(final double x,
                                  final double y,
                                  final double xVel,
                                  final double yVel,
                                  final int pid) {
        
//#line 2853
super();
        
//#line 2854
this.
                        x =
          x;
        
//#line 2855
this.
                        y =
          y;
        
//#line 2856
this.
                        xVel =
          xVel;
        
//#line 2857
this.
                        yVel =
          yVel;
        
//#line 2858
this.
                        pid =
          pid;
    }
    
    
//#line 2860
public double
                    getX(
                    ) {
        
//#line 2861
return x;
    }
    
    
//#line 2863
public double
                    getY(
                    ) {
        
//#line 2864
return y;
    }
    
    
//#line 2866
public double
                    getXVel(
                    ) {
        
//#line 2867
return xVel;
    }
    
    
//#line 2869
public double
                    getYVel(
                    ) {
        
//#line 2870
return yVel;
    }
    
    
//#line 2872
public Particle
                    setX(
                    final double x) {
        
//#line 2873
return new Particle(
          x,
          y,
          xVel,
          yVel,
          pid);
    }
    
    
//#line 2875
public Particle
                    setY(
                    final double y) {
        
//#line 2876
return new Particle(
          x,
          y,
          xVel,
          yVel,
          pid);
    }
    
    
//#line 2878
public Particle
                    setXVel(
                    final double xVel) {
        
//#line 2879
return new Particle(
          x,
          y,
          xVel,
          yVel,
          pid);
    }
    
    
//#line 2881
public Particle
                    setYVel(
                    final double yVel) {
        
//#line 2882
return new Particle(
          x,
          y,
          xVel,
          yVel,
          pid);
    }
    
    
//#line 2884
public Particle
                    setPos(
                    final double x,
                    final double y) {
        
//#line 2885
return new Particle(
          x,
          y,
          xVel,
          yVel,
          pid);
    }
    
    
//#line 2887
public Particle
                    setVel(
                    final double xVel,
                    final double yVel) {
        
//#line 2888
return new Particle(
          x,
          y,
          xVel,
          yVel,
          pid);
    }
    
    
//#line 2890
public java.
                    lang.
                    String
                    toString(
                    ) {
        
//#line 2891
java.
          lang.
          String result =
          ((pid >=
              0))
          ? "p" +
        pid
          : "";
        
//#line 2892
result =
          result +
          "(" +
          x +
          "," +
          y +
          "," +
          xVel +
          "," +
          yVel +
          ")";
        
//#line 2893
return result;
    }
    
    
//#line 2895
public boolean
                    particleEquals(
                    final Particle p) {
        
//#line 2896
final double error =
          X10Util.
            ERROR;
        
//#line 2897
if (pid >=
                            0 &&
                            pid !=
                            p.
                              pid) {
            
//#line 2898
return false;
        }
        
//#line 2900
return (((java.
                                  lang.
                                  Math.
                                  abs(
                                  getX() -
                                    p.
                                      getX()) <
                                  error)) &&
                                ((java.
                                    lang.
                                    Math.
                                    abs(
                                    getY() -
                                      p.
                                        getY()) <
                                    error)) &&
                                ((java.
                                    lang.
                                    Math.
                                    abs(
                                    getXVel() -
                                      p.
                                        getXVel()) <
                                    error)) &&
                                ((java.
                                    lang.
                                    Math.
                                    abs(
                                    getYVel() -
                                      p.
                                        getYVel()) <
                                    error)));
    }
}

class ArrayUtil
extends x10.
  lang.
  Object
{
    
    
//#line 2905
public static x10.
                    lang.
                    GenericReferenceArray
                    doubleToComplex(
                    final x10.
                      lang.
                      DoubleReferenceArray src) {
        
//#line 2906
final x10.
          lang.
          region rSrc =
          src.
            region;
        
//#line 2907
final x10.
          lang.
          region rS2 =
          X10Util.
            getRank2D(
            rSrc,
            1);
        
//#line 2908
if (rS2.
                            size() %
                            2 !=
                            0) {
            
//#line 2909
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                          lang.
                                                                                                          System.
                                                                                                          err))/* } */.println("Error: doubleToComplex requires the second " +
                                                                                                                               "dimension to be of even size");
            
//#line 2910
final x10.
              lang.
              dist dResult =
              (x10.
                lang.
                dist)
                ((x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    x10.
                      lang.
                      region.
                      factory.
                      emptyRegion(
                      2),
                    /* template:here { */x10.lang.Runtime.here()/* } */)));
            
//#line 2911
return /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dResult,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        }
        
//#line 2913
final x10.
          lang.
          region rD2 =
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
              rS2.
                size() /
                2 -
                1));
        
//#line 2914
final x10.
          lang.
          dist dSrc =
          src.
            distribution;
        
//#line 2915
final x10.
          lang.
          dist dResult =
          X10Util.
            extendDistRank2D(
            X10Util.
              get2DDistRank(
              dSrc,
              0),
            rD2);
        
//#line 2916
final x10.
          lang.
          GenericReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dResult,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 2917
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2918
/* template:ateach { */
            {
            	x10.lang.dist pt__distCopy = dResult; // make copy to avoid recomputation
            	for (java.util.Iterator pt__ = pt__distCopy.iterator();
            		 pt__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pt = (x10.
              lang.
              point) pt__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pt__distCopy.get(pt)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 2919
/* template:array_set { */(result).set(new Complex(
                  /* template:array_get { */((src).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pt))/* } */.mul(x10.
                                                                                                                                                  lang.
                                                                                                                                                  point.
                                                                                                                                                  factory.
                                                                                                                                                  point(
                                                                                                                                                  1,
                                                                                                                                                  2))))/* } */,
                  /* template:array_get { */((src).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pt))/* } */.mul(x10.
                                                                                                                                                                                                                           lang.
                                                                                                                                                                                                                           point.
                                                                                                                                                                                                                           factory.
                                                                                                                                                                                                                           point(
                                                                                                                                                                                                                           1,
                                                                                                                                                                                                                           2))))/* } */.add(x10.
                                                                                                                                                                                                                                              lang.
                                                                                                                                                                                                                                              point.
                                                                                                                                                                                                                                              factory.
                                                                                                                                                                                                                                              point(
                                                                                                                                                                                                                                              0,
                                                                                                                                                                                                                                              1))))/* } */),pt)/* } */;
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp239) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp239);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2921
return result;
    }
    
    
//#line 2923
public static x10.
                    lang.
                    DoubleReferenceArray
                    complexToDouble(
                    final x10.
                      lang.
                      GenericReferenceArray src) {
        
//#line 2924
final x10.
          lang.
          region rSrc =
          src.
            region;
        
//#line 2925
final x10.
          lang.
          region rS2 =
          X10Util.
            getRank2D(
            rSrc,
            1);
        
//#line 2926
final x10.
          lang.
          region rD2 =
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
              2 *
                rS2.
                  size() -
                1));
        
//#line 2927
final x10.
          lang.
          dist dSrc =
          src.
            distribution;
        
//#line 2928
final x10.
          lang.
          dist dResult =
          X10Util.
            extendDistRank2D(
            X10Util.
              get2DDistRank(
              dSrc,
              0),
            rD2);
        
//#line 2929
final x10.
          lang.
          DoubleReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dResult,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 2930
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2931
/* template:ateach { */
            {
            	x10.lang.dist pt__distCopy = dResult; // make copy to avoid recomputation
            	for (java.util.Iterator pt__ = pt__distCopy.iterator();
            		 pt__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pt = (x10.
              lang.
              point) pt__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pt__distCopy.get(pt)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 2932
final x10.
                  lang.
                  point ptd2 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pt))/* } */.div(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1,
                                                                                                             2));
                
//#line 2933
if (/* template:array_get { */((pt).get(1))/* } */ %
                                    2 ==
                                    0) {
                    
//#line 2934
/* template:array_set { */(result).set(/* template:parametric { */((Complex)(/* template:array_get { */((src).get(ptd2))/* } */))/* } */.
                                                                           getReal(),pt)/* } */;
                } else {
                    
//#line 2937
/* template:array_set { */(result).set(/* template:parametric { */((Complex)(/* template:array_get { */((src).get(ptd2))/* } */))/* } */.
                                                                           getImag(),pt)/* } */;
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp240) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp240);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2940
return result;
    }
    
    
//#line 2942
public static x10.
                    lang.
                    GenericReferenceArray
                    transpose(
                    final x10.
                      lang.
                      GenericReferenceArray data) {
        
//#line 2943
final x10.
          lang.
          dist dData =
          (x10.
            lang.
            dist)
            data.
              distribution;
        
//#line 2944
if (!X10Util.
                             isDistBlockStar(
                             dData)) {
            
//#line 2945
X10Util.
                            println(
                            "Transpose only works on star block" +
                            "distributed arrays");
            
//#line 2946
throw new java.
              lang.
              RuntimeException(
              "transpose: " +
              data.
                distribution);
        }
        
//#line 2948
final x10.
          lang.
          dist dResult =
          X10Util.
            transposeBlockStar(
            dData);
        
//#line 2949
final x10.
          lang.
          GenericReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dResult,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 2950
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2951
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 2952
final x10.
                  lang.
                  region rLocal =
                  X10Util.
                    get2DLRegion(
                    dData);
                
//#line 2953
final x10.
                  lang.
                  region rTtmp =
                  X10Util.
                    transposeRegion(
                    rLocal);
                
//#line 2954
if (rLocal.
                                    size() >
                                    0) {
                    
//#line 2955
final x10.
                      lang.
                      region rTtmp1 =
                      X10Util.
                        getRank2D(
                        rTtmp,
                        0);
                    
//#line 2956
final x10.
                      lang.
                      region rTtmp2 =
                      X10Util.
                        getRank2D(
                        rTtmp,
                        1);
                    
//#line 2957
final x10.
                      lang.
                      region rLocalT =
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
                          rTtmp1.
                            low(),
                          rTtmp1.
                            high()),
                        x10.
                          lang.
                          region.
                          factory.
                          region(
                          rTtmp2.
                            low(),
                          rTtmp2.
                            high()));
                    
//#line 2958
final x10.
                      lang.
                      region rRSBuffer =
                      (x10.
                        lang.
                        region)
                        x10.
                          lang.
                          dist.
                          UNIQUE.
                          region;
                    
//#line 2959
final x10.
                      lang.
                      GenericReferenceArray rSBuffer =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(rRSBuffer.
                                                                                                                                      toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                         	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                           lang.
                           point p/* } */, x10.compilergenerated.Parameter1 dummy) { {
                             
//#line 2960
final x10.
                               lang.
                               region rTLocal =
                               (x10.
                                 lang.
                                 region)
                                 ((dResult.
                                     restriction(
                                     x10.
                                       lang.
                                       dist.
                                       UNIQUE.
                                       get(
                                       p)))).
                                   region;
                             
//#line 2961
return rLocalT.
                                                    intersection(
                                                    rTLocal);
                         } }
                         }/* } */,true,false,true)/* } */);
                    
//#line 2963
final x10.
                      lang.
                      GenericReferenceArray sBuffer =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(rLocalT.
                                                                                                                                      toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                         	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                           lang.
                           point __var82__/* } */, x10.compilergenerated.Parameter1 dummy) { {
                             
//#line 2963
final int i =
                               /* template:array_get { */((__var82__).get(0))/* } */;
                             
//#line 2963
final int j =
                               /* template:array_get { */((__var82__).get(1))/* } */;
                             
//#line 2964
return /* template:parametric { */((Complex)(/* template:array_get { */((data).get(/* Join: { */j,i/* } */))/* } */))/* } */;
                         } }
                         }/* } */,true,false,true)/* } */);
                    
//#line 2966
/* template:foreach { */
                    for (java.util.Iterator i__ = (rSBuffer.
                                                     distribution).iterator(); i__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point i = (x10.
                      lang.
                      point) i__.next();
                    	/* Join: { *//* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { *//* } */
{
                        
//#line 2967
/* template:ateach { */
                        {
                        	x10.lang.dist pt__distCopy = x10.
                                                        lang.
                                                        dist.
                                                        factory.
                                                        constant(
                                                        /* template:parametric { */((x10.
                                                          lang.
                                                          region)(/* template:array_get { */((rSBuffer).get(i))/* } */))/* } */,
                                                        x10.
                                                          lang.
                                                          dist.
                                                          UNIQUE.
                                                          get(
                                                          i)); // make copy to avoid recomputation
                        	for (java.util.Iterator pt__ = pt__distCopy.iterator();
                        		 pt__.hasNext(); )
                        	{
                        		final  x10.
                          lang.
                          point pt = (x10.
                          lang.
                          point) pt__.next();
                        		/* Join: { *//* } */
                        		((x10.runtime.Place) pt__distCopy.get(pt)).runAsync
                        			(new x10.runtime.Activity() {
                        				public void runX10Task() {
                        					/* Join: { *//* Join: { *//* } */
{
                            
//#line 2968
/* template:array_set { */(result).set(/* template:parametric { */((Complex)(/* template:array_get { */((sBuffer).get(pt))/* } */))/* } */,pt)/* } */;
                        }/* } */
                        				}
                        			});
                        	}
                        }
                        /* } */
                        
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp241) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp241);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2973
return result;
    }
    
    
//#line 2904
public ArrayUtil() {
        
//#line 2904
super();
    }
}

class Timer
extends x10.
  lang.
  Object
{
    
//#line 2978
final public static int
      max_counters =
      64;
    
//#line 2979
private x10.
      lang.
      DoubleReferenceArray
      start_time;
    
//#line 2980
private x10.
      lang.
      DoubleReferenceArray
      elapsed_time;
    
//#line 2981
private x10.
      lang.
      DoubleReferenceArray
      total_time;
    
    
//#line 2982
public Timer() {
        
//#line 2982
super();
        
//#line 2983
final x10.
          lang.
          dist d =
          x10.
            lang.
            dist.
            factory.
            constant(
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
                max_counters)),
            x10.
              lang.
              place.
              FIRST_PLACE);
        
//#line 2984
start_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 2985
return 0;
           } }
           }/* } */,true,true,false)/* } */);
        
//#line 2987
elapsed_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 2988
return 0;
           } }
           }/* } */,true,true,false)/* } */);
        
//#line 2990
total_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 2991
return 0;
           } }
           }/* } */,true,true,false)/* } */);
    }
    
    
//#line 2994
public void
                    start(
                    final int n) {
        
//#line 2995
/* template:array_set { */(start_time).set(java.
                                                                   lang.
                                                                   System.
                                                                   currentTimeMillis(),n)/* } */;
    }
    
    
//#line 2997
public void
                    stop(
                    final int n) {
        
//#line 2998
/* template:array_set { */(elapsed_time).set(java.
                                                                     lang.
                                                                     System.
                                                                     currentTimeMillis() -
          /* template:array_get { */((start_time).get(n))/* } */,n)/* } */;
        
//#line 2999
/* template:array_set { */(elapsed_time).set(/* template:array_get { */((elapsed_time).get(n))/* } */ /
          1000,n)/* } */;
        
//#line 3000
/* template:array_set { */(total_time).set(/* template:array_get { */((total_time).get(n))/* } */ +
          /* template:array_get { */((elapsed_time).get(n))/* } */,n)/* } */;
    }
    
    
//#line 3002
public double
                    readTimer(
                    final int n) {
        
//#line 3003
return /* template:array_get { */((total_time).get(n))/* } */;
    }
    
    
//#line 3005
public void
                    resetTimer(
                    final int n) {
        
//#line 3006
/* template:array_set { */(total_time).set(0,n)/* } */;
        
//#line 3007
/* template:array_set { */(start_time).set(0,n)/* } */;
        
//#line 3008
/* template:array_set { */(elapsed_time).set(0,n)/* } */;
    }
    
    
//#line 3010
public void
                    resetAllTimers(
                    ) {
        
//#line 3011
int i =
          0;
        
//#line 3012
while (i <
                               max_counters) {
            
//#line 3013
resetTimer(
                            i);
            
//#line 3014
i++;
        }
    }
}
