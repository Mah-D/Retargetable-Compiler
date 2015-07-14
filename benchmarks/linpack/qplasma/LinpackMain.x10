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

class Linpack {
	private int setSize;
	private static final region(:rank==1) r = [0 : 2];
	public void initdataSizesArray(final int[:rank==1] datasizes) {
		datasizes[0] = 150;
		datasizes[1] = 1000;
		datasizes[2] = 2000;
	}
	public void JGFsetsize(final int setSize) {
		this.setSize = setSize;
	}
	public void JGFinitialise(final dist(:rank==1) vd) {
		final int[:rank==1] datasizes = new int[vd](point(:rank==1)p0) {
			return 0;
		};
		initdataSizesArray(datasizes);
		n = datasizes[setSize];
		System.out.println("ATTENTION: Running with smaller size (" + n + " instead of 500)");
		ldaa = n;
		lda = ldaa + 1;
		region(:rank==1) vectorRegion = [0 : ldaa];
		region(:rank==1) vectorRegionMinus1 = [0 : ldaa - 1];
		dist(:rank==1) vectorRegionMinus1Dist = vectorRegionMinus1 -> here;
		region(:rank==2) rectangularRegion = [0 : ldaa, 0 : lda];
		region(:rank==2) slimRegion = [0 : 0, 0 : lda];
		dist(:rank==2) slimRegionDist = slimRegion -> here;
		dist(:rank==2) rectangular_distribution = (dist(:rank==2))dist.factory.blockCyclic(rectangularRegion, lda + 1);
		a = new double[rectangular_distribution];
		b = new double[slimRegionDist];
		x = new double[slimRegionDist];
		ipvt = new int[vectorRegionMinus1Dist];
		long nl = (long)n;
		ops = (2.0 * (nl * nl * nl)) / 3.0 + 2.0 * (nl * nl);
		norma = matgen(a, lda, n, b);
	}
	public void JGFkernel() {
		info = dgefa(a, lda, n, ipvt);
		dgesl(a, lda, n, ipvt, b, 0);
	}
	public void JGFvalidate(final dist(:rank==1) vd) {
		double eps = 0.0;
		double residn = 0.0;
		final double[:rank==1] ref = new double[vd](point(:rank==1)p0) {
			return 0.0;
		};
		ref[0] = 6.0;
		ref[1] = 12.0;
		ref[2] = 20.0;
		final region(:rank==2) tempR = [0 : 0, 0 : n];
		final dist(:rank==2) tempdist = tempR -> here;
		for(point(:rank==2) pt : tempdist){
			final point(:rank==2) pt0 = pt * [0, 1];
			x[pt0] = b[pt0];
		}
		norma = matgen(a, lda, n, b);
		for(point(:rank==2) pt : tempdist){
			final point(:rank==2) pt0 = pt * [0, 1];
			b[pt0] = -b[pt0];
		}
		dmxpy(n, b, n, lda, x, a);
		resid = 0.0;
		normx = 0.0;
		for(point(:rank==2) pt : tempdist){
			final point(:rank==2) pt0 = pt * [0, 1];
			resid = (resid > myabs(b[pt0]))? resid : myabs(b[pt0]);
			normx = (normx > myabs(x[pt0]))? normx : myabs(x[pt0]);
		}
		eps = epslon((double)1.0);
		residn = resid / (n * norma * normx * eps);
		if(residn > ref[setSize]) {
			System.out.println("Validation failed");
			System.out.println("Computed Norm Res = " + residn);
			System.out.println("Reference Norm Res = " + ref[setSize]);
			throw new RuntimeException("Validation failed");
		}
	}
	public void JGFtidyup() {
	}
	public void run() {
		JGFsetsize(0);
		final dist(:rank==1) vd = r -> here;
		JGFinitialise(vd);
		JGFkernel();
		JGFvalidate(vd);
		JGFtidyup();
	}
	private double[:rank==2] a;
	private double[:rank==2] b;
	private double[:rank==2] x;
	private double ops;
	private double total;
	private double norma;
	private double normx;
	private double resid;
	private double time;
	private double kf;
	private int n;
	private int i;
	private int ntimes;
	private int info;
	private int lda;
	private int ldaa;
	private int kflops;
	private int[:rank==1] ipvt;
	private double read(final double[:rank==2] a, final int i, final int j) {
		final place curr_place = here;
		final region(:rank==1) tempr = [0 : 0];
		final dist(:rank==1) tempvd = tempr -> here;
		final double[:rank==1] tempref = new double[tempvd](point(:rank==1)p0) {
			return 0.0;
		};
		finish
			async(a.distribution.get(i, j)) {
				final double temp = a[i, j];
				async(curr_place) {
					tempref[0] = temp;
				}
			}
		return tempref[0];
	}
	private void write(final double[:rank==2] a, final point(:rank==2) p, final double val) {
		async(a.distribution.get(p)) {
			a[p] = val;
		}
	}
	private void plusWrite(final double[:rank==2] a, final int i, final int j, final double val) {
		async(a.distribution.get(i, j)) {
			a[i, j] = a[i, j] + val;
		}
	}
	private double myabs(final double d) {
		return (d >= 0)? d : -d;
	}
	private double matgen(final double[:rank==2] a, final int lda, final int n, final double[:rank==2] b) {
		int init = 1325;
		double norma = 0.0;
		for(point(:rank==2) p : a){
			init = 3125 * init % 65536;
			double val = (init - 32768.0) / 16384.0;
			finish {
				write(a, p, val);
			}
			norma = val > norma? val : norma;
		}
		finish
			ateach(point(:rank==2) p : b){
				b[p] = 0.0;
			}
		finish
			for(point(:rank==2) [i, j] : [0 : n - 1, 0 : n - 1]){
				finish
					async(a.distribution.get(i, j)) {
						plusWrite(b, 0, j, a[i, j]);
					}
			}
		return norma;
	}
	private int infodgefa;
	private int dgefa(final double[:rank==2] a, final int lda, final int n, final int[:rank==1] ipvt) {
		infodgefa = 0;
		final int nm1 = n - 1;
		if(nm1 >= 0) {
			region(:rank==1) tempr = [0 : nm1 - 1];
			dist(:rank==1) temprDist = tempr -> here;
			for(point(:rank==1) [k] : temprDist){
				final int l = idamax(n - k, a, k, k, 1) + k;
				ipvt[k] = l;
				finish
					async(a.distribution.get(k, 1)) {
						final int kp1 = k + 1;
						if(a[k, l] != 0) {
							if(l != k) {
								if(l != k) {
									double t = a[k, l];
									a[k, l] = a[k, k];
									a[k, k] = t;
								}
							}
							final double tx = -1.0 / a[k, k];
							dscal(n - (kp1), tx, a, k, kp1, 1);
							finish {
								region(:rank==1) temprkp1 = [kp1 : n - 1];
								dist(:rank==1) temprkp1Dist = temprkp1 -> here;
								for(point(:rank==1) [j] : temprkp1Dist){
									async(a.distribution.get(j, l)) {
										double t = a[j, l];
										if(l != k) {
											a[j, l] = a[j, k];
											a[j, k] = t;
										}
										daxpy(n - (kp1), t, a, k, kp1, 1, a, j, kp1, 1);
									}
								}
							}
						}
						else{
							infodgefa = k;
						}
					}
			}
		}
		ipvt[n - 1] = n - 1;
		double val = read(a, n - 1, n - 1);
		if(val == 0) {
			info = n - 1;
		}
		return infodgefa;
	}
	private void dgesl(final double[:rank==2] a, final int lda, final int n, final int[:rank==1] ipvt, final double[:rank==2] b, final int job) {
		final int nm1 = n - 1;
		if(job == 0) {
			if(nm1 >= 1) {
				region(:rank==1) tempr = [0 : nm1 - 1];
				dist(:rank==1) temprDist = tempr -> here;
				for(point(:rank==1) [k] : temprDist){
					final int l = ipvt[k];
					double t = b[0, l];
					if(l != k) {
						b[0, l] = b[0, k];
						b[0, k] = t;
					}
					final int kp1 = k + 1;
					daxpy(n - (kp1), t, a, k, kp1, 1, b, 0, kp1, 1);
				}
			}
			region(:rank==1) tempr = [0 : n - 1];
			dist(:rank==1) temprDist = tempr -> here;
			for(point(:rank==1) [kb] : temprDist){
				final int k = n - (kb + 1);
				b[0, k] = b[0, k] / read(a, k, k);
				double t = -b[0, k];
				daxpy(k, t, a, k, 0, 1, b, 0, 0, 1);
			}
		}
		else{
			region(:rank==1) tempr = [0 : n - 1];
			dist(:rank==1) temprDist = tempr -> here;
			for(point(:rank==1) [k] : temprDist){
				double t = ddot(k, a, k, 0, 1, b, 0, 0, 1);
				b[0, k] = (b[0, k] - t) / a[k, k];
			}
			if(nm1 >= 1) {
				region(:rank==1) temprnm1 = [1 : nm1 - 1];
				dist(:rank==1) temprnm1Dist = temprnm1 -> here;
				for(point(:rank==1) [kb] : temprnm1Dist){
					final int k = n - (kb + 1);
					final int kp1 = k + 1;
					b[0, k] = b[0, k] + ddot(n - (kp1), a, k, kp1, 1, b, 0, kp1, 1);
					final int l = ipvt[k];
					if(l != k) {
						double t = b[0, l];
						b[0, l] = b[0, k];
						b[0, k] = t;
					}
				}
			}
		}
	}
	private void daxpy(final int n, final double da, final double[:rank==2] dx, final int dxCol, final int dx_off, final int incx, final double[:rank==2] dy, final int dyCol, final int dy_off, final int incy) {
		if((n > 0) && (da != 0)) {
			if(incx != 1 || incy != 1) {
				int ix = 0;
				int iy = 0;
				if(incx < 0)
					ix = (-n + 1) * incx;
				if(incy < 0)
					iy = (-n + 1) * incy;
				region(:rank==1) tempr = [0 : n - 1];
				dist(:rank==1) temprDist = tempr -> here;
				for(point(:rank==1) i : temprDist){
					dy[dyCol, iy + dy_off] = dy[dyCol, iy + dy_off] + (da * read(dx, dxCol, ix + dx_off));
					ix = ix + incx;
					iy = iy + incy;
				}
				return ;
			}
			region(:rank==1) tempr = [0 : n - 1];
			dist(:rank==1) temprDist = tempr -> here;
			for(point(:rank==1) [i] : temprDist)
				dy[dyCol, i + dy_off] = dy[dyCol, i + dy_off] + (da * read(dx, dxCol, i + dx_off));
		}
	}
	private double ddot(final int n, final double[:rank==2] dx, final int dxCol, final int dx_off, final int incx, final double[:rank==2] dy, final int dyCol, final int dy_off, final int incy) {
		double dtemp = 0;
		if(n > 0) {
			if(incx != 1 || incy != 1) {
				int ix = 0;
				int iy = 0;
				if(incx < 0)
					ix = (-n + 1) * incx;
				if(incy < 0)
					iy = (-n + 1) * incy;
				region(:rank==1) tempr = [0 : n - 1];
				dist(:rank==1) temprDist = tempr -> here;
				for(point(:rank==1) i : temprDist){
					dtemp = dtemp + (dx[dxCol, ix + dx_off] * dy[dyCol, iy + dy_off]);
					ix = ix + incx;
					iy = iy + incy;
				}
			}
			else{
				region(:rank==1) tempr = [0 : n - 1];
				dist(:rank==1) temprDist = tempr -> here;
				for(point(:rank==1) [i] : temprDist)
					dtemp = dtemp + dx[dxCol, i + dx_off] * dy[dyCol, i + dy_off];
			}
		}
		return dtemp;
	}
	private void dscal(final int n, final double da, final double[:rank==2] dx, final int currentCol, final int dx_off, final int incx) {
		if(n > 0) {
			if(incx != 1) {
				final int nincx = n * incx;
				int i = 0;
				while(i < nincx){
					dx[currentCol, i + dx_off] = dx[currentCol, i + dx_off] * da;
					i = i + incx;
				}
			}
			else{
				region(:rank==1) tempr = [0 : n - 1];
				dist(:rank==1) temprDist = tempr -> here;
				for(point(:rank==1) [i] : temprDist)
					dx[currentCol, i + dx_off] = dx[currentCol, i + dx_off] * da;
			}
		}
	}
	private int idamax(final int n, final double[:rank==2] dx, final int dxk, final int dx_off, final int incx) {
		if(n < 1)
			return -1;
		if(n == 1)
			return 0;
		if(incx != 1) {
			int itemp = 0;
			double dmax = myabs(read(dx, dxk, 0 + dx_off));
			int ix = 1 + incx;
			for(point(:rank==1) i : [1 : n - 1]){
				double dtemp = myabs(read(dx, dxk, ix + dx_off));
				if(dtemp > dmax) {
					itemp = i[0];
					dmax = dtemp;
				}
				ix = i[0] + incx;
			}
			return itemp;
		}
		int itemp = 0;
		double dmax = myabs(read(dx, dxk, 0 + dx_off));
		for(point(:rank==1) i : [1 : n - 1]){
			double dtemp = myabs(read(dx, dxk, i[0] + dx_off));
			if(dtemp > dmax) {
				itemp = i[0];
				dmax = dtemp;
			}
		}
		return itemp;
	}
	private double epslon(final double x) {
		final double a = 4.0e0 / 3.0e0;
		double eps = 0;
		while(eps == 0){
			double b = a - 1.0;
			double c = b + b + b;
			eps = myabs(c - 1.0);
		}
		return (eps * myabs(x));
	}
	private void dmxpy(final int n1, final double[:rank==2] y, final int n2, final int ldm, final double[:rank==2] x, final double[:rank==2] m) {
		for(point(:rank==2) [j, i] : [0 : n2 - 1, 0 : n1 - 1])
			y[0, i] = y[0, i] + (x[0, j] * read(m, j, i));
	}
}

public class LinpackMain {
	public static void main(String[] args) {
{
			Timer tmr = new Timer();
			int count = 0;
			tmr.start(count);
			new Linpack().run();
			tmr.stop(count);
			System.out.println("Wall-clock time for linpack: " + tmr.readTimer(count) + " secs");
		}
	}
}

