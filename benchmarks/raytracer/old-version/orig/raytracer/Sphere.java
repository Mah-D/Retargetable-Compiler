package raytracer;

import x10.lang.*;

public class Sphere
extends raytracer.
  Primitive
  implements x10.
               lang.
               ValueType
{
    
//#line 29
final raytracer.
      Vec
      c;
    
//#line 30
final double
      r;
    
//#line 30
final double
      r2;
    
    
//#line 32
public Sphere(raytracer.
                                Vec center,
                              double radius,
                              raytracer.
                                Surface s) {
        
//#line 33
super(s);
        
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
public Sphere(raytracer.
                                Vec center,
                              double radius) {
        
//#line 39
this(center,
                         radius,
                         new raytracer.
                           Surface(
                           ));
    }
    
    
//#line 42
public /*nullable<*/raytracer.
                  Isect/*>*/
                  intersect(
                  raytracer.
                    Ray ry) {
        
//#line 43
raytracer.
          Vec v =
          raytracer.
            Vec.
            sub(
            c,
            /* template:place-check { */((raytracer.Ray) x10.lang.Runtime.hereCheck(ry))/* } */.p);
        
//#line 44
double b =
          raytracer.
            Vec.
            dot(
            v,
            /* template:place-check { */((raytracer.Ray) x10.lang.Runtime.hereCheck(ry))/* } */.d);
        
//#line 45
double disc =
          b *
          b -
          raytracer.
            Vec.
            dot(
            v,
            v) +
          r2;
        
//#line 46
if (disc <
                          0.0) {
            
//#line 47
return null;
        }
        
//#line 49
disc =
          java.
            lang.
            Math.
            sqrt(
            disc);
        
//#line 50
double t =
          ((b -
              disc <
              1.0E-6))
          ? b +
          disc
          : b -
          disc;
        
//#line 51
if (t <
                          1.0E-6) {
            
//#line 52
return null;
        }
        
//#line 54
raytracer.
          Isect ip =
          new raytracer.
          Isect(
          t,
          raytracer.
            Vec.
            dot(
            v,
            v) >
            r2 +
            1.0E-6
            ? 1
            : 0,
          this,
          surf);
        
//#line 55
return ip;
    }
    
    
//#line 58
public raytracer.
                  Vec
                  normal(
                  raytracer.
                    Vec p) {
        
//#line 59
return raytracer.
                             Vec.
                             sub(
                             p,
                             c).
                             normalized();
    }
    
    
//#line 62
public java.
                  lang.
                  String
                  toString(
                  ) {
        
//#line 63
return "Sphere {" +
        c.
          toString() +
        "," +
        r +
        "}";
    }
    
    
//#line 66
public raytracer.
                  Vec
                  getCenter(
                  ) {
        
//#line 67
return c;
    }
}
