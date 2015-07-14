package raytracer;

import x10.lang.*;

public class Vec extends x10.lang.Object implements x10.lang.ValueType {
    
//#line 33
final public double x;
    
//#line 38
final public double y;
    
//#line 43
final public double z;
    
    
//#line 51
public Vec(double a, double b, double c) {
        
//#line 51
super();
        
//#line 52
x = a;
        
//#line 53
y = b;
        
//#line 54
z = c;
    }
    
    
//#line 60
public Vec(raytracer.Vec a) {
        
//#line 60
super();
        
//#line 61
x = a.x;
        
//#line 62
y = a.y;
        
//#line 63
z = a.z;
    }
    
    
//#line 69
public Vec() {
        
//#line 69
super();
        
//#line 70
x = 0.0;
        
//#line 71
y = 0.0;
        
//#line 72
z = 0.0;
    }
    
    
//#line 79
final public raytracer.Vec added(raytracer.Vec a) {
        
//#line 80
return new raytracer.Vec(x + a.x, y + a.y, z + a.z);
    }
    
    
//#line 87
public static raytracer.Vec adds(double s, raytracer.Vec a,
                                                 raytracer.Vec b) {
        
//#line 88
return new raytracer.Vec(s * a.x + b.x, s * a.y + b.y, s *
                                               a.z + b.z);
    }
    
    
//#line 97
final public raytracer.Vec adds(double s, raytracer.Vec b) {
        
//#line 98
return new raytracer.Vec(x + s * b.x, y + s * b.y, z + s *
                                               b.z);
    }
    
    
//#line 104
public static raytracer.Vec sub(
                   /*nullable<*/raytracer.Vec/*>*/ a,
                   /*nullable<*/raytracer.Vec/*>*/ b) {
        
//#line 105
return new raytracer.Vec(a.x - b.x, a.y - b.y, a.z - b.z);
    }
    
    
//#line 108
public static raytracer.Vec mult(raytracer.Vec a,
                                                  raytracer.Vec b) {
        
//#line 109
return new raytracer.Vec(a.x * b.x, a.y * b.y, a.z * b.z);
    }
    
    
//#line 112
public static raytracer.Vec cross(raytracer.Vec a,
                                                   raytracer.Vec b) {
        
//#line 113
return new raytracer.Vec(a.y * b.z - a.z * b.y, a.z * b.x -
                                                a.x * b.z, a.x * b.y - a.y *
                                                b.x);
    }
    
    
//#line 119
public static double dot(raytracer.Vec a, raytracer.Vec b) {
        
//#line 120
return a.x * b.x + a.y * b.y + a.z * b.z;
    }
    
    
//#line 123
public static raytracer.Vec comb(double a, raytracer.Vec A,
                                                  double b, raytracer.Vec B) {
        
//#line 124
return new raytracer.Vec(a * A.x + b * B.x, a * A.y + b *
                                                B.y, a * A.z + b * B.z);
    }
    
    
//#line 130
final public raytracer.Vec scale(double t) {
        
//#line 131
return new raytracer.Vec(x * t, y * t, z * t);
    }
    
    
//#line 134
final public raytracer.Vec negate() {
        
//#line 135
return new raytracer.Vec(-x, -y, -z);
    }
    
    
//#line 138
public raytracer.Vec normalized() {
        
//#line 139
double len;
        
//#line 140
len = java.lang.Math.sqrt(x * x + y * y + z * z);
        
//#line 141
return ((len > 0.0))
          ? new raytracer.Vec(x / len, y / len, z / len)
          : this;
    }
    
    
//#line 144
public double length() {
        
//#line 145
return java.lang.Math.sqrt(x * x + y * y + z * z);
    }
    
    
//#line 148
final public java.lang.String toString() {
        
//#line 149
return "<" + x + "," + y + "," + z + ">";
    }
}
