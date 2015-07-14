public class LinearESOpenPIC2DTest {
    public static final void main(String[] args) {
	ppTest1();
	sortTest();
	countTest();
	for (point [i] : [0 : 9]) 
	    repartTest();
	doubleDimTest1();
	halfDimTest1();
    }

    public static boolean repartTest() {
	System.err.println("repart Test");
	final int x = 4;
	final int y = 8;
	
	final region(:rank==2) r0 = [0:0,0:x-1];
	final region(:rank==2) r1 = [1:1,0:x-1];
	final region(:rank==2) r2 = [2:2,0:x-1];
	final region(:rank==2) r3 = [3:7,0:x-1];

	final place p0 = place.places(0);
	final place p1 = place.places(1);
	final place p2 = place.places(2);
	final place p3 = place.places(3);

	final dist(:rank==2) dField = 
	    ((r0->p0) || (r1->p1) || (r2->p2) || (r3->p3));

	final dist(:rank==1) dParticle = ([0:1]->p0) || ([2:3]->p1) || ([4:5]->p2) || ([6:15]->p3);
	final Particle[:rank==1] part = new Particle[dParticle];

	finish {
	    async (p0) {
		part[0] = new Particle(1.1,0.7,0,0,0);
		part[1] = new Particle(2.2,0.2,0,0,1);
	    }
	    async (p1) {
		part[2] = new Particle(3.3,1.6,0,0,2);
		part[3] = new Particle(0.4,1.3,0,0,3);
	    }
	    async (p2) {
		part[4] = new Particle(1.5,2.6,0,0,4);
		part[5] = new Particle(2.6,2.2,0,0,5);
	    }
	    async (p3) {
		part[6] = new Particle(3.7,5.9,0,0,6);
		part[7] = new Particle(0.8,3.1,0,0,7);
		part[8] = new Particle(1.9,4.2,0,0,8);
		part[9] = new Particle(3.0,6.6,0,0,9);
		part[10] = new Particle(0.1,4.3,0,0,10);
		part[11] = new Particle(1.2,5.2,0,0,11);
		part[12] = new Particle(2.3,7.4,0,0,12);
		part[13] = new Particle(3.4,3.6,0,0,13);
		part[14] = new Particle(0.5,7.9,0,0,14);
		part[15] = new Particle(1.6,6.2,0,0,15);
	    }
	}
	for (point pt : part) {
	    finish async (part.distribution.get(pt)) {
		System.out.println(pt + " : " + part[pt]);
	    }
	}
	
	final int[:rank==1] count = LinearESOpenPIC2D.countParticles(part, dField);
	for (point pt : count) {
	    finish async (count.distribution.get(pt)) {
		System.out.println(pt + " : " + count[pt]);

	    }
	}

	final dist(:rank==2) dResult = LinearESOpenPIC2D.repartition(count, dField, 4);
	for (point [pl] : dist.UNIQUE) {
	    System.out.println(pl + " " + (dResult | place.places(pl)).region);
	}

	return false;
	
    }

    public static boolean countTest() {
	System.err.println("Count Test");
	final int x = 4;
	final int y = 8;
	
	final region(:rank==2) r0 = [0:0,0:x-1];
	final region(:rank==2) r1 = [1:1,0:x-1];
	final region(:rank==2) r2 = [2:2,0:x-1];
	final region(:rank==2) r3 = [3:7,0:x-1];

	final place p0 = place.places(0);
	final place p1 = place.places(1);
	final place p2 = place.places(2);
	final place p3 = place.places(3);

	final dist(:rank==2) dField = 
	    ((r0->p0) || (r1->p1) || (r2->p2) || (r3->p3));

	final dist(:rank==1) dParticle = ([0:1]->p0) || ([2:3]->p1) || ([4:5]->p2) || ([6:15]->p3);
	final Particle[:rank==1] part = new Particle[dParticle];

	finish {
	    async (p0) {
		part[0] = new Particle(1.1,0.7,0,0,0);
		part[1] = new Particle(2.2,0.2,0,0,1);
	    }
	    async (p1) {
		part[2] = new Particle(3.3,1.6,0,0,2);
		part[3] = new Particle(0.4,1.3,0,0,3);
	    }
	    async (p2) {
		part[4] = new Particle(1.5,2.6,0,0,4);
		part[5] = new Particle(2.6,2.2,0,0,5);
	    }
	    async (p3) {
		part[6] = new Particle(3.7,5.9,0,0,6);
		part[7] = new Particle(0.8,3.1,0,0,7);
		part[8] = new Particle(1.9,4.2,0,0,8);
		part[9] = new Particle(3.0,6.6,0,0,9);
		part[10] = new Particle(0.1,4.3,0,0,10);
		part[11] = new Particle(1.2,5.2,0,0,11);
		part[12] = new Particle(2.3,7.4,0,0,12);
		part[13] = new Particle(3.4,3.6,0,0,13);
		part[14] = new Particle(0.5,7.9,0,0,14);
		part[15] = new Particle(1.6,6.2,0,0,15);
	    }
	}
	for (point pt : part) {
	    finish async (part.distribution.get(pt)) {
		System.out.println(pt + " : " + part[pt]);
	    }
	}
	
	final int[:rank==1] count = LinearESOpenPIC2D.countParticles(part, dField);
	for (point pt : count) {
	    finish async (count.distribution.get(pt)) {
		System.out.println(pt + " : " + count[pt]);

	    }
	}
	return false;
    }

    public static boolean sortTest() {
	System.err.println("Sort Test");
	final int x = 4;
	final int y = 8;
	
	final region(:rank==2) r0 = [0:0,0:x-1];
	final region(:rank==2) r1 = [1:1,0:x-1];
	final region(:rank==2) r2 = [2:2,0:x-1];
	final region(:rank==2) r3 = [3:7,0:x-1];

	final place p0 = place.places(0);
	final place p1 = place.places(1);
	final place p2 = place.places(2);
	final place p3 = place.places(3);

	final dist(:rank==2) dField = 
	    ((r0->p0) || (r1->p1) || (r2->p2) || (r3->p3));

	final dist(:rank==1) dParticle = ([0:1]->p0) || ([2:3]->p1) || ([4:5]->p2) || ([6:15]->p3);
	final Particle[:rank==1] part = new Particle[dParticle];

	finish {
	    async (p0) {
		part[0] = new Particle(1.1,0.7,0,0,0);
		part[1] = new Particle(2.2,0.2,0,0,1);
	    }
	    async (p1) {
		part[2] = new Particle(3.3,1.6,0,0,2);
		part[3] = new Particle(0.4,1.3,0,0,3);
	    }
	    async (p2) {
		part[4] = new Particle(1.5,2.6,0,0,4);
		part[5] = new Particle(2.6,2.2,0,0,5);
	    }
	    async (p3) {
		part[6] = new Particle(3.7,5.9,0,0,6);
		part[7] = new Particle(0.8,3.1,0,0,7);
		part[8] = new Particle(1.9,4.2,0,0,8);
		part[9] = new Particle(3.0,6.6,0,0,9);
		part[10] = new Particle(0.1,4.3,0,0,10);
		part[11] = new Particle(1.2,5.2,0,0,11);
		part[12] = new Particle(2.3,7.4,0,0,12);
		part[13] = new Particle(3.4,3.6,0,0,13);
		part[14] = new Particle(0.5,7.9,0,0,14);
		part[15] = new Particle(1.6,6.2,0,0,15);
	    }
	}
	for (point pt : part) {
	    finish async (part.distribution.get(pt)) {
		System.out.println(pt + " : " + part[pt]);
	    }
	}

	final Particle[:rank==1] res = LinearESOpenPIC2D.sortParticles(part, dField);
	

	for (point pt : res) {
	    finish async (res.distribution.get(pt)) {
		System.out.println(pt + " : " + res[pt]);
	    }
	}
	return false;
    } 

    public static boolean ppTest1() {
	final int[:rank==1] input = (int[:rank==1]) new int[dist.UNIQUE] (point [i]) {
	    return i * 5;
	};
	finish ateach (point [i] : input) {
	    System.out.println(i + " : " + input[i]);
	}
	final int[:rank==1] output = LinearESOpenPIC2D.parallelPrefix(input);
	finish ateach (point [i] : output) {
	    System.out.println(i + " : " + output[i]);
	}
	return true;
    }

    public static boolean doubleDimTest1() {
	final region(:rank==2) rInput = [0:7,0:3];
	final dist(:rank==2) dInput = X10Util.distBlockStar(rInput);
	final double[:rank==2] input = new double[dInput] (point [i,j]) {
	    return i + 0.01 * j;
	};
	
	final region(:rank==2) rOutput = [0:15,0:7];
	final dist(:rank==2) dOutput = X10Util.distBlockStar(rOutput);
	final double[:rank==2] output = new double[dOutput] (point [i,j]) {
	    if (i > 7) {
		return 0.0;
	    } else if (j > 3) {
		return 0.0;
	    } else {
		return i + 0.01 * j;
	    }
	};
	pm(input);
	pm(output);
	final double[:rank==2] result = 
	    new LinearESOpenPIC2D().doubleDimensions(input);
	pm(result);
	return result.valueEquals(output);
    }

    public static boolean halfDimTest1() {
	System.out.println("HALF");
	final region(:rank==2) rInput = [0:15,0:7];
	final dist(:rank==2) dInput = X10Util.distBlockStar(rInput);
	final double[:rank==2] input = new double[dInput] (point [i,j]) {
	    if (i > 8) {
		return 0;
	    } else if (j > 4) {
		return 0;
	    } else {
		return i + 0.01 * j;
	    }
	};

	final region(:rank==2) rOutput = [0:7,0:4];
	final dist(:rank==2) dOutput = X10Util.distBlockStar(rOutput);
	final double[:rank==2] guards = LinearESOpenPIC2D.makeGuards(dOutput);
	final double[:rank==2] g = new double[guards.distribution] (point [i,j]) {
	    if (i == 8) {
		return i + 0.01 * j;
	    } else {
		return 0;
	    }
	};

	final double[:rank==2] output = new double[dOutput] (point [i,j]) {
	    return i + 0.01 * j;
	};

	final double[:rank==2] result = LinearESOpenPIC2D.cropField(input,guards);
	pm(input);
	pm(guards);
	
	System.out.println();
	pm(result);
	pm(guards);

	System.out.println();
	pm(output);
	pm(g);

	LinearESOpenPIC2D.loadGuards(result, guards);
	System.out.println();
	pm(guards);
	LinearESOpenPIC2D.addGuards(result,guards);
	pm(result);
	pm(guards);
	return false;
    }

    public static void pm(final double[:rank==2] d) {
	for (point [pl] : dist.UNIQUE) finish async (place.places(pl)) {
	    final region(:rank==2) rLocal = X10Util.getLRegion(d.distribution);
	    for (point [i] : X10Util.getRank(rLocal,0)) {
		for (point [j] : X10Util.getRank(rLocal,1)) {
		    System.out.print(d[i,j] + " ");
		}
		System.out.println();
	    }
	    System.out.println();
	}
    }
}