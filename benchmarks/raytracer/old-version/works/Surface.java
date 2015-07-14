import x10.lang.*;

public class Surface extends x10.lang.Object implements x10.lang.ValueType {
    
//#line 25
final public Vec color;
    
//#line 26
final public double kd;
    
//#line 27
final public double ks;
    
//#line 28
final public double shine;
    
//#line 29
final public double kt;
    
//#line 30
final public double ior;
    
//#line 31
final public boolean isNull;
    
    
//#line 33
public Surface() {
        
//#line 33
super();
        
//#line 34
color = new Vec(1, 0, 0, false);
        
//#line 35
kd = 1.0;
        
//#line 36
ks = 0.0;
        
//#line 37
shine = 0.0;
        
//#line 38
kt = 0.0;
        
//#line 39
ior = 1.0;
        
//#line 40
isNull = false;
    }
    
    
//#line 43
public Surface(double shine_, double ks_, double kt_, Vec c_,
                               boolean isNull_) {
        
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
        
//#line 50
isNull = isNull_;
    }
    
    
//#line 53
public java.lang.String toString() {
        
//#line 54
return "Surface { color = " + color + " }";
    }
}
