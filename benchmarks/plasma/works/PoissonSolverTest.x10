public class PoissonSolverTest {
    public static void main(String[] args) {
	PoissonSolverTest test = new PoissonSolverTest();
	int[] x = { 1, 2, 3, 4, 5, 6, 7 };
	int[] y = { 7, 6, 5, 4, 3, 2, 1 };
	for (point [i] : [0 : x.length - 1]) {
	    if (test.FFGTest(x[i],y[i])) {
		System.out.println("FFGTest succeeded");
	    } else {
		System.out.println("FFGTest failed");
	    }
	    if (test.FFG2Test(x[i],y[i])) {
		System.out.println("FFG2Test succeeded");
	    } else {
		System.out.println("FFG2Test failed");
	    }
	    if (test.solveTest(x[i],y[i])) {
		System.out.println("solveTest succeeded");
	    } else {
		System.out.println("solveTest failed");
	    }
	    System.out.println();
	}
    }

    public PoissonSolverTest() { }

    public boolean FFGTest(int x, int y) {
	double affp = (x - 2.0) * (y - 2.0) / (10.0 * x * y);
	final version15.PoissonSolver rPS = 
	    new version15.PoissonSolver(x, y, affp);
	final PoissonSolver PS = new PoissonSolver(x, y, affp);
	final double[.] rFFG = rPS.ffg;
	final double[.] FFG = PS.ffg;

	final place p = here;
	final boolean[.] result =
	    new boolean[[0:0]->here] (point pt) { return true; };
	for (point [i,j,k] : rFFG) {
	    finish async (rFFG.distribution.get(i,j,k)) {
		final double d1 = rFFG[i,j,k];
		final double d2 = FFG[j,i,k];
		finish async (p) {
		    if (!eq(d1, d2)) {
			System.out.println([j,i,k] + " " + d1 + " != " + d2);
			result[0] = false;
		    }
		}
	    }
	}	
	return result[0];
    }

    public boolean FFG2Test(int x, int y) {
	double affp = (x - 2.0) * (y - 2.0) / (10.0 * x * y);
	final version15.PoissonSolver rPS = 
	    new version15.PoissonSolver(x, y, affp);
	final PoissonSolver PS = new PoissonSolver(x, y, affp);
	final double value[.] rFFG2 = rPS.ffg2;
	final double value[.] FFG2 = PS.ffg2;

	boolean result = true;
	for (point [i,j] : rFFG2) {
	    final double d1 = rFFG2[i,j];
	    final double d2 = FFG2[i,j];
	    if (!eq(d1, d2)) {
		System.out.println([i,j] + " " + d1 + " != " + d2);
		result = false;
	    }	    	    
	}	
	return result;
    }

    public boolean solveTest(int x, int y) {
	double affp = (x - 2.0) * (y - 2.0) / (10.0 * x * y);
	final version15.PoissonSolver rPS = 
	    new version15.PoissonSolver(x, y, affp);
	final PoissonSolver PS = new PoissonSolver(x, y, affp);
	
	final region(:rank==1) r1 = [0 : (1 << (y + 1)) - 1];
	final region(:rank==1) r2 = [0 : (1 << x) - 1];
	final dist(:rank==2) dIn1 = X10Util.distStarBlock([r1, r2]);
	final dist(:rank==2) dIn2 = X10Util.distBlockStar([r2, r1]);

	final Random r = new Random();
	final region(:rank==3) rRand = [r1, r2, 0:1];
	final double value[.] rand = new double value[rRand] (point [i,j,k]) {
	    if (k == 0) {
		return i * r.nextNormal();
	    } else {
		return j * r.nextNormal();
	    }
	};

	final version15.Complex[:rank==2] in1 = 
	    new version15.Complex[dIn1] (point [i,j]) {
	        return new version15.Complex(rand[i,j,0], rand[i,j,1]);
	    };
	final Complex[:rank==2] in2 = new Complex[dIn2] (point [i,j]) {
	    return complex(in1[j,i]);
	};

	final version15.Complex[.] fx1 = new version15.Complex[dIn1];
	final version15.Complex[.] fy1 = new version15.Complex[dIn1]; 
	final Complex[:rank==2] fx2 = new Complex[dIn2];
	final Complex[:rank==2] fy2 = new Complex[dIn2];

	final double we1 = rPS.pPoisc2a(in1, fx1, fy1);
	final double we2 = PS.solveForceCharge(in2, fx2, fy2);

	final place p = here;
	final boolean[.] result = 
	    new boolean[[0:0]->here] (point pt) { return true; };
	for (point [i,j] : fx1) {
	    finish async (fx1.distribution.get(i,j)) {
		final version15.Complex cx1 = fx1[i,j];
		final version15.Complex cy1 = fy1[i,j];
		final Complex cx2 = fx2[j,i];
		final Complex cy2 = fy2[j,i];

		finish async (p) {
		    if (!eq(cx1, cx2)) {
			System.out.println("ForceX: " + [j,i] + " : " + 
					   cx1 + " != " + cx2);
			result[0] = false;
		    }
		    if (!eq(cy1, cy2)) {
			System.out.println("ForceY: " + [j,i] + " : " + 
					   cy1 + " != " + cy2);
			result[0] = false;
		    }
		}
	    }
	}
	if (!eq(we1, we2)) {
	    System.out.println(we1 + " != " + we2);
	    result[0] = false;
	}
	return result[0];
    }

    public boolean eq(double d1, double d2) {
	return (Math.abs(d1 - d2) < 9.9999999999e-12);
    }

    public boolean eq(version15.Complex c1, Complex c2) {
	return eq(c1.getReal(), c2.getReal()) && eq(c1.getImag(), c2.getImag());
    }

    public Complex complex(version15.Complex c) {
	return new Complex(c.getReal(), c.getImag());
    }
}