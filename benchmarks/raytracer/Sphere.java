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
public Sphere(final Vec center,
                              final double radius,
                              final Surface s) {
        
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
          radius *
            radius;
    }
    
    
//#line 39
public Sphere(final Vec center,
                              final double radius) {
        
//#line 39
super();
        
//#line 41
c =
          center;
        
//#line 42
r =
          radius;
        
//#line 43
r2 =
          radius *
            radius;
        
//#line 44
surf =
          new Surface(
            );
    }
    
    
//#line 47
public Isect
                  intersect(
                  final Ray ry) {
        
//#line 49
Vec v =
          Vec.
            sub(
            c,
            /* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(ry))/* } */.p);
        
//#line 50
double b =
          Vec.
            dot(
            v,
            /* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(ry))/* } */.d);
        
//#line 51
double disc =
          b *
          b -
          Vec.
            dot(
            v,
            v) +
          r2;
        
//#line 52
if (disc <
                          0.0) {
            
//#line 54
return new Isect(
              0.0,
              0,
              true,
              this,
              surf);
        }
        
//#line 56
disc =
          java.
            lang.
            Math.
            sqrt(
            disc);
        
//#line 57
double t =
          ((b -
              disc <
              1.0E-6))
          ? b +
          disc
          : b -
          disc;
        
//#line 58
if (t <
                          1.0E-6) {
            
//#line 60
return new Isect(
              0.0,
              0,
              true,
              this,
              surf);
        }
        
//#line 62
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
        
//#line 63
return ip;
    }
    
    
//#line 66
public Vec
                  normal(
                  final Vec p) {
        
//#line 67
return Vec.
                             sub(
                             p,
                             c).
                             normalized();
    }
    
    
//#line 70
public java.
                  lang.
                  String
                  toString(
                  ) {
        
//#line 71
return "Sphere {" +
        c.
          toString() +
        "," +
        r +
        "}";
    }
    
    
//#line 74
public Vec
                  getCenter(
                  ) {
        
//#line 75
return c;
    }
}
