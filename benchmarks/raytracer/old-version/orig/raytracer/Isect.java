package raytracer;

import x10.lang.*;

public class Isect extends x10.lang.Object {
    
//#line 26
public double t;
    
//#line 27
public int enter;
    
//#line 28
public /*nullable<*/raytracer.Primitive/*>*/ prim;
    
//#line 29
public /*nullable<*/raytracer.Surface/*>*/ surf;
    
    
//#line 30
public Isect() {
        
//#line 30
super();
        
//#line 31
t = 0.0;
        
//#line 32
enter = 0;
        
//#line 33
prim = null;
        
//#line 34
surf = null;
    }
    
    
//#line 36
public Isect(double t_, int enter_,
                             /*nullable<*/raytracer.Primitive/*>*/ prim_,
                             /*nullable<*/raytracer.Surface/*>*/ surf_) {
        
//#line 36
super();
        
//#line 37
t = t_;
        
//#line 38
enter = enter_;
        
//#line 39
prim = prim_;
        
//#line 40
surf = surf_;
    }
}
