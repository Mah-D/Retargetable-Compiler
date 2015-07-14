import x10.lang.*;

public class Ray extends x10.lang.Object {
    
//#line 24
public Vec p;
    
//#line 25
public Vec d;
    
    
//#line 27
public Ray(final Vec pnt, final Vec dir) {
        
//#line 27
super();
        
//#line 29
p = new Vec(pnt.x, pnt.y, pnt.z, false);
        
//#line 30
d = new Vec(dir.x, dir.y, dir.z, false).normalized();
    }
    
    
//#line 33
public Ray(final Vec pnt, final Vec dir,
                           final boolean normalize) {
        
//#line 33
super();
        
//#line 34
if (normalize) {
            
//#line 35
p = new Vec(pnt.x, pnt.y, pnt.z, false);
            
//#line 36
d = new Vec(dir.x, dir.y, dir.z, false).normalized();
        } else {
            
//#line 38
p = pnt;
            
//#line 39
d = dir;
        }
    }
    
    
//#line 43
public Ray() {
        
//#line 43
super();
        
//#line 44
p = new Vec();
        
//#line 45
d = new Vec();
    }
    
    
//#line 48
public Ray d(final Vec d_) {
        
//#line 49
return new Ray(p, d_, false);
    }
    
    
//#line 52
public Vec rayPoint(final double t) {
        
//#line 54
return new Vec(p.x + d.x * t, p.y + d.y * t, p.z + d.z * t,
                                   false);
    }
    
    
//#line 57
public java.lang.String toString() {
        
//#line 58
return " { " + p.toString() + "->" + d.toString() + " } ";
    }
}
