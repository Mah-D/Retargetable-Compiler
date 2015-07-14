package raytracer;

import x10.lang.*;

public class RayTracer
extends x10.
  lang.
  Object
{
    
//#line 27
raytracer.
      Scene
      scene;
    
//#line 32
raytracer.
      Light[]
      lights;
    
//#line 37
raytracer.
      Primitive[]
      prim;
    
//#line 42
raytracer.
      View
      view;
    
//#line 47
final static int
      alpha =
      255 <<
      24;
    
//#line 52
final static raytracer.
      Vec
      voidVec =
      new raytracer.
      Vec(
      );
    
//#line 57
int
      height;
    
//#line 62
int
      width;
    
//#line 65
int[]
      datasizes =
      { 20,
    500 };
    
//#line 67
long
      checksum =
      0;
    
//#line 69
int
      size;
    
//#line 71
int
      numobjects;
    
    
//#line 77
raytracer.
                  Scene
                  createScene(
                  ) {
        
//#line 78
final int x =
          0;
        
//#line 79
final int y =
          0;
        
//#line 81
raytracer.
          Scene scene =
          new raytracer.
          Scene(
          new raytracer.
            View(
            new raytracer.
              Vec(
              x,
              20,
              -30),
            new raytracer.
              Vec(
              x,
              y,
              0),
            new raytracer.
              Vec(
              0,
              1,
              0),
            1.0,
            35.0 *
              3.14159265 /
              180.0,
            1.0));
        
//#line 89
final int nx =
          4;
        
//#line 90
final int ny =
          4;
        
//#line 91
final int nz =
          4;
        
//#line 92
for (
//#line 92
int i =
                           0;
                         i <
                           nx;
                         
//#line 92
i++) {
            
//#line 93
for (
//#line 93
int j =
                               0;
                             j <
                               ny;
                             
//#line 93
j++) {
                
//#line 94
for (
//#line 94
int k =
                                   0;
                                 k <
                                   nz;
                                 
//#line 94
k++) {
                    
//#line 95
double xx =
                      20.0 /
                      ((nx -
                          1)) *
                      i -
                      10.0;
                    
//#line 96
double yy =
                      20.0 /
                      ((ny -
                          1)) *
                      j -
                      10.0;
                    
//#line 97
double zz =
                      20.0 /
                      ((nz -
                          1)) *
                      k -
                      10.0;
                    
//#line 98
raytracer.
                      Primitive p =
                      new raytracer.
                      Sphere(
                      new raytracer.
                        Vec(
                        xx,
                        yy,
                        zz),
                      3,
                      new raytracer.
                        Surface(
                        15.0,
                        1.5 -
                          1.0,
                        1.5 -
                          1.0,
                        new raytracer.
                          Vec(
                          0,
                          0,
                          ((i +
                              j)) /
                            (double)
                              ((nx +
                                  ny -
                                  2)))));
                    
//#line 101
scene.
                                   addObject(
                                   p);
                }
            }
        }
        
//#line 107
scene.
                       addLight(
                       new raytracer.
                         Light(
                         100,
                         100,
                         -50,
                         1.0));
        
//#line 108
scene.
                       addLight(
                       new raytracer.
                         Light(
                         -100,
                         100,
                         -50,
                         1.0));
        
//#line 109
scene.
                       addLight(
                       new raytracer.
                         Light(
                         100,
                         -100,
                         -50,
                         1.0));
        
//#line 110
scene.
                       addLight(
                       new raytracer.
                         Light(
                         -100,
                         -100,
                         -50,
                         1.0));
        
//#line 111
scene.
                       addLight(
                       new raytracer.
                         Light(
                         200,
                         200,
                         0,
                         1.0));
        
//#line 113
return scene;
    }
    
    
//#line 116
public void
                   setScene(
                   raytracer.
                     Scene scene) {
        
//#line 119
int nLights =
          scene.
            getLights();
        
//#line 120
int nObjects =
          scene.
            getObjects();
        
//#line 122
lights =
          (new raytracer.
             Light[nLights]);
        
//#line 123
prim =
          (new raytracer.
             Primitive[nObjects]);
        
//#line 126
for (
//#line 126
int l =
                            0;
                          l <
                            nLights;
                          
//#line 126
l++) {
            
//#line 127
lights[l] =
              scene.
                getLight(
                l);
        }
        
//#line 131
for (
//#line 131
int o =
                            0;
                          o <
                            nObjects;
                          
//#line 131
o++) {
            
//#line 132
prim[o] =
              scene.
                getObject(
                o);
        }
        
//#line 136
view =
          scene.
            getView();
    }
    
    
//#line 139
public void
                   render(
                   final raytracer.
                     Interval interval) {
        
//#line 143
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
        
//#line 144
final x10.
          lang.
          dist DBlock =
          x10.
            lang.
            dist.
            factory.
            block(
            R);
        
//#line 145
final x10.
          lang.
          dist U =
          x10.
            lang.
            dist.
            factory.
            unique();
        
//#line 146
final x10.
          lang.
          IntReferenceArray row =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(DBlock,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 148
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 148
/* template:ateach { */
            {
            	x10.lang.dist __var0____distCopy = U; // make copy to avoid recomputation
            	for (java.util.Iterator __var0____ = __var0____distCopy.iterator();
            		 __var0____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var0__ = (x10.
              lang.
              point) __var0____.next();
            		/* Join: { */final int pl =
              /* template:array_get { */((__var0__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var0____distCopy.get(__var0__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int pl =
              /* template:array_get { */((__var0__).get(0))/* } */;/* } */
{
                
//#line 149
final x10.
                  lang.
                  dist my_dist =
                  DBlock.
                    restriction(
                    /* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 150
long checksum1 =
                  0;
                
//#line 151
double frustrumwidth =
                  view.
                    dist *
                  java.
                    lang.
                    Math.
                    tan(
                    view.
                      angle);
                
//#line 152
raytracer.
                  Vec viewVec =
                  raytracer.
                    Vec.
                    sub(
                    view.
                      at,
                    view.
                      from).
                    normalized();
                
//#line 153
raytracer.
                  Vec tmpVec =
                  new raytracer.
                    Vec(
                    viewVec).
                    scale(
                    raytracer.
                      Vec.
                      dot(
                      view.
                        up,
                      viewVec));
                
//#line 154
raytracer.
                  Vec upVec =
                  raytracer.
                    Vec.
                    sub(
                    view.
                      up,
                    tmpVec).
                    normalized().
                    scale(
                    -frustrumwidth);
                
//#line 155
raytracer.
                  Vec leftVec =
                  raytracer.
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
                
//#line 157
raytracer.
                  Ray r =
                  new raytracer.
                  Ray(
                  view.
                    from,
                  voidVec);
                
//#line 159
/* template:forloop-mult { */{
                x10.lang.region __var19__ = (x10.lang.region) my_dist.
                                                                region;
                if (__var19__.size() > 0 && (__var19__ instanceof x10.array.MultiDimRegion || __var19__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var20__ = __var19__.rank(0).low(), __var21__ = __var19__.rank(0).high(); __var20__ <= __var21__; __var20__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int pixCounter = __var20__;
                /* } */
                /* } */
{
                    
//#line 160
int y =
                      pixCounter /
                      interval.
                        width;
                    
//#line 161
int x =
                      pixCounter %
                      interval.
                        width;
                    
//#line 162
double ylen =
                      (double)
                        ((2.0 *
                            y)) /
                      (double)
                        interval.
                          width -
                      1.0;
                    
//#line 163
double xlen =
                      (double)
                        ((2.0 *
                            x)) /
                      (double)
                        interval.
                          width -
                      1.0;
                    
//#line 164
r =
                      /* template:place-check { */((raytracer.Ray) x10.lang.Runtime.hereCheck(r))/* } */.d(raytracer.
                                                                                                             Vec.
                                                                                                             comb(
                                                                                                             xlen,
                                                                                                             leftVec,
                                                                                                             ylen,
                                                                                                             upVec).
                                                                                                             added(
                                                                                                             viewVec).
                                                                                                             normalized());
                    
//#line 165
raytracer.
                      Vec col =
                      trace(
                        0,
                        1.0,
                        r,
                        new raytracer.
                          Isect(
                          ),
                        new raytracer.
                          Ray(
                          ));
                    
//#line 168
int red =
                      (int)
                        ((col.
                            x *
                            255.0));
                    
//#line 169
if (red >
                                       255) {
                        
//#line 169
red =
                          255;
                    }
                    
//#line 170
int green =
                      (int)
                        ((col.
                            y *
                            255.0));
                    
//#line 171
if (green >
                                       255) {
                        
//#line 171
green =
                          255;
                    }
                    
//#line 172
int blue =
                      (int)
                        ((col.
                            z *
                            255.0));
                    
//#line 173
if (blue >
                                       255) {
                        
//#line 173
blue =
                          255;
                    }
                    
//#line 175
checksum1 +=
                      red +
                        green +
                        blue;
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var1____ = (__var19__).iterator(); __var1____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var1__ = (x10.
                  lang.
                  point) __var1____.next();
                	/* Join: { *//* Join: { */final int pixCounter =
                  /* template:array_get { */((__var1__).get(0))/* } */;/* } */
{
                    
//#line 160
int y =
                      pixCounter /
                      interval.
                        width;
                    
//#line 161
int x =
                      pixCounter %
                      interval.
                        width;
                    
//#line 162
double ylen =
                      (double)
                        ((2.0 *
                            y)) /
                      (double)
                        interval.
                          width -
                      1.0;
                    
//#line 163
double xlen =
                      (double)
                        ((2.0 *
                            x)) /
                      (double)
                        interval.
                          width -
                      1.0;
                    
//#line 164
r =
                      /* template:place-check { */((raytracer.Ray) x10.lang.Runtime.hereCheck(r))/* } */.d(raytracer.
                                                                                                             Vec.
                                                                                                             comb(
                                                                                                             xlen,
                                                                                                             leftVec,
                                                                                                             ylen,
                                                                                                             upVec).
                                                                                                             added(
                                                                                                             viewVec).
                                                                                                             normalized());
                    
//#line 165
raytracer.
                      Vec col =
                      trace(
                        0,
                        1.0,
                        r,
                        new raytracer.
                          Isect(
                          ),
                        new raytracer.
                          Ray(
                          ));
                    
//#line 168
int red =
                      (int)
                        ((col.
                            x *
                            255.0));
                    
//#line 169
if (red >
                                       255) {
                        
//#line 169
red =
                          255;
                    }
                    
//#line 170
int green =
                      (int)
                        ((col.
                            y *
                            255.0));
                    
//#line 171
if (green >
                                       255) {
                        
//#line 171
green =
                          255;
                    }
                    
//#line 172
int blue =
                      (int)
                        ((col.
                            z *
                            255.0));
                    
//#line 173
if (blue >
                                       255) {
                        
//#line 173
blue =
                          255;
                    }
                    
//#line 175
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
                
                
//#line 180
final long checksumx =
                  checksum1;
                
//#line 181
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 181
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                                   lang.
                                                                                   place.
                                                                                   FIRST_PLACE)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 182
/* template:Atomic { */
                        synchronized (x10.lang.Runtime.here()) {
                        	try {
                        		{
                            
//#line 182
checksum +=
                              checksumx;
                        }
                        	} finally {
                        		x10.lang.Runtime.here().notifyAll();
                        	}
                        }/* } */
                    }
                    		}
                    	});/* } */
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
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp18) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp18);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 187
boolean
                   intersect(
                   raytracer.
                     Ray r,
                   double maxt,
                   raytracer.
                     Isect inter) {
        
//#line 188
/*nullable<*/raytracer.
          Isect/*>*/ tp;
        
//#line 189
int i;
        
//#line 189
int nhits;
        
//#line 191
nhits =
          0;
        
//#line 192
/* template:place-check { */((raytracer.Isect) x10.lang.Runtime.hereCheck(inter))/* } */.t =
          1.0E9;
        
//#line 193
for (
//#line 193
i =
                            0;
                          i <
                            prim.
                              length;
                          
//#line 193
i++) {
            
//#line 195
tp =
              prim[i].
                intersect(
                r);
            
//#line 196
if (tp !=
                               null &&
                               /* template:place-check { */((raytracer.Isect) x10.lang.Runtime.hereCheck(tp))/* } */.t <
                               /* template:place-check { */((raytracer.Isect) x10.lang.Runtime.hereCheck(inter))/* } */.t) {
                
//#line 197
/* template:place-check { */((raytracer.Isect) x10.lang.Runtime.hereCheck(inter))/* } */.t =
                  /* template:place-check { */((raytracer.Isect) x10.lang.Runtime.hereCheck(tp))/* } */.t;
                
//#line 198
/* template:place-check { */((raytracer.Isect) x10.lang.Runtime.hereCheck(inter))/* } */.prim =
                  /* template:place-check { */((raytracer.Isect) x10.lang.Runtime.hereCheck(tp))/* } */.prim;
                
//#line 199
/* template:place-check { */((raytracer.Isect) x10.lang.Runtime.hereCheck(inter))/* } */.surf =
                  /* template:place-check { */((raytracer.Isect) x10.lang.Runtime.hereCheck(tp))/* } */.surf;
                
//#line 200
/* template:place-check { */((raytracer.Isect) x10.lang.Runtime.hereCheck(inter))/* } */.enter =
                  /* template:place-check { */((raytracer.Isect) x10.lang.Runtime.hereCheck(tp))/* } */.enter;
                
//#line 201
nhits++;
            }
        }
        
//#line 204
return nhits >
          0
          ? (boolean)
              true
          : (boolean)
              false;
    }
    
    
//#line 212
int
                   Shadow(
                   raytracer.
                     Ray r,
                   double tmax,
                   raytracer.
                     Isect inter) {
        
//#line 213
if (intersect(
                           r,
                           tmax,
                           inter)) {
            
//#line 214
return 0;
        }
        
//#line 215
return 1;
    }
    
    
//#line 222
raytracer.
                   Vec
                   SpecularDirection(
                   raytracer.
                     Vec I,
                   raytracer.
                     Vec N) {
        
//#line 223
return raytracer.
                              Vec.
                              comb(
                              1.0 /
                                java.
                                  lang.
                                  Math.
                                  abs(
                                  raytracer.
                                    Vec.
                                    dot(
                                    I,
                                    N)),
                              I,
                              2.0,
                              N).
                              normalized();
    }
    
    
//#line 229
/*nullable<*/raytracer.
                   Vec/*>*/
                   TransDir(
                   /*nullable<*/raytracer.
                     Surface/*>*/ m1,
                   /*nullable<*/raytracer.
                     Surface/*>*/ m2,
                   raytracer.
                     Vec I,
                   raytracer.
                     Vec N) {
        
//#line 230
double n1 =
          m1 ==
          null
          ? 1.0
          : m1.
              ior;
        
//#line 231
double n2 =
          m2 ==
          null
          ? 1.0
          : m2.
              ior;
        
//#line 232
double eta =
          n1 /
          n2;
        
//#line 233
double c1 =
          -raytracer.
             Vec.
             dot(
             I,
             N);
        
//#line 234
double cs2 =
          1.0 -
          eta *
          eta *
          ((1.0 -
              c1 *
              c1));
        
//#line 235
if (cs2 <
                           0.0) {
            
//#line 235
return null;
        }
        
//#line 236
return raytracer.
                              Vec.
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
    
    
//#line 243
raytracer.
                   Vec
                   shade(
                   int level,
                   double weight,
                   raytracer.
                     Vec P,
                   raytracer.
                     Vec N,
                   raytracer.
                     Vec I,
                   raytracer.
                     Isect hit,
                   raytracer.
                     Ray tRay) {
        
//#line 245
/*nullable<*/raytracer.
          Surface/*>*/ surf =
          /* template:place-check { */((raytracer.Isect) x10.lang.Runtime.hereCheck(hit))/* } */.surf;
        
//#line 246
raytracer.
          Vec bigr =
          new raytracer.
          Vec(
          );
        
//#line 247
if (surf.
                           shine >
                           1.0E-6) {
            
//#line 248
bigr =
              SpecularDirection(
                I,
                N);
        }
        
//#line 252
raytracer.
          Vec col =
          new raytracer.
          Vec(
          );
        
//#line 253
for (
//#line 253
int l =
                            0;
                          l <
                            lights.
                              length;
                          
//#line 253
l++) {
            
//#line 254
raytracer.
              Vec L =
              raytracer.
                Vec.
                sub(
                lights[l].
                  pos,
                P);
            
//#line 255
if (raytracer.
                               Vec.
                               dot(
                               N,
                               L) >=
                               0.0) {
                
//#line 256
L =
                  L.
                    normalized();
                
//#line 257
double t =
                  L.
                    length();
                
//#line 259
/* template:place-check { */((raytracer.Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.p =
                  P;
                
//#line 260
/* template:place-check { */((raytracer.Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.d =
                  L;
                
//#line 263
if (Shadow(
                                   tRay,
                                   t,
                                   hit) >
                                   0) {
                    
//#line 264
double diff =
                      raytracer.
                        Vec.
                        dot(
                        N,
                        L) *
                      surf.
                        kd *
                      lights[l].
                        brightness;
                    
//#line 267
col =
                      col.
                        adds(
                        diff,
                        surf.
                          color);
                    
//#line 268
if (surf.
                                       shine >
                                       1.0E-6) {
                        
//#line 269
double spec =
                          raytracer.
                            Vec.
                            dot(
                            bigr,
                            L);
                        
//#line 270
if (spec >
                                           1.0E-6) {
                            
//#line 271
spec =
                              java.
                                lang.
                                Math.
                                pow(
                                spec,
                                surf.
                                  shine);
                            
//#line 272
col =
                              col.
                                added(
                                new raytracer.
                                  Vec(
                                  spec,
                                  spec,
                                  spec));
                        }
                    }
                }
            }
        }
        
//#line 279
/* template:place-check { */((raytracer.Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.p =
          P;
        
//#line 280
if (surf.
                           ks *
                           weight >
                           0.0010) {
            
//#line 281
/* template:place-check { */((raytracer.Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.d =
              SpecularDirection(
                I,
                N);
            
//#line 282
raytracer.
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
            
//#line 283
col =
              col.
                adds(
                surf.
                  ks,
                tcol);
        }
        
//#line 285
if (surf.
                           kt *
                           weight >
                           0.0010) {
            
//#line 286
if (/* template:place-check { */((raytracer.Isect) x10.lang.Runtime.hereCheck(hit))/* } */.enter >
                               0) {
                
//#line 287
/* template:place-check { */((raytracer.Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.d =
                  (raytracer.
                    Vec)
                    x10.
                      runtime.
                      RuntimeCastChecker.
                      checkCastToNonNullable(
                      TransDir(
                        null,
                        surf,
                        I,
                        N),
                      raytracer.
                        Vec.class);
            } else {
                
//#line 289
/* template:place-check { */((raytracer.Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.d =
                  (raytracer.
                    Vec)
                    x10.
                      runtime.
                      RuntimeCastChecker.
                      checkCastToNonNullable(
                      TransDir(
                        surf,
                        null,
                        I,
                        N),
                      raytracer.
                        Vec.class);
            }
            
//#line 290
raytracer.
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
            
//#line 291
col =
              col.
                adds(
                surf.
                  kt,
                tcol);
        }
        
//#line 297
return col;
    }
    
    
//#line 303
raytracer.
                   Vec
                   trace(
                   int level,
                   double weight,
                   raytracer.
                     Ray r,
                   raytracer.
                     Isect inter,
                   raytracer.
                     Ray tRay) {
        
//#line 305
if (level >
                           6) {
            
//#line 306
return new raytracer.
              Vec(
              );
        }
        
//#line 309
boolean hit =
          intersect(
            r,
            1000000.0,
            inter);
        
//#line 310
if (hit) {
            
//#line 311
raytracer.
              Vec P =
              /* template:place-check { */((raytracer.Ray) x10.lang.Runtime.hereCheck(r))/* } */.point(/* template:place-check { */((raytracer.Isect) x10.lang.Runtime.hereCheck(inter))/* } */.t);
            
//#line 312
raytracer.
              Vec N =
              /* template:place-check { */((raytracer.Isect) x10.lang.Runtime.hereCheck(inter))/* } */.prim.
                normal(
                P);
            
//#line 313
if (raytracer.
                               Vec.
                               dot(
                               /* template:place-check { */((raytracer.Ray) x10.lang.Runtime.hereCheck(r))/* } */.d,
                               N) >=
                               0.0) {
                
//#line 314
N =
                  N.
                    negate();
            }
            
//#line 316
return shade(
                                  level,
                                  weight,
                                  P,
                                  N,
                                  /* template:place-check { */((raytracer.Ray) x10.lang.Runtime.hereCheck(r))/* } */.d,
                                  inter,
                                  tRay);
        }
        
//#line 319
return voidVec;
    }
    
    
//#line 25
public RayTracer() {
        
//#line 25
super();
    }
}
