import x10.lang.*;

public class Random extends x10.lang.Object {
    
//#line 2
private int flag;
    
//#line 3
private double r0;
    
//#line 4
private int r1;
    
//#line 5
private int r2;
    
//#line 6
private int r4;
    
//#line 7
private int r5;
    
//#line 8
private double h1l;
    
//#line 9
private double h1u;
    
//#line 10
private double h2l;
    
    
//#line 12
public Random() {
        
//#line 12
super();
        
//#line 13
flag = 0;
        
//#line 14
r0 = 0.0;
        
//#line 15
r1 = 885098780;
        
//#line 16
r2 = 1824280461;
        
//#line 17
r4 = 1396483093;
        
//#line 18
r5 = 55318673;
        
//#line 19
h1l = 65531.0;
        
//#line 20
h1u = 32767.0;
        
//#line 21
h2l = 65525.0;
    }
    
    
//#line 24
public double nextNormal() {
        
//#line 25
double ret = 0.0;
        
//#line 26
if (flag != 0) {
            
//#line 27
ret = r0;
            
//#line 28
r0 = 0.0;
            
//#line 29
flag = 0;
        } else {
            
//#line 31
int isc = 65536;
            
//#line 32
double asc = isc;
            
//#line 33
double bsc = asc * asc;
            
//#line 34
int i1 = r1 - ((r1 / isc)) * isc;
            
//#line 35
double r3 = h1l * r1 + asc * h1u * i1;
            
//#line 36
i1 = (int) ((r3 / bsc));
            
//#line 37
r3 = r3 - ((i1 * bsc));
            
//#line 38
bsc = 0.5 * bsc;
            
//#line 39
i1 = r2 / isc;
            
//#line 40
isc = r2 - i1 * isc;
            
//#line 41
r0 = h1l * r2 + asc * h1u * isc;
            
//#line 42
asc = 1.0 / bsc;
            
//#line 43
isc = (int) ((r0 * asc));
            
//#line 44
r2 = (int) ((r0 - isc * bsc));
            
//#line 45
r3 = r3 + isc + 2.0 * h1u * i1;
            
//#line 46
isc = (int) ((r3 * asc));
            
//#line 47
r1 = (int) ((r3 - isc * bsc));
            
//#line 49
double temp =
              java.lang.Math.sqrt(-2.0 *
                                    java.lang.Math.log(((r1 + r2 * asc)) *
                                                         asc));
            
//#line 50
isc = 65536;
            
//#line 51
asc = isc;
            
//#line 52
bsc = asc * asc;
            
//#line 53
i1 = r4 - ((r4 / isc)) * isc;
            
//#line 54
r3 = h2l * r4 + asc * h1u * i1;
            
//#line 55
i1 = (int) ((r3 / bsc));
            
//#line 56
r3 = r3 - ((i1 * bsc));
            
//#line 57
bsc = 0.5 * bsc;
            
//#line 58
i1 = r5 / isc;
            
//#line 59
isc = r5 - i1 * isc;
            
//#line 60
r0 = h2l * r5 + asc * h1u * isc;
            
//#line 61
asc = 1.0 / bsc;
            
//#line 62
isc = (int) ((r0 * asc));
            
//#line 63
r5 = (int) ((r0 - isc * bsc));
            
//#line 64
r3 = r3 + ((isc + 2.0 * h1u * i1));
            
//#line 65
isc = (int) ((r3 * asc));
            
//#line 66
r4 = (int) ((r3 - isc * bsc));
            
//#line 67
r0 = 6.28318530717959 * ((((r4 + r5 * asc)) * asc));
            
//#line 69
ret = temp * java.lang.Math.sin(r0);
            
//#line 70
r0 = temp * java.lang.Math.cos(r0);
            
//#line 71
flag = 1;
        }
        
//#line 73
return ret;
    }
}
