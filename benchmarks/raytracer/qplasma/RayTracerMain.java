import x10.lang.*;

class Envelope2
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 2
final public int
      i;
    
//#line 3
final public x10.
      lang.
      GenericReferenceArray
      a;
    
    
//#line 4
public Envelope2(final int i1,
                                final x10.
                                  lang.
                                  GenericReferenceArray a1) {
        
//#line 4
super();
        
//#line 5
i =
          i1;
        
//#line 6
a =
          a1;
    }
    
    
//#line 8
public java.
                 lang.
                 String
                 toString(
                 ) {
        
//#line 9
return "";
    }
}

class Ray
extends x10.
  lang.
  Object
{
    
//#line 14
public Vec
      p;
    
//#line 15
public Vec
      d;
    
    
//#line 16
public Ray(final Vec pnt,
                           final Vec dir) {
        
//#line 16
super();
        
//#line 17
p =
          new Vec(
            pnt.
              x,
            pnt.
              y,
            pnt.
              z,
            false);
        
//#line 18
d =
          new Vec(
            dir.
              x,
            dir.
              y,
            dir.
              z,
            false).
            normalized();
    }
    
    
//#line 20
public Ray(final Vec pnt,
                           final Vec dir,
                           final boolean normalize) {
        
//#line 20
super();
        
//#line 21
if (normalize) {
            
//#line 22
p =
              new Vec(
                pnt.
                  x,
                pnt.
                  y,
                pnt.
                  z,
                false);
            
//#line 23
d =
              new Vec(
                dir.
                  x,
                dir.
                  y,
                dir.
                  z,
                false).
                normalized();
        } else {
            
//#line 26
p =
              pnt;
            
//#line 27
d =
              dir;
        }
    }
    
    
//#line 30
public Ray() {
        
//#line 30
super();
        
//#line 31
p =
          new Vec(
            );
        
//#line 32
d =
          new Vec(
            );
    }
    
    
//#line 34
public Ray
                  d(
                  final Vec d_) {
        
//#line 35
return new Ray(
          p,
          d_,
          false);
    }
    
    
//#line 37
public Vec
                  rayPoint(
                  final double t) {
        
//#line 38
return new Vec(
          p.
            x +
            d.
              x *
            t,
          p.
            y +
            d.
              y *
            t,
          p.
            z +
            d.
              z *
            t,
          false);
    }
    
    
//#line 40
public java.
                  lang.
                  String
                  toString(
                  ) {
        
//#line 41
return " { " +
        p.
          toString() +
        "->" +
        d.
          toString() +
        " } ";
    }
}

public class RayTracerMain
extends x10.
  lang.
  Object
{
    
    
//#line 46
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
            
//#line 48
Timer tmr =
              new Timer(
              );
            
//#line 49
int count =
              0;
            
//#line 50
/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.start(count);
            
//#line 51
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(new RayTracer(
              )))/* } */.run();
            
//#line 52
/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.stop(count);
            
//#line 53
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                        lang.
                                                                                                        System.
                                                                                                        out))/* } */.println("Wall-clock time for raytracer: " +
                                                                                                                             /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.readTimer(count) +
                                                                                                                             " secs");
        }
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 45
public RayTracerMain() {
        
//#line 45
super();
    }
}

class Envelope
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 59
final public int
      i;
    
//#line 60
final public x10.
      lang.
      GenericReferenceArray
      a;
    
    
//#line 61
public Envelope(final int i1,
                                final x10.
                                  lang.
                                  GenericReferenceArray a1) {
        
//#line 61
super();
        
//#line 62
i =
          i1;
        
//#line 63
a =
          a1;
    }
    
    
//#line 65
public java.
                  lang.
                  String
                  toString(
                  ) {
        
//#line 66
return "";
    }
}

class Light
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 71
final public Vec
      pos;
    
//#line 72
final public double
      brightness;
    
    
//#line 73
public Light(final double x,
                             final double y,
                             final double z,
                             final double b) {
        
//#line 73
super();
        
//#line 74
pos =
          new Vec(
            x,
            y,
            z,
            false);
        
//#line 75
brightness =
          b;
    }
    
    
//#line 77
public java.
                  lang.
                  String
                  toString(
                  ) {
        
//#line 78
return pos +
        " " +
        brightness;
    }
}

class Sphere
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 83
final private Vec
      c;
    
//#line 84
final private double
      r;
    
//#line 85
final private double
      r2;
    
//#line 86
final public Surface
      surf;
    
    
//#line 87
public Sphere(final Vec center,
                              final double radius,
                              final Surface s) {
        
//#line 87
super();
        
//#line 88
surf =
          s;
        
//#line 89
c =
          center;
        
//#line 90
r =
          radius;
        
//#line 91
r2 =
          radius *
            radius;
    }
    
    
//#line 93
public Sphere(final Vec center,
                              final double radius) {
        
//#line 93
super();
        
//#line 94
c =
          center;
        
//#line 95
r =
          radius;
        
//#line 96
r2 =
          radius *
            radius;
        
//#line 97
surf =
          new Surface(
            );
    }
    
    
//#line 99
public Isect
                  intersect(
                  final Ray ry) {
        
//#line 100
Vec v =
          Vec.
            sub(
            c,
            /* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(ry))/* } */.p);
        
//#line 101
double b =
          Vec.
            dot(
            v,
            /* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(ry))/* } */.d);
        
//#line 102
double disc =
          b *
          b -
          Vec.
            dot(
            v,
            v) +
          r2;
        
//#line 103
if (disc <
                           0.0) {
            
//#line 104
return new Isect(
              0.0,
              0,
              true,
              this,
              surf);
        }
        
//#line 106
disc =
          java.
            lang.
            Math.
            sqrt(
            disc);
        
//#line 107
double t =
          ((b -
              disc <
              1.0E-6))
          ? b +
          disc
          : b -
          disc;
        
//#line 108
if (t <
                           1.0E-6) {
            
//#line 109
return new Isect(
              0.0,
              0,
              true,
              this,
              surf);
        }
        
//#line 111
Isect ip =
          new Isect(
          t,
          Vec.
            dot(
            v,
            v) >
            r2 +
            1.0E-6
            ? 1
            : 0,
          false,
          this,
          surf);
        
//#line 112
return ip;
    }
    
    
//#line 114
public Vec
                   normal(
                   final Vec p) {
        
//#line 115
return Vec.
                              sub(
                              p,
                              c).
                              normalized();
    }
    
    
//#line 117
public java.
                   lang.
                   String
                   toString(
                   ) {
        
//#line 118
return "Sphere {" +
        c.
          toString() +
        "," +
        r +
        "}";
    }
    
    
//#line 120
public Vec
                   getCenter(
                   ) {
        
//#line 121
return c;
    }
}

class Vec
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 126
final public double
      x;
    
//#line 127
final public double
      y;
    
//#line 128
final public double
      z;
    
//#line 129
final public boolean
      isNull;
    
    
//#line 130
public Vec(final double a,
                            final double b,
                            final double c,
                            final boolean isNull_) {
        
//#line 130
super();
        
//#line 131
x =
          a;
        
//#line 132
y =
          b;
        
//#line 133
z =
          c;
        
//#line 134
isNull =
          isNull_;
    }
    
    
//#line 136
public Vec(final Vec a,
                            final boolean isNull_) {
        
//#line 136
super();
        
//#line 137
x =
          a.
            x;
        
//#line 138
y =
          a.
            y;
        
//#line 139
z =
          a.
            z;
        
//#line 140
isNull =
          isNull_;
    }
    
    
//#line 142
public Vec() {
        
//#line 142
super();
        
//#line 143
x =
          0.0;
        
//#line 144
y =
          0.0;
        
//#line 145
z =
          0.0;
        
//#line 146
isNull =
          false;
    }
    
    
//#line 148
public Vec
                   added(
                   final Vec a) {
        
//#line 149
return new Vec(
          x +
            a.
              x,
          y +
            a.
              y,
          z +
            a.
              z,
          false);
    }
    
    
//#line 151
public static Vec
                   adds3(
                   final double s,
                   final Vec a,
                   final Vec b) {
        
//#line 152
return new Vec(
          s *
            a.
              x +
            b.
              x,
          s *
            a.
              y +
            b.
              y,
          s *
            a.
              z +
            b.
              z,
          false);
    }
    
    
//#line 154
public Vec
                   adds2(
                   final double s,
                   final Vec b) {
        
//#line 155
return new Vec(
          x +
            s *
            b.
              x,
          y +
            s *
            b.
              y,
          z +
            s *
            b.
              z,
          false);
    }
    
    
//#line 157
public static Vec
                   sub(
                   final Vec a,
                   final Vec b) {
        
//#line 158
return new Vec(
          a.
            x -
            b.
              x,
          a.
            y -
            b.
              y,
          a.
            z -
            b.
              z,
          false);
    }
    
    
//#line 160
public static Vec
                   mult(
                   final Vec a,
                   final Vec b) {
        
//#line 161
return new Vec(
          a.
            x *
            b.
              x,
          a.
            y *
            b.
              y,
          a.
            z *
            b.
              z,
          false);
    }
    
    
//#line 163
public static Vec
                   cross(
                   final Vec a,
                   final Vec b) {
        
//#line 164
return new Vec(
          a.
            y *
            b.
              z -
            a.
              z *
            b.
              y,
          a.
            z *
            b.
              x -
            a.
              x *
            b.
              z,
          a.
            x *
            b.
              y -
            a.
              y *
            b.
              x,
          false);
    }
    
    
//#line 166
public static double
                   dot(
                   final Vec a,
                   final Vec b) {
        
//#line 167
return a.
                              x *
          b.
            x +
          a.
            y *
          b.
            y +
          a.
            z *
          b.
            z;
    }
    
    
//#line 169
public static Vec
                   comb(
                   final double a,
                   final Vec A,
                   final double b,
                   final Vec B) {
        
//#line 170
return new Vec(
          a *
            A.
              x +
            b *
            B.
              x,
          a *
            A.
              y +
            b *
            B.
              y,
          a *
            A.
              z +
            b *
            B.
              z,
          false);
    }
    
    
//#line 172
public Vec
                   scale(
                   final double t) {
        
//#line 173
return new Vec(
          x *
            t,
          y *
            t,
          z *
            t,
          false);
    }
    
    
//#line 175
public Vec
                   negate(
                   ) {
        
//#line 176
return new Vec(
          -x,
          -y,
          -z,
          false);
    }
    
    
//#line 178
public Vec
                   normalized(
                   ) {
        
//#line 179
double len =
          java.
            lang.
            Math.
            sqrt(
            x *
              x +
              y *
              y +
              z *
              z);
        
//#line 180
return ((len >
                                0.0))
          ? new Vec(
          x /
            len,
          y /
            len,
          z /
            len,
          false)
          : this;
    }
    
    
//#line 182
public double
                   length(
                   ) {
        
//#line 183
return java.
                              lang.
                              Math.
                              sqrt(
                              x *
                                x +
                                y *
                                y +
                                z *
                                z);
    }
    
    
//#line 185
public java.
                   lang.
                   String
                   toString(
                   ) {
        
//#line 186
return "<" +
        x +
        "," +
        y +
        "," +
        z +
        ">";
    }
}

class Scene
extends x10.
  lang.
  Object
{
    
//#line 191
final public static int
      maxObjects =
      64;
    
//#line 192
final public static int
      maxLights =
      5;
    
//#line 193
final public x10.
      lang.
      GenericReferenceArray
      lights;
    
//#line 194
final public x10.
      lang.
      GenericReferenceArray
      objects;
    
//#line 195
final private View
      view;
    
//#line 196
private int
      lightCount;
    
//#line 197
private int
      objectCount;
    
    
//#line 198
public Scene(final View v) {
        
//#line 198
super();
        
//#line 199
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
                maxLights -
                  1)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 200
lights =
          getLightArray(
            d1);
        
//#line 201
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
                maxObjects -
                  1)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 202
objects =
          getSphereArray(
            d2);
        
//#line 203
view =
          v;
        
//#line 204
lightCount =
          0;
        
//#line 205
objectCount =
          0;
    }
    
    
//#line 207
public x10.
                   lang.
                   GenericReferenceArray
                   getLightArray(
                   final x10.
                     lang.
                     dist d) {
        
//#line 208
return /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
    }
    
    
//#line 210
public x10.
                   lang.
                   GenericReferenceArray
                   getSphereArray(
                   final x10.
                     lang.
                     dist d) {
        
//#line 211
return /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
    }
    
    
//#line 213
public void
                   addLight(
                   final Light l) {
        
//#line 214
if (lightCount >
                           maxLights -
                           1) {
            
//#line 215
throw new java.
              lang.
              RuntimeException(
              "Only " +
              maxLights +
              " lights allowed");
        }
        
//#line 217
/* template:array_set { */(this.
                                                  lights).set(l,lightCount)/* } */;
        
//#line 218
lightCount =
          lightCount +
            1;
    }
    
    
//#line 220
public void
                   addObject(
                   final Sphere object) {
        
//#line 221
if (objectCount >
                           maxObjects -
                           1) {
            
//#line 222
throw new java.
              lang.
              RuntimeException(
              "Only " +
              maxObjects +
              " objects allowed");
        }
        
//#line 224
/* template:array_set { */(this.
                                                  objects).set(object,objectCount)/* } */;
        
//#line 225
objectCount =
          objectCount +
            1;
    }
    
    
//#line 227
public View
                   getView(
                   ) {
        
//#line 228
return this.
                              view;
    }
    
    
//#line 230
public Light
                   getLight(
                   final x10.
                     lang.
                     point number) {
        
//#line 231
return /* template:parametric { */((Light)(/* template:array_get { */((this.
                                                                                              lights).get(number))/* } */))/* } */;
    }
    
    
//#line 233
public Sphere
                   getObject(
                   final x10.
                     lang.
                     point number) {
        
//#line 234
return /* template:parametric { */((Sphere)(/* template:array_get { */((this.
                                                                                               objects).get(number))/* } */))/* } */;
    }
    
    
//#line 236
public int
                   getLights(
                   ) {
        
//#line 237
return this.
                              lightCount;
    }
    
    
//#line 239
public int
                   getObjects(
                   ) {
        
//#line 240
return this.
                              objectCount;
    }
}

class Timer
extends x10.
  lang.
  Object
{
    
//#line 245
final public static int
      max_counters =
      64;
    
//#line 246
private x10.
      lang.
      DoubleReferenceArray
      start_time;
    
//#line 247
private x10.
      lang.
      DoubleReferenceArray
      elapsed_time;
    
//#line 248
private x10.
      lang.
      DoubleReferenceArray
      total_time;
    
    
//#line 249
public Timer() {
        
//#line 249
super();
        
//#line 250
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
        
//#line 251
start_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 252
return 0;
           } }
           }/* } */,true,true,false)/* } */);
        
//#line 254
elapsed_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 255
return 0;
           } }
           }/* } */,true,true,false)/* } */);
        
//#line 257
total_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 258
return 0;
           } }
           }/* } */,true,true,false)/* } */);
    }
    
    
//#line 261
public void
                   start(
                   final int n) {
        
//#line 262
/* template:array_set { */(start_time).set(java.
                                                                  lang.
                                                                  System.
                                                                  currentTimeMillis(),n)/* } */;
    }
    
    
//#line 264
public void
                   stop(
                   final int n) {
        
//#line 265
/* template:array_set { */(elapsed_time).set(java.
                                                                    lang.
                                                                    System.
                                                                    currentTimeMillis() -
          /* template:array_get { */((start_time).get(n))/* } */,n)/* } */;
        
//#line 266
/* template:array_set { */(elapsed_time).set(/* template:array_get { */((elapsed_time).get(n))/* } */ /
          1000,n)/* } */;
        
//#line 267
/* template:array_set { */(total_time).set(/* template:array_get { */((total_time).get(n))/* } */ +
          /* template:array_get { */((elapsed_time).get(n))/* } */,n)/* } */;
    }
    
    
//#line 269
public double
                   readTimer(
                   final int n) {
        
//#line 270
return /* template:array_get { */((total_time).get(n))/* } */;
    }
    
    
//#line 272
public void
                   resetTimer(
                   final int n) {
        
//#line 273
/* template:array_set { */(total_time).set(0,n)/* } */;
        
//#line 274
/* template:array_set { */(start_time).set(0,n)/* } */;
        
//#line 275
/* template:array_set { */(elapsed_time).set(0,n)/* } */;
    }
    
    
//#line 277
public void
                   resetAllTimers(
                   ) {
        
//#line 278
int i =
          0;
        
//#line 279
while (i <
                              max_counters) {
            
//#line 280
resetTimer(
                           i);
            
//#line 281
i++;
        }
    }
}

class RayTracer
extends x10.
  lang.
  Object
{
    
//#line 287
private Scene
      scene;
    
//#line 288
private int
      lightCount;
    
//#line 289
private int
      objCount;
    
//#line 290
private x10.
      lang.
      GenericReferenceArray
      lights;
    
//#line 291
private x10.
      lang.
      GenericReferenceArray
      prim;
    
//#line 292
private View
      view;
    
//#line 293
final private static int
      alpha =
      255 <<
      24;
    
//#line 294
final private static Vec
      voidVec =
      new Vec(
      );
    
//#line 295
private int
      height;
    
//#line 296
private int
      width;
    
//#line 297
private x10.
      lang.
      IntReferenceArray
      datasizes;
    
//#line 298
private long
      checksum;
    
//#line 299
private x10.
      lang.
      LongReferenceArray
      checkSumArray;
    
//#line 300
private int
      size_t;
    
//#line 301
private int
      numobjects;
    
    
//#line 302
public RayTracer() {
        
//#line 302
super();
    }
    
    
//#line 304
public void
                   JGFsetsize(
                   final int size_t) {
        
//#line 305
checksum =
          0;
        
//#line 306
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
        
//#line 307
datasizes =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(d1,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 308
/* template:array_set { */(datasizes).set(20,0)/* } */;
        
//#line 309
/* template:array_set { */(datasizes).set(500,1)/* } */;
        
//#line 310
this.
                       size_t =
          size_t;
    }
    
    
//#line 312
public void
                   JGFinitialise(
                   ) {
        
//#line 313
width =
          /* template:array_get { */((datasizes).get(size_t))/* } */;
        
//#line 314
height =
          /* template:array_get { */((datasizes).get(size_t))/* } */;
        
//#line 315
scene =
          createScene();
        
//#line 316
setScene(
                       scene);
        
//#line 317
numobjects =
          /* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.getObjects();
    }
    
    
//#line 319
public void
                   JGFapplication(
                   ) {
        
//#line 320
Interval interval =
          new Interval(
          0,
          width,
          height,
          0,
          height,
          1);
        
//#line 321
render(
                       interval);
    }
    
    
//#line 323
public void
                   JGFvalidate(
                   ) {
        
//#line 324
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
        
//#line 325
x10.
          lang.
          LongReferenceArray refval =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.LongArray(d1,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 326
/* template:array_set { */(refval).set(51428,0)/* } */;
        
//#line 327
/* template:array_set { */(refval).set(29827635,1)/* } */;
        
//#line 328
long dev =
          checksum -
          /* template:array_get { */((refval).get(size_t))/* } */;
        
//#line 329
if (dev !=
                           0) {
            
//#line 330
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("Validation failed");
            
//#line 331
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("Pixel checksum = " +
                                                                                                                              checksum);
            
//#line 332
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("Reference value = " +
                                                                                                                              /* template:array_get { */((refval).get(size_t))/* } */);
            
//#line 333
throw new java.
              lang.
              RuntimeException(
              "Validation failed");
        }
    }
    
    
//#line 336
public void
                   JGFtidyup(
                   ) {
        
    }
    
    
//#line 338
public void
                   run(
                   ) {
        
//#line 339
JGFsetsize(
                       0);
        
//#line 340
JGFinitialise();
        
//#line 341
JGFapplication();
        
//#line 342
JGFvalidate();
        
//#line 343
JGFtidyup();
    }
    
    
//#line 345
private Scene
                   createScene(
                   ) {
        
//#line 346
final int x =
          0;
        
//#line 347
final int y =
          0;
        
//#line 348
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
        
//#line 349
final int nx =
          4;
        
//#line 350
final int ny =
          4;
        
//#line 351
final int nz =
          4;
        
//#line 352
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
        
//#line 353
/* template:forloop { */
        for (java.util.Iterator pp__ = (reg).iterator(); pp__.hasNext(); ) {
        	final  x10.
          lang.
          point pp = (x10.
          lang.
          point) pp__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 354
double xx =
              20.0 /
              ((nx -
                  1)) *
              /* template:array_get { */((pp).get(0))/* } */ -
              10.0;
            
//#line 355
double yy =
              20.0 /
              ((ny -
                  1)) *
              /* template:array_get { */((pp).get(1))/* } */ -
              10.0;
            
//#line 356
double zz =
              20.0 /
              ((nz -
                  1)) *
              /* template:array_get { */((pp).get(2))/* } */ -
              10.0;
            
//#line 357
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
            
//#line 358
/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.addObject(p);
        }/* } */
        }
        /* } */
        
        
//#line 360
/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.addLight(new Light(
                                                                                                               100,
                                                                                                               100,
                                                                                                               -50,
                                                                                                               1.0));
        
//#line 361
/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.addLight(new Light(
                                                                                                               -100,
                                                                                                               100,
                                                                                                               -50,
                                                                                                               1.0));
        
//#line 362
/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.addLight(new Light(
                                                                                                               100,
                                                                                                               -100,
                                                                                                               -50,
                                                                                                               1.0));
        
//#line 363
/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.addLight(new Light(
                                                                                                               -100,
                                                                                                               -100,
                                                                                                               -50,
                                                                                                               1.0));
        
//#line 364
/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.addLight(new Light(
                                                                                                               200,
                                                                                                               200,
                                                                                                               0,
                                                                                                               1.0));
        
//#line 365
return scene;
    }
    
    
//#line 367
public void
                   setScene(
                   final Scene scene) {
        
//#line 368
lightCount =
          /* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.getLights();
        
//#line 369
objCount =
          /* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.getObjects();
        
//#line 370
final Scene sc =
          scene;
        
//#line 371
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
        
//#line 372
final int mylightCount =
          lightCount;
        
//#line 373
final int myobjCount =
          objCount;
        
//#line 374
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 375
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
                
//#line 376
final x10.
                  lang.
                  place pHere =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 377
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
                
//#line 378
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
                
//#line 379
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
                         
//#line 380
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
                         
//#line 381
final x10.
                           lang.
                           GenericReferenceArray temp =
                           /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dTemp,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
                         
//#line 382
final x10.
                           lang.
                           point temp_l =
                           l;
                         
//#line 383
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
final Light tempLight =
                                   /* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(sc))/* } */.getLight(temp_l);
                                 
//#line 386
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                                 	(new x10.runtime.Activity() {
                                 		public void runX10Task() {
                                 			{
                                     
//#line 387
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
                         
                         
//#line 390
return /* template:parametric { */((Light)(/* template:array_get { */((temp).get(0))/* } */))/* } */;
                     } }
                     }/* } */,true,false,true)/* } */);
                
//#line 392
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 393
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                                   lang.
                                                                                   place.
                                                                                   FIRST_PLACE)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 394
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
                
                
//#line 396
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
                         
//#line 397
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
                         
//#line 398
final x10.
                           lang.
                           GenericReferenceArray temp1 =
                           /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dTemp1,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
                         
//#line 399
final x10.
                           lang.
                           point temp_o =
                           o;
                         
//#line 400
/* template:finish { */
                         {
                         	x10.lang.Runtime.getCurrentActivity().startFinish();
                         	try {
                         		{
                             
//#line 401
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                                            lang.
                                                                                            place.
                                                                                            FIRST_PLACE)).runAsync
                             	(new x10.runtime.Activity() {
                             		public void runX10Task() {
                             			{
                                 
//#line 402
final Sphere tempObject =
                                   /* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(sc))/* } */.getObject(temp_o);
                                 
//#line 403
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                                 	(new x10.runtime.Activity() {
                                 		public void runX10Task() {
                                 			{
                                     
//#line 404
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
                         
                         
//#line 407
return /* template:parametric { */((Sphere)(/* template:array_get { */((temp1).get(0))/* } */))/* } */;
                     } }
                     }/* } */,true,false,true)/* } */);
                
//#line 409
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 410
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                                   lang.
                                                                                   place.
                                                                                   FIRST_PLACE)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 411
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
        
        
//#line 414
view =
          /* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(scene))/* } */.getView();
    }
    
    
//#line 416
public void
                   render(
                   final Interval interval) {
        
//#line 417
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
        
//#line 418
final x10.
          lang.
          dist DBlock =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 418
public x10.
                             lang.
                             dist
                             checkCast(
                             final x10.
                               lang.
                               dist x10_generated_objToCast) {
                  
//#line 418
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
        
//#line 419
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
        
//#line 420
final x10.
          lang.
          IntReferenceArray row =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(DBlock,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 421
final x10.
          lang.
          region chkSumReg =
          U.
            region;
        
//#line 422
final x10.
          lang.
          place pHere =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 423
final x10.
          lang.
          place fp =
          x10.
            lang.
            place.
            FIRST_PLACE;
        
//#line 424
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
        
//#line 425
checkSumArray =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.LongArray(chkSumDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 426
final View myview =
          view;
        
//#line 427
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 428
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
                
//#line 429
final x10.
                  lang.
                  dist my_dist =
                  DBlock.
                    restriction(
                    /* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 430
long checksum1 =
                  0;
                
//#line 431
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
                
//#line 432
Vec viewVec =
                  Vec.
                    sub(
                    myview.
                      at,
                    myview.
                      from).
                    normalized();
                
//#line 433
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
                
//#line 434
Vec upVec =
                  Vec.
                    sub(
                    myview.
                      up,
                    tmpVec).
                    normalized().
                    scale(
                    -frustrumwidth);
                
//#line 435
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
                
//#line 436
Ray r =
                  new Ray(
                  myview.
                    from,
                  voidVec);
                
//#line 437
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
                    
//#line 438
int y =
                      /* template:array_get { */((pixCounter).get(0))/* } */ /
                      interval.
                        width;
                    
//#line 439
int x =
                      /* template:array_get { */((pixCounter).get(0))/* } */ %
                      interval.
                        width;
                    
//#line 440
double ylen =
                      (double)
                        ((2.0 *
                            y)) /
                      (double)
                        interval.
                          width -
                      1.0;
                    
//#line 441
double xlen =
                      (double)
                        ((2.0 *
                            x)) /
                      (double)
                        interval.
                          width -
                      1.0;
                    
//#line 442
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
                    
//#line 443
Vec col =
                      trace(
                        0,
                        1.0,
                        r,
                        new Isect(
                          ),
                        new Ray(
                          ));
                    
//#line 444
int red =
                      (int)
                        ((col.
                            x *
                            255.0));
                    
//#line 445
if (red >
                                       255) {
                        
//#line 446
red =
                          255;
                    }
                    
//#line 447
int green =
                      (int)
                        ((col.
                            y *
                            255.0));
                    
//#line 448
if (green >
                                       255) {
                        
//#line 449
green =
                          255;
                    }
                    
//#line 450
int blue =
                      (int)
                        ((col.
                            z *
                            255.0));
                    
//#line 451
if (blue >
                                       255) {
                        
//#line 452
blue =
                          255;
                    }
                    
//#line 453
checksum1 =
                      checksum1 +
                        red +
                        green +
                        blue;
                }/* } */
                }
                /* } */
                
                
//#line 455
final long checksumx =
                  checksum1;
                
//#line 456
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 457
/* template:Async { */(x10.lang.Runtime.asPlace(fp)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 458
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
        
        
//#line 461
final x10.
          lang.
          region regSum =
          checkSumArray.
            distribution.
            region;
        
//#line 462
/* template:forloop { */
        for (java.util.Iterator i__ = (chkSumReg).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 463
checksum =
              checksum +
                /* template:array_get { */((checkSumArray).get(i))/* } */;
        }/* } */
        }
        /* } */
        
    }
    
    
//#line 466
private boolean
                   intersect(
                   final Ray r,
                   final double maxt,
                   final Isect inter) {
        
//#line 467
int nhits =
          0;
        
//#line 468
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.t =
          1.0E9;
        
//#line 469
final x10.
          lang.
          place h =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 470
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
        
//#line 471
final x10.
          lang.
          GenericReferenceArray temp =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dTemp,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 472
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 473
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                           lang.
                                                                           place.
                                                                           FIRST_PLACE)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 474
final int tempobjCount =
                  objCount;
                
//#line 475
final x10.
                  lang.
                  GenericReferenceArray tempprim =
                  prim;
                
//#line 476
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 477
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
        
        
//#line 480
final int myobjCount =
          /* template:parametric { */((Envelope)(/* template:array_get { */((temp).get(0))/* } */))/* } */.
            i;
        
//#line 481
final x10.
          lang.
          GenericReferenceArray myprim =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:parametric { */((Envelope)(/* template:array_get { */((temp).get(0))/* } */))/* } */.
                a));
        
//#line 482
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
            
//#line 483
Isect tp =
              /* template:parametric { */((Sphere)(/* template:array_get { */((myprim).get(i))/* } */))/* } */.
                intersect(
                r);
            
//#line 484
if (!/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.isNull &&
                               /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.t <
                               /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.t) {
                
//#line 485
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.t =
                  /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.t;
                
//#line 486
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.prim =
                  /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.prim;
                
//#line 487
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.surf =
                  /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.surf;
                
//#line 488
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.enter =
                  /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.enter;
                
//#line 489
nhits++;
            }
        }/* } */
        }
        /* } */
        
        
//#line 492
return nhits >
          0
          ? true
          : false;
    }
    
    
//#line 494
private int
                   Shadow(
                   final Ray r,
                   final double tmax,
                   final Isect inter) {
        
//#line 495
if (intersect(
                           r,
                           tmax,
                           inter)) {
            
//#line 496
return 0;
        }
        
//#line 497
return 1;
    }
    
    
//#line 499
private Vec
                   SpecularDirection(
                   final Vec I,
                   final Vec N) {
        
//#line 500
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
    
    
//#line 502
private Vec
                   TransDir(
                   final Surface m1,
                   final Surface m2,
                   final Vec I,
                   final Vec N) {
        
//#line 503
double n1 =
          m1.
            isNull
          ? 1.0
          : m1.
              ior;
        
//#line 504
double n2 =
          m2.
            isNull
          ? 1.0
          : m2.
              ior;
        
//#line 505
double eta =
          n1 /
          n2;
        
//#line 506
double c1 =
          -Vec.
             dot(
             I,
             N);
        
//#line 507
double cs2 =
          1.0 -
          eta *
          eta *
          ((1.0 -
              c1 *
              c1));
        
//#line 508
if (cs2 <
                           0.0) {
            
//#line 509
return new Vec(
              0.0,
              0.0,
              0.0,
              true);
        }
        
//#line 510
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
    
    
//#line 512
private Vec
                   shade(
                   final int level,
                   final double weight,
                   final Vec P,
                   final Vec N,
                   final Vec I,
                   final Isect hit,
                   final Ray tRay) {
        
//#line 513
Surface surf =
          /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(hit))/* } */.surf;
        
//#line 514
Vec bigr =
          new Vec(
          );
        
//#line 515
if (surf.
                           shine >
                           1.0E-6) {
            
//#line 516
bigr =
              SpecularDirection(
                I,
                N);
        }
        
//#line 518
final x10.
          lang.
          place h =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 519
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
        
//#line 520
final x10.
          lang.
          GenericReferenceArray temp =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dTemp,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 521
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 522
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                           lang.
                                                                           place.
                                                                           FIRST_PLACE)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 523
final int templightCount =
                  lightCount;
                
//#line 524
final x10.
                  lang.
                  GenericReferenceArray templights =
                  lights;
                
//#line 525
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 526
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
        
        
//#line 529
final int mylightCount =
          /* template:parametric { */((Envelope2)(/* template:array_get { */((temp).get(0))/* } */))/* } */.
            i;
        
//#line 530
final x10.
          lang.
          GenericReferenceArray mylights =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:parametric { */((Envelope2)(/* template:array_get { */((temp).get(0))/* } */))/* } */.
                a));
        
//#line 531
Vec col =
          new Vec(
          );
        
//#line 532
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
            
//#line 533
Vec L =
              Vec.
                sub(
                /* template:parametric { */((Light)(/* template:array_get { */((mylights).get(l))/* } */))/* } */.
                  pos,
                P);
            
//#line 534
if (Vec.
                               dot(
                               N,
                               L) >=
                               0.0) {
                
//#line 535
L =
                  L.
                    normalized();
                
//#line 536
double t =
                  L.
                    length();
                
//#line 537
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.p =
                  P;
                
//#line 538
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.d =
                  L;
                
//#line 539
if (Shadow(
                                   tRay,
                                   t,
                                   hit) >
                                   0) {
                    
//#line 540
double diff =
                      Vec.
                        dot(
                        N,
                        L) *
                      surf.
                        kd *
                      /* template:parametric { */((Light)(/* template:array_get { */((mylights).get(l))/* } */))/* } */.
                        brightness;
                    
//#line 541
col =
                      col.
                        adds2(
                        diff,
                        surf.
                          color);
                    
//#line 542
if (surf.
                                       shine >
                                       1.0E-6) {
                        
//#line 543
double spec =
                          Vec.
                            dot(
                            bigr,
                            L);
                        
//#line 544
if (spec >
                                           1.0E-6) {
                            
//#line 545
spec =
                              java.
                                lang.
                                Math.
                                pow(
                                spec,
                                surf.
                                  shine);
                            
//#line 546
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
        
        
//#line 552
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.p =
          P;
        
//#line 553
if (surf.
                           ks *
                           weight >
                           0.0010) {
            
//#line 554
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.d =
              SpecularDirection(
                I,
                N);
            
//#line 555
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
            
//#line 556
col =
              col.
                adds2(
                surf.
                  ks,
                tcol);
        }
        
//#line 558
if (surf.
                           kt *
                           weight >
                           0.0010) {
            
//#line 559
if (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(hit))/* } */.enter >
                               0) {
                
//#line 560
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
                
//#line 562
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
            
//#line 564
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
            
//#line 565
col =
              col.
                adds2(
                surf.
                  kt,
                tcol);
        }
        
//#line 567
return col;
    }
    
    
//#line 569
private Vec
                   trace(
                   final int level,
                   final double weight,
                   final Ray r,
                   final Isect inter,
                   final Ray tRay) {
        
//#line 570
if (level >
                           6) {
            
//#line 571
return new Vec(
              );
        }
        
//#line 573
boolean hit =
          intersect(
            r,
            1000000.0,
            inter);
        
//#line 574
if (hit) {
            
//#line 575
Vec P =
              /* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(r))/* } */.rayPoint(/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.t);
            
//#line 576
Vec N =
              /* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.prim.
                normal(
                P);
            
//#line 577
if (Vec.
                               dot(
                               /* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(r))/* } */.d,
                               N) >=
                               0.0) {
                
//#line 578
N =
                  N.
                    negate();
            }
            
//#line 580
return shade(
                                  level,
                                  weight,
                                  P,
                                  N,
                                  /* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(r))/* } */.d,
                                  inter,
                                  tRay);
        }
        
//#line 582
return voidVec;
    }
}

class Surface
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 587
final public Vec
      color;
    
//#line 588
final public double
      kd;
    
//#line 589
final public double
      ks;
    
//#line 590
final public double
      shine;
    
//#line 591
final public double
      kt;
    
//#line 592
final public double
      ior;
    
//#line 593
final public boolean
      isNull;
    
    
//#line 594
public Surface() {
        
//#line 594
super();
        
//#line 595
color =
          new Vec(
            1,
            0,
            0,
            false);
        
//#line 596
kd =
          1.0;
        
//#line 597
ks =
          0.0;
        
//#line 598
shine =
          0.0;
        
//#line 599
kt =
          0.0;
        
//#line 600
ior =
          1.0;
        
//#line 601
isNull =
          false;
    }
    
    
//#line 603
public Surface(final double shine_,
                                final double ks_,
                                final double kt_,
                                final Vec c_,
                                final boolean isNull_) {
        
//#line 603
super();
        
//#line 604
kd =
          1.0;
        
//#line 605
ks =
          ks_;
        
//#line 606
shine =
          shine_;
        
//#line 607
kt =
          kt_;
        
//#line 608
ior =
          1.0;
        
//#line 609
color =
          c_;
        
//#line 610
isNull =
          isNull_;
    }
    
    
//#line 612
public java.
                   lang.
                   String
                   toString(
                   ) {
        
//#line 613
return "Surface { color = " +
        color +
        " }";
    }
}

class Interval
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 618
final public int
      number;
    
//#line 619
final public int
      width;
    
//#line 620
final public int
      height;
    
//#line 621
final public int
      yfrom;
    
//#line 622
final public int
      yto;
    
//#line 623
final public int
      total;
    
    
//#line 624
public Interval(final int number_,
                                 final int width_,
                                 final int height_,
                                 final int yfrom_,
                                 final int yto_,
                                 final int total_) {
        
//#line 624
super();
        
//#line 625
number =
          number_;
        
//#line 626
width =
          width_;
        
//#line 627
height =
          height_;
        
//#line 628
yfrom =
          yfrom_;
        
//#line 629
yto =
          yto_;
        
//#line 630
total =
          total_;
    }
    
    
//#line 632
public java.
                   lang.
                   String
                   toString(
                   ) {
        
//#line 633
return number +
        " " +
        width +
        " " +
        height +
        " " +
        yfrom +
        " " +
        yto +
        " " +
        total;
    }
}

class Isect
extends x10.
  lang.
  Object
{
    
//#line 638
public double
      t;
    
//#line 639
public int
      enter;
    
//#line 640
public Sphere
      prim;
    
//#line 641
public Surface
      surf;
    
//#line 642
public boolean
      isNull;
    
    
//#line 643
public Isect() {
        
//#line 643
super();
        
//#line 644
t =
          0.0;
        
//#line 645
enter =
          0;
        
//#line 646
isNull =
          false;
    }
    
    
//#line 648
public Isect(final double t_,
                              final int enter_,
                              final boolean isNull_,
                              final Sphere prim_,
                              final Surface surf_) {
        
//#line 648
super();
        
//#line 649
t =
          t_;
        
//#line 650
isNull =
          isNull_;
        
//#line 651
enter =
          enter_;
        
//#line 652
prim =
          prim_;
        
//#line 653
surf =
          surf_;
    }
}

class View
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 658
final public Vec
      from;
    
//#line 659
final public Vec
      at;
    
//#line 660
final public Vec
      up;
    
//#line 661
final public double
      distance;
    
//#line 662
final public double
      angle;
    
//#line 663
final public double
      aspect;
    
    
//#line 664
public View(final Vec from_,
                             final Vec at_,
                             final Vec up_,
                             final double dist_,
                             final double angle_,
                             final double aspect_) {
        
//#line 664
super();
        
//#line 665
from =
          from_;
        
//#line 666
at =
          at_;
        
//#line 667
up =
          up_;
        
//#line 668
distance =
          dist_;
        
//#line 669
angle =
          angle_;
        
//#line 670
aspect =
          aspect_;
    }
    
    
//#line 672
public java.
                   lang.
                   String
                   toString(
                   ) {
        
//#line 673
return "View { from = " +
        from +
        " at = " +
        at +
        " up = " +
        up +
        " distance = " +
        distance +
        " angle = " +
        angle +
        " aspect = " +
        aspect +
        "}";
    }
}
