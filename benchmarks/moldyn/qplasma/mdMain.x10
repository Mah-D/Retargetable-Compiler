class md {
	public static final int ITERS = 100;
	public static final double LENGTH = 50e-10;
	public static final double m = 4.0026;
	public static final double mu = 1.66056e-27;
	public static final double kb = 1.38066e-23;
	public static final double TSIM = 50;
	public static final double deltat = 5e-16;
	public Particle[:rank==1] one;
	public double epot;
	public double vir;
	public int interactions;
	public double count;
	private int mdsize;
	private double l;
	private double rcoff;
	private double rcoffs;
	private double side;
	private double sideh;
	private double hsq;
	private double hsq2;
	private double a;
	private double tscale;
	private double sc;
	private double ekin;
	private double ek;
	public static final double den = 0.83134;
	public static final double tref = 0.722;
	public static final double h = 0.064;
	private double vaver;
	private double vaverh;
	private double etot;
	private double temp;
	private double pres;
	private double rp;
	private int npartm;
	public static final int irep = 10;
	public static final int istop = 19;
	public static final int iprint = 10;
	public static final int movemx = 50;
	private int rnk;
	private int nprocess;
	public static void exec() {
		final dist(:rank==1) D = (dist(:rank==1))dist.UNIQUE;
		final md[:rank==1] P = new md[D](point(:rank==1)pt) {
			return new md();
		};
		init(D, P);
		run(D, P);
		validate(D, P);
	}
	public static void init(final dist(:rank==1) D, final md[:rank==1] P) {
		finish
			ateach(point(:rank==1) j : D){
				(P[j]).initialise(j[0], place.MAX_PLACES);
			}
	}
	public static void run(final dist(:rank==1) D, final md[:rank==1] P) {
		int n = 0;
		for(point(:rank==1) move : [0 : movemx - 1]){
			finish
				ateach(point(:rank==1) j : D){
					P[j].runiters1();
				}
			finish
				ateach(point(:rank==1) j : D){
					P[j].runiters2(P);
				}
			finish
				ateach(point(:rank==1) j : D){
					P[j].runiters3(move[0]);
				}
		}
	}
	public static void validate(final dist(:rank==1) D, final md[:rank==1] P) {
		finish
			ateach(point(:rank==1) j : D){
				double ref = 275.97175611773514;
				double dev = Math.abs(P[j].ek - ref);
				if(dev > 1.0e-12) {
					System.out.println("Validation failed at place: " + j[0]);
					System.out.println("Kinetic energy = " + P[j].ek + " " + dev + " " + ref);
					throw new RuntimeException("Validation failed");
				}
			}
	}
	public void initialise(final int rank0, final int nprocess0) {
		rnk = rank0;
		nprocess = nprocess0;
		vir = 0.0;
		epot = 0.0;
		interactions = 0;
		int mm = 4;
		int partsize = mm * mm * mm * 4;
		mdsize = partsize;
		dist(:rank==1) dOne = [0 : mdsize - 1] -> here;
		one = new Particle[dOne];
		l = LENGTH;
		side = Math.pow((mdsize / den), 0.3333333);
		rcoff = mm / 4.0;
		a = side / mm;
		sideh = side * 0.5;
		hsq = h * h;
		hsq2 = hsq * 0.5;
		npartm = mdsize - 1;
		rcoffs = rcoff * rcoff;
		tscale = 16.0 / (1.0 * mdsize - 1.0);
		vaver = 1.13 * Math.sqrt(tref / 24.0);
		vaverh = vaver * h;
		for(point(:rank==1) base : [0 : 0]){
			point(:rank==1) ijk = base;
			for(point(:rank==4) p : [0 : 1, 0 : mm - 1, 0 : mm - 1, 0 : mm - 1]){
				one[ijk] = new Particle((p[1] * a + p[0] * a * 0.5), (p[2] * a + p[0] * a * 0.5), (p[3] * a), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
				ijk = ijk + [1];
			}
			for(point(:rank==4) p : [1 : 2, 0 : mm - 1, 0 : mm - 1, 0 : mm - 1]){
				one[ijk] = new Particle((p[1] * a + (2 - p[0]) * a * 0.5), (p[2] * a + (p[0] - 1) * a * 0.5), (p[3] * a + a * 0.5), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
				ijk = ijk + [1];
			}
		}
		int iseed = 0;
		double v1 = 0.0;
		double v2 = 0.0;
		Random randnum = new Random(iseed, v1, v2);
		double r = 0.0;
		int k = 0;
		while(k < mdsize){
			r = randnum.seed();
			one[k].xvelocity = r * randnum.v1;
			one[k + 1].xvelocity = r * randnum.v2;
			k = k + 2;
		}
		k = 0;
		while(k < mdsize){
			r = randnum.seed();
			one[k].yvelocity = r * randnum.v1;
			one[k + 1].yvelocity = r * randnum.v2;
			k = k + 2;
		}
		k = 0;
		while(k < mdsize){
			r = randnum.seed();
			one[k].zvelocity = r * randnum.v1;
			one[k + 1].zvelocity = r * randnum.v2;
			k = k + 2;
		}
		ekin = 0.0;
		double sp = 0.0;
		for(point(:rank==1) i : [0 : mdsize - 1]){
			sp = sp + one[i].xvelocity;
		}
		sp = sp / mdsize;
		for(point(:rank==1) i : [0 : mdsize - 1]){
			one[i].xvelocity = one[i].xvelocity - sp;
			ekin = ekin + one[i].xvelocity * one[i].xvelocity;
		}
		sp = 0.0;
		for(point(:rank==1) i : [0 : mdsize - 1]){
			sp = sp + one[i].yvelocity;
		}
		sp = sp / mdsize;
		for(point(:rank==1) i : [0 : mdsize - 1]){
			one[i].yvelocity = one[i].yvelocity - sp;
			ekin = ekin + one[i].yvelocity * one[i].yvelocity;
		}
		sp = 0.0;
		for(point(:rank==1) i : [0 : mdsize - 1]){
			sp = sp + one[i].zvelocity;
		}
		sp = sp / mdsize;
		for(point(:rank==1) i : [0 : mdsize - 1]){
			one[i].zvelocity = one[i].zvelocity - sp;
			ekin = ekin + one[i].zvelocity * one[i].zvelocity;
		}
		double ts = tscale * ekin;
		sc = h * Math.sqrt(tref / ts);
		for(point(:rank==1) i : [0 : mdsize - 1]){
			one[i].xvelocity = one[i].xvelocity * sc;
			one[i].yvelocity = one[i].yvelocity * sc;
			one[i].zvelocity = one[i].zvelocity * sc;
		}
	}
	public void runiters1() {
		for(point(:rank==1) i : [0 : mdsize - 1]){
			one[i].domove(side);
		}
		epot = 0.0;
		vir = 0.0;
		int i = 0 + rnk;
		while(i < mdsize){
			one[i].force(side, rcoff, mdsize, i, this);
			i = i + nprocess;
		}
	}
	public void runiters2(final md[:rank==1] P) {
		allreduce(P);
	}
	public void runiters3(final int move) {
		double summation = 0.0;
		for(point(:rank==1) i : [0 : mdsize - 1]){
			summation = summation + one[i].mkekin(hsq2);
		}
		ekin = summation / hsq;
		double vel = 0.0;
		count = 0.0;
		for(point(:rank==1) i : [0 : mdsize - 1]){
			vel = vel + one[i].velavg(vaverh, h, this);
		}
		vel = vel / h;
		if((move < istop) && (((move + 1) % irep) == 0)) {
			sc = Math.sqrt(tref / (tscale * ekin));
			for(point(:rank==1) i : [0 : mdsize - 1]){
				one[i].dscal(sc, 1);
			}
			ekin = tref / tscale;
		}
		if(((move + 1) % iprint) == 0) {
			ek = 24.0 * ekin;
			epot = 4.0 * epot;
			etot = ek + epot;
			temp = tscale * ekin;
			pres = den * 16.0 * (ekin - vir) / mdsize;
			vel = vel / mdsize;
			rp = (count / mdsize) * 100.0;
		}
	}
	public void allreduce(final md[:rank==1] P) {
		if(rnk != 0)
			return ;
		final md t = new md();
		t.mdsize = mdsize;
		final dist(:rank==1) dOne = [0 : mdsize - 1] -> here;
		t.one = new Particle[dOne];
		final place tHere = here;
		for(point(:rank==1) k : [0 : (mdsize - 1)]){
			t.one[k] = new Particle(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
		}
		for(point(:rank==1) j : P){
			final dist(:rank==1) dD = [0 : 2] -> here;
			final dist(:rank==1) dI = [0 : 0] -> here;
			final double[:rank==1] dataD = new double[dD];
			final double[:rank==1] dataI = new double[dI];
			for(point(:rank==1) k : [0 : (mdsize - 1)]){
				finish
					async(P.distribution.get(j)) {
						final double fx = P[j].one[k].xforce;
						final double fy = P[j].one[k].yforce;
						final double fz = P[j].one[k].zforce;
						finish
							async(tHere) {
								dataD[0] = fx;
								dataD[1] = fy;
								dataD[2] = fz;
							}
					}
				t.one[k].xforce = t.one[k].xforce + dataD[0];
				t.one[k].yforce = t.one[k].yforce + dataD[1];
				t.one[k].zforce = t.one[k].zforce + dataD[2];
			}
			finish
				async(P.distribution.get(j)) {
					final double jvir = P[j].vir;
					final double jepot = P[j].epot;
					final int jinter = P[j].interactions;
					finish
						async(tHere) {
							dataD[0] = jvir;
							dataD[1] = jepot;
							dataI[0] = jinter;
						}
				}
			t.vir = t.vir + dataD[0];
			t.epot = t.epot + dataD[1];
			t.interactions = t.interactions + (int)dataI[0];
		}
		final int mymdsize = mdsize;
		finish
			ateach(point(:rank==1) j : P.distribution){
				final place pHere = here;
				final dist(:rank==1) dD = [0 : 2] -> here;
				final double[:rank==1] dataD = new double[dD];
				for(point(:rank==1) k : [0 : (mymdsize - 1)]){
					finish
						async(tHere) {
							final double xf = t.one[k].xforce;
							final double yf = t.one[k].yforce;
							final double zf = t.one[k].zforce;
							finish
								async(pHere) {
									dataD[0] = xf;
									dataD[1] = yf;
									dataD[2] = zf;
								}
						}
					P[j].one[k].xforce = dataD[0];
					P[j].one[k].yforce = dataD[1];
					P[j].one[k].zforce = dataD[2];
				}
				final dist(:rank==1) dI = [0 : 0] -> here;
				final int[:rank==1] dataI = new int[dI];
				finish
					async(tHere) {
						final double tvir = t.vir;
						final double tepot = t.epot;
						final int tinter = t.interactions;
						finish
							async(pHere) {
								dataD[0] = tvir;
								dataD[1] = tepot;
								dataI[0] = tinter;
							}
					}
				P[j].vir = dataD[0];
				P[j].epot = dataD[1];
				P[j].interactions = dataI[0];
			}
	}
}

public class mdMain {
	public static void main(String[] args) {
{
			Timer tmr = new Timer();
			int count = 0;
			tmr.start(count);
			md.exec();
			tmr.stop(count);
			System.out.println("Wall-clock time for moldyn: " + tmr.readTimer(count) + " secs");
		}
	}
}

class Random {
	public int iseed;
	public double v1;
	public double v2;
	public Random(final int iseed0, final double v10, final double v20) {
		iseed = iseed0;
		v1 = v10;
		v2 = v20;
	}
	public double update() {
		double rand = 0.0;
		double scale = 4.656612875e-10;
		int is1 = 0;
		int is2 = 0;
		int iss2 = 0;
		int imult = 16807;
		int imod = 2147483647;
		if(iseed <= 0) {
			iseed = 1;
		}
		is2 = iseed % 32768;
		is1 = (iseed - is2) / 32768;
		iss2 = is2 * imult;
		is2 = iss2 % 32768;
		is1 = (is1 * imult + (iss2 - is2) / 32768) % (65536);
		iseed = (is1 * 32768 + is2) % imod;
		rand = scale * iseed;
		return rand;
	}
	public double seed() {
		double s = 0.0;
		double u1 = 0.0;
		double u2 = 0.0;
		double r = 0.0;
		s = 1.0;
		do {
			u1 = update();
			u2 = update();
			v1 = 2.0 * u1 - 1.0;
			v2 = 2.0 * u2 - 1.0;
			s = v1 * v1 + v2 * v2;
		} while(s >= 1.0);
		r = Math.sqrt(-2.0 * Math.log(s) / s);
		return r;
	}
}

class Particle {
	public double xcoord;
	public double ycoord;
	public double zcoord;
	public double xvelocity;
	public double yvelocity;
	public double zvelocity;
	public double xforce;
	public double yforce;
	public double zforce;
	public Particle(final double xcoord0, final double ycoord0, final double zcoord0, final double xvelocity0, final double yvelocity0, final double zvelocity0, final double xforce0, final double yforce0, final double zforce0) {
		xcoord = xcoord0;
		ycoord = ycoord0;
		zcoord = zcoord0;
		xvelocity = xvelocity0;
		yvelocity = yvelocity0;
		zvelocity = zvelocity0;
		xforce = xforce0;
		yforce = yforce0;
		zforce = zforce0;
	}
	public void domove(final double side) {
		xcoord = xcoord + xvelocity + xforce;
		ycoord = ycoord + yvelocity + yforce;
		zcoord = zcoord + zvelocity + zforce;
		if(xcoord < 0) {
			xcoord = xcoord + side;
		}
		if(xcoord > side) {
			xcoord = xcoord - side;
		}
		if(ycoord < 0) {
			ycoord = ycoord + side;
		}
		if(ycoord > side) {
			ycoord = ycoord - side;
		}
		if(zcoord < 0) {
			zcoord = zcoord + side;
		}
		if(zcoord > side) {
			zcoord = zcoord - side;
		}
		xvelocity = xvelocity + xforce;
		yvelocity = yvelocity + yforce;
		zvelocity = zvelocity + zforce;
		xforce = 0.0;
		yforce = 0.0;
		zforce = 0.0;
	}
	public void force(final double side, final double rcoff, final int mdsize, final int x, final md md1) {
		double sideh = 0.0;
		double rcoffs = 0.0;
		double xx = 0.0;
		double yy = 0.0;
		double zz = 0.0;
		double xi = 0.0;
		double yi = 0.0;
		double zi = 0.0;
		double fxi = 0.0;
		double fyi = 0.0;
		double fzi = 0.0;
		double rd = 0.0;
		double rrd = 0.0;
		double rrd2 = 0.0;
		double rrd3 = 0.0;
		double rrd4 = 0.0;
		double rrd6 = 0.0;
		double rrd7 = 0.0;
		double r148 = 0.0;
		double forcex = 0.0;
		double forcey = 0.0;
		double forcez = 0.0;
		sideh = 0.5 * side;
		rcoffs = rcoff * rcoff;
		xi = xcoord;
		yi = ycoord;
		zi = zcoord;
		fxi = 0.0;
		fyi = 0.0;
		fzi = 0.0;
		for(point(:rank==1) i : [x + 1 : mdsize - 1]){
			xx = xi - md1.one[i].xcoord;
			yy = yi - md1.one[i].ycoord;
			zz = zi - md1.one[i].zcoord;
			if(xx < (-sideh)) {
				xx = xx + side;
			}
			if(xx > (sideh)) {
				xx = xx - side;
			}
			if(yy < (-sideh)) {
				yy = yy + side;
			}
			if(yy > (sideh)) {
				yy = yy - side;
			}
			if(zz < (-sideh)) {
				zz = zz + side;
			}
			if(zz > (sideh)) {
				zz = zz - side;
			}
			rd = xx * xx + yy * yy + zz * zz;
			if(rd <= rcoffs) {
				rrd = 1.0 / rd;
				rrd2 = rrd * rrd;
				rrd3 = rrd2 * rrd;
				rrd4 = rrd2 * rrd2;
				rrd6 = rrd2 * rrd4;
				rrd7 = rrd6 * rrd;
				md1.epot = md1.epot + (rrd6 - rrd3);
				r148 = rrd7 - 0.5 * rrd4;
				md1.vir = md1.vir - rd * r148;
				forcex = xx * r148;
				fxi = fxi + forcex;
				md1.one[i].xforce = md1.one[i].xforce - forcex;
				forcey = yy * r148;
				fyi = fyi + forcey;
				md1.one[i].yforce = md1.one[i].yforce - forcey;
				forcez = zz * r148;
				fzi = fzi + forcez;
				md1.one[i].zforce = md1.one[i].zforce - forcez;
				md1.interactions++;
			}
		}
		xforce = xforce + fxi;
		yforce = yforce + fyi;
		zforce = zforce + fzi;
	}
	public double mkekin(final double hsq2) {
		double sumt = 0.0;
		xforce = xforce * hsq2;
		yforce = yforce * hsq2;
		zforce = zforce * hsq2;
		xvelocity = xvelocity + xforce;
		yvelocity = yvelocity + yforce;
		zvelocity = zvelocity + zforce;
		sumt = (xvelocity * xvelocity) + (yvelocity * yvelocity) + (zvelocity * zvelocity);
		return sumt;
	}
	public double velavg(final double vaverh, final double h, final md md1) {
		double velt = 0.0;
		double sq = 0.0;
		sq = Math.sqrt(xvelocity * xvelocity + yvelocity * yvelocity + zvelocity * zvelocity);
		if(sq > vaverh) {
			md1.count = md1.count + 1.0;
		}
		velt = sq;
		return velt;
	}
	public void dscal(final double sc, final int incx) {
		xvelocity = xvelocity * sc;
		yvelocity = yvelocity * sc;
		zvelocity = zvelocity * sc;
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

