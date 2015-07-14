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
      _Program__Timer_max_counters =
      Program0.
        _Program__Timer_max_counters_init();
    
    
//#line 12
public static void
                  runMain(
                  ) {
        
//#line 13
Program0.
                      Program_runMain();
    }
    
    
//#line 15
public static int
                  _Program__Timer_max_counters_init(
                  ) {
        
//#line 17
final int X10_TEMP92 =
          (Program0.
             Program__Timer_max_counters_init());
        
//#line 18
return X10_TEMP92;
    }
    
    
//#line 20
public static void
                  Program_Series_setSize(
                  final Series X10_TEMP0,
                  final int setsize) {
        
//#line 21
final int X10_TEMP92 =
          (setsize);
        
//#line 23
final int X10_TEMP3 =
          (X10_TEMP92);
        
//#line 24
final int X10_TEMP95 =
          (X10_TEMP3);
        
//#line 26
final int X10_TEMP98 =
          (X10_TEMP95);
        
//#line 27
/* template:place-check { */((Series) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.setsize =
          ((X10_TEMP98));
    }
    
    
//#line 29
public static void
                  Program_Series_initialise(
                  final Series X10_TEMP0,
                  final int n) {
        
//#line 30
final int X10_TEMP92 =
          (n);
        
//#line 32
final int X10_TEMP3 =
          (X10_TEMP92);
        
//#line 33
final int X10_TEMP95 =
          (X10_TEMP3);
        
//#line 35
final int X10_TEMP98 =
          (X10_TEMP95);
        
//#line 36
/* template:place-check { */((Series) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.array_rows =
          ((X10_TEMP98));
        
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
final int X10_TEMP92 =
          (0);
        
//#line 45
final int X10_TEMP3 =
          (X10_TEMP92);
        
//#line 46
final int X10_TEMP95 =
          (0);
        
//#line 48
final int X10_TEMP4 =
          (X10_TEMP95);
        
//#line 49
final double X10_TEMP98 =
          (2.8729524964837996);
        
//#line 51
final double X10_TEMP7 =
          (X10_TEMP98);
        
//#line 52
final double X10_TEMP101 =
          (X10_TEMP7);
        
//#line 54
final double X10_TEMP8 =
          (X10_TEMP101);
        
//#line 55
final double X10_TEMP106 =
          (X10_TEMP8);
        
//#line 57
final double X10_TEMP109 =
          (X10_TEMP106);
        
//#line 58
/* template:array_set { */(ref).set((X10_TEMP109),/* Join: { */X10_TEMP3,X10_TEMP4/* } */)/* } */;
        
//#line 59
final int X10_TEMP111 =
          (0);
        
//#line 61
final int X10_TEMP11 =
          (X10_TEMP111);
        
//#line 62
final int X10_TEMP114 =
          (1);
        
//#line 64
final int X10_TEMP12 =
          (X10_TEMP114);
        
//#line 65
final double X10_TEMP117 =
          (0.0);
        
//#line 67
final double X10_TEMP15 =
          (X10_TEMP117);
        
//#line 68
final double X10_TEMP120 =
          (X10_TEMP15);
        
//#line 70
final double X10_TEMP16 =
          (X10_TEMP120);
        
//#line 71
final double X10_TEMP125 =
          (X10_TEMP16);
        
//#line 73
final double X10_TEMP128 =
          (X10_TEMP125);
        
//#line 74
/* template:array_set { */(ref).set((X10_TEMP128),/* Join: { */X10_TEMP11,X10_TEMP12/* } */)/* } */;
        
//#line 75
final int X10_TEMP130 =
          (1);
        
//#line 77
final int X10_TEMP19 =
          (X10_TEMP130);
        
//#line 78
final int X10_TEMP133 =
          (0);
        
//#line 80
final int X10_TEMP20 =
          (X10_TEMP133);
        
//#line 81
final double X10_TEMP136 =
          (1.1161046676147888);
        
//#line 83
final double X10_TEMP23 =
          (X10_TEMP136);
        
//#line 84
final double X10_TEMP139 =
          (X10_TEMP23);
        
//#line 86
final double X10_TEMP24 =
          (X10_TEMP139);
        
//#line 87
final double X10_TEMP144 =
          (X10_TEMP24);
        
//#line 89
final double X10_TEMP147 =
          (X10_TEMP144);
        
//#line 90
/* template:array_set { */(ref).set((X10_TEMP147),/* Join: { */X10_TEMP19,X10_TEMP20/* } */)/* } */;
        
//#line 91
final int X10_TEMP149 =
          (1);
        
//#line 93
final int X10_TEMP27 =
          (X10_TEMP149);
        
//#line 94
final int X10_TEMP152 =
          (1);
        
//#line 96
final int X10_TEMP28 =
          (X10_TEMP152);
        
//#line 97
final double X10_TEMP155 =
          (1.8819691893398025);
        
//#line 99
final double X10_TEMP29 =
          (X10_TEMP155);
        
//#line 100
final int X10_TEMP30 =
          (0);
        
//#line 101
final double X10_TEMP159 =
          (X10_TEMP30 -
             X10_TEMP29);
        
//#line 103
final double X10_TEMP33 =
          (X10_TEMP159);
        
//#line 104
final double X10_TEMP162 =
          (X10_TEMP33);
        
//#line 106
final double X10_TEMP34 =
          (X10_TEMP162);
        
//#line 107
final double X10_TEMP167 =
          (X10_TEMP34);
        
//#line 109
final double X10_TEMP170 =
          (X10_TEMP167);
        
//#line 110
/* template:array_set { */(ref).set((X10_TEMP170),/* Join: { */X10_TEMP27,X10_TEMP28/* } */)/* } */;
        
//#line 111
final int X10_TEMP172 =
          (2);
        
//#line 113
final int X10_TEMP37 =
          (X10_TEMP172);
        
//#line 114
final int X10_TEMP175 =
          (0);
        
//#line 116
final int X10_TEMP38 =
          (X10_TEMP175);
        
//#line 117
final double X10_TEMP178 =
          (0.34429060398168704);
        
//#line 119
final double X10_TEMP41 =
          (X10_TEMP178);
        
//#line 120
final double X10_TEMP181 =
          (X10_TEMP41);
        
//#line 122
final double X10_TEMP42 =
          (X10_TEMP181);
        
//#line 123
final double X10_TEMP186 =
          (X10_TEMP42);
        
//#line 125
final double X10_TEMP189 =
          (X10_TEMP186);
        
//#line 126
/* template:array_set { */(ref).set((X10_TEMP189),/* Join: { */X10_TEMP37,X10_TEMP38/* } */)/* } */;
        
//#line 127
final int X10_TEMP191 =
          (2);
        
//#line 129
final int X10_TEMP45 =
          (X10_TEMP191);
        
//#line 130
final int X10_TEMP194 =
          (1);
        
//#line 132
final int X10_TEMP46 =
          (X10_TEMP194);
        
//#line 133
final double X10_TEMP197 =
          (1.1645642623320958);
        
//#line 135
final double X10_TEMP47 =
          (X10_TEMP197);
        
//#line 136
final int X10_TEMP48 =
          (0);
        
//#line 137
final double X10_TEMP201 =
          (X10_TEMP48 -
             X10_TEMP47);
        
//#line 139
final double X10_TEMP51 =
          (X10_TEMP201);
        
//#line 140
final double X10_TEMP204 =
          (X10_TEMP51);
        
//#line 142
final double X10_TEMP52 =
          (X10_TEMP204);
        
//#line 143
final double X10_TEMP209 =
          (X10_TEMP52);
        
//#line 145
final double X10_TEMP212 =
          (X10_TEMP209);
        
//#line 146
/* template:array_set { */(ref).set((X10_TEMP212),/* Join: { */X10_TEMP45,X10_TEMP46/* } */)/* } */;
        
//#line 147
final int X10_TEMP214 =
          (3);
        
//#line 149
final int X10_TEMP55 =
          (X10_TEMP214);
        
//#line 150
final int X10_TEMP217 =
          (0);
        
//#line 152
final int X10_TEMP56 =
          (X10_TEMP217);
        
//#line 153
final double X10_TEMP220 =
          (0.15238898702519288);
        
//#line 155
final double X10_TEMP59 =
          (X10_TEMP220);
        
//#line 156
final double X10_TEMP223 =
          (X10_TEMP59);
        
//#line 158
final double X10_TEMP60 =
          (X10_TEMP223);
        
//#line 159
final double X10_TEMP228 =
          (X10_TEMP60);
        
//#line 161
final double X10_TEMP231 =
          (X10_TEMP228);
        
//#line 162
/* template:array_set { */(ref).set((X10_TEMP231),/* Join: { */X10_TEMP55,X10_TEMP56/* } */)/* } */;
        
//#line 163
final int X10_TEMP233 =
          (3);
        
//#line 165
final int X10_TEMP63 =
          (X10_TEMP233);
        
//#line 166
final int X10_TEMP236 =
          (1);
        
//#line 168
final int X10_TEMP64 =
          (X10_TEMP236);
        
//#line 169
final double X10_TEMP239 =
          (0.8143461113044298);
        
//#line 171
final double X10_TEMP65 =
          (X10_TEMP239);
        
//#line 172
final int X10_TEMP66 =
          (0);
        
//#line 173
final double X10_TEMP243 =
          (X10_TEMP66 -
             X10_TEMP65);
        
//#line 175
final double X10_TEMP69 =
          (X10_TEMP243);
        
//#line 176
final double X10_TEMP246 =
          (X10_TEMP69);
        
//#line 178
final double X10_TEMP70 =
          (X10_TEMP246);
        
//#line 179
final double X10_TEMP251 =
          (X10_TEMP70);
        
//#line 181
final double X10_TEMP254 =
          (X10_TEMP251);
        
//#line 182
/* template:array_set { */(ref).set((X10_TEMP254),/* Join: { */X10_TEMP63,X10_TEMP64/* } */)/* } */;
    }
    
    
//#line 184
public static void
                   Program_Series_validate(
                   final Series X10_TEMP0) {
        
//#line 185
final int X10_TEMP92 =
          (0);
        
//#line 187
final int X10_TEMP3 =
          (X10_TEMP92);
        
//#line 188
final int X10_TEMP95 =
          (3);
        
//#line 190
final int X10_TEMP4 =
          (X10_TEMP95);
        
//#line 191
final int X10_TEMP98 =
          (0);
        
//#line 193
final int X10_TEMP7 =
          (X10_TEMP98);
        
//#line 194
final int X10_TEMP101 =
          (1);
        
//#line 196
final int X10_TEMP8 =
          (X10_TEMP101);
        
//#line 197
final x10.
          lang.
          region X10_TEMP108 =
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
            ((X10_TEMP108));
        
//#line 200
final x10.
          lang.
          place X10_TEMP111 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 202
final x10.
          lang.
          place X10_TEMP10 =
          (X10_TEMP111);
        
//#line 203
final x10.
          lang.
          dist X10_TEMP114 =
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
            ((X10_TEMP114));
        
//#line 206
final x10.
          lang.
          DoubleReferenceArray X10_TEMP121 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(vd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public double apply(/* Join: { */x10.
                lang.
                point p0/* } */, double dummy) { {
                  
//#line 207
final double X10_TEMP117 =
                    (0.0);
                  
//#line 209
final double X10_TEMP13 =
                    (X10_TEMP117);
                  
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
            ((X10_TEMP121));
        
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
final int X10_TEMP127 =
              (i);
            
//#line 220
final int ii =
              (X10_TEMP127);
            
//#line 221
final int X10_TEMP130 =
              (j);
            
//#line 223
final int jj =
              (X10_TEMP130);
            
//#line 224
final int X10_TEMP133 =
              (0);
            
//#line 226
double cval =
              (X10_TEMP133);
            
//#line 227
final x10.
              lang.
              place X10_TEMP136 =
              (/* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 229
final x10.
              lang.
              place curr_place =
              (X10_TEMP136);
            
//#line 230
final int X10_TEMP139 =
              (0);
            
//#line 232
final int X10_TEMP23 =
              (X10_TEMP139);
            
//#line 233
final int X10_TEMP142 =
              (0);
            
//#line 235
final int X10_TEMP24 =
              (X10_TEMP142);
            
//#line 236
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
                      X10_TEMP23,
                      X10_TEMP24))));
            
//#line 238
final x10.
              lang.
              region tempr =
              (x10.
                lang.
                region)
                ((X10_TEMP147));
            
//#line 239
final x10.
              lang.
              place X10_TEMP150 =
              (/* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 241
final x10.
              lang.
              place X10_TEMP26 =
              (X10_TEMP150);
            
//#line 242
final x10.
              lang.
              dist X10_TEMP153 =
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
                ((X10_TEMP153));
            
//#line 245
final x10.
              lang.
              DoubleReferenceArray X10_TEMP160 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(tempvd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                  	public double apply(/* Join: { */x10.
                    lang.
                    point p0/* } */, double dummy) { {
                      
//#line 246
final double X10_TEMP156 =
                        (0.0);
                      
//#line 248
final double X10_TEMP29 =
                        (X10_TEMP156);
                      
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
                ((X10_TEMP160));
            
//#line 255
final x10.
              lang.
              DoubleReferenceArray X10_TEMP163 =
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
                ((X10_TEMP163));
            
//#line 258
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 259
final x10.
                  lang.
                  DoubleReferenceArray X10_TEMP166 =
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
                    ((X10_TEMP166));
                
//#line 262
final x10.
                  lang.
                  dist X10_TEMP169 =
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
                    ((X10_TEMP169));
                
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
final double X10_TEMP178 =
                      (/* template:array_get { */((tA).get(/* Join: { */jj,ii/* } */))/* } */);
                    
//#line 269
final double temp =
                      (X10_TEMP178);
                    
//#line 270
/* template:Async { */(x10.lang.Runtime.asPlace(curr_place)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 271
final int X10_TEMP182 =
                          (0);
                        
//#line 273
final int X10_TEMP43 =
                          (X10_TEMP182);
                        
//#line 274
final double X10_TEMP185 =
                          (temp);
                        
//#line 276
final double X10_TEMP46 =
                          (X10_TEMP185);
                        
//#line 277
final double X10_TEMP189 =
                          (X10_TEMP46);
                        
//#line 279
final double X10_TEMP192 =
                          (X10_TEMP189);
                        
//#line 280
/* template:array_set { */(tempref).set((X10_TEMP192),X10_TEMP43)/* } */;
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
final int X10_TEMP194 =
              (0);
            
//#line 286
final int X10_TEMP48 =
              (X10_TEMP194);
            
//#line 287
final double X10_TEMP198 =
              (/* template:array_get { */((tempref).get(X10_TEMP48))/* } */);
            
//#line 289
final double X10_TEMP50 =
              (X10_TEMP198);
            
//#line 290
final double X10_TEMP201 =
              (X10_TEMP50);
            
//#line 292
cval =
              ((X10_TEMP201));
            
//#line 293
final double X10_TEMP206 =
              (/* template:array_get { */((ref).get(/* Join: { */i,j/* } */))/* } */);
            
//#line 295
final double X10_TEMP53 =
              (X10_TEMP206);
            
//#line 296
final double X10_TEMP209 =
              (cval -
                 X10_TEMP53);
            
//#line 298
final double X10_TEMP55 =
              (X10_TEMP209);
            
//#line 299
final double X10_TEMP213 =
              (java.
                 lang.
                 Math.
                 abs(
                 X10_TEMP55));
            
//#line 301
double error =
              (X10_TEMP213);
            
//#line 302
final double X10_TEMP216 =
              (1.0E-12);
            
//#line 304
final double X10_TEMP57 =
              (X10_TEMP216);
            
//#line 305
final boolean X10_TEMP59 =
              (error >
                 X10_TEMP57);
            
//#line 306
if (X10_TEMP59) {
                
//#line 307
final java.
                  lang.
                  String X10_TEMP221 =
                  ("Validation failed for coefficient ");
                
//#line 309
final java.
                  lang.
                  String X10_TEMP60 =
                  (X10_TEMP221);
                
//#line 310
final java.
                  lang.
                  String X10_TEMP224 =
                  (X10_TEMP60 +
                   j);
                
//#line 312
final java.
                  lang.
                  String X10_TEMP61 =
                  (X10_TEMP224);
                
//#line 313
final java.
                  lang.
                  String X10_TEMP227 =
                  (",");
                
//#line 315
final java.
                  lang.
                  String X10_TEMP62 =
                  (X10_TEMP227);
                
//#line 316
final java.
                  lang.
                  String X10_TEMP230 =
                  (X10_TEMP61 +
                   X10_TEMP62);
                
//#line 318
final java.
                  lang.
                  String X10_TEMP63 =
                  (X10_TEMP230);
                
//#line 319
final java.
                  lang.
                  String X10_TEMP233 =
                  (X10_TEMP63 +
                   i);
                
//#line 321
final java.
                  lang.
                  String X10_TEMP65 =
                  (X10_TEMP233);
                
//#line 322
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println(X10_TEMP65);
                
//#line 323
final java.
                  lang.
                  String X10_TEMP237 =
                  ("Computed value = ");
                
//#line 325
final java.
                  lang.
                  String X10_TEMP66 =
                  (X10_TEMP237);
                
//#line 326
final java.
                  lang.
                  String X10_TEMP240 =
                  (X10_TEMP66 +
                   cval);
                
//#line 328
final java.
                  lang.
                  String X10_TEMP68 =
                  (X10_TEMP240);
                
//#line 329
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println(X10_TEMP68);
                
//#line 330
final java.
                  lang.
                  String X10_TEMP244 =
                  ("Reference value = ");
                
//#line 332
final java.
                  lang.
                  String X10_TEMP71 =
                  (X10_TEMP244);
                
//#line 333
final double X10_TEMP249 =
                  (/* template:array_get { */((ref).get(/* Join: { */i,j/* } */))/* } */);
                
//#line 335
final double X10_TEMP72 =
                  (X10_TEMP249);
                
//#line 336
final java.
                  lang.
                  String X10_TEMP252 =
                  (X10_TEMP71 +
                   X10_TEMP72);
                
//#line 338
final java.
                  lang.
                  String X10_TEMP74 =
                  (X10_TEMP252);
                
//#line 339
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println(X10_TEMP74);
                
//#line 340
final java.
                  lang.
                  String X10_TEMP256 =
                  ("Validation failed");
                
//#line 342
final java.
                  lang.
                  String X10_TEMP76 =
                  (X10_TEMP256);
                
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
final int X10_TEMP127 =
              (i);
            
//#line 220
final int ii =
              (X10_TEMP127);
            
//#line 221
final int X10_TEMP130 =
              (j);
            
//#line 223
final int jj =
              (X10_TEMP130);
            
//#line 224
final int X10_TEMP133 =
              (0);
            
//#line 226
double cval =
              (X10_TEMP133);
            
//#line 227
final x10.
              lang.
              place X10_TEMP136 =
              (/* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 229
final x10.
              lang.
              place curr_place =
              (X10_TEMP136);
            
//#line 230
final int X10_TEMP139 =
              (0);
            
//#line 232
final int X10_TEMP23 =
              (X10_TEMP139);
            
//#line 233
final int X10_TEMP142 =
              (0);
            
//#line 235
final int X10_TEMP24 =
              (X10_TEMP142);
            
//#line 236
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
                      X10_TEMP23,
                      X10_TEMP24))));
            
//#line 238
final x10.
              lang.
              region tempr =
              (x10.
                lang.
                region)
                ((X10_TEMP147));
            
//#line 239
final x10.
              lang.
              place X10_TEMP150 =
              (/* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 241
final x10.
              lang.
              place X10_TEMP26 =
              (X10_TEMP150);
            
//#line 242
final x10.
              lang.
              dist X10_TEMP153 =
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
                ((X10_TEMP153));
            
//#line 245
final x10.
              lang.
              DoubleReferenceArray X10_TEMP160 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(tempvd,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                  	public double apply(/* Join: { */x10.
                    lang.
                    point p0/* } */, double dummy) { {
                      
//#line 246
final double X10_TEMP156 =
                        (0.0);
                      
//#line 248
final double X10_TEMP29 =
                        (X10_TEMP156);
                      
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
                ((X10_TEMP160));
            
//#line 255
final x10.
              lang.
              DoubleReferenceArray X10_TEMP163 =
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
                ((X10_TEMP163));
            
//#line 258
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 259
final x10.
                  lang.
                  DoubleReferenceArray X10_TEMP166 =
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
                    ((X10_TEMP166));
                
//#line 262
final x10.
                  lang.
                  dist X10_TEMP169 =
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
                    ((X10_TEMP169));
                
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
final double X10_TEMP178 =
                      (/* template:array_get { */((tA).get(/* Join: { */jj,ii/* } */))/* } */);
                    
//#line 269
final double temp =
                      (X10_TEMP178);
                    
//#line 270
/* template:Async { */(x10.lang.Runtime.asPlace(curr_place)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 271
final int X10_TEMP182 =
                          (0);
                        
//#line 273
final int X10_TEMP43 =
                          (X10_TEMP182);
                        
//#line 274
final double X10_TEMP185 =
                          (temp);
                        
//#line 276
final double X10_TEMP46 =
                          (X10_TEMP185);
                        
//#line 277
final double X10_TEMP189 =
                          (X10_TEMP46);
                        
//#line 279
final double X10_TEMP192 =
                          (X10_TEMP189);
                        
//#line 280
/* template:array_set { */(tempref).set((X10_TEMP192),X10_TEMP43)/* } */;
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
final int X10_TEMP194 =
              (0);
            
//#line 286
final int X10_TEMP48 =
              (X10_TEMP194);
            
//#line 287
final double X10_TEMP198 =
              (/* template:array_get { */((tempref).get(X10_TEMP48))/* } */);
            
//#line 289
final double X10_TEMP50 =
              (X10_TEMP198);
            
//#line 290
final double X10_TEMP201 =
              (X10_TEMP50);
            
//#line 292
cval =
              ((X10_TEMP201));
            
//#line 293
final double X10_TEMP206 =
              (/* template:array_get { */((ref).get(/* Join: { */i,j/* } */))/* } */);
            
//#line 295
final double X10_TEMP53 =
              (X10_TEMP206);
            
//#line 296
final double X10_TEMP209 =
              (cval -
                 X10_TEMP53);
            
//#line 298
final double X10_TEMP55 =
              (X10_TEMP209);
            
//#line 299
final double X10_TEMP213 =
              (java.
                 lang.
                 Math.
                 abs(
                 X10_TEMP55));
            
//#line 301
double error =
              (X10_TEMP213);
            
//#line 302
final double X10_TEMP216 =
              (1.0E-12);
            
//#line 304
final double X10_TEMP57 =
              (X10_TEMP216);
            
//#line 305
final boolean X10_TEMP59 =
              (error >
                 X10_TEMP57);
            
//#line 306
if (X10_TEMP59) {
                
//#line 307
final java.
                  lang.
                  String X10_TEMP221 =
                  ("Validation failed for coefficient ");
                
//#line 309
final java.
                  lang.
                  String X10_TEMP60 =
                  (X10_TEMP221);
                
//#line 310
final java.
                  lang.
                  String X10_TEMP224 =
                  (X10_TEMP60 +
                   j);
                
//#line 312
final java.
                  lang.
                  String X10_TEMP61 =
                  (X10_TEMP224);
                
//#line 313
final java.
                  lang.
                  String X10_TEMP227 =
                  (",");
                
//#line 315
final java.
                  lang.
                  String X10_TEMP62 =
                  (X10_TEMP227);
                
//#line 316
final java.
                  lang.
                  String X10_TEMP230 =
                  (X10_TEMP61 +
                   X10_TEMP62);
                
//#line 318
final java.
                  lang.
                  String X10_TEMP63 =
                  (X10_TEMP230);
                
//#line 319
final java.
                  lang.
                  String X10_TEMP233 =
                  (X10_TEMP63 +
                   i);
                
//#line 321
final java.
                  lang.
                  String X10_TEMP65 =
                  (X10_TEMP233);
                
//#line 322
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println(X10_TEMP65);
                
//#line 323
final java.
                  lang.
                  String X10_TEMP237 =
                  ("Computed value = ");
                
//#line 325
final java.
                  lang.
                  String X10_TEMP66 =
                  (X10_TEMP237);
                
//#line 326
final java.
                  lang.
                  String X10_TEMP240 =
                  (X10_TEMP66 +
                   cval);
                
//#line 328
final java.
                  lang.
                  String X10_TEMP68 =
                  (X10_TEMP240);
                
//#line 329
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println(X10_TEMP68);
                
//#line 330
final java.
                  lang.
                  String X10_TEMP244 =
                  ("Reference value = ");
                
//#line 332
final java.
                  lang.
                  String X10_TEMP71 =
                  (X10_TEMP244);
                
//#line 333
final double X10_TEMP249 =
                  (/* template:array_get { */((ref).get(/* Join: { */i,j/* } */))/* } */);
                
//#line 335
final double X10_TEMP72 =
                  (X10_TEMP249);
                
//#line 336
final java.
                  lang.
                  String X10_TEMP252 =
                  (X10_TEMP71 +
                   X10_TEMP72);
                
//#line 338
final java.
                  lang.
                  String X10_TEMP74 =
                  (X10_TEMP252);
                
//#line 339
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                             lang.
                                                                                                             System.
                                                                                                             out))/* } */.println(X10_TEMP74);
                
//#line 340
final java.
                  lang.
                  String X10_TEMP256 =
                  ("Validation failed");
                
//#line 342
final java.
                  lang.
                  String X10_TEMP76 =
                  (X10_TEMP256);
                
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
final int X10_TEMP92 =
          (0);
        
//#line 353
final int X10_TEMP3 =
          (X10_TEMP92);
        
//#line 354
final int X10_TEMP95 =
          (0);
        
//#line 356
final int X10_TEMP4 =
          (X10_TEMP95);
        
//#line 357
final x10.
          lang.
          region X10_TEMP100 =
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
            ((X10_TEMP100));
        
//#line 360
final x10.
          lang.
          place X10_TEMP103 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 362
final x10.
          lang.
          place X10_TEMP6 =
          (X10_TEMP103);
        
//#line 363
final x10.
          lang.
          dist X10_TEMP106 =
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
            ((X10_TEMP106));
        
//#line 366
final int X10_TEMP109 =
          (10000);
        
//#line 368
int j =
          (X10_TEMP109);
        
//#line 369
/* template:forloop { */
        for (java.util.Iterator i__ = (tempdist.
                                         region).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 370
final int X10_TEMP113 =
              (0);
            
//#line 372
final int X10_TEMP11 =
              (X10_TEMP113);
            
//#line 373
Program0.
                           Program_Series_setSize(
                           X10_TEMP0,
                           X10_TEMP11);
            
//#line 374
final int X10_TEMP118 =
              (100);
            
//#line 376
final int X10_TEMP14 =
              (X10_TEMP118);
            
//#line 377
final int X10_TEMP121 =
              (0);
            
//#line 379
final int X10_TEMP15 =
              (X10_TEMP121);
            
//#line 380
final double X10_TEMP126 =
              (java.
                 lang.
                 Math.
                 pow(
                 X10_TEMP14,
                 X10_TEMP15));
            
//#line 382
final double X10_TEMP16 =
              (X10_TEMP126);
            
//#line 383
final double X10_TEMP129 =
              (j *
                 X10_TEMP16);
            
//#line 385
final double X10_TEMP18 =
              (X10_TEMP129);
            
//#line 386
final int X10_TEMP132 =
              ((int)
                 X10_TEMP18);
            
//#line 388
final int X10_TEMP20 =
              (X10_TEMP132);
            
//#line 389
Program0.
                           Program_Series_initialise(
                           X10_TEMP0,
                           X10_TEMP20);
            
//#line 390
Program0.
                           Program_Series_kernel(
                           X10_TEMP0);
            
//#line 391
Program0.
                           Program_Series_validate(
                           X10_TEMP0);
        }/* } */
        }
        /* } */
        
        
//#line 393
Program0.
                       Program_Series_tidyup(
                       X10_TEMP0);
    }
    
    
//#line 395
public static void
                   Program_Series_buildTestData(
                   final Series X10_TEMP0) {
        
//#line 396
final int X10_TEMP92 =
          (0);
        
//#line 398
final int X10_TEMP3 =
          (X10_TEMP92);
        
//#line 399
final int X10_TEMP95 =
          (1);
        
//#line 401
final int X10_TEMP4 =
          (X10_TEMP95);
        
//#line 402
final int X10_TEMP98 =
          (0);
        
//#line 404
final int X10_TEMP9 =
          (X10_TEMP98);
        
//#line 405
final int X10_TEMP101 =
          (/* template:place-check { */((Series) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.array_rows);
        
//#line 407
final int X10_TEMP6 =
          (X10_TEMP101);
        
//#line 408
final int X10_TEMP104 =
          (1);
        
//#line 410
final int X10_TEMP7 =
          (X10_TEMP104);
        
//#line 411
final int X10_TEMP107 =
          (X10_TEMP6 -
             X10_TEMP7);
        
//#line 413
final int X10_TEMP10 =
          (X10_TEMP107);
        
//#line 414
final x10.
          lang.
          region X10_TEMP114 =
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
        
//#line 416
final x10.
          lang.
          region R =
          (x10.
            lang.
            region)
            ((X10_TEMP114));
        
//#line 417
final x10.
          lang.
          dist X10_TEMP118 =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 417
public x10.
                             lang.
                             dist
                             checkCast(
                             final x10.
                               lang.
                               dist x10_generated_objToCast) {
                  
//#line 417
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
        
//#line 419
final x10.
          lang.
          dist X10_TEMP13 =
          (x10.
            lang.
            dist)
            ((X10_TEMP118));
        
//#line 420
final x10.
          lang.
          dist X10_TEMP121 =
          (x10.
            lang.
            dist)
            ((X10_TEMP13));
        
//#line 422
final x10.
          lang.
          dist d =
          (x10.
            lang.
            dist)
            ((X10_TEMP121));
        
//#line 423
final x10.
          lang.
          DoubleReferenceArray X10_TEMP124 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 425
final x10.
          lang.
          DoubleReferenceArray X10_TEMP15 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP124));
        
//#line 426
final x10.
          lang.
          DoubleReferenceArray X10_TEMP127 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP15));
        
//#line 428
final x10.
          lang.
          DoubleReferenceArray X10_TEMP18 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP127));
        
//#line 429
final x10.
          lang.
          DoubleReferenceArray X10_TEMP130 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP18));
        
//#line 431
final x10.
          lang.
          DoubleReferenceArray X10_TEMP133 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP130));
        
//#line 432
/* template:place-check { */((Series) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.testArray =
          ((X10_TEMP133));
    }
    
    
//#line 434
public static void
                   Program_Series_Do(
                   final Series X10_TEMP0) {
        
//#line 435
final x10.
          lang.
          DoubleReferenceArray X10_TEMP92 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Series) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.testArray));
        
//#line 437
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP92));
        
//#line 438
final int X10_TEMP95 =
          (0);
        
//#line 440
final int X10_TEMP4 =
          (X10_TEMP95);
        
//#line 441
final int X10_TEMP98 =
          (0);
        
//#line 443
final int X10_TEMP5 =
          (X10_TEMP98);
        
//#line 444
final double X10_TEMP101 =
          (0.0);
        
//#line 446
final double X10_TEMP6 =
          (X10_TEMP101);
        
//#line 447
final double X10_TEMP104 =
          ((double)
             X10_TEMP6);
        
//#line 449
final double X10_TEMP14 =
          (X10_TEMP104);
        
//#line 450
final double X10_TEMP107 =
          (2.0);
        
//#line 452
final double X10_TEMP8 =
          (X10_TEMP107);
        
//#line 453
final double X10_TEMP110 =
          ((double)
             X10_TEMP8);
        
//#line 455
final double X10_TEMP15 =
          (X10_TEMP110);
        
//#line 456
final int X10_TEMP113 =
          (1000);
        
//#line 458
final int X10_TEMP16 =
          (X10_TEMP113);
        
//#line 459
final double X10_TEMP116 =
          (0.0);
        
//#line 461
final double X10_TEMP11 =
          (X10_TEMP116);
        
//#line 462
final double X10_TEMP119 =
          ((double)
             X10_TEMP11);
        
//#line 464
final double X10_TEMP17 =
          (X10_TEMP119);
        
//#line 465
final int X10_TEMP122 =
          (0);
        
//#line 467
final int X10_TEMP18 =
          (X10_TEMP122);
        
//#line 468
final double X10_TEMP131 =
          (Program0.
             Program_Series_TrapezoidIntegrate(
             X10_TEMP0,
             X10_TEMP14,
             X10_TEMP15,
             X10_TEMP16,
             X10_TEMP17,
             X10_TEMP18));
        
//#line 470
final double X10_TEMP20 =
          (X10_TEMP131);
        
//#line 471
final double X10_TEMP134 =
          (2.0);
        
//#line 473
final double X10_TEMP19 =
          (X10_TEMP134);
        
//#line 474
final double X10_TEMP137 =
          ((double)
             X10_TEMP19);
        
//#line 476
final double X10_TEMP21 =
          (X10_TEMP137);
        
//#line 477
final double X10_TEMP140 =
          (X10_TEMP20 /
             X10_TEMP21);
        
//#line 479
final double X10_TEMP24 =
          (X10_TEMP140);
        
//#line 480
final double X10_TEMP143 =
          (X10_TEMP24);
        
//#line 482
final double X10_TEMP25 =
          (X10_TEMP143);
        
//#line 483
final double X10_TEMP148 =
          (X10_TEMP25);
        
//#line 485
final double X10_TEMP151 =
          (X10_TEMP148);
        
//#line 486
/* template:array_set { */(X10_TEMP1).set((X10_TEMP151),/* Join: { */X10_TEMP4,X10_TEMP5/* } */)/* } */;
        
//#line 487
final double X10_TEMP153 =
          (3.141592653589793);
        
//#line 489
final double X10_TEMP26 =
          (X10_TEMP153);
        
//#line 490
final double X10_TEMP156 =
          ((double)
             X10_TEMP26);
        
//#line 492
final double omega =
          (X10_TEMP156);
        
//#line 493
final x10.
          lang.
          dist X10_TEMP159 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                UNIQUE));
        
//#line 495
final x10.
          lang.
          dist X10_TEMP28 =
          (x10.
            lang.
            dist)
            ((X10_TEMP159));
        
//#line 496
final x10.
          lang.
          dist X10_TEMP162 =
          (x10.
            lang.
            dist)
            ((X10_TEMP28));
        
//#line 498
final x10.
          lang.
          dist U =
          (x10.
            lang.
            dist)
            ((X10_TEMP162));
        
//#line 499
final x10.
          lang.
          DoubleReferenceArray X10_TEMP165 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Series) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.testArray));
        
//#line 501
final x10.
          lang.
          DoubleReferenceArray tA =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP165));
        
//#line 502
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 503
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
                
//#line 504
final x10.
                  lang.
                  place X10_TEMP32 =
                  (U.
                     get(
                     p));
                
//#line 505
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP32)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 506
final int X10_TEMP172 =
                      (0);
                    
//#line 508
int ilow =
                      (X10_TEMP172);
                    
//#line 509
final x10.
                      lang.
                      place X10_TEMP176 =
                      (U.
                         get(
                         p));
                    
//#line 511
final x10.
                      lang.
                      place X10_TEMP35 =
                      (X10_TEMP176);
                    
//#line 512
final boolean X10_TEMP37 =
                      (X10_TEMP35.
                         isFirst());
                    
//#line 513
if (X10_TEMP37) {
                        
//#line 514
final int X10_TEMP181 =
                          (1);
                        
//#line 516
final int X10_TEMP39 =
                          (X10_TEMP181);
                        
//#line 517
final int X10_TEMP184 =
                          (X10_TEMP39);
                        
//#line 519
ilow =
                          ((X10_TEMP184));
                    } else {
                        
//#line 522
final int X10_TEMP187 =
                          (0);
                        
//#line 524
final int X10_TEMP41 =
                          (X10_TEMP187);
                        
//#line 525
final int X10_TEMP190 =
                          (X10_TEMP41);
                        
//#line 527
ilow =
                          ((X10_TEMP190));
                    }
                    
//#line 529
final x10.
                      lang.
                      dist X10_TEMP193 =
                      (x10.
                        lang.
                        dist)
                        ((tA.
                            distribution));
                    
//#line 531
final x10.
                      lang.
                      dist X10_TEMP42 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP193));
                    
//#line 532
final x10.
                      lang.
                      place X10_TEMP196 =
                      (/* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 534
final x10.
                      lang.
                      place X10_TEMP43 =
                      (X10_TEMP196);
                    
//#line 535
final x10.
                      lang.
                      dist X10_TEMP199 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP42.
                            restriction(
                            X10_TEMP43)));
                    
//#line 537
final x10.
                      lang.
                      dist X10_TEMP45 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP199));
                    
//#line 538
/* template:forloop-mult { */{
                    x10.lang.region __var10__ = (x10.lang.region) X10_TEMP45.
                                                                    region;
                    if (__var10__.size() > 0 && (__var10__ instanceof x10.array.MultiDimRegion || __var10__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var11__ = __var10__.rank(0).low(), __var12__ = __var10__.rank(0).high(); __var11__ <= __var12__; __var11__++)
                    /* } */
                    /* template:forloop-mult-each { */
                    for (int __var13__ = __var10__.rank(1).low(), __var14__ = __var10__.rank(1).high(); __var13__ <= __var14__; __var13__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int n = __var11__;
                    /* } */
                    /* template:final-var-assign { */
                    final int i = __var13__;
                    /* } */
                    /* } */
{
                        
//#line 539
final boolean X10_TEMP47 =
                          (i >=
                             ilow);
                        
//#line 540
if (X10_TEMP47) {
                            
//#line 541
final int X10_TEMP205 =
                              (0);
                            
//#line 543
final int X10_TEMP48 =
                              (X10_TEMP205);
                            
//#line 544
final boolean X10_TEMP50 =
                              (n ==
                                 X10_TEMP48);
                            
//#line 545
if (X10_TEMP50) {
                                
//#line 546
final int X10_TEMP210 =
                                  (0);
                                
//#line 548
final int X10_TEMP53 =
                                  (X10_TEMP210);
                                
//#line 549
final double X10_TEMP213 =
                                  (0.0);
                                
//#line 551
final double X10_TEMP54 =
                                  (X10_TEMP213);
                                
//#line 552
final double X10_TEMP216 =
                                  ((double)
                                     X10_TEMP54);
                                
//#line 554
final double X10_TEMP62 =
                                  (X10_TEMP216);
                                
//#line 555
final double X10_TEMP219 =
                                  (2.0);
                                
//#line 557
final double X10_TEMP56 =
                                  (X10_TEMP219);
                                
//#line 558
final double X10_TEMP222 =
                                  ((double)
                                     X10_TEMP56);
                                
//#line 560
final double X10_TEMP63 =
                                  (X10_TEMP222);
                                
//#line 561
final int X10_TEMP225 =
                                  (1000);
                                
//#line 563
final int X10_TEMP64 =
                                  (X10_TEMP225);
                                
//#line 564
final double X10_TEMP228 =
                                  ((double)
                                     i);
                                
//#line 566
final double X10_TEMP59 =
                                  (X10_TEMP228);
                                
//#line 567
final double X10_TEMP231 =
                                  (omega *
                                     X10_TEMP59);
                                
//#line 569
final double X10_TEMP65 =
                                  (X10_TEMP231);
                                
//#line 570
final int X10_TEMP234 =
                                  (1);
                                
//#line 572
final int X10_TEMP66 =
                                  (X10_TEMP234);
                                
//#line 573
final double X10_TEMP243 =
                                  (Program0.
                                     Program_Series_TrapezoidIntegrate(
                                     X10_TEMP0,
                                     X10_TEMP62,
                                     X10_TEMP63,
                                     X10_TEMP64,
                                     X10_TEMP65,
                                     X10_TEMP66));
                                
//#line 575
final double X10_TEMP69 =
                                  (X10_TEMP243);
                                
//#line 576
final double X10_TEMP246 =
                                  (X10_TEMP69);
                                
//#line 578
final double X10_TEMP70 =
                                  (X10_TEMP246);
                                
//#line 579
final double X10_TEMP251 =
                                  (X10_TEMP70);
                                
//#line 581
final double X10_TEMP254 =
                                  (X10_TEMP251);
                                
//#line 582
/* template:array_set { */(tA).set((X10_TEMP254),/* Join: { */X10_TEMP53,i/* } */)/* } */;
                            } else {
                                
//#line 585
final double X10_TEMP256 =
                                  (0.0);
                                
//#line 587
final double X10_TEMP73 =
                                  (X10_TEMP256);
                                
//#line 588
final double X10_TEMP259 =
                                  ((double)
                                     X10_TEMP73);
                                
//#line 590
final double X10_TEMP81 =
                                  (X10_TEMP259);
                                
//#line 591
final double X10_TEMP262 =
                                  (2.0);
                                
//#line 593
final double X10_TEMP75 =
                                  (X10_TEMP262);
                                
//#line 594
final double X10_TEMP265 =
                                  ((double)
                                     X10_TEMP75);
                                
//#line 596
final double X10_TEMP82 =
                                  (X10_TEMP265);
                                
//#line 597
final int X10_TEMP268 =
                                  (1000);
                                
//#line 599
final int X10_TEMP83 =
                                  (X10_TEMP268);
                                
//#line 600
final double X10_TEMP271 =
                                  ((double)
                                     i);
                                
//#line 602
final double X10_TEMP78 =
                                  (X10_TEMP271);
                                
//#line 603
final double X10_TEMP274 =
                                  (omega *
                                     X10_TEMP78);
                                
//#line 605
final double X10_TEMP84 =
                                  (X10_TEMP274);
                                
//#line 606
final int X10_TEMP277 =
                                  (2);
                                
//#line 608
final int X10_TEMP85 =
                                  (X10_TEMP277);
                                
//#line 609
final double X10_TEMP286 =
                                  (Program0.
                                     Program_Series_TrapezoidIntegrate(
                                     X10_TEMP0,
                                     X10_TEMP81,
                                     X10_TEMP82,
                                     X10_TEMP83,
                                     X10_TEMP84,
                                     X10_TEMP85));
                                
//#line 611
final double X10_TEMP88 =
                                  (X10_TEMP286);
                                
//#line 612
final double X10_TEMP289 =
                                  (X10_TEMP88);
                                
//#line 614
final double X10_TEMP89 =
                                  (X10_TEMP289);
                                
//#line 615
final double X10_TEMP294 =
                                  (X10_TEMP89);
                                
//#line 617
final double X10_TEMP297 =
                                  (X10_TEMP294);
                                
//#line 618
/* template:array_set { */(tA).set((X10_TEMP297),/* Join: { */n,i/* } */)/* } */;
                            }
                        }
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var1____ = (__var10__).iterator(); __var1____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var1__ = (x10.
                      lang.
                      point) __var1____.next();
                    	/* Join: { *//* Join: { */final int n =
                      /* template:array_get { */((__var1__).get(0))/* } */;
final int i =
                      /* template:array_get { */((__var1__).get(1))/* } */;/* } */
{
                        
//#line 539
final boolean X10_TEMP47 =
                          (i >=
                             ilow);
                        
//#line 540
if (X10_TEMP47) {
                            
//#line 541
final int X10_TEMP205 =
                              (0);
                            
//#line 543
final int X10_TEMP48 =
                              (X10_TEMP205);
                            
//#line 544
final boolean X10_TEMP50 =
                              (n ==
                                 X10_TEMP48);
                            
//#line 545
if (X10_TEMP50) {
                                
//#line 546
final int X10_TEMP210 =
                                  (0);
                                
//#line 548
final int X10_TEMP53 =
                                  (X10_TEMP210);
                                
//#line 549
final double X10_TEMP213 =
                                  (0.0);
                                
//#line 551
final double X10_TEMP54 =
                                  (X10_TEMP213);
                                
//#line 552
final double X10_TEMP216 =
                                  ((double)
                                     X10_TEMP54);
                                
//#line 554
final double X10_TEMP62 =
                                  (X10_TEMP216);
                                
//#line 555
final double X10_TEMP219 =
                                  (2.0);
                                
//#line 557
final double X10_TEMP56 =
                                  (X10_TEMP219);
                                
//#line 558
final double X10_TEMP222 =
                                  ((double)
                                     X10_TEMP56);
                                
//#line 560
final double X10_TEMP63 =
                                  (X10_TEMP222);
                                
//#line 561
final int X10_TEMP225 =
                                  (1000);
                                
//#line 563
final int X10_TEMP64 =
                                  (X10_TEMP225);
                                
//#line 564
final double X10_TEMP228 =
                                  ((double)
                                     i);
                                
//#line 566
final double X10_TEMP59 =
                                  (X10_TEMP228);
                                
//#line 567
final double X10_TEMP231 =
                                  (omega *
                                     X10_TEMP59);
                                
//#line 569
final double X10_TEMP65 =
                                  (X10_TEMP231);
                                
//#line 570
final int X10_TEMP234 =
                                  (1);
                                
//#line 572
final int X10_TEMP66 =
                                  (X10_TEMP234);
                                
//#line 573
final double X10_TEMP243 =
                                  (Program0.
                                     Program_Series_TrapezoidIntegrate(
                                     X10_TEMP0,
                                     X10_TEMP62,
                                     X10_TEMP63,
                                     X10_TEMP64,
                                     X10_TEMP65,
                                     X10_TEMP66));
                                
//#line 575
final double X10_TEMP69 =
                                  (X10_TEMP243);
                                
//#line 576
final double X10_TEMP246 =
                                  (X10_TEMP69);
                                
//#line 578
final double X10_TEMP70 =
                                  (X10_TEMP246);
                                
//#line 579
final double X10_TEMP251 =
                                  (X10_TEMP70);
                                
//#line 581
final double X10_TEMP254 =
                                  (X10_TEMP251);
                                
//#line 582
/* template:array_set { */(tA).set((X10_TEMP254),/* Join: { */X10_TEMP53,i/* } */)/* } */;
                            } else {
                                
//#line 585
final double X10_TEMP256 =
                                  (0.0);
                                
//#line 587
final double X10_TEMP73 =
                                  (X10_TEMP256);
                                
//#line 588
final double X10_TEMP259 =
                                  ((double)
                                     X10_TEMP73);
                                
//#line 590
final double X10_TEMP81 =
                                  (X10_TEMP259);
                                
//#line 591
final double X10_TEMP262 =
                                  (2.0);
                                
//#line 593
final double X10_TEMP75 =
                                  (X10_TEMP262);
                                
//#line 594
final double X10_TEMP265 =
                                  ((double)
                                     X10_TEMP75);
                                
//#line 596
final double X10_TEMP82 =
                                  (X10_TEMP265);
                                
//#line 597
final int X10_TEMP268 =
                                  (1000);
                                
//#line 599
final int X10_TEMP83 =
                                  (X10_TEMP268);
                                
//#line 600
final double X10_TEMP271 =
                                  ((double)
                                     i);
                                
//#line 602
final double X10_TEMP78 =
                                  (X10_TEMP271);
                                
//#line 603
final double X10_TEMP274 =
                                  (omega *
                                     X10_TEMP78);
                                
//#line 605
final double X10_TEMP84 =
                                  (X10_TEMP274);
                                
//#line 606
final int X10_TEMP277 =
                                  (2);
                                
//#line 608
final int X10_TEMP85 =
                                  (X10_TEMP277);
                                
//#line 609
final double X10_TEMP286 =
                                  (Program0.
                                     Program_Series_TrapezoidIntegrate(
                                     X10_TEMP0,
                                     X10_TEMP81,
                                     X10_TEMP82,
                                     X10_TEMP83,
                                     X10_TEMP84,
                                     X10_TEMP85));
                                
//#line 611
final double X10_TEMP88 =
                                  (X10_TEMP286);
                                
//#line 612
final double X10_TEMP289 =
                                  (X10_TEMP88);
                                
//#line 614
final double X10_TEMP89 =
                                  (X10_TEMP289);
                                
//#line 615
final double X10_TEMP294 =
                                  (X10_TEMP89);
                                
//#line 617
final double X10_TEMP297 =
                                  (X10_TEMP294);
                                
//#line 618
/* template:array_set { */(tA).set((X10_TEMP297),/* Join: { */n,i/* } */)/* } */;
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
        	} catch (Throwable tmp9) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp9);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 626
public static double
                   Program_Series_TrapezoidIntegrate(
                   final Series X10_TEMP0,
                   final double x0,
                   final double x1,
                   final int a_nsteps,
                   final double omegan,
                   final int select) {
        
//#line 627
final double X10_TEMP92 =
          (0.0);
        
//#line 629
double x =
          (X10_TEMP92);
        
//#line 630
final double X10_TEMP95 =
          (0.0);
        
//#line 632
double dx =
          (X10_TEMP95);
        
//#line 633
final double X10_TEMP98 =
          (0.0);
        
//#line 635
double rvalue =
          (X10_TEMP98);
        
//#line 636
final int X10_TEMP101 =
          (a_nsteps);
        
//#line 638
int nsteps =
          (X10_TEMP101);
        
//#line 639
final double X10_TEMP104 =
          (x0);
        
//#line 641
x =
          ((X10_TEMP104));
        
//#line 642
final double X10_TEMP107 =
          (x1 -
             x0);
        
//#line 644
final double X10_TEMP7 =
          (X10_TEMP107);
        
//#line 645
final double X10_TEMP110 =
          ((double)
             nsteps);
        
//#line 647
final double X10_TEMP8 =
          (X10_TEMP110);
        
//#line 648
final double X10_TEMP113 =
          (X10_TEMP7 /
             X10_TEMP8);
        
//#line 650
final double X10_TEMP10 =
          (X10_TEMP113);
        
//#line 651
final double X10_TEMP116 =
          (X10_TEMP10);
        
//#line 653
dx =
          ((X10_TEMP116));
        
//#line 654
final double X10_TEMP123 =
          (Program0.
             Program_Series_thefunction(
             X10_TEMP0,
             x0,
             omegan,
             select));
        
//#line 656
final double X10_TEMP15 =
          (X10_TEMP123);
        
//#line 657
final double X10_TEMP126 =
          (2.0);
        
//#line 659
final double X10_TEMP14 =
          (X10_TEMP126);
        
//#line 660
final double X10_TEMP129 =
          ((double)
             X10_TEMP14);
        
//#line 662
final double X10_TEMP16 =
          (X10_TEMP129);
        
//#line 663
final double X10_TEMP132 =
          (X10_TEMP15 /
             X10_TEMP16);
        
//#line 665
final double X10_TEMP18 =
          (X10_TEMP132);
        
//#line 666
final double X10_TEMP135 =
          (X10_TEMP18);
        
//#line 668
rvalue =
          ((X10_TEMP135));
        
//#line 669
final int X10_TEMP138 =
          (1);
        
//#line 671
final int X10_TEMP19 =
          (X10_TEMP138);
        
//#line 672
final boolean X10_TEMP21 =
          (nsteps !=
             X10_TEMP19);
        
//#line 673
if (X10_TEMP21) {
            
//#line 674
final int X10_TEMP143 =
              (nsteps);
            
//#line 676
final int X10_TEMP22 =
              (X10_TEMP143);
            
//#line 677
final int X10_TEMP23 =
              (1);
            
//#line 678
final int X10_TEMP147 =
              (nsteps -
                 X10_TEMP23);
            
//#line 679
nsteps =
              ((X10_TEMP147));
            
//#line 680
final int X10_TEMP24 =
              (1);
            
//#line 681
final int X10_TEMP150 =
              (nsteps -
                 X10_TEMP24);
            
//#line 682
nsteps =
              ((X10_TEMP150));
            
//#line 683
final int X10_TEMP152 =
              (0);
            
//#line 685
final int X10_TEMP25 =
              (X10_TEMP152);
            
//#line 686
boolean X10_TEMP30 =
              (nsteps >
                 X10_TEMP25);
            
//#line 687
boolean X10_TEMP157 =
              X10_TEMP30;
            
//#line 688
while (X10_TEMP157) {
                
//#line 689
final double X10_TEMP159 =
                  (x +
                     dx);
                
//#line 691
x =
                  ((X10_TEMP159));
                
//#line 692
final double X10_TEMP166 =
                  (Program0.
                     Program_Series_thefunction(
                     X10_TEMP0,
                     x,
                     omegan,
                     select));
                
//#line 694
final double X10_TEMP36 =
                  (X10_TEMP166);
                
//#line 695
final double X10_TEMP169 =
                  (rvalue +
                     X10_TEMP36);
                
//#line 697
rvalue =
                  ((X10_TEMP169));
                
//#line 698
final int X10_TEMP27 =
                  (1);
                
//#line 699
final int X10_TEMP173 =
                  (nsteps -
                     X10_TEMP27);
                
//#line 700
nsteps =
                  ((X10_TEMP173));
                
//#line 701
final int X10_TEMP175 =
                  (0);
                
//#line 703
final int X10_TEMP28 =
                  (X10_TEMP175);
                
//#line 704
final boolean X10_TEMP178 =
                  (nsteps >
                     X10_TEMP28);
                
//#line 705
X10_TEMP30 =
                  ((X10_TEMP178));
                
//#line 706
X10_TEMP157 =
                  X10_TEMP30;
            }
        }
        
//#line 709
final double X10_TEMP184 =
          (Program0.
             Program_Series_thefunction(
             X10_TEMP0,
             x1,
             omegan,
             select));
        
//#line 711
final double X10_TEMP41 =
          (X10_TEMP184);
        
//#line 712
final double X10_TEMP187 =
          (2.0);
        
//#line 714
final double X10_TEMP40 =
          (X10_TEMP187);
        
//#line 715
final double X10_TEMP190 =
          ((double)
             X10_TEMP40);
        
//#line 717
final double X10_TEMP42 =
          (X10_TEMP190);
        
//#line 718
final double X10_TEMP193 =
          (X10_TEMP41 /
             X10_TEMP42);
        
//#line 720
final double X10_TEMP43 =
          (X10_TEMP193);
        
//#line 721
final double X10_TEMP196 =
          (rvalue +
             X10_TEMP43);
        
//#line 723
final double X10_TEMP45 =
          (X10_TEMP196);
        
//#line 724
final double X10_TEMP199 =
          (X10_TEMP45 *
             dx);
        
//#line 726
final double X10_TEMP47 =
          (X10_TEMP199);
        
//#line 727
final double X10_TEMP202 =
          (X10_TEMP47);
        
//#line 729
rvalue =
          ((X10_TEMP202));
        
//#line 730
final double X10_TEMP205 =
          (rvalue);
        
//#line 732
final double X10_TEMP49 =
          (X10_TEMP205);
        
//#line 733
return X10_TEMP49;
    }
    
    
//#line 735
public static double
                   Program_Series_thefunction(
                   final Series X10_TEMP0,
                   final double x,
                   final double omegan,
                   final int select) {
        
//#line 736
final int X10_TEMP3 =
          (0);
        
//#line 737
final int X10_TEMP13 =
          (1);
        
//#line 738
final int X10_TEMP27 =
          (2);
        
//#line 739
switch (select) {
            
//#line 740
case X10_TEMP3:
                {
                    
//#line 742
final double X10_TEMP97 =
                      (1.0);
                    
//#line 744
final double X10_TEMP4 =
                      (X10_TEMP97);
                    
//#line 745
final double X10_TEMP100 =
                      ((double)
                         X10_TEMP4);
                    
//#line 747
final double X10_TEMP5 =
                      (X10_TEMP100);
                    
//#line 748
final double X10_TEMP103 =
                      (x +
                         X10_TEMP5);
                    
//#line 750
final double X10_TEMP8 =
                      (X10_TEMP103);
                    
//#line 751
final double X10_TEMP108 =
                      (java.
                         lang.
                         Math.
                         pow(
                         X10_TEMP8,
                         x));
                    
//#line 753
final double X10_TEMP10 =
                      (X10_TEMP108);
                    
//#line 754
return X10_TEMP10;
                }
            
//#line 756
case X10_TEMP13:
                {
                    
//#line 758
final double X10_TEMP113 =
                      (1.0);
                    
//#line 760
final double X10_TEMP14 =
                      (X10_TEMP113);
                    
//#line 761
final double X10_TEMP116 =
                      ((double)
                         X10_TEMP14);
                    
//#line 763
final double X10_TEMP15 =
                      (X10_TEMP116);
                    
//#line 764
final double X10_TEMP119 =
                      (x +
                         X10_TEMP15);
                    
//#line 766
final double X10_TEMP18 =
                      (X10_TEMP119);
                    
//#line 767
final double X10_TEMP124 =
                      (java.
                         lang.
                         Math.
                         pow(
                         X10_TEMP18,
                         x));
                    
//#line 769
final double X10_TEMP21 =
                      (X10_TEMP124);
                    
//#line 770
final double X10_TEMP127 =
                      (omegan *
                         x);
                    
//#line 772
final double X10_TEMP20 =
                      (X10_TEMP127);
                    
//#line 773
final double X10_TEMP131 =
                      (java.
                         lang.
                         Math.
                         cos(
                         X10_TEMP20));
                    
//#line 775
final double X10_TEMP22 =
                      (X10_TEMP131);
                    
//#line 776
final double X10_TEMP134 =
                      (X10_TEMP21 *
                         X10_TEMP22);
                    
//#line 778
final double X10_TEMP24 =
                      (X10_TEMP134);
                    
//#line 779
return X10_TEMP24;
                }
            
//#line 781
case X10_TEMP27:
                {
                    
//#line 783
final double X10_TEMP139 =
                      (1.0);
                    
//#line 785
final double X10_TEMP28 =
                      (X10_TEMP139);
                    
//#line 786
final double X10_TEMP142 =
                      ((double)
                         X10_TEMP28);
                    
//#line 788
final double X10_TEMP29 =
                      (X10_TEMP142);
                    
//#line 789
final double X10_TEMP145 =
                      (x +
                         X10_TEMP29);
                    
//#line 791
final double X10_TEMP32 =
                      (X10_TEMP145);
                    
//#line 792
final double X10_TEMP150 =
                      (java.
                         lang.
                         Math.
                         pow(
                         X10_TEMP32,
                         x));
                    
//#line 794
final double X10_TEMP35 =
                      (X10_TEMP150);
                    
//#line 795
final double X10_TEMP153 =
                      (omegan *
                         x);
                    
//#line 797
final double X10_TEMP34 =
                      (X10_TEMP153);
                    
//#line 798
final double X10_TEMP157 =
                      (java.
                         lang.
                         Math.
                         sin(
                         X10_TEMP34));
                    
//#line 800
final double X10_TEMP36 =
                      (X10_TEMP157);
                    
//#line 801
final double X10_TEMP160 =
                      (X10_TEMP35 *
                         X10_TEMP36);
                    
//#line 803
final double X10_TEMP38 =
                      (X10_TEMP160);
                    
//#line 804
return X10_TEMP38;
                }
        }
        
//#line 807
final double X10_TEMP164 =
          (0.0);
        
//#line 809
final double X10_TEMP41 =
          (X10_TEMP164);
        
//#line 810
return X10_TEMP41;
    }
    
    
//#line 812
public static void
                   Program_Series_freeTestData(
                   final Series X10_TEMP0) {
        
    }
    
    
//#line 814
public static void
                   Program_runMain(
                   ) {
        
//#line 815
final Timer X10_TEMP92 =
          (new Timer(
             ));
        
//#line 817
Timer tmr =
          (X10_TEMP92);
        
//#line 818
final int X10_TEMP95 =
          (0);
        
//#line 820
int count =
          (X10_TEMP95);
        
//#line 821
Program0.
                       Program_Timer_start(
                       tmr,
                       count);
        
//#line 822
final Series X10_TEMP100 =
          (new Series(
             ));
        
//#line 824
final Series X10_TEMP4 =
          (X10_TEMP100);
        
//#line 825
Program0.
                       Program_Series_run(
                       X10_TEMP4);
        
//#line 826
Program0.
                       Program_Timer_stop(
                       tmr,
                       count);
        
//#line 827
final java.
          lang.
          String X10_TEMP106 =
          ("Wall-clock time for series: ");
        
//#line 829
final java.
          lang.
          String X10_TEMP7 =
          (X10_TEMP106);
        
//#line 830
final double X10_TEMP111 =
          (Program0.
             Program_Timer_readTimer(
             tmr,
             count));
        
//#line 832
final double X10_TEMP8 =
          (X10_TEMP111);
        
//#line 833
final java.
          lang.
          String X10_TEMP114 =
          (X10_TEMP7 +
           X10_TEMP8);
        
//#line 835
final java.
          lang.
          String X10_TEMP9 =
          (X10_TEMP114);
        
//#line 836
final java.
          lang.
          String X10_TEMP117 =
          (" secs");
        
//#line 838
final java.
          lang.
          String X10_TEMP10 =
          (X10_TEMP117);
        
//#line 839
final java.
          lang.
          String X10_TEMP120 =
          (X10_TEMP9 +
           X10_TEMP10);
        
//#line 841
final java.
          lang.
          String X10_TEMP12 =
          (X10_TEMP120);
        
//#line 842
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println(X10_TEMP12);
    }
    
    
//#line 844
public static int
                   Program__Timer_max_counters_init(
                   ) {
        
//#line 845
final int X10_TEMP92 =
          (64);
        
//#line 847
final int X10_TEMP2 =
          (X10_TEMP92);
        
//#line 848
return X10_TEMP2;
    }
    
    
//#line 850
public static void
                   Program_Timer_start(
                   final Timer X10_TEMP0,
                   final int n) {
        
//#line 851
final x10.
          lang.
          DoubleReferenceArray X10_TEMP92 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 853
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP92));
        
//#line 854
final long X10_TEMP95 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 856
final double X10_TEMP5 =
          (X10_TEMP95);
        
//#line 857
final double X10_TEMP98 =
          (X10_TEMP5);
        
//#line 859
final double X10_TEMP6 =
          (X10_TEMP98);
        
//#line 860
final double X10_TEMP102 =
          (X10_TEMP6);
        
//#line 862
final double X10_TEMP105 =
          (X10_TEMP102);
        
//#line 863
/* template:array_set { */(X10_TEMP1).set((X10_TEMP105),n)/* } */;
    }
    
    
//#line 865
public static void
                   Program_Timer_stop(
                   final Timer X10_TEMP0,
                   final int n) {
        
//#line 866
final x10.
          lang.
          DoubleReferenceArray X10_TEMP92 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 868
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP92));
        
//#line 869
final long X10_TEMP95 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 871
final double X10_TEMP5 =
          (X10_TEMP95);
        
//#line 872
final x10.
          lang.
          DoubleReferenceArray X10_TEMP98 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 874
final x10.
          lang.
          DoubleReferenceArray X10_TEMP3 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP98));
        
//#line 875
final double X10_TEMP102 =
          (/* template:array_get { */((X10_TEMP3).get(n))/* } */);
        
//#line 877
final double X10_TEMP6 =
          (X10_TEMP102);
        
//#line 878
final double X10_TEMP105 =
          (X10_TEMP5 -
             X10_TEMP6);
        
//#line 880
final double X10_TEMP9 =
          (X10_TEMP105);
        
//#line 881
final double X10_TEMP108 =
          (X10_TEMP9);
        
//#line 883
final double X10_TEMP10 =
          (X10_TEMP108);
        
//#line 884
final double X10_TEMP112 =
          (X10_TEMP10);
        
//#line 886
final double X10_TEMP115 =
          (X10_TEMP112);
        
//#line 887
/* template:array_set { */(X10_TEMP1).set((X10_TEMP115),n)/* } */;
        
//#line 888
final x10.
          lang.
          DoubleReferenceArray X10_TEMP117 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 890
final x10.
          lang.
          DoubleReferenceArray X10_TEMP11 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP117));
        
//#line 891
final double X10_TEMP121 =
          (/* template:array_get { */((X10_TEMP11).get(n))/* } */);
        
//#line 893
final double X10_TEMP14 =
          (X10_TEMP121);
        
//#line 894
final int X10_TEMP124 =
          (1000);
        
//#line 896
final double X10_TEMP15 =
          (X10_TEMP124);
        
//#line 897
final double X10_TEMP127 =
          (X10_TEMP14 /
             X10_TEMP15);
        
//#line 899
final double X10_TEMP16 =
          (X10_TEMP127);
        
//#line 900
final double X10_TEMP131 =
          (X10_TEMP16);
        
//#line 902
final double X10_TEMP134 =
          (X10_TEMP131);
        
//#line 903
/* template:array_set { */(X10_TEMP11).set((X10_TEMP134),n)/* } */;
        
//#line 904
final x10.
          lang.
          DoubleReferenceArray X10_TEMP136 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 906
final x10.
          lang.
          DoubleReferenceArray X10_TEMP17 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP136));
        
//#line 907
final x10.
          lang.
          DoubleReferenceArray X10_TEMP139 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 909
final x10.
          lang.
          DoubleReferenceArray X10_TEMP19 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP139));
        
//#line 910
final double X10_TEMP143 =
          (/* template:array_get { */((X10_TEMP17).get(n))/* } */);
        
//#line 912
final double X10_TEMP22 =
          (X10_TEMP143);
        
//#line 913
final double X10_TEMP147 =
          (/* template:array_get { */((X10_TEMP19).get(n))/* } */);
        
//#line 915
final double X10_TEMP23 =
          (X10_TEMP147);
        
//#line 916
final double X10_TEMP150 =
          (X10_TEMP22 +
             X10_TEMP23);
        
//#line 918
final double X10_TEMP24 =
          (X10_TEMP150);
        
//#line 919
final double X10_TEMP154 =
          (X10_TEMP24);
        
//#line 921
final double X10_TEMP157 =
          (X10_TEMP154);
        
//#line 922
/* template:array_set { */(X10_TEMP17).set((X10_TEMP157),n)/* } */;
    }
    
    
//#line 924
public static double
                   Program_Timer_readTimer(
                   final Timer X10_TEMP0,
                   final int n) {
        
//#line 925
final x10.
          lang.
          DoubleReferenceArray X10_TEMP92 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 927
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP92));
        
//#line 928
final double X10_TEMP96 =
          (/* template:array_get { */((X10_TEMP1).get(n))/* } */);
        
//#line 930
final double X10_TEMP4 =
          (X10_TEMP96);
        
//#line 931
return X10_TEMP4;
    }
    
    
//#line 933
public static void
                   Program_Timer_resetTimer(
                   final Timer X10_TEMP0,
                   final int n) {
        
//#line 934
final x10.
          lang.
          DoubleReferenceArray X10_TEMP92 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 936
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP92));
        
//#line 937
final int X10_TEMP95 =
          (0);
        
//#line 939
final double X10_TEMP5 =
          (X10_TEMP95);
        
//#line 940
final double X10_TEMP98 =
          (X10_TEMP5);
        
//#line 942
final double X10_TEMP6 =
          (X10_TEMP98);
        
//#line 943
final double X10_TEMP102 =
          (X10_TEMP6);
        
//#line 945
final double X10_TEMP105 =
          (X10_TEMP102);
        
//#line 946
/* template:array_set { */(X10_TEMP1).set((X10_TEMP105),n)/* } */;
        
//#line 947
final x10.
          lang.
          DoubleReferenceArray X10_TEMP107 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 949
final x10.
          lang.
          DoubleReferenceArray X10_TEMP7 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP107));
        
//#line 950
final int X10_TEMP110 =
          (0);
        
//#line 952
final double X10_TEMP11 =
          (X10_TEMP110);
        
//#line 953
final double X10_TEMP113 =
          (X10_TEMP11);
        
//#line 955
final double X10_TEMP12 =
          (X10_TEMP113);
        
//#line 956
final double X10_TEMP117 =
          (X10_TEMP12);
        
//#line 958
final double X10_TEMP120 =
          (X10_TEMP117);
        
//#line 959
/* template:array_set { */(X10_TEMP7).set((X10_TEMP120),n)/* } */;
        
//#line 960
final x10.
          lang.
          DoubleReferenceArray X10_TEMP122 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 962
final x10.
          lang.
          DoubleReferenceArray X10_TEMP13 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP122));
        
//#line 963
final int X10_TEMP125 =
          (0);
        
//#line 965
final double X10_TEMP17 =
          (X10_TEMP125);
        
//#line 966
final double X10_TEMP128 =
          (X10_TEMP17);
        
//#line 968
final double X10_TEMP18 =
          (X10_TEMP128);
        
//#line 969
final double X10_TEMP132 =
          (X10_TEMP18);
        
//#line 971
final double X10_TEMP135 =
          (X10_TEMP132);
        
//#line 972
/* template:array_set { */(X10_TEMP13).set((X10_TEMP135),n)/* } */;
    }
    
    
//#line 974
public static void
                   Program_Timer_resetAllTimers(
                   final Timer X10_TEMP0) {
        
//#line 975
final int X10_TEMP92 =
          (0);
        
//#line 977
int i =
          (X10_TEMP92);
        
//#line 978
boolean X10_TEMP4 =
          (i <
             _Program__Timer_max_counters);
        
//#line 979
boolean X10_TEMP97 =
          X10_TEMP4;
        
//#line 980
while (X10_TEMP97) {
            
//#line 981
Program0.
                           Program_Timer_resetTimer(
                           X10_TEMP0,
                           i);
            
//#line 982
final int X10_TEMP101 =
              (i);
            
//#line 984
final int X10_TEMP6 =
              (X10_TEMP101);
            
//#line 985
final int X10_TEMP7 =
              (1);
            
//#line 986
final int X10_TEMP105 =
              (i +
                 X10_TEMP7);
            
//#line 987
i =
              ((X10_TEMP105));
            
//#line 988
final boolean X10_TEMP107 =
              (i <
                 _Program__Timer_max_counters);
            
//#line 989
X10_TEMP4 =
              ((X10_TEMP107));
            
//#line 990
X10_TEMP97 =
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
    
    
//#line 996
public Program() {
        
//#line 996
super();
    }
}

class Series
extends x10.
  lang.
  Object
{
    
//#line 1000
public int
      setsize;
    
//#line 1001
public int
      array_rows;
    
//#line 1002
public x10.
      lang.
      DoubleReferenceArray
      testArray;
    
    
//#line 1005
public Series() {
        
//#line 1005
super();
    }
}

class Timer
extends x10.
  lang.
  Object
{
    
//#line 1012
final public x10.
      lang.
      DoubleReferenceArray
      start_time;
    
//#line 1013
final public x10.
      lang.
      DoubleReferenceArray
      elapsed_time;
    
//#line 1014
final public x10.
      lang.
      DoubleReferenceArray
      total_time;
    
    
//#line 1017
public Timer() {
        
//#line 1017
super();
        
//#line 1018
final int X10_TEMP92 =
          (0);
        
//#line 1020
int i =
          (X10_TEMP92);
        
//#line 1021
final int X10_TEMP95 =
          (0);
        
//#line 1023
final int X10_TEMP4 =
          (X10_TEMP95);
        
//#line 1024
final int X10_TEMP98 =
          (Program0.
             _Program__Timer_max_counters);
        
//#line 1026
final int X10_TEMP5 =
          (X10_TEMP98);
        
//#line 1027
final x10.
          lang.
          region X10_TEMP103 =
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
        
//#line 1029
final x10.
          lang.
          region X10_TEMP6 =
          (x10.
            lang.
            region)
            ((X10_TEMP103));
        
//#line 1030
final x10.
          lang.
          place X10_TEMP106 =
          (x10.
             lang.
             place.
             FIRST_PLACE);
        
//#line 1032
final x10.
          lang.
          place X10_TEMP7 =
          (X10_TEMP106);
        
//#line 1033
final x10.
          lang.
          dist X10_TEMP109 =
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
        
//#line 1035
final x10.
          lang.
          dist d =
          (x10.
            lang.
            dist)
            ((X10_TEMP109));
        
//#line 1036
final x10.
          lang.
          DoubleReferenceArray X10_TEMP112 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1038
final x10.
          lang.
          DoubleReferenceArray X10_TEMP10 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP112));
        
//#line 1039
final x10.
          lang.
          DoubleReferenceArray X10_TEMP115 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP10));
        
//#line 1041
start_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP115));
        
//#line 1042
final x10.
          lang.
          DoubleReferenceArray X10_TEMP118 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1044
final x10.
          lang.
          DoubleReferenceArray X10_TEMP12 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP118));
        
//#line 1045
final x10.
          lang.
          DoubleReferenceArray X10_TEMP121 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP12));
        
//#line 1047
elapsed_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP121));
        
//#line 1048
final x10.
          lang.
          DoubleReferenceArray X10_TEMP124 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1050
final x10.
          lang.
          DoubleReferenceArray X10_TEMP14 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP124));
        
//#line 1051
final x10.
          lang.
          DoubleReferenceArray X10_TEMP127 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP14));
        
//#line 1053
total_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP127));
        
//#line 1054
final int X10_TEMP130 =
          (Program0.
             _Program__Timer_max_counters);
        
//#line 1056
final int X10_TEMP15 =
          (X10_TEMP130);
        
//#line 1057
boolean X10_TEMP19 =
          (i <
             X10_TEMP15);
        
//#line 1058
boolean X10_TEMP135 =
          X10_TEMP19;
        
//#line 1059
while (X10_TEMP135) {
            
//#line 1060
final int X10_TEMP137 =
              (0);
            
//#line 1062
final double X10_TEMP23 =
              (X10_TEMP137);
            
//#line 1063
final double X10_TEMP140 =
              (X10_TEMP23);
            
//#line 1065
final double X10_TEMP24 =
              (X10_TEMP140);
            
//#line 1066
final double X10_TEMP144 =
              (X10_TEMP24);
            
//#line 1068
final double X10_TEMP147 =
              (X10_TEMP144);
            
//#line 1069
/* template:array_set { */(start_time).set((X10_TEMP147),i)/* } */;
            
//#line 1070
final int X10_TEMP149 =
              (0);
            
//#line 1072
final double X10_TEMP28 =
              (X10_TEMP149);
            
//#line 1073
final double X10_TEMP152 =
              (X10_TEMP28);
            
//#line 1075
final double X10_TEMP29 =
              (X10_TEMP152);
            
//#line 1076
final double X10_TEMP156 =
              (X10_TEMP29);
            
//#line 1078
final double X10_TEMP159 =
              (X10_TEMP156);
            
//#line 1079
/* template:array_set { */(elapsed_time).set((X10_TEMP159),i)/* } */;
            
//#line 1080
final int X10_TEMP161 =
              (0);
            
//#line 1082
final double X10_TEMP33 =
              (X10_TEMP161);
            
//#line 1083
final double X10_TEMP164 =
              (X10_TEMP33);
            
//#line 1085
final double X10_TEMP34 =
              (X10_TEMP164);
            
//#line 1086
final double X10_TEMP168 =
              (X10_TEMP34);
            
//#line 1088
final double X10_TEMP171 =
              (X10_TEMP168);
            
//#line 1089
/* template:array_set { */(total_time).set((X10_TEMP171),i)/* } */;
            
//#line 1090
final int X10_TEMP173 =
              (i);
            
//#line 1092
final int X10_TEMP35 =
              (X10_TEMP173);
            
//#line 1093
final int X10_TEMP36 =
              (1);
            
//#line 1094
final int X10_TEMP177 =
              (i +
                 X10_TEMP36);
            
//#line 1095
i =
              ((X10_TEMP177));
            
//#line 1096
final int X10_TEMP179 =
              (Program0.
                 _Program__Timer_max_counters);
            
//#line 1098
final int X10_TEMP17 =
              (X10_TEMP179);
            
//#line 1099
final boolean X10_TEMP182 =
              (i <
                 X10_TEMP17);
            
//#line 1100
X10_TEMP19 =
              ((X10_TEMP182));
            
//#line 1101
X10_TEMP135 =
              X10_TEMP19;
        }
    }
}
