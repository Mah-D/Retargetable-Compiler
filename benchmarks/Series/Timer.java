import x10.lang.*;

public class Timer
extends x10.
  lang.
  Object
{
    
//#line 44
final public static int
      max_counters =
      64;
    
//#line 45
private x10.
      lang.
      DoubleReferenceArray
      start_time;
    
//#line 46
private x10.
      lang.
      DoubleReferenceArray
      elapsed_time;
    
//#line 47
private x10.
      lang.
      DoubleReferenceArray
      total_time;
    
    
//#line 49
public Timer() {
        
//#line 49
super();
        
//#line 50
final x10.
          lang.
          dist d =
          x10.
            lang.
            dist.
            factory.
            constant(
            x10.
              lang.
              region.
              factory.
              region(
              x10.
                lang.
                region.
                factory.
                region(
                0,
                max_counters)),
            x10.
              lang.
              place.
              FIRST_PLACE);
        
//#line 51
start_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 51
return 0;
           } }
           }/* } */,true,true,false)/* } */);
        
//#line 52
elapsed_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 52
return 0;
           } }
           }/* } */,true,true,false)/* } */);
        
//#line 53
total_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 53
return 0;
           } }
           }/* } */,true,true,false)/* } */);
    }
    
    
//#line 56
public void
                  start(
                  final int n) {
        
//#line 57
/* template:array_set { */(start_time).set(java.
                                                                 lang.
                                                                 System.
                                                                 currentTimeMillis(),n)/* } */;
    }
    
    
//#line 60
public void
                  stop(
                  final int n) {
        
//#line 61
/* template:array_set { */(elapsed_time).set(java.
                                                                   lang.
                                                                   System.
                                                                   currentTimeMillis() -
          /* template:array_get { */((start_time).get(n))/* } */,n)/* } */;
        
//#line 62
/* template:array_set { */(elapsed_time).set(/* template:array_get { */((elapsed_time).get(n))/* } */ /
          1000,n)/* } */;
        
//#line 63
/* template:array_set { */(total_time).set(/* template:array_get { */((total_time).get(n))/* } */ +
          /* template:array_get { */((elapsed_time).get(n))/* } */,n)/* } */;
    }
    
    
//#line 66
public double
                  readTimer(
                  final int n) {
        
//#line 67
return /* template:array_get { */((total_time).get(n))/* } */;
    }
    
    
//#line 70
public void
                  resetTimer(
                  final int n) {
        
//#line 71
/* template:array_set { */(total_time).set(0,n)/* } */;
        
//#line 72
/* template:array_set { */(start_time).set(0,n)/* } */;
        
//#line 73
/* template:array_set { */(elapsed_time).set(0,n)/* } */;
    }
    
    
//#line 76
public void
                  resetAllTimers(
                  ) {
        
//#line 77
int i =
          0;
        
//#line 78
while (i <
                             max_counters) {
            
//#line 79
resetTimer(
                          i);
            
//#line 80
i++;
        }
    }
}
