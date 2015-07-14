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
 */
public class SOR {
    private static final int JACOBI_NUM_ITER = 100;
    private static final long RANDOM_SEED = 10101010;

    public Random R;

    public SOR() {
	R = new Random(RANDOM_SEED);
    }

    public void run() {
	validate(kernel());
    }

    public double kernel() {
	double[:rank==2] G = RandomMatrix(10, 10, R);
	return SORrun(1.25, G, JACOBI_NUM_ITER);
    }

    private double[:rank==2] RandomMatrix(final int M, 
					  final int N, 
					  final Random R) {
	final dist(:rank==2) d = blockStar([0:M-1],[0:N-1]);
	final double[:rank==2] t = new double[d];
	for (point(:rank==2) p : t.region) {
	    write(t,p,R.nextDouble() * 1e-6);
	}
	return t;
    }

    private void write(final double[:rank==2] t, final point(:rank==2) p, final double v) {
	finish async (t.distribution.get(p)) {
	    t[p] = v;
	}
    }

    private dist(:rank==2) blockStar(final region(:rank==1) r1, final region(:rank==1) r2) {
	final dist(:rank==1) d1 = (dist(:rank==1)) dist.factory.block(r1);
	return distTimesRegion(d1, r2);
    }

    private dist(:rank==2) distTimesRegion(final dist(:rank==1) d, final region(:rank==1) r) {
	dist(:rank==2) d0 = ((region(:rank==2)) region.factory.emptyRegion(2))->here;
	for (point(:rank==1) pl : dist.UNIQUE) {
	    place p = dist.UNIQUE.get(pl);
	    d0 = d0 || ([(region(:rank==1)) (d | p).region, r]->p);
	}
	return d0;
    }

    public void validate(final double gtotal) {
	double dev = Math.abs(gtotal - 4.5185971433257635E-5);
	if (dev > 1.0e-12) {
	    System.out.println("Validation failed");
	    System.out.println("gtotal = " + gtotal + "  " + dev);
	    throw new RuntimeException("Validation failed");
	}
    }

    public double read(final double[:rank==2] G, 
		       final point(:rank==2) pt) {
	final region(:rank==1) r = [0:0];
	final dist(:rank==1) d = r->here;
	final double[:rank==1] result = new double[d];
	final place phere = here;
	finish async (G.distribution.get(pt)) {
	    final double val = G[pt];
	    async (phere) {
		result[0] = val;
	    }
	}
	return result[0];
    }

    public double SORrun(final double omega, 
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

	for (point(:rank==2) po: [0 : num_iterations-1, 0:1]) {
	    finish foreach (point(:rank==2) pt: [0: (((Mm1-1)-(1+po[1]))/2), 1 : Nm1-1]) {
	        final point(:rank==2) ij = pt * [2,1] + [1 + po[1],0];
	        finish async (G.distribution.get(ij)) {
	            G[ij] = omega_over_four * (read(G, ij+[-1,0]) + read(G, ij+[1,0]) + G[ij+[0,-1]] + G[ij+[0,1]]) 
                          + one_minus_omega * G[ij];
		}
	    }
	}

	return G.sum();
    }
}

