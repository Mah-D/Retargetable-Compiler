package NPB3_0_X10;

import x10.lang.*;

public class Timer extends x10.lang.Object {
    
//#line 45
final public static int max_counters = 64;
    
//#line 46
double[] start_time = new double[max_counters];
    
//#line 47
double[] elapsed_time = new double[max_counters];
    
//#line 48
double[] total_time = new double[max_counters];
    
    
//#line 50
public Timer() {
        
//#line 50
super();
        
//#line 51
for (
//#line 51
int i = 0; i < max_counters;
                         
//#line 51
i++) {
            
//#line 52
start_time[i] = 0;
            
//#line 53
elapsed_time[i] = 0;
            
//#line 54
total_time[i] = 0;
        }
    }
    
    
//#line 58
public void start(int n) {
        
//#line 59
start_time[n] = java.lang.System.currentTimeMillis();
    }
    
    
//#line 62
public void stop(int n) {
        
//#line 63
elapsed_time[n] = java.lang.System.currentTimeMillis() -
                                        start_time[n];
        
//#line 64
elapsed_time[n] /= 1000;
        
//#line 65
total_time[n] += elapsed_time[n];
    }
    
    
//#line 68
public double readTimer(int n) {
        
//#line 69
return total_time[n];
    }
    
    
//#line 72
public void resetTimer(int n) {
        
//#line 73
elapsed_time[n] = (start_time[n] = (total_time[n] = 0));
    }
    
    
//#line 76
public void resetAllTimers() {
        
//#line 77
for (
//#line 77
int i = 0; i < max_counters;
                         
//#line 77
i++) {
            
//#line 77
resetTimer(i);
        }
    }
}
