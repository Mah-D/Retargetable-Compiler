
// Check for possible race conditions

public value FourierTransform2D {
    // Maximum number of bits in either dimension
    public final int maxBits;

    // Number of bits of the length in each dimension
    public final int nBits1;
    public final int nBits2;

    // Length of each dimension
    public final int length1;
    public final int length2;

    // Inverse of N (2 * length1 * length2)
    public final double invN;

    public final int value[:rank==1] tableBitReverse;
    public final Complex value[:rank==1] tableSineCosine;

    public FourierTransform2D(final int nBits1, final int nBits2) {
	this.nBits1 = nBits1;
	this.nBits2 = nBits2;
	maxBits = X10Util.maxInt(nBits1, nBits2 - 1);

	final int len1 = 1 << nBits1;
	final int len2 = 1 << nBits2;

	length1 = len1;
	length2 = len2;

	invN = 1.0 / (2 * len1 * len2);

	tableBitReverse = initBitReverse(nBits1, nBits2);
	tableSineCosine = initSineCosine(len1, len2);	
    }

    /**
     *
     */
    public Complex[:rank==2] transformC(final Complex[:rank==2] f) {
	scrambleY(f);
	bitReverse(f, 0);
	transformRank(f, 0, false);

	final Complex[:rank==2] g = ArrayUtil.transpose(f);

	scrambleX(g);
	bitReverse(g, 1);
	transformRank(g, 1, false);

	return g;
    }

    /**
     *
     */
    public Complex[:rank==2] transformD(final double[:rank==2] f) {
	return transformC(ArrayUtil.doubleToComplex(f));
    }

    /**
     *
     */
    public Complex[:rank==2] inverseTransformC(final Complex[:rank==2] f) {
	bitReverse(f, 1);
	transformRank(f, 1, true);
	unscrambleX(f);

	final Complex[:rank==2] g = ArrayUtil.transpose(f);

	bitReverse(g, 0);
	transformRank(g, 0, true);
	unscrambleY(g);
	
	return g;
    } 

    /**
     *
     */
    public Complex[:rank==2] inverseTransformD(final double[:rank==2] f) {
	return inverseTransformC(ArrayUtil.doubleToComplex(f));
    }

    /**
     *  
     */
    public int value[:rank==1] initBitReverse(final int nBits1, final int nBits2) {
	final int maxBits = X10Util.maxInt(nBits2 - 1, nBits1);
	
	final region(:rank==1) r = [0 : (1 << maxBits) - 1];
	return (int value[:rank==1]) new int value[r] (point(:rank==1) i) {
	    final int i0 = i[0];
	    final int i1 = (((i0 & 0x0000FFFF) << 16) | 
			    ((i0 >> 16) & 0x0000FFFF));
	    final int i2 = (((i1 & 0x00FF00FF) << 8) | 
			    ((i1 >> 8) & 0x00FF00FF));
	    final int i3 = (((i2 & 0x0F0F0F0F) << 4) | 
			    ((i2 >> 4) & 0x0F0F0F0F));
	    final int i4 = (((i3 & 0x33333333) << 2) | 
			    ((i3 >> 2) & 0x33333333));
	    final int i5 = (((i4 & 0x55555555) << 1) | 
			    ((i4 >> 1) & 0x55555555));
	    return i5 >>> (java.lang.Integer.SIZE - maxBits);	   
	};
    }

    /**
     *
     */
    public Complex value[:rank==1] initSineCosine(final int length1, final int length2) {
	final int maxLength = X10Util.maxInt(length1, length2);
	final double PI2 = 6.28318530717959;
	final double k = PI2 / maxLength;

	final region(:rank==1) r = [0 : (maxLength / 2) - 1];
	return (Complex value[:rank==1]) 
	    new Complex value[r] (point(:rank==1) i) {
	        final double theta = k * i[0];
	        return new Complex(Math.cos(theta), -Math.sin(theta)); 
	    };
    }

    /**
     *  For the FFT algorithm, the elements must be rearranged so that 
     *  that the recombination process occurs correctly.
     */
    public void bitReverse(final Complex[:rank==2] f, final int rnk) {
	final int nBits = (rnk == 0) ? nBits1 : nBits2 - 1;
	final int r1Length = (rnk == 0) ? length1 : length2 / 2;
	final int nrx = (1 << nBits) / r1Length; 
	finish ateach (point(:rank==1) pl: dist.UNIQUE) {
	    final dist(:rank==2) dF = f.distribution;
	    final region(:rank==1) rLocal1 = X10Util.getLRank2D(dF, 0);
	    foreach (point(:rank==1) [j1] : [0 : r1Length - 1]) {
		final int j2 = tableBitReverse[j1] >> (maxBits - nBits);
		if (j1 < j2) {
		    finish foreach (point(:rank==1) [i] : rLocal1) {
			final Complex temp = f[i,j1];
			f[i,j1] = f[i,j2];
			f[i,j2] = temp;
		    }
		}
	    }
	}	
    }

    /**
     * Place correct and computationally correct
     */
    public void scrambleX(final Complex[:rank==2] f) {
	final int nxh = length2 / 2;
	final int nxhh = nxh / 2;
	final int kmr = X10Util.maxInt(length1, length2) / length2;
	finish ateach (point(:rank==1) pl: dist.UNIQUE) {
	    final dist(:rank==2) dF = f.distribution;
	    final region(:rank==2) rLocal = X10Util.get2DLRegion(dF);
	    final region(:rank==1) rLocal1 = X10Util.getRank2D(rLocal, 0);

	    foreach (point(:rank==2) pt: [rLocal1,nxhh:nxhh]) {
		f[pt] = (f[pt].getConjg()).multS(2);
                final point(:rank==2) pt0 = pt * [1,0];
		final Complex t2 = f[pt0];
		final double t2Real = t2.getReal();
		final double t2Imag = t2.getImag();
		f[pt0] = new Complex(t2Real + t2Imag, t2Real - t2Imag);
	    }

	    for (point(:rank==1) [j1] : [1 : nxhh - 1]) {
		final int j2 = nxh - j1;
		final Complex t0 = tableSineCosine[kmr * j1];
		final Complex t1 = new Complex(t0.getImag(), t0.getReal());
		foreach (point(:rank==1) [i] : rLocal1) {
		    final Complex t = f[i,j2].getConjg();
		    final Complex s = f[i,j1].add(t);
		    final Complex t3 = (f[i,j1].sub(t)).mult(t1);
		    f[i,j1] = s.add(t3);
		    f[i,j2] = (s.sub(t3)).getConjg();
		} 
	    }
	}
    }

    /**
     *
     */
    public void unscrambleX(final Complex[:rank==2] f) {
	final int nxh = length2 / 2;
	final int nxhh = length2 / 4;
	final int kmr = X10Util.maxInt(length1, length2) / length2;
	finish ateach (point(:rank==1) pl: dist.UNIQUE) {
	    final dist(:rank==2) dF = f.distribution;
	    final region(:rank==1) rLocal1 = X10Util.getLRank2D(dF, 0);
	    foreach (point(:rank==1) [j1] : [1 : nxhh - 1]) {
		final int j2 = nxh - j1;
		final Complex t0 = tableSineCosine[kmr * j1];
		final Complex t1 = new Complex(t0.getImag(), -t0.getReal());
		foreach (point(:rank==1) [i] : rLocal1) {
		    final Complex t = f[i,j2].getConjg();
		    final Complex s = f[i,j1].add(t);
		    final Complex t2 = (f[i,j1].sub(t)).mult(t1);
		    f[i,j1] = (s.add(t2)).multS(invN);
		    f[i,j2] = ((s.sub(t2)).getConjg()).multS(invN);	    
		}
	    }

	    foreach (point(:rank==2) pt: [rLocal1, nxhh:nxhh]) {
                final point(:rank==2) pt0 = pt * [1,0];
		final Complex t1 = f[pt0];
		final Complex t2 = f[pt];

		final double t1Real = t1.getReal();
		final double t1Imag = t1.getImag();
		final Complex t3 = new Complex(t1Real + t1Imag, 
					       t1Real - t1Imag);
		f[pt]  = (t2.getConjg()).multS(2 * invN);
		f[pt0] = t3.multS(2 * invN);
	    }
	}
    }

    /**
     *
     */
    public void scrambleY(final Complex[:rank==2] f) {
	finish async (place.FIRST_PLACE) {
	    foreach (point(:rank==1) [j1] : [1 : (length1 / 2) - 1]) {
		final int j2 = length1 - j1;
		final Complex t1 = f[0,j2];
		final Complex t2 = f[0,j1];
		final Complex s = new Complex(t1.getImag(), t1.getReal());
		f[0,j2] = (t2.sub(s)).getConjg();
		f[0,j1] = t2.add(s);
	    }
	}
    }

    /**
     *
     */
    public void unscrambleY(final Complex[:rank==2] f) {
	finish async (place.FIRST_PLACE) {
	    foreach (point(:rank==1) [j1] : [1 : (length1 / 2) - 1]) {
		final int j2 = length1 - j1;
		final Complex s = f[0,j2];
		final Complex t = f[0,j1];
		final Complex t1 = t.add(s);
		final Complex t2 = t.sub(s);
		f[0,j2] = (new Complex(t1.getImag(), t2.getReal())).multS(0.5);
		f[0,j1] = (new Complex(t1.getReal(), t2.getImag())).multS(0.5);
	    }
	}
    }

    /**
     *
     */
    public void transformRank(final Complex[:rank==2] f, 
			      final int rnk,
			      final boolean inverse) {
	// TODO: recheck dimensions
	final int nxy = X10Util.maxInt(length1, length2);
	final int nxh = length2 / 2;
	final int nyh = length1 / 2;
	final int nxhh = length2 / 4;
	final int bits = (rnk == 0) ? nBits1 : nBits2 - 1;
	final int r = nxy / ((rnk == 0) ? length1 : nxh);

	for (point(:rank==1) exponent: [0 : bits - 1]) {
	    final int stride = 1 << exponent[0];
	    final int width = 2 * stride;

	    // TODO: rename
	    final int km = ((rnk == 0) ? nyh : nxhh) / stride;
	    final int kmr = km * r;
	    finish ateach (point(:rank==1) pl: dist.UNIQUE) {
		for (point(:rank==1) [k] : [0 : km - 1]) {
		    final int lb = width * k;
		    final int mb = lb + stride;
		    finish foreach (point(:rank==1) [j] : [0 : stride - 1]) {
			final int j1 = j + lb;
			final int j2 = j + mb;
			final Complex s = ((inverse) ? 
					   tableSineCosine[kmr * j] : 
					   tableSineCosine[kmr * j].getConjg());

			final dist(:rank==2) dF = f.distribution;
			final region(:rank==1) rLocal1 =
			    X10Util.getLRank2D(dF, 0);
			foreach (point(:rank==1) [i] : rLocal1) {
			    final Complex tmp1 = f[i,j1];
			    final Complex tmp2 = s.mult(f[i,j2]);
			    f[i,j2] = tmp1.sub(tmp2);
			    f[i,j1] = tmp1.add(tmp2);
			}
		    }
		}
	    }
	}
    }
    
    public String toString() {
	return "FourierTransform: xbits = " + nBits1 + " ybits = " + nBits2;
    }
}
