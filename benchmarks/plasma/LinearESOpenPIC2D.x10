public class LinearESOpenPIC2D {
    /**
     *  These constants determine the field space size of the program.  The
     *  x dimension will be 2^NUMBER_OF_XBITS long and the y dimension will
     *  be 2^NUMBER_OF_YBITS wide.  The dimensions must be powers of 2 due
     *  the FFT requiring such lengths.
     */
    private static final int NUMBER_OF_XBITS = 2;
    private static final int NUMBER_OF_YBITS = 3;

    /**
     *  These constant are used as length in the X and Y direction are used
     *  frequently in calculations.
     */
    private static final int XLENGTH = 1 << NUMBER_OF_XBITS;
    private static final int YLENGTH = 1 << NUMBER_OF_YBITS;

    /**
     *  These constants determine how many particles will exist in the system.
     *  The X component will determine the initial density of particles in the
     *  X direction and similarly in the Y direction.  The total number of 
     *  particles is the product of those values.
     */
    private static final int PARTICLE_XDENSITY = 4;
    private static final int PARTICLE_YDENSITY = 8;
    private static final int NPARTICLES = PARTICLE_XDENSITY * PARTICLE_YDENSITY;

    /**
     *  Various constants for the phsyics calculations.  DELTA_TIME is the
     *  amount of time elapsed for each time step.  ELECTRON_CHARGE is the
     *  charge on an electron measured in units of e.
     */
    private static final double DELTA_TIME = 0.2000000e+00;
    private static final double ELECTRON_CHARGE = -1.0;
    private static final double THERMAL_XVELOCITY = 1.0;
    private static final double THERMAL_YVELOCITY = 1.0;

    /**
     *  Various setting to change certain behaviors.
     */ 
    private static final int BOUNDARY_CONDITION = 2;
    private static final int TIME_STEPS = 325;
    private static final int SORT_TIME = 50;
    private static final double IMBALANCE = 0.08;

    /**
     *  Some variables for buffer sizes.
     */
    // proportional to number of rows per place
    //  (maximum number of rows moving from a place)
    private static final int MOVE_FIELD_TO_DIST_MAX_ROWS 
	= 4 * YLENGTH / place.MAX_PLACES;

    // proportional to total number of particles 
    //  (maximum number of particles on a single place)
    private static final int MOVE_PARTICLES_MAX 
	= 4 * NPARTICLES / place.MAX_PLACES;
    // proportional to number of particles per place
    //  (maximum number of particles moving from a place)
    private static final int MOVE_PARTICLES_MAX_BUFFER 
	= 4 * NPARTICLES / place.MAX_PLACES;

    private final Random r;
    private final PoissonSolver solver;
    private Particle[:rank==1] particles;
    private double[:rank==2] backgroundCharge;

    private long totalTime;
    private long initTime;
    private long depositTime;
    private long redistTime;
    private long solverTime;
    private long pushTime;
    private long moveTime;

    public LinearESOpenPIC2D() {
	r = new Random();
	double affp = ((XLENGTH - 2.0) * (YLENGTH - 2.0)) / NPARTICLES;
	solver = new PoissonSolver(NUMBER_OF_XBITS, NUMBER_OF_YBITS, affp);

	totalTime = 0;
	initTime = 0;
	depositTime = 0;
	redistTime = 0;
	pushTime = 0;
	moveTime = 0;
    }


    public void run() {
	totalTime = System.currentTimeMillis();

	initTime = System.currentTimeMillis();
	initialize();
	initTime = System.currentTimeMillis() - initTime;

	for (point(:rank==1) i: [0 : TIME_STEPS - 1]) {
	    System.out.println("T = " + i[0]);
	    final double[:rank==1] e = stepTime(backgroundCharge);
	    if (i[0] % SORT_TIME == 0) {
		long time = System.currentTimeMillis();
		sortParticles(particles, backgroundCharge.distribution);
		moveTime = moveTime + (System.currentTimeMillis() - time);
	    }
	    System.out.println("field, kinetic, total energies = " +
			       e[0] + "," + e[1] + "," + e[2]);

	    if (i[0] == TIME_STEPS - 1) {
		final dist(:rank==1) dRef = [0:2]->here;
		final double[:rank==1] ref = new double[dRef];
		if (NUMBER_OF_XBITS == 2 &&
		    NUMBER_OF_YBITS == 3 &&
		    PARTICLE_XDENSITY == 4 &&
		    PARTICLE_YDENSITY == 8) {
		    ref[0] = 0.009936711552799253;
		    ref[1] = 35.7904959849017;
		    ref[2] = 35.8004326964545;
		    System.out.println("final field energy diff = " + 
				       (Math.abs(ref[0] - e[0])));
		    System.out.println("final kinetic energy diff = " + 
				       (Math.abs(ref[1] - e[1])));
		    System.out.println("final final energy diff = " + 
				       (Math.abs(ref[2] - e[2])));
		} else if (NUMBER_OF_XBITS == 3 &&
			   NUMBER_OF_YBITS == 4 &&
			   PARTICLE_XDENSITY == 8 &&
			   PARTICLE_YDENSITY == 16) {

		    ref[0] = 1.12911030199718;
		    ref[1] = 138.01404855563126;
		    ref[2] = 139.14315885762844;
		    System.out.println("final field energy diff = " + 
				       (Math.abs(ref[0] - e[0])));
		    System.out.println("final kinetic energy diff = " + 
				       (Math.abs(ref[1] - e[1])));
		    System.out.println("final final energy diff = " + 
				       (Math.abs(ref[2] - e[2])));
		} else {
		    System.out.println("No reference values availabile");
		}
	    } 
	}	
	totalTime = System.currentTimeMillis() - totalTime;

	System.out.println("Total time (ms): " + totalTime);
	System.out.println("Initialization time (ms): " + 
			   initTime + " " + (100.0 * initTime) / totalTime);
	System.out.println("Particle Deposit time (ms): " +
			   depositTime + " " + (100.0 * depositTime) / totalTime);
	System.out.println("Field Redistribution time (ms): " +
			   redistTime + " " + (100.0 * redistTime) / totalTime);
	System.out.println("Solver time (ms): " +
			   solverTime + " " + (100.0 * solverTime) / totalTime);
	System.out.println("Particle Push time (ms): " +
			   pushTime + " " + (100.0 * pushTime) / totalTime);
	System.out.println("Particle move time (ms): " +
			   moveTime + " " +  (100.0 * moveTime) / totalTime);
    }

    

    /**
     *  Initializes the system -- sets up the initial particles and creates
     *  the ion background which will be used in each time step.
     */
    public void initialize() {

	// Initialize particles
	System.out.println("Init: particle position");
	final double[:rank==2] position = genParticlePosition(NPARTICLES);
	System.out.println("Init: particle velocity");
	final double[:rank==2] velocity = genParticleVelocity(NPARTICLES);
	System.out.println("Init: particles");	
	particles = genParticles(NPARTICLES, position, velocity);
	
	// Create initial partition of field space
	System.out.println("Init: initial field distribution");
	final dist(:rank==2) dField = genInitialDist(particles);

	// Move particles to correct place
	System.out.println("Init: initial partical distribution");
	final int[:rank==1] info = makeInfoArray();
	particles = moveParticles(particles, dField, info);

	System.out.println("Init: background charge");
	backgroundCharge = new double[dField];
	final double[:rank==2] backgroundGuards = makeGuards(dField);
	
	depositCharge(particles, backgroundCharge, 
		      backgroundGuards, Math.abs(ELECTRON_CHARGE));
	addGuards(backgroundCharge, backgroundGuards);
    }

    /**
     *  For 2D code, this method calculates initial particle coordinates
     *  with general density profile n(x,y) = n(x)*n(y) where n(x) is the
     *  the density function in x.  
     *  check + place
     */
    public double[:rank==2] genParticlePosition(final int np) {
	final int X = 0;
	final int Y = 1;
	final int MAX_PLACES = place.MAX_PLACES;
	final int MAX_ITER = 20;
	final double ERROR = 0.0001;
	final double BIG = 0.5;	

	final dist(:rank==2) dResult = X10Util.distBlockStar2([0:np-1], [0:1]);
	final double[:rank==2] result = new double[dResult];
	
	final int particlesPerPlace = 
	    (PARTICLE_XDENSITY * PARTICLE_YDENSITY) /  MAX_PLACES;
	final int totalParticles = particlesPerPlace * MAX_PLACES;

	if (totalParticles != NPARTICLES) {
	    System.err.println("Particle distribution truncated, " +
			       "total particles = " + totalParticles);
	    return result;
	}

	// set boundary conditions
	final double edgelx = (BOUNDARY_CONDITION == 2 || 
			       BOUNDARY_CONDITION == 3) ? 1.0 : 0.0;
	final double edgely = (BOUNDARY_CONDITION == 2) ? 1.0 : 0.0;

	// find normalization for function
	double tx0 = linearDensityFnIntegral(edgelx, 0.0, 0.0, 0.0);
	double ty0 = linearDensityFnIntegral(edgely, 0.0, 0.0, 0.0);

	final double anx = XLENGTH - edgelx;
	final double any = YLENGTH - edgely;
	final double bnx = 
	    PARTICLE_XDENSITY/(linearDensityFnIntegral(anx,0.0,0.0,0.0) - tx0);
	final double bny = 
	    PARTICLE_YDENSITY/(linearDensityFnIntegral(any,0.0,0.0,0.0) - ty0);
	final double x0 = bnx * tx0 - 0.5;
	final double y0 = bny * ty0 - 0.5;

	// uniform density profile
	finish ateach (point(:rank==1) pl: dist.UNIQUE) {
	    final region(:rank==1) rLocal = X10Util.getLRank2D(dResult, 0);
	    final int offset = rLocal.low();	    
	    final int koff = particlesPerPlace * pl[0];
	    final int noff = offset; // -1 ?

	    // integrate to find starting point in y
	    int kc = koff / PARTICLE_XDENSITY;
	    double yt0 = edgely;
	    double yt = yt0 + 0.5 / (bny * linearDensityFn(yt0, 0.0, 0.0, 0.0));
	    for (point(:rank==1) k: [0 : kc - 1]) {
		double yn = k[0] + y0 + 1;
		
		// guess next value for yt
		if (k[0] > 0) {
		    yt = yt + (1.0 / (bny * linearDensityFn(yt, 0.0, 0.0, 0.0)));
		}
		yt = X10Util.maxDouble(edgely, X10Util.minDouble(yt, any));

		double f = bny * linearDensityFnIntegral(yt,0.0,0.0,0.0) - yn;
		double absf = Math.abs(f);
		int i = 0;
		while (absf >= ERROR) {
		    if (absf < BIG) {
			// newton's method
			double fp = bny * linearDensityFn(yt, 0.0, 0.0, 0.0);
			yt0 = yt;
			yt = X10Util.maxDouble(edgely, 
					       X10Util.minDouble(yt - f / fp, 
								 any));
		    } else if (f > 0.0) {
			// bisection method
			yt = yt0 + (0.5 * (yt - yt0));
		    } else {
			yt = yt + yt - yt0;
		    }

		    if (i >= MAX_ITER) {
			System.err.println("1: Newton iteration max exceeded");
			break;
		    } else {
			f = bny * linearDensityFnIntegral(yt,0.0,0.0,0.0) - yn;
			absf = Math.abs(f);
		    }
		    i++;
		}
		yt0 = yt;
	    }

	    // integrate to find starting point in x
	    int jc = koff - PARTICLE_XDENSITY * kc;
	    double xt0 = edgelx;
	    double xt = xt0 + 0.5 / (bnx * linearDensityFn(xt0, 0.0, 0.0, 0.0));
	    for (point(:rank==1) j: [0 : jc - 1]) {
		double xn = j[0] + x0 + 1;
		if (j[0] > 0) {
		    xt = xt + (1.0 / (bnx * linearDensityFn(xt, 0.0, 0.0, 0.0)));
		}
		xt = X10Util.maxDouble(edgelx, X10Util.minDouble(xt, anx));

		double f = bnx * linearDensityFnIntegral(xt,0.0,0.0,0.0) - xn;
		double absf = Math.abs(f);
		int i = 0;
		while (absf >= ERROR) {
		    if (absf < BIG) {
			// newton's method
			double fp = bnx * linearDensityFn(xt, 0.0, 0.0, 0.0);
			xt0 = xt;
			xt = X10Util.maxDouble(edgelx, 
					       X10Util.minDouble(xt - f / fp, 
								 anx));
		    } else if (f > 0.0) {
			// bisection method
			xt = xt0 + 0.5 * (xt - xt0);
		    } else {
			xt = xt + xt - xt0;
		    }

		    if (i >= MAX_ITER) {
			System.err.println("2: Newton iteration max exceeded");
			break;		      
		    } else {
			f = bnx * linearDensityFnIntegral(xt,0.0,0.0,0.0) - xn;
			absf = Math.abs(f);
		    }
		    i++;
		}
		xt0 = xt;
	    }
	    kc++;

	    // density profile in x
	    for (point(:rank==1) [n] : [0 : X10Util.minInt(particlesPerPlace,
							   PARTICLE_XDENSITY) - 1]) {
		int nn = n + koff;
		int k = nn / PARTICLE_XDENSITY;
		int j = nn % PARTICLE_XDENSITY;
		double xn = j + x0 + 1;

		// guess next value for xt
		if (j == 0) {
		    xt0 = edgelx;
		    xt = xt0 + 0.5 / (bnx * linearDensityFn(xt0, 0.0, 0.0, 0.0));
		} else {
		    xt = xt + (1.0 / (bnx * linearDensityFn(xt, 0.0, 0.0, 0.0)));
		}
		xt = X10Util.maxDouble(edgelx, X10Util.minDouble(xt, anx));

		double f = bnx * linearDensityFnIntegral(xt0,0.0,0.0,0.0) - xn;
		double absf = Math.abs(f);
		int i = 0;
		while (absf >= ERROR) {
		    if (absf < BIG) {
			// newton's method
			double fp = bnx * linearDensityFn(xt, 0.0, 0.0, 0.0);
			xt0 = xt;
			xt = X10Util.maxDouble(edgelx, 
					       X10Util.minDouble(xt - f / fp, 
								 anx));
		    } else if (f > 0.0) {
			// bisection method
			xt = xt0 + 0.5 * (xt - xt0);
		    } else {
			xt = xt + xt - xt0;
		    }

		    if (i >= MAX_ITER) {
			System.err.println("3: Newton iteration max exceeded");
			break;		      
		    } else {
			f = bnx * linearDensityFnIntegral(xt,0.0,0.0,0.0) - xn;
			absf = Math.abs(f);
		    }
		    i++;
		}
		result[n + noff,X] = xt;
	    }  
	    // density profile in y
	    for (point(:rank==1) [n] : [0 : particlesPerPlace - 1]) {
		int nn = n + koff;
		int k = nn / PARTICLE_XDENSITY + 1;
		int j = nn - PARTICLE_XDENSITY * k;
		
		nn = n % PARTICLE_XDENSITY;
		
		if (k == kc) {
		    double yn = k + y0;
		    if (k > 1) {
			yt = yt + (1.0 / (bny * linearDensityFn(yt,0.0,0.0,0.0)));
		    }
		    yt = X10Util.maxDouble(edgelx, X10Util.minDouble(yt, any));

		    double f = bny * linearDensityIntegral(yt,0.0,0.0,0.0) - yn;
		    double absf = Math.abs(f);
		    int i = 0; 
		    while (absf >= ERROR) {
			if (absf < BIG) {
			    // newton's method
			    double fp = bny * linearDensityFn(yt,0.0,0.0,0.0);
			    yt0 = yt;
			    yt = X10Util.maxDouble(edgely, 
						   X10Util.minDouble(yt - f/fp,
								     any));
			} else if (f > 0.0) {
			    // bisection method
			    yt = yt0 + 0.5 * (yt - yt0);
			} else {
			    yt = yt + yt - yt0;
			}
			
			if (i >= MAX_ITER) {
			    System.err.println("4: Newton iteration max exceeded");
			    break;		      
			} else {
			    f = bny * linearDensityFnIntegral(yt,0.0,0.0,0.0) - yn;
			    absf = Math.abs(f);
			}	
			i++;		
		    }
		    kc++;
		    yt0 = yt;
		}
		result[n + noff,X] = result[nn + noff,X];
		result[n + noff,Y] = yt;
	    }
	}
	return result;
    }

    /**
     *  Check + place
     */
    public double[:rank==2] genParticleVelocity(final int n) {
	final int X = 0;
	final int Y = 1;
	final dist(:rank==2) dResult = X10Util.distBlockStar2([0:n - 1], [0:1]);
	final double[:rank==2] result = new double[dResult];

	// particle distribution constants
	finish {
	    // maxwellian velocity distribution
	    for (point(:rank==1) [i] : [0 : PARTICLE_YDENSITY - 1]) {
		final int offset = PARTICLE_XDENSITY * i;

		// maxwellian velocity distribution
		for (point(:rank==1) [j] : [0 : PARTICLE_XDENSITY - 1]) {
		    final int idx = j + offset;
		    final double vx = THERMAL_XVELOCITY * r.nextNormal();
		    final double vy = THERMAL_YVELOCITY * r.nextNormal();

 		    async (dResult.get(idx, 0)) {
			result[idx,X] = vx;
			result[idx,Y] = vy;
		    }
		}
	    }
	} 

	System.out.println("Init: correcting drift");
	// add correct drift
	final dist(:rank==1) dUnique = (dist(:rank==1)) dist.UNIQUE;
	final int[:rank==1] numParticles = 
	    new int[dUnique] (point(:rank==1) pt) { return 0; };
	final double[:rank==1] sumX =
	    new double[dUnique] (point(:rank==1) pt) { return 0.0; };
	final double[:rank==1] sumY =
	    new double[dUnique] (point(:rank==1) pt) { return 0.0; };
	
	finish ateach (point(:rank==1) pl: dist.UNIQUE) {
	    final region(:rank==1) rLocal1 = X10Util.getLRank2D(dResult, 0);
	    for (point(:rank==2) pt: [rLocal1, X:X]) {
		sumX[pl] = sumX[pl] + result[pt];
		numParticles[pl] = numParticles[pl] + 1;
	    }
	    for (point(:rank==2) pt: [rLocal1, Y:Y]) {
		sumY[pl] = sumY[pl] + result[pt];
	    }
	}

	final int totalParticles = numParticles.sum();
	final double driftX = sumX.sum() / totalParticles; // - VX0 (0.0) 
	final double driftY = sumY.sum() / totalParticles; // - VY0 (0.0)
	
	
	System.out.println("Init: updating with drift");
	finish ateach (point(:rank==1) pl: dist.UNIQUE) {
	    final region(:rank==1) rLocal1 = X10Util.getLRank2D(dResult, 0);
	    foreach (point(:rank==2) pt: [rLocal1, X:X]) {
		result[pt] = result[pt] - driftX;
	    }
	    foreach (point(:rank==2) pt: [rLocal1, Y:Y]) {
		result[pt] = result[pt] - driftY;
	    }
	}

	if (totalParticles != NPARTICLES) {
	    System.err.println("Velocity distribution truncated, number of " +
			       "particles = " + totalParticles);
	}

	return result;
    }

    /**
     *  Produces the particle array from a set of position and velocity arrays.
     */
    public Particle[:rank==1] genParticles(final int n,
					   final double[:rank==2] position,
					   final double[:rank==2] velocity) {
	final dist(:rank==1) dResult = 
	    (dist(:rank==1)) dist.factory.block([0 : n - 1]);
	return new Particle[dResult] (point(:rank==1) [i]) {
	    return new Particle(position[i,0], position[i,1],
				velocity[i,0], velocity[i,1]);
	};
    }

    /**
     *
     */
    public dist(:rank==2) genInitialDist(final Particle[:rank==1] particles) {
	final int MAX_PLACES = place.MAX_PLACES;

	// set boundary values
	final double edgely = (BOUNDARY_CONDITION == 2) ? 1.0 : 0.0;

	// find normalization for function
	final double y = YLENGTH;
	final double y0 = linearDensityFnIntegral(edgely, 0.0, 0.0, 0.0);

	// nParticlesAve = desired number of particles per processor
	final double nParticlesAve = 
	    (linearDensityFnIntegral(y - edgely, 0.0, 
				     0.0, 0.0) - y0) / MAX_PLACES;

	final dist(:rank==1) dUnique = (dist(:rank==1)) dist.UNIQUE;
	final region(:rank==1)[:rank==1] yRegions = 
	    (region(:rank==1)[:rank==1]) new region(:rank==1)[dUnique];

	finish ateach (point(:rank==1) pl: dist.UNIQUE) {

	    final double anpl = pl[0] * nParticlesAve;
	    final double anpr = (pl[0] + 1) * nParticlesAve;

	    // first find left boundary
	    double total = 0.0;
	    double tmp = 0.0;
	    double y1 = edgely;
	    do {
		tmp = total;
		total = linearDensityFnIntegral(y1, 0.0, 0.0, 0.0) - y0;
		y1 = y1 + 1.0;
	    } while (total < anpl && y1 <= y);

	    double lb = ((total > tmp) ? 
			 ((y1 - 2.0) + (anpl - tmp) / (total - tmp)) :
			 (y1 - 1.0));

	    // set leftmost edge to zero
	    if (here.isFirst()) {
		lb = 0.0;
	    }

	    // then find right boundary
	    do {
		tmp = total;
		total = linearDensityFnIntegral(y1, 0.0, 0.0, 0.0) - y0;
		y1 = y1 + 1.0;
	    } while (total < anpr && y1 <= y);

	    double ub = (y1 - 2.0) + (anpr - tmp) / (total - tmp);
	   
	    // set rightmost edge to ny
	    if (here.isLast()) {
		ub = y;
	    }

	    yRegions[pl] = [(int) (lb + 0.5) : ((int) (ub + 0.5) - 1)];
	}	

	// calculate number of grids and offsets in new partitions
	final place pHere = here;
	final dist(:rank==1) dPlace = 
	    (dist(:rank==1)) ([0 : MAX_PLACES - 1]->here);
	final region(:rank==1)[:rank==1] rBuffer = 
	    (region(:rank==1)[:rank==1]) new region(:rank==1)[dPlace];
	    
	// collect the points
	finish ateach (point(:rank==1) pl: dist.UNIQUE) {
	    final region(:rank==1) r = (region(:rank==1)) yRegions[pl];
	    async (pHere) {
		rBuffer[pl] = r;
	    }
	}

	// create the distribution
	dist(:rank==2) dResult = 
	    (dist(:rank==2)) (region.factory.emptyRegion(2)->here);
	for (point(:rank==1) pl: dist.UNIQUE) {
	    final place p = dist.UNIQUE.get(pl);
	    final region(:rank==1) ry = (region(:rank==1)) rBuffer[pl];
	    final dist(:rank==2) dLocal = 
		(dist(:rank==2)) ([ry, 0:XLENGTH]->p);
	    dResult = dResult || dLocal;
	}

	return dResult;
    }

    /**
     *
     */
    public double linearDensityFn(final double x, 
				  final double anlx,
				  final double anxi,
				  final double shift) {
	final double result = 1.0 + anlx * (x * anxi - shift);
	if (result < 0.0) {
	    System.err.println("Linear Density Error: result = " + result);
	}
	return result;
    }

    /**
     *
     */
    public double linearDensityFnIntegral(final double x,
					  final double anlx,
					  final double anxi,
					  final double shift) {
	double result = 0.0;
	if (anxi == 0.0) {
	    result = x;
	} else {
	    result = x + 0.5 * anlx * x * (x * anxi - 2.0 * shift);
	}
	
	if (result < 0.0) {
	    System.err.println("Linear Density Integral Error: " +
			       "result = " + result);
	}
	return result;
    }

    /**
     *  Performs a single time step in the plasma simulation.
     */
    public double[:rank==1] stepTime(final double[:rank==2] ionBackground) {
	long time1 = System.currentTimeMillis();
	long time2 = 0;
	final double CHARGE = ELECTRON_CHARGE;
	final dist(:rank==2) dIonBG = ionBackground.distribution;
	final double[:rank==2] chargeDensityGuards = makeGuards(dIonBG);

	final double[:rank==2] chargeDensity = 
	    (double[:rank==2]) new double[dIonBG] (point(:rank==2) pt) {
	        return 0.0;
	    };	
	
	depositCharge(particles, chargeDensity, chargeDensityGuards, CHARGE);

	// Pointwise array addition
	finish ateach (point(:rank==2) pt : dIonBG) {
	    chargeDensity[pt] = chargeDensity[pt] + ionBackground[pt];
	}

	addGuards(chargeDensity, chargeDensityGuards);
	time2 = System.currentTimeMillis();
	depositTime = depositTime + (time2 - time1);
	
	//
	// vacuum boundary conditions
	//

	// Redistribute to uniform distribution for solving
	final dist(:rank==2) dOld = chargeDensity.distribution;
	final double[:rank==2] uniformChargeDensity = 
	    moveFieldToUniform(chargeDensity);
	// Convert the charge density into an array 4X in size; make complex
	final Complex[:rank==2] complexChargeDensity = 
	    ArrayUtil.doubleToComplex(doubleDimensions(uniformChargeDensity));

	time1 = System.currentTimeMillis();
	redistTime = redistTime + (time1 - time2);
	
	// Use the solver
	final Complex[:rank==2] complexForceX = solver.makeForceArray();
	final Complex[:rank==2] complexForceY = solver.makeForceArray();
	// make guards
	double we = solver.getForceCharge(complexChargeDensity,
					  complexForceX,
					  complexForceY);

	time2 = System.currentTimeMillis();
	solverTime = solverTime + (time2 - time1);

	// Convert back to doubles; return to normal size + guards
	final dist(:rank==2) dChargeDensityGuards = 
	    chargeDensityGuards.distribution;
	final double[:rank==2] gx = new double[dChargeDensityGuards];
	final double[:rank==2] gy = new double[dChargeDensityGuards];
	final double[:rank==2] forceX = 
	    cropField(ArrayUtil.complexToDouble(complexForceX), gx);
	final double[:rank==2] forceY = 
	    cropField(ArrayUtil.complexToDouble(complexForceY), gy);

	// Redistribute force arrays back to original distribution
	final double[:rank==2] fcx = moveFieldToDist(forceX, dOld);
	final double[:rank==2] fcy = moveFieldToDist(forceY, dOld);

	// Load the guard cells
	loadGuards(fcx, gx);
	loadGuards(fcy, gy);

	time1 = System.currentTimeMillis();
	redistTime = redistTime + (time1 - time2);

	// Push the particles
	double wk = pushParticles(particles, fcx, gx, fcy, gy);

	time2 = System.currentTimeMillis();
	pushTime = pushTime + (time2 - time1);

	// Move particles into appropriate spatial regions
	final int[:rank==1] info = makeInfoArray();
	particles = moveParticles(particles, dOld, info);

	// Check to see if we need to repartition
	final double particleAve = ((double) info[6]) / place.MAX_PLACES;
	final double balance = X10Util.maxDouble(info[1] - particleAve,
						 particleAve - 
						 (info[2] / particleAve));

	// begin repartitioning
	if (balance > IMBALANCE) {
	    final int[:rank==1] count = countParticles(particles, dOld);
	    final dist(:rank==2) dNew = repartition(count, dOld, particleAve);

	    // Update background charge to new distribution; move particles
	    // to coincide with new distribution
	    backgroundCharge = moveFieldToDist(backgroundCharge, dNew);
	    particles = moveParticles(particles, dNew, info);
	}

	final dist(:rank==1) dResult = (dist(:rank==1)) ([0:2]->here);
	final double[:rank==1] result = new double[dResult];
	
	result[0] = we;
	result[1] = wk;
	result[2] = we + wk;

	time1 = System.currentTimeMillis();
	moveTime = moveTime + (time1 - time2);

	return result;
    }

    /**
     *  Calculates the density function for a linear density profile.  Used
     *  for initializing particle coordinates.  
     *
     *  NOTE: three other parameters are normally set to zero
     */
    public double linearDensity(final double x,
				final double anlx,
				final double anxi,
				final double shift) {
	return 1.0 + anlx * (x * anxi - shift);
    }

    /**
     *  Integral of above function.
     */
    public double linearDensityIntegral(final double x,
					final double anlx,
					final double anxi,
					final double shift) {
	return (anxi == 0) ? x : x + 0.5 * anlx * x * (x * anxi - 2.0 * shift);
    }

    /**
     *  Creates an array for guard cells, based on the given distribution
     *  (which is distributed in only one dimension).
     */
    public double[:rank==2] makeGuards(final dist(:rank==2) dData) {
	dist(:rank==2) dResult = 
	    (dist(:rank==2)) (region.factory.emptyRegion(2)->here);
	for (point(:rank==1) pl : dist.UNIQUE) {
	    final place p = dist.UNIQUE.get(pl);
	    final region(:rank==1) rLocal1 = X10Util.getPRank2D(dData, p, 0);
	    final region(:rank==1) rLocal2 = X10Util.getPRank2D(dData, p, 1);
	    final int ub = rLocal1.high();
	    
	    dResult = dResult || ([ub + 1:ub + 1,rLocal2]->p);
	}

	return new double[dResult] (point(:rank==2) pt) { return 0.0; };
    }

    /**
     *  Takes the charge from each particle and through interpolation, places
     *  it on the fieldCharge array.  Due to particles needing positions
     *  based on the x,y position as well as the x+1,y+1 positions, guard
     *  cells are required due to the border conditions of the field 
     *  distribution.
     */
    public 
	void depositCharge(final Particle[:rank==1] particles,
			   final double[:rank==2] fieldCharge,
			   final double[:rank==2] guards,
			   final double charge) {
	finish ateach (point(:rank==1) pl: dist.UNIQUE) {
	    // Make a local array that can be split later
	    final dist(:rank==2) dFC = fieldCharge.distribution;
	    final region(:rank==2) rLocalFC = X10Util.get2DLRegion(dFC);

	    final dist(:rank==2) dG = guards.distribution;
	    final region(:rank==2) rLocalG = X10Util.get2DLRegion(dG);
	    final dist(:rank==2) dLocal = 
		(dist(:rank==2)) ((rLocalFC || rLocalG)->here);
	    final double[:rank==2] localCharge = 
		new double[dLocal] (point(:rank==2) pt) { return 0.0; };

	    for (point(:rank==1) pt : particles.distribution | here) {
		final Particle p = particles[pt];
		final int x = (int) p.getX();
		final int y = (int) p.getY();
		final double dx = p.getX() - x;
		final double dy = p.getY() - y;
		
		// depost linear interpolated charge
		localCharge[y + 1,x + 1] = localCharge[y + 1,x + 1] + (charge * dx * dy);
		localCharge[y + 1,x]     = localCharge[y + 1,x] + (charge * (1.0 - dx) * dy);
		localCharge[y,x + 1]     = localCharge[y,x + 1] + (charge * dx * (1.0 - dy));
		localCharge[y,x]         = localCharge[y,x] + (charge * (1.0 - dx) * (1.0 - dy));
	    }

	    // Split the local data to field charge array and guard array
	    finish {
		foreach (point(:rank==2) pt : fieldCharge.distribution | here) {
		    fieldCharge[pt] = localCharge[pt];
		}
		foreach (point(:rank==2) pt : guards.distribution | here) {
		    guards[pt] = localCharge[pt];
		}
	    }
	}
    }

    /**
     *  This method takes the guard cells and transfers the data to the
     *  appropriate place to get the correct data values of the field charge.
     *  Checked + place
     */ 
    public void addGuards(final double[:rank==2] data,
			  final double[:rank==2] guards) {
	final dist(:rank==2) dGuard = (dist(:rank==2)) guards.distribution;
	finish ateach (point(:rank==1) pl: dist.UNIQUE) {
	    // Last place ignores the guard cell
	    final dist(:rank==2) dG = guards.distribution;
	    final region(:rank==2) rLocalG = X10Util.get2DLRegion(dG);
	    if (!here.isLast()) {
		final double value[:rank==2] sBuffer = 
		    (double value[:rank==2])
		    new double value[rLocalG] (point(:rank==2) pt) {
		        return guards[pt];
		    };

		// send guard cells to neighbor
		finish async (here.next()) {
		    final dist(:rank==2) dData = data.distribution;
		    final region(:rank==2) rLocalD = 
			X10Util.get2DLRegion(dData);
		    foreach (point(:rank==2) pt : (rLocalD && rLocalG)) {
			data[pt] = data[pt] + sBuffer[pt];
		    }
		}
	    }

	    // zero out guard cells
	    foreach (point(:rank==2) pt : rLocalG) {
		guards[pt] = 0.0;
	    }
	}
    }

    /**
     *  Checked + place
     */
    public double[:rank==2] doubleDimensions(final double[:rank==2] data) {
	final region(:rank==2) rData = data.region;
	final region(:rank==1) rData1 = X10Util.getRank2D(rData,0);
	final region(:rank==1) rData2 = X10Util.getRank2D(rData,1);
	final dist(:rank==2) dResult = 
	    X10Util.distBlockStar2([0:2*rData1.size() - 1],
				   [0:2*rData2.size() - 1]);
	final double[:rank==2] result = 
	    new double[dResult] (point(:rank==2) pt) { return 0.0; };

	finish ateach (point(:rank==1) pl: dist.UNIQUE) {
	    final place pDst = place.places(pl[0] / 2);
	    
	    final dist(:rank==2) dData = data.distribution;
	    final region(:rank==2) rLocal = X10Util.get2DLRegion(dData);
	    final double value[:rank==2] sBuffer = 
		(double value[:rank==2])
		new double value[rLocal] (point(:rank==2) pt) {
		    return data[pt];
	        };
	    
	    async (pDst) {
		foreach (point(:rank==2) pt : rLocal) {
		    result[pt] = sBuffer[pt];
		}
	    }
	}

	return result;
    }

    /**
     *
     */
    public double[:rank==2] moveFieldToUniform(final double[:rank==2] data) {
	final region(:rank==2) rData = data.region;
	return moveFieldToDist(data, X10Util.distBlockStar1(rData));
    }

    /**
     * checked + place
     */
    public double[:rank==2] moveFieldToDist(final double[:rank==2] data,
					    final dist(:rank==2) dDst) {
	final int MAX_ROWS = MOVE_FIELD_TO_DIST_MAX_ROWS;
	// Maximum number of iterations -- if zero, unbounded
	final int MAX_ITER = 0; 

	final dist(:rank==1) dUnique = (dist(:rank==1)) dist.UNIQUE;
	final region(:rank==2) rData = data.region;
	final region(:rank==1) rRank1 = X10Util.getRank2D(rData, 0);
	final region(:rank==1) rRank2t = X10Util.getRank2D(rData, 1);

	// Hack around a cast inside the runtime that causes an error
	final region(:rank==1) rRank2 = [0 : rRank2t.size() - 1];

	final region(:rank==1) rRows = [0:MAX_ROWS - 1];

	final dist(:rank==3) dBuffer = 
	    X10Util.extendDistRank3D(X10Util.extendDistRank2D(dUnique, rRows), 
				     rRank2);
	final double[:rank==3] srcBuffer = 
	    new double[dBuffer] (point(:rank==3) pt) { return 0.0; };
	final double[:rank==3] dstBuffer = 
	    new double[dBuffer] (point(:rank==3) pt) { return 0.0; };

	final int[:rank==1] offsets = 
	    new int[dUnique] (point(:rank==1) pt) { return 0; };
	final int[:rank==1] sizes = 
	    new int[dUnique] (point(:rank==1) pt) { return 0; };

	final int[:rank==1] inLt = 
	    new int[dUnique] (point(:rank==1) pt) { return 0; };
	final int[:rank==1] inRt = 
	    new int[dUnique] (point(:rank==1) pt) { return 0; };
	final int[:rank==1] outLt = 
	    new int[dUnique] (point(:rank==1) pt) { return 0; };
	final int[:rank==1] outRt = 
	    new int[dUnique] (point(:rank==1) pt) { return 0; };

	// fill the src buffers with the original data
	finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
	    final dist(:rank==2) dData = data.distribution;
	    final region(:rank==2) rLocal = X10Util.get2DLRegion(dData);
	    final region(:rank==1) rLocal1 = X10Util.getRank2D(rLocal, 0);
	    if (X10Util.ENABLE_CHECKS && rLocal1.size() == 0) {
		throw new RuntimeException("Region empty -- should not happen");
	    }

	    final int offset = rLocal1.low();
	    foreach (point(:rank==2) [i,j] : rLocal) {
		srcBuffer[pl,i - offset,j] = data[i,j];
	    }
	    sizes[pl] = rLocal1.size();
	    offsets[pl] = offset;
	}

	int mter = MAX_ITER;
	int iter = 0;
	boolean done = false;
	do {
	    // determine number of outgoing grids
	    finish ateach (point(:rank==1) pl: dist.UNIQUE) {
		final region(:rank==2) rLocalD = X10Util.get2DLRegion(dDst);
		final region(:rank==1) rLocalD1 = X10Util.getRank2D(rLocalD, 0);
		if (X10Util.ENABLE_CHECKS && rLocalD1.size() == 0) {
		    throw new RuntimeException("Region empty -- " +
					       "cannot to move grids");
		}
		outLt[pl] = 0;
		outRt[pl] = 0;

		final int lBorder = rLocalD1.low(); 
		final int rBorder = rLocalD1.high() + 1;
		for (point(:rank==1) [i1] : [0 : sizes[pl] - 1]) {
		    final int i2 = i1 + offsets[pl];
		    if (i2 >= rBorder) {
			// grids going up
			outRt[pl] = outRt[pl] + 1;
		    } else if (i2 < lBorder) {
			// grids going down
			outLt[pl] = outLt[pl] + 1;
		    }
		} 
	    }

	    // copy fields
	    iter++;
	    final int[:rank==1] pr = 
		new int[dUnique] (point(:rank==1) pt) { return 0; };
	    final int[:rank==1] ter = 
		new int[dUnique] (point(:rank==1) pt) { return 0; };
	    
	    // This ateach should fix the race condition
	    finish ateach (point(:rank==1) pl: dist.UNIQUE) {
		inLt[pl] = 0;
		inRt[pl] = 0;
	    }
	    // end of fix
	    
	    // get fields from below
	    finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
		/*
		 * I think is the race condition
		 *

		  inLt[pl] = 0;
		  inRt[pl] = 0;
		*/
		if (outRt[pl] > 0) {
		    final int bsize = outRt[pl];
		    final region(:rank==2) rBuffer = [0:bsize - 1,rRank2];
		    final double value[:rank==2] sBuffer = 
			(double value[:rank==2])
			new double value[rBuffer] (point(:rank==2) [i,j]) {
			    return srcBuffer[pl,i + sizes[pl] - outRt[pl],j];
		        };

		    async (here.next()) {
			foreach (point(:rank==2) [i,j] : rBuffer) {
			    dstBuffer[here.id,i,j] = sBuffer[i,j];
			}
			inLt[here.id] = bsize;
		    }
		}
	    }
	    
	    finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
		// adjust field size
		sizes[pl] = sizes[pl] - outRt[pl];
		
		// do not allow move to overflow field array
		outRt[pl] = X10Util.maxInt(sizes[pl] + inLt[pl] - MAX_ROWS, 0);
		sizes[pl] = sizes[pl] - outRt[pl];

		if (outRt[pl] > 0) {
		    pr[pl] = X10Util.maxInt(pr[pl], outRt[pl]);
		    
		    // save whatever is possible into the end of dstBuffer
		    final int rsize = X10Util.minInt(outRt[pl], 
						     MAX_ROWS - inLt[pl]);
		    finish foreach (point(:rank==2) [i,j] : 
				    [0 : rsize - 1,rRank2]) {
			dstBuffer[pl,MAX_ROWS - rsize + i,j] = 
			    srcBuffer[pl,sizes[pl] + i,j];
		    }
		}

		// shift data which is staying, if necessary
		if (sizes[pl] > 0 && inLt[pl] > 0) {
		    for (point(:rank==1) [i1] : [1 : sizes[pl]]) {
			final int i2 = sizes[pl] - i1;
			finish foreach (point(:rank==1) [j] : rRank2) {
			    srcBuffer[pl,i2 + inLt[pl],j] = srcBuffer[pl,i2,j];
			}
		    }
		}

		// insert data coming from the left
		finish foreach (point(:rank==3) pt : 
				[pl:pl,0:inLt[pl] - 1,rRank2]) {
		    srcBuffer[pt] = dstBuffer[pt];
		}

		sizes[pl] = sizes[pl] + inLt[pl];
		offsets[pl] = offsets[pl] - inLt[pl];
	    }

	    finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
		// get fields from above
		if (outLt[pl] > 0) {
		    final int bsize = outLt[pl];
		    final region(:rank==2) rBuffer = [0:bsize - 1,rRank2];
		    final double value[:rank==2] sBuffer =
			(double value[:rank==2])
			new double value[rBuffer] (point(:rank==2) [i,j]) {
			    return srcBuffer[pl,i,j];
		        };
		    async (here.prev()) {
			foreach (point(:rank==2) [i,j] : rBuffer) {
			    dstBuffer[here.id,i,j] = sBuffer[i,j];
			}
			inRt[here.id] = bsize;
		    }
		}
	    }

	    finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
		// adjust field size
		sizes[pl] = sizes[pl] - outLt[pl];
		offsets[pl] = offsets[pl] + outLt[pl];
		
		// shift data which is staying, if necessary
		if (sizes[pl] > 0 && outLt[pl] > 0) {
		    for (point(:rank==1) [i] : [0 : sizes[pl] - 1]) {
			finish foreach (point(:rank==1) [j] : rRank2) {
			    srcBuffer[pl,i,j] = srcBuffer[pl,i + outLt[pl],j];
			}
		    }
		}

		// do not allow move to overflow field array
		outLt[pl] = X10Util.maxInt(sizes[pl] + inRt[pl] - MAX_ROWS, 0);
		if (outLt[pl] > 0) {
		    pr[pl] = X10Util.maxInt(pr[pl], outLt[pl]);
		    inRt[pl] = inRt[pl] - outLt[pl];
		} else if (outRt[pl] > 0) {
		    // do not process if prior error
		} 
		  
		finish foreach (point(:rank==2) [i,j] : 
				[0:inRt[pl] - 1, rRank2]) {
		    srcBuffer[pl,i + sizes[pl],j] = dstBuffer[pl,i,j];
		}
		sizes[pl] = sizes[pl] + inRt[pl];
	    

		final region(:rank==1) rLocal1 = X10Util.getLRank2D(dDst,0);
		if (X10Util.ENABLE_CHECKS && rLocal1.size() == 0) {
		    throw new RuntimeException("Destination distribution " +
					       "is empty");
		}
		final int rsize = rLocal1.size();
		final int offset = rLocal1.low();

		ter[pl] = (Math.abs(sizes[pl] - rsize) + 
			   Math.abs(offsets[pl] - offset));
		//System.out.println("ter[" + pl + "] = " + ter[pl]);
	    }

	    int ierr = 0;
	    if (iter <= mter) {
		if (pr.max() != 0) {
		    ierr = pr.max();
		    System.err.println("Local field overflow error, " +
				       "ierr = " + ierr);
		    break;
		}

		if (iter < mter) {
		    continue;
		} else {
		    break;
		}
	    }

	    if (iter > 10) {
		throw new RuntimeException("Too many iterations");
	    }

	    final dist(:rank==1) dFlags = [0:1]->here;
	    final int[:rank==1] flags = new int[dFlags];
	    flags[0] = pr.max();
	    flags[1] = ter.max();

	    if (flags[0] != 0) {
		ierr = flags[0];
		System.err.println("Global field overflow error, " +
				   "ierr = " + ierr);
		break;
	    }

	    if (flags[1] != 0) {
		System.err.println("Info: fields being passed " +
				   "further = " + flags[1]);
	    } else {
		mter = iter;
		break;
	    } 
	} while (!done);
		
	// Create result array
	final double[:rank==2] result = new double[dDst];
	finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
	    final region(:rank==1) rLocal1 = X10Util.getLRank2D(dDst,0);
	    
	    if (X10Util.ENABLE_CHECKS) {
		if (sizes[pl] <= 0) {
		    throw new RuntimeException("Cannot make non-existant " + 
					       "region");
		}
		if (sizes[pl] != rLocal1.size() || 
		    offsets[pl] != rLocal1.low()) {
		    throw new RuntimeException("Regions don't match result " +
					       "dist");
		}
	    }

	    foreach (point(:rank==2) [i,j] : [0:sizes[pl] - 1,rRank2]) {
		result[offsets[pl] + i,j] = srcBuffer[pl,i,j];
	    }
	}

	return result;
    }

    /**
     * check + place
     */
    public double[:rank==2] cropField(final double[:rank==2] data,
				      final double[:rank==2] guards) {
	final region(:rank==1) rRank1 = [0 : YLENGTH - 1];
	final region(:rank==1) rRank2 = [0 : XLENGTH];
	final dist(:rank==2) dGuard = guards.distribution;
	final region(:rank==2) rGuard = 
	    // X10Util.get2DPRegion(dGuard, place.LAST_PLACE);
	    X10Util.get2DPRegion(dGuard, place.places(place.MAX_PLACES-1));
	final dist(:rank==2) dResult = X10Util.distBlockStar2(rRank1, rRank2);
	final double[:rank==2] result = new double[dResult];
	
	// TODO: handle loading the last guard cell
	// finish ateach (point [pl] : dist.UNIQUE) {
	for (point(:rank==1) pl: dist.UNIQUE) 
	    finish async (dist.UNIQUE.get(pl)) {
	    final dist(:rank==2) dData = data.distribution;
	    final region(:rank==2) rLocalS = X10Util.get2DLRegion(dData);
	    final region(:rank==1) rLocalS1 = X10Util.getRank2D(rLocalS,0);
	    if (rLocalS.size() > 0 && rLocalS1.low() < YLENGTH) {
		final place pDst1 = place.places(2 * pl[0]);
		final place pDst2 = place.places(2 * pl[0] + 1);
		
		final double value[:rank==2] sBuffer = 
		    (double value[:rank==2])
		    new double value[rLocalS] (point(:rank==2) pt) {
		    return data[pt];
	        };
		
		async (pDst1) {
		    final region(:rank==2) rLocalD = 
			X10Util.get2DLRegion(dResult);
		    foreach (point(:rank==2) pt : rLocalD) {
			result[pt] = sBuffer[pt];
		    }
		}
		
		async (pDst2) {
		    final region(:rank==2) rLocalD = 
			X10Util.get2DLRegion(dResult);
		    foreach (point(:rank==2) pt : rLocalD) {
			result[pt] = sBuffer[pt];
		    }		
		}	   
	    }

	    if (rLocalS1.contains([YLENGTH])) {
		final double value[:rank==2] sBuffer = 
		    (double value[:rank==2]) 
		    new double value[rGuard] (point(:rank==2) pt) {
		        return data[pt];
		    };
		// async (place.LAST_PLACE) {
                async (place.places(place.MAX_PLACES-1)) {
		    foreach (point(:rank==2) pt : rGuard) {
			guards[pt] = sBuffer[pt];
		    }
		}
	    }
	}
	return result;
    }

    /**
     *  Takes a partitioned array and guard cell array and fills the guards.
     *  check + place
     */
    public void loadGuards(final double[:rank==2] data, 
			   final double[:rank==2] guards) {
	finish ateach (point(:rank==1) pl: dist.UNIQUE) {
	    if (!here.isFirst()) {
		final dist(:rank==2) dGuard = guards.distribution;
		final region(:rank==2) rGuard = 
		    X10Util.get2DPRegion(dGuard, here.prev());
		final double value[:rank==2] sBuffer =
		    (double value[:rank==2])
		    new double value[rGuard] (point(:rank==2) pt) {
		        return data[pt];
		    };
		
		async (here.prev()) {
		    foreach (point(:rank==2) pt : rGuard) {
			guards[pt] = sBuffer[pt];
		    }
		}
	    }
	}
    }

    /**
     *
     */
    public int[:rank==1] makeInfoArray() {
	final dist(:rank==1) dInfo = (dist(:rank==1)) ([0:6]->here);
	return new int[dInfo] (point(:rank==1) pt) { return 0; };
    }

    /**
     *  Redistributes the particles in the given array such that all particles
     *  mapped to a single place have their spatial position located in the
     *  same bounds as the given distribution.  This allows all particles
     *  to have complete local access to the field array without any need
     *  of communication.
     *
     *  The info array returns the following status information:
     *    info[0] = error condition
     *    info[1] = maximum number of particles per processor
     *    info[2] = minimum number of particles per processor
     *    info[3] = maximum number of buffer overflows
     *    info[4] = maximum number of particle passes required
     *    info[5] = total number of particles on entry
     *    info[6] = total number of particles on exit
     * check + place
     */
    public 
	Particle[:rank==1] moveParticles(final Particle[:rank==1] particles,
					 final dist(:rank==2) dFieldSpace,
					 final int[:rank==1] info) {
	// NOTE: the maximum buffer sizes should be dependent on the input size
	//       and not the arbitrarily large value currently used
	final int MAX = MOVE_PARTICLES_MAX;
	final int MAX_BUFFER = MOVE_PARTICLES_MAX_BUFFER;
	final int ITER_MAX = 20;

	final region(:rank==1) rPart = [0 : MAX - 1];
	final region(:rank==1) rBuffer = [0 : MAX_BUFFER - 1];
	final dist(:rank==1) dUnique = (dist(:rank==1)) dist.UNIQUE;

	final dist(:rank==2) dPart = X10Util.extendDistRank2D(dUnique, rPart);
	final dist(:rank==2) dBuffer = X10Util.extendDistRank2D(dUnique, 
								rBuffer);

	// Temporary storage to hold particles until all 
	// particles reach their destination place
	final Particle[:rank==2] part = new Particle[dPart];

	// Buffers for sending and recieving
	final Particle[:rank==2] sBufferL = new Particle[dBuffer];
	final Particle[:rank==2] sBufferR = new Particle[dBuffer];
	final Particle[:rank==2] rBufferL = new Particle[dBuffer];
	final Particle[:rank==2] rBufferR = new Particle[dBuffer];
    
	// Meta information for how many items are in each buffer
	final int[:rank==1&&distribution==dUnique] inLt = 
	    new int[dUnique] (point(:rank==1) pt) { return 0; };
	final int[:rank==1&&distribution==dUnique] inRt = 
	    new int[dUnique] (point(:rank==1) pt) { return 0; };
	final int[:rank==1&&distribution==dUnique] outLt = 
	    new int[dUnique] (point(:rank==1) pt) { return 0; };
	final int[:rank==1&&distribution==dUnique] outRt = 
	    new int[dUnique] (point(:rank==1) pt) { return 0; };
	final int[:rank==1&&distribution==dUnique] nPart = 
	    new int[dUnique] (point(:rank==1) pt) { return 0; };

	// NOTE: Some more meta information?
	int[:rank==1&&distribution==dUnique] nPartOld = 
	    new int[dUnique] (point(:rank==1) pt) { return 0; };

	// For each particle that leaves its partition, we keep track of 
	// the slot so that any incoming particle may fill the slot
	final int[:rank==2] holes = 
	    new int[dPart] (point(:rank==2) pt) { return 0; };

	// NOTE: I'm not sure of the purpose of these arrays 
	final dist(:rank==1) dFlags = [0:3]->here;
	final int[:rank==1&&distribution==dUnique] nSent = 
	    new int[dUnique] (point(:rank==1) pt) { return 0; };
	final int[:rank==1] ibflg = 
	    new int[dFlags] (point(:rank==1) pt) { return 0; };

	// Fill the part array and set the associated size array
	finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
	    final region(:rank==1) rLocal = 
		(region(:rank==1)) (particles.distribution | here).region;
	    
	    if (rLocal.size() > 0) {
		final int offset = rLocal.low();
		
		foreach (point(:rank==1) [i] : rLocal) {
		    part[pl,i - offset] = particles[i];
		}
	    }
	    nPart[pl] = rLocal.size();
	}	
	
	final region(:rank==2) rFieldSpace = dFieldSpace.region;
	final double rsize = X10Util.getRank2D(rFieldSpace,1).size();
	int iter = 2;
	int nter = 0;

	finish foreach (point(:rank==1) pt : [0 : 6]) {
	    info[pt] = 0;
	}

	// debugging section: count total number of particles befor move
	nPartOld = nPartOld + nPart;

	boolean doneInner = false;
	boolean doneOuter = false;
	do {
	    // buffer outgoing particles
	    int mter = 0;

	    final int[:rank==1&&distribution==dUnique] overflow = 
		new int[dUnique] (point(:rank==1) pt) { return 0; };
	    
	    finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
		final region(:rank==2) rLocal = 
		    (region(:rank==2)) (dFieldSpace | here).region;
		final region(:rank==1) rLocal1 = X10Util.getRank2D(rLocal,0);
		final double ub = rLocal1.high() + 1;
		final double lb = rLocal1.low();
		
		outLt[pl] = 0;
		outRt[pl] = 0;
		
		for (point(:rank==1) [i] : [0 : nPart[pl] - 1]) {
		    final Particle p = part[pl,i];
		    
		    double y = p.getY();
		    if (y < lb) {
			// particles going down
			if (outLt[pl] < rBuffer.size()) {
			    if (here.isFirst()) {
				y = y + rsize;
			    }
			    sBufferL[pl,outLt[pl]] = p.setY(y);
			    holes[pl,outLt[pl] + outRt[pl]] = i;
			    outLt[pl]++;
			} else {
			    // Buffer overflow indication
			    overflow[pl] = 1;
			    break;
			}
		    } else if (y >= ub) {
			// particles going up
			if (outRt[pl] < rBuffer.size()) {
			    if (here.isLast()) {
				y = y - rsize;
			    }
			    sBufferR[pl,outRt[pl]] = p.setY(y);
			    holes[pl,outLt[pl] + outRt[pl]] = i;
			    outRt[pl]++;
			} else {
			    // Buffer overflow indication
			    overflow[pl] = 1;
			    break;
			}			
		    }
		}
		// total number of particles leaving the system
		nSent[pl] = outLt[pl] + outRt[pl]; 
	    }
	    
	    
	    // check for full buffer condition
	    // Results in flag indicating overflow
	    ibflg[2] = overflow.max();

	    // copy particle buffer	    
	    do {
		iter = iter + 2;
		mter = mter + 1; 

		// Send particle to adjacent places
		transferParticles(sBufferL, sBufferR, outLt, outRt, 
				  rBufferL, rBufferR, inLt, inRt);

		// check if particles must be passed further
		final int[:rank==1] outgoing = new int[dUnique];
		finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
		    final region(:rank==2) rLocal = 
			(region(:rank==2)) (dFieldSpace | here).region;
		    final region(:rank==1) rLocal1 = X10Util.getRank2D(rLocal,0);
		    final double ub = rLocal1.high() + 1;
		    final double lb = rLocal1.low();
		    
		    // check if any particles coming from above belong here
		    outLt[pl] = 0;
		    outRt[pl] = 0;

		    int belowLeft = 0;
		    for (point(:rank==1) [i] : [0 : inRt[pl] - 1]) {
			final Particle p = rBufferR[pl,i];
			final double y = p.getY();
			if (y < lb) {
			    outLt[pl]++;			   
			}
			if (y >= ub) {
			    outRt[pl]++;
			}
		    }

		    if (outRt[pl] != 0) {
			System.err.println("Info: particles returning up");
		    }

		    // check if any particles coming from below belong here
		    for (point(:rank==1) [i] : [0 : inLt[pl] - 1]) {
			final Particle p = rBufferL[pl,i];
			final double y = p.getY();
			if (y >= ub) {
			    outRt[pl]++;
			} 
			if (y < lb) {
			    belowLeft++;
			}
		    }

		    if (belowLeft != 0) {
			System.err.println("Info: particles returning down");
		    }
		    outLt[pl] = outLt[pl] + belowLeft;
		    outgoing[pl] = outLt[pl] + outRt[pl];	    
		}

		ibflg[1] = outgoing.max();

		if (ibflg[1] != 0) {
		    // remove particles which do not belong here
		    finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
			final region(:rank==2) rLocal = 
			    (region(:rank==2)) (dFieldSpace | here).region;
			final region(:rank==1) rLocal1 = 
			    X10Util.getRank2D(rLocal,0);
			final double ub = rLocal1.high() + 1;
			final double lb = rLocal1.low();
			// first check particles coming from above
			outLt[pl] = 0;
			outRt[pl] = 0;
			overflow[pl] = 0;
			
			int inRightStaying = 0;
			for (point(:rank==1) [i] : [0 : inRt[pl] - 1]) {
			    final Particle p = rBufferR[pl,i];
			    double y = p.getY();

			    if (y < lb) {
				// particles going down
				if (here.isFirst()) {
				    y = y + rsize;
				} 
				sBufferL[pl,outLt[pl]] = p.setY(y);
				outLt[pl]++;
			    } else if (y >= ub) {
				// particles going up, should not happen
				System.err.println("Particle returning up -- "
						   + "should not happen: " 
						   + p.toString());
				if (here.isLast()) {
				    y = y - rsize;
				}
				sBufferR[pl,outRt[pl]] = p.setY(y);
				outRt[pl]++;
			    } else {
				rBufferR[pl,inRightStaying] = p;
				inRightStaying++;
			    }			    
			}
			inRt[pl] = inRightStaying;

			// next check particles coming from below
			int inLeftStaying = 0;
			for (point(:rank==1) [i] : [0 : inLt[pl] - 1]) {
			    final Particle p = rBufferL[pl,i];
			    double y = p.getY();

			    if (y >= ub) {
				// particles going up
				if (outRt[pl] < rBuffer.size()) {
				    if (here.isLast()) {
					y = y - rsize;
				    }
				    sBufferR[pl,outRt[pl]] = p.setY(y);
				    outRt[pl]++;
				} else {
				    overflow[pl] = 2 * rBuffer.size();
				    break;
				}
			    } else if (y < lb) {
				// particles going down, should not happen
				if (outLt[pl] < rBuffer.size()) {
				    if (here.isFirst()) {
					y = y + rsize;
				    }
				    sBufferL[pl,outLt[pl]] = p.setY(y);
				    outLt[pl]++;
				} else {
				    overflow[pl] = 2 * rBuffer.size();
				    break;
				}
			    } else {
				rBufferL[pl,inLeftStaying] = p;
				inLeftStaying++;
			    }
			}
			inLt[pl] = inLeftStaying;
		    }
		}

		// check if move would overflow particle array
		final int rSize = rPart.size();
		final int[:rank==1&&distribution==dUnique] tMaxSize = 
		    (nPart + inLt + inRt - nSent);
		final int[:rank==1&&distribution==dUnique] tMinSize = 
		    (new int[dUnique] (point(:rank==1) pt) { return rSize; }) - 
		    tMaxSize;


		info[1] = tMaxSize.max();
		info[2] = rSize - tMinSize.max();
		int err = ibflg[1] - rPart.size();
		if (err > 0) {
		    System.err.println("Particle overflow error, err = " + err);
		    info[0] = err;
		    return particles;
		}

		finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
		    int holesTotal = nSent[pl];
		    int holesLeft = nSent[pl];
 
		    // distribute incoming partices from buffers
		    // distribute particles coming from below into holes
		    int nMove = X10Util.minInt(holesLeft, inLt[pl]);
		    finish foreach (point(:rank==1) [i] : [0 : nMove - 1]) {
			part[pl,holes[pl,i]] = rBufferL[pl,i];		    
		    }

		    holesLeft = holesLeft - inLt[pl];
		    if (holesLeft > 0) {
			// Holes left, fill as many as possible with 
			// particles from the right
			nMove = X10Util.minInt(holesLeft, inRt[pl]);
			for (point(:rank==1) [i] : [0 : nMove - 1]) {
			    part[pl,holes[pl,i + inLt[pl]]] = rBufferR[pl,i];
			}
		    } else {
			// No more holes, put them at the end
			nMove = -holesLeft;
			for (point(:rank==1) [i] : [0 : nMove - 1]) {
			    part[pl,i + nPart[pl]] =
				rBufferL[pl,i + holesTotal];
			}
		    }
		    
		    if (holesLeft <= 0) {
			nPart[pl] = nPart[pl] - holesLeft; // adds some particles
			holesTotal = inLt[pl];  
		    } 

		    holesLeft = holesTotal - (inLt[pl] + inRt[pl]);
		    if (holesLeft > 0) {
			holesTotal = inLt[pl] + inRt[pl];
			inRt[pl] = holesLeft;
		    } else {
			holesTotal = holesTotal - inLt[pl];
			inRt[pl] = -holesLeft;
		    }

		    for (point(:rank==1) [i] : [0 : inRt[pl] - 1]) {
			// holes left over
			// fill up remaining holes in the particle array
			// with particles from bottom
			if (holesLeft > 0) {
			    final int i1 = nPart[pl] - i - 1;
			    final int i2 = holesTotal + holesLeft - i - 1;

			    if (i1 > holes[pl,i2]) {
				// move particle only if is below current hole
				part[pl,holes[pl,i2]] = part[pl,i1];
			    }
			} else {
			    // no more holes
			    // distribute remaining from above into bottom
			    part[pl,i + nPart[pl]] = 
				rBufferR[pl,i + holesTotal];
			}
		    }
		    
		    if (holesLeft > 0) {
			nPart[pl] = nPart[pl] - inRt[pl];
		    } else {
			nPart[pl] = nPart[pl] + inRt[pl];
		    }
		    nSent[pl] = 0; 
		}

		info[4] = X10Util.maxInt(info[4], mter);

		if (ibflg[1] > 0) {
		    System.err.println("Info: particles being passed" + 
				       " further = " + ibflg[1]);
		    if (ibflg[2] > 0) {
			ibflg[2] = 1;
		    }
		    if (iter >= ITER_MAX) {
			err = -((iter - 2 / 2));
			System.err.println("Iteration overflow, " 
					   + "iter = " + err);
			info[0] = err;
			doneInner = true;
			doneOuter = true;
		    }
		} else {
		    doneInner = true;
		}
	    } while (!doneInner);

	    if (!doneOuter && ibflg[2] > 0) {
		nter++;
		info[3] = nter;
	    } else {
		doneOuter = true;
	    }
	} while (!doneOuter);

	// debugging section: count total number of particles after move
	info[5] = nPart.sum();
	info[6] = nPartOld.sum();

	if (info[5] != info[6]) {
	    System.err.println("Particle number error, old/new = " 
			       + info[0] + " " + info[1]);
	    info[0] = 1;
	}

	// information
	if (nter > 0) {
	    System.err.println("Info: " + nter + " buffer overflows, " 
			       + "nbmax = " + rBuffer.size());
	}

	return packParticleArray(part, nPart);
    }

    /**
     *  Given a buffer distributed [dist.UNIQUE,0:N], transfers the particles
     *  from the left send buffer to the right receive buffer of the previous 
     *  place and the right send buffer to the left receive buffer of the
     *  next place.  The out left and out right arrays indicate how many 
     *  particles are moving in either direction as the send buffers are
     *  fixed size.  The in left and right arrays tell the local place how
     *  many particles are being recieved in the left and right buffers.
     */
    private 
	void transferParticles(final Particle[:rank==2] leftOutBuffer,
			       final Particle[:rank==2] rightOutBuffer,
			       final int[:rank==1] outLeft,
			       final int[:rank==1] outRight,
			       final Particle[:rank==2] leftInBuffer,
			       final Particle[:rank==2] rightInBuffer,
			       final int[:rank==1] inLeft,
			       final int[:rank==1] inRight) {
	finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
	    // get particles from below and above
	    final place pLeft  = here.prev();
	    final place pRight = here.next();
	    final region(:rank==1) rLeft = [0 : outLeft[pl] - 1];
	    final region(:rank==1) rRight = [0 : outRight[pl] - 1];
	    
	    final Particle value[:rank==1] lBuffer =
		(Particle value[:rank==1])
		new Particle value[rLeft] (point(:rank==1) [i]) {
		return leftOutBuffer[pl,i];
	    };
	    
	    final Particle value[:rank==1] rBuffer =
		(Particle value[:rank==1])
		new Particle value[rRight] (point(:rank==1) [i]) {
		return rightOutBuffer[pl,i];
	    };
	    
	    // Send particles left
	    async (pLeft) {
		final int pid = here.id;
		inRight[pid] = lBuffer.region.size();
		foreach (point(:rank==1) [i] : lBuffer) {
		    rightInBuffer[pid,i] = lBuffer[i]; 
		}
	    }
	    
	    // Send particles right
	    async (pRight) {
		final int pid = here.id;
		inLeft[pid] = rBuffer.region.size();
		foreach (point(:rank==1) [i] : rBuffer) {
		    leftInBuffer[pid,i] = rBuffer[i];
		}
	    }
	}
    }

    /**
     *  Takes the particle buffer arrays and converts it into a single one
     *  dimensional array distributed in contiguous blocks.  All the particles
     *  in the first place are at the beginning while all the particles on
     *  the last place are at the end of the array.
     */
    private 
	Particle[:rank==1] packParticleArray(final Particle[:rank==2] part,
					     final int[:rank==1] nParticles) {
	// convert the part buffers into a single particle array
	int lb = 0;
	dist(:rank==1) dResult = 
	    (dist(:rank==1)) (region.factory.emptyRegion(1)->here);
	for (point(:rank==1) pt: dist.UNIQUE) {
	    int rsize = X10Util.pullInt(nParticles, pt);
	    place p = place.places(pt[0]);
	    dResult = dResult || ([lb : lb + rsize - 1]->p);
	    lb = lb + rsize;
	}

	final Particle[:rank==1] result = new Particle[dResult];
	finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
	    final region(:rank==1) rLocal = 
		(region(:rank==1)) (result.distribution | here).region;
	   
	    if (rLocal.size() > 0) {
		final int offset = rLocal.low();
		foreach (point(:rank==1) [i] : rLocal) {
		    result[i] = part[pl,i - offset];
		}
	    }
	}
	return result;
    }

    /**
     *  Takes a 3D array consisting of two 2D arrays of the X and Y components
     *  of the forces in the system.  Each particle performs linear 
     *  interpolation based on its position to calculate the its acceleration.
     *  The particle then updates its velocity and position based on the
     *  various boundary conditions.  The ammount of energy in the system
     *  is returned.
     */
    public double pushParticles(final Particle[:rank==1] particles,
				final double[:rank==2] forceChargeX,
				final double[:rank==2] fcGuardX,
				final double[:rank==2] forceChargeY,
				final double[:rank==2] fcGuardY) {
	// Set up the boundary conditions (periodic, reflecting, etc.)
	double lx = 0.0;
	double ly = 0.0;
	double rx = 0.0;
	double ry = 0.0;

	switch (BOUNDARY_CONDITION) {
	case 1:
	    rx = XLENGTH;
	    break;
	case 2:
	    lx = 1.0;
	    ly = 1.0;
	    rx = XLENGTH - 1.0;
	    ry = YLENGTH - 1.0;
	    break;
	case 3:
	    lx = 1.0;
	    rx = XLENGTH - 1.0;
	    break;
	}
	final double edgelx = lx;
	final double edgely = ly;
	final double edgerx = rx;
	final double edgery = ry;

	final double quantum = ELECTRON_CHARGE * DELTA_TIME;
	final dist(:rank==1) dEnergy = particles.distribution;
	final double[:rank==1] energy = new double[dEnergy];

	finish ateach (point(:rank==1) pl: dist.UNIQUE) {
	    // Combine the guards into a single local array space
	    final double[:rank==2] fcLocalX = 
		makeLocalSpace(forceChargeX, fcGuardX);
	    final double[:rank==2] fcLocalY = 
		makeLocalSpace(forceChargeY, fcGuardY);
	    
	    foreach (point(:rank==1) pt : particles.distribution | here) {
		pushParticle(particles, pt, fcLocalX, fcLocalY, quantum, 
			     edgelx, edgely, edgerx, edgery, energy);	  
	    }
	}					
	return (0.125 * energy.sum());
    }
  
    /**
     *  Creates a single unified local array consisting of the data points of
     *  the data and guard arrays.  That is, it takes the points in the 
     *  data and guard arrays, places them into a single combined array
     *  (they must be disjoint) and returns it.
     */
    private 
	double[:rank==2] makeLocalSpace(final double[:rank==2] data, 
					final double[:rank==2] guards) {
	final dist(:rank==2) dData = data.distribution;
	final dist(:rank==2) dGuard = guards.distribution;
	final region(:rank==2) rLocalD = X10Util.get2DLRegion(dData);
	final region(:rank==2) rLocalG = X10Util.get2DLRegion(dGuard);
	final dist(:rank==2) dResult = 
	    (dist(:rank==2)) ((rLocalD || rLocalG)->here);

	final double[:rank==2] result = new double[dResult];
	finish {
	    foreach (point(:rank==2) pt : data.distribution | here) {
		result[pt] = data[pt]; 
	    }
	    foreach (point(:rank==2) pt : guards.distribution | here) {
		result[pt] = guards[pt];
	    }
	}
	return result;
    }

    /**
     *  Pushes the particle based on the forceChargeX and forceChargeY 
     *  input.  The reflecting conditions will affect the location and
     *  velocity if the particle is moving out of bounds.  This replaces
     *  the current value in the particle array as well as updating the
     *  
     */
    private void pushParticle(final Particle[:rank==1] particles,
			      final point(:rank==1) pt,
			      final double[:rank==2] forceChargeX,
			      final double[:rank==2] forceChargeY,
			      final double quantum,
			      final double edgelx,
			      final double edgely,
			      final double edgerx,
			      final double edgery,
			      final double[:rank==1] energy) {
	final Particle p = particles[pt];
	final int x = (int) p.getX();
	final int y = (int) p.getY();
	
	final double dx = p.getX() - x;
	final double dy = p.getY() - y;
	final double mx = 1.0 - dx;
	final double my = 1.0 - dy;

	// find acceleration
	final double ax = (dy * (dx * forceChargeX[y + 1,x + 1] +
				 mx * forceChargeX[y + 1,x]) +
			   my * (dx * forceChargeX[y,x + 1] +
				 mx * forceChargeX[y,x]));
	final double ay = (dy * (dx * forceChargeY[y + 1,x + 1] +
				 mx * forceChargeY[y + 1,x]) +
			   my * (dx * forceChargeY[y,x + 1] +
				 mx * forceChargeY[y,x]));
// 	System.out.println(pt + ": " + p +
// 			   " ax = " + ax +
// 			   " ay = " + ay +
// 			   " fx1 = " + forceChargeX[y,x] +
// 			   " fx2 = " + forceChargeX[y,x+1] +
// 			   " fx3 = " + forceChargeX[y+1,x] +
// 			   " fx4 = " + forceChargeX[y+1,x+1] +
// 			   " fy1 = " + forceChargeY[y,x] +
// 			   " fy2 = " + forceChargeY[y,x+1] +
// 			   " fy3 = " + forceChargeY[y+1,x] +
// 			   " fy4 = " + forceChargeY[y+1,x+1]);

	// find velocity
	double vx = p.getXVel() + quantum * ax;
	double vy = p.getYVel() + quantum * ay;

	// new postion
	double nx = p.getX() + vx * DELTA_TIME;
	double ny = p.getY() + vy * DELTA_TIME;

	// average kinetic energy
	energy[pt] = (Math.pow(vx + p.getXVel(), 2) + 
		      Math.pow(vy + p.getYVel(), 2));
	
	switch (BOUNDARY_CONDITION) {
	case 1: 
	    if (nx < edgelx) {
		nx = nx + edgerx;
	    } 
	    if (nx >= edgerx) {
		nx = nx - edgerx;
	    }
	    break;	   
	case 2:
	    if (ny < edgely || ny >= edgery) {
		ny = p.getY();
		vy = -vy;
	    }
	    // fall through
	case 3:
	    if (nx < edgelx || nx >= edgerx) {
		nx = p.getX();
		vx = -vx;
	    }	    
	    break;
	}
	particles[pt] = new Particle(nx, ny, vx, vy);
    }			      

    /**
     *  Counts how many particles in are in each y grid.
     *  check + place
     */
    public 
	int[:rank==1] countParticles(final Particle[:rank==1] particles,
				     final dist(:rank==2) dField) {
	final dist(:rank==1) dCount = X10Util.get2DDistRank(dField, 0);
	final int[:rank==1] count = 
	    new int[dCount] (point(:rank==1) pt) { return 0; };

	finish ateach (point(:rank==1) pl: dist.UNIQUE) {
	    for (point(:rank==1) pt: particles.distribution | here) {
		count[(int) particles[pt].getY()]++;
	    }
	}
	return count;
    }

    /**
     * check+place
     */
    public dist(:rank==2) repartition(final int[:rank==1] particleCount,
				      final dist(:rank==2) dField,
				      final double countAve) {
// 	System.out.println("Average: " + countAve);
// 	for (point(:rank==1) [i] : particleCount) {
// 	    finish async (particleCount.distribution.get(i)) {
// 		System.out.println([i] + ": " + particleCount[i]);
// 	    }
// 	}

	// Maximum buffer size -- could dynamically determine?
	final int MAX = 32;
	final dist(:rank==1) dUnique = (dist(:rank==1)) dist.UNIQUE;

	// Get the distribution in the y-axis 
	final dist(:rank==1) dGrids = X10Util.get2DDistRank(dField, 0);
	final region(:rank==2) rField = dField.region;
	final region(:rank==1) rRows = X10Util.getRank2D(rField, 1);

	// Lower boundary of the partition at a specific place
	final double[:rank==1] border = 
	    new double[dUnique] (point(:rank==1) pt) { return 0.0; };

	// The point [i] contains the total number of particles from 
	// places [0..i]
	final int[:rank==1] particleTotals = 
	    new int[dUnique] (point(:rank==1) pt) { return 0; };

	// The point [i] contains the total number of grids in the y-axis 
	// from places [0..i].
	final int[:rank==1] gridTotals =
	    new int[dUnique] (point(:rank==1) pt) { return 0; };


	// Buffers which [i,j] represents the number of particles in the 
	// y-axis at place i; the first y index in that place.  These are
	// both send and recieve buffers
	final dist(:rank==2) dBuffer = 
	    X10Util.extendDistRank2D((dist(:rank==1)) dist.UNIQUE, 
				     [0 : MAX - 1]);

	final int[:rank==2] sCountBuffer = new int[dBuffer];
	final int[:rank==2] rCountBuffer = new int[dBuffer];

	final int[:rank==1] sendCount = new int[dUnique];
	final int[:rank==1] sendGrids = new int[dUnique];
	final int[:rank==1] recvCount = new int[dUnique];
	final int[:rank==1] recvGrids = new int[dUnique];

	// Tells whether a place is done 
	final int[:rank==1] finished =
	    new int[dUnique] (point(:rank==1) pt) { return 0; };

	// copy number of particles and grid in current partition
	finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
	    final dist(:rank==1) dPC = particleCount.distribution;
	    final region(:rank==1) rLocal = X10Util.get1DLRegion(dPC);
	    final int rsize = rLocal.size();
	    final int offset = (rsize > 0) ? rLocal.low() : 0;
	    
	    int total = 0;
	    for (point(:rank==1) [i] : particleCount.distribution | here) {
		final int count = particleCount[i];
		sCountBuffer[pl,i - offset] = count;
		total = total + count;
	    }
	    particleTotals[pl] = total;
	    gridTotals[pl] = rsize;

	    sendCount[pl] = total;
	    sendGrids[pl] = rsize;
	    recvCount[pl] = 0;
	    recvGrids[pl] = 0;
	}

	// perform running sum
	final int[:rank==1] runningPTotals = parallelPrefix(particleTotals);
	final int[:rank==1] runningGTotals = parallelPrefix(gridTotals);

	finish ateach (point(:rank==1) pl: dist.UNIQUE) {
	    particleTotals[pl] = runningPTotals[pl];
	    gridTotals[pl] = runningGTotals[pl];
	}

	do {
	    // move partition
	    finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
		// If we need grids from the left, grab the current 
		// particle count information from the left
		final int expected = (int) ((pl + 1) * countAve + 0.5);
		final int surplus = runningPTotals[pl] - expected;
		
		if (surplus > 0.0) {	
		    // Have excess grids, send count info to next neighbor
		    final region(:rank==1) dSBuffer = [0 : sendGrids[pl] - 1];
		    final int value[:rank==1] sBuffer = 
			(int value[:rank==1])
			new int value[dSBuffer] (point(:rank==1) [i]) {
			    return sCountBuffer[pl,i];
		        };
		    final int nCount = sendCount[pl];
		    final int nGrids = sendGrids[pl];

		    finish async (here.next()) {
			recvCount[here.id] = nCount;
			recvGrids[here.id] = nGrids;
			finish foreach (point(:rank==1) [i] : dSBuffer) {
			    rCountBuffer[here.id,i] = sBuffer[i];
			}
		    }
		}
	    }

	    // find new partitions
	    finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
		finished[pl] = 0;
		
		final int expected1 = (int) (pl * countAve + 0.5);
		final int expected2 = (int) ((pl + 1) * countAve + 0.5);

		// Excess or needed from the left (negative = needs)
		final int lDeficit = 
		    expected1 - runningPTotals[pl] + sendCount[pl];

		// Excess or needed from the right (negative = needs)
		final int rDeficit = runningPTotals[pl] - expected2;

		if (lDeficit < 0.0) {
		    if (lDeficit + recvCount[pl] >= 0.0) {
			// left boundary is on the left 
			// -- Take left grids until we have no more deficit
			int total = 0;
			int oldTotal = 0;
			int gsize = recvGrids[pl];
			int i = gsize;
			
			// add grids to eliminate deficit
			do {
			    i--;
			    oldTotal = total;
			    total = total - rCountBuffer[pl,i];
			} while (total > lDeficit && i >= 0);
			double offset =  ((gsize - i) + // - 1 ?
					  (((double) (lDeficit - oldTotal)) / 
					   ((double) (total - oldTotal))));
			border[pl] = 
			    runningGTotals[pl] - sendGrids[pl] - offset;
		    } else {
			// need to run another iteration
			finished[pl]++;
		    }
		} else if (runningPTotals[pl] >= expected1) {
		    // left boundary is already here
		    int gsize = sendGrids[pl];
		    int i = 0;
		    int total = 0;
		    int oldTotal = 0;

		    // Remove grids to make up for surplus 
		    do {
			oldTotal = total;
			total = total + sCountBuffer[pl,i];
			i++;
		    } while (total < lDeficit && i < gsize);
		    double offset = i - 1;
		    if (total > oldTotal) {
			offset = offset + 
                                  (((double) (lDeficit - oldTotal)) / 
				   ((double) (total - oldTotal)));
		    }
		    border[pl] = 
			runningGTotals[pl] - sendGrids[pl] + offset;
 		}

		// surplus right data will need to be sent
		if (rDeficit > sendCount[pl]) {
		    // need to run another iteration
		    finished[pl]++;
		}

		if (!here.isFirst()) {
		    int gsize = recvGrids[pl];
		    // adjust running sums
		    runningPTotals[pl] = runningPTotals[pl] - sendCount[pl];
		    runningGTotals[pl] = runningGTotals[pl] - sendGrids[pl];
		    // send recieved data further right
		    sendCount[pl] = recvCount[pl];
		    sendGrids[pl] = recvGrids[pl];
		    finish foreach (point(:rank==2) pt: 
				    [pl : pl,0 : gsize - 1]) {
			sCountBuffer[pt] = rCountBuffer[pt];
		    }
		}
	    }
	} while (finished.sum() != 0);

	// restore partition data
	finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
	    final dist(:rank==1) dPC = particleCount.distribution;
	    final region(:rank==1) rLocal = X10Util.get1DLRegion(dPC);
	    final int rsize = rLocal.size();
	    final int offset = (rsize > 0) ? rLocal.low() : 0;

	    int total = 0;
	    for (point(:rank==1) [i] : particleCount.distribution | here) {
		final int count = particleCount[i];
		sCountBuffer[pl,i - offset] = count;
		total = total + count;
	    }
	    runningPTotals[pl] = particleTotals[pl];
	    runningGTotals[pl] = gridTotals[pl];
	    sendCount[pl] = total;
	    sendGrids[pl] = rsize;
	    recvCount[pl] = 0;
	    recvGrids[pl] = 0;
	}

	do {
	    // continue moving partitions
	    finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
		final int expected = (int) (pl * countAve + 0.5);
		final int lDeficit = (((int) ((pl - 1) * countAve + 0.5)) - 
				      runningPTotals[pl] + sendCount[pl]);
		if (lDeficit > 0) {  
		    // Have stuff to send to left neighbor
		    final region(:rank==1) dSBuffer = [0 : sendGrids[pl] - 1];
		    final int value[:rank==1] sBuffer = 
			(int value[:rank==1])
			new int value[dSBuffer] (point(:rank==1) [i]) {
			    return sCountBuffer[pl,i];
		        };
		    final int nCount = sendCount[pl];
		    final int nGrids = sendGrids[pl];

		    finish async (here.prev()) {
			recvCount[here.id] = nCount;
			recvGrids[here.id] = nGrids;
			foreach (point(:rank==1) [i] : dSBuffer) {
			    rCountBuffer[here.id,i] = sBuffer[i];
			}
		    }		    
		}	      
	    }

	    finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
		// find new partitions
		finished[pl] = 0;
		
		final int expected1 = (int) (pl * countAve + 0.5);
		final int expected2 = (int) ((pl - 1) * countAve + 0.5);
		final int lDeficit = 
		    expected2 - runningPTotals[pl] + sendCount[pl];
		final int rDeficit = runningPTotals[pl] - expected1;

		if (runningPTotals[pl] < expected1) {
		    if (runningPTotals[pl] + recvCount[pl] >= expected1) {
			// left boundary in on the right
			// -- add grids to make up deficit
			final int gsize = recvGrids[pl];
			int oldTotal = 0;
			int total = 0;
			int i = 0;
			do {
			    oldTotal = total;
			    total = total + rCountBuffer[pl,i];
			    i++;
			} while (total < -rDeficit && i < gsize);
			final int offset = 
			    (int) (i - 1 + 
				   (((double) (-rDeficit - oldTotal)) /
				    ((double) (total - oldTotal))));
			border[pl] = runningGTotals[pl] + offset;
		    } else {
			// left boundary is even further to right
			finished[pl]++;
		    }
		}

	      	if (lDeficit > sendCount[pl]) {
		    // need another iteration
		    finished[pl]++;
		}
		if (!here.isLast()) {
		    final int count = recvCount[pl];
		    final int gsize = recvGrids[pl];
		    runningPTotals[pl] = runningPTotals[pl] + count;
		    runningGTotals[pl] = runningGTotals[pl] + gsize;
		    sendCount[pl] = count;
		    sendGrids[pl] = gsize;
		    foreach (point(:rank==2) pt: [pl : pl,0 : gsize - 1]) {
			sCountBuffer[pt] = rCountBuffer[pt];
		    }
		}
	    }
	} while (finished.sum() != 0);

	// retrieve all the lowerbounds to create the distribution
	final place pHere = here;
	final dist(:rank==1) dBounds = [0:place.MAX_PLACES]->here;
	final int[:rank==1] lowerbounds = new int[dBounds];
	final int[:rank==1] upperbounds = new int[dBounds];
	
	finish ateach (point(:rank==1) pl: dist.UNIQUE) {
	    final double edge = border[pl];
// 	    System.out.println(here + " edge: " + edge);
	    async (pHere) { 
		lowerbounds[pl] = (int) (edge + 0.5);		
	    }
	}

	// Make sure that each place holds at least on grid
	for (point(:rank==1) i: [0 : place.MAX_PLACES - 1]) {
	    final int lb = lowerbounds[i];
	    for (point(:rank==1) j: [i[0] + 1 : place.MAX_PLACES - 1]) {
		if (lowerbounds[j] <= lb) {
		    lowerbounds[j] = lb + 1;
		}
	    }
	}

	for (point(:rank==1) i: [0 : place.MAX_PLACES - 2]) {
	    upperbounds[i] = lowerbounds[i + [1]] - 1;
	}
	upperbounds[place.MAX_PLACES - 1] = YLENGTH - 1;

	dist(:rank==2) dResult = 
	    (dist(:rank==2)) (region.factory.emptyRegion(2)->here);
	for (point(:rank==1) pl: dist.UNIQUE) {
	    final place p = dist.UNIQUE.get(pl);
// 	    System.out.println(p+"->"+lowerbounds[pl]+" : "+upperbounds[pl]);
	    dResult = dResult || ([lowerbounds[pl]:upperbounds[pl], rRows]->p);
	}

	return dResult;
    }


    /**
     *  Sorts the particles such that particles locations are clustered 
     *  together within the particle array.  This is pretty much bin sorting.
     *  Works + place check
     */
    public 
	Particle[:rank==1] sortParticles(final Particle[:rank==1] particles,
					 final dist(:rank==2) dField) {

	final dist(:rank==1) dParticles = particles.distribution;
	final Particle[:rank==1] result = new Particle[dParticles];
	final int[:rank==1] indices = new int[dParticles];
	final dist(:rank==1) dCount = X10Util.get2DDistRank(dField, 0);

	final int[:rank==1] count = 
	    new int[dCount] (point(:rank==1) pt) { return 0; };
	finish ateach (point(:rank==1) pl: dist.UNIQUE) {
	    final dist(:rank==1) dP = particles.distribution;
	    final region(:rank==1) rLocalP = X10Util.get1DLRegion(dP);
	    final region(:rank==1) rLocalC = X10Util.get1DLRegion(dCount);

	    // how many particles in each grid
	    for (point(:rank==1) pt: particles.distribution | here) {
		final int y = (int) particles[pt].getY();
		count[y]++;
		indices[pt] = y;
	    }

	    // find address offset
	    final dist(:rank==1) dLocalC = rLocalC->here;
	    int offset = (rLocalP.size() > 0) ? rLocalP.low() : 0;	    
	    int[:rank==1] offsets = new int[dLocalC];
	    for (point(:rank==1) pt: rLocalC) {
		final int n = count[pt];
		offsets[pt] = offset;
		offset = offset + n;
	    }

	    // find addresses of particles at each grid
	    for (point(:rank==1) pt: rLocalP) {
		final int index = indices[pt];
		indices[pt] = offsets[index];
		offsets[index]++;
	    } 

	    // reorder particles
	    foreach (point(:rank==1) i: rLocalP) {
		result[indices[i]] = particles[i];
	    }
	}
	return result;
    }			

    /**
     *  Works + place check !! race condition?
     */
    public int[:rank==1] parallelPrefix(final int[:rank==1] data) {
	final dist(:rank==1) dData = data.distribution;
	final int[:rank==1] result = 
	    new int[dData] (point(:rank==1) pt) { return data[pt]; };
	final int[:rank==1] tmp1 = 
	    new int[dData] (point(:rank==1) pt) { return data[pt]; };
	final int[:rank==1] tmp2 = 
	    new int[dData] (point(:rank==1) pt) { return 0; };
	
	int strides = 1;
	while (strides < place.MAX_PLACES) {
	    final int stride = strides;
	    finish ateach (point(:rank==1) pl: dist.UNIQUE) {
		final int dir = (pl[0] / stride) % 2;
		final int val = tmp1[pl];
		final place pDst = 
		    place.places(pl[0] + ((dir == 0) ? 1 : - 1) * stride);

		finish async (pDst) {
		    if (dir == 0) {
			// Only add going up
			result[here.id] = result[here.id] + val;
		    }
		    tmp2[here.id] = val;
		}
	    }
	    
	    finish ateach (point(:rank==1) pl: dist.UNIQUE) {
		tmp1[pl] = tmp1[pl] + tmp2[pl];
	    }
	    strides = strides + strides;
	}
	return result;
    }
}
