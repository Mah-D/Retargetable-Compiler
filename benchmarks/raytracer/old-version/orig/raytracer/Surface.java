package raytracer;

import x10.lang.*;

public class Surface extends x10.lang.Object implements x10.lang.ValueType {
    
//#line 27
final public raytracer.Vec color;
    
//#line 28
final public double kd;
    
//#line 29
final public double ks;
    
//#line 30
final public double shine;
    
//#line 31
final public double kt;
    
//#line 32
final public double ior;
    
    
//#line 34
public Surface() {
        
//#line 34
super();
        
//#line 35
color = new raytracer.Vec(1, 0, 0);
        
//#line 36
kd = 1.0;
        
//#line 37
ks = 0.0;
        
//#line 38
shine = 0.0;
        
//#line 39
kt = 0.0;
        
//#line 40
ior = 1.0;
    }
    
    
//#line 43
public Surface(double shine_, double ks_, double kt_,
                               raytracer.Vec c_) {
        
//#line 43
super();
        
//#line 44
kd = 1.0;
        
//#line 45
ks = ks_;
        
//#line 46
shine = shine_;
        
//#line 47
kt = kt_;
        
//#line 48
ior = 1.0;
        
//#line 49
color = c_;
    }
    
    
//#line 52
public java.lang.String toString() {
        
//#line 53
return "Surface { color = " + color + " }";
    }
}
