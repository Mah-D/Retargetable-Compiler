import x10.lang.*;

public class md
extends x10.
  lang.
  Object
{
    
//#line 37
final public static int
      ITERS =
      100;
    
//#line 38
final public static double
      LENGTH =
      5.0E-9;
    
//#line 39
final public static double
      m =
      4.0026;
    
//#line 40
final public static double
      mu =
      1.66056E-27;
    
//#line 41
final public static double
      kb =
      1.38066E-23;
    
//#line 42
final public static double
      TSIM =
      50;
    
//#line 43
final public static double
      deltat =
      5.0E-16;
    
//#line 45
public x10.
      lang.
      GenericReferenceArray
      one;
    
//#line 46
public double
      epot;
    
//#line 47
public double
      vir;
    
//#line 51
public int
      interactions;
    
//#line 53
public double
      count;
    
//#line 54
private int
      mdsize;
    
//#line 56
private double
      l;
    
//#line 57
private double
      rcoff;
    
//#line 58
private double
      rcoffs;
    
//#line 59
private double
      side;
    
//#line 60
private double
      sideh;
    
//#line 61
private double
      hsq;
    
//#line 62
private double
      hsq2;
    
//#line 64
private double
      a;
    
//#line 65
private double
      tscale;
    
//#line 66
private double
      sc;
    
//#line 67
private double
      ekin;
    
//#line 68
private double
      ek;
    
//#line 70
final public static double
      den =
      0.83134;
    
//#line 71
final public static double
      tref =
      0.722;
    
//#line 72
final public static double
      h =
      0.064;
    
//#line 74
private double
      vaver;
    
//#line 75
private double
      vaverh;
    
//#line 77
private double
      etot;
    
//#line 78
private double
      temp;
    
//#line 79
private double
      pres;
    
//#line 80
private double
      rp;
    
//#line 82
private int
      npartm;
    
//#line 84
final public static int
      irep =
      10;
    
//#line 85
final public static int
      istop =
      19;
    
//#line 86
final public static int
      iprint =
      10;
    
//#line 87
final public static int
      movemx =
      50;
    
//#line 89
private int
      rnk;
    
//#line 90
private int
      nprocess;
    
    
//#line 95
public static void
                  exec(
                  ) {
        
//#line 96
final x10.
          lang.
          dist D =
          (x10.
            lang.
            dist)
            x10.
              lang.
              dist.
              UNIQUE;
        
//#line 97
final x10.
          lang.
          GenericReferenceArray P =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(D,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
          lang.
          point pt/* } */, x10.compilergenerated.Parameter1 dummy) { {
            
//#line 98
return new md(
              );
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 99
init(
                      D,
                      P);
        
//#line 100
run(
                       D,
                       P);
        
//#line 101
validate(
                       D,
                       P);
    }
    
    
//#line 104
public static void
                   init(
                   final x10.
                     lang.
                     dist D,
                   final x10.
                     lang.
                     GenericReferenceArray P) {
        
//#line 105
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 105
/* template:ateach { */
            {
            	x10.lang.dist j__distCopy = D; // make copy to avoid recomputation
            	for (java.util.Iterator j__ = j__distCopy.iterator();
            		 j__.hasNext(); )
            	{
            		final  x10.
              lang.
              point j = (x10.
              lang.
              point) j__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) j__distCopy.get(j)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 106
/* template:place-check { */((md) x10.lang.Runtime.hereCheck((/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */)))/* } */.initialise(/* template:array_get { */((j).get(0))/* } */,
                                                                                                                                                                                                        x10.
                                                                                                                                                                                                          lang.
                                                                                                                                                                                                          place.
                                                                                                                                                                                                          MAX_PLACES);
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp0) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp0);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 110
public static void
                   run(
                   final x10.
                     lang.
                     dist D,
                   final x10.
                     lang.
                     GenericReferenceArray P) {
        
//#line 112
int n =
          0;
        
//#line 113
/* template:forloop { */
        for (java.util.Iterator move__ = (x10.
                                            lang.
                                            region.
                                            factory.
                                            region(
                                            x10.
                                              lang.
                                              region.
                                              factory.
                                              region(
                                              0,
                                              movemx -
                                                1))).iterator(); move__.hasNext(); ) {
        	final  x10.
          lang.
          point move = (x10.
          lang.
          point) move__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 114
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 114
/* template:ateach { */
                {
                	x10.lang.dist j__distCopy = D; // make copy to avoid recomputation
                	for (java.util.Iterator j__ = j__distCopy.iterator();
                		 j__.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point j = (x10.
                  lang.
                  point) j__.next();
                		/* Join: { *//* } */
                		((x10.runtime.Place) j__distCopy.get(j)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { *//* } */
{
                    
//#line 115
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.runiters1();
                }/* } */
                				}
                			});
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
            
            
//#line 117
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 117
/* template:ateach { */
                {
                	x10.lang.dist j__distCopy = D; // make copy to avoid recomputation
                	for (java.util.Iterator j__ = j__distCopy.iterator();
                		 j__.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point j = (x10.
                  lang.
                  point) j__.next();
                		/* Join: { *//* } */
                		((x10.runtime.Place) j__distCopy.get(j)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { *//* } */
{
                    
//#line 118
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.runiters2(P);
                }/* } */
                				}
                			});
                	}
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
            
            
//#line 120
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 120
/* template:ateach { */
                {
                	x10.lang.dist j__distCopy = D; // make copy to avoid recomputation
                	for (java.util.Iterator j__ = j__distCopy.iterator();
                		 j__.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point j = (x10.
                  lang.
                  point) j__.next();
                		/* Join: { *//* } */
                		((x10.runtime.Place) j__distCopy.get(j)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { *//* } */
{
                    
//#line 121
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.runiters3(/* template:array_get { */((move).get(0))/* } */);
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp3) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp3);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
    }
    
    
//#line 126
public static void
                   validate(
                   final x10.
                     lang.
                     dist D,
                   final x10.
                     lang.
                     GenericReferenceArray P) {
        
//#line 128
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 128
/* template:ateach { */
            {
            	x10.lang.dist j__distCopy = D; // make copy to avoid recomputation
            	for (java.util.Iterator j__ = j__distCopy.iterator();
            		 j__.hasNext(); )
            	{
            		final  x10.
              lang.
              point j = (x10.
              lang.
              point) j__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) j__distCopy.get(j)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 129
double ref =
                  275.97175611773514;
                
//#line 130
double dev =
                  java.
                    lang.
                    Math.
                    abs(
                    /* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.ek -
                      ref);
                
//#line 131
if (dev >
                                   1.0E-12) {
                    
//#line 132
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                 lang.
                                                                                                                 System.
                                                                                                                 out))/* } */.println("Validation failed at place: " +
                                                                                                                                      /* template:array_get { */((j).get(0))/* } */);
                    
//#line 133
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                 lang.
                                                                                                                 System.
                                                                                                                 out))/* } */.println("Kinetic energy = " +
                                                                                                                                      /* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.ek +
                                                                                                                                      " " +
                                                                                                                                      dev +
                                                                                                                                      " " +
                                                                                                                                      ref);
                    
//#line 134
throw new java.
                      lang.
                      RuntimeException(
                      "Validation failed");
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp4) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp4);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 139
public void
                   initialise(
                   final int rank0,
                   final int nprocess0) {
        
//#line 140
rnk =
          rank0;
        
//#line 141
nprocess =
          nprocess0;
        
//#line 143
vir =
          0.0;
        
//#line 144
epot =
          0.0;
        
//#line 145
interactions =
          0;
        
//#line 148
int mm =
          4;
        
//#line 149
int partsize =
          mm *
          mm *
          mm *
          4;
        
//#line 150
mdsize =
          partsize;
        
//#line 151
x10.
          lang.
          dist dOne =
          x10.
            lang.
            dist.
            factory.
            constant(
            x10.
              lang.
              region.
              factory.
              region(
              x10.
                lang.
                region.
                factory.
                region(
                0,
                mdsize -
                  1)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 152
one =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dOne,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 153
l =
          LENGTH;
        
//#line 155
side =
          java.
            lang.
            Math.
            pow(
            (mdsize /
               den),
            0.3333333);
        
//#line 156
rcoff =
          mm /
            4.0;
        
//#line 158
a =
          side /
            mm;
        
//#line 159
sideh =
          side *
            0.5;
        
//#line 160
hsq =
          h *
            h;
        
//#line 161
hsq2 =
          hsq *
            0.5;
        
//#line 162
npartm =
          mdsize -
            1;
        
//#line 163
rcoffs =
          rcoff *
            rcoff;
        
//#line 164
tscale =
          16.0 /
            ((1.0 *
                mdsize -
                1.0));
        
//#line 165
vaver =
          1.13 *
            java.
              lang.
              Math.
              sqrt(
              tref /
                24.0);
        
//#line 166
vaverh =
          vaver *
            h;
        
//#line 169
/* template:forloop { */
        for (java.util.Iterator base__ = (x10.
                                            lang.
                                            region.
                                            factory.
                                            region(
                                            x10.
                                              lang.
                                              region.
                                              factory.
                                              region(
                                              0,
                                              0))).iterator(); base__.hasNext(); ) {
        	final  x10.
          lang.
          point base = (x10.
          lang.
          point) base__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 170
x10.
              lang.
              point ijk =
              base;
            
//#line 171
/* template:forloop { */
            for (java.util.Iterator p__ = (x10.
                                             lang.
                                             region.
                                             factory.
                                             region(
                                             x10.
                                               lang.
                                               region.
                                               factory.
                                               region(
                                               0,
                                               1),
                                             x10.
                                               lang.
                                               region.
                                               factory.
                                               region(
                                               0,
                                               mm -
                                                 1),
                                             x10.
                                               lang.
                                               region.
                                               factory.
                                               region(
                                               0,
                                               mm -
                                                 1),
                                             x10.
                                               lang.
                                               region.
                                               factory.
                                               region(
                                               0,
                                               mm -
                                                 1))).iterator(); p__.hasNext(); ) {
            	final  x10.
              lang.
              point p = (x10.
              lang.
              point) p__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 172
/* template:array_set { */(one).set(new Particle(
                  (/* template:array_get { */((p).get(1))/* } */ *
                     a +
                     /* template:array_get { */((p).get(0))/* } */ *
                     a *
                     0.5),
                  (/* template:array_get { */((p).get(2))/* } */ *
                     a +
                     /* template:array_get { */((p).get(0))/* } */ *
                     a *
                     0.5),
                  (/* template:array_get { */((p).get(3))/* } */ *
                     a),
                  0.0,
                  0.0,
                  0.0,
                  0.0,
                  0.0,
                  0.0),ijk)/* } */;
                
//#line 181
ijk =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(ijk))/* } */.add(x10.
                                                                                                              lang.
                                                                                                              point.
                                                                                                              factory.
                                                                                                              point(
                                                                                                              1));
            }/* } */
            }
            /* } */
            
            
//#line 184
/* template:forloop { */
            for (java.util.Iterator p__ = (x10.
                                             lang.
                                             region.
                                             factory.
                                             region(
                                             x10.
                                               lang.
                                               region.
                                               factory.
                                               region(
                                               1,
                                               2),
                                             x10.
                                               lang.
                                               region.
                                               factory.
                                               region(
                                               0,
                                               mm -
                                                 1),
                                             x10.
                                               lang.
                                               region.
                                               factory.
                                               region(
                                               0,
                                               mm -
                                                 1),
                                             x10.
                                               lang.
                                               region.
                                               factory.
                                               region(
                                               0,
                                               mm -
                                                 1))).iterator(); p__.hasNext(); ) {
            	final  x10.
              lang.
              point p = (x10.
              lang.
              point) p__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 185
/* template:array_set { */(one).set(new Particle(
                  (/* template:array_get { */((p).get(1))/* } */ *
                     a +
                     ((2 -
                         /* template:array_get { */((p).get(0))/* } */)) *
                     a *
                     0.5),
                  (/* template:array_get { */((p).get(2))/* } */ *
                     a +
                     ((/* template:array_get { */((p).get(0))/* } */ -
                         1)) *
                     a *
                     0.5),
                  (/* template:array_get { */((p).get(3))/* } */ *
                     a +
                     a *
                     0.5),
                  0.0,
                  0.0,
                  0.0,
                  0.0,
                  0.0,
                  0.0),ijk)/* } */;
                
//#line 194
ijk =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(ijk))/* } */.add(x10.
                                                                                                              lang.
                                                                                                              point.
                                                                                                              factory.
                                                                                                              point(
                                                                                                              1));
            }/* } */
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
        
//#line 199
int iseed =
          0;
        
//#line 200
double v1 =
          0.0;
        
//#line 201
double v2 =
          0.0;
        
//#line 203
Random randnum =
          new Random(
          iseed,
          v1,
          v2);
        
//#line 204
double r =
          0.0;
        
//#line 206
int k =
          0;
        
//#line 207
while (k <
                              mdsize) {
            
//#line 208
r =
              /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.seed();
            
//#line 209
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(k))/* } */))/* } */))/* } */.xvelocity =
              r *
                /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.v1;
            
//#line 210
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(k +
              1))/* } */))/* } */))/* } */.xvelocity =
              r *
                /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.v2;
            
//#line 211
k =
              k +
                2;
        }
        
//#line 214
k =
          0;
        
//#line 215
while (k <
                              mdsize) {
            
//#line 216
r =
              /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.seed();
            
//#line 217
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(k))/* } */))/* } */))/* } */.yvelocity =
              r *
                /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.v1;
            
//#line 218
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(k +
              1))/* } */))/* } */))/* } */.yvelocity =
              r *
                /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.v2;
            
//#line 219
k =
              k +
                2;
        }
        
//#line 222
k =
          0;
        
//#line 223
while (k <
                              mdsize) {
            
//#line 224
r =
              /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.seed();
            
//#line 225
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(k))/* } */))/* } */))/* } */.zvelocity =
              r *
                /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.v1;
            
//#line 226
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(k +
              1))/* } */))/* } */))/* } */.zvelocity =
              r *
                /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.v2;
            
//#line 227
k =
              k +
                2;
        }
        
//#line 231
ekin =
          0.0;
        
//#line 232
double sp =
          0.0;
        
//#line 234
/* template:forloop { */
        for (java.util.Iterator i__ = (x10.
                                         lang.
                                         region.
                                         factory.
                                         region(
                                         x10.
                                           lang.
                                           region.
                                           factory.
                                           region(
                                           0,
                                           mdsize -
                                             1))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 235
sp =
              sp +
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.xvelocity;
        }/* } */
        }
        /* } */
        
        
//#line 237
sp =
          sp /
            mdsize;
        
//#line 239
/* template:forloop { */
        for (java.util.Iterator i__ = (x10.
                                         lang.
                                         region.
                                         factory.
                                         region(
                                         x10.
                                           lang.
                                           region.
                                           factory.
                                           region(
                                           0,
                                           mdsize -
                                             1))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 240
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.xvelocity =
              /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.xvelocity -
                sp;
            
//#line 241
ekin =
              ekin +
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.xvelocity *
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.xvelocity;
        }/* } */
        }
        /* } */
        
        
//#line 244
sp =
          0.0;
        
//#line 245
/* template:forloop { */
        for (java.util.Iterator i__ = (x10.
                                         lang.
                                         region.
                                         factory.
                                         region(
                                         x10.
                                           lang.
                                           region.
                                           factory.
                                           region(
                                           0,
                                           mdsize -
                                             1))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 246
sp =
              sp +
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.yvelocity;
        }/* } */
        }
        /* } */
        
        
//#line 248
sp =
          sp /
            mdsize;
        
//#line 250
/* template:forloop { */
        for (java.util.Iterator i__ = (x10.
                                         lang.
                                         region.
                                         factory.
                                         region(
                                         x10.
                                           lang.
                                           region.
                                           factory.
                                           region(
                                           0,
                                           mdsize -
                                             1))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 251
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.yvelocity =
              /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.yvelocity -
                sp;
            
//#line 252
ekin =
              ekin +
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.yvelocity *
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.yvelocity;
        }/* } */
        }
        /* } */
        
        
//#line 255
sp =
          0.0;
        
//#line 256
/* template:forloop { */
        for (java.util.Iterator i__ = (x10.
                                         lang.
                                         region.
                                         factory.
                                         region(
                                         x10.
                                           lang.
                                           region.
                                           factory.
                                           region(
                                           0,
                                           mdsize -
                                             1))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 257
sp =
              sp +
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.zvelocity;
        }/* } */
        }
        /* } */
        
        
//#line 259
sp =
          sp /
            mdsize;
        
//#line 261
/* template:forloop { */
        for (java.util.Iterator i__ = (x10.
                                         lang.
                                         region.
                                         factory.
                                         region(
                                         x10.
                                           lang.
                                           region.
                                           factory.
                                           region(
                                           0,
                                           mdsize -
                                             1))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 262
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.zvelocity =
              /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.zvelocity -
                sp;
            
//#line 263
ekin =
              ekin +
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.zvelocity *
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.zvelocity;
        }/* } */
        }
        /* } */
        
        
//#line 266
double ts =
          tscale *
          ekin;
        
//#line 267
sc =
          h *
            java.
              lang.
              Math.
              sqrt(
              tref /
                ts);
        
//#line 269
/* template:forloop { */
        for (java.util.Iterator i__ = (x10.
                                         lang.
                                         region.
                                         factory.
                                         region(
                                         x10.
                                           lang.
                                           region.
                                           factory.
                                           region(
                                           0,
                                           mdsize -
                                             1))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 270
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.xvelocity =
              /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.xvelocity *
                sc;
            
//#line 271
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.yvelocity =
              /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.yvelocity *
                sc;
            
//#line 272
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.zvelocity =
              /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.zvelocity *
                sc;
        }/* } */
        }
        /* } */
        
    }
    
    
//#line 278
public void
                   runiters1(
                   ) {
        
//#line 279
/* template:forloop { */
        for (java.util.Iterator i__ = (x10.
                                         lang.
                                         region.
                                         factory.
                                         region(
                                         x10.
                                           lang.
                                           region.
                                           factory.
                                           region(
                                           0,
                                           mdsize -
                                             1))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 280
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.domove(side);
        }/* } */
        }
        /* } */
        
        
//#line 284
epot =
          0.0;
        
//#line 285
vir =
          0.0;
        
//#line 287
int i =
          0 +
          rnk;
        
//#line 288
while (i <
                              mdsize) {
            
//#line 289
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.force(side,
                                                                                                                                                                                                           rcoff,
                                                                                                                                                                                                           mdsize,
                                                                                                                                                                                                           i,
                                                                                                                                                                                                           this);
            
//#line 291
i =
              i +
                nprocess;
        }
    }
    
    
//#line 295
public void
                   runiters2(
                   final x10.
                     lang.
                     GenericReferenceArray P) {
        
//#line 296
allreduce(
                       P);
    }
    
    
//#line 299
public void
                   runiters3(
                   final int move) {
        
//#line 300
double summation =
          0.0;
        
//#line 302
/* template:forloop { */
        for (java.util.Iterator i__ = (x10.
                                         lang.
                                         region.
                                         factory.
                                         region(
                                         x10.
                                           lang.
                                           region.
                                           factory.
                                           region(
                                           0,
                                           mdsize -
                                             1))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 303
summation =
              summation +
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.mkekin(hsq2);
        }/* } */
        }
        /* } */
        
        
//#line 306
ekin =
          summation /
            hsq;
        
//#line 308
double vel =
          0.0;
        
//#line 309
count =
          0.0;
        
//#line 311
/* template:forloop { */
        for (java.util.Iterator i__ = (x10.
                                         lang.
                                         region.
                                         factory.
                                         region(
                                         x10.
                                           lang.
                                           region.
                                           factory.
                                           region(
                                           0,
                                           mdsize -
                                             1))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 312
vel =
              vel +
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.velavg(vaverh,
                                                                                                                                                                                                   h,
                                                                                                                                                                                                   this);
        }/* } */
        }
        /* } */
        
        
//#line 315
vel =
          vel /
            h;
        
//#line 318
if (((move <
                             istop)) &&
                           ((((((move +
                                   1)) %
                                 irep)) ==
                               0))) {
            
//#line 319
sc =
              java.
                lang.
                Math.
                sqrt(
                tref /
                  ((tscale *
                      ekin)));
            
//#line 321
/* template:forloop { */
            for (java.util.Iterator i__ = (x10.
                                             lang.
                                             region.
                                             factory.
                                             region(
                                             x10.
                                               lang.
                                               region.
                                               factory.
                                               region(
                                               0,
                                               mdsize -
                                                 1))).iterator(); i__.hasNext(); ) {
            	final  x10.
              lang.
              point i = (x10.
              lang.
              point) i__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 322
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.dscal(sc,
                                                                                                                                                                                                               1);
            }/* } */
            }
            /* } */
            
            
//#line 324
ekin =
              tref /
                tscale;
        }
        
//#line 328
if (((((move +
                               1)) %
                             iprint)) ==
                           0) {
            
//#line 329
ek =
              24.0 *
                ekin;
            
//#line 330
epot =
              4.0 *
                epot;
            
//#line 331
etot =
              ek +
                epot;
            
//#line 332
temp =
              tscale *
                ekin;
            
//#line 333
pres =
              den *
                16.0 *
                ((ekin -
                    vir)) /
                mdsize;
            
//#line 334
vel =
              vel /
                mdsize;
            
//#line 335
rp =
              ((count /
                  mdsize)) *
                100.0;
        }
    }
    
    
//#line 339
public void
                   allreduce(
                   final x10.
                     lang.
                     GenericReferenceArray P) {
        
//#line 342
if (rnk !=
                           0) {
            
//#line 342
return;
        }
        
//#line 344
final md t =
          new md(
          );
        
//#line 345
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.mdsize =
          mdsize;
        
//#line 346
final x10.
          lang.
          dist dOne =
          x10.
            lang.
            dist.
            factory.
            constant(
            x10.
              lang.
              region.
              factory.
              region(
              x10.
                lang.
                region.
                factory.
                region(
                0,
                mdsize -
                  1)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 347
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dOne,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 349
final x10.
          lang.
          place tHere =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 350
/* template:forloop { */
        for (java.util.Iterator k__ = (x10.
                                         lang.
                                         region.
                                         factory.
                                         region(
                                         x10.
                                           lang.
                                           region.
                                           factory.
                                           region(
                                           0,
                                           (mdsize -
                                              1)))).iterator(); k__.hasNext(); ) {
        	final  x10.
          lang.
          point k = (x10.
          lang.
          point) k__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 351
/* template:array_set { */(/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one).set(new Particle(
              0.0,
              0.0,
              0.0,
              0.0,
              0.0,
              0.0,
              0.0,
              0.0,
              0.0),k)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 357
/* template:forloop { */
        for (java.util.Iterator j__ = (P.
                                         distribution.
                                         region).iterator(); j__.hasNext(); ) {
        	final  x10.
          lang.
          point j = (x10.
          lang.
          point) j__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 358
final x10.
              lang.
              dist dD =
              x10.
                lang.
                dist.
                factory.
                constant(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  x10.
                    lang.
                    region.
                    factory.
                    region(
                    0,
                    2)),
                /* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 359
final x10.
              lang.
              dist dI =
              x10.
                lang.
                dist.
                factory.
                constant(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  x10.
                    lang.
                    region.
                    factory.
                    region(
                    0,
                    0)),
                /* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 360
final x10.
              lang.
              DoubleReferenceArray dataD =
              /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dD,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
            
//#line 361
final x10.
              lang.
              DoubleReferenceArray dataI =
              /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dI,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
            
//#line 362
/* template:forloop { */
            for (java.util.Iterator k__ = (x10.
                                             lang.
                                             region.
                                             factory.
                                             region(
                                             x10.
                                               lang.
                                               region.
                                               factory.
                                               region(
                                               0,
                                               (mdsize -
                                                  1)))).iterator(); k__.hasNext(); ) {
            	final  x10.
              lang.
              point k = (x10.
              lang.
              point) k__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 363
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 363
/* template:Async { */(x10.lang.Runtime.asPlace(P.
                                                                                   distribution.
                                                                                   get(
                                                                                   j))).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 364
final double fx =
                          /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.one).get(k))/* } */))/* } */))/* } */.xforce;
                        
//#line 365
final double fy =
                          /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.one).get(k))/* } */))/* } */))/* } */.yforce;
                        
//#line 366
final double fz =
                          /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.one).get(k))/* } */))/* } */))/* } */.zforce;
                        
//#line 368
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 368
/* template:Async { */(x10.lang.Runtime.asPlace(tHere)).runAsync
                            	(new x10.runtime.Activity() {
                            		public void runX10Task() {
                            			{
                                
//#line 369
/* template:array_set { */(dataD).set(fx,0)/* } */;
                                
//#line 370
/* template:array_set { */(dataD).set(fy,1)/* } */;
                                
//#line 371
/* template:array_set { */(dataD).set(fz,2)/* } */;
                            }
                            		}
                            	});/* } */
                        }
                        	} catch (Throwable tmp6) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp6);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                    }
                    		}
                    	});/* } */
                }
                	} catch (Throwable tmp5) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp5);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 375
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one).get(k))/* } */))/* } */))/* } */.xforce =
                  /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one).get(k))/* } */))/* } */))/* } */.xforce +
                    /* template:array_get { */((dataD).get(0))/* } */;
                
//#line 376
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one).get(k))/* } */))/* } */))/* } */.yforce =
                  /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one).get(k))/* } */))/* } */))/* } */.yforce +
                    /* template:array_get { */((dataD).get(1))/* } */;
                
//#line 377
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one).get(k))/* } */))/* } */))/* } */.zforce =
                  /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one).get(k))/* } */))/* } */))/* } */.zforce +
                    /* template:array_get { */((dataD).get(2))/* } */;
            }/* } */
            }
            /* } */
            
            
//#line 380
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 380
/* template:Async { */(x10.lang.Runtime.asPlace(P.
                                                                               distribution.
                                                                               get(
                                                                               j))).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 381
final double jvir =
                      /* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.vir;
                    
//#line 382
final double jepot =
                      /* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.epot;
                    
//#line 383
final int jinter =
                      /* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.interactions;
                    
//#line 385
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 385
/* template:Async { */(x10.lang.Runtime.asPlace(tHere)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 386
/* template:array_set { */(dataD).set(jvir,0)/* } */;
                            
//#line 387
/* template:array_set { */(dataD).set(jepot,1)/* } */;
                            
//#line 388
/* template:array_set { */(dataI).set(jinter,0)/* } */;
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
            
            
//#line 391
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.vir =
              /* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.vir +
                /* template:array_get { */((dataD).get(0))/* } */;
            
//#line 392
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.epot =
              /* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.epot +
                /* template:array_get { */((dataD).get(1))/* } */;
            
//#line 394
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.interactions =
              /* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.interactions +
                (int)
                  /* template:array_get { */((dataI).get(0))/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 398
final int mymdsize =
          mdsize;
        
//#line 400
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 400
/* template:ateach { */
            {
            	x10.lang.dist j__distCopy = P.
                                           distribution; // make copy to avoid recomputation
            	for (java.util.Iterator j__ = j__distCopy.iterator();
            		 j__.hasNext(); )
            	{
            		final  x10.
              lang.
              point j = (x10.
              lang.
              point) j__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) j__distCopy.get(j)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 402
final x10.
                  lang.
                  place pHere =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 403
final x10.
                  lang.
                  dist dD =
                  x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    x10.
                      lang.
                      region.
                      factory.
                      region(
                      x10.
                        lang.
                        region.
                        factory.
                        region(
                        0,
                        2)),
                    /* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 404
final x10.
                  lang.
                  DoubleReferenceArray dataD =
                  /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dD,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
                
//#line 407
/* template:forloop { */
                for (java.util.Iterator k__ = (x10.
                                                 lang.
                                                 region.
                                                 factory.
                                                 region(
                                                 x10.
                                                   lang.
                                                   region.
                                                   factory.
                                                   region(
                                                   0,
                                                   (mymdsize -
                                                      1)))).iterator(); k__.hasNext(); ) {
                	final  x10.
                  lang.
                  point k = (x10.
                  lang.
                  point) k__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 409
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 409
/* template:Async { */(x10.lang.Runtime.asPlace(tHere)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 410
final double xf =
                              /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one).get(k))/* } */))/* } */))/* } */.xforce;
                            
//#line 411
final double yf =
                              /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one).get(k))/* } */))/* } */))/* } */.yforce;
                            
//#line 412
final double zf =
                              /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one).get(k))/* } */))/* } */))/* } */.zforce;
                            
//#line 414
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 414
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                                	(new x10.runtime.Activity() {
                                		public void runX10Task() {
                                			{
                                    
//#line 415
/* template:array_set { */(dataD).set(xf,0)/* } */;
                                    
//#line 416
/* template:array_set { */(dataD).set(yf,1)/* } */;
                                    
//#line 417
/* template:array_set { */(dataD).set(zf,2)/* } */;
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
                    
                    
//#line 422
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.one).get(k))/* } */))/* } */))/* } */.xforce =
                      /* template:array_get { */((dataD).get(0))/* } */;
                    
//#line 423
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.one).get(k))/* } */))/* } */))/* } */.yforce =
                      /* template:array_get { */((dataD).get(1))/* } */;
                    
//#line 424
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.one).get(k))/* } */))/* } */))/* } */.zforce =
                      /* template:array_get { */((dataD).get(2))/* } */;
                }/* } */
                }
                /* } */
                
                
//#line 428
final x10.
                  lang.
                  dist dI =
                  x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    x10.
                      lang.
                      region.
                      factory.
                      region(
                      x10.
                        lang.
                        region.
                        factory.
                        region(
                        0,
                        0)),
                    /* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 429
final x10.
                  lang.
                  IntReferenceArray dataI =
                  /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dI,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
                
//#line 430
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 430
/* template:Async { */(x10.lang.Runtime.asPlace(tHere)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 431
final double tvir =
                          /* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.vir;
                        
//#line 432
final double tepot =
                          /* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.epot;
                        
//#line 433
final int tinter =
                          /* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.interactions;
                        
//#line 435
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 435
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                            	(new x10.runtime.Activity() {
                            		public void runX10Task() {
                            			{
                                
//#line 436
/* template:array_set { */(dataD).set(tvir,0)/* } */;
                                
//#line 437
/* template:array_set { */(dataD).set(tepot,1)/* } */;
                                
//#line 438
/* template:array_set { */(dataI).set(tinter,0)/* } */;
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
                }
                	} catch (Throwable tmp12) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp12);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 443
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.vir =
                  /* template:array_get { */((dataD).get(0))/* } */;
                
//#line 444
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.epot =
                  /* template:array_get { */((dataD).get(1))/* } */;
                
//#line 445
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.interactions =
                  /* template:array_get { */((dataI).get(0))/* } */;
            }/* } */
            				}
            			});
            	}
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
    
    
//#line 35
public md() {
        
//#line 35
super();
    }
}
