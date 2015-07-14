package raytracer;

import jgfutil.*;
import x10.lang.*;

public class JGFRayTracerBench
extends raytracer.
  RayTracer
  implements jgfutil.
               JGFSection3
{
    
    
//#line 26
public void
                  JGFsetsize(
                  int size) {
        
//#line 27
this.
                      size =
          size;
    }
    
    
//#line 30
public void
                  JGFinitialise(
                  ) {
        
//#line 31
jgfutil.
                      JGFInstrumentor.
                      startTimer(
                      "Section3:RayTracer:Init");
        
//#line 34
width =
          (height =
             datasizes[size]);
        
//#line 37
scene =
          createScene();
        
//#line 40
setScene(
                      scene);
        
//#line 42
numobjects =
          scene.
            getObjects();
        
//#line 44
jgfutil.
                      JGFInstrumentor.
                      stopTimer(
                      "Section3:RayTracer:Init");
    }
    
    
//#line 47
public void
                  JGFapplication(
                  ) {
        
//#line 48
jgfutil.
                      JGFInstrumentor.
                      startTimer(
                      "Section3:RayTracer:Run");
        
//#line 52
raytracer.
          Interval interval =
          new raytracer.
          Interval(
          0,
          width,
          height,
          0,
          height,
          1);
        
//#line 55
render(
                      interval);
        
//#line 57
jgfutil.
                      JGFInstrumentor.
                      stopTimer(
                      "Section3:RayTracer:Run");
    }
    
    
//#line 60
public void
                  JGFvalidate(
                  ) {
        
//#line 62
long[] refval =
          { 51398,
        29827635 };
        
//#line 63
long dev =
          checksum -
          refval[size];
        
//#line 64
if (dev !=
                          0) {
            
//#line 65
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                        lang.
                                                                                                        System.
                                                                                                        out))/* } */.println("Validation failed");
            
//#line 66
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                        lang.
                                                                                                        System.
                                                                                                        out))/* } */.println("Pixel checksum = " +
                                                                                                                             checksum);
            
//#line 67
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                        lang.
                                                                                                        System.
                                                                                                        out))/* } */.println("Reference value = " +
                                                                                                                             refval[size]);
            
//#line 68
throw new java.
              lang.
              Error(
              "Validation failed");
        }
    }
    
    
//#line 72
public void
                  JGFtidyup(
                  ) {
        
//#line 80
java.
                      lang.
                      System.
                      gc();
    }
    
    
//#line 83
public void
                  JGFrun(
                  int size) {
        
//#line 84
jgfutil.
                      JGFInstrumentor.
                      addTimer(
                      "Section3:RayTracer:Total",
                      "Solutions",
                      size);
        
//#line 85
jgfutil.
                      JGFInstrumentor.
                      addTimer(
                      "Section3:RayTracer:Init",
                      "Objects",
                      size);
        
//#line 86
jgfutil.
                      JGFInstrumentor.
                      addTimer(
                      "Section3:RayTracer:Run",
                      "Pixels",
                      size);
        
//#line 88
JGFsetsize(
                      size);
        
//#line 90
jgfutil.
                      JGFInstrumentor.
                      startTimer(
                      "Section3:RayTracer:Total");
        
//#line 92
JGFinitialise();
        
//#line 93
JGFapplication();
        
//#line 94
JGFvalidate();
        
//#line 95
JGFtidyup();
        
//#line 97
jgfutil.
                      JGFInstrumentor.
                      stopTimer(
                      "Section3:RayTracer:Total");
        
//#line 99
jgfutil.
                      JGFInstrumentor.
                      addOpsToTimer(
                      "Section3:RayTracer:Init",
                      (double)
                        numobjects);
        
//#line 100
jgfutil.
                       JGFInstrumentor.
                       addOpsToTimer(
                       "Section3:RayTracer:Run",
                       (double)
                         ((width *
                             height)));
        
//#line 101
jgfutil.
                       JGFInstrumentor.
                       addOpsToTimer(
                       "Section3:RayTracer:Total",
                       1);
        
//#line 103
jgfutil.
                       JGFInstrumentor.
                       printTimer(
                       "Section3:RayTracer:Init");
        
//#line 104
jgfutil.
                       JGFInstrumentor.
                       printTimer(
                       "Section3:RayTracer:Run");
        
//#line 105
jgfutil.
                       JGFInstrumentor.
                       printTimer(
                       "Section3:RayTracer:Total");
    }
    
    
//#line 24
public JGFRayTracerBench() {
        
//#line 24
super();
    }
}
