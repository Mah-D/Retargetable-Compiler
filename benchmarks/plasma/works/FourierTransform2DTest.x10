public class FourierTransform2DTest {
    public static void main(String[] args) {
	FourierTransform2DTest test = new FourierTransform2DTest();
	
	int[] x = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	int[] y = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

	for (point [i] : [0 : x.length - 1]) {
	    if (test.mixupTest(x[i], y[i])) { 
		System.out.println("Mixup Success"); 
	    } else {
		System.out.println("Mixup Failed");
	    }
	    if (test.sctTest(x[i], y[i])) { 
		System.out.println("sct Success"); 
	    } else {
		System.out.println("sct Failed");
	    }
	    if (test.bitReverseXTest(x[i], y[i])) { 
		System.out.println("bitReverseX Success"); 
	    } else {
		System.out.println("bitReverseX Failed");
	    }
	    if (test.bitReverseYTest(x[i], y[i])) { 
		System.out.println("bitReverseY Success"); 
	    } else {
		System.out.println("bitReverseY Failed");
	    }
	    if (test.scrambleXTest(x[i], y[i])) { 
		System.out.println("scrambleX Success"); 
	    } else {
		System.out.println("scrambleX Failed");
	    }
	    if (test.unscrambleXTest(x[i], y[i])) { 
		System.out.println("unscrambleX Success"); 
	    } else {
		System.out.println("unscrambleX Failed");
	    }
	    if (test.scrambleYTest(x[i], y[i])) { 
		System.out.println("scrambleY Success"); 
	    } else {
		System.out.println("scrambleY Failed");
	    }
	    if (test.unscrambleYTest(x[i], y[i])) { 
		System.out.println("unscrambleY Success"); 
	    } else {
		System.out.println("unscrambleY Failed");
	    }
	    if (test.transformXTest(x[i], y[i])) { 
		System.out.println("transformX Success"); 
	    } else {
		System.out.println("transformX Failed");
	    }
	    if (test.transformYTest(x[i], y[i])) { 
		System.out.println("transformY Success"); 
	    } else {
		System.out.println("transformY Failed");
	    }
	    if (test.transformInvXTest(x[i], y[i])) { 
		System.out.println("transformInvX Success"); 
	    } else {
		System.out.println("transformInvX Failed");
	    }
	    if (test.transformInvYTest(x[i], y[i])) { 
		System.out.println("transformInvY Success"); 
	    } else {
		System.out.println("transformInvY Failed");
	    }
	    if (test.transformTest(x[i], y[i])) { 
		System.out.println("transform Success"); 
	    } else {
		System.out.println("transform Failed");
	    }
	    if (test.transformInvTest(x[i], y[i])) { 
		System.out.println("transformInv Success"); 
	    } else {
		System.out.println("transformInv Failed");
	    }
	    System.out.println();
	}
    }
    
    public FourierTransform2DTest() { }

    public boolean mixupTest(int x, int y) {

	version15.FFT rFFT = new version15.FFT(x, y);
	FourierTransform2D FFT = new FourierTransform2D(y, x);

	boolean equal = true;
	for (point [i] : FFT.tableBitReverse) {
	    double d1 = FFT.tableBitReverse[i];
	    double d2 = rFFT.mixup[i];
	    if (!eq(d1, d2)) {
		System.out.println(d1 + " != " + d2);
		equal = false;
	    }
	}
	return equal;
    }

    public boolean sctTest(int x, int y) {
	version15.FFT rFFT = new version15.FFT(x, y);
	FourierTransform2D FFT = new FourierTransform2D(y, x);

	boolean equal = true;
	for (point [i] : FFT.tableSineCosine) {
	    Complex d1 = FFT.tableSineCosine[i];
	    version15.Complex d2 = rFFT.sct[i];
	    if (!eq(d1, d2)) {
		System.out.println(d1 + " != " + d2);
		equal = false;
	    }
	}
	return equal;
    }

    public boolean bitReverseXTest(int x, int y) {
	version15.FFT rFFT = new version15.FFT(x, y);
	FourierTransform2D FFT = new FourierTransform2D(y, x);

	region(:rank==1) r1 = [0 : (1 << (x - 1)) - 1];
	region(:rank==1) r2 = [0 : (1 << y) - 1];
	region(:rank==2) rIn1 = [r1, r2];
	region(:rank==2) rIn2 = [r2, r1];
	region(:rank==3) rRand = [r1, r2, 0:1];
	dist(:rank==2) dIn1 = X10Util.distStarBlock(rIn1);
	dist(:rank==2) dIn2 = X10Util.distBlockStar(rIn2);

	final Random r = new Random();
	final double value[.] rr = new double value[rRand] (point [i,j,k]) {
	    if (k == 0) {
		return i * r.nextNormal();
	    } else {
		return j * r.nextNormal();
	    }
	};

	final version15.Complex[:rank==2] in1 =  
	    new version15.Complex[dIn1] (point [i,j]) {
	    return new version15.Complex(rr[i,j,0], rr[i,j,1]);
	};
	final Complex[:rank==2] in2 = new Complex[dIn2] (point [i,j]) {
	    return complex(in1[j,i]);
	};

	rFFT.pFFT2BitReverseX(in1);
	FFT.bitReverse(in2, 1);

	final place p = here;
	final boolean[.] equal = 
	    new boolean[[0:0]->here] (point pt) { return true; };
	for (point [i] : r1) {
	    for (point [j] : r2) {
		finish async(dIn1.get(i,j)) {
		    final version15.Complex c1 = in1[i,j];
		    final Complex c2 = in2[j,i];
		    if (!eq(c2,c1)) {
			finish async (p) { 
			    System.out.println([j,i] + " : " + c1 + 
					       " != " + c2);
			    equal[0] = false; 
			}
		    }
		}
	    }
	}
	return equal[0];
    }    

    public boolean bitReverseYTest(int x, int y) {
	version15.FFT rFFT = new version15.FFT(x, y);
	FourierTransform2D FFT = new FourierTransform2D(y, x);

	region(:rank==1) r1 = [0 : (1 << y) - 1];
	region(:rank==1) r2 = [0 : (1 << (x - 1)) - 1];
	region(:rank==2) rIn1 = [r1, r2];
	region(:rank==2) rIn2 = [r2, r1];
	region(:rank==3) rRand = [r1, r2, 0:1];
	dist(:rank==2) dIn1 = X10Util.distStarBlock(rIn1);
	dist(:rank==2) dIn2 = X10Util.distBlockStar(rIn2);

	final Random r = new Random();
	final double value[.] rr = new double value[rRand] (point [i,j,k]) {
	    if (k == 0) {
		return i * r.nextNormal();
	    } else {
		return j * r.nextNormal();
	    }
	};

	final version15.Complex[:rank==2] in1 =  
	    new version15.Complex[dIn1] (point [i,j]) {
	    return new version15.Complex(rr[i,j,0], rr[i,j,1]);
	};
	final Complex[:rank==2] in2 = new Complex[dIn2] (point [i,j]) {
	    return complex(in1[j,i]);
	};

	rFFT.pFFT2BitReverseY(in1);
	FFT.bitReverse(in2, 0);

	final place p = here;
	final boolean[.] equal = 
	    new boolean[[0:0]->here] (point pt) { return true; };
	for (point [i] : r1) {
	    for (point [j] : r2) {
		finish async(dIn1.get(i,j)) {
		    final version15.Complex c1 = in1[i,j];
		    final Complex c2 = in2[j,i];
		    if (!eq(c2,c1)) {
			finish async (p) { 
			    System.out.println([j,i] + " : " + c1 + 
					       " != " + c2);
			    equal[0] = false; 
			}
		    }
		}
	    }
	}
	return equal[0];
    }

    public boolean scrambleXTest(int x, int y) {
	version15.FFT rFFT = new version15.FFT(x, y);
	FourierTransform2D FFT = new FourierTransform2D(y, x);

	region(:rank==1) r1 = [0 : (1 << (x - 1)) - 1];
	region(:rank==1) r2 = [0 : (1 << y) - 1];
	region(:rank==2) rIn1 = [r1, r2];
	region(:rank==2) rIn2 = [r2, r1];
	region(:rank==3) rRand = [r1, r2, 0:1];
	dist(:rank==2) dIn1 = X10Util.distStarBlock(rIn1);
	dist(:rank==2) dIn2 = X10Util.distBlockStar(rIn2);

	final Random r = new Random();
	final double value[.] rr = new double value[rRand] (point [i,j,k]) {
	    if (k == 0) {
		return i * r.nextNormal();
	    } else {
		return j * r.nextNormal();
	    }
	};

	final version15.Complex[:rank==2] in1 =  
	    new version15.Complex[dIn1] (point [i,j]) {
	    return new version15.Complex(rr[i,j,0], rr[i,j,1]);
	};
	final Complex[:rank==2] in2 = new Complex[dIn2] (point [i,j]) {
	    return complex(in1[j,i]);
	};

	rFFT.pFFT2ScrambleXX(in1);
	FFT.scrambleX(in2);

	final place p = here;
	final boolean[.] equal = 
	    new boolean[[0:0]->here] (point pt) { return true; };
	for (point [i] : r1) {
	    for (point [j] : r2) {
		finish async(dIn1.get(i,j)) {
		    final version15.Complex c1 = in1[i,j];
		    final Complex c2 = in2[j,i];
		    if (!eq(c2,c1)) {
			finish async (p) { 
			    System.out.println([j,i] + " : " + c1 + 
					       " != " + c2);
			    equal[0] = false; 
			}
		    }
		}
	    }
	}
	return equal[0];
    }

    public boolean unscrambleXTest(int x, int y) {
	version15.FFT rFFT = new version15.FFT(x, y);
	FourierTransform2D FFT = new FourierTransform2D(y, x);

	region(:rank==1) r1 = [0 : (1 << (x - 1)) - 1];
	region(:rank==1) r2 = [0 : (1 << y) - 1];
	region(:rank==2) rIn1 = [r1, r2];
	region(:rank==2) rIn2 = [r2, r1];
	region(:rank==3) rRand = [r1, r2, 0:1];
	dist(:rank==2) dIn1 = X10Util.distStarBlock(rIn1);
	dist(:rank==2) dIn2 = X10Util.distBlockStar(rIn2);

	final Random r = new Random();
	final double value[.] rr = new double value[rRand] (point [i,j,k]) {
	    if (k == 0) {
		return i * r.nextNormal();
	    } else {
		return j * r.nextNormal();
	    }
	};

	final version15.Complex[:rank==2] in1 =  
	    new version15.Complex[dIn1] (point [i,j]) {
	    return new version15.Complex(rr[i,j,0], rr[i,j,1]);
	};
	final Complex[:rank==2] in2 = new Complex[dIn2] (point [i,j]) {
	    return complex(in1[j,i]);
	};

	rFFT.pFFT2UnscrambleXX(in1);
	FFT.unscrambleX(in2);

	final place p = here;
	final boolean[.] equal = 
	    new boolean[[0:0]->here] (point pt) { return true; };
	for (point [i] : r1) {
	    for (point [j] : r2) {
		finish async(dIn1.get(i,j)) {
		    final version15.Complex c1 = in1[i,j];
		    final Complex c2 = in2[j,i];
		    if (!eq(c2,c1)) {
			finish async (p) { 
			    System.out.println([j,i] + " : " + c1 + 
					       " != " + c2);
			    equal[0] = false; }
		    }
		}
	    }
	}
	return equal[0];
    }

    public boolean scrambleYTest(int x, int y) {
	version15.FFT rFFT = new version15.FFT(x, y);
	FourierTransform2D FFT = new FourierTransform2D(y, x);

	region(:rank==1) r1 = [0 : (1 << y) - 1];
	region(:rank==1) r2 = [0 : (1 << (x - 1)) - 1];
	region(:rank==2) rIn1 = [r1, r2];
	region(:rank==2) rIn2 = [r2, r1];
	region(:rank==3) rRand = [r1, r2, 0:1];
	dist(:rank==2) dIn1 = X10Util.distStarBlock(rIn1);
	dist(:rank==2) dIn2 = X10Util.distBlockStar(rIn2);

	final Random r = new Random();
	final double value[.] rr = new double value[rRand] (point [i,j,k]) {
	    if (k == 0) {
		return i * r.nextNormal();
	    } else {
		return j * r.nextNormal();
	    }
	};

	final version15.Complex[:rank==2] in1 =  
	    new version15.Complex[dIn1] (point [i,j]) {
	    return new version15.Complex(rr[i,j,0], rr[i,j,1]);
	};
	final Complex[:rank==2] in2 = new Complex[dIn2] (point [i,j]) {
	    return complex(in1[j,i]);
	};

	rFFT.pFFT2ScrambleXY(in1);
	FFT.scrambleY(in2);

	final place p = here;
	final boolean[.] equal = 
	    new boolean[[0:0]->here] (point pt) { return true; };
	for (point [i] : r1) {
	    for (point [j] : r2) {
		finish async(dIn1.get(i,j)) {
		    final version15.Complex c1 = in1[i,j];
		    final Complex c2 = in2[j,i];
		    if (!eq(c2,c1)) {
			finish async (p) { 
			    System.out.println([j,i] + " : " + c1 + 
					       " != " + c2);
			    equal[0] = false; 
			}
		    }
		}
	    }
	}
	return equal[0];
    }

    public boolean unscrambleYTest(int x, int y) {
	version15.FFT rFFT = new version15.FFT(x, y);
	FourierTransform2D FFT = new FourierTransform2D(y, x);

	region(:rank==1) r1 = [0 : (1 << y) - 1];
	region(:rank==1) r2 = [0 : (1 << (x - 1)) - 1];
	region(:rank==2) rIn1 = [r1, r2];
	region(:rank==2) rIn2 = [r2, r1];
	region(:rank==3) rRand = [r1, r2, 0:1];
	dist(:rank==2) dIn1 = X10Util.distStarBlock(rIn1);
	dist(:rank==2) dIn2 = X10Util.distBlockStar(rIn2);

	final Random r = new Random();
	final double value[.] rr = new double value[rRand] (point [i,j,k]) {
	    if (k == 0) {
		return i * r.nextNormal();
	    } else {
		return j * r.nextNormal();
	    }
	};

	final version15.Complex[:rank==2] in1 =  
	    new version15.Complex[dIn1] (point [i,j]) {
	    return new version15.Complex(rr[i,j,0], rr[i,j,1]);
	};
	final Complex[:rank==2] in2 = new Complex[dIn2] (point [i,j]) {
	    return complex(in1[j,i]);
	};

	rFFT.pFFT2UnscrambleXY(in1);
	FFT.unscrambleY(in2);

	final place p = here;
	final boolean[.] equal = 
	    new boolean[[0:0]->here] (point pt) { return true; };
	for (point [i] : r1) {
	    for (point [j] : r2) {
		finish async(dIn1.get(i,j)) {
		    final version15.Complex c1 = in1[i,j];
		    final Complex c2 = in2[j,i];
		    if (!eq(c2,c1)) {
			finish async (p) { 
			    System.out.println([j,i] + " : " + c1 + 
					       " != " + c2);
			    equal[0] = false; }
		    }
		}
	    }
	}
	return equal[0];
    }    

    public boolean transformXTest(int x, int y) {
	version15.FFT rFFT = new version15.FFT(x, y);
	FourierTransform2D FFT = new FourierTransform2D(y, x);

	region(:rank==1) r1 = [0 : (1 << (x - 1)) - 1];
	region(:rank==1) r2 = [0 : (1 << y) - 1];
	region(:rank==2) rIn1 = [r1, r2];
	region(:rank==2) rIn2 = [r2, r1];
	region(:rank==3) rRand = [r1, r2, 0:1];
	dist(:rank==2) dIn1 = X10Util.distStarBlock(rIn1);
	dist(:rank==2) dIn2 = X10Util.distBlockStar(rIn2);

	final Random r = new Random();
	final double value[.] rr = new double value[rRand] (point [i,j,k]) {
	    if (k == 0) {
		return i * r.nextNormal();
	    } else {
		return j * r.nextNormal();
	    }
	};

	final version15.Complex[:rank==2] in1 =  
	    new version15.Complex[dIn1] (point [i,j]) {
	    return new version15.Complex(rr[i,j,0], rr[i,j,1]);
	};
	final Complex[:rank==2] in2 = new Complex[dIn2] (point [i,j]) {
	    return complex(in1[j,i]);
	};

	rFFT.pFFT2TransformX(in1, false);
	FFT.transformRank(in2, 1, false);

	final place p = here;
	final boolean[.] equal = 
	    new boolean[[0:0]->here] (point pt) { return true; };
	for (point [i] : r1) {
	    for (point [j] : r2) {
		finish async(dIn1.get(i,j)) {
		    final version15.Complex c1 = in1[i,j];
		    final Complex c2 = in2[j,i];
		    if (!eq(c2,c1)) {
			finish async (p) { 
			    System.out.println([j,i] + " : " + c1 + 
					       " != " + c2);
			    equal[0] = false; 
			}
		    }
		}
	    }
	}
	return equal[0];
    }    

    public boolean transformInvXTest(int x, int y) {
	version15.FFT rFFT = new version15.FFT(x, y);
	FourierTransform2D FFT = new FourierTransform2D(y, x);

	region(:rank==1) r1 = [0 : (1 << (x - 1)) - 1];
	region(:rank==1) r2 = [0 : (1 << y) - 1];
	region(:rank==2) rIn1 = [r1, r2];
	region(:rank==2) rIn2 = [r2, r1];
	region(:rank==3) rRand = [r1, r2, 0:1];
	dist(:rank==2) dIn1 = X10Util.distStarBlock(rIn1);
	dist(:rank==2) dIn2 = X10Util.distBlockStar(rIn2);

	final Random r = new Random();
	final double value[.] rr = new double value[rRand] (point [i,j,k]) {
	    if (k == 0) {
		return i * r.nextNormal();
	    } else {
		return j * r.nextNormal();
	    }
	};

	final version15.Complex[:rank==2] in1 =  
	    new version15.Complex[dIn1] (point [i,j]) {
	    return new version15.Complex(rr[i,j,0], rr[i,j,1]);
	};
	final Complex[:rank==2] in2 = new Complex[dIn2] (point [i,j]) {
	    return complex(in1[j,i]);
	};

	rFFT.pFFT2TransformX(in1, true);
	FFT.transformRank(in2, 1, true);

	final place p = here;
	final boolean[.] equal = 
	    new boolean[[0:0]->here] (point pt) { return true; };
	for (point [i] : r1) {
	    for (point [j] : r2) {
		finish async(dIn1.get(i,j)) {
		    final version15.Complex c1 = in1[i,j];
		    final Complex c2 = in2[j,i];
		    if (!eq(c2,c1)) {
			finish async (p) { 
			    System.out.println([j,i] + " : " + c1 + 
					       " != " + c2);
			    equal[0] = false; 
			}
		    }
		}
	    }
	}
	return equal[0];
    }

    public boolean transformYTest(int x, int y) {
	version15.FFT rFFT = new version15.FFT(x, y);
	FourierTransform2D FFT = new FourierTransform2D(y, x);

	region(:rank==1) r1 = [0 : (1 << y) - 1];
	region(:rank==1) r2 = [0 : (1 << (x - 1)) - 1];
	region(:rank==2) rIn1 = [r1, r2];
	region(:rank==2) rIn2 = [r2, r1];
	region(:rank==3) rRand = [r1, r2, 0:1];
	dist(:rank==2) dIn1 = X10Util.distStarBlock(rIn1);
	dist(:rank==2) dIn2 = X10Util.distBlockStar(rIn2);

	final Random r = new Random();
	final double value[.] rr = new double value[rRand] (point [i,j,k]) {
	    if (k == 0) {
		return i * r.nextNormal();
	    } else {
		return j * r.nextNormal();
	    }
	};

	final version15.Complex[:rank==2] in1 =  
	    new version15.Complex[dIn1] (point [i,j]) {
	    return new version15.Complex(rr[i,j,0], rr[i,j,1]);
	};
	final Complex[:rank==2] in2 = new Complex[dIn2] (point [i,j]) {
	    return complex(in1[j,i]);
	};

	rFFT.pFFT2TransformY(in1, false);
	FFT.transformRank(in2, 0, false);

	final place p = here;
	final boolean[.] equal = 
	    new boolean[[0:0]->here] (point pt) { return true; };
	for (point [i] : r1) {
	    for (point [j] : r2) {
		finish async(dIn1.get(i,j)) {
		    final version15.Complex c1 = in1[i,j];
		    final Complex c2 = in2[j,i];
		    if (!eq(c2,c1)) {
			finish async (p) { 
			    System.out.println([j,i] + " : " + c1 + 
					       " != " + c2);
			    equal[0] = false; }
		    }
		}
	    }
	}
	return equal[0];
    }

    public boolean transformInvYTest(int x, int y) {
	version15.FFT rFFT = new version15.FFT(x, y);
	FourierTransform2D FFT = new FourierTransform2D(y, x);

	region(:rank==1) r1 = [0 : (1 << y) - 1];
	region(:rank==1) r2 = [0 : (1 << (x - 1)) - 1];
	region(:rank==2) rIn1 = [r1, r2];
	region(:rank==2) rIn2 = [r2, r1];
	region(:rank==3) rRand = [r1, r2, 0:1];
	dist(:rank==2) dIn1 = X10Util.distStarBlock(rIn1);
	dist(:rank==2) dIn2 = X10Util.distBlockStar(rIn2);

	final Random r = new Random();
	final double value[.] rr = new double value[rRand] (point [i,j,k]) {
	    if (k == 0) {
		return i * r.nextNormal();
	    } else {
		return j * r.nextNormal();
	    }
	};

	final version15.Complex[:rank==2] in1 =  
	    new version15.Complex[dIn1] (point [i,j]) {
	    return new version15.Complex(rr[i,j,0], rr[i,j,1]);
	};
	final Complex[:rank==2] in2 = new Complex[dIn2] (point [i,j]) {
	    return complex(in1[j,i]);
	};

	rFFT.pFFT2TransformY(in1, true);
	FFT.transformRank(in2, 0, true);

	final place p = here;
	final boolean[.] equal = 
	    new boolean[[0:0]->here] (point pt) { return true; };
	for (point [i] : r1) {
	    for (point [j] : r2) {
		finish async(dIn1.get(i,j)) {
		    final version15.Complex c1 = in1[i,j];
		    final Complex c2 = in2[j,i];
		    if (!eq(c2,c1)) {
			finish async (p) { 
			    System.out.println([j,i] + " : " + c1 + 
					       " != " + c2);
			    equal[0] = false; }
		    }
		}
	    }
	}
	return equal[0];
    }

    public boolean transformTest(int x, int y) {
	version15.FFT rFFT = new version15.FFT(x, y);
	FourierTransform2D FFT = new FourierTransform2D(y, x);

	region(:rank==1) r1 = [0 : (1 << y) - 1];
	region(:rank==1) r2 = [0 : (1 << (x - 1)) - 1];
	region(:rank==2) rIn1 = [r1, r2];
	region(:rank==2) rIn2 = [r2, r1];
	region(:rank==3) rRand = [r1, r2, 0:1];
	dist(:rank==2) dIn1 = X10Util.distStarBlock(rIn1);
	dist(:rank==2) dIn2 = X10Util.distBlockStar(rIn2);

	final Random r = new Random();
	final double value[.] rr = new double value[rRand] (point [i,j,k]) {
	    if (k == 0) {
		return i * r.nextNormal();
	    } else {
		return j * r.nextNormal();
	    }
	};

	final version15.Complex[:rank==2] in1 =  
	    new version15.Complex[dIn1] (point [i,j]) {
	    return new version15.Complex(rr[i,j,0], rr[i,j,1]);
	};
	final Complex[:rank==2] in2 = new Complex[dIn2] (point [i,j]) {
	    return complex(in1[j,i]);
	};

	final version15.Complex[.] res1 = rFFT.fourierTransform(in1);
	final Complex[:rank==2] res2 = FFT.transform(in2);

	final place p = here;
	final boolean[.] equal = 
	    new boolean[[0:0]->here] (point pt) { return true; };
	for (point [i] : r2) {
	    for (point [j] : r1) {
		finish async(res1.distribution.get(i,j)) {
		    final version15.Complex c1 = res1[i,j];
		    final Complex c2 = res2[j,i];
		    if (!eq(c2,c1)) {
			finish async (p) { 
			    System.out.println([j,i] + " : " + " delta: " + new Complex(Math.abs(c1.getReal() - c2.getReal()), Math.abs(c1.getImag() - c2.getImag())) + " " + c1 + 
					       " != " + c2 );
			    equal[0] = false; }
		    }
		}
	    }
	}
	return equal[0];
    }   

    public boolean transformInvTest(int x, int y) {
	version15.FFT rFFT = new version15.FFT(x, y);
	FourierTransform2D FFT = new FourierTransform2D(y, x);

	region(:rank==1) r2 = [0 : (1 << y) - 1];
	region(:rank==1) r1 = [0 : (1 << (x - 1)) - 1];
	region(:rank==2) rIn1 = [r1, r2];
	region(:rank==2) rIn2 = [r2, r1];
	region(:rank==3) rRand = [r1, r2, 0:1];
	dist(:rank==2) dIn1 = X10Util.distStarBlock(rIn1);
	dist(:rank==2) dIn2 = X10Util.distBlockStar(rIn2);

	final Random r = new Random();
	final double value[.] rr = new double value[rRand] (point [i,j,k]) {
	    if (k == 0) {
		return i * r.nextNormal();
	    } else {
		return j * r.nextNormal();
	    }
	};

	final version15.Complex[:rank==2] in1 =  
	    new version15.Complex[dIn1] (point [i,j]) {
	    return new version15.Complex(rr[i,j,0], rr[i,j,1]);
	};
	final Complex[:rank==2] in2 = new Complex[dIn2] (point [i,j]) {
	    return complex(in1[j,i]);
	};

	final version15.Complex[.] res1 = rFFT.inverseFourierTransform(in1);
	final Complex[:rank==2] res2 = FFT.inverseTransform(in2);

	final place p = here;
	final boolean[.] equal = 
	    new boolean[[0:0]->here] (point pt) { return true; };
	for (point [i] : r2) {
	    for (point [j] : r1) {
		finish async(res1.distribution.get(i,j)) {
		    final version15.Complex c1 = res1[i,j];
		    final Complex c2 = res2[j,i];
		    if (!eq(c2,c1)) {
			finish async (p) { 
			    System.out.println([j,i] + " : " + " delta: " + new Complex(Math.abs(c1.getReal() - c2.getReal()), Math.abs(c1.getImag() - c2.getImag())) + " " + c1 + 
					       " != " + c2 );
			    equal[0] = false; }
		    }
		}
	    }
	}
	return equal[0];
    }

    public boolean eq(double d1, double d2) {
	return (Math.abs(d1 - d2) < 9.9999999999e-12);
    }

    public boolean eq(Complex c1, version15.Complex c2) {
	return eq(c1.getReal(), c2.getReal()) && eq(c1.getImag(), c2.getImag());
    }

    public Complex complex(version15.Complex c) {
	return new Complex(c.getReal(), c.getImag());
    }
}