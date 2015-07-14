package raytracer;

import x10.lang.*;

final public class Ray extends x10.lang.Object {
    
//#line 26
public raytracer.Vec p;
    
//#line 26
public raytracer.Vec d;
    
    
//#line 28
public Ray(raytracer.Vec pnt, raytracer.Vec dir) {
        
//#line 29
this(pnt, dir, true);
    }
    
    
//#line 32
public Ray(raytracer.Vec pnt, raytracer.Vec dir,
                           boolean normalize) {
        
//#line 32
super();
        
//#line 33
if (normalize) {
            
//#line 34
p = new raytracer.Vec(pnt.x, pnt.y, pnt.z);
            
//#line 35
d = new raytracer.Vec(dir.x, dir.y, dir.z).normalized();
        } else {
            
//#line 37
p = pnt;
            
//#line 38
d = dir;
        }
    }
    
    
//#line 42
public Ray() {
        
//#line 42
super();
        
//#line 43
p = new raytracer.Vec();
        
//#line 44
d = new raytracer.Vec();
    }
    
    
//#line 47
public raytracer.Ray d(raytracer.Vec d_) {
        
//#line 48
return new raytracer.Ray(p, d_, false);
    }
    
    
//#line 51
public raytracer.Vec point(double t) {
        
//#line 52
return new raytracer.Vec(p.x + d.x * t, p.y + d.y * t, p.z +
                                               d.z * t);
    }
    
    
//#line 55
public java.lang.String toString() {
        
//#line 56
return " { " + p.toString() + "->" + d.toString() + " } ";
    }
}
