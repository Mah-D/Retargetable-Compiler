import x10.lang.*;

public class Complex extends x10.lang.Object implements x10.lang.ValueType {
    
//#line 7
final private double real;
    
//#line 8
final private double imag;
    
    
//#line 13
public Complex(final double real, final double imag) {
        
//#line 13
super();
        
//#line 14
this.real = real;
        
//#line 15
this.imag = imag;
    }
    
    
//#line 21
public double getReal() { 
//#line 22
return real; }
    
    
//#line 28
public double getImag() { 
//#line 29
return imag; }
    
    
//#line 37
public Complex add(final Complex n) {
        
//#line 38
return new Complex(getReal() + n.getReal(), getImag() +
                                         n.getImag());
    }
    
    
//#line 47
public Complex sub(final Complex n) {
        
//#line 48
return new Complex(getReal() - n.getReal(), getImag() -
                                         n.getImag());
    }
    
    
//#line 58
public Complex mult(final Complex n) {
        
//#line 59
final double a = getReal();
        
//#line 60
final double b = getImag();
        
//#line 61
final double c = n.getReal();
        
//#line 62
final double d = n.getImag();
        
//#line 63
return new Complex(a * c - b * d, a * d + b * c);
    }
    
    
//#line 71
public Complex multS(final double r) {
        
//#line 72
return new Complex(r * getReal(), r * getImag());
    }
    
    
//#line 80
public Complex getConjg() {
        
//#line 81
return new Complex(getReal(), -getImag());
    }
    
    
//#line 88
public double multConjg() {
        
//#line 89
final double a = getReal();
        
//#line 90
final double b = getImag();
        
//#line 91
return (a * a + b * b);
    }
    
    
//#line 98
public boolean complexEquals(final Complex c) {
        
//#line 99
return (((java.lang.Math.abs(getReal() - c.getReal()) <
                                X10Util.ERROR)) &&
                              ((java.lang.Math.abs(getImag() - c.getImag()) <
                                  X10Util.ERROR)));
    }
    
    
//#line 107
public java.lang.String toString() {
        
//#line 108
final double r = getReal();
        
//#line 109
final double i = getImag();
        
//#line 110
return "(" + r + "," + i + ")";
    }
}
