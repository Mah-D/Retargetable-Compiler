public class SeriesMain {
	public static void main(String[] args) {
{
			Timer tmr = new Timer();
			int count = 0;
			tmr.start(count);
			new Series().run();
			tmr.stop(count);
			System.out.println("Wall-clock time for series: " + tmr.readTimer(count) + " secs");
		}
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

class Series {
	private int setsize;
	public int array_rows;
	public double[:rank==2] testArray;
	public void setSize(final int setsize) {
		this.setsize = setsize;
	}
	public void initialise(final int n) {
		array_rows = n;
		buildTestData();
	}
	public void kernel() {
		Do();
	}
	public void initRefArray(final double[:rank==2] ref) {
		ref[0, 0] = 2.8729524964837996;
		ref[0, 1] = 0.0;
		ref[1, 0] = 1.1161046676147888;
		ref[1, 1] = -1.8819691893398025;
		ref[2, 0] = 0.34429060398168704;
		ref[2, 1] = -1.1645642623320958;
		ref[3, 0] = 0.15238898702519288;
		ref[3, 1] = -0.8143461113044298;
	}
	public void validate() {
		final region(:rank==2) r = [0 : 3, 0 : 1];
		final dist(:rank==2) vd = r -> here;
		final double[:rank==2] ref = new double[vd](point(:rank==2)p0) {
			return 0.0;
		};
		initRefArray(ref);
		for(point(:rank==2) [i, j] : vd){
			final int ii = i;
			final int jj = j;
			double cval = 0;
			final place curr_place = here;
			final region(:rank==1) tempr = [0 : 0];
			final dist(:rank==1) tempvd = tempr -> here;
			final double[:rank==1] tempref = new double[tempvd](point(:rank==1)p0) {
				return 0.0;
			};
			final double[:rank==2] tA = testArray;
			finish
				async(testArray.distribution.get(j, i)) {
					final double temp = tA[jj, ii];
					async(curr_place) {
						tempref[0] = temp;
					}
				}
			cval = tempref[0];
			double error = Math.abs(cval - ref[i, j]);
			if(error > 1.0e-12) {
				System.out.println("Validation failed for coefficient " + j + "," + i);
				System.out.println("Computed value = " + cval);
				System.out.println("Reference value = " + ref[i, j]);
				throw new RuntimeException("Validation failed");
			}
		}
	}
	public void tidyup() {
		freeTestData();
	}
	public void run() {
		final region(:rank==1) tempregion = [0 : 0];
		final dist(:rank==1) tempdist = tempregion -> here;
		int j = 10000;
		for(point(:rank==1) i : tempdist){
			setSize(0);
			initialise((int)(j * Math.pow(100, 0)));
			kernel();
			validate();
		}
		tidyup();
	}
	public Series() {
	}
	public void buildTestData() {
		final region(:rank==2) R = [0 : 1, 0 : array_rows - 1];
		final dist(:rank==2) d = (dist(:rank==2))dist.factory.block(R);
		testArray = (double[:rank==2])new double[d];
	}
	public void Do() {
		testArray[0, 0] = TrapezoidIntegrate((double)0.0, (double)2.0, 1000, (double)0.0, 0) / (double)2.0;
		final double omega = (double)3.1415926535897932;
		final dist(:rank==1) U = (dist(:rank==1))dist.UNIQUE;
		final double[:rank==2] tA = testArray;
		finish {
			ateach(point(:rank==1) p : U){
				int ilow = 0;
				if(U.get(p).isFirst()) {
					ilow = 1;
				}
				else{
					ilow = 0;
				}
				for(point(:rank==2) pp : tA.distribution | here){
					if(pp[1] >= ilow) {
						if(pp[0] == 0) {
							tA[pp] = TrapezoidIntegrate((double)0.0, (double)2.0, 1000, omega * (double)pp[1], 1);
						}
						else{
							tA[pp] = TrapezoidIntegrate((double)0.0, (double)2.0, 1000, omega * (double)pp[1], 2);
						}
					}
				}
			}
		}
	}
	private double TrapezoidIntegrate(final double x0, final double x1, final int a_nsteps, final double omegan, final int select) {
		double x = 0.0;
		double dx = 0.0;
		double rvalue = 0.0;
		int nsteps = a_nsteps;
		x = x0;
		dx = (x1 - x0) / (double)nsteps;
		rvalue = thefunction(x0, omegan, select) / (double)2.0;
		if(nsteps != 1) {
			nsteps--;
			nsteps--;
			while(nsteps > 0){
				x = x + dx;
				rvalue = rvalue + thefunction(x, omegan, select);
				nsteps--;
			}
		}
		rvalue = (rvalue + thefunction(x1, omegan, select) / (double)2.0) * dx;
		return (rvalue);
	}
	private double thefunction(final double x, final double omegan, final int select) {
		switch(select) {
			case 0 :
				return (Math.pow(x + (double)1.0, x));

			case 1 :
				return (Math.pow(x + (double)1.0, x) * Math.cos(omegan * x));

			case 2 :
				return (Math.pow(x + (double)1.0, x) * Math.sin(omegan * x));

		}
		return (0.0);
	}
	public void freeTestData() {
	}
}

