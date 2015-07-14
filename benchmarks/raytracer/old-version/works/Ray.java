import x10.lang.*;

public class Ray extends x10.lang.Object {
    
//#line 24
public Vec p;
    
//#line 25
public Vec d;
    
    
//#line 27
public Ray(Vec pnt, Vec dir) {
        
//#line 28
this(pnt, dir, true);
    }
    
    
//#line 31
public Ray(Vec pnt, Vec dir, boolean normalize) {
        
//#line 31
super();
        
//#line 32
if (normalize) {
            
//#line 33
p = new Vec(pnt.x, pnt.y, pnt.z, false);
            
//#line 34
d = new Vec(dir.x, dir.y, dir.z, false).normalized();
        } else {
            
//#line 36
p = pnt;
            
//#line 37
d = dir;
        }
    }
    
    
//#line 41
public Ray() {
        
//#line 41
super();
        
//#line 42
p = new Vec();
        
//#line 43
d = new Vec();
    }
    
    
//#line 46
public Ray d(Vec d_) {
        
//#line 47
return new Ray(p, d_, false);
    }
    
    
//#line 50
public Vec rayPoint(double t) {
        
//#line 52
return new Vec(p.x + d.x * t, p.y + d.y * t, p.z + d.z * t,
                                   false);
    }
    
    
//#line 55
public java.lang.String toString() {
        
//#line 56
return " { " + p.toString() + "->" + d.toString() + " } ";
    }
}
