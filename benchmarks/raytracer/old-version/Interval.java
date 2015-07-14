import x10.lang.*;

public class Interval extends x10.lang.Object implements x10.lang.ValueType {
    
//#line 25
final public int number;
    
//#line 26
final public int width;
    
//#line 27
final public int height;
    
//#line 28
final public int yfrom;
    
//#line 29
final public int yto;
    
//#line 30
final public int total;
    
    
//#line 32
public Interval(int number_, int width_, int height_,
                                int yfrom_, int yto_, int total_) {
        
//#line 33
super();
        
//#line 34
number = number_;
        
//#line 35
width = width_;
        
//#line 36
height = height_;
        
//#line 37
yfrom = yfrom_;
        
//#line 38
yto = yto_;
        
//#line 39
total = total_;
    }
    
    
//#line 41
public java.lang.String toString() { 
//#line 43
return ""; }
}
