import x10.lang.*;

public class LinearESOpenPIC2D
extends x10.
  lang.
  Object
{
    
//#line 8
final private static int
      NUMBER_OF_XBITS =
      2;
    
//#line 9
final private static int
      NUMBER_OF_YBITS =
      3;
    
//#line 15
final private static int
      XLENGTH =
      1 <<
      NUMBER_OF_XBITS;
    
//#line 16
final private static int
      YLENGTH =
      1 <<
      NUMBER_OF_YBITS;
    
//#line 24
final private static int
      PARTICLE_XDENSITY =
      4;
    
//#line 25
final private static int
      PARTICLE_YDENSITY =
      8;
    
//#line 26
final private static int
      NPARTICLES =
      PARTICLE_XDENSITY *
      PARTICLE_YDENSITY;
    
//#line 33
final private static double
      DELTA_TIME =
      0.2;
    
//#line 34
final private static double
      ELECTRON_CHARGE =
      -1.0;
    
//#line 35
final private static double
      THERMAL_XVELOCITY =
      1.0;
    
//#line 36
final private static double
      THERMAL_YVELOCITY =
      1.0;
    
//#line 41
final private static int
      BOUNDARY_CONDITION =
      2;
    
//#line 42
final private static int
      TIME_STEPS =
      325;
    
//#line 43
final private static int
      SORT_TIME =
      50;
    
//#line 44
final private static double
      IMBALANCE =
      0.08;
    
//#line 51
final private static int
      MOVE_FIELD_TO_DIST_MAX_ROWS =
      4 *
      YLENGTH /
      x10.
        lang.
        place.
        MAX_PLACES;
    
//#line 56
final private static int
      MOVE_PARTICLES_MAX =
      4 *
      NPARTICLES /
      x10.
        lang.
        place.
        MAX_PLACES;
    
//#line 60
final private static int
      MOVE_PARTICLES_MAX_BUFFER =
      4 *
      NPARTICLES /
      x10.
        lang.
        place.
        MAX_PLACES;
    
//#line 63
final private Random
      r;
    
//#line 64
final private PoissonSolver
      solver;
    
//#line 65
private x10.
      lang.
      GenericReferenceArray
      particles;
    
//#line 66
private x10.
      lang.
      DoubleReferenceArray
      backgroundCharge;
    
//#line 68
private long
      totalTime;
    
//#line 69
private long
      initTime;
    
//#line 70
private long
      depositTime;
    
//#line 71
private long
      redistTime;
    
//#line 72
private long
      solverTime;
    
//#line 73
private long
      pushTime;
    
//#line 74
private long
      moveTime;
    
    
//#line 76
public LinearESOpenPIC2D() {
        
//#line 76
super();
        
//#line 77
r =
          new Random(
            );
        
//#line 78
double affp =
          ((((XLENGTH -
                2.0)) *
              ((YLENGTH -
                  2.0)))) /
          NPARTICLES;
        
//#line 79
solver =
          new PoissonSolver(
            NUMBER_OF_XBITS,
            NUMBER_OF_YBITS,
            affp);
        
//#line 81
totalTime =
          0;
        
//#line 82
initTime =
          0;
        
//#line 83
depositTime =
          0;
        
//#line 84
redistTime =
          0;
        
//#line 85
pushTime =
          0;
        
//#line 86
moveTime =
          0;
    }
    
    
//#line 90
public void
                  run(
                  ) {
        
//#line 91
totalTime =
          java.
            lang.
            System.
            currentTimeMillis();
        
//#line 93
initTime =
          java.
            lang.
            System.
            currentTimeMillis();
        
//#line 94
initialize();
        
//#line 95
initTime =
          java.
            lang.
            System.
            currentTimeMillis() -
            initTime;
        
//#line 97
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
                                           TIME_STEPS -
                                             1))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 98
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                        lang.
                                                                                                        System.
                                                                                                        out))/* } */.println("T = " +
                                                                                                                             /* template:array_get { */((i).get(0))/* } */);
            
//#line 99
final x10.
              lang.
              DoubleReferenceArray e =
              stepTime(
                backgroundCharge);
            
//#line 100
if (/* template:array_get { */((i).get(0))/* } */ %
                               SORT_TIME ==
                               0) {
                
//#line 101
long time =
                  java.
                    lang.
                    System.
                    currentTimeMillis();
                
//#line 102
sortParticles(
                               particles,
                               backgroundCharge.
                                 distribution);
                
//#line 103
moveTime =
                  moveTime +
                    ((java.
                        lang.
                        System.
                        currentTimeMillis() -
                        time));
            }
            
//#line 105
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("field, kinetic, total energies = " +
                                                                                                                              /* template:array_get { */((e).get(0))/* } */ +
                                                                                                                              "," +
                                                                                                                              /* template:array_get { */((e).get(1))/* } */ +
                                                                                                                              "," +
                                                                                                                              /* template:array_get { */((e).get(2))/* } */);
            
//#line 108
if (/* template:array_get { */((i).get(0))/* } */ ==
                               TIME_STEPS -
                               1) {
                
//#line 109
final x10.
                  lang.
                  dist dRef =
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
                
//#line 110
final x10.
                  lang.
                  DoubleReferenceArray ref =
                  /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dRef,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
                
//#line 111
if (NUMBER_OF_XBITS ==
                                   2 &&
                                   NUMBER_OF_YBITS ==
                                   3 &&
                                   PARTICLE_XDENSITY ==
                                   4 &&
                                   PARTICLE_YDENSITY ==
                                   8) {
                    
//#line 115
/* template:array_set { */(ref).set(0.009936711552799253,0)/* } */;
                    
//#line 116
/* template:array_set { */(ref).set(35.7904959849017,1)/* } */;
                    
//#line 117
/* template:array_set { */(ref).set(35.8004326964545,2)/* } */;
                    
//#line 118
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                 lang.
                                                                                                                 System.
                                                                                                                 out))/* } */.println("final field energy diff = " +
                                                                                                                                      ((java.
                                                                                                                                          lang.
                                                                                                                                          Math.
                                                                                                                                          abs(
                                                                                                                                          /* template:array_get { */((ref).get(0))/* } */ -
                                                                                                                                            /* template:array_get { */((e).get(0))/* } */))));
                    
//#line 120
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                 lang.
                                                                                                                 System.
                                                                                                                 out))/* } */.println("final kinetic energy diff = " +
                                                                                                                                      ((java.
                                                                                                                                          lang.
                                                                                                                                          Math.
                                                                                                                                          abs(
                                                                                                                                          /* template:array_get { */((ref).get(1))/* } */ -
                                                                                                                                            /* template:array_get { */((e).get(1))/* } */))));
                    
//#line 122
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                 lang.
                                                                                                                 System.
                                                                                                                 out))/* } */.println("final final energy diff = " +
                                                                                                                                      ((java.
                                                                                                                                          lang.
                                                                                                                                          Math.
                                                                                                                                          abs(
                                                                                                                                          /* template:array_get { */((ref).get(2))/* } */ -
                                                                                                                                            /* template:array_get { */((e).get(2))/* } */))));
                } else {
                    
//#line 124
if (NUMBER_OF_XBITS ==
                                       3 &&
                                       NUMBER_OF_YBITS ==
                                       4 &&
                                       PARTICLE_XDENSITY ==
                                       8 &&
                                       PARTICLE_YDENSITY ==
                                       16) {
                        
//#line 129
/* template:array_set { */(ref).set(1.12911030199718,0)/* } */;
                        
//#line 130
/* template:array_set { */(ref).set(138.01404855563126,1)/* } */;
                        
//#line 131
/* template:array_set { */(ref).set(139.14315885762844,2)/* } */;
                        
//#line 132
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                     lang.
                                                                                                                     System.
                                                                                                                     out))/* } */.println("final field energy diff = " +
                                                                                                                                          ((java.
                                                                                                                                              lang.
                                                                                                                                              Math.
                                                                                                                                              abs(
                                                                                                                                              /* template:array_get { */((ref).get(0))/* } */ -
                                                                                                                                                /* template:array_get { */((e).get(0))/* } */))));
                        
//#line 134
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                     lang.
                                                                                                                     System.
                                                                                                                     out))/* } */.println("final kinetic energy diff = " +
                                                                                                                                          ((java.
                                                                                                                                              lang.
                                                                                                                                              Math.
                                                                                                                                              abs(
                                                                                                                                              /* template:array_get { */((ref).get(1))/* } */ -
                                                                                                                                                /* template:array_get { */((e).get(1))/* } */))));
                        
//#line 136
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                     lang.
                                                                                                                     System.
                                                                                                                     out))/* } */.println("final final energy diff = " +
                                                                                                                                          ((java.
                                                                                                                                              lang.
                                                                                                                                              Math.
                                                                                                                                              abs(
                                                                                                                                              /* template:array_get { */((ref).get(2))/* } */ -
                                                                                                                                                /* template:array_get { */((e).get(2))/* } */))));
                    } else {
                        
//#line 139
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                     lang.
                                                                                                                     System.
                                                                                                                     out))/* } */.println("No reference values availabile");
                    }
                }
            }
        }/* } */
        }
        /* } */
        
        
//#line 143
totalTime =
          java.
            lang.
            System.
            currentTimeMillis() -
            totalTime;
        
//#line 145
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Total time (ms): " +
                                                                                                                          totalTime);
        
//#line 146
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Initialization time (ms): " +
                                                                                                                          initTime +
                                                                                                                          " " +
                                                                                                                          ((100.0 *
                                                                                                                              initTime)) /
                                                                                                                            totalTime);
        
//#line 148
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Particle Deposit time (ms): " +
                                                                                                                          depositTime +
                                                                                                                          " " +
                                                                                                                          ((100.0 *
                                                                                                                              depositTime)) /
                                                                                                                            totalTime);
        
//#line 150
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Field Redistribution time (ms): " +
                                                                                                                          redistTime +
                                                                                                                          " " +
                                                                                                                          ((100.0 *
                                                                                                                              redistTime)) /
                                                                                                                            totalTime);
        
//#line 152
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Solver time (ms): " +
                                                                                                                          solverTime +
                                                                                                                          " " +
                                                                                                                          ((100.0 *
                                                                                                                              solverTime)) /
                                                                                                                            totalTime);
        
//#line 154
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Particle Push time (ms): " +
                                                                                                                          pushTime +
                                                                                                                          " " +
                                                                                                                          ((100.0 *
                                                                                                                              pushTime)) /
                                                                                                                            totalTime);
        
//#line 156
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Particle move time (ms): " +
                                                                                                                          moveTime +
                                                                                                                          " " +
                                                                                                                          ((100.0 *
                                                                                                                              moveTime)) /
                                                                                                                            totalTime);
    }
    
    
//#line 166
public void
                   initialize(
                   ) {
        
//#line 169
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Init: particle position");
        
//#line 170
final x10.
          lang.
          DoubleReferenceArray position =
          genParticlePosition(
            NPARTICLES);
        
//#line 171
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Init: particle velocity");
        
//#line 172
final x10.
          lang.
          DoubleReferenceArray velocity =
          genParticleVelocity(
            NPARTICLES);
        
//#line 173
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Init: particles");
        
//#line 174
particles =
          genParticles(
            NPARTICLES,
            position,
            velocity);
        
//#line 177
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Init: initial field distribution");
        
//#line 178
final x10.
          lang.
          dist dField =
          genInitialDist(
            particles);
        
//#line 181
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Init: initial partical distribution");
        
//#line 182
final x10.
          lang.
          IntReferenceArray info =
          makeInfoArray();
        
//#line 183
particles =
          moveParticles(
            particles,
            dField,
            info);
        
//#line 185
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Init: background charge");
        
//#line 186
backgroundCharge =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dField,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 187
final x10.
          lang.
          DoubleReferenceArray backgroundGuards =
          makeGuards(
            dField);
        
//#line 189
depositCharge(
                       particles,
                       backgroundCharge,
                       backgroundGuards,
                       java.
                         lang.
                         Math.
                         abs(
                         ELECTRON_CHARGE));
        
//#line 191
addGuards(
                       backgroundCharge,
                       backgroundGuards);
    }
    
    
//#line 200
public x10.
                   lang.
                   DoubleReferenceArray
                   genParticlePosition(
                   final int np) {
        
//#line 201
final int X =
          0;
        
//#line 202
final int Y =
          1;
        
//#line 203
final int MAX_PLACES =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 204
final int MAX_ITER =
          20;
        
//#line 205
final double ERROR =
          1.0E-4;
        
//#line 206
final double BIG =
          0.5;
        
//#line 208
final x10.
          lang.
          dist dResult =
          X10Util.
            distBlockStar2(
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
                np -
                  1)),
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
                1)));
        
//#line 209
final x10.
          lang.
          DoubleReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dResult,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 211
final int particlesPerPlace =
          ((PARTICLE_XDENSITY *
              PARTICLE_YDENSITY)) /
          MAX_PLACES;
        
//#line 213
final int totalParticles =
          particlesPerPlace *
          MAX_PLACES;
        
//#line 215
if (totalParticles !=
                           NPARTICLES) {
            
//#line 216
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         err))/* } */.println("Particle distribution truncated, " +
                                                                                                                              "total particles = " +
                                                                                                                              totalParticles);
            
//#line 218
return result;
        }
        
//#line 222
final double edgelx =
          ((BOUNDARY_CONDITION ==
              2 ||
              BOUNDARY_CONDITION ==
              3))
          ? 1.0
          : 0.0;
        
//#line 224
final double edgely =
          ((BOUNDARY_CONDITION ==
              2))
          ? 1.0
          : 0.0;
        
//#line 227
double tx0 =
          linearDensityFnIntegral(
            edgelx,
            0.0,
            0.0,
            0.0);
        
//#line 228
double ty0 =
          linearDensityFnIntegral(
            edgely,
            0.0,
            0.0,
            0.0);
        
//#line 230
final double anx =
          XLENGTH -
          edgelx;
        
//#line 231
final double any =
          YLENGTH -
          edgely;
        
//#line 232
final double bnx =
          PARTICLE_XDENSITY /
          ((linearDensityFnIntegral(
              anx,
              0.0,
              0.0,
              0.0) -
              tx0));
        
//#line 234
final double bny =
          PARTICLE_YDENSITY /
          ((linearDensityFnIntegral(
              any,
              0.0,
              0.0,
              0.0) -
              ty0));
        
//#line 236
final double x0 =
          bnx *
          tx0 -
          0.5;
        
//#line 237
final double y0 =
          bny *
          ty0 -
          0.5;
        
//#line 240
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 240
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 241
final x10.
                  lang.
                  region rLocal =
                  X10Util.
                    getLRank2D(
                    dResult,
                    0);
                
//#line 242
final int offset =
                  rLocal.
                    low();
                
//#line 243
final int koff =
                  particlesPerPlace *
                  /* template:array_get { */((pl).get(0))/* } */;
                
//#line 244
final int noff =
                  offset;
                
//#line 247
int kc =
                  koff /
                  PARTICLE_XDENSITY;
                
//#line 248
double yt0 =
                  edgely;
                
//#line 249
double yt =
                  yt0 +
                  0.5 /
                  ((bny *
                      linearDensityFn(
                        yt0,
                        0.0,
                        0.0,
                        0.0)));
                
//#line 250
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
                                                   kc -
                                                     1))).iterator(); k__.hasNext(); ) {
                	final  x10.
                  lang.
                  point k = (x10.
                  lang.
                  point) k__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 251
double yn =
                      /* template:array_get { */((k).get(0))/* } */ +
                      y0 +
                      1;
                    
//#line 254
if (/* template:array_get { */((k).get(0))/* } */ >
                                       0) {
                        
//#line 255
yt =
                          yt +
                            ((1.0 /
                                ((bny *
                                    linearDensityFn(
                                      yt,
                                      0.0,
                                      0.0,
                                      0.0)))));
                    }
                    
//#line 257
yt =
                      X10Util.
                        maxDouble(
                        edgely,
                        X10Util.
                          minDouble(
                          yt,
                          any));
                    
//#line 259
double f =
                      bny *
                      linearDensityFnIntegral(
                        yt,
                        0.0,
                        0.0,
                        0.0) -
                      yn;
                    
//#line 260
double absf =
                      java.
                        lang.
                        Math.
                        abs(
                        f);
                    
//#line 261
int i =
                      0;
                    
//#line 262
while (absf >=
                                          ERROR) {
                        
//#line 263
if (absf <
                                           BIG) {
                            
//#line 265
double fp =
                              bny *
                              linearDensityFn(
                                yt,
                                0.0,
                                0.0,
                                0.0);
                            
//#line 266
yt0 =
                              yt;
                            
//#line 267
yt =
                              X10Util.
                                maxDouble(
                                edgely,
                                X10Util.
                                  minDouble(
                                  yt -
                                    f /
                                    fp,
                                  any));
                        } else {
                            
//#line 270
if (f >
                                               0.0) {
                                
//#line 272
yt =
                                  yt0 +
                                    ((0.5 *
                                        ((yt -
                                            yt0))));
                            } else {
                                
//#line 274
yt =
                                  yt +
                                    yt -
                                    yt0;
                            }
                        }
                        
//#line 277
if (i >=
                                           MAX_ITER) {
                            
//#line 278
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                         lang.
                                                                                                                         System.
                                                                                                                         err))/* } */.println("1: Newton iteration max exceeded");
                            
//#line 279
break;
                        } else {
                            
//#line 281
f =
                              bny *
                                linearDensityFnIntegral(
                                  yt,
                                  0.0,
                                  0.0,
                                  0.0) -
                                yn;
                            
//#line 282
absf =
                              java.
                                lang.
                                Math.
                                abs(
                                f);
                        }
                        
//#line 284
i++;
                    }
                    
//#line 286
yt0 =
                      yt;
                }/* } */
                }
                /* } */
                
                
//#line 290
int jc =
                  koff -
                  PARTICLE_XDENSITY *
                  kc;
                
//#line 291
double xt0 =
                  edgelx;
                
//#line 292
double xt =
                  xt0 +
                  0.5 /
                  ((bnx *
                      linearDensityFn(
                        xt0,
                        0.0,
                        0.0,
                        0.0)));
                
//#line 293
/* template:forloop { */
                for (java.util.Iterator j__ = (x10.
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
                                                   jc -
                                                     1))).iterator(); j__.hasNext(); ) {
                	final  x10.
                  lang.
                  point j = (x10.
                  lang.
                  point) j__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 294
double xn =
                      /* template:array_get { */((j).get(0))/* } */ +
                      x0 +
                      1;
                    
//#line 295
if (/* template:array_get { */((j).get(0))/* } */ >
                                       0) {
                        
//#line 296
xt =
                          xt +
                            ((1.0 /
                                ((bnx *
                                    linearDensityFn(
                                      xt,
                                      0.0,
                                      0.0,
                                      0.0)))));
                    }
                    
//#line 298
xt =
                      X10Util.
                        maxDouble(
                        edgelx,
                        X10Util.
                          minDouble(
                          xt,
                          anx));
                    
//#line 300
double f =
                      bnx *
                      linearDensityFnIntegral(
                        xt,
                        0.0,
                        0.0,
                        0.0) -
                      xn;
                    
//#line 301
double absf =
                      java.
                        lang.
                        Math.
                        abs(
                        f);
                    
//#line 302
int i =
                      0;
                    
//#line 303
while (absf >=
                                          ERROR) {
                        
//#line 304
if (absf <
                                           BIG) {
                            
//#line 306
double fp =
                              bnx *
                              linearDensityFn(
                                xt,
                                0.0,
                                0.0,
                                0.0);
                            
//#line 307
xt0 =
                              xt;
                            
//#line 308
xt =
                              X10Util.
                                maxDouble(
                                edgelx,
                                X10Util.
                                  minDouble(
                                  xt -
                                    f /
                                    fp,
                                  anx));
                        } else {
                            
//#line 311
if (f >
                                               0.0) {
                                
//#line 313
xt =
                                  xt0 +
                                    0.5 *
                                    ((xt -
                                        xt0));
                            } else {
                                
//#line 315
xt =
                                  xt +
                                    xt -
                                    xt0;
                            }
                        }
                        
//#line 318
if (i >=
                                           MAX_ITER) {
                            
//#line 319
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                         lang.
                                                                                                                         System.
                                                                                                                         err))/* } */.println("2: Newton iteration max exceeded");
                            
//#line 320
break;
                        } else {
                            
//#line 322
f =
                              bnx *
                                linearDensityFnIntegral(
                                  xt,
                                  0.0,
                                  0.0,
                                  0.0) -
                                xn;
                            
//#line 323
absf =
                              java.
                                lang.
                                Math.
                                abs(
                                f);
                        }
                        
//#line 325
i++;
                    }
                    
//#line 327
xt0 =
                      xt;
                }/* } */
                }
                /* } */
                
                
//#line 329
kc++;
                
//#line 332
/* template:forloop-mult { */{
                x10.lang.region __var84__ = (x10.lang.region) x10.
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
                                                                  X10Util.
                                                                    minInt(
                                                                    particlesPerPlace,
                                                                    PARTICLE_XDENSITY) -
                                                                    1));
                if (__var84__.size() > 0 && (__var84__ instanceof x10.array.MultiDimRegion || __var84__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var85__ = __var84__.rank(0).low(), __var86__ = __var84__.rank(0).high(); __var85__ <= __var86__; __var85__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int n = __var85__;
                /* } */
                /* } */
{
                    
//#line 334
int nn =
                      n +
                      koff;
                    
//#line 335
int k =
                      nn /
                      PARTICLE_XDENSITY;
                    
//#line 336
int j =
                      nn %
                      PARTICLE_XDENSITY;
                    
//#line 337
double xn =
                      j +
                      x0 +
                      1;
                    
//#line 340
if (j ==
                                       0) {
                        
//#line 341
xt0 =
                          edgelx;
                        
//#line 342
xt =
                          xt0 +
                            0.5 /
                            ((bnx *
                                linearDensityFn(
                                  xt0,
                                  0.0,
                                  0.0,
                                  0.0)));
                    } else {
                        
//#line 344
xt =
                          xt +
                            ((1.0 /
                                ((bnx *
                                    linearDensityFn(
                                      xt,
                                      0.0,
                                      0.0,
                                      0.0)))));
                    }
                    
//#line 346
xt =
                      X10Util.
                        maxDouble(
                        edgelx,
                        X10Util.
                          minDouble(
                          xt,
                          anx));
                    
//#line 348
double f =
                      bnx *
                      linearDensityFnIntegral(
                        xt0,
                        0.0,
                        0.0,
                        0.0) -
                      xn;
                    
//#line 349
double absf =
                      java.
                        lang.
                        Math.
                        abs(
                        f);
                    
//#line 350
int i =
                      0;
                    
//#line 351
while (absf >=
                                          ERROR) {
                        
//#line 352
if (absf <
                                           BIG) {
                            
//#line 354
double fp =
                              bnx *
                              linearDensityFn(
                                xt,
                                0.0,
                                0.0,
                                0.0);
                            
//#line 355
xt0 =
                              xt;
                            
//#line 356
xt =
                              X10Util.
                                maxDouble(
                                edgelx,
                                X10Util.
                                  minDouble(
                                  xt -
                                    f /
                                    fp,
                                  anx));
                        } else {
                            
//#line 359
if (f >
                                               0.0) {
                                
//#line 361
xt =
                                  xt0 +
                                    0.5 *
                                    ((xt -
                                        xt0));
                            } else {
                                
//#line 363
xt =
                                  xt +
                                    xt -
                                    xt0;
                            }
                        }
                        
//#line 366
if (i >=
                                           MAX_ITER) {
                            
//#line 367
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                         lang.
                                                                                                                         System.
                                                                                                                         err))/* } */.println("3: Newton iteration max exceeded");
                            
//#line 368
break;
                        } else {
                            
//#line 370
f =
                              bnx *
                                linearDensityFnIntegral(
                                  xt,
                                  0.0,
                                  0.0,
                                  0.0) -
                                xn;
                            
//#line 371
absf =
                              java.
                                lang.
                                Math.
                                abs(
                                f);
                        }
                        
//#line 373
i++;
                    }
                    
//#line 375
/* template:array_set { */(result).set(xt,/* Join: { */n +
                      noff,X/* } */)/* } */;
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var0____ = (__var84__).iterator(); __var0____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var0__ = (x10.
                  lang.
                  point) __var0____.next();
                	/* Join: { *//* Join: { */final int n =
                  /* template:array_get { */((__var0__).get(0))/* } */;/* } */
{
                    
//#line 334
int nn =
                      n +
                      koff;
                    
//#line 335
int k =
                      nn /
                      PARTICLE_XDENSITY;
                    
//#line 336
int j =
                      nn %
                      PARTICLE_XDENSITY;
                    
//#line 337
double xn =
                      j +
                      x0 +
                      1;
                    
//#line 340
if (j ==
                                       0) {
                        
//#line 341
xt0 =
                          edgelx;
                        
//#line 342
xt =
                          xt0 +
                            0.5 /
                            ((bnx *
                                linearDensityFn(
                                  xt0,
                                  0.0,
                                  0.0,
                                  0.0)));
                    } else {
                        
//#line 344
xt =
                          xt +
                            ((1.0 /
                                ((bnx *
                                    linearDensityFn(
                                      xt,
                                      0.0,
                                      0.0,
                                      0.0)))));
                    }
                    
//#line 346
xt =
                      X10Util.
                        maxDouble(
                        edgelx,
                        X10Util.
                          minDouble(
                          xt,
                          anx));
                    
//#line 348
double f =
                      bnx *
                      linearDensityFnIntegral(
                        xt0,
                        0.0,
                        0.0,
                        0.0) -
                      xn;
                    
//#line 349
double absf =
                      java.
                        lang.
                        Math.
                        abs(
                        f);
                    
//#line 350
int i =
                      0;
                    
//#line 351
while (absf >=
                                          ERROR) {
                        
//#line 352
if (absf <
                                           BIG) {
                            
//#line 354
double fp =
                              bnx *
                              linearDensityFn(
                                xt,
                                0.0,
                                0.0,
                                0.0);
                            
//#line 355
xt0 =
                              xt;
                            
//#line 356
xt =
                              X10Util.
                                maxDouble(
                                edgelx,
                                X10Util.
                                  minDouble(
                                  xt -
                                    f /
                                    fp,
                                  anx));
                        } else {
                            
//#line 359
if (f >
                                               0.0) {
                                
//#line 361
xt =
                                  xt0 +
                                    0.5 *
                                    ((xt -
                                        xt0));
                            } else {
                                
//#line 363
xt =
                                  xt +
                                    xt -
                                    xt0;
                            }
                        }
                        
//#line 366
if (i >=
                                           MAX_ITER) {
                            
//#line 367
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                         lang.
                                                                                                                         System.
                                                                                                                         err))/* } */.println("3: Newton iteration max exceeded");
                            
//#line 368
break;
                        } else {
                            
//#line 370
f =
                              bnx *
                                linearDensityFnIntegral(
                                  xt,
                                  0.0,
                                  0.0,
                                  0.0) -
                                xn;
                            
//#line 371
absf =
                              java.
                                lang.
                                Math.
                                abs(
                                f);
                        }
                        
//#line 373
i++;
                    }
                    
//#line 375
/* template:array_set { */(result).set(xt,/* Join: { */n +
                      noff,X/* } */)/* } */;
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
                
//#line 378
/* template:forloop-mult { */{
                x10.lang.region __var87__ = (x10.lang.region) x10.
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
                                                                  particlesPerPlace -
                                                                    1));
                if (__var87__.size() > 0 && (__var87__ instanceof x10.array.MultiDimRegion || __var87__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var88__ = __var87__.rank(0).low(), __var89__ = __var87__.rank(0).high(); __var88__ <= __var89__; __var88__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int n = __var88__;
                /* } */
                /* } */
{
                    
//#line 379
int nn =
                      n +
                      koff;
                    
//#line 380
int k =
                      nn /
                      PARTICLE_XDENSITY +
                      1;
                    
//#line 381
int j =
                      nn -
                      PARTICLE_XDENSITY *
                      k;
                    
//#line 383
nn =
                      n %
                        PARTICLE_XDENSITY;
                    
//#line 385
if (k ==
                                       kc) {
                        
//#line 386
double yn =
                          k +
                          y0;
                        
//#line 387
if (k >
                                           1) {
                            
//#line 388
yt =
                              yt +
                                ((1.0 /
                                    ((bny *
                                        linearDensityFn(
                                          yt,
                                          0.0,
                                          0.0,
                                          0.0)))));
                        }
                        
//#line 390
yt =
                          X10Util.
                            maxDouble(
                            edgelx,
                            X10Util.
                              minDouble(
                              yt,
                              any));
                        
//#line 392
double f =
                          bny *
                          linearDensityIntegral(
                            yt,
                            0.0,
                            0.0,
                            0.0) -
                          yn;
                        
//#line 393
double absf =
                          java.
                            lang.
                            Math.
                            abs(
                            f);
                        
//#line 394
int i =
                          0;
                        
//#line 395
while (absf >=
                                              ERROR) {
                            
//#line 396
if (absf <
                                               BIG) {
                                
//#line 398
double fp =
                                  bny *
                                  linearDensityFn(
                                    yt,
                                    0.0,
                                    0.0,
                                    0.0);
                                
//#line 399
yt0 =
                                  yt;
                                
//#line 400
yt =
                                  X10Util.
                                    maxDouble(
                                    edgely,
                                    X10Util.
                                      minDouble(
                                      yt -
                                        f /
                                        fp,
                                      any));
                            } else {
                                
//#line 403
if (f >
                                                   0.0) {
                                    
//#line 405
yt =
                                      yt0 +
                                        0.5 *
                                        ((yt -
                                            yt0));
                                } else {
                                    
//#line 407
yt =
                                      yt +
                                        yt -
                                        yt0;
                                }
                            }
                            
//#line 410
if (i >=
                                               MAX_ITER) {
                                
//#line 411
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                             lang.
                                                                                                                             System.
                                                                                                                             err))/* } */.println("4: Newton iteration max exceeded");
                                
//#line 412
break;
                            } else {
                                
//#line 414
f =
                                  bny *
                                    linearDensityFnIntegral(
                                      yt,
                                      0.0,
                                      0.0,
                                      0.0) -
                                    yn;
                                
//#line 415
absf =
                                  java.
                                    lang.
                                    Math.
                                    abs(
                                    f);
                            }
                            
//#line 417
i++;
                        }
                        
//#line 419
kc++;
                        
//#line 420
yt0 =
                          yt;
                    }
                    
//#line 422
/* template:array_set { */(result).set(/* template:array_get { */((result).get(/* Join: { */nn +
                      noff,X/* } */))/* } */,/* Join: { */n +
                      noff,X/* } */)/* } */;
                    
//#line 423
/* template:array_set { */(result).set(yt,/* Join: { */n +
                      noff,Y/* } */)/* } */;
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var1____ = (__var87__).iterator(); __var1____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var1__ = (x10.
                  lang.
                  point) __var1____.next();
                	/* Join: { *//* Join: { */final int n =
                  /* template:array_get { */((__var1__).get(0))/* } */;/* } */
{
                    
//#line 379
int nn =
                      n +
                      koff;
                    
//#line 380
int k =
                      nn /
                      PARTICLE_XDENSITY +
                      1;
                    
//#line 381
int j =
                      nn -
                      PARTICLE_XDENSITY *
                      k;
                    
//#line 383
nn =
                      n %
                        PARTICLE_XDENSITY;
                    
//#line 385
if (k ==
                                       kc) {
                        
//#line 386
double yn =
                          k +
                          y0;
                        
//#line 387
if (k >
                                           1) {
                            
//#line 388
yt =
                              yt +
                                ((1.0 /
                                    ((bny *
                                        linearDensityFn(
                                          yt,
                                          0.0,
                                          0.0,
                                          0.0)))));
                        }
                        
//#line 390
yt =
                          X10Util.
                            maxDouble(
                            edgelx,
                            X10Util.
                              minDouble(
                              yt,
                              any));
                        
//#line 392
double f =
                          bny *
                          linearDensityIntegral(
                            yt,
                            0.0,
                            0.0,
                            0.0) -
                          yn;
                        
//#line 393
double absf =
                          java.
                            lang.
                            Math.
                            abs(
                            f);
                        
//#line 394
int i =
                          0;
                        
//#line 395
while (absf >=
                                              ERROR) {
                            
//#line 396
if (absf <
                                               BIG) {
                                
//#line 398
double fp =
                                  bny *
                                  linearDensityFn(
                                    yt,
                                    0.0,
                                    0.0,
                                    0.0);
                                
//#line 399
yt0 =
                                  yt;
                                
//#line 400
yt =
                                  X10Util.
                                    maxDouble(
                                    edgely,
                                    X10Util.
                                      minDouble(
                                      yt -
                                        f /
                                        fp,
                                      any));
                            } else {
                                
//#line 403
if (f >
                                                   0.0) {
                                    
//#line 405
yt =
                                      yt0 +
                                        0.5 *
                                        ((yt -
                                            yt0));
                                } else {
                                    
//#line 407
yt =
                                      yt +
                                        yt -
                                        yt0;
                                }
                            }
                            
//#line 410
if (i >=
                                               MAX_ITER) {
                                
//#line 411
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                             lang.
                                                                                                                             System.
                                                                                                                             err))/* } */.println("4: Newton iteration max exceeded");
                                
//#line 412
break;
                            } else {
                                
//#line 414
f =
                                  bny *
                                    linearDensityFnIntegral(
                                      yt,
                                      0.0,
                                      0.0,
                                      0.0) -
                                    yn;
                                
//#line 415
absf =
                                  java.
                                    lang.
                                    Math.
                                    abs(
                                    f);
                            }
                            
//#line 417
i++;
                        }
                        
//#line 419
kc++;
                        
//#line 420
yt0 =
                          yt;
                    }
                    
//#line 422
/* template:array_set { */(result).set(/* template:array_get { */((result).get(/* Join: { */nn +
                      noff,X/* } */))/* } */,/* Join: { */n +
                      noff,X/* } */)/* } */;
                    
//#line 423
/* template:array_set { */(result).set(yt,/* Join: { */n +
                      noff,Y/* } */)/* } */;
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp83) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp83);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 426
return result;
    }
    
    
//#line 432
public x10.
                   lang.
                   DoubleReferenceArray
                   genParticleVelocity(
                   final int n) {
        
//#line 433
final int X =
          0;
        
//#line 434
final int Y =
          1;
        
//#line 435
final x10.
          lang.
          dist dResult =
          X10Util.
            distBlockStar2(
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
                n -
                  1)),
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
                1)));
        
//#line 436
final x10.
          lang.
          DoubleReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dResult,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 439
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 441
/* template:forloop-mult { */{
            x10.lang.region __var91__ = (x10.lang.region) x10.
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
                                                              PARTICLE_YDENSITY -
                                                                1));
            if (__var91__.size() > 0 && (__var91__ instanceof x10.array.MultiDimRegion || __var91__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var92__ = __var91__.rank(0).low(), __var93__ = __var91__.rank(0).high(); __var92__ <= __var93__; __var92__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var92__;
            /* } */
            /* } */
{
                
//#line 442
final int offset =
                  PARTICLE_XDENSITY *
                  i;
                
//#line 445
/* template:forloop-mult { */{
                x10.lang.region __var94__ = (x10.lang.region) x10.
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
                                                                  PARTICLE_XDENSITY -
                                                                    1));
                if (__var94__.size() > 0 && (__var94__ instanceof x10.array.MultiDimRegion || __var94__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var95__ = __var94__.rank(0).low(), __var96__ = __var94__.rank(0).high(); __var95__ <= __var96__; __var95__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var95__;
                /* } */
                /* } */
{
                    
//#line 446
final int idx =
                      j +
                      offset;
                    
//#line 447
final double vx =
                      THERMAL_XVELOCITY *
                      /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(r))/* } */.nextNormal();
                    
//#line 448
final double vy =
                      THERMAL_YVELOCITY *
                      /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(r))/* } */.nextNormal();
                    
//#line 450
/* template:Async { */(x10.lang.Runtime.asPlace(dResult.
                                                                                   get(
                                                                                   idx,
                                                                                   0))).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 451
/* template:array_set { */(result).set(vx,/* Join: { */idx,X/* } */)/* } */;
                        
//#line 452
/* template:array_set { */(result).set(vy,/* Join: { */idx,Y/* } */)/* } */;
                    }
                    		}
                    	});/* } */
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var3____ = (__var94__).iterator(); __var3____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var3__ = (x10.
                  lang.
                  point) __var3____.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                    
//#line 446
final int idx =
                      j +
                      offset;
                    
//#line 447
final double vx =
                      THERMAL_XVELOCITY *
                      /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(r))/* } */.nextNormal();
                    
//#line 448
final double vy =
                      THERMAL_YVELOCITY *
                      /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(r))/* } */.nextNormal();
                    
//#line 450
/* template:Async { */(x10.lang.Runtime.asPlace(dResult.
                                                                                   get(
                                                                                   idx,
                                                                                   0))).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 451
/* template:array_set { */(result).set(vx,/* Join: { */idx,X/* } */)/* } */;
                        
//#line 452
/* template:array_set { */(result).set(vy,/* Join: { */idx,Y/* } */)/* } */;
                    }
                    		}
                    	});/* } */
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
            for (java.util.Iterator __var2____ = (__var91__).iterator(); __var2____.hasNext(); ) {
            	final  x10.
              lang.
              point __var2__ = (x10.
              lang.
              point) __var2____.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var2__).get(0))/* } */;/* } */
{
                
//#line 442
final int offset =
                  PARTICLE_XDENSITY *
                  i;
                
//#line 445
/* template:forloop-mult { */{
                x10.lang.region __var97__ = (x10.lang.region) x10.
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
                                                                  PARTICLE_XDENSITY -
                                                                    1));
                if (__var97__.size() > 0 && (__var97__ instanceof x10.array.MultiDimRegion || __var97__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var98__ = __var97__.rank(0).low(), __var99__ = __var97__.rank(0).high(); __var98__ <= __var99__; __var98__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var98__;
                /* } */
                /* } */
{
                    
//#line 446
final int idx =
                      j +
                      offset;
                    
//#line 447
final double vx =
                      THERMAL_XVELOCITY *
                      /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(r))/* } */.nextNormal();
                    
//#line 448
final double vy =
                      THERMAL_YVELOCITY *
                      /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(r))/* } */.nextNormal();
                    
//#line 450
/* template:Async { */(x10.lang.Runtime.asPlace(dResult.
                                                                                   get(
                                                                                   idx,
                                                                                   0))).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 451
/* template:array_set { */(result).set(vx,/* Join: { */idx,X/* } */)/* } */;
                        
//#line 452
/* template:array_set { */(result).set(vy,/* Join: { */idx,Y/* } */)/* } */;
                    }
                    		}
                    	});/* } */
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var3____ = (__var97__).iterator(); __var3____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var3__ = (x10.
                  lang.
                  point) __var3____.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                    
//#line 446
final int idx =
                      j +
                      offset;
                    
//#line 447
final double vx =
                      THERMAL_XVELOCITY *
                      /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(r))/* } */.nextNormal();
                    
//#line 448
final double vy =
                      THERMAL_YVELOCITY *
                      /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(r))/* } */.nextNormal();
                    
//#line 450
/* template:Async { */(x10.lang.Runtime.asPlace(dResult.
                                                                                   get(
                                                                                   idx,
                                                                                   0))).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 451
/* template:array_set { */(result).set(vx,/* Join: { */idx,X/* } */)/* } */;
                        
//#line 452
/* template:array_set { */(result).set(vy,/* Join: { */idx,Y/* } */)/* } */;
                    }
                    		}
                    	});/* } */
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
            
        }
        	} catch (Throwable tmp90) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp90);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 458
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Init: correcting drift");
        
//#line 460
final x10.
          lang.
          dist dUnique =
          (x10.
            lang.
            dist)
            x10.
              lang.
              dist.
              UNIQUE;
        
//#line 461
final x10.
          lang.
          IntReferenceArray numParticles =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 462
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 463
final x10.
          lang.
          DoubleReferenceArray sumX =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point pt/* } */, double dummy) { {
            
//#line 464
return 0.0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 465
final x10.
          lang.
          DoubleReferenceArray sumY =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point pt/* } */, double dummy) { {
            
//#line 466
return 0.0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 468
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 468
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 469
final x10.
                  lang.
                  region rLocal1 =
                  X10Util.
                    getLRank2D(
                    dResult,
                    0);
                
//#line 470
/* template:forloop { */
                for (java.util.Iterator pt__ = (x10.
                                                  lang.
                                                  region.
                                                  factory.
                                                  region(
                                                  rLocal1,
                                                  x10.
                                                    lang.
                                                    region.
                                                    factory.
                                                    region(
                                                    X,
                                                    X))).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 471
/* template:array_set { */(sumX).set(/* template:array_get { */((sumX).get(pl))/* } */ +
                      /* template:array_get { */((result).get(pt))/* } */,pl)/* } */;
                    
//#line 472
/* template:array_set { */(numParticles).set(/* template:array_get { */((numParticles).get(pl))/* } */ +
                      1,pl)/* } */;
                }/* } */
                }
                /* } */
                
                
//#line 474
/* template:forloop { */
                for (java.util.Iterator pt__ = (x10.
                                                  lang.
                                                  region.
                                                  factory.
                                                  region(
                                                  rLocal1,
                                                  x10.
                                                    lang.
                                                    region.
                                                    factory.
                                                    region(
                                                    Y,
                                                    Y))).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 475
/* template:array_set { */(sumY).set(/* template:array_get { */((sumY).get(pl))/* } */ +
                      /* template:array_get { */((result).get(pt))/* } */,pl)/* } */;
                }/* } */
                }
                /* } */
                
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp100) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp100);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 479
final int totalParticles =
          numParticles.
            sum();
        
//#line 480
final double driftX =
          sumX.
            sum() /
          totalParticles;
        
//#line 481
final double driftY =
          sumY.
            sum() /
          totalParticles;
        
//#line 484
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Init: updating with drift");
        
//#line 485
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 485
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 486
final x10.
                  lang.
                  region rLocal1 =
                  X10Util.
                    getLRank2D(
                    dResult,
                    0);
                
//#line 487
/* template:foreach { */
                for (java.util.Iterator pt__ = (x10.
                                                  lang.
                                                  region.
                                                  factory.
                                                  region(
                                                  rLocal1,
                                                  x10.
                                                    lang.
                                                    region.
                                                    factory.
                                                    region(
                                                    X,
                                                    X))).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { *//* } */
{
                    
//#line 488
/* template:array_set { */(result).set(/* template:array_get { */((result).get(pt))/* } */ -
                      driftX,pt)/* } */;
                }/* } */
                			}
                		});
                }
                /* } */
                
                
//#line 490
/* template:foreach { */
                for (java.util.Iterator pt__ = (x10.
                                                  lang.
                                                  region.
                                                  factory.
                                                  region(
                                                  rLocal1,
                                                  x10.
                                                    lang.
                                                    region.
                                                    factory.
                                                    region(
                                                    Y,
                                                    Y))).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { *//* } */
{
                    
//#line 491
/* template:array_set { */(result).set(/* template:array_get { */((result).get(pt))/* } */ -
                      driftY,pt)/* } */;
                }/* } */
                			}
                		});
                }
                /* } */
                
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp101) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp101);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 495
if (totalParticles !=
                           NPARTICLES) {
            
//#line 496
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         err))/* } */.println("Velocity distribution truncated, number of " +
                                                                                                                              "particles = " +
                                                                                                                              totalParticles);
        }
        
//#line 500
return result;
    }
    
    
//#line 506
public x10.
                   lang.
                   GenericReferenceArray
                   genParticles(
                   final int n,
                   final x10.
                     lang.
                     DoubleReferenceArray position,
                   final x10.
                     lang.
                     DoubleReferenceArray velocity) {
        
//#line 509
final x10.
          lang.
          dist dResult =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 510
public x10.
                             lang.
                             dist
                             checkCast(
                             final x10.
                               lang.
                               dist x10_generated_objToCast) {
                  
//#line 510
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
            x10.
              lang.
              dist.
              factory.
              block(
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
                  n -
                    1))));
        
//#line 511
return /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dResult,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
          lang.
          point __var4__/* } */, x10.compilergenerated.Parameter1 dummy) { {
            
//#line 511
final int i =
              /* template:array_get { */((__var4__).get(0))/* } */;
            
//#line 512
return new Particle(
              /* template:array_get { */((position).get(/* Join: { */i,0/* } */))/* } */,
              /* template:array_get { */((position).get(/* Join: { */i,1/* } */))/* } */,
              /* template:array_get { */((velocity).get(/* Join: { */i,0/* } */))/* } */,
              /* template:array_get { */((velocity).get(/* Join: { */i,1/* } */))/* } */);
        } }
        }/* } */,true,true,true)/* } */;
    }
    
    
//#line 520
public x10.
                   lang.
                   dist
                   genInitialDist(
                   final x10.
                     lang.
                     GenericReferenceArray particles) {
        
//#line 521
final int MAX_PLACES =
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 524
final double edgely =
          ((BOUNDARY_CONDITION ==
              2))
          ? 1.0
          : 0.0;
        
//#line 527
final double y =
          YLENGTH;
        
//#line 528
final double y0 =
          linearDensityFnIntegral(
            edgely,
            0.0,
            0.0,
            0.0);
        
//#line 531
final double nParticlesAve =
          ((linearDensityFnIntegral(
              y -
                edgely,
              0.0,
              0.0,
              0.0) -
              y0)) /
          MAX_PLACES;
        
//#line 535
final x10.
          lang.
          dist dUnique =
          (x10.
            lang.
            dist)
            x10.
              lang.
              dist.
              UNIQUE;
        
//#line 536
final x10.
          lang.
          GenericReferenceArray yRegions =
          (x10.
            lang.
            GenericReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dUnique,(x10.array.Operator.Pointwise)null,true,true,true)/* } */);
        
//#line 539
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 539
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 541
final double anpl =
                  /* template:array_get { */((pl).get(0))/* } */ *
                  nParticlesAve;
                
//#line 542
final double anpr =
                  ((/* template:array_get { */((pl).get(0))/* } */ +
                      1)) *
                  nParticlesAve;
                
//#line 545
double total =
                  0.0;
                
//#line 546
double tmp =
                  0.0;
                
//#line 547
double y1 =
                  edgely;
                
//#line 548
do  {
                    
//#line 549
tmp =
                      total;
                    
//#line 550
total =
                      linearDensityFnIntegral(
                        y1,
                        0.0,
                        0.0,
                        0.0) -
                        y0;
                    
//#line 551
y1 =
                      y1 +
                        1.0;
                }while(total <
                         anpl &&
                         y1 <=
                         y); 
                
//#line 554
double lb =
                  (((total >
                       tmp))
                     ? ((((y1 -
                             2.0)) +
                           ((anpl -
                               tmp)) /
                           ((total -
                               tmp))))
                     : ((y1 -
                           1.0)));
                
//#line 559
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                   isFirst()) {
                    
//#line 560
lb =
                      0.0;
                }
                
//#line 564
do  {
                    
//#line 565
tmp =
                      total;
                    
//#line 566
total =
                      linearDensityFnIntegral(
                        y1,
                        0.0,
                        0.0,
                        0.0) -
                        y0;
                    
//#line 567
y1 =
                      y1 +
                        1.0;
                }while(total <
                         anpr &&
                         y1 <=
                         y); 
                
//#line 570
double ub =
                  ((y1 -
                      2.0)) +
                  ((anpr -
                      tmp)) /
                  ((total -
                      tmp));
                
//#line 573
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                   isLast()) {
                    
//#line 574
ub =
                      y;
                }
                
//#line 577
/* template:array_set { */(yRegions).set(x10.
                                                                        lang.
                                                                        region.
                                                                        factory.
                                                                        region(
                                                                        x10.
                                                                          lang.
                                                                          region.
                                                                          factory.
                                                                          region(
                                                                          (int)
                                                                            ((lb +
                                                                                0.5)),
                                                                          ((int)
                                                                             ((ub +
                                                                                 0.5)) -
                                                                             1))),pl)/* } */;
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp102) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp102);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 581
final x10.
          lang.
          place pHere =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 582
final x10.
          lang.
          dist dPlace =
          (x10.
            lang.
            dist)
            ((x10.
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
                    MAX_PLACES -
                      1)),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 584
final x10.
          lang.
          GenericReferenceArray rBuffer =
          (x10.
            lang.
            GenericReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dPlace,(x10.array.Operator.Pointwise)null,true,true,true)/* } */);
        
//#line 588
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 588
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 589
final x10.
                  lang.
                  region r =
                  new x10.
                    runtime.
                    RuntimeCastChecker.
                    DepTypeRuntimeChecking(
                    ) {
                      
                      
//#line 589
public x10.
                                     lang.
                                     region
                                     checkCast(
                                     final x10.
                                       lang.
                                       region x10_generated_objToCast) {
                          
//#line 589
return (((((((x10.
                                                      lang.
                                                      region)
                                                      x10_generated_objToCast)).
                                                    rank() ==
                                                    1)))
                                                 ? (x10.
                                                     lang.
                                                     region)
                                                     x10_generated_objToCast
                                                 : (x10.
                                                     lang.
                                                     region)
                                                     x10.
                                                       runtime.
                                                       RuntimeCastChecker.
                                                       throwClassCastException(
                                                       (x10.
                                                         lang.
                                                         region)
                                                         x10_generated_objToCast,
                                                       "Constraint is not meet"));
                      }
                  }.
                    checkCast(
                    /* template:parametric { */((x10.
                      lang.
                      region)(/* template:array_get { */((yRegions).get(pl))/* } */))/* } */);
                
//#line 590
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 591
/* template:array_set { */(rBuffer).set(r,pl)/* } */;
                }
                		}
                	});/* } */
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp103) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp103);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 596
x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                x10.
                  lang.
                  region.
                  factory.
                  emptyRegion(
                  2),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 598
/* template:forloop { */
        for (java.util.Iterator pl__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pl__.hasNext(); ) {
        	final  x10.
          lang.
          point pl = (x10.
          lang.
          point) pl__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 599
final x10.
              lang.
              place p =
              x10.
                lang.
                dist.
                UNIQUE.
                get(
                pl);
            
//#line 600
final x10.
              lang.
              region ry =
              new x10.
                runtime.
                RuntimeCastChecker.
                DepTypeRuntimeChecking(
                ) {
                  
                  
//#line 600
public x10.
                                 lang.
                                 region
                                 checkCast(
                                 final x10.
                                   lang.
                                   region x10_generated_objToCast) {
                      
//#line 600
return (((((((x10.
                                                  lang.
                                                  region)
                                                  x10_generated_objToCast)).
                                                rank() ==
                                                1)))
                                             ? (x10.
                                                 lang.
                                                 region)
                                                 x10_generated_objToCast
                                             : (x10.
                                                 lang.
                                                 region)
                                                 x10.
                                                   runtime.
                                                   RuntimeCastChecker.
                                                   throwClassCastException(
                                                   (x10.
                                                     lang.
                                                     region)
                                                     x10_generated_objToCast,
                                                   "Constraint is not meet"));
                  }
              }.
                checkCast(
                /* template:parametric { */((x10.
                  lang.
                  region)(/* template:array_get { */((rBuffer).get(pl))/* } */))/* } */);
            
//#line 601
final x10.
              lang.
              dist dLocal =
              (x10.
                lang.
                dist)
                ((x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    x10.
                      lang.
                      region.
                      factory.
                      region(
                      ry,
                      x10.
                        lang.
                        region.
                        factory.
                        region(
                        0,
                        XLENGTH)),
                    p)));
            
//#line 603
dResult =
              dResult.
                union(
                dLocal);
        }/* } */
        }
        /* } */
        
        
//#line 606
return dResult;
    }
    
    
//#line 612
public double
                   linearDensityFn(
                   final double x,
                   final double anlx,
                   final double anxi,
                   final double shift) {
        
//#line 616
final double result =
          1.0 +
          anlx *
          ((x *
              anxi -
              shift));
        
//#line 617
if (result <
                           0.0) {
            
//#line 618
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         err))/* } */.println("Linear Density Error: result = " +
                                                                                                                              result);
        }
        
//#line 620
return result;
    }
    
    
//#line 626
public double
                   linearDensityFnIntegral(
                   final double x,
                   final double anlx,
                   final double anxi,
                   final double shift) {
        
//#line 630
double result =
          0.0;
        
//#line 631
if (anxi ==
                           0.0) {
            
//#line 632
result =
              x;
        } else {
            
//#line 634
result =
              x +
                0.5 *
                anlx *
                x *
                ((x *
                    anxi -
                    2.0 *
                    shift));
        }
        
//#line 637
if (result <
                           0.0) {
            
//#line 638
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         err))/* } */.println("Linear Density Integral Error: " +
                                                                                                                              "result = " +
                                                                                                                              result);
        }
        
//#line 641
return result;
    }
    
    
//#line 647
public x10.
                   lang.
                   DoubleReferenceArray
                   stepTime(
                   final x10.
                     lang.
                     DoubleReferenceArray ionBackground) {
        
//#line 648
long time1 =
          java.
            lang.
            System.
            currentTimeMillis();
        
//#line 649
long time2 =
          0;
        
//#line 650
final double CHARGE =
          ELECTRON_CHARGE;
        
//#line 651
final x10.
          lang.
          dist dIonBG =
          ionBackground.
            distribution;
        
//#line 652
final x10.
          lang.
          DoubleReferenceArray chargeDensityGuards =
          makeGuards(
            dIonBG);
        
//#line 654
final x10.
          lang.
          DoubleReferenceArray chargeDensity =
          (x10.
            lang.
            DoubleReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dIonBG,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
             	public double apply(/* Join: { */x10.
               lang.
               point pt/* } */, double dummy) { {
                 
//#line 656
return 0.0;
             } }
             }/* } */,true,true,false)/* } */);
        
//#line 659
depositCharge(
                       particles,
                       chargeDensity,
                       chargeDensityGuards,
                       CHARGE);
        
//#line 662
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 662
/* template:ateach { */
            {
            	x10.lang.dist pt__distCopy = dIonBG; // make copy to avoid recomputation
            	for (java.util.Iterator pt__ = pt__distCopy.iterator();
            		 pt__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pt = (x10.
              lang.
              point) pt__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pt__distCopy.get(pt)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 663
/* template:array_set { */(chargeDensity).set(/* template:array_get { */((chargeDensity).get(pt))/* } */ +
                  /* template:array_get { */((ionBackground).get(pt))/* } */,pt)/* } */;
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp104) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp104);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 666
addGuards(
                       chargeDensity,
                       chargeDensityGuards);
        
//#line 667
time2 =
          java.
            lang.
            System.
            currentTimeMillis();
        
//#line 668
depositTime =
          depositTime +
            ((time2 -
                time1));
        
//#line 675
final x10.
          lang.
          dist dOld =
          chargeDensity.
            distribution;
        
//#line 676
final x10.
          lang.
          DoubleReferenceArray uniformChargeDensity =
          moveFieldToUniform(
            chargeDensity);
        
//#line 679
final x10.
          lang.
          GenericReferenceArray complexChargeDensity =
          ArrayUtil.
            doubleToComplex(
            doubleDimensions(
              uniformChargeDensity));
        
//#line 682
time1 =
          java.
            lang.
            System.
            currentTimeMillis();
        
//#line 683
redistTime =
          redistTime +
            ((time1 -
                time2));
        
//#line 686
final x10.
          lang.
          GenericReferenceArray complexForceX =
          solver.
            makeForceArray();
        
//#line 687
final x10.
          lang.
          GenericReferenceArray complexForceY =
          solver.
            makeForceArray();
        
//#line 689
double we =
          solver.
            getForceCharge(
            complexChargeDensity,
            complexForceX,
            complexForceY);
        
//#line 693
time2 =
          java.
            lang.
            System.
            currentTimeMillis();
        
//#line 694
solverTime =
          solverTime +
            ((time2 -
                time1));
        
//#line 697
final x10.
          lang.
          dist dChargeDensityGuards =
          chargeDensityGuards.
            distribution;
        
//#line 699
final x10.
          lang.
          DoubleReferenceArray gx =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dChargeDensityGuards,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 700
final x10.
          lang.
          DoubleReferenceArray gy =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dChargeDensityGuards,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 701
final x10.
          lang.
          DoubleReferenceArray forceX =
          cropField(
            ArrayUtil.
              complexToDouble(
              complexForceX),
            gx);
        
//#line 703
final x10.
          lang.
          DoubleReferenceArray forceY =
          cropField(
            ArrayUtil.
              complexToDouble(
              complexForceY),
            gy);
        
//#line 707
final x10.
          lang.
          DoubleReferenceArray fcx =
          moveFieldToDist(
            forceX,
            dOld);
        
//#line 708
final x10.
          lang.
          DoubleReferenceArray fcy =
          moveFieldToDist(
            forceY,
            dOld);
        
//#line 711
loadGuards(
                       fcx,
                       gx);
        
//#line 712
loadGuards(
                       fcy,
                       gy);
        
//#line 714
time1 =
          java.
            lang.
            System.
            currentTimeMillis();
        
//#line 715
redistTime =
          redistTime +
            ((time1 -
                time2));
        
//#line 718
double wk =
          pushParticles(
            particles,
            fcx,
            gx,
            fcy,
            gy);
        
//#line 720
time2 =
          java.
            lang.
            System.
            currentTimeMillis();
        
//#line 721
pushTime =
          pushTime +
            ((time2 -
                time1));
        
//#line 724
final x10.
          lang.
          IntReferenceArray info =
          makeInfoArray();
        
//#line 725
particles =
          moveParticles(
            particles,
            dOld,
            info);
        
//#line 728
final double particleAve =
          (((double)
              /* template:array_get { */((info).get(6))/* } */)) /
          x10.
            lang.
            place.
            MAX_PLACES;
        
//#line 729
final double balance =
          X10Util.
            maxDouble(
            /* template:array_get { */((info).get(1))/* } */ -
              particleAve,
            particleAve -
              ((/* template:array_get { */((info).get(2))/* } */ /
                  particleAve)));
        
//#line 734
if (balance >
                           IMBALANCE) {
            
//#line 735
final x10.
              lang.
              IntReferenceArray count =
              countParticles(
                particles,
                dOld);
            
//#line 736
final x10.
              lang.
              dist dNew =
              repartition(
                count,
                dOld,
                particleAve);
            
//#line 740
backgroundCharge =
              moveFieldToDist(
                backgroundCharge,
                dNew);
            
//#line 741
particles =
              moveParticles(
                particles,
                dNew,
                info);
        }
        
//#line 744
final x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
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
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 745
final x10.
          lang.
          DoubleReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dResult,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 747
/* template:array_set { */(result).set(we,0)/* } */;
        
//#line 748
/* template:array_set { */(result).set(wk,1)/* } */;
        
//#line 749
/* template:array_set { */(result).set(we +
          wk,2)/* } */;
        
//#line 751
time1 =
          java.
            lang.
            System.
            currentTimeMillis();
        
//#line 752
moveTime =
          moveTime +
            ((time1 -
                time2));
        
//#line 754
return result;
    }
    
    
//#line 763
public double
                   linearDensity(
                   final double x,
                   final double anlx,
                   final double anxi,
                   final double shift) {
        
//#line 767
return 1.0 +
          anlx *
          ((x *
              anxi -
              shift));
    }
    
    
//#line 773
public double
                   linearDensityIntegral(
                   final double x,
                   final double anlx,
                   final double anxi,
                   final double shift) {
        
//#line 777
return ((anxi ==
                                0))
          ? x
          : x +
          0.5 *
          anlx *
          x *
          ((x *
              anxi -
              2.0 *
              shift));
    }
    
    
//#line 784
public x10.
                   lang.
                   DoubleReferenceArray
                   makeGuards(
                   final x10.
                     lang.
                     dist dData) {
        
//#line 785
x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                x10.
                  lang.
                  region.
                  factory.
                  emptyRegion(
                  2),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 787
/* template:forloop { */
        for (java.util.Iterator pl__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pl__.hasNext(); ) {
        	final  x10.
          lang.
          point pl = (x10.
          lang.
          point) pl__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 788
final x10.
              lang.
              place p =
              x10.
                lang.
                dist.
                UNIQUE.
                get(
                pl);
            
//#line 789
final x10.
              lang.
              region rLocal1 =
              X10Util.
                getPRank2D(
                dData,
                p,
                0);
            
//#line 790
final x10.
              lang.
              region rLocal2 =
              X10Util.
                getPRank2D(
                dData,
                p,
                1);
            
//#line 791
final int ub =
              rLocal1.
                high();
            
//#line 793
dResult =
              dResult.
                union(
                (x10.
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
                       ub +
                         1,
                       ub +
                         1),
                     rLocal2),
                   p)));
        }/* } */
        }
        /* } */
        
        
//#line 796
return /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dResult,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point pt/* } */, double dummy) { {
            
//#line 796
return 0.0;
        } }
        }/* } */,true,true,false)/* } */;
    }
    
    
//#line 806
public void
                   depositCharge(
                   final x10.
                     lang.
                     GenericReferenceArray particles,
                   final x10.
                     lang.
                     DoubleReferenceArray fieldCharge,
                   final x10.
                     lang.
                     DoubleReferenceArray guards,
                   final double charge) {
        
//#line 811
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 811
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 813
final x10.
                  lang.
                  dist dFC =
                  fieldCharge.
                    distribution;
                
//#line 814
final x10.
                  lang.
                  region rLocalFC =
                  X10Util.
                    get2DLRegion(
                    dFC);
                
//#line 816
final x10.
                  lang.
                  dist dG =
                  guards.
                    distribution;
                
//#line 817
final x10.
                  lang.
                  region rLocalG =
                  X10Util.
                    get2DLRegion(
                    dG);
                
//#line 818
final x10.
                  lang.
                  dist dLocal =
                  (x10.
                    lang.
                    dist)
                    ((x10.
                        lang.
                        dist.
                        factory.
                        constant(
                        (rLocalFC.
                           union(
                           rLocalG)),
                        /* template:here { */x10.lang.Runtime.here()/* } */)));
                
//#line 820
final x10.
                  lang.
                  DoubleReferenceArray localCharge =
                  /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dLocal,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                	public double apply(/* Join: { */x10.
                  lang.
                  point pt/* } */, double dummy) { {
                    
//#line 821
return 0.0;
                } }
                }/* } */,true,true,false)/* } */;
                
//#line 823
/* template:forloop { */
                for (java.util.Iterator pt__ = (particles.
                                                  distribution.
                                                  restriction(
                                                  /* template:here { */x10.lang.Runtime.here()/* } */).
                                                  region).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 824
final Particle p =
                      /* template:parametric { */((Particle)(/* template:array_get { */((particles).get(pt))/* } */))/* } */;
                    
//#line 825
final int x =
                      (int)
                        p.
                          getX();
                    
//#line 826
final int y =
                      (int)
                        p.
                          getY();
                    
//#line 827
final double dx =
                      p.
                        getX() -
                      x;
                    
//#line 828
final double dy =
                      p.
                        getY() -
                      y;
                    
//#line 831
/* template:array_set { */(localCharge).set(/* template:array_get { */((localCharge).get(/* Join: { */y +
                      1,x +
                      1/* } */))/* } */ +
                      ((charge *
                          dx *
                          dy)),/* Join: { */y +
                      1,x +
                      1/* } */)/* } */;
                    
//#line 832
/* template:array_set { */(localCharge).set(/* template:array_get { */((localCharge).get(/* Join: { */y +
                      1,x/* } */))/* } */ +
                      ((charge *
                          ((1.0 -
                              dx)) *
                          dy)),/* Join: { */y +
                      1,x/* } */)/* } */;
                    
//#line 833
/* template:array_set { */(localCharge).set(/* template:array_get { */((localCharge).get(/* Join: { */y,x +
                      1/* } */))/* } */ +
                      ((charge *
                          dx *
                          ((1.0 -
                              dy)))),/* Join: { */y,x +
                      1/* } */)/* } */;
                    
//#line 834
/* template:array_set { */(localCharge).set(/* template:array_get { */((localCharge).get(/* Join: { */y,x/* } */))/* } */ +
                      ((charge *
                          ((1.0 -
                              dx)) *
                          ((1.0 -
                              dy)))),/* Join: { */y,x/* } */)/* } */;
                }/* } */
                }
                /* } */
                
                
//#line 838
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 839
/* template:foreach { */
                    for (java.util.Iterator pt__ = (fieldCharge.
                                                      distribution.
                                                      restriction(
                                                      /* template:here { */x10.lang.Runtime.here()/* } */)).iterator(); pt__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point pt = (x10.
                      lang.
                      point) pt__.next();
                    	/* Join: { *//* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { *//* } */
{
                        
//#line 840
/* template:array_set { */(fieldCharge).set(/* template:array_get { */((localCharge).get(pt))/* } */,pt)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                    
//#line 842
/* template:foreach { */
                    for (java.util.Iterator pt__ = (guards.
                                                      distribution.
                                                      restriction(
                                                      /* template:here { */x10.lang.Runtime.here()/* } */)).iterator(); pt__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point pt = (x10.
                      lang.
                      point) pt__.next();
                    	/* Join: { *//* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { *//* } */
{
                        
//#line 843
/* template:array_set { */(guards).set(/* template:array_get { */((localCharge).get(pt))/* } */,pt)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                }
                	} catch (Throwable tmp106) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp106);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp105) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp105);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 854
public void
                   addGuards(
                   final x10.
                     lang.
                     DoubleReferenceArray data,
                   final x10.
                     lang.
                     DoubleReferenceArray guards) {
        
//#line 856
final x10.
          lang.
          dist dGuard =
          (x10.
            lang.
            dist)
            guards.
              distribution;
        
//#line 857
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 857
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 859
final x10.
                  lang.
                  dist dG =
                  guards.
                    distribution;
                
//#line 860
final x10.
                  lang.
                  region rLocalG =
                  X10Util.
                    get2DLRegion(
                    dG);
                
//#line 861
if (!(/* template:here { */x10.lang.Runtime.here()/* } */).
                                    isLast()) {
                    
//#line 862
final x10.
                      lang.
                      doubleArray sBuffer =
                      (x10.
                        lang.
                        doubleArray)
                        (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(rLocalG.
                                                                                                                                     toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                         	public double apply(/* Join: { */x10.
                           lang.
                           point pt/* } */, double dummy) { {
                             
//#line 865
return /* template:array_get { */((guards).get(pt))/* } */;
                         } }
                         }/* } */,true,false,false)/* } */);
                    
//#line 869
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 869
/* template:Async { */(x10.lang.Runtime.asPlace((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                       next())).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 870
final x10.
                              lang.
                              dist dData =
                              data.
                                distribution;
                            
//#line 871
final x10.
                              lang.
                              region rLocalD =
                              X10Util.
                                get2DLRegion(
                                dData);
                            
//#line 873
/* template:foreach { */
                            for (java.util.Iterator pt__ = ((rLocalD.
                                                               intersection(
                                                               rLocalG))).iterator(); pt__.hasNext(); ) {
                            	final  x10.
                              lang.
                              point pt = (x10.
                              lang.
                              point) pt__.next();
                            	/* Join: { *//* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { *//* } */
{
                                
//#line 874
/* template:array_set { */(data).set(/* template:array_get { */((data).get(pt))/* } */ +
                                  /* template:array_get { */((sBuffer).get(pt))/* } */,pt)/* } */;
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                        }
                        		}
                        	});/* } */
                    }
                    	} catch (Throwable tmp108) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp108);
                    	} finally {
                    		x10.lang.Runtime.getCurrentActivity().stopFinish();
                    	}
                    }
                    /* } */
                    
                }
                
//#line 880
/* template:foreach { */
                for (java.util.Iterator pt__ = (rLocalG).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { *//* } */
{
                    
//#line 881
/* template:array_set { */(guards).set(0.0,pt)/* } */;
                }/* } */
                			}
                		});
                }
                /* } */
                
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp107) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp107);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 889
public x10.
                   lang.
                   DoubleReferenceArray
                   doubleDimensions(
                   final x10.
                     lang.
                     DoubleReferenceArray data) {
        
//#line 890
final x10.
          lang.
          region rData =
          data.
            region;
        
//#line 891
final x10.
          lang.
          region rData1 =
          X10Util.
            getRank2D(
            rData,
            0);
        
//#line 892
final x10.
          lang.
          region rData2 =
          X10Util.
            getRank2D(
            rData,
            1);
        
//#line 893
final x10.
          lang.
          dist dResult =
          X10Util.
            distBlockStar2(
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
                2 *
                  rData1.
                    size() -
                  1)),
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
                2 *
                  rData2.
                    size() -
                  1)));
        
//#line 896
final x10.
          lang.
          DoubleReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dResult,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point pt/* } */, double dummy) { {
            
//#line 897
return 0.0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 899
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 899
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 900
final x10.
                  lang.
                  place pDst =
                  x10.
                    lang.
                    place.
                    places(
                    /* template:array_get { */((pl).get(0))/* } */ /
                      2);
                
//#line 902
final x10.
                  lang.
                  dist dData =
                  data.
                    distribution;
                
//#line 903
final x10.
                  lang.
                  region rLocal =
                  X10Util.
                    get2DLRegion(
                    dData);
                
//#line 904
final x10.
                  lang.
                  doubleArray sBuffer =
                  (x10.
                    lang.
                    doubleArray)
                    (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(rLocal.
                                                                                                                                 toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                     	public double apply(/* Join: { */x10.
                       lang.
                       point pt/* } */, double dummy) { {
                         
//#line 907
return /* template:array_get { */((data).get(pt))/* } */;
                     } }
                     }/* } */,true,false,false)/* } */);
                
//#line 910
/* template:Async { */(x10.lang.Runtime.asPlace(pDst)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 911
/* template:foreach { */
                    for (java.util.Iterator pt__ = (rLocal).iterator(); pt__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point pt = (x10.
                      lang.
                      point) pt__.next();
                    	/* Join: { *//* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { *//* } */
{
                        
//#line 912
/* template:array_set { */(result).set(/* template:array_get { */((sBuffer).get(pt))/* } */,pt)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                }
                		}
                	});/* } */
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp109) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp109);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 917
return result;
    }
    
    
//#line 923
public x10.
                   lang.
                   DoubleReferenceArray
                   moveFieldToUniform(
                   final x10.
                     lang.
                     DoubleReferenceArray data) {
        
//#line 924
final x10.
          lang.
          region rData =
          data.
            region;
        
//#line 925
return moveFieldToDist(
                              data,
                              X10Util.
                                distBlockStar1(
                                rData));
    }
    
    
//#line 931
public x10.
                   lang.
                   DoubleReferenceArray
                   moveFieldToDist(
                   final x10.
                     lang.
                     DoubleReferenceArray data,
                   final x10.
                     lang.
                     dist dDst) {
        
//#line 933
final int MAX_ROWS =
          MOVE_FIELD_TO_DIST_MAX_ROWS;
        
//#line 935
final int MAX_ITER =
          0;
        
//#line 937
final x10.
          lang.
          dist dUnique =
          (x10.
            lang.
            dist)
            x10.
              lang.
              dist.
              UNIQUE;
        
//#line 938
final x10.
          lang.
          region rData =
          data.
            region;
        
//#line 939
final x10.
          lang.
          region rRank1 =
          X10Util.
            getRank2D(
            rData,
            0);
        
//#line 940
final x10.
          lang.
          region rRank2t =
          X10Util.
            getRank2D(
            rData,
            1);
        
//#line 943
final x10.
          lang.
          region rRank2 =
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
              rRank2t.
                size() -
                1));
        
//#line 945
final x10.
          lang.
          region rRows =
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
              MAX_ROWS -
                1));
        
//#line 947
final x10.
          lang.
          dist dBuffer =
          X10Util.
            extendDistRank3D(
            X10Util.
              extendDistRank2D(
              dUnique,
              rRows),
            rRank2);
        
//#line 950
final x10.
          lang.
          DoubleReferenceArray srcBuffer =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dBuffer,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point pt/* } */, double dummy) { {
            
//#line 951
return 0.0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 952
final x10.
          lang.
          DoubleReferenceArray dstBuffer =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dBuffer,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point pt/* } */, double dummy) { {
            
//#line 953
return 0.0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 955
final x10.
          lang.
          IntReferenceArray offsets =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 956
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 957
final x10.
          lang.
          IntReferenceArray sizes =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 958
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 960
final x10.
          lang.
          IntReferenceArray inLt =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 961
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 962
final x10.
          lang.
          IntReferenceArray inRt =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 963
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 964
final x10.
          lang.
          IntReferenceArray outLt =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 965
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 966
final x10.
          lang.
          IntReferenceArray outRt =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 967
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 970
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 970
/* template:ateach { */
            {
            	x10.lang.dist __var5____distCopy = x10.
                                                  lang.
                                                  dist.
                                                  UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator __var5____ = __var5____distCopy.iterator();
            		 __var5____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var5__ = (x10.
              lang.
              point) __var5____.next();
            		/* Join: { */final int pl =
              /* template:array_get { */((__var5__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var5____distCopy.get(__var5__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int pl =
              /* template:array_get { */((__var5__).get(0))/* } */;/* } */
{
                
//#line 971
final x10.
                  lang.
                  dist dData =
                  data.
                    distribution;
                
//#line 972
final x10.
                  lang.
                  region rLocal =
                  X10Util.
                    get2DLRegion(
                    dData);
                
//#line 973
final x10.
                  lang.
                  region rLocal1 =
                  X10Util.
                    getRank2D(
                    rLocal,
                    0);
                
//#line 974
if (X10Util.
                                   ENABLE_CHECKS &&
                                   rLocal1.
                                     size() ==
                                   0) {
                    
//#line 975
throw new java.
                      lang.
                      RuntimeException(
                      "Region empty -- should not happen");
                }
                
//#line 978
final int offset =
                  rLocal1.
                    low();
                
//#line 979
/* template:foreach { */
                for (java.util.Iterator __var6____ = (rLocal).iterator(); __var6____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var6__ = (x10.
                  lang.
                  point) __var6____.next();
                	/* Join: { */final int i =
                  /* template:array_get { */((__var6__).get(0))/* } */;
final int j =
                  /* template:array_get { */((__var6__).get(1))/* } */;/* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var6__).get(0))/* } */;
final int j =
                  /* template:array_get { */((__var6__).get(1))/* } */;/* } */
{
                    
//#line 980
/* template:array_set { */(srcBuffer).set(/* template:array_get { */((data).get(/* Join: { */i,j/* } */))/* } */,/* Join: { */pl,i -
                      offset,j/* } */)/* } */;
                }/* } */
                			}
                		});
                }
                /* } */
                
                
//#line 982
/* template:array_set { */(sizes).set(rLocal1.
                                                                     size(),pl)/* } */;
                
//#line 983
/* template:array_set { */(offsets).set(offset,pl)/* } */;
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp110) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp110);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 986
int mter =
          MAX_ITER;
        
//#line 987
int iter =
          0;
        
//#line 988
boolean done =
          false;
        
//#line 989
do  {
            
//#line 991
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 991
/* template:ateach { */
                {
                	x10.lang.dist pl__distCopy = x10.
                                                lang.
                                                dist.
                                                UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator pl__ = pl__distCopy.iterator();
                		 pl__.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point pl = (x10.
                  lang.
                  point) pl__.next();
                		/* Join: { *//* } */
                		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { *//* } */
{
                    
//#line 992
final x10.
                      lang.
                      region rLocalD =
                      X10Util.
                        get2DLRegion(
                        dDst);
                    
//#line 993
final x10.
                      lang.
                      region rLocalD1 =
                      X10Util.
                        getRank2D(
                        rLocalD,
                        0);
                    
//#line 994
if (X10Util.
                                       ENABLE_CHECKS &&
                                       rLocalD1.
                                         size() ==
                                       0) {
                        
//#line 995
throw new java.
                          lang.
                          RuntimeException(
                          "Region empty -- " +
                          "cannot to move grids");
                    }
                    
//#line 998
/* template:array_set { */(outLt).set(0,pl)/* } */;
                    
//#line 999
/* template:array_set { */(outRt).set(0,pl)/* } */;
                    
//#line 1001
final int lBorder =
                      rLocalD1.
                        low();
                    
//#line 1002
final int rBorder =
                      rLocalD1.
                        high() +
                      1;
                    
//#line 1003
/* template:forloop-mult { */{
                    x10.lang.region __var112__ = (x10.lang.region) x10.
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
                                                                       /* template:array_get { */((sizes).get(pl))/* } */ -
                                                                         1));
                    if (__var112__.size() > 0 && (__var112__ instanceof x10.array.MultiDimRegion || __var112__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var113__ = __var112__.rank(0).low(), __var114__ = __var112__.rank(0).high(); __var113__ <= __var114__; __var113__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int i1 = __var113__;
                    /* } */
                    /* } */
{
                        
//#line 1004
final int i2 =
                          i1 +
                          /* template:array_get { */((offsets).get(pl))/* } */;
                        
//#line 1005
if (i2 >=
                                            rBorder) {
                            
//#line 1007
/* template:array_set { */(outRt).set(/* template:array_get { */((outRt).get(pl))/* } */ +
                              1,pl)/* } */;
                        } else {
                            
//#line 1008
if (i2 <
                                                lBorder) {
                                
//#line 1010
/* template:array_set { */(outLt).set(/* template:array_get { */((outLt).get(pl))/* } */ +
                                  1,pl)/* } */;
                            }
                        }
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var7____ = (__var112__).iterator(); __var7____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var7__ = (x10.
                      lang.
                      point) __var7____.next();
                    	/* Join: { *//* Join: { */final int i1 =
                      /* template:array_get { */((__var7__).get(0))/* } */;/* } */
{
                        
//#line 1004
final int i2 =
                          i1 +
                          /* template:array_get { */((offsets).get(pl))/* } */;
                        
//#line 1005
if (i2 >=
                                            rBorder) {
                            
//#line 1007
/* template:array_set { */(outRt).set(/* template:array_get { */((outRt).get(pl))/* } */ +
                              1,pl)/* } */;
                        } else {
                            
//#line 1008
if (i2 <
                                                lBorder) {
                                
//#line 1010
/* template:array_set { */(outLt).set(/* template:array_get { */((outLt).get(pl))/* } */ +
                                  1,pl)/* } */;
                            }
                        }
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp111) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp111);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 1016
iter++;
            
//#line 1017
final x10.
              lang.
              IntReferenceArray pr =
              /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
            	public int apply(/* Join: { */x10.
              lang.
              point pt/* } */, int dummy) { {
                
//#line 1018
return 0;
            } }
            }/* } */,true,true,false)/* } */;
            
//#line 1019
final x10.
              lang.
              IntReferenceArray ter =
              /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
            	public int apply(/* Join: { */x10.
              lang.
              point pt/* } */, int dummy) { {
                
//#line 1020
return 0;
            } }
            }/* } */,true,true,false)/* } */;
            
//#line 1023
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1023
/* template:ateach { */
                {
                	x10.lang.dist pl__distCopy = x10.
                                                lang.
                                                dist.
                                                UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator pl__ = pl__distCopy.iterator();
                		 pl__.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point pl = (x10.
                  lang.
                  point) pl__.next();
                		/* Join: { *//* } */
                		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { *//* } */
{
                    
//#line 1024
/* template:array_set { */(inLt).set(0,pl)/* } */;
                    
//#line 1025
/* template:array_set { */(inRt).set(0,pl)/* } */;
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp115) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp115);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 1030
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1030
/* template:ateach { */
                {
                	x10.lang.dist __var8____distCopy = x10.
                                                      lang.
                                                      dist.
                                                      UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator __var8____ = __var8____distCopy.iterator();
                		 __var8____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var8__ = (x10.
                  lang.
                  point) __var8____.next();
                		/* Join: { */final int pl =
                  /* template:array_get { */((__var8__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var8____distCopy.get(__var8__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int pl =
                  /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                    
//#line 1038
if (/* template:array_get { */((outRt).get(pl))/* } */ >
                                        0) {
                        
//#line 1039
final int bsize =
                          /* template:array_get { */((outRt).get(pl))/* } */;
                        
//#line 1040
final x10.
                          lang.
                          region rBuffer =
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
                              bsize -
                                1),
                            rRank2);
                        
//#line 1041
final x10.
                          lang.
                          doubleArray sBuffer =
                          (x10.
                            lang.
                            doubleArray)
                            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(rBuffer.
                                                                                                                                         toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                             	public double apply(/* Join: { */x10.
                               lang.
                               point __var9__/* } */, double dummy) { {
                                 
//#line 1043
final int i =
                                   /* template:array_get { */((__var9__).get(0))/* } */;
                                 
//#line 1043
final int j =
                                   /* template:array_get { */((__var9__).get(1))/* } */;
                                 
//#line 1044
return /* template:array_get { */((srcBuffer).get(/* Join: { */pl,i +
                                   /* template:array_get { */((sizes).get(pl))/* } */ -
                                   /* template:array_get { */((outRt).get(pl))/* } */,j/* } */))/* } */;
                             } }
                             }/* } */,true,false,false)/* } */);
                        
//#line 1047
/* template:Async { */(x10.lang.Runtime.asPlace((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                        next())).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 1048
/* template:foreach { */
                            for (java.util.Iterator __var10____ = (rBuffer).iterator(); __var10____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var10__ = (x10.
                              lang.
                              point) __var10____.next();
                            	/* Join: { */final int i =
                              /* template:array_get { */((__var10__).get(0))/* } */;
final int j =
                              /* template:array_get { */((__var10__).get(1))/* } */;/* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { */final int i =
                              /* template:array_get { */((__var10__).get(0))/* } */;
final int j =
                              /* template:array_get { */((__var10__).get(1))/* } */;/* } */
{
                                
//#line 1049
/* template:array_set { */(dstBuffer).set(/* template:array_get { */((sBuffer).get(/* Join: { */i,j/* } */))/* } */,/* Join: { */(/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                                                                                                                 id,i,j/* } */)/* } */;
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                            
//#line 1051
/* template:array_set { */(inLt).set(bsize,(/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                       id)/* } */;
                        }
                        		}
                        	});/* } */
                    }
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp116) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp116);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 1056
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1056
/* template:ateach { */
                {
                	x10.lang.dist __var11____distCopy = x10.
                                                       lang.
                                                       dist.
                                                       UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator __var11____ = __var11____distCopy.iterator();
                		 __var11____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var11__ = (x10.
                  lang.
                  point) __var11____.next();
                		/* Join: { */final int pl =
                  /* template:array_get { */((__var11__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var11____distCopy.get(__var11__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int pl =
                  /* template:array_get { */((__var11__).get(0))/* } */;/* } */
{
                    
//#line 1058
/* template:array_set { */(sizes).set(/* template:array_get { */((sizes).get(pl))/* } */ -
                      /* template:array_get { */((outRt).get(pl))/* } */,pl)/* } */;
                    
//#line 1061
/* template:array_set { */(outRt).set(X10Util.
                                                                          maxInt(
                                                                          /* template:array_get { */((sizes).get(pl))/* } */ +
                                                                            /* template:array_get { */((inLt).get(pl))/* } */ -
                                                                            MAX_ROWS,
                                                                          0),pl)/* } */;
                    
//#line 1062
/* template:array_set { */(sizes).set(/* template:array_get { */((sizes).get(pl))/* } */ -
                      /* template:array_get { */((outRt).get(pl))/* } */,pl)/* } */;
                    
//#line 1064
if (/* template:array_get { */((outRt).get(pl))/* } */ >
                                        0) {
                        
//#line 1065
/* template:array_set { */(pr).set(X10Util.
                                                                           maxInt(
                                                                           /* template:array_get { */((pr).get(pl))/* } */,
                                                                           /* template:array_get { */((outRt).get(pl))/* } */),pl)/* } */;
                        
//#line 1068
final int rsize =
                          X10Util.
                            minInt(
                            /* template:array_get { */((outRt).get(pl))/* } */,
                            MAX_ROWS -
                              /* template:array_get { */((inLt).get(pl))/* } */);
                        
//#line 1070
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 1070
/* template:foreach { */
                            for (java.util.Iterator __var12____ = (x10.
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
                                                                       rsize -
                                                                         1),
                                                                     rRank2)).iterator(); __var12____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var12__ = (x10.
                              lang.
                              point) __var12____.next();
                            	/* Join: { */final int i =
                              /* template:array_get { */((__var12__).get(0))/* } */;
final int j =
                              /* template:array_get { */((__var12__).get(1))/* } */;/* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { */final int i =
                              /* template:array_get { */((__var12__).get(0))/* } */;
final int j =
                              /* template:array_get { */((__var12__).get(1))/* } */;/* } */
{
                                
//#line 1072
/* template:array_set { */(dstBuffer).set(/* template:array_get { */((srcBuffer).get(/* Join: { */pl,/* template:array_get { */((sizes).get(pl))/* } */ +
                                  i,j/* } */))/* } */,/* Join: { */pl,MAX_ROWS -
                                  rsize +
                                  i,j/* } */)/* } */;
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                        }
                        	} catch (Throwable tmp118) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp118);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                    }
                    
//#line 1078
if (/* template:array_get { */((sizes).get(pl))/* } */ >
                                        0 &&
                                        /* template:array_get { */((inLt).get(pl))/* } */ >
                                        0) {
                        
//#line 1079
/* template:forloop-mult { */{
                        x10.lang.region __var119__ = (x10.lang.region) x10.
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
                                                                           /* template:array_get { */((sizes).get(pl))/* } */));
                        if (__var119__.size() > 0 && (__var119__ instanceof x10.array.MultiDimRegion || __var119__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var120__ = __var119__.rank(0).low(), __var121__ = __var119__.rank(0).high(); __var120__ <= __var121__; __var120__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i1 = __var120__;
                        /* } */
                        /* } */
{
                            
//#line 1080
final int i2 =
                              /* template:array_get { */((sizes).get(pl))/* } */ -
                              i1;
                            
//#line 1081
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 1081
/* template:foreach { */
                                for (java.util.Iterator __var14____ = (rRank2).iterator(); __var14____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var14__ = (x10.
                                  lang.
                                  point) __var14____.next();
                                	/* Join: { */final int j =
                                  /* template:array_get { */((__var14__).get(0))/* } */;/* } */
                                	x10.lang.Runtime.here().runAsync
                                		(new x10.runtime.Activity() {
                                			public void runX10Task() {
                                				/* Join: { *//* Join: { */final int j =
                                  /* template:array_get { */((__var14__).get(0))/* } */;/* } */
{
                                    
//#line 1082
/* template:array_set { */(srcBuffer).set(/* template:array_get { */((srcBuffer).get(/* Join: { */pl,i2,j/* } */))/* } */,/* Join: { */pl,i2 +
                                      /* template:array_get { */((inLt).get(pl))/* } */,j/* } */)/* } */;
                                }/* } */
                                			}
                                		});
                                }
                                /* } */
                                
                            }
                            	} catch (Throwable tmp122) {
                            		x10.lang.Runtime.getCurrentActivity().pushException(tmp122);
                            	} finally {
                            		x10.lang.Runtime.getCurrentActivity().stopFinish();
                            	}
                            }
                            /* } */
                            
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var13____ = (__var119__).iterator(); __var13____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var13__ = (x10.
                          lang.
                          point) __var13____.next();
                        	/* Join: { *//* Join: { */final int i1 =
                          /* template:array_get { */((__var13__).get(0))/* } */;/* } */
{
                            
//#line 1080
final int i2 =
                              /* template:array_get { */((sizes).get(pl))/* } */ -
                              i1;
                            
//#line 1081
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 1081
/* template:foreach { */
                                for (java.util.Iterator __var14____ = (rRank2).iterator(); __var14____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var14__ = (x10.
                                  lang.
                                  point) __var14____.next();
                                	/* Join: { */final int j =
                                  /* template:array_get { */((__var14__).get(0))/* } */;/* } */
                                	x10.lang.Runtime.here().runAsync
                                		(new x10.runtime.Activity() {
                                			public void runX10Task() {
                                				/* Join: { *//* Join: { */final int j =
                                  /* template:array_get { */((__var14__).get(0))/* } */;/* } */
{
                                    
//#line 1082
/* template:array_set { */(srcBuffer).set(/* template:array_get { */((srcBuffer).get(/* Join: { */pl,i2,j/* } */))/* } */,/* Join: { */pl,i2 +
                                      /* template:array_get { */((inLt).get(pl))/* } */,j/* } */)/* } */;
                                }/* } */
                                			}
                                		});
                                }
                                /* } */
                                
                            }
                            	} catch (Throwable tmp123) {
                            		x10.lang.Runtime.getCurrentActivity().pushException(tmp123);
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
                    
//#line 1088
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 1088
/* template:foreach { */
                        for (java.util.Iterator pt__ = (x10.
                                                          lang.
                                                          region.
                                                          factory.
                                                          region(
                                                          x10.
                                                            lang.
                                                            region.
                                                            factory.
                                                            region(
                                                            pl,
                                                            pl),
                                                          x10.
                                                            lang.
                                                            region.
                                                            factory.
                                                            region(
                                                            0,
                                                            /* template:array_get { */((inLt).get(pl))/* } */ -
                                                              1),
                                                          rRank2)).iterator(); pt__.hasNext(); ) {
                        	final  x10.
                          lang.
                          point pt = (x10.
                          lang.
                          point) pt__.next();
                        	/* Join: { *//* } */
                        	x10.lang.Runtime.here().runAsync
                        		(new x10.runtime.Activity() {
                        			public void runX10Task() {
                        				/* Join: { *//* Join: { *//* } */
{
                            
//#line 1090
/* template:array_set { */(srcBuffer).set(/* template:array_get { */((dstBuffer).get(pt))/* } */,pt)/* } */;
                        }/* } */
                        			}
                        		});
                        }
                        /* } */
                        
                    }
                    	} catch (Throwable tmp124) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp124);
                    	} finally {
                    		x10.lang.Runtime.getCurrentActivity().stopFinish();
                    	}
                    }
                    /* } */
                    
                    
//#line 1093
/* template:array_set { */(sizes).set(/* template:array_get { */((sizes).get(pl))/* } */ +
                      /* template:array_get { */((inLt).get(pl))/* } */,pl)/* } */;
                    
//#line 1094
/* template:array_set { */(offsets).set(/* template:array_get { */((offsets).get(pl))/* } */ -
                      /* template:array_get { */((inLt).get(pl))/* } */,pl)/* } */;
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp117) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp117);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 1097
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1097
/* template:ateach { */
                {
                	x10.lang.dist __var15____distCopy = x10.
                                                       lang.
                                                       dist.
                                                       UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator __var15____ = __var15____distCopy.iterator();
                		 __var15____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var15__ = (x10.
                  lang.
                  point) __var15____.next();
                		/* Join: { */final int pl =
                  /* template:array_get { */((__var15__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var15____distCopy.get(__var15__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int pl =
                  /* template:array_get { */((__var15__).get(0))/* } */;/* } */
{
                    
//#line 1099
if (/* template:array_get { */((outLt).get(pl))/* } */ >
                                        0) {
                        
//#line 1100
final int bsize =
                          /* template:array_get { */((outLt).get(pl))/* } */;
                        
//#line 1101
final x10.
                          lang.
                          region rBuffer =
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
                              bsize -
                                1),
                            rRank2);
                        
//#line 1102
final x10.
                          lang.
                          doubleArray sBuffer =
                          (x10.
                            lang.
                            doubleArray)
                            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(rBuffer.
                                                                                                                                         toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                             	public double apply(/* Join: { */x10.
                               lang.
                               point __var16__/* } */, double dummy) { {
                                 
//#line 1104
final int i =
                                   /* template:array_get { */((__var16__).get(0))/* } */;
                                 
//#line 1104
final int j =
                                   /* template:array_get { */((__var16__).get(1))/* } */;
                                 
//#line 1105
return /* template:array_get { */((srcBuffer).get(/* Join: { */pl,i,j/* } */))/* } */;
                             } }
                             }/* } */,true,false,false)/* } */);
                        
//#line 1107
/* template:Async { */(x10.lang.Runtime.asPlace((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                        prev())).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 1108
/* template:foreach { */
                            for (java.util.Iterator __var17____ = (rBuffer).iterator(); __var17____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var17__ = (x10.
                              lang.
                              point) __var17____.next();
                            	/* Join: { */final int i =
                              /* template:array_get { */((__var17__).get(0))/* } */;
final int j =
                              /* template:array_get { */((__var17__).get(1))/* } */;/* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { */final int i =
                              /* template:array_get { */((__var17__).get(0))/* } */;
final int j =
                              /* template:array_get { */((__var17__).get(1))/* } */;/* } */
{
                                
//#line 1109
/* template:array_set { */(dstBuffer).set(/* template:array_get { */((sBuffer).get(/* Join: { */i,j/* } */))/* } */,/* Join: { */(/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                                                                                                                 id,i,j/* } */)/* } */;
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                            
//#line 1111
/* template:array_set { */(inRt).set(bsize,(/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                       id)/* } */;
                        }
                        		}
                        	});/* } */
                    }
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp125) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp125);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 1116
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1116
/* template:ateach { */
                {
                	x10.lang.dist __var18____distCopy = x10.
                                                       lang.
                                                       dist.
                                                       UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator __var18____ = __var18____distCopy.iterator();
                		 __var18____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var18__ = (x10.
                  lang.
                  point) __var18____.next();
                		/* Join: { */final int pl =
                  /* template:array_get { */((__var18__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var18____distCopy.get(__var18__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int pl =
                  /* template:array_get { */((__var18__).get(0))/* } */;/* } */
{
                    
//#line 1118
/* template:array_set { */(sizes).set(/* template:array_get { */((sizes).get(pl))/* } */ -
                      /* template:array_get { */((outLt).get(pl))/* } */,pl)/* } */;
                    
//#line 1119
/* template:array_set { */(offsets).set(/* template:array_get { */((offsets).get(pl))/* } */ +
                      /* template:array_get { */((outLt).get(pl))/* } */,pl)/* } */;
                    
//#line 1122
if (/* template:array_get { */((sizes).get(pl))/* } */ >
                                        0 &&
                                        /* template:array_get { */((outLt).get(pl))/* } */ >
                                        0) {
                        
//#line 1123
/* template:forloop-mult { */{
                        x10.lang.region __var127__ = (x10.lang.region) x10.
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
                                                                           /* template:array_get { */((sizes).get(pl))/* } */ -
                                                                             1));
                        if (__var127__.size() > 0 && (__var127__ instanceof x10.array.MultiDimRegion || __var127__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var128__ = __var127__.rank(0).low(), __var129__ = __var127__.rank(0).high(); __var128__ <= __var129__; __var128__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i = __var128__;
                        /* } */
                        /* } */
{
                            
//#line 1124
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 1124
/* template:foreach { */
                                for (java.util.Iterator __var20____ = (rRank2).iterator(); __var20____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var20__ = (x10.
                                  lang.
                                  point) __var20____.next();
                                	/* Join: { */final int j =
                                  /* template:array_get { */((__var20__).get(0))/* } */;/* } */
                                	x10.lang.Runtime.here().runAsync
                                		(new x10.runtime.Activity() {
                                			public void runX10Task() {
                                				/* Join: { *//* Join: { */final int j =
                                  /* template:array_get { */((__var20__).get(0))/* } */;/* } */
{
                                    
//#line 1125
/* template:array_set { */(srcBuffer).set(/* template:array_get { */((srcBuffer).get(/* Join: { */pl,i +
                                      /* template:array_get { */((outLt).get(pl))/* } */,j/* } */))/* } */,/* Join: { */pl,i,j/* } */)/* } */;
                                }/* } */
                                			}
                                		});
                                }
                                /* } */
                                
                            }
                            	} catch (Throwable tmp130) {
                            		x10.lang.Runtime.getCurrentActivity().pushException(tmp130);
                            	} finally {
                            		x10.lang.Runtime.getCurrentActivity().stopFinish();
                            	}
                            }
                            /* } */
                            
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var19____ = (__var127__).iterator(); __var19____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var19__ = (x10.
                          lang.
                          point) __var19____.next();
                        	/* Join: { *//* Join: { */final int i =
                          /* template:array_get { */((__var19__).get(0))/* } */;/* } */
{
                            
//#line 1124
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 1124
/* template:foreach { */
                                for (java.util.Iterator __var20____ = (rRank2).iterator(); __var20____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var20__ = (x10.
                                  lang.
                                  point) __var20____.next();
                                	/* Join: { */final int j =
                                  /* template:array_get { */((__var20__).get(0))/* } */;/* } */
                                	x10.lang.Runtime.here().runAsync
                                		(new x10.runtime.Activity() {
                                			public void runX10Task() {
                                				/* Join: { *//* Join: { */final int j =
                                  /* template:array_get { */((__var20__).get(0))/* } */;/* } */
{
                                    
//#line 1125
/* template:array_set { */(srcBuffer).set(/* template:array_get { */((srcBuffer).get(/* Join: { */pl,i +
                                      /* template:array_get { */((outLt).get(pl))/* } */,j/* } */))/* } */,/* Join: { */pl,i,j/* } */)/* } */;
                                }/* } */
                                			}
                                		});
                                }
                                /* } */
                                
                            }
                            	} catch (Throwable tmp131) {
                            		x10.lang.Runtime.getCurrentActivity().pushException(tmp131);
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
                    
//#line 1131
/* template:array_set { */(outLt).set(X10Util.
                                                                          maxInt(
                                                                          /* template:array_get { */((sizes).get(pl))/* } */ +
                                                                            /* template:array_get { */((inRt).get(pl))/* } */ -
                                                                            MAX_ROWS,
                                                                          0),pl)/* } */;
                    
//#line 1132
if (/* template:array_get { */((outLt).get(pl))/* } */ >
                                        0) {
                        
//#line 1133
/* template:array_set { */(pr).set(X10Util.
                                                                           maxInt(
                                                                           /* template:array_get { */((pr).get(pl))/* } */,
                                                                           /* template:array_get { */((outLt).get(pl))/* } */),pl)/* } */;
                        
//#line 1134
/* template:array_set { */(inRt).set(/* template:array_get { */((inRt).get(pl))/* } */ -
                          /* template:array_get { */((outLt).get(pl))/* } */,pl)/* } */;
                    } else {
                        
//#line 1135
if (/* template:array_get { */((outRt).get(pl))/* } */ >
                                            0) {
                            
                        }
                    }
                    
//#line 1139
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 1139
/* template:foreach { */
                        for (java.util.Iterator __var21____ = (x10.
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
                                                                   /* template:array_get { */((inRt).get(pl))/* } */ -
                                                                     1),
                                                                 rRank2)).iterator(); __var21____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var21__ = (x10.
                          lang.
                          point) __var21____.next();
                        	/* Join: { */final int i =
                          /* template:array_get { */((__var21__).get(0))/* } */;
final int j =
                          /* template:array_get { */((__var21__).get(1))/* } */;/* } */
                        	x10.lang.Runtime.here().runAsync
                        		(new x10.runtime.Activity() {
                        			public void runX10Task() {
                        				/* Join: { *//* Join: { */final int i =
                          /* template:array_get { */((__var21__).get(0))/* } */;
final int j =
                          /* template:array_get { */((__var21__).get(1))/* } */;/* } */
{
                            
//#line 1141
/* template:array_set { */(srcBuffer).set(/* template:array_get { */((dstBuffer).get(/* Join: { */pl,i,j/* } */))/* } */,/* Join: { */pl,i +
                              /* template:array_get { */((sizes).get(pl))/* } */,j/* } */)/* } */;
                        }/* } */
                        			}
                        		});
                        }
                        /* } */
                        
                    }
                    	} catch (Throwable tmp132) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp132);
                    	} finally {
                    		x10.lang.Runtime.getCurrentActivity().stopFinish();
                    	}
                    }
                    /* } */
                    
                    
//#line 1143
/* template:array_set { */(sizes).set(/* template:array_get { */((sizes).get(pl))/* } */ +
                      /* template:array_get { */((inRt).get(pl))/* } */,pl)/* } */;
                    
//#line 1146
final x10.
                      lang.
                      region rLocal1 =
                      X10Util.
                        getLRank2D(
                        dDst,
                        0);
                    
//#line 1147
if (X10Util.
                                        ENABLE_CHECKS &&
                                        rLocal1.
                                          size() ==
                                        0) {
                        
//#line 1148
throw new java.
                          lang.
                          RuntimeException(
                          "Destination distribution " +
                          "is empty");
                    }
                    
//#line 1151
final int rsize =
                      rLocal1.
                        size();
                    
//#line 1152
final int offset =
                      rLocal1.
                        low();
                    
//#line 1154
/* template:array_set { */(ter).set((java.
                                                                         lang.
                                                                         Math.
                                                                         abs(
                                                                         /* template:array_get { */((sizes).get(pl))/* } */ -
                                                                           rsize) +
                                                                         java.
                                                                           lang.
                                                                           Math.
                                                                           abs(
                                                                           /* template:array_get { */((offsets).get(pl))/* } */ -
                                                                             offset)),pl)/* } */;
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp126) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp126);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 1159
int ierr =
              0;
            
//#line 1160
if (iter <=
                                mter) {
                
//#line 1161
if (pr.
                                    max() !=
                                    0) {
                    
//#line 1162
ierr =
                      pr.
                        max();
                    
//#line 1163
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                  lang.
                                                                                                                  System.
                                                                                                                  err))/* } */.println("Local field overflow error, " +
                                                                                                                                       "ierr = " +
                                                                                                                                       ierr);
                    
//#line 1165
break;
                }
                
//#line 1168
if (iter <
                                    mter) {
                    
//#line 1169
continue;
                } else {
                    
//#line 1171
break;
                }
            }
            
//#line 1175
if (iter >
                                10) {
                
//#line 1176
throw new java.
                  lang.
                  RuntimeException(
                  "Too many iterations");
            }
            
//#line 1179
final x10.
              lang.
              dist dFlags =
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
                    1)),
                /* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 1180
final x10.
              lang.
              IntReferenceArray flags =
              /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dFlags,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
            
//#line 1181
/* template:array_set { */(flags).set(pr.
                                                                  max(),0)/* } */;
            
//#line 1182
/* template:array_set { */(flags).set(ter.
                                                                  max(),1)/* } */;
            
//#line 1184
if (/* template:array_get { */((flags).get(0))/* } */ !=
                                0) {
                
//#line 1185
ierr =
                  /* template:array_get { */((flags).get(0))/* } */;
                
//#line 1186
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                              lang.
                                                                                                              System.
                                                                                                              err))/* } */.println("Global field overflow error, " +
                                                                                                                                   "ierr = " +
                                                                                                                                   ierr);
                
//#line 1188
break;
            }
            
//#line 1191
if (/* template:array_get { */((flags).get(1))/* } */ !=
                                0) {
                
//#line 1192
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                              lang.
                                                                                                              System.
                                                                                                              err))/* } */.println("Info: fields being passed " +
                                                                                                                                   "further = " +
                                                                                                                                   /* template:array_get { */((flags).get(1))/* } */);
            } else {
                
//#line 1195
mter =
                  iter;
                
//#line 1196
break;
            }
        }while(!done); 
        
//#line 1201
final x10.
          lang.
          DoubleReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dDst,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 1202
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1202
/* template:ateach { */
            {
            	x10.lang.dist __var22____distCopy = x10.
                                                   lang.
                                                   dist.
                                                   UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator __var22____ = __var22____distCopy.iterator();
            		 __var22____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var22__ = (x10.
              lang.
              point) __var22____.next();
            		/* Join: { */final int pl =
              /* template:array_get { */((__var22__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var22____distCopy.get(__var22__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int pl =
              /* template:array_get { */((__var22__).get(0))/* } */;/* } */
{
                
//#line 1203
final x10.
                  lang.
                  region rLocal1 =
                  X10Util.
                    getLRank2D(
                    dDst,
                    0);
                
//#line 1205
if (X10Util.
                                    ENABLE_CHECKS) {
                    
//#line 1206
if (/* template:array_get { */((sizes).get(pl))/* } */ <=
                                        0) {
                        
//#line 1207
throw new java.
                          lang.
                          RuntimeException(
                          "Cannot make non-existant " +
                          "region");
                    }
                    
//#line 1210
if (/* template:array_get { */((sizes).get(pl))/* } */ !=
                                        rLocal1.
                                          size() ||
                                        /* template:array_get { */((offsets).get(pl))/* } */ !=
                                        rLocal1.
                                          low()) {
                        
//#line 1212
throw new java.
                          lang.
                          RuntimeException(
                          "Regions don\'t match result " +
                          "dist");
                    }
                }
                
//#line 1217
/* template:foreach { */
                for (java.util.Iterator __var23____ = (x10.
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
                                                           /* template:array_get { */((sizes).get(pl))/* } */ -
                                                             1),
                                                         rRank2)).iterator(); __var23____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var23__ = (x10.
                  lang.
                  point) __var23____.next();
                	/* Join: { */final int i =
                  /* template:array_get { */((__var23__).get(0))/* } */;
final int j =
                  /* template:array_get { */((__var23__).get(1))/* } */;/* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var23__).get(0))/* } */;
final int j =
                  /* template:array_get { */((__var23__).get(1))/* } */;/* } */
{
                    
//#line 1218
/* template:array_set { */(result).set(/* template:array_get { */((srcBuffer).get(/* Join: { */pl,i,j/* } */))/* } */,/* Join: { *//* template:array_get { */((offsets).get(pl))/* } */ +
                      i,j/* } */)/* } */;
                }/* } */
                			}
                		});
                }
                /* } */
                
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp133) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp133);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1222
return result;
    }
    
    
//#line 1228
public x10.
                    lang.
                    DoubleReferenceArray
                    cropField(
                    final x10.
                      lang.
                      DoubleReferenceArray data,
                    final x10.
                      lang.
                      DoubleReferenceArray guards) {
        
//#line 1230
final x10.
          lang.
          region rRank1 =
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
              YLENGTH -
                1));
        
//#line 1231
final x10.
          lang.
          region rRank2 =
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
              XLENGTH));
        
//#line 1232
final x10.
          lang.
          dist dGuard =
          guards.
            distribution;
        
//#line 1233
final x10.
          lang.
          region rGuard =
          X10Util.
            get2DPRegion(
            dGuard,
            x10.
              lang.
              place.
              places(
              x10.
                lang.
                place.
                MAX_PLACES -
                1));
        
//#line 1236
final x10.
          lang.
          dist dResult =
          X10Util.
            distBlockStar2(
            rRank1,
            rRank2);
        
//#line 1237
final x10.
          lang.
          DoubleReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dResult,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 1241
/* template:forloop { */
        for (java.util.Iterator pl__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pl__.hasNext(); ) {
        	final  x10.
          lang.
          point pl = (x10.
          lang.
          point) pl__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 1242
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1242
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                                lang.
                                                                                dist.
                                                                                UNIQUE.
                                                                                get(
                                                                                pl))).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1243
final x10.
                      lang.
                      dist dData =
                      data.
                        distribution;
                    
//#line 1244
final x10.
                      lang.
                      region rLocalS =
                      X10Util.
                        get2DLRegion(
                        dData);
                    
//#line 1245
final x10.
                      lang.
                      region rLocalS1 =
                      X10Util.
                        getRank2D(
                        rLocalS,
                        0);
                    
//#line 1246
if (rLocalS.
                                        size() >
                                        0 &&
                                        rLocalS1.
                                          low() <
                                        YLENGTH) {
                        
//#line 1247
final x10.
                          lang.
                          place pDst1 =
                          x10.
                            lang.
                            place.
                            places(
                            2 *
                              /* template:array_get { */((pl).get(0))/* } */);
                        
//#line 1248
final x10.
                          lang.
                          place pDst2 =
                          x10.
                            lang.
                            place.
                            places(
                            2 *
                              /* template:array_get { */((pl).get(0))/* } */ +
                              1);
                        
//#line 1250
final x10.
                          lang.
                          doubleArray sBuffer =
                          (x10.
                            lang.
                            doubleArray)
                            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(rLocalS.
                                                                                                                                         toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                             	public double apply(/* Join: { */x10.
                               lang.
                               point pt/* } */, double dummy) { {
                                 
//#line 1253
return /* template:array_get { */((data).get(pt))/* } */;
                             } }
                             }/* } */,true,false,false)/* } */);
                        
//#line 1256
/* template:Async { */(x10.lang.Runtime.asPlace(pDst1)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 1257
final x10.
                              lang.
                              region rLocalD =
                              X10Util.
                                get2DLRegion(
                                dResult);
                            
//#line 1259
/* template:foreach { */
                            for (java.util.Iterator pt__ = (rLocalD).iterator(); pt__.hasNext(); ) {
                            	final  x10.
                              lang.
                              point pt = (x10.
                              lang.
                              point) pt__.next();
                            	/* Join: { *//* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { *//* } */
{
                                
//#line 1260
/* template:array_set { */(result).set(/* template:array_get { */((sBuffer).get(pt))/* } */,pt)/* } */;
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                        }
                        		}
                        	});/* } */
                        
//#line 1264
/* template:Async { */(x10.lang.Runtime.asPlace(pDst2)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 1265
final x10.
                              lang.
                              region rLocalD =
                              X10Util.
                                get2DLRegion(
                                dResult);
                            
//#line 1267
/* template:foreach { */
                            for (java.util.Iterator pt__ = (rLocalD).iterator(); pt__.hasNext(); ) {
                            	final  x10.
                              lang.
                              point pt = (x10.
                              lang.
                              point) pt__.next();
                            	/* Join: { *//* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { *//* } */
{
                                
//#line 1268
/* template:array_set { */(result).set(/* template:array_get { */((sBuffer).get(pt))/* } */,pt)/* } */;
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                        }
                        		}
                        	});/* } */
                    }
                    
//#line 1273
if (rLocalS1.
                                        contains(
                                        x10.
                                          lang.
                                          point.
                                          factory.
                                          point(
                                          YLENGTH))) {
                        
//#line 1274
final x10.
                          lang.
                          doubleArray sBuffer =
                          (x10.
                            lang.
                            doubleArray)
                            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(rGuard.
                                                                                                                                         toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                             	public double apply(/* Join: { */x10.
                               lang.
                               point pt/* } */, double dummy) { {
                                 
//#line 1277
return /* template:array_get { */((data).get(pt))/* } */;
                             } }
                             }/* } */,true,false,false)/* } */);
                        
//#line 1280
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                                        lang.
                                                                                        place.
                                                                                        places(
                                                                                        x10.
                                                                                          lang.
                                                                                          place.
                                                                                          MAX_PLACES -
                                                                                          1))).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 1281
/* template:foreach { */
                            for (java.util.Iterator pt__ = (rGuard).iterator(); pt__.hasNext(); ) {
                            	final  x10.
                              lang.
                              point pt = (x10.
                              lang.
                              point) pt__.next();
                            	/* Join: { *//* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { *//* } */
{
                                
//#line 1282
/* template:array_set { */(guards).set(/* template:array_get { */((sBuffer).get(pt))/* } */,pt)/* } */;
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                        }
                        		}
                        	});/* } */
                    }
                }
                		}
                	});/* } */
            }
            	} catch (Throwable tmp134) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp134);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
        
//#line 1287
return result;
    }
    
    
//#line 1294
public void
                    loadGuards(
                    final x10.
                      lang.
                      DoubleReferenceArray data,
                    final x10.
                      lang.
                      DoubleReferenceArray guards) {
        
//#line 1296
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1296
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 1297
if (!(/* template:here { */x10.lang.Runtime.here()/* } */).
                                     isFirst()) {
                    
//#line 1298
final x10.
                      lang.
                      dist dGuard =
                      guards.
                        distribution;
                    
//#line 1299
final x10.
                      lang.
                      region rGuard =
                      X10Util.
                        get2DPRegion(
                        dGuard,
                        (/* template:here { */x10.lang.Runtime.here()/* } */).
                          prev());
                    
//#line 1301
final x10.
                      lang.
                      doubleArray sBuffer =
                      (x10.
                        lang.
                        doubleArray)
                        (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(rGuard.
                                                                                                                                     toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                         	public double apply(/* Join: { */x10.
                           lang.
                           point pt/* } */, double dummy) { {
                             
//#line 1304
return /* template:array_get { */((data).get(pt))/* } */;
                         } }
                         }/* } */,true,false,false)/* } */);
                    
//#line 1307
/* template:Async { */(x10.lang.Runtime.asPlace((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                    prev())).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1308
/* template:foreach { */
                        for (java.util.Iterator pt__ = (rGuard).iterator(); pt__.hasNext(); ) {
                        	final  x10.
                          lang.
                          point pt = (x10.
                          lang.
                          point) pt__.next();
                        	/* Join: { *//* } */
                        	x10.lang.Runtime.here().runAsync
                        		(new x10.runtime.Activity() {
                        			public void runX10Task() {
                        				/* Join: { *//* Join: { *//* } */
{
                            
//#line 1309
/* template:array_set { */(guards).set(/* template:array_get { */((sBuffer).get(pt))/* } */,pt)/* } */;
                        }/* } */
                        			}
                        		});
                        }
                        /* } */
                        
                    }
                    		}
                    	});/* } */
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp135) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp135);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 1319
public x10.
                    lang.
                    IntReferenceArray
                    makeInfoArray(
                    ) {
        
//#line 1320
final x10.
          lang.
          dist dInfo =
          (x10.
            lang.
            dist)
            ((x10.
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
                    6)),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 1321
return /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dInfo,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 1321
return 0;
        } }
        }/* } */,true,true,false)/* } */;
    }
    
    
//#line 1341
public x10.
                    lang.
                    GenericReferenceArray
                    moveParticles(
                    final x10.
                      lang.
                      GenericReferenceArray particles,
                    final x10.
                      lang.
                      dist dFieldSpace,
                    final x10.
                      lang.
                      IntReferenceArray info) {
        
//#line 1347
final int MAX =
          MOVE_PARTICLES_MAX;
        
//#line 1348
final int MAX_BUFFER =
          MOVE_PARTICLES_MAX_BUFFER;
        
//#line 1349
final int ITER_MAX =
          20;
        
//#line 1351
final x10.
          lang.
          region rPart =
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
              MAX -
                1));
        
//#line 1352
final x10.
          lang.
          region rBuffer =
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
              MAX_BUFFER -
                1));
        
//#line 1353
final x10.
          lang.
          dist dUnique =
          (x10.
            lang.
            dist)
            x10.
              lang.
              dist.
              UNIQUE;
        
//#line 1355
final x10.
          lang.
          dist dPart =
          X10Util.
            extendDistRank2D(
            dUnique,
            rPart);
        
//#line 1356
final x10.
          lang.
          dist dBuffer =
          X10Util.
            extendDistRank2D(
            dUnique,
            rBuffer);
        
//#line 1361
final x10.
          lang.
          GenericReferenceArray part =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dPart,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 1364
final x10.
          lang.
          GenericReferenceArray sBufferL =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dBuffer,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 1365
final x10.
          lang.
          GenericReferenceArray sBufferR =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dBuffer,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 1366
final x10.
          lang.
          GenericReferenceArray rBufferL =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dBuffer,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 1367
final x10.
          lang.
          GenericReferenceArray rBufferR =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dBuffer,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 1370
final x10.
          lang.
          IntReferenceArray inLt =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 1371
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 1372
final x10.
          lang.
          IntReferenceArray inRt =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 1373
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 1374
final x10.
          lang.
          IntReferenceArray outLt =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 1375
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 1376
final x10.
          lang.
          IntReferenceArray outRt =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 1377
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 1378
final x10.
          lang.
          IntReferenceArray nPart =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 1379
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 1382
x10.
          lang.
          IntReferenceArray nPartOld =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 1383
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 1387
final x10.
          lang.
          IntReferenceArray holes =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dPart,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 1388
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 1391
final x10.
          lang.
          dist dFlags =
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
                3)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1392
final x10.
          lang.
          IntReferenceArray nSent =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 1393
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 1394
final x10.
          lang.
          IntReferenceArray ibflg =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dFlags,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 1395
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 1398
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1398
/* template:ateach { */
            {
            	x10.lang.dist __var24____distCopy = x10.
                                                   lang.
                                                   dist.
                                                   UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator __var24____ = __var24____distCopy.iterator();
            		 __var24____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var24__ = (x10.
              lang.
              point) __var24____.next();
            		/* Join: { */final int pl =
              /* template:array_get { */((__var24__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var24____distCopy.get(__var24__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int pl =
              /* template:array_get { */((__var24__).get(0))/* } */;/* } */
{
                
//#line 1399
final x10.
                  lang.
                  region rLocal =
                  (x10.
                    lang.
                    region)
                    ((particles.
                        distribution.
                        restriction(
                        /* template:here { */x10.lang.Runtime.here()/* } */))).
                      region;
                
//#line 1402
if (rLocal.
                                    size() >
                                    0) {
                    
//#line 1403
final int offset =
                      rLocal.
                        low();
                    
//#line 1405
/* template:foreach { */
                    for (java.util.Iterator __var25____ = (rLocal).iterator(); __var25____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var25__ = (x10.
                      lang.
                      point) __var25____.next();
                    	/* Join: { */final int i =
                      /* template:array_get { */((__var25__).get(0))/* } */;/* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var25__).get(0))/* } */;/* } */
{
                        
//#line 1406
/* template:array_set { */(part).set(/* template:parametric { */((Particle)(/* template:array_get { */((particles).get(i))/* } */))/* } */,/* Join: { */pl,i -
                          offset/* } */)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                }
                
//#line 1409
/* template:array_set { */(nPart).set(rLocal.
                                                                      size(),pl)/* } */;
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp136) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp136);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1412
final x10.
          lang.
          region rFieldSpace =
          dFieldSpace.
            region;
        
//#line 1413
final double rsize =
          X10Util.
            getRank2D(
            rFieldSpace,
            1).
            size();
        
//#line 1414
int iter =
          2;
        
//#line 1415
int nter =
          0;
        
//#line 1417
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1417
/* template:foreach { */
            for (java.util.Iterator pt__ = (x10.
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
                                                6))).iterator(); pt__.hasNext(); ) {
            	final  x10.
              lang.
              point pt = (x10.
              lang.
              point) pt__.next();
            	/* Join: { *//* } */
            	x10.lang.Runtime.here().runAsync
            		(new x10.runtime.Activity() {
            			public void runX10Task() {
            				/* Join: { *//* Join: { *//* } */
{
                
//#line 1418
/* template:array_set { */(info).set(0,pt)/* } */;
            }/* } */
            			}
            		});
            }
            /* } */
            
        }
        	} catch (Throwable tmp137) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp137);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1422
nPartOld =
          nPartOld.
            add(
            nPart);
        
//#line 1424
boolean doneInner =
          false;
        
//#line 1425
boolean doneOuter =
          false;
        
//#line 1426
do  {
            
//#line 1428
int mter =
              0;
            
//#line 1430
final x10.
              lang.
              IntReferenceArray overflow =
              /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
            	public int apply(/* Join: { */x10.
              lang.
              point pt/* } */, int dummy) { {
                
//#line 1431
return 0;
            } }
            }/* } */,true,true,false)/* } */;
            
//#line 1433
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1433
/* template:ateach { */
                {
                	x10.lang.dist __var26____distCopy = x10.
                                                       lang.
                                                       dist.
                                                       UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator __var26____ = __var26____distCopy.iterator();
                		 __var26____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var26__ = (x10.
                  lang.
                  point) __var26____.next();
                		/* Join: { */final int pl =
                  /* template:array_get { */((__var26__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var26____distCopy.get(__var26__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int pl =
                  /* template:array_get { */((__var26__).get(0))/* } */;/* } */
{
                    
//#line 1434
final x10.
                      lang.
                      region rLocal =
                      (x10.
                        lang.
                        region)
                        ((dFieldSpace.
                            restriction(
                            /* template:here { */x10.lang.Runtime.here()/* } */))).
                          region;
                    
//#line 1436
final x10.
                      lang.
                      region rLocal1 =
                      X10Util.
                        getRank2D(
                        rLocal,
                        0);
                    
//#line 1437
final double ub =
                      rLocal1.
                        high() +
                      1;
                    
//#line 1438
final double lb =
                      rLocal1.
                        low();
                    
//#line 1440
/* template:array_set { */(outLt).set(0,pl)/* } */;
                    
//#line 1441
/* template:array_set { */(outRt).set(0,pl)/* } */;
                    
//#line 1443
/* template:forloop-mult { */{
                    x10.lang.region __var139__ = (x10.lang.region) x10.
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
                                                                       /* template:array_get { */((nPart).get(pl))/* } */ -
                                                                         1));
                    if (__var139__.size() > 0 && (__var139__ instanceof x10.array.MultiDimRegion || __var139__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var140__ = __var139__.rank(0).low(), __var141__ = __var139__.rank(0).high(); __var140__ <= __var141__; __var140__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int i = __var140__;
                    /* } */
                    /* } */
{
                        
//#line 1444
final Particle p =
                          /* template:parametric { */((Particle)(/* template:array_get { */((part).get(/* Join: { */pl,i/* } */))/* } */))/* } */;
                        
//#line 1446
double y =
                          p.
                            getY();
                        
//#line 1447
if (y <
                                            lb) {
                            
//#line 1449
if (/* template:array_get { */((outLt).get(pl))/* } */ <
                                                rBuffer.
                                                  size()) {
                                
//#line 1450
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                    isFirst()) {
                                    
//#line 1451
y =
                                      y +
                                        rsize;
                                }
                                
//#line 1453
/* template:array_set { */(sBufferL).set(p.
                                                                                         setY(
                                                                                         y),/* Join: { */pl,/* template:array_get { */((outLt).get(pl))/* } *//* } */)/* } */;
                                
//#line 1454
/* template:array_set { */(holes).set(i,/* Join: { */pl,/* template:array_get { */((outLt).get(pl))/* } */ +
                                  /* template:array_get { */((outRt).get(pl))/* } *//* } */)/* } */;
                                
//#line 1455
/* template:array_unary { */(outLt).postInc(pl)/* } */;
                            } else {
                                
//#line 1458
/* template:array_set { */(overflow).set(1,pl)/* } */;
                                
//#line 1459
break;
                            }
                        } else {
                            
//#line 1461
if (y >=
                                                ub) {
                                
//#line 1463
if (/* template:array_get { */((outRt).get(pl))/* } */ <
                                                    rBuffer.
                                                      size()) {
                                    
//#line 1464
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                        isLast()) {
                                        
//#line 1465
y =
                                          y -
                                            rsize;
                                    }
                                    
//#line 1467
/* template:array_set { */(sBufferR).set(p.
                                                                                             setY(
                                                                                             y),/* Join: { */pl,/* template:array_get { */((outRt).get(pl))/* } *//* } */)/* } */;
                                    
//#line 1468
/* template:array_set { */(holes).set(i,/* Join: { */pl,/* template:array_get { */((outLt).get(pl))/* } */ +
                                      /* template:array_get { */((outRt).get(pl))/* } *//* } */)/* } */;
                                    
//#line 1469
/* template:array_unary { */(outRt).postInc(pl)/* } */;
                                } else {
                                    
//#line 1472
/* template:array_set { */(overflow).set(1,pl)/* } */;
                                    
//#line 1473
break;
                                }
                            }
                        }
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var27____ = (__var139__).iterator(); __var27____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var27__ = (x10.
                      lang.
                      point) __var27____.next();
                    	/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var27__).get(0))/* } */;/* } */
{
                        
//#line 1444
final Particle p =
                          /* template:parametric { */((Particle)(/* template:array_get { */((part).get(/* Join: { */pl,i/* } */))/* } */))/* } */;
                        
//#line 1446
double y =
                          p.
                            getY();
                        
//#line 1447
if (y <
                                            lb) {
                            
//#line 1449
if (/* template:array_get { */((outLt).get(pl))/* } */ <
                                                rBuffer.
                                                  size()) {
                                
//#line 1450
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                    isFirst()) {
                                    
//#line 1451
y =
                                      y +
                                        rsize;
                                }
                                
//#line 1453
/* template:array_set { */(sBufferL).set(p.
                                                                                         setY(
                                                                                         y),/* Join: { */pl,/* template:array_get { */((outLt).get(pl))/* } *//* } */)/* } */;
                                
//#line 1454
/* template:array_set { */(holes).set(i,/* Join: { */pl,/* template:array_get { */((outLt).get(pl))/* } */ +
                                  /* template:array_get { */((outRt).get(pl))/* } *//* } */)/* } */;
                                
//#line 1455
/* template:array_unary { */(outLt).postInc(pl)/* } */;
                            } else {
                                
//#line 1458
/* template:array_set { */(overflow).set(1,pl)/* } */;
                                
//#line 1459
break;
                            }
                        } else {
                            
//#line 1461
if (y >=
                                                ub) {
                                
//#line 1463
if (/* template:array_get { */((outRt).get(pl))/* } */ <
                                                    rBuffer.
                                                      size()) {
                                    
//#line 1464
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                        isLast()) {
                                        
//#line 1465
y =
                                          y -
                                            rsize;
                                    }
                                    
//#line 1467
/* template:array_set { */(sBufferR).set(p.
                                                                                             setY(
                                                                                             y),/* Join: { */pl,/* template:array_get { */((outRt).get(pl))/* } *//* } */)/* } */;
                                    
//#line 1468
/* template:array_set { */(holes).set(i,/* Join: { */pl,/* template:array_get { */((outLt).get(pl))/* } */ +
                                      /* template:array_get { */((outRt).get(pl))/* } *//* } */)/* } */;
                                    
//#line 1469
/* template:array_unary { */(outRt).postInc(pl)/* } */;
                                } else {
                                    
//#line 1472
/* template:array_set { */(overflow).set(1,pl)/* } */;
                                    
//#line 1473
break;
                                }
                            }
                        }
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                    
//#line 1478
/* template:array_set { */(nSent).set(/* template:array_get { */((outLt).get(pl))/* } */ +
                      /* template:array_get { */((outRt).get(pl))/* } */,pl)/* } */;
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp138) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp138);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 1484
/* template:array_set { */(ibflg).set(overflow.
                                                                  max(),2)/* } */;
            
//#line 1487
do  {
                
//#line 1488
iter =
                  iter +
                    2;
                
//#line 1489
mter =
                  mter +
                    1;
                
//#line 1492
transferParticles(
                                sBufferL,
                                sBufferR,
                                outLt,
                                outRt,
                                rBufferL,
                                rBufferR,
                                inLt,
                                inRt);
                
//#line 1496
final x10.
                  lang.
                  IntReferenceArray outgoing =
                  /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
                
//#line 1497
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 1497
/* template:ateach { */
                    {
                    	x10.lang.dist __var28____distCopy = x10.
                                                           lang.
                                                           dist.
                                                           UNIQUE; // make copy to avoid recomputation
                    	for (java.util.Iterator __var28____ = __var28____distCopy.iterator();
                    		 __var28____.hasNext(); )
                    	{
                    		final  x10.
                      lang.
                      point __var28__ = (x10.
                      lang.
                      point) __var28____.next();
                    		/* Join: { */final int pl =
                      /* template:array_get { */((__var28__).get(0))/* } */;/* } */
                    		((x10.runtime.Place) __var28____distCopy.get(__var28__)).runAsync
                    			(new x10.runtime.Activity() {
                    				public void runX10Task() {
                    					/* Join: { *//* Join: { */final int pl =
                      /* template:array_get { */((__var28__).get(0))/* } */;/* } */
{
                        
//#line 1498
final x10.
                          lang.
                          region rLocal =
                          (x10.
                            lang.
                            region)
                            ((dFieldSpace.
                                restriction(
                                /* template:here { */x10.lang.Runtime.here()/* } */))).
                              region;
                        
//#line 1500
final x10.
                          lang.
                          region rLocal1 =
                          X10Util.
                            getRank2D(
                            rLocal,
                            0);
                        
//#line 1501
final double ub =
                          rLocal1.
                            high() +
                          1;
                        
//#line 1502
final double lb =
                          rLocal1.
                            low();
                        
//#line 1505
/* template:array_set { */(outLt).set(0,pl)/* } */;
                        
//#line 1506
/* template:array_set { */(outRt).set(0,pl)/* } */;
                        
//#line 1508
int belowLeft =
                          0;
                        
//#line 1509
/* template:forloop-mult { */{
                        x10.lang.region __var143__ = (x10.lang.region) x10.
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
                                                                           /* template:array_get { */((inRt).get(pl))/* } */ -
                                                                             1));
                        if (__var143__.size() > 0 && (__var143__ instanceof x10.array.MultiDimRegion || __var143__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var144__ = __var143__.rank(0).low(), __var145__ = __var143__.rank(0).high(); __var144__ <= __var145__; __var144__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i = __var144__;
                        /* } */
                        /* } */
{
                            
//#line 1510
final Particle p =
                              /* template:parametric { */((Particle)(/* template:array_get { */((rBufferR).get(/* Join: { */pl,i/* } */))/* } */))/* } */;
                            
//#line 1511
final double y =
                              p.
                                getY();
                            
//#line 1512
if (y <
                                                lb) {
                                
//#line 1513
/* template:array_unary { */(outLt).postInc(pl)/* } */;
                            }
                            
//#line 1515
if (y >=
                                                ub) {
                                
//#line 1516
/* template:array_unary { */(outRt).postInc(pl)/* } */;
                            }
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var29____ = (__var143__).iterator(); __var29____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var29__ = (x10.
                          lang.
                          point) __var29____.next();
                        	/* Join: { *//* Join: { */final int i =
                          /* template:array_get { */((__var29__).get(0))/* } */;/* } */
{
                            
//#line 1510
final Particle p =
                              /* template:parametric { */((Particle)(/* template:array_get { */((rBufferR).get(/* Join: { */pl,i/* } */))/* } */))/* } */;
                            
//#line 1511
final double y =
                              p.
                                getY();
                            
//#line 1512
if (y <
                                                lb) {
                                
//#line 1513
/* template:array_unary { */(outLt).postInc(pl)/* } */;
                            }
                            
//#line 1515
if (y >=
                                                ub) {
                                
//#line 1516
/* template:array_unary { */(outRt).postInc(pl)/* } */;
                            }
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
                        
//#line 1520
if (/* template:array_get { */((outRt).get(pl))/* } */ !=
                                            0) {
                            
//#line 1521
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                          lang.
                                                                                                                          System.
                                                                                                                          err))/* } */.println("Info: particles returning up");
                        }
                        
//#line 1525
/* template:forloop-mult { */{
                        x10.lang.region __var146__ = (x10.lang.region) x10.
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
                                                                           /* template:array_get { */((inLt).get(pl))/* } */ -
                                                                             1));
                        if (__var146__.size() > 0 && (__var146__ instanceof x10.array.MultiDimRegion || __var146__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var147__ = __var146__.rank(0).low(), __var148__ = __var146__.rank(0).high(); __var147__ <= __var148__; __var147__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i = __var147__;
                        /* } */
                        /* } */
{
                            
//#line 1526
final Particle p =
                              /* template:parametric { */((Particle)(/* template:array_get { */((rBufferL).get(/* Join: { */pl,i/* } */))/* } */))/* } */;
                            
//#line 1527
final double y =
                              p.
                                getY();
                            
//#line 1528
if (y >=
                                                ub) {
                                
//#line 1529
/* template:array_unary { */(outRt).postInc(pl)/* } */;
                            }
                            
//#line 1531
if (y <
                                                lb) {
                                
//#line 1532
belowLeft++;
                            }
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var30____ = (__var146__).iterator(); __var30____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var30__ = (x10.
                          lang.
                          point) __var30____.next();
                        	/* Join: { *//* Join: { */final int i =
                          /* template:array_get { */((__var30__).get(0))/* } */;/* } */
{
                            
//#line 1526
final Particle p =
                              /* template:parametric { */((Particle)(/* template:array_get { */((rBufferL).get(/* Join: { */pl,i/* } */))/* } */))/* } */;
                            
//#line 1527
final double y =
                              p.
                                getY();
                            
//#line 1528
if (y >=
                                                ub) {
                                
//#line 1529
/* template:array_unary { */(outRt).postInc(pl)/* } */;
                            }
                            
//#line 1531
if (y <
                                                lb) {
                                
//#line 1532
belowLeft++;
                            }
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
                        
//#line 1536
if (belowLeft !=
                                            0) {
                            
//#line 1537
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                          lang.
                                                                                                                          System.
                                                                                                                          err))/* } */.println("Info: particles returning down");
                        }
                        
//#line 1539
/* template:array_set { */(outLt).set(/* template:array_get { */((outLt).get(pl))/* } */ +
                          belowLeft,pl)/* } */;
                        
//#line 1540
/* template:array_set { */(outgoing).set(/* template:array_get { */((outLt).get(pl))/* } */ +
                          /* template:array_get { */((outRt).get(pl))/* } */,pl)/* } */;
                    }/* } */
                    				}
                    			});
                    	}
                    }
                    /* } */
                    
                }
                	} catch (Throwable tmp142) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp142);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 1543
/* template:array_set { */(ibflg).set(outgoing.
                                                                      max(),1)/* } */;
                
//#line 1545
if (/* template:array_get { */((ibflg).get(1))/* } */ !=
                                    0) {
                    
//#line 1547
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 1547
/* template:ateach { */
                        {
                        	x10.lang.dist __var31____distCopy = x10.
                                                               lang.
                                                               dist.
                                                               UNIQUE; // make copy to avoid recomputation
                        	for (java.util.Iterator __var31____ = __var31____distCopy.iterator();
                        		 __var31____.hasNext(); )
                        	{
                        		final  x10.
                          lang.
                          point __var31__ = (x10.
                          lang.
                          point) __var31____.next();
                        		/* Join: { */final int pl =
                          /* template:array_get { */((__var31__).get(0))/* } */;/* } */
                        		((x10.runtime.Place) __var31____distCopy.get(__var31__)).runAsync
                        			(new x10.runtime.Activity() {
                        				public void runX10Task() {
                        					/* Join: { *//* Join: { */final int pl =
                          /* template:array_get { */((__var31__).get(0))/* } */;/* } */
{
                            
//#line 1548
final x10.
                              lang.
                              region rLocal =
                              (x10.
                                lang.
                                region)
                                ((dFieldSpace.
                                    restriction(
                                    /* template:here { */x10.lang.Runtime.here()/* } */))).
                                  region;
                            
//#line 1550
final x10.
                              lang.
                              region rLocal1 =
                              X10Util.
                                getRank2D(
                                rLocal,
                                0);
                            
//#line 1552
final double ub =
                              rLocal1.
                                high() +
                              1;
                            
//#line 1553
final double lb =
                              rLocal1.
                                low();
                            
//#line 1555
/* template:array_set { */(outLt).set(0,pl)/* } */;
                            
//#line 1556
/* template:array_set { */(outRt).set(0,pl)/* } */;
                            
//#line 1557
/* template:array_set { */(overflow).set(0,pl)/* } */;
                            
//#line 1559
int inRightStaying =
                              0;
                            
//#line 1560
/* template:forloop-mult { */{
                            x10.lang.region __var150__ = (x10.lang.region) x10.
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
                                                                               /* template:array_get { */((inRt).get(pl))/* } */ -
                                                                                 1));
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
                                
//#line 1561
final Particle p =
                                  /* template:parametric { */((Particle)(/* template:array_get { */((rBufferR).get(/* Join: { */pl,i/* } */))/* } */))/* } */;
                                
//#line 1562
double y =
                                  p.
                                    getY();
                                
//#line 1564
if (y <
                                                    lb) {
                                    
//#line 1566
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                        isFirst()) {
                                        
//#line 1567
y =
                                          y +
                                            rsize;
                                    }
                                    
//#line 1569
/* template:array_set { */(sBufferL).set(p.
                                                                                             setY(
                                                                                             y),/* Join: { */pl,/* template:array_get { */((outLt).get(pl))/* } *//* } */)/* } */;
                                    
//#line 1570
/* template:array_unary { */(outLt).postInc(pl)/* } */;
                                } else {
                                    
//#line 1571
if (y >=
                                                        ub) {
                                        
//#line 1573
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                                      lang.
                                                                                                                                      System.
                                                                                                                                      err))/* } */.println("Particle returning up -- " +
                                                                                                                                                           "should not happen: " +
                                                                                                                                                           p.
                                                                                                                                                             toString());
                                        
//#line 1576
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                            isLast()) {
                                            
//#line 1577
y =
                                              y -
                                                rsize;
                                        }
                                        
//#line 1579
/* template:array_set { */(sBufferR).set(p.
                                                                                                 setY(
                                                                                                 y),/* Join: { */pl,/* template:array_get { */((outRt).get(pl))/* } *//* } */)/* } */;
                                        
//#line 1580
/* template:array_unary { */(outRt).postInc(pl)/* } */;
                                    } else {
                                        
//#line 1582
/* template:array_set { */(rBufferR).set(p,/* Join: { */pl,inRightStaying/* } */)/* } */;
                                        
//#line 1583
inRightStaying++;
                                    }
                                }
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var32____ = (__var150__).iterator(); __var32____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var32__ = (x10.
                              lang.
                              point) __var32____.next();
                            	/* Join: { *//* Join: { */final int i =
                              /* template:array_get { */((__var32__).get(0))/* } */;/* } */
{
                                
//#line 1561
final Particle p =
                                  /* template:parametric { */((Particle)(/* template:array_get { */((rBufferR).get(/* Join: { */pl,i/* } */))/* } */))/* } */;
                                
//#line 1562
double y =
                                  p.
                                    getY();
                                
//#line 1564
if (y <
                                                    lb) {
                                    
//#line 1566
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                        isFirst()) {
                                        
//#line 1567
y =
                                          y +
                                            rsize;
                                    }
                                    
//#line 1569
/* template:array_set { */(sBufferL).set(p.
                                                                                             setY(
                                                                                             y),/* Join: { */pl,/* template:array_get { */((outLt).get(pl))/* } *//* } */)/* } */;
                                    
//#line 1570
/* template:array_unary { */(outLt).postInc(pl)/* } */;
                                } else {
                                    
//#line 1571
if (y >=
                                                        ub) {
                                        
//#line 1573
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                                      lang.
                                                                                                                                      System.
                                                                                                                                      err))/* } */.println("Particle returning up -- " +
                                                                                                                                                           "should not happen: " +
                                                                                                                                                           p.
                                                                                                                                                             toString());
                                        
//#line 1576
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                            isLast()) {
                                            
//#line 1577
y =
                                              y -
                                                rsize;
                                        }
                                        
//#line 1579
/* template:array_set { */(sBufferR).set(p.
                                                                                                 setY(
                                                                                                 y),/* Join: { */pl,/* template:array_get { */((outRt).get(pl))/* } *//* } */)/* } */;
                                        
//#line 1580
/* template:array_unary { */(outRt).postInc(pl)/* } */;
                                    } else {
                                        
//#line 1582
/* template:array_set { */(rBufferR).set(p,/* Join: { */pl,inRightStaying/* } */)/* } */;
                                        
//#line 1583
inRightStaying++;
                                    }
                                }
                            }/* } */
                            }
                            /* } */
                            
                            }
                            }
                            /* } */
                            
                            
//#line 1586
/* template:array_set { */(inRt).set(inRightStaying,pl)/* } */;
                            
//#line 1589
int inLeftStaying =
                              0;
                            
//#line 1590
/* template:forloop-mult { */{
                            x10.lang.region __var153__ = (x10.lang.region) x10.
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
                                                                               /* template:array_get { */((inLt).get(pl))/* } */ -
                                                                                 1));
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
                                
//#line 1591
final Particle p =
                                  /* template:parametric { */((Particle)(/* template:array_get { */((rBufferL).get(/* Join: { */pl,i/* } */))/* } */))/* } */;
                                
//#line 1592
double y =
                                  p.
                                    getY();
                                
//#line 1594
if (y >=
                                                    ub) {
                                    
//#line 1596
if (/* template:array_get { */((outRt).get(pl))/* } */ <
                                                        rBuffer.
                                                          size()) {
                                        
//#line 1597
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                            isLast()) {
                                            
//#line 1598
y =
                                              y -
                                                rsize;
                                        }
                                        
//#line 1600
/* template:array_set { */(sBufferR).set(p.
                                                                                                 setY(
                                                                                                 y),/* Join: { */pl,/* template:array_get { */((outRt).get(pl))/* } *//* } */)/* } */;
                                        
//#line 1601
/* template:array_unary { */(outRt).postInc(pl)/* } */;
                                    } else {
                                        
//#line 1603
/* template:array_set { */(overflow).set(2 *
                                          rBuffer.
                                            size(),pl)/* } */;
                                        
//#line 1604
break;
                                    }
                                } else {
                                    
//#line 1606
if (y <
                                                        lb) {
                                        
//#line 1608
if (/* template:array_get { */((outLt).get(pl))/* } */ <
                                                            rBuffer.
                                                              size()) {
                                            
//#line 1609
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                isFirst()) {
                                                
//#line 1610
y =
                                                  y +
                                                    rsize;
                                            }
                                            
//#line 1612
/* template:array_set { */(sBufferL).set(p.
                                                                                                     setY(
                                                                                                     y),/* Join: { */pl,/* template:array_get { */((outLt).get(pl))/* } *//* } */)/* } */;
                                            
//#line 1613
/* template:array_unary { */(outLt).postInc(pl)/* } */;
                                        } else {
                                            
//#line 1615
/* template:array_set { */(overflow).set(2 *
                                              rBuffer.
                                                size(),pl)/* } */;
                                            
//#line 1616
break;
                                        }
                                    } else {
                                        
//#line 1619
/* template:array_set { */(rBufferL).set(p,/* Join: { */pl,inLeftStaying/* } */)/* } */;
                                        
//#line 1620
inLeftStaying++;
                                    }
                                }
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var33____ = (__var153__).iterator(); __var33____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var33__ = (x10.
                              lang.
                              point) __var33____.next();
                            	/* Join: { *//* Join: { */final int i =
                              /* template:array_get { */((__var33__).get(0))/* } */;/* } */
{
                                
//#line 1591
final Particle p =
                                  /* template:parametric { */((Particle)(/* template:array_get { */((rBufferL).get(/* Join: { */pl,i/* } */))/* } */))/* } */;
                                
//#line 1592
double y =
                                  p.
                                    getY();
                                
//#line 1594
if (y >=
                                                    ub) {
                                    
//#line 1596
if (/* template:array_get { */((outRt).get(pl))/* } */ <
                                                        rBuffer.
                                                          size()) {
                                        
//#line 1597
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                            isLast()) {
                                            
//#line 1598
y =
                                              y -
                                                rsize;
                                        }
                                        
//#line 1600
/* template:array_set { */(sBufferR).set(p.
                                                                                                 setY(
                                                                                                 y),/* Join: { */pl,/* template:array_get { */((outRt).get(pl))/* } *//* } */)/* } */;
                                        
//#line 1601
/* template:array_unary { */(outRt).postInc(pl)/* } */;
                                    } else {
                                        
//#line 1603
/* template:array_set { */(overflow).set(2 *
                                          rBuffer.
                                            size(),pl)/* } */;
                                        
//#line 1604
break;
                                    }
                                } else {
                                    
//#line 1606
if (y <
                                                        lb) {
                                        
//#line 1608
if (/* template:array_get { */((outLt).get(pl))/* } */ <
                                                            rBuffer.
                                                              size()) {
                                            
//#line 1609
if ((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                isFirst()) {
                                                
//#line 1610
y =
                                                  y +
                                                    rsize;
                                            }
                                            
//#line 1612
/* template:array_set { */(sBufferL).set(p.
                                                                                                     setY(
                                                                                                     y),/* Join: { */pl,/* template:array_get { */((outLt).get(pl))/* } *//* } */)/* } */;
                                            
//#line 1613
/* template:array_unary { */(outLt).postInc(pl)/* } */;
                                        } else {
                                            
//#line 1615
/* template:array_set { */(overflow).set(2 *
                                              rBuffer.
                                                size(),pl)/* } */;
                                            
//#line 1616
break;
                                        }
                                    } else {
                                        
//#line 1619
/* template:array_set { */(rBufferL).set(p,/* Join: { */pl,inLeftStaying/* } */)/* } */;
                                        
//#line 1620
inLeftStaying++;
                                    }
                                }
                            }/* } */
                            }
                            /* } */
                            
                            }
                            }
                            /* } */
                            
                            
//#line 1623
/* template:array_set { */(inLt).set(inLeftStaying,pl)/* } */;
                        }/* } */
                        				}
                        			});
                        	}
                        }
                        /* } */
                        
                    }
                    	} catch (Throwable tmp149) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp149);
                    	} finally {
                    		x10.lang.Runtime.getCurrentActivity().stopFinish();
                    	}
                    }
                    /* } */
                    
                }
                
//#line 1628
final int rSize =
                  rPart.
                    size();
                
//#line 1629
final x10.
                  lang.
                  IntReferenceArray tMaxSize =
                  (nPart.
                     add(
                     inLt).
                     add(
                     inRt).
                     sub(
                     nSent));
                
//#line 1631
final x10.
                  lang.
                  IntReferenceArray tMinSize =
                  ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                    	public int apply(/* Join: { */x10.
                      lang.
                      point pt/* } */, int dummy) { {
                        
//#line 1632
return rSize;
                    } }
                    }/* } */,true,true,false)/* } */)).
                    sub(
                    tMaxSize);
                
//#line 1636
/* template:array_set { */(info).set(tMaxSize.
                                                                     max(),1)/* } */;
                
//#line 1637
/* template:array_set { */(info).set(rSize -
                  tMinSize.
                    max(),2)/* } */;
                
//#line 1638
int err =
                  /* template:array_get { */((ibflg).get(1))/* } */ -
                  rPart.
                    size();
                
//#line 1639
if (err >
                                    0) {
                    
//#line 1640
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                  lang.
                                                                                                                  System.
                                                                                                                  err))/* } */.println("Particle overflow error, err = " +
                                                                                                                                       err);
                    
//#line 1641
/* template:array_set { */(info).set(err,0)/* } */;
                    
//#line 1642
return particles;
                }
                
//#line 1645
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 1645
/* template:ateach { */
                    {
                    	x10.lang.dist __var34____distCopy = x10.
                                                           lang.
                                                           dist.
                                                           UNIQUE; // make copy to avoid recomputation
                    	for (java.util.Iterator __var34____ = __var34____distCopy.iterator();
                    		 __var34____.hasNext(); )
                    	{
                    		final  x10.
                      lang.
                      point __var34__ = (x10.
                      lang.
                      point) __var34____.next();
                    		/* Join: { */final int pl =
                      /* template:array_get { */((__var34__).get(0))/* } */;/* } */
                    		((x10.runtime.Place) __var34____distCopy.get(__var34__)).runAsync
                    			(new x10.runtime.Activity() {
                    				public void runX10Task() {
                    					/* Join: { *//* Join: { */final int pl =
                      /* template:array_get { */((__var34__).get(0))/* } */;/* } */
{
                        
//#line 1646
int holesTotal =
                          /* template:array_get { */((nSent).get(pl))/* } */;
                        
//#line 1647
int holesLeft =
                          /* template:array_get { */((nSent).get(pl))/* } */;
                        
//#line 1651
int nMove =
                          X10Util.
                            minInt(
                            holesLeft,
                            /* template:array_get { */((inLt).get(pl))/* } */);
                        
//#line 1652
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 1652
/* template:foreach { */
                            for (java.util.Iterator __var35____ = (x10.
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
                                                                       nMove -
                                                                         1))).iterator(); __var35____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var35__ = (x10.
                              lang.
                              point) __var35____.next();
                            	/* Join: { */final int i =
                              /* template:array_get { */((__var35__).get(0))/* } */;/* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { */final int i =
                              /* template:array_get { */((__var35__).get(0))/* } */;/* } */
{
                                
//#line 1653
/* template:array_set { */(part).set(/* template:parametric { */((Particle)(/* template:array_get { */((rBufferL).get(/* Join: { */pl,i/* } */))/* } */))/* } */,/* Join: { */pl,/* template:array_get { */((holes).get(/* Join: { */pl,i/* } */))/* } *//* } */)/* } */;
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                        }
                        	} catch (Throwable tmp157) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp157);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                        
//#line 1656
holesLeft =
                          holesLeft -
                            /* template:array_get { */((inLt).get(pl))/* } */;
                        
//#line 1657
if (holesLeft >
                                            0) {
                            
//#line 1660
nMove =
                              X10Util.
                                minInt(
                                holesLeft,
                                /* template:array_get { */((inRt).get(pl))/* } */);
                            
//#line 1661
/* template:forloop-mult { */{
                            x10.lang.region __var158__ = (x10.lang.region) x10.
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
                                                                               nMove -
                                                                                 1));
                            if (__var158__.size() > 0 && (__var158__ instanceof x10.array.MultiDimRegion || __var158__ instanceof x10.array.ContiguousRange)) {
                            	/* Loop: { *//* template:forloop-mult-each { */
                            for (int __var159__ = __var158__.rank(0).low(), __var160__ = __var158__.rank(0).high(); __var159__ <= __var160__; __var159__++)
                            /* } */
                            /* } */ {
                            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                            final int i = __var159__;
                            /* } */
                            /* } */
{
                                
//#line 1662
/* template:array_set { */(part).set(/* template:parametric { */((Particle)(/* template:array_get { */((rBufferR).get(/* Join: { */pl,i/* } */))/* } */))/* } */,/* Join: { */pl,/* template:array_get { */((holes).get(/* Join: { */pl,i +
                                  /* template:array_get { */((inLt).get(pl))/* } *//* } */))/* } *//* } */)/* } */;
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var36____ = (__var158__).iterator(); __var36____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var36__ = (x10.
                              lang.
                              point) __var36____.next();
                            	/* Join: { *//* Join: { */final int i =
                              /* template:array_get { */((__var36__).get(0))/* } */;/* } */
{
                                
//#line 1662
/* template:array_set { */(part).set(/* template:parametric { */((Particle)(/* template:array_get { */((rBufferR).get(/* Join: { */pl,i/* } */))/* } */))/* } */,/* Join: { */pl,/* template:array_get { */((holes).get(/* Join: { */pl,i +
                                  /* template:array_get { */((inLt).get(pl))/* } *//* } */))/* } *//* } */)/* } */;
                            }/* } */
                            }
                            /* } */
                            
                            }
                            }
                            /* } */
                            
                        } else {
                            
//#line 1666
nMove =
                              -holesLeft;
                            
//#line 1667
/* template:forloop-mult { */{
                            x10.lang.region __var161__ = (x10.lang.region) x10.
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
                                                                               nMove -
                                                                                 1));
                            if (__var161__.size() > 0 && (__var161__ instanceof x10.array.MultiDimRegion || __var161__ instanceof x10.array.ContiguousRange)) {
                            	/* Loop: { *//* template:forloop-mult-each { */
                            for (int __var162__ = __var161__.rank(0).low(), __var163__ = __var161__.rank(0).high(); __var162__ <= __var163__; __var162__++)
                            /* } */
                            /* } */ {
                            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                            final int i = __var162__;
                            /* } */
                            /* } */
{
                                
//#line 1668
/* template:array_set { */(part).set(/* template:parametric { */((Particle)(/* template:array_get { */((rBufferL).get(/* Join: { */pl,i +
                                  holesTotal/* } */))/* } */))/* } */,/* Join: { */pl,i +
                                  /* template:array_get { */((nPart).get(pl))/* } *//* } */)/* } */;
                            }/* } */
                            	}
                            } else {
                            	/* template:forloop { */
                            for (java.util.Iterator __var37____ = (__var161__).iterator(); __var37____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var37__ = (x10.
                              lang.
                              point) __var37____.next();
                            	/* Join: { *//* Join: { */final int i =
                              /* template:array_get { */((__var37__).get(0))/* } */;/* } */
{
                                
//#line 1668
/* template:array_set { */(part).set(/* template:parametric { */((Particle)(/* template:array_get { */((rBufferL).get(/* Join: { */pl,i +
                                  holesTotal/* } */))/* } */))/* } */,/* Join: { */pl,i +
                                  /* template:array_get { */((nPart).get(pl))/* } *//* } */)/* } */;
                            }/* } */
                            }
                            /* } */
                            
                            }
                            }
                            /* } */
                            
                        }
                        
//#line 1673
if (holesLeft <=
                                            0) {
                            
//#line 1674
/* template:array_set { */(nPart).set(/* template:array_get { */((nPart).get(pl))/* } */ -
                              holesLeft,pl)/* } */;
                            
//#line 1675
holesTotal =
                              /* template:array_get { */((inLt).get(pl))/* } */;
                        }
                        
//#line 1678
holesLeft =
                          holesTotal -
                            ((/* template:array_get { */((inLt).get(pl))/* } */ +
                                /* template:array_get { */((inRt).get(pl))/* } */));
                        
//#line 1679
if (holesLeft >
                                            0) {
                            
//#line 1680
holesTotal =
                              /* template:array_get { */((inLt).get(pl))/* } */ +
                                /* template:array_get { */((inRt).get(pl))/* } */;
                            
//#line 1681
/* template:array_set { */(inRt).set(holesLeft,pl)/* } */;
                        } else {
                            
//#line 1683
holesTotal =
                              holesTotal -
                                /* template:array_get { */((inLt).get(pl))/* } */;
                            
//#line 1684
/* template:array_set { */(inRt).set(-holesLeft,pl)/* } */;
                        }
                        
//#line 1687
/* template:forloop-mult { */{
                        x10.lang.region __var164__ = (x10.lang.region) x10.
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
                                                                           /* template:array_get { */((inRt).get(pl))/* } */ -
                                                                             1));
                        if (__var164__.size() > 0 && (__var164__ instanceof x10.array.MultiDimRegion || __var164__ instanceof x10.array.ContiguousRange)) {
                        	/* Loop: { *//* template:forloop-mult-each { */
                        for (int __var165__ = __var164__.rank(0).low(), __var166__ = __var164__.rank(0).high(); __var165__ <= __var166__; __var165__++)
                        /* } */
                        /* } */ {
                        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                        final int i = __var165__;
                        /* } */
                        /* } */
{
                            
//#line 1691
if (holesLeft >
                                                0) {
                                
//#line 1692
final int i1 =
                                  /* template:array_get { */((nPart).get(pl))/* } */ -
                                  i -
                                  1;
                                
//#line 1693
final int i2 =
                                  holesTotal +
                                  holesLeft -
                                  i -
                                  1;
                                
//#line 1695
if (i1 >
                                                    /* template:array_get { */((holes).get(/* Join: { */pl,i2/* } */))/* } */) {
                                    
//#line 1697
/* template:array_set { */(part).set(/* template:parametric { */((Particle)(/* template:array_get { */((part).get(/* Join: { */pl,i1/* } */))/* } */))/* } */,/* Join: { */pl,/* template:array_get { */((holes).get(/* Join: { */pl,i2/* } */))/* } *//* } */)/* } */;
                                }
                            } else {
                                
//#line 1702
/* template:array_set { */(part).set(/* template:parametric { */((Particle)(/* template:array_get { */((rBufferR).get(/* Join: { */pl,i +
                                  holesTotal/* } */))/* } */))/* } */,/* Join: { */pl,i +
                                  /* template:array_get { */((nPart).get(pl))/* } *//* } */)/* } */;
                            }
                        }/* } */
                        	}
                        } else {
                        	/* template:forloop { */
                        for (java.util.Iterator __var38____ = (__var164__).iterator(); __var38____.hasNext(); ) {
                        	final  x10.
                          lang.
                          point __var38__ = (x10.
                          lang.
                          point) __var38____.next();
                        	/* Join: { *//* Join: { */final int i =
                          /* template:array_get { */((__var38__).get(0))/* } */;/* } */
{
                            
//#line 1691
if (holesLeft >
                                                0) {
                                
//#line 1692
final int i1 =
                                  /* template:array_get { */((nPart).get(pl))/* } */ -
                                  i -
                                  1;
                                
//#line 1693
final int i2 =
                                  holesTotal +
                                  holesLeft -
                                  i -
                                  1;
                                
//#line 1695
if (i1 >
                                                    /* template:array_get { */((holes).get(/* Join: { */pl,i2/* } */))/* } */) {
                                    
//#line 1697
/* template:array_set { */(part).set(/* template:parametric { */((Particle)(/* template:array_get { */((part).get(/* Join: { */pl,i1/* } */))/* } */))/* } */,/* Join: { */pl,/* template:array_get { */((holes).get(/* Join: { */pl,i2/* } */))/* } *//* } */)/* } */;
                                }
                            } else {
                                
//#line 1702
/* template:array_set { */(part).set(/* template:parametric { */((Particle)(/* template:array_get { */((rBufferR).get(/* Join: { */pl,i +
                                  holesTotal/* } */))/* } */))/* } */,/* Join: { */pl,i +
                                  /* template:array_get { */((nPart).get(pl))/* } *//* } */)/* } */;
                            }
                        }/* } */
                        }
                        /* } */
                        
                        }
                        }
                        /* } */
                        
                        
//#line 1707
if (holesLeft >
                                            0) {
                            
//#line 1708
/* template:array_set { */(nPart).set(/* template:array_get { */((nPart).get(pl))/* } */ -
                              /* template:array_get { */((inRt).get(pl))/* } */,pl)/* } */;
                        } else {
                            
//#line 1710
/* template:array_set { */(nPart).set(/* template:array_get { */((nPart).get(pl))/* } */ +
                              /* template:array_get { */((inRt).get(pl))/* } */,pl)/* } */;
                        }
                        
//#line 1712
/* template:array_set { */(nSent).set(0,pl)/* } */;
                    }/* } */
                    				}
                    			});
                    	}
                    }
                    /* } */
                    
                }
                	} catch (Throwable tmp156) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp156);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 1715
/* template:array_set { */(info).set(X10Util.
                                                                     maxInt(
                                                                     /* template:array_get { */((info).get(4))/* } */,
                                                                     mter),4)/* } */;
                
//#line 1717
if (/* template:array_get { */((ibflg).get(1))/* } */ >
                                    0) {
                    
//#line 1718
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                  lang.
                                                                                                                  System.
                                                                                                                  err))/* } */.println("Info: particles being passed" +
                                                                                                                                       " further = " +
                                                                                                                                       /* template:array_get { */((ibflg).get(1))/* } */);
                    
//#line 1720
if (/* template:array_get { */((ibflg).get(2))/* } */ >
                                        0) {
                        
//#line 1721
/* template:array_set { */(ibflg).set(1,2)/* } */;
                    }
                    
//#line 1723
if (iter >=
                                        ITER_MAX) {
                        
//#line 1724
err =
                          -(((iter -
                                2 /
                                2)));
                        
//#line 1725
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                      lang.
                                                                                                                      System.
                                                                                                                      err))/* } */.println("Iteration overflow, " +
                                                                                                                                           "iter = " +
                                                                                                                                           err);
                        
//#line 1727
/* template:array_set { */(info).set(err,0)/* } */;
                        
//#line 1728
doneInner =
                          true;
                        
//#line 1729
doneOuter =
                          true;
                    }
                } else {
                    
//#line 1732
doneInner =
                      true;
                }
            }while(!doneInner); 
            
//#line 1736
if (!doneOuter &&
                                /* template:array_get { */((ibflg).get(2))/* } */ >
                                0) {
                
//#line 1737
nter++;
                
//#line 1738
/* template:array_set { */(info).set(nter,3)/* } */;
            } else {
                
//#line 1740
doneOuter =
                  true;
            }
        }while(!doneOuter); 
        
//#line 1745
/* template:array_set { */(info).set(nPart.
                                                             sum(),5)/* } */;
        
//#line 1746
/* template:array_set { */(info).set(nPartOld.
                                                             sum(),6)/* } */;
        
//#line 1748
if (/* template:array_get { */((info).get(5))/* } */ !=
                            /* template:array_get { */((info).get(6))/* } */) {
            
//#line 1749
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                          lang.
                                                                                                          System.
                                                                                                          err))/* } */.println("Particle number error, old/new = " +
                                                                                                                               /* template:array_get { */((info).get(0))/* } */ +
                                                                                                                               " " +
                                                                                                                               /* template:array_get { */((info).get(1))/* } */);
            
//#line 1751
/* template:array_set { */(info).set(1,0)/* } */;
        }
        
//#line 1755
if (nter >
                            0) {
            
//#line 1756
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                          lang.
                                                                                                          System.
                                                                                                          err))/* } */.println("Info: " +
                                                                                                                               nter +
                                                                                                                               " buffer overflows, " +
                                                                                                                               "nbmax = " +
                                                                                                                               rBuffer.
                                                                                                                                 size());
        }
        
//#line 1760
return packParticleArray(
                               part,
                               nPart);
    }
    
    
//#line 1772
private void
                    transferParticles(
                    final x10.
                      lang.
                      GenericReferenceArray leftOutBuffer,
                    final x10.
                      lang.
                      GenericReferenceArray rightOutBuffer,
                    final x10.
                      lang.
                      IntReferenceArray outLeft,
                    final x10.
                      lang.
                      IntReferenceArray outRight,
                    final x10.
                      lang.
                      GenericReferenceArray leftInBuffer,
                    final x10.
                      lang.
                      GenericReferenceArray rightInBuffer,
                    final x10.
                      lang.
                      IntReferenceArray inLeft,
                    final x10.
                      lang.
                      IntReferenceArray inRight) {
        
//#line 1781
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1781
/* template:ateach { */
            {
            	x10.lang.dist __var39____distCopy = x10.
                                                   lang.
                                                   dist.
                                                   UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator __var39____ = __var39____distCopy.iterator();
            		 __var39____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var39__ = (x10.
              lang.
              point) __var39____.next();
            		/* Join: { */final int pl =
              /* template:array_get { */((__var39__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var39____distCopy.get(__var39__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int pl =
              /* template:array_get { */((__var39__).get(0))/* } */;/* } */
{
                
//#line 1783
final x10.
                  lang.
                  place pLeft =
                  (/* template:here { */x10.lang.Runtime.here()/* } */).
                    prev();
                
//#line 1784
final x10.
                  lang.
                  place pRight =
                  (/* template:here { */x10.lang.Runtime.here()/* } */).
                    next();
                
//#line 1785
final x10.
                  lang.
                  region rLeft =
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
                      /* template:array_get { */((outLeft).get(pl))/* } */ -
                        1));
                
//#line 1786
final x10.
                  lang.
                  region rRight =
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
                      /* template:array_get { */((outRight).get(pl))/* } */ -
                        1));
                
//#line 1788
final x10.
                  lang.
                  GenericReferenceArray lBuffer =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(rLeft.
                                                                                                                                  toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                     	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                       lang.
                       point __var40__/* } */, x10.compilergenerated.Parameter1 dummy) { {
                         
//#line 1790
final int i =
                           /* template:array_get { */((__var40__).get(0))/* } */;
                         
//#line 1791
return /* template:parametric { */((Particle)(/* template:array_get { */((leftOutBuffer).get(/* Join: { */pl,i/* } */))/* } */))/* } */;
                     } }
                     }/* } */,true,false,true)/* } */);
                
//#line 1794
final x10.
                  lang.
                  GenericReferenceArray rBuffer =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(rRight.
                                                                                                                                  toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                     	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                       lang.
                       point __var41__/* } */, x10.compilergenerated.Parameter1 dummy) { {
                         
//#line 1796
final int i =
                           /* template:array_get { */((__var41__).get(0))/* } */;
                         
//#line 1797
return /* template:parametric { */((Particle)(/* template:array_get { */((rightOutBuffer).get(/* Join: { */pl,i/* } */))/* } */))/* } */;
                     } }
                     }/* } */,true,false,true)/* } */);
                
//#line 1801
/* template:Async { */(x10.lang.Runtime.asPlace(pLeft)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1802
final int pid =
                      (/* template:here { */x10.lang.Runtime.here()/* } */).
                        id;
                    
//#line 1803
/* template:array_set { */(inRight).set(lBuffer.
                                                                            region.
                                                                            size(),pid)/* } */;
                    
//#line 1804
/* template:foreach { */
                    for (java.util.Iterator __var42____ = (lBuffer.
                                                             distribution).iterator(); __var42____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var42__ = (x10.
                      lang.
                      point) __var42____.next();
                    	/* Join: { */final int i =
                      /* template:array_get { */((__var42__).get(0))/* } */;/* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var42__).get(0))/* } */;/* } */
{
                        
//#line 1805
/* template:array_set { */(rightInBuffer).set(/* template:parametric { */((Particle)(/* template:array_get { */((lBuffer).get(i))/* } */))/* } */,/* Join: { */pid,i/* } */)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                }
                		}
                	});/* } */
                
//#line 1810
/* template:Async { */(x10.lang.Runtime.asPlace(pRight)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1811
final int pid =
                      (/* template:here { */x10.lang.Runtime.here()/* } */).
                        id;
                    
//#line 1812
/* template:array_set { */(inLeft).set(rBuffer.
                                                                           region.
                                                                           size(),pid)/* } */;
                    
//#line 1813
/* template:foreach { */
                    for (java.util.Iterator __var43____ = (rBuffer.
                                                             distribution).iterator(); __var43____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var43__ = (x10.
                      lang.
                      point) __var43____.next();
                    	/* Join: { */final int i =
                      /* template:array_get { */((__var43__).get(0))/* } */;/* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var43__).get(0))/* } */;/* } */
{
                        
//#line 1814
/* template:array_set { */(leftInBuffer).set(/* template:parametric { */((Particle)(/* template:array_get { */((rBuffer).get(i))/* } */))/* } */,/* Join: { */pid,i/* } */)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                }
                		}
                	});/* } */
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp167) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp167);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 1826
private x10.
                    lang.
                    GenericReferenceArray
                    packParticleArray(
                    final x10.
                      lang.
                      GenericReferenceArray part,
                    final x10.
                      lang.
                      IntReferenceArray nParticles) {
        
//#line 1830
int lb =
          0;
        
//#line 1831
x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                x10.
                  lang.
                  region.
                  factory.
                  emptyRegion(
                  1),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 1833
/* template:forloop { */
        for (java.util.Iterator pt__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pt__.hasNext(); ) {
        	final  x10.
          lang.
          point pt = (x10.
          lang.
          point) pt__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 1834
int rsize =
              X10Util.
                pullInt(
                nParticles,
                pt);
            
//#line 1835
x10.
              lang.
              place p =
              x10.
                lang.
                place.
                places(
                /* template:array_get { */((pt).get(0))/* } */);
            
//#line 1836
dResult =
              dResult.
                union(
                (x10.
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
                       lb,
                       lb +
                         rsize -
                         1)),
                   p)));
            
//#line 1837
lb =
              lb +
                rsize;
        }/* } */
        }
        /* } */
        
        
//#line 1840
final x10.
          lang.
          GenericReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dResult,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 1841
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1841
/* template:ateach { */
            {
            	x10.lang.dist __var44____distCopy = x10.
                                                   lang.
                                                   dist.
                                                   UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator __var44____ = __var44____distCopy.iterator();
            		 __var44____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var44__ = (x10.
              lang.
              point) __var44____.next();
            		/* Join: { */final int pl =
              /* template:array_get { */((__var44__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var44____distCopy.get(__var44__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int pl =
              /* template:array_get { */((__var44__).get(0))/* } */;/* } */
{
                
//#line 1842
final x10.
                  lang.
                  region rLocal =
                  (x10.
                    lang.
                    region)
                    ((result.
                        distribution.
                        restriction(
                        /* template:here { */x10.lang.Runtime.here()/* } */))).
                      region;
                
//#line 1845
if (rLocal.
                                    size() >
                                    0) {
                    
//#line 1846
final int offset =
                      rLocal.
                        low();
                    
//#line 1847
/* template:foreach { */
                    for (java.util.Iterator __var45____ = (rLocal).iterator(); __var45____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var45__ = (x10.
                      lang.
                      point) __var45____.next();
                    	/* Join: { */final int i =
                      /* template:array_get { */((__var45__).get(0))/* } */;/* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var45__).get(0))/* } */;/* } */
{
                        
//#line 1848
/* template:array_set { */(result).set(/* template:parametric { */((Particle)(/* template:array_get { */((part).get(/* Join: { */pl,i -
                          offset/* } */))/* } */))/* } */,i)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp168) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp168);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1852
return result;
    }
    
    
//#line 1863
public double
                    pushParticles(
                    final x10.
                      lang.
                      GenericReferenceArray particles,
                    final x10.
                      lang.
                      DoubleReferenceArray forceChargeX,
                    final x10.
                      lang.
                      DoubleReferenceArray fcGuardX,
                    final x10.
                      lang.
                      DoubleReferenceArray forceChargeY,
                    final x10.
                      lang.
                      DoubleReferenceArray fcGuardY) {
        
//#line 1869
double lx =
          0.0;
        
//#line 1870
double ly =
          0.0;
        
//#line 1871
double rx =
          0.0;
        
//#line 1872
double ry =
          0.0;
        
//#line 1874
switch (BOUNDARY_CONDITION) {
            
//#line 1875
case 1:
                
//#line 1876
rx =
                  XLENGTH;
                
//#line 1877
break;
            
//#line 1878
case 2:
                
//#line 1879
lx =
                  1.0;
                
//#line 1880
ly =
                  1.0;
                
//#line 1881
rx =
                  XLENGTH -
                    1.0;
                
//#line 1882
ry =
                  YLENGTH -
                    1.0;
                
//#line 1883
break;
            
//#line 1884
case 3:
                
//#line 1885
lx =
                  1.0;
                
//#line 1886
rx =
                  XLENGTH -
                    1.0;
                
//#line 1887
break;
        }
        
//#line 1889
final double edgelx =
          lx;
        
//#line 1890
final double edgely =
          ly;
        
//#line 1891
final double edgerx =
          rx;
        
//#line 1892
final double edgery =
          ry;
        
//#line 1894
final double quantum =
          ELECTRON_CHARGE *
          DELTA_TIME;
        
//#line 1895
final x10.
          lang.
          dist dEnergy =
          particles.
            distribution;
        
//#line 1896
final x10.
          lang.
          DoubleReferenceArray energy =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dEnergy,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 1898
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1898
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 1900
final x10.
                  lang.
                  DoubleReferenceArray fcLocalX =
                  makeLocalSpace(
                    forceChargeX,
                    fcGuardX);
                
//#line 1902
final x10.
                  lang.
                  DoubleReferenceArray fcLocalY =
                  makeLocalSpace(
                    forceChargeY,
                    fcGuardY);
                
//#line 1905
/* template:foreach { */
                for (java.util.Iterator pt__ = (particles.
                                                  distribution.
                                                  restriction(
                                                  /* template:here { */x10.lang.Runtime.here()/* } */)).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { *//* } */
{
                    
//#line 1906
pushParticle(
                                    particles,
                                    pt,
                                    fcLocalX,
                                    fcLocalY,
                                    quantum,
                                    edgelx,
                                    edgely,
                                    edgerx,
                                    edgery,
                                    energy);
                }/* } */
                			}
                		});
                }
                /* } */
                
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp169) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp169);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1910
return (0.125 *
                                energy.
                                  sum());
    }
    
    
//#line 1919
private x10.
                    lang.
                    DoubleReferenceArray
                    makeLocalSpace(
                    final x10.
                      lang.
                      DoubleReferenceArray data,
                    final x10.
                      lang.
                      DoubleReferenceArray guards) {
        
//#line 1922
final x10.
          lang.
          dist dData =
          data.
            distribution;
        
//#line 1923
final x10.
          lang.
          dist dGuard =
          guards.
            distribution;
        
//#line 1924
final x10.
          lang.
          region rLocalD =
          X10Util.
            get2DLRegion(
            dData);
        
//#line 1925
final x10.
          lang.
          region rLocalG =
          X10Util.
            get2DLRegion(
            dGuard);
        
//#line 1926
final x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                (rLocalD.
                   union(
                   rLocalG)),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 1929
final x10.
          lang.
          DoubleReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dResult,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 1930
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1931
/* template:foreach { */
            for (java.util.Iterator pt__ = (data.
                                              distribution.
                                              restriction(
                                              /* template:here { */x10.lang.Runtime.here()/* } */)).iterator(); pt__.hasNext(); ) {
            	final  x10.
              lang.
              point pt = (x10.
              lang.
              point) pt__.next();
            	/* Join: { *//* } */
            	x10.lang.Runtime.here().runAsync
            		(new x10.runtime.Activity() {
            			public void runX10Task() {
            				/* Join: { *//* Join: { *//* } */
{
                
//#line 1932
/* template:array_set { */(result).set(/* template:array_get { */((data).get(pt))/* } */,pt)/* } */;
            }/* } */
            			}
            		});
            }
            /* } */
            
            
//#line 1934
/* template:foreach { */
            for (java.util.Iterator pt__ = (guards.
                                              distribution.
                                              restriction(
                                              /* template:here { */x10.lang.Runtime.here()/* } */)).iterator(); pt__.hasNext(); ) {
            	final  x10.
              lang.
              point pt = (x10.
              lang.
              point) pt__.next();
            	/* Join: { *//* } */
            	x10.lang.Runtime.here().runAsync
            		(new x10.runtime.Activity() {
            			public void runX10Task() {
            				/* Join: { *//* Join: { *//* } */
{
                
//#line 1935
/* template:array_set { */(result).set(/* template:array_get { */((guards).get(pt))/* } */,pt)/* } */;
            }/* } */
            			}
            		});
            }
            /* } */
            
        }
        	} catch (Throwable tmp170) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp170);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 1938
return result;
    }
    
    
//#line 1948
private void
                    pushParticle(
                    final x10.
                      lang.
                      GenericReferenceArray particles,
                    final x10.
                      lang.
                      point pt,
                    final x10.
                      lang.
                      DoubleReferenceArray forceChargeX,
                    final x10.
                      lang.
                      DoubleReferenceArray forceChargeY,
                    final double quantum,
                    final double edgelx,
                    final double edgely,
                    final double edgerx,
                    final double edgery,
                    final x10.
                      lang.
                      DoubleReferenceArray energy) {
        
//#line 1958
final Particle p =
          /* template:parametric { */((Particle)(/* template:array_get { */((particles).get(pt))/* } */))/* } */;
        
//#line 1959
final int x =
          (int)
            p.
              getX();
        
//#line 1960
final int y =
          (int)
            p.
              getY();
        
//#line 1962
final double dx =
          p.
            getX() -
          x;
        
//#line 1963
final double dy =
          p.
            getY() -
          y;
        
//#line 1964
final double mx =
          1.0 -
          dx;
        
//#line 1965
final double my =
          1.0 -
          dy;
        
//#line 1968
final double ax =
          (dy *
             ((dx *
                 /* template:array_get { */((forceChargeX).get(/* Join: { */y +
                 1,x +
                 1/* } */))/* } */ +
                 mx *
                 /* template:array_get { */((forceChargeX).get(/* Join: { */y +
                 1,x/* } */))/* } */)) +
             my *
             ((dx *
                 /* template:array_get { */((forceChargeX).get(/* Join: { */y,x +
                 1/* } */))/* } */ +
                 mx *
                 /* template:array_get { */((forceChargeX).get(/* Join: { */y,x/* } */))/* } */)));
        
//#line 1972
final double ay =
          (dy *
             ((dx *
                 /* template:array_get { */((forceChargeY).get(/* Join: { */y +
                 1,x +
                 1/* } */))/* } */ +
                 mx *
                 /* template:array_get { */((forceChargeY).get(/* Join: { */y +
                 1,x/* } */))/* } */)) +
             my *
             ((dx *
                 /* template:array_get { */((forceChargeY).get(/* Join: { */y,x +
                 1/* } */))/* } */ +
                 mx *
                 /* template:array_get { */((forceChargeY).get(/* Join: { */y,x/* } */))/* } */)));
        
//#line 1989
double vx =
          p.
            getXVel() +
          quantum *
          ax;
        
//#line 1990
double vy =
          p.
            getYVel() +
          quantum *
          ay;
        
//#line 1993
double nx =
          p.
            getX() +
          vx *
          DELTA_TIME;
        
//#line 1994
double ny =
          p.
            getY() +
          vy *
          DELTA_TIME;
        
//#line 1997
/* template:array_set { */(energy).set((java.
                                                                lang.
                                                                Math.
                                                                pow(
                                                                vx +
                                                                  p.
                                                                    getXVel(),
                                                                2) +
                                                                java.
                                                                  lang.
                                                                  Math.
                                                                  pow(
                                                                  vy +
                                                                    p.
                                                                      getYVel(),
                                                                  2)),pt)/* } */;
        
//#line 2000
switch (BOUNDARY_CONDITION) {
            
//#line 2001
case 1:
                
//#line 2002
if (nx <
                                    edgelx) {
                    
//#line 2003
nx =
                      nx +
                        edgerx;
                }
                
//#line 2005
if (nx >=
                                    edgerx) {
                    
//#line 2006
nx =
                      nx -
                        edgerx;
                }
                
//#line 2008
break;
            
//#line 2009
case 2:
                
//#line 2010
if (ny <
                                    edgely ||
                                    ny >=
                                    edgery) {
                    
//#line 2011
ny =
                      p.
                        getY();
                    
//#line 2012
vy =
                      -vy;
                }
            
//#line 2015
case 3:
                
//#line 2016
if (nx <
                                    edgelx ||
                                    nx >=
                                    edgerx) {
                    
//#line 2017
nx =
                      p.
                        getX();
                    
//#line 2018
vx =
                      -vx;
                }
                
//#line 2020
break;
        }
        
//#line 2022
/* template:array_set { */(particles).set(new Particle(
          nx,
          ny,
          vx,
          vy),pt)/* } */;
    }
    
    
//#line 2029
public x10.
                    lang.
                    IntReferenceArray
                    countParticles(
                    final x10.
                      lang.
                      GenericReferenceArray particles,
                    final x10.
                      lang.
                      dist dField) {
        
//#line 2032
final x10.
          lang.
          dist dCount =
          X10Util.
            get2DDistRank(
            dField,
            0);
        
//#line 2033
final x10.
          lang.
          IntReferenceArray count =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dCount,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2034
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2036
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2036
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 2037
/* template:forloop { */
                for (java.util.Iterator pt__ = (particles.
                                                  distribution.
                                                  restriction(
                                                  /* template:here { */x10.lang.Runtime.here()/* } */).
                                                  region).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 2038
/* template:array_unary { */(count).postInc((int)
                                                                                /* template:parametric { */((Particle)(/* template:array_get { */((particles).get(pt))/* } */))/* } */.
                                                                                  getY())/* } */;
                }/* } */
                }
                /* } */
                
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp171) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp171);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2041
return count;
    }
    
    
//#line 2047
public x10.
                    lang.
                    dist
                    repartition(
                    final x10.
                      lang.
                      IntReferenceArray particleCount,
                    final x10.
                      lang.
                      dist dField,
                    final double countAve) {
        
//#line 2058
final int MAX =
          32;
        
//#line 2059
final x10.
          lang.
          dist dUnique =
          (x10.
            lang.
            dist)
            x10.
              lang.
              dist.
              UNIQUE;
        
//#line 2062
final x10.
          lang.
          dist dGrids =
          X10Util.
            get2DDistRank(
            dField,
            0);
        
//#line 2063
final x10.
          lang.
          region rField =
          dField.
            region;
        
//#line 2064
final x10.
          lang.
          region rRows =
          X10Util.
            getRank2D(
            rField,
            1);
        
//#line 2067
final x10.
          lang.
          DoubleReferenceArray border =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public double apply(/* Join: { */x10.
          lang.
          point pt/* } */, double dummy) { {
            
//#line 2068
return 0.0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2072
final x10.
          lang.
          IntReferenceArray particleTotals =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2073
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2077
final x10.
          lang.
          IntReferenceArray gridTotals =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2078
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2084
final x10.
          lang.
          dist dBuffer =
          X10Util.
            extendDistRank2D(
            (x10.
              lang.
              dist)
              x10.
                lang.
                dist.
                UNIQUE,
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
                MAX -
                  1)));
        
//#line 2088
final x10.
          lang.
          IntReferenceArray sCountBuffer =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dBuffer,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 2089
final x10.
          lang.
          IntReferenceArray rCountBuffer =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dBuffer,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 2091
final x10.
          lang.
          IntReferenceArray sendCount =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 2092
final x10.
          lang.
          IntReferenceArray sendGrids =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 2093
final x10.
          lang.
          IntReferenceArray recvCount =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 2094
final x10.
          lang.
          IntReferenceArray recvGrids =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 2097
final x10.
          lang.
          IntReferenceArray finished =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUnique,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2098
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2101
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2101
/* template:ateach { */
            {
            	x10.lang.dist __var46____distCopy = x10.
                                                   lang.
                                                   dist.
                                                   UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator __var46____ = __var46____distCopy.iterator();
            		 __var46____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var46__ = (x10.
              lang.
              point) __var46____.next();
            		/* Join: { */final int pl =
              /* template:array_get { */((__var46__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var46____distCopy.get(__var46__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int pl =
              /* template:array_get { */((__var46__).get(0))/* } */;/* } */
{
                
//#line 2102
final x10.
                  lang.
                  dist dPC =
                  particleCount.
                    distribution;
                
//#line 2103
final x10.
                  lang.
                  region rLocal =
                  X10Util.
                    get1DLRegion(
                    dPC);
                
//#line 2104
final int rsize =
                  rLocal.
                    size();
                
//#line 2105
final int offset =
                  ((rsize >
                      0))
                  ? rLocal.
                      low()
                  : 0;
                
//#line 2107
int total =
                  0;
                
//#line 2108
/* template:forloop-mult { */{
                x10.lang.region __var173__ = (x10.lang.region) particleCount.
                                                                 distribution.
                                                                 restriction(
                                                                 /* template:here { */x10.lang.Runtime.here()/* } */).
                                                                 region;
                if (__var173__.size() > 0 && (__var173__ instanceof x10.array.MultiDimRegion || __var173__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var174__ = __var173__.rank(0).low(), __var175__ = __var173__.rank(0).high(); __var174__ <= __var175__; __var174__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int i = __var174__;
                /* } */
                /* } */
{
                    
//#line 2109
final int count =
                      /* template:array_get { */((particleCount).get(i))/* } */;
                    
//#line 2110
/* template:array_set { */(sCountBuffer).set(count,/* Join: { */pl,i -
                      offset/* } */)/* } */;
                    
//#line 2111
total =
                      total +
                        count;
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var47____ = (__var173__).iterator(); __var47____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var47__ = (x10.
                  lang.
                  point) __var47____.next();
                	/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var47__).get(0))/* } */;/* } */
{
                    
//#line 2109
final int count =
                      /* template:array_get { */((particleCount).get(i))/* } */;
                    
//#line 2110
/* template:array_set { */(sCountBuffer).set(count,/* Join: { */pl,i -
                      offset/* } */)/* } */;
                    
//#line 2111
total =
                      total +
                        count;
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
                
//#line 2113
/* template:array_set { */(particleTotals).set(total,pl)/* } */;
                
//#line 2114
/* template:array_set { */(gridTotals).set(rsize,pl)/* } */;
                
//#line 2116
/* template:array_set { */(sendCount).set(total,pl)/* } */;
                
//#line 2117
/* template:array_set { */(sendGrids).set(rsize,pl)/* } */;
                
//#line 2118
/* template:array_set { */(recvCount).set(0,pl)/* } */;
                
//#line 2119
/* template:array_set { */(recvGrids).set(0,pl)/* } */;
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp172) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp172);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2123
final x10.
          lang.
          IntReferenceArray runningPTotals =
          parallelPrefix(
            particleTotals);
        
//#line 2124
final x10.
          lang.
          IntReferenceArray runningGTotals =
          parallelPrefix(
            gridTotals);
        
//#line 2126
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2126
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 2127
/* template:array_set { */(particleTotals).set(/* template:array_get { */((runningPTotals).get(pl))/* } */,pl)/* } */;
                
//#line 2128
/* template:array_set { */(gridTotals).set(/* template:array_get { */((runningGTotals).get(pl))/* } */,pl)/* } */;
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp176) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp176);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2131
do  {
            
//#line 2133
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 2133
/* template:ateach { */
                {
                	x10.lang.dist __var48____distCopy = x10.
                                                       lang.
                                                       dist.
                                                       UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator __var48____ = __var48____distCopy.iterator();
                		 __var48____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var48__ = (x10.
                  lang.
                  point) __var48____.next();
                		/* Join: { */final int pl =
                  /* template:array_get { */((__var48__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var48____distCopy.get(__var48__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int pl =
                  /* template:array_get { */((__var48__).get(0))/* } */;/* } */
{
                    
//#line 2136
final int expected =
                      (int)
                        ((((pl +
                              1)) *
                            countAve +
                            0.5));
                    
//#line 2137
final int surplus =
                      /* template:array_get { */((runningPTotals).get(pl))/* } */ -
                      expected;
                    
//#line 2139
if (surplus >
                                        0.0) {
                        
//#line 2141
final x10.
                          lang.
                          region dSBuffer =
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
                              /* template:array_get { */((sendGrids).get(pl))/* } */ -
                                1));
                        
//#line 2142
final x10.
                          lang.
                          intArray sBuffer =
                          (x10.
                            lang.
                            intArray)
                            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dSBuffer.
                                                                                                                                      toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                             	public int apply(/* Join: { */x10.
                               lang.
                               point __var49__/* } */, int dummy) { {
                                 
//#line 2144
final int i =
                                   /* template:array_get { */((__var49__).get(0))/* } */;
                                 
//#line 2145
return /* template:array_get { */((sCountBuffer).get(/* Join: { */pl,i/* } */))/* } */;
                             } }
                             }/* } */,true,false,false)/* } */);
                        
//#line 2147
final int nCount =
                          /* template:array_get { */((sendCount).get(pl))/* } */;
                        
//#line 2148
final int nGrids =
                          /* template:array_get { */((sendGrids).get(pl))/* } */;
                        
//#line 2150
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 2150
/* template:Async { */(x10.lang.Runtime.asPlace((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                            next())).runAsync
                            	(new x10.runtime.Activity() {
                            		public void runX10Task() {
                            			{
                                
//#line 2151
/* template:array_set { */(recvCount).set(nCount,(/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                                 id)/* } */;
                                
//#line 2152
/* template:array_set { */(recvGrids).set(nGrids,(/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                                 id)/* } */;
                                
//#line 2153
/* template:finish { */
                                {
                                	x10.lang.Runtime.getCurrentActivity().startFinish();
                                	try {
                                		{
                                    
//#line 2153
/* template:foreach { */
                                    for (java.util.Iterator __var50____ = (dSBuffer).iterator(); __var50____.hasNext(); ) {
                                    	final  x10.
                                      lang.
                                      point __var50__ = (x10.
                                      lang.
                                      point) __var50____.next();
                                    	/* Join: { */final int i =
                                      /* template:array_get { */((__var50__).get(0))/* } */;/* } */
                                    	x10.lang.Runtime.here().runAsync
                                    		(new x10.runtime.Activity() {
                                    			public void runX10Task() {
                                    				/* Join: { *//* Join: { */final int i =
                                      /* template:array_get { */((__var50__).get(0))/* } */;/* } */
{
                                        
//#line 2154
/* template:array_set { */(rCountBuffer).set(/* template:array_get { */((sBuffer).get(i))/* } */,/* Join: { */(/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                                                                                                      id,i/* } */)/* } */;
                                    }/* } */
                                    			}
                                    		});
                                    }
                                    /* } */
                                    
                                }
                                	} catch (Throwable tmp179) {
                                		x10.lang.Runtime.getCurrentActivity().pushException(tmp179);
                                	} finally {
                                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                                	}
                                }
                                /* } */
                                
                            }
                            		}
                            	});/* } */
                        }
                        	} catch (Throwable tmp178) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp178);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                    }
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp177) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp177);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 2161
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 2161
/* template:ateach { */
                {
                	x10.lang.dist __var51____distCopy = x10.
                                                       lang.
                                                       dist.
                                                       UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator __var51____ = __var51____distCopy.iterator();
                		 __var51____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var51__ = (x10.
                  lang.
                  point) __var51____.next();
                		/* Join: { */final int pl =
                  /* template:array_get { */((__var51__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var51____distCopy.get(__var51__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int pl =
                  /* template:array_get { */((__var51__).get(0))/* } */;/* } */
{
                    
//#line 2162
/* template:array_set { */(finished).set(0,pl)/* } */;
                    
//#line 2164
final int expected1 =
                      (int)
                        ((pl *
                            countAve +
                            0.5));
                    
//#line 2165
final int expected2 =
                      (int)
                        ((((pl +
                              1)) *
                            countAve +
                            0.5));
                    
//#line 2168
final int lDeficit =
                      expected1 -
                      /* template:array_get { */((runningPTotals).get(pl))/* } */ +
                      /* template:array_get { */((sendCount).get(pl))/* } */;
                    
//#line 2172
final int rDeficit =
                      /* template:array_get { */((runningPTotals).get(pl))/* } */ -
                      expected2;
                    
//#line 2174
if (lDeficit <
                                        0.0) {
                        
//#line 2175
if (lDeficit +
                                            /* template:array_get { */((recvCount).get(pl))/* } */ >=
                                            0.0) {
                            
//#line 2178
int total =
                              0;
                            
//#line 2179
int oldTotal =
                              0;
                            
//#line 2180
int gsize =
                              /* template:array_get { */((recvGrids).get(pl))/* } */;
                            
//#line 2181
int i =
                              gsize;
                            
//#line 2184
do  {
                                
//#line 2185
i--;
                                
//#line 2186
oldTotal =
                                  total;
                                
//#line 2187
total =
                                  total -
                                    /* template:array_get { */((rCountBuffer).get(/* Join: { */pl,i/* } */))/* } */;
                            }while(total >
                                     lDeficit &&
                                     i >=
                                     0); 
                            
//#line 2189
double offset =
                              (((gsize -
                                   i)) +
                                 (((((double)
                                       ((lDeficit -
                                           oldTotal)))) /
                                     (((double)
                                         ((total -
                                             oldTotal)))))));
                            
//#line 2192
/* template:array_set { */(border).set(/* template:array_get { */((runningGTotals).get(pl))/* } */ -
                              /* template:array_get { */((sendGrids).get(pl))/* } */ -
                              offset,pl)/* } */;
                        } else {
                            
//#line 2196
/* template:array_unary { */(finished).postInc(pl)/* } */;
                        }
                    } else {
                        
//#line 2198
if (/* template:array_get { */((runningPTotals).get(pl))/* } */ >=
                                            expected1) {
                            
//#line 2200
int gsize =
                              /* template:array_get { */((sendGrids).get(pl))/* } */;
                            
//#line 2201
int i =
                              0;
                            
//#line 2202
int total =
                              0;
                            
//#line 2203
int oldTotal =
                              0;
                            
//#line 2206
do  {
                                
//#line 2207
oldTotal =
                                  total;
                                
//#line 2208
total =
                                  total +
                                    /* template:array_get { */((sCountBuffer).get(/* Join: { */pl,i/* } */))/* } */;
                                
//#line 2209
i++;
                            }while(total <
                                     lDeficit &&
                                     i <
                                     gsize); 
                            
//#line 2211
double offset =
                              i -
                              1;
                            
//#line 2212
if (total >
                                                oldTotal) {
                                
//#line 2213
offset =
                                  offset +
                                    (((((double)
                                          ((lDeficit -
                                              oldTotal)))) /
                                        (((double)
                                            ((total -
                                                oldTotal))))));
                            }
                            
//#line 2217
/* template:array_set { */(border).set(/* template:array_get { */((runningGTotals).get(pl))/* } */ -
                              /* template:array_get { */((sendGrids).get(pl))/* } */ +
                              offset,pl)/* } */;
                        }
                    }
                    
//#line 2222
if (rDeficit >
                                        /* template:array_get { */((sendCount).get(pl))/* } */) {
                        
//#line 2224
/* template:array_unary { */(finished).postInc(pl)/* } */;
                    }
                    
//#line 2227
if (!(/* template:here { */x10.lang.Runtime.here()/* } */).
                                         isFirst()) {
                        
//#line 2228
int gsize =
                          /* template:array_get { */((recvGrids).get(pl))/* } */;
                        
//#line 2230
/* template:array_set { */(runningPTotals).set(/* template:array_get { */((runningPTotals).get(pl))/* } */ -
                          /* template:array_get { */((sendCount).get(pl))/* } */,pl)/* } */;
                        
//#line 2231
/* template:array_set { */(runningGTotals).set(/* template:array_get { */((runningGTotals).get(pl))/* } */ -
                          /* template:array_get { */((sendGrids).get(pl))/* } */,pl)/* } */;
                        
//#line 2233
/* template:array_set { */(sendCount).set(/* template:array_get { */((recvCount).get(pl))/* } */,pl)/* } */;
                        
//#line 2234
/* template:array_set { */(sendGrids).set(/* template:array_get { */((recvGrids).get(pl))/* } */,pl)/* } */;
                        
//#line 2235
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 2235
/* template:foreach { */
                            for (java.util.Iterator pt__ = (x10.
                                                              lang.
                                                              region.
                                                              factory.
                                                              region(
                                                              x10.
                                                                lang.
                                                                region.
                                                                factory.
                                                                region(
                                                                pl,
                                                                pl),
                                                              x10.
                                                                lang.
                                                                region.
                                                                factory.
                                                                region(
                                                                0,
                                                                gsize -
                                                                  1))).iterator(); pt__.hasNext(); ) {
                            	final  x10.
                              lang.
                              point pt = (x10.
                              lang.
                              point) pt__.next();
                            	/* Join: { *//* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { *//* } */
{
                                
//#line 2237
/* template:array_set { */(sCountBuffer).set(/* template:array_get { */((rCountBuffer).get(pt))/* } */,pt)/* } */;
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                        }
                        	} catch (Throwable tmp181) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp181);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                    }
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp180) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp180);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }while(finished.
                 sum() !=
                 0); 
        
//#line 2244
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2244
/* template:ateach { */
            {
            	x10.lang.dist __var52____distCopy = x10.
                                                   lang.
                                                   dist.
                                                   UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator __var52____ = __var52____distCopy.iterator();
            		 __var52____.hasNext(); )
            	{
            		final  x10.
              lang.
              point __var52__ = (x10.
              lang.
              point) __var52____.next();
            		/* Join: { */final int pl =
              /* template:array_get { */((__var52__).get(0))/* } */;/* } */
            		((x10.runtime.Place) __var52____distCopy.get(__var52__)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { */final int pl =
              /* template:array_get { */((__var52__).get(0))/* } */;/* } */
{
                
//#line 2245
final x10.
                  lang.
                  dist dPC =
                  particleCount.
                    distribution;
                
//#line 2246
final x10.
                  lang.
                  region rLocal =
                  X10Util.
                    get1DLRegion(
                    dPC);
                
//#line 2247
final int rsize =
                  rLocal.
                    size();
                
//#line 2248
final int offset =
                  ((rsize >
                      0))
                  ? rLocal.
                      low()
                  : 0;
                
//#line 2250
int total =
                  0;
                
//#line 2251
/* template:forloop-mult { */{
                x10.lang.region __var183__ = (x10.lang.region) particleCount.
                                                                 distribution.
                                                                 restriction(
                                                                 /* template:here { */x10.lang.Runtime.here()/* } */).
                                                                 region;
                if (__var183__.size() > 0 && (__var183__ instanceof x10.array.MultiDimRegion || __var183__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var184__ = __var183__.rank(0).low(), __var185__ = __var183__.rank(0).high(); __var184__ <= __var185__; __var184__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int i = __var184__;
                /* } */
                /* } */
{
                    
//#line 2252
final int count =
                      /* template:array_get { */((particleCount).get(i))/* } */;
                    
//#line 2253
/* template:array_set { */(sCountBuffer).set(count,/* Join: { */pl,i -
                      offset/* } */)/* } */;
                    
//#line 2254
total =
                      total +
                        count;
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var53____ = (__var183__).iterator(); __var53____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var53__ = (x10.
                  lang.
                  point) __var53____.next();
                	/* Join: { *//* Join: { */final int i =
                  /* template:array_get { */((__var53__).get(0))/* } */;/* } */
{
                    
//#line 2252
final int count =
                      /* template:array_get { */((particleCount).get(i))/* } */;
                    
//#line 2253
/* template:array_set { */(sCountBuffer).set(count,/* Join: { */pl,i -
                      offset/* } */)/* } */;
                    
//#line 2254
total =
                      total +
                        count;
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
                
//#line 2256
/* template:array_set { */(runningPTotals).set(/* template:array_get { */((particleTotals).get(pl))/* } */,pl)/* } */;
                
//#line 2257
/* template:array_set { */(runningGTotals).set(/* template:array_get { */((gridTotals).get(pl))/* } */,pl)/* } */;
                
//#line 2258
/* template:array_set { */(sendCount).set(total,pl)/* } */;
                
//#line 2259
/* template:array_set { */(sendGrids).set(rsize,pl)/* } */;
                
//#line 2260
/* template:array_set { */(recvCount).set(0,pl)/* } */;
                
//#line 2261
/* template:array_set { */(recvGrids).set(0,pl)/* } */;
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp182) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp182);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2264
do  {
            
//#line 2266
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 2266
/* template:ateach { */
                {
                	x10.lang.dist __var54____distCopy = x10.
                                                       lang.
                                                       dist.
                                                       UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator __var54____ = __var54____distCopy.iterator();
                		 __var54____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var54__ = (x10.
                  lang.
                  point) __var54____.next();
                		/* Join: { */final int pl =
                  /* template:array_get { */((__var54__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var54____distCopy.get(__var54__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int pl =
                  /* template:array_get { */((__var54__).get(0))/* } */;/* } */
{
                    
//#line 2267
final int expected =
                      (int)
                        ((pl *
                            countAve +
                            0.5));
                    
//#line 2268
final int lDeficit =
                      ((((int)
                           ((((pl -
                                 1)) *
                               countAve +
                               0.5)))) -
                         /* template:array_get { */((runningPTotals).get(pl))/* } */ +
                         /* template:array_get { */((sendCount).get(pl))/* } */);
                    
//#line 2270
if (lDeficit >
                                        0) {
                        
//#line 2272
final x10.
                          lang.
                          region dSBuffer =
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
                              /* template:array_get { */((sendGrids).get(pl))/* } */ -
                                1));
                        
//#line 2273
final x10.
                          lang.
                          intArray sBuffer =
                          (x10.
                            lang.
                            intArray)
                            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dSBuffer.
                                                                                                                                      toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                             	public int apply(/* Join: { */x10.
                               lang.
                               point __var55__/* } */, int dummy) { {
                                 
//#line 2275
final int i =
                                   /* template:array_get { */((__var55__).get(0))/* } */;
                                 
//#line 2276
return /* template:array_get { */((sCountBuffer).get(/* Join: { */pl,i/* } */))/* } */;
                             } }
                             }/* } */,true,false,false)/* } */);
                        
//#line 2278
final int nCount =
                          /* template:array_get { */((sendCount).get(pl))/* } */;
                        
//#line 2279
final int nGrids =
                          /* template:array_get { */((sendGrids).get(pl))/* } */;
                        
//#line 2281
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 2281
/* template:Async { */(x10.lang.Runtime.asPlace((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                            prev())).runAsync
                            	(new x10.runtime.Activity() {
                            		public void runX10Task() {
                            			{
                                
//#line 2282
/* template:array_set { */(recvCount).set(nCount,(/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                                 id)/* } */;
                                
//#line 2283
/* template:array_set { */(recvGrids).set(nGrids,(/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                                 id)/* } */;
                                
//#line 2284
/* template:foreach { */
                                for (java.util.Iterator __var56____ = (dSBuffer).iterator(); __var56____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var56__ = (x10.
                                  lang.
                                  point) __var56____.next();
                                	/* Join: { */final int i =
                                  /* template:array_get { */((__var56__).get(0))/* } */;/* } */
                                	x10.lang.Runtime.here().runAsync
                                		(new x10.runtime.Activity() {
                                			public void runX10Task() {
                                				/* Join: { *//* Join: { */final int i =
                                  /* template:array_get { */((__var56__).get(0))/* } */;/* } */
{
                                    
//#line 2285
/* template:array_set { */(rCountBuffer).set(/* template:array_get { */((sBuffer).get(i))/* } */,/* Join: { */(/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                                                                                                  id,i/* } */)/* } */;
                                }/* } */
                                			}
                                		});
                                }
                                /* } */
                                
                            }
                            		}
                            	});/* } */
                        }
                        	} catch (Throwable tmp187) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp187);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                    }
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp186) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp186);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 2291
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 2291
/* template:ateach { */
                {
                	x10.lang.dist __var57____distCopy = x10.
                                                       lang.
                                                       dist.
                                                       UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator __var57____ = __var57____distCopy.iterator();
                		 __var57____.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point __var57__ = (x10.
                  lang.
                  point) __var57____.next();
                		/* Join: { */final int pl =
                  /* template:array_get { */((__var57__).get(0))/* } */;/* } */
                		((x10.runtime.Place) __var57____distCopy.get(__var57__)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { */final int pl =
                  /* template:array_get { */((__var57__).get(0))/* } */;/* } */
{
                    
//#line 2293
/* template:array_set { */(finished).set(0,pl)/* } */;
                    
//#line 2295
final int expected1 =
                      (int)
                        ((pl *
                            countAve +
                            0.5));
                    
//#line 2296
final int expected2 =
                      (int)
                        ((((pl -
                              1)) *
                            countAve +
                            0.5));
                    
//#line 2297
final int lDeficit =
                      expected2 -
                      /* template:array_get { */((runningPTotals).get(pl))/* } */ +
                      /* template:array_get { */((sendCount).get(pl))/* } */;
                    
//#line 2299
final int rDeficit =
                      /* template:array_get { */((runningPTotals).get(pl))/* } */ -
                      expected1;
                    
//#line 2301
if (/* template:array_get { */((runningPTotals).get(pl))/* } */ <
                                        expected1) {
                        
//#line 2302
if (/* template:array_get { */((runningPTotals).get(pl))/* } */ +
                                            /* template:array_get { */((recvCount).get(pl))/* } */ >=
                                            expected1) {
                            
//#line 2305
final int gsize =
                              /* template:array_get { */((recvGrids).get(pl))/* } */;
                            
//#line 2306
int oldTotal =
                              0;
                            
//#line 2307
int total =
                              0;
                            
//#line 2308
int i =
                              0;
                            
//#line 2309
do  {
                                
//#line 2310
oldTotal =
                                  total;
                                
//#line 2311
total =
                                  total +
                                    /* template:array_get { */((rCountBuffer).get(/* Join: { */pl,i/* } */))/* } */;
                                
//#line 2312
i++;
                            }while(total <
                                     -rDeficit &&
                                     i <
                                     gsize); 
                            
//#line 2314
final int offset =
                              (int)
                                ((i -
                                    1 +
                                    (((((double)
                                          ((-rDeficit -
                                              oldTotal)))) /
                                        (((double)
                                            ((total -
                                                oldTotal))))))));
                            
//#line 2318
/* template:array_set { */(border).set(/* template:array_get { */((runningGTotals).get(pl))/* } */ +
                              offset,pl)/* } */;
                        } else {
                            
//#line 2321
/* template:array_unary { */(finished).postInc(pl)/* } */;
                        }
                    }
                    
//#line 2325
if (lDeficit >
                                        /* template:array_get { */((sendCount).get(pl))/* } */) {
                        
//#line 2327
/* template:array_unary { */(finished).postInc(pl)/* } */;
                    }
                    
//#line 2329
if (!(/* template:here { */x10.lang.Runtime.here()/* } */).
                                         isLast()) {
                        
//#line 2330
final int count =
                          /* template:array_get { */((recvCount).get(pl))/* } */;
                        
//#line 2331
final int gsize =
                          /* template:array_get { */((recvGrids).get(pl))/* } */;
                        
//#line 2332
/* template:array_set { */(runningPTotals).set(/* template:array_get { */((runningPTotals).get(pl))/* } */ +
                          count,pl)/* } */;
                        
//#line 2333
/* template:array_set { */(runningGTotals).set(/* template:array_get { */((runningGTotals).get(pl))/* } */ +
                          gsize,pl)/* } */;
                        
//#line 2334
/* template:array_set { */(sendCount).set(count,pl)/* } */;
                        
//#line 2335
/* template:array_set { */(sendGrids).set(gsize,pl)/* } */;
                        
//#line 2336
/* template:foreach { */
                        for (java.util.Iterator pt__ = (x10.
                                                          lang.
                                                          region.
                                                          factory.
                                                          region(
                                                          x10.
                                                            lang.
                                                            region.
                                                            factory.
                                                            region(
                                                            pl,
                                                            pl),
                                                          x10.
                                                            lang.
                                                            region.
                                                            factory.
                                                            region(
                                                            0,
                                                            gsize -
                                                              1))).iterator(); pt__.hasNext(); ) {
                        	final  x10.
                          lang.
                          point pt = (x10.
                          lang.
                          point) pt__.next();
                        	/* Join: { *//* } */
                        	x10.lang.Runtime.here().runAsync
                        		(new x10.runtime.Activity() {
                        			public void runX10Task() {
                        				/* Join: { *//* Join: { *//* } */
{
                            
//#line 2337
/* template:array_set { */(sCountBuffer).set(/* template:array_get { */((rCountBuffer).get(pt))/* } */,pt)/* } */;
                        }/* } */
                        			}
                        		});
                        }
                        /* } */
                        
                    }
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp188) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp188);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }while(finished.
                 sum() !=
                 0); 
        
//#line 2344
final x10.
          lang.
          place pHere =
          /* template:here { */x10.lang.Runtime.here()/* } */;
        
//#line 2345
final x10.
          lang.
          dist dBounds =
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
                x10.
                  lang.
                  place.
                  MAX_PLACES)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 2346
final x10.
          lang.
          IntReferenceArray lowerbounds =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dBounds,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 2347
final x10.
          lang.
          IntReferenceArray upperbounds =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dBounds,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 2349
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2349
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 2350
final double edge =
                  /* template:array_get { */((border).get(pl))/* } */;
                
//#line 2352
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 2353
/* template:array_set { */(lowerbounds).set((int)
                                                                                ((edge +
                                                                                    0.5)),pl)/* } */;
                }
                		}
                	});/* } */
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp189) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp189);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2358
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
                                           x10.
                                             lang.
                                             place.
                                             MAX_PLACES -
                                             1))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 2359
final int lb =
              /* template:array_get { */((lowerbounds).get(i))/* } */;
            
//#line 2360
/* template:forloop { */
            for (java.util.Iterator j__ = (x10.
                                             lang.
                                             region.
                                             factory.
                                             region(
                                             x10.
                                               lang.
                                               region.
                                               factory.
                                               region(
                                               /* template:array_get { */((i).get(0))/* } */ +
                                                 1,
                                               x10.
                                                 lang.
                                                 place.
                                                 MAX_PLACES -
                                                 1))).iterator(); j__.hasNext(); ) {
            	final  x10.
              lang.
              point j = (x10.
              lang.
              point) j__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 2361
if (/* template:array_get { */((lowerbounds).get(j))/* } */ <=
                                    lb) {
                    
//#line 2362
/* template:array_set { */(lowerbounds).set(lb +
                      1,j)/* } */;
                }
            }/* } */
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
        
//#line 2367
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
                                           x10.
                                             lang.
                                             place.
                                             MAX_PLACES -
                                             2))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 2368
/* template:array_set { */(upperbounds).set(/* template:array_get { */((lowerbounds).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i))/* } */.add(x10.
                                                                                                                                                                                                             lang.
                                                                                                                                                                                                             point.
                                                                                                                                                                                                             factory.
                                                                                                                                                                                                             point(
                                                                                                                                                                                                             1))))/* } */ -
              1,i)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 2370
/* template:array_set { */(upperbounds).set(YLENGTH -
          1,x10.
              lang.
              place.
              MAX_PLACES -
          1)/* } */;
        
//#line 2372
x10.
          lang.
          dist dResult =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                x10.
                  lang.
                  region.
                  factory.
                  emptyRegion(
                  2),
                /* template:here { */x10.lang.Runtime.here()/* } */)));
        
//#line 2374
/* template:forloop { */
        for (java.util.Iterator pl__ = (x10.
                                          lang.
                                          dist.
                                          UNIQUE.
                                          region).iterator(); pl__.hasNext(); ) {
        	final  x10.
          lang.
          point pl = (x10.
          lang.
          point) pl__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 2375
final x10.
              lang.
              place p =
              x10.
                lang.
                dist.
                UNIQUE.
                get(
                pl);
            
//#line 2377
dResult =
              dResult.
                union(
                (x10.
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
                       /* template:array_get { */((lowerbounds).get(pl))/* } */,
                       /* template:array_get { */((upperbounds).get(pl))/* } */),
                     rRows),
                   p)));
        }/* } */
        }
        /* } */
        
        
//#line 2380
return dResult;
    }
    
    
//#line 2389
public x10.
                    lang.
                    GenericReferenceArray
                    sortParticles(
                    final x10.
                      lang.
                      GenericReferenceArray particles,
                    final x10.
                      lang.
                      dist dField) {
        
//#line 2393
final x10.
          lang.
          dist dParticles =
          particles.
            distribution;
        
//#line 2394
final x10.
          lang.
          GenericReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dParticles,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
        
//#line 2395
final x10.
          lang.
          IntReferenceArray indices =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dParticles,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 2396
final x10.
          lang.
          dist dCount =
          X10Util.
            get2DDistRank(
            dField,
            0);
        
//#line 2398
final x10.
          lang.
          IntReferenceArray count =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dCount,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2399
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2400
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 2400
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 2401
final x10.
                  lang.
                  dist dP =
                  particles.
                    distribution;
                
//#line 2402
final x10.
                  lang.
                  region rLocalP =
                  X10Util.
                    get1DLRegion(
                    dP);
                
//#line 2403
final x10.
                  lang.
                  region rLocalC =
                  X10Util.
                    get1DLRegion(
                    dCount);
                
//#line 2406
/* template:forloop { */
                for (java.util.Iterator pt__ = (particles.
                                                  distribution.
                                                  restriction(
                                                  /* template:here { */x10.lang.Runtime.here()/* } */).
                                                  region).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 2407
final int y =
                      (int)
                        /* template:parametric { */((Particle)(/* template:array_get { */((particles).get(pt))/* } */))/* } */.
                          getY();
                    
//#line 2408
/* template:array_unary { */(count).postInc(y)/* } */;
                    
//#line 2409
/* template:array_set { */(indices).set(y,pt)/* } */;
                }/* } */
                }
                /* } */
                
                
//#line 2413
final x10.
                  lang.
                  dist dLocalC =
                  x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    rLocalC,
                    /* template:here { */x10.lang.Runtime.here()/* } */);
                
//#line 2414
int offset =
                  ((rLocalP.
                      size() >
                      0))
                  ? rLocalP.
                      low()
                  : 0;
                
//#line 2415
x10.
                  lang.
                  IntReferenceArray offsets =
                  /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dLocalC,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
                
//#line 2416
/* template:forloop { */
                for (java.util.Iterator pt__ = (rLocalC).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 2417
final int n =
                      /* template:array_get { */((count).get(pt))/* } */;
                    
//#line 2418
/* template:array_set { */(offsets).set(offset,pt)/* } */;
                    
//#line 2419
offset =
                      offset +
                        n;
                }/* } */
                }
                /* } */
                
                
//#line 2423
/* template:forloop { */
                for (java.util.Iterator pt__ = (rLocalP).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 2424
final int index =
                      /* template:array_get { */((indices).get(pt))/* } */;
                    
//#line 2425
/* template:array_set { */(indices).set(/* template:array_get { */((offsets).get(index))/* } */,pt)/* } */;
                    
//#line 2426
/* template:array_unary { */(offsets).postInc(index)/* } */;
                }/* } */
                }
                /* } */
                
                
//#line 2430
/* template:foreach { */
                for (java.util.Iterator i__ = (rLocalP).iterator(); i__.hasNext(); ) {
                	final  x10.
                  lang.
                  point i = (x10.
                  lang.
                  point) i__.next();
                	/* Join: { *//* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { *//* } */
{
                    
//#line 2431
/* template:array_set { */(result).set(/* template:parametric { */((Particle)(/* template:array_get { */((particles).get(i))/* } */))/* } */,/* template:array_get { */((indices).get(i))/* } */)/* } */;
                }/* } */
                			}
                		});
                }
                /* } */
                
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp190) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp190);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
        
//#line 2434
return result;
    }
    
    
//#line 2440
public x10.
                    lang.
                    IntReferenceArray
                    parallelPrefix(
                    final x10.
                      lang.
                      IntReferenceArray data) {
        
//#line 2441
final x10.
          lang.
          dist dData =
          data.
            distribution;
        
//#line 2442
final x10.
          lang.
          IntReferenceArray result =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dData,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2443
return /* template:array_get { */((data).get(pt))/* } */;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2444
final x10.
          lang.
          IntReferenceArray tmp1 =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dData,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2445
return /* template:array_get { */((data).get(pt))/* } */;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2446
final x10.
          lang.
          IntReferenceArray tmp2 =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dData,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
        	public int apply(/* Join: { */x10.
          lang.
          point pt/* } */, int dummy) { {
            
//#line 2447
return 0;
        } }
        }/* } */,true,true,false)/* } */;
        
//#line 2449
int strides =
          1;
        
//#line 2450
while (strides <
                               x10.
                                 lang.
                                 place.
                                 MAX_PLACES) {
            
//#line 2451
final int stride =
              strides;
            
//#line 2452
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 2452
/* template:ateach { */
                {
                	x10.lang.dist pl__distCopy = x10.
                                                lang.
                                                dist.
                                                UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator pl__ = pl__distCopy.iterator();
                		 pl__.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point pl = (x10.
                  lang.
                  point) pl__.next();
                		/* Join: { *//* } */
                		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { *//* } */
{
                    
//#line 2453
final int dir =
                      ((/* template:array_get { */((pl).get(0))/* } */ /
                          stride)) %
                      2;
                    
//#line 2454
final int val =
                      /* template:array_get { */((tmp1).get(pl))/* } */;
                    
//#line 2455
final x10.
                      lang.
                      place pDst =
                      x10.
                        lang.
                        place.
                        places(
                        /* template:array_get { */((pl).get(0))/* } */ +
                          ((((dir ==
                                0))
                              ? 1
                              : -1)) *
                          stride);
                    
//#line 2458
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 2458
/* template:Async { */(x10.lang.Runtime.asPlace(pDst)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 2459
if (dir ==
                                                0) {
                                
//#line 2461
/* template:array_set { */(result).set(/* template:array_get { */((result).get((/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                                                               id))/* } */ +
                                  val,(/* template:here { */x10.lang.Runtime.here()/* } */).
                                        id)/* } */;
                            }
                            
//#line 2463
/* template:array_set { */(tmp2).set(val,(/* template:here { */x10.lang.Runtime.here()/* } */).
                                                                                     id)/* } */;
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
                    
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp191) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp191);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 2467
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 2467
/* template:ateach { */
                {
                	x10.lang.dist pl__distCopy = x10.
                                                lang.
                                                dist.
                                                UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator pl__ = pl__distCopy.iterator();
                		 pl__.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point pl = (x10.
                  lang.
                  point) pl__.next();
                		/* Join: { *//* } */
                		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { *//* } */
{
                    
//#line 2468
/* template:array_set { */(tmp1).set(/* template:array_get { */((tmp1).get(pl))/* } */ +
                      /* template:array_get { */((tmp2).get(pl))/* } */,pl)/* } */;
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp193) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp193);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 2470
strides =
              strides +
                strides;
        }
        
//#line 2472
return result;
    }
}
