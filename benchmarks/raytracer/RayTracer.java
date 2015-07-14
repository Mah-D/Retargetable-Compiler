import x10.lang.*;

public class RayTracer
extends x10.
  lang.
  Object
{
    
//#line 26
private Scene
      scene;
    
//#line 28
private int
      lightCount;
    
//#line 30
private int
      objCount;
    
//#line 35
private x10.
      lang.
      GenericReferenceArray
      lights;
    
//#line 40
private x10.
      lang.
      GenericReferenceArray
      prim;
    
//#line 45
private View
      view;
    
//#line 50
final private static int
      alpha =
      255 <<
      24;
    
//#line 55
final private static Vec
      voidVec =
      new Vec(
      );
    
//#line 60
private int
      height;
    
//#line 65
private int
      width;
    
//#line 69
private x10.
      lang.
      IntReferenceArray
      datasizes;
    
//#line 71
private long
      checksum;
    
//#line 73
private x10.
      lang.
      LongReferenceArray
      checkSumArray;
    
//#line 74
private int
      size_t;
    
//#line 76
private int
      numobjects;
    
    
//#line 78
public RayTracer() {
        
//#line 78
super();
    }
    
    
//#line 87
public void
                  JGFsetsize(
                  final int size_t) {
        
//#line 88
checksum =
          0;
        
//#line 89
x10.
          lang.
          dist d1 =
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
        
//#line 90
datasizes =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(d1,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 91
/* template:array_set { */(datasizes).set(20,0)/* } */;
        
//#line 92
/* template:array_set { */(datasizes).set(500,1)/* } */;
        
//#line 93
this.
                      size_t =
          size_t;
    }
    
    
//#line 96
public void
                  JGFinitialise(
                  ) {
        
//#line 100
width =
          /* template:array_get { */((datasizes).get(size_t))/* } */;
        
//#line 101
height =
          /* template:array_get { */((datasizes).get(size_t))/* } */;
        
//#line 104
scene =
          createScene();
        
//#line 107
setScene(
                       scene);
        
//#line 110
numobjects =
          /* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.getObjects();
    }
    
    
//#line 115
public void
                   JGFapplication(
                   ) {
        
//#line 120
Interval interval =
          new Interval(
          0,
          width,
          height,
          0,
          height,
          1);
        
//#line 123
render(
                       interval);
    }
    
    
//#line 128
public void
                   JGFvalidate(
                   ) {
        
//#line 131
x10.
          lang.
          dist d1 =
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
        
//#line 132
x10.
          lang.
          LongReferenceArray refval =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.LongArray(d1,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 134
/* template:array_set { */(refval).set(51428,0)/* } */;
        
//#line 135
/* template:array_set { */(refval).set(29827635,1)/* } */;
        
//#line 136
long dev =
          checksum -
          /* template:array_get { */((refval).get(size_t))/* } */;
        
//#line 137
if (dev !=
                           0) {
            
//#line 138
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("Validation failed");
            
//#line 139
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("Pixel checksum = " +
                                                                                                                              checksum);
            
//#line 140
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("Reference value = " +
                                                                                                                              /* template:array_get { */((refval).get(size_t))/* } */);
            
//#line 141
throw new java.
              lang.
              RuntimeException(
              "Validation failed");
        }
    }
    
    
//#line 145
public void
                   JGFtidyup(
                   ) {
        
    }
    
    
//#line 156
public void
                   run(
                   ) {
        
//#line 163
JGFsetsize(
                       0);
        
//#line 167
JGFinitialise();
        
//#line 168
JGFapplication();
        
//#line 169
JGFvalidate();
        
//#line 170
JGFtidyup();
    }
    
    
//#line 186
private Scene
                   createScene(
                   ) {
        
//#line 187
final int x =
          0;
        
//#line 188
final int y =
          0;
        
//#line 190
Scene scene =
          new Scene(
          new View(
            new Vec(
              x,
              20,
              -30,
              false),
            new Vec(
              x,
              y,
              0,
              false),
            new Vec(
              0,
              1,
              0,
              false),
            1.0,
            35.0 *
              3.14159265 /
              180.0,
            1.0));
        
//#line 198
final int nx =
          4;
        
//#line 199
final int ny =
          4;
        
//#line 200
final int nz =
          4;
        
//#line 201
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
              0,
              nx -
                1),
            x10.
              lang.
              region.
              factory.
              region(
              0,
              ny -
                1),
            x10.
              lang.
              region.
              factory.
              region(
              0,
              nz -
                1));
        
//#line 202
/* template:forloop { */
        for (java.util.Iterator pp__ = (reg).iterator(); pp__.hasNext(); ) {
        	final  x10.
          lang.
          point pp = (x10.
          lang.
          point) pp__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 203
double xx =
              20.0 /
              ((nx -
                  1)) *
              /* template:array_get { */((pp).get(0))/* } */ -
              10.0;
            
//#line 204
double yy =
              20.0 /
              ((ny -
                  1)) *
              /* template:array_get { */((pp).get(1))/* } */ -
              10.0;
            
//#line 205
double zz =
              20.0 /
              ((nz -
                  1)) *
              /* template:array_get { */((pp).get(2))/* } */ -
              10.0;
            
//#line 206
Sphere p =
              new Sphere(
              new Vec(
                xx,
                yy,
                zz,
                false),
              3,
              new Surface(
                15.0,
                1.5 -
                  1.0,
                1.5 -
                  1.0,
                new Vec(
                  0,
                  0,
                  ((/* template:array_get { */((pp).get(0))/* } */ +
                      /* template:array_get { */((pp).get(1))/* } */)) /
                    (double)
                      ((nx +
                          ny -
                          2)),
                  false),
                false));
            
//#line 210
/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.addObject(p);
        }/* } */
        }
        /* } */
        
        
//#line 215
/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.addLight(new Light(
                                                                                                               100,
                                                                                                               100,
                                                                                                               -50,
                                                                                                               1.0));
        
//#line 216
/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.addLight(new Light(
                                                                                                               -100,
                                                                                                               100,
                                                                                                               -50,
                                                                                                               1.0));
        
//#line 217
/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.addLight(new Light(
                                                                                                               100,
                                                                                                               -100,
                                                                                                               -50,
                                                                                                               1.0));
        
//#line 218
/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.addLight(new Light(
                                                                                                               -100,
                                                                                                               -100,
                                                                                                               -50,
                                                                                                               1.0));
        
//#line 219
/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.addLight(new Light(
                                                                                                               200,
                                                                                                               200,
                                                                                                               0,
                                                                                                               1.0));
        
//#line 221
return scene;
    }
    
    
//#line 224
public void
                   setScene(
                   final Scene scene) {
        
//#line 229
lightCount =
          /* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.getLights();
        
//#line 230
objCount =
          /* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.getObjects();
        
//#line 232
final Scene sc =
          scene;
        
//#line 235
final x10.
          lang.
          dist U =
          (x10.
            lang.
            dist)
            x10.
              lang.
              dist.
              UNIQUE;
        
//#line 237
final int mylightCount =
          lightCount;
        
//#line 238
final int myobjCount =
          objCount;
        
//#line 240
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 240
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = U; // make copy to avoid recomputation
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
                
//#line 242
final x10.
                  lang.
                  place pHere =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 243
x10.
                  lang.
                  region d1 =
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
                      mylightCount -
                        1));
                
//#line 244
x10.
                  lang.
                  region d2 =
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
                      myobjCount -
                        1));
                
//#line 246
final x10.
                  lang.
                  GenericReferenceArray templights =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d1.
                                                                                                                                  toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                     	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                       lang.
                       point l/* } */, x10.compilergenerated.Parameter1 dummy) { {
                         
//#line 248
final x10.
                           lang.
                           dist dTemp =
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
                             pHere);
                         
//#line 249
final x10.
                           lang.
                           GenericReferenceArray temp =
                           /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dTemp,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
                         
//#line 250
final x10.
                           lang.
                           point temp_l =
                           l;
                         
//#line 251
/* template:finish { */
                         {
                         	x10.lang.Runtime.getCurrentActivity().startFinish();
                         	try {
                         		{
                             
//#line 251
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                                            lang.
                                                                                            place.
                                                                                            FIRST_PLACE)).runAsync
                             	(new x10.runtime.Activity() {
                             		public void runX10Task() {
                             			{
                                 
//#line 252
final Light tempLight =
                                   /* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(sc))/* } */.getLight(temp_l);
                                 
//#line 253
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                                 	(new x10.runtime.Activity() {
                                 		public void runX10Task() {
                                 			{
                                     
//#line 253
/* template:array_set { */(temp).set(tempLight,0)/* } */;
                                 }
                                 		}
                                 	});/* } */
                             }
                             		}
                             	});/* } */
                         }
                         	} catch (Throwable tmp1) {
                         		x10.lang.Runtime.getCurrentActivity().pushException(tmp1);
                         	} finally {
                         		x10.lang.Runtime.getCurrentActivity().stopFinish();
                         	}
                         }
                         /* } */
                         
                         
//#line 255
return /* template:parametric { */((Light)(/* template:array_get { */((temp).get(0))/* } */))/* } */;
                     } }
                     }/* } */,true,false,true)/* } */);
                
//#line 257
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 257
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                                   lang.
                                                                                   place.
                                                                                   FIRST_PLACE)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 257
lights =
                          templights;
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
                
                
//#line 259
final x10.
                  lang.
                  GenericReferenceArray tempprim =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d2.
                                                                                                                                  toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                     	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                       lang.
                       point o/* } */, x10.compilergenerated.Parameter1 dummy) { {
                         
//#line 261
final x10.
                           lang.
                           dist dTemp1 =
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
                             pHere);
                         
//#line 262
final x10.
                           lang.
                           GenericReferenceArray temp1 =
                           /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dTemp1,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
                         
//#line 263
final x10.
                           lang.
                           point temp_o =
                           o;
                         
//#line 264
/* template:finish { */
                         {
                         	x10.lang.Runtime.getCurrentActivity().startFinish();
                         	try {
                         		{
                             
//#line 264
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                                            lang.
                                                                                            place.
                                                                                            FIRST_PLACE)).runAsync
                             	(new x10.runtime.Activity() {
                             		public void runX10Task() {
                             			{
                                 
//#line 265
final Sphere tempObject =
                                   /* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(sc))/* } */.getObject(temp_o);
                                 
//#line 266
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                                 	(new x10.runtime.Activity() {
                                 		public void runX10Task() {
                                 			{
                                     
//#line 266
/* template:array_set { */(temp1).set(tempObject,0)/* } */;
                                 }
                                 		}
                                 	});/* } */
                             }
                             		}
                             	});/* } */
                         }
                         	} catch (Throwable tmp3) {
                         		x10.lang.Runtime.getCurrentActivity().pushException(tmp3);
                         	} finally {
                         		x10.lang.Runtime.getCurrentActivity().stopFinish();
                         	}
                         }
                         /* } */
                         
                         
//#line 268
return /* template:parametric { */((Sphere)(/* template:array_get { */((temp1).get(0))/* } */))/* } */;
                     } }
                     }/* } */,true,false,true)/* } */);
                
//#line 270
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 270
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                                   lang.
                                                                                   place.
                                                                                   FIRST_PLACE)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 270
prim =
                          tempprim;
                    }
                    		}
                    	});/* } */
                }
                	} catch (Throwable tmp4) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp4);
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
        	} catch (Throwable tmp0) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp0);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 303
view =
          /* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.getView();
    }
    
    
//#line 307
public void
                   render(
                   final Interval interval) {
        
//#line 310
final x10.
          lang.
          region R =
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
              ((interval.
                  width *
                  ((interval.
                      yto -
                      interval.
                        yfrom)))) -
                1));
        
//#line 311
final x10.
          lang.
          dist DBlock =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 311
public x10.
                             lang.
                             dist
                             checkCast(
                             final x10.
                               lang.
                               dist x10_generated_objToCast) {
                  
//#line 311
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
              R));
        
//#line 312
final x10.
          lang.
          dist U =
          (x10.
            lang.
            dist)
            x10.
              lang.
              dist.
              UNIQUE;
        
//#line 313
final x10.
          lang.
          IntReferenceArray row =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(DBlock,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 316
final x10.
          lang.
          region chkSumReg =
          U.
            region;
        
//#line 317
final x10.
          lang.
          place pHere =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 318
final x10.
          lang.
          place fp =
          x10.
            lang.
            place.
            FIRST_PLACE;
        
//#line 319
final x10.
          lang.
          dist chkSumDist =
          x10.
            lang.
            dist.
            factory.
            constant(
            chkSumReg,
            fp);
        
//#line 320
checkSumArray =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.LongArray(chkSumDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 323
final View myview =
          view;
        
//#line 325
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 325
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = U; // make copy to avoid recomputation
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
                
//#line 326
final x10.
                  lang.
                  dist my_dist =
                  DBlock.
                    restriction(
                    /* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 328
long checksum1 =
                  0;
                
//#line 329
double frustrumwidth =
                  myview.
                    distance *
                  ((java.
                      lang.
                      Math.
                      sin(
                      myview.
                        angle) /
                      java.
                        lang.
                        Math.
                        cos(
                        myview.
                          angle)));
                
//#line 331
Vec viewVec =
                  Vec.
                    sub(
                    myview.
                      at,
                    myview.
                      from).
                    normalized();
                
//#line 332
Vec tmpVec =
                  new Vec(
                    viewVec,
                    false).
                    scale(
                    Vec.
                      dot(
                      myview.
                        up,
                      viewVec));
                
//#line 333
Vec upVec =
                  Vec.
                    sub(
                    myview.
                      up,
                    tmpVec).
                    normalized().
                    scale(
                    -frustrumwidth);
                
//#line 334
Vec leftVec =
                  Vec.
                    cross(
                    myview.
                      up,
                    viewVec).
                    normalized().
                    scale(
                    myview.
                      aspect *
                      frustrumwidth);
                
//#line 336
Ray r =
                  new Ray(
                  myview.
                    from,
                  voidVec);
                
//#line 338
/* template:forloop { */
                for (java.util.Iterator pixCounter__ = (my_dist.
                                                          region).iterator(); pixCounter__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pixCounter = (x10.
                  lang.
                  point) pixCounter__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 340
int y =
                      /* template:array_get { */((pixCounter).get(0))/* } */ /
                      interval.
                        width;
                    
//#line 341
int x =
                      /* template:array_get { */((pixCounter).get(0))/* } */ %
                      interval.
                        width;
                    
//#line 343
double ylen =
                      (double)
                        ((2.0 *
                            y)) /
                      (double)
                        interval.
                          width -
                      1.0;
                    
//#line 344
double xlen =
                      (double)
                        ((2.0 *
                            x)) /
                      (double)
                        interval.
                          width -
                      1.0;
                    
//#line 346
r =
                      /* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(r))/* } */.d(Vec.
                                                                                                   comb(
                                                                                                   xlen,
                                                                                                   leftVec,
                                                                                                   ylen,
                                                                                                   upVec).
                                                                                                   added(
                                                                                                   viewVec).
                                                                                                   normalized());
                    
//#line 347
Vec col =
                      trace(
                        0,
                        1.0,
                        r,
                        new Isect(
                          ),
                        new Ray(
                          ));
                    
//#line 350
int red =
                      (int)
                        ((col.
                            x *
                            255.0));
                    
//#line 351
if (red >
                                       255) {
                        
//#line 351
red =
                          255;
                    }
                    
//#line 352
int green =
                      (int)
                        ((col.
                            y *
                            255.0));
                    
//#line 353
if (green >
                                       255) {
                        
//#line 353
green =
                          255;
                    }
                    
//#line 354
int blue =
                      (int)
                        ((col.
                            z *
                            255.0));
                    
//#line 355
if (blue >
                                       255) {
                        
//#line 355
blue =
                          255;
                    }
                    
//#line 357
checksum1 =
                      checksum1 +
                        red +
                        green +
                        blue;
                }/* } */
                }
                /* } */
                
                
//#line 362
final long checksumx =
                  checksum1;
                
//#line 363
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 363
/* template:Async { */(x10.lang.Runtime.asPlace(fp)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 366
/* template:array_set { */(checkSumArray).set(checksumx,pl)/* } */;
                    }
                    		}
                    	});/* } */
                }
                	} catch (Throwable tmp6) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp6);
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
        	} catch (Throwable tmp5) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp5);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 370
final x10.
          lang.
          region regSum =
          checkSumArray.
            distribution.
            region;
        
//#line 371
/* template:forloop { */
        for (java.util.Iterator i__ = (chkSumReg).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 373
checksum =
              checksum +
                /* template:array_get { */((checkSumArray).get(i))/* } */;
        }/* } */
        }
        /* } */
        
    }
    
    
//#line 377
private boolean
                   intersect(
                   final Ray r,
                   final double maxt,
                   final Isect inter) {
        
//#line 378
int nhits =
          0;
        
//#line 379
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.t =
          1.0E9;
        
//#line 381
final x10.
          lang.
          place h =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 382
final x10.
          lang.
          dist dTemp =
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
        
//#line 383
final x10.
          lang.
          GenericReferenceArray temp =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dTemp,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 384
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 384
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                           lang.
                                                                           place.
                                                                           FIRST_PLACE)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 385
final int tempobjCount =
                  objCount;
                
//#line 386
final x10.
                  lang.
                  GenericReferenceArray tempprim =
                  prim;
                
//#line 387
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 388
/* template:array_set { */(temp).set(new Envelope(
                      tempobjCount,
                      tempprim),0)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp7) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp7);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 391
final int myobjCount =
          /* template:parametric { */((Envelope)(/* template:array_get { */((temp).get(0))/* } */))/* } */.
            i;
        
//#line 392
final x10.
          lang.
          GenericReferenceArray myprim =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:parametric { */((Envelope)(/* template:array_get { */((temp).get(0))/* } */))/* } */.
                a));
        
//#line 394
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
                                           myobjCount -
                                             1))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 397
Isect tp =
              /* template:parametric { */((Sphere)(/* template:array_get { */((myprim).get(i))/* } */))/* } */.
                intersect(
                r);
            
//#line 399
if (!/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.isNull &&
                               /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.t <
                               /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.t) {
                
//#line 400
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.t =
                  /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.t;
                
//#line 401
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.prim =
                  /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.prim;
                
//#line 402
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.surf =
                  /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.surf;
                
//#line 403
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.enter =
                  /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.enter;
                
//#line 404
nhits++;
            }
        }/* } */
        }
        /* } */
        
        
//#line 407
return nhits >
          0
          ? true
          : false;
    }
    
    
//#line 415
private int
                   Shadow(
                   final Ray r,
                   final double tmax,
                   final Isect inter) {
        
//#line 416
if (intersect(
                           r,
                           tmax,
                           inter)) {
            
//#line 417
return 0;
        }
        
//#line 418
return 1;
    }
    
    
//#line 425
private Vec
                   SpecularDirection(
                   final Vec I,
                   final Vec N) {
        
//#line 426
return Vec.
                              comb(
                              1.0 /
                                java.
                                  lang.
                                  Math.
                                  abs(
                                  Vec.
                                    dot(
                                    I,
                                    N)),
                              I,
                              2.0,
                              N).
                              normalized();
    }
    
    
//#line 432
private Vec
                   TransDir(
                   final Surface m1,
                   final Surface m2,
                   final Vec I,
                   final Vec N) {
        
//#line 433
double n1 =
          m1.
            isNull
          ? 1.0
          : m1.
              ior;
        
//#line 434
double n2 =
          m2.
            isNull
          ? 1.0
          : m2.
              ior;
        
//#line 435
double eta =
          n1 /
          n2;
        
//#line 436
double c1 =
          -Vec.
             dot(
             I,
             N);
        
//#line 437
double cs2 =
          1.0 -
          eta *
          eta *
          ((1.0 -
              c1 *
              c1));
        
//#line 438
if (cs2 <
                           0.0) {
            
//#line 438
return new Vec(
              0.0,
              0.0,
              0.0,
              true);
        }
        
//#line 439
return Vec.
                              comb(
                              eta,
                              I,
                              eta *
                                c1 -
                                java.
                                  lang.
                                  Math.
                                  sqrt(
                                  cs2),
                              N).
                              normalized();
    }
    
    
//#line 446
private Vec
                   shade(
                   final int level,
                   final double weight,
                   final Vec P,
                   final Vec N,
                   final Vec I,
                   final Isect hit,
                   final Ray tRay) {
        
//#line 448
Surface surf =
          /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(hit))/* } */.surf;
        
//#line 449
Vec bigr =
          new Vec(
          );
        
//#line 450
if (surf.
                           shine >
                           1.0E-6) {
            
//#line 451
bigr =
              SpecularDirection(
                I,
                N);
        }
        
//#line 454
final x10.
          lang.
          place h =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 455
final x10.
          lang.
          dist dTemp =
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
        
//#line 456
final x10.
          lang.
          GenericReferenceArray temp =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dTemp,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 457
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 457
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                           lang.
                                                                           place.
                                                                           FIRST_PLACE)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 458
final int templightCount =
                  lightCount;
                
//#line 459
final x10.
                  lang.
                  GenericReferenceArray templights =
                  lights;
                
//#line 460
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 461
/* template:array_set { */(temp).set(new Envelope2(
                      templightCount,
                      templights),0)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp8) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp8);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 464
final int mylightCount =
          /* template:parametric { */((Envelope2)(/* template:array_get { */((temp).get(0))/* } */))/* } */.
            i;
        
//#line 465
final x10.
          lang.
          GenericReferenceArray mylights =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:parametric { */((Envelope2)(/* template:array_get { */((temp).get(0))/* } */))/* } */.
                a));
        
//#line 468
Vec col =
          new Vec(
          );
        
//#line 469
/* template:forloop { */
        for (java.util.Iterator l__ = (x10.
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
                                           mylightCount -
                                             1))).iterator(); l__.hasNext(); ) {
        	final  x10.
          lang.
          point l = (x10.
          lang.
          point) l__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 472
Vec L =
              Vec.
                sub(
                /* template:parametric { */((Light)(/* template:array_get { */((mylights).get(l))/* } */))/* } */.
                  pos,
                P);
            
//#line 473
if (Vec.
                               dot(
                               N,
                               L) >=
                               0.0) {
                
//#line 474
L =
                  L.
                    normalized();
                
//#line 475
double t =
                  L.
                    length();
                
//#line 477
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.p =
                  P;
                
//#line 478
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.d =
                  L;
                
//#line 481
if (Shadow(
                                   tRay,
                                   t,
                                   hit) >
                                   0) {
                    
//#line 482
double diff =
                      Vec.
                        dot(
                        N,
                        L) *
                      surf.
                        kd *
                      /* template:parametric { */((Light)(/* template:array_get { */((mylights).get(l))/* } */))/* } */.
                        brightness;
                    
//#line 485
col =
                      col.
                        adds2(
                        diff,
                        surf.
                          color);
                    
//#line 486
if (surf.
                                       shine >
                                       1.0E-6) {
                        
//#line 487
double spec =
                          Vec.
                            dot(
                            bigr,
                            L);
                        
//#line 488
if (spec >
                                           1.0E-6) {
                            
//#line 489
spec =
                              java.
                                lang.
                                Math.
                                pow(
                                spec,
                                surf.
                                  shine);
                            
//#line 490
col =
                              col.
                                added(
                                new Vec(
                                  spec,
                                  spec,
                                  spec,
                                  false));
                        }
                    }
                }
            }
        }/* } */
        }
        /* } */
        
        
//#line 497
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.p =
          P;
        
//#line 498
if (surf.
                           ks *
                           weight >
                           0.0010) {
            
//#line 499
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.d =
              SpecularDirection(
                I,
                N);
            
//#line 500
Vec tcol =
              trace(
                level +
                  1,
                surf.
                  ks *
                  weight,
                tRay,
                hit,
                tRay);
            
//#line 501
col =
              col.
                adds2(
                surf.
                  ks,
                tcol);
        }
        
//#line 503
if (surf.
                           kt *
                           weight >
                           0.0010) {
            
//#line 504
if (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(hit))/* } */.enter >
                               0) {
                
//#line 505
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.d =
                  TransDir(
                    new Surface(
                      0,
                      0,
                      0,
                      new Vec(
                        ),
                      true),
                    surf,
                    I,
                    N);
            } else {
                
//#line 507
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.d =
                  TransDir(
                    surf,
                    new Surface(
                      0,
                      0,
                      0,
                      new Vec(
                        ),
                      true),
                    I,
                    N);
            }
            
//#line 509
Vec tcol =
              trace(
                level +
                  1,
                surf.
                  kt *
                  weight,
                tRay,
                hit,
                tRay);
            
//#line 510
col =
              col.
                adds2(
                surf.
                  kt,
                tcol);
        }
        
//#line 516
return col;
    }
    
    
//#line 522
private Vec
                   trace(
                   final int level,
                   final double weight,
                   final Ray r,
                   final Isect inter,
                   final Ray tRay) {
        
//#line 525
if (level >
                           6) {
            
//#line 526
return new Vec(
              );
        }
        
//#line 529
boolean hit =
          intersect(
            r,
            1000000.0,
            inter);
        
//#line 531
if (hit) {
            
//#line 532
Vec P =
              /* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(r))/* } */.rayPoint(/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.t);
            
//#line 534
Vec N =
              /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.prim.
                normal(
                P);
            
//#line 536
if (Vec.
                               dot(
                               /* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(r))/* } */.d,
                               N) >=
                               0.0) {
                
//#line 537
N =
                  N.
                    negate();
            }
            
//#line 540
return shade(
                                  level,
                                  weight,
                                  P,
                                  N,
                                  /* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(r))/* } */.d,
                                  inter,
                                  tRay);
        }
        
//#line 544
return voidVec;
    }
}
