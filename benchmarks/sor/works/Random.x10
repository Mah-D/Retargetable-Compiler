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

    public Random(long rseed) {
	setSeed(rseed);
    }

    public void setSeed(long rseed) {
	seed = (rseed ^ multiplier) & mask;
    }

    private int nextbits(int bits) {
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
}