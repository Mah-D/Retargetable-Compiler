public class PICTest {
    public static void main(String[] args) {
	PICTest test = new PICTest();
	for (point [i] : [0 : 199]) {
	    test.prefixTest();
	}
	for (point [i] : [0 : 99]) {
	    test.repartitionTest4();
	}
 	test.initialDistTest();
	for (point [i] : [0 : 4]) {
	    if (test.moveToDistTest()) {
		System.out.println("Field To Dist Move Succeded");
	    } else {
		System.out.println("Field To Dist Move Faileded");
	    }
	    if (test.moveToUnifTest()) {
		System.out.println("Field To Uniform Move Succeded");
	    } else {
		System.out.println("Field To Uniform Move Faileded");
	    }
	    if (test.partMoveTest()) {
		System.out.println("Particle Move Succeeded");
	    } else {
		System.out.println("Particle Move Succeeded");
	    }
	    if (test.pushPartTest()) {
		System.out.println("Particle Push Test Succeeded");
	    } else {
		System.out.println("Particle Push Test Failed");
	    }
	    if (test.positionTest()) {
		System.out.println("Initial Position Test Succeeded");
	    } else {
		System.out.println("Initial Position Test Failed");
	    }
	    if (test.velocityTest()) {
		System.out.println("Initial Velocity Test Succeeded");
	    } else {
		System.out.println("Initial Velocity Test Failed");
	    }
	    System.out.println();
	}
	test.repartitionTest1();
	test.repartitionTest2();
	test.repartitionTest3();
    }
    
    public java.util.Random r;

    public PICTest() { 
	r = new java.util.Random(12345);
    }

    public boolean stepTest() {
	return false;
    }

    public boolean prefixTest() {
	return false;
    }

    public boolean moveToDistTest() {
	final region(:rank==2) rRef = [0:31,0:31];
	final dist(:rank==2) dRand = randomDist(32, 32);
	final dist(:rank==2) dUnif = X10Util.distBlockStar(rRef);

	final double value[:rank==2] ref = 
	    (double value[:rank==2])
	    new double value[rRef] (point [i,j]) {
	    return i + 0.01 * j;
	};

	final double[:rank==2] in = new double[dUnif] (point pt) {
	    return ref[pt];
	};

	final LinearESOpenPIC2D pic = new LinearESOpenPIC2D();
	final double[:rank==2] res = pic.moveFieldToDist(in, dRand);

	final place p = here;
	final boolean[.] result = 
	    new boolean[[0:0]->here] (point pt) { return true; };
	for (point pt : res) {
	    finish async (res.distribution.get(pt)) {
		if (res[pt] != ref[pt]) {
		    System.out.println(pt + " : " + res[pt] + " != " + ref[pt]);
		    finish async (p) {
			result[0] = false;
		    }
		}
	    }
	}	
	return res.distribution.equals(dRand);
    }

    public boolean moveToUnifTest() {
	final region(:rank==2) rRef = [0:31,0:31];
	final dist(:rank==2) dRand = randomDist(32, 32);
	final dist(:rank==2) dUnif = X10Util.distBlockStar(rRef);

	final double value[:rank==2] ref = 
	    (double value[:rank==2])
	    new double value[rRef] (point [i,j]) {
	    return i + 0.01 * j;
	};

	final double[:rank==2] in = new double[dRand] (point pt) {
	    return ref[pt];
	};

	final LinearESOpenPIC2D pic = new LinearESOpenPIC2D();
	final double[:rank==2] res = pic.moveFieldToUniform(in);

	final place p = here;
	final boolean[.] result = 
	    new boolean[[0:0]->here] (point pt) { return true; };
	for (point pt : res) {
	    finish async (res.distribution.get(pt)) {
		if (res[pt] != ref[pt]) {
		    System.out.println(pt + " : " + res[pt] + " != " + ref[pt]);
		    finish async (p) {
			result[0] = false;
		    }
		}
	    }
	}
	return res.distribution.equals(dUnif);
    }
	    

    public boolean partMoveTest() {
	final dist(:rank==2) dSpace = X10Util.distBlockStar([0:31,0:31]);
	final dist(:rank==1) dPart = 
	    (dist(:rank==1)) dist.factory.block([0:319]);
	
	final Particle[:rank==1] part = new Particle[dPart];

	int counter = 1;
	for (point [i] : dPart) {
	    final int id = counter;
	    finish async (dPart.get(i)) {
		part[i] = randomParticle(dSpace, id);
	    }
	    counter++;
	}

	final LinearESOpenPIC2D pic = new LinearESOpenPIC2D();
	final int[:rank==1] info = pic.makeInfoArray();
	final Particle[:rank==1] res = pic.moveParticles(part, dSpace,info);

	final place p = here;
	final boolean[.] result = 
	    new boolean[[0:0]->here] (point pt) { return true; };
	for (point [i] : res) {
	    finish async (res.distribution.get(i)) {
		if (!findParticle(res[i], part)) {
		    System.out.println("Could not find particle : " + res[i]);
		    finish async (p) {
			result[0] = false;
		    }
		}
	    }
	}

	for (point [i] : res) {
	    finish async (res.distribution.get(i)) {
		final region(:rank==1) rLocal1 = X10Util.getLRank(dSpace, 0);
		final region(:rank==1) rLocal2 = X10Util.getLRank(dSpace, 1);

		final double x = res[i].getX();
		final double y = res[i].getY();
		if (!rLocal1.contains([(int) y])) {
		    System.out.println("Particle: " + res[i] + 
				       " not in local y region");
		}
		if (!rLocal2.contains([(int) x])) {
		    System.out.println("Particle: " + res[i] + 
				       " not in local x region");

		}
	    }
	}
	return result[0];
    }

    public boolean initialDistTest() {
	final int nPart = 320;
	final version15.LinearESOpenPIC2 pic1 = 
	    new version15.LinearESOpenPIC2();
	final LinearESOpenPIC2D pic2 = new LinearESOpenPIC2D();
	
	final dist(:rank==1) dPart = 
	    (dist(:rank==1)) dist.factory.block([0:nPart - 1]);
	final version15.Particle[:rank==1] part1 = 
	    new version15.Particle[dPart] (point pt) {
	        return new version15.Particle();
  	    };
	pic1.pFDistR2(part1);
	pic1.pVDistR2(part1);

	final double[:rank==2] pos = pic2.genParticlePosition(nPart);
	final double[:rank==2] vel = pic2.genParticleVelocity(nPart);
	final Particle[:rank==1] part2 = pic2.genParticles(nPart, pos, vel);

	dist(:rank==2) dRes1 = pic1.fEdges2(part1);
	dist(:rank==2) dRes2 = pic2.genInitialDist(part2);

	if (!dRes1.equals(dRes2)) {
	    for (point [pl] : dist.UNIQUE) {
		final place p = place.places(pl);
		final region(:rank==1) r11 = X10Util.getLRank(dRes1, p, 0);
		final region(:rank==1) r12 = X10Util.getLRank(dRes1, p, 1);
		final region(:rank==1) s21 = X10Util.getLRank(dRes2, p, 0);
		final region(:rank==1) s22 = X10Util.getLRank(dRes2, p, 1);

		final region(:rank==1) rn11 = [r11.low():r11.high()];
		final region(:rank==1) rn12 = [r12.low():r12.high()];
		final region(:rank==1) sn21 = [s21.low():s21.high()];
		final region(:rank==1) sn22 = [s22.low():s22.high()];

		System.out.println(p + " : " + [rn11,rn12] + " " + [sn22,sn21]);
	    }
	}

	return true;

	
    }

    public boolean positionTest() {
	final int nPart = 320;
	final version15.LinearESOpenPIC2 pic1 = 
	    new version15.LinearESOpenPIC2();
	final LinearESOpenPIC2D pic2 = new LinearESOpenPIC2D();
	
	final dist(:rank==1) dPart = 
	    (dist(:rank==1)) dist.factory.block([0:nPart - 1]);
	final version15.Particle[:rank==1] part = 
	    new version15.Particle[dPart] (point pt) {
	        return new version15.Particle();
  	    };
	pic1.pFDistR2(part);

	final double[:rank==2] pos = pic2.genParticlePosition(nPart);

	final place p = here;
	final boolean[.] result =
	    new boolean[[0:0]->here] (point pt) { return true; };	
	for (point [i] : dPart) {
	    finish async (dPart.get(i)) {
		final double x1 = part[i].getX();
		final double y1 = part[i].getY();
		final double x2 = pos[i,0];
		final double y2 = pos[i,1];
		
		finish async (p) { 
		    if (!eq(x1, x2)) {
			System.out.println("X" + [i] + " : " + 
					   x1 + " != " + x2);
			result[0] = false; 
		    }
		    if (!eq(y1, y2)) {
			System.out.println("Y" + [i] + " : " + 
					   y1 + " != " + y2);
			result[0] = false; 
		    }
		}
	    }
	}
	return result[0];
    }    

    public boolean velocityTest() {
	final int nPart = 320;
	final version15.LinearESOpenPIC2 pic1 = 
	    new version15.LinearESOpenPIC2();
	final LinearESOpenPIC2D pic2 = new LinearESOpenPIC2D();
	
	final dist(:rank==1) dPart = 
	    (dist(:rank==1)) dist.factory.block([0:nPart - 1]);
	final version15.Particle[:rank==1] part = 
	    new version15.Particle[dPart] (point pt) {
	        return new version15.Particle();
  	    };
	pic1.pVDistR2(part);

	final double[:rank==2] pos = pic2.genParticleVelocity(nPart);

	final place p = here;
	final boolean[.] result =
	    new boolean[[0:0]->here] (point pt) { return true; };	
	for (point [i] : dPart) {
	    finish async (dPart.get(i)) {
		final double x1 = part[i].getXVel();
		final double y1 = part[i].getYVel();
		final double x2 = pos[i,0];
		final double y2 = pos[i,1];
		
		finish async (p) { 
		    if (!eq(x1, x2)) {
// 			System.out.println("X" + [i] + " : " + 
// 					   x1 + " != " + x2);
			result[0] = false; 
		    }
		    if (!eq(y1, y2)) {
// 			System.out.println("Y" + [i] + " : " + 
// 					   y1 + " != " + y2);
			result[0] = false; 
		    }
		}
	    }
	}
	return result[0];
    }

    public boolean repartitionTest1() {
	final int x = 5;
	final int y = 5;

	final LinearESOpenPIC2D pic = new LinearESOpenPIC2D();

	final place p0 = place.places(0);
	final place p1 = place.places(1);
	final place p2 = place.places(2);
	final place p3 = place.places(3);
	final region(:rank==1) rx = [0 : (1 << x) - 1];
	final region(:rank==2) r0 = [0:0,rx];
	final region(:rank==2) r1 = [1:1,rx];
	final region(:rank==2) r2 = [2:2,rx];
	final region(:rank==2) r3 = [3:31,rx];
	final dist(:rank==2) dSpace = 
	    (dist(:rank==2)) ((r0->p0) || (r1->p1) || (r2->p2) || (r3->p3));

	final region(:rank==1) rp0 = [0:9];
	final region(:rank==1) rp1 = [10:19];
	final region(:rank==1) rp2 = [20:29];
	final region(:rank==1) rp3 = [30:319];
	final dist(:rank==1) dPart = 
	    (dist(:rank==1)) ((rp0->p0) || (rp1->p1) || (rp2->p2) || (rp3->p3));
	    
	final Particle[:rank==1] part = genParticle2(dSpace, dPart);
	
	final int[:rank==1] count1 = pic.countParticles(part, dSpace);

	final dist(:rank==2) dResult = pic.repartition(count1, dSpace, 80);
	final int[:rank==1] info = pic.makeInfoArray();
	final Particle[:rank==1] pResult =
	    pic.moveParticles(part, dResult, info);


	// print dist
	for (point [pl] : dist.UNIQUE) {
	    final place p = place.places(pl);
	    final region(:rank==2) rLocalS = X10Util.getLRegion(dResult, p);
	    final region(:rank==1) rLocalS1 = X10Util.getRank(rLocalS, 0);
	    final region(:rank==1) r = [rLocalS1.low() : rLocalS1.high()];
	    
	    final region(:rank==1) rLocalP = 
		X10Util.getLRegion(pResult.distribution, p);
	    final int nPart = rLocalP.size();

	    System.out.println(p + " : " + r + " np: " + nPart);
	}


	return true;
    }

    public boolean repartitionTest2() {
	final int x = 5;
	final int y = 5;

	final LinearESOpenPIC2D pic = new LinearESOpenPIC2D();

	final place p0 = place.places(0);
	final place p1 = place.places(1);
	final place p2 = place.places(2);
	final place p3 = place.places(3);
	final region(:rank==1) rx = [0 : (1 << x) - 1];
	final region(:rank==2) r0 = [0:28,rx];
	final region(:rank==2) r1 = [29:29,rx];
	final region(:rank==2) r2 = [30:30,rx];
	final region(:rank==2) r3 = [31:31,rx];
	final dist(:rank==2) dSpace = 
	    (dist(:rank==2)) ((r0->p0) || (r1->p1) || (r2->p2) || (r3->p3));

	final region(:rank==1) rp0 = [0:299];
	final region(:rank==1) rp1 = [300:308];
	final region(:rank==1) rp2 = [309:314];
	final region(:rank==1) rp3 = [315:319];
	final dist(:rank==1) dPart = 
	    (dist(:rank==1)) ((rp0->p0) || (rp1->p1) || (rp2->p2) || (rp3->p3));
	    
	final Particle[:rank==1] part = genParticle2(dSpace, dPart);
	
	final int[:rank==1] count1 = pic.countParticles(part, dSpace);

	final dist(:rank==2) dResult = pic.repartition(count1, dSpace, 80);
	final int[:rank==1] info = pic.makeInfoArray();
	final Particle[:rank==1] pResult =
	    pic.moveParticles(part, dResult, info);

	// print dist
	for (point [pl] : dist.UNIQUE) {
	    final place p = place.places(pl);
	    final region(:rank==2) rLocalS = X10Util.getLRegion(dResult, p);
	    final region(:rank==1) rLocalS1 = X10Util.getRank(rLocalS, 0);
	    final region(:rank==1) r = [rLocalS1.low() : rLocalS1.high()];
	    
	    final region(:rank==1) rLocalP = 
		X10Util.getLRegion(pResult.distribution, p);
	    final int nPart = rLocalP.size();

	    System.out.println(p + " : " + r + " np: " + nPart);
	}

	return true;
    }

    public boolean repartitionTest3() {
	final int x = 5;
	final int y = 5;

	final LinearESOpenPIC2D pic = new LinearESOpenPIC2D();

	final place p0 = place.places(0);
	final place p1 = place.places(1);
	final place p2 = place.places(2);
	final place p3 = place.places(3);
	final region(:rank==1) rx = [0 : (1 << x) - 1];
	final region(:rank==2) r0 = [0:11,rx];
	final region(:rank==2) r1 = [12:15,rx];
	final region(:rank==2) r2 = [16:29,rx];
	final region(:rank==2) r3 = [30:31,rx];
	final dist(:rank==2) dSpace = 
	    (dist(:rank==2)) ((r0->p0) || (r1->p1) || (r2->p2) || (r3->p3));

	final region(:rank==1) rp0 = [0:299];
	final region(:rank==1) rp1 = [300:308];
	final region(:rank==1) rp2 = [309:314];
	final region(:rank==1) rp3 = [315:319];
	final dist(:rank==1) dPart = 
	    (dist(:rank==1)) ((rp0->p0) || (rp1->p1) || (rp2->p2) || (rp3->p3));
	    
	final Particle[:rank==1] part = genParticle2(dSpace, dPart);
	
	final int[:rank==1] count1 = pic.countParticles(part, dSpace);

	final dist(:rank==2) dResult = pic.repartition(count1, dSpace, 80);
	final int[:rank==1] info = pic.makeInfoArray();
	final Particle[:rank==1] pResult =
	    pic.moveParticles(part, dResult, info);


	// print dist
	for (point [pl] : dist.UNIQUE) {
	    final place p = place.places(pl);
	    final region(:rank==2) rLocalS = X10Util.getLRegion(dResult, p);
	    final region(:rank==1) rLocalS1 = X10Util.getRank(rLocalS, 0);
	    final region(:rank==1) r = [rLocalS1.low() : rLocalS1.high()];
	    
	    final region(:rank==1) rLocalP = 
		X10Util.getLRegion(pResult.distribution, p);
	    final int nPart = rLocalP.size();

	    System.out.println(p + " : " + r + " np: " + nPart);
	}


	return true;
    }

    public boolean repartitionTest4() {
	final int x = 5;
	final int y = 5;

	final LinearESOpenPIC2D pic = new LinearESOpenPIC2D();

	final place p0 = place.places(0);
	final place p1 = place.places(1);
	final place p2 = place.places(2);
	final place p3 = place.places(3);
	final region(:rank==1) rx = [0 : (1 << x) - 1];
	final region(:rank==2) r0 = [0:28,rx];
	final region(:rank==2) r1 = [29:29,rx];
	final region(:rank==2) r2 = [30:30,rx];
	final region(:rank==2) r3 = [31:31,rx];
	final dist(:rank==2) dSpace = 
	    (dist(:rank==2)) ((r0->p0) || (r1->p1) || (r2->p2) || (r3->p3));

	final region(:rank==1) rp0 = [0:299];
	final region(:rank==1) rp1 = [300:308];
	final region(:rank==1) rp2 = [309:314];
	final region(:rank==1) rp3 = [315:319];
	final dist(:rank==1) dPart = 
	    (dist(:rank==1)) ((rp0->p0) || (rp1->p1) || (rp2->p2) || (rp3->p3));
	    
	final Particle[:rank==1] part = genParticle2(dSpace, dPart);
	
	final region(:rank==1) rPart = [0 : 319];
       
	final int[:rank==1] count1 = pic.countParticles(part, dSpace);

	// Seed with test data
	finish async (p0) {
	    count1[0] = 10;
	    count1[1] = 9;
	    count1[2] = 11;
	    count1[3] = 12;
	    count1[4] = 5;
	    count1[5] = 14;
	    count1[6] = 12;
	    count1[7] = 12;
	    count1[8] = 9;
	    count1[9] = 15;
	    count1[10] = 9;
	    count1[11] = 13;
	    count1[12] = 12;
	    count1[13] = 13;
	    count1[14] = 9;
	    count1[15] = 6;
	    count1[16] = 18;
	    count1[17] = 4;
	    count1[18] = 7;
	    count1[19] = 6;
	    count1[20] = 10;
	    count1[21] = 10;
	    count1[22] = 16;
	    count1[23] = 14;
	    count1[24] = 6;
	    count1[25] = 11;
	    count1[26] = 11;
	    count1[27] = 11;
	    count1[28] = 5;
	}

	finish async (p1) {
	    count1[29] = 9;

	}

	finish async (p2) {
	    count1[30] = 6;	    
	}

	finish async (p3) {
	    count1[31] = 5;
	}

	final dist(:rank==2) dResult = pic.repartition(count1, dSpace, 80);
	final int[:rank==1] info = pic.makeInfoArray();
	final Particle[:rank==1] pResult =
	    pic.moveParticles(part, dResult, info);

	// print dist
	for (point [pl] : dist.UNIQUE) {
	    final place p = place.places(pl);
	    final region(:rank==2) rLocalS = X10Util.getLRegion(dResult, p);
	    final region(:rank==1) rLocalS1 = X10Util.getRank(rLocalS, 0);
	    final region(:rank==1) r = [rLocalS1.low() : rLocalS1.high()];
	    
	    final region(:rank==1) rLocalP = 
		X10Util.getLRegion(pResult.distribution, p);
	    final int nPart = rLocalP.size();

	    System.out.println(p + " : " + r + " np: " + nPart);
	}

	return true;
    }

    public boolean pushPartTest() {
	int x = 5;
	int y = 5;

	final version15.LinearESOpenPIC2 pic1 =
	    new version15.LinearESOpenPIC2();
	final LinearESOpenPIC2D pic2 = new LinearESOpenPIC2D();

	final region(:rank==1) r1 = [0 : (1 << x)];
	final region(:rank==1) r2 = [0 : (1 << y) - 1];
	final region(:rank==1) rs1 = [0 : (1 << x) - 1];
	final region(:rank==1) rs2 = [0 : (1 << y) - 1];
	final dist(:rank==2) dSpace1 = X10Util.distStarBlock([rs1,rs2]);
	final dist(:rank==2) dSpace2 = X10Util.distBlockStar([rs1,rs2]);
	final dist(:rank==3) dIn1 = 
	    X10Util.extendRank3D(X10Util.distStarBlock([r1,r2]), [0:1]);
	final dist(:rank==2) dIn2 = X10Util.distBlockStar([r2,r1]);
	final dist(:rank==3) dG1 = makeGuard1(dIn1);
	final dist(:rank==2) dG2 = makeGuard2(dIn2);

	final double[:rank==3] fxy = new double[dIn1] (point [i,j,k]) {
	    return r.nextDouble();
	};
	final double[:rank==3] fxyg = new double[dG1] (point [i,j,k]) {
	    return r.nextDouble();   
	};

	final double[:rank==2] fx = new double[dIn2] (point [i,j]) {
	    return fxy[j,i,0];
	};
	final double[:rank==2] fy = new double[dIn2] (point [i,j]) {
	    return fxy[j,i,1];
	};
	final double[:rank==2] fxg = new double[dG2] (point [i,j]) {
	    return fxyg[j,i,0];
	};
	final double[:rank==2] fyg = new double[dG2] (point [i,j]) {
	    return fxyg[j,i,1];
	};
	

	final dist(:rank==1) dPart = 
	    (dist(:rank==1)) dist.factory.block([0:319]);

	final version15.Particle[:rank==1] part1 = genParticle1(dSpace1, dPart);
	final Particle[:rank==1] part2 = new Particle[dPart];

	finish ateach (point [i] : part1) {
	    part2[i] = particle(part1[i]);
	}

	final double e1 = pic1.pgPush2L(part1, fxy, fxyg);
	final double e2 = pic2.pushParticles(part2, fx, fxg, fy, fyg);

	final place p = here;
	final boolean[.] result =
	    new boolean[[0:0]->here] (point pt) { return true; };
	for (point [i] : part1) {
	    finish async (part1.distribution.get(i)) {
		final version15.Particle p1 = part1[i];
		final Particle p2 = part2[i];
		if (!eq(p1, p2)) {
		    System.out.println([i] + " : " + p1 + " != " + p2);
		    finish async (p) { result[0] = false; }
		}
	    }
	}
	if (!eq(e1, e2)) {
	    System.out.println(e1 + " != " + e2);
	    result[0] = false;
	}
	return result[0];
    }

    public boolean eq(double d1, double d2) {
	return (Math.abs(d1 - d2) < 9.9999999999e-12);
    }

    public boolean eq(version15.Particle p1, Particle p2) {
	return (eq(p1.getX(), p2.getX()) && 
		eq(p1.getY(), p2.getY()) &&
		eq(p1.getXVel(), p2.getXVel()) && 
		eq(p1.getYVel(), p2.getYVel()));
    }

    public version15.Particle[:rank==1] 
	genParticle1(final dist(:rank==2) dSpace, 
		     final dist(:rank==1) dPart) {
	final version15.Particle[:rank==1] part = 
	    new version15.Particle[dPart];

	for (point [pl] : dist.UNIQUE) {
	    finish async (place.places(pl)) {
		final region(:rank==1) rLocal = X10Util.getLRegion(dPart);
		for (point pt : rLocal) {
		    part[pt] = makeParticle1(dSpace);
		}
	    }
	}
	return part;
    }

    public Particle[:rank==1] genParticle2(final dist(:rank==2) dSpace, 
					   final dist(:rank==1) dPart) { 
	final Particle[:rank==1] part = new Particle[dPart];

	for (point [pl] : dist.UNIQUE) {
	    finish async (place.places(pl)) {
		final region(:rank==1) rLocal = X10Util.getLRegion(dPart);
		for (point pt : rLocal) {
		    part[pt] = makeParticle2(dSpace);
		}
	    }
	}
	return part;
    }

    public version15.Particle makeParticle1(dist(:rank==2) d) {
	final region(:rank==2) rLocal = X10Util.getLRegion(d);
	final region(:rank==1) rLocal1 = X10Util.getRank(rLocal, 0);
	final region(:rank==1) rLocal2 = X10Util.getRank(rLocal, 1);
	
	final int size1 = rLocal1.size();
	final int size2 = rLocal2.size();
	final int low1 = rLocal1.low();
	final int low2 = rLocal2.low();
	
	final double x = r.nextDouble() * size1 + low1;
	final double y = r.nextDouble() * size2 + low2;
	final double vx = 2 * r.nextDouble() - 1;
	final double vy = 2 * r.nextDouble() - 1;
	
	if (!rLocal1.contains([(int) x])) {
	    System.out.println("Particle not in bounds: " + x + ", " + rLocal1);
	}
	
	if (!rLocal2.contains([(int) y])) {
	    System.out.println("Particle not in bounds: " + y + ", " + rLocal2);
	}

	return new version15.Particle(x,y,vx,vy);
    }

    public Particle makeParticle2(dist(:rank==2) d) {
	final region(:rank==2) rLocal = X10Util.getLRegion(d);
	final region(:rank==1) rLocal1 = X10Util.getRank(rLocal, 1);
	final region(:rank==1) rLocal2 = X10Util.getRank(rLocal, 0);
	
	final int size1 = rLocal1.size();
	final int size2 = rLocal2.size();
	final int low1 = rLocal1.low();
	final int low2 = rLocal2.low();
	
	final double x = r.nextDouble() * size1 + low1;
	final double y = r.nextDouble() * size2 + low2;
	final double vx = 2 * r.nextDouble() - 1;
	final double vy = 2 * r.nextDouble() - 1;
	
	if (!rLocal1.contains([(int) x])) {
	    System.out.println("Particle not in bounds: " + x + ", " + rLocal1);
	}
	
	if (!rLocal2.contains([(int) y])) {
	    System.out.println("Particle not in bounds: " + y + ", " + rLocal2);
	}

	return new Particle(x,y,vx,vy);
    }

    public Particle randomParticle(dist(:rank==2) d, int id) {
	final region(:rank==1) rLocal1 = X10Util.getRank(d.region, 1);
	final region(:rank==1) rLocal2 = X10Util.getRank(d.region, 0);
	
	final int size1 = rLocal1.size();
	final int size2 = rLocal2.size();
	final int low1 = rLocal1.low();
	final int low2 = rLocal2.low();
	
	final double x = r.nextDouble() * size1 + low1;
	final double y = r.nextDouble() * size2 + low2;
	final double vx = 2 * r.nextDouble() - 1;
	final double vy = 2 * r.nextDouble() - 1;
	
	return new Particle(x,y,vx,vy,id);
    }

    public Particle particle(version15.Particle p) {
	return new Particle(p.getX(), p.getY(), p.getXVel(), p.getYVel());
    }

    public Complex complex(version15.Complex c) {
	return new Complex(c.getReal(), c.getImag());
    }

    public dist(:rank==3) makeGuard1(final dist(:rank==3) d) {
	dist(:rank==3) dResult = 
	    (dist(:rank==3)) (region.factory.emptyRegion(3)->here);
	for (point[pl] : dist.UNIQUE.region) {
	    final place p = place.places(pl);
	    final region(:rank==1) rLocal1 = X10Util.getLRank(d, p, 0);
	    final region(:rank==1) rLocal2 = X10Util.getLRank(d, p, 1);
	    final int high = rLocal2.high();
	    
	    dResult = dResult || ([rLocal1, high + 1:high + 1,0:1]->p);
	}
	return dResult;
    }

    public dist(:rank==2) makeGuard2(final dist(:rank==2) d) {
	dist(:rank==2) dResult = 
	    (dist(:rank==2)) (region.factory.emptyRegion(2)->here);
	for (point[pl] : dist.UNIQUE.region) {
	    final place p = place.places(pl);
	    final region(:rank==1) rLocal1 = X10Util.getLRank(d, p, 0);
	    final region(:rank==1) rLocal2 = X10Util.getLRank(d, p, 1);
	    final int high = rLocal1.high();
	    
	    dResult = dResult || ([high + 1:high + 1,rLocal2]->p);
	}
	return dResult;
    }

    public dist(:rank==2) randomDist(int x, int y) {
	final int[.] edge = new int[[0:place.MAX_PLACES-2]->here];
	final int[.] bins = new int[[0:y-2]->here] (point pt) { return 0; };
	boolean done;
	do {
	    done = true;
	    for (point [i] : bins) {
		bins[i] = 0;
	    }
	    for (point [i] : edge) {
		edge[i] = (int) (r.nextDouble() * (y - 1));
		bins[edge[i]]++;
	    }
	    for (point [i] : bins) {
		if (bins[i] > 1) {
		    done = false;
		}
	    }
	} while (!done);
	int low = 0;
	int pl = 0;
	dist(:rank==2) dResult = 
	    (dist(:rank==2)) (region.factory.emptyRegion(2)->here);
	for (point [i] : bins) {
	    if (bins[i] > 0) {
		dResult = dResult || ([low:i,0:x-1]->place.places(pl));
		low = i + 1;
		pl++;	       
	    }
	}
	dResult = dResult || ([low:y-1,0:x-1]->place.places(pl));

	return dResult;
    }

    public void printDist(final dist d) {
	for (point [pl] : dist.UNIQUE) {
	    final place p = place.places(pl);
	    final region(:rank==1) r1 = X10Util.getLRank(d, p, 0);
	    final region(:rank==1) r2 = X10Util.getLRank(d, p, 1);
	    final region(:rank==1) rn1 = [r1.low():r1.high()];
	    final region(:rank==1) rn2 = [r2.low():r2.high()];
	    System.out.println([rn1,rn2] + "->" + p);
	}
    }

    public boolean findParticle(final Particle p, 
				final Particle[:rank==1] part) {
	final place ph = here;
	final boolean[.] result = 
	    new boolean[[0:0]->here] (point pt) { return false; }; 
	for (point [pl] : dist.UNIQUE) {
	    finish async (place.places(pl)) {
		for (point [i] : part | here) {
		    if (p.equals(part[i])) {
			finish async (ph) {
			    result[0] = true;
			}
		    }
		}
	    }
	}
	return result[0];
    }
}