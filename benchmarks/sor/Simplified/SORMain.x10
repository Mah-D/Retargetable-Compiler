public class SORMain {
    public static void main(String[] args) {
	MyProgram.run();
    }
}

class MyProgram {
    public static final int JACOBI_NUM_ITER = 100;
    public static final long RANDOM_SEED = 10101010;
    public static final long multiplier =  0x5DEECE66DL;
    public static final long addend = 0xBL;
    public static final long numberone = 1;
    public static final long oneL= 1L;
    public static final int fortyeight = 48;
    public static final long maskplusone = oneL << fortyeight;
    public static final long mask = maskplusone - numberone;

    public static void run() {
        final SOR ss = new SOR();
	kernel(ss);
	validate(ss);
    }

    public static void kernel(final SOR s) {
        final int ten = 10;
        final Random rr = s.R;
	double[:rank==2] G = RandomMatrix(ten, ten, rr);
        final int jni = JACOBI_NUM_ITER;
        final double oneandaquarter = 1.25;
	SORrun(s, oneandaquarter, G, jni);
    }

    public static double[:rank==2] RandomMatrix(final int M, 
					 final int N, 
					 final Random R) {
        final int one = 1;
        final int ub1 = M-one;
        final int ub2 = N-one;
        final region(:rank==1) r1 = [0:ub1];
        final region(:rank==1) r2 = [0:ub2];
	final dist(:rank==2) d = blockStar(r1,r2);
	final double[:rank==2] t = new double[d];
        final region(:rank==2) rr = t.region;
	for (point(:rank==2) [i,j] : rr) {
            final double dd = nextDouble(R);
            final double small = 1e-6;
            final double d2 = dd * small;
	    write(t,i,j,d2);
	}
	return t;
    }

    public static void write(final double[:rank==2] t, final int i, final int j, final double v) {
        final dist(:rank==2) d = t.distribution;
        final place pl = d.get(i,j);
        final T1 y = new T1(t,i,j,v);
	finish { async (pl) { thread1(y); } } 
    }

    public static void thread1(final T1 z) {
        final double[:rank==2] t = z.t;
        final int i = z.i;
        final int j = z.j;
        final double v = z.v;
        t[i,j] = v;
    }

    public static dist(:rank==2) blockStar(final region(:rank==1) r1, final region(:rank==1) r2) {
	final dist(:rank==1) d1 = (dist(:rank==1)) dist.factory.block(r1);
        final dist(:rank==2) dres = distTimesRegion(d1, r2);
        return dres;
    }

    public static dist(:rank==2) distTimesRegion(final dist(:rank==1) d, final region(:rank==1) r) {
        final region(:rank==2) r0 = (region(:rank==2)) region.factory.emptyRegion(2);
        final place h = here;
	dist(:rank==2) d0 = r0->h;
        final dist(:rank==1) d3 = (dist(:rank==1)) dist.UNIQUE;
        final region(:rank==1) r3 = d3.region;
	for (point(:rank==1) [pl] : r3) {
	    place p = place.places(pl);
            final dist(:rank==1) restr_d = d | p; 
            final region(:rank==1) restr_r = restr_d.region;
            final region(:rank==2) comb_r = [restr_r, r];
            final dist(:rank==2) comb_d = comb_r -> p;
	    d0 = d0 || comb_d;
	}
	return d0;
    }

    public static void validate(final SOR s) {
        final double gtotal = s.gtotal;
        final double fourandahalf = 4.5185971433257635E-5;
        final double difference = gtotal - fourandahalf;
	final double dev = Math.abs(difference);
        final double small = 1.0e-12;
	final boolean b = dev > small;
	if (b) {
            final String s1 = "Validation failed";
	    System.out.println(s1);
            final String s2 = "gtotal = ";
            final String s3 = "  ";
	    System.out.print(s2);
            System.out.print(gtotal);
	    System.out.print(s3);
            System.out.println(dev);
            final String s4 = "Validation failed";
	    throw new RuntimeException(s4);
	}
    }

    public static double read(final double[:rank==2] G, 
		       final int i, 
		       final int j) {
	final region(:rank==1) r = [0:0];
        final place h = here;
	final dist(:rank==1) d = r->h;
	final double[:rank==1] result = new double[d];
	final place phere = here;
        final dist(:rank==2) G_d = G.distribution;
        final place h2 = G_d.get(i,j);
        final T2 y = new T2(G,i,j,phere,result);
	finish { async (h2) { thread2(y); } }
        final int zero = 0;
        final double res = result[zero];
	return res;
    }

    public static void thread2(final T2 z) {    
        final double[:rank==2] G = z.G;
        final int i = z.i;
        final int j = z.j;
        final place phere = z.phere;
        final double[:rank==1] result = z.result;

        final double val = G[i,j];
        final T3 y = new T3(result,val);
        async (phere) { thread3(y); }
    }

    public static void thread3(final T3 z) {
        final double[:rank==1] result = z.result;
        final double val = z.val;

        final int zero = 0;
        result[zero] = val;
    }

    public static void SORrun(final SOR s, final double omega, 
			     final double[:rank==2] G, 
			     final int num_iterations) {
        final int zero = 0;
        final int one = 1;
        final int two = 2;
        final dist(:rank==2) g_d = G.distribution;
        final region(:rank==2) g_r = g_d.region; 
        final region(:rank==1) g_r0 = (region(:rank==1)) (g_r.rank(zero));
        final region(:rank==1) g_r1 = (region(:rank==1)) (g_r.rank(one));
	final int M = g_r0.size();
	final int N = g_r1.size();

	// update interior points
	//
	final int Mm1 = M-one;
	final int Nm1 = N-one;
	    
	//JGFInstrumentor.startTimer("Section2:SOR:Kernel");

        final int ni_plusone = num_iterations-one;
        final region(:rank==1) reg1 = [0 : ni_plusone];
        final region(:rank==1) reg2 = [0:1];
	for (point(:rank==1) [p] : reg1) {
	    for (point(:rank==1) [o] : reg2) {
                final int Mm2 = Mm1-one; 
                final int one_plus_o = one+o;
                final int mop = Mm2-one_plus_o;
                final int mopdivtwo = mop/two;
                final region(:rank==1) reg3 = [0: mopdivtwo];
                final place h = here;
		finish { for (point(:rank==1) [ii] : reg3) { 
                  final T4 y = new T4(ii,o,G,Nm1,omega);
                  async(h) { thread4(y); }
                } }
	    }
	}

	//JGFInstrumentor.stopTimer("Section2:SOR:Kernel");
        final double gs = G.sum();
	s.gtotal = gs;
    }

    public static void thread4(final T4 z) {
        final int ii = z.ii;
        final int  o = z.o;
        final double[:rank==2] G = z.G;
        final int Nm1 = z.Nm1;
        final double omega = z.omega;
        
        final int one = 1;
        final int two = 2;
        final int twoii = two * ii;
        final int twoii_plusone = twoii + one;
	final int i = twoii_plusone + o;
        final dist(:rank==2) Gd = G.distribution;
        final place p = Gd.get(i,one);
        final T5 y = new T5(Nm1,G,i,omega);
	finish { async (p) { thread5(y); } }
    }

    public static void thread5(final T5 z) {
        final int Nm1 = z.Nm1;
        final double[:rank==2] G = z.G;
        final int i = z.i;
        final double omega = z.omega;

        final int one = 1;
        final double quarter = 0.25;
        final double onedouble = 1.0;
	final double omega_over_four = omega * quarter;
	final double one_minus_omega = onedouble - omega;

        final int Nm1_minusone = Nm1-one;
        final region(:rank==1) reg = [1 : Nm1_minusone];
        final int i_minusone = i-one;
        final int i_plusone = i+one;
	for (point(:rank==1) [j] : reg) {
            final int j_minusone = j-one;
            final int j_plusone = j+one;
            final double re1 = read(G, i_minusone, j);
            final double re2 = read(G, i_plusone, j);
            final double resum = re1 + re2;
            final double g1  = G[i,j_minusone];
            final double g2  = G[i,j_plusone];
            final double gsum = g1 + g2;
            final double re_plus_g = resum + gsum;
            final double omre = omega_over_four * re_plus_g;
            final double gij = G[i,j];
            final double og = one_minus_omega * gij;
            final double omreog = omre + og;
	    G[i,j] = omreog;
        }
    }
 
    public static int nextbits(final Random rand, final int bits) {
	final long oldseed = rand.seed;
        final long om = oldseed * multiplier;
        final long oma = om + addend;
	long nextseed = oma & mask;
	rand.seed = nextseed;

        final int fortyeight = 48;
        final int fb = fortyeight - bits;
        final long nfb = nextseed >>> fb;
	final int infb = (int) nfb;
        return infb;
    }

    public static int nextInt(final Random rand) {
        final int thirtytwo = 32;
        final int nb = nextbits(rand,thirtytwo);
	return nb;
    }

    public static long nextLong(final Random rand) {
        final int thirtytwo = 32;
        final int nb1 = nextbits(rand,thirtytwo);
        final long lnb = (long) nb1;
        final int nb2 = nextbits(rand,thirtytwo);
        final long lnbt = lnb << thirtytwo;
	final long l = lnbt + nb2;
        return l;
    }

    public static boolean nextBoolean(final Random rand) {
        final int zero = 0;
        final int one = 1;
        final int nb = nextbits(rand,one);
        final boolean b = nb != zero;
	return b;
    }

    public static double nextDouble(final Random rand) {
        final int twentysix = 26;
        final int twentyseven = 27;
        final int fiftythree = 53;
        final long one = 1L;
        final int nb1 = nextbits(rand,twentysix);
        final long lnb1 = (long) nb1;
        final long lnb127 = lnb1 << twentyseven;
        final int nb2 = nextbits(rand,twentyseven);
        final long lnbsum = lnb127 + nb2;
        final long of = one << fiftythree;
        final double dof = (double) of;
        final double res = lnbsum / dof;     
	return res;
    }
}

class SOR {
    public final Random R;
    public double gtotal;

    public SOR() {
        final long rs = MyProgram.RANDOM_SEED;
	R = new Random(rs);
	gtotal = 0.0;
    }
}

class Random {
    public long seed;

    public Random(final long rseed) {
        final long mu = MyProgram.multiplier;
        final long rm = rseed ^ mu;
        final long ma = MyProgram.mask;
	seed = rm & ma;
    }
}

value T1 {
    public final double[:rank==2] t;
    public final int i;
    public final int j;
    public final double v;
    public T1(final double[:rank==2] a_t, final int a_i, final int a_j, final double a_v) {
      t = a_t;
      i = a_i;
      j = a_j;
      v = a_v;
    }    
    public String toString() { final String s = ""; return s; }
}

value T2 {
    public final double[:rank==2] G;
    public final int i;
    public final int j;
    public final place phere;
    public final double[:rank==1] result;
    public T2(final double[:rank==2] a_G, final int a_i, final int a_j, final place a_phere,
              final double[:rank==1] a_result) {
          G = a_G;
          i = a_i;
          j = a_j;
      phere = a_phere;
     result = a_result;
    }
    public String toString() { final String s = ""; return s; }
}
 
value T3 {
    public final double[:rank==1] result;
    public final double val;
    public T3(final double[:rank==1] a_result, final double a_val) {
      result = a_result;
         val = a_val;
    }
    public String toString() { final String s = ""; return s; }
}

value T4 {
    public final int ii;
    public final int o;
    public final double[:rank==2] G;
    public final int Nm1;
    public final double omega; 
    public T4(final int a_ii, final int a_o, final double[:rank==2] a_G, final int a_Nm1,
                        final double a_omega) {
          ii = a_ii;
           o = a_o;
           G = a_G;
         Nm1 = a_Nm1;
       omega = a_omega;
    }
    public String toString() { final String s = ""; return s; }
}

value T5 {
    public final int Nm1;
    public final double[:rank==2] G;
    public final int i;
    public final double omega;
    public T5(final int a_Nm1, final double[:rank==2] a_G, final int a_i,
              final double a_omega) {
         Nm1 = a_Nm1;
           G = a_G;
           i = a_i;
       omega = a_omega;
    }
    public String toString() { final String s = ""; return s; }
}
