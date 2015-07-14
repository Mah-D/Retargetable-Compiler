class MGOP {
	public static final boolean PERF_On = Util.PERF_OUTPUT;
	public static final double PERF_Comp = 1.0 / Util.FP_PERCLOCK;
	public static final double PERF_CommL = Util.COMM_LATENCY * Util.CLOCK_SPEED;
	public static final double PERF_CommB = ((double)Util.CLOCK_SPEED / (double)Util.COMM_BANDWIDTH) * 8.0;
	public static final boolean PERF_InLoop = Util.IN_LOOP;
	public static final boolean PERF_CompOnly = Util.COMP_ONLY;
	public static final boolean PERF_CommOnly = Util.COMM_ONLY;
	public static final boolean OVERLAPPED = Util.OVERLAP_COMMANDCOMP;
	public final boolean EXCHANGE_After;
	private static final region(:rank==1) reg = [0 : 3];
	public static final double Ac0 = -8.0 / 3.0;
	public static final double Ac1 = 0.0;
	public static final double Ac2 = 1.0 / 6.0;
	public static final double Ac3 = 1.0 / 12.0;
	public static final double Sac0 = -3.0 / 8.0;
	public static final double Sac1 = 1.0 / 32.0;
	public static final double Sac2 = -1.0 / 64.0;
	public static final double Sac3 = 0.0;
	public static final double Pc0 = 1.0 / 2.0;
	public static final double Pc1 = 1.0 / 4.0;
	public static final double Pc2 = 1.0 / 8.0;
	public static final double Pc3 = 1.0 / 16.0;
	private static final int P2SLEVEL = Util.P2SLEVEL - 1;
	private final int m_size;
	private final region(:rank==3) m_problemDomain;
	private final int m_levels;
	private LevelData[:rank==1] m_r;
	private LevelData[:rank==1] m_z;
	private LevelData m_tempLD;
	public MGOP(final int a_size) {
		boolean temp_EXCHANGE_After = false;
		if(Util.OVERLAP_COMMANDCOMP)
			temp_EXCHANGE_After = false;
		else
			temp_EXCHANGE_After = Util.EXCHANGE_AFTER;
		EXCHANGE_After = temp_EXCHANGE_After;
		int i = 0;
		int j = 0;
		int k = 0;
		m_size = a_size;
		m_problemDomain = [0 : a_size - 1, 0 : a_size - 1, 0 : a_size - 1];
		final int log_a_size = Util.log2(a_size);
		m_levels = log_a_size;
		if(P2SLEVEL > 0) {
			i = Util.pow2(P2SLEVEL);
			j = i * i * i;
		}
		else{
		}
		final dist(:rank==1) d = [0 : log_a_size] -> here;
		m_r = new LevelData[d](point(:rank==1)p) {
			return new LevelData(Util.pow2(p[0] + 1), p[0] >= P2SLEVEL);
		};
		m_z = new LevelData[d](point(:rank==1)p) {
			return new LevelData(Util.pow2(p[0] + 1), p[0] >= P2SLEVEL);
		};
		if(P2SLEVEL > 0)
			m_tempLD = new LevelData(Util.pow2(P2SLEVEL), true);
		System.out.println("Overlapping communication and computation? " + OVERLAPPED + ". If not, doing exchange after computation? " + temp_EXCHANGE_After);
	}
	public void computeResidual2(final LevelData RES, final LevelData a_arg) {
		finish
			ateach(point(:rank==1) [i] : RES.getPlaces()){
				final double[:rank==3] res = RES.getArray(i);
				final double[:rank==3] arg = a_arg.getArray(i);
				region(:rank==3) R = RES.getInnerRegion(i);
				for(point(:rank==3) p : R){
					double d0 = arg[p];
					double d1 = 0;
					double d2 = Util.sumDIFF2(p, arg);
					double d3 = Util.sumDIFF3(p, arg);
					res[p] = res[p] - (Ac0 * d0 + Ac2 * d2 + Ac3 * d3);
				}
			}
		if(EXCHANGE_After)
			finish
				RES.exchange();
	}
	private void computeResidual3(final LevelData a_res, final LevelData a_arg1, final LevelData a_arg2) {
		if(OVERLAPPED)
			ComputeResidual_Overlapped(a_res, a_arg1, a_arg2);
		else
			ComputeResidual(a_res, a_arg1, a_arg2);
	}
	private void ComputeResidual(final LevelData a_res, final LevelData a_arg1, final LevelData a_arg2) {
		if(!EXCHANGE_After)
			finish
				a_arg2.exchange();
		finish
			ateach(point(:rank==1) [i] : a_res.getPlaces()){
				final double[:rank==3] res = a_res.getArray(i);
				final double[:rank==3] arg1 = a_arg1.getArray(i);
				final double[:rank==3] arg2 = a_arg2.getArray(i);
				region(:rank==3) R = a_res.getInnerRegion(i);
				for(point(:rank==3) p : R){
					double d0 = arg2[p];
					double d2 = Util.sumDIFF2(p, arg2);
					double d3 = Util.sumDIFF3(p, arg2);
					res[p] = arg1[p] - Ac0 * d0 - Ac2 * d2 - Ac3 * d3;
				}
			}
		if(EXCHANGE_After)
			finish
				a_res.exchange();
	}
	private void ComputeResidual_Overlapped1(final LevelData a_res, final LevelData a_arg1, final LevelData a_arg2) {
		finish {
			a_arg2.exchange();
			ateach(point(:rank==1) [i] : a_res.getPlaces()){
				final double[:rank==3] res = a_res.getArray(i);
				final double[:rank==3] arg1 = a_arg1.getArray(i);
				final double[:rank==3] arg2 = a_arg2.getArray(i);
				region(:rank==3) R = a_res.getINNERRegion(i);
				for(point(:rank==3) p : R){
					double d0 = arg2[p];
					double d2 = Util.sumDIFF2(p, arg2);
					double d3 = Util.sumDIFF3(p, arg2);
					res[p] = arg1[p] - Ac0 * d0 - Ac2 * d2 - Ac3 * d3;
				}
			}
		}
		finish
			ateach(point(:rank==1) [i] : a_res.getPlaces()){
				final double[:rank==3] res = a_res.getArray(i);
				final double[:rank==3] arg1 = a_arg1.getArray(i);
				final double[:rank==3] arg2 = a_arg2.getArray(i);
				region(:rank==3) R = a_res.getInnerRegion(i) - a_res.getINNERRegion(i);
				for(point(:rank==3) p : R){
					double d0 = arg2[p];
					double d2 = Util.sumDIFF2(p, arg2);
					double d3 = Util.sumDIFF3(p, arg2);
					res[p] = arg1[p] - Ac0 * d0 - Ac2 * d2 - Ac3 * d3;
				}
			}
	}
	private void ComputeResidual_Overlapped(final LevelData a_res, final LevelData a_arg1, final LevelData a_arg2) {
		finish
			async(here) {
				ateach(point(:rank==1) [i] : a_res.getPlaces()){
					final double[:rank==3] res = a_res.getArray(i);
					final double[:rank==3] arg1 = a_arg1.getArray(i);
					final double[:rank==3] arg2 = a_arg2.getArray(i);
					region(:rank==3) R = a_res.getINNERRegion(i);
					for(point(:rank==3) p : R){
						double d0 = arg2[p];
						double d2 = Util.sumDIFF2(p, arg2);
						double d3 = Util.sumDIFF3(p, arg2);
						res[p] = arg1[p] - Ac0 * d0 - Ac2 * d2 - Ac3 * d3;
					}
				}
				finish
					a_arg2.exchange();
				ateach(point(:rank==1) [i] : a_res.getPlaces()){
					final double[:rank==3] res = a_res.getArray(i);
					final double[:rank==3] arg1 = a_arg1.getArray(i);
					final double[:rank==3] arg2 = a_arg2.getArray(i);
					region(:rank==3) R = a_res.getInnerRegion(i) - a_res.getINNERRegion(i);
					for(point(:rank==3) p : R){
						double d0 = arg2[p];
						double d2 = Util.sumDIFF2(p, arg2);
						double d3 = Util.sumDIFF3(p, arg2);
						res[p] = arg1[p] - Ac0 * d0 - Ac2 * d2 - Ac3 * d3;
					}
				}
			}
	}
	private void smooth(final LevelData a_res, final LevelData a_arg, final boolean a_isBottom) {
		if(OVERLAPPED)
			Smooth_Overlapped(a_res, a_arg, a_isBottom);
		else
			Smooth(a_res, a_arg, a_isBottom);
	}
	private void Smooth(final LevelData a_res, final LevelData a_arg, final boolean a_isBottom) {
		if(!EXCHANGE_After)
			finish
				a_arg.exchange();
		finish
			ateach(point(:rank==1) [i] : a_res.getPlaces()){
				final double[:rank==3] res = a_res.getArray(i);
				final double[:rank==3] arg = a_arg.getArray(i);
				region(:rank==3) R = a_res.getInnerRegion(i);
				for(point(:rank==3) p : R){
					double d0 = arg[p];
					double d1 = Util.sumDIFF1(p, arg);
					double d2 = Util.sumDIFF2(p, arg);
					res[p] = res[p] + Sac0 * d0 + Sac1 * d1 + Sac2 * d2;
				}
			}
		if(EXCHANGE_After)
			finish
				a_res.exchange();
	}
	private void Smooth_Overlapped1(final LevelData a_res, final LevelData a_arg, final boolean a_isBottom) {
		finish {
			a_arg.exchange();
			ateach(point(:rank==1) [i] : a_res.getPlaces()){
				final double[:rank==3] res = a_res.getArray(i);
				final double[:rank==3] arg = a_arg.getArray(i);
				region(:rank==3) R = a_res.getINNERRegion(i);
				for(point(:rank==3) p : R){
					double d0 = arg[p];
					double d1 = Util.sumDIFF1(p, arg);
					double d2 = Util.sumDIFF2(p, arg);
					res[p] = res[p] + Sac0 * d0 + Sac1 * d1 + Sac2 * d2;
				}
			}
		}
		finish
			ateach(point(:rank==1) [i] : a_res.getPlaces()){
				final double[:rank==3] res = a_res.getArray(i);
				final double[:rank==3] arg = a_arg.getArray(i);
				region(:rank==3) R = a_res.getInnerRegion(i) - a_res.getINNERRegion(i);
				for(point(:rank==3) p : R){
					double d0 = arg[p];
					double d1 = Util.sumDIFF1(p, arg);
					double d2 = Util.sumDIFF2(p, arg);
					res[p] = res[p] + Sac0 * d0 + Sac1 * d1 + Sac2 * d2;
				}
			}
	}
	private void Smooth_Overlapped(final LevelData a_res, final LevelData a_arg, final boolean a_isBottom) {
		finish
			async(here) {
				ateach(point(:rank==1) [i] : a_res.getPlaces()){
					final double[:rank==3] res = a_res.getArray(i);
					final double[:rank==3] arg = a_arg.getArray(i);
					region(:rank==3) R = a_res.getINNERRegion(i);
					for(point(:rank==3) p : R){
						double d0 = arg[p];
						double d1 = Util.sumDIFF1(p, arg);
						double d2 = Util.sumDIFF2(p, arg);
						res[p] = res[p] + Sac0 * d0 + Sac1 * d1 + Sac2 * d2;
					}
				}
				finish
					a_arg.exchange();
				ateach(point(:rank==1) [i] : a_res.getPlaces()){
					final double[:rank==3] res = a_res.getArray(i);
					final double[:rank==3] arg = a_arg.getArray(i);
					region(:rank==3) R = a_res.getInnerRegion(i) - a_res.getINNERRegion(i);
					for(point(:rank==3) p : R){
						double d0 = arg[p];
						double d1 = Util.sumDIFF1(p, arg);
						double d2 = Util.sumDIFF2(p, arg);
						res[p] = res[p] + Sac0 * d0 + Sac1 * d1 + Sac2 * d2;
					}
				}
			}
	}
	private void applyOpP3(final LevelData a_res, final LevelData a_arg, final int a_level) {
		if(a_level == P2SLEVEL) {
			applyOpP2(m_tempLD, a_arg);
			final double[:rank==3] res = a_res.getArray(0);
			finish
				ateach(point(:rank==1) [i] : m_tempLD.getPlaces()){
					double[:rank==3] temp = m_tempLD.getArray(i);
					Util.arraycopy3(res, (region(:rank==3))m_tempLD.getInnerRegion(i), temp);
				}
		}
		else
			applyOpP2(a_res, a_arg);
		if(EXCHANGE_After)
			finish
				a_res.exchange();
	}
	private void applyOpP2(final LevelData a_res, final LevelData a_arg) {
		if(OVERLAPPED)
			ApplyOpP_Overlapped(a_res, a_arg);
		else
			ApplyOpP(a_res, a_arg);
	}
	private void ApplyOpP(final LevelData a_res, final LevelData a_arg) {
		if(!EXCHANGE_After)
			finish
				a_arg.exchange();
		finish
			ateach(point(:rank==1) [i] : a_res.getPlaces()){
				final double[:rank==3] arg = a_arg.getArray(i);
				final double[:rank==3] res = a_res.getArray(i);
				region(:rank==3) R = a_res.getInnerRegion(i);
				for(point(:rank==3) pp : R){
					point(:rank==3) p = pp * 2 + [1, 1, 1];
					double d0 = arg[p];
					double d1 = Util.sumDIFF1(p, arg);
					double d2 = Util.sumDIFF2(p, arg);
					double d3 = Util.sumDIFF3(p, arg);
					res[pp] = Pc0 * d0 + Pc1 * d1 + Pc2 * d2 + Pc3 * d3;
				}
			}
	}
	private void ApplyOpP_Overlapped1(final LevelData a_res, final LevelData a_arg) {
		finish {
			a_arg.exchange();
			ateach(point(:rank==1) [i] : a_res.getPlaces()){
				final double[:rank==3] arg = a_arg.getArray(i);
				final double[:rank==3] res = a_res.getArray(i);
				region(:rank==3) R = a_res.getINNERRegion(i);
				for(point(:rank==3) pp : R){
					point(:rank==3) p = pp * 2 + [1, 1, 1];
					double d0 = arg[p];
					double d1 = Util.sumDIFF1(p, arg);
					double d2 = Util.sumDIFF2(p, arg);
					double d3 = Util.sumDIFF3(p, arg);
					res[pp] = Pc0 * d0 + Pc1 * d1 + Pc2 * d2 + Pc3 * d3;
				}
			}
		}
		finish
			ateach(point(:rank==1) [i] : a_res.getPlaces()){
				final double[:rank==3] arg = a_arg.getArray(i);
				final double[:rank==3] res = a_res.getArray(i);
				region(:rank==3) R = a_res.getInnerRegion(i) - a_res.getINNERRegion(i);
				for(point(:rank==3) pp : R){
					point(:rank==3) p = pp * 2 + [1, 1, 1];
					double d0 = arg[p];
					double d1 = Util.sumDIFF1(p, arg);
					double d2 = Util.sumDIFF2(p, arg);
					double d3 = Util.sumDIFF3(p, arg);
					res[pp] = Pc0 * d0 + Pc1 * d1 + Pc2 * d2 + Pc3 * d3;
				}
			}
	}
	private void ApplyOpP_Overlapped(final LevelData a_res, final LevelData a_arg) {
		finish
			async(here) {
				ateach(point(:rank==1) [i] : a_res.getPlaces()){
					final double[:rank==3] arg = a_arg.getArray(i);
					final double[:rank==3] res = a_res.getArray(i);
					region(:rank==3) R = a_res.getINNERRegion(i);
					for(point(:rank==3) pp : R){
						point(:rank==3) p = pp * 2 + [1, 1, 1];
						double d0 = arg[p];
						double d1 = Util.sumDIFF1(p, arg);
						double d2 = Util.sumDIFF2(p, arg);
						double d3 = Util.sumDIFF3(p, arg);
						res[pp] = Pc0 * d0 + Pc1 * d1 + Pc2 * d2 + Pc3 * d3;
					}
				}
				finish
					a_arg.exchange();
				ateach(point(:rank==1) [i] : a_res.getPlaces()){
					final double[:rank==3] arg = a_arg.getArray(i);
					final double[:rank==3] res = a_res.getArray(i);
					region(:rank==3) R = a_res.getInnerRegion(i) - a_res.getINNERRegion(i);
					for(point(:rank==3) pp : R){
						point(:rank==3) p = pp * 2 + [1, 1, 1];
						double d0 = arg[p];
						double d1 = Util.sumDIFF1(p, arg);
						double d2 = Util.sumDIFF2(p, arg);
						double d3 = Util.sumDIFF3(p, arg);
						res[pp] = Pc0 * d0 + Pc1 * d1 + Pc2 * d2 + Pc3 * d3;
					}
				}
			}
	}
	private void applyOpQ3(final LevelData a_res, final LevelData a_arg, final int a_level) {
		if(a_level == P2SLEVEL - 1) {
			final double[:rank==3] arg = a_arg.getArray(0);
			finish
				ateach(point(:rank==1) [i] : m_tempLD.getPlaces()){
					double[:rank==3] temp = m_tempLD.getArray(i);
					Util.arraycopy3(temp, (region(:rank==3))temp.region, arg);
				}
			applyOpQ2(a_res, m_tempLD);
		}
		else{
			applyOpQ2(a_res, a_arg);
		}
	}
	private void applyOpQ2(final LevelData a_res, final LevelData a_arg) {
		if(OVERLAPPED)
			ApplyOpQ_Overlapped(a_res, a_arg);
		else
			ApplyOpQ(a_res, a_arg);
	}
	private void ApplyOpQ(final LevelData a_res, final LevelData a_arg) {
		if(!EXCHANGE_After)
			finish
				a_arg.exchange();
		finish
			ateach(point(:rank==1) [i] : a_res.getPlaces()){
				final double[:rank==3] arg = a_arg.getArray(i);
				final double[:rank==3] res = a_res.getArray(i);
				region(:rank==3) R = a_arg.getShrinkedRegion(i);
				for(point(:rank==3) p : R){
					double d = 0;
					point(:rank==3) pp = p * 2 + [1, 1, 1];
					for(point(:rank==3) o[i2, j2, k2] : Util.UNIT_CUBE){
						d = 0;
						for(point(:rank==3) [i1, j1, k1] : Util.QREGIONS[o]){
							final point(:rank==3) temp = p + [i1, j1, k1];
							d = d + arg[temp];
						}
						res[pp + [i2, j2, k2]] = d / Util.QREGIONS[o].size();
					}
				}
			}
	}
	private void ApplyOpQ_Overlapped1(final LevelData a_res, final LevelData a_arg) {
		finish {
			a_arg.exchange();
			ateach(point(:rank==1) [i] : a_res.getPlaces()){
				final double[:rank==3] arg = a_arg.getArray(i);
				final double[:rank==3] res = a_res.getArray(i);
				region(:rank==3) R = a_arg.getINNERRegion(i);
				for(point(:rank==3) p : R){
					double d = 0;
					point(:rank==3) pp = p * 2 + [1, 1, 1];
					for(point(:rank==3) o[i2, j2, k2] : Util.UNIT_CUBE){
						d = 0;
						for(point(:rank==3) [i1, j1, k1] : Util.QREGIONS[o]){
							final point(:rank==3) temp = p + [i1, j1, k1];
							d = d + arg[temp];
						}
						res[pp + [i2, j2, k2]] = d / Util.QREGIONS[o].size();
					}
				}
			}
		}
		finish
			ateach(point(:rank==1) [i] : a_res.getPlaces()){
				final double[:rank==3] arg = a_arg.getArray(i);
				final double[:rank==3] res = a_res.getArray(i);
				region(:rank==3) R = a_arg.getShrinkedRegion(i) - a_arg.getINNERRegion(i);
				for(point(:rank==3) p : R){
					double d = 0;
					point(:rank==3) pp = p * 2 + [1, 1, 1];
					for(point(:rank==3) o[i2, j2, k2] : Util.UNIT_CUBE){
						d = 0;
						for(point(:rank==3) [i1, j1, k1] : Util.QREGIONS[o]){
							final point(:rank==3) temp = p + [i1, j1, k1];
							d = d + arg[temp];
						}
						res[pp + [i2, j2, k2]] = d / Util.QREGIONS[o].size();
					}
				}
			}
	}
	private void ApplyOpQ_Overlapped(final LevelData a_res, final LevelData a_arg) {
		finish
			async(here) {
				ateach(point(:rank==1) [i] : a_res.getPlaces()){
					final double[:rank==3] arg = a_arg.getArray(i);
					final double[:rank==3] res = a_res.getArray(i);
					region(:rank==3) R = a_arg.getINNERRegion(i);
					for(point(:rank==3) p : R){
						double d = 0;
						point(:rank==3) pp = p * 2 + [1, 1, 1];
						for(point(:rank==3) o[i2, j2, k2] : Util.UNIT_CUBE){
							d = 0;
							for(point(:rank==3) [i1, j1, k1] : Util.QREGIONS[o]){
								final point(:rank==3) temp = p + [i1, j1, k1];
								d = d + arg[temp];
							}
							res[pp + [i2, j2, k2]] = d / Util.QREGIONS[o].size();
						}
					}
				}
				finish
					a_arg.exchange();
				ateach(point(:rank==1) [i] : a_res.getPlaces()){
					final double[:rank==3] arg = a_arg.getArray(i);
					final double[:rank==3] res = a_res.getArray(i);
					region(:rank==3) R = a_arg.getShrinkedRegion(i) - a_arg.getINNERRegion(i);
					for(point(:rank==3) p : R){
						double d = 0;
						point(:rank==3) pp = p * 2 + [1, 1, 1];
						for(point(:rank==3) o[i2, j2, k2] : Util.UNIT_CUBE){
							d = 0;
							for(point(:rank==3) [i1, j1, k1] : Util.QREGIONS[o]){
								final point(:rank==3) temp = p + [i1, j1, k1];
								d = d + arg[temp];
							}
							res[pp + [i2, j2, k2]] = d / Util.QREGIONS[o].size();
						}
					}
				}
			}
	}
	public double MGSolve(final LevelData a_u, final LevelData a_v, final int a_its) {
		int l = m_levels - 1;
		m_r[l].setLevelData(a_v);
		System.out.println("The init residual norm is " + m_r[l].norm2());
		double res = 0.0;
		int i = 0;
		while(i < a_its){
			System.out.println("Iteration " + i);
			MG();
			a_u.add(m_z[l]);
			computeResidual3(m_r[l], a_v, a_u);
			res = m_r[l].norm2();
			System.out.println("The residual norm is " + res);
			i++;
		}
		return res;
	}
	private void MG() {
		int i2 = m_levels - 1;
		while(i2 > 0){
			applyOpP3(m_r[i2 - 1], m_r[i2], i2);
			i2--;
		}
		m_z[0].set(0);
		smooth(m_z[0], m_r[0], true);
		int i3 = 1;
		while(i3 < m_levels){
			applyOpQ3(m_z[i3], m_z[i3 - 1], i3 - 1);
			computeResidual2(m_r[i3], m_z[i3]);
			smooth(m_z[i3], m_r[i3], false);
			i3++;
		}
	}
	private double residualNorm() {
		int l = m_levels - 1;
		return m_r[l].norm2();
	}
}

public class MGMain {
	public static void main(String[] args) {
		new MGDriver().driver();

	}
}

class Util {
	public static final boolean PERF_OUTPUT = true;
	public static final double CLOCK_SPEED = 375;
	public static final double FP_PERCLOCK = 4;
	public static final double COMM_LATENCY = 1;
	public static final double COMM_BANDWIDTH = 2000;
	public static final boolean IN_LOOP = false;
	public static final boolean COMP_ONLY = false;
	public static final boolean COMM_ONLY = false;
	public static final int THREADS_PERFOREACH = 1;
	public static final boolean OVERLAP_COMMANDCOMP = false;
	public static final boolean EXCHANGE_AFTER = false;
	public static final int P2SLEVEL = 1;
	public static final int N_PLACES = place.MAX_PLACES;
	public static double sumDIFF1(final point(:rank==3) p, final double[:rank==3] arg) {
		double d1 = 0;
		d1 = d1 + arg[p + [1, 0, 0]];
		d1 = d1 + arg[p + [-1, 0, 0]];
		d1 = d1 + arg[p + [0, 1, 0]];
		d1 = d1 + arg[p + [0, -1, 0]];
		d1 = d1 + arg[p + [0, 0, 1]];
		d1 = d1 + arg[p + [0, 0, -1]];
		return d1;
	}
	public static double sumDIFF2(final point(:rank==3) p, final double[:rank==3] arg) {
		double d1 = 0;
		d1 = d1 + arg[p + [1, 1, 0]];
		d1 = d1 + arg[p + [1, -1, 0]];
		d1 = d1 + arg[p + [-1, 1, 0]];
		d1 = d1 + arg[p + [-1, -1, 0]];
		d1 = d1 + arg[p + [1, 0, 1]];
		d1 = d1 + arg[p + [1, 0, -1]];
		d1 = d1 + arg[p + [-1, 0, 1]];
		d1 = d1 + arg[p + [-1, 0, -1]];
		d1 = d1 + arg[p + [0, 1, 1]];
		d1 = d1 + arg[p + [0, 1, -1]];
		d1 = d1 + arg[p + [0, -1, 1]];
		d1 = d1 + arg[p + [0, -1, -1]];
		return d1;
	}
	public static double sumDIFF3(final point(:rank==3) p, final double[:rank==3] arg) {
		double d1 = 0;
		d1 = d1 + arg[p + [1, 1, 1]];
		d1 = d1 + arg[p + [1, 1, -1]];
		d1 = d1 + arg[p + [1, -1, 1]];
		d1 = d1 + arg[p + [1, -1, -1]];
		d1 = d1 + arg[p + [-1, 1, 1]];
		d1 = d1 + arg[p + [-1, 1, -1]];
		d1 = d1 + arg[p + [-1, -1, 1]];
		d1 = d1 + arg[p + [-1, -1, -1]];
		return d1;
	}
	public static final region(:rank==3) UNIT_CUBE = [0 : 1, 0 : 1, 0 : 1];
	public static final region(:rank==3) value[:rank==3] QREGIONS = (region(:rank==3) value[:rank==3])new region(:rank==3) value[UNIT_CUBE](point(:rank==3)p[a, b, c]) {
		return [0 : a, 0 : b, 0 : c];
	};
	public static final int LOW = 0;
	public static final int HIGH = 1;
	public static boolean powerOf2(final int a_int) {
		int i = (int)Math.abs(a_int);
		if(i == 0)
			return false;
		else{
			if(i != (pow2(log2(i))))
				return false;
		}
		return true;
	}
	public static int log2(final int a_int) {
		return (int)(Math.log(a_int) / Math.log(2));
	}
	public static int pow2(final int a_int) {
		return (int)Math.pow(2, a_int);
	}
	public static region(:rank==3) boundary(final region(:rank==3) a_R, final int a_direction, final int a_padSize0, final int a_padSize1, final int a_padSize2) {
		int i = (int)Math.abs(a_direction);
		boolean IsHigh = (a_direction > 0);
		int low0 = a_R.rank(0).low();
		int low1 = a_R.rank(1).low();
		int low2 = a_R.rank(2).low();
		int high0 = a_R.rank(0).high();
		int high1 = a_R.rank(1).high();
		int high2 = a_R.rank(2).high();
		int r = 3;
		if(i <= r && r == 3) {
			if(IsHigh) {
				return [(i == 1? high0 + 1 : low0) - a_padSize0 : (i == 1? high0 + 1 : high0) + a_padSize0, (i == 2? high1 + 1 : low1) - a_padSize1 : (i == 2? high1 + 1 : high1) + a_padSize1, (i == 3? high2 + 1 : low2) - a_padSize2 : (i == 3? high2 + 1 : high2) + a_padSize2];
			}
			else{
				return [(i == 1? low0 - 1 : low0) - a_padSize0 : (i == 1? low0 - 1 : high0) + a_padSize0, (i == 2? low1 - 1 : low1) - a_padSize1 : (i == 2? low1 - 1 : high1) + a_padSize1, (i == 3? low2 - 1 : low2) - a_padSize2 : (i == 3? low2 - 1 : high2) + a_padSize2];
			}
		}
		else{
			System.out.println("MG3TongValue1.boundary():Warning! invalid inputs!");
			return [0 : -1, 0 : -1, 0 : -1];
		}
	}
	public static void arraycopy3(final double[:rank==3] a_dest, final region(:rank==3) a_destR, final double[:rank==3] a_src) {
		for(point(:rank==3) p : a_destR){
			final place h = here;
			async(a_src.distribution.get(p)) {
				final double d = a_src[p];
				async(h) {
					a_dest[p] = d;
				}
			}
		}
	}
	public static void arraycopy4(final double[:rank==3] a_dest, final region(:rank==3) a_destR, final double[:rank==3] a_src, final int a_trans0, final int a_trans1, final int a_trans2) {
		for(point(:rank==3) p : a_destR){
			final place h = here;
			async(a_src.distribution.get(p + [a_trans0, a_trans1, a_trans2])) {
				final double d = a_src[p + [a_trans0, a_trans1, a_trans2]];
				async(h) {
					a_dest[p] = d;
				}
			}
		}
	}
	public Util() {
	}
}

class MGDriver {
	public static void driver() {
		int CLASS = 1;
		final boolean isDistributed = true;
		int problemSize = 0;
		int numberIterations = 0;
		double reference2Norm = 0;
		switch(CLASS) {
			case 1 :
				problemSize = 32;
				numberIterations = 4;
				reference2Norm = 5.30770700573E-5;
				break;

			case 2 :
				problemSize = 64;
				numberIterations = 40;
				reference2Norm = 2.50391406439E-18;
				break;

			case 3 :
				problemSize = 256;
				numberIterations = 4;
				reference2Norm = 2.433365309e-6;
				break;

			case 4 :
				problemSize = 256;
				numberIterations = 20;
				reference2Norm = 1.80056440132e-6;
				break;

			case 5 :
				problemSize = 512;
				numberIterations = 20;
				reference2Norm = 5.70674826298e-7;
				break;

			case 6 :
				problemSize = 1024;
				numberIterations = 50;
				reference2Norm = 1.58327506043e-10;
				break;

			default :
				System.err.println("Class must be one of {S,W,A,B,C,D}!");

		}
		LevelData u = new LevelData(problemSize, isDistributed);
		LevelData v = new LevelData(problemSize, isDistributed);
		v.initialize(CLASS);
		MGOP MG = new MGOP(problemSize);
		System.out.println("There are " + Util.N_PLACES + " places. Running problem of class " + CLASS);
		Timer tmr = new Timer();
		int count = 0;
		tmr.start(count);
		double res = 0;
		res = MG.MGSolve(u, v, numberIterations);
		tmr.stop(count);
		System.out.println("The reference 2norm is " + reference2Norm + ". The difference is " + (res - reference2Norm));
		System.out.println("Wall-clock time for MGSolve: " + tmr.readTimer(count) + "secs");
	}
}

value Wrapper {
	public String toString() {
		return "";
	}
	public final double[:rank==3] m_array;
	public Wrapper(final double[:rank==3] a_array) {
		m_array = a_array;
	}
}

value LevelData {
	public String toString() {
		return "";
	}
	public static final boolean PERF_On = Util.PERF_OUTPUT;
	public static final double PERF_Comp = 1.0 / Util.FP_PERCLOCK;
	public static final double PERF_CommL = Util.COMM_LATENCY * Util.CLOCK_SPEED;
	public static final double PERF_CommB = ((double)Util.CLOCK_SPEED / (double)Util.COMM_BANDWIDTH) * 8.0;
	public static final boolean PERF_InLoop = Util.IN_LOOP;
	public static final boolean PERF_CompOnly = Util.COMP_ONLY;
	public static final boolean PERF_CommOnly = Util.COMM_ONLY;
	public final boolean EXCHANGE_After;
	public static final int N_PLACES = Util.N_PLACES;
	public static final int HIGH = Util.HIGH;
	public static final int LOW = Util.LOW;
	private final int SIZE;
	private final region(:rank==3) P_DOMAIN;
	private final boolean ISPARALLEL;
	private final region(:rank==3)[:rank==1] m_regions;
	private final region(:rank==3)[:rank==1] m_REGIONs;
	private final region(:rank==3)[:rank==2] m_boundaries;
	private final dist(:rank==1) m_places;
	private final int m_numPlaces;
	private final region(:rank==3) m_placeGrid;
	private final int m_size0;
	private final int m_size1;
	private final int m_size2;
	private final int m_block0;
	private final int m_block1;
	private final int m_block2;
	private final dist(:rank==3)[:rank==1] m_dist;
	private final dist(:rank==3)[:rank==1] m_DIST;
	private final Wrapper[:rank==1] m_u;
	public dist(:rank==1) getPlaces() {
		return m_places;
	}
	public double[:rank==3] getArray(final int a_idx) {
		return (double[:rank==3])(m_u[a_idx].m_array);
	}
	public region(:rank==3) getInnerRegion(final int a_idx) {
		return (region(:rank==3))get_m_regions(a_idx);
	}
	public region(:rank==3) getINNERRegion(final int a_idx) {
		region(:rank==3) R = (region(:rank==3))m_regions[a_idx];
		return (region(:rank==3))([R.rank(0).low() + 1 : R.rank(0).high() - 1, R.rank(1).low() + 1 : R.rank(1).high() - 1, R.rank(2).low() + 1 : R.rank(2).high() - 1]);
	}
	public region(:rank==3) getShrinkedRegion(final int a_idx) {
		region(:rank==3) R = (region(:rank==3))get_m_REGIONs(a_idx);
		return (region(:rank==3))([R.rank(0).low() : R.rank(0).high() - 1, R.rank(1).low() : R.rank(1).high() - 1, R.rank(2).low() : R.rank(2).high() - 1]);
	}
	public region(:rank==3) getRegion(final int a_idx) {
		return (region(:rank==3))m_REGIONs[a_idx];
	}
	private void print() {
		finish
			ateach(point(:rank==1) [i] : m_places){
				double res = 0;
				double[:rank==3] temp = (double[:rank==3])m_u[i].m_array;
				for(point(:rank==3) p : m_REGIONs[i]){
					res = res + Math.abs(temp[p]);
				}
				System.out.println("block at place " + i + " : " + temp.region + " sum of m_u=" + res);
			}
	}
	private void PRINT() {
		finish
			ateach(point(:rank==1) [i] : m_places){
				System.out.println("block at place " + i + " : ");
				double[:rank==3] temp = (double[:rank==3])m_u[i].m_array;
				int counter = 0;
				for(point(:rank==3) p : m_regions[i]){
					System.out.print(" [" + p + "]= " + temp[p]);
					counter++;
					if(counter == 4) {
						System.out.print("\n");
						counter = 0;
					}
				}
				System.out.println("");
			}
	}
	public double norm2() {
		final double[:rank==1] results = new double[m_places];
		finish
			ateach(point(:rank==1) [i] : m_places){
				double res = 0;
				final double[:rank==3] temp = (double[:rank==3])m_u[i].m_array;
				for(point(:rank==3) p : get_m_regions(i)){
					final place h = here;
					final dist(:rank==1) dRecv = (dist(:rank==1))([0 : 0] -> here);
					final double[:rank==1] aRecv = new double[dRecv];
					finish
						async(temp.distribution.get(p)) {
							final double temp3 = temp[p] * temp[p];
							async(h) {
								aRecv[0] = temp3;
							}
						}
					res = res + aRecv[0];
				}
				results[i] = res;
			}
		double temp = results.sum() / (SIZE * SIZE * SIZE);
		return Math.sqrt(temp);
	}
	public void initialize(final int a_CLASS) {
		finish
			ateach(point(:rank==1) [i] : m_places){
				final double[:rank==3] temp = (double[:rank==3])m_u[i].m_array;
				final region(:rank==3) R = get_m_regions(i);
				foreach(point(:rank==3) p[x, y, z] : temp){
					switch(a_CLASS) {
						case 1 :
							if((((x == 0) && (y == 11) && (z == 2)) || ((x == 13) && (y == 8) && (z == 17)) || ((x == 5) && (y == 14) && (z == 0)) || ((x == 4) && (y == 28) && (z == 15)) || ((x == 12) && (y == 2) && (z == 1)) || ((x == 5) && (y == 17) && (z == 8)) || ((x == 20) && (y == 19) && (z == 11)) || ((x == 26) && (y == 15) && (z == 31)) || ((x == 8) && (y == 25) && (z == 22)) || ((x == 7) && (y == 14) && (z == 26))) && R.contains(p)) {
								temp[p] = -1;
							}
							if((((x == 7) && (y == 1) && (z == 20)) || ((x == 19) && (y == 29) && (z == 31)) || ((x == 2) && (y == 0) && (z == 3)) || ((x == 4) && (y == 22) && (z == 3)) || ((x == 1) && (y == 16) && (z == 21)) || ((x == 21) && (y == 31) && (z == 6)) || ((x == 12) && (y == 15) && (z == 12)) || ((x == 30) && (y == 4) && (z == 25)) || ((x == 28) && (y == 0) && (z == 28)) || ((x == 17) && (y == 26) && (z == 17))) && R.contains(p)) {
								temp[p] = 1;
							}
							break;

						case 2 :
							if((((x == 38) && (y == 60) && (z == 51)) || ((x == 50) && (y == 15) && (z == 23)) || ((x == 18) && (y == 45) && (z == 36)) || ((x == 25) && (y == 14) && (z == 36)) || ((x == 26) && (y == 25) && (z == 25)) || ((x == 32) && (y == 37) && (z == 0)) || ((x == 29) && (y == 62) && (z == 54)) || ((x == 39) && (y == 49) && (z == 57)) || ((x == 12) && (y == 29) && (z == 28)) || ((x == 63) && (y == 46) && (z == 25))) && R.contains(p)) {
								temp[p] = -1;
							}
							if((((x == 27) && (y == 32) && (z == 45)) || ((x == 39) && (y == 0) && (z == 5)) || ((x == 45) && (y == 23) && (z == 49)) || ((x == 20) && (y == 32) && (z == 58)) || ((x == 23) && (y == 47) && (z == 57)) || ((x == 17) && (y == 43) && (z == 53)) || ((x == 8) && (y == 16) && (z == 48)) || ((x == 51) && (y == 46) && (z == 26)) || ((x == 58) && (y == 19) && (z == 62)) || ((x == 58) && (y == 15) && (z == 54))) && R.contains(p)) {
								temp[p] = 1;
							}
							break;

						case 3 :

						case 4 :
							if((((x == 221) && (y == 40) && (z == 238)) || ((x == 152) && (y == 160) && (z == 34)) || ((x == 80) && (y == 182) && (z == 253)) || ((x == 248) && (y == 168) && (z == 155)) || ((x == 197) && (y == 5) && (z == 201)) || ((x == 90) && (y == 61) && (z == 203)) || ((x == 15) && (y == 203) && (z == 30)) || ((x == 99) && (y == 154) && (z == 57)) || ((x == 100) && (y == 136) && (z == 110)) || ((x == 209) && (y == 152) && (z == 96))) && R.contains(p)) {
								temp[p] = -1;
							}
							if((((x == 52) && (y == 207) && (z == 38)) || ((x == 241) && (y == 170) && (z == 12)) || ((x == 201) && (y == 16) && (z == 196)) || ((x == 200) && (y == 81) && (z == 207)) || ((x == 113) && (y == 121) && (z == 205)) || ((x == 210) && (y == 5) && (z == 246)) || ((x == 43) && (y == 192) && (z == 232)) || ((x == 174) && (y == 244) && (z == 162)) || ((x == 3) && (y == 116) && (z == 173)) || ((x == 55) && (y == 118) && (z == 165))) && R.contains(p)) {
								temp[p] = 1;
							}
							break;

						case 5 :
							if((((x == 397) && (y == 310) && (z == 198)) || ((x == 94) && (y == 399) && (z == 236)) || ((x == 221) && (y == 276) && (z == 59)) || ((x == 342) && (y == 137) && (z == 166)) || ((x == 381) && (y == 72) && (z == 281)) || ((x == 350) && (y == 192) && (z == 416)) || ((x == 16) && (y == 19) && (z == 455)) || ((x == 152) && (y == 336) && (z == 8)) || ((x == 400) && (y == 502) && (z == 447)) || ((x == 72) && (y == 0) && (z == 105))) && R.contains(p)) {
								temp[p] = -1;
							}
							if((((x == 308) && (y == 359) && (z == 9)) || ((x == 9) && (y == 491) && (z == 116)) || ((x == 449) && (y == 268) && (z == 441)) || ((x == 147) && (y == 115) && (z == 197)) || ((x == 241) && (y == 85) && (z == 3)) || ((x == 507) && (y == 41) && (z == 125)) || ((x == 161) && (y == 278) && (z == 73)) || ((x == 144) && (y == 91) && (z == 310)) || ((x == 201) && (y == 8) && (z == 49)) || ((x == 149) && (y == 399) && (z == 329))) && R.contains(p)) {
								temp[p] = 1;
							}
							break;

						case 6 :
							if((((x == 186) && (y == 374) && (z == 694)) || ((x == 773) && (y == 345) && (z == 474)) || ((x == 478) && (y == 874) && (z == 804)) || ((x == 306) && (y == 75) && (z == 624)) || ((x == 397) && (y == 667) && (z == 49)) || ((x == 606) && (y == 199) && (z == 59)) || ((x == 892) && (y == 70) && (z == 361)) || ((x == 844) && (y == 261) && (z == 252)) || ((x == 221) && (y == 906) && (z == 14)) || ((x == 85) && (y == 327) && (z == 232))) && R.contains(p)) {
								temp[p] = -1;
							}
							if((((x == 739) && (y == 879) && (z == 781)) || ((x == 742) && (y == 641) && (z == 147)) || ((x == 335) && (y == 295) && (z == 600)) || ((x == 982) && (y == 944) && (z == 696)) || ((x == 622) && (y == 881) && (z == 180)) || ((x == 956) && (y == 217) && (z == 952)) || ((x == 777) && (y == 453) && (z == 706)) || ((x == 258) && (y == 730) && (z == 482)) || ((x == 271) && (y == 75) && (z == 815)) || ((x == 78) && (y == 276) && (z == 250))) && R.contains(p)) {
								temp[p] = 1;
							}
							break;

					}
				}
			}
		if(EXCHANGE_After)
			finish
				exchange();
	}
	public void set(final double a_db) {
		finish
			ateach(point(:rank==1) [i] : m_places){
				final double[:rank==3] temp = (double[:rank==3])get_m_u(i).m_array;
				for(point(:rank==3) p : get_m_regions(i))
					temp[p] = a_db;
			}
		if(EXCHANGE_After)
			finish
				exchange();
	}
	public void setLevelData(final LevelData a_LD) {
		finish
			ateach(point(:rank==1) [i] : m_places){
				final double[:rank==3] u = (double[:rank==3])m_u[i].m_array;
				final double[:rank==3] temp = a_LD.getArray(i);
				final region(:rank==3) mri = get_m_regions(i);
				for(point(:rank==3) p : mri){
					final double tp = temp[p];
					async(u.distribution.get(p)) {
						u[p] = tp;
					}
				}
			}
		if(EXCHANGE_After)
			finish
				exchange();
	}
	public void add(final LevelData a_LD) {
		finish
			ateach(point(:rank==1) [i] : m_places){
				final double[:rank==3] u = (double[:rank==3])get_m_u(i).m_array;
				final double[:rank==3] temp = a_LD.getArray(i);
				for(point(:rank==3) p : get_m_regions(i)){
					u[p] = u[p] + temp[p];
				}
			}
		if(EXCHANGE_After)
			finish
				exchange();
	}
	private void Exchange() {
		for(point(:rank==1) [j] : [0 : 2]){
			final int jj = j;
			finish
				ateach(point(:rank==1) [i] : m_places){
					final int dest0 = m_placeGrid.coord(i)[0];
					final int dest1 = m_placeGrid.coord(i)[1];
					final int dest2 = m_placeGrid.coord(i)[2];
					final int ii = i;
					for(point(:rank==1) [p] : [LOW : HIGH]){
						int disp0 = 0;
						int disp1 = 0;
						int disp2 = 0;
						int source0 = 0;
						int source1 = 0;
						int source2 = 0;
						int trans0 = 0;
						int trans1 = 0;
						int trans2 = 0;
						int sourceID = 0;
						int k = 0;
						if(p == LOW) {
							k = jj * 2;
							disp0 = (jj == 0? 1 : 0);
							disp1 = (jj == 1? 1 : 0);
							disp2 = (jj == 2? 1 : 0);
						}
						else{
							k = jj * 2 + 1;
							disp0 = (jj == 0? -1 : 0);
							disp1 = (jj == 1? -1 : 0);
							disp2 = (jj == 2? -1 : 0);
						}
						source0 = dest0 - disp0;
						source1 = dest1 - disp1;
						source2 = dest2 - disp2;
						if(m_placeGrid.contains([source0, source1, source2])) {
							sourceID = m_placeGrid.ordinal([source0, source1, source2]);
							Util.arraycopy3((double[:rank==3])m_u[ii].m_array, (region(:rank==3))get_m_boundaries(k, ii), (double[:rank==3])m_u[sourceID].m_array);
						}
						else{
							if(jj == 0) {
								source0 = dest0 + disp0 * (m_block0 - 1);
								source1 = dest1 + disp1 * (m_block0 - 1);
								source2 = dest2 + disp2 * (m_block0 - 1);
							}
							else
								if(jj == 1) {
									source0 = dest0 + disp0 * (m_block1 - 1);
									source1 = dest1 + disp1 * (m_block1 - 1);
									source2 = dest2 + disp2 * (m_block1 - 1);
								}
								else{
									source0 = dest0 + disp0 * (m_block2 - 1);
									source1 = dest1 + disp1 * (m_block2 - 1);
									source2 = dest2 + disp2 * (m_block2 - 1);
								}
							sourceID = m_placeGrid.ordinal([source0, source1, source2]);
							if(jj == 0) {
								trans0 = disp0 * m_size0;
								trans1 = disp1 * m_size0;
								trans2 = disp2 * m_size0;
							}
							else
								if(jj == 1) {
									trans0 = disp0 * m_size1;
									trans1 = disp1 * m_size1;
									trans2 = disp2 * m_size1;
								}
								else{
									trans0 = disp0 * m_size2;
									trans1 = disp1 * m_size2;
									trans2 = disp2 * m_size2;
								}
							Util.arraycopy4((double[:rank==3])m_u[ii].m_array, (region(:rank==3))m_boundaries[k, ii], (double[:rank==3])m_u[sourceID].m_array, trans0, trans1, trans2);
						}
					}
				}
		}
	}
	public void exchange() {
		async(here) {
			for(point(:rank==1) [j] : [0 : 2]){
				finish
					ateach(point(:rank==1) [i] : m_places){
						final int jj = j;
						final int dest0 = m_placeGrid.coord(i)[0];
						final int dest1 = m_placeGrid.coord(i)[1];
						final int dest2 = m_placeGrid.coord(i)[2];
						final int ii = i;
						finish
							foreach(point(:rank==1) [p] : [LOW : HIGH]){
								int disp0 = 0;
								int disp1 = 0;
								int disp2 = 0;
								int trans0 = 0;
								int trans1 = 0;
								int trans2 = 0;
								int sourceID = 0;
								int k = 0;
								if(p == LOW) {
									k = jj * 2;
									disp0 = (jj == 0? 1 : 0);
									disp1 = (jj == 1? 1 : 0);
									disp2 = (jj == 2? 1 : 0);
								}
								else{
									k = jj * 2 + 1;
									disp0 = (jj == 0? -1 : 0);
									disp1 = (jj == 1? -1 : 0);
									disp2 = (jj == 2? -1 : 0);
								}
								int source0 = dest0 - disp0;
								int source1 = dest1 - disp1;
								int source2 = dest2 - disp2;
								if(m_placeGrid.contains([source0, source1, source2])) {
									sourceID = m_placeGrid.ordinal([source0, source1, source2]);
									double[:rank==3] ma = (double[:rank==3])get_m_u(ii).m_array;
									Util.arraycopy3((double[:rank==3])get_m_u(ii).m_array, (region(:rank==3))get_m_boundaries(k, ii), (double[:rank==3])get_m_u(sourceID).m_array);
								}
								else{
									if(jj == 0) {
										source0 = dest0 + disp0 * (m_block0 - 1);
										source1 = dest1 + disp1 * (m_block0 - 1);
										source2 = dest2 + disp2 * (m_block0 - 1);
									}
									else
										if(jj == 1) {
											source0 = dest0 + disp0 * (m_block1 - 1);
											source1 = dest1 + disp1 * (m_block1 - 1);
											source2 = dest2 + disp2 * (m_block1 - 1);
										}
										else{
											source0 = dest0 + disp0 * (m_block2 - 1);
											source1 = dest1 + disp1 * (m_block2 - 1);
											source2 = dest2 + disp2 * (m_block2 - 1);
										}
									sourceID = m_placeGrid.ordinal([source0, source1, source2]);
									if(jj == 0) {
										trans0 = disp0 * m_size0;
										trans1 = disp1 * m_size0;
										trans2 = disp2 * m_size0;
									}
									else
										if(jj == 1) {
											trans0 = disp0 * m_size1;
											trans1 = disp1 * m_size1;
											trans2 = disp2 * m_size1;
										}
										else{
											trans0 = disp0 * m_size2;
											trans1 = disp1 * m_size2;
											trans2 = disp2 * m_size2;
										}
									Util.arraycopy4((double[:rank==3])get_m_u(ii).m_array, (region(:rank==3))get_m_boundaries(k, ii), (double[:rank==3])get_m_u(sourceID).m_array, trans0, trans1, trans2);
								}
							}
					}
			}
		}
	}
	public dist(:rank==3)[:rank==1] getDist3Array(final dist(:rank==1) d) {
		return (dist(:rank==3)[:rank==1])new dist(:rank==3)[d];
	}
	public region(:rank==3)[:rank==1] getRegion3Array1(final dist(:rank==1) d) {
		return (region(:rank==3)[:rank==1])new region(:rank==3)[d];
	}
	public region(:rank==3)[:rank==2] getRegion3Array2(final dist(:rank==2) d) {
		return (region(:rank==3)[:rank==2])new region(:rank==3)[d];
	}
	public LevelData(final int a_problemDomainSize, final boolean a_isParallel) {
		final dist(:rank==1) ALLPLACES = (dist(:rank==1))dist.UNIQUE;
		if(Util.OVERLAP_COMMANDCOMP) {
			EXCHANGE_After = false;
		}
		else{
			EXCHANGE_After = Util.EXCHANGE_AFTER;
		}
		SIZE = a_problemDomainSize;
		ISPARALLEL = a_isParallel;
		final region(:rank==3) temp_P_DOMAIN = [0 : a_problemDomainSize - 1, 0 : a_problemDomainSize - 1, 0 : a_problemDomainSize - 1];
		P_DOMAIN = temp_P_DOMAIN;
		int numCuts = 0;
		int temp_m_numPlaces = 0;
		if(a_isParallel) {
			m_places = ALLPLACES;
			temp_m_numPlaces = N_PLACES;
			numCuts = Util.log2(N_PLACES);
		}
		else{
			m_places = [0 : 0] -> ALLPLACES.get(0);
			temp_m_numPlaces = 1;
			numCuts = 0;
		}
		m_numPlaces = temp_m_numPlaces;
		dist(:rank==1) d = [0 : temp_m_numPlaces] -> here;
		dist(:rank==2) di = [0 : 5, 0 : temp_m_numPlaces - 1] -> here;
		final dist(:rank==3)[:rank==1] temp_m_dist = (dist(:rank==3)[:rank==1])getDist3Array(d);
		m_dist = temp_m_dist;
		final dist(:rank==3)[:rank==1] temp_m_DIST = (dist(:rank==3)[:rank==1])getDist3Array(d);
		m_DIST = temp_m_DIST;
		final int m_low0 = temp_P_DOMAIN.rank(0).low();
		final int m_low1 = temp_P_DOMAIN.rank(1).low();
		final int m_low2 = temp_P_DOMAIN.rank(2).low();
		final int m_hi0 = temp_P_DOMAIN.rank(0).high();
		final int m_hi1 = temp_P_DOMAIN.rank(1).high();
		final int m_hi2 = temp_P_DOMAIN.rank(2).high();
		final int temp_m_size0 = m_hi0 - m_low0 + 1;
		final int temp_m_size1 = m_hi1 - m_low1 + 1;
		final int temp_m_size2 = m_hi2 - m_low2 + 1;
		m_size0 = temp_m_size0;
		m_size1 = temp_m_size1;
		m_size2 = temp_m_size2;
		int a = numCuts / 3;
		int b = numCuts % 3;
		final int m_cut0 = a + (b > 0? 1 : 0);
		final int m_cut1 = a + (b > 1? 1 : 0);
		final int m_cut2 = a;
		final int pow2_m_cut0 = Util.pow2(m_cut0);
		final int pow2_m_cut1 = Util.pow2(m_cut1);
		final int pow2_m_cut2 = Util.pow2(m_cut2);
		m_block0 = pow2_m_cut0;
		m_block1 = pow2_m_cut1;
		m_block2 = pow2_m_cut2;
		final int m_blockSize0 = temp_m_size0 / pow2_m_cut0;
		final int m_blockSize1 = temp_m_size1 / pow2_m_cut1;
		final int m_blockSize2 = temp_m_size2 / pow2_m_cut2;
		final region(:rank==3) temp_m_placeGrid = [0 : pow2_m_cut0 - 1, 0 : pow2_m_cut1 - 1, 0 : pow2_m_cut2 - 1];
		m_placeGrid = temp_m_placeGrid;
		int i = 0;
		region(:rank==3)[:rank==1] m_reg = (region(:rank==3)[:rank==1])getRegion3Array1(d);
		region(:rank==3)[:rank==1] m_REG = (region(:rank==3)[:rank==1])getRegion3Array1(d);
		for(point(:rank==3) [x, y, z] : temp_m_placeGrid){
			final int mrl0 = m_blockSize0 * x + m_low0;
			final int mrl1 = m_blockSize1 * y + m_low1;
			final int mrl2 = m_blockSize2 * z + m_low2;
			final int mrh0 = m_blockSize0 * (x + 1) + m_low0;
			final int mrh1 = m_blockSize1 * (y + 1) + m_low1;
			final int mrh2 = m_blockSize2 * (z + 1) + m_low2;
			m_reg[i] = [mrl0 : mrh0 - 1, mrl1 : mrh1 - 1, mrl2 : mrh2 - 1];
			m_REG[i] = [mrl0 - 1 : mrh0, mrl1 - 1 : mrh1, mrl2 - 1 : mrh2];
			temp_m_dist[i] = [mrl0 : mrh0 - 1, mrl1 : mrh1 - 1, mrl2 : mrh2 - 1] -> place.places(i);
			temp_m_DIST[i] = [mrl0 - 1 : mrh0, mrl1 - 1 : mrh1, mrl2 - 1 : mrh2] -> place.places(i);
			i++;
		}
		m_regions = m_reg;
		m_REGIONs = m_REG;
		region(:rank==3)[:rank==2] temp_m_boundaries = (region(:rank==3)[:rank==2])getRegion3Array2(di);
		for(point(:rank==2) [j, ii] : di){
			if(j == 0) {
				temp_m_boundaries[j, ii] = Util.boundary((region(:rank==3))m_reg[ii], -(0 + 1), (0 > 0? 1 : 0), (0 > 1? 1 : 0), 0);
			}
			if(j == 2) {
				temp_m_boundaries[j, ii] = Util.boundary((region(:rank==3))m_reg[ii], -(1 + 1), (1 > 0? 1 : 0), (1 > 1? 1 : 0), 0);
			}
			if(j == 4) {
				temp_m_boundaries[j, ii] = Util.boundary((region(:rank==3))m_reg[ii], -(2 + 1), (2 > 0? 1 : 0), (2 > 1? 1 : 0), 0);
			}
			if(j == 1) {
				temp_m_boundaries[j, ii] = Util.boundary((region(:rank==3))m_reg[ii], (0 + 1), (0 > 0? 1 : 0), (0 > 1? 1 : 0), 0);
			}
			if(j == 3) {
				temp_m_boundaries[j, ii] = Util.boundary((region(:rank==3))m_reg[ii], (1 + 1), (1 > 0? 1 : 0), (1 > 1? 1 : 0), 0);
			}
			if(j == 5) {
				temp_m_boundaries[j, ii] = Util.boundary((region(:rank==3))m_reg[ii], (2 + 1), (2 > 0? 1 : 0), (2 > 1? 1 : 0), 0);
			}
		}
		m_boundaries = temp_m_boundaries;
		final Wrapper[:rank==1] temp_m_u = getWrapperArray(ALLPLACES);
		m_u = temp_m_u;
		for(point(:rank==1) [k] : [0 : N_PLACES - 1]){
			final dist(:rank==3) disi = (dist(:rank==3))temp_m_DIST[k];
			finish
				async(temp_m_u.distribution.get(k)) {
					temp_m_u[k] = new Wrapper(getDoubleArray(disi));
				}
		}
	}
	private Wrapper[:rank==1] getWrapperArray(final dist(:rank==1) d) {
		return new Wrapper[d];
	}
	private double[:rank==3] getDoubleArray(final dist(:rank==3) d) {
		return new double[d](point(:rank==3)pp) {
			return 0;
		};
	}
	private region(:rank==3) get_m_regions(final int i) {
		final place h = here;
		final dist(:rank==1) dRecv = (dist(:rank==1))([0 : 0] -> here);
		final region(:rank==3)[:rank==1] aRecv = (region(:rank==3)[:rank==1])new region(:rank==3)[dRecv];
		finish
			async(m_regions.distribution.get(i)) {
				final region(:rank==3) temp3 = (region(:rank==3))m_regions[i];
				async(h) {
					aRecv[0] = temp3;
				}
			}
		final region(:rank==3) mri = (region(:rank==3))aRecv[0];
		return mri;
	}
	private region(:rank==3) get_m_REGIONs(final int i) {
		final place h = here;
		final dist(:rank==1) dRecv = (dist(:rank==1))([0 : 0] -> here);
		final region(:rank==3)[:rank==1] aRecv = (region(:rank==3)[:rank==1])new region(:rank==3)[dRecv];
		finish
			async(m_REGIONs.distribution.get(i)) {
				final region(:rank==3) temp3 = (region(:rank==3))m_REGIONs[i];
				async(h) {
					aRecv[0] = temp3;
				}
			}
		final region(:rank==3) mri = (region(:rank==3))aRecv[0];
		return mri;
	}
	private region(:rank==3) get_m_boundaries(final int i, final int j) {
		final place h = here;
		final dist(:rank==1) dRecv = (dist(:rank==1))([0 : 0] -> here);
		final region(:rank==3)[:rank==1] aRecv = (region(:rank==3)[:rank==1])new region(:rank==3)[dRecv];
		finish
			async(m_boundaries.distribution.get(i, j)) {
				final region(:rank==3) temp4 = (region(:rank==3))m_boundaries[i, j];
				async(h) {
					aRecv[0] = temp4;
				}
			}
		final region(:rank==3) mri = (region(:rank==3))aRecv[0];
		return mri;
	}
	private Wrapper get_m_u(final int i) {
		final place h = here;
		final dist(:rank==1) dRecv = (dist(:rank==1))([0 : 0] -> here);
		final Wrapper[:rank==1] aRecv = (Wrapper[:rank==1])new Wrapper[dRecv];
		finish
			async(m_u.distribution.get(i)) {
				final Wrapper temp4 = m_u[i];
				async(h) {
					aRecv[0] = temp4;
				}
			}
		final Wrapper mri = aRecv[0];
		return mri;
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

