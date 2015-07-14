import x10.lang.*;

public class Sphere
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 27
final private Vec
      c;
    
//#line 28
final private double
      r;
    
//#line 29
final private double
      r2;
    
//#line 30
final public Surface
      surf;
    
    
//#line 32
public Sphere(Vec center,
                              double radius,
                              Surface s) {
        
//#line 32
super();
        
//#line 33
surf =
          s;
        
//#line 34
c =
          center;
        
//#line 35
r =
          radius;
        
//#line 36
r2 =
          r *
            r;
    }
    
    
//#line 38
public Sphere(Vec center,
                              double radius) {
        
//#line 39
this(center,
                         radius,
                         new Surface(
                           ));
    }
    
    
//#line 42
public Isect
                  intersect(
                  Ray ry) {
        
//#line 43
Vec v =
          Vec.
            sub(
            c,
            /* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(ry))/* } */.p);
        
//#line 44
double b =
          Vec.
            dot(
            v,
            /* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(ry))/* } */.d);
        
//#line 45
double disc =
          b *
          b -
          Vec.
            dot(
            v,
            v) +
          r2;
        
//#line 46
if (disc <
                          0.0) {
            
//#line 48
return new Isect(
              0.0,
              0,
              true,
              this,
              surf);
        }
        
//#line 50
disc =
          java.
            lang.
            Math.
            sqrt(
            disc);
        
//#line 51
double t =
          ((b -
              disc <
              1.0E-6))
          ? b +
          disc
          : b -
          disc;
        
//#line 52
if (t <
                          1.0E-6) {
            
//#line 54
return new Isect(
              0.0,
              0,
              true,
              this,
              surf);
        }
        
//#line 56
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
        
//#line 57
return ip;
    }
    
    
//#line 60
public Vec
                  normal(
                  Vec p) {
        
//#line 61
return Vec.
                             sub(
                             p,
                             c).
                             normalized();
    }
    
    
//#line 64
public java.
                  lang.
                  String
                  toString(
                  ) {
        
//#line 65
return "Sphere {" +
        c.
          toString() +
        "," +
        r +
        "}";
    }
    
    
//#line 68
public Vec
                  getCenter(
                  ) {
        
//#line 69
return c;
    }
}
