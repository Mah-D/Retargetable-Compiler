public class MoveToDistTest {
    public static final void main(String[] args) {
	final int NTESTS = 19;
	for (point [j] : [0 : NTESTS]) { 
	    int count1 = 0;
	    System.err.println("Running Test1");
	    for (point [i] : [0 : NTESTS]) {
		if (test1()) {
		    count1++;
		}
	    }
	
	    int count2 = 0;
	    System.err.println("Running Test2");
	    for (point [i] : [0 : NTESTS]) {
		if (test2()) {
		    count2++;
		}
	    }

	    int count3 = 0;
	    System.err.println("Running Test3");
	    for (point [i] : [0 : NTESTS]) {
		if (test3()) {
		    count3++;
		}
	    }

	    int count4 = 0;
	    System.err.println("Running Test4");
	    for (point [i] : [0 : NTESTS]) {
		if (test4()) {
		    count4++;
		}
	    }

	    int count5 = 0;
	    System.err.println("Running Test5");
	    for (point [i] : [0 : NTESTS]) {
		if (test5()) {
		    count5++;
		}
	    }

	    int count6 = 0;
	    System.err.println("Running Test6");
	    for (point [i] : [0 : NTESTS]) {
		if (test6()) {
		    count6++;
		}
	    }

	    System.err.println("Number of Test1 sucesses: " + count1);
	    System.err.println("Number of Test2 sucesses: " + count2);
	    System.err.println("Number of Test3 sucesses: " + count3);
	    System.err.println("Number of Test4 sucesses: " + count4);
	    System.err.println("Number of Test5 sucesses: " + count5);
	    System.err.println("Number of Test6 sucesses: " + count6);
	}
    }

    public static final boolean test1() {
	final region(:rank==2) rData = [0:7,0:99];
	final dist(:rank==2) dSrc = X10Util.distBlockStar(rData);
	
	final double[:rank==2] src = 
	    new double[dSrc] (point [i,j]) { return i + 0.01 * j; };
	final dist(:rank==2) dDst = 
	    (dist(:rank==2)) (([0:0,0:99]->place.places(0)) ||
			      ([1:1,0:99]->place.places(1)) ||
			      ([2:2,0:99]->place.places(2)) ||
			      ([3:7,0:99]->place.places(3)));

	final double[:rank==2] result = 
	    new MoveToDist().moveFieldToDist(src, dDst);

	return (result.distribution.equals(dDst) && checkEquals(src, result));
    }

    public static final boolean test2() {
	final region(:rank==2) rData = [0:7,0:4];
	final dist(:rank==2) dSrc = X10Util.distBlockStar(rData);
	
	final double[:rank==2] src = 
	    new double[dSrc] (point [i,j]) { return i + 0.01 * j; };
	final dist(:rank==2) dDst = 
	    (dist(:rank==2)) (([0:4,0:4]->place.places(0)) ||
			      ([5:5,0:4]->place.places(1)) ||
			      ([6:6,0:4]->place.places(2)) ||
			      ([7:7,0:4]->place.places(3)));

	final double[:rank==2] result = 
	    new MoveToDist().moveFieldToDist(src, dDst);
	return (result.distribution.equals(dDst) && checkEquals(src, result));
    }

    public static final boolean test3() {
	final region(:rank==2) rData = [0:7,0:4];
	final dist(:rank==2) dSrc = X10Util.distBlockStar(rData);
	
	final double[:rank==2] src = 
	    new double[dSrc] (point [i,j]) { return i + 0.01 * j; };
	final dist(:rank==2) dDst = 
	    (dist(:rank==2)) (([0:0,0:4]->place.places(0)) ||
			      ([1:3,0:4]->place.places(1)) ||
			      ([4:6,0:4]->place.places(2)) ||
			      ([7:7,0:4]->place.places(3)));

	final double[:rank==2] result = 
	    new MoveToDist().moveFieldToDist(src, dDst);
	return (result.distribution.equals(dDst) && checkEquals(src, result));
    }

    public static final boolean test4() {
	final region(:rank==2) rData = [0:7,0:4];
	final dist(:rank==2) dDst = X10Util.distBlockStar(rData);
	final dist(:rank==2) dSrc = 
	    (dist(:rank==2)) (([0:0,0:4]->place.places(0)) ||
			      ([1:1,0:4]->place.places(1)) ||
			      ([2:2,0:4]->place.places(2)) ||
			      ([3:7,0:4]->place.places(3)));
	
	final double[:rank==2] src = 
	    new double[dSrc] (point [i,j]) { return i + 0.01 * j; };

	final double[:rank==2] result = 
	    new MoveToDist().moveFieldToDist(src, dDst);

	return (result.distribution.equals(dDst) && checkEquals(src, result));
    }

    public static final boolean test5() {
	final region(:rank==2) rData = [0:7,0:4];
	final dist(:rank==2) dDst = X10Util.distBlockStar(rData);
	final dist(:rank==2) dSrc = 
	    (dist(:rank==2)) (([0:4,0:4]->place.places(0)) ||
			      ([5:5,0:4]->place.places(1)) ||
			      ([6:6,0:4]->place.places(2)) ||
			      ([7:7,0:4]->place.places(3)));
	
	final double[:rank==2] src = 
	    new double[dSrc] (point [i,j]) { return i + 0.01 * j; };

	final double[:rank==2] result = 
	    new MoveToDist().moveFieldToDist(src, dDst);
	return (result.distribution.equals(dDst) && checkEquals(src, result));
    }

    public static final boolean test6() {
	final region(:rank==2) rData = [0:7,0:4];
	final dist(:rank==2) dSrc = 
	    (dist(:rank==2)) (([0:0,0:4]->place.places(0)) ||
			      ([1:3,0:4]->place.places(1)) ||
			      ([4:6,0:4]->place.places(2)) ||
			      ([7:7,0:4]->place.places(3)));
	final dist(:rank==2) dDst = X10Util.distBlockStar(rData);
	
	final double[:rank==2] src = 
	    new double[dSrc] (point [i,j]) { return i + 0.01 * j; };

	final double[:rank==2] result = 
	    new MoveToDist().moveFieldToDist(src, dDst);
	return (result.distribution.equals(dDst) && checkEquals(src, result));
    }

    public static final boolean checkEquals(final double[:rank==2] d1,
					    final double[:rank==2] d2) {
	if (!d1.region.equals(d2.region)) {
	    return false;
	}

	final place pHere = here;
	final double[:rank==2] l1 = new double[d1.region->here];
	final double[:rank==2] l2 = new double[d2.region->here];

	finish ateach (point pt : d1) {
	    final double v = d1[pt];
	    async (pHere) {
		l1[pt] = v;
	    }
	}

	finish ateach (point pt : d2) {
	    final double v = d2[pt];
	    async (pHere) {
		l2[pt] = v;
	    }
	}
	return l1.valueEquals(l2);
    }

    public static void printMatrix(final double[:rank==2] m) {
	final region(:rank==1) r1 = X10Util.getRank(m.region, 0);
	final region(:rank==1) r2 = X10Util.getRank(m.region, 1);
	
	for (point [i] : r1) {
	    for (point [j] : r2) {
		finish async (m.distribution.get(i,j)) {
		    System.out.print(m[i,j] + " ");
		}
	    }
	    System.out.println();
	}
    }
}