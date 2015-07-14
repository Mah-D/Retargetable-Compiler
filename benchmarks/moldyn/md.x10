/**************************************************************************
 *                                                                         *
 *             Java Grande Forum Benchmark Suite - MPJ Version 1.0         *
 *                                                                         *
 *                            produced by                                  *
 *                                                                         *
 *                  Java Grande Benchmarking Project                       *
 *                                                                         *
 *                                at                                       *
 *                                                                         *
 *                Edinburgh Parallel Computing Centre                      *
 *                                                                         *
 *                email: epcc-javagrande@epcc.ed.ac.uk                     *
 *                                                                         *
 *                  Original version of this code by                       *
 *                         Dieter Heermann                                 *
 *                       converted to Java by                              *
 *                Lorna Smith  (l.smith@epcc.ed.ac.uk)                     *
 *                   (see copyright notice below)                          *
 *                                                                         *
 *      This version copyright (c) The University of Edinburgh, 2001.      *
 *                         All rights reserved.                            *
 *                                                                         *
 **************************************************************************/
// package moldyn;

// import java.util.*;
// import java.text.NumberFormat;

/**
 * Moldyn with multiple places ported to x10.
 *
 * @author kemal 3/2005
 */
public class md {

    public static final int ITERS = 100;
    public static final double LENGTH = 50e-10;
    public static final double m = 4.0026;
    public static final double mu = 1.66056e-27;
    public static final double kb = 1.38066e-23;
    public static final double TSIM = 50;
    public static final double deltat = 5e-16;
    
    public Particle[:rank==1] one;
    public double epot;
    public double vir;
    //int datasizes[] = { 8, 13 };
    //int datasizes[] = { 4, 13 };

    public int interactions;

    public double count;
    private int mdsize; 

    private double l;
    private double rcoff;
    private double rcoffs; 
    private double side;
    private double sideh;
    private double hsq;
    private double hsq2;

    private double a;
    private double tscale; 
    private double sc;
    private double ekin;
    private double ek;

    public static final double den = 0.83134;
    public static final double tref = 0.722;
    public static final double h = 0.064;

    private double vaver;
    private double vaverh;
    
    private double etot;
    private double temp;
    private double pres;
    private double rp;

    private int npartm;

    public static final int irep = 10;
    public static final int istop = 19;
    public static final int iprint = 10;
    public static final int movemx = 50;

    private int rnk;
    private int nprocess;

    //public static final dist(:rank==1) D = (dist(:rank==1)) dist.UNIQUE;
    //public static final md[:rank==1] P = new md[D] (point(:rank==1) pt) { return new md(); };

    public static void exec() {
	final dist(:rank==1) D = (dist(:rank==1)) dist.UNIQUE;
	final md[:rank==1] P = 
	    new md[D] (point(:rank==1) pt) { return new md(); };
	init(D,P);
	run(D,P);
	validate(D,P);
    }

    public static void init(final dist(:rank==1) D, final md[:rank==1] P) {
	finish ateach (point(:rank==1) j : D) { 
	    (P[j]).initialise(j[0], place.MAX_PLACES);
	}
    }

    public static void run(final dist(:rank==1) D, final md[:rank==1] P) {

	int n = 0;
	for (point(:rank==1) move: [0 : movemx - 1]) {
	    finish ateach (point(:rank==1) j: D) {
		P[j].runiters1();
	    }
	    finish ateach (point(:rank==1) j: D) {
		P[j].runiters2(P);
	    }
	    finish ateach (point(:rank==1) j: D) {
		P[j].runiters3(move[0]);
	    }
	}
    }
    
    public static void validate(final dist(:rank==1) D, 
				final md[:rank==1] P) {
	finish ateach (point(:rank==1) j: D) {
	    double ref = 275.97175611773514;
	    double dev = Math.abs(P[j].ek - ref);
	    if (dev > 1.0e-12) {
		System.out.println("Validation failed at place: " + j[0]);
		System.out.println("Kinetic energy = " + P[j].ek + " " + dev + " " + ref);
		throw new RuntimeException("Validation failed");
	    }
	}
    }

    public void initialise(final int rank0, final int nprocess0) {
	rnk = rank0;
	nprocess = nprocess0;

	vir = 0.0;
	epot = 0.0;
	interactions = 0;

	/* Parameter determination */
	int mm = 4;
	int partsize = mm*mm*mm*4;
	mdsize = partsize;
	dist(:rank==1) dOne = [0 : mdsize - 1]->here;
	one = new Particle[dOne];
	l = LENGTH;

	side = Math.pow((mdsize/den), 0.3333333);
	rcoff = mm/4.0;

	a = side/mm;
	sideh = side*0.5;
	hsq = h*h;
	hsq2 = hsq*0.5;
	npartm = mdsize - 1;
	rcoffs = rcoff * rcoff;
	tscale = 16.0 / (1.0 * mdsize - 1.0);
	vaver = 1.13 * Math.sqrt(tref / 24.0);
	vaverh = vaver * h;

	/* Particle Generation */
        for (point(:rank==1) base: [0 : 0]) {
            point(:rank==1) ijk = base;
            for (point(:rank==4) p: [ 0 : 1, 0 : mm - 1, 0 : mm - 1, 0 : mm - 1 ]) {
			    one[ijk] = new Particle((p[1]*a+p[0]*a*0.5), 
						    (p[2]*a+p[0]*a*0.5), 
						    (p[3]*a),
						    0.0, 
						    0.0, 
						    0.0, 
						    0.0, 
						    0.0, 
						    0.0);
			    ijk = ijk + [1];
	    }
  
            for (point(:rank==4) p: [ 1 : 2, 0 : mm - 1, 0 : mm - 1, 0 : mm - 1 ]) {
			    one[ijk] = new Particle((p[1]*a+(2-p[0])*a*0.5), 
						    (p[2]*a+(p[0]-1)*a*0.5),
						    (p[3]*a+a*0.5), 
						    0.0, 
						    0.0, 
						    0.0,
						    0.0,
						    0.0,
						    0.0);
			    ijk = ijk + [1];
	    }
        }

	/* Initialise velocities */
	int iseed = 0;
	double v1 = 0.0;
	double v2 = 0.0;

	Random randnum = new Random(iseed, v1, v2);
	double r = 0.0;

	int k = 0;
	while (k < mdsize) {
	    r = randnum.seed();
	    one[k].xvelocity = r*randnum.v1;
	    one[k+1].xvelocity = r*randnum.v2;
	    k = k + 2;
	}

	k = 0;
	while (k < mdsize) {
	    r = randnum.seed();
	    one[k].yvelocity = r*randnum.v1;
	    one[k+1].yvelocity = r*randnum.v2;
	    k = k + 2;
	}

	k = 0;
	while (k < mdsize) {
	    r = randnum.seed();
	    one[k].zvelocity = r*randnum.v1;
	    one[k+1].zvelocity = r*randnum.v2;
	    k = k + 2;
	}

	/* velocity scaling */
	ekin = 0.0;
	double sp = 0.0;

	for (point(:rank==1) i: [0 : mdsize - 1]) {
	    sp = sp + one[i].xvelocity;
	}
	sp = sp / mdsize;

	for (point(:rank==1) i: [0 : mdsize - 1]) {
	    one[i].xvelocity = one[i].xvelocity - sp;
	    ekin = ekin + one[i].xvelocity*one[i].xvelocity;
	}

	sp = 0.0;
	for (point(:rank==1) i: [0 : mdsize - 1]) {
	    sp = sp + one[i].yvelocity;
	}
	sp = sp / mdsize;

	for (point(:rank==1) i: [0 : mdsize - 1]) {
	    one[i].yvelocity = one[i].yvelocity - sp;
	    ekin = ekin + one[i].yvelocity*one[i].yvelocity;
	}

	sp = 0.0;
	for (point(:rank==1) i: [0 : mdsize - 1]) { 
	    sp = sp + one[i].zvelocity;
	}
	sp = sp / mdsize;

	for (point(:rank==1) i: [0 : mdsize - 1]) {
	    one[i].zvelocity = one[i].zvelocity - sp;
	    ekin = ekin + one[i].zvelocity*one[i].zvelocity;
	}

	double ts = tscale * ekin;
	sc = h * Math.sqrt(tref/ts);

	for (point(:rank==1) i: [0 : mdsize - 1]) {
	    one[i].xvelocity = one[i].xvelocity * sc;
	    one[i].yvelocity = one[i].yvelocity * sc;
	    one[i].zvelocity = one[i].zvelocity * sc;
	}

	/* MD simulation */
    }

    public void runiters1() {
	for (point(:rank==1) i: [0 : mdsize - 1]) {
	    one[i].domove(side);        
	    /* move the particles and update velocities */
	}
	
	epot = 0.0;
	vir = 0.0;
	
	int i = 0 + rnk;
	while (i < mdsize) {
	    one[i].force(side, rcoff, mdsize, i, this);  
	    /* compute forces */
	    i = i + nprocess;
	}
    }

    public void runiters2(final md[:rank==1] P) {
	allreduce(P);
    }

    public void runiters3(final int move) {
	double summation = 0.0;
	
	for (point(:rank==1) i: [0 : mdsize - 1]) {
	    summation = summation + one[i].mkekin(hsq2);    /*scale forces, update velocities */
	}
	
	ekin = summation/hsq;
	
	double vel = 0.0;
	count = 0.0;
	
	for (point(:rank==1) i: [0 : mdsize - 1]) {
	    vel = vel + one[i].velavg(vaverh, h, this); /* average velocity */
	}
	
	vel = vel / h;
	
	/* tmeperature scale if required */
	if ((move < istop) && (((move+1) % irep) == 0)) {
	    sc = Math.sqrt(tref / (tscale*ekin));
	    
	    for (point(:rank==1) i: [0 : mdsize - 1]) {
		one[i].dscal(sc, 1);
	    }
	    ekin = tref / tscale;
	}
	
	/* sum to get full potential energy and virial */
	if (((move+1) % iprint) == 0) {
	    ek = 24.0*ekin;
	    epot = 4.0*epot;
	    etot = ek + epot;
	    temp = tscale * ekin;
	    pres = den * 16.0 * (ekin - vir) / mdsize;
	    vel = vel / mdsize;
	    rp = (count / mdsize) * 100.0;
	}
    }

    public void allreduce(final md[:rank==1] P) {
	// Place holder for now to emulate allreduce. To be optimized

	if (rnk != 0) return;
	//final md[:rank==1] P = md.P;
	final md t = new md();
	t.mdsize = mdsize;
	final dist(:rank==1) dOne = [0:mdsize - 1]->here;
	t.one = new Particle[dOne];

	final place tHere = here;
	for (point(:rank==1) k: [0:(mdsize-1)]) {
	    t.one[k] = new Particle(0.0, 0.0, 0.0, 
				    0.0, 0.0, 0.0, 
				    0.0, 0.0, 0.0);
	}

	// sum reduction
	for (point(:rank==1) j: P) {
	    final dist(:rank==1) dD = [0:2]->here;
	    final dist(:rank==1) dI = [0:0]->here;
	    final double[:rank==1] dataD = new double[dD];
	    final double[:rank==1] dataI = new double[dI];
	    for (point(:rank==1) k: [0:(mdsize-1)]) {
		finish async (P.distribution.get(j)) {
		    final double fx = P[j].one[k].xforce;
		    final double fy = P[j].one[k].yforce;
		    final double fz = P[j].one[k].zforce;

		    finish async (tHere) {
			dataD[0] = fx;
			dataD[1] = fy;
			dataD[2] = fz;
		    }
		}
		
		t.one[k].xforce = t.one[k].xforce + dataD[0];
		t.one[k].yforce = t.one[k].yforce + dataD[1];
		t.one[k].zforce = t.one[k].zforce + dataD[2];
	    }

	    finish async (P.distribution.get(j)) {
		final double jvir = P[j].vir;
		final double jepot = P[j].epot;
		final int jinter = P[j].interactions;
		
		finish async (tHere) {
		    dataD[0] = jvir;
		    dataD[1] = jepot;
		    dataI[0] = jinter;
		}
	    }
	    t.vir  = t.vir  + dataD[0];
	    t.epot = t.epot + dataD[1];
        // PlasmaX10-v1.5 TYPECHECK ERROR 
	    t.interactions = t.interactions + (int)dataI[0];
	}
	// broadcast

        final int mymdsize = mdsize;
        
	finish ateach (point(:rank==1) j: P.distribution) {

	    final place pHere = here;
	    final dist(:rank==1) dD = [0:2]->here;
	    final double[:rank==1] dataD = new double[dD];
                

	    for (point(:rank==1) k: [0:(mymdsize-1)]) {

		finish async (tHere) {
		    final double xf = t.one[k].xforce;
		    final double yf = t.one[k].yforce;
		    final double zf = t.one[k].zforce;
		    
		    finish async (pHere) {
			dataD[0] = xf;
			dataD[1] = yf;
			dataD[2] = zf;
		    }
		}


		P[j].one[k].xforce = dataD[0];
		P[j].one[k].yforce = dataD[1];
		P[j].one[k].zforce = dataD[2];
	    }
	

	    final dist(:rank==1) dI = [0:0]->here;
	    final int[:rank==1] dataI = new int[dI];
	    finish async (tHere) {
		final double tvir =  t.vir;
		final double tepot = t.epot;
		final int tinter = t.interactions;
		
		finish async (pHere) {
		    dataD[0] = tvir;
		    dataD[1] = tepot;
		    dataI[0] = tinter;
		}
	    }


	    P[j].vir = dataD[0];
	    P[j].epot = dataD[1];
	    P[j].interactions = dataI[0];

	}
    }
}

