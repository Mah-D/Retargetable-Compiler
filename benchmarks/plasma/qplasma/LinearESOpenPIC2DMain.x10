value PoissonSolver {
	public static final double PI4I = 0.5 / 6.28318530717959;
	public static final double SQT2I = 0.707106781186548;
	public static final double SQT2PI = 0.797884560802865;
	public static final int GREENS_IDX = 0;
	public static final int SHAPE_IDX = 1;
	public static final int ELECX_IDX = 2;
	public static final int ELECY_IDX = 3;
	public static final double AR = 0.912871;
	public final int x;
	public final int y;
	public final int xBits;
	public final int yBits;
	public final double ari;
	public final double affp;
	public final FourierTransform2D fft;
	public final double[:rank==3] ffg;
	public final double value[:rank==2] ffg2;
	public PoissonSolver(final int xBits, final int yBits, final double affp) {
		this.xBits = xBits;
		this.yBits = yBits;
		this.affp = affp;
		final int x0 = 1 << xBits;
		final int y0 = 1 << yBits;
		x = x0;
		y = y0;
		ari = 0;
		final FourierTransform2D fft0 = new FourierTransform2D(yBits + 1, xBits + 1);
		fft = fft0;
		final double[:rank==3] tables = initTables(fft0, x0, y0, affp);
		ffg = makeFFG(tables, x0, y0);
		ffg2 = makeFFG2(tables, x0, y0);
		System.out.println("Poisson Solver initialized");
	}
	public double[:rank==3] initTables(final FourierTransform2D fft, final int x, final int y, final double affp) {
		final region(:rank==1) r1 = [0 : x - 1];
		final region(:rank==1) r2 = [0 : y];
		final region(:rank==1) r3 = [0 : 3];
		final dist(:rank==3) dTable1 = X10Util.extendDistRank3D(X10Util.distBlockStar2(r1, r2), r3);
		final place first = place.FIRST_PLACE;
		final dist(:rank==3) dTable2 = (dist(:rank==3))([x : x, 0 : y, 0 : 3] -> first);
		final dist(:rank==3) dTable = dTable1 || dTable2;
		final double[:rank==3] table = new double[dTable];
		System.out.println("Init: Green's function");
		initGreensFnTable(table, fft, x, y, affp);
		System.out.println("Init: Shape factor");
		initShapeFactorTable(table, fft, x, y, affp);
		System.out.println("Init: X Electric field");
		initElectricFieldXTable(table, fft, x, y, affp);
		System.out.println("Init: Y Electric field");
		initElectricFieldYTable(table, fft, x, y, affp);
		return table;
	}
	public double[:rank==3] makeFFG(final double[:rank==3] table, final int x, final int y) {
		final region(:rank==1) r1 = [0 : x - 1];
		final region(:rank==1) r2 = [0 : y];
		final region(:rank==1) r3 = [0 : 3];
		final dist(:rank==3) dResult = X10Util.extendDistRank3D(X10Util.distBlockStar2(r1, r2), r3);
		return new double[dResult](point(:rank==3)pt) {
			return table[pt];
		};
	}
	public double value[:rank==2] makeFFG2(final double[:rank==3] table, final int x, final int y) {
		final region(:rank==2) rResult = [0 : y, 0 : 3];
		return (double value[:rank==2])new double value[rResult](point(:rank==2)[i, j]) {
			final place pHere = here;
			final dist(:rank==1) dDst = [0 : 0] -> here;
			final double[:rank==1] rcv = new double[dDst];
			finish
				async(place.FIRST_PLACE) {
					final double val = table[x, i, j];
					finish
						async(pHere) {
							rcv[0] = val;
						}
				}
			return rcv[0];
		};
	}
	public void initGreensFnTable(final double[:rank==3] table, final FourierTransform2D fft, final int x, final int y, final double affp) {
		final region(:rank==1) r1 = [0 : 2 * y - 1];
		final region(:rank==1) r2 = [0 : 2 * x - 1];
		final dist(:rank==2) dGreen = X10Util.distBlockStar2(r1, r2);
		final double[:rank==2] f = new double[dGreen];
		final double invRadius = (AR > 0.0)? 1.0 / AR : 0.0;
		final double N = 4 * x * y;
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				if(pl[0] <= 2 * y) {
					final region(:rank==2) rLocal = X10Util.get2DLRegion(dGreen);
					foreach(point(:rank==2) p : rLocal){
						final double x1 = Math.pow((p[0] > y)? p[0] - (2 * y) : p[0], 2);
						final double x2 = Math.pow((p[1] > x)? p[1] - (2 * x) : p[1], 2);
						final double r = Math.sqrt(x1 + x2);
						f[p] = potentialField(r, invRadius, affp);
					}
				}
			}
		final Complex[:rank==2] ft = fft.inverseTransformD(f);
		genTable1(table, ft, GREENS_IDX, x, y);
	}
	public void initShapeFactorTable(final double[:rank==3] table, final FourierTransform2D fft, final int x, final int y, final double affp) {
		final region(:rank==1) r1 = [0 : 2 * y - 1];
		final region(:rank==1) r2 = [0 : 2 * x - 1];
		final dist(:rank==2) dShape = X10Util.distBlockStar2(r1, r2);
		final double[:rank==2] f = new double[dShape];
		final double invRadius = (AR > 0.0)? 1.0 / AR : 0.0;
		final double N = 4 * x * y;
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				if(pl[0] <= 2 * y) {
					final region(:rank==2) rLocal = X10Util.get2DLRegion(dShape);
					foreach(point(:rank==2) p : rLocal){
						final double x1 = Math.pow((p[0] > y)? p[0] - (2 * y) : p[0], 2);
						final double x2 = Math.pow((p[1] > x)? p[1] - (2 * x) : p[1], 2);
						final double r = Math.sqrt(x1 + x2);
						f[p] = particleShape(r, invRadius, affp);
					}
				}
			}
		final Complex[:rank==2] ft = fft.inverseTransformD(f);
		genTable1(table, ft, SHAPE_IDX, x, y);
	}
	public void initElectricFieldXTable(final double[:rank==3] table, final FourierTransform2D fft, final int x, final int y, final double affp) {
		final region(:rank==1) r1 = [0 : 2 * y - 1];
		final region(:rank==1) r2 = [0 : 2 * x - 1];
		final dist(:rank==2) dElecX = X10Util.distBlockStar2(r1, r2);
		final double[:rank==2] f = new double[dElecX];
		final double invRadius = (AR > 0.0)? 1.0 / AR : 0.0;
		final double N = 4 * x * y;
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				if(pl[0] <= 2 * y) {
					final region(:rank==2) rLocal = X10Util.get2DLRegion(dElecX);
					foreach(point(:rank==2) p : rLocal){
						final double x1 = (p[0] > y)? p[0] - (2 * y) : p[0];
						final double xs1 = Math.pow(x1, 2);
						final double x2 = (p[1] > x)? p[1] - (2 * x) : p[1];
						final double xs2 = Math.pow(x2, 2);
						final double r = Math.sqrt(xs1 + xs2);
						final double val = radialElectricField(r, invRadius, affp);
						f[p] = (r > 0.0)? val * (x2 / r) : val;
					}
				}
			}
		final Complex[:rank==2] ft = fft.inverseTransformD(f);
		genTable2(table, ft, ELECX_IDX, x, y);
	}
	public void initElectricFieldYTable(final double[:rank==3] table, final FourierTransform2D fft, final int x, final int y, final double affp) {
		final region(:rank==1) r1 = [0 : 2 * y - 1];
		final region(:rank==1) r2 = [0 : 2 * x - 1];
		final dist(:rank==2) dElecX = X10Util.distBlockStar2(r1, r2);
		final double[:rank==2] f = new double[dElecX];
		final double invRadius = (AR > 0.0)? 1.0 / AR : 0.0;
		final double N = 4 * x * y;
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				if(pl[0] <= 2 * y) {
					final region(:rank==2) rLocal = X10Util.get2DLRegion(dElecX);
					foreach(point(:rank==2) p : rLocal){
						final double y1 = (p[0] > y)? p[0] - (2 * y) : p[0];
						final double ys1 = Math.pow(y1, 2);
						final double y2 = (p[1] > x)? p[1] - (2 * x) : p[1];
						final double ys2 = Math.pow(y2, 2);
						final double r = Math.sqrt(ys1 + ys2);
						final double val = radialElectricField(r, invRadius, affp);
						f[p] = (r > 0.0)? val * (y1 / r) : val;
					}
				}
			}
		final Complex[:rank==2] ft = fft.inverseTransformD(f);
		genTable3(table, ft, ELECY_IDX, x, y);
	}
	public void genTable1(final double[:rank==3] table, final Complex[:rank==2] ft, final int index, final int x, final int y) {
		final int N = 4 * x * y;
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				if(pl[0] <= x) {
					final dist(:rank==2) dFT = ft.distribution;
					final dist(:rank==3) dTable = table.distribution;
					final region(:rank==1) rLocalFT1 = X10Util.getLRank2D(dFT, 0);
					final region(:rank==1) rLocalT2 = X10Util.getLRank3D(dTable, 1);
					foreach(point(:rank==2) [i, j] : [rLocalFT1, rLocalT2]){
						table[i, j, index] = N * ft[i, j].getReal();
					}
					if(here.isFirst()) {
						foreach(point(:rank==1) [i] : [1 : y - 1]){
							table[x, i, index] = N * ft[0, 2 * y - i].getReal();
						}
						table[x, 0, index] = N * ft[0, 0].getImag();
						table[x, y, index] = N * ft[0, y].getImag();
					}
				}
			}
	}
	public void genTable2(final double[:rank==3] table, final Complex[:rank==2] ft, final int index, final int x, final int y) {
		final int N = 4 * x * y;
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				if(pl[0] <= x) {
					final dist(:rank==2) dFT = ft.distribution;
					final dist(:rank==3) dTable = table.distribution;
					final region(:rank==1) rLocalFT1 = X10Util.getLRank2D(dFT, 0);
					final region(:rank==1) rLocalT2 = X10Util.getLRank3D(dTable, 1);
					foreach(point(:rank==1) [i] : rLocalFT1){
						if(i > 0) {
							foreach(point(:rank==1) [j] : rLocalT2){
								table[i, j, index] = N * ft[i, j].getImag();
							}
						}
					}
					if(here.isFirst()) {
						foreach(point(:rank==1) [i1] : [1 : y - 1]){
							final int i2 = 2 * y - i1;
							table[0, i1, index] = N * ft[0, i1].getReal();
							table[x, i1, index] = N * ft[0, i2].getReal();
						}
						table[0, 0, index] = N * ft[0, 0].getReal();
						table[x, 0, index] = N * ft[0, 0].getImag();
						table[0, y, index] = N * ft[0, y].getReal();
						table[x, y, index] = N * ft[0, y].getImag();
					}
				}
			}
	}
	public void genTable3(final double[:rank==3] table, final Complex[:rank==2] ft, final int index, final int x, final int y) {
		final int N = 4 * x * y;
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				if(pl[0] <= x) {
					final dist(:rank==2) dFT = ft.distribution;
					final dist(:rank==3) dTable = table.distribution;
					final region(:rank==1) rLocalFT1 = X10Util.getLRank2D(dFT, 0);
					final region(:rank==1) rLocalT2 = X10Util.getLRank3D(dTable, 1);
					foreach(point(:rank==1) [i] : rLocalFT1){
						if(i > 0) {
							foreach(point(:rank==1) [j] : [1 : y - 1]){
								table[i, j, index] = N * ft[i, j].getImag();
							}
							table[i, 0, index] = N * ft[i, 0].getReal();
							table[i, y, index] = N * ft[i, y].getReal();
						}
					}
					if(here.isFirst()) {
						foreach(point(:rank==1) [i1] : [1 : y - 1]){
							final int i2 = 2 * y - i1;
							table[0, i1, index] = N * ft[0, i1].getImag();
							table[x, i1, index] = N * ft[0, i2].getImag();
						}
						table[0, 0, index] = N * ft[0, 0].getReal();
						table[x, 0, index] = N * ft[0, 0].getImag();
						table[0, y, index] = N * ft[0, y].getReal();
						table[x, y, index] = N * ft[0, y].getImag();
					}
				}
			}
	}
	public Complex[:rank==2] makeForceArray() {
		final dist(:rank==2) dResult = X10Util.distBlockStar1([0 : 2 * y - 1, 0 : x - 1]);
		return new Complex[dResult];
	}
	public double getForceCharge(final Complex[:rank==2] q, final Complex[:rank==2] forceX, final Complex[:rank==2] forceY) {
		final dist(:rank==2) dForce = X10Util.distBlockStar1([0 : x - 1, 0 : 2 * y - 1]);
		final Complex[:rank==2] fxfft = new Complex[dForce];
		final Complex[:rank==2] fyfft = new Complex[dForce];
		final Complex[:rank==2] qfft = fft.inverseTransformC(q);
		final double we = solveForceCharge(qfft, fxfft, fyfft);
		final Complex[:rank==2] fx = fft.transformC(fxfft);
		final Complex[:rank==2] fy = fft.transformC(fyfft);
		finish
			ateach(point(:rank==2) pt : forceX){
				forceX[pt] = fx[pt];
				forceY[pt] = fy[pt];
			}
		return we;
	}
	public double solveForceCharge(final Complex[:rank==2] q, final Complex[:rank==2] forceX, final Complex[:rank==2] forceY) {
		final dist(:rank==1) dUnique = (dist(:rank==1))dist.UNIQUE;
		final double[:rank==1] energy = new double[dUnique](point(:rank==1)pt) {
			return 0.0;
		};
		for(point(:rank==1) pl : dist.UNIQUE)
			finish
				async(dist.UNIQUE.get(pl)) {
					if(pl[0] <= x) {
						final dist(:rank==3) dFFG = ffg.distribution;
						final region(:rank==3) rLocal = X10Util.get3DLRegion(dFFG);
						final region(:rank==1) rLocal1 = X10Util.getRank3D(rLocal, 0);
						final region(:rank==1) rLocal2 = X10Util.getRank3D(rLocal, 1);
						double tmp3 = -1.0;
						for(point(:rank==1) [i] : rLocal1){
							tmp3 = (i % 2 == 0)? 1.0 : -1.0;
							if(i > 0) {
								double tmp2 = ffg[i, 0, ELECY_IDX];
								for(point(:rank==1) [j1] : [1 : y - 1]){
									final int j2 = 2 * y - j1;
									final double tmp0 = ((here.isFirst())? ffg[0, j1, ELECX_IDX] : ffg2[j1, ELECX_IDX]);
									final double tmp1 = tmp3 * tmp0;
									tmp2 = -tmp2;
									final Complex cx = new Complex(tmp1, ffg[i, j1, ELECX_IDX]);
									final Complex cy = new Complex(tmp2, ffg[i, j1, ELECY_IDX]);
									forceX[i, j1] = cx.mult(q[i, j1]);
									forceX[i, j2] = cx.mult(q[i, j2]);
									forceY[i, j1] = cy.mult(q[i, j1]);
									forceY[i, j2] = (cy.getConjg()).mult(q[i, j2]);
									energy[pl] = energy[pl] + (ffg[i, j1, GREENS_IDX] * (q[i, j1].multConjg() + q[i, j2].multConjg()));
								}
								double tmp0 = ((here.isFirst())? ffg[0, 0, ELECX_IDX] : ffg2[0, ELECX_IDX]);
								double tmp1 = tmp3 * tmp0;
								final Complex x0 = new Complex(tmp1, ffg[i, 0, ELECX_IDX]);
								forceX[i, 0] = x0.mult(q[i, 0]);
								forceY[i, 0] = q[i, 0].multS(ffg[i, 0, ELECY_IDX]);
								energy[pl] = energy[pl] + (ffg[i, 0, GREENS_IDX] * q[i, 0].multConjg());
								tmp0 = ((here.isFirst())? ffg[0, y, ELECX_IDX] : ffg2[y, ELECX_IDX]);
								tmp1 = tmp3 * tmp0;
								final Complex xNY = new Complex(tmp1, ffg[i, y, ELECX_IDX]);
								forceX[i, y] = xNY.mult(q[i, y]);
								forceY[i, y] = q[i, y].multS(ffg[i, y, ELECY_IDX]);
								energy[pl] = energy[pl] + (ffg[i, y, GREENS_IDX] * q[i, y].multConjg());
							}
						}
						if(here.isFirst()) {
							tmp3 = ffg[0, 0, ELECY_IDX];
							for(point(:rank==1) [j] : [1 : y - 1]){
								tmp3 = -tmp3;
								final Complex s = new Complex(tmp3, ffg[0, j, ELECY_IDX]);
								forceX[0, j] = q[0, j].multS(ffg[0, j, ELECX_IDX]);
								forceY[0, j] = s.mult(q[0, j]);
								energy[pl] = energy[pl] + (ffg[0, j, GREENS_IDX] * q[0, j].multConjg());
							}
							tmp3 = ffg2[0, ELECY_IDX];
							for(point(:rank==1) [j1] : [1 : y - 1]){
								tmp3 = -tmp3;
								final int j2 = 2 * y - j1;
								final Complex s = new Complex(tmp3, ffg2[j1, ELECY_IDX]);
								forceX[0, j2] = q[0, j2].multS(ffg[0, j1, ELECX_IDX]);
								forceY[0, j2] = s.mult(q[0, j2]);
								energy[pl] = energy[pl] + (ffg2[j1, GREENS_IDX] * q[0, j2].multConjg());
							}
							final double q00R = q[0, 0].getReal();
							final double q00I = q[0, 0].getImag();
							forceX[0, 0] = new Complex(ffg[0, 0, ELECX_IDX] * q00R, ffg2[0, ELECX_IDX] * q00I);
							forceY[0, 0] = new Complex(ffg[0, 0, ELECY_IDX] * q00R, ffg2[0, ELECY_IDX] * q00I);
							energy[pl] = energy[pl] + 0.5 * ((ffg[0, 0, GREENS_IDX] * Math.pow(q00R, 2)) + (ffg2[0, GREENS_IDX] * Math.pow(q00I, 2)));
							final double q0NYR = q[0, y].getReal();
							final double q0NYI = q[0, y].getImag();
							forceX[0, y] = new Complex(ffg[0, y, ELECX_IDX] * q0NYR, ffg2[y, ELECX_IDX] * q0NYI);
							forceY[0, y] = new Complex(ffg[0, y, ELECY_IDX] * q0NYR, ffg2[y, ELECY_IDX] * q0NYI);
							energy[pl] = energy[pl] + 0.5 * ((ffg[0, y, GREENS_IDX] * Math.pow(q0NYR, 2)) + (ffg2[y, GREENS_IDX] * Math.pow(q0NYI, 2)));
						}
					}
				}
		return 4.0 * x * y * energy.sum();
	}
	public double potentialField(final double r, final double ari, final double affp) {
		final double anorm = affp * PI4I;
		if(ari > 0) {
			if(r == 0.0) {
				return anorm * SQT2PI * ari;
			}
			else{
				return anorm * errorFn(r * SQT2I * ari) / r;
			}
		}
		else{
			if(r == 0.0) {
				return 0.0;
			}
			else{
				return anorm / r;
			}
		}
	}
	public double particleShape(final double r, final double ari, final double affp) {
		final double anorm = affp * Math.pow(0.5 * SQT2PI * ari, 2);
		if(ari > 0.0) {
			if(r == 0.0) {
				return anorm;
			}
			else{
				final double at1 = X10Util.minDouble(r * SQT2I * ari, 8.0);
				return anorm * Math.exp(-(at1 * at1));
			}
		}
		else{
			if(r == 0.0) {
				return affp;
			}
			else{
				return 0.0;
			}
		}
	}
	public double radialElectricField(final double r, final double ari, final double affp) {
		final double anorm = affp * PI4I;
		if(ari > 0.0) {
			if(r == 0.0) {
				return 0.0;
			}
			else{
				final double ri = 1.0 / r;
				final double at1 = X10Util.minDouble(r * SQT2I * ari, 8.0);
				return anorm * ri * (errorFn(at1) * ri - SQT2PI * ari * Math.exp(-(at1 * at1)));
			}
		}
		else{
			if(r == 0.0) {
				return 0.0;
			}
			else{
				return anorm / (r * r);
			}
		}
	}
	public double errorFn(final double x) {
		final double p = 0.3275911;
		final double a1 = 0.254829592;
		final double a2 = -0.284496736;
		final double a3 = 1.421413741;
		final double a4 = -1.453152027;
		final double a5 = 1.061405429;
		final double f = Math.abs(x);
		final double t = 1.0 / (1.0 + p * f);
		double ret = 0.0;
		if(f <= 8.0) {
			ret = 1.0 - t * (a1 + t * (a2 + t * (a3 + t * (a4 + t * a5)))) * Math.exp(-x * x);
		}
		else{
			ret = 1.0;
		}
		if(x < 0) {
			ret = -ret;
		}
		return ret;
	}
	public double expIntNL(final double x) {
		final double a0 = -0.57721566;
		final double a1 = 0.99999193;
		final double a2 = -0.24991055;
		final double a3 = 0.05519968;
		final double a4 = -0.00976004;
		final double a5 = 0.00107857;
		final double b1 = 8.5733287401;
		final double b2 = 18.0590169730;
		final double b3 = 8.6347608925;
		final double b4 = 0.2677737343;
		final double c1 = 9.5733223454;
		final double c2 = 25.6329561486;
		final double c3 = 21.0996530827;
		final double c4 = 3.9584969228;
		if(x < 1.0) {
			return a0 + x * (a1 + x * (a2 + x * (a3 + x * (a4 + x * a5))));
		}
		else
			if(x < 50.0) {
				return Math.log(x) + ((Math.exp(-x) / x) * ((b4 + x * (b3 + x * (b2 + x * (b1 + x)))) / (c4 + x * (c3 + x * (c2 + x * (c1 + x))))));
			}
			else{
				return Math.log(x);
			}
	}
	public String toString() {
		return "PoisonSolver: xbits = " + xBits + " ybits = " + yBits;
	}
}

public class LinearESOpenPIC2DMain {
	public static void main(String[] args) {
{
			Timer tmr = new Timer();
			int count = 0;
			tmr.start(count);
			new LinearESOpenPIC2D().run();
			tmr.stop(count);
			System.out.println("Wall-clock time for plasma: " + tmr.readTimer(count) + " secs");
		}
	}
}

value Complex {
	private final double real;
	private final double imag;
	public Complex(final double real, final double imag) {
		this.real = real;
		this.imag = imag;
	}
	public double getReal() {
		return real;
	}
	public double getImag() {
		return imag;
	}
	public Complex add(final Complex n) {
		return new Complex(getReal() + n.getReal(), getImag() + n.getImag());
	}
	public Complex sub(final Complex n) {
		return new Complex(getReal() - n.getReal(), getImag() - n.getImag());
	}
	public Complex mult(final Complex n) {
		final double a = getReal();
		final double b = getImag();
		final double c = n.getReal();
		final double d = n.getImag();
		return new Complex(a * c - b * d, a * d + b * c);
	}
	public Complex multS(final double r) {
		return new Complex(r * getReal(), r * getImag());
	}
	public Complex getConjg() {
		return new Complex(getReal(), -getImag());
	}
	public double multConjg() {
		final double a = getReal();
		final double b = getImag();
		return (a * a + b * b);
	}
	public boolean complexEquals(final Complex c) {
		return ((Math.abs(getReal() - c.getReal()) < X10Util.ERROR) && (Math.abs(getImag() - c.getImag()) < X10Util.ERROR));
	}
	public String toString() {
		final double r = getReal();
		final double i = getImag();
		return "(" + r + "," + i + ")";
	}
}

class Random {
	private int flag;
	private double r0;
	private int r1;
	private int r2;
	private int r4;
	private int r5;
	private double h1l;
	private double h1u;
	private double h2l;
	public Random() {
		flag = 0;
		r0 = 0.0;
		r1 = 885098780;
		r2 = 1824280461;
		r4 = 1396483093;
		r5 = 55318673;
		h1l = 65531.0;
		h1u = 32767.0;
		h2l = 65525.0;
	}
	public double nextNormal() {
		double ret = 0.0;
		if(flag != 0) {
			ret = r0;
			r0 = 0.0;
			flag = 0;
		}
		else{
			int isc = 65536;
			double asc = isc;
			double bsc = asc * asc;
			int i1 = r1 - (r1 / isc) * isc;
			double r3 = h1l * r1 + asc * h1u * i1;
			i1 = (int)(r3 / bsc);
			r3 = r3 - (i1 * bsc);
			bsc = 0.5 * bsc;
			i1 = r2 / isc;
			isc = r2 - i1 * isc;
			r0 = h1l * r2 + asc * h1u * isc;
			asc = 1.0 / bsc;
			isc = (int)(r0 * asc);
			r2 = (int)(r0 - isc * bsc);
			r3 = r3 + isc + 2.0 * h1u * i1;
			isc = (int)(r3 * asc);
			r1 = (int)(r3 - isc * bsc);
			double temp = Math.sqrt(-2.0 * Math.log((r1 + r2 * asc) * asc));
			isc = 65536;
			asc = isc;
			bsc = asc * asc;
			i1 = r4 - (r4 / isc) * isc;
			r3 = h2l * r4 + asc * h1u * i1;
			i1 = (int)(r3 / bsc);
			r3 = r3 - (i1 * bsc);
			bsc = 0.5 * bsc;
			i1 = r5 / isc;
			isc = r5 - i1 * isc;
			r0 = h2l * r5 + asc * h1u * isc;
			asc = 1.0 / bsc;
			isc = (int)(r0 * asc);
			r5 = (int)(r0 - isc * bsc);
			r3 = r3 + (isc + 2.0 * h1u * i1);
			isc = (int)(r3 * asc);
			r4 = (int)(r3 - isc * bsc);
			r0 = 6.28318530717959 * ((r4 + r5 * asc) * asc);
			ret = temp * Math.sin(r0);
			r0 = temp * Math.cos(r0);
			flag = 1;
		}
		return ret;
	}
}

class X10Util {
	public static final boolean DEBUG = true;
	public static final boolean ENABLE_CHECKS = true;
	public static final double ERROR = 1.0e-13;
	public static double maxDouble(final double d1, final double d2) {
		return (d1 >= d2)? d1 : d2;
	}
	public static double minDouble(final double d1, final double d2) {
		return (d1 >= d2)? d2 : d1;
	}
	public static int maxInt(final int i1, final int i2) {
		return (i1 >= i2)? i1 : i2;
	}
	public static int minInt(final int i1, final int i2) {
		return (i1 >= i2)? i2 : i1;
	}
	public static region(:rank==2) prependRegionRank2D(final region(:rank==1) r1, final region(:rank==1) r2) {
		return extendRegionRank2D(r1, r2);
	}
	public static region(:rank==3) prependRegionRank3D(final region(:rank==1) r1, final region(:rank==2) r2) {
		return [r1, getRank2D(r2, 0), getRank2D(r2, 1)];
	}
	public static region(:rank==2) extendRegionRank2D(final region(:rank==1) r1, final region(:rank==1) r2) {
		return [r1, r2];
	}
	public static region(:rank==3) extendRegionRank3D(final region(:rank==2) r1, final region(:rank==1) r2) {
		return [getRank2D(r1, 0), getRank2D(r1, 1), r2];
	}
	public static dist(:rank==2) prependDistRank2D(final region(:rank==1) r1, final dist(:rank==1) d2) {
		dist(:rank==2) dResult = (dist(:rank==2))(region.factory.emptyRegion(2) -> here);
		for(point(:rank==1) pl : dist.UNIQUE){
			final place p = dist.UNIQUE.get(pl);
			final region(:rank==1) rLocal = (region(:rank==1))(d2 | p).region;
			dResult = dResult || (prependRegionRank2D(r1, rLocal) -> p);
		}
		return dResult;
	}
	public static dist(:rank==3) prependDistRank3D(final region(:rank==1) r1, final dist(:rank==2) d2) {
		dist(:rank==3) dResult = (dist(:rank==3))(region.factory.emptyRegion(3) -> here);
		for(point(:rank==1) pl : dist.UNIQUE){
			final place p = dist.UNIQUE.get(pl);
			final region(:rank==2) rLocal = (region(:rank==2))(d2 | p).region;
			dResult = dResult || (prependRegionRank3D(r1, rLocal) -> p);
		}
		return dResult;
	}
	public static dist(:rank==2) extendDistRank2D(final dist(:rank==1) d1, final region(:rank==1) r2) {
		dist(:rank==2) dResult = (dist(:rank==2))(region.factory.emptyRegion(2) -> here);
		for(point(:rank==1) pl : dist.UNIQUE){
			final place p = dist.UNIQUE.get(pl);
			final region(:rank==1) rLocal = (region(:rank==1))(d1 | p).region;
			dResult = dResult || (extendRegionRank2D(rLocal, r2) -> p);
		}
		return dResult;
	}
	public static dist(:rank==3) extendDistRank3D(final dist(:rank==2) d1, final region(:rank==1) r2) {
		dist(:rank==3) dResult = (dist(:rank==3))(region.factory.emptyRegion(3) -> here);
		for(point(:rank==1) pl : dist.UNIQUE){
			final place p = dist.UNIQUE.get(pl);
			final region(:rank==2) rLocal = (region(:rank==2))(d1 | p).region;
			dResult = dResult || (extendRegionRank3D(rLocal, r2) -> p);
		}
		return dResult;
	}
	public static dist(:rank==1) distBlock(final region(:rank==1) r) {
		if(r.low() != 0) {
			throw new RuntimeException("distBlock only applies to rails");
		}
		if(r.high() != r.size() - 1) {
			throw new RuntimeException("distblock only applies to rails");
		}
		int blockSize = r.size() / place.MAX_PLACES;
		dist(:rank==1) dResult = (dist(:rank==1))(region.factory.emptyRegion(1) -> here);
		for(point(:rank==1) pl : dist.UNIQUE){
			final place p = dist.UNIQUE.get(pl);
			dist(:rank==1) ext = (dist(:rank==1))([pl[0] * blockSize : ((pl[0] + 1) * blockSize) - 1] -> p);
			dResult = dResult || ext;
		}
		int diff = r.size() - blockSize * place.MAX_PLACES;
		if(blockSize * place.MAX_PLACES != r.size()) {
			place l = place.places(place.MAX_PLACES - 1);
			dist(:rank==1) ext = (dist(:rank==1))([r.size() - diff : r.size() - 1] -> l);
			dResult = dResult || ext;
		}
		return dResult;
	}
	public static dist(:rank==2) distBlockStar1(final region(:rank==2) r) {
		final region(:rank==1) r1 = getRank2D(r, 0);
		final dist(:rank==1) d1 = distBlock(r1);
		return extendDistRank2D(d1, getRank2D(r, 1));
	}
	public static dist(:rank==2) distBlockStar2(final region(:rank==1) r1, final region(:rank==1) r2) {
		return distBlockStar1([r1, r2]);
	}
	public static dist(:rank==2) distStarBlock1(final region(:rank==2) r) {
		final region(:rank==1) r2 = getRank2D(r, 1);
		final dist(:rank==1) d2 = distBlock(r2);
		return prependDistRank2D(getRank2D(r, 0), d2);
	}
	public static dist(:rank==2) distStarBlock2(final region(:rank==1) r1, final region(:rank==1) r2) {
		return distStarBlock1([r1, r2]);
	}
	public static boolean isDistBlockStar(final dist(:rank==2) d) {
		if(ENABLE_CHECKS) {
			final region(:rank==2) rd = d.region;
			final region(:rank==1) r1 = getRank2D(rd, 0);
			final region(:rank==1) r2 = getRank2D(rd, 1);
			final dist(:rank==1) dRef = (dist(:rank==1))dist.factory.block(r1);
			for(point(:rank==1) pl : dist.UNIQUE){
				final place p = dist.UNIQUE.get(pl);
				final region(:rank==2) rLocal = (region(:rank==2))(d | p).region;
				final region(:rank==1) rRefLocal = (region(:rank==1))(dRef | p).region;
				if(!(getRank2D(rLocal, 0).equals(rRefLocal))) {
					return false;
				}
				else
					if(!(getRank2D(rLocal, 1).equals(r2))) {
						if(rRefLocal.size() > 0) {
							return false;
						}
					}
			}
		}
		return true;
	}
	public static boolean isDistStarBlock(final dist(:rank==2) d) {
		if(ENABLE_CHECKS) {
			final region(:rank==2) rd = d.region;
			final region(:rank==1) r1 = getRank2D(rd, 0);
			final region(:rank==1) r2 = getRank2D(rd, 1);
			final dist(:rank==1) dRef = (dist(:rank==1))dist.factory.block(r2);
			for(point(:rank==1) pl : dist.UNIQUE){
				final place p = dist.UNIQUE.get(pl);
				final region(:rank==2) rLocal = (region(:rank==2))(d | p).region;
				final region(:rank==1) rRefLocal = (region(:rank==1))(dRef | p).region;
				if(!(getRank2D(rLocal, 0).equals(r1) && getRank2D(rLocal, 1).equals(rRefLocal))) {
					return false;
				}
			}
		}
		return true;
	}
	public static dist(:rank==1) get2DDistRank(final dist(:rank==2) d, final int n) {
		if(n > 2 || n < 0) {
			throw new RuntimeException("Rank must within bounds");
		}
		dist(:rank==1) dResult = (dist(:rank==1))(region.factory.emptyRegion(1) -> here);
		for(point(:rank==1) pl : dist.UNIQUE){
			final place p = dist.UNIQUE.get(pl);
			final region(:rank==2) rLocal = (d | p).region;
			final region(:rank==1) rLocalN = getRank2D(rLocal, n);
			dResult = dResult || ((rLocalN - dResult.region) -> p);
		}
		return dResult;
	}
	public static region(:rank==2) transposeRegion(final region(:rank==2) r) {
		return [getRank2D(r, 1), getRank2D(r, 0)];
	}
	public static dist(:rank==2) transposeDist(final dist(:rank==2) d) {
		dist(:rank==2) dResult = (dist(:rank==2))(region.factory.emptyRegion(2) -> here);
		for(point(:rank==1) pl : dist.UNIQUE){
			final place p = dist.UNIQUE.get(pl);
			final region(:rank==2) rLocal = (region(:rank==2))(d | p).region;
			dResult = dResult || (transposeRegion(rLocal) -> p);
		}
		return dResult;
	}
	public static dist(:rank==2) transposeBlockStar(final dist(:rank==2) d) {
		final region(:rank==2) rd = d.region;
		final region(:rank==1) r1 = getRank2D(rd, 0);
		final region(:rank==1) r2 = getRank2D(rd, 1);
		return extendDistRank2D(distBlock(r2), r1);
	}
	public static boolean pullBoolean(final boolean[:rank==1] b, final point(:rank==1) pt) {
		if(!b.region.contains(pt)) {
			println("pt must be contained in b.region: " + b.region + " " + pt);
			throw new RuntimeException("pullBoolean Exception: " + pt);
		}
		final place pHere = here;
		final dist(:rank==1) dDst = [0 : 0] -> here;
		final boolean[:rank==1] result = new boolean[dDst];
		finish
			async(b.distribution.get(pt)) {
				final boolean val = b[pt];
				async(pHere) {
					result[0] = val;
				}
			}
		return result[0];
	}
	public static Complex pullComplex(final Complex[:rank==1] c, final point(:rank==1) pt) {
		if(!c.region.contains(pt)) {
			println("pt must be contained in c.region: " + c.region + " " + pt);
			throw new RuntimeException("Complex Exception: " + pt);
		}
		final place pHere = here;
		final dist(:rank==1) dDst = [0 : 0] -> here;
		final Complex[:rank==1] result = new Complex[dDst];
		finish
			async(c.distribution.get(pt)) {
				final Complex val = c[pt];
				async(pHere) {
					result[0] = val;
				}
			}
		return result[0];
	}
	public static int pullInt(final int[:rank==1] i, final point(:rank==1) pt) {
		if(!i.region.contains(pt)) {
			println("pt must be contained in i.region: " + i.region + " " + pt);
			throw new RuntimeException("pullDouble Exception: " + pt);
		}
		final place pHere = here;
		final dist(:rank==1) dDst = [0 : 0] -> here;
		final int[:rank==1] result = new int[dDst];
		finish
			async(i.distribution.get(pt)) {
				final int val = i[pt];
				async(pHere) {
					result[0] = val;
				}
			}
		return result[0];
	}
	public static double pullDouble(final double[:rank==1] d, final point(:rank==1) pt) {
		if(!d.region.contains(pt)) {
			println("pt must be contained in d.region: " + d.region + " " + pt);
			throw new RuntimeException("pullDouble Exception: " + pt);
		}
		final place pHere = here;
		final dist(:rank==1) dDst = [0 : 0] -> here;
		final double[:rank==1] result = new double[dDst];
		finish
			async(d.distribution.get(pt)) {
				final double val = d[pt];
				async(pHere) {
					result[0] = val;
				}
			}
		return result[0];
	}
	public static region(:rank==1) getRank2D(final region(:rank==2) r, final int n) {
		return (region(:rank==1))r.rank(n);
	}
	public static region(:rank==1) getRank3D(final region(:rank==3) r, final int n) {
		return (region(:rank==1))r.rank(n);
	}
	public static region(:rank==1) getLRank2D(final dist(:rank==2) d, final int n) {
		return getPRank2D(d, here, n);
	}
	public static region(:rank==1) getLRank3D(final dist(:rank==3) d, final int n) {
		return getPRank3D(d, here, n);
	}
	public static region(:rank==1) getPRank2D(final dist(:rank==2) d, final place p, final int n) {
		return getRank2D((d | p).region, n);
	}
	public static region(:rank==1) getPRank3D(final dist(:rank==3) d, final place p, final int n) {
		return getRank3D((d | p).region, n);
	}
	public static region(:rank==1) get1DLRegion(final dist(:rank==1) d) {
		return (region(:rank==1))(d | here).region;
	}
	public static region(:rank==1) get1DPRegion(final dist(:rank==1) d, final place p) {
		return (region(:rank==1))(d | p).region;
	}
	public static region(:rank==2) get2DLRegion(final dist(:rank==2) d) {
		return (region(:rank==2))(d | here).region;
	}
	public static region(:rank==2) get2DPRegion(final dist(:rank==2) d, final place p) {
		return (region(:rank==2))(d | p).region;
	}
	public static region(:rank==3) get3DLRegion(final dist(:rank==3) d) {
		return (region(:rank==3))(d | here).region;
	}
	public static region(:rank==3) get3DPRegion(final dist(:rank==3) d, final place p) {
		return (region(:rank==3))(d | p).region;
	}
	public static void print(final String s) {
		if(DEBUG) {
			System.out.print(s);
		}
	}
	public static void println(final String s) {
		print(s);
		newline();
	}
	public static void newline() {
		print("\n");
	}
}

value FourierTransform2D {
	public final int maxBits;
	public final int nBits1;
	public final int nBits2;
	public final int length1;
	public final int length2;
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
	public Complex[:rank==2] transformD(final double[:rank==2] f) {
		return transformC(ArrayUtil.doubleToComplex(f));
	}
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
	public Complex[:rank==2] inverseTransformD(final double[:rank==2] f) {
		return inverseTransformC(ArrayUtil.doubleToComplex(f));
	}
	public int value[:rank==1] initBitReverse(final int nBits1, final int nBits2) {
		final int maxBits = X10Util.maxInt(nBits2 - 1, nBits1);
		final region(:rank==1) r = [0 : (1 << maxBits) - 1];
		return (int value[:rank==1])new int value[r](point(:rank==1)i) {
			final int i0 = i[0];
			final int i1 = (((i0 & 0x0000FFFF) << 16) | ((i0 >> 16) & 0x0000FFFF));
			final int i2 = (((i1 & 0x00FF00FF) << 8) | ((i1 >> 8) & 0x00FF00FF));
			final int i3 = (((i2 & 0x0F0F0F0F) << 4) | ((i2 >> 4) & 0x0F0F0F0F));
			final int i4 = (((i3 & 0x33333333) << 2) | ((i3 >> 2) & 0x33333333));
			final int i5 = (((i4 & 0x55555555) << 1) | ((i4 >> 1) & 0x55555555));
			return i5 >>> (java.lang.Integer.SIZE - maxBits);
		};
	}
	public Complex value[:rank==1] initSineCosine(final int length1, final int length2) {
		final int maxLength = X10Util.maxInt(length1, length2);
		final double PI2 = 6.28318530717959;
		final double k = PI2 / maxLength;
		final region(:rank==1) r = [0 : (maxLength / 2) - 1];
		return (Complex value[:rank==1])new Complex value[r](point(:rank==1)i) {
			final double theta = k * i[0];
			return new Complex(Math.cos(theta), -Math.sin(theta));
		};
	}
	public void bitReverse(final Complex[:rank==2] f, final int rnk) {
		final int nBits = (rnk == 0)? nBits1 : nBits2 - 1;
		final int r1Length = (rnk == 0)? length1 : length2 / 2;
		final int nrx = (1 << nBits) / r1Length;
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				final dist(:rank==2) dF = f.distribution;
				final region(:rank==1) rLocal1 = X10Util.getLRank2D(dF, 0);
				foreach(point(:rank==1) [j1] : [0 : r1Length - 1]){
					final int j2 = tableBitReverse[j1] >> (maxBits - nBits);
					if(j1 < j2) {
						finish
							foreach(point(:rank==1) [i] : rLocal1){
								final Complex temp = f[i, j1];
								f[i, j1] = f[i, j2];
								f[i, j2] = temp;
							}
					}
				}
			}
	}
	public void scrambleX(final Complex[:rank==2] f) {
		final int nxh = length2 / 2;
		final int nxhh = nxh / 2;
		final int kmr = X10Util.maxInt(length1, length2) / length2;
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				final dist(:rank==2) dF = f.distribution;
				final region(:rank==2) rLocal = X10Util.get2DLRegion(dF);
				final region(:rank==1) rLocal1 = X10Util.getRank2D(rLocal, 0);
				foreach(point(:rank==2) pt : [rLocal1, nxhh : nxhh]){
					f[pt] = (f[pt].getConjg()).multS(2);
					final point(:rank==2) pt0 = pt * [1, 0];
					final Complex t2 = f[pt0];
					final double t2Real = t2.getReal();
					final double t2Imag = t2.getImag();
					f[pt0] = new Complex(t2Real + t2Imag, t2Real - t2Imag);
				}
				for(point(:rank==1) [j1] : [1 : nxhh - 1]){
					final int j2 = nxh - j1;
					final Complex t0 = tableSineCosine[kmr * j1];
					final Complex t1 = new Complex(t0.getImag(), t0.getReal());
					foreach(point(:rank==1) [i] : rLocal1){
						final Complex t = f[i, j2].getConjg();
						final Complex s = f[i, j1].add(t);
						final Complex t3 = (f[i, j1].sub(t)).mult(t1);
						f[i, j1] = s.add(t3);
						f[i, j2] = (s.sub(t3)).getConjg();
					}
				}
			}
	}
	public void unscrambleX(final Complex[:rank==2] f) {
		final int nxh = length2 / 2;
		final int nxhh = length2 / 4;
		final int kmr = X10Util.maxInt(length1, length2) / length2;
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				final dist(:rank==2) dF = f.distribution;
				final region(:rank==1) rLocal1 = X10Util.getLRank2D(dF, 0);
				foreach(point(:rank==1) [j1] : [1 : nxhh - 1]){
					final int j2 = nxh - j1;
					final Complex t0 = tableSineCosine[kmr * j1];
					final Complex t1 = new Complex(t0.getImag(), -t0.getReal());
					foreach(point(:rank==1) [i] : rLocal1){
						final Complex t = f[i, j2].getConjg();
						final Complex s = f[i, j1].add(t);
						final Complex t2 = (f[i, j1].sub(t)).mult(t1);
						f[i, j1] = (s.add(t2)).multS(invN);
						f[i, j2] = ((s.sub(t2)).getConjg()).multS(invN);
					}
				}
				foreach(point(:rank==2) pt : [rLocal1, nxhh : nxhh]){
					final point(:rank==2) pt0 = pt * [1, 0];
					final Complex t1 = f[pt0];
					final Complex t2 = f[pt];
					final double t1Real = t1.getReal();
					final double t1Imag = t1.getImag();
					final Complex t3 = new Complex(t1Real + t1Imag, t1Real - t1Imag);
					f[pt] = (t2.getConjg()).multS(2 * invN);
					f[pt0] = t3.multS(2 * invN);
				}
			}
	}
	public void scrambleY(final Complex[:rank==2] f) {
		finish
			async(place.FIRST_PLACE) {
				foreach(point(:rank==1) [j1] : [1 : (length1 / 2) - 1]){
					final int j2 = length1 - j1;
					final Complex t1 = f[0, j2];
					final Complex t2 = f[0, j1];
					final Complex s = new Complex(t1.getImag(), t1.getReal());
					f[0, j2] = (t2.sub(s)).getConjg();
					f[0, j1] = t2.add(s);
				}
			}
	}
	public void unscrambleY(final Complex[:rank==2] f) {
		finish
			async(place.FIRST_PLACE) {
				foreach(point(:rank==1) [j1] : [1 : (length1 / 2) - 1]){
					final int j2 = length1 - j1;
					final Complex s = f[0, j2];
					final Complex t = f[0, j1];
					final Complex t1 = t.add(s);
					final Complex t2 = t.sub(s);
					f[0, j2] = (new Complex(t1.getImag(), t2.getReal())).multS(0.5);
					f[0, j1] = (new Complex(t1.getReal(), t2.getImag())).multS(0.5);
				}
			}
	}
	public void transformRank(final Complex[:rank==2] f, final int rnk, final boolean inverse) {
		final int nxy = X10Util.maxInt(length1, length2);
		final int nxh = length2 / 2;
		final int nyh = length1 / 2;
		final int nxhh = length2 / 4;
		final int bits = (rnk == 0)? nBits1 : nBits2 - 1;
		final int r = nxy / ((rnk == 0)? length1 : nxh);
		for(point(:rank==1) exponent : [0 : bits - 1]){
			final int stride = 1 << exponent[0];
			final int width = 2 * stride;
			final int km = ((rnk == 0)? nyh : nxhh) / stride;
			final int kmr = km * r;
			finish
				ateach(point(:rank==1) pl : dist.UNIQUE){
					for(point(:rank==1) [k] : [0 : km - 1]){
						final int lb = width * k;
						final int mb = lb + stride;
						finish
							foreach(point(:rank==1) [j] : [0 : stride - 1]){
								final int j1 = j + lb;
								final int j2 = j + mb;
								final Complex s = ((inverse)? tableSineCosine[kmr * j] : tableSineCosine[kmr * j].getConjg());
								final dist(:rank==2) dF = f.distribution;
								final region(:rank==1) rLocal1 = X10Util.getLRank2D(dF, 0);
								foreach(point(:rank==1) [i] : rLocal1){
									final Complex tmp1 = f[i, j1];
									final Complex tmp2 = s.mult(f[i, j2]);
									f[i, j2] = tmp1.sub(tmp2);
									f[i, j1] = tmp1.add(tmp2);
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

class LinearESOpenPIC2D {
	private static final int NUMBER_OF_XBITS = 2;
	private static final int NUMBER_OF_YBITS = 3;
	private static final int XLENGTH = 1 << NUMBER_OF_XBITS;
	private static final int YLENGTH = 1 << NUMBER_OF_YBITS;
	private static final int PARTICLE_XDENSITY = 4;
	private static final int PARTICLE_YDENSITY = 8;
	private static final int NPARTICLES = PARTICLE_XDENSITY * PARTICLE_YDENSITY;
	private static final double DELTA_TIME = 0.2000000e+00;
	private static final double ELECTRON_CHARGE = -1.0;
	private static final double THERMAL_XVELOCITY = 1.0;
	private static final double THERMAL_YVELOCITY = 1.0;
	private static final int BOUNDARY_CONDITION = 2;
	private static final int TIME_STEPS = 325;
	private static final int SORT_TIME = 50;
	private static final double IMBALANCE = 0.08;
	private static final int MOVE_FIELD_TO_DIST_MAX_ROWS = 4 * YLENGTH / place.MAX_PLACES;
	private static final int MOVE_PARTICLES_MAX = 4 * NPARTICLES / place.MAX_PLACES;
	private static final int MOVE_PARTICLES_MAX_BUFFER = 4 * NPARTICLES / place.MAX_PLACES;
	private final Random r;
	private final PoissonSolver solver;
	private Particle[:rank==1] particles;
	private double[:rank==2] backgroundCharge;
	private long totalTime;
	private long initTime;
	private long depositTime;
	private long redistTime;
	private long solverTime;
	private long pushTime;
	private long moveTime;
	public LinearESOpenPIC2D() {
		r = new Random();
		double affp = ((XLENGTH - 2.0) * (YLENGTH - 2.0)) / NPARTICLES;
		solver = new PoissonSolver(NUMBER_OF_XBITS, NUMBER_OF_YBITS, affp);
		totalTime = 0;
		initTime = 0;
		depositTime = 0;
		redistTime = 0;
		pushTime = 0;
		moveTime = 0;
	}
	public void run() {
		totalTime = System.currentTimeMillis();
		initTime = System.currentTimeMillis();
		initialize();
		initTime = System.currentTimeMillis() - initTime;
		for(point(:rank==1) i : [0 : TIME_STEPS - 1]){
			System.out.println("T = " + i[0]);
			final double[:rank==1] e = stepTime(backgroundCharge);
			if(i[0] % SORT_TIME == 0) {
				long time = System.currentTimeMillis();
				sortParticles(particles, backgroundCharge.distribution);
				moveTime = moveTime + (System.currentTimeMillis() - time);
			}
			System.out.println("field, kinetic, total energies = " + e[0] + "," + e[1] + "," + e[2]);
			if(i[0] == TIME_STEPS - 1) {
				final dist(:rank==1) dRef = [0 : 2] -> here;
				final double[:rank==1] ref = new double[dRef];
				if(NUMBER_OF_XBITS == 2 && NUMBER_OF_YBITS == 3 && PARTICLE_XDENSITY == 4 && PARTICLE_YDENSITY == 8) {
					ref[0] = 0.009936711552799253;
					ref[1] = 35.7904959849017;
					ref[2] = 35.8004326964545;
					System.out.println("final field energy diff = " + (Math.abs(ref[0] - e[0])));
					System.out.println("final kinetic energy diff = " + (Math.abs(ref[1] - e[1])));
					System.out.println("final final energy diff = " + (Math.abs(ref[2] - e[2])));
				}
				else
					if(NUMBER_OF_XBITS == 3 && NUMBER_OF_YBITS == 4 && PARTICLE_XDENSITY == 8 && PARTICLE_YDENSITY == 16) {
						ref[0] = 1.12911030199718;
						ref[1] = 138.01404855563126;
						ref[2] = 139.14315885762844;
						System.out.println("final field energy diff = " + (Math.abs(ref[0] - e[0])));
						System.out.println("final kinetic energy diff = " + (Math.abs(ref[1] - e[1])));
						System.out.println("final final energy diff = " + (Math.abs(ref[2] - e[2])));
					}
					else{
						System.out.println("No reference values availabile");
					}
			}
		}
		totalTime = System.currentTimeMillis() - totalTime;
		System.out.println("Total time (ms): " + totalTime);
		System.out.println("Initialization time (ms): " + initTime + " " + (100.0 * initTime) / totalTime);
		System.out.println("Particle Deposit time (ms): " + depositTime + " " + (100.0 * depositTime) / totalTime);
		System.out.println("Field Redistribution time (ms): " + redistTime + " " + (100.0 * redistTime) / totalTime);
		System.out.println("Solver time (ms): " + solverTime + " " + (100.0 * solverTime) / totalTime);
		System.out.println("Particle Push time (ms): " + pushTime + " " + (100.0 * pushTime) / totalTime);
		System.out.println("Particle move time (ms): " + moveTime + " " + (100.0 * moveTime) / totalTime);
	}
	public void initialize() {
		System.out.println("Init: particle position");
		final double[:rank==2] position = genParticlePosition(NPARTICLES);
		System.out.println("Init: particle velocity");
		final double[:rank==2] velocity = genParticleVelocity(NPARTICLES);
		System.out.println("Init: particles");
		particles = genParticles(NPARTICLES, position, velocity);
		System.out.println("Init: initial field distribution");
		final dist(:rank==2) dField = genInitialDist(particles);
		System.out.println("Init: initial partical distribution");
		final int[:rank==1] info = makeInfoArray();
		particles = moveParticles(particles, dField, info);
		System.out.println("Init: background charge");
		backgroundCharge = new double[dField];
		final double[:rank==2] backgroundGuards = makeGuards(dField);
		depositCharge(particles, backgroundCharge, backgroundGuards, Math.abs(ELECTRON_CHARGE));
		addGuards(backgroundCharge, backgroundGuards);
	}
	public double[:rank==2] genParticlePosition(final int np) {
		final int X = 0;
		final int Y = 1;
		final int MAX_PLACES = place.MAX_PLACES;
		final int MAX_ITER = 20;
		final double ERROR = 0.0001;
		final double BIG = 0.5;
		final dist(:rank==2) dResult = X10Util.distBlockStar2([0 : np - 1], [0 : 1]);
		final double[:rank==2] result = new double[dResult];
		final int particlesPerPlace = (PARTICLE_XDENSITY * PARTICLE_YDENSITY) / MAX_PLACES;
		final int totalParticles = particlesPerPlace * MAX_PLACES;
		if(totalParticles != NPARTICLES) {
			System.err.println("Particle distribution truncated, " + "total particles = " + totalParticles);
			return result;
		}
		final double edgelx = (BOUNDARY_CONDITION == 2 || BOUNDARY_CONDITION == 3)? 1.0 : 0.0;
		final double edgely = (BOUNDARY_CONDITION == 2)? 1.0 : 0.0;
		double tx0 = linearDensityFnIntegral(edgelx, 0.0, 0.0, 0.0);
		double ty0 = linearDensityFnIntegral(edgely, 0.0, 0.0, 0.0);
		final double anx = XLENGTH - edgelx;
		final double any = YLENGTH - edgely;
		final double bnx = PARTICLE_XDENSITY / (linearDensityFnIntegral(anx, 0.0, 0.0, 0.0) - tx0);
		final double bny = PARTICLE_YDENSITY / (linearDensityFnIntegral(any, 0.0, 0.0, 0.0) - ty0);
		final double x0 = bnx * tx0 - 0.5;
		final double y0 = bny * ty0 - 0.5;
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				final region(:rank==1) rLocal = X10Util.getLRank2D(dResult, 0);
				final int offset = rLocal.low();
				final int koff = particlesPerPlace * pl[0];
				final int noff = offset;
				int kc = koff / PARTICLE_XDENSITY;
				double yt0 = edgely;
				double yt = yt0 + 0.5 / (bny * linearDensityFn(yt0, 0.0, 0.0, 0.0));
				for(point(:rank==1) k : [0 : kc - 1]){
					double yn = k[0] + y0 + 1;
					if(k[0] > 0) {
						yt = yt + (1.0 / (bny * linearDensityFn(yt, 0.0, 0.0, 0.0)));
					}
					yt = X10Util.maxDouble(edgely, X10Util.minDouble(yt, any));
					double f = bny * linearDensityFnIntegral(yt, 0.0, 0.0, 0.0) - yn;
					double absf = Math.abs(f);
					int i = 0;
					while(absf >= ERROR){
						if(absf < BIG) {
							double fp = bny * linearDensityFn(yt, 0.0, 0.0, 0.0);
							yt0 = yt;
							yt = X10Util.maxDouble(edgely, X10Util.minDouble(yt - f / fp, any));
						}
						else
							if(f > 0.0) {
								yt = yt0 + (0.5 * (yt - yt0));
							}
							else{
								yt = yt + yt - yt0;
							}
						if(i >= MAX_ITER) {
							System.err.println("1: Newton iteration max exceeded");
							break;
						}
						else{
							f = bny * linearDensityFnIntegral(yt, 0.0, 0.0, 0.0) - yn;
							absf = Math.abs(f);
						}
						i++;
					}
					yt0 = yt;
				}
				int jc = koff - PARTICLE_XDENSITY * kc;
				double xt0 = edgelx;
				double xt = xt0 + 0.5 / (bnx * linearDensityFn(xt0, 0.0, 0.0, 0.0));
				for(point(:rank==1) j : [0 : jc - 1]){
					double xn = j[0] + x0 + 1;
					if(j[0] > 0) {
						xt = xt + (1.0 / (bnx * linearDensityFn(xt, 0.0, 0.0, 0.0)));
					}
					xt = X10Util.maxDouble(edgelx, X10Util.minDouble(xt, anx));
					double f = bnx * linearDensityFnIntegral(xt, 0.0, 0.0, 0.0) - xn;
					double absf = Math.abs(f);
					int i = 0;
					while(absf >= ERROR){
						if(absf < BIG) {
							double fp = bnx * linearDensityFn(xt, 0.0, 0.0, 0.0);
							xt0 = xt;
							xt = X10Util.maxDouble(edgelx, X10Util.minDouble(xt - f / fp, anx));
						}
						else
							if(f > 0.0) {
								xt = xt0 + 0.5 * (xt - xt0);
							}
							else{
								xt = xt + xt - xt0;
							}
						if(i >= MAX_ITER) {
							System.err.println("2: Newton iteration max exceeded");
							break;
						}
						else{
							f = bnx * linearDensityFnIntegral(xt, 0.0, 0.0, 0.0) - xn;
							absf = Math.abs(f);
						}
						i++;
					}
					xt0 = xt;
				}
				kc++;
				for(point(:rank==1) [n] : [0 : X10Util.minInt(particlesPerPlace, PARTICLE_XDENSITY) - 1]){
					int nn = n + koff;
					int k = nn / PARTICLE_XDENSITY;
					int j = nn % PARTICLE_XDENSITY;
					double xn = j + x0 + 1;
					if(j == 0) {
						xt0 = edgelx;
						xt = xt0 + 0.5 / (bnx * linearDensityFn(xt0, 0.0, 0.0, 0.0));
					}
					else{
						xt = xt + (1.0 / (bnx * linearDensityFn(xt, 0.0, 0.0, 0.0)));
					}
					xt = X10Util.maxDouble(edgelx, X10Util.minDouble(xt, anx));
					double f = bnx * linearDensityFnIntegral(xt0, 0.0, 0.0, 0.0) - xn;
					double absf = Math.abs(f);
					int i = 0;
					while(absf >= ERROR){
						if(absf < BIG) {
							double fp = bnx * linearDensityFn(xt, 0.0, 0.0, 0.0);
							xt0 = xt;
							xt = X10Util.maxDouble(edgelx, X10Util.minDouble(xt - f / fp, anx));
						}
						else
							if(f > 0.0) {
								xt = xt0 + 0.5 * (xt - xt0);
							}
							else{
								xt = xt + xt - xt0;
							}
						if(i >= MAX_ITER) {
							System.err.println("3: Newton iteration max exceeded");
							break;
						}
						else{
							f = bnx * linearDensityFnIntegral(xt, 0.0, 0.0, 0.0) - xn;
							absf = Math.abs(f);
						}
						i++;
					}
					result[n + noff, X] = xt;
				}
				for(point(:rank==1) [n] : [0 : particlesPerPlace - 1]){
					int nn = n + koff;
					int k = nn / PARTICLE_XDENSITY + 1;
					int j = nn - PARTICLE_XDENSITY * k;
					nn = n % PARTICLE_XDENSITY;
					if(k == kc) {
						double yn = k + y0;
						if(k > 1) {
							yt = yt + (1.0 / (bny * linearDensityFn(yt, 0.0, 0.0, 0.0)));
						}
						yt = X10Util.maxDouble(edgelx, X10Util.minDouble(yt, any));
						double f = bny * linearDensityIntegral(yt, 0.0, 0.0, 0.0) - yn;
						double absf = Math.abs(f);
						int i = 0;
						while(absf >= ERROR){
							if(absf < BIG) {
								double fp = bny * linearDensityFn(yt, 0.0, 0.0, 0.0);
								yt0 = yt;
								yt = X10Util.maxDouble(edgely, X10Util.minDouble(yt - f / fp, any));
							}
							else
								if(f > 0.0) {
									yt = yt0 + 0.5 * (yt - yt0);
								}
								else{
									yt = yt + yt - yt0;
								}
							if(i >= MAX_ITER) {
								System.err.println("4: Newton iteration max exceeded");
								break;
							}
							else{
								f = bny * linearDensityFnIntegral(yt, 0.0, 0.0, 0.0) - yn;
								absf = Math.abs(f);
							}
							i++;
						}
						kc++;
						yt0 = yt;
					}
					result[n + noff, X] = result[nn + noff, X];
					result[n + noff, Y] = yt;
				}
			}
		return result;
	}
	public double[:rank==2] genParticleVelocity(final int n) {
		final int X = 0;
		final int Y = 1;
		final dist(:rank==2) dResult = X10Util.distBlockStar2([0 : n - 1], [0 : 1]);
		final double[:rank==2] result = new double[dResult];
		finish {
			for(point(:rank==1) [i] : [0 : PARTICLE_YDENSITY - 1]){
				final int offset = PARTICLE_XDENSITY * i;
				for(point(:rank==1) [j] : [0 : PARTICLE_XDENSITY - 1]){
					final int idx = j + offset;
					final double vx = THERMAL_XVELOCITY * r.nextNormal();
					final double vy = THERMAL_YVELOCITY * r.nextNormal();
					async(dResult.get(idx, 0)) {
						result[idx, X] = vx;
						result[idx, Y] = vy;
					}
				}
			}
		}
		System.out.println("Init: correcting drift");
		final dist(:rank==1) dUnique = (dist(:rank==1))dist.UNIQUE;
		final int[:rank==1] numParticles = new int[dUnique](point(:rank==1)pt) {
			return 0;
		};
		final double[:rank==1] sumX = new double[dUnique](point(:rank==1)pt) {
			return 0.0;
		};
		final double[:rank==1] sumY = new double[dUnique](point(:rank==1)pt) {
			return 0.0;
		};
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				final region(:rank==1) rLocal1 = X10Util.getLRank2D(dResult, 0);
				for(point(:rank==2) pt : [rLocal1, X : X]){
					sumX[pl] = sumX[pl] + result[pt];
					numParticles[pl] = numParticles[pl] + 1;
				}
				for(point(:rank==2) pt : [rLocal1, Y : Y]){
					sumY[pl] = sumY[pl] + result[pt];
				}
			}
		final int totalParticles = numParticles.sum();
		final double driftX = sumX.sum() / totalParticles;
		final double driftY = sumY.sum() / totalParticles;
		System.out.println("Init: updating with drift");
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				final region(:rank==1) rLocal1 = X10Util.getLRank2D(dResult, 0);
				foreach(point(:rank==2) pt : [rLocal1, X : X]){
					result[pt] = result[pt] - driftX;
				}
				foreach(point(:rank==2) pt : [rLocal1, Y : Y]){
					result[pt] = result[pt] - driftY;
				}
			}
		if(totalParticles != NPARTICLES) {
			System.err.println("Velocity distribution truncated, number of " + "particles = " + totalParticles);
		}
		return result;
	}
	public Particle[:rank==1] genParticles(final int n, final double[:rank==2] position, final double[:rank==2] velocity) {
		final dist(:rank==1) dResult = (dist(:rank==1))dist.factory.block([0 : n - 1]);
		return new Particle[dResult](point(:rank==1)[i]) {
			return new Particle(position[i, 0], position[i, 1], velocity[i, 0], velocity[i, 1]);
		};
	}
	public dist(:rank==2) genInitialDist(final Particle[:rank==1] particles) {
		final int MAX_PLACES = place.MAX_PLACES;
		final double edgely = (BOUNDARY_CONDITION == 2)? 1.0 : 0.0;
		final double y = YLENGTH;
		final double y0 = linearDensityFnIntegral(edgely, 0.0, 0.0, 0.0);
		final double nParticlesAve = (linearDensityFnIntegral(y - edgely, 0.0, 0.0, 0.0) - y0) / MAX_PLACES;
		final dist(:rank==1) dUnique = (dist(:rank==1))dist.UNIQUE;
		final region(:rank==1)[:rank==1] yRegions = (region(:rank==1)[:rank==1])new region(:rank==1)[dUnique];
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				final double anpl = pl[0] * nParticlesAve;
				final double anpr = (pl[0] + 1) * nParticlesAve;
				double total = 0.0;
				double tmp = 0.0;
				double y1 = edgely;
				do {
					tmp = total;
					total = linearDensityFnIntegral(y1, 0.0, 0.0, 0.0) - y0;
					y1 = y1 + 1.0;
				} while(total < anpl && y1 <= y);
				double lb = ((total > tmp)? ((y1 - 2.0) + (anpl - tmp) / (total - tmp)) : (y1 - 1.0));
				if(here.isFirst()) {
					lb = 0.0;
				}
				do {
					tmp = total;
					total = linearDensityFnIntegral(y1, 0.0, 0.0, 0.0) - y0;
					y1 = y1 + 1.0;
				} while(total < anpr && y1 <= y);
				double ub = (y1 - 2.0) + (anpr - tmp) / (total - tmp);
				if(here.isLast()) {
					ub = y;
				}
				yRegions[pl] = [(int)(lb + 0.5) : ((int)(ub + 0.5) - 1)];
			}
		final place pHere = here;
		final dist(:rank==1) dPlace = (dist(:rank==1))([0 : MAX_PLACES - 1] -> here);
		final region(:rank==1)[:rank==1] rBuffer = (region(:rank==1)[:rank==1])new region(:rank==1)[dPlace];
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				final region(:rank==1) r = (region(:rank==1))yRegions[pl];
				async(pHere) {
					rBuffer[pl] = r;
				}
			}
		dist(:rank==2) dResult = (dist(:rank==2))(region.factory.emptyRegion(2) -> here);
		for(point(:rank==1) pl : dist.UNIQUE){
			final place p = dist.UNIQUE.get(pl);
			final region(:rank==1) ry = (region(:rank==1))rBuffer[pl];
			final dist(:rank==2) dLocal = (dist(:rank==2))([ry, 0 : XLENGTH] -> p);
			dResult = dResult || dLocal;
		}
		return dResult;
	}
	public double linearDensityFn(final double x, final double anlx, final double anxi, final double shift) {
		final double result = 1.0 + anlx * (x * anxi - shift);
		if(result < 0.0) {
			System.err.println("Linear Density Error: result = " + result);
		}
		return result;
	}
	public double linearDensityFnIntegral(final double x, final double anlx, final double anxi, final double shift) {
		double result = 0.0;
		if(anxi == 0.0) {
			result = x;
		}
		else{
			result = x + 0.5 * anlx * x * (x * anxi - 2.0 * shift);
		}
		if(result < 0.0) {
			System.err.println("Linear Density Integral Error: " + "result = " + result);
		}
		return result;
	}
	public double[:rank==1] stepTime(final double[:rank==2] ionBackground) {
		long time1 = System.currentTimeMillis();
		long time2 = 0;
		final double CHARGE = ELECTRON_CHARGE;
		final dist(:rank==2) dIonBG = ionBackground.distribution;
		final double[:rank==2] chargeDensityGuards = makeGuards(dIonBG);
		final double[:rank==2] chargeDensity = (double[:rank==2])new double[dIonBG](point(:rank==2)pt) {
			return 0.0;
		};
		depositCharge(particles, chargeDensity, chargeDensityGuards, CHARGE);
		finish
			ateach(point(:rank==2) pt : dIonBG){
				chargeDensity[pt] = chargeDensity[pt] + ionBackground[pt];
			}
		addGuards(chargeDensity, chargeDensityGuards);
		time2 = System.currentTimeMillis();
		depositTime = depositTime + (time2 - time1);
		final dist(:rank==2) dOld = chargeDensity.distribution;
		final double[:rank==2] uniformChargeDensity = moveFieldToUniform(chargeDensity);
		final Complex[:rank==2] complexChargeDensity = ArrayUtil.doubleToComplex(doubleDimensions(uniformChargeDensity));
		time1 = System.currentTimeMillis();
		redistTime = redistTime + (time1 - time2);
		final Complex[:rank==2] complexForceX = solver.makeForceArray();
		final Complex[:rank==2] complexForceY = solver.makeForceArray();
		double we = solver.getForceCharge(complexChargeDensity, complexForceX, complexForceY);
		time2 = System.currentTimeMillis();
		solverTime = solverTime + (time2 - time1);
		final dist(:rank==2) dChargeDensityGuards = chargeDensityGuards.distribution;
		final double[:rank==2] gx = new double[dChargeDensityGuards];
		final double[:rank==2] gy = new double[dChargeDensityGuards];
		final double[:rank==2] forceX = cropField(ArrayUtil.complexToDouble(complexForceX), gx);
		final double[:rank==2] forceY = cropField(ArrayUtil.complexToDouble(complexForceY), gy);
		final double[:rank==2] fcx = moveFieldToDist(forceX, dOld);
		final double[:rank==2] fcy = moveFieldToDist(forceY, dOld);
		loadGuards(fcx, gx);
		loadGuards(fcy, gy);
		time1 = System.currentTimeMillis();
		redistTime = redistTime + (time1 - time2);
		double wk = pushParticles(particles, fcx, gx, fcy, gy);
		time2 = System.currentTimeMillis();
		pushTime = pushTime + (time2 - time1);
		final int[:rank==1] info = makeInfoArray();
		particles = moveParticles(particles, dOld, info);
		final double particleAve = ((double)info[6]) / place.MAX_PLACES;
		final double balance = X10Util.maxDouble(info[1] - particleAve, particleAve - (info[2] / particleAve));
		if(balance > IMBALANCE) {
			final int[:rank==1] count = countParticles(particles, dOld);
			final dist(:rank==2) dNew = repartition(count, dOld, particleAve);
			backgroundCharge = moveFieldToDist(backgroundCharge, dNew);
			particles = moveParticles(particles, dNew, info);
		}
		final dist(:rank==1) dResult = (dist(:rank==1))([0 : 2] -> here);
		final double[:rank==1] result = new double[dResult];
		result[0] = we;
		result[1] = wk;
		result[2] = we + wk;
		time1 = System.currentTimeMillis();
		moveTime = moveTime + (time1 - time2);
		return result;
	}
	public double linearDensity(final double x, final double anlx, final double anxi, final double shift) {
		return 1.0 + anlx * (x * anxi - shift);
	}
	public double linearDensityIntegral(final double x, final double anlx, final double anxi, final double shift) {
		return (anxi == 0)? x : x + 0.5 * anlx * x * (x * anxi - 2.0 * shift);
	}
	public double[:rank==2] makeGuards(final dist(:rank==2) dData) {
		dist(:rank==2) dResult = (dist(:rank==2))(region.factory.emptyRegion(2) -> here);
		for(point(:rank==1) pl : dist.UNIQUE){
			final place p = dist.UNIQUE.get(pl);
			final region(:rank==1) rLocal1 = X10Util.getPRank2D(dData, p, 0);
			final region(:rank==1) rLocal2 = X10Util.getPRank2D(dData, p, 1);
			final int ub = rLocal1.high();
			dResult = dResult || ([ub + 1 : ub + 1, rLocal2] -> p);
		}
		return new double[dResult](point(:rank==2)pt) {
			return 0.0;
		};
	}
	public void depositCharge(final Particle[:rank==1] particles, final double[:rank==2] fieldCharge, final double[:rank==2] guards, final double charge) {
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				final dist(:rank==2) dFC = fieldCharge.distribution;
				final region(:rank==2) rLocalFC = X10Util.get2DLRegion(dFC);
				final dist(:rank==2) dG = guards.distribution;
				final region(:rank==2) rLocalG = X10Util.get2DLRegion(dG);
				final dist(:rank==2) dLocal = (dist(:rank==2))((rLocalFC || rLocalG) -> here);
				final double[:rank==2] localCharge = new double[dLocal](point(:rank==2)pt) {
					return 0.0;
				};
				for(point(:rank==1) pt : particles.distribution | here){
					final Particle p = particles[pt];
					final int x = (int)p.getX();
					final int y = (int)p.getY();
					final double dx = p.getX() - x;
					final double dy = p.getY() - y;
					localCharge[y + 1, x + 1] = localCharge[y + 1, x + 1] + (charge * dx * dy);
					localCharge[y + 1, x] = localCharge[y + 1, x] + (charge * (1.0 - dx) * dy);
					localCharge[y, x + 1] = localCharge[y, x + 1] + (charge * dx * (1.0 - dy));
					localCharge[y, x] = localCharge[y, x] + (charge * (1.0 - dx) * (1.0 - dy));
				}
				finish {
					foreach(point(:rank==2) pt : fieldCharge.distribution | here){
						fieldCharge[pt] = localCharge[pt];
					}
					foreach(point(:rank==2) pt : guards.distribution | here){
						guards[pt] = localCharge[pt];
					}
				}
			}
	}
	public void addGuards(final double[:rank==2] data, final double[:rank==2] guards) {
		final dist(:rank==2) dGuard = (dist(:rank==2))guards.distribution;
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				final dist(:rank==2) dG = guards.distribution;
				final region(:rank==2) rLocalG = X10Util.get2DLRegion(dG);
				if(!here.isLast()) {
					final double value[:rank==2] sBuffer = (double value[:rank==2])new double value[rLocalG](point(:rank==2)pt) {
						return guards[pt];
					};
					finish
						async(here.next()) {
							final dist(:rank==2) dData = data.distribution;
							final region(:rank==2) rLocalD = X10Util.get2DLRegion(dData);
							foreach(point(:rank==2) pt : (rLocalD && rLocalG)){
								data[pt] = data[pt] + sBuffer[pt];
							}
						}
				}
				foreach(point(:rank==2) pt : rLocalG){
					guards[pt] = 0.0;
				}
			}
	}
	public double[:rank==2] doubleDimensions(final double[:rank==2] data) {
		final region(:rank==2) rData = data.region;
		final region(:rank==1) rData1 = X10Util.getRank2D(rData, 0);
		final region(:rank==1) rData2 = X10Util.getRank2D(rData, 1);
		final dist(:rank==2) dResult = X10Util.distBlockStar2([0 : 2 * rData1.size() - 1], [0 : 2 * rData2.size() - 1]);
		final double[:rank==2] result = new double[dResult](point(:rank==2)pt) {
			return 0.0;
		};
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				final place pDst = place.places(pl[0] / 2);
				final dist(:rank==2) dData = data.distribution;
				final region(:rank==2) rLocal = X10Util.get2DLRegion(dData);
				final double value[:rank==2] sBuffer = (double value[:rank==2])new double value[rLocal](point(:rank==2)pt) {
					return data[pt];
				};
				async(pDst) {
					foreach(point(:rank==2) pt : rLocal){
						result[pt] = sBuffer[pt];
					}
				}
			}
		return result;
	}
	public double[:rank==2] moveFieldToUniform(final double[:rank==2] data) {
		final region(:rank==2) rData = data.region;
		return moveFieldToDist(data, X10Util.distBlockStar1(rData));
	}
	public double[:rank==2] moveFieldToDist(final double[:rank==2] data, final dist(:rank==2) dDst) {
		final int MAX_ROWS = MOVE_FIELD_TO_DIST_MAX_ROWS;
		final int MAX_ITER = 0;
		final dist(:rank==1) dUnique = (dist(:rank==1))dist.UNIQUE;
		final region(:rank==2) rData = data.region;
		final region(:rank==1) rRank1 = X10Util.getRank2D(rData, 0);
		final region(:rank==1) rRank2t = X10Util.getRank2D(rData, 1);
		final region(:rank==1) rRank2 = [0 : rRank2t.size() - 1];
		final region(:rank==1) rRows = [0 : MAX_ROWS - 1];
		final dist(:rank==3) dBuffer = X10Util.extendDistRank3D(X10Util.extendDistRank2D(dUnique, rRows), rRank2);
		final double[:rank==3] srcBuffer = new double[dBuffer](point(:rank==3)pt) {
			return 0.0;
		};
		final double[:rank==3] dstBuffer = new double[dBuffer](point(:rank==3)pt) {
			return 0.0;
		};
		final int[:rank==1] offsets = new int[dUnique](point(:rank==1)pt) {
			return 0;
		};
		final int[:rank==1] sizes = new int[dUnique](point(:rank==1)pt) {
			return 0;
		};
		final int[:rank==1] inLt = new int[dUnique](point(:rank==1)pt) {
			return 0;
		};
		final int[:rank==1] inRt = new int[dUnique](point(:rank==1)pt) {
			return 0;
		};
		final int[:rank==1] outLt = new int[dUnique](point(:rank==1)pt) {
			return 0;
		};
		final int[:rank==1] outRt = new int[dUnique](point(:rank==1)pt) {
			return 0;
		};
		finish
			ateach(point(:rank==1) [pl] : dist.UNIQUE){
				final dist(:rank==2) dData = data.distribution;
				final region(:rank==2) rLocal = X10Util.get2DLRegion(dData);
				final region(:rank==1) rLocal1 = X10Util.getRank2D(rLocal, 0);
				if(X10Util.ENABLE_CHECKS && rLocal1.size() == 0) {
					throw new RuntimeException("Region empty -- should not happen");
				}
				final int offset = rLocal1.low();
				foreach(point(:rank==2) [i, j] : rLocal){
					srcBuffer[pl, i - offset, j] = data[i, j];
				}
				sizes[pl] = rLocal1.size();
				offsets[pl] = offset;
			}
		int mter = MAX_ITER;
		int iter = 0;
		boolean done = false;
		do {
			finish
				ateach(point(:rank==1) pl : dist.UNIQUE){
					final region(:rank==2) rLocalD = X10Util.get2DLRegion(dDst);
					final region(:rank==1) rLocalD1 = X10Util.getRank2D(rLocalD, 0);
					if(X10Util.ENABLE_CHECKS && rLocalD1.size() == 0) {
						throw new RuntimeException("Region empty -- " + "cannot to move grids");
					}
					outLt[pl] = 0;
					outRt[pl] = 0;
					final int lBorder = rLocalD1.low();
					final int rBorder = rLocalD1.high() + 1;
					for(point(:rank==1) [i1] : [0 : sizes[pl] - 1]){
						final int i2 = i1 + offsets[pl];
						if(i2 >= rBorder) {
							outRt[pl] = outRt[pl] + 1;
						}
						else
							if(i2 < lBorder) {
								outLt[pl] = outLt[pl] + 1;
							}
					}
				}
			iter++;
			final int[:rank==1] pr = new int[dUnique](point(:rank==1)pt) {
				return 0;
			};
			final int[:rank==1] ter = new int[dUnique](point(:rank==1)pt) {
				return 0;
			};
			finish
				ateach(point(:rank==1) pl : dist.UNIQUE){
					inLt[pl] = 0;
					inRt[pl] = 0;
				}
			finish
				ateach(point(:rank==1) [pl] : dist.UNIQUE){
					if(outRt[pl] > 0) {
						final int bsize = outRt[pl];
						final region(:rank==2) rBuffer = [0 : bsize - 1, rRank2];
						final double value[:rank==2] sBuffer = (double value[:rank==2])new double value[rBuffer](point(:rank==2)[i, j]) {
							return srcBuffer[pl, i + sizes[pl] - outRt[pl], j];
						};
						async(here.next()) {
							foreach(point(:rank==2) [i, j] : rBuffer){
								dstBuffer[here.id, i, j] = sBuffer[i, j];
							}
							inLt[here.id] = bsize;
						}
					}
				}
			finish
				ateach(point(:rank==1) [pl] : dist.UNIQUE){
					sizes[pl] = sizes[pl] - outRt[pl];
					outRt[pl] = X10Util.maxInt(sizes[pl] + inLt[pl] - MAX_ROWS, 0);
					sizes[pl] = sizes[pl] - outRt[pl];
					if(outRt[pl] > 0) {
						pr[pl] = X10Util.maxInt(pr[pl], outRt[pl]);
						final int rsize = X10Util.minInt(outRt[pl], MAX_ROWS - inLt[pl]);
						finish
							foreach(point(:rank==2) [i, j] : [0 : rsize - 1, rRank2]){
								dstBuffer[pl, MAX_ROWS - rsize + i, j] = srcBuffer[pl, sizes[pl] + i, j];
							}
					}
					if(sizes[pl] > 0 && inLt[pl] > 0) {
						for(point(:rank==1) [i1] : [1 : sizes[pl]]){
							final int i2 = sizes[pl] - i1;
							finish
								foreach(point(:rank==1) [j] : rRank2){
									srcBuffer[pl, i2 + inLt[pl], j] = srcBuffer[pl, i2, j];
								}
						}
					}
					finish
						foreach(point(:rank==3) pt : [pl : pl, 0 : inLt[pl] - 1, rRank2]){
							srcBuffer[pt] = dstBuffer[pt];
						}
					sizes[pl] = sizes[pl] + inLt[pl];
					offsets[pl] = offsets[pl] - inLt[pl];
				}
			finish
				ateach(point(:rank==1) [pl] : dist.UNIQUE){
					if(outLt[pl] > 0) {
						final int bsize = outLt[pl];
						final region(:rank==2) rBuffer = [0 : bsize - 1, rRank2];
						final double value[:rank==2] sBuffer = (double value[:rank==2])new double value[rBuffer](point(:rank==2)[i, j]) {
							return srcBuffer[pl, i, j];
						};
						async(here.prev()) {
							foreach(point(:rank==2) [i, j] : rBuffer){
								dstBuffer[here.id, i, j] = sBuffer[i, j];
							}
							inRt[here.id] = bsize;
						}
					}
				}
			finish
				ateach(point(:rank==1) [pl] : dist.UNIQUE){
					sizes[pl] = sizes[pl] - outLt[pl];
					offsets[pl] = offsets[pl] + outLt[pl];
					if(sizes[pl] > 0 && outLt[pl] > 0) {
						for(point(:rank==1) [i] : [0 : sizes[pl] - 1]){
							finish
								foreach(point(:rank==1) [j] : rRank2){
									srcBuffer[pl, i, j] = srcBuffer[pl, i + outLt[pl], j];
								}
						}
					}
					outLt[pl] = X10Util.maxInt(sizes[pl] + inRt[pl] - MAX_ROWS, 0);
					if(outLt[pl] > 0) {
						pr[pl] = X10Util.maxInt(pr[pl], outLt[pl]);
						inRt[pl] = inRt[pl] - outLt[pl];
					}
					else
						if(outRt[pl] > 0) {
						}
					finish
						foreach(point(:rank==2) [i, j] : [0 : inRt[pl] - 1, rRank2]){
							srcBuffer[pl, i + sizes[pl], j] = dstBuffer[pl, i, j];
						}
					sizes[pl] = sizes[pl] + inRt[pl];
					final region(:rank==1) rLocal1 = X10Util.getLRank2D(dDst, 0);
					if(X10Util.ENABLE_CHECKS && rLocal1.size() == 0) {
						throw new RuntimeException("Destination distribution " + "is empty");
					}
					final int rsize = rLocal1.size();
					final int offset = rLocal1.low();
					ter[pl] = (Math.abs(sizes[pl] - rsize) + Math.abs(offsets[pl] - offset));
				}
			int ierr = 0;
			if(iter <= mter) {
				if(pr.max() != 0) {
					ierr = pr.max();
					System.err.println("Local field overflow error, " + "ierr = " + ierr);
					break;
				}
				if(iter < mter) {
					continue;
				}
				else{
					break;
				}
			}
			if(iter > 10) {
				throw new RuntimeException("Too many iterations");
			}
			final dist(:rank==1) dFlags = [0 : 1] -> here;
			final int[:rank==1] flags = new int[dFlags];
			flags[0] = pr.max();
			flags[1] = ter.max();
			if(flags[0] != 0) {
				ierr = flags[0];
				System.err.println("Global field overflow error, " + "ierr = " + ierr);
				break;
			}
			if(flags[1] != 0) {
				System.err.println("Info: fields being passed " + "further = " + flags[1]);
			}
			else{
				mter = iter;
				break;
			}
		} while(!done);
		final double[:rank==2] result = new double[dDst];
		finish
			ateach(point(:rank==1) [pl] : dist.UNIQUE){
				final region(:rank==1) rLocal1 = X10Util.getLRank2D(dDst, 0);
				if(X10Util.ENABLE_CHECKS) {
					if(sizes[pl] <= 0) {
						throw new RuntimeException("Cannot make non-existant " + "region");
					}
					if(sizes[pl] != rLocal1.size() || offsets[pl] != rLocal1.low()) {
						throw new RuntimeException("Regions don't match result " + "dist");
					}
				}
				foreach(point(:rank==2) [i, j] : [0 : sizes[pl] - 1, rRank2]){
					result[offsets[pl] + i, j] = srcBuffer[pl, i, j];
				}
			}
		return result;
	}
	public double[:rank==2] cropField(final double[:rank==2] data, final double[:rank==2] guards) {
		final region(:rank==1) rRank1 = [0 : YLENGTH - 1];
		final region(:rank==1) rRank2 = [0 : XLENGTH];
		final dist(:rank==2) dGuard = guards.distribution;
		final region(:rank==2) rGuard = X10Util.get2DPRegion(dGuard, place.places(place.MAX_PLACES - 1));
		final dist(:rank==2) dResult = X10Util.distBlockStar2(rRank1, rRank2);
		final double[:rank==2] result = new double[dResult];
		for(point(:rank==1) pl : dist.UNIQUE)
			finish
				async(dist.UNIQUE.get(pl)) {
					final dist(:rank==2) dData = data.distribution;
					final region(:rank==2) rLocalS = X10Util.get2DLRegion(dData);
					final region(:rank==1) rLocalS1 = X10Util.getRank2D(rLocalS, 0);
					if(rLocalS.size() > 0 && rLocalS1.low() < YLENGTH) {
						final place pDst1 = place.places(2 * pl[0]);
						final place pDst2 = place.places(2 * pl[0] + 1);
						final double value[:rank==2] sBuffer = (double value[:rank==2])new double value[rLocalS](point(:rank==2)pt) {
							return data[pt];
						};
						async(pDst1) {
							final region(:rank==2) rLocalD = X10Util.get2DLRegion(dResult);
							foreach(point(:rank==2) pt : rLocalD){
								result[pt] = sBuffer[pt];
							}
						}
						async(pDst2) {
							final region(:rank==2) rLocalD = X10Util.get2DLRegion(dResult);
							foreach(point(:rank==2) pt : rLocalD){
								result[pt] = sBuffer[pt];
							}
						}
					}
					if(rLocalS1.contains([YLENGTH])) {
						final double value[:rank==2] sBuffer = (double value[:rank==2])new double value[rGuard](point(:rank==2)pt) {
							return data[pt];
						};
						async(place.places(place.MAX_PLACES - 1)) {
							foreach(point(:rank==2) pt : rGuard){
								guards[pt] = sBuffer[pt];
							}
						}
					}
				}
		return result;
	}
	public void loadGuards(final double[:rank==2] data, final double[:rank==2] guards) {
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				if(!here.isFirst()) {
					final dist(:rank==2) dGuard = guards.distribution;
					final region(:rank==2) rGuard = X10Util.get2DPRegion(dGuard, here.prev());
					final double value[:rank==2] sBuffer = (double value[:rank==2])new double value[rGuard](point(:rank==2)pt) {
						return data[pt];
					};
					async(here.prev()) {
						foreach(point(:rank==2) pt : rGuard){
							guards[pt] = sBuffer[pt];
						}
					}
				}
			}
	}
	public int[:rank==1] makeInfoArray() {
		final dist(:rank==1) dInfo = (dist(:rank==1))([0 : 6] -> here);
		return new int[dInfo](point(:rank==1)pt) {
			return 0;
		};
	}
	public Particle[:rank==1] moveParticles(final Particle[:rank==1] particles, final dist(:rank==2) dFieldSpace, final int[:rank==1] info) {
		final int MAX = MOVE_PARTICLES_MAX;
		final int MAX_BUFFER = MOVE_PARTICLES_MAX_BUFFER;
		final int ITER_MAX = 20;
		final region(:rank==1) rPart = [0 : MAX - 1];
		final region(:rank==1) rBuffer = [0 : MAX_BUFFER - 1];
		final dist(:rank==1) dUnique = (dist(:rank==1))dist.UNIQUE;
		final dist(:rank==2) dPart = X10Util.extendDistRank2D(dUnique, rPart);
		final dist(:rank==2) dBuffer = X10Util.extendDistRank2D(dUnique, rBuffer);
		final Particle[:rank==2] part = new Particle[dPart];
		final Particle[:rank==2] sBufferL = new Particle[dBuffer];
		final Particle[:rank==2] sBufferR = new Particle[dBuffer];
		final Particle[:rank==2] rBufferL = new Particle[dBuffer];
		final Particle[:rank==2] rBufferR = new Particle[dBuffer];
		final int[:rank==1 && distribution==dUnique] inLt = new int[dUnique](point(:rank==1)pt) {
			return 0;
		};
		final int[:rank==1 && distribution==dUnique] inRt = new int[dUnique](point(:rank==1)pt) {
			return 0;
		};
		final int[:rank==1 && distribution==dUnique] outLt = new int[dUnique](point(:rank==1)pt) {
			return 0;
		};
		final int[:rank==1 && distribution==dUnique] outRt = new int[dUnique](point(:rank==1)pt) {
			return 0;
		};
		final int[:rank==1 && distribution==dUnique] nPart = new int[dUnique](point(:rank==1)pt) {
			return 0;
		};
		int[:rank==1 && distribution==dUnique] nPartOld = new int[dUnique](point(:rank==1)pt) {
			return 0;
		};
		final int[:rank==2] holes = new int[dPart](point(:rank==2)pt) {
			return 0;
		};
		final dist(:rank==1) dFlags = [0 : 3] -> here;
		final int[:rank==1 && distribution==dUnique] nSent = new int[dUnique](point(:rank==1)pt) {
			return 0;
		};
		final int[:rank==1] ibflg = new int[dFlags](point(:rank==1)pt) {
			return 0;
		};
		finish
			ateach(point(:rank==1) [pl] : dist.UNIQUE){
				final region(:rank==1) rLocal = (region(:rank==1))(particles.distribution | here).region;
				if(rLocal.size() > 0) {
					final int offset = rLocal.low();
					foreach(point(:rank==1) [i] : rLocal){
						part[pl, i - offset] = particles[i];
					}
				}
				nPart[pl] = rLocal.size();
			}
		final region(:rank==2) rFieldSpace = dFieldSpace.region;
		final double rsize = X10Util.getRank2D(rFieldSpace, 1).size();
		int iter = 2;
		int nter = 0;
		finish
			foreach(point(:rank==1) pt : [0 : 6]){
				info[pt] = 0;
			}
		nPartOld = nPartOld + nPart;
		boolean doneInner = false;
		boolean doneOuter = false;
		do {
			int mter = 0;
			final int[:rank==1 && distribution==dUnique] overflow = new int[dUnique](point(:rank==1)pt) {
				return 0;
			};
			finish
				ateach(point(:rank==1) [pl] : dist.UNIQUE){
					final region(:rank==2) rLocal = (region(:rank==2))(dFieldSpace | here).region;
					final region(:rank==1) rLocal1 = X10Util.getRank2D(rLocal, 0);
					final double ub = rLocal1.high() + 1;
					final double lb = rLocal1.low();
					outLt[pl] = 0;
					outRt[pl] = 0;
					for(point(:rank==1) [i] : [0 : nPart[pl] - 1]){
						final Particle p = part[pl, i];
						double y = p.getY();
						if(y < lb) {
							if(outLt[pl] < rBuffer.size()) {
								if(here.isFirst()) {
									y = y + rsize;
								}
								sBufferL[pl, outLt[pl]] = p.setY(y);
								holes[pl, outLt[pl] + outRt[pl]] = i;
								outLt[pl]++;
							}
							else{
								overflow[pl] = 1;
								break;
							}
						}
						else
							if(y >= ub) {
								if(outRt[pl] < rBuffer.size()) {
									if(here.isLast()) {
										y = y - rsize;
									}
									sBufferR[pl, outRt[pl]] = p.setY(y);
									holes[pl, outLt[pl] + outRt[pl]] = i;
									outRt[pl]++;
								}
								else{
									overflow[pl] = 1;
									break;
								}
							}
					}
					nSent[pl] = outLt[pl] + outRt[pl];
				}
			ibflg[2] = overflow.max();
			do {
				iter = iter + 2;
				mter = mter + 1;
				transferParticles(sBufferL, sBufferR, outLt, outRt, rBufferL, rBufferR, inLt, inRt);
				final int[:rank==1] outgoing = new int[dUnique];
				finish
					ateach(point(:rank==1) [pl] : dist.UNIQUE){
						final region(:rank==2) rLocal = (region(:rank==2))(dFieldSpace | here).region;
						final region(:rank==1) rLocal1 = X10Util.getRank2D(rLocal, 0);
						final double ub = rLocal1.high() + 1;
						final double lb = rLocal1.low();
						outLt[pl] = 0;
						outRt[pl] = 0;
						int belowLeft = 0;
						for(point(:rank==1) [i] : [0 : inRt[pl] - 1]){
							final Particle p = rBufferR[pl, i];
							final double y = p.getY();
							if(y < lb) {
								outLt[pl]++;
							}
							if(y >= ub) {
								outRt[pl]++;
							}
						}
						if(outRt[pl] != 0) {
							System.err.println("Info: particles returning up");
						}
						for(point(:rank==1) [i] : [0 : inLt[pl] - 1]){
							final Particle p = rBufferL[pl, i];
							final double y = p.getY();
							if(y >= ub) {
								outRt[pl]++;
							}
							if(y < lb) {
								belowLeft++;
							}
						}
						if(belowLeft != 0) {
							System.err.println("Info: particles returning down");
						}
						outLt[pl] = outLt[pl] + belowLeft;
						outgoing[pl] = outLt[pl] + outRt[pl];
					}
				ibflg[1] = outgoing.max();
				if(ibflg[1] != 0) {
					finish
						ateach(point(:rank==1) [pl] : dist.UNIQUE){
							final region(:rank==2) rLocal = (region(:rank==2))(dFieldSpace | here).region;
							final region(:rank==1) rLocal1 = X10Util.getRank2D(rLocal, 0);
							final double ub = rLocal1.high() + 1;
							final double lb = rLocal1.low();
							outLt[pl] = 0;
							outRt[pl] = 0;
							overflow[pl] = 0;
							int inRightStaying = 0;
							for(point(:rank==1) [i] : [0 : inRt[pl] - 1]){
								final Particle p = rBufferR[pl, i];
								double y = p.getY();
								if(y < lb) {
									if(here.isFirst()) {
										y = y + rsize;
									}
									sBufferL[pl, outLt[pl]] = p.setY(y);
									outLt[pl]++;
								}
								else
									if(y >= ub) {
										System.err.println("Particle returning up -- " + "should not happen: " + p.toString());
										if(here.isLast()) {
											y = y - rsize;
										}
										sBufferR[pl, outRt[pl]] = p.setY(y);
										outRt[pl]++;
									}
									else{
										rBufferR[pl, inRightStaying] = p;
										inRightStaying++;
									}
							}
							inRt[pl] = inRightStaying;
							int inLeftStaying = 0;
							for(point(:rank==1) [i] : [0 : inLt[pl] - 1]){
								final Particle p = rBufferL[pl, i];
								double y = p.getY();
								if(y >= ub) {
									if(outRt[pl] < rBuffer.size()) {
										if(here.isLast()) {
											y = y - rsize;
										}
										sBufferR[pl, outRt[pl]] = p.setY(y);
										outRt[pl]++;
									}
									else{
										overflow[pl] = 2 * rBuffer.size();
										break;
									}
								}
								else
									if(y < lb) {
										if(outLt[pl] < rBuffer.size()) {
											if(here.isFirst()) {
												y = y + rsize;
											}
											sBufferL[pl, outLt[pl]] = p.setY(y);
											outLt[pl]++;
										}
										else{
											overflow[pl] = 2 * rBuffer.size();
											break;
										}
									}
									else{
										rBufferL[pl, inLeftStaying] = p;
										inLeftStaying++;
									}
							}
							inLt[pl] = inLeftStaying;
						}
				}
				final int rSize = rPart.size();
				final int[:rank==1 && distribution==dUnique] tMaxSize = (nPart + inLt + inRt - nSent);
				final int[:rank==1 && distribution==dUnique] tMinSize = (new int[dUnique](point(:rank==1)pt) {
					return rSize;
				}) - tMaxSize;
				info[1] = tMaxSize.max();
				info[2] = rSize - tMinSize.max();
				int err = ibflg[1] - rPart.size();
				if(err > 0) {
					System.err.println("Particle overflow error, err = " + err);
					info[0] = err;
					return particles;
				}
				finish
					ateach(point(:rank==1) [pl] : dist.UNIQUE){
						int holesTotal = nSent[pl];
						int holesLeft = nSent[pl];
						int nMove = X10Util.minInt(holesLeft, inLt[pl]);
						finish
							foreach(point(:rank==1) [i] : [0 : nMove - 1]){
								part[pl, holes[pl, i]] = rBufferL[pl, i];
							}
						holesLeft = holesLeft - inLt[pl];
						if(holesLeft > 0) {
							nMove = X10Util.minInt(holesLeft, inRt[pl]);
							for(point(:rank==1) [i] : [0 : nMove - 1]){
								part[pl, holes[pl, i + inLt[pl]]] = rBufferR[pl, i];
							}
						}
						else{
							nMove = -holesLeft;
							for(point(:rank==1) [i] : [0 : nMove - 1]){
								part[pl, i + nPart[pl]] = rBufferL[pl, i + holesTotal];
							}
						}
						if(holesLeft <= 0) {
							nPart[pl] = nPart[pl] - holesLeft;
							holesTotal = inLt[pl];
						}
						holesLeft = holesTotal - (inLt[pl] + inRt[pl]);
						if(holesLeft > 0) {
							holesTotal = inLt[pl] + inRt[pl];
							inRt[pl] = holesLeft;
						}
						else{
							holesTotal = holesTotal - inLt[pl];
							inRt[pl] = -holesLeft;
						}
						for(point(:rank==1) [i] : [0 : inRt[pl] - 1]){
							if(holesLeft > 0) {
								final int i1 = nPart[pl] - i - 1;
								final int i2 = holesTotal + holesLeft - i - 1;
								if(i1 > holes[pl, i2]) {
									part[pl, holes[pl, i2]] = part[pl, i1];
								}
							}
							else{
								part[pl, i + nPart[pl]] = rBufferR[pl, i + holesTotal];
							}
						}
						if(holesLeft > 0) {
							nPart[pl] = nPart[pl] - inRt[pl];
						}
						else{
							nPart[pl] = nPart[pl] + inRt[pl];
						}
						nSent[pl] = 0;
					}
				info[4] = X10Util.maxInt(info[4], mter);
				if(ibflg[1] > 0) {
					System.err.println("Info: particles being passed" + " further = " + ibflg[1]);
					if(ibflg[2] > 0) {
						ibflg[2] = 1;
					}
					if(iter >= ITER_MAX) {
						err = -((iter - 2 / 2));
						System.err.println("Iteration overflow, " + "iter = " + err);
						info[0] = err;
						doneInner = true;
						doneOuter = true;
					}
				}
				else{
					doneInner = true;
				}
			} while(!doneInner);
			if(!doneOuter && ibflg[2] > 0) {
				nter++;
				info[3] = nter;
			}
			else{
				doneOuter = true;
			}
		} while(!doneOuter);
		info[5] = nPart.sum();
		info[6] = nPartOld.sum();
		if(info[5] != info[6]) {
			System.err.println("Particle number error, old/new = " + info[0] + " " + info[1]);
			info[0] = 1;
		}
		if(nter > 0) {
			System.err.println("Info: " + nter + " buffer overflows, " + "nbmax = " + rBuffer.size());
		}
		return packParticleArray(part, nPart);
	}
	private void transferParticles(final Particle[:rank==2] leftOutBuffer, final Particle[:rank==2] rightOutBuffer, final int[:rank==1] outLeft, final int[:rank==1] outRight, final Particle[:rank==2] leftInBuffer, final Particle[:rank==2] rightInBuffer, final int[:rank==1] inLeft, final int[:rank==1] inRight) {
		finish
			ateach(point(:rank==1) [pl] : dist.UNIQUE){
				final place pLeft = here.prev();
				final place pRight = here.next();
				final region(:rank==1) rLeft = [0 : outLeft[pl] - 1];
				final region(:rank==1) rRight = [0 : outRight[pl] - 1];
				final Particle value[:rank==1] lBuffer = (Particle value[:rank==1])new Particle value[rLeft](point(:rank==1)[i]) {
					return leftOutBuffer[pl, i];
				};
				final Particle value[:rank==1] rBuffer = (Particle value[:rank==1])new Particle value[rRight](point(:rank==1)[i]) {
					return rightOutBuffer[pl, i];
				};
				async(pLeft) {
					final int pid = here.id;
					inRight[pid] = lBuffer.region.size();
					foreach(point(:rank==1) [i] : lBuffer){
						rightInBuffer[pid, i] = lBuffer[i];
					}
				}
				async(pRight) {
					final int pid = here.id;
					inLeft[pid] = rBuffer.region.size();
					foreach(point(:rank==1) [i] : rBuffer){
						leftInBuffer[pid, i] = rBuffer[i];
					}
				}
			}
	}
	private Particle[:rank==1] packParticleArray(final Particle[:rank==2] part, final int[:rank==1] nParticles) {
		int lb = 0;
		dist(:rank==1) dResult = (dist(:rank==1))(region.factory.emptyRegion(1) -> here);
		for(point(:rank==1) pt : dist.UNIQUE){
			int rsize = X10Util.pullInt(nParticles, pt);
			place p = place.places(pt[0]);
			dResult = dResult || ([lb : lb + rsize - 1] -> p);
			lb = lb + rsize;
		}
		final Particle[:rank==1] result = new Particle[dResult];
		finish
			ateach(point(:rank==1) [pl] : dist.UNIQUE){
				final region(:rank==1) rLocal = (region(:rank==1))(result.distribution | here).region;
				if(rLocal.size() > 0) {
					final int offset = rLocal.low();
					foreach(point(:rank==1) [i] : rLocal){
						result[i] = part[pl, i - offset];
					}
				}
			}
		return result;
	}
	public double pushParticles(final Particle[:rank==1] particles, final double[:rank==2] forceChargeX, final double[:rank==2] fcGuardX, final double[:rank==2] forceChargeY, final double[:rank==2] fcGuardY) {
		double lx = 0.0;
		double ly = 0.0;
		double rx = 0.0;
		double ry = 0.0;
		switch(BOUNDARY_CONDITION) {
			case 1 :
				rx = XLENGTH;
				break;

			case 2 :
				lx = 1.0;
				ly = 1.0;
				rx = XLENGTH - 1.0;
				ry = YLENGTH - 1.0;
				break;

			case 3 :
				lx = 1.0;
				rx = XLENGTH - 1.0;
				break;

		}
		final double edgelx = lx;
		final double edgely = ly;
		final double edgerx = rx;
		final double edgery = ry;
		final double quantum = ELECTRON_CHARGE * DELTA_TIME;
		final dist(:rank==1) dEnergy = particles.distribution;
		final double[:rank==1] energy = new double[dEnergy];
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				final double[:rank==2] fcLocalX = makeLocalSpace(forceChargeX, fcGuardX);
				final double[:rank==2] fcLocalY = makeLocalSpace(forceChargeY, fcGuardY);
				foreach(point(:rank==1) pt : particles.distribution | here){
					pushParticle(particles, pt, fcLocalX, fcLocalY, quantum, edgelx, edgely, edgerx, edgery, energy);
				}
			}
		return (0.125 * energy.sum());
	}
	private double[:rank==2] makeLocalSpace(final double[:rank==2] data, final double[:rank==2] guards) {
		final dist(:rank==2) dData = data.distribution;
		final dist(:rank==2) dGuard = guards.distribution;
		final region(:rank==2) rLocalD = X10Util.get2DLRegion(dData);
		final region(:rank==2) rLocalG = X10Util.get2DLRegion(dGuard);
		final dist(:rank==2) dResult = (dist(:rank==2))((rLocalD || rLocalG) -> here);
		final double[:rank==2] result = new double[dResult];
		finish {
			foreach(point(:rank==2) pt : data.distribution | here){
				result[pt] = data[pt];
			}
			foreach(point(:rank==2) pt : guards.distribution | here){
				result[pt] = guards[pt];
			}
		}
		return result;
	}
	private void pushParticle(final Particle[:rank==1] particles, final point(:rank==1) pt, final double[:rank==2] forceChargeX, final double[:rank==2] forceChargeY, final double quantum, final double edgelx, final double edgely, final double edgerx, final double edgery, final double[:rank==1] energy) {
		final Particle p = particles[pt];
		final int x = (int)p.getX();
		final int y = (int)p.getY();
		final double dx = p.getX() - x;
		final double dy = p.getY() - y;
		final double mx = 1.0 - dx;
		final double my = 1.0 - dy;
		final double ax = (dy * (dx * forceChargeX[y + 1, x + 1] + mx * forceChargeX[y + 1, x]) + my * (dx * forceChargeX[y, x + 1] + mx * forceChargeX[y, x]));
		final double ay = (dy * (dx * forceChargeY[y + 1, x + 1] + mx * forceChargeY[y + 1, x]) + my * (dx * forceChargeY[y, x + 1] + mx * forceChargeY[y, x]));
		double vx = p.getXVel() + quantum * ax;
		double vy = p.getYVel() + quantum * ay;
		double nx = p.getX() + vx * DELTA_TIME;
		double ny = p.getY() + vy * DELTA_TIME;
		energy[pt] = (Math.pow(vx + p.getXVel(), 2) + Math.pow(vy + p.getYVel(), 2));
		switch(BOUNDARY_CONDITION) {
			case 1 :
				if(nx < edgelx) {
					nx = nx + edgerx;
				}
				if(nx >= edgerx) {
					nx = nx - edgerx;
				}
				break;

			case 2 :
				if(ny < edgely || ny >= edgery) {
					ny = p.getY();
					vy = -vy;
				}

			case 3 :
				if(nx < edgelx || nx >= edgerx) {
					nx = p.getX();
					vx = -vx;
				}
				break;

		}
		particles[pt] = new Particle(nx, ny, vx, vy);
	}
	public int[:rank==1] countParticles(final Particle[:rank==1] particles, final dist(:rank==2) dField) {
		final dist(:rank==1) dCount = X10Util.get2DDistRank(dField, 0);
		final int[:rank==1] count = new int[dCount](point(:rank==1)pt) {
			return 0;
		};
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				for(point(:rank==1) pt : particles.distribution | here){
					count[(int)particles[pt].getY()]++;
				}
			}
		return count;
	}
	public dist(:rank==2) repartition(final int[:rank==1] particleCount, final dist(:rank==2) dField, final double countAve) {
		final int MAX = 32;
		final dist(:rank==1) dUnique = (dist(:rank==1))dist.UNIQUE;
		final dist(:rank==1) dGrids = X10Util.get2DDistRank(dField, 0);
		final region(:rank==2) rField = dField.region;
		final region(:rank==1) rRows = X10Util.getRank2D(rField, 1);
		final double[:rank==1] border = new double[dUnique](point(:rank==1)pt) {
			return 0.0;
		};
		final int[:rank==1] particleTotals = new int[dUnique](point(:rank==1)pt) {
			return 0;
		};
		final int[:rank==1] gridTotals = new int[dUnique](point(:rank==1)pt) {
			return 0;
		};
		final dist(:rank==2) dBuffer = X10Util.extendDistRank2D((dist(:rank==1))dist.UNIQUE, [0 : MAX - 1]);
		final int[:rank==2] sCountBuffer = new int[dBuffer];
		final int[:rank==2] rCountBuffer = new int[dBuffer];
		final int[:rank==1] sendCount = new int[dUnique];
		final int[:rank==1] sendGrids = new int[dUnique];
		final int[:rank==1] recvCount = new int[dUnique];
		final int[:rank==1] recvGrids = new int[dUnique];
		final int[:rank==1] finished = new int[dUnique](point(:rank==1)pt) {
			return 0;
		};
		finish
			ateach(point(:rank==1) [pl] : dist.UNIQUE){
				final dist(:rank==1) dPC = particleCount.distribution;
				final region(:rank==1) rLocal = X10Util.get1DLRegion(dPC);
				final int rsize = rLocal.size();
				final int offset = (rsize > 0)? rLocal.low() : 0;
				int total = 0;
				for(point(:rank==1) [i] : particleCount.distribution | here){
					final int count = particleCount[i];
					sCountBuffer[pl, i - offset] = count;
					total = total + count;
				}
				particleTotals[pl] = total;
				gridTotals[pl] = rsize;
				sendCount[pl] = total;
				sendGrids[pl] = rsize;
				recvCount[pl] = 0;
				recvGrids[pl] = 0;
			}
		final int[:rank==1] runningPTotals = parallelPrefix(particleTotals);
		final int[:rank==1] runningGTotals = parallelPrefix(gridTotals);
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				particleTotals[pl] = runningPTotals[pl];
				gridTotals[pl] = runningGTotals[pl];
			}
		do {
			finish
				ateach(point(:rank==1) [pl] : dist.UNIQUE){
					final int expected = (int)((pl + 1) * countAve + 0.5);
					final int surplus = runningPTotals[pl] - expected;
					if(surplus > 0.0) {
						final region(:rank==1) dSBuffer = [0 : sendGrids[pl] - 1];
						final int value[:rank==1] sBuffer = (int value[:rank==1])new int value[dSBuffer](point(:rank==1)[i]) {
							return sCountBuffer[pl, i];
						};
						final int nCount = sendCount[pl];
						final int nGrids = sendGrids[pl];
						finish
							async(here.next()) {
								recvCount[here.id] = nCount;
								recvGrids[here.id] = nGrids;
								finish
									foreach(point(:rank==1) [i] : dSBuffer){
										rCountBuffer[here.id, i] = sBuffer[i];
									}
							}
					}
				}
			finish
				ateach(point(:rank==1) [pl] : dist.UNIQUE){
					finished[pl] = 0;
					final int expected1 = (int)(pl * countAve + 0.5);
					final int expected2 = (int)((pl + 1) * countAve + 0.5);
					final int lDeficit = expected1 - runningPTotals[pl] + sendCount[pl];
					final int rDeficit = runningPTotals[pl] - expected2;
					if(lDeficit < 0.0) {
						if(lDeficit + recvCount[pl] >= 0.0) {
							int total = 0;
							int oldTotal = 0;
							int gsize = recvGrids[pl];
							int i = gsize;
							do {
								i--;
								oldTotal = total;
								total = total - rCountBuffer[pl, i];
							} while(total > lDeficit && i >= 0);
							double offset = ((gsize - i) + (((double)(lDeficit - oldTotal)) / ((double)(total - oldTotal))));
							border[pl] = runningGTotals[pl] - sendGrids[pl] - offset;
						}
						else{
							finished[pl]++;
						}
					}
					else
						if(runningPTotals[pl] >= expected1) {
							int gsize = sendGrids[pl];
							int i = 0;
							int total = 0;
							int oldTotal = 0;
							do {
								oldTotal = total;
								total = total + sCountBuffer[pl, i];
								i++;
							} while(total < lDeficit && i < gsize);
							double offset = i - 1;
							if(total > oldTotal) {
								offset = offset + (((double)(lDeficit - oldTotal)) / ((double)(total - oldTotal)));
							}
							border[pl] = runningGTotals[pl] - sendGrids[pl] + offset;
						}
					if(rDeficit > sendCount[pl]) {
						finished[pl]++;
					}
					if(!here.isFirst()) {
						int gsize = recvGrids[pl];
						runningPTotals[pl] = runningPTotals[pl] - sendCount[pl];
						runningGTotals[pl] = runningGTotals[pl] - sendGrids[pl];
						sendCount[pl] = recvCount[pl];
						sendGrids[pl] = recvGrids[pl];
						finish
							foreach(point(:rank==2) pt : [pl : pl, 0 : gsize - 1]){
								sCountBuffer[pt] = rCountBuffer[pt];
							}
					}
				}
		} while(finished.sum() != 0);
		finish
			ateach(point(:rank==1) [pl] : dist.UNIQUE){
				final dist(:rank==1) dPC = particleCount.distribution;
				final region(:rank==1) rLocal = X10Util.get1DLRegion(dPC);
				final int rsize = rLocal.size();
				final int offset = (rsize > 0)? rLocal.low() : 0;
				int total = 0;
				for(point(:rank==1) [i] : particleCount.distribution | here){
					final int count = particleCount[i];
					sCountBuffer[pl, i - offset] = count;
					total = total + count;
				}
				runningPTotals[pl] = particleTotals[pl];
				runningGTotals[pl] = gridTotals[pl];
				sendCount[pl] = total;
				sendGrids[pl] = rsize;
				recvCount[pl] = 0;
				recvGrids[pl] = 0;
			}
		do {
			finish
				ateach(point(:rank==1) [pl] : dist.UNIQUE){
					final int expected = (int)(pl * countAve + 0.5);
					final int lDeficit = (((int)((pl - 1) * countAve + 0.5)) - runningPTotals[pl] + sendCount[pl]);
					if(lDeficit > 0) {
						final region(:rank==1) dSBuffer = [0 : sendGrids[pl] - 1];
						final int value[:rank==1] sBuffer = (int value[:rank==1])new int value[dSBuffer](point(:rank==1)[i]) {
							return sCountBuffer[pl, i];
						};
						final int nCount = sendCount[pl];
						final int nGrids = sendGrids[pl];
						finish
							async(here.prev()) {
								recvCount[here.id] = nCount;
								recvGrids[here.id] = nGrids;
								foreach(point(:rank==1) [i] : dSBuffer){
									rCountBuffer[here.id, i] = sBuffer[i];
								}
							}
					}
				}
			finish
				ateach(point(:rank==1) [pl] : dist.UNIQUE){
					finished[pl] = 0;
					final int expected1 = (int)(pl * countAve + 0.5);
					final int expected2 = (int)((pl - 1) * countAve + 0.5);
					final int lDeficit = expected2 - runningPTotals[pl] + sendCount[pl];
					final int rDeficit = runningPTotals[pl] - expected1;
					if(runningPTotals[pl] < expected1) {
						if(runningPTotals[pl] + recvCount[pl] >= expected1) {
							final int gsize = recvGrids[pl];
							int oldTotal = 0;
							int total = 0;
							int i = 0;
							do {
								oldTotal = total;
								total = total + rCountBuffer[pl, i];
								i++;
							} while(total < -rDeficit && i < gsize);
							final int offset = (int)(i - 1 + (((double)(-rDeficit - oldTotal)) / ((double)(total - oldTotal))));
							border[pl] = runningGTotals[pl] + offset;
						}
						else{
							finished[pl]++;
						}
					}
					if(lDeficit > sendCount[pl]) {
						finished[pl]++;
					}
					if(!here.isLast()) {
						final int count = recvCount[pl];
						final int gsize = recvGrids[pl];
						runningPTotals[pl] = runningPTotals[pl] + count;
						runningGTotals[pl] = runningGTotals[pl] + gsize;
						sendCount[pl] = count;
						sendGrids[pl] = gsize;
						foreach(point(:rank==2) pt : [pl : pl, 0 : gsize - 1]){
							sCountBuffer[pt] = rCountBuffer[pt];
						}
					}
				}
		} while(finished.sum() != 0);
		final place pHere = here;
		final dist(:rank==1) dBounds = [0 : place.MAX_PLACES] -> here;
		final int[:rank==1] lowerbounds = new int[dBounds];
		final int[:rank==1] upperbounds = new int[dBounds];
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				final double edge = border[pl];
				async(pHere) {
					lowerbounds[pl] = (int)(edge + 0.5);
				}
			}
		for(point(:rank==1) i : [0 : place.MAX_PLACES - 1]){
			final int lb = lowerbounds[i];
			for(point(:rank==1) j : [i[0] + 1 : place.MAX_PLACES - 1]){
				if(lowerbounds[j] <= lb) {
					lowerbounds[j] = lb + 1;
				}
			}
		}
		for(point(:rank==1) i : [0 : place.MAX_PLACES - 2]){
			upperbounds[i] = lowerbounds[i + [1]] - 1;
		}
		upperbounds[place.MAX_PLACES - 1] = YLENGTH - 1;
		dist(:rank==2) dResult = (dist(:rank==2))(region.factory.emptyRegion(2) -> here);
		for(point(:rank==1) pl : dist.UNIQUE){
			final place p = dist.UNIQUE.get(pl);
			dResult = dResult || ([lowerbounds[pl] : upperbounds[pl], rRows] -> p);
		}
		return dResult;
	}
	public Particle[:rank==1] sortParticles(final Particle[:rank==1] particles, final dist(:rank==2) dField) {
		final dist(:rank==1) dParticles = particles.distribution;
		final Particle[:rank==1] result = new Particle[dParticles];
		final int[:rank==1] indices = new int[dParticles];
		final dist(:rank==1) dCount = X10Util.get2DDistRank(dField, 0);
		final int[:rank==1] count = new int[dCount](point(:rank==1)pt) {
			return 0;
		};
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				final dist(:rank==1) dP = particles.distribution;
				final region(:rank==1) rLocalP = X10Util.get1DLRegion(dP);
				final region(:rank==1) rLocalC = X10Util.get1DLRegion(dCount);
				for(point(:rank==1) pt : particles.distribution | here){
					final int y = (int)particles[pt].getY();
					count[y]++;
					indices[pt] = y;
				}
				final dist(:rank==1) dLocalC = rLocalC -> here;
				int offset = (rLocalP.size() > 0)? rLocalP.low() : 0;
				int[:rank==1] offsets = new int[dLocalC];
				for(point(:rank==1) pt : rLocalC){
					final int n = count[pt];
					offsets[pt] = offset;
					offset = offset + n;
				}
				for(point(:rank==1) pt : rLocalP){
					final int index = indices[pt];
					indices[pt] = offsets[index];
					offsets[index]++;
				}
				foreach(point(:rank==1) i : rLocalP){
					result[indices[i]] = particles[i];
				}
			}
		return result;
	}
	public int[:rank==1] parallelPrefix(final int[:rank==1] data) {
		final dist(:rank==1) dData = data.distribution;
		final int[:rank==1] result = new int[dData](point(:rank==1)pt) {
			return data[pt];
		};
		final int[:rank==1] tmp1 = new int[dData](point(:rank==1)pt) {
			return data[pt];
		};
		final int[:rank==1] tmp2 = new int[dData](point(:rank==1)pt) {
			return 0;
		};
		int strides = 1;
		while(strides < place.MAX_PLACES){
			final int stride = strides;
			finish
				ateach(point(:rank==1) pl : dist.UNIQUE){
					final int dir = (pl[0] / stride) % 2;
					final int val = tmp1[pl];
					final place pDst = place.places(pl[0] + ((dir == 0)? 1 : -1) * stride);
					finish
						async(pDst) {
							if(dir == 0) {
								result[here.id] = result[here.id] + val;
							}
							tmp2[here.id] = val;
						}
				}
			finish
				ateach(point(:rank==1) pl : dist.UNIQUE){
					tmp1[pl] = tmp1[pl] + tmp2[pl];
				}
			strides = strides + strides;
		}
		return result;
	}
}

value Particle {
	private final double x;
	private final double y;
	private final double xVel;
	private final double yVel;
	private final int pid;
	public Particle() {
		x = 0.0;
		y = 0.0;
		xVel = 0.0;
		yVel = 0.0;
		pid = -1;
	}
	public Particle(final double x, final double y, final double xVel, final double yVel) {
		this.x = x;
		this.y = y;
		this.xVel = xVel;
		this.yVel = yVel;
		pid = -1;
	}
	public Particle(final double x, final double y, final double xVel, final double yVel, final int pid) {
		this.x = x;
		this.y = y;
		this.xVel = xVel;
		this.yVel = yVel;
		this.pid = pid;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getXVel() {
		return xVel;
	}
	public double getYVel() {
		return yVel;
	}
	public Particle setX(final double x) {
		return new Particle(x, y, xVel, yVel, pid);
	}
	public Particle setY(final double y) {
		return new Particle(x, y, xVel, yVel, pid);
	}
	public Particle setXVel(final double xVel) {
		return new Particle(x, y, xVel, yVel, pid);
	}
	public Particle setYVel(final double yVel) {
		return new Particle(x, y, xVel, yVel, pid);
	}
	public Particle setPos(final double x, final double y) {
		return new Particle(x, y, xVel, yVel, pid);
	}
	public Particle setVel(final double xVel, final double yVel) {
		return new Particle(x, y, xVel, yVel, pid);
	}
	public String toString() {
		String result = (pid >= 0)? "p" + pid : "";
		result = result + "(" + x + "," + y + "," + xVel + "," + yVel + ")";
		return result;
	}
	public boolean particleEquals(final Particle p) {
		final double error = X10Util.ERROR;
		if(pid >= 0 && pid != p.pid) {
			return false;
		}
		return ((Math.abs(getX() - p.getX()) < error) && (Math.abs(getY() - p.getY()) < error) && (Math.abs(getXVel() - p.getXVel()) < error) && (Math.abs(getYVel() - p.getYVel()) < error));
	}
}

class ArrayUtil {
	public static Complex[:rank==2] doubleToComplex(final double[:rank==2] src) {
		final region(:rank==2) rSrc = src.region;
		final region(:rank==1) rS2 = X10Util.getRank2D(rSrc, 1);
		if(rS2.size() % 2 != 0) {
			System.err.println("Error: doubleToComplex requires the second " + "dimension to be of even size");
			final dist(:rank==2) dResult = (dist(:rank==2))(region.factory.emptyRegion(2) -> here);
			return new Complex[dResult];
		}
		final region(:rank==1) rD2 = [0 : rS2.size() / 2 - 1];
		final dist(:rank==2) dSrc = src.distribution;
		final dist(:rank==2) dResult = X10Util.extendDistRank2D(X10Util.get2DDistRank(dSrc, 0), rD2);
		final Complex[:rank==2] result = new Complex[dResult];
		finish
			ateach(point(:rank==2) pt : dResult){
				result[pt] = new Complex(src[pt * [1, 2]], src[pt * [1, 2] + [0, 1]]);
			}
		return result;
	}
	public static double[:rank==2] complexToDouble(final Complex[:rank==2] src) {
		final region(:rank==2) rSrc = src.region;
		final region(:rank==1) rS2 = X10Util.getRank2D(rSrc, 1);
		final region(:rank==1) rD2 = [0 : 2 * rS2.size() - 1];
		final dist(:rank==2) dSrc = src.distribution;
		final dist(:rank==2) dResult = X10Util.extendDistRank2D(X10Util.get2DDistRank(dSrc, 0), rD2);
		final double[:rank==2] result = new double[dResult];
		finish
			ateach(point(:rank==2) pt : dResult){
				final point(:rank==2) ptd2 = pt / [1, 2];
				if(pt[1] % 2 == 0) {
					result[pt] = src[ptd2].getReal();
				}
				else{
					result[pt] = src[ptd2].getImag();
				}
			}
		return result;
	}
	public static Complex[:rank==2] transpose(final Complex[:rank==2] data) {
		final dist(:rank==2) dData = (dist(:rank==2))data.distribution;
		if(!X10Util.isDistBlockStar(dData)) {
			X10Util.println("Transpose only works on star block" + "distributed arrays");
			throw new RuntimeException("transpose: " + data.distribution);
		}
		final dist(:rank==2) dResult = X10Util.transposeBlockStar(dData);
		final Complex[:rank==2] result = new Complex[dResult];
		finish
			ateach(point(:rank==1) pl : dist.UNIQUE){
				final region(:rank==2) rLocal = X10Util.get2DLRegion(dData);
				final region(:rank==2) rTtmp = X10Util.transposeRegion(rLocal);
				if(rLocal.size() > 0) {
					final region(:rank==1) rTtmp1 = X10Util.getRank2D(rTtmp, 0);
					final region(:rank==1) rTtmp2 = X10Util.getRank2D(rTtmp, 1);
					final region(:rank==2) rLocalT = [rTtmp1.low() : rTtmp1.high(), rTtmp2.low() : rTtmp2.high()];
					final region(:rank==1) rRSBuffer = (region(:rank==1))dist.UNIQUE.region;
					final region(:rank==2) value[:rank==1] rSBuffer = (region(:rank==2) value[:rank==1])new region(:rank==2) value[rRSBuffer](point(:rank==1)p) {
						final region(:rank==2) rTLocal = (region(:rank==2))(dResult | dist.UNIQUE.get(p)).region;
						return rLocalT && rTLocal;
					};
					final Complex value[:rank==2] sBuffer = (Complex value[:rank==2])new Complex value[rLocalT](point(:rank==2)[i, j]) {
						return data[j, i];
					};
					foreach(point(:rank==1) i : rSBuffer){
						ateach(point(:rank==2) pt : rSBuffer[i] -> dist.UNIQUE.get(i)){
							result[pt] = sBuffer[pt];
						}
					}
				}
			}
		return result;
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

