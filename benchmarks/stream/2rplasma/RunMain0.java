import x10.lang.*;

public class RunMain0
extends x10.
  lang.
  Object
{
    
    
//#line 2
/* template:Main { */
    public static class Main extends x10.runtime.Activity {
    	private final String[] form;
    	public Main(String[] args) {
    		super("Main Activity");
    		this.form = args;
    	}
    	public void runX10Task() {
    		main(form);
    	}
    }
    
    // the original app-main method
    public static void main(java.
      lang.
      String[] args) {
    	if (x10.lang.Runtime.runtime == null) {
    		System.err.println("Please use the 'x10' script to invoke X10 programs, or see the generated");
    		System.err.println("Java code for alternate invocation instructions.");
    		System.exit(128);
    	}
    {
        
//#line 3
Program0.
                     runMain();
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 1
public RunMain0() {
        
//#line 1
super();
    }
}

class Program0
extends x10.
  lang.
  Object
{
    
//#line 9
final public static int
      _Program__Stream_MEG =
      Program0.
        _Program__Stream_MEG_init();
    
//#line 10
final public static double
      _Program__Stream_alpha =
      Program0.
        _Program__Stream_alpha_init();
    
//#line 11
final public static int
      _Program__Stream_NUM_TIMES =
      Program0.
        _Program__Stream_NUM_TIMES_init();
    
//#line 12
final public static int
      _Program__Timer_max_counters =
      Program0.
        _Program__Timer_max_counters_init();
    
//#line 13
final public static long
      _Program__Stream_N0 =
      Program0.
        _Program__Stream_N0_init();
    
//#line 14
final public static long
      _Program__Stream_N =
      Program0.
        _Program__Stream_N_init();
    
//#line 15
final public static int
      _Program__Stream_LocalSize =
      Program0.
        _Program__Stream_LocalSize_init();
    
    
//#line 18
public static void
                  runMain(
                  ) {
        
//#line 19
Program0.
                      Program_runMain();
    }
    
    
//#line 21
public static int
                  _Program__Stream_MEG_init(
                  ) {
        
//#line 23
final int X10_TEMP151 =
          (Program0.
             Program__Stream_MEG_init());
        
//#line 24
return X10_TEMP151;
    }
    
    
//#line 26
public static double
                  _Program__Stream_alpha_init(
                  ) {
        
//#line 28
final double X10_TEMP151 =
          (Program0.
             Program__Stream_alpha_init());
        
//#line 29
return X10_TEMP151;
    }
    
    
//#line 31
public static int
                  _Program__Stream_NUM_TIMES_init(
                  ) {
        
//#line 33
final int X10_TEMP151 =
          (Program0.
             Program__Stream_NUM_TIMES_init());
        
//#line 34
return X10_TEMP151;
    }
    
    
//#line 36
public static int
                  _Program__Timer_max_counters_init(
                  ) {
        
//#line 38
final int X10_TEMP151 =
          (Program0.
             Program__Timer_max_counters_init());
        
//#line 39
return X10_TEMP151;
    }
    
    
//#line 41
public static long
                  _Program__Stream_N0_init(
                  ) {
        
//#line 43
final long X10_TEMP151 =
          (Program0.
             Program__Stream_N0_init());
        
//#line 44
return X10_TEMP151;
    }
    
    
//#line 46
public static long
                  _Program__Stream_N_init(
                  ) {
        
//#line 48
final long X10_TEMP151 =
          (Program0.
             Program__Stream_N_init());
        
//#line 49
return X10_TEMP151;
    }
    
    
//#line 51
public static int
                  _Program__Stream_LocalSize_init(
                  ) {
        
//#line 53
final int X10_TEMP151 =
          (Program0.
             Program__Stream_LocalSize_init());
        
//#line 54
return X10_TEMP151;
    }
    
    
//#line 56
public static void
                  Program_runMain(
                  ) {
        
//#line 57
final Timer X10_TEMP151 =
          (new Timer(
             ));
        
//#line 59
Timer tmr =
          (X10_TEMP151);
        
//#line 60
final int X10_TEMP154 =
          (0);
        
//#line 62
int count =
          (X10_TEMP154);
        
//#line 63
Program0.
                      Program_Timer_start(
                      tmr,
                      count);
        
//#line 64
final Stream X10_TEMP159 =
          (new Stream(
             ));
        
//#line 66
final Stream X10_TEMP4 =
          (X10_TEMP159);
        
//#line 67
Program0.
                      Program_Stream_run(
                      X10_TEMP4);
        
//#line 68
Program0.
                      Program_Timer_stop(
                      tmr,
                      count);
        
//#line 69
final java.
          lang.
          String X10_TEMP165 =
          ("Wall-clock time for stream: ");
        
//#line 71
final java.
          lang.
          String X10_TEMP7 =
          (X10_TEMP165);
        
//#line 72
final double X10_TEMP170 =
          (Program0.
             Program_Timer_readTimer(
             tmr,
             count));
        
//#line 74
final double X10_TEMP8 =
          (X10_TEMP170);
        
//#line 75
final java.
          lang.
          String X10_TEMP173 =
          (X10_TEMP7 +
           X10_TEMP8);
        
//#line 77
final java.
          lang.
          String X10_TEMP9 =
          (X10_TEMP173);
        
//#line 78
final java.
          lang.
          String X10_TEMP176 =
          (" secs");
        
//#line 80
final java.
          lang.
          String X10_TEMP10 =
          (X10_TEMP176);
        
//#line 81
final java.
          lang.
          String X10_TEMP179 =
          (X10_TEMP9 +
           X10_TEMP10);
        
//#line 83
final java.
          lang.
          String X10_TEMP12 =
          (X10_TEMP179);
        
//#line 84
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                    lang.
                                                                                                    System.
                                                                                                    out))/* } */.println(X10_TEMP12);
    }
    
    
//#line 86
public static int
                  Program__Stream_MEG_init(
                  ) {
        
//#line 87
final int X10_TEMP151 =
          (50);
        
//#line 89
final int X10_TEMP1 =
          (X10_TEMP151);
        
//#line 90
final int X10_TEMP154 =
          (50);
        
//#line 92
final int X10_TEMP2 =
          (X10_TEMP154);
        
//#line 93
final int X10_TEMP157 =
          (X10_TEMP1 *
             X10_TEMP2);
        
//#line 95
final int X10_TEMP4 =
          (X10_TEMP157);
        
//#line 96
return X10_TEMP4;
    }
    
    
//#line 98
public static double
                  Program__Stream_alpha_init(
                  ) {
        
//#line 99
final double X10_TEMP151 =
          (3.0);
        
//#line 101
final double X10_TEMP2 =
          (X10_TEMP151);
        
//#line 102
return X10_TEMP2;
    }
    
    
//#line 104
public static int
                   Program__Stream_NUM_TIMES_init(
                   ) {
        
//#line 105
final int X10_TEMP151 =
          (10);
        
//#line 107
final int X10_TEMP2 =
          (X10_TEMP151);
        
//#line 108
return X10_TEMP2;
    }
    
    
//#line 110
public static long
                   Program__Stream_N0_init(
                   ) {
        
//#line 111
final int X10_TEMP151 =
          (2);
        
//#line 113
final int X10_TEMP1 =
          (X10_TEMP151);
        
//#line 114
final int X10_TEMP154 =
          (X10_TEMP1 *
             _Program__Stream_MEG);
        
//#line 116
final long X10_TEMP3 =
          (X10_TEMP154);
        
//#line 117
return X10_TEMP3;
    }
    
    
//#line 119
public static long
                   Program__Stream_N_init(
                   ) {
        
//#line 120
final int X10_TEMP151 =
          (x10.
             lang.
             place.
             MAX_PLACES);
        
//#line 122
final int X10_TEMP1 =
          (X10_TEMP151);
        
//#line 123
final long X10_TEMP154 =
          (_Program__Stream_N0 *
             X10_TEMP1);
        
//#line 125
final long X10_TEMP3 =
          (X10_TEMP154);
        
//#line 126
return X10_TEMP3;
    }
    
    
//#line 128
public static int
                   Program__Stream_LocalSize_init(
                   ) {
        
//#line 129
final int X10_TEMP151 =
          ((int)
             _Program__Stream_N0);
        
//#line 131
final int X10_TEMP2 =
          (X10_TEMP151);
        
//#line 132
return X10_TEMP2;
    }
    
    
//#line 134
public static void
                   Program_Stream_run(
                   final Stream X10_TEMP0) {
        
//#line 135
final java.
          lang.
          String X10_TEMP151 =
          ("LocalSize=");
        
//#line 137
final java.
          lang.
          String X10_TEMP1 =
          (X10_TEMP151);
        
//#line 138
final java.
          lang.
          String X10_TEMP154 =
          (X10_TEMP1 +
           _Program__Stream_LocalSize);
        
//#line 140
final java.
          lang.
          String X10_TEMP3 =
          (X10_TEMP154);
        
//#line 141
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println(X10_TEMP3);
        
//#line 142
final StreamData X10_TEMP158 =
          (/* template:place-check { */((Stream) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.sd);
        
//#line 144
final StreamData tempSd =
          (X10_TEMP158);
        
//#line 145
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 146
final int X10_TEMP161 =
              (0);
            
//#line 148
final int X10_TEMP10 =
              (X10_TEMP161);
            
//#line 149
final int X10_TEMP164 =
              (1);
            
//#line 151
final int X10_TEMP6 =
              (X10_TEMP164);
            
//#line 152
final int X10_TEMP167 =
              (_Program__Stream_NUM_TIMES -
                 X10_TEMP6);
            
//#line 154
final int X10_TEMP8 =
              (X10_TEMP167);
            
//#line 155
final int X10_TEMP170 =
              ((int)
                 X10_TEMP8);
            
//#line 157
final int X10_TEMP11 =
              (X10_TEMP170);
            
//#line 158
final x10.
              lang.
              region X10_TEMP175 =
              (x10.
                lang.
                region)
                ((x10.
                    lang.
                    region.
                    factory.
                    region(
                    x10.
                      lang.
                      region.
                      factory.
                      region(
                      X10_TEMP10,
                      X10_TEMP11))));
            
//#line 160
x10.
              lang.
              region r =
              (x10.
                lang.
                region)
                ((X10_TEMP175));
            
//#line 161
/* template:forloop { */
            for (java.util.Iterator p1__ = (r).iterator(); p1__.hasNext(); ) {
            	final  x10.
              lang.
              point p1 = (x10.
              lang.
              point) p1__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 162
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 163
final x10.
                      lang.
                      dist X10_TEMP179 =
                      (x10.
                        lang.
                        dist)
                        ((x10.
                            lang.
                            dist.
                            UNIQUE));
                    
//#line 165
final x10.
                      lang.
                      dist X10_TEMP15 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP179));
                    
//#line 166
/* template:forloop { */
                    for (java.util.Iterator p6__ = (X10_TEMP15.
                                                      region).iterator(); p6__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point p6 = (x10.
                      lang.
                      point) p6__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 167
final x10.
                          lang.
                          place X10_TEMP16 =
                          (X10_TEMP15.
                             get(
                             p6));
                        
//#line 168
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP16)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 169
final x10.
                              lang.
                              dist X10_TEMP186 =
                              (x10.
                                lang.
                                dist)
                                ((tempSd.
                                    D));
                            
//#line 171
final x10.
                              lang.
                              dist X10_TEMP18 =
                              (x10.
                                lang.
                                dist)
                                ((X10_TEMP186));
                            
//#line 172
final x10.
                              lang.
                              place X10_TEMP189 =
                              (/* template:here { */x10.lang.Runtime.here()/* } */);
                            
//#line 174
final x10.
                              lang.
                              place X10_TEMP19 =
                              (X10_TEMP189);
                            
//#line 175
final x10.
                              lang.
                              dist X10_TEMP192 =
                              (x10.
                                lang.
                                dist)
                                ((X10_TEMP18.
                                    restriction(
                                    X10_TEMP19)));
                            
//#line 177
final x10.
                              lang.
                              dist X10_TEMP21 =
                              (x10.
                                lang.
                                dist)
                                ((X10_TEMP192));
                            
//#line 178
/* template:forloop-mult { */{
                            x10.lang.region __var3__ = (x10.lang.region) X10_TEMP21.
                                                                           region;
                            if (__var3__.size() > 0 && (__var3__ instanceof x10.array.MultiDimRegion || __var3__ instanceof x10.array.ContiguousRange)) {
                            	/* Loop: { *//* template:forloop-mult-each { */
                            for (int __var4__ = __var3__.rank(0).low(), __var5__ = __var3__.rank(0).high(); __var4__ <= __var5__; __var4__++)
                            /* } */
                            /* } */ {
                            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                            final int i = __var4__;
                            /* } */
                            /* } */
{
                                
//#line 179
final x10.
                                  lang.
                                  DoubleReferenceArray X10_TEMP196 =
                                  (x10.
                                    lang.
                                    DoubleReferenceArray)
                                    ((tempSd.
                                        b));
                                
//#line 181
final x10.
                                  lang.
                                  DoubleReferenceArray X10_TEMP22 =
                                  (x10.
                                    lang.
                                    DoubleReferenceArray)
                                    ((X10_TEMP196));
                                
//#line 182
final double X10_TEMP199 =
                                  (1.5);
                                
//#line 184
final double X10_TEMP29 =
                                  (X10_TEMP199);
                                
//#line 185
final x10.
                                  lang.
                                  place X10_TEMP202 =
                                  (/* template:here { */x10.lang.Runtime.here()/* } */);
                                
//#line 187
final x10.
                                  lang.
                                  place X10_TEMP24 =
                                  (X10_TEMP202);
                                
//#line 188
final int X10_TEMP205 =
                                  (X10_TEMP24.
                                     id);
                                
//#line 190
final int X10_TEMP25 =
                                  (X10_TEMP205);
                                
//#line 191
final int X10_TEMP208 =
                                  (X10_TEMP25 *
                                     _Program__Stream_LocalSize);
                                
//#line 193
final int X10_TEMP26 =
                                  (X10_TEMP208);
                                
//#line 194
final int X10_TEMP211 =
                                  (X10_TEMP26 +
                                     i);
                                
//#line 196
final int X10_TEMP28 =
                                  (X10_TEMP211);
                                
//#line 197
final double X10_TEMP214 =
                                  (X10_TEMP29 *
                                     X10_TEMP28);
                                
//#line 199
final double X10_TEMP32 =
                                  (X10_TEMP214);
                                
//#line 200
final double X10_TEMP217 =
                                  (X10_TEMP32);
                                
//#line 202
final double X10_TEMP33 =
                                  (X10_TEMP217);
                                
//#line 203
final double X10_TEMP221 =
                                  (X10_TEMP33);
                                
//#line 205
final double X10_TEMP224 =
                                  (X10_TEMP221);
                                
//#line 206
/* template:array_set { */(X10_TEMP22).set((X10_TEMP224),i)/* } */;
                                
//#line 207
final x10.
                                  lang.
                                  DoubleReferenceArray X10_TEMP226 =
                                  (x10.
                                    lang.
                                    DoubleReferenceArray)
                                    ((tempSd.
                                        c));
                                
//#line 209
final x10.
                                  lang.
                                  DoubleReferenceArray X10_TEMP34 =
                                  (x10.
                                    lang.
                                    DoubleReferenceArray)
                                    ((X10_TEMP226));
                                
//#line 210
final double X10_TEMP229 =
                                  (2.5);
                                
//#line 212
final double X10_TEMP41 =
                                  (X10_TEMP229);
                                
//#line 213
final x10.
                                  lang.
                                  place X10_TEMP232 =
                                  (/* template:here { */x10.lang.Runtime.here()/* } */);
                                
//#line 215
final x10.
                                  lang.
                                  place X10_TEMP36 =
                                  (X10_TEMP232);
                                
//#line 216
final int X10_TEMP235 =
                                  (X10_TEMP36.
                                     id);
                                
//#line 218
final int X10_TEMP37 =
                                  (X10_TEMP235);
                                
//#line 219
final int X10_TEMP238 =
                                  (X10_TEMP37 *
                                     _Program__Stream_LocalSize);
                                
//#line 221
final int X10_TEMP38 =
                                  (X10_TEMP238);
                                
//#line 222
final int X10_TEMP241 =
                                  (X10_TEMP38 +
                                     i);
                                
//#line 224
final int X10_TEMP40 =
                                  (X10_TEMP241);
                                
//#line 225
final double X10_TEMP244 =
                                  (X10_TEMP41 *
                                     X10_TEMP40);
                                
//#line 227
final double X10_TEMP44 =
                                  (X10_TEMP244);
                                
//#line 228
final double X10_TEMP247 =
                                  (X10_TEMP44);
                                
//#line 230
final double X10_TEMP45 =
                                  (X10_TEMP247);
                                
//#line 231
final double X10_TEMP251 =
                                  (X10_TEMP45);
                                
//#line 233
final double X10_TEMP254 =
                                  (X10_TEMP251);
                                
//#line 234
/* template:array_set { */(X10_TEMP34).set((X10_TEMP254),i)/* } */;
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var0____ = (__var3__).iterator(); __var0____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var0__ = (x10.
                              lang.
                              point) __var0____.next();
                            	/* Join: { *//* Join: { */final int i =
                              /* template:array_get { */((__var0__).get(0))/* } */;/* } */
{
                                
//#line 179
final x10.
                                  lang.
                                  DoubleReferenceArray X10_TEMP196 =
                                  (x10.
                                    lang.
                                    DoubleReferenceArray)
                                    ((tempSd.
                                        b));
                                
//#line 181
final x10.
                                  lang.
                                  DoubleReferenceArray X10_TEMP22 =
                                  (x10.
                                    lang.
                                    DoubleReferenceArray)
                                    ((X10_TEMP196));
                                
//#line 182
final double X10_TEMP199 =
                                  (1.5);
                                
//#line 184
final double X10_TEMP29 =
                                  (X10_TEMP199);
                                
//#line 185
final x10.
                                  lang.
                                  place X10_TEMP202 =
                                  (/* template:here { */x10.lang.Runtime.here()/* } */);
                                
//#line 187
final x10.
                                  lang.
                                  place X10_TEMP24 =
                                  (X10_TEMP202);
                                
//#line 188
final int X10_TEMP205 =
                                  (X10_TEMP24.
                                     id);
                                
//#line 190
final int X10_TEMP25 =
                                  (X10_TEMP205);
                                
//#line 191
final int X10_TEMP208 =
                                  (X10_TEMP25 *
                                     _Program__Stream_LocalSize);
                                
//#line 193
final int X10_TEMP26 =
                                  (X10_TEMP208);
                                
//#line 194
final int X10_TEMP211 =
                                  (X10_TEMP26 +
                                     i);
                                
//#line 196
final int X10_TEMP28 =
                                  (X10_TEMP211);
                                
//#line 197
final double X10_TEMP214 =
                                  (X10_TEMP29 *
                                     X10_TEMP28);
                                
//#line 199
final double X10_TEMP32 =
                                  (X10_TEMP214);
                                
//#line 200
final double X10_TEMP217 =
                                  (X10_TEMP32);
                                
//#line 202
final double X10_TEMP33 =
                                  (X10_TEMP217);
                                
//#line 203
final double X10_TEMP221 =
                                  (X10_TEMP33);
                                
//#line 205
final double X10_TEMP224 =
                                  (X10_TEMP221);
                                
//#line 206
/* template:array_set { */(X10_TEMP22).set((X10_TEMP224),i)/* } */;
                                
//#line 207
final x10.
                                  lang.
                                  DoubleReferenceArray X10_TEMP226 =
                                  (x10.
                                    lang.
                                    DoubleReferenceArray)
                                    ((tempSd.
                                        c));
                                
//#line 209
final x10.
                                  lang.
                                  DoubleReferenceArray X10_TEMP34 =
                                  (x10.
                                    lang.
                                    DoubleReferenceArray)
                                    ((X10_TEMP226));
                                
//#line 210
final double X10_TEMP229 =
                                  (2.5);
                                
//#line 212
final double X10_TEMP41 =
                                  (X10_TEMP229);
                                
//#line 213
final x10.
                                  lang.
                                  place X10_TEMP232 =
                                  (/* template:here { */x10.lang.Runtime.here()/* } */);
                                
//#line 215
final x10.
                                  lang.
                                  place X10_TEMP36 =
                                  (X10_TEMP232);
                                
//#line 216
final int X10_TEMP235 =
                                  (X10_TEMP36.
                                     id);
                                
//#line 218
final int X10_TEMP37 =
                                  (X10_TEMP235);
                                
//#line 219
final int X10_TEMP238 =
                                  (X10_TEMP37 *
                                     _Program__Stream_LocalSize);
                                
//#line 221
final int X10_TEMP38 =
                                  (X10_TEMP238);
                                
//#line 222
final int X10_TEMP241 =
                                  (X10_TEMP38 +
                                     i);
                                
//#line 224
final int X10_TEMP40 =
                                  (X10_TEMP241);
                                
//#line 225
final double X10_TEMP244 =
                                  (X10_TEMP41 *
                                     X10_TEMP40);
                                
//#line 227
final double X10_TEMP44 =
                                  (X10_TEMP244);
                                
//#line 228
final double X10_TEMP247 =
                                  (X10_TEMP44);
                                
//#line 230
final double X10_TEMP45 =
                                  (X10_TEMP247);
                                
//#line 231
final double X10_TEMP251 =
                                  (X10_TEMP45);
                                
//#line 233
final double X10_TEMP254 =
                                  (X10_TEMP251);
                                
//#line 234
/* template:array_set { */(X10_TEMP34).set((X10_TEMP254),i)/* } */;
                            }/* } */
                            }
                            /* } */
                            
                            }
                            }
                            /* } */
                            
                            
//#line 236
final x10.
                              lang.
                              dist X10_TEMP256 =
                              (x10.
                                lang.
                                dist)
                                ((x10.
                                    lang.
                                    dist.
                                    UNIQUE));
                            
//#line 238
final x10.
                              lang.
                              dist X10_TEMP46 =
                              (x10.
                                lang.
                                dist)
                                ((X10_TEMP256));
                            
//#line 239
final x10.
                              lang.
                              place X10_TEMP260 =
                              (X10_TEMP46.
                                 get(
                                 p6));
                            
//#line 241
final x10.
                              lang.
                              place X10_TEMP48 =
                              (X10_TEMP260);
                            
//#line 242
final x10.
                              lang.
                              place X10_TEMP263 =
                              (x10.
                                 lang.
                                 place.
                                 FIRST_PLACE);
                            
//#line 244
final x10.
                              lang.
                              place X10_TEMP49 =
                              (X10_TEMP263);
                            
//#line 245
final boolean X10_TEMP51 =
                              (/* template:equalsequals { */x10.lang.Runtime.equalsequals(X10_TEMP48,X10_TEMP49)/* } */);
                            
//#line 246
if (X10_TEMP51) {
                                
//#line 247
final x10.
                                  lang.
                                  DoubleReferenceArray X10_TEMP268 =
                                  (x10.
                                    lang.
                                    DoubleReferenceArray)
                                    ((tempSd.
                                        times));
                                
//#line 249
final x10.
                                  lang.
                                  DoubleReferenceArray X10_TEMP52 =
                                  (x10.
                                    lang.
                                    DoubleReferenceArray)
                                    ((X10_TEMP268));
                                
//#line 250
final double X10_TEMP271 =
                                  (Program0.
                                     Program_Stream_mySecond());
                                
//#line 252
final double X10_TEMP54 =
                                  (X10_TEMP271);
                                
//#line 253
final int X10_TEMP55 =
                                  (0);
                                
//#line 254
final double X10_TEMP275 =
                                  (X10_TEMP55 -
                                     X10_TEMP54);
                                
//#line 256
final double X10_TEMP58 =
                                  (X10_TEMP275);
                                
//#line 257
final double X10_TEMP278 =
                                  (X10_TEMP58);
                                
//#line 259
final double X10_TEMP59 =
                                  (X10_TEMP278);
                                
//#line 260
final double X10_TEMP282 =
                                  (X10_TEMP59);
                                
//#line 262
final double X10_TEMP285 =
                                  (X10_TEMP282);
                                
//#line 263
/* template:array_set { */(X10_TEMP52).set((X10_TEMP285),p1)/* } */;
                            }
                            
//#line 265
final x10.
                              lang.
                              dist X10_TEMP287 =
                              (x10.
                                lang.
                                dist)
                                ((tempSd.
                                    D));
                            
//#line 267
final x10.
                              lang.
                              dist X10_TEMP61 =
                              (x10.
                                lang.
                                dist)
                                ((X10_TEMP287));
                            
//#line 268
final x10.
                              lang.
                              place X10_TEMP290 =
                              (/* template:here { */x10.lang.Runtime.here()/* } */);
                            
//#line 270
final x10.
                              lang.
                              place X10_TEMP62 =
                              (X10_TEMP290);
                            
//#line 271
final x10.
                              lang.
                              dist X10_TEMP293 =
                              (x10.
                                lang.
                                dist)
                                ((X10_TEMP61.
                                    restriction(
                                    X10_TEMP62)));
                            
//#line 273
final x10.
                              lang.
                              dist X10_TEMP64 =
                              (x10.
                                lang.
                                dist)
                                ((X10_TEMP293));
                            
//#line 274
/* template:forloop { */
                            for (java.util.Iterator p4__ = (X10_TEMP64.
                                                              region).iterator(); p4__.hasNext(); ) {
                            	final  x10.
                              lang.
                              point p4 = (x10.
                              lang.
                              point) p4__.next();
                            	/* Join: { *//* Join: { *//* } */
{
                                
//#line 275
final x10.
                                  lang.
                                  DoubleReferenceArray X10_TEMP297 =
                                  (x10.
                                    lang.
                                    DoubleReferenceArray)
                                    ((tempSd.
                                        a));
                                
//#line 277
final x10.
                                  lang.
                                  DoubleReferenceArray X10_TEMP65 =
                                  (x10.
                                    lang.
                                    DoubleReferenceArray)
                                    ((X10_TEMP297));
                                
//#line 278
final x10.
                                  lang.
                                  DoubleReferenceArray X10_TEMP300 =
                                  (x10.
                                    lang.
                                    DoubleReferenceArray)
                                    ((tempSd.
                                        b));
                                
//#line 280
final x10.
                                  lang.
                                  DoubleReferenceArray X10_TEMP67 =
                                  (x10.
                                    lang.
                                    DoubleReferenceArray)
                                    ((X10_TEMP300));
                                
//#line 281
final double X10_TEMP304 =
                                  (/* template:array_get { */((X10_TEMP67).get(p4))/* } */);
                                
//#line 283
final double X10_TEMP72 =
                                  (X10_TEMP304);
                                
//#line 284
final x10.
                                  lang.
                                  DoubleReferenceArray X10_TEMP307 =
                                  (x10.
                                    lang.
                                    DoubleReferenceArray)
                                    ((tempSd.
                                        c));
                                
//#line 286
final x10.
                                  lang.
                                  DoubleReferenceArray X10_TEMP69 =
                                  (x10.
                                    lang.
                                    DoubleReferenceArray)
                                    ((X10_TEMP307));
                                
//#line 287
final double X10_TEMP311 =
                                  (/* template:array_get { */((X10_TEMP69).get(p4))/* } */);
                                
//#line 289
final double X10_TEMP71 =
                                  (X10_TEMP311);
                                
//#line 290
final double X10_TEMP314 =
                                  (_Program__Stream_alpha *
                                     X10_TEMP71);
                                
//#line 292
final double X10_TEMP73 =
                                  (X10_TEMP314);
                                
//#line 293
final double X10_TEMP317 =
                                  (X10_TEMP72 +
                                     X10_TEMP73);
                                
//#line 295
final double X10_TEMP76 =
                                  (X10_TEMP317);
                                
//#line 296
final double X10_TEMP320 =
                                  (X10_TEMP76);
                                
//#line 298
final double X10_TEMP77 =
                                  (X10_TEMP320);
                                
//#line 299
final double X10_TEMP324 =
                                  (X10_TEMP77);
                                
//#line 301
final double X10_TEMP327 =
                                  (X10_TEMP324);
                                
//#line 302
/* template:array_set { */(X10_TEMP65).set((X10_TEMP327),p4)/* } */;
                            }/* } */
                            }
                            /* } */
                            
                        }
                        		}
                        	});/* } */
                    }/* } */
                    }
                    /* } */
                    
                }
                	} catch (Throwable tmp2) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp2);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 307
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 308
final x10.
                      lang.
                      dist X10_TEMP329 =
                      (x10.
                        lang.
                        dist)
                        ((x10.
                            lang.
                            dist.
                            UNIQUE));
                    
//#line 310
final x10.
                      lang.
                      dist X10_TEMP79 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP329));
                    
//#line 311
/* template:forloop { */
                    for (java.util.Iterator p5__ = (X10_TEMP79.
                                                      region).iterator(); p5__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point p5 = (x10.
                      lang.
                      point) p5__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 312
final x10.
                          lang.
                          place X10_TEMP80 =
                          (X10_TEMP79.
                             get(
                             p5));
                        
//#line 313
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP80)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 314
final x10.
                              lang.
                              dist X10_TEMP336 =
                              (x10.
                                lang.
                                dist)
                                ((x10.
                                    lang.
                                    dist.
                                    UNIQUE));
                            
//#line 316
final x10.
                              lang.
                              dist X10_TEMP81 =
                              (x10.
                                lang.
                                dist)
                                ((X10_TEMP336));
                            
//#line 317
final x10.
                              lang.
                              place X10_TEMP340 =
                              (X10_TEMP81.
                                 get(
                                 p5));
                            
//#line 319
final x10.
                              lang.
                              place X10_TEMP83 =
                              (X10_TEMP340);
                            
//#line 320
final x10.
                              lang.
                              place X10_TEMP343 =
                              (x10.
                                 lang.
                                 place.
                                 FIRST_PLACE);
                            
//#line 322
final x10.
                              lang.
                              place X10_TEMP84 =
                              (X10_TEMP343);
                            
//#line 323
final boolean X10_TEMP86 =
                              (/* template:equalsequals { */x10.lang.Runtime.equalsequals(X10_TEMP83,X10_TEMP84)/* } */);
                            
//#line 324
if (X10_TEMP86) {
                                
//#line 325
final x10.
                                  lang.
                                  DoubleReferenceArray X10_TEMP348 =
                                  (x10.
                                    lang.
                                    DoubleReferenceArray)
                                    ((tempSd.
                                        times));
                                
//#line 327
final x10.
                                  lang.
                                  DoubleReferenceArray X10_TEMP87 =
                                  (x10.
                                    lang.
                                    DoubleReferenceArray)
                                    ((X10_TEMP348));
                                
//#line 328
final double X10_TEMP352 =
                                  (/* template:array_get { */((X10_TEMP87).get(p1))/* } */);
                                
//#line 330
final double X10_TEMP90 =
                                  (X10_TEMP352);
                                
//#line 331
final double X10_TEMP355 =
                                  (Program0.
                                     Program_Stream_mySecond());
                                
//#line 333
final double X10_TEMP91 =
                                  (X10_TEMP355);
                                
//#line 334
final double X10_TEMP358 =
                                  (X10_TEMP90 +
                                     X10_TEMP91);
                                
//#line 336
final double X10_TEMP92 =
                                  (X10_TEMP358);
                                
//#line 337
final double X10_TEMP362 =
                                  (X10_TEMP92);
                                
//#line 339
final double X10_TEMP365 =
                                  (X10_TEMP362);
                                
//#line 340
/* template:array_set { */(X10_TEMP87).set((X10_TEMP365),p1)/* } */;
                            }
                        }
                        		}
                        	});/* } */
                    }/* } */
                    }
                    /* } */
                    
                }
                	} catch (Throwable tmp6) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp6);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
            }/* } */
            }
            /* } */
            
            
//#line 346
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 347
final x10.
                  lang.
                  dist X10_TEMP367 =
                  (x10.
                    lang.
                    dist)
                    ((x10.
                        lang.
                        dist.
                        UNIQUE));
                
//#line 349
final x10.
                  lang.
                  dist X10_TEMP94 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP367));
                
//#line 350
/* template:forloop { */
                for (java.util.Iterator p2__ = (X10_TEMP94.
                                                  region).iterator(); p2__.hasNext(); ) {
                	final  x10.
                  lang.
                  point p2 = (x10.
                  lang.
                  point) p2__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 351
final x10.
                      lang.
                      place X10_TEMP95 =
                      (X10_TEMP94.
                         get(
                         p2));
                    
//#line 352
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP95)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 353
final x10.
                          lang.
                          dist X10_TEMP374 =
                          (x10.
                            lang.
                            dist)
                            ((tempSd.
                                D));
                        
//#line 355
final x10.
                          lang.
                          dist X10_TEMP97 =
                          (x10.
                            lang.
                            dist)
                            ((X10_TEMP374));
                        
//#line 356
final x10.
                          lang.
                          place X10_TEMP377 =
                          (/* template:here { */x10.lang.Runtime.here()/* } */);
                        
//#line 358
final x10.
                          lang.
                          place X10_TEMP98 =
                          (X10_TEMP377);
                        
//#line 359
final x10.
                          lang.
                          dist X10_TEMP380 =
                          (x10.
                            lang.
                            dist)
                            ((X10_TEMP97.
                                restriction(
                                X10_TEMP98)));
                        
//#line 361
final x10.
                          lang.
                          dist X10_TEMP100 =
                          (x10.
                            lang.
                            dist)
                            ((X10_TEMP380));
                        
//#line 362
/* template:forloop { */
                        for (java.util.Iterator p3__ = (X10_TEMP100.
                                                          region).iterator(); p3__.hasNext(); ) {
                        	final  x10.
                          lang.
                          point p3 = (x10.
                          lang.
                          point) p3__.next();
                        	/* Join: { *//* Join: { *//* } */
{
                            
//#line 363
final x10.
                              lang.
                              DoubleReferenceArray X10_TEMP384 =
                              (x10.
                                lang.
                                DoubleReferenceArray)
                                ((tempSd.
                                    a));
                            
//#line 365
final x10.
                              lang.
                              DoubleReferenceArray X10_TEMP101 =
                              (x10.
                                lang.
                                DoubleReferenceArray)
                                ((X10_TEMP384));
                            
//#line 366
final double X10_TEMP388 =
                              (/* template:array_get { */((X10_TEMP101).get(p3))/* } */);
                            
//#line 368
final double X10_TEMP110 =
                              (X10_TEMP388);
                            
//#line 369
final x10.
                              lang.
                              DoubleReferenceArray X10_TEMP391 =
                              (x10.
                                lang.
                                DoubleReferenceArray)
                                ((tempSd.
                                    b));
                            
//#line 371
final x10.
                              lang.
                              DoubleReferenceArray X10_TEMP103 =
                              (x10.
                                lang.
                                DoubleReferenceArray)
                                ((X10_TEMP391));
                            
//#line 372
final double X10_TEMP395 =
                              (/* template:array_get { */((X10_TEMP103).get(p3))/* } */);
                            
//#line 374
final double X10_TEMP108 =
                              (X10_TEMP395);
                            
//#line 375
final x10.
                              lang.
                              DoubleReferenceArray X10_TEMP398 =
                              (x10.
                                lang.
                                DoubleReferenceArray)
                                ((tempSd.
                                    c));
                            
//#line 377
final x10.
                              lang.
                              DoubleReferenceArray X10_TEMP105 =
                              (x10.
                                lang.
                                DoubleReferenceArray)
                                ((X10_TEMP398));
                            
//#line 378
final double X10_TEMP402 =
                              (/* template:array_get { */((X10_TEMP105).get(p3))/* } */);
                            
//#line 380
final double X10_TEMP107 =
                              (X10_TEMP402);
                            
//#line 381
final double X10_TEMP405 =
                              (_Program__Stream_alpha *
                                 X10_TEMP107);
                            
//#line 383
final double X10_TEMP109 =
                              (X10_TEMP405);
                            
//#line 384
final double X10_TEMP408 =
                              (X10_TEMP108 +
                                 X10_TEMP109);
                            
//#line 386
final double X10_TEMP111 =
                              (X10_TEMP408);
                            
//#line 387
final boolean X10_TEMP113 =
                              (X10_TEMP110 !=
                                 X10_TEMP111);
                            
//#line 388
if (X10_TEMP113) {
                                
//#line 389
final x10.
                                  lang.
                                  place X10_TEMP115 =
                                  (x10.
                                     lang.
                                     place.
                                     FIRST_PLACE);
                                
//#line 390
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP115)).runAsync
                                	(new x10.runtime.Activity() {
                                		public void runX10Task() {
                                			{
                                    
//#line 391
final x10.
                                      lang.
                                      BooleanReferenceArray X10_TEMP415 =
                                      (x10.
                                        lang.
                                        BooleanReferenceArray)
                                        ((tempSd.
                                            verified));
                                    
//#line 393
final x10.
                                      lang.
                                      BooleanReferenceArray X10_TEMP116 =
                                      (x10.
                                        lang.
                                        BooleanReferenceArray)
                                        ((X10_TEMP415));
                                    
//#line 394
final int X10_TEMP418 =
                                      (0);
                                    
//#line 396
final int X10_TEMP118 =
                                      (X10_TEMP418);
                                    
//#line 397
final boolean X10_TEMP421 =
                                      (false);
                                    
//#line 399
final boolean X10_TEMP121 =
                                      (X10_TEMP421);
                                    
//#line 400
final boolean X10_TEMP424 =
                                      (X10_TEMP121);
                                    
//#line 402
final boolean X10_TEMP122 =
                                      (X10_TEMP424);
                                    
//#line 403
final boolean X10_TEMP428 =
                                      (X10_TEMP122);
                                    
//#line 405
final boolean X10_TEMP431 =
                                      (X10_TEMP428);
                                    
//#line 406
/* template:array_set { */(X10_TEMP116).set((X10_TEMP431),X10_TEMP118)/* } */;
                                }
                                		}
                                	});/* } */
                            }
                        }/* } */
                        }
                        /* } */
                        
                    }
                    		}
                    	});/* } */
                }/* } */
                }
                /* } */
                
            }
            	} catch (Throwable tmp7) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp7);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp1) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp1);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 414
final long X10_TEMP433 =
          (10000000L);
        
//#line 416
double mini =
          (X10_TEMP433);
        
//#line 417
final int X10_TEMP436 =
          (0);
        
//#line 419
final int X10_TEMP129 =
          (X10_TEMP436);
        
//#line 420
final int X10_TEMP439 =
          (1);
        
//#line 422
final int X10_TEMP125 =
          (X10_TEMP439);
        
//#line 423
final int X10_TEMP442 =
          (_Program__Stream_NUM_TIMES -
             X10_TEMP125);
        
//#line 425
final int X10_TEMP127 =
          (X10_TEMP442);
        
//#line 426
final int X10_TEMP445 =
          ((int)
             X10_TEMP127);
        
//#line 428
final int X10_TEMP130 =
          (X10_TEMP445);
        
//#line 429
final x10.
          lang.
          region X10_TEMP450 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP129,
                  X10_TEMP130))));
        
//#line 431
x10.
          lang.
          region r =
          (x10.
            lang.
            region)
            ((X10_TEMP450));
        
//#line 432
/* template:forloop { */
        for (java.util.Iterator p1__ = (r).iterator(); p1__.hasNext(); ) {
        	final  x10.
          lang.
          point p1 = (x10.
          lang.
          point) p1__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 433
final x10.
              lang.
              DoubleReferenceArray X10_TEMP454 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((tempSd.
                    times));
            
//#line 435
final x10.
              lang.
              DoubleReferenceArray X10_TEMP133 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP454));
            
//#line 436
final double X10_TEMP458 =
              (/* template:array_get { */((X10_TEMP133).get(p1))/* } */);
            
//#line 438
final double X10_TEMP135 =
              (X10_TEMP458);
            
//#line 439
final boolean X10_TEMP137 =
              (X10_TEMP135 <
                 mini);
            
//#line 440
if (X10_TEMP137) {
                
//#line 441
final x10.
                  lang.
                  DoubleReferenceArray X10_TEMP463 =
                  (x10.
                    lang.
                    DoubleReferenceArray)
                    ((tempSd.
                        times));
                
//#line 443
final x10.
                  lang.
                  DoubleReferenceArray X10_TEMP138 =
                  (x10.
                    lang.
                    DoubleReferenceArray)
                    ((X10_TEMP463));
                
//#line 444
final double X10_TEMP467 =
                  (/* template:array_get { */((X10_TEMP138).get(p1))/* } */);
                
//#line 446
final double X10_TEMP141 =
                  (X10_TEMP467);
                
//#line 447
final double X10_TEMP470 =
                  (X10_TEMP141);
                
//#line 449
mini =
                  ((X10_TEMP470));
            }
        }/* } */
        }
        /* } */
        
        
//#line 452
final x10.
          lang.
          BooleanReferenceArray X10_TEMP473 =
          (x10.
            lang.
            BooleanReferenceArray)
            ((tempSd.
                verified));
        
//#line 454
final x10.
          lang.
          BooleanReferenceArray X10_TEMP144 =
          (x10.
            lang.
            BooleanReferenceArray)
            ((X10_TEMP473));
        
//#line 455
final int X10_TEMP476 =
          (0);
        
//#line 457
final int X10_TEMP146 =
          (X10_TEMP476);
        
//#line 458
final boolean X10_TEMP480 =
          (/* template:array_get { */((X10_TEMP144).get(X10_TEMP146))/* } */);
        
//#line 460
final boolean X10_TEMP148 =
          (X10_TEMP480);
        
//#line 461
Program0.
                       Program_Stream_printStats(
                       _Program__Stream_N,
                       mini,
                       X10_TEMP148);
    }
    
    
//#line 463
public static double
                   Program_Stream_mySecond(
                   ) {
        
//#line 464
final long X10_TEMP151 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 466
final double X10_TEMP1 =
          (X10_TEMP151);
        
//#line 467
final double X10_TEMP154 =
          (1000000.0);
        
//#line 469
final double X10_TEMP2 =
          (X10_TEMP154);
        
//#line 470
final double X10_TEMP157 =
          (X10_TEMP1 *
             X10_TEMP2);
        
//#line 472
final double X10_TEMP3 =
          (X10_TEMP157);
        
//#line 473
final int X10_TEMP160 =
          (1000);
        
//#line 475
final int X10_TEMP4 =
          (X10_TEMP160);
        
//#line 476
final double X10_TEMP163 =
          (X10_TEMP3 /
             X10_TEMP4);
        
//#line 478
final double X10_TEMP6 =
          (X10_TEMP163);
        
//#line 479
final double X10_TEMP166 =
          ((double)
             X10_TEMP6);
        
//#line 481
final double X10_TEMP7 =
          (X10_TEMP166);
        
//#line 482
final double X10_TEMP169 =
          (1.0E-6);
        
//#line 484
final double X10_TEMP8 =
          (X10_TEMP169);
        
//#line 485
final double X10_TEMP172 =
          (X10_TEMP7 *
             X10_TEMP8);
        
//#line 487
final double X10_TEMP10 =
          (X10_TEMP172);
        
//#line 488
final double X10_TEMP175 =
          ((double)
             X10_TEMP10);
        
//#line 490
final double X10_TEMP12 =
          (X10_TEMP175);
        
//#line 491
return X10_TEMP12;
    }
    
    
//#line 493
public static void
                   Program_Stream_printStats(
                   final long N,
                   final double time,
                   final boolean verified) {
        
//#line 494
final java.
          lang.
          String X10_TEMP151 =
          ("Number of places=");
        
//#line 496
final java.
          lang.
          String X10_TEMP1 =
          (X10_TEMP151);
        
//#line 497
final int X10_TEMP154 =
          (x10.
             lang.
             place.
             MAX_PLACES);
        
//#line 499
final int X10_TEMP2 =
          (X10_TEMP154);
        
//#line 500
final java.
          lang.
          String X10_TEMP157 =
          (X10_TEMP1 +
           X10_TEMP2);
        
//#line 502
final java.
          lang.
          String X10_TEMP4 =
          (X10_TEMP157);
        
//#line 503
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println(X10_TEMP4);
        
//#line 504
final int X10_TEMP161 =
          (3);
        
//#line 506
final int X10_TEMP5 =
          (X10_TEMP161);
        
//#line 507
final int X10_TEMP164 =
          (8);
        
//#line 509
final int X10_TEMP6 =
          (X10_TEMP164);
        
//#line 510
final int X10_TEMP167 =
          (X10_TEMP5 *
             X10_TEMP6);
        
//#line 512
final long X10_TEMP7 =
          (X10_TEMP167);
        
//#line 513
final long X10_TEMP170 =
          (X10_TEMP7 *
             N);
        
//#line 515
final long X10_TEMP8 =
          (X10_TEMP170);
        
//#line 516
final long X10_TEMP173 =
          (X10_TEMP8 /
             _Program__Stream_MEG);
        
//#line 518
final long X10_TEMP10 =
          (X10_TEMP173);
        
//#line 519
final long X10_TEMP176 =
          (X10_TEMP10);
        
//#line 521
long size1 =
          (X10_TEMP176);
        
//#line 522
final int X10_TEMP179 =
          (3);
        
//#line 524
final int X10_TEMP12 =
          (X10_TEMP179);
        
//#line 525
final int X10_TEMP182 =
          (8);
        
//#line 527
final int X10_TEMP13 =
          (X10_TEMP182);
        
//#line 528
final int X10_TEMP185 =
          (X10_TEMP12 *
             X10_TEMP13);
        
//#line 530
final long X10_TEMP14 =
          (X10_TEMP185);
        
//#line 531
final long X10_TEMP188 =
          (X10_TEMP14 *
             N);
        
//#line 533
final long X10_TEMP16 =
          (X10_TEMP188);
        
//#line 534
final double X10_TEMP191 =
          (1.0E9);
        
//#line 536
final double X10_TEMP17 =
          (X10_TEMP191);
        
//#line 537
final double X10_TEMP194 =
          (X10_TEMP17 *
             time);
        
//#line 539
final double X10_TEMP19 =
          (X10_TEMP194);
        
//#line 540
final double X10_TEMP197 =
          (X10_TEMP16 /
             X10_TEMP19);
        
//#line 542
double rate =
          (X10_TEMP197);
        
//#line 543
final java.
          lang.
          String X10_TEMP200 =
          ("Size of arrays: ");
        
//#line 545
final java.
          lang.
          String X10_TEMP21 =
          (X10_TEMP200);
        
//#line 546
final java.
          lang.
          String X10_TEMP203 =
          (X10_TEMP21 +
           size1);
        
//#line 548
final java.
          lang.
          String X10_TEMP22 =
          (X10_TEMP203);
        
//#line 549
final java.
          lang.
          String X10_TEMP206 =
          (" MB (total)");
        
//#line 551
final java.
          lang.
          String X10_TEMP23 =
          (X10_TEMP206);
        
//#line 552
final java.
          lang.
          String X10_TEMP209 =
          (X10_TEMP22 +
           X10_TEMP23);
        
//#line 554
final java.
          lang.
          String X10_TEMP25 =
          (X10_TEMP209);
        
//#line 555
final int X10_TEMP212 =
          (x10.
             lang.
             place.
             MAX_PLACES);
        
//#line 557
final int X10_TEMP24 =
          (X10_TEMP212);
        
//#line 558
final long X10_TEMP215 =
          (size1 /
             X10_TEMP24);
        
//#line 560
final long X10_TEMP26 =
          (X10_TEMP215);
        
//#line 561
final java.
          lang.
          String X10_TEMP218 =
          (X10_TEMP25 +
           X10_TEMP26);
        
//#line 563
final java.
          lang.
          String X10_TEMP27 =
          (X10_TEMP218);
        
//#line 564
final java.
          lang.
          String X10_TEMP221 =
          (" MB (per place)");
        
//#line 566
final java.
          lang.
          String X10_TEMP28 =
          (X10_TEMP221);
        
//#line 567
final java.
          lang.
          String X10_TEMP224 =
          (X10_TEMP27 +
           X10_TEMP28);
        
//#line 569
final java.
          lang.
          String X10_TEMP30 =
          (X10_TEMP224);
        
//#line 570
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println(X10_TEMP30);
        
//#line 571
final java.
          lang.
          String X10_TEMP228 =
          ("Min time: ");
        
//#line 573
final java.
          lang.
          String X10_TEMP31 =
          (X10_TEMP228);
        
//#line 574
final java.
          lang.
          String X10_TEMP231 =
          (X10_TEMP31 +
           time);
        
//#line 576
final java.
          lang.
          String X10_TEMP32 =
          (X10_TEMP231);
        
//#line 577
final java.
          lang.
          String X10_TEMP234 =
          (" rate=");
        
//#line 579
final java.
          lang.
          String X10_TEMP33 =
          (X10_TEMP234);
        
//#line 580
final java.
          lang.
          String X10_TEMP237 =
          (X10_TEMP32 +
           X10_TEMP33);
        
//#line 582
final java.
          lang.
          String X10_TEMP34 =
          (X10_TEMP237);
        
//#line 583
final java.
          lang.
          String X10_TEMP240 =
          (X10_TEMP34 +
           rate);
        
//#line 585
final java.
          lang.
          String X10_TEMP35 =
          (X10_TEMP240);
        
//#line 586
final java.
          lang.
          String X10_TEMP243 =
          (" GB/s");
        
//#line 588
final java.
          lang.
          String X10_TEMP36 =
          (X10_TEMP243);
        
//#line 589
final java.
          lang.
          String X10_TEMP246 =
          (X10_TEMP35 +
           X10_TEMP36);
        
//#line 591
final java.
          lang.
          String X10_TEMP38 =
          (X10_TEMP246);
        
//#line 592
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println(X10_TEMP38);
        
//#line 593
final java.
          lang.
          String X10_TEMP250 =
          ("Result is ");
        
//#line 595
final java.
          lang.
          String X10_TEMP45 =
          (X10_TEMP250);
        
//#line 596
final boolean X10_TEMP39 =
          (verified);
        
//#line 597
java.
          lang.
          String X10_TEMP42 =
          ("NOT verified.");
        
//#line 598
if (X10_TEMP39) {
            
//#line 599
final java.
              lang.
              String X10_TEMP256 =
              ("verified.");
            
//#line 600
X10_TEMP42 =
              ((X10_TEMP256));
        }
        
//#line 602
final java.
          lang.
          String X10_TEMP43 =
          (X10_TEMP42);
        
//#line 603
final java.
          lang.
          String X10_TEMP259 =
          (X10_TEMP43);
        
//#line 605
final java.
          lang.
          String X10_TEMP44 =
          (X10_TEMP259);
        
//#line 606
final java.
          lang.
          String X10_TEMP262 =
          (X10_TEMP45 +
           X10_TEMP44);
        
//#line 608
final java.
          lang.
          String X10_TEMP47 =
          (X10_TEMP262);
        
//#line 609
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println(X10_TEMP47);
    }
    
    
//#line 611
public static int
                   Program__Timer_max_counters_init(
                   ) {
        
//#line 612
final int X10_TEMP151 =
          (64);
        
//#line 614
final int X10_TEMP2 =
          (X10_TEMP151);
        
//#line 615
return X10_TEMP2;
    }
    
    
//#line 617
public static void
                   Program_Timer_start(
                   final Timer X10_TEMP0,
                   final int n) {
        
//#line 618
final x10.
          lang.
          DoubleReferenceArray X10_TEMP151 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 620
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP151));
        
//#line 621
final long X10_TEMP154 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 623
final double X10_TEMP5 =
          (X10_TEMP154);
        
//#line 624
final double X10_TEMP157 =
          (X10_TEMP5);
        
//#line 626
final double X10_TEMP6 =
          (X10_TEMP157);
        
//#line 627
final double X10_TEMP161 =
          (X10_TEMP6);
        
//#line 629
final double X10_TEMP164 =
          (X10_TEMP161);
        
//#line 630
/* template:array_set { */(X10_TEMP1).set((X10_TEMP164),n)/* } */;
    }
    
    
//#line 632
public static void
                   Program_Timer_stop(
                   final Timer X10_TEMP0,
                   final int n) {
        
//#line 633
final x10.
          lang.
          DoubleReferenceArray X10_TEMP151 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 635
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP151));
        
//#line 636
final long X10_TEMP154 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 638
final double X10_TEMP5 =
          (X10_TEMP154);
        
//#line 639
final x10.
          lang.
          DoubleReferenceArray X10_TEMP157 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 641
final x10.
          lang.
          DoubleReferenceArray X10_TEMP3 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP157));
        
//#line 642
final double X10_TEMP161 =
          (/* template:array_get { */((X10_TEMP3).get(n))/* } */);
        
//#line 644
final double X10_TEMP6 =
          (X10_TEMP161);
        
//#line 645
final double X10_TEMP164 =
          (X10_TEMP5 -
             X10_TEMP6);
        
//#line 647
final double X10_TEMP9 =
          (X10_TEMP164);
        
//#line 648
final double X10_TEMP167 =
          (X10_TEMP9);
        
//#line 650
final double X10_TEMP10 =
          (X10_TEMP167);
        
//#line 651
final double X10_TEMP171 =
          (X10_TEMP10);
        
//#line 653
final double X10_TEMP174 =
          (X10_TEMP171);
        
//#line 654
/* template:array_set { */(X10_TEMP1).set((X10_TEMP174),n)/* } */;
        
//#line 655
final x10.
          lang.
          DoubleReferenceArray X10_TEMP176 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 657
final x10.
          lang.
          DoubleReferenceArray X10_TEMP11 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP176));
        
//#line 658
final double X10_TEMP180 =
          (/* template:array_get { */((X10_TEMP11).get(n))/* } */);
        
//#line 660
final double X10_TEMP14 =
          (X10_TEMP180);
        
//#line 661
final int X10_TEMP183 =
          (1000);
        
//#line 663
final double X10_TEMP15 =
          (X10_TEMP183);
        
//#line 664
final double X10_TEMP186 =
          (X10_TEMP14 /
             X10_TEMP15);
        
//#line 666
final double X10_TEMP16 =
          (X10_TEMP186);
        
//#line 667
final double X10_TEMP190 =
          (X10_TEMP16);
        
//#line 669
final double X10_TEMP193 =
          (X10_TEMP190);
        
//#line 670
/* template:array_set { */(X10_TEMP11).set((X10_TEMP193),n)/* } */;
        
//#line 671
final x10.
          lang.
          DoubleReferenceArray X10_TEMP195 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 673
final x10.
          lang.
          DoubleReferenceArray X10_TEMP17 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP195));
        
//#line 674
final x10.
          lang.
          DoubleReferenceArray X10_TEMP198 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 676
final x10.
          lang.
          DoubleReferenceArray X10_TEMP19 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP198));
        
//#line 677
final double X10_TEMP202 =
          (/* template:array_get { */((X10_TEMP17).get(n))/* } */);
        
//#line 679
final double X10_TEMP22 =
          (X10_TEMP202);
        
//#line 680
final double X10_TEMP206 =
          (/* template:array_get { */((X10_TEMP19).get(n))/* } */);
        
//#line 682
final double X10_TEMP23 =
          (X10_TEMP206);
        
//#line 683
final double X10_TEMP209 =
          (X10_TEMP22 +
             X10_TEMP23);
        
//#line 685
final double X10_TEMP24 =
          (X10_TEMP209);
        
//#line 686
final double X10_TEMP213 =
          (X10_TEMP24);
        
//#line 688
final double X10_TEMP216 =
          (X10_TEMP213);
        
//#line 689
/* template:array_set { */(X10_TEMP17).set((X10_TEMP216),n)/* } */;
    }
    
    
//#line 691
public static double
                   Program_Timer_readTimer(
                   final Timer X10_TEMP0,
                   final int n) {
        
//#line 692
final x10.
          lang.
          DoubleReferenceArray X10_TEMP151 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 694
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP151));
        
//#line 695
final double X10_TEMP155 =
          (/* template:array_get { */((X10_TEMP1).get(n))/* } */);
        
//#line 697
final double X10_TEMP4 =
          (X10_TEMP155);
        
//#line 698
return X10_TEMP4;
    }
    
    
//#line 700
public static void
                   Program_Timer_resetTimer(
                   final Timer X10_TEMP0,
                   final int n) {
        
//#line 701
final x10.
          lang.
          DoubleReferenceArray X10_TEMP151 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 703
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP151));
        
//#line 704
final int X10_TEMP154 =
          (0);
        
//#line 706
final double X10_TEMP5 =
          (X10_TEMP154);
        
//#line 707
final double X10_TEMP157 =
          (X10_TEMP5);
        
//#line 709
final double X10_TEMP6 =
          (X10_TEMP157);
        
//#line 710
final double X10_TEMP161 =
          (X10_TEMP6);
        
//#line 712
final double X10_TEMP164 =
          (X10_TEMP161);
        
//#line 713
/* template:array_set { */(X10_TEMP1).set((X10_TEMP164),n)/* } */;
        
//#line 714
final x10.
          lang.
          DoubleReferenceArray X10_TEMP166 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 716
final x10.
          lang.
          DoubleReferenceArray X10_TEMP7 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP166));
        
//#line 717
final int X10_TEMP169 =
          (0);
        
//#line 719
final double X10_TEMP11 =
          (X10_TEMP169);
        
//#line 720
final double X10_TEMP172 =
          (X10_TEMP11);
        
//#line 722
final double X10_TEMP12 =
          (X10_TEMP172);
        
//#line 723
final double X10_TEMP176 =
          (X10_TEMP12);
        
//#line 725
final double X10_TEMP179 =
          (X10_TEMP176);
        
//#line 726
/* template:array_set { */(X10_TEMP7).set((X10_TEMP179),n)/* } */;
        
//#line 727
final x10.
          lang.
          DoubleReferenceArray X10_TEMP181 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 729
final x10.
          lang.
          DoubleReferenceArray X10_TEMP13 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP181));
        
//#line 730
final int X10_TEMP184 =
          (0);
        
//#line 732
final double X10_TEMP17 =
          (X10_TEMP184);
        
//#line 733
final double X10_TEMP187 =
          (X10_TEMP17);
        
//#line 735
final double X10_TEMP18 =
          (X10_TEMP187);
        
//#line 736
final double X10_TEMP191 =
          (X10_TEMP18);
        
//#line 738
final double X10_TEMP194 =
          (X10_TEMP191);
        
//#line 739
/* template:array_set { */(X10_TEMP13).set((X10_TEMP194),n)/* } */;
    }
    
    
//#line 741
public static void
                   Program_Timer_resetAllTimers(
                   final Timer X10_TEMP0) {
        
//#line 742
final int X10_TEMP151 =
          (0);
        
//#line 744
int i =
          (X10_TEMP151);
        
//#line 745
boolean X10_TEMP4 =
          (i <
             _Program__Timer_max_counters);
        
//#line 746
boolean X10_TEMP156 =
          X10_TEMP4;
        
//#line 747
while (X10_TEMP156) {
            
//#line 748
Program0.
                           Program_Timer_resetTimer(
                           X10_TEMP0,
                           i);
            
//#line 749
final int X10_TEMP160 =
              (i);
            
//#line 751
final int X10_TEMP6 =
              (X10_TEMP160);
            
//#line 752
final int X10_TEMP7 =
              (1);
            
//#line 753
final int X10_TEMP164 =
              (i +
                 X10_TEMP7);
            
//#line 754
i =
              ((X10_TEMP164));
            
//#line 755
final boolean X10_TEMP166 =
              (i <
                 _Program__Timer_max_counters);
            
//#line 756
X10_TEMP4 =
              ((X10_TEMP166));
            
//#line 757
X10_TEMP156 =
              X10_TEMP4;
        }
    }
    
    
//#line 8
public Program0() {
        
//#line 8
super();
    }
}

class Program
extends x10.
  lang.
  Object
{
    
    
//#line 763
public Program() {
        
//#line 763
super();
    }
}

class StreamData
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 767
final public x10.
      lang.
      BooleanReferenceArray
      verified;
    
//#line 768
final public x10.
      lang.
      dist
      D;
    
//#line 769
final public x10.
      lang.
      DoubleReferenceArray
      times;
    
//#line 770
final public x10.
      lang.
      DoubleReferenceArray
      a;
    
//#line 771
final public x10.
      lang.
      DoubleReferenceArray
      b;
    
//#line 772
final public x10.
      lang.
      DoubleReferenceArray
      c;
    
    
//#line 775
public StreamData(final long N,
                                   final int NUM_TIMES) {
        
//#line 775
super();
        
//#line 776
final int X10_TEMP151 =
          (0);
        
//#line 778
final int X10_TEMP3 =
          (X10_TEMP151);
        
//#line 779
final int X10_TEMP154 =
          (0);
        
//#line 781
final int X10_TEMP4 =
          (X10_TEMP154);
        
//#line 782
final x10.
          lang.
          region X10_TEMP159 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP3,
                  X10_TEMP4))));
        
//#line 784
final x10.
          lang.
          region X10_TEMP5 =
          (x10.
            lang.
            region)
            ((X10_TEMP159));
        
//#line 785
final x10.
          lang.
          place X10_TEMP162 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 787
final x10.
          lang.
          place X10_TEMP6 =
          (X10_TEMP162);
        
//#line 788
final x10.
          lang.
          dist X10_TEMP165 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                X10_TEMP5,
                X10_TEMP6)));
        
//#line 790
final x10.
          lang.
          dist dverified =
          (x10.
            lang.
            dist)
            ((X10_TEMP165));
        
//#line 791
final x10.
          lang.
          BooleanReferenceArray X10_TEMP169 =
          (x10.
            lang.
            BooleanReferenceArray)
            ((this.
                StreamData_StreamData_initVerified(
                dverified)));
        
//#line 793
final x10.
          lang.
          BooleanReferenceArray X10_TEMP11 =
          (x10.
            lang.
            BooleanReferenceArray)
            ((X10_TEMP169));
        
//#line 794
final x10.
          lang.
          BooleanReferenceArray X10_TEMP172 =
          (x10.
            lang.
            BooleanReferenceArray)
            ((X10_TEMP11));
        
//#line 796
verified =
          (x10.
            lang.
            BooleanReferenceArray)
            ((X10_TEMP172));
        
//#line 797
final int X10_TEMP175 =
          (0);
        
//#line 799
final int X10_TEMP17 =
          (X10_TEMP175);
        
//#line 800
final int X10_TEMP178 =
          (1);
        
//#line 802
final int X10_TEMP13 =
          (X10_TEMP178);
        
//#line 803
final long X10_TEMP181 =
          (N -
             X10_TEMP13);
        
//#line 805
final long X10_TEMP15 =
          (X10_TEMP181);
        
//#line 806
final int X10_TEMP184 =
          ((int)
             X10_TEMP15);
        
//#line 808
final int X10_TEMP18 =
          (X10_TEMP184);
        
//#line 809
final x10.
          lang.
          region X10_TEMP189 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP17,
                  X10_TEMP18))));
        
//#line 811
final x10.
          lang.
          region X10_TEMP20 =
          (x10.
            lang.
            region)
            ((X10_TEMP189));
        
//#line 812
final x10.
          lang.
          dist X10_TEMP193 =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 812
public x10.
                             lang.
                             dist
                             checkCast(
                             final x10.
                               lang.
                               dist x10_generated_objToCast) {
                  
//#line 812
return (((((((x10.
                                              lang.
                                              dist)
                                              x10_generated_objToCast)).
                                            rank() ==
                                            1)))
                                         ? (x10.
                                             lang.
                                             dist)
                                             x10_generated_objToCast
                                         : (x10.
                                             lang.
                                             dist)
                                             x10.
                                               runtime.
                                               RuntimeCastChecker.
                                               throwClassCastException(
                                               (x10.
                                                 lang.
                                                 dist)
                                                 x10_generated_objToCast,
                                               "Constraint is not meet"));
              }
          }.
            checkCast(
            (x10.
               lang.
               dist.
               factory.
               block(
               X10_TEMP20)));
        
//#line 814
final x10.
          lang.
          dist X10_TEMP21 =
          (x10.
            lang.
            dist)
            ((X10_TEMP193));
        
//#line 815
final x10.
          lang.
          dist X10_TEMP196 =
          (x10.
            lang.
            dist)
            ((X10_TEMP21));
        
//#line 817
final x10.
          lang.
          dist temp_D =
          (x10.
            lang.
            dist)
            ((X10_TEMP196));
        
//#line 818
final x10.
          lang.
          dist X10_TEMP199 =
          (x10.
            lang.
            dist)
            ((temp_D));
        
//#line 820
D =
          (x10.
            lang.
            dist)
            ((X10_TEMP199));
        
//#line 821
final int X10_TEMP202 =
          (0);
        
//#line 823
final int X10_TEMP30 =
          (X10_TEMP202);
        
//#line 824
final int X10_TEMP205 =
          (1);
        
//#line 826
final int X10_TEMP26 =
          (X10_TEMP205);
        
//#line 827
final int X10_TEMP208 =
          (NUM_TIMES -
             X10_TEMP26);
        
//#line 829
final int X10_TEMP28 =
          (X10_TEMP208);
        
//#line 830
final int X10_TEMP211 =
          ((int)
             X10_TEMP28);
        
//#line 832
final int X10_TEMP31 =
          (X10_TEMP211);
        
//#line 833
final x10.
          lang.
          region X10_TEMP216 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP30,
                  X10_TEMP31))));
        
//#line 835
final x10.
          lang.
          region X10_TEMP32 =
          (x10.
            lang.
            region)
            ((X10_TEMP216));
        
//#line 836
final x10.
          lang.
          place X10_TEMP219 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 838
final x10.
          lang.
          place X10_TEMP33 =
          (X10_TEMP219);
        
//#line 839
final x10.
          lang.
          dist X10_TEMP222 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                X10_TEMP32,
                X10_TEMP33)));
        
//#line 841
final x10.
          lang.
          dist X10_TEMP35 =
          (x10.
            lang.
            dist)
            ((X10_TEMP222));
        
//#line 842
final x10.
          lang.
          DoubleReferenceArray X10_TEMP226 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((this.
                StreamData_StreamData_initArray(
                X10_TEMP35)));
        
//#line 844
final x10.
          lang.
          DoubleReferenceArray X10_TEMP37 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP226));
        
//#line 845
final x10.
          lang.
          DoubleReferenceArray X10_TEMP229 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP37));
        
//#line 847
times =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP229));
        
//#line 848
final x10.
          lang.
          DoubleReferenceArray X10_TEMP233 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((this.
                StreamData_StreamData_initArray(
                temp_D)));
        
//#line 850
final x10.
          lang.
          DoubleReferenceArray X10_TEMP41 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP233));
        
//#line 851
final x10.
          lang.
          DoubleReferenceArray X10_TEMP236 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP41));
        
//#line 853
a =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP236));
        
//#line 854
final x10.
          lang.
          DoubleReferenceArray X10_TEMP240 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((this.
                StreamData_StreamData_initArray(
                temp_D)));
        
//#line 856
final x10.
          lang.
          DoubleReferenceArray X10_TEMP45 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP240));
        
//#line 857
final x10.
          lang.
          DoubleReferenceArray X10_TEMP243 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP45));
        
//#line 859
b =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP243));
        
//#line 860
final x10.
          lang.
          DoubleReferenceArray X10_TEMP247 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((this.
                StreamData_StreamData_initArray(
                temp_D)));
        
//#line 862
final x10.
          lang.
          DoubleReferenceArray X10_TEMP49 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP247));
        
//#line 863
final x10.
          lang.
          DoubleReferenceArray X10_TEMP250 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP49));
        
//#line 865
c =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP250));
    }
    
    
//#line 869
public x10.
                   lang.
                   BooleanReferenceArray
                   StreamData_StreamData_initVerified(
                   final x10.
                     lang.
                     dist d) {
        
//#line 870
final x10.
          lang.
          BooleanReferenceArray X10_TEMP155 =
          (x10.
            lang.
            BooleanReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.BooleanArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public boolean apply(/* Join: { */x10.
                lang.
                point p/* } */, boolean dummy) { {
                  
//#line 871
final boolean X10_TEMP151 =
                    (true);
                  
//#line 873
final boolean X10_TEMP2 =
                    (X10_TEMP151);
                  
//#line 874
return X10_TEMP2;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 879
final x10.
          lang.
          BooleanReferenceArray X10_TEMP3 =
          (x10.
            lang.
            BooleanReferenceArray)
            ((X10_TEMP155));
        
//#line 880
return X10_TEMP3;
    }
    
    
//#line 882
public x10.
                   lang.
                   DoubleReferenceArray
                   StreamData_StreamData_initArray(
                   final x10.
                     lang.
                     dist d) {
        
//#line 883
final x10.
          lang.
          DoubleReferenceArray X10_TEMP155 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public double apply(/* Join: { */x10.
                lang.
                point p/* } */, double dummy) { {
                  
//#line 884
final double X10_TEMP151 =
                    (0.0);
                  
//#line 886
final double X10_TEMP2 =
                    (X10_TEMP151);
                  
//#line 887
return X10_TEMP2;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 892
final x10.
          lang.
          DoubleReferenceArray X10_TEMP3 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP155));
        
//#line 893
return X10_TEMP3;
    }
}

class Stream
extends x10.
  lang.
  Object
{
    
//#line 899
final public StreamData
      sd;
    
    
//#line 902
public Stream() {
        
//#line 902
super();
        
//#line 903
final long X10_TEMP151 =
          (Program0.
             _Program__Stream_N);
        
//#line 905
long X10_TEMP3 =
          (X10_TEMP151);
        
//#line 906
final int X10_TEMP154 =
          (Program0.
             _Program__Stream_NUM_TIMES);
        
//#line 908
int X10_TEMP4 =
          (X10_TEMP154);
        
//#line 909
final StreamData X10_TEMP159 =
          (new StreamData(
             X10_TEMP3,
             X10_TEMP4));
        
//#line 911
final StreamData X10_TEMP6 =
          (X10_TEMP159);
        
//#line 912
final StreamData X10_TEMP162 =
          (X10_TEMP6);
        
//#line 914
sd =
          ((X10_TEMP162));
    }
}

class Timer
extends x10.
  lang.
  Object
{
    
//#line 921
final public x10.
      lang.
      DoubleReferenceArray
      start_time;
    
//#line 922
final public x10.
      lang.
      DoubleReferenceArray
      elapsed_time;
    
//#line 923
final public x10.
      lang.
      DoubleReferenceArray
      total_time;
    
    
//#line 926
public Timer() {
        
//#line 926
super();
        
//#line 927
final int X10_TEMP151 =
          (0);
        
//#line 929
int i =
          (X10_TEMP151);
        
//#line 930
final int X10_TEMP154 =
          (0);
        
//#line 932
final int X10_TEMP4 =
          (X10_TEMP154);
        
//#line 933
final int X10_TEMP157 =
          (Program0.
             _Program__Timer_max_counters);
        
//#line 935
final int X10_TEMP5 =
          (X10_TEMP157);
        
//#line 936
final x10.
          lang.
          region X10_TEMP162 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP4,
                  X10_TEMP5))));
        
//#line 938
final x10.
          lang.
          region X10_TEMP6 =
          (x10.
            lang.
            region)
            ((X10_TEMP162));
        
//#line 939
final x10.
          lang.
          place X10_TEMP165 =
          (x10.
             lang.
             place.
             FIRST_PLACE);
        
//#line 941
final x10.
          lang.
          place X10_TEMP7 =
          (X10_TEMP165);
        
//#line 942
final x10.
          lang.
          dist X10_TEMP168 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                X10_TEMP6,
                X10_TEMP7)));
        
//#line 944
final x10.
          lang.
          dist d =
          (x10.
            lang.
            dist)
            ((X10_TEMP168));
        
//#line 945
final x10.
          lang.
          DoubleReferenceArray X10_TEMP171 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 947
final x10.
          lang.
          DoubleReferenceArray X10_TEMP10 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP171));
        
//#line 948
final x10.
          lang.
          DoubleReferenceArray X10_TEMP174 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP10));
        
//#line 950
start_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP174));
        
//#line 951
final x10.
          lang.
          DoubleReferenceArray X10_TEMP177 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 953
final x10.
          lang.
          DoubleReferenceArray X10_TEMP12 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP177));
        
//#line 954
final x10.
          lang.
          DoubleReferenceArray X10_TEMP180 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP12));
        
//#line 956
elapsed_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP180));
        
//#line 957
final x10.
          lang.
          DoubleReferenceArray X10_TEMP183 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 959
final x10.
          lang.
          DoubleReferenceArray X10_TEMP14 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP183));
        
//#line 960
final x10.
          lang.
          DoubleReferenceArray X10_TEMP186 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP14));
        
//#line 962
total_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP186));
        
//#line 963
final int X10_TEMP189 =
          (Program0.
             _Program__Timer_max_counters);
        
//#line 965
final int X10_TEMP15 =
          (X10_TEMP189);
        
//#line 966
boolean X10_TEMP19 =
          (i <
             X10_TEMP15);
        
//#line 967
boolean X10_TEMP194 =
          X10_TEMP19;
        
//#line 968
while (X10_TEMP194) {
            
//#line 969
final int X10_TEMP196 =
              (0);
            
//#line 971
final double X10_TEMP23 =
              (X10_TEMP196);
            
//#line 972
final double X10_TEMP199 =
              (X10_TEMP23);
            
//#line 974
final double X10_TEMP24 =
              (X10_TEMP199);
            
//#line 975
final double X10_TEMP203 =
              (X10_TEMP24);
            
//#line 977
final double X10_TEMP206 =
              (X10_TEMP203);
            
//#line 978
/* template:array_set { */(start_time).set((X10_TEMP206),i)/* } */;
            
//#line 979
final int X10_TEMP208 =
              (0);
            
//#line 981
final double X10_TEMP28 =
              (X10_TEMP208);
            
//#line 982
final double X10_TEMP211 =
              (X10_TEMP28);
            
//#line 984
final double X10_TEMP29 =
              (X10_TEMP211);
            
//#line 985
final double X10_TEMP215 =
              (X10_TEMP29);
            
//#line 987
final double X10_TEMP218 =
              (X10_TEMP215);
            
//#line 988
/* template:array_set { */(elapsed_time).set((X10_TEMP218),i)/* } */;
            
//#line 989
final int X10_TEMP220 =
              (0);
            
//#line 991
final double X10_TEMP33 =
              (X10_TEMP220);
            
//#line 992
final double X10_TEMP223 =
              (X10_TEMP33);
            
//#line 994
final double X10_TEMP34 =
              (X10_TEMP223);
            
//#line 995
final double X10_TEMP227 =
              (X10_TEMP34);
            
//#line 997
final double X10_TEMP230 =
              (X10_TEMP227);
            
//#line 998
/* template:array_set { */(total_time).set((X10_TEMP230),i)/* } */;
            
//#line 999
final int X10_TEMP232 =
              (i);
            
//#line 1001
final int X10_TEMP35 =
              (X10_TEMP232);
            
//#line 1002
final int X10_TEMP36 =
              (1);
            
//#line 1003
final int X10_TEMP236 =
              (i +
                 X10_TEMP36);
            
//#line 1004
i =
              ((X10_TEMP236));
            
//#line 1005
final int X10_TEMP238 =
              (Program0.
                 _Program__Timer_max_counters);
            
//#line 1007
final int X10_TEMP17 =
              (X10_TEMP238);
            
//#line 1008
final boolean X10_TEMP241 =
              (i <
                 X10_TEMP17);
            
//#line 1009
X10_TEMP19 =
              ((X10_TEMP241));
            
//#line 1010
X10_TEMP194 =
              X10_TEMP19;
        }
    }
}
