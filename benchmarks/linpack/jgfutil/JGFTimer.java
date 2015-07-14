package jgfutil;

import x10.lang.*;

public class JGFTimer
extends x10.
  lang.
  Object
{
    
//#line 21
public java.
      lang.
      String
      name;
    
//#line 22
public java.
      lang.
      String
      opname;
    
//#line 23
public double
      time;
    
//#line 24
public double
      opcount;
    
//#line 25
public long
      calls;
    
//#line 26
public int
      size =
      -1;
    
//#line 28
private long
      start_time;
    
//#line 29
private boolean
      on;
    
    
//#line 31
public JGFTimer(java.
                                  lang.
                                  String name,
                                java.
                                  lang.
                                  String opname) {
        
//#line 31
super();
        
//#line 32
this.
                      name =
          name;
        
//#line 33
this.
                      opname =
          opname;
        
//#line 34
reset();
    }
    
    
//#line 37
public JGFTimer(java.
                                  lang.
                                  String name,
                                java.
                                  lang.
                                  String opname,
                                int size) {
        
//#line 37
super();
        
//#line 38
this.
                      name =
          name;
        
//#line 39
this.
                      opname =
          opname;
        
//#line 40
this.
                      size =
          size;
        
//#line 41
reset();
    }
    
    
//#line 44
public JGFTimer(java.
                                  lang.
                                  String name) {
        
//#line 45
this(name,
                         "");
    }
    
    
//#line 50
public void
                  start(
                  ) {
        
//#line 51
if (on) {
            
//#line 51
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                        lang.
                                                                                                        System.
                                                                                                        out))/* } */.println("Warning timer " +
                                                                                                                             name +
                                                                                                                             " was already turned on");
        }
        
//#line 52
on =
          true;
        
//#line 53
start_time =
          java.
            lang.
            System.
            currentTimeMillis();
    }
    
    
//#line 57
public void
                  stop(
                  ) {
        
//#line 58
time +=
          (double)
            ((java.
                lang.
                System.
                currentTimeMillis() -
                start_time)) /
            1000.0;
        
//#line 59
if (!on) {
            
//#line 59
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                        lang.
                                                                                                        System.
                                                                                                        out))/* } */.println("Warning timer " +
                                                                                                                             name +
                                                                                                                             " wasn\'t turned on");
        }
        
//#line 60
calls++;
        
//#line 61
on =
          false;
    }
    
    
//#line 64
public void
                  addops(
                  double count) {
        
//#line 65
opcount +=
          count;
    }
    
    
//#line 68
public void
                  reset(
                  ) {
        
//#line 69
time =
          0.0;
        
//#line 70
calls =
          0;
        
//#line 71
opcount =
          0;
        
//#line 72
on =
          false;
    }
    
    
//#line 75
public double
                  perf(
                  ) {
        
//#line 76
return opcount /
          time;
    }
    
    
//#line 79
public void
                  longprint(
                  ) {
        
//#line 80
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println("Timer            Calls         Time(s)       Performance(" +
                                                                                                                         opname +
                                                                                                                         "/s)");
        
//#line 81
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println(name +
                                                                                                                         "           " +
                                                                                                                         calls +
                                                                                                                         "           " +
                                                                                                                         time +
                                                                                                                         "        " +
                                                                                                                         this.
                                                                                                                           perf());
    }
    
    
//#line 84
public void
                  print(
                  ) {
        
//#line 85
if (/* template:place-check { */((java.lang.String) x10.lang.Runtime.hereCheck(opname))/* } */.equals("")) {
            
//#line 86
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                        lang.
                                                                                                        System.
                                                                                                        out))/* } */.println(name +
                                                                                                                             "   " +
                                                                                                                             time +
                                                                                                                             " (s)");
        } else {
            
//#line 90
switch (size) {
                
//#line 91
case 0:
                    
//#line 92
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                lang.
                                                                                                                System.
                                                                                                                out))/* } */.println(name +
                                                                                                                                     ":SizeA" +
                                                                                                                                     "\t" +
                                                                                                                                     time +
                                                                                                                                     " (s) \t " +
                                                                                                                                     (float)
                                                                                                                                       this.
                                                                                                                                         perf() +
                                                                                                                                     "\t" +
                                                                                                                                     " (" +
                                                                                                                                     opname +
                                                                                                                                     "/s)");
                    
//#line 94
break;
                
//#line 95
case 1:
                    
//#line 96
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                lang.
                                                                                                                System.
                                                                                                                out))/* } */.println(name +
                                                                                                                                     ":SizeB" +
                                                                                                                                     "\t" +
                                                                                                                                     time +
                                                                                                                                     " (s) \t " +
                                                                                                                                     (float)
                                                                                                                                       this.
                                                                                                                                         perf() +
                                                                                                                                     "\t" +
                                                                                                                                     " (" +
                                                                                                                                     opname +
                                                                                                                                     "/s)");
                    
//#line 98
break;
                
//#line 99
case 2:
                    
//#line 100
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                 lang.
                                                                                                                 System.
                                                                                                                 out))/* } */.println(name +
                                                                                                                                      ":SizeC" +
                                                                                                                                      "\t" +
                                                                                                                                      time +
                                                                                                                                      " (s) \t " +
                                                                                                                                      (float)
                                                                                                                                        this.
                                                                                                                                          perf() +
                                                                                                                                      "\t" +
                                                                                                                                      " (" +
                                                                                                                                      opname +
                                                                                                                                      "/s)");
                    
//#line 102
break;
                
//#line 103
default:
                    
//#line 104
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                 lang.
                                                                                                                 System.
                                                                                                                 out))/* } */.println(name +
                                                                                                                                      "\t" +
                                                                                                                                      time +
                                                                                                                                      " (s) \t " +
                                                                                                                                      (float)
                                                                                                                                        this.
                                                                                                                                          perf() +
                                                                                                                                      "\t" +
                                                                                                                                      " (" +
                                                                                                                                      opname +
                                                                                                                                      "/s)");
                    
//#line 106
break;
            }
        }
    }
    
    
//#line 113
public void
                   printperf(
                   ) {
        
//#line 115
java.
          lang.
          String name;
        
//#line 116
name =
          this.
            name;
        
//#line 119
while (/* template:place-check { */((java.lang.String) x10.lang.Runtime.hereCheck(name))/* } */.length() <
                              40)
            
//#line 119
name =
              name +
              " ";
        
//#line 121
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println(name +
                                                                                                                          "\t" +
                                                                                                                          (float)
                                                                                                                            this.
                                                                                                                              perf() +
                                                                                                                          "\t" +
                                                                                                                          " (" +
                                                                                                                          opname +
                                                                                                                          "/s)");
    }
}
