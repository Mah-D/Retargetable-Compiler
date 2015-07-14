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

public class NewStream {
	public static void main(String[] args) {
{
			Timer tmr = new Timer();
			int count = 0;
			tmr.start(count);
			new Stream().run();
			tmr.stop(count);
			System.out.println("Wall-clock time for stream: " + tmr.readTimer(count) + " secs");
		}
	}
}

value StreamData {
	public final boolean[:rank==1] verified;
	public final dist(:rank==1) D;
	public final double[:rank==1] times;
	public final double[:rank==1] a;
	public final double[:rank==1] b;
	public final double[:rank==1] c;
	public StreamData(final long N, final int NUM_TIMES) {
		final dist(:rank==1) dverified = [0 : 0] -> here;
		verified = initVerified(dverified);
		final dist(:rank==1) temp_D = (dist(:rank==1))dist.factory.block([0 : (int)(N - 1)]);
		D = temp_D;
		times = initArray([0 : (int)(NUM_TIMES - 1)] -> here);
		a = initArray(temp_D);
		b = initArray(temp_D);
		c = initArray(temp_D);
	}
	public boolean[:rank==1] initVerified(final dist(:rank==1) d) {
		return (boolean[:rank==1])new boolean[d](point(:rank==1)p) {
			return true;
		};
	}
	public double[:rank==1] initArray(final dist(:rank==1) d) {
		return (double[:rank==1])new double[d](point(:rank==1)p) {
			return 0.0D;
		};
	}
}

class Stream {
	public static final int MEG = 50 * 50;
	public static final double alpha = 3.0D;
	public static final int NUM_TIMES = 10;
	public static final long N0 = 2 * MEG;
	public static final long N = N0 * place.MAX_PLACES;
	public static final int LocalSize = (int)N0;
	public final StreamData sd;
	public Stream() {
		sd = new StreamData(N, NUM_TIMES);
	}
	public void run() {
		System.out.println("LocalSize=" + LocalSize);
		final StreamData tempSd = this.sd;
		finish {
			region(:rank==1) r = [0 : (int)(NUM_TIMES - 1)];
			for(point(:rank==1) p1 : r){
				finish
					ateach(point(:rank==1) p6 : dist.UNIQUE){
						for(point(:rank==1) i : (tempSd.D) | here){
							tempSd.b[i] = 1.5 * (here.id * LocalSize + i[0]);
							tempSd.c[i] = 2.5 * (here.id * LocalSize + i[0]);
						}
						if(dist.UNIQUE.get(p6) == place.FIRST_PLACE)
							tempSd.times[p1] = -mySecond();
						for(point(:rank==1) p4 : (tempSd.D) | here)
							tempSd.a[p4] = tempSd.b[p4] + alpha * tempSd.c[p4];
					}
				finish
					ateach(point(:rank==1) p5 : dist.UNIQUE){
						if(dist.UNIQUE.get(p5) == place.FIRST_PLACE)
							tempSd.times[p1] = tempSd.times[p1] + mySecond();
					}
			}
			finish
				ateach(point(:rank==1) p2 : dist.UNIQUE){
					for(point(:rank==1) p3 : (tempSd.D) | here)
						if(tempSd.a[p3] != tempSd.b[p3] + alpha * tempSd.c[p3])
							async(place.FIRST_PLACE) {
								tempSd.verified[0] = false;
							}
				}
		}
		double mini = 10000000L;
		region(:rank==1) r = [0 : (int)(NUM_TIMES - 1)];
		for(point(:rank==1) p1 : r)
			if(tempSd.times[p1] < mini)
				mini = tempSd.times[p1];
		printStats(N, mini, tempSd.verified[0]);
	}
	public static double mySecond() {
		return (double)((double)(System.currentTimeMillis() * 1.e6 / 1000) * 1.e-6);
	}
	public static void printStats(final long N, final double time, final boolean verified) {
		System.out.println("Number of places=" + place.MAX_PLACES);
		long size1 = (3 * 8 * N / MEG);
		double rate = (3 * 8 * N) / (1.0E9 * time);
		System.out.println("Size of arrays: " + size1 + " MB (total)" + size1 / place.MAX_PLACES + " MB (per place)");
		System.out.println("Min time: " + time + " rate=" + rate + " GB/s");
		System.out.println("Result is " + (verified? "verified." : "NOT verified."));
	}
}

