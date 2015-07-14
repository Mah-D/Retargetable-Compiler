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
    
    
//#line 15
public static void
                  runMain(
                  ) {
        
//#line 16
Program0.
                      Program_runMain();
    }
    
    
//#line 18
public static int
                  _Program__RayTracer_alpha_init(
                  ) {
        
//#line 20
final int X10_TEMP217 =
          (Program0.
             Program__RayTracer_alpha_init());
        
//#line 21
return X10_TEMP217;
    }
    
    
//#line 23
public static Vec
                  _Program__RayTracer_voidVec_init(
                  ) {
        
//#line 25
final Vec X10_TEMP217 =
          (Program0.
             Program__RayTracer_voidVec_init());
        
//#line 26
return X10_TEMP217;
    }
    
    
//#line 28
public static int
                  _Program__Scene_maxObjects_init(
                  ) {
        
//#line 30
final int X10_TEMP217 =
          (Program0.
             Program__Scene_maxObjects_init());
        
//#line 31
return X10_TEMP217;
    }
    
    
//#line 33
public static int
                  _Program__Scene_maxLights_init(
                  ) {
        
//#line 35
final int X10_TEMP217 =
          (Program0.
             Program__Scene_maxLights_init());
        
//#line 36
return X10_TEMP217;
    }
    
    
//#line 38
public static java.
                  lang.
                  String
                  Program_Envelope2_toString(
                  final Envelope2 X10_TEMP0) {
        
//#line 39
final java.
          lang.
          String X10_TEMP217 =
          ("");
        
//#line 41
final java.
          lang.
          String X10_TEMP2 =
          (X10_TEMP217);
        
//#line 42
return X10_TEMP2;
    }
    
    
//#line 44
public static java.
                  lang.
                  String
                  Program_Envelope_toString(
                  final Envelope X10_TEMP0) {
        
//#line 45
final java.
          lang.
          String X10_TEMP217 =
          ("");
        
//#line 47
final java.
          lang.
          String X10_TEMP2 =
          (X10_TEMP217);
        
//#line 48
return X10_TEMP2;
    }
    
    
//#line 50
public static java.
                  lang.
                  String
                  Program_Interval_toString(
                  final Interval X10_TEMP0) {
        
//#line 51
final int X10_TEMP217 =
          (X10_TEMP0.
             number);
        
//#line 53
final int X10_TEMP1 =
          (X10_TEMP217);
        
//#line 54
final java.
          lang.
          String X10_TEMP220 =
          (" ");
        
//#line 56
final java.
          lang.
          String X10_TEMP2 =
          (X10_TEMP220);
        
//#line 57
final java.
          lang.
          String X10_TEMP223 =
          (X10_TEMP1 +
           X10_TEMP2);
        
//#line 59
final java.
          lang.
          String X10_TEMP3 =
          (X10_TEMP223);
        
//#line 60
final int X10_TEMP226 =
          (X10_TEMP0.
             width);
        
//#line 62
final int X10_TEMP4 =
          (X10_TEMP226);
        
//#line 63
final java.
          lang.
          String X10_TEMP229 =
          (X10_TEMP3 +
           X10_TEMP4);
        
//#line 65
final java.
          lang.
          String X10_TEMP5 =
          (X10_TEMP229);
        
//#line 66
final java.
          lang.
          String X10_TEMP232 =
          (" ");
        
//#line 68
final java.
          lang.
          String X10_TEMP6 =
          (X10_TEMP232);
        
//#line 69
final java.
          lang.
          String X10_TEMP235 =
          (X10_TEMP5 +
           X10_TEMP6);
        
//#line 71
final java.
          lang.
          String X10_TEMP7 =
          (X10_TEMP235);
        
//#line 72
final int X10_TEMP238 =
          (X10_TEMP0.
             height);
        
//#line 74
final int X10_TEMP8 =
          (X10_TEMP238);
        
//#line 75
final java.
          lang.
          String X10_TEMP241 =
          (X10_TEMP7 +
           X10_TEMP8);
        
//#line 77
final java.
          lang.
          String X10_TEMP9 =
          (X10_TEMP241);
        
//#line 78
final java.
          lang.
          String X10_TEMP244 =
          (" ");
        
//#line 80
final java.
          lang.
          String X10_TEMP10 =
          (X10_TEMP244);
        
//#line 81
final java.
          lang.
          String X10_TEMP247 =
          (X10_TEMP9 +
           X10_TEMP10);
        
//#line 83
final java.
          lang.
          String X10_TEMP11 =
          (X10_TEMP247);
        
//#line 84
final int X10_TEMP250 =
          (X10_TEMP0.
             yfrom);
        
//#line 86
final int X10_TEMP12 =
          (X10_TEMP250);
        
//#line 87
final java.
          lang.
          String X10_TEMP253 =
          (X10_TEMP11 +
           X10_TEMP12);
        
//#line 89
final java.
          lang.
          String X10_TEMP13 =
          (X10_TEMP253);
        
//#line 90
final java.
          lang.
          String X10_TEMP256 =
          (" ");
        
//#line 92
final java.
          lang.
          String X10_TEMP14 =
          (X10_TEMP256);
        
//#line 93
final java.
          lang.
          String X10_TEMP259 =
          (X10_TEMP13 +
           X10_TEMP14);
        
//#line 95
final java.
          lang.
          String X10_TEMP15 =
          (X10_TEMP259);
        
//#line 96
final int X10_TEMP262 =
          (X10_TEMP0.
             yto);
        
//#line 98
final int X10_TEMP16 =
          (X10_TEMP262);
        
//#line 99
final java.
          lang.
          String X10_TEMP265 =
          (X10_TEMP15 +
           X10_TEMP16);
        
//#line 101
final java.
          lang.
          String X10_TEMP17 =
          (X10_TEMP265);
        
//#line 102
final java.
          lang.
          String X10_TEMP268 =
          (" ");
        
//#line 104
final java.
          lang.
          String X10_TEMP18 =
          (X10_TEMP268);
        
//#line 105
final java.
          lang.
          String X10_TEMP271 =
          (X10_TEMP17 +
           X10_TEMP18);
        
//#line 107
final java.
          lang.
          String X10_TEMP19 =
          (X10_TEMP271);
        
//#line 108
final int X10_TEMP274 =
          (X10_TEMP0.
             total);
        
//#line 110
final int X10_TEMP20 =
          (X10_TEMP274);
        
//#line 111
final java.
          lang.
          String X10_TEMP277 =
          (X10_TEMP19 +
           X10_TEMP20);
        
//#line 113
final java.
          lang.
          String X10_TEMP22 =
          (X10_TEMP277);
        
//#line 114
return X10_TEMP22;
    }
    
    
//#line 116
public static java.
                   lang.
                   String
                   Program_Light_toString(
                   final Light X10_TEMP0) {
        
//#line 117
final Vec X10_TEMP217 =
          (X10_TEMP0.
             pos);
        
//#line 119
final Vec X10_TEMP1 =
          (X10_TEMP217);
        
//#line 120
final java.
          lang.
          String X10_TEMP220 =
          (" ");
        
//#line 122
final java.
          lang.
          String X10_TEMP2 =
          (X10_TEMP220);
        
//#line 123
final java.
          lang.
          String X10_TEMP224 =
          (Program0.
             Program_Vec_toString(
             X10_TEMP1));
        
//#line 125
final java.
          lang.
          String X10_TEMP3 =
          (X10_TEMP224);
        
//#line 126
final java.
          lang.
          String X10_TEMP227 =
          (X10_TEMP3 +
           X10_TEMP2);
        
//#line 128
final java.
          lang.
          String X10_TEMP4 =
          (X10_TEMP227);
        
//#line 129
final double X10_TEMP230 =
          (X10_TEMP0.
             brightness);
        
//#line 131
final double X10_TEMP5 =
          (X10_TEMP230);
        
//#line 132
final java.
          lang.
          String X10_TEMP233 =
          (X10_TEMP4 +
           X10_TEMP5);
        
//#line 134
final java.
          lang.
          String X10_TEMP7 =
          (X10_TEMP233);
        
//#line 135
return X10_TEMP7;
    }
    
    
//#line 137
public static void
                   Program_runMain(
                   ) {
        
//#line 138
final RayTracer X10_TEMP217 =
          (new RayTracer(
             ));
        
//#line 140
final RayTracer X10_TEMP1 =
          (X10_TEMP217);
        
//#line 141
Program0.
                       Program_RayTracer_run(
                       X10_TEMP1);
    }
    
    
//#line 143
public static int
                   Program__RayTracer_alpha_init(
                   ) {
        
//#line 144
final int X10_TEMP217 =
          (255);
        
//#line 146
final int X10_TEMP1 =
          (X10_TEMP217);
        
//#line 147
final int X10_TEMP220 =
          (24);
        
//#line 149
final int X10_TEMP2 =
          (X10_TEMP220);
        
//#line 150
final int X10_TEMP223 =
          (X10_TEMP1 <<
             X10_TEMP2);
        
//#line 152
final int X10_TEMP4 =
          (X10_TEMP223);
        
//#line 153
return X10_TEMP4;
    }
    
    
//#line 155
public static Vec
                   Program__RayTracer_voidVec_init(
                   ) {
        
//#line 156
final Vec X10_TEMP217 =
          (new Vec(
             ));
        
//#line 158
final Vec X10_TEMP2 =
          (X10_TEMP217);
        
//#line 159
return X10_TEMP2;
    }
    
    
//#line 161
public static void
                   Program_RayTracer_JGFsetsize(
                   final RayTracer X10_TEMP0,
                   final int size_t) {
        
//#line 162
int X10_TEMP1 =
          (size_t);
        
//#line 163
final int X10_TEMP218 =
          (0);
        
//#line 165
final long X10_TEMP4 =
          (X10_TEMP218);
        
//#line 166
final long X10_TEMP221 =
          (X10_TEMP4);
        
//#line 168
final long X10_TEMP5 =
          (X10_TEMP221);
        
//#line 169
final long X10_TEMP224 =
          (X10_TEMP5);
        
//#line 171
final long X10_TEMP227 =
          (X10_TEMP224);
        
//#line 172
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.checksum =
          ((X10_TEMP227));
        
//#line 173
final int X10_TEMP229 =
          (0);
        
//#line 175
final int X10_TEMP8 =
          (X10_TEMP229);
        
//#line 176
final int X10_TEMP232 =
          (1);
        
//#line 178
final int X10_TEMP9 =
          (X10_TEMP232);
        
//#line 179
final x10.
          lang.
          region X10_TEMP237 =
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
                  X10_TEMP8,
                  X10_TEMP9))));
        
//#line 181
final x10.
          lang.
          region X10_TEMP10 =
          (x10.
            lang.
            region)
            ((X10_TEMP237));
        
//#line 182
final x10.
          lang.
          place X10_TEMP240 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 184
final x10.
          lang.
          place X10_TEMP11 =
          (X10_TEMP240);
        
//#line 185
final x10.
          lang.
          dist X10_TEMP243 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                X10_TEMP10,
                X10_TEMP11)));
        
//#line 187
x10.
          lang.
          dist d1 =
          (x10.
            lang.
            dist)
            ((X10_TEMP243));
        
//#line 188
final x10.
          lang.
          IntReferenceArray X10_TEMP246 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(d1,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 190
final x10.
          lang.
          IntReferenceArray X10_TEMP15 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP246));
        
//#line 191
final x10.
          lang.
          IntReferenceArray X10_TEMP249 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP15));
        
//#line 193
final x10.
          lang.
          IntReferenceArray X10_TEMP16 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP249));
        
//#line 194
final x10.
          lang.
          IntReferenceArray X10_TEMP252 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP16));
        
//#line 196
final x10.
          lang.
          IntReferenceArray X10_TEMP255 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP252));
        
//#line 197
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.datasizes =
          ((X10_TEMP255));
        
//#line 198
final x10.
          lang.
          IntReferenceArray X10_TEMP257 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.datasizes));
        
//#line 200
final x10.
          lang.
          IntReferenceArray X10_TEMP17 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP257));
        
//#line 201
final int X10_TEMP260 =
          (0);
        
//#line 203
final int X10_TEMP19 =
          (X10_TEMP260);
        
//#line 204
final int X10_TEMP263 =
          (20);
        
//#line 206
final int X10_TEMP22 =
          (X10_TEMP263);
        
//#line 207
final int X10_TEMP266 =
          (X10_TEMP22);
        
//#line 209
final int X10_TEMP23 =
          (X10_TEMP266);
        
//#line 210
final int X10_TEMP270 =
          (X10_TEMP23);
        
//#line 212
final int X10_TEMP273 =
          (X10_TEMP270);
        
//#line 213
/* template:array_set { */(X10_TEMP17).set((X10_TEMP273),X10_TEMP19)/* } */;
        
//#line 214
final x10.
          lang.
          IntReferenceArray X10_TEMP275 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.datasizes));
        
//#line 216
final x10.
          lang.
          IntReferenceArray X10_TEMP24 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP275));
        
//#line 217
final int X10_TEMP278 =
          (1);
        
//#line 219
final int X10_TEMP26 =
          (X10_TEMP278);
        
//#line 220
final int X10_TEMP281 =
          (500);
        
//#line 222
final int X10_TEMP29 =
          (X10_TEMP281);
        
//#line 223
final int X10_TEMP284 =
          (X10_TEMP29);
        
//#line 225
final int X10_TEMP30 =
          (X10_TEMP284);
        
//#line 226
final int X10_TEMP288 =
          (X10_TEMP30);
        
//#line 228
final int X10_TEMP291 =
          (X10_TEMP288);
        
//#line 229
/* template:array_set { */(X10_TEMP24).set((X10_TEMP291),X10_TEMP26)/* } */;
        
//#line 230
final int X10_TEMP293 =
          (X10_TEMP1);
        
//#line 232
final int X10_TEMP33 =
          (X10_TEMP293);
        
//#line 233
final int X10_TEMP296 =
          (X10_TEMP33);
        
//#line 235
final int X10_TEMP299 =
          (X10_TEMP296);
        
//#line 236
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.size_t =
          ((X10_TEMP299));
    }
    
    
//#line 238
public static void
                   Program_RayTracer_JGFinitialise(
                   final RayTracer X10_TEMP0) {
        
//#line 239
final x10.
          lang.
          IntReferenceArray X10_TEMP217 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.datasizes));
        
//#line 241
final x10.
          lang.
          IntReferenceArray X10_TEMP1 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP217));
        
//#line 242
final int X10_TEMP220 =
          (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.size_t);
        
//#line 244
final int X10_TEMP3 =
          (X10_TEMP220);
        
//#line 245
final int X10_TEMP224 =
          (/* template:array_get { */((X10_TEMP1).get(X10_TEMP3))/* } */);
        
//#line 247
final int X10_TEMP6 =
          (X10_TEMP224);
        
//#line 248
final int X10_TEMP227 =
          (X10_TEMP6);
        
//#line 250
final int X10_TEMP7 =
          (X10_TEMP227);
        
//#line 251
final int X10_TEMP230 =
          (X10_TEMP7);
        
//#line 253
final int X10_TEMP233 =
          (X10_TEMP230);
        
//#line 254
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.width =
          ((X10_TEMP233));
        
//#line 255
final x10.
          lang.
          IntReferenceArray X10_TEMP235 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.datasizes));
        
//#line 257
final x10.
          lang.
          IntReferenceArray X10_TEMP8 =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP235));
        
//#line 258
final int X10_TEMP238 =
          (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.size_t);
        
//#line 260
final int X10_TEMP10 =
          (X10_TEMP238);
        
//#line 261
final int X10_TEMP242 =
          (/* template:array_get { */((X10_TEMP8).get(X10_TEMP10))/* } */);
        
//#line 263
final int X10_TEMP13 =
          (X10_TEMP242);
        
//#line 264
final int X10_TEMP245 =
          (X10_TEMP13);
        
//#line 266
final int X10_TEMP14 =
          (X10_TEMP245);
        
//#line 267
final int X10_TEMP248 =
          (X10_TEMP14);
        
//#line 269
final int X10_TEMP251 =
          (X10_TEMP248);
        
//#line 270
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.height =
          ((X10_TEMP251));
        
//#line 271
final Scene X10_TEMP254 =
          (Program0.
             Program_RayTracer_createScene(
             X10_TEMP0));
        
//#line 273
final Scene X10_TEMP17 =
          (X10_TEMP254);
        
//#line 274
final Scene X10_TEMP257 =
          (X10_TEMP17);
        
//#line 276
final Scene X10_TEMP18 =
          (X10_TEMP257);
        
//#line 277
final Scene X10_TEMP260 =
          (X10_TEMP18);
        
//#line 279
final Scene X10_TEMP263 =
          (X10_TEMP260);
        
//#line 280
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.scene =
          ((X10_TEMP263));
        
//#line 281
final Scene X10_TEMP265 =
          (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.scene);
        
//#line 283
final Scene X10_TEMP20 =
          (X10_TEMP265);
        
//#line 284
Program0.
                       Program_RayTracer_setScene(
                       X10_TEMP0,
                       X10_TEMP20);
        
//#line 285
final Scene X10_TEMP270 =
          (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.scene);
        
//#line 287
final Scene X10_TEMP21 =
          (X10_TEMP270);
        
//#line 288
final int X10_TEMP274 =
          (Program0.
             Program_Scene_getObjects(
             X10_TEMP21));
        
//#line 290
final int X10_TEMP24 =
          (X10_TEMP274);
        
//#line 291
final int X10_TEMP277 =
          (X10_TEMP24);
        
//#line 293
final int X10_TEMP25 =
          (X10_TEMP277);
        
//#line 294
final int X10_TEMP280 =
          (X10_TEMP25);
        
//#line 296
final int X10_TEMP283 =
          (X10_TEMP280);
        
//#line 297
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.numobjects =
          ((X10_TEMP283));
    }
    
    
//#line 299
public static void
                   Program_RayTracer_JGFapplication(
                   final RayTracer X10_TEMP0) {
        
//#line 300
final int X10_TEMP217 =
          (0);
        
//#line 302
int X10_TEMP7 =
          (X10_TEMP217);
        
//#line 303
final int X10_TEMP220 =
          (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.width);
        
//#line 305
int X10_TEMP8 =
          (X10_TEMP220);
        
//#line 306
final int X10_TEMP223 =
          (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.height);
        
//#line 308
int X10_TEMP9 =
          (X10_TEMP223);
        
//#line 309
final int X10_TEMP226 =
          (0);
        
//#line 311
int X10_TEMP10 =
          (X10_TEMP226);
        
//#line 312
final int X10_TEMP229 =
          (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.height);
        
//#line 314
int X10_TEMP11 =
          (X10_TEMP229);
        
//#line 315
final int X10_TEMP232 =
          (1);
        
//#line 317
int X10_TEMP12 =
          (X10_TEMP232);
        
//#line 318
final Interval X10_TEMP241 =
          (new Interval(
             X10_TEMP7,
             X10_TEMP8,
             X10_TEMP9,
             X10_TEMP10,
             X10_TEMP11,
             X10_TEMP12));
        
//#line 320
Interval interval =
          (X10_TEMP241);
        
//#line 321
Program0.
                       Program_RayTracer_render(
                       X10_TEMP0,
                       interval);
    }
    
    
//#line 323
public static void
                   Program_RayTracer_JGFvalidate(
                   final RayTracer X10_TEMP0) {
        
//#line 324
final int X10_TEMP217 =
          (0);
        
//#line 326
final int X10_TEMP3 =
          (X10_TEMP217);
        
//#line 327
final int X10_TEMP220 =
          (1);
        
//#line 329
final int X10_TEMP4 =
          (X10_TEMP220);
        
//#line 330
final x10.
          lang.
          region X10_TEMP225 =
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
        
//#line 332
final x10.
          lang.
          region X10_TEMP5 =
          (x10.
            lang.
            region)
            ((X10_TEMP225));
        
//#line 333
final x10.
          lang.
          place X10_TEMP228 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 335
final x10.
          lang.
          place X10_TEMP6 =
          (X10_TEMP228);
        
//#line 336
final x10.
          lang.
          dist X10_TEMP231 =
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
        
//#line 338
x10.
          lang.
          dist d1 =
          (x10.
            lang.
            dist)
            ((X10_TEMP231));
        
//#line 339
final x10.
          lang.
          LongReferenceArray X10_TEMP234 =
          (x10.
            lang.
            LongReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.LongArray(d1,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 341
x10.
          lang.
          LongReferenceArray refval =
          (x10.
            lang.
            LongReferenceArray)
            ((X10_TEMP234));
        
//#line 342
final int X10_TEMP237 =
          (0);
        
//#line 344
final int X10_TEMP10 =
          (X10_TEMP237);
        
//#line 345
final int X10_TEMP240 =
          (51428);
        
//#line 347
final long X10_TEMP13 =
          (X10_TEMP240);
        
//#line 348
final long X10_TEMP243 =
          (X10_TEMP13);
        
//#line 350
final long X10_TEMP14 =
          (X10_TEMP243);
        
//#line 351
final long X10_TEMP247 =
          (X10_TEMP14);
        
//#line 353
final long X10_TEMP250 =
          (X10_TEMP247);
        
//#line 354
/* template:array_set { */(refval).set((X10_TEMP250),X10_TEMP10)/* } */;
        
//#line 355
final int X10_TEMP252 =
          (1);
        
//#line 357
final int X10_TEMP16 =
          (X10_TEMP252);
        
//#line 358
final int X10_TEMP255 =
          (29827635);
        
//#line 360
final long X10_TEMP19 =
          (X10_TEMP255);
        
//#line 361
final long X10_TEMP258 =
          (X10_TEMP19);
        
//#line 363
final long X10_TEMP20 =
          (X10_TEMP258);
        
//#line 364
final long X10_TEMP262 =
          (X10_TEMP20);
        
//#line 366
final long X10_TEMP265 =
          (X10_TEMP262);
        
//#line 367
/* template:array_set { */(refval).set((X10_TEMP265),X10_TEMP16)/* } */;
        
//#line 368
final long X10_TEMP267 =
          (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.checksum);
        
//#line 370
final long X10_TEMP23 =
          (X10_TEMP267);
        
//#line 371
final int X10_TEMP270 =
          (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.size_t);
        
//#line 373
final int X10_TEMP22 =
          (X10_TEMP270);
        
//#line 374
final long X10_TEMP274 =
          (/* template:array_get { */((refval).get(X10_TEMP22))/* } */);
        
//#line 376
final long X10_TEMP24 =
          (X10_TEMP274);
        
//#line 377
final long X10_TEMP277 =
          (X10_TEMP23 -
             X10_TEMP24);
        
//#line 379
long dev =
          (X10_TEMP277);
        
//#line 380
final int X10_TEMP280 =
          (0);
        
//#line 382
final int X10_TEMP26 =
          (X10_TEMP280);
        
//#line 383
final boolean X10_TEMP28 =
          (dev !=
             X10_TEMP26);
        
//#line 384
if (X10_TEMP28) {
            
//#line 385
final java.
              lang.
              String X10_TEMP285 =
              ("Validation failed");
            
//#line 387
final java.
              lang.
              String X10_TEMP30 =
              (X10_TEMP285);
            
//#line 388
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println(X10_TEMP30);
            
//#line 389
final java.
              lang.
              String X10_TEMP289 =
              ("Pixel checksum = ");
            
//#line 391
final java.
              lang.
              String X10_TEMP31 =
              (X10_TEMP289);
            
//#line 392
final long X10_TEMP292 =
              (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.checksum);
            
//#line 394
final long X10_TEMP32 =
              (X10_TEMP292);
            
//#line 395
final java.
              lang.
              String X10_TEMP295 =
              (X10_TEMP31 +
               X10_TEMP32);
            
//#line 397
final java.
              lang.
              String X10_TEMP34 =
              (X10_TEMP295);
            
//#line 398
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println(X10_TEMP34);
            
//#line 399
final java.
              lang.
              String X10_TEMP299 =
              ("Reference value = ");
            
//#line 401
final java.
              lang.
              String X10_TEMP37 =
              (X10_TEMP299);
            
//#line 402
final int X10_TEMP302 =
              (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.size_t);
            
//#line 404
final int X10_TEMP36 =
              (X10_TEMP302);
            
//#line 405
final long X10_TEMP306 =
              (/* template:array_get { */((refval).get(X10_TEMP36))/* } */);
            
//#line 407
final long X10_TEMP38 =
              (X10_TEMP306);
            
//#line 408
final java.
              lang.
              String X10_TEMP309 =
              (X10_TEMP37 +
               X10_TEMP38);
            
//#line 410
final java.
              lang.
              String X10_TEMP40 =
              (X10_TEMP309);
            
//#line 411
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println(X10_TEMP40);
            
//#line 412
final java.
              lang.
              String X10_TEMP313 =
              ("Validation failed");
            
//#line 414
final java.
              lang.
              String X10_TEMP42 =
              (X10_TEMP313);
            
//#line 415
throw new java.
              lang.
              RuntimeException(
              X10_TEMP42);
        }
    }
    
    
//#line 418
public static void
                   Program_RayTracer_JGFtidyup(
                   final RayTracer X10_TEMP0) {
        
    }
    
    
//#line 420
public static void
                   Program_RayTracer_run(
                   final RayTracer X10_TEMP0) {
        
//#line 421
final int X10_TEMP217 =
          (0);
        
//#line 423
final int X10_TEMP2 =
          (X10_TEMP217);
        
//#line 424
Program0.
                       Program_RayTracer_JGFsetsize(
                       X10_TEMP0,
                       X10_TEMP2);
        
//#line 425
Program0.
                       Program_RayTracer_JGFinitialise(
                       X10_TEMP0);
        
//#line 426
Program0.
                       Program_RayTracer_JGFapplication(
                       X10_TEMP0);
        
//#line 427
Program0.
                       Program_RayTracer_JGFvalidate(
                       X10_TEMP0);
        
//#line 428
Program0.
                       Program_RayTracer_JGFtidyup(
                       X10_TEMP0);
    }
    
    
//#line 430
public static Scene
                   Program_RayTracer_createScene(
                   final RayTracer X10_TEMP0) {
        
//#line 431
final int X10_TEMP217 =
          (0);
        
//#line 433
final int x =
          (X10_TEMP217);
        
//#line 434
final int X10_TEMP220 =
          (0);
        
//#line 436
final int y =
          (X10_TEMP220);
        
//#line 437
final int X10_TEMP223 =
          (20);
        
//#line 439
int X10_TEMP9 =
          (X10_TEMP223);
        
//#line 440
final int X10_TEMP226 =
          (30);
        
//#line 442
final int X10_TEMP5 =
          (X10_TEMP226);
        
//#line 443
final int X10_TEMP6 =
          (0);
        
//#line 444
final int X10_TEMP230 =
          (X10_TEMP6 -
             X10_TEMP5);
        
//#line 446
int X10_TEMP10 =
          (X10_TEMP230);
        
//#line 447
final boolean X10_TEMP233 =
          (false);
        
//#line 449
boolean X10_TEMP11 =
          (X10_TEMP233);
        
//#line 450
final Vec X10_TEMP240 =
          (new Vec(
             x,
             X10_TEMP9,
             X10_TEMP10,
             X10_TEMP11));
        
//#line 452
Vec X10_TEMP36 =
          (X10_TEMP240);
        
//#line 453
final int X10_TEMP243 =
          (0);
        
//#line 455
int X10_TEMP17 =
          (X10_TEMP243);
        
//#line 456
final boolean X10_TEMP246 =
          (false);
        
//#line 458
boolean X10_TEMP18 =
          (X10_TEMP246);
        
//#line 459
final Vec X10_TEMP253 =
          (new Vec(
             x,
             y,
             X10_TEMP17,
             X10_TEMP18));
        
//#line 461
Vec X10_TEMP37 =
          (X10_TEMP253);
        
//#line 462
final int X10_TEMP256 =
          (0);
        
//#line 464
int X10_TEMP24 =
          (X10_TEMP256);
        
//#line 465
final int X10_TEMP259 =
          (1);
        
//#line 467
int X10_TEMP25 =
          (X10_TEMP259);
        
//#line 468
final int X10_TEMP262 =
          (0);
        
//#line 470
int X10_TEMP26 =
          (X10_TEMP262);
        
//#line 471
final boolean X10_TEMP265 =
          (false);
        
//#line 473
boolean X10_TEMP27 =
          (X10_TEMP265);
        
//#line 474
final Vec X10_TEMP272 =
          (new Vec(
             X10_TEMP24,
             X10_TEMP25,
             X10_TEMP26,
             X10_TEMP27));
        
//#line 476
Vec X10_TEMP38 =
          (X10_TEMP272);
        
//#line 477
final double X10_TEMP275 =
          (1.0);
        
//#line 479
double X10_TEMP39 =
          (X10_TEMP275);
        
//#line 480
final double X10_TEMP278 =
          (35.0);
        
//#line 482
final double X10_TEMP30 =
          (X10_TEMP278);
        
//#line 483
final double X10_TEMP281 =
          (3.14159265);
        
//#line 485
final double X10_TEMP31 =
          (X10_TEMP281);
        
//#line 486
final double X10_TEMP284 =
          (X10_TEMP30 *
             X10_TEMP31);
        
//#line 488
final double X10_TEMP32 =
          (X10_TEMP284);
        
//#line 489
final double X10_TEMP287 =
          (180.0);
        
//#line 491
final double X10_TEMP33 =
          (X10_TEMP287);
        
//#line 492
final double X10_TEMP290 =
          (X10_TEMP32 /
             X10_TEMP33);
        
//#line 494
double X10_TEMP40 =
          (X10_TEMP290);
        
//#line 495
final double X10_TEMP293 =
          (1.0);
        
//#line 497
double X10_TEMP41 =
          (X10_TEMP293);
        
//#line 498
final View X10_TEMP302 =
          (new View(
             X10_TEMP36,
             X10_TEMP37,
             X10_TEMP38,
             X10_TEMP39,
             X10_TEMP40,
             X10_TEMP41));
        
//#line 500
View X10_TEMP43 =
          (X10_TEMP302);
        
//#line 501
final Scene X10_TEMP306 =
          (new Scene(
             X10_TEMP43));
        
//#line 503
Scene scene =
          (X10_TEMP306);
        
//#line 504
final int X10_TEMP309 =
          (4);
        
//#line 506
final int nx =
          (X10_TEMP309);
        
//#line 507
final int X10_TEMP312 =
          (4);
        
//#line 509
final int ny =
          (X10_TEMP312);
        
//#line 510
final int X10_TEMP315 =
          (4);
        
//#line 512
final int nz =
          (X10_TEMP315);
        
//#line 513
final int X10_TEMP318 =
          (0);
        
//#line 515
final int X10_TEMP51 =
          (X10_TEMP318);
        
//#line 516
final int X10_TEMP321 =
          (1);
        
//#line 518
final int X10_TEMP49 =
          (X10_TEMP321);
        
//#line 519
final int X10_TEMP324 =
          (nx -
             X10_TEMP49);
        
//#line 521
final int X10_TEMP52 =
          (X10_TEMP324);
        
//#line 522
final int X10_TEMP327 =
          (0);
        
//#line 524
final int X10_TEMP56 =
          (X10_TEMP327);
        
//#line 525
final int X10_TEMP330 =
          (1);
        
//#line 527
final int X10_TEMP54 =
          (X10_TEMP330);
        
//#line 528
final int X10_TEMP333 =
          (ny -
             X10_TEMP54);
        
//#line 530
final int X10_TEMP57 =
          (X10_TEMP333);
        
//#line 531
final int X10_TEMP336 =
          (0);
        
//#line 533
final int X10_TEMP61 =
          (X10_TEMP336);
        
//#line 534
final int X10_TEMP339 =
          (1);
        
//#line 536
final int X10_TEMP59 =
          (X10_TEMP339);
        
//#line 537
final int X10_TEMP342 =
          (nz -
             X10_TEMP59);
        
//#line 539
final int X10_TEMP62 =
          (X10_TEMP342);
        
//#line 540
final x10.
          lang.
          region X10_TEMP351 =
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
        
//#line 542
final x10.
          lang.
          region reg =
          (x10.
            lang.
            region)
            ((X10_TEMP351));
        
//#line 543
/* template:forloop-mult { */{
        x10.lang.region __var7__ = (x10.lang.region) reg;
        if (__var7__.size() > 0 && (__var7__ instanceof x10.array.MultiDimRegion || __var7__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var8__ = __var7__.rank(0).low(), __var9__ = __var7__.rank(0).high(); __var8__ <= __var9__; __var8__++)
        /* } */
        /* template:forloop-mult-each { */
        for (int __var10__ = __var7__.rank(1).low(), __var11__ = __var7__.rank(1).high(); __var10__ <= __var11__; __var10__++)
        /* } */
        /* template:forloop-mult-each { */
        for (int __var12__ = __var7__.rank(2).low(), __var13__ = __var7__.rank(2).high(); __var12__ <= __var13__; __var12__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var8__;
        /* } */
        /* template:final-var-assign { */
        final int j = __var10__;
        /* } */
        /* template:final-var-assign { */
        final int k = __var12__;
        /* } */
        /* } */
{
            
//#line 544
final double X10_TEMP355 =
              (20.0);
            
//#line 546
final double X10_TEMP68 =
              (X10_TEMP355);
            
//#line 547
final int X10_TEMP358 =
              (1);
            
//#line 549
final int X10_TEMP65 =
              (X10_TEMP358);
            
//#line 550
final int X10_TEMP361 =
              (nx -
                 X10_TEMP65);
            
//#line 552
final int X10_TEMP67 =
              (X10_TEMP361);
            
//#line 553
final double X10_TEMP364 =
              (X10_TEMP68 /
                 X10_TEMP67);
            
//#line 555
final double X10_TEMP69 =
              (X10_TEMP364);
            
//#line 556
final double X10_TEMP367 =
              (X10_TEMP69 *
                 i);
            
//#line 558
final double X10_TEMP70 =
              (X10_TEMP367);
            
//#line 559
final double X10_TEMP370 =
              (10.0);
            
//#line 561
final double X10_TEMP71 =
              (X10_TEMP370);
            
//#line 562
final double X10_TEMP373 =
              (X10_TEMP70 -
                 X10_TEMP71);
            
//#line 564
double xx =
              (X10_TEMP373);
            
//#line 565
final double X10_TEMP376 =
              (20.0);
            
//#line 567
final double X10_TEMP76 =
              (X10_TEMP376);
            
//#line 568
final int X10_TEMP379 =
              (1);
            
//#line 570
final int X10_TEMP73 =
              (X10_TEMP379);
            
//#line 571
final int X10_TEMP382 =
              (ny -
                 X10_TEMP73);
            
//#line 573
final int X10_TEMP75 =
              (X10_TEMP382);
            
//#line 574
final double X10_TEMP385 =
              (X10_TEMP76 /
                 X10_TEMP75);
            
//#line 576
final double X10_TEMP77 =
              (X10_TEMP385);
            
//#line 577
final double X10_TEMP388 =
              (X10_TEMP77 *
                 j);
            
//#line 579
final double X10_TEMP78 =
              (X10_TEMP388);
            
//#line 580
final double X10_TEMP391 =
              (10.0);
            
//#line 582
final double X10_TEMP79 =
              (X10_TEMP391);
            
//#line 583
final double X10_TEMP394 =
              (X10_TEMP78 -
                 X10_TEMP79);
            
//#line 585
double yy =
              (X10_TEMP394);
            
//#line 586
final double X10_TEMP397 =
              (20.0);
            
//#line 588
final double X10_TEMP84 =
              (X10_TEMP397);
            
//#line 589
final int X10_TEMP400 =
              (1);
            
//#line 591
final int X10_TEMP81 =
              (X10_TEMP400);
            
//#line 592
final int X10_TEMP403 =
              (nz -
                 X10_TEMP81);
            
//#line 594
final int X10_TEMP83 =
              (X10_TEMP403);
            
//#line 595
final double X10_TEMP406 =
              (X10_TEMP84 /
                 X10_TEMP83);
            
//#line 597
final double X10_TEMP85 =
              (X10_TEMP406);
            
//#line 598
final double X10_TEMP409 =
              (X10_TEMP85 *
                 k);
            
//#line 600
final double X10_TEMP86 =
              (X10_TEMP409);
            
//#line 601
final double X10_TEMP412 =
              (10.0);
            
//#line 603
final double X10_TEMP87 =
              (X10_TEMP412);
            
//#line 604
final double X10_TEMP415 =
              (X10_TEMP86 -
                 X10_TEMP87);
            
//#line 606
double zz =
              (X10_TEMP415);
            
//#line 607
final boolean X10_TEMP418 =
              (false);
            
//#line 609
boolean X10_TEMP93 =
              (X10_TEMP418);
            
//#line 610
final Vec X10_TEMP425 =
              (new Vec(
                 xx,
                 yy,
                 zz,
                 X10_TEMP93));
            
//#line 612
Vec X10_TEMP126 =
              (X10_TEMP425);
            
//#line 613
final int X10_TEMP428 =
              (3);
            
//#line 615
int X10_TEMP127 =
              (X10_TEMP428);
            
//#line 616
final double X10_TEMP431 =
              (15.0);
            
//#line 618
double X10_TEMP120 =
              (X10_TEMP431);
            
//#line 619
final double X10_TEMP434 =
              (1.5);
            
//#line 621
final double X10_TEMP97 =
              (X10_TEMP434);
            
//#line 622
final double X10_TEMP437 =
              (1.0);
            
//#line 624
final double X10_TEMP98 =
              (X10_TEMP437);
            
//#line 625
final double X10_TEMP440 =
              (X10_TEMP97 -
                 X10_TEMP98);
            
//#line 627
double X10_TEMP121 =
              (X10_TEMP440);
            
//#line 628
final double X10_TEMP443 =
              (1.5);
            
//#line 630
final double X10_TEMP100 =
              (X10_TEMP443);
            
//#line 631
final double X10_TEMP446 =
              (1.0);
            
//#line 633
final double X10_TEMP101 =
              (X10_TEMP446);
            
//#line 634
final double X10_TEMP449 =
              (X10_TEMP100 -
                 X10_TEMP101);
            
//#line 636
double X10_TEMP122 =
              (X10_TEMP449);
            
//#line 637
final int X10_TEMP452 =
              (0);
            
//#line 639
int X10_TEMP114 =
              (X10_TEMP452);
            
//#line 640
final int X10_TEMP455 =
              (0);
            
//#line 642
int X10_TEMP115 =
              (X10_TEMP455);
            
//#line 643
final int X10_TEMP458 =
              (i +
                 j);
            
//#line 645
final int X10_TEMP106 =
              (X10_TEMP458);
            
//#line 646
final int X10_TEMP461 =
              (nx +
                 ny);
            
//#line 648
final int X10_TEMP107 =
              (X10_TEMP461);
            
//#line 649
final int X10_TEMP464 =
              (2);
            
//#line 651
final int X10_TEMP108 =
              (X10_TEMP464);
            
//#line 652
final int X10_TEMP467 =
              (X10_TEMP107 -
                 X10_TEMP108);
            
//#line 654
final int X10_TEMP110 =
              (X10_TEMP467);
            
//#line 655
final double X10_TEMP470 =
              ((double)
                 X10_TEMP110);
            
//#line 657
final double X10_TEMP111 =
              (X10_TEMP470);
            
//#line 658
final double X10_TEMP473 =
              (X10_TEMP106 /
                 X10_TEMP111);
            
//#line 660
double X10_TEMP116 =
              (X10_TEMP473);
            
//#line 661
final boolean X10_TEMP476 =
              (false);
            
//#line 663
boolean X10_TEMP117 =
              (X10_TEMP476);
            
//#line 664
final Vec X10_TEMP483 =
              (new Vec(
                 X10_TEMP114,
                 X10_TEMP115,
                 X10_TEMP116,
                 X10_TEMP117));
            
//#line 666
Vec X10_TEMP123 =
              (X10_TEMP483);
            
//#line 667
final boolean X10_TEMP486 =
              (false);
            
//#line 669
boolean X10_TEMP124 =
              (X10_TEMP486);
            
//#line 670
final Surface X10_TEMP494 =
              (new Surface(
                 X10_TEMP120,
                 X10_TEMP121,
                 X10_TEMP122,
                 X10_TEMP123,
                 X10_TEMP124));
            
//#line 672
Surface X10_TEMP128 =
              (X10_TEMP494);
            
//#line 673
final Sphere X10_TEMP500 =
              (new Sphere(
                 X10_TEMP126,
                 X10_TEMP127,
                 X10_TEMP128));
            
//#line 675
Sphere p =
              (X10_TEMP500);
            
//#line 676
Program0.
                           Program_Scene_addObject(
                           scene,
                           p);
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var0____ = (__var7__).iterator(); __var0____.hasNext(); ) {
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
            
//#line 544
final double X10_TEMP355 =
              (20.0);
            
//#line 546
final double X10_TEMP68 =
              (X10_TEMP355);
            
//#line 547
final int X10_TEMP358 =
              (1);
            
//#line 549
final int X10_TEMP65 =
              (X10_TEMP358);
            
//#line 550
final int X10_TEMP361 =
              (nx -
                 X10_TEMP65);
            
//#line 552
final int X10_TEMP67 =
              (X10_TEMP361);
            
//#line 553
final double X10_TEMP364 =
              (X10_TEMP68 /
                 X10_TEMP67);
            
//#line 555
final double X10_TEMP69 =
              (X10_TEMP364);
            
//#line 556
final double X10_TEMP367 =
              (X10_TEMP69 *
                 i);
            
//#line 558
final double X10_TEMP70 =
              (X10_TEMP367);
            
//#line 559
final double X10_TEMP370 =
              (10.0);
            
//#line 561
final double X10_TEMP71 =
              (X10_TEMP370);
            
//#line 562
final double X10_TEMP373 =
              (X10_TEMP70 -
                 X10_TEMP71);
            
//#line 564
double xx =
              (X10_TEMP373);
            
//#line 565
final double X10_TEMP376 =
              (20.0);
            
//#line 567
final double X10_TEMP76 =
              (X10_TEMP376);
            
//#line 568
final int X10_TEMP379 =
              (1);
            
//#line 570
final int X10_TEMP73 =
              (X10_TEMP379);
            
//#line 571
final int X10_TEMP382 =
              (ny -
                 X10_TEMP73);
            
//#line 573
final int X10_TEMP75 =
              (X10_TEMP382);
            
//#line 574
final double X10_TEMP385 =
              (X10_TEMP76 /
                 X10_TEMP75);
            
//#line 576
final double X10_TEMP77 =
              (X10_TEMP385);
            
//#line 577
final double X10_TEMP388 =
              (X10_TEMP77 *
                 j);
            
//#line 579
final double X10_TEMP78 =
              (X10_TEMP388);
            
//#line 580
final double X10_TEMP391 =
              (10.0);
            
//#line 582
final double X10_TEMP79 =
              (X10_TEMP391);
            
//#line 583
final double X10_TEMP394 =
              (X10_TEMP78 -
                 X10_TEMP79);
            
//#line 585
double yy =
              (X10_TEMP394);
            
//#line 586
final double X10_TEMP397 =
              (20.0);
            
//#line 588
final double X10_TEMP84 =
              (X10_TEMP397);
            
//#line 589
final int X10_TEMP400 =
              (1);
            
//#line 591
final int X10_TEMP81 =
              (X10_TEMP400);
            
//#line 592
final int X10_TEMP403 =
              (nz -
                 X10_TEMP81);
            
//#line 594
final int X10_TEMP83 =
              (X10_TEMP403);
            
//#line 595
final double X10_TEMP406 =
              (X10_TEMP84 /
                 X10_TEMP83);
            
//#line 597
final double X10_TEMP85 =
              (X10_TEMP406);
            
//#line 598
final double X10_TEMP409 =
              (X10_TEMP85 *
                 k);
            
//#line 600
final double X10_TEMP86 =
              (X10_TEMP409);
            
//#line 601
final double X10_TEMP412 =
              (10.0);
            
//#line 603
final double X10_TEMP87 =
              (X10_TEMP412);
            
//#line 604
final double X10_TEMP415 =
              (X10_TEMP86 -
                 X10_TEMP87);
            
//#line 606
double zz =
              (X10_TEMP415);
            
//#line 607
final boolean X10_TEMP418 =
              (false);
            
//#line 609
boolean X10_TEMP93 =
              (X10_TEMP418);
            
//#line 610
final Vec X10_TEMP425 =
              (new Vec(
                 xx,
                 yy,
                 zz,
                 X10_TEMP93));
            
//#line 612
Vec X10_TEMP126 =
              (X10_TEMP425);
            
//#line 613
final int X10_TEMP428 =
              (3);
            
//#line 615
int X10_TEMP127 =
              (X10_TEMP428);
            
//#line 616
final double X10_TEMP431 =
              (15.0);
            
//#line 618
double X10_TEMP120 =
              (X10_TEMP431);
            
//#line 619
final double X10_TEMP434 =
              (1.5);
            
//#line 621
final double X10_TEMP97 =
              (X10_TEMP434);
            
//#line 622
final double X10_TEMP437 =
              (1.0);
            
//#line 624
final double X10_TEMP98 =
              (X10_TEMP437);
            
//#line 625
final double X10_TEMP440 =
              (X10_TEMP97 -
                 X10_TEMP98);
            
//#line 627
double X10_TEMP121 =
              (X10_TEMP440);
            
//#line 628
final double X10_TEMP443 =
              (1.5);
            
//#line 630
final double X10_TEMP100 =
              (X10_TEMP443);
            
//#line 631
final double X10_TEMP446 =
              (1.0);
            
//#line 633
final double X10_TEMP101 =
              (X10_TEMP446);
            
//#line 634
final double X10_TEMP449 =
              (X10_TEMP100 -
                 X10_TEMP101);
            
//#line 636
double X10_TEMP122 =
              (X10_TEMP449);
            
//#line 637
final int X10_TEMP452 =
              (0);
            
//#line 639
int X10_TEMP114 =
              (X10_TEMP452);
            
//#line 640
final int X10_TEMP455 =
              (0);
            
//#line 642
int X10_TEMP115 =
              (X10_TEMP455);
            
//#line 643
final int X10_TEMP458 =
              (i +
                 j);
            
//#line 645
final int X10_TEMP106 =
              (X10_TEMP458);
            
//#line 646
final int X10_TEMP461 =
              (nx +
                 ny);
            
//#line 648
final int X10_TEMP107 =
              (X10_TEMP461);
            
//#line 649
final int X10_TEMP464 =
              (2);
            
//#line 651
final int X10_TEMP108 =
              (X10_TEMP464);
            
//#line 652
final int X10_TEMP467 =
              (X10_TEMP107 -
                 X10_TEMP108);
            
//#line 654
final int X10_TEMP110 =
              (X10_TEMP467);
            
//#line 655
final double X10_TEMP470 =
              ((double)
                 X10_TEMP110);
            
//#line 657
final double X10_TEMP111 =
              (X10_TEMP470);
            
//#line 658
final double X10_TEMP473 =
              (X10_TEMP106 /
                 X10_TEMP111);
            
//#line 660
double X10_TEMP116 =
              (X10_TEMP473);
            
//#line 661
final boolean X10_TEMP476 =
              (false);
            
//#line 663
boolean X10_TEMP117 =
              (X10_TEMP476);
            
//#line 664
final Vec X10_TEMP483 =
              (new Vec(
                 X10_TEMP114,
                 X10_TEMP115,
                 X10_TEMP116,
                 X10_TEMP117));
            
//#line 666
Vec X10_TEMP123 =
              (X10_TEMP483);
            
//#line 667
final boolean X10_TEMP486 =
              (false);
            
//#line 669
boolean X10_TEMP124 =
              (X10_TEMP486);
            
//#line 670
final Surface X10_TEMP494 =
              (new Surface(
                 X10_TEMP120,
                 X10_TEMP121,
                 X10_TEMP122,
                 X10_TEMP123,
                 X10_TEMP124));
            
//#line 672
Surface X10_TEMP128 =
              (X10_TEMP494);
            
//#line 673
final Sphere X10_TEMP500 =
              (new Sphere(
                 X10_TEMP126,
                 X10_TEMP127,
                 X10_TEMP128));
            
//#line 675
Sphere p =
              (X10_TEMP500);
            
//#line 676
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
        
        
//#line 678
final int X10_TEMP505 =
          (100);
        
//#line 680
int X10_TEMP137 =
          (X10_TEMP505);
        
//#line 681
final int X10_TEMP508 =
          (100);
        
//#line 683
int X10_TEMP138 =
          (X10_TEMP508);
        
//#line 684
final int X10_TEMP511 =
          (50);
        
//#line 686
final int X10_TEMP133 =
          (X10_TEMP511);
        
//#line 687
final int X10_TEMP134 =
          (0);
        
//#line 688
final int X10_TEMP515 =
          (X10_TEMP134 -
             X10_TEMP133);
        
//#line 690
int X10_TEMP139 =
          (X10_TEMP515);
        
//#line 691
final double X10_TEMP518 =
          (1.0);
        
//#line 693
double X10_TEMP140 =
          (X10_TEMP518);
        
//#line 694
final Light X10_TEMP525 =
          (new Light(
             X10_TEMP137,
             X10_TEMP138,
             X10_TEMP139,
             X10_TEMP140));
        
//#line 696
final Light X10_TEMP142 =
          (X10_TEMP525);
        
//#line 697
Program0.
                       Program_Scene_addLight(
                       scene,
                       X10_TEMP142);
        
//#line 698
final int X10_TEMP530 =
          (100);
        
//#line 700
final int X10_TEMP143 =
          (X10_TEMP530);
        
//#line 701
final int X10_TEMP144 =
          (0);
        
//#line 702
final int X10_TEMP534 =
          (X10_TEMP144 -
             X10_TEMP143);
        
//#line 704
int X10_TEMP151 =
          (X10_TEMP534);
        
//#line 705
final int X10_TEMP537 =
          (100);
        
//#line 707
int X10_TEMP152 =
          (X10_TEMP537);
        
//#line 708
final int X10_TEMP540 =
          (50);
        
//#line 710
final int X10_TEMP147 =
          (X10_TEMP540);
        
//#line 711
final int X10_TEMP148 =
          (0);
        
//#line 712
final int X10_TEMP544 =
          (X10_TEMP148 -
             X10_TEMP147);
        
//#line 714
int X10_TEMP153 =
          (X10_TEMP544);
        
//#line 715
final double X10_TEMP547 =
          (1.0);
        
//#line 717
double X10_TEMP154 =
          (X10_TEMP547);
        
//#line 718
final Light X10_TEMP554 =
          (new Light(
             X10_TEMP151,
             X10_TEMP152,
             X10_TEMP153,
             X10_TEMP154));
        
//#line 720
final Light X10_TEMP156 =
          (X10_TEMP554);
        
//#line 721
Program0.
                       Program_Scene_addLight(
                       scene,
                       X10_TEMP156);
        
//#line 722
final int X10_TEMP559 =
          (100);
        
//#line 724
int X10_TEMP165 =
          (X10_TEMP559);
        
//#line 725
final int X10_TEMP562 =
          (100);
        
//#line 727
final int X10_TEMP158 =
          (X10_TEMP562);
        
//#line 728
final int X10_TEMP159 =
          (0);
        
//#line 729
final int X10_TEMP566 =
          (X10_TEMP159 -
             X10_TEMP158);
        
//#line 731
int X10_TEMP166 =
          (X10_TEMP566);
        
//#line 732
final int X10_TEMP569 =
          (50);
        
//#line 734
final int X10_TEMP161 =
          (X10_TEMP569);
        
//#line 735
final int X10_TEMP162 =
          (0);
        
//#line 736
final int X10_TEMP573 =
          (X10_TEMP162 -
             X10_TEMP161);
        
//#line 738
int X10_TEMP167 =
          (X10_TEMP573);
        
//#line 739
final double X10_TEMP576 =
          (1.0);
        
//#line 741
double X10_TEMP168 =
          (X10_TEMP576);
        
//#line 742
final Light X10_TEMP583 =
          (new Light(
             X10_TEMP165,
             X10_TEMP166,
             X10_TEMP167,
             X10_TEMP168));
        
//#line 744
final Light X10_TEMP170 =
          (X10_TEMP583);
        
//#line 745
Program0.
                       Program_Scene_addLight(
                       scene,
                       X10_TEMP170);
        
//#line 746
final int X10_TEMP588 =
          (100);
        
//#line 748
final int X10_TEMP171 =
          (X10_TEMP588);
        
//#line 749
final int X10_TEMP172 =
          (0);
        
//#line 750
final int X10_TEMP592 =
          (X10_TEMP172 -
             X10_TEMP171);
        
//#line 752
int X10_TEMP181 =
          (X10_TEMP592);
        
//#line 753
final int X10_TEMP595 =
          (100);
        
//#line 755
final int X10_TEMP174 =
          (X10_TEMP595);
        
//#line 756
final int X10_TEMP175 =
          (0);
        
//#line 757
final int X10_TEMP599 =
          (X10_TEMP175 -
             X10_TEMP174);
        
//#line 759
int X10_TEMP182 =
          (X10_TEMP599);
        
//#line 760
final int X10_TEMP602 =
          (50);
        
//#line 762
final int X10_TEMP177 =
          (X10_TEMP602);
        
//#line 763
final int X10_TEMP178 =
          (0);
        
//#line 764
final int X10_TEMP606 =
          (X10_TEMP178 -
             X10_TEMP177);
        
//#line 766
int X10_TEMP183 =
          (X10_TEMP606);
        
//#line 767
final double X10_TEMP609 =
          (1.0);
        
//#line 769
double X10_TEMP184 =
          (X10_TEMP609);
        
//#line 770
final Light X10_TEMP616 =
          (new Light(
             X10_TEMP181,
             X10_TEMP182,
             X10_TEMP183,
             X10_TEMP184));
        
//#line 772
final Light X10_TEMP186 =
          (X10_TEMP616);
        
//#line 773
Program0.
                       Program_Scene_addLight(
                       scene,
                       X10_TEMP186);
        
//#line 774
final int X10_TEMP621 =
          (200);
        
//#line 776
int X10_TEMP191 =
          (X10_TEMP621);
        
//#line 777
final int X10_TEMP624 =
          (200);
        
//#line 779
int X10_TEMP192 =
          (X10_TEMP624);
        
//#line 780
final int X10_TEMP627 =
          (0);
        
//#line 782
int X10_TEMP193 =
          (X10_TEMP627);
        
//#line 783
final double X10_TEMP630 =
          (1.0);
        
//#line 785
double X10_TEMP194 =
          (X10_TEMP630);
        
//#line 786
final Light X10_TEMP637 =
          (new Light(
             X10_TEMP191,
             X10_TEMP192,
             X10_TEMP193,
             X10_TEMP194));
        
//#line 788
final Light X10_TEMP196 =
          (X10_TEMP637);
        
//#line 789
Program0.
                       Program_Scene_addLight(
                       scene,
                       X10_TEMP196);
        
//#line 790
return scene;
    }
    
    
//#line 792
public static void
                   Program_RayTracer_setScene(
                   final RayTracer X10_TEMP0,
                   final Scene scene) {
        
//#line 793
Scene X10_TEMP1 =
          (scene);
        
//#line 794
final int X10_TEMP219 =
          (Program0.
             Program_Scene_getLights(
             X10_TEMP1));
        
//#line 796
final int X10_TEMP4 =
          (X10_TEMP219);
        
//#line 797
final int X10_TEMP222 =
          (X10_TEMP4);
        
//#line 799
final int X10_TEMP5 =
          (X10_TEMP222);
        
//#line 800
final int X10_TEMP225 =
          (X10_TEMP5);
        
//#line 802
final int X10_TEMP228 =
          (X10_TEMP225);
        
//#line 803
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lightCount =
          ((X10_TEMP228));
        
//#line 804
final int X10_TEMP231 =
          (Program0.
             Program_Scene_getObjects(
             X10_TEMP1));
        
//#line 806
final int X10_TEMP8 =
          (X10_TEMP231);
        
//#line 807
final int X10_TEMP234 =
          (X10_TEMP8);
        
//#line 809
final int X10_TEMP9 =
          (X10_TEMP234);
        
//#line 810
final int X10_TEMP237 =
          (X10_TEMP9);
        
//#line 812
final int X10_TEMP240 =
          (X10_TEMP237);
        
//#line 813
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.objCount =
          ((X10_TEMP240));
        
//#line 814
final Scene X10_TEMP242 =
          (X10_TEMP1);
        
//#line 816
final Scene sc =
          (X10_TEMP242);
        
//#line 817
final x10.
          lang.
          dist X10_TEMP245 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                UNIQUE));
        
//#line 819
final x10.
          lang.
          dist X10_TEMP11 =
          (x10.
            lang.
            dist)
            ((X10_TEMP245));
        
//#line 820
final x10.
          lang.
          dist X10_TEMP248 =
          (x10.
            lang.
            dist)
            ((X10_TEMP11));
        
//#line 822
final x10.
          lang.
          dist U =
          (x10.
            lang.
            dist)
            ((X10_TEMP248));
        
//#line 823
final int X10_TEMP251 =
          (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lightCount);
        
//#line 825
final int mylightCount =
          (X10_TEMP251);
        
//#line 826
final int X10_TEMP254 =
          (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.objCount);
        
//#line 828
final int myobjCount =
          (X10_TEMP254);
        
//#line 829
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 830
/* template:forloop-mult { */{
            x10.lang.region __var15__ = (x10.lang.region) U.
                                                            region;
            if (__var15__.size() > 0 && (__var15__ instanceof x10.array.MultiDimRegion || __var15__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var16__ = __var15__.rank(0).low(), __var17__ = __var15__.rank(0).high(); __var16__ <= __var17__; __var16__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int pl = __var16__;
            /* } */
            /* } */
/* Join: { *//* template:point-create { */
            final  x10.
              lang.
              point X10_TEMP17 = point.factory.point(/* Join: { */__var16__/* } */);/* } */
{
                
//#line 831
final x10.
                  lang.
                  dist X10_TEMP258 =
                  (x10.
                    lang.
                    dist)
                    ((U.
                        distribution));
                
//#line 833
final x10.
                  lang.
                  dist X10_TEMP16 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP258));
                
//#line 834
final x10.
                  lang.
                  place X10_TEMP18 =
                  (X10_TEMP16.
                     get(
                     X10_TEMP17));
                
//#line 835
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP18)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 836
final x10.
                      lang.
                      place X10_TEMP264 =
                      (/* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 838
final x10.
                      lang.
                      place pHere =
                      (X10_TEMP264);
                    
//#line 839
final int X10_TEMP267 =
                      (0);
                    
//#line 841
final int X10_TEMP23 =
                      (X10_TEMP267);
                    
//#line 842
final int X10_TEMP270 =
                      (1);
                    
//#line 844
final int X10_TEMP21 =
                      (X10_TEMP270);
                    
//#line 845
final int X10_TEMP273 =
                      (mylightCount -
                         X10_TEMP21);
                    
//#line 847
final int X10_TEMP24 =
                      (X10_TEMP273);
                    
//#line 848
final x10.
                      lang.
                      region X10_TEMP278 =
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
                              X10_TEMP23,
                              X10_TEMP24))));
                    
//#line 850
x10.
                      lang.
                      region d1 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP278));
                    
//#line 851
final int X10_TEMP281 =
                      (0);
                    
//#line 853
final int X10_TEMP29 =
                      (X10_TEMP281);
                    
//#line 854
final int X10_TEMP284 =
                      (1);
                    
//#line 856
final int X10_TEMP27 =
                      (X10_TEMP284);
                    
//#line 857
final int X10_TEMP287 =
                      (myobjCount -
                         X10_TEMP27);
                    
//#line 859
final int X10_TEMP30 =
                      (X10_TEMP287);
                    
//#line 860
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
                              X10_TEMP29,
                              X10_TEMP30))));
                    
//#line 862
x10.
                      lang.
                      region d2 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP292));
                    
//#line 863
final x10.
                      lang.
                      GenericReferenceArray X10_TEMP340 =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d1.
                                                                                                                                       toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                          	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                            lang.
                            point __var1__/* } */, x10.compilergenerated.Parameter1 dummy) { {
                              
//#line 863
final int l =
                                /* template:array_get { */((__var1__).get(0))/* } */;
                              
//#line 864
final int X10_TEMP295 =
                                (0);
                              
//#line 866
final int X10_TEMP34 =
                                (X10_TEMP295);
                              
//#line 867
final int X10_TEMP298 =
                                (0);
                              
//#line 869
final int X10_TEMP35 =
                                (X10_TEMP298);
                              
//#line 870
final x10.
                                lang.
                                region X10_TEMP303 =
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
                                        X10_TEMP34,
                                        X10_TEMP35))));
                              
//#line 872
final x10.
                                lang.
                                region X10_TEMP36 =
                                (x10.
                                  lang.
                                  region)
                                  ((X10_TEMP303));
                              
//#line 873
final x10.
                                lang.
                                dist X10_TEMP306 =
                                (x10.
                                  lang.
                                  dist)
                                  ((x10.
                                      lang.
                                      dist.
                                      factory.
                                      constant(
                                      X10_TEMP36,
                                      pHere)));
                              
//#line 875
final x10.
                                lang.
                                dist dTemp =
                                (x10.
                                  lang.
                                  dist)
                                  ((X10_TEMP306));
                              
//#line 876
final x10.
                                lang.
                                GenericReferenceArray X10_TEMP309 =
                                (x10.
                                  lang.
                                  GenericReferenceArray)
                                  ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dTemp,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
                              
//#line 878
final x10.
                                lang.
                                GenericReferenceArray temp =
                                (x10.
                                  lang.
                                  GenericReferenceArray)
                                  ((X10_TEMP309));
                              
//#line 879
/* template:finish { */
                              {
                              	x10.lang.Runtime.getCurrentActivity().startFinish();
                              	try {
                              		{
                                  
//#line 880
final x10.
                                    lang.
                                    place X10_TEMP40 =
                                    (x10.
                                       lang.
                                       place.
                                       FIRST_PLACE);
                                  
//#line 881
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP40)).runAsync
                                  	(new x10.runtime.Activity() {
                                  		public void runX10Task() {
                                  			{
                                      
//#line 882
final Light X10_TEMP316 =
                                        (Program0.
                                           Program_Scene_getLight(
                                           sc,
                                           l));
                                      
//#line 884
final Light tempLight =
                                        (X10_TEMP316);
                                      
//#line 885
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                                      	(new x10.runtime.Activity() {
                                      		public void runX10Task() {
                                      			{
                                          
//#line 886
final int X10_TEMP320 =
                                            (0);
                                          
//#line 888
final int X10_TEMP45 =
                                            (X10_TEMP320);
                                          
//#line 889
final Light X10_TEMP323 =
                                            (tempLight);
                                          
//#line 891
final Light X10_TEMP48 =
                                            (X10_TEMP323);
                                          
//#line 892
final Light X10_TEMP327 =
                                            (X10_TEMP48);
                                          
//#line 894
final Light X10_TEMP330 =
                                            (X10_TEMP327);
                                          
//#line 895
/* template:array_set { */(temp).set((X10_TEMP330),X10_TEMP45)/* } */;
                                      }
                                      		}
                                      	});/* } */
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
                              
                              
//#line 899
final int X10_TEMP332 =
                                (0);
                              
//#line 901
final int X10_TEMP50 =
                                (X10_TEMP332);
                              
//#line 902
final Light X10_TEMP336 =
                                (/* template:parametric { */((Light)(/* template:array_get { */((temp).get(X10_TEMP50))/* } */))/* } */);
                              
//#line 904
final Light X10_TEMP52 =
                                (X10_TEMP336);
                              
//#line 905
return X10_TEMP52;
                          } }
                          }/* } */,true,false,true)/* } */));
                    
//#line 910
final x10.
                      lang.
                      GenericReferenceArray X10_TEMP53 =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((X10_TEMP340));
                    
//#line 911
final x10.
                      lang.
                      GenericReferenceArray X10_TEMP343 =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((X10_TEMP53));
                    
//#line 913
final x10.
                      lang.
                      GenericReferenceArray templights =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((X10_TEMP343));
                    
//#line 914
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 915
final x10.
                          lang.
                          place X10_TEMP56 =
                          (x10.
                             lang.
                             place.
                             FIRST_PLACE);
                        
//#line 916
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP56)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 917
final x10.
                              lang.
                              GenericReferenceArray X10_TEMP348 =
                              (x10.
                                lang.
                                GenericReferenceArray)
                                ((templights));
                            
//#line 919
final x10.
                              lang.
                              GenericReferenceArray X10_TEMP59 =
                              (x10.
                                lang.
                                GenericReferenceArray)
                                ((X10_TEMP348));
                            
//#line 920
final x10.
                              lang.
                              GenericReferenceArray X10_TEMP351 =
                              (x10.
                                lang.
                                GenericReferenceArray)
                                ((X10_TEMP59));
                            
//#line 922
final x10.
                              lang.
                              GenericReferenceArray X10_TEMP354 =
                              (x10.
                                lang.
                                GenericReferenceArray)
                                ((X10_TEMP351));
                            
//#line 923
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lights =
                              ((X10_TEMP354));
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
                    
                    
//#line 926
final x10.
                      lang.
                      GenericReferenceArray X10_TEMP401 =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d2.
                                                                                                                                       toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                          	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                            lang.
                            point __var2__/* } */, x10.compilergenerated.Parameter1 dummy) { {
                              
//#line 926
final int o =
                                /* template:array_get { */((__var2__).get(0))/* } */;
                              
//#line 927
final int X10_TEMP356 =
                                (0);
                              
//#line 929
final int X10_TEMP62 =
                                (X10_TEMP356);
                              
//#line 930
final int X10_TEMP359 =
                                (0);
                              
//#line 932
final int X10_TEMP63 =
                                (X10_TEMP359);
                              
//#line 933
final x10.
                                lang.
                                region X10_TEMP364 =
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
                                        X10_TEMP62,
                                        X10_TEMP63))));
                              
//#line 935
final x10.
                                lang.
                                region X10_TEMP64 =
                                (x10.
                                  lang.
                                  region)
                                  ((X10_TEMP364));
                              
//#line 936
final x10.
                                lang.
                                dist X10_TEMP367 =
                                (x10.
                                  lang.
                                  dist)
                                  ((x10.
                                      lang.
                                      dist.
                                      factory.
                                      constant(
                                      X10_TEMP64,
                                      pHere)));
                              
//#line 938
final x10.
                                lang.
                                dist dTemp1 =
                                (x10.
                                  lang.
                                  dist)
                                  ((X10_TEMP367));
                              
//#line 939
final x10.
                                lang.
                                GenericReferenceArray X10_TEMP370 =
                                (x10.
                                  lang.
                                  GenericReferenceArray)
                                  ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dTemp1,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
                              
//#line 941
final x10.
                                lang.
                                GenericReferenceArray temp1 =
                                (x10.
                                  lang.
                                  GenericReferenceArray)
                                  ((X10_TEMP370));
                              
//#line 942
/* template:finish { */
                              {
                              	x10.lang.Runtime.getCurrentActivity().startFinish();
                              	try {
                              		{
                                  
//#line 943
final x10.
                                    lang.
                                    place X10_TEMP68 =
                                    (x10.
                                       lang.
                                       place.
                                       FIRST_PLACE);
                                  
//#line 944
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP68)).runAsync
                                  	(new x10.runtime.Activity() {
                                  		public void runX10Task() {
                                  			{
                                      
//#line 945
final Sphere X10_TEMP377 =
                                        (Program0.
                                           Program_Scene_getObject(
                                           sc,
                                           o));
                                      
//#line 947
final Sphere tempObject =
                                        (X10_TEMP377);
                                      
//#line 948
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                                      	(new x10.runtime.Activity() {
                                      		public void runX10Task() {
                                      			{
                                          
//#line 949
final int X10_TEMP381 =
                                            (0);
                                          
//#line 951
final int X10_TEMP73 =
                                            (X10_TEMP381);
                                          
//#line 952
final Sphere X10_TEMP384 =
                                            (tempObject);
                                          
//#line 954
final Sphere X10_TEMP76 =
                                            (X10_TEMP384);
                                          
//#line 955
final Sphere X10_TEMP388 =
                                            (X10_TEMP76);
                                          
//#line 957
final Sphere X10_TEMP391 =
                                            (X10_TEMP388);
                                          
//#line 958
/* template:array_set { */(temp1).set((X10_TEMP391),X10_TEMP73)/* } */;
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
                              
                              
//#line 962
final int X10_TEMP393 =
                                (0);
                              
//#line 964
final int X10_TEMP78 =
                                (X10_TEMP393);
                              
//#line 965
final Sphere X10_TEMP397 =
                                (/* template:parametric { */((Sphere)(/* template:array_get { */((temp1).get(X10_TEMP78))/* } */))/* } */);
                              
//#line 967
final Sphere X10_TEMP80 =
                                (X10_TEMP397);
                              
//#line 968
return X10_TEMP80;
                          } }
                          }/* } */,true,false,true)/* } */));
                    
//#line 973
final x10.
                      lang.
                      GenericReferenceArray X10_TEMP81 =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((X10_TEMP401));
                    
//#line 974
final x10.
                      lang.
                      GenericReferenceArray X10_TEMP404 =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((X10_TEMP81));
                    
//#line 976
final x10.
                      lang.
                      GenericReferenceArray tempprim =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((X10_TEMP404));
                    
//#line 977
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 978
final x10.
                          lang.
                          place X10_TEMP84 =
                          (x10.
                             lang.
                             place.
                             FIRST_PLACE);
                        
//#line 979
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP84)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 980
final x10.
                              lang.
                              GenericReferenceArray X10_TEMP409 =
                              (x10.
                                lang.
                                GenericReferenceArray)
                                ((tempprim));
                            
//#line 982
final x10.
                              lang.
                              GenericReferenceArray X10_TEMP87 =
                              (x10.
                                lang.
                                GenericReferenceArray)
                                ((X10_TEMP409));
                            
//#line 983
final x10.
                              lang.
                              GenericReferenceArray X10_TEMP412 =
                              (x10.
                                lang.
                                GenericReferenceArray)
                                ((X10_TEMP87));
                            
//#line 985
final x10.
                              lang.
                              GenericReferenceArray X10_TEMP415 =
                              (x10.
                                lang.
                                GenericReferenceArray)
                                ((X10_TEMP412));
                            
//#line 986
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.prim =
                              ((X10_TEMP415));
                        }
                        		}
                        	});/* } */
                    }
                    	} catch (Throwable tmp21) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp21);
                    	} finally {
                    		x10.lang.Runtime.getCurrentActivity().stopFinish();
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
            for (java.util.Iterator X10_TEMP17__ = (__var15__).iterator(); X10_TEMP17__.hasNext(); ) {
            	final  x10.
              lang.
              point X10_TEMP17 = (x10.
              lang.
              point) X10_TEMP17__.next();
            	/* Join: { *//* Join: { */final int pl =
              /* template:array_get { */((X10_TEMP17).get(0))/* } */;/* } */
{
                
//#line 831
final x10.
                  lang.
                  dist X10_TEMP258 =
                  (x10.
                    lang.
                    dist)
                    ((U.
                        distribution));
                
//#line 833
final x10.
                  lang.
                  dist X10_TEMP16 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP258));
                
//#line 834
final x10.
                  lang.
                  place X10_TEMP18 =
                  (X10_TEMP16.
                     get(
                     X10_TEMP17));
                
//#line 835
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP18)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 836
final x10.
                      lang.
                      place X10_TEMP264 =
                      (/* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 838
final x10.
                      lang.
                      place pHere =
                      (X10_TEMP264);
                    
//#line 839
final int X10_TEMP267 =
                      (0);
                    
//#line 841
final int X10_TEMP23 =
                      (X10_TEMP267);
                    
//#line 842
final int X10_TEMP270 =
                      (1);
                    
//#line 844
final int X10_TEMP21 =
                      (X10_TEMP270);
                    
//#line 845
final int X10_TEMP273 =
                      (mylightCount -
                         X10_TEMP21);
                    
//#line 847
final int X10_TEMP24 =
                      (X10_TEMP273);
                    
//#line 848
final x10.
                      lang.
                      region X10_TEMP278 =
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
                              X10_TEMP23,
                              X10_TEMP24))));
                    
//#line 850
x10.
                      lang.
                      region d1 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP278));
                    
//#line 851
final int X10_TEMP281 =
                      (0);
                    
//#line 853
final int X10_TEMP29 =
                      (X10_TEMP281);
                    
//#line 854
final int X10_TEMP284 =
                      (1);
                    
//#line 856
final int X10_TEMP27 =
                      (X10_TEMP284);
                    
//#line 857
final int X10_TEMP287 =
                      (myobjCount -
                         X10_TEMP27);
                    
//#line 859
final int X10_TEMP30 =
                      (X10_TEMP287);
                    
//#line 860
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
                              X10_TEMP29,
                              X10_TEMP30))));
                    
//#line 862
x10.
                      lang.
                      region d2 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP292));
                    
//#line 863
final x10.
                      lang.
                      GenericReferenceArray X10_TEMP340 =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d1.
                                                                                                                                       toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                          	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                            lang.
                            point __var1__/* } */, x10.compilergenerated.Parameter1 dummy) { {
                              
//#line 863
final int l =
                                /* template:array_get { */((__var1__).get(0))/* } */;
                              
//#line 864
final int X10_TEMP295 =
                                (0);
                              
//#line 866
final int X10_TEMP34 =
                                (X10_TEMP295);
                              
//#line 867
final int X10_TEMP298 =
                                (0);
                              
//#line 869
final int X10_TEMP35 =
                                (X10_TEMP298);
                              
//#line 870
final x10.
                                lang.
                                region X10_TEMP303 =
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
                                        X10_TEMP34,
                                        X10_TEMP35))));
                              
//#line 872
final x10.
                                lang.
                                region X10_TEMP36 =
                                (x10.
                                  lang.
                                  region)
                                  ((X10_TEMP303));
                              
//#line 873
final x10.
                                lang.
                                dist X10_TEMP306 =
                                (x10.
                                  lang.
                                  dist)
                                  ((x10.
                                      lang.
                                      dist.
                                      factory.
                                      constant(
                                      X10_TEMP36,
                                      pHere)));
                              
//#line 875
final x10.
                                lang.
                                dist dTemp =
                                (x10.
                                  lang.
                                  dist)
                                  ((X10_TEMP306));
                              
//#line 876
final x10.
                                lang.
                                GenericReferenceArray X10_TEMP309 =
                                (x10.
                                  lang.
                                  GenericReferenceArray)
                                  ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dTemp,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
                              
//#line 878
final x10.
                                lang.
                                GenericReferenceArray temp =
                                (x10.
                                  lang.
                                  GenericReferenceArray)
                                  ((X10_TEMP309));
                              
//#line 879
/* template:finish { */
                              {
                              	x10.lang.Runtime.getCurrentActivity().startFinish();
                              	try {
                              		{
                                  
//#line 880
final x10.
                                    lang.
                                    place X10_TEMP40 =
                                    (x10.
                                       lang.
                                       place.
                                       FIRST_PLACE);
                                  
//#line 881
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP40)).runAsync
                                  	(new x10.runtime.Activity() {
                                  		public void runX10Task() {
                                  			{
                                      
//#line 882
final Light X10_TEMP316 =
                                        (Program0.
                                           Program_Scene_getLight(
                                           sc,
                                           l));
                                      
//#line 884
final Light tempLight =
                                        (X10_TEMP316);
                                      
//#line 885
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                                      	(new x10.runtime.Activity() {
                                      		public void runX10Task() {
                                      			{
                                          
//#line 886
final int X10_TEMP320 =
                                            (0);
                                          
//#line 888
final int X10_TEMP45 =
                                            (X10_TEMP320);
                                          
//#line 889
final Light X10_TEMP323 =
                                            (tempLight);
                                          
//#line 891
final Light X10_TEMP48 =
                                            (X10_TEMP323);
                                          
//#line 892
final Light X10_TEMP327 =
                                            (X10_TEMP48);
                                          
//#line 894
final Light X10_TEMP330 =
                                            (X10_TEMP327);
                                          
//#line 895
/* template:array_set { */(temp).set((X10_TEMP330),X10_TEMP45)/* } */;
                                      }
                                      		}
                                      	});/* } */
                                  }
                                  		}
                                  	});/* } */
                              }
                              	} catch (Throwable tmp22) {
                              		x10.lang.Runtime.getCurrentActivity().pushException(tmp22);
                              	} finally {
                              		x10.lang.Runtime.getCurrentActivity().stopFinish();
                              	}
                              }
                              /* } */
                              
                              
//#line 899
final int X10_TEMP332 =
                                (0);
                              
//#line 901
final int X10_TEMP50 =
                                (X10_TEMP332);
                              
//#line 902
final Light X10_TEMP336 =
                                (/* template:parametric { */((Light)(/* template:array_get { */((temp).get(X10_TEMP50))/* } */))/* } */);
                              
//#line 904
final Light X10_TEMP52 =
                                (X10_TEMP336);
                              
//#line 905
return X10_TEMP52;
                          } }
                          }/* } */,true,false,true)/* } */));
                    
//#line 910
final x10.
                      lang.
                      GenericReferenceArray X10_TEMP53 =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((X10_TEMP340));
                    
//#line 911
final x10.
                      lang.
                      GenericReferenceArray X10_TEMP343 =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((X10_TEMP53));
                    
//#line 913
final x10.
                      lang.
                      GenericReferenceArray templights =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((X10_TEMP343));
                    
//#line 914
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 915
final x10.
                          lang.
                          place X10_TEMP56 =
                          (x10.
                             lang.
                             place.
                             FIRST_PLACE);
                        
//#line 916
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP56)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 917
final x10.
                              lang.
                              GenericReferenceArray X10_TEMP348 =
                              (x10.
                                lang.
                                GenericReferenceArray)
                                ((templights));
                            
//#line 919
final x10.
                              lang.
                              GenericReferenceArray X10_TEMP59 =
                              (x10.
                                lang.
                                GenericReferenceArray)
                                ((X10_TEMP348));
                            
//#line 920
final x10.
                              lang.
                              GenericReferenceArray X10_TEMP351 =
                              (x10.
                                lang.
                                GenericReferenceArray)
                                ((X10_TEMP59));
                            
//#line 922
final x10.
                              lang.
                              GenericReferenceArray X10_TEMP354 =
                              (x10.
                                lang.
                                GenericReferenceArray)
                                ((X10_TEMP351));
                            
//#line 923
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lights =
                              ((X10_TEMP354));
                        }
                        		}
                        	});/* } */
                    }
                    	} catch (Throwable tmp23) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp23);
                    	} finally {
                    		x10.lang.Runtime.getCurrentActivity().stopFinish();
                    	}
                    }
                    /* } */
                    
                    
//#line 926
final x10.
                      lang.
                      GenericReferenceArray X10_TEMP401 =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d2.
                                                                                                                                       toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                          	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                            lang.
                            point __var2__/* } */, x10.compilergenerated.Parameter1 dummy) { {
                              
//#line 926
final int o =
                                /* template:array_get { */((__var2__).get(0))/* } */;
                              
//#line 927
final int X10_TEMP356 =
                                (0);
                              
//#line 929
final int X10_TEMP62 =
                                (X10_TEMP356);
                              
//#line 930
final int X10_TEMP359 =
                                (0);
                              
//#line 932
final int X10_TEMP63 =
                                (X10_TEMP359);
                              
//#line 933
final x10.
                                lang.
                                region X10_TEMP364 =
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
                                        X10_TEMP62,
                                        X10_TEMP63))));
                              
//#line 935
final x10.
                                lang.
                                region X10_TEMP64 =
                                (x10.
                                  lang.
                                  region)
                                  ((X10_TEMP364));
                              
//#line 936
final x10.
                                lang.
                                dist X10_TEMP367 =
                                (x10.
                                  lang.
                                  dist)
                                  ((x10.
                                      lang.
                                      dist.
                                      factory.
                                      constant(
                                      X10_TEMP64,
                                      pHere)));
                              
//#line 938
final x10.
                                lang.
                                dist dTemp1 =
                                (x10.
                                  lang.
                                  dist)
                                  ((X10_TEMP367));
                              
//#line 939
final x10.
                                lang.
                                GenericReferenceArray X10_TEMP370 =
                                (x10.
                                  lang.
                                  GenericReferenceArray)
                                  ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dTemp1,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
                              
//#line 941
final x10.
                                lang.
                                GenericReferenceArray temp1 =
                                (x10.
                                  lang.
                                  GenericReferenceArray)
                                  ((X10_TEMP370));
                              
//#line 942
/* template:finish { */
                              {
                              	x10.lang.Runtime.getCurrentActivity().startFinish();
                              	try {
                              		{
                                  
//#line 943
final x10.
                                    lang.
                                    place X10_TEMP68 =
                                    (x10.
                                       lang.
                                       place.
                                       FIRST_PLACE);
                                  
//#line 944
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP68)).runAsync
                                  	(new x10.runtime.Activity() {
                                  		public void runX10Task() {
                                  			{
                                      
//#line 945
final Sphere X10_TEMP377 =
                                        (Program0.
                                           Program_Scene_getObject(
                                           sc,
                                           o));
                                      
//#line 947
final Sphere tempObject =
                                        (X10_TEMP377);
                                      
//#line 948
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                                      	(new x10.runtime.Activity() {
                                      		public void runX10Task() {
                                      			{
                                          
//#line 949
final int X10_TEMP381 =
                                            (0);
                                          
//#line 951
final int X10_TEMP73 =
                                            (X10_TEMP381);
                                          
//#line 952
final Sphere X10_TEMP384 =
                                            (tempObject);
                                          
//#line 954
final Sphere X10_TEMP76 =
                                            (X10_TEMP384);
                                          
//#line 955
final Sphere X10_TEMP388 =
                                            (X10_TEMP76);
                                          
//#line 957
final Sphere X10_TEMP391 =
                                            (X10_TEMP388);
                                          
//#line 958
/* template:array_set { */(temp1).set((X10_TEMP391),X10_TEMP73)/* } */;
                                      }
                                      		}
                                      	});/* } */
                                  }
                                  		}
                                  	});/* } */
                              }
                              	} catch (Throwable tmp24) {
                              		x10.lang.Runtime.getCurrentActivity().pushException(tmp24);
                              	} finally {
                              		x10.lang.Runtime.getCurrentActivity().stopFinish();
                              	}
                              }
                              /* } */
                              
                              
//#line 962
final int X10_TEMP393 =
                                (0);
                              
//#line 964
final int X10_TEMP78 =
                                (X10_TEMP393);
                              
//#line 965
final Sphere X10_TEMP397 =
                                (/* template:parametric { */((Sphere)(/* template:array_get { */((temp1).get(X10_TEMP78))/* } */))/* } */);
                              
//#line 967
final Sphere X10_TEMP80 =
                                (X10_TEMP397);
                              
//#line 968
return X10_TEMP80;
                          } }
                          }/* } */,true,false,true)/* } */));
                    
//#line 973
final x10.
                      lang.
                      GenericReferenceArray X10_TEMP81 =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((X10_TEMP401));
                    
//#line 974
final x10.
                      lang.
                      GenericReferenceArray X10_TEMP404 =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((X10_TEMP81));
                    
//#line 976
final x10.
                      lang.
                      GenericReferenceArray tempprim =
                      (x10.
                        lang.
                        GenericReferenceArray)
                        ((X10_TEMP404));
                    
//#line 977
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 978
final x10.
                          lang.
                          place X10_TEMP84 =
                          (x10.
                             lang.
                             place.
                             FIRST_PLACE);
                        
//#line 979
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP84)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 980
final x10.
                              lang.
                              GenericReferenceArray X10_TEMP409 =
                              (x10.
                                lang.
                                GenericReferenceArray)
                                ((tempprim));
                            
//#line 982
final x10.
                              lang.
                              GenericReferenceArray X10_TEMP87 =
                              (x10.
                                lang.
                                GenericReferenceArray)
                                ((X10_TEMP409));
                            
//#line 983
final x10.
                              lang.
                              GenericReferenceArray X10_TEMP412 =
                              (x10.
                                lang.
                                GenericReferenceArray)
                                ((X10_TEMP87));
                            
//#line 985
final x10.
                              lang.
                              GenericReferenceArray X10_TEMP415 =
                              (x10.
                                lang.
                                GenericReferenceArray)
                                ((X10_TEMP412));
                            
//#line 986
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.prim =
                              ((X10_TEMP415));
                        }
                        		}
                        	});/* } */
                    }
                    	} catch (Throwable tmp25) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp25);
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
        
        
//#line 992
final View X10_TEMP418 =
          (Program0.
             Program_Scene_getView(
             X10_TEMP1));
        
//#line 994
final View X10_TEMP90 =
          (X10_TEMP418);
        
//#line 995
final View X10_TEMP421 =
          (X10_TEMP90);
        
//#line 997
final View X10_TEMP91 =
          (X10_TEMP421);
        
//#line 998
final View X10_TEMP424 =
          (X10_TEMP91);
        
//#line 1000
final View X10_TEMP427 =
          (X10_TEMP424);
        
//#line 1001
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.view =
          ((X10_TEMP427));
    }
    
    
//#line 1003
public static void
                    Program_RayTracer_render(
                    final RayTracer X10_TEMP0,
                    final Interval interval) {
        
//#line 1004
final int X10_TEMP217 =
          (0);
        
//#line 1006
final int X10_TEMP11 =
          (X10_TEMP217);
        
//#line 1007
final int X10_TEMP220 =
          (interval.
             width);
        
//#line 1009
final int X10_TEMP6 =
          (X10_TEMP220);
        
//#line 1010
final int X10_TEMP223 =
          (interval.
             yto);
        
//#line 1012
final int X10_TEMP2 =
          (X10_TEMP223);
        
//#line 1013
final int X10_TEMP226 =
          (interval.
             yfrom);
        
//#line 1015
final int X10_TEMP3 =
          (X10_TEMP226);
        
//#line 1016
final int X10_TEMP229 =
          (X10_TEMP2 -
             X10_TEMP3);
        
//#line 1018
final int X10_TEMP5 =
          (X10_TEMP229);
        
//#line 1019
final int X10_TEMP232 =
          (X10_TEMP6 *
             X10_TEMP5);
        
//#line 1021
final int X10_TEMP8 =
          (X10_TEMP232);
        
//#line 1022
final int X10_TEMP235 =
          (1);
        
//#line 1024
final int X10_TEMP9 =
          (X10_TEMP235);
        
//#line 1025
final int X10_TEMP238 =
          (X10_TEMP8 -
             X10_TEMP9);
        
//#line 1027
final int X10_TEMP12 =
          (X10_TEMP238);
        
//#line 1028
final x10.
          lang.
          region X10_TEMP243 =
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
        
//#line 1030
final x10.
          lang.
          region R =
          (x10.
            lang.
            region)
            ((X10_TEMP243));
        
//#line 1031
final x10.
          lang.
          dist X10_TEMP247 =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 1031
public x10.
                              lang.
                              dist
                              checkCast(
                              final x10.
                                lang.
                                dist x10_generated_objToCast) {
                  
//#line 1031
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
        
//#line 1033
final x10.
          lang.
          dist X10_TEMP15 =
          (x10.
            lang.
            dist)
            ((X10_TEMP247));
        
//#line 1034
final x10.
          lang.
          dist X10_TEMP250 =
          (x10.
            lang.
            dist)
            ((X10_TEMP15));
        
//#line 1036
final x10.
          lang.
          dist DBlock =
          (x10.
            lang.
            dist)
            ((X10_TEMP250));
        
//#line 1037
final x10.
          lang.
          dist X10_TEMP253 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                UNIQUE));
        
//#line 1039
final x10.
          lang.
          dist X10_TEMP17 =
          (x10.
            lang.
            dist)
            ((X10_TEMP253));
        
//#line 1040
final x10.
          lang.
          dist X10_TEMP256 =
          (x10.
            lang.
            dist)
            ((X10_TEMP17));
        
//#line 1042
final x10.
          lang.
          dist U =
          (x10.
            lang.
            dist)
            ((X10_TEMP256));
        
//#line 1043
final x10.
          lang.
          IntReferenceArray X10_TEMP259 =
          (x10.
            lang.
            IntReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(DBlock,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1045
final x10.
          lang.
          IntReferenceArray row =
          (x10.
            lang.
            IntReferenceArray)
            ((X10_TEMP259));
        
//#line 1046
final x10.
          lang.
          region X10_TEMP262 =
          (x10.
            lang.
            region)
            ((U.
                region));
        
//#line 1048
final x10.
          lang.
          region chkSumReg =
          (x10.
            lang.
            region)
            ((X10_TEMP262));
        
//#line 1049
final x10.
          lang.
          place X10_TEMP265 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1051
final x10.
          lang.
          place pHere =
          (X10_TEMP265);
        
//#line 1052
final x10.
          lang.
          place X10_TEMP268 =
          (x10.
             lang.
             place.
             FIRST_PLACE);
        
//#line 1054
final x10.
          lang.
          place fp =
          (X10_TEMP268);
        
//#line 1055
final x10.
          lang.
          dist X10_TEMP271 =
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
        
//#line 1057
final x10.
          lang.
          dist chkSumDist =
          (x10.
            lang.
            dist)
            ((X10_TEMP271));
        
//#line 1058
final x10.
          lang.
          LongReferenceArray X10_TEMP274 =
          (x10.
            lang.
            LongReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.LongArray(chkSumDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1060
final x10.
          lang.
          LongReferenceArray X10_TEMP26 =
          (x10.
            lang.
            LongReferenceArray)
            ((X10_TEMP274));
        
//#line 1061
final x10.
          lang.
          LongReferenceArray X10_TEMP277 =
          (x10.
            lang.
            LongReferenceArray)
            ((X10_TEMP26));
        
//#line 1063
final x10.
          lang.
          LongReferenceArray X10_TEMP27 =
          (x10.
            lang.
            LongReferenceArray)
            ((X10_TEMP277));
        
//#line 1064
final x10.
          lang.
          LongReferenceArray X10_TEMP280 =
          (x10.
            lang.
            LongReferenceArray)
            ((X10_TEMP27));
        
//#line 1066
final x10.
          lang.
          LongReferenceArray X10_TEMP283 =
          (x10.
            lang.
            LongReferenceArray)
            ((X10_TEMP280));
        
//#line 1067
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.checkSumArray =
          ((X10_TEMP283));
        
//#line 1068
final View X10_TEMP285 =
          (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.view);
        
//#line 1070
final View myview =
          (X10_TEMP285);
        
//#line 1071
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1072
/* template:forloop-mult { */{
            x10.lang.region __var27__ = (x10.lang.region) U.
                                                            region;
            if (__var27__.size() > 0 && (__var27__ instanceof x10.array.MultiDimRegion || __var27__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var28__ = __var27__.rank(0).low(), __var29__ = __var27__.rank(0).high(); __var28__ <= __var29__; __var28__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int pl = __var28__;
            /* } */
            /* } */
/* Join: { *//* template:point-create { */
            final  x10.
              lang.
              point X10_TEMP31 = point.factory.point(/* Join: { */__var28__/* } */);/* } */
{
                
//#line 1073
final x10.
                  lang.
                  dist X10_TEMP289 =
                  (x10.
                    lang.
                    dist)
                    ((U.
                        distribution));
                
//#line 1075
final x10.
                  lang.
                  dist X10_TEMP30 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP289));
                
//#line 1076
final x10.
                  lang.
                  place X10_TEMP32 =
                  (X10_TEMP30.
                     get(
                     X10_TEMP31));
                
//#line 1077
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP32)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1078
final x10.
                      lang.
                      place X10_TEMP295 =
                      (/* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 1080
final x10.
                      lang.
                      place X10_TEMP33 =
                      (X10_TEMP295);
                    
//#line 1081
final x10.
                      lang.
                      dist X10_TEMP298 =
                      (x10.
                        lang.
                        dist)
                        ((DBlock.
                            restriction(
                            X10_TEMP33)));
                    
//#line 1083
final x10.
                      lang.
                      dist my_dist =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP298));
                    
//#line 1084
final int X10_TEMP301 =
                      (0);
                    
//#line 1086
long checksum1 =
                      (X10_TEMP301);
                    
//#line 1087
final double X10_TEMP304 =
                      (myview.
                         distance);
                    
//#line 1089
final double X10_TEMP44 =
                      (X10_TEMP304);
                    
//#line 1090
final double X10_TEMP307 =
                      (myview.
                         angle);
                    
//#line 1092
final double X10_TEMP37 =
                      (X10_TEMP307);
                    
//#line 1093
final double X10_TEMP311 =
                      (java.
                         lang.
                         Math.
                         sin(
                         X10_TEMP37));
                    
//#line 1095
final double X10_TEMP40 =
                      (X10_TEMP311);
                    
//#line 1096
final double X10_TEMP314 =
                      (myview.
                         angle);
                    
//#line 1098
final double X10_TEMP39 =
                      (X10_TEMP314);
                    
//#line 1099
final double X10_TEMP318 =
                      (java.
                         lang.
                         Math.
                         cos(
                         X10_TEMP39));
                    
//#line 1101
final double X10_TEMP41 =
                      (X10_TEMP318);
                    
//#line 1102
final double X10_TEMP321 =
                      (X10_TEMP40 /
                         X10_TEMP41);
                    
//#line 1104
final double X10_TEMP43 =
                      (X10_TEMP321);
                    
//#line 1105
final double X10_TEMP324 =
                      (X10_TEMP44 *
                         X10_TEMP43);
                    
//#line 1107
double frustrumwidth =
                      (X10_TEMP324);
                    
//#line 1108
final Vec X10_TEMP327 =
                      (myview.
                         at);
                    
//#line 1110
final Vec X10_TEMP48 =
                      (X10_TEMP327);
                    
//#line 1111
final Vec X10_TEMP330 =
                      (myview.
                         from);
                    
//#line 1113
final Vec X10_TEMP49 =
                      (X10_TEMP330);
                    
//#line 1114
final Vec X10_TEMP335 =
                      (Program0.
                         Program_Vec_sub(
                         X10_TEMP48,
                         X10_TEMP49));
                    
//#line 1116
final Vec X10_TEMP50 =
                      (X10_TEMP335);
                    
//#line 1117
final Vec X10_TEMP339 =
                      (Program0.
                         Program_Vec_normalized(
                         X10_TEMP50));
                    
//#line 1119
Vec viewVec =
                      (X10_TEMP339);
                    
//#line 1120
final boolean X10_TEMP342 =
                      (false);
                    
//#line 1122
boolean X10_TEMP54 =
                      (X10_TEMP342);
                    
//#line 1123
final Vec X10_TEMP347 =
                      (new Vec(
                         viewVec,
                         X10_TEMP54));
                    
//#line 1125
final Vec X10_TEMP55 =
                      (X10_TEMP347);
                    
//#line 1126
final Vec X10_TEMP350 =
                      (myview.
                         up);
                    
//#line 1128
final Vec X10_TEMP58 =
                      (X10_TEMP350);
                    
//#line 1129
final double X10_TEMP355 =
                      (Program0.
                         Program_Vec_dot(
                         X10_TEMP58,
                         viewVec));
                    
//#line 1131
final double X10_TEMP60 =
                      (X10_TEMP355);
                    
//#line 1132
final Vec X10_TEMP360 =
                      (Program0.
                         Program_Vec_scale(
                         X10_TEMP55,
                         X10_TEMP60));
                    
//#line 1134
Vec tmpVec =
                      (X10_TEMP360);
                    
//#line 1135
final Vec X10_TEMP363 =
                      (myview.
                         up);
                    
//#line 1137
final Vec X10_TEMP64 =
                      (X10_TEMP363);
                    
//#line 1138
final Vec X10_TEMP368 =
                      (Program0.
                         Program_Vec_sub(
                         X10_TEMP64,
                         tmpVec));
                    
//#line 1140
final Vec X10_TEMP65 =
                      (X10_TEMP368);
                    
//#line 1141
final Vec X10_TEMP372 =
                      (Program0.
                         Program_Vec_normalized(
                         X10_TEMP65));
                    
//#line 1143
final Vec X10_TEMP66 =
                      (X10_TEMP372);
                    
//#line 1144
final int X10_TEMP67 =
                      (0);
                    
//#line 1145
final double X10_TEMP376 =
                      (X10_TEMP67 -
                         frustrumwidth);
                    
//#line 1147
final double X10_TEMP69 =
                      (X10_TEMP376);
                    
//#line 1148
final Vec X10_TEMP381 =
                      (Program0.
                         Program_Vec_scale(
                         X10_TEMP66,
                         X10_TEMP69));
                    
//#line 1150
Vec upVec =
                      (X10_TEMP381);
                    
//#line 1151
final Vec X10_TEMP384 =
                      (myview.
                         up);
                    
//#line 1153
final Vec X10_TEMP73 =
                      (X10_TEMP384);
                    
//#line 1154
final Vec X10_TEMP389 =
                      (Program0.
                         Program_Vec_cross(
                         X10_TEMP73,
                         viewVec));
                    
//#line 1156
final Vec X10_TEMP74 =
                      (X10_TEMP389);
                    
//#line 1157
final Vec X10_TEMP393 =
                      (Program0.
                         Program_Vec_normalized(
                         X10_TEMP74));
                    
//#line 1159
final Vec X10_TEMP75 =
                      (X10_TEMP393);
                    
//#line 1160
final double X10_TEMP396 =
                      (myview.
                         aspect);
                    
//#line 1162
final double X10_TEMP76 =
                      (X10_TEMP396);
                    
//#line 1163
final double X10_TEMP399 =
                      (X10_TEMP76 *
                         frustrumwidth);
                    
//#line 1165
final double X10_TEMP78 =
                      (X10_TEMP399);
                    
//#line 1166
final Vec X10_TEMP404 =
                      (Program0.
                         Program_Vec_scale(
                         X10_TEMP75,
                         X10_TEMP78));
                    
//#line 1168
Vec leftVec =
                      (X10_TEMP404);
                    
//#line 1169
final Vec X10_TEMP407 =
                      (myview.
                         from);
                    
//#line 1171
Vec X10_TEMP82 =
                      (X10_TEMP407);
                    
//#line 1172
final Ray X10_TEMP412 =
                      (new Ray(
                         X10_TEMP82,
                         _Program__RayTracer_voidVec));
                    
//#line 1174
Ray r =
                      (X10_TEMP412);
                    
//#line 1175
final x10.
                      lang.
                      region X10_TEMP415 =
                      (x10.
                        lang.
                        region)
                        ((my_dist.
                            region));
                    
//#line 1177
final x10.
                      lang.
                      region X10_TEMP85 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP415));
                    
//#line 1178
/* template:forloop-mult { */{
                    x10.lang.region __var30__ = (x10.lang.region) X10_TEMP85;
                    if (__var30__.size() > 0 && (__var30__ instanceof x10.array.MultiDimRegion || __var30__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var31__ = __var30__.rank(0).low(), __var32__ = __var30__.rank(0).high(); __var31__ <= __var32__; __var31__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int pixCounter = __var31__;
                    /* } */
                    /* } */
{
                        
//#line 1179
final int X10_TEMP419 =
                          (interval.
                             width);
                        
//#line 1181
final int X10_TEMP86 =
                          (X10_TEMP419);
                        
//#line 1182
final int X10_TEMP422 =
                          (pixCounter /
                             X10_TEMP86);
                        
//#line 1184
int y =
                          (X10_TEMP422);
                        
//#line 1185
final int X10_TEMP425 =
                          (interval.
                             width);
                        
//#line 1187
final int X10_TEMP88 =
                          (X10_TEMP425);
                        
//#line 1188
final int X10_TEMP428 =
                          (pixCounter %
                             X10_TEMP88);
                        
//#line 1190
int x =
                          (X10_TEMP428);
                        
//#line 1191
final double X10_TEMP431 =
                          (2.0);
                        
//#line 1193
final double X10_TEMP90 =
                          (X10_TEMP431);
                        
//#line 1194
final double X10_TEMP434 =
                          (X10_TEMP90 *
                             y);
                        
//#line 1196
final double X10_TEMP92 =
                          (X10_TEMP434);
                        
//#line 1197
final double X10_TEMP437 =
                          ((double)
                             X10_TEMP92);
                        
//#line 1199
final double X10_TEMP94 =
                          (X10_TEMP437);
                        
//#line 1200
final int X10_TEMP440 =
                          (interval.
                             width);
                        
//#line 1202
final int X10_TEMP93 =
                          (X10_TEMP440);
                        
//#line 1203
final double X10_TEMP443 =
                          ((double)
                             X10_TEMP93);
                        
//#line 1205
final double X10_TEMP95 =
                          (X10_TEMP443);
                        
//#line 1206
final double X10_TEMP446 =
                          (X10_TEMP94 /
                             X10_TEMP95);
                        
//#line 1208
final double X10_TEMP96 =
                          (X10_TEMP446);
                        
//#line 1209
final double X10_TEMP449 =
                          (1.0);
                        
//#line 1211
final double X10_TEMP97 =
                          (X10_TEMP449);
                        
//#line 1212
final double X10_TEMP452 =
                          (X10_TEMP96 -
                             X10_TEMP97);
                        
//#line 1214
double ylen =
                          (X10_TEMP452);
                        
//#line 1215
final double X10_TEMP455 =
                          (2.0);
                        
//#line 1217
final double X10_TEMP99 =
                          (X10_TEMP455);
                        
//#line 1218
final double X10_TEMP458 =
                          (X10_TEMP99 *
                             x);
                        
//#line 1220
final double X10_TEMP101 =
                          (X10_TEMP458);
                        
//#line 1221
final double X10_TEMP461 =
                          ((double)
                             X10_TEMP101);
                        
//#line 1223
final double X10_TEMP103 =
                          (X10_TEMP461);
                        
//#line 1224
final int X10_TEMP464 =
                          (interval.
                             width);
                        
//#line 1226
final int X10_TEMP102 =
                          (X10_TEMP464);
                        
//#line 1227
final double X10_TEMP467 =
                          ((double)
                             X10_TEMP102);
                        
//#line 1229
final double X10_TEMP104 =
                          (X10_TEMP467);
                        
//#line 1230
final double X10_TEMP470 =
                          (X10_TEMP103 /
                             X10_TEMP104);
                        
//#line 1232
final double X10_TEMP105 =
                          (X10_TEMP470);
                        
//#line 1233
final double X10_TEMP473 =
                          (1.0);
                        
//#line 1235
final double X10_TEMP106 =
                          (X10_TEMP473);
                        
//#line 1236
final double X10_TEMP476 =
                          (X10_TEMP105 -
                             X10_TEMP106);
                        
//#line 1238
double xlen =
                          (X10_TEMP476);
                        
//#line 1239
final Vec X10_TEMP483 =
                          (Program0.
                             Program_Vec_comb(
                             xlen,
                             leftVec,
                             ylen,
                             upVec));
                        
//#line 1241
final Vec X10_TEMP112 =
                          (X10_TEMP483);
                        
//#line 1242
final Vec X10_TEMP488 =
                          (Program0.
                             Program_Vec_added(
                             X10_TEMP112,
                             viewVec));
                        
//#line 1244
final Vec X10_TEMP114 =
                          (X10_TEMP488);
                        
//#line 1245
final Vec X10_TEMP492 =
                          (Program0.
                             Program_Vec_normalized(
                             X10_TEMP114));
                        
//#line 1247
final Vec X10_TEMP116 =
                          (X10_TEMP492);
                        
//#line 1248
final Ray X10_TEMP497 =
                          (Program0.
                             Program_Ray_d(
                             r,
                             X10_TEMP116));
                        
//#line 1250
final Ray X10_TEMP118 =
                          (X10_TEMP497);
                        
//#line 1251
final Ray X10_TEMP500 =
                          (X10_TEMP118);
                        
//#line 1253
r =
                          ((X10_TEMP500));
                        
//#line 1254
final int X10_TEMP503 =
                          (0);
                        
//#line 1256
final int X10_TEMP124 =
                          (X10_TEMP503);
                        
//#line 1257
final double X10_TEMP506 =
                          (1.0);
                        
//#line 1259
final double X10_TEMP125 =
                          (X10_TEMP506);
                        
//#line 1260
final Isect X10_TEMP509 =
                          (new Isect(
                             ));
                        
//#line 1262
final Isect X10_TEMP126 =
                          (X10_TEMP509);
                        
//#line 1263
final Ray X10_TEMP512 =
                          (new Ray(
                             ));
                        
//#line 1265
final Ray X10_TEMP127 =
                          (X10_TEMP512);
                        
//#line 1266
final Vec X10_TEMP521 =
                          (Program0.
                             Program_RayTracer_trace(
                             X10_TEMP0,
                             X10_TEMP124,
                             X10_TEMP125,
                             r,
                             X10_TEMP126,
                             X10_TEMP127));
                        
//#line 1268
Vec col =
                          (X10_TEMP521);
                        
//#line 1269
final double X10_TEMP524 =
                          (col.
                             x);
                        
//#line 1271
final double X10_TEMP129 =
                          (X10_TEMP524);
                        
//#line 1272
final double X10_TEMP527 =
                          (255.0);
                        
//#line 1274
final double X10_TEMP130 =
                          (X10_TEMP527);
                        
//#line 1275
final double X10_TEMP530 =
                          (X10_TEMP129 *
                             X10_TEMP130);
                        
//#line 1277
final double X10_TEMP132 =
                          (X10_TEMP530);
                        
//#line 1278
final int X10_TEMP533 =
                          ((int)
                             X10_TEMP132);
                        
//#line 1280
int red =
                          (X10_TEMP533);
                        
//#line 1281
final int X10_TEMP536 =
                          (255);
                        
//#line 1283
final int X10_TEMP134 =
                          (X10_TEMP536);
                        
//#line 1284
final boolean X10_TEMP136 =
                          (red >
                             X10_TEMP134);
                        
//#line 1285
if (X10_TEMP136) {
                            
//#line 1286
final int X10_TEMP541 =
                              (255);
                            
//#line 1288
final int X10_TEMP138 =
                              (X10_TEMP541);
                            
//#line 1289
final int X10_TEMP544 =
                              (X10_TEMP138);
                            
//#line 1291
red =
                              ((X10_TEMP544));
                        }
                        
//#line 1293
final double X10_TEMP547 =
                          (col.
                             y);
                        
//#line 1295
final double X10_TEMP139 =
                          (X10_TEMP547);
                        
//#line 1296
final double X10_TEMP550 =
                          (255.0);
                        
//#line 1298
final double X10_TEMP140 =
                          (X10_TEMP550);
                        
//#line 1299
final double X10_TEMP553 =
                          (X10_TEMP139 *
                             X10_TEMP140);
                        
//#line 1301
final double X10_TEMP142 =
                          (X10_TEMP553);
                        
//#line 1302
final int X10_TEMP556 =
                          ((int)
                             X10_TEMP142);
                        
//#line 1304
int green =
                          (X10_TEMP556);
                        
//#line 1305
final int X10_TEMP559 =
                          (255);
                        
//#line 1307
final int X10_TEMP144 =
                          (X10_TEMP559);
                        
//#line 1308
final boolean X10_TEMP146 =
                          (green >
                             X10_TEMP144);
                        
//#line 1309
if (X10_TEMP146) {
                            
//#line 1310
final int X10_TEMP564 =
                              (255);
                            
//#line 1312
final int X10_TEMP148 =
                              (X10_TEMP564);
                            
//#line 1313
final int X10_TEMP567 =
                              (X10_TEMP148);
                            
//#line 1315
green =
                              ((X10_TEMP567));
                        }
                        
//#line 1317
final double X10_TEMP570 =
                          (col.
                             z);
                        
//#line 1319
final double X10_TEMP149 =
                          (X10_TEMP570);
                        
//#line 1320
final double X10_TEMP573 =
                          (255.0);
                        
//#line 1322
final double X10_TEMP150 =
                          (X10_TEMP573);
                        
//#line 1323
final double X10_TEMP576 =
                          (X10_TEMP149 *
                             X10_TEMP150);
                        
//#line 1325
final double X10_TEMP152 =
                          (X10_TEMP576);
                        
//#line 1326
final int X10_TEMP579 =
                          ((int)
                             X10_TEMP152);
                        
//#line 1328
int blue =
                          (X10_TEMP579);
                        
//#line 1329
final int X10_TEMP582 =
                          (255);
                        
//#line 1331
final int X10_TEMP154 =
                          (X10_TEMP582);
                        
//#line 1332
final boolean X10_TEMP156 =
                          (blue >
                             X10_TEMP154);
                        
//#line 1333
if (X10_TEMP156) {
                            
//#line 1334
final int X10_TEMP587 =
                              (255);
                            
//#line 1336
final int X10_TEMP158 =
                              (X10_TEMP587);
                            
//#line 1337
final int X10_TEMP590 =
                              (X10_TEMP158);
                            
//#line 1339
blue =
                              ((X10_TEMP590));
                        }
                        
//#line 1341
final int X10_TEMP593 =
                          (red +
                             green);
                        
//#line 1343
final int X10_TEMP159 =
                          (X10_TEMP593);
                        
//#line 1344
final int X10_TEMP596 =
                          (X10_TEMP159 +
                             blue);
                        
//#line 1346
final long X10_TEMP161 =
                          (X10_TEMP596);
                        
//#line 1347
final long X10_TEMP599 =
                          (checksum1 +
                             X10_TEMP161);
                        
//#line 1349
checksum1 =
                          ((X10_TEMP599));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var3____ = (__var30__).iterator(); __var3____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var3__ = (x10.
                      lang.
                      point) __var3____.next();
                    	/* Join: { *//* Join: { */final int pixCounter =
                      /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                        
//#line 1179
final int X10_TEMP419 =
                          (interval.
                             width);
                        
//#line 1181
final int X10_TEMP86 =
                          (X10_TEMP419);
                        
//#line 1182
final int X10_TEMP422 =
                          (pixCounter /
                             X10_TEMP86);
                        
//#line 1184
int y =
                          (X10_TEMP422);
                        
//#line 1185
final int X10_TEMP425 =
                          (interval.
                             width);
                        
//#line 1187
final int X10_TEMP88 =
                          (X10_TEMP425);
                        
//#line 1188
final int X10_TEMP428 =
                          (pixCounter %
                             X10_TEMP88);
                        
//#line 1190
int x =
                          (X10_TEMP428);
                        
//#line 1191
final double X10_TEMP431 =
                          (2.0);
                        
//#line 1193
final double X10_TEMP90 =
                          (X10_TEMP431);
                        
//#line 1194
final double X10_TEMP434 =
                          (X10_TEMP90 *
                             y);
                        
//#line 1196
final double X10_TEMP92 =
                          (X10_TEMP434);
                        
//#line 1197
final double X10_TEMP437 =
                          ((double)
                             X10_TEMP92);
                        
//#line 1199
final double X10_TEMP94 =
                          (X10_TEMP437);
                        
//#line 1200
final int X10_TEMP440 =
                          (interval.
                             width);
                        
//#line 1202
final int X10_TEMP93 =
                          (X10_TEMP440);
                        
//#line 1203
final double X10_TEMP443 =
                          ((double)
                             X10_TEMP93);
                        
//#line 1205
final double X10_TEMP95 =
                          (X10_TEMP443);
                        
//#line 1206
final double X10_TEMP446 =
                          (X10_TEMP94 /
                             X10_TEMP95);
                        
//#line 1208
final double X10_TEMP96 =
                          (X10_TEMP446);
                        
//#line 1209
final double X10_TEMP449 =
                          (1.0);
                        
//#line 1211
final double X10_TEMP97 =
                          (X10_TEMP449);
                        
//#line 1212
final double X10_TEMP452 =
                          (X10_TEMP96 -
                             X10_TEMP97);
                        
//#line 1214
double ylen =
                          (X10_TEMP452);
                        
//#line 1215
final double X10_TEMP455 =
                          (2.0);
                        
//#line 1217
final double X10_TEMP99 =
                          (X10_TEMP455);
                        
//#line 1218
final double X10_TEMP458 =
                          (X10_TEMP99 *
                             x);
                        
//#line 1220
final double X10_TEMP101 =
                          (X10_TEMP458);
                        
//#line 1221
final double X10_TEMP461 =
                          ((double)
                             X10_TEMP101);
                        
//#line 1223
final double X10_TEMP103 =
                          (X10_TEMP461);
                        
//#line 1224
final int X10_TEMP464 =
                          (interval.
                             width);
                        
//#line 1226
final int X10_TEMP102 =
                          (X10_TEMP464);
                        
//#line 1227
final double X10_TEMP467 =
                          ((double)
                             X10_TEMP102);
                        
//#line 1229
final double X10_TEMP104 =
                          (X10_TEMP467);
                        
//#line 1230
final double X10_TEMP470 =
                          (X10_TEMP103 /
                             X10_TEMP104);
                        
//#line 1232
final double X10_TEMP105 =
                          (X10_TEMP470);
                        
//#line 1233
final double X10_TEMP473 =
                          (1.0);
                        
//#line 1235
final double X10_TEMP106 =
                          (X10_TEMP473);
                        
//#line 1236
final double X10_TEMP476 =
                          (X10_TEMP105 -
                             X10_TEMP106);
                        
//#line 1238
double xlen =
                          (X10_TEMP476);
                        
//#line 1239
final Vec X10_TEMP483 =
                          (Program0.
                             Program_Vec_comb(
                             xlen,
                             leftVec,
                             ylen,
                             upVec));
                        
//#line 1241
final Vec X10_TEMP112 =
                          (X10_TEMP483);
                        
//#line 1242
final Vec X10_TEMP488 =
                          (Program0.
                             Program_Vec_added(
                             X10_TEMP112,
                             viewVec));
                        
//#line 1244
final Vec X10_TEMP114 =
                          (X10_TEMP488);
                        
//#line 1245
final Vec X10_TEMP492 =
                          (Program0.
                             Program_Vec_normalized(
                             X10_TEMP114));
                        
//#line 1247
final Vec X10_TEMP116 =
                          (X10_TEMP492);
                        
//#line 1248
final Ray X10_TEMP497 =
                          (Program0.
                             Program_Ray_d(
                             r,
                             X10_TEMP116));
                        
//#line 1250
final Ray X10_TEMP118 =
                          (X10_TEMP497);
                        
//#line 1251
final Ray X10_TEMP500 =
                          (X10_TEMP118);
                        
//#line 1253
r =
                          ((X10_TEMP500));
                        
//#line 1254
final int X10_TEMP503 =
                          (0);
                        
//#line 1256
final int X10_TEMP124 =
                          (X10_TEMP503);
                        
//#line 1257
final double X10_TEMP506 =
                          (1.0);
                        
//#line 1259
final double X10_TEMP125 =
                          (X10_TEMP506);
                        
//#line 1260
final Isect X10_TEMP509 =
                          (new Isect(
                             ));
                        
//#line 1262
final Isect X10_TEMP126 =
                          (X10_TEMP509);
                        
//#line 1263
final Ray X10_TEMP512 =
                          (new Ray(
                             ));
                        
//#line 1265
final Ray X10_TEMP127 =
                          (X10_TEMP512);
                        
//#line 1266
final Vec X10_TEMP521 =
                          (Program0.
                             Program_RayTracer_trace(
                             X10_TEMP0,
                             X10_TEMP124,
                             X10_TEMP125,
                             r,
                             X10_TEMP126,
                             X10_TEMP127));
                        
//#line 1268
Vec col =
                          (X10_TEMP521);
                        
//#line 1269
final double X10_TEMP524 =
                          (col.
                             x);
                        
//#line 1271
final double X10_TEMP129 =
                          (X10_TEMP524);
                        
//#line 1272
final double X10_TEMP527 =
                          (255.0);
                        
//#line 1274
final double X10_TEMP130 =
                          (X10_TEMP527);
                        
//#line 1275
final double X10_TEMP530 =
                          (X10_TEMP129 *
                             X10_TEMP130);
                        
//#line 1277
final double X10_TEMP132 =
                          (X10_TEMP530);
                        
//#line 1278
final int X10_TEMP533 =
                          ((int)
                             X10_TEMP132);
                        
//#line 1280
int red =
                          (X10_TEMP533);
                        
//#line 1281
final int X10_TEMP536 =
                          (255);
                        
//#line 1283
final int X10_TEMP134 =
                          (X10_TEMP536);
                        
//#line 1284
final boolean X10_TEMP136 =
                          (red >
                             X10_TEMP134);
                        
//#line 1285
if (X10_TEMP136) {
                            
//#line 1286
final int X10_TEMP541 =
                              (255);
                            
//#line 1288
final int X10_TEMP138 =
                              (X10_TEMP541);
                            
//#line 1289
final int X10_TEMP544 =
                              (X10_TEMP138);
                            
//#line 1291
red =
                              ((X10_TEMP544));
                        }
                        
//#line 1293
final double X10_TEMP547 =
                          (col.
                             y);
                        
//#line 1295
final double X10_TEMP139 =
                          (X10_TEMP547);
                        
//#line 1296
final double X10_TEMP550 =
                          (255.0);
                        
//#line 1298
final double X10_TEMP140 =
                          (X10_TEMP550);
                        
//#line 1299
final double X10_TEMP553 =
                          (X10_TEMP139 *
                             X10_TEMP140);
                        
//#line 1301
final double X10_TEMP142 =
                          (X10_TEMP553);
                        
//#line 1302
final int X10_TEMP556 =
                          ((int)
                             X10_TEMP142);
                        
//#line 1304
int green =
                          (X10_TEMP556);
                        
//#line 1305
final int X10_TEMP559 =
                          (255);
                        
//#line 1307
final int X10_TEMP144 =
                          (X10_TEMP559);
                        
//#line 1308
final boolean X10_TEMP146 =
                          (green >
                             X10_TEMP144);
                        
//#line 1309
if (X10_TEMP146) {
                            
//#line 1310
final int X10_TEMP564 =
                              (255);
                            
//#line 1312
final int X10_TEMP148 =
                              (X10_TEMP564);
                            
//#line 1313
final int X10_TEMP567 =
                              (X10_TEMP148);
                            
//#line 1315
green =
                              ((X10_TEMP567));
                        }
                        
//#line 1317
final double X10_TEMP570 =
                          (col.
                             z);
                        
//#line 1319
final double X10_TEMP149 =
                          (X10_TEMP570);
                        
//#line 1320
final double X10_TEMP573 =
                          (255.0);
                        
//#line 1322
final double X10_TEMP150 =
                          (X10_TEMP573);
                        
//#line 1323
final double X10_TEMP576 =
                          (X10_TEMP149 *
                             X10_TEMP150);
                        
//#line 1325
final double X10_TEMP152 =
                          (X10_TEMP576);
                        
//#line 1326
final int X10_TEMP579 =
                          ((int)
                             X10_TEMP152);
                        
//#line 1328
int blue =
                          (X10_TEMP579);
                        
//#line 1329
final int X10_TEMP582 =
                          (255);
                        
//#line 1331
final int X10_TEMP154 =
                          (X10_TEMP582);
                        
//#line 1332
final boolean X10_TEMP156 =
                          (blue >
                             X10_TEMP154);
                        
//#line 1333
if (X10_TEMP156) {
                            
//#line 1334
final int X10_TEMP587 =
                              (255);
                            
//#line 1336
final int X10_TEMP158 =
                              (X10_TEMP587);
                            
//#line 1337
final int X10_TEMP590 =
                              (X10_TEMP158);
                            
//#line 1339
blue =
                              ((X10_TEMP590));
                        }
                        
//#line 1341
final int X10_TEMP593 =
                          (red +
                             green);
                        
//#line 1343
final int X10_TEMP159 =
                          (X10_TEMP593);
                        
//#line 1344
final int X10_TEMP596 =
                          (X10_TEMP159 +
                             blue);
                        
//#line 1346
final long X10_TEMP161 =
                          (X10_TEMP596);
                        
//#line 1347
final long X10_TEMP599 =
                          (checksum1 +
                             X10_TEMP161);
                        
//#line 1349
checksum1 =
                          ((X10_TEMP599));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                    
//#line 1351
final long X10_TEMP602 =
                      (checksum1);
                    
//#line 1353
final long checksumx =
                      (X10_TEMP602);
                    
//#line 1354
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 1355
/* template:Async { */(x10.lang.Runtime.asPlace(fp)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 1356
final x10.
                              lang.
                              LongReferenceArray X10_TEMP606 =
                              (x10.
                                lang.
                                LongReferenceArray)
                                ((/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.checkSumArray));
                            
//#line 1358
final x10.
                              lang.
                              LongReferenceArray X10_TEMP164 =
                              (x10.
                                lang.
                                LongReferenceArray)
                                ((X10_TEMP606));
                            
//#line 1359
final long X10_TEMP609 =
                              (checksumx);
                            
//#line 1361
final long X10_TEMP168 =
                              (X10_TEMP609);
                            
//#line 1362
final long X10_TEMP613 =
                              (X10_TEMP168);
                            
//#line 1364
final long X10_TEMP616 =
                              (X10_TEMP613);
                            
//#line 1365
/* template:array_set { */(X10_TEMP164).set((X10_TEMP616),pl)/* } */;
                        }
                        		}
                        	});/* } */
                    }
                    	} catch (Throwable tmp33) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp33);
                    	} finally {
                    		x10.lang.Runtime.getCurrentActivity().stopFinish();
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
            for (java.util.Iterator X10_TEMP31__ = (__var27__).iterator(); X10_TEMP31__.hasNext(); ) {
            	final  x10.
              lang.
              point X10_TEMP31 = (x10.
              lang.
              point) X10_TEMP31__.next();
            	/* Join: { *//* Join: { */final int pl =
              /* template:array_get { */((X10_TEMP31).get(0))/* } */;/* } */
{
                
//#line 1073
final x10.
                  lang.
                  dist X10_TEMP289 =
                  (x10.
                    lang.
                    dist)
                    ((U.
                        distribution));
                
//#line 1075
final x10.
                  lang.
                  dist X10_TEMP30 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP289));
                
//#line 1076
final x10.
                  lang.
                  place X10_TEMP32 =
                  (X10_TEMP30.
                     get(
                     X10_TEMP31));
                
//#line 1077
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP32)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1078
final x10.
                      lang.
                      place X10_TEMP295 =
                      (/* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 1080
final x10.
                      lang.
                      place X10_TEMP33 =
                      (X10_TEMP295);
                    
//#line 1081
final x10.
                      lang.
                      dist X10_TEMP298 =
                      (x10.
                        lang.
                        dist)
                        ((DBlock.
                            restriction(
                            X10_TEMP33)));
                    
//#line 1083
final x10.
                      lang.
                      dist my_dist =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP298));
                    
//#line 1084
final int X10_TEMP301 =
                      (0);
                    
//#line 1086
long checksum1 =
                      (X10_TEMP301);
                    
//#line 1087
final double X10_TEMP304 =
                      (myview.
                         distance);
                    
//#line 1089
final double X10_TEMP44 =
                      (X10_TEMP304);
                    
//#line 1090
final double X10_TEMP307 =
                      (myview.
                         angle);
                    
//#line 1092
final double X10_TEMP37 =
                      (X10_TEMP307);
                    
//#line 1093
final double X10_TEMP311 =
                      (java.
                         lang.
                         Math.
                         sin(
                         X10_TEMP37));
                    
//#line 1095
final double X10_TEMP40 =
                      (X10_TEMP311);
                    
//#line 1096
final double X10_TEMP314 =
                      (myview.
                         angle);
                    
//#line 1098
final double X10_TEMP39 =
                      (X10_TEMP314);
                    
//#line 1099
final double X10_TEMP318 =
                      (java.
                         lang.
                         Math.
                         cos(
                         X10_TEMP39));
                    
//#line 1101
final double X10_TEMP41 =
                      (X10_TEMP318);
                    
//#line 1102
final double X10_TEMP321 =
                      (X10_TEMP40 /
                         X10_TEMP41);
                    
//#line 1104
final double X10_TEMP43 =
                      (X10_TEMP321);
                    
//#line 1105
final double X10_TEMP324 =
                      (X10_TEMP44 *
                         X10_TEMP43);
                    
//#line 1107
double frustrumwidth =
                      (X10_TEMP324);
                    
//#line 1108
final Vec X10_TEMP327 =
                      (myview.
                         at);
                    
//#line 1110
final Vec X10_TEMP48 =
                      (X10_TEMP327);
                    
//#line 1111
final Vec X10_TEMP330 =
                      (myview.
                         from);
                    
//#line 1113
final Vec X10_TEMP49 =
                      (X10_TEMP330);
                    
//#line 1114
final Vec X10_TEMP335 =
                      (Program0.
                         Program_Vec_sub(
                         X10_TEMP48,
                         X10_TEMP49));
                    
//#line 1116
final Vec X10_TEMP50 =
                      (X10_TEMP335);
                    
//#line 1117
final Vec X10_TEMP339 =
                      (Program0.
                         Program_Vec_normalized(
                         X10_TEMP50));
                    
//#line 1119
Vec viewVec =
                      (X10_TEMP339);
                    
//#line 1120
final boolean X10_TEMP342 =
                      (false);
                    
//#line 1122
boolean X10_TEMP54 =
                      (X10_TEMP342);
                    
//#line 1123
final Vec X10_TEMP347 =
                      (new Vec(
                         viewVec,
                         X10_TEMP54));
                    
//#line 1125
final Vec X10_TEMP55 =
                      (X10_TEMP347);
                    
//#line 1126
final Vec X10_TEMP350 =
                      (myview.
                         up);
                    
//#line 1128
final Vec X10_TEMP58 =
                      (X10_TEMP350);
                    
//#line 1129
final double X10_TEMP355 =
                      (Program0.
                         Program_Vec_dot(
                         X10_TEMP58,
                         viewVec));
                    
//#line 1131
final double X10_TEMP60 =
                      (X10_TEMP355);
                    
//#line 1132
final Vec X10_TEMP360 =
                      (Program0.
                         Program_Vec_scale(
                         X10_TEMP55,
                         X10_TEMP60));
                    
//#line 1134
Vec tmpVec =
                      (X10_TEMP360);
                    
//#line 1135
final Vec X10_TEMP363 =
                      (myview.
                         up);
                    
//#line 1137
final Vec X10_TEMP64 =
                      (X10_TEMP363);
                    
//#line 1138
final Vec X10_TEMP368 =
                      (Program0.
                         Program_Vec_sub(
                         X10_TEMP64,
                         tmpVec));
                    
//#line 1140
final Vec X10_TEMP65 =
                      (X10_TEMP368);
                    
//#line 1141
final Vec X10_TEMP372 =
                      (Program0.
                         Program_Vec_normalized(
                         X10_TEMP65));
                    
//#line 1143
final Vec X10_TEMP66 =
                      (X10_TEMP372);
                    
//#line 1144
final int X10_TEMP67 =
                      (0);
                    
//#line 1145
final double X10_TEMP376 =
                      (X10_TEMP67 -
                         frustrumwidth);
                    
//#line 1147
final double X10_TEMP69 =
                      (X10_TEMP376);
                    
//#line 1148
final Vec X10_TEMP381 =
                      (Program0.
                         Program_Vec_scale(
                         X10_TEMP66,
                         X10_TEMP69));
                    
//#line 1150
Vec upVec =
                      (X10_TEMP381);
                    
//#line 1151
final Vec X10_TEMP384 =
                      (myview.
                         up);
                    
//#line 1153
final Vec X10_TEMP73 =
                      (X10_TEMP384);
                    
//#line 1154
final Vec X10_TEMP389 =
                      (Program0.
                         Program_Vec_cross(
                         X10_TEMP73,
                         viewVec));
                    
//#line 1156
final Vec X10_TEMP74 =
                      (X10_TEMP389);
                    
//#line 1157
final Vec X10_TEMP393 =
                      (Program0.
                         Program_Vec_normalized(
                         X10_TEMP74));
                    
//#line 1159
final Vec X10_TEMP75 =
                      (X10_TEMP393);
                    
//#line 1160
final double X10_TEMP396 =
                      (myview.
                         aspect);
                    
//#line 1162
final double X10_TEMP76 =
                      (X10_TEMP396);
                    
//#line 1163
final double X10_TEMP399 =
                      (X10_TEMP76 *
                         frustrumwidth);
                    
//#line 1165
final double X10_TEMP78 =
                      (X10_TEMP399);
                    
//#line 1166
final Vec X10_TEMP404 =
                      (Program0.
                         Program_Vec_scale(
                         X10_TEMP75,
                         X10_TEMP78));
                    
//#line 1168
Vec leftVec =
                      (X10_TEMP404);
                    
//#line 1169
final Vec X10_TEMP407 =
                      (myview.
                         from);
                    
//#line 1171
Vec X10_TEMP82 =
                      (X10_TEMP407);
                    
//#line 1172
final Ray X10_TEMP412 =
                      (new Ray(
                         X10_TEMP82,
                         _Program__RayTracer_voidVec));
                    
//#line 1174
Ray r =
                      (X10_TEMP412);
                    
//#line 1175
final x10.
                      lang.
                      region X10_TEMP415 =
                      (x10.
                        lang.
                        region)
                        ((my_dist.
                            region));
                    
//#line 1177
final x10.
                      lang.
                      region X10_TEMP85 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP415));
                    
//#line 1178
/* template:forloop-mult { */{
                    x10.lang.region __var34__ = (x10.lang.region) X10_TEMP85;
                    if (__var34__.size() > 0 && (__var34__ instanceof x10.array.MultiDimRegion || __var34__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var35__ = __var34__.rank(0).low(), __var36__ = __var34__.rank(0).high(); __var35__ <= __var36__; __var35__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int pixCounter = __var35__;
                    /* } */
                    /* } */
{
                        
//#line 1179
final int X10_TEMP419 =
                          (interval.
                             width);
                        
//#line 1181
final int X10_TEMP86 =
                          (X10_TEMP419);
                        
//#line 1182
final int X10_TEMP422 =
                          (pixCounter /
                             X10_TEMP86);
                        
//#line 1184
int y =
                          (X10_TEMP422);
                        
//#line 1185
final int X10_TEMP425 =
                          (interval.
                             width);
                        
//#line 1187
final int X10_TEMP88 =
                          (X10_TEMP425);
                        
//#line 1188
final int X10_TEMP428 =
                          (pixCounter %
                             X10_TEMP88);
                        
//#line 1190
int x =
                          (X10_TEMP428);
                        
//#line 1191
final double X10_TEMP431 =
                          (2.0);
                        
//#line 1193
final double X10_TEMP90 =
                          (X10_TEMP431);
                        
//#line 1194
final double X10_TEMP434 =
                          (X10_TEMP90 *
                             y);
                        
//#line 1196
final double X10_TEMP92 =
                          (X10_TEMP434);
                        
//#line 1197
final double X10_TEMP437 =
                          ((double)
                             X10_TEMP92);
                        
//#line 1199
final double X10_TEMP94 =
                          (X10_TEMP437);
                        
//#line 1200
final int X10_TEMP440 =
                          (interval.
                             width);
                        
//#line 1202
final int X10_TEMP93 =
                          (X10_TEMP440);
                        
//#line 1203
final double X10_TEMP443 =
                          ((double)
                             X10_TEMP93);
                        
//#line 1205
final double X10_TEMP95 =
                          (X10_TEMP443);
                        
//#line 1206
final double X10_TEMP446 =
                          (X10_TEMP94 /
                             X10_TEMP95);
                        
//#line 1208
final double X10_TEMP96 =
                          (X10_TEMP446);
                        
//#line 1209
final double X10_TEMP449 =
                          (1.0);
                        
//#line 1211
final double X10_TEMP97 =
                          (X10_TEMP449);
                        
//#line 1212
final double X10_TEMP452 =
                          (X10_TEMP96 -
                             X10_TEMP97);
                        
//#line 1214
double ylen =
                          (X10_TEMP452);
                        
//#line 1215
final double X10_TEMP455 =
                          (2.0);
                        
//#line 1217
final double X10_TEMP99 =
                          (X10_TEMP455);
                        
//#line 1218
final double X10_TEMP458 =
                          (X10_TEMP99 *
                             x);
                        
//#line 1220
final double X10_TEMP101 =
                          (X10_TEMP458);
                        
//#line 1221
final double X10_TEMP461 =
                          ((double)
                             X10_TEMP101);
                        
//#line 1223
final double X10_TEMP103 =
                          (X10_TEMP461);
                        
//#line 1224
final int X10_TEMP464 =
                          (interval.
                             width);
                        
//#line 1226
final int X10_TEMP102 =
                          (X10_TEMP464);
                        
//#line 1227
final double X10_TEMP467 =
                          ((double)
                             X10_TEMP102);
                        
//#line 1229
final double X10_TEMP104 =
                          (X10_TEMP467);
                        
//#line 1230
final double X10_TEMP470 =
                          (X10_TEMP103 /
                             X10_TEMP104);
                        
//#line 1232
final double X10_TEMP105 =
                          (X10_TEMP470);
                        
//#line 1233
final double X10_TEMP473 =
                          (1.0);
                        
//#line 1235
final double X10_TEMP106 =
                          (X10_TEMP473);
                        
//#line 1236
final double X10_TEMP476 =
                          (X10_TEMP105 -
                             X10_TEMP106);
                        
//#line 1238
double xlen =
                          (X10_TEMP476);
                        
//#line 1239
final Vec X10_TEMP483 =
                          (Program0.
                             Program_Vec_comb(
                             xlen,
                             leftVec,
                             ylen,
                             upVec));
                        
//#line 1241
final Vec X10_TEMP112 =
                          (X10_TEMP483);
                        
//#line 1242
final Vec X10_TEMP488 =
                          (Program0.
                             Program_Vec_added(
                             X10_TEMP112,
                             viewVec));
                        
//#line 1244
final Vec X10_TEMP114 =
                          (X10_TEMP488);
                        
//#line 1245
final Vec X10_TEMP492 =
                          (Program0.
                             Program_Vec_normalized(
                             X10_TEMP114));
                        
//#line 1247
final Vec X10_TEMP116 =
                          (X10_TEMP492);
                        
//#line 1248
final Ray X10_TEMP497 =
                          (Program0.
                             Program_Ray_d(
                             r,
                             X10_TEMP116));
                        
//#line 1250
final Ray X10_TEMP118 =
                          (X10_TEMP497);
                        
//#line 1251
final Ray X10_TEMP500 =
                          (X10_TEMP118);
                        
//#line 1253
r =
                          ((X10_TEMP500));
                        
//#line 1254
final int X10_TEMP503 =
                          (0);
                        
//#line 1256
final int X10_TEMP124 =
                          (X10_TEMP503);
                        
//#line 1257
final double X10_TEMP506 =
                          (1.0);
                        
//#line 1259
final double X10_TEMP125 =
                          (X10_TEMP506);
                        
//#line 1260
final Isect X10_TEMP509 =
                          (new Isect(
                             ));
                        
//#line 1262
final Isect X10_TEMP126 =
                          (X10_TEMP509);
                        
//#line 1263
final Ray X10_TEMP512 =
                          (new Ray(
                             ));
                        
//#line 1265
final Ray X10_TEMP127 =
                          (X10_TEMP512);
                        
//#line 1266
final Vec X10_TEMP521 =
                          (Program0.
                             Program_RayTracer_trace(
                             X10_TEMP0,
                             X10_TEMP124,
                             X10_TEMP125,
                             r,
                             X10_TEMP126,
                             X10_TEMP127));
                        
//#line 1268
Vec col =
                          (X10_TEMP521);
                        
//#line 1269
final double X10_TEMP524 =
                          (col.
                             x);
                        
//#line 1271
final double X10_TEMP129 =
                          (X10_TEMP524);
                        
//#line 1272
final double X10_TEMP527 =
                          (255.0);
                        
//#line 1274
final double X10_TEMP130 =
                          (X10_TEMP527);
                        
//#line 1275
final double X10_TEMP530 =
                          (X10_TEMP129 *
                             X10_TEMP130);
                        
//#line 1277
final double X10_TEMP132 =
                          (X10_TEMP530);
                        
//#line 1278
final int X10_TEMP533 =
                          ((int)
                             X10_TEMP132);
                        
//#line 1280
int red =
                          (X10_TEMP533);
                        
//#line 1281
final int X10_TEMP536 =
                          (255);
                        
//#line 1283
final int X10_TEMP134 =
                          (X10_TEMP536);
                        
//#line 1284
final boolean X10_TEMP136 =
                          (red >
                             X10_TEMP134);
                        
//#line 1285
if (X10_TEMP136) {
                            
//#line 1286
final int X10_TEMP541 =
                              (255);
                            
//#line 1288
final int X10_TEMP138 =
                              (X10_TEMP541);
                            
//#line 1289
final int X10_TEMP544 =
                              (X10_TEMP138);
                            
//#line 1291
red =
                              ((X10_TEMP544));
                        }
                        
//#line 1293
final double X10_TEMP547 =
                          (col.
                             y);
                        
//#line 1295
final double X10_TEMP139 =
                          (X10_TEMP547);
                        
//#line 1296
final double X10_TEMP550 =
                          (255.0);
                        
//#line 1298
final double X10_TEMP140 =
                          (X10_TEMP550);
                        
//#line 1299
final double X10_TEMP553 =
                          (X10_TEMP139 *
                             X10_TEMP140);
                        
//#line 1301
final double X10_TEMP142 =
                          (X10_TEMP553);
                        
//#line 1302
final int X10_TEMP556 =
                          ((int)
                             X10_TEMP142);
                        
//#line 1304
int green =
                          (X10_TEMP556);
                        
//#line 1305
final int X10_TEMP559 =
                          (255);
                        
//#line 1307
final int X10_TEMP144 =
                          (X10_TEMP559);
                        
//#line 1308
final boolean X10_TEMP146 =
                          (green >
                             X10_TEMP144);
                        
//#line 1309
if (X10_TEMP146) {
                            
//#line 1310
final int X10_TEMP564 =
                              (255);
                            
//#line 1312
final int X10_TEMP148 =
                              (X10_TEMP564);
                            
//#line 1313
final int X10_TEMP567 =
                              (X10_TEMP148);
                            
//#line 1315
green =
                              ((X10_TEMP567));
                        }
                        
//#line 1317
final double X10_TEMP570 =
                          (col.
                             z);
                        
//#line 1319
final double X10_TEMP149 =
                          (X10_TEMP570);
                        
//#line 1320
final double X10_TEMP573 =
                          (255.0);
                        
//#line 1322
final double X10_TEMP150 =
                          (X10_TEMP573);
                        
//#line 1323
final double X10_TEMP576 =
                          (X10_TEMP149 *
                             X10_TEMP150);
                        
//#line 1325
final double X10_TEMP152 =
                          (X10_TEMP576);
                        
//#line 1326
final int X10_TEMP579 =
                          ((int)
                             X10_TEMP152);
                        
//#line 1328
int blue =
                          (X10_TEMP579);
                        
//#line 1329
final int X10_TEMP582 =
                          (255);
                        
//#line 1331
final int X10_TEMP154 =
                          (X10_TEMP582);
                        
//#line 1332
final boolean X10_TEMP156 =
                          (blue >
                             X10_TEMP154);
                        
//#line 1333
if (X10_TEMP156) {
                            
//#line 1334
final int X10_TEMP587 =
                              (255);
                            
//#line 1336
final int X10_TEMP158 =
                              (X10_TEMP587);
                            
//#line 1337
final int X10_TEMP590 =
                              (X10_TEMP158);
                            
//#line 1339
blue =
                              ((X10_TEMP590));
                        }
                        
//#line 1341
final int X10_TEMP593 =
                          (red +
                             green);
                        
//#line 1343
final int X10_TEMP159 =
                          (X10_TEMP593);
                        
//#line 1344
final int X10_TEMP596 =
                          (X10_TEMP159 +
                             blue);
                        
//#line 1346
final long X10_TEMP161 =
                          (X10_TEMP596);
                        
//#line 1347
final long X10_TEMP599 =
                          (checksum1 +
                             X10_TEMP161);
                        
//#line 1349
checksum1 =
                          ((X10_TEMP599));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var3____ = (__var34__).iterator(); __var3____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var3__ = (x10.
                      lang.
                      point) __var3____.next();
                    	/* Join: { *//* Join: { */final int pixCounter =
                      /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                        
//#line 1179
final int X10_TEMP419 =
                          (interval.
                             width);
                        
//#line 1181
final int X10_TEMP86 =
                          (X10_TEMP419);
                        
//#line 1182
final int X10_TEMP422 =
                          (pixCounter /
                             X10_TEMP86);
                        
//#line 1184
int y =
                          (X10_TEMP422);
                        
//#line 1185
final int X10_TEMP425 =
                          (interval.
                             width);
                        
//#line 1187
final int X10_TEMP88 =
                          (X10_TEMP425);
                        
//#line 1188
final int X10_TEMP428 =
                          (pixCounter %
                             X10_TEMP88);
                        
//#line 1190
int x =
                          (X10_TEMP428);
                        
//#line 1191
final double X10_TEMP431 =
                          (2.0);
                        
//#line 1193
final double X10_TEMP90 =
                          (X10_TEMP431);
                        
//#line 1194
final double X10_TEMP434 =
                          (X10_TEMP90 *
                             y);
                        
//#line 1196
final double X10_TEMP92 =
                          (X10_TEMP434);
                        
//#line 1197
final double X10_TEMP437 =
                          ((double)
                             X10_TEMP92);
                        
//#line 1199
final double X10_TEMP94 =
                          (X10_TEMP437);
                        
//#line 1200
final int X10_TEMP440 =
                          (interval.
                             width);
                        
//#line 1202
final int X10_TEMP93 =
                          (X10_TEMP440);
                        
//#line 1203
final double X10_TEMP443 =
                          ((double)
                             X10_TEMP93);
                        
//#line 1205
final double X10_TEMP95 =
                          (X10_TEMP443);
                        
//#line 1206
final double X10_TEMP446 =
                          (X10_TEMP94 /
                             X10_TEMP95);
                        
//#line 1208
final double X10_TEMP96 =
                          (X10_TEMP446);
                        
//#line 1209
final double X10_TEMP449 =
                          (1.0);
                        
//#line 1211
final double X10_TEMP97 =
                          (X10_TEMP449);
                        
//#line 1212
final double X10_TEMP452 =
                          (X10_TEMP96 -
                             X10_TEMP97);
                        
//#line 1214
double ylen =
                          (X10_TEMP452);
                        
//#line 1215
final double X10_TEMP455 =
                          (2.0);
                        
//#line 1217
final double X10_TEMP99 =
                          (X10_TEMP455);
                        
//#line 1218
final double X10_TEMP458 =
                          (X10_TEMP99 *
                             x);
                        
//#line 1220
final double X10_TEMP101 =
                          (X10_TEMP458);
                        
//#line 1221
final double X10_TEMP461 =
                          ((double)
                             X10_TEMP101);
                        
//#line 1223
final double X10_TEMP103 =
                          (X10_TEMP461);
                        
//#line 1224
final int X10_TEMP464 =
                          (interval.
                             width);
                        
//#line 1226
final int X10_TEMP102 =
                          (X10_TEMP464);
                        
//#line 1227
final double X10_TEMP467 =
                          ((double)
                             X10_TEMP102);
                        
//#line 1229
final double X10_TEMP104 =
                          (X10_TEMP467);
                        
//#line 1230
final double X10_TEMP470 =
                          (X10_TEMP103 /
                             X10_TEMP104);
                        
//#line 1232
final double X10_TEMP105 =
                          (X10_TEMP470);
                        
//#line 1233
final double X10_TEMP473 =
                          (1.0);
                        
//#line 1235
final double X10_TEMP106 =
                          (X10_TEMP473);
                        
//#line 1236
final double X10_TEMP476 =
                          (X10_TEMP105 -
                             X10_TEMP106);
                        
//#line 1238
double xlen =
                          (X10_TEMP476);
                        
//#line 1239
final Vec X10_TEMP483 =
                          (Program0.
                             Program_Vec_comb(
                             xlen,
                             leftVec,
                             ylen,
                             upVec));
                        
//#line 1241
final Vec X10_TEMP112 =
                          (X10_TEMP483);
                        
//#line 1242
final Vec X10_TEMP488 =
                          (Program0.
                             Program_Vec_added(
                             X10_TEMP112,
                             viewVec));
                        
//#line 1244
final Vec X10_TEMP114 =
                          (X10_TEMP488);
                        
//#line 1245
final Vec X10_TEMP492 =
                          (Program0.
                             Program_Vec_normalized(
                             X10_TEMP114));
                        
//#line 1247
final Vec X10_TEMP116 =
                          (X10_TEMP492);
                        
//#line 1248
final Ray X10_TEMP497 =
                          (Program0.
                             Program_Ray_d(
                             r,
                             X10_TEMP116));
                        
//#line 1250
final Ray X10_TEMP118 =
                          (X10_TEMP497);
                        
//#line 1251
final Ray X10_TEMP500 =
                          (X10_TEMP118);
                        
//#line 1253
r =
                          ((X10_TEMP500));
                        
//#line 1254
final int X10_TEMP503 =
                          (0);
                        
//#line 1256
final int X10_TEMP124 =
                          (X10_TEMP503);
                        
//#line 1257
final double X10_TEMP506 =
                          (1.0);
                        
//#line 1259
final double X10_TEMP125 =
                          (X10_TEMP506);
                        
//#line 1260
final Isect X10_TEMP509 =
                          (new Isect(
                             ));
                        
//#line 1262
final Isect X10_TEMP126 =
                          (X10_TEMP509);
                        
//#line 1263
final Ray X10_TEMP512 =
                          (new Ray(
                             ));
                        
//#line 1265
final Ray X10_TEMP127 =
                          (X10_TEMP512);
                        
//#line 1266
final Vec X10_TEMP521 =
                          (Program0.
                             Program_RayTracer_trace(
                             X10_TEMP0,
                             X10_TEMP124,
                             X10_TEMP125,
                             r,
                             X10_TEMP126,
                             X10_TEMP127));
                        
//#line 1268
Vec col =
                          (X10_TEMP521);
                        
//#line 1269
final double X10_TEMP524 =
                          (col.
                             x);
                        
//#line 1271
final double X10_TEMP129 =
                          (X10_TEMP524);
                        
//#line 1272
final double X10_TEMP527 =
                          (255.0);
                        
//#line 1274
final double X10_TEMP130 =
                          (X10_TEMP527);
                        
//#line 1275
final double X10_TEMP530 =
                          (X10_TEMP129 *
                             X10_TEMP130);
                        
//#line 1277
final double X10_TEMP132 =
                          (X10_TEMP530);
                        
//#line 1278
final int X10_TEMP533 =
                          ((int)
                             X10_TEMP132);
                        
//#line 1280
int red =
                          (X10_TEMP533);
                        
//#line 1281
final int X10_TEMP536 =
                          (255);
                        
//#line 1283
final int X10_TEMP134 =
                          (X10_TEMP536);
                        
//#line 1284
final boolean X10_TEMP136 =
                          (red >
                             X10_TEMP134);
                        
//#line 1285
if (X10_TEMP136) {
                            
//#line 1286
final int X10_TEMP541 =
                              (255);
                            
//#line 1288
final int X10_TEMP138 =
                              (X10_TEMP541);
                            
//#line 1289
final int X10_TEMP544 =
                              (X10_TEMP138);
                            
//#line 1291
red =
                              ((X10_TEMP544));
                        }
                        
//#line 1293
final double X10_TEMP547 =
                          (col.
                             y);
                        
//#line 1295
final double X10_TEMP139 =
                          (X10_TEMP547);
                        
//#line 1296
final double X10_TEMP550 =
                          (255.0);
                        
//#line 1298
final double X10_TEMP140 =
                          (X10_TEMP550);
                        
//#line 1299
final double X10_TEMP553 =
                          (X10_TEMP139 *
                             X10_TEMP140);
                        
//#line 1301
final double X10_TEMP142 =
                          (X10_TEMP553);
                        
//#line 1302
final int X10_TEMP556 =
                          ((int)
                             X10_TEMP142);
                        
//#line 1304
int green =
                          (X10_TEMP556);
                        
//#line 1305
final int X10_TEMP559 =
                          (255);
                        
//#line 1307
final int X10_TEMP144 =
                          (X10_TEMP559);
                        
//#line 1308
final boolean X10_TEMP146 =
                          (green >
                             X10_TEMP144);
                        
//#line 1309
if (X10_TEMP146) {
                            
//#line 1310
final int X10_TEMP564 =
                              (255);
                            
//#line 1312
final int X10_TEMP148 =
                              (X10_TEMP564);
                            
//#line 1313
final int X10_TEMP567 =
                              (X10_TEMP148);
                            
//#line 1315
green =
                              ((X10_TEMP567));
                        }
                        
//#line 1317
final double X10_TEMP570 =
                          (col.
                             z);
                        
//#line 1319
final double X10_TEMP149 =
                          (X10_TEMP570);
                        
//#line 1320
final double X10_TEMP573 =
                          (255.0);
                        
//#line 1322
final double X10_TEMP150 =
                          (X10_TEMP573);
                        
//#line 1323
final double X10_TEMP576 =
                          (X10_TEMP149 *
                             X10_TEMP150);
                        
//#line 1325
final double X10_TEMP152 =
                          (X10_TEMP576);
                        
//#line 1326
final int X10_TEMP579 =
                          ((int)
                             X10_TEMP152);
                        
//#line 1328
int blue =
                          (X10_TEMP579);
                        
//#line 1329
final int X10_TEMP582 =
                          (255);
                        
//#line 1331
final int X10_TEMP154 =
                          (X10_TEMP582);
                        
//#line 1332
final boolean X10_TEMP156 =
                          (blue >
                             X10_TEMP154);
                        
//#line 1333
if (X10_TEMP156) {
                            
//#line 1334
final int X10_TEMP587 =
                              (255);
                            
//#line 1336
final int X10_TEMP158 =
                              (X10_TEMP587);
                            
//#line 1337
final int X10_TEMP590 =
                              (X10_TEMP158);
                            
//#line 1339
blue =
                              ((X10_TEMP590));
                        }
                        
//#line 1341
final int X10_TEMP593 =
                          (red +
                             green);
                        
//#line 1343
final int X10_TEMP159 =
                          (X10_TEMP593);
                        
//#line 1344
final int X10_TEMP596 =
                          (X10_TEMP159 +
                             blue);
                        
//#line 1346
final long X10_TEMP161 =
                          (X10_TEMP596);
                        
//#line 1347
final long X10_TEMP599 =
                          (checksum1 +
                             X10_TEMP161);
                        
//#line 1349
checksum1 =
                          ((X10_TEMP599));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                    
//#line 1351
final long X10_TEMP602 =
                      (checksum1);
                    
//#line 1353
final long checksumx =
                      (X10_TEMP602);
                    
//#line 1354
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 1355
/* template:Async { */(x10.lang.Runtime.asPlace(fp)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 1356
final x10.
                              lang.
                              LongReferenceArray X10_TEMP606 =
                              (x10.
                                lang.
                                LongReferenceArray)
                                ((/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.checkSumArray));
                            
//#line 1358
final x10.
                              lang.
                              LongReferenceArray X10_TEMP164 =
                              (x10.
                                lang.
                                LongReferenceArray)
                                ((X10_TEMP606));
                            
//#line 1359
final long X10_TEMP609 =
                              (checksumx);
                            
//#line 1361
final long X10_TEMP168 =
                              (X10_TEMP609);
                            
//#line 1362
final long X10_TEMP613 =
                              (X10_TEMP168);
                            
//#line 1364
final long X10_TEMP616 =
                              (X10_TEMP613);
                            
//#line 1365
/* template:array_set { */(X10_TEMP164).set((X10_TEMP616),pl)/* } */;
                        }
                        		}
                        	});/* } */
                    }
                    	} catch (Throwable tmp37) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp37);
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
            }
            /* } */
            
        }
        	} catch (Throwable tmp26) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp26);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1371
final x10.
          lang.
          LongReferenceArray X10_TEMP618 =
          (x10.
            lang.
            LongReferenceArray)
            ((/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.checkSumArray));
        
//#line 1373
final x10.
          lang.
          LongReferenceArray X10_TEMP169 =
          (x10.
            lang.
            LongReferenceArray)
            ((X10_TEMP618));
        
//#line 1374
final x10.
          lang.
          dist X10_TEMP621 =
          (x10.
            lang.
            dist)
            ((X10_TEMP169.
                distribution));
        
//#line 1376
final x10.
          lang.
          dist X10_TEMP170 =
          (x10.
            lang.
            dist)
            ((X10_TEMP621));
        
//#line 1377
final x10.
          lang.
          region X10_TEMP624 =
          (x10.
            lang.
            region)
            ((X10_TEMP170.
                region));
        
//#line 1379
final x10.
          lang.
          region regSum =
          (x10.
            lang.
            region)
            ((X10_TEMP624));
        
//#line 1380
/* template:forloop-mult { */{
        x10.lang.region __var38__ = (x10.lang.region) chkSumReg;
        if (__var38__.size() > 0 && (__var38__ instanceof x10.array.MultiDimRegion || __var38__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var39__ = __var38__.rank(0).low(), __var40__ = __var38__.rank(0).high(); __var39__ <= __var40__; __var39__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var39__;
        /* } */
        /* } */
{
            
//#line 1381
final x10.
              lang.
              LongReferenceArray X10_TEMP628 =
              (x10.
                lang.
                LongReferenceArray)
                ((/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.checkSumArray));
            
//#line 1383
final x10.
              lang.
              LongReferenceArray X10_TEMP173 =
              (x10.
                lang.
                LongReferenceArray)
                ((X10_TEMP628));
            
//#line 1384
final long X10_TEMP631 =
              (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.checksum);
            
//#line 1386
final long X10_TEMP176 =
              (X10_TEMP631);
            
//#line 1387
final long X10_TEMP635 =
              (/* template:array_get { */((X10_TEMP173).get(i))/* } */);
            
//#line 1389
final long X10_TEMP177 =
              (X10_TEMP635);
            
//#line 1390
final long X10_TEMP638 =
              (X10_TEMP176 +
                 X10_TEMP177);
            
//#line 1392
final long X10_TEMP178 =
              (X10_TEMP638);
            
//#line 1393
final long X10_TEMP641 =
              (X10_TEMP178);
            
//#line 1395
final long X10_TEMP644 =
              (X10_TEMP641);
            
//#line 1396
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.checksum =
              ((X10_TEMP644));
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var4____ = (__var38__).iterator(); __var4____.hasNext(); ) {
        	final  x10.
          lang.
          point __var4__ = (x10.
          lang.
          point) __var4____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
            
//#line 1381
final x10.
              lang.
              LongReferenceArray X10_TEMP628 =
              (x10.
                lang.
                LongReferenceArray)
                ((/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.checkSumArray));
            
//#line 1383
final x10.
              lang.
              LongReferenceArray X10_TEMP173 =
              (x10.
                lang.
                LongReferenceArray)
                ((X10_TEMP628));
            
//#line 1384
final long X10_TEMP631 =
              (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.checksum);
            
//#line 1386
final long X10_TEMP176 =
              (X10_TEMP631);
            
//#line 1387
final long X10_TEMP635 =
              (/* template:array_get { */((X10_TEMP173).get(i))/* } */);
            
//#line 1389
final long X10_TEMP177 =
              (X10_TEMP635);
            
//#line 1390
final long X10_TEMP638 =
              (X10_TEMP176 +
                 X10_TEMP177);
            
//#line 1392
final long X10_TEMP178 =
              (X10_TEMP638);
            
//#line 1393
final long X10_TEMP641 =
              (X10_TEMP178);
            
//#line 1395
final long X10_TEMP644 =
              (X10_TEMP641);
            
//#line 1396
/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.checksum =
              ((X10_TEMP644));
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
    }
    
    
//#line 1399
public static boolean
                    Program_RayTracer_intersect(
                    final RayTracer X10_TEMP0,
                    final Ray r,
                    final double maxt,
                    final Isect inter) {
        
//#line 1400
Ray X10_TEMP1 =
          (r);
        
//#line 1401
double X10_TEMP2 =
          (maxt);
        
//#line 1402
Isect X10_TEMP3 =
          (inter);
        
//#line 1403
final int X10_TEMP220 =
          (0);
        
//#line 1405
int nhits =
          (X10_TEMP220);
        
//#line 1406
final double X10_TEMP223 =
          (1.0E9);
        
//#line 1408
final double X10_TEMP7 =
          (X10_TEMP223);
        
//#line 1409
final double X10_TEMP226 =
          (X10_TEMP7);
        
//#line 1411
final double X10_TEMP8 =
          (X10_TEMP226);
        
//#line 1412
final double X10_TEMP229 =
          (X10_TEMP8);
        
//#line 1414
final double X10_TEMP232 =
          (X10_TEMP229);
        
//#line 1415
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(X10_TEMP3))/* } */.t =
          ((X10_TEMP232));
        
//#line 1416
final x10.
          lang.
          place X10_TEMP234 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1418
final x10.
          lang.
          place h =
          (X10_TEMP234);
        
//#line 1419
final int X10_TEMP237 =
          (0);
        
//#line 1421
final int X10_TEMP12 =
          (X10_TEMP237);
        
//#line 1422
final int X10_TEMP240 =
          (0);
        
//#line 1424
final int X10_TEMP13 =
          (X10_TEMP240);
        
//#line 1425
final x10.
          lang.
          region X10_TEMP245 =
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
                  X10_TEMP12,
                  X10_TEMP13))));
        
//#line 1427
final x10.
          lang.
          region X10_TEMP14 =
          (x10.
            lang.
            region)
            ((X10_TEMP245));
        
//#line 1428
final x10.
          lang.
          place X10_TEMP248 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1430
final x10.
          lang.
          place X10_TEMP15 =
          (X10_TEMP248);
        
//#line 1431
final x10.
          lang.
          dist X10_TEMP251 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                X10_TEMP14,
                X10_TEMP15)));
        
//#line 1433
final x10.
          lang.
          dist dTemp =
          (x10.
            lang.
            dist)
            ((X10_TEMP251));
        
//#line 1434
final x10.
          lang.
          GenericReferenceArray X10_TEMP254 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dTemp,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
        
//#line 1436
final x10.
          lang.
          GenericReferenceArray temp =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP254));
        
//#line 1437
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1438
final x10.
              lang.
              place X10_TEMP19 =
              (x10.
                 lang.
                 place.
                 FIRST_PLACE);
            
//#line 1439
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP19)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 1440
final int X10_TEMP259 =
                  (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.objCount);
                
//#line 1442
final int tempobjCount =
                  (X10_TEMP259);
                
//#line 1443
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP262 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.prim));
                
//#line 1445
final x10.
                  lang.
                  GenericReferenceArray tempprim =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP262));
                
//#line 1446
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1447
final int X10_TEMP266 =
                      (0);
                    
//#line 1449
final int X10_TEMP24 =
                      (X10_TEMP266);
                    
//#line 1450
final Envelope X10_TEMP271 =
                      (new Envelope(
                         tempobjCount,
                         tempprim));
                    
//#line 1452
final Envelope X10_TEMP29 =
                      (X10_TEMP271);
                    
//#line 1453
final Envelope X10_TEMP274 =
                      (X10_TEMP29);
                    
//#line 1455
final Envelope X10_TEMP30 =
                      (X10_TEMP274);
                    
//#line 1456
final Envelope X10_TEMP278 =
                      (X10_TEMP30);
                    
//#line 1458
final Envelope X10_TEMP281 =
                      (X10_TEMP278);
                    
//#line 1459
/* template:array_set { */(temp).set((X10_TEMP281),X10_TEMP24)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp41) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp41);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1463
final int X10_TEMP283 =
          (0);
        
//#line 1465
final int X10_TEMP32 =
          (X10_TEMP283);
        
//#line 1466
final Envelope X10_TEMP287 =
          (/* template:parametric { */((Envelope)(/* template:array_get { */((temp).get(X10_TEMP32))/* } */))/* } */);
        
//#line 1468
final Envelope X10_TEMP33 =
          (X10_TEMP287);
        
//#line 1469
final int X10_TEMP290 =
          (X10_TEMP33.
             i);
        
//#line 1471
final int myobjCount =
          (X10_TEMP290);
        
//#line 1472
final int X10_TEMP293 =
          (0);
        
//#line 1474
final int X10_TEMP36 =
          (X10_TEMP293);
        
//#line 1475
final Envelope X10_TEMP297 =
          (/* template:parametric { */((Envelope)(/* template:array_get { */((temp).get(X10_TEMP36))/* } */))/* } */);
        
//#line 1477
final Envelope X10_TEMP37 =
          (X10_TEMP297);
        
//#line 1478
final x10.
          lang.
          GenericReferenceArray X10_TEMP300 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP37.
                a));
        
//#line 1480
final x10.
          lang.
          GenericReferenceArray X10_TEMP39 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP300));
        
//#line 1481
final x10.
          lang.
          GenericReferenceArray X10_TEMP303 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP39));
        
//#line 1483
final x10.
          lang.
          GenericReferenceArray myprim =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP303));
        
//#line 1484
final int X10_TEMP306 =
          (0);
        
//#line 1486
final int X10_TEMP44 =
          (X10_TEMP306);
        
//#line 1487
final int X10_TEMP309 =
          (1);
        
//#line 1489
final int X10_TEMP42 =
          (X10_TEMP309);
        
//#line 1490
final int X10_TEMP312 =
          (myobjCount -
             X10_TEMP42);
        
//#line 1492
final int X10_TEMP45 =
          (X10_TEMP312);
        
//#line 1493
final x10.
          lang.
          region X10_TEMP317 =
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
                  X10_TEMP44,
                  X10_TEMP45))));
        
//#line 1495
final x10.
          lang.
          region X10_TEMP47 =
          (x10.
            lang.
            region)
            ((X10_TEMP317));
        
//#line 1496
/* template:forloop-mult { */{
        x10.lang.region __var42__ = (x10.lang.region) X10_TEMP47;
        if (__var42__.size() > 0 && (__var42__ instanceof x10.array.MultiDimRegion || __var42__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var43__ = __var42__.rank(0).low(), __var44__ = __var42__.rank(0).high(); __var43__ <= __var44__; __var43__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var43__;
        /* } */
        /* } */
{
            
//#line 1497
final Sphere X10_TEMP322 =
              (/* template:parametric { */((Sphere)(/* template:array_get { */((myprim).get(i))/* } */))/* } */);
            
//#line 1499
final Sphere X10_TEMP49 =
              (X10_TEMP322);
            
//#line 1500
final Isect X10_TEMP327 =
              (Program0.
                 Program_Sphere_intersect(
                 X10_TEMP49,
                 X10_TEMP1));
            
//#line 1502
Isect tp =
              (X10_TEMP327);
            
//#line 1503
final boolean X10_TEMP330 =
              (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.isNull);
            
//#line 1505
final boolean X10_TEMP52 =
              (X10_TEMP330);
            
//#line 1506
final boolean X10_TEMP333 =
              (!X10_TEMP52);
            
//#line 1508
final boolean X10_TEMP55 =
              (X10_TEMP333);
            
//#line 1509
final double X10_TEMP336 =
              (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.t);
            
//#line 1511
final double X10_TEMP53 =
              (X10_TEMP336);
            
//#line 1512
final double X10_TEMP339 =
              (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(X10_TEMP3))/* } */.t);
            
//#line 1514
final double X10_TEMP54 =
              (X10_TEMP339);
            
//#line 1515
final boolean X10_TEMP342 =
              (X10_TEMP53 <
                 X10_TEMP54);
            
//#line 1517
final boolean X10_TEMP56 =
              (X10_TEMP342);
            
//#line 1518
final boolean X10_TEMP58 =
              (X10_TEMP55 &&
                 X10_TEMP56);
            
//#line 1519
if (X10_TEMP58) {
                
//#line 1520
final double X10_TEMP347 =
                  (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.t);
                
//#line 1522
final double X10_TEMP61 =
                  (X10_TEMP347);
                
//#line 1523
final double X10_TEMP350 =
                  (X10_TEMP61);
                
//#line 1525
final double X10_TEMP62 =
                  (X10_TEMP350);
                
//#line 1526
final double X10_TEMP353 =
                  (X10_TEMP62);
                
//#line 1528
final double X10_TEMP356 =
                  (X10_TEMP353);
                
//#line 1529
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(X10_TEMP3))/* } */.t =
                  ((X10_TEMP356));
                
//#line 1530
final Sphere X10_TEMP358 =
                  (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.prim);
                
//#line 1532
final Sphere X10_TEMP65 =
                  (X10_TEMP358);
                
//#line 1533
final Sphere X10_TEMP361 =
                  (X10_TEMP65);
                
//#line 1535
final Sphere X10_TEMP66 =
                  (X10_TEMP361);
                
//#line 1536
final Sphere X10_TEMP364 =
                  (X10_TEMP66);
                
//#line 1538
final Sphere X10_TEMP367 =
                  (X10_TEMP364);
                
//#line 1539
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(X10_TEMP3))/* } */.prim =
                  ((X10_TEMP367));
                
//#line 1540
final Surface X10_TEMP369 =
                  (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.surf);
                
//#line 1542
final Surface X10_TEMP69 =
                  (X10_TEMP369);
                
//#line 1543
final Surface X10_TEMP372 =
                  (X10_TEMP69);
                
//#line 1545
final Surface X10_TEMP70 =
                  (X10_TEMP372);
                
//#line 1546
final Surface X10_TEMP375 =
                  (X10_TEMP70);
                
//#line 1548
final Surface X10_TEMP378 =
                  (X10_TEMP375);
                
//#line 1549
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(X10_TEMP3))/* } */.surf =
                  ((X10_TEMP378));
                
//#line 1550
final int X10_TEMP380 =
                  (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.enter);
                
//#line 1552
final int X10_TEMP73 =
                  (X10_TEMP380);
                
//#line 1553
final int X10_TEMP383 =
                  (X10_TEMP73);
                
//#line 1555
final int X10_TEMP74 =
                  (X10_TEMP383);
                
//#line 1556
final int X10_TEMP386 =
                  (X10_TEMP74);
                
//#line 1558
final int X10_TEMP389 =
                  (X10_TEMP386);
                
//#line 1559
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(X10_TEMP3))/* } */.enter =
                  ((X10_TEMP389));
                
//#line 1560
final int X10_TEMP391 =
                  (nhits);
                
//#line 1562
final int X10_TEMP75 =
                  (X10_TEMP391);
                
//#line 1563
final int X10_TEMP76 =
                  (1);
                
//#line 1564
final int X10_TEMP395 =
                  (nhits +
                     X10_TEMP76);
                
//#line 1565
nhits =
                  ((X10_TEMP395));
            }
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var5____ = (__var42__).iterator(); __var5____.hasNext(); ) {
        	final  x10.
          lang.
          point __var5__ = (x10.
          lang.
          point) __var5____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var5__).get(0))/* } */;/* } */
{
            
//#line 1497
final Sphere X10_TEMP322 =
              (/* template:parametric { */((Sphere)(/* template:array_get { */((myprim).get(i))/* } */))/* } */);
            
//#line 1499
final Sphere X10_TEMP49 =
              (X10_TEMP322);
            
//#line 1500
final Isect X10_TEMP327 =
              (Program0.
                 Program_Sphere_intersect(
                 X10_TEMP49,
                 X10_TEMP1));
            
//#line 1502
Isect tp =
              (X10_TEMP327);
            
//#line 1503
final boolean X10_TEMP330 =
              (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.isNull);
            
//#line 1505
final boolean X10_TEMP52 =
              (X10_TEMP330);
            
//#line 1506
final boolean X10_TEMP333 =
              (!X10_TEMP52);
            
//#line 1508
final boolean X10_TEMP55 =
              (X10_TEMP333);
            
//#line 1509
final double X10_TEMP336 =
              (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.t);
            
//#line 1511
final double X10_TEMP53 =
              (X10_TEMP336);
            
//#line 1512
final double X10_TEMP339 =
              (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(X10_TEMP3))/* } */.t);
            
//#line 1514
final double X10_TEMP54 =
              (X10_TEMP339);
            
//#line 1515
final boolean X10_TEMP342 =
              (X10_TEMP53 <
                 X10_TEMP54);
            
//#line 1517
final boolean X10_TEMP56 =
              (X10_TEMP342);
            
//#line 1518
final boolean X10_TEMP58 =
              (X10_TEMP55 &&
                 X10_TEMP56);
            
//#line 1519
if (X10_TEMP58) {
                
//#line 1520
final double X10_TEMP347 =
                  (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.t);
                
//#line 1522
final double X10_TEMP61 =
                  (X10_TEMP347);
                
//#line 1523
final double X10_TEMP350 =
                  (X10_TEMP61);
                
//#line 1525
final double X10_TEMP62 =
                  (X10_TEMP350);
                
//#line 1526
final double X10_TEMP353 =
                  (X10_TEMP62);
                
//#line 1528
final double X10_TEMP356 =
                  (X10_TEMP353);
                
//#line 1529
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(X10_TEMP3))/* } */.t =
                  ((X10_TEMP356));
                
//#line 1530
final Sphere X10_TEMP358 =
                  (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.prim);
                
//#line 1532
final Sphere X10_TEMP65 =
                  (X10_TEMP358);
                
//#line 1533
final Sphere X10_TEMP361 =
                  (X10_TEMP65);
                
//#line 1535
final Sphere X10_TEMP66 =
                  (X10_TEMP361);
                
//#line 1536
final Sphere X10_TEMP364 =
                  (X10_TEMP66);
                
//#line 1538
final Sphere X10_TEMP367 =
                  (X10_TEMP364);
                
//#line 1539
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(X10_TEMP3))/* } */.prim =
                  ((X10_TEMP367));
                
//#line 1540
final Surface X10_TEMP369 =
                  (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.surf);
                
//#line 1542
final Surface X10_TEMP69 =
                  (X10_TEMP369);
                
//#line 1543
final Surface X10_TEMP372 =
                  (X10_TEMP69);
                
//#line 1545
final Surface X10_TEMP70 =
                  (X10_TEMP372);
                
//#line 1546
final Surface X10_TEMP375 =
                  (X10_TEMP70);
                
//#line 1548
final Surface X10_TEMP378 =
                  (X10_TEMP375);
                
//#line 1549
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(X10_TEMP3))/* } */.surf =
                  ((X10_TEMP378));
                
//#line 1550
final int X10_TEMP380 =
                  (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(tp))/* } */.enter);
                
//#line 1552
final int X10_TEMP73 =
                  (X10_TEMP380);
                
//#line 1553
final int X10_TEMP383 =
                  (X10_TEMP73);
                
//#line 1555
final int X10_TEMP74 =
                  (X10_TEMP383);
                
//#line 1556
final int X10_TEMP386 =
                  (X10_TEMP74);
                
//#line 1558
final int X10_TEMP389 =
                  (X10_TEMP386);
                
//#line 1559
/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(X10_TEMP3))/* } */.enter =
                  ((X10_TEMP389));
                
//#line 1560
final int X10_TEMP391 =
                  (nhits);
                
//#line 1562
final int X10_TEMP75 =
                  (X10_TEMP391);
                
//#line 1563
final int X10_TEMP76 =
                  (1);
                
//#line 1564
final int X10_TEMP395 =
                  (nhits +
                     X10_TEMP76);
                
//#line 1565
nhits =
                  ((X10_TEMP395));
            }
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 1568
final int X10_TEMP397 =
          (0);
        
//#line 1570
final int X10_TEMP77 =
          (X10_TEMP397);
        
//#line 1571
final boolean X10_TEMP78 =
          (nhits >
             X10_TEMP77);
        
//#line 1572
boolean X10_TEMP81 =
          (false);
        
//#line 1573
if (X10_TEMP78) {
            
//#line 1574
final boolean X10_TEMP403 =
              (true);
            
//#line 1575
X10_TEMP81 =
              ((X10_TEMP403));
        }
        
//#line 1577
final boolean X10_TEMP82 =
          (X10_TEMP81);
        
//#line 1578
return X10_TEMP82;
    }
    
    
//#line 1580
public static int
                    Program_RayTracer_Shadow(
                    final RayTracer X10_TEMP0,
                    final Ray r,
                    final double tmax,
                    final Isect inter) {
        
//#line 1581
Ray X10_TEMP1 =
          (r);
        
//#line 1582
double X10_TEMP2 =
          (tmax);
        
//#line 1583
Isect X10_TEMP3 =
          (inter);
        
//#line 1584
final boolean X10_TEMP8 =
          (Program0.
             Program_RayTracer_intersect(
             X10_TEMP0,
             X10_TEMP1,
             X10_TEMP2,
             X10_TEMP3));
        
//#line 1585
if (X10_TEMP8) {
            
//#line 1586
final int X10_TEMP226 =
              (0);
            
//#line 1588
final int X10_TEMP10 =
              (X10_TEMP226);
            
//#line 1589
return X10_TEMP10;
        }
        
//#line 1591
final int X10_TEMP230 =
          (1);
        
//#line 1593
final int X10_TEMP12 =
          (X10_TEMP230);
        
//#line 1594
return X10_TEMP12;
    }
    
    
//#line 1596
public static Vec
                    Program_RayTracer_SpecularDirection(
                    final RayTracer X10_TEMP0,
                    final Vec I,
                    final Vec N) {
        
//#line 1597
Vec X10_TEMP1 =
          (I);
        
//#line 1598
Vec X10_TEMP2 =
          (N);
        
//#line 1599
final double X10_TEMP219 =
          (1.0);
        
//#line 1601
final double X10_TEMP7 =
          (X10_TEMP219);
        
//#line 1602
final double X10_TEMP224 =
          (Program0.
             Program_Vec_dot(
             X10_TEMP1,
             X10_TEMP2));
        
//#line 1604
final double X10_TEMP6 =
          (X10_TEMP224);
        
//#line 1605
final double X10_TEMP228 =
          (java.
             lang.
             Math.
             abs(
             X10_TEMP6));
        
//#line 1607
final double X10_TEMP8 =
          (X10_TEMP228);
        
//#line 1608
final double X10_TEMP231 =
          (X10_TEMP7 /
             X10_TEMP8);
        
//#line 1610
final double X10_TEMP13 =
          (X10_TEMP231);
        
//#line 1611
final double X10_TEMP234 =
          (2.0);
        
//#line 1613
final double X10_TEMP14 =
          (X10_TEMP234);
        
//#line 1614
final Vec X10_TEMP241 =
          (Program0.
             Program_Vec_comb(
             X10_TEMP13,
             X10_TEMP1,
             X10_TEMP14,
             X10_TEMP2));
        
//#line 1616
final Vec X10_TEMP15 =
          (X10_TEMP241);
        
//#line 1617
final Vec X10_TEMP245 =
          (Program0.
             Program_Vec_normalized(
             X10_TEMP15));
        
//#line 1619
final Vec X10_TEMP17 =
          (X10_TEMP245);
        
//#line 1620
return X10_TEMP17;
    }
    
    
//#line 1622
public static Vec
                    Program_RayTracer_TransDir(
                    final RayTracer X10_TEMP0,
                    final Surface m1,
                    final Surface m2,
                    final Vec I,
                    final Vec N) {
        
//#line 1623
Surface X10_TEMP1 =
          (m1);
        
//#line 1624
Surface X10_TEMP2 =
          (m2);
        
//#line 1625
Vec X10_TEMP3 =
          (I);
        
//#line 1626
Vec X10_TEMP4 =
          (N);
        
//#line 1627
final boolean X10_TEMP5 =
          (X10_TEMP1.
             isNull);
        
//#line 1628
double X10_TEMP8 =
          (X10_TEMP1.
             ior);
        
//#line 1629
if (X10_TEMP5) {
            
//#line 1630
final double X10_TEMP224 =
              (1.0);
            
//#line 1631
X10_TEMP8 =
              ((X10_TEMP224));
        }
        
//#line 1633
final double X10_TEMP9 =
          (X10_TEMP8);
        
//#line 1634
final double X10_TEMP227 =
          (X10_TEMP9);
        
//#line 1636
double n1 =
          (X10_TEMP227);
        
//#line 1637
final boolean X10_TEMP10 =
          (X10_TEMP2.
             isNull);
        
//#line 1638
double X10_TEMP13 =
          (X10_TEMP2.
             ior);
        
//#line 1639
if (X10_TEMP10) {
            
//#line 1640
final double X10_TEMP233 =
              (1.0);
            
//#line 1641
X10_TEMP13 =
              ((X10_TEMP233));
        }
        
//#line 1643
final double X10_TEMP14 =
          (X10_TEMP13);
        
//#line 1644
final double X10_TEMP236 =
          (X10_TEMP14);
        
//#line 1646
double n2 =
          (X10_TEMP236);
        
//#line 1647
final double X10_TEMP239 =
          (n1 /
             n2);
        
//#line 1649
double eta =
          (X10_TEMP239);
        
//#line 1650
final double X10_TEMP244 =
          (Program0.
             Program_Vec_dot(
             X10_TEMP3,
             X10_TEMP4));
        
//#line 1652
final double X10_TEMP18 =
          (X10_TEMP244);
        
//#line 1653
final int X10_TEMP19 =
          (0);
        
//#line 1654
final double X10_TEMP248 =
          (X10_TEMP19 -
             X10_TEMP18);
        
//#line 1656
double c1 =
          (X10_TEMP248);
        
//#line 1657
final double X10_TEMP251 =
          (1.0);
        
//#line 1659
final double X10_TEMP26 =
          (X10_TEMP251);
        
//#line 1660
final double X10_TEMP254 =
          (eta *
             eta);
        
//#line 1662
final double X10_TEMP25 =
          (X10_TEMP254);
        
//#line 1663
final double X10_TEMP257 =
          (1.0);
        
//#line 1665
final double X10_TEMP21 =
          (X10_TEMP257);
        
//#line 1666
final double X10_TEMP260 =
          (c1 *
             c1);
        
//#line 1668
final double X10_TEMP22 =
          (X10_TEMP260);
        
//#line 1669
final double X10_TEMP263 =
          (X10_TEMP21 -
             X10_TEMP22);
        
//#line 1671
final double X10_TEMP24 =
          (X10_TEMP263);
        
//#line 1672
final double X10_TEMP266 =
          (X10_TEMP25 *
             X10_TEMP24);
        
//#line 1674
final double X10_TEMP27 =
          (X10_TEMP266);
        
//#line 1675
final double X10_TEMP269 =
          (X10_TEMP26 -
             X10_TEMP27);
        
//#line 1677
double cs2 =
          (X10_TEMP269);
        
//#line 1678
final double X10_TEMP272 =
          (0.0);
        
//#line 1680
final double X10_TEMP29 =
          (X10_TEMP272);
        
//#line 1681
final boolean X10_TEMP31 =
          (cs2 <
             X10_TEMP29);
        
//#line 1682
if (X10_TEMP31) {
            
//#line 1683
final double X10_TEMP277 =
              (0.0);
            
//#line 1685
double X10_TEMP36 =
              (X10_TEMP277);
            
//#line 1686
final double X10_TEMP280 =
              (0.0);
            
//#line 1688
double X10_TEMP37 =
              (X10_TEMP280);
            
//#line 1689
final double X10_TEMP283 =
              (0.0);
            
//#line 1691
double X10_TEMP38 =
              (X10_TEMP283);
            
//#line 1692
final boolean X10_TEMP286 =
              (true);
            
//#line 1694
boolean X10_TEMP39 =
              (X10_TEMP286);
            
//#line 1695
final Vec X10_TEMP293 =
              (new Vec(
                 X10_TEMP36,
                 X10_TEMP37,
                 X10_TEMP38,
                 X10_TEMP39));
            
//#line 1697
final Vec X10_TEMP41 =
              (X10_TEMP293);
            
//#line 1698
return X10_TEMP41;
        }
        
//#line 1700
final double X10_TEMP297 =
          (eta *
             c1);
        
//#line 1702
final double X10_TEMP45 =
          (X10_TEMP297);
        
//#line 1703
final double X10_TEMP301 =
          (java.
             lang.
             Math.
             sqrt(
             cs2));
        
//#line 1705
final double X10_TEMP46 =
          (X10_TEMP301);
        
//#line 1706
final double X10_TEMP304 =
          (X10_TEMP45 -
             X10_TEMP46);
        
//#line 1708
final double X10_TEMP49 =
          (X10_TEMP304);
        
//#line 1709
final Vec X10_TEMP311 =
          (Program0.
             Program_Vec_comb(
             eta,
             X10_TEMP3,
             X10_TEMP49,
             X10_TEMP4));
        
//#line 1711
final Vec X10_TEMP50 =
          (X10_TEMP311);
        
//#line 1712
final Vec X10_TEMP315 =
          (Program0.
             Program_Vec_normalized(
             X10_TEMP50));
        
//#line 1714
final Vec X10_TEMP52 =
          (X10_TEMP315);
        
//#line 1715
return X10_TEMP52;
    }
    
    
//#line 1717
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
        
//#line 1718
int X10_TEMP1 =
          (level);
        
//#line 1719
double X10_TEMP2 =
          (weight);
        
//#line 1720
Vec X10_TEMP3 =
          (P);
        
//#line 1721
Vec X10_TEMP4 =
          (N);
        
//#line 1722
Vec X10_TEMP5 =
          (I);
        
//#line 1723
Isect X10_TEMP6 =
          (hit);
        
//#line 1724
Ray X10_TEMP7 =
          (tRay);
        
//#line 1725
final Surface X10_TEMP224 =
          (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(X10_TEMP6))/* } */.surf);
        
//#line 1727
Surface surf =
          (X10_TEMP224);
        
//#line 1728
final Vec X10_TEMP227 =
          (new Vec(
             ));
        
//#line 1730
Vec bigr =
          (X10_TEMP227);
        
//#line 1731
final double X10_TEMP230 =
          (surf.
             shine);
        
//#line 1733
final double X10_TEMP10 =
          (X10_TEMP230);
        
//#line 1734
final double X10_TEMP233 =
          (1.0E-6);
        
//#line 1736
final double X10_TEMP11 =
          (X10_TEMP233);
        
//#line 1737
final boolean X10_TEMP13 =
          (X10_TEMP10 >
             X10_TEMP11);
        
//#line 1738
if (X10_TEMP13) {
            
//#line 1739
final Vec X10_TEMP241 =
              (Program0.
                 Program_RayTracer_SpecularDirection(
                 X10_TEMP0,
                 X10_TEMP5,
                 X10_TEMP4));
            
//#line 1741
final Vec X10_TEMP17 =
              (X10_TEMP241);
            
//#line 1742
final Vec X10_TEMP244 =
              (X10_TEMP17);
            
//#line 1744
bigr =
              ((X10_TEMP244));
        }
        
//#line 1746
final x10.
          lang.
          place X10_TEMP247 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1748
final x10.
          lang.
          place h =
          (X10_TEMP247);
        
//#line 1749
final int X10_TEMP250 =
          (0);
        
//#line 1751
final int X10_TEMP21 =
          (X10_TEMP250);
        
//#line 1752
final int X10_TEMP253 =
          (0);
        
//#line 1754
final int X10_TEMP22 =
          (X10_TEMP253);
        
//#line 1755
final x10.
          lang.
          region X10_TEMP258 =
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
                  X10_TEMP21,
                  X10_TEMP22))));
        
//#line 1757
final x10.
          lang.
          region X10_TEMP23 =
          (x10.
            lang.
            region)
            ((X10_TEMP258));
        
//#line 1758
final x10.
          lang.
          place X10_TEMP261 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1760
final x10.
          lang.
          place X10_TEMP24 =
          (X10_TEMP261);
        
//#line 1761
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
                X10_TEMP23,
                X10_TEMP24)));
        
//#line 1763
final x10.
          lang.
          dist dTemp =
          (x10.
            lang.
            dist)
            ((X10_TEMP264));
        
//#line 1764
final x10.
          lang.
          GenericReferenceArray X10_TEMP267 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dTemp,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
        
//#line 1766
final x10.
          lang.
          GenericReferenceArray temp =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP267));
        
//#line 1767
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1768
final x10.
              lang.
              place X10_TEMP28 =
              (x10.
                 lang.
                 place.
                 FIRST_PLACE);
            
//#line 1769
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP28)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 1770
final int X10_TEMP272 =
                  (/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lightCount);
                
//#line 1772
final int templightCount =
                  (X10_TEMP272);
                
//#line 1773
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP275 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((RayTracer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lights));
                
//#line 1775
final x10.
                  lang.
                  GenericReferenceArray templights =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP275));
                
//#line 1776
/* template:Async { */(x10.lang.Runtime.asPlace(h)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1777
final int X10_TEMP279 =
                      (0);
                    
//#line 1779
final int X10_TEMP33 =
                      (X10_TEMP279);
                    
//#line 1780
final Envelope2 X10_TEMP284 =
                      (new Envelope2(
                         templightCount,
                         templights));
                    
//#line 1782
final Envelope2 X10_TEMP38 =
                      (X10_TEMP284);
                    
//#line 1783
final Envelope2 X10_TEMP287 =
                      (X10_TEMP38);
                    
//#line 1785
final Envelope2 X10_TEMP39 =
                      (X10_TEMP287);
                    
//#line 1786
final Envelope2 X10_TEMP291 =
                      (X10_TEMP39);
                    
//#line 1788
final Envelope2 X10_TEMP294 =
                      (X10_TEMP291);
                    
//#line 1789
/* template:array_set { */(temp).set((X10_TEMP294),X10_TEMP33)/* } */;
                }
                		}
                	});/* } */
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp45) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp45);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1793
final int X10_TEMP296 =
          (0);
        
//#line 1795
final int X10_TEMP41 =
          (X10_TEMP296);
        
//#line 1796
final Envelope2 X10_TEMP300 =
          (/* template:parametric { */((Envelope2)(/* template:array_get { */((temp).get(X10_TEMP41))/* } */))/* } */);
        
//#line 1798
final Envelope2 X10_TEMP42 =
          (X10_TEMP300);
        
//#line 1799
final int X10_TEMP303 =
          (X10_TEMP42.
             i);
        
//#line 1801
final int mylightCount =
          (X10_TEMP303);
        
//#line 1802
final int X10_TEMP306 =
          (0);
        
//#line 1804
final int X10_TEMP45 =
          (X10_TEMP306);
        
//#line 1805
final Envelope2 X10_TEMP310 =
          (/* template:parametric { */((Envelope2)(/* template:array_get { */((temp).get(X10_TEMP45))/* } */))/* } */);
        
//#line 1807
final Envelope2 X10_TEMP46 =
          (X10_TEMP310);
        
//#line 1808
final x10.
          lang.
          GenericReferenceArray X10_TEMP313 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP46.
                a));
        
//#line 1810
final x10.
          lang.
          GenericReferenceArray X10_TEMP48 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP313));
        
//#line 1811
final x10.
          lang.
          GenericReferenceArray X10_TEMP316 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP48));
        
//#line 1813
final x10.
          lang.
          GenericReferenceArray mylights =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP316));
        
//#line 1814
final Vec X10_TEMP319 =
          (new Vec(
             ));
        
//#line 1816
Vec col =
          (X10_TEMP319);
        
//#line 1817
final int X10_TEMP322 =
          (0);
        
//#line 1819
final int X10_TEMP54 =
          (X10_TEMP322);
        
//#line 1820
final int X10_TEMP325 =
          (1);
        
//#line 1822
final int X10_TEMP52 =
          (X10_TEMP325);
        
//#line 1823
final int X10_TEMP328 =
          (mylightCount -
             X10_TEMP52);
        
//#line 1825
final int X10_TEMP55 =
          (X10_TEMP328);
        
//#line 1826
final x10.
          lang.
          region X10_TEMP333 =
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
                  X10_TEMP54,
                  X10_TEMP55))));
        
//#line 1828
final x10.
          lang.
          region X10_TEMP57 =
          (x10.
            lang.
            region)
            ((X10_TEMP333));
        
//#line 1829
/* template:forloop-mult { */{
        x10.lang.region __var46__ = (x10.lang.region) X10_TEMP57;
        if (__var46__.size() > 0 && (__var46__ instanceof x10.array.MultiDimRegion || __var46__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var47__ = __var46__.rank(0).low(), __var48__ = __var46__.rank(0).high(); __var47__ <= __var48__; __var47__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int l = __var47__;
        /* } */
        /* } */
{
            
//#line 1830
final Light X10_TEMP338 =
              (/* template:parametric { */((Light)(/* template:array_get { */((mylights).get(l))/* } */))/* } */);
            
//#line 1832
final Light X10_TEMP59 =
              (X10_TEMP338);
            
//#line 1833
final Vec X10_TEMP341 =
              (X10_TEMP59.
                 pos);
            
//#line 1835
final Vec X10_TEMP62 =
              (X10_TEMP341);
            
//#line 1836
final Vec X10_TEMP346 =
              (Program0.
                 Program_Vec_sub(
                 X10_TEMP62,
                 X10_TEMP3));
            
//#line 1838
Vec L =
              (X10_TEMP346);
            
//#line 1839
final double X10_TEMP351 =
              (Program0.
                 Program_Vec_dot(
                 X10_TEMP4,
                 L));
            
//#line 1841
final double X10_TEMP66 =
              (X10_TEMP351);
            
//#line 1842
final double X10_TEMP354 =
              (0.0);
            
//#line 1844
final double X10_TEMP67 =
              (X10_TEMP354);
            
//#line 1845
final boolean X10_TEMP69 =
              (X10_TEMP66 >=
                 X10_TEMP67);
            
//#line 1846
if (X10_TEMP69) {
                
//#line 1847
final Vec X10_TEMP360 =
                  (Program0.
                     Program_Vec_normalized(
                     L));
                
//#line 1849
final Vec X10_TEMP71 =
                  (X10_TEMP360);
                
//#line 1850
final Vec X10_TEMP363 =
                  (X10_TEMP71);
                
//#line 1852
L =
                  ((X10_TEMP363));
                
//#line 1853
final double X10_TEMP367 =
                  (Program0.
                     Program_Vec_length(
                     L));
                
//#line 1855
double t =
                  (X10_TEMP367);
                
//#line 1856
final Vec X10_TEMP370 =
                  (X10_TEMP3);
                
//#line 1858
final Vec X10_TEMP75 =
                  (X10_TEMP370);
                
//#line 1859
final Vec X10_TEMP373 =
                  (X10_TEMP75);
                
//#line 1861
final Vec X10_TEMP376 =
                  (X10_TEMP373);
                
//#line 1862
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP7))/* } */.p =
                  ((X10_TEMP376));
                
//#line 1863
final Vec X10_TEMP378 =
                  (L);
                
//#line 1865
final Vec X10_TEMP78 =
                  (X10_TEMP378);
                
//#line 1866
final Vec X10_TEMP381 =
                  (X10_TEMP78);
                
//#line 1868
final Vec X10_TEMP384 =
                  (X10_TEMP381);
                
//#line 1869
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP7))/* } */.d =
                  ((X10_TEMP384));
                
//#line 1870
final int X10_TEMP390 =
                  (Program0.
                     Program_RayTracer_Shadow(
                     X10_TEMP0,
                     X10_TEMP7,
                     t,
                     X10_TEMP6));
                
//#line 1872
final int X10_TEMP82 =
                  (X10_TEMP390);
                
//#line 1873
final int X10_TEMP393 =
                  (0);
                
//#line 1875
final int X10_TEMP83 =
                  (X10_TEMP393);
                
//#line 1876
final boolean X10_TEMP85 =
                  (X10_TEMP82 >
                     X10_TEMP83);
                
//#line 1877
if (X10_TEMP85) {
                    
//#line 1878
final double X10_TEMP400 =
                      (Program0.
                         Program_Vec_dot(
                         X10_TEMP4,
                         L));
                    
//#line 1880
final double X10_TEMP88 =
                      (X10_TEMP400);
                    
//#line 1881
final double X10_TEMP403 =
                      (surf.
                         kd);
                    
//#line 1883
final double X10_TEMP89 =
                      (X10_TEMP403);
                    
//#line 1884
final double X10_TEMP406 =
                      (X10_TEMP88 *
                         X10_TEMP89);
                    
//#line 1886
final double X10_TEMP92 =
                      (X10_TEMP406);
                    
//#line 1887
final Light X10_TEMP410 =
                      (/* template:parametric { */((Light)(/* template:array_get { */((mylights).get(l))/* } */))/* } */);
                    
//#line 1889
final Light X10_TEMP91 =
                      (X10_TEMP410);
                    
//#line 1890
final double X10_TEMP413 =
                      (X10_TEMP91.
                         brightness);
                    
//#line 1892
final double X10_TEMP93 =
                      (X10_TEMP413);
                    
//#line 1893
final double X10_TEMP416 =
                      (X10_TEMP92 *
                         X10_TEMP93);
                    
//#line 1895
double diff =
                      (X10_TEMP416);
                    
//#line 1896
final Vec X10_TEMP419 =
                      (surf.
                         color);
                    
//#line 1898
final Vec X10_TEMP97 =
                      (X10_TEMP419);
                    
//#line 1899
final Vec X10_TEMP425 =
                      (Program0.
                         Program_Vec_adds2(
                         col,
                         diff,
                         X10_TEMP97));
                    
//#line 1901
final Vec X10_TEMP99 =
                      (X10_TEMP425);
                    
//#line 1902
final Vec X10_TEMP428 =
                      (X10_TEMP99);
                    
//#line 1904
col =
                      ((X10_TEMP428));
                    
//#line 1905
final double X10_TEMP431 =
                      (surf.
                         shine);
                    
//#line 1907
final double X10_TEMP100 =
                      (X10_TEMP431);
                    
//#line 1908
final double X10_TEMP434 =
                      (1.0E-6);
                    
//#line 1910
final double X10_TEMP101 =
                      (X10_TEMP434);
                    
//#line 1911
final boolean X10_TEMP103 =
                      (X10_TEMP100 >
                         X10_TEMP101);
                    
//#line 1912
if (X10_TEMP103) {
                        
//#line 1913
final double X10_TEMP441 =
                          (Program0.
                             Program_Vec_dot(
                             bigr,
                             L));
                        
//#line 1915
double spec =
                          (X10_TEMP441);
                        
//#line 1916
final double X10_TEMP444 =
                          (1.0E-6);
                        
//#line 1918
final double X10_TEMP107 =
                          (X10_TEMP444);
                        
//#line 1919
final boolean X10_TEMP109 =
                          (spec >
                             X10_TEMP107);
                        
//#line 1920
if (X10_TEMP109) {
                            
//#line 1921
final double X10_TEMP449 =
                              (surf.
                                 shine);
                            
//#line 1923
final double X10_TEMP112 =
                              (X10_TEMP449);
                            
//#line 1924
final double X10_TEMP454 =
                              (java.
                                 lang.
                                 Math.
                                 pow(
                                 spec,
                                 X10_TEMP112));
                            
//#line 1926
final double X10_TEMP114 =
                              (X10_TEMP454);
                            
//#line 1927
final double X10_TEMP457 =
                              (X10_TEMP114);
                            
//#line 1929
spec =
                              ((X10_TEMP457));
                            
//#line 1930
final boolean X10_TEMP460 =
                              (false);
                            
//#line 1932
boolean X10_TEMP119 =
                              (X10_TEMP460);
                            
//#line 1933
final Vec X10_TEMP467 =
                              (new Vec(
                                 spec,
                                 spec,
                                 spec,
                                 X10_TEMP119));
                            
//#line 1935
final Vec X10_TEMP121 =
                              (X10_TEMP467);
                            
//#line 1936
final Vec X10_TEMP472 =
                              (Program0.
                                 Program_Vec_added(
                                 col,
                                 X10_TEMP121));
                            
//#line 1938
final Vec X10_TEMP123 =
                              (X10_TEMP472);
                            
//#line 1939
final Vec X10_TEMP475 =
                              (X10_TEMP123);
                            
//#line 1941
col =
                              ((X10_TEMP475));
                        }
                    }
                }
            }
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var6____ = (__var46__).iterator(); __var6____.hasNext(); ) {
        	final  x10.
          lang.
          point __var6__ = (x10.
          lang.
          point) __var6____.next();
        	/* Join: { *//* Join: { */final int l =
          /* template:array_get { */((__var6__).get(0))/* } */;/* } */
{
            
//#line 1830
final Light X10_TEMP338 =
              (/* template:parametric { */((Light)(/* template:array_get { */((mylights).get(l))/* } */))/* } */);
            
//#line 1832
final Light X10_TEMP59 =
              (X10_TEMP338);
            
//#line 1833
final Vec X10_TEMP341 =
              (X10_TEMP59.
                 pos);
            
//#line 1835
final Vec X10_TEMP62 =
              (X10_TEMP341);
            
//#line 1836
final Vec X10_TEMP346 =
              (Program0.
                 Program_Vec_sub(
                 X10_TEMP62,
                 X10_TEMP3));
            
//#line 1838
Vec L =
              (X10_TEMP346);
            
//#line 1839
final double X10_TEMP351 =
              (Program0.
                 Program_Vec_dot(
                 X10_TEMP4,
                 L));
            
//#line 1841
final double X10_TEMP66 =
              (X10_TEMP351);
            
//#line 1842
final double X10_TEMP354 =
              (0.0);
            
//#line 1844
final double X10_TEMP67 =
              (X10_TEMP354);
            
//#line 1845
final boolean X10_TEMP69 =
              (X10_TEMP66 >=
                 X10_TEMP67);
            
//#line 1846
if (X10_TEMP69) {
                
//#line 1847
final Vec X10_TEMP360 =
                  (Program0.
                     Program_Vec_normalized(
                     L));
                
//#line 1849
final Vec X10_TEMP71 =
                  (X10_TEMP360);
                
//#line 1850
final Vec X10_TEMP363 =
                  (X10_TEMP71);
                
//#line 1852
L =
                  ((X10_TEMP363));
                
//#line 1853
final double X10_TEMP367 =
                  (Program0.
                     Program_Vec_length(
                     L));
                
//#line 1855
double t =
                  (X10_TEMP367);
                
//#line 1856
final Vec X10_TEMP370 =
                  (X10_TEMP3);
                
//#line 1858
final Vec X10_TEMP75 =
                  (X10_TEMP370);
                
//#line 1859
final Vec X10_TEMP373 =
                  (X10_TEMP75);
                
//#line 1861
final Vec X10_TEMP376 =
                  (X10_TEMP373);
                
//#line 1862
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP7))/* } */.p =
                  ((X10_TEMP376));
                
//#line 1863
final Vec X10_TEMP378 =
                  (L);
                
//#line 1865
final Vec X10_TEMP78 =
                  (X10_TEMP378);
                
//#line 1866
final Vec X10_TEMP381 =
                  (X10_TEMP78);
                
//#line 1868
final Vec X10_TEMP384 =
                  (X10_TEMP381);
                
//#line 1869
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP7))/* } */.d =
                  ((X10_TEMP384));
                
//#line 1870
final int X10_TEMP390 =
                  (Program0.
                     Program_RayTracer_Shadow(
                     X10_TEMP0,
                     X10_TEMP7,
                     t,
                     X10_TEMP6));
                
//#line 1872
final int X10_TEMP82 =
                  (X10_TEMP390);
                
//#line 1873
final int X10_TEMP393 =
                  (0);
                
//#line 1875
final int X10_TEMP83 =
                  (X10_TEMP393);
                
//#line 1876
final boolean X10_TEMP85 =
                  (X10_TEMP82 >
                     X10_TEMP83);
                
//#line 1877
if (X10_TEMP85) {
                    
//#line 1878
final double X10_TEMP400 =
                      (Program0.
                         Program_Vec_dot(
                         X10_TEMP4,
                         L));
                    
//#line 1880
final double X10_TEMP88 =
                      (X10_TEMP400);
                    
//#line 1881
final double X10_TEMP403 =
                      (surf.
                         kd);
                    
//#line 1883
final double X10_TEMP89 =
                      (X10_TEMP403);
                    
//#line 1884
final double X10_TEMP406 =
                      (X10_TEMP88 *
                         X10_TEMP89);
                    
//#line 1886
final double X10_TEMP92 =
                      (X10_TEMP406);
                    
//#line 1887
final Light X10_TEMP410 =
                      (/* template:parametric { */((Light)(/* template:array_get { */((mylights).get(l))/* } */))/* } */);
                    
//#line 1889
final Light X10_TEMP91 =
                      (X10_TEMP410);
                    
//#line 1890
final double X10_TEMP413 =
                      (X10_TEMP91.
                         brightness);
                    
//#line 1892
final double X10_TEMP93 =
                      (X10_TEMP413);
                    
//#line 1893
final double X10_TEMP416 =
                      (X10_TEMP92 *
                         X10_TEMP93);
                    
//#line 1895
double diff =
                      (X10_TEMP416);
                    
//#line 1896
final Vec X10_TEMP419 =
                      (surf.
                         color);
                    
//#line 1898
final Vec X10_TEMP97 =
                      (X10_TEMP419);
                    
//#line 1899
final Vec X10_TEMP425 =
                      (Program0.
                         Program_Vec_adds2(
                         col,
                         diff,
                         X10_TEMP97));
                    
//#line 1901
final Vec X10_TEMP99 =
                      (X10_TEMP425);
                    
//#line 1902
final Vec X10_TEMP428 =
                      (X10_TEMP99);
                    
//#line 1904
col =
                      ((X10_TEMP428));
                    
//#line 1905
final double X10_TEMP431 =
                      (surf.
                         shine);
                    
//#line 1907
final double X10_TEMP100 =
                      (X10_TEMP431);
                    
//#line 1908
final double X10_TEMP434 =
                      (1.0E-6);
                    
//#line 1910
final double X10_TEMP101 =
                      (X10_TEMP434);
                    
//#line 1911
final boolean X10_TEMP103 =
                      (X10_TEMP100 >
                         X10_TEMP101);
                    
//#line 1912
if (X10_TEMP103) {
                        
//#line 1913
final double X10_TEMP441 =
                          (Program0.
                             Program_Vec_dot(
                             bigr,
                             L));
                        
//#line 1915
double spec =
                          (X10_TEMP441);
                        
//#line 1916
final double X10_TEMP444 =
                          (1.0E-6);
                        
//#line 1918
final double X10_TEMP107 =
                          (X10_TEMP444);
                        
//#line 1919
final boolean X10_TEMP109 =
                          (spec >
                             X10_TEMP107);
                        
//#line 1920
if (X10_TEMP109) {
                            
//#line 1921
final double X10_TEMP449 =
                              (surf.
                                 shine);
                            
//#line 1923
final double X10_TEMP112 =
                              (X10_TEMP449);
                            
//#line 1924
final double X10_TEMP454 =
                              (java.
                                 lang.
                                 Math.
                                 pow(
                                 spec,
                                 X10_TEMP112));
                            
//#line 1926
final double X10_TEMP114 =
                              (X10_TEMP454);
                            
//#line 1927
final double X10_TEMP457 =
                              (X10_TEMP114);
                            
//#line 1929
spec =
                              ((X10_TEMP457));
                            
//#line 1930
final boolean X10_TEMP460 =
                              (false);
                            
//#line 1932
boolean X10_TEMP119 =
                              (X10_TEMP460);
                            
//#line 1933
final Vec X10_TEMP467 =
                              (new Vec(
                                 spec,
                                 spec,
                                 spec,
                                 X10_TEMP119));
                            
//#line 1935
final Vec X10_TEMP121 =
                              (X10_TEMP467);
                            
//#line 1936
final Vec X10_TEMP472 =
                              (Program0.
                                 Program_Vec_added(
                                 col,
                                 X10_TEMP121));
                            
//#line 1938
final Vec X10_TEMP123 =
                              (X10_TEMP472);
                            
//#line 1939
final Vec X10_TEMP475 =
                              (X10_TEMP123);
                            
//#line 1941
col =
                              ((X10_TEMP475));
                        }
                    }
                }
            }
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 1947
final Vec X10_TEMP478 =
          (X10_TEMP3);
        
//#line 1949
final Vec X10_TEMP126 =
          (X10_TEMP478);
        
//#line 1950
final Vec X10_TEMP481 =
          (X10_TEMP126);
        
//#line 1952
final Vec X10_TEMP484 =
          (X10_TEMP481);
        
//#line 1953
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP7))/* } */.p =
          ((X10_TEMP484));
        
//#line 1954
final double X10_TEMP486 =
          (surf.
             ks);
        
//#line 1956
final double X10_TEMP127 =
          (X10_TEMP486);
        
//#line 1957
final double X10_TEMP489 =
          (X10_TEMP127 *
             X10_TEMP2);
        
//#line 1959
final double X10_TEMP128 =
          (X10_TEMP489);
        
//#line 1960
final double X10_TEMP492 =
          (0.0010);
        
//#line 1962
final double X10_TEMP129 =
          (X10_TEMP492);
        
//#line 1963
final boolean X10_TEMP131 =
          (X10_TEMP128 >
             X10_TEMP129);
        
//#line 1964
if (X10_TEMP131) {
            
//#line 1965
final Vec X10_TEMP500 =
              (Program0.
                 Program_RayTracer_SpecularDirection(
                 X10_TEMP0,
                 X10_TEMP5,
                 X10_TEMP4));
            
//#line 1967
final Vec X10_TEMP136 =
              (X10_TEMP500);
            
//#line 1968
final Vec X10_TEMP503 =
              (X10_TEMP136);
            
//#line 1970
final Vec X10_TEMP137 =
              (X10_TEMP503);
            
//#line 1971
final Vec X10_TEMP506 =
              (X10_TEMP137);
            
//#line 1973
final Vec X10_TEMP509 =
              (X10_TEMP506);
            
//#line 1974
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP7))/* } */.d =
              ((X10_TEMP509));
            
//#line 1975
final int X10_TEMP511 =
              (1);
            
//#line 1977
final int X10_TEMP138 =
              (X10_TEMP511);
            
//#line 1978
final int X10_TEMP514 =
              (X10_TEMP1 +
                 X10_TEMP138);
            
//#line 1980
final int X10_TEMP145 =
              (X10_TEMP514);
            
//#line 1981
final double X10_TEMP517 =
              (surf.
                 ks);
            
//#line 1983
final double X10_TEMP140 =
              (X10_TEMP517);
            
//#line 1984
final double X10_TEMP520 =
              (X10_TEMP140 *
                 X10_TEMP2);
            
//#line 1986
final double X10_TEMP146 =
              (X10_TEMP520);
            
//#line 1987
final Vec X10_TEMP529 =
              (Program0.
                 Program_RayTracer_trace(
                 X10_TEMP0,
                 X10_TEMP145,
                 X10_TEMP146,
                 X10_TEMP7,
                 X10_TEMP6,
                 X10_TEMP7));
            
//#line 1989
Vec tcol =
              (X10_TEMP529);
            
//#line 1990
final double X10_TEMP532 =
              (surf.
                 ks);
            
//#line 1992
final double X10_TEMP150 =
              (X10_TEMP532);
            
//#line 1993
final Vec X10_TEMP538 =
              (Program0.
                 Program_Vec_adds2(
                 col,
                 X10_TEMP150,
                 tcol));
            
//#line 1995
final Vec X10_TEMP152 =
              (X10_TEMP538);
            
//#line 1996
final Vec X10_TEMP541 =
              (X10_TEMP152);
            
//#line 1998
col =
              ((X10_TEMP541));
        }
        
//#line 2000
final double X10_TEMP544 =
          (surf.
             kt);
        
//#line 2002
final double X10_TEMP153 =
          (X10_TEMP544);
        
//#line 2003
final double X10_TEMP547 =
          (X10_TEMP153 *
             X10_TEMP2);
        
//#line 2005
final double X10_TEMP154 =
          (X10_TEMP547);
        
//#line 2006
final double X10_TEMP550 =
          (0.0010);
        
//#line 2008
final double X10_TEMP155 =
          (X10_TEMP550);
        
//#line 2009
final boolean X10_TEMP157 =
          (X10_TEMP154 >
             X10_TEMP155);
        
//#line 2010
if (X10_TEMP157) {
            
//#line 2011
final int X10_TEMP555 =
              (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(X10_TEMP6))/* } */.enter);
            
//#line 2013
final int X10_TEMP158 =
              (X10_TEMP555);
            
//#line 2014
final int X10_TEMP558 =
              (0);
            
//#line 2016
final int X10_TEMP159 =
              (X10_TEMP558);
            
//#line 2017
final boolean X10_TEMP161 =
              (X10_TEMP158 >
                 X10_TEMP159);
            
//#line 2018
if (X10_TEMP161) {
                
//#line 2019
final int X10_TEMP563 =
                  (0);
                
//#line 2021
int X10_TEMP167 =
                  (X10_TEMP563);
                
//#line 2022
final int X10_TEMP566 =
                  (0);
                
//#line 2024
int X10_TEMP168 =
                  (X10_TEMP566);
                
//#line 2025
final int X10_TEMP569 =
                  (0);
                
//#line 2027
int X10_TEMP169 =
                  (X10_TEMP569);
                
//#line 2028
final Vec X10_TEMP572 =
                  (new Vec(
                     ));
                
//#line 2030
Vec X10_TEMP170 =
                  (X10_TEMP572);
                
//#line 2031
final boolean X10_TEMP575 =
                  (true);
                
//#line 2033
boolean X10_TEMP171 =
                  (X10_TEMP575);
                
//#line 2034
final Surface X10_TEMP583 =
                  (new Surface(
                     X10_TEMP167,
                     X10_TEMP168,
                     X10_TEMP169,
                     X10_TEMP170,
                     X10_TEMP171));
                
//#line 2036
final Surface X10_TEMP176 =
                  (X10_TEMP583);
                
//#line 2037
final Vec X10_TEMP591 =
                  (Program0.
                     Program_RayTracer_TransDir(
                     X10_TEMP0,
                     X10_TEMP176,
                     surf,
                     X10_TEMP5,
                     X10_TEMP4));
                
//#line 2039
final Vec X10_TEMP179 =
                  (X10_TEMP591);
                
//#line 2040
final Vec X10_TEMP594 =
                  (X10_TEMP179);
                
//#line 2042
final Vec X10_TEMP180 =
                  (X10_TEMP594);
                
//#line 2043
final Vec X10_TEMP597 =
                  (X10_TEMP180);
                
//#line 2045
final Vec X10_TEMP600 =
                  (X10_TEMP597);
                
//#line 2046
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP7))/* } */.d =
                  ((X10_TEMP600));
            } else {
                
//#line 2049
final int X10_TEMP602 =
                  (0);
                
//#line 2051
int X10_TEMP187 =
                  (X10_TEMP602);
                
//#line 2052
final int X10_TEMP605 =
                  (0);
                
//#line 2054
int X10_TEMP188 =
                  (X10_TEMP605);
                
//#line 2055
final int X10_TEMP608 =
                  (0);
                
//#line 2057
int X10_TEMP189 =
                  (X10_TEMP608);
                
//#line 2058
final Vec X10_TEMP611 =
                  (new Vec(
                     ));
                
//#line 2060
Vec X10_TEMP190 =
                  (X10_TEMP611);
                
//#line 2061
final boolean X10_TEMP614 =
                  (true);
                
//#line 2063
boolean X10_TEMP191 =
                  (X10_TEMP614);
                
//#line 2064
final Surface X10_TEMP622 =
                  (new Surface(
                     X10_TEMP187,
                     X10_TEMP188,
                     X10_TEMP189,
                     X10_TEMP190,
                     X10_TEMP191));
                
//#line 2066
final Surface X10_TEMP195 =
                  (X10_TEMP622);
                
//#line 2067
final Vec X10_TEMP630 =
                  (Program0.
                     Program_RayTracer_TransDir(
                     X10_TEMP0,
                     surf,
                     X10_TEMP195,
                     X10_TEMP5,
                     X10_TEMP4));
                
//#line 2069
final Vec X10_TEMP198 =
                  (X10_TEMP630);
                
//#line 2070
final Vec X10_TEMP633 =
                  (X10_TEMP198);
                
//#line 2072
final Vec X10_TEMP199 =
                  (X10_TEMP633);
                
//#line 2073
final Vec X10_TEMP636 =
                  (X10_TEMP199);
                
//#line 2075
final Vec X10_TEMP639 =
                  (X10_TEMP636);
                
//#line 2076
/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP7))/* } */.d =
                  ((X10_TEMP639));
            }
            
//#line 2078
final int X10_TEMP641 =
              (1);
            
//#line 2080
final int X10_TEMP200 =
              (X10_TEMP641);
            
//#line 2081
final int X10_TEMP644 =
              (X10_TEMP1 +
                 X10_TEMP200);
            
//#line 2083
final int X10_TEMP207 =
              (X10_TEMP644);
            
//#line 2084
final double X10_TEMP647 =
              (surf.
                 kt);
            
//#line 2086
final double X10_TEMP202 =
              (X10_TEMP647);
            
//#line 2087
final double X10_TEMP650 =
              (X10_TEMP202 *
                 X10_TEMP2);
            
//#line 2089
final double X10_TEMP208 =
              (X10_TEMP650);
            
//#line 2090
final Vec X10_TEMP659 =
              (Program0.
                 Program_RayTracer_trace(
                 X10_TEMP0,
                 X10_TEMP207,
                 X10_TEMP208,
                 X10_TEMP7,
                 X10_TEMP6,
                 X10_TEMP7));
            
//#line 2092
Vec tcol =
              (X10_TEMP659);
            
//#line 2093
final double X10_TEMP662 =
              (surf.
                 kt);
            
//#line 2095
final double X10_TEMP212 =
              (X10_TEMP662);
            
//#line 2096
final Vec X10_TEMP668 =
              (Program0.
                 Program_Vec_adds2(
                 col,
                 X10_TEMP212,
                 tcol));
            
//#line 2098
final Vec X10_TEMP214 =
              (X10_TEMP668);
            
//#line 2099
final Vec X10_TEMP671 =
              (X10_TEMP214);
            
//#line 2101
col =
              ((X10_TEMP671));
        }
        
//#line 2103
return col;
    }
    
    
//#line 2105
public static Vec
                    Program_RayTracer_trace(
                    final RayTracer X10_TEMP0,
                    final int level,
                    final double weight,
                    final Ray r,
                    final Isect inter,
                    final Ray tRay) {
        
//#line 2106
int X10_TEMP1 =
          (level);
        
//#line 2107
double X10_TEMP2 =
          (weight);
        
//#line 2108
Ray X10_TEMP3 =
          (r);
        
//#line 2109
Isect X10_TEMP4 =
          (inter);
        
//#line 2110
Ray X10_TEMP5 =
          (tRay);
        
//#line 2111
final int X10_TEMP222 =
          (6);
        
//#line 2113
final int X10_TEMP6 =
          (X10_TEMP222);
        
//#line 2114
final boolean X10_TEMP8 =
          (X10_TEMP1 >
             X10_TEMP6);
        
//#line 2115
if (X10_TEMP8) {
            
//#line 2116
final Vec X10_TEMP227 =
              (new Vec(
                 ));
            
//#line 2118
final Vec X10_TEMP10 =
              (X10_TEMP227);
            
//#line 2119
return X10_TEMP10;
        }
        
//#line 2121
final double X10_TEMP231 =
          (1000000.0);
        
//#line 2123
final double X10_TEMP14 =
          (X10_TEMP231);
        
//#line 2124
final boolean X10_TEMP238 =
          (Program0.
             Program_RayTracer_intersect(
             X10_TEMP0,
             X10_TEMP3,
             X10_TEMP14,
             X10_TEMP4));
        
//#line 2126
boolean hit =
          (X10_TEMP238);
        
//#line 2127
if (hit) {
            
//#line 2128
final double X10_TEMP242 =
              (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(X10_TEMP4))/* } */.t);
            
//#line 2130
final double X10_TEMP18 =
              (X10_TEMP242);
            
//#line 2131
final Vec X10_TEMP247 =
              (Program0.
                 Program_Ray_rayPoint(
                 X10_TEMP3,
                 X10_TEMP18));
            
//#line 2133
Vec P =
              (X10_TEMP247);
            
//#line 2134
final Sphere X10_TEMP250 =
              (/* template:place-check { */((Isect) x10.lang.Runtime.hereCheck(X10_TEMP4))/* } */.prim);
            
//#line 2136
final Sphere X10_TEMP20 =
              (X10_TEMP250);
            
//#line 2137
final Vec X10_TEMP255 =
              (Program0.
                 Program_Sphere_normal(
                 X10_TEMP20,
                 P));
            
//#line 2139
Vec N =
              (X10_TEMP255);
            
//#line 2140
final Vec X10_TEMP258 =
              (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP3))/* } */.d);
            
//#line 2142
final Vec X10_TEMP25 =
              (X10_TEMP258);
            
//#line 2143
final double X10_TEMP263 =
              (Program0.
                 Program_Vec_dot(
                 X10_TEMP25,
                 N));
            
//#line 2145
final double X10_TEMP26 =
              (X10_TEMP263);
            
//#line 2146
final double X10_TEMP266 =
              (0.0);
            
//#line 2148
final double X10_TEMP27 =
              (X10_TEMP266);
            
//#line 2149
final boolean X10_TEMP29 =
              (X10_TEMP26 >=
                 X10_TEMP27);
            
//#line 2150
if (X10_TEMP29) {
                
//#line 2151
final Vec X10_TEMP272 =
                  (Program0.
                     Program_Vec_negate(
                     N));
                
//#line 2153
final Vec X10_TEMP31 =
                  (X10_TEMP272);
                
//#line 2154
final Vec X10_TEMP275 =
                  (X10_TEMP31);
                
//#line 2156
N =
                  ((X10_TEMP275));
            }
            
//#line 2158
final Vec X10_TEMP278 =
              (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP3))/* } */.d);
            
//#line 2160
final Vec X10_TEMP39 =
              (X10_TEMP278);
            
//#line 2161
final Vec X10_TEMP289 =
              (Program0.
                 Program_RayTracer_shade(
                 X10_TEMP0,
                 X10_TEMP1,
                 X10_TEMP2,
                 P,
                 N,
                 X10_TEMP39,
                 X10_TEMP4,
                 X10_TEMP5));
            
//#line 2163
final Vec X10_TEMP41 =
              (X10_TEMP289);
            
//#line 2164
return X10_TEMP41;
        }
        
//#line 2166
return _Program__RayTracer_voidVec;
    }
    
    
//#line 2168
public static Ray
                    Program_Ray_d(
                    final Ray X10_TEMP0,
                    final Vec d_) {
        
//#line 2169
Vec X10_TEMP1 =
          (d_);
        
//#line 2170
final Vec X10_TEMP218 =
          (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.p);
        
//#line 2172
Vec X10_TEMP5 =
          (X10_TEMP218);
        
//#line 2173
final boolean X10_TEMP221 =
          (false);
        
//#line 2175
boolean X10_TEMP6 =
          (X10_TEMP221);
        
//#line 2176
final Ray X10_TEMP227 =
          (new Ray(
             X10_TEMP5,
             X10_TEMP1,
             X10_TEMP6));
        
//#line 2178
final Ray X10_TEMP8 =
          (X10_TEMP227);
        
//#line 2179
return X10_TEMP8;
    }
    
    
//#line 2181
public static Vec
                    Program_Ray_rayPoint(
                    final Ray X10_TEMP0,
                    final double t) {
        
//#line 2182
double X10_TEMP1 =
          (t);
        
//#line 2183
final Vec X10_TEMP218 =
          (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.p);
        
//#line 2185
final Vec X10_TEMP2 =
          (X10_TEMP218);
        
//#line 2186
final double X10_TEMP221 =
          (X10_TEMP2.
             x);
        
//#line 2188
final double X10_TEMP5 =
          (X10_TEMP221);
        
//#line 2189
final Vec X10_TEMP224 =
          (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.d);
        
//#line 2191
final Vec X10_TEMP3 =
          (X10_TEMP224);
        
//#line 2192
final double X10_TEMP227 =
          (X10_TEMP3.
             x);
        
//#line 2194
final double X10_TEMP4 =
          (X10_TEMP227);
        
//#line 2195
final double X10_TEMP230 =
          (X10_TEMP4 *
             X10_TEMP1);
        
//#line 2197
final double X10_TEMP6 =
          (X10_TEMP230);
        
//#line 2198
final double X10_TEMP233 =
          (X10_TEMP5 +
             X10_TEMP6);
        
//#line 2200
double X10_TEMP21 =
          (X10_TEMP233);
        
//#line 2201
final Vec X10_TEMP236 =
          (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.p);
        
//#line 2203
final Vec X10_TEMP8 =
          (X10_TEMP236);
        
//#line 2204
final double X10_TEMP239 =
          (X10_TEMP8.
             y);
        
//#line 2206
final double X10_TEMP11 =
          (X10_TEMP239);
        
//#line 2207
final Vec X10_TEMP242 =
          (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.d);
        
//#line 2209
final Vec X10_TEMP9 =
          (X10_TEMP242);
        
//#line 2210
final double X10_TEMP245 =
          (X10_TEMP9.
             y);
        
//#line 2212
final double X10_TEMP10 =
          (X10_TEMP245);
        
//#line 2213
final double X10_TEMP248 =
          (X10_TEMP10 *
             X10_TEMP1);
        
//#line 2215
final double X10_TEMP12 =
          (X10_TEMP248);
        
//#line 2216
final double X10_TEMP251 =
          (X10_TEMP11 +
             X10_TEMP12);
        
//#line 2218
double X10_TEMP22 =
          (X10_TEMP251);
        
//#line 2219
final Vec X10_TEMP254 =
          (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.p);
        
//#line 2221
final Vec X10_TEMP14 =
          (X10_TEMP254);
        
//#line 2222
final double X10_TEMP257 =
          (X10_TEMP14.
             z);
        
//#line 2224
final double X10_TEMP17 =
          (X10_TEMP257);
        
//#line 2225
final Vec X10_TEMP260 =
          (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.d);
        
//#line 2227
final Vec X10_TEMP15 =
          (X10_TEMP260);
        
//#line 2228
final double X10_TEMP263 =
          (X10_TEMP15.
             z);
        
//#line 2230
final double X10_TEMP16 =
          (X10_TEMP263);
        
//#line 2231
final double X10_TEMP266 =
          (X10_TEMP16 *
             X10_TEMP1);
        
//#line 2233
final double X10_TEMP18 =
          (X10_TEMP266);
        
//#line 2234
final double X10_TEMP269 =
          (X10_TEMP17 +
             X10_TEMP18);
        
//#line 2236
double X10_TEMP23 =
          (X10_TEMP269);
        
//#line 2237
final boolean X10_TEMP272 =
          (false);
        
//#line 2239
boolean X10_TEMP24 =
          (X10_TEMP272);
        
//#line 2240
final Vec X10_TEMP279 =
          (new Vec(
             X10_TEMP21,
             X10_TEMP22,
             X10_TEMP23,
             X10_TEMP24));
        
//#line 2242
final Vec X10_TEMP26 =
          (X10_TEMP279);
        
//#line 2243
return X10_TEMP26;
    }
    
    
//#line 2245
public static java.
                    lang.
                    String
                    Program_Ray_toString(
                    final Ray X10_TEMP0) {
        
//#line 2246
final java.
          lang.
          String X10_TEMP217 =
          (" { ");
        
//#line 2248
final java.
          lang.
          String X10_TEMP2 =
          (X10_TEMP217);
        
//#line 2249
final Vec X10_TEMP220 =
          (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.p);
        
//#line 2251
final Vec X10_TEMP1 =
          (X10_TEMP220);
        
//#line 2252
final java.
          lang.
          String X10_TEMP224 =
          (Program0.
             Program_Vec_toString(
             X10_TEMP1));
        
//#line 2254
final java.
          lang.
          String X10_TEMP3 =
          (X10_TEMP224);
        
//#line 2255
final java.
          lang.
          String X10_TEMP227 =
          (X10_TEMP2 +
           X10_TEMP3);
        
//#line 2257
final java.
          lang.
          String X10_TEMP4 =
          (X10_TEMP227);
        
//#line 2258
final java.
          lang.
          String X10_TEMP230 =
          ("->");
        
//#line 2260
final java.
          lang.
          String X10_TEMP5 =
          (X10_TEMP230);
        
//#line 2261
final java.
          lang.
          String X10_TEMP233 =
          (X10_TEMP4 +
           X10_TEMP5);
        
//#line 2263
final java.
          lang.
          String X10_TEMP7 =
          (X10_TEMP233);
        
//#line 2264
final Vec X10_TEMP236 =
          (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.d);
        
//#line 2266
final Vec X10_TEMP6 =
          (X10_TEMP236);
        
//#line 2267
final java.
          lang.
          String X10_TEMP240 =
          (Program0.
             Program_Vec_toString(
             X10_TEMP6));
        
//#line 2269
final java.
          lang.
          String X10_TEMP8 =
          (X10_TEMP240);
        
//#line 2270
final java.
          lang.
          String X10_TEMP243 =
          (X10_TEMP7 +
           X10_TEMP8);
        
//#line 2272
final java.
          lang.
          String X10_TEMP9 =
          (X10_TEMP243);
        
//#line 2273
final java.
          lang.
          String X10_TEMP246 =
          (" } ");
        
//#line 2275
final java.
          lang.
          String X10_TEMP10 =
          (X10_TEMP246);
        
//#line 2276
final java.
          lang.
          String X10_TEMP249 =
          (X10_TEMP9 +
           X10_TEMP10);
        
//#line 2278
final java.
          lang.
          String X10_TEMP12 =
          (X10_TEMP249);
        
//#line 2279
return X10_TEMP12;
    }
    
    
//#line 2281
public static int
                    Program__Scene_maxObjects_init(
                    ) {
        
//#line 2282
final int X10_TEMP217 =
          (64);
        
//#line 2284
final int X10_TEMP2 =
          (X10_TEMP217);
        
//#line 2285
return X10_TEMP2;
    }
    
    
//#line 2287
public static int
                    Program__Scene_maxLights_init(
                    ) {
        
//#line 2288
final int X10_TEMP217 =
          (5);
        
//#line 2290
final int X10_TEMP2 =
          (X10_TEMP217);
        
//#line 2291
return X10_TEMP2;
    }
    
    
//#line 2293
public static void
                    Program_Scene_addLight(
                    final Scene X10_TEMP0,
                    final Light l) {
        
//#line 2294
Light X10_TEMP1 =
          (l);
        
//#line 2295
final int X10_TEMP218 =
          (/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lightCount);
        
//#line 2297
final int X10_TEMP3 =
          (X10_TEMP218);
        
//#line 2298
final int X10_TEMP221 =
          (1);
        
//#line 2300
final int X10_TEMP2 =
          (X10_TEMP221);
        
//#line 2301
final int X10_TEMP224 =
          (_Program__Scene_maxLights -
             X10_TEMP2);
        
//#line 2303
final int X10_TEMP4 =
          (X10_TEMP224);
        
//#line 2304
final boolean X10_TEMP6 =
          (X10_TEMP3 >
             X10_TEMP4);
        
//#line 2305
if (X10_TEMP6) {
            
//#line 2306
final java.
              lang.
              String X10_TEMP229 =
              ("Only ");
            
//#line 2308
final java.
              lang.
              String X10_TEMP7 =
              (X10_TEMP229);
            
//#line 2309
final java.
              lang.
              String X10_TEMP232 =
              (X10_TEMP7 +
               _Program__Scene_maxLights);
            
//#line 2311
final java.
              lang.
              String X10_TEMP8 =
              (X10_TEMP232);
            
//#line 2312
final java.
              lang.
              String X10_TEMP235 =
              (" lights allowed");
            
//#line 2314
final java.
              lang.
              String X10_TEMP9 =
              (X10_TEMP235);
            
//#line 2315
final java.
              lang.
              String X10_TEMP238 =
              (X10_TEMP8 +
               X10_TEMP9);
            
//#line 2317
final java.
              lang.
              String X10_TEMP11 =
              (X10_TEMP238);
            
//#line 2318
throw new java.
              lang.
              RuntimeException(
              X10_TEMP11);
        }
        
//#line 2320
final x10.
          lang.
          GenericReferenceArray X10_TEMP242 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lights));
        
//#line 2322
final x10.
          lang.
          GenericReferenceArray X10_TEMP12 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP242));
        
//#line 2323
final int X10_TEMP245 =
          (/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lightCount);
        
//#line 2325
final int X10_TEMP13 =
          (X10_TEMP245);
        
//#line 2326
final int X10_TEMP14 =
          (1);
        
//#line 2327
final int X10_TEMP249 =
          (/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lightCount);
        
//#line 2329
final int X10_TEMP15 =
          (X10_TEMP249);
        
//#line 2330
final int X10_TEMP252 =
          (X10_TEMP15 +
             X10_TEMP14);
        
//#line 2332
final int X10_TEMP16 =
          (X10_TEMP252);
        
//#line 2333
final int X10_TEMP255 =
          (X10_TEMP16);
        
//#line 2335
final int X10_TEMP258 =
          (X10_TEMP255);
        
//#line 2336
/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lightCount =
          ((X10_TEMP258));
        
//#line 2337
final Light X10_TEMP260 =
          (X10_TEMP1);
        
//#line 2339
final Light X10_TEMP20 =
          (X10_TEMP260);
        
//#line 2340
final Light X10_TEMP264 =
          (X10_TEMP20);
        
//#line 2342
final Light X10_TEMP267 =
          (X10_TEMP264);
        
//#line 2343
/* template:array_set { */(X10_TEMP12).set((X10_TEMP267),X10_TEMP13)/* } */;
    }
    
    
//#line 2345
public static void
                    Program_Scene_addObject(
                    final Scene X10_TEMP0,
                    final Sphere object) {
        
//#line 2346
Sphere X10_TEMP1 =
          (object);
        
//#line 2347
final int X10_TEMP218 =
          (/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.objectCount);
        
//#line 2349
final int X10_TEMP3 =
          (X10_TEMP218);
        
//#line 2350
final int X10_TEMP221 =
          (1);
        
//#line 2352
final int X10_TEMP2 =
          (X10_TEMP221);
        
//#line 2353
final int X10_TEMP224 =
          (_Program__Scene_maxObjects -
             X10_TEMP2);
        
//#line 2355
final int X10_TEMP4 =
          (X10_TEMP224);
        
//#line 2356
final boolean X10_TEMP6 =
          (X10_TEMP3 >
             X10_TEMP4);
        
//#line 2357
if (X10_TEMP6) {
            
//#line 2358
final java.
              lang.
              String X10_TEMP229 =
              ("Only ");
            
//#line 2360
final java.
              lang.
              String X10_TEMP7 =
              (X10_TEMP229);
            
//#line 2361
final java.
              lang.
              String X10_TEMP232 =
              (X10_TEMP7 +
               _Program__Scene_maxObjects);
            
//#line 2363
final java.
              lang.
              String X10_TEMP8 =
              (X10_TEMP232);
            
//#line 2364
final java.
              lang.
              String X10_TEMP235 =
              (" objects allowed");
            
//#line 2366
final java.
              lang.
              String X10_TEMP9 =
              (X10_TEMP235);
            
//#line 2367
final java.
              lang.
              String X10_TEMP238 =
              (X10_TEMP8 +
               X10_TEMP9);
            
//#line 2369
final java.
              lang.
              String X10_TEMP11 =
              (X10_TEMP238);
            
//#line 2370
throw new java.
              lang.
              RuntimeException(
              X10_TEMP11);
        }
        
//#line 2372
final x10.
          lang.
          GenericReferenceArray X10_TEMP242 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.objects));
        
//#line 2374
final x10.
          lang.
          GenericReferenceArray X10_TEMP12 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP242));
        
//#line 2375
final int X10_TEMP245 =
          (/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.objectCount);
        
//#line 2377
final int X10_TEMP13 =
          (X10_TEMP245);
        
//#line 2378
final int X10_TEMP14 =
          (1);
        
//#line 2379
final int X10_TEMP249 =
          (/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.objectCount);
        
//#line 2381
final int X10_TEMP15 =
          (X10_TEMP249);
        
//#line 2382
final int X10_TEMP252 =
          (X10_TEMP15 +
             X10_TEMP14);
        
//#line 2384
final int X10_TEMP16 =
          (X10_TEMP252);
        
//#line 2385
final int X10_TEMP255 =
          (X10_TEMP16);
        
//#line 2387
final int X10_TEMP258 =
          (X10_TEMP255);
        
//#line 2388
/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.objectCount =
          ((X10_TEMP258));
        
//#line 2389
final Sphere X10_TEMP260 =
          (X10_TEMP1);
        
//#line 2391
final Sphere X10_TEMP20 =
          (X10_TEMP260);
        
//#line 2392
final Sphere X10_TEMP264 =
          (X10_TEMP20);
        
//#line 2394
final Sphere X10_TEMP267 =
          (X10_TEMP264);
        
//#line 2395
/* template:array_set { */(X10_TEMP12).set((X10_TEMP267),X10_TEMP13)/* } */;
    }
    
    
//#line 2397
public static View
                    Program_Scene_getView(
                    final Scene X10_TEMP0) {
        
//#line 2398
final View X10_TEMP217 =
          (/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.view);
        
//#line 2400
final View X10_TEMP2 =
          (X10_TEMP217);
        
//#line 2401
return X10_TEMP2;
    }
    
    
//#line 2403
public static Light
                    Program_Scene_getLight(
                    final Scene X10_TEMP0,
                    final int number) {
        
//#line 2404
int X10_TEMP1 =
          (number);
        
//#line 2405
final x10.
          lang.
          GenericReferenceArray X10_TEMP218 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lights));
        
//#line 2407
final x10.
          lang.
          GenericReferenceArray X10_TEMP2 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP218));
        
//#line 2408
final Light X10_TEMP222 =
          (/* template:parametric { */((Light)(/* template:array_get { */((X10_TEMP2).get(X10_TEMP1))/* } */))/* } */);
        
//#line 2410
final Light X10_TEMP5 =
          (X10_TEMP222);
        
//#line 2411
return X10_TEMP5;
    }
    
    
//#line 2413
public static Sphere
                    Program_Scene_getObject(
                    final Scene X10_TEMP0,
                    final int number) {
        
//#line 2414
int X10_TEMP1 =
          (number);
        
//#line 2415
final x10.
          lang.
          GenericReferenceArray X10_TEMP218 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.objects));
        
//#line 2417
final x10.
          lang.
          GenericReferenceArray X10_TEMP2 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP218));
        
//#line 2418
final Sphere X10_TEMP222 =
          (/* template:parametric { */((Sphere)(/* template:array_get { */((X10_TEMP2).get(X10_TEMP1))/* } */))/* } */);
        
//#line 2420
final Sphere X10_TEMP5 =
          (X10_TEMP222);
        
//#line 2421
return X10_TEMP5;
    }
    
    
//#line 2423
public static int
                    Program_Scene_getLights(
                    final Scene X10_TEMP0) {
        
//#line 2424
final int X10_TEMP217 =
          (/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.lightCount);
        
//#line 2426
final int X10_TEMP2 =
          (X10_TEMP217);
        
//#line 2427
return X10_TEMP2;
    }
    
    
//#line 2429
public static int
                    Program_Scene_getObjects(
                    final Scene X10_TEMP0) {
        
//#line 2430
final int X10_TEMP217 =
          (/* template:place-check { */((Scene) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.objectCount);
        
//#line 2432
final int X10_TEMP2 =
          (X10_TEMP217);
        
//#line 2433
return X10_TEMP2;
    }
    
    
//#line 2435
public static Isect
                    Program_Sphere_intersect(
                    final Sphere X10_TEMP0,
                    final Ray ry) {
        
//#line 2436
Ray X10_TEMP1 =
          (ry);
        
//#line 2437
final Vec X10_TEMP218 =
          (X10_TEMP0.
             c);
        
//#line 2439
final Vec X10_TEMP4 =
          (X10_TEMP218);
        
//#line 2440
final Vec X10_TEMP221 =
          (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP1))/* } */.p);
        
//#line 2442
final Vec X10_TEMP5 =
          (X10_TEMP221);
        
//#line 2443
final Vec X10_TEMP226 =
          (Program0.
             Program_Vec_sub(
             X10_TEMP4,
             X10_TEMP5));
        
//#line 2445
Vec v =
          (X10_TEMP226);
        
//#line 2446
final Vec X10_TEMP229 =
          (/* template:place-check { */((Ray) x10.lang.Runtime.hereCheck(X10_TEMP1))/* } */.d);
        
//#line 2448
final Vec X10_TEMP9 =
          (X10_TEMP229);
        
//#line 2449
final double X10_TEMP234 =
          (Program0.
             Program_Vec_dot(
             v,
             X10_TEMP9));
        
//#line 2451
double b =
          (X10_TEMP234);
        
//#line 2452
final double X10_TEMP237 =
          (b *
             b);
        
//#line 2454
final double X10_TEMP13 =
          (X10_TEMP237);
        
//#line 2455
final double X10_TEMP242 =
          (Program0.
             Program_Vec_dot(
             v,
             v));
        
//#line 2457
final double X10_TEMP14 =
          (X10_TEMP242);
        
//#line 2458
final double X10_TEMP245 =
          (X10_TEMP13 -
             X10_TEMP14);
        
//#line 2460
final double X10_TEMP15 =
          (X10_TEMP245);
        
//#line 2461
final double X10_TEMP248 =
          (X10_TEMP0.
             r2);
        
//#line 2463
final double X10_TEMP16 =
          (X10_TEMP248);
        
//#line 2464
final double X10_TEMP251 =
          (X10_TEMP15 +
             X10_TEMP16);
        
//#line 2466
double disc =
          (X10_TEMP251);
        
//#line 2467
final double X10_TEMP254 =
          (0.0);
        
//#line 2469
final double X10_TEMP18 =
          (X10_TEMP254);
        
//#line 2470
final boolean X10_TEMP20 =
          (disc <
             X10_TEMP18);
        
//#line 2471
if (X10_TEMP20) {
            
//#line 2472
final double X10_TEMP259 =
              (0.0);
            
//#line 2474
double X10_TEMP26 =
              (X10_TEMP259);
            
//#line 2475
final int X10_TEMP262 =
              (0);
            
//#line 2477
int X10_TEMP27 =
              (X10_TEMP262);
            
//#line 2478
final boolean X10_TEMP265 =
              (true);
            
//#line 2480
boolean X10_TEMP28 =
              (X10_TEMP265);
            
//#line 2481
final Surface X10_TEMP268 =
              (X10_TEMP0.
                 surf);
            
//#line 2483
Surface X10_TEMP29 =
              (X10_TEMP268);
            
//#line 2484
final Isect X10_TEMP276 =
              (new Isect(
                 X10_TEMP26,
                 X10_TEMP27,
                 X10_TEMP28,
                 X10_TEMP0,
                 X10_TEMP29));
            
//#line 2486
final Isect X10_TEMP31 =
              (X10_TEMP276);
            
//#line 2487
return X10_TEMP31;
        }
        
//#line 2489
final double X10_TEMP281 =
          (java.
             lang.
             Math.
             sqrt(
             disc));
        
//#line 2491
final double X10_TEMP34 =
          (X10_TEMP281);
        
//#line 2492
final double X10_TEMP284 =
          (X10_TEMP34);
        
//#line 2494
disc =
          ((X10_TEMP284));
        
//#line 2495
final double X10_TEMP287 =
          (b -
             disc);
        
//#line 2497
final double X10_TEMP35 =
          (X10_TEMP287);
        
//#line 2498
final double X10_TEMP290 =
          (1.0E-6);
        
//#line 2500
final double X10_TEMP36 =
          (X10_TEMP290);
        
//#line 2501
final boolean X10_TEMP293 =
          (X10_TEMP35 <
             X10_TEMP36);
        
//#line 2503
final boolean X10_TEMP38 =
          (X10_TEMP293);
        
//#line 2504
final boolean X10_TEMP39 =
          (X10_TEMP38);
        
//#line 2505
double X10_TEMP42 =
          (b -
             disc);
        
//#line 2506
if (X10_TEMP39) {
            
//#line 2507
final double X10_TEMP299 =
              (b +
                 disc);
            
//#line 2508
X10_TEMP42 =
              ((X10_TEMP299));
        }
        
//#line 2510
final double X10_TEMP43 =
          (X10_TEMP42);
        
//#line 2511
final double X10_TEMP302 =
          (X10_TEMP43);
        
//#line 2513
double t =
          (X10_TEMP302);
        
//#line 2514
final double X10_TEMP305 =
          (1.0E-6);
        
//#line 2516
final double X10_TEMP44 =
          (X10_TEMP305);
        
//#line 2517
final boolean X10_TEMP46 =
          (t <
             X10_TEMP44);
        
//#line 2518
if (X10_TEMP46) {
            
//#line 2519
final double X10_TEMP310 =
              (0.0);
            
//#line 2521
double X10_TEMP52 =
              (X10_TEMP310);
            
//#line 2522
final int X10_TEMP313 =
              (0);
            
//#line 2524
int X10_TEMP53 =
              (X10_TEMP313);
            
//#line 2525
final boolean X10_TEMP316 =
              (true);
            
//#line 2527
boolean X10_TEMP54 =
              (X10_TEMP316);
            
//#line 2528
final Surface X10_TEMP319 =
              (X10_TEMP0.
                 surf);
            
//#line 2530
Surface X10_TEMP55 =
              (X10_TEMP319);
            
//#line 2531
final Isect X10_TEMP327 =
              (new Isect(
                 X10_TEMP52,
                 X10_TEMP53,
                 X10_TEMP54,
                 X10_TEMP0,
                 X10_TEMP55));
            
//#line 2533
final Isect X10_TEMP57 =
              (X10_TEMP327);
            
//#line 2534
return X10_TEMP57;
        }
        
//#line 2536
final double X10_TEMP333 =
          (Program0.
             Program_Vec_dot(
             v,
             v));
        
//#line 2538
final double X10_TEMP63 =
          (X10_TEMP333);
        
//#line 2539
final double X10_TEMP336 =
          (X10_TEMP0.
             r2);
        
//#line 2541
final double X10_TEMP61 =
          (X10_TEMP336);
        
//#line 2542
final double X10_TEMP339 =
          (1.0E-6);
        
//#line 2544
final double X10_TEMP62 =
          (X10_TEMP339);
        
//#line 2545
final double X10_TEMP342 =
          (X10_TEMP61 +
             X10_TEMP62);
        
//#line 2547
final double X10_TEMP64 =
          (X10_TEMP342);
        
//#line 2548
final boolean X10_TEMP65 =
          (X10_TEMP63 >
             X10_TEMP64);
        
//#line 2549
int X10_TEMP68 =
          (0);
        
//#line 2550
if (X10_TEMP65) {
            
//#line 2551
final int X10_TEMP348 =
              (1);
            
//#line 2552
X10_TEMP68 =
              ((X10_TEMP348));
        }
        
//#line 2554
final int X10_TEMP69 =
          (X10_TEMP68);
        
//#line 2555
final boolean X10_TEMP351 =
          (false);
        
//#line 2557
boolean X10_TEMP73 =
          (X10_TEMP351);
        
//#line 2558
final Surface X10_TEMP354 =
          (X10_TEMP0.
             surf);
        
//#line 2560
Surface X10_TEMP74 =
          (X10_TEMP354);
        
//#line 2561
final Isect X10_TEMP362 =
          (new Isect(
             t,
             X10_TEMP69,
             X10_TEMP73,
             X10_TEMP0,
             X10_TEMP74));
        
//#line 2563
Isect ip =
          (X10_TEMP362);
        
//#line 2564
return ip;
    }
    
    
//#line 2566
public static Vec
                    Program_Sphere_normal(
                    final Sphere X10_TEMP0,
                    final Vec p) {
        
//#line 2567
Vec X10_TEMP1 =
          (p);
        
//#line 2568
final Vec X10_TEMP218 =
          (X10_TEMP0.
             c);
        
//#line 2570
final Vec X10_TEMP4 =
          (X10_TEMP218);
        
//#line 2571
final Vec X10_TEMP223 =
          (Program0.
             Program_Vec_sub(
             X10_TEMP1,
             X10_TEMP4));
        
//#line 2573
final Vec X10_TEMP5 =
          (X10_TEMP223);
        
//#line 2574
final Vec X10_TEMP227 =
          (Program0.
             Program_Vec_normalized(
             X10_TEMP5));
        
//#line 2576
final Vec X10_TEMP7 =
          (X10_TEMP227);
        
//#line 2577
return X10_TEMP7;
    }
    
    
//#line 2579
public static java.
                    lang.
                    String
                    Program_Sphere_toString(
                    final Sphere X10_TEMP0) {
        
//#line 2580
final java.
          lang.
          String X10_TEMP217 =
          ("Sphere {");
        
//#line 2582
final java.
          lang.
          String X10_TEMP2 =
          (X10_TEMP217);
        
//#line 2583
final Vec X10_TEMP220 =
          (X10_TEMP0.
             c);
        
//#line 2585
final Vec X10_TEMP1 =
          (X10_TEMP220);
        
//#line 2586
final java.
          lang.
          String X10_TEMP224 =
          (Program0.
             Program_Vec_toString(
             X10_TEMP1));
        
//#line 2588
final java.
          lang.
          String X10_TEMP3 =
          (X10_TEMP224);
        
//#line 2589
final java.
          lang.
          String X10_TEMP227 =
          (X10_TEMP2 +
           X10_TEMP3);
        
//#line 2591
final java.
          lang.
          String X10_TEMP4 =
          (X10_TEMP227);
        
//#line 2592
final java.
          lang.
          String X10_TEMP230 =
          (",");
        
//#line 2594
final java.
          lang.
          String X10_TEMP5 =
          (X10_TEMP230);
        
//#line 2595
final java.
          lang.
          String X10_TEMP233 =
          (X10_TEMP4 +
           X10_TEMP5);
        
//#line 2597
final java.
          lang.
          String X10_TEMP6 =
          (X10_TEMP233);
        
//#line 2598
final double X10_TEMP236 =
          (X10_TEMP0.
             r);
        
//#line 2600
final double X10_TEMP7 =
          (X10_TEMP236);
        
//#line 2601
final java.
          lang.
          String X10_TEMP239 =
          (X10_TEMP6 +
           X10_TEMP7);
        
//#line 2603
final java.
          lang.
          String X10_TEMP8 =
          (X10_TEMP239);
        
//#line 2604
final java.
          lang.
          String X10_TEMP242 =
          ("}");
        
//#line 2606
final java.
          lang.
          String X10_TEMP9 =
          (X10_TEMP242);
        
//#line 2607
final java.
          lang.
          String X10_TEMP245 =
          (X10_TEMP8 +
           X10_TEMP9);
        
//#line 2609
final java.
          lang.
          String X10_TEMP11 =
          (X10_TEMP245);
        
//#line 2610
return X10_TEMP11;
    }
    
    
//#line 2612
public static Vec
                    Program_Sphere_getCenter(
                    final Sphere X10_TEMP0) {
        
//#line 2613
final Vec X10_TEMP217 =
          (X10_TEMP0.
             c);
        
//#line 2615
final Vec X10_TEMP2 =
          (X10_TEMP217);
        
//#line 2616
return X10_TEMP2;
    }
    
    
//#line 2618
public static java.
                    lang.
                    String
                    Program_Surface_toString(
                    final Surface X10_TEMP0) {
        
//#line 2619
final java.
          lang.
          String X10_TEMP217 =
          ("Surface { color = ");
        
//#line 2621
final java.
          lang.
          String X10_TEMP1 =
          (X10_TEMP217);
        
//#line 2622
final Vec X10_TEMP220 =
          (X10_TEMP0.
             color);
        
//#line 2624
final Vec X10_TEMP2 =
          (X10_TEMP220);
        
//#line 2625
final java.
          lang.
          String X10_TEMP224 =
          (Program0.
             Program_Vec_toString(
             X10_TEMP2));
        
//#line 2627
final java.
          lang.
          String X10_TEMP3 =
          (X10_TEMP224);
        
//#line 2628
final java.
          lang.
          String X10_TEMP227 =
          (X10_TEMP1 +
           X10_TEMP3);
        
//#line 2630
final java.
          lang.
          String X10_TEMP4 =
          (X10_TEMP227);
        
//#line 2631
final java.
          lang.
          String X10_TEMP230 =
          (" }");
        
//#line 2633
final java.
          lang.
          String X10_TEMP5 =
          (X10_TEMP230);
        
//#line 2634
final java.
          lang.
          String X10_TEMP233 =
          (X10_TEMP4 +
           X10_TEMP5);
        
//#line 2636
final java.
          lang.
          String X10_TEMP7 =
          (X10_TEMP233);
        
//#line 2637
return X10_TEMP7;
    }
    
    
//#line 2639
public static Vec
                    Program_Vec_added(
                    final Vec X10_TEMP0,
                    final Vec a) {
        
//#line 2640
Vec X10_TEMP1 =
          (a);
        
//#line 2641
final double X10_TEMP218 =
          (X10_TEMP0.
             x);
        
//#line 2643
final double X10_TEMP2 =
          (X10_TEMP218);
        
//#line 2644
final double X10_TEMP221 =
          (X10_TEMP1.
             x);
        
//#line 2646
final double X10_TEMP3 =
          (X10_TEMP221);
        
//#line 2647
final double X10_TEMP224 =
          (X10_TEMP2 +
             X10_TEMP3);
        
//#line 2649
double X10_TEMP12 =
          (X10_TEMP224);
        
//#line 2650
final double X10_TEMP227 =
          (X10_TEMP0.
             y);
        
//#line 2652
final double X10_TEMP5 =
          (X10_TEMP227);
        
//#line 2653
final double X10_TEMP230 =
          (X10_TEMP1.
             y);
        
//#line 2655
final double X10_TEMP6 =
          (X10_TEMP230);
        
//#line 2656
final double X10_TEMP233 =
          (X10_TEMP5 +
             X10_TEMP6);
        
//#line 2658
double X10_TEMP13 =
          (X10_TEMP233);
        
//#line 2659
final double X10_TEMP236 =
          (X10_TEMP0.
             z);
        
//#line 2661
final double X10_TEMP8 =
          (X10_TEMP236);
        
//#line 2662
final double X10_TEMP239 =
          (X10_TEMP1.
             z);
        
//#line 2664
final double X10_TEMP9 =
          (X10_TEMP239);
        
//#line 2665
final double X10_TEMP242 =
          (X10_TEMP8 +
             X10_TEMP9);
        
//#line 2667
double X10_TEMP14 =
          (X10_TEMP242);
        
//#line 2668
final boolean X10_TEMP245 =
          (false);
        
//#line 2670
boolean X10_TEMP15 =
          (X10_TEMP245);
        
//#line 2671
final Vec X10_TEMP252 =
          (new Vec(
             X10_TEMP12,
             X10_TEMP13,
             X10_TEMP14,
             X10_TEMP15));
        
//#line 2673
final Vec X10_TEMP17 =
          (X10_TEMP252);
        
//#line 2674
return X10_TEMP17;
    }
    
    
//#line 2676
public static Vec
                    Program_Vec_adds3(
                    final double s,
                    final Vec a,
                    final Vec b) {
        
//#line 2677
double X10_TEMP1 =
          (s);
        
//#line 2678
Vec X10_TEMP2 =
          (a);
        
//#line 2679
Vec X10_TEMP3 =
          (b);
        
//#line 2680
final double X10_TEMP220 =
          (X10_TEMP2.
             x);
        
//#line 2682
final double X10_TEMP4 =
          (X10_TEMP220);
        
//#line 2683
final double X10_TEMP223 =
          (X10_TEMP1 *
             X10_TEMP4);
        
//#line 2685
final double X10_TEMP5 =
          (X10_TEMP223);
        
//#line 2686
final double X10_TEMP226 =
          (X10_TEMP3.
             x);
        
//#line 2688
final double X10_TEMP6 =
          (X10_TEMP226);
        
//#line 2689
final double X10_TEMP229 =
          (X10_TEMP5 +
             X10_TEMP6);
        
//#line 2691
double X10_TEMP17 =
          (X10_TEMP229);
        
//#line 2692
final double X10_TEMP232 =
          (X10_TEMP2.
             y);
        
//#line 2694
final double X10_TEMP8 =
          (X10_TEMP232);
        
//#line 2695
final double X10_TEMP235 =
          (X10_TEMP1 *
             X10_TEMP8);
        
//#line 2697
final double X10_TEMP9 =
          (X10_TEMP235);
        
//#line 2698
final double X10_TEMP238 =
          (X10_TEMP3.
             y);
        
//#line 2700
final double X10_TEMP10 =
          (X10_TEMP238);
        
//#line 2701
final double X10_TEMP241 =
          (X10_TEMP9 +
             X10_TEMP10);
        
//#line 2703
double X10_TEMP18 =
          (X10_TEMP241);
        
//#line 2704
final double X10_TEMP244 =
          (X10_TEMP2.
             z);
        
//#line 2706
final double X10_TEMP12 =
          (X10_TEMP244);
        
//#line 2707
final double X10_TEMP247 =
          (X10_TEMP1 *
             X10_TEMP12);
        
//#line 2709
final double X10_TEMP13 =
          (X10_TEMP247);
        
//#line 2710
final double X10_TEMP250 =
          (X10_TEMP3.
             z);
        
//#line 2712
final double X10_TEMP14 =
          (X10_TEMP250);
        
//#line 2713
final double X10_TEMP253 =
          (X10_TEMP13 +
             X10_TEMP14);
        
//#line 2715
double X10_TEMP19 =
          (X10_TEMP253);
        
//#line 2716
final boolean X10_TEMP256 =
          (false);
        
//#line 2718
boolean X10_TEMP20 =
          (X10_TEMP256);
        
//#line 2719
final Vec X10_TEMP263 =
          (new Vec(
             X10_TEMP17,
             X10_TEMP18,
             X10_TEMP19,
             X10_TEMP20));
        
//#line 2721
final Vec X10_TEMP22 =
          (X10_TEMP263);
        
//#line 2722
return X10_TEMP22;
    }
    
    
//#line 2724
public static Vec
                    Program_Vec_adds2(
                    final Vec X10_TEMP0,
                    final double s,
                    final Vec b) {
        
//#line 2725
double X10_TEMP1 =
          (s);
        
//#line 2726
Vec X10_TEMP2 =
          (b);
        
//#line 2727
final double X10_TEMP219 =
          (X10_TEMP0.
             x);
        
//#line 2729
final double X10_TEMP4 =
          (X10_TEMP219);
        
//#line 2730
final double X10_TEMP222 =
          (X10_TEMP2.
             x);
        
//#line 2732
final double X10_TEMP3 =
          (X10_TEMP222);
        
//#line 2733
final double X10_TEMP225 =
          (X10_TEMP1 *
             X10_TEMP3);
        
//#line 2735
final double X10_TEMP5 =
          (X10_TEMP225);
        
//#line 2736
final double X10_TEMP228 =
          (X10_TEMP4 +
             X10_TEMP5);
        
//#line 2738
double X10_TEMP16 =
          (X10_TEMP228);
        
//#line 2739
final double X10_TEMP231 =
          (X10_TEMP0.
             y);
        
//#line 2741
final double X10_TEMP8 =
          (X10_TEMP231);
        
//#line 2742
final double X10_TEMP234 =
          (X10_TEMP2.
             y);
        
//#line 2744
final double X10_TEMP7 =
          (X10_TEMP234);
        
//#line 2745
final double X10_TEMP237 =
          (X10_TEMP1 *
             X10_TEMP7);
        
//#line 2747
final double X10_TEMP9 =
          (X10_TEMP237);
        
//#line 2748
final double X10_TEMP240 =
          (X10_TEMP8 +
             X10_TEMP9);
        
//#line 2750
double X10_TEMP17 =
          (X10_TEMP240);
        
//#line 2751
final double X10_TEMP243 =
          (X10_TEMP0.
             z);
        
//#line 2753
final double X10_TEMP12 =
          (X10_TEMP243);
        
//#line 2754
final double X10_TEMP246 =
          (X10_TEMP2.
             z);
        
//#line 2756
final double X10_TEMP11 =
          (X10_TEMP246);
        
//#line 2757
final double X10_TEMP249 =
          (X10_TEMP1 *
             X10_TEMP11);
        
//#line 2759
final double X10_TEMP13 =
          (X10_TEMP249);
        
//#line 2760
final double X10_TEMP252 =
          (X10_TEMP12 +
             X10_TEMP13);
        
//#line 2762
double X10_TEMP18 =
          (X10_TEMP252);
        
//#line 2763
final boolean X10_TEMP255 =
          (false);
        
//#line 2765
boolean X10_TEMP19 =
          (X10_TEMP255);
        
//#line 2766
final Vec X10_TEMP262 =
          (new Vec(
             X10_TEMP16,
             X10_TEMP17,
             X10_TEMP18,
             X10_TEMP19));
        
//#line 2768
final Vec X10_TEMP21 =
          (X10_TEMP262);
        
//#line 2769
return X10_TEMP21;
    }
    
    
//#line 2771
public static Vec
                    Program_Vec_sub(
                    final Vec a,
                    final Vec b) {
        
//#line 2772
Vec X10_TEMP1 =
          (a);
        
//#line 2773
Vec X10_TEMP2 =
          (b);
        
//#line 2774
final double X10_TEMP219 =
          (X10_TEMP1.
             x);
        
//#line 2776
final double X10_TEMP3 =
          (X10_TEMP219);
        
//#line 2777
final double X10_TEMP222 =
          (X10_TEMP2.
             x);
        
//#line 2779
final double X10_TEMP4 =
          (X10_TEMP222);
        
//#line 2780
final double X10_TEMP225 =
          (X10_TEMP3 -
             X10_TEMP4);
        
//#line 2782
double X10_TEMP13 =
          (X10_TEMP225);
        
//#line 2783
final double X10_TEMP228 =
          (X10_TEMP1.
             y);
        
//#line 2785
final double X10_TEMP6 =
          (X10_TEMP228);
        
//#line 2786
final double X10_TEMP231 =
          (X10_TEMP2.
             y);
        
//#line 2788
final double X10_TEMP7 =
          (X10_TEMP231);
        
//#line 2789
final double X10_TEMP234 =
          (X10_TEMP6 -
             X10_TEMP7);
        
//#line 2791
double X10_TEMP14 =
          (X10_TEMP234);
        
//#line 2792
final double X10_TEMP237 =
          (X10_TEMP1.
             z);
        
//#line 2794
final double X10_TEMP9 =
          (X10_TEMP237);
        
//#line 2795
final double X10_TEMP240 =
          (X10_TEMP2.
             z);
        
//#line 2797
final double X10_TEMP10 =
          (X10_TEMP240);
        
//#line 2798
final double X10_TEMP243 =
          (X10_TEMP9 -
             X10_TEMP10);
        
//#line 2800
double X10_TEMP15 =
          (X10_TEMP243);
        
//#line 2801
final boolean X10_TEMP246 =
          (false);
        
//#line 2803
boolean X10_TEMP16 =
          (X10_TEMP246);
        
//#line 2804
final Vec X10_TEMP253 =
          (new Vec(
             X10_TEMP13,
             X10_TEMP14,
             X10_TEMP15,
             X10_TEMP16));
        
//#line 2806
final Vec X10_TEMP18 =
          (X10_TEMP253);
        
//#line 2807
return X10_TEMP18;
    }
    
    
//#line 2809
public static Vec
                    Program_Vec_mult(
                    final Vec a,
                    final Vec b) {
        
//#line 2810
Vec X10_TEMP1 =
          (a);
        
//#line 2811
Vec X10_TEMP2 =
          (b);
        
//#line 2812
final double X10_TEMP219 =
          (X10_TEMP1.
             x);
        
//#line 2814
final double X10_TEMP3 =
          (X10_TEMP219);
        
//#line 2815
final double X10_TEMP222 =
          (X10_TEMP2.
             x);
        
//#line 2817
final double X10_TEMP4 =
          (X10_TEMP222);
        
//#line 2818
final double X10_TEMP225 =
          (X10_TEMP3 *
             X10_TEMP4);
        
//#line 2820
double X10_TEMP13 =
          (X10_TEMP225);
        
//#line 2821
final double X10_TEMP228 =
          (X10_TEMP1.
             y);
        
//#line 2823
final double X10_TEMP6 =
          (X10_TEMP228);
        
//#line 2824
final double X10_TEMP231 =
          (X10_TEMP2.
             y);
        
//#line 2826
final double X10_TEMP7 =
          (X10_TEMP231);
        
//#line 2827
final double X10_TEMP234 =
          (X10_TEMP6 *
             X10_TEMP7);
        
//#line 2829
double X10_TEMP14 =
          (X10_TEMP234);
        
//#line 2830
final double X10_TEMP237 =
          (X10_TEMP1.
             z);
        
//#line 2832
final double X10_TEMP9 =
          (X10_TEMP237);
        
//#line 2833
final double X10_TEMP240 =
          (X10_TEMP2.
             z);
        
//#line 2835
final double X10_TEMP10 =
          (X10_TEMP240);
        
//#line 2836
final double X10_TEMP243 =
          (X10_TEMP9 *
             X10_TEMP10);
        
//#line 2838
double X10_TEMP15 =
          (X10_TEMP243);
        
//#line 2839
final boolean X10_TEMP246 =
          (false);
        
//#line 2841
boolean X10_TEMP16 =
          (X10_TEMP246);
        
//#line 2842
final Vec X10_TEMP253 =
          (new Vec(
             X10_TEMP13,
             X10_TEMP14,
             X10_TEMP15,
             X10_TEMP16));
        
//#line 2844
final Vec X10_TEMP18 =
          (X10_TEMP253);
        
//#line 2845
return X10_TEMP18;
    }
    
    
//#line 2847
public static Vec
                    Program_Vec_cross(
                    final Vec a,
                    final Vec b) {
        
//#line 2848
Vec X10_TEMP1 =
          (a);
        
//#line 2849
Vec X10_TEMP2 =
          (b);
        
//#line 2850
final double X10_TEMP219 =
          (X10_TEMP1.
             y);
        
//#line 2852
final double X10_TEMP3 =
          (X10_TEMP219);
        
//#line 2853
final double X10_TEMP222 =
          (X10_TEMP2.
             z);
        
//#line 2855
final double X10_TEMP4 =
          (X10_TEMP222);
        
//#line 2856
final double X10_TEMP225 =
          (X10_TEMP3 *
             X10_TEMP4);
        
//#line 2858
final double X10_TEMP7 =
          (X10_TEMP225);
        
//#line 2859
final double X10_TEMP228 =
          (X10_TEMP1.
             z);
        
//#line 2861
final double X10_TEMP5 =
          (X10_TEMP228);
        
//#line 2862
final double X10_TEMP231 =
          (X10_TEMP2.
             y);
        
//#line 2864
final double X10_TEMP6 =
          (X10_TEMP231);
        
//#line 2865
final double X10_TEMP234 =
          (X10_TEMP5 *
             X10_TEMP6);
        
//#line 2867
final double X10_TEMP8 =
          (X10_TEMP234);
        
//#line 2868
final double X10_TEMP237 =
          (X10_TEMP7 -
             X10_TEMP8);
        
//#line 2870
double X10_TEMP25 =
          (X10_TEMP237);
        
//#line 2871
final double X10_TEMP240 =
          (X10_TEMP1.
             z);
        
//#line 2873
final double X10_TEMP10 =
          (X10_TEMP240);
        
//#line 2874
final double X10_TEMP243 =
          (X10_TEMP2.
             x);
        
//#line 2876
final double X10_TEMP11 =
          (X10_TEMP243);
        
//#line 2877
final double X10_TEMP246 =
          (X10_TEMP10 *
             X10_TEMP11);
        
//#line 2879
final double X10_TEMP14 =
          (X10_TEMP246);
        
//#line 2880
final double X10_TEMP249 =
          (X10_TEMP1.
             x);
        
//#line 2882
final double X10_TEMP12 =
          (X10_TEMP249);
        
//#line 2883
final double X10_TEMP252 =
          (X10_TEMP2.
             z);
        
//#line 2885
final double X10_TEMP13 =
          (X10_TEMP252);
        
//#line 2886
final double X10_TEMP255 =
          (X10_TEMP12 *
             X10_TEMP13);
        
//#line 2888
final double X10_TEMP15 =
          (X10_TEMP255);
        
//#line 2889
final double X10_TEMP258 =
          (X10_TEMP14 -
             X10_TEMP15);
        
//#line 2891
double X10_TEMP26 =
          (X10_TEMP258);
        
//#line 2892
final double X10_TEMP261 =
          (X10_TEMP1.
             x);
        
//#line 2894
final double X10_TEMP17 =
          (X10_TEMP261);
        
//#line 2895
final double X10_TEMP264 =
          (X10_TEMP2.
             y);
        
//#line 2897
final double X10_TEMP18 =
          (X10_TEMP264);
        
//#line 2898
final double X10_TEMP267 =
          (X10_TEMP17 *
             X10_TEMP18);
        
//#line 2900
final double X10_TEMP21 =
          (X10_TEMP267);
        
//#line 2901
final double X10_TEMP270 =
          (X10_TEMP1.
             y);
        
//#line 2903
final double X10_TEMP19 =
          (X10_TEMP270);
        
//#line 2904
final double X10_TEMP273 =
          (X10_TEMP2.
             x);
        
//#line 2906
final double X10_TEMP20 =
          (X10_TEMP273);
        
//#line 2907
final double X10_TEMP276 =
          (X10_TEMP19 *
             X10_TEMP20);
        
//#line 2909
final double X10_TEMP22 =
          (X10_TEMP276);
        
//#line 2910
final double X10_TEMP279 =
          (X10_TEMP21 -
             X10_TEMP22);
        
//#line 2912
double X10_TEMP27 =
          (X10_TEMP279);
        
//#line 2913
final boolean X10_TEMP282 =
          (false);
        
//#line 2915
boolean X10_TEMP28 =
          (X10_TEMP282);
        
//#line 2916
final Vec X10_TEMP289 =
          (new Vec(
             X10_TEMP25,
             X10_TEMP26,
             X10_TEMP27,
             X10_TEMP28));
        
//#line 2918
final Vec X10_TEMP30 =
          (X10_TEMP289);
        
//#line 2919
return X10_TEMP30;
    }
    
    
//#line 2921
public static double
                    Program_Vec_dot(
                    final Vec a,
                    final Vec b) {
        
//#line 2922
Vec X10_TEMP1 =
          (a);
        
//#line 2923
Vec X10_TEMP2 =
          (b);
        
//#line 2924
final double X10_TEMP219 =
          (X10_TEMP1.
             x);
        
//#line 2926
final double X10_TEMP3 =
          (X10_TEMP219);
        
//#line 2927
final double X10_TEMP222 =
          (X10_TEMP2.
             x);
        
//#line 2929
final double X10_TEMP4 =
          (X10_TEMP222);
        
//#line 2930
final double X10_TEMP225 =
          (X10_TEMP3 *
             X10_TEMP4);
        
//#line 2932
final double X10_TEMP7 =
          (X10_TEMP225);
        
//#line 2933
final double X10_TEMP228 =
          (X10_TEMP1.
             y);
        
//#line 2935
final double X10_TEMP5 =
          (X10_TEMP228);
        
//#line 2936
final double X10_TEMP231 =
          (X10_TEMP2.
             y);
        
//#line 2938
final double X10_TEMP6 =
          (X10_TEMP231);
        
//#line 2939
final double X10_TEMP234 =
          (X10_TEMP5 *
             X10_TEMP6);
        
//#line 2941
final double X10_TEMP8 =
          (X10_TEMP234);
        
//#line 2942
final double X10_TEMP237 =
          (X10_TEMP7 +
             X10_TEMP8);
        
//#line 2944
final double X10_TEMP11 =
          (X10_TEMP237);
        
//#line 2945
final double X10_TEMP240 =
          (X10_TEMP1.
             z);
        
//#line 2947
final double X10_TEMP9 =
          (X10_TEMP240);
        
//#line 2948
final double X10_TEMP243 =
          (X10_TEMP2.
             z);
        
//#line 2950
final double X10_TEMP10 =
          (X10_TEMP243);
        
//#line 2951
final double X10_TEMP246 =
          (X10_TEMP9 *
             X10_TEMP10);
        
//#line 2953
final double X10_TEMP12 =
          (X10_TEMP246);
        
//#line 2954
final double X10_TEMP249 =
          (X10_TEMP11 +
             X10_TEMP12);
        
//#line 2956
final double X10_TEMP14 =
          (X10_TEMP249);
        
//#line 2957
return X10_TEMP14;
    }
    
    
//#line 2959
public static Vec
                    Program_Vec_comb(
                    final double a,
                    final Vec A,
                    final double b,
                    final Vec B) {
        
//#line 2960
double X10_TEMP1 =
          (a);
        
//#line 2961
Vec X10_TEMP2 =
          (A);
        
//#line 2962
double X10_TEMP3 =
          (b);
        
//#line 2963
Vec X10_TEMP4 =
          (B);
        
//#line 2964
final double X10_TEMP221 =
          (X10_TEMP2.
             x);
        
//#line 2966
final double X10_TEMP5 =
          (X10_TEMP221);
        
//#line 2967
final double X10_TEMP224 =
          (X10_TEMP1 *
             X10_TEMP5);
        
//#line 2969
final double X10_TEMP7 =
          (X10_TEMP224);
        
//#line 2970
final double X10_TEMP227 =
          (X10_TEMP4.
             x);
        
//#line 2972
final double X10_TEMP6 =
          (X10_TEMP227);
        
//#line 2973
final double X10_TEMP230 =
          (X10_TEMP3 *
             X10_TEMP6);
        
//#line 2975
final double X10_TEMP8 =
          (X10_TEMP230);
        
//#line 2976
final double X10_TEMP233 =
          (X10_TEMP7 +
             X10_TEMP8);
        
//#line 2978
double X10_TEMP21 =
          (X10_TEMP233);
        
//#line 2979
final double X10_TEMP236 =
          (X10_TEMP2.
             y);
        
//#line 2981
final double X10_TEMP10 =
          (X10_TEMP236);
        
//#line 2982
final double X10_TEMP239 =
          (X10_TEMP1 *
             X10_TEMP10);
        
//#line 2984
final double X10_TEMP12 =
          (X10_TEMP239);
        
//#line 2985
final double X10_TEMP242 =
          (X10_TEMP4.
             y);
        
//#line 2987
final double X10_TEMP11 =
          (X10_TEMP242);
        
//#line 2988
final double X10_TEMP245 =
          (X10_TEMP3 *
             X10_TEMP11);
        
//#line 2990
final double X10_TEMP13 =
          (X10_TEMP245);
        
//#line 2991
final double X10_TEMP248 =
          (X10_TEMP12 +
             X10_TEMP13);
        
//#line 2993
double X10_TEMP22 =
          (X10_TEMP248);
        
//#line 2994
final double X10_TEMP251 =
          (X10_TEMP2.
             z);
        
//#line 2996
final double X10_TEMP15 =
          (X10_TEMP251);
        
//#line 2997
final double X10_TEMP254 =
          (X10_TEMP1 *
             X10_TEMP15);
        
//#line 2999
final double X10_TEMP17 =
          (X10_TEMP254);
        
//#line 3000
final double X10_TEMP257 =
          (X10_TEMP4.
             z);
        
//#line 3002
final double X10_TEMP16 =
          (X10_TEMP257);
        
//#line 3003
final double X10_TEMP260 =
          (X10_TEMP3 *
             X10_TEMP16);
        
//#line 3005
final double X10_TEMP18 =
          (X10_TEMP260);
        
//#line 3006
final double X10_TEMP263 =
          (X10_TEMP17 +
             X10_TEMP18);
        
//#line 3008
double X10_TEMP23 =
          (X10_TEMP263);
        
//#line 3009
final boolean X10_TEMP266 =
          (false);
        
//#line 3011
boolean X10_TEMP24 =
          (X10_TEMP266);
        
//#line 3012
final Vec X10_TEMP273 =
          (new Vec(
             X10_TEMP21,
             X10_TEMP22,
             X10_TEMP23,
             X10_TEMP24));
        
//#line 3014
final Vec X10_TEMP26 =
          (X10_TEMP273);
        
//#line 3015
return X10_TEMP26;
    }
    
    
//#line 3017
public static Vec
                    Program_Vec_scale(
                    final Vec X10_TEMP0,
                    final double t) {
        
//#line 3018
double X10_TEMP1 =
          (t);
        
//#line 3019
final double X10_TEMP218 =
          (X10_TEMP0.
             x);
        
//#line 3021
final double X10_TEMP2 =
          (X10_TEMP218);
        
//#line 3022
final double X10_TEMP221 =
          (X10_TEMP2 *
             X10_TEMP1);
        
//#line 3024
double X10_TEMP9 =
          (X10_TEMP221);
        
//#line 3025
final double X10_TEMP224 =
          (X10_TEMP0.
             y);
        
//#line 3027
final double X10_TEMP4 =
          (X10_TEMP224);
        
//#line 3028
final double X10_TEMP227 =
          (X10_TEMP4 *
             X10_TEMP1);
        
//#line 3030
double X10_TEMP10 =
          (X10_TEMP227);
        
//#line 3031
final double X10_TEMP230 =
          (X10_TEMP0.
             z);
        
//#line 3033
final double X10_TEMP6 =
          (X10_TEMP230);
        
//#line 3034
final double X10_TEMP233 =
          (X10_TEMP6 *
             X10_TEMP1);
        
//#line 3036
double X10_TEMP11 =
          (X10_TEMP233);
        
//#line 3037
final boolean X10_TEMP236 =
          (false);
        
//#line 3039
boolean X10_TEMP12 =
          (X10_TEMP236);
        
//#line 3040
final Vec X10_TEMP243 =
          (new Vec(
             X10_TEMP9,
             X10_TEMP10,
             X10_TEMP11,
             X10_TEMP12));
        
//#line 3042
final Vec X10_TEMP14 =
          (X10_TEMP243);
        
//#line 3043
return X10_TEMP14;
    }
    
    
//#line 3045
public static Vec
                    Program_Vec_negate(
                    final Vec X10_TEMP0) {
        
//#line 3046
final double X10_TEMP217 =
          (X10_TEMP0.
             x);
        
//#line 3048
final double X10_TEMP1 =
          (X10_TEMP217);
        
//#line 3049
final int X10_TEMP2 =
          (0);
        
//#line 3050
final double X10_TEMP221 =
          (X10_TEMP2 -
             X10_TEMP1);
        
//#line 3052
double X10_TEMP11 =
          (X10_TEMP221);
        
//#line 3053
final double X10_TEMP224 =
          (X10_TEMP0.
             y);
        
//#line 3055
final double X10_TEMP4 =
          (X10_TEMP224);
        
//#line 3056
final int X10_TEMP5 =
          (0);
        
//#line 3057
final double X10_TEMP228 =
          (X10_TEMP5 -
             X10_TEMP4);
        
//#line 3059
double X10_TEMP12 =
          (X10_TEMP228);
        
//#line 3060
final double X10_TEMP231 =
          (X10_TEMP0.
             z);
        
//#line 3062
final double X10_TEMP7 =
          (X10_TEMP231);
        
//#line 3063
final int X10_TEMP8 =
          (0);
        
//#line 3064
final double X10_TEMP235 =
          (X10_TEMP8 -
             X10_TEMP7);
        
//#line 3066
double X10_TEMP13 =
          (X10_TEMP235);
        
//#line 3067
final boolean X10_TEMP238 =
          (false);
        
//#line 3069
boolean X10_TEMP14 =
          (X10_TEMP238);
        
//#line 3070
final Vec X10_TEMP245 =
          (new Vec(
             X10_TEMP11,
             X10_TEMP12,
             X10_TEMP13,
             X10_TEMP14));
        
//#line 3072
final Vec X10_TEMP16 =
          (X10_TEMP245);
        
//#line 3073
return X10_TEMP16;
    }
    
    
//#line 3075
public static Vec
                    Program_Vec_normalized(
                    final Vec X10_TEMP0) {
        
//#line 3076
final double X10_TEMP217 =
          (X10_TEMP0.
             x);
        
//#line 3078
final double X10_TEMP1 =
          (X10_TEMP217);
        
//#line 3079
final double X10_TEMP220 =
          (X10_TEMP0.
             x);
        
//#line 3081
final double X10_TEMP2 =
          (X10_TEMP220);
        
//#line 3082
final double X10_TEMP223 =
          (X10_TEMP1 *
             X10_TEMP2);
        
//#line 3084
final double X10_TEMP5 =
          (X10_TEMP223);
        
//#line 3085
final double X10_TEMP226 =
          (X10_TEMP0.
             y);
        
//#line 3087
final double X10_TEMP3 =
          (X10_TEMP226);
        
//#line 3088
final double X10_TEMP229 =
          (X10_TEMP0.
             y);
        
//#line 3090
final double X10_TEMP4 =
          (X10_TEMP229);
        
//#line 3091
final double X10_TEMP232 =
          (X10_TEMP3 *
             X10_TEMP4);
        
//#line 3093
final double X10_TEMP6 =
          (X10_TEMP232);
        
//#line 3094
final double X10_TEMP235 =
          (X10_TEMP5 +
             X10_TEMP6);
        
//#line 3096
final double X10_TEMP9 =
          (X10_TEMP235);
        
//#line 3097
final double X10_TEMP238 =
          (X10_TEMP0.
             z);
        
//#line 3099
final double X10_TEMP7 =
          (X10_TEMP238);
        
//#line 3100
final double X10_TEMP241 =
          (X10_TEMP0.
             z);
        
//#line 3102
final double X10_TEMP8 =
          (X10_TEMP241);
        
//#line 3103
final double X10_TEMP244 =
          (X10_TEMP7 *
             X10_TEMP8);
        
//#line 3105
final double X10_TEMP10 =
          (X10_TEMP244);
        
//#line 3106
final double X10_TEMP247 =
          (X10_TEMP9 +
             X10_TEMP10);
        
//#line 3108
final double X10_TEMP12 =
          (X10_TEMP247);
        
//#line 3109
final double X10_TEMP251 =
          (java.
             lang.
             Math.
             sqrt(
             X10_TEMP12));
        
//#line 3111
double len =
          (X10_TEMP251);
        
//#line 3112
final double X10_TEMP254 =
          (0.0);
        
//#line 3114
final double X10_TEMP14 =
          (X10_TEMP254);
        
//#line 3115
final boolean X10_TEMP257 =
          (len >
             X10_TEMP14);
        
//#line 3117
final boolean X10_TEMP16 =
          (X10_TEMP257);
        
//#line 3118
final boolean X10_TEMP17 =
          (X10_TEMP16);
        
//#line 3119
final double X10_TEMP261 =
          (X10_TEMP0.
             x);
        
//#line 3121
final double X10_TEMP18 =
          (X10_TEMP261);
        
//#line 3122
final double X10_TEMP264 =
          (X10_TEMP18 /
             len);
        
//#line 3124
double X10_TEMP25 =
          (X10_TEMP264);
        
//#line 3125
final double X10_TEMP267 =
          (X10_TEMP0.
             y);
        
//#line 3127
final double X10_TEMP20 =
          (X10_TEMP267);
        
//#line 3128
final double X10_TEMP270 =
          (X10_TEMP20 /
             len);
        
//#line 3130
double X10_TEMP26 =
          (X10_TEMP270);
        
//#line 3131
final double X10_TEMP273 =
          (X10_TEMP0.
             z);
        
//#line 3133
final double X10_TEMP22 =
          (X10_TEMP273);
        
//#line 3134
final double X10_TEMP276 =
          (X10_TEMP22 /
             len);
        
//#line 3136
double X10_TEMP27 =
          (X10_TEMP276);
        
//#line 3137
final boolean X10_TEMP279 =
          (false);
        
//#line 3139
boolean X10_TEMP28 =
          (X10_TEMP279);
        
//#line 3140
Vec X10_TEMP31 =
          (X10_TEMP0);
        
//#line 3141
if (X10_TEMP17) {
            
//#line 3142
final Vec X10_TEMP288 =
              (new Vec(
                 X10_TEMP25,
                 X10_TEMP26,
                 X10_TEMP27,
                 X10_TEMP28));
            
//#line 3143
X10_TEMP31 =
              ((X10_TEMP288));
        }
        
//#line 3145
final Vec X10_TEMP32 =
          (X10_TEMP31);
        
//#line 3146
return X10_TEMP32;
    }
    
    
//#line 3148
public static double
                    Program_Vec_length(
                    final Vec X10_TEMP0) {
        
//#line 3149
final double X10_TEMP217 =
          (X10_TEMP0.
             x);
        
//#line 3151
final double X10_TEMP1 =
          (X10_TEMP217);
        
//#line 3152
final double X10_TEMP220 =
          (X10_TEMP0.
             x);
        
//#line 3154
final double X10_TEMP2 =
          (X10_TEMP220);
        
//#line 3155
final double X10_TEMP223 =
          (X10_TEMP1 *
             X10_TEMP2);
        
//#line 3157
final double X10_TEMP5 =
          (X10_TEMP223);
        
//#line 3158
final double X10_TEMP226 =
          (X10_TEMP0.
             y);
        
//#line 3160
final double X10_TEMP3 =
          (X10_TEMP226);
        
//#line 3161
final double X10_TEMP229 =
          (X10_TEMP0.
             y);
        
//#line 3163
final double X10_TEMP4 =
          (X10_TEMP229);
        
//#line 3164
final double X10_TEMP232 =
          (X10_TEMP3 *
             X10_TEMP4);
        
//#line 3166
final double X10_TEMP6 =
          (X10_TEMP232);
        
//#line 3167
final double X10_TEMP235 =
          (X10_TEMP5 +
             X10_TEMP6);
        
//#line 3169
final double X10_TEMP9 =
          (X10_TEMP235);
        
//#line 3170
final double X10_TEMP238 =
          (X10_TEMP0.
             z);
        
//#line 3172
final double X10_TEMP7 =
          (X10_TEMP238);
        
//#line 3173
final double X10_TEMP241 =
          (X10_TEMP0.
             z);
        
//#line 3175
final double X10_TEMP8 =
          (X10_TEMP241);
        
//#line 3176
final double X10_TEMP244 =
          (X10_TEMP7 *
             X10_TEMP8);
        
//#line 3178
final double X10_TEMP10 =
          (X10_TEMP244);
        
//#line 3179
final double X10_TEMP247 =
          (X10_TEMP9 +
             X10_TEMP10);
        
//#line 3181
final double X10_TEMP12 =
          (X10_TEMP247);
        
//#line 3182
final double X10_TEMP251 =
          (java.
             lang.
             Math.
             sqrt(
             X10_TEMP12));
        
//#line 3184
final double X10_TEMP14 =
          (X10_TEMP251);
        
//#line 3185
return X10_TEMP14;
    }
    
    
//#line 3187
public static java.
                    lang.
                    String
                    Program_Vec_toString(
                    final Vec X10_TEMP0) {
        
//#line 3188
final java.
          lang.
          String X10_TEMP217 =
          ("<");
        
//#line 3190
final java.
          lang.
          String X10_TEMP1 =
          (X10_TEMP217);
        
//#line 3191
final double X10_TEMP220 =
          (X10_TEMP0.
             x);
        
//#line 3193
final double X10_TEMP2 =
          (X10_TEMP220);
        
//#line 3194
final java.
          lang.
          String X10_TEMP223 =
          (X10_TEMP1 +
           X10_TEMP2);
        
//#line 3196
final java.
          lang.
          String X10_TEMP3 =
          (X10_TEMP223);
        
//#line 3197
final java.
          lang.
          String X10_TEMP226 =
          (",");
        
//#line 3199
final java.
          lang.
          String X10_TEMP4 =
          (X10_TEMP226);
        
//#line 3200
final java.
          lang.
          String X10_TEMP229 =
          (X10_TEMP3 +
           X10_TEMP4);
        
//#line 3202
final java.
          lang.
          String X10_TEMP5 =
          (X10_TEMP229);
        
//#line 3203
final double X10_TEMP232 =
          (X10_TEMP0.
             y);
        
//#line 3205
final double X10_TEMP6 =
          (X10_TEMP232);
        
//#line 3206
final java.
          lang.
          String X10_TEMP235 =
          (X10_TEMP5 +
           X10_TEMP6);
        
//#line 3208
final java.
          lang.
          String X10_TEMP7 =
          (X10_TEMP235);
        
//#line 3209
final java.
          lang.
          String X10_TEMP238 =
          (",");
        
//#line 3211
final java.
          lang.
          String X10_TEMP8 =
          (X10_TEMP238);
        
//#line 3212
final java.
          lang.
          String X10_TEMP241 =
          (X10_TEMP7 +
           X10_TEMP8);
        
//#line 3214
final java.
          lang.
          String X10_TEMP9 =
          (X10_TEMP241);
        
//#line 3215
final double X10_TEMP244 =
          (X10_TEMP0.
             z);
        
//#line 3217
final double X10_TEMP10 =
          (X10_TEMP244);
        
//#line 3218
final java.
          lang.
          String X10_TEMP247 =
          (X10_TEMP9 +
           X10_TEMP10);
        
//#line 3220
final java.
          lang.
          String X10_TEMP11 =
          (X10_TEMP247);
        
//#line 3221
final java.
          lang.
          String X10_TEMP250 =
          (">");
        
//#line 3223
final java.
          lang.
          String X10_TEMP12 =
          (X10_TEMP250);
        
//#line 3224
final java.
          lang.
          String X10_TEMP253 =
          (X10_TEMP11 +
           X10_TEMP12);
        
//#line 3226
final java.
          lang.
          String X10_TEMP14 =
          (X10_TEMP253);
        
//#line 3227
return X10_TEMP14;
    }
    
    
//#line 3229
public static java.
                    lang.
                    String
                    Program_View_toString(
                    final View X10_TEMP0) {
        
//#line 3230
final java.
          lang.
          String X10_TEMP217 =
          ("View { from = ");
        
//#line 3232
final java.
          lang.
          String X10_TEMP1 =
          (X10_TEMP217);
        
//#line 3233
final Vec X10_TEMP220 =
          (X10_TEMP0.
             from);
        
//#line 3235
final Vec X10_TEMP2 =
          (X10_TEMP220);
        
//#line 3236
final java.
          lang.
          String X10_TEMP224 =
          (Program0.
             Program_Vec_toString(
             X10_TEMP2));
        
//#line 3238
final java.
          lang.
          String X10_TEMP3 =
          (X10_TEMP224);
        
//#line 3239
final java.
          lang.
          String X10_TEMP227 =
          (X10_TEMP1 +
           X10_TEMP3);
        
//#line 3241
final java.
          lang.
          String X10_TEMP4 =
          (X10_TEMP227);
        
//#line 3242
final java.
          lang.
          String X10_TEMP230 =
          (" at = ");
        
//#line 3244
final java.
          lang.
          String X10_TEMP5 =
          (X10_TEMP230);
        
//#line 3245
final java.
          lang.
          String X10_TEMP233 =
          (X10_TEMP4 +
           X10_TEMP5);
        
//#line 3247
final java.
          lang.
          String X10_TEMP6 =
          (X10_TEMP233);
        
//#line 3248
final Vec X10_TEMP236 =
          (X10_TEMP0.
             at);
        
//#line 3250
final Vec X10_TEMP7 =
          (X10_TEMP236);
        
//#line 3251
final java.
          lang.
          String X10_TEMP240 =
          (Program0.
             Program_Vec_toString(
             X10_TEMP7));
        
//#line 3253
final java.
          lang.
          String X10_TEMP8 =
          (X10_TEMP240);
        
//#line 3254
final java.
          lang.
          String X10_TEMP243 =
          (X10_TEMP6 +
           X10_TEMP8);
        
//#line 3256
final java.
          lang.
          String X10_TEMP9 =
          (X10_TEMP243);
        
//#line 3257
final java.
          lang.
          String X10_TEMP246 =
          (" up = ");
        
//#line 3259
final java.
          lang.
          String X10_TEMP10 =
          (X10_TEMP246);
        
//#line 3260
final java.
          lang.
          String X10_TEMP249 =
          (X10_TEMP9 +
           X10_TEMP10);
        
//#line 3262
final java.
          lang.
          String X10_TEMP11 =
          (X10_TEMP249);
        
//#line 3263
final Vec X10_TEMP252 =
          (X10_TEMP0.
             up);
        
//#line 3265
final Vec X10_TEMP12 =
          (X10_TEMP252);
        
//#line 3266
final java.
          lang.
          String X10_TEMP256 =
          (Program0.
             Program_Vec_toString(
             X10_TEMP12));
        
//#line 3268
final java.
          lang.
          String X10_TEMP13 =
          (X10_TEMP256);
        
//#line 3269
final java.
          lang.
          String X10_TEMP259 =
          (X10_TEMP11 +
           X10_TEMP13);
        
//#line 3271
final java.
          lang.
          String X10_TEMP14 =
          (X10_TEMP259);
        
//#line 3272
final java.
          lang.
          String X10_TEMP262 =
          (" distance = ");
        
//#line 3274
final java.
          lang.
          String X10_TEMP15 =
          (X10_TEMP262);
        
//#line 3275
final java.
          lang.
          String X10_TEMP265 =
          (X10_TEMP14 +
           X10_TEMP15);
        
//#line 3277
final java.
          lang.
          String X10_TEMP16 =
          (X10_TEMP265);
        
//#line 3278
final double X10_TEMP268 =
          (X10_TEMP0.
             distance);
        
//#line 3280
final double X10_TEMP17 =
          (X10_TEMP268);
        
//#line 3281
final java.
          lang.
          String X10_TEMP271 =
          (X10_TEMP16 +
           X10_TEMP17);
        
//#line 3283
final java.
          lang.
          String X10_TEMP18 =
          (X10_TEMP271);
        
//#line 3284
final java.
          lang.
          String X10_TEMP274 =
          (" angle = ");
        
//#line 3286
final java.
          lang.
          String X10_TEMP19 =
          (X10_TEMP274);
        
//#line 3287
final java.
          lang.
          String X10_TEMP277 =
          (X10_TEMP18 +
           X10_TEMP19);
        
//#line 3289
final java.
          lang.
          String X10_TEMP20 =
          (X10_TEMP277);
        
//#line 3290
final double X10_TEMP280 =
          (X10_TEMP0.
             angle);
        
//#line 3292
final double X10_TEMP21 =
          (X10_TEMP280);
        
//#line 3293
final java.
          lang.
          String X10_TEMP283 =
          (X10_TEMP20 +
           X10_TEMP21);
        
//#line 3295
final java.
          lang.
          String X10_TEMP22 =
          (X10_TEMP283);
        
//#line 3296
final java.
          lang.
          String X10_TEMP286 =
          (" aspect = ");
        
//#line 3298
final java.
          lang.
          String X10_TEMP23 =
          (X10_TEMP286);
        
//#line 3299
final java.
          lang.
          String X10_TEMP289 =
          (X10_TEMP22 +
           X10_TEMP23);
        
//#line 3301
final java.
          lang.
          String X10_TEMP24 =
          (X10_TEMP289);
        
//#line 3302
final double X10_TEMP292 =
          (X10_TEMP0.
             aspect);
        
//#line 3304
final double X10_TEMP25 =
          (X10_TEMP292);
        
//#line 3305
final java.
          lang.
          String X10_TEMP295 =
          (X10_TEMP24 +
           X10_TEMP25);
        
//#line 3307
final java.
          lang.
          String X10_TEMP26 =
          (X10_TEMP295);
        
//#line 3308
final java.
          lang.
          String X10_TEMP298 =
          ("}");
        
//#line 3310
final java.
          lang.
          String X10_TEMP27 =
          (X10_TEMP298);
        
//#line 3311
final java.
          lang.
          String X10_TEMP301 =
          (X10_TEMP26 +
           X10_TEMP27);
        
//#line 3313
final java.
          lang.
          String X10_TEMP29 =
          (X10_TEMP301);
        
//#line 3314
return X10_TEMP29;
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
    
    
//#line 3319
public Program() {
        
//#line 3319
super();
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
    
//#line 3323
final public int
      i;
    
//#line 3324
final public x10.
      lang.
      GenericReferenceArray
      a;
    
    
//#line 3327
public Envelope2(final int i1,
                                   final x10.
                                     lang.
                                     GenericReferenceArray a1) {
        
//#line 3327
super();
        
//#line 3328
final int X10_TEMP217 =
          (i1);
        
//#line 3330
int X10_TEMP1 =
          (X10_TEMP217);
        
//#line 3331
final x10.
          lang.
          GenericReferenceArray X10_TEMP220 =
          (x10.
            lang.
            GenericReferenceArray)
            ((a1));
        
//#line 3333
x10.
          lang.
          GenericReferenceArray X10_TEMP2 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP220));
        
//#line 3334
final int X10_TEMP223 =
          (X10_TEMP1);
        
//#line 3336
i =
          ((X10_TEMP223));
        
//#line 3337
final x10.
          lang.
          GenericReferenceArray X10_TEMP226 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP2));
        
//#line 3339
a =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP226));
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
    
//#line 3346
final public int
      i;
    
//#line 3347
final public x10.
      lang.
      GenericReferenceArray
      a;
    
    
//#line 3350
public Envelope(final int i1,
                                  final x10.
                                    lang.
                                    GenericReferenceArray a1) {
        
//#line 3350
super();
        
//#line 3351
final int X10_TEMP217 =
          (i1);
        
//#line 3353
int X10_TEMP1 =
          (X10_TEMP217);
        
//#line 3354
final x10.
          lang.
          GenericReferenceArray X10_TEMP220 =
          (x10.
            lang.
            GenericReferenceArray)
            ((a1));
        
//#line 3356
x10.
          lang.
          GenericReferenceArray X10_TEMP2 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP220));
        
//#line 3357
final int X10_TEMP223 =
          (X10_TEMP1);
        
//#line 3359
i =
          ((X10_TEMP223));
        
//#line 3360
final x10.
          lang.
          GenericReferenceArray X10_TEMP226 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP2));
        
//#line 3362
a =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP226));
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
    
//#line 3369
final public int
      number;
    
//#line 3370
final public int
      width;
    
//#line 3371
final public int
      height;
    
//#line 3372
final public int
      yfrom;
    
//#line 3373
final public int
      yto;
    
//#line 3374
final public int
      total;
    
    
//#line 3377
public Interval(final int number_,
                                  final int width_,
                                  final int height_,
                                  final int yfrom_,
                                  final int yto_,
                                  final int total_) {
        
//#line 3377
super();
        
//#line 3378
final int X10_TEMP217 =
          (number_);
        
//#line 3380
int X10_TEMP1 =
          (X10_TEMP217);
        
//#line 3381
final int X10_TEMP220 =
          (width_);
        
//#line 3383
int X10_TEMP2 =
          (X10_TEMP220);
        
//#line 3384
final int X10_TEMP223 =
          (height_);
        
//#line 3386
int X10_TEMP3 =
          (X10_TEMP223);
        
//#line 3387
final int X10_TEMP226 =
          (yfrom_);
        
//#line 3389
int X10_TEMP4 =
          (X10_TEMP226);
        
//#line 3390
final int X10_TEMP229 =
          (yto_);
        
//#line 3392
int X10_TEMP5 =
          (X10_TEMP229);
        
//#line 3393
final int X10_TEMP232 =
          (total_);
        
//#line 3395
int X10_TEMP6 =
          (X10_TEMP232);
        
//#line 3396
final int X10_TEMP235 =
          (X10_TEMP1);
        
//#line 3398
number =
          ((X10_TEMP235));
        
//#line 3399
final int X10_TEMP238 =
          (X10_TEMP2);
        
//#line 3401
width =
          ((X10_TEMP238));
        
//#line 3402
final int X10_TEMP241 =
          (X10_TEMP3);
        
//#line 3404
height =
          ((X10_TEMP241));
        
//#line 3405
final int X10_TEMP244 =
          (X10_TEMP4);
        
//#line 3407
yfrom =
          ((X10_TEMP244));
        
//#line 3408
final int X10_TEMP247 =
          (X10_TEMP5);
        
//#line 3410
yto =
          ((X10_TEMP247));
        
//#line 3411
final int X10_TEMP250 =
          (X10_TEMP6);
        
//#line 3413
total =
          ((X10_TEMP250));
    }
}

class Isect
extends x10.
  lang.
  Object
{
    
//#line 3420
public double
      t;
    
//#line 3421
public int
      enter;
    
//#line 3422
public Sphere
      prim;
    
//#line 3423
public Surface
      surf;
    
//#line 3424
public boolean
      isNull;
    
    
//#line 3427
public Isect() {
        
//#line 3427
super();
        
//#line 3428
final double X10_TEMP217 =
          (0.0);
        
//#line 3430
final double X10_TEMP2 =
          (X10_TEMP217);
        
//#line 3431
final double X10_TEMP220 =
          (X10_TEMP2);
        
//#line 3433
t =
          ((X10_TEMP220));
        
//#line 3434
final int X10_TEMP223 =
          (0);
        
//#line 3436
final int X10_TEMP4 =
          (X10_TEMP223);
        
//#line 3437
final int X10_TEMP226 =
          (X10_TEMP4);
        
//#line 3439
enter =
          ((X10_TEMP226));
        
//#line 3440
final boolean X10_TEMP229 =
          (false);
        
//#line 3442
final boolean X10_TEMP6 =
          (X10_TEMP229);
        
//#line 3443
final boolean X10_TEMP232 =
          (X10_TEMP6);
        
//#line 3445
isNull =
          ((X10_TEMP232));
    }
    
    
//#line 3447
public Isect(final double t_,
                               final int enter_,
                               final boolean isNull_,
                               final Sphere prim_,
                               final Surface surf_) {
        
//#line 3447
super();
        
//#line 3448
final double X10_TEMP217 =
          (t_);
        
//#line 3450
double X10_TEMP1 =
          (X10_TEMP217);
        
//#line 3451
final int X10_TEMP220 =
          (enter_);
        
//#line 3453
int X10_TEMP2 =
          (X10_TEMP220);
        
//#line 3454
final boolean X10_TEMP223 =
          (isNull_);
        
//#line 3456
boolean X10_TEMP3 =
          (X10_TEMP223);
        
//#line 3457
final Sphere X10_TEMP226 =
          (prim_);
        
//#line 3459
Sphere X10_TEMP4 =
          (X10_TEMP226);
        
//#line 3460
final Surface X10_TEMP229 =
          (surf_);
        
//#line 3462
Surface X10_TEMP5 =
          (X10_TEMP229);
        
//#line 3463
final double X10_TEMP232 =
          (X10_TEMP1);
        
//#line 3465
t =
          ((X10_TEMP232));
        
//#line 3466
final boolean X10_TEMP235 =
          (X10_TEMP3);
        
//#line 3468
isNull =
          ((X10_TEMP235));
        
//#line 3469
final int X10_TEMP238 =
          (X10_TEMP2);
        
//#line 3471
enter =
          ((X10_TEMP238));
        
//#line 3472
final Sphere X10_TEMP241 =
          (X10_TEMP4);
        
//#line 3474
prim =
          ((X10_TEMP241));
        
//#line 3475
final Surface X10_TEMP244 =
          (X10_TEMP5);
        
//#line 3477
surf =
          ((X10_TEMP244));
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
    
//#line 3484
final public Vec
      pos;
    
//#line 3485
final public double
      brightness;
    
    
//#line 3488
public Light(final double x,
                               final double y,
                               final double z,
                               final double b) {
        
//#line 3488
super();
        
//#line 3489
final double X10_TEMP217 =
          (x);
        
//#line 3491
double X10_TEMP1 =
          (X10_TEMP217);
        
//#line 3492
final double X10_TEMP220 =
          (y);
        
//#line 3494
double X10_TEMP2 =
          (X10_TEMP220);
        
//#line 3495
final double X10_TEMP223 =
          (z);
        
//#line 3497
double X10_TEMP3 =
          (X10_TEMP223);
        
//#line 3498
final double X10_TEMP226 =
          (b);
        
//#line 3500
double X10_TEMP4 =
          (X10_TEMP226);
        
//#line 3501
final boolean X10_TEMP229 =
          (false);
        
//#line 3503
boolean X10_TEMP9 =
          (X10_TEMP229);
        
//#line 3504
final Vec X10_TEMP236 =
          (new Vec(
             X10_TEMP1,
             X10_TEMP2,
             X10_TEMP3,
             X10_TEMP9));
        
//#line 3506
final Vec X10_TEMP11 =
          (X10_TEMP236);
        
//#line 3507
final Vec X10_TEMP239 =
          (X10_TEMP11);
        
//#line 3509
pos =
          ((X10_TEMP239));
        
//#line 3510
final double X10_TEMP242 =
          (X10_TEMP4);
        
//#line 3512
brightness =
          ((X10_TEMP242));
    }
}

class RayTracer
extends x10.
  lang.
  Object
{
    
//#line 3519
public Scene
      scene;
    
//#line 3520
public int
      lightCount;
    
//#line 3521
public int
      objCount;
    
//#line 3522
public x10.
      lang.
      GenericReferenceArray
      lights;
    
//#line 3523
public x10.
      lang.
      GenericReferenceArray
      prim;
    
//#line 3524
public View
      view;
    
//#line 3525
public int
      height;
    
//#line 3526
public int
      width;
    
//#line 3527
public x10.
      lang.
      IntReferenceArray
      datasizes;
    
//#line 3528
public long
      checksum;
    
//#line 3529
public x10.
      lang.
      LongReferenceArray
      checkSumArray;
    
//#line 3530
public int
      size_t;
    
//#line 3531
public int
      numobjects;
    
    
//#line 3534
public RayTracer() {
        
//#line 3534
super();
    }
}

class Ray
extends x10.
  lang.
  Object
{
    
//#line 3541
public Vec
      p;
    
//#line 3542
public Vec
      d;
    
    
//#line 3545
public Ray(final Vec pnt,
                             final Vec dir) {
        
//#line 3545
super();
        
//#line 3546
final Vec X10_TEMP217 =
          (pnt);
        
//#line 3548
Vec X10_TEMP1 =
          (X10_TEMP217);
        
//#line 3549
final Vec X10_TEMP220 =
          (dir);
        
//#line 3551
Vec X10_TEMP2 =
          (X10_TEMP220);
        
//#line 3552
final double X10_TEMP223 =
          (X10_TEMP1.
             x);
        
//#line 3554
double X10_TEMP7 =
          (X10_TEMP223);
        
//#line 3555
final double X10_TEMP226 =
          (X10_TEMP1.
             y);
        
//#line 3557
double X10_TEMP8 =
          (X10_TEMP226);
        
//#line 3558
final double X10_TEMP229 =
          (X10_TEMP1.
             z);
        
//#line 3560
double X10_TEMP9 =
          (X10_TEMP229);
        
//#line 3561
final boolean X10_TEMP232 =
          (false);
        
//#line 3563
boolean X10_TEMP10 =
          (X10_TEMP232);
        
//#line 3564
final Vec X10_TEMP239 =
          (new Vec(
             X10_TEMP7,
             X10_TEMP8,
             X10_TEMP9,
             X10_TEMP10));
        
//#line 3566
final Vec X10_TEMP12 =
          (X10_TEMP239);
        
//#line 3567
final Vec X10_TEMP242 =
          (X10_TEMP12);
        
//#line 3569
p =
          ((X10_TEMP242));
        
//#line 3570
final double X10_TEMP245 =
          (X10_TEMP2.
             x);
        
//#line 3572
double X10_TEMP17 =
          (X10_TEMP245);
        
//#line 3573
final double X10_TEMP248 =
          (X10_TEMP2.
             y);
        
//#line 3575
double X10_TEMP18 =
          (X10_TEMP248);
        
//#line 3576
final double X10_TEMP251 =
          (X10_TEMP2.
             z);
        
//#line 3578
double X10_TEMP19 =
          (X10_TEMP251);
        
//#line 3579
final boolean X10_TEMP254 =
          (false);
        
//#line 3581
boolean X10_TEMP20 =
          (X10_TEMP254);
        
//#line 3582
final Vec X10_TEMP261 =
          (new Vec(
             X10_TEMP17,
             X10_TEMP18,
             X10_TEMP19,
             X10_TEMP20));
        
//#line 3584
final Vec X10_TEMP21 =
          (X10_TEMP261);
        
//#line 3585
final Vec X10_TEMP265 =
          (Program0.
             Program_Vec_normalized(
             X10_TEMP21));
        
//#line 3587
final Vec X10_TEMP23 =
          (X10_TEMP265);
        
//#line 3588
final Vec X10_TEMP268 =
          (X10_TEMP23);
        
//#line 3590
d =
          ((X10_TEMP268));
    }
    
    
//#line 3592
public Ray(final Vec pnt,
                             final Vec dir,
                             final boolean normalize) {
        
//#line 3592
super();
        
//#line 3593
final Vec X10_TEMP217 =
          (pnt);
        
//#line 3595
Vec X10_TEMP1 =
          (X10_TEMP217);
        
//#line 3596
final Vec X10_TEMP220 =
          (dir);
        
//#line 3598
Vec X10_TEMP2 =
          (X10_TEMP220);
        
//#line 3599
final boolean X10_TEMP223 =
          (normalize);
        
//#line 3601
boolean X10_TEMP3 =
          (X10_TEMP223);
        
//#line 3602
if (X10_TEMP3) {
            
//#line 3603
final double X10_TEMP227 =
              (X10_TEMP1.
                 x);
            
//#line 3605
double X10_TEMP9 =
              (X10_TEMP227);
            
//#line 3606
final double X10_TEMP230 =
              (X10_TEMP1.
                 y);
            
//#line 3608
double X10_TEMP10 =
              (X10_TEMP230);
            
//#line 3609
final double X10_TEMP233 =
              (X10_TEMP1.
                 z);
            
//#line 3611
double X10_TEMP11 =
              (X10_TEMP233);
            
//#line 3612
final boolean X10_TEMP236 =
              (false);
            
//#line 3614
boolean X10_TEMP12 =
              (X10_TEMP236);
            
//#line 3615
final Vec X10_TEMP243 =
              (new Vec(
                 X10_TEMP9,
                 X10_TEMP10,
                 X10_TEMP11,
                 X10_TEMP12));
            
//#line 3617
final Vec X10_TEMP14 =
              (X10_TEMP243);
            
//#line 3618
final Vec X10_TEMP246 =
              (X10_TEMP14);
            
//#line 3620
p =
              ((X10_TEMP246));
            
//#line 3621
final double X10_TEMP249 =
              (X10_TEMP2.
                 x);
            
//#line 3623
double X10_TEMP19 =
              (X10_TEMP249);
            
//#line 3624
final double X10_TEMP252 =
              (X10_TEMP2.
                 y);
            
//#line 3626
double X10_TEMP20 =
              (X10_TEMP252);
            
//#line 3627
final double X10_TEMP255 =
              (X10_TEMP2.
                 z);
            
//#line 3629
double X10_TEMP21 =
              (X10_TEMP255);
            
//#line 3630
final boolean X10_TEMP258 =
              (false);
            
//#line 3632
boolean X10_TEMP22 =
              (X10_TEMP258);
            
//#line 3633
final Vec X10_TEMP265 =
              (new Vec(
                 X10_TEMP19,
                 X10_TEMP20,
                 X10_TEMP21,
                 X10_TEMP22));
            
//#line 3635
final Vec X10_TEMP23 =
              (X10_TEMP265);
            
//#line 3636
final Vec X10_TEMP269 =
              (Program0.
                 Program_Vec_normalized(
                 X10_TEMP23));
            
//#line 3638
final Vec X10_TEMP25 =
              (X10_TEMP269);
            
//#line 3639
final Vec X10_TEMP272 =
              (X10_TEMP25);
            
//#line 3641
d =
              ((X10_TEMP272));
        } else {
            
//#line 3644
final Vec X10_TEMP275 =
              (X10_TEMP1);
            
//#line 3646
p =
              ((X10_TEMP275));
            
//#line 3647
final Vec X10_TEMP278 =
              (X10_TEMP2);
            
//#line 3649
d =
              ((X10_TEMP278));
        }
    }
    
    
//#line 3652
public Ray() {
        
//#line 3652
super();
        
//#line 3653
final Vec X10_TEMP217 =
          (new Vec(
             ));
        
//#line 3655
final Vec X10_TEMP2 =
          (X10_TEMP217);
        
//#line 3656
final Vec X10_TEMP220 =
          (X10_TEMP2);
        
//#line 3658
p =
          ((X10_TEMP220));
        
//#line 3659
final Vec X10_TEMP223 =
          (new Vec(
             ));
        
//#line 3661
final Vec X10_TEMP4 =
          (X10_TEMP223);
        
//#line 3662
final Vec X10_TEMP226 =
          (X10_TEMP4);
        
//#line 3664
d =
          ((X10_TEMP226));
    }
}

class Scene
extends x10.
  lang.
  Object
{
    
//#line 3671
final public x10.
      lang.
      GenericReferenceArray
      lights;
    
//#line 3672
final public x10.
      lang.
      GenericReferenceArray
      objects;
    
//#line 3673
final public View
      view;
    
//#line 3676
public int
      lightCount;
    
//#line 3677
public int
      objectCount;
    
    
//#line 3680
public Scene(final View v) {
        
//#line 3680
super();
        
//#line 3681
final View X10_TEMP217 =
          (v);
        
//#line 3683
View X10_TEMP1 =
          (X10_TEMP217);
        
//#line 3684
final int X10_TEMP220 =
          (0);
        
//#line 3686
final int X10_TEMP6 =
          (X10_TEMP220);
        
//#line 3687
final int X10_TEMP223 =
          (Program0.
             _Program__Scene_maxLights);
        
//#line 3689
final int X10_TEMP3 =
          (X10_TEMP223);
        
//#line 3690
final int X10_TEMP226 =
          (1);
        
//#line 3692
final int X10_TEMP4 =
          (X10_TEMP226);
        
//#line 3693
final int X10_TEMP229 =
          (X10_TEMP3 -
             X10_TEMP4);
        
//#line 3695
final int X10_TEMP7 =
          (X10_TEMP229);
        
//#line 3696
final x10.
          lang.
          region X10_TEMP234 =
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
        
//#line 3698
final x10.
          lang.
          region X10_TEMP8 =
          (x10.
            lang.
            region)
            ((X10_TEMP234));
        
//#line 3699
final x10.
          lang.
          place X10_TEMP237 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 3701
final x10.
          lang.
          place X10_TEMP9 =
          (X10_TEMP237);
        
//#line 3702
final x10.
          lang.
          dist X10_TEMP240 =
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
        
//#line 3704
x10.
          lang.
          dist d1 =
          (x10.
            lang.
            dist)
            ((X10_TEMP240));
        
//#line 3705
final x10.
          lang.
          GenericReferenceArray X10_TEMP243 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d1,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
        
//#line 3707
final x10.
          lang.
          GenericReferenceArray X10_TEMP12 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP243));
        
//#line 3708
final x10.
          lang.
          GenericReferenceArray X10_TEMP246 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP12));
        
//#line 3710
lights =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP246));
        
//#line 3711
final int X10_TEMP249 =
          (0);
        
//#line 3713
final int X10_TEMP17 =
          (X10_TEMP249);
        
//#line 3714
final int X10_TEMP252 =
          (Program0.
             _Program__Scene_maxObjects);
        
//#line 3716
final int X10_TEMP14 =
          (X10_TEMP252);
        
//#line 3717
final int X10_TEMP255 =
          (1);
        
//#line 3719
final int X10_TEMP15 =
          (X10_TEMP255);
        
//#line 3720
final int X10_TEMP258 =
          (X10_TEMP14 -
             X10_TEMP15);
        
//#line 3722
final int X10_TEMP18 =
          (X10_TEMP258);
        
//#line 3723
final x10.
          lang.
          region X10_TEMP263 =
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
        
//#line 3725
final x10.
          lang.
          region X10_TEMP19 =
          (x10.
            lang.
            region)
            ((X10_TEMP263));
        
//#line 3726
final x10.
          lang.
          place X10_TEMP266 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 3728
final x10.
          lang.
          place X10_TEMP20 =
          (X10_TEMP266);
        
//#line 3729
final x10.
          lang.
          dist X10_TEMP269 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                X10_TEMP19,
                X10_TEMP20)));
        
//#line 3731
x10.
          lang.
          dist d2 =
          (x10.
            lang.
            dist)
            ((X10_TEMP269));
        
//#line 3732
final x10.
          lang.
          GenericReferenceArray X10_TEMP272 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d2,(x10.array.Operator.Pointwise)null,true,true,true)/* } */));
        
//#line 3734
final x10.
          lang.
          GenericReferenceArray X10_TEMP23 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP272));
        
//#line 3735
final x10.
          lang.
          GenericReferenceArray X10_TEMP275 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP23));
        
//#line 3737
objects =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP275));
        
//#line 3738
final View X10_TEMP278 =
          (X10_TEMP1);
        
//#line 3740
view =
          ((X10_TEMP278));
        
//#line 3741
final int X10_TEMP281 =
          (0);
        
//#line 3743
final int X10_TEMP26 =
          (X10_TEMP281);
        
//#line 3744
final int X10_TEMP284 =
          (X10_TEMP26);
        
//#line 3746
lightCount =
          ((X10_TEMP284));
        
//#line 3747
final int X10_TEMP287 =
          (0);
        
//#line 3749
final int X10_TEMP28 =
          (X10_TEMP287);
        
//#line 3750
final int X10_TEMP290 =
          (X10_TEMP28);
        
//#line 3752
objectCount =
          ((X10_TEMP290));
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
    
//#line 3759
final public Vec
      c;
    
//#line 3760
final public double
      r;
    
//#line 3761
final public double
      r2;
    
//#line 3762
final public Surface
      surf;
    
    
//#line 3765
public Sphere(final Vec center,
                                final double radius,
                                final Surface s) {
        
//#line 3765
super();
        
//#line 3766
final Vec X10_TEMP217 =
          (center);
        
//#line 3768
Vec X10_TEMP1 =
          (X10_TEMP217);
        
//#line 3769
final double X10_TEMP220 =
          (radius);
        
//#line 3771
double X10_TEMP2 =
          (X10_TEMP220);
        
//#line 3772
final Surface X10_TEMP223 =
          (s);
        
//#line 3774
Surface X10_TEMP3 =
          (X10_TEMP223);
        
//#line 3775
final Surface X10_TEMP226 =
          (X10_TEMP3);
        
//#line 3777
surf =
          ((X10_TEMP226));
        
//#line 3778
final Vec X10_TEMP229 =
          (X10_TEMP1);
        
//#line 3780
c =
          ((X10_TEMP229));
        
//#line 3781
final double X10_TEMP232 =
          (X10_TEMP2);
        
//#line 3783
r =
          ((X10_TEMP232));
        
//#line 3784
final double X10_TEMP235 =
          (r *
             r);
        
//#line 3786
final double X10_TEMP8 =
          (X10_TEMP235);
        
//#line 3787
final double X10_TEMP238 =
          (X10_TEMP8);
        
//#line 3789
r2 =
          ((X10_TEMP238));
    }
    
    
//#line 3791
public Sphere(final Vec center,
                                final double radius) {
        
//#line 3791
super();
        
//#line 3792
final Vec X10_TEMP217 =
          (center);
        
//#line 3794
Vec X10_TEMP1 =
          (X10_TEMP217);
        
//#line 3795
final double X10_TEMP220 =
          (radius);
        
//#line 3797
double X10_TEMP2 =
          (X10_TEMP220);
        
//#line 3798
final Vec X10_TEMP223 =
          (X10_TEMP1);
        
//#line 3800
c =
          ((X10_TEMP223));
        
//#line 3801
final double X10_TEMP226 =
          (X10_TEMP2);
        
//#line 3803
r =
          ((X10_TEMP226));
        
//#line 3804
final double X10_TEMP229 =
          (r *
             r);
        
//#line 3806
final double X10_TEMP6 =
          (X10_TEMP229);
        
//#line 3807
final double X10_TEMP232 =
          (X10_TEMP6);
        
//#line 3809
r2 =
          ((X10_TEMP232));
        
//#line 3810
final Surface X10_TEMP235 =
          (new Surface(
             ));
        
//#line 3812
final Surface X10_TEMP8 =
          (X10_TEMP235);
        
//#line 3813
final Surface X10_TEMP238 =
          (X10_TEMP8);
        
//#line 3815
surf =
          ((X10_TEMP238));
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
    
//#line 3822
final public Vec
      color;
    
//#line 3823
final public double
      kd;
    
//#line 3824
final public double
      ks;
    
//#line 3825
final public double
      shine;
    
//#line 3826
final public double
      kt;
    
//#line 3827
final public double
      ior;
    
//#line 3828
final public boolean
      isNull;
    
    
//#line 3831
public Surface() {
        
//#line 3831
super();
        
//#line 3832
final int X10_TEMP217 =
          (1);
        
//#line 3834
int X10_TEMP5 =
          (X10_TEMP217);
        
//#line 3835
final int X10_TEMP220 =
          (0);
        
//#line 3837
int X10_TEMP6 =
          (X10_TEMP220);
        
//#line 3838
final int X10_TEMP223 =
          (0);
        
//#line 3840
int X10_TEMP7 =
          (X10_TEMP223);
        
//#line 3841
final boolean X10_TEMP226 =
          (false);
        
//#line 3843
boolean X10_TEMP8 =
          (X10_TEMP226);
        
//#line 3844
final Vec X10_TEMP233 =
          (new Vec(
             X10_TEMP5,
             X10_TEMP6,
             X10_TEMP7,
             X10_TEMP8));
        
//#line 3846
final Vec X10_TEMP10 =
          (X10_TEMP233);
        
//#line 3847
final Vec X10_TEMP236 =
          (X10_TEMP10);
        
//#line 3849
color =
          ((X10_TEMP236));
        
//#line 3850
final double X10_TEMP239 =
          (1.0);
        
//#line 3852
final double X10_TEMP12 =
          (X10_TEMP239);
        
//#line 3853
final double X10_TEMP242 =
          (X10_TEMP12);
        
//#line 3855
kd =
          ((X10_TEMP242));
        
//#line 3856
final double X10_TEMP245 =
          (0.0);
        
//#line 3858
final double X10_TEMP14 =
          (X10_TEMP245);
        
//#line 3859
final double X10_TEMP248 =
          (X10_TEMP14);
        
//#line 3861
ks =
          ((X10_TEMP248));
        
//#line 3862
final double X10_TEMP251 =
          (0.0);
        
//#line 3864
final double X10_TEMP16 =
          (X10_TEMP251);
        
//#line 3865
final double X10_TEMP254 =
          (X10_TEMP16);
        
//#line 3867
shine =
          ((X10_TEMP254));
        
//#line 3868
final double X10_TEMP257 =
          (0.0);
        
//#line 3870
final double X10_TEMP18 =
          (X10_TEMP257);
        
//#line 3871
final double X10_TEMP260 =
          (X10_TEMP18);
        
//#line 3873
kt =
          ((X10_TEMP260));
        
//#line 3874
final double X10_TEMP263 =
          (1.0);
        
//#line 3876
final double X10_TEMP20 =
          (X10_TEMP263);
        
//#line 3877
final double X10_TEMP266 =
          (X10_TEMP20);
        
//#line 3879
ior =
          ((X10_TEMP266));
        
//#line 3880
final boolean X10_TEMP269 =
          (false);
        
//#line 3882
final boolean X10_TEMP22 =
          (X10_TEMP269);
        
//#line 3883
final boolean X10_TEMP272 =
          (X10_TEMP22);
        
//#line 3885
isNull =
          ((X10_TEMP272));
    }
    
    
//#line 3887
public Surface(final double shine_,
                                 final double ks_,
                                 final double kt_,
                                 final Vec c_,
                                 final boolean isNull_) {
        
//#line 3887
super();
        
//#line 3888
final double X10_TEMP217 =
          (shine_);
        
//#line 3890
double X10_TEMP1 =
          (X10_TEMP217);
        
//#line 3891
final double X10_TEMP220 =
          (ks_);
        
//#line 3893
double X10_TEMP2 =
          (X10_TEMP220);
        
//#line 3894
final double X10_TEMP223 =
          (kt_);
        
//#line 3896
double X10_TEMP3 =
          (X10_TEMP223);
        
//#line 3897
final Vec X10_TEMP226 =
          (c_);
        
//#line 3899
Vec X10_TEMP4 =
          (X10_TEMP226);
        
//#line 3900
final boolean X10_TEMP229 =
          (isNull_);
        
//#line 3902
boolean X10_TEMP5 =
          (X10_TEMP229);
        
//#line 3903
final double X10_TEMP232 =
          (1.0);
        
//#line 3905
final double X10_TEMP7 =
          (X10_TEMP232);
        
//#line 3906
final double X10_TEMP235 =
          (X10_TEMP7);
        
//#line 3908
kd =
          ((X10_TEMP235));
        
//#line 3909
final double X10_TEMP238 =
          (X10_TEMP2);
        
//#line 3911
ks =
          ((X10_TEMP238));
        
//#line 3912
final double X10_TEMP241 =
          (X10_TEMP1);
        
//#line 3914
shine =
          ((X10_TEMP241));
        
//#line 3915
final double X10_TEMP244 =
          (X10_TEMP3);
        
//#line 3917
kt =
          ((X10_TEMP244));
        
//#line 3918
final double X10_TEMP247 =
          (1.0);
        
//#line 3920
final double X10_TEMP12 =
          (X10_TEMP247);
        
//#line 3921
final double X10_TEMP250 =
          (X10_TEMP12);
        
//#line 3923
ior =
          ((X10_TEMP250));
        
//#line 3924
final Vec X10_TEMP253 =
          (X10_TEMP4);
        
//#line 3926
color =
          ((X10_TEMP253));
        
//#line 3927
final boolean X10_TEMP256 =
          (X10_TEMP5);
        
//#line 3929
isNull =
          ((X10_TEMP256));
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
    
//#line 3936
final public double
      x;
    
//#line 3937
final public double
      y;
    
//#line 3938
final public double
      z;
    
//#line 3939
final public boolean
      isNull;
    
    
//#line 3942
public Vec(final double a,
                             final double b,
                             final double c,
                             final boolean isNull_) {
        
//#line 3942
super();
        
//#line 3943
final double X10_TEMP217 =
          (a);
        
//#line 3945
double X10_TEMP1 =
          (X10_TEMP217);
        
//#line 3946
final double X10_TEMP220 =
          (b);
        
//#line 3948
double X10_TEMP2 =
          (X10_TEMP220);
        
//#line 3949
final double X10_TEMP223 =
          (c);
        
//#line 3951
double X10_TEMP3 =
          (X10_TEMP223);
        
//#line 3952
final boolean X10_TEMP226 =
          (isNull_);
        
//#line 3954
boolean X10_TEMP4 =
          (X10_TEMP226);
        
//#line 3955
final double X10_TEMP229 =
          (X10_TEMP1);
        
//#line 3957
x =
          ((X10_TEMP229));
        
//#line 3958
final double X10_TEMP232 =
          (X10_TEMP2);
        
//#line 3960
y =
          ((X10_TEMP232));
        
//#line 3961
final double X10_TEMP235 =
          (X10_TEMP3);
        
//#line 3963
z =
          ((X10_TEMP235));
        
//#line 3964
final boolean X10_TEMP238 =
          (X10_TEMP4);
        
//#line 3966
isNull =
          ((X10_TEMP238));
    }
    
    
//#line 3968
public Vec(final Vec a,
                             final boolean isNull_) {
        
//#line 3968
super();
        
//#line 3969
final Vec X10_TEMP217 =
          (a);
        
//#line 3971
Vec X10_TEMP1 =
          (X10_TEMP217);
        
//#line 3972
final boolean X10_TEMP220 =
          (isNull_);
        
//#line 3974
boolean X10_TEMP2 =
          (X10_TEMP220);
        
//#line 3975
final double X10_TEMP223 =
          (X10_TEMP1.
             x);
        
//#line 3977
final double X10_TEMP4 =
          (X10_TEMP223);
        
//#line 3978
final double X10_TEMP226 =
          (X10_TEMP4);
        
//#line 3980
x =
          ((X10_TEMP226));
        
//#line 3981
final double X10_TEMP229 =
          (X10_TEMP1.
             y);
        
//#line 3983
final double X10_TEMP6 =
          (X10_TEMP229);
        
//#line 3984
final double X10_TEMP232 =
          (X10_TEMP6);
        
//#line 3986
y =
          ((X10_TEMP232));
        
//#line 3987
final double X10_TEMP235 =
          (X10_TEMP1.
             z);
        
//#line 3989
final double X10_TEMP8 =
          (X10_TEMP235);
        
//#line 3990
final double X10_TEMP238 =
          (X10_TEMP8);
        
//#line 3992
z =
          ((X10_TEMP238));
        
//#line 3993
final boolean X10_TEMP241 =
          (X10_TEMP2);
        
//#line 3995
isNull =
          ((X10_TEMP241));
    }
    
    
//#line 3997
public Vec() {
        
//#line 3997
super();
        
//#line 3998
final double X10_TEMP217 =
          (0.0);
        
//#line 4000
final double X10_TEMP2 =
          (X10_TEMP217);
        
//#line 4001
final double X10_TEMP220 =
          (X10_TEMP2);
        
//#line 4003
x =
          ((X10_TEMP220));
        
//#line 4004
final double X10_TEMP223 =
          (0.0);
        
//#line 4006
final double X10_TEMP4 =
          (X10_TEMP223);
        
//#line 4007
final double X10_TEMP226 =
          (X10_TEMP4);
        
//#line 4009
y =
          ((X10_TEMP226));
        
//#line 4010
final double X10_TEMP229 =
          (0.0);
        
//#line 4012
final double X10_TEMP6 =
          (X10_TEMP229);
        
//#line 4013
final double X10_TEMP232 =
          (X10_TEMP6);
        
//#line 4015
z =
          ((X10_TEMP232));
        
//#line 4016
final boolean X10_TEMP235 =
          (false);
        
//#line 4018
final boolean X10_TEMP8 =
          (X10_TEMP235);
        
//#line 4019
final boolean X10_TEMP238 =
          (X10_TEMP8);
        
//#line 4021
isNull =
          ((X10_TEMP238));
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
    
//#line 4028
final public Vec
      from;
    
//#line 4029
final public Vec
      at;
    
//#line 4030
final public Vec
      up;
    
//#line 4031
final public double
      distance;
    
//#line 4032
final public double
      angle;
    
//#line 4033
final public double
      aspect;
    
    
//#line 4036
public View(final Vec from_,
                              final Vec at_,
                              final Vec up_,
                              final double dist_,
                              final double angle_,
                              final double aspect_) {
        
//#line 4036
super();
        
//#line 4037
final Vec X10_TEMP217 =
          (from_);
        
//#line 4039
Vec X10_TEMP1 =
          (X10_TEMP217);
        
//#line 4040
final Vec X10_TEMP220 =
          (at_);
        
//#line 4042
Vec X10_TEMP2 =
          (X10_TEMP220);
        
//#line 4043
final Vec X10_TEMP223 =
          (up_);
        
//#line 4045
Vec X10_TEMP3 =
          (X10_TEMP223);
        
//#line 4046
final double X10_TEMP226 =
          (dist_);
        
//#line 4048
double X10_TEMP4 =
          (X10_TEMP226);
        
//#line 4049
final double X10_TEMP229 =
          (angle_);
        
//#line 4051
double X10_TEMP5 =
          (X10_TEMP229);
        
//#line 4052
final double X10_TEMP232 =
          (aspect_);
        
//#line 4054
double X10_TEMP6 =
          (X10_TEMP232);
        
//#line 4055
final Vec X10_TEMP235 =
          (X10_TEMP1);
        
//#line 4057
from =
          ((X10_TEMP235));
        
//#line 4058
final Vec X10_TEMP238 =
          (X10_TEMP2);
        
//#line 4060
at =
          ((X10_TEMP238));
        
//#line 4061
final Vec X10_TEMP241 =
          (X10_TEMP3);
        
//#line 4063
up =
          ((X10_TEMP241));
        
//#line 4064
final double X10_TEMP244 =
          (X10_TEMP4);
        
//#line 4066
distance =
          ((X10_TEMP244));
        
//#line 4067
final double X10_TEMP247 =
          (X10_TEMP5);
        
//#line 4069
angle =
          ((X10_TEMP247));
        
//#line 4070
final double X10_TEMP250 =
          (X10_TEMP6);
        
//#line 4072
aspect =
          ((X10_TEMP250));
    }
}
