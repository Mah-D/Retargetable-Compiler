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
        
//#line 3
x10.
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
              -1));
        
//#line 4
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
                100)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 5
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                   lang.
                                                                                                   System.
                                                                                                   out))/* } */.println(d);
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 8
public static Dist1
                 getBlockCyclicDist1(
                 final Region1 r,
                 final int blockSize) {
        
//#line 9
final int N =
          r.
            pointArray.
            region.
            size();
        
//#line 10
final int one =
          1;
        
//#line 11
final x10.
          lang.
          place fPlace =
          x10.
            lang.
            place.
            FIRST_PLACE;
        
//#line 12
final int rSize =
          N -
          one;
        
//#line 13
final x10.
          lang.
          region dReg =
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
              rSize));
        
//#line 14
final x10.
          lang.
          dist dDist =
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
                rSize)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 15
final x10.
          lang.
          GenericReferenceArray placeArray =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dDist,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
        
//#line 16
Test.
                      getCyclic(
                      placeArray,
                      N,
                      fPlace,
                      blockSize);
        
//#line 17
final x10.
          lang.
          GenericReferenceArray vPlaceArray =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dReg.
                                                                                                                           toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                lang.
                point p/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 17
final x10.
                    lang.
                    place tempPl =
                    /* template:parametric { */((x10.
                    lang.
                    place)(/* template:array_get { */((placeArray).get(p))/* } */))/* } */;
                  
//#line 17
return tempPl;
              } }
              }/* } */,true,true,true)/* } */));
        
//#line 18
final Dist pointDist =
          new Dist(
          vPlaceArray,
          rSize);
        
//#line 19
final Dist1 retDist =
          new Dist1(
          r,
          pointDist);
        
//#line 20
return retDist;
    }
    
    
//#line 23
public static Dist1
                  getUniqueDist(
                  ) {
        
//#line 24
final int one =
          1;
        
//#line 25
final int zero =
          0;
        
//#line 26
final int maxPlaces =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 27
final int rSize =
          maxPlaces -
          one;
        
//#line 28
final x10.
          lang.
          region placeRegion =
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
              rSize));
        
//#line 29
final x10.
          lang.
          GenericReferenceArray pointArray =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(placeRegion.
                                                                                                                           toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                lang.
                point p/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 30
final int i =
                    /* template:array_get { */((p).get(0))/* } */;
                  
//#line 31
final Point1 pt1 =
                    new Point1(
                    i);
                  
//#line 32
return pt1;
              } }
              }/* } */,true,false,true)/* } */));
        
//#line 34
final x10.
          lang.
          GenericReferenceArray vPlaceArray =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(placeRegion.
                                                                                                                           toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                lang.
                point p/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 35
final int i =
                    /* template:array_get { */((p).get(0))/* } */;
                  
//#line 36
final x10.
                    lang.
                    place pl1 =
                    x10.
                      lang.
                      place.
                      places(
                      i);
                  
//#line 37
return pl1;
              } }
              }/* } */,true,false,true)/* } */));
        
//#line 39
final Region1 reg =
          new Region1(
          pointArray,
          zero,
          maxPlaces);
        
//#line 40
final Dist pointDist1 =
          new Dist(
          vPlaceArray,
          rSize);
        
//#line 41
final Dist1 retDist =
          new Dist1(
          reg,
          pointDist1);
        
//#line 42
return retDist;
    }
    
    
//#line 128
public static Dist1
                   getPlaceDist1(
                   final Region1 r,
                   final x10.
                     lang.
                     place p) {
        
//#line 129
final int rSize =
          r.
            pointArray.
            region.
            size();
        
//#line 130
final int one =
          1;
        
//#line 131
final int rSizeMinusOne =
          rSize -
          one;
        
//#line 132
final x10.
          lang.
          region dReg =
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
              rSizeMinusOne));
        
//#line 133
final x10.
          lang.
          dist dDist =
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
                rSizeMinusOne)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 134
final x10.
          lang.
          GenericReferenceArray placeArray =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dDist,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
        
//#line 135
Test.
                       getCyclic(
                       placeArray,
                       rSize,
                       p,
                       rSize);
        
//#line 136
final x10.
          lang.
          GenericReferenceArray vPlaceArray =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dReg.
                                                                                                                           toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                lang.
                point p/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 136
final x10.
                    lang.
                    place tempPl =
                    /* template:parametric { */((x10.
                    lang.
                    place)(/* template:array_get { */((placeArray).get(p))/* } */))/* } */;
                  
//#line 136
return tempPl;
              } }
              }/* } */,true,true,true)/* } */));
        
//#line 137
final Dist pointDist =
          new Dist(
          vPlaceArray,
          rSize);
        
//#line 138
final Dist1 retDist =
          new Dist1(
          r,
          pointDist);
        
//#line 139
return retDist;
    }
    
    
//#line 142
public static void
                   getCyclic(
                   final x10.
                     lang.
                     GenericReferenceArray placeArray,
                   final int arraySize,
                   final x10.
                     lang.
                     place initPlace,
                   final int blockSize) {
        
//#line 143
final int zero =
          0;
        
//#line 144
final int one =
          1;
        
//#line 145
int N =
          arraySize;
        
//#line 146
int chunk =
          blockSize;
        
//#line 147
final boolean ifCond =
          blockSize >
          N;
        
//#line 148
if (ifCond) {
            
//#line 149
chunk =
              N;
        }
        
//#line 151
int index =
          0;
        
//#line 152
int dSize =
          index +
          chunk;
        
//#line 153
dSize =
          dSize -
            one;
        
//#line 154
final x10.
          lang.
          region pointReg =
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
              dSize));
        
//#line 155
final x10.
          lang.
          intArray pointArray =
          (x10.
            lang.
            intArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(pointReg.
                                                                                                                       toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public int apply(/* Join: { */x10.
                lang.
                point p/* } */, int dummy) { {
                  
//#line 155
return zero;
              } }
              }/* } */,true,false,false)/* } */));
        
//#line 156
/* template:forloop { */
        for (java.util.Iterator p__ = (pointArray.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 157
/* template:array_set { */(placeArray).set(initPlace,p)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 159
index =
          index +
            chunk;
        
//#line 160
N =
          N -
            chunk;
        
//#line 161
x10.
          lang.
          place pl =
          initPlace.
            next();
        
//#line 162
boolean whileCond =
          N !=
          zero;
        
//#line 163
while (whileCond) {
            
//#line 164
final boolean tailCond =
              chunk >
              N;
            
//#line 165
if (tailCond) {
                
//#line 166
dSize =
                  index +
                    N;
                
//#line 167
dSize =
                  dSize -
                    one;
                
//#line 168
final int ub =
                  N -
                  one;
                
//#line 169
final x10.
                  lang.
                  region pointReg1 =
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
                      ub));
                
//#line 170
final x10.
                  lang.
                  intArray pointArray1 =
                  (x10.
                    lang.
                    intArray)
                    ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(pointReg1.
                                                                                                                               toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                      	public int apply(/* Join: { */x10.
                        lang.
                        point p/* } */, int dummy) { {
                          
//#line 170
return zero;
                      } }
                      }/* } */,true,false,false)/* } */));
                
//#line 171
/* template:forloop { */
                for (java.util.Iterator p__ = (pointArray1.
                                                 distribution.
                                                 region).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 172
final x10.
                      lang.
                      point tempPt =
                      /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                lang.
                                                                                                                point.
                                                                                                                factory.
                                                                                                                point(
                                                                                                                index));
                    
//#line 173
/* template:array_set { */(placeArray).set(pl,tempPt)/* } */;
                }/* } */
                }
                /* } */
                
                
//#line 175
N =
                  0;
            } else {
                
//#line 178
dSize =
                  index +
                    chunk;
                
//#line 179
dSize =
                  dSize -
                    one;
                
//#line 180
final int ub =
                  chunk -
                  one;
                
//#line 181
final x10.
                  lang.
                  region pointReg1 =
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
                      ub));
                
//#line 182
final x10.
                  lang.
                  intArray pointArray1 =
                  (x10.
                    lang.
                    intArray)
                    ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(pointReg1.
                                                                                                                               toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                      	public int apply(/* Join: { */x10.
                        lang.
                        point p/* } */, int dummy) { {
                          
//#line 182
return zero;
                      } }
                      }/* } */,true,false,false)/* } */));
                
//#line 183
/* template:forloop { */
                for (java.util.Iterator p__ = (pointArray1.
                                                 distribution.
                                                 region).iterator(); p__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p = (x10.
                  lang.
                  point) p__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 184
final x10.
                      lang.
                      point tempPt =
                      /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(p))/* } */.add(x10.
                                                                                                                lang.
                                                                                                                point.
                                                                                                                factory.
                                                                                                                point(
                                                                                                                index));
                    
//#line 185
/* template:array_set { */(placeArray).set(pl,tempPt)/* } */;
                }/* } */
                }
                /* } */
                
                
//#line 187
index =
                  index +
                    chunk;
                
//#line 188
N =
                  N -
                    chunk;
            }
            
//#line 190
pl =
              pl.
                next();
            
//#line 191
whileCond =
              N !=
                zero;
        }
    }
    
    
//#line 272
public Test() {
        
//#line 273
super();
        
//#line 274
final x10.
          lang.
          dist d =
          (x10.
            lang.
            dist)
            x10.
              lang.
              dist.
              UNIQUE;
        
//#line 280
this.
                       m2();
        
//#line 281
/* template:place-check { */((Test) x10.lang.Runtime.hereCheck(new Test(
          )))/* } */.m(d);
    }
    
    
//#line 286
public void
                   m2(
                   ) {
        
    }
    
    
//#line 291
public x10.
                   lang.
                   IntReferenceArray
                   m(
                   final x10.
                     lang.
                     dist d) {
        
//#line 293
m2();
        
//#line 294
return (x10.
                              lang.
                              IntReferenceArray)
                              (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                               	public int apply(/* Join: { */x10.
                                 lang.
                                 point p/* } */, int dummy) { {
                                   
//#line 294
return 0;
                               } }
                               }/* } */,true,true,false)/* } */);
    }
}

class Region1
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 299
final public int
      regRank;
    
//#line 300
final public boolean
      regType;
    
//#line 301
final public int
      low0;
    
//#line 302
final public int
      dim0;
    
//#line 303
final public x10.
      lang.
      GenericReferenceArray
      pointArray;
    
    
//#line 306
public Region1(final x10.
                                  lang.
                                  GenericReferenceArray pointArray_) {
        
//#line 307
super();
        
//#line 309
final int zero =
          0;
        
//#line 311
final int one =
          1;
        
//#line 313
final int minusOne =
          zero -
          one;
        
//#line 315
regRank =
          1;
        
//#line 317
pointArray =
          pointArray_;
        
//#line 319
regType =
          false;
        
//#line 321
low0 =
          minusOne;
        
//#line 323
dim0 =
          zero;
    }
    
    
//#line 325
public Region1(final x10.
                                  lang.
                                  GenericReferenceArray pointArray_,
                                final int low0_,
                                final int dim0_) {
        
//#line 326
super();
        
//#line 328
regRank =
          1;
        
//#line 330
pointArray =
          pointArray_;
        
//#line 332
regType =
          true;
        
//#line 334
low0 =
          low0_;
        
//#line 336
dim0 =
          dim0_;
    }
}

class Point1
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 343
final public int
      f0;
    
    
//#line 346
public Point1(final int f0_) {
        
//#line 347
super();
        
//#line 349
f0 =
          f0_;
    }
}

class Dist
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 355
final public x10.
      lang.
      GenericReferenceArray
      placeArray;
    
//#line 356
final public x10.
      lang.
      intArray
      counts;
    
//#line 357
final public x10.
      lang.
      intArray
      runningSum;
    
    
//#line 359
public Dist(final x10.
                               lang.
                               GenericReferenceArray vPlaceArray,
                             final int arraySize) {
        
//#line 359
super();
        
//#line 360
final int one =
          1;
        
//#line 361
final int zero =
          0;
        
//#line 363
final int maxPlaces =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 364
final int ub =
          maxPlaces -
          one;
        
//#line 365
final x10.
          lang.
          region countReg =
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
              ub));
        
//#line 366
final x10.
          lang.
          dist countDist =
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
                ub)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 368
final int rSize =
          arraySize -
          one;
        
//#line 369
final x10.
          lang.
          region runSumReg =
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
              rSize));
        
//#line 370
final x10.
          lang.
          dist runSumDist =
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
                rSize)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 372
final x10.
          lang.
          IntReferenceArray tempCounts =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(countDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 374
final x10.
          lang.
          IntReferenceArray tempRunSum =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(runSumDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 376
/* template:forloop { */
        for (java.util.Iterator p__ = (tempCounts.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 377
/* template:array_set { */(tempCounts).set((zero),p)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 381
/* template:forloop { */
        for (java.util.Iterator p__ = (vPlaceArray.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 382
final x10.
              lang.
              place pl =
              /* template:parametric { */((x10.
              lang.
              place)(/* template:array_get { */((vPlaceArray).get(p))/* } */))/* } */;
            
//#line 383
final int index =
              pl.
                id;
            
//#line 384
final int oldVal =
              /* template:array_get { */((tempCounts).get(index))/* } */;
            
//#line 385
/* template:array_set { */(tempRunSum).set((oldVal),p)/* } */;
            
//#line 386
final int oldValPlusOne =
              oldVal +
              one;
            
//#line 387
/* template:array_set { */(tempCounts).set((oldValPlusOne),index)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 390
placeArray =
          vPlaceArray;
        
//#line 392
counts =
          init(
            tempCounts,
            countReg);
        
//#line 393
runningSum =
          init(
            tempRunSum,
            runSumReg);
    }
    
    
//#line 396
public x10.
                   lang.
                   intArray
                   init(
                   final x10.
                     lang.
                     IntReferenceArray tempArr,
                   final x10.
                     lang.
                     region tempReg) {
        
//#line 397
final x10.
          lang.
          intArray vTemp =
          (x10.
            lang.
            intArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(tempReg.
                                                                                                                       toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public int apply(/* Join: { */x10.
                lang.
                point p/* } */, int dummy) { {
                  
//#line 398
final int tempInt =
                    /* template:array_get { */((tempArr).get(p))/* } */;
                  
//#line 399
return tempInt;
              } }
              }/* } */,true,false,false)/* } */));
        
//#line 401
return vTemp;
    }
}

class Dist1
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 407
final public Region1
      dReg;
    
//#line 408
final public Dist
      dDist;
    
    
//#line 411
public Dist1(final Region1 dReg_,
                              final Dist dDist_) {
        
//#line 412
super();
        
//#line 414
dReg =
          dReg_;
        
//#line 416
dDist =
          dDist_;
    }
}
