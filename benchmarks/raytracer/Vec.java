import x10.lang.*;

public class Vec extends x10.lang.Object implements x10.lang.ValueType {
    
//#line 31
final public double x;
    
//#line 36
final public double y;
    
//#line 41
final public double z;
    
//#line 43
final public boolean isNull;
    
    
//#line 51
public Vec(final double a, final double b, final double c,
                           final boolean isNull_) {
        
//#line 51
super();
        
//#line 52
x = a;
        
//#line 53
y = b;
        
//#line 54
z = c;
        
//#line 55
isNull = isNull_;
    }
    
    
//#line 61
public Vec(final Vec a, final boolean isNull_) {
        
//#line 61
super();
        
//#line 62
x = a.x;
        
//#line 63
y = a.y;
        
//#line 64
z = a.z;
        
//#line 65
isNull = isNull_;
    }
    
    
//#line 71
public Vec() {
        
//#line 71
super();
        
//#line 72
x = 0.0;
        
//#line 73
y = 0.0;
        
//#line 74
z = 0.0;
        
//#line 75
isNull = false;
    }
    
    
//#line 82
public Vec added(final Vec a) {
        
//#line 83
return new Vec(x + a.x, y + a.y, z + a.z, false);
    }
    
    
//#line 90
public static Vec adds3(final double s, final Vec a,
                                        final Vec b) {
        
//#line 91
return new Vec(s * a.x + b.x, s * a.y + b.y, s * a.z + b.z,
                                   false);
    }
    
    
//#line 100
public Vec adds2(final double s, final Vec b) {
        
//#line 101
return new Vec(x + s * b.x, y + s * b.y, z + s * b.z,
                                    false);
    }
    
    
//#line 107
public static Vec sub(final Vec a, final Vec b) {
        
//#line 108
return new Vec(a.x - b.x, a.y - b.y, a.z - b.z, false);
    }
    
    
//#line 111
public static Vec mult(final Vec a, final Vec b) {
        
//#line 112
return new Vec(a.x * b.x, a.y * b.y, a.z * b.z, false);
    }
    
    
//#line 115
public static Vec cross(final Vec a, final Vec b) {
        
//#line 116
return new Vec(a.y * b.z - a.z * b.y, a.z * b.x - a.x *
                                      b.z, a.x * b.y - a.y * b.x, false);
    }
    
    
//#line 122
public static double dot(final Vec a, final Vec b) {
        
//#line 123
return a.x * b.x + a.y * b.y + a.z * b.z;
    }
    
    
//#line 126
public static Vec comb(final double a, final Vec A,
                                        final double b, final Vec B) {
        
//#line 127
return new Vec(a * A.x + b * B.x, a * A.y + b * B.y, a *
                                      A.z + b * B.z, false);
    }
    
    
//#line 133
public Vec scale(final double t) {
        
//#line 134
return new Vec(x * t, y * t, z * t, false);
    }
    
    
//#line 137
public Vec negate() {
        
//#line 138
return new Vec(-x, -y, -z, false);
    }
    
    
//#line 141
public Vec normalized() {
        
//#line 142
double len = java.lang.Math.sqrt(x * x + y * y + z * z);
        
//#line 143
return ((len > 0.0))
          ? new Vec(x / len, y / len, z / len, false)
          : this;
    }
    
    
//#line 146
public double length() {
        
//#line 147
return java.lang.Math.sqrt(x * x + y * y + z * z);
    }
    
    
//#line 150
public java.lang.String toString() {
        
//#line 151
return "<" + x + "," + y + "," + z + ">";
    }
}
