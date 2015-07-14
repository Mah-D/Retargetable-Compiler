/**
 *  A series of tests for the particle move functions (see PMOVE2 in the 
 *  fortran code).
 */
public class ParticleMoveTest {
    public static void main(String[] args) {
	System.err.println("Running test1");
	if (!test1()) {
	    System.err.println("test1 failed");
	} else {
	    System.err.println("test1 succeeded");
	}

	System.err.println("Running test2");
	if (!test2()) {
	    System.err.println("test2 failed");
	} else {
	    System.err.println("test2 succeeded");
	}

	System.err.println("Running test3");
	if (!test3()) {
	    System.err.println("test3 failed");
	} else {
	    System.err.println("test3 succeeded");
	}
    }

     public static boolean test1() {
	final place p0 = place.places(0);
	final place p1 = place.places(1);
	final place p2 = place.places(2);
	final place p3 = place.places(3);
	final dist(:rank==1) dY0 = (dist(:rank==1)) ([0:2]->p0);
	final dist(:rank==1) dY1 = (dist(:rank==1)) ([3:3]->p1);
	final dist(:rank==1) dY2 = (dist(:rank==1)) ([4:5]->p2);
	final dist(:rank==1) dY3 = (dist(:rank==1)) ([6:7]->p3);
	final dist(:rank==1) dY = dY0 || dY1 ||	dY2 || dY3;
	final region(:rank==1) rX = [0 : 3];
	final dist(:rank==2) dSpace = X10Util.extendRank2D(dY, rX);

	final dist(:rank==1) dI0 = (dist(:rank==1)) ([0:11]->p0);
	final dist(:rank==1) dI1 = (dist(:rank==1)) ([12:15]->p1);
	final dist(:rank==1) dI2 = (dist(:rank==1)) ([16:27]->p2);
	final dist(:rank==1) dI3 = (dist(:rank==1)) ([28:31]->p3);
	final dist(:rank==1) dInitial = dI0 || dI1 || dI2 || dI3;

	final Particle[:rank==1] particles = new Particle[dInitial];

	// These numbers represent a failed run (with truncation)
	finish async (p0) {
	    particles[0] = new Particle(1.161, 1.457, 0.0, 0.0, 1);
	    particles[1] = new Particle(1.848, 1.457, 0.0, 0.0, 2);
	    particles[2] = new Particle(1.929, 1.510, 0.0, 0.0, 3);
	    particles[3] = new Particle(2.648, 1.342, 0.0, 0.0, 4);
	    particles[4] = new Particle(1.422, 2.172, 0.0, 0.0, 5);
	    particles[5] = new Particle(1.863, 2.112, 0.0, 0.0, 6);
	    particles[6] = new Particle(2.907, 2.044, 0.0, 0.0, 7);
	    particles[7] = new Particle(2.750, 2.453, 0.0, 0.0, 8);
	    particles[8] = new Particle(1.045, 2.961, 0.0, 0.0, 9);
	    particles[9] = new Particle(1.373, 3.001, 0.0, 0.0, 10); // up
	    particles[10] = new Particle(2.426, 3.044, 0.0, 0.0, 11); // up
	    particles[11] = new Particle(2.756, 3.164, 0.0, 0.0, 12); // up
	}

	finish async (p1) {
	    particles[12] = new Particle(1.020, 3.927, 0.0, 0.0, 13);
	    particles[13] = new Particle(1.737, 3.430, 0.0, 0.0, 14);
	    particles[14] = new Particle(2.293, 3.695, 0.0, 0.0, 15);
	    particles[15] = new Particle(2.500, 3.606, 0.0, 0.0, 16);
	}	    

	finish async (p2) {
	    particles[16] = new Particle(1.429, 3.983, 0.0, 0.0, 17); // down
	    particles[17] = new Particle(2.003, 4.719, 0.0, 0.0, 18);
	    particles[18] = new Particle(2.233, 3.942, 0.0, 0.0, 19); // down
	    particles[19] = new Particle(2.970, 4.246, 0.0, 0.0, 20);
	    particles[20] = new Particle(1.223, 5.396, 0.0, 0.0, 21);
	    particles[21] = new Particle(1.661, 4.783, 0.0, 0.0, 22);
	    particles[22] = new Particle(2.283, 4.968, 0.0, 0.0, 23);
	    particles[23] = new Particle(2.875, 4.967, 0.0, 0.0, 24);
	    particles[24] = new Particle(1.375, 5.671, 0.0, 0.0, 25);
	    particles[25] = new Particle(1.712, 5.658, 0.0, 0.0, 26);
	    particles[26] = new Particle(2.393, 5.967, 0.0, 0.0, 27);
	    particles[27] = new Particle(2.548, 5.958, 0.0, 0.0, 28);
	}

	finish async (p3) {
	    particles[28] = new Particle(1.021, 6.598, 0.0, 0.0, 29);
	    particles[29] = new Particle(1.553, 6.472, 0.0, 0.0, 30);
	    particles[30] = new Particle(1.875, 6.717, 0.0, 0.0, 31);
	    particles[31] = new Particle(2.758, 6.617, 0.0, 0.0, 32);
	}

	return runParticleMove(particles, dSpace);
    }

    public static boolean test2() {
	final place p0 = place.places(0);
	final place p1 = place.places(1);
	final place p2 = place.places(2);
	final place p3 = place.places(3);
	final dist(:rank==1) dY0 = (dist(:rank==1)) ([0:1]->p0);
	final dist(:rank==1) dY1 = (dist(:rank==1)) ([2:3]->p1);
	final dist(:rank==1) dY2 = (dist(:rank==1)) ([4:5]->p2);
	final dist(:rank==1) dY3 = (dist(:rank==1)) ([6:7]->p3);
	final dist(:rank==1) dY = dY0 || dY1 ||	dY2 || dY3;
	final region(:rank==1) rX = [0 : 3];
	final dist(:rank==2) dSpace = X10Util.extendRank2D(dY, rX);

	final dist(:rank==1) dI0 = (dist(:rank==1)) ([0:7]->p0);
	final dist(:rank==1) dI1 = (dist(:rank==1)) ([8:15]->p1);
	final dist(:rank==1) dI2 = (dist(:rank==1)) ([16:23]->p2);
	final dist(:rank==1) dI3 = (dist(:rank==1)) ([24:31]->p3);
	final dist(:rank==1) dInitial = dI0 || dI1 || dI2 || dI3;

	final Particle[:rank==1] particles = 
	    new Particle[dInitial] (point [i]) {
	        return new Particle(i % 4, i % 7, 0, 0, i);
	    };
	return runParticleMove(particles, dSpace);
    }

    public static boolean test3() {
	final place p0 = place.places(0);
	final place p1 = place.places(1);
	final place p2 = place.places(2);
	final place p3 = place.places(3);
	final dist(:rank==1) dY0 = (dist(:rank==1)) ([0:1]->p0);
	final dist(:rank==1) dY1 = (dist(:rank==1)) ([2:3]->p1);
	final dist(:rank==1) dY2 = (dist(:rank==1)) ([4:5]->p2);
	final dist(:rank==1) dY3 = (dist(:rank==1)) ([6:7]->p3);
	final dist(:rank==1) dY = dY0 || dY1 ||	dY2 || dY3;
	final region(:rank==1) rX = [0 : 3];
	final dist(:rank==2) dSpace = X10Util.extendRank2D(dY, rX);

	final dist(:rank==1) dI0 = (dist(:rank==1)) ([0:7]->p0);
	final dist(:rank==1) dI1 = (dist(:rank==1)) ([8:15]->p1);
	final dist(:rank==1) dI2 = (dist(:rank==1)) ([16:23]->p2);
	final dist(:rank==1) dI3 = (dist(:rank==1)) ([24:31]->p3);
	final dist(:rank==1) dInitial = dI0 || dI1 || dI2 || dI3;

	final java.util.Random r = new java.util.Random(12345);
	final Particle[:rank==1] particles = 
	    new Particle[dInitial] (point [i]) { 
	         double x = 4 * r.nextDouble();
		 double y = 8 * r.nextDouble();
		 return new Particle(x, y, 0, 0, i);
	    };

	return runParticleMove(particles, dSpace);
    }

    public static boolean runParticleMove(final Particle[:rank==1] particles,
					  final dist(:rank==2) dSpace) {

	//for (point pt : particles) X10Util.println(particles[pt]);

	final int[:rank==1] info = new int[[0:6]->here];
	final Particle[:rank==1] result = 
	    new LinearESOpenPIC2D().moveParticles(particles, dSpace, info);

	//for (point pt : result) X10Util.println(result[pt]);
	
	System.err.println("Error code: " + info[0]);
	System.err.println("Maximum particles per place: " + info[1]);
	System.err.println("Minimum particles per place: " + info[2]);
	System.err.println("Maximum number of buffer overflows: " + info[3]);
	System.err.println("Maximum number of particle passes: " + info[4]);
	System.err.println("Total number of particles on entry: " + info[5]);
	System.err.println("Total number of particles on exit: " + info[6]);

	return checkParticles(particles, result, dSpace);
    }

    public static boolean checkParticles(final Particle[:rank==1] initial,
					 final Particle[:rank==1] finished,
					 final dist(:rank==2) dSpace) {
	final int ny = X10Util.getRank(dSpace.region,1).size();

	// Check that the same number of particles exists
	if (!initial.region.equals(finished.region)) {
	    System.err.println("Number of particles do not match");
	    return false;
	}

	final place pHere = here;
	final Particle[.] dst = new Particle[[0:0]->here];

	// Check that all the particles are the same
	// NOTE: must account for those that wrap
	for (point [i] : initial) {

	    // Pull the particle to here
	    finish async (initial.distribution.get(i)) {
		final Particle src = initial[i];
		finish async (pHere) {
		    dst[0] = src;
		}
	    }

	    final Particle p1 = dst[0];
	    final double y = p1.getY();
	    boolean found = false;
	    for (point [j] : finished) {
		// Pull the particle to here
		finish async (finished.distribution.get(j)) {
		    final Particle src = finished[j];
		    finish async (pHere) {
			dst[0] = src;
		    }
		}

		final Particle p2 = dst[0];
		if (p1.equals(p2) ||
		    p1.equals(p2.setY(y - ny)) ||
		    p1.equals(p2.setY(y + ny))) {
		    found = true;
		}
	    }

	    if (!found) {
		System.err.println("Could not find particle: " + p1);
		return false;
	    }	    
	}
	
	// Now check that all particles lie in their appropriate space
	for (point [pl] : dist.UNIQUE) {
	    final place p = place.places(pl);
	    final region(:rank==2) rLocal = 
		(region(:rank==2)) (dSpace | p).region;
	    final region(:rank==1) rLocal1 = X10Util.getRank(rLocal,0);
	    final region(:rank==1) rLocal2 = X10Util.getRank(rLocal,1);
	    final double xHigh = rLocal2.high() + 1;
	    final double yHigh = rLocal1.high() + 1;
	    final double xLow = rLocal2.low();
	    final double yLow = rLocal1.low();

	    for (point pt : finished | p) {
		// Pull the particle to here
		finish async (finished.distribution.get(pt)) {
		    final Particle src = finished[pt];
		    finish async (pHere) {
			dst[0] = src;
		    }
		}
		final Particle particle = dst[0];
		final double x = particle.getX();
		final double y = particle.getY();
		if (!(x >= xLow && x < xHigh && y >= yLow && y < yHigh)) {
		    System.err.println("Particle out of bounds: " + p + rLocal);
		    return false;
		}
	    }
	}

	return true;
    }
}