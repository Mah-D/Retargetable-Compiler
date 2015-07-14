package lufact;

import jgfutil.*;
import x10.lang.*;

public class JGFLUFactBench
extends lufact.
  Linpack
  implements jgfutil.
               JGFSection2
{
    
//#line 31
private int
      size;
    
//#line 32
private int[]
      datasizes =
      { 150,
    1000,
    2000 };
    
    
//#line 34
public void
                  JGFsetsize(
                  int size) {
        
//#line 35
this.
                      size =
          size;
    }
    
    
//#line 38
public void
                  JGFinitialise(
                  ) {
        
//#line 39
n =
          datasizes[size];
        
//#line 40
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("ATTENTION: Running with smaller size (" +
                                                                                                                         n +
                                                                                                                         " instead of 500)");
        
//#line 41
ldaa =
          n;
        
//#line 42
lda =
          ldaa +
            1;
        
//#line 44
x10.
          lang.
          region vectorRegion =
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
              ldaa));
        
//#line 45
x10.
          lang.
          region rectangularRegion =
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
              ldaa),
            x10.
              lang.
              region.
              factory.
              region(
              0,
              lda));
        
//#line 46
x10.
          lang.
          region slimRegion =
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
              0),
            x10.
              lang.
              region.
              factory.
              region(
              0,
              lda));
        
//#line 47
x10.
          lang.
          dist rectangular_distribution =
          x10.
            lang.
            dist.
            factory.
            blockCyclic(
            rectangularRegion,
            lda +
              1);
        
//#line 49
a =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(rectangular_distribution,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 50
b =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(x10.
                                                                                                                       lang.
                                                                                                                       dist.
                                                                                                                       factory.
                                                                                                                       constant(
                                                                                                                       slimRegion,
                                                                                                                       /* template:here { */x10.lang.Runtime.here()/* } */),(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 51
x =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(x10.
                                                                                                                       lang.
                                                                                                                       dist.
                                                                                                                       factory.
                                                                                                                       constant(
                                                                                                                       slimRegion,
                                                                                                                       /* template:here { */x10.lang.Runtime.here()/* } */),(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 52
ipvt =
          (new int[ldaa]);
        
//#line 54
long nl =
          (long)
            n;
        
//#line 55
ops =
          ((2.0 *
              ((nl *
                  nl *
                  nl)))) /
            3.0 +
            2.0 *
            ((nl *
                nl));
        
//#line 57
norma =
          matgen(
            a,
            lda,
            n,
            b);
    }
    
    
//#line 60
public void
                  JGFkernel(
                  ) {
        
//#line 61
jgfutil.
                      JGFInstrumentor.
                      startTimer(
                      "Section2:LUFact:Kernel");
        
//#line 62
info =
          dgefa(
            a,
            lda,
            n,
            ipvt);
        
//#line 63
dgesl(
                      a,
                      lda,
                      n,
                      ipvt,
                      b,
                      0);
        
//#line 64
jgfutil.
                      JGFInstrumentor.
                      stopTimer(
                      "Section2:LUFact:Kernel");
    }
    
    
//#line 67
public void
                  JGFvalidate(
                  ) {
        
//#line 68
int i;
        
//#line 69
double eps;
        
//#line 69
double residn;
        
//#line 70
final double[] ref =
          { 6.0,
        12.0,
        20.0 };
        
//#line 72
for (
//#line 72
i =
                           0;
                         i <
                           n;
                         
//#line 72
i++) {
            
//#line 73
/* template:array_set { */(x).set(/* template:array_get { */((b).get(/* Join: { */0,i/* } */))/* } */,/* Join: { */0,i/* } */)/* } */;
        }
        
//#line 75
norma =
          matgen(
            a,
            lda,
            n,
            b);
        
//#line 76
for (
//#line 76
i =
                           0;
                         i <
                           n;
                         
//#line 76
i++) {
            
//#line 77
/* template:array_set { */(b).set(-/* template:array_get { */((b).get(/* Join: { */0,i/* } */))/* } */,/* Join: { */0,i/* } */)/* } */;
        }
        
//#line 80
dmxpy(
                      n,
                      b,
                      n,
                      lda,
                      x,
                      a);
        
//#line 81
resid =
          0.0;
        
//#line 82
normx =
          0.0;
        
//#line 83
for (
//#line 83
i =
                           0;
                         i <
                           n;
                         
//#line 83
i++) {
            
//#line 84
resid =
              (((resid >
                   abs(
                     /* template:array_get { */((b).get(/* Join: { */0,i/* } */))/* } */)))
                 ? resid
                 : abs(
                     /* template:array_get { */((b).get(/* Join: { */0,i/* } */))/* } */));
            
//#line 85
normx =
              (((normx >
                   abs(
                     /* template:array_get { */((x).get(/* Join: { */0,i/* } */))/* } */)))
                 ? normx
                 : abs(
                     /* template:array_get { */((x).get(/* Join: { */0,i/* } */))/* } */));
        }
        
//#line 88
eps =
          epslon(
            (double)
              1.0);
        
//#line 89
residn =
          resid /
            ((n *
                norma *
                normx *
                eps));
        
//#line 91
if (residn >
                          ref[size]) {
            
//#line 92
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                        lang.
                                                                                                        System.
                                                                                                        out))/* } */.println("Validation failed");
            
//#line 93
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                        lang.
                                                                                                        System.
                                                                                                        out))/* } */.println("Computed Norm Res = " +
                                                                                                                             residn);
            
//#line 94
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                        lang.
                                                                                                        System.
                                                                                                        out))/* } */.println("Reference Norm Res = " +
                                                                                                                             ref[size]);
            
//#line 95
throw new java.
              lang.
              Error(
              "Validation failed");
        }
    }
    
    
//#line 99
public void
                  JGFtidyup(
                  ) {
        
    }
    
    
//#line 114
public void
                   JGFrun(
                   int size) {
        
//#line 115
jgfutil.
                       JGFInstrumentor.
                       addTimer(
                       "Section2:LUFact:Kernel",
                       "Mflops",
                       size);
        
//#line 117
JGFsetsize(
                       size);
        
//#line 118
JGFinitialise();
        
//#line 119
JGFkernel();
        
//#line 120
JGFvalidate();
        
//#line 121
JGFtidyup();
        
//#line 123
jgfutil.
                       JGFInstrumentor.
                       addOpsToTimer(
                       "Section2:LUFact:Kernel",
                       ops /
                         1000000.0);
        
//#line 124
jgfutil.
                       JGFInstrumentor.
                       printTimer(
                       "Section2:LUFact:Kernel");
    }
    
    
//#line 29
public JGFLUFactBench() {
        
//#line 29
super();
    }
}
