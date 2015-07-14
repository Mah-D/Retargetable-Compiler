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

public class MapReduce {
	public static void main(String[] args) {
{
			Timer tmr = new Timer();
			int count = 0;
			tmr.start(count);
			new MR().run();
			tmr.stop(count);
			System.out.println("Wall-clock time for mapreduce: " + tmr.readTimer(count) + " secs");
		}
	}
}

class MR {
	public static final region(:rank==1) r = [0 : 300000];
	public int[:rank==1] a;
	public int total;
	public MR() {
		final dist(:rank==1) d = (dist(:rank==1))dist.factory.block(r);
		a = new int[d](point(:rank==1)p) {
			return p[0];
		};
		total = 0;
	}
	public void run() {
		map();
		reduce();
		System.out.println(total);
	}
	public void map() {
		final int[:rank==1] b = a;
		finish
			ateach(point(:rank==1) p : b){
				b[p] = f(b[p]);
			}
	}
	public int f(final int x) {
		return x * x;
	}
	public void reduce() {
		final place h = here;
		final region(:rank==1) reg = a.region;
		final dist(:rank==1) dis = reg -> here;
		final int[:rank==1] result = new int[dis];
		for(point(:rank==1) p : a){
			finish {
				final int[:rank==1] c = a;
				async(a.distribution.get(p)) {
					final int v = c[p];
					async(h) {
						result[p] = v;
					}
				}
			}
		}
		for(point(:rank==1) p : result){
			total = total + result[p];
		}
	}
}

