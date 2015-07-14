import x10.lang.*;

class md
extends x10.
  lang.
  Object
{
    
//#line 2
final public static int
      ITERS =
      100;
    
//#line 3
final public static double
      LENGTH =
      5.0E-9;
    
//#line 4
final public static double
      m =
      4.0026;
    
//#line 5
final public static double
      mu =
      1.66056E-27;
    
//#line 6
final public static double
      kb =
      1.38066E-23;
    
//#line 7
final public static double
      TSIM =
      50;
    
//#line 8
final public static double
      deltat =
      5.0E-16;
    
//#line 9
public x10.
      lang.
      GenericReferenceArray
      one;
    
//#line 10
public double
      epot;
    
//#line 11
public double
      vir;
    
//#line 12
public int
      interactions;
    
//#line 13
public double
      count;
    
//#line 14
private int
      mdsize;
    
//#line 15
private double
      l;
    
//#line 16
private double
      rcoff;
    
//#line 17
private double
      rcoffs;
    
//#line 18
private double
      side;
    
//#line 19
private double
      sideh;
    
//#line 20
private double
      hsq;
    
//#line 21
private double
      hsq2;
    
//#line 22
private double
      a;
    
//#line 23
private double
      tscale;
    
//#line 24
private double
      sc;
    
//#line 25
private double
      ekin;
    
//#line 26
private double
      ek;
    
//#line 27
final public static double
      den =
      0.83134;
    
//#line 28
final public static double
      tref =
      0.722;
    
//#line 29
final public static double
      h =
      0.064;
    
//#line 30
private double
      vaver;
    
//#line 31
private double
      vaverh;
    
//#line 32
private double
      etot;
    
//#line 33
private double
      temp;
    
//#line 34
private double
      pres;
    
//#line 35
private double
      rp;
    
//#line 36
private int
      npartm;
    
//#line 37
final public static int
      irep =
      10;
    
//#line 38
final public static int
      istop =
      19;
    
//#line 39
final public static int
      iprint =
      10;
    
//#line 40
final public static int
      movemx =
      50;
    
//#line 41
private int
      rnk;
    
//#line 42
private int
      nprocess;
    
    
//#line 43
public static void
                  exec(
                  ) {
        
//#line 44
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
        
//#line 45
final x10.
          lang.
          GenericReferenceArray P =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(D,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
          lang.
          point pt/* } */, x10.compilergenerated.Parameter1 dummy) { {
            
//#line 46
return new md(
              );
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 48
init(
                      D,
                      P);
        
//#line 49
run(
                      D,
                      P);
        
//#line 50
validate(
                      D,
                      P);
    }
    
    
//#line 52
public static void
                  init(
                  final x10.
                    lang.
                    dist D,
                  final x10.
                    lang.
                    GenericReferenceArray P) {
        
//#line 53
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 54
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
                
//#line 55
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
    
    
//#line 58
public static void
                  run(
                  final x10.
                    lang.
                    dist D,
                  final x10.
                    lang.
                    GenericReferenceArray P) {
        
//#line 59
int n =
          0;
        
//#line 60
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
            
//#line 61
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 62
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
                    
//#line 63
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
            
            
//#line 65
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 66
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
                    
//#line 67
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
            
            
//#line 69
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 70
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
                    
//#line 71
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
    
    
//#line 75
public static void
                  validate(
                  final x10.
                    lang.
                    dist D,
                  final x10.
                    lang.
                    GenericReferenceArray P) {
        
//#line 76
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 77
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
                
//#line 78
double ref =
                  275.97175611773514;
                
//#line 79
double dev =
                  java.
                    lang.
                    Math.
                    abs(
                    /* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.ek -
                      ref);
                
//#line 80
if (dev >
                                  1.0E-12) {
                    
//#line 81
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                lang.
                                                                                                                System.
                                                                                                                out))/* } */.println("Validation failed at place: " +
                                                                                                                                     /* template:array_get { */((j).get(0))/* } */);
                    
//#line 82
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                lang.
                                                                                                                System.
                                                                                                                out))/* } */.println("Kinetic energy = " +
                                                                                                                                     /* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.ek +
                                                                                                                                     " " +
                                                                                                                                     dev +
                                                                                                                                     " " +
                                                                                                                                     ref);
                    
//#line 83
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
    
    
//#line 87
public void
                  initialise(
                  final int rank0,
                  final int nprocess0) {
        
//#line 88
rnk =
          rank0;
        
//#line 89
nprocess =
          nprocess0;
        
//#line 90
vir =
          0.0;
        
//#line 91
epot =
          0.0;
        
//#line 92
interactions =
          0;
        
//#line 93
int mm =
          4;
        
//#line 94
int partsize =
          mm *
          mm *
          mm *
          4;
        
//#line 95
mdsize =
          partsize;
        
//#line 96
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
        
//#line 97
one =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dOne,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 98
l =
          LENGTH;
        
//#line 99
side =
          java.
            lang.
            Math.
            pow(
            (mdsize /
               den),
            0.3333333);
        
//#line 100
rcoff =
          mm /
            4.0;
        
//#line 101
a =
          side /
            mm;
        
//#line 102
sideh =
          side *
            0.5;
        
//#line 103
hsq =
          h *
            h;
        
//#line 104
hsq2 =
          hsq *
            0.5;
        
//#line 105
npartm =
          mdsize -
            1;
        
//#line 106
rcoffs =
          rcoff *
            rcoff;
        
//#line 107
tscale =
          16.0 /
            ((1.0 *
                mdsize -
                1.0));
        
//#line 108
vaver =
          1.13 *
            java.
              lang.
              Math.
              sqrt(
              tref /
                24.0);
        
//#line 109
vaverh =
          vaver *
            h;
        
//#line 110
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
            
//#line 111
x10.
              lang.
              point ijk =
              base;
            
//#line 112
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
                
//#line 113
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
                
//#line 114
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
            
            
//#line 116
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
                
//#line 117
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
                
//#line 118
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
        
        
//#line 121
int iseed =
          0;
        
//#line 122
double v1 =
          0.0;
        
//#line 123
double v2 =
          0.0;
        
//#line 124
Random randnum =
          new Random(
          iseed,
          v1,
          v2);
        
//#line 125
double r =
          0.0;
        
//#line 126
int k =
          0;
        
//#line 127
while (k <
                              mdsize) {
            
//#line 128
r =
              /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.seed();
            
//#line 129
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(k))/* } */))/* } */))/* } */.xvelocity =
              r *
                /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.v1;
            
//#line 130
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(k +
              1))/* } */))/* } */))/* } */.xvelocity =
              r *
                /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.v2;
            
//#line 131
k =
              k +
                2;
        }
        
//#line 133
k =
          0;
        
//#line 134
while (k <
                              mdsize) {
            
//#line 135
r =
              /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.seed();
            
//#line 136
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(k))/* } */))/* } */))/* } */.yvelocity =
              r *
                /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.v1;
            
//#line 137
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(k +
              1))/* } */))/* } */))/* } */.yvelocity =
              r *
                /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.v2;
            
//#line 138
k =
              k +
                2;
        }
        
//#line 140
k =
          0;
        
//#line 141
while (k <
                              mdsize) {
            
//#line 142
r =
              /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.seed();
            
//#line 143
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(k))/* } */))/* } */))/* } */.zvelocity =
              r *
                /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.v1;
            
//#line 144
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(k +
              1))/* } */))/* } */))/* } */.zvelocity =
              r *
                /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.v2;
            
//#line 145
k =
              k +
                2;
        }
        
//#line 147
ekin =
          0.0;
        
//#line 148
double sp =
          0.0;
        
//#line 149
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
            
//#line 150
sp =
              sp +
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.xvelocity;
        }/* } */
        }
        /* } */
        
        
//#line 152
sp =
          sp /
            mdsize;
        
//#line 153
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
            
//#line 154
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.xvelocity =
              /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.xvelocity -
                sp;
            
//#line 155
ekin =
              ekin +
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.xvelocity *
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.xvelocity;
        }/* } */
        }
        /* } */
        
        
//#line 157
sp =
          0.0;
        
//#line 158
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
            
//#line 159
sp =
              sp +
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.yvelocity;
        }/* } */
        }
        /* } */
        
        
//#line 161
sp =
          sp /
            mdsize;
        
//#line 162
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
            
//#line 163
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.yvelocity =
              /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.yvelocity -
                sp;
            
//#line 164
ekin =
              ekin +
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.yvelocity *
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.yvelocity;
        }/* } */
        }
        /* } */
        
        
//#line 166
sp =
          0.0;
        
//#line 167
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
            
//#line 168
sp =
              sp +
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.zvelocity;
        }/* } */
        }
        /* } */
        
        
//#line 170
sp =
          sp /
            mdsize;
        
//#line 171
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
            
//#line 172
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.zvelocity =
              /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.zvelocity -
                sp;
            
//#line 173
ekin =
              ekin +
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.zvelocity *
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.zvelocity;
        }/* } */
        }
        /* } */
        
        
//#line 175
double ts =
          tscale *
          ekin;
        
//#line 176
sc =
          h *
            java.
              lang.
              Math.
              sqrt(
              tref /
                ts);
        
//#line 177
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
            
//#line 178
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.xvelocity =
              /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.xvelocity *
                sc;
            
//#line 179
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.yvelocity =
              /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.yvelocity *
                sc;
            
//#line 180
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.zvelocity =
              /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.zvelocity *
                sc;
        }/* } */
        }
        /* } */
        
    }
    
    
//#line 183
public void
                   runiters1(
                   ) {
        
//#line 184
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
            
//#line 185
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.domove(side);
        }/* } */
        }
        /* } */
        
        
//#line 187
epot =
          0.0;
        
//#line 188
vir =
          0.0;
        
//#line 189
int i =
          0 +
          rnk;
        
//#line 190
while (i <
                              mdsize) {
            
//#line 191
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.force(side,
                                                                                                                                                                                                           rcoff,
                                                                                                                                                                                                           mdsize,
                                                                                                                                                                                                           i,
                                                                                                                                                                                                           this);
            
//#line 192
i =
              i +
                nprocess;
        }
    }
    
    
//#line 195
public void
                   runiters2(
                   final x10.
                     lang.
                     GenericReferenceArray P) {
        
//#line 196
allreduce(
                       P);
    }
    
    
//#line 198
public void
                   runiters3(
                   final int move) {
        
//#line 199
double summation =
          0.0;
        
//#line 200
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
            
//#line 201
summation =
              summation +
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.mkekin(hsq2);
        }/* } */
        }
        /* } */
        
        
//#line 203
ekin =
          summation /
            hsq;
        
//#line 204
double vel =
          0.0;
        
//#line 205
count =
          0.0;
        
//#line 206
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
            
//#line 207
vel =
              vel +
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.velavg(vaverh,
                                                                                                                                                                                                   h,
                                                                                                                                                                                                   this);
        }/* } */
        }
        /* } */
        
        
//#line 209
vel =
          vel /
            h;
        
//#line 210
if (((move <
                             istop)) &&
                           ((((((move +
                                   1)) %
                                 irep)) ==
                               0))) {
            
//#line 211
sc =
              java.
                lang.
                Math.
                sqrt(
                tref /
                  ((tscale *
                      ekin)));
            
//#line 212
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
                
//#line 213
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((one).get(i))/* } */))/* } */))/* } */.dscal(sc,
                                                                                                                                                                                                               1);
            }/* } */
            }
            /* } */
            
            
//#line 215
ekin =
              tref /
                tscale;
        }
        
//#line 217
if (((((move +
                               1)) %
                             iprint)) ==
                           0) {
            
//#line 218
ek =
              24.0 *
                ekin;
            
//#line 219
epot =
              4.0 *
                epot;
            
//#line 220
etot =
              ek +
                epot;
            
//#line 221
temp =
              tscale *
                ekin;
            
//#line 222
pres =
              den *
                16.0 *
                ((ekin -
                    vir)) /
                mdsize;
            
//#line 223
vel =
              vel /
                mdsize;
            
//#line 224
rp =
              ((count /
                  mdsize)) *
                100.0;
        }
    }
    
    
//#line 227
public void
                   allreduce(
                   final x10.
                     lang.
                     GenericReferenceArray P) {
        
//#line 228
if (rnk !=
                           0) {
            
//#line 229
return;
        }
        
//#line 230
final md t =
          new md(
          );
        
//#line 231
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.mdsize =
          mdsize;
        
//#line 232
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
        
//#line 233
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dOne,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 234
final x10.
          lang.
          place tHere =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 235
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
            
//#line 236
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
        
        
//#line 238
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
            
//#line 239
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
            
//#line 240
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
            
//#line 241
final x10.
              lang.
              DoubleReferenceArray dataD =
              /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dD,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
            
//#line 242
final x10.
              lang.
              DoubleReferenceArray dataI =
              /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dI,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
            
//#line 243
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
                
//#line 244
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 245
/* template:Async { */(x10.lang.Runtime.asPlace(P.
                                                                                   distribution.
                                                                                   get(
                                                                                   j))).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 246
final double fx =
                          /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.one).get(k))/* } */))/* } */))/* } */.xforce;
                        
//#line 247
final double fy =
                          /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.one).get(k))/* } */))/* } */))/* } */.yforce;
                        
//#line 248
final double fz =
                          /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.one).get(k))/* } */))/* } */))/* } */.zforce;
                        
//#line 249
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 250
/* template:Async { */(x10.lang.Runtime.asPlace(tHere)).runAsync
                            	(new x10.runtime.Activity() {
                            		public void runX10Task() {
                            			{
                                
//#line 251
/* template:array_set { */(dataD).set(fx,0)/* } */;
                                
//#line 252
/* template:array_set { */(dataD).set(fy,1)/* } */;
                                
//#line 253
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
                
                
//#line 256
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one).get(k))/* } */))/* } */))/* } */.xforce =
                  /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one).get(k))/* } */))/* } */))/* } */.xforce +
                    /* template:array_get { */((dataD).get(0))/* } */;
                
//#line 257
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one).get(k))/* } */))/* } */))/* } */.yforce =
                  /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one).get(k))/* } */))/* } */))/* } */.yforce +
                    /* template:array_get { */((dataD).get(1))/* } */;
                
//#line 258
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one).get(k))/* } */))/* } */))/* } */.zforce =
                  /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one).get(k))/* } */))/* } */))/* } */.zforce +
                    /* template:array_get { */((dataD).get(2))/* } */;
            }/* } */
            }
            /* } */
            
            
//#line 260
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 261
/* template:Async { */(x10.lang.Runtime.asPlace(P.
                                                                               distribution.
                                                                               get(
                                                                               j))).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 262
final double jvir =
                      /* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.vir;
                    
//#line 263
final double jepot =
                      /* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.epot;
                    
//#line 264
final int jinter =
                      /* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.interactions;
                    
//#line 265
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 266
/* template:Async { */(x10.lang.Runtime.asPlace(tHere)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 267
/* template:array_set { */(dataD).set(jvir,0)/* } */;
                            
//#line 268
/* template:array_set { */(dataD).set(jepot,1)/* } */;
                            
//#line 269
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
            
            
//#line 272
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.vir =
              /* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.vir +
                /* template:array_get { */((dataD).get(0))/* } */;
            
//#line 273
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.epot =
              /* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.epot +
                /* template:array_get { */((dataD).get(1))/* } */;
            
//#line 274
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.interactions =
              /* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.interactions +
                (int)
                  /* template:array_get { */((dataI).get(0))/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 276
final int mymdsize =
          mdsize;
        
//#line 277
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 278
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
                
//#line 279
final x10.
                  lang.
                  place pHere =
                  /* template:here { */x10.lang.Runtime.here()/* } */;
                
//#line 280
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
                
//#line 281
final x10.
                  lang.
                  DoubleReferenceArray dataD =
                  /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dD,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
                
//#line 282
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
                    
//#line 283
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 284
/* template:Async { */(x10.lang.Runtime.asPlace(tHere)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 285
final double xf =
                              /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one).get(k))/* } */))/* } */))/* } */.xforce;
                            
//#line 286
final double yf =
                              /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one).get(k))/* } */))/* } */))/* } */.yforce;
                            
//#line 287
final double zf =
                              /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one).get(k))/* } */))/* } */))/* } */.zforce;
                            
//#line 288
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 289
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                                	(new x10.runtime.Activity() {
                                		public void runX10Task() {
                                			{
                                    
//#line 290
/* template:array_set { */(dataD).set(xf,0)/* } */;
                                    
//#line 291
/* template:array_set { */(dataD).set(yf,1)/* } */;
                                    
//#line 292
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
                    
                    
//#line 295
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.one).get(k))/* } */))/* } */))/* } */.xforce =
                      /* template:array_get { */((dataD).get(0))/* } */;
                    
//#line 296
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.one).get(k))/* } */))/* } */))/* } */.yforce =
                      /* template:array_get { */((dataD).get(1))/* } */;
                    
//#line 297
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.one).get(k))/* } */))/* } */))/* } */.zforce =
                      /* template:array_get { */((dataD).get(2))/* } */;
                }/* } */
                }
                /* } */
                
                
//#line 299
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
                
//#line 300
final x10.
                  lang.
                  IntReferenceArray dataI =
                  /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dI,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
                
//#line 301
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 302
/* template:Async { */(x10.lang.Runtime.asPlace(tHere)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 303
final double tvir =
                          /* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.vir;
                        
//#line 304
final double tepot =
                          /* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.epot;
                        
//#line 305
final int tinter =
                          /* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.interactions;
                        
//#line 306
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 307
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                            	(new x10.runtime.Activity() {
                            		public void runX10Task() {
                            			{
                                
//#line 308
/* template:array_set { */(dataD).set(tvir,0)/* } */;
                                
//#line 309
/* template:array_set { */(dataD).set(tepot,1)/* } */;
                                
//#line 310
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
                
                
//#line 313
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.vir =
                  /* template:array_get { */((dataD).get(0))/* } */;
                
//#line 314
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */))/* } */.epot =
                  /* template:array_get { */((dataD).get(1))/* } */;
                
//#line 315
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
    
    
//#line 1
public md() {
        
//#line 1
super();
    }
}

public class mdMain
extends x10.
  lang.
  Object
{
    
    
//#line 321
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
        {
            
//#line 323
Timer tmr =
              new Timer(
              );
            
//#line 324
int count =
              0;
            
//#line 325
/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.start(count);
            
//#line 326
md.
                           exec();
            
//#line 327
/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.stop(count);
            
//#line 328
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("Wall-clock time for moldyn: " +
                                                                                                                              /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.readTimer(count) +
                                                                                                                              " secs");
        }
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 320
public mdMain() {
        
//#line 320
super();
    }
}

class Random
extends x10.
  lang.
  Object
{
    
//#line 334
public int
      iseed;
    
//#line 335
public double
      v1;
    
//#line 336
public double
      v2;
    
    
//#line 337
public Random(final int iseed0,
                               final double v10,
                               final double v20) {
        
//#line 337
super();
        
//#line 338
iseed =
          iseed0;
        
//#line 339
v1 =
          v10;
        
//#line 340
v2 =
          v20;
    }
    
    
//#line 342
public double
                   update(
                   ) {
        
//#line 343
double rand =
          0.0;
        
//#line 344
double scale =
          4.656612875E-10;
        
//#line 345
int is1 =
          0;
        
//#line 346
int is2 =
          0;
        
//#line 347
int iss2 =
          0;
        
//#line 348
int imult =
          16807;
        
//#line 349
int imod =
          2147483647;
        
//#line 350
if (iseed <=
                           0) {
            
//#line 351
iseed =
              1;
        }
        
//#line 353
is2 =
          iseed %
            32768;
        
//#line 354
is1 =
          ((iseed -
              is2)) /
            32768;
        
//#line 355
iss2 =
          is2 *
            imult;
        
//#line 356
is2 =
          iss2 %
            32768;
        
//#line 357
is1 =
          ((is1 *
              imult +
              ((iss2 -
                  is2)) /
              32768)) %
            ((65536));
        
//#line 358
iseed =
          ((is1 *
              32768 +
              is2)) %
            imod;
        
//#line 359
rand =
          scale *
            iseed;
        
//#line 360
return rand;
    }
    
    
//#line 362
public double
                   seed(
                   ) {
        
//#line 363
double s =
          0.0;
        
//#line 364
double u1 =
          0.0;
        
//#line 365
double u2 =
          0.0;
        
//#line 366
double r =
          0.0;
        
//#line 367
s =
          1.0;
        
//#line 368
do  {
            
//#line 369
u1 =
              update();
            
//#line 370
u2 =
              update();
            
//#line 371
v1 =
              2.0 *
                u1 -
                1.0;
            
//#line 372
v2 =
              2.0 *
                u2 -
                1.0;
            
//#line 373
s =
              v1 *
                v1 +
                v2 *
                v2;
        }while(s >=
                 1.0); 
        
//#line 375
r =
          java.
            lang.
            Math.
            sqrt(
            -2.0 *
              java.
                lang.
                Math.
                log(
                s) /
              s);
        
//#line 376
return r;
    }
}

class Particle
extends x10.
  lang.
  Object
{
    
//#line 381
public double
      xcoord;
    
//#line 382
public double
      ycoord;
    
//#line 383
public double
      zcoord;
    
//#line 384
public double
      xvelocity;
    
//#line 385
public double
      yvelocity;
    
//#line 386
public double
      zvelocity;
    
//#line 387
public double
      xforce;
    
//#line 388
public double
      yforce;
    
//#line 389
public double
      zforce;
    
    
//#line 390
public Particle(final double xcoord0,
                                 final double ycoord0,
                                 final double zcoord0,
                                 final double xvelocity0,
                                 final double yvelocity0,
                                 final double zvelocity0,
                                 final double xforce0,
                                 final double yforce0,
                                 final double zforce0) {
        
//#line 390
super();
        
//#line 391
xcoord =
          xcoord0;
        
//#line 392
ycoord =
          ycoord0;
        
//#line 393
zcoord =
          zcoord0;
        
//#line 394
xvelocity =
          xvelocity0;
        
//#line 395
yvelocity =
          yvelocity0;
        
//#line 396
zvelocity =
          zvelocity0;
        
//#line 397
xforce =
          xforce0;
        
//#line 398
yforce =
          yforce0;
        
//#line 399
zforce =
          zforce0;
    }
    
    
//#line 401
public void
                   domove(
                   final double side) {
        
//#line 402
xcoord =
          xcoord +
            xvelocity +
            xforce;
        
//#line 403
ycoord =
          ycoord +
            yvelocity +
            yforce;
        
//#line 404
zcoord =
          zcoord +
            zvelocity +
            zforce;
        
//#line 405
if (xcoord <
                           0) {
            
//#line 406
xcoord =
              xcoord +
                side;
        }
        
//#line 408
if (xcoord >
                           side) {
            
//#line 409
xcoord =
              xcoord -
                side;
        }
        
//#line 411
if (ycoord <
                           0) {
            
//#line 412
ycoord =
              ycoord +
                side;
        }
        
//#line 414
if (ycoord >
                           side) {
            
//#line 415
ycoord =
              ycoord -
                side;
        }
        
//#line 417
if (zcoord <
                           0) {
            
//#line 418
zcoord =
              zcoord +
                side;
        }
        
//#line 420
if (zcoord >
                           side) {
            
//#line 421
zcoord =
              zcoord -
                side;
        }
        
//#line 423
xvelocity =
          xvelocity +
            xforce;
        
//#line 424
yvelocity =
          yvelocity +
            yforce;
        
//#line 425
zvelocity =
          zvelocity +
            zforce;
        
//#line 426
xforce =
          0.0;
        
//#line 427
yforce =
          0.0;
        
//#line 428
zforce =
          0.0;
    }
    
    
//#line 430
public void
                   force(
                   final double side,
                   final double rcoff,
                   final int mdsize,
                   final int x,
                   final md md1) {
        
//#line 431
double sideh =
          0.0;
        
//#line 432
double rcoffs =
          0.0;
        
//#line 433
double xx =
          0.0;
        
//#line 434
double yy =
          0.0;
        
//#line 435
double zz =
          0.0;
        
//#line 436
double xi =
          0.0;
        
//#line 437
double yi =
          0.0;
        
//#line 438
double zi =
          0.0;
        
//#line 439
double fxi =
          0.0;
        
//#line 440
double fyi =
          0.0;
        
//#line 441
double fzi =
          0.0;
        
//#line 442
double rd =
          0.0;
        
//#line 443
double rrd =
          0.0;
        
//#line 444
double rrd2 =
          0.0;
        
//#line 445
double rrd3 =
          0.0;
        
//#line 446
double rrd4 =
          0.0;
        
//#line 447
double rrd6 =
          0.0;
        
//#line 448
double rrd7 =
          0.0;
        
//#line 449
double r148 =
          0.0;
        
//#line 450
double forcex =
          0.0;
        
//#line 451
double forcey =
          0.0;
        
//#line 452
double forcez =
          0.0;
        
//#line 453
sideh =
          0.5 *
            side;
        
//#line 454
rcoffs =
          rcoff *
            rcoff;
        
//#line 455
xi =
          xcoord;
        
//#line 456
yi =
          ycoord;
        
//#line 457
zi =
          zcoord;
        
//#line 458
fxi =
          0.0;
        
//#line 459
fyi =
          0.0;
        
//#line 460
fzi =
          0.0;
        
//#line 461
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
                                           x +
                                             1,
                                           mdsize -
                                             1))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 462
xx =
              xi -
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one).get(i))/* } */))/* } */))/* } */.xcoord;
            
//#line 463
yy =
              yi -
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one).get(i))/* } */))/* } */))/* } */.ycoord;
            
//#line 464
zz =
              zi -
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one).get(i))/* } */))/* } */))/* } */.zcoord;
            
//#line 465
if (xx <
                               ((-sideh))) {
                
//#line 466
xx =
                  xx +
                    side;
            }
            
//#line 468
if (xx >
                               ((sideh))) {
                
//#line 469
xx =
                  xx -
                    side;
            }
            
//#line 471
if (yy <
                               ((-sideh))) {
                
//#line 472
yy =
                  yy +
                    side;
            }
            
//#line 474
if (yy >
                               ((sideh))) {
                
//#line 475
yy =
                  yy -
                    side;
            }
            
//#line 477
if (zz <
                               ((-sideh))) {
                
//#line 478
zz =
                  zz +
                    side;
            }
            
//#line 480
if (zz >
                               ((sideh))) {
                
//#line 481
zz =
                  zz -
                    side;
            }
            
//#line 483
rd =
              xx *
                xx +
                yy *
                yy +
                zz *
                zz;
            
//#line 484
if (rd <=
                               rcoffs) {
                
//#line 485
rrd =
                  1.0 /
                    rd;
                
//#line 486
rrd2 =
                  rrd *
                    rrd;
                
//#line 487
rrd3 =
                  rrd2 *
                    rrd;
                
//#line 488
rrd4 =
                  rrd2 *
                    rrd2;
                
//#line 489
rrd6 =
                  rrd2 *
                    rrd4;
                
//#line 490
rrd7 =
                  rrd6 *
                    rrd;
                
//#line 491
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.epot =
                  /* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.epot +
                    ((rrd6 -
                        rrd3));
                
//#line 492
r148 =
                  rrd7 -
                    0.5 *
                    rrd4;
                
//#line 493
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.vir =
                  /* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.vir -
                    rd *
                    r148;
                
//#line 494
forcex =
                  xx *
                    r148;
                
//#line 495
fxi =
                  fxi +
                    forcex;
                
//#line 496
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one).get(i))/* } */))/* } */))/* } */.xforce =
                  /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one).get(i))/* } */))/* } */))/* } */.xforce -
                    forcex;
                
//#line 497
forcey =
                  yy *
                    r148;
                
//#line 498
fyi =
                  fyi +
                    forcey;
                
//#line 499
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one).get(i))/* } */))/* } */))/* } */.yforce =
                  /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one).get(i))/* } */))/* } */))/* } */.yforce -
                    forcey;
                
//#line 500
forcez =
                  zz *
                    r148;
                
//#line 501
fzi =
                  fzi +
                    forcez;
                
//#line 502
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one).get(i))/* } */))/* } */))/* } */.zforce =
                  /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one).get(i))/* } */))/* } */))/* } */.zforce -
                    forcez;
                
//#line 503
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.interactions++;
            }
        }/* } */
        }
        /* } */
        
        
//#line 506
xforce =
          xforce +
            fxi;
        
//#line 507
yforce =
          yforce +
            fyi;
        
//#line 508
zforce =
          zforce +
            fzi;
    }
    
    
//#line 510
public double
                   mkekin(
                   final double hsq2) {
        
//#line 511
double sumt =
          0.0;
        
//#line 512
xforce =
          xforce *
            hsq2;
        
//#line 513
yforce =
          yforce *
            hsq2;
        
//#line 514
zforce =
          zforce *
            hsq2;
        
//#line 515
xvelocity =
          xvelocity +
            xforce;
        
//#line 516
yvelocity =
          yvelocity +
            yforce;
        
//#line 517
zvelocity =
          zvelocity +
            zforce;
        
//#line 518
sumt =
          ((xvelocity *
              xvelocity)) +
            ((yvelocity *
                yvelocity)) +
            ((zvelocity *
                zvelocity));
        
//#line 519
return sumt;
    }
    
    
//#line 521
public double
                   velavg(
                   final double vaverh,
                   final double h,
                   final md md1) {
        
//#line 522
double velt =
          0.0;
        
//#line 523
double sq =
          0.0;
        
//#line 524
sq =
          java.
            lang.
            Math.
            sqrt(
            xvelocity *
              xvelocity +
              yvelocity *
              yvelocity +
              zvelocity *
              zvelocity);
        
//#line 525
if (sq >
                           vaverh) {
            
//#line 526
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.count =
              /* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.count +
                1.0;
        }
        
//#line 528
velt =
          sq;
        
//#line 529
return velt;
    }
    
    
//#line 531
public void
                   dscal(
                   final double sc,
                   final int incx) {
        
//#line 532
xvelocity =
          xvelocity *
            sc;
        
//#line 533
yvelocity =
          yvelocity *
            sc;
        
//#line 534
zvelocity =
          zvelocity *
            sc;
    }
}

class Timer
extends x10.
  lang.
  Object
{
    
//#line 539
final public static int
      max_counters =
      64;
    
//#line 540
private x10.
      lang.
      DoubleReferenceArray
      start_time;
    
//#line 541
private x10.
      lang.
      DoubleReferenceArray
      elapsed_time;
    
//#line 542
private x10.
      lang.
      DoubleReferenceArray
      total_time;
    
    
//#line 543
public Timer() {
        
//#line 543
super();
        
//#line 544
final x10.
          lang.
          dist d =
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
                max_counters)),
            x10.
              lang.
              place.
              FIRST_PLACE);
        
//#line 545
start_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 546
return 0;
           } }
           }/* } */,true,true,false)/* } */);
        
//#line 548
elapsed_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 549
return 0;
           } }
           }/* } */,true,true,false)/* } */);
        
//#line 551
total_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 552
return 0;
           } }
           }/* } */,true,true,false)/* } */);
    }
    
    
//#line 555
public void
                   start(
                   final int n) {
        
//#line 556
/* template:array_set { */(start_time).set(java.
                                                                  lang.
                                                                  System.
                                                                  currentTimeMillis(),n)/* } */;
    }
    
    
//#line 558
public void
                   stop(
                   final int n) {
        
//#line 559
/* template:array_set { */(elapsed_time).set(java.
                                                                    lang.
                                                                    System.
                                                                    currentTimeMillis() -
          /* template:array_get { */((start_time).get(n))/* } */,n)/* } */;
        
//#line 560
/* template:array_set { */(elapsed_time).set(/* template:array_get { */((elapsed_time).get(n))/* } */ /
          1000,n)/* } */;
        
//#line 561
/* template:array_set { */(total_time).set(/* template:array_get { */((total_time).get(n))/* } */ +
          /* template:array_get { */((elapsed_time).get(n))/* } */,n)/* } */;
    }
    
    
//#line 563
public double
                   readTimer(
                   final int n) {
        
//#line 564
return /* template:array_get { */((total_time).get(n))/* } */;
    }
    
    
//#line 566
public void
                   resetTimer(
                   final int n) {
        
//#line 567
/* template:array_set { */(total_time).set(0,n)/* } */;
        
//#line 568
/* template:array_set { */(start_time).set(0,n)/* } */;
        
//#line 569
/* template:array_set { */(elapsed_time).set(0,n)/* } */;
    }
    
    
//#line 571
public void
                   resetAllTimers(
                   ) {
        
//#line 572
int i =
          0;
        
//#line 573
while (i <
                              max_counters) {
            
//#line 574
resetTimer(
                           i);
            
//#line 575
i++;
        }
    }
}
