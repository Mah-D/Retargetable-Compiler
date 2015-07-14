import x10.lang.*;

public class MGDriver
extends x10.
  lang.
  Object
{
    
    
//#line 33
public static void
                  driver(
                  ) {
        
//#line 34
int CLASS =
          1;
        
//#line 41
final boolean isDistributed =
          true;
        
//#line 43
int problemSize =
          0;
        
//#line 43
int numberIterations =
          0;
        
//#line 43
double reference2Norm =
          0;
        
//#line 44
switch (CLASS) {
            
//#line 45
case 1:
                
//#line 46
problemSize =
                  32;
                
//#line 46
numberIterations =
                  4;
                
//#line 46
reference2Norm =
                  5.30770700573E-5;
                
//#line 47
break;
            
//#line 48
case 2:
                
//#line 49
problemSize =
                  64;
                
//#line 49
numberIterations =
                  40;
                
//#line 49
reference2Norm =
                  2.50391406439E-18;
                
//#line 50
break;
            
//#line 51
case 3:
                
//#line 52
problemSize =
                  256;
                
//#line 52
numberIterations =
                  4;
                
//#line 52
reference2Norm =
                  2.433365309E-6;
                
//#line 53
break;
            
//#line 54
case 4:
                
//#line 55
problemSize =
                  256;
                
//#line 55
numberIterations =
                  20;
                
//#line 55
reference2Norm =
                  1.80056440132E-6;
                
//#line 56
break;
            
//#line 57
case 5:
                
//#line 58
problemSize =
                  512;
                
//#line 58
numberIterations =
                  20;
                
//#line 58
reference2Norm =
                  5.70674826298E-7;
                
//#line 59
break;
            
//#line 60
case 6:
                
//#line 61
problemSize =
                  1024;
                
//#line 61
numberIterations =
                  50;
                
//#line 61
reference2Norm =
                  1.58327506043E-10;
                
//#line 62
break;
            
//#line 63
default:
                
//#line 64
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                            lang.
                                                                                                            System.
                                                                                                            err))/* } */.println("Class must be one of {S,W,A,B,C,D}!");
        }
        
//#line 67
LevelData u =
          new LevelData(
          problemSize,
          isDistributed);
        
//#line 68
LevelData v =
          new LevelData(
          problemSize,
          isDistributed);
        
//#line 69
v.
                      initialize(
                      CLASS);
        
//#line 70
MGOP MG =
          new MGOP(
          problemSize);
        
//#line 71
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("There are " +
                                                                                                                         Util.
                                                                                                                           N_PLACES +
                                                                                                                         " places. Running problem of class " +
                                                                                                                         CLASS);
        
//#line 72
Timer tmr =
          new Timer(
          );
        
//#line 72
int count =
          0;
        
//#line 73
/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.start(count);
        
//#line 74
double res =
          0;
        
//#line 76
res =
          /* template:place-check { */((MGOP) x10.lang.Runtime.hereCheck(MG))/* } */.MGSolve(u,
                                                                                             v,
                                                                                             numberIterations);
        
//#line 82
/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.stop(count);
        
//#line 83
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("The reference 2norm is " +
                                                                                                                         reference2Norm +
                                                                                                                         ". The difference is " +
                                                                                                                         ((res -
                                                                                                                             reference2Norm)));
        
//#line 84
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("Wall-clock time for MGSolve: " +
                                                                                                                         /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.readTimer(count) +
                                                                                                                         "secs");
    }
    
    
//#line 32
public MGDriver() {
        
//#line 32
super();
    }
}
