package raytracer;

import x10.lang.*;

public class Interval extends x10.lang.Object implements x10.lang.ValueType {
    
//#line 27
final public int number;
    
//#line 28
final public int width;
    
//#line 29
final public int height;
    
//#line 30
final public int yfrom;
    
//#line 31
final public int yto;
    
//#line 32
final public int total;
    
    
//#line 34
public Interval(int number_, int width_, int height_,
                                int yfrom_, int yto_, int total_) {
        
//#line 35
super();
        
//#line 36
number = number_;
        
//#line 37
width = width_;
        
//#line 38
height = height_;
        
//#line 39
yfrom = yfrom_;
        
//#line 40
yto = yto_;
        
//#line 41
total = total_;
    }
}
