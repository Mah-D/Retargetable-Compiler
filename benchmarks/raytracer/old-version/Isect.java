import x10.lang.*;

public class Isect extends x10.lang.Object {
    
//#line 24
public double t;
    
//#line 25
public int enter;
    
//#line 26
public Sphere prim;
    
//#line 27
public Surface surf;
    
//#line 28
public boolean isNull;
    
    
//#line 29
public Isect() {
        
//#line 29
super();
        
//#line 30
t = 0.0;
        
//#line 31
enter = 0;
        
//#line 32
isNull = false;
    }
    
    
//#line 34
public Isect(double t_, int enter_, boolean isNull_,
                             Sphere prim_, Surface surf_) {
        
//#line 34
super();
        
//#line 35
t = t_;
        
//#line 36
isNull = isNull_;
        
//#line 37
enter = enter_;
        
//#line 38
prim = prim_;
        
//#line 39
surf = surf_;
    }
}
