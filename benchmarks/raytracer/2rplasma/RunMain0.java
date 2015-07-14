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
      _Program__RayTracer_alpha =
      Program0.
        _Program__RayTracer_alpha_init();
    
//#line 10
final public static Vec
      _Program__RayTracer_voidVec =
      Program0.
        _Program__RayTracer_voidVec_init();
    
//#line 11
final public static int
      _Program__Scene_maxObjects =
      Program0.
        _Program__Scene_maxObjects_init();
    
//#line 12
final public static int
      _Program__Scene_maxLights =
      Program0.
        _Program__Scene_maxLights_init();
    
//#line 13
final public static int
      _Program__Timer_max_counters =
      Program0.
        _Program__Timer_max_counters_init();
    
    
//#line 16
public static void
                  runMain(
                  ) {
        
//#line 17
Program0.
                      Program_runMain();
    }
    
    
//#line 19
public static int
                  _Program__RayTracer_alpha_init(
                  ) {
        
//#line 21
final int X10_TEMP210 =
          (Program0.
             Program__RayTracer_alpha_init());
        
//#line 22
return X10_TEMP210;
    }
    
    
//#line 24
public static Vec
                  _Program__RayTracer_voidVec_init(
                  ) {
        
//#line 26
final Vec X10_TEMP210 =
          (Program0.
             Program__RayTracer_voidVec_init());
        
//#line 27
return X10_TEMP210;
    }
    
    
//#line 29
public static int
                  _Program__Scene_maxObjects_init(
                  ) {
        
//#line 31
final int X10_TEMP210 =
          (Program0.
             Program__Scene_maxObjects_init());
        
//#line 32
return X10_TEMP210;
    }
    
    
//#line 34
public static int
                  _Program__Scene_maxLights_init(
                  ) {
        
//#line 36
final int X10_TEMP210 =
          (Program0.
             Program__Scene_maxLights_init());
        
//#line 37
return X10_TEMP210;
    }
    
    
//#line 39
public static int
                  _Program__Timer_max_counters_init(
                  ) {
        
//#line 41
final int X10_TEMP210 =
          (Program0.
             Program__Timer_max_counters_init());
        
//#line 42
return X10_TEMP210;
    }
    
    
//#line 44
public static java.
                  lang.
                  String
                  Program_Interval_toString(
                  final Interval X10_TEMP0) {
        
//#line 45
final int X10_TEMP210 =
          (X10_TEMP0.
             number);
        
//#line 47
final int X10_TEMP1 =
          (X10_TEMP210);
        
//#line 48
final java.
          lang.
          String X10_TEMP213 =
          (" ");
        
//#line 50
final java.
          lang.
          String X10_TEMP2 =
          (X10_TEMP213);
        
//#line 51
final java.
          lang.
          String X10_TEMP216 =
          (X10_TEMP1 +
           X10_TEMP2);
        
//#line 53
final java.
          lang.
          String X10_TEMP3 =
          (X10_TEMP216);
        
//#line 54
final int X10_TEMP219 =
          (X10_TEMP0.
             width);
        
//#line 56
final int X10_TEMP4 =
          (X10_TEMP219);
        
//#line 57
final java.
          lang.
          String X10_TEMP222 =
          (X10_TEMP3 +
           X10_TEMP4);
        
//#line 59
final java.
          lang.
          String X10_TEMP5 =
          (X10_TEMP222);
        
//#line 60
final java.
          lang.
          String X10_TEMP225 =
          (" ");
        
//#line 62
final java.
          lang.
          String X10_TEMP6 =
          (X10_TEMP225);
        
//#line 63
final java.
          lang.
          String X10_TEMP228 =
          (X10_TEMP5 +
           X10_TEMP6);
        
//#line 65
final java.
          lang.
          String X10_TEMP7 =
          (X10_TEMP228);
        
//#line 66
final int X10_TEMP231 =
          (X10_TEMP0.
             height);
        
//#line 68
final int X10_TEMP8 =
          (X10_TEMP231);
        
//#line 69
final java.
          lang.
          String X10_TEMP234 =
          (X10_TEMP7 +
           X10_TEMP8);
        
//#line 71
final java.
          lang.
          String X10_TEMP9 =
          (X10_TEMP234);
        
//#line 72
final java.
          lang.
          String X10_TEMP237 =
          (" ");
        
//#line 74
final java.
          lang.
          String X10_TEMP10 =
          (X10_TEMP237);
        
//#line 75
final java.
          lang.
          String X10_TEMP240 =
          (X10_TEMP9 +
           X10_TEMP10);
        
//#line 77
final java.
          lang.
          String X10_TEMP11 =
          (X10_TEMP240);
        
//#line 78
final int X10_TEMP243 =
          (X10_TEMP0.
             yfrom);
        
//#line 80
final int X10_TEMP12 =
          (X10_TEMP243);
        
//#line 81
final java.
          lang.
          String X10_TEMP246 =
          (X10_TEMP11 +
           X10_TEMP12);
        
//#line 83
final java.
          lang.
          String X10_TEMP13 =
          (X10_TEMP246);
        
//#line 84
final java.
          lang.
          String X10_TEMP249 =
          (" ");
        
//#line 86
final java.
          lang.
          String X10_TEMP14 =
          (X10_TEMP249);
        
//#line 87
final java.
          lang.
          String X10_TEMP252 =
          (X10_TEMP13 +
           X10_TEMP14);
        
//#line 89
final java.
          lang.
          String X10_TEMP15 =
          (X10_TEMP252);
        
//#line 90
final int X10_TEMP255 =
          (X10_TEMP0.
             yto);
        
//#line 92
final int X10_TEMP16 =
          (X10_TEMP255);
        
//#line 93
final java.
          lang.
          String X10_TEMP258 =
          (X10_TEMP15 +
           X10_TEMP16);
        
//#line 95
final java.
          lang.
          String X10_TEMP17 =
          (X10_TEMP258);
        
//#line 96
final java.
          lang.
          String X10_TEMP261 =
          (" ");
        
//#line 98
final java.
          lang.
          String X10_TEMP18 =
          (X10_TEMP261);
        
//#line 99
final java.
          lang.
          String X10_TEMP264 =
          (X10_TEMP17 +
           X10_TEMP18);
        
//#line 101
final java.
          lang.
          String X10_TEMP19 =
          (X10_TEMP264);
        
//#line 102
final int X10_TEMP267 =
          (X10_TEMP0.
             total);
        
//#line 104
final int X10_TEMP20 =
          (X10_TEMP267);
        
//#line 105
final java.
          lang.
          String X10_TEMP270 =
          (X10_TEMP19 +
           X10_TEMP20);
        
//#line 107
final java.
          lang.
          String X10_TEMP22 =
          (X10_TEMP270);
        
//#line 108
return X10_TEMP22;
    }
    
    
//#line 110
public static java.
                   lang.
                   String
                   Program_Light_toString(
                   final Light X10_TEMP0) {
        
//#line 111
final Vec X10_TEMP210 =
          (X10_TEMP0.
             pos);
        
//#line 113
final Vec X10_TEMP1 =
          (X10_TEMP210);
        
//#line 114
final java.
          lang.
          String X10_TEMP213 =
          (" ");
        
//#line 116
final java.
          lang.
          String X10_TEMP2 =
          (X10_TEMP213);
        
//#line 117
final java.
          lang.
          String X10_TEMP217 =
          (Program0.
             Program_Vec_toString(
             X10_TEMP1));
        
//#line 119
final java.
          lang.
          String X10_TEMP3 =
          (X10_TEMP217);
        
//#line 120
final java.
          lang.
          String X10_TEMP220 =
          (X10_TEMP3 +
           X10_TEMP2);
        
//#line 122
final java.
          lang.
          String X10_TEMP4 =
          (X10_TEMP220);
        
//#line 123
final double X10_TEMP223 =
          (X10_TEMP0.
             brightness);
        
//#line 125
final double X10_TEMP5 =
          (X10_TEMP223);
        
//#line 126
final java.
          lang.
          String X10_TEMP226 =
          (X10_TEMP4 +
           X10_TEMP5);
        
//#line 128
final java.
          lang.
          String X10_TEMP7 =
          (X10_TEMP226);
        
//#line 129
return X10_TEMP7;
    }
    
    
//#line 131
public static Ray
                   Program_Ray_d(
                   final Ray X10_TEMP0,
                   final Vec d_) {
        
//#line 132
final Vec X10_TEMP210 =
          (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.p);
        
//#line 134
Vec X10_TEMP4 =
          (X10_TEMP210);
        
//#line 135
final boolean X10_TEMP213 =
          (false);
        
//#line 137
boolean X10_TEMP5 =
          (X10_TEMP213);
        
//#line 138
final Ray X10_TEMP219 =
          (new Ray(
             X10_TEMP4,
             d_,
             X10_TEMP5));
        
//#line 140
final Ray X10_TEMP7 =
          (X10_TEMP219);
        
//#line 141
return X10_TEMP7;
    }
    
    
//#line 143
public static Vec
                   Program_Ray_rayPoint(
                   final Ray X10_TEMP0,
                   final double t) {
        
//#line 144
final Vec X10_TEMP210 =
          (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.p);
        
//#line 146
final Vec X10_TEMP1 =
          (X10_TEMP210);
        
//#line 147
final double X10_TEMP213 =
          (X10_TEMP1.
             x);
        
//#line 149
final double X10_TEMP4 =
          (X10_TEMP213);
        
//#line 150
final Vec X10_TEMP216 =
          (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.d);
        
//#line 152
final Vec X10_TEMP2 =
          (X10_TEMP216);
        
//#line 153
final double X10_TEMP219 =
          (X10_TEMP2.
             x);
        
//#line 155
final double X10_TEMP3 =
          (X10_TEMP219);
        
//#line 156
final double X10_TEMP222 =
          (X10_TEMP3 *
             t);
        
//#line 158
final double X10_TEMP5 =
          (X10_TEMP222);
        
//#line 159
final double X10_TEMP225 =
          (X10_TEMP4 +
             X10_TEMP5);
        
//#line 161
double X10_TEMP20 =
          (X10_TEMP225);
        
//#line 162
final Vec X10_TEMP228 =
          (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.p);
        
//#line 164
final Vec X10_TEMP7 =
          (X10_TEMP228);
        
//#line 165
final double X10_TEMP231 =
          (X10_TEMP7.
             y);
        
//#line 167
final double X10_TEMP10 =
          (X10_TEMP231);
        
//#line 168
final Vec X10_TEMP234 =
          (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.d);
        
//#line 170
final Vec X10_TEMP8 =
          (X10_TEMP234);
        
//#line 171
final double X10_TEMP237 =
          (X10_TEMP8.
             y);
        
//#line 173
final double X10_TEMP9 =
          (X10_TEMP237);
        
//#line 174
final double X10_TEMP240 =
          (X10_TEMP9 *
             t);
        
//#line 176
final double X10_TEMP11 =
          (X10_TEMP240);
        
//#line 177
final double X10_TEMP243 =
          (X10_TEMP10 +
             X10_TEMP11);
        
//#line 179
double X10_TEMP21 =
          (X10_TEMP243);
        
//#line 180
final Vec X10_TEMP246 =
          (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.p);
        
//#line 182
final Vec X10_TEMP13 =
          (X10_TEMP246);
        
//#line 183
final double X10_TEMP249 =
          (X10_TEMP13.
             z);
        
//#line 185
final double X10_TEMP16 =
          (X10_TEMP249);
        
//#line 186
final Vec X10_TEMP252 =
          (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.d);
        
//#line 188
final Vec X10_TEMP14 =
          (X10_TEMP252);
        
//#line 189
final double X10_TEMP255 =
          (X10_TEMP14.
             z);
        
//#line 191
final double X10_TEMP15 =
          (X10_TEMP255);
        
//#line 192
final double X10_TEMP258 =
          (X10_TEMP15 *
             t);
        
//#line 194
final double X10_TEMP17 =
          (X10_TEMP258);
        
//#line 195
final double X10_TEMP261 =
          (X10_TEMP16 +
             X10_TEMP17);
        
//#line 197
double X10_TEMP22 =
          (X10_TEMP261);
        
//#line 198
final boolean X10_TEMP264 =
          (false);
        
//#line 200
boolean X10_TEMP23 =
          (X10_TEMP264);
        
//#line 201
final Vec X10_TEMP271 =
          (new Vec(
             X10_TEMP20,
             X10_TEMP21,
             X10_TEMP22,
             X10_TEMP23));
        
//#line 203
final Vec X10_TEMP25 =
          (X10_TEMP271);
        
//#line 204
return X10_TEMP25;
    }
    
    
//#line 206
public static java.
                   lang.
                   String
                   Program_Ray_toString(
                   final Ray X10_TEMP0) {
        
//#line 207
final java.
          lang.
          String X10_TEMP210 =
          (" { ");
        
//#line 209
final java.
          lang.
          String X10_TEMP2 =
          (X10_TEMP210);
        
//#line 210
final Vec X10_TEMP213 =
          (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.p);
        
//#line 212
final Vec X10_TEMP1 =
          (X10_TEMP213);
        
//#line 213
final java.
          lang.
          String X10_TEMP217 =
          (Program0.
             Program_Vec_toString(
             X10_TEMP1));
        
//#line 215
final java.
          lang.
          String X10_TEMP3 =
          (X10_TEMP217);
        
//#line 216
final java.
          lang.
          String X10_TEMP220 =
          (X10_TEMP2 +
           X10_TEMP3);
        
//#line 218
final java.
          lang.
          String X10_TEMP4 =
          (X10_TEMP220);
        
//#line 219
final java.
          lang.
          String X10_TEMP223 =
          ("->");
        
//#line 221
final java.
          lang.
          String X10_TEMP5 =
          (X10_TEMP223);
        
//#line 222
final java.
          lang.
          String X10_TEMP226 =
          (X10_TEMP4 +
           X10_TEMP5);
        
//#line 224
final java.
          lang.
          String X10_TEMP7 =
          (X10_TEMP226);
        
//#line 225
final Vec X10_TEMP229 =
          (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.d);
        
//#line 227
final Vec X10_TEMP6 =
          (X10_TEMP229);
        
//#line 228
final java.
          lang.
          String X10_TEMP233 =
          (Program0.
             Program_Vec_toString(
             X10_TEMP6));
        
//#line 230
final java.
          lang.
          String X10_TEMP8 =
          (X10_TEMP233);
        
//#line 231
final java.
          lang.
          String X10_TEMP236 =
          (X10_TEMP7 +
           X10_TEMP8);
        
//#line 233
final java.
          lang.
          String X10_TEMP9 =
          (X10_TEMP236);
        
//#line 234
final java.
          lang.
          String X10_TEMP239 =
          (" } ");
        
//#line 236
final java.
          lang.
          String X10_TEMP10 =
          (X10_TEMP239);
        
//#line 237
final java.
          lang.
          String X10_TEMP242 =
          (X10_TEMP9 +
           X10_TEMP10);
        
//#line 239
final java.
          lang.
          String X10_TEMP12 =
          (X10_TEMP242);
        
//#line 240
return X10_TEMP12;
    }
    
    
//#line 242
public static void
                   Program_runMain(
                   ) {
        
//#line 243
final Timer X10_TEMP210 =
          (new Timer(
             ));
        
//#line 245
Timer tmr =
          (X10_TEMP210);
        
//#line 246
final int X10_TEMP213 =
          (0);
        
//#line 248
int count =
          (X10_TEMP213);
        
//#line 249
Program0.
                       Program_Timer_start(
                       tmr,
                       count);
        
//#line 250
final RayTracer X10_TEMP218 =
          (new RayTracer(
             ));
        
//#line 252
final RayTracer X10_TEMP4 =
          (X10_TEMP218);
        
//#line 253
Program0.
                       Program_RayTracer_run(
                       X10_TEMP4);
        
//#line 254
Program0.
                       Program_Timer_stop(
                       tmr,
                       count);
        
//#line 255
final java.
          lang.
          String X10_TEMP224 =
          ("Wall-clock time for raytracer: ");
        
//#line 257
final java.
          lang.
          String X10_TEMP7 =
          (X10_TEMP224);
        
//#line 258
final double X10_TEMP229 =
          (Program0.
             Program_Timer_readTimer(
             tmr,
             count));
        
//#line 260
final double X10_TEMP8 =
          (X10_TEMP229);
        
//#line 261
final java.
          lang.
          String X10_TEMP232 =
          (X10_TEMP7 +
           X10_TEMP8);
        
//#line 263
final java.
          lang.
          String X10_TEMP9 =
          (X10_TEMP232);
        
//#line 264
final java.
          lang.
          String X10_TEMP235 =
          (" secs");
        
//#line 266
final java.
          lang.
          String X10_TEMP10 =
          (X10_TEMP235);
        
//#line 267
final java.
          lang.
          String X10_TEMP238 =
          (X10_TEMP9 +
           X10_TEMP10);
        
//#line 269
final java.
          lang.
          String X10_TEMP12 =
          (X10_TEMP238);
        
//#line 270
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println(X10_TEMP12);
    }
    
    
//#line 272
public static Isect
                   Program_Sphere_intersect(
                   final Sphere X10_TEMP0,
                   final Ray ry) {
        
//#line 273
final Vec X10_TEMP210 =
          (X10_TEMP0.
             c);
        
//#line 275
final Vec X10_TEMP3 =
          (X10_TEMP210);
        
//#line 276
final Vec X10_TEMP213 =
          (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(ry))/* } */.p);
        
//#line 278
final Vec X10_TEMP4 =
          (X10_TEMP213);
        
//#line 279
final Vec X10_TEMP218 =
          (Program0.
             Program_Vec_sub(
             X10_TEMP3,
             X10_TEMP4));
        
//#line 281
Vec v =
          (X10_TEMP218);
        
//#line 282
final Vec X10_TEMP221 =
          (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(ry))/* } */.d);
        
//#line 284
final Vec X10_TEMP8 =
          (X10_TEMP221);
        
//#line 285
final double X10_TEMP226 =
          (Program0.
             Program_Vec_dot(
             v,
             X10_TEMP8));
        
//#line 287
double b =
          (X10_TEMP226);
        
//#line 288
final double X10_TEMP229 =
          (b *
             b);
        
//#line 290
final double X10_TEMP12 =
          (X10_TEMP229);
        
//#line 291
final double X10_TEMP234 =
          (Program0.
             Program_Vec_dot(
             v,
             v));
        
//#line 293
final double X10_TEMP13 =
          (X10_TEMP234);
        
//#line 294
final double X10_TEMP237 =
          (X10_TEMP12 -
             X10_TEMP13);
        
//#line 296
final double X10_TEMP14 =
          (X10_TEMP237);
        
//#line 297
final double X10_TEMP240 =
          (X10_TEMP0.
             r2);
        
//#line 299
final double X10_TEMP15 =
          (X10_TEMP240);
        
//#line 300
final double X10_TEMP243 =
          (X10_TEMP14 +
             X10_TEMP15);
        
//#line 302
double disc =
          (X10_TEMP243);
        
//#line 303
final double X10_TEMP246 =
          (0.0);
        
//#line 305
final double X10_TEMP17 =
          (X10_TEMP246);
        
//#line 306
final boolean X10_TEMP19 =
          (disc <
             X10_TEMP17);
        
//#line 307
if (X10_TEMP19) {
            
//#line 308
final double X10_TEMP251 =
              (0.0);
            
//#line 310
double X10_TEMP25 =
              (X10_TEMP251);
            
//#line 311
final int X10_TEMP254 =
              (0);
            
//#line 313
int X10_TEMP26 =
              (X10_TEMP254);
            
//#line 314
final boolean X10_TEMP257 =
              (true);
            
//#line 316
boolean X10_TEMP27 =
              (X10_TEMP257);
            
//#line 317
final Surface X10_TEMP260 =
              (X10_TEMP0.
                 surf);
            
//#line 319
Surface X10_TEMP28 =
              (X10_TEMP260);
            
//#line 320
final Isect X10_TEMP268 =
              (new Isect(
                 X10_TEMP25,
                 X10_TEMP26,
                 X10_TEMP27,
                 X10_TEMP0,
                 X10_TEMP28));
            
//#line 322
final Isect X10_TEMP30 =
              (X10_TEMP268);
            
//#line 323
return X10_TEMP30;
        }
        
//#line 325
final double X10_TEMP273 =
          (java.
             lang.
             Math.
             sqrt(
             disc));
        
//#line 327
final double X10_TEMP33 =
          (X10_TEMP273);
        
//#line 328
final double X10_TEMP276 =
          (X10_TEMP33);
        
//#line 330
disc =
          ((X10_TEMP276));
        
//#line 331
final double X10_TEMP279 =
          (b -
             disc);
        
//#line 333
final double X10_TEMP34 =
          (X10_TEMP279);
        
//#line 334
final double X10_TEMP282 =
          (1.0E-6);
        
//#line 336
final double X10_TEMP35 =
          (X10_TEMP282);
        
//#line 337
final boolean X10_TEMP285 =
          (X10_TEMP34 <
             X10_TEMP35);
        
//#line 339
final boolean X10_TEMP37 =
          (X10_TEMP285);
        
//#line 340
final boolean X10_TEMP38 =
          (X10_TEMP37);
        
//#line 341
double X10_TEMP41 =
          (b -
             disc);
        
//#line 342
if (X10_TEMP38) {
            
//#line 343
final double X10_TEMP291 =
              (b +
                 disc);
            
//#line 344
X10_TEMP41 =
              ((X10_TEMP291));
        }
        
//#line 346
final double X10_TEMP42 =
          (X10_TEMP41);
        
//#line 347
final double X10_TEMP294 =
          (X10_TEMP42);
        
//#line 349
double t =
          (X10_TEMP294);
        
//#line 350
final double X10_TEMP297 =
          (1.0E-6);
        
//#line 352
final double X10_TEMP43 =
          (X10_TEMP297);
        
//#line 353
final boolean X10_TEMP45 =
          (t <
             X10_TEMP43);
        
//#line 354
if (X10_TEMP45) {
            
//#line 355
final double X10_TEMP302 =
              (0.0);
            
//#line 357
double X10_TEMP51 =
              (X10_TEMP302);
            
//#line 358
final int X10_TEMP305 =
              (0);
            
//#line 360
int X10_TEMP52 =
              (X10_TEMP305);
            
//#line 361
final boolean X10_TEMP308 =
              (true);
            
//#line 363
boolean X10_TEMP53 =
              (X10_TEMP308);
            
//#line 364
final Surface X10_TEMP311 =
              (X10_TEMP0.
                 surf);
            
//#line 366
Surface X10_TEMP54 =
              (X10_TEMP311);
            
//#line 367
final Isect X10_TEMP319 =
              (new Isect(
                 X10_TEMP51,
                 X10_TEMP52,
                 X10_TEMP53,
                 X10_TEMP0,
                 X10_TEMP54));
            
//#line 369
final Isect X10_TEMP56 =
              (X10_TEMP319);
            
//#line 370
return X10_TEMP56;
        }
        
//#line 372
final double X10_TEMP325 =
          (Program0.
             Program_Vec_dot(
             v,
             v));
        
//#line 374
final double X10_TEMP62 =
          (X10_TEMP325);
        
//#line 375
final double X10_TEMP328 =
          (X10_TEMP0.
             r2);
        
//#line 377
final double X10_TEMP60 =
          (X10_TEMP328);
        
//#line 378
final double X10_TEMP331 =
          (1.0E-6);
        
//#line 380
final double X10_TEMP61 =
          (X10_TEMP331);
        
//#line 381
final double X10_TEMP334 =
          (X10_TEMP60 +
             X10_TEMP61);
        
//#line 383
final double X10_TEMP63 =
          (X10_TEMP334);
        
//#line 384
final boolean X10_TEMP64 =
          (X10_TEMP62 >
             X10_TEMP63);
        
//#line 385
int X10_TEMP67 =
          (0);
        
//#line 386
if (X10_TEMP64) {
            
//#line 387
final int X10_TEMP340 =
              (1);
            
//#line 388
X10_TEMP67 =
              ((X10_TEMP340));
        }
        
//#line 390
final int X10_TEMP68 =
          (X10_TEMP67);
        
//#line 391
final boolean X10_TEMP343 =
          (false);
        
//#line 393
boolean X10_TEMP72 =
          (X10_TEMP343);
        
//#line 394
final Surface X10_TEMP346 =
          (X10_TEMP0.
             surf);
        
//#line 396
Surface X10_TEMP73 =
          (X10_TEMP346);
        
//#line 397
final Isect X10_TEMP354 =
          (new Isect(
             t,
             X10_TEMP68,
             X10_TEMP72,
             X10_TEMP0,
             X10_TEMP73));
        
//#line 399
Isect ip =
          (X10_TEMP354);
        
//#line 400
return ip;
    }
    
    
//#line 402
public static Vec
                   Program_Sphere_normal(
                   final Sphere X10_TEMP0,
                   final Vec p) {
        
//#line 403
final Vec X10_TEMP210 =
          (X10_TEMP0.
             c);
        
//#line 405
final Vec X10_TEMP3 =
          (X10_TEMP210);
        
//#line 406
final Vec X10_TEMP215 =
          (Program0.
             Program_Vec_sub(
             p,
             X10_TEMP3));
        
//#line 408
final Vec X10_TEMP4 =
          (X10_TEMP215);
        
//#line 409
final Vec X10_TEMP219 =
          (Program0.
             Program_Vec_normalized(
             X10_TEMP4));
        
//#line 411
final Vec X10_TEMP6 =
          (X10_TEMP219);
        
//#line 412
return X10_TEMP6;
    }
    
    
//#line 414
public static java.
                   lang.
                   String
                   Program_Sphere_toString(
                   final Sphere X10_TEMP0) {
        
//#line 415
final java.
          lang.
          String X10_TEMP210 =
          ("Sphere {");
        
//#line 417
final java.
          lang.
          String X10_TEMP2 =
          (X10_TEMP210);
        
//#line 418
final Vec X10_TEMP213 =
          (X10_TEMP0.
             c);
        
//#line 420
final Vec X10_TEMP1 =
          (X10_TEMP213);
        
//#line 421
final java.
          lang.
          String X10_TEMP217 =
          (Program0.
             Program_Vec_toString(
             X10_TEMP1));
        
//#line 423
final java.
          lang.
          String X10_TEMP3 =
          (X10_TEMP217);
        
//#line 424
final java.
          lang.
          String X10_TEMP220 =
          (X10_TEMP2 +
           X10_TEMP3);
        
//#line 426
final java.
          lang.
          String X10_TEMP4 =
          (X10_TEMP220);
        
//#line 427
final java.
          lang.
          String X10_TEMP223 =
          (",");
        
//#line 429
final java.
          lang.
          String X10_TEMP5 =
          (X10_TEMP223);
        
//#line 430
final java.
          lang.
          String X10_TEMP226 =
          (X10_TEMP4 +
           X10_TEMP5);
        
//#line 432
final java.
          lang.
          String X10_TEMP6 =
          (X10_TEMP226);
        
//#line 433
final double X10_TEMP229 =
          (X10_TEMP0.
             r);
        
//#line 435
final double X10_TEMP7 =
          (X10_TEMP229);
        
//#line 436
final java.
          lang.
          String X10_TEMP232 =
          (X10_TEMP6 +
           X10_TEMP7);
        
//#line 438
final java.
          lang.
          String X10_TEMP8 =
          (X10_TEMP232);
        
//#line 439
final java.
          lang.
          String X10_TEMP235 =
          ("}");
        
//#line 441
final java.
          lang.
          String X10_TEMP9 =
          (X10_TEMP235);
        
//#line 442
final java.
          lang.
          String X10_TEMP238 =
          (X10_TEMP8 +
           X10_TEMP9);
        
//#line 444
final java.
          lang.
          String X10_TEMP11 =
          (X10_TEMP238);
        
//#line 445
return X10_TEMP11;
    }
    
    
//#line 447
public static Vec
                   Program_Sphere_getCenter(
                   final Sphere X10_TEMP0) {
        
//#line 448
final Vec X10_TEMP210 =
          (X10_TEMP0.
             c);
        
//#line 450
final Vec X10_TEMP2 =
          (X10_TEMP210);
        
//#line 451
return X10_TEMP2;
    }
    
    
//#line 453
public static Vec
                   Program_Vec_added(
                   final Vec X10_TEMP0,
                   final Vec a) {
        
//#line 454
final double X10_TEMP210 =
          (X10_TEMP0.
             x);
        
//#line 456
final double X10_TEMP1 =
          (X10_TEMP210);
        
//#line 457
final double X10_TEMP213 =
          (a.
             x);
        
//#line 459
final double X10_TEMP2 =
          (X10_TEMP213);
        
//#line 460
final double X10_TEMP216 =
          (X10_TEMP1 +
             X10_TEMP2);
        
//#line 462
double X10_TEMP11 =
          (X10_TEMP216);
        
//#line 463
final double X10_TEMP219 =
          (X10_TEMP0.
             y);
        
//#line 465
final double X10_TEMP4 =
          (X10_TEMP219);
        
//#line 466
final double X10_TEMP222 =
          (a.
             y);
        
//#line 468
final double X10_TEMP5 =
          (X10_TEMP222);
        
//#line 469
final double X10_TEMP225 =
          (X10_TEMP4 +
             X10_TEMP5);
        
//#line 471
double X10_TEMP12 =
          (X10_TEMP225);
        
//#line 472
final double X10_TEMP228 =
          (X10_TEMP0.
             z);
        
//#line 474
final double X10_TEMP7 =
          (X10_TEMP228);
        
//#line 475
final double X10_TEMP231 =
          (a.
             z);
        
//#line 477
final double X10_TEMP8 =
          (X10_TEMP231);
        
//#line 478
final double X10_TEMP234 =
          (X10_TEMP7 +
             X10_TEMP8);
        
//#line 480
double X10_TEMP13 =
          (X10_TEMP234);
        
//#line 481
final boolean X10_TEMP237 =
          (false);
        
//#line 483
boolean X10_TEMP14 =
          (X10_TEMP237);
        
//#line 484
final Vec X10_TEMP244 =
          (new Vec(
             X10_TEMP11,
             X10_TEMP12,
             X10_TEMP13,
             X10_TEMP14));
        
//#line 486
final Vec X10_TEMP16 =
          (X10_TEMP244);
        
//#line 487
return X10_TEMP16;
    }
    
    
//#line 489
public static Vec
                   Program_Vec_adds3(
                   final double s,
                   final Vec a,
                   final Vec b) {
        
//#line 490
final double X10_TEMP210 =
          (a.
             x);
        
//#line 492
final double X10_TEMP1 =
          (X10_TEMP210);
        
//#line 493
final double X10_TEMP213 =
          (s *
             X10_TEMP1);
        
//#line 495
final double X10_TEMP2 =
          (X10_TEMP213);
        
//#line 496
final double X10_TEMP216 =
          (b.
             x);
        
//#line 498
final double X10_TEMP3 =
          (X10_TEMP216);
        
//#line 499
final double X10_TEMP219 =
          (X10_TEMP2 +
             X10_TEMP3);
        
//#line 501
double X10_TEMP14 =
          (X10_TEMP219);
        
//#line 502
final double X10_TEMP222 =
          (a.
             y);
        
//#line 504
final double X10_TEMP5 =
          (X10_TEMP222);
        
//#line 505
final double X10_TEMP225 =
          (s *
             X10_TEMP5);
        
//#line 507
final double X10_TEMP6 =
          (X10_TEMP225);
        
//#line 508
final double X10_TEMP228 =
          (b.
             y);
        
//#line 510
final double X10_TEMP7 =
          (X10_TEMP228);
        
//#line 511
final double X10_TEMP231 =
          (X10_TEMP6 +
             X10_TEMP7);
        
//#line 513
double X10_TEMP15 =
          (X10_TEMP231);
        
//#line 514
final double X10_TEMP234 =
          (a.
             z);
        
//#line 516
final double X10_TEMP9 =
          (X10_TEMP234);
        
//#line 517
final double X10_TEMP237 =
          (s *
             X10_TEMP9);
        
//#line 519
final double X10_TEMP10 =
          (X10_TEMP237);
        
//#line 520
final double X10_TEMP240 =
          (b.
             z);
        
//#line 522
final double X10_TEMP11 =
          (X10_TEMP240);
        
//#line 523
final double X10_TEMP243 =
          (X10_TEMP10 +
             X10_TEMP11);
        
//#line 525
double X10_TEMP16 =
          (X10_TEMP243);
        
//#line 526
final boolean X10_TEMP246 =
          (false);
        
//#line 528
boolean X10_TEMP17 =
          (X10_TEMP246);
        
//#line 529
final Vec X10_TEMP253 =
          (new Vec(
             X10_TEMP14,
             X10_TEMP15,
             X10_TEMP16,
             X10_TEMP17));
        
//#line 531
final Vec X10_TEMP19 =
          (X10_TEMP253);
        
//#line 532
return X10_TEMP19;
    }
    
    
//#line 534
public static Vec
                   Program_Vec_adds2(
                   final Vec X10_TEMP0,
                   final double s,
                   final Vec b) {
        
//#line 535
final double X10_TEMP210 =
          (X10_TEMP0.
             x);
        
//#line 537
final double X10_TEMP2 =
          (X10_TEMP210);
        
//#line 538
final double X10_TEMP213 =
          (b.
             x);
        
//#line 540
final double X10_TEMP1 =
          (X10_TEMP213);
        
//#line 541
final double X10_TEMP216 =
          (s *
             X10_TEMP1);
        
//#line 543
final double X10_TEMP3 =
          (X10_TEMP216);
        
//#line 544
final double X10_TEMP219 =
          (X10_TEMP2 +
             X10_TEMP3);
        
//#line 546
double X10_TEMP14 =
          (X10_TEMP219);
        
//#line 547
final double X10_TEMP222 =
          (X10_TEMP0.
             y);
        
//#line 549
final double X10_TEMP6 =
          (X10_TEMP222);
        
//#line 550
final double X10_TEMP225 =
          (b.
             y);
        
//#line 552
final double X10_TEMP5 =
          (X10_TEMP225);
        
//#line 553
final double X10_TEMP228 =
          (s *
             X10_TEMP5);
        
//#line 555
final double X10_TEMP7 =
          (X10_TEMP228);
        
//#line 556
final double X10_TEMP231 =
          (X10_TEMP6 +
             X10_TEMP7);
        
//#line 558
double X10_TEMP15 =
          (X10_TEMP231);
        
//#line 559
final double X10_TEMP234 =
          (X10_TEMP0.
             z);
        
//#line 561
final double X10_TEMP10 =
          (X10_TEMP234);
        
//#line 562
final double X10_TEMP237 =
          (b.
             z);
        
//#line 564
final double X10_TEMP9 =
          (X10_TEMP237);
        
//#line 565
final double X10_TEMP240 =
          (s *
             X10_TEMP9);
        
//#line 567
final double X10_TEMP11 =
          (X10_TEMP240);
        
//#line 568
final double X10_TEMP243 =
          (X10_TEMP10 +
             X10_TEMP11);
        
//#line 570
double X10_TEMP16 =
          (X10_TEMP243);
        
//#line 571
final boolean X10_TEMP246 =
          (false);
        
//#line 573
boolean X10_TEMP17 =
          (X10_TEMP246);
        
//#line 574
final Vec X10_TEMP253 =
          (new Vec(
             X10_TEMP14,
             X10_TEMP15,
             X10_TEMP16,
             X10_TEMP17));
        
//#line 576
final Vec X10_TEMP19 =
          (X10_TEMP253);
        
//#line 577
return X10_TEMP19;
    }
    
    
//#line 579
public static Vec
                   Program_Vec_sub(
                   final Vec a,
                   final Vec b) {
        
//#line 580
final double X10_TEMP210 =
          (a.
             x);
        
//#line 582
final double X10_TEMP1 =
          (X10_TEMP210);
        
//#line 583
final double X10_TEMP213 =
          (b.
             x);
        
//#line 585
final double X10_TEMP2 =
          (X10_TEMP213);
        
//#line 586
final double X10_TEMP216 =
          (X10_TEMP1 -
             X10_TEMP2);
        
//#line 588
double X10_TEMP11 =
          (X10_TEMP216);
        
//#line 589
final double X10_TEMP219 =
          (a.
             y);
        
//#line 591
final double X10_TEMP4 =
          (X10_TEMP219);
        
//#line 592
final double X10_TEMP222 =
          (b.
             y);
        
//#line 594
final double X10_TEMP5 =
          (X10_TEMP222);
        
//#line 595
final double X10_TEMP225 =
          (X10_TEMP4 -
             X10_TEMP5);
        
//#line 597
double X10_TEMP12 =
          (X10_TEMP225);
        
//#line 598
final double X10_TEMP228 =
          (a.
             z);
        
//#line 600
final double X10_TEMP7 =
          (X10_TEMP228);
        
//#line 601
final double X10_TEMP231 =
          (b.
             z);
        
//#line 603
final double X10_TEMP8 =
          (X10_TEMP231);
        
//#line 604
final double X10_TEMP234 =
          (X10_TEMP7 -
             X10_TEMP8);
        
//#line 606
double X10_TEMP13 =
          (X10_TEMP234);
        
//#line 607
final boolean X10_TEMP237 =
          (false);
        
//#line 609
boolean X10_TEMP14 =
          (X10_TEMP237);
        
//#line 610
final Vec X10_TEMP244 =
          (new Vec(
             X10_TEMP11,
             X10_TEMP12,
             X10_TEMP13,
             X10_TEMP14));
        
//#line 612
final Vec X10_TEMP16 =
          (X10_TEMP244);
        
//#line 613
return X10_TEMP16;
    }
    
    
//#line 615
public static Vec
                   Program_Vec_mult(
                   final Vec a,
                   final Vec b) {
        
//#line 616
final double X10_TEMP210 =
          (a.
             x);
        
//#line 618
final double X10_TEMP1 =
          (X10_TEMP210);
        
//#line 619
final double X10_TEMP213 =
          (b.
             x);
        
//#line 621
final double X10_TEMP2 =
          (X10_TEMP213);
        
//#line 622
final double X10_TEMP216 =
          (X10_TEMP1 *
             X10_TEMP2);
        
//#line 624
double X10_TEMP11 =
          (X10_TEMP216);
        
//#line 625
final double X10_TEMP219 =
          (a.
             y);
        
//#line 627
final double X10_TEMP4 =
          (X10_TEMP219);
        
//#line 628
final double X10_TEMP222 =
          (b.
             y);
        
//#line 630
final double X10_TEMP5 =
          (X10_TEMP222);
        
//#line 631
final double X10_TEMP225 =
          (X10_TEMP4 *
             X10_TEMP5);
        
//#line 633
double X10_TEMP12 =
          (X10_TEMP225);
        
//#line 634
final double X10_TEMP228 =
          (a.
             z);
        
//#line 636
final double X10_TEMP7 =
          (X10_TEMP228);
        
//#line 637
final double X10_TEMP231 =
          (b.
             z);
        
//#line 639
final double X10_TEMP8 =
          (X10_TEMP231);
        
//#line 640
final double X10_TEMP234 =
          (X10_TEMP7 *
             X10_TEMP8);
        
//#line 642
double X10_TEMP13 =
          (X10_TEMP234);
        
//#line 643
final boolean X10_TEMP237 =
          (false);
        
//#line 645
boolean X10_TEMP14 =
          (X10_TEMP237);
        
//#line 646
final Vec X10_TEMP244 =
          (new Vec(
             X10_TEMP11,
             X10_TEMP12,
             X10_TEMP13,
             X10_TEMP14));
        
//#line 648
final Vec X10_TEMP16 =
          (X10_TEMP244);
        
//#line 649
return X10_TEMP16;
    }
    
    
//#line 651
public static Vec
                   Program_Vec_cross(
                   final Vec a,
                   final Vec b) {
        
//#line 652
final double X10_TEMP210 =
          (a.
             y);
        
//#line 654
final double X10_TEMP1 =
          (X10_TEMP210);
        
//#line 655
final double X10_TEMP213 =
          (b.
             z);
        
//#line 657
final double X10_TEMP2 =
          (X10_TEMP213);
        
//#line 658
final double X10_TEMP216 =
          (X10_TEMP1 *
             X10_TEMP2);
        
//#line 660
final double X10_TEMP5 =
          (X10_TEMP216);
        
//#line 661
final double X10_TEMP219 =
          (a.
             z);
        
//#line 663
final double X10_TEMP3 =
          (X10_TEMP219);
        
//#line 664
final double X10_TEMP222 =
          (b.
             y);
        
//#line 666
final double X10_TEMP4 =
          (X10_TEMP222);
        
//#line 667
final double X10_TEMP225 =
          (X10_TEMP3 *
             X10_TEMP4);
        
//#line 669
final double X10_TEMP6 =
          (X10_TEMP225);
        
//#line 670
final double X10_TEMP228 =
          (X10_TEMP5 -
             X10_TEMP6);
        
//#line 672
double X10_TEMP23 =
          (X10_TEMP228);
        
//#line 673
final double X10_TEMP231 =
          (a.
             z);
        
//#line 675
final double X10_TEMP8 =
          (X10_TEMP231);
        
//#line 676
final double X10_TEMP234 =
          (b.
             x);
        
//#line 678
final double X10_TEMP9 =
          (X10_TEMP234);
        
//#line 679
final double X10_TEMP237 =
          (X10_TEMP8 *
             X10_TEMP9);
        
//#line 681
final double X10_TEMP12 =
          (X10_TEMP237);
        
//#line 682
final double X10_TEMP240 =
          (a.
             x);
        
//#line 684
final double X10_TEMP10 =
          (X10_TEMP240);
        
//#line 685
final double X10_TEMP243 =
          (b.
             z);
        
//#line 687
final double X10_TEMP11 =
          (X10_TEMP243);
        
//#line 688
final double X10_TEMP246 =
          (X10_TEMP10 *
             X10_TEMP11);
        
//#line 690
final double X10_TEMP13 =
          (X10_TEMP246);
        
//#line 691
final double X10_TEMP249 =
          (X10_TEMP12 -
             X10_TEMP13);
        
//#line 693
double X10_TEMP24 =
          (X10_TEMP249);
        
//#line 694
final double X10_TEMP252 =
          (a.
             x);
        
//#line 696
final double X10_TEMP15 =
          (X10_TEMP252);
        
//#line 697
final double X10_TEMP255 =
          (b.
             y);
        
//#line 699
final double X10_TEMP16 =
          (X10_TEMP255);
        
//#line 700
final double X10_TEMP258 =
          (X10_TEMP15 *
             X10_TEMP16);
        
//#line 702
final double X10_TEMP19 =
          (X10_TEMP258);
        
//#line 703
final double X10_TEMP261 =
          (a.
             y);
        
//#line 705
final double X10_TEMP17 =
          (X10_TEMP261);
        
//#line 706
final double X10_TEMP264 =
          (b.
             x);
        
//#line 708
final double X10_TEMP18 =
          (X10_TEMP264);
        
//#line 709
final double X10_TEMP267 =
          (X10_TEMP17 *
             X10_TEMP18);
        
//#line 711
final double X10_TEMP20 =
          (X10_TEMP267);
        
//#line 712
final double X10_TEMP270 =
          (X10_TEMP19 -
             X10_TEMP20);
        
//#line 714
double X10_TEMP25 =
          (X10_TEMP270);
        
//#line 715
final boolean X10_TEMP273 =
          (false);
        
//#line 717
boolean X10_TEMP26 =
          (X10_TEMP273);
        
//#line 718
final Vec X10_TEMP280 =
          (new Vec(
             X10_TEMP23,
             X10_TEMP24,
             X10_TEMP25,
             X10_TEMP26));
        
//#line 720
final Vec X10_TEMP28 =
          (X10_TEMP280);
        
//#line 721
return X10_TEMP28;
    }
    
    
//#line 723
public static double
                   Program_Vec_dot(
                   final Vec a,
                   final Vec b) {
        
//#line 724
final double X10_TEMP210 =
          (a.
             x);
        
//#line 726
final double X10_TEMP1 =
          (X10_TEMP210);
        
//#line 727
final double X10_TEMP213 =
          (b.
             x);
        
//#line 729
final double X10_TEMP2 =
          (X10_TEMP213);
        
//#line 730
final double X10_TEMP216 =
          (X10_TEMP1 *
             X10_TEMP2);
        
//#line 732
final double X10_TEMP5 =
          (X10_TEMP216);
        
//#line 733
final double X10_TEMP219 =
          (a.
             y);
        
//#line 735
final double X10_TEMP3 =
          (X10_TEMP219);
        
//#line 736
final double X10_TEMP222 =
          (b.
             y);
        
//#line 738
final double X10_TEMP4 =
          (X10_TEMP222);
        
//#line 739
final double X10_TEMP225 =
          (X10_TEMP3 *
             X10_TEMP4);
        
//#line 741
final double X10_TEMP6 =
          (X10_TEMP225);
        
//#line 742
final double X10_TEMP228 =
          (X10_TEMP5 +
             X10_TEMP6);
        
//#line 744
final double X10_TEMP9 =
          (X10_TEMP228);
        
//#line 745
final double X10_TEMP231 =
          (a.
             z);
        
//#line 747
final double X10_TEMP7 =
          (X10_TEMP231);
        
//#line 748
final double X10_TEMP234 =
          (b.
             z);
        
//#line 750
final double X10_TEMP8 =
          (X10_TEMP234);
        
//#line 751
final double X10_TEMP237 =
          (X10_TEMP7 *
             X10_TEMP8);
        
//#line 753
final double X10_TEMP10 =
          (X10_TEMP237);
        
//#line 754
final double X10_TEMP240 =
          (X10_TEMP9 +
             X10_TEMP10);
        
//#line 756
final double X10_TEMP12 =
          (X10_TEMP240);
        
//#line 757
return X10_TEMP12;
    }
    
    
//#line 759
public static Vec
                   Program_Vec_comb(
                   final double a,
                   final Vec A,
                   final double b,
                   final Vec B) {
        
//#line 760
final double X10_TEMP210 =
          (A.
             x);
        
//#line 762
final double X10_TEMP1 =
          (X10_TEMP210);
        
//#line 763
final double X10_TEMP213 =
          (a *
             X10_TEMP1);
        
//#line 765
final double X10_TEMP3 =
          (X10_TEMP213);
        
//#line 766
final double X10_TEMP216 =
          (B.
             x);
        
//#line 768
final double X10_TEMP2 =
          (X10_TEMP216);
        
//#line 769
final double X10_TEMP219 =
          (b *
             X10_TEMP2);
        
//#line 771
final double X10_TEMP4 =
          (X10_TEMP219);
        
//#line 772
final double X10_TEMP222 =
          (X10_TEMP3 +
             X10_TEMP4);
        
//#line 774
double X10_TEMP17 =
          (X10_TEMP222);
        
//#line 775
final double X10_TEMP225 =
          (A.
             y);
        
//#line 777
final double X10_TEMP6 =
          (X10_TEMP225);
        
//#line 778
final double X10_TEMP228 =
          (a *
             X10_TEMP6);
        
//#line 780
final double X10_TEMP8 =
          (X10_TEMP228);
        
//#line 781
final double X10_TEMP231 =
          (B.
             y);
        
//#line 783
final double X10_TEMP7 =
          (X10_TEMP231);
        
//#line 784
final double X10_TEMP234 =
          (b *
             X10_TEMP7);
        
//#line 786
final double X10_TEMP9 =
          (X10_TEMP234);
        
//#line 787
final double X10_TEMP237 =
          (X10_TEMP8 +
             X10_TEMP9);
        
//#line 789
double X10_TEMP18 =
          (X10_TEMP237);
        
//#line 790
final double X10_TEMP240 =
          (A.
             z);
        
//#line 792
final double X10_TEMP11 =
          (X10_TEMP240);
        
//#line 793
final double X10_TEMP243 =
          (a *
             X10_TEMP11);
        
//#line 795
final double X10_TEMP13 =
          (X10_TEMP243);
        
//#line 796
final double X10_TEMP246 =
          (B.
             z);
        
//#line 798
final double X10_TEMP12 =
          (X10_TEMP246);
        
//#line 799
final double X10_TEMP249 =
          (b *
             X10_TEMP12);
        
//#line 801
final double X10_TEMP14 =
          (X10_TEMP249);
        
//#line 802
final double X10_TEMP252 =
          (X10_TEMP13 +
             X10_TEMP14);
        
//#line 804
double X10_TEMP19 =
          (X10_TEMP252);
        
//#line 805
final boolean X10_TEMP255 =
          (false);
        
//#line 807
boolean X10_TEMP20 =
          (X10_TEMP255);
        
//#line 808
final Vec X10_TEMP262 =
          (new Vec(
             X10_TEMP17,
             X10_TEMP18,
             X10_TEMP19,
             X10_TEMP20));
        
//#line 810
final Vec X10_TEMP22 =
          (X10_TEMP262);
        
//#line 811
return X10_TEMP22;
    }
    
    
//#line 813
public static Vec
                   Program_Vec_scale(
                   final Vec X10_TEMP0,
                   final double t) {
        
//#line 814
final double X10_TEMP210 =
          (X10_TEMP0.
             x);
        
//#line 816
final double X10_TEMP1 =
          (X10_TEMP210);
        
//#line 817
final double X10_TEMP213 =
          (X10_TEMP1 *
             t);
        
//#line 819
double X10_TEMP8 =
          (X10_TEMP213);
        
//#line 820
final double X10_TEMP216 =
          (X10_TEMP0.
             y);
        
//#line 822
final double X10_TEMP3 =
          (X10_TEMP216);
        
//#line 823
final double X10_TEMP219 =
          (X10_TEMP3 *
             t);
        
//#line 825
double X10_TEMP9 =
          (X10_TEMP219);
        
//#line 826
final double X10_TEMP222 =
          (X10_TEMP0.
             z);
        
//#line 828
final double X10_TEMP5 =
          (X10_TEMP222);
        
//#line 829
final double X10_TEMP225 =
          (X10_TEMP5 *
             t);
        
//#line 831
double X10_TEMP10 =
          (X10_TEMP225);
        
//#line 832
final boolean X10_TEMP228 =
          (false);
        
//#line 834
boolean X10_TEMP11 =
          (X10_TEMP228);
        
//#line 835
final Vec X10_TEMP235 =
          (new Vec(
             X10_TEMP8,
             X10_TEMP9,
             X10_TEMP10,
             X10_TEMP11));
        
//#line 837
final Vec X10_TEMP13 =
          (X10_TEMP235);
        
//#line 838
return X10_TEMP13;
    }
    
    
//#line 840
public static Vec
                   Program_Vec_negate(
                   final Vec X10_TEMP0) {
        
//#line 841
final double X10_TEMP210 =
          (X10_TEMP0.
             x);
        
//#line 843
final double X10_TEMP1 =
          (X10_TEMP210);
        
//#line 844
final int X10_TEMP2 =
          (0);
        
//#line 845
final double X10_TEMP214 =
          (X10_TEMP2 -
             X10_TEMP1);
        
//#line 847
double X10_TEMP11 =
          (X10_TEMP214);
        
//#line 848
final double X10_TEMP217 =
          (X10_TEMP0.
             y);
        
//#line 850
final double X10_TEMP4 =
          (X10_TEMP217);
        
//#line 851
final int X10_TEMP5 =
          (0);
        
//#line 852
final double X10_TEMP221 =
          (X10_TEMP5 -
             X10_TEMP4);
        
//#line 854
double X10_TEMP12 =
          (X10_TEMP221);
        
//#line 855
final double X10_TEMP224 =
          (X10_TEMP0.
             z);
        
//#line 857
final double X10_TEMP7 =
          (X10_TEMP224);
        
//#line 858
final int X10_TEMP8 =
          (0);
        
//#line 859
final double X10_TEMP228 =
          (X10_TEMP8 -
             X10_TEMP7);
        
//#line 861
double X10_TEMP13 =
          (X10_TEMP228);
        
//#line 862
final boolean X10_TEMP231 =
          (false);
        
//#line 864
boolean X10_TEMP14 =
          (X10_TEMP231);
        
//#line 865
final Vec X10_TEMP238 =
          (new Vec(
             X10_TEMP11,
             X10_TEMP12,
             X10_TEMP13,
             X10_TEMP14));
        
//#line 867
final Vec X10_TEMP16 =
          (X10_TEMP238);
        
//#line 868
return X10_TEMP16;
    }
    
    
//#line 870
public static Vec
                   Program_Vec_normalized(
                   final Vec X10_TEMP0) {
        
//#line 871
final double X10_TEMP210 =
          (X10_TEMP0.
             x);
        
//#line 873
final double X10_TEMP1 =
          (X10_TEMP210);
        
//#line 874
final double X10_TEMP213 =
          (X10_TEMP0.
             x);
        
//#line 876
final double X10_TEMP2 =
          (X10_TEMP213);
        
//#line 877
final double X10_TEMP216 =
          (X10_TEMP1 *
             X10_TEMP2);
        
//#line 879
final double X10_TEMP5 =
          (X10_TEMP216);
        
//#line 880
final double X10_TEMP219 =
          (X10_TEMP0.
             y);
        
//#line 882
final double X10_TEMP3 =
          (X10_TEMP219);
        
//#line 883
final double X10_TEMP222 =
          (X10_TEMP0.
             y);
        
//#line 885
final double X10_TEMP4 =
          (X10_TEMP222);
        
//#line 886
final double X10_TEMP225 =
          (X10_TEMP3 *
             X10_TEMP4);
        
//#line 888
final double X10_TEMP6 =
          (X10_TEMP225);
        
//#line 889
final double X10_TEMP228 =
          (X10_TEMP5 +
             X10_TEMP6);
        
//#line 891
final double X10_TEMP9 =
          (X10_TEMP228);
        
//#line 892
final double X10_TEMP231 =
          (X10_TEMP0.
             z);
        
//#line 894
final double X10_TEMP7 =
          (X10_TEMP231);
        
//#line 895
final double X10_TEMP234 =
          (X10_TEMP0.
             z);
        
//#line 897
final double X10_TEMP8 =
          (X10_TEMP234);
        
//#line 898
final double X10_TEMP237 =
          (X10_TEMP7 *
             X10_TEMP8);
        
//#line 900
final double X10_TEMP10 =
          (X10_TEMP237);
        
//#line 901
final double X10_TEMP240 =
          (X10_TEMP9 +
             X10_TEMP10);
        
//#line 903
final double X10_TEMP12 =
          (X10_TEMP240);
        
//#line 904
final double X10_TEMP244 =
          (java.
             lang.
             Math.
             sqrt(
             X10_TEMP12));
        
//#line 906
double len =
          (X10_TEMP244);
        
//#line 907
final double X10_TEMP247 =
          (0.0);
        
//#line 909
final double X10_TEMP14 =
          (X10_TEMP247);
        
//#line 910
final boolean X10_TEMP250 =
          (len >
             X10_TEMP14);
        
//#line 912
final boolean X10_TEMP16 =
          (X10_TEMP250);
        
//#line 913
final boolean X10_TEMP17 =
          (X10_TEMP16);
        
//#line 914
final double X10_TEMP254 =
          (X10_TEMP0.
             x);
        
//#line 916
final double X10_TEMP18 =
          (X10_TEMP254);
        
//#line 917
final double X10_TEMP257 =
          (X10_TEMP18 /
             len);
        
//#line 919
double X10_TEMP25 =
          (X10_TEMP257);
        
//#line 920
final double X10_TEMP260 =
          (X10_TEMP0.
             y);
        
//#line 922
final double X10_TEMP20 =
          (X10_TEMP260);
        
//#line 923
final double X10_TEMP263 =
          (X10_TEMP20 /
             len);
        
//#line 925
double X10_TEMP26 =
          (X10_TEMP263);
        
//#line 926
final double X10_TEMP266 =
          (X10_TEMP0.
             z);
        
//#line 928
final double X10_TEMP22 =
          (X10_TEMP266);
        
//#line 929
final double X10_TEMP269 =
          (X10_TEMP22 /
             len);
        
//#line 931
double X10_TEMP27 =
          (X10_TEMP269);
        
//#line 932
final boolean X10_TEMP272 =
          (false);
        
//#line 934
boolean X10_TEMP28 =
          (X10_TEMP272);
        
//#line 935
Vec X10_TEMP31 =
          (X10_TEMP0);
        
//#line 936
if (X10_TEMP17) {
            
//#line 937
final Vec X10_TEMP281 =
              (new Vec(
                 X10_TEMP25,
                 X10_TEMP26,
                 X10_TEMP27,
                 X10_TEMP28));
            
//#line 938
X10_TEMP31 =
              ((X10_TEMP281));
        }
        
//#line 940
final Vec X10_TEMP32 =
          (X10_TEMP31);
        
//#line 941
return X10_TEMP32;
    }
    
    
//#line 943
public static double
                   Program_Vec_length(
                   final Vec X10_TEMP0) {
        
//#line 944
final double X10_TEMP210 =
          (X10_TEMP0.
             x);
        
//#line 946
final double X10_TEMP1 =
          (X10_TEMP210);
        
//#line 947
final double X10_TEMP213 =
          (X10_TEMP0.
             x);
        
//#line 949
final double X10_TEMP2 =
          (X10_TEMP213);
        
//#line 950
final double X10_TEMP216 =
          (X10_TEMP1 *
             X10_TEMP2);
        
//#line 952
final double X10_TEMP5 =
          (X10_TEMP216);
        
//#line 953
final double X10_TEMP219 =
          (X10_TEMP0.
             y);
        
//#line 955
final double X10_TEMP3 =
          (X10_TEMP219);
        
//#line 956
final double X10_TEMP222 =
          (X10_TEMP0.
             y);
        
//#line 958
final double X10_TEMP4 =
          (X10_TEMP222);
        
//#line 959
final double X10_TEMP225 =
          (X10_TEMP3 *
             X10_TEMP4);
        
//#line 961
final double X10_TEMP6 =
          (X10_TEMP225);
        
//#line 962
final double X10_TEMP228 =
          (X10_TEMP5 +
             X10_TEMP6);
        
//#line 964
final double X10_TEMP9 =
          (X10_TEMP228);
        
//#line 965
final double X10_TEMP231 =
          (X10_TEMP0.
             z);
        
//#line 967
final double X10_TEMP7 =
          (X10_TEMP231);
        
//#line 968
final double X10_TEMP234 =
          (X10_TEMP0.
             z);
        
//#line 970
final double X10_TEMP8 =
          (X10_TEMP234);
        
//#line 971
final double X10_TEMP237 =
          (X10_TEMP7 *
             X10_TEMP8);
        
//#line 973
final double X10_TEMP10 =
          (X10_TEMP237);
        
//#line 974
final double X10_TEMP240 =
          (X10_TEMP9 +
             X10_TEMP10);
        
//#line 976
final double X10_TEMP12 =
          (X10_TEMP240);
        
//#line 977
final double X10_TEMP244 =
          (java.
             lang.
             Math.
             sqrt(
             X10_TEMP12));
        
//#line 979
final double X10_TEMP14 =
          (X10_TEMP244);
        
//#line 980
return X10_TEMP14;
    }
    
    
//#line 982
public static java.
                   lang.
                   String
                   Program_Vec_toString(
                   final Vec X10_TEMP0) {
        
//#line 983
final java.
          lang.
          String X10_TEMP210 =
          ("<");
        
//#line 985
final java.
          lang.
          String X10_TEMP1 =
          (X10_TEMP210);
        
//#line 986
final double X10_TEMP213 =
          (X10_TEMP0.
             x);
        
//#line 988
final double X10_TEMP2 =
          (X10_TEMP213);
        
//#line 989
final java.
          lang.
          String X10_TEMP216 =
          (X10_TEMP1 +
           X10_TEMP2);
        
//#line 991
final java.
          lang.
          String X10_TEMP3 =
          (X10_TEMP216);
        
//#line 992
final java.
          lang.
          String X10_TEMP219 =
          (",");
        
//#line 994
final java.
          lang.
          String X10_TEMP4 =
          (X10_TEMP219);
        
//#line 995
final java.
          lang.
          String X10_TEMP222 =
          (X10_TEMP3 +
           X10_TEMP4);
        
//#line 997
final java.
          lang.
          String X10_TEMP5 =
          (X10_TEMP222);
        
//#line 998
final double X10_TEMP225 =
          (X10_TEMP0.
             y);
        
//#line 1000
final double X10_TEMP6 =
          (X10_TEMP225);
        
//#line 1001
final java.
          lang.
          String X10_TEMP228 =
          (X10_TEMP5 +
           X10_TEMP6);
        
//#line 1003
final java.
          lang.
          String X10_TEMP7 =
          (X10_TEMP228);
        
//#line 1004
final java.
          lang.
          String X10_TEMP231 =
          (",");
        
//#line 1006
final java.
          lang.
          String X10_TEMP8 =
          (X10_TEMP231);
        
//#line 1007
final java.
          lang.
          String X10_TEMP234 =
          (X10_TEMP7 +
           X10_TEMP8);
        
//#line 1009
final java.
          lang.
          String X10_TEMP9 =
          (X10_TEMP234);
        
//#line 1010
final double X10_TEMP237 =
          (X10_TEMP0.
             z);
        
//#line 1012
final double X10_TEMP10 =
          (X10_TEMP237);
        
//#line 1013
final java.
          lang.
          String X10_TEMP240 =
          (X10_TEMP9 +
           X10_TEMP10);
        
//#line 1015
final java.
          lang.
          String X10_TEMP11 =
          (X10_TEMP240);
        
//#line 1016
final java.
          lang.
          String X10_TEMP243 =
          (">");
        
//#line 1018
final java.
          lang.
          String X10_TEMP12 =
          (X10_TEMP243);
        
//#line 1019
final java.
          lang.
          String X10_TEMP246 =
          (X10_TEMP11 +
           X10_TEMP12);
        
//#line 1021
final java.
          lang.
          String X10_TEMP14 =
          (X10_TEMP246);
        
//#line 1022
return X10_TEMP14;
    }
    
    
//#line 1024
public static int
                    Program__RayTracer_alpha_init(
                    ) {
        
//#line 1025
final int X10_TEMP210 =
          (255);
        
//#line 1027
final int X10_TEMP1 =
          (X10_TEMP210);
        
//#line 1028
final int X10_TEMP213 =
          (24);
        
//#line 1030
final int X10_TEMP2 =
          (X10_TEMP213);
        
//#line 1031
final int X10_TEMP216 =
          (X10_TEMP1 <<
             X10_TEMP2);
        
//#line 1033
final int X10_TEMP4 =
          (X10_TEMP216);
        
//#line 1034
return X10_TEMP4;
    }
    
    
//#line 1036
public static Vec
                    Program__RayTracer_voidVec_init(
                    ) {
        
//#line 1037
final Vec X10_TEMP210 =
          (new Vec(
             ));
        
//#line 1039
final Vec X10_TEMP2 =
          (X10_TEMP210);
        
//#line 1040
return X10_TEMP2;
    }
    
    
//#line 1042
public static void
                    Program_RayTracer_JGFsetsize(
                    final RayTracer X10_TEMP0,
                    final int size_t) {
        
//#line 1043
final int X10_TEMP210 =
          (0);
        
//#line 1045
final long X10_TEMP3 =
          (X10_TEMP210);
        
//#line 1046
final long X10_TEMP213 =
          (X10_TEMP3);
        
//#line 1048
final long X10_TEMP4 =
          (X10_TEMP213);
        
//#line 1049
final long X10_TEMP216 =
          (X10_TEMP4);
        
//#line 1051
final long X10_TEMP219 =
          (X10_TEMP216);
        
//#line 1052
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.checksum =
          ((X10_TEMP219));
        
//#line 1053
final int X10_TEMP221 =
          (0);
        
//#line 1055
final int X10_TEMP7 =
          (X10_TEMP221);
        
//#line 1056
final int X10_TEMP224 =
          (1);
        
//#line 1058
final int X10_TEMP8 =
          (X10_TEMP224);
        
//#line 1059
final x10.
          lang.
          region X10_TEMP229 =
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
                  X10_TEMP7,
                  X10_TEMP8))));
        
//#line 1061
final x10.
          lang.
          region X10_TEMP9 =
          (x10.
            lang.
            region)
            ((X10_TEMP229));
        
//#line 1062
final x10.
          lang.
          place X10_TEMP232 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1064
final x10.
          lang.
          place X10_TEMP10 =
          (X10_TEMP232);
        
//#line 1065
final x10.
          lang.
          dist X10_TEMP235 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                X10_TEMP9,
                X10_TEMP10)));
        
//#line 1067
x10.
          lang.
          dist d1 =
          (x10.
            lang.
            dist)
            ((X10_TEMP235));
        
//#line 1068
final x10.
          lang.
          IntReferenceArray X10_TEMP238 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(d1,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1070
final x10.
          lang.
          IntReferenceArray X10_TEMP14 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP238));
        
//#line 1071
final x10.
          lang.
          IntReferenceArray X10_TEMP241 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP14));
        
//#line 1073
final x10.
          lang.
          IntReferenceArray X10_TEMP15 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP241));
        
//#line 1074
final x10.
          lang.
          IntReferenceArray X10_TEMP244 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP15));
        
//#line 1076
final x10.
          lang.
          IntReferenceArray X10_TEMP247 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP244));
        
//#line 1077
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.datasizes =
          ((X10_TEMP247));
        
//#line 1078
final x10.
          lang.
          IntReferenceArray X10_TEMP249 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.datasizes));
        
//#line 1080
final x10.
          lang.
          IntReferenceArray X10_TEMP16 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP249));
        
//#line 1081
final int X10_TEMP252 =
          (0);
        
//#line 1083
final int X10_TEMP18 =
          (X10_TEMP252);
        
//#line 1084
final int X10_TEMP255 =
          (20);
        
//#line 1086
final int X10_TEMP21 =
          (X10_TEMP255);
        
//#line 1087
final int X10_TEMP258 =
          (X10_TEMP21);
        
//#line 1089
final int X10_TEMP22 =
          (X10_TEMP258);
        
//#line 1090
final int X10_TEMP262 =
          (X10_TEMP22);
        
//#line 1092
final int X10_TEMP265 =
          (X10_TEMP262);
        
//#line 1093
/* template:array_set { */(X10_TEMP16).set((X10_TEMP265),X10_TEMP18)/* } */;
        
//#line 1094
final x10.
          lang.
          IntReferenceArray X10_TEMP267 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.datasizes));
        
//#line 1096
final x10.
          lang.
          IntReferenceArray X10_TEMP23 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP267));
        
//#line 1097
final int X10_TEMP270 =
          (1);
        
//#line 1099
final int X10_TEMP25 =
          (X10_TEMP270);
        
//#line 1100
final int X10_TEMP273 =
          (500);
        
//#line 1102
final int X10_TEMP28 =
          (X10_TEMP273);
        
//#line 1103
final int X10_TEMP276 =
          (X10_TEMP28);
        
//#line 1105
final int X10_TEMP29 =
          (X10_TEMP276);
        
//#line 1106
final int X10_TEMP280 =
          (X10_TEMP29);
        
//#line 1108
final int X10_TEMP283 =
          (X10_TEMP280);
        
//#line 1109
/* template:array_set { */(X10_TEMP23).set((X10_TEMP283),X10_TEMP25)/* } */;
        
//#line 1110
final int X10_TEMP285 =
          (size_t);
        
//#line 1112
final int X10_TEMP32 =
          (X10_TEMP285);
        
//#line 1113
final int X10_TEMP288 =
          (X10_TEMP32);
        
//#line 1115
final int X10_TEMP291 =
          (X10_TEMP288);
        
//#line 1116
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.size_t =
          ((X10_TEMP291));
    }
    
    
//#line 1118
public static void
                    Program_RayTracer_JGFinitialise(
                    final RayTracer X10_TEMP0) {
        
//#line 1119
final x10.
          lang.
          IntReferenceArray X10_TEMP210 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.datasizes));
        
//#line 1121
final x10.
          lang.
          IntReferenceArray X10_TEMP1 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP210));
        
//#line 1122
final int X10_TEMP213 =
          (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.size_t);
        
//#line 1124
final int X10_TEMP3 =
          (X10_TEMP213);
        
//#line 1125
final int X10_TEMP217 =
          (/* template:array_get { */((X10_TEMP1).get(X10_TEMP3))/* } */);
        
//#line 1127
final int X10_TEMP6 =
          (X10_TEMP217);
        
//#line 1128
final int X10_TEMP220 =
          (X10_TEMP6);
        
//#line 1130
final int X10_TEMP7 =
          (X10_TEMP220);
        
//#line 1131
final int X10_TEMP223 =
          (X10_TEMP7);
        
//#line 1133
final int X10_TEMP226 =
          (X10_TEMP223);
        
//#line 1134
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.width =
          ((X10_TEMP226));
        
//#line 1135
final x10.
          lang.
          IntReferenceArray X10_TEMP228 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.datasizes));
        
//#line 1137
final x10.
          lang.
          IntReferenceArray X10_TEMP8 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP228));
        
//#line 1138
final int X10_TEMP231 =
          (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.size_t);
        
//#line 1140
final int X10_TEMP10 =
          (X10_TEMP231);
        
//#line 1141
final int X10_TEMP235 =
          (/* template:array_get { */((X10_TEMP8).get(X10_TEMP10))/* } */);
        
//#line 1143
final int X10_TEMP13 =
          (X10_TEMP235);
        
//#line 1144
final int X10_TEMP238 =
          (X10_TEMP13);
        
//#line 1146
final int X10_TEMP14 =
          (X10_TEMP238);
        
//#line 1147
final int X10_TEMP241 =
          (X10_TEMP14);
        
//#line 1149
final int X10_TEMP244 =
          (X10_TEMP241);
        
//#line 1150
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.height =
          ((X10_TEMP244));
        
//#line 1151
final Scene X10_TEMP247 =
          (Program0.
             Program_RayTracer_createScene(
             X10_TEMP0));
        
//#line 1153
final Scene X10_TEMP17 =
          (X10_TEMP247);
        
//#line 1154
final Scene X10_TEMP250 =
          (X10_TEMP17);
        
//#line 1156
final Scene X10_TEMP18 =
          (X10_TEMP250);
        
//#line 1157
final Scene X10_TEMP253 =
          (X10_TEMP18);
        
//#line 1159
final Scene X10_TEMP256 =
          (X10_TEMP253);
        
//#line 1160
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.scene =
          ((X10_TEMP256));
        
//#line 1161
final Scene X10_TEMP258 =
          (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.scene);
        
//#line 1163
final Scene X10_TEMP20 =
          (X10_TEMP258);
        
//#line 1164
Program0.
                        Program_RayTracer_setScene(
                        X10_TEMP0,
                        X10_TEMP20);
        
//#line 1165
final Scene X10_TEMP263 =
          (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.scene);
        
//#line 1167
final Scene X10_TEMP21 =
          (X10_TEMP263);
        
//#line 1168
final int X10_TEMP267 =
          (Program0.
             Program_Scene_getObjects(
             X10_TEMP21));
        
//#line 1170
final int X10_TEMP24 =
          (X10_TEMP267);
        
//#line 1171
final int X10_TEMP270 =
          (X10_TEMP24);
        
//#line 1173
final int X10_TEMP25 =
          (X10_TEMP270);
        
//#line 1174
final int X10_TEMP273 =
          (X10_TEMP25);
        
//#line 1176
final int X10_TEMP276 =
          (X10_TEMP273);
        
//#line 1177
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.numobjects =
          ((X10_TEMP276));
    }
    
    
//#line 1179
public static void
                    Program_RayTracer_JGFapplication(
                    final RayTracer X10_TEMP0) {
        
//#line 1180
final int X10_TEMP210 =
          (0);
        
//#line 1182
int X10_TEMP7 =
          (X10_TEMP210);
        
//#line 1183
final int X10_TEMP213 =
          (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.width);
        
//#line 1185
int X10_TEMP8 =
          (X10_TEMP213);
        
//#line 1186
final int X10_TEMP216 =
          (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.height);
        
//#line 1188
int X10_TEMP9 =
          (X10_TEMP216);
        
//#line 1189
final int X10_TEMP219 =
          (0);
        
//#line 1191
int X10_TEMP10 =
          (X10_TEMP219);
        
//#line 1192
final int X10_TEMP222 =
          (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.height);
        
//#line 1194
int X10_TEMP11 =
          (X10_TEMP222);
        
//#line 1195
final int X10_TEMP225 =
          (1);
        
//#line 1197
int X10_TEMP12 =
          (X10_TEMP225);
        
//#line 1198
final Interval X10_TEMP234 =
          (new Interval(
             X10_TEMP7,
             X10_TEMP8,
             X10_TEMP9,
             X10_TEMP10,
             X10_TEMP11,
             X10_TEMP12));
        
//#line 1200
Interval interval =
          (X10_TEMP234);
        
//#line 1201
Program0.
                        Program_RayTracer_render(
                        X10_TEMP0,
                        interval);
    }
    
    
//#line 1203
public static void
                    Program_RayTracer_JGFvalidate(
                    final RayTracer X10_TEMP0) {
        
//#line 1204
final int X10_TEMP210 =
          (0);
        
//#line 1206
final int X10_TEMP3 =
          (X10_TEMP210);
        
//#line 1207
final int X10_TEMP213 =
          (1);
        
//#line 1209
final int X10_TEMP4 =
          (X10_TEMP213);
        
//#line 1210
final x10.
          lang.
          region X10_TEMP218 =
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
        
//#line 1212
final x10.
          lang.
          region X10_TEMP5 =
          (x10.
            lang.
            region)
            ((X10_TEMP218));
        
//#line 1213
final x10.
          lang.
          place X10_TEMP221 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1215
final x10.
          lang.
          place X10_TEMP6 =
          (X10_TEMP221);
        
//#line 1216
final x10.
          lang.
          dist X10_TEMP224 =
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
        
//#line 1218
x10.
          lang.
          dist d1 =
          (x10.
            lang.
            dist)
            ((X10_TEMP224));
        
//#line 1219
final x10.
          lang.
          LongReferenceArray X10_TEMP227 =
          (x10.
            lang.
            LongReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.LongArray(d1,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1221
x10.
          lang.
          LongReferenceArray refval =
          (x10.
            lang.
            LongReferenceArray)
            ((X10_TEMP227));
        
//#line 1222
final int X10_TEMP230 =
          (0);
        
//#line 1224
final int X10_TEMP10 =
          (X10_TEMP230);
        
//#line 1225
final int X10_TEMP233 =
          (51428);
        
//#line 1227
final long X10_TEMP13 =
          (X10_TEMP233);
        
//#line 1228
final long X10_TEMP236 =
          (X10_TEMP13);
        
//#line 1230
final long X10_TEMP14 =
          (X10_TEMP236);
        
//#line 1231
final long X10_TEMP240 =
          (X10_TEMP14);
        
//#line 1233
final long X10_TEMP243 =
          (X10_TEMP240);
        
//#line 1234
/* template:array_set { */(refval).set((X10_TEMP243),X10_TEMP10)/* } */;
        
//#line 1235
final int X10_TEMP245 =
          (1);
        
//#line 1237
final int X10_TEMP16 =
          (X10_TEMP245);
        
//#line 1238
final int X10_TEMP248 =
          (29827635);
        
//#line 1240
final long X10_TEMP19 =
          (X10_TEMP248);
        
//#line 1241
final long X10_TEMP251 =
          (X10_TEMP19);
        
//#line 1243
final long X10_TEMP20 =
          (X10_TEMP251);
        
//#line 1244
final long X10_TEMP255 =
          (X10_TEMP20);
        
//#line 1246
final long X10_TEMP258 =
          (X10_TEMP255);
        
//#line 1247
/* template:array_set { */(refval).set((X10_TEMP258),X10_TEMP16)/* } */;
        
//#line 1248
final long X10_TEMP260 =
          (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.checksum);
        
//#line 1250
final long X10_TEMP23 =
          (X10_TEMP260);
        
//#line 1251
final int X10_TEMP263 =
          (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.size_t);
        
//#line 1253
final int X10_TEMP22 =
          (X10_TEMP263);
        
//#line 1254
final long X10_TEMP267 =
          (/* template:array_get { */((refval).get(X10_TEMP22))/* } */);
        
//#line 1256
final long X10_TEMP24 =
          (X10_TEMP267);
        
//#line 1257
final long X10_TEMP270 =
          (X10_TEMP23 -
             X10_TEMP24);
        
//#line 1259
long dev =
          (X10_TEMP270);
        
//#line 1260
final int X10_TEMP273 =
          (0);
        
//#line 1262
final int X10_TEMP26 =
          (X10_TEMP273);
        
//#line 1263
final boolean X10_TEMP28 =
          (dev !=
             X10_TEMP26);
        
//#line 1264
if (X10_TEMP28) {
            
//#line 1265
final java.
              lang.
              String X10_TEMP278 =
              ("Validation failed");
            
//#line 1267
final java.
              lang.
              String X10_TEMP30 =
              (X10_TEMP278);
            
//#line 1268
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                          lang.
                                                                                                          System.
                                                                                                          out))/* } */.println(X10_TEMP30);
            
//#line 1269
final java.
              lang.
              String X10_TEMP282 =
              ("Pixel checksum = ");
            
//#line 1271
final java.
              lang.
              String X10_TEMP31 =
              (X10_TEMP282);
            
//#line 1272
final long X10_TEMP285 =
              (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.checksum);
            
//#line 1274
final long X10_TEMP32 =
              (X10_TEMP285);
            
//#line 1275
final java.
              lang.
              String X10_TEMP288 =
              (X10_TEMP31 +
               X10_TEMP32);
            
//#line 1277
final java.
              lang.
              String X10_TEMP34 =
              (X10_TEMP288);
            
//#line 1278
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                          lang.
                                                                                                          System.
                                                                                                          out))/* } */.println(X10_TEMP34);
            
//#line 1279
final java.
              lang.
              String X10_TEMP292 =
              ("Reference value = ");
            
//#line 1281
final java.
              lang.
              String X10_TEMP37 =
              (X10_TEMP292);
            
//#line 1282
final int X10_TEMP295 =
              (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.size_t);
            
//#line 1284
final int X10_TEMP36 =
              (X10_TEMP295);
            
//#line 1285
final long X10_TEMP299 =
              (/* template:array_get { */((refval).get(X10_TEMP36))/* } */);
            
//#line 1287
final long X10_TEMP38 =
              (X10_TEMP299);
            
//#line 1288
final java.
              lang.
              String X10_TEMP302 =
              (X10_TEMP37 +
               X10_TEMP38);
            
//#line 1290
final java.
              lang.
              String X10_TEMP40 =
              (X10_TEMP302);
            
//#line 1291
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                          lang.
                                                                                                          System.
                                                                                                          out))/* } */.println(X10_TEMP40);
            
//#line 1292
final java.
              lang.
              String X10_TEMP306 =
              ("Validation failed");
            
//#line 1294
final java.
              lang.
              String X10_TEMP42 =
              (X10_TEMP306);
            
//#line 1295
throw new java.
              lang.
              RuntimeException(
              X10_TEMP42);
        }
    }
    
    
//#line 1298
public static void
                    Program_RayTracer_JGFtidyup(
                    final RayTracer X10_TEMP0) {
        
    }
    
    
//#line 1300
public static void
                    Program_RayTracer_run(
                    final RayTracer X10_TEMP0) {
        
//#line 1301
final int X10_TEMP210 =
          (0);
        
//#line 1303
final int X10_TEMP2 =
          (X10_TEMP210);
        
//#line 1304
Program0.
                        Program_RayTracer_JGFsetsize(
                        X10_TEMP0,
                        X10_TEMP2);
        
//#line 1305
Program0.
                        Program_RayTracer_JGFinitialise(
                        X10_TEMP0);
        
//#line 1306
Program0.
                        Program_RayTracer_JGFapplication(
                        X10_TEMP0);
        
//#line 1307
Program0.
                        Program_RayTracer_JGFvalidate(
                        X10_TEMP0);
        
//#line 1308
Program0.
                        Program_RayTracer_JGFtidyup(
                        X10_TEMP0);
    }
    
    
//#line 1310
public static Scene
                    Program_RayTracer_createScene(
                    final RayTracer X10_TEMP0) {
        
//#line 1311
final int X10_TEMP210 =
          (0);
        
//#line 1313
final int x =
          (X10_TEMP210);
        
//#line 1314
final int X10_TEMP213 =
          (0);
        
//#line 1316
final int y =
          (X10_TEMP213);
        
//#line 1317
final int X10_TEMP216 =
          (20);
        
//#line 1319
int X10_TEMP9 =
          (X10_TEMP216);
        
//#line 1320
final int X10_TEMP219 =
          (30);
        
//#line 1322
final int X10_TEMP5 =
          (X10_TEMP219);
        
//#line 1323
final int X10_TEMP6 =
          (0);
        
//#line 1324
final int X10_TEMP223 =
          (X10_TEMP6 -
             X10_TEMP5);
        
//#line 1326
int X10_TEMP10 =
          (X10_TEMP223);
        
//#line 1327
final boolean X10_TEMP226 =
          (false);
        
//#line 1329
boolean X10_TEMP11 =
          (X10_TEMP226);
        
//#line 1330
final Vec X10_TEMP233 =
          (new Vec(
             x,
             X10_TEMP9,
             X10_TEMP10,
             X10_TEMP11));
        
//#line 1332
Vec X10_TEMP36 =
          (X10_TEMP233);
        
//#line 1333
final int X10_TEMP236 =
          (0);
        
//#line 1335
int X10_TEMP17 =
          (X10_TEMP236);
        
//#line 1336
final boolean X10_TEMP239 =
          (false);
        
//#line 1338
boolean X10_TEMP18 =
          (X10_TEMP239);
        
//#line 1339
final Vec X10_TEMP246 =
          (new Vec(
             x,
             y,
             X10_TEMP17,
             X10_TEMP18));
        
//#line 1341
Vec X10_TEMP37 =
          (X10_TEMP246);
        
//#line 1342
final int X10_TEMP249 =
          (0);
        
//#line 1344
int X10_TEMP24 =
          (X10_TEMP249);
        
//#line 1345
final int X10_TEMP252 =
          (1);
        
//#line 1347
int X10_TEMP25 =
          (X10_TEMP252);
        
//#line 1348
final int X10_TEMP255 =
          (0);
        
//#line 1350
int X10_TEMP26 =
          (X10_TEMP255);
        
//#line 1351
final boolean X10_TEMP258 =
          (false);
        
//#line 1353
boolean X10_TEMP27 =
          (X10_TEMP258);
        
//#line 1354
final Vec X10_TEMP265 =
          (new Vec(
             X10_TEMP24,
             X10_TEMP25,
             X10_TEMP26,
             X10_TEMP27));
        
//#line 1356
Vec X10_TEMP38 =
          (X10_TEMP265);
        
//#line 1357
final double X10_TEMP268 =
          (1.0);
        
//#line 1359
double X10_TEMP39 =
          (X10_TEMP268);
        
//#line 1360
final double X10_TEMP271 =
          (35.0);
        
//#line 1362
final double X10_TEMP30 =
          (X10_TEMP271);
        
//#line 1363
final double X10_TEMP274 =
          (3.14159265);
        
//#line 1365
final double X10_TEMP31 =
          (X10_TEMP274);
        
//#line 1366
final double X10_TEMP277 =
          (X10_TEMP30 *
             X10_TEMP31);
        
//#line 1368
final double X10_TEMP32 =
          (X10_TEMP277);
        
//#line 1369
final double X10_TEMP280 =
          (180.0);
        
//#line 1371
final double X10_TEMP33 =
          (X10_TEMP280);
        
//#line 1372
final double X10_TEMP283 =
          (X10_TEMP32 /
             X10_TEMP33);
        
//#line 1374
double X10_TEMP40 =
          (X10_TEMP283);
        
//#line 1375
final double X10_TEMP286 =
          (1.0);
        
//#line 1377
double X10_TEMP41 =
          (X10_TEMP286);
        
//#line 1378
final View X10_TEMP295 =
          (new View(
             X10_TEMP36,
             X10_TEMP37,
             X10_TEMP38,
             X10_TEMP39,
             X10_TEMP40,
             X10_TEMP41));
        
//#line 1380
View X10_TEMP43 =
          (X10_TEMP295);
        
//#line 1381
final Scene X10_TEMP299 =
          (new Scene(
             X10_TEMP43));
        
//#line 1383
Scene scene =
          (X10_TEMP299);
        
//#line 1384
final int X10_TEMP302 =
          (4);
        
//#line 1386
final int nx =
          (X10_TEMP302);
        
//#line 1387
final int X10_TEMP305 =
          (4);
        
//#line 1389
final int ny =
          (X10_TEMP305);
        
//#line 1390
final int X10_TEMP308 =
          (4);
        
//#line 1392
final int nz =
          (X10_TEMP308);
        
//#line 1393
final int X10_TEMP311 =
          (0);
        
//#line 1395
final int X10_TEMP51 =
          (X10_TEMP311);
        
//#line 1396
final int X10_TEMP314 =
          (1);
        
//#line 1398
final int X10_TEMP49 =
          (X10_TEMP314);
        
//#line 1399
final int X10_TEMP317 =
          (nx -
             X10_TEMP49);
        
//#line 1401
final int X10_TEMP52 =
          (X10_TEMP317);
        
//#line 1402
final int X10_TEMP320 =
          (0);
        
//#line 1404
final int X10_TEMP56 =
          (X10_TEMP320);
        
//#line 1405
final int X10_TEMP323 =
          (1);
        
//#line 1407
final int X10_TEMP54 =
          (X10_TEMP323);
        
//#line 1408
final int X10_TEMP326 =
          (ny -
             X10_TEMP54);
        
//#line 1410
final int X10_TEMP57 =
          (X10_TEMP326);
        
//#line 1411
final int X10_TEMP329 =
          (0);
        
//#line 1413
final int X10_TEMP61 =
          (X10_TEMP329);
        
//#line 1414
final int X10_TEMP332 =
          (1);
        
//#line 1416
final int X10_TEMP59 =
          (X10_TEMP332);
        
//#line 1417
final int X10_TEMP335 =
          (nz -
             X10_TEMP59);
        
//#line 1419
final int X10_TEMP62 =
          (X10_TEMP335);
        
//#line 1420
final x10.
          lang.
          region X10_TEMP344 =
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
                  X10_TEMP51,
                  X10_TEMP52),
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP56,
                  X10_TEMP57),
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP61,
                  X10_TEMP62))));
        
//#line 1422
final x10.
          lang.
          region reg =
          (x10.
            lang.
            region)
            ((X10_TEMP344));
        
//#line 1423
/* template:forloop-mult { */{
        x10.lang.region __var2__ = (x10.lang.region) reg;
        if (__var2__.size() > 0 && (__var2__ instanceof x10.array.MultiDimRegion || __var2__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var3__ = __var2__.rank(0).low(), __var4__ = __var2__.rank(0).high(); __var3__ <= __var4__; __var3__++)
        /* } */
        /* template:forloop-mult-each { */
        for (int __var5__ = __var2__.rank(1).low(), __var6__ = __var2__.rank(1).high(); __var5__ <= __var6__; __var5__++)
        /* } */
        /* template:forloop-mult-each { */
        for (int __var7__ = __var2__.rank(2).low(), __var8__ = __var2__.rank(2).high(); __var7__ <= __var8__; __var7__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var3__;
        /* } */
        /* template:final-var-assign { */
        final int j = __var5__;
        /* } */
        /* template:final-var-assign { */
        final int k = __var7__;
        /* } */
        /* } */
{
            
//#line 1424
final double X10_TEMP348 =
              (20.0);
            
//#line 1426
final double X10_TEMP68 =
              (X10_TEMP348);
            
//#line 1427
final int X10_TEMP351 =
              (1);
            
//#line 1429
final int X10_TEMP65 =
              (X10_TEMP351);
            
//#line 1430
final int X10_TEMP354 =
              (nx -
                 X10_TEMP65);
            
//#line 1432
final int X10_TEMP67 =
              (X10_TEMP354);
            
//#line 1433
final double X10_TEMP357 =
              (X10_TEMP68 /
                 X10_TEMP67);
            
//#line 1435
final double X10_TEMP69 =
              (X10_TEMP357);
            
//#line 1436
final double X10_TEMP360 =
              (X10_TEMP69 *
                 i);
            
//#line 1438
final double X10_TEMP70 =
              (X10_TEMP360);
            
//#line 1439
final double X10_TEMP363 =
              (10.0);
            
//#line 1441
final double X10_TEMP71 =
              (X10_TEMP363);
            
//#line 1442
final double X10_TEMP366 =
              (X10_TEMP70 -
                 X10_TEMP71);
            
//#line 1444
double xx =
              (X10_TEMP366);
            
//#line 1445
final double X10_TEMP369 =
              (20.0);
            
//#line 1447
final double X10_TEMP76 =
              (X10_TEMP369);
            
//#line 1448
final int X10_TEMP372 =
              (1);
            
//#line 1450
final int X10_TEMP73 =
              (X10_TEMP372);
            
//#line 1451
final int X10_TEMP375 =
              (ny -
                 X10_TEMP73);
            
//#line 1453
final int X10_TEMP75 =
              (X10_TEMP375);
            
//#line 1454
final double X10_TEMP378 =
              (X10_TEMP76 /
                 X10_TEMP75);
            
//#line 1456
final double X10_TEMP77 =
              (X10_TEMP378);
            
//#line 1457
final double X10_TEMP381 =
              (X10_TEMP77 *
                 j);
            
//#line 1459
final double X10_TEMP78 =
              (X10_TEMP381);
            
//#line 1460
final double X10_TEMP384 =
              (10.0);
            
//#line 1462
final double X10_TEMP79 =
              (X10_TEMP384);
            
//#line 1463
final double X10_TEMP387 =
              (X10_TEMP78 -
                 X10_TEMP79);
            
//#line 1465
double yy =
              (X10_TEMP387);
            
//#line 1466
final double X10_TEMP390 =
              (20.0);
            
//#line 1468
final double X10_TEMP84 =
              (X10_TEMP390);
            
//#line 1469
final int X10_TEMP393 =
              (1);
            
//#line 1471
final int X10_TEMP81 =
              (X10_TEMP393);
            
//#line 1472
final int X10_TEMP396 =
              (nz -
                 X10_TEMP81);
            
//#line 1474
final int X10_TEMP83 =
              (X10_TEMP396);
            
//#line 1475
final double X10_TEMP399 =
              (X10_TEMP84 /
                 X10_TEMP83);
            
//#line 1477
final double X10_TEMP85 =
              (X10_TEMP399);
            
//#line 1478
final double X10_TEMP402 =
              (X10_TEMP85 *
                 k);
            
//#line 1480
final double X10_TEMP86 =
              (X10_TEMP402);
            
//#line 1481
final double X10_TEMP405 =
              (10.0);
            
//#line 1483
final double X10_TEMP87 =
              (X10_TEMP405);
            
//#line 1484
final double X10_TEMP408 =
              (X10_TEMP86 -
                 X10_TEMP87);
            
//#line 1486
double zz =
              (X10_TEMP408);
            
//#line 1487
final boolean X10_TEMP411 =
              (false);
            
//#line 1489
boolean X10_TEMP93 =
              (X10_TEMP411);
            
//#line 1490
final Vec X10_TEMP418 =
              (new Vec(
                 xx,
                 yy,
                 zz,
                 X10_TEMP93));
            
//#line 1492
Vec X10_TEMP126 =
              (X10_TEMP418);
            
//#line 1493
final int X10_TEMP421 =
              (3);
            
//#line 1495
int X10_TEMP127 =
              (X10_TEMP421);
            
//#line 1496
final double X10_TEMP424 =
              (15.0);
            
//#line 1498
double X10_TEMP120 =
              (X10_TEMP424);
            
//#line 1499
final double X10_TEMP427 =
              (1.5);
            
//#line 1501
final double X10_TEMP97 =
              (X10_TEMP427);
            
//#line 1502
final double X10_TEMP430 =
              (1.0);
            
//#line 1504
final double X10_TEMP98 =
              (X10_TEMP430);
            
//#line 1505
final double X10_TEMP433 =
              (X10_TEMP97 -
                 X10_TEMP98);
            
//#line 1507
double X10_TEMP121 =
              (X10_TEMP433);
            
//#line 1508
final double X10_TEMP436 =
              (1.5);
            
//#line 1510
final double X10_TEMP100 =
              (X10_TEMP436);
            
//#line 1511
final double X10_TEMP439 =
              (1.0);
            
//#line 1513
final double X10_TEMP101 =
              (X10_TEMP439);
            
//#line 1514
final double X10_TEMP442 =
              (X10_TEMP100 -
                 X10_TEMP101);
            
//#line 1516
double X10_TEMP122 =
              (X10_TEMP442);
            
//#line 1517
final int X10_TEMP445 =
              (0);
            
//#line 1519
int X10_TEMP114 =
              (X10_TEMP445);
            
//#line 1520
final int X10_TEMP448 =
              (0);
            
//#line 1522
int X10_TEMP115 =
              (X10_TEMP448);
            
//#line 1523
final int X10_TEMP451 =
              (i +
                 j);
            
//#line 1525
final int X10_TEMP106 =
              (X10_TEMP451);
            
//#line 1526
final int X10_TEMP454 =
              (nx +
                 ny);
            
//#line 1528
final int X10_TEMP107 =
              (X10_TEMP454);
            
//#line 1529
final int X10_TEMP457 =
              (2);
            
//#line 1531
final int X10_TEMP108 =
              (X10_TEMP457);
            
//#line 1532
final int X10_TEMP460 =
              (X10_TEMP107 -
                 X10_TEMP108);
            
//#line 1534
final int X10_TEMP110 =
              (X10_TEMP460);
            
//#line 1535
final double X10_TEMP463 =
              ((double)
                 X10_TEMP110);
            
//#line 1537
final double X10_TEMP111 =
              (X10_TEMP463);
            
//#line 1538
final double X10_TEMP466 =
              (X10_TEMP106 /
                 X10_TEMP111);
            
//#line 1540
double X10_TEMP116 =
              (X10_TEMP466);
            
//#line 1541
final boolean X10_TEMP469 =
              (false);
            
//#line 1543
boolean X10_TEMP117 =
              (X10_TEMP469);
            
//#line 1544
final Vec X10_TEMP476 =
              (new Vec(
                 X10_TEMP114,
                 X10_TEMP115,
                 X10_TEMP116,
                 X10_TEMP117));
            
//#line 1546
Vec X10_TEMP123 =
              (X10_TEMP476);
            
//#line 1547
final boolean X10_TEMP479 =
              (false);
            
//#line 1549
boolean X10_TEMP124 =
              (X10_TEMP479);
            
//#line 1550
final Surface X10_TEMP487 =
              (new Surface(
                 X10_TEMP120,
                 X10_TEMP121,
                 X10_TEMP122,
                 X10_TEMP123,
                 X10_TEMP124));
            
//#line 1552
Surface X10_TEMP128 =
              (X10_TEMP487);
            
//#line 1553
final Sphere X10_TEMP493 =
              (new Sphere(
                 X10_TEMP126,
                 X10_TEMP127,
                 X10_TEMP128));
            
//#line 1555
Sphere p =
              (X10_TEMP493);
            
//#line 1556
Program0.
                            Program_Scene_addObject(
                            scene,
                            p);
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var0____ = (__var2__).iterator(); __var0____.hasNext(); ) {
        	final  x10.
          lang.
          point __var0__ = (x10.
          lang.
          point) __var0____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var0__).get(0))/* } */;
final int j =
          /* template:array_get { */((__var0__).get(1))/* } */;
final int k =
          /* template:array_get { */((__var0__).get(2))/* } */;/* } */
{
            
//#line 1424
final double X10_TEMP348 =
              (20.0);
            
//#line 1426
final double X10_TEMP68 =
              (X10_TEMP348);
            
//#line 1427
final int X10_TEMP351 =
              (1);
            
//#line 1429
final int X10_TEMP65 =
              (X10_TEMP351);
            
//#line 1430
final int X10_TEMP354 =
              (nx -
                 X10_TEMP65);
            
//#line 1432
final int X10_TEMP67 =
              (X10_TEMP354);
            
//#line 1433
final double X10_TEMP357 =
              (X10_TEMP68 /
                 X10_TEMP67);
            
//#line 1435
final double X10_TEMP69 =
              (X10_TEMP357);
            
//#line 1436
final double X10_TEMP360 =
              (X10_TEMP69 *
                 i);
            
//#line 1438
final double X10_TEMP70 =
              (X10_TEMP360);
            
//#line 1439
final double X10_TEMP363 =
              (10.0);
            
//#line 1441
final double X10_TEMP71 =
              (X10_TEMP363);
            
//#line 1442
final double X10_TEMP366 =
              (X10_TEMP70 -
                 X10_TEMP71);
            
//#line 1444
double xx =
              (X10_TEMP366);
            
//#line 1445
final double X10_TEMP369 =
              (20.0);
            
//#line 1447
final double X10_TEMP76 =
              (X10_TEMP369);
            
//#line 1448
final int X10_TEMP372 =
              (1);
            
//#line 1450
final int X10_TEMP73 =
              (X10_TEMP372);
            
//#line 1451
final int X10_TEMP375 =
              (ny -
                 X10_TEMP73);
            
//#line 1453
final int X10_TEMP75 =
              (X10_TEMP375);
            
//#line 1454
final double X10_TEMP378 =
              (X10_TEMP76 /
                 X10_TEMP75);
            
//#line 1456
final double X10_TEMP77 =
              (X10_TEMP378);
            
//#line 1457
final double X10_TEMP381 =
              (X10_TEMP77 *
                 j);
            
//#line 1459
final double X10_TEMP78 =
              (X10_TEMP381);
            
//#line 1460
final double X10_TEMP384 =
              (10.0);
            
//#line 1462
final double X10_TEMP79 =
              (X10_TEMP384);
            
//#line 1463
final double X10_TEMP387 =
              (X10_TEMP78 -
                 X10_TEMP79);
            
//#line 1465
double yy =
              (X10_TEMP387);
            
//#line 1466
final double X10_TEMP390 =
              (20.0);
            
//#line 1468
final double X10_TEMP84 =
              (X10_TEMP390);
            
//#line 1469
final int X10_TEMP393 =
              (1);
            
//#line 1471
final int X10_TEMP81 =
              (X10_TEMP393);
            
//#line 1472
final int X10_TEMP396 =
              (nz -
                 X10_TEMP81);
            
//#line 1474
final int X10_TEMP83 =
              (X10_TEMP396);
            
//#line 1475
final double X10_TEMP399 =
              (X10_TEMP84 /
                 X10_TEMP83);
            
//#line 1477
final double X10_TEMP85 =
              (X10_TEMP399);
            
//#line 1478
final double X10_TEMP402 =
              (X10_TEMP85 *
                 k);
            
//#line 1480
final double X10_TEMP86 =
              (X10_TEMP402);
            
//#line 1481
final double X10_TEMP405 =
              (10.0);
            
//#line 1483
final double X10_TEMP87 =
              (X10_TEMP405);
            
//#line 1484
final double X10_TEMP408 =
              (X10_TEMP86 -
                 X10_TEMP87);
            
//#line 1486
double zz =
              (X10_TEMP408);
            
//#line 1487
final boolean X10_TEMP411 =
              (false);
            
//#line 1489
boolean X10_TEMP93 =
              (X10_TEMP411);
            
//#line 1490
final Vec X10_TEMP418 =
              (new Vec(
                 xx,
                 yy,
                 zz,
                 X10_TEMP93));
            
//#line 1492
Vec X10_TEMP126 =
              (X10_TEMP418);
            
//#line 1493
final int X10_TEMP421 =
              (3);
            
//#line 1495
int X10_TEMP127 =
              (X10_TEMP421);
            
//#line 1496
final double X10_TEMP424 =
              (15.0);
            
//#line 1498
double X10_TEMP120 =
              (X10_TEMP424);
            
//#line 1499
final double X10_TEMP427 =
              (1.5);
            
//#line 1501
final double X10_TEMP97 =
              (X10_TEMP427);
            
//#line 1502
final double X10_TEMP430 =
              (1.0);
            
//#line 1504
final double X10_TEMP98 =
              (X10_TEMP430);
            
//#line 1505
final double X10_TEMP433 =
              (X10_TEMP97 -
                 X10_TEMP98);
            
//#line 1507
double X10_TEMP121 =
              (X10_TEMP433);
            
//#line 1508
final double X10_TEMP436 =
              (1.5);
            
//#line 1510
final double X10_TEMP100 =
              (X10_TEMP436);
            
//#line 1511
final double X10_TEMP439 =
              (1.0);
            
//#line 1513
final double X10_TEMP101 =
              (X10_TEMP439);
            
//#line 1514
final double X10_TEMP442 =
              (X10_TEMP100 -
                 X10_TEMP101);
            
//#line 1516
double X10_TEMP122 =
              (X10_TEMP442);
            
//#line 1517
final int X10_TEMP445 =
              (0);
            
//#line 1519
int X10_TEMP114 =
              (X10_TEMP445);
            
//#line 1520
final int X10_TEMP448 =
              (0);
            
//#line 1522
int X10_TEMP115 =
              (X10_TEMP448);
            
//#line 1523
final int X10_TEMP451 =
              (i +
                 j);
            
//#line 1525
final int X10_TEMP106 =
              (X10_TEMP451);
            
//#line 1526
final int X10_TEMP454 =
              (nx +
                 ny);
            
//#line 1528
final int X10_TEMP107 =
              (X10_TEMP454);
            
//#line 1529
final int X10_TEMP457 =
              (2);
            
//#line 1531
final int X10_TEMP108 =
              (X10_TEMP457);
            
//#line 1532
final int X10_TEMP460 =
              (X10_TEMP107 -
                 X10_TEMP108);
            
//#line 1534
final int X10_TEMP110 =
              (X10_TEMP460);
            
//#line 1535
final double X10_TEMP463 =
              ((double)
                 X10_TEMP110);
            
//#line 1537
final double X10_TEMP111 =
              (X10_TEMP463);
            
//#line 1538
final double X10_TEMP466 =
              (X10_TEMP106 /
                 X10_TEMP111);
            
//#line 1540
double X10_TEMP116 =
              (X10_TEMP466);
            
//#line 1541
final boolean X10_TEMP469 =
              (false);
            
//#line 1543
boolean X10_TEMP117 =
              (X10_TEMP469);
            
//#line 1544
final Vec X10_TEMP476 =
              (new Vec(
                 X10_TEMP114,
                 X10_TEMP115,
                 X10_TEMP116,
                 X10_TEMP117));
            
//#line 1546
Vec X10_TEMP123 =
              (X10_TEMP476);
            
//#line 1547
final boolean X10_TEMP479 =
              (false);
            
//#line 1549
boolean X10_TEMP124 =
              (X10_TEMP479);
            
//#line 1550
final Surface X10_TEMP487 =
              (new Surface(
                 X10_TEMP120,
                 X10_TEMP121,
                 X10_TEMP122,
                 X10_TEMP123,
                 X10_TEMP124));
            
//#line 1552
Surface X10_TEMP128 =
              (X10_TEMP487);
            
//#line 1553
final Sphere X10_TEMP493 =
              (new Sphere(
                 X10_TEMP126,
                 X10_TEMP127,
                 X10_TEMP128));
            
//#line 1555
Sphere p =
              (X10_TEMP493);
            
//#line 1556
Program0.
                            Program_Scene_addObject(
                            scene,
                            p);
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 1558
final int X10_TEMP498 =
          (100);
        
//#line 1560
int X10_TEMP137 =
          (X10_TEMP498);
        
//#line 1561
final int X10_TEMP501 =
          (100);
        
//#line 1563
int X10_TEMP138 =
          (X10_TEMP501);
        
//#line 1564
final int X10_TEMP504 =
          (50);
        
//#line 1566
final int X10_TEMP133 =
          (X10_TEMP504);
        
//#line 1567
final int X10_TEMP134 =
          (0);
        
//#line 1568
final int X10_TEMP508 =
          (X10_TEMP134 -
             X10_TEMP133);
        
//#line 1570
int X10_TEMP139 =
          (X10_TEMP508);
        
//#line 1571
final double X10_TEMP511 =
          (1.0);
        
//#line 1573
double X10_TEMP140 =
          (X10_TEMP511);
        
//#line 1574
final Light X10_TEMP518 =
          (new Light(
             X10_TEMP137,
             X10_TEMP138,
             X10_TEMP139,
             X10_TEMP140));
        
//#line 1576
final Light X10_TEMP142 =
          (X10_TEMP518);
        
//#line 1577
Program0.
                        Program_Scene_addLight(
                        scene,
                        X10_TEMP142);
        
//#line 1578
final int X10_TEMP523 =
          (100);
        
//#line 1580
final int X10_TEMP143 =
          (X10_TEMP523);
        
//#line 1581
final int X10_TEMP144 =
          (0);
        
//#line 1582
final int X10_TEMP527 =
          (X10_TEMP144 -
             X10_TEMP143);
        
//#line 1584
int X10_TEMP151 =
          (X10_TEMP527);
        
//#line 1585
final int X10_TEMP530 =
          (100);
        
//#line 1587
int X10_TEMP152 =
          (X10_TEMP530);
        
//#line 1588
final int X10_TEMP533 =
          (50);
        
//#line 1590
final int X10_TEMP147 =
          (X10_TEMP533);
        
//#line 1591
final int X10_TEMP148 =
          (0);
        
//#line 1592
final int X10_TEMP537 =
          (X10_TEMP148 -
             X10_TEMP147);
        
//#line 1594
int X10_TEMP153 =
          (X10_TEMP537);
        
//#line 1595
final double X10_TEMP540 =
          (1.0);
        
//#line 1597
double X10_TEMP154 =
          (X10_TEMP540);
        
//#line 1598
final Light X10_TEMP547 =
          (new Light(
             X10_TEMP151,
             X10_TEMP152,
             X10_TEMP153,
             X10_TEMP154));
        
//#line 1600
final Light X10_TEMP156 =
          (X10_TEMP547);
        
//#line 1601
Program0.
                        Program_Scene_addLight(
                        scene,
                        X10_TEMP156);
        
//#line 1602
final int X10_TEMP552 =
          (100);
        
//#line 1604
int X10_TEMP165 =
          (X10_TEMP552);
        
//#line 1605
final int X10_TEMP555 =
          (100);
        
//#line 1607
final int X10_TEMP158 =
          (X10_TEMP555);
        
//#line 1608
final int X10_TEMP159 =
          (0);
        
//#line 1609
final int X10_TEMP559 =
          (X10_TEMP159 -
             X10_TEMP158);
        
//#line 1611
int X10_TEMP166 =
          (X10_TEMP559);
        
//#line 1612
final int X10_TEMP562 =
          (50);
        
//#line 1614
final int X10_TEMP161 =
          (X10_TEMP562);
        
//#line 1615
final int X10_TEMP162 =
          (0);
        
//#line 1616
final int X10_TEMP566 =
          (X10_TEMP162 -
             X10_TEMP161);
        
//#line 1618
int X10_TEMP167 =
          (X10_TEMP566);
        
//#line 1619
final double X10_TEMP569 =
          (1.0);
        
//#line 1621
double X10_TEMP168 =
          (X10_TEMP569);
        
//#line 1622
final Light X10_TEMP576 =
          (new Light(
             X10_TEMP165,
             X10_TEMP166,
             X10_TEMP167,
             X10_TEMP168));
        
//#line 1624
final Light X10_TEMP170 =
          (X10_TEMP576);
        
//#line 1625
Program0.
                        Program_Scene_addLight(
                        scene,
                        X10_TEMP170);
        
//#line 1626
final int X10_TEMP581 =
          (100);
        
//#line 1628
final int X10_TEMP171 =
          (X10_TEMP581);
        
//#line 1629
final int X10_TEMP172 =
          (0);
        
//#line 1630
final int X10_TEMP585 =
          (X10_TEMP172 -
             X10_TEMP171);
        
//#line 1632
int X10_TEMP181 =
          (X10_TEMP585);
        
//#line 1633
final int X10_TEMP588 =
          (100);
        
//#line 1635
final int X10_TEMP174 =
          (X10_TEMP588);
        
//#line 1636
final int X10_TEMP175 =
          (0);
        
//#line 1637
final int X10_TEMP592 =
          (X10_TEMP175 -
             X10_TEMP174);
        
//#line 1639
int X10_TEMP182 =
          (X10_TEMP592);
        
//#line 1640
final int X10_TEMP595 =
          (50);
        
//#line 1642
final int X10_TEMP177 =
          (X10_TEMP595);
        
//#line 1643
final int X10_TEMP178 =
          (0);
        
//#line 1644
final int X10_TEMP599 =
          (X10_TEMP178 -
             X10_TEMP177);
        
//#line 1646
int X10_TEMP183 =
          (X10_TEMP599);
        
//#line 1647
final double X10_TEMP602 =
          (1.0);
        
//#line 1649
double X10_TEMP184 =
          (X10_TEMP602);
        
//#line 1650
final Light X10_TEMP609 =
          (new Light(
             X10_TEMP181,
             X10_TEMP182,
             X10_TEMP183,
             X10_TEMP184));
        
//#line 1652
final Light X10_TEMP186 =
          (X10_TEMP609);
        
//#line 1653
Program0.
                        Program_Scene_addLight(
                        scene,
                        X10_TEMP186);
        
//#line 1654
final int X10_TEMP614 =
          (200);
        
//#line 1656
int X10_TEMP191 =
          (X10_TEMP614);
        
//#line 1657
final int X10_TEMP617 =
          (200);
        
//#line 1659
int X10_TEMP192 =
          (X10_TEMP617);
        
//#line 1660
final int X10_TEMP620 =
          (0);
        
//#line 1662
int X10_TEMP193 =
          (X10_TEMP620);
        
//#line 1663
final double X10_TEMP623 =
          (1.0);
        
//#line 1665
double X10_TEMP194 =
          (X10_TEMP623);
        
//#line 1666
final Light X10_TEMP630 =
          (new Light(
             X10_TEMP191,
             X10_TEMP192,
             X10_TEMP193,
             X10_TEMP194));
        
//#line 1668
final Light X10_TEMP196 =
          (X10_TEMP630);
        
//#line 1669
Program0.
                        Program_Scene_addLight(
                        scene,
                        X10_TEMP196);
        
//#line 1670
return scene;
    }
    
    
//#line 1672
public static void
                    Program_RayTracer_setScene(
                    final RayTracer X10_TEMP0,
                    final Scene scene) {
        
//#line 1673
final int X10_TEMP211 =
          (Program0.
             Program_Scene_getLights(
             scene));
        
//#line 1675
final int X10_TEMP3 =
          (X10_TEMP211);
        
//#line 1676
final int X10_TEMP214 =
          (X10_TEMP3);
        
//#line 1678
final int X10_TEMP4 =
          (X10_TEMP214);
        
//#line 1679
final int X10_TEMP217 =
          (X10_TEMP4);
        
//#line 1681
final int X10_TEMP220 =
          (X10_TEMP217);
        
//#line 1682
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lightCount =
          ((X10_TEMP220));
        
//#line 1683
final int X10_TEMP223 =
          (Program0.
             Program_Scene_getObjects(
             scene));
        
//#line 1685
final int X10_TEMP7 =
          (X10_TEMP223);
        
//#line 1686
final int X10_TEMP226 =
          (X10_TEMP7);
        
//#line 1688
final int X10_TEMP8 =
          (X10_TEMP226);
        
//#line 1689
final int X10_TEMP229 =
          (X10_TEMP8);
        
//#line 1691
final int X10_TEMP232 =
          (X10_TEMP229);
        
//#line 1692
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.objCount =
          ((X10_TEMP232));
        
//#line 1693
final Scene X10_TEMP234 =
          (scene);
        
//#line 1695
final Scene sc =
          (X10_TEMP234);
        
//#line 1696
final x10.
          lang.
          dist X10_TEMP237 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                UNIQUE));
        
//#line 1698
final x10.
          lang.
          dist X10_TEMP10 =
          (x10.
            lang.
            dist)
            ((X10_TEMP237));
        
//#line 1699
final x10.
          lang.
          dist X10_TEMP240 =
          (x10.
            lang.
            dist)
            ((X10_TEMP10));
        
//#line 1701
final x10.
          lang.
          dist U =
          (x10.
            lang.
            dist)
            ((X10_TEMP240));
        
//#line 1702
final int X10_TEMP243 =
          (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lightCount);
        
//#line 1704
final int mylightCount =
          (X10_TEMP243);
        
//#line 1705
final int X10_TEMP246 =
          (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.objCount);
        
//#line 1707
final int myobjCount =
          (X10_TEMP246);
        
//#line 1708
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1709
/* template:forloop { */
            for (java.util.Iterator pl__ = (U.
                                              region).iterator(); pl__.hasNext(); ) {
            	final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 1710
final x10.
                  lang.
                  place X10_TEMP15 =
                  (U.
                     get(
                     pl));
                
//#line 1711
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP15)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1712
final x10.
                      lang.
                      place X10_TEMP253 =
                      (/* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 1714
final x10.
                      lang.
                      place pHere =
                      (X10_TEMP253);
                    
//#line 1715
final int X10_TEMP256 =
                      (0);
                    
//#line 1717
final int X10_TEMP20 =
                      (X10_TEMP256);
                    
//#line 1718
final int X10_TEMP259 =
                      (1);
                    
//#line 1720
final int X10_TEMP18 =
                      (X10_TEMP259);
                    
//#line 1721
final int X10_TEMP262 =
                      (mylightCount -
                         X10_TEMP18);
                    
//#line 1723
final int X10_TEMP21 =
                      (X10_TEMP262);
                    
//#line 1724
final x10.
                      lang.
                      region X10_TEMP267 =
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
                              X10_TEMP20,
                              X10_TEMP21))));
                    
//#line 1726
x10.
                      lang.
                      region d1 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP267));
                    
//#line 1727
final int X10_TEMP270 =
                      (0);
                    
//#line 1729
final int X10_TEMP26 =
                      (X10_TEMP270);
                    
//#line 1730
final int X10_TEMP273 =
                      (1);
                    
//#line 1732
final int X10_TEMP24 =
                      (X10_TEMP273);
                    
//#line 1733
final int X10_TEMP276 =
                      (myobjCount -
                         X10_TEMP24);
                    
//#line 1735
final int X10_TEMP27 =
                      (X10_TEMP276);
                    
//#line 1736
final x10.
                      lang.
                      region X10_TEMP281 =
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
                              X10_TEMP26,
                              X10_TEMP27))));
                    
//#line 1738
x10.
                      lang.
                      region d2 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP281));
                    
//#line 1739
final x10.
                      lang.
                      GenericReferenceArray X10_TEMP332 =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d1.
                                                                                                                                       toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                          	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                            lang.
                            point l/* } */, x10.compilergenerated.Parameter1 dummy) { {
                              
//#line 1740
final int X10_TEMP284 =
                                (0);
                              
//#line 1742
final int X10_TEMP31 =
                                (X10_TEMP284);
                              
//#line 1743
final int X10_TEMP287 =
                                (0);
                              
//#line 1745
final int X10_TEMP32 =
                                (X10_TEMP287);
                              
//#line 1746
final x10.
                                lang.
                                region X10_TEMP292 =
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
                                        X10_TEMP31,
                                        X10_TEMP32))));
                              
//#line 1748
final x10.
                                lang.
                                region X10_TEMP33 =
                                (x10.
                                  lang.
                                  region)
                                  ((X10_TEMP292));
                              
//#line 1749
final x10.
                                lang.
                                dist X10_TEMP295 =
                                (x10.
                                  lang.
                                  dist)
                                  ((x10.
                                      lang.
                                      dist.
                                      factory.
                                      constant(
                                      X10_TEMP33,
                                      pHere)));
                              
//#line 1751
final x10.
                                lang.
                                dist dTemp =
                                (x10.
                                  lang.
                                  dist)
                                  ((X10_TEMP295));
                              
//#line 1752
final x10.
                                lang.
                                GenericReferenceArray X10_TEMP298 =
                                (x10.
                                  lang.
                                  GenericReferenceArray)
                                  ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dTemp,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
                              
//#line 1754
final x10.
                                lang.
                                GenericReferenceArray temp =
                                (x10.
                                  lang.
                                  GenericReferenceArray)
                                  ((X10_TEMP298));
                              
//#line 1755
final x10.
                                lang.
                                point X10_TEMP301 =
                                (l);
                              
//#line 1757
final x10.
                                lang.
                                point temp_l =
                                (X10_TEMP301);
                              
//#line 1758
/* template:finish { */
                              {
                              	x10.lang.Runtime.getCurrentActivity().startFinish();
                              	try {
                              		{
                                  
//#line 1759
final x10.
                                    lang.
                                    place X10_TEMP38 =
                                    (x10.
                                       lang.
                                       place.
                                       FIRST_PLACE);
                                  
//#line 1760
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP38)).runAsync
                                  	(new x10.runtime.Activity() {
                                  		public void runX10Task() {
                                  			{
                                      
//#line 1761
final Light X10_TEMP308 =
                                        (Program0.
                                           Program_Scene_getLight(
                                           sc,
                                           temp_l));
                                      
//#line 1763
final Light tempLight =
                                        (X10_TEMP308);
                                      
//#line 1764
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                                      	(new x10.runtime.Activity() {
                                      		public void runX10Task() {
                                      			{
                                          
//#line 1765
final int X10_TEMP312 =
                                            (0);
                                          
//#line 1767
final int X10_TEMP43 =
                                            (X10_TEMP312);
                                          
//#line 1768
final Light X10_TEMP315 =
                                            (tempLight);
                                          
//#line 1770
final Light X10_TEMP46 =
                                            (X10_TEMP315);
                                          
//#line 1771
final Light X10_TEMP319 =
                                            (X10_TEMP46);
                                          
//#line 1773
final Light X10_TEMP322 =
                                            (X10_TEMP319);
                                          
//#line 1774
/* template:array_set { */(temp).set((X10_TEMP322),X10_TEMP43)/* } */;
                                      }
                                      		}
                                      	});/* } */
                                  }
                                  		}
                                  	});/* } */
                              }
                              	} catch (Throwable tmp10) {
                              		x10.lang.Runtime.getCurrentActivity().pushException(tmp10);
                              	} finally {
                              		x10.lang.Runtime.getCurrentActivity().stopFinish();
                              	}
                              }
                              /* } */
                              
                              
//#line 1778
final int X10_TEMP324 =
                                (0);
                              
//#line 1780
final int X10_TEMP48 =
                                (X10_TEMP324);
                              
//#line 1781
final Light X10_TEMP328 =
                                (/* template:parametric { */((Light)(/* template:array_get { */((temp).get(X10_TEMP48))/* } */))/* } */);
                              
//#line 1783
final Light X10_TEMP50 =
                                (X10_TEMP328);
                              
//#line 1784
return X10_TEMP50;
                          } }
                          }/* } */,true,false,true)/* } */));
                    
//#line 1789
final x10.
                      lang.
                      GenericReferenceArray X10_TEMP51 =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((X10_TEMP332));
                    
//#line 1790
final x10.
                      lang.
                      GenericReferenceArray X10_TEMP335 =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((X10_TEMP51));
                    
//#line 1792
final x10.
                      lang.
                      GenericReferenceArray templights =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((X10_TEMP335));
                    
//#line 1793
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 1794
final x10.
                          lang.
                          place X10_TEMP54 =
                          (x10.
                             lang.
                             place.
                             FIRST_PLACE);
                        
//#line 1795
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP54)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 1796
final x10.
                              lang.
                              GenericReferenceArray X10_TEMP340 =
                              (x10.
                                lang.
                                GenericReferenceArray)
                                ((templights));
                            
//#line 1798
final x10.
                              lang.
                              GenericReferenceArray X10_TEMP57 =
                              (x10.
                                lang.
                                GenericReferenceArray)
                                ((X10_TEMP340));
                            
//#line 1799
final x10.
                              lang.
                              GenericReferenceArray X10_TEMP343 =
                              (x10.
                                lang.
                                GenericReferenceArray)
                                ((X10_TEMP57));
                            
//#line 1801
final x10.
                              lang.
                              GenericReferenceArray X10_TEMP346 =
                              (x10.
                                lang.
                                GenericReferenceArray)
                                ((X10_TEMP343));
                            
//#line 1802
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lights =
                              ((X10_TEMP346));
                        }
                        		}
                        	});/* } */
                    }
                    	} catch (Throwable tmp11) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp11);
                    	} finally {
                    		x10.lang.Runtime.getCurrentActivity().stopFinish();
                    	}
                    }
                    /* } */
                    
                    
//#line 1805
final x10.
                      lang.
                      GenericReferenceArray X10_TEMP396 =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d2.
                                                                                                                                       toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                          	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                            lang.
                            point o/* } */, x10.compilergenerated.Parameter1 dummy) { {
                              
//#line 1806
final int X10_TEMP348 =
                                (0);
                              
//#line 1808
final int X10_TEMP60 =
                                (X10_TEMP348);
                              
//#line 1809
final int X10_TEMP351 =
                                (0);
                              
//#line 1811
final int X10_TEMP61 =
                                (X10_TEMP351);
                              
//#line 1812
final x10.
                                lang.
                                region X10_TEMP356 =
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
                                        X10_TEMP60,
                                        X10_TEMP61))));
                              
//#line 1814
final x10.
                                lang.
                                region X10_TEMP62 =
                                (x10.
                                  lang.
                                  region)
                                  ((X10_TEMP356));
                              
//#line 1815
final x10.
                                lang.
                                dist X10_TEMP359 =
                                (x10.
                                  lang.
                                  dist)
                                  ((x10.
                                      lang.
                                      dist.
                                      factory.
                                      constant(
                                      X10_TEMP62,
                                      pHere)));
                              
//#line 1817
final x10.
                                lang.
                                dist dTemp1 =
                                (x10.
                                  lang.
                                  dist)
                                  ((X10_TEMP359));
                              
//#line 1818
final x10.
                                lang.
                                GenericReferenceArray X10_TEMP362 =
                                (x10.
                                  lang.
                                  GenericReferenceArray)
                                  ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dTemp1,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
                              
//#line 1820
final x10.
                                lang.
                                GenericReferenceArray temp1 =
                                (x10.
                                  lang.
                                  GenericReferenceArray)
                                  ((X10_TEMP362));
                              
//#line 1821
final x10.
                                lang.
                                point X10_TEMP365 =
                                (o);
                              
//#line 1823
final x10.
                                lang.
                                point temp_o =
                                (X10_TEMP365);
                              
//#line 1824
/* template:finish { */
                              {
                              	x10.lang.Runtime.getCurrentActivity().startFinish();
                              	try {
                              		{
                                  
//#line 1825
final x10.
                                    lang.
                                    place X10_TEMP67 =
                                    (x10.
                                       lang.
                                       place.
                                       FIRST_PLACE);
                                  
//#line 1826
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP67)).runAsync
                                  	(new x10.runtime.Activity() {
                                  		public void runX10Task() {
                                  			{
                                      
//#line 1827
final Sphere X10_TEMP372 =
                                        (Program0.
                                           Program_Scene_getObject(
                                           sc,
                                           temp_o));
                                      
//#line 1829
final Sphere tempObject =
                                        (X10_TEMP372);
                                      
//#line 1830
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                                      	(new x10.runtime.Activity() {
                                      		public void runX10Task() {
                                      			{
                                          
//#line 1831
final int X10_TEMP376 =
                                            (0);
                                          
//#line 1833
final int X10_TEMP72 =
                                            (X10_TEMP376);
                                          
//#line 1834
final Sphere X10_TEMP379 =
                                            (tempObject);
                                          
//#line 1836
final Sphere X10_TEMP75 =
                                            (X10_TEMP379);
                                          
//#line 1837
final Sphere X10_TEMP383 =
                                            (X10_TEMP75);
                                          
//#line 1839
final Sphere X10_TEMP386 =
                                            (X10_TEMP383);
                                          
//#line 1840
/* template:array_set { */(temp1).set((X10_TEMP386),X10_TEMP72)/* } */;
                                      }
                                      		}
                                      	});/* } */
                                  }
                                  		}
                                  	});/* } */
                              }
                              	} catch (Throwable tmp12) {
                              		x10.lang.Runtime.getCurrentActivity().pushException(tmp12);
                              	} finally {
                              		x10.lang.Runtime.getCurrentActivity().stopFinish();
                              	}
                              }
                              /* } */
                              
                              
//#line 1844
final int X10_TEMP388 =
                                (0);
                              
//#line 1846
final int X10_TEMP77 =
                                (X10_TEMP388);
                              
//#line 1847
final Sphere X10_TEMP392 =
                                (/* template:parametric { */((Sphere)(/* template:array_get { */((temp1).get(X10_TEMP77))/* } */))/* } */);
                              
//#line 1849
final Sphere X10_TEMP79 =
                                (X10_TEMP392);
                              
//#line 1850
return X10_TEMP79;
                          } }
                          }/* } */,true,false,true)/* } */));
                    
//#line 1855
final x10.
                      lang.
                      GenericReferenceArray X10_TEMP80 =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((X10_TEMP396));
                    
//#line 1856
final x10.
                      lang.
                      GenericReferenceArray X10_TEMP399 =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((X10_TEMP80));
                    
//#line 1858
final x10.
                      lang.
                      GenericReferenceArray tempprim =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((X10_TEMP399));
                    
//#line 1859
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 1860
final x10.
                          lang.
                          place X10_TEMP83 =
                          (x10.
                             lang.
                             place.
                             FIRST_PLACE);
                        
//#line 1861
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP83)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 1862
final x10.
                              lang.
                              GenericReferenceArray X10_TEMP404 =
                              (x10.
                                lang.
                                GenericReferenceArray)
                                ((tempprim));
                            
//#line 1864
final x10.
                              lang.
                              GenericReferenceArray X10_TEMP86 =
                              (x10.
                                lang.
                                GenericReferenceArray)
                                ((X10_TEMP404));
                            
//#line 1865
final x10.
                              lang.
                              GenericReferenceArray X10_TEMP407 =
                              (x10.
                                lang.
                                GenericReferenceArray)
                                ((X10_TEMP86));
                            
//#line 1867
final x10.
                              lang.
                              GenericReferenceArray X10_TEMP410 =
                              (x10.
                                lang.
                                GenericReferenceArray)
                                ((X10_TEMP407));
                            
//#line 1868
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.prim =
                              ((X10_TEMP410));
                        }
                        		}
                        	});/* } */
                    }
                    	} catch (Throwable tmp13) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp13);
                    	} finally {
                    		x10.lang.Runtime.getCurrentActivity().stopFinish();
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
        	} catch (Throwable tmp9) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp9);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1874
final View X10_TEMP413 =
          (Program0.
             Program_Scene_getView(
             scene));
        
//#line 1876
final View X10_TEMP89 =
          (X10_TEMP413);
        
//#line 1877
final View X10_TEMP416 =
          (X10_TEMP89);
        
//#line 1879
final View X10_TEMP90 =
          (X10_TEMP416);
        
//#line 1880
final View X10_TEMP419 =
          (X10_TEMP90);
        
//#line 1882
final View X10_TEMP422 =
          (X10_TEMP419);
        
//#line 1883
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.view =
          ((X10_TEMP422));
    }
    
    
//#line 1885
public static void
                    Program_RayTracer_render(
                    final RayTracer X10_TEMP0,
                    final Interval interval) {
        
//#line 1886
final int X10_TEMP210 =
          (0);
        
//#line 1888
final int X10_TEMP11 =
          (X10_TEMP210);
        
//#line 1889
final int X10_TEMP213 =
          (interval.
             width);
        
//#line 1891
final int X10_TEMP6 =
          (X10_TEMP213);
        
//#line 1892
final int X10_TEMP216 =
          (interval.
             yto);
        
//#line 1894
final int X10_TEMP2 =
          (X10_TEMP216);
        
//#line 1895
final int X10_TEMP219 =
          (interval.
             yfrom);
        
//#line 1897
final int X10_TEMP3 =
          (X10_TEMP219);
        
//#line 1898
final int X10_TEMP222 =
          (X10_TEMP2 -
             X10_TEMP3);
        
//#line 1900
final int X10_TEMP5 =
          (X10_TEMP222);
        
//#line 1901
final int X10_TEMP225 =
          (X10_TEMP6 *
             X10_TEMP5);
        
//#line 1903
final int X10_TEMP8 =
          (X10_TEMP225);
        
//#line 1904
final int X10_TEMP228 =
          (1);
        
//#line 1906
final int X10_TEMP9 =
          (X10_TEMP228);
        
//#line 1907
final int X10_TEMP231 =
          (X10_TEMP8 -
             X10_TEMP9);
        
//#line 1909
final int X10_TEMP12 =
          (X10_TEMP231);
        
//#line 1910
final x10.
          lang.
          region X10_TEMP236 =
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
                  X10_TEMP11,
                  X10_TEMP12))));
        
//#line 1912
final x10.
          lang.
          region R =
          (x10.
            lang.
            region)
            ((X10_TEMP236));
        
//#line 1913
final x10.
          lang.
          dist X10_TEMP240 =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 1913
public x10.
                              lang.
                              dist
                              checkCast(
                              final x10.
                                lang.
                                dist x10_generated_objToCast) {
                  
//#line 1913
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
               R)));
        
//#line 1915
final x10.
          lang.
          dist X10_TEMP15 =
          (x10.
            lang.
            dist)
            ((X10_TEMP240));
        
//#line 1916
final x10.
          lang.
          dist X10_TEMP243 =
          (x10.
            lang.
            dist)
            ((X10_TEMP15));
        
//#line 1918
final x10.
          lang.
          dist DBlock =
          (x10.
            lang.
            dist)
            ((X10_TEMP243));
        
//#line 1919
final x10.
          lang.
          dist X10_TEMP246 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                UNIQUE));
        
//#line 1921
final x10.
          lang.
          dist X10_TEMP17 =
          (x10.
            lang.
            dist)
            ((X10_TEMP246));
        
//#line 1922
final x10.
          lang.
          dist X10_TEMP249 =
          (x10.
            lang.
            dist)
            ((X10_TEMP17));
        
//#line 1924
final x10.
          lang.
          dist U =
          (x10.
            lang.
            dist)
            ((X10_TEMP249));
        
//#line 1925
final x10.
          lang.
          IntReferenceArray X10_TEMP252 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(DBlock,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1927
final x10.
          lang.
          IntReferenceArray row =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP252));
        
//#line 1928
final x10.
          lang.
          region X10_TEMP255 =
          (x10.
            lang.
            region)
            ((U.
                region));
        
//#line 1930
final x10.
          lang.
          region chkSumReg =
          (x10.
            lang.
            region)
            ((X10_TEMP255));
        
//#line 1931
final x10.
          lang.
          place X10_TEMP258 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1933
final x10.
          lang.
          place pHere =
          (X10_TEMP258);
        
//#line 1934
final x10.
          lang.
          place X10_TEMP261 =
          (x10.
             lang.
             place.
             FIRST_PLACE);
        
//#line 1936
final x10.
          lang.
          place fp =
          (X10_TEMP261);
        
//#line 1937
final x10.
          lang.
          dist X10_TEMP264 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                chkSumReg,
                fp)));
        
//#line 1939
final x10.
          lang.
          dist chkSumDist =
          (x10.
            lang.
            dist)
            ((X10_TEMP264));
        
//#line 1940
final x10.
          lang.
          LongReferenceArray X10_TEMP267 =
          (x10.
            lang.
            LongReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.LongArray(chkSumDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1942
final x10.
          lang.
          LongReferenceArray X10_TEMP26 =
          (x10.
            lang.
            LongReferenceArray)
            ((X10_TEMP267));
        
//#line 1943
final x10.
          lang.
          LongReferenceArray X10_TEMP270 =
          (x10.
            lang.
            LongReferenceArray)
            ((X10_TEMP26));
        
//#line 1945
final x10.
          lang.
          LongReferenceArray X10_TEMP27 =
          (x10.
            lang.
            LongReferenceArray)
            ((X10_TEMP270));
        
//#line 1946
final x10.
          lang.
          LongReferenceArray X10_TEMP273 =
          (x10.
            lang.
            LongReferenceArray)
            ((X10_TEMP27));
        
//#line 1948
final x10.
          lang.
          LongReferenceArray X10_TEMP276 =
          (x10.
            lang.
            LongReferenceArray)
            ((X10_TEMP273));
        
//#line 1949
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.checkSumArray =
          ((X10_TEMP276));
        
//#line 1950
final View X10_TEMP278 =
          (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.view);
        
//#line 1952
final View myview =
          (X10_TEMP278);
        
//#line 1953
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1954
/* template:forloop { */
            for (java.util.Iterator pl__ = (U.
                                              region).iterator(); pl__.hasNext(); ) {
            	final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 1955
final x10.
                  lang.
                  place X10_TEMP30 =
                  (U.
                     get(
                     pl));
                
//#line 1956
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP30)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1957
final x10.
                      lang.
                      place X10_TEMP285 =
                      (/* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 1959
final x10.
                      lang.
                      place X10_TEMP31 =
                      (X10_TEMP285);
                    
//#line 1960
final x10.
                      lang.
                      dist X10_TEMP288 =
                      (x10.
                        lang.
                        dist)
                        ((DBlock.
                            restriction(
                            X10_TEMP31)));
                    
//#line 1962
final x10.
                      lang.
                      dist my_dist =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP288));
                    
//#line 1963
final int X10_TEMP291 =
                      (0);
                    
//#line 1965
long checksum1 =
                      (X10_TEMP291);
                    
//#line 1966
final double X10_TEMP294 =
                      (myview.
                         distance);
                    
//#line 1968
final double X10_TEMP42 =
                      (X10_TEMP294);
                    
//#line 1969
final double X10_TEMP297 =
                      (myview.
                         angle);
                    
//#line 1971
final double X10_TEMP35 =
                      (X10_TEMP297);
                    
//#line 1972
final double X10_TEMP301 =
                      (java.
                         lang.
                         Math.
                         sin(
                         X10_TEMP35));
                    
//#line 1974
final double X10_TEMP38 =
                      (X10_TEMP301);
                    
//#line 1975
final double X10_TEMP304 =
                      (myview.
                         angle);
                    
//#line 1977
final double X10_TEMP37 =
                      (X10_TEMP304);
                    
//#line 1978
final double X10_TEMP308 =
                      (java.
                         lang.
                         Math.
                         cos(
                         X10_TEMP37));
                    
//#line 1980
final double X10_TEMP39 =
                      (X10_TEMP308);
                    
//#line 1981
final double X10_TEMP311 =
                      (X10_TEMP38 /
                         X10_TEMP39);
                    
//#line 1983
final double X10_TEMP41 =
                      (X10_TEMP311);
                    
//#line 1984
final double X10_TEMP314 =
                      (X10_TEMP42 *
                         X10_TEMP41);
                    
//#line 1986
double frustrumwidth =
                      (X10_TEMP314);
                    
//#line 1987
final Vec X10_TEMP317 =
                      (myview.
                         at);
                    
//#line 1989
final Vec X10_TEMP46 =
                      (X10_TEMP317);
                    
//#line 1990
final Vec X10_TEMP320 =
                      (myview.
                         from);
                    
//#line 1992
final Vec X10_TEMP47 =
                      (X10_TEMP320);
                    
//#line 1993
final Vec X10_TEMP325 =
                      (Program0.
                         Program_Vec_sub(
                         X10_TEMP46,
                         X10_TEMP47));
                    
//#line 1995
final Vec X10_TEMP48 =
                      (X10_TEMP325);
                    
//#line 1996
final Vec X10_TEMP329 =
                      (Program0.
                         Program_Vec_normalized(
                         X10_TEMP48));
                    
//#line 1998
Vec viewVec =
                      (X10_TEMP329);
                    
//#line 1999
final boolean X10_TEMP332 =
                      (false);
                    
//#line 2001
boolean X10_TEMP52 =
                      (X10_TEMP332);
                    
//#line 2002
final Vec X10_TEMP337 =
                      (new Vec(
                         viewVec,
                         X10_TEMP52));
                    
//#line 2004
final Vec X10_TEMP53 =
                      (X10_TEMP337);
                    
//#line 2005
final Vec X10_TEMP340 =
                      (myview.
                         up);
                    
//#line 2007
final Vec X10_TEMP56 =
                      (X10_TEMP340);
                    
//#line 2008
final double X10_TEMP345 =
                      (Program0.
                         Program_Vec_dot(
                         X10_TEMP56,
                         viewVec));
                    
//#line 2010
final double X10_TEMP58 =
                      (X10_TEMP345);
                    
//#line 2011
final Vec X10_TEMP350 =
                      (Program0.
                         Program_Vec_scale(
                         X10_TEMP53,
                         X10_TEMP58));
                    
//#line 2013
Vec tmpVec =
                      (X10_TEMP350);
                    
//#line 2014
final Vec X10_TEMP353 =
                      (myview.
                         up);
                    
//#line 2016
final Vec X10_TEMP62 =
                      (X10_TEMP353);
                    
//#line 2017
final Vec X10_TEMP358 =
                      (Program0.
                         Program_Vec_sub(
                         X10_TEMP62,
                         tmpVec));
                    
//#line 2019
final Vec X10_TEMP63 =
                      (X10_TEMP358);
                    
//#line 2020
final Vec X10_TEMP362 =
                      (Program0.
                         Program_Vec_normalized(
                         X10_TEMP63));
                    
//#line 2022
final Vec X10_TEMP64 =
                      (X10_TEMP362);
                    
//#line 2023
final int X10_TEMP65 =
                      (0);
                    
//#line 2024
final double X10_TEMP366 =
                      (X10_TEMP65 -
                         frustrumwidth);
                    
//#line 2026
final double X10_TEMP67 =
                      (X10_TEMP366);
                    
//#line 2027
final Vec X10_TEMP371 =
                      (Program0.
                         Program_Vec_scale(
                         X10_TEMP64,
                         X10_TEMP67));
                    
//#line 2029
Vec upVec =
                      (X10_TEMP371);
                    
//#line 2030
final Vec X10_TEMP374 =
                      (myview.
                         up);
                    
//#line 2032
final Vec X10_TEMP71 =
                      (X10_TEMP374);
                    
//#line 2033
final Vec X10_TEMP379 =
                      (Program0.
                         Program_Vec_cross(
                         X10_TEMP71,
                         viewVec));
                    
//#line 2035
final Vec X10_TEMP72 =
                      (X10_TEMP379);
                    
//#line 2036
final Vec X10_TEMP383 =
                      (Program0.
                         Program_Vec_normalized(
                         X10_TEMP72));
                    
//#line 2038
final Vec X10_TEMP73 =
                      (X10_TEMP383);
                    
//#line 2039
final double X10_TEMP386 =
                      (myview.
                         aspect);
                    
//#line 2041
final double X10_TEMP74 =
                      (X10_TEMP386);
                    
//#line 2042
final double X10_TEMP389 =
                      (X10_TEMP74 *
                         frustrumwidth);
                    
//#line 2044
final double X10_TEMP76 =
                      (X10_TEMP389);
                    
//#line 2045
final Vec X10_TEMP394 =
                      (Program0.
                         Program_Vec_scale(
                         X10_TEMP73,
                         X10_TEMP76));
                    
//#line 2047
Vec leftVec =
                      (X10_TEMP394);
                    
//#line 2048
final Vec X10_TEMP397 =
                      (myview.
                         from);
                    
//#line 2050
Vec X10_TEMP80 =
                      (X10_TEMP397);
                    
//#line 2051
final Ray X10_TEMP402 =
                      (new Ray(
                         X10_TEMP80,
                         _Program__RayTracer_voidVec));
                    
//#line 2053
Ray r =
                      (X10_TEMP402);
                    
//#line 2054
final x10.
                      lang.
                      region X10_TEMP405 =
                      (x10.
                        lang.
                        region)
                        ((my_dist.
                            region));
                    
//#line 2056
final x10.
                      lang.
                      region X10_TEMP83 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP405));
                    
//#line 2057
/* template:forloop-mult { */{
                    x10.lang.region __var15__ = (x10.lang.region) X10_TEMP83;
                    if (__var15__.size() > 0 && (__var15__ instanceof x10.array.MultiDimRegion || __var15__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var16__ = __var15__.rank(0).low(), __var17__ = __var15__.rank(0).high(); __var16__ <= __var17__; __var16__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int pixCounter = __var16__;
                    /* } */
                    /* } */
{
                        
//#line 2058
final int X10_TEMP409 =
                          (interval.
                             width);
                        
//#line 2060
final int X10_TEMP84 =
                          (X10_TEMP409);
                        
//#line 2061
final int X10_TEMP412 =
                          (pixCounter /
                             X10_TEMP84);
                        
//#line 2063
int y =
                          (X10_TEMP412);
                        
//#line 2064
final int X10_TEMP415 =
                          (interval.
                             width);
                        
//#line 2066
final int X10_TEMP86 =
                          (X10_TEMP415);
                        
//#line 2067
final int X10_TEMP418 =
                          (pixCounter %
                             X10_TEMP86);
                        
//#line 2069
int x =
                          (X10_TEMP418);
                        
//#line 2070
final double X10_TEMP421 =
                          (2.0);
                        
//#line 2072
final double X10_TEMP88 =
                          (X10_TEMP421);
                        
//#line 2073
final double X10_TEMP424 =
                          (X10_TEMP88 *
                             y);
                        
//#line 2075
final double X10_TEMP90 =
                          (X10_TEMP424);
                        
//#line 2076
final double X10_TEMP427 =
                          ((double)
                             X10_TEMP90);
                        
//#line 2078
final double X10_TEMP92 =
                          (X10_TEMP427);
                        
//#line 2079
final int X10_TEMP430 =
                          (interval.
                             width);
                        
//#line 2081
final int X10_TEMP91 =
                          (X10_TEMP430);
                        
//#line 2082
final double X10_TEMP433 =
                          ((double)
                             X10_TEMP91);
                        
//#line 2084
final double X10_TEMP93 =
                          (X10_TEMP433);
                        
//#line 2085
final double X10_TEMP436 =
                          (X10_TEMP92 /
                             X10_TEMP93);
                        
//#line 2087
final double X10_TEMP94 =
                          (X10_TEMP436);
                        
//#line 2088
final double X10_TEMP439 =
                          (1.0);
                        
//#line 2090
final double X10_TEMP95 =
                          (X10_TEMP439);
                        
//#line 2091
final double X10_TEMP442 =
                          (X10_TEMP94 -
                             X10_TEMP95);
                        
//#line 2093
double ylen =
                          (X10_TEMP442);
                        
//#line 2094
final double X10_TEMP445 =
                          (2.0);
                        
//#line 2096
final double X10_TEMP97 =
                          (X10_TEMP445);
                        
//#line 2097
final double X10_TEMP448 =
                          (X10_TEMP97 *
                             x);
                        
//#line 2099
final double X10_TEMP99 =
                          (X10_TEMP448);
                        
//#line 2100
final double X10_TEMP451 =
                          ((double)
                             X10_TEMP99);
                        
//#line 2102
final double X10_TEMP101 =
                          (X10_TEMP451);
                        
//#line 2103
final int X10_TEMP454 =
                          (interval.
                             width);
                        
//#line 2105
final int X10_TEMP100 =
                          (X10_TEMP454);
                        
//#line 2106
final double X10_TEMP457 =
                          ((double)
                             X10_TEMP100);
                        
//#line 2108
final double X10_TEMP102 =
                          (X10_TEMP457);
                        
//#line 2109
final double X10_TEMP460 =
                          (X10_TEMP101 /
                             X10_TEMP102);
                        
//#line 2111
final double X10_TEMP103 =
                          (X10_TEMP460);
                        
//#line 2112
final double X10_TEMP463 =
                          (1.0);
                        
//#line 2114
final double X10_TEMP104 =
                          (X10_TEMP463);
                        
//#line 2115
final double X10_TEMP466 =
                          (X10_TEMP103 -
                             X10_TEMP104);
                        
//#line 2117
double xlen =
                          (X10_TEMP466);
                        
//#line 2118
final Vec X10_TEMP473 =
                          (Program0.
                             Program_Vec_comb(
                             xlen,
                             leftVec,
                             ylen,
                             upVec));
                        
//#line 2120
final Vec X10_TEMP110 =
                          (X10_TEMP473);
                        
//#line 2121
final Vec X10_TEMP478 =
                          (Program0.
                             Program_Vec_added(
                             X10_TEMP110,
                             viewVec));
                        
//#line 2123
final Vec X10_TEMP112 =
                          (X10_TEMP478);
                        
//#line 2124
final Vec X10_TEMP482 =
                          (Program0.
                             Program_Vec_normalized(
                             X10_TEMP112));
                        
//#line 2126
final Vec X10_TEMP114 =
                          (X10_TEMP482);
                        
//#line 2127
final Ray X10_TEMP487 =
                          (Program0.
                             Program_Ray_d(
                             r,
                             X10_TEMP114));
                        
//#line 2129
final Ray X10_TEMP116 =
                          (X10_TEMP487);
                        
//#line 2130
final Ray X10_TEMP490 =
                          (X10_TEMP116);
                        
//#line 2132
r =
                          ((X10_TEMP490));
                        
//#line 2133
final int X10_TEMP493 =
                          (0);
                        
//#line 2135
final int X10_TEMP122 =
                          (X10_TEMP493);
                        
//#line 2136
final double X10_TEMP496 =
                          (1.0);
                        
//#line 2138
final double X10_TEMP123 =
                          (X10_TEMP496);
                        
//#line 2139
final Isect X10_TEMP499 =
                          (new Isect(
                             ));
                        
//#line 2141
final Isect X10_TEMP124 =
                          (X10_TEMP499);
                        
//#line 2142
final Ray X10_TEMP502 =
                          (new Ray(
                             ));
                        
//#line 2144
final Ray X10_TEMP125 =
                          (X10_TEMP502);
                        
//#line 2145
final Vec X10_TEMP511 =
                          (Program0.
                             Program_RayTracer_trace(
                             X10_TEMP0,
                             X10_TEMP122,
                             X10_TEMP123,
                             r,
                             X10_TEMP124,
                             X10_TEMP125));
                        
//#line 2147
Vec col =
                          (X10_TEMP511);
                        
//#line 2148
final double X10_TEMP514 =
                          (col.
                             x);
                        
//#line 2150
final double X10_TEMP127 =
                          (X10_TEMP514);
                        
//#line 2151
final double X10_TEMP517 =
                          (255.0);
                        
//#line 2153
final double X10_TEMP128 =
                          (X10_TEMP517);
                        
//#line 2154
final double X10_TEMP520 =
                          (X10_TEMP127 *
                             X10_TEMP128);
                        
//#line 2156
final double X10_TEMP130 =
                          (X10_TEMP520);
                        
//#line 2157
final int X10_TEMP523 =
                          ((int)
                             X10_TEMP130);
                        
//#line 2159
int red =
                          (X10_TEMP523);
                        
//#line 2160
final int X10_TEMP526 =
                          (255);
                        
//#line 2162
final int X10_TEMP132 =
                          (X10_TEMP526);
                        
//#line 2163
final boolean X10_TEMP134 =
                          (red >
                             X10_TEMP132);
                        
//#line 2164
if (X10_TEMP134) {
                            
//#line 2165
final int X10_TEMP531 =
                              (255);
                            
//#line 2167
final int X10_TEMP136 =
                              (X10_TEMP531);
                            
//#line 2168
final int X10_TEMP534 =
                              (X10_TEMP136);
                            
//#line 2170
red =
                              ((X10_TEMP534));
                        }
                        
//#line 2172
final double X10_TEMP537 =
                          (col.
                             y);
                        
//#line 2174
final double X10_TEMP137 =
                          (X10_TEMP537);
                        
//#line 2175
final double X10_TEMP540 =
                          (255.0);
                        
//#line 2177
final double X10_TEMP138 =
                          (X10_TEMP540);
                        
//#line 2178
final double X10_TEMP543 =
                          (X10_TEMP137 *
                             X10_TEMP138);
                        
//#line 2180
final double X10_TEMP140 =
                          (X10_TEMP543);
                        
//#line 2181
final int X10_TEMP546 =
                          ((int)
                             X10_TEMP140);
                        
//#line 2183
int green =
                          (X10_TEMP546);
                        
//#line 2184
final int X10_TEMP549 =
                          (255);
                        
//#line 2186
final int X10_TEMP142 =
                          (X10_TEMP549);
                        
//#line 2187
final boolean X10_TEMP144 =
                          (green >
                             X10_TEMP142);
                        
//#line 2188
if (X10_TEMP144) {
                            
//#line 2189
final int X10_TEMP554 =
                              (255);
                            
//#line 2191
final int X10_TEMP146 =
                              (X10_TEMP554);
                            
//#line 2192
final int X10_TEMP557 =
                              (X10_TEMP146);
                            
//#line 2194
green =
                              ((X10_TEMP557));
                        }
                        
//#line 2196
final double X10_TEMP560 =
                          (col.
                             z);
                        
//#line 2198
final double X10_TEMP147 =
                          (X10_TEMP560);
                        
//#line 2199
final double X10_TEMP563 =
                          (255.0);
                        
//#line 2201
final double X10_TEMP148 =
                          (X10_TEMP563);
                        
//#line 2202
final double X10_TEMP566 =
                          (X10_TEMP147 *
                             X10_TEMP148);
                        
//#line 2204
final double X10_TEMP150 =
                          (X10_TEMP566);
                        
//#line 2205
final int X10_TEMP569 =
                          ((int)
                             X10_TEMP150);
                        
//#line 2207
int blue =
                          (X10_TEMP569);
                        
//#line 2208
final int X10_TEMP572 =
                          (255);
                        
//#line 2210
final int X10_TEMP152 =
                          (X10_TEMP572);
                        
//#line 2211
final boolean X10_TEMP154 =
                          (blue >
                             X10_TEMP152);
                        
//#line 2212
if (X10_TEMP154) {
                            
//#line 2213
final int X10_TEMP577 =
                              (255);
                            
//#line 2215
final int X10_TEMP156 =
                              (X10_TEMP577);
                            
//#line 2216
final int X10_TEMP580 =
                              (X10_TEMP156);
                            
//#line 2218
blue =
                              ((X10_TEMP580));
                        }
                        
//#line 2220
final int X10_TEMP583 =
                          (red +
                             green);
                        
//#line 2222
final int X10_TEMP157 =
                          (X10_TEMP583);
                        
//#line 2223
final int X10_TEMP586 =
                          (X10_TEMP157 +
                             blue);
                        
//#line 2225
final long X10_TEMP159 =
                          (X10_TEMP586);
                        
//#line 2226
final long X10_TEMP589 =
                          (checksum1 +
                             X10_TEMP159);
                        
//#line 2228
checksum1 =
                          ((X10_TEMP589));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var1____ = (__var15__).iterator(); __var1____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var1__ = (x10.
                      lang.
                      point) __var1____.next();
                    	/* Join: { *//* Join: { */final int pixCounter =
                      /* template:array_get { */((__var1__).get(0))/* } */;/* } */
{
                        
//#line 2058
final int X10_TEMP409 =
                          (interval.
                             width);
                        
//#line 2060
final int X10_TEMP84 =
                          (X10_TEMP409);
                        
//#line 2061
final int X10_TEMP412 =
                          (pixCounter /
                             X10_TEMP84);
                        
//#line 2063
int y =
                          (X10_TEMP412);
                        
//#line 2064
final int X10_TEMP415 =
                          (interval.
                             width);
                        
//#line 2066
final int X10_TEMP86 =
                          (X10_TEMP415);
                        
//#line 2067
final int X10_TEMP418 =
                          (pixCounter %
                             X10_TEMP86);
                        
//#line 2069
int x =
                          (X10_TEMP418);
                        
//#line 2070
final double X10_TEMP421 =
                          (2.0);
                        
//#line 2072
final double X10_TEMP88 =
                          (X10_TEMP421);
                        
//#line 2073
final double X10_TEMP424 =
                          (X10_TEMP88 *
                             y);
                        
//#line 2075
final double X10_TEMP90 =
                          (X10_TEMP424);
                        
//#line 2076
final double X10_TEMP427 =
                          ((double)
                             X10_TEMP90);
                        
//#line 2078
final double X10_TEMP92 =
                          (X10_TEMP427);
                        
//#line 2079
final int X10_TEMP430 =
                          (interval.
                             width);
                        
//#line 2081
final int X10_TEMP91 =
                          (X10_TEMP430);
                        
//#line 2082
final double X10_TEMP433 =
                          ((double)
                             X10_TEMP91);
                        
//#line 2084
final double X10_TEMP93 =
                          (X10_TEMP433);
                        
//#line 2085
final double X10_TEMP436 =
                          (X10_TEMP92 /
                             X10_TEMP93);
                        
//#line 2087
final double X10_TEMP94 =
                          (X10_TEMP436);
                        
//#line 2088
final double X10_TEMP439 =
                          (1.0);
                        
//#line 2090
final double X10_TEMP95 =
                          (X10_TEMP439);
                        
//#line 2091
final double X10_TEMP442 =
                          (X10_TEMP94 -
                             X10_TEMP95);
                        
//#line 2093
double ylen =
                          (X10_TEMP442);
                        
//#line 2094
final double X10_TEMP445 =
                          (2.0);
                        
//#line 2096
final double X10_TEMP97 =
                          (X10_TEMP445);
                        
//#line 2097
final double X10_TEMP448 =
                          (X10_TEMP97 *
                             x);
                        
//#line 2099
final double X10_TEMP99 =
                          (X10_TEMP448);
                        
//#line 2100
final double X10_TEMP451 =
                          ((double)
                             X10_TEMP99);
                        
//#line 2102
final double X10_TEMP101 =
                          (X10_TEMP451);
                        
//#line 2103
final int X10_TEMP454 =
                          (interval.
                             width);
                        
//#line 2105
final int X10_TEMP100 =
                          (X10_TEMP454);
                        
//#line 2106
final double X10_TEMP457 =
                          ((double)
                             X10_TEMP100);
                        
//#line 2108
final double X10_TEMP102 =
                          (X10_TEMP457);
                        
//#line 2109
final double X10_TEMP460 =
                          (X10_TEMP101 /
                             X10_TEMP102);
                        
//#line 2111
final double X10_TEMP103 =
                          (X10_TEMP460);
                        
//#line 2112
final double X10_TEMP463 =
                          (1.0);
                        
//#line 2114
final double X10_TEMP104 =
                          (X10_TEMP463);
                        
//#line 2115
final double X10_TEMP466 =
                          (X10_TEMP103 -
                             X10_TEMP104);
                        
//#line 2117
double xlen =
                          (X10_TEMP466);
                        
//#line 2118
final Vec X10_TEMP473 =
                          (Program0.
                             Program_Vec_comb(
                             xlen,
                             leftVec,
                             ylen,
                             upVec));
                        
//#line 2120
final Vec X10_TEMP110 =
                          (X10_TEMP473);
                        
//#line 2121
final Vec X10_TEMP478 =
                          (Program0.
                             Program_Vec_added(
                             X10_TEMP110,
                             viewVec));
                        
//#line 2123
final Vec X10_TEMP112 =
                          (X10_TEMP478);
                        
//#line 2124
final Vec X10_TEMP482 =
                          (Program0.
                             Program_Vec_normalized(
                             X10_TEMP112));
                        
//#line 2126
final Vec X10_TEMP114 =
                          (X10_TEMP482);
                        
//#line 2127
final Ray X10_TEMP487 =
                          (Program0.
                             Program_Ray_d(
                             r,
                             X10_TEMP114));
                        
//#line 2129
final Ray X10_TEMP116 =
                          (X10_TEMP487);
                        
//#line 2130
final Ray X10_TEMP490 =
                          (X10_TEMP116);
                        
//#line 2132
r =
                          ((X10_TEMP490));
                        
//#line 2133
final int X10_TEMP493 =
                          (0);
                        
//#line 2135
final int X10_TEMP122 =
                          (X10_TEMP493);
                        
//#line 2136
final double X10_TEMP496 =
                          (1.0);
                        
//#line 2138
final double X10_TEMP123 =
                          (X10_TEMP496);
                        
//#line 2139
final Isect X10_TEMP499 =
                          (new Isect(
                             ));
                        
//#line 2141
final Isect X10_TEMP124 =
                          (X10_TEMP499);
                        
//#line 2142
final Ray X10_TEMP502 =
                          (new Ray(
                             ));
                        
//#line 2144
final Ray X10_TEMP125 =
                          (X10_TEMP502);
                        
//#line 2145
final Vec X10_TEMP511 =
                          (Program0.
                             Program_RayTracer_trace(
                             X10_TEMP0,
                             X10_TEMP122,
                             X10_TEMP123,
                             r,
                             X10_TEMP124,
                             X10_TEMP125));
                        
//#line 2147
Vec col =
                          (X10_TEMP511);
                        
//#line 2148
final double X10_TEMP514 =
                          (col.
                             x);
                        
//#line 2150
final double X10_TEMP127 =
                          (X10_TEMP514);
                        
//#line 2151
final double X10_TEMP517 =
                          (255.0);
                        
//#line 2153
final double X10_TEMP128 =
                          (X10_TEMP517);
                        
//#line 2154
final double X10_TEMP520 =
                          (X10_TEMP127 *
                             X10_TEMP128);
                        
//#line 2156
final double X10_TEMP130 =
                          (X10_TEMP520);
                        
//#line 2157
final int X10_TEMP523 =
                          ((int)
                             X10_TEMP130);
                        
//#line 2159
int red =
                          (X10_TEMP523);
                        
//#line 2160
final int X10_TEMP526 =
                          (255);
                        
//#line 2162
final int X10_TEMP132 =
                          (X10_TEMP526);
                        
//#line 2163
final boolean X10_TEMP134 =
                          (red >
                             X10_TEMP132);
                        
//#line 2164
if (X10_TEMP134) {
                            
//#line 2165
final int X10_TEMP531 =
                              (255);
                            
//#line 2167
final int X10_TEMP136 =
                              (X10_TEMP531);
                            
//#line 2168
final int X10_TEMP534 =
                              (X10_TEMP136);
                            
//#line 2170
red =
                              ((X10_TEMP534));
                        }
                        
//#line 2172
final double X10_TEMP537 =
                          (col.
                             y);
                        
//#line 2174
final double X10_TEMP137 =
                          (X10_TEMP537);
                        
//#line 2175
final double X10_TEMP540 =
                          (255.0);
                        
//#line 2177
final double X10_TEMP138 =
                          (X10_TEMP540);
                        
//#line 2178
final double X10_TEMP543 =
                          (X10_TEMP137 *
                             X10_TEMP138);
                        
//#line 2180
final double X10_TEMP140 =
                          (X10_TEMP543);
                        
//#line 2181
final int X10_TEMP546 =
                          ((int)
                             X10_TEMP140);
                        
//#line 2183
int green =
                          (X10_TEMP546);
                        
//#line 2184
final int X10_TEMP549 =
                          (255);
                        
//#line 2186
final int X10_TEMP142 =
                          (X10_TEMP549);
                        
//#line 2187
final boolean X10_TEMP144 =
                          (green >
                             X10_TEMP142);
                        
//#line 2188
if (X10_TEMP144) {
                            
//#line 2189
final int X10_TEMP554 =
                              (255);
                            
//#line 2191
final int X10_TEMP146 =
                              (X10_TEMP554);
                            
//#line 2192
final int X10_TEMP557 =
                              (X10_TEMP146);
                            
//#line 2194
green =
                              ((X10_TEMP557));
                        }
                        
//#line 2196
final double X10_TEMP560 =
                          (col.
                             z);
                        
//#line 2198
final double X10_TEMP147 =
                          (X10_TEMP560);
                        
//#line 2199
final double X10_TEMP563 =
                          (255.0);
                        
//#line 2201
final double X10_TEMP148 =
                          (X10_TEMP563);
                        
//#line 2202
final double X10_TEMP566 =
                          (X10_TEMP147 *
                             X10_TEMP148);
                        
//#line 2204
final double X10_TEMP150 =
                          (X10_TEMP566);
                        
//#line 2205
final int X10_TEMP569 =
                          ((int)
                             X10_TEMP150);
                        
//#line 2207
int blue =
                          (X10_TEMP569);
                        
//#line 2208
final int X10_TEMP572 =
                          (255);
                        
//#line 2210
final int X10_TEMP152 =
                          (X10_TEMP572);
                        
//#line 2211
final boolean X10_TEMP154 =
                          (blue >
                             X10_TEMP152);
                        
//#line 2212
if (X10_TEMP154) {
                            
//#line 2213
final int X10_TEMP577 =
                              (255);
                            
//#line 2215
final int X10_TEMP156 =
                              (X10_TEMP577);
                            
//#line 2216
final int X10_TEMP580 =
                              (X10_TEMP156);
                            
//#line 2218
blue =
                              ((X10_TEMP580));
                        }
                        
//#line 2220
final int X10_TEMP583 =
                          (red +
                             green);
                        
//#line 2222
final int X10_TEMP157 =
                          (X10_TEMP583);
                        
//#line 2223
final int X10_TEMP586 =
                          (X10_TEMP157 +
                             blue);
                        
//#line 2225
final long X10_TEMP159 =
                          (X10_TEMP586);
                        
//#line 2226
final long X10_TEMP589 =
                          (checksum1 +
                             X10_TEMP159);
                        
//#line 2228
checksum1 =
                          ((X10_TEMP589));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                    
//#line 2230
final long X10_TEMP592 =
                      (checksum1);
                    
//#line 2232
final long checksumx =
                      (X10_TEMP592);
                    
//#line 2233
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 2234
/* template:Async { */(x10.lang.Runtime.asPlace(fp)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 2235
final x10.
                              lang.
                              LongReferenceArray X10_TEMP596 =
                              (x10.
                                lang.
                                LongReferenceArray)
                                ((/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.checkSumArray));
                            
//#line 2237
final x10.
                              lang.
                              LongReferenceArray X10_TEMP162 =
                              (x10.
                                lang.
                                LongReferenceArray)
                                ((X10_TEMP596));
                            
//#line 2238
final long X10_TEMP599 =
                              (checksumx);
                            
//#line 2240
final long X10_TEMP166 =
                              (X10_TEMP599);
                            
//#line 2241
final long X10_TEMP603 =
                              (X10_TEMP166);
                            
//#line 2243
final long X10_TEMP606 =
                              (X10_TEMP603);
                            
//#line 2244
/* template:array_set { */(X10_TEMP162).set((X10_TEMP606),pl)/* } */;
                        }
                        		}
                        	});/* } */
                    }
                    	} catch (Throwable tmp18) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp18);
                    	} finally {
                    		x10.lang.Runtime.getCurrentActivity().stopFinish();
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
        	} catch (Throwable tmp14) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp14);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2250
final x10.
          lang.
          LongReferenceArray X10_TEMP608 =
          (x10.
            lang.
            LongReferenceArray)
            ((/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.checkSumArray));
        
//#line 2252
final x10.
          lang.
          LongReferenceArray X10_TEMP167 =
          (x10.
            lang.
            LongReferenceArray)
            ((X10_TEMP608));
        
//#line 2253
final x10.
          lang.
          dist X10_TEMP611 =
          (x10.
            lang.
            dist)
            ((X10_TEMP167.
                distribution));
        
//#line 2255
final x10.
          lang.
          dist X10_TEMP168 =
          (x10.
            lang.
            dist)
            ((X10_TEMP611));
        
//#line 2256
final x10.
          lang.
          region X10_TEMP614 =
          (x10.
            lang.
            region)
            ((X10_TEMP168.
                region));
        
//#line 2258
final x10.
          lang.
          region regSum =
          (x10.
            lang.
            region)
            ((X10_TEMP614));
        
//#line 2259
/* template:forloop { */
        for (java.util.Iterator i__ = (chkSumReg).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 2260
final x10.
              lang.
              LongReferenceArray X10_TEMP618 =
              (x10.
                lang.
                LongReferenceArray)
                ((/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.checkSumArray));
            
//#line 2262
final x10.
              lang.
              LongReferenceArray X10_TEMP171 =
              (x10.
                lang.
                LongReferenceArray)
                ((X10_TEMP618));
            
//#line 2263
final long X10_TEMP621 =
              (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.checksum);
            
//#line 2265
final long X10_TEMP174 =
              (X10_TEMP621);
            
//#line 2266
final long X10_TEMP625 =
              (/* template:array_get { */((X10_TEMP171).get(i))/* } */);
            
//#line 2268
final long X10_TEMP175 =
              (X10_TEMP625);
            
//#line 2269
final long X10_TEMP628 =
              (X10_TEMP174 +
                 X10_TEMP175);
            
//#line 2271
final long X10_TEMP176 =
              (X10_TEMP628);
            
//#line 2272
final long X10_TEMP631 =
              (X10_TEMP176);
            
//#line 2274
final long X10_TEMP634 =
              (X10_TEMP631);
            
//#line 2275
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.checksum =
              ((X10_TEMP634));
        }/* } */
        }
        /* } */
        
    }
    
    
//#line 2278
public static boolean
                    Program_RayTracer_intersect(
                    final RayTracer X10_TEMP0,
                    final Ray r,
                    final double maxt,
                    final Isect inter) {
        
//#line 2279
final int X10_TEMP210 =
          (0);
        
//#line 2281
int nhits =
          (X10_TEMP210);
        
//#line 2282
final double X10_TEMP213 =
          (1.0E9);
        
//#line 2284
final double X10_TEMP4 =
          (X10_TEMP213);
        
//#line 2285
final double X10_TEMP216 =
          (X10_TEMP4);
        
//#line 2287
final double X10_TEMP5 =
          (X10_TEMP216);
        
//#line 2288
final double X10_TEMP219 =
          (X10_TEMP5);
        
//#line 2290
final double X10_TEMP222 =
          (X10_TEMP219);
        
//#line 2291
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.t =
          ((X10_TEMP222));
        
//#line 2292
final x10.
          lang.
          place X10_TEMP224 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 2294
final x10.
          lang.
          place h =
          (X10_TEMP224);
        
//#line 2295
final int X10_TEMP227 =
          (0);
        
//#line 2297
final int X10_TEMP9 =
          (X10_TEMP227);
        
//#line 2298
final int X10_TEMP230 =
          (0);
        
//#line 2300
final int X10_TEMP10 =
          (X10_TEMP230);
        
//#line 2301
final x10.
          lang.
          region X10_TEMP235 =
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
        
//#line 2303
final x10.
          lang.
          region X10_TEMP11 =
          (x10.
            lang.
            region)
            ((X10_TEMP235));
        
//#line 2304
final x10.
          lang.
          place X10_TEMP238 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 2306
final x10.
          lang.
          place X10_TEMP12 =
          (X10_TEMP238);
        
//#line 2307
final x10.
          lang.
          dist X10_TEMP241 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                X10_TEMP11,
                X10_TEMP12)));
        
//#line 2309
final x10.
          lang.
          dist dTemp =
          (x10.
            lang.
            dist)
            ((X10_TEMP241));
        
//#line 2310
final x10.
          lang.
          GenericReferenceArray X10_TEMP244 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dTemp,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
        
//#line 2312
final x10.
          lang.
          GenericReferenceArray temp =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP244));
        
//#line 2313
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2314
final x10.
              lang.
              place X10_TEMP16 =
              (x10.
                 lang.
                 place.
                 FIRST_PLACE);
            
//#line 2315
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP16)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 2316
final int X10_TEMP249 =
                  (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.objCount);
                
//#line 2318
final int tempobjCount =
                  (X10_TEMP249);
                
//#line 2319
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP252 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.prim));
                
//#line 2321
final x10.
                  lang.
                  GenericReferenceArray tempprim =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP252));
                
//#line 2322
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 2323
final int X10_TEMP256 =
                      (0);
                    
//#line 2325
final int X10_TEMP21 =
                      (X10_TEMP256);
                    
//#line 2326
final Envelope X10_TEMP261 =
                      (new Envelope(
                         tempobjCount,
                         tempprim));
                    
//#line 2328
final Envelope X10_TEMP26 =
                      (X10_TEMP261);
                    
//#line 2329
final Envelope X10_TEMP264 =
                      (X10_TEMP26);
                    
//#line 2331
final Envelope X10_TEMP27 =
                      (X10_TEMP264);
                    
//#line 2332
final Envelope X10_TEMP268 =
                      (X10_TEMP27);
                    
//#line 2334
final Envelope X10_TEMP271 =
                      (X10_TEMP268);
                    
//#line 2335
/* template:array_set { */(temp).set((X10_TEMP271),X10_TEMP21)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp19) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp19);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2339
final int X10_TEMP273 =
          (0);
        
//#line 2341
final int X10_TEMP29 =
          (X10_TEMP273);
        
//#line 2342
final Envelope X10_TEMP277 =
          (/* template:parametric { */((Envelope)(/* template:array_get { */((temp).get(X10_TEMP29))/* } */))/* } */);
        
//#line 2344
final Envelope X10_TEMP30 =
          (X10_TEMP277);
        
//#line 2345
final int X10_TEMP280 =
          (X10_TEMP30.
             i);
        
//#line 2347
final int myobjCount =
          (X10_TEMP280);
        
//#line 2348
final int X10_TEMP283 =
          (0);
        
//#line 2350
final int X10_TEMP33 =
          (X10_TEMP283);
        
//#line 2351
final Envelope X10_TEMP287 =
          (/* template:parametric { */((Envelope)(/* template:array_get { */((temp).get(X10_TEMP33))/* } */))/* } */);
        
//#line 2353
final Envelope X10_TEMP34 =
          (X10_TEMP287);
        
//#line 2354
final x10.
          lang.
          GenericReferenceArray X10_TEMP290 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP34.
                a));
        
//#line 2356
final x10.
          lang.
          GenericReferenceArray X10_TEMP36 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP290));
        
//#line 2357
final x10.
          lang.
          GenericReferenceArray X10_TEMP293 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP36));
        
//#line 2359
final x10.
          lang.
          GenericReferenceArray myprim =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP293));
        
//#line 2360
final int X10_TEMP296 =
          (0);
        
//#line 2362
final int X10_TEMP41 =
          (X10_TEMP296);
        
//#line 2363
final int X10_TEMP299 =
          (1);
        
//#line 2365
final int X10_TEMP39 =
          (X10_TEMP299);
        
//#line 2366
final int X10_TEMP302 =
          (myobjCount -
             X10_TEMP39);
        
//#line 2368
final int X10_TEMP42 =
          (X10_TEMP302);
        
//#line 2369
final x10.
          lang.
          region X10_TEMP307 =
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
                  X10_TEMP41,
                  X10_TEMP42))));
        
//#line 2371
final x10.
          lang.
          region X10_TEMP44 =
          (x10.
            lang.
            region)
            ((X10_TEMP307));
        
//#line 2372
/* template:forloop { */
        for (java.util.Iterator i__ = (X10_TEMP44).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 2373
final Sphere X10_TEMP312 =
              (/* template:parametric { */((Sphere)(/* template:array_get { */((myprim).get(i))/* } */))/* } */);
            
//#line 2375
final Sphere X10_TEMP46 =
              (X10_TEMP312);
            
//#line 2376
final Isect X10_TEMP317 =
              (Program0.
                 Program_Sphere_intersect(
                 X10_TEMP46,
                 r));
            
//#line 2378
Isect tp =
              (X10_TEMP317);
            
//#line 2379
final boolean X10_TEMP320 =
              (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.isNull);
            
//#line 2381
final boolean X10_TEMP49 =
              (X10_TEMP320);
            
//#line 2382
final boolean X10_TEMP323 =
              (!X10_TEMP49);
            
//#line 2384
final boolean X10_TEMP52 =
              (X10_TEMP323);
            
//#line 2385
final double X10_TEMP326 =
              (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.t);
            
//#line 2387
final double X10_TEMP50 =
              (X10_TEMP326);
            
//#line 2388
final double X10_TEMP329 =
              (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.t);
            
//#line 2390
final double X10_TEMP51 =
              (X10_TEMP329);
            
//#line 2391
final boolean X10_TEMP332 =
              (X10_TEMP50 <
                 X10_TEMP51);
            
//#line 2393
final boolean X10_TEMP53 =
              (X10_TEMP332);
            
//#line 2394
final boolean X10_TEMP55 =
              (X10_TEMP52 &&
                 X10_TEMP53);
            
//#line 2395
if (X10_TEMP55) {
                
//#line 2396
final double X10_TEMP337 =
                  (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.t);
                
//#line 2398
final double X10_TEMP58 =
                  (X10_TEMP337);
                
//#line 2399
final double X10_TEMP340 =
                  (X10_TEMP58);
                
//#line 2401
final double X10_TEMP59 =
                  (X10_TEMP340);
                
//#line 2402
final double X10_TEMP343 =
                  (X10_TEMP59);
                
//#line 2404
final double X10_TEMP346 =
                  (X10_TEMP343);
                
//#line 2405
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.t =
                  ((X10_TEMP346));
                
//#line 2406
final Sphere X10_TEMP348 =
                  (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.prim);
                
//#line 2408
final Sphere X10_TEMP62 =
                  (X10_TEMP348);
                
//#line 2409
final Sphere X10_TEMP351 =
                  (X10_TEMP62);
                
//#line 2411
final Sphere X10_TEMP63 =
                  (X10_TEMP351);
                
//#line 2412
final Sphere X10_TEMP354 =
                  (X10_TEMP63);
                
//#line 2414
final Sphere X10_TEMP357 =
                  (X10_TEMP354);
                
//#line 2415
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.prim =
                  ((X10_TEMP357));
                
//#line 2416
final Surface X10_TEMP359 =
                  (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.surf);
                
//#line 2418
final Surface X10_TEMP66 =
                  (X10_TEMP359);
                
//#line 2419
final Surface X10_TEMP362 =
                  (X10_TEMP66);
                
//#line 2421
final Surface X10_TEMP67 =
                  (X10_TEMP362);
                
//#line 2422
final Surface X10_TEMP365 =
                  (X10_TEMP67);
                
//#line 2424
final Surface X10_TEMP368 =
                  (X10_TEMP365);
                
//#line 2425
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.surf =
                  ((X10_TEMP368));
                
//#line 2426
final int X10_TEMP370 =
                  (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.enter);
                
//#line 2428
final int X10_TEMP70 =
                  (X10_TEMP370);
                
//#line 2429
final int X10_TEMP373 =
                  (X10_TEMP70);
                
//#line 2431
final int X10_TEMP71 =
                  (X10_TEMP373);
                
//#line 2432
final int X10_TEMP376 =
                  (X10_TEMP71);
                
//#line 2434
final int X10_TEMP379 =
                  (X10_TEMP376);
                
//#line 2435
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.enter =
                  ((X10_TEMP379));
                
//#line 2436
final int X10_TEMP381 =
                  (nhits);
                
//#line 2438
final int X10_TEMP72 =
                  (X10_TEMP381);
                
//#line 2439
final int X10_TEMP73 =
                  (1);
                
//#line 2440
final int X10_TEMP385 =
                  (nhits +
                     X10_TEMP73);
                
//#line 2441
nhits =
                  ((X10_TEMP385));
            }
        }/* } */
        }
        /* } */
        
        
//#line 2444
final int X10_TEMP387 =
          (0);
        
//#line 2446
final int X10_TEMP74 =
          (X10_TEMP387);
        
//#line 2447
final boolean X10_TEMP75 =
          (nhits >
             X10_TEMP74);
        
//#line 2448
boolean X10_TEMP78 =
          (false);
        
//#line 2449
if (X10_TEMP75) {
            
//#line 2450
final boolean X10_TEMP393 =
              (true);
            
//#line 2451
X10_TEMP78 =
              ((X10_TEMP393));
        }
        
//#line 2453
final boolean X10_TEMP79 =
          (X10_TEMP78);
        
//#line 2454
return X10_TEMP79;
    }
    
    
//#line 2456
public static int
                    Program_RayTracer_Shadow(
                    final RayTracer X10_TEMP0,
                    final Ray r,
                    final double tmax,
                    final Isect inter) {
        
//#line 2457
final boolean X10_TEMP5 =
          (Program0.
             Program_RayTracer_intersect(
             X10_TEMP0,
             r,
             tmax,
             inter));
        
//#line 2458
if (X10_TEMP5) {
            
//#line 2459
final int X10_TEMP216 =
              (0);
            
//#line 2461
final int X10_TEMP7 =
              (X10_TEMP216);
            
//#line 2462
return X10_TEMP7;
        }
        
//#line 2464
final int X10_TEMP220 =
          (1);
        
//#line 2466
final int X10_TEMP9 =
          (X10_TEMP220);
        
//#line 2467
return X10_TEMP9;
    }
    
    
//#line 2469
public static Vec
                    Program_RayTracer_SpecularDirection(
                    final RayTracer X10_TEMP0,
                    final Vec I,
                    final Vec N) {
        
//#line 2470
final double X10_TEMP210 =
          (1.0);
        
//#line 2472
final double X10_TEMP5 =
          (X10_TEMP210);
        
//#line 2473
final double X10_TEMP215 =
          (Program0.
             Program_Vec_dot(
             I,
             N));
        
//#line 2475
final double X10_TEMP4 =
          (X10_TEMP215);
        
//#line 2476
final double X10_TEMP219 =
          (java.
             lang.
             Math.
             abs(
             X10_TEMP4));
        
//#line 2478
final double X10_TEMP6 =
          (X10_TEMP219);
        
//#line 2479
final double X10_TEMP222 =
          (X10_TEMP5 /
             X10_TEMP6);
        
//#line 2481
final double X10_TEMP11 =
          (X10_TEMP222);
        
//#line 2482
final double X10_TEMP225 =
          (2.0);
        
//#line 2484
final double X10_TEMP12 =
          (X10_TEMP225);
        
//#line 2485
final Vec X10_TEMP232 =
          (Program0.
             Program_Vec_comb(
             X10_TEMP11,
             I,
             X10_TEMP12,
             N));
        
//#line 2487
final Vec X10_TEMP13 =
          (X10_TEMP232);
        
//#line 2488
final Vec X10_TEMP236 =
          (Program0.
             Program_Vec_normalized(
             X10_TEMP13));
        
//#line 2490
final Vec X10_TEMP15 =
          (X10_TEMP236);
        
//#line 2491
return X10_TEMP15;
    }
    
    
//#line 2493
public static Vec
                    Program_RayTracer_TransDir(
                    final RayTracer X10_TEMP0,
                    final Surface m1,
                    final Surface m2,
                    final Vec I,
                    final Vec N) {
        
//#line 2494
final boolean X10_TEMP1 =
          (m1.
             isNull);
        
//#line 2495
double X10_TEMP4 =
          (m1.
             ior);
        
//#line 2496
if (X10_TEMP1) {
            
//#line 2497
final double X10_TEMP213 =
              (1.0);
            
//#line 2498
X10_TEMP4 =
              ((X10_TEMP213));
        }
        
//#line 2500
final double X10_TEMP5 =
          (X10_TEMP4);
        
//#line 2501
final double X10_TEMP216 =
          (X10_TEMP5);
        
//#line 2503
double n1 =
          (X10_TEMP216);
        
//#line 2504
final boolean X10_TEMP6 =
          (m2.
             isNull);
        
//#line 2505
double X10_TEMP9 =
          (m2.
             ior);
        
//#line 2506
if (X10_TEMP6) {
            
//#line 2507
final double X10_TEMP222 =
              (1.0);
            
//#line 2508
X10_TEMP9 =
              ((X10_TEMP222));
        }
        
//#line 2510
final double X10_TEMP10 =
          (X10_TEMP9);
        
//#line 2511
final double X10_TEMP225 =
          (X10_TEMP10);
        
//#line 2513
double n2 =
          (X10_TEMP225);
        
//#line 2514
final double X10_TEMP228 =
          (n1 /
             n2);
        
//#line 2516
double eta =
          (X10_TEMP228);
        
//#line 2517
final double X10_TEMP233 =
          (Program0.
             Program_Vec_dot(
             I,
             N));
        
//#line 2519
final double X10_TEMP14 =
          (X10_TEMP233);
        
//#line 2520
final int X10_TEMP15 =
          (0);
        
//#line 2521
final double X10_TEMP237 =
          (X10_TEMP15 -
             X10_TEMP14);
        
//#line 2523
double c1 =
          (X10_TEMP237);
        
//#line 2524
final double X10_TEMP240 =
          (1.0);
        
//#line 2526
final double X10_TEMP22 =
          (X10_TEMP240);
        
//#line 2527
final double X10_TEMP243 =
          (eta *
             eta);
        
//#line 2529
final double X10_TEMP21 =
          (X10_TEMP243);
        
//#line 2530
final double X10_TEMP246 =
          (1.0);
        
//#line 2532
final double X10_TEMP17 =
          (X10_TEMP246);
        
//#line 2533
final double X10_TEMP249 =
          (c1 *
             c1);
        
//#line 2535
final double X10_TEMP18 =
          (X10_TEMP249);
        
//#line 2536
final double X10_TEMP252 =
          (X10_TEMP17 -
             X10_TEMP18);
        
//#line 2538
final double X10_TEMP20 =
          (X10_TEMP252);
        
//#line 2539
final double X10_TEMP255 =
          (X10_TEMP21 *
             X10_TEMP20);
        
//#line 2541
final double X10_TEMP23 =
          (X10_TEMP255);
        
//#line 2542
final double X10_TEMP258 =
          (X10_TEMP22 -
             X10_TEMP23);
        
//#line 2544
double cs2 =
          (X10_TEMP258);
        
//#line 2545
final double X10_TEMP261 =
          (0.0);
        
//#line 2547
final double X10_TEMP25 =
          (X10_TEMP261);
        
//#line 2548
final boolean X10_TEMP27 =
          (cs2 <
             X10_TEMP25);
        
//#line 2549
if (X10_TEMP27) {
            
//#line 2550
final double X10_TEMP266 =
              (0.0);
            
//#line 2552
double X10_TEMP32 =
              (X10_TEMP266);
            
//#line 2553
final double X10_TEMP269 =
              (0.0);
            
//#line 2555
double X10_TEMP33 =
              (X10_TEMP269);
            
//#line 2556
final double X10_TEMP272 =
              (0.0);
            
//#line 2558
double X10_TEMP34 =
              (X10_TEMP272);
            
//#line 2559
final boolean X10_TEMP275 =
              (true);
            
//#line 2561
boolean X10_TEMP35 =
              (X10_TEMP275);
            
//#line 2562
final Vec X10_TEMP282 =
              (new Vec(
                 X10_TEMP32,
                 X10_TEMP33,
                 X10_TEMP34,
                 X10_TEMP35));
            
//#line 2564
final Vec X10_TEMP37 =
              (X10_TEMP282);
            
//#line 2565
return X10_TEMP37;
        }
        
//#line 2567
final double X10_TEMP286 =
          (eta *
             c1);
        
//#line 2569
final double X10_TEMP41 =
          (X10_TEMP286);
        
//#line 2570
final double X10_TEMP290 =
          (java.
             lang.
             Math.
             sqrt(
             cs2));
        
//#line 2572
final double X10_TEMP42 =
          (X10_TEMP290);
        
//#line 2573
final double X10_TEMP293 =
          (X10_TEMP41 -
             X10_TEMP42);
        
//#line 2575
final double X10_TEMP45 =
          (X10_TEMP293);
        
//#line 2576
final Vec X10_TEMP300 =
          (Program0.
             Program_Vec_comb(
             eta,
             I,
             X10_TEMP45,
             N));
        
//#line 2578
final Vec X10_TEMP46 =
          (X10_TEMP300);
        
//#line 2579
final Vec X10_TEMP304 =
          (Program0.
             Program_Vec_normalized(
             X10_TEMP46));
        
//#line 2581
final Vec X10_TEMP48 =
          (X10_TEMP304);
        
//#line 2582
return X10_TEMP48;
    }
    
    
//#line 2584
public static Vec
                    Program_RayTracer_shade(
                    final RayTracer X10_TEMP0,
                    final int level,
                    final double weight,
                    final Vec P,
                    final Vec N,
                    final Vec I,
                    final Isect hit,
                    final Ray tRay) {
        
//#line 2585
final Surface X10_TEMP210 =
          (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(hit))/* } */.surf);
        
//#line 2587
Surface surf =
          (X10_TEMP210);
        
//#line 2588
final Vec X10_TEMP213 =
          (new Vec(
             ));
        
//#line 2590
Vec bigr =
          (X10_TEMP213);
        
//#line 2591
final double X10_TEMP216 =
          (surf.
             shine);
        
//#line 2593
final double X10_TEMP3 =
          (X10_TEMP216);
        
//#line 2594
final double X10_TEMP219 =
          (1.0E-6);
        
//#line 2596
final double X10_TEMP4 =
          (X10_TEMP219);
        
//#line 2597
final boolean X10_TEMP6 =
          (X10_TEMP3 >
             X10_TEMP4);
        
//#line 2598
if (X10_TEMP6) {
            
//#line 2599
final Vec X10_TEMP227 =
              (Program0.
                 Program_RayTracer_SpecularDirection(
                 X10_TEMP0,
                 I,
                 N));
            
//#line 2601
final Vec X10_TEMP10 =
              (X10_TEMP227);
            
//#line 2602
final Vec X10_TEMP230 =
              (X10_TEMP10);
            
//#line 2604
bigr =
              ((X10_TEMP230));
        }
        
//#line 2606
final x10.
          lang.
          place X10_TEMP233 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 2608
final x10.
          lang.
          place h =
          (X10_TEMP233);
        
//#line 2609
final int X10_TEMP236 =
          (0);
        
//#line 2611
final int X10_TEMP14 =
          (X10_TEMP236);
        
//#line 2612
final int X10_TEMP239 =
          (0);
        
//#line 2614
final int X10_TEMP15 =
          (X10_TEMP239);
        
//#line 2615
final x10.
          lang.
          region X10_TEMP244 =
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
                  X10_TEMP14,
                  X10_TEMP15))));
        
//#line 2617
final x10.
          lang.
          region X10_TEMP16 =
          (x10.
            lang.
            region)
            ((X10_TEMP244));
        
//#line 2618
final x10.
          lang.
          place X10_TEMP247 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 2620
final x10.
          lang.
          place X10_TEMP17 =
          (X10_TEMP247);
        
//#line 2621
final x10.
          lang.
          dist X10_TEMP250 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                X10_TEMP16,
                X10_TEMP17)));
        
//#line 2623
final x10.
          lang.
          dist dTemp =
          (x10.
            lang.
            dist)
            ((X10_TEMP250));
        
//#line 2624
final x10.
          lang.
          GenericReferenceArray X10_TEMP253 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dTemp,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
        
//#line 2626
final x10.
          lang.
          GenericReferenceArray temp =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP253));
        
//#line 2627
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2628
final x10.
              lang.
              place X10_TEMP21 =
              (x10.
                 lang.
                 place.
                 FIRST_PLACE);
            
//#line 2629
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP21)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 2630
final int X10_TEMP258 =
                  (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lightCount);
                
//#line 2632
final int templightCount =
                  (X10_TEMP258);
                
//#line 2633
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP261 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lights));
                
//#line 2635
final x10.
                  lang.
                  GenericReferenceArray templights =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP261));
                
//#line 2636
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 2637
final int X10_TEMP265 =
                      (0);
                    
//#line 2639
final int X10_TEMP26 =
                      (X10_TEMP265);
                    
//#line 2640
final Envelope2 X10_TEMP270 =
                      (new Envelope2(
                         templightCount,
                         templights));
                    
//#line 2642
final Envelope2 X10_TEMP31 =
                      (X10_TEMP270);
                    
//#line 2643
final Envelope2 X10_TEMP273 =
                      (X10_TEMP31);
                    
//#line 2645
final Envelope2 X10_TEMP32 =
                      (X10_TEMP273);
                    
//#line 2646
final Envelope2 X10_TEMP277 =
                      (X10_TEMP32);
                    
//#line 2648
final Envelope2 X10_TEMP280 =
                      (X10_TEMP277);
                    
//#line 2649
/* template:array_set { */(temp).set((X10_TEMP280),X10_TEMP26)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp20) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp20);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2653
final int X10_TEMP282 =
          (0);
        
//#line 2655
final int X10_TEMP34 =
          (X10_TEMP282);
        
//#line 2656
final Envelope2 X10_TEMP286 =
          (/* template:parametric { */((Envelope2)(/* template:array_get { */((temp).get(X10_TEMP34))/* } */))/* } */);
        
//#line 2658
final Envelope2 X10_TEMP35 =
          (X10_TEMP286);
        
//#line 2659
final int X10_TEMP289 =
          (X10_TEMP35.
             i);
        
//#line 2661
final int mylightCount =
          (X10_TEMP289);
        
//#line 2662
final int X10_TEMP292 =
          (0);
        
//#line 2664
final int X10_TEMP38 =
          (X10_TEMP292);
        
//#line 2665
final Envelope2 X10_TEMP296 =
          (/* template:parametric { */((Envelope2)(/* template:array_get { */((temp).get(X10_TEMP38))/* } */))/* } */);
        
//#line 2667
final Envelope2 X10_TEMP39 =
          (X10_TEMP296);
        
//#line 2668
final x10.
          lang.
          GenericReferenceArray X10_TEMP299 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP39.
                a));
        
//#line 2670
final x10.
          lang.
          GenericReferenceArray X10_TEMP41 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP299));
        
//#line 2671
final x10.
          lang.
          GenericReferenceArray X10_TEMP302 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP41));
        
//#line 2673
final x10.
          lang.
          GenericReferenceArray mylights =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP302));
        
//#line 2674
final Vec X10_TEMP305 =
          (new Vec(
             ));
        
//#line 2676
Vec col =
          (X10_TEMP305);
        
//#line 2677
final int X10_TEMP308 =
          (0);
        
//#line 2679
final int X10_TEMP47 =
          (X10_TEMP308);
        
//#line 2680
final int X10_TEMP311 =
          (1);
        
//#line 2682
final int X10_TEMP45 =
          (X10_TEMP311);
        
//#line 2683
final int X10_TEMP314 =
          (mylightCount -
             X10_TEMP45);
        
//#line 2685
final int X10_TEMP48 =
          (X10_TEMP314);
        
//#line 2686
final x10.
          lang.
          region X10_TEMP319 =
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
                  X10_TEMP47,
                  X10_TEMP48))));
        
//#line 2688
final x10.
          lang.
          region X10_TEMP50 =
          (x10.
            lang.
            region)
            ((X10_TEMP319));
        
//#line 2689
/* template:forloop { */
        for (java.util.Iterator l__ = (X10_TEMP50).iterator(); l__.hasNext(); ) {
        	final  x10.
          lang.
          point l = (x10.
          lang.
          point) l__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 2690
final Light X10_TEMP324 =
              (/* template:parametric { */((Light)(/* template:array_get { */((mylights).get(l))/* } */))/* } */);
            
//#line 2692
final Light X10_TEMP52 =
              (X10_TEMP324);
            
//#line 2693
final Vec X10_TEMP327 =
              (X10_TEMP52.
                 pos);
            
//#line 2695
final Vec X10_TEMP55 =
              (X10_TEMP327);
            
//#line 2696
final Vec X10_TEMP332 =
              (Program0.
                 Program_Vec_sub(
                 X10_TEMP55,
                 P));
            
//#line 2698
Vec L =
              (X10_TEMP332);
            
//#line 2699
final double X10_TEMP337 =
              (Program0.
                 Program_Vec_dot(
                 N,
                 L));
            
//#line 2701
final double X10_TEMP59 =
              (X10_TEMP337);
            
//#line 2702
final double X10_TEMP340 =
              (0.0);
            
//#line 2704
final double X10_TEMP60 =
              (X10_TEMP340);
            
//#line 2705
final boolean X10_TEMP62 =
              (X10_TEMP59 >=
                 X10_TEMP60);
            
//#line 2706
if (X10_TEMP62) {
                
//#line 2707
final Vec X10_TEMP346 =
                  (Program0.
                     Program_Vec_normalized(
                     L));
                
//#line 2709
final Vec X10_TEMP64 =
                  (X10_TEMP346);
                
//#line 2710
final Vec X10_TEMP349 =
                  (X10_TEMP64);
                
//#line 2712
L =
                  ((X10_TEMP349));
                
//#line 2713
final double X10_TEMP353 =
                  (Program0.
                     Program_Vec_length(
                     L));
                
//#line 2715
double t =
                  (X10_TEMP353);
                
//#line 2716
final Vec X10_TEMP356 =
                  (P);
                
//#line 2718
final Vec X10_TEMP68 =
                  (X10_TEMP356);
                
//#line 2719
final Vec X10_TEMP359 =
                  (X10_TEMP68);
                
//#line 2721
final Vec X10_TEMP362 =
                  (X10_TEMP359);
                
//#line 2722
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.p =
                  ((X10_TEMP362));
                
//#line 2723
final Vec X10_TEMP364 =
                  (L);
                
//#line 2725
final Vec X10_TEMP71 =
                  (X10_TEMP364);
                
//#line 2726
final Vec X10_TEMP367 =
                  (X10_TEMP71);
                
//#line 2728
final Vec X10_TEMP370 =
                  (X10_TEMP367);
                
//#line 2729
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.d =
                  ((X10_TEMP370));
                
//#line 2730
final int X10_TEMP376 =
                  (Program0.
                     Program_RayTracer_Shadow(
                     X10_TEMP0,
                     tRay,
                     t,
                     hit));
                
//#line 2732
final int X10_TEMP75 =
                  (X10_TEMP376);
                
//#line 2733
final int X10_TEMP379 =
                  (0);
                
//#line 2735
final int X10_TEMP76 =
                  (X10_TEMP379);
                
//#line 2736
final boolean X10_TEMP78 =
                  (X10_TEMP75 >
                     X10_TEMP76);
                
//#line 2737
if (X10_TEMP78) {
                    
//#line 2738
final double X10_TEMP386 =
                      (Program0.
                         Program_Vec_dot(
                         N,
                         L));
                    
//#line 2740
final double X10_TEMP81 =
                      (X10_TEMP386);
                    
//#line 2741
final double X10_TEMP389 =
                      (surf.
                         kd);
                    
//#line 2743
final double X10_TEMP82 =
                      (X10_TEMP389);
                    
//#line 2744
final double X10_TEMP392 =
                      (X10_TEMP81 *
                         X10_TEMP82);
                    
//#line 2746
final double X10_TEMP85 =
                      (X10_TEMP392);
                    
//#line 2747
final Light X10_TEMP396 =
                      (/* template:parametric { */((Light)(/* template:array_get { */((mylights).get(l))/* } */))/* } */);
                    
//#line 2749
final Light X10_TEMP84 =
                      (X10_TEMP396);
                    
//#line 2750
final double X10_TEMP399 =
                      (X10_TEMP84.
                         brightness);
                    
//#line 2752
final double X10_TEMP86 =
                      (X10_TEMP399);
                    
//#line 2753
final double X10_TEMP402 =
                      (X10_TEMP85 *
                         X10_TEMP86);
                    
//#line 2755
double diff =
                      (X10_TEMP402);
                    
//#line 2756
final Vec X10_TEMP405 =
                      (surf.
                         color);
                    
//#line 2758
final Vec X10_TEMP90 =
                      (X10_TEMP405);
                    
//#line 2759
final Vec X10_TEMP411 =
                      (Program0.
                         Program_Vec_adds2(
                         col,
                         diff,
                         X10_TEMP90));
                    
//#line 2761
final Vec X10_TEMP92 =
                      (X10_TEMP411);
                    
//#line 2762
final Vec X10_TEMP414 =
                      (X10_TEMP92);
                    
//#line 2764
col =
                      ((X10_TEMP414));
                    
//#line 2765
final double X10_TEMP417 =
                      (surf.
                         shine);
                    
//#line 2767
final double X10_TEMP93 =
                      (X10_TEMP417);
                    
//#line 2768
final double X10_TEMP420 =
                      (1.0E-6);
                    
//#line 2770
final double X10_TEMP94 =
                      (X10_TEMP420);
                    
//#line 2771
final boolean X10_TEMP96 =
                      (X10_TEMP93 >
                         X10_TEMP94);
                    
//#line 2772
if (X10_TEMP96) {
                        
//#line 2773
final double X10_TEMP427 =
                          (Program0.
                             Program_Vec_dot(
                             bigr,
                             L));
                        
//#line 2775
double spec =
                          (X10_TEMP427);
                        
//#line 2776
final double X10_TEMP430 =
                          (1.0E-6);
                        
//#line 2778
final double X10_TEMP100 =
                          (X10_TEMP430);
                        
//#line 2779
final boolean X10_TEMP102 =
                          (spec >
                             X10_TEMP100);
                        
//#line 2780
if (X10_TEMP102) {
                            
//#line 2781
final double X10_TEMP435 =
                              (surf.
                                 shine);
                            
//#line 2783
final double X10_TEMP105 =
                              (X10_TEMP435);
                            
//#line 2784
final double X10_TEMP440 =
                              (java.
                                 lang.
                                 Math.
                                 pow(
                                 spec,
                                 X10_TEMP105));
                            
//#line 2786
final double X10_TEMP107 =
                              (X10_TEMP440);
                            
//#line 2787
final double X10_TEMP443 =
                              (X10_TEMP107);
                            
//#line 2789
spec =
                              ((X10_TEMP443));
                            
//#line 2790
final boolean X10_TEMP446 =
                              (false);
                            
//#line 2792
boolean X10_TEMP112 =
                              (X10_TEMP446);
                            
//#line 2793
final Vec X10_TEMP453 =
                              (new Vec(
                                 spec,
                                 spec,
                                 spec,
                                 X10_TEMP112));
                            
//#line 2795
final Vec X10_TEMP114 =
                              (X10_TEMP453);
                            
//#line 2796
final Vec X10_TEMP458 =
                              (Program0.
                                 Program_Vec_added(
                                 col,
                                 X10_TEMP114));
                            
//#line 2798
final Vec X10_TEMP116 =
                              (X10_TEMP458);
                            
//#line 2799
final Vec X10_TEMP461 =
                              (X10_TEMP116);
                            
//#line 2801
col =
                              ((X10_TEMP461));
                        }
                    }
                }
            }
        }/* } */
        }
        /* } */
        
        
//#line 2807
final Vec X10_TEMP464 =
          (P);
        
//#line 2809
final Vec X10_TEMP119 =
          (X10_TEMP464);
        
//#line 2810
final Vec X10_TEMP467 =
          (X10_TEMP119);
        
//#line 2812
final Vec X10_TEMP470 =
          (X10_TEMP467);
        
//#line 2813
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.p =
          ((X10_TEMP470));
        
//#line 2814
final double X10_TEMP472 =
          (surf.
             ks);
        
//#line 2816
final double X10_TEMP120 =
          (X10_TEMP472);
        
//#line 2817
final double X10_TEMP475 =
          (X10_TEMP120 *
             weight);
        
//#line 2819
final double X10_TEMP121 =
          (X10_TEMP475);
        
//#line 2820
final double X10_TEMP478 =
          (0.0010);
        
//#line 2822
final double X10_TEMP122 =
          (X10_TEMP478);
        
//#line 2823
final boolean X10_TEMP124 =
          (X10_TEMP121 >
             X10_TEMP122);
        
//#line 2824
if (X10_TEMP124) {
            
//#line 2825
final Vec X10_TEMP486 =
              (Program0.
                 Program_RayTracer_SpecularDirection(
                 X10_TEMP0,
                 I,
                 N));
            
//#line 2827
final Vec X10_TEMP129 =
              (X10_TEMP486);
            
//#line 2828
final Vec X10_TEMP489 =
              (X10_TEMP129);
            
//#line 2830
final Vec X10_TEMP130 =
              (X10_TEMP489);
            
//#line 2831
final Vec X10_TEMP492 =
              (X10_TEMP130);
            
//#line 2833
final Vec X10_TEMP495 =
              (X10_TEMP492);
            
//#line 2834
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.d =
              ((X10_TEMP495));
            
//#line 2835
final int X10_TEMP497 =
              (1);
            
//#line 2837
final int X10_TEMP131 =
              (X10_TEMP497);
            
//#line 2838
final int X10_TEMP500 =
              (level +
                 X10_TEMP131);
            
//#line 2840
final int X10_TEMP138 =
              (X10_TEMP500);
            
//#line 2841
final double X10_TEMP503 =
              (surf.
                 ks);
            
//#line 2843
final double X10_TEMP133 =
              (X10_TEMP503);
            
//#line 2844
final double X10_TEMP506 =
              (X10_TEMP133 *
                 weight);
            
//#line 2846
final double X10_TEMP139 =
              (X10_TEMP506);
            
//#line 2847
final Vec X10_TEMP515 =
              (Program0.
                 Program_RayTracer_trace(
                 X10_TEMP0,
                 X10_TEMP138,
                 X10_TEMP139,
                 tRay,
                 hit,
                 tRay));
            
//#line 2849
Vec tcol =
              (X10_TEMP515);
            
//#line 2850
final double X10_TEMP518 =
              (surf.
                 ks);
            
//#line 2852
final double X10_TEMP143 =
              (X10_TEMP518);
            
//#line 2853
final Vec X10_TEMP524 =
              (Program0.
                 Program_Vec_adds2(
                 col,
                 X10_TEMP143,
                 tcol));
            
//#line 2855
final Vec X10_TEMP145 =
              (X10_TEMP524);
            
//#line 2856
final Vec X10_TEMP527 =
              (X10_TEMP145);
            
//#line 2858
col =
              ((X10_TEMP527));
        }
        
//#line 2860
final double X10_TEMP530 =
          (surf.
             kt);
        
//#line 2862
final double X10_TEMP146 =
          (X10_TEMP530);
        
//#line 2863
final double X10_TEMP533 =
          (X10_TEMP146 *
             weight);
        
//#line 2865
final double X10_TEMP147 =
          (X10_TEMP533);
        
//#line 2866
final double X10_TEMP536 =
          (0.0010);
        
//#line 2868
final double X10_TEMP148 =
          (X10_TEMP536);
        
//#line 2869
final boolean X10_TEMP150 =
          (X10_TEMP147 >
             X10_TEMP148);
        
//#line 2870
if (X10_TEMP150) {
            
//#line 2871
final int X10_TEMP541 =
              (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(hit))/* } */.enter);
            
//#line 2873
final int X10_TEMP151 =
              (X10_TEMP541);
            
//#line 2874
final int X10_TEMP544 =
              (0);
            
//#line 2876
final int X10_TEMP152 =
              (X10_TEMP544);
            
//#line 2877
final boolean X10_TEMP154 =
              (X10_TEMP151 >
                 X10_TEMP152);
            
//#line 2878
if (X10_TEMP154) {
                
//#line 2879
final int X10_TEMP549 =
                  (0);
                
//#line 2881
int X10_TEMP160 =
                  (X10_TEMP549);
                
//#line 2882
final int X10_TEMP552 =
                  (0);
                
//#line 2884
int X10_TEMP161 =
                  (X10_TEMP552);
                
//#line 2885
final int X10_TEMP555 =
                  (0);
                
//#line 2887
int X10_TEMP162 =
                  (X10_TEMP555);
                
//#line 2888
final Vec X10_TEMP558 =
                  (new Vec(
                     ));
                
//#line 2890
Vec X10_TEMP163 =
                  (X10_TEMP558);
                
//#line 2891
final boolean X10_TEMP561 =
                  (true);
                
//#line 2893
boolean X10_TEMP164 =
                  (X10_TEMP561);
                
//#line 2894
final Surface X10_TEMP569 =
                  (new Surface(
                     X10_TEMP160,
                     X10_TEMP161,
                     X10_TEMP162,
                     X10_TEMP163,
                     X10_TEMP164));
                
//#line 2896
final Surface X10_TEMP169 =
                  (X10_TEMP569);
                
//#line 2897
final Vec X10_TEMP577 =
                  (Program0.
                     Program_RayTracer_TransDir(
                     X10_TEMP0,
                     X10_TEMP169,
                     surf,
                     I,
                     N));
                
//#line 2899
final Vec X10_TEMP172 =
                  (X10_TEMP577);
                
//#line 2900
final Vec X10_TEMP580 =
                  (X10_TEMP172);
                
//#line 2902
final Vec X10_TEMP173 =
                  (X10_TEMP580);
                
//#line 2903
final Vec X10_TEMP583 =
                  (X10_TEMP173);
                
//#line 2905
final Vec X10_TEMP586 =
                  (X10_TEMP583);
                
//#line 2906
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.d =
                  ((X10_TEMP586));
            } else {
                
//#line 2909
final int X10_TEMP588 =
                  (0);
                
//#line 2911
int X10_TEMP180 =
                  (X10_TEMP588);
                
//#line 2912
final int X10_TEMP591 =
                  (0);
                
//#line 2914
int X10_TEMP181 =
                  (X10_TEMP591);
                
//#line 2915
final int X10_TEMP594 =
                  (0);
                
//#line 2917
int X10_TEMP182 =
                  (X10_TEMP594);
                
//#line 2918
final Vec X10_TEMP597 =
                  (new Vec(
                     ));
                
//#line 2920
Vec X10_TEMP183 =
                  (X10_TEMP597);
                
//#line 2921
final boolean X10_TEMP600 =
                  (true);
                
//#line 2923
boolean X10_TEMP184 =
                  (X10_TEMP600);
                
//#line 2924
final Surface X10_TEMP608 =
                  (new Surface(
                     X10_TEMP180,
                     X10_TEMP181,
                     X10_TEMP182,
                     X10_TEMP183,
                     X10_TEMP184));
                
//#line 2926
final Surface X10_TEMP188 =
                  (X10_TEMP608);
                
//#line 2927
final Vec X10_TEMP616 =
                  (Program0.
                     Program_RayTracer_TransDir(
                     X10_TEMP0,
                     surf,
                     X10_TEMP188,
                     I,
                     N));
                
//#line 2929
final Vec X10_TEMP191 =
                  (X10_TEMP616);
                
//#line 2930
final Vec X10_TEMP619 =
                  (X10_TEMP191);
                
//#line 2932
final Vec X10_TEMP192 =
                  (X10_TEMP619);
                
//#line 2933
final Vec X10_TEMP622 =
                  (X10_TEMP192);
                
//#line 2935
final Vec X10_TEMP625 =
                  (X10_TEMP622);
                
//#line 2936
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(tRay))/* } */.d =
                  ((X10_TEMP625));
            }
            
//#line 2938
final int X10_TEMP627 =
              (1);
            
//#line 2940
final int X10_TEMP193 =
              (X10_TEMP627);
            
//#line 2941
final int X10_TEMP630 =
              (level +
                 X10_TEMP193);
            
//#line 2943
final int X10_TEMP200 =
              (X10_TEMP630);
            
//#line 2944
final double X10_TEMP633 =
              (surf.
                 kt);
            
//#line 2946
final double X10_TEMP195 =
              (X10_TEMP633);
            
//#line 2947
final double X10_TEMP636 =
              (X10_TEMP195 *
                 weight);
            
//#line 2949
final double X10_TEMP201 =
              (X10_TEMP636);
            
//#line 2950
final Vec X10_TEMP645 =
              (Program0.
                 Program_RayTracer_trace(
                 X10_TEMP0,
                 X10_TEMP200,
                 X10_TEMP201,
                 tRay,
                 hit,
                 tRay));
            
//#line 2952
Vec tcol =
              (X10_TEMP645);
            
//#line 2953
final double X10_TEMP648 =
              (surf.
                 kt);
            
//#line 2955
final double X10_TEMP205 =
              (X10_TEMP648);
            
//#line 2956
final Vec X10_TEMP654 =
              (Program0.
                 Program_Vec_adds2(
                 col,
                 X10_TEMP205,
                 tcol));
            
//#line 2958
final Vec X10_TEMP207 =
              (X10_TEMP654);
            
//#line 2959
final Vec X10_TEMP657 =
              (X10_TEMP207);
            
//#line 2961
col =
              ((X10_TEMP657));
        }
        
//#line 2963
return col;
    }
    
    
//#line 2965
public static Vec
                    Program_RayTracer_trace(
                    final RayTracer X10_TEMP0,
                    final int level,
                    final double weight,
                    final Ray r,
                    final Isect inter,
                    final Ray tRay) {
        
//#line 2966
final int X10_TEMP210 =
          (6);
        
//#line 2968
final int X10_TEMP1 =
          (X10_TEMP210);
        
//#line 2969
final boolean X10_TEMP3 =
          (level >
             X10_TEMP1);
        
//#line 2970
if (X10_TEMP3) {
            
//#line 2971
final Vec X10_TEMP215 =
              (new Vec(
                 ));
            
//#line 2973
final Vec X10_TEMP5 =
              (X10_TEMP215);
            
//#line 2974
return X10_TEMP5;
        }
        
//#line 2976
final double X10_TEMP219 =
          (1000000.0);
        
//#line 2978
final double X10_TEMP9 =
          (X10_TEMP219);
        
//#line 2979
final boolean X10_TEMP226 =
          (Program0.
             Program_RayTracer_intersect(
             X10_TEMP0,
             r,
             X10_TEMP9,
             inter));
        
//#line 2981
boolean hit =
          (X10_TEMP226);
        
//#line 2982
if (hit) {
            
//#line 2983
final double X10_TEMP230 =
              (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.t);
            
//#line 2985
final double X10_TEMP13 =
              (X10_TEMP230);
            
//#line 2986
final Vec X10_TEMP235 =
              (Program0.
                 Program_Ray_rayPoint(
                 r,
                 X10_TEMP13));
            
//#line 2988
Vec P =
              (X10_TEMP235);
            
//#line 2989
final Sphere X10_TEMP238 =
              (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(inter))/* } */.prim);
            
//#line 2991
final Sphere X10_TEMP15 =
              (X10_TEMP238);
            
//#line 2992
final Vec X10_TEMP243 =
              (Program0.
                 Program_Sphere_normal(
                 X10_TEMP15,
                 P));
            
//#line 2994
Vec N =
              (X10_TEMP243);
            
//#line 2995
final Vec X10_TEMP246 =
              (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(r))/* } */.d);
            
//#line 2997
final Vec X10_TEMP20 =
              (X10_TEMP246);
            
//#line 2998
final double X10_TEMP251 =
              (Program0.
                 Program_Vec_dot(
                 X10_TEMP20,
                 N));
            
//#line 3000
final double X10_TEMP21 =
              (X10_TEMP251);
            
//#line 3001
final double X10_TEMP254 =
              (0.0);
            
//#line 3003
final double X10_TEMP22 =
              (X10_TEMP254);
            
//#line 3004
final boolean X10_TEMP24 =
              (X10_TEMP21 >=
                 X10_TEMP22);
            
//#line 3005
if (X10_TEMP24) {
                
//#line 3006
final Vec X10_TEMP260 =
                  (Program0.
                     Program_Vec_negate(
                     N));
                
//#line 3008
final Vec X10_TEMP26 =
                  (X10_TEMP260);
                
//#line 3009
final Vec X10_TEMP263 =
                  (X10_TEMP26);
                
//#line 3011
N =
                  ((X10_TEMP263));
            }
            
//#line 3013
final Vec X10_TEMP266 =
              (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(r))/* } */.d);
            
//#line 3015
final Vec X10_TEMP34 =
              (X10_TEMP266);
            
//#line 3016
final Vec X10_TEMP277 =
              (Program0.
                 Program_RayTracer_shade(
                 X10_TEMP0,
                 level,
                 weight,
                 P,
                 N,
                 X10_TEMP34,
                 inter,
                 tRay));
            
//#line 3018
final Vec X10_TEMP36 =
              (X10_TEMP277);
            
//#line 3019
return X10_TEMP36;
        }
        
//#line 3021
return _Program__RayTracer_voidVec;
    }
    
    
//#line 3023
public static int
                    Program__Scene_maxObjects_init(
                    ) {
        
//#line 3024
final int X10_TEMP210 =
          (64);
        
//#line 3026
final int X10_TEMP2 =
          (X10_TEMP210);
        
//#line 3027
return X10_TEMP2;
    }
    
    
//#line 3029
public static int
                    Program__Scene_maxLights_init(
                    ) {
        
//#line 3030
final int X10_TEMP210 =
          (5);
        
//#line 3032
final int X10_TEMP2 =
          (X10_TEMP210);
        
//#line 3033
return X10_TEMP2;
    }
    
    
//#line 3035
public static void
                    Program_Scene_addLight(
                    final Scene X10_TEMP0,
                    final Light l) {
        
//#line 3036
final int X10_TEMP210 =
          (/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lightCount);
        
//#line 3038
final int X10_TEMP2 =
          (X10_TEMP210);
        
//#line 3039
final int X10_TEMP213 =
          (1);
        
//#line 3041
final int X10_TEMP1 =
          (X10_TEMP213);
        
//#line 3042
final int X10_TEMP216 =
          (_Program__Scene_maxLights -
             X10_TEMP1);
        
//#line 3044
final int X10_TEMP3 =
          (X10_TEMP216);
        
//#line 3045
final boolean X10_TEMP5 =
          (X10_TEMP2 >
             X10_TEMP3);
        
//#line 3046
if (X10_TEMP5) {
            
//#line 3047
final java.
              lang.
              String X10_TEMP221 =
              ("Only ");
            
//#line 3049
final java.
              lang.
              String X10_TEMP6 =
              (X10_TEMP221);
            
//#line 3050
final java.
              lang.
              String X10_TEMP224 =
              (X10_TEMP6 +
               _Program__Scene_maxLights);
            
//#line 3052
final java.
              lang.
              String X10_TEMP7 =
              (X10_TEMP224);
            
//#line 3053
final java.
              lang.
              String X10_TEMP227 =
              (" lights allowed");
            
//#line 3055
final java.
              lang.
              String X10_TEMP8 =
              (X10_TEMP227);
            
//#line 3056
final java.
              lang.
              String X10_TEMP230 =
              (X10_TEMP7 +
               X10_TEMP8);
            
//#line 3058
final java.
              lang.
              String X10_TEMP10 =
              (X10_TEMP230);
            
//#line 3059
throw new java.
              lang.
              RuntimeException(
              X10_TEMP10);
        }
        
//#line 3061
final x10.
          lang.
          GenericReferenceArray X10_TEMP234 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lights));
        
//#line 3063
final x10.
          lang.
          GenericReferenceArray X10_TEMP11 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP234));
        
//#line 3064
final int X10_TEMP237 =
          (/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lightCount);
        
//#line 3066
final int X10_TEMP12 =
          (X10_TEMP237);
        
//#line 3067
final int X10_TEMP13 =
          (1);
        
//#line 3068
final int X10_TEMP241 =
          (/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lightCount);
        
//#line 3070
final int X10_TEMP14 =
          (X10_TEMP241);
        
//#line 3071
final int X10_TEMP244 =
          (X10_TEMP14 +
             X10_TEMP13);
        
//#line 3073
final int X10_TEMP15 =
          (X10_TEMP244);
        
//#line 3074
final int X10_TEMP247 =
          (X10_TEMP15);
        
//#line 3076
final int X10_TEMP250 =
          (X10_TEMP247);
        
//#line 3077
/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lightCount =
          ((X10_TEMP250));
        
//#line 3078
final Light X10_TEMP252 =
          (l);
        
//#line 3080
final Light X10_TEMP19 =
          (X10_TEMP252);
        
//#line 3081
final Light X10_TEMP256 =
          (X10_TEMP19);
        
//#line 3083
final Light X10_TEMP259 =
          (X10_TEMP256);
        
//#line 3084
/* template:array_set { */(X10_TEMP11).set((X10_TEMP259),X10_TEMP12)/* } */;
    }
    
    
//#line 3086
public static void
                    Program_Scene_addObject(
                    final Scene X10_TEMP0,
                    final Sphere object) {
        
//#line 3087
final int X10_TEMP210 =
          (/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.objectCount);
        
//#line 3089
final int X10_TEMP2 =
          (X10_TEMP210);
        
//#line 3090
final int X10_TEMP213 =
          (1);
        
//#line 3092
final int X10_TEMP1 =
          (X10_TEMP213);
        
//#line 3093
final int X10_TEMP216 =
          (_Program__Scene_maxObjects -
             X10_TEMP1);
        
//#line 3095
final int X10_TEMP3 =
          (X10_TEMP216);
        
//#line 3096
final boolean X10_TEMP5 =
          (X10_TEMP2 >
             X10_TEMP3);
        
//#line 3097
if (X10_TEMP5) {
            
//#line 3098
final java.
              lang.
              String X10_TEMP221 =
              ("Only ");
            
//#line 3100
final java.
              lang.
              String X10_TEMP6 =
              (X10_TEMP221);
            
//#line 3101
final java.
              lang.
              String X10_TEMP224 =
              (X10_TEMP6 +
               _Program__Scene_maxObjects);
            
//#line 3103
final java.
              lang.
              String X10_TEMP7 =
              (X10_TEMP224);
            
//#line 3104
final java.
              lang.
              String X10_TEMP227 =
              (" objects allowed");
            
//#line 3106
final java.
              lang.
              String X10_TEMP8 =
              (X10_TEMP227);
            
//#line 3107
final java.
              lang.
              String X10_TEMP230 =
              (X10_TEMP7 +
               X10_TEMP8);
            
//#line 3109
final java.
              lang.
              String X10_TEMP10 =
              (X10_TEMP230);
            
//#line 3110
throw new java.
              lang.
              RuntimeException(
              X10_TEMP10);
        }
        
//#line 3112
final x10.
          lang.
          GenericReferenceArray X10_TEMP234 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.objects));
        
//#line 3114
final x10.
          lang.
          GenericReferenceArray X10_TEMP11 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP234));
        
//#line 3115
final int X10_TEMP237 =
          (/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.objectCount);
        
//#line 3117
final int X10_TEMP12 =
          (X10_TEMP237);
        
//#line 3118
final int X10_TEMP13 =
          (1);
        
//#line 3119
final int X10_TEMP241 =
          (/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.objectCount);
        
//#line 3121
final int X10_TEMP14 =
          (X10_TEMP241);
        
//#line 3122
final int X10_TEMP244 =
          (X10_TEMP14 +
             X10_TEMP13);
        
//#line 3124
final int X10_TEMP15 =
          (X10_TEMP244);
        
//#line 3125
final int X10_TEMP247 =
          (X10_TEMP15);
        
//#line 3127
final int X10_TEMP250 =
          (X10_TEMP247);
        
//#line 3128
/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.objectCount =
          ((X10_TEMP250));
        
//#line 3129
final Sphere X10_TEMP252 =
          (object);
        
//#line 3131
final Sphere X10_TEMP19 =
          (X10_TEMP252);
        
//#line 3132
final Sphere X10_TEMP256 =
          (X10_TEMP19);
        
//#line 3134
final Sphere X10_TEMP259 =
          (X10_TEMP256);
        
//#line 3135
/* template:array_set { */(X10_TEMP11).set((X10_TEMP259),X10_TEMP12)/* } */;
    }
    
    
//#line 3137
public static View
                    Program_Scene_getView(
                    final Scene X10_TEMP0) {
        
//#line 3138
final View X10_TEMP210 =
          (/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.view);
        
//#line 3140
final View X10_TEMP2 =
          (X10_TEMP210);
        
//#line 3141
return X10_TEMP2;
    }
    
    
//#line 3143
public static Light
                    Program_Scene_getLight(
                    final Scene X10_TEMP0,
                    final x10.
                      lang.
                      point number) {
        
//#line 3144
final x10.
          lang.
          GenericReferenceArray X10_TEMP210 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lights));
        
//#line 3146
final x10.
          lang.
          GenericReferenceArray X10_TEMP1 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP210));
        
//#line 3147
final Light X10_TEMP214 =
          (/* template:parametric { */((Light)(/* template:array_get { */((X10_TEMP1).get(number))/* } */))/* } */);
        
//#line 3149
final Light X10_TEMP4 =
          (X10_TEMP214);
        
//#line 3150
return X10_TEMP4;
    }
    
    
//#line 3152
public static Sphere
                    Program_Scene_getObject(
                    final Scene X10_TEMP0,
                    final x10.
                      lang.
                      point number) {
        
//#line 3153
final x10.
          lang.
          GenericReferenceArray X10_TEMP210 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.objects));
        
//#line 3155
final x10.
          lang.
          GenericReferenceArray X10_TEMP1 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP210));
        
//#line 3156
final Sphere X10_TEMP214 =
          (/* template:parametric { */((Sphere)(/* template:array_get { */((X10_TEMP1).get(number))/* } */))/* } */);
        
//#line 3158
final Sphere X10_TEMP4 =
          (X10_TEMP214);
        
//#line 3159
return X10_TEMP4;
    }
    
    
//#line 3161
public static int
                    Program_Scene_getLights(
                    final Scene X10_TEMP0) {
        
//#line 3162
final int X10_TEMP210 =
          (/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lightCount);
        
//#line 3164
final int X10_TEMP2 =
          (X10_TEMP210);
        
//#line 3165
return X10_TEMP2;
    }
    
    
//#line 3167
public static int
                    Program_Scene_getObjects(
                    final Scene X10_TEMP0) {
        
//#line 3168
final int X10_TEMP210 =
          (/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.objectCount);
        
//#line 3170
final int X10_TEMP2 =
          (X10_TEMP210);
        
//#line 3171
return X10_TEMP2;
    }
    
    
//#line 3173
public static java.
                    lang.
                    String
                    Program_Surface_toString(
                    final Surface X10_TEMP0) {
        
//#line 3174
final java.
          lang.
          String X10_TEMP210 =
          ("Surface { color = ");
        
//#line 3176
final java.
          lang.
          String X10_TEMP1 =
          (X10_TEMP210);
        
//#line 3177
final Vec X10_TEMP213 =
          (X10_TEMP0.
             color);
        
//#line 3179
final Vec X10_TEMP2 =
          (X10_TEMP213);
        
//#line 3180
final java.
          lang.
          String X10_TEMP217 =
          (Program0.
             Program_Vec_toString(
             X10_TEMP2));
        
//#line 3182
final java.
          lang.
          String X10_TEMP3 =
          (X10_TEMP217);
        
//#line 3183
final java.
          lang.
          String X10_TEMP220 =
          (X10_TEMP1 +
           X10_TEMP3);
        
//#line 3185
final java.
          lang.
          String X10_TEMP4 =
          (X10_TEMP220);
        
//#line 3186
final java.
          lang.
          String X10_TEMP223 =
          (" }");
        
//#line 3188
final java.
          lang.
          String X10_TEMP5 =
          (X10_TEMP223);
        
//#line 3189
final java.
          lang.
          String X10_TEMP226 =
          (X10_TEMP4 +
           X10_TEMP5);
        
//#line 3191
final java.
          lang.
          String X10_TEMP7 =
          (X10_TEMP226);
        
//#line 3192
return X10_TEMP7;
    }
    
    
//#line 3194
public static java.
                    lang.
                    String
                    Program_View_toString(
                    final View X10_TEMP0) {
        
//#line 3195
final java.
          lang.
          String X10_TEMP210 =
          ("View { from = ");
        
//#line 3197
final java.
          lang.
          String X10_TEMP1 =
          (X10_TEMP210);
        
//#line 3198
final Vec X10_TEMP213 =
          (X10_TEMP0.
             from);
        
//#line 3200
final Vec X10_TEMP2 =
          (X10_TEMP213);
        
//#line 3201
final java.
          lang.
          String X10_TEMP217 =
          (Program0.
             Program_Vec_toString(
             X10_TEMP2));
        
//#line 3203
final java.
          lang.
          String X10_TEMP3 =
          (X10_TEMP217);
        
//#line 3204
final java.
          lang.
          String X10_TEMP220 =
          (X10_TEMP1 +
           X10_TEMP3);
        
//#line 3206
final java.
          lang.
          String X10_TEMP4 =
          (X10_TEMP220);
        
//#line 3207
final java.
          lang.
          String X10_TEMP223 =
          (" at = ");
        
//#line 3209
final java.
          lang.
          String X10_TEMP5 =
          (X10_TEMP223);
        
//#line 3210
final java.
          lang.
          String X10_TEMP226 =
          (X10_TEMP4 +
           X10_TEMP5);
        
//#line 3212
final java.
          lang.
          String X10_TEMP6 =
          (X10_TEMP226);
        
//#line 3213
final Vec X10_TEMP229 =
          (X10_TEMP0.
             at);
        
//#line 3215
final Vec X10_TEMP7 =
          (X10_TEMP229);
        
//#line 3216
final java.
          lang.
          String X10_TEMP233 =
          (Program0.
             Program_Vec_toString(
             X10_TEMP7));
        
//#line 3218
final java.
          lang.
          String X10_TEMP8 =
          (X10_TEMP233);
        
//#line 3219
final java.
          lang.
          String X10_TEMP236 =
          (X10_TEMP6 +
           X10_TEMP8);
        
//#line 3221
final java.
          lang.
          String X10_TEMP9 =
          (X10_TEMP236);
        
//#line 3222
final java.
          lang.
          String X10_TEMP239 =
          (" up = ");
        
//#line 3224
final java.
          lang.
          String X10_TEMP10 =
          (X10_TEMP239);
        
//#line 3225
final java.
          lang.
          String X10_TEMP242 =
          (X10_TEMP9 +
           X10_TEMP10);
        
//#line 3227
final java.
          lang.
          String X10_TEMP11 =
          (X10_TEMP242);
        
//#line 3228
final Vec X10_TEMP245 =
          (X10_TEMP0.
             up);
        
//#line 3230
final Vec X10_TEMP12 =
          (X10_TEMP245);
        
//#line 3231
final java.
          lang.
          String X10_TEMP249 =
          (Program0.
             Program_Vec_toString(
             X10_TEMP12));
        
//#line 3233
final java.
          lang.
          String X10_TEMP13 =
          (X10_TEMP249);
        
//#line 3234
final java.
          lang.
          String X10_TEMP252 =
          (X10_TEMP11 +
           X10_TEMP13);
        
//#line 3236
final java.
          lang.
          String X10_TEMP14 =
          (X10_TEMP252);
        
//#line 3237
final java.
          lang.
          String X10_TEMP255 =
          (" distance = ");
        
//#line 3239
final java.
          lang.
          String X10_TEMP15 =
          (X10_TEMP255);
        
//#line 3240
final java.
          lang.
          String X10_TEMP258 =
          (X10_TEMP14 +
           X10_TEMP15);
        
//#line 3242
final java.
          lang.
          String X10_TEMP16 =
          (X10_TEMP258);
        
//#line 3243
final double X10_TEMP261 =
          (X10_TEMP0.
             distance);
        
//#line 3245
final double X10_TEMP17 =
          (X10_TEMP261);
        
//#line 3246
final java.
          lang.
          String X10_TEMP264 =
          (X10_TEMP16 +
           X10_TEMP17);
        
//#line 3248
final java.
          lang.
          String X10_TEMP18 =
          (X10_TEMP264);
        
//#line 3249
final java.
          lang.
          String X10_TEMP267 =
          (" angle = ");
        
//#line 3251
final java.
          lang.
          String X10_TEMP19 =
          (X10_TEMP267);
        
//#line 3252
final java.
          lang.
          String X10_TEMP270 =
          (X10_TEMP18 +
           X10_TEMP19);
        
//#line 3254
final java.
          lang.
          String X10_TEMP20 =
          (X10_TEMP270);
        
//#line 3255
final double X10_TEMP273 =
          (X10_TEMP0.
             angle);
        
//#line 3257
final double X10_TEMP21 =
          (X10_TEMP273);
        
//#line 3258
final java.
          lang.
          String X10_TEMP276 =
          (X10_TEMP20 +
           X10_TEMP21);
        
//#line 3260
final java.
          lang.
          String X10_TEMP22 =
          (X10_TEMP276);
        
//#line 3261
final java.
          lang.
          String X10_TEMP279 =
          (" aspect = ");
        
//#line 3263
final java.
          lang.
          String X10_TEMP23 =
          (X10_TEMP279);
        
//#line 3264
final java.
          lang.
          String X10_TEMP282 =
          (X10_TEMP22 +
           X10_TEMP23);
        
//#line 3266
final java.
          lang.
          String X10_TEMP24 =
          (X10_TEMP282);
        
//#line 3267
final double X10_TEMP285 =
          (X10_TEMP0.
             aspect);
        
//#line 3269
final double X10_TEMP25 =
          (X10_TEMP285);
        
//#line 3270
final java.
          lang.
          String X10_TEMP288 =
          (X10_TEMP24 +
           X10_TEMP25);
        
//#line 3272
final java.
          lang.
          String X10_TEMP26 =
          (X10_TEMP288);
        
//#line 3273
final java.
          lang.
          String X10_TEMP291 =
          ("}");
        
//#line 3275
final java.
          lang.
          String X10_TEMP27 =
          (X10_TEMP291);
        
//#line 3276
final java.
          lang.
          String X10_TEMP294 =
          (X10_TEMP26 +
           X10_TEMP27);
        
//#line 3278
final java.
          lang.
          String X10_TEMP29 =
          (X10_TEMP294);
        
//#line 3279
return X10_TEMP29;
    }
    
    
//#line 3281
public static java.
                    lang.
                    String
                    Program_Envelope_toString(
                    final Envelope X10_TEMP0) {
        
//#line 3282
final java.
          lang.
          String X10_TEMP210 =
          ("");
        
//#line 3284
final java.
          lang.
          String X10_TEMP2 =
          (X10_TEMP210);
        
//#line 3285
return X10_TEMP2;
    }
    
    
//#line 3287
public static java.
                    lang.
                    String
                    Program_Envelope2_toString(
                    final Envelope2 X10_TEMP0) {
        
//#line 3288
final java.
          lang.
          String X10_TEMP210 =
          ("");
        
//#line 3290
final java.
          lang.
          String X10_TEMP2 =
          (X10_TEMP210);
        
//#line 3291
return X10_TEMP2;
    }
    
    
//#line 3293
public static int
                    Program__Timer_max_counters_init(
                    ) {
        
//#line 3294
final int X10_TEMP210 =
          (64);
        
//#line 3296
final int X10_TEMP2 =
          (X10_TEMP210);
        
//#line 3297
return X10_TEMP2;
    }
    
    
//#line 3299
public static void
                    Program_Timer_start(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 3300
final x10.
          lang.
          DoubleReferenceArray X10_TEMP210 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 3302
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP210));
        
//#line 3303
final long X10_TEMP213 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 3305
final double X10_TEMP5 =
          (X10_TEMP213);
        
//#line 3306
final double X10_TEMP216 =
          (X10_TEMP5);
        
//#line 3308
final double X10_TEMP6 =
          (X10_TEMP216);
        
//#line 3309
final double X10_TEMP220 =
          (X10_TEMP6);
        
//#line 3311
final double X10_TEMP223 =
          (X10_TEMP220);
        
//#line 3312
/* template:array_set { */(X10_TEMP1).set((X10_TEMP223),n)/* } */;
    }
    
    
//#line 3314
public static void
                    Program_Timer_stop(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 3315
final x10.
          lang.
          DoubleReferenceArray X10_TEMP210 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 3317
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP210));
        
//#line 3318
final long X10_TEMP213 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 3320
final double X10_TEMP5 =
          (X10_TEMP213);
        
//#line 3321
final x10.
          lang.
          DoubleReferenceArray X10_TEMP216 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 3323
final x10.
          lang.
          DoubleReferenceArray X10_TEMP3 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP216));
        
//#line 3324
final double X10_TEMP220 =
          (/* template:array_get { */((X10_TEMP3).get(n))/* } */);
        
//#line 3326
final double X10_TEMP6 =
          (X10_TEMP220);
        
//#line 3327
final double X10_TEMP223 =
          (X10_TEMP5 -
             X10_TEMP6);
        
//#line 3329
final double X10_TEMP9 =
          (X10_TEMP223);
        
//#line 3330
final double X10_TEMP226 =
          (X10_TEMP9);
        
//#line 3332
final double X10_TEMP10 =
          (X10_TEMP226);
        
//#line 3333
final double X10_TEMP230 =
          (X10_TEMP10);
        
//#line 3335
final double X10_TEMP233 =
          (X10_TEMP230);
        
//#line 3336
/* template:array_set { */(X10_TEMP1).set((X10_TEMP233),n)/* } */;
        
//#line 3337
final x10.
          lang.
          DoubleReferenceArray X10_TEMP235 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 3339
final x10.
          lang.
          DoubleReferenceArray X10_TEMP11 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP235));
        
//#line 3340
final double X10_TEMP239 =
          (/* template:array_get { */((X10_TEMP11).get(n))/* } */);
        
//#line 3342
final double X10_TEMP14 =
          (X10_TEMP239);
        
//#line 3343
final int X10_TEMP242 =
          (1000);
        
//#line 3345
final double X10_TEMP15 =
          (X10_TEMP242);
        
//#line 3346
final double X10_TEMP245 =
          (X10_TEMP14 /
             X10_TEMP15);
        
//#line 3348
final double X10_TEMP16 =
          (X10_TEMP245);
        
//#line 3349
final double X10_TEMP249 =
          (X10_TEMP16);
        
//#line 3351
final double X10_TEMP252 =
          (X10_TEMP249);
        
//#line 3352
/* template:array_set { */(X10_TEMP11).set((X10_TEMP252),n)/* } */;
        
//#line 3353
final x10.
          lang.
          DoubleReferenceArray X10_TEMP254 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 3355
final x10.
          lang.
          DoubleReferenceArray X10_TEMP17 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP254));
        
//#line 3356
final x10.
          lang.
          DoubleReferenceArray X10_TEMP257 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 3358
final x10.
          lang.
          DoubleReferenceArray X10_TEMP19 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP257));
        
//#line 3359
final double X10_TEMP261 =
          (/* template:array_get { */((X10_TEMP17).get(n))/* } */);
        
//#line 3361
final double X10_TEMP22 =
          (X10_TEMP261);
        
//#line 3362
final double X10_TEMP265 =
          (/* template:array_get { */((X10_TEMP19).get(n))/* } */);
        
//#line 3364
final double X10_TEMP23 =
          (X10_TEMP265);
        
//#line 3365
final double X10_TEMP268 =
          (X10_TEMP22 +
             X10_TEMP23);
        
//#line 3367
final double X10_TEMP24 =
          (X10_TEMP268);
        
//#line 3368
final double X10_TEMP272 =
          (X10_TEMP24);
        
//#line 3370
final double X10_TEMP275 =
          (X10_TEMP272);
        
//#line 3371
/* template:array_set { */(X10_TEMP17).set((X10_TEMP275),n)/* } */;
    }
    
    
//#line 3373
public static double
                    Program_Timer_readTimer(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 3374
final x10.
          lang.
          DoubleReferenceArray X10_TEMP210 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 3376
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP210));
        
//#line 3377
final double X10_TEMP214 =
          (/* template:array_get { */((X10_TEMP1).get(n))/* } */);
        
//#line 3379
final double X10_TEMP4 =
          (X10_TEMP214);
        
//#line 3380
return X10_TEMP4;
    }
    
    
//#line 3382
public static void
                    Program_Timer_resetTimer(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 3383
final x10.
          lang.
          DoubleReferenceArray X10_TEMP210 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 3385
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP210));
        
//#line 3386
final int X10_TEMP213 =
          (0);
        
//#line 3388
final double X10_TEMP5 =
          (X10_TEMP213);
        
//#line 3389
final double X10_TEMP216 =
          (X10_TEMP5);
        
//#line 3391
final double X10_TEMP6 =
          (X10_TEMP216);
        
//#line 3392
final double X10_TEMP220 =
          (X10_TEMP6);
        
//#line 3394
final double X10_TEMP223 =
          (X10_TEMP220);
        
//#line 3395
/* template:array_set { */(X10_TEMP1).set((X10_TEMP223),n)/* } */;
        
//#line 3396
final x10.
          lang.
          DoubleReferenceArray X10_TEMP225 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 3398
final x10.
          lang.
          DoubleReferenceArray X10_TEMP7 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP225));
        
//#line 3399
final int X10_TEMP228 =
          (0);
        
//#line 3401
final double X10_TEMP11 =
          (X10_TEMP228);
        
//#line 3402
final double X10_TEMP231 =
          (X10_TEMP11);
        
//#line 3404
final double X10_TEMP12 =
          (X10_TEMP231);
        
//#line 3405
final double X10_TEMP235 =
          (X10_TEMP12);
        
//#line 3407
final double X10_TEMP238 =
          (X10_TEMP235);
        
//#line 3408
/* template:array_set { */(X10_TEMP7).set((X10_TEMP238),n)/* } */;
        
//#line 3409
final x10.
          lang.
          DoubleReferenceArray X10_TEMP240 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 3411
final x10.
          lang.
          DoubleReferenceArray X10_TEMP13 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP240));
        
//#line 3412
final int X10_TEMP243 =
          (0);
        
//#line 3414
final double X10_TEMP17 =
          (X10_TEMP243);
        
//#line 3415
final double X10_TEMP246 =
          (X10_TEMP17);
        
//#line 3417
final double X10_TEMP18 =
          (X10_TEMP246);
        
//#line 3418
final double X10_TEMP250 =
          (X10_TEMP18);
        
//#line 3420
final double X10_TEMP253 =
          (X10_TEMP250);
        
//#line 3421
/* template:array_set { */(X10_TEMP13).set((X10_TEMP253),n)/* } */;
    }
    
    
//#line 3423
public static void
                    Program_Timer_resetAllTimers(
                    final Timer X10_TEMP0) {
        
//#line 3424
final int X10_TEMP210 =
          (0);
        
//#line 3426
int i =
          (X10_TEMP210);
        
//#line 3427
boolean X10_TEMP4 =
          (i <
             _Program__Timer_max_counters);
        
//#line 3428
boolean X10_TEMP215 =
          X10_TEMP4;
        
//#line 3429
while (X10_TEMP215) {
            
//#line 3430
Program0.
                            Program_Timer_resetTimer(
                            X10_TEMP0,
                            i);
            
//#line 3431
final int X10_TEMP219 =
              (i);
            
//#line 3433
final int X10_TEMP6 =
              (X10_TEMP219);
            
//#line 3434
final int X10_TEMP7 =
              (1);
            
//#line 3435
final int X10_TEMP223 =
              (i +
                 X10_TEMP7);
            
//#line 3436
i =
              ((X10_TEMP223));
            
//#line 3437
final boolean X10_TEMP225 =
              (i <
                 _Program__Timer_max_counters);
            
//#line 3438
X10_TEMP4 =
              ((X10_TEMP225));
            
//#line 3439
X10_TEMP215 =
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
    
    
//#line 3445
public Program() {
        
//#line 3445
super();
    }
}

class Interval
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 3449
final public int
      number;
    
//#line 3450
final public int
      width;
    
//#line 3451
final public int
      height;
    
//#line 3452
final public int
      yfrom;
    
//#line 3453
final public int
      yto;
    
//#line 3454
final public int
      total;
    
    
//#line 3457
public Interval(final int number_,
                                  final int width_,
                                  final int height_,
                                  final int yfrom_,
                                  final int yto_,
                                  final int total_) {
        
//#line 3457
super();
        
//#line 3458
final int X10_TEMP210 =
          (number_);
        
//#line 3460
number =
          ((X10_TEMP210));
        
//#line 3461
final int X10_TEMP213 =
          (width_);
        
//#line 3463
width =
          ((X10_TEMP213));
        
//#line 3464
final int X10_TEMP216 =
          (height_);
        
//#line 3466
height =
          ((X10_TEMP216));
        
//#line 3467
final int X10_TEMP219 =
          (yfrom_);
        
//#line 3469
yfrom =
          ((X10_TEMP219));
        
//#line 3470
final int X10_TEMP222 =
          (yto_);
        
//#line 3472
yto =
          ((X10_TEMP222));
        
//#line 3473
final int X10_TEMP225 =
          (total_);
        
//#line 3475
total =
          ((X10_TEMP225));
    }
}

class Light
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 3482
final public Vec
      pos;
    
//#line 3483
final public double
      brightness;
    
    
//#line 3486
public Light(final double x,
                               final double y,
                               final double z,
                               final double b) {
        
//#line 3486
super();
        
//#line 3487
final boolean X10_TEMP210 =
          (false);
        
//#line 3489
boolean X10_TEMP5 =
          (X10_TEMP210);
        
//#line 3490
final Vec X10_TEMP217 =
          (new Vec(
             x,
             y,
             z,
             X10_TEMP5));
        
//#line 3492
final Vec X10_TEMP7 =
          (X10_TEMP217);
        
//#line 3493
final Vec X10_TEMP220 =
          (X10_TEMP7);
        
//#line 3495
pos =
          ((X10_TEMP220));
        
//#line 3496
final double X10_TEMP223 =
          (b);
        
//#line 3498
brightness =
          ((X10_TEMP223));
    }
}

class Ray
extends x10.
  lang.
  Object
{
    
//#line 3505
public Vec
      p;
    
//#line 3506
public Vec
      d;
    
    
//#line 3509
public Ray(final Vec pnt,
                             final Vec dir) {
        
//#line 3509
super();
        
//#line 3510
final double X10_TEMP210 =
          (pnt.
             x);
        
//#line 3512
double X10_TEMP5 =
          (X10_TEMP210);
        
//#line 3513
final double X10_TEMP213 =
          (pnt.
             y);
        
//#line 3515
double X10_TEMP6 =
          (X10_TEMP213);
        
//#line 3516
final double X10_TEMP216 =
          (pnt.
             z);
        
//#line 3518
double X10_TEMP7 =
          (X10_TEMP216);
        
//#line 3519
final boolean X10_TEMP219 =
          (false);
        
//#line 3521
boolean X10_TEMP8 =
          (X10_TEMP219);
        
//#line 3522
final Vec X10_TEMP226 =
          (new Vec(
             X10_TEMP5,
             X10_TEMP6,
             X10_TEMP7,
             X10_TEMP8));
        
//#line 3524
final Vec X10_TEMP10 =
          (X10_TEMP226);
        
//#line 3525
final Vec X10_TEMP229 =
          (X10_TEMP10);
        
//#line 3527
p =
          ((X10_TEMP229));
        
//#line 3528
final double X10_TEMP232 =
          (dir.
             x);
        
//#line 3530
double X10_TEMP15 =
          (X10_TEMP232);
        
//#line 3531
final double X10_TEMP235 =
          (dir.
             y);
        
//#line 3533
double X10_TEMP16 =
          (X10_TEMP235);
        
//#line 3534
final double X10_TEMP238 =
          (dir.
             z);
        
//#line 3536
double X10_TEMP17 =
          (X10_TEMP238);
        
//#line 3537
final boolean X10_TEMP241 =
          (false);
        
//#line 3539
boolean X10_TEMP18 =
          (X10_TEMP241);
        
//#line 3540
final Vec X10_TEMP248 =
          (new Vec(
             X10_TEMP15,
             X10_TEMP16,
             X10_TEMP17,
             X10_TEMP18));
        
//#line 3542
final Vec X10_TEMP19 =
          (X10_TEMP248);
        
//#line 3543
final Vec X10_TEMP252 =
          (Program0.
             Program_Vec_normalized(
             X10_TEMP19));
        
//#line 3545
final Vec X10_TEMP21 =
          (X10_TEMP252);
        
//#line 3546
final Vec X10_TEMP255 =
          (X10_TEMP21);
        
//#line 3548
d =
          ((X10_TEMP255));
    }
    
    
//#line 3550
public Ray(final Vec pnt,
                             final Vec dir,
                             final boolean normalize) {
        
//#line 3550
super();
        
//#line 3551
if (normalize) {
            
//#line 3552
final double X10_TEMP211 =
              (pnt.
                 x);
            
//#line 3554
double X10_TEMP6 =
              (X10_TEMP211);
            
//#line 3555
final double X10_TEMP214 =
              (pnt.
                 y);
            
//#line 3557
double X10_TEMP7 =
              (X10_TEMP214);
            
//#line 3558
final double X10_TEMP217 =
              (pnt.
                 z);
            
//#line 3560
double X10_TEMP8 =
              (X10_TEMP217);
            
//#line 3561
final boolean X10_TEMP220 =
              (false);
            
//#line 3563
boolean X10_TEMP9 =
              (X10_TEMP220);
            
//#line 3564
final Vec X10_TEMP227 =
              (new Vec(
                 X10_TEMP6,
                 X10_TEMP7,
                 X10_TEMP8,
                 X10_TEMP9));
            
//#line 3566
final Vec X10_TEMP11 =
              (X10_TEMP227);
            
//#line 3567
final Vec X10_TEMP230 =
              (X10_TEMP11);
            
//#line 3569
p =
              ((X10_TEMP230));
            
//#line 3570
final double X10_TEMP233 =
              (dir.
                 x);
            
//#line 3572
double X10_TEMP16 =
              (X10_TEMP233);
            
//#line 3573
final double X10_TEMP236 =
              (dir.
                 y);
            
//#line 3575
double X10_TEMP17 =
              (X10_TEMP236);
            
//#line 3576
final double X10_TEMP239 =
              (dir.
                 z);
            
//#line 3578
double X10_TEMP18 =
              (X10_TEMP239);
            
//#line 3579
final boolean X10_TEMP242 =
              (false);
            
//#line 3581
boolean X10_TEMP19 =
              (X10_TEMP242);
            
//#line 3582
final Vec X10_TEMP249 =
              (new Vec(
                 X10_TEMP16,
                 X10_TEMP17,
                 X10_TEMP18,
                 X10_TEMP19));
            
//#line 3584
final Vec X10_TEMP20 =
              (X10_TEMP249);
            
//#line 3585
final Vec X10_TEMP253 =
              (Program0.
                 Program_Vec_normalized(
                 X10_TEMP20));
            
//#line 3587
final Vec X10_TEMP22 =
              (X10_TEMP253);
            
//#line 3588
final Vec X10_TEMP256 =
              (X10_TEMP22);
            
//#line 3590
d =
              ((X10_TEMP256));
        } else {
            
//#line 3593
final Vec X10_TEMP259 =
              (pnt);
            
//#line 3595
p =
              ((X10_TEMP259));
            
//#line 3596
final Vec X10_TEMP262 =
              (dir);
            
//#line 3598
d =
              ((X10_TEMP262));
        }
    }
    
    
//#line 3601
public Ray() {
        
//#line 3601
super();
        
//#line 3602
final Vec X10_TEMP210 =
          (new Vec(
             ));
        
//#line 3604
final Vec X10_TEMP2 =
          (X10_TEMP210);
        
//#line 3605
final Vec X10_TEMP213 =
          (X10_TEMP2);
        
//#line 3607
p =
          ((X10_TEMP213));
        
//#line 3608
final Vec X10_TEMP216 =
          (new Vec(
             ));
        
//#line 3610
final Vec X10_TEMP4 =
          (X10_TEMP216);
        
//#line 3611
final Vec X10_TEMP219 =
          (X10_TEMP4);
        
//#line 3613
d =
          ((X10_TEMP219));
    }
}

class Sphere
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 3620
final public Vec
      c;
    
//#line 3621
final public double
      r;
    
//#line 3622
final public double
      r2;
    
//#line 3623
final public Surface
      surf;
    
    
//#line 3626
public Sphere(final Vec center,
                                final double radius,
                                final Surface s) {
        
//#line 3626
super();
        
//#line 3627
final Surface X10_TEMP210 =
          (s);
        
//#line 3629
surf =
          ((X10_TEMP210));
        
//#line 3630
final Vec X10_TEMP213 =
          (center);
        
//#line 3632
c =
          ((X10_TEMP213));
        
//#line 3633
final double X10_TEMP216 =
          (radius);
        
//#line 3635
r =
          ((X10_TEMP216));
        
//#line 3636
final double X10_TEMP219 =
          (radius *
             radius);
        
//#line 3638
final double X10_TEMP5 =
          (X10_TEMP219);
        
//#line 3639
final double X10_TEMP222 =
          (X10_TEMP5);
        
//#line 3641
r2 =
          ((X10_TEMP222));
    }
    
    
//#line 3643
public Sphere(final Vec center,
                                final double radius) {
        
//#line 3643
super();
        
//#line 3644
final Vec X10_TEMP210 =
          (center);
        
//#line 3646
c =
          ((X10_TEMP210));
        
//#line 3647
final double X10_TEMP213 =
          (radius);
        
//#line 3649
r =
          ((X10_TEMP213));
        
//#line 3650
final double X10_TEMP216 =
          (radius *
             radius);
        
//#line 3652
final double X10_TEMP4 =
          (X10_TEMP216);
        
//#line 3653
final double X10_TEMP219 =
          (X10_TEMP4);
        
//#line 3655
r2 =
          ((X10_TEMP219));
        
//#line 3656
final Surface X10_TEMP222 =
          (new Surface(
             ));
        
//#line 3658
final Surface X10_TEMP6 =
          (X10_TEMP222);
        
//#line 3659
final Surface X10_TEMP225 =
          (X10_TEMP6);
        
//#line 3661
surf =
          ((X10_TEMP225));
    }
}

class Vec
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 3668
final public double
      x;
    
//#line 3669
final public double
      y;
    
//#line 3670
final public double
      z;
    
//#line 3671
final public boolean
      isNull;
    
    
//#line 3674
public Vec(final double a,
                             final double b,
                             final double c,
                             final boolean isNull_) {
        
//#line 3674
super();
        
//#line 3675
final double X10_TEMP210 =
          (a);
        
//#line 3677
x =
          ((X10_TEMP210));
        
//#line 3678
final double X10_TEMP213 =
          (b);
        
//#line 3680
y =
          ((X10_TEMP213));
        
//#line 3681
final double X10_TEMP216 =
          (c);
        
//#line 3683
z =
          ((X10_TEMP216));
        
//#line 3684
final boolean X10_TEMP219 =
          (isNull_);
        
//#line 3686
isNull =
          ((X10_TEMP219));
    }
    
    
//#line 3688
public Vec(final Vec a,
                             final boolean isNull_) {
        
//#line 3688
super();
        
//#line 3689
final double X10_TEMP210 =
          (a.
             x);
        
//#line 3691
final double X10_TEMP2 =
          (X10_TEMP210);
        
//#line 3692
final double X10_TEMP213 =
          (X10_TEMP2);
        
//#line 3694
x =
          ((X10_TEMP213));
        
//#line 3695
final double X10_TEMP216 =
          (a.
             y);
        
//#line 3697
final double X10_TEMP4 =
          (X10_TEMP216);
        
//#line 3698
final double X10_TEMP219 =
          (X10_TEMP4);
        
//#line 3700
y =
          ((X10_TEMP219));
        
//#line 3701
final double X10_TEMP222 =
          (a.
             z);
        
//#line 3703
final double X10_TEMP6 =
          (X10_TEMP222);
        
//#line 3704
final double X10_TEMP225 =
          (X10_TEMP6);
        
//#line 3706
z =
          ((X10_TEMP225));
        
//#line 3707
final boolean X10_TEMP228 =
          (isNull_);
        
//#line 3709
isNull =
          ((X10_TEMP228));
    }
    
    
//#line 3711
public Vec() {
        
//#line 3711
super();
        
//#line 3712
final double X10_TEMP210 =
          (0.0);
        
//#line 3714
final double X10_TEMP2 =
          (X10_TEMP210);
        
//#line 3715
final double X10_TEMP213 =
          (X10_TEMP2);
        
//#line 3717
x =
          ((X10_TEMP213));
        
//#line 3718
final double X10_TEMP216 =
          (0.0);
        
//#line 3720
final double X10_TEMP4 =
          (X10_TEMP216);
        
//#line 3721
final double X10_TEMP219 =
          (X10_TEMP4);
        
//#line 3723
y =
          ((X10_TEMP219));
        
//#line 3724
final double X10_TEMP222 =
          (0.0);
        
//#line 3726
final double X10_TEMP6 =
          (X10_TEMP222);
        
//#line 3727
final double X10_TEMP225 =
          (X10_TEMP6);
        
//#line 3729
z =
          ((X10_TEMP225));
        
//#line 3730
final boolean X10_TEMP228 =
          (false);
        
//#line 3732
final boolean X10_TEMP8 =
          (X10_TEMP228);
        
//#line 3733
final boolean X10_TEMP231 =
          (X10_TEMP8);
        
//#line 3735
isNull =
          ((X10_TEMP231));
    }
}

class Isect
extends x10.
  lang.
  Object
{
    
//#line 3742
public double
      t;
    
//#line 3743
public int
      enter;
    
//#line 3744
public Sphere
      prim;
    
//#line 3745
public Surface
      surf;
    
//#line 3746
public boolean
      isNull;
    
    
//#line 3749
public Isect() {
        
//#line 3749
super();
        
//#line 3750
final double X10_TEMP210 =
          (0.0);
        
//#line 3752
final double X10_TEMP2 =
          (X10_TEMP210);
        
//#line 3753
final double X10_TEMP213 =
          (X10_TEMP2);
        
//#line 3755
t =
          ((X10_TEMP213));
        
//#line 3756
final int X10_TEMP216 =
          (0);
        
//#line 3758
final int X10_TEMP4 =
          (X10_TEMP216);
        
//#line 3759
final int X10_TEMP219 =
          (X10_TEMP4);
        
//#line 3761
enter =
          ((X10_TEMP219));
        
//#line 3762
final boolean X10_TEMP222 =
          (false);
        
//#line 3764
final boolean X10_TEMP6 =
          (X10_TEMP222);
        
//#line 3765
final boolean X10_TEMP225 =
          (X10_TEMP6);
        
//#line 3767
isNull =
          ((X10_TEMP225));
    }
    
    
//#line 3769
public Isect(final double t_,
                               final int enter_,
                               final boolean isNull_,
                               final Sphere prim_,
                               final Surface surf_) {
        
//#line 3769
super();
        
//#line 3770
final double X10_TEMP210 =
          (t_);
        
//#line 3772
t =
          ((X10_TEMP210));
        
//#line 3773
final boolean X10_TEMP213 =
          (isNull_);
        
//#line 3775
isNull =
          ((X10_TEMP213));
        
//#line 3776
final int X10_TEMP216 =
          (enter_);
        
//#line 3778
enter =
          ((X10_TEMP216));
        
//#line 3779
final Sphere X10_TEMP219 =
          (prim_);
        
//#line 3781
prim =
          ((X10_TEMP219));
        
//#line 3782
final Surface X10_TEMP222 =
          (surf_);
        
//#line 3784
surf =
          ((X10_TEMP222));
    }
}

class RayTracer
extends x10.
  lang.
  Object
{
    
//#line 3791
public Scene
      scene;
    
//#line 3792
public int
      lightCount;
    
//#line 3793
public int
      objCount;
    
//#line 3794
public x10.
      lang.
      GenericReferenceArray
      lights;
    
//#line 3795
public x10.
      lang.
      GenericReferenceArray
      prim;
    
//#line 3796
public View
      view;
    
//#line 3797
public int
      height;
    
//#line 3798
public int
      width;
    
//#line 3799
public x10.
      lang.
      IntReferenceArray
      datasizes;
    
//#line 3800
public long
      checksum;
    
//#line 3801
public x10.
      lang.
      LongReferenceArray
      checkSumArray;
    
//#line 3802
public int
      size_t;
    
//#line 3803
public int
      numobjects;
    
    
//#line 3806
public RayTracer() {
        
//#line 3806
super();
    }
}

class Scene
extends x10.
  lang.
  Object
{
    
//#line 3813
final public x10.
      lang.
      GenericReferenceArray
      lights;
    
//#line 3814
final public x10.
      lang.
      GenericReferenceArray
      objects;
    
//#line 3815
final public View
      view;
    
//#line 3818
public int
      lightCount;
    
//#line 3819
public int
      objectCount;
    
    
//#line 3822
public Scene(final View v) {
        
//#line 3822
super();
        
//#line 3823
final int X10_TEMP210 =
          (0);
        
//#line 3825
final int X10_TEMP5 =
          (X10_TEMP210);
        
//#line 3826
final int X10_TEMP213 =
          (Program0.
             _Program__Scene_maxLights);
        
//#line 3828
final int X10_TEMP2 =
          (X10_TEMP213);
        
//#line 3829
final int X10_TEMP216 =
          (1);
        
//#line 3831
final int X10_TEMP3 =
          (X10_TEMP216);
        
//#line 3832
final int X10_TEMP219 =
          (X10_TEMP2 -
             X10_TEMP3);
        
//#line 3834
final int X10_TEMP6 =
          (X10_TEMP219);
        
//#line 3835
final x10.
          lang.
          region X10_TEMP224 =
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
                  X10_TEMP5,
                  X10_TEMP6))));
        
//#line 3837
final x10.
          lang.
          region X10_TEMP7 =
          (x10.
            lang.
            region)
            ((X10_TEMP224));
        
//#line 3838
final x10.
          lang.
          place X10_TEMP227 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 3840
final x10.
          lang.
          place X10_TEMP8 =
          (X10_TEMP227);
        
//#line 3841
final x10.
          lang.
          dist X10_TEMP230 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                X10_TEMP7,
                X10_TEMP8)));
        
//#line 3843
x10.
          lang.
          dist d1 =
          (x10.
            lang.
            dist)
            ((X10_TEMP230));
        
//#line 3844
final x10.
          lang.
          GenericReferenceArray X10_TEMP233 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d1,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
        
//#line 3846
final x10.
          lang.
          GenericReferenceArray X10_TEMP11 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP233));
        
//#line 3847
final x10.
          lang.
          GenericReferenceArray X10_TEMP236 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP11));
        
//#line 3849
lights =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP236));
        
//#line 3850
final int X10_TEMP239 =
          (0);
        
//#line 3852
final int X10_TEMP16 =
          (X10_TEMP239);
        
//#line 3853
final int X10_TEMP242 =
          (Program0.
             _Program__Scene_maxObjects);
        
//#line 3855
final int X10_TEMP13 =
          (X10_TEMP242);
        
//#line 3856
final int X10_TEMP245 =
          (1);
        
//#line 3858
final int X10_TEMP14 =
          (X10_TEMP245);
        
//#line 3859
final int X10_TEMP248 =
          (X10_TEMP13 -
             X10_TEMP14);
        
//#line 3861
final int X10_TEMP17 =
          (X10_TEMP248);
        
//#line 3862
final x10.
          lang.
          region X10_TEMP253 =
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
                  X10_TEMP16,
                  X10_TEMP17))));
        
//#line 3864
final x10.
          lang.
          region X10_TEMP18 =
          (x10.
            lang.
            region)
            ((X10_TEMP253));
        
//#line 3865
final x10.
          lang.
          place X10_TEMP256 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 3867
final x10.
          lang.
          place X10_TEMP19 =
          (X10_TEMP256);
        
//#line 3868
final x10.
          lang.
          dist X10_TEMP259 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                X10_TEMP18,
                X10_TEMP19)));
        
//#line 3870
x10.
          lang.
          dist d2 =
          (x10.
            lang.
            dist)
            ((X10_TEMP259));
        
//#line 3871
final x10.
          lang.
          GenericReferenceArray X10_TEMP262 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d2,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
        
//#line 3873
final x10.
          lang.
          GenericReferenceArray X10_TEMP22 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP262));
        
//#line 3874
final x10.
          lang.
          GenericReferenceArray X10_TEMP265 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP22));
        
//#line 3876
objects =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP265));
        
//#line 3877
final View X10_TEMP268 =
          (v);
        
//#line 3879
view =
          ((X10_TEMP268));
        
//#line 3880
final int X10_TEMP271 =
          (0);
        
//#line 3882
final int X10_TEMP25 =
          (X10_TEMP271);
        
//#line 3883
final int X10_TEMP274 =
          (X10_TEMP25);
        
//#line 3885
lightCount =
          ((X10_TEMP274));
        
//#line 3886
final int X10_TEMP277 =
          (0);
        
//#line 3888
final int X10_TEMP27 =
          (X10_TEMP277);
        
//#line 3889
final int X10_TEMP280 =
          (X10_TEMP27);
        
//#line 3891
objectCount =
          ((X10_TEMP280));
    }
}

class Surface
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 3898
final public Vec
      color;
    
//#line 3899
final public double
      kd;
    
//#line 3900
final public double
      ks;
    
//#line 3901
final public double
      shine;
    
//#line 3902
final public double
      kt;
    
//#line 3903
final public double
      ior;
    
//#line 3904
final public boolean
      isNull;
    
    
//#line 3907
public Surface() {
        
//#line 3907
super();
        
//#line 3908
final int X10_TEMP210 =
          (1);
        
//#line 3910
int X10_TEMP5 =
          (X10_TEMP210);
        
//#line 3911
final int X10_TEMP213 =
          (0);
        
//#line 3913
int X10_TEMP6 =
          (X10_TEMP213);
        
//#line 3914
final int X10_TEMP216 =
          (0);
        
//#line 3916
int X10_TEMP7 =
          (X10_TEMP216);
        
//#line 3917
final boolean X10_TEMP219 =
          (false);
        
//#line 3919
boolean X10_TEMP8 =
          (X10_TEMP219);
        
//#line 3920
final Vec X10_TEMP226 =
          (new Vec(
             X10_TEMP5,
             X10_TEMP6,
             X10_TEMP7,
             X10_TEMP8));
        
//#line 3922
final Vec X10_TEMP10 =
          (X10_TEMP226);
        
//#line 3923
final Vec X10_TEMP229 =
          (X10_TEMP10);
        
//#line 3925
color =
          ((X10_TEMP229));
        
//#line 3926
final double X10_TEMP232 =
          (1.0);
        
//#line 3928
final double X10_TEMP12 =
          (X10_TEMP232);
        
//#line 3929
final double X10_TEMP235 =
          (X10_TEMP12);
        
//#line 3931
kd =
          ((X10_TEMP235));
        
//#line 3932
final double X10_TEMP238 =
          (0.0);
        
//#line 3934
final double X10_TEMP14 =
          (X10_TEMP238);
        
//#line 3935
final double X10_TEMP241 =
          (X10_TEMP14);
        
//#line 3937
ks =
          ((X10_TEMP241));
        
//#line 3938
final double X10_TEMP244 =
          (0.0);
        
//#line 3940
final double X10_TEMP16 =
          (X10_TEMP244);
        
//#line 3941
final double X10_TEMP247 =
          (X10_TEMP16);
        
//#line 3943
shine =
          ((X10_TEMP247));
        
//#line 3944
final double X10_TEMP250 =
          (0.0);
        
//#line 3946
final double X10_TEMP18 =
          (X10_TEMP250);
        
//#line 3947
final double X10_TEMP253 =
          (X10_TEMP18);
        
//#line 3949
kt =
          ((X10_TEMP253));
        
//#line 3950
final double X10_TEMP256 =
          (1.0);
        
//#line 3952
final double X10_TEMP20 =
          (X10_TEMP256);
        
//#line 3953
final double X10_TEMP259 =
          (X10_TEMP20);
        
//#line 3955
ior =
          ((X10_TEMP259));
        
//#line 3956
final boolean X10_TEMP262 =
          (false);
        
//#line 3958
final boolean X10_TEMP22 =
          (X10_TEMP262);
        
//#line 3959
final boolean X10_TEMP265 =
          (X10_TEMP22);
        
//#line 3961
isNull =
          ((X10_TEMP265));
    }
    
    
//#line 3963
public Surface(final double shine_,
                                 final double ks_,
                                 final double kt_,
                                 final Vec c_,
                                 final boolean isNull_) {
        
//#line 3963
super();
        
//#line 3964
final double X10_TEMP210 =
          (1.0);
        
//#line 3966
final double X10_TEMP2 =
          (X10_TEMP210);
        
//#line 3967
final double X10_TEMP213 =
          (X10_TEMP2);
        
//#line 3969
kd =
          ((X10_TEMP213));
        
//#line 3970
final double X10_TEMP216 =
          (ks_);
        
//#line 3972
ks =
          ((X10_TEMP216));
        
//#line 3973
final double X10_TEMP219 =
          (shine_);
        
//#line 3975
shine =
          ((X10_TEMP219));
        
//#line 3976
final double X10_TEMP222 =
          (kt_);
        
//#line 3978
kt =
          ((X10_TEMP222));
        
//#line 3979
final double X10_TEMP225 =
          (1.0);
        
//#line 3981
final double X10_TEMP7 =
          (X10_TEMP225);
        
//#line 3982
final double X10_TEMP228 =
          (X10_TEMP7);
        
//#line 3984
ior =
          ((X10_TEMP228));
        
//#line 3985
final Vec X10_TEMP231 =
          (c_);
        
//#line 3987
color =
          ((X10_TEMP231));
        
//#line 3988
final boolean X10_TEMP234 =
          (isNull_);
        
//#line 3990
isNull =
          ((X10_TEMP234));
    }
}

class View
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 3997
final public Vec
      from;
    
//#line 3998
final public Vec
      at;
    
//#line 3999
final public Vec
      up;
    
//#line 4000
final public double
      distance;
    
//#line 4001
final public double
      angle;
    
//#line 4002
final public double
      aspect;
    
    
//#line 4005
public View(final Vec from_,
                              final Vec at_,
                              final Vec up_,
                              final double dist_,
                              final double angle_,
                              final double aspect_) {
        
//#line 4005
super();
        
//#line 4006
final Vec X10_TEMP210 =
          (from_);
        
//#line 4008
from =
          ((X10_TEMP210));
        
//#line 4009
final Vec X10_TEMP213 =
          (at_);
        
//#line 4011
at =
          ((X10_TEMP213));
        
//#line 4012
final Vec X10_TEMP216 =
          (up_);
        
//#line 4014
up =
          ((X10_TEMP216));
        
//#line 4015
final double X10_TEMP219 =
          (dist_);
        
//#line 4017
distance =
          ((X10_TEMP219));
        
//#line 4018
final double X10_TEMP222 =
          (angle_);
        
//#line 4020
angle =
          ((X10_TEMP222));
        
//#line 4021
final double X10_TEMP225 =
          (aspect_);
        
//#line 4023
aspect =
          ((X10_TEMP225));
    }
}

class Envelope
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 4030
final public int
      i;
    
//#line 4031
final public x10.
      lang.
      GenericReferenceArray
      a;
    
    
//#line 4034
public Envelope(final int i1,
                                  final x10.
                                    lang.
                                    GenericReferenceArray a1) {
        
//#line 4034
super();
        
//#line 4035
final int X10_TEMP210 =
          (i1);
        
//#line 4037
i =
          ((X10_TEMP210));
        
//#line 4038
final x10.
          lang.
          GenericReferenceArray X10_TEMP213 =
          (x10.
            lang.
            GenericReferenceArray)
            ((a1));
        
//#line 4040
a =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP213));
    }
}

class Envelope2
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 4047
final public int
      i;
    
//#line 4048
final public x10.
      lang.
      GenericReferenceArray
      a;
    
    
//#line 4051
public Envelope2(final int i1,
                                   final x10.
                                     lang.
                                     GenericReferenceArray a1) {
        
//#line 4051
super();
        
//#line 4052
final int X10_TEMP210 =
          (i1);
        
//#line 4054
i =
          ((X10_TEMP210));
        
//#line 4055
final x10.
          lang.
          GenericReferenceArray X10_TEMP213 =
          (x10.
            lang.
            GenericReferenceArray)
            ((a1));
        
//#line 4057
a =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP213));
    }
}

class Timer
extends x10.
  lang.
  Object
{
    
//#line 4064
final public x10.
      lang.
      DoubleReferenceArray
      start_time;
    
//#line 4065
final public x10.
      lang.
      DoubleReferenceArray
      elapsed_time;
    
//#line 4066
final public x10.
      lang.
      DoubleReferenceArray
      total_time;
    
    
//#line 4069
public Timer() {
        
//#line 4069
super();
        
//#line 4070
final int X10_TEMP210 =
          (0);
        
//#line 4072
int i =
          (X10_TEMP210);
        
//#line 4073
final int X10_TEMP213 =
          (0);
        
//#line 4075
final int X10_TEMP4 =
          (X10_TEMP213);
        
//#line 4076
final int X10_TEMP216 =
          (Program0.
             _Program__Timer_max_counters);
        
//#line 4078
final int X10_TEMP5 =
          (X10_TEMP216);
        
//#line 4079
final x10.
          lang.
          region X10_TEMP221 =
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
        
//#line 4081
final x10.
          lang.
          region X10_TEMP6 =
          (x10.
            lang.
            region)
            ((X10_TEMP221));
        
//#line 4082
final x10.
          lang.
          place X10_TEMP224 =
          (x10.
             lang.
             place.
             FIRST_PLACE);
        
//#line 4084
final x10.
          lang.
          place X10_TEMP7 =
          (X10_TEMP224);
        
//#line 4085
final x10.
          lang.
          dist X10_TEMP227 =
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
        
//#line 4087
final x10.
          lang.
          dist d =
          (x10.
            lang.
            dist)
            ((X10_TEMP227));
        
//#line 4088
final x10.
          lang.
          DoubleReferenceArray X10_TEMP230 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 4090
final x10.
          lang.
          DoubleReferenceArray X10_TEMP10 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP230));
        
//#line 4091
final x10.
          lang.
          DoubleReferenceArray X10_TEMP233 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP10));
        
//#line 4093
start_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP233));
        
//#line 4094
final x10.
          lang.
          DoubleReferenceArray X10_TEMP236 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 4096
final x10.
          lang.
          DoubleReferenceArray X10_TEMP12 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP236));
        
//#line 4097
final x10.
          lang.
          DoubleReferenceArray X10_TEMP239 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP12));
        
//#line 4099
elapsed_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP239));
        
//#line 4100
final x10.
          lang.
          DoubleReferenceArray X10_TEMP242 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 4102
final x10.
          lang.
          DoubleReferenceArray X10_TEMP14 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP242));
        
//#line 4103
final x10.
          lang.
          DoubleReferenceArray X10_TEMP245 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP14));
        
//#line 4105
total_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP245));
        
//#line 4106
final int X10_TEMP248 =
          (Program0.
             _Program__Timer_max_counters);
        
//#line 4108
final int X10_TEMP15 =
          (X10_TEMP248);
        
//#line 4109
boolean X10_TEMP19 =
          (i <
             X10_TEMP15);
        
//#line 4110
boolean X10_TEMP253 =
          X10_TEMP19;
        
//#line 4111
while (X10_TEMP253) {
            
//#line 4112
final int X10_TEMP255 =
              (0);
            
//#line 4114
final double X10_TEMP23 =
              (X10_TEMP255);
            
//#line 4115
final double X10_TEMP258 =
              (X10_TEMP23);
            
//#line 4117
final double X10_TEMP24 =
              (X10_TEMP258);
            
//#line 4118
final double X10_TEMP262 =
              (X10_TEMP24);
            
//#line 4120
final double X10_TEMP265 =
              (X10_TEMP262);
            
//#line 4121
/* template:array_set { */(start_time).set((X10_TEMP265),i)/* } */;
            
//#line 4122
final int X10_TEMP267 =
              (0);
            
//#line 4124
final double X10_TEMP28 =
              (X10_TEMP267);
            
//#line 4125
final double X10_TEMP270 =
              (X10_TEMP28);
            
//#line 4127
final double X10_TEMP29 =
              (X10_TEMP270);
            
//#line 4128
final double X10_TEMP274 =
              (X10_TEMP29);
            
//#line 4130
final double X10_TEMP277 =
              (X10_TEMP274);
            
//#line 4131
/* template:array_set { */(elapsed_time).set((X10_TEMP277),i)/* } */;
            
//#line 4132
final int X10_TEMP279 =
              (0);
            
//#line 4134
final double X10_TEMP33 =
              (X10_TEMP279);
            
//#line 4135
final double X10_TEMP282 =
              (X10_TEMP33);
            
//#line 4137
final double X10_TEMP34 =
              (X10_TEMP282);
            
//#line 4138
final double X10_TEMP286 =
              (X10_TEMP34);
            
//#line 4140
final double X10_TEMP289 =
              (X10_TEMP286);
            
//#line 4141
/* template:array_set { */(total_time).set((X10_TEMP289),i)/* } */;
            
//#line 4142
final int X10_TEMP291 =
              (i);
            
//#line 4144
final int X10_TEMP35 =
              (X10_TEMP291);
            
//#line 4145
final int X10_TEMP36 =
              (1);
            
//#line 4146
final int X10_TEMP295 =
              (i +
                 X10_TEMP36);
            
//#line 4147
i =
              ((X10_TEMP295));
            
//#line 4148
final int X10_TEMP297 =
              (Program0.
                 _Program__Timer_max_counters);
            
//#line 4150
final int X10_TEMP17 =
              (X10_TEMP297);
            
//#line 4151
final boolean X10_TEMP300 =
              (i <
                 X10_TEMP17);
            
//#line 4152
X10_TEMP19 =
              ((X10_TEMP300));
            
//#line 4153
X10_TEMP253 =
              X10_TEMP19;
        }
    }
}
