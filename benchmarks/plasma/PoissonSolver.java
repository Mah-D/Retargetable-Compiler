import x10.lang.*;

public class PoissonSolver
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 6
final public static double
      PI4I =
      0.5 /
      6.28318530717959;
    
//#line 7
final public static double
      SQT2I =
      0.707106781186548;
    
//#line 8
final public static double
      SQT2PI =
      0.797884560802865;
    
//#line 13
final public static int
      GREENS_IDX =
      0;
    
//#line 14
final public static int
      SHAPE_IDX =
      1;
    
//#line 15
final public static int
      ELECX_IDX =
      2;
    
//#line 16
final public static int
      ELECY_IDX =
      3;
    
//#line 19
final public static double
      AR =
      0.912871;
    
//#line 24
final public int
      x;
    
//#line 25
final public int
      y;
    
//#line 26
final public int
      xBits;
    
//#line 27
final public int
      yBits;
    
//#line 28
final public double
      ari;
    
//#line 29
final public double
      affp;
    
//#line 30
final public FourierTransform2D
      fft;
    
//#line 31
final public x10.
      lang.
      DoubleReferenceArray
      ffg;
    
//#line 32
final public x10.
      lang.
      doubleArray
      ffg2;
    
    
//#line 34
public PoissonSolver(final int xBits,
                                     final int yBits,
                                     final double affp) {
        
//#line 34
super();
        
//#line 35
this.
                      xBits =
          xBits;
        
//#line 36
this.
                      yBits =
          yBits;
        
//#line 37
this.
                      affp =
          affp;
        
//#line 39
final int x0 =
          1 <<
          xBits;
        
//#line 40
final int y0 =
          1 <<
          yBits;
        
//#line 41
x =
          x0;
        
//#line 42
y =
          y0;
        
//#line 43
ari =
          0;
        
//#line 45
final FourierTransform2D fft0 =
          new FourierTransform2D(
          yBits +
            1,
          xBits +
            1);
        
//#line 47
fft =
          fft0;
        
//#line 49
final x10.
          lang.
          DoubleReferenceArray tables =
          initTables(
            fft0,
            x0,
            y0,
            affp);
        
//#line 50
ffg =
          makeFFG(
            tables,
            x0,
            y0);
        
//#line 51
ffg2 =
          makeFFG2(
            tables,
            x0,
            y0);
        
//#line 52
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("Poisson Solver initialized");
    }
    
    
//#line 60
public x10.
                  lang.
                  DoubleReferenceArray
                  initTables(
                  final FourierTransform2D fft,
                  final int x,
                  final int y,
                  final double affp) {
        
//#line 64
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
        
//#line 65
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
        
//#line 66
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
        
//#line 67
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
        
//#line 69
final x10.
          lang.
          place first =
          x10.
            lang.
            place.
            FIRST_PLACE;
        
//#line 70
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
        
//#line 72
final x10.
          lang.
          dist dTable =
          dTable1.
            union(
            dTable2);
        
//#line 73
final x10.
          lang.
          DoubleReferenceArray table =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dTable,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 75
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("Init: Green\'s function");
        
//#line 76
initGreensFnTable(
                      table,
                      fft,
                      x,
                      y,
                      affp);
        
//#line 77
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("Init: Shape factor");
        
//#line 78
initShapeFactorTable(
                      table,
                      fft,
                      x,
                      y,
                      affp);
        
//#line 79
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("Init: X Electric field");
        
//#line 80
initElectricFieldXTable(
                      table,
                      fft,
                      x,
                      y,
                      affp);
        
//#line 81
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("Init: Y Electric field");
        
//#line 82
initElectricFieldYTable(
                      table,
                      fft,
                      x,
                      y,
                      affp);
        
//#line 84
return table;
    }
    
    
//#line 90
public x10.
                  lang.
                  DoubleReferenceArray
                  makeFFG(
                  final x10.
                    lang.
                    DoubleReferenceArray table,
                  final int x,
                  final int y) {
        
//#line 93
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
        
//#line 94
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
        
//#line 95
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
        
//#line 96
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
        
//#line 98
return /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dResult,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point pt/* } */, double dummy) { {
            
//#line 98
return /* template:array_get { */((table).get(pt))/* } */;
        } }
        }/* } */,true,true,false)/* } */;
    }
    
    
//#line 101
public x10.
                   lang.
                   doubleArray
                   makeFFG2(
                   final x10.
                     lang.
                     DoubleReferenceArray table,
                   final int x,
                   final int y) {
        
//#line 104
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
        
//#line 105
return (x10.
                              lang.
                              doubleArray)
                              (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(rResult.
                                                                                                                                           toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                               	public double apply(/* Join: { */x10.
                                 lang.
                                 point __var58__/* } */, double dummy) { {
                                   
//#line 107
final int i =
                                     /* template:array_get { */((__var58__).get(0))/* } */;
                                   
//#line 107
final int j =
                                     /* template:array_get { */((__var58__).get(1))/* } */;
                                   
//#line 108
final x10.
                                     lang.
                                     place pHere =
                                     /* template:here { */x10.lang.Runtime.here()/* } */;
                                   
//#line 109
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
                                   
//#line 110
final x10.
                                     lang.
                                     DoubleReferenceArray rcv =
                                     /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dDst,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
                                   
//#line 111
/* template:finish { */
                                   {
                                   	x10.lang.Runtime.getCurrentActivity().startFinish();
                                   	try {
                                   		{
                                       
//#line 111
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                                                      lang.
                                                                                                      place.
                                                                                                      FIRST_PLACE)).runAsync
                                       	(new x10.runtime.Activity() {
                                       		public void runX10Task() {
                                       			{
                                           
//#line 112
final double val =
                                             /* template:array_get { */((table).get(/* Join: { */x,i,j/* } */))/* } */;
                                           
//#line 113
/* template:finish { */
                                           {
                                           	x10.lang.Runtime.getCurrentActivity().startFinish();
                                           	try {
                                           		{
                                               
//#line 113
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                                               	(new x10.runtime.Activity() {
                                               		public void runX10Task() {
                                               			{
                                                   
//#line 114
/* template:array_set { */(rcv).set(val,0)/* } */;
                                               }
                                               		}
                                               	});/* } */
                                           }
                                           	} catch (Throwable tmp195) {
                                           		x10.lang.Runtime.getCurrentActivity().pushException(tmp195);
                                           	} finally {
                                           		x10.lang.Runtime.getCurrentActivity().stopFinish();
                                           	}
                                           }
                                           /* } */
                                           
                                       }
                                       		}
                                       	});/* } */
                                   }
                                   	} catch (Throwable tmp194) {
                                   		x10.lang.Runtime.getCurrentActivity().pushException(tmp194);
                                   	} finally {
                                   		x10.lang.Runtime.getCurrentActivity().stopFinish();
                                   	}
                                   }
                                   /* } */
                                   
                                   
//#line 117
return /* template:array_get { */((rcv).get(0))/* } */;
                               } }
                               }/* } */,true,false,false)/* } */);
    }
    
    
//#line 127
public void
                   initGreensFnTable(
                   final x10.
                     lang.
                     DoubleReferenceArray table,
                   final FourierTransform2D fft,
                   final int x,
                   final int y,
                   final double affp) {
        
//#line 132
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
        
//#line 133
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
        
//#line 134
final x10.
          lang.
          dist dGreen =
          X10Util.
            distBlockStar2(
            r1,
            r2);
        
//#line 136
final x10.
          lang.
          DoubleReferenceArray f =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dGreen,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 137
final double invRadius =
          ((AR >
              0.0))
          ? 1.0 /
          AR
          : 0.0;
        
//#line 138
final double N =
          4 *
          x *
          y;
        
//#line 141
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 141
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
                
//#line 142
if (/* template:array_get { */((pl).get(0))/* } */ <=
                                   2 *
                                   y) {
                    
//#line 143
final x10.
                      lang.
                      region rLocal =
                      X10Util.
                        get2DLRegion(
                        dGreen);
                    
//#line 145
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
                        
//#line 146
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
                        
//#line 147
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
                        
//#line 148
final double r =
                          java.
                            lang.
                            Math.
                            sqrt(
                            x1 +
                              x2);
                        
//#line 150
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
        	} catch (Throwable tmp196) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp196);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 156
final x10.
          lang.
          GenericReferenceArray ft =
          fft.
            inverseTransformD(
            f);
        
//#line 159
genTable1(
                       table,
                       ft,
                       GREENS_IDX,
                       x,
                       y);
    }
    
    
//#line 165
public void
                   initShapeFactorTable(
                   final x10.
                     lang.
                     DoubleReferenceArray table,
                   final FourierTransform2D fft,
                   final int x,
                   final int y,
                   final double affp) {
        
//#line 170
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
        
//#line 171
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
        
//#line 172
final x10.
          lang.
          dist dShape =
          X10Util.
            distBlockStar2(
            r1,
            r2);
        
//#line 174
final x10.
          lang.
          DoubleReferenceArray f =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dShape,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 175
final double invRadius =
          ((AR >
              0.0))
          ? 1.0 /
          AR
          : 0.0;
        
//#line 176
final double N =
          4 *
          x *
          y;
        
//#line 179
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 179
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
                
//#line 180
if (/* template:array_get { */((pl).get(0))/* } */ <=
                                   2 *
                                   y) {
                    
//#line 181
final x10.
                      lang.
                      region rLocal =
                      X10Util.
                        get2DLRegion(
                        dShape);
                    
//#line 183
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
                        
//#line 184
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
                        
//#line 185
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
                        
//#line 186
final double r =
                          java.
                            lang.
                            Math.
                            sqrt(
                            x1 +
                              x2);
                        
//#line 187
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
        	} catch (Throwable tmp197) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp197);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 193
final x10.
          lang.
          GenericReferenceArray ft =
          fft.
            inverseTransformD(
            f);
        
//#line 196
genTable1(
                       table,
                       ft,
                       SHAPE_IDX,
                       x,
                       y);
    }
    
    
//#line 202
public void
                   initElectricFieldXTable(
                   final x10.
                     lang.
                     DoubleReferenceArray table,
                   final FourierTransform2D fft,
                   final int x,
                   final int y,
                   final double affp) {
        
//#line 207
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
        
//#line 208
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
        
//#line 209
final x10.
          lang.
          dist dElecX =
          X10Util.
            distBlockStar2(
            r1,
            r2);
        
//#line 211
final x10.
          lang.
          DoubleReferenceArray f =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dElecX,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 212
final double invRadius =
          ((AR >
              0.0))
          ? 1.0 /
          AR
          : 0.0;
        
//#line 213
final double N =
          4 *
          x *
          y;
        
//#line 216
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 216
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
                
//#line 217
if (/* template:array_get { */((pl).get(0))/* } */ <=
                                   2 *
                                   y) {
                    
//#line 218
final x10.
                      lang.
                      region rLocal =
                      X10Util.
                        get2DLRegion(
                        dElecX);
                    
//#line 220
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
                        
//#line 221
final double x1 =
                          ((/* template:array_get { */((p).get(0))/* } */ >
                              y))
                          ? /* template:array_get { */((p).get(0))/* } */ -
                          ((2 *
                              y))
                          : /* template:array_get { */((p).get(0))/* } */;
                        
//#line 222
final double xs1 =
                          java.
                            lang.
                            Math.
                            pow(
                            x1,
                            2);
                        
//#line 223
final double x2 =
                          ((/* template:array_get { */((p).get(1))/* } */ >
                              x))
                          ? /* template:array_get { */((p).get(1))/* } */ -
                          ((2 *
                              x))
                          : /* template:array_get { */((p).get(1))/* } */;
                        
//#line 224
final double xs2 =
                          java.
                            lang.
                            Math.
                            pow(
                            x2,
                            2);
                        
//#line 225
final double r =
                          java.
                            lang.
                            Math.
                            sqrt(
                            xs1 +
                              xs2);
                        
//#line 226
final double val =
                          radialElectricField(
                            r,
                            invRadius,
                            affp);
                        
//#line 228
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
        	} catch (Throwable tmp198) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp198);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 234
final x10.
          lang.
          GenericReferenceArray ft =
          fft.
            inverseTransformD(
            f);
        
//#line 237
genTable2(
                       table,
                       ft,
                       ELECX_IDX,
                       x,
                       y);
    }
    
    
//#line 243
public void
                   initElectricFieldYTable(
                   final x10.
                     lang.
                     DoubleReferenceArray table,
                   final FourierTransform2D fft,
                   final int x,
                   final int y,
                   final double affp) {
        
//#line 248
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
        
//#line 249
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
        
//#line 250
final x10.
          lang.
          dist dElecX =
          X10Util.
            distBlockStar2(
            r1,
            r2);
        
//#line 252
final x10.
          lang.
          DoubleReferenceArray f =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dElecX,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 253
final double invRadius =
          ((AR >
              0.0))
          ? 1.0 /
          AR
          : 0.0;
        
//#line 254
final double N =
          4 *
          x *
          y;
        
//#line 257
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 257
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
                
//#line 258
if (/* template:array_get { */((pl).get(0))/* } */ <=
                                   2 *
                                   y) {
                    
//#line 259
final x10.
                      lang.
                      region rLocal =
                      X10Util.
                        get2DLRegion(
                        dElecX);
                    
//#line 261
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
                        
//#line 262
final double y1 =
                          ((/* template:array_get { */((p).get(0))/* } */ >
                              y))
                          ? /* template:array_get { */((p).get(0))/* } */ -
                          ((2 *
                              y))
                          : /* template:array_get { */((p).get(0))/* } */;
                        
//#line 263
final double ys1 =
                          java.
                            lang.
                            Math.
                            pow(
                            y1,
                            2);
                        
//#line 264
final double y2 =
                          ((/* template:array_get { */((p).get(1))/* } */ >
                              x))
                          ? /* template:array_get { */((p).get(1))/* } */ -
                          ((2 *
                              x))
                          : /* template:array_get { */((p).get(1))/* } */;
                        
//#line 265
final double ys2 =
                          java.
                            lang.
                            Math.
                            pow(
                            y2,
                            2);
                        
//#line 266
final double r =
                          java.
                            lang.
                            Math.
                            sqrt(
                            ys1 +
                              ys2);
                        
//#line 267
final double val =
                          radialElectricField(
                            r,
                            invRadius,
                            affp);
                        
//#line 269
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
        	} catch (Throwable tmp199) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp199);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 275
final x10.
          lang.
          GenericReferenceArray ft =
          fft.
            inverseTransformD(
            f);
        
//#line 278
genTable3(
                       table,
                       ft,
                       ELECY_IDX,
                       x,
                       y);
    }
    
    
//#line 286
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
        
//#line 291
final int N =
          4 *
          x *
          y;
        
//#line 292
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 292
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
                
//#line 293
if (/* template:array_get { */((pl).get(0))/* } */ <=
                                   x) {
                    
//#line 294
final x10.
                      lang.
                      dist dFT =
                      ft.
                        distribution;
                    
//#line 295
final x10.
                      lang.
                      dist dTable =
                      table.
                        distribution;
                    
//#line 296
final x10.
                      lang.
                      region rLocalFT1 =
                      X10Util.
                        getLRank2D(
                        dFT,
                        0);
                    
//#line 297
final x10.
                      lang.
                      region rLocalT2 =
                      X10Util.
                        getLRank3D(
                        dTable,
                        1);
                    
//#line 299
/* template:foreach { */
                    for (java.util.Iterator __var59____ = (x10.
                                                             lang.
                                                             region.
                                                             factory.
                                                             region(
                                                             rLocalFT1,
                                                             rLocalT2)).iterator(); __var59____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var59__ = (x10.
                      lang.
                      point) __var59____.next();
                    	/* Join: { */final int i =
                      /* template:array_get { */((__var59__).get(0))/* } */;
final int j =
                      /* template:array_get { */((__var59__).get(1))/* } */;/* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var59__).get(0))/* } */;
final int j =
                      /* template:array_get { */((__var59__).get(1))/* } */;/* } */
{
                        
//#line 300
/* template:array_set { */(table).set(N *
                          /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */i,j/* } */))/* } */))/* } */.
                            getReal(),/* Join: { */i,j,index/* } */)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                    
//#line 303
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                       isFirst()) {
                        
//#line 304
/* template:foreach { */
                        for (java.util.Iterator __var60____ = (x10.
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
                                                                     1))).iterator(); __var60____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var60__ = (x10.
                          lang.
                          point) __var60____.next();
                        	/* Join: { */final int i =
                          /* template:array_get { */((__var60__).get(0))/* } */;/* } */
                        	x10.lang.Runtime.here().runAsync
                        		(new x10.runtime.Activity() {
                        			public void runX10Task() {
                        				/* Join: { *//* Join: { */final int i =
                          /* template:array_get { */((__var60__).get(0))/* } */;/* } */
{
                            
//#line 305
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
                        
                        
//#line 307
/* template:array_set { */(table).set(N *
                          /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,0/* } */))/* } */))/* } */.
                            getImag(),/* Join: { */x,0,index/* } */)/* } */;
                        
//#line 308
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
        	} catch (Throwable tmp200) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp200);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 318
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
        
//#line 323
final int N =
          4 *
          x *
          y;
        
//#line 324
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 324
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
                
//#line 325
if (/* template:array_get { */((pl).get(0))/* } */ <=
                                   x) {
                    
//#line 326
final x10.
                      lang.
                      dist dFT =
                      ft.
                        distribution;
                    
//#line 327
final x10.
                      lang.
                      dist dTable =
                      table.
                        distribution;
                    
//#line 328
final x10.
                      lang.
                      region rLocalFT1 =
                      X10Util.
                        getLRank2D(
                        dFT,
                        0);
                    
//#line 329
final x10.
                      lang.
                      region rLocalT2 =
                      X10Util.
                        getLRank3D(
                        dTable,
                        1);
                    
//#line 331
/* template:foreach { */
                    for (java.util.Iterator __var61____ = (rLocalFT1).iterator(); __var61____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var61__ = (x10.
                      lang.
                      point) __var61____.next();
                    	/* Join: { */final int i =
                      /* template:array_get { */((__var61__).get(0))/* } */;/* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var61__).get(0))/* } */;/* } */
{
                        
//#line 332
if (i >
                                           0) {
                            
//#line 333
/* template:foreach { */
                            for (java.util.Iterator __var62____ = (rLocalT2).iterator(); __var62____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var62__ = (x10.
                              lang.
                              point) __var62____.next();
                            	/* Join: { */final int j =
                              /* template:array_get { */((__var62__).get(0))/* } */;/* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { */final int j =
                              /* template:array_get { */((__var62__).get(0))/* } */;/* } */
{
                                
//#line 334
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
                    
                    
//#line 339
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                       isFirst()) {
                        
//#line 340
/* template:foreach { */
                        for (java.util.Iterator __var63____ = (x10.
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
                                                                     1))).iterator(); __var63____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var63__ = (x10.
                          lang.
                          point) __var63____.next();
                        	/* Join: { */final int i1 =
                          /* template:array_get { */((__var63__).get(0))/* } */;/* } */
                        	x10.lang.Runtime.here().runAsync
                        		(new x10.runtime.Activity() {
                        			public void runX10Task() {
                        				/* Join: { *//* Join: { */final int i1 =
                          /* template:array_get { */((__var63__).get(0))/* } */;/* } */
{
                            
//#line 341
final int i2 =
                              2 *
                              y -
                              i1;
                            
//#line 342
/* template:array_set { */(table).set(N *
                              /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,i1/* } */))/* } */))/* } */.
                                getReal(),/* Join: { */0,i1,index/* } */)/* } */;
                            
//#line 343
/* template:array_set { */(table).set(N *
                              /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,i2/* } */))/* } */))/* } */.
                                getReal(),/* Join: { */x,i1,index/* } */)/* } */;
                        }/* } */
                        			}
                        		});
                        }
                        /* } */
                        
                        
//#line 345
/* template:array_set { */(table).set(N *
                          /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,0/* } */))/* } */))/* } */.
                            getReal(),/* Join: { */0,0,index/* } */)/* } */;
                        
//#line 346
/* template:array_set { */(table).set(N *
                          /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,0/* } */))/* } */))/* } */.
                            getImag(),/* Join: { */x,0,index/* } */)/* } */;
                        
//#line 347
/* template:array_set { */(table).set(N *
                          /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,y/* } */))/* } */))/* } */.
                            getReal(),/* Join: { */0,y,index/* } */)/* } */;
                        
//#line 348
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
        	} catch (Throwable tmp201) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp201);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 358
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
        
//#line 363
final int N =
          4 *
          x *
          y;
        
//#line 364
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 364
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
                
//#line 365
if (/* template:array_get { */((pl).get(0))/* } */ <=
                                   x) {
                    
//#line 366
final x10.
                      lang.
                      dist dFT =
                      ft.
                        distribution;
                    
//#line 367
final x10.
                      lang.
                      dist dTable =
                      table.
                        distribution;
                    
//#line 368
final x10.
                      lang.
                      region rLocalFT1 =
                      X10Util.
                        getLRank2D(
                        dFT,
                        0);
                    
//#line 369
final x10.
                      lang.
                      region rLocalT2 =
                      X10Util.
                        getLRank3D(
                        dTable,
                        1);
                    
//#line 371
/* template:foreach { */
                    for (java.util.Iterator __var64____ = (rLocalFT1).iterator(); __var64____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var64__ = (x10.
                      lang.
                      point) __var64____.next();
                    	/* Join: { */final int i =
                      /* template:array_get { */((__var64__).get(0))/* } */;/* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var64__).get(0))/* } */;/* } */
{
                        
//#line 372
if (i >
                                           0) {
                            
//#line 373
/* template:foreach { */
                            for (java.util.Iterator __var65____ = (x10.
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
                                                                         1))).iterator(); __var65____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var65__ = (x10.
                              lang.
                              point) __var65____.next();
                            	/* Join: { */final int j =
                              /* template:array_get { */((__var65__).get(0))/* } */;/* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { */final int j =
                              /* template:array_get { */((__var65__).get(0))/* } */;/* } */
{
                                
//#line 374
/* template:array_set { */(table).set(N *
                                  /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */i,j/* } */))/* } */))/* } */.
                                    getImag(),/* Join: { */i,j,index/* } */)/* } */;
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                            
//#line 376
/* template:array_set { */(table).set(N *
                              /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */i,0/* } */))/* } */))/* } */.
                                getReal(),/* Join: { */i,0,index/* } */)/* } */;
                            
//#line 377
/* template:array_set { */(table).set(N *
                              /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */i,y/* } */))/* } */))/* } */.
                                getReal(),/* Join: { */i,y,index/* } */)/* } */;
                        }
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                    
//#line 381
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                       isFirst()) {
                        
//#line 382
/* template:foreach { */
                        for (java.util.Iterator __var66____ = (x10.
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
                                                                     1))).iterator(); __var66____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var66__ = (x10.
                          lang.
                          point) __var66____.next();
                        	/* Join: { */final int i1 =
                          /* template:array_get { */((__var66__).get(0))/* } */;/* } */
                        	x10.lang.Runtime.here().runAsync
                        		(new x10.runtime.Activity() {
                        			public void runX10Task() {
                        				/* Join: { *//* Join: { */final int i1 =
                          /* template:array_get { */((__var66__).get(0))/* } */;/* } */
{
                            
//#line 383
final int i2 =
                              2 *
                              y -
                              i1;
                            
//#line 384
/* template:array_set { */(table).set(N *
                              /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,i1/* } */))/* } */))/* } */.
                                getImag(),/* Join: { */0,i1,index/* } */)/* } */;
                            
//#line 385
/* template:array_set { */(table).set(N *
                              /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,i2/* } */))/* } */))/* } */.
                                getImag(),/* Join: { */x,i1,index/* } */)/* } */;
                        }/* } */
                        			}
                        		});
                        }
                        /* } */
                        
                        
//#line 387
/* template:array_set { */(table).set(N *
                          /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,0/* } */))/* } */))/* } */.
                            getReal(),/* Join: { */0,0,index/* } */)/* } */;
                        
//#line 388
/* template:array_set { */(table).set(N *
                          /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,0/* } */))/* } */))/* } */.
                            getImag(),/* Join: { */x,0,index/* } */)/* } */;
                        
//#line 389
/* template:array_set { */(table).set(N *
                          /* template:parametric { */((Complex)(/* template:array_get { */((ft).get(/* Join: { */0,y/* } */))/* } */))/* } */.
                            getReal(),/* Join: { */0,y,index/* } */)/* } */;
                        
//#line 390
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
        	} catch (Throwable tmp202) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp202);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 399
public x10.
                   lang.
                   GenericReferenceArray
                   makeForceArray(
                   ) {
        
//#line 400
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
        
//#line 402
return /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dResult,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
    }
    
    
//#line 408
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
        
//#line 411
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
        
//#line 413
final x10.
          lang.
          GenericReferenceArray fxfft =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dForce,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 414
final x10.
          lang.
          GenericReferenceArray fyfft =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dForce,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 417
final x10.
          lang.
          GenericReferenceArray qfft =
          fft.
            inverseTransformC(
            q);
        
//#line 418
final double we =
          solveForceCharge(
            qfft,
            fxfft,
            fyfft);
        
//#line 420
final x10.
          lang.
          GenericReferenceArray fx =
          fft.
            transformC(
            fxfft);
        
//#line 421
final x10.
          lang.
          GenericReferenceArray fy =
          fft.
            transformC(
            fyfft);
        
//#line 423
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 423
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
                
//#line 424
/* template:array_set { */(forceX).set(/* template:parametric { */((Complex)(/* template:array_get { */((fx).get(pt))/* } */))/* } */,pt)/* } */;
                
//#line 425
/* template:array_set { */(forceY).set(/* template:parametric { */((Complex)(/* template:array_get { */((fy).get(pt))/* } */))/* } */,pt)/* } */;
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp203) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp203);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 427
return we;
    }
    
    
//#line 434
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
        
//#line 437
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
        
//#line 438
final x10.
          lang.
          DoubleReferenceArray energy =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point pt/* } */, double dummy) { {
            
//#line 439
return 0.0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 441
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
            
//#line 442
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 442
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                               lang.
                                                                               dist.
                                                                               UNIQUE.
                                                                               get(
                                                                               pl))).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 443
if (/* template:array_get { */((pl).get(0))/* } */ <=
                                       x) {
                        
//#line 444
final x10.
                          lang.
                          dist dFFG =
                          ffg.
                            distribution;
                        
//#line 445
final x10.
                          lang.
                          region rLocal =
                          X10Util.
                            get3DLRegion(
                            dFFG);
                        
//#line 446
final x10.
                          lang.
                          region rLocal1 =
                          X10Util.
                            getRank3D(
                            rLocal,
                            0);
                        
//#line 447
final x10.
                          lang.
                          region rLocal2 =
                          X10Util.
                            getRank3D(
                            rLocal,
                            1);
                        
//#line 452
double tmp3 =
                          -1.0;
                        
//#line 453
/* template:forloop-mult { */{
                        x10.lang.region __var205__ = (x10.lang.region) rLocal1;
                        if (__var205__.size() > 0 && (__var205__ instanceof x10.array.MultiDimRegion || __var205__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var206__ = __var205__.rank(0).low(), __var207__ = __var205__.rank(0).high(); __var206__ <= __var207__; __var206__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i = __var206__;
                        /* } */
                        /* } */
{
                            
//#line 454
tmp3 =
                              (((i %
                                   2 ==
                                   0))
                                 ? 1.0
                                 : -1.0);
                            
//#line 456
if (i >
                                               0) {
                                
//#line 457
double tmp2 =
                                  /* template:array_get { */((ffg).get(/* Join: { */i,0,ELECY_IDX/* } */))/* } */;
                                
//#line 458
/* template:forloop-mult { */{
                                x10.lang.region __var208__ = (x10.lang.region) x10.
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
                                if (__var208__.size() > 0 && (__var208__ instanceof x10.array.MultiDimRegion || __var208__ instanceof x10.array.ContiguousRange)) {
                                	/* Loop: { *//* template:forloop-mult-each { */
                                for (int __var209__ = __var208__.rank(0).low(), __var210__ = __var208__.rank(0).high(); __var209__ <= __var210__; __var209__++)
                                /* } */
                                /* } */ {
                                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                                final int j1 = __var209__;
                                /* } */
                                /* } */
{
                                    
//#line 459
final int j2 =
                                      2 *
                                      y -
                                      j1;
                                    
//#line 460
final double tmp0 =
                                      ((((/* template:here { */x10.lang.Runtime.here()/* } */).
                                           isFirst()))
                                         ? /* template:array_get { */((ffg).get(/* Join: { */0,j1,ELECX_IDX/* } */))/* } */
                                         : /* template:array_get { */((ffg2).get(/* Join: { */j1,ELECX_IDX/* } */))/* } */);
                                    
//#line 463
final double tmp1 =
                                      tmp3 *
                                      tmp0;
                                    
//#line 464
tmp2 =
                                      -tmp2;
                                    
//#line 465
final Complex cx =
                                      new Complex(
                                      tmp1,
                                      /* template:array_get { */((ffg).get(/* Join: { */i,j1,ELECX_IDX/* } */))/* } */);
                                    
//#line 467
final Complex cy =
                                      new Complex(
                                      tmp2,
                                      /* template:array_get { */((ffg).get(/* Join: { */i,j1,ELECY_IDX/* } */))/* } */);
                                    
//#line 469
/* template:array_set { */(forceX).set(cx.
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j1/* } */))/* } */))/* } */),/* Join: { */i,j1/* } */)/* } */;
                                    
//#line 470
/* template:array_set { */(forceX).set(cx.
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j2/* } */))/* } */))/* } */),/* Join: { */i,j2/* } */)/* } */;
                                    
//#line 471
/* template:array_set { */(forceY).set(cy.
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j1/* } */))/* } */))/* } */),/* Join: { */i,j1/* } */)/* } */;
                                    
//#line 472
/* template:array_set { */(forceY).set(((cy.
                                                                                            getConjg())).
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j2/* } */))/* } */))/* } */),/* Join: { */i,j2/* } */)/* } */;
                                    
//#line 474
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
                                for (java.util.Iterator __var68____ = (__var208__).iterator(); __var68____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var68__ = (x10.
                                  lang.
                                  point) __var68____.next();
                                	/* Join: { *//* Join: { */final int j1 =
                                  /* template:array_get { */((__var68__).get(0))/* } */;/* } */
{
                                    
//#line 459
final int j2 =
                                      2 *
                                      y -
                                      j1;
                                    
//#line 460
final double tmp0 =
                                      ((((/* template:here { */x10.lang.Runtime.here()/* } */).
                                           isFirst()))
                                         ? /* template:array_get { */((ffg).get(/* Join: { */0,j1,ELECX_IDX/* } */))/* } */
                                         : /* template:array_get { */((ffg2).get(/* Join: { */j1,ELECX_IDX/* } */))/* } */);
                                    
//#line 463
final double tmp1 =
                                      tmp3 *
                                      tmp0;
                                    
//#line 464
tmp2 =
                                      -tmp2;
                                    
//#line 465
final Complex cx =
                                      new Complex(
                                      tmp1,
                                      /* template:array_get { */((ffg).get(/* Join: { */i,j1,ELECX_IDX/* } */))/* } */);
                                    
//#line 467
final Complex cy =
                                      new Complex(
                                      tmp2,
                                      /* template:array_get { */((ffg).get(/* Join: { */i,j1,ELECY_IDX/* } */))/* } */);
                                    
//#line 469
/* template:array_set { */(forceX).set(cx.
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j1/* } */))/* } */))/* } */),/* Join: { */i,j1/* } */)/* } */;
                                    
//#line 470
/* template:array_set { */(forceX).set(cx.
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j2/* } */))/* } */))/* } */),/* Join: { */i,j2/* } */)/* } */;
                                    
//#line 471
/* template:array_set { */(forceY).set(cy.
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j1/* } */))/* } */))/* } */),/* Join: { */i,j1/* } */)/* } */;
                                    
//#line 472
/* template:array_set { */(forceY).set(((cy.
                                                                                            getConjg())).
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j2/* } */))/* } */))/* } */),/* Join: { */i,j2/* } */)/* } */;
                                    
//#line 474
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
                                
                                
//#line 481
double tmp0 =
                                  ((((/* template:here { */x10.lang.Runtime.here()/* } */).
                                       isFirst()))
                                     ? /* template:array_get { */((ffg).get(/* Join: { */0,0,ELECX_IDX/* } */))/* } */
                                     : /* template:array_get { */((ffg2).get(/* Join: { */0,ELECX_IDX/* } */))/* } */);
                                
//#line 484
double tmp1 =
                                  tmp3 *
                                  tmp0;
                                
//#line 485
final Complex x0 =
                                  new Complex(
                                  tmp1,
                                  /* template:array_get { */((ffg).get(/* Join: { */i,0,ELECX_IDX/* } */))/* } */);
                                
//#line 487
/* template:array_set { */(forceX).set(x0.
                                                                                      mult(
                                                                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,0/* } */))/* } */))/* } */),/* Join: { */i,0/* } */)/* } */;
                                
//#line 488
/* template:array_set { */(forceY).set(/* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,0/* } */))/* } */))/* } */.
                                                                                      multS(
                                                                                      /* template:array_get { */((ffg).get(/* Join: { */i,0,ELECY_IDX/* } */))/* } */),/* Join: { */i,0/* } */)/* } */;
                                
//#line 489
/* template:array_set { */(energy).set(/* template:array_get { */((energy).get(pl))/* } */ +
                                  ((/* template:array_get { */((ffg).get(/* Join: { */i,0,GREENS_IDX/* } */))/* } */ *
                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,0/* } */))/* } */))/* } */.
                                        multConjg())),pl)/* } */;
                                
//#line 494
tmp0 =
                                  (((((/* template:here { */x10.lang.Runtime.here()/* } */).
                                        isFirst()))
                                      ? /* template:array_get { */((ffg).get(/* Join: { */0,y,ELECX_IDX/* } */))/* } */
                                      : /* template:array_get { */((ffg2).get(/* Join: { */y,ELECX_IDX/* } */))/* } */));
                                
//#line 497
tmp1 =
                                  tmp3 *
                                    tmp0;
                                
//#line 498
final Complex xNY =
                                  new Complex(
                                  tmp1,
                                  /* template:array_get { */((ffg).get(/* Join: { */i,y,ELECX_IDX/* } */))/* } */);
                                
//#line 500
/* template:array_set { */(forceX).set(xNY.
                                                                                      mult(
                                                                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,y/* } */))/* } */))/* } */),/* Join: { */i,y/* } */)/* } */;
                                
//#line 501
/* template:array_set { */(forceY).set(/* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,y/* } */))/* } */))/* } */.
                                                                                      multS(
                                                                                      /* template:array_get { */((ffg).get(/* Join: { */i,y,ELECY_IDX/* } */))/* } */),/* Join: { */i,y/* } */)/* } */;
                                
//#line 502
/* template:array_set { */(energy).set(/* template:array_get { */((energy).get(pl))/* } */ +
                                  ((/* template:array_get { */((ffg).get(/* Join: { */i,y,GREENS_IDX/* } */))/* } */ *
                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,y/* } */))/* } */))/* } */.
                                        multConjg())),pl)/* } */;
                            }
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var67____ = (__var205__).iterator(); __var67____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var67__ = (x10.
                          lang.
                          point) __var67____.next();
                        	/* Join: { *//* Join: { */final int i =
                          /* template:array_get { */((__var67__).get(0))/* } */;/* } */
{
                            
//#line 454
tmp3 =
                              (((i %
                                   2 ==
                                   0))
                                 ? 1.0
                                 : -1.0);
                            
//#line 456
if (i >
                                               0) {
                                
//#line 457
double tmp2 =
                                  /* template:array_get { */((ffg).get(/* Join: { */i,0,ELECY_IDX/* } */))/* } */;
                                
//#line 458
/* template:forloop-mult { */{
                                x10.lang.region __var211__ = (x10.lang.region) x10.
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
                                if (__var211__.size() > 0 && (__var211__ instanceof x10.array.MultiDimRegion || __var211__ instanceof x10.array.ContiguousRange)) {
                                	/* Loop: { *//* template:forloop-mult-each { */
                                for (int __var212__ = __var211__.rank(0).low(), __var213__ = __var211__.rank(0).high(); __var212__ <= __var213__; __var212__++)
                                /* } */
                                /* } */ {
                                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                                final int j1 = __var212__;
                                /* } */
                                /* } */
{
                                    
//#line 459
final int j2 =
                                      2 *
                                      y -
                                      j1;
                                    
//#line 460
final double tmp0 =
                                      ((((/* template:here { */x10.lang.Runtime.here()/* } */).
                                           isFirst()))
                                         ? /* template:array_get { */((ffg).get(/* Join: { */0,j1,ELECX_IDX/* } */))/* } */
                                         : /* template:array_get { */((ffg2).get(/* Join: { */j1,ELECX_IDX/* } */))/* } */);
                                    
//#line 463
final double tmp1 =
                                      tmp3 *
                                      tmp0;
                                    
//#line 464
tmp2 =
                                      -tmp2;
                                    
//#line 465
final Complex cx =
                                      new Complex(
                                      tmp1,
                                      /* template:array_get { */((ffg).get(/* Join: { */i,j1,ELECX_IDX/* } */))/* } */);
                                    
//#line 467
final Complex cy =
                                      new Complex(
                                      tmp2,
                                      /* template:array_get { */((ffg).get(/* Join: { */i,j1,ELECY_IDX/* } */))/* } */);
                                    
//#line 469
/* template:array_set { */(forceX).set(cx.
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j1/* } */))/* } */))/* } */),/* Join: { */i,j1/* } */)/* } */;
                                    
//#line 470
/* template:array_set { */(forceX).set(cx.
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j2/* } */))/* } */))/* } */),/* Join: { */i,j2/* } */)/* } */;
                                    
//#line 471
/* template:array_set { */(forceY).set(cy.
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j1/* } */))/* } */))/* } */),/* Join: { */i,j1/* } */)/* } */;
                                    
//#line 472
/* template:array_set { */(forceY).set(((cy.
                                                                                            getConjg())).
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j2/* } */))/* } */))/* } */),/* Join: { */i,j2/* } */)/* } */;
                                    
//#line 474
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
                                for (java.util.Iterator __var68____ = (__var211__).iterator(); __var68____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var68__ = (x10.
                                  lang.
                                  point) __var68____.next();
                                	/* Join: { *//* Join: { */final int j1 =
                                  /* template:array_get { */((__var68__).get(0))/* } */;/* } */
{
                                    
//#line 459
final int j2 =
                                      2 *
                                      y -
                                      j1;
                                    
//#line 460
final double tmp0 =
                                      ((((/* template:here { */x10.lang.Runtime.here()/* } */).
                                           isFirst()))
                                         ? /* template:array_get { */((ffg).get(/* Join: { */0,j1,ELECX_IDX/* } */))/* } */
                                         : /* template:array_get { */((ffg2).get(/* Join: { */j1,ELECX_IDX/* } */))/* } */);
                                    
//#line 463
final double tmp1 =
                                      tmp3 *
                                      tmp0;
                                    
//#line 464
tmp2 =
                                      -tmp2;
                                    
//#line 465
final Complex cx =
                                      new Complex(
                                      tmp1,
                                      /* template:array_get { */((ffg).get(/* Join: { */i,j1,ELECX_IDX/* } */))/* } */);
                                    
//#line 467
final Complex cy =
                                      new Complex(
                                      tmp2,
                                      /* template:array_get { */((ffg).get(/* Join: { */i,j1,ELECY_IDX/* } */))/* } */);
                                    
//#line 469
/* template:array_set { */(forceX).set(cx.
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j1/* } */))/* } */))/* } */),/* Join: { */i,j1/* } */)/* } */;
                                    
//#line 470
/* template:array_set { */(forceX).set(cx.
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j2/* } */))/* } */))/* } */),/* Join: { */i,j2/* } */)/* } */;
                                    
//#line 471
/* template:array_set { */(forceY).set(cy.
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j1/* } */))/* } */))/* } */),/* Join: { */i,j1/* } */)/* } */;
                                    
//#line 472
/* template:array_set { */(forceY).set(((cy.
                                                                                            getConjg())).
                                                                                          mult(
                                                                                          /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,j2/* } */))/* } */))/* } */),/* Join: { */i,j2/* } */)/* } */;
                                    
//#line 474
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
                                
                                
//#line 481
double tmp0 =
                                  ((((/* template:here { */x10.lang.Runtime.here()/* } */).
                                       isFirst()))
                                     ? /* template:array_get { */((ffg).get(/* Join: { */0,0,ELECX_IDX/* } */))/* } */
                                     : /* template:array_get { */((ffg2).get(/* Join: { */0,ELECX_IDX/* } */))/* } */);
                                
//#line 484
double tmp1 =
                                  tmp3 *
                                  tmp0;
                                
//#line 485
final Complex x0 =
                                  new Complex(
                                  tmp1,
                                  /* template:array_get { */((ffg).get(/* Join: { */i,0,ELECX_IDX/* } */))/* } */);
                                
//#line 487
/* template:array_set { */(forceX).set(x0.
                                                                                      mult(
                                                                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,0/* } */))/* } */))/* } */),/* Join: { */i,0/* } */)/* } */;
                                
//#line 488
/* template:array_set { */(forceY).set(/* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,0/* } */))/* } */))/* } */.
                                                                                      multS(
                                                                                      /* template:array_get { */((ffg).get(/* Join: { */i,0,ELECY_IDX/* } */))/* } */),/* Join: { */i,0/* } */)/* } */;
                                
//#line 489
/* template:array_set { */(energy).set(/* template:array_get { */((energy).get(pl))/* } */ +
                                  ((/* template:array_get { */((ffg).get(/* Join: { */i,0,GREENS_IDX/* } */))/* } */ *
                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,0/* } */))/* } */))/* } */.
                                        multConjg())),pl)/* } */;
                                
//#line 494
tmp0 =
                                  (((((/* template:here { */x10.lang.Runtime.here()/* } */).
                                        isFirst()))
                                      ? /* template:array_get { */((ffg).get(/* Join: { */0,y,ELECX_IDX/* } */))/* } */
                                      : /* template:array_get { */((ffg2).get(/* Join: { */y,ELECX_IDX/* } */))/* } */));
                                
//#line 497
tmp1 =
                                  tmp3 *
                                    tmp0;
                                
//#line 498
final Complex xNY =
                                  new Complex(
                                  tmp1,
                                  /* template:array_get { */((ffg).get(/* Join: { */i,y,ELECX_IDX/* } */))/* } */);
                                
//#line 500
/* template:array_set { */(forceX).set(xNY.
                                                                                      mult(
                                                                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,y/* } */))/* } */))/* } */),/* Join: { */i,y/* } */)/* } */;
                                
//#line 501
/* template:array_set { */(forceY).set(/* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */i,y/* } */))/* } */))/* } */.
                                                                                      multS(
                                                                                      /* template:array_get { */((ffg).get(/* Join: { */i,y,ELECY_IDX/* } */))/* } */),/* Join: { */i,y/* } */)/* } */;
                                
//#line 502
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
                        
                        
//#line 508
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                           isFirst()) {
                            
//#line 510
tmp3 =
                              /* template:array_get { */((ffg).get(/* Join: { */0,0,ELECY_IDX/* } */))/* } */;
                            
//#line 511
/* template:forloop-mult { */{
                            x10.lang.region __var214__ = (x10.lang.region) x10.
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
                            if (__var214__.size() > 0 && (__var214__ instanceof x10.array.MultiDimRegion || __var214__ instanceof x10.array.ContiguousRange)) {
                            	/* Loop: { *//* template:forloop-mult-each { */
                            for (int __var215__ = __var214__.rank(0).low(), __var216__ = __var214__.rank(0).high(); __var215__ <= __var216__; __var215__++)
                            /* } */
                            /* } */ {
                            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                            final int j = __var215__;
                            /* } */
                            /* } */
{
                                
//#line 512
tmp3 =
                                  -tmp3;
                                
//#line 513
final Complex s =
                                  new Complex(
                                  tmp3,
                                  /* template:array_get { */((ffg).get(/* Join: { */0,j,ELECY_IDX/* } */))/* } */);
                                
//#line 514
/* template:array_set { */(forceX).set(/* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,j/* } */))/* } */))/* } */.
                                                                                      multS(
                                                                                      /* template:array_get { */((ffg).get(/* Join: { */0,j,ELECX_IDX/* } */))/* } */),/* Join: { */0,j/* } */)/* } */;
                                
//#line 515
/* template:array_set { */(forceY).set(s.
                                                                                      mult(
                                                                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,j/* } */))/* } */))/* } */),/* Join: { */0,j/* } */)/* } */;
                                
//#line 516
/* template:array_set { */(energy).set(/* template:array_get { */((energy).get(pl))/* } */ +
                                  ((/* template:array_get { */((ffg).get(/* Join: { */0,j,GREENS_IDX/* } */))/* } */ *
                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,j/* } */))/* } */))/* } */.
                                        multConjg())),pl)/* } */;
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var69____ = (__var214__).iterator(); __var69____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var69__ = (x10.
                              lang.
                              point) __var69____.next();
                            	/* Join: { *//* Join: { */final int j =
                              /* template:array_get { */((__var69__).get(0))/* } */;/* } */
{
                                
//#line 512
tmp3 =
                                  -tmp3;
                                
//#line 513
final Complex s =
                                  new Complex(
                                  tmp3,
                                  /* template:array_get { */((ffg).get(/* Join: { */0,j,ELECY_IDX/* } */))/* } */);
                                
//#line 514
/* template:array_set { */(forceX).set(/* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,j/* } */))/* } */))/* } */.
                                                                                      multS(
                                                                                      /* template:array_get { */((ffg).get(/* Join: { */0,j,ELECX_IDX/* } */))/* } */),/* Join: { */0,j/* } */)/* } */;
                                
//#line 515
/* template:array_set { */(forceY).set(s.
                                                                                      mult(
                                                                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,j/* } */))/* } */))/* } */),/* Join: { */0,j/* } */)/* } */;
                                
//#line 516
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
                            
                            
//#line 522
tmp3 =
                              /* template:array_get { */((ffg2).get(/* Join: { */0,ELECY_IDX/* } */))/* } */;
                            
//#line 523
/* template:forloop-mult { */{
                            x10.lang.region __var217__ = (x10.lang.region) x10.
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
                            if (__var217__.size() > 0 && (__var217__ instanceof x10.array.MultiDimRegion || __var217__ instanceof x10.array.ContiguousRange)) {
                            	/* Loop: { *//* template:forloop-mult-each { */
                            for (int __var218__ = __var217__.rank(0).low(), __var219__ = __var217__.rank(0).high(); __var218__ <= __var219__; __var218__++)
                            /* } */
                            /* } */ {
                            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                            final int j1 = __var218__;
                            /* } */
                            /* } */
{
                                
//#line 524
tmp3 =
                                  -tmp3;
                                
//#line 525
final int j2 =
                                  2 *
                                  y -
                                  j1;
                                
//#line 526
final Complex s =
                                  new Complex(
                                  tmp3,
                                  /* template:array_get { */((ffg2).get(/* Join: { */j1,ELECY_IDX/* } */))/* } */);
                                
//#line 528
/* template:array_set { */(forceX).set(/* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,j2/* } */))/* } */))/* } */.
                                                                                      multS(
                                                                                      /* template:array_get { */((ffg).get(/* Join: { */0,j1,ELECX_IDX/* } */))/* } */),/* Join: { */0,j2/* } */)/* } */;
                                
//#line 529
/* template:array_set { */(forceY).set(s.
                                                                                      mult(
                                                                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,j2/* } */))/* } */))/* } */),/* Join: { */0,j2/* } */)/* } */;
                                
//#line 530
/* template:array_set { */(energy).set(/* template:array_get { */((energy).get(pl))/* } */ +
                                  ((/* template:array_get { */((ffg2).get(/* Join: { */j1,GREENS_IDX/* } */))/* } */ *
                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,j2/* } */))/* } */))/* } */.
                                        multConjg())),pl)/* } */;
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var70____ = (__var217__).iterator(); __var70____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var70__ = (x10.
                              lang.
                              point) __var70____.next();
                            	/* Join: { *//* Join: { */final int j1 =
                              /* template:array_get { */((__var70__).get(0))/* } */;/* } */
{
                                
//#line 524
tmp3 =
                                  -tmp3;
                                
//#line 525
final int j2 =
                                  2 *
                                  y -
                                  j1;
                                
//#line 526
final Complex s =
                                  new Complex(
                                  tmp3,
                                  /* template:array_get { */((ffg2).get(/* Join: { */j1,ELECY_IDX/* } */))/* } */);
                                
//#line 528
/* template:array_set { */(forceX).set(/* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,j2/* } */))/* } */))/* } */.
                                                                                      multS(
                                                                                      /* template:array_get { */((ffg).get(/* Join: { */0,j1,ELECX_IDX/* } */))/* } */),/* Join: { */0,j2/* } */)/* } */;
                                
//#line 529
/* template:array_set { */(forceY).set(s.
                                                                                      mult(
                                                                                      /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,j2/* } */))/* } */))/* } */),/* Join: { */0,j2/* } */)/* } */;
                                
//#line 530
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
                            
                            
//#line 536
final double q00R =
                              /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,0/* } */))/* } */))/* } */.
                                getReal();
                            
//#line 537
final double q00I =
                              /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,0/* } */))/* } */))/* } */.
                                getImag();
                            
//#line 538
/* template:array_set { */(forceX).set(new Complex(
                              /* template:array_get { */((ffg).get(/* Join: { */0,0,ELECX_IDX/* } */))/* } */ *
                                q00R,
                              /* template:array_get { */((ffg2).get(/* Join: { */0,ELECX_IDX/* } */))/* } */ *
                                q00I),/* Join: { */0,0/* } */)/* } */;
                            
//#line 540
/* template:array_set { */(forceY).set(new Complex(
                              /* template:array_get { */((ffg).get(/* Join: { */0,0,ELECY_IDX/* } */))/* } */ *
                                q00R,
                              /* template:array_get { */((ffg2).get(/* Join: { */0,ELECY_IDX/* } */))/* } */ *
                                q00I),/* Join: { */0,0/* } */)/* } */;
                            
//#line 542
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
                            
//#line 549
final double q0NYR =
                              /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,y/* } */))/* } */))/* } */.
                                getReal();
                            
//#line 550
final double q0NYI =
                              /* template:parametric { */((Complex)(/* template:array_get { */((q).get(/* Join: { */0,y/* } */))/* } */))/* } */.
                                getImag();
                            
//#line 551
/* template:array_set { */(forceX).set(new Complex(
                              /* template:array_get { */((ffg).get(/* Join: { */0,y,ELECX_IDX/* } */))/* } */ *
                                q0NYR,
                              /* template:array_get { */((ffg2).get(/* Join: { */y,ELECX_IDX/* } */))/* } */ *
                                q0NYI),/* Join: { */0,y/* } */)/* } */;
                            
//#line 553
/* template:array_set { */(forceY).set(new Complex(
                              /* template:array_get { */((ffg).get(/* Join: { */0,y,ELECY_IDX/* } */))/* } */ *
                                q0NYR,
                              /* template:array_get { */((ffg2).get(/* Join: { */y,ELECY_IDX/* } */))/* } */ *
                                q0NYI),/* Join: { */0,y/* } */)/* } */;
                            
//#line 555
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
            	} catch (Throwable tmp204) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp204);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
        
//#line 564
return 4.0 *
          x *
          y *
          energy.
            sum();
    }
    
    
//#line 574
public double
                   potentialField(
                   final double r,
                   final double ari,
                   final double affp) {
        
//#line 577
final double anorm =
          affp *
          PI4I;
        
//#line 579
if (ari >
                           0) {
            
//#line 580
if (r ==
                               0.0) {
                
//#line 581
return anorm *
                  SQT2PI *
                  ari;
            } else {
                
//#line 583
return anorm *
                  errorFn(
                    r *
                      SQT2I *
                      ari) /
                  r;
            }
        } else {
            
//#line 587
if (r ==
                               0.0) {
                
//#line 588
return 0.0;
            } else {
                
//#line 590
return anorm /
                  r;
            }
        }
    }
    
    
//#line 602
public double
                   particleShape(
                   final double r,
                   final double ari,
                   final double affp) {
        
//#line 605
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
        
//#line 607
if (ari >
                           0.0) {
            
//#line 608
if (r ==
                               0.0) {
                
//#line 609
return anorm;
            } else {
                
//#line 611
final double at1 =
                  X10Util.
                    minDouble(
                    r *
                      SQT2I *
                      ari,
                    8.0);
                
//#line 612
return anorm *
                  java.
                    lang.
                    Math.
                    exp(
                    -((at1 *
                         at1)));
            }
        } else {
            
//#line 616
if (r ==
                               0.0) {
                
//#line 617
return affp;
            } else {
                
//#line 619
return 0.0;
            }
        }
    }
    
    
//#line 636
public double
                   radialElectricField(
                   final double r,
                   final double ari,
                   final double affp) {
        
//#line 639
final double anorm =
          affp *
          PI4I;
        
//#line 641
if (ari >
                           0.0) {
            
//#line 642
if (r ==
                               0.0) {
                
//#line 643
return 0.0;
            } else {
                
//#line 645
final double ri =
                  1.0 /
                  r;
                
//#line 646
final double at1 =
                  X10Util.
                    minDouble(
                    r *
                      SQT2I *
                      ari,
                    8.0);
                
//#line 647
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
            
//#line 652
if (r ==
                               0.0) {
                
//#line 653
return 0.0;
            } else {
                
//#line 655
return anorm /
                  ((r *
                      r));
            }
        }
    }
    
    
//#line 667
public double
                   errorFn(
                   final double x) {
        
//#line 668
final double p =
          0.3275911;
        
//#line 669
final double a1 =
          0.254829592;
        
//#line 670
final double a2 =
          -0.284496736;
        
//#line 671
final double a3 =
          1.421413741;
        
//#line 672
final double a4 =
          -1.453152027;
        
//#line 673
final double a5 =
          1.061405429;
        
//#line 675
final double f =
          java.
            lang.
            Math.
            abs(
            x);
        
//#line 676
final double t =
          1.0 /
          ((1.0 +
              p *
              f));
        
//#line 678
double ret =
          0.0;
        
//#line 679
if (f <=
                           8.0) {
            
//#line 680
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
            
//#line 686
ret =
              1.0;
        }
        
//#line 689
if (x <
                           0) {
            
//#line 690
ret =
              -ret;
        }
        
//#line 692
return ret;
    }
    
    
//#line 703
public double
                   expIntNL(
                   final double x) {
        
//#line 704
final double a0 =
          -0.57721566;
        
//#line 705
final double a1 =
          0.99999193;
        
//#line 706
final double a2 =
          -0.24991055;
        
//#line 707
final double a3 =
          0.05519968;
        
//#line 708
final double a4 =
          -0.00976004;
        
//#line 709
final double a5 =
          0.00107857;
        
//#line 710
final double b1 =
          8.5733287401;
        
//#line 711
final double b2 =
          18.059016973;
        
//#line 712
final double b3 =
          8.6347608925;
        
//#line 713
final double b4 =
          0.2677737343;
        
//#line 714
final double c1 =
          9.5733223454;
        
//#line 715
final double c2 =
          25.6329561486;
        
//#line 716
final double c3 =
          21.0996530827;
        
//#line 717
final double c4 =
          3.9584969228;
        
//#line 719
if (x <
                           1.0) {
            
//#line 720
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
            
//#line 725
if (x <
                               50.0) {
                
//#line 726
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
                
//#line 730
return java.
                                      lang.
                                      Math.
                                      log(
                                      x);
            }
        }
    }
    
    
//#line 734
public java.
                   lang.
                   String
                   toString(
                   ) {
        
//#line 735
return "PoisonSolver: xbits = " +
        xBits +
        " ybits = " +
        yBits;
    }
}
