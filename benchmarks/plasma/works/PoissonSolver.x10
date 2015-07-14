public class PoissonSolver {
    /**
     *  Various constanst involving pi.  Used in many of the field solving
     *  functions.
     */
    public static final double PI4I = 0.5/6.28318530717959;
    public static final double SQT2I = 0.707106781186548;
    public static final double SQT2PI = 0.797884560802865;

    /**
     *  Indices in the big table for the various functions.
     */
    public static final int GREENS_IDX = 0;
    public static final int SHAPE_IDX  = 1;
    public static final int ELECX_IDX  = 2;
    public static final int ELECY_IDX  = 3;

    /**
     *
     */
    public final int x;
    public final int y;
    public final int xBits;
    public final int yBits;
    public final double ar;   // radius
    public final double ari;  // inverse radius
    public final double affp; // ??
    public final FourierTransform2D fft;
    public final double[:rank==3] ffg; 
    public final double value[:rank==2] ffg2;

    public PoissonSolver(final int xBits, final int yBits, final double affp) {
	this.xBits = xBits;
	this.yBits = yBits;
	this.affp = affp;
	x = 1 << xBits;
	y = 1 << yBits;
	ar = 0.912871;
	ari = 0;
	fft = new FourierTransform2D(yBits + 1, xBits + 1);

	final double[:rank==3] tables = initTables();
	ffg = makeFFG(tables);
	ffg2 = makeFFG2(tables);
	System.out.println("Poisson Solver initialized");
    }
    
    /** 
     *  Creates the various tables used in the poisson solver.  The four
     *  tables created are placed in the same array to promote locality as
     *  if one table is used, the others are likely to be used as well.
     */
    public double[:rank==3] initTables() {
	final region(:rank==1) r1 = [0 : x - 1];
	final region(:rank==1) r2 = [0 : y];
	final region(:rank==1) r3 = [0 : 3];
	final dist(:rank==3) dTable1 = 
	    X10Util.extendDistRank3D(X10Util.distBlockStar2(r1, r2), r3);
	final place last = place.LAST_PLACE;
	final dist(:rank==3) dTable2 = 
	    (dist(:rank==3)) ([x : x, 0 : y, 0 : 3]->last);
	final dist(:rank==3) dTable = dTable1 || dTable2;
	final double[:rank==3] table = new double[dTable];

	System.out.println("Init: Green's function"); 
	initGreensFnTable(table);
	System.out.println("Init: Shape factor");
	initShapeFactorTable(table);
	System.out.println("Init: X Electric field");
	initElectricFieldXTable(table);
	System.out.println("Init: Y Electric field");
	initElectricFieldYTable(table);
	
	return table;	
    }

    /**
     *
     */
    public double[:rank==3] makeFFG(final double[:rank==3] table) {
	final region(:rank==1) r1 = [0 : x - 1];
	final region(:rank==1) r2 = [0 : y];
	final region(:rank==1) r3 = [0 : 3];
	final dist(:rank==3) dResult = 
	    X10Util.extendDistRank3D(X10Util.distBlockStar2(r1, r2), r3);
	return new double[dResult] (point(:rank==3) pt) { return table[pt]; };
    }

    public double value[:rank==2] makeFFG2(final double[:rank==3] table) {
	final region(:rank==2) rResult = [0 : y, 0 : 3];
	return 
	    (double value[:rank==2]) 
	    new double value[rResult] (point(:rank==2) [i,j]) {
	         final place pHere = here;
		 final dist(:rank==1) dDst = [0:0]->here;
	         final double[:rank==1] rcv = new double[dDst];
		 finish async (place.LAST_PLACE) {
		     final double val = table[x,i,j];
		     finish async (pHere) {
			 rcv[0] = val;
		     }
		 }
	         return rcv[0];
	    };
    }

    /**
     *  This method calculates the form factor array needed by the field
     *  solver with open (vacuum) boundary conditions using Hockney's method.
     *  This Green's function calculates:
     *    g(kx,ky) = affp * inverse FFT of potr
     */
    public void initGreensFnTable(final double[:rank==3] table) {
	final region(:rank==1) r1 = [0 : 2 * y - 1];
	final region(:rank==1) r2 = [0 : 2 * x - 1];
	final dist(:rank==2) dGreen = X10Util.distBlockStar2(r1, r2);

	final double[:rank==2] f = new double[dGreen];
	final double invRadius = (ar > 0.0) ? 1.0 / ar : 0.0;
	final double N = 4 * x * y;

	// Populate the initial values 
	finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
	    if (pl <= 2 * y) {
		final region(:rank==2) rLocal = X10Util.get2DLRegion(dGreen);
		final region(:rank==1) rLocal1 = X10Util.getRank2D(rLocal, 0);
		final region(:rank==1) rLocal2 = X10Util.getRank2D(rLocal, 1);
		
		foreach (point(:rank==1) [i] : rLocal1) {
		    final double x1 = Math.pow((i > y) ? i - (2 * y) : i, 2); 
		    foreach (point(:rank==1) [j] : rLocal2) {
			final double x2 = Math.pow((j > x) ? j - (2*x) : j, 2);
			final double r = Math.sqrt(x1 + x2);
			
			f[i,j] = potentialField(r,invRadius);
		    }
		}
	    }
	}

	// Convert to Fourier space
        final Complex[:rank==2] ft = fft.inverseTransformD(f);

	// Condense the table by removing redundant information
	genTable1(table, ft, GREENS_IDX);
    }

    /**
     *
     */
    public void initShapeFactorTable(final double[:rank==3] table) {	
	final region(:rank==1) r1 = [0 : 2 * y - 1];
	final region(:rank==1) r2 = [0 : 2 * x - 1];
	final dist(:rank==2) dShape = X10Util.distBlockStar2(r1, r2);

	final double[:rank==2] f = new double[dShape];
	final double invRadius = (ar > 0.0) ? 1.0 / ar : 0.0;
	final double N = 4 * x * y;

	// Populate the initial values 
	finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
	    if (pl <= 2 * y) {
		final region(:rank==2) rLocal = X10Util.get2DLRegion(dShape);
		final region(:rank==1) rLocal1 = X10Util.getRank2D(rLocal, 0);
		final region(:rank==1) rLocal2 = X10Util.getRank2D(rLocal, 1);
		
		foreach (point(:rank==1) [i] : rLocal1) {
		    final double x1 = Math.pow((i > y) ? i - (2*y) : i, 2); 
		    foreach (point(:rank==1) [j] : rLocal2) {
			final double x2 = Math.pow((j > x) ? j - (2*x) : j, 2);
			final double r = Math.sqrt(x1 + x2);
			f[i,j] = particleShape(r,invRadius);
		    }
		}
	    }
	}

	// Convert to Fourier space
	final Complex[:rank==2] ft = fft.inverseTransformD(f);

	// Condense the table by removing redundant information
	genTable1(table, ft, SHAPE_IDX);
    }

    /**
     *
     */
    public void initElectricFieldXTable(final double[:rank==3] table) {	
	final region(:rank==1) r1 = [0 : 2 * y - 1];
	final region(:rank==1) r2 = [0 : 2 * x - 1];
	final dist(:rank==2) dElecX = X10Util.distBlockStar2(r1, r2);

	final double[:rank==2] f = new double[dElecX];
	final double invRadius = (ar > 0.0) ? 1.0 / ar : 0.0;
	final double N = 4 * x * y;

	// Populate the initial values 
	finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
	    if (pl <= 2 * y) {
		final region(:rank==2) rLocal = X10Util.get2DLRegion(dElecX);
		final region(:rank==1) rLocal1 = X10Util.getRank2D(rLocal, 0);
		final region(:rank==1) rLocal2 = X10Util.getRank2D(rLocal, 1);
		
		foreach (point(:rank==1) [i] : rLocal1) {
		    final double x1 = (i > y) ? i - (2 * y) : i;
		    final double xs1 = Math.pow(x1, 2); 
		    foreach (point(:rank==1) [j] : rLocal2) {
			final double x2 = (j > x) ? j - (2*x) : j;
			final double xs2 = Math.pow(x2, 2);
			final double r = Math.sqrt(xs1 + xs2);			
			final double val = radialElectricField(r,invRadius);
			//System.out.println(val + " " + i + " " + j + " " + r);
			f[i,j] = (r > 0.0) ? val * (x2 / r) : val;
		    }
		}
	    }
	}

	// Convert to Fourier space
	final Complex[:rank==2] ft = fft.inverseTransformD(f);

	// Condense the table by removing redundant information
	genTable2(table, ft, ELECX_IDX);
    }

    /**
     *
     */
    public void initElectricFieldYTable(final double[:rank==3] table) {	
	final region(:rank==1) r1 = [0 : 2 * y - 1];
	final region(:rank==1) r2 = [0 : 2 * x - 1];
	final dist(:rank==2) dElecX = X10Util.distBlockStar2(r1, r2);

	final double[:rank==2] f = new double[dElecX];
	final double invRadius = (ar > 0.0) ? 1.0 / ar : 0.0;
	final double N = 4 * x * y;

	// Populate the initial values 
	finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
	    if (pl <= 2 * y) {
		final region(:rank==2) rLocal = X10Util.get2DLRegion(dElecX);
		final region(:rank==1) rLocal1 = X10Util.getRank2D(rLocal, 0);
		final region(:rank==1) rLocal2 = X10Util.getRank2D(rLocal, 1);
		
		foreach (point(:rank==1) [i] : rLocal1) {
		    final double y1 = (i > y) ? i - (2 * y) : i; 
		    final double ys1 = Math.pow(y1, 2);
		    foreach (point(:rank==1) [j] : rLocal2) {
			final double y2 = (j > x) ? j - (2*x) : j;
			final double ys2 = Math.pow(y2, 2);
			final double r = Math.sqrt(ys1 + ys2);
			final double val = radialElectricField(r,invRadius);
			f[i,j] = (r > 0.0) ? val * (y1 / r) : val;
		    }
		}
	    }
	}

	// Convert to Fourier space
	final Complex[:rank==2] ft = fft.inverseTransformD(f);

	// Condense the table by removing redundant information      
	genTable3(table, ft, ELECY_IDX);
    }

    /**
     *  Removes redundant information that can be regained through various
     *  tricks in the solver.  This applies to Green's function and shape factor
     *  tables.
     */
    public void genTable1(final double[:rank==3] table,
			   final Complex[:rank==2] ft, 
			   final int index) {
	final int N = 4 * x * y;
	finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
	    if (pl <= x) {
		final dist(:rank==2) dFT = ft.distribution;
		final dist(:rank==3) dTable = table.distribution; 
		final region(:rank==1) rLocalFT1 = X10Util.getLRank2D(dFT, 0);
		final region(:rank==1) rLocalT2 = X10Util.getLRank3D(dTable, 1);

		foreach (point(:rank==2) [i,j] : [rLocalFT1, rLocalT2]) {
		    table[i,j,index] = N * ft[i,j].getReal();
		}

		if (here.isFirst()) {
		    foreach (point(:rank==1) [i] : [1 : y - 1]) {
			table[x,i,index] = N * ft[0,2*y - i].getReal();
		    }
		    table[x,0,index] = N * ft[0,0].getImag();
		    table[x,y,index] = N * ft[0,y].getImag();
		}
	    }
	}      
    }

    /**
     *  This method removes redundant information that can be regained through
     *  tricks in the solver.  This applies to X electric field.
     */
    public void genTable2(final double[:rank==3] table,
			   final Complex[:rank==2] ft,
			   final int index) {
	final int N = 4 * x * y;
	finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
	    if (pl <= x) {
		final dist(:rank==2) dFT = ft.distribution;
		final dist(:rank==3) dTable = table.distribution; 
		final region(:rank==1) rLocalFT1 = X10Util.getLRank2D(dFT, 0);
		final region(:rank==1) rLocalT2 = X10Util.getLRank3D(dTable, 1);

		foreach (point(:rank==1) [i] : rLocalFT1) {
		    if (i > 0) {
			foreach (point(:rank==1) [j] : rLocalT2) {
			    table[i,j,index] = N * ft[i,j].getImag();
			}
		    }
		}

		if (here.isFirst()) {
		    foreach (point(:rank==1) [i1] : [1 : y - 1]) {
			final int i2 = 2 * y - i1;
			table[0,i1,index] = N * ft[0,i1].getReal();
			table[x,i1,index] = N * ft[0,i2].getReal();
		    }
		    table[0,0,index] = N * ft[0,0].getReal();
		    table[x,0,index] = N * ft[0,0].getImag();
		    table[0,y,index] = N * ft[0,y].getReal();
		    table[x,y,index] = N * ft[0,y].getImag();
		}
	    }
	}
    }    

    /**
     *  This method removes redundant information that can be regained through
     *  tricks in the solver.  This applies to Y electric field.
     */
    public void genTable3(final double[:rank==3] table,
			   final Complex[:rank==2] ft,
			   final int index) {
	final int N = 4 * x * y;
	finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
	    if (pl <= x) {
		final dist(:rank==2) dFT = ft.distribution;
		final dist(:rank==3) dTable = table.distribution; 
		final region(:rank==1) rLocalFT1 = X10Util.getLRank2D(dFT, 0);
		final region(:rank==1) rLocalT2 = X10Util.getLRank3D(dTable, 1);

		foreach (point(:rank==1) [i] : rLocalFT1) {
		    if (i > 0) {
			foreach (point(:rank==1) [j] : [1 : y - 1]) {
			    table[i,j,index] = N * ft[i,j].getImag();
			}
			table[i,0,index] = N * ft[i,0].getReal();
			table[i,y,index] = N * ft[i,y].getReal();
		    }
		}

		if (here.isFirst()) {
		    foreach (point(:rank==1) [i1] : [1 : y - 1]) {
			final int i2 = 2 * y - i1;
			table[0,i1,index] = N * ft[0,i1].getImag();
			table[x,i1,index] = N * ft[0,i2].getImag();
		    }
		    table[0,0,index] = N * ft[0,0].getReal();
		    table[x,0,index] = N * ft[0,0].getImag();
		    table[0,y,index] = N * ft[0,y].getReal();
		    table[x,y,index] = N * ft[0,y].getImag();
		}
	    }
	}
    }
    
    /**
     *
     */
    public Complex[:rank==2] makeForceArray() {
	final dist(:rank==2) dResult = 
	    X10Util.distBlockStar1([0:2 * y - 1,0:x - 1]);
	return new Complex[dResult];
    }

    /**
     *
     */
    public double getForceCharge(final Complex[:rank==2] q,
				 final Complex[:rank==2] forceX,
				 final Complex[:rank==2] forceY) {
	final dist(:rank==2) dForce = 
	    X10Util.distBlockStar1([0 : x - 1, 0 : 2 * y - 1]);
	final Complex[:rank==2] fxfft = new Complex[dForce];
	final Complex[:rank==2] fyfft = new Complex[dForce];

	final Complex[:rank==2] qfft = fft.inverseTransformC(q);
	final double we = solveForceCharge(qfft, fxfft, fyfft);

	final Complex[:rank==2] fx = fft.transformC(fxfft);
	final Complex[:rank==2] fy = fft.transformC(fyfft);

	finish ateach (point(:rank==2) pt : forceX) {
	    forceX[pt] = fx[pt];
	    forceY[pt] = fy[pt];
	}
	return we;
    }


    /**
     *
     */
    public double solveForceCharge(final Complex[:rank==2] q,
				   final Complex[:rank==2] forceX,
				   final Complex[:rank==2] forceY) {
	final dist(:rank==1) dUnique = (dist(:rank==1)) dist.UNIQUE;
	final double[:rank==1] energy = 
	    new double[dUnique] (point(:rank==1) pt) { return 0.0; };
	finish ateach (point(:rank==1) [pl] : dist.UNIQUE) {
	    if (pl <= x) {
		final dist(:rank==3) dFFG = ffg.distribution;
		final region(:rank==3) rLocal = X10Util.get3DLRegion(dFFG);
		final region(:rank==1) rLocal1 = X10Util.getRank3D(rLocal, 0);
		final region(:rank==1) rLocal2 = X10Util.getRank3D(rLocal, 1);

		// mode numbers kx > 0 and 0 < ky < y
		double tmp3 = -1.0;
		for (point(:rank==1) [i] : rLocal1) {
		    tmp3 = (i % 2 == 0) ? 1.0 : -1.0;
		    //tmp3 = -tmp3;
		    if (i > 0) {
			double tmp2 = ffg[i,0,ELECY_IDX];
			for (point(:rank==1) [j1] : [1 : y - 1]) {
			    final int j2 = 2 * y - j1;
			    final double tmp0 = ((here.isFirst()) ? 
						 ffg[0,j1,ELECX_IDX] : 
						 ffg2[j1,ELECX_IDX]);
			    final double tmp1 = tmp3 * tmp0;
			    tmp2 = -tmp2;
			    final Complex cx = 
				new Complex(tmp1, ffg[i,j1,ELECX_IDX]);
			    final Complex cy = 
				new Complex(tmp2, ffg[i,j1,ELECY_IDX]);	    
			    forceX[i,j1] = cx.mult(q[i,j1]);
			    forceX[i,j2] = cx.mult(q[i,j2]);
			    forceY[i,j1] = cy.mult(q[i,j1]);
			    forceY[i,j2] = (cy.getConjg()).mult(q[i,j2]);

			    energy[pl] += (ffg[i,j1,GREENS_IDX] *
					   (q[i,j1].multConjg() +
					    q[i,j2].multConjg()));
			}

			// mode number ky = 0
			double tmp0 = ((here.isFirst()) ? 
				       ffg[0,0,ELECX_IDX] : 
				       ffg2[0,ELECX_IDX]);
			double tmp1 = tmp3 * tmp0;
			final Complex x0 = 
			    new Complex(tmp1, ffg[i,0,ELECX_IDX]);
			forceX[i,0] = x0.mult(q[i,0]);
			forceY[i,0] = q[i,0].multS(ffg[i,0,ELECY_IDX]);
			energy[pl] += (ffg[i,0,GREENS_IDX] * 
				       q[i,0].multConjg());

			// mode number ky = y
			tmp0 = ((here.isFirst()) ? 
				ffg[0,y,ELECX_IDX] :
				ffg2[y,ELECX_IDX]);
			tmp1 = tmp3 * tmp0;
			final Complex xNY = 
			    new Complex(tmp1, ffg[i,y,ELECX_IDX]);
			forceX[i,y] = xNY.mult(q[i,y]);
			forceY[i,y] = q[i,y].multS(ffg[i,y,ELECY_IDX]);
			energy[pl] += (ffg[i,y,GREENS_IDX] *
				       q[i,y].multConjg());
		    }
		}
		
		if (here.isFirst()) {
		    // mode number kx = 0
		    tmp3 = ffg[0,0,ELECY_IDX];
		    for (point(:rank==1) [j] : [1 : y - 1]) {
			tmp3 = -tmp3;
			final Complex s = new Complex(tmp3, ffg[0,j,ELECY_IDX]);
			forceX[0,j] = q[0,j].multS(ffg[0,j,ELECX_IDX]);
			forceY[0,j] = s.mult(q[0,j]);
			energy[pl] += (ffg[0,j,GREENS_IDX] *
				       q[0,j].multConjg());
		    }

		    // mode number kx = x / 2
		    tmp3 = ffg2[0,ELECY_IDX]; 
		    for (point(:rank==1) [j1] : [1 : y - 1]) {
			tmp3 = -tmp3;
			final int j2 = 2 * y - j1;
			final Complex s = 
			    new Complex(tmp3, ffg2[j1,ELECY_IDX]);
			forceX[0,j2] = q[0,j2].multS(ffg[0,j1,ELECX_IDX]);
			forceY[0,j2] = s.mult(q[0,j2]);
			energy[pl] += (ffg2[j1,GREENS_IDX] *
				       q[0,j2].multConjg());
		    }

		    // mode numbers ky = 0, kx = 0, x / 2
		    final double q00R = q[0,0].getReal();
		    final double q00I = q[0,0].getImag();
		    forceX[0,0] = new Complex(ffg[0,0,ELECX_IDX] * q00R,
					      ffg2[0,ELECX_IDX] * q00I);
		    forceY[0,0] = new Complex(ffg[0,0,ELECY_IDX] * q00R,
					      ffg2[0,ELECY_IDX] * q00I);
		    energy[pl] += 0.5 * ((ffg[0,0,GREENS_IDX] * 
					  Math.pow(q00R, 2)) + 
					 (ffg2[0,GREENS_IDX] *
					  Math.pow(q00I, 2)));

		    // mode numbers ky = y / 2, kx = 0, x / 2
		    final double q0NYR = q[0,y].getReal();
		    final double q0NYI = q[0,y].getImag();
		    forceX[0,y] = new Complex(ffg[0,y,ELECX_IDX] * q0NYR,
					       ffg2[y,ELECX_IDX] * q0NYI);
		    forceY[0,y] = new Complex(ffg[0,y,ELECY_IDX] * q0NYR,
					       ffg2[y,ELECY_IDX] * q0NYI);
		    energy[pl] += 0.5 * ((ffg[0,y,GREENS_IDX] * 
					  Math.pow(q0NYR, 2)) + 
					 (ffg2[y,GREENS_IDX] *
					  Math.pow(q0NYI, 2)));	
		    
		}
	    }
	}
	return 4.0 * x * y * energy.sum();
    }

    /**
     *  This function calculates the fields for finite-size guassian particles
     *  in 3D, specifically the potential function which is defined as 
     *  follows:
     *    (affp/(4 * pi)) * erfn(r/(ar * sqrt(2)))/r, for r > 0
     *    (affp/(4 * pi)) * sqrt(2/pi)/ar,            for r = 0
     */
    public double potentialField(final double r, final double ari) {
	final double anorm = affp * PI4I;
	// finite-size particles
	if (ari > 0) {
	    if (r == 0.0) {
		return anorm * SQT2PI * ari;
	    } else {
		return anorm * errorFn(r * SQT2I * ari) / r;
	    }
	// point particles
	} else {
	    if (r == 0.0) {
		return 0.0;
	    } else {
		return anorm / r;
	    }
	}
    }

    /**
     *  This function calculates the fields for finite-size gaussian particles
     *  in 2D, specifically, the particle shape function which is defined as 
     *  follows:
     *    exp(-(r/(sqrt(2)*ar))**2)/(sqrt(2*pi)*ar)**2,  for r > 0
     *    1/(sqrt(2*pi)*ar)**2,                          for r = 0
     */
    public double particleShape(final double r, final double ari) {
	final double anorm = affp * Math.pow(0.5 * SQT2PI * ari, 2);
	// finite-size particles
	if (ari > 0.0) {
	    if (r == 0.0) {
		return anorm;
	    } else {
		final double at1 = X10Util.minDouble(r * SQT2I * ari, 8.0);
		return anorm * Math.exp(-(at1 * at1));
	    }
	// point particles
	} else {
	    if (r == 0.0) {
		return affp;
	    } else {
		return 0.0;
	    }
	}
    }

    /** 
     *  This function calculates the fields for finite-size gaussian particles
     *  in 3D.  The field calculated by this method is the radial electric
     *  field given by:
     *    (affp/(4*pi))*(1/r)*(erfn(r/(sqrt(2)*ar))/r -
     *      exp(-(r/(sqrt(2)*ar))**2)*sqrt(2/pi)/ar, for r > 0
     *  where:
     *   erfn       = the error function
     *   r          = radial coordinate
     *   affp       = normalization constant
     *   ari = 1/ar = inverse of particle size function
     */
    public double radialElectricField(final double r, final double ari) {
	final double anorm = affp * PI4I;	
	// finite-sized particles
	if (ari > 0.0) {
	    if (r == 0.0) {
		return 0.0;
	    } else {
		final double ri = 1.0 / r;
		final double at1 = X10Util.minDouble(r * SQT2I * ari, 8.0);
		return anorm * ri * (errorFn(at1) * ri -
				     SQT2PI * ari * Math.exp(-(at1 * at1)));
	    }
        // point particles
	} else {
	    if (r == 0.0) {
		return 0.0;
	    } else {
		return anorm / (r * r);
	    }
	}	
    }

    /**
     *  This function calculates the real error function, according to the 
     *  formulae given in Abramowitz and Stegun, Handbook of Mathematical
     *  Functions, p. 299.  Error is < 1.6 x 10-7.
     *
     *  (Comment taken from original fortran code)
     */
    public double errorFn(double x) {
	final double p = 0.3275911;
	final double a1 = 0.254829592;
	final double a2 = -0.284496736;
	final double a3 = 1.421413741;
	final double a4 = -1.453152027;
	final double a5 = 1.061405429;

	final double f = Math.abs(x);
	final double t = 1.0 / (1.0 + p * f);
	
	double ret = 0.0;
	if (f <= 8.0) {
	    ret = 1.0 - t * (a1 +
			     t * (a2 + 
				  t * (a3 +
				       t * (a4 +
					    t * a5)))) * Math.exp(-x * x);
	} else {
	    ret = 1.0;
	}

	if (x < 0) {
	    ret = -ret;
	}
	return ret;
    }    

    /**
     *  This function calculates the sum of the exponential integral and
     *  the natural logarithm, according t o the formulae given in Abramowitz
     *  and Stegun, Handbook of Mathematical Functions, p. 231.
     *  Error is < 2.0 x 10-7.
     *
     *  (Comment taken from original fortran code)
     */
    public double expIntNL(final double x) {
	final double a0 = -0.57721566;
	final double a1 = 0.99999193;
	final double a2 = -0.24991055;
	final double a3 = 0.05519968;
	final double a4 = -0.00976004;
	final double a5 = 0.00107857;
	final double b1 = 8.5733287401;
	final double b2 = 18.0590169730;
	final double b3 = 8.6347608925;
	final double b4 = 0.2677737343;
	final double c1 = 9.5733223454;
	final double c2 = 25.6329561486;
	final double c3 = 21.0996530827;
	final double c4 = 3.9584969228;

	if (x < 1.0) {
	    return a0 + x * (a1 +
			     x * (a2 +
				  x * (a3 +
				       x * (a4 +
					    x * a5))));
	} else if (x < 50.0) {
	    return Math.log(x) + ((Math.exp(-x) / x) *
				  ((b4 + x * (b3 + x * (b2 + x * (b1 + x)))) /
				   (c4 + x * (c3 + x * (c2 + x * (c1 + x))))));
	} else {
	    return Math.log(x);
	}     
    }
}
