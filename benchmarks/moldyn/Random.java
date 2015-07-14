import x10.lang.*;

public class Random extends x10.lang.Object {
    
//#line 12
public int iseed;
    
//#line 13
public double v1;
    
//#line 14
public double v2;
    
    
//#line 16
public Random(final int iseed0, final double v10,
                              final double v20) {
        
//#line 16
super();
        
//#line 17
iseed = iseed0;
        
//#line 18
v1 = v10;
        
//#line 19
v2 = v20;
    }
    
    
//#line 22
public double update() {
        
//#line 23
double rand = 0.0;
        
//#line 24
double scale = 4.656612875E-10;
        
//#line 26
int is1 = 0;
        
//#line 27
int is2 = 0;
        
//#line 28
int iss2 = 0;
        
//#line 29
int imult = 16807;
        
//#line 30
int imod = 2147483647;
        
//#line 32
if (iseed <= 0) { 
//#line 32
iseed = 1; }
        
//#line 34
is2 = iseed % 32768;
        
//#line 35
is1 = ((iseed - is2)) / 32768;
        
//#line 36
iss2 = is2 * imult;
        
//#line 37
is2 = iss2 % 32768;
        
//#line 38
is1 = ((is1 * imult + ((iss2 - is2)) / 32768)) % ((65536));
        
//#line 40
iseed = ((is1 * 32768 + is2)) % imod;
        
//#line 42
rand = scale * iseed;
        
//#line 44
return rand;
    }
    
    
//#line 47
public double seed() {
        
//#line 48
double s = 0.0;
        
//#line 49
double u1 = 0.0;
        
//#line 50
double u2 = 0.0;
        
//#line 51
double r = 0.0;
        
//#line 53
s = 1.0;
        
//#line 54
do  {
            
//#line 55
u1 = update();
            
//#line 56
u2 = update();
            
//#line 58
v1 = 2.0 * u1 - 1.0;
            
//#line 59
v2 = 2.0 * u2 - 1.0;
            
//#line 60
s = v1 * v1 + v2 * v2;
        }while(s >= 1.0); 
        
//#line 63
r = java.lang.Math.sqrt(-2.0 * java.lang.Math.log(s) / s);
        
//#line 65
return r;
    }
}
