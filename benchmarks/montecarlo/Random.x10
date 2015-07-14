/**
 *  Adapted from openjdk implementation of Random.java to fit our subset of
 *  X10.  Only implementing the methods we need.  Removing all synchronization
 *  mechanisms.  Don't use with concurrent threads!
 */
public class Random {
    private long seed;

    private static final long multiplier =  0x5DEECE66DL;
    private static final long addend = 0xBL;
    private static final long mask = (1L << 48) - 1;

    private boolean haveNextNextGaussian;
    private double nextNextGaussian;

    public Random(final long rseed) {
	setSeed(rseed);
	haveNextNextGaussian = false;
    }

    public void setSeed(final long rseed) {
	seed = (rseed ^ multiplier) & mask;
    }

    private int nextbits(final int bits) {
	long oldseed = seed;
	long nextseed = (oldseed * multiplier + addend) & mask;
	seed = nextseed;

	return (int) (nextseed >>> (48 - bits));
    }

    public int nextInt() {
	return nextbits(32);
    }

    public long nextLong() {
	return ((long) (nextbits(32)) << 32) + nextbits(32);
    }

    public boolean nextBoolean() {
	return nextbits(1) != 0;
    }

    public double nextDouble() {
	return (((long) (nextbits(26)) << 27) + nextbits(27))
		/ (double) (1L << 53);
    }

    public double nextGaussian() {
	if (haveNextNextGaussian) {
	    haveNextNextGaussian = false;
	    return nextNextGaussian;
	} else {
	    double v1 = 0.0;
	    double v2 = 0.0;
	    double s = 0.0;
	    do {
		v1 = 2 * nextDouble() - 1;
		v2 = 2 * nextDouble() - 1;
		s = v1 * v1 + v2 * v2;
	    } while (s >= 1 || s == 0);
	    double multiplier = Math.sqrt(-2 * Math.log(s) / s);
	    nextNextGaussian = v2 * multiplier;
	    haveNextNextGaussian = true;
	    return v1 * multiplier;
	}
    }
}
