package raytracer;

import x10.lang.*;

public class Light extends x10.lang.Object implements x10.lang.ValueType {
    
//#line 27
final public /*nullable<*/raytracer.Vec/*>*/ pos;
    
//#line 28
final public double brightness;
    
    
//#line 30
public Light() {
        
//#line 30
super();
        
//#line 31
pos = null;
        
//#line 32
brightness = 0.0;
    }
    
    
//#line 35
public Light(double x, double y, double z, double b) {
        
//#line 35
super();
        
//#line 36
pos = new raytracer.Vec(x, y, z);
        
//#line 37
brightness = b;
    }
}
