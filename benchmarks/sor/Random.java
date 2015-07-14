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
public Random(final long rseed) {
        
//#line 13
super();
        
//#line 14
setSeed(rseed);
    }
    
    
//#line 17
public void setSeed(final long rseed) {
        
//#line 18
seed = ((rseed ^ multiplier)) & mask;
    }
    
    
//#line 21
private int nextbits(final int bits) {
        
//#line 22
long oldseed = seed;
        
//#line 23
long nextseed = ((oldseed * multiplier + addend)) & mask;
        
//#line 24
seed = nextseed;
        
//#line 26
return (int) ((nextseed >>> ((48 - bits))));
    }
    
    
//#line 29
public int nextInt() { 
//#line 30
return nextbits(32); }
    
    
//#line 33
public long nextLong() {
        
//#line 34
return (((long) ((nextbits(32))) << 32)) + nextbits(32);
    }
    
    
//#line 37
public boolean nextBoolean() {
        
//#line 38
return nextbits(1) != 0;
    }
    
    
//#line 41
public double nextDouble() {
        
//#line 42
return (((((long) ((nextbits(26))) << 27)) +
                               nextbits(27))) /
          (double) ((1L << 53));
    }
}
