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
      _Program__md_ITERS =
      Program0.
        _Program__md_ITERS_init();
    
//#line 10
final public static double
      _Program__md_LENGTH =
      Program0.
        _Program__md_LENGTH_init();
    
//#line 11
final public static double
      _Program__md_m =
      Program0.
        _Program__md_m_init();
    
//#line 12
final public static double
      _Program__md_mu =
      Program0.
        _Program__md_mu_init();
    
//#line 13
final public static double
      _Program__md_kb =
      Program0.
        _Program__md_kb_init();
    
//#line 14
final public static double
      _Program__md_TSIM =
      Program0.
        _Program__md_TSIM_init();
    
//#line 15
final public static double
      _Program__md_deltat =
      Program0.
        _Program__md_deltat_init();
    
//#line 16
final public static double
      _Program__md_den =
      Program0.
        _Program__md_den_init();
    
//#line 17
final public static double
      _Program__md_tref =
      Program0.
        _Program__md_tref_init();
    
//#line 18
final public static double
      _Program__md_h =
      Program0.
        _Program__md_h_init();
    
//#line 19
final public static int
      _Program__md_irep =
      Program0.
        _Program__md_irep_init();
    
//#line 20
final public static int
      _Program__md_istop =
      Program0.
        _Program__md_istop_init();
    
//#line 21
final public static int
      _Program__md_iprint =
      Program0.
        _Program__md_iprint_init();
    
//#line 22
final public static int
      _Program__md_movemx =
      Program0.
        _Program__md_movemx_init();
    
//#line 23
final public static x10.
      lang.
      dist
      _Program__md_D =
      Program0.
        _Program__md_D_init();
    
//#line 24
final public static x10.
      lang.
      GenericReferenceArray
      _Program__md_P =
      Program0.
        _Program__md_P_init();
    
    
//#line 27
public static void
                  runMain(
                  ) {
        
//#line 28
Program0.
                      Program_runMain();
    }
    
    
//#line 30
public static int
                  _Program__md_ITERS_init(
                  ) {
        
//#line 32
final int X10_TEMP578 =
          (Program0.
             Program__md_ITERS_init());
        
//#line 33
return X10_TEMP578;
    }
    
    
//#line 35
public static double
                  _Program__md_LENGTH_init(
                  ) {
        
//#line 37
final double X10_TEMP578 =
          (Program0.
             Program__md_LENGTH_init());
        
//#line 38
return X10_TEMP578;
    }
    
    
//#line 40
public static double
                  _Program__md_m_init(
                  ) {
        
//#line 42
final double X10_TEMP578 =
          (Program0.
             Program__md_m_init());
        
//#line 43
return X10_TEMP578;
    }
    
    
//#line 45
public static double
                  _Program__md_mu_init(
                  ) {
        
//#line 47
final double X10_TEMP578 =
          (Program0.
             Program__md_mu_init());
        
//#line 48
return X10_TEMP578;
    }
    
    
//#line 50
public static double
                  _Program__md_kb_init(
                  ) {
        
//#line 52
final double X10_TEMP578 =
          (Program0.
             Program__md_kb_init());
        
//#line 53
return X10_TEMP578;
    }
    
    
//#line 55
public static double
                  _Program__md_TSIM_init(
                  ) {
        
//#line 57
final double X10_TEMP578 =
          (Program0.
             Program__md_TSIM_init());
        
//#line 58
return X10_TEMP578;
    }
    
    
//#line 60
public static double
                  _Program__md_deltat_init(
                  ) {
        
//#line 62
final double X10_TEMP578 =
          (Program0.
             Program__md_deltat_init());
        
//#line 63
return X10_TEMP578;
    }
    
    
//#line 65
public static double
                  _Program__md_den_init(
                  ) {
        
//#line 67
final double X10_TEMP578 =
          (Program0.
             Program__md_den_init());
        
//#line 68
return X10_TEMP578;
    }
    
    
//#line 70
public static double
                  _Program__md_tref_init(
                  ) {
        
//#line 72
final double X10_TEMP578 =
          (Program0.
             Program__md_tref_init());
        
//#line 73
return X10_TEMP578;
    }
    
    
//#line 75
public static double
                  _Program__md_h_init(
                  ) {
        
//#line 77
final double X10_TEMP578 =
          (Program0.
             Program__md_h_init());
        
//#line 78
return X10_TEMP578;
    }
    
    
//#line 80
public static int
                  _Program__md_irep_init(
                  ) {
        
//#line 82
final int X10_TEMP578 =
          (Program0.
             Program__md_irep_init());
        
//#line 83
return X10_TEMP578;
    }
    
    
//#line 85
public static int
                  _Program__md_istop_init(
                  ) {
        
//#line 87
final int X10_TEMP578 =
          (Program0.
             Program__md_istop_init());
        
//#line 88
return X10_TEMP578;
    }
    
    
//#line 90
public static int
                  _Program__md_iprint_init(
                  ) {
        
//#line 92
final int X10_TEMP578 =
          (Program0.
             Program__md_iprint_init());
        
//#line 93
return X10_TEMP578;
    }
    
    
//#line 95
public static int
                  _Program__md_movemx_init(
                  ) {
        
//#line 97
final int X10_TEMP578 =
          (Program0.
             Program__md_movemx_init());
        
//#line 98
return X10_TEMP578;
    }
    
    
//#line 100
public static x10.
                   lang.
                   dist
                   _Program__md_D_init(
                   ) {
        
//#line 102
final x10.
          lang.
          dist X10_TEMP578 =
          (x10.
            lang.
            dist)
            ((Program0.
                Program__md_D_init()));
        
//#line 103
return X10_TEMP578;
    }
    
    
//#line 105
public static x10.
                   lang.
                   GenericReferenceArray
                   _Program__md_P_init(
                   ) {
        
//#line 107
final x10.
          lang.
          GenericReferenceArray X10_TEMP578 =
          (x10.
            lang.
            GenericReferenceArray)
            ((Program0.
                Program__md_P_init()));
        
//#line 108
return X10_TEMP578;
    }
    
    
//#line 110
public static void
                   Program_runMain(
                   ) {
        
//#line 111
Program0.
                       Program_md_exec();
    }
    
    
//#line 113
public static int
                   Program__md_ITERS_init(
                   ) {
        
//#line 114
final int X10_TEMP578 =
          (100);
        
//#line 116
final int X10_TEMP2 =
          (X10_TEMP578);
        
//#line 117
return X10_TEMP2;
    }
    
    
//#line 119
public static double
                   Program__md_LENGTH_init(
                   ) {
        
//#line 120
final double X10_TEMP578 =
          (5.0E-9);
        
//#line 122
final double X10_TEMP2 =
          (X10_TEMP578);
        
//#line 123
return X10_TEMP2;
    }
    
    
//#line 125
public static double
                   Program__md_m_init(
                   ) {
        
//#line 126
final double X10_TEMP578 =
          (4.0026);
        
//#line 128
final double X10_TEMP2 =
          (X10_TEMP578);
        
//#line 129
return X10_TEMP2;
    }
    
    
//#line 131
public static double
                   Program__md_mu_init(
                   ) {
        
//#line 132
final double X10_TEMP578 =
          (1.66056E-27);
        
//#line 134
final double X10_TEMP2 =
          (X10_TEMP578);
        
//#line 135
return X10_TEMP2;
    }
    
    
//#line 137
public static double
                   Program__md_kb_init(
                   ) {
        
//#line 138
final double X10_TEMP578 =
          (1.38066E-23);
        
//#line 140
final double X10_TEMP2 =
          (X10_TEMP578);
        
//#line 141
return X10_TEMP2;
    }
    
    
//#line 143
public static double
                   Program__md_TSIM_init(
                   ) {
        
//#line 144
final int X10_TEMP578 =
          (50);
        
//#line 146
final double X10_TEMP2 =
          (X10_TEMP578);
        
//#line 147
return X10_TEMP2;
    }
    
    
//#line 149
public static double
                   Program__md_deltat_init(
                   ) {
        
//#line 150
final double X10_TEMP578 =
          (5.0E-16);
        
//#line 152
final double X10_TEMP2 =
          (X10_TEMP578);
        
//#line 153
return X10_TEMP2;
    }
    
    
//#line 155
public static double
                   Program__md_den_init(
                   ) {
        
//#line 156
final double X10_TEMP578 =
          (0.83134);
        
//#line 158
final double X10_TEMP2 =
          (X10_TEMP578);
        
//#line 159
return X10_TEMP2;
    }
    
    
//#line 161
public static double
                   Program__md_tref_init(
                   ) {
        
//#line 162
final double X10_TEMP578 =
          (0.722);
        
//#line 164
final double X10_TEMP2 =
          (X10_TEMP578);
        
//#line 165
return X10_TEMP2;
    }
    
    
//#line 167
public static double
                   Program__md_h_init(
                   ) {
        
//#line 168
final double X10_TEMP578 =
          (0.064);
        
//#line 170
final double X10_TEMP2 =
          (X10_TEMP578);
        
//#line 171
return X10_TEMP2;
    }
    
    
//#line 173
public static int
                   Program__md_irep_init(
                   ) {
        
//#line 174
final int X10_TEMP578 =
          (10);
        
//#line 176
final int X10_TEMP2 =
          (X10_TEMP578);
        
//#line 177
return X10_TEMP2;
    }
    
    
//#line 179
public static int
                   Program__md_istop_init(
                   ) {
        
//#line 180
final int X10_TEMP578 =
          (19);
        
//#line 182
final int X10_TEMP2 =
          (X10_TEMP578);
        
//#line 183
return X10_TEMP2;
    }
    
    
//#line 185
public static int
                   Program__md_iprint_init(
                   ) {
        
//#line 186
final int X10_TEMP578 =
          (10);
        
//#line 188
final int X10_TEMP2 =
          (X10_TEMP578);
        
//#line 189
return X10_TEMP2;
    }
    
    
//#line 191
public static int
                   Program__md_movemx_init(
                   ) {
        
//#line 192
final int X10_TEMP578 =
          (50);
        
//#line 194
final int X10_TEMP2 =
          (X10_TEMP578);
        
//#line 195
return X10_TEMP2;
    }
    
    
//#line 197
public static x10.
                   lang.
                   dist
                   Program__md_D_init(
                   ) {
        
//#line 198
final x10.
          lang.
          dist X10_TEMP578 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                UNIQUE));
        
//#line 200
final x10.
          lang.
          dist X10_TEMP1 =
          (x10.
            lang.
            dist)
            ((X10_TEMP578));
        
//#line 201
return X10_TEMP1;
    }
    
    
//#line 203
public static x10.
                   lang.
                   GenericReferenceArray
                   Program__md_P_init(
                   ) {
        
//#line 204
final x10.
          lang.
          GenericReferenceArray X10_TEMP582 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(_Program__md_D,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                lang.
                point pt/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 205
final md X10_TEMP578 =
                    (new md(
                       ));
                  
//#line 207
final md X10_TEMP2 =
                    (X10_TEMP578);
                  
//#line 208
return X10_TEMP2;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 213
final x10.
          lang.
          GenericReferenceArray X10_TEMP4 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP582));
        
//#line 214
return X10_TEMP4;
    }
    
    
//#line 216
public static void
                   Program_md_exec(
                   ) {
        
//#line 217
Program0.
                       Program_md_init();
        
//#line 218
Program0.
                       Program_md_run();
        
//#line 219
Program0.
                       Program_md_validate();
    }
    
    
//#line 221
public static void
                   Program_md_init(
                   ) {
        
//#line 222
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 223
/* template:forloop-mult { */{
            x10.lang.region __var26__ = (x10.lang.region) _Program__md_D.
                                                            region;
            if (__var26__.size() > 0 && (__var26__ instanceof x10.array.MultiDimRegion || __var26__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var27__ = __var26__.rank(0).low(), __var28__ = __var26__.rank(0).high(); __var27__ <= __var28__; __var27__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int j = __var27__;
            /* } */
            /* } */
/* Join: { *//* template:point-create { */
            final  x10.
              lang.
              point X10_TEMP3 = point.factory.point(/* Join: { */__var27__/* } */);/* } */
{
                
//#line 224
final x10.
                  lang.
                  dist X10_TEMP579 =
                  (x10.
                    lang.
                    dist)
                    ((_Program__md_D.
                        distribution));
                
//#line 226
final x10.
                  lang.
                  dist X10_TEMP2 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP579));
                
//#line 227
final x10.
                  lang.
                  place X10_TEMP4 =
                  (X10_TEMP2.
                     get(
                     X10_TEMP3));
                
//#line 228
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP4)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 229
final md X10_TEMP586 =
                      (/* template:parametric { */((md)(/* template:array_get { */((_Program__md_P).get(j))/* } */))/* } */);
                    
//#line 231
final md X10_TEMP7 =
                      (X10_TEMP586);
                    
//#line 232
final int X10_TEMP589 =
                      (x10.
                         lang.
                         place.
                         MAX_PLACES);
                    
//#line 234
final int X10_TEMP10 =
                      (X10_TEMP589);
                    
//#line 235
Program0.
                                   Program_md_initialise(
                                   X10_TEMP7,
                                   j,
                                   X10_TEMP10);
                }
                		}
                	});/* } */
            }/* } *//* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator X10_TEMP3__ = (__var26__).iterator(); X10_TEMP3__.hasNext(); ) {
            	final  x10.
              lang.
              point X10_TEMP3 = (x10.
              lang.
              point) X10_TEMP3__.next();
            	/* Join: { *//* Join: { */final int j =
              /* template:array_get { */((X10_TEMP3).get(0))/* } */;/* } */
{
                
//#line 224
final x10.
                  lang.
                  dist X10_TEMP579 =
                  (x10.
                    lang.
                    dist)
                    ((_Program__md_D.
                        distribution));
                
//#line 226
final x10.
                  lang.
                  dist X10_TEMP2 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP579));
                
//#line 227
final x10.
                  lang.
                  place X10_TEMP4 =
                  (X10_TEMP2.
                     get(
                     X10_TEMP3));
                
//#line 228
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP4)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 229
final md X10_TEMP586 =
                      (/* template:parametric { */((md)(/* template:array_get { */((_Program__md_P).get(j))/* } */))/* } */);
                    
//#line 231
final md X10_TEMP7 =
                      (X10_TEMP586);
                    
//#line 232
final int X10_TEMP589 =
                      (x10.
                         lang.
                         place.
                         MAX_PLACES);
                    
//#line 234
final int X10_TEMP10 =
                      (X10_TEMP589);
                    
//#line 235
Program0.
                                   Program_md_initialise(
                                   X10_TEMP7,
                                   j,
                                   X10_TEMP10);
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
        	} catch (Throwable tmp25) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp25);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 240
public static void
                   Program_md_run(
                   ) {
        
//#line 241
final int X10_TEMP578 =
          (0);
        
//#line 243
int n =
          (X10_TEMP578);
        
//#line 244
final int X10_TEMP581 =
          (0);
        
//#line 246
final int X10_TEMP5 =
          (X10_TEMP581);
        
//#line 247
final int X10_TEMP584 =
          (1);
        
//#line 249
final int X10_TEMP3 =
          (X10_TEMP584);
        
//#line 250
final int X10_TEMP587 =
          (_Program__md_movemx -
             X10_TEMP3);
        
//#line 252
final int X10_TEMP6 =
          (X10_TEMP587);
        
//#line 253
final x10.
          lang.
          region X10_TEMP592 =
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
        
//#line 255
final x10.
          lang.
          region X10_TEMP8 =
          (x10.
            lang.
            region)
            ((X10_TEMP592));
        
//#line 256
/* template:forloop-mult { */{
        x10.lang.region __var29__ = (x10.lang.region) X10_TEMP8;
        if (__var29__.size() > 0 && (__var29__ instanceof x10.array.MultiDimRegion || __var29__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var30__ = __var29__.rank(0).low(), __var31__ = __var29__.rank(0).high(); __var30__ <= __var31__; __var30__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int move = __var30__;
        /* } */
        /* } */
{
            
//#line 257
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 258
/* template:forloop-mult { */{
                x10.lang.region __var33__ = (x10.lang.region) _Program__md_D.
                                                                region;
                if (__var33__.size() > 0 && (__var33__ instanceof x10.array.MultiDimRegion || __var33__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var34__ = __var33__.rank(0).low(), __var35__ = __var33__.rank(0).high(); __var34__ <= __var35__; __var34__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var34__;
                /* } */
                /* } */
/* Join: { *//* template:point-create { */
                final  x10.
                  lang.
                  point X10_TEMP11 = point.factory.point(/* Join: { */__var34__/* } */);/* } */
{
                    
//#line 259
final x10.
                      lang.
                      dist X10_TEMP597 =
                      (x10.
                        lang.
                        dist)
                        ((_Program__md_D.
                            distribution));
                    
//#line 261
final x10.
                      lang.
                      dist X10_TEMP10 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP597));
                    
//#line 262
final x10.
                      lang.
                      place X10_TEMP12 =
                      (X10_TEMP10.
                         get(
                         X10_TEMP11));
                    
//#line 263
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP12)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 264
final md X10_TEMP604 =
                          (/* template:parametric { */((md)(/* template:array_get { */((_Program__md_P).get(j))/* } */))/* } */);
                        
//#line 266
final md X10_TEMP14 =
                          (X10_TEMP604);
                        
//#line 267
Program0.
                                       Program_md_runiters1(
                                       X10_TEMP14);
                    }
                    		}
                    	});/* } */
                }/* } *//* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator X10_TEMP11__ = (__var33__).iterator(); X10_TEMP11__.hasNext(); ) {
                	final  x10.
                  lang.
                  point X10_TEMP11 = (x10.
                  lang.
                  point) X10_TEMP11__.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((X10_TEMP11).get(0))/* } */;/* } */
{
                    
//#line 259
final x10.
                      lang.
                      dist X10_TEMP597 =
                      (x10.
                        lang.
                        dist)
                        ((_Program__md_D.
                            distribution));
                    
//#line 261
final x10.
                      lang.
                      dist X10_TEMP10 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP597));
                    
//#line 262
final x10.
                      lang.
                      place X10_TEMP12 =
                      (X10_TEMP10.
                         get(
                         X10_TEMP11));
                    
//#line 263
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP12)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 264
final md X10_TEMP604 =
                          (/* template:parametric { */((md)(/* template:array_get { */((_Program__md_P).get(j))/* } */))/* } */);
                        
//#line 266
final md X10_TEMP14 =
                          (X10_TEMP604);
                        
//#line 267
Program0.
                                       Program_md_runiters1(
                                       X10_TEMP14);
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
            	} catch (Throwable tmp32) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp32);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 271
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 272
/* template:forloop-mult { */{
                x10.lang.region __var37__ = (x10.lang.region) _Program__md_D.
                                                                region;
                if (__var37__.size() > 0 && (__var37__ instanceof x10.array.MultiDimRegion || __var37__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var38__ = __var37__.rank(0).low(), __var39__ = __var37__.rank(0).high(); __var38__ <= __var39__; __var38__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var38__;
                /* } */
                /* } */
/* Join: { *//* template:point-create { */
                final  x10.
                  lang.
                  point X10_TEMP17 = point.factory.point(/* Join: { */__var38__/* } */);/* } */
{
                    
//#line 273
final x10.
                      lang.
                      dist X10_TEMP609 =
                      (x10.
                        lang.
                        dist)
                        ((_Program__md_D.
                            distribution));
                    
//#line 275
final x10.
                      lang.
                      dist X10_TEMP16 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP609));
                    
//#line 276
final x10.
                      lang.
                      place X10_TEMP18 =
                      (X10_TEMP16.
                         get(
                         X10_TEMP17));
                    
//#line 277
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP18)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 278
final md X10_TEMP616 =
                          (/* template:parametric { */((md)(/* template:array_get { */((_Program__md_P).get(j))/* } */))/* } */);
                        
//#line 280
final md X10_TEMP20 =
                          (X10_TEMP616);
                        
//#line 281
Program0.
                                       Program_md_runiters2(
                                       X10_TEMP20);
                    }
                    		}
                    	});/* } */
                }/* } *//* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator X10_TEMP17__ = (__var37__).iterator(); X10_TEMP17__.hasNext(); ) {
                	final  x10.
                  lang.
                  point X10_TEMP17 = (x10.
                  lang.
                  point) X10_TEMP17__.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((X10_TEMP17).get(0))/* } */;/* } */
{
                    
//#line 273
final x10.
                      lang.
                      dist X10_TEMP609 =
                      (x10.
                        lang.
                        dist)
                        ((_Program__md_D.
                            distribution));
                    
//#line 275
final x10.
                      lang.
                      dist X10_TEMP16 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP609));
                    
//#line 276
final x10.
                      lang.
                      place X10_TEMP18 =
                      (X10_TEMP16.
                         get(
                         X10_TEMP17));
                    
//#line 277
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP18)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 278
final md X10_TEMP616 =
                          (/* template:parametric { */((md)(/* template:array_get { */((_Program__md_P).get(j))/* } */))/* } */);
                        
//#line 280
final md X10_TEMP20 =
                          (X10_TEMP616);
                        
//#line 281
Program0.
                                       Program_md_runiters2(
                                       X10_TEMP20);
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
            	} catch (Throwable tmp36) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp36);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 285
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 286
/* template:forloop-mult { */{
                x10.lang.region __var41__ = (x10.lang.region) _Program__md_D.
                                                                region;
                if (__var41__.size() > 0 && (__var41__ instanceof x10.array.MultiDimRegion || __var41__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var42__ = __var41__.rank(0).low(), __var43__ = __var41__.rank(0).high(); __var42__ <= __var43__; __var42__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var42__;
                /* } */
                /* } */
/* Join: { *//* template:point-create { */
                final  x10.
                  lang.
                  point X10_TEMP23 = point.factory.point(/* Join: { */__var42__/* } */);/* } */
{
                    
//#line 287
final x10.
                      lang.
                      dist X10_TEMP621 =
                      (x10.
                        lang.
                        dist)
                        ((_Program__md_D.
                            distribution));
                    
//#line 289
final x10.
                      lang.
                      dist X10_TEMP22 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP621));
                    
//#line 290
final x10.
                      lang.
                      place X10_TEMP24 =
                      (X10_TEMP22.
                         get(
                         X10_TEMP23));
                    
//#line 291
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP24)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 292
final md X10_TEMP628 =
                          (/* template:parametric { */((md)(/* template:array_get { */((_Program__md_P).get(j))/* } */))/* } */);
                        
//#line 294
final md X10_TEMP26 =
                          (X10_TEMP628);
                        
//#line 295
Program0.
                                       Program_md_runiters3(
                                       X10_TEMP26,
                                       move);
                    }
                    		}
                    	});/* } */
                }/* } *//* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator X10_TEMP23__ = (__var41__).iterator(); X10_TEMP23__.hasNext(); ) {
                	final  x10.
                  lang.
                  point X10_TEMP23 = (x10.
                  lang.
                  point) X10_TEMP23__.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((X10_TEMP23).get(0))/* } */;/* } */
{
                    
//#line 287
final x10.
                      lang.
                      dist X10_TEMP621 =
                      (x10.
                        lang.
                        dist)
                        ((_Program__md_D.
                            distribution));
                    
//#line 289
final x10.
                      lang.
                      dist X10_TEMP22 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP621));
                    
//#line 290
final x10.
                      lang.
                      place X10_TEMP24 =
                      (X10_TEMP22.
                         get(
                         X10_TEMP23));
                    
//#line 291
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP24)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 292
final md X10_TEMP628 =
                          (/* template:parametric { */((md)(/* template:array_get { */((_Program__md_P).get(j))/* } */))/* } */);
                        
//#line 294
final md X10_TEMP26 =
                          (X10_TEMP628);
                        
//#line 295
Program0.
                                       Program_md_runiters3(
                                       X10_TEMP26,
                                       move);
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
            	} catch (Throwable tmp40) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp40);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var0____ = (__var29__).iterator(); __var0____.hasNext(); ) {
        	final  x10.
          lang.
          point __var0__ = (x10.
          lang.
          point) __var0____.next();
        	/* Join: { *//* Join: { */final int move =
          /* template:array_get { */((__var0__).get(0))/* } */;/* } */
{
            
//#line 257
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 258
/* template:forloop-mult { */{
                x10.lang.region __var45__ = (x10.lang.region) _Program__md_D.
                                                                region;
                if (__var45__.size() > 0 && (__var45__ instanceof x10.array.MultiDimRegion || __var45__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var46__ = __var45__.rank(0).low(), __var47__ = __var45__.rank(0).high(); __var46__ <= __var47__; __var46__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var46__;
                /* } */
                /* } */
/* Join: { *//* template:point-create { */
                final  x10.
                  lang.
                  point X10_TEMP11 = point.factory.point(/* Join: { */__var46__/* } */);/* } */
{
                    
//#line 259
final x10.
                      lang.
                      dist X10_TEMP597 =
                      (x10.
                        lang.
                        dist)
                        ((_Program__md_D.
                            distribution));
                    
//#line 261
final x10.
                      lang.
                      dist X10_TEMP10 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP597));
                    
//#line 262
final x10.
                      lang.
                      place X10_TEMP12 =
                      (X10_TEMP10.
                         get(
                         X10_TEMP11));
                    
//#line 263
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP12)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 264
final md X10_TEMP604 =
                          (/* template:parametric { */((md)(/* template:array_get { */((_Program__md_P).get(j))/* } */))/* } */);
                        
//#line 266
final md X10_TEMP14 =
                          (X10_TEMP604);
                        
//#line 267
Program0.
                                       Program_md_runiters1(
                                       X10_TEMP14);
                    }
                    		}
                    	});/* } */
                }/* } *//* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator X10_TEMP11__ = (__var45__).iterator(); X10_TEMP11__.hasNext(); ) {
                	final  x10.
                  lang.
                  point X10_TEMP11 = (x10.
                  lang.
                  point) X10_TEMP11__.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((X10_TEMP11).get(0))/* } */;/* } */
{
                    
//#line 259
final x10.
                      lang.
                      dist X10_TEMP597 =
                      (x10.
                        lang.
                        dist)
                        ((_Program__md_D.
                            distribution));
                    
//#line 261
final x10.
                      lang.
                      dist X10_TEMP10 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP597));
                    
//#line 262
final x10.
                      lang.
                      place X10_TEMP12 =
                      (X10_TEMP10.
                         get(
                         X10_TEMP11));
                    
//#line 263
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP12)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 264
final md X10_TEMP604 =
                          (/* template:parametric { */((md)(/* template:array_get { */((_Program__md_P).get(j))/* } */))/* } */);
                        
//#line 266
final md X10_TEMP14 =
                          (X10_TEMP604);
                        
//#line 267
Program0.
                                       Program_md_runiters1(
                                       X10_TEMP14);
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
            	} catch (Throwable tmp44) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp44);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 271
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 272
/* template:forloop-mult { */{
                x10.lang.region __var49__ = (x10.lang.region) _Program__md_D.
                                                                region;
                if (__var49__.size() > 0 && (__var49__ instanceof x10.array.MultiDimRegion || __var49__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var50__ = __var49__.rank(0).low(), __var51__ = __var49__.rank(0).high(); __var50__ <= __var51__; __var50__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var50__;
                /* } */
                /* } */
/* Join: { *//* template:point-create { */
                final  x10.
                  lang.
                  point X10_TEMP17 = point.factory.point(/* Join: { */__var50__/* } */);/* } */
{
                    
//#line 273
final x10.
                      lang.
                      dist X10_TEMP609 =
                      (x10.
                        lang.
                        dist)
                        ((_Program__md_D.
                            distribution));
                    
//#line 275
final x10.
                      lang.
                      dist X10_TEMP16 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP609));
                    
//#line 276
final x10.
                      lang.
                      place X10_TEMP18 =
                      (X10_TEMP16.
                         get(
                         X10_TEMP17));
                    
//#line 277
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP18)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 278
final md X10_TEMP616 =
                          (/* template:parametric { */((md)(/* template:array_get { */((_Program__md_P).get(j))/* } */))/* } */);
                        
//#line 280
final md X10_TEMP20 =
                          (X10_TEMP616);
                        
//#line 281
Program0.
                                       Program_md_runiters2(
                                       X10_TEMP20);
                    }
                    		}
                    	});/* } */
                }/* } *//* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator X10_TEMP17__ = (__var49__).iterator(); X10_TEMP17__.hasNext(); ) {
                	final  x10.
                  lang.
                  point X10_TEMP17 = (x10.
                  lang.
                  point) X10_TEMP17__.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((X10_TEMP17).get(0))/* } */;/* } */
{
                    
//#line 273
final x10.
                      lang.
                      dist X10_TEMP609 =
                      (x10.
                        lang.
                        dist)
                        ((_Program__md_D.
                            distribution));
                    
//#line 275
final x10.
                      lang.
                      dist X10_TEMP16 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP609));
                    
//#line 276
final x10.
                      lang.
                      place X10_TEMP18 =
                      (X10_TEMP16.
                         get(
                         X10_TEMP17));
                    
//#line 277
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP18)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 278
final md X10_TEMP616 =
                          (/* template:parametric { */((md)(/* template:array_get { */((_Program__md_P).get(j))/* } */))/* } */);
                        
//#line 280
final md X10_TEMP20 =
                          (X10_TEMP616);
                        
//#line 281
Program0.
                                       Program_md_runiters2(
                                       X10_TEMP20);
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
            	} catch (Throwable tmp48) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp48);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 285
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 286
/* template:forloop-mult { */{
                x10.lang.region __var53__ = (x10.lang.region) _Program__md_D.
                                                                region;
                if (__var53__.size() > 0 && (__var53__ instanceof x10.array.MultiDimRegion || __var53__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var54__ = __var53__.rank(0).low(), __var55__ = __var53__.rank(0).high(); __var54__ <= __var55__; __var54__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var54__;
                /* } */
                /* } */
/* Join: { *//* template:point-create { */
                final  x10.
                  lang.
                  point X10_TEMP23 = point.factory.point(/* Join: { */__var54__/* } */);/* } */
{
                    
//#line 287
final x10.
                      lang.
                      dist X10_TEMP621 =
                      (x10.
                        lang.
                        dist)
                        ((_Program__md_D.
                            distribution));
                    
//#line 289
final x10.
                      lang.
                      dist X10_TEMP22 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP621));
                    
//#line 290
final x10.
                      lang.
                      place X10_TEMP24 =
                      (X10_TEMP22.
                         get(
                         X10_TEMP23));
                    
//#line 291
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP24)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 292
final md X10_TEMP628 =
                          (/* template:parametric { */((md)(/* template:array_get { */((_Program__md_P).get(j))/* } */))/* } */);
                        
//#line 294
final md X10_TEMP26 =
                          (X10_TEMP628);
                        
//#line 295
Program0.
                                       Program_md_runiters3(
                                       X10_TEMP26,
                                       move);
                    }
                    		}
                    	});/* } */
                }/* } *//* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator X10_TEMP23__ = (__var53__).iterator(); X10_TEMP23__.hasNext(); ) {
                	final  x10.
                  lang.
                  point X10_TEMP23 = (x10.
                  lang.
                  point) X10_TEMP23__.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((X10_TEMP23).get(0))/* } */;/* } */
{
                    
//#line 287
final x10.
                      lang.
                      dist X10_TEMP621 =
                      (x10.
                        lang.
                        dist)
                        ((_Program__md_D.
                            distribution));
                    
//#line 289
final x10.
                      lang.
                      dist X10_TEMP22 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP621));
                    
//#line 290
final x10.
                      lang.
                      place X10_TEMP24 =
                      (X10_TEMP22.
                         get(
                         X10_TEMP23));
                    
//#line 291
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP24)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 292
final md X10_TEMP628 =
                          (/* template:parametric { */((md)(/* template:array_get { */((_Program__md_P).get(j))/* } */))/* } */);
                        
//#line 294
final md X10_TEMP26 =
                          (X10_TEMP628);
                        
//#line 295
Program0.
                                       Program_md_runiters3(
                                       X10_TEMP26,
                                       move);
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
            	} catch (Throwable tmp52) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp52);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
    }
    
    
//#line 301
public static void
                   Program_md_validate(
                   ) {
        
//#line 302
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 303
/* template:forloop-mult { */{
            x10.lang.region __var57__ = (x10.lang.region) _Program__md_D.
                                                            region;
            if (__var57__.size() > 0 && (__var57__ instanceof x10.array.MultiDimRegion || __var57__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var58__ = __var57__.rank(0).low(), __var59__ = __var57__.rank(0).high(); __var58__ <= __var59__; __var58__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int j = __var58__;
            /* } */
            /* } */
/* Join: { *//* template:point-create { */
            final  x10.
              lang.
              point X10_TEMP3 = point.factory.point(/* Join: { */__var58__/* } */);/* } */
{
                
//#line 304
final x10.
                  lang.
                  dist X10_TEMP579 =
                  (x10.
                    lang.
                    dist)
                    ((_Program__md_D.
                        distribution));
                
//#line 306
final x10.
                  lang.
                  dist X10_TEMP2 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP579));
                
//#line 307
final x10.
                  lang.
                  place X10_TEMP4 =
                  (X10_TEMP2.
                     get(
                     X10_TEMP3));
                
//#line 308
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP4)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 309
final double X10_TEMP585 =
                      (275.97175611773514);
                    
//#line 311
double ref =
                      (X10_TEMP585);
                    
//#line 312
final md X10_TEMP589 =
                      (/* template:parametric { */((md)(/* template:array_get { */((_Program__md_P).get(j))/* } */))/* } */);
                    
//#line 314
final md X10_TEMP7 =
                      (X10_TEMP589);
                    
//#line 315
final double X10_TEMP592 =
                      (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP7))/* } */.ek);
                    
//#line 317
final double X10_TEMP8 =
                      (X10_TEMP592);
                    
//#line 318
final double X10_TEMP595 =
                      (X10_TEMP8 -
                         ref);
                    
//#line 320
final double X10_TEMP10 =
                      (X10_TEMP595);
                    
//#line 321
final double X10_TEMP599 =
                      (java.
                         lang.
                         Math.
                         abs(
                         X10_TEMP10));
                    
//#line 323
double dev =
                      (X10_TEMP599);
                    
//#line 324
final double X10_TEMP602 =
                      (1.0E-12);
                    
//#line 326
final double X10_TEMP12 =
                      (X10_TEMP602);
                    
//#line 327
final boolean X10_TEMP14 =
                      (dev >
                         X10_TEMP12);
                    
//#line 328
if (X10_TEMP14) {
                        
//#line 329
final java.
                          lang.
                          String X10_TEMP607 =
                          ("Validation failed at place: ");
                        
//#line 331
final java.
                          lang.
                          String X10_TEMP15 =
                          (X10_TEMP607);
                        
//#line 332
final java.
                          lang.
                          String X10_TEMP610 =
                          (X10_TEMP15 +
                           j);
                        
//#line 334
final java.
                          lang.
                          String X10_TEMP17 =
                          (X10_TEMP610);
                        
//#line 335
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                     lang.
                                                                                                                     System.
                                                                                                                     out))/* } */.println(X10_TEMP17);
                        
//#line 336
final java.
                          lang.
                          String X10_TEMP614 =
                          ("Kinetic energy = ");
                        
//#line 338
final java.
                          lang.
                          String X10_TEMP20 =
                          (X10_TEMP614);
                        
//#line 339
final md X10_TEMP618 =
                          (/* template:parametric { */((md)(/* template:array_get { */((_Program__md_P).get(j))/* } */))/* } */);
                        
//#line 341
final md X10_TEMP19 =
                          (X10_TEMP618);
                        
//#line 342
final double X10_TEMP621 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP19))/* } */.ek);
                        
//#line 344
final double X10_TEMP21 =
                          (X10_TEMP621);
                        
//#line 345
final java.
                          lang.
                          String X10_TEMP624 =
                          (X10_TEMP20 +
                           X10_TEMP21);
                        
//#line 347
final java.
                          lang.
                          String X10_TEMP22 =
                          (X10_TEMP624);
                        
//#line 348
final java.
                          lang.
                          String X10_TEMP627 =
                          (" ");
                        
//#line 350
final java.
                          lang.
                          String X10_TEMP23 =
                          (X10_TEMP627);
                        
//#line 351
final java.
                          lang.
                          String X10_TEMP630 =
                          (X10_TEMP22 +
                           X10_TEMP23);
                        
//#line 353
final java.
                          lang.
                          String X10_TEMP24 =
                          (X10_TEMP630);
                        
//#line 354
final java.
                          lang.
                          String X10_TEMP633 =
                          (X10_TEMP24 +
                           dev);
                        
//#line 356
final java.
                          lang.
                          String X10_TEMP25 =
                          (X10_TEMP633);
                        
//#line 357
final java.
                          lang.
                          String X10_TEMP636 =
                          (" ");
                        
//#line 359
final java.
                          lang.
                          String X10_TEMP26 =
                          (X10_TEMP636);
                        
//#line 360
final java.
                          lang.
                          String X10_TEMP639 =
                          (X10_TEMP25 +
                           X10_TEMP26);
                        
//#line 362
final java.
                          lang.
                          String X10_TEMP27 =
                          (X10_TEMP639);
                        
//#line 363
final java.
                          lang.
                          String X10_TEMP642 =
                          (X10_TEMP27 +
                           ref);
                        
//#line 365
final java.
                          lang.
                          String X10_TEMP29 =
                          (X10_TEMP642);
                        
//#line 366
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                     lang.
                                                                                                                     System.
                                                                                                                     out))/* } */.println(X10_TEMP29);
                        
//#line 367
final java.
                          lang.
                          String X10_TEMP646 =
                          ("Validation failed");
                        
//#line 369
final java.
                          lang.
                          String X10_TEMP31 =
                          (X10_TEMP646);
                        
//#line 370
throw new java.
                          lang.
                          RuntimeException(
                          X10_TEMP31);
                    }
                }
                		}
                	});/* } */
            }/* } *//* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator X10_TEMP3__ = (__var57__).iterator(); X10_TEMP3__.hasNext(); ) {
            	final  x10.
              lang.
              point X10_TEMP3 = (x10.
              lang.
              point) X10_TEMP3__.next();
            	/* Join: { *//* Join: { */final int j =
              /* template:array_get { */((X10_TEMP3).get(0))/* } */;/* } */
{
                
//#line 304
final x10.
                  lang.
                  dist X10_TEMP579 =
                  (x10.
                    lang.
                    dist)
                    ((_Program__md_D.
                        distribution));
                
//#line 306
final x10.
                  lang.
                  dist X10_TEMP2 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP579));
                
//#line 307
final x10.
                  lang.
                  place X10_TEMP4 =
                  (X10_TEMP2.
                     get(
                     X10_TEMP3));
                
//#line 308
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP4)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 309
final double X10_TEMP585 =
                      (275.97175611773514);
                    
//#line 311
double ref =
                      (X10_TEMP585);
                    
//#line 312
final md X10_TEMP589 =
                      (/* template:parametric { */((md)(/* template:array_get { */((_Program__md_P).get(j))/* } */))/* } */);
                    
//#line 314
final md X10_TEMP7 =
                      (X10_TEMP589);
                    
//#line 315
final double X10_TEMP592 =
                      (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP7))/* } */.ek);
                    
//#line 317
final double X10_TEMP8 =
                      (X10_TEMP592);
                    
//#line 318
final double X10_TEMP595 =
                      (X10_TEMP8 -
                         ref);
                    
//#line 320
final double X10_TEMP10 =
                      (X10_TEMP595);
                    
//#line 321
final double X10_TEMP599 =
                      (java.
                         lang.
                         Math.
                         abs(
                         X10_TEMP10));
                    
//#line 323
double dev =
                      (X10_TEMP599);
                    
//#line 324
final double X10_TEMP602 =
                      (1.0E-12);
                    
//#line 326
final double X10_TEMP12 =
                      (X10_TEMP602);
                    
//#line 327
final boolean X10_TEMP14 =
                      (dev >
                         X10_TEMP12);
                    
//#line 328
if (X10_TEMP14) {
                        
//#line 329
final java.
                          lang.
                          String X10_TEMP607 =
                          ("Validation failed at place: ");
                        
//#line 331
final java.
                          lang.
                          String X10_TEMP15 =
                          (X10_TEMP607);
                        
//#line 332
final java.
                          lang.
                          String X10_TEMP610 =
                          (X10_TEMP15 +
                           j);
                        
//#line 334
final java.
                          lang.
                          String X10_TEMP17 =
                          (X10_TEMP610);
                        
//#line 335
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                     lang.
                                                                                                                     System.
                                                                                                                     out))/* } */.println(X10_TEMP17);
                        
//#line 336
final java.
                          lang.
                          String X10_TEMP614 =
                          ("Kinetic energy = ");
                        
//#line 338
final java.
                          lang.
                          String X10_TEMP20 =
                          (X10_TEMP614);
                        
//#line 339
final md X10_TEMP618 =
                          (/* template:parametric { */((md)(/* template:array_get { */((_Program__md_P).get(j))/* } */))/* } */);
                        
//#line 341
final md X10_TEMP19 =
                          (X10_TEMP618);
                        
//#line 342
final double X10_TEMP621 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP19))/* } */.ek);
                        
//#line 344
final double X10_TEMP21 =
                          (X10_TEMP621);
                        
//#line 345
final java.
                          lang.
                          String X10_TEMP624 =
                          (X10_TEMP20 +
                           X10_TEMP21);
                        
//#line 347
final java.
                          lang.
                          String X10_TEMP22 =
                          (X10_TEMP624);
                        
//#line 348
final java.
                          lang.
                          String X10_TEMP627 =
                          (" ");
                        
//#line 350
final java.
                          lang.
                          String X10_TEMP23 =
                          (X10_TEMP627);
                        
//#line 351
final java.
                          lang.
                          String X10_TEMP630 =
                          (X10_TEMP22 +
                           X10_TEMP23);
                        
//#line 353
final java.
                          lang.
                          String X10_TEMP24 =
                          (X10_TEMP630);
                        
//#line 354
final java.
                          lang.
                          String X10_TEMP633 =
                          (X10_TEMP24 +
                           dev);
                        
//#line 356
final java.
                          lang.
                          String X10_TEMP25 =
                          (X10_TEMP633);
                        
//#line 357
final java.
                          lang.
                          String X10_TEMP636 =
                          (" ");
                        
//#line 359
final java.
                          lang.
                          String X10_TEMP26 =
                          (X10_TEMP636);
                        
//#line 360
final java.
                          lang.
                          String X10_TEMP639 =
                          (X10_TEMP25 +
                           X10_TEMP26);
                        
//#line 362
final java.
                          lang.
                          String X10_TEMP27 =
                          (X10_TEMP639);
                        
//#line 363
final java.
                          lang.
                          String X10_TEMP642 =
                          (X10_TEMP27 +
                           ref);
                        
//#line 365
final java.
                          lang.
                          String X10_TEMP29 =
                          (X10_TEMP642);
                        
//#line 366
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                     lang.
                                                                                                                     System.
                                                                                                                     out))/* } */.println(X10_TEMP29);
                        
//#line 367
final java.
                          lang.
                          String X10_TEMP646 =
                          ("Validation failed");
                        
//#line 369
final java.
                          lang.
                          String X10_TEMP31 =
                          (X10_TEMP646);
                        
//#line 370
throw new java.
                          lang.
                          RuntimeException(
                          X10_TEMP31);
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
        	} catch (Throwable tmp56) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp56);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 376
public static void
                   Program_md_initialise(
                   final md X10_TEMP0,
                   final int rank0,
                   final int nprocess0) {
        
//#line 377
int X10_TEMP1 =
          (rank0);
        
//#line 378
int X10_TEMP2 =
          (nprocess0);
        
//#line 379
final int X10_TEMP580 =
          (X10_TEMP1);
        
//#line 381
final int X10_TEMP5 =
          (X10_TEMP580);
        
//#line 382
final int X10_TEMP583 =
          (X10_TEMP5);
        
//#line 384
final int X10_TEMP586 =
          (X10_TEMP583);
        
//#line 385
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.rnk =
          ((X10_TEMP586));
        
//#line 386
final int X10_TEMP588 =
          (X10_TEMP2);
        
//#line 388
final int X10_TEMP8 =
          (X10_TEMP588);
        
//#line 389
final int X10_TEMP591 =
          (X10_TEMP8);
        
//#line 391
final int X10_TEMP594 =
          (X10_TEMP591);
        
//#line 392
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.nprocess =
          ((X10_TEMP594));
        
//#line 393
final double X10_TEMP596 =
          (0.0);
        
//#line 395
final double X10_TEMP11 =
          (X10_TEMP596);
        
//#line 396
final double X10_TEMP599 =
          (X10_TEMP11);
        
//#line 398
final double X10_TEMP12 =
          (X10_TEMP599);
        
//#line 399
final double X10_TEMP602 =
          (X10_TEMP12);
        
//#line 401
final double X10_TEMP605 =
          (X10_TEMP602);
        
//#line 402
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.vir =
          ((X10_TEMP605));
        
//#line 403
final double X10_TEMP607 =
          (0.0);
        
//#line 405
final double X10_TEMP15 =
          (X10_TEMP607);
        
//#line 406
final double X10_TEMP610 =
          (X10_TEMP15);
        
//#line 408
final double X10_TEMP16 =
          (X10_TEMP610);
        
//#line 409
final double X10_TEMP613 =
          (X10_TEMP16);
        
//#line 411
final double X10_TEMP616 =
          (X10_TEMP613);
        
//#line 412
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.epot =
          ((X10_TEMP616));
        
//#line 413
final int X10_TEMP618 =
          (0);
        
//#line 415
final int X10_TEMP19 =
          (X10_TEMP618);
        
//#line 416
final int X10_TEMP621 =
          (X10_TEMP19);
        
//#line 418
final int X10_TEMP20 =
          (X10_TEMP621);
        
//#line 419
final int X10_TEMP624 =
          (X10_TEMP20);
        
//#line 421
final int X10_TEMP627 =
          (X10_TEMP624);
        
//#line 422
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.interactions =
          ((X10_TEMP627));
        
//#line 423
final int X10_TEMP629 =
          (4);
        
//#line 425
int mm =
          (X10_TEMP629);
        
//#line 426
final int X10_TEMP632 =
          (mm *
             mm);
        
//#line 428
final int X10_TEMP22 =
          (X10_TEMP632);
        
//#line 429
final int X10_TEMP635 =
          (X10_TEMP22 *
             mm);
        
//#line 431
final int X10_TEMP23 =
          (X10_TEMP635);
        
//#line 432
final int X10_TEMP638 =
          (4);
        
//#line 434
final int X10_TEMP24 =
          (X10_TEMP638);
        
//#line 435
final int X10_TEMP641 =
          (X10_TEMP23 *
             X10_TEMP24);
        
//#line 437
int partsize =
          (X10_TEMP641);
        
//#line 438
final int X10_TEMP644 =
          (partsize);
        
//#line 440
final int X10_TEMP28 =
          (X10_TEMP644);
        
//#line 441
final int X10_TEMP647 =
          (X10_TEMP28);
        
//#line 443
final int X10_TEMP650 =
          (X10_TEMP647);
        
//#line 444
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize =
          ((X10_TEMP650));
        
//#line 445
final int X10_TEMP652 =
          (0);
        
//#line 447
final int X10_TEMP33 =
          (X10_TEMP652);
        
//#line 448
final int X10_TEMP655 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 450
final int X10_TEMP30 =
          (X10_TEMP655);
        
//#line 451
final int X10_TEMP658 =
          (1);
        
//#line 453
final int X10_TEMP31 =
          (X10_TEMP658);
        
//#line 454
final int X10_TEMP661 =
          (X10_TEMP30 -
             X10_TEMP31);
        
//#line 456
final int X10_TEMP34 =
          (X10_TEMP661);
        
//#line 457
final x10.
          lang.
          region X10_TEMP666 =
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
                  X10_TEMP33,
                  X10_TEMP34))));
        
//#line 459
final x10.
          lang.
          region X10_TEMP35 =
          (x10.
            lang.
            region)
            ((X10_TEMP666));
        
//#line 460
final x10.
          lang.
          place X10_TEMP669 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 462
final x10.
          lang.
          place X10_TEMP36 =
          (X10_TEMP669);
        
//#line 463
final x10.
          lang.
          dist X10_TEMP672 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                X10_TEMP35,
                X10_TEMP36)));
        
//#line 465
x10.
          lang.
          dist dOne =
          (x10.
            lang.
            dist)
            ((X10_TEMP672));
        
//#line 466
final x10.
          lang.
          GenericReferenceArray X10_TEMP675 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dOne,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 468
final x10.
          lang.
          GenericReferenceArray X10_TEMP40 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP675));
        
//#line 469
final x10.
          lang.
          GenericReferenceArray X10_TEMP678 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP40));
        
//#line 471
final x10.
          lang.
          GenericReferenceArray X10_TEMP41 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP678));
        
//#line 472
final x10.
          lang.
          GenericReferenceArray X10_TEMP681 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP41));
        
//#line 474
final x10.
          lang.
          GenericReferenceArray X10_TEMP684 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP681));
        
//#line 475
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one =
          ((X10_TEMP684));
        
//#line 476
final double X10_TEMP686 =
          (_Program__md_LENGTH);
        
//#line 478
final double X10_TEMP44 =
          (X10_TEMP686);
        
//#line 479
final double X10_TEMP689 =
          (X10_TEMP44);
        
//#line 481
final double X10_TEMP692 =
          (X10_TEMP689);
        
//#line 482
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.l =
          ((X10_TEMP692));
        
//#line 483
final int X10_TEMP694 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 485
final double X10_TEMP45 =
          (X10_TEMP694);
        
//#line 486
final double X10_TEMP697 =
          (X10_TEMP45 /
             _Program__md_den);
        
//#line 488
final double X10_TEMP47 =
          (X10_TEMP697);
        
//#line 489
final double X10_TEMP700 =
          (0.3333333);
        
//#line 491
final double X10_TEMP50 =
          (X10_TEMP700);
        
//#line 492
final double X10_TEMP705 =
          (java.
             lang.
             Math.
             pow(
             X10_TEMP47,
             X10_TEMP50));
        
//#line 494
final double X10_TEMP53 =
          (X10_TEMP705);
        
//#line 495
final double X10_TEMP708 =
          (X10_TEMP53);
        
//#line 497
final double X10_TEMP54 =
          (X10_TEMP708);
        
//#line 498
final double X10_TEMP711 =
          (X10_TEMP54);
        
//#line 500
final double X10_TEMP714 =
          (X10_TEMP711);
        
//#line 501
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.side =
          ((X10_TEMP714));
        
//#line 502
final double X10_TEMP716 =
          (4.0);
        
//#line 504
final double X10_TEMP55 =
          (X10_TEMP716);
        
//#line 505
final double X10_TEMP719 =
          (mm /
             X10_TEMP55);
        
//#line 507
final double X10_TEMP58 =
          (X10_TEMP719);
        
//#line 508
final double X10_TEMP722 =
          (X10_TEMP58);
        
//#line 510
final double X10_TEMP59 =
          (X10_TEMP722);
        
//#line 511
final double X10_TEMP725 =
          (X10_TEMP59);
        
//#line 513
final double X10_TEMP728 =
          (X10_TEMP725);
        
//#line 514
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.rcoff =
          ((X10_TEMP728));
        
//#line 515
final double X10_TEMP730 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.side);
        
//#line 517
final double X10_TEMP60 =
          (X10_TEMP730);
        
//#line 518
final double X10_TEMP733 =
          (X10_TEMP60 /
             mm);
        
//#line 520
final double X10_TEMP63 =
          (X10_TEMP733);
        
//#line 521
final double X10_TEMP736 =
          (X10_TEMP63);
        
//#line 523
final double X10_TEMP64 =
          (X10_TEMP736);
        
//#line 524
final double X10_TEMP739 =
          (X10_TEMP64);
        
//#line 526
final double X10_TEMP742 =
          (X10_TEMP739);
        
//#line 527
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a =
          ((X10_TEMP742));
        
//#line 528
final double X10_TEMP744 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.side);
        
//#line 530
final double X10_TEMP65 =
          (X10_TEMP744);
        
//#line 531
final double X10_TEMP747 =
          (0.5);
        
//#line 533
final double X10_TEMP66 =
          (X10_TEMP747);
        
//#line 534
final double X10_TEMP750 =
          (X10_TEMP65 *
             X10_TEMP66);
        
//#line 536
final double X10_TEMP69 =
          (X10_TEMP750);
        
//#line 537
final double X10_TEMP753 =
          (X10_TEMP69);
        
//#line 539
final double X10_TEMP70 =
          (X10_TEMP753);
        
//#line 540
final double X10_TEMP756 =
          (X10_TEMP70);
        
//#line 542
final double X10_TEMP759 =
          (X10_TEMP756);
        
//#line 543
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.sideh =
          ((X10_TEMP759));
        
//#line 544
final double X10_TEMP761 =
          (_Program__md_h *
             _Program__md_h);
        
//#line 546
final double X10_TEMP73 =
          (X10_TEMP761);
        
//#line 547
final double X10_TEMP764 =
          (X10_TEMP73);
        
//#line 549
final double X10_TEMP74 =
          (X10_TEMP764);
        
//#line 550
final double X10_TEMP767 =
          (X10_TEMP74);
        
//#line 552
final double X10_TEMP770 =
          (X10_TEMP767);
        
//#line 553
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.hsq =
          ((X10_TEMP770));
        
//#line 554
final double X10_TEMP772 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.hsq);
        
//#line 556
final double X10_TEMP75 =
          (X10_TEMP772);
        
//#line 557
final double X10_TEMP775 =
          (0.5);
        
//#line 559
final double X10_TEMP76 =
          (X10_TEMP775);
        
//#line 560
final double X10_TEMP778 =
          (X10_TEMP75 *
             X10_TEMP76);
        
//#line 562
final double X10_TEMP79 =
          (X10_TEMP778);
        
//#line 563
final double X10_TEMP781 =
          (X10_TEMP79);
        
//#line 565
final double X10_TEMP80 =
          (X10_TEMP781);
        
//#line 566
final double X10_TEMP784 =
          (X10_TEMP80);
        
//#line 568
final double X10_TEMP787 =
          (X10_TEMP784);
        
//#line 569
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.hsq2 =
          ((X10_TEMP787));
        
//#line 570
final int X10_TEMP789 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 572
final int X10_TEMP81 =
          (X10_TEMP789);
        
//#line 573
final int X10_TEMP792 =
          (1);
        
//#line 575
final int X10_TEMP82 =
          (X10_TEMP792);
        
//#line 576
final int X10_TEMP795 =
          (X10_TEMP81 -
             X10_TEMP82);
        
//#line 578
final int X10_TEMP85 =
          (X10_TEMP795);
        
//#line 579
final int X10_TEMP798 =
          (X10_TEMP85);
        
//#line 581
final int X10_TEMP86 =
          (X10_TEMP798);
        
//#line 582
final int X10_TEMP801 =
          (X10_TEMP86);
        
//#line 584
final int X10_TEMP804 =
          (X10_TEMP801);
        
//#line 585
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.npartm =
          ((X10_TEMP804));
        
//#line 586
final double X10_TEMP806 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.rcoff);
        
//#line 588
final double X10_TEMP87 =
          (X10_TEMP806);
        
//#line 589
final double X10_TEMP809 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.rcoff);
        
//#line 591
final double X10_TEMP88 =
          (X10_TEMP809);
        
//#line 592
final double X10_TEMP812 =
          (X10_TEMP87 *
             X10_TEMP88);
        
//#line 594
final double X10_TEMP91 =
          (X10_TEMP812);
        
//#line 595
final double X10_TEMP815 =
          (X10_TEMP91);
        
//#line 597
final double X10_TEMP92 =
          (X10_TEMP815);
        
//#line 598
final double X10_TEMP818 =
          (X10_TEMP92);
        
//#line 600
final double X10_TEMP821 =
          (X10_TEMP818);
        
//#line 601
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.rcoffs =
          ((X10_TEMP821));
        
//#line 602
final double X10_TEMP823 =
          (16.0);
        
//#line 604
final double X10_TEMP99 =
          (X10_TEMP823);
        
//#line 605
final double X10_TEMP826 =
          (1.0);
        
//#line 607
final double X10_TEMP93 =
          (X10_TEMP826);
        
//#line 608
final int X10_TEMP829 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 610
final int X10_TEMP94 =
          (X10_TEMP829);
        
//#line 611
final double X10_TEMP832 =
          (X10_TEMP93 *
             X10_TEMP94);
        
//#line 613
final double X10_TEMP95 =
          (X10_TEMP832);
        
//#line 614
final double X10_TEMP835 =
          (1.0);
        
//#line 616
final double X10_TEMP96 =
          (X10_TEMP835);
        
//#line 617
final double X10_TEMP838 =
          (X10_TEMP95 -
             X10_TEMP96);
        
//#line 619
final double X10_TEMP98 =
          (X10_TEMP838);
        
//#line 620
final double X10_TEMP841 =
          (X10_TEMP99 /
             X10_TEMP98);
        
//#line 622
final double X10_TEMP102 =
          (X10_TEMP841);
        
//#line 623
final double X10_TEMP844 =
          (X10_TEMP102);
        
//#line 625
final double X10_TEMP103 =
          (X10_TEMP844);
        
//#line 626
final double X10_TEMP847 =
          (X10_TEMP103);
        
//#line 628
final double X10_TEMP850 =
          (X10_TEMP847);
        
//#line 629
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.tscale =
          ((X10_TEMP850));
        
//#line 630
final double X10_TEMP852 =
          (1.13);
        
//#line 632
final double X10_TEMP107 =
          (X10_TEMP852);
        
//#line 633
final double X10_TEMP855 =
          (24.0);
        
//#line 635
final double X10_TEMP104 =
          (X10_TEMP855);
        
//#line 636
final double X10_TEMP858 =
          (_Program__md_tref /
             X10_TEMP104);
        
//#line 638
final double X10_TEMP106 =
          (X10_TEMP858);
        
//#line 639
final double X10_TEMP862 =
          (java.
             lang.
             Math.
             sqrt(
             X10_TEMP106));
        
//#line 641
final double X10_TEMP108 =
          (X10_TEMP862);
        
//#line 642
final double X10_TEMP865 =
          (X10_TEMP107 *
             X10_TEMP108);
        
//#line 644
final double X10_TEMP111 =
          (X10_TEMP865);
        
//#line 645
final double X10_TEMP868 =
          (X10_TEMP111);
        
//#line 647
final double X10_TEMP112 =
          (X10_TEMP868);
        
//#line 648
final double X10_TEMP871 =
          (X10_TEMP112);
        
//#line 650
final double X10_TEMP874 =
          (X10_TEMP871);
        
//#line 651
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.vaver =
          ((X10_TEMP874));
        
//#line 652
final double X10_TEMP876 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.vaver);
        
//#line 654
final double X10_TEMP113 =
          (X10_TEMP876);
        
//#line 655
final double X10_TEMP879 =
          (X10_TEMP113 *
             _Program__md_h);
        
//#line 657
final double X10_TEMP116 =
          (X10_TEMP879);
        
//#line 658
final double X10_TEMP882 =
          (X10_TEMP116);
        
//#line 660
final double X10_TEMP117 =
          (X10_TEMP882);
        
//#line 661
final double X10_TEMP885 =
          (X10_TEMP117);
        
//#line 663
final double X10_TEMP888 =
          (X10_TEMP885);
        
//#line 664
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.vaverh =
          ((X10_TEMP888));
        
//#line 665
final int X10_TEMP890 =
          (0);
        
//#line 667
int ijk =
          (X10_TEMP890);
        
//#line 668
final int X10_TEMP893 =
          (0);
        
//#line 670
final int X10_TEMP121 =
          (X10_TEMP893);
        
//#line 671
final int X10_TEMP896 =
          (1);
        
//#line 673
final int X10_TEMP122 =
          (X10_TEMP896);
        
//#line 674
final x10.
          lang.
          region X10_TEMP901 =
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
                  X10_TEMP121,
                  X10_TEMP122))));
        
//#line 676
final x10.
          lang.
          region X10_TEMP124 =
          (x10.
            lang.
            region)
            ((X10_TEMP901));
        
//#line 677
/* template:forloop-mult { */{
        x10.lang.region __var60__ = (x10.lang.region) X10_TEMP124;
        if (__var60__.size() > 0 && (__var60__ instanceof x10.array.MultiDimRegion || __var60__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var61__ = __var60__.rank(0).low(), __var62__ = __var60__.rank(0).high(); __var61__ <= __var62__; __var61__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int lg = __var61__;
        /* } */
        /* } */
{
            
//#line 678
final int X10_TEMP905 =
              (0);
            
//#line 680
final int X10_TEMP128 =
              (X10_TEMP905);
            
//#line 681
final int X10_TEMP908 =
              (1);
            
//#line 683
final int X10_TEMP126 =
              (X10_TEMP908);
            
//#line 684
final int X10_TEMP911 =
              (mm -
                 X10_TEMP126);
            
//#line 686
final int X10_TEMP129 =
              (X10_TEMP911);
            
//#line 687
final x10.
              lang.
              region X10_TEMP916 =
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
                      X10_TEMP128,
                      X10_TEMP129))));
            
//#line 689
final x10.
              lang.
              region X10_TEMP131 =
              (x10.
                lang.
                region)
                ((X10_TEMP916));
            
//#line 690
/* template:forloop-mult { */{
            x10.lang.region __var63__ = (x10.lang.region) X10_TEMP131;
            if (__var63__.size() > 0 && (__var63__ instanceof x10.array.MultiDimRegion || __var63__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var64__ = __var63__.rank(0).low(), __var65__ = __var63__.rank(0).high(); __var64__ <= __var65__; __var64__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var64__;
            /* } */
            /* } */
{
                
//#line 691
final int X10_TEMP920 =
                  (0);
                
//#line 693
final int X10_TEMP135 =
                  (X10_TEMP920);
                
//#line 694
final int X10_TEMP923 =
                  (1);
                
//#line 696
final int X10_TEMP133 =
                  (X10_TEMP923);
                
//#line 697
final int X10_TEMP926 =
                  (mm -
                     X10_TEMP133);
                
//#line 699
final int X10_TEMP136 =
                  (X10_TEMP926);
                
//#line 700
final x10.
                  lang.
                  region X10_TEMP931 =
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
                          X10_TEMP135,
                          X10_TEMP136))));
                
//#line 702
final x10.
                  lang.
                  region X10_TEMP138 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP931));
                
//#line 703
/* template:forloop-mult { */{
                x10.lang.region __var66__ = (x10.lang.region) X10_TEMP138;
                if (__var66__.size() > 0 && (__var66__ instanceof x10.array.MultiDimRegion || __var66__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var67__ = __var66__.rank(0).low(), __var68__ = __var66__.rank(0).high(); __var67__ <= __var68__; __var67__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var67__;
                /* } */
                /* } */
{
                    
//#line 704
final int X10_TEMP935 =
                      (0);
                    
//#line 706
final int X10_TEMP142 =
                      (X10_TEMP935);
                    
//#line 707
final int X10_TEMP938 =
                      (1);
                    
//#line 709
final int X10_TEMP140 =
                      (X10_TEMP938);
                    
//#line 710
final int X10_TEMP941 =
                      (mm -
                         X10_TEMP140);
                    
//#line 712
final int X10_TEMP143 =
                      (X10_TEMP941);
                    
//#line 713
final x10.
                      lang.
                      region X10_TEMP946 =
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
                              X10_TEMP142,
                              X10_TEMP143))));
                    
//#line 715
final x10.
                      lang.
                      region X10_TEMP145 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP946));
                    
//#line 716
/* template:forloop-mult { */{
                    x10.lang.region __var69__ = (x10.lang.region) X10_TEMP145;
                    if (__var69__.size() > 0 && (__var69__ instanceof x10.array.MultiDimRegion || __var69__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var70__ = __var69__.rank(0).low(), __var71__ = __var69__.rank(0).high(); __var70__ <= __var71__; __var70__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var70__;
                    /* } */
                    /* } */
{
                        
//#line 717
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP950 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 719
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP146 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP950));
                        
//#line 720
final double X10_TEMP953 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 722
final double X10_TEMP148 =
                          (X10_TEMP953);
                        
//#line 723
final double X10_TEMP956 =
                          (i *
                             X10_TEMP148);
                        
//#line 725
final double X10_TEMP152 =
                          (X10_TEMP956);
                        
//#line 726
final double X10_TEMP959 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 728
final double X10_TEMP149 =
                          (X10_TEMP959);
                        
//#line 729
final double X10_TEMP962 =
                          (lg *
                             X10_TEMP149);
                        
//#line 731
final double X10_TEMP150 =
                          (X10_TEMP962);
                        
//#line 732
final double X10_TEMP965 =
                          (0.5);
                        
//#line 734
final double X10_TEMP151 =
                          (X10_TEMP965);
                        
//#line 735
final double X10_TEMP968 =
                          (X10_TEMP150 *
                             X10_TEMP151);
                        
//#line 737
final double X10_TEMP153 =
                          (X10_TEMP968);
                        
//#line 738
final double X10_TEMP971 =
                          (X10_TEMP152 +
                             X10_TEMP153);
                        
//#line 740
final double X10_TEMP155 =
                          (X10_TEMP971);
                        
//#line 741
final double X10_TEMP974 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 743
final double X10_TEMP157 =
                          (X10_TEMP974);
                        
//#line 744
final double X10_TEMP977 =
                          (j *
                             X10_TEMP157);
                        
//#line 746
final double X10_TEMP161 =
                          (X10_TEMP977);
                        
//#line 747
final double X10_TEMP980 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 749
final double X10_TEMP158 =
                          (X10_TEMP980);
                        
//#line 750
final double X10_TEMP983 =
                          (lg *
                             X10_TEMP158);
                        
//#line 752
final double X10_TEMP159 =
                          (X10_TEMP983);
                        
//#line 753
final double X10_TEMP986 =
                          (0.5);
                        
//#line 755
final double X10_TEMP160 =
                          (X10_TEMP986);
                        
//#line 756
final double X10_TEMP989 =
                          (X10_TEMP159 *
                             X10_TEMP160);
                        
//#line 758
final double X10_TEMP162 =
                          (X10_TEMP989);
                        
//#line 759
final double X10_TEMP992 =
                          (X10_TEMP161 +
                             X10_TEMP162);
                        
//#line 761
final double X10_TEMP164 =
                          (X10_TEMP992);
                        
//#line 762
final double X10_TEMP995 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 764
final double X10_TEMP166 =
                          (X10_TEMP995);
                        
//#line 765
final double X10_TEMP998 =
                          (k *
                             X10_TEMP166);
                        
//#line 767
final double X10_TEMP168 =
                          (X10_TEMP998);
                        
//#line 768
final double X10_TEMP1001 =
                          (0.0);
                        
//#line 770
double X10_TEMP176 =
                          (X10_TEMP1001);
                        
//#line 771
final double X10_TEMP1004 =
                          (0.0);
                        
//#line 773
double X10_TEMP177 =
                          (X10_TEMP1004);
                        
//#line 774
final double X10_TEMP1007 =
                          (0.0);
                        
//#line 776
double X10_TEMP178 =
                          (X10_TEMP1007);
                        
//#line 777
final double X10_TEMP1010 =
                          (0.0);
                        
//#line 779
double X10_TEMP179 =
                          (X10_TEMP1010);
                        
//#line 780
final double X10_TEMP1013 =
                          (0.0);
                        
//#line 782
double X10_TEMP180 =
                          (X10_TEMP1013);
                        
//#line 783
final double X10_TEMP1016 =
                          (0.0);
                        
//#line 785
double X10_TEMP181 =
                          (X10_TEMP1016);
                        
//#line 786
final Particle X10_TEMP1028 =
                          (new Particle(
                             X10_TEMP155,
                             X10_TEMP164,
                             X10_TEMP168,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179,
                             X10_TEMP180,
                             X10_TEMP181));
                        
//#line 788
final Particle X10_TEMP184 =
                          (X10_TEMP1028);
                        
//#line 789
final Particle X10_TEMP1031 =
                          (X10_TEMP184);
                        
//#line 791
final Particle X10_TEMP185 =
                          (X10_TEMP1031);
                        
//#line 792
final Particle X10_TEMP1035 =
                          (X10_TEMP185);
                        
//#line 794
final Particle X10_TEMP1038 =
                          (X10_TEMP1035);
                        
//#line 795
/* template:array_set { */(X10_TEMP146).set((X10_TEMP1038),ijk)/* } */;
                        
//#line 796
final int X10_TEMP1040 =
                          (1);
                        
//#line 798
final int X10_TEMP186 =
                          (X10_TEMP1040);
                        
//#line 799
final int X10_TEMP1043 =
                          (ijk +
                             X10_TEMP186);
                        
//#line 801
final int X10_TEMP188 =
                          (X10_TEMP1043);
                        
//#line 802
final int X10_TEMP1046 =
                          (X10_TEMP188);
                        
//#line 804
ijk =
                          ((X10_TEMP1046));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var4____ = (__var69__).iterator(); __var4____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var4__ = (x10.
                      lang.
                      point) __var4____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                        
//#line 717
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP950 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 719
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP146 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP950));
                        
//#line 720
final double X10_TEMP953 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 722
final double X10_TEMP148 =
                          (X10_TEMP953);
                        
//#line 723
final double X10_TEMP956 =
                          (i *
                             X10_TEMP148);
                        
//#line 725
final double X10_TEMP152 =
                          (X10_TEMP956);
                        
//#line 726
final double X10_TEMP959 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 728
final double X10_TEMP149 =
                          (X10_TEMP959);
                        
//#line 729
final double X10_TEMP962 =
                          (lg *
                             X10_TEMP149);
                        
//#line 731
final double X10_TEMP150 =
                          (X10_TEMP962);
                        
//#line 732
final double X10_TEMP965 =
                          (0.5);
                        
//#line 734
final double X10_TEMP151 =
                          (X10_TEMP965);
                        
//#line 735
final double X10_TEMP968 =
                          (X10_TEMP150 *
                             X10_TEMP151);
                        
//#line 737
final double X10_TEMP153 =
                          (X10_TEMP968);
                        
//#line 738
final double X10_TEMP971 =
                          (X10_TEMP152 +
                             X10_TEMP153);
                        
//#line 740
final double X10_TEMP155 =
                          (X10_TEMP971);
                        
//#line 741
final double X10_TEMP974 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 743
final double X10_TEMP157 =
                          (X10_TEMP974);
                        
//#line 744
final double X10_TEMP977 =
                          (j *
                             X10_TEMP157);
                        
//#line 746
final double X10_TEMP161 =
                          (X10_TEMP977);
                        
//#line 747
final double X10_TEMP980 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 749
final double X10_TEMP158 =
                          (X10_TEMP980);
                        
//#line 750
final double X10_TEMP983 =
                          (lg *
                             X10_TEMP158);
                        
//#line 752
final double X10_TEMP159 =
                          (X10_TEMP983);
                        
//#line 753
final double X10_TEMP986 =
                          (0.5);
                        
//#line 755
final double X10_TEMP160 =
                          (X10_TEMP986);
                        
//#line 756
final double X10_TEMP989 =
                          (X10_TEMP159 *
                             X10_TEMP160);
                        
//#line 758
final double X10_TEMP162 =
                          (X10_TEMP989);
                        
//#line 759
final double X10_TEMP992 =
                          (X10_TEMP161 +
                             X10_TEMP162);
                        
//#line 761
final double X10_TEMP164 =
                          (X10_TEMP992);
                        
//#line 762
final double X10_TEMP995 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 764
final double X10_TEMP166 =
                          (X10_TEMP995);
                        
//#line 765
final double X10_TEMP998 =
                          (k *
                             X10_TEMP166);
                        
//#line 767
final double X10_TEMP168 =
                          (X10_TEMP998);
                        
//#line 768
final double X10_TEMP1001 =
                          (0.0);
                        
//#line 770
double X10_TEMP176 =
                          (X10_TEMP1001);
                        
//#line 771
final double X10_TEMP1004 =
                          (0.0);
                        
//#line 773
double X10_TEMP177 =
                          (X10_TEMP1004);
                        
//#line 774
final double X10_TEMP1007 =
                          (0.0);
                        
//#line 776
double X10_TEMP178 =
                          (X10_TEMP1007);
                        
//#line 777
final double X10_TEMP1010 =
                          (0.0);
                        
//#line 779
double X10_TEMP179 =
                          (X10_TEMP1010);
                        
//#line 780
final double X10_TEMP1013 =
                          (0.0);
                        
//#line 782
double X10_TEMP180 =
                          (X10_TEMP1013);
                        
//#line 783
final double X10_TEMP1016 =
                          (0.0);
                        
//#line 785
double X10_TEMP181 =
                          (X10_TEMP1016);
                        
//#line 786
final Particle X10_TEMP1028 =
                          (new Particle(
                             X10_TEMP155,
                             X10_TEMP164,
                             X10_TEMP168,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179,
                             X10_TEMP180,
                             X10_TEMP181));
                        
//#line 788
final Particle X10_TEMP184 =
                          (X10_TEMP1028);
                        
//#line 789
final Particle X10_TEMP1031 =
                          (X10_TEMP184);
                        
//#line 791
final Particle X10_TEMP185 =
                          (X10_TEMP1031);
                        
//#line 792
final Particle X10_TEMP1035 =
                          (X10_TEMP185);
                        
//#line 794
final Particle X10_TEMP1038 =
                          (X10_TEMP1035);
                        
//#line 795
/* template:array_set { */(X10_TEMP146).set((X10_TEMP1038),ijk)/* } */;
                        
//#line 796
final int X10_TEMP1040 =
                          (1);
                        
//#line 798
final int X10_TEMP186 =
                          (X10_TEMP1040);
                        
//#line 799
final int X10_TEMP1043 =
                          (ijk +
                             X10_TEMP186);
                        
//#line 801
final int X10_TEMP188 =
                          (X10_TEMP1043);
                        
//#line 802
final int X10_TEMP1046 =
                          (X10_TEMP188);
                        
//#line 804
ijk =
                          ((X10_TEMP1046));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var3____ = (__var66__).iterator(); __var3____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var3__ = (x10.
                  lang.
                  point) __var3____.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                    
//#line 704
final int X10_TEMP935 =
                      (0);
                    
//#line 706
final int X10_TEMP142 =
                      (X10_TEMP935);
                    
//#line 707
final int X10_TEMP938 =
                      (1);
                    
//#line 709
final int X10_TEMP140 =
                      (X10_TEMP938);
                    
//#line 710
final int X10_TEMP941 =
                      (mm -
                         X10_TEMP140);
                    
//#line 712
final int X10_TEMP143 =
                      (X10_TEMP941);
                    
//#line 713
final x10.
                      lang.
                      region X10_TEMP946 =
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
                              X10_TEMP142,
                              X10_TEMP143))));
                    
//#line 715
final x10.
                      lang.
                      region X10_TEMP145 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP946));
                    
//#line 716
/* template:forloop-mult { */{
                    x10.lang.region __var72__ = (x10.lang.region) X10_TEMP145;
                    if (__var72__.size() > 0 && (__var72__ instanceof x10.array.MultiDimRegion || __var72__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var73__ = __var72__.rank(0).low(), __var74__ = __var72__.rank(0).high(); __var73__ <= __var74__; __var73__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var73__;
                    /* } */
                    /* } */
{
                        
//#line 717
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP950 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 719
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP146 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP950));
                        
//#line 720
final double X10_TEMP953 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 722
final double X10_TEMP148 =
                          (X10_TEMP953);
                        
//#line 723
final double X10_TEMP956 =
                          (i *
                             X10_TEMP148);
                        
//#line 725
final double X10_TEMP152 =
                          (X10_TEMP956);
                        
//#line 726
final double X10_TEMP959 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 728
final double X10_TEMP149 =
                          (X10_TEMP959);
                        
//#line 729
final double X10_TEMP962 =
                          (lg *
                             X10_TEMP149);
                        
//#line 731
final double X10_TEMP150 =
                          (X10_TEMP962);
                        
//#line 732
final double X10_TEMP965 =
                          (0.5);
                        
//#line 734
final double X10_TEMP151 =
                          (X10_TEMP965);
                        
//#line 735
final double X10_TEMP968 =
                          (X10_TEMP150 *
                             X10_TEMP151);
                        
//#line 737
final double X10_TEMP153 =
                          (X10_TEMP968);
                        
//#line 738
final double X10_TEMP971 =
                          (X10_TEMP152 +
                             X10_TEMP153);
                        
//#line 740
final double X10_TEMP155 =
                          (X10_TEMP971);
                        
//#line 741
final double X10_TEMP974 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 743
final double X10_TEMP157 =
                          (X10_TEMP974);
                        
//#line 744
final double X10_TEMP977 =
                          (j *
                             X10_TEMP157);
                        
//#line 746
final double X10_TEMP161 =
                          (X10_TEMP977);
                        
//#line 747
final double X10_TEMP980 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 749
final double X10_TEMP158 =
                          (X10_TEMP980);
                        
//#line 750
final double X10_TEMP983 =
                          (lg *
                             X10_TEMP158);
                        
//#line 752
final double X10_TEMP159 =
                          (X10_TEMP983);
                        
//#line 753
final double X10_TEMP986 =
                          (0.5);
                        
//#line 755
final double X10_TEMP160 =
                          (X10_TEMP986);
                        
//#line 756
final double X10_TEMP989 =
                          (X10_TEMP159 *
                             X10_TEMP160);
                        
//#line 758
final double X10_TEMP162 =
                          (X10_TEMP989);
                        
//#line 759
final double X10_TEMP992 =
                          (X10_TEMP161 +
                             X10_TEMP162);
                        
//#line 761
final double X10_TEMP164 =
                          (X10_TEMP992);
                        
//#line 762
final double X10_TEMP995 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 764
final double X10_TEMP166 =
                          (X10_TEMP995);
                        
//#line 765
final double X10_TEMP998 =
                          (k *
                             X10_TEMP166);
                        
//#line 767
final double X10_TEMP168 =
                          (X10_TEMP998);
                        
//#line 768
final double X10_TEMP1001 =
                          (0.0);
                        
//#line 770
double X10_TEMP176 =
                          (X10_TEMP1001);
                        
//#line 771
final double X10_TEMP1004 =
                          (0.0);
                        
//#line 773
double X10_TEMP177 =
                          (X10_TEMP1004);
                        
//#line 774
final double X10_TEMP1007 =
                          (0.0);
                        
//#line 776
double X10_TEMP178 =
                          (X10_TEMP1007);
                        
//#line 777
final double X10_TEMP1010 =
                          (0.0);
                        
//#line 779
double X10_TEMP179 =
                          (X10_TEMP1010);
                        
//#line 780
final double X10_TEMP1013 =
                          (0.0);
                        
//#line 782
double X10_TEMP180 =
                          (X10_TEMP1013);
                        
//#line 783
final double X10_TEMP1016 =
                          (0.0);
                        
//#line 785
double X10_TEMP181 =
                          (X10_TEMP1016);
                        
//#line 786
final Particle X10_TEMP1028 =
                          (new Particle(
                             X10_TEMP155,
                             X10_TEMP164,
                             X10_TEMP168,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179,
                             X10_TEMP180,
                             X10_TEMP181));
                        
//#line 788
final Particle X10_TEMP184 =
                          (X10_TEMP1028);
                        
//#line 789
final Particle X10_TEMP1031 =
                          (X10_TEMP184);
                        
//#line 791
final Particle X10_TEMP185 =
                          (X10_TEMP1031);
                        
//#line 792
final Particle X10_TEMP1035 =
                          (X10_TEMP185);
                        
//#line 794
final Particle X10_TEMP1038 =
                          (X10_TEMP1035);
                        
//#line 795
/* template:array_set { */(X10_TEMP146).set((X10_TEMP1038),ijk)/* } */;
                        
//#line 796
final int X10_TEMP1040 =
                          (1);
                        
//#line 798
final int X10_TEMP186 =
                          (X10_TEMP1040);
                        
//#line 799
final int X10_TEMP1043 =
                          (ijk +
                             X10_TEMP186);
                        
//#line 801
final int X10_TEMP188 =
                          (X10_TEMP1043);
                        
//#line 802
final int X10_TEMP1046 =
                          (X10_TEMP188);
                        
//#line 804
ijk =
                          ((X10_TEMP1046));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var4____ = (__var72__).iterator(); __var4____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var4__ = (x10.
                      lang.
                      point) __var4____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                        
//#line 717
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP950 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 719
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP146 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP950));
                        
//#line 720
final double X10_TEMP953 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 722
final double X10_TEMP148 =
                          (X10_TEMP953);
                        
//#line 723
final double X10_TEMP956 =
                          (i *
                             X10_TEMP148);
                        
//#line 725
final double X10_TEMP152 =
                          (X10_TEMP956);
                        
//#line 726
final double X10_TEMP959 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 728
final double X10_TEMP149 =
                          (X10_TEMP959);
                        
//#line 729
final double X10_TEMP962 =
                          (lg *
                             X10_TEMP149);
                        
//#line 731
final double X10_TEMP150 =
                          (X10_TEMP962);
                        
//#line 732
final double X10_TEMP965 =
                          (0.5);
                        
//#line 734
final double X10_TEMP151 =
                          (X10_TEMP965);
                        
//#line 735
final double X10_TEMP968 =
                          (X10_TEMP150 *
                             X10_TEMP151);
                        
//#line 737
final double X10_TEMP153 =
                          (X10_TEMP968);
                        
//#line 738
final double X10_TEMP971 =
                          (X10_TEMP152 +
                             X10_TEMP153);
                        
//#line 740
final double X10_TEMP155 =
                          (X10_TEMP971);
                        
//#line 741
final double X10_TEMP974 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 743
final double X10_TEMP157 =
                          (X10_TEMP974);
                        
//#line 744
final double X10_TEMP977 =
                          (j *
                             X10_TEMP157);
                        
//#line 746
final double X10_TEMP161 =
                          (X10_TEMP977);
                        
//#line 747
final double X10_TEMP980 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 749
final double X10_TEMP158 =
                          (X10_TEMP980);
                        
//#line 750
final double X10_TEMP983 =
                          (lg *
                             X10_TEMP158);
                        
//#line 752
final double X10_TEMP159 =
                          (X10_TEMP983);
                        
//#line 753
final double X10_TEMP986 =
                          (0.5);
                        
//#line 755
final double X10_TEMP160 =
                          (X10_TEMP986);
                        
//#line 756
final double X10_TEMP989 =
                          (X10_TEMP159 *
                             X10_TEMP160);
                        
//#line 758
final double X10_TEMP162 =
                          (X10_TEMP989);
                        
//#line 759
final double X10_TEMP992 =
                          (X10_TEMP161 +
                             X10_TEMP162);
                        
//#line 761
final double X10_TEMP164 =
                          (X10_TEMP992);
                        
//#line 762
final double X10_TEMP995 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 764
final double X10_TEMP166 =
                          (X10_TEMP995);
                        
//#line 765
final double X10_TEMP998 =
                          (k *
                             X10_TEMP166);
                        
//#line 767
final double X10_TEMP168 =
                          (X10_TEMP998);
                        
//#line 768
final double X10_TEMP1001 =
                          (0.0);
                        
//#line 770
double X10_TEMP176 =
                          (X10_TEMP1001);
                        
//#line 771
final double X10_TEMP1004 =
                          (0.0);
                        
//#line 773
double X10_TEMP177 =
                          (X10_TEMP1004);
                        
//#line 774
final double X10_TEMP1007 =
                          (0.0);
                        
//#line 776
double X10_TEMP178 =
                          (X10_TEMP1007);
                        
//#line 777
final double X10_TEMP1010 =
                          (0.0);
                        
//#line 779
double X10_TEMP179 =
                          (X10_TEMP1010);
                        
//#line 780
final double X10_TEMP1013 =
                          (0.0);
                        
//#line 782
double X10_TEMP180 =
                          (X10_TEMP1013);
                        
//#line 783
final double X10_TEMP1016 =
                          (0.0);
                        
//#line 785
double X10_TEMP181 =
                          (X10_TEMP1016);
                        
//#line 786
final Particle X10_TEMP1028 =
                          (new Particle(
                             X10_TEMP155,
                             X10_TEMP164,
                             X10_TEMP168,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179,
                             X10_TEMP180,
                             X10_TEMP181));
                        
//#line 788
final Particle X10_TEMP184 =
                          (X10_TEMP1028);
                        
//#line 789
final Particle X10_TEMP1031 =
                          (X10_TEMP184);
                        
//#line 791
final Particle X10_TEMP185 =
                          (X10_TEMP1031);
                        
//#line 792
final Particle X10_TEMP1035 =
                          (X10_TEMP185);
                        
//#line 794
final Particle X10_TEMP1038 =
                          (X10_TEMP1035);
                        
//#line 795
/* template:array_set { */(X10_TEMP146).set((X10_TEMP1038),ijk)/* } */;
                        
//#line 796
final int X10_TEMP1040 =
                          (1);
                        
//#line 798
final int X10_TEMP186 =
                          (X10_TEMP1040);
                        
//#line 799
final int X10_TEMP1043 =
                          (ijk +
                             X10_TEMP186);
                        
//#line 801
final int X10_TEMP188 =
                          (X10_TEMP1043);
                        
//#line 802
final int X10_TEMP1046 =
                          (X10_TEMP188);
                        
//#line 804
ijk =
                          ((X10_TEMP1046));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var2____ = (__var63__).iterator(); __var2____.hasNext(); ) {
            	final  x10.
              lang.
              point __var2__ = (x10.
              lang.
              point) __var2____.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var2__).get(0))/* } */;/* } */
{
                
//#line 691
final int X10_TEMP920 =
                  (0);
                
//#line 693
final int X10_TEMP135 =
                  (X10_TEMP920);
                
//#line 694
final int X10_TEMP923 =
                  (1);
                
//#line 696
final int X10_TEMP133 =
                  (X10_TEMP923);
                
//#line 697
final int X10_TEMP926 =
                  (mm -
                     X10_TEMP133);
                
//#line 699
final int X10_TEMP136 =
                  (X10_TEMP926);
                
//#line 700
final x10.
                  lang.
                  region X10_TEMP931 =
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
                          X10_TEMP135,
                          X10_TEMP136))));
                
//#line 702
final x10.
                  lang.
                  region X10_TEMP138 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP931));
                
//#line 703
/* template:forloop-mult { */{
                x10.lang.region __var75__ = (x10.lang.region) X10_TEMP138;
                if (__var75__.size() > 0 && (__var75__ instanceof x10.array.MultiDimRegion || __var75__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var76__ = __var75__.rank(0).low(), __var77__ = __var75__.rank(0).high(); __var76__ <= __var77__; __var76__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var76__;
                /* } */
                /* } */
{
                    
//#line 704
final int X10_TEMP935 =
                      (0);
                    
//#line 706
final int X10_TEMP142 =
                      (X10_TEMP935);
                    
//#line 707
final int X10_TEMP938 =
                      (1);
                    
//#line 709
final int X10_TEMP140 =
                      (X10_TEMP938);
                    
//#line 710
final int X10_TEMP941 =
                      (mm -
                         X10_TEMP140);
                    
//#line 712
final int X10_TEMP143 =
                      (X10_TEMP941);
                    
//#line 713
final x10.
                      lang.
                      region X10_TEMP946 =
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
                              X10_TEMP142,
                              X10_TEMP143))));
                    
//#line 715
final x10.
                      lang.
                      region X10_TEMP145 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP946));
                    
//#line 716
/* template:forloop-mult { */{
                    x10.lang.region __var78__ = (x10.lang.region) X10_TEMP145;
                    if (__var78__.size() > 0 && (__var78__ instanceof x10.array.MultiDimRegion || __var78__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var79__ = __var78__.rank(0).low(), __var80__ = __var78__.rank(0).high(); __var79__ <= __var80__; __var79__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var79__;
                    /* } */
                    /* } */
{
                        
//#line 717
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP950 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 719
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP146 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP950));
                        
//#line 720
final double X10_TEMP953 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 722
final double X10_TEMP148 =
                          (X10_TEMP953);
                        
//#line 723
final double X10_TEMP956 =
                          (i *
                             X10_TEMP148);
                        
//#line 725
final double X10_TEMP152 =
                          (X10_TEMP956);
                        
//#line 726
final double X10_TEMP959 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 728
final double X10_TEMP149 =
                          (X10_TEMP959);
                        
//#line 729
final double X10_TEMP962 =
                          (lg *
                             X10_TEMP149);
                        
//#line 731
final double X10_TEMP150 =
                          (X10_TEMP962);
                        
//#line 732
final double X10_TEMP965 =
                          (0.5);
                        
//#line 734
final double X10_TEMP151 =
                          (X10_TEMP965);
                        
//#line 735
final double X10_TEMP968 =
                          (X10_TEMP150 *
                             X10_TEMP151);
                        
//#line 737
final double X10_TEMP153 =
                          (X10_TEMP968);
                        
//#line 738
final double X10_TEMP971 =
                          (X10_TEMP152 +
                             X10_TEMP153);
                        
//#line 740
final double X10_TEMP155 =
                          (X10_TEMP971);
                        
//#line 741
final double X10_TEMP974 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 743
final double X10_TEMP157 =
                          (X10_TEMP974);
                        
//#line 744
final double X10_TEMP977 =
                          (j *
                             X10_TEMP157);
                        
//#line 746
final double X10_TEMP161 =
                          (X10_TEMP977);
                        
//#line 747
final double X10_TEMP980 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 749
final double X10_TEMP158 =
                          (X10_TEMP980);
                        
//#line 750
final double X10_TEMP983 =
                          (lg *
                             X10_TEMP158);
                        
//#line 752
final double X10_TEMP159 =
                          (X10_TEMP983);
                        
//#line 753
final double X10_TEMP986 =
                          (0.5);
                        
//#line 755
final double X10_TEMP160 =
                          (X10_TEMP986);
                        
//#line 756
final double X10_TEMP989 =
                          (X10_TEMP159 *
                             X10_TEMP160);
                        
//#line 758
final double X10_TEMP162 =
                          (X10_TEMP989);
                        
//#line 759
final double X10_TEMP992 =
                          (X10_TEMP161 +
                             X10_TEMP162);
                        
//#line 761
final double X10_TEMP164 =
                          (X10_TEMP992);
                        
//#line 762
final double X10_TEMP995 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 764
final double X10_TEMP166 =
                          (X10_TEMP995);
                        
//#line 765
final double X10_TEMP998 =
                          (k *
                             X10_TEMP166);
                        
//#line 767
final double X10_TEMP168 =
                          (X10_TEMP998);
                        
//#line 768
final double X10_TEMP1001 =
                          (0.0);
                        
//#line 770
double X10_TEMP176 =
                          (X10_TEMP1001);
                        
//#line 771
final double X10_TEMP1004 =
                          (0.0);
                        
//#line 773
double X10_TEMP177 =
                          (X10_TEMP1004);
                        
//#line 774
final double X10_TEMP1007 =
                          (0.0);
                        
//#line 776
double X10_TEMP178 =
                          (X10_TEMP1007);
                        
//#line 777
final double X10_TEMP1010 =
                          (0.0);
                        
//#line 779
double X10_TEMP179 =
                          (X10_TEMP1010);
                        
//#line 780
final double X10_TEMP1013 =
                          (0.0);
                        
//#line 782
double X10_TEMP180 =
                          (X10_TEMP1013);
                        
//#line 783
final double X10_TEMP1016 =
                          (0.0);
                        
//#line 785
double X10_TEMP181 =
                          (X10_TEMP1016);
                        
//#line 786
final Particle X10_TEMP1028 =
                          (new Particle(
                             X10_TEMP155,
                             X10_TEMP164,
                             X10_TEMP168,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179,
                             X10_TEMP180,
                             X10_TEMP181));
                        
//#line 788
final Particle X10_TEMP184 =
                          (X10_TEMP1028);
                        
//#line 789
final Particle X10_TEMP1031 =
                          (X10_TEMP184);
                        
//#line 791
final Particle X10_TEMP185 =
                          (X10_TEMP1031);
                        
//#line 792
final Particle X10_TEMP1035 =
                          (X10_TEMP185);
                        
//#line 794
final Particle X10_TEMP1038 =
                          (X10_TEMP1035);
                        
//#line 795
/* template:array_set { */(X10_TEMP146).set((X10_TEMP1038),ijk)/* } */;
                        
//#line 796
final int X10_TEMP1040 =
                          (1);
                        
//#line 798
final int X10_TEMP186 =
                          (X10_TEMP1040);
                        
//#line 799
final int X10_TEMP1043 =
                          (ijk +
                             X10_TEMP186);
                        
//#line 801
final int X10_TEMP188 =
                          (X10_TEMP1043);
                        
//#line 802
final int X10_TEMP1046 =
                          (X10_TEMP188);
                        
//#line 804
ijk =
                          ((X10_TEMP1046));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var4____ = (__var78__).iterator(); __var4____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var4__ = (x10.
                      lang.
                      point) __var4____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                        
//#line 717
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP950 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 719
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP146 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP950));
                        
//#line 720
final double X10_TEMP953 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 722
final double X10_TEMP148 =
                          (X10_TEMP953);
                        
//#line 723
final double X10_TEMP956 =
                          (i *
                             X10_TEMP148);
                        
//#line 725
final double X10_TEMP152 =
                          (X10_TEMP956);
                        
//#line 726
final double X10_TEMP959 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 728
final double X10_TEMP149 =
                          (X10_TEMP959);
                        
//#line 729
final double X10_TEMP962 =
                          (lg *
                             X10_TEMP149);
                        
//#line 731
final double X10_TEMP150 =
                          (X10_TEMP962);
                        
//#line 732
final double X10_TEMP965 =
                          (0.5);
                        
//#line 734
final double X10_TEMP151 =
                          (X10_TEMP965);
                        
//#line 735
final double X10_TEMP968 =
                          (X10_TEMP150 *
                             X10_TEMP151);
                        
//#line 737
final double X10_TEMP153 =
                          (X10_TEMP968);
                        
//#line 738
final double X10_TEMP971 =
                          (X10_TEMP152 +
                             X10_TEMP153);
                        
//#line 740
final double X10_TEMP155 =
                          (X10_TEMP971);
                        
//#line 741
final double X10_TEMP974 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 743
final double X10_TEMP157 =
                          (X10_TEMP974);
                        
//#line 744
final double X10_TEMP977 =
                          (j *
                             X10_TEMP157);
                        
//#line 746
final double X10_TEMP161 =
                          (X10_TEMP977);
                        
//#line 747
final double X10_TEMP980 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 749
final double X10_TEMP158 =
                          (X10_TEMP980);
                        
//#line 750
final double X10_TEMP983 =
                          (lg *
                             X10_TEMP158);
                        
//#line 752
final double X10_TEMP159 =
                          (X10_TEMP983);
                        
//#line 753
final double X10_TEMP986 =
                          (0.5);
                        
//#line 755
final double X10_TEMP160 =
                          (X10_TEMP986);
                        
//#line 756
final double X10_TEMP989 =
                          (X10_TEMP159 *
                             X10_TEMP160);
                        
//#line 758
final double X10_TEMP162 =
                          (X10_TEMP989);
                        
//#line 759
final double X10_TEMP992 =
                          (X10_TEMP161 +
                             X10_TEMP162);
                        
//#line 761
final double X10_TEMP164 =
                          (X10_TEMP992);
                        
//#line 762
final double X10_TEMP995 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 764
final double X10_TEMP166 =
                          (X10_TEMP995);
                        
//#line 765
final double X10_TEMP998 =
                          (k *
                             X10_TEMP166);
                        
//#line 767
final double X10_TEMP168 =
                          (X10_TEMP998);
                        
//#line 768
final double X10_TEMP1001 =
                          (0.0);
                        
//#line 770
double X10_TEMP176 =
                          (X10_TEMP1001);
                        
//#line 771
final double X10_TEMP1004 =
                          (0.0);
                        
//#line 773
double X10_TEMP177 =
                          (X10_TEMP1004);
                        
//#line 774
final double X10_TEMP1007 =
                          (0.0);
                        
//#line 776
double X10_TEMP178 =
                          (X10_TEMP1007);
                        
//#line 777
final double X10_TEMP1010 =
                          (0.0);
                        
//#line 779
double X10_TEMP179 =
                          (X10_TEMP1010);
                        
//#line 780
final double X10_TEMP1013 =
                          (0.0);
                        
//#line 782
double X10_TEMP180 =
                          (X10_TEMP1013);
                        
//#line 783
final double X10_TEMP1016 =
                          (0.0);
                        
//#line 785
double X10_TEMP181 =
                          (X10_TEMP1016);
                        
//#line 786
final Particle X10_TEMP1028 =
                          (new Particle(
                             X10_TEMP155,
                             X10_TEMP164,
                             X10_TEMP168,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179,
                             X10_TEMP180,
                             X10_TEMP181));
                        
//#line 788
final Particle X10_TEMP184 =
                          (X10_TEMP1028);
                        
//#line 789
final Particle X10_TEMP1031 =
                          (X10_TEMP184);
                        
//#line 791
final Particle X10_TEMP185 =
                          (X10_TEMP1031);
                        
//#line 792
final Particle X10_TEMP1035 =
                          (X10_TEMP185);
                        
//#line 794
final Particle X10_TEMP1038 =
                          (X10_TEMP1035);
                        
//#line 795
/* template:array_set { */(X10_TEMP146).set((X10_TEMP1038),ijk)/* } */;
                        
//#line 796
final int X10_TEMP1040 =
                          (1);
                        
//#line 798
final int X10_TEMP186 =
                          (X10_TEMP1040);
                        
//#line 799
final int X10_TEMP1043 =
                          (ijk +
                             X10_TEMP186);
                        
//#line 801
final int X10_TEMP188 =
                          (X10_TEMP1043);
                        
//#line 802
final int X10_TEMP1046 =
                          (X10_TEMP188);
                        
//#line 804
ijk =
                          ((X10_TEMP1046));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var3____ = (__var75__).iterator(); __var3____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var3__ = (x10.
                  lang.
                  point) __var3____.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                    
//#line 704
final int X10_TEMP935 =
                      (0);
                    
//#line 706
final int X10_TEMP142 =
                      (X10_TEMP935);
                    
//#line 707
final int X10_TEMP938 =
                      (1);
                    
//#line 709
final int X10_TEMP140 =
                      (X10_TEMP938);
                    
//#line 710
final int X10_TEMP941 =
                      (mm -
                         X10_TEMP140);
                    
//#line 712
final int X10_TEMP143 =
                      (X10_TEMP941);
                    
//#line 713
final x10.
                      lang.
                      region X10_TEMP946 =
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
                              X10_TEMP142,
                              X10_TEMP143))));
                    
//#line 715
final x10.
                      lang.
                      region X10_TEMP145 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP946));
                    
//#line 716
/* template:forloop-mult { */{
                    x10.lang.region __var81__ = (x10.lang.region) X10_TEMP145;
                    if (__var81__.size() > 0 && (__var81__ instanceof x10.array.MultiDimRegion || __var81__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var82__ = __var81__.rank(0).low(), __var83__ = __var81__.rank(0).high(); __var82__ <= __var83__; __var82__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var82__;
                    /* } */
                    /* } */
{
                        
//#line 717
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP950 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 719
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP146 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP950));
                        
//#line 720
final double X10_TEMP953 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 722
final double X10_TEMP148 =
                          (X10_TEMP953);
                        
//#line 723
final double X10_TEMP956 =
                          (i *
                             X10_TEMP148);
                        
//#line 725
final double X10_TEMP152 =
                          (X10_TEMP956);
                        
//#line 726
final double X10_TEMP959 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 728
final double X10_TEMP149 =
                          (X10_TEMP959);
                        
//#line 729
final double X10_TEMP962 =
                          (lg *
                             X10_TEMP149);
                        
//#line 731
final double X10_TEMP150 =
                          (X10_TEMP962);
                        
//#line 732
final double X10_TEMP965 =
                          (0.5);
                        
//#line 734
final double X10_TEMP151 =
                          (X10_TEMP965);
                        
//#line 735
final double X10_TEMP968 =
                          (X10_TEMP150 *
                             X10_TEMP151);
                        
//#line 737
final double X10_TEMP153 =
                          (X10_TEMP968);
                        
//#line 738
final double X10_TEMP971 =
                          (X10_TEMP152 +
                             X10_TEMP153);
                        
//#line 740
final double X10_TEMP155 =
                          (X10_TEMP971);
                        
//#line 741
final double X10_TEMP974 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 743
final double X10_TEMP157 =
                          (X10_TEMP974);
                        
//#line 744
final double X10_TEMP977 =
                          (j *
                             X10_TEMP157);
                        
//#line 746
final double X10_TEMP161 =
                          (X10_TEMP977);
                        
//#line 747
final double X10_TEMP980 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 749
final double X10_TEMP158 =
                          (X10_TEMP980);
                        
//#line 750
final double X10_TEMP983 =
                          (lg *
                             X10_TEMP158);
                        
//#line 752
final double X10_TEMP159 =
                          (X10_TEMP983);
                        
//#line 753
final double X10_TEMP986 =
                          (0.5);
                        
//#line 755
final double X10_TEMP160 =
                          (X10_TEMP986);
                        
//#line 756
final double X10_TEMP989 =
                          (X10_TEMP159 *
                             X10_TEMP160);
                        
//#line 758
final double X10_TEMP162 =
                          (X10_TEMP989);
                        
//#line 759
final double X10_TEMP992 =
                          (X10_TEMP161 +
                             X10_TEMP162);
                        
//#line 761
final double X10_TEMP164 =
                          (X10_TEMP992);
                        
//#line 762
final double X10_TEMP995 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 764
final double X10_TEMP166 =
                          (X10_TEMP995);
                        
//#line 765
final double X10_TEMP998 =
                          (k *
                             X10_TEMP166);
                        
//#line 767
final double X10_TEMP168 =
                          (X10_TEMP998);
                        
//#line 768
final double X10_TEMP1001 =
                          (0.0);
                        
//#line 770
double X10_TEMP176 =
                          (X10_TEMP1001);
                        
//#line 771
final double X10_TEMP1004 =
                          (0.0);
                        
//#line 773
double X10_TEMP177 =
                          (X10_TEMP1004);
                        
//#line 774
final double X10_TEMP1007 =
                          (0.0);
                        
//#line 776
double X10_TEMP178 =
                          (X10_TEMP1007);
                        
//#line 777
final double X10_TEMP1010 =
                          (0.0);
                        
//#line 779
double X10_TEMP179 =
                          (X10_TEMP1010);
                        
//#line 780
final double X10_TEMP1013 =
                          (0.0);
                        
//#line 782
double X10_TEMP180 =
                          (X10_TEMP1013);
                        
//#line 783
final double X10_TEMP1016 =
                          (0.0);
                        
//#line 785
double X10_TEMP181 =
                          (X10_TEMP1016);
                        
//#line 786
final Particle X10_TEMP1028 =
                          (new Particle(
                             X10_TEMP155,
                             X10_TEMP164,
                             X10_TEMP168,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179,
                             X10_TEMP180,
                             X10_TEMP181));
                        
//#line 788
final Particle X10_TEMP184 =
                          (X10_TEMP1028);
                        
//#line 789
final Particle X10_TEMP1031 =
                          (X10_TEMP184);
                        
//#line 791
final Particle X10_TEMP185 =
                          (X10_TEMP1031);
                        
//#line 792
final Particle X10_TEMP1035 =
                          (X10_TEMP185);
                        
//#line 794
final Particle X10_TEMP1038 =
                          (X10_TEMP1035);
                        
//#line 795
/* template:array_set { */(X10_TEMP146).set((X10_TEMP1038),ijk)/* } */;
                        
//#line 796
final int X10_TEMP1040 =
                          (1);
                        
//#line 798
final int X10_TEMP186 =
                          (X10_TEMP1040);
                        
//#line 799
final int X10_TEMP1043 =
                          (ijk +
                             X10_TEMP186);
                        
//#line 801
final int X10_TEMP188 =
                          (X10_TEMP1043);
                        
//#line 802
final int X10_TEMP1046 =
                          (X10_TEMP188);
                        
//#line 804
ijk =
                          ((X10_TEMP1046));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var4____ = (__var81__).iterator(); __var4____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var4__ = (x10.
                      lang.
                      point) __var4____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                        
//#line 717
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP950 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 719
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP146 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP950));
                        
//#line 720
final double X10_TEMP953 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 722
final double X10_TEMP148 =
                          (X10_TEMP953);
                        
//#line 723
final double X10_TEMP956 =
                          (i *
                             X10_TEMP148);
                        
//#line 725
final double X10_TEMP152 =
                          (X10_TEMP956);
                        
//#line 726
final double X10_TEMP959 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 728
final double X10_TEMP149 =
                          (X10_TEMP959);
                        
//#line 729
final double X10_TEMP962 =
                          (lg *
                             X10_TEMP149);
                        
//#line 731
final double X10_TEMP150 =
                          (X10_TEMP962);
                        
//#line 732
final double X10_TEMP965 =
                          (0.5);
                        
//#line 734
final double X10_TEMP151 =
                          (X10_TEMP965);
                        
//#line 735
final double X10_TEMP968 =
                          (X10_TEMP150 *
                             X10_TEMP151);
                        
//#line 737
final double X10_TEMP153 =
                          (X10_TEMP968);
                        
//#line 738
final double X10_TEMP971 =
                          (X10_TEMP152 +
                             X10_TEMP153);
                        
//#line 740
final double X10_TEMP155 =
                          (X10_TEMP971);
                        
//#line 741
final double X10_TEMP974 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 743
final double X10_TEMP157 =
                          (X10_TEMP974);
                        
//#line 744
final double X10_TEMP977 =
                          (j *
                             X10_TEMP157);
                        
//#line 746
final double X10_TEMP161 =
                          (X10_TEMP977);
                        
//#line 747
final double X10_TEMP980 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 749
final double X10_TEMP158 =
                          (X10_TEMP980);
                        
//#line 750
final double X10_TEMP983 =
                          (lg *
                             X10_TEMP158);
                        
//#line 752
final double X10_TEMP159 =
                          (X10_TEMP983);
                        
//#line 753
final double X10_TEMP986 =
                          (0.5);
                        
//#line 755
final double X10_TEMP160 =
                          (X10_TEMP986);
                        
//#line 756
final double X10_TEMP989 =
                          (X10_TEMP159 *
                             X10_TEMP160);
                        
//#line 758
final double X10_TEMP162 =
                          (X10_TEMP989);
                        
//#line 759
final double X10_TEMP992 =
                          (X10_TEMP161 +
                             X10_TEMP162);
                        
//#line 761
final double X10_TEMP164 =
                          (X10_TEMP992);
                        
//#line 762
final double X10_TEMP995 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 764
final double X10_TEMP166 =
                          (X10_TEMP995);
                        
//#line 765
final double X10_TEMP998 =
                          (k *
                             X10_TEMP166);
                        
//#line 767
final double X10_TEMP168 =
                          (X10_TEMP998);
                        
//#line 768
final double X10_TEMP1001 =
                          (0.0);
                        
//#line 770
double X10_TEMP176 =
                          (X10_TEMP1001);
                        
//#line 771
final double X10_TEMP1004 =
                          (0.0);
                        
//#line 773
double X10_TEMP177 =
                          (X10_TEMP1004);
                        
//#line 774
final double X10_TEMP1007 =
                          (0.0);
                        
//#line 776
double X10_TEMP178 =
                          (X10_TEMP1007);
                        
//#line 777
final double X10_TEMP1010 =
                          (0.0);
                        
//#line 779
double X10_TEMP179 =
                          (X10_TEMP1010);
                        
//#line 780
final double X10_TEMP1013 =
                          (0.0);
                        
//#line 782
double X10_TEMP180 =
                          (X10_TEMP1013);
                        
//#line 783
final double X10_TEMP1016 =
                          (0.0);
                        
//#line 785
double X10_TEMP181 =
                          (X10_TEMP1016);
                        
//#line 786
final Particle X10_TEMP1028 =
                          (new Particle(
                             X10_TEMP155,
                             X10_TEMP164,
                             X10_TEMP168,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179,
                             X10_TEMP180,
                             X10_TEMP181));
                        
//#line 788
final Particle X10_TEMP184 =
                          (X10_TEMP1028);
                        
//#line 789
final Particle X10_TEMP1031 =
                          (X10_TEMP184);
                        
//#line 791
final Particle X10_TEMP185 =
                          (X10_TEMP1031);
                        
//#line 792
final Particle X10_TEMP1035 =
                          (X10_TEMP185);
                        
//#line 794
final Particle X10_TEMP1038 =
                          (X10_TEMP1035);
                        
//#line 795
/* template:array_set { */(X10_TEMP146).set((X10_TEMP1038),ijk)/* } */;
                        
//#line 796
final int X10_TEMP1040 =
                          (1);
                        
//#line 798
final int X10_TEMP186 =
                          (X10_TEMP1040);
                        
//#line 799
final int X10_TEMP1043 =
                          (ijk +
                             X10_TEMP186);
                        
//#line 801
final int X10_TEMP188 =
                          (X10_TEMP1043);
                        
//#line 802
final int X10_TEMP1046 =
                          (X10_TEMP188);
                        
//#line 804
ijk =
                          ((X10_TEMP1046));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var1____ = (__var60__).iterator(); __var1____.hasNext(); ) {
        	final  x10.
          lang.
          point __var1__ = (x10.
          lang.
          point) __var1____.next();
        	/* Join: { *//* Join: { */final int lg =
          /* template:array_get { */((__var1__).get(0))/* } */;/* } */
{
            
//#line 678
final int X10_TEMP905 =
              (0);
            
//#line 680
final int X10_TEMP128 =
              (X10_TEMP905);
            
//#line 681
final int X10_TEMP908 =
              (1);
            
//#line 683
final int X10_TEMP126 =
              (X10_TEMP908);
            
//#line 684
final int X10_TEMP911 =
              (mm -
                 X10_TEMP126);
            
//#line 686
final int X10_TEMP129 =
              (X10_TEMP911);
            
//#line 687
final x10.
              lang.
              region X10_TEMP916 =
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
                      X10_TEMP128,
                      X10_TEMP129))));
            
//#line 689
final x10.
              lang.
              region X10_TEMP131 =
              (x10.
                lang.
                region)
                ((X10_TEMP916));
            
//#line 690
/* template:forloop-mult { */{
            x10.lang.region __var84__ = (x10.lang.region) X10_TEMP131;
            if (__var84__.size() > 0 && (__var84__ instanceof x10.array.MultiDimRegion || __var84__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var85__ = __var84__.rank(0).low(), __var86__ = __var84__.rank(0).high(); __var85__ <= __var86__; __var85__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var85__;
            /* } */
            /* } */
{
                
//#line 691
final int X10_TEMP920 =
                  (0);
                
//#line 693
final int X10_TEMP135 =
                  (X10_TEMP920);
                
//#line 694
final int X10_TEMP923 =
                  (1);
                
//#line 696
final int X10_TEMP133 =
                  (X10_TEMP923);
                
//#line 697
final int X10_TEMP926 =
                  (mm -
                     X10_TEMP133);
                
//#line 699
final int X10_TEMP136 =
                  (X10_TEMP926);
                
//#line 700
final x10.
                  lang.
                  region X10_TEMP931 =
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
                          X10_TEMP135,
                          X10_TEMP136))));
                
//#line 702
final x10.
                  lang.
                  region X10_TEMP138 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP931));
                
//#line 703
/* template:forloop-mult { */{
                x10.lang.region __var87__ = (x10.lang.region) X10_TEMP138;
                if (__var87__.size() > 0 && (__var87__ instanceof x10.array.MultiDimRegion || __var87__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var88__ = __var87__.rank(0).low(), __var89__ = __var87__.rank(0).high(); __var88__ <= __var89__; __var88__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var88__;
                /* } */
                /* } */
{
                    
//#line 704
final int X10_TEMP935 =
                      (0);
                    
//#line 706
final int X10_TEMP142 =
                      (X10_TEMP935);
                    
//#line 707
final int X10_TEMP938 =
                      (1);
                    
//#line 709
final int X10_TEMP140 =
                      (X10_TEMP938);
                    
//#line 710
final int X10_TEMP941 =
                      (mm -
                         X10_TEMP140);
                    
//#line 712
final int X10_TEMP143 =
                      (X10_TEMP941);
                    
//#line 713
final x10.
                      lang.
                      region X10_TEMP946 =
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
                              X10_TEMP142,
                              X10_TEMP143))));
                    
//#line 715
final x10.
                      lang.
                      region X10_TEMP145 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP946));
                    
//#line 716
/* template:forloop-mult { */{
                    x10.lang.region __var90__ = (x10.lang.region) X10_TEMP145;
                    if (__var90__.size() > 0 && (__var90__ instanceof x10.array.MultiDimRegion || __var90__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var91__ = __var90__.rank(0).low(), __var92__ = __var90__.rank(0).high(); __var91__ <= __var92__; __var91__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var91__;
                    /* } */
                    /* } */
{
                        
//#line 717
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP950 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 719
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP146 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP950));
                        
//#line 720
final double X10_TEMP953 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 722
final double X10_TEMP148 =
                          (X10_TEMP953);
                        
//#line 723
final double X10_TEMP956 =
                          (i *
                             X10_TEMP148);
                        
//#line 725
final double X10_TEMP152 =
                          (X10_TEMP956);
                        
//#line 726
final double X10_TEMP959 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 728
final double X10_TEMP149 =
                          (X10_TEMP959);
                        
//#line 729
final double X10_TEMP962 =
                          (lg *
                             X10_TEMP149);
                        
//#line 731
final double X10_TEMP150 =
                          (X10_TEMP962);
                        
//#line 732
final double X10_TEMP965 =
                          (0.5);
                        
//#line 734
final double X10_TEMP151 =
                          (X10_TEMP965);
                        
//#line 735
final double X10_TEMP968 =
                          (X10_TEMP150 *
                             X10_TEMP151);
                        
//#line 737
final double X10_TEMP153 =
                          (X10_TEMP968);
                        
//#line 738
final double X10_TEMP971 =
                          (X10_TEMP152 +
                             X10_TEMP153);
                        
//#line 740
final double X10_TEMP155 =
                          (X10_TEMP971);
                        
//#line 741
final double X10_TEMP974 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 743
final double X10_TEMP157 =
                          (X10_TEMP974);
                        
//#line 744
final double X10_TEMP977 =
                          (j *
                             X10_TEMP157);
                        
//#line 746
final double X10_TEMP161 =
                          (X10_TEMP977);
                        
//#line 747
final double X10_TEMP980 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 749
final double X10_TEMP158 =
                          (X10_TEMP980);
                        
//#line 750
final double X10_TEMP983 =
                          (lg *
                             X10_TEMP158);
                        
//#line 752
final double X10_TEMP159 =
                          (X10_TEMP983);
                        
//#line 753
final double X10_TEMP986 =
                          (0.5);
                        
//#line 755
final double X10_TEMP160 =
                          (X10_TEMP986);
                        
//#line 756
final double X10_TEMP989 =
                          (X10_TEMP159 *
                             X10_TEMP160);
                        
//#line 758
final double X10_TEMP162 =
                          (X10_TEMP989);
                        
//#line 759
final double X10_TEMP992 =
                          (X10_TEMP161 +
                             X10_TEMP162);
                        
//#line 761
final double X10_TEMP164 =
                          (X10_TEMP992);
                        
//#line 762
final double X10_TEMP995 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 764
final double X10_TEMP166 =
                          (X10_TEMP995);
                        
//#line 765
final double X10_TEMP998 =
                          (k *
                             X10_TEMP166);
                        
//#line 767
final double X10_TEMP168 =
                          (X10_TEMP998);
                        
//#line 768
final double X10_TEMP1001 =
                          (0.0);
                        
//#line 770
double X10_TEMP176 =
                          (X10_TEMP1001);
                        
//#line 771
final double X10_TEMP1004 =
                          (0.0);
                        
//#line 773
double X10_TEMP177 =
                          (X10_TEMP1004);
                        
//#line 774
final double X10_TEMP1007 =
                          (0.0);
                        
//#line 776
double X10_TEMP178 =
                          (X10_TEMP1007);
                        
//#line 777
final double X10_TEMP1010 =
                          (0.0);
                        
//#line 779
double X10_TEMP179 =
                          (X10_TEMP1010);
                        
//#line 780
final double X10_TEMP1013 =
                          (0.0);
                        
//#line 782
double X10_TEMP180 =
                          (X10_TEMP1013);
                        
//#line 783
final double X10_TEMP1016 =
                          (0.0);
                        
//#line 785
double X10_TEMP181 =
                          (X10_TEMP1016);
                        
//#line 786
final Particle X10_TEMP1028 =
                          (new Particle(
                             X10_TEMP155,
                             X10_TEMP164,
                             X10_TEMP168,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179,
                             X10_TEMP180,
                             X10_TEMP181));
                        
//#line 788
final Particle X10_TEMP184 =
                          (X10_TEMP1028);
                        
//#line 789
final Particle X10_TEMP1031 =
                          (X10_TEMP184);
                        
//#line 791
final Particle X10_TEMP185 =
                          (X10_TEMP1031);
                        
//#line 792
final Particle X10_TEMP1035 =
                          (X10_TEMP185);
                        
//#line 794
final Particle X10_TEMP1038 =
                          (X10_TEMP1035);
                        
//#line 795
/* template:array_set { */(X10_TEMP146).set((X10_TEMP1038),ijk)/* } */;
                        
//#line 796
final int X10_TEMP1040 =
                          (1);
                        
//#line 798
final int X10_TEMP186 =
                          (X10_TEMP1040);
                        
//#line 799
final int X10_TEMP1043 =
                          (ijk +
                             X10_TEMP186);
                        
//#line 801
final int X10_TEMP188 =
                          (X10_TEMP1043);
                        
//#line 802
final int X10_TEMP1046 =
                          (X10_TEMP188);
                        
//#line 804
ijk =
                          ((X10_TEMP1046));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var4____ = (__var90__).iterator(); __var4____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var4__ = (x10.
                      lang.
                      point) __var4____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                        
//#line 717
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP950 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 719
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP146 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP950));
                        
//#line 720
final double X10_TEMP953 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 722
final double X10_TEMP148 =
                          (X10_TEMP953);
                        
//#line 723
final double X10_TEMP956 =
                          (i *
                             X10_TEMP148);
                        
//#line 725
final double X10_TEMP152 =
                          (X10_TEMP956);
                        
//#line 726
final double X10_TEMP959 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 728
final double X10_TEMP149 =
                          (X10_TEMP959);
                        
//#line 729
final double X10_TEMP962 =
                          (lg *
                             X10_TEMP149);
                        
//#line 731
final double X10_TEMP150 =
                          (X10_TEMP962);
                        
//#line 732
final double X10_TEMP965 =
                          (0.5);
                        
//#line 734
final double X10_TEMP151 =
                          (X10_TEMP965);
                        
//#line 735
final double X10_TEMP968 =
                          (X10_TEMP150 *
                             X10_TEMP151);
                        
//#line 737
final double X10_TEMP153 =
                          (X10_TEMP968);
                        
//#line 738
final double X10_TEMP971 =
                          (X10_TEMP152 +
                             X10_TEMP153);
                        
//#line 740
final double X10_TEMP155 =
                          (X10_TEMP971);
                        
//#line 741
final double X10_TEMP974 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 743
final double X10_TEMP157 =
                          (X10_TEMP974);
                        
//#line 744
final double X10_TEMP977 =
                          (j *
                             X10_TEMP157);
                        
//#line 746
final double X10_TEMP161 =
                          (X10_TEMP977);
                        
//#line 747
final double X10_TEMP980 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 749
final double X10_TEMP158 =
                          (X10_TEMP980);
                        
//#line 750
final double X10_TEMP983 =
                          (lg *
                             X10_TEMP158);
                        
//#line 752
final double X10_TEMP159 =
                          (X10_TEMP983);
                        
//#line 753
final double X10_TEMP986 =
                          (0.5);
                        
//#line 755
final double X10_TEMP160 =
                          (X10_TEMP986);
                        
//#line 756
final double X10_TEMP989 =
                          (X10_TEMP159 *
                             X10_TEMP160);
                        
//#line 758
final double X10_TEMP162 =
                          (X10_TEMP989);
                        
//#line 759
final double X10_TEMP992 =
                          (X10_TEMP161 +
                             X10_TEMP162);
                        
//#line 761
final double X10_TEMP164 =
                          (X10_TEMP992);
                        
//#line 762
final double X10_TEMP995 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 764
final double X10_TEMP166 =
                          (X10_TEMP995);
                        
//#line 765
final double X10_TEMP998 =
                          (k *
                             X10_TEMP166);
                        
//#line 767
final double X10_TEMP168 =
                          (X10_TEMP998);
                        
//#line 768
final double X10_TEMP1001 =
                          (0.0);
                        
//#line 770
double X10_TEMP176 =
                          (X10_TEMP1001);
                        
//#line 771
final double X10_TEMP1004 =
                          (0.0);
                        
//#line 773
double X10_TEMP177 =
                          (X10_TEMP1004);
                        
//#line 774
final double X10_TEMP1007 =
                          (0.0);
                        
//#line 776
double X10_TEMP178 =
                          (X10_TEMP1007);
                        
//#line 777
final double X10_TEMP1010 =
                          (0.0);
                        
//#line 779
double X10_TEMP179 =
                          (X10_TEMP1010);
                        
//#line 780
final double X10_TEMP1013 =
                          (0.0);
                        
//#line 782
double X10_TEMP180 =
                          (X10_TEMP1013);
                        
//#line 783
final double X10_TEMP1016 =
                          (0.0);
                        
//#line 785
double X10_TEMP181 =
                          (X10_TEMP1016);
                        
//#line 786
final Particle X10_TEMP1028 =
                          (new Particle(
                             X10_TEMP155,
                             X10_TEMP164,
                             X10_TEMP168,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179,
                             X10_TEMP180,
                             X10_TEMP181));
                        
//#line 788
final Particle X10_TEMP184 =
                          (X10_TEMP1028);
                        
//#line 789
final Particle X10_TEMP1031 =
                          (X10_TEMP184);
                        
//#line 791
final Particle X10_TEMP185 =
                          (X10_TEMP1031);
                        
//#line 792
final Particle X10_TEMP1035 =
                          (X10_TEMP185);
                        
//#line 794
final Particle X10_TEMP1038 =
                          (X10_TEMP1035);
                        
//#line 795
/* template:array_set { */(X10_TEMP146).set((X10_TEMP1038),ijk)/* } */;
                        
//#line 796
final int X10_TEMP1040 =
                          (1);
                        
//#line 798
final int X10_TEMP186 =
                          (X10_TEMP1040);
                        
//#line 799
final int X10_TEMP1043 =
                          (ijk +
                             X10_TEMP186);
                        
//#line 801
final int X10_TEMP188 =
                          (X10_TEMP1043);
                        
//#line 802
final int X10_TEMP1046 =
                          (X10_TEMP188);
                        
//#line 804
ijk =
                          ((X10_TEMP1046));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var3____ = (__var87__).iterator(); __var3____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var3__ = (x10.
                  lang.
                  point) __var3____.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                    
//#line 704
final int X10_TEMP935 =
                      (0);
                    
//#line 706
final int X10_TEMP142 =
                      (X10_TEMP935);
                    
//#line 707
final int X10_TEMP938 =
                      (1);
                    
//#line 709
final int X10_TEMP140 =
                      (X10_TEMP938);
                    
//#line 710
final int X10_TEMP941 =
                      (mm -
                         X10_TEMP140);
                    
//#line 712
final int X10_TEMP143 =
                      (X10_TEMP941);
                    
//#line 713
final x10.
                      lang.
                      region X10_TEMP946 =
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
                              X10_TEMP142,
                              X10_TEMP143))));
                    
//#line 715
final x10.
                      lang.
                      region X10_TEMP145 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP946));
                    
//#line 716
/* template:forloop-mult { */{
                    x10.lang.region __var93__ = (x10.lang.region) X10_TEMP145;
                    if (__var93__.size() > 0 && (__var93__ instanceof x10.array.MultiDimRegion || __var93__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var94__ = __var93__.rank(0).low(), __var95__ = __var93__.rank(0).high(); __var94__ <= __var95__; __var94__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var94__;
                    /* } */
                    /* } */
{
                        
//#line 717
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP950 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 719
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP146 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP950));
                        
//#line 720
final double X10_TEMP953 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 722
final double X10_TEMP148 =
                          (X10_TEMP953);
                        
//#line 723
final double X10_TEMP956 =
                          (i *
                             X10_TEMP148);
                        
//#line 725
final double X10_TEMP152 =
                          (X10_TEMP956);
                        
//#line 726
final double X10_TEMP959 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 728
final double X10_TEMP149 =
                          (X10_TEMP959);
                        
//#line 729
final double X10_TEMP962 =
                          (lg *
                             X10_TEMP149);
                        
//#line 731
final double X10_TEMP150 =
                          (X10_TEMP962);
                        
//#line 732
final double X10_TEMP965 =
                          (0.5);
                        
//#line 734
final double X10_TEMP151 =
                          (X10_TEMP965);
                        
//#line 735
final double X10_TEMP968 =
                          (X10_TEMP150 *
                             X10_TEMP151);
                        
//#line 737
final double X10_TEMP153 =
                          (X10_TEMP968);
                        
//#line 738
final double X10_TEMP971 =
                          (X10_TEMP152 +
                             X10_TEMP153);
                        
//#line 740
final double X10_TEMP155 =
                          (X10_TEMP971);
                        
//#line 741
final double X10_TEMP974 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 743
final double X10_TEMP157 =
                          (X10_TEMP974);
                        
//#line 744
final double X10_TEMP977 =
                          (j *
                             X10_TEMP157);
                        
//#line 746
final double X10_TEMP161 =
                          (X10_TEMP977);
                        
//#line 747
final double X10_TEMP980 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 749
final double X10_TEMP158 =
                          (X10_TEMP980);
                        
//#line 750
final double X10_TEMP983 =
                          (lg *
                             X10_TEMP158);
                        
//#line 752
final double X10_TEMP159 =
                          (X10_TEMP983);
                        
//#line 753
final double X10_TEMP986 =
                          (0.5);
                        
//#line 755
final double X10_TEMP160 =
                          (X10_TEMP986);
                        
//#line 756
final double X10_TEMP989 =
                          (X10_TEMP159 *
                             X10_TEMP160);
                        
//#line 758
final double X10_TEMP162 =
                          (X10_TEMP989);
                        
//#line 759
final double X10_TEMP992 =
                          (X10_TEMP161 +
                             X10_TEMP162);
                        
//#line 761
final double X10_TEMP164 =
                          (X10_TEMP992);
                        
//#line 762
final double X10_TEMP995 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 764
final double X10_TEMP166 =
                          (X10_TEMP995);
                        
//#line 765
final double X10_TEMP998 =
                          (k *
                             X10_TEMP166);
                        
//#line 767
final double X10_TEMP168 =
                          (X10_TEMP998);
                        
//#line 768
final double X10_TEMP1001 =
                          (0.0);
                        
//#line 770
double X10_TEMP176 =
                          (X10_TEMP1001);
                        
//#line 771
final double X10_TEMP1004 =
                          (0.0);
                        
//#line 773
double X10_TEMP177 =
                          (X10_TEMP1004);
                        
//#line 774
final double X10_TEMP1007 =
                          (0.0);
                        
//#line 776
double X10_TEMP178 =
                          (X10_TEMP1007);
                        
//#line 777
final double X10_TEMP1010 =
                          (0.0);
                        
//#line 779
double X10_TEMP179 =
                          (X10_TEMP1010);
                        
//#line 780
final double X10_TEMP1013 =
                          (0.0);
                        
//#line 782
double X10_TEMP180 =
                          (X10_TEMP1013);
                        
//#line 783
final double X10_TEMP1016 =
                          (0.0);
                        
//#line 785
double X10_TEMP181 =
                          (X10_TEMP1016);
                        
//#line 786
final Particle X10_TEMP1028 =
                          (new Particle(
                             X10_TEMP155,
                             X10_TEMP164,
                             X10_TEMP168,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179,
                             X10_TEMP180,
                             X10_TEMP181));
                        
//#line 788
final Particle X10_TEMP184 =
                          (X10_TEMP1028);
                        
//#line 789
final Particle X10_TEMP1031 =
                          (X10_TEMP184);
                        
//#line 791
final Particle X10_TEMP185 =
                          (X10_TEMP1031);
                        
//#line 792
final Particle X10_TEMP1035 =
                          (X10_TEMP185);
                        
//#line 794
final Particle X10_TEMP1038 =
                          (X10_TEMP1035);
                        
//#line 795
/* template:array_set { */(X10_TEMP146).set((X10_TEMP1038),ijk)/* } */;
                        
//#line 796
final int X10_TEMP1040 =
                          (1);
                        
//#line 798
final int X10_TEMP186 =
                          (X10_TEMP1040);
                        
//#line 799
final int X10_TEMP1043 =
                          (ijk +
                             X10_TEMP186);
                        
//#line 801
final int X10_TEMP188 =
                          (X10_TEMP1043);
                        
//#line 802
final int X10_TEMP1046 =
                          (X10_TEMP188);
                        
//#line 804
ijk =
                          ((X10_TEMP1046));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var4____ = (__var93__).iterator(); __var4____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var4__ = (x10.
                      lang.
                      point) __var4____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                        
//#line 717
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP950 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 719
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP146 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP950));
                        
//#line 720
final double X10_TEMP953 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 722
final double X10_TEMP148 =
                          (X10_TEMP953);
                        
//#line 723
final double X10_TEMP956 =
                          (i *
                             X10_TEMP148);
                        
//#line 725
final double X10_TEMP152 =
                          (X10_TEMP956);
                        
//#line 726
final double X10_TEMP959 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 728
final double X10_TEMP149 =
                          (X10_TEMP959);
                        
//#line 729
final double X10_TEMP962 =
                          (lg *
                             X10_TEMP149);
                        
//#line 731
final double X10_TEMP150 =
                          (X10_TEMP962);
                        
//#line 732
final double X10_TEMP965 =
                          (0.5);
                        
//#line 734
final double X10_TEMP151 =
                          (X10_TEMP965);
                        
//#line 735
final double X10_TEMP968 =
                          (X10_TEMP150 *
                             X10_TEMP151);
                        
//#line 737
final double X10_TEMP153 =
                          (X10_TEMP968);
                        
//#line 738
final double X10_TEMP971 =
                          (X10_TEMP152 +
                             X10_TEMP153);
                        
//#line 740
final double X10_TEMP155 =
                          (X10_TEMP971);
                        
//#line 741
final double X10_TEMP974 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 743
final double X10_TEMP157 =
                          (X10_TEMP974);
                        
//#line 744
final double X10_TEMP977 =
                          (j *
                             X10_TEMP157);
                        
//#line 746
final double X10_TEMP161 =
                          (X10_TEMP977);
                        
//#line 747
final double X10_TEMP980 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 749
final double X10_TEMP158 =
                          (X10_TEMP980);
                        
//#line 750
final double X10_TEMP983 =
                          (lg *
                             X10_TEMP158);
                        
//#line 752
final double X10_TEMP159 =
                          (X10_TEMP983);
                        
//#line 753
final double X10_TEMP986 =
                          (0.5);
                        
//#line 755
final double X10_TEMP160 =
                          (X10_TEMP986);
                        
//#line 756
final double X10_TEMP989 =
                          (X10_TEMP159 *
                             X10_TEMP160);
                        
//#line 758
final double X10_TEMP162 =
                          (X10_TEMP989);
                        
//#line 759
final double X10_TEMP992 =
                          (X10_TEMP161 +
                             X10_TEMP162);
                        
//#line 761
final double X10_TEMP164 =
                          (X10_TEMP992);
                        
//#line 762
final double X10_TEMP995 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 764
final double X10_TEMP166 =
                          (X10_TEMP995);
                        
//#line 765
final double X10_TEMP998 =
                          (k *
                             X10_TEMP166);
                        
//#line 767
final double X10_TEMP168 =
                          (X10_TEMP998);
                        
//#line 768
final double X10_TEMP1001 =
                          (0.0);
                        
//#line 770
double X10_TEMP176 =
                          (X10_TEMP1001);
                        
//#line 771
final double X10_TEMP1004 =
                          (0.0);
                        
//#line 773
double X10_TEMP177 =
                          (X10_TEMP1004);
                        
//#line 774
final double X10_TEMP1007 =
                          (0.0);
                        
//#line 776
double X10_TEMP178 =
                          (X10_TEMP1007);
                        
//#line 777
final double X10_TEMP1010 =
                          (0.0);
                        
//#line 779
double X10_TEMP179 =
                          (X10_TEMP1010);
                        
//#line 780
final double X10_TEMP1013 =
                          (0.0);
                        
//#line 782
double X10_TEMP180 =
                          (X10_TEMP1013);
                        
//#line 783
final double X10_TEMP1016 =
                          (0.0);
                        
//#line 785
double X10_TEMP181 =
                          (X10_TEMP1016);
                        
//#line 786
final Particle X10_TEMP1028 =
                          (new Particle(
                             X10_TEMP155,
                             X10_TEMP164,
                             X10_TEMP168,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179,
                             X10_TEMP180,
                             X10_TEMP181));
                        
//#line 788
final Particle X10_TEMP184 =
                          (X10_TEMP1028);
                        
//#line 789
final Particle X10_TEMP1031 =
                          (X10_TEMP184);
                        
//#line 791
final Particle X10_TEMP185 =
                          (X10_TEMP1031);
                        
//#line 792
final Particle X10_TEMP1035 =
                          (X10_TEMP185);
                        
//#line 794
final Particle X10_TEMP1038 =
                          (X10_TEMP1035);
                        
//#line 795
/* template:array_set { */(X10_TEMP146).set((X10_TEMP1038),ijk)/* } */;
                        
//#line 796
final int X10_TEMP1040 =
                          (1);
                        
//#line 798
final int X10_TEMP186 =
                          (X10_TEMP1040);
                        
//#line 799
final int X10_TEMP1043 =
                          (ijk +
                             X10_TEMP186);
                        
//#line 801
final int X10_TEMP188 =
                          (X10_TEMP1043);
                        
//#line 802
final int X10_TEMP1046 =
                          (X10_TEMP188);
                        
//#line 804
ijk =
                          ((X10_TEMP1046));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var2____ = (__var84__).iterator(); __var2____.hasNext(); ) {
            	final  x10.
              lang.
              point __var2__ = (x10.
              lang.
              point) __var2____.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var2__).get(0))/* } */;/* } */
{
                
//#line 691
final int X10_TEMP920 =
                  (0);
                
//#line 693
final int X10_TEMP135 =
                  (X10_TEMP920);
                
//#line 694
final int X10_TEMP923 =
                  (1);
                
//#line 696
final int X10_TEMP133 =
                  (X10_TEMP923);
                
//#line 697
final int X10_TEMP926 =
                  (mm -
                     X10_TEMP133);
                
//#line 699
final int X10_TEMP136 =
                  (X10_TEMP926);
                
//#line 700
final x10.
                  lang.
                  region X10_TEMP931 =
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
                          X10_TEMP135,
                          X10_TEMP136))));
                
//#line 702
final x10.
                  lang.
                  region X10_TEMP138 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP931));
                
//#line 703
/* template:forloop-mult { */{
                x10.lang.region __var96__ = (x10.lang.region) X10_TEMP138;
                if (__var96__.size() > 0 && (__var96__ instanceof x10.array.MultiDimRegion || __var96__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var97__ = __var96__.rank(0).low(), __var98__ = __var96__.rank(0).high(); __var97__ <= __var98__; __var97__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var97__;
                /* } */
                /* } */
{
                    
//#line 704
final int X10_TEMP935 =
                      (0);
                    
//#line 706
final int X10_TEMP142 =
                      (X10_TEMP935);
                    
//#line 707
final int X10_TEMP938 =
                      (1);
                    
//#line 709
final int X10_TEMP140 =
                      (X10_TEMP938);
                    
//#line 710
final int X10_TEMP941 =
                      (mm -
                         X10_TEMP140);
                    
//#line 712
final int X10_TEMP143 =
                      (X10_TEMP941);
                    
//#line 713
final x10.
                      lang.
                      region X10_TEMP946 =
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
                              X10_TEMP142,
                              X10_TEMP143))));
                    
//#line 715
final x10.
                      lang.
                      region X10_TEMP145 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP946));
                    
//#line 716
/* template:forloop-mult { */{
                    x10.lang.region __var99__ = (x10.lang.region) X10_TEMP145;
                    if (__var99__.size() > 0 && (__var99__ instanceof x10.array.MultiDimRegion || __var99__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var100__ = __var99__.rank(0).low(), __var101__ = __var99__.rank(0).high(); __var100__ <= __var101__; __var100__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var100__;
                    /* } */
                    /* } */
{
                        
//#line 717
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP950 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 719
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP146 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP950));
                        
//#line 720
final double X10_TEMP953 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 722
final double X10_TEMP148 =
                          (X10_TEMP953);
                        
//#line 723
final double X10_TEMP956 =
                          (i *
                             X10_TEMP148);
                        
//#line 725
final double X10_TEMP152 =
                          (X10_TEMP956);
                        
//#line 726
final double X10_TEMP959 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 728
final double X10_TEMP149 =
                          (X10_TEMP959);
                        
//#line 729
final double X10_TEMP962 =
                          (lg *
                             X10_TEMP149);
                        
//#line 731
final double X10_TEMP150 =
                          (X10_TEMP962);
                        
//#line 732
final double X10_TEMP965 =
                          (0.5);
                        
//#line 734
final double X10_TEMP151 =
                          (X10_TEMP965);
                        
//#line 735
final double X10_TEMP968 =
                          (X10_TEMP150 *
                             X10_TEMP151);
                        
//#line 737
final double X10_TEMP153 =
                          (X10_TEMP968);
                        
//#line 738
final double X10_TEMP971 =
                          (X10_TEMP152 +
                             X10_TEMP153);
                        
//#line 740
final double X10_TEMP155 =
                          (X10_TEMP971);
                        
//#line 741
final double X10_TEMP974 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 743
final double X10_TEMP157 =
                          (X10_TEMP974);
                        
//#line 744
final double X10_TEMP977 =
                          (j *
                             X10_TEMP157);
                        
//#line 746
final double X10_TEMP161 =
                          (X10_TEMP977);
                        
//#line 747
final double X10_TEMP980 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 749
final double X10_TEMP158 =
                          (X10_TEMP980);
                        
//#line 750
final double X10_TEMP983 =
                          (lg *
                             X10_TEMP158);
                        
//#line 752
final double X10_TEMP159 =
                          (X10_TEMP983);
                        
//#line 753
final double X10_TEMP986 =
                          (0.5);
                        
//#line 755
final double X10_TEMP160 =
                          (X10_TEMP986);
                        
//#line 756
final double X10_TEMP989 =
                          (X10_TEMP159 *
                             X10_TEMP160);
                        
//#line 758
final double X10_TEMP162 =
                          (X10_TEMP989);
                        
//#line 759
final double X10_TEMP992 =
                          (X10_TEMP161 +
                             X10_TEMP162);
                        
//#line 761
final double X10_TEMP164 =
                          (X10_TEMP992);
                        
//#line 762
final double X10_TEMP995 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 764
final double X10_TEMP166 =
                          (X10_TEMP995);
                        
//#line 765
final double X10_TEMP998 =
                          (k *
                             X10_TEMP166);
                        
//#line 767
final double X10_TEMP168 =
                          (X10_TEMP998);
                        
//#line 768
final double X10_TEMP1001 =
                          (0.0);
                        
//#line 770
double X10_TEMP176 =
                          (X10_TEMP1001);
                        
//#line 771
final double X10_TEMP1004 =
                          (0.0);
                        
//#line 773
double X10_TEMP177 =
                          (X10_TEMP1004);
                        
//#line 774
final double X10_TEMP1007 =
                          (0.0);
                        
//#line 776
double X10_TEMP178 =
                          (X10_TEMP1007);
                        
//#line 777
final double X10_TEMP1010 =
                          (0.0);
                        
//#line 779
double X10_TEMP179 =
                          (X10_TEMP1010);
                        
//#line 780
final double X10_TEMP1013 =
                          (0.0);
                        
//#line 782
double X10_TEMP180 =
                          (X10_TEMP1013);
                        
//#line 783
final double X10_TEMP1016 =
                          (0.0);
                        
//#line 785
double X10_TEMP181 =
                          (X10_TEMP1016);
                        
//#line 786
final Particle X10_TEMP1028 =
                          (new Particle(
                             X10_TEMP155,
                             X10_TEMP164,
                             X10_TEMP168,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179,
                             X10_TEMP180,
                             X10_TEMP181));
                        
//#line 788
final Particle X10_TEMP184 =
                          (X10_TEMP1028);
                        
//#line 789
final Particle X10_TEMP1031 =
                          (X10_TEMP184);
                        
//#line 791
final Particle X10_TEMP185 =
                          (X10_TEMP1031);
                        
//#line 792
final Particle X10_TEMP1035 =
                          (X10_TEMP185);
                        
//#line 794
final Particle X10_TEMP1038 =
                          (X10_TEMP1035);
                        
//#line 795
/* template:array_set { */(X10_TEMP146).set((X10_TEMP1038),ijk)/* } */;
                        
//#line 796
final int X10_TEMP1040 =
                          (1);
                        
//#line 798
final int X10_TEMP186 =
                          (X10_TEMP1040);
                        
//#line 799
final int X10_TEMP1043 =
                          (ijk +
                             X10_TEMP186);
                        
//#line 801
final int X10_TEMP188 =
                          (X10_TEMP1043);
                        
//#line 802
final int X10_TEMP1046 =
                          (X10_TEMP188);
                        
//#line 804
ijk =
                          ((X10_TEMP1046));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var4____ = (__var99__).iterator(); __var4____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var4__ = (x10.
                      lang.
                      point) __var4____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                        
//#line 717
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP950 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 719
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP146 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP950));
                        
//#line 720
final double X10_TEMP953 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 722
final double X10_TEMP148 =
                          (X10_TEMP953);
                        
//#line 723
final double X10_TEMP956 =
                          (i *
                             X10_TEMP148);
                        
//#line 725
final double X10_TEMP152 =
                          (X10_TEMP956);
                        
//#line 726
final double X10_TEMP959 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 728
final double X10_TEMP149 =
                          (X10_TEMP959);
                        
//#line 729
final double X10_TEMP962 =
                          (lg *
                             X10_TEMP149);
                        
//#line 731
final double X10_TEMP150 =
                          (X10_TEMP962);
                        
//#line 732
final double X10_TEMP965 =
                          (0.5);
                        
//#line 734
final double X10_TEMP151 =
                          (X10_TEMP965);
                        
//#line 735
final double X10_TEMP968 =
                          (X10_TEMP150 *
                             X10_TEMP151);
                        
//#line 737
final double X10_TEMP153 =
                          (X10_TEMP968);
                        
//#line 738
final double X10_TEMP971 =
                          (X10_TEMP152 +
                             X10_TEMP153);
                        
//#line 740
final double X10_TEMP155 =
                          (X10_TEMP971);
                        
//#line 741
final double X10_TEMP974 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 743
final double X10_TEMP157 =
                          (X10_TEMP974);
                        
//#line 744
final double X10_TEMP977 =
                          (j *
                             X10_TEMP157);
                        
//#line 746
final double X10_TEMP161 =
                          (X10_TEMP977);
                        
//#line 747
final double X10_TEMP980 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 749
final double X10_TEMP158 =
                          (X10_TEMP980);
                        
//#line 750
final double X10_TEMP983 =
                          (lg *
                             X10_TEMP158);
                        
//#line 752
final double X10_TEMP159 =
                          (X10_TEMP983);
                        
//#line 753
final double X10_TEMP986 =
                          (0.5);
                        
//#line 755
final double X10_TEMP160 =
                          (X10_TEMP986);
                        
//#line 756
final double X10_TEMP989 =
                          (X10_TEMP159 *
                             X10_TEMP160);
                        
//#line 758
final double X10_TEMP162 =
                          (X10_TEMP989);
                        
//#line 759
final double X10_TEMP992 =
                          (X10_TEMP161 +
                             X10_TEMP162);
                        
//#line 761
final double X10_TEMP164 =
                          (X10_TEMP992);
                        
//#line 762
final double X10_TEMP995 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 764
final double X10_TEMP166 =
                          (X10_TEMP995);
                        
//#line 765
final double X10_TEMP998 =
                          (k *
                             X10_TEMP166);
                        
//#line 767
final double X10_TEMP168 =
                          (X10_TEMP998);
                        
//#line 768
final double X10_TEMP1001 =
                          (0.0);
                        
//#line 770
double X10_TEMP176 =
                          (X10_TEMP1001);
                        
//#line 771
final double X10_TEMP1004 =
                          (0.0);
                        
//#line 773
double X10_TEMP177 =
                          (X10_TEMP1004);
                        
//#line 774
final double X10_TEMP1007 =
                          (0.0);
                        
//#line 776
double X10_TEMP178 =
                          (X10_TEMP1007);
                        
//#line 777
final double X10_TEMP1010 =
                          (0.0);
                        
//#line 779
double X10_TEMP179 =
                          (X10_TEMP1010);
                        
//#line 780
final double X10_TEMP1013 =
                          (0.0);
                        
//#line 782
double X10_TEMP180 =
                          (X10_TEMP1013);
                        
//#line 783
final double X10_TEMP1016 =
                          (0.0);
                        
//#line 785
double X10_TEMP181 =
                          (X10_TEMP1016);
                        
//#line 786
final Particle X10_TEMP1028 =
                          (new Particle(
                             X10_TEMP155,
                             X10_TEMP164,
                             X10_TEMP168,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179,
                             X10_TEMP180,
                             X10_TEMP181));
                        
//#line 788
final Particle X10_TEMP184 =
                          (X10_TEMP1028);
                        
//#line 789
final Particle X10_TEMP1031 =
                          (X10_TEMP184);
                        
//#line 791
final Particle X10_TEMP185 =
                          (X10_TEMP1031);
                        
//#line 792
final Particle X10_TEMP1035 =
                          (X10_TEMP185);
                        
//#line 794
final Particle X10_TEMP1038 =
                          (X10_TEMP1035);
                        
//#line 795
/* template:array_set { */(X10_TEMP146).set((X10_TEMP1038),ijk)/* } */;
                        
//#line 796
final int X10_TEMP1040 =
                          (1);
                        
//#line 798
final int X10_TEMP186 =
                          (X10_TEMP1040);
                        
//#line 799
final int X10_TEMP1043 =
                          (ijk +
                             X10_TEMP186);
                        
//#line 801
final int X10_TEMP188 =
                          (X10_TEMP1043);
                        
//#line 802
final int X10_TEMP1046 =
                          (X10_TEMP188);
                        
//#line 804
ijk =
                          ((X10_TEMP1046));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var3____ = (__var96__).iterator(); __var3____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var3__ = (x10.
                  lang.
                  point) __var3____.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                    
//#line 704
final int X10_TEMP935 =
                      (0);
                    
//#line 706
final int X10_TEMP142 =
                      (X10_TEMP935);
                    
//#line 707
final int X10_TEMP938 =
                      (1);
                    
//#line 709
final int X10_TEMP140 =
                      (X10_TEMP938);
                    
//#line 710
final int X10_TEMP941 =
                      (mm -
                         X10_TEMP140);
                    
//#line 712
final int X10_TEMP143 =
                      (X10_TEMP941);
                    
//#line 713
final x10.
                      lang.
                      region X10_TEMP946 =
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
                              X10_TEMP142,
                              X10_TEMP143))));
                    
//#line 715
final x10.
                      lang.
                      region X10_TEMP145 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP946));
                    
//#line 716
/* template:forloop-mult { */{
                    x10.lang.region __var102__ = (x10.lang.region) X10_TEMP145;
                    if (__var102__.size() > 0 && (__var102__ instanceof x10.array.MultiDimRegion || __var102__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var103__ = __var102__.rank(0).low(), __var104__ = __var102__.rank(0).high(); __var103__ <= __var104__; __var103__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var103__;
                    /* } */
                    /* } */
{
                        
//#line 717
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP950 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 719
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP146 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP950));
                        
//#line 720
final double X10_TEMP953 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 722
final double X10_TEMP148 =
                          (X10_TEMP953);
                        
//#line 723
final double X10_TEMP956 =
                          (i *
                             X10_TEMP148);
                        
//#line 725
final double X10_TEMP152 =
                          (X10_TEMP956);
                        
//#line 726
final double X10_TEMP959 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 728
final double X10_TEMP149 =
                          (X10_TEMP959);
                        
//#line 729
final double X10_TEMP962 =
                          (lg *
                             X10_TEMP149);
                        
//#line 731
final double X10_TEMP150 =
                          (X10_TEMP962);
                        
//#line 732
final double X10_TEMP965 =
                          (0.5);
                        
//#line 734
final double X10_TEMP151 =
                          (X10_TEMP965);
                        
//#line 735
final double X10_TEMP968 =
                          (X10_TEMP150 *
                             X10_TEMP151);
                        
//#line 737
final double X10_TEMP153 =
                          (X10_TEMP968);
                        
//#line 738
final double X10_TEMP971 =
                          (X10_TEMP152 +
                             X10_TEMP153);
                        
//#line 740
final double X10_TEMP155 =
                          (X10_TEMP971);
                        
//#line 741
final double X10_TEMP974 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 743
final double X10_TEMP157 =
                          (X10_TEMP974);
                        
//#line 744
final double X10_TEMP977 =
                          (j *
                             X10_TEMP157);
                        
//#line 746
final double X10_TEMP161 =
                          (X10_TEMP977);
                        
//#line 747
final double X10_TEMP980 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 749
final double X10_TEMP158 =
                          (X10_TEMP980);
                        
//#line 750
final double X10_TEMP983 =
                          (lg *
                             X10_TEMP158);
                        
//#line 752
final double X10_TEMP159 =
                          (X10_TEMP983);
                        
//#line 753
final double X10_TEMP986 =
                          (0.5);
                        
//#line 755
final double X10_TEMP160 =
                          (X10_TEMP986);
                        
//#line 756
final double X10_TEMP989 =
                          (X10_TEMP159 *
                             X10_TEMP160);
                        
//#line 758
final double X10_TEMP162 =
                          (X10_TEMP989);
                        
//#line 759
final double X10_TEMP992 =
                          (X10_TEMP161 +
                             X10_TEMP162);
                        
//#line 761
final double X10_TEMP164 =
                          (X10_TEMP992);
                        
//#line 762
final double X10_TEMP995 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 764
final double X10_TEMP166 =
                          (X10_TEMP995);
                        
//#line 765
final double X10_TEMP998 =
                          (k *
                             X10_TEMP166);
                        
//#line 767
final double X10_TEMP168 =
                          (X10_TEMP998);
                        
//#line 768
final double X10_TEMP1001 =
                          (0.0);
                        
//#line 770
double X10_TEMP176 =
                          (X10_TEMP1001);
                        
//#line 771
final double X10_TEMP1004 =
                          (0.0);
                        
//#line 773
double X10_TEMP177 =
                          (X10_TEMP1004);
                        
//#line 774
final double X10_TEMP1007 =
                          (0.0);
                        
//#line 776
double X10_TEMP178 =
                          (X10_TEMP1007);
                        
//#line 777
final double X10_TEMP1010 =
                          (0.0);
                        
//#line 779
double X10_TEMP179 =
                          (X10_TEMP1010);
                        
//#line 780
final double X10_TEMP1013 =
                          (0.0);
                        
//#line 782
double X10_TEMP180 =
                          (X10_TEMP1013);
                        
//#line 783
final double X10_TEMP1016 =
                          (0.0);
                        
//#line 785
double X10_TEMP181 =
                          (X10_TEMP1016);
                        
//#line 786
final Particle X10_TEMP1028 =
                          (new Particle(
                             X10_TEMP155,
                             X10_TEMP164,
                             X10_TEMP168,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179,
                             X10_TEMP180,
                             X10_TEMP181));
                        
//#line 788
final Particle X10_TEMP184 =
                          (X10_TEMP1028);
                        
//#line 789
final Particle X10_TEMP1031 =
                          (X10_TEMP184);
                        
//#line 791
final Particle X10_TEMP185 =
                          (X10_TEMP1031);
                        
//#line 792
final Particle X10_TEMP1035 =
                          (X10_TEMP185);
                        
//#line 794
final Particle X10_TEMP1038 =
                          (X10_TEMP1035);
                        
//#line 795
/* template:array_set { */(X10_TEMP146).set((X10_TEMP1038),ijk)/* } */;
                        
//#line 796
final int X10_TEMP1040 =
                          (1);
                        
//#line 798
final int X10_TEMP186 =
                          (X10_TEMP1040);
                        
//#line 799
final int X10_TEMP1043 =
                          (ijk +
                             X10_TEMP186);
                        
//#line 801
final int X10_TEMP188 =
                          (X10_TEMP1043);
                        
//#line 802
final int X10_TEMP1046 =
                          (X10_TEMP188);
                        
//#line 804
ijk =
                          ((X10_TEMP1046));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var4____ = (__var102__).iterator(); __var4____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var4__ = (x10.
                      lang.
                      point) __var4____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                        
//#line 717
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP950 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 719
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP146 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP950));
                        
//#line 720
final double X10_TEMP953 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 722
final double X10_TEMP148 =
                          (X10_TEMP953);
                        
//#line 723
final double X10_TEMP956 =
                          (i *
                             X10_TEMP148);
                        
//#line 725
final double X10_TEMP152 =
                          (X10_TEMP956);
                        
//#line 726
final double X10_TEMP959 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 728
final double X10_TEMP149 =
                          (X10_TEMP959);
                        
//#line 729
final double X10_TEMP962 =
                          (lg *
                             X10_TEMP149);
                        
//#line 731
final double X10_TEMP150 =
                          (X10_TEMP962);
                        
//#line 732
final double X10_TEMP965 =
                          (0.5);
                        
//#line 734
final double X10_TEMP151 =
                          (X10_TEMP965);
                        
//#line 735
final double X10_TEMP968 =
                          (X10_TEMP150 *
                             X10_TEMP151);
                        
//#line 737
final double X10_TEMP153 =
                          (X10_TEMP968);
                        
//#line 738
final double X10_TEMP971 =
                          (X10_TEMP152 +
                             X10_TEMP153);
                        
//#line 740
final double X10_TEMP155 =
                          (X10_TEMP971);
                        
//#line 741
final double X10_TEMP974 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 743
final double X10_TEMP157 =
                          (X10_TEMP974);
                        
//#line 744
final double X10_TEMP977 =
                          (j *
                             X10_TEMP157);
                        
//#line 746
final double X10_TEMP161 =
                          (X10_TEMP977);
                        
//#line 747
final double X10_TEMP980 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 749
final double X10_TEMP158 =
                          (X10_TEMP980);
                        
//#line 750
final double X10_TEMP983 =
                          (lg *
                             X10_TEMP158);
                        
//#line 752
final double X10_TEMP159 =
                          (X10_TEMP983);
                        
//#line 753
final double X10_TEMP986 =
                          (0.5);
                        
//#line 755
final double X10_TEMP160 =
                          (X10_TEMP986);
                        
//#line 756
final double X10_TEMP989 =
                          (X10_TEMP159 *
                             X10_TEMP160);
                        
//#line 758
final double X10_TEMP162 =
                          (X10_TEMP989);
                        
//#line 759
final double X10_TEMP992 =
                          (X10_TEMP161 +
                             X10_TEMP162);
                        
//#line 761
final double X10_TEMP164 =
                          (X10_TEMP992);
                        
//#line 762
final double X10_TEMP995 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 764
final double X10_TEMP166 =
                          (X10_TEMP995);
                        
//#line 765
final double X10_TEMP998 =
                          (k *
                             X10_TEMP166);
                        
//#line 767
final double X10_TEMP168 =
                          (X10_TEMP998);
                        
//#line 768
final double X10_TEMP1001 =
                          (0.0);
                        
//#line 770
double X10_TEMP176 =
                          (X10_TEMP1001);
                        
//#line 771
final double X10_TEMP1004 =
                          (0.0);
                        
//#line 773
double X10_TEMP177 =
                          (X10_TEMP1004);
                        
//#line 774
final double X10_TEMP1007 =
                          (0.0);
                        
//#line 776
double X10_TEMP178 =
                          (X10_TEMP1007);
                        
//#line 777
final double X10_TEMP1010 =
                          (0.0);
                        
//#line 779
double X10_TEMP179 =
                          (X10_TEMP1010);
                        
//#line 780
final double X10_TEMP1013 =
                          (0.0);
                        
//#line 782
double X10_TEMP180 =
                          (X10_TEMP1013);
                        
//#line 783
final double X10_TEMP1016 =
                          (0.0);
                        
//#line 785
double X10_TEMP181 =
                          (X10_TEMP1016);
                        
//#line 786
final Particle X10_TEMP1028 =
                          (new Particle(
                             X10_TEMP155,
                             X10_TEMP164,
                             X10_TEMP168,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179,
                             X10_TEMP180,
                             X10_TEMP181));
                        
//#line 788
final Particle X10_TEMP184 =
                          (X10_TEMP1028);
                        
//#line 789
final Particle X10_TEMP1031 =
                          (X10_TEMP184);
                        
//#line 791
final Particle X10_TEMP185 =
                          (X10_TEMP1031);
                        
//#line 792
final Particle X10_TEMP1035 =
                          (X10_TEMP185);
                        
//#line 794
final Particle X10_TEMP1038 =
                          (X10_TEMP1035);
                        
//#line 795
/* template:array_set { */(X10_TEMP146).set((X10_TEMP1038),ijk)/* } */;
                        
//#line 796
final int X10_TEMP1040 =
                          (1);
                        
//#line 798
final int X10_TEMP186 =
                          (X10_TEMP1040);
                        
//#line 799
final int X10_TEMP1043 =
                          (ijk +
                             X10_TEMP186);
                        
//#line 801
final int X10_TEMP188 =
                          (X10_TEMP1043);
                        
//#line 802
final int X10_TEMP1046 =
                          (X10_TEMP188);
                        
//#line 804
ijk =
                          ((X10_TEMP1046));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 809
final int X10_TEMP1049 =
          (1);
        
//#line 811
final int X10_TEMP191 =
          (X10_TEMP1049);
        
//#line 812
final int X10_TEMP1052 =
          (2);
        
//#line 814
final int X10_TEMP192 =
          (X10_TEMP1052);
        
//#line 815
final x10.
          lang.
          region X10_TEMP1057 =
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
                  X10_TEMP191,
                  X10_TEMP192))));
        
//#line 817
final x10.
          lang.
          region X10_TEMP194 =
          (x10.
            lang.
            region)
            ((X10_TEMP1057));
        
//#line 818
/* template:forloop-mult { */{
        x10.lang.region __var105__ = (x10.lang.region) X10_TEMP194;
        if (__var105__.size() > 0 && (__var105__ instanceof x10.array.MultiDimRegion || __var105__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var106__ = __var105__.rank(0).low(), __var107__ = __var105__.rank(0).high(); __var106__ <= __var107__; __var106__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int lg = __var106__;
        /* } */
        /* } */
{
            
//#line 819
final int X10_TEMP1061 =
              (0);
            
//#line 821
final int X10_TEMP198 =
              (X10_TEMP1061);
            
//#line 822
final int X10_TEMP1064 =
              (1);
            
//#line 824
final int X10_TEMP196 =
              (X10_TEMP1064);
            
//#line 825
final int X10_TEMP1067 =
              (mm -
                 X10_TEMP196);
            
//#line 827
final int X10_TEMP199 =
              (X10_TEMP1067);
            
//#line 828
final x10.
              lang.
              region X10_TEMP1072 =
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
                      X10_TEMP198,
                      X10_TEMP199))));
            
//#line 830
final x10.
              lang.
              region X10_TEMP201 =
              (x10.
                lang.
                region)
                ((X10_TEMP1072));
            
//#line 831
/* template:forloop-mult { */{
            x10.lang.region __var108__ = (x10.lang.region) X10_TEMP201;
            if (__var108__.size() > 0 && (__var108__ instanceof x10.array.MultiDimRegion || __var108__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var109__ = __var108__.rank(0).low(), __var110__ = __var108__.rank(0).high(); __var109__ <= __var110__; __var109__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var109__;
            /* } */
            /* } */
{
                
//#line 832
final int X10_TEMP1076 =
                  (0);
                
//#line 834
final int X10_TEMP205 =
                  (X10_TEMP1076);
                
//#line 835
final int X10_TEMP1079 =
                  (1);
                
//#line 837
final int X10_TEMP203 =
                  (X10_TEMP1079);
                
//#line 838
final int X10_TEMP1082 =
                  (mm -
                     X10_TEMP203);
                
//#line 840
final int X10_TEMP206 =
                  (X10_TEMP1082);
                
//#line 841
final x10.
                  lang.
                  region X10_TEMP1087 =
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
                          X10_TEMP205,
                          X10_TEMP206))));
                
//#line 843
final x10.
                  lang.
                  region X10_TEMP208 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP1087));
                
//#line 844
/* template:forloop-mult { */{
                x10.lang.region __var111__ = (x10.lang.region) X10_TEMP208;
                if (__var111__.size() > 0 && (__var111__ instanceof x10.array.MultiDimRegion || __var111__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var112__ = __var111__.rank(0).low(), __var113__ = __var111__.rank(0).high(); __var112__ <= __var113__; __var112__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var112__;
                /* } */
                /* } */
{
                    
//#line 845
final int X10_TEMP1091 =
                      (0);
                    
//#line 847
final int X10_TEMP212 =
                      (X10_TEMP1091);
                    
//#line 848
final int X10_TEMP1094 =
                      (1);
                    
//#line 850
final int X10_TEMP210 =
                      (X10_TEMP1094);
                    
//#line 851
final int X10_TEMP1097 =
                      (mm -
                         X10_TEMP210);
                    
//#line 853
final int X10_TEMP213 =
                      (X10_TEMP1097);
                    
//#line 854
final x10.
                      lang.
                      region X10_TEMP1102 =
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
                              X10_TEMP212,
                              X10_TEMP213))));
                    
//#line 856
final x10.
                      lang.
                      region X10_TEMP215 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1102));
                    
//#line 857
/* template:forloop-mult { */{
                    x10.lang.region __var114__ = (x10.lang.region) X10_TEMP215;
                    if (__var114__.size() > 0 && (__var114__ instanceof x10.array.MultiDimRegion || __var114__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var115__ = __var114__.rank(0).low(), __var116__ = __var114__.rank(0).high(); __var115__ <= __var116__; __var115__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var115__;
                    /* } */
                    /* } */
{
                        
//#line 858
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1106 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 860
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP216 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1106));
                        
//#line 861
final double X10_TEMP1109 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 863
final double X10_TEMP218 =
                          (X10_TEMP1109);
                        
//#line 864
final double X10_TEMP1112 =
                          (i *
                             X10_TEMP218);
                        
//#line 866
final double X10_TEMP225 =
                          (X10_TEMP1112);
                        
//#line 867
final int X10_TEMP1115 =
                          (2);
                        
//#line 869
final int X10_TEMP219 =
                          (X10_TEMP1115);
                        
//#line 870
final int X10_TEMP1118 =
                          (X10_TEMP219 -
                             lg);
                        
//#line 872
final int X10_TEMP221 =
                          (X10_TEMP1118);
                        
//#line 873
final double X10_TEMP1121 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 875
final double X10_TEMP222 =
                          (X10_TEMP1121);
                        
//#line 876
final double X10_TEMP1124 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 878
final double X10_TEMP223 =
                          (X10_TEMP1124);
                        
//#line 879
final double X10_TEMP1127 =
                          (0.5);
                        
//#line 881
final double X10_TEMP224 =
                          (X10_TEMP1127);
                        
//#line 882
final double X10_TEMP1130 =
                          (X10_TEMP223 *
                             X10_TEMP224);
                        
//#line 884
final double X10_TEMP226 =
                          (X10_TEMP1130);
                        
//#line 885
final double X10_TEMP1133 =
                          (X10_TEMP225 +
                             X10_TEMP226);
                        
//#line 887
final double X10_TEMP228 =
                          (X10_TEMP1133);
                        
//#line 888
final double X10_TEMP1136 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 890
final double X10_TEMP230 =
                          (X10_TEMP1136);
                        
//#line 891
final double X10_TEMP1139 =
                          (j *
                             X10_TEMP230);
                        
//#line 893
final double X10_TEMP237 =
                          (X10_TEMP1139);
                        
//#line 894
final int X10_TEMP1142 =
                          (1);
                        
//#line 896
final int X10_TEMP231 =
                          (X10_TEMP1142);
                        
//#line 897
final int X10_TEMP1145 =
                          (lg -
                             X10_TEMP231);
                        
//#line 899
final int X10_TEMP233 =
                          (X10_TEMP1145);
                        
//#line 900
final double X10_TEMP1148 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 902
final double X10_TEMP234 =
                          (X10_TEMP1148);
                        
//#line 903
final double X10_TEMP1151 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 905
final double X10_TEMP235 =
                          (X10_TEMP1151);
                        
//#line 906
final double X10_TEMP1154 =
                          (0.5);
                        
//#line 908
final double X10_TEMP236 =
                          (X10_TEMP1154);
                        
//#line 909
final double X10_TEMP1157 =
                          (X10_TEMP235 *
                             X10_TEMP236);
                        
//#line 911
final double X10_TEMP238 =
                          (X10_TEMP1157);
                        
//#line 912
final double X10_TEMP1160 =
                          (X10_TEMP237 +
                             X10_TEMP238);
                        
//#line 914
final double X10_TEMP240 =
                          (X10_TEMP1160);
                        
//#line 915
final double X10_TEMP1163 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 917
final double X10_TEMP242 =
                          (X10_TEMP1163);
                        
//#line 918
final double X10_TEMP1166 =
                          (k *
                             X10_TEMP242);
                        
//#line 920
final double X10_TEMP245 =
                          (X10_TEMP1166);
                        
//#line 921
final double X10_TEMP1169 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 923
final double X10_TEMP243 =
                          (X10_TEMP1169);
                        
//#line 924
final double X10_TEMP1172 =
                          (0.5);
                        
//#line 926
final double X10_TEMP244 =
                          (X10_TEMP1172);
                        
//#line 927
final double X10_TEMP1175 =
                          (X10_TEMP243 *
                             X10_TEMP244);
                        
//#line 929
final double X10_TEMP246 =
                          (X10_TEMP1175);
                        
//#line 930
final double X10_TEMP1178 =
                          (X10_TEMP245 +
                             X10_TEMP246);
                        
//#line 932
final double X10_TEMP248 =
                          (X10_TEMP1178);
                        
//#line 933
final double X10_TEMP1181 =
                          (0.0);
                        
//#line 935
double X10_TEMP256 =
                          (X10_TEMP1181);
                        
//#line 936
final double X10_TEMP1184 =
                          (0.0);
                        
//#line 938
double X10_TEMP257 =
                          (X10_TEMP1184);
                        
//#line 939
final double X10_TEMP1187 =
                          (0.0);
                        
//#line 941
double X10_TEMP258 =
                          (X10_TEMP1187);
                        
//#line 942
final double X10_TEMP1190 =
                          (0.0);
                        
//#line 944
double X10_TEMP259 =
                          (X10_TEMP1190);
                        
//#line 945
final double X10_TEMP1193 =
                          (0.0);
                        
//#line 947
double X10_TEMP260 =
                          (X10_TEMP1193);
                        
//#line 948
final double X10_TEMP1196 =
                          (0.0);
                        
//#line 950
double X10_TEMP261 =
                          (X10_TEMP1196);
                        
//#line 951
final Particle X10_TEMP1208 =
                          (new Particle(
                             X10_TEMP228,
                             X10_TEMP240,
                             X10_TEMP248,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259,
                             X10_TEMP260,
                             X10_TEMP261));
                        
//#line 953
final Particle X10_TEMP264 =
                          (X10_TEMP1208);
                        
//#line 954
final Particle X10_TEMP1211 =
                          (X10_TEMP264);
                        
//#line 956
final Particle X10_TEMP265 =
                          (X10_TEMP1211);
                        
//#line 957
final Particle X10_TEMP1215 =
                          (X10_TEMP265);
                        
//#line 959
final Particle X10_TEMP1218 =
                          (X10_TEMP1215);
                        
//#line 960
/* template:array_set { */(X10_TEMP216).set((X10_TEMP1218),ijk)/* } */;
                        
//#line 961
final int X10_TEMP1220 =
                          (1);
                        
//#line 963
final int X10_TEMP266 =
                          (X10_TEMP1220);
                        
//#line 964
final int X10_TEMP1223 =
                          (ijk +
                             X10_TEMP266);
                        
//#line 966
final int X10_TEMP268 =
                          (X10_TEMP1223);
                        
//#line 967
final int X10_TEMP1226 =
                          (X10_TEMP268);
                        
//#line 969
ijk =
                          ((X10_TEMP1226));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var8____ = (__var114__).iterator(); __var8____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var8__ = (x10.
                      lang.
                      point) __var8____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                        
//#line 858
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1106 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 860
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP216 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1106));
                        
//#line 861
final double X10_TEMP1109 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 863
final double X10_TEMP218 =
                          (X10_TEMP1109);
                        
//#line 864
final double X10_TEMP1112 =
                          (i *
                             X10_TEMP218);
                        
//#line 866
final double X10_TEMP225 =
                          (X10_TEMP1112);
                        
//#line 867
final int X10_TEMP1115 =
                          (2);
                        
//#line 869
final int X10_TEMP219 =
                          (X10_TEMP1115);
                        
//#line 870
final int X10_TEMP1118 =
                          (X10_TEMP219 -
                             lg);
                        
//#line 872
final int X10_TEMP221 =
                          (X10_TEMP1118);
                        
//#line 873
final double X10_TEMP1121 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 875
final double X10_TEMP222 =
                          (X10_TEMP1121);
                        
//#line 876
final double X10_TEMP1124 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 878
final double X10_TEMP223 =
                          (X10_TEMP1124);
                        
//#line 879
final double X10_TEMP1127 =
                          (0.5);
                        
//#line 881
final double X10_TEMP224 =
                          (X10_TEMP1127);
                        
//#line 882
final double X10_TEMP1130 =
                          (X10_TEMP223 *
                             X10_TEMP224);
                        
//#line 884
final double X10_TEMP226 =
                          (X10_TEMP1130);
                        
//#line 885
final double X10_TEMP1133 =
                          (X10_TEMP225 +
                             X10_TEMP226);
                        
//#line 887
final double X10_TEMP228 =
                          (X10_TEMP1133);
                        
//#line 888
final double X10_TEMP1136 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 890
final double X10_TEMP230 =
                          (X10_TEMP1136);
                        
//#line 891
final double X10_TEMP1139 =
                          (j *
                             X10_TEMP230);
                        
//#line 893
final double X10_TEMP237 =
                          (X10_TEMP1139);
                        
//#line 894
final int X10_TEMP1142 =
                          (1);
                        
//#line 896
final int X10_TEMP231 =
                          (X10_TEMP1142);
                        
//#line 897
final int X10_TEMP1145 =
                          (lg -
                             X10_TEMP231);
                        
//#line 899
final int X10_TEMP233 =
                          (X10_TEMP1145);
                        
//#line 900
final double X10_TEMP1148 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 902
final double X10_TEMP234 =
                          (X10_TEMP1148);
                        
//#line 903
final double X10_TEMP1151 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 905
final double X10_TEMP235 =
                          (X10_TEMP1151);
                        
//#line 906
final double X10_TEMP1154 =
                          (0.5);
                        
//#line 908
final double X10_TEMP236 =
                          (X10_TEMP1154);
                        
//#line 909
final double X10_TEMP1157 =
                          (X10_TEMP235 *
                             X10_TEMP236);
                        
//#line 911
final double X10_TEMP238 =
                          (X10_TEMP1157);
                        
//#line 912
final double X10_TEMP1160 =
                          (X10_TEMP237 +
                             X10_TEMP238);
                        
//#line 914
final double X10_TEMP240 =
                          (X10_TEMP1160);
                        
//#line 915
final double X10_TEMP1163 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 917
final double X10_TEMP242 =
                          (X10_TEMP1163);
                        
//#line 918
final double X10_TEMP1166 =
                          (k *
                             X10_TEMP242);
                        
//#line 920
final double X10_TEMP245 =
                          (X10_TEMP1166);
                        
//#line 921
final double X10_TEMP1169 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 923
final double X10_TEMP243 =
                          (X10_TEMP1169);
                        
//#line 924
final double X10_TEMP1172 =
                          (0.5);
                        
//#line 926
final double X10_TEMP244 =
                          (X10_TEMP1172);
                        
//#line 927
final double X10_TEMP1175 =
                          (X10_TEMP243 *
                             X10_TEMP244);
                        
//#line 929
final double X10_TEMP246 =
                          (X10_TEMP1175);
                        
//#line 930
final double X10_TEMP1178 =
                          (X10_TEMP245 +
                             X10_TEMP246);
                        
//#line 932
final double X10_TEMP248 =
                          (X10_TEMP1178);
                        
//#line 933
final double X10_TEMP1181 =
                          (0.0);
                        
//#line 935
double X10_TEMP256 =
                          (X10_TEMP1181);
                        
//#line 936
final double X10_TEMP1184 =
                          (0.0);
                        
//#line 938
double X10_TEMP257 =
                          (X10_TEMP1184);
                        
//#line 939
final double X10_TEMP1187 =
                          (0.0);
                        
//#line 941
double X10_TEMP258 =
                          (X10_TEMP1187);
                        
//#line 942
final double X10_TEMP1190 =
                          (0.0);
                        
//#line 944
double X10_TEMP259 =
                          (X10_TEMP1190);
                        
//#line 945
final double X10_TEMP1193 =
                          (0.0);
                        
//#line 947
double X10_TEMP260 =
                          (X10_TEMP1193);
                        
//#line 948
final double X10_TEMP1196 =
                          (0.0);
                        
//#line 950
double X10_TEMP261 =
                          (X10_TEMP1196);
                        
//#line 951
final Particle X10_TEMP1208 =
                          (new Particle(
                             X10_TEMP228,
                             X10_TEMP240,
                             X10_TEMP248,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259,
                             X10_TEMP260,
                             X10_TEMP261));
                        
//#line 953
final Particle X10_TEMP264 =
                          (X10_TEMP1208);
                        
//#line 954
final Particle X10_TEMP1211 =
                          (X10_TEMP264);
                        
//#line 956
final Particle X10_TEMP265 =
                          (X10_TEMP1211);
                        
//#line 957
final Particle X10_TEMP1215 =
                          (X10_TEMP265);
                        
//#line 959
final Particle X10_TEMP1218 =
                          (X10_TEMP1215);
                        
//#line 960
/* template:array_set { */(X10_TEMP216).set((X10_TEMP1218),ijk)/* } */;
                        
//#line 961
final int X10_TEMP1220 =
                          (1);
                        
//#line 963
final int X10_TEMP266 =
                          (X10_TEMP1220);
                        
//#line 964
final int X10_TEMP1223 =
                          (ijk +
                             X10_TEMP266);
                        
//#line 966
final int X10_TEMP268 =
                          (X10_TEMP1223);
                        
//#line 967
final int X10_TEMP1226 =
                          (X10_TEMP268);
                        
//#line 969
ijk =
                          ((X10_TEMP1226));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var7____ = (__var111__).iterator(); __var7____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var7__ = (x10.
                  lang.
                  point) __var7____.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((__var7__).get(0))/* } */;/* } */
{
                    
//#line 845
final int X10_TEMP1091 =
                      (0);
                    
//#line 847
final int X10_TEMP212 =
                      (X10_TEMP1091);
                    
//#line 848
final int X10_TEMP1094 =
                      (1);
                    
//#line 850
final int X10_TEMP210 =
                      (X10_TEMP1094);
                    
//#line 851
final int X10_TEMP1097 =
                      (mm -
                         X10_TEMP210);
                    
//#line 853
final int X10_TEMP213 =
                      (X10_TEMP1097);
                    
//#line 854
final x10.
                      lang.
                      region X10_TEMP1102 =
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
                              X10_TEMP212,
                              X10_TEMP213))));
                    
//#line 856
final x10.
                      lang.
                      region X10_TEMP215 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1102));
                    
//#line 857
/* template:forloop-mult { */{
                    x10.lang.region __var117__ = (x10.lang.region) X10_TEMP215;
                    if (__var117__.size() > 0 && (__var117__ instanceof x10.array.MultiDimRegion || __var117__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var118__ = __var117__.rank(0).low(), __var119__ = __var117__.rank(0).high(); __var118__ <= __var119__; __var118__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var118__;
                    /* } */
                    /* } */
{
                        
//#line 858
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1106 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 860
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP216 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1106));
                        
//#line 861
final double X10_TEMP1109 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 863
final double X10_TEMP218 =
                          (X10_TEMP1109);
                        
//#line 864
final double X10_TEMP1112 =
                          (i *
                             X10_TEMP218);
                        
//#line 866
final double X10_TEMP225 =
                          (X10_TEMP1112);
                        
//#line 867
final int X10_TEMP1115 =
                          (2);
                        
//#line 869
final int X10_TEMP219 =
                          (X10_TEMP1115);
                        
//#line 870
final int X10_TEMP1118 =
                          (X10_TEMP219 -
                             lg);
                        
//#line 872
final int X10_TEMP221 =
                          (X10_TEMP1118);
                        
//#line 873
final double X10_TEMP1121 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 875
final double X10_TEMP222 =
                          (X10_TEMP1121);
                        
//#line 876
final double X10_TEMP1124 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 878
final double X10_TEMP223 =
                          (X10_TEMP1124);
                        
//#line 879
final double X10_TEMP1127 =
                          (0.5);
                        
//#line 881
final double X10_TEMP224 =
                          (X10_TEMP1127);
                        
//#line 882
final double X10_TEMP1130 =
                          (X10_TEMP223 *
                             X10_TEMP224);
                        
//#line 884
final double X10_TEMP226 =
                          (X10_TEMP1130);
                        
//#line 885
final double X10_TEMP1133 =
                          (X10_TEMP225 +
                             X10_TEMP226);
                        
//#line 887
final double X10_TEMP228 =
                          (X10_TEMP1133);
                        
//#line 888
final double X10_TEMP1136 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 890
final double X10_TEMP230 =
                          (X10_TEMP1136);
                        
//#line 891
final double X10_TEMP1139 =
                          (j *
                             X10_TEMP230);
                        
//#line 893
final double X10_TEMP237 =
                          (X10_TEMP1139);
                        
//#line 894
final int X10_TEMP1142 =
                          (1);
                        
//#line 896
final int X10_TEMP231 =
                          (X10_TEMP1142);
                        
//#line 897
final int X10_TEMP1145 =
                          (lg -
                             X10_TEMP231);
                        
//#line 899
final int X10_TEMP233 =
                          (X10_TEMP1145);
                        
//#line 900
final double X10_TEMP1148 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 902
final double X10_TEMP234 =
                          (X10_TEMP1148);
                        
//#line 903
final double X10_TEMP1151 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 905
final double X10_TEMP235 =
                          (X10_TEMP1151);
                        
//#line 906
final double X10_TEMP1154 =
                          (0.5);
                        
//#line 908
final double X10_TEMP236 =
                          (X10_TEMP1154);
                        
//#line 909
final double X10_TEMP1157 =
                          (X10_TEMP235 *
                             X10_TEMP236);
                        
//#line 911
final double X10_TEMP238 =
                          (X10_TEMP1157);
                        
//#line 912
final double X10_TEMP1160 =
                          (X10_TEMP237 +
                             X10_TEMP238);
                        
//#line 914
final double X10_TEMP240 =
                          (X10_TEMP1160);
                        
//#line 915
final double X10_TEMP1163 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 917
final double X10_TEMP242 =
                          (X10_TEMP1163);
                        
//#line 918
final double X10_TEMP1166 =
                          (k *
                             X10_TEMP242);
                        
//#line 920
final double X10_TEMP245 =
                          (X10_TEMP1166);
                        
//#line 921
final double X10_TEMP1169 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 923
final double X10_TEMP243 =
                          (X10_TEMP1169);
                        
//#line 924
final double X10_TEMP1172 =
                          (0.5);
                        
//#line 926
final double X10_TEMP244 =
                          (X10_TEMP1172);
                        
//#line 927
final double X10_TEMP1175 =
                          (X10_TEMP243 *
                             X10_TEMP244);
                        
//#line 929
final double X10_TEMP246 =
                          (X10_TEMP1175);
                        
//#line 930
final double X10_TEMP1178 =
                          (X10_TEMP245 +
                             X10_TEMP246);
                        
//#line 932
final double X10_TEMP248 =
                          (X10_TEMP1178);
                        
//#line 933
final double X10_TEMP1181 =
                          (0.0);
                        
//#line 935
double X10_TEMP256 =
                          (X10_TEMP1181);
                        
//#line 936
final double X10_TEMP1184 =
                          (0.0);
                        
//#line 938
double X10_TEMP257 =
                          (X10_TEMP1184);
                        
//#line 939
final double X10_TEMP1187 =
                          (0.0);
                        
//#line 941
double X10_TEMP258 =
                          (X10_TEMP1187);
                        
//#line 942
final double X10_TEMP1190 =
                          (0.0);
                        
//#line 944
double X10_TEMP259 =
                          (X10_TEMP1190);
                        
//#line 945
final double X10_TEMP1193 =
                          (0.0);
                        
//#line 947
double X10_TEMP260 =
                          (X10_TEMP1193);
                        
//#line 948
final double X10_TEMP1196 =
                          (0.0);
                        
//#line 950
double X10_TEMP261 =
                          (X10_TEMP1196);
                        
//#line 951
final Particle X10_TEMP1208 =
                          (new Particle(
                             X10_TEMP228,
                             X10_TEMP240,
                             X10_TEMP248,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259,
                             X10_TEMP260,
                             X10_TEMP261));
                        
//#line 953
final Particle X10_TEMP264 =
                          (X10_TEMP1208);
                        
//#line 954
final Particle X10_TEMP1211 =
                          (X10_TEMP264);
                        
//#line 956
final Particle X10_TEMP265 =
                          (X10_TEMP1211);
                        
//#line 957
final Particle X10_TEMP1215 =
                          (X10_TEMP265);
                        
//#line 959
final Particle X10_TEMP1218 =
                          (X10_TEMP1215);
                        
//#line 960
/* template:array_set { */(X10_TEMP216).set((X10_TEMP1218),ijk)/* } */;
                        
//#line 961
final int X10_TEMP1220 =
                          (1);
                        
//#line 963
final int X10_TEMP266 =
                          (X10_TEMP1220);
                        
//#line 964
final int X10_TEMP1223 =
                          (ijk +
                             X10_TEMP266);
                        
//#line 966
final int X10_TEMP268 =
                          (X10_TEMP1223);
                        
//#line 967
final int X10_TEMP1226 =
                          (X10_TEMP268);
                        
//#line 969
ijk =
                          ((X10_TEMP1226));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var8____ = (__var117__).iterator(); __var8____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var8__ = (x10.
                      lang.
                      point) __var8____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                        
//#line 858
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1106 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 860
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP216 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1106));
                        
//#line 861
final double X10_TEMP1109 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 863
final double X10_TEMP218 =
                          (X10_TEMP1109);
                        
//#line 864
final double X10_TEMP1112 =
                          (i *
                             X10_TEMP218);
                        
//#line 866
final double X10_TEMP225 =
                          (X10_TEMP1112);
                        
//#line 867
final int X10_TEMP1115 =
                          (2);
                        
//#line 869
final int X10_TEMP219 =
                          (X10_TEMP1115);
                        
//#line 870
final int X10_TEMP1118 =
                          (X10_TEMP219 -
                             lg);
                        
//#line 872
final int X10_TEMP221 =
                          (X10_TEMP1118);
                        
//#line 873
final double X10_TEMP1121 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 875
final double X10_TEMP222 =
                          (X10_TEMP1121);
                        
//#line 876
final double X10_TEMP1124 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 878
final double X10_TEMP223 =
                          (X10_TEMP1124);
                        
//#line 879
final double X10_TEMP1127 =
                          (0.5);
                        
//#line 881
final double X10_TEMP224 =
                          (X10_TEMP1127);
                        
//#line 882
final double X10_TEMP1130 =
                          (X10_TEMP223 *
                             X10_TEMP224);
                        
//#line 884
final double X10_TEMP226 =
                          (X10_TEMP1130);
                        
//#line 885
final double X10_TEMP1133 =
                          (X10_TEMP225 +
                             X10_TEMP226);
                        
//#line 887
final double X10_TEMP228 =
                          (X10_TEMP1133);
                        
//#line 888
final double X10_TEMP1136 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 890
final double X10_TEMP230 =
                          (X10_TEMP1136);
                        
//#line 891
final double X10_TEMP1139 =
                          (j *
                             X10_TEMP230);
                        
//#line 893
final double X10_TEMP237 =
                          (X10_TEMP1139);
                        
//#line 894
final int X10_TEMP1142 =
                          (1);
                        
//#line 896
final int X10_TEMP231 =
                          (X10_TEMP1142);
                        
//#line 897
final int X10_TEMP1145 =
                          (lg -
                             X10_TEMP231);
                        
//#line 899
final int X10_TEMP233 =
                          (X10_TEMP1145);
                        
//#line 900
final double X10_TEMP1148 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 902
final double X10_TEMP234 =
                          (X10_TEMP1148);
                        
//#line 903
final double X10_TEMP1151 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 905
final double X10_TEMP235 =
                          (X10_TEMP1151);
                        
//#line 906
final double X10_TEMP1154 =
                          (0.5);
                        
//#line 908
final double X10_TEMP236 =
                          (X10_TEMP1154);
                        
//#line 909
final double X10_TEMP1157 =
                          (X10_TEMP235 *
                             X10_TEMP236);
                        
//#line 911
final double X10_TEMP238 =
                          (X10_TEMP1157);
                        
//#line 912
final double X10_TEMP1160 =
                          (X10_TEMP237 +
                             X10_TEMP238);
                        
//#line 914
final double X10_TEMP240 =
                          (X10_TEMP1160);
                        
//#line 915
final double X10_TEMP1163 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 917
final double X10_TEMP242 =
                          (X10_TEMP1163);
                        
//#line 918
final double X10_TEMP1166 =
                          (k *
                             X10_TEMP242);
                        
//#line 920
final double X10_TEMP245 =
                          (X10_TEMP1166);
                        
//#line 921
final double X10_TEMP1169 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 923
final double X10_TEMP243 =
                          (X10_TEMP1169);
                        
//#line 924
final double X10_TEMP1172 =
                          (0.5);
                        
//#line 926
final double X10_TEMP244 =
                          (X10_TEMP1172);
                        
//#line 927
final double X10_TEMP1175 =
                          (X10_TEMP243 *
                             X10_TEMP244);
                        
//#line 929
final double X10_TEMP246 =
                          (X10_TEMP1175);
                        
//#line 930
final double X10_TEMP1178 =
                          (X10_TEMP245 +
                             X10_TEMP246);
                        
//#line 932
final double X10_TEMP248 =
                          (X10_TEMP1178);
                        
//#line 933
final double X10_TEMP1181 =
                          (0.0);
                        
//#line 935
double X10_TEMP256 =
                          (X10_TEMP1181);
                        
//#line 936
final double X10_TEMP1184 =
                          (0.0);
                        
//#line 938
double X10_TEMP257 =
                          (X10_TEMP1184);
                        
//#line 939
final double X10_TEMP1187 =
                          (0.0);
                        
//#line 941
double X10_TEMP258 =
                          (X10_TEMP1187);
                        
//#line 942
final double X10_TEMP1190 =
                          (0.0);
                        
//#line 944
double X10_TEMP259 =
                          (X10_TEMP1190);
                        
//#line 945
final double X10_TEMP1193 =
                          (0.0);
                        
//#line 947
double X10_TEMP260 =
                          (X10_TEMP1193);
                        
//#line 948
final double X10_TEMP1196 =
                          (0.0);
                        
//#line 950
double X10_TEMP261 =
                          (X10_TEMP1196);
                        
//#line 951
final Particle X10_TEMP1208 =
                          (new Particle(
                             X10_TEMP228,
                             X10_TEMP240,
                             X10_TEMP248,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259,
                             X10_TEMP260,
                             X10_TEMP261));
                        
//#line 953
final Particle X10_TEMP264 =
                          (X10_TEMP1208);
                        
//#line 954
final Particle X10_TEMP1211 =
                          (X10_TEMP264);
                        
//#line 956
final Particle X10_TEMP265 =
                          (X10_TEMP1211);
                        
//#line 957
final Particle X10_TEMP1215 =
                          (X10_TEMP265);
                        
//#line 959
final Particle X10_TEMP1218 =
                          (X10_TEMP1215);
                        
//#line 960
/* template:array_set { */(X10_TEMP216).set((X10_TEMP1218),ijk)/* } */;
                        
//#line 961
final int X10_TEMP1220 =
                          (1);
                        
//#line 963
final int X10_TEMP266 =
                          (X10_TEMP1220);
                        
//#line 964
final int X10_TEMP1223 =
                          (ijk +
                             X10_TEMP266);
                        
//#line 966
final int X10_TEMP268 =
                          (X10_TEMP1223);
                        
//#line 967
final int X10_TEMP1226 =
                          (X10_TEMP268);
                        
//#line 969
ijk =
                          ((X10_TEMP1226));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var6____ = (__var108__).iterator(); __var6____.hasNext(); ) {
            	final  x10.
              lang.
              point __var6__ = (x10.
              lang.
              point) __var6____.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var6__).get(0))/* } */;/* } */
{
                
//#line 832
final int X10_TEMP1076 =
                  (0);
                
//#line 834
final int X10_TEMP205 =
                  (X10_TEMP1076);
                
//#line 835
final int X10_TEMP1079 =
                  (1);
                
//#line 837
final int X10_TEMP203 =
                  (X10_TEMP1079);
                
//#line 838
final int X10_TEMP1082 =
                  (mm -
                     X10_TEMP203);
                
//#line 840
final int X10_TEMP206 =
                  (X10_TEMP1082);
                
//#line 841
final x10.
                  lang.
                  region X10_TEMP1087 =
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
                          X10_TEMP205,
                          X10_TEMP206))));
                
//#line 843
final x10.
                  lang.
                  region X10_TEMP208 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP1087));
                
//#line 844
/* template:forloop-mult { */{
                x10.lang.region __var120__ = (x10.lang.region) X10_TEMP208;
                if (__var120__.size() > 0 && (__var120__ instanceof x10.array.MultiDimRegion || __var120__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var121__ = __var120__.rank(0).low(), __var122__ = __var120__.rank(0).high(); __var121__ <= __var122__; __var121__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var121__;
                /* } */
                /* } */
{
                    
//#line 845
final int X10_TEMP1091 =
                      (0);
                    
//#line 847
final int X10_TEMP212 =
                      (X10_TEMP1091);
                    
//#line 848
final int X10_TEMP1094 =
                      (1);
                    
//#line 850
final int X10_TEMP210 =
                      (X10_TEMP1094);
                    
//#line 851
final int X10_TEMP1097 =
                      (mm -
                         X10_TEMP210);
                    
//#line 853
final int X10_TEMP213 =
                      (X10_TEMP1097);
                    
//#line 854
final x10.
                      lang.
                      region X10_TEMP1102 =
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
                              X10_TEMP212,
                              X10_TEMP213))));
                    
//#line 856
final x10.
                      lang.
                      region X10_TEMP215 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1102));
                    
//#line 857
/* template:forloop-mult { */{
                    x10.lang.region __var123__ = (x10.lang.region) X10_TEMP215;
                    if (__var123__.size() > 0 && (__var123__ instanceof x10.array.MultiDimRegion || __var123__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var124__ = __var123__.rank(0).low(), __var125__ = __var123__.rank(0).high(); __var124__ <= __var125__; __var124__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var124__;
                    /* } */
                    /* } */
{
                        
//#line 858
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1106 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 860
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP216 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1106));
                        
//#line 861
final double X10_TEMP1109 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 863
final double X10_TEMP218 =
                          (X10_TEMP1109);
                        
//#line 864
final double X10_TEMP1112 =
                          (i *
                             X10_TEMP218);
                        
//#line 866
final double X10_TEMP225 =
                          (X10_TEMP1112);
                        
//#line 867
final int X10_TEMP1115 =
                          (2);
                        
//#line 869
final int X10_TEMP219 =
                          (X10_TEMP1115);
                        
//#line 870
final int X10_TEMP1118 =
                          (X10_TEMP219 -
                             lg);
                        
//#line 872
final int X10_TEMP221 =
                          (X10_TEMP1118);
                        
//#line 873
final double X10_TEMP1121 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 875
final double X10_TEMP222 =
                          (X10_TEMP1121);
                        
//#line 876
final double X10_TEMP1124 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 878
final double X10_TEMP223 =
                          (X10_TEMP1124);
                        
//#line 879
final double X10_TEMP1127 =
                          (0.5);
                        
//#line 881
final double X10_TEMP224 =
                          (X10_TEMP1127);
                        
//#line 882
final double X10_TEMP1130 =
                          (X10_TEMP223 *
                             X10_TEMP224);
                        
//#line 884
final double X10_TEMP226 =
                          (X10_TEMP1130);
                        
//#line 885
final double X10_TEMP1133 =
                          (X10_TEMP225 +
                             X10_TEMP226);
                        
//#line 887
final double X10_TEMP228 =
                          (X10_TEMP1133);
                        
//#line 888
final double X10_TEMP1136 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 890
final double X10_TEMP230 =
                          (X10_TEMP1136);
                        
//#line 891
final double X10_TEMP1139 =
                          (j *
                             X10_TEMP230);
                        
//#line 893
final double X10_TEMP237 =
                          (X10_TEMP1139);
                        
//#line 894
final int X10_TEMP1142 =
                          (1);
                        
//#line 896
final int X10_TEMP231 =
                          (X10_TEMP1142);
                        
//#line 897
final int X10_TEMP1145 =
                          (lg -
                             X10_TEMP231);
                        
//#line 899
final int X10_TEMP233 =
                          (X10_TEMP1145);
                        
//#line 900
final double X10_TEMP1148 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 902
final double X10_TEMP234 =
                          (X10_TEMP1148);
                        
//#line 903
final double X10_TEMP1151 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 905
final double X10_TEMP235 =
                          (X10_TEMP1151);
                        
//#line 906
final double X10_TEMP1154 =
                          (0.5);
                        
//#line 908
final double X10_TEMP236 =
                          (X10_TEMP1154);
                        
//#line 909
final double X10_TEMP1157 =
                          (X10_TEMP235 *
                             X10_TEMP236);
                        
//#line 911
final double X10_TEMP238 =
                          (X10_TEMP1157);
                        
//#line 912
final double X10_TEMP1160 =
                          (X10_TEMP237 +
                             X10_TEMP238);
                        
//#line 914
final double X10_TEMP240 =
                          (X10_TEMP1160);
                        
//#line 915
final double X10_TEMP1163 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 917
final double X10_TEMP242 =
                          (X10_TEMP1163);
                        
//#line 918
final double X10_TEMP1166 =
                          (k *
                             X10_TEMP242);
                        
//#line 920
final double X10_TEMP245 =
                          (X10_TEMP1166);
                        
//#line 921
final double X10_TEMP1169 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 923
final double X10_TEMP243 =
                          (X10_TEMP1169);
                        
//#line 924
final double X10_TEMP1172 =
                          (0.5);
                        
//#line 926
final double X10_TEMP244 =
                          (X10_TEMP1172);
                        
//#line 927
final double X10_TEMP1175 =
                          (X10_TEMP243 *
                             X10_TEMP244);
                        
//#line 929
final double X10_TEMP246 =
                          (X10_TEMP1175);
                        
//#line 930
final double X10_TEMP1178 =
                          (X10_TEMP245 +
                             X10_TEMP246);
                        
//#line 932
final double X10_TEMP248 =
                          (X10_TEMP1178);
                        
//#line 933
final double X10_TEMP1181 =
                          (0.0);
                        
//#line 935
double X10_TEMP256 =
                          (X10_TEMP1181);
                        
//#line 936
final double X10_TEMP1184 =
                          (0.0);
                        
//#line 938
double X10_TEMP257 =
                          (X10_TEMP1184);
                        
//#line 939
final double X10_TEMP1187 =
                          (0.0);
                        
//#line 941
double X10_TEMP258 =
                          (X10_TEMP1187);
                        
//#line 942
final double X10_TEMP1190 =
                          (0.0);
                        
//#line 944
double X10_TEMP259 =
                          (X10_TEMP1190);
                        
//#line 945
final double X10_TEMP1193 =
                          (0.0);
                        
//#line 947
double X10_TEMP260 =
                          (X10_TEMP1193);
                        
//#line 948
final double X10_TEMP1196 =
                          (0.0);
                        
//#line 950
double X10_TEMP261 =
                          (X10_TEMP1196);
                        
//#line 951
final Particle X10_TEMP1208 =
                          (new Particle(
                             X10_TEMP228,
                             X10_TEMP240,
                             X10_TEMP248,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259,
                             X10_TEMP260,
                             X10_TEMP261));
                        
//#line 953
final Particle X10_TEMP264 =
                          (X10_TEMP1208);
                        
//#line 954
final Particle X10_TEMP1211 =
                          (X10_TEMP264);
                        
//#line 956
final Particle X10_TEMP265 =
                          (X10_TEMP1211);
                        
//#line 957
final Particle X10_TEMP1215 =
                          (X10_TEMP265);
                        
//#line 959
final Particle X10_TEMP1218 =
                          (X10_TEMP1215);
                        
//#line 960
/* template:array_set { */(X10_TEMP216).set((X10_TEMP1218),ijk)/* } */;
                        
//#line 961
final int X10_TEMP1220 =
                          (1);
                        
//#line 963
final int X10_TEMP266 =
                          (X10_TEMP1220);
                        
//#line 964
final int X10_TEMP1223 =
                          (ijk +
                             X10_TEMP266);
                        
//#line 966
final int X10_TEMP268 =
                          (X10_TEMP1223);
                        
//#line 967
final int X10_TEMP1226 =
                          (X10_TEMP268);
                        
//#line 969
ijk =
                          ((X10_TEMP1226));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var8____ = (__var123__).iterator(); __var8____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var8__ = (x10.
                      lang.
                      point) __var8____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                        
//#line 858
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1106 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 860
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP216 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1106));
                        
//#line 861
final double X10_TEMP1109 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 863
final double X10_TEMP218 =
                          (X10_TEMP1109);
                        
//#line 864
final double X10_TEMP1112 =
                          (i *
                             X10_TEMP218);
                        
//#line 866
final double X10_TEMP225 =
                          (X10_TEMP1112);
                        
//#line 867
final int X10_TEMP1115 =
                          (2);
                        
//#line 869
final int X10_TEMP219 =
                          (X10_TEMP1115);
                        
//#line 870
final int X10_TEMP1118 =
                          (X10_TEMP219 -
                             lg);
                        
//#line 872
final int X10_TEMP221 =
                          (X10_TEMP1118);
                        
//#line 873
final double X10_TEMP1121 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 875
final double X10_TEMP222 =
                          (X10_TEMP1121);
                        
//#line 876
final double X10_TEMP1124 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 878
final double X10_TEMP223 =
                          (X10_TEMP1124);
                        
//#line 879
final double X10_TEMP1127 =
                          (0.5);
                        
//#line 881
final double X10_TEMP224 =
                          (X10_TEMP1127);
                        
//#line 882
final double X10_TEMP1130 =
                          (X10_TEMP223 *
                             X10_TEMP224);
                        
//#line 884
final double X10_TEMP226 =
                          (X10_TEMP1130);
                        
//#line 885
final double X10_TEMP1133 =
                          (X10_TEMP225 +
                             X10_TEMP226);
                        
//#line 887
final double X10_TEMP228 =
                          (X10_TEMP1133);
                        
//#line 888
final double X10_TEMP1136 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 890
final double X10_TEMP230 =
                          (X10_TEMP1136);
                        
//#line 891
final double X10_TEMP1139 =
                          (j *
                             X10_TEMP230);
                        
//#line 893
final double X10_TEMP237 =
                          (X10_TEMP1139);
                        
//#line 894
final int X10_TEMP1142 =
                          (1);
                        
//#line 896
final int X10_TEMP231 =
                          (X10_TEMP1142);
                        
//#line 897
final int X10_TEMP1145 =
                          (lg -
                             X10_TEMP231);
                        
//#line 899
final int X10_TEMP233 =
                          (X10_TEMP1145);
                        
//#line 900
final double X10_TEMP1148 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 902
final double X10_TEMP234 =
                          (X10_TEMP1148);
                        
//#line 903
final double X10_TEMP1151 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 905
final double X10_TEMP235 =
                          (X10_TEMP1151);
                        
//#line 906
final double X10_TEMP1154 =
                          (0.5);
                        
//#line 908
final double X10_TEMP236 =
                          (X10_TEMP1154);
                        
//#line 909
final double X10_TEMP1157 =
                          (X10_TEMP235 *
                             X10_TEMP236);
                        
//#line 911
final double X10_TEMP238 =
                          (X10_TEMP1157);
                        
//#line 912
final double X10_TEMP1160 =
                          (X10_TEMP237 +
                             X10_TEMP238);
                        
//#line 914
final double X10_TEMP240 =
                          (X10_TEMP1160);
                        
//#line 915
final double X10_TEMP1163 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 917
final double X10_TEMP242 =
                          (X10_TEMP1163);
                        
//#line 918
final double X10_TEMP1166 =
                          (k *
                             X10_TEMP242);
                        
//#line 920
final double X10_TEMP245 =
                          (X10_TEMP1166);
                        
//#line 921
final double X10_TEMP1169 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 923
final double X10_TEMP243 =
                          (X10_TEMP1169);
                        
//#line 924
final double X10_TEMP1172 =
                          (0.5);
                        
//#line 926
final double X10_TEMP244 =
                          (X10_TEMP1172);
                        
//#line 927
final double X10_TEMP1175 =
                          (X10_TEMP243 *
                             X10_TEMP244);
                        
//#line 929
final double X10_TEMP246 =
                          (X10_TEMP1175);
                        
//#line 930
final double X10_TEMP1178 =
                          (X10_TEMP245 +
                             X10_TEMP246);
                        
//#line 932
final double X10_TEMP248 =
                          (X10_TEMP1178);
                        
//#line 933
final double X10_TEMP1181 =
                          (0.0);
                        
//#line 935
double X10_TEMP256 =
                          (X10_TEMP1181);
                        
//#line 936
final double X10_TEMP1184 =
                          (0.0);
                        
//#line 938
double X10_TEMP257 =
                          (X10_TEMP1184);
                        
//#line 939
final double X10_TEMP1187 =
                          (0.0);
                        
//#line 941
double X10_TEMP258 =
                          (X10_TEMP1187);
                        
//#line 942
final double X10_TEMP1190 =
                          (0.0);
                        
//#line 944
double X10_TEMP259 =
                          (X10_TEMP1190);
                        
//#line 945
final double X10_TEMP1193 =
                          (0.0);
                        
//#line 947
double X10_TEMP260 =
                          (X10_TEMP1193);
                        
//#line 948
final double X10_TEMP1196 =
                          (0.0);
                        
//#line 950
double X10_TEMP261 =
                          (X10_TEMP1196);
                        
//#line 951
final Particle X10_TEMP1208 =
                          (new Particle(
                             X10_TEMP228,
                             X10_TEMP240,
                             X10_TEMP248,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259,
                             X10_TEMP260,
                             X10_TEMP261));
                        
//#line 953
final Particle X10_TEMP264 =
                          (X10_TEMP1208);
                        
//#line 954
final Particle X10_TEMP1211 =
                          (X10_TEMP264);
                        
//#line 956
final Particle X10_TEMP265 =
                          (X10_TEMP1211);
                        
//#line 957
final Particle X10_TEMP1215 =
                          (X10_TEMP265);
                        
//#line 959
final Particle X10_TEMP1218 =
                          (X10_TEMP1215);
                        
//#line 960
/* template:array_set { */(X10_TEMP216).set((X10_TEMP1218),ijk)/* } */;
                        
//#line 961
final int X10_TEMP1220 =
                          (1);
                        
//#line 963
final int X10_TEMP266 =
                          (X10_TEMP1220);
                        
//#line 964
final int X10_TEMP1223 =
                          (ijk +
                             X10_TEMP266);
                        
//#line 966
final int X10_TEMP268 =
                          (X10_TEMP1223);
                        
//#line 967
final int X10_TEMP1226 =
                          (X10_TEMP268);
                        
//#line 969
ijk =
                          ((X10_TEMP1226));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var7____ = (__var120__).iterator(); __var7____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var7__ = (x10.
                  lang.
                  point) __var7____.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((__var7__).get(0))/* } */;/* } */
{
                    
//#line 845
final int X10_TEMP1091 =
                      (0);
                    
//#line 847
final int X10_TEMP212 =
                      (X10_TEMP1091);
                    
//#line 848
final int X10_TEMP1094 =
                      (1);
                    
//#line 850
final int X10_TEMP210 =
                      (X10_TEMP1094);
                    
//#line 851
final int X10_TEMP1097 =
                      (mm -
                         X10_TEMP210);
                    
//#line 853
final int X10_TEMP213 =
                      (X10_TEMP1097);
                    
//#line 854
final x10.
                      lang.
                      region X10_TEMP1102 =
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
                              X10_TEMP212,
                              X10_TEMP213))));
                    
//#line 856
final x10.
                      lang.
                      region X10_TEMP215 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1102));
                    
//#line 857
/* template:forloop-mult { */{
                    x10.lang.region __var126__ = (x10.lang.region) X10_TEMP215;
                    if (__var126__.size() > 0 && (__var126__ instanceof x10.array.MultiDimRegion || __var126__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var127__ = __var126__.rank(0).low(), __var128__ = __var126__.rank(0).high(); __var127__ <= __var128__; __var127__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var127__;
                    /* } */
                    /* } */
{
                        
//#line 858
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1106 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 860
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP216 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1106));
                        
//#line 861
final double X10_TEMP1109 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 863
final double X10_TEMP218 =
                          (X10_TEMP1109);
                        
//#line 864
final double X10_TEMP1112 =
                          (i *
                             X10_TEMP218);
                        
//#line 866
final double X10_TEMP225 =
                          (X10_TEMP1112);
                        
//#line 867
final int X10_TEMP1115 =
                          (2);
                        
//#line 869
final int X10_TEMP219 =
                          (X10_TEMP1115);
                        
//#line 870
final int X10_TEMP1118 =
                          (X10_TEMP219 -
                             lg);
                        
//#line 872
final int X10_TEMP221 =
                          (X10_TEMP1118);
                        
//#line 873
final double X10_TEMP1121 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 875
final double X10_TEMP222 =
                          (X10_TEMP1121);
                        
//#line 876
final double X10_TEMP1124 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 878
final double X10_TEMP223 =
                          (X10_TEMP1124);
                        
//#line 879
final double X10_TEMP1127 =
                          (0.5);
                        
//#line 881
final double X10_TEMP224 =
                          (X10_TEMP1127);
                        
//#line 882
final double X10_TEMP1130 =
                          (X10_TEMP223 *
                             X10_TEMP224);
                        
//#line 884
final double X10_TEMP226 =
                          (X10_TEMP1130);
                        
//#line 885
final double X10_TEMP1133 =
                          (X10_TEMP225 +
                             X10_TEMP226);
                        
//#line 887
final double X10_TEMP228 =
                          (X10_TEMP1133);
                        
//#line 888
final double X10_TEMP1136 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 890
final double X10_TEMP230 =
                          (X10_TEMP1136);
                        
//#line 891
final double X10_TEMP1139 =
                          (j *
                             X10_TEMP230);
                        
//#line 893
final double X10_TEMP237 =
                          (X10_TEMP1139);
                        
//#line 894
final int X10_TEMP1142 =
                          (1);
                        
//#line 896
final int X10_TEMP231 =
                          (X10_TEMP1142);
                        
//#line 897
final int X10_TEMP1145 =
                          (lg -
                             X10_TEMP231);
                        
//#line 899
final int X10_TEMP233 =
                          (X10_TEMP1145);
                        
//#line 900
final double X10_TEMP1148 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 902
final double X10_TEMP234 =
                          (X10_TEMP1148);
                        
//#line 903
final double X10_TEMP1151 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 905
final double X10_TEMP235 =
                          (X10_TEMP1151);
                        
//#line 906
final double X10_TEMP1154 =
                          (0.5);
                        
//#line 908
final double X10_TEMP236 =
                          (X10_TEMP1154);
                        
//#line 909
final double X10_TEMP1157 =
                          (X10_TEMP235 *
                             X10_TEMP236);
                        
//#line 911
final double X10_TEMP238 =
                          (X10_TEMP1157);
                        
//#line 912
final double X10_TEMP1160 =
                          (X10_TEMP237 +
                             X10_TEMP238);
                        
//#line 914
final double X10_TEMP240 =
                          (X10_TEMP1160);
                        
//#line 915
final double X10_TEMP1163 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 917
final double X10_TEMP242 =
                          (X10_TEMP1163);
                        
//#line 918
final double X10_TEMP1166 =
                          (k *
                             X10_TEMP242);
                        
//#line 920
final double X10_TEMP245 =
                          (X10_TEMP1166);
                        
//#line 921
final double X10_TEMP1169 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 923
final double X10_TEMP243 =
                          (X10_TEMP1169);
                        
//#line 924
final double X10_TEMP1172 =
                          (0.5);
                        
//#line 926
final double X10_TEMP244 =
                          (X10_TEMP1172);
                        
//#line 927
final double X10_TEMP1175 =
                          (X10_TEMP243 *
                             X10_TEMP244);
                        
//#line 929
final double X10_TEMP246 =
                          (X10_TEMP1175);
                        
//#line 930
final double X10_TEMP1178 =
                          (X10_TEMP245 +
                             X10_TEMP246);
                        
//#line 932
final double X10_TEMP248 =
                          (X10_TEMP1178);
                        
//#line 933
final double X10_TEMP1181 =
                          (0.0);
                        
//#line 935
double X10_TEMP256 =
                          (X10_TEMP1181);
                        
//#line 936
final double X10_TEMP1184 =
                          (0.0);
                        
//#line 938
double X10_TEMP257 =
                          (X10_TEMP1184);
                        
//#line 939
final double X10_TEMP1187 =
                          (0.0);
                        
//#line 941
double X10_TEMP258 =
                          (X10_TEMP1187);
                        
//#line 942
final double X10_TEMP1190 =
                          (0.0);
                        
//#line 944
double X10_TEMP259 =
                          (X10_TEMP1190);
                        
//#line 945
final double X10_TEMP1193 =
                          (0.0);
                        
//#line 947
double X10_TEMP260 =
                          (X10_TEMP1193);
                        
//#line 948
final double X10_TEMP1196 =
                          (0.0);
                        
//#line 950
double X10_TEMP261 =
                          (X10_TEMP1196);
                        
//#line 951
final Particle X10_TEMP1208 =
                          (new Particle(
                             X10_TEMP228,
                             X10_TEMP240,
                             X10_TEMP248,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259,
                             X10_TEMP260,
                             X10_TEMP261));
                        
//#line 953
final Particle X10_TEMP264 =
                          (X10_TEMP1208);
                        
//#line 954
final Particle X10_TEMP1211 =
                          (X10_TEMP264);
                        
//#line 956
final Particle X10_TEMP265 =
                          (X10_TEMP1211);
                        
//#line 957
final Particle X10_TEMP1215 =
                          (X10_TEMP265);
                        
//#line 959
final Particle X10_TEMP1218 =
                          (X10_TEMP1215);
                        
//#line 960
/* template:array_set { */(X10_TEMP216).set((X10_TEMP1218),ijk)/* } */;
                        
//#line 961
final int X10_TEMP1220 =
                          (1);
                        
//#line 963
final int X10_TEMP266 =
                          (X10_TEMP1220);
                        
//#line 964
final int X10_TEMP1223 =
                          (ijk +
                             X10_TEMP266);
                        
//#line 966
final int X10_TEMP268 =
                          (X10_TEMP1223);
                        
//#line 967
final int X10_TEMP1226 =
                          (X10_TEMP268);
                        
//#line 969
ijk =
                          ((X10_TEMP1226));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var8____ = (__var126__).iterator(); __var8____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var8__ = (x10.
                      lang.
                      point) __var8____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                        
//#line 858
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1106 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 860
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP216 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1106));
                        
//#line 861
final double X10_TEMP1109 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 863
final double X10_TEMP218 =
                          (X10_TEMP1109);
                        
//#line 864
final double X10_TEMP1112 =
                          (i *
                             X10_TEMP218);
                        
//#line 866
final double X10_TEMP225 =
                          (X10_TEMP1112);
                        
//#line 867
final int X10_TEMP1115 =
                          (2);
                        
//#line 869
final int X10_TEMP219 =
                          (X10_TEMP1115);
                        
//#line 870
final int X10_TEMP1118 =
                          (X10_TEMP219 -
                             lg);
                        
//#line 872
final int X10_TEMP221 =
                          (X10_TEMP1118);
                        
//#line 873
final double X10_TEMP1121 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 875
final double X10_TEMP222 =
                          (X10_TEMP1121);
                        
//#line 876
final double X10_TEMP1124 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 878
final double X10_TEMP223 =
                          (X10_TEMP1124);
                        
//#line 879
final double X10_TEMP1127 =
                          (0.5);
                        
//#line 881
final double X10_TEMP224 =
                          (X10_TEMP1127);
                        
//#line 882
final double X10_TEMP1130 =
                          (X10_TEMP223 *
                             X10_TEMP224);
                        
//#line 884
final double X10_TEMP226 =
                          (X10_TEMP1130);
                        
//#line 885
final double X10_TEMP1133 =
                          (X10_TEMP225 +
                             X10_TEMP226);
                        
//#line 887
final double X10_TEMP228 =
                          (X10_TEMP1133);
                        
//#line 888
final double X10_TEMP1136 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 890
final double X10_TEMP230 =
                          (X10_TEMP1136);
                        
//#line 891
final double X10_TEMP1139 =
                          (j *
                             X10_TEMP230);
                        
//#line 893
final double X10_TEMP237 =
                          (X10_TEMP1139);
                        
//#line 894
final int X10_TEMP1142 =
                          (1);
                        
//#line 896
final int X10_TEMP231 =
                          (X10_TEMP1142);
                        
//#line 897
final int X10_TEMP1145 =
                          (lg -
                             X10_TEMP231);
                        
//#line 899
final int X10_TEMP233 =
                          (X10_TEMP1145);
                        
//#line 900
final double X10_TEMP1148 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 902
final double X10_TEMP234 =
                          (X10_TEMP1148);
                        
//#line 903
final double X10_TEMP1151 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 905
final double X10_TEMP235 =
                          (X10_TEMP1151);
                        
//#line 906
final double X10_TEMP1154 =
                          (0.5);
                        
//#line 908
final double X10_TEMP236 =
                          (X10_TEMP1154);
                        
//#line 909
final double X10_TEMP1157 =
                          (X10_TEMP235 *
                             X10_TEMP236);
                        
//#line 911
final double X10_TEMP238 =
                          (X10_TEMP1157);
                        
//#line 912
final double X10_TEMP1160 =
                          (X10_TEMP237 +
                             X10_TEMP238);
                        
//#line 914
final double X10_TEMP240 =
                          (X10_TEMP1160);
                        
//#line 915
final double X10_TEMP1163 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 917
final double X10_TEMP242 =
                          (X10_TEMP1163);
                        
//#line 918
final double X10_TEMP1166 =
                          (k *
                             X10_TEMP242);
                        
//#line 920
final double X10_TEMP245 =
                          (X10_TEMP1166);
                        
//#line 921
final double X10_TEMP1169 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 923
final double X10_TEMP243 =
                          (X10_TEMP1169);
                        
//#line 924
final double X10_TEMP1172 =
                          (0.5);
                        
//#line 926
final double X10_TEMP244 =
                          (X10_TEMP1172);
                        
//#line 927
final double X10_TEMP1175 =
                          (X10_TEMP243 *
                             X10_TEMP244);
                        
//#line 929
final double X10_TEMP246 =
                          (X10_TEMP1175);
                        
//#line 930
final double X10_TEMP1178 =
                          (X10_TEMP245 +
                             X10_TEMP246);
                        
//#line 932
final double X10_TEMP248 =
                          (X10_TEMP1178);
                        
//#line 933
final double X10_TEMP1181 =
                          (0.0);
                        
//#line 935
double X10_TEMP256 =
                          (X10_TEMP1181);
                        
//#line 936
final double X10_TEMP1184 =
                          (0.0);
                        
//#line 938
double X10_TEMP257 =
                          (X10_TEMP1184);
                        
//#line 939
final double X10_TEMP1187 =
                          (0.0);
                        
//#line 941
double X10_TEMP258 =
                          (X10_TEMP1187);
                        
//#line 942
final double X10_TEMP1190 =
                          (0.0);
                        
//#line 944
double X10_TEMP259 =
                          (X10_TEMP1190);
                        
//#line 945
final double X10_TEMP1193 =
                          (0.0);
                        
//#line 947
double X10_TEMP260 =
                          (X10_TEMP1193);
                        
//#line 948
final double X10_TEMP1196 =
                          (0.0);
                        
//#line 950
double X10_TEMP261 =
                          (X10_TEMP1196);
                        
//#line 951
final Particle X10_TEMP1208 =
                          (new Particle(
                             X10_TEMP228,
                             X10_TEMP240,
                             X10_TEMP248,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259,
                             X10_TEMP260,
                             X10_TEMP261));
                        
//#line 953
final Particle X10_TEMP264 =
                          (X10_TEMP1208);
                        
//#line 954
final Particle X10_TEMP1211 =
                          (X10_TEMP264);
                        
//#line 956
final Particle X10_TEMP265 =
                          (X10_TEMP1211);
                        
//#line 957
final Particle X10_TEMP1215 =
                          (X10_TEMP265);
                        
//#line 959
final Particle X10_TEMP1218 =
                          (X10_TEMP1215);
                        
//#line 960
/* template:array_set { */(X10_TEMP216).set((X10_TEMP1218),ijk)/* } */;
                        
//#line 961
final int X10_TEMP1220 =
                          (1);
                        
//#line 963
final int X10_TEMP266 =
                          (X10_TEMP1220);
                        
//#line 964
final int X10_TEMP1223 =
                          (ijk +
                             X10_TEMP266);
                        
//#line 966
final int X10_TEMP268 =
                          (X10_TEMP1223);
                        
//#line 967
final int X10_TEMP1226 =
                          (X10_TEMP268);
                        
//#line 969
ijk =
                          ((X10_TEMP1226));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var5____ = (__var105__).iterator(); __var5____.hasNext(); ) {
        	final  x10.
          lang.
          point __var5__ = (x10.
          lang.
          point) __var5____.next();
        	/* Join: { *//* Join: { */final int lg =
          /* template:array_get { */((__var5__).get(0))/* } */;/* } */
{
            
//#line 819
final int X10_TEMP1061 =
              (0);
            
//#line 821
final int X10_TEMP198 =
              (X10_TEMP1061);
            
//#line 822
final int X10_TEMP1064 =
              (1);
            
//#line 824
final int X10_TEMP196 =
              (X10_TEMP1064);
            
//#line 825
final int X10_TEMP1067 =
              (mm -
                 X10_TEMP196);
            
//#line 827
final int X10_TEMP199 =
              (X10_TEMP1067);
            
//#line 828
final x10.
              lang.
              region X10_TEMP1072 =
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
                      X10_TEMP198,
                      X10_TEMP199))));
            
//#line 830
final x10.
              lang.
              region X10_TEMP201 =
              (x10.
                lang.
                region)
                ((X10_TEMP1072));
            
//#line 831
/* template:forloop-mult { */{
            x10.lang.region __var129__ = (x10.lang.region) X10_TEMP201;
            if (__var129__.size() > 0 && (__var129__ instanceof x10.array.MultiDimRegion || __var129__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var130__ = __var129__.rank(0).low(), __var131__ = __var129__.rank(0).high(); __var130__ <= __var131__; __var130__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var130__;
            /* } */
            /* } */
{
                
//#line 832
final int X10_TEMP1076 =
                  (0);
                
//#line 834
final int X10_TEMP205 =
                  (X10_TEMP1076);
                
//#line 835
final int X10_TEMP1079 =
                  (1);
                
//#line 837
final int X10_TEMP203 =
                  (X10_TEMP1079);
                
//#line 838
final int X10_TEMP1082 =
                  (mm -
                     X10_TEMP203);
                
//#line 840
final int X10_TEMP206 =
                  (X10_TEMP1082);
                
//#line 841
final x10.
                  lang.
                  region X10_TEMP1087 =
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
                          X10_TEMP205,
                          X10_TEMP206))));
                
//#line 843
final x10.
                  lang.
                  region X10_TEMP208 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP1087));
                
//#line 844
/* template:forloop-mult { */{
                x10.lang.region __var132__ = (x10.lang.region) X10_TEMP208;
                if (__var132__.size() > 0 && (__var132__ instanceof x10.array.MultiDimRegion || __var132__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var133__ = __var132__.rank(0).low(), __var134__ = __var132__.rank(0).high(); __var133__ <= __var134__; __var133__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var133__;
                /* } */
                /* } */
{
                    
//#line 845
final int X10_TEMP1091 =
                      (0);
                    
//#line 847
final int X10_TEMP212 =
                      (X10_TEMP1091);
                    
//#line 848
final int X10_TEMP1094 =
                      (1);
                    
//#line 850
final int X10_TEMP210 =
                      (X10_TEMP1094);
                    
//#line 851
final int X10_TEMP1097 =
                      (mm -
                         X10_TEMP210);
                    
//#line 853
final int X10_TEMP213 =
                      (X10_TEMP1097);
                    
//#line 854
final x10.
                      lang.
                      region X10_TEMP1102 =
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
                              X10_TEMP212,
                              X10_TEMP213))));
                    
//#line 856
final x10.
                      lang.
                      region X10_TEMP215 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1102));
                    
//#line 857
/* template:forloop-mult { */{
                    x10.lang.region __var135__ = (x10.lang.region) X10_TEMP215;
                    if (__var135__.size() > 0 && (__var135__ instanceof x10.array.MultiDimRegion || __var135__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var136__ = __var135__.rank(0).low(), __var137__ = __var135__.rank(0).high(); __var136__ <= __var137__; __var136__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var136__;
                    /* } */
                    /* } */
{
                        
//#line 858
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1106 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 860
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP216 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1106));
                        
//#line 861
final double X10_TEMP1109 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 863
final double X10_TEMP218 =
                          (X10_TEMP1109);
                        
//#line 864
final double X10_TEMP1112 =
                          (i *
                             X10_TEMP218);
                        
//#line 866
final double X10_TEMP225 =
                          (X10_TEMP1112);
                        
//#line 867
final int X10_TEMP1115 =
                          (2);
                        
//#line 869
final int X10_TEMP219 =
                          (X10_TEMP1115);
                        
//#line 870
final int X10_TEMP1118 =
                          (X10_TEMP219 -
                             lg);
                        
//#line 872
final int X10_TEMP221 =
                          (X10_TEMP1118);
                        
//#line 873
final double X10_TEMP1121 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 875
final double X10_TEMP222 =
                          (X10_TEMP1121);
                        
//#line 876
final double X10_TEMP1124 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 878
final double X10_TEMP223 =
                          (X10_TEMP1124);
                        
//#line 879
final double X10_TEMP1127 =
                          (0.5);
                        
//#line 881
final double X10_TEMP224 =
                          (X10_TEMP1127);
                        
//#line 882
final double X10_TEMP1130 =
                          (X10_TEMP223 *
                             X10_TEMP224);
                        
//#line 884
final double X10_TEMP226 =
                          (X10_TEMP1130);
                        
//#line 885
final double X10_TEMP1133 =
                          (X10_TEMP225 +
                             X10_TEMP226);
                        
//#line 887
final double X10_TEMP228 =
                          (X10_TEMP1133);
                        
//#line 888
final double X10_TEMP1136 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 890
final double X10_TEMP230 =
                          (X10_TEMP1136);
                        
//#line 891
final double X10_TEMP1139 =
                          (j *
                             X10_TEMP230);
                        
//#line 893
final double X10_TEMP237 =
                          (X10_TEMP1139);
                        
//#line 894
final int X10_TEMP1142 =
                          (1);
                        
//#line 896
final int X10_TEMP231 =
                          (X10_TEMP1142);
                        
//#line 897
final int X10_TEMP1145 =
                          (lg -
                             X10_TEMP231);
                        
//#line 899
final int X10_TEMP233 =
                          (X10_TEMP1145);
                        
//#line 900
final double X10_TEMP1148 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 902
final double X10_TEMP234 =
                          (X10_TEMP1148);
                        
//#line 903
final double X10_TEMP1151 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 905
final double X10_TEMP235 =
                          (X10_TEMP1151);
                        
//#line 906
final double X10_TEMP1154 =
                          (0.5);
                        
//#line 908
final double X10_TEMP236 =
                          (X10_TEMP1154);
                        
//#line 909
final double X10_TEMP1157 =
                          (X10_TEMP235 *
                             X10_TEMP236);
                        
//#line 911
final double X10_TEMP238 =
                          (X10_TEMP1157);
                        
//#line 912
final double X10_TEMP1160 =
                          (X10_TEMP237 +
                             X10_TEMP238);
                        
//#line 914
final double X10_TEMP240 =
                          (X10_TEMP1160);
                        
//#line 915
final double X10_TEMP1163 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 917
final double X10_TEMP242 =
                          (X10_TEMP1163);
                        
//#line 918
final double X10_TEMP1166 =
                          (k *
                             X10_TEMP242);
                        
//#line 920
final double X10_TEMP245 =
                          (X10_TEMP1166);
                        
//#line 921
final double X10_TEMP1169 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 923
final double X10_TEMP243 =
                          (X10_TEMP1169);
                        
//#line 924
final double X10_TEMP1172 =
                          (0.5);
                        
//#line 926
final double X10_TEMP244 =
                          (X10_TEMP1172);
                        
//#line 927
final double X10_TEMP1175 =
                          (X10_TEMP243 *
                             X10_TEMP244);
                        
//#line 929
final double X10_TEMP246 =
                          (X10_TEMP1175);
                        
//#line 930
final double X10_TEMP1178 =
                          (X10_TEMP245 +
                             X10_TEMP246);
                        
//#line 932
final double X10_TEMP248 =
                          (X10_TEMP1178);
                        
//#line 933
final double X10_TEMP1181 =
                          (0.0);
                        
//#line 935
double X10_TEMP256 =
                          (X10_TEMP1181);
                        
//#line 936
final double X10_TEMP1184 =
                          (0.0);
                        
//#line 938
double X10_TEMP257 =
                          (X10_TEMP1184);
                        
//#line 939
final double X10_TEMP1187 =
                          (0.0);
                        
//#line 941
double X10_TEMP258 =
                          (X10_TEMP1187);
                        
//#line 942
final double X10_TEMP1190 =
                          (0.0);
                        
//#line 944
double X10_TEMP259 =
                          (X10_TEMP1190);
                        
//#line 945
final double X10_TEMP1193 =
                          (0.0);
                        
//#line 947
double X10_TEMP260 =
                          (X10_TEMP1193);
                        
//#line 948
final double X10_TEMP1196 =
                          (0.0);
                        
//#line 950
double X10_TEMP261 =
                          (X10_TEMP1196);
                        
//#line 951
final Particle X10_TEMP1208 =
                          (new Particle(
                             X10_TEMP228,
                             X10_TEMP240,
                             X10_TEMP248,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259,
                             X10_TEMP260,
                             X10_TEMP261));
                        
//#line 953
final Particle X10_TEMP264 =
                          (X10_TEMP1208);
                        
//#line 954
final Particle X10_TEMP1211 =
                          (X10_TEMP264);
                        
//#line 956
final Particle X10_TEMP265 =
                          (X10_TEMP1211);
                        
//#line 957
final Particle X10_TEMP1215 =
                          (X10_TEMP265);
                        
//#line 959
final Particle X10_TEMP1218 =
                          (X10_TEMP1215);
                        
//#line 960
/* template:array_set { */(X10_TEMP216).set((X10_TEMP1218),ijk)/* } */;
                        
//#line 961
final int X10_TEMP1220 =
                          (1);
                        
//#line 963
final int X10_TEMP266 =
                          (X10_TEMP1220);
                        
//#line 964
final int X10_TEMP1223 =
                          (ijk +
                             X10_TEMP266);
                        
//#line 966
final int X10_TEMP268 =
                          (X10_TEMP1223);
                        
//#line 967
final int X10_TEMP1226 =
                          (X10_TEMP268);
                        
//#line 969
ijk =
                          ((X10_TEMP1226));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var8____ = (__var135__).iterator(); __var8____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var8__ = (x10.
                      lang.
                      point) __var8____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                        
//#line 858
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1106 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 860
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP216 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1106));
                        
//#line 861
final double X10_TEMP1109 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 863
final double X10_TEMP218 =
                          (X10_TEMP1109);
                        
//#line 864
final double X10_TEMP1112 =
                          (i *
                             X10_TEMP218);
                        
//#line 866
final double X10_TEMP225 =
                          (X10_TEMP1112);
                        
//#line 867
final int X10_TEMP1115 =
                          (2);
                        
//#line 869
final int X10_TEMP219 =
                          (X10_TEMP1115);
                        
//#line 870
final int X10_TEMP1118 =
                          (X10_TEMP219 -
                             lg);
                        
//#line 872
final int X10_TEMP221 =
                          (X10_TEMP1118);
                        
//#line 873
final double X10_TEMP1121 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 875
final double X10_TEMP222 =
                          (X10_TEMP1121);
                        
//#line 876
final double X10_TEMP1124 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 878
final double X10_TEMP223 =
                          (X10_TEMP1124);
                        
//#line 879
final double X10_TEMP1127 =
                          (0.5);
                        
//#line 881
final double X10_TEMP224 =
                          (X10_TEMP1127);
                        
//#line 882
final double X10_TEMP1130 =
                          (X10_TEMP223 *
                             X10_TEMP224);
                        
//#line 884
final double X10_TEMP226 =
                          (X10_TEMP1130);
                        
//#line 885
final double X10_TEMP1133 =
                          (X10_TEMP225 +
                             X10_TEMP226);
                        
//#line 887
final double X10_TEMP228 =
                          (X10_TEMP1133);
                        
//#line 888
final double X10_TEMP1136 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 890
final double X10_TEMP230 =
                          (X10_TEMP1136);
                        
//#line 891
final double X10_TEMP1139 =
                          (j *
                             X10_TEMP230);
                        
//#line 893
final double X10_TEMP237 =
                          (X10_TEMP1139);
                        
//#line 894
final int X10_TEMP1142 =
                          (1);
                        
//#line 896
final int X10_TEMP231 =
                          (X10_TEMP1142);
                        
//#line 897
final int X10_TEMP1145 =
                          (lg -
                             X10_TEMP231);
                        
//#line 899
final int X10_TEMP233 =
                          (X10_TEMP1145);
                        
//#line 900
final double X10_TEMP1148 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 902
final double X10_TEMP234 =
                          (X10_TEMP1148);
                        
//#line 903
final double X10_TEMP1151 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 905
final double X10_TEMP235 =
                          (X10_TEMP1151);
                        
//#line 906
final double X10_TEMP1154 =
                          (0.5);
                        
//#line 908
final double X10_TEMP236 =
                          (X10_TEMP1154);
                        
//#line 909
final double X10_TEMP1157 =
                          (X10_TEMP235 *
                             X10_TEMP236);
                        
//#line 911
final double X10_TEMP238 =
                          (X10_TEMP1157);
                        
//#line 912
final double X10_TEMP1160 =
                          (X10_TEMP237 +
                             X10_TEMP238);
                        
//#line 914
final double X10_TEMP240 =
                          (X10_TEMP1160);
                        
//#line 915
final double X10_TEMP1163 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 917
final double X10_TEMP242 =
                          (X10_TEMP1163);
                        
//#line 918
final double X10_TEMP1166 =
                          (k *
                             X10_TEMP242);
                        
//#line 920
final double X10_TEMP245 =
                          (X10_TEMP1166);
                        
//#line 921
final double X10_TEMP1169 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 923
final double X10_TEMP243 =
                          (X10_TEMP1169);
                        
//#line 924
final double X10_TEMP1172 =
                          (0.5);
                        
//#line 926
final double X10_TEMP244 =
                          (X10_TEMP1172);
                        
//#line 927
final double X10_TEMP1175 =
                          (X10_TEMP243 *
                             X10_TEMP244);
                        
//#line 929
final double X10_TEMP246 =
                          (X10_TEMP1175);
                        
//#line 930
final double X10_TEMP1178 =
                          (X10_TEMP245 +
                             X10_TEMP246);
                        
//#line 932
final double X10_TEMP248 =
                          (X10_TEMP1178);
                        
//#line 933
final double X10_TEMP1181 =
                          (0.0);
                        
//#line 935
double X10_TEMP256 =
                          (X10_TEMP1181);
                        
//#line 936
final double X10_TEMP1184 =
                          (0.0);
                        
//#line 938
double X10_TEMP257 =
                          (X10_TEMP1184);
                        
//#line 939
final double X10_TEMP1187 =
                          (0.0);
                        
//#line 941
double X10_TEMP258 =
                          (X10_TEMP1187);
                        
//#line 942
final double X10_TEMP1190 =
                          (0.0);
                        
//#line 944
double X10_TEMP259 =
                          (X10_TEMP1190);
                        
//#line 945
final double X10_TEMP1193 =
                          (0.0);
                        
//#line 947
double X10_TEMP260 =
                          (X10_TEMP1193);
                        
//#line 948
final double X10_TEMP1196 =
                          (0.0);
                        
//#line 950
double X10_TEMP261 =
                          (X10_TEMP1196);
                        
//#line 951
final Particle X10_TEMP1208 =
                          (new Particle(
                             X10_TEMP228,
                             X10_TEMP240,
                             X10_TEMP248,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259,
                             X10_TEMP260,
                             X10_TEMP261));
                        
//#line 953
final Particle X10_TEMP264 =
                          (X10_TEMP1208);
                        
//#line 954
final Particle X10_TEMP1211 =
                          (X10_TEMP264);
                        
//#line 956
final Particle X10_TEMP265 =
                          (X10_TEMP1211);
                        
//#line 957
final Particle X10_TEMP1215 =
                          (X10_TEMP265);
                        
//#line 959
final Particle X10_TEMP1218 =
                          (X10_TEMP1215);
                        
//#line 960
/* template:array_set { */(X10_TEMP216).set((X10_TEMP1218),ijk)/* } */;
                        
//#line 961
final int X10_TEMP1220 =
                          (1);
                        
//#line 963
final int X10_TEMP266 =
                          (X10_TEMP1220);
                        
//#line 964
final int X10_TEMP1223 =
                          (ijk +
                             X10_TEMP266);
                        
//#line 966
final int X10_TEMP268 =
                          (X10_TEMP1223);
                        
//#line 967
final int X10_TEMP1226 =
                          (X10_TEMP268);
                        
//#line 969
ijk =
                          ((X10_TEMP1226));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var7____ = (__var132__).iterator(); __var7____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var7__ = (x10.
                  lang.
                  point) __var7____.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((__var7__).get(0))/* } */;/* } */
{
                    
//#line 845
final int X10_TEMP1091 =
                      (0);
                    
//#line 847
final int X10_TEMP212 =
                      (X10_TEMP1091);
                    
//#line 848
final int X10_TEMP1094 =
                      (1);
                    
//#line 850
final int X10_TEMP210 =
                      (X10_TEMP1094);
                    
//#line 851
final int X10_TEMP1097 =
                      (mm -
                         X10_TEMP210);
                    
//#line 853
final int X10_TEMP213 =
                      (X10_TEMP1097);
                    
//#line 854
final x10.
                      lang.
                      region X10_TEMP1102 =
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
                              X10_TEMP212,
                              X10_TEMP213))));
                    
//#line 856
final x10.
                      lang.
                      region X10_TEMP215 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1102));
                    
//#line 857
/* template:forloop-mult { */{
                    x10.lang.region __var138__ = (x10.lang.region) X10_TEMP215;
                    if (__var138__.size() > 0 && (__var138__ instanceof x10.array.MultiDimRegion || __var138__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var139__ = __var138__.rank(0).low(), __var140__ = __var138__.rank(0).high(); __var139__ <= __var140__; __var139__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var139__;
                    /* } */
                    /* } */
{
                        
//#line 858
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1106 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 860
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP216 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1106));
                        
//#line 861
final double X10_TEMP1109 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 863
final double X10_TEMP218 =
                          (X10_TEMP1109);
                        
//#line 864
final double X10_TEMP1112 =
                          (i *
                             X10_TEMP218);
                        
//#line 866
final double X10_TEMP225 =
                          (X10_TEMP1112);
                        
//#line 867
final int X10_TEMP1115 =
                          (2);
                        
//#line 869
final int X10_TEMP219 =
                          (X10_TEMP1115);
                        
//#line 870
final int X10_TEMP1118 =
                          (X10_TEMP219 -
                             lg);
                        
//#line 872
final int X10_TEMP221 =
                          (X10_TEMP1118);
                        
//#line 873
final double X10_TEMP1121 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 875
final double X10_TEMP222 =
                          (X10_TEMP1121);
                        
//#line 876
final double X10_TEMP1124 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 878
final double X10_TEMP223 =
                          (X10_TEMP1124);
                        
//#line 879
final double X10_TEMP1127 =
                          (0.5);
                        
//#line 881
final double X10_TEMP224 =
                          (X10_TEMP1127);
                        
//#line 882
final double X10_TEMP1130 =
                          (X10_TEMP223 *
                             X10_TEMP224);
                        
//#line 884
final double X10_TEMP226 =
                          (X10_TEMP1130);
                        
//#line 885
final double X10_TEMP1133 =
                          (X10_TEMP225 +
                             X10_TEMP226);
                        
//#line 887
final double X10_TEMP228 =
                          (X10_TEMP1133);
                        
//#line 888
final double X10_TEMP1136 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 890
final double X10_TEMP230 =
                          (X10_TEMP1136);
                        
//#line 891
final double X10_TEMP1139 =
                          (j *
                             X10_TEMP230);
                        
//#line 893
final double X10_TEMP237 =
                          (X10_TEMP1139);
                        
//#line 894
final int X10_TEMP1142 =
                          (1);
                        
//#line 896
final int X10_TEMP231 =
                          (X10_TEMP1142);
                        
//#line 897
final int X10_TEMP1145 =
                          (lg -
                             X10_TEMP231);
                        
//#line 899
final int X10_TEMP233 =
                          (X10_TEMP1145);
                        
//#line 900
final double X10_TEMP1148 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 902
final double X10_TEMP234 =
                          (X10_TEMP1148);
                        
//#line 903
final double X10_TEMP1151 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 905
final double X10_TEMP235 =
                          (X10_TEMP1151);
                        
//#line 906
final double X10_TEMP1154 =
                          (0.5);
                        
//#line 908
final double X10_TEMP236 =
                          (X10_TEMP1154);
                        
//#line 909
final double X10_TEMP1157 =
                          (X10_TEMP235 *
                             X10_TEMP236);
                        
//#line 911
final double X10_TEMP238 =
                          (X10_TEMP1157);
                        
//#line 912
final double X10_TEMP1160 =
                          (X10_TEMP237 +
                             X10_TEMP238);
                        
//#line 914
final double X10_TEMP240 =
                          (X10_TEMP1160);
                        
//#line 915
final double X10_TEMP1163 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 917
final double X10_TEMP242 =
                          (X10_TEMP1163);
                        
//#line 918
final double X10_TEMP1166 =
                          (k *
                             X10_TEMP242);
                        
//#line 920
final double X10_TEMP245 =
                          (X10_TEMP1166);
                        
//#line 921
final double X10_TEMP1169 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 923
final double X10_TEMP243 =
                          (X10_TEMP1169);
                        
//#line 924
final double X10_TEMP1172 =
                          (0.5);
                        
//#line 926
final double X10_TEMP244 =
                          (X10_TEMP1172);
                        
//#line 927
final double X10_TEMP1175 =
                          (X10_TEMP243 *
                             X10_TEMP244);
                        
//#line 929
final double X10_TEMP246 =
                          (X10_TEMP1175);
                        
//#line 930
final double X10_TEMP1178 =
                          (X10_TEMP245 +
                             X10_TEMP246);
                        
//#line 932
final double X10_TEMP248 =
                          (X10_TEMP1178);
                        
//#line 933
final double X10_TEMP1181 =
                          (0.0);
                        
//#line 935
double X10_TEMP256 =
                          (X10_TEMP1181);
                        
//#line 936
final double X10_TEMP1184 =
                          (0.0);
                        
//#line 938
double X10_TEMP257 =
                          (X10_TEMP1184);
                        
//#line 939
final double X10_TEMP1187 =
                          (0.0);
                        
//#line 941
double X10_TEMP258 =
                          (X10_TEMP1187);
                        
//#line 942
final double X10_TEMP1190 =
                          (0.0);
                        
//#line 944
double X10_TEMP259 =
                          (X10_TEMP1190);
                        
//#line 945
final double X10_TEMP1193 =
                          (0.0);
                        
//#line 947
double X10_TEMP260 =
                          (X10_TEMP1193);
                        
//#line 948
final double X10_TEMP1196 =
                          (0.0);
                        
//#line 950
double X10_TEMP261 =
                          (X10_TEMP1196);
                        
//#line 951
final Particle X10_TEMP1208 =
                          (new Particle(
                             X10_TEMP228,
                             X10_TEMP240,
                             X10_TEMP248,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259,
                             X10_TEMP260,
                             X10_TEMP261));
                        
//#line 953
final Particle X10_TEMP264 =
                          (X10_TEMP1208);
                        
//#line 954
final Particle X10_TEMP1211 =
                          (X10_TEMP264);
                        
//#line 956
final Particle X10_TEMP265 =
                          (X10_TEMP1211);
                        
//#line 957
final Particle X10_TEMP1215 =
                          (X10_TEMP265);
                        
//#line 959
final Particle X10_TEMP1218 =
                          (X10_TEMP1215);
                        
//#line 960
/* template:array_set { */(X10_TEMP216).set((X10_TEMP1218),ijk)/* } */;
                        
//#line 961
final int X10_TEMP1220 =
                          (1);
                        
//#line 963
final int X10_TEMP266 =
                          (X10_TEMP1220);
                        
//#line 964
final int X10_TEMP1223 =
                          (ijk +
                             X10_TEMP266);
                        
//#line 966
final int X10_TEMP268 =
                          (X10_TEMP1223);
                        
//#line 967
final int X10_TEMP1226 =
                          (X10_TEMP268);
                        
//#line 969
ijk =
                          ((X10_TEMP1226));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var8____ = (__var138__).iterator(); __var8____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var8__ = (x10.
                      lang.
                      point) __var8____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                        
//#line 858
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1106 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 860
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP216 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1106));
                        
//#line 861
final double X10_TEMP1109 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 863
final double X10_TEMP218 =
                          (X10_TEMP1109);
                        
//#line 864
final double X10_TEMP1112 =
                          (i *
                             X10_TEMP218);
                        
//#line 866
final double X10_TEMP225 =
                          (X10_TEMP1112);
                        
//#line 867
final int X10_TEMP1115 =
                          (2);
                        
//#line 869
final int X10_TEMP219 =
                          (X10_TEMP1115);
                        
//#line 870
final int X10_TEMP1118 =
                          (X10_TEMP219 -
                             lg);
                        
//#line 872
final int X10_TEMP221 =
                          (X10_TEMP1118);
                        
//#line 873
final double X10_TEMP1121 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 875
final double X10_TEMP222 =
                          (X10_TEMP1121);
                        
//#line 876
final double X10_TEMP1124 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 878
final double X10_TEMP223 =
                          (X10_TEMP1124);
                        
//#line 879
final double X10_TEMP1127 =
                          (0.5);
                        
//#line 881
final double X10_TEMP224 =
                          (X10_TEMP1127);
                        
//#line 882
final double X10_TEMP1130 =
                          (X10_TEMP223 *
                             X10_TEMP224);
                        
//#line 884
final double X10_TEMP226 =
                          (X10_TEMP1130);
                        
//#line 885
final double X10_TEMP1133 =
                          (X10_TEMP225 +
                             X10_TEMP226);
                        
//#line 887
final double X10_TEMP228 =
                          (X10_TEMP1133);
                        
//#line 888
final double X10_TEMP1136 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 890
final double X10_TEMP230 =
                          (X10_TEMP1136);
                        
//#line 891
final double X10_TEMP1139 =
                          (j *
                             X10_TEMP230);
                        
//#line 893
final double X10_TEMP237 =
                          (X10_TEMP1139);
                        
//#line 894
final int X10_TEMP1142 =
                          (1);
                        
//#line 896
final int X10_TEMP231 =
                          (X10_TEMP1142);
                        
//#line 897
final int X10_TEMP1145 =
                          (lg -
                             X10_TEMP231);
                        
//#line 899
final int X10_TEMP233 =
                          (X10_TEMP1145);
                        
//#line 900
final double X10_TEMP1148 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 902
final double X10_TEMP234 =
                          (X10_TEMP1148);
                        
//#line 903
final double X10_TEMP1151 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 905
final double X10_TEMP235 =
                          (X10_TEMP1151);
                        
//#line 906
final double X10_TEMP1154 =
                          (0.5);
                        
//#line 908
final double X10_TEMP236 =
                          (X10_TEMP1154);
                        
//#line 909
final double X10_TEMP1157 =
                          (X10_TEMP235 *
                             X10_TEMP236);
                        
//#line 911
final double X10_TEMP238 =
                          (X10_TEMP1157);
                        
//#line 912
final double X10_TEMP1160 =
                          (X10_TEMP237 +
                             X10_TEMP238);
                        
//#line 914
final double X10_TEMP240 =
                          (X10_TEMP1160);
                        
//#line 915
final double X10_TEMP1163 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 917
final double X10_TEMP242 =
                          (X10_TEMP1163);
                        
//#line 918
final double X10_TEMP1166 =
                          (k *
                             X10_TEMP242);
                        
//#line 920
final double X10_TEMP245 =
                          (X10_TEMP1166);
                        
//#line 921
final double X10_TEMP1169 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 923
final double X10_TEMP243 =
                          (X10_TEMP1169);
                        
//#line 924
final double X10_TEMP1172 =
                          (0.5);
                        
//#line 926
final double X10_TEMP244 =
                          (X10_TEMP1172);
                        
//#line 927
final double X10_TEMP1175 =
                          (X10_TEMP243 *
                             X10_TEMP244);
                        
//#line 929
final double X10_TEMP246 =
                          (X10_TEMP1175);
                        
//#line 930
final double X10_TEMP1178 =
                          (X10_TEMP245 +
                             X10_TEMP246);
                        
//#line 932
final double X10_TEMP248 =
                          (X10_TEMP1178);
                        
//#line 933
final double X10_TEMP1181 =
                          (0.0);
                        
//#line 935
double X10_TEMP256 =
                          (X10_TEMP1181);
                        
//#line 936
final double X10_TEMP1184 =
                          (0.0);
                        
//#line 938
double X10_TEMP257 =
                          (X10_TEMP1184);
                        
//#line 939
final double X10_TEMP1187 =
                          (0.0);
                        
//#line 941
double X10_TEMP258 =
                          (X10_TEMP1187);
                        
//#line 942
final double X10_TEMP1190 =
                          (0.0);
                        
//#line 944
double X10_TEMP259 =
                          (X10_TEMP1190);
                        
//#line 945
final double X10_TEMP1193 =
                          (0.0);
                        
//#line 947
double X10_TEMP260 =
                          (X10_TEMP1193);
                        
//#line 948
final double X10_TEMP1196 =
                          (0.0);
                        
//#line 950
double X10_TEMP261 =
                          (X10_TEMP1196);
                        
//#line 951
final Particle X10_TEMP1208 =
                          (new Particle(
                             X10_TEMP228,
                             X10_TEMP240,
                             X10_TEMP248,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259,
                             X10_TEMP260,
                             X10_TEMP261));
                        
//#line 953
final Particle X10_TEMP264 =
                          (X10_TEMP1208);
                        
//#line 954
final Particle X10_TEMP1211 =
                          (X10_TEMP264);
                        
//#line 956
final Particle X10_TEMP265 =
                          (X10_TEMP1211);
                        
//#line 957
final Particle X10_TEMP1215 =
                          (X10_TEMP265);
                        
//#line 959
final Particle X10_TEMP1218 =
                          (X10_TEMP1215);
                        
//#line 960
/* template:array_set { */(X10_TEMP216).set((X10_TEMP1218),ijk)/* } */;
                        
//#line 961
final int X10_TEMP1220 =
                          (1);
                        
//#line 963
final int X10_TEMP266 =
                          (X10_TEMP1220);
                        
//#line 964
final int X10_TEMP1223 =
                          (ijk +
                             X10_TEMP266);
                        
//#line 966
final int X10_TEMP268 =
                          (X10_TEMP1223);
                        
//#line 967
final int X10_TEMP1226 =
                          (X10_TEMP268);
                        
//#line 969
ijk =
                          ((X10_TEMP1226));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var6____ = (__var129__).iterator(); __var6____.hasNext(); ) {
            	final  x10.
              lang.
              point __var6__ = (x10.
              lang.
              point) __var6____.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var6__).get(0))/* } */;/* } */
{
                
//#line 832
final int X10_TEMP1076 =
                  (0);
                
//#line 834
final int X10_TEMP205 =
                  (X10_TEMP1076);
                
//#line 835
final int X10_TEMP1079 =
                  (1);
                
//#line 837
final int X10_TEMP203 =
                  (X10_TEMP1079);
                
//#line 838
final int X10_TEMP1082 =
                  (mm -
                     X10_TEMP203);
                
//#line 840
final int X10_TEMP206 =
                  (X10_TEMP1082);
                
//#line 841
final x10.
                  lang.
                  region X10_TEMP1087 =
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
                          X10_TEMP205,
                          X10_TEMP206))));
                
//#line 843
final x10.
                  lang.
                  region X10_TEMP208 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP1087));
                
//#line 844
/* template:forloop-mult { */{
                x10.lang.region __var141__ = (x10.lang.region) X10_TEMP208;
                if (__var141__.size() > 0 && (__var141__ instanceof x10.array.MultiDimRegion || __var141__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var142__ = __var141__.rank(0).low(), __var143__ = __var141__.rank(0).high(); __var142__ <= __var143__; __var142__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var142__;
                /* } */
                /* } */
{
                    
//#line 845
final int X10_TEMP1091 =
                      (0);
                    
//#line 847
final int X10_TEMP212 =
                      (X10_TEMP1091);
                    
//#line 848
final int X10_TEMP1094 =
                      (1);
                    
//#line 850
final int X10_TEMP210 =
                      (X10_TEMP1094);
                    
//#line 851
final int X10_TEMP1097 =
                      (mm -
                         X10_TEMP210);
                    
//#line 853
final int X10_TEMP213 =
                      (X10_TEMP1097);
                    
//#line 854
final x10.
                      lang.
                      region X10_TEMP1102 =
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
                              X10_TEMP212,
                              X10_TEMP213))));
                    
//#line 856
final x10.
                      lang.
                      region X10_TEMP215 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1102));
                    
//#line 857
/* template:forloop-mult { */{
                    x10.lang.region __var144__ = (x10.lang.region) X10_TEMP215;
                    if (__var144__.size() > 0 && (__var144__ instanceof x10.array.MultiDimRegion || __var144__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var145__ = __var144__.rank(0).low(), __var146__ = __var144__.rank(0).high(); __var145__ <= __var146__; __var145__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var145__;
                    /* } */
                    /* } */
{
                        
//#line 858
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1106 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 860
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP216 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1106));
                        
//#line 861
final double X10_TEMP1109 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 863
final double X10_TEMP218 =
                          (X10_TEMP1109);
                        
//#line 864
final double X10_TEMP1112 =
                          (i *
                             X10_TEMP218);
                        
//#line 866
final double X10_TEMP225 =
                          (X10_TEMP1112);
                        
//#line 867
final int X10_TEMP1115 =
                          (2);
                        
//#line 869
final int X10_TEMP219 =
                          (X10_TEMP1115);
                        
//#line 870
final int X10_TEMP1118 =
                          (X10_TEMP219 -
                             lg);
                        
//#line 872
final int X10_TEMP221 =
                          (X10_TEMP1118);
                        
//#line 873
final double X10_TEMP1121 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 875
final double X10_TEMP222 =
                          (X10_TEMP1121);
                        
//#line 876
final double X10_TEMP1124 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 878
final double X10_TEMP223 =
                          (X10_TEMP1124);
                        
//#line 879
final double X10_TEMP1127 =
                          (0.5);
                        
//#line 881
final double X10_TEMP224 =
                          (X10_TEMP1127);
                        
//#line 882
final double X10_TEMP1130 =
                          (X10_TEMP223 *
                             X10_TEMP224);
                        
//#line 884
final double X10_TEMP226 =
                          (X10_TEMP1130);
                        
//#line 885
final double X10_TEMP1133 =
                          (X10_TEMP225 +
                             X10_TEMP226);
                        
//#line 887
final double X10_TEMP228 =
                          (X10_TEMP1133);
                        
//#line 888
final double X10_TEMP1136 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 890
final double X10_TEMP230 =
                          (X10_TEMP1136);
                        
//#line 891
final double X10_TEMP1139 =
                          (j *
                             X10_TEMP230);
                        
//#line 893
final double X10_TEMP237 =
                          (X10_TEMP1139);
                        
//#line 894
final int X10_TEMP1142 =
                          (1);
                        
//#line 896
final int X10_TEMP231 =
                          (X10_TEMP1142);
                        
//#line 897
final int X10_TEMP1145 =
                          (lg -
                             X10_TEMP231);
                        
//#line 899
final int X10_TEMP233 =
                          (X10_TEMP1145);
                        
//#line 900
final double X10_TEMP1148 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 902
final double X10_TEMP234 =
                          (X10_TEMP1148);
                        
//#line 903
final double X10_TEMP1151 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 905
final double X10_TEMP235 =
                          (X10_TEMP1151);
                        
//#line 906
final double X10_TEMP1154 =
                          (0.5);
                        
//#line 908
final double X10_TEMP236 =
                          (X10_TEMP1154);
                        
//#line 909
final double X10_TEMP1157 =
                          (X10_TEMP235 *
                             X10_TEMP236);
                        
//#line 911
final double X10_TEMP238 =
                          (X10_TEMP1157);
                        
//#line 912
final double X10_TEMP1160 =
                          (X10_TEMP237 +
                             X10_TEMP238);
                        
//#line 914
final double X10_TEMP240 =
                          (X10_TEMP1160);
                        
//#line 915
final double X10_TEMP1163 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 917
final double X10_TEMP242 =
                          (X10_TEMP1163);
                        
//#line 918
final double X10_TEMP1166 =
                          (k *
                             X10_TEMP242);
                        
//#line 920
final double X10_TEMP245 =
                          (X10_TEMP1166);
                        
//#line 921
final double X10_TEMP1169 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 923
final double X10_TEMP243 =
                          (X10_TEMP1169);
                        
//#line 924
final double X10_TEMP1172 =
                          (0.5);
                        
//#line 926
final double X10_TEMP244 =
                          (X10_TEMP1172);
                        
//#line 927
final double X10_TEMP1175 =
                          (X10_TEMP243 *
                             X10_TEMP244);
                        
//#line 929
final double X10_TEMP246 =
                          (X10_TEMP1175);
                        
//#line 930
final double X10_TEMP1178 =
                          (X10_TEMP245 +
                             X10_TEMP246);
                        
//#line 932
final double X10_TEMP248 =
                          (X10_TEMP1178);
                        
//#line 933
final double X10_TEMP1181 =
                          (0.0);
                        
//#line 935
double X10_TEMP256 =
                          (X10_TEMP1181);
                        
//#line 936
final double X10_TEMP1184 =
                          (0.0);
                        
//#line 938
double X10_TEMP257 =
                          (X10_TEMP1184);
                        
//#line 939
final double X10_TEMP1187 =
                          (0.0);
                        
//#line 941
double X10_TEMP258 =
                          (X10_TEMP1187);
                        
//#line 942
final double X10_TEMP1190 =
                          (0.0);
                        
//#line 944
double X10_TEMP259 =
                          (X10_TEMP1190);
                        
//#line 945
final double X10_TEMP1193 =
                          (0.0);
                        
//#line 947
double X10_TEMP260 =
                          (X10_TEMP1193);
                        
//#line 948
final double X10_TEMP1196 =
                          (0.0);
                        
//#line 950
double X10_TEMP261 =
                          (X10_TEMP1196);
                        
//#line 951
final Particle X10_TEMP1208 =
                          (new Particle(
                             X10_TEMP228,
                             X10_TEMP240,
                             X10_TEMP248,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259,
                             X10_TEMP260,
                             X10_TEMP261));
                        
//#line 953
final Particle X10_TEMP264 =
                          (X10_TEMP1208);
                        
//#line 954
final Particle X10_TEMP1211 =
                          (X10_TEMP264);
                        
//#line 956
final Particle X10_TEMP265 =
                          (X10_TEMP1211);
                        
//#line 957
final Particle X10_TEMP1215 =
                          (X10_TEMP265);
                        
//#line 959
final Particle X10_TEMP1218 =
                          (X10_TEMP1215);
                        
//#line 960
/* template:array_set { */(X10_TEMP216).set((X10_TEMP1218),ijk)/* } */;
                        
//#line 961
final int X10_TEMP1220 =
                          (1);
                        
//#line 963
final int X10_TEMP266 =
                          (X10_TEMP1220);
                        
//#line 964
final int X10_TEMP1223 =
                          (ijk +
                             X10_TEMP266);
                        
//#line 966
final int X10_TEMP268 =
                          (X10_TEMP1223);
                        
//#line 967
final int X10_TEMP1226 =
                          (X10_TEMP268);
                        
//#line 969
ijk =
                          ((X10_TEMP1226));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var8____ = (__var144__).iterator(); __var8____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var8__ = (x10.
                      lang.
                      point) __var8____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                        
//#line 858
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1106 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 860
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP216 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1106));
                        
//#line 861
final double X10_TEMP1109 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 863
final double X10_TEMP218 =
                          (X10_TEMP1109);
                        
//#line 864
final double X10_TEMP1112 =
                          (i *
                             X10_TEMP218);
                        
//#line 866
final double X10_TEMP225 =
                          (X10_TEMP1112);
                        
//#line 867
final int X10_TEMP1115 =
                          (2);
                        
//#line 869
final int X10_TEMP219 =
                          (X10_TEMP1115);
                        
//#line 870
final int X10_TEMP1118 =
                          (X10_TEMP219 -
                             lg);
                        
//#line 872
final int X10_TEMP221 =
                          (X10_TEMP1118);
                        
//#line 873
final double X10_TEMP1121 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 875
final double X10_TEMP222 =
                          (X10_TEMP1121);
                        
//#line 876
final double X10_TEMP1124 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 878
final double X10_TEMP223 =
                          (X10_TEMP1124);
                        
//#line 879
final double X10_TEMP1127 =
                          (0.5);
                        
//#line 881
final double X10_TEMP224 =
                          (X10_TEMP1127);
                        
//#line 882
final double X10_TEMP1130 =
                          (X10_TEMP223 *
                             X10_TEMP224);
                        
//#line 884
final double X10_TEMP226 =
                          (X10_TEMP1130);
                        
//#line 885
final double X10_TEMP1133 =
                          (X10_TEMP225 +
                             X10_TEMP226);
                        
//#line 887
final double X10_TEMP228 =
                          (X10_TEMP1133);
                        
//#line 888
final double X10_TEMP1136 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 890
final double X10_TEMP230 =
                          (X10_TEMP1136);
                        
//#line 891
final double X10_TEMP1139 =
                          (j *
                             X10_TEMP230);
                        
//#line 893
final double X10_TEMP237 =
                          (X10_TEMP1139);
                        
//#line 894
final int X10_TEMP1142 =
                          (1);
                        
//#line 896
final int X10_TEMP231 =
                          (X10_TEMP1142);
                        
//#line 897
final int X10_TEMP1145 =
                          (lg -
                             X10_TEMP231);
                        
//#line 899
final int X10_TEMP233 =
                          (X10_TEMP1145);
                        
//#line 900
final double X10_TEMP1148 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 902
final double X10_TEMP234 =
                          (X10_TEMP1148);
                        
//#line 903
final double X10_TEMP1151 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 905
final double X10_TEMP235 =
                          (X10_TEMP1151);
                        
//#line 906
final double X10_TEMP1154 =
                          (0.5);
                        
//#line 908
final double X10_TEMP236 =
                          (X10_TEMP1154);
                        
//#line 909
final double X10_TEMP1157 =
                          (X10_TEMP235 *
                             X10_TEMP236);
                        
//#line 911
final double X10_TEMP238 =
                          (X10_TEMP1157);
                        
//#line 912
final double X10_TEMP1160 =
                          (X10_TEMP237 +
                             X10_TEMP238);
                        
//#line 914
final double X10_TEMP240 =
                          (X10_TEMP1160);
                        
//#line 915
final double X10_TEMP1163 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 917
final double X10_TEMP242 =
                          (X10_TEMP1163);
                        
//#line 918
final double X10_TEMP1166 =
                          (k *
                             X10_TEMP242);
                        
//#line 920
final double X10_TEMP245 =
                          (X10_TEMP1166);
                        
//#line 921
final double X10_TEMP1169 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 923
final double X10_TEMP243 =
                          (X10_TEMP1169);
                        
//#line 924
final double X10_TEMP1172 =
                          (0.5);
                        
//#line 926
final double X10_TEMP244 =
                          (X10_TEMP1172);
                        
//#line 927
final double X10_TEMP1175 =
                          (X10_TEMP243 *
                             X10_TEMP244);
                        
//#line 929
final double X10_TEMP246 =
                          (X10_TEMP1175);
                        
//#line 930
final double X10_TEMP1178 =
                          (X10_TEMP245 +
                             X10_TEMP246);
                        
//#line 932
final double X10_TEMP248 =
                          (X10_TEMP1178);
                        
//#line 933
final double X10_TEMP1181 =
                          (0.0);
                        
//#line 935
double X10_TEMP256 =
                          (X10_TEMP1181);
                        
//#line 936
final double X10_TEMP1184 =
                          (0.0);
                        
//#line 938
double X10_TEMP257 =
                          (X10_TEMP1184);
                        
//#line 939
final double X10_TEMP1187 =
                          (0.0);
                        
//#line 941
double X10_TEMP258 =
                          (X10_TEMP1187);
                        
//#line 942
final double X10_TEMP1190 =
                          (0.0);
                        
//#line 944
double X10_TEMP259 =
                          (X10_TEMP1190);
                        
//#line 945
final double X10_TEMP1193 =
                          (0.0);
                        
//#line 947
double X10_TEMP260 =
                          (X10_TEMP1193);
                        
//#line 948
final double X10_TEMP1196 =
                          (0.0);
                        
//#line 950
double X10_TEMP261 =
                          (X10_TEMP1196);
                        
//#line 951
final Particle X10_TEMP1208 =
                          (new Particle(
                             X10_TEMP228,
                             X10_TEMP240,
                             X10_TEMP248,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259,
                             X10_TEMP260,
                             X10_TEMP261));
                        
//#line 953
final Particle X10_TEMP264 =
                          (X10_TEMP1208);
                        
//#line 954
final Particle X10_TEMP1211 =
                          (X10_TEMP264);
                        
//#line 956
final Particle X10_TEMP265 =
                          (X10_TEMP1211);
                        
//#line 957
final Particle X10_TEMP1215 =
                          (X10_TEMP265);
                        
//#line 959
final Particle X10_TEMP1218 =
                          (X10_TEMP1215);
                        
//#line 960
/* template:array_set { */(X10_TEMP216).set((X10_TEMP1218),ijk)/* } */;
                        
//#line 961
final int X10_TEMP1220 =
                          (1);
                        
//#line 963
final int X10_TEMP266 =
                          (X10_TEMP1220);
                        
//#line 964
final int X10_TEMP1223 =
                          (ijk +
                             X10_TEMP266);
                        
//#line 966
final int X10_TEMP268 =
                          (X10_TEMP1223);
                        
//#line 967
final int X10_TEMP1226 =
                          (X10_TEMP268);
                        
//#line 969
ijk =
                          ((X10_TEMP1226));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var7____ = (__var141__).iterator(); __var7____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var7__ = (x10.
                  lang.
                  point) __var7____.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((__var7__).get(0))/* } */;/* } */
{
                    
//#line 845
final int X10_TEMP1091 =
                      (0);
                    
//#line 847
final int X10_TEMP212 =
                      (X10_TEMP1091);
                    
//#line 848
final int X10_TEMP1094 =
                      (1);
                    
//#line 850
final int X10_TEMP210 =
                      (X10_TEMP1094);
                    
//#line 851
final int X10_TEMP1097 =
                      (mm -
                         X10_TEMP210);
                    
//#line 853
final int X10_TEMP213 =
                      (X10_TEMP1097);
                    
//#line 854
final x10.
                      lang.
                      region X10_TEMP1102 =
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
                              X10_TEMP212,
                              X10_TEMP213))));
                    
//#line 856
final x10.
                      lang.
                      region X10_TEMP215 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1102));
                    
//#line 857
/* template:forloop-mult { */{
                    x10.lang.region __var147__ = (x10.lang.region) X10_TEMP215;
                    if (__var147__.size() > 0 && (__var147__ instanceof x10.array.MultiDimRegion || __var147__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var148__ = __var147__.rank(0).low(), __var149__ = __var147__.rank(0).high(); __var148__ <= __var149__; __var148__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var148__;
                    /* } */
                    /* } */
{
                        
//#line 858
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1106 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 860
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP216 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1106));
                        
//#line 861
final double X10_TEMP1109 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 863
final double X10_TEMP218 =
                          (X10_TEMP1109);
                        
//#line 864
final double X10_TEMP1112 =
                          (i *
                             X10_TEMP218);
                        
//#line 866
final double X10_TEMP225 =
                          (X10_TEMP1112);
                        
//#line 867
final int X10_TEMP1115 =
                          (2);
                        
//#line 869
final int X10_TEMP219 =
                          (X10_TEMP1115);
                        
//#line 870
final int X10_TEMP1118 =
                          (X10_TEMP219 -
                             lg);
                        
//#line 872
final int X10_TEMP221 =
                          (X10_TEMP1118);
                        
//#line 873
final double X10_TEMP1121 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 875
final double X10_TEMP222 =
                          (X10_TEMP1121);
                        
//#line 876
final double X10_TEMP1124 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 878
final double X10_TEMP223 =
                          (X10_TEMP1124);
                        
//#line 879
final double X10_TEMP1127 =
                          (0.5);
                        
//#line 881
final double X10_TEMP224 =
                          (X10_TEMP1127);
                        
//#line 882
final double X10_TEMP1130 =
                          (X10_TEMP223 *
                             X10_TEMP224);
                        
//#line 884
final double X10_TEMP226 =
                          (X10_TEMP1130);
                        
//#line 885
final double X10_TEMP1133 =
                          (X10_TEMP225 +
                             X10_TEMP226);
                        
//#line 887
final double X10_TEMP228 =
                          (X10_TEMP1133);
                        
//#line 888
final double X10_TEMP1136 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 890
final double X10_TEMP230 =
                          (X10_TEMP1136);
                        
//#line 891
final double X10_TEMP1139 =
                          (j *
                             X10_TEMP230);
                        
//#line 893
final double X10_TEMP237 =
                          (X10_TEMP1139);
                        
//#line 894
final int X10_TEMP1142 =
                          (1);
                        
//#line 896
final int X10_TEMP231 =
                          (X10_TEMP1142);
                        
//#line 897
final int X10_TEMP1145 =
                          (lg -
                             X10_TEMP231);
                        
//#line 899
final int X10_TEMP233 =
                          (X10_TEMP1145);
                        
//#line 900
final double X10_TEMP1148 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 902
final double X10_TEMP234 =
                          (X10_TEMP1148);
                        
//#line 903
final double X10_TEMP1151 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 905
final double X10_TEMP235 =
                          (X10_TEMP1151);
                        
//#line 906
final double X10_TEMP1154 =
                          (0.5);
                        
//#line 908
final double X10_TEMP236 =
                          (X10_TEMP1154);
                        
//#line 909
final double X10_TEMP1157 =
                          (X10_TEMP235 *
                             X10_TEMP236);
                        
//#line 911
final double X10_TEMP238 =
                          (X10_TEMP1157);
                        
//#line 912
final double X10_TEMP1160 =
                          (X10_TEMP237 +
                             X10_TEMP238);
                        
//#line 914
final double X10_TEMP240 =
                          (X10_TEMP1160);
                        
//#line 915
final double X10_TEMP1163 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 917
final double X10_TEMP242 =
                          (X10_TEMP1163);
                        
//#line 918
final double X10_TEMP1166 =
                          (k *
                             X10_TEMP242);
                        
//#line 920
final double X10_TEMP245 =
                          (X10_TEMP1166);
                        
//#line 921
final double X10_TEMP1169 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 923
final double X10_TEMP243 =
                          (X10_TEMP1169);
                        
//#line 924
final double X10_TEMP1172 =
                          (0.5);
                        
//#line 926
final double X10_TEMP244 =
                          (X10_TEMP1172);
                        
//#line 927
final double X10_TEMP1175 =
                          (X10_TEMP243 *
                             X10_TEMP244);
                        
//#line 929
final double X10_TEMP246 =
                          (X10_TEMP1175);
                        
//#line 930
final double X10_TEMP1178 =
                          (X10_TEMP245 +
                             X10_TEMP246);
                        
//#line 932
final double X10_TEMP248 =
                          (X10_TEMP1178);
                        
//#line 933
final double X10_TEMP1181 =
                          (0.0);
                        
//#line 935
double X10_TEMP256 =
                          (X10_TEMP1181);
                        
//#line 936
final double X10_TEMP1184 =
                          (0.0);
                        
//#line 938
double X10_TEMP257 =
                          (X10_TEMP1184);
                        
//#line 939
final double X10_TEMP1187 =
                          (0.0);
                        
//#line 941
double X10_TEMP258 =
                          (X10_TEMP1187);
                        
//#line 942
final double X10_TEMP1190 =
                          (0.0);
                        
//#line 944
double X10_TEMP259 =
                          (X10_TEMP1190);
                        
//#line 945
final double X10_TEMP1193 =
                          (0.0);
                        
//#line 947
double X10_TEMP260 =
                          (X10_TEMP1193);
                        
//#line 948
final double X10_TEMP1196 =
                          (0.0);
                        
//#line 950
double X10_TEMP261 =
                          (X10_TEMP1196);
                        
//#line 951
final Particle X10_TEMP1208 =
                          (new Particle(
                             X10_TEMP228,
                             X10_TEMP240,
                             X10_TEMP248,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259,
                             X10_TEMP260,
                             X10_TEMP261));
                        
//#line 953
final Particle X10_TEMP264 =
                          (X10_TEMP1208);
                        
//#line 954
final Particle X10_TEMP1211 =
                          (X10_TEMP264);
                        
//#line 956
final Particle X10_TEMP265 =
                          (X10_TEMP1211);
                        
//#line 957
final Particle X10_TEMP1215 =
                          (X10_TEMP265);
                        
//#line 959
final Particle X10_TEMP1218 =
                          (X10_TEMP1215);
                        
//#line 960
/* template:array_set { */(X10_TEMP216).set((X10_TEMP1218),ijk)/* } */;
                        
//#line 961
final int X10_TEMP1220 =
                          (1);
                        
//#line 963
final int X10_TEMP266 =
                          (X10_TEMP1220);
                        
//#line 964
final int X10_TEMP1223 =
                          (ijk +
                             X10_TEMP266);
                        
//#line 966
final int X10_TEMP268 =
                          (X10_TEMP1223);
                        
//#line 967
final int X10_TEMP1226 =
                          (X10_TEMP268);
                        
//#line 969
ijk =
                          ((X10_TEMP1226));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var8____ = (__var147__).iterator(); __var8____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var8__ = (x10.
                      lang.
                      point) __var8____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                        
//#line 858
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1106 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 860
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP216 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1106));
                        
//#line 861
final double X10_TEMP1109 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 863
final double X10_TEMP218 =
                          (X10_TEMP1109);
                        
//#line 864
final double X10_TEMP1112 =
                          (i *
                             X10_TEMP218);
                        
//#line 866
final double X10_TEMP225 =
                          (X10_TEMP1112);
                        
//#line 867
final int X10_TEMP1115 =
                          (2);
                        
//#line 869
final int X10_TEMP219 =
                          (X10_TEMP1115);
                        
//#line 870
final int X10_TEMP1118 =
                          (X10_TEMP219 -
                             lg);
                        
//#line 872
final int X10_TEMP221 =
                          (X10_TEMP1118);
                        
//#line 873
final double X10_TEMP1121 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 875
final double X10_TEMP222 =
                          (X10_TEMP1121);
                        
//#line 876
final double X10_TEMP1124 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 878
final double X10_TEMP223 =
                          (X10_TEMP1124);
                        
//#line 879
final double X10_TEMP1127 =
                          (0.5);
                        
//#line 881
final double X10_TEMP224 =
                          (X10_TEMP1127);
                        
//#line 882
final double X10_TEMP1130 =
                          (X10_TEMP223 *
                             X10_TEMP224);
                        
//#line 884
final double X10_TEMP226 =
                          (X10_TEMP1130);
                        
//#line 885
final double X10_TEMP1133 =
                          (X10_TEMP225 +
                             X10_TEMP226);
                        
//#line 887
final double X10_TEMP228 =
                          (X10_TEMP1133);
                        
//#line 888
final double X10_TEMP1136 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 890
final double X10_TEMP230 =
                          (X10_TEMP1136);
                        
//#line 891
final double X10_TEMP1139 =
                          (j *
                             X10_TEMP230);
                        
//#line 893
final double X10_TEMP237 =
                          (X10_TEMP1139);
                        
//#line 894
final int X10_TEMP1142 =
                          (1);
                        
//#line 896
final int X10_TEMP231 =
                          (X10_TEMP1142);
                        
//#line 897
final int X10_TEMP1145 =
                          (lg -
                             X10_TEMP231);
                        
//#line 899
final int X10_TEMP233 =
                          (X10_TEMP1145);
                        
//#line 900
final double X10_TEMP1148 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 902
final double X10_TEMP234 =
                          (X10_TEMP1148);
                        
//#line 903
final double X10_TEMP1151 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 905
final double X10_TEMP235 =
                          (X10_TEMP1151);
                        
//#line 906
final double X10_TEMP1154 =
                          (0.5);
                        
//#line 908
final double X10_TEMP236 =
                          (X10_TEMP1154);
                        
//#line 909
final double X10_TEMP1157 =
                          (X10_TEMP235 *
                             X10_TEMP236);
                        
//#line 911
final double X10_TEMP238 =
                          (X10_TEMP1157);
                        
//#line 912
final double X10_TEMP1160 =
                          (X10_TEMP237 +
                             X10_TEMP238);
                        
//#line 914
final double X10_TEMP240 =
                          (X10_TEMP1160);
                        
//#line 915
final double X10_TEMP1163 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 917
final double X10_TEMP242 =
                          (X10_TEMP1163);
                        
//#line 918
final double X10_TEMP1166 =
                          (k *
                             X10_TEMP242);
                        
//#line 920
final double X10_TEMP245 =
                          (X10_TEMP1166);
                        
//#line 921
final double X10_TEMP1169 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 923
final double X10_TEMP243 =
                          (X10_TEMP1169);
                        
//#line 924
final double X10_TEMP1172 =
                          (0.5);
                        
//#line 926
final double X10_TEMP244 =
                          (X10_TEMP1172);
                        
//#line 927
final double X10_TEMP1175 =
                          (X10_TEMP243 *
                             X10_TEMP244);
                        
//#line 929
final double X10_TEMP246 =
                          (X10_TEMP1175);
                        
//#line 930
final double X10_TEMP1178 =
                          (X10_TEMP245 +
                             X10_TEMP246);
                        
//#line 932
final double X10_TEMP248 =
                          (X10_TEMP1178);
                        
//#line 933
final double X10_TEMP1181 =
                          (0.0);
                        
//#line 935
double X10_TEMP256 =
                          (X10_TEMP1181);
                        
//#line 936
final double X10_TEMP1184 =
                          (0.0);
                        
//#line 938
double X10_TEMP257 =
                          (X10_TEMP1184);
                        
//#line 939
final double X10_TEMP1187 =
                          (0.0);
                        
//#line 941
double X10_TEMP258 =
                          (X10_TEMP1187);
                        
//#line 942
final double X10_TEMP1190 =
                          (0.0);
                        
//#line 944
double X10_TEMP259 =
                          (X10_TEMP1190);
                        
//#line 945
final double X10_TEMP1193 =
                          (0.0);
                        
//#line 947
double X10_TEMP260 =
                          (X10_TEMP1193);
                        
//#line 948
final double X10_TEMP1196 =
                          (0.0);
                        
//#line 950
double X10_TEMP261 =
                          (X10_TEMP1196);
                        
//#line 951
final Particle X10_TEMP1208 =
                          (new Particle(
                             X10_TEMP228,
                             X10_TEMP240,
                             X10_TEMP248,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259,
                             X10_TEMP260,
                             X10_TEMP261));
                        
//#line 953
final Particle X10_TEMP264 =
                          (X10_TEMP1208);
                        
//#line 954
final Particle X10_TEMP1211 =
                          (X10_TEMP264);
                        
//#line 956
final Particle X10_TEMP265 =
                          (X10_TEMP1211);
                        
//#line 957
final Particle X10_TEMP1215 =
                          (X10_TEMP265);
                        
//#line 959
final Particle X10_TEMP1218 =
                          (X10_TEMP1215);
                        
//#line 960
/* template:array_set { */(X10_TEMP216).set((X10_TEMP1218),ijk)/* } */;
                        
//#line 961
final int X10_TEMP1220 =
                          (1);
                        
//#line 963
final int X10_TEMP266 =
                          (X10_TEMP1220);
                        
//#line 964
final int X10_TEMP1223 =
                          (ijk +
                             X10_TEMP266);
                        
//#line 966
final int X10_TEMP268 =
                          (X10_TEMP1223);
                        
//#line 967
final int X10_TEMP1226 =
                          (X10_TEMP268);
                        
//#line 969
ijk =
                          ((X10_TEMP1226));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 974
final int X10_TEMP1229 =
          (0);
        
//#line 976
int iseed =
          (X10_TEMP1229);
        
//#line 977
final double X10_TEMP1232 =
          (0.0);
        
//#line 979
double v1 =
          (X10_TEMP1232);
        
//#line 980
final double X10_TEMP1235 =
          (0.0);
        
//#line 982
double v2 =
          (X10_TEMP1235);
        
//#line 983
final Random X10_TEMP1241 =
          (new Random(
             iseed,
             v1,
             v2));
        
//#line 985
Random randnum =
          (X10_TEMP1241);
        
//#line 986
final double X10_TEMP1244 =
          (0.0);
        
//#line 988
double r =
          (X10_TEMP1244);
        
//#line 989
final int X10_TEMP1247 =
          (0);
        
//#line 991
int k =
          (X10_TEMP1247);
        
//#line 992
final int X10_TEMP1250 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 994
final int X10_TEMP278 =
          (X10_TEMP1250);
        
//#line 995
boolean X10_TEMP282 =
          (k <
             X10_TEMP278);
        
//#line 996
boolean X10_TEMP1255 =
          X10_TEMP282;
        
//#line 997
while (X10_TEMP1255) {
            
//#line 998
final double X10_TEMP1258 =
              (Program0.
                 Program_Random_seed(
                 randnum));
            
//#line 1000
final double X10_TEMP284 =
              (X10_TEMP1258);
            
//#line 1001
final double X10_TEMP1261 =
              (X10_TEMP284);
            
//#line 1003
r =
              ((X10_TEMP1261));
            
//#line 1004
final x10.
              lang.
              GenericReferenceArray X10_TEMP1264 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1006
final x10.
              lang.
              GenericReferenceArray X10_TEMP285 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1264));
            
//#line 1007
final Particle X10_TEMP1268 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP285).get(k))/* } */))/* } */);
            
//#line 1009
final Particle X10_TEMP287 =
              (X10_TEMP1268);
            
//#line 1010
final double X10_TEMP1271 =
              (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.v1);
            
//#line 1012
final double X10_TEMP288 =
              (X10_TEMP1271);
            
//#line 1013
final double X10_TEMP1274 =
              (r *
                 X10_TEMP288);
            
//#line 1015
final double X10_TEMP291 =
              (X10_TEMP1274);
            
//#line 1016
final double X10_TEMP1277 =
              (X10_TEMP291);
            
//#line 1018
final double X10_TEMP292 =
              (X10_TEMP1277);
            
//#line 1019
final double X10_TEMP1280 =
              (X10_TEMP292);
            
//#line 1021
final double X10_TEMP1283 =
              (X10_TEMP1280);
            
//#line 1022
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP287))/* } */.xvelocity =
              ((X10_TEMP1283));
            
//#line 1023
final x10.
              lang.
              GenericReferenceArray X10_TEMP1285 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1025
final x10.
              lang.
              GenericReferenceArray X10_TEMP293 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1285));
            
//#line 1026
final int X10_TEMP1288 =
              (1);
            
//#line 1028
final int X10_TEMP294 =
              (X10_TEMP1288);
            
//#line 1029
final int X10_TEMP1291 =
              (k +
                 X10_TEMP294);
            
//#line 1031
final int X10_TEMP296 =
              (X10_TEMP1291);
            
//#line 1032
final Particle X10_TEMP1295 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP293).get(X10_TEMP296))/* } */))/* } */);
            
//#line 1034
final Particle X10_TEMP297 =
              (X10_TEMP1295);
            
//#line 1035
final double X10_TEMP1298 =
              (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.v2);
            
//#line 1037
final double X10_TEMP298 =
              (X10_TEMP1298);
            
//#line 1038
final double X10_TEMP1301 =
              (r *
                 X10_TEMP298);
            
//#line 1040
final double X10_TEMP301 =
              (X10_TEMP1301);
            
//#line 1041
final double X10_TEMP1304 =
              (X10_TEMP301);
            
//#line 1043
final double X10_TEMP302 =
              (X10_TEMP1304);
            
//#line 1044
final double X10_TEMP1307 =
              (X10_TEMP302);
            
//#line 1046
final double X10_TEMP1310 =
              (X10_TEMP1307);
            
//#line 1047
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP297))/* } */.xvelocity =
              ((X10_TEMP1310));
            
//#line 1048
final int X10_TEMP1312 =
              (2);
            
//#line 1050
final int X10_TEMP304 =
              (X10_TEMP1312);
            
//#line 1051
final int X10_TEMP1315 =
              (k +
                 X10_TEMP304);
            
//#line 1053
k =
              ((X10_TEMP1315));
            
//#line 1054
final int X10_TEMP1318 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
            
//#line 1056
final int X10_TEMP280 =
              (X10_TEMP1318);
            
//#line 1057
final boolean X10_TEMP1321 =
              (k <
                 X10_TEMP280);
            
//#line 1058
X10_TEMP282 =
              ((X10_TEMP1321));
            
//#line 1059
X10_TEMP1255 =
              X10_TEMP282;
        }
        
//#line 1061
final int X10_TEMP1323 =
          (0);
        
//#line 1063
final int X10_TEMP306 =
          (X10_TEMP1323);
        
//#line 1064
final int X10_TEMP1326 =
          (X10_TEMP306);
        
//#line 1066
k =
          ((X10_TEMP1326));
        
//#line 1067
final int X10_TEMP1329 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 1069
final int X10_TEMP307 =
          (X10_TEMP1329);
        
//#line 1070
boolean X10_TEMP311 =
          (k <
             X10_TEMP307);
        
//#line 1071
boolean X10_TEMP1334 =
          X10_TEMP311;
        
//#line 1072
while (X10_TEMP1334) {
            
//#line 1073
final double X10_TEMP1337 =
              (Program0.
                 Program_Random_seed(
                 randnum));
            
//#line 1075
final double X10_TEMP313 =
              (X10_TEMP1337);
            
//#line 1076
final double X10_TEMP1340 =
              (X10_TEMP313);
            
//#line 1078
r =
              ((X10_TEMP1340));
            
//#line 1079
final x10.
              lang.
              GenericReferenceArray X10_TEMP1343 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1081
final x10.
              lang.
              GenericReferenceArray X10_TEMP314 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1343));
            
//#line 1082
final Particle X10_TEMP1347 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP314).get(k))/* } */))/* } */);
            
//#line 1084
final Particle X10_TEMP316 =
              (X10_TEMP1347);
            
//#line 1085
final double X10_TEMP1350 =
              (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.v1);
            
//#line 1087
final double X10_TEMP317 =
              (X10_TEMP1350);
            
//#line 1088
final double X10_TEMP1353 =
              (r *
                 X10_TEMP317);
            
//#line 1090
final double X10_TEMP320 =
              (X10_TEMP1353);
            
//#line 1091
final double X10_TEMP1356 =
              (X10_TEMP320);
            
//#line 1093
final double X10_TEMP321 =
              (X10_TEMP1356);
            
//#line 1094
final double X10_TEMP1359 =
              (X10_TEMP321);
            
//#line 1096
final double X10_TEMP1362 =
              (X10_TEMP1359);
            
//#line 1097
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP316))/* } */.yvelocity =
              ((X10_TEMP1362));
            
//#line 1098
final x10.
              lang.
              GenericReferenceArray X10_TEMP1364 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1100
final x10.
              lang.
              GenericReferenceArray X10_TEMP322 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1364));
            
//#line 1101
final int X10_TEMP1367 =
              (1);
            
//#line 1103
final int X10_TEMP323 =
              (X10_TEMP1367);
            
//#line 1104
final int X10_TEMP1370 =
              (k +
                 X10_TEMP323);
            
//#line 1106
final int X10_TEMP325 =
              (X10_TEMP1370);
            
//#line 1107
final Particle X10_TEMP1374 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP322).get(X10_TEMP325))/* } */))/* } */);
            
//#line 1109
final Particle X10_TEMP326 =
              (X10_TEMP1374);
            
//#line 1110
final double X10_TEMP1377 =
              (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.v2);
            
//#line 1112
final double X10_TEMP327 =
              (X10_TEMP1377);
            
//#line 1113
final double X10_TEMP1380 =
              (r *
                 X10_TEMP327);
            
//#line 1115
final double X10_TEMP330 =
              (X10_TEMP1380);
            
//#line 1116
final double X10_TEMP1383 =
              (X10_TEMP330);
            
//#line 1118
final double X10_TEMP331 =
              (X10_TEMP1383);
            
//#line 1119
final double X10_TEMP1386 =
              (X10_TEMP331);
            
//#line 1121
final double X10_TEMP1389 =
              (X10_TEMP1386);
            
//#line 1122
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP326))/* } */.yvelocity =
              ((X10_TEMP1389));
            
//#line 1123
final int X10_TEMP1391 =
              (2);
            
//#line 1125
final int X10_TEMP333 =
              (X10_TEMP1391);
            
//#line 1126
final int X10_TEMP1394 =
              (k +
                 X10_TEMP333);
            
//#line 1128
k =
              ((X10_TEMP1394));
            
//#line 1129
final int X10_TEMP1397 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
            
//#line 1131
final int X10_TEMP309 =
              (X10_TEMP1397);
            
//#line 1132
final boolean X10_TEMP1400 =
              (k <
                 X10_TEMP309);
            
//#line 1133
X10_TEMP311 =
              ((X10_TEMP1400));
            
//#line 1134
X10_TEMP1334 =
              X10_TEMP311;
        }
        
//#line 1136
final int X10_TEMP1402 =
          (0);
        
//#line 1138
final int X10_TEMP335 =
          (X10_TEMP1402);
        
//#line 1139
final int X10_TEMP1405 =
          (X10_TEMP335);
        
//#line 1141
k =
          ((X10_TEMP1405));
        
//#line 1142
final int X10_TEMP1408 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 1144
final int X10_TEMP336 =
          (X10_TEMP1408);
        
//#line 1145
boolean X10_TEMP340 =
          (k <
             X10_TEMP336);
        
//#line 1146
boolean X10_TEMP1413 =
          X10_TEMP340;
        
//#line 1147
while (X10_TEMP1413) {
            
//#line 1148
final double X10_TEMP1416 =
              (Program0.
                 Program_Random_seed(
                 randnum));
            
//#line 1150
final double X10_TEMP342 =
              (X10_TEMP1416);
            
//#line 1151
final double X10_TEMP1419 =
              (X10_TEMP342);
            
//#line 1153
r =
              ((X10_TEMP1419));
            
//#line 1154
final x10.
              lang.
              GenericReferenceArray X10_TEMP1422 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1156
final x10.
              lang.
              GenericReferenceArray X10_TEMP343 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1422));
            
//#line 1157
final Particle X10_TEMP1426 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP343).get(k))/* } */))/* } */);
            
//#line 1159
final Particle X10_TEMP345 =
              (X10_TEMP1426);
            
//#line 1160
final double X10_TEMP1429 =
              (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.v1);
            
//#line 1162
final double X10_TEMP346 =
              (X10_TEMP1429);
            
//#line 1163
final double X10_TEMP1432 =
              (r *
                 X10_TEMP346);
            
//#line 1165
final double X10_TEMP349 =
              (X10_TEMP1432);
            
//#line 1166
final double X10_TEMP1435 =
              (X10_TEMP349);
            
//#line 1168
final double X10_TEMP350 =
              (X10_TEMP1435);
            
//#line 1169
final double X10_TEMP1438 =
              (X10_TEMP350);
            
//#line 1171
final double X10_TEMP1441 =
              (X10_TEMP1438);
            
//#line 1172
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP345))/* } */.zvelocity =
              ((X10_TEMP1441));
            
//#line 1173
final x10.
              lang.
              GenericReferenceArray X10_TEMP1443 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1175
final x10.
              lang.
              GenericReferenceArray X10_TEMP351 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1443));
            
//#line 1176
final int X10_TEMP1446 =
              (1);
            
//#line 1178
final int X10_TEMP352 =
              (X10_TEMP1446);
            
//#line 1179
final int X10_TEMP1449 =
              (k +
                 X10_TEMP352);
            
//#line 1181
final int X10_TEMP354 =
              (X10_TEMP1449);
            
//#line 1182
final Particle X10_TEMP1453 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP351).get(X10_TEMP354))/* } */))/* } */);
            
//#line 1184
final Particle X10_TEMP355 =
              (X10_TEMP1453);
            
//#line 1185
final double X10_TEMP1456 =
              (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.v2);
            
//#line 1187
final double X10_TEMP356 =
              (X10_TEMP1456);
            
//#line 1188
final double X10_TEMP1459 =
              (r *
                 X10_TEMP356);
            
//#line 1190
final double X10_TEMP359 =
              (X10_TEMP1459);
            
//#line 1191
final double X10_TEMP1462 =
              (X10_TEMP359);
            
//#line 1193
final double X10_TEMP360 =
              (X10_TEMP1462);
            
//#line 1194
final double X10_TEMP1465 =
              (X10_TEMP360);
            
//#line 1196
final double X10_TEMP1468 =
              (X10_TEMP1465);
            
//#line 1197
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP355))/* } */.zvelocity =
              ((X10_TEMP1468));
            
//#line 1198
final int X10_TEMP1470 =
              (2);
            
//#line 1200
final int X10_TEMP362 =
              (X10_TEMP1470);
            
//#line 1201
final int X10_TEMP1473 =
              (k +
                 X10_TEMP362);
            
//#line 1203
k =
              ((X10_TEMP1473));
            
//#line 1204
final int X10_TEMP1476 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
            
//#line 1206
final int X10_TEMP338 =
              (X10_TEMP1476);
            
//#line 1207
final boolean X10_TEMP1479 =
              (k <
                 X10_TEMP338);
            
//#line 1208
X10_TEMP340 =
              ((X10_TEMP1479));
            
//#line 1209
X10_TEMP1413 =
              X10_TEMP340;
        }
        
//#line 1211
final double X10_TEMP1481 =
          (0.0);
        
//#line 1213
final double X10_TEMP365 =
          (X10_TEMP1481);
        
//#line 1214
final double X10_TEMP1484 =
          (X10_TEMP365);
        
//#line 1216
final double X10_TEMP366 =
          (X10_TEMP1484);
        
//#line 1217
final double X10_TEMP1487 =
          (X10_TEMP366);
        
//#line 1219
final double X10_TEMP1490 =
          (X10_TEMP1487);
        
//#line 1220
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin =
          ((X10_TEMP1490));
        
//#line 1221
final double X10_TEMP1492 =
          (0.0);
        
//#line 1223
double sp =
          (X10_TEMP1492);
        
//#line 1224
final int X10_TEMP1495 =
          (0);
        
//#line 1226
final int X10_TEMP372 =
          (X10_TEMP1495);
        
//#line 1227
final int X10_TEMP1498 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 1229
final int X10_TEMP369 =
          (X10_TEMP1498);
        
//#line 1230
final int X10_TEMP1501 =
          (1);
        
//#line 1232
final int X10_TEMP370 =
          (X10_TEMP1501);
        
//#line 1233
final int X10_TEMP1504 =
          (X10_TEMP369 -
             X10_TEMP370);
        
//#line 1235
final int X10_TEMP373 =
          (X10_TEMP1504);
        
//#line 1236
final x10.
          lang.
          region X10_TEMP1509 =
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
                  X10_TEMP372,
                  X10_TEMP373))));
        
//#line 1238
final x10.
          lang.
          region X10_TEMP375 =
          (x10.
            lang.
            region)
            ((X10_TEMP1509));
        
//#line 1239
/* template:forloop-mult { */{
        x10.lang.region __var150__ = (x10.lang.region) X10_TEMP375;
        if (__var150__.size() > 0 && (__var150__ instanceof x10.array.MultiDimRegion || __var150__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var151__ = __var150__.rank(0).low(), __var152__ = __var150__.rank(0).high(); __var151__ <= __var152__; __var151__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var151__;
        /* } */
        /* } */
{
            
//#line 1240
final x10.
              lang.
              GenericReferenceArray X10_TEMP1513 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1242
final x10.
              lang.
              GenericReferenceArray X10_TEMP376 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1513));
            
//#line 1243
final Particle X10_TEMP1517 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP376).get(i))/* } */))/* } */);
            
//#line 1245
final Particle X10_TEMP378 =
              (X10_TEMP1517);
            
//#line 1246
final double X10_TEMP1520 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP378))/* } */.xvelocity);
            
//#line 1248
final double X10_TEMP379 =
              (X10_TEMP1520);
            
//#line 1249
final double X10_TEMP1523 =
              (sp +
                 X10_TEMP379);
            
//#line 1251
final double X10_TEMP381 =
              (X10_TEMP1523);
            
//#line 1252
final double X10_TEMP1526 =
              (X10_TEMP381);
            
//#line 1254
sp =
              ((X10_TEMP1526));
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var9____ = (__var150__).iterator(); __var9____.hasNext(); ) {
        	final  x10.
          lang.
          point __var9__ = (x10.
          lang.
          point) __var9____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var9__).get(0))/* } */;/* } */
{
            
//#line 1240
final x10.
              lang.
              GenericReferenceArray X10_TEMP1513 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1242
final x10.
              lang.
              GenericReferenceArray X10_TEMP376 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1513));
            
//#line 1243
final Particle X10_TEMP1517 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP376).get(i))/* } */))/* } */);
            
//#line 1245
final Particle X10_TEMP378 =
              (X10_TEMP1517);
            
//#line 1246
final double X10_TEMP1520 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP378))/* } */.xvelocity);
            
//#line 1248
final double X10_TEMP379 =
              (X10_TEMP1520);
            
//#line 1249
final double X10_TEMP1523 =
              (sp +
                 X10_TEMP379);
            
//#line 1251
final double X10_TEMP381 =
              (X10_TEMP1523);
            
//#line 1252
final double X10_TEMP1526 =
              (X10_TEMP381);
            
//#line 1254
sp =
              ((X10_TEMP1526));
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 1256
final int X10_TEMP1529 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 1258
final int X10_TEMP382 =
          (X10_TEMP1529);
        
//#line 1259
final double X10_TEMP1532 =
          (sp /
             X10_TEMP382);
        
//#line 1261
final double X10_TEMP384 =
          (X10_TEMP1532);
        
//#line 1262
final double X10_TEMP1535 =
          (X10_TEMP384);
        
//#line 1264
sp =
          ((X10_TEMP1535));
        
//#line 1265
final int X10_TEMP1538 =
          (0);
        
//#line 1267
final int X10_TEMP389 =
          (X10_TEMP1538);
        
//#line 1268
final int X10_TEMP1541 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 1270
final int X10_TEMP386 =
          (X10_TEMP1541);
        
//#line 1271
final int X10_TEMP1544 =
          (1);
        
//#line 1273
final int X10_TEMP387 =
          (X10_TEMP1544);
        
//#line 1274
final int X10_TEMP1547 =
          (X10_TEMP386 -
             X10_TEMP387);
        
//#line 1276
final int X10_TEMP390 =
          (X10_TEMP1547);
        
//#line 1277
final x10.
          lang.
          region X10_TEMP1552 =
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
                  X10_TEMP389,
                  X10_TEMP390))));
        
//#line 1279
final x10.
          lang.
          region X10_TEMP392 =
          (x10.
            lang.
            region)
            ((X10_TEMP1552));
        
//#line 1280
/* template:forloop-mult { */{
        x10.lang.region __var153__ = (x10.lang.region) X10_TEMP392;
        if (__var153__.size() > 0 && (__var153__ instanceof x10.array.MultiDimRegion || __var153__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var154__ = __var153__.rank(0).low(), __var155__ = __var153__.rank(0).high(); __var154__ <= __var155__; __var154__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var154__;
        /* } */
        /* } */
{
            
//#line 1281
final x10.
              lang.
              GenericReferenceArray X10_TEMP1556 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1283
final x10.
              lang.
              GenericReferenceArray X10_TEMP393 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1556));
            
//#line 1284
final Particle X10_TEMP1560 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP393).get(i))/* } */))/* } */);
            
//#line 1286
final Particle X10_TEMP395 =
              (X10_TEMP1560);
            
//#line 1287
final x10.
              lang.
              GenericReferenceArray X10_TEMP1563 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1289
final x10.
              lang.
              GenericReferenceArray X10_TEMP396 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1563));
            
//#line 1290
final Particle X10_TEMP1567 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP396).get(i))/* } */))/* } */);
            
//#line 1292
final Particle X10_TEMP398 =
              (X10_TEMP1567);
            
//#line 1293
final double X10_TEMP1570 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP398))/* } */.xvelocity);
            
//#line 1295
final double X10_TEMP399 =
              (X10_TEMP1570);
            
//#line 1296
final double X10_TEMP1573 =
              (X10_TEMP399 -
                 sp);
            
//#line 1298
final double X10_TEMP402 =
              (X10_TEMP1573);
            
//#line 1299
final double X10_TEMP1576 =
              (X10_TEMP402);
            
//#line 1301
final double X10_TEMP403 =
              (X10_TEMP1576);
            
//#line 1302
final double X10_TEMP1579 =
              (X10_TEMP403);
            
//#line 1304
final double X10_TEMP1582 =
              (X10_TEMP1579);
            
//#line 1305
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP395))/* } */.xvelocity =
              ((X10_TEMP1582));
            
//#line 1306
final double X10_TEMP1584 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin);
            
//#line 1308
final double X10_TEMP412 =
              (X10_TEMP1584);
            
//#line 1309
final x10.
              lang.
              GenericReferenceArray X10_TEMP1587 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1311
final x10.
              lang.
              GenericReferenceArray X10_TEMP404 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1587));
            
//#line 1312
final Particle X10_TEMP1591 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP404).get(i))/* } */))/* } */);
            
//#line 1314
final Particle X10_TEMP406 =
              (X10_TEMP1591);
            
//#line 1315
final double X10_TEMP1594 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP406))/* } */.xvelocity);
            
//#line 1317
final double X10_TEMP410 =
              (X10_TEMP1594);
            
//#line 1318
final x10.
              lang.
              GenericReferenceArray X10_TEMP1597 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1320
final x10.
              lang.
              GenericReferenceArray X10_TEMP407 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1597));
            
//#line 1321
final Particle X10_TEMP1601 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP407).get(i))/* } */))/* } */);
            
//#line 1323
final Particle X10_TEMP409 =
              (X10_TEMP1601);
            
//#line 1324
final double X10_TEMP1604 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP409))/* } */.xvelocity);
            
//#line 1326
final double X10_TEMP411 =
              (X10_TEMP1604);
            
//#line 1327
final double X10_TEMP1607 =
              (X10_TEMP410 *
                 X10_TEMP411);
            
//#line 1329
final double X10_TEMP413 =
              (X10_TEMP1607);
            
//#line 1330
final double X10_TEMP1610 =
              (X10_TEMP412 +
                 X10_TEMP413);
            
//#line 1332
final double X10_TEMP416 =
              (X10_TEMP1610);
            
//#line 1333
final double X10_TEMP1613 =
              (X10_TEMP416);
            
//#line 1335
final double X10_TEMP417 =
              (X10_TEMP1613);
            
//#line 1336
final double X10_TEMP1616 =
              (X10_TEMP417);
            
//#line 1338
final double X10_TEMP1619 =
              (X10_TEMP1616);
            
//#line 1339
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin =
              ((X10_TEMP1619));
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var10____ = (__var153__).iterator(); __var10____.hasNext(); ) {
        	final  x10.
          lang.
          point __var10__ = (x10.
          lang.
          point) __var10____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var10__).get(0))/* } */;/* } */
{
            
//#line 1281
final x10.
              lang.
              GenericReferenceArray X10_TEMP1556 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1283
final x10.
              lang.
              GenericReferenceArray X10_TEMP393 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1556));
            
//#line 1284
final Particle X10_TEMP1560 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP393).get(i))/* } */))/* } */);
            
//#line 1286
final Particle X10_TEMP395 =
              (X10_TEMP1560);
            
//#line 1287
final x10.
              lang.
              GenericReferenceArray X10_TEMP1563 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1289
final x10.
              lang.
              GenericReferenceArray X10_TEMP396 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1563));
            
//#line 1290
final Particle X10_TEMP1567 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP396).get(i))/* } */))/* } */);
            
//#line 1292
final Particle X10_TEMP398 =
              (X10_TEMP1567);
            
//#line 1293
final double X10_TEMP1570 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP398))/* } */.xvelocity);
            
//#line 1295
final double X10_TEMP399 =
              (X10_TEMP1570);
            
//#line 1296
final double X10_TEMP1573 =
              (X10_TEMP399 -
                 sp);
            
//#line 1298
final double X10_TEMP402 =
              (X10_TEMP1573);
            
//#line 1299
final double X10_TEMP1576 =
              (X10_TEMP402);
            
//#line 1301
final double X10_TEMP403 =
              (X10_TEMP1576);
            
//#line 1302
final double X10_TEMP1579 =
              (X10_TEMP403);
            
//#line 1304
final double X10_TEMP1582 =
              (X10_TEMP1579);
            
//#line 1305
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP395))/* } */.xvelocity =
              ((X10_TEMP1582));
            
//#line 1306
final double X10_TEMP1584 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin);
            
//#line 1308
final double X10_TEMP412 =
              (X10_TEMP1584);
            
//#line 1309
final x10.
              lang.
              GenericReferenceArray X10_TEMP1587 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1311
final x10.
              lang.
              GenericReferenceArray X10_TEMP404 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1587));
            
//#line 1312
final Particle X10_TEMP1591 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP404).get(i))/* } */))/* } */);
            
//#line 1314
final Particle X10_TEMP406 =
              (X10_TEMP1591);
            
//#line 1315
final double X10_TEMP1594 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP406))/* } */.xvelocity);
            
//#line 1317
final double X10_TEMP410 =
              (X10_TEMP1594);
            
//#line 1318
final x10.
              lang.
              GenericReferenceArray X10_TEMP1597 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1320
final x10.
              lang.
              GenericReferenceArray X10_TEMP407 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1597));
            
//#line 1321
final Particle X10_TEMP1601 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP407).get(i))/* } */))/* } */);
            
//#line 1323
final Particle X10_TEMP409 =
              (X10_TEMP1601);
            
//#line 1324
final double X10_TEMP1604 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP409))/* } */.xvelocity);
            
//#line 1326
final double X10_TEMP411 =
              (X10_TEMP1604);
            
//#line 1327
final double X10_TEMP1607 =
              (X10_TEMP410 *
                 X10_TEMP411);
            
//#line 1329
final double X10_TEMP413 =
              (X10_TEMP1607);
            
//#line 1330
final double X10_TEMP1610 =
              (X10_TEMP412 +
                 X10_TEMP413);
            
//#line 1332
final double X10_TEMP416 =
              (X10_TEMP1610);
            
//#line 1333
final double X10_TEMP1613 =
              (X10_TEMP416);
            
//#line 1335
final double X10_TEMP417 =
              (X10_TEMP1613);
            
//#line 1336
final double X10_TEMP1616 =
              (X10_TEMP417);
            
//#line 1338
final double X10_TEMP1619 =
              (X10_TEMP1616);
            
//#line 1339
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin =
              ((X10_TEMP1619));
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 1341
final double X10_TEMP1621 =
          (0.0);
        
//#line 1343
final double X10_TEMP419 =
          (X10_TEMP1621);
        
//#line 1344
final double X10_TEMP1624 =
          (X10_TEMP419);
        
//#line 1346
sp =
          ((X10_TEMP1624));
        
//#line 1347
final int X10_TEMP1627 =
          (0);
        
//#line 1349
final int X10_TEMP424 =
          (X10_TEMP1627);
        
//#line 1350
final int X10_TEMP1630 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 1352
final int X10_TEMP421 =
          (X10_TEMP1630);
        
//#line 1353
final int X10_TEMP1633 =
          (1);
        
//#line 1355
final int X10_TEMP422 =
          (X10_TEMP1633);
        
//#line 1356
final int X10_TEMP1636 =
          (X10_TEMP421 -
             X10_TEMP422);
        
//#line 1358
final int X10_TEMP425 =
          (X10_TEMP1636);
        
//#line 1359
final x10.
          lang.
          region X10_TEMP1641 =
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
                  X10_TEMP424,
                  X10_TEMP425))));
        
//#line 1361
final x10.
          lang.
          region X10_TEMP427 =
          (x10.
            lang.
            region)
            ((X10_TEMP1641));
        
//#line 1362
/* template:forloop-mult { */{
        x10.lang.region __var156__ = (x10.lang.region) X10_TEMP427;
        if (__var156__.size() > 0 && (__var156__ instanceof x10.array.MultiDimRegion || __var156__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var157__ = __var156__.rank(0).low(), __var158__ = __var156__.rank(0).high(); __var157__ <= __var158__; __var157__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var157__;
        /* } */
        /* } */
{
            
//#line 1363
final x10.
              lang.
              GenericReferenceArray X10_TEMP1645 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1365
final x10.
              lang.
              GenericReferenceArray X10_TEMP428 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1645));
            
//#line 1366
final Particle X10_TEMP1649 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP428).get(i))/* } */))/* } */);
            
//#line 1368
final Particle X10_TEMP430 =
              (X10_TEMP1649);
            
//#line 1369
final double X10_TEMP1652 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP430))/* } */.yvelocity);
            
//#line 1371
final double X10_TEMP431 =
              (X10_TEMP1652);
            
//#line 1372
final double X10_TEMP1655 =
              (sp +
                 X10_TEMP431);
            
//#line 1374
final double X10_TEMP433 =
              (X10_TEMP1655);
            
//#line 1375
final double X10_TEMP1658 =
              (X10_TEMP433);
            
//#line 1377
sp =
              ((X10_TEMP1658));
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var11____ = (__var156__).iterator(); __var11____.hasNext(); ) {
        	final  x10.
          lang.
          point __var11__ = (x10.
          lang.
          point) __var11____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var11__).get(0))/* } */;/* } */
{
            
//#line 1363
final x10.
              lang.
              GenericReferenceArray X10_TEMP1645 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1365
final x10.
              lang.
              GenericReferenceArray X10_TEMP428 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1645));
            
//#line 1366
final Particle X10_TEMP1649 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP428).get(i))/* } */))/* } */);
            
//#line 1368
final Particle X10_TEMP430 =
              (X10_TEMP1649);
            
//#line 1369
final double X10_TEMP1652 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP430))/* } */.yvelocity);
            
//#line 1371
final double X10_TEMP431 =
              (X10_TEMP1652);
            
//#line 1372
final double X10_TEMP1655 =
              (sp +
                 X10_TEMP431);
            
//#line 1374
final double X10_TEMP433 =
              (X10_TEMP1655);
            
//#line 1375
final double X10_TEMP1658 =
              (X10_TEMP433);
            
//#line 1377
sp =
              ((X10_TEMP1658));
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 1379
final int X10_TEMP1661 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 1381
final int X10_TEMP434 =
          (X10_TEMP1661);
        
//#line 1382
final double X10_TEMP1664 =
          (sp /
             X10_TEMP434);
        
//#line 1384
final double X10_TEMP436 =
          (X10_TEMP1664);
        
//#line 1385
final double X10_TEMP1667 =
          (X10_TEMP436);
        
//#line 1387
sp =
          ((X10_TEMP1667));
        
//#line 1388
final int X10_TEMP1670 =
          (0);
        
//#line 1390
final int X10_TEMP441 =
          (X10_TEMP1670);
        
//#line 1391
final int X10_TEMP1673 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 1393
final int X10_TEMP438 =
          (X10_TEMP1673);
        
//#line 1394
final int X10_TEMP1676 =
          (1);
        
//#line 1396
final int X10_TEMP439 =
          (X10_TEMP1676);
        
//#line 1397
final int X10_TEMP1679 =
          (X10_TEMP438 -
             X10_TEMP439);
        
//#line 1399
final int X10_TEMP442 =
          (X10_TEMP1679);
        
//#line 1400
final x10.
          lang.
          region X10_TEMP1684 =
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
                  X10_TEMP441,
                  X10_TEMP442))));
        
//#line 1402
final x10.
          lang.
          region X10_TEMP444 =
          (x10.
            lang.
            region)
            ((X10_TEMP1684));
        
//#line 1403
/* template:forloop-mult { */{
        x10.lang.region __var159__ = (x10.lang.region) X10_TEMP444;
        if (__var159__.size() > 0 && (__var159__ instanceof x10.array.MultiDimRegion || __var159__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var160__ = __var159__.rank(0).low(), __var161__ = __var159__.rank(0).high(); __var160__ <= __var161__; __var160__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var160__;
        /* } */
        /* } */
{
            
//#line 1404
final x10.
              lang.
              GenericReferenceArray X10_TEMP1688 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1406
final x10.
              lang.
              GenericReferenceArray X10_TEMP445 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1688));
            
//#line 1407
final Particle X10_TEMP1692 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP445).get(i))/* } */))/* } */);
            
//#line 1409
final Particle X10_TEMP447 =
              (X10_TEMP1692);
            
//#line 1410
final x10.
              lang.
              GenericReferenceArray X10_TEMP1695 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1412
final x10.
              lang.
              GenericReferenceArray X10_TEMP448 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1695));
            
//#line 1413
final Particle X10_TEMP1699 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP448).get(i))/* } */))/* } */);
            
//#line 1415
final Particle X10_TEMP450 =
              (X10_TEMP1699);
            
//#line 1416
final double X10_TEMP1702 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP450))/* } */.yvelocity);
            
//#line 1418
final double X10_TEMP451 =
              (X10_TEMP1702);
            
//#line 1419
final double X10_TEMP1705 =
              (X10_TEMP451 -
                 sp);
            
//#line 1421
final double X10_TEMP454 =
              (X10_TEMP1705);
            
//#line 1422
final double X10_TEMP1708 =
              (X10_TEMP454);
            
//#line 1424
final double X10_TEMP455 =
              (X10_TEMP1708);
            
//#line 1425
final double X10_TEMP1711 =
              (X10_TEMP455);
            
//#line 1427
final double X10_TEMP1714 =
              (X10_TEMP1711);
            
//#line 1428
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP447))/* } */.yvelocity =
              ((X10_TEMP1714));
            
//#line 1429
final double X10_TEMP1716 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin);
            
//#line 1431
final double X10_TEMP464 =
              (X10_TEMP1716);
            
//#line 1432
final x10.
              lang.
              GenericReferenceArray X10_TEMP1719 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1434
final x10.
              lang.
              GenericReferenceArray X10_TEMP456 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1719));
            
//#line 1435
final Particle X10_TEMP1723 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP456).get(i))/* } */))/* } */);
            
//#line 1437
final Particle X10_TEMP458 =
              (X10_TEMP1723);
            
//#line 1438
final double X10_TEMP1726 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP458))/* } */.yvelocity);
            
//#line 1440
final double X10_TEMP462 =
              (X10_TEMP1726);
            
//#line 1441
final x10.
              lang.
              GenericReferenceArray X10_TEMP1729 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1443
final x10.
              lang.
              GenericReferenceArray X10_TEMP459 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1729));
            
//#line 1444
final Particle X10_TEMP1733 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP459).get(i))/* } */))/* } */);
            
//#line 1446
final Particle X10_TEMP461 =
              (X10_TEMP1733);
            
//#line 1447
final double X10_TEMP1736 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP461))/* } */.yvelocity);
            
//#line 1449
final double X10_TEMP463 =
              (X10_TEMP1736);
            
//#line 1450
final double X10_TEMP1739 =
              (X10_TEMP462 *
                 X10_TEMP463);
            
//#line 1452
final double X10_TEMP465 =
              (X10_TEMP1739);
            
//#line 1453
final double X10_TEMP1742 =
              (X10_TEMP464 +
                 X10_TEMP465);
            
//#line 1455
final double X10_TEMP468 =
              (X10_TEMP1742);
            
//#line 1456
final double X10_TEMP1745 =
              (X10_TEMP468);
            
//#line 1458
final double X10_TEMP469 =
              (X10_TEMP1745);
            
//#line 1459
final double X10_TEMP1748 =
              (X10_TEMP469);
            
//#line 1461
final double X10_TEMP1751 =
              (X10_TEMP1748);
            
//#line 1462
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin =
              ((X10_TEMP1751));
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var12____ = (__var159__).iterator(); __var12____.hasNext(); ) {
        	final  x10.
          lang.
          point __var12__ = (x10.
          lang.
          point) __var12____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var12__).get(0))/* } */;/* } */
{
            
//#line 1404
final x10.
              lang.
              GenericReferenceArray X10_TEMP1688 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1406
final x10.
              lang.
              GenericReferenceArray X10_TEMP445 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1688));
            
//#line 1407
final Particle X10_TEMP1692 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP445).get(i))/* } */))/* } */);
            
//#line 1409
final Particle X10_TEMP447 =
              (X10_TEMP1692);
            
//#line 1410
final x10.
              lang.
              GenericReferenceArray X10_TEMP1695 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1412
final x10.
              lang.
              GenericReferenceArray X10_TEMP448 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1695));
            
//#line 1413
final Particle X10_TEMP1699 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP448).get(i))/* } */))/* } */);
            
//#line 1415
final Particle X10_TEMP450 =
              (X10_TEMP1699);
            
//#line 1416
final double X10_TEMP1702 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP450))/* } */.yvelocity);
            
//#line 1418
final double X10_TEMP451 =
              (X10_TEMP1702);
            
//#line 1419
final double X10_TEMP1705 =
              (X10_TEMP451 -
                 sp);
            
//#line 1421
final double X10_TEMP454 =
              (X10_TEMP1705);
            
//#line 1422
final double X10_TEMP1708 =
              (X10_TEMP454);
            
//#line 1424
final double X10_TEMP455 =
              (X10_TEMP1708);
            
//#line 1425
final double X10_TEMP1711 =
              (X10_TEMP455);
            
//#line 1427
final double X10_TEMP1714 =
              (X10_TEMP1711);
            
//#line 1428
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP447))/* } */.yvelocity =
              ((X10_TEMP1714));
            
//#line 1429
final double X10_TEMP1716 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin);
            
//#line 1431
final double X10_TEMP464 =
              (X10_TEMP1716);
            
//#line 1432
final x10.
              lang.
              GenericReferenceArray X10_TEMP1719 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1434
final x10.
              lang.
              GenericReferenceArray X10_TEMP456 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1719));
            
//#line 1435
final Particle X10_TEMP1723 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP456).get(i))/* } */))/* } */);
            
//#line 1437
final Particle X10_TEMP458 =
              (X10_TEMP1723);
            
//#line 1438
final double X10_TEMP1726 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP458))/* } */.yvelocity);
            
//#line 1440
final double X10_TEMP462 =
              (X10_TEMP1726);
            
//#line 1441
final x10.
              lang.
              GenericReferenceArray X10_TEMP1729 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1443
final x10.
              lang.
              GenericReferenceArray X10_TEMP459 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1729));
            
//#line 1444
final Particle X10_TEMP1733 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP459).get(i))/* } */))/* } */);
            
//#line 1446
final Particle X10_TEMP461 =
              (X10_TEMP1733);
            
//#line 1447
final double X10_TEMP1736 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP461))/* } */.yvelocity);
            
//#line 1449
final double X10_TEMP463 =
              (X10_TEMP1736);
            
//#line 1450
final double X10_TEMP1739 =
              (X10_TEMP462 *
                 X10_TEMP463);
            
//#line 1452
final double X10_TEMP465 =
              (X10_TEMP1739);
            
//#line 1453
final double X10_TEMP1742 =
              (X10_TEMP464 +
                 X10_TEMP465);
            
//#line 1455
final double X10_TEMP468 =
              (X10_TEMP1742);
            
//#line 1456
final double X10_TEMP1745 =
              (X10_TEMP468);
            
//#line 1458
final double X10_TEMP469 =
              (X10_TEMP1745);
            
//#line 1459
final double X10_TEMP1748 =
              (X10_TEMP469);
            
//#line 1461
final double X10_TEMP1751 =
              (X10_TEMP1748);
            
//#line 1462
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin =
              ((X10_TEMP1751));
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 1464
final double X10_TEMP1753 =
          (0.0);
        
//#line 1466
final double X10_TEMP471 =
          (X10_TEMP1753);
        
//#line 1467
final double X10_TEMP1756 =
          (X10_TEMP471);
        
//#line 1469
sp =
          ((X10_TEMP1756));
        
//#line 1470
final int X10_TEMP1759 =
          (0);
        
//#line 1472
final int X10_TEMP476 =
          (X10_TEMP1759);
        
//#line 1473
final int X10_TEMP1762 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 1475
final int X10_TEMP473 =
          (X10_TEMP1762);
        
//#line 1476
final int X10_TEMP1765 =
          (1);
        
//#line 1478
final int X10_TEMP474 =
          (X10_TEMP1765);
        
//#line 1479
final int X10_TEMP1768 =
          (X10_TEMP473 -
             X10_TEMP474);
        
//#line 1481
final int X10_TEMP477 =
          (X10_TEMP1768);
        
//#line 1482
final x10.
          lang.
          region X10_TEMP1773 =
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
                  X10_TEMP476,
                  X10_TEMP477))));
        
//#line 1484
final x10.
          lang.
          region X10_TEMP479 =
          (x10.
            lang.
            region)
            ((X10_TEMP1773));
        
//#line 1485
/* template:forloop-mult { */{
        x10.lang.region __var162__ = (x10.lang.region) X10_TEMP479;
        if (__var162__.size() > 0 && (__var162__ instanceof x10.array.MultiDimRegion || __var162__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var163__ = __var162__.rank(0).low(), __var164__ = __var162__.rank(0).high(); __var163__ <= __var164__; __var163__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var163__;
        /* } */
        /* } */
{
            
//#line 1486
final x10.
              lang.
              GenericReferenceArray X10_TEMP1777 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1488
final x10.
              lang.
              GenericReferenceArray X10_TEMP480 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1777));
            
//#line 1489
final Particle X10_TEMP1781 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP480).get(i))/* } */))/* } */);
            
//#line 1491
final Particle X10_TEMP482 =
              (X10_TEMP1781);
            
//#line 1492
final double X10_TEMP1784 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP482))/* } */.zvelocity);
            
//#line 1494
final double X10_TEMP483 =
              (X10_TEMP1784);
            
//#line 1495
final double X10_TEMP1787 =
              (sp +
                 X10_TEMP483);
            
//#line 1497
final double X10_TEMP485 =
              (X10_TEMP1787);
            
//#line 1498
final double X10_TEMP1790 =
              (X10_TEMP485);
            
//#line 1500
sp =
              ((X10_TEMP1790));
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var13____ = (__var162__).iterator(); __var13____.hasNext(); ) {
        	final  x10.
          lang.
          point __var13__ = (x10.
          lang.
          point) __var13____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var13__).get(0))/* } */;/* } */
{
            
//#line 1486
final x10.
              lang.
              GenericReferenceArray X10_TEMP1777 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1488
final x10.
              lang.
              GenericReferenceArray X10_TEMP480 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1777));
            
//#line 1489
final Particle X10_TEMP1781 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP480).get(i))/* } */))/* } */);
            
//#line 1491
final Particle X10_TEMP482 =
              (X10_TEMP1781);
            
//#line 1492
final double X10_TEMP1784 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP482))/* } */.zvelocity);
            
//#line 1494
final double X10_TEMP483 =
              (X10_TEMP1784);
            
//#line 1495
final double X10_TEMP1787 =
              (sp +
                 X10_TEMP483);
            
//#line 1497
final double X10_TEMP485 =
              (X10_TEMP1787);
            
//#line 1498
final double X10_TEMP1790 =
              (X10_TEMP485);
            
//#line 1500
sp =
              ((X10_TEMP1790));
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 1502
final int X10_TEMP1793 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 1504
final int X10_TEMP486 =
          (X10_TEMP1793);
        
//#line 1505
final double X10_TEMP1796 =
          (sp /
             X10_TEMP486);
        
//#line 1507
final double X10_TEMP488 =
          (X10_TEMP1796);
        
//#line 1508
final double X10_TEMP1799 =
          (X10_TEMP488);
        
//#line 1510
sp =
          ((X10_TEMP1799));
        
//#line 1511
final int X10_TEMP1802 =
          (0);
        
//#line 1513
final int X10_TEMP493 =
          (X10_TEMP1802);
        
//#line 1514
final int X10_TEMP1805 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 1516
final int X10_TEMP490 =
          (X10_TEMP1805);
        
//#line 1517
final int X10_TEMP1808 =
          (1);
        
//#line 1519
final int X10_TEMP491 =
          (X10_TEMP1808);
        
//#line 1520
final int X10_TEMP1811 =
          (X10_TEMP490 -
             X10_TEMP491);
        
//#line 1522
final int X10_TEMP494 =
          (X10_TEMP1811);
        
//#line 1523
final x10.
          lang.
          region X10_TEMP1816 =
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
                  X10_TEMP493,
                  X10_TEMP494))));
        
//#line 1525
final x10.
          lang.
          region X10_TEMP496 =
          (x10.
            lang.
            region)
            ((X10_TEMP1816));
        
//#line 1526
/* template:forloop-mult { */{
        x10.lang.region __var165__ = (x10.lang.region) X10_TEMP496;
        if (__var165__.size() > 0 && (__var165__ instanceof x10.array.MultiDimRegion || __var165__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var166__ = __var165__.rank(0).low(), __var167__ = __var165__.rank(0).high(); __var166__ <= __var167__; __var166__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var166__;
        /* } */
        /* } */
{
            
//#line 1527
final x10.
              lang.
              GenericReferenceArray X10_TEMP1820 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1529
final x10.
              lang.
              GenericReferenceArray X10_TEMP497 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1820));
            
//#line 1530
final Particle X10_TEMP1824 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP497).get(i))/* } */))/* } */);
            
//#line 1532
final Particle X10_TEMP499 =
              (X10_TEMP1824);
            
//#line 1533
final x10.
              lang.
              GenericReferenceArray X10_TEMP1827 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1535
final x10.
              lang.
              GenericReferenceArray X10_TEMP500 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1827));
            
//#line 1536
final Particle X10_TEMP1831 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP500).get(i))/* } */))/* } */);
            
//#line 1538
final Particle X10_TEMP502 =
              (X10_TEMP1831);
            
//#line 1539
final double X10_TEMP1834 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP502))/* } */.zvelocity);
            
//#line 1541
final double X10_TEMP503 =
              (X10_TEMP1834);
            
//#line 1542
final double X10_TEMP1837 =
              (X10_TEMP503 -
                 sp);
            
//#line 1544
final double X10_TEMP506 =
              (X10_TEMP1837);
            
//#line 1545
final double X10_TEMP1840 =
              (X10_TEMP506);
            
//#line 1547
final double X10_TEMP507 =
              (X10_TEMP1840);
            
//#line 1548
final double X10_TEMP1843 =
              (X10_TEMP507);
            
//#line 1550
final double X10_TEMP1846 =
              (X10_TEMP1843);
            
//#line 1551
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP499))/* } */.zvelocity =
              ((X10_TEMP1846));
            
//#line 1552
final double X10_TEMP1848 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin);
            
//#line 1554
final double X10_TEMP516 =
              (X10_TEMP1848);
            
//#line 1555
final x10.
              lang.
              GenericReferenceArray X10_TEMP1851 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1557
final x10.
              lang.
              GenericReferenceArray X10_TEMP508 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1851));
            
//#line 1558
final Particle X10_TEMP1855 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP508).get(i))/* } */))/* } */);
            
//#line 1560
final Particle X10_TEMP510 =
              (X10_TEMP1855);
            
//#line 1561
final double X10_TEMP1858 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP510))/* } */.zvelocity);
            
//#line 1563
final double X10_TEMP514 =
              (X10_TEMP1858);
            
//#line 1564
final x10.
              lang.
              GenericReferenceArray X10_TEMP1861 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1566
final x10.
              lang.
              GenericReferenceArray X10_TEMP511 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1861));
            
//#line 1567
final Particle X10_TEMP1865 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP511).get(i))/* } */))/* } */);
            
//#line 1569
final Particle X10_TEMP513 =
              (X10_TEMP1865);
            
//#line 1570
final double X10_TEMP1868 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP513))/* } */.zvelocity);
            
//#line 1572
final double X10_TEMP515 =
              (X10_TEMP1868);
            
//#line 1573
final double X10_TEMP1871 =
              (X10_TEMP514 *
                 X10_TEMP515);
            
//#line 1575
final double X10_TEMP517 =
              (X10_TEMP1871);
            
//#line 1576
final double X10_TEMP1874 =
              (X10_TEMP516 +
                 X10_TEMP517);
            
//#line 1578
final double X10_TEMP520 =
              (X10_TEMP1874);
            
//#line 1579
final double X10_TEMP1877 =
              (X10_TEMP520);
            
//#line 1581
final double X10_TEMP521 =
              (X10_TEMP1877);
            
//#line 1582
final double X10_TEMP1880 =
              (X10_TEMP521);
            
//#line 1584
final double X10_TEMP1883 =
              (X10_TEMP1880);
            
//#line 1585
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin =
              ((X10_TEMP1883));
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var14____ = (__var165__).iterator(); __var14____.hasNext(); ) {
        	final  x10.
          lang.
          point __var14__ = (x10.
          lang.
          point) __var14____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var14__).get(0))/* } */;/* } */
{
            
//#line 1527
final x10.
              lang.
              GenericReferenceArray X10_TEMP1820 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1529
final x10.
              lang.
              GenericReferenceArray X10_TEMP497 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1820));
            
//#line 1530
final Particle X10_TEMP1824 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP497).get(i))/* } */))/* } */);
            
//#line 1532
final Particle X10_TEMP499 =
              (X10_TEMP1824);
            
//#line 1533
final x10.
              lang.
              GenericReferenceArray X10_TEMP1827 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1535
final x10.
              lang.
              GenericReferenceArray X10_TEMP500 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1827));
            
//#line 1536
final Particle X10_TEMP1831 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP500).get(i))/* } */))/* } */);
            
//#line 1538
final Particle X10_TEMP502 =
              (X10_TEMP1831);
            
//#line 1539
final double X10_TEMP1834 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP502))/* } */.zvelocity);
            
//#line 1541
final double X10_TEMP503 =
              (X10_TEMP1834);
            
//#line 1542
final double X10_TEMP1837 =
              (X10_TEMP503 -
                 sp);
            
//#line 1544
final double X10_TEMP506 =
              (X10_TEMP1837);
            
//#line 1545
final double X10_TEMP1840 =
              (X10_TEMP506);
            
//#line 1547
final double X10_TEMP507 =
              (X10_TEMP1840);
            
//#line 1548
final double X10_TEMP1843 =
              (X10_TEMP507);
            
//#line 1550
final double X10_TEMP1846 =
              (X10_TEMP1843);
            
//#line 1551
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP499))/* } */.zvelocity =
              ((X10_TEMP1846));
            
//#line 1552
final double X10_TEMP1848 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin);
            
//#line 1554
final double X10_TEMP516 =
              (X10_TEMP1848);
            
//#line 1555
final x10.
              lang.
              GenericReferenceArray X10_TEMP1851 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1557
final x10.
              lang.
              GenericReferenceArray X10_TEMP508 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1851));
            
//#line 1558
final Particle X10_TEMP1855 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP508).get(i))/* } */))/* } */);
            
//#line 1560
final Particle X10_TEMP510 =
              (X10_TEMP1855);
            
//#line 1561
final double X10_TEMP1858 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP510))/* } */.zvelocity);
            
//#line 1563
final double X10_TEMP514 =
              (X10_TEMP1858);
            
//#line 1564
final x10.
              lang.
              GenericReferenceArray X10_TEMP1861 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1566
final x10.
              lang.
              GenericReferenceArray X10_TEMP511 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1861));
            
//#line 1567
final Particle X10_TEMP1865 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP511).get(i))/* } */))/* } */);
            
//#line 1569
final Particle X10_TEMP513 =
              (X10_TEMP1865);
            
//#line 1570
final double X10_TEMP1868 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP513))/* } */.zvelocity);
            
//#line 1572
final double X10_TEMP515 =
              (X10_TEMP1868);
            
//#line 1573
final double X10_TEMP1871 =
              (X10_TEMP514 *
                 X10_TEMP515);
            
//#line 1575
final double X10_TEMP517 =
              (X10_TEMP1871);
            
//#line 1576
final double X10_TEMP1874 =
              (X10_TEMP516 +
                 X10_TEMP517);
            
//#line 1578
final double X10_TEMP520 =
              (X10_TEMP1874);
            
//#line 1579
final double X10_TEMP1877 =
              (X10_TEMP520);
            
//#line 1581
final double X10_TEMP521 =
              (X10_TEMP1877);
            
//#line 1582
final double X10_TEMP1880 =
              (X10_TEMP521);
            
//#line 1584
final double X10_TEMP1883 =
              (X10_TEMP1880);
            
//#line 1585
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin =
              ((X10_TEMP1883));
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 1587
final double X10_TEMP1885 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.tscale);
        
//#line 1589
final double X10_TEMP522 =
          (X10_TEMP1885);
        
//#line 1590
final double X10_TEMP1888 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin);
        
//#line 1592
final double X10_TEMP523 =
          (X10_TEMP1888);
        
//#line 1593
final double X10_TEMP1891 =
          (X10_TEMP522 *
             X10_TEMP523);
        
//#line 1595
double ts =
          (X10_TEMP1891);
        
//#line 1596
final double X10_TEMP1894 =
          (_Program__md_tref /
             ts);
        
//#line 1598
final double X10_TEMP526 =
          (X10_TEMP1894);
        
//#line 1599
final double X10_TEMP1898 =
          (java.
             lang.
             Math.
             sqrt(
             X10_TEMP526));
        
//#line 1601
final double X10_TEMP527 =
          (X10_TEMP1898);
        
//#line 1602
final double X10_TEMP1901 =
          (_Program__md_h *
             X10_TEMP527);
        
//#line 1604
final double X10_TEMP530 =
          (X10_TEMP1901);
        
//#line 1605
final double X10_TEMP1904 =
          (X10_TEMP530);
        
//#line 1607
final double X10_TEMP531 =
          (X10_TEMP1904);
        
//#line 1608
final double X10_TEMP1907 =
          (X10_TEMP531);
        
//#line 1610
final double X10_TEMP1910 =
          (X10_TEMP1907);
        
//#line 1611
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.sc =
          ((X10_TEMP1910));
        
//#line 1612
final int X10_TEMP1912 =
          (0);
        
//#line 1614
final int X10_TEMP536 =
          (X10_TEMP1912);
        
//#line 1615
final int X10_TEMP1915 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 1617
final int X10_TEMP533 =
          (X10_TEMP1915);
        
//#line 1618
final int X10_TEMP1918 =
          (1);
        
//#line 1620
final int X10_TEMP534 =
          (X10_TEMP1918);
        
//#line 1621
final int X10_TEMP1921 =
          (X10_TEMP533 -
             X10_TEMP534);
        
//#line 1623
final int X10_TEMP537 =
          (X10_TEMP1921);
        
//#line 1624
final x10.
          lang.
          region X10_TEMP1926 =
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
                  X10_TEMP536,
                  X10_TEMP537))));
        
//#line 1626
final x10.
          lang.
          region X10_TEMP539 =
          (x10.
            lang.
            region)
            ((X10_TEMP1926));
        
//#line 1627
/* template:forloop-mult { */{
        x10.lang.region __var168__ = (x10.lang.region) X10_TEMP539;
        if (__var168__.size() > 0 && (__var168__ instanceof x10.array.MultiDimRegion || __var168__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var169__ = __var168__.rank(0).low(), __var170__ = __var168__.rank(0).high(); __var169__ <= __var170__; __var169__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var169__;
        /* } */
        /* } */
{
            
//#line 1628
final x10.
              lang.
              GenericReferenceArray X10_TEMP1930 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1630
final x10.
              lang.
              GenericReferenceArray X10_TEMP540 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1930));
            
//#line 1631
final Particle X10_TEMP1934 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP540).get(i))/* } */))/* } */);
            
//#line 1633
final Particle X10_TEMP542 =
              (X10_TEMP1934);
            
//#line 1634
final x10.
              lang.
              GenericReferenceArray X10_TEMP1937 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1636
final x10.
              lang.
              GenericReferenceArray X10_TEMP543 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1937));
            
//#line 1637
final Particle X10_TEMP1941 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP543).get(i))/* } */))/* } */);
            
//#line 1639
final Particle X10_TEMP545 =
              (X10_TEMP1941);
            
//#line 1640
final double X10_TEMP1944 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP545))/* } */.xvelocity);
            
//#line 1642
final double X10_TEMP546 =
              (X10_TEMP1944);
            
//#line 1643
final double X10_TEMP1947 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.sc);
            
//#line 1645
final double X10_TEMP547 =
              (X10_TEMP1947);
            
//#line 1646
final double X10_TEMP1950 =
              (X10_TEMP546 *
                 X10_TEMP547);
            
//#line 1648
final double X10_TEMP550 =
              (X10_TEMP1950);
            
//#line 1649
final double X10_TEMP1953 =
              (X10_TEMP550);
            
//#line 1651
final double X10_TEMP551 =
              (X10_TEMP1953);
            
//#line 1652
final double X10_TEMP1956 =
              (X10_TEMP551);
            
//#line 1654
final double X10_TEMP1959 =
              (X10_TEMP1956);
            
//#line 1655
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP542))/* } */.xvelocity =
              ((X10_TEMP1959));
            
//#line 1656
final x10.
              lang.
              GenericReferenceArray X10_TEMP1961 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1658
final x10.
              lang.
              GenericReferenceArray X10_TEMP552 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1961));
            
//#line 1659
final Particle X10_TEMP1965 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP552).get(i))/* } */))/* } */);
            
//#line 1661
final Particle X10_TEMP554 =
              (X10_TEMP1965);
            
//#line 1662
final x10.
              lang.
              GenericReferenceArray X10_TEMP1968 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1664
final x10.
              lang.
              GenericReferenceArray X10_TEMP555 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1968));
            
//#line 1665
final Particle X10_TEMP1972 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP555).get(i))/* } */))/* } */);
            
//#line 1667
final Particle X10_TEMP557 =
              (X10_TEMP1972);
            
//#line 1668
final double X10_TEMP1975 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP557))/* } */.yvelocity);
            
//#line 1670
final double X10_TEMP558 =
              (X10_TEMP1975);
            
//#line 1671
final double X10_TEMP1978 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.sc);
            
//#line 1673
final double X10_TEMP559 =
              (X10_TEMP1978);
            
//#line 1674
final double X10_TEMP1981 =
              (X10_TEMP558 *
                 X10_TEMP559);
            
//#line 1676
final double X10_TEMP562 =
              (X10_TEMP1981);
            
//#line 1677
final double X10_TEMP1984 =
              (X10_TEMP562);
            
//#line 1679
final double X10_TEMP563 =
              (X10_TEMP1984);
            
//#line 1680
final double X10_TEMP1987 =
              (X10_TEMP563);
            
//#line 1682
final double X10_TEMP1990 =
              (X10_TEMP1987);
            
//#line 1683
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP554))/* } */.yvelocity =
              ((X10_TEMP1990));
            
//#line 1684
final x10.
              lang.
              GenericReferenceArray X10_TEMP1992 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1686
final x10.
              lang.
              GenericReferenceArray X10_TEMP564 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1992));
            
//#line 1687
final Particle X10_TEMP1996 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP564).get(i))/* } */))/* } */);
            
//#line 1689
final Particle X10_TEMP566 =
              (X10_TEMP1996);
            
//#line 1690
final x10.
              lang.
              GenericReferenceArray X10_TEMP1999 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1692
final x10.
              lang.
              GenericReferenceArray X10_TEMP567 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1999));
            
//#line 1693
final Particle X10_TEMP2003 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP567).get(i))/* } */))/* } */);
            
//#line 1695
final Particle X10_TEMP569 =
              (X10_TEMP2003);
            
//#line 1696
final double X10_TEMP2006 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP569))/* } */.zvelocity);
            
//#line 1698
final double X10_TEMP570 =
              (X10_TEMP2006);
            
//#line 1699
final double X10_TEMP2009 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.sc);
            
//#line 1701
final double X10_TEMP571 =
              (X10_TEMP2009);
            
//#line 1702
final double X10_TEMP2012 =
              (X10_TEMP570 *
                 X10_TEMP571);
            
//#line 1704
final double X10_TEMP574 =
              (X10_TEMP2012);
            
//#line 1705
final double X10_TEMP2015 =
              (X10_TEMP574);
            
//#line 1707
final double X10_TEMP575 =
              (X10_TEMP2015);
            
//#line 1708
final double X10_TEMP2018 =
              (X10_TEMP575);
            
//#line 1710
final double X10_TEMP2021 =
              (X10_TEMP2018);
            
//#line 1711
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP566))/* } */.zvelocity =
              ((X10_TEMP2021));
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var15____ = (__var168__).iterator(); __var15____.hasNext(); ) {
        	final  x10.
          lang.
          point __var15__ = (x10.
          lang.
          point) __var15____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var15__).get(0))/* } */;/* } */
{
            
//#line 1628
final x10.
              lang.
              GenericReferenceArray X10_TEMP1930 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1630
final x10.
              lang.
              GenericReferenceArray X10_TEMP540 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1930));
            
//#line 1631
final Particle X10_TEMP1934 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP540).get(i))/* } */))/* } */);
            
//#line 1633
final Particle X10_TEMP542 =
              (X10_TEMP1934);
            
//#line 1634
final x10.
              lang.
              GenericReferenceArray X10_TEMP1937 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1636
final x10.
              lang.
              GenericReferenceArray X10_TEMP543 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1937));
            
//#line 1637
final Particle X10_TEMP1941 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP543).get(i))/* } */))/* } */);
            
//#line 1639
final Particle X10_TEMP545 =
              (X10_TEMP1941);
            
//#line 1640
final double X10_TEMP1944 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP545))/* } */.xvelocity);
            
//#line 1642
final double X10_TEMP546 =
              (X10_TEMP1944);
            
//#line 1643
final double X10_TEMP1947 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.sc);
            
//#line 1645
final double X10_TEMP547 =
              (X10_TEMP1947);
            
//#line 1646
final double X10_TEMP1950 =
              (X10_TEMP546 *
                 X10_TEMP547);
            
//#line 1648
final double X10_TEMP550 =
              (X10_TEMP1950);
            
//#line 1649
final double X10_TEMP1953 =
              (X10_TEMP550);
            
//#line 1651
final double X10_TEMP551 =
              (X10_TEMP1953);
            
//#line 1652
final double X10_TEMP1956 =
              (X10_TEMP551);
            
//#line 1654
final double X10_TEMP1959 =
              (X10_TEMP1956);
            
//#line 1655
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP542))/* } */.xvelocity =
              ((X10_TEMP1959));
            
//#line 1656
final x10.
              lang.
              GenericReferenceArray X10_TEMP1961 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1658
final x10.
              lang.
              GenericReferenceArray X10_TEMP552 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1961));
            
//#line 1659
final Particle X10_TEMP1965 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP552).get(i))/* } */))/* } */);
            
//#line 1661
final Particle X10_TEMP554 =
              (X10_TEMP1965);
            
//#line 1662
final x10.
              lang.
              GenericReferenceArray X10_TEMP1968 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1664
final x10.
              lang.
              GenericReferenceArray X10_TEMP555 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1968));
            
//#line 1665
final Particle X10_TEMP1972 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP555).get(i))/* } */))/* } */);
            
//#line 1667
final Particle X10_TEMP557 =
              (X10_TEMP1972);
            
//#line 1668
final double X10_TEMP1975 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP557))/* } */.yvelocity);
            
//#line 1670
final double X10_TEMP558 =
              (X10_TEMP1975);
            
//#line 1671
final double X10_TEMP1978 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.sc);
            
//#line 1673
final double X10_TEMP559 =
              (X10_TEMP1978);
            
//#line 1674
final double X10_TEMP1981 =
              (X10_TEMP558 *
                 X10_TEMP559);
            
//#line 1676
final double X10_TEMP562 =
              (X10_TEMP1981);
            
//#line 1677
final double X10_TEMP1984 =
              (X10_TEMP562);
            
//#line 1679
final double X10_TEMP563 =
              (X10_TEMP1984);
            
//#line 1680
final double X10_TEMP1987 =
              (X10_TEMP563);
            
//#line 1682
final double X10_TEMP1990 =
              (X10_TEMP1987);
            
//#line 1683
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP554))/* } */.yvelocity =
              ((X10_TEMP1990));
            
//#line 1684
final x10.
              lang.
              GenericReferenceArray X10_TEMP1992 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1686
final x10.
              lang.
              GenericReferenceArray X10_TEMP564 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1992));
            
//#line 1687
final Particle X10_TEMP1996 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP564).get(i))/* } */))/* } */);
            
//#line 1689
final Particle X10_TEMP566 =
              (X10_TEMP1996);
            
//#line 1690
final x10.
              lang.
              GenericReferenceArray X10_TEMP1999 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1692
final x10.
              lang.
              GenericReferenceArray X10_TEMP567 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1999));
            
//#line 1693
final Particle X10_TEMP2003 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP567).get(i))/* } */))/* } */);
            
//#line 1695
final Particle X10_TEMP569 =
              (X10_TEMP2003);
            
//#line 1696
final double X10_TEMP2006 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP569))/* } */.zvelocity);
            
//#line 1698
final double X10_TEMP570 =
              (X10_TEMP2006);
            
//#line 1699
final double X10_TEMP2009 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.sc);
            
//#line 1701
final double X10_TEMP571 =
              (X10_TEMP2009);
            
//#line 1702
final double X10_TEMP2012 =
              (X10_TEMP570 *
                 X10_TEMP571);
            
//#line 1704
final double X10_TEMP574 =
              (X10_TEMP2012);
            
//#line 1705
final double X10_TEMP2015 =
              (X10_TEMP574);
            
//#line 1707
final double X10_TEMP575 =
              (X10_TEMP2015);
            
//#line 1708
final double X10_TEMP2018 =
              (X10_TEMP575);
            
//#line 1710
final double X10_TEMP2021 =
              (X10_TEMP2018);
            
//#line 1711
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP566))/* } */.zvelocity =
              ((X10_TEMP2021));
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
    }
    
    
//#line 1714
public static void
                    Program_md_runiters1(
                    final md X10_TEMP0) {
        
//#line 1715
final int X10_TEMP578 =
          (0);
        
//#line 1717
final int X10_TEMP5 =
          (X10_TEMP578);
        
//#line 1718
final int X10_TEMP581 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 1720
final int X10_TEMP2 =
          (X10_TEMP581);
        
//#line 1721
final int X10_TEMP584 =
          (1);
        
//#line 1723
final int X10_TEMP3 =
          (X10_TEMP584);
        
//#line 1724
final int X10_TEMP587 =
          (X10_TEMP2 -
             X10_TEMP3);
        
//#line 1726
final int X10_TEMP6 =
          (X10_TEMP587);
        
//#line 1727
final x10.
          lang.
          region X10_TEMP592 =
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
        
//#line 1729
final x10.
          lang.
          region X10_TEMP8 =
          (x10.
            lang.
            region)
            ((X10_TEMP592));
        
//#line 1730
/* template:forloop-mult { */{
        x10.lang.region __var171__ = (x10.lang.region) X10_TEMP8;
        if (__var171__.size() > 0 && (__var171__ instanceof x10.array.MultiDimRegion || __var171__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var172__ = __var171__.rank(0).low(), __var173__ = __var171__.rank(0).high(); __var172__ <= __var173__; __var172__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var172__;
        /* } */
        /* } */
{
            
//#line 1731
final x10.
              lang.
              GenericReferenceArray X10_TEMP596 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1733
final x10.
              lang.
              GenericReferenceArray X10_TEMP9 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP596));
            
//#line 1734
final Particle X10_TEMP600 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP9).get(i))/* } */))/* } */);
            
//#line 1736
final Particle X10_TEMP11 =
              (X10_TEMP600);
            
//#line 1737
final double X10_TEMP603 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.side);
            
//#line 1739
final double X10_TEMP13 =
              (X10_TEMP603);
            
//#line 1740
Program0.
                            Program_Particle_domove(
                            X10_TEMP11,
                            X10_TEMP13);
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var16____ = (__var171__).iterator(); __var16____.hasNext(); ) {
        	final  x10.
          lang.
          point __var16__ = (x10.
          lang.
          point) __var16____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var16__).get(0))/* } */;/* } */
{
            
//#line 1731
final x10.
              lang.
              GenericReferenceArray X10_TEMP596 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1733
final x10.
              lang.
              GenericReferenceArray X10_TEMP9 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP596));
            
//#line 1734
final Particle X10_TEMP600 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP9).get(i))/* } */))/* } */);
            
//#line 1736
final Particle X10_TEMP11 =
              (X10_TEMP600);
            
//#line 1737
final double X10_TEMP603 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.side);
            
//#line 1739
final double X10_TEMP13 =
              (X10_TEMP603);
            
//#line 1740
Program0.
                            Program_Particle_domove(
                            X10_TEMP11,
                            X10_TEMP13);
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 1742
final double X10_TEMP608 =
          (0.0);
        
//#line 1744
final double X10_TEMP16 =
          (X10_TEMP608);
        
//#line 1745
final double X10_TEMP611 =
          (X10_TEMP16);
        
//#line 1747
final double X10_TEMP17 =
          (X10_TEMP611);
        
//#line 1748
final double X10_TEMP614 =
          (X10_TEMP17);
        
//#line 1750
final double X10_TEMP617 =
          (X10_TEMP614);
        
//#line 1751
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.epot =
          ((X10_TEMP617));
        
//#line 1752
final double X10_TEMP619 =
          (0.0);
        
//#line 1754
final double X10_TEMP20 =
          (X10_TEMP619);
        
//#line 1755
final double X10_TEMP622 =
          (X10_TEMP20);
        
//#line 1757
final double X10_TEMP21 =
          (X10_TEMP622);
        
//#line 1758
final double X10_TEMP625 =
          (X10_TEMP21);
        
//#line 1760
final double X10_TEMP628 =
          (X10_TEMP625);
        
//#line 1761
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.vir =
          ((X10_TEMP628));
        
//#line 1762
final int X10_TEMP630 =
          (0);
        
//#line 1764
final int X10_TEMP22 =
          (X10_TEMP630);
        
//#line 1765
final int X10_TEMP633 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.rnk);
        
//#line 1767
final int X10_TEMP23 =
          (X10_TEMP633);
        
//#line 1768
final int X10_TEMP636 =
          (X10_TEMP22 +
             X10_TEMP23);
        
//#line 1770
int i =
          (X10_TEMP636);
        
//#line 1771
final int X10_TEMP639 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 1773
final int X10_TEMP25 =
          (X10_TEMP639);
        
//#line 1774
boolean X10_TEMP29 =
          (i <
             X10_TEMP25);
        
//#line 1775
boolean X10_TEMP644 =
          X10_TEMP29;
        
//#line 1776
while (X10_TEMP644) {
            
//#line 1777
final x10.
              lang.
              GenericReferenceArray X10_TEMP646 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1779
final x10.
              lang.
              GenericReferenceArray X10_TEMP30 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP646));
            
//#line 1780
final Particle X10_TEMP650 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP30).get(i))/* } */))/* } */);
            
//#line 1782
final Particle X10_TEMP32 =
              (X10_TEMP650);
            
//#line 1783
final double X10_TEMP653 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.side);
            
//#line 1785
final double X10_TEMP38 =
              (X10_TEMP653);
            
//#line 1786
final double X10_TEMP656 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.rcoff);
            
//#line 1788
final double X10_TEMP39 =
              (X10_TEMP656);
            
//#line 1789
final int X10_TEMP659 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
            
//#line 1791
final int X10_TEMP40 =
              (X10_TEMP659);
            
//#line 1792
Program0.
                            Program_Particle_force(
                            X10_TEMP32,
                            X10_TEMP38,
                            X10_TEMP39,
                            X10_TEMP40,
                            i,
                            X10_TEMP0);
            
//#line 1793
final int X10_TEMP668 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.nprocess);
            
//#line 1795
final int X10_TEMP42 =
              (X10_TEMP668);
            
//#line 1796
final int X10_TEMP671 =
              (i +
                 X10_TEMP42);
            
//#line 1798
i =
              ((X10_TEMP671));
            
//#line 1799
final int X10_TEMP674 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
            
//#line 1801
final int X10_TEMP27 =
              (X10_TEMP674);
            
//#line 1802
final boolean X10_TEMP677 =
              (i <
                 X10_TEMP27);
            
//#line 1803
X10_TEMP29 =
              ((X10_TEMP677));
            
//#line 1804
X10_TEMP644 =
              X10_TEMP29;
        }
    }
    
    
//#line 1807
public static void
                    Program_md_runiters2(
                    final md X10_TEMP0) {
        
//#line 1808
Program0.
                        Program_md_allreduce(
                        X10_TEMP0);
    }
    
    
//#line 1810
public static void
                    Program_md_runiters3(
                    final md X10_TEMP0,
                    final int move) {
        
//#line 1811
int X10_TEMP1 =
          (move);
        
//#line 1812
final double X10_TEMP579 =
          (0.0);
        
//#line 1814
double summation =
          (X10_TEMP579);
        
//#line 1815
final int X10_TEMP582 =
          (0);
        
//#line 1817
final int X10_TEMP7 =
          (X10_TEMP582);
        
//#line 1818
final int X10_TEMP585 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 1820
final int X10_TEMP4 =
          (X10_TEMP585);
        
//#line 1821
final int X10_TEMP588 =
          (1);
        
//#line 1823
final int X10_TEMP5 =
          (X10_TEMP588);
        
//#line 1824
final int X10_TEMP591 =
          (X10_TEMP4 -
             X10_TEMP5);
        
//#line 1826
final int X10_TEMP8 =
          (X10_TEMP591);
        
//#line 1827
final x10.
          lang.
          region X10_TEMP596 =
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
        
//#line 1829
final x10.
          lang.
          region X10_TEMP10 =
          (x10.
            lang.
            region)
            ((X10_TEMP596));
        
//#line 1830
/* template:forloop-mult { */{
        x10.lang.region __var174__ = (x10.lang.region) X10_TEMP10;
        if (__var174__.size() > 0 && (__var174__ instanceof x10.array.MultiDimRegion || __var174__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var175__ = __var174__.rank(0).low(), __var176__ = __var174__.rank(0).high(); __var175__ <= __var176__; __var175__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var175__;
        /* } */
        /* } */
{
            
//#line 1831
final x10.
              lang.
              GenericReferenceArray X10_TEMP600 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1833
final x10.
              lang.
              GenericReferenceArray X10_TEMP11 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP600));
            
//#line 1834
final Particle X10_TEMP604 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP11).get(i))/* } */))/* } */);
            
//#line 1836
final Particle X10_TEMP13 =
              (X10_TEMP604);
            
//#line 1837
final double X10_TEMP607 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.hsq2);
            
//#line 1839
final double X10_TEMP15 =
              (X10_TEMP607);
            
//#line 1840
final double X10_TEMP612 =
              (Program0.
                 Program_Particle_mkekin(
                 X10_TEMP13,
                 X10_TEMP15));
            
//#line 1842
final double X10_TEMP16 =
              (X10_TEMP612);
            
//#line 1843
final double X10_TEMP615 =
              (summation +
                 X10_TEMP16);
            
//#line 1845
final double X10_TEMP18 =
              (X10_TEMP615);
            
//#line 1846
final double X10_TEMP618 =
              (X10_TEMP18);
            
//#line 1848
summation =
              ((X10_TEMP618));
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var17____ = (__var174__).iterator(); __var17____.hasNext(); ) {
        	final  x10.
          lang.
          point __var17__ = (x10.
          lang.
          point) __var17____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var17__).get(0))/* } */;/* } */
{
            
//#line 1831
final x10.
              lang.
              GenericReferenceArray X10_TEMP600 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1833
final x10.
              lang.
              GenericReferenceArray X10_TEMP11 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP600));
            
//#line 1834
final Particle X10_TEMP604 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP11).get(i))/* } */))/* } */);
            
//#line 1836
final Particle X10_TEMP13 =
              (X10_TEMP604);
            
//#line 1837
final double X10_TEMP607 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.hsq2);
            
//#line 1839
final double X10_TEMP15 =
              (X10_TEMP607);
            
//#line 1840
final double X10_TEMP612 =
              (Program0.
                 Program_Particle_mkekin(
                 X10_TEMP13,
                 X10_TEMP15));
            
//#line 1842
final double X10_TEMP16 =
              (X10_TEMP612);
            
//#line 1843
final double X10_TEMP615 =
              (summation +
                 X10_TEMP16);
            
//#line 1845
final double X10_TEMP18 =
              (X10_TEMP615);
            
//#line 1846
final double X10_TEMP618 =
              (X10_TEMP18);
            
//#line 1848
summation =
              ((X10_TEMP618));
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 1850
final double X10_TEMP621 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.hsq);
        
//#line 1852
final double X10_TEMP19 =
          (X10_TEMP621);
        
//#line 1853
final double X10_TEMP624 =
          (summation /
             X10_TEMP19);
        
//#line 1855
final double X10_TEMP22 =
          (X10_TEMP624);
        
//#line 1856
final double X10_TEMP627 =
          (X10_TEMP22);
        
//#line 1858
final double X10_TEMP23 =
          (X10_TEMP627);
        
//#line 1859
final double X10_TEMP630 =
          (X10_TEMP23);
        
//#line 1861
final double X10_TEMP633 =
          (X10_TEMP630);
        
//#line 1862
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin =
          ((X10_TEMP633));
        
//#line 1863
final double X10_TEMP635 =
          (0.0);
        
//#line 1865
double vel =
          (X10_TEMP635);
        
//#line 1866
final double X10_TEMP638 =
          (0.0);
        
//#line 1868
final double X10_TEMP27 =
          (X10_TEMP638);
        
//#line 1869
final double X10_TEMP641 =
          (X10_TEMP27);
        
//#line 1871
final double X10_TEMP28 =
          (X10_TEMP641);
        
//#line 1872
final double X10_TEMP644 =
          (X10_TEMP28);
        
//#line 1874
final double X10_TEMP647 =
          (X10_TEMP644);
        
//#line 1875
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.count =
          ((X10_TEMP647));
        
//#line 1876
final int X10_TEMP649 =
          (0);
        
//#line 1878
final int X10_TEMP33 =
          (X10_TEMP649);
        
//#line 1879
final int X10_TEMP652 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 1881
final int X10_TEMP30 =
          (X10_TEMP652);
        
//#line 1882
final int X10_TEMP655 =
          (1);
        
//#line 1884
final int X10_TEMP31 =
          (X10_TEMP655);
        
//#line 1885
final int X10_TEMP658 =
          (X10_TEMP30 -
             X10_TEMP31);
        
//#line 1887
final int X10_TEMP34 =
          (X10_TEMP658);
        
//#line 1888
final x10.
          lang.
          region X10_TEMP663 =
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
                  X10_TEMP33,
                  X10_TEMP34))));
        
//#line 1890
final x10.
          lang.
          region X10_TEMP36 =
          (x10.
            lang.
            region)
            ((X10_TEMP663));
        
//#line 1891
/* template:forloop-mult { */{
        x10.lang.region __var177__ = (x10.lang.region) X10_TEMP36;
        if (__var177__.size() > 0 && (__var177__ instanceof x10.array.MultiDimRegion || __var177__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var178__ = __var177__.rank(0).low(), __var179__ = __var177__.rank(0).high(); __var178__ <= __var179__; __var178__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var178__;
        /* } */
        /* } */
{
            
//#line 1892
final x10.
              lang.
              GenericReferenceArray X10_TEMP667 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1894
final x10.
              lang.
              GenericReferenceArray X10_TEMP37 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP667));
            
//#line 1895
final Particle X10_TEMP671 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP37).get(i))/* } */))/* } */);
            
//#line 1897
final Particle X10_TEMP39 =
              (X10_TEMP671);
            
//#line 1898
final double X10_TEMP674 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.vaverh);
            
//#line 1900
final double X10_TEMP43 =
              (X10_TEMP674);
            
//#line 1901
final double X10_TEMP681 =
              (Program0.
                 Program_Particle_velavg(
                 X10_TEMP39,
                 X10_TEMP43,
                 _Program__md_h,
                 X10_TEMP0));
            
//#line 1903
final double X10_TEMP44 =
              (X10_TEMP681);
            
//#line 1904
final double X10_TEMP684 =
              (vel +
                 X10_TEMP44);
            
//#line 1906
final double X10_TEMP46 =
              (X10_TEMP684);
            
//#line 1907
final double X10_TEMP687 =
              (X10_TEMP46);
            
//#line 1909
vel =
              ((X10_TEMP687));
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var18____ = (__var177__).iterator(); __var18____.hasNext(); ) {
        	final  x10.
          lang.
          point __var18__ = (x10.
          lang.
          point) __var18____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var18__).get(0))/* } */;/* } */
{
            
//#line 1892
final x10.
              lang.
              GenericReferenceArray X10_TEMP667 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 1894
final x10.
              lang.
              GenericReferenceArray X10_TEMP37 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP667));
            
//#line 1895
final Particle X10_TEMP671 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP37).get(i))/* } */))/* } */);
            
//#line 1897
final Particle X10_TEMP39 =
              (X10_TEMP671);
            
//#line 1898
final double X10_TEMP674 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.vaverh);
            
//#line 1900
final double X10_TEMP43 =
              (X10_TEMP674);
            
//#line 1901
final double X10_TEMP681 =
              (Program0.
                 Program_Particle_velavg(
                 X10_TEMP39,
                 X10_TEMP43,
                 _Program__md_h,
                 X10_TEMP0));
            
//#line 1903
final double X10_TEMP44 =
              (X10_TEMP681);
            
//#line 1904
final double X10_TEMP684 =
              (vel +
                 X10_TEMP44);
            
//#line 1906
final double X10_TEMP46 =
              (X10_TEMP684);
            
//#line 1907
final double X10_TEMP687 =
              (X10_TEMP46);
            
//#line 1909
vel =
              ((X10_TEMP687));
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 1911
final double X10_TEMP690 =
          (vel /
             _Program__md_h);
        
//#line 1913
final double X10_TEMP48 =
          (X10_TEMP690);
        
//#line 1914
final double X10_TEMP693 =
          (X10_TEMP48);
        
//#line 1916
vel =
          ((X10_TEMP693));
        
//#line 1917
final boolean X10_TEMP696 =
          (X10_TEMP1 <
             _Program__md_istop);
        
//#line 1919
final boolean X10_TEMP50 =
          (X10_TEMP696);
        
//#line 1920
final int X10_TEMP699 =
          (1);
        
//#line 1922
final int X10_TEMP51 =
          (X10_TEMP699);
        
//#line 1923
final int X10_TEMP702 =
          (X10_TEMP1 +
             X10_TEMP51);
        
//#line 1925
final int X10_TEMP53 =
          (X10_TEMP702);
        
//#line 1926
final int X10_TEMP705 =
          (X10_TEMP53 %
             _Program__md_irep);
        
//#line 1928
final int X10_TEMP55 =
          (X10_TEMP705);
        
//#line 1929
final int X10_TEMP708 =
          (0);
        
//#line 1931
final int X10_TEMP56 =
          (X10_TEMP708);
        
//#line 1932
final boolean X10_TEMP711 =
          (X10_TEMP55 ==
             X10_TEMP56);
        
//#line 1934
final boolean X10_TEMP58 =
          (X10_TEMP711);
        
//#line 1935
final boolean X10_TEMP60 =
          (X10_TEMP50 &&
             X10_TEMP58);
        
//#line 1936
if (X10_TEMP60) {
            
//#line 1937
final double X10_TEMP716 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.tscale);
            
//#line 1939
final double X10_TEMP61 =
              (X10_TEMP716);
            
//#line 1940
final double X10_TEMP719 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin);
            
//#line 1942
final double X10_TEMP62 =
              (X10_TEMP719);
            
//#line 1943
final double X10_TEMP722 =
              (X10_TEMP61 *
                 X10_TEMP62);
            
//#line 1945
final double X10_TEMP64 =
              (X10_TEMP722);
            
//#line 1946
final double X10_TEMP725 =
              (_Program__md_tref /
                 X10_TEMP64);
            
//#line 1948
final double X10_TEMP66 =
              (X10_TEMP725);
            
//#line 1949
final double X10_TEMP729 =
              (java.
                 lang.
                 Math.
                 sqrt(
                 X10_TEMP66));
            
//#line 1951
final double X10_TEMP69 =
              (X10_TEMP729);
            
//#line 1952
final double X10_TEMP732 =
              (X10_TEMP69);
            
//#line 1954
final double X10_TEMP70 =
              (X10_TEMP732);
            
//#line 1955
final double X10_TEMP735 =
              (X10_TEMP70);
            
//#line 1957
final double X10_TEMP738 =
              (X10_TEMP735);
            
//#line 1958
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.sc =
              ((X10_TEMP738));
            
//#line 1959
final int X10_TEMP740 =
              (0);
            
//#line 1961
final int X10_TEMP75 =
              (X10_TEMP740);
            
//#line 1962
final int X10_TEMP743 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
            
//#line 1964
final int X10_TEMP72 =
              (X10_TEMP743);
            
//#line 1965
final int X10_TEMP746 =
              (1);
            
//#line 1967
final int X10_TEMP73 =
              (X10_TEMP746);
            
//#line 1968
final int X10_TEMP749 =
              (X10_TEMP72 -
                 X10_TEMP73);
            
//#line 1970
final int X10_TEMP76 =
              (X10_TEMP749);
            
//#line 1971
final x10.
              lang.
              region X10_TEMP754 =
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
                      X10_TEMP75,
                      X10_TEMP76))));
            
//#line 1973
final x10.
              lang.
              region X10_TEMP78 =
              (x10.
                lang.
                region)
                ((X10_TEMP754));
            
//#line 1974
/* template:forloop-mult { */{
            x10.lang.region __var180__ = (x10.lang.region) X10_TEMP78;
            if (__var180__.size() > 0 && (__var180__ instanceof x10.array.MultiDimRegion || __var180__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var181__ = __var180__.rank(0).low(), __var182__ = __var180__.rank(0).high(); __var181__ <= __var182__; __var181__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var181__;
            /* } */
            /* } */
{
                
//#line 1975
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP758 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                
//#line 1977
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP79 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP758));
                
//#line 1978
final Particle X10_TEMP762 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP79).get(i))/* } */))/* } */);
                
//#line 1980
final Particle X10_TEMP81 =
                  (X10_TEMP762);
                
//#line 1981
final double X10_TEMP765 =
                  (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.sc);
                
//#line 1983
final double X10_TEMP84 =
                  (X10_TEMP765);
                
//#line 1984
final int X10_TEMP768 =
                  (1);
                
//#line 1986
final int X10_TEMP85 =
                  (X10_TEMP768);
                
//#line 1987
Program0.
                                Program_Particle_dscal(
                                X10_TEMP81,
                                X10_TEMP84,
                                X10_TEMP85);
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var19____ = (__var180__).iterator(); __var19____.hasNext(); ) {
            	final  x10.
              lang.
              point __var19__ = (x10.
              lang.
              point) __var19____.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var19__).get(0))/* } */;/* } */
{
                
//#line 1975
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP758 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                
//#line 1977
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP79 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP758));
                
//#line 1978
final Particle X10_TEMP762 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP79).get(i))/* } */))/* } */);
                
//#line 1980
final Particle X10_TEMP81 =
                  (X10_TEMP762);
                
//#line 1981
final double X10_TEMP765 =
                  (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.sc);
                
//#line 1983
final double X10_TEMP84 =
                  (X10_TEMP765);
                
//#line 1984
final int X10_TEMP768 =
                  (1);
                
//#line 1986
final int X10_TEMP85 =
                  (X10_TEMP768);
                
//#line 1987
Program0.
                                Program_Particle_dscal(
                                X10_TEMP81,
                                X10_TEMP84,
                                X10_TEMP85);
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
            
//#line 1989
final double X10_TEMP774 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.tscale);
            
//#line 1991
final double X10_TEMP86 =
              (X10_TEMP774);
            
//#line 1992
final double X10_TEMP777 =
              (_Program__md_tref /
                 X10_TEMP86);
            
//#line 1994
final double X10_TEMP89 =
              (X10_TEMP777);
            
//#line 1995
final double X10_TEMP780 =
              (X10_TEMP89);
            
//#line 1997
final double X10_TEMP90 =
              (X10_TEMP780);
            
//#line 1998
final double X10_TEMP783 =
              (X10_TEMP90);
            
//#line 2000
final double X10_TEMP786 =
              (X10_TEMP783);
            
//#line 2001
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin =
              ((X10_TEMP786));
        }
        
//#line 2003
final int X10_TEMP788 =
          (1);
        
//#line 2005
final int X10_TEMP91 =
          (X10_TEMP788);
        
//#line 2006
final int X10_TEMP791 =
          (X10_TEMP1 +
             X10_TEMP91);
        
//#line 2008
final int X10_TEMP93 =
          (X10_TEMP791);
        
//#line 2009
final int X10_TEMP794 =
          (X10_TEMP93 %
             _Program__md_iprint);
        
//#line 2011
final int X10_TEMP95 =
          (X10_TEMP794);
        
//#line 2012
final int X10_TEMP797 =
          (0);
        
//#line 2014
final int X10_TEMP96 =
          (X10_TEMP797);
        
//#line 2015
final boolean X10_TEMP98 =
          (X10_TEMP95 ==
             X10_TEMP96);
        
//#line 2016
if (X10_TEMP98) {
            
//#line 2017
final double X10_TEMP802 =
              (24.0);
            
//#line 2019
final double X10_TEMP99 =
              (X10_TEMP802);
            
//#line 2020
final double X10_TEMP805 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin);
            
//#line 2022
final double X10_TEMP100 =
              (X10_TEMP805);
            
//#line 2023
final double X10_TEMP808 =
              (X10_TEMP99 *
                 X10_TEMP100);
            
//#line 2025
final double X10_TEMP103 =
              (X10_TEMP808);
            
//#line 2026
final double X10_TEMP811 =
              (X10_TEMP103);
            
//#line 2028
final double X10_TEMP104 =
              (X10_TEMP811);
            
//#line 2029
final double X10_TEMP814 =
              (X10_TEMP104);
            
//#line 2031
final double X10_TEMP817 =
              (X10_TEMP814);
            
//#line 2032
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ek =
              ((X10_TEMP817));
            
//#line 2033
final double X10_TEMP819 =
              (4.0);
            
//#line 2035
final double X10_TEMP105 =
              (X10_TEMP819);
            
//#line 2036
final double X10_TEMP822 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.epot);
            
//#line 2038
final double X10_TEMP106 =
              (X10_TEMP822);
            
//#line 2039
final double X10_TEMP825 =
              (X10_TEMP105 *
                 X10_TEMP106);
            
//#line 2041
final double X10_TEMP109 =
              (X10_TEMP825);
            
//#line 2042
final double X10_TEMP828 =
              (X10_TEMP109);
            
//#line 2044
final double X10_TEMP110 =
              (X10_TEMP828);
            
//#line 2045
final double X10_TEMP831 =
              (X10_TEMP110);
            
//#line 2047
final double X10_TEMP834 =
              (X10_TEMP831);
            
//#line 2048
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.epot =
              ((X10_TEMP834));
            
//#line 2049
final double X10_TEMP836 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ek);
            
//#line 2051
final double X10_TEMP111 =
              (X10_TEMP836);
            
//#line 2052
final double X10_TEMP839 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.epot);
            
//#line 2054
final double X10_TEMP112 =
              (X10_TEMP839);
            
//#line 2055
final double X10_TEMP842 =
              (X10_TEMP111 +
                 X10_TEMP112);
            
//#line 2057
final double X10_TEMP115 =
              (X10_TEMP842);
            
//#line 2058
final double X10_TEMP845 =
              (X10_TEMP115);
            
//#line 2060
final double X10_TEMP116 =
              (X10_TEMP845);
            
//#line 2061
final double X10_TEMP848 =
              (X10_TEMP116);
            
//#line 2063
final double X10_TEMP851 =
              (X10_TEMP848);
            
//#line 2064
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.etot =
              ((X10_TEMP851));
            
//#line 2065
final double X10_TEMP853 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.tscale);
            
//#line 2067
final double X10_TEMP117 =
              (X10_TEMP853);
            
//#line 2068
final double X10_TEMP856 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin);
            
//#line 2070
final double X10_TEMP118 =
              (X10_TEMP856);
            
//#line 2071
final double X10_TEMP859 =
              (X10_TEMP117 *
                 X10_TEMP118);
            
//#line 2073
final double X10_TEMP121 =
              (X10_TEMP859);
            
//#line 2074
final double X10_TEMP862 =
              (X10_TEMP121);
            
//#line 2076
final double X10_TEMP122 =
              (X10_TEMP862);
            
//#line 2077
final double X10_TEMP865 =
              (X10_TEMP122);
            
//#line 2079
final double X10_TEMP868 =
              (X10_TEMP865);
            
//#line 2080
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.temp =
              ((X10_TEMP868));
            
//#line 2081
final double X10_TEMP870 =
              (16.0);
            
//#line 2083
final double X10_TEMP123 =
              (X10_TEMP870);
            
//#line 2084
final double X10_TEMP873 =
              (_Program__md_den *
                 X10_TEMP123);
            
//#line 2086
final double X10_TEMP128 =
              (X10_TEMP873);
            
//#line 2087
final double X10_TEMP876 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin);
            
//#line 2089
final double X10_TEMP124 =
              (X10_TEMP876);
            
//#line 2090
final double X10_TEMP879 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.vir);
            
//#line 2092
final double X10_TEMP125 =
              (X10_TEMP879);
            
//#line 2093
final double X10_TEMP882 =
              (X10_TEMP124 -
                 X10_TEMP125);
            
//#line 2095
final double X10_TEMP127 =
              (X10_TEMP882);
            
//#line 2096
final double X10_TEMP885 =
              (X10_TEMP128 *
                 X10_TEMP127);
            
//#line 2098
final double X10_TEMP129 =
              (X10_TEMP885);
            
//#line 2099
final int X10_TEMP888 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
            
//#line 2101
final int X10_TEMP130 =
              (X10_TEMP888);
            
//#line 2102
final double X10_TEMP891 =
              (X10_TEMP129 /
                 X10_TEMP130);
            
//#line 2104
final double X10_TEMP133 =
              (X10_TEMP891);
            
//#line 2105
final double X10_TEMP894 =
              (X10_TEMP133);
            
//#line 2107
final double X10_TEMP134 =
              (X10_TEMP894);
            
//#line 2108
final double X10_TEMP897 =
              (X10_TEMP134);
            
//#line 2110
final double X10_TEMP900 =
              (X10_TEMP897);
            
//#line 2111
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.pres =
              ((X10_TEMP900));
            
//#line 2112
final int X10_TEMP902 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
            
//#line 2114
final int X10_TEMP135 =
              (X10_TEMP902);
            
//#line 2115
final double X10_TEMP905 =
              (vel /
                 X10_TEMP135);
            
//#line 2117
final double X10_TEMP137 =
              (X10_TEMP905);
            
//#line 2118
final double X10_TEMP908 =
              (X10_TEMP137);
            
//#line 2120
vel =
              ((X10_TEMP908));
            
//#line 2121
final double X10_TEMP911 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.count);
            
//#line 2123
final double X10_TEMP138 =
              (X10_TEMP911);
            
//#line 2124
final int X10_TEMP914 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
            
//#line 2126
final int X10_TEMP139 =
              (X10_TEMP914);
            
//#line 2127
final double X10_TEMP917 =
              (X10_TEMP138 /
                 X10_TEMP139);
            
//#line 2129
final double X10_TEMP141 =
              (X10_TEMP917);
            
//#line 2130
final double X10_TEMP920 =
              (100.0);
            
//#line 2132
final double X10_TEMP142 =
              (X10_TEMP920);
            
//#line 2133
final double X10_TEMP923 =
              (X10_TEMP141 *
                 X10_TEMP142);
            
//#line 2135
final double X10_TEMP145 =
              (X10_TEMP923);
            
//#line 2136
final double X10_TEMP926 =
              (X10_TEMP145);
            
//#line 2138
final double X10_TEMP146 =
              (X10_TEMP926);
            
//#line 2139
final double X10_TEMP929 =
              (X10_TEMP146);
            
//#line 2141
final double X10_TEMP932 =
              (X10_TEMP929);
            
//#line 2142
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.rp =
              ((X10_TEMP932));
        }
    }
    
    
//#line 2145
public static void
                    Program_md_allreduce(
                    final md X10_TEMP0) {
        
//#line 2146
final int X10_TEMP578 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.rnk);
        
//#line 2148
final int X10_TEMP1 =
          (X10_TEMP578);
        
//#line 2149
final int X10_TEMP581 =
          (0);
        
//#line 2151
final int X10_TEMP2 =
          (X10_TEMP581);
        
//#line 2152
final boolean X10_TEMP4 =
          (X10_TEMP1 !=
             X10_TEMP2);
        
//#line 2153
if (X10_TEMP4) {
            
//#line 2154
return;
        }
        
//#line 2156
final x10.
          lang.
          GenericReferenceArray X10_TEMP586 =
          (x10.
            lang.
            GenericReferenceArray)
            ((_Program__md_P));
        
//#line 2158
final x10.
          lang.
          GenericReferenceArray P =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP586));
        
//#line 2159
final md X10_TEMP589 =
          (new md(
             ));
        
//#line 2161
final md t =
          (X10_TEMP589);
        
//#line 2162
final int X10_TEMP592 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 2164
final int X10_TEMP9 =
          (X10_TEMP592);
        
//#line 2165
final int X10_TEMP595 =
          (X10_TEMP9);
        
//#line 2167
final int X10_TEMP10 =
          (X10_TEMP595);
        
//#line 2168
final int X10_TEMP598 =
          (X10_TEMP10);
        
//#line 2170
final int X10_TEMP601 =
          (X10_TEMP598);
        
//#line 2171
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.mdsize =
          ((X10_TEMP601));
        
//#line 2172
final int X10_TEMP603 =
          (0);
        
//#line 2174
final int X10_TEMP15 =
          (X10_TEMP603);
        
//#line 2175
final int X10_TEMP606 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 2177
final int X10_TEMP12 =
          (X10_TEMP606);
        
//#line 2178
final int X10_TEMP609 =
          (1);
        
//#line 2180
final int X10_TEMP13 =
          (X10_TEMP609);
        
//#line 2181
final int X10_TEMP612 =
          (X10_TEMP12 -
             X10_TEMP13);
        
//#line 2183
final int X10_TEMP16 =
          (X10_TEMP612);
        
//#line 2184
final x10.
          lang.
          region X10_TEMP617 =
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
                  X10_TEMP15,
                  X10_TEMP16))));
        
//#line 2186
final x10.
          lang.
          region X10_TEMP17 =
          (x10.
            lang.
            region)
            ((X10_TEMP617));
        
//#line 2187
final x10.
          lang.
          place X10_TEMP620 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 2189
final x10.
          lang.
          place X10_TEMP18 =
          (X10_TEMP620);
        
//#line 2190
final x10.
          lang.
          dist X10_TEMP623 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                X10_TEMP17,
                X10_TEMP18)));
        
//#line 2192
final x10.
          lang.
          dist dOne =
          (x10.
            lang.
            dist)
            ((X10_TEMP623));
        
//#line 2193
final x10.
          lang.
          GenericReferenceArray X10_TEMP626 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dOne,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 2195
final x10.
          lang.
          GenericReferenceArray X10_TEMP22 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP626));
        
//#line 2196
final x10.
          lang.
          GenericReferenceArray X10_TEMP629 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP22));
        
//#line 2198
final x10.
          lang.
          GenericReferenceArray X10_TEMP23 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP629));
        
//#line 2199
final x10.
          lang.
          GenericReferenceArray X10_TEMP632 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP23));
        
//#line 2201
final x10.
          lang.
          GenericReferenceArray X10_TEMP635 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP632));
        
//#line 2202
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one =
          ((X10_TEMP635));
        
//#line 2203
final x10.
          lang.
          place X10_TEMP637 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 2205
final x10.
          lang.
          place tHere =
          (X10_TEMP637);
        
//#line 2206
final int X10_TEMP640 =
          (0);
        
//#line 2208
final int X10_TEMP31 =
          (X10_TEMP640);
        
//#line 2209
final int X10_TEMP643 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 2211
final int X10_TEMP26 =
          (X10_TEMP643);
        
//#line 2212
final int X10_TEMP646 =
          (1);
        
//#line 2214
final int X10_TEMP27 =
          (X10_TEMP646);
        
//#line 2215
final int X10_TEMP649 =
          (X10_TEMP26 -
             X10_TEMP27);
        
//#line 2217
final int X10_TEMP29 =
          (X10_TEMP649);
        
//#line 2218
final x10.
          lang.
          region X10_TEMP654 =
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
                  X10_TEMP29))));
        
//#line 2220
final x10.
          lang.
          region X10_TEMP33 =
          (x10.
            lang.
            region)
            ((X10_TEMP654));
        
//#line 2221
/* template:forloop-mult { */{
        x10.lang.region __var183__ = (x10.lang.region) X10_TEMP33;
        if (__var183__.size() > 0 && (__var183__ instanceof x10.array.MultiDimRegion || __var183__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var184__ = __var183__.rank(0).low(), __var185__ = __var183__.rank(0).high(); __var184__ <= __var185__; __var184__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int k = __var184__;
        /* } */
        /* } */
{
            
//#line 2222
final x10.
              lang.
              GenericReferenceArray X10_TEMP658 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
            
//#line 2224
final x10.
              lang.
              GenericReferenceArray X10_TEMP34 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP658));
            
//#line 2225
final double X10_TEMP661 =
              (0.0);
            
//#line 2227
double X10_TEMP45 =
              (X10_TEMP661);
            
//#line 2228
final double X10_TEMP664 =
              (0.0);
            
//#line 2230
double X10_TEMP46 =
              (X10_TEMP664);
            
//#line 2231
final double X10_TEMP667 =
              (0.0);
            
//#line 2233
double X10_TEMP47 =
              (X10_TEMP667);
            
//#line 2234
final double X10_TEMP670 =
              (0.0);
            
//#line 2236
double X10_TEMP48 =
              (X10_TEMP670);
            
//#line 2237
final double X10_TEMP673 =
              (0.0);
            
//#line 2239
double X10_TEMP49 =
              (X10_TEMP673);
            
//#line 2240
final double X10_TEMP676 =
              (0.0);
            
//#line 2242
double X10_TEMP50 =
              (X10_TEMP676);
            
//#line 2243
final double X10_TEMP679 =
              (0.0);
            
//#line 2245
double X10_TEMP51 =
              (X10_TEMP679);
            
//#line 2246
final double X10_TEMP682 =
              (0.0);
            
//#line 2248
double X10_TEMP52 =
              (X10_TEMP682);
            
//#line 2249
final double X10_TEMP685 =
              (0.0);
            
//#line 2251
double X10_TEMP53 =
              (X10_TEMP685);
            
//#line 2252
final Particle X10_TEMP697 =
              (new Particle(
                 X10_TEMP45,
                 X10_TEMP46,
                 X10_TEMP47,
                 X10_TEMP48,
                 X10_TEMP49,
                 X10_TEMP50,
                 X10_TEMP51,
                 X10_TEMP52,
                 X10_TEMP53));
            
//#line 2254
final Particle X10_TEMP56 =
              (X10_TEMP697);
            
//#line 2255
final Particle X10_TEMP700 =
              (X10_TEMP56);
            
//#line 2257
final Particle X10_TEMP57 =
              (X10_TEMP700);
            
//#line 2258
final Particle X10_TEMP704 =
              (X10_TEMP57);
            
//#line 2260
final Particle X10_TEMP707 =
              (X10_TEMP704);
            
//#line 2261
/* template:array_set { */(X10_TEMP34).set((X10_TEMP707),k)/* } */;
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var20____ = (__var183__).iterator(); __var20____.hasNext(); ) {
        	final  x10.
          lang.
          point __var20__ = (x10.
          lang.
          point) __var20____.next();
        	/* Join: { *//* Join: { */final int k =
          /* template:array_get { */((__var20__).get(0))/* } */;/* } */
{
            
//#line 2222
final x10.
              lang.
              GenericReferenceArray X10_TEMP658 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
            
//#line 2224
final x10.
              lang.
              GenericReferenceArray X10_TEMP34 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP658));
            
//#line 2225
final double X10_TEMP661 =
              (0.0);
            
//#line 2227
double X10_TEMP45 =
              (X10_TEMP661);
            
//#line 2228
final double X10_TEMP664 =
              (0.0);
            
//#line 2230
double X10_TEMP46 =
              (X10_TEMP664);
            
//#line 2231
final double X10_TEMP667 =
              (0.0);
            
//#line 2233
double X10_TEMP47 =
              (X10_TEMP667);
            
//#line 2234
final double X10_TEMP670 =
              (0.0);
            
//#line 2236
double X10_TEMP48 =
              (X10_TEMP670);
            
//#line 2237
final double X10_TEMP673 =
              (0.0);
            
//#line 2239
double X10_TEMP49 =
              (X10_TEMP673);
            
//#line 2240
final double X10_TEMP676 =
              (0.0);
            
//#line 2242
double X10_TEMP50 =
              (X10_TEMP676);
            
//#line 2243
final double X10_TEMP679 =
              (0.0);
            
//#line 2245
double X10_TEMP51 =
              (X10_TEMP679);
            
//#line 2246
final double X10_TEMP682 =
              (0.0);
            
//#line 2248
double X10_TEMP52 =
              (X10_TEMP682);
            
//#line 2249
final double X10_TEMP685 =
              (0.0);
            
//#line 2251
double X10_TEMP53 =
              (X10_TEMP685);
            
//#line 2252
final Particle X10_TEMP697 =
              (new Particle(
                 X10_TEMP45,
                 X10_TEMP46,
                 X10_TEMP47,
                 X10_TEMP48,
                 X10_TEMP49,
                 X10_TEMP50,
                 X10_TEMP51,
                 X10_TEMP52,
                 X10_TEMP53));
            
//#line 2254
final Particle X10_TEMP56 =
              (X10_TEMP697);
            
//#line 2255
final Particle X10_TEMP700 =
              (X10_TEMP56);
            
//#line 2257
final Particle X10_TEMP57 =
              (X10_TEMP700);
            
//#line 2258
final Particle X10_TEMP704 =
              (X10_TEMP57);
            
//#line 2260
final Particle X10_TEMP707 =
              (X10_TEMP704);
            
//#line 2261
/* template:array_set { */(X10_TEMP34).set((X10_TEMP707),k)/* } */;
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 2263
/* template:forloop-mult { */{
        x10.lang.region __var186__ = (x10.lang.region) P.
                                                         distribution.
                                                         region;
        if (__var186__.size() > 0 && (__var186__ instanceof x10.array.MultiDimRegion || __var186__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var187__ = __var186__.rank(0).low(), __var188__ = __var186__.rank(0).high(); __var187__ <= __var188__; __var187__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int j = __var187__;
        /* } */
        /* } */
{
            
//#line 2264
final int X10_TEMP710 =
              (0);
            
//#line 2266
final int X10_TEMP61 =
              (X10_TEMP710);
            
//#line 2267
final int X10_TEMP713 =
              (2);
            
//#line 2269
final int X10_TEMP62 =
              (X10_TEMP713);
            
//#line 2270
final x10.
              lang.
              region X10_TEMP718 =
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
                      X10_TEMP61,
                      X10_TEMP62))));
            
//#line 2272
final x10.
              lang.
              region X10_TEMP63 =
              (x10.
                lang.
                region)
                ((X10_TEMP718));
            
//#line 2273
final x10.
              lang.
              place X10_TEMP721 =
              (/* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 2275
final x10.
              lang.
              place X10_TEMP64 =
              (X10_TEMP721);
            
//#line 2276
final x10.
              lang.
              dist X10_TEMP724 =
              (x10.
                lang.
                dist)
                ((x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    X10_TEMP63,
                    X10_TEMP64)));
            
//#line 2278
final x10.
              lang.
              dist dD =
              (x10.
                lang.
                dist)
                ((X10_TEMP724));
            
//#line 2279
final int X10_TEMP727 =
              (0);
            
//#line 2281
final int X10_TEMP68 =
              (X10_TEMP727);
            
//#line 2282
final int X10_TEMP730 =
              (0);
            
//#line 2284
final int X10_TEMP69 =
              (X10_TEMP730);
            
//#line 2285
final x10.
              lang.
              region X10_TEMP735 =
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
                      X10_TEMP68,
                      X10_TEMP69))));
            
//#line 2287
final x10.
              lang.
              region X10_TEMP70 =
              (x10.
                lang.
                region)
                ((X10_TEMP735));
            
//#line 2288
final x10.
              lang.
              place X10_TEMP738 =
              (/* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 2290
final x10.
              lang.
              place X10_TEMP71 =
              (X10_TEMP738);
            
//#line 2291
final x10.
              lang.
              dist X10_TEMP741 =
              (x10.
                lang.
                dist)
                ((x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    X10_TEMP70,
                    X10_TEMP71)));
            
//#line 2293
final x10.
              lang.
              dist dI =
              (x10.
                lang.
                dist)
                ((X10_TEMP741));
            
//#line 2294
final x10.
              lang.
              DoubleReferenceArray X10_TEMP744 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dD,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
            
//#line 2296
final x10.
              lang.
              DoubleReferenceArray dataD =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP744));
            
//#line 2297
final x10.
              lang.
              DoubleReferenceArray X10_TEMP747 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dI,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
            
//#line 2299
final x10.
              lang.
              DoubleReferenceArray dataI =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP747));
            
//#line 2300
final int X10_TEMP750 =
              (0);
            
//#line 2302
final int X10_TEMP81 =
              (X10_TEMP750);
            
//#line 2303
final int X10_TEMP753 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
            
//#line 2305
final int X10_TEMP76 =
              (X10_TEMP753);
            
//#line 2306
final int X10_TEMP756 =
              (1);
            
//#line 2308
final int X10_TEMP77 =
              (X10_TEMP756);
            
//#line 2309
final int X10_TEMP759 =
              (X10_TEMP76 -
                 X10_TEMP77);
            
//#line 2311
final int X10_TEMP79 =
              (X10_TEMP759);
            
//#line 2312
final x10.
              lang.
              region X10_TEMP764 =
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
                      X10_TEMP81,
                      X10_TEMP79))));
            
//#line 2314
final x10.
              lang.
              region X10_TEMP83 =
              (x10.
                lang.
                region)
                ((X10_TEMP764));
            
//#line 2315
/* template:forloop-mult { */{
            x10.lang.region __var189__ = (x10.lang.region) X10_TEMP83;
            if (__var189__.size() > 0 && (__var189__ instanceof x10.array.MultiDimRegion || __var189__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var190__ = __var189__.rank(0).low(), __var191__ = __var189__.rank(0).high(); __var190__ <= __var191__; __var190__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int k = __var190__;
            /* } */
            /* } */
{
                
//#line 2316
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 2317
final x10.
                      lang.
                      dist X10_TEMP768 =
                      (x10.
                        lang.
                        dist)
                        ((P.
                            distribution));
                    
//#line 2319
final x10.
                      lang.
                      dist X10_TEMP84 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP768));
                    
//#line 2320
final x10.
                      lang.
                      place X10_TEMP87 =
                      (X10_TEMP84.
                         get(
                         j));
                    
//#line 2321
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP87)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 2322
final md X10_TEMP775 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 2324
final md X10_TEMP89 =
                          (X10_TEMP775);
                        
//#line 2325
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP778 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP89))/* } */.one));
                        
//#line 2327
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP90 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP778));
                        
//#line 2328
final Particle X10_TEMP782 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP90).get(k))/* } */))/* } */);
                        
//#line 2330
final Particle X10_TEMP92 =
                          (X10_TEMP782);
                        
//#line 2331
final double X10_TEMP785 =
                          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP92))/* } */.xforce);
                        
//#line 2333
final double fx =
                          (X10_TEMP785);
                        
//#line 2334
final md X10_TEMP789 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 2336
final md X10_TEMP95 =
                          (X10_TEMP789);
                        
//#line 2337
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP792 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP95))/* } */.one));
                        
//#line 2339
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP96 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP792));
                        
//#line 2340
final Particle X10_TEMP796 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP96).get(k))/* } */))/* } */);
                        
//#line 2342
final Particle X10_TEMP98 =
                          (X10_TEMP796);
                        
//#line 2343
final double X10_TEMP799 =
                          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP98))/* } */.yforce);
                        
//#line 2345
final double fy =
                          (X10_TEMP799);
                        
//#line 2346
final md X10_TEMP803 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 2348
final md X10_TEMP101 =
                          (X10_TEMP803);
                        
//#line 2349
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP806 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP101))/* } */.one));
                        
//#line 2351
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP102 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP806));
                        
//#line 2352
final Particle X10_TEMP810 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP102).get(k))/* } */))/* } */);
                        
//#line 2354
final Particle X10_TEMP104 =
                          (X10_TEMP810);
                        
//#line 2355
final double X10_TEMP813 =
                          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP104))/* } */.zforce);
                        
//#line 2357
final double fz =
                          (X10_TEMP813);
                        
//#line 2358
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 2359
/* template:Async { */(x10.lang.Runtime.asPlace(tHere)).runAsync
                            	(new x10.runtime.Activity() {
                            		public void runX10Task() {
                            			{
                                
//#line 2360
final int X10_TEMP817 =
                                  (0);
                                
//#line 2362
final int X10_TEMP108 =
                                  (X10_TEMP817);
                                
//#line 2363
final double X10_TEMP820 =
                                  (fx);
                                
//#line 2365
final double X10_TEMP111 =
                                  (X10_TEMP820);
                                
//#line 2366
final double X10_TEMP824 =
                                  (X10_TEMP111);
                                
//#line 2368
final double X10_TEMP827 =
                                  (X10_TEMP824);
                                
//#line 2369
/* template:array_set { */(dataD).set((X10_TEMP827),X10_TEMP108)/* } */;
                                
//#line 2370
final int X10_TEMP829 =
                                  (1);
                                
//#line 2372
final int X10_TEMP113 =
                                  (X10_TEMP829);
                                
//#line 2373
final double X10_TEMP832 =
                                  (fy);
                                
//#line 2375
final double X10_TEMP116 =
                                  (X10_TEMP832);
                                
//#line 2376
final double X10_TEMP836 =
                                  (X10_TEMP116);
                                
//#line 2378
final double X10_TEMP839 =
                                  (X10_TEMP836);
                                
//#line 2379
/* template:array_set { */(dataD).set((X10_TEMP839),X10_TEMP113)/* } */;
                                
//#line 2380
final int X10_TEMP841 =
                                  (2);
                                
//#line 2382
final int X10_TEMP118 =
                                  (X10_TEMP841);
                                
//#line 2383
final double X10_TEMP844 =
                                  (fz);
                                
//#line 2385
final double X10_TEMP121 =
                                  (X10_TEMP844);
                                
//#line 2386
final double X10_TEMP848 =
                                  (X10_TEMP121);
                                
//#line 2388
final double X10_TEMP851 =
                                  (X10_TEMP848);
                                
//#line 2389
/* template:array_set { */(dataD).set((X10_TEMP851),X10_TEMP118)/* } */;
                            }
                            		}
                            	});/* } */
                        }
                        	} catch (Throwable tmp193) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp193);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                    }
                    		}
                    	});/* } */
                }
                	} catch (Throwable tmp192) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp192);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 2394
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP853 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                
//#line 2396
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP122 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP853));
                
//#line 2397
final Particle X10_TEMP857 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP122).get(k))/* } */))/* } */);
                
//#line 2399
final Particle X10_TEMP124 =
                  (X10_TEMP857);
                
//#line 2400
final int X10_TEMP860 =
                  (0);
                
//#line 2402
final int X10_TEMP126 =
                  (X10_TEMP860);
                
//#line 2403
final double X10_TEMP863 =
                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP124))/* } */.xforce);
                
//#line 2405
final double X10_TEMP128 =
                  (X10_TEMP863);
                
//#line 2406
final double X10_TEMP867 =
                  (/* template:array_get { */((dataD).get(X10_TEMP126))/* } */);
                
//#line 2408
final double X10_TEMP129 =
                  (X10_TEMP867);
                
//#line 2409
final double X10_TEMP870 =
                  (X10_TEMP128 +
                     X10_TEMP129);
                
//#line 2411
final double X10_TEMP130 =
                  (X10_TEMP870);
                
//#line 2412
final double X10_TEMP873 =
                  (X10_TEMP130);
                
//#line 2414
final double X10_TEMP876 =
                  (X10_TEMP873);
                
//#line 2415
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP124))/* } */.xforce =
                  ((X10_TEMP876));
                
//#line 2416
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP878 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                
//#line 2418
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP131 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP878));
                
//#line 2419
final Particle X10_TEMP882 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP131).get(k))/* } */))/* } */);
                
//#line 2421
final Particle X10_TEMP133 =
                  (X10_TEMP882);
                
//#line 2422
final int X10_TEMP885 =
                  (1);
                
//#line 2424
final int X10_TEMP135 =
                  (X10_TEMP885);
                
//#line 2425
final double X10_TEMP888 =
                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP133))/* } */.yforce);
                
//#line 2427
final double X10_TEMP137 =
                  (X10_TEMP888);
                
//#line 2428
final double X10_TEMP892 =
                  (/* template:array_get { */((dataD).get(X10_TEMP135))/* } */);
                
//#line 2430
final double X10_TEMP138 =
                  (X10_TEMP892);
                
//#line 2431
final double X10_TEMP895 =
                  (X10_TEMP137 +
                     X10_TEMP138);
                
//#line 2433
final double X10_TEMP139 =
                  (X10_TEMP895);
                
//#line 2434
final double X10_TEMP898 =
                  (X10_TEMP139);
                
//#line 2436
final double X10_TEMP901 =
                  (X10_TEMP898);
                
//#line 2437
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP133))/* } */.yforce =
                  ((X10_TEMP901));
                
//#line 2438
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP903 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                
//#line 2440
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP140 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP903));
                
//#line 2441
final Particle X10_TEMP907 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP140).get(k))/* } */))/* } */);
                
//#line 2443
final Particle X10_TEMP142 =
                  (X10_TEMP907);
                
//#line 2444
final int X10_TEMP910 =
                  (2);
                
//#line 2446
final int X10_TEMP144 =
                  (X10_TEMP910);
                
//#line 2447
final double X10_TEMP913 =
                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP142))/* } */.zforce);
                
//#line 2449
final double X10_TEMP146 =
                  (X10_TEMP913);
                
//#line 2450
final double X10_TEMP917 =
                  (/* template:array_get { */((dataD).get(X10_TEMP144))/* } */);
                
//#line 2452
final double X10_TEMP147 =
                  (X10_TEMP917);
                
//#line 2453
final double X10_TEMP920 =
                  (X10_TEMP146 +
                     X10_TEMP147);
                
//#line 2455
final double X10_TEMP148 =
                  (X10_TEMP920);
                
//#line 2456
final double X10_TEMP923 =
                  (X10_TEMP148);
                
//#line 2458
final double X10_TEMP926 =
                  (X10_TEMP923);
                
//#line 2459
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP142))/* } */.zforce =
                  ((X10_TEMP926));
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var22____ = (__var189__).iterator(); __var22____.hasNext(); ) {
            	final  x10.
              lang.
              point __var22__ = (x10.
              lang.
              point) __var22____.next();
            	/* Join: { *//* Join: { */final int k =
              /* template:array_get { */((__var22__).get(0))/* } */;/* } */
{
                
//#line 2316
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 2317
final x10.
                      lang.
                      dist X10_TEMP768 =
                      (x10.
                        lang.
                        dist)
                        ((P.
                            distribution));
                    
//#line 2319
final x10.
                      lang.
                      dist X10_TEMP84 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP768));
                    
//#line 2320
final x10.
                      lang.
                      place X10_TEMP87 =
                      (X10_TEMP84.
                         get(
                         j));
                    
//#line 2321
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP87)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 2322
final md X10_TEMP775 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 2324
final md X10_TEMP89 =
                          (X10_TEMP775);
                        
//#line 2325
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP778 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP89))/* } */.one));
                        
//#line 2327
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP90 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP778));
                        
//#line 2328
final Particle X10_TEMP782 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP90).get(k))/* } */))/* } */);
                        
//#line 2330
final Particle X10_TEMP92 =
                          (X10_TEMP782);
                        
//#line 2331
final double X10_TEMP785 =
                          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP92))/* } */.xforce);
                        
//#line 2333
final double fx =
                          (X10_TEMP785);
                        
//#line 2334
final md X10_TEMP789 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 2336
final md X10_TEMP95 =
                          (X10_TEMP789);
                        
//#line 2337
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP792 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP95))/* } */.one));
                        
//#line 2339
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP96 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP792));
                        
//#line 2340
final Particle X10_TEMP796 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP96).get(k))/* } */))/* } */);
                        
//#line 2342
final Particle X10_TEMP98 =
                          (X10_TEMP796);
                        
//#line 2343
final double X10_TEMP799 =
                          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP98))/* } */.yforce);
                        
//#line 2345
final double fy =
                          (X10_TEMP799);
                        
//#line 2346
final md X10_TEMP803 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 2348
final md X10_TEMP101 =
                          (X10_TEMP803);
                        
//#line 2349
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP806 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP101))/* } */.one));
                        
//#line 2351
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP102 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP806));
                        
//#line 2352
final Particle X10_TEMP810 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP102).get(k))/* } */))/* } */);
                        
//#line 2354
final Particle X10_TEMP104 =
                          (X10_TEMP810);
                        
//#line 2355
final double X10_TEMP813 =
                          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP104))/* } */.zforce);
                        
//#line 2357
final double fz =
                          (X10_TEMP813);
                        
//#line 2358
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 2359
/* template:Async { */(x10.lang.Runtime.asPlace(tHere)).runAsync
                            	(new x10.runtime.Activity() {
                            		public void runX10Task() {
                            			{
                                
//#line 2360
final int X10_TEMP817 =
                                  (0);
                                
//#line 2362
final int X10_TEMP108 =
                                  (X10_TEMP817);
                                
//#line 2363
final double X10_TEMP820 =
                                  (fx);
                                
//#line 2365
final double X10_TEMP111 =
                                  (X10_TEMP820);
                                
//#line 2366
final double X10_TEMP824 =
                                  (X10_TEMP111);
                                
//#line 2368
final double X10_TEMP827 =
                                  (X10_TEMP824);
                                
//#line 2369
/* template:array_set { */(dataD).set((X10_TEMP827),X10_TEMP108)/* } */;
                                
//#line 2370
final int X10_TEMP829 =
                                  (1);
                                
//#line 2372
final int X10_TEMP113 =
                                  (X10_TEMP829);
                                
//#line 2373
final double X10_TEMP832 =
                                  (fy);
                                
//#line 2375
final double X10_TEMP116 =
                                  (X10_TEMP832);
                                
//#line 2376
final double X10_TEMP836 =
                                  (X10_TEMP116);
                                
//#line 2378
final double X10_TEMP839 =
                                  (X10_TEMP836);
                                
//#line 2379
/* template:array_set { */(dataD).set((X10_TEMP839),X10_TEMP113)/* } */;
                                
//#line 2380
final int X10_TEMP841 =
                                  (2);
                                
//#line 2382
final int X10_TEMP118 =
                                  (X10_TEMP841);
                                
//#line 2383
final double X10_TEMP844 =
                                  (fz);
                                
//#line 2385
final double X10_TEMP121 =
                                  (X10_TEMP844);
                                
//#line 2386
final double X10_TEMP848 =
                                  (X10_TEMP121);
                                
//#line 2388
final double X10_TEMP851 =
                                  (X10_TEMP848);
                                
//#line 2389
/* template:array_set { */(dataD).set((X10_TEMP851),X10_TEMP118)/* } */;
                            }
                            		}
                            	});/* } */
                        }
                        	} catch (Throwable tmp195) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp195);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                    }
                    		}
                    	});/* } */
                }
                	} catch (Throwable tmp194) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp194);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 2394
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP853 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                
//#line 2396
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP122 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP853));
                
//#line 2397
final Particle X10_TEMP857 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP122).get(k))/* } */))/* } */);
                
//#line 2399
final Particle X10_TEMP124 =
                  (X10_TEMP857);
                
//#line 2400
final int X10_TEMP860 =
                  (0);
                
//#line 2402
final int X10_TEMP126 =
                  (X10_TEMP860);
                
//#line 2403
final double X10_TEMP863 =
                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP124))/* } */.xforce);
                
//#line 2405
final double X10_TEMP128 =
                  (X10_TEMP863);
                
//#line 2406
final double X10_TEMP867 =
                  (/* template:array_get { */((dataD).get(X10_TEMP126))/* } */);
                
//#line 2408
final double X10_TEMP129 =
                  (X10_TEMP867);
                
//#line 2409
final double X10_TEMP870 =
                  (X10_TEMP128 +
                     X10_TEMP129);
                
//#line 2411
final double X10_TEMP130 =
                  (X10_TEMP870);
                
//#line 2412
final double X10_TEMP873 =
                  (X10_TEMP130);
                
//#line 2414
final double X10_TEMP876 =
                  (X10_TEMP873);
                
//#line 2415
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP124))/* } */.xforce =
                  ((X10_TEMP876));
                
//#line 2416
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP878 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                
//#line 2418
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP131 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP878));
                
//#line 2419
final Particle X10_TEMP882 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP131).get(k))/* } */))/* } */);
                
//#line 2421
final Particle X10_TEMP133 =
                  (X10_TEMP882);
                
//#line 2422
final int X10_TEMP885 =
                  (1);
                
//#line 2424
final int X10_TEMP135 =
                  (X10_TEMP885);
                
//#line 2425
final double X10_TEMP888 =
                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP133))/* } */.yforce);
                
//#line 2427
final double X10_TEMP137 =
                  (X10_TEMP888);
                
//#line 2428
final double X10_TEMP892 =
                  (/* template:array_get { */((dataD).get(X10_TEMP135))/* } */);
                
//#line 2430
final double X10_TEMP138 =
                  (X10_TEMP892);
                
//#line 2431
final double X10_TEMP895 =
                  (X10_TEMP137 +
                     X10_TEMP138);
                
//#line 2433
final double X10_TEMP139 =
                  (X10_TEMP895);
                
//#line 2434
final double X10_TEMP898 =
                  (X10_TEMP139);
                
//#line 2436
final double X10_TEMP901 =
                  (X10_TEMP898);
                
//#line 2437
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP133))/* } */.yforce =
                  ((X10_TEMP901));
                
//#line 2438
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP903 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                
//#line 2440
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP140 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP903));
                
//#line 2441
final Particle X10_TEMP907 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP140).get(k))/* } */))/* } */);
                
//#line 2443
final Particle X10_TEMP142 =
                  (X10_TEMP907);
                
//#line 2444
final int X10_TEMP910 =
                  (2);
                
//#line 2446
final int X10_TEMP144 =
                  (X10_TEMP910);
                
//#line 2447
final double X10_TEMP913 =
                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP142))/* } */.zforce);
                
//#line 2449
final double X10_TEMP146 =
                  (X10_TEMP913);
                
//#line 2450
final double X10_TEMP917 =
                  (/* template:array_get { */((dataD).get(X10_TEMP144))/* } */);
                
//#line 2452
final double X10_TEMP147 =
                  (X10_TEMP917);
                
//#line 2453
final double X10_TEMP920 =
                  (X10_TEMP146 +
                     X10_TEMP147);
                
//#line 2455
final double X10_TEMP148 =
                  (X10_TEMP920);
                
//#line 2456
final double X10_TEMP923 =
                  (X10_TEMP148);
                
//#line 2458
final double X10_TEMP926 =
                  (X10_TEMP923);
                
//#line 2459
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP142))/* } */.zforce =
                  ((X10_TEMP926));
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
            
//#line 2461
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 2462
final x10.
                  lang.
                  dist X10_TEMP928 =
                  (x10.
                    lang.
                    dist)
                    ((P.
                        distribution));
                
//#line 2464
final x10.
                  lang.
                  dist X10_TEMP149 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP928));
                
//#line 2465
final x10.
                  lang.
                  place X10_TEMP152 =
                  (X10_TEMP149.
                     get(
                     j));
                
//#line 2466
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP152)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 2467
final md X10_TEMP935 =
                      (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                    
//#line 2469
final md X10_TEMP154 =
                      (X10_TEMP935);
                    
//#line 2470
final double X10_TEMP938 =
                      (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP154))/* } */.vir);
                    
//#line 2472
final double jvir =
                      (X10_TEMP938);
                    
//#line 2473
final md X10_TEMP942 =
                      (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                    
//#line 2475
final md X10_TEMP157 =
                      (X10_TEMP942);
                    
//#line 2476
final double X10_TEMP945 =
                      (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP157))/* } */.epot);
                    
//#line 2478
final double jepot =
                      (X10_TEMP945);
                    
//#line 2479
final md X10_TEMP949 =
                      (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                    
//#line 2481
final md X10_TEMP160 =
                      (X10_TEMP949);
                    
//#line 2482
final int X10_TEMP952 =
                      (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP160))/* } */.interactions);
                    
//#line 2484
final int jinter =
                      (X10_TEMP952);
                    
//#line 2485
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 2486
/* template:Async { */(x10.lang.Runtime.asPlace(tHere)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 2487
final int X10_TEMP956 =
                              (0);
                            
//#line 2489
final int X10_TEMP164 =
                              (X10_TEMP956);
                            
//#line 2490
final double X10_TEMP959 =
                              (jvir);
                            
//#line 2492
final double X10_TEMP167 =
                              (X10_TEMP959);
                            
//#line 2493
final double X10_TEMP963 =
                              (X10_TEMP167);
                            
//#line 2495
final double X10_TEMP966 =
                              (X10_TEMP963);
                            
//#line 2496
/* template:array_set { */(dataD).set((X10_TEMP966),X10_TEMP164)/* } */;
                            
//#line 2497
final int X10_TEMP968 =
                              (1);
                            
//#line 2499
final int X10_TEMP169 =
                              (X10_TEMP968);
                            
//#line 2500
final double X10_TEMP971 =
                              (jepot);
                            
//#line 2502
final double X10_TEMP172 =
                              (X10_TEMP971);
                            
//#line 2503
final double X10_TEMP975 =
                              (X10_TEMP172);
                            
//#line 2505
final double X10_TEMP978 =
                              (X10_TEMP975);
                            
//#line 2506
/* template:array_set { */(dataD).set((X10_TEMP978),X10_TEMP169)/* } */;
                            
//#line 2507
final int X10_TEMP980 =
                              (0);
                            
//#line 2509
final int X10_TEMP174 =
                              (X10_TEMP980);
                            
//#line 2510
final int X10_TEMP983 =
                              (jinter);
                            
//#line 2512
final double X10_TEMP177 =
                              (X10_TEMP983);
                            
//#line 2513
final double X10_TEMP987 =
                              (X10_TEMP177);
                            
//#line 2515
final double X10_TEMP990 =
                              (X10_TEMP987);
                            
//#line 2516
/* template:array_set { */(dataI).set((X10_TEMP990),X10_TEMP174)/* } */;
                        }
                        		}
                        	});/* } */
                    }
                    	} catch (Throwable tmp197) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp197);
                    	} finally {
                    		x10.lang.Runtime.getCurrentActivity().stopFinish();
                    	}
                    }
                    /* } */
                    
                }
                		}
                	});/* } */
            }
            	} catch (Throwable tmp196) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp196);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 2521
final int X10_TEMP992 =
              (0);
            
//#line 2523
final int X10_TEMP179 =
              (X10_TEMP992);
            
//#line 2524
final double X10_TEMP995 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.vir);
            
//#line 2526
final double X10_TEMP181 =
              (X10_TEMP995);
            
//#line 2527
final double X10_TEMP999 =
              (/* template:array_get { */((dataD).get(X10_TEMP179))/* } */);
            
//#line 2529
final double X10_TEMP182 =
              (X10_TEMP999);
            
//#line 2530
final double X10_TEMP1002 =
              (X10_TEMP181 +
                 X10_TEMP182);
            
//#line 2532
final double X10_TEMP183 =
              (X10_TEMP1002);
            
//#line 2533
final double X10_TEMP1005 =
              (X10_TEMP183);
            
//#line 2535
final double X10_TEMP1008 =
              (X10_TEMP1005);
            
//#line 2536
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.vir =
              ((X10_TEMP1008));
            
//#line 2537
final int X10_TEMP1010 =
              (1);
            
//#line 2539
final int X10_TEMP185 =
              (X10_TEMP1010);
            
//#line 2540
final double X10_TEMP1013 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.epot);
            
//#line 2542
final double X10_TEMP187 =
              (X10_TEMP1013);
            
//#line 2543
final double X10_TEMP1017 =
              (/* template:array_get { */((dataD).get(X10_TEMP185))/* } */);
            
//#line 2545
final double X10_TEMP188 =
              (X10_TEMP1017);
            
//#line 2546
final double X10_TEMP1020 =
              (X10_TEMP187 +
                 X10_TEMP188);
            
//#line 2548
final double X10_TEMP189 =
              (X10_TEMP1020);
            
//#line 2549
final double X10_TEMP1023 =
              (X10_TEMP189);
            
//#line 2551
final double X10_TEMP1026 =
              (X10_TEMP1023);
            
//#line 2552
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.epot =
              ((X10_TEMP1026));
            
//#line 2553
final int X10_TEMP1028 =
              (0);
            
//#line 2555
final int X10_TEMP191 =
              (X10_TEMP1028);
            
//#line 2556
final double X10_TEMP1032 =
              (/* template:array_get { */((dataI).get(X10_TEMP191))/* } */);
            
//#line 2558
final double X10_TEMP192 =
              (X10_TEMP1032);
            
//#line 2559
final int X10_TEMP1035 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.interactions);
            
//#line 2561
final int X10_TEMP194 =
              (X10_TEMP1035);
            
//#line 2562
final int X10_TEMP1038 =
              ((int)
                 X10_TEMP192);
            
//#line 2564
final int X10_TEMP195 =
              (X10_TEMP1038);
            
//#line 2565
final int X10_TEMP1041 =
              (X10_TEMP194 +
                 X10_TEMP195);
            
//#line 2567
final int X10_TEMP196 =
              (X10_TEMP1041);
            
//#line 2568
final int X10_TEMP1044 =
              (X10_TEMP196);
            
//#line 2570
final int X10_TEMP1047 =
              (X10_TEMP1044);
            
//#line 2571
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.interactions =
              ((X10_TEMP1047));
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var21____ = (__var186__).iterator(); __var21____.hasNext(); ) {
        	final  x10.
          lang.
          point __var21__ = (x10.
          lang.
          point) __var21____.next();
        	/* Join: { *//* Join: { */final int j =
          /* template:array_get { */((__var21__).get(0))/* } */;/* } */
{
            
//#line 2264
final int X10_TEMP710 =
              (0);
            
//#line 2266
final int X10_TEMP61 =
              (X10_TEMP710);
            
//#line 2267
final int X10_TEMP713 =
              (2);
            
//#line 2269
final int X10_TEMP62 =
              (X10_TEMP713);
            
//#line 2270
final x10.
              lang.
              region X10_TEMP718 =
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
                      X10_TEMP61,
                      X10_TEMP62))));
            
//#line 2272
final x10.
              lang.
              region X10_TEMP63 =
              (x10.
                lang.
                region)
                ((X10_TEMP718));
            
//#line 2273
final x10.
              lang.
              place X10_TEMP721 =
              (/* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 2275
final x10.
              lang.
              place X10_TEMP64 =
              (X10_TEMP721);
            
//#line 2276
final x10.
              lang.
              dist X10_TEMP724 =
              (x10.
                lang.
                dist)
                ((x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    X10_TEMP63,
                    X10_TEMP64)));
            
//#line 2278
final x10.
              lang.
              dist dD =
              (x10.
                lang.
                dist)
                ((X10_TEMP724));
            
//#line 2279
final int X10_TEMP727 =
              (0);
            
//#line 2281
final int X10_TEMP68 =
              (X10_TEMP727);
            
//#line 2282
final int X10_TEMP730 =
              (0);
            
//#line 2284
final int X10_TEMP69 =
              (X10_TEMP730);
            
//#line 2285
final x10.
              lang.
              region X10_TEMP735 =
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
                      X10_TEMP68,
                      X10_TEMP69))));
            
//#line 2287
final x10.
              lang.
              region X10_TEMP70 =
              (x10.
                lang.
                region)
                ((X10_TEMP735));
            
//#line 2288
final x10.
              lang.
              place X10_TEMP738 =
              (/* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 2290
final x10.
              lang.
              place X10_TEMP71 =
              (X10_TEMP738);
            
//#line 2291
final x10.
              lang.
              dist X10_TEMP741 =
              (x10.
                lang.
                dist)
                ((x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    X10_TEMP70,
                    X10_TEMP71)));
            
//#line 2293
final x10.
              lang.
              dist dI =
              (x10.
                lang.
                dist)
                ((X10_TEMP741));
            
//#line 2294
final x10.
              lang.
              DoubleReferenceArray X10_TEMP744 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dD,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
            
//#line 2296
final x10.
              lang.
              DoubleReferenceArray dataD =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP744));
            
//#line 2297
final x10.
              lang.
              DoubleReferenceArray X10_TEMP747 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dI,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
            
//#line 2299
final x10.
              lang.
              DoubleReferenceArray dataI =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP747));
            
//#line 2300
final int X10_TEMP750 =
              (0);
            
//#line 2302
final int X10_TEMP81 =
              (X10_TEMP750);
            
//#line 2303
final int X10_TEMP753 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
            
//#line 2305
final int X10_TEMP76 =
              (X10_TEMP753);
            
//#line 2306
final int X10_TEMP756 =
              (1);
            
//#line 2308
final int X10_TEMP77 =
              (X10_TEMP756);
            
//#line 2309
final int X10_TEMP759 =
              (X10_TEMP76 -
                 X10_TEMP77);
            
//#line 2311
final int X10_TEMP79 =
              (X10_TEMP759);
            
//#line 2312
final x10.
              lang.
              region X10_TEMP764 =
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
                      X10_TEMP81,
                      X10_TEMP79))));
            
//#line 2314
final x10.
              lang.
              region X10_TEMP83 =
              (x10.
                lang.
                region)
                ((X10_TEMP764));
            
//#line 2315
/* template:forloop-mult { */{
            x10.lang.region __var198__ = (x10.lang.region) X10_TEMP83;
            if (__var198__.size() > 0 && (__var198__ instanceof x10.array.MultiDimRegion || __var198__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var199__ = __var198__.rank(0).low(), __var200__ = __var198__.rank(0).high(); __var199__ <= __var200__; __var199__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int k = __var199__;
            /* } */
            /* } */
{
                
//#line 2316
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 2317
final x10.
                      lang.
                      dist X10_TEMP768 =
                      (x10.
                        lang.
                        dist)
                        ((P.
                            distribution));
                    
//#line 2319
final x10.
                      lang.
                      dist X10_TEMP84 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP768));
                    
//#line 2320
final x10.
                      lang.
                      place X10_TEMP87 =
                      (X10_TEMP84.
                         get(
                         j));
                    
//#line 2321
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP87)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 2322
final md X10_TEMP775 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 2324
final md X10_TEMP89 =
                          (X10_TEMP775);
                        
//#line 2325
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP778 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP89))/* } */.one));
                        
//#line 2327
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP90 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP778));
                        
//#line 2328
final Particle X10_TEMP782 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP90).get(k))/* } */))/* } */);
                        
//#line 2330
final Particle X10_TEMP92 =
                          (X10_TEMP782);
                        
//#line 2331
final double X10_TEMP785 =
                          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP92))/* } */.xforce);
                        
//#line 2333
final double fx =
                          (X10_TEMP785);
                        
//#line 2334
final md X10_TEMP789 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 2336
final md X10_TEMP95 =
                          (X10_TEMP789);
                        
//#line 2337
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP792 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP95))/* } */.one));
                        
//#line 2339
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP96 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP792));
                        
//#line 2340
final Particle X10_TEMP796 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP96).get(k))/* } */))/* } */);
                        
//#line 2342
final Particle X10_TEMP98 =
                          (X10_TEMP796);
                        
//#line 2343
final double X10_TEMP799 =
                          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP98))/* } */.yforce);
                        
//#line 2345
final double fy =
                          (X10_TEMP799);
                        
//#line 2346
final md X10_TEMP803 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 2348
final md X10_TEMP101 =
                          (X10_TEMP803);
                        
//#line 2349
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP806 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP101))/* } */.one));
                        
//#line 2351
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP102 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP806));
                        
//#line 2352
final Particle X10_TEMP810 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP102).get(k))/* } */))/* } */);
                        
//#line 2354
final Particle X10_TEMP104 =
                          (X10_TEMP810);
                        
//#line 2355
final double X10_TEMP813 =
                          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP104))/* } */.zforce);
                        
//#line 2357
final double fz =
                          (X10_TEMP813);
                        
//#line 2358
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 2359
/* template:Async { */(x10.lang.Runtime.asPlace(tHere)).runAsync
                            	(new x10.runtime.Activity() {
                            		public void runX10Task() {
                            			{
                                
//#line 2360
final int X10_TEMP817 =
                                  (0);
                                
//#line 2362
final int X10_TEMP108 =
                                  (X10_TEMP817);
                                
//#line 2363
final double X10_TEMP820 =
                                  (fx);
                                
//#line 2365
final double X10_TEMP111 =
                                  (X10_TEMP820);
                                
//#line 2366
final double X10_TEMP824 =
                                  (X10_TEMP111);
                                
//#line 2368
final double X10_TEMP827 =
                                  (X10_TEMP824);
                                
//#line 2369
/* template:array_set { */(dataD).set((X10_TEMP827),X10_TEMP108)/* } */;
                                
//#line 2370
final int X10_TEMP829 =
                                  (1);
                                
//#line 2372
final int X10_TEMP113 =
                                  (X10_TEMP829);
                                
//#line 2373
final double X10_TEMP832 =
                                  (fy);
                                
//#line 2375
final double X10_TEMP116 =
                                  (X10_TEMP832);
                                
//#line 2376
final double X10_TEMP836 =
                                  (X10_TEMP116);
                                
//#line 2378
final double X10_TEMP839 =
                                  (X10_TEMP836);
                                
//#line 2379
/* template:array_set { */(dataD).set((X10_TEMP839),X10_TEMP113)/* } */;
                                
//#line 2380
final int X10_TEMP841 =
                                  (2);
                                
//#line 2382
final int X10_TEMP118 =
                                  (X10_TEMP841);
                                
//#line 2383
final double X10_TEMP844 =
                                  (fz);
                                
//#line 2385
final double X10_TEMP121 =
                                  (X10_TEMP844);
                                
//#line 2386
final double X10_TEMP848 =
                                  (X10_TEMP121);
                                
//#line 2388
final double X10_TEMP851 =
                                  (X10_TEMP848);
                                
//#line 2389
/* template:array_set { */(dataD).set((X10_TEMP851),X10_TEMP118)/* } */;
                            }
                            		}
                            	});/* } */
                        }
                        	} catch (Throwable tmp202) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp202);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                    }
                    		}
                    	});/* } */
                }
                	} catch (Throwable tmp201) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp201);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 2394
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP853 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                
//#line 2396
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP122 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP853));
                
//#line 2397
final Particle X10_TEMP857 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP122).get(k))/* } */))/* } */);
                
//#line 2399
final Particle X10_TEMP124 =
                  (X10_TEMP857);
                
//#line 2400
final int X10_TEMP860 =
                  (0);
                
//#line 2402
final int X10_TEMP126 =
                  (X10_TEMP860);
                
//#line 2403
final double X10_TEMP863 =
                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP124))/* } */.xforce);
                
//#line 2405
final double X10_TEMP128 =
                  (X10_TEMP863);
                
//#line 2406
final double X10_TEMP867 =
                  (/* template:array_get { */((dataD).get(X10_TEMP126))/* } */);
                
//#line 2408
final double X10_TEMP129 =
                  (X10_TEMP867);
                
//#line 2409
final double X10_TEMP870 =
                  (X10_TEMP128 +
                     X10_TEMP129);
                
//#line 2411
final double X10_TEMP130 =
                  (X10_TEMP870);
                
//#line 2412
final double X10_TEMP873 =
                  (X10_TEMP130);
                
//#line 2414
final double X10_TEMP876 =
                  (X10_TEMP873);
                
//#line 2415
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP124))/* } */.xforce =
                  ((X10_TEMP876));
                
//#line 2416
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP878 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                
//#line 2418
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP131 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP878));
                
//#line 2419
final Particle X10_TEMP882 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP131).get(k))/* } */))/* } */);
                
//#line 2421
final Particle X10_TEMP133 =
                  (X10_TEMP882);
                
//#line 2422
final int X10_TEMP885 =
                  (1);
                
//#line 2424
final int X10_TEMP135 =
                  (X10_TEMP885);
                
//#line 2425
final double X10_TEMP888 =
                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP133))/* } */.yforce);
                
//#line 2427
final double X10_TEMP137 =
                  (X10_TEMP888);
                
//#line 2428
final double X10_TEMP892 =
                  (/* template:array_get { */((dataD).get(X10_TEMP135))/* } */);
                
//#line 2430
final double X10_TEMP138 =
                  (X10_TEMP892);
                
//#line 2431
final double X10_TEMP895 =
                  (X10_TEMP137 +
                     X10_TEMP138);
                
//#line 2433
final double X10_TEMP139 =
                  (X10_TEMP895);
                
//#line 2434
final double X10_TEMP898 =
                  (X10_TEMP139);
                
//#line 2436
final double X10_TEMP901 =
                  (X10_TEMP898);
                
//#line 2437
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP133))/* } */.yforce =
                  ((X10_TEMP901));
                
//#line 2438
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP903 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                
//#line 2440
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP140 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP903));
                
//#line 2441
final Particle X10_TEMP907 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP140).get(k))/* } */))/* } */);
                
//#line 2443
final Particle X10_TEMP142 =
                  (X10_TEMP907);
                
//#line 2444
final int X10_TEMP910 =
                  (2);
                
//#line 2446
final int X10_TEMP144 =
                  (X10_TEMP910);
                
//#line 2447
final double X10_TEMP913 =
                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP142))/* } */.zforce);
                
//#line 2449
final double X10_TEMP146 =
                  (X10_TEMP913);
                
//#line 2450
final double X10_TEMP917 =
                  (/* template:array_get { */((dataD).get(X10_TEMP144))/* } */);
                
//#line 2452
final double X10_TEMP147 =
                  (X10_TEMP917);
                
//#line 2453
final double X10_TEMP920 =
                  (X10_TEMP146 +
                     X10_TEMP147);
                
//#line 2455
final double X10_TEMP148 =
                  (X10_TEMP920);
                
//#line 2456
final double X10_TEMP923 =
                  (X10_TEMP148);
                
//#line 2458
final double X10_TEMP926 =
                  (X10_TEMP923);
                
//#line 2459
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP142))/* } */.zforce =
                  ((X10_TEMP926));
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var22____ = (__var198__).iterator(); __var22____.hasNext(); ) {
            	final  x10.
              lang.
              point __var22__ = (x10.
              lang.
              point) __var22____.next();
            	/* Join: { *//* Join: { */final int k =
              /* template:array_get { */((__var22__).get(0))/* } */;/* } */
{
                
//#line 2316
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 2317
final x10.
                      lang.
                      dist X10_TEMP768 =
                      (x10.
                        lang.
                        dist)
                        ((P.
                            distribution));
                    
//#line 2319
final x10.
                      lang.
                      dist X10_TEMP84 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP768));
                    
//#line 2320
final x10.
                      lang.
                      place X10_TEMP87 =
                      (X10_TEMP84.
                         get(
                         j));
                    
//#line 2321
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP87)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 2322
final md X10_TEMP775 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 2324
final md X10_TEMP89 =
                          (X10_TEMP775);
                        
//#line 2325
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP778 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP89))/* } */.one));
                        
//#line 2327
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP90 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP778));
                        
//#line 2328
final Particle X10_TEMP782 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP90).get(k))/* } */))/* } */);
                        
//#line 2330
final Particle X10_TEMP92 =
                          (X10_TEMP782);
                        
//#line 2331
final double X10_TEMP785 =
                          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP92))/* } */.xforce);
                        
//#line 2333
final double fx =
                          (X10_TEMP785);
                        
//#line 2334
final md X10_TEMP789 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 2336
final md X10_TEMP95 =
                          (X10_TEMP789);
                        
//#line 2337
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP792 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP95))/* } */.one));
                        
//#line 2339
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP96 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP792));
                        
//#line 2340
final Particle X10_TEMP796 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP96).get(k))/* } */))/* } */);
                        
//#line 2342
final Particle X10_TEMP98 =
                          (X10_TEMP796);
                        
//#line 2343
final double X10_TEMP799 =
                          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP98))/* } */.yforce);
                        
//#line 2345
final double fy =
                          (X10_TEMP799);
                        
//#line 2346
final md X10_TEMP803 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 2348
final md X10_TEMP101 =
                          (X10_TEMP803);
                        
//#line 2349
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP806 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP101))/* } */.one));
                        
//#line 2351
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP102 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP806));
                        
//#line 2352
final Particle X10_TEMP810 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP102).get(k))/* } */))/* } */);
                        
//#line 2354
final Particle X10_TEMP104 =
                          (X10_TEMP810);
                        
//#line 2355
final double X10_TEMP813 =
                          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP104))/* } */.zforce);
                        
//#line 2357
final double fz =
                          (X10_TEMP813);
                        
//#line 2358
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 2359
/* template:Async { */(x10.lang.Runtime.asPlace(tHere)).runAsync
                            	(new x10.runtime.Activity() {
                            		public void runX10Task() {
                            			{
                                
//#line 2360
final int X10_TEMP817 =
                                  (0);
                                
//#line 2362
final int X10_TEMP108 =
                                  (X10_TEMP817);
                                
//#line 2363
final double X10_TEMP820 =
                                  (fx);
                                
//#line 2365
final double X10_TEMP111 =
                                  (X10_TEMP820);
                                
//#line 2366
final double X10_TEMP824 =
                                  (X10_TEMP111);
                                
//#line 2368
final double X10_TEMP827 =
                                  (X10_TEMP824);
                                
//#line 2369
/* template:array_set { */(dataD).set((X10_TEMP827),X10_TEMP108)/* } */;
                                
//#line 2370
final int X10_TEMP829 =
                                  (1);
                                
//#line 2372
final int X10_TEMP113 =
                                  (X10_TEMP829);
                                
//#line 2373
final double X10_TEMP832 =
                                  (fy);
                                
//#line 2375
final double X10_TEMP116 =
                                  (X10_TEMP832);
                                
//#line 2376
final double X10_TEMP836 =
                                  (X10_TEMP116);
                                
//#line 2378
final double X10_TEMP839 =
                                  (X10_TEMP836);
                                
//#line 2379
/* template:array_set { */(dataD).set((X10_TEMP839),X10_TEMP113)/* } */;
                                
//#line 2380
final int X10_TEMP841 =
                                  (2);
                                
//#line 2382
final int X10_TEMP118 =
                                  (X10_TEMP841);
                                
//#line 2383
final double X10_TEMP844 =
                                  (fz);
                                
//#line 2385
final double X10_TEMP121 =
                                  (X10_TEMP844);
                                
//#line 2386
final double X10_TEMP848 =
                                  (X10_TEMP121);
                                
//#line 2388
final double X10_TEMP851 =
                                  (X10_TEMP848);
                                
//#line 2389
/* template:array_set { */(dataD).set((X10_TEMP851),X10_TEMP118)/* } */;
                            }
                            		}
                            	});/* } */
                        }
                        	} catch (Throwable tmp204) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp204);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                    }
                    		}
                    	});/* } */
                }
                	} catch (Throwable tmp203) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp203);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 2394
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP853 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                
//#line 2396
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP122 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP853));
                
//#line 2397
final Particle X10_TEMP857 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP122).get(k))/* } */))/* } */);
                
//#line 2399
final Particle X10_TEMP124 =
                  (X10_TEMP857);
                
//#line 2400
final int X10_TEMP860 =
                  (0);
                
//#line 2402
final int X10_TEMP126 =
                  (X10_TEMP860);
                
//#line 2403
final double X10_TEMP863 =
                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP124))/* } */.xforce);
                
//#line 2405
final double X10_TEMP128 =
                  (X10_TEMP863);
                
//#line 2406
final double X10_TEMP867 =
                  (/* template:array_get { */((dataD).get(X10_TEMP126))/* } */);
                
//#line 2408
final double X10_TEMP129 =
                  (X10_TEMP867);
                
//#line 2409
final double X10_TEMP870 =
                  (X10_TEMP128 +
                     X10_TEMP129);
                
//#line 2411
final double X10_TEMP130 =
                  (X10_TEMP870);
                
//#line 2412
final double X10_TEMP873 =
                  (X10_TEMP130);
                
//#line 2414
final double X10_TEMP876 =
                  (X10_TEMP873);
                
//#line 2415
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP124))/* } */.xforce =
                  ((X10_TEMP876));
                
//#line 2416
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP878 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                
//#line 2418
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP131 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP878));
                
//#line 2419
final Particle X10_TEMP882 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP131).get(k))/* } */))/* } */);
                
//#line 2421
final Particle X10_TEMP133 =
                  (X10_TEMP882);
                
//#line 2422
final int X10_TEMP885 =
                  (1);
                
//#line 2424
final int X10_TEMP135 =
                  (X10_TEMP885);
                
//#line 2425
final double X10_TEMP888 =
                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP133))/* } */.yforce);
                
//#line 2427
final double X10_TEMP137 =
                  (X10_TEMP888);
                
//#line 2428
final double X10_TEMP892 =
                  (/* template:array_get { */((dataD).get(X10_TEMP135))/* } */);
                
//#line 2430
final double X10_TEMP138 =
                  (X10_TEMP892);
                
//#line 2431
final double X10_TEMP895 =
                  (X10_TEMP137 +
                     X10_TEMP138);
                
//#line 2433
final double X10_TEMP139 =
                  (X10_TEMP895);
                
//#line 2434
final double X10_TEMP898 =
                  (X10_TEMP139);
                
//#line 2436
final double X10_TEMP901 =
                  (X10_TEMP898);
                
//#line 2437
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP133))/* } */.yforce =
                  ((X10_TEMP901));
                
//#line 2438
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP903 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                
//#line 2440
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP140 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP903));
                
//#line 2441
final Particle X10_TEMP907 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP140).get(k))/* } */))/* } */);
                
//#line 2443
final Particle X10_TEMP142 =
                  (X10_TEMP907);
                
//#line 2444
final int X10_TEMP910 =
                  (2);
                
//#line 2446
final int X10_TEMP144 =
                  (X10_TEMP910);
                
//#line 2447
final double X10_TEMP913 =
                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP142))/* } */.zforce);
                
//#line 2449
final double X10_TEMP146 =
                  (X10_TEMP913);
                
//#line 2450
final double X10_TEMP917 =
                  (/* template:array_get { */((dataD).get(X10_TEMP144))/* } */);
                
//#line 2452
final double X10_TEMP147 =
                  (X10_TEMP917);
                
//#line 2453
final double X10_TEMP920 =
                  (X10_TEMP146 +
                     X10_TEMP147);
                
//#line 2455
final double X10_TEMP148 =
                  (X10_TEMP920);
                
//#line 2456
final double X10_TEMP923 =
                  (X10_TEMP148);
                
//#line 2458
final double X10_TEMP926 =
                  (X10_TEMP923);
                
//#line 2459
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP142))/* } */.zforce =
                  ((X10_TEMP926));
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
            
//#line 2461
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 2462
final x10.
                  lang.
                  dist X10_TEMP928 =
                  (x10.
                    lang.
                    dist)
                    ((P.
                        distribution));
                
//#line 2464
final x10.
                  lang.
                  dist X10_TEMP149 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP928));
                
//#line 2465
final x10.
                  lang.
                  place X10_TEMP152 =
                  (X10_TEMP149.
                     get(
                     j));
                
//#line 2466
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP152)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 2467
final md X10_TEMP935 =
                      (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                    
//#line 2469
final md X10_TEMP154 =
                      (X10_TEMP935);
                    
//#line 2470
final double X10_TEMP938 =
                      (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP154))/* } */.vir);
                    
//#line 2472
final double jvir =
                      (X10_TEMP938);
                    
//#line 2473
final md X10_TEMP942 =
                      (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                    
//#line 2475
final md X10_TEMP157 =
                      (X10_TEMP942);
                    
//#line 2476
final double X10_TEMP945 =
                      (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP157))/* } */.epot);
                    
//#line 2478
final double jepot =
                      (X10_TEMP945);
                    
//#line 2479
final md X10_TEMP949 =
                      (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                    
//#line 2481
final md X10_TEMP160 =
                      (X10_TEMP949);
                    
//#line 2482
final int X10_TEMP952 =
                      (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP160))/* } */.interactions);
                    
//#line 2484
final int jinter =
                      (X10_TEMP952);
                    
//#line 2485
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 2486
/* template:Async { */(x10.lang.Runtime.asPlace(tHere)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 2487
final int X10_TEMP956 =
                              (0);
                            
//#line 2489
final int X10_TEMP164 =
                              (X10_TEMP956);
                            
//#line 2490
final double X10_TEMP959 =
                              (jvir);
                            
//#line 2492
final double X10_TEMP167 =
                              (X10_TEMP959);
                            
//#line 2493
final double X10_TEMP963 =
                              (X10_TEMP167);
                            
//#line 2495
final double X10_TEMP966 =
                              (X10_TEMP963);
                            
//#line 2496
/* template:array_set { */(dataD).set((X10_TEMP966),X10_TEMP164)/* } */;
                            
//#line 2497
final int X10_TEMP968 =
                              (1);
                            
//#line 2499
final int X10_TEMP169 =
                              (X10_TEMP968);
                            
//#line 2500
final double X10_TEMP971 =
                              (jepot);
                            
//#line 2502
final double X10_TEMP172 =
                              (X10_TEMP971);
                            
//#line 2503
final double X10_TEMP975 =
                              (X10_TEMP172);
                            
//#line 2505
final double X10_TEMP978 =
                              (X10_TEMP975);
                            
//#line 2506
/* template:array_set { */(dataD).set((X10_TEMP978),X10_TEMP169)/* } */;
                            
//#line 2507
final int X10_TEMP980 =
                              (0);
                            
//#line 2509
final int X10_TEMP174 =
                              (X10_TEMP980);
                            
//#line 2510
final int X10_TEMP983 =
                              (jinter);
                            
//#line 2512
final double X10_TEMP177 =
                              (X10_TEMP983);
                            
//#line 2513
final double X10_TEMP987 =
                              (X10_TEMP177);
                            
//#line 2515
final double X10_TEMP990 =
                              (X10_TEMP987);
                            
//#line 2516
/* template:array_set { */(dataI).set((X10_TEMP990),X10_TEMP174)/* } */;
                        }
                        		}
                        	});/* } */
                    }
                    	} catch (Throwable tmp206) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp206);
                    	} finally {
                    		x10.lang.Runtime.getCurrentActivity().stopFinish();
                    	}
                    }
                    /* } */
                    
                }
                		}
                	});/* } */
            }
            	} catch (Throwable tmp205) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp205);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 2521
final int X10_TEMP992 =
              (0);
            
//#line 2523
final int X10_TEMP179 =
              (X10_TEMP992);
            
//#line 2524
final double X10_TEMP995 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.vir);
            
//#line 2526
final double X10_TEMP181 =
              (X10_TEMP995);
            
//#line 2527
final double X10_TEMP999 =
              (/* template:array_get { */((dataD).get(X10_TEMP179))/* } */);
            
//#line 2529
final double X10_TEMP182 =
              (X10_TEMP999);
            
//#line 2530
final double X10_TEMP1002 =
              (X10_TEMP181 +
                 X10_TEMP182);
            
//#line 2532
final double X10_TEMP183 =
              (X10_TEMP1002);
            
//#line 2533
final double X10_TEMP1005 =
              (X10_TEMP183);
            
//#line 2535
final double X10_TEMP1008 =
              (X10_TEMP1005);
            
//#line 2536
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.vir =
              ((X10_TEMP1008));
            
//#line 2537
final int X10_TEMP1010 =
              (1);
            
//#line 2539
final int X10_TEMP185 =
              (X10_TEMP1010);
            
//#line 2540
final double X10_TEMP1013 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.epot);
            
//#line 2542
final double X10_TEMP187 =
              (X10_TEMP1013);
            
//#line 2543
final double X10_TEMP1017 =
              (/* template:array_get { */((dataD).get(X10_TEMP185))/* } */);
            
//#line 2545
final double X10_TEMP188 =
              (X10_TEMP1017);
            
//#line 2546
final double X10_TEMP1020 =
              (X10_TEMP187 +
                 X10_TEMP188);
            
//#line 2548
final double X10_TEMP189 =
              (X10_TEMP1020);
            
//#line 2549
final double X10_TEMP1023 =
              (X10_TEMP189);
            
//#line 2551
final double X10_TEMP1026 =
              (X10_TEMP1023);
            
//#line 2552
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.epot =
              ((X10_TEMP1026));
            
//#line 2553
final int X10_TEMP1028 =
              (0);
            
//#line 2555
final int X10_TEMP191 =
              (X10_TEMP1028);
            
//#line 2556
final double X10_TEMP1032 =
              (/* template:array_get { */((dataI).get(X10_TEMP191))/* } */);
            
//#line 2558
final double X10_TEMP192 =
              (X10_TEMP1032);
            
//#line 2559
final int X10_TEMP1035 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.interactions);
            
//#line 2561
final int X10_TEMP194 =
              (X10_TEMP1035);
            
//#line 2562
final int X10_TEMP1038 =
              ((int)
                 X10_TEMP192);
            
//#line 2564
final int X10_TEMP195 =
              (X10_TEMP1038);
            
//#line 2565
final int X10_TEMP1041 =
              (X10_TEMP194 +
                 X10_TEMP195);
            
//#line 2567
final int X10_TEMP196 =
              (X10_TEMP1041);
            
//#line 2568
final int X10_TEMP1044 =
              (X10_TEMP196);
            
//#line 2570
final int X10_TEMP1047 =
              (X10_TEMP1044);
            
//#line 2571
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.interactions =
              ((X10_TEMP1047));
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 2573
final int X10_TEMP1049 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 2575
final int mymdsize =
          (X10_TEMP1049);
        
//#line 2576
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2577
final x10.
              lang.
              dist X10_TEMP1052 =
              (x10.
                lang.
                dist)
                ((P.
                    distribution));
            
//#line 2579
final x10.
              lang.
              dist X10_TEMP199 =
              (x10.
                lang.
                dist)
                ((X10_TEMP1052));
            
//#line 2580
/* template:forloop-mult { */{
            x10.lang.region __var208__ = (x10.lang.region) X10_TEMP199.
                                                             region;
            if (__var208__.size() > 0 && (__var208__ instanceof x10.array.MultiDimRegion || __var208__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var209__ = __var208__.rank(0).low(), __var210__ = __var208__.rank(0).high(); __var209__ <= __var210__; __var209__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int j = __var209__;
            /* } */
            /* } */
/* Join: { *//* template:point-create { */
            final  x10.
              lang.
              point X10_TEMP201 = point.factory.point(/* Join: { */__var209__/* } */);/* } */
{
                
//#line 2581
final x10.
                  lang.
                  dist X10_TEMP1056 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP199.
                        distribution));
                
//#line 2583
final x10.
                  lang.
                  dist X10_TEMP200 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP1056));
                
//#line 2584
final x10.
                  lang.
                  place X10_TEMP202 =
                  (X10_TEMP200.
                     get(
                     X10_TEMP201));
                
//#line 2585
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP202)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 2586
final x10.
                      lang.
                      place X10_TEMP1062 =
                      (/* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 2588
final x10.
                      lang.
                      place pHere =
                      (X10_TEMP1062);
                    
//#line 2589
final int X10_TEMP1065 =
                      (0);
                    
//#line 2591
final int X10_TEMP206 =
                      (X10_TEMP1065);
                    
//#line 2592
final int X10_TEMP1068 =
                      (2);
                    
//#line 2594
final int X10_TEMP207 =
                      (X10_TEMP1068);
                    
//#line 2595
final x10.
                      lang.
                      region X10_TEMP1073 =
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
                              X10_TEMP206,
                              X10_TEMP207))));
                    
//#line 2597
final x10.
                      lang.
                      region X10_TEMP208 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1073));
                    
//#line 2598
final x10.
                      lang.
                      place X10_TEMP1076 =
                      (/* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 2600
final x10.
                      lang.
                      place X10_TEMP209 =
                      (X10_TEMP1076);
                    
//#line 2601
final x10.
                      lang.
                      dist X10_TEMP1079 =
                      (x10.
                        lang.
                        dist)
                        ((x10.
                            lang.
                            dist.
                            factory.
                            constant(
                            X10_TEMP208,
                            X10_TEMP209)));
                    
//#line 2603
final x10.
                      lang.
                      dist dD =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP1079));
                    
//#line 2604
final x10.
                      lang.
                      DoubleReferenceArray X10_TEMP1082 =
                      (x10.
                        lang.
                        DoubleReferenceArray)
                        ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dD,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
                    
//#line 2606
final x10.
                      lang.
                      DoubleReferenceArray dataD =
                      (x10.
                        lang.
                        DoubleReferenceArray)
                        ((X10_TEMP1082));
                    
//#line 2607
final int X10_TEMP1085 =
                      (0);
                    
//#line 2609
final int X10_TEMP217 =
                      (X10_TEMP1085);
                    
//#line 2610
final int X10_TEMP1088 =
                      (1);
                    
//#line 2612
final int X10_TEMP213 =
                      (X10_TEMP1088);
                    
//#line 2613
final int X10_TEMP1091 =
                      (mymdsize -
                         X10_TEMP213);
                    
//#line 2615
final int X10_TEMP215 =
                      (X10_TEMP1091);
                    
//#line 2616
final x10.
                      lang.
                      region X10_TEMP1096 =
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
                              X10_TEMP217,
                              X10_TEMP215))));
                    
//#line 2618
final x10.
                      lang.
                      region X10_TEMP219 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1096));
                    
//#line 2619
/* template:forloop-mult { */{
                    x10.lang.region __var211__ = (x10.lang.region) X10_TEMP219;
                    if (__var211__.size() > 0 && (__var211__ instanceof x10.array.MultiDimRegion || __var211__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var212__ = __var211__.rank(0).low(), __var213__ = __var211__.rank(0).high(); __var212__ <= __var213__; __var212__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var212__;
                    /* } */
                    /* } */
{
                        
//#line 2620
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 2621
/* template:Async { */(x10.lang.Runtime.asPlace(tHere)).runAsync
                            	(new x10.runtime.Activity() {
                            		public void runX10Task() {
                            			{
                                
//#line 2622
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP1101 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                                
//#line 2624
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP221 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((X10_TEMP1101));
                                
//#line 2625
final Particle X10_TEMP1105 =
                                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP221).get(k))/* } */))/* } */);
                                
//#line 2627
final Particle X10_TEMP223 =
                                  (X10_TEMP1105);
                                
//#line 2628
final double X10_TEMP1108 =
                                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP223))/* } */.xforce);
                                
//#line 2630
final double xf =
                                  (X10_TEMP1108);
                                
//#line 2631
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP1111 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                                
//#line 2633
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP225 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((X10_TEMP1111));
                                
//#line 2634
final Particle X10_TEMP1115 =
                                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP225).get(k))/* } */))/* } */);
                                
//#line 2636
final Particle X10_TEMP227 =
                                  (X10_TEMP1115);
                                
//#line 2637
final double X10_TEMP1118 =
                                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP227))/* } */.yforce);
                                
//#line 2639
final double yf =
                                  (X10_TEMP1118);
                                
//#line 2640
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP1121 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                                
//#line 2642
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP229 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((X10_TEMP1121));
                                
//#line 2643
final Particle X10_TEMP1125 =
                                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP229).get(k))/* } */))/* } */);
                                
//#line 2645
final Particle X10_TEMP231 =
                                  (X10_TEMP1125);
                                
//#line 2646
final double X10_TEMP1128 =
                                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP231))/* } */.zforce);
                                
//#line 2648
final double zf =
                                  (X10_TEMP1128);
                                
//#line 2649
/* template:finish { */
                                {
                                	x10.lang.Runtime.getCurrentActivity().startFinish();
                                	try {
                                		{
                                    
//#line 2650
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 2651
final int X10_TEMP1132 =
                                          (0);
                                        
//#line 2653
final int X10_TEMP235 =
                                          (X10_TEMP1132);
                                        
//#line 2654
final double X10_TEMP1135 =
                                          (xf);
                                        
//#line 2656
final double X10_TEMP238 =
                                          (X10_TEMP1135);
                                        
//#line 2657
final double X10_TEMP1139 =
                                          (X10_TEMP238);
                                        
//#line 2659
final double X10_TEMP1142 =
                                          (X10_TEMP1139);
                                        
//#line 2660
/* template:array_set { */(dataD).set((X10_TEMP1142),X10_TEMP235)/* } */;
                                        
//#line 2661
final int X10_TEMP1144 =
                                          (1);
                                        
//#line 2663
final int X10_TEMP240 =
                                          (X10_TEMP1144);
                                        
//#line 2664
final double X10_TEMP1147 =
                                          (yf);
                                        
//#line 2666
final double X10_TEMP243 =
                                          (X10_TEMP1147);
                                        
//#line 2667
final double X10_TEMP1151 =
                                          (X10_TEMP243);
                                        
//#line 2669
final double X10_TEMP1154 =
                                          (X10_TEMP1151);
                                        
//#line 2670
/* template:array_set { */(dataD).set((X10_TEMP1154),X10_TEMP240)/* } */;
                                        
//#line 2671
final int X10_TEMP1156 =
                                          (2);
                                        
//#line 2673
final int X10_TEMP245 =
                                          (X10_TEMP1156);
                                        
//#line 2674
final double X10_TEMP1159 =
                                          (zf);
                                        
//#line 2676
final double X10_TEMP248 =
                                          (X10_TEMP1159);
                                        
//#line 2677
final double X10_TEMP1163 =
                                          (X10_TEMP248);
                                        
//#line 2679
final double X10_TEMP1166 =
                                          (X10_TEMP1163);
                                        
//#line 2680
/* template:array_set { */(dataD).set((X10_TEMP1166),X10_TEMP245)/* } */;
                                    }
                                    		}
                                    	});/* } */
                                }
                                	} catch (Throwable tmp215) {
                                		x10.lang.Runtime.getCurrentActivity().pushException(tmp215);
                                	} finally {
                                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                                	}
                                }
                                /* } */
                                
                            }
                            		}
                            	});/* } */
                        }
                        	} catch (Throwable tmp214) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp214);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                        
//#line 2685
final md X10_TEMP1169 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 2687
final md X10_TEMP250 =
                          (X10_TEMP1169);
                        
//#line 2688
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1172 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP250))/* } */.one));
                        
//#line 2690
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP251 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1172));
                        
//#line 2691
final Particle X10_TEMP1176 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP251).get(k))/* } */))/* } */);
                        
//#line 2693
final Particle X10_TEMP253 =
                          (X10_TEMP1176);
                        
//#line 2694
final int X10_TEMP1179 =
                          (0);
                        
//#line 2696
final int X10_TEMP255 =
                          (X10_TEMP1179);
                        
//#line 2697
final double X10_TEMP1183 =
                          (/* template:array_get { */((dataD).get(X10_TEMP255))/* } */);
                        
//#line 2699
final double X10_TEMP258 =
                          (X10_TEMP1183);
                        
//#line 2700
final double X10_TEMP1186 =
                          (X10_TEMP258);
                        
//#line 2702
final double X10_TEMP259 =
                          (X10_TEMP1186);
                        
//#line 2703
final double X10_TEMP1189 =
                          (X10_TEMP259);
                        
//#line 2705
final double X10_TEMP1192 =
                          (X10_TEMP1189);
                        
//#line 2706
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP253))/* } */.xforce =
                          ((X10_TEMP1192));
                        
//#line 2707
final md X10_TEMP1195 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 2709
final md X10_TEMP261 =
                          (X10_TEMP1195);
                        
//#line 2710
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1198 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP261))/* } */.one));
                        
//#line 2712
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP262 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1198));
                        
//#line 2713
final Particle X10_TEMP1202 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP262).get(k))/* } */))/* } */);
                        
//#line 2715
final Particle X10_TEMP264 =
                          (X10_TEMP1202);
                        
//#line 2716
final int X10_TEMP1205 =
                          (1);
                        
//#line 2718
final int X10_TEMP266 =
                          (X10_TEMP1205);
                        
//#line 2719
final double X10_TEMP1209 =
                          (/* template:array_get { */((dataD).get(X10_TEMP266))/* } */);
                        
//#line 2721
final double X10_TEMP269 =
                          (X10_TEMP1209);
                        
//#line 2722
final double X10_TEMP1212 =
                          (X10_TEMP269);
                        
//#line 2724
final double X10_TEMP270 =
                          (X10_TEMP1212);
                        
//#line 2725
final double X10_TEMP1215 =
                          (X10_TEMP270);
                        
//#line 2727
final double X10_TEMP1218 =
                          (X10_TEMP1215);
                        
//#line 2728
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP264))/* } */.yforce =
                          ((X10_TEMP1218));
                        
//#line 2729
final md X10_TEMP1221 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 2731
final md X10_TEMP272 =
                          (X10_TEMP1221);
                        
//#line 2732
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1224 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP272))/* } */.one));
                        
//#line 2734
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP273 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1224));
                        
//#line 2735
final Particle X10_TEMP1228 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP273).get(k))/* } */))/* } */);
                        
//#line 2737
final Particle X10_TEMP275 =
                          (X10_TEMP1228);
                        
//#line 2738
final int X10_TEMP1231 =
                          (2);
                        
//#line 2740
final int X10_TEMP277 =
                          (X10_TEMP1231);
                        
//#line 2741
final double X10_TEMP1235 =
                          (/* template:array_get { */((dataD).get(X10_TEMP277))/* } */);
                        
//#line 2743
final double X10_TEMP280 =
                          (X10_TEMP1235);
                        
//#line 2744
final double X10_TEMP1238 =
                          (X10_TEMP280);
                        
//#line 2746
final double X10_TEMP281 =
                          (X10_TEMP1238);
                        
//#line 2747
final double X10_TEMP1241 =
                          (X10_TEMP281);
                        
//#line 2749
final double X10_TEMP1244 =
                          (X10_TEMP1241);
                        
//#line 2750
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP275))/* } */.zforce =
                          ((X10_TEMP1244));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var23____ = (__var211__).iterator(); __var23____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var23__ = (x10.
                      lang.
                      point) __var23____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var23__).get(0))/* } */;/* } */
{
                        
//#line 2620
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 2621
/* template:Async { */(x10.lang.Runtime.asPlace(tHere)).runAsync
                            	(new x10.runtime.Activity() {
                            		public void runX10Task() {
                            			{
                                
//#line 2622
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP1101 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                                
//#line 2624
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP221 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((X10_TEMP1101));
                                
//#line 2625
final Particle X10_TEMP1105 =
                                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP221).get(k))/* } */))/* } */);
                                
//#line 2627
final Particle X10_TEMP223 =
                                  (X10_TEMP1105);
                                
//#line 2628
final double X10_TEMP1108 =
                                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP223))/* } */.xforce);
                                
//#line 2630
final double xf =
                                  (X10_TEMP1108);
                                
//#line 2631
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP1111 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                                
//#line 2633
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP225 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((X10_TEMP1111));
                                
//#line 2634
final Particle X10_TEMP1115 =
                                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP225).get(k))/* } */))/* } */);
                                
//#line 2636
final Particle X10_TEMP227 =
                                  (X10_TEMP1115);
                                
//#line 2637
final double X10_TEMP1118 =
                                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP227))/* } */.yforce);
                                
//#line 2639
final double yf =
                                  (X10_TEMP1118);
                                
//#line 2640
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP1121 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                                
//#line 2642
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP229 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((X10_TEMP1121));
                                
//#line 2643
final Particle X10_TEMP1125 =
                                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP229).get(k))/* } */))/* } */);
                                
//#line 2645
final Particle X10_TEMP231 =
                                  (X10_TEMP1125);
                                
//#line 2646
final double X10_TEMP1128 =
                                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP231))/* } */.zforce);
                                
//#line 2648
final double zf =
                                  (X10_TEMP1128);
                                
//#line 2649
/* template:finish { */
                                {
                                	x10.lang.Runtime.getCurrentActivity().startFinish();
                                	try {
                                		{
                                    
//#line 2650
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 2651
final int X10_TEMP1132 =
                                          (0);
                                        
//#line 2653
final int X10_TEMP235 =
                                          (X10_TEMP1132);
                                        
//#line 2654
final double X10_TEMP1135 =
                                          (xf);
                                        
//#line 2656
final double X10_TEMP238 =
                                          (X10_TEMP1135);
                                        
//#line 2657
final double X10_TEMP1139 =
                                          (X10_TEMP238);
                                        
//#line 2659
final double X10_TEMP1142 =
                                          (X10_TEMP1139);
                                        
//#line 2660
/* template:array_set { */(dataD).set((X10_TEMP1142),X10_TEMP235)/* } */;
                                        
//#line 2661
final int X10_TEMP1144 =
                                          (1);
                                        
//#line 2663
final int X10_TEMP240 =
                                          (X10_TEMP1144);
                                        
//#line 2664
final double X10_TEMP1147 =
                                          (yf);
                                        
//#line 2666
final double X10_TEMP243 =
                                          (X10_TEMP1147);
                                        
//#line 2667
final double X10_TEMP1151 =
                                          (X10_TEMP243);
                                        
//#line 2669
final double X10_TEMP1154 =
                                          (X10_TEMP1151);
                                        
//#line 2670
/* template:array_set { */(dataD).set((X10_TEMP1154),X10_TEMP240)/* } */;
                                        
//#line 2671
final int X10_TEMP1156 =
                                          (2);
                                        
//#line 2673
final int X10_TEMP245 =
                                          (X10_TEMP1156);
                                        
//#line 2674
final double X10_TEMP1159 =
                                          (zf);
                                        
//#line 2676
final double X10_TEMP248 =
                                          (X10_TEMP1159);
                                        
//#line 2677
final double X10_TEMP1163 =
                                          (X10_TEMP248);
                                        
//#line 2679
final double X10_TEMP1166 =
                                          (X10_TEMP1163);
                                        
//#line 2680
/* template:array_set { */(dataD).set((X10_TEMP1166),X10_TEMP245)/* } */;
                                    }
                                    		}
                                    	});/* } */
                                }
                                	} catch (Throwable tmp217) {
                                		x10.lang.Runtime.getCurrentActivity().pushException(tmp217);
                                	} finally {
                                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                                	}
                                }
                                /* } */
                                
                            }
                            		}
                            	});/* } */
                        }
                        	} catch (Throwable tmp216) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp216);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                        
//#line 2685
final md X10_TEMP1169 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 2687
final md X10_TEMP250 =
                          (X10_TEMP1169);
                        
//#line 2688
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1172 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP250))/* } */.one));
                        
//#line 2690
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP251 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1172));
                        
//#line 2691
final Particle X10_TEMP1176 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP251).get(k))/* } */))/* } */);
                        
//#line 2693
final Particle X10_TEMP253 =
                          (X10_TEMP1176);
                        
//#line 2694
final int X10_TEMP1179 =
                          (0);
                        
//#line 2696
final int X10_TEMP255 =
                          (X10_TEMP1179);
                        
//#line 2697
final double X10_TEMP1183 =
                          (/* template:array_get { */((dataD).get(X10_TEMP255))/* } */);
                        
//#line 2699
final double X10_TEMP258 =
                          (X10_TEMP1183);
                        
//#line 2700
final double X10_TEMP1186 =
                          (X10_TEMP258);
                        
//#line 2702
final double X10_TEMP259 =
                          (X10_TEMP1186);
                        
//#line 2703
final double X10_TEMP1189 =
                          (X10_TEMP259);
                        
//#line 2705
final double X10_TEMP1192 =
                          (X10_TEMP1189);
                        
//#line 2706
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP253))/* } */.xforce =
                          ((X10_TEMP1192));
                        
//#line 2707
final md X10_TEMP1195 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 2709
final md X10_TEMP261 =
                          (X10_TEMP1195);
                        
//#line 2710
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1198 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP261))/* } */.one));
                        
//#line 2712
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP262 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1198));
                        
//#line 2713
final Particle X10_TEMP1202 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP262).get(k))/* } */))/* } */);
                        
//#line 2715
final Particle X10_TEMP264 =
                          (X10_TEMP1202);
                        
//#line 2716
final int X10_TEMP1205 =
                          (1);
                        
//#line 2718
final int X10_TEMP266 =
                          (X10_TEMP1205);
                        
//#line 2719
final double X10_TEMP1209 =
                          (/* template:array_get { */((dataD).get(X10_TEMP266))/* } */);
                        
//#line 2721
final double X10_TEMP269 =
                          (X10_TEMP1209);
                        
//#line 2722
final double X10_TEMP1212 =
                          (X10_TEMP269);
                        
//#line 2724
final double X10_TEMP270 =
                          (X10_TEMP1212);
                        
//#line 2725
final double X10_TEMP1215 =
                          (X10_TEMP270);
                        
//#line 2727
final double X10_TEMP1218 =
                          (X10_TEMP1215);
                        
//#line 2728
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP264))/* } */.yforce =
                          ((X10_TEMP1218));
                        
//#line 2729
final md X10_TEMP1221 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 2731
final md X10_TEMP272 =
                          (X10_TEMP1221);
                        
//#line 2732
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1224 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP272))/* } */.one));
                        
//#line 2734
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP273 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1224));
                        
//#line 2735
final Particle X10_TEMP1228 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP273).get(k))/* } */))/* } */);
                        
//#line 2737
final Particle X10_TEMP275 =
                          (X10_TEMP1228);
                        
//#line 2738
final int X10_TEMP1231 =
                          (2);
                        
//#line 2740
final int X10_TEMP277 =
                          (X10_TEMP1231);
                        
//#line 2741
final double X10_TEMP1235 =
                          (/* template:array_get { */((dataD).get(X10_TEMP277))/* } */);
                        
//#line 2743
final double X10_TEMP280 =
                          (X10_TEMP1235);
                        
//#line 2744
final double X10_TEMP1238 =
                          (X10_TEMP280);
                        
//#line 2746
final double X10_TEMP281 =
                          (X10_TEMP1238);
                        
//#line 2747
final double X10_TEMP1241 =
                          (X10_TEMP281);
                        
//#line 2749
final double X10_TEMP1244 =
                          (X10_TEMP1241);
                        
//#line 2750
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP275))/* } */.zforce =
                          ((X10_TEMP1244));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                    
//#line 2752
final int X10_TEMP1246 =
                      (0);
                    
//#line 2754
final int X10_TEMP284 =
                      (X10_TEMP1246);
                    
//#line 2755
final int X10_TEMP1249 =
                      (0);
                    
//#line 2757
final int X10_TEMP285 =
                      (X10_TEMP1249);
                    
//#line 2758
final x10.
                      lang.
                      region X10_TEMP1254 =
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
                              X10_TEMP284,
                              X10_TEMP285))));
                    
//#line 2760
final x10.
                      lang.
                      region X10_TEMP286 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1254));
                    
//#line 2761
final x10.
                      lang.
                      place X10_TEMP1257 =
                      (/* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 2763
final x10.
                      lang.
                      place X10_TEMP287 =
                      (X10_TEMP1257);
                    
//#line 2764
final x10.
                      lang.
                      dist X10_TEMP1260 =
                      (x10.
                        lang.
                        dist)
                        ((x10.
                            lang.
                            dist.
                            factory.
                            constant(
                            X10_TEMP286,
                            X10_TEMP287)));
                    
//#line 2766
final x10.
                      lang.
                      dist dI =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP1260));
                    
//#line 2767
final x10.
                      lang.
                      IntReferenceArray X10_TEMP1263 =
                      (x10.
                        lang.
                        IntReferenceArray)
                        ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dI,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
                    
//#line 2769
final x10.
                      lang.
                      IntReferenceArray dataI =
                      (x10.
                        lang.
                        IntReferenceArray)
                        ((X10_TEMP1263));
                    
//#line 2770
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 2771
/* template:Async { */(x10.lang.Runtime.asPlace(tHere)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 2772
final double X10_TEMP1267 =
                              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.vir);
                            
//#line 2774
final double tvir =
                              (X10_TEMP1267);
                            
//#line 2775
final double X10_TEMP1270 =
                              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.epot);
                            
//#line 2777
final double tepot =
                              (X10_TEMP1270);
                            
//#line 2778
final int X10_TEMP1273 =
                              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.interactions);
                            
//#line 2780
final int tinter =
                              (X10_TEMP1273);
                            
//#line 2781
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 2782
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                                	(new x10.runtime.Activity() {
                                		public void runX10Task() {
                                			{
                                    
//#line 2783
final int X10_TEMP1277 =
                                      (0);
                                    
//#line 2785
final int X10_TEMP296 =
                                      (X10_TEMP1277);
                                    
//#line 2786
final double X10_TEMP1280 =
                                      (tvir);
                                    
//#line 2788
final double X10_TEMP299 =
                                      (X10_TEMP1280);
                                    
//#line 2789
final double X10_TEMP1284 =
                                      (X10_TEMP299);
                                    
//#line 2791
final double X10_TEMP1287 =
                                      (X10_TEMP1284);
                                    
//#line 2792
/* template:array_set { */(dataD).set((X10_TEMP1287),X10_TEMP296)/* } */;
                                    
//#line 2793
final int X10_TEMP1289 =
                                      (1);
                                    
//#line 2795
final int X10_TEMP301 =
                                      (X10_TEMP1289);
                                    
//#line 2796
final double X10_TEMP1292 =
                                      (tepot);
                                    
//#line 2798
final double X10_TEMP304 =
                                      (X10_TEMP1292);
                                    
//#line 2799
final double X10_TEMP1296 =
                                      (X10_TEMP304);
                                    
//#line 2801
final double X10_TEMP1299 =
                                      (X10_TEMP1296);
                                    
//#line 2802
/* template:array_set { */(dataD).set((X10_TEMP1299),X10_TEMP301)/* } */;
                                    
//#line 2803
final int X10_TEMP1301 =
                                      (0);
                                    
//#line 2805
final int X10_TEMP306 =
                                      (X10_TEMP1301);
                                    
//#line 2806
final int X10_TEMP1304 =
                                      (tinter);
                                    
//#line 2808
final int X10_TEMP309 =
                                      (X10_TEMP1304);
                                    
//#line 2809
final int X10_TEMP1308 =
                                      (X10_TEMP309);
                                    
//#line 2811
final int X10_TEMP1311 =
                                      (X10_TEMP1308);
                                    
//#line 2812
/* template:array_set { */(dataI).set((X10_TEMP1311),X10_TEMP306)/* } */;
                                }
                                		}
                                	});/* } */
                            }
                            	} catch (Throwable tmp219) {
                            		x10.lang.Runtime.getCurrentActivity().pushException(tmp219);
                            	} finally {
                            		x10.lang.Runtime.getCurrentActivity().stopFinish();
                            	}
                            }
                            /* } */
                            
                        }
                        		}
                        	});/* } */
                    }
                    	} catch (Throwable tmp218) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp218);
                    	} finally {
                    		x10.lang.Runtime.getCurrentActivity().stopFinish();
                    	}
                    }
                    /* } */
                    
                    
//#line 2817
final md X10_TEMP1314 =
                      (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                    
//#line 2819
final md X10_TEMP311 =
                      (X10_TEMP1314);
                    
//#line 2820
final int X10_TEMP1317 =
                      (0);
                    
//#line 2822
final int X10_TEMP313 =
                      (X10_TEMP1317);
                    
//#line 2823
final double X10_TEMP1321 =
                      (/* template:array_get { */((dataD).get(X10_TEMP313))/* } */);
                    
//#line 2825
final double X10_TEMP316 =
                      (X10_TEMP1321);
                    
//#line 2826
final double X10_TEMP1324 =
                      (X10_TEMP316);
                    
//#line 2828
final double X10_TEMP317 =
                      (X10_TEMP1324);
                    
//#line 2829
final double X10_TEMP1327 =
                      (X10_TEMP317);
                    
//#line 2831
final double X10_TEMP1330 =
                      (X10_TEMP1327);
                    
//#line 2832
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP311))/* } */.vir =
                      ((X10_TEMP1330));
                    
//#line 2833
final md X10_TEMP1333 =
                      (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                    
//#line 2835
final md X10_TEMP319 =
                      (X10_TEMP1333);
                    
//#line 2836
final int X10_TEMP1336 =
                      (1);
                    
//#line 2838
final int X10_TEMP321 =
                      (X10_TEMP1336);
                    
//#line 2839
final double X10_TEMP1340 =
                      (/* template:array_get { */((dataD).get(X10_TEMP321))/* } */);
                    
//#line 2841
final double X10_TEMP324 =
                      (X10_TEMP1340);
                    
//#line 2842
final double X10_TEMP1343 =
                      (X10_TEMP324);
                    
//#line 2844
final double X10_TEMP325 =
                      (X10_TEMP1343);
                    
//#line 2845
final double X10_TEMP1346 =
                      (X10_TEMP325);
                    
//#line 2847
final double X10_TEMP1349 =
                      (X10_TEMP1346);
                    
//#line 2848
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP319))/* } */.epot =
                      ((X10_TEMP1349));
                    
//#line 2849
final md X10_TEMP1352 =
                      (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                    
//#line 2851
final md X10_TEMP327 =
                      (X10_TEMP1352);
                    
//#line 2852
final int X10_TEMP1355 =
                      (0);
                    
//#line 2854
final int X10_TEMP329 =
                      (X10_TEMP1355);
                    
//#line 2855
final int X10_TEMP1359 =
                      (/* template:array_get { */((dataI).get(X10_TEMP329))/* } */);
                    
//#line 2857
final int X10_TEMP332 =
                      (X10_TEMP1359);
                    
//#line 2858
final int X10_TEMP1362 =
                      (X10_TEMP332);
                    
//#line 2860
final int X10_TEMP333 =
                      (X10_TEMP1362);
                    
//#line 2861
final int X10_TEMP1365 =
                      (X10_TEMP333);
                    
//#line 2863
final int X10_TEMP1368 =
                      (X10_TEMP1365);
                    
//#line 2864
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP327))/* } */.interactions =
                      ((X10_TEMP1368));
                }
                		}
                	});/* } */
            }/* } *//* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator X10_TEMP201__ = (__var208__).iterator(); X10_TEMP201__.hasNext(); ) {
            	final  x10.
              lang.
              point X10_TEMP201 = (x10.
              lang.
              point) X10_TEMP201__.next();
            	/* Join: { *//* Join: { */final int j =
              /* template:array_get { */((X10_TEMP201).get(0))/* } */;/* } */
{
                
//#line 2581
final x10.
                  lang.
                  dist X10_TEMP1056 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP199.
                        distribution));
                
//#line 2583
final x10.
                  lang.
                  dist X10_TEMP200 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP1056));
                
//#line 2584
final x10.
                  lang.
                  place X10_TEMP202 =
                  (X10_TEMP200.
                     get(
                     X10_TEMP201));
                
//#line 2585
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP202)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 2586
final x10.
                      lang.
                      place X10_TEMP1062 =
                      (/* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 2588
final x10.
                      lang.
                      place pHere =
                      (X10_TEMP1062);
                    
//#line 2589
final int X10_TEMP1065 =
                      (0);
                    
//#line 2591
final int X10_TEMP206 =
                      (X10_TEMP1065);
                    
//#line 2592
final int X10_TEMP1068 =
                      (2);
                    
//#line 2594
final int X10_TEMP207 =
                      (X10_TEMP1068);
                    
//#line 2595
final x10.
                      lang.
                      region X10_TEMP1073 =
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
                              X10_TEMP206,
                              X10_TEMP207))));
                    
//#line 2597
final x10.
                      lang.
                      region X10_TEMP208 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1073));
                    
//#line 2598
final x10.
                      lang.
                      place X10_TEMP1076 =
                      (/* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 2600
final x10.
                      lang.
                      place X10_TEMP209 =
                      (X10_TEMP1076);
                    
//#line 2601
final x10.
                      lang.
                      dist X10_TEMP1079 =
                      (x10.
                        lang.
                        dist)
                        ((x10.
                            lang.
                            dist.
                            factory.
                            constant(
                            X10_TEMP208,
                            X10_TEMP209)));
                    
//#line 2603
final x10.
                      lang.
                      dist dD =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP1079));
                    
//#line 2604
final x10.
                      lang.
                      DoubleReferenceArray X10_TEMP1082 =
                      (x10.
                        lang.
                        DoubleReferenceArray)
                        ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dD,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
                    
//#line 2606
final x10.
                      lang.
                      DoubleReferenceArray dataD =
                      (x10.
                        lang.
                        DoubleReferenceArray)
                        ((X10_TEMP1082));
                    
//#line 2607
final int X10_TEMP1085 =
                      (0);
                    
//#line 2609
final int X10_TEMP217 =
                      (X10_TEMP1085);
                    
//#line 2610
final int X10_TEMP1088 =
                      (1);
                    
//#line 2612
final int X10_TEMP213 =
                      (X10_TEMP1088);
                    
//#line 2613
final int X10_TEMP1091 =
                      (mymdsize -
                         X10_TEMP213);
                    
//#line 2615
final int X10_TEMP215 =
                      (X10_TEMP1091);
                    
//#line 2616
final x10.
                      lang.
                      region X10_TEMP1096 =
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
                              X10_TEMP217,
                              X10_TEMP215))));
                    
//#line 2618
final x10.
                      lang.
                      region X10_TEMP219 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1096));
                    
//#line 2619
/* template:forloop-mult { */{
                    x10.lang.region __var220__ = (x10.lang.region) X10_TEMP219;
                    if (__var220__.size() > 0 && (__var220__ instanceof x10.array.MultiDimRegion || __var220__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var221__ = __var220__.rank(0).low(), __var222__ = __var220__.rank(0).high(); __var221__ <= __var222__; __var221__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var221__;
                    /* } */
                    /* } */
{
                        
//#line 2620
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 2621
/* template:Async { */(x10.lang.Runtime.asPlace(tHere)).runAsync
                            	(new x10.runtime.Activity() {
                            		public void runX10Task() {
                            			{
                                
//#line 2622
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP1101 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                                
//#line 2624
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP221 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((X10_TEMP1101));
                                
//#line 2625
final Particle X10_TEMP1105 =
                                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP221).get(k))/* } */))/* } */);
                                
//#line 2627
final Particle X10_TEMP223 =
                                  (X10_TEMP1105);
                                
//#line 2628
final double X10_TEMP1108 =
                                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP223))/* } */.xforce);
                                
//#line 2630
final double xf =
                                  (X10_TEMP1108);
                                
//#line 2631
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP1111 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                                
//#line 2633
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP225 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((X10_TEMP1111));
                                
//#line 2634
final Particle X10_TEMP1115 =
                                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP225).get(k))/* } */))/* } */);
                                
//#line 2636
final Particle X10_TEMP227 =
                                  (X10_TEMP1115);
                                
//#line 2637
final double X10_TEMP1118 =
                                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP227))/* } */.yforce);
                                
//#line 2639
final double yf =
                                  (X10_TEMP1118);
                                
//#line 2640
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP1121 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                                
//#line 2642
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP229 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((X10_TEMP1121));
                                
//#line 2643
final Particle X10_TEMP1125 =
                                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP229).get(k))/* } */))/* } */);
                                
//#line 2645
final Particle X10_TEMP231 =
                                  (X10_TEMP1125);
                                
//#line 2646
final double X10_TEMP1128 =
                                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP231))/* } */.zforce);
                                
//#line 2648
final double zf =
                                  (X10_TEMP1128);
                                
//#line 2649
/* template:finish { */
                                {
                                	x10.lang.Runtime.getCurrentActivity().startFinish();
                                	try {
                                		{
                                    
//#line 2650
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 2651
final int X10_TEMP1132 =
                                          (0);
                                        
//#line 2653
final int X10_TEMP235 =
                                          (X10_TEMP1132);
                                        
//#line 2654
final double X10_TEMP1135 =
                                          (xf);
                                        
//#line 2656
final double X10_TEMP238 =
                                          (X10_TEMP1135);
                                        
//#line 2657
final double X10_TEMP1139 =
                                          (X10_TEMP238);
                                        
//#line 2659
final double X10_TEMP1142 =
                                          (X10_TEMP1139);
                                        
//#line 2660
/* template:array_set { */(dataD).set((X10_TEMP1142),X10_TEMP235)/* } */;
                                        
//#line 2661
final int X10_TEMP1144 =
                                          (1);
                                        
//#line 2663
final int X10_TEMP240 =
                                          (X10_TEMP1144);
                                        
//#line 2664
final double X10_TEMP1147 =
                                          (yf);
                                        
//#line 2666
final double X10_TEMP243 =
                                          (X10_TEMP1147);
                                        
//#line 2667
final double X10_TEMP1151 =
                                          (X10_TEMP243);
                                        
//#line 2669
final double X10_TEMP1154 =
                                          (X10_TEMP1151);
                                        
//#line 2670
/* template:array_set { */(dataD).set((X10_TEMP1154),X10_TEMP240)/* } */;
                                        
//#line 2671
final int X10_TEMP1156 =
                                          (2);
                                        
//#line 2673
final int X10_TEMP245 =
                                          (X10_TEMP1156);
                                        
//#line 2674
final double X10_TEMP1159 =
                                          (zf);
                                        
//#line 2676
final double X10_TEMP248 =
                                          (X10_TEMP1159);
                                        
//#line 2677
final double X10_TEMP1163 =
                                          (X10_TEMP248);
                                        
//#line 2679
final double X10_TEMP1166 =
                                          (X10_TEMP1163);
                                        
//#line 2680
/* template:array_set { */(dataD).set((X10_TEMP1166),X10_TEMP245)/* } */;
                                    }
                                    		}
                                    	});/* } */
                                }
                                	} catch (Throwable tmp224) {
                                		x10.lang.Runtime.getCurrentActivity().pushException(tmp224);
                                	} finally {
                                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                                	}
                                }
                                /* } */
                                
                            }
                            		}
                            	});/* } */
                        }
                        	} catch (Throwable tmp223) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp223);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                        
//#line 2685
final md X10_TEMP1169 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 2687
final md X10_TEMP250 =
                          (X10_TEMP1169);
                        
//#line 2688
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1172 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP250))/* } */.one));
                        
//#line 2690
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP251 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1172));
                        
//#line 2691
final Particle X10_TEMP1176 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP251).get(k))/* } */))/* } */);
                        
//#line 2693
final Particle X10_TEMP253 =
                          (X10_TEMP1176);
                        
//#line 2694
final int X10_TEMP1179 =
                          (0);
                        
//#line 2696
final int X10_TEMP255 =
                          (X10_TEMP1179);
                        
//#line 2697
final double X10_TEMP1183 =
                          (/* template:array_get { */((dataD).get(X10_TEMP255))/* } */);
                        
//#line 2699
final double X10_TEMP258 =
                          (X10_TEMP1183);
                        
//#line 2700
final double X10_TEMP1186 =
                          (X10_TEMP258);
                        
//#line 2702
final double X10_TEMP259 =
                          (X10_TEMP1186);
                        
//#line 2703
final double X10_TEMP1189 =
                          (X10_TEMP259);
                        
//#line 2705
final double X10_TEMP1192 =
                          (X10_TEMP1189);
                        
//#line 2706
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP253))/* } */.xforce =
                          ((X10_TEMP1192));
                        
//#line 2707
final md X10_TEMP1195 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 2709
final md X10_TEMP261 =
                          (X10_TEMP1195);
                        
//#line 2710
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1198 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP261))/* } */.one));
                        
//#line 2712
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP262 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1198));
                        
//#line 2713
final Particle X10_TEMP1202 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP262).get(k))/* } */))/* } */);
                        
//#line 2715
final Particle X10_TEMP264 =
                          (X10_TEMP1202);
                        
//#line 2716
final int X10_TEMP1205 =
                          (1);
                        
//#line 2718
final int X10_TEMP266 =
                          (X10_TEMP1205);
                        
//#line 2719
final double X10_TEMP1209 =
                          (/* template:array_get { */((dataD).get(X10_TEMP266))/* } */);
                        
//#line 2721
final double X10_TEMP269 =
                          (X10_TEMP1209);
                        
//#line 2722
final double X10_TEMP1212 =
                          (X10_TEMP269);
                        
//#line 2724
final double X10_TEMP270 =
                          (X10_TEMP1212);
                        
//#line 2725
final double X10_TEMP1215 =
                          (X10_TEMP270);
                        
//#line 2727
final double X10_TEMP1218 =
                          (X10_TEMP1215);
                        
//#line 2728
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP264))/* } */.yforce =
                          ((X10_TEMP1218));
                        
//#line 2729
final md X10_TEMP1221 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 2731
final md X10_TEMP272 =
                          (X10_TEMP1221);
                        
//#line 2732
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1224 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP272))/* } */.one));
                        
//#line 2734
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP273 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1224));
                        
//#line 2735
final Particle X10_TEMP1228 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP273).get(k))/* } */))/* } */);
                        
//#line 2737
final Particle X10_TEMP275 =
                          (X10_TEMP1228);
                        
//#line 2738
final int X10_TEMP1231 =
                          (2);
                        
//#line 2740
final int X10_TEMP277 =
                          (X10_TEMP1231);
                        
//#line 2741
final double X10_TEMP1235 =
                          (/* template:array_get { */((dataD).get(X10_TEMP277))/* } */);
                        
//#line 2743
final double X10_TEMP280 =
                          (X10_TEMP1235);
                        
//#line 2744
final double X10_TEMP1238 =
                          (X10_TEMP280);
                        
//#line 2746
final double X10_TEMP281 =
                          (X10_TEMP1238);
                        
//#line 2747
final double X10_TEMP1241 =
                          (X10_TEMP281);
                        
//#line 2749
final double X10_TEMP1244 =
                          (X10_TEMP1241);
                        
//#line 2750
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP275))/* } */.zforce =
                          ((X10_TEMP1244));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var23____ = (__var220__).iterator(); __var23____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var23__ = (x10.
                      lang.
                      point) __var23____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var23__).get(0))/* } */;/* } */
{
                        
//#line 2620
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 2621
/* template:Async { */(x10.lang.Runtime.asPlace(tHere)).runAsync
                            	(new x10.runtime.Activity() {
                            		public void runX10Task() {
                            			{
                                
//#line 2622
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP1101 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                                
//#line 2624
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP221 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((X10_TEMP1101));
                                
//#line 2625
final Particle X10_TEMP1105 =
                                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP221).get(k))/* } */))/* } */);
                                
//#line 2627
final Particle X10_TEMP223 =
                                  (X10_TEMP1105);
                                
//#line 2628
final double X10_TEMP1108 =
                                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP223))/* } */.xforce);
                                
//#line 2630
final double xf =
                                  (X10_TEMP1108);
                                
//#line 2631
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP1111 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                                
//#line 2633
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP225 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((X10_TEMP1111));
                                
//#line 2634
final Particle X10_TEMP1115 =
                                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP225).get(k))/* } */))/* } */);
                                
//#line 2636
final Particle X10_TEMP227 =
                                  (X10_TEMP1115);
                                
//#line 2637
final double X10_TEMP1118 =
                                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP227))/* } */.yforce);
                                
//#line 2639
final double yf =
                                  (X10_TEMP1118);
                                
//#line 2640
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP1121 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                                
//#line 2642
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP229 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((X10_TEMP1121));
                                
//#line 2643
final Particle X10_TEMP1125 =
                                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP229).get(k))/* } */))/* } */);
                                
//#line 2645
final Particle X10_TEMP231 =
                                  (X10_TEMP1125);
                                
//#line 2646
final double X10_TEMP1128 =
                                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP231))/* } */.zforce);
                                
//#line 2648
final double zf =
                                  (X10_TEMP1128);
                                
//#line 2649
/* template:finish { */
                                {
                                	x10.lang.Runtime.getCurrentActivity().startFinish();
                                	try {
                                		{
                                    
//#line 2650
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 2651
final int X10_TEMP1132 =
                                          (0);
                                        
//#line 2653
final int X10_TEMP235 =
                                          (X10_TEMP1132);
                                        
//#line 2654
final double X10_TEMP1135 =
                                          (xf);
                                        
//#line 2656
final double X10_TEMP238 =
                                          (X10_TEMP1135);
                                        
//#line 2657
final double X10_TEMP1139 =
                                          (X10_TEMP238);
                                        
//#line 2659
final double X10_TEMP1142 =
                                          (X10_TEMP1139);
                                        
//#line 2660
/* template:array_set { */(dataD).set((X10_TEMP1142),X10_TEMP235)/* } */;
                                        
//#line 2661
final int X10_TEMP1144 =
                                          (1);
                                        
//#line 2663
final int X10_TEMP240 =
                                          (X10_TEMP1144);
                                        
//#line 2664
final double X10_TEMP1147 =
                                          (yf);
                                        
//#line 2666
final double X10_TEMP243 =
                                          (X10_TEMP1147);
                                        
//#line 2667
final double X10_TEMP1151 =
                                          (X10_TEMP243);
                                        
//#line 2669
final double X10_TEMP1154 =
                                          (X10_TEMP1151);
                                        
//#line 2670
/* template:array_set { */(dataD).set((X10_TEMP1154),X10_TEMP240)/* } */;
                                        
//#line 2671
final int X10_TEMP1156 =
                                          (2);
                                        
//#line 2673
final int X10_TEMP245 =
                                          (X10_TEMP1156);
                                        
//#line 2674
final double X10_TEMP1159 =
                                          (zf);
                                        
//#line 2676
final double X10_TEMP248 =
                                          (X10_TEMP1159);
                                        
//#line 2677
final double X10_TEMP1163 =
                                          (X10_TEMP248);
                                        
//#line 2679
final double X10_TEMP1166 =
                                          (X10_TEMP1163);
                                        
//#line 2680
/* template:array_set { */(dataD).set((X10_TEMP1166),X10_TEMP245)/* } */;
                                    }
                                    		}
                                    	});/* } */
                                }
                                	} catch (Throwable tmp226) {
                                		x10.lang.Runtime.getCurrentActivity().pushException(tmp226);
                                	} finally {
                                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                                	}
                                }
                                /* } */
                                
                            }
                            		}
                            	});/* } */
                        }
                        	} catch (Throwable tmp225) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp225);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                        
//#line 2685
final md X10_TEMP1169 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 2687
final md X10_TEMP250 =
                          (X10_TEMP1169);
                        
//#line 2688
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1172 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP250))/* } */.one));
                        
//#line 2690
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP251 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1172));
                        
//#line 2691
final Particle X10_TEMP1176 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP251).get(k))/* } */))/* } */);
                        
//#line 2693
final Particle X10_TEMP253 =
                          (X10_TEMP1176);
                        
//#line 2694
final int X10_TEMP1179 =
                          (0);
                        
//#line 2696
final int X10_TEMP255 =
                          (X10_TEMP1179);
                        
//#line 2697
final double X10_TEMP1183 =
                          (/* template:array_get { */((dataD).get(X10_TEMP255))/* } */);
                        
//#line 2699
final double X10_TEMP258 =
                          (X10_TEMP1183);
                        
//#line 2700
final double X10_TEMP1186 =
                          (X10_TEMP258);
                        
//#line 2702
final double X10_TEMP259 =
                          (X10_TEMP1186);
                        
//#line 2703
final double X10_TEMP1189 =
                          (X10_TEMP259);
                        
//#line 2705
final double X10_TEMP1192 =
                          (X10_TEMP1189);
                        
//#line 2706
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP253))/* } */.xforce =
                          ((X10_TEMP1192));
                        
//#line 2707
final md X10_TEMP1195 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 2709
final md X10_TEMP261 =
                          (X10_TEMP1195);
                        
//#line 2710
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1198 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP261))/* } */.one));
                        
//#line 2712
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP262 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1198));
                        
//#line 2713
final Particle X10_TEMP1202 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP262).get(k))/* } */))/* } */);
                        
//#line 2715
final Particle X10_TEMP264 =
                          (X10_TEMP1202);
                        
//#line 2716
final int X10_TEMP1205 =
                          (1);
                        
//#line 2718
final int X10_TEMP266 =
                          (X10_TEMP1205);
                        
//#line 2719
final double X10_TEMP1209 =
                          (/* template:array_get { */((dataD).get(X10_TEMP266))/* } */);
                        
//#line 2721
final double X10_TEMP269 =
                          (X10_TEMP1209);
                        
//#line 2722
final double X10_TEMP1212 =
                          (X10_TEMP269);
                        
//#line 2724
final double X10_TEMP270 =
                          (X10_TEMP1212);
                        
//#line 2725
final double X10_TEMP1215 =
                          (X10_TEMP270);
                        
//#line 2727
final double X10_TEMP1218 =
                          (X10_TEMP1215);
                        
//#line 2728
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP264))/* } */.yforce =
                          ((X10_TEMP1218));
                        
//#line 2729
final md X10_TEMP1221 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 2731
final md X10_TEMP272 =
                          (X10_TEMP1221);
                        
//#line 2732
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1224 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP272))/* } */.one));
                        
//#line 2734
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP273 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1224));
                        
//#line 2735
final Particle X10_TEMP1228 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP273).get(k))/* } */))/* } */);
                        
//#line 2737
final Particle X10_TEMP275 =
                          (X10_TEMP1228);
                        
//#line 2738
final int X10_TEMP1231 =
                          (2);
                        
//#line 2740
final int X10_TEMP277 =
                          (X10_TEMP1231);
                        
//#line 2741
final double X10_TEMP1235 =
                          (/* template:array_get { */((dataD).get(X10_TEMP277))/* } */);
                        
//#line 2743
final double X10_TEMP280 =
                          (X10_TEMP1235);
                        
//#line 2744
final double X10_TEMP1238 =
                          (X10_TEMP280);
                        
//#line 2746
final double X10_TEMP281 =
                          (X10_TEMP1238);
                        
//#line 2747
final double X10_TEMP1241 =
                          (X10_TEMP281);
                        
//#line 2749
final double X10_TEMP1244 =
                          (X10_TEMP1241);
                        
//#line 2750
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP275))/* } */.zforce =
                          ((X10_TEMP1244));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                    
//#line 2752
final int X10_TEMP1246 =
                      (0);
                    
//#line 2754
final int X10_TEMP284 =
                      (X10_TEMP1246);
                    
//#line 2755
final int X10_TEMP1249 =
                      (0);
                    
//#line 2757
final int X10_TEMP285 =
                      (X10_TEMP1249);
                    
//#line 2758
final x10.
                      lang.
                      region X10_TEMP1254 =
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
                              X10_TEMP284,
                              X10_TEMP285))));
                    
//#line 2760
final x10.
                      lang.
                      region X10_TEMP286 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1254));
                    
//#line 2761
final x10.
                      lang.
                      place X10_TEMP1257 =
                      (/* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 2763
final x10.
                      lang.
                      place X10_TEMP287 =
                      (X10_TEMP1257);
                    
//#line 2764
final x10.
                      lang.
                      dist X10_TEMP1260 =
                      (x10.
                        lang.
                        dist)
                        ((x10.
                            lang.
                            dist.
                            factory.
                            constant(
                            X10_TEMP286,
                            X10_TEMP287)));
                    
//#line 2766
final x10.
                      lang.
                      dist dI =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP1260));
                    
//#line 2767
final x10.
                      lang.
                      IntReferenceArray X10_TEMP1263 =
                      (x10.
                        lang.
                        IntReferenceArray)
                        ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dI,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
                    
//#line 2769
final x10.
                      lang.
                      IntReferenceArray dataI =
                      (x10.
                        lang.
                        IntReferenceArray)
                        ((X10_TEMP1263));
                    
//#line 2770
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 2771
/* template:Async { */(x10.lang.Runtime.asPlace(tHere)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 2772
final double X10_TEMP1267 =
                              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.vir);
                            
//#line 2774
final double tvir =
                              (X10_TEMP1267);
                            
//#line 2775
final double X10_TEMP1270 =
                              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.epot);
                            
//#line 2777
final double tepot =
                              (X10_TEMP1270);
                            
//#line 2778
final int X10_TEMP1273 =
                              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.interactions);
                            
//#line 2780
final int tinter =
                              (X10_TEMP1273);
                            
//#line 2781
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 2782
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                                	(new x10.runtime.Activity() {
                                		public void runX10Task() {
                                			{
                                    
//#line 2783
final int X10_TEMP1277 =
                                      (0);
                                    
//#line 2785
final int X10_TEMP296 =
                                      (X10_TEMP1277);
                                    
//#line 2786
final double X10_TEMP1280 =
                                      (tvir);
                                    
//#line 2788
final double X10_TEMP299 =
                                      (X10_TEMP1280);
                                    
//#line 2789
final double X10_TEMP1284 =
                                      (X10_TEMP299);
                                    
//#line 2791
final double X10_TEMP1287 =
                                      (X10_TEMP1284);
                                    
//#line 2792
/* template:array_set { */(dataD).set((X10_TEMP1287),X10_TEMP296)/* } */;
                                    
//#line 2793
final int X10_TEMP1289 =
                                      (1);
                                    
//#line 2795
final int X10_TEMP301 =
                                      (X10_TEMP1289);
                                    
//#line 2796
final double X10_TEMP1292 =
                                      (tepot);
                                    
//#line 2798
final double X10_TEMP304 =
                                      (X10_TEMP1292);
                                    
//#line 2799
final double X10_TEMP1296 =
                                      (X10_TEMP304);
                                    
//#line 2801
final double X10_TEMP1299 =
                                      (X10_TEMP1296);
                                    
//#line 2802
/* template:array_set { */(dataD).set((X10_TEMP1299),X10_TEMP301)/* } */;
                                    
//#line 2803
final int X10_TEMP1301 =
                                      (0);
                                    
//#line 2805
final int X10_TEMP306 =
                                      (X10_TEMP1301);
                                    
//#line 2806
final int X10_TEMP1304 =
                                      (tinter);
                                    
//#line 2808
final int X10_TEMP309 =
                                      (X10_TEMP1304);
                                    
//#line 2809
final int X10_TEMP1308 =
                                      (X10_TEMP309);
                                    
//#line 2811
final int X10_TEMP1311 =
                                      (X10_TEMP1308);
                                    
//#line 2812
/* template:array_set { */(dataI).set((X10_TEMP1311),X10_TEMP306)/* } */;
                                }
                                		}
                                	});/* } */
                            }
                            	} catch (Throwable tmp228) {
                            		x10.lang.Runtime.getCurrentActivity().pushException(tmp228);
                            	} finally {
                            		x10.lang.Runtime.getCurrentActivity().stopFinish();
                            	}
                            }
                            /* } */
                            
                        }
                        		}
                        	});/* } */
                    }
                    	} catch (Throwable tmp227) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp227);
                    	} finally {
                    		x10.lang.Runtime.getCurrentActivity().stopFinish();
                    	}
                    }
                    /* } */
                    
                    
//#line 2817
final md X10_TEMP1314 =
                      (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                    
//#line 2819
final md X10_TEMP311 =
                      (X10_TEMP1314);
                    
//#line 2820
final int X10_TEMP1317 =
                      (0);
                    
//#line 2822
final int X10_TEMP313 =
                      (X10_TEMP1317);
                    
//#line 2823
final double X10_TEMP1321 =
                      (/* template:array_get { */((dataD).get(X10_TEMP313))/* } */);
                    
//#line 2825
final double X10_TEMP316 =
                      (X10_TEMP1321);
                    
//#line 2826
final double X10_TEMP1324 =
                      (X10_TEMP316);
                    
//#line 2828
final double X10_TEMP317 =
                      (X10_TEMP1324);
                    
//#line 2829
final double X10_TEMP1327 =
                      (X10_TEMP317);
                    
//#line 2831
final double X10_TEMP1330 =
                      (X10_TEMP1327);
                    
//#line 2832
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP311))/* } */.vir =
                      ((X10_TEMP1330));
                    
//#line 2833
final md X10_TEMP1333 =
                      (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                    
//#line 2835
final md X10_TEMP319 =
                      (X10_TEMP1333);
                    
//#line 2836
final int X10_TEMP1336 =
                      (1);
                    
//#line 2838
final int X10_TEMP321 =
                      (X10_TEMP1336);
                    
//#line 2839
final double X10_TEMP1340 =
                      (/* template:array_get { */((dataD).get(X10_TEMP321))/* } */);
                    
//#line 2841
final double X10_TEMP324 =
                      (X10_TEMP1340);
                    
//#line 2842
final double X10_TEMP1343 =
                      (X10_TEMP324);
                    
//#line 2844
final double X10_TEMP325 =
                      (X10_TEMP1343);
                    
//#line 2845
final double X10_TEMP1346 =
                      (X10_TEMP325);
                    
//#line 2847
final double X10_TEMP1349 =
                      (X10_TEMP1346);
                    
//#line 2848
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP319))/* } */.epot =
                      ((X10_TEMP1349));
                    
//#line 2849
final md X10_TEMP1352 =
                      (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                    
//#line 2851
final md X10_TEMP327 =
                      (X10_TEMP1352);
                    
//#line 2852
final int X10_TEMP1355 =
                      (0);
                    
//#line 2854
final int X10_TEMP329 =
                      (X10_TEMP1355);
                    
//#line 2855
final int X10_TEMP1359 =
                      (/* template:array_get { */((dataI).get(X10_TEMP329))/* } */);
                    
//#line 2857
final int X10_TEMP332 =
                      (X10_TEMP1359);
                    
//#line 2858
final int X10_TEMP1362 =
                      (X10_TEMP332);
                    
//#line 2860
final int X10_TEMP333 =
                      (X10_TEMP1362);
                    
//#line 2861
final int X10_TEMP1365 =
                      (X10_TEMP333);
                    
//#line 2863
final int X10_TEMP1368 =
                      (X10_TEMP1365);
                    
//#line 2864
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP327))/* } */.interactions =
                      ((X10_TEMP1368));
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
        	} catch (Throwable tmp207) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp207);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 2869
public static void
                    Program_Particle_domove(
                    final Particle X10_TEMP0,
                    final double side) {
        
//#line 2870
double X10_TEMP1 =
          (side);
        
//#line 2871
final double X10_TEMP579 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xcoord);
        
//#line 2873
final double X10_TEMP2 =
          (X10_TEMP579);
        
//#line 2874
final double X10_TEMP582 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xvelocity);
        
//#line 2876
final double X10_TEMP3 =
          (X10_TEMP582);
        
//#line 2877
final double X10_TEMP585 =
          (X10_TEMP2 +
             X10_TEMP3);
        
//#line 2879
final double X10_TEMP4 =
          (X10_TEMP585);
        
//#line 2880
final double X10_TEMP588 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xforce);
        
//#line 2882
final double X10_TEMP5 =
          (X10_TEMP588);
        
//#line 2883
final double X10_TEMP591 =
          (X10_TEMP4 +
             X10_TEMP5);
        
//#line 2885
final double X10_TEMP8 =
          (X10_TEMP591);
        
//#line 2886
final double X10_TEMP594 =
          (X10_TEMP8);
        
//#line 2888
final double X10_TEMP9 =
          (X10_TEMP594);
        
//#line 2889
final double X10_TEMP597 =
          (X10_TEMP9);
        
//#line 2891
final double X10_TEMP600 =
          (X10_TEMP597);
        
//#line 2892
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xcoord =
          ((X10_TEMP600));
        
//#line 2893
final double X10_TEMP602 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ycoord);
        
//#line 2895
final double X10_TEMP10 =
          (X10_TEMP602);
        
//#line 2896
final double X10_TEMP605 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yvelocity);
        
//#line 2898
final double X10_TEMP11 =
          (X10_TEMP605);
        
//#line 2899
final double X10_TEMP608 =
          (X10_TEMP10 +
             X10_TEMP11);
        
//#line 2901
final double X10_TEMP12 =
          (X10_TEMP608);
        
//#line 2902
final double X10_TEMP611 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yforce);
        
//#line 2904
final double X10_TEMP13 =
          (X10_TEMP611);
        
//#line 2905
final double X10_TEMP614 =
          (X10_TEMP12 +
             X10_TEMP13);
        
//#line 2907
final double X10_TEMP16 =
          (X10_TEMP614);
        
//#line 2908
final double X10_TEMP617 =
          (X10_TEMP16);
        
//#line 2910
final double X10_TEMP17 =
          (X10_TEMP617);
        
//#line 2911
final double X10_TEMP620 =
          (X10_TEMP17);
        
//#line 2913
final double X10_TEMP623 =
          (X10_TEMP620);
        
//#line 2914
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ycoord =
          ((X10_TEMP623));
        
//#line 2915
final double X10_TEMP625 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zcoord);
        
//#line 2917
final double X10_TEMP18 =
          (X10_TEMP625);
        
//#line 2918
final double X10_TEMP628 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zvelocity);
        
//#line 2920
final double X10_TEMP19 =
          (X10_TEMP628);
        
//#line 2921
final double X10_TEMP631 =
          (X10_TEMP18 +
             X10_TEMP19);
        
//#line 2923
final double X10_TEMP20 =
          (X10_TEMP631);
        
//#line 2924
final double X10_TEMP634 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zforce);
        
//#line 2926
final double X10_TEMP21 =
          (X10_TEMP634);
        
//#line 2927
final double X10_TEMP637 =
          (X10_TEMP20 +
             X10_TEMP21);
        
//#line 2929
final double X10_TEMP24 =
          (X10_TEMP637);
        
//#line 2930
final double X10_TEMP640 =
          (X10_TEMP24);
        
//#line 2932
final double X10_TEMP25 =
          (X10_TEMP640);
        
//#line 2933
final double X10_TEMP643 =
          (X10_TEMP25);
        
//#line 2935
final double X10_TEMP646 =
          (X10_TEMP643);
        
//#line 2936
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zcoord =
          ((X10_TEMP646));
        
//#line 2937
final double X10_TEMP648 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xcoord);
        
//#line 2939
final double X10_TEMP26 =
          (X10_TEMP648);
        
//#line 2940
final int X10_TEMP651 =
          (0);
        
//#line 2942
final int X10_TEMP27 =
          (X10_TEMP651);
        
//#line 2943
final boolean X10_TEMP29 =
          (X10_TEMP26 <
             X10_TEMP27);
        
//#line 2944
if (X10_TEMP29) {
            
//#line 2945
final double X10_TEMP656 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xcoord);
            
//#line 2947
final double X10_TEMP30 =
              (X10_TEMP656);
            
//#line 2948
final double X10_TEMP659 =
              (X10_TEMP30 +
                 X10_TEMP1);
            
//#line 2950
final double X10_TEMP33 =
              (X10_TEMP659);
            
//#line 2951
final double X10_TEMP662 =
              (X10_TEMP33);
            
//#line 2953
final double X10_TEMP34 =
              (X10_TEMP662);
            
//#line 2954
final double X10_TEMP665 =
              (X10_TEMP34);
            
//#line 2956
final double X10_TEMP668 =
              (X10_TEMP665);
            
//#line 2957
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xcoord =
              ((X10_TEMP668));
        }
        
//#line 2959
final double X10_TEMP670 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xcoord);
        
//#line 2961
final double X10_TEMP35 =
          (X10_TEMP670);
        
//#line 2962
final boolean X10_TEMP37 =
          (X10_TEMP35 >
             X10_TEMP1);
        
//#line 2963
if (X10_TEMP37) {
            
//#line 2964
final double X10_TEMP675 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xcoord);
            
//#line 2966
final double X10_TEMP38 =
              (X10_TEMP675);
            
//#line 2967
final double X10_TEMP678 =
              (X10_TEMP38 -
                 X10_TEMP1);
            
//#line 2969
final double X10_TEMP41 =
              (X10_TEMP678);
            
//#line 2970
final double X10_TEMP681 =
              (X10_TEMP41);
            
//#line 2972
final double X10_TEMP42 =
              (X10_TEMP681);
            
//#line 2973
final double X10_TEMP684 =
              (X10_TEMP42);
            
//#line 2975
final double X10_TEMP687 =
              (X10_TEMP684);
            
//#line 2976
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xcoord =
              ((X10_TEMP687));
        }
        
//#line 2978
final double X10_TEMP689 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ycoord);
        
//#line 2980
final double X10_TEMP43 =
          (X10_TEMP689);
        
//#line 2981
final int X10_TEMP692 =
          (0);
        
//#line 2983
final int X10_TEMP44 =
          (X10_TEMP692);
        
//#line 2984
final boolean X10_TEMP46 =
          (X10_TEMP43 <
             X10_TEMP44);
        
//#line 2985
if (X10_TEMP46) {
            
//#line 2986
final double X10_TEMP697 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ycoord);
            
//#line 2988
final double X10_TEMP47 =
              (X10_TEMP697);
            
//#line 2989
final double X10_TEMP700 =
              (X10_TEMP47 +
                 X10_TEMP1);
            
//#line 2991
final double X10_TEMP50 =
              (X10_TEMP700);
            
//#line 2992
final double X10_TEMP703 =
              (X10_TEMP50);
            
//#line 2994
final double X10_TEMP51 =
              (X10_TEMP703);
            
//#line 2995
final double X10_TEMP706 =
              (X10_TEMP51);
            
//#line 2997
final double X10_TEMP709 =
              (X10_TEMP706);
            
//#line 2998
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ycoord =
              ((X10_TEMP709));
        }
        
//#line 3000
final double X10_TEMP711 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ycoord);
        
//#line 3002
final double X10_TEMP52 =
          (X10_TEMP711);
        
//#line 3003
final boolean X10_TEMP54 =
          (X10_TEMP52 >
             X10_TEMP1);
        
//#line 3004
if (X10_TEMP54) {
            
//#line 3005
final double X10_TEMP716 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ycoord);
            
//#line 3007
final double X10_TEMP55 =
              (X10_TEMP716);
            
//#line 3008
final double X10_TEMP719 =
              (X10_TEMP55 -
                 X10_TEMP1);
            
//#line 3010
final double X10_TEMP58 =
              (X10_TEMP719);
            
//#line 3011
final double X10_TEMP722 =
              (X10_TEMP58);
            
//#line 3013
final double X10_TEMP59 =
              (X10_TEMP722);
            
//#line 3014
final double X10_TEMP725 =
              (X10_TEMP59);
            
//#line 3016
final double X10_TEMP728 =
              (X10_TEMP725);
            
//#line 3017
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ycoord =
              ((X10_TEMP728));
        }
        
//#line 3019
final double X10_TEMP730 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zcoord);
        
//#line 3021
final double X10_TEMP60 =
          (X10_TEMP730);
        
//#line 3022
final int X10_TEMP733 =
          (0);
        
//#line 3024
final int X10_TEMP61 =
          (X10_TEMP733);
        
//#line 3025
final boolean X10_TEMP63 =
          (X10_TEMP60 <
             X10_TEMP61);
        
//#line 3026
if (X10_TEMP63) {
            
//#line 3027
final double X10_TEMP738 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zcoord);
            
//#line 3029
final double X10_TEMP64 =
              (X10_TEMP738);
            
//#line 3030
final double X10_TEMP741 =
              (X10_TEMP64 +
                 X10_TEMP1);
            
//#line 3032
final double X10_TEMP67 =
              (X10_TEMP741);
            
//#line 3033
final double X10_TEMP744 =
              (X10_TEMP67);
            
//#line 3035
final double X10_TEMP68 =
              (X10_TEMP744);
            
//#line 3036
final double X10_TEMP747 =
              (X10_TEMP68);
            
//#line 3038
final double X10_TEMP750 =
              (X10_TEMP747);
            
//#line 3039
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zcoord =
              ((X10_TEMP750));
        }
        
//#line 3041
final double X10_TEMP752 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zcoord);
        
//#line 3043
final double X10_TEMP69 =
          (X10_TEMP752);
        
//#line 3044
final boolean X10_TEMP71 =
          (X10_TEMP69 >
             X10_TEMP1);
        
//#line 3045
if (X10_TEMP71) {
            
//#line 3046
final double X10_TEMP757 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zcoord);
            
//#line 3048
final double X10_TEMP72 =
              (X10_TEMP757);
            
//#line 3049
final double X10_TEMP760 =
              (X10_TEMP72 -
                 X10_TEMP1);
            
//#line 3051
final double X10_TEMP75 =
              (X10_TEMP760);
            
//#line 3052
final double X10_TEMP763 =
              (X10_TEMP75);
            
//#line 3054
final double X10_TEMP76 =
              (X10_TEMP763);
            
//#line 3055
final double X10_TEMP766 =
              (X10_TEMP76);
            
//#line 3057
final double X10_TEMP769 =
              (X10_TEMP766);
            
//#line 3058
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zcoord =
              ((X10_TEMP769));
        }
        
//#line 3060
final double X10_TEMP771 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xvelocity);
        
//#line 3062
final double X10_TEMP77 =
          (X10_TEMP771);
        
//#line 3063
final double X10_TEMP774 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xforce);
        
//#line 3065
final double X10_TEMP78 =
          (X10_TEMP774);
        
//#line 3066
final double X10_TEMP777 =
          (X10_TEMP77 +
             X10_TEMP78);
        
//#line 3068
final double X10_TEMP81 =
          (X10_TEMP777);
        
//#line 3069
final double X10_TEMP780 =
          (X10_TEMP81);
        
//#line 3071
final double X10_TEMP82 =
          (X10_TEMP780);
        
//#line 3072
final double X10_TEMP783 =
          (X10_TEMP82);
        
//#line 3074
final double X10_TEMP786 =
          (X10_TEMP783);
        
//#line 3075
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xvelocity =
          ((X10_TEMP786));
        
//#line 3076
final double X10_TEMP788 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yvelocity);
        
//#line 3078
final double X10_TEMP83 =
          (X10_TEMP788);
        
//#line 3079
final double X10_TEMP791 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yforce);
        
//#line 3081
final double X10_TEMP84 =
          (X10_TEMP791);
        
//#line 3082
final double X10_TEMP794 =
          (X10_TEMP83 +
             X10_TEMP84);
        
//#line 3084
final double X10_TEMP87 =
          (X10_TEMP794);
        
//#line 3085
final double X10_TEMP797 =
          (X10_TEMP87);
        
//#line 3087
final double X10_TEMP88 =
          (X10_TEMP797);
        
//#line 3088
final double X10_TEMP800 =
          (X10_TEMP88);
        
//#line 3090
final double X10_TEMP803 =
          (X10_TEMP800);
        
//#line 3091
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yvelocity =
          ((X10_TEMP803));
        
//#line 3092
final double X10_TEMP805 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zvelocity);
        
//#line 3094
final double X10_TEMP89 =
          (X10_TEMP805);
        
//#line 3095
final double X10_TEMP808 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zforce);
        
//#line 3097
final double X10_TEMP90 =
          (X10_TEMP808);
        
//#line 3098
final double X10_TEMP811 =
          (X10_TEMP89 +
             X10_TEMP90);
        
//#line 3100
final double X10_TEMP93 =
          (X10_TEMP811);
        
//#line 3101
final double X10_TEMP814 =
          (X10_TEMP93);
        
//#line 3103
final double X10_TEMP94 =
          (X10_TEMP814);
        
//#line 3104
final double X10_TEMP817 =
          (X10_TEMP94);
        
//#line 3106
final double X10_TEMP820 =
          (X10_TEMP817);
        
//#line 3107
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zvelocity =
          ((X10_TEMP820));
        
//#line 3108
final double X10_TEMP822 =
          (0.0);
        
//#line 3110
final double X10_TEMP97 =
          (X10_TEMP822);
        
//#line 3111
final double X10_TEMP825 =
          (X10_TEMP97);
        
//#line 3113
final double X10_TEMP98 =
          (X10_TEMP825);
        
//#line 3114
final double X10_TEMP828 =
          (X10_TEMP98);
        
//#line 3116
final double X10_TEMP831 =
          (X10_TEMP828);
        
//#line 3117
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xforce =
          ((X10_TEMP831));
        
//#line 3118
final double X10_TEMP833 =
          (0.0);
        
//#line 3120
final double X10_TEMP101 =
          (X10_TEMP833);
        
//#line 3121
final double X10_TEMP836 =
          (X10_TEMP101);
        
//#line 3123
final double X10_TEMP102 =
          (X10_TEMP836);
        
//#line 3124
final double X10_TEMP839 =
          (X10_TEMP102);
        
//#line 3126
final double X10_TEMP842 =
          (X10_TEMP839);
        
//#line 3127
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yforce =
          ((X10_TEMP842));
        
//#line 3128
final double X10_TEMP844 =
          (0.0);
        
//#line 3130
final double X10_TEMP105 =
          (X10_TEMP844);
        
//#line 3131
final double X10_TEMP847 =
          (X10_TEMP105);
        
//#line 3133
final double X10_TEMP106 =
          (X10_TEMP847);
        
//#line 3134
final double X10_TEMP850 =
          (X10_TEMP106);
        
//#line 3136
final double X10_TEMP853 =
          (X10_TEMP850);
        
//#line 3137
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zforce =
          ((X10_TEMP853));
    }
    
    
//#line 3139
public static void
                    Program_Particle_force(
                    final Particle X10_TEMP0,
                    final double side,
                    final double rcoff,
                    final int mdsize,
                    final int x,
                    final md md1) {
        
//#line 3140
double X10_TEMP1 =
          (side);
        
//#line 3141
double X10_TEMP2 =
          (rcoff);
        
//#line 3142
int X10_TEMP3 =
          (mdsize);
        
//#line 3143
int X10_TEMP4 =
          (x);
        
//#line 3144
md X10_TEMP5 =
          (md1);
        
//#line 3145
final double X10_TEMP583 =
          (0.0);
        
//#line 3147
double sideh =
          (X10_TEMP583);
        
//#line 3148
final double X10_TEMP586 =
          (0.0);
        
//#line 3150
double rcoffs =
          (X10_TEMP586);
        
//#line 3151
final double X10_TEMP589 =
          (0.0);
        
//#line 3153
double xx =
          (X10_TEMP589);
        
//#line 3154
final double X10_TEMP592 =
          (0.0);
        
//#line 3156
double yy =
          (X10_TEMP592);
        
//#line 3157
final double X10_TEMP595 =
          (0.0);
        
//#line 3159
double zz =
          (X10_TEMP595);
        
//#line 3160
final double X10_TEMP598 =
          (0.0);
        
//#line 3162
double xi =
          (X10_TEMP598);
        
//#line 3163
final double X10_TEMP601 =
          (0.0);
        
//#line 3165
double yi =
          (X10_TEMP601);
        
//#line 3166
final double X10_TEMP604 =
          (0.0);
        
//#line 3168
double zi =
          (X10_TEMP604);
        
//#line 3169
final double X10_TEMP607 =
          (0.0);
        
//#line 3171
double fxi =
          (X10_TEMP607);
        
//#line 3172
final double X10_TEMP610 =
          (0.0);
        
//#line 3174
double fyi =
          (X10_TEMP610);
        
//#line 3175
final double X10_TEMP613 =
          (0.0);
        
//#line 3177
double fzi =
          (X10_TEMP613);
        
//#line 3178
final double X10_TEMP616 =
          (0.0);
        
//#line 3180
double rd =
          (X10_TEMP616);
        
//#line 3181
final double X10_TEMP619 =
          (0.0);
        
//#line 3183
double rrd =
          (X10_TEMP619);
        
//#line 3184
final double X10_TEMP622 =
          (0.0);
        
//#line 3186
double rrd2 =
          (X10_TEMP622);
        
//#line 3187
final double X10_TEMP625 =
          (0.0);
        
//#line 3189
double rrd3 =
          (X10_TEMP625);
        
//#line 3190
final double X10_TEMP628 =
          (0.0);
        
//#line 3192
double rrd4 =
          (X10_TEMP628);
        
//#line 3193
final double X10_TEMP631 =
          (0.0);
        
//#line 3195
double rrd6 =
          (X10_TEMP631);
        
//#line 3196
final double X10_TEMP634 =
          (0.0);
        
//#line 3198
double rrd7 =
          (X10_TEMP634);
        
//#line 3199
final double X10_TEMP637 =
          (0.0);
        
//#line 3201
double r148 =
          (X10_TEMP637);
        
//#line 3202
final double X10_TEMP640 =
          (0.0);
        
//#line 3204
double forcex =
          (X10_TEMP640);
        
//#line 3205
final double X10_TEMP643 =
          (0.0);
        
//#line 3207
double forcey =
          (X10_TEMP643);
        
//#line 3208
final double X10_TEMP646 =
          (0.0);
        
//#line 3210
double forcez =
          (X10_TEMP646);
        
//#line 3211
final double X10_TEMP649 =
          (0.5);
        
//#line 3213
final double X10_TEMP28 =
          (X10_TEMP649);
        
//#line 3214
final double X10_TEMP652 =
          (X10_TEMP28 *
             X10_TEMP1);
        
//#line 3216
final double X10_TEMP30 =
          (X10_TEMP652);
        
//#line 3217
final double X10_TEMP655 =
          (X10_TEMP30);
        
//#line 3219
sideh =
          ((X10_TEMP655));
        
//#line 3220
final double X10_TEMP658 =
          (X10_TEMP2 *
             X10_TEMP2);
        
//#line 3222
final double X10_TEMP32 =
          (X10_TEMP658);
        
//#line 3223
final double X10_TEMP661 =
          (X10_TEMP32);
        
//#line 3225
rcoffs =
          ((X10_TEMP661));
        
//#line 3226
final double X10_TEMP664 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xcoord);
        
//#line 3228
final double X10_TEMP34 =
          (X10_TEMP664);
        
//#line 3229
final double X10_TEMP667 =
          (X10_TEMP34);
        
//#line 3231
xi =
          ((X10_TEMP667));
        
//#line 3232
final double X10_TEMP670 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ycoord);
        
//#line 3234
final double X10_TEMP36 =
          (X10_TEMP670);
        
//#line 3235
final double X10_TEMP673 =
          (X10_TEMP36);
        
//#line 3237
yi =
          ((X10_TEMP673));
        
//#line 3238
final double X10_TEMP676 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zcoord);
        
//#line 3240
final double X10_TEMP38 =
          (X10_TEMP676);
        
//#line 3241
final double X10_TEMP679 =
          (X10_TEMP38);
        
//#line 3243
zi =
          ((X10_TEMP679));
        
//#line 3244
final double X10_TEMP682 =
          (0.0);
        
//#line 3246
final double X10_TEMP40 =
          (X10_TEMP682);
        
//#line 3247
final double X10_TEMP685 =
          (X10_TEMP40);
        
//#line 3249
fxi =
          ((X10_TEMP685));
        
//#line 3250
final double X10_TEMP688 =
          (0.0);
        
//#line 3252
final double X10_TEMP42 =
          (X10_TEMP688);
        
//#line 3253
final double X10_TEMP691 =
          (X10_TEMP42);
        
//#line 3255
fyi =
          ((X10_TEMP691));
        
//#line 3256
final double X10_TEMP694 =
          (0.0);
        
//#line 3258
final double X10_TEMP44 =
          (X10_TEMP694);
        
//#line 3259
final double X10_TEMP697 =
          (X10_TEMP44);
        
//#line 3261
fzi =
          ((X10_TEMP697));
        
//#line 3262
final int X10_TEMP700 =
          (1);
        
//#line 3264
final int X10_TEMP45 =
          (X10_TEMP700);
        
//#line 3265
final int X10_TEMP703 =
          (X10_TEMP4 +
             X10_TEMP45);
        
//#line 3267
final int X10_TEMP49 =
          (X10_TEMP703);
        
//#line 3268
final int X10_TEMP706 =
          (1);
        
//#line 3270
final int X10_TEMP47 =
          (X10_TEMP706);
        
//#line 3271
final int X10_TEMP709 =
          (X10_TEMP3 -
             X10_TEMP47);
        
//#line 3273
final int X10_TEMP50 =
          (X10_TEMP709);
        
//#line 3274
final x10.
          lang.
          region X10_TEMP714 =
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
                  X10_TEMP49,
                  X10_TEMP50))));
        
//#line 3276
final x10.
          lang.
          region X10_TEMP52 =
          (x10.
            lang.
            region)
            ((X10_TEMP714));
        
//#line 3277
/* template:forloop-mult { */{
        x10.lang.region __var229__ = (x10.lang.region) X10_TEMP52;
        if (__var229__.size() > 0 && (__var229__ instanceof x10.array.MultiDimRegion || __var229__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var230__ = __var229__.rank(0).low(), __var231__ = __var229__.rank(0).high(); __var230__ <= __var231__; __var230__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int i = __var230__;
        /* } */
        /* } */
{
            
//#line 3278
final x10.
              lang.
              GenericReferenceArray X10_TEMP718 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.one));
            
//#line 3280
final x10.
              lang.
              GenericReferenceArray X10_TEMP53 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP718));
            
//#line 3281
final Particle X10_TEMP722 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP53).get(i))/* } */))/* } */);
            
//#line 3283
final Particle X10_TEMP55 =
              (X10_TEMP722);
            
//#line 3284
final double X10_TEMP725 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP55))/* } */.xcoord);
            
//#line 3286
final double X10_TEMP56 =
              (X10_TEMP725);
            
//#line 3287
final double X10_TEMP728 =
              (xi -
                 X10_TEMP56);
            
//#line 3289
final double X10_TEMP58 =
              (X10_TEMP728);
            
//#line 3290
final double X10_TEMP731 =
              (X10_TEMP58);
            
//#line 3292
xx =
              ((X10_TEMP731));
            
//#line 3293
final x10.
              lang.
              GenericReferenceArray X10_TEMP734 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.one));
            
//#line 3295
final x10.
              lang.
              GenericReferenceArray X10_TEMP59 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP734));
            
//#line 3296
final Particle X10_TEMP738 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP59).get(i))/* } */))/* } */);
            
//#line 3298
final Particle X10_TEMP61 =
              (X10_TEMP738);
            
//#line 3299
final double X10_TEMP741 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP61))/* } */.ycoord);
            
//#line 3301
final double X10_TEMP62 =
              (X10_TEMP741);
            
//#line 3302
final double X10_TEMP744 =
              (yi -
                 X10_TEMP62);
            
//#line 3304
final double X10_TEMP64 =
              (X10_TEMP744);
            
//#line 3305
final double X10_TEMP747 =
              (X10_TEMP64);
            
//#line 3307
yy =
              ((X10_TEMP747));
            
//#line 3308
final x10.
              lang.
              GenericReferenceArray X10_TEMP750 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.one));
            
//#line 3310
final x10.
              lang.
              GenericReferenceArray X10_TEMP65 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP750));
            
//#line 3311
final Particle X10_TEMP754 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP65).get(i))/* } */))/* } */);
            
//#line 3313
final Particle X10_TEMP67 =
              (X10_TEMP754);
            
//#line 3314
final double X10_TEMP757 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP67))/* } */.zcoord);
            
//#line 3316
final double X10_TEMP68 =
              (X10_TEMP757);
            
//#line 3317
final double X10_TEMP760 =
              (zi -
                 X10_TEMP68);
            
//#line 3319
final double X10_TEMP70 =
              (X10_TEMP760);
            
//#line 3320
final double X10_TEMP763 =
              (X10_TEMP70);
            
//#line 3322
zz =
              ((X10_TEMP763));
            
//#line 3323
final int X10_TEMP71 =
              (0);
            
//#line 3324
final double X10_TEMP767 =
              (X10_TEMP71 -
                 sideh);
            
//#line 3326
final double X10_TEMP73 =
              (X10_TEMP767);
            
//#line 3327
final boolean X10_TEMP75 =
              (xx <
                 X10_TEMP73);
            
//#line 3328
if (X10_TEMP75) {
                
//#line 3329
final double X10_TEMP772 =
                  (xx +
                     X10_TEMP1);
                
//#line 3331
final double X10_TEMP77 =
                  (X10_TEMP772);
                
//#line 3332
final double X10_TEMP775 =
                  (X10_TEMP77);
                
//#line 3334
xx =
                  ((X10_TEMP775));
            }
            
//#line 3336
final double X10_TEMP778 =
              (sideh);
            
//#line 3338
final double X10_TEMP79 =
              (X10_TEMP778);
            
//#line 3339
final boolean X10_TEMP81 =
              (xx >
                 X10_TEMP79);
            
//#line 3340
if (X10_TEMP81) {
                
//#line 3341
final double X10_TEMP783 =
                  (xx -
                     X10_TEMP1);
                
//#line 3343
final double X10_TEMP83 =
                  (X10_TEMP783);
                
//#line 3344
final double X10_TEMP786 =
                  (X10_TEMP83);
                
//#line 3346
xx =
                  ((X10_TEMP786));
            }
            
//#line 3348
final int X10_TEMP84 =
              (0);
            
//#line 3349
final double X10_TEMP790 =
              (X10_TEMP84 -
                 sideh);
            
//#line 3351
final double X10_TEMP86 =
              (X10_TEMP790);
            
//#line 3352
final boolean X10_TEMP88 =
              (yy <
                 X10_TEMP86);
            
//#line 3353
if (X10_TEMP88) {
                
//#line 3354
final double X10_TEMP795 =
                  (yy +
                     X10_TEMP1);
                
//#line 3356
final double X10_TEMP90 =
                  (X10_TEMP795);
                
//#line 3357
final double X10_TEMP798 =
                  (X10_TEMP90);
                
//#line 3359
yy =
                  ((X10_TEMP798));
            }
            
//#line 3361
final double X10_TEMP801 =
              (sideh);
            
//#line 3363
final double X10_TEMP92 =
              (X10_TEMP801);
            
//#line 3364
final boolean X10_TEMP94 =
              (yy >
                 X10_TEMP92);
            
//#line 3365
if (X10_TEMP94) {
                
//#line 3366
final double X10_TEMP806 =
                  (yy -
                     X10_TEMP1);
                
//#line 3368
final double X10_TEMP96 =
                  (X10_TEMP806);
                
//#line 3369
final double X10_TEMP809 =
                  (X10_TEMP96);
                
//#line 3371
yy =
                  ((X10_TEMP809));
            }
            
//#line 3373
final int X10_TEMP97 =
              (0);
            
//#line 3374
final double X10_TEMP813 =
              (X10_TEMP97 -
                 sideh);
            
//#line 3376
final double X10_TEMP99 =
              (X10_TEMP813);
            
//#line 3377
final boolean X10_TEMP101 =
              (zz <
                 X10_TEMP99);
            
//#line 3378
if (X10_TEMP101) {
                
//#line 3379
final double X10_TEMP818 =
                  (zz +
                     X10_TEMP1);
                
//#line 3381
final double X10_TEMP103 =
                  (X10_TEMP818);
                
//#line 3382
final double X10_TEMP821 =
                  (X10_TEMP103);
                
//#line 3384
zz =
                  ((X10_TEMP821));
            }
            
//#line 3386
final double X10_TEMP824 =
              (sideh);
            
//#line 3388
final double X10_TEMP105 =
              (X10_TEMP824);
            
//#line 3389
final boolean X10_TEMP107 =
              (zz >
                 X10_TEMP105);
            
//#line 3390
if (X10_TEMP107) {
                
//#line 3391
final double X10_TEMP829 =
                  (zz -
                     X10_TEMP1);
                
//#line 3393
final double X10_TEMP109 =
                  (X10_TEMP829);
                
//#line 3394
final double X10_TEMP832 =
                  (X10_TEMP109);
                
//#line 3396
zz =
                  ((X10_TEMP832));
            }
            
//#line 3398
final double X10_TEMP835 =
              (xx *
                 xx);
            
//#line 3400
final double X10_TEMP110 =
              (X10_TEMP835);
            
//#line 3401
final double X10_TEMP838 =
              (yy *
                 yy);
            
//#line 3403
final double X10_TEMP111 =
              (X10_TEMP838);
            
//#line 3404
final double X10_TEMP841 =
              (X10_TEMP110 +
                 X10_TEMP111);
            
//#line 3406
final double X10_TEMP112 =
              (X10_TEMP841);
            
//#line 3407
final double X10_TEMP844 =
              (zz *
                 zz);
            
//#line 3409
final double X10_TEMP113 =
              (X10_TEMP844);
            
//#line 3410
final double X10_TEMP847 =
              (X10_TEMP112 +
                 X10_TEMP113);
            
//#line 3412
final double X10_TEMP115 =
              (X10_TEMP847);
            
//#line 3413
final double X10_TEMP850 =
              (X10_TEMP115);
            
//#line 3415
rd =
              ((X10_TEMP850));
            
//#line 3416
final boolean X10_TEMP117 =
              (rd <=
                 rcoffs);
            
//#line 3417
if (X10_TEMP117) {
                
//#line 3418
final double X10_TEMP855 =
                  (1.0);
                
//#line 3420
final double X10_TEMP118 =
                  (X10_TEMP855);
                
//#line 3421
final double X10_TEMP858 =
                  (X10_TEMP118 /
                     rd);
                
//#line 3423
final double X10_TEMP120 =
                  (X10_TEMP858);
                
//#line 3424
final double X10_TEMP861 =
                  (X10_TEMP120);
                
//#line 3426
rrd =
                  ((X10_TEMP861));
                
//#line 3427
final double X10_TEMP864 =
                  (rrd *
                     rrd);
                
//#line 3429
final double X10_TEMP122 =
                  (X10_TEMP864);
                
//#line 3430
final double X10_TEMP867 =
                  (X10_TEMP122);
                
//#line 3432
rrd2 =
                  ((X10_TEMP867));
                
//#line 3433
final double X10_TEMP870 =
                  (rrd2 *
                     rrd);
                
//#line 3435
final double X10_TEMP124 =
                  (X10_TEMP870);
                
//#line 3436
final double X10_TEMP873 =
                  (X10_TEMP124);
                
//#line 3438
rrd3 =
                  ((X10_TEMP873));
                
//#line 3439
final double X10_TEMP876 =
                  (rrd2 *
                     rrd2);
                
//#line 3441
final double X10_TEMP126 =
                  (X10_TEMP876);
                
//#line 3442
final double X10_TEMP879 =
                  (X10_TEMP126);
                
//#line 3444
rrd4 =
                  ((X10_TEMP879));
                
//#line 3445
final double X10_TEMP882 =
                  (rrd2 *
                     rrd4);
                
//#line 3447
final double X10_TEMP128 =
                  (X10_TEMP882);
                
//#line 3448
final double X10_TEMP885 =
                  (X10_TEMP128);
                
//#line 3450
rrd6 =
                  ((X10_TEMP885));
                
//#line 3451
final double X10_TEMP888 =
                  (rrd6 *
                     rrd);
                
//#line 3453
final double X10_TEMP130 =
                  (X10_TEMP888);
                
//#line 3454
final double X10_TEMP891 =
                  (X10_TEMP130);
                
//#line 3456
rrd7 =
                  ((X10_TEMP891));
                
//#line 3457
final double X10_TEMP894 =
                  (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.epot);
                
//#line 3459
final double X10_TEMP133 =
                  (X10_TEMP894);
                
//#line 3460
final double X10_TEMP897 =
                  (rrd6 -
                     rrd3);
                
//#line 3462
final double X10_TEMP132 =
                  (X10_TEMP897);
                
//#line 3463
final double X10_TEMP900 =
                  (X10_TEMP133 +
                     X10_TEMP132);
                
//#line 3465
final double X10_TEMP136 =
                  (X10_TEMP900);
                
//#line 3466
final double X10_TEMP903 =
                  (X10_TEMP136);
                
//#line 3468
final double X10_TEMP137 =
                  (X10_TEMP903);
                
//#line 3469
final double X10_TEMP906 =
                  (X10_TEMP137);
                
//#line 3471
final double X10_TEMP909 =
                  (X10_TEMP906);
                
//#line 3472
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.epot =
                  ((X10_TEMP909));
                
//#line 3473
final double X10_TEMP911 =
                  (0.5);
                
//#line 3475
final double X10_TEMP138 =
                  (X10_TEMP911);
                
//#line 3476
final double X10_TEMP914 =
                  (X10_TEMP138 *
                     rrd4);
                
//#line 3478
final double X10_TEMP139 =
                  (X10_TEMP914);
                
//#line 3479
final double X10_TEMP917 =
                  (rrd7 -
                     X10_TEMP139);
                
//#line 3481
final double X10_TEMP141 =
                  (X10_TEMP917);
                
//#line 3482
final double X10_TEMP920 =
                  (X10_TEMP141);
                
//#line 3484
r148 =
                  ((X10_TEMP920));
                
//#line 3485
final double X10_TEMP923 =
                  (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.vir);
                
//#line 3487
final double X10_TEMP142 =
                  (X10_TEMP923);
                
//#line 3488
final double X10_TEMP926 =
                  (rd *
                     r148);
                
//#line 3490
final double X10_TEMP143 =
                  (X10_TEMP926);
                
//#line 3491
final double X10_TEMP929 =
                  (X10_TEMP142 -
                     X10_TEMP143);
                
//#line 3493
final double X10_TEMP146 =
                  (X10_TEMP929);
                
//#line 3494
final double X10_TEMP932 =
                  (X10_TEMP146);
                
//#line 3496
final double X10_TEMP147 =
                  (X10_TEMP932);
                
//#line 3497
final double X10_TEMP935 =
                  (X10_TEMP147);
                
//#line 3499
final double X10_TEMP938 =
                  (X10_TEMP935);
                
//#line 3500
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.vir =
                  ((X10_TEMP938));
                
//#line 3501
final double X10_TEMP940 =
                  (xx *
                     r148);
                
//#line 3503
final double X10_TEMP149 =
                  (X10_TEMP940);
                
//#line 3504
final double X10_TEMP943 =
                  (X10_TEMP149);
                
//#line 3506
forcex =
                  ((X10_TEMP943));
                
//#line 3507
final double X10_TEMP946 =
                  (fxi +
                     forcex);
                
//#line 3509
final double X10_TEMP151 =
                  (X10_TEMP946);
                
//#line 3510
final double X10_TEMP949 =
                  (X10_TEMP151);
                
//#line 3512
fxi =
                  ((X10_TEMP949));
                
//#line 3513
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP952 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.one));
                
//#line 3515
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP152 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP952));
                
//#line 3516
final Particle X10_TEMP956 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP152).get(i))/* } */))/* } */);
                
//#line 3518
final Particle X10_TEMP154 =
                  (X10_TEMP956);
                
//#line 3519
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP959 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.one));
                
//#line 3521
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP155 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP959));
                
//#line 3522
final Particle X10_TEMP963 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP155).get(i))/* } */))/* } */);
                
//#line 3524
final Particle X10_TEMP157 =
                  (X10_TEMP963);
                
//#line 3525
final double X10_TEMP966 =
                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP157))/* } */.xforce);
                
//#line 3527
final double X10_TEMP158 =
                  (X10_TEMP966);
                
//#line 3528
final double X10_TEMP969 =
                  (X10_TEMP158 -
                     forcex);
                
//#line 3530
final double X10_TEMP161 =
                  (X10_TEMP969);
                
//#line 3531
final double X10_TEMP972 =
                  (X10_TEMP161);
                
//#line 3533
final double X10_TEMP162 =
                  (X10_TEMP972);
                
//#line 3534
final double X10_TEMP975 =
                  (X10_TEMP162);
                
//#line 3536
final double X10_TEMP978 =
                  (X10_TEMP975);
                
//#line 3537
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP154))/* } */.xforce =
                  ((X10_TEMP978));
                
//#line 3538
final double X10_TEMP980 =
                  (yy *
                     r148);
                
//#line 3540
final double X10_TEMP164 =
                  (X10_TEMP980);
                
//#line 3541
final double X10_TEMP983 =
                  (X10_TEMP164);
                
//#line 3543
forcey =
                  ((X10_TEMP983));
                
//#line 3544
final double X10_TEMP986 =
                  (fyi +
                     forcey);
                
//#line 3546
final double X10_TEMP166 =
                  (X10_TEMP986);
                
//#line 3547
final double X10_TEMP989 =
                  (X10_TEMP166);
                
//#line 3549
fyi =
                  ((X10_TEMP989));
                
//#line 3550
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP992 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.one));
                
//#line 3552
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP167 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP992));
                
//#line 3553
final Particle X10_TEMP996 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP167).get(i))/* } */))/* } */);
                
//#line 3555
final Particle X10_TEMP169 =
                  (X10_TEMP996);
                
//#line 3556
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP999 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.one));
                
//#line 3558
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP170 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP999));
                
//#line 3559
final Particle X10_TEMP1003 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP170).get(i))/* } */))/* } */);
                
//#line 3561
final Particle X10_TEMP172 =
                  (X10_TEMP1003);
                
//#line 3562
final double X10_TEMP1006 =
                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP172))/* } */.yforce);
                
//#line 3564
final double X10_TEMP173 =
                  (X10_TEMP1006);
                
//#line 3565
final double X10_TEMP1009 =
                  (X10_TEMP173 -
                     forcey);
                
//#line 3567
final double X10_TEMP176 =
                  (X10_TEMP1009);
                
//#line 3568
final double X10_TEMP1012 =
                  (X10_TEMP176);
                
//#line 3570
final double X10_TEMP177 =
                  (X10_TEMP1012);
                
//#line 3571
final double X10_TEMP1015 =
                  (X10_TEMP177);
                
//#line 3573
final double X10_TEMP1018 =
                  (X10_TEMP1015);
                
//#line 3574
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP169))/* } */.yforce =
                  ((X10_TEMP1018));
                
//#line 3575
final double X10_TEMP1020 =
                  (zz *
                     r148);
                
//#line 3577
final double X10_TEMP179 =
                  (X10_TEMP1020);
                
//#line 3578
final double X10_TEMP1023 =
                  (X10_TEMP179);
                
//#line 3580
forcez =
                  ((X10_TEMP1023));
                
//#line 3581
final double X10_TEMP1026 =
                  (fzi +
                     forcez);
                
//#line 3583
final double X10_TEMP181 =
                  (X10_TEMP1026);
                
//#line 3584
final double X10_TEMP1029 =
                  (X10_TEMP181);
                
//#line 3586
fzi =
                  ((X10_TEMP1029));
                
//#line 3587
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP1032 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.one));
                
//#line 3589
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP182 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP1032));
                
//#line 3590
final Particle X10_TEMP1036 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP182).get(i))/* } */))/* } */);
                
//#line 3592
final Particle X10_TEMP184 =
                  (X10_TEMP1036);
                
//#line 3593
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP1039 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.one));
                
//#line 3595
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP185 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP1039));
                
//#line 3596
final Particle X10_TEMP1043 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP185).get(i))/* } */))/* } */);
                
//#line 3598
final Particle X10_TEMP187 =
                  (X10_TEMP1043);
                
//#line 3599
final double X10_TEMP1046 =
                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP187))/* } */.zforce);
                
//#line 3601
final double X10_TEMP188 =
                  (X10_TEMP1046);
                
//#line 3602
final double X10_TEMP1049 =
                  (X10_TEMP188 -
                     forcez);
                
//#line 3604
final double X10_TEMP191 =
                  (X10_TEMP1049);
                
//#line 3605
final double X10_TEMP1052 =
                  (X10_TEMP191);
                
//#line 3607
final double X10_TEMP192 =
                  (X10_TEMP1052);
                
//#line 3608
final double X10_TEMP1055 =
                  (X10_TEMP192);
                
//#line 3610
final double X10_TEMP1058 =
                  (X10_TEMP1055);
                
//#line 3611
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP184))/* } */.zforce =
                  ((X10_TEMP1058));
                
//#line 3612
final int X10_TEMP1060 =
                  (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.interactions);
                
//#line 3614
final int X10_TEMP193 =
                  (X10_TEMP1060);
                
//#line 3615
final int X10_TEMP194 =
                  (1);
                
//#line 3616
final int X10_TEMP1064 =
                  (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.interactions);
                
//#line 3618
final int X10_TEMP195 =
                  (X10_TEMP1064);
                
//#line 3619
final int X10_TEMP1067 =
                  (X10_TEMP195 +
                     X10_TEMP194);
                
//#line 3621
final int X10_TEMP196 =
                  (X10_TEMP1067);
                
//#line 3622
final int X10_TEMP1070 =
                  (X10_TEMP196);
                
//#line 3624
final int X10_TEMP1073 =
                  (X10_TEMP1070);
                
//#line 3625
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.interactions =
                  ((X10_TEMP1073));
            }
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var24____ = (__var229__).iterator(); __var24____.hasNext(); ) {
        	final  x10.
          lang.
          point __var24__ = (x10.
          lang.
          point) __var24____.next();
        	/* Join: { *//* Join: { */final int i =
          /* template:array_get { */((__var24__).get(0))/* } */;/* } */
{
            
//#line 3278
final x10.
              lang.
              GenericReferenceArray X10_TEMP718 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.one));
            
//#line 3280
final x10.
              lang.
              GenericReferenceArray X10_TEMP53 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP718));
            
//#line 3281
final Particle X10_TEMP722 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP53).get(i))/* } */))/* } */);
            
//#line 3283
final Particle X10_TEMP55 =
              (X10_TEMP722);
            
//#line 3284
final double X10_TEMP725 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP55))/* } */.xcoord);
            
//#line 3286
final double X10_TEMP56 =
              (X10_TEMP725);
            
//#line 3287
final double X10_TEMP728 =
              (xi -
                 X10_TEMP56);
            
//#line 3289
final double X10_TEMP58 =
              (X10_TEMP728);
            
//#line 3290
final double X10_TEMP731 =
              (X10_TEMP58);
            
//#line 3292
xx =
              ((X10_TEMP731));
            
//#line 3293
final x10.
              lang.
              GenericReferenceArray X10_TEMP734 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.one));
            
//#line 3295
final x10.
              lang.
              GenericReferenceArray X10_TEMP59 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP734));
            
//#line 3296
final Particle X10_TEMP738 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP59).get(i))/* } */))/* } */);
            
//#line 3298
final Particle X10_TEMP61 =
              (X10_TEMP738);
            
//#line 3299
final double X10_TEMP741 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP61))/* } */.ycoord);
            
//#line 3301
final double X10_TEMP62 =
              (X10_TEMP741);
            
//#line 3302
final double X10_TEMP744 =
              (yi -
                 X10_TEMP62);
            
//#line 3304
final double X10_TEMP64 =
              (X10_TEMP744);
            
//#line 3305
final double X10_TEMP747 =
              (X10_TEMP64);
            
//#line 3307
yy =
              ((X10_TEMP747));
            
//#line 3308
final x10.
              lang.
              GenericReferenceArray X10_TEMP750 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.one));
            
//#line 3310
final x10.
              lang.
              GenericReferenceArray X10_TEMP65 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP750));
            
//#line 3311
final Particle X10_TEMP754 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP65).get(i))/* } */))/* } */);
            
//#line 3313
final Particle X10_TEMP67 =
              (X10_TEMP754);
            
//#line 3314
final double X10_TEMP757 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP67))/* } */.zcoord);
            
//#line 3316
final double X10_TEMP68 =
              (X10_TEMP757);
            
//#line 3317
final double X10_TEMP760 =
              (zi -
                 X10_TEMP68);
            
//#line 3319
final double X10_TEMP70 =
              (X10_TEMP760);
            
//#line 3320
final double X10_TEMP763 =
              (X10_TEMP70);
            
//#line 3322
zz =
              ((X10_TEMP763));
            
//#line 3323
final int X10_TEMP71 =
              (0);
            
//#line 3324
final double X10_TEMP767 =
              (X10_TEMP71 -
                 sideh);
            
//#line 3326
final double X10_TEMP73 =
              (X10_TEMP767);
            
//#line 3327
final boolean X10_TEMP75 =
              (xx <
                 X10_TEMP73);
            
//#line 3328
if (X10_TEMP75) {
                
//#line 3329
final double X10_TEMP772 =
                  (xx +
                     X10_TEMP1);
                
//#line 3331
final double X10_TEMP77 =
                  (X10_TEMP772);
                
//#line 3332
final double X10_TEMP775 =
                  (X10_TEMP77);
                
//#line 3334
xx =
                  ((X10_TEMP775));
            }
            
//#line 3336
final double X10_TEMP778 =
              (sideh);
            
//#line 3338
final double X10_TEMP79 =
              (X10_TEMP778);
            
//#line 3339
final boolean X10_TEMP81 =
              (xx >
                 X10_TEMP79);
            
//#line 3340
if (X10_TEMP81) {
                
//#line 3341
final double X10_TEMP783 =
                  (xx -
                     X10_TEMP1);
                
//#line 3343
final double X10_TEMP83 =
                  (X10_TEMP783);
                
//#line 3344
final double X10_TEMP786 =
                  (X10_TEMP83);
                
//#line 3346
xx =
                  ((X10_TEMP786));
            }
            
//#line 3348
final int X10_TEMP84 =
              (0);
            
//#line 3349
final double X10_TEMP790 =
              (X10_TEMP84 -
                 sideh);
            
//#line 3351
final double X10_TEMP86 =
              (X10_TEMP790);
            
//#line 3352
final boolean X10_TEMP88 =
              (yy <
                 X10_TEMP86);
            
//#line 3353
if (X10_TEMP88) {
                
//#line 3354
final double X10_TEMP795 =
                  (yy +
                     X10_TEMP1);
                
//#line 3356
final double X10_TEMP90 =
                  (X10_TEMP795);
                
//#line 3357
final double X10_TEMP798 =
                  (X10_TEMP90);
                
//#line 3359
yy =
                  ((X10_TEMP798));
            }
            
//#line 3361
final double X10_TEMP801 =
              (sideh);
            
//#line 3363
final double X10_TEMP92 =
              (X10_TEMP801);
            
//#line 3364
final boolean X10_TEMP94 =
              (yy >
                 X10_TEMP92);
            
//#line 3365
if (X10_TEMP94) {
                
//#line 3366
final double X10_TEMP806 =
                  (yy -
                     X10_TEMP1);
                
//#line 3368
final double X10_TEMP96 =
                  (X10_TEMP806);
                
//#line 3369
final double X10_TEMP809 =
                  (X10_TEMP96);
                
//#line 3371
yy =
                  ((X10_TEMP809));
            }
            
//#line 3373
final int X10_TEMP97 =
              (0);
            
//#line 3374
final double X10_TEMP813 =
              (X10_TEMP97 -
                 sideh);
            
//#line 3376
final double X10_TEMP99 =
              (X10_TEMP813);
            
//#line 3377
final boolean X10_TEMP101 =
              (zz <
                 X10_TEMP99);
            
//#line 3378
if (X10_TEMP101) {
                
//#line 3379
final double X10_TEMP818 =
                  (zz +
                     X10_TEMP1);
                
//#line 3381
final double X10_TEMP103 =
                  (X10_TEMP818);
                
//#line 3382
final double X10_TEMP821 =
                  (X10_TEMP103);
                
//#line 3384
zz =
                  ((X10_TEMP821));
            }
            
//#line 3386
final double X10_TEMP824 =
              (sideh);
            
//#line 3388
final double X10_TEMP105 =
              (X10_TEMP824);
            
//#line 3389
final boolean X10_TEMP107 =
              (zz >
                 X10_TEMP105);
            
//#line 3390
if (X10_TEMP107) {
                
//#line 3391
final double X10_TEMP829 =
                  (zz -
                     X10_TEMP1);
                
//#line 3393
final double X10_TEMP109 =
                  (X10_TEMP829);
                
//#line 3394
final double X10_TEMP832 =
                  (X10_TEMP109);
                
//#line 3396
zz =
                  ((X10_TEMP832));
            }
            
//#line 3398
final double X10_TEMP835 =
              (xx *
                 xx);
            
//#line 3400
final double X10_TEMP110 =
              (X10_TEMP835);
            
//#line 3401
final double X10_TEMP838 =
              (yy *
                 yy);
            
//#line 3403
final double X10_TEMP111 =
              (X10_TEMP838);
            
//#line 3404
final double X10_TEMP841 =
              (X10_TEMP110 +
                 X10_TEMP111);
            
//#line 3406
final double X10_TEMP112 =
              (X10_TEMP841);
            
//#line 3407
final double X10_TEMP844 =
              (zz *
                 zz);
            
//#line 3409
final double X10_TEMP113 =
              (X10_TEMP844);
            
//#line 3410
final double X10_TEMP847 =
              (X10_TEMP112 +
                 X10_TEMP113);
            
//#line 3412
final double X10_TEMP115 =
              (X10_TEMP847);
            
//#line 3413
final double X10_TEMP850 =
              (X10_TEMP115);
            
//#line 3415
rd =
              ((X10_TEMP850));
            
//#line 3416
final boolean X10_TEMP117 =
              (rd <=
                 rcoffs);
            
//#line 3417
if (X10_TEMP117) {
                
//#line 3418
final double X10_TEMP855 =
                  (1.0);
                
//#line 3420
final double X10_TEMP118 =
                  (X10_TEMP855);
                
//#line 3421
final double X10_TEMP858 =
                  (X10_TEMP118 /
                     rd);
                
//#line 3423
final double X10_TEMP120 =
                  (X10_TEMP858);
                
//#line 3424
final double X10_TEMP861 =
                  (X10_TEMP120);
                
//#line 3426
rrd =
                  ((X10_TEMP861));
                
//#line 3427
final double X10_TEMP864 =
                  (rrd *
                     rrd);
                
//#line 3429
final double X10_TEMP122 =
                  (X10_TEMP864);
                
//#line 3430
final double X10_TEMP867 =
                  (X10_TEMP122);
                
//#line 3432
rrd2 =
                  ((X10_TEMP867));
                
//#line 3433
final double X10_TEMP870 =
                  (rrd2 *
                     rrd);
                
//#line 3435
final double X10_TEMP124 =
                  (X10_TEMP870);
                
//#line 3436
final double X10_TEMP873 =
                  (X10_TEMP124);
                
//#line 3438
rrd3 =
                  ((X10_TEMP873));
                
//#line 3439
final double X10_TEMP876 =
                  (rrd2 *
                     rrd2);
                
//#line 3441
final double X10_TEMP126 =
                  (X10_TEMP876);
                
//#line 3442
final double X10_TEMP879 =
                  (X10_TEMP126);
                
//#line 3444
rrd4 =
                  ((X10_TEMP879));
                
//#line 3445
final double X10_TEMP882 =
                  (rrd2 *
                     rrd4);
                
//#line 3447
final double X10_TEMP128 =
                  (X10_TEMP882);
                
//#line 3448
final double X10_TEMP885 =
                  (X10_TEMP128);
                
//#line 3450
rrd6 =
                  ((X10_TEMP885));
                
//#line 3451
final double X10_TEMP888 =
                  (rrd6 *
                     rrd);
                
//#line 3453
final double X10_TEMP130 =
                  (X10_TEMP888);
                
//#line 3454
final double X10_TEMP891 =
                  (X10_TEMP130);
                
//#line 3456
rrd7 =
                  ((X10_TEMP891));
                
//#line 3457
final double X10_TEMP894 =
                  (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.epot);
                
//#line 3459
final double X10_TEMP133 =
                  (X10_TEMP894);
                
//#line 3460
final double X10_TEMP897 =
                  (rrd6 -
                     rrd3);
                
//#line 3462
final double X10_TEMP132 =
                  (X10_TEMP897);
                
//#line 3463
final double X10_TEMP900 =
                  (X10_TEMP133 +
                     X10_TEMP132);
                
//#line 3465
final double X10_TEMP136 =
                  (X10_TEMP900);
                
//#line 3466
final double X10_TEMP903 =
                  (X10_TEMP136);
                
//#line 3468
final double X10_TEMP137 =
                  (X10_TEMP903);
                
//#line 3469
final double X10_TEMP906 =
                  (X10_TEMP137);
                
//#line 3471
final double X10_TEMP909 =
                  (X10_TEMP906);
                
//#line 3472
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.epot =
                  ((X10_TEMP909));
                
//#line 3473
final double X10_TEMP911 =
                  (0.5);
                
//#line 3475
final double X10_TEMP138 =
                  (X10_TEMP911);
                
//#line 3476
final double X10_TEMP914 =
                  (X10_TEMP138 *
                     rrd4);
                
//#line 3478
final double X10_TEMP139 =
                  (X10_TEMP914);
                
//#line 3479
final double X10_TEMP917 =
                  (rrd7 -
                     X10_TEMP139);
                
//#line 3481
final double X10_TEMP141 =
                  (X10_TEMP917);
                
//#line 3482
final double X10_TEMP920 =
                  (X10_TEMP141);
                
//#line 3484
r148 =
                  ((X10_TEMP920));
                
//#line 3485
final double X10_TEMP923 =
                  (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.vir);
                
//#line 3487
final double X10_TEMP142 =
                  (X10_TEMP923);
                
//#line 3488
final double X10_TEMP926 =
                  (rd *
                     r148);
                
//#line 3490
final double X10_TEMP143 =
                  (X10_TEMP926);
                
//#line 3491
final double X10_TEMP929 =
                  (X10_TEMP142 -
                     X10_TEMP143);
                
//#line 3493
final double X10_TEMP146 =
                  (X10_TEMP929);
                
//#line 3494
final double X10_TEMP932 =
                  (X10_TEMP146);
                
//#line 3496
final double X10_TEMP147 =
                  (X10_TEMP932);
                
//#line 3497
final double X10_TEMP935 =
                  (X10_TEMP147);
                
//#line 3499
final double X10_TEMP938 =
                  (X10_TEMP935);
                
//#line 3500
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.vir =
                  ((X10_TEMP938));
                
//#line 3501
final double X10_TEMP940 =
                  (xx *
                     r148);
                
//#line 3503
final double X10_TEMP149 =
                  (X10_TEMP940);
                
//#line 3504
final double X10_TEMP943 =
                  (X10_TEMP149);
                
//#line 3506
forcex =
                  ((X10_TEMP943));
                
//#line 3507
final double X10_TEMP946 =
                  (fxi +
                     forcex);
                
//#line 3509
final double X10_TEMP151 =
                  (X10_TEMP946);
                
//#line 3510
final double X10_TEMP949 =
                  (X10_TEMP151);
                
//#line 3512
fxi =
                  ((X10_TEMP949));
                
//#line 3513
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP952 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.one));
                
//#line 3515
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP152 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP952));
                
//#line 3516
final Particle X10_TEMP956 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP152).get(i))/* } */))/* } */);
                
//#line 3518
final Particle X10_TEMP154 =
                  (X10_TEMP956);
                
//#line 3519
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP959 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.one));
                
//#line 3521
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP155 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP959));
                
//#line 3522
final Particle X10_TEMP963 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP155).get(i))/* } */))/* } */);
                
//#line 3524
final Particle X10_TEMP157 =
                  (X10_TEMP963);
                
//#line 3525
final double X10_TEMP966 =
                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP157))/* } */.xforce);
                
//#line 3527
final double X10_TEMP158 =
                  (X10_TEMP966);
                
//#line 3528
final double X10_TEMP969 =
                  (X10_TEMP158 -
                     forcex);
                
//#line 3530
final double X10_TEMP161 =
                  (X10_TEMP969);
                
//#line 3531
final double X10_TEMP972 =
                  (X10_TEMP161);
                
//#line 3533
final double X10_TEMP162 =
                  (X10_TEMP972);
                
//#line 3534
final double X10_TEMP975 =
                  (X10_TEMP162);
                
//#line 3536
final double X10_TEMP978 =
                  (X10_TEMP975);
                
//#line 3537
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP154))/* } */.xforce =
                  ((X10_TEMP978));
                
//#line 3538
final double X10_TEMP980 =
                  (yy *
                     r148);
                
//#line 3540
final double X10_TEMP164 =
                  (X10_TEMP980);
                
//#line 3541
final double X10_TEMP983 =
                  (X10_TEMP164);
                
//#line 3543
forcey =
                  ((X10_TEMP983));
                
//#line 3544
final double X10_TEMP986 =
                  (fyi +
                     forcey);
                
//#line 3546
final double X10_TEMP166 =
                  (X10_TEMP986);
                
//#line 3547
final double X10_TEMP989 =
                  (X10_TEMP166);
                
//#line 3549
fyi =
                  ((X10_TEMP989));
                
//#line 3550
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP992 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.one));
                
//#line 3552
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP167 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP992));
                
//#line 3553
final Particle X10_TEMP996 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP167).get(i))/* } */))/* } */);
                
//#line 3555
final Particle X10_TEMP169 =
                  (X10_TEMP996);
                
//#line 3556
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP999 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.one));
                
//#line 3558
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP170 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP999));
                
//#line 3559
final Particle X10_TEMP1003 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP170).get(i))/* } */))/* } */);
                
//#line 3561
final Particle X10_TEMP172 =
                  (X10_TEMP1003);
                
//#line 3562
final double X10_TEMP1006 =
                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP172))/* } */.yforce);
                
//#line 3564
final double X10_TEMP173 =
                  (X10_TEMP1006);
                
//#line 3565
final double X10_TEMP1009 =
                  (X10_TEMP173 -
                     forcey);
                
//#line 3567
final double X10_TEMP176 =
                  (X10_TEMP1009);
                
//#line 3568
final double X10_TEMP1012 =
                  (X10_TEMP176);
                
//#line 3570
final double X10_TEMP177 =
                  (X10_TEMP1012);
                
//#line 3571
final double X10_TEMP1015 =
                  (X10_TEMP177);
                
//#line 3573
final double X10_TEMP1018 =
                  (X10_TEMP1015);
                
//#line 3574
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP169))/* } */.yforce =
                  ((X10_TEMP1018));
                
//#line 3575
final double X10_TEMP1020 =
                  (zz *
                     r148);
                
//#line 3577
final double X10_TEMP179 =
                  (X10_TEMP1020);
                
//#line 3578
final double X10_TEMP1023 =
                  (X10_TEMP179);
                
//#line 3580
forcez =
                  ((X10_TEMP1023));
                
//#line 3581
final double X10_TEMP1026 =
                  (fzi +
                     forcez);
                
//#line 3583
final double X10_TEMP181 =
                  (X10_TEMP1026);
                
//#line 3584
final double X10_TEMP1029 =
                  (X10_TEMP181);
                
//#line 3586
fzi =
                  ((X10_TEMP1029));
                
//#line 3587
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP1032 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.one));
                
//#line 3589
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP182 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP1032));
                
//#line 3590
final Particle X10_TEMP1036 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP182).get(i))/* } */))/* } */);
                
//#line 3592
final Particle X10_TEMP184 =
                  (X10_TEMP1036);
                
//#line 3593
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP1039 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.one));
                
//#line 3595
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP185 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP1039));
                
//#line 3596
final Particle X10_TEMP1043 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP185).get(i))/* } */))/* } */);
                
//#line 3598
final Particle X10_TEMP187 =
                  (X10_TEMP1043);
                
//#line 3599
final double X10_TEMP1046 =
                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP187))/* } */.zforce);
                
//#line 3601
final double X10_TEMP188 =
                  (X10_TEMP1046);
                
//#line 3602
final double X10_TEMP1049 =
                  (X10_TEMP188 -
                     forcez);
                
//#line 3604
final double X10_TEMP191 =
                  (X10_TEMP1049);
                
//#line 3605
final double X10_TEMP1052 =
                  (X10_TEMP191);
                
//#line 3607
final double X10_TEMP192 =
                  (X10_TEMP1052);
                
//#line 3608
final double X10_TEMP1055 =
                  (X10_TEMP192);
                
//#line 3610
final double X10_TEMP1058 =
                  (X10_TEMP1055);
                
//#line 3611
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP184))/* } */.zforce =
                  ((X10_TEMP1058));
                
//#line 3612
final int X10_TEMP1060 =
                  (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.interactions);
                
//#line 3614
final int X10_TEMP193 =
                  (X10_TEMP1060);
                
//#line 3615
final int X10_TEMP194 =
                  (1);
                
//#line 3616
final int X10_TEMP1064 =
                  (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.interactions);
                
//#line 3618
final int X10_TEMP195 =
                  (X10_TEMP1064);
                
//#line 3619
final int X10_TEMP1067 =
                  (X10_TEMP195 +
                     X10_TEMP194);
                
//#line 3621
final int X10_TEMP196 =
                  (X10_TEMP1067);
                
//#line 3622
final int X10_TEMP1070 =
                  (X10_TEMP196);
                
//#line 3624
final int X10_TEMP1073 =
                  (X10_TEMP1070);
                
//#line 3625
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.interactions =
                  ((X10_TEMP1073));
            }
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 3628
final double X10_TEMP1075 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xforce);
        
//#line 3630
final double X10_TEMP197 =
          (X10_TEMP1075);
        
//#line 3631
final double X10_TEMP1078 =
          (X10_TEMP197 +
             fxi);
        
//#line 3633
final double X10_TEMP200 =
          (X10_TEMP1078);
        
//#line 3634
final double X10_TEMP1081 =
          (X10_TEMP200);
        
//#line 3636
final double X10_TEMP201 =
          (X10_TEMP1081);
        
//#line 3637
final double X10_TEMP1084 =
          (X10_TEMP201);
        
//#line 3639
final double X10_TEMP1087 =
          (X10_TEMP1084);
        
//#line 3640
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xforce =
          ((X10_TEMP1087));
        
//#line 3641
final double X10_TEMP1089 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yforce);
        
//#line 3643
final double X10_TEMP202 =
          (X10_TEMP1089);
        
//#line 3644
final double X10_TEMP1092 =
          (X10_TEMP202 +
             fyi);
        
//#line 3646
final double X10_TEMP205 =
          (X10_TEMP1092);
        
//#line 3647
final double X10_TEMP1095 =
          (X10_TEMP205);
        
//#line 3649
final double X10_TEMP206 =
          (X10_TEMP1095);
        
//#line 3650
final double X10_TEMP1098 =
          (X10_TEMP206);
        
//#line 3652
final double X10_TEMP1101 =
          (X10_TEMP1098);
        
//#line 3653
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yforce =
          ((X10_TEMP1101));
        
//#line 3654
final double X10_TEMP1103 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zforce);
        
//#line 3656
final double X10_TEMP207 =
          (X10_TEMP1103);
        
//#line 3657
final double X10_TEMP1106 =
          (X10_TEMP207 +
             fzi);
        
//#line 3659
final double X10_TEMP210 =
          (X10_TEMP1106);
        
//#line 3660
final double X10_TEMP1109 =
          (X10_TEMP210);
        
//#line 3662
final double X10_TEMP211 =
          (X10_TEMP1109);
        
//#line 3663
final double X10_TEMP1112 =
          (X10_TEMP211);
        
//#line 3665
final double X10_TEMP1115 =
          (X10_TEMP1112);
        
//#line 3666
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zforce =
          ((X10_TEMP1115));
    }
    
    
//#line 3668
public static double
                    Program_Particle_mkekin(
                    final Particle X10_TEMP0,
                    final double hsq2) {
        
//#line 3669
double X10_TEMP1 =
          (hsq2);
        
//#line 3670
final double X10_TEMP579 =
          (0.0);
        
//#line 3672
double sumt =
          (X10_TEMP579);
        
//#line 3673
final double X10_TEMP582 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xforce);
        
//#line 3675
final double X10_TEMP3 =
          (X10_TEMP582);
        
//#line 3676
final double X10_TEMP585 =
          (X10_TEMP3 *
             X10_TEMP1);
        
//#line 3678
final double X10_TEMP6 =
          (X10_TEMP585);
        
//#line 3679
final double X10_TEMP588 =
          (X10_TEMP6);
        
//#line 3681
final double X10_TEMP7 =
          (X10_TEMP588);
        
//#line 3682
final double X10_TEMP591 =
          (X10_TEMP7);
        
//#line 3684
final double X10_TEMP594 =
          (X10_TEMP591);
        
//#line 3685
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xforce =
          ((X10_TEMP594));
        
//#line 3686
final double X10_TEMP596 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yforce);
        
//#line 3688
final double X10_TEMP8 =
          (X10_TEMP596);
        
//#line 3689
final double X10_TEMP599 =
          (X10_TEMP8 *
             X10_TEMP1);
        
//#line 3691
final double X10_TEMP11 =
          (X10_TEMP599);
        
//#line 3692
final double X10_TEMP602 =
          (X10_TEMP11);
        
//#line 3694
final double X10_TEMP12 =
          (X10_TEMP602);
        
//#line 3695
final double X10_TEMP605 =
          (X10_TEMP12);
        
//#line 3697
final double X10_TEMP608 =
          (X10_TEMP605);
        
//#line 3698
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yforce =
          ((X10_TEMP608));
        
//#line 3699
final double X10_TEMP610 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zforce);
        
//#line 3701
final double X10_TEMP13 =
          (X10_TEMP610);
        
//#line 3702
final double X10_TEMP613 =
          (X10_TEMP13 *
             X10_TEMP1);
        
//#line 3704
final double X10_TEMP16 =
          (X10_TEMP613);
        
//#line 3705
final double X10_TEMP616 =
          (X10_TEMP16);
        
//#line 3707
final double X10_TEMP17 =
          (X10_TEMP616);
        
//#line 3708
final double X10_TEMP619 =
          (X10_TEMP17);
        
//#line 3710
final double X10_TEMP622 =
          (X10_TEMP619);
        
//#line 3711
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zforce =
          ((X10_TEMP622));
        
//#line 3712
final double X10_TEMP624 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xvelocity);
        
//#line 3714
final double X10_TEMP18 =
          (X10_TEMP624);
        
//#line 3715
final double X10_TEMP627 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xforce);
        
//#line 3717
final double X10_TEMP19 =
          (X10_TEMP627);
        
//#line 3718
final double X10_TEMP630 =
          (X10_TEMP18 +
             X10_TEMP19);
        
//#line 3720
final double X10_TEMP22 =
          (X10_TEMP630);
        
//#line 3721
final double X10_TEMP633 =
          (X10_TEMP22);
        
//#line 3723
final double X10_TEMP23 =
          (X10_TEMP633);
        
//#line 3724
final double X10_TEMP636 =
          (X10_TEMP23);
        
//#line 3726
final double X10_TEMP639 =
          (X10_TEMP636);
        
//#line 3727
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xvelocity =
          ((X10_TEMP639));
        
//#line 3728
final double X10_TEMP641 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yvelocity);
        
//#line 3730
final double X10_TEMP24 =
          (X10_TEMP641);
        
//#line 3731
final double X10_TEMP644 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yforce);
        
//#line 3733
final double X10_TEMP25 =
          (X10_TEMP644);
        
//#line 3734
final double X10_TEMP647 =
          (X10_TEMP24 +
             X10_TEMP25);
        
//#line 3736
final double X10_TEMP28 =
          (X10_TEMP647);
        
//#line 3737
final double X10_TEMP650 =
          (X10_TEMP28);
        
//#line 3739
final double X10_TEMP29 =
          (X10_TEMP650);
        
//#line 3740
final double X10_TEMP653 =
          (X10_TEMP29);
        
//#line 3742
final double X10_TEMP656 =
          (X10_TEMP653);
        
//#line 3743
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yvelocity =
          ((X10_TEMP656));
        
//#line 3744
final double X10_TEMP658 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zvelocity);
        
//#line 3746
final double X10_TEMP30 =
          (X10_TEMP658);
        
//#line 3747
final double X10_TEMP661 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zforce);
        
//#line 3749
final double X10_TEMP31 =
          (X10_TEMP661);
        
//#line 3750
final double X10_TEMP664 =
          (X10_TEMP30 +
             X10_TEMP31);
        
//#line 3752
final double X10_TEMP34 =
          (X10_TEMP664);
        
//#line 3753
final double X10_TEMP667 =
          (X10_TEMP34);
        
//#line 3755
final double X10_TEMP35 =
          (X10_TEMP667);
        
//#line 3756
final double X10_TEMP670 =
          (X10_TEMP35);
        
//#line 3758
final double X10_TEMP673 =
          (X10_TEMP670);
        
//#line 3759
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zvelocity =
          ((X10_TEMP673));
        
//#line 3760
final double X10_TEMP675 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xvelocity);
        
//#line 3762
final double X10_TEMP36 =
          (X10_TEMP675);
        
//#line 3763
final double X10_TEMP678 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xvelocity);
        
//#line 3765
final double X10_TEMP37 =
          (X10_TEMP678);
        
//#line 3766
final double X10_TEMP681 =
          (X10_TEMP36 *
             X10_TEMP37);
        
//#line 3768
final double X10_TEMP39 =
          (X10_TEMP681);
        
//#line 3769
final double X10_TEMP684 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yvelocity);
        
//#line 3771
final double X10_TEMP40 =
          (X10_TEMP684);
        
//#line 3772
final double X10_TEMP687 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yvelocity);
        
//#line 3774
final double X10_TEMP41 =
          (X10_TEMP687);
        
//#line 3775
final double X10_TEMP690 =
          (X10_TEMP40 *
             X10_TEMP41);
        
//#line 3777
final double X10_TEMP43 =
          (X10_TEMP690);
        
//#line 3778
final double X10_TEMP693 =
          (X10_TEMP39 +
             X10_TEMP43);
        
//#line 3780
final double X10_TEMP48 =
          (X10_TEMP693);
        
//#line 3781
final double X10_TEMP696 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zvelocity);
        
//#line 3783
final double X10_TEMP44 =
          (X10_TEMP696);
        
//#line 3784
final double X10_TEMP699 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zvelocity);
        
//#line 3786
final double X10_TEMP45 =
          (X10_TEMP699);
        
//#line 3787
final double X10_TEMP702 =
          (X10_TEMP44 *
             X10_TEMP45);
        
//#line 3789
final double X10_TEMP47 =
          (X10_TEMP702);
        
//#line 3790
final double X10_TEMP705 =
          (X10_TEMP48 +
             X10_TEMP47);
        
//#line 3792
final double X10_TEMP50 =
          (X10_TEMP705);
        
//#line 3793
final double X10_TEMP708 =
          (X10_TEMP50);
        
//#line 3795
sumt =
          ((X10_TEMP708));
        
//#line 3796
return sumt;
    }
    
    
//#line 3798
public static double
                    Program_Particle_velavg(
                    final Particle X10_TEMP0,
                    final double vaverh,
                    final double h,
                    final md md1) {
        
//#line 3799
double X10_TEMP1 =
          (vaverh);
        
//#line 3800
double X10_TEMP2 =
          (h);
        
//#line 3801
md X10_TEMP3 =
          (md1);
        
//#line 3802
final double X10_TEMP581 =
          (0.0);
        
//#line 3804
double velt =
          (X10_TEMP581);
        
//#line 3805
final double X10_TEMP584 =
          (0.0);
        
//#line 3807
double sq =
          (X10_TEMP584);
        
//#line 3808
final double X10_TEMP587 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xvelocity);
        
//#line 3810
final double X10_TEMP6 =
          (X10_TEMP587);
        
//#line 3811
final double X10_TEMP590 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xvelocity);
        
//#line 3813
final double X10_TEMP7 =
          (X10_TEMP590);
        
//#line 3814
final double X10_TEMP593 =
          (X10_TEMP6 *
             X10_TEMP7);
        
//#line 3816
final double X10_TEMP10 =
          (X10_TEMP593);
        
//#line 3817
final double X10_TEMP596 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yvelocity);
        
//#line 3819
final double X10_TEMP8 =
          (X10_TEMP596);
        
//#line 3820
final double X10_TEMP599 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yvelocity);
        
//#line 3822
final double X10_TEMP9 =
          (X10_TEMP599);
        
//#line 3823
final double X10_TEMP602 =
          (X10_TEMP8 *
             X10_TEMP9);
        
//#line 3825
final double X10_TEMP11 =
          (X10_TEMP602);
        
//#line 3826
final double X10_TEMP605 =
          (X10_TEMP10 +
             X10_TEMP11);
        
//#line 3828
final double X10_TEMP14 =
          (X10_TEMP605);
        
//#line 3829
final double X10_TEMP608 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zvelocity);
        
//#line 3831
final double X10_TEMP12 =
          (X10_TEMP608);
        
//#line 3832
final double X10_TEMP611 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zvelocity);
        
//#line 3834
final double X10_TEMP13 =
          (X10_TEMP611);
        
//#line 3835
final double X10_TEMP614 =
          (X10_TEMP12 *
             X10_TEMP13);
        
//#line 3837
final double X10_TEMP15 =
          (X10_TEMP614);
        
//#line 3838
final double X10_TEMP617 =
          (X10_TEMP14 +
             X10_TEMP15);
        
//#line 3840
final double X10_TEMP17 =
          (X10_TEMP617);
        
//#line 3841
final double X10_TEMP621 =
          (java.
             lang.
             Math.
             sqrt(
             X10_TEMP17));
        
//#line 3843
final double X10_TEMP19 =
          (X10_TEMP621);
        
//#line 3844
final double X10_TEMP624 =
          (X10_TEMP19);
        
//#line 3846
sq =
          ((X10_TEMP624));
        
//#line 3847
final boolean X10_TEMP21 =
          (sq >
             X10_TEMP1);
        
//#line 3848
if (X10_TEMP21) {
            
//#line 3849
final double X10_TEMP629 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP3))/* } */.count);
            
//#line 3851
final double X10_TEMP22 =
              (X10_TEMP629);
            
//#line 3852
final double X10_TEMP632 =
              (1.0);
            
//#line 3854
final double X10_TEMP23 =
              (X10_TEMP632);
            
//#line 3855
final double X10_TEMP635 =
              (X10_TEMP22 +
                 X10_TEMP23);
            
//#line 3857
final double X10_TEMP26 =
              (X10_TEMP635);
            
//#line 3858
final double X10_TEMP638 =
              (X10_TEMP26);
            
//#line 3860
final double X10_TEMP27 =
              (X10_TEMP638);
            
//#line 3861
final double X10_TEMP641 =
              (X10_TEMP27);
            
//#line 3863
final double X10_TEMP644 =
              (X10_TEMP641);
            
//#line 3864
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP3))/* } */.count =
              ((X10_TEMP644));
        }
        
//#line 3866
final double X10_TEMP646 =
          (sq);
        
//#line 3868
velt =
          ((X10_TEMP646));
        
//#line 3869
return velt;
    }
    
    
//#line 3871
public static void
                    Program_Particle_dscal(
                    final Particle X10_TEMP0,
                    final double sc,
                    final int incx) {
        
//#line 3872
double X10_TEMP1 =
          (sc);
        
//#line 3873
int X10_TEMP2 =
          (incx);
        
//#line 3874
final double X10_TEMP580 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xvelocity);
        
//#line 3876
final double X10_TEMP3 =
          (X10_TEMP580);
        
//#line 3877
final double X10_TEMP583 =
          (X10_TEMP3 *
             X10_TEMP1);
        
//#line 3879
final double X10_TEMP6 =
          (X10_TEMP583);
        
//#line 3880
final double X10_TEMP586 =
          (X10_TEMP6);
        
//#line 3882
final double X10_TEMP7 =
          (X10_TEMP586);
        
//#line 3883
final double X10_TEMP589 =
          (X10_TEMP7);
        
//#line 3885
final double X10_TEMP592 =
          (X10_TEMP589);
        
//#line 3886
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xvelocity =
          ((X10_TEMP592));
        
//#line 3887
final double X10_TEMP594 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yvelocity);
        
//#line 3889
final double X10_TEMP8 =
          (X10_TEMP594);
        
//#line 3890
final double X10_TEMP597 =
          (X10_TEMP8 *
             X10_TEMP1);
        
//#line 3892
final double X10_TEMP11 =
          (X10_TEMP597);
        
//#line 3893
final double X10_TEMP600 =
          (X10_TEMP11);
        
//#line 3895
final double X10_TEMP12 =
          (X10_TEMP600);
        
//#line 3896
final double X10_TEMP603 =
          (X10_TEMP12);
        
//#line 3898
final double X10_TEMP606 =
          (X10_TEMP603);
        
//#line 3899
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yvelocity =
          ((X10_TEMP606));
        
//#line 3900
final double X10_TEMP608 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zvelocity);
        
//#line 3902
final double X10_TEMP13 =
          (X10_TEMP608);
        
//#line 3903
final double X10_TEMP611 =
          (X10_TEMP13 *
             X10_TEMP1);
        
//#line 3905
final double X10_TEMP16 =
          (X10_TEMP611);
        
//#line 3906
final double X10_TEMP614 =
          (X10_TEMP16);
        
//#line 3908
final double X10_TEMP17 =
          (X10_TEMP614);
        
//#line 3909
final double X10_TEMP617 =
          (X10_TEMP17);
        
//#line 3911
final double X10_TEMP620 =
          (X10_TEMP617);
        
//#line 3912
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zvelocity =
          ((X10_TEMP620));
    }
    
    
//#line 3914
public static double
                    Program_Random_update(
                    final Random X10_TEMP0) {
        
//#line 3915
final double X10_TEMP578 =
          (0.0);
        
//#line 3917
double rand =
          (X10_TEMP578);
        
//#line 3918
final double X10_TEMP581 =
          (4.656612875E-10);
        
//#line 3920
double scale =
          (X10_TEMP581);
        
//#line 3921
final int X10_TEMP584 =
          (0);
        
//#line 3923
int is1 =
          (X10_TEMP584);
        
//#line 3924
final int X10_TEMP587 =
          (0);
        
//#line 3926
int is2 =
          (X10_TEMP587);
        
//#line 3927
final int X10_TEMP590 =
          (0);
        
//#line 3929
int iss2 =
          (X10_TEMP590);
        
//#line 3930
final int X10_TEMP593 =
          (16807);
        
//#line 3932
int imult =
          (X10_TEMP593);
        
//#line 3933
final int X10_TEMP596 =
          (2147483647);
        
//#line 3935
int imod =
          (X10_TEMP596);
        
//#line 3936
final int X10_TEMP599 =
          (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.iseed);
        
//#line 3938
final int X10_TEMP8 =
          (X10_TEMP599);
        
//#line 3939
final int X10_TEMP602 =
          (0);
        
//#line 3941
final int X10_TEMP9 =
          (X10_TEMP602);
        
//#line 3942
final boolean X10_TEMP11 =
          (X10_TEMP8 <=
             X10_TEMP9);
        
//#line 3943
if (X10_TEMP11) {
            
//#line 3944
final int X10_TEMP607 =
              (1);
            
//#line 3946
final int X10_TEMP14 =
              (X10_TEMP607);
            
//#line 3947
final int X10_TEMP610 =
              (X10_TEMP14);
            
//#line 3949
final int X10_TEMP15 =
              (X10_TEMP610);
            
//#line 3950
final int X10_TEMP613 =
              (X10_TEMP15);
            
//#line 3952
final int X10_TEMP616 =
              (X10_TEMP613);
            
//#line 3953
/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.iseed =
              ((X10_TEMP616));
        }
        
//#line 3955
final int X10_TEMP618 =
          (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.iseed);
        
//#line 3957
final int X10_TEMP16 =
          (X10_TEMP618);
        
//#line 3958
final int X10_TEMP621 =
          (32768);
        
//#line 3960
final int X10_TEMP17 =
          (X10_TEMP621);
        
//#line 3961
final int X10_TEMP624 =
          (X10_TEMP16 %
             X10_TEMP17);
        
//#line 3963
final int X10_TEMP19 =
          (X10_TEMP624);
        
//#line 3964
final int X10_TEMP627 =
          (X10_TEMP19);
        
//#line 3966
is2 =
          ((X10_TEMP627));
        
//#line 3967
final int X10_TEMP630 =
          (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.iseed);
        
//#line 3969
final int X10_TEMP20 =
          (X10_TEMP630);
        
//#line 3970
final int X10_TEMP633 =
          (X10_TEMP20 -
             is2);
        
//#line 3972
final int X10_TEMP22 =
          (X10_TEMP633);
        
//#line 3973
final int X10_TEMP636 =
          (32768);
        
//#line 3975
final int X10_TEMP23 =
          (X10_TEMP636);
        
//#line 3976
final int X10_TEMP639 =
          (X10_TEMP22 /
             X10_TEMP23);
        
//#line 3978
final int X10_TEMP25 =
          (X10_TEMP639);
        
//#line 3979
final int X10_TEMP642 =
          (X10_TEMP25);
        
//#line 3981
is1 =
          ((X10_TEMP642));
        
//#line 3982
final int X10_TEMP645 =
          (is2 *
             imult);
        
//#line 3984
final int X10_TEMP27 =
          (X10_TEMP645);
        
//#line 3985
final int X10_TEMP648 =
          (X10_TEMP27);
        
//#line 3987
iss2 =
          ((X10_TEMP648));
        
//#line 3988
final int X10_TEMP651 =
          (32768);
        
//#line 3990
final int X10_TEMP28 =
          (X10_TEMP651);
        
//#line 3991
final int X10_TEMP654 =
          (iss2 %
             X10_TEMP28);
        
//#line 3993
final int X10_TEMP30 =
          (X10_TEMP654);
        
//#line 3994
final int X10_TEMP657 =
          (X10_TEMP30);
        
//#line 3996
is2 =
          ((X10_TEMP657));
        
//#line 3997
final int X10_TEMP660 =
          (is1 *
             imult);
        
//#line 3999
final int X10_TEMP34 =
          (X10_TEMP660);
        
//#line 4000
final int X10_TEMP663 =
          (iss2 -
             is2);
        
//#line 4002
final int X10_TEMP32 =
          (X10_TEMP663);
        
//#line 4003
final int X10_TEMP666 =
          (32768);
        
//#line 4005
final int X10_TEMP33 =
          (X10_TEMP666);
        
//#line 4006
final int X10_TEMP669 =
          (X10_TEMP32 /
             X10_TEMP33);
        
//#line 4008
final int X10_TEMP35 =
          (X10_TEMP669);
        
//#line 4009
final int X10_TEMP672 =
          (X10_TEMP34 +
             X10_TEMP35);
        
//#line 4011
final int X10_TEMP37 =
          (X10_TEMP672);
        
//#line 4012
final int X10_TEMP675 =
          (65536);
        
//#line 4014
final int X10_TEMP39 =
          (X10_TEMP675);
        
//#line 4015
final int X10_TEMP678 =
          (X10_TEMP37 %
             X10_TEMP39);
        
//#line 4017
final int X10_TEMP41 =
          (X10_TEMP678);
        
//#line 4018
final int X10_TEMP681 =
          (X10_TEMP41);
        
//#line 4020
is1 =
          ((X10_TEMP681));
        
//#line 4021
final int X10_TEMP684 =
          (32768);
        
//#line 4023
final int X10_TEMP42 =
          (X10_TEMP684);
        
//#line 4024
final int X10_TEMP687 =
          (is1 *
             X10_TEMP42);
        
//#line 4026
final int X10_TEMP43 =
          (X10_TEMP687);
        
//#line 4027
final int X10_TEMP690 =
          (X10_TEMP43 +
             is2);
        
//#line 4029
final int X10_TEMP45 =
          (X10_TEMP690);
        
//#line 4030
final int X10_TEMP693 =
          (X10_TEMP45 %
             imod);
        
//#line 4032
final int X10_TEMP48 =
          (X10_TEMP693);
        
//#line 4033
final int X10_TEMP696 =
          (X10_TEMP48);
        
//#line 4035
final int X10_TEMP49 =
          (X10_TEMP696);
        
//#line 4036
final int X10_TEMP699 =
          (X10_TEMP49);
        
//#line 4038
final int X10_TEMP702 =
          (X10_TEMP699);
        
//#line 4039
/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.iseed =
          ((X10_TEMP702));
        
//#line 4040
final int X10_TEMP704 =
          (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.iseed);
        
//#line 4042
final int X10_TEMP50 =
          (X10_TEMP704);
        
//#line 4043
final double X10_TEMP707 =
          (scale *
             X10_TEMP50);
        
//#line 4045
final double X10_TEMP52 =
          (X10_TEMP707);
        
//#line 4046
final double X10_TEMP710 =
          (X10_TEMP52);
        
//#line 4048
rand =
          ((X10_TEMP710));
        
//#line 4049
return rand;
    }
    
    
//#line 4051
public static double
                    Program_Random_seed(
                    final Random X10_TEMP0) {
        
//#line 4052
final double X10_TEMP578 =
          (0.0);
        
//#line 4054
double s =
          (X10_TEMP578);
        
//#line 4055
final double X10_TEMP581 =
          (0.0);
        
//#line 4057
double u1 =
          (X10_TEMP581);
        
//#line 4058
final double X10_TEMP584 =
          (0.0);
        
//#line 4060
double u2 =
          (X10_TEMP584);
        
//#line 4061
final double X10_TEMP587 =
          (0.0);
        
//#line 4063
double r =
          (X10_TEMP587);
        
//#line 4064
final double X10_TEMP590 =
          (1.0);
        
//#line 4066
final double X10_TEMP6 =
          (X10_TEMP590);
        
//#line 4067
final double X10_TEMP593 =
          (X10_TEMP6);
        
//#line 4069
s =
          ((X10_TEMP593));
        
//#line 4070
boolean X10_TEMP7 =
          (false);
        
//#line 4071
boolean X10_TEMP596 =
          false;
        
//#line 4072
do  {
            
//#line 4073
final double X10_TEMP599 =
              (Program0.
                 Program_Random_update(
                 X10_TEMP0));
            
//#line 4075
final double X10_TEMP9 =
              (X10_TEMP599);
            
//#line 4076
final double X10_TEMP602 =
              (X10_TEMP9);
            
//#line 4078
u1 =
              ((X10_TEMP602));
            
//#line 4079
final double X10_TEMP606 =
              (Program0.
                 Program_Random_update(
                 X10_TEMP0));
            
//#line 4081
final double X10_TEMP11 =
              (X10_TEMP606);
            
//#line 4082
final double X10_TEMP609 =
              (X10_TEMP11);
            
//#line 4084
u2 =
              ((X10_TEMP609));
            
//#line 4085
final double X10_TEMP612 =
              (2.0);
            
//#line 4087
final double X10_TEMP12 =
              (X10_TEMP612);
            
//#line 4088
final double X10_TEMP615 =
              (X10_TEMP12 *
                 u1);
            
//#line 4090
final double X10_TEMP13 =
              (X10_TEMP615);
            
//#line 4091
final double X10_TEMP618 =
              (1.0);
            
//#line 4093
final double X10_TEMP14 =
              (X10_TEMP618);
            
//#line 4094
final double X10_TEMP621 =
              (X10_TEMP13 -
                 X10_TEMP14);
            
//#line 4096
final double X10_TEMP17 =
              (X10_TEMP621);
            
//#line 4097
final double X10_TEMP624 =
              (X10_TEMP17);
            
//#line 4099
final double X10_TEMP18 =
              (X10_TEMP624);
            
//#line 4100
final double X10_TEMP627 =
              (X10_TEMP18);
            
//#line 4102
final double X10_TEMP630 =
              (X10_TEMP627);
            
//#line 4103
/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.v1 =
              ((X10_TEMP630));
            
//#line 4104
final double X10_TEMP632 =
              (2.0);
            
//#line 4106
final double X10_TEMP19 =
              (X10_TEMP632);
            
//#line 4107
final double X10_TEMP635 =
              (X10_TEMP19 *
                 u2);
            
//#line 4109
final double X10_TEMP20 =
              (X10_TEMP635);
            
//#line 4110
final double X10_TEMP638 =
              (1.0);
            
//#line 4112
final double X10_TEMP21 =
              (X10_TEMP638);
            
//#line 4113
final double X10_TEMP641 =
              (X10_TEMP20 -
                 X10_TEMP21);
            
//#line 4115
final double X10_TEMP24 =
              (X10_TEMP641);
            
//#line 4116
final double X10_TEMP644 =
              (X10_TEMP24);
            
//#line 4118
final double X10_TEMP25 =
              (X10_TEMP644);
            
//#line 4119
final double X10_TEMP647 =
              (X10_TEMP25);
            
//#line 4121
final double X10_TEMP650 =
              (X10_TEMP647);
            
//#line 4122
/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.v2 =
              ((X10_TEMP650));
            
//#line 4123
final double X10_TEMP652 =
              (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.v1);
            
//#line 4125
final double X10_TEMP26 =
              (X10_TEMP652);
            
//#line 4126
final double X10_TEMP655 =
              (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.v1);
            
//#line 4128
final double X10_TEMP27 =
              (X10_TEMP655);
            
//#line 4129
final double X10_TEMP658 =
              (X10_TEMP26 *
                 X10_TEMP27);
            
//#line 4131
final double X10_TEMP30 =
              (X10_TEMP658);
            
//#line 4132
final double X10_TEMP661 =
              (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.v2);
            
//#line 4134
final double X10_TEMP28 =
              (X10_TEMP661);
            
//#line 4135
final double X10_TEMP664 =
              (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.v2);
            
//#line 4137
final double X10_TEMP29 =
              (X10_TEMP664);
            
//#line 4138
final double X10_TEMP667 =
              (X10_TEMP28 *
                 X10_TEMP29);
            
//#line 4140
final double X10_TEMP31 =
              (X10_TEMP667);
            
//#line 4141
final double X10_TEMP670 =
              (X10_TEMP30 +
                 X10_TEMP31);
            
//#line 4143
final double X10_TEMP33 =
              (X10_TEMP670);
            
//#line 4144
final double X10_TEMP673 =
              (X10_TEMP33);
            
//#line 4146
s =
              ((X10_TEMP673));
            
//#line 4147
final double X10_TEMP676 =
              (1.0);
            
//#line 4149
final double X10_TEMP34 =
              (X10_TEMP676);
            
//#line 4150
final boolean X10_TEMP679 =
              (s >=
                 X10_TEMP34);
            
//#line 4151
X10_TEMP7 =
              ((X10_TEMP679));
            
//#line 4152
X10_TEMP596 =
              X10_TEMP7;
        }while(X10_TEMP596); 
        
//#line 4154
final double X10_TEMP682 =
          (2.0);
        
//#line 4156
final double X10_TEMP36 =
          (X10_TEMP682);
        
//#line 4157
final int X10_TEMP37 =
          (0);
        
//#line 4158
final double X10_TEMP686 =
          (X10_TEMP37 -
             X10_TEMP36);
        
//#line 4160
final double X10_TEMP39 =
          (X10_TEMP686);
        
//#line 4161
final double X10_TEMP690 =
          (java.
             lang.
             Math.
             log(
             s));
        
//#line 4163
final double X10_TEMP40 =
          (X10_TEMP690);
        
//#line 4164
final double X10_TEMP693 =
          (X10_TEMP39 *
             X10_TEMP40);
        
//#line 4166
final double X10_TEMP41 =
          (X10_TEMP693);
        
//#line 4167
final double X10_TEMP696 =
          (X10_TEMP41 /
             s);
        
//#line 4169
final double X10_TEMP43 =
          (X10_TEMP696);
        
//#line 4170
final double X10_TEMP700 =
          (java.
             lang.
             Math.
             sqrt(
             X10_TEMP43));
        
//#line 4172
final double X10_TEMP45 =
          (X10_TEMP700);
        
//#line 4173
final double X10_TEMP703 =
          (X10_TEMP45);
        
//#line 4175
r =
          ((X10_TEMP703));
        
//#line 4176
return r;
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
    
    
//#line 4181
public Program() {
        
//#line 4181
super();
    }
}

class md
extends x10.
  lang.
  Object
{
    
//#line 4185
public x10.
      lang.
      GenericReferenceArray
      one;
    
//#line 4186
public double
      epot;
    
//#line 4187
public double
      vir;
    
//#line 4188
public int
      interactions;
    
//#line 4189
public double
      count;
    
//#line 4190
public int
      mdsize;
    
//#line 4191
public double
      l;
    
//#line 4192
public double
      rcoff;
    
//#line 4193
public double
      rcoffs;
    
//#line 4194
public double
      side;
    
//#line 4195
public double
      sideh;
    
//#line 4196
public double
      hsq;
    
//#line 4197
public double
      hsq2;
    
//#line 4198
public double
      a;
    
//#line 4199
public double
      tscale;
    
//#line 4200
public double
      sc;
    
//#line 4201
public double
      ekin;
    
//#line 4202
public double
      ek;
    
//#line 4203
public double
      vaver;
    
//#line 4204
public double
      vaverh;
    
//#line 4205
public double
      etot;
    
//#line 4206
public double
      temp;
    
//#line 4207
public double
      pres;
    
//#line 4208
public double
      rp;
    
//#line 4209
public int
      npartm;
    
//#line 4210
public int
      rnk;
    
//#line 4211
public int
      nprocess;
    
    
//#line 4184
public md() {
        
//#line 4184
super();
    }
}

class Particle
extends x10.
  lang.
  Object
{
    
//#line 4217
public double
      xcoord;
    
//#line 4218
public double
      ycoord;
    
//#line 4219
public double
      zcoord;
    
//#line 4220
public double
      xvelocity;
    
//#line 4221
public double
      yvelocity;
    
//#line 4222
public double
      zvelocity;
    
//#line 4223
public double
      xforce;
    
//#line 4224
public double
      yforce;
    
//#line 4225
public double
      zforce;
    
    
//#line 4228
public Particle(final double xcoord0,
                                  final double ycoord0,
                                  final double zcoord0,
                                  final double xvelocity0,
                                  final double yvelocity0,
                                  final double zvelocity0,
                                  final double xforce0,
                                  final double yforce0,
                                  final double zforce0) {
        
//#line 4228
super();
        
//#line 4229
final double X10_TEMP578 =
          (xcoord0);
        
//#line 4231
double X10_TEMP1 =
          (X10_TEMP578);
        
//#line 4232
final double X10_TEMP581 =
          (ycoord0);
        
//#line 4234
double X10_TEMP2 =
          (X10_TEMP581);
        
//#line 4235
final double X10_TEMP584 =
          (zcoord0);
        
//#line 4237
double X10_TEMP3 =
          (X10_TEMP584);
        
//#line 4238
final double X10_TEMP587 =
          (xvelocity0);
        
//#line 4240
double X10_TEMP4 =
          (X10_TEMP587);
        
//#line 4241
final double X10_TEMP590 =
          (yvelocity0);
        
//#line 4243
double X10_TEMP5 =
          (X10_TEMP590);
        
//#line 4244
final double X10_TEMP593 =
          (zvelocity0);
        
//#line 4246
double X10_TEMP6 =
          (X10_TEMP593);
        
//#line 4247
final double X10_TEMP596 =
          (xforce0);
        
//#line 4249
double X10_TEMP7 =
          (X10_TEMP596);
        
//#line 4250
final double X10_TEMP599 =
          (yforce0);
        
//#line 4252
double X10_TEMP8 =
          (X10_TEMP599);
        
//#line 4253
final double X10_TEMP602 =
          (zforce0);
        
//#line 4255
double X10_TEMP9 =
          (X10_TEMP602);
        
//#line 4256
final double X10_TEMP605 =
          (X10_TEMP1);
        
//#line 4258
xcoord =
          ((X10_TEMP605));
        
//#line 4259
final double X10_TEMP608 =
          (X10_TEMP2);
        
//#line 4261
ycoord =
          ((X10_TEMP608));
        
//#line 4262
final double X10_TEMP611 =
          (X10_TEMP3);
        
//#line 4264
zcoord =
          ((X10_TEMP611));
        
//#line 4265
final double X10_TEMP614 =
          (X10_TEMP4);
        
//#line 4267
xvelocity =
          ((X10_TEMP614));
        
//#line 4268
final double X10_TEMP617 =
          (X10_TEMP5);
        
//#line 4270
yvelocity =
          ((X10_TEMP617));
        
//#line 4271
final double X10_TEMP620 =
          (X10_TEMP6);
        
//#line 4273
zvelocity =
          ((X10_TEMP620));
        
//#line 4274
final double X10_TEMP623 =
          (X10_TEMP7);
        
//#line 4276
xforce =
          ((X10_TEMP623));
        
//#line 4277
final double X10_TEMP626 =
          (X10_TEMP8);
        
//#line 4279
yforce =
          ((X10_TEMP626));
        
//#line 4280
final double X10_TEMP629 =
          (X10_TEMP9);
        
//#line 4282
zforce =
          ((X10_TEMP629));
    }
}

class Random
extends x10.
  lang.
  Object
{
    
//#line 4289
public int
      iseed;
    
//#line 4290
public double
      v1;
    
//#line 4291
public double
      v2;
    
    
//#line 4294
public Random(final int iseed0,
                                final double v10,
                                final double v20) {
        
//#line 4294
super();
        
//#line 4295
final int X10_TEMP578 =
          (iseed0);
        
//#line 4297
int X10_TEMP1 =
          (X10_TEMP578);
        
//#line 4298
final double X10_TEMP581 =
          (v10);
        
//#line 4300
double X10_TEMP2 =
          (X10_TEMP581);
        
//#line 4301
final double X10_TEMP584 =
          (v20);
        
//#line 4303
double X10_TEMP3 =
          (X10_TEMP584);
        
//#line 4304
final int X10_TEMP587 =
          (X10_TEMP1);
        
//#line 4306
iseed =
          ((X10_TEMP587));
        
//#line 4307
final double X10_TEMP590 =
          (X10_TEMP2);
        
//#line 4309
v1 =
          ((X10_TEMP590));
        
//#line 4310
final double X10_TEMP593 =
          (X10_TEMP3);
        
//#line 4312
v2 =
          ((X10_TEMP593));
    }
}
