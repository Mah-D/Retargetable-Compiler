package jgfutil;

import java.util.*;
import x10.lang.*;

public class JGFInstrumentor
extends x10.
  lang.
  Object
{
    
//#line 24
final private static java.
      util.
      Hashtable
      timers;
    
//#line 25
final private static java.
      util.
      Hashtable
      data;
    
    static {
        
//#line 28
timers =
          new java.
            util.
            Hashtable(
            );
        
//#line 29
data =
          new java.
            util.
            Hashtable(
            );
    }
    
    
//#line 32
public static void
                  addTimer(
                  java.
                    lang.
                    String name) {
        
//#line 32
/* template:Atomic { */
        synchronized (x10.lang.Runtime.here()) {
        	try {
        		{
            
//#line 34
if (/* template:place-check { */((java.util.Hashtable) x10.lang.Runtime.hereCheck(timers))/* } */.containsKey(name)) {
                
//#line 35
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                            lang.
                                                                                                            System.
                                                                                                            out))/* } */.println("JGFInstrumentor.addTimer: warning -  timer " +
                                                                                                                                 name +
                                                                                                                                 " already exists");
            } else {
                
//#line 39
/* template:place-check { */((java.util.Hashtable) x10.lang.Runtime.hereCheck(timers))/* } */.put(name,
                                                                                                                              new jgfutil.
                                                                                                                                JGFTimer(
                                                                                                                                name));
            }
        }
        	} finally {
        		x10.lang.Runtime.here().notifyAll();
        	}
        }/* } */
    }
    
    
//#line 43
public static void
                  addTimer(
                  java.
                    lang.
                    String name,
                  java.
                    lang.
                    String opname) {
        
//#line 43
/* template:Atomic { */
        synchronized (x10.lang.Runtime.here()) {
        	try {
        		{
            
//#line 45
if (/* template:place-check { */((java.util.Hashtable) x10.lang.Runtime.hereCheck(timers))/* } */.containsKey(name)) {
                
//#line 46
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                            lang.
                                                                                                            System.
                                                                                                            out))/* } */.println("JGFInstrumentor.addTimer: warning -  timer " +
                                                                                                                                 name +
                                                                                                                                 " already exists");
            } else {
                
//#line 50
/* template:place-check { */((java.util.Hashtable) x10.lang.Runtime.hereCheck(timers))/* } */.put(name,
                                                                                                                              new jgfutil.
                                                                                                                                JGFTimer(
                                                                                                                                name,
                                                                                                                                opname));
            }
        }
        	} finally {
        		x10.lang.Runtime.here().notifyAll();
        	}
        }/* } */
    }
    
    
//#line 55
public static void
                  addTimer(
                  java.
                    lang.
                    String name,
                  java.
                    lang.
                    String opname,
                  int size) {
        
//#line 55
/* template:Atomic { */
        synchronized (x10.lang.Runtime.here()) {
        	try {
        		{
            
//#line 57
if (/* template:place-check { */((java.util.Hashtable) x10.lang.Runtime.hereCheck(timers))/* } */.containsKey(name)) {
                
//#line 58
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                            lang.
                                                                                                            System.
                                                                                                            out))/* } */.println("JGFInstrumentor.addTimer: warning -  timer " +
                                                                                                                                 name +
                                                                                                                                 " already exists");
            } else {
                
//#line 62
/* template:place-check { */((java.util.Hashtable) x10.lang.Runtime.hereCheck(timers))/* } */.put(name,
                                                                                                                              new jgfutil.
                                                                                                                                JGFTimer(
                                                                                                                                name,
                                                                                                                                opname,
                                                                                                                                size));
            }
        }
        	} finally {
        		x10.lang.Runtime.here().notifyAll();
        	}
        }/* } */
    }
    
    
//#line 67
public static void
                  startTimer(
                  java.
                    lang.
                    String name) {
        
//#line 67
/* template:Atomic { */
        synchronized (x10.lang.Runtime.here()) {
        	try {
        		{
            
//#line 68
if (/* template:place-check { */((java.util.Hashtable) x10.lang.Runtime.hereCheck(timers))/* } */.containsKey(name)) {
                
//#line 69
/* template:place-check { */((jgfutil.JGFTimer) x10.lang.Runtime.hereCheck(((jgfutil.
                                                                                                          JGFTimer)
                                                                                                          /* template:place-check { */((java.util.Hashtable) x10.lang.Runtime.hereCheck(timers))/* } */.get(name))))/* } */.start();
            } else {
                
//#line 72
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                            lang.
                                                                                                            System.
                                                                                                            out))/* } */.println("JGFInstrumentor.startTimer: failed -  timer " +
                                                                                                                                 name +
                                                                                                                                 " does not exist");
            }
        }
        	} finally {
        		x10.lang.Runtime.here().notifyAll();
        	}
        }/* } */
    }
    
    
//#line 78
public static void
                  stopTimer(
                  java.
                    lang.
                    String name) {
        
//#line 78
/* template:Atomic { */
        synchronized (x10.lang.Runtime.here()) {
        	try {
        		{
            
//#line 79
if (/* template:place-check { */((java.util.Hashtable) x10.lang.Runtime.hereCheck(timers))/* } */.containsKey(name)) {
                
//#line 80
/* template:place-check { */((jgfutil.JGFTimer) x10.lang.Runtime.hereCheck(((jgfutil.
                                                                                                          JGFTimer)
                                                                                                          /* template:place-check { */((java.util.Hashtable) x10.lang.Runtime.hereCheck(timers))/* } */.get(name))))/* } */.stop();
            } else {
                
//#line 83
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                            lang.
                                                                                                            System.
                                                                                                            out))/* } */.println("JGFInstrumentor.stopTimer: failed -  timer " +
                                                                                                                                 name +
                                                                                                                                 " does not exist");
            }
        }
        	} finally {
        		x10.lang.Runtime.here().notifyAll();
        	}
        }/* } */
    }
    
    
//#line 88
public static void
                  addOpsToTimer(
                  java.
                    lang.
                    String name,
                  double count) {
        
//#line 88
/* template:Atomic { */
        synchronized (x10.lang.Runtime.here()) {
        	try {
        		{
            
//#line 89
if (/* template:place-check { */((java.util.Hashtable) x10.lang.Runtime.hereCheck(timers))/* } */.containsKey(name)) {
                
//#line 90
/* template:place-check { */((jgfutil.JGFTimer) x10.lang.Runtime.hereCheck(((jgfutil.
                                                                                                          JGFTimer)
                                                                                                          /* template:place-check { */((java.util.Hashtable) x10.lang.Runtime.hereCheck(timers))/* } */.get(name))))/* } */.addops(count);
            } else {
                
//#line 93
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                            lang.
                                                                                                            System.
                                                                                                            out))/* } */.println("JGFInstrumentor.addOpsToTimer: failed -  timer " +
                                                                                                                                 name +
                                                                                                                                 " does not exist");
            }
        }
        	} finally {
        		x10.lang.Runtime.here().notifyAll();
        	}
        }/* } */
    }
    
    
//#line 98
public static double
                  readTimer(
                  java.
                    lang.
                    String name) {
        
//#line 98
/* template:Atomic { */
        synchronized (x10.lang.Runtime.here()) {
        	try {
        		{
            
//#line 99
double time;
            
//#line 100
if (/* template:place-check { */((java.util.Hashtable) x10.lang.Runtime.hereCheck(timers))/* } */.containsKey(name)) {
                
//#line 101
time =
                  /* template:place-check { */((jgfutil.JGFTimer) x10.lang.Runtime.hereCheck(((jgfutil.
                                                                                                JGFTimer)
                                                                                                /* template:place-check { */((java.util.Hashtable) x10.lang.Runtime.hereCheck(timers))/* } */.get(name))))/* } */.time;
            } else {
                
//#line 104
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println("JGFInstrumentor.readTimer: failed -  timer " +
                                                                                                                                  name +
                                                                                                                                  " does not exist");
                
//#line 106
time =
                  0.0;
            }
            
//#line 108
return time;
        }
        	} finally {
        		x10.lang.Runtime.here().notifyAll();
        	}
        }/* } */
    }
    
    
//#line 111
public static void
                   resetTimer(
                   java.
                     lang.
                     String name) {
        
//#line 111
/* template:Atomic { */
        synchronized (x10.lang.Runtime.here()) {
        	try {
        		{
            
//#line 112
if (/* template:place-check { */((java.util.Hashtable) x10.lang.Runtime.hereCheck(timers))/* } */.containsKey(name)) {
                
//#line 113
/* template:place-check { */((jgfutil.JGFTimer) x10.lang.Runtime.hereCheck(((jgfutil.
                                                                                                           JGFTimer)
                                                                                                           /* template:place-check { */((java.util.Hashtable) x10.lang.Runtime.hereCheck(timers))/* } */.get(name))))/* } */.reset();
            } else {
                
//#line 116
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println("JGFInstrumentor.resetTimer: failed -  timer " +
                                                                                                                                  name +
                                                                                                                                  " does not exist");
            }
        }
        	} finally {
        		x10.lang.Runtime.here().notifyAll();
        	}
        }/* } */
    }
    
    
//#line 121
public static void
                   printTimer(
                   java.
                     lang.
                     String name) {
        
//#line 121
/* template:Atomic { */
        synchronized (x10.lang.Runtime.here()) {
        	try {
        		{
            
//#line 122
if (/* template:place-check { */((java.util.Hashtable) x10.lang.Runtime.hereCheck(timers))/* } */.containsKey(name)) {
                
//#line 123
/* template:place-check { */((jgfutil.JGFTimer) x10.lang.Runtime.hereCheck(((jgfutil.
                                                                                                           JGFTimer)
                                                                                                           /* template:place-check { */((java.util.Hashtable) x10.lang.Runtime.hereCheck(timers))/* } */.get(name))))/* } */.print();
            } else {
                
//#line 126
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println("JGFInstrumentor.printTimer: failed -  timer " +
                                                                                                                                  name +
                                                                                                                                  " does not exist");
            }
        }
        	} finally {
        		x10.lang.Runtime.here().notifyAll();
        	}
        }/* } */
    }
    
    
//#line 131
public static void
                   printperfTimer(
                   java.
                     lang.
                     String name) {
        
//#line 131
/* template:Atomic { */
        synchronized (x10.lang.Runtime.here()) {
        	try {
        		{
            
//#line 132
if (/* template:place-check { */((java.util.Hashtable) x10.lang.Runtime.hereCheck(timers))/* } */.containsKey(name)) {
                
//#line 133
/* template:place-check { */((jgfutil.JGFTimer) x10.lang.Runtime.hereCheck(((jgfutil.
                                                                                                           JGFTimer)
                                                                                                           /* template:place-check { */((java.util.Hashtable) x10.lang.Runtime.hereCheck(timers))/* } */.get(name))))/* } */.printperf();
            } else {
                
//#line 136
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println("JGFInstrumentor.printTimer: failed -  timer " +
                                                                                                                                  name +
                                                                                                                                  " does not exist");
            }
        }
        	} finally {
        		x10.lang.Runtime.here().notifyAll();
        	}
        }/* } */
    }
    
    
//#line 141
public static void
                   storeData(
                   java.
                     lang.
                     String name,
                   x10.
                     lang.
                     Object obj) {
        
//#line 141
/* template:Atomic { */
        synchronized (x10.lang.Runtime.here()) {
        	try {
        		{
            
//#line 142
/* template:place-check { */((java.util.Hashtable) x10.lang.Runtime.hereCheck(data))/* } */.put(name,
                                                                                                                         obj);
        }
        	} finally {
        		x10.lang.Runtime.here().notifyAll();
        	}
        }/* } */
    }
    
    
//#line 145
public static void
                   retrieveData(
                   java.
                     lang.
                     String name,
                   x10.
                     lang.
                     Object obj) {
        
//#line 145
/* template:Atomic { */
        synchronized (x10.lang.Runtime.here()) {
        	try {
        		{
            
//#line 146
obj =
              (x10.
                lang.
                Object)
                /* template:place-check { */((java.util.Hashtable) x10.lang.Runtime.hereCheck(data))/* } */.get(name);
        }
        	} finally {
        		x10.lang.Runtime.here().notifyAll();
        	}
        }/* } */
    }
    
    
//#line 149
public static void
                   printHeader(
                   int section,
                   int size) {
        
//#line 149
/* template:Atomic { */
        synchronized (x10.lang.Runtime.here()) {
        	try {
        		{
            
//#line 150
printHeader(
                           section,
                           size,
                           1);
        }
        	} finally {
        		x10.lang.Runtime.here().notifyAll();
        	}
        }/* } */
    }
    
    
//#line 153
public static void
                   printHeader(
                   int section,
                   int size,
                   int nthreads) {
        
//#line 153
/* template:Atomic { */
        synchronized (x10.lang.Runtime.here()) {
        	try {
        		{
            
//#line 155
java.
              lang.
              String header;
            
//#line 155
java.
              lang.
              String base;
            
//#line 157
header =
              "";
            
//#line 158
base =
              ("Java Grande Forum Thread Benchmark Suite - Version 1.0 - Sec" +
               "tion ");
            
//#line 160
switch (section) {
                
//#line 161
case 1:
                    
//#line 162
header =
                      base +
                      "1";
                    
//#line 163
break;
                
//#line 164
case 2:
                    
//#line 165
switch (size) {
                        
//#line 166
case 0:
                            
//#line 167
header =
                              base +
                              "2 - Size A";
                            
//#line 168
break;
                        
//#line 169
case 1:
                            
//#line 170
header =
                              base +
                              "2 - Size B";
                            
//#line 171
break;
                        
//#line 172
case 2:
                            
//#line 173
header =
                              base +
                              "2 - Size C";
                            
//#line 174
break;
                    }
                    
//#line 176
break;
                
//#line 177
case 3:
                    
//#line 178
switch (size) {
                        
//#line 179
case 0:
                            
//#line 180
header =
                              base +
                              "3 - Size A";
                            
//#line 181
break;
                        
//#line 182
case 1:
                            
//#line 183
header =
                              base +
                              "3 - Size B";
                            
//#line 184
break;
                    }
                    
//#line 186
break;
            }
            
//#line 189
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println(header);
            
//#line 191
if (nthreads ==
                               1) {
                
//#line 192
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println("Executing on " +
                                                                                                                                  nthreads +
                                                                                                                                  " thread");
            } else {
                
//#line 195
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println("Executing on " +
                                                                                                                                  nthreads +
                                                                                                                                  " threads");
            }
            
//#line 198
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("");
        }
        	} finally {
        		x10.lang.Runtime.here().notifyAll();
        	}
        }/* } */
    }
    
    
//#line 22
public JGFInstrumentor() {
        
//#line 22
super();
    }
}
