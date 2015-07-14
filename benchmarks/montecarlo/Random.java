import x10.lang.*;

public class Random extends x10.lang.Object {
    
//#line 7
private long seed;
    
//#line 9
final private static long multiplier = 25214903917L;
    
//#line 10
final private static long addend = 11L;
    
//#line 11
final private static long mask = ((1L << 48)) - 1;
    
//#line 13
private boolean haveNextNextGaussian;
    
//#line 14
private double nextNextGaussian;
    
    
//#line 16
public Random(final long rseed) {
        
//#line 16
super();
        
//#line 17
setSeed(rseed);
        
//#line 18
haveNextNextGaussian = false;
    }
    
    
//#line 21
public void setSeed(final long rseed) {
        
//#line 22
seed = ((rseed ^ multiplier)) & mask;
    }
    
    
//#line 25
private int nextbits(final int bits) {
        
//#line 26
long oldseed = seed;
        
//#line 27
long nextseed = ((oldseed * multiplier + addend)) & mask;
        
//#line 28
seed = nextseed;
        
//#line 30
return (int) ((nextseed >>> ((48 - bits))));
    }
    
    
//#line 33
public int nextInt() { 
//#line 34
return nextbits(32); }
    
    
//#line 37
public long nextLong() {
        
//#line 38
return (((long) ((nextbits(32))) << 32)) + nextbits(32);
    }
    
    
//#line 41
public boolean nextBoolean() {
        
//#line 42
return nextbits(1) != 0;
    }
    
    
//#line 45
public double nextDouble() {
        
//#line 46
return (((((long) ((nextbits(26))) << 27)) +
                               nextbits(27))) /
          (double) ((1L << 53));
    }
    
    
//#line 50
public double nextGaussian() {
        
//#line 51
if (haveNextNextGaussian) {
            
//#line 52
haveNextNextGaussian = false;
            
//#line 53
return nextNextGaussian;
        } else {
            
//#line 55
double v1 = 0.0;
            
//#line 56
double v2 = 0.0;
            
//#line 57
double s = 0.0;
            
//#line 58
do  {
                
//#line 59
v1 = 2 * nextDouble() - 1;
                
//#line 60
v2 = 2 * nextDouble() - 1;
                
//#line 61
s = v1 * v1 + v2 * v2;
            }while(s >= 1 || s == 0); 
            
//#line 63
double multiplier =
              java.lang.Math.sqrt(-2 * java.lang.Math.log(s) / s);
            
//#line 64
nextNextGaussian = v2 * multiplier;
            
//#line 65
haveNextNextGaussian = true;
            
//#line 66
return v1 * multiplier;
        }
    }
}
