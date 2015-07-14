public class SORMain {
	public static void main(String[] args) {
{
			Timer tmr = new Timer();
			int count = 0;
			tmr.start(count);
			new SOR().run();
			tmr.stop(count);
			System.out.println("Wall-clock time for sor: " + tmr.readTimer(count) + " secs");
		}
	}
}

class SOR {
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
	private double[:rank==2] RandomMatrix(final int M, final int N, final Random R) {
		final dist(:rank==2) d = blockStar([0 : M - 1], [0 : N - 1]);
		final double[:rank==2] t = new double[d];
		for(point(:rank==2) p : t.region){
			write(t, p, R.nextDouble() * 1e-6);
		}
		return t;
	}
	private void write(final double[:rank==2] t, final point(:rank==2) p, final double v) {
		finish
			async(t.distribution.get(p)) {
				t[p] = v;
			}
	}
	private dist(:rank==2) blockStar(final region(:rank==1) r1, final region(:rank==1) r2) {
		final dist(:rank==1) d1 = (dist(:rank==1))dist.factory.block(r1);
		return distTimesRegion(d1, r2);
	}
	private dist(:rank==2) distTimesRegion(final dist(:rank==1) d, final region(:rank==1) r) {
		dist(:rank==2) d0 = ((region(:rank==2))region.factory.emptyRegion(2)) -> here;
		for(point(:rank==1) pl : dist.UNIQUE){
			place p = dist.UNIQUE.get(pl);
			d0 = d0 || ([(region(:rank==1))(d | p).region, r] -> p);
		}
		return d0;
	}
	public void validate(final double gtotal) {
		double dev = Math.abs(gtotal - 4.5185971433257635E-5);
		if(dev > 1.0e-12) {
			System.out.println("Validation failed");
			System.out.println("gtotal = " + gtotal + "  " + dev);
			throw new RuntimeException("Validation failed");
		}
	}
	public double read(final double[:rank==2] G, final point(:rank==2) pt) {
		final region(:rank==1) r = [0 : 0];
		final dist(:rank==1) d = r -> here;
		final double[:rank==1] result = new double[d];
		final place phere = here;
		finish
			async(G.distribution.get(pt)) {
				final double val = G[pt];
				async(phere) {
					result[0] = val;
				}
			}
		return result[0];
	}
	public double SORrun(final double omega, final double[:rank==2] G, final int num_iterations) {
		final int M = G.distribution.region.rank(0).size();
		final int N = G.distribution.region.rank(1).size();
		final double omega_over_four = omega * 0.25;
		final double one_minus_omega = 1.0 - omega;
		final int Mm1 = M - 1;
		final int Nm1 = N - 1;
		for(point(:rank==2) po : [0 : num_iterations - 1, 0 : 1]){
			finish
				foreach(point(:rank==2) pt : [0 : (((Mm1 - 1) - (1 + po[1])) / 2), 1 : Nm1 - 1]){
					final point(:rank==2) ij = pt * [2, 1] + [1 + po[1], 0];
					finish
						async(G.distribution.get(ij)) {
							G[ij] = omega_over_four * (read(G, ij + [-1, 0]) + read(G, ij + [1, 0]) + G[ij + [0, -1]] + G[ij + [0, 1]]) + one_minus_omega * G[ij];
						}
				}
		}
		return G.sum();
	}
}

class Random {
	private long seed;
	private static final long multiplier = 0x5DEECE66DL;
	private static final long addend = 0xBL;
	private static final long mask = (1L << 48) - 1;
	public Random(final long rseed) {
		setSeed(rseed);
	}
	public void setSeed(final long rseed) {
		seed = (rseed ^ multiplier) & mask;
	}
	private int nextbits(final int bits) {
		long oldseed = seed;
		long nextseed = (oldseed * multiplier + addend) & mask;
		seed = nextseed;
		return (int)(nextseed >>> (48 - bits));
	}
	public int nextInt() {
		return nextbits(32);
	}
	public long nextLong() {
		return ((long)(nextbits(32)) << 32) + nextbits(32);
	}
	public boolean nextBoolean() {
		return nextbits(1) != 0;
	}
	public double nextDouble() {
		return (((long)(nextbits(26)) << 27) + nextbits(27)) / (double)(1L << 53);
	}
}

class Timer {
	public static final int max_counters = 64;
	private double[:rank==1] start_time;
	private double[:rank==1] elapsed_time;
	private double[:rank==1] total_time;
	public Timer() {
		final dist(:rank==1) d = [0 : max_counters] -> place.FIRST_PLACE;
		start_time = new double[d](point(:rank==1)p) {
			return 0;
		};
		elapsed_time = new double[d](point(:rank==1)p) {
			return 0;
		};
		total_time = new double[d](point(:rank==1)p) {
			return 0;
		};
	}
	public void start(final int n) {
		start_time[n] = System.currentTimeMillis();
	}
	public void stop(final int n) {
		elapsed_time[n] = System.currentTimeMillis() - start_time[n];
		elapsed_time[n] = elapsed_time[n] / 1000;
		total_time[n] = total_time[n] + elapsed_time[n];
	}
	public double readTimer(final int n) {
		return total_time[n];
	}
	public void resetTimer(final int n) {
		total_time[n] = 0;
		start_time[n] = 0;
		elapsed_time[n] = 0;
	}
	public void resetAllTimers() {
		int i = 0;
		while(i < max_counters){
			resetTimer(i);
			i++;
		}
	}
}

