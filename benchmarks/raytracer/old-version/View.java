import x10.lang.*;

public class View extends x10.lang.Object implements x10.lang.ValueType {
    
//#line 25
final public Vec from;
    
//#line 26
final public Vec at;
    
//#line 27
final public Vec up;
    
//#line 28
final public double distance;
    
//#line 29
final public double angle;
    
//#line 30
final public double aspect;
    
    
//#line 32
public View(Vec from_, Vec at_, Vec up_, double dist_,
                            double angle_, double aspect_) {
        
//#line 33
super();
        
//#line 34
from = from_;
        
//#line 35
at = at_;
        
//#line 36
up = up_;
        
//#line 37
distance = dist_;
        
//#line 38
angle = angle_;
        
//#line 39
aspect = aspect_;
    }
    
    
//#line 42
public java.lang.String toString() {
        
//#line 43
return "View { from = " + from + " at = " + at + " up = " +
        up + " distance = " + distance + " angle = " + angle + " aspect = " +
        aspect + "}";
    }
}
