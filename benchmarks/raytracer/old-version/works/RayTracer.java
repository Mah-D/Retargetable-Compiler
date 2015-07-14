import x10.lang.*;

public class RayTracer
extends x10.
  lang.
  Object
{
    
//#line 26
private Scene
      scene;
    
//#line 31
private x10.
      lang.
      GenericReferenceArray
      lights;
    
//#line 36
private x10.
      lang.
      GenericReferenceArray
      prim;
    
//#line 41
private View
      view;
    
//#line 46
final private static int
      alpha =
      255 <<
      24;
    
//#line 51
final private static Vec
      voidVec =
      new Vec(
      );
    
//#line 56
private int
      height;
    
//#line 61
private int
      width;
    
//#line 65
private x10.
      lang.
      IntReferenceArray
      datasizes;
    
//#line 67
private long
      checksum;
    
//#line 69
private x10.
      lang.
      LongReferenceArray
      checkSumArray;
    
//#line 70
private int
      size_t;
    
//#line 72
private int
      numobjects;
    
    
//#line 74
public RayTracer() {
        
//#line 74
super();
    }
    
    
//#line 83
public void
                  JGFsetsize(
                  int size_t) {
        
//#line 84
checksum =
          0;
        
//#line 85
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
        
//#line 86
datasizes =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(d1,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 87
/* template:array_set { */(datasizes).set(20,0)/* } */;
        
//#line 88
/* template:array_set { */(datasizes).set(500,1)/* } */;
        
//#line 89
this.
                      size_t =
          size_t;
    }
    
    
//#line 92
public void
                  JGFinitialise(
                  ) {
        
//#line 96
width =
          /* template:array_get { */((datasizes).get(size_t))/* } */;
        
//#line 97
height =
          /* template:array_get { */((datasizes).get(size_t))/* } */;
        
//#line 100
scene =
          createScene();
        
//#line 103
setScene(
                       scene);
        
//#line 106
numobjects =
          /* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.getObjects();
    }
    
    
//#line 111
public void
                   JGFapplication(
                   ) {
        
//#line 116
Interval interval =
          new Interval(
          0,
          width,
          height,
          0,
          height,
          1);
        
//#line 119
render(
                       interval);
    }
    
    
//#line 124
public void
                   JGFvalidate(
                   ) {
        
//#line 127
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
        
//#line 128
x10.
          lang.
          LongReferenceArray refval =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.LongArray(d1,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 130
/* template:array_set { */(refval).set(51428,0)/* } */;
        
//#line 131
/* template:array_set { */(refval).set(29827635,1)/* } */;
        
//#line 132
long dev =
          checksum -
          /* template:array_get { */((refval).get(size_t))/* } */;
        
//#line 133
if (dev !=
                           0) {
            
//#line 134
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("Validation failed");
            
//#line 135
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("Pixel checksum = " +
                                                                                                                              checksum);
            
//#line 136
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("Reference value = " +
                                                                                                                              /* template:array_get { */((refval).get(size_t))/* } */);
            
//#line 137
throw new java.
              lang.
              RuntimeException(
              "Validation failed");
        }
    }
    
    
//#line 141
public void
                   JGFtidyup(
                   ) {
        
    }
    
    
//#line 152
public void
                   run(
                   ) {
        
//#line 159
JGFsetsize(
                       0);
        
//#line 163
JGFinitialise();
        
//#line 164
JGFapplication();
        
//#line 165
JGFvalidate();
        
//#line 166
JGFtidyup();
    }
    
    
//#line 182
private Scene
                   createScene(
                   ) {
        
//#line 183
final int x =
          0;
        
//#line 184
final int y =
          0;
        
//#line 186
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
        
//#line 194
final int nx =
          4;
        
//#line 195
final int ny =
          4;
        
//#line 196
final int nz =
          4;
        
//#line 197
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
        
//#line 198
/* template:forloop-mult { */{
        x10.lang.region __var8__ = (x10.lang.region) reg;
        if (__var8__.size() > 0 && (__var8__ instanceof x10.array.MultiDimRegion || __var8__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var9__ = __var8__.rank(0).low(), __var10__ = __var8__.rank(0).high(); __var9__ <= __var10__; __var9__++)
        /* } */
        /* template:forloop-mult-each { */
        for (int __var11__ = __var8__.rank(1).low(), __var12__ = __var8__.rank(1).high(); __var11__ <= __var12__; __var11__++)
        /* } */
        /* template:forloop-mult-each { */
        for (int __var13__ = __var8__.rank(2).low(), __var14__ = __var8__.rank(2).high(); __var13__ <= __var14__; __var13__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var9__;
        /* } */
        /* template:final-var-assign { */
        final int j = __var11__;
        /* } */
        /* template:final-var-assign { */
        final int k = __var13__;
        /* } */
        /* } */
{
            
//#line 202
double xx =
              20.0 /
              ((nx -
                  1)) *
              i -
              10.0;
            
//#line 203
double yy =
              20.0 /
              ((ny -
                  1)) *
              j -
              10.0;
            
//#line 204
double zz =
              20.0 /
              ((nz -
                  1)) *
              k -
              10.0;
            
//#line 205
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
                  ((i +
                      j)) /
                    (double)
                      ((nx +
                          ny -
                          2)),
                  false),
                false));
            
//#line 209
/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.addObject(p);
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var0____ = (__var8__).iterator(); __var0____.hasNext(); ) {
        	final  x10.
          lang.
          point __var0__ = (x10.
          lang.
          point) __var0____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var0__).get(0))/* } */;
final int j =
          /* template:array_get { */((__var0__).get(1))/* } */;
final int k =
          /* template:array_get { */((__var0__).get(2))/* } */;/* } */
{
            
//#line 202
double xx =
              20.0 /
              ((nx -
                  1)) *
              i -
              10.0;
            
//#line 203
double yy =
              20.0 /
              ((ny -
                  1)) *
              j -
              10.0;
            
//#line 204
double zz =
              20.0 /
              ((nz -
                  1)) *
              k -
              10.0;
            
//#line 205
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
                  ((i +
                      j)) /
                    (double)
                      ((nx +
                          ny -
                          2)),
                  false),
                false));
            
//#line 209
/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.addObject(p);
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 216
/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.addLight(new Light(
                                                                                                               100,
                                                                                                               100,
                                                                                                               -50,
                                                                                                               1.0));
        
//#line 217
/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.addLight(new Light(
                                                                                                               -100,
                                                                                                               100,
                                                                                                               -50,
                                                                                                               1.0));
        
//#line 218
/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.addLight(new Light(
                                                                                                               100,
                                                                                                               -100,
                                                                                                               -50,
                                                                                                               1.0));
        
//#line 219
/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.addLight(new Light(
                                                                                                               -100,
                                                                                                               -100,
                                                                                                               -50,
                                                                                                               1.0));
        
//#line 220
/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.addLight(new Light(
                                                                                                               200,
                                                                                                               200,
                                                                                                               0,
                                                                                                               1.0));
        
//#line 222
return scene;
    }
    
    
//#line 225
public void
                   setScene(
                   Scene scene) {
        
//#line 230
int nLights =
          /* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.getLights();
        
//#line 231
int nObjects =
          /* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.getObjects();
        
//#line 232
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
                nLights)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 233
x10.
          lang.
          dist d2 =
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
                nObjects)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 234
lights =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d1,(x10.array.Operator.Pointwise)null,true,true,true)/* } */);
        
//#line 235
prim =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d2,(x10.array.Operator.Pointwise)null,true,true,true)/* } */);
        
//#line 241
/* template:forloop-mult { */{
        x10.lang.region __var15__ = (x10.lang.region) x10.
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
                                                          nLights -
                                                            1));
        if (__var15__.size() > 0 && (__var15__ instanceof x10.array.MultiDimRegion || __var15__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var16__ = __var15__.rank(0).low(), __var17__ = __var15__.rank(0).high(); __var16__ <= __var17__; __var16__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int l = __var16__;
        /* } */
        /* } */
{
            
//#line 242
/* template:array_set { */(lights).set(/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.getLight(l),l)/* } */;
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var1____ = (__var15__).iterator(); __var1____.hasNext(); ) {
        	final  x10.
          lang.
          point __var1__ = (x10.
          lang.
          point) __var1____.next();
        	/* Join: { *//* Join: { */final int l =
          /* template:array_get { */((__var1__).get(0))/* } */;/* } */
{
            
//#line 242
/* template:array_set { */(lights).set(/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.getLight(l),l)/* } */;
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 248
/* template:forloop-mult { */{
        x10.lang.region __var18__ = (x10.lang.region) x10.
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
                                                          nObjects -
                                                            1));
        if (__var18__.size() > 0 && (__var18__ instanceof x10.array.MultiDimRegion || __var18__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var19__ = __var18__.rank(0).low(), __var20__ = __var18__.rank(0).high(); __var19__ <= __var20__; __var19__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int o = __var19__;
        /* } */
        /* } */
{
            
//#line 249
/* template:array_set { */(prim).set(/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.getObject(o),o)/* } */;
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var2____ = (__var18__).iterator(); __var2____.hasNext(); ) {
        	final  x10.
          lang.
          point __var2__ = (x10.
          lang.
          point) __var2____.next();
        	/* Join: { *//* Join: { */final int o =
          /* template:array_get { */((__var2__).get(0))/* } */;/* } */
{
            
//#line 249
/* template:array_set { */(prim).set(/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.getObject(o),o)/* } */;
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 253
view =
          /* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.getView();
    }
    
    
//#line 256
public void
                   render(
                   final Interval interval) {
        
//#line 260
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
        
//#line 261
final x10.
          lang.
          dist DBlock =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 261
public x10.
                             lang.
                             dist
                             checkCast(
                             final x10.
                               lang.
                               dist x10_generated_objToCast) {
                  
//#line 261
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
        
//#line 262
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
        
//#line 263
final x10.
          lang.
          IntReferenceArray row =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(DBlock,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 265
checkSumArray =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.LongArray(U,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 266
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 266
/* template:ateach { */
            {
            	x10.lang.dist __var3____distCopy = U; // make copy to avoid recomputation
            	for (java.util.Iterator __var3____ = __var3____distCopy.iterator();
            		 __var3____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var3__ = (x10.
              lang.
              point) __var3____.next();
            		/* Join: { */final int pl =
              /* template:array_get { */((__var3__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var3____distCopy.get(__var3__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int pl =
              /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                
//#line 267
final x10.
                  lang.
                  dist my_dist =
                  DBlock.
                    restriction(
                    /* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 268
long checksum1 =
                  0;
                
//#line 269
double frustrumwidth =
                  view.
                    distance *
                  ((java.
                      lang.
                      Math.
                      sin(
                      view.
                        angle) /
                      java.
                        lang.
                        Math.
                        cos(
                        view.
                          angle)));
                
//#line 271
Vec viewVec =
                  Vec.
                    sub(
                    view.
                      at,
                    view.
                      from).
                    normalized();
                
//#line 272
Vec tmpVec =
                  new Vec(
                    viewVec,
                    false).
                    scale(
                    Vec.
                      dot(
                      view.
                        up,
                      viewVec));
                
//#line 273
Vec upVec =
                  Vec.
                    sub(
                    view.
                      up,
                    tmpVec).
                    normalized().
                    scale(
                    -frustrumwidth);
                
//#line 274
Vec leftVec =
                  Vec.
                    cross(
                    view.
                      up,
                    viewVec).
                    normalized().
                    scale(
                    view.
                      aspect *
                      frustrumwidth);
                
//#line 276
Ray r =
                  new Ray(
                  view.
                    from,
                  voidVec);
                
//#line 278
/* template:forloop-mult { */{
                x10.lang.region __var22__ = (x10.lang.region) my_dist.
                                                                region;
                if (__var22__.size() > 0 && (__var22__ instanceof x10.array.MultiDimRegion || __var22__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var23__ = __var22__.rank(0).low(), __var24__ = __var22__.rank(0).high(); __var23__ <= __var24__; __var23__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int pixCounter = __var23__;
                /* } */
                /* } */
{
                    
//#line 279
int y =
                      pixCounter /
                      interval.
                        width;
                    
//#line 280
int x =
                      pixCounter %
                      interval.
                        width;
                    
//#line 281
double ylen =
                      (double)
                        ((2.0 *
                            y)) /
                      (double)
                        interval.
                          width -
                      1.0;
                    
//#line 282
double xlen =
                      (double)
                        ((2.0 *
                            x)) /
                      (double)
                        interval.
                          width -
                      1.0;
                    
//#line 283
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
                    
//#line 284
Vec col =
                      trace(
                        0,
                        1.0,
                        r,
                        new Isect(
                          ),
                        new Ray(
                          ));
                    
//#line 287
int red =
                      (int)
                        ((col.
                            x *
                            255.0));
                    
//#line 288
if (red >
                                       255) {
                        
//#line 288
red =
                          255;
                    }
                    
//#line 289
int green =
                      (int)
                        ((col.
                            y *
                            255.0));
                    
//#line 290
if (green >
                                       255) {
                        
//#line 290
green =
                          255;
                    }
                    
//#line 291
int blue =
                      (int)
                        ((col.
                            z *
                            255.0));
                    
//#line 292
if (blue >
                                       255) {
                        
//#line 292
blue =
                          255;
                    }
                    
//#line 294
checksum1 +=
                      red +
                        green +
                        blue;
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var4____ = (__var22__).iterator(); __var4____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var4__ = (x10.
                  lang.
                  point) __var4____.next();
                	/* Join: { *//* Join: { */final int pixCounter =
                  /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                    
//#line 279
int y =
                      pixCounter /
                      interval.
                        width;
                    
//#line 280
int x =
                      pixCounter %
                      interval.
                        width;
                    
//#line 281
double ylen =
                      (double)
                        ((2.0 *
                            y)) /
                      (double)
                        interval.
                          width -
                      1.0;
                    
//#line 282
double xlen =
                      (double)
                        ((2.0 *
                            x)) /
                      (double)
                        interval.
                          width -
                      1.0;
                    
//#line 283
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
                    
//#line 284
Vec col =
                      trace(
                        0,
                        1.0,
                        r,
                        new Isect(
                          ),
                        new Ray(
                          ));
                    
//#line 287
int red =
                      (int)
                        ((col.
                            x *
                            255.0));
                    
//#line 288
if (red >
                                       255) {
                        
//#line 288
red =
                          255;
                    }
                    
//#line 289
int green =
                      (int)
                        ((col.
                            y *
                            255.0));
                    
//#line 290
if (green >
                                       255) {
                        
//#line 290
green =
                          255;
                    }
                    
//#line 291
int blue =
                      (int)
                        ((col.
                            z *
                            255.0));
                    
//#line 292
if (blue >
                                       255) {
                        
//#line 292
blue =
                          255;
                    }
                    
//#line 294
checksum1 +=
                      red +
                        green +
                        blue;
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
                
//#line 299
final long checksumx =
                  checksum1;
                
//#line 300
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 300
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                                   lang.
                                                                                   place.
                                                                                   FIRST_PLACE)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 303
/* template:array_set { */(checkSumArray).set(checksumx,pl)/* } */;
                    }
                    		}
                    	});/* } */
                }
                	} catch (Throwable tmp25) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp25);
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
        	} catch (Throwable tmp21) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp21);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 307
final x10.
          lang.
          region regSum =
          checkSumArray.
            distribution.
            region;
        
//#line 308
/* template:forloop-mult { */{
        x10.lang.region __var26__ = (x10.lang.region) regSum;
        if (__var26__.size() > 0 && (__var26__ instanceof x10.array.MultiDimRegion || __var26__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var27__ = __var26__.rank(0).low(), __var28__ = __var26__.rank(0).high(); __var27__ <= __var28__; __var27__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var27__;
        /* } */
        /* } */
{
            
//#line 310
checksum +=
              /* template:array_get { */((checkSumArray).get(i))/* } */;
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var5____ = (__var26__).iterator(); __var5____.hasNext(); ) {
        	final  x10.
          lang.
          point __var5__ = (x10.
          lang.
          point) __var5____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var5__).get(0))/* } */;/* } */
{
            
//#line 310
checksum +=
              /* template:array_get { */((checkSumArray).get(i))/* } */;
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
    }
    
    
//#line 314
private boolean
                   intersect(
                   Ray r,
                   double maxt,
                   Isect inter) {
        
//#line 315
int nhits =
          0;
        
//#line 316
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.t =
          1.0E9;
        
//#line 317
/* template:forloop-mult { */{
        x10.lang.region __var29__ = (x10.lang.region) x10.
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
                                                          /* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.getObjects() -
                                                            1));
        if (__var29__.size() > 0 && (__var29__ instanceof x10.array.MultiDimRegion || __var29__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var30__ = __var29__.rank(0).low(), __var31__ = __var29__.rank(0).high(); __var30__ <= __var31__; __var30__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var30__;
        /* } */
        /* } */
{
            
//#line 319
Isect tp =
              /* template:parametric { */((Sphere)(/* template:array_get { */((prim).get(i))/* } */))/* } */.
                intersect(
                r);
            
//#line 320
if (!/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.isNull &&
                               /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.t <
                               /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.t) {
                
//#line 321
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.t =
                  /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.t;
                
//#line 322
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.prim =
                  /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.prim;
                
//#line 323
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.surf =
                  /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.surf;
                
//#line 324
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.enter =
                  /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.enter;
                
//#line 325
nhits++;
            }
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var6____ = (__var29__).iterator(); __var6____.hasNext(); ) {
        	final  x10.
          lang.
          point __var6__ = (x10.
          lang.
          point) __var6____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var6__).get(0))/* } */;/* } */
{
            
//#line 319
Isect tp =
              /* template:parametric { */((Sphere)(/* template:array_get { */((prim).get(i))/* } */))/* } */.
                intersect(
                r);
            
//#line 320
if (!/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.isNull &&
                               /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.t <
                               /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.t) {
                
//#line 321
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.t =
                  /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.t;
                
//#line 322
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.prim =
                  /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.prim;
                
//#line 323
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.surf =
                  /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.surf;
                
//#line 324
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.enter =
                  /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.enter;
                
//#line 325
nhits++;
            }
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 328
return nhits >
          0
          ? true
          : false;
    }
    
    
//#line 336
private int
                   Shadow(
                   Ray r,
                   double tmax,
                   Isect inter) {
        
//#line 337
if (intersect(
                           r,
                           tmax,
                           inter)) {
            
//#line 338
return 0;
        }
        
//#line 339
return 1;
    }
    
    
//#line 346
private Vec
                   SpecularDirection(
                   Vec I,
                   Vec N) {
        
//#line 347
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
    
    
//#line 353
private Vec
                   TransDir(
                   Surface m1,
                   Surface m2,
                   Vec I,
                   Vec N) {
        
//#line 354
double n1 =
          m1.
            isNull
          ? 1.0
          : m1.
              ior;
        
//#line 355
double n2 =
          m2.
            isNull
          ? 1.0
          : m2.
              ior;
        
//#line 356
double eta =
          n1 /
          n2;
        
//#line 357
double c1 =
          -Vec.
             dot(
             I,
             N);
        
//#line 358
double cs2 =
          1.0 -
          eta *
          eta *
          ((1.0 -
              c1 *
              c1));
        
//#line 359
if (cs2 <
                           0.0) {
            
//#line 359
return new Vec(
              0.0,
              0.0,
              0.0,
              true);
        }
        
//#line 360
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
    
    
//#line 367
private Vec
                   shade(
                   int level,
                   double weight,
                   Vec P,
                   Vec N,
                   Vec I,
                   Isect hit,
                   Ray tRay) {
        
//#line 369
Surface surf =
          /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(hit))/* } */.surf;
        
//#line 370
Vec bigr =
          new Vec(
          );
        
//#line 371
if (surf.
                           shine >
                           1.0E-6) {
            
//#line 372
bigr =
              SpecularDirection(
                I,
                N);
        }
        
//#line 376
Vec col =
          new Vec(
          );
        
//#line 377
/* template:forloop-mult { */{
        x10.lang.region __var32__ = (x10.lang.region) x10.
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
                                                          /* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.getLights() -
                                                            1));
        if (__var32__.size() > 0 && (__var32__ instanceof x10.array.MultiDimRegion || __var32__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var33__ = __var32__.rank(0).low(), __var34__ = __var32__.rank(0).high(); __var33__ <= __var34__; __var33__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int l = __var33__;
        /* } */
        /* } */
{
            
//#line 380
Vec L =
              Vec.
                sub(
                (Vec)
                  ((/* template:parametric { */((Light)(/* template:array_get { */((lights).get(l))/* } */))/* } */.
                      pos)),
                P);
            
//#line 381
if (Vec.
                               dot(
                               N,
                               L) >=
                               0.0) {
                
//#line 382
L =
                  L.
                    normalized();
                
//#line 383
double t =
                  L.
                    length();
                
//#line 385
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.p =
                  P;
                
//#line 386
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.d =
                  L;
                
//#line 389
if (Shadow(
                                   tRay,
                                   t,
                                   hit) >
                                   0) {
                    
//#line 390
double diff =
                      Vec.
                        dot(
                        N,
                        L) *
                      surf.
                        kd *
                      /* template:parametric { */((Light)(/* template:array_get { */((lights).get(l))/* } */))/* } */.
                        brightness;
                    
//#line 393
col =
                      col.
                        adds(
                        diff,
                        surf.
                          color);
                    
//#line 394
if (surf.
                                       shine >
                                       1.0E-6) {
                        
//#line 395
double spec =
                          Vec.
                            dot(
                            bigr,
                            L);
                        
//#line 396
if (spec >
                                           1.0E-6) {
                            
//#line 397
spec =
                              java.
                                lang.
                                Math.
                                pow(
                                spec,
                                surf.
                                  shine);
                            
//#line 398
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
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var7____ = (__var32__).iterator(); __var7____.hasNext(); ) {
        	final  x10.
          lang.
          point __var7__ = (x10.
          lang.
          point) __var7____.next();
        	/* Join: { *//* Join: { */final int l =
          /* template:array_get { */((__var7__).get(0))/* } */;/* } */
{
            
//#line 380
Vec L =
              Vec.
                sub(
                (Vec)
                  ((/* template:parametric { */((Light)(/* template:array_get { */((lights).get(l))/* } */))/* } */.
                      pos)),
                P);
            
//#line 381
if (Vec.
                               dot(
                               N,
                               L) >=
                               0.0) {
                
//#line 382
L =
                  L.
                    normalized();
                
//#line 383
double t =
                  L.
                    length();
                
//#line 385
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.p =
                  P;
                
//#line 386
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.d =
                  L;
                
//#line 389
if (Shadow(
                                   tRay,
                                   t,
                                   hit) >
                                   0) {
                    
//#line 390
double diff =
                      Vec.
                        dot(
                        N,
                        L) *
                      surf.
                        kd *
                      /* template:parametric { */((Light)(/* template:array_get { */((lights).get(l))/* } */))/* } */.
                        brightness;
                    
//#line 393
col =
                      col.
                        adds(
                        diff,
                        surf.
                          color);
                    
//#line 394
if (surf.
                                       shine >
                                       1.0E-6) {
                        
//#line 395
double spec =
                          Vec.
                            dot(
                            bigr,
                            L);
                        
//#line 396
if (spec >
                                           1.0E-6) {
                            
//#line 397
spec =
                              java.
                                lang.
                                Math.
                                pow(
                                spec,
                                surf.
                                  shine);
                            
//#line 398
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
        
        }
        }
        /* } */
        
        
//#line 405
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.p =
          P;
        
//#line 406
if (surf.
                           ks *
                           weight >
                           0.0010) {
            
//#line 407
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.d =
              SpecularDirection(
                I,
                N);
            
//#line 408
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
            
//#line 409
col =
              col.
                adds(
                surf.
                  ks,
                tcol);
        }
        
//#line 411
if (surf.
                           kt *
                           weight >
                           0.0010) {
            
//#line 412
if (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(hit))/* } */.enter >
                               0) {
                
//#line 413
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.d =
                  (Vec)
                    ((TransDir(
                        new Surface(
                          0,
                          0,
                          0,
                          new Vec(
                            ),
                          true),
                        surf,
                        I,
                        N)));
            } else {
                
//#line 415
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.d =
                  (Vec)
                    ((TransDir(
                        surf,
                        new Surface(
                          0,
                          0,
                          0,
                          new Vec(
                            ),
                          true),
                        I,
                        N)));
            }
            
//#line 416
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
            
//#line 417
col =
              col.
                adds(
                surf.
                  kt,
                tcol);
        }
        
//#line 423
return col;
    }
    
    
//#line 429
private Vec
                   trace(
                   int level,
                   double weight,
                   Ray r,
                   Isect inter,
                   Ray tRay) {
        
//#line 431
if (level >
                           6) {
            
//#line 432
return new Vec(
              );
        }
        
//#line 435
boolean hit =
          intersect(
            r,
            1000000.0,
            inter);
        
//#line 436
if (hit) {
            
//#line 437
Vec P =
              /* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(r))/* } */.rayPoint(/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.t);
            
//#line 438
Vec N =
              /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.prim.
                normal(
                P);
            
//#line 439
if (Vec.
                               dot(
                               /* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(r))/* } */.d,
                               N) >=
                               0.0) {
                
//#line 440
N =
                  N.
                    negate();
            }
            
//#line 442
return shade(
                                  level,
                                  weight,
                                  P,
                                  N,
                                  /* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(r))/* } */.d,
                                  inter,
                                  tRay);
        }
        
//#line 445
return voidVec;
    }
}
