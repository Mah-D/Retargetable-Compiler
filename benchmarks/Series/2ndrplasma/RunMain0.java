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
public static void
                 runMain(
                 ) {
        
//#line 10
Program0.
                      Program_runMain();
    }
    
    
//#line 12
public static void
                  Program_runMain(
                  ) {
        
//#line 13
final Series X10_TEMP93 =
          (new Series(
             ));
        
//#line 15
final Series X10_TEMP1 =
          (X10_TEMP93);
        
//#line 16
Program0.
                      Program_Series_run(
                      X10_TEMP1);
    }
    
    
//#line 18
public static void
                  Program_Series_setSize(
                  final Series X10_TEMP0,
                  final int setsize) {
        
//#line 19
int X10_TEMP1 =
          (setsize);
        
//#line 20
final int X10_TEMP94 =
          (X10_TEMP1);
        
//#line 22
final int X10_TEMP4 =
          (X10_TEMP94);
        
//#line 23
final int X10_TEMP97 =
          (X10_TEMP4);
        
//#line 25
final int X10_TEMP100 =
          (X10_TEMP97);
        
//#line 26
/* template:place-check { */((Series) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.setsize =
          ((X10_TEMP100));
    }
    
    
//#line 28
public static void
                  Program_Series_initialise(
                  final Series X10_TEMP0,
                  final int n) {
        
//#line 29
int X10_TEMP1 =
          (n);
        
//#line 30
final int X10_TEMP94 =
          (X10_TEMP1);
        
//#line 32
final int X10_TEMP4 =
          (X10_TEMP94);
        
//#line 33
final int X10_TEMP97 =
          (X10_TEMP4);
        
//#line 35
final int X10_TEMP100 =
          (X10_TEMP97);
        
//#line 36
/* template:place-check { */((Series) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.array_rows =
          ((X10_TEMP100));
        
//#line 37
Program0.
                      Program_Series_buildTestData(
                      X10_TEMP0);
    }
    
    
//#line 39
public static void
                  Program_Series_kernel(
                  final Series X10_TEMP0) {
        
//#line 40
Program0.
                      Program_Series_Do(
                      X10_TEMP0);
    }
    
    
//#line 42
public static void
                  Program_Series_initRefArray(
                  final Series X10_TEMP0,
                  final x10.
                    lang.
                    DoubleReferenceArray ref) {
        
//#line 43
final int X10_TEMP93 =
          (0);
        
//#line 45
final int X10_TEMP3 =
          (X10_TEMP93);
        
//#line 46
final int X10_TEMP96 =
          (0);
        
//#line 48
final int X10_TEMP4 =
          (X10_TEMP96);
        
//#line 49
final double X10_TEMP99 =
          (2.8729524964837996);
        
//#line 51
final double X10_TEMP7 =
          (X10_TEMP99);
        
//#line 52
final double X10_TEMP102 =
          (X10_TEMP7);
        
//#line 54
final double X10_TEMP8 =
          (X10_TEMP102);
        
//#line 55
final double X10_TEMP107 =
          (X10_TEMP8);
        
//#line 57
final double X10_TEMP110 =
          (X10_TEMP107);
        
//#line 58
/* template:array_set { */(ref).set((X10_TEMP110),/* Join: { */X10_TEMP3,X10_TEMP4/* } */)/* } */;
        
//#line 59
final int X10_TEMP112 =
          (0);
        
//#line 61
final int X10_TEMP11 =
          (X10_TEMP112);
        
//#line 62
final int X10_TEMP115 =
          (1);
        
//#line 64
final int X10_TEMP12 =
          (X10_TEMP115);
        
//#line 65
final double X10_TEMP118 =
          (0.0);
        
//#line 67
final double X10_TEMP15 =
          (X10_TEMP118);
        
//#line 68
final double X10_TEMP121 =
          (X10_TEMP15);
        
//#line 70
final double X10_TEMP16 =
          (X10_TEMP121);
        
//#line 71
final double X10_TEMP126 =
          (X10_TEMP16);
        
//#line 73
final double X10_TEMP129 =
          (X10_TEMP126);
        
//#line 74
/* template:array_set { */(ref).set((X10_TEMP129),/* Join: { */X10_TEMP11,X10_TEMP12/* } */)/* } */;
        
//#line 75
final int X10_TEMP131 =
          (1);
        
//#line 77
final int X10_TEMP19 =
          (X10_TEMP131);
        
//#line 78
final int X10_TEMP134 =
          (0);
        
//#line 80
final int X10_TEMP20 =
          (X10_TEMP134);
        
//#line 81
final double X10_TEMP137 =
          (1.1161046676147888);
        
//#line 83
final double X10_TEMP23 =
          (X10_TEMP137);
        
//#line 84
final double X10_TEMP140 =
          (X10_TEMP23);
        
//#line 86
final double X10_TEMP24 =
          (X10_TEMP140);
        
//#line 87
final double X10_TEMP145 =
          (X10_TEMP24);
        
//#line 89
final double X10_TEMP148 =
          (X10_TEMP145);
        
//#line 90
/* template:array_set { */(ref).set((X10_TEMP148),/* Join: { */X10_TEMP19,X10_TEMP20/* } */)/* } */;
        
//#line 91
final int X10_TEMP150 =
          (1);
        
//#line 93
final int X10_TEMP27 =
          (X10_TEMP150);
        
//#line 94
final int X10_TEMP153 =
          (1);
        
//#line 96
final int X10_TEMP28 =
          (X10_TEMP153);
        
//#line 97
final double X10_TEMP156 =
          (1.8819691893398025);
        
//#line 99
final double X10_TEMP29 =
          (X10_TEMP156);
        
//#line 100
final int X10_TEMP30 =
          (0);
        
//#line 101
final double X10_TEMP160 =
          (X10_TEMP30 -
             X10_TEMP29);
        
//#line 103
final double X10_TEMP33 =
          (X10_TEMP160);
        
//#line 104
final double X10_TEMP163 =
          (X10_TEMP33);
        
//#line 106
final double X10_TEMP34 =
          (X10_TEMP163);
        
//#line 107
final double X10_TEMP168 =
          (X10_TEMP34);
        
//#line 109
final double X10_TEMP171 =
          (X10_TEMP168);
        
//#line 110
/* template:array_set { */(ref).set((X10_TEMP171),/* Join: { */X10_TEMP27,X10_TEMP28/* } */)/* } */;
        
//#line 111
final int X10_TEMP173 =
          (2);
        
//#line 113
final int X10_TEMP37 =
          (X10_TEMP173);
        
//#line 114
final int X10_TEMP176 =
          (0);
        
//#line 116
final int X10_TEMP38 =
          (X10_TEMP176);
        
//#line 117
final double X10_TEMP179 =
          (0.34429060398168704);
        
//#line 119
final double X10_TEMP41 =
          (X10_TEMP179);
        
//#line 120
final double X10_TEMP182 =
          (X10_TEMP41);
        
//#line 122
final double X10_TEMP42 =
          (X10_TEMP182);
        
//#line 123
final double X10_TEMP187 =
          (X10_TEMP42);
        
//#line 125
final double X10_TEMP190 =
          (X10_TEMP187);
        
//#line 126
/* template:array_set { */(ref).set((X10_TEMP190),/* Join: { */X10_TEMP37,X10_TEMP38/* } */)/* } */;
        
//#line 127
final int X10_TEMP192 =
          (2);
        
//#line 129
final int X10_TEMP45 =
          (X10_TEMP192);
        
//#line 130
final int X10_TEMP195 =
          (1);
        
//#line 132
final int X10_TEMP46 =
          (X10_TEMP195);
        
//#line 133
final double X10_TEMP198 =
          (1.1645642623320958);
        
//#line 135
final double X10_TEMP47 =
          (X10_TEMP198);
        
//#line 136
final int X10_TEMP48 =
          (0);
        
//#line 137
final double X10_TEMP202 =
          (X10_TEMP48 -
             X10_TEMP47);
        
//#line 139
final double X10_TEMP51 =
          (X10_TEMP202);
        
//#line 140
final double X10_TEMP205 =
          (X10_TEMP51);
        
//#line 142
final double X10_TEMP52 =
          (X10_TEMP205);
        
//#line 143
final double X10_TEMP210 =
          (X10_TEMP52);
        
//#line 145
final double X10_TEMP213 =
          (X10_TEMP210);
        
//#line 146
/* template:array_set { */(ref).set((X10_TEMP213),/* Join: { */X10_TEMP45,X10_TEMP46/* } */)/* } */;
        
//#line 147
final int X10_TEMP215 =
          (3);
        
//#line 149
final int X10_TEMP55 =
          (X10_TEMP215);
        
//#line 150
final int X10_TEMP218 =
          (0);
        
//#line 152
final int X10_TEMP56 =
          (X10_TEMP218);
        
//#line 153
final double X10_TEMP221 =
          (0.15238898702519288);
        
//#line 155
final double X10_TEMP59 =
          (X10_TEMP221);
        
//#line 156
final double X10_TEMP224 =
          (X10_TEMP59);
        
//#line 158
final double X10_TEMP60 =
          (X10_TEMP224);
        
//#line 159
final double X10_TEMP229 =
          (X10_TEMP60);
        
//#line 161
final double X10_TEMP232 =
          (X10_TEMP229);
        
//#line 162
/* template:array_set { */(ref).set((X10_TEMP232),/* Join: { */X10_TEMP55,X10_TEMP56/* } */)/* } */;
        
//#line 163
final int X10_TEMP234 =
          (3);
        
//#line 165
final int X10_TEMP63 =
          (X10_TEMP234);
        
//#line 166
final int X10_TEMP237 =
          (1);
        
//#line 168
final int X10_TEMP64 =
          (X10_TEMP237);
        
//#line 169
final double X10_TEMP240 =
          (0.8143461113044298);
        
//#line 171
final double X10_TEMP65 =
          (X10_TEMP240);
        
//#line 172
final int X10_TEMP66 =
          (0);
        
//#line 173
final double X10_TEMP244 =
          (X10_TEMP66 -
             X10_TEMP65);
        
//#line 175
final double X10_TEMP69 =
          (X10_TEMP244);
        
//#line 176
final double X10_TEMP247 =
          (X10_TEMP69);
        
//#line 178
final double X10_TEMP70 =
          (X10_TEMP247);
        
//#line 179
final double X10_TEMP252 =
          (X10_TEMP70);
        
//#line 181
final double X10_TEMP255 =
          (X10_TEMP252);
        
//#line 182
/* template:array_set { */(ref).set((X10_TEMP255),/* Join: { */X10_TEMP63,X10_TEMP64/* } */)/* } */;
    }
    
    
//#line 184
public static void
                   Program_Series_validate(
                   final Series X10_TEMP0) {
        
//#line 185
final int X10_TEMP93 =
          (0);
        
//#line 187
final int X10_TEMP3 =
          (X10_TEMP93);
        
//#line 188
final int X10_TEMP96 =
          (3);
        
//#line 190
final int X10_TEMP4 =
          (X10_TEMP96);
        
//#line 191
final int X10_TEMP99 =
          (0);
        
//#line 193
final int X10_TEMP7 =
          (X10_TEMP99);
        
//#line 194
final int X10_TEMP102 =
          (1);
        
//#line 196
final int X10_TEMP8 =
          (X10_TEMP102);
        
//#line 197
final x10.
          lang.
          region X10_TEMP109 =
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
                  X10_TEMP4),
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP7,
                  X10_TEMP8))));
        
//#line 199
final x10.
          lang.
          region r =
          (x10.
            lang.
            region)
            ((X10_TEMP109));
        
//#line 200
final x10.
          lang.
          place X10_TEMP112 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 202
final x10.
          lang.
          place X10_TEMP10 =
          (X10_TEMP112);
        
//#line 203
final x10.
          lang.
          dist X10_TEMP115 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                r,
                X10_TEMP10)));
        
//#line 205
final x10.
          lang.
          dist vd =
          (x10.
            lang.
            dist)
            ((X10_TEMP115));
        
//#line 206
final x10.
          lang.
          DoubleReferenceArray X10_TEMP122 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(vd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public double apply(/* Join: { */x10.
                lang.
                point p0/* } */, double dummy) { {
                  
//#line 207
final double X10_TEMP118 =
                    (0.0);
                  
//#line 209
final double X10_TEMP13 =
                    (X10_TEMP118);
                  
//#line 210
return X10_TEMP13;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 215
final x10.
          lang.
          DoubleReferenceArray ref =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP122));
        
//#line 216
Program0.
                       Program_Series_initRefArray(
                       X10_TEMP0,
                       ref);
        
//#line 217
/* template:forloop-mult { */{
        x10.lang.region __var2__ = (x10.lang.region) vd.
                                                       region;
        if (__var2__.size() > 0 && (__var2__ instanceof x10.array.MultiDimRegion || __var2__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var3__ = __var2__.rank(0).low(), __var4__ = __var2__.rank(0).high(); __var3__ <= __var4__; __var3__++)
        /* } */
        /* template:forloop-mult-each { */
        for (int __var5__ = __var2__.rank(1).low(), __var6__ = __var2__.rank(1).high(); __var5__ <= __var6__; __var5__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var3__;
        /* } */
        /* template:final-var-assign { */
        final int j = __var5__;
        /* } */
        /* } */
{
            
//#line 218
final int X10_TEMP128 =
              (i);
            
//#line 220
final int ii =
              (X10_TEMP128);
            
//#line 221
final int X10_TEMP131 =
              (j);
            
//#line 223
final int jj =
              (X10_TEMP131);
            
//#line 224
final int X10_TEMP134 =
              (0);
            
//#line 226
double cval =
              (X10_TEMP134);
            
//#line 227
final x10.
              lang.
              place X10_TEMP137 =
              (/* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 229
final x10.
              lang.
              place curr_place =
              (X10_TEMP137);
            
//#line 230
final int X10_TEMP140 =
              (0);
            
//#line 232
final int X10_TEMP23 =
              (X10_TEMP140);
            
//#line 233
final int X10_TEMP143 =
              (0);
            
//#line 235
final int X10_TEMP24 =
              (X10_TEMP143);
            
//#line 236
final x10.
              lang.
              region X10_TEMP148 =
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
            
//#line 238
final x10.
              lang.
              region tempr =
              (x10.
                lang.
                region)
                ((X10_TEMP148));
            
//#line 239
final x10.
              lang.
              place X10_TEMP151 =
              (/* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 241
final x10.
              lang.
              place X10_TEMP26 =
              (X10_TEMP151);
            
//#line 242
final x10.
              lang.
              dist X10_TEMP154 =
              (x10.
                lang.
                dist)
                ((x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    tempr,
                    X10_TEMP26)));
            
//#line 244
final x10.
              lang.
              dist tempvd =
              (x10.
                lang.
                dist)
                ((X10_TEMP154));
            
//#line 245
final x10.
              lang.
              DoubleReferenceArray X10_TEMP161 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(tempvd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                  	public double apply(/* Join: { */x10.
                    lang.
                    point p0/* } */, double dummy) { {
                      
//#line 246
final double X10_TEMP157 =
                        (0.0);
                      
//#line 248
final double X10_TEMP29 =
                        (X10_TEMP157);
                      
//#line 249
return X10_TEMP29;
                  } }
                  }/* } */,true,true,false)/* } */));
            
//#line 254
final x10.
              lang.
              DoubleReferenceArray tempref =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP161));
            
//#line 255
final x10.
              lang.
              DoubleReferenceArray X10_TEMP164 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Series) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.testArray));
            
//#line 257
final x10.
              lang.
              DoubleReferenceArray tA =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP164));
            
//#line 258
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 259
final x10.
                  lang.
                  DoubleReferenceArray X10_TEMP167 =
                  (x10.
                    lang.
                    DoubleReferenceArray)
                    ((/* template:place-check { */((Series) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.testArray));
                
//#line 261
final x10.
                  lang.
                  DoubleReferenceArray X10_TEMP32 =
                  (x10.
                    lang.
                    DoubleReferenceArray)
                    ((X10_TEMP167));
                
//#line 262
final x10.
                  lang.
                  dist X10_TEMP170 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP32.
                        distribution));
                
//#line 264
final x10.
                  lang.
                  dist X10_TEMP33 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP170));
                
//#line 265
final x10.
                  lang.
                  place X10_TEMP37 =
                  (X10_TEMP33.
                     get(
                     j,
                     i));
                
//#line 266
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP37)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 267
final double X10_TEMP179 =
                      (/* template:array_get { */((tA).get(/* Join: { */jj,ii/* } */))/* } */);
                    
//#line 269
final double temp =
                      (X10_TEMP179);
                    
//#line 270
/* template:Async { */(x10.lang.Runtime.asPlace(curr_place)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 271
final int X10_TEMP183 =
                          (0);
                        
//#line 273
final int X10_TEMP43 =
                          (X10_TEMP183);
                        
//#line 274
final double X10_TEMP186 =
                          (temp);
                        
//#line 276
final double X10_TEMP46 =
                          (X10_TEMP186);
                        
//#line 277
final double X10_TEMP190 =
                          (X10_TEMP46);
                        
//#line 279
final double X10_TEMP193 =
                          (X10_TEMP190);
                        
//#line 280
/* template:array_set { */(tempref).set((X10_TEMP193),X10_TEMP43)/* } */;
                    }
                    		}
                    	});/* } */
                }
                		}
                	});/* } */
            }
            	} catch (Throwable tmp7) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp7);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 284
final int X10_TEMP195 =
              (0);
            
//#line 286
final int X10_TEMP48 =
              (X10_TEMP195);
            
//#line 287
final double X10_TEMP199 =
              (/* template:array_get { */((tempref).get(X10_TEMP48))/* } */);
            
//#line 289
final double X10_TEMP50 =
              (X10_TEMP199);
            
//#line 290
final double X10_TEMP202 =
              (X10_TEMP50);
            
//#line 292
cval =
              ((X10_TEMP202));
            
//#line 293
final double X10_TEMP207 =
              (/* template:array_get { */((ref).get(/* Join: { */i,j/* } */))/* } */);
            
//#line 295
final double X10_TEMP53 =
              (X10_TEMP207);
            
//#line 296
final double X10_TEMP210 =
              (cval -
                 X10_TEMP53);
            
//#line 298
final double X10_TEMP55 =
              (X10_TEMP210);
            
//#line 299
final double X10_TEMP214 =
              (java.
                 lang.
                 Math.
                 abs(
                 X10_TEMP55));
            
//#line 301
double error =
              (X10_TEMP214);
            
//#line 302
final double X10_TEMP217 =
              (1.0E-12);
            
//#line 304
final double X10_TEMP57 =
              (X10_TEMP217);
            
//#line 305
final boolean X10_TEMP59 =
              (error >
                 X10_TEMP57);
            
//#line 306
if (X10_TEMP59) {
                
//#line 307
final java.
                  lang.
                  String X10_TEMP222 =
                  ("Validation failed for coefficient ");
                
//#line 309
final java.
                  lang.
                  String X10_TEMP60 =
                  (X10_TEMP222);
                
//#line 310
final java.
                  lang.
                  String X10_TEMP225 =
                  (X10_TEMP60 +
                   j);
                
//#line 312
final java.
                  lang.
                  String X10_TEMP61 =
                  (X10_TEMP225);
                
//#line 313
final java.
                  lang.
                  String X10_TEMP228 =
                  (",");
                
//#line 315
final java.
                  lang.
                  String X10_TEMP62 =
                  (X10_TEMP228);
                
//#line 316
final java.
                  lang.
                  String X10_TEMP231 =
                  (X10_TEMP61 +
                   X10_TEMP62);
                
//#line 318
final java.
                  lang.
                  String X10_TEMP63 =
                  (X10_TEMP231);
                
//#line 319
final java.
                  lang.
                  String X10_TEMP234 =
                  (X10_TEMP63 +
                   i);
                
//#line 321
final java.
                  lang.
                  String X10_TEMP65 =
                  (X10_TEMP234);
                
//#line 322
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println(X10_TEMP65);
                
//#line 323
final java.
                  lang.
                  String X10_TEMP238 =
                  ("Computed value = ");
                
//#line 325
final java.
                  lang.
                  String X10_TEMP66 =
                  (X10_TEMP238);
                
//#line 326
final java.
                  lang.
                  String X10_TEMP241 =
                  (X10_TEMP66 +
                   cval);
                
//#line 328
final java.
                  lang.
                  String X10_TEMP68 =
                  (X10_TEMP241);
                
//#line 329
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println(X10_TEMP68);
                
//#line 330
final java.
                  lang.
                  String X10_TEMP245 =
                  ("Reference value = ");
                
//#line 332
final java.
                  lang.
                  String X10_TEMP71 =
                  (X10_TEMP245);
                
//#line 333
final double X10_TEMP250 =
                  (/* template:array_get { */((ref).get(/* Join: { */i,j/* } */))/* } */);
                
//#line 335
final double X10_TEMP72 =
                  (X10_TEMP250);
                
//#line 336
final java.
                  lang.
                  String X10_TEMP253 =
                  (X10_TEMP71 +
                   X10_TEMP72);
                
//#line 338
final java.
                  lang.
                  String X10_TEMP74 =
                  (X10_TEMP253);
                
//#line 339
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println(X10_TEMP74);
                
//#line 340
final java.
                  lang.
                  String X10_TEMP257 =
                  ("Validation failed");
                
//#line 342
final java.
                  lang.
                  String X10_TEMP76 =
                  (X10_TEMP257);
                
//#line 343
throw new java.
                  lang.
                  RuntimeException(
                  X10_TEMP76);
            }
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
          /* template:array_get { */((__var0__).get(1))/* } */;/* } */
{
            
//#line 218
final int X10_TEMP128 =
              (i);
            
//#line 220
final int ii =
              (X10_TEMP128);
            
//#line 221
final int X10_TEMP131 =
              (j);
            
//#line 223
final int jj =
              (X10_TEMP131);
            
//#line 224
final int X10_TEMP134 =
              (0);
            
//#line 226
double cval =
              (X10_TEMP134);
            
//#line 227
final x10.
              lang.
              place X10_TEMP137 =
              (/* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 229
final x10.
              lang.
              place curr_place =
              (X10_TEMP137);
            
//#line 230
final int X10_TEMP140 =
              (0);
            
//#line 232
final int X10_TEMP23 =
              (X10_TEMP140);
            
//#line 233
final int X10_TEMP143 =
              (0);
            
//#line 235
final int X10_TEMP24 =
              (X10_TEMP143);
            
//#line 236
final x10.
              lang.
              region X10_TEMP148 =
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
            
//#line 238
final x10.
              lang.
              region tempr =
              (x10.
                lang.
                region)
                ((X10_TEMP148));
            
//#line 239
final x10.
              lang.
              place X10_TEMP151 =
              (/* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 241
final x10.
              lang.
              place X10_TEMP26 =
              (X10_TEMP151);
            
//#line 242
final x10.
              lang.
              dist X10_TEMP154 =
              (x10.
                lang.
                dist)
                ((x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    tempr,
                    X10_TEMP26)));
            
//#line 244
final x10.
              lang.
              dist tempvd =
              (x10.
                lang.
                dist)
                ((X10_TEMP154));
            
//#line 245
final x10.
              lang.
              DoubleReferenceArray X10_TEMP161 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(tempvd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                  	public double apply(/* Join: { */x10.
                    lang.
                    point p0/* } */, double dummy) { {
                      
//#line 246
final double X10_TEMP157 =
                        (0.0);
                      
//#line 248
final double X10_TEMP29 =
                        (X10_TEMP157);
                      
//#line 249
return X10_TEMP29;
                  } }
                  }/* } */,true,true,false)/* } */));
            
//#line 254
final x10.
              lang.
              DoubleReferenceArray tempref =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP161));
            
//#line 255
final x10.
              lang.
              DoubleReferenceArray X10_TEMP164 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:place-check { */((Series) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.testArray));
            
//#line 257
final x10.
              lang.
              DoubleReferenceArray tA =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP164));
            
//#line 258
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 259
final x10.
                  lang.
                  DoubleReferenceArray X10_TEMP167 =
                  (x10.
                    lang.
                    DoubleReferenceArray)
                    ((/* template:place-check { */((Series) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.testArray));
                
//#line 261
final x10.
                  lang.
                  DoubleReferenceArray X10_TEMP32 =
                  (x10.
                    lang.
                    DoubleReferenceArray)
                    ((X10_TEMP167));
                
//#line 262
final x10.
                  lang.
                  dist X10_TEMP170 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP32.
                        distribution));
                
//#line 264
final x10.
                  lang.
                  dist X10_TEMP33 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP170));
                
//#line 265
final x10.
                  lang.
                  place X10_TEMP37 =
                  (X10_TEMP33.
                     get(
                     j,
                     i));
                
//#line 266
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP37)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 267
final double X10_TEMP179 =
                      (/* template:array_get { */((tA).get(/* Join: { */jj,ii/* } */))/* } */);
                    
//#line 269
final double temp =
                      (X10_TEMP179);
                    
//#line 270
/* template:Async { */(x10.lang.Runtime.asPlace(curr_place)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 271
final int X10_TEMP183 =
                          (0);
                        
//#line 273
final int X10_TEMP43 =
                          (X10_TEMP183);
                        
//#line 274
final double X10_TEMP186 =
                          (temp);
                        
//#line 276
final double X10_TEMP46 =
                          (X10_TEMP186);
                        
//#line 277
final double X10_TEMP190 =
                          (X10_TEMP46);
                        
//#line 279
final double X10_TEMP193 =
                          (X10_TEMP190);
                        
//#line 280
/* template:array_set { */(tempref).set((X10_TEMP193),X10_TEMP43)/* } */;
                    }
                    		}
                    	});/* } */
                }
                		}
                	});/* } */
            }
            	} catch (Throwable tmp8) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp8);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 284
final int X10_TEMP195 =
              (0);
            
//#line 286
final int X10_TEMP48 =
              (X10_TEMP195);
            
//#line 287
final double X10_TEMP199 =
              (/* template:array_get { */((tempref).get(X10_TEMP48))/* } */);
            
//#line 289
final double X10_TEMP50 =
              (X10_TEMP199);
            
//#line 290
final double X10_TEMP202 =
              (X10_TEMP50);
            
//#line 292
cval =
              ((X10_TEMP202));
            
//#line 293
final double X10_TEMP207 =
              (/* template:array_get { */((ref).get(/* Join: { */i,j/* } */))/* } */);
            
//#line 295
final double X10_TEMP53 =
              (X10_TEMP207);
            
//#line 296
final double X10_TEMP210 =
              (cval -
                 X10_TEMP53);
            
//#line 298
final double X10_TEMP55 =
              (X10_TEMP210);
            
//#line 299
final double X10_TEMP214 =
              (java.
                 lang.
                 Math.
                 abs(
                 X10_TEMP55));
            
//#line 301
double error =
              (X10_TEMP214);
            
//#line 302
final double X10_TEMP217 =
              (1.0E-12);
            
//#line 304
final double X10_TEMP57 =
              (X10_TEMP217);
            
//#line 305
final boolean X10_TEMP59 =
              (error >
                 X10_TEMP57);
            
//#line 306
if (X10_TEMP59) {
                
//#line 307
final java.
                  lang.
                  String X10_TEMP222 =
                  ("Validation failed for coefficient ");
                
//#line 309
final java.
                  lang.
                  String X10_TEMP60 =
                  (X10_TEMP222);
                
//#line 310
final java.
                  lang.
                  String X10_TEMP225 =
                  (X10_TEMP60 +
                   j);
                
//#line 312
final java.
                  lang.
                  String X10_TEMP61 =
                  (X10_TEMP225);
                
//#line 313
final java.
                  lang.
                  String X10_TEMP228 =
                  (",");
                
//#line 315
final java.
                  lang.
                  String X10_TEMP62 =
                  (X10_TEMP228);
                
//#line 316
final java.
                  lang.
                  String X10_TEMP231 =
                  (X10_TEMP61 +
                   X10_TEMP62);
                
//#line 318
final java.
                  lang.
                  String X10_TEMP63 =
                  (X10_TEMP231);
                
//#line 319
final java.
                  lang.
                  String X10_TEMP234 =
                  (X10_TEMP63 +
                   i);
                
//#line 321
final java.
                  lang.
                  String X10_TEMP65 =
                  (X10_TEMP234);
                
//#line 322
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println(X10_TEMP65);
                
//#line 323
final java.
                  lang.
                  String X10_TEMP238 =
                  ("Computed value = ");
                
//#line 325
final java.
                  lang.
                  String X10_TEMP66 =
                  (X10_TEMP238);
                
//#line 326
final java.
                  lang.
                  String X10_TEMP241 =
                  (X10_TEMP66 +
                   cval);
                
//#line 328
final java.
                  lang.
                  String X10_TEMP68 =
                  (X10_TEMP241);
                
//#line 329
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println(X10_TEMP68);
                
//#line 330
final java.
                  lang.
                  String X10_TEMP245 =
                  ("Reference value = ");
                
//#line 332
final java.
                  lang.
                  String X10_TEMP71 =
                  (X10_TEMP245);
                
//#line 333
final double X10_TEMP250 =
                  (/* template:array_get { */((ref).get(/* Join: { */i,j/* } */))/* } */);
                
//#line 335
final double X10_TEMP72 =
                  (X10_TEMP250);
                
//#line 336
final java.
                  lang.
                  String X10_TEMP253 =
                  (X10_TEMP71 +
                   X10_TEMP72);
                
//#line 338
final java.
                  lang.
                  String X10_TEMP74 =
                  (X10_TEMP253);
                
//#line 339
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println(X10_TEMP74);
                
//#line 340
final java.
                  lang.
                  String X10_TEMP257 =
                  ("Validation failed");
                
//#line 342
final java.
                  lang.
                  String X10_TEMP76 =
                  (X10_TEMP257);
                
//#line 343
throw new java.
                  lang.
                  RuntimeException(
                  X10_TEMP76);
            }
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
    }
    
    
//#line 347
public static void
                   Program_Series_tidyup(
                   final Series X10_TEMP0) {
        
//#line 348
Program0.
                       Program_Series_freeTestData(
                       X10_TEMP0);
    }
    
    
//#line 350
public static void
                   Program_Series_run(
                   final Series X10_TEMP0) {
        
//#line 351
final int X10_TEMP93 =
          (0);
        
//#line 353
final int X10_TEMP3 =
          (X10_TEMP93);
        
//#line 354
final int X10_TEMP96 =
          (0);
        
//#line 356
final int X10_TEMP4 =
          (X10_TEMP96);
        
//#line 357
final x10.
          lang.
          region X10_TEMP101 =
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
        
//#line 359
final x10.
          lang.
          region tempregion =
          (x10.
            lang.
            region)
            ((X10_TEMP101));
        
//#line 360
final x10.
          lang.
          place X10_TEMP104 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 362
final x10.
          lang.
          place X10_TEMP6 =
          (X10_TEMP104);
        
//#line 363
final x10.
          lang.
          dist X10_TEMP107 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                tempregion,
                X10_TEMP6)));
        
//#line 365
final x10.
          lang.
          dist tempdist =
          (x10.
            lang.
            dist)
            ((X10_TEMP107));
        
//#line 366
final int X10_TEMP110 =
          (10000);
        
//#line 368
int j =
          (X10_TEMP110);
        
//#line 369
/* template:forloop-mult { */{
        x10.lang.region __var9__ = (x10.lang.region) tempdist.
                                                       region;
        if (__var9__.size() > 0 && (__var9__ instanceof x10.array.MultiDimRegion || __var9__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var10__ = __var9__.rank(0).low(), __var11__ = __var9__.rank(0).high(); __var10__ <= __var11__; __var10__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var10__;
        /* } */
        /* } */
{
            
//#line 370
Program0.
                           Program_Series_setSize(
                           X10_TEMP0,
                           i);
            
//#line 371
final int X10_TEMP116 =
              (100);
            
//#line 373
final int X10_TEMP13 =
              (X10_TEMP116);
            
//#line 374
final double X10_TEMP121 =
              (java.
                 lang.
                 Math.
                 pow(
                 X10_TEMP13,
                 i));
            
//#line 376
final double X10_TEMP14 =
              (X10_TEMP121);
            
//#line 377
final double X10_TEMP124 =
              (j *
                 X10_TEMP14);
            
//#line 379
final double X10_TEMP16 =
              (X10_TEMP124);
            
//#line 380
final int X10_TEMP127 =
              ((int)
                 X10_TEMP16);
            
//#line 382
final int X10_TEMP18 =
              (X10_TEMP127);
            
//#line 383
Program0.
                           Program_Series_initialise(
                           X10_TEMP0,
                           X10_TEMP18);
            
//#line 384
Program0.
                           Program_Series_kernel(
                           X10_TEMP0);
            
//#line 385
Program0.
                           Program_Series_validate(
                           X10_TEMP0);
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var1____ = (__var9__).iterator(); __var1____.hasNext(); ) {
        	final  x10.
          lang.
          point __var1__ = (x10.
          lang.
          point) __var1____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var1__).get(0))/* } */;/* } */
{
            
//#line 370
Program0.
                           Program_Series_setSize(
                           X10_TEMP0,
                           i);
            
//#line 371
final int X10_TEMP116 =
              (100);
            
//#line 373
final int X10_TEMP13 =
              (X10_TEMP116);
            
//#line 374
final double X10_TEMP121 =
              (java.
                 lang.
                 Math.
                 pow(
                 X10_TEMP13,
                 i));
            
//#line 376
final double X10_TEMP14 =
              (X10_TEMP121);
            
//#line 377
final double X10_TEMP124 =
              (j *
                 X10_TEMP14);
            
//#line 379
final double X10_TEMP16 =
              (X10_TEMP124);
            
//#line 380
final int X10_TEMP127 =
              ((int)
                 X10_TEMP16);
            
//#line 382
final int X10_TEMP18 =
              (X10_TEMP127);
            
//#line 383
Program0.
                           Program_Series_initialise(
                           X10_TEMP0,
                           X10_TEMP18);
            
//#line 384
Program0.
                           Program_Series_kernel(
                           X10_TEMP0);
            
//#line 385
Program0.
                           Program_Series_validate(
                           X10_TEMP0);
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 387
Program0.
                       Program_Series_tidyup(
                       X10_TEMP0);
    }
    
    
//#line 389
public static void
                   Program_Series_buildTestData(
                   final Series X10_TEMP0) {
        
//#line 390
final int X10_TEMP93 =
          (0);
        
//#line 392
final int X10_TEMP3 =
          (X10_TEMP93);
        
//#line 393
final int X10_TEMP96 =
          (1);
        
//#line 395
final int X10_TEMP4 =
          (X10_TEMP96);
        
//#line 396
final int X10_TEMP99 =
          (0);
        
//#line 398
final int X10_TEMP9 =
          (X10_TEMP99);
        
//#line 399
final int X10_TEMP102 =
          (/* template:place-check { */((Series) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.array_rows);
        
//#line 401
final int X10_TEMP6 =
          (X10_TEMP102);
        
//#line 402
final int X10_TEMP105 =
          (1);
        
//#line 404
final int X10_TEMP7 =
          (X10_TEMP105);
        
//#line 405
final int X10_TEMP108 =
          (X10_TEMP6 -
             X10_TEMP7);
        
//#line 407
final int X10_TEMP10 =
          (X10_TEMP108);
        
//#line 408
final x10.
          lang.
          region X10_TEMP115 =
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
                  X10_TEMP4),
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP9,
                  X10_TEMP10))));
        
//#line 410
final x10.
          lang.
          region R =
          (x10.
            lang.
            region)
            ((X10_TEMP115));
        
//#line 411
final x10.
          lang.
          dist X10_TEMP119 =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 411
public x10.
                             lang.
                             dist
                             checkCast(
                             final x10.
                               lang.
                               dist x10_generated_objToCast) {
                  
//#line 411
return (((((((x10.
                                              lang.
                                              dist)
                                              x10_generated_objToCast)).
                                            rank() ==
                                            2)))
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
        
//#line 413
final x10.
          lang.
          dist X10_TEMP13 =
          (x10.
            lang.
            dist)
            ((X10_TEMP119));
        
//#line 414
final x10.
          lang.
          dist X10_TEMP122 =
          (x10.
            lang.
            dist)
            ((X10_TEMP13));
        
//#line 416
final x10.
          lang.
          dist d =
          (x10.
            lang.
            dist)
            ((X10_TEMP122));
        
//#line 417
final x10.
          lang.
          DoubleReferenceArray X10_TEMP125 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 419
final x10.
          lang.
          DoubleReferenceArray X10_TEMP15 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP125));
        
//#line 420
final x10.
          lang.
          DoubleReferenceArray X10_TEMP128 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP15));
        
//#line 422
final x10.
          lang.
          DoubleReferenceArray X10_TEMP18 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP128));
        
//#line 423
final x10.
          lang.
          DoubleReferenceArray X10_TEMP131 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP18));
        
//#line 425
final x10.
          lang.
          DoubleReferenceArray X10_TEMP134 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP131));
        
//#line 426
/* template:place-check { */((Series) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.testArray =
          ((X10_TEMP134));
    }
    
    
//#line 428
public static void
                   Program_Series_Do(
                   final Series X10_TEMP0) {
        
//#line 429
final x10.
          lang.
          DoubleReferenceArray X10_TEMP93 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Series) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.testArray));
        
//#line 431
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP93));
        
//#line 432
final int X10_TEMP96 =
          (0);
        
//#line 434
final int X10_TEMP4 =
          (X10_TEMP96);
        
//#line 435
final int X10_TEMP99 =
          (0);
        
//#line 437
final int X10_TEMP5 =
          (X10_TEMP99);
        
//#line 438
final double X10_TEMP102 =
          (0.0);
        
//#line 440
final double X10_TEMP6 =
          (X10_TEMP102);
        
//#line 441
final double X10_TEMP105 =
          ((double)
             X10_TEMP6);
        
//#line 443
final double X10_TEMP14 =
          (X10_TEMP105);
        
//#line 444
final double X10_TEMP108 =
          (2.0);
        
//#line 446
final double X10_TEMP8 =
          (X10_TEMP108);
        
//#line 447
final double X10_TEMP111 =
          ((double)
             X10_TEMP8);
        
//#line 449
final double X10_TEMP15 =
          (X10_TEMP111);
        
//#line 450
final int X10_TEMP114 =
          (1000);
        
//#line 452
final int X10_TEMP16 =
          (X10_TEMP114);
        
//#line 453
final double X10_TEMP117 =
          (0.0);
        
//#line 455
final double X10_TEMP11 =
          (X10_TEMP117);
        
//#line 456
final double X10_TEMP120 =
          ((double)
             X10_TEMP11);
        
//#line 458
final double X10_TEMP17 =
          (X10_TEMP120);
        
//#line 459
final int X10_TEMP123 =
          (0);
        
//#line 461
final int X10_TEMP18 =
          (X10_TEMP123);
        
//#line 462
final double X10_TEMP132 =
          (Program0.
             Program_Series_TrapezoidIntegrate(
             X10_TEMP0,
             X10_TEMP14,
             X10_TEMP15,
             X10_TEMP16,
             X10_TEMP17,
             X10_TEMP18));
        
//#line 464
final double X10_TEMP20 =
          (X10_TEMP132);
        
//#line 465
final double X10_TEMP135 =
          (2.0);
        
//#line 467
final double X10_TEMP19 =
          (X10_TEMP135);
        
//#line 468
final double X10_TEMP138 =
          ((double)
             X10_TEMP19);
        
//#line 470
final double X10_TEMP21 =
          (X10_TEMP138);
        
//#line 471
final double X10_TEMP141 =
          (X10_TEMP20 /
             X10_TEMP21);
        
//#line 473
final double X10_TEMP24 =
          (X10_TEMP141);
        
//#line 474
final double X10_TEMP144 =
          (X10_TEMP24);
        
//#line 476
final double X10_TEMP25 =
          (X10_TEMP144);
        
//#line 477
final double X10_TEMP149 =
          (X10_TEMP25);
        
//#line 479
final double X10_TEMP152 =
          (X10_TEMP149);
        
//#line 480
/* template:array_set { */(X10_TEMP1).set((X10_TEMP152),/* Join: { */X10_TEMP4,X10_TEMP5/* } */)/* } */;
        
//#line 481
final double X10_TEMP154 =
          (3.141592653589793);
        
//#line 483
final double X10_TEMP26 =
          (X10_TEMP154);
        
//#line 484
final double X10_TEMP157 =
          ((double)
             X10_TEMP26);
        
//#line 486
final double omega =
          (X10_TEMP157);
        
//#line 487
final x10.
          lang.
          dist X10_TEMP160 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                UNIQUE));
        
//#line 489
final x10.
          lang.
          dist X10_TEMP28 =
          (x10.
            lang.
            dist)
            ((X10_TEMP160));
        
//#line 490
final x10.
          lang.
          dist X10_TEMP163 =
          (x10.
            lang.
            dist)
            ((X10_TEMP28));
        
//#line 492
final x10.
          lang.
          dist U =
          (x10.
            lang.
            dist)
            ((X10_TEMP163));
        
//#line 493
final x10.
          lang.
          DoubleReferenceArray X10_TEMP166 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Series) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.testArray));
        
//#line 495
final x10.
          lang.
          DoubleReferenceArray tA =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP166));
        
//#line 496
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 497
/* template:forloop { */
            for (java.util.Iterator p__ = (U.
                                             region).iterator(); p__.hasNext(); ) {
            	final  x10.
              lang.
              point p = (x10.
              lang.
              point) p__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 498
final x10.
                  lang.
                  dist X10_TEMP170 =
                  (x10.
                    lang.
                    dist)
                    ((U.
                        distribution));
                
//#line 500
final x10.
                  lang.
                  dist X10_TEMP32 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP170));
                
//#line 501
final x10.
                  lang.
                  place X10_TEMP33 =
                  (X10_TEMP32.
                     get(
                     p));
                
//#line 502
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP33)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 503
final int X10_TEMP176 =
                      (0);
                    
//#line 505
int ilow =
                      (X10_TEMP176);
                    
//#line 506
final x10.
                      lang.
                      place X10_TEMP180 =
                      (U.
                         get(
                         p));
                    
//#line 508
final x10.
                      lang.
                      place X10_TEMP36 =
                      (X10_TEMP180);
                    
//#line 509
final boolean X10_TEMP38 =
                      (X10_TEMP36.
                         isFirst());
                    
//#line 510
if (X10_TEMP38) {
                        
//#line 511
final int X10_TEMP185 =
                          (1);
                        
//#line 513
final int X10_TEMP40 =
                          (X10_TEMP185);
                        
//#line 514
final int X10_TEMP188 =
                          (X10_TEMP40);
                        
//#line 516
ilow =
                          ((X10_TEMP188));
                    } else {
                        
//#line 519
final int X10_TEMP191 =
                          (0);
                        
//#line 521
final int X10_TEMP42 =
                          (X10_TEMP191);
                        
//#line 522
final int X10_TEMP194 =
                          (X10_TEMP42);
                        
//#line 524
ilow =
                          ((X10_TEMP194));
                    }
                    
//#line 526
final x10.
                      lang.
                      dist X10_TEMP197 =
                      (x10.
                        lang.
                        dist)
                        ((tA.
                            distribution));
                    
//#line 528
final x10.
                      lang.
                      dist X10_TEMP43 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP197));
                    
//#line 529
final x10.
                      lang.
                      place X10_TEMP200 =
                      (/* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 531
final x10.
                      lang.
                      place X10_TEMP44 =
                      (X10_TEMP200);
                    
//#line 532
final x10.
                      lang.
                      dist X10_TEMP203 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP43.
                            restriction(
                            X10_TEMP44)));
                    
//#line 534
final x10.
                      lang.
                      dist X10_TEMP46 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP203));
                    
//#line 535
/* template:forloop-mult { */{
                    x10.lang.region __var13__ = (x10.lang.region) X10_TEMP46.
                                                                    region;
                    if (__var13__.size() > 0 && (__var13__ instanceof x10.array.MultiDimRegion || __var13__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var14__ = __var13__.rank(0).low(), __var15__ = __var13__.rank(0).high(); __var14__ <= __var15__; __var14__++)
                    /* } */
                    /* template:forloop-mult-each { */
                    for (int __var16__ = __var13__.rank(1).low(), __var17__ = __var13__.rank(1).high(); __var16__ <= __var17__; __var16__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int n = __var14__;
                    /* } */
                    /* template:final-var-assign { */
                    final int i = __var16__;
                    /* } */
                    /* } */
/* Join: { *//* template:point-create { */
                    final  x10.
                      lang.
                      point tempP = point.factory.point(/* Join: { */__var14__,__var16__/* } */);/* } */
{
                        
//#line 536
final boolean X10_TEMP48 =
                          (i >=
                             ilow);
                        
//#line 537
if (X10_TEMP48) {
                            
//#line 538
final int X10_TEMP209 =
                              (0);
                            
//#line 540
final int X10_TEMP49 =
                              (X10_TEMP209);
                            
//#line 541
final boolean X10_TEMP51 =
                              (n ==
                                 X10_TEMP49);
                            
//#line 542
if (X10_TEMP51) {
                                
//#line 543
final int X10_TEMP214 =
                                  (0);
                                
//#line 545
final int X10_TEMP54 =
                                  (X10_TEMP214);
                                
//#line 546
final double X10_TEMP217 =
                                  (0.0);
                                
//#line 548
final double X10_TEMP55 =
                                  (X10_TEMP217);
                                
//#line 549
final double X10_TEMP220 =
                                  ((double)
                                     X10_TEMP55);
                                
//#line 551
final double X10_TEMP63 =
                                  (X10_TEMP220);
                                
//#line 552
final double X10_TEMP223 =
                                  (2.0);
                                
//#line 554
final double X10_TEMP57 =
                                  (X10_TEMP223);
                                
//#line 555
final double X10_TEMP226 =
                                  ((double)
                                     X10_TEMP57);
                                
//#line 557
final double X10_TEMP64 =
                                  (X10_TEMP226);
                                
//#line 558
final int X10_TEMP229 =
                                  (1000);
                                
//#line 560
final int X10_TEMP65 =
                                  (X10_TEMP229);
                                
//#line 561
final double X10_TEMP232 =
                                  ((double)
                                     i);
                                
//#line 563
final double X10_TEMP60 =
                                  (X10_TEMP232);
                                
//#line 564
final double X10_TEMP235 =
                                  (omega *
                                     X10_TEMP60);
                                
//#line 566
final double X10_TEMP66 =
                                  (X10_TEMP235);
                                
//#line 567
final int X10_TEMP238 =
                                  (1);
                                
//#line 569
final int X10_TEMP67 =
                                  (X10_TEMP238);
                                
//#line 570
final double X10_TEMP247 =
                                  (Program0.
                                     Program_Series_TrapezoidIntegrate(
                                     X10_TEMP0,
                                     X10_TEMP63,
                                     X10_TEMP64,
                                     X10_TEMP65,
                                     X10_TEMP66,
                                     X10_TEMP67));
                                
//#line 572
final double X10_TEMP70 =
                                  (X10_TEMP247);
                                
//#line 573
final double X10_TEMP250 =
                                  (X10_TEMP70);
                                
//#line 575
final double X10_TEMP71 =
                                  (X10_TEMP250);
                                
//#line 576
final double X10_TEMP255 =
                                  (X10_TEMP71);
                                
//#line 578
final double X10_TEMP258 =
                                  (X10_TEMP255);
                                
//#line 579
/* template:array_set { */(tA).set((X10_TEMP258),/* Join: { */X10_TEMP54,i/* } */)/* } */;
                            } else {
                                
//#line 582
final double X10_TEMP260 =
                                  (0.0);
                                
//#line 584
final double X10_TEMP74 =
                                  (X10_TEMP260);
                                
//#line 585
final double X10_TEMP263 =
                                  ((double)
                                     X10_TEMP74);
                                
//#line 587
final double X10_TEMP82 =
                                  (X10_TEMP263);
                                
//#line 588
final double X10_TEMP266 =
                                  (2.0);
                                
//#line 590
final double X10_TEMP76 =
                                  (X10_TEMP266);
                                
//#line 591
final double X10_TEMP269 =
                                  ((double)
                                     X10_TEMP76);
                                
//#line 593
final double X10_TEMP83 =
                                  (X10_TEMP269);
                                
//#line 594
final int X10_TEMP272 =
                                  (1000);
                                
//#line 596
final int X10_TEMP84 =
                                  (X10_TEMP272);
                                
//#line 597
final double X10_TEMP275 =
                                  ((double)
                                     i);
                                
//#line 599
final double X10_TEMP79 =
                                  (X10_TEMP275);
                                
//#line 600
final double X10_TEMP278 =
                                  (omega *
                                     X10_TEMP79);
                                
//#line 602
final double X10_TEMP85 =
                                  (X10_TEMP278);
                                
//#line 603
final int X10_TEMP281 =
                                  (2);
                                
//#line 605
final int X10_TEMP86 =
                                  (X10_TEMP281);
                                
//#line 606
final double X10_TEMP290 =
                                  (Program0.
                                     Program_Series_TrapezoidIntegrate(
                                     X10_TEMP0,
                                     X10_TEMP82,
                                     X10_TEMP83,
                                     X10_TEMP84,
                                     X10_TEMP85,
                                     X10_TEMP86));
                                
//#line 608
final double X10_TEMP89 =
                                  (X10_TEMP290);
                                
//#line 609
final double X10_TEMP293 =
                                  (X10_TEMP89);
                                
//#line 611
final double X10_TEMP90 =
                                  (X10_TEMP293);
                                
//#line 612
final double X10_TEMP298 =
                                  (X10_TEMP90);
                                
//#line 614
final double X10_TEMP301 =
                                  (X10_TEMP298);
                                
//#line 615
/* template:array_set { */(tA).set((X10_TEMP301),/* Join: { */n,i/* } */)/* } */;
                            }
                        }
                    }/* } *//* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator tempP__ = (__var13__).iterator(); tempP__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point tempP = (x10.
                      lang.
                      point) tempP__.next();
                    	/* Join: { *//* Join: { */final int n =
                      /* template:array_get { */((tempP).get(0))/* } */;
final int i =
                      /* template:array_get { */((tempP).get(1))/* } */;/* } */
{
                        
//#line 536
final boolean X10_TEMP48 =
                          (i >=
                             ilow);
                        
//#line 537
if (X10_TEMP48) {
                            
//#line 538
final int X10_TEMP209 =
                              (0);
                            
//#line 540
final int X10_TEMP49 =
                              (X10_TEMP209);
                            
//#line 541
final boolean X10_TEMP51 =
                              (n ==
                                 X10_TEMP49);
                            
//#line 542
if (X10_TEMP51) {
                                
//#line 543
final int X10_TEMP214 =
                                  (0);
                                
//#line 545
final int X10_TEMP54 =
                                  (X10_TEMP214);
                                
//#line 546
final double X10_TEMP217 =
                                  (0.0);
                                
//#line 548
final double X10_TEMP55 =
                                  (X10_TEMP217);
                                
//#line 549
final double X10_TEMP220 =
                                  ((double)
                                     X10_TEMP55);
                                
//#line 551
final double X10_TEMP63 =
                                  (X10_TEMP220);
                                
//#line 552
final double X10_TEMP223 =
                                  (2.0);
                                
//#line 554
final double X10_TEMP57 =
                                  (X10_TEMP223);
                                
//#line 555
final double X10_TEMP226 =
                                  ((double)
                                     X10_TEMP57);
                                
//#line 557
final double X10_TEMP64 =
                                  (X10_TEMP226);
                                
//#line 558
final int X10_TEMP229 =
                                  (1000);
                                
//#line 560
final int X10_TEMP65 =
                                  (X10_TEMP229);
                                
//#line 561
final double X10_TEMP232 =
                                  ((double)
                                     i);
                                
//#line 563
final double X10_TEMP60 =
                                  (X10_TEMP232);
                                
//#line 564
final double X10_TEMP235 =
                                  (omega *
                                     X10_TEMP60);
                                
//#line 566
final double X10_TEMP66 =
                                  (X10_TEMP235);
                                
//#line 567
final int X10_TEMP238 =
                                  (1);
                                
//#line 569
final int X10_TEMP67 =
                                  (X10_TEMP238);
                                
//#line 570
final double X10_TEMP247 =
                                  (Program0.
                                     Program_Series_TrapezoidIntegrate(
                                     X10_TEMP0,
                                     X10_TEMP63,
                                     X10_TEMP64,
                                     X10_TEMP65,
                                     X10_TEMP66,
                                     X10_TEMP67));
                                
//#line 572
final double X10_TEMP70 =
                                  (X10_TEMP247);
                                
//#line 573
final double X10_TEMP250 =
                                  (X10_TEMP70);
                                
//#line 575
final double X10_TEMP71 =
                                  (X10_TEMP250);
                                
//#line 576
final double X10_TEMP255 =
                                  (X10_TEMP71);
                                
//#line 578
final double X10_TEMP258 =
                                  (X10_TEMP255);
                                
//#line 579
/* template:array_set { */(tA).set((X10_TEMP258),/* Join: { */X10_TEMP54,i/* } */)/* } */;
                            } else {
                                
//#line 582
final double X10_TEMP260 =
                                  (0.0);
                                
//#line 584
final double X10_TEMP74 =
                                  (X10_TEMP260);
                                
//#line 585
final double X10_TEMP263 =
                                  ((double)
                                     X10_TEMP74);
                                
//#line 587
final double X10_TEMP82 =
                                  (X10_TEMP263);
                                
//#line 588
final double X10_TEMP266 =
                                  (2.0);
                                
//#line 590
final double X10_TEMP76 =
                                  (X10_TEMP266);
                                
//#line 591
final double X10_TEMP269 =
                                  ((double)
                                     X10_TEMP76);
                                
//#line 593
final double X10_TEMP83 =
                                  (X10_TEMP269);
                                
//#line 594
final int X10_TEMP272 =
                                  (1000);
                                
//#line 596
final int X10_TEMP84 =
                                  (X10_TEMP272);
                                
//#line 597
final double X10_TEMP275 =
                                  ((double)
                                     i);
                                
//#line 599
final double X10_TEMP79 =
                                  (X10_TEMP275);
                                
//#line 600
final double X10_TEMP278 =
                                  (omega *
                                     X10_TEMP79);
                                
//#line 602
final double X10_TEMP85 =
                                  (X10_TEMP278);
                                
//#line 603
final int X10_TEMP281 =
                                  (2);
                                
//#line 605
final int X10_TEMP86 =
                                  (X10_TEMP281);
                                
//#line 606
final double X10_TEMP290 =
                                  (Program0.
                                     Program_Series_TrapezoidIntegrate(
                                     X10_TEMP0,
                                     X10_TEMP82,
                                     X10_TEMP83,
                                     X10_TEMP84,
                                     X10_TEMP85,
                                     X10_TEMP86));
                                
//#line 608
final double X10_TEMP89 =
                                  (X10_TEMP290);
                                
//#line 609
final double X10_TEMP293 =
                                  (X10_TEMP89);
                                
//#line 611
final double X10_TEMP90 =
                                  (X10_TEMP293);
                                
//#line 612
final double X10_TEMP298 =
                                  (X10_TEMP90);
                                
//#line 614
final double X10_TEMP301 =
                                  (X10_TEMP298);
                                
//#line 615
/* template:array_set { */(tA).set((X10_TEMP301),/* Join: { */n,i/* } */)/* } */;
                            }
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
        	} catch (Throwable tmp12) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp12);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 623
public static double
                   Program_Series_TrapezoidIntegrate(
                   final Series X10_TEMP0,
                   final double x0,
                   final double x1,
                   final int nsteps,
                   final double omegan,
                   final int select) {
        
//#line 624
double X10_TEMP1 =
          (x0);
        
//#line 625
double X10_TEMP2 =
          (x1);
        
//#line 626
int X10_TEMP3 =
          (nsteps);
        
//#line 627
double X10_TEMP4 =
          (omegan);
        
//#line 628
int X10_TEMP5 =
          (select);
        
//#line 629
final double X10_TEMP98 =
          (0.0);
        
//#line 631
double x =
          (X10_TEMP98);
        
//#line 632
final double X10_TEMP101 =
          (0.0);
        
//#line 634
double dx =
          (X10_TEMP101);
        
//#line 635
final double X10_TEMP104 =
          (0.0);
        
//#line 637
double rvalue =
          (X10_TEMP104);
        
//#line 638
final double X10_TEMP107 =
          (X10_TEMP1);
        
//#line 640
x =
          ((X10_TEMP107));
        
//#line 641
final double X10_TEMP110 =
          (X10_TEMP2 -
             X10_TEMP1);
        
//#line 643
final double X10_TEMP11 =
          (X10_TEMP110);
        
//#line 644
final double X10_TEMP113 =
          ((double)
             X10_TEMP3);
        
//#line 646
final double X10_TEMP12 =
          (X10_TEMP113);
        
//#line 647
final double X10_TEMP116 =
          (X10_TEMP11 /
             X10_TEMP12);
        
//#line 649
final double X10_TEMP14 =
          (X10_TEMP116);
        
//#line 650
final double X10_TEMP119 =
          (X10_TEMP14);
        
//#line 652
dx =
          ((X10_TEMP119));
        
//#line 653
final double X10_TEMP126 =
          (Program0.
             Program_Series_thefunction(
             X10_TEMP0,
             X10_TEMP1,
             X10_TEMP4,
             X10_TEMP5));
        
//#line 655
final double X10_TEMP19 =
          (X10_TEMP126);
        
//#line 656
final double X10_TEMP129 =
          (2.0);
        
//#line 658
final double X10_TEMP18 =
          (X10_TEMP129);
        
//#line 659
final double X10_TEMP132 =
          ((double)
             X10_TEMP18);
        
//#line 661
final double X10_TEMP20 =
          (X10_TEMP132);
        
//#line 662
final double X10_TEMP135 =
          (X10_TEMP19 /
             X10_TEMP20);
        
//#line 664
final double X10_TEMP22 =
          (X10_TEMP135);
        
//#line 665
final double X10_TEMP138 =
          (X10_TEMP22);
        
//#line 667
rvalue =
          ((X10_TEMP138));
        
//#line 668
final int X10_TEMP141 =
          (1);
        
//#line 670
final int X10_TEMP23 =
          (X10_TEMP141);
        
//#line 671
final boolean X10_TEMP25 =
          (X10_TEMP3 !=
             X10_TEMP23);
        
//#line 672
if (X10_TEMP25) {
            
//#line 673
final int X10_TEMP146 =
              (X10_TEMP3);
            
//#line 675
final int X10_TEMP26 =
              (X10_TEMP146);
            
//#line 676
final int X10_TEMP27 =
              (1);
            
//#line 677
final int X10_TEMP150 =
              (X10_TEMP3 -
                 X10_TEMP27);
            
//#line 678
X10_TEMP3 =
              ((X10_TEMP150));
            
//#line 679
final int X10_TEMP28 =
              (1);
            
//#line 680
final int X10_TEMP153 =
              (X10_TEMP3 -
                 X10_TEMP28);
            
//#line 681
X10_TEMP3 =
              ((X10_TEMP153));
            
//#line 682
final int X10_TEMP155 =
              (0);
            
//#line 684
final int X10_TEMP29 =
              (X10_TEMP155);
            
//#line 685
boolean X10_TEMP34 =
              (X10_TEMP3 >
                 X10_TEMP29);
            
//#line 686
boolean X10_TEMP160 =
              X10_TEMP34;
            
//#line 687
while (X10_TEMP160) {
                
//#line 688
final double X10_TEMP162 =
                  (x +
                     dx);
                
//#line 690
x =
                  ((X10_TEMP162));
                
//#line 691
final double X10_TEMP169 =
                  (Program0.
                     Program_Series_thefunction(
                     X10_TEMP0,
                     x,
                     X10_TEMP4,
                     X10_TEMP5));
                
//#line 693
final double X10_TEMP40 =
                  (X10_TEMP169);
                
//#line 694
final double X10_TEMP172 =
                  (rvalue +
                     X10_TEMP40);
                
//#line 696
rvalue =
                  ((X10_TEMP172));
                
//#line 697
final int X10_TEMP31 =
                  (1);
                
//#line 698
final int X10_TEMP176 =
                  (X10_TEMP3 -
                     X10_TEMP31);
                
//#line 699
X10_TEMP3 =
                  ((X10_TEMP176));
                
//#line 700
final int X10_TEMP178 =
                  (0);
                
//#line 702
final int X10_TEMP32 =
                  (X10_TEMP178);
                
//#line 703
final boolean X10_TEMP181 =
                  (X10_TEMP3 >
                     X10_TEMP32);
                
//#line 704
X10_TEMP34 =
                  ((X10_TEMP181));
                
//#line 705
X10_TEMP160 =
                  X10_TEMP34;
            }
        }
        
//#line 708
final double X10_TEMP187 =
          (Program0.
             Program_Series_thefunction(
             X10_TEMP0,
             X10_TEMP2,
             X10_TEMP4,
             X10_TEMP5));
        
//#line 710
final double X10_TEMP45 =
          (X10_TEMP187);
        
//#line 711
final double X10_TEMP190 =
          (2.0);
        
//#line 713
final double X10_TEMP44 =
          (X10_TEMP190);
        
//#line 714
final double X10_TEMP193 =
          ((double)
             X10_TEMP44);
        
//#line 716
final double X10_TEMP46 =
          (X10_TEMP193);
        
//#line 717
final double X10_TEMP196 =
          (X10_TEMP45 /
             X10_TEMP46);
        
//#line 719
final double X10_TEMP47 =
          (X10_TEMP196);
        
//#line 720
final double X10_TEMP199 =
          (rvalue +
             X10_TEMP47);
        
//#line 722
final double X10_TEMP49 =
          (X10_TEMP199);
        
//#line 723
final double X10_TEMP202 =
          (X10_TEMP49 *
             dx);
        
//#line 725
final double X10_TEMP51 =
          (X10_TEMP202);
        
//#line 726
final double X10_TEMP205 =
          (X10_TEMP51);
        
//#line 728
rvalue =
          ((X10_TEMP205));
        
//#line 729
final double X10_TEMP208 =
          (rvalue);
        
//#line 731
final double X10_TEMP53 =
          (X10_TEMP208);
        
//#line 732
return X10_TEMP53;
    }
    
    
//#line 734
public static double
                   Program_Series_thefunction(
                   final Series X10_TEMP0,
                   final double x,
                   final double omegan,
                   final int select) {
        
//#line 735
double X10_TEMP1 =
          (x);
        
//#line 736
double X10_TEMP2 =
          (omegan);
        
//#line 737
int X10_TEMP3 =
          (select);
        
//#line 738
final int X10_TEMP6 =
          (0);
        
//#line 739
final int X10_TEMP16 =
          (1);
        
//#line 740
final int X10_TEMP30 =
          (2);
        
//#line 741
switch (X10_TEMP3) {
            
//#line 742
case X10_TEMP6:
                {
                    
//#line 744
final double X10_TEMP101 =
                      (1.0);
                    
//#line 746
final double X10_TEMP7 =
                      (X10_TEMP101);
                    
//#line 747
final double X10_TEMP104 =
                      ((double)
                         X10_TEMP7);
                    
//#line 749
final double X10_TEMP8 =
                      (X10_TEMP104);
                    
//#line 750
final double X10_TEMP107 =
                      (X10_TEMP1 +
                         X10_TEMP8);
                    
//#line 752
final double X10_TEMP11 =
                      (X10_TEMP107);
                    
//#line 753
final double X10_TEMP112 =
                      (java.
                         lang.
                         Math.
                         pow(
                         X10_TEMP11,
                         X10_TEMP1));
                    
//#line 755
final double X10_TEMP13 =
                      (X10_TEMP112);
                    
//#line 756
return X10_TEMP13;
                }
            
//#line 758
case X10_TEMP16:
                {
                    
//#line 760
final double X10_TEMP117 =
                      (1.0);
                    
//#line 762
final double X10_TEMP17 =
                      (X10_TEMP117);
                    
//#line 763
final double X10_TEMP120 =
                      ((double)
                         X10_TEMP17);
                    
//#line 765
final double X10_TEMP18 =
                      (X10_TEMP120);
                    
//#line 766
final double X10_TEMP123 =
                      (X10_TEMP1 +
                         X10_TEMP18);
                    
//#line 768
final double X10_TEMP21 =
                      (X10_TEMP123);
                    
//#line 769
final double X10_TEMP128 =
                      (java.
                         lang.
                         Math.
                         pow(
                         X10_TEMP21,
                         X10_TEMP1));
                    
//#line 771
final double X10_TEMP24 =
                      (X10_TEMP128);
                    
//#line 772
final double X10_TEMP131 =
                      (X10_TEMP2 *
                         X10_TEMP1);
                    
//#line 774
final double X10_TEMP23 =
                      (X10_TEMP131);
                    
//#line 775
final double X10_TEMP135 =
                      (java.
                         lang.
                         Math.
                         cos(
                         X10_TEMP23));
                    
//#line 777
final double X10_TEMP25 =
                      (X10_TEMP135);
                    
//#line 778
final double X10_TEMP138 =
                      (X10_TEMP24 *
                         X10_TEMP25);
                    
//#line 780
final double X10_TEMP27 =
                      (X10_TEMP138);
                    
//#line 781
return X10_TEMP27;
                }
            
//#line 783
case X10_TEMP30:
                {
                    
//#line 785
final double X10_TEMP143 =
                      (1.0);
                    
//#line 787
final double X10_TEMP31 =
                      (X10_TEMP143);
                    
//#line 788
final double X10_TEMP146 =
                      ((double)
                         X10_TEMP31);
                    
//#line 790
final double X10_TEMP32 =
                      (X10_TEMP146);
                    
//#line 791
final double X10_TEMP149 =
                      (X10_TEMP1 +
                         X10_TEMP32);
                    
//#line 793
final double X10_TEMP35 =
                      (X10_TEMP149);
                    
//#line 794
final double X10_TEMP154 =
                      (java.
                         lang.
                         Math.
                         pow(
                         X10_TEMP35,
                         X10_TEMP1));
                    
//#line 796
final double X10_TEMP38 =
                      (X10_TEMP154);
                    
//#line 797
final double X10_TEMP157 =
                      (X10_TEMP2 *
                         X10_TEMP1);
                    
//#line 799
final double X10_TEMP37 =
                      (X10_TEMP157);
                    
//#line 800
final double X10_TEMP161 =
                      (java.
                         lang.
                         Math.
                         sin(
                         X10_TEMP37));
                    
//#line 802
final double X10_TEMP39 =
                      (X10_TEMP161);
                    
//#line 803
final double X10_TEMP164 =
                      (X10_TEMP38 *
                         X10_TEMP39);
                    
//#line 805
final double X10_TEMP41 =
                      (X10_TEMP164);
                    
//#line 806
return X10_TEMP41;
                }
        }
        
//#line 809
final double X10_TEMP168 =
          (0.0);
        
//#line 811
final double X10_TEMP44 =
          (X10_TEMP168);
        
//#line 812
return X10_TEMP44;
    }
    
    
//#line 814
public static void
                   Program_Series_freeTestData(
                   final Series X10_TEMP0) {
        
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
    
    
//#line 819
public Program() {
        
//#line 819
super();
    }
}

class Series
extends x10.
  lang.
  Object
{
    
//#line 823
public int
      setsize;
    
//#line 824
public int
      array_rows;
    
//#line 825
public x10.
      lang.
      DoubleReferenceArray
      testArray;
    
    
//#line 828
public Series() {
        
//#line 828
super();
    }
}
