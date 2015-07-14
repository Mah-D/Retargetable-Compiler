import x10.lang.*;

public class Light extends x10.lang.Object implements x10.lang.ValueType {
    
//#line 25
final public Vec pos;
    
//#line 26
final public double brightness;
    
    
//#line 32
public Light(final double x, final double y, final double z,
                             final double b) {
        
//#line 32
super();
        
//#line 33
pos = new Vec(x, y, z, false);
        
//#line 34
brightness = b;
    }
    
    
//#line 37
public java.lang.String toString() {
        
//#line 39
return pos + " " + brightness;
    }
}
