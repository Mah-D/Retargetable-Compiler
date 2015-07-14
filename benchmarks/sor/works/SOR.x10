/*
 *
 * (C) Copyright IBM Corporation 2006
 *
 *  This file is part of X10 Test.
 *
 */
// package sor;

// import jgfutil.*;
// import x10.lang.Double;

/**
 * X10 port of sor benchmark from Section 2 of Java Grande Forum Benchmark Suite.
 *
 *  SERIAL VERSION
 *
 * @author Vivek Sarkar (vsarkar@us.ibm.com)
 *
 * Porting issues identified:
 * 1) Replace Java multidimensional array by X10 Multidimensional array
 *    FIXME: This is no longer a problem.
 */
public class SOR {
    private static final int JACOBI_NUM_ITER = 100;
    private static final long RANDOM_SEED = 10101010;

    public Random R;

    public double gtotal;

    public SOR() {
	gtotal = 0.0;
	R = new Random(RANDOM_SEED);
    }

    public void run() {
	kernel();
	validate();
    }

    public void kernel() {
	double[:rank==2] G = RandomMatrix(10, 10, R);
	SORrun(1.25, G, JACOBI_NUM_ITER);
    }

    private double[:rank==2] RandomMatrix(final int M, 
					  final int N, 
					  final Random R) {
	final dist(:rank==2) d = blockStar([0:M-1],[0:N-1]);
	final double[:rank==2] t = new double[d];
	for (point(:rank==2) [i,j] : t.region) {
	    write(t,i,j,R.nextDouble() * 1e-6);
	}
	return t;
    }

    private void write(final double[:rank==2] t, final int i, final int j, final double v) {
	finish async (t.distribution.get(i,j)) {
	    t[i,j] = v;
	}
    }

    private dist(:rank==2) blockStar(final region(:rank==1) r1, final region(:rank==1) r2) {
	final dist(:rank==1) d1 = (dist(:rank==1)) dist.factory.block(r1);
	return distTimesRegion(d1, r2);
    }

    private dist(:rank==2) distTimesRegion(dist(:rank==1) d, region(:rank==1) r) {
	dist(:rank==2) d0 = ((region(:rank==2)) region.factory.emptyRegion(2))->here;
	for (point(:rank==1) [pl] : dist.UNIQUE.region) {
	    place p = place.places(pl);
	    d0 = d0 || ([(region(:rank==1)) (d | p).region, r]->p);
	}
	return d0;
    }

    public void validate() {
	double dev = Math.abs(gtotal - 4.5185971433257635E-5);
	if (dev > 1.0e-12) {
	    System.out.println("Validation failed");
	    System.out.println("gtotal = " + gtotal + "  " + dev);
	    throw new RuntimeException("Validation failed");
	}
    }

    public double read(final double[:rank==2] G, 
		       final int i, 
		       final int j) {
	final region(:rank==1) r = [0:0];
	final dist(:rank==1) d = r->here;
	final double[:rank==1] result = new double[d];
	final place phere = here;
	finish async (G.distribution.get(i,j)) {
	    final double val = G[i,j];
	    async (phere) {
		result[0] = val;
	    }
	}
	return result[0];
    }

    public void SORrun(final double omega, 
			     final double[:rank==2] G, 
			     final int num_iterations) {
	final int M = G.distribution.region.rank(0).size();
	final int N = G.distribution.region.rank(1).size();
	    
	final double omega_over_four = omega * 0.25;
	final double one_minus_omega = 1.0 - omega;

	// update interior points
	//
	final int Mm1 = M-1;
	final int Nm1 = N-1;
	    
	//JGFInstrumentor.startTimer("Section2:SOR:Kernel");

	for (point(:rank==1) [p] : [0 : num_iterations-1]) {
	    for (point(:rank==1) [o] : [0:1]) {
		finish foreach (point(:rank==1) [ii] : [0: (((Mm1-1)-(1+o))/2)]) {
		    final int i = 2 * ii + 1 + o;
		    finish async (G.distribution.get(i,1)) {
			for (point(:rank==1) [j] : [1 : Nm1-1]) {
			    G[i,j] = omega_over_four * (read(G, i-1, j) + read(G, i+1, j) + G[i,j-1]
							+ G[i,j+1]) + one_minus_omega * G[i,j];
			}
		    }
		}
	    }
	}
	    
	//JGFInstrumentor.stopTimer("Section2:SOR:Kernel");
	gtotal = G.sum();
    }
}

