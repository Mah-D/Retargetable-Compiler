package raytracer;

import x10.lang.*;

public class View extends x10.lang.Object implements x10.lang.ValueType {
    
//#line 27
final public raytracer.Vec from;
    
//#line 28
final public raytracer.Vec at;
    
//#line 29
final public raytracer.Vec up;
    
//#line 30
final public double dist;
    
//#line 31
final public double angle;
    
//#line 32
final public double aspect;
    
    
//#line 34
public View(raytracer.Vec from_, raytracer.Vec at_,
                            raytracer.Vec up_, double dist_, double angle_,
                            double aspect_) {
        
//#line 35
super();
        
//#line 36
from = from_;
        
//#line 37
at = at_;
        
//#line 38
up = up_;
        
//#line 39
dist = dist_;
        
//#line 40
angle = angle_;
        
//#line 41
aspect = aspect_;
    }
}
