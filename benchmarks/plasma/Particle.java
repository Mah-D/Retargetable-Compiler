import x10.lang.*;

public class Particle extends x10.lang.Object implements x10.lang.ValueType {
    
//#line 8
final private double x;
    
//#line 9
final private double y;
    
//#line 10
final private double xVel;
    
//#line 11
final private double yVel;
    
//#line 12
final private int pid;
    
    
//#line 14
public Particle() {
        
//#line 14
super();
        
//#line 15
x = 0.0;
        
//#line 16
y = 0.0;
        
//#line 17
xVel = 0.0;
        
//#line 18
yVel = 0.0;
        
//#line 19
pid = -1;
    }
    
    
//#line 22
public Particle(final double x, final double y,
                                final double xVel, final double yVel) {
        
//#line 25
super();
        
//#line 26
this.x = x;
        
//#line 27
this.y = y;
        
//#line 28
this.xVel = xVel;
        
//#line 29
this.yVel = yVel;
        
//#line 30
pid = -1;
    }
    
    
//#line 33
public Particle(final double x, final double y,
                                final double xVel, final double yVel,
                                final int pid) {
        
//#line 37
super();
        
//#line 38
this.x = x;
        
//#line 39
this.y = y;
        
//#line 40
this.xVel = xVel;
        
//#line 41
this.yVel = yVel;
        
//#line 42
this.pid = pid;
    }
    
    
//#line 49
public double getX() { 
//#line 50
return x; }
    
    
//#line 56
public double getY() { 
//#line 57
return y; }
    
    
//#line 63
public double getXVel() { 
//#line 64
return xVel; }
    
    
//#line 70
public double getYVel() { 
//#line 71
return yVel; }
    
    
//#line 74
public Particle setX(final double x) {
        
//#line 75
return new Particle(x, y, xVel, yVel, pid);
    }
    
    
//#line 78
public Particle setY(final double y) {
        
//#line 79
return new Particle(x, y, xVel, yVel, pid);
    }
    
    
//#line 82
public Particle setXVel(final double xVel) {
        
//#line 83
return new Particle(x, y, xVel, yVel, pid);
    }
    
    
//#line 86
public Particle setYVel(final double yVel) {
        
//#line 87
return new Particle(x, y, xVel, yVel, pid);
    }
    
    
//#line 90
public Particle setPos(final double x, final double y) {
        
//#line 91
return new Particle(x, y, xVel, yVel, pid);
    }
    
    
//#line 94
public Particle setVel(final double xVel, final double yVel) {
        
//#line 95
return new Particle(x, y, xVel, yVel, pid);
    }
    
    
//#line 98
public java.lang.String toString() {
        
//#line 99
java.lang.String result = ((pid >= 0)) ? "p" + pid : "";
        
//#line 100
result = result + "(" + x + "," + y + "," + xVel + "," +
                              yVel + ")";
        
//#line 101
return result;
    }
    
    
//#line 104
public boolean particleEquals(final Particle p) {
        
//#line 105
final double error = X10Util.ERROR;
        
//#line 107
if (pid >= 0 && pid != p.pid) {
            
//#line 108
return false;
        }
        
//#line 110
return (((java.lang.Math.abs(getX() - p.getX()) <
                                 error)) &&
                               ((java.lang.Math.abs(getY() - p.getY()) <
                                   error)) &&
                               ((java.lang.Math.abs(getXVel() - p.getXVel()) <
                                   error)) &&
                               ((java.lang.Math.abs(getYVel() - p.getYVel()) <
                                   error)));
    }
}
