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
      _Program__FragmentedStream_MEG =
      Program0.
        _Program__FragmentedStream_MEG_init();
    
//#line 10
final public static double
      _Program__FragmentedStream_alpha =
      Program0.
        _Program__FragmentedStream_alpha_init();
    
//#line 11
final public static int
      _Program__FragmentedStream_NUM_TIMES =
      Program0.
        _Program__FragmentedStream_NUM_TIMES_init();
    
//#line 12
final public static x10.
      lang.
      dist
      _Program__FragmentedStream_dverified =
      Program0.
        _Program__FragmentedStream_dverified_init();
    
//#line 13
final public static long
      _Program__FragmentedStream_N0 =
      Program0.
        _Program__FragmentedStream_N0_init();
    
//#line 14
final public static x10.
      lang.
      dist
      _Program__FragmentedStream_dtimes =
      Program0.
        _Program__FragmentedStream_dtimes_init();
    
//#line 15
final public static x10.
      lang.
      BooleanReferenceArray
      _Program__FragmentedStream_verified =
      Program0.
        _Program__FragmentedStream_verified_init();
    
//#line 16
final public static long
      _Program__FragmentedStream_N =
      Program0.
        _Program__FragmentedStream_N_init();
    
//#line 17
final public static int
      _Program__FragmentedStream_LocalSize =
      Program0.
        _Program__FragmentedStream_LocalSize_init();
    
//#line 18
final public static x10.
      lang.
      DoubleReferenceArray
      _Program__FragmentedStream_times =
      Program0.
        _Program__FragmentedStream_times_init();
    
//#line 19
final public static x10.
      lang.
      region
      _Program__FragmentedStream_R =
      Program0.
        _Program__FragmentedStream_R_init();
    
//#line 20
final public static x10.
      lang.
      dist
      _Program__FragmentedStream_D =
      Program0.
        _Program__FragmentedStream_D_init();
    
//#line 21
final public static x10.
      lang.
      DoubleReferenceArray
      _Program__FragmentedStream_a =
      Program0.
        _Program__FragmentedStream_a_init();
    
//#line 22
final public static x10.
      lang.
      DoubleReferenceArray
      _Program__FragmentedStream_b =
      Program0.
        _Program__FragmentedStream_b_init();
    
//#line 23
final public static x10.
      lang.
      DoubleReferenceArray
      _Program__FragmentedStream_c =
      Program0.
        _Program__FragmentedStream_c_init();
    
    
//#line 26
public static void
                  runMain(
                  ) {
        
//#line 27
Program0.
                      Program_runMain();
    }
    
    
//#line 29
public static int
                  _Program__FragmentedStream_MEG_init(
                  ) {
        
//#line 31
final int X10_TEMP126 =
          (Program0.
             Program__FragmentedStream_MEG_init());
        
//#line 32
return X10_TEMP126;
    }
    
    
//#line 34
public static double
                  _Program__FragmentedStream_alpha_init(
                  ) {
        
//#line 36
final double X10_TEMP126 =
          (Program0.
             Program__FragmentedStream_alpha_init());
        
//#line 37
return X10_TEMP126;
    }
    
    
//#line 39
public static int
                  _Program__FragmentedStream_NUM_TIMES_init(
                  ) {
        
//#line 41
final int X10_TEMP126 =
          (Program0.
             Program__FragmentedStream_NUM_TIMES_init());
        
//#line 42
return X10_TEMP126;
    }
    
    
//#line 44
public static x10.
                  lang.
                  dist
                  _Program__FragmentedStream_dverified_init(
                  ) {
        
//#line 46
final x10.
          lang.
          dist X10_TEMP126 =
          (x10.
            lang.
            dist)
            ((Program0.
                Program__FragmentedStream_dverified_init()));
        
//#line 47
return X10_TEMP126;
    }
    
    
//#line 49
public static long
                  _Program__FragmentedStream_N0_init(
                  ) {
        
//#line 51
final long X10_TEMP126 =
          (Program0.
             Program__FragmentedStream_N0_init());
        
//#line 52
return X10_TEMP126;
    }
    
    
//#line 54
public static x10.
                  lang.
                  dist
                  _Program__FragmentedStream_dtimes_init(
                  ) {
        
//#line 56
final x10.
          lang.
          dist X10_TEMP126 =
          (x10.
            lang.
            dist)
            ((Program0.
                Program__FragmentedStream_dtimes_init()));
        
//#line 57
return X10_TEMP126;
    }
    
    
//#line 59
public static x10.
                  lang.
                  BooleanReferenceArray
                  _Program__FragmentedStream_verified_init(
                  ) {
        
//#line 61
final x10.
          lang.
          BooleanReferenceArray X10_TEMP126 =
          (x10.
            lang.
            BooleanReferenceArray)
            ((Program0.
                Program__FragmentedStream_verified_init()));
        
//#line 62
return X10_TEMP126;
    }
    
    
//#line 64
public static long
                  _Program__FragmentedStream_N_init(
                  ) {
        
//#line 66
final long X10_TEMP126 =
          (Program0.
             Program__FragmentedStream_N_init());
        
//#line 67
return X10_TEMP126;
    }
    
    
//#line 69
public static int
                  _Program__FragmentedStream_LocalSize_init(
                  ) {
        
//#line 71
final int X10_TEMP126 =
          (Program0.
             Program__FragmentedStream_LocalSize_init());
        
//#line 72
return X10_TEMP126;
    }
    
    
//#line 74
public static x10.
                  lang.
                  DoubleReferenceArray
                  _Program__FragmentedStream_times_init(
                  ) {
        
//#line 76
final x10.
          lang.
          DoubleReferenceArray X10_TEMP126 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((Program0.
                Program__FragmentedStream_times_init()));
        
//#line 77
return X10_TEMP126;
    }
    
    
//#line 79
public static x10.
                  lang.
                  region
                  _Program__FragmentedStream_R_init(
                  ) {
        
//#line 81
final x10.
          lang.
          region X10_TEMP126 =
          (x10.
            lang.
            region)
            ((Program0.
                Program__FragmentedStream_R_init()));
        
//#line 82
return X10_TEMP126;
    }
    
    
//#line 84
public static x10.
                  lang.
                  dist
                  _Program__FragmentedStream_D_init(
                  ) {
        
//#line 86
final x10.
          lang.
          dist X10_TEMP126 =
          (x10.
            lang.
            dist)
            ((Program0.
                Program__FragmentedStream_D_init()));
        
//#line 87
return X10_TEMP126;
    }
    
    
//#line 89
public static x10.
                  lang.
                  DoubleReferenceArray
                  _Program__FragmentedStream_a_init(
                  ) {
        
//#line 91
final x10.
          lang.
          DoubleReferenceArray X10_TEMP126 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((Program0.
                Program__FragmentedStream_a_init()));
        
//#line 92
return X10_TEMP126;
    }
    
    
//#line 94
public static x10.
                  lang.
                  DoubleReferenceArray
                  _Program__FragmentedStream_b_init(
                  ) {
        
//#line 96
final x10.
          lang.
          DoubleReferenceArray X10_TEMP126 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((Program0.
                Program__FragmentedStream_b_init()));
        
//#line 97
return X10_TEMP126;
    }
    
    
//#line 99
public static x10.
                  lang.
                  DoubleReferenceArray
                  _Program__FragmentedStream_c_init(
                  ) {
        
//#line 101
final x10.
          lang.
          DoubleReferenceArray X10_TEMP126 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((Program0.
                Program__FragmentedStream_c_init()));
        
//#line 102
return X10_TEMP126;
    }
    
    
//#line 104
public static void
                   Program_runMain(
                   ) {
        
//#line 105
final FragmentedStream X10_TEMP126 =
          (new FragmentedStream(
             ));
        
//#line 107
final FragmentedStream X10_TEMP1 =
          (X10_TEMP126);
        
//#line 108
Program0.
                       Program_FragmentedStream_run(
                       X10_TEMP1);
    }
    
    
//#line 110
public static int
                   Program__FragmentedStream_MEG_init(
                   ) {
        
//#line 111
final int X10_TEMP126 =
          (1024);
        
//#line 113
final int X10_TEMP1 =
          (X10_TEMP126);
        
//#line 114
final int X10_TEMP129 =
          (1024);
        
//#line 116
final int X10_TEMP2 =
          (X10_TEMP129);
        
//#line 117
final int X10_TEMP132 =
          (X10_TEMP1 *
             X10_TEMP2);
        
//#line 119
final int X10_TEMP4 =
          (X10_TEMP132);
        
//#line 120
return X10_TEMP4;
    }
    
    
//#line 122
public static double
                   Program__FragmentedStream_alpha_init(
                   ) {
        
//#line 123
final double X10_TEMP126 =
          (3.0);
        
//#line 125
final double X10_TEMP2 =
          (X10_TEMP126);
        
//#line 126
return X10_TEMP2;
    }
    
    
//#line 128
public static int
                   Program__FragmentedStream_NUM_TIMES_init(
                   ) {
        
//#line 129
final int X10_TEMP126 =
          (10);
        
//#line 131
final int X10_TEMP2 =
          (X10_TEMP126);
        
//#line 132
return X10_TEMP2;
    }
    
    
//#line 134
public static x10.
                   lang.
                   dist
                   Program__FragmentedStream_dverified_init(
                   ) {
        
//#line 135
final int X10_TEMP126 =
          (0);
        
//#line 137
final int X10_TEMP3 =
          (X10_TEMP126);
        
//#line 138
final int X10_TEMP129 =
          (0);
        
//#line 140
final int X10_TEMP4 =
          (X10_TEMP129);
        
//#line 141
final x10.
          lang.
          region X10_TEMP134 =
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
        
//#line 143
final x10.
          lang.
          region X10_TEMP5 =
          (x10.
            lang.
            region)
            ((X10_TEMP134));
        
//#line 144
final x10.
          lang.
          place X10_TEMP137 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 146
final x10.
          lang.
          place X10_TEMP6 =
          (X10_TEMP137);
        
//#line 147
final x10.
          lang.
          dist X10_TEMP140 =
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
        
//#line 149
final x10.
          lang.
          dist X10_TEMP8 =
          (x10.
            lang.
            dist)
            ((X10_TEMP140));
        
//#line 150
return X10_TEMP8;
    }
    
    
//#line 152
public static x10.
                   lang.
                   BooleanReferenceArray
                   Program__FragmentedStream_verified_init(
                   ) {
        
//#line 153
final x10.
          lang.
          BooleanReferenceArray X10_TEMP130 =
          (x10.
            lang.
            BooleanReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.BooleanArray(_Program__FragmentedStream_dverified,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public boolean apply(/* Join: { */x10.
                lang.
                point p/* } */, boolean dummy) { {
                  
//#line 154
final boolean X10_TEMP126 =
                    (true);
                  
//#line 156
final boolean X10_TEMP2 =
                    (X10_TEMP126);
                  
//#line 157
return X10_TEMP2;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 162
final x10.
          lang.
          BooleanReferenceArray X10_TEMP4 =
          (x10.
            lang.
            BooleanReferenceArray)
            ((X10_TEMP130));
        
//#line 163
return X10_TEMP4;
    }
    
    
//#line 165
public static long
                   Program__FragmentedStream_N0_init(
                   ) {
        
//#line 166
final int X10_TEMP126 =
          (2);
        
//#line 168
final int X10_TEMP1 =
          (X10_TEMP126);
        
//#line 169
final int X10_TEMP129 =
          (X10_TEMP1 *
             _Program__FragmentedStream_MEG);
        
//#line 171
final long X10_TEMP3 =
          (X10_TEMP129);
        
//#line 172
return X10_TEMP3;
    }
    
    
//#line 174
public static long
                   Program__FragmentedStream_N_init(
                   ) {
        
//#line 175
final int X10_TEMP126 =
          (x10.
             lang.
             place.
             MAX_PLACES);
        
//#line 177
final int X10_TEMP1 =
          (X10_TEMP126);
        
//#line 178
final long X10_TEMP129 =
          (_Program__FragmentedStream_N0 *
             X10_TEMP1);
        
//#line 180
final long X10_TEMP3 =
          (X10_TEMP129);
        
//#line 181
return X10_TEMP3;
    }
    
    
//#line 183
public static int
                   Program__FragmentedStream_LocalSize_init(
                   ) {
        
//#line 184
final int X10_TEMP126 =
          ((int)
             _Program__FragmentedStream_N0);
        
//#line 186
final int X10_TEMP2 =
          (X10_TEMP126);
        
//#line 187
return X10_TEMP2;
    }
    
    
//#line 189
public static x10.
                   lang.
                   region
                   Program__FragmentedStream_R_init(
                   ) {
        
//#line 190
final int X10_TEMP126 =
          (0);
        
//#line 192
final int X10_TEMP6 =
          (X10_TEMP126);
        
//#line 193
final int X10_TEMP129 =
          (1);
        
//#line 195
final int X10_TEMP2 =
          (X10_TEMP129);
        
//#line 196
final long X10_TEMP132 =
          (_Program__FragmentedStream_N -
             X10_TEMP2);
        
//#line 198
final long X10_TEMP4 =
          (X10_TEMP132);
        
//#line 199
final int X10_TEMP135 =
          ((int)
             X10_TEMP4);
        
//#line 201
final int X10_TEMP7 =
          (X10_TEMP135);
        
//#line 202
final x10.
          lang.
          region X10_TEMP140 =
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
                  X10_TEMP6,
                  X10_TEMP7))));
        
//#line 204
final x10.
          lang.
          region X10_TEMP9 =
          (x10.
            lang.
            region)
            ((X10_TEMP140));
        
//#line 205
return X10_TEMP9;
    }
    
    
//#line 207
public static x10.
                   lang.
                   dist
                   Program__FragmentedStream_D_init(
                   ) {
        
//#line 208
final x10.
          lang.
          dist X10_TEMP127 =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 208
public x10.
                             lang.
                             dist
                             checkCast(
                             final x10.
                               lang.
                               dist x10_generated_objToCast) {
                  
//#line 208
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
               _Program__FragmentedStream_R)));
        
//#line 210
final x10.
          lang.
          dist X10_TEMP2 =
          (x10.
            lang.
            dist)
            ((X10_TEMP127));
        
//#line 211
return X10_TEMP2;
    }
    
    
//#line 213
public static x10.
                   lang.
                   dist
                   Program__FragmentedStream_dtimes_init(
                   ) {
        
//#line 214
final int X10_TEMP126 =
          (0);
        
//#line 216
final int X10_TEMP6 =
          (X10_TEMP126);
        
//#line 217
final int X10_TEMP129 =
          (1);
        
//#line 219
final int X10_TEMP2 =
          (X10_TEMP129);
        
//#line 220
final int X10_TEMP132 =
          (_Program__FragmentedStream_NUM_TIMES -
             X10_TEMP2);
        
//#line 222
final int X10_TEMP4 =
          (X10_TEMP132);
        
//#line 223
final int X10_TEMP135 =
          ((int)
             X10_TEMP4);
        
//#line 225
final int X10_TEMP7 =
          (X10_TEMP135);
        
//#line 226
final x10.
          lang.
          region X10_TEMP140 =
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
                  X10_TEMP6,
                  X10_TEMP7))));
        
//#line 228
final x10.
          lang.
          region X10_TEMP8 =
          (x10.
            lang.
            region)
            ((X10_TEMP140));
        
//#line 229
final x10.
          lang.
          place X10_TEMP143 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 231
final x10.
          lang.
          place X10_TEMP9 =
          (X10_TEMP143);
        
//#line 232
final x10.
          lang.
          dist X10_TEMP146 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                X10_TEMP8,
                X10_TEMP9)));
        
//#line 234
final x10.
          lang.
          dist X10_TEMP11 =
          (x10.
            lang.
            dist)
            ((X10_TEMP146));
        
//#line 235
return X10_TEMP11;
    }
    
    
//#line 237
public static x10.
                   lang.
                   DoubleReferenceArray
                   Program__FragmentedStream_times_init(
                   ) {
        
//#line 238
final x10.
          lang.
          DoubleReferenceArray X10_TEMP130 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(_Program__FragmentedStream_dtimes,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public double apply(/* Join: { */x10.
                lang.
                point p/* } */, double dummy) { {
                  
//#line 239
final double X10_TEMP126 =
                    (0.0);
                  
//#line 241
final double X10_TEMP2 =
                    (X10_TEMP126);
                  
//#line 242
return X10_TEMP2;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 247
final x10.
          lang.
          DoubleReferenceArray X10_TEMP4 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP130));
        
//#line 248
return X10_TEMP4;
    }
    
    
//#line 250
public static x10.
                   lang.
                   DoubleReferenceArray
                   Program__FragmentedStream_a_init(
                   ) {
        
//#line 251
final x10.
          lang.
          DoubleReferenceArray X10_TEMP130 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(_Program__FragmentedStream_D,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public double apply(/* Join: { */x10.
                lang.
                point __var0__/* } */, double dummy) { {
                  
//#line 251
final int i =
                    /* template:array_get { */((__var0__).get(0))/* } */;
                  
//#line 252
final double X10_TEMP126 =
                    (0.0);
                  
//#line 254
final double X10_TEMP2 =
                    (X10_TEMP126);
                  
//#line 255
return X10_TEMP2;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 260
final x10.
          lang.
          DoubleReferenceArray X10_TEMP4 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP130));
        
//#line 261
return X10_TEMP4;
    }
    
    
//#line 263
public static x10.
                   lang.
                   DoubleReferenceArray
                   Program__FragmentedStream_b_init(
                   ) {
        
//#line 264
final x10.
          lang.
          DoubleReferenceArray X10_TEMP130 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(_Program__FragmentedStream_D,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public double apply(/* Join: { */x10.
                lang.
                point __var1__/* } */, double dummy) { {
                  
//#line 264
final int i =
                    /* template:array_get { */((__var1__).get(0))/* } */;
                  
//#line 265
final double X10_TEMP126 =
                    (0.0);
                  
//#line 267
final double X10_TEMP2 =
                    (X10_TEMP126);
                  
//#line 268
return X10_TEMP2;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 273
final x10.
          lang.
          DoubleReferenceArray X10_TEMP4 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP130));
        
//#line 274
return X10_TEMP4;
    }
    
    
//#line 276
public static x10.
                   lang.
                   DoubleReferenceArray
                   Program__FragmentedStream_c_init(
                   ) {
        
//#line 277
final x10.
          lang.
          DoubleReferenceArray X10_TEMP130 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(_Program__FragmentedStream_D,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public double apply(/* Join: { */x10.
                lang.
                point __var2__/* } */, double dummy) { {
                  
//#line 277
final int i =
                    /* template:array_get { */((__var2__).get(0))/* } */;
                  
//#line 278
final double X10_TEMP126 =
                    (0.0);
                  
//#line 280
final double X10_TEMP2 =
                    (X10_TEMP126);
                  
//#line 281
return X10_TEMP2;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 286
final x10.
          lang.
          DoubleReferenceArray X10_TEMP4 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP130));
        
//#line 287
return X10_TEMP4;
    }
    
    
//#line 289
public static void
                   Program_FragmentedStream_run(
                   final FragmentedStream X10_TEMP0) {
        
//#line 290
final java.
          lang.
          String X10_TEMP126 =
          ("LocalSize=");
        
//#line 292
final java.
          lang.
          String X10_TEMP1 =
          (X10_TEMP126);
        
//#line 293
final java.
          lang.
          String X10_TEMP129 =
          (X10_TEMP1 +
           _Program__FragmentedStream_LocalSize);
        
//#line 295
final java.
          lang.
          String X10_TEMP3 =
          (X10_TEMP129);
        
//#line 296
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println(X10_TEMP3);
        
//#line 297
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 298
final int X10_TEMP133 =
              (0);
            
//#line 300
final int X10_TEMP9 =
              (X10_TEMP133);
            
//#line 301
final int X10_TEMP136 =
              (1);
            
//#line 303
final int X10_TEMP5 =
              (X10_TEMP136);
            
//#line 304
final int X10_TEMP139 =
              (_Program__FragmentedStream_NUM_TIMES -
                 X10_TEMP5);
            
//#line 306
final int X10_TEMP7 =
              (X10_TEMP139);
            
//#line 307
final int X10_TEMP142 =
              ((int)
                 X10_TEMP7);
            
//#line 309
final int X10_TEMP10 =
              (X10_TEMP142);
            
//#line 310
final x10.
              lang.
              region X10_TEMP147 =
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
                      X10_TEMP9,
                      X10_TEMP10))));
            
//#line 312
x10.
              lang.
              region r =
              (x10.
                lang.
                region)
                ((X10_TEMP147));
            
//#line 313
/* template:forloop { */
            for (java.util.Iterator p1__ = (r).iterator(); p1__.hasNext(); ) {
            	final  x10.
              lang.
              point p1 = (x10.
              lang.
              point) p1__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 314
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 315
final x10.
                      lang.
                      dist X10_TEMP151 =
                      (x10.
                        lang.
                        dist)
                        ((x10.
                            lang.
                            dist.
                            UNIQUE));
                    
//#line 317
final x10.
                      lang.
                      dist X10_TEMP14 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP151));
                    
//#line 318
/* template:forloop-mult { */{
                    x10.lang.region __var8__ = (x10.lang.region) X10_TEMP14.
                                                                   region;
                    if (__var8__.size() > 0 && (__var8__ instanceof x10.array.MultiDimRegion || __var8__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var9__ = __var8__.rank(0).low(), __var10__ = __var8__.rank(0).high(); __var9__ <= __var10__; __var9__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int p = __var9__;
                    /* } */
                    /* } */
/* Join: { *//* template:point-create { */
                    final  x10.
                      lang.
                      point X10_TEMP16 = point.factory.point(/* Join: { */__var9__/* } */);/* } */
{
                        
//#line 319
final x10.
                          lang.
                          dist X10_TEMP155 =
                          (x10.
                            lang.
                            dist)
                            ((X10_TEMP14.
                                distribution));
                        
//#line 321
final x10.
                          lang.
                          dist X10_TEMP15 =
                          (x10.
                            lang.
                            dist)
                            ((X10_TEMP155));
                        
//#line 322
final x10.
                          lang.
                          place X10_TEMP17 =
                          (X10_TEMP15.
                             get(
                             X10_TEMP16));
                        
//#line 323
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP17)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 324
final x10.
                              lang.
                              place X10_TEMP161 =
                              (/* template:here { */x10.lang.Runtime.here()/* } */);
                            
//#line 326
final x10.
                              lang.
                              place X10_TEMP18 =
                              (X10_TEMP161);
                            
//#line 327
final x10.
                              lang.
                              dist X10_TEMP164 =
                              (x10.
                                lang.
                                dist)
                                ((_Program__FragmentedStream_D.
                                    restriction(
                                    X10_TEMP18)));
                            
//#line 329
final x10.
                              lang.
                              dist X10_TEMP20 =
                              (x10.
                                lang.
                                dist)
                                ((X10_TEMP164));
                            
//#line 330
/* template:forloop-mult { */{
                            x10.lang.region __var11__ = (x10.lang.region) X10_TEMP20.
                                                                            region;
                            if (__var11__.size() > 0 && (__var11__ instanceof x10.array.MultiDimRegion || __var11__ instanceof x10.array.ContiguousRange)) {
                            	/* Loop: { *//* template:forloop-mult-each { */
                            for (int __var12__ = __var11__.rank(0).low(), __var13__ = __var11__.rank(0).high(); __var12__ <= __var13__; __var12__++)
                            /* } */
                            /* } */ {
                            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                            final int i = __var12__;
                            /* } */
                            /* } */
{
                                
//#line 331
final double X10_TEMP168 =
                                  (1.5);
                                
//#line 333
final double X10_TEMP25 =
                                  (X10_TEMP168);
                                
//#line 334
final int X10_TEMP171 =
                                  (p *
                                     _Program__FragmentedStream_LocalSize);
                                
//#line 336
final int X10_TEMP22 =
                                  (X10_TEMP171);
                                
//#line 337
final int X10_TEMP174 =
                                  (X10_TEMP22 +
                                     i);
                                
//#line 339
final int X10_TEMP24 =
                                  (X10_TEMP174);
                                
//#line 340
final double X10_TEMP177 =
                                  (X10_TEMP25 *
                                     X10_TEMP24);
                                
//#line 342
final double X10_TEMP28 =
                                  (X10_TEMP177);
                                
//#line 343
final double X10_TEMP180 =
                                  (X10_TEMP28);
                                
//#line 345
final double X10_TEMP29 =
                                  (X10_TEMP180);
                                
//#line 346
final double X10_TEMP184 =
                                  (X10_TEMP29);
                                
//#line 348
final double X10_TEMP187 =
                                  (X10_TEMP184);
                                
//#line 349
/* template:array_set { */(_Program__FragmentedStream_b).set((X10_TEMP187),i)/* } */;
                                
//#line 350
final double X10_TEMP189 =
                                  (2.5);
                                
//#line 352
final double X10_TEMP34 =
                                  (X10_TEMP189);
                                
//#line 353
final int X10_TEMP192 =
                                  (p *
                                     _Program__FragmentedStream_LocalSize);
                                
//#line 355
final int X10_TEMP31 =
                                  (X10_TEMP192);
                                
//#line 356
final int X10_TEMP195 =
                                  (X10_TEMP31 +
                                     i);
                                
//#line 358
final int X10_TEMP33 =
                                  (X10_TEMP195);
                                
//#line 359
final double X10_TEMP198 =
                                  (X10_TEMP34 *
                                     X10_TEMP33);
                                
//#line 361
final double X10_TEMP37 =
                                  (X10_TEMP198);
                                
//#line 362
final double X10_TEMP201 =
                                  (X10_TEMP37);
                                
//#line 364
final double X10_TEMP38 =
                                  (X10_TEMP201);
                                
//#line 365
final double X10_TEMP205 =
                                  (X10_TEMP38);
                                
//#line 367
final double X10_TEMP208 =
                                  (X10_TEMP205);
                                
//#line 368
/* template:array_set { */(_Program__FragmentedStream_c).set((X10_TEMP208),i)/* } */;
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var3____ = (__var11__).iterator(); __var3____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var3__ = (x10.
                              lang.
                              point) __var3____.next();
                            	/* Join: { *//* Join: { */final int i =
                              /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                                
//#line 331
final double X10_TEMP168 =
                                  (1.5);
                                
//#line 333
final double X10_TEMP25 =
                                  (X10_TEMP168);
                                
//#line 334
final int X10_TEMP171 =
                                  (p *
                                     _Program__FragmentedStream_LocalSize);
                                
//#line 336
final int X10_TEMP22 =
                                  (X10_TEMP171);
                                
//#line 337
final int X10_TEMP174 =
                                  (X10_TEMP22 +
                                     i);
                                
//#line 339
final int X10_TEMP24 =
                                  (X10_TEMP174);
                                
//#line 340
final double X10_TEMP177 =
                                  (X10_TEMP25 *
                                     X10_TEMP24);
                                
//#line 342
final double X10_TEMP28 =
                                  (X10_TEMP177);
                                
//#line 343
final double X10_TEMP180 =
                                  (X10_TEMP28);
                                
//#line 345
final double X10_TEMP29 =
                                  (X10_TEMP180);
                                
//#line 346
final double X10_TEMP184 =
                                  (X10_TEMP29);
                                
//#line 348
final double X10_TEMP187 =
                                  (X10_TEMP184);
                                
//#line 349
/* template:array_set { */(_Program__FragmentedStream_b).set((X10_TEMP187),i)/* } */;
                                
//#line 350
final double X10_TEMP189 =
                                  (2.5);
                                
//#line 352
final double X10_TEMP34 =
                                  (X10_TEMP189);
                                
//#line 353
final int X10_TEMP192 =
                                  (p *
                                     _Program__FragmentedStream_LocalSize);
                                
//#line 355
final int X10_TEMP31 =
                                  (X10_TEMP192);
                                
//#line 356
final int X10_TEMP195 =
                                  (X10_TEMP31 +
                                     i);
                                
//#line 358
final int X10_TEMP33 =
                                  (X10_TEMP195);
                                
//#line 359
final double X10_TEMP198 =
                                  (X10_TEMP34 *
                                     X10_TEMP33);
                                
//#line 361
final double X10_TEMP37 =
                                  (X10_TEMP198);
                                
//#line 362
final double X10_TEMP201 =
                                  (X10_TEMP37);
                                
//#line 364
final double X10_TEMP38 =
                                  (X10_TEMP201);
                                
//#line 365
final double X10_TEMP205 =
                                  (X10_TEMP38);
                                
//#line 367
final double X10_TEMP208 =
                                  (X10_TEMP205);
                                
//#line 368
/* template:array_set { */(_Program__FragmentedStream_c).set((X10_TEMP208),i)/* } */;
                            }/* } */
                            }
                            /* } */
                            
                            }
                            }
                            /* } */
                            
                            
//#line 370
final int X10_TEMP210 =
                              (0);
                            
//#line 372
final int X10_TEMP39 =
                              (X10_TEMP210);
                            
//#line 373
final boolean X10_TEMP41 =
                              (p ==
                                 X10_TEMP39);
                            
//#line 374
if (X10_TEMP41) {
                                
//#line 375
final double X10_TEMP215 =
                                  (Program0.
                                     Program_FragmentedStream_mySecond());
                                
//#line 377
final double X10_TEMP43 =
                                  (X10_TEMP215);
                                
//#line 378
final int X10_TEMP44 =
                                  (0);
                                
//#line 379
final double X10_TEMP219 =
                                  (X10_TEMP44 -
                                     X10_TEMP43);
                                
//#line 381
final double X10_TEMP47 =
                                  (X10_TEMP219);
                                
//#line 382
final double X10_TEMP222 =
                                  (X10_TEMP47);
                                
//#line 384
final double X10_TEMP48 =
                                  (X10_TEMP222);
                                
//#line 385
final double X10_TEMP226 =
                                  (X10_TEMP48);
                                
//#line 387
final double X10_TEMP229 =
                                  (X10_TEMP226);
                                
//#line 388
/* template:array_set { */(_Program__FragmentedStream_times).set((X10_TEMP229),p1)/* } */;
                            }
                            
//#line 390
final x10.
                              lang.
                              place X10_TEMP231 =
                              (/* template:here { */x10.lang.Runtime.here()/* } */);
                            
//#line 392
final x10.
                              lang.
                              place X10_TEMP49 =
                              (X10_TEMP231);
                            
//#line 393
final x10.
                              lang.
                              dist X10_TEMP234 =
                              (x10.
                                lang.
                                dist)
                                ((_Program__FragmentedStream_D.
                                    restriction(
                                    X10_TEMP49)));
                            
//#line 395
final x10.
                              lang.
                              dist X10_TEMP51 =
                              (x10.
                                lang.
                                dist)
                                ((X10_TEMP234));
                            
//#line 396
/* template:forloop-mult { */{
                            x10.lang.region __var14__ = (x10.lang.region) X10_TEMP51.
                                                                            region;
                            if (__var14__.size() > 0 && (__var14__ instanceof x10.array.MultiDimRegion || __var14__ instanceof x10.array.ContiguousRange)) {
                            	/* Loop: { *//* template:forloop-mult-each { */
                            for (int __var15__ = __var14__.rank(0).low(), __var16__ = __var14__.rank(0).high(); __var15__ <= __var16__; __var15__++)
                            /* } */
                            /* } */ {
                            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                            final int i = __var15__;
                            /* } */
                            /* } */
{
                                
//#line 397
final double X10_TEMP239 =
                                  (/* template:array_get { */((_Program__FragmentedStream_b).get(i))/* } */);
                                
//#line 399
final double X10_TEMP56 =
                                  (X10_TEMP239);
                                
//#line 400
final double X10_TEMP243 =
                                  (/* template:array_get { */((_Program__FragmentedStream_c).get(i))/* } */);
                                
//#line 402
final double X10_TEMP55 =
                                  (X10_TEMP243);
                                
//#line 403
final double X10_TEMP246 =
                                  (_Program__FragmentedStream_alpha *
                                     X10_TEMP55);
                                
//#line 405
final double X10_TEMP57 =
                                  (X10_TEMP246);
                                
//#line 406
final double X10_TEMP249 =
                                  (X10_TEMP56 +
                                     X10_TEMP57);
                                
//#line 408
final double X10_TEMP60 =
                                  (X10_TEMP249);
                                
//#line 409
final double X10_TEMP252 =
                                  (X10_TEMP60);
                                
//#line 411
final double X10_TEMP61 =
                                  (X10_TEMP252);
                                
//#line 412
final double X10_TEMP256 =
                                  (X10_TEMP61);
                                
//#line 414
final double X10_TEMP259 =
                                  (X10_TEMP256);
                                
//#line 415
/* template:array_set { */(_Program__FragmentedStream_a).set((X10_TEMP259),i)/* } */;
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var4____ = (__var14__).iterator(); __var4____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var4__ = (x10.
                              lang.
                              point) __var4____.next();
                            	/* Join: { *//* Join: { */final int i =
                              /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                                
//#line 397
final double X10_TEMP239 =
                                  (/* template:array_get { */((_Program__FragmentedStream_b).get(i))/* } */);
                                
//#line 399
final double X10_TEMP56 =
                                  (X10_TEMP239);
                                
//#line 400
final double X10_TEMP243 =
                                  (/* template:array_get { */((_Program__FragmentedStream_c).get(i))/* } */);
                                
//#line 402
final double X10_TEMP55 =
                                  (X10_TEMP243);
                                
//#line 403
final double X10_TEMP246 =
                                  (_Program__FragmentedStream_alpha *
                                     X10_TEMP55);
                                
//#line 405
final double X10_TEMP57 =
                                  (X10_TEMP246);
                                
//#line 406
final double X10_TEMP249 =
                                  (X10_TEMP56 +
                                     X10_TEMP57);
                                
//#line 408
final double X10_TEMP60 =
                                  (X10_TEMP249);
                                
//#line 409
final double X10_TEMP252 =
                                  (X10_TEMP60);
                                
//#line 411
final double X10_TEMP61 =
                                  (X10_TEMP252);
                                
//#line 412
final double X10_TEMP256 =
                                  (X10_TEMP61);
                                
//#line 414
final double X10_TEMP259 =
                                  (X10_TEMP256);
                                
//#line 415
/* template:array_set { */(_Program__FragmentedStream_a).set((X10_TEMP259),i)/* } */;
                            }/* } */
                            }
                            /* } */
                            
                            }
                            }
                            /* } */
                            
                        }
                        		}
                        	});/* } */
                    }/* } *//* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator X10_TEMP16__ = (__var8__).iterator(); X10_TEMP16__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point X10_TEMP16 = (x10.
                      lang.
                      point) X10_TEMP16__.next();
                    	/* Join: { *//* Join: { */final int p =
                      /* template:array_get { */((X10_TEMP16).get(0))/* } */;/* } */
{
                        
//#line 319
final x10.
                          lang.
                          dist X10_TEMP155 =
                          (x10.
                            lang.
                            dist)
                            ((X10_TEMP14.
                                distribution));
                        
//#line 321
final x10.
                          lang.
                          dist X10_TEMP15 =
                          (x10.
                            lang.
                            dist)
                            ((X10_TEMP155));
                        
//#line 322
final x10.
                          lang.
                          place X10_TEMP17 =
                          (X10_TEMP15.
                             get(
                             X10_TEMP16));
                        
//#line 323
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP17)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 324
final x10.
                              lang.
                              place X10_TEMP161 =
                              (/* template:here { */x10.lang.Runtime.here()/* } */);
                            
//#line 326
final x10.
                              lang.
                              place X10_TEMP18 =
                              (X10_TEMP161);
                            
//#line 327
final x10.
                              lang.
                              dist X10_TEMP164 =
                              (x10.
                                lang.
                                dist)
                                ((_Program__FragmentedStream_D.
                                    restriction(
                                    X10_TEMP18)));
                            
//#line 329
final x10.
                              lang.
                              dist X10_TEMP20 =
                              (x10.
                                lang.
                                dist)
                                ((X10_TEMP164));
                            
//#line 330
/* template:forloop-mult { */{
                            x10.lang.region __var17__ = (x10.lang.region) X10_TEMP20.
                                                                            region;
                            if (__var17__.size() > 0 && (__var17__ instanceof x10.array.MultiDimRegion || __var17__ instanceof x10.array.ContiguousRange)) {
                            	/* Loop: { *//* template:forloop-mult-each { */
                            for (int __var18__ = __var17__.rank(0).low(), __var19__ = __var17__.rank(0).high(); __var18__ <= __var19__; __var18__++)
                            /* } */
                            /* } */ {
                            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                            final int i = __var18__;
                            /* } */
                            /* } */
{
                                
//#line 331
final double X10_TEMP168 =
                                  (1.5);
                                
//#line 333
final double X10_TEMP25 =
                                  (X10_TEMP168);
                                
//#line 334
final int X10_TEMP171 =
                                  (p *
                                     _Program__FragmentedStream_LocalSize);
                                
//#line 336
final int X10_TEMP22 =
                                  (X10_TEMP171);
                                
//#line 337
final int X10_TEMP174 =
                                  (X10_TEMP22 +
                                     i);
                                
//#line 339
final int X10_TEMP24 =
                                  (X10_TEMP174);
                                
//#line 340
final double X10_TEMP177 =
                                  (X10_TEMP25 *
                                     X10_TEMP24);
                                
//#line 342
final double X10_TEMP28 =
                                  (X10_TEMP177);
                                
//#line 343
final double X10_TEMP180 =
                                  (X10_TEMP28);
                                
//#line 345
final double X10_TEMP29 =
                                  (X10_TEMP180);
                                
//#line 346
final double X10_TEMP184 =
                                  (X10_TEMP29);
                                
//#line 348
final double X10_TEMP187 =
                                  (X10_TEMP184);
                                
//#line 349
/* template:array_set { */(_Program__FragmentedStream_b).set((X10_TEMP187),i)/* } */;
                                
//#line 350
final double X10_TEMP189 =
                                  (2.5);
                                
//#line 352
final double X10_TEMP34 =
                                  (X10_TEMP189);
                                
//#line 353
final int X10_TEMP192 =
                                  (p *
                                     _Program__FragmentedStream_LocalSize);
                                
//#line 355
final int X10_TEMP31 =
                                  (X10_TEMP192);
                                
//#line 356
final int X10_TEMP195 =
                                  (X10_TEMP31 +
                                     i);
                                
//#line 358
final int X10_TEMP33 =
                                  (X10_TEMP195);
                                
//#line 359
final double X10_TEMP198 =
                                  (X10_TEMP34 *
                                     X10_TEMP33);
                                
//#line 361
final double X10_TEMP37 =
                                  (X10_TEMP198);
                                
//#line 362
final double X10_TEMP201 =
                                  (X10_TEMP37);
                                
//#line 364
final double X10_TEMP38 =
                                  (X10_TEMP201);
                                
//#line 365
final double X10_TEMP205 =
                                  (X10_TEMP38);
                                
//#line 367
final double X10_TEMP208 =
                                  (X10_TEMP205);
                                
//#line 368
/* template:array_set { */(_Program__FragmentedStream_c).set((X10_TEMP208),i)/* } */;
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var3____ = (__var17__).iterator(); __var3____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var3__ = (x10.
                              lang.
                              point) __var3____.next();
                            	/* Join: { *//* Join: { */final int i =
                              /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                                
//#line 331
final double X10_TEMP168 =
                                  (1.5);
                                
//#line 333
final double X10_TEMP25 =
                                  (X10_TEMP168);
                                
//#line 334
final int X10_TEMP171 =
                                  (p *
                                     _Program__FragmentedStream_LocalSize);
                                
//#line 336
final int X10_TEMP22 =
                                  (X10_TEMP171);
                                
//#line 337
final int X10_TEMP174 =
                                  (X10_TEMP22 +
                                     i);
                                
//#line 339
final int X10_TEMP24 =
                                  (X10_TEMP174);
                                
//#line 340
final double X10_TEMP177 =
                                  (X10_TEMP25 *
                                     X10_TEMP24);
                                
//#line 342
final double X10_TEMP28 =
                                  (X10_TEMP177);
                                
//#line 343
final double X10_TEMP180 =
                                  (X10_TEMP28);
                                
//#line 345
final double X10_TEMP29 =
                                  (X10_TEMP180);
                                
//#line 346
final double X10_TEMP184 =
                                  (X10_TEMP29);
                                
//#line 348
final double X10_TEMP187 =
                                  (X10_TEMP184);
                                
//#line 349
/* template:array_set { */(_Program__FragmentedStream_b).set((X10_TEMP187),i)/* } */;
                                
//#line 350
final double X10_TEMP189 =
                                  (2.5);
                                
//#line 352
final double X10_TEMP34 =
                                  (X10_TEMP189);
                                
//#line 353
final int X10_TEMP192 =
                                  (p *
                                     _Program__FragmentedStream_LocalSize);
                                
//#line 355
final int X10_TEMP31 =
                                  (X10_TEMP192);
                                
//#line 356
final int X10_TEMP195 =
                                  (X10_TEMP31 +
                                     i);
                                
//#line 358
final int X10_TEMP33 =
                                  (X10_TEMP195);
                                
//#line 359
final double X10_TEMP198 =
                                  (X10_TEMP34 *
                                     X10_TEMP33);
                                
//#line 361
final double X10_TEMP37 =
                                  (X10_TEMP198);
                                
//#line 362
final double X10_TEMP201 =
                                  (X10_TEMP37);
                                
//#line 364
final double X10_TEMP38 =
                                  (X10_TEMP201);
                                
//#line 365
final double X10_TEMP205 =
                                  (X10_TEMP38);
                                
//#line 367
final double X10_TEMP208 =
                                  (X10_TEMP205);
                                
//#line 368
/* template:array_set { */(_Program__FragmentedStream_c).set((X10_TEMP208),i)/* } */;
                            }/* } */
                            }
                            /* } */
                            
                            }
                            }
                            /* } */
                            
                            
//#line 370
final int X10_TEMP210 =
                              (0);
                            
//#line 372
final int X10_TEMP39 =
                              (X10_TEMP210);
                            
//#line 373
final boolean X10_TEMP41 =
                              (p ==
                                 X10_TEMP39);
                            
//#line 374
if (X10_TEMP41) {
                                
//#line 375
final double X10_TEMP215 =
                                  (Program0.
                                     Program_FragmentedStream_mySecond());
                                
//#line 377
final double X10_TEMP43 =
                                  (X10_TEMP215);
                                
//#line 378
final int X10_TEMP44 =
                                  (0);
                                
//#line 379
final double X10_TEMP219 =
                                  (X10_TEMP44 -
                                     X10_TEMP43);
                                
//#line 381
final double X10_TEMP47 =
                                  (X10_TEMP219);
                                
//#line 382
final double X10_TEMP222 =
                                  (X10_TEMP47);
                                
//#line 384
final double X10_TEMP48 =
                                  (X10_TEMP222);
                                
//#line 385
final double X10_TEMP226 =
                                  (X10_TEMP48);
                                
//#line 387
final double X10_TEMP229 =
                                  (X10_TEMP226);
                                
//#line 388
/* template:array_set { */(_Program__FragmentedStream_times).set((X10_TEMP229),p1)/* } */;
                            }
                            
//#line 390
final x10.
                              lang.
                              place X10_TEMP231 =
                              (/* template:here { */x10.lang.Runtime.here()/* } */);
                            
//#line 392
final x10.
                              lang.
                              place X10_TEMP49 =
                              (X10_TEMP231);
                            
//#line 393
final x10.
                              lang.
                              dist X10_TEMP234 =
                              (x10.
                                lang.
                                dist)
                                ((_Program__FragmentedStream_D.
                                    restriction(
                                    X10_TEMP49)));
                            
//#line 395
final x10.
                              lang.
                              dist X10_TEMP51 =
                              (x10.
                                lang.
                                dist)
                                ((X10_TEMP234));
                            
//#line 396
/* template:forloop-mult { */{
                            x10.lang.region __var20__ = (x10.lang.region) X10_TEMP51.
                                                                            region;
                            if (__var20__.size() > 0 && (__var20__ instanceof x10.array.MultiDimRegion || __var20__ instanceof x10.array.ContiguousRange)) {
                            	/* Loop: { *//* template:forloop-mult-each { */
                            for (int __var21__ = __var20__.rank(0).low(), __var22__ = __var20__.rank(0).high(); __var21__ <= __var22__; __var21__++)
                            /* } */
                            /* } */ {
                            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                            final int i = __var21__;
                            /* } */
                            /* } */
{
                                
//#line 397
final double X10_TEMP239 =
                                  (/* template:array_get { */((_Program__FragmentedStream_b).get(i))/* } */);
                                
//#line 399
final double X10_TEMP56 =
                                  (X10_TEMP239);
                                
//#line 400
final double X10_TEMP243 =
                                  (/* template:array_get { */((_Program__FragmentedStream_c).get(i))/* } */);
                                
//#line 402
final double X10_TEMP55 =
                                  (X10_TEMP243);
                                
//#line 403
final double X10_TEMP246 =
                                  (_Program__FragmentedStream_alpha *
                                     X10_TEMP55);
                                
//#line 405
final double X10_TEMP57 =
                                  (X10_TEMP246);
                                
//#line 406
final double X10_TEMP249 =
                                  (X10_TEMP56 +
                                     X10_TEMP57);
                                
//#line 408
final double X10_TEMP60 =
                                  (X10_TEMP249);
                                
//#line 409
final double X10_TEMP252 =
                                  (X10_TEMP60);
                                
//#line 411
final double X10_TEMP61 =
                                  (X10_TEMP252);
                                
//#line 412
final double X10_TEMP256 =
                                  (X10_TEMP61);
                                
//#line 414
final double X10_TEMP259 =
                                  (X10_TEMP256);
                                
//#line 415
/* template:array_set { */(_Program__FragmentedStream_a).set((X10_TEMP259),i)/* } */;
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var4____ = (__var20__).iterator(); __var4____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var4__ = (x10.
                              lang.
                              point) __var4____.next();
                            	/* Join: { *//* Join: { */final int i =
                              /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                                
//#line 397
final double X10_TEMP239 =
                                  (/* template:array_get { */((_Program__FragmentedStream_b).get(i))/* } */);
                                
//#line 399
final double X10_TEMP56 =
                                  (X10_TEMP239);
                                
//#line 400
final double X10_TEMP243 =
                                  (/* template:array_get { */((_Program__FragmentedStream_c).get(i))/* } */);
                                
//#line 402
final double X10_TEMP55 =
                                  (X10_TEMP243);
                                
//#line 403
final double X10_TEMP246 =
                                  (_Program__FragmentedStream_alpha *
                                     X10_TEMP55);
                                
//#line 405
final double X10_TEMP57 =
                                  (X10_TEMP246);
                                
//#line 406
final double X10_TEMP249 =
                                  (X10_TEMP56 +
                                     X10_TEMP57);
                                
//#line 408
final double X10_TEMP60 =
                                  (X10_TEMP249);
                                
//#line 409
final double X10_TEMP252 =
                                  (X10_TEMP60);
                                
//#line 411
final double X10_TEMP61 =
                                  (X10_TEMP252);
                                
//#line 412
final double X10_TEMP256 =
                                  (X10_TEMP61);
                                
//#line 414
final double X10_TEMP259 =
                                  (X10_TEMP256);
                                
//#line 415
/* template:array_set { */(_Program__FragmentedStream_a).set((X10_TEMP259),i)/* } */;
                            }/* } */
                            }
                            /* } */
                            
                            }
                            }
                            /* } */
                            
                        }
                        		}
                        	});/* } */
                    }/* } */
                    }
                    /* } */
                    
                    }
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
                
                
//#line 420
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 421
final x10.
                      lang.
                      dist X10_TEMP261 =
                      (x10.
                        lang.
                        dist)
                        ((x10.
                            lang.
                            dist.
                            UNIQUE));
                    
//#line 423
final x10.
                      lang.
                      dist X10_TEMP63 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP261));
                    
//#line 424
/* template:forloop-mult { */{
                    x10.lang.region __var24__ = (x10.lang.region) X10_TEMP63.
                                                                    region;
                    if (__var24__.size() > 0 && (__var24__ instanceof x10.array.MultiDimRegion || __var24__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var25__ = __var24__.rank(0).low(), __var26__ = __var24__.rank(0).high(); __var25__ <= __var26__; __var25__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int p = __var25__;
                    /* } */
                    /* } */
/* Join: { *//* template:point-create { */
                    final  x10.
                      lang.
                      point X10_TEMP65 = point.factory.point(/* Join: { */__var25__/* } */);/* } */
{
                        
//#line 425
final x10.
                          lang.
                          dist X10_TEMP265 =
                          (x10.
                            lang.
                            dist)
                            ((X10_TEMP63.
                                distribution));
                        
//#line 427
final x10.
                          lang.
                          dist X10_TEMP64 =
                          (x10.
                            lang.
                            dist)
                            ((X10_TEMP265));
                        
//#line 428
final x10.
                          lang.
                          place X10_TEMP66 =
                          (X10_TEMP64.
                             get(
                             X10_TEMP65));
                        
//#line 429
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP66)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 430
final int X10_TEMP271 =
                              (0);
                            
//#line 432
final int X10_TEMP67 =
                              (X10_TEMP271);
                            
//#line 433
final boolean X10_TEMP69 =
                              (p ==
                                 X10_TEMP67);
                            
//#line 434
if (X10_TEMP69) {
                                
//#line 435
final double X10_TEMP277 =
                                  (/* template:array_get { */((_Program__FragmentedStream_times).get(p1))/* } */);
                                
//#line 437
final double X10_TEMP72 =
                                  (X10_TEMP277);
                                
//#line 438
final double X10_TEMP280 =
                                  (Program0.
                                     Program_FragmentedStream_mySecond());
                                
//#line 440
final double X10_TEMP73 =
                                  (X10_TEMP280);
                                
//#line 441
final double X10_TEMP283 =
                                  (X10_TEMP72 +
                                     X10_TEMP73);
                                
//#line 443
final double X10_TEMP74 =
                                  (X10_TEMP283);
                                
//#line 444
final double X10_TEMP287 =
                                  (X10_TEMP74);
                                
//#line 446
final double X10_TEMP290 =
                                  (X10_TEMP287);
                                
//#line 447
/* template:array_set { */(_Program__FragmentedStream_times).set((X10_TEMP290),p1)/* } */;
                            }
                        }
                        		}
                        	});/* } */
                    }/* } *//* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator X10_TEMP65__ = (__var24__).iterator(); X10_TEMP65__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point X10_TEMP65 = (x10.
                      lang.
                      point) X10_TEMP65__.next();
                    	/* Join: { *//* Join: { */final int p =
                      /* template:array_get { */((X10_TEMP65).get(0))/* } */;/* } */
{
                        
//#line 425
final x10.
                          lang.
                          dist X10_TEMP265 =
                          (x10.
                            lang.
                            dist)
                            ((X10_TEMP63.
                                distribution));
                        
//#line 427
final x10.
                          lang.
                          dist X10_TEMP64 =
                          (x10.
                            lang.
                            dist)
                            ((X10_TEMP265));
                        
//#line 428
final x10.
                          lang.
                          place X10_TEMP66 =
                          (X10_TEMP64.
                             get(
                             X10_TEMP65));
                        
//#line 429
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP66)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 430
final int X10_TEMP271 =
                              (0);
                            
//#line 432
final int X10_TEMP67 =
                              (X10_TEMP271);
                            
//#line 433
final boolean X10_TEMP69 =
                              (p ==
                                 X10_TEMP67);
                            
//#line 434
if (X10_TEMP69) {
                                
//#line 435
final double X10_TEMP277 =
                                  (/* template:array_get { */((_Program__FragmentedStream_times).get(p1))/* } */);
                                
//#line 437
final double X10_TEMP72 =
                                  (X10_TEMP277);
                                
//#line 438
final double X10_TEMP280 =
                                  (Program0.
                                     Program_FragmentedStream_mySecond());
                                
//#line 440
final double X10_TEMP73 =
                                  (X10_TEMP280);
                                
//#line 441
final double X10_TEMP283 =
                                  (X10_TEMP72 +
                                     X10_TEMP73);
                                
//#line 443
final double X10_TEMP74 =
                                  (X10_TEMP283);
                                
//#line 444
final double X10_TEMP287 =
                                  (X10_TEMP74);
                                
//#line 446
final double X10_TEMP290 =
                                  (X10_TEMP287);
                                
//#line 447
/* template:array_set { */(_Program__FragmentedStream_times).set((X10_TEMP290),p1)/* } */;
                            }
                        }
                        		}
                        	});/* } */
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }
                	} catch (Throwable tmp23) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp23);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
            }/* } */
            }
            /* } */
            
            
//#line 453
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 454
final x10.
                  lang.
                  dist X10_TEMP292 =
                  (x10.
                    lang.
                    dist)
                    ((x10.
                        lang.
                        dist.
                        UNIQUE));
                
//#line 456
final x10.
                  lang.
                  dist X10_TEMP76 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP292));
                
//#line 457
/* template:forloop-mult { */{
                x10.lang.region __var28__ = (x10.lang.region) X10_TEMP76.
                                                                region;
                if (__var28__.size() > 0 && (__var28__ instanceof x10.array.MultiDimRegion || __var28__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var29__ = __var28__.rank(0).low(), __var30__ = __var28__.rank(0).high(); __var29__ <= __var30__; __var29__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int p = __var29__;
                /* } */
                /* } */
/* Join: { *//* template:point-create { */
                final  x10.
                  lang.
                  point X10_TEMP78 = point.factory.point(/* Join: { */__var29__/* } */);/* } */
{
                    
//#line 458
final x10.
                      lang.
                      dist X10_TEMP296 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP76.
                            distribution));
                    
//#line 460
final x10.
                      lang.
                      dist X10_TEMP77 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP296));
                    
//#line 461
final x10.
                      lang.
                      place X10_TEMP79 =
                      (X10_TEMP77.
                         get(
                         X10_TEMP78));
                    
//#line 462
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP79)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 463
final x10.
                          lang.
                          place X10_TEMP302 =
                          (/* template:here { */x10.lang.Runtime.here()/* } */);
                        
//#line 465
final x10.
                          lang.
                          place X10_TEMP80 =
                          (X10_TEMP302);
                        
//#line 466
final x10.
                          lang.
                          dist X10_TEMP305 =
                          (x10.
                            lang.
                            dist)
                            ((_Program__FragmentedStream_D.
                                restriction(
                                X10_TEMP80)));
                        
//#line 468
final x10.
                          lang.
                          dist X10_TEMP82 =
                          (x10.
                            lang.
                            dist)
                            ((X10_TEMP305));
                        
//#line 469
/* template:forloop-mult { */{
                        x10.lang.region __var31__ = (x10.lang.region) X10_TEMP82.
                                                                        region;
                        if (__var31__.size() > 0 && (__var31__ instanceof x10.array.MultiDimRegion || __var31__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var32__ = __var31__.rank(0).low(), __var33__ = __var31__.rank(0).high(); __var32__ <= __var33__; __var32__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i = __var32__;
                        /* } */
                        /* } */
{
                            
//#line 470
final double X10_TEMP310 =
                              (/* template:array_get { */((_Program__FragmentedStream_a).get(i))/* } */);
                            
//#line 472
final double X10_TEMP89 =
                              (X10_TEMP310);
                            
//#line 473
final double X10_TEMP314 =
                              (/* template:array_get { */((_Program__FragmentedStream_b).get(i))/* } */);
                            
//#line 475
final double X10_TEMP87 =
                              (X10_TEMP314);
                            
//#line 476
final double X10_TEMP318 =
                              (/* template:array_get { */((_Program__FragmentedStream_c).get(i))/* } */);
                            
//#line 478
final double X10_TEMP86 =
                              (X10_TEMP318);
                            
//#line 479
final double X10_TEMP321 =
                              (_Program__FragmentedStream_alpha *
                                 X10_TEMP86);
                            
//#line 481
final double X10_TEMP88 =
                              (X10_TEMP321);
                            
//#line 482
final double X10_TEMP324 =
                              (X10_TEMP87 +
                                 X10_TEMP88);
                            
//#line 484
final double X10_TEMP90 =
                              (X10_TEMP324);
                            
//#line 485
final boolean X10_TEMP92 =
                              (X10_TEMP89 !=
                                 X10_TEMP90);
                            
//#line 486
if (X10_TEMP92) {
                                
//#line 487
final x10.
                                  lang.
                                  place X10_TEMP94 =
                                  (x10.
                                     lang.
                                     place.
                                     FIRST_PLACE);
                                
//#line 488
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP94)).runAsync
                                	(new x10.runtime.Activity() {
                                		public void runX10Task() {
                                			{
                                    
//#line 489
final int X10_TEMP331 =
                                      (0);
                                    
//#line 491
final int X10_TEMP96 =
                                      (X10_TEMP331);
                                    
//#line 492
final boolean X10_TEMP334 =
                                      (false);
                                    
//#line 494
final boolean X10_TEMP99 =
                                      (X10_TEMP334);
                                    
//#line 495
final boolean X10_TEMP337 =
                                      (X10_TEMP99);
                                    
//#line 497
final boolean X10_TEMP100 =
                                      (X10_TEMP337);
                                    
//#line 498
final boolean X10_TEMP341 =
                                      (X10_TEMP100);
                                    
//#line 500
final boolean X10_TEMP344 =
                                      (X10_TEMP341);
                                    
//#line 501
/* template:array_set { */(_Program__FragmentedStream_verified).set((X10_TEMP344),X10_TEMP96)/* } */;
                                }
                                		}
                                	});/* } */
                            }
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var5____ = (__var31__).iterator(); __var5____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var5__ = (x10.
                          lang.
                          point) __var5____.next();
                        	/* Join: { *//* Join: { */final int i =
                          /* template:array_get { */((__var5__).get(0))/* } */;/* } */
{
                            
//#line 470
final double X10_TEMP310 =
                              (/* template:array_get { */((_Program__FragmentedStream_a).get(i))/* } */);
                            
//#line 472
final double X10_TEMP89 =
                              (X10_TEMP310);
                            
//#line 473
final double X10_TEMP314 =
                              (/* template:array_get { */((_Program__FragmentedStream_b).get(i))/* } */);
                            
//#line 475
final double X10_TEMP87 =
                              (X10_TEMP314);
                            
//#line 476
final double X10_TEMP318 =
                              (/* template:array_get { */((_Program__FragmentedStream_c).get(i))/* } */);
                            
//#line 478
final double X10_TEMP86 =
                              (X10_TEMP318);
                            
//#line 479
final double X10_TEMP321 =
                              (_Program__FragmentedStream_alpha *
                                 X10_TEMP86);
                            
//#line 481
final double X10_TEMP88 =
                              (X10_TEMP321);
                            
//#line 482
final double X10_TEMP324 =
                              (X10_TEMP87 +
                                 X10_TEMP88);
                            
//#line 484
final double X10_TEMP90 =
                              (X10_TEMP324);
                            
//#line 485
final boolean X10_TEMP92 =
                              (X10_TEMP89 !=
                                 X10_TEMP90);
                            
//#line 486
if (X10_TEMP92) {
                                
//#line 487
final x10.
                                  lang.
                                  place X10_TEMP94 =
                                  (x10.
                                     lang.
                                     place.
                                     FIRST_PLACE);
                                
//#line 488
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP94)).runAsync
                                	(new x10.runtime.Activity() {
                                		public void runX10Task() {
                                			{
                                    
//#line 489
final int X10_TEMP331 =
                                      (0);
                                    
//#line 491
final int X10_TEMP96 =
                                      (X10_TEMP331);
                                    
//#line 492
final boolean X10_TEMP334 =
                                      (false);
                                    
//#line 494
final boolean X10_TEMP99 =
                                      (X10_TEMP334);
                                    
//#line 495
final boolean X10_TEMP337 =
                                      (X10_TEMP99);
                                    
//#line 497
final boolean X10_TEMP100 =
                                      (X10_TEMP337);
                                    
//#line 498
final boolean X10_TEMP341 =
                                      (X10_TEMP100);
                                    
//#line 500
final boolean X10_TEMP344 =
                                      (X10_TEMP341);
                                    
//#line 501
/* template:array_set { */(_Program__FragmentedStream_verified).set((X10_TEMP344),X10_TEMP96)/* } */;
                                }
                                		}
                                	});/* } */
                            }
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
                    }
                    		}
                    	});/* } */
                }/* } *//* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator X10_TEMP78__ = (__var28__).iterator(); X10_TEMP78__.hasNext(); ) {
                	final  x10.
                  lang.
                  point X10_TEMP78 = (x10.
                  lang.
                  point) X10_TEMP78__.next();
                	/* Join: { *//* Join: { */final int p =
                  /* template:array_get { */((X10_TEMP78).get(0))/* } */;/* } */
{
                    
//#line 458
final x10.
                      lang.
                      dist X10_TEMP296 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP76.
                            distribution));
                    
//#line 460
final x10.
                      lang.
                      dist X10_TEMP77 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP296));
                    
//#line 461
final x10.
                      lang.
                      place X10_TEMP79 =
                      (X10_TEMP77.
                         get(
                         X10_TEMP78));
                    
//#line 462
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP79)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 463
final x10.
                          lang.
                          place X10_TEMP302 =
                          (/* template:here { */x10.lang.Runtime.here()/* } */);
                        
//#line 465
final x10.
                          lang.
                          place X10_TEMP80 =
                          (X10_TEMP302);
                        
//#line 466
final x10.
                          lang.
                          dist X10_TEMP305 =
                          (x10.
                            lang.
                            dist)
                            ((_Program__FragmentedStream_D.
                                restriction(
                                X10_TEMP80)));
                        
//#line 468
final x10.
                          lang.
                          dist X10_TEMP82 =
                          (x10.
                            lang.
                            dist)
                            ((X10_TEMP305));
                        
//#line 469
/* template:forloop-mult { */{
                        x10.lang.region __var34__ = (x10.lang.region) X10_TEMP82.
                                                                        region;
                        if (__var34__.size() > 0 && (__var34__ instanceof x10.array.MultiDimRegion || __var34__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var35__ = __var34__.rank(0).low(), __var36__ = __var34__.rank(0).high(); __var35__ <= __var36__; __var35__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i = __var35__;
                        /* } */
                        /* } */
{
                            
//#line 470
final double X10_TEMP310 =
                              (/* template:array_get { */((_Program__FragmentedStream_a).get(i))/* } */);
                            
//#line 472
final double X10_TEMP89 =
                              (X10_TEMP310);
                            
//#line 473
final double X10_TEMP314 =
                              (/* template:array_get { */((_Program__FragmentedStream_b).get(i))/* } */);
                            
//#line 475
final double X10_TEMP87 =
                              (X10_TEMP314);
                            
//#line 476
final double X10_TEMP318 =
                              (/* template:array_get { */((_Program__FragmentedStream_c).get(i))/* } */);
                            
//#line 478
final double X10_TEMP86 =
                              (X10_TEMP318);
                            
//#line 479
final double X10_TEMP321 =
                              (_Program__FragmentedStream_alpha *
                                 X10_TEMP86);
                            
//#line 481
final double X10_TEMP88 =
                              (X10_TEMP321);
                            
//#line 482
final double X10_TEMP324 =
                              (X10_TEMP87 +
                                 X10_TEMP88);
                            
//#line 484
final double X10_TEMP90 =
                              (X10_TEMP324);
                            
//#line 485
final boolean X10_TEMP92 =
                              (X10_TEMP89 !=
                                 X10_TEMP90);
                            
//#line 486
if (X10_TEMP92) {
                                
//#line 487
final x10.
                                  lang.
                                  place X10_TEMP94 =
                                  (x10.
                                     lang.
                                     place.
                                     FIRST_PLACE);
                                
//#line 488
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP94)).runAsync
                                	(new x10.runtime.Activity() {
                                		public void runX10Task() {
                                			{
                                    
//#line 489
final int X10_TEMP331 =
                                      (0);
                                    
//#line 491
final int X10_TEMP96 =
                                      (X10_TEMP331);
                                    
//#line 492
final boolean X10_TEMP334 =
                                      (false);
                                    
//#line 494
final boolean X10_TEMP99 =
                                      (X10_TEMP334);
                                    
//#line 495
final boolean X10_TEMP337 =
                                      (X10_TEMP99);
                                    
//#line 497
final boolean X10_TEMP100 =
                                      (X10_TEMP337);
                                    
//#line 498
final boolean X10_TEMP341 =
                                      (X10_TEMP100);
                                    
//#line 500
final boolean X10_TEMP344 =
                                      (X10_TEMP341);
                                    
//#line 501
/* template:array_set { */(_Program__FragmentedStream_verified).set((X10_TEMP344),X10_TEMP96)/* } */;
                                }
                                		}
                                	});/* } */
                            }
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var5____ = (__var34__).iterator(); __var5____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var5__ = (x10.
                          lang.
                          point) __var5____.next();
                        	/* Join: { *//* Join: { */final int i =
                          /* template:array_get { */((__var5__).get(0))/* } */;/* } */
{
                            
//#line 470
final double X10_TEMP310 =
                              (/* template:array_get { */((_Program__FragmentedStream_a).get(i))/* } */);
                            
//#line 472
final double X10_TEMP89 =
                              (X10_TEMP310);
                            
//#line 473
final double X10_TEMP314 =
                              (/* template:array_get { */((_Program__FragmentedStream_b).get(i))/* } */);
                            
//#line 475
final double X10_TEMP87 =
                              (X10_TEMP314);
                            
//#line 476
final double X10_TEMP318 =
                              (/* template:array_get { */((_Program__FragmentedStream_c).get(i))/* } */);
                            
//#line 478
final double X10_TEMP86 =
                              (X10_TEMP318);
                            
//#line 479
final double X10_TEMP321 =
                              (_Program__FragmentedStream_alpha *
                                 X10_TEMP86);
                            
//#line 481
final double X10_TEMP88 =
                              (X10_TEMP321);
                            
//#line 482
final double X10_TEMP324 =
                              (X10_TEMP87 +
                                 X10_TEMP88);
                            
//#line 484
final double X10_TEMP90 =
                              (X10_TEMP324);
                            
//#line 485
final boolean X10_TEMP92 =
                              (X10_TEMP89 !=
                                 X10_TEMP90);
                            
//#line 486
if (X10_TEMP92) {
                                
//#line 487
final x10.
                                  lang.
                                  place X10_TEMP94 =
                                  (x10.
                                     lang.
                                     place.
                                     FIRST_PLACE);
                                
//#line 488
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP94)).runAsync
                                	(new x10.runtime.Activity() {
                                		public void runX10Task() {
                                			{
                                    
//#line 489
final int X10_TEMP331 =
                                      (0);
                                    
//#line 491
final int X10_TEMP96 =
                                      (X10_TEMP331);
                                    
//#line 492
final boolean X10_TEMP334 =
                                      (false);
                                    
//#line 494
final boolean X10_TEMP99 =
                                      (X10_TEMP334);
                                    
//#line 495
final boolean X10_TEMP337 =
                                      (X10_TEMP99);
                                    
//#line 497
final boolean X10_TEMP100 =
                                      (X10_TEMP337);
                                    
//#line 498
final boolean X10_TEMP341 =
                                      (X10_TEMP100);
                                    
//#line 500
final boolean X10_TEMP344 =
                                      (X10_TEMP341);
                                    
//#line 501
/* template:array_set { */(_Program__FragmentedStream_verified).set((X10_TEMP344),X10_TEMP96)/* } */;
                                }
                                		}
                                	});/* } */
                            }
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
                    }
                    		}
                    	});/* } */
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }
            	} catch (Throwable tmp27) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp27);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
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
        
        
//#line 509
final long X10_TEMP346 =
          (10000000L);
        
//#line 511
double mini =
          (X10_TEMP346);
        
//#line 512
final int X10_TEMP349 =
          (0);
        
//#line 514
final int X10_TEMP107 =
          (X10_TEMP349);
        
//#line 515
final int X10_TEMP352 =
          (1);
        
//#line 517
final int X10_TEMP103 =
          (X10_TEMP352);
        
//#line 518
final int X10_TEMP355 =
          (_Program__FragmentedStream_NUM_TIMES -
             X10_TEMP103);
        
//#line 520
final int X10_TEMP105 =
          (X10_TEMP355);
        
//#line 521
final int X10_TEMP358 =
          ((int)
             X10_TEMP105);
        
//#line 523
final int X10_TEMP108 =
          (X10_TEMP358);
        
//#line 524
final x10.
          lang.
          region X10_TEMP363 =
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
                  X10_TEMP107,
                  X10_TEMP108))));
        
//#line 526
x10.
          lang.
          region r =
          (x10.
            lang.
            region)
            ((X10_TEMP363));
        
//#line 527
/* template:forloop { */
        for (java.util.Iterator p1__ = (r).iterator(); p1__.hasNext(); ) {
        	final  x10.
          lang.
          point p1 = (x10.
          lang.
          point) p1__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 528
final double X10_TEMP368 =
              (/* template:array_get { */((_Program__FragmentedStream_times).get(p1))/* } */);
            
//#line 530
final double X10_TEMP112 =
              (X10_TEMP368);
            
//#line 531
final boolean X10_TEMP114 =
              (X10_TEMP112 <
                 mini);
            
//#line 532
if (X10_TEMP114) {
                
//#line 533
final double X10_TEMP374 =
                  (/* template:array_get { */((_Program__FragmentedStream_times).get(p1))/* } */);
                
//#line 535
final double X10_TEMP117 =
                  (X10_TEMP374);
                
//#line 536
final double X10_TEMP377 =
                  (X10_TEMP117);
                
//#line 538
mini =
                  ((X10_TEMP377));
            }
        }/* } */
        }
        /* } */
        
        
//#line 541
final int X10_TEMP380 =
          (0);
        
//#line 543
final int X10_TEMP121 =
          (X10_TEMP380);
        
//#line 544
final boolean X10_TEMP384 =
          (/* template:array_get { */((_Program__FragmentedStream_verified).get(X10_TEMP121))/* } */);
        
//#line 546
final boolean X10_TEMP123 =
          (X10_TEMP384);
        
//#line 547
Program0.
                       Program_FragmentedStream_printStats(
                       _Program__FragmentedStream_N,
                       mini,
                       X10_TEMP123);
    }
    
    
//#line 549
public static double
                   Program_FragmentedStream_mySecond(
                   ) {
        
//#line 550
final long X10_TEMP126 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 552
final double X10_TEMP1 =
          (X10_TEMP126);
        
//#line 553
final double X10_TEMP129 =
          (1000000.0);
        
//#line 555
final double X10_TEMP2 =
          (X10_TEMP129);
        
//#line 556
final double X10_TEMP132 =
          (X10_TEMP1 *
             X10_TEMP2);
        
//#line 558
final double X10_TEMP3 =
          (X10_TEMP132);
        
//#line 559
final int X10_TEMP135 =
          (1000);
        
//#line 561
final int X10_TEMP4 =
          (X10_TEMP135);
        
//#line 562
final double X10_TEMP138 =
          (X10_TEMP3 /
             X10_TEMP4);
        
//#line 564
final double X10_TEMP6 =
          (X10_TEMP138);
        
//#line 565
final double X10_TEMP141 =
          ((double)
             X10_TEMP6);
        
//#line 567
final double X10_TEMP7 =
          (X10_TEMP141);
        
//#line 568
final double X10_TEMP144 =
          (1.0E-6);
        
//#line 570
final double X10_TEMP8 =
          (X10_TEMP144);
        
//#line 571
final double X10_TEMP147 =
          (X10_TEMP7 *
             X10_TEMP8);
        
//#line 573
final double X10_TEMP10 =
          (X10_TEMP147);
        
//#line 574
final double X10_TEMP150 =
          ((double)
             X10_TEMP10);
        
//#line 576
final double X10_TEMP12 =
          (X10_TEMP150);
        
//#line 577
return X10_TEMP12;
    }
    
    
//#line 579
public static void
                   Program_FragmentedStream_printStats(
                   final long N,
                   final double time,
                   final boolean verified) {
        
//#line 580
long X10_TEMP1 =
          (N);
        
//#line 581
double X10_TEMP2 =
          (time);
        
//#line 582
boolean X10_TEMP3 =
          (verified);
        
//#line 583
final java.
          lang.
          String X10_TEMP129 =
          ("Number of places=");
        
//#line 585
final java.
          lang.
          String X10_TEMP4 =
          (X10_TEMP129);
        
//#line 586
final int X10_TEMP132 =
          (x10.
             lang.
             place.
             MAX_PLACES);
        
//#line 588
final int X10_TEMP5 =
          (X10_TEMP132);
        
//#line 589
final java.
          lang.
          String X10_TEMP135 =
          (X10_TEMP4 +
           X10_TEMP5);
        
//#line 591
final java.
          lang.
          String X10_TEMP7 =
          (X10_TEMP135);
        
//#line 592
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println(X10_TEMP7);
        
//#line 593
final int X10_TEMP139 =
          (3);
        
//#line 595
final int X10_TEMP8 =
          (X10_TEMP139);
        
//#line 596
final int X10_TEMP142 =
          (8);
        
//#line 598
final int X10_TEMP9 =
          (X10_TEMP142);
        
//#line 599
final int X10_TEMP145 =
          (X10_TEMP8 *
             X10_TEMP9);
        
//#line 601
final long X10_TEMP10 =
          (X10_TEMP145);
        
//#line 602
final long X10_TEMP148 =
          (X10_TEMP10 *
             X10_TEMP1);
        
//#line 604
final long X10_TEMP11 =
          (X10_TEMP148);
        
//#line 605
final long X10_TEMP151 =
          (X10_TEMP11 /
             _Program__FragmentedStream_MEG);
        
//#line 607
final long X10_TEMP13 =
          (X10_TEMP151);
        
//#line 608
final long X10_TEMP154 =
          (X10_TEMP13);
        
//#line 610
long size1 =
          (X10_TEMP154);
        
//#line 611
final int X10_TEMP157 =
          (3);
        
//#line 613
final int X10_TEMP15 =
          (X10_TEMP157);
        
//#line 614
final int X10_TEMP160 =
          (8);
        
//#line 616
final int X10_TEMP16 =
          (X10_TEMP160);
        
//#line 617
final int X10_TEMP163 =
          (X10_TEMP15 *
             X10_TEMP16);
        
//#line 619
final long X10_TEMP17 =
          (X10_TEMP163);
        
//#line 620
final long X10_TEMP166 =
          (X10_TEMP17 *
             X10_TEMP1);
        
//#line 622
final long X10_TEMP19 =
          (X10_TEMP166);
        
//#line 623
final double X10_TEMP169 =
          (1.0E9);
        
//#line 625
final double X10_TEMP20 =
          (X10_TEMP169);
        
//#line 626
final double X10_TEMP172 =
          (X10_TEMP20 *
             X10_TEMP2);
        
//#line 628
final double X10_TEMP22 =
          (X10_TEMP172);
        
//#line 629
final double X10_TEMP175 =
          (X10_TEMP19 /
             X10_TEMP22);
        
//#line 631
double rate =
          (X10_TEMP175);
        
//#line 632
final java.
          lang.
          String X10_TEMP178 =
          ("Size of arrays: ");
        
//#line 634
final java.
          lang.
          String X10_TEMP24 =
          (X10_TEMP178);
        
//#line 635
final java.
          lang.
          String X10_TEMP181 =
          (X10_TEMP24 +
           size1);
        
//#line 637
final java.
          lang.
          String X10_TEMP25 =
          (X10_TEMP181);
        
//#line 638
final java.
          lang.
          String X10_TEMP184 =
          (" MB (total)");
        
//#line 640
final java.
          lang.
          String X10_TEMP26 =
          (X10_TEMP184);
        
//#line 641
final java.
          lang.
          String X10_TEMP187 =
          (X10_TEMP25 +
           X10_TEMP26);
        
//#line 643
final java.
          lang.
          String X10_TEMP28 =
          (X10_TEMP187);
        
//#line 644
final int X10_TEMP190 =
          (x10.
             lang.
             place.
             MAX_PLACES);
        
//#line 646
final int X10_TEMP27 =
          (X10_TEMP190);
        
//#line 647
final long X10_TEMP193 =
          (size1 /
             X10_TEMP27);
        
//#line 649
final long X10_TEMP29 =
          (X10_TEMP193);
        
//#line 650
final java.
          lang.
          String X10_TEMP196 =
          (X10_TEMP28 +
           X10_TEMP29);
        
//#line 652
final java.
          lang.
          String X10_TEMP30 =
          (X10_TEMP196);
        
//#line 653
final java.
          lang.
          String X10_TEMP199 =
          (" MB (per place)");
        
//#line 655
final java.
          lang.
          String X10_TEMP31 =
          (X10_TEMP199);
        
//#line 656
final java.
          lang.
          String X10_TEMP202 =
          (X10_TEMP30 +
           X10_TEMP31);
        
//#line 658
final java.
          lang.
          String X10_TEMP33 =
          (X10_TEMP202);
        
//#line 659
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println(X10_TEMP33);
        
//#line 660
final java.
          lang.
          String X10_TEMP206 =
          ("Min time: ");
        
//#line 662
final java.
          lang.
          String X10_TEMP34 =
          (X10_TEMP206);
        
//#line 663
final java.
          lang.
          String X10_TEMP209 =
          (X10_TEMP34 +
           X10_TEMP2);
        
//#line 665
final java.
          lang.
          String X10_TEMP35 =
          (X10_TEMP209);
        
//#line 666
final java.
          lang.
          String X10_TEMP212 =
          (" rate=");
        
//#line 668
final java.
          lang.
          String X10_TEMP36 =
          (X10_TEMP212);
        
//#line 669
final java.
          lang.
          String X10_TEMP215 =
          (X10_TEMP35 +
           X10_TEMP36);
        
//#line 671
final java.
          lang.
          String X10_TEMP37 =
          (X10_TEMP215);
        
//#line 672
final java.
          lang.
          String X10_TEMP218 =
          (X10_TEMP37 +
           rate);
        
//#line 674
final java.
          lang.
          String X10_TEMP38 =
          (X10_TEMP218);
        
//#line 675
final java.
          lang.
          String X10_TEMP221 =
          (" GB/s");
        
//#line 677
final java.
          lang.
          String X10_TEMP39 =
          (X10_TEMP221);
        
//#line 678
final java.
          lang.
          String X10_TEMP224 =
          (X10_TEMP38 +
           X10_TEMP39);
        
//#line 680
final java.
          lang.
          String X10_TEMP41 =
          (X10_TEMP224);
        
//#line 681
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println(X10_TEMP41);
        
//#line 682
final java.
          lang.
          String X10_TEMP228 =
          ("Result is ");
        
//#line 684
final java.
          lang.
          String X10_TEMP48 =
          (X10_TEMP228);
        
//#line 685
final boolean X10_TEMP42 =
          (X10_TEMP3);
        
//#line 686
java.
          lang.
          String X10_TEMP45 =
          ("NOT verified.");
        
//#line 687
if (X10_TEMP42) {
            
//#line 688
final java.
              lang.
              String X10_TEMP234 =
              ("verified.");
            
//#line 689
X10_TEMP45 =
              ((X10_TEMP234));
        }
        
//#line 691
final java.
          lang.
          String X10_TEMP46 =
          (X10_TEMP45);
        
//#line 692
final java.
          lang.
          String X10_TEMP237 =
          (X10_TEMP46);
        
//#line 694
final java.
          lang.
          String X10_TEMP47 =
          (X10_TEMP237);
        
//#line 695
final java.
          lang.
          String X10_TEMP240 =
          (X10_TEMP48 +
           X10_TEMP47);
        
//#line 697
final java.
          lang.
          String X10_TEMP50 =
          (X10_TEMP240);
        
//#line 698
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println(X10_TEMP50);
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
    
    
//#line 703
public Program() {
        
//#line 703
super();
    }
}

class FragmentedStream
extends x10.
  lang.
  Object
{
    
    
//#line 706
public FragmentedStream() {
        
//#line 706
super();
    }
}
