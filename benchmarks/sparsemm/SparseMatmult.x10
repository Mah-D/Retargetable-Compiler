/**************************************************************************
*                                                                         *
*         Java Grande Forum Benchmark Suite - Thread Version 1.0          *
*                                                                         *
*                            produced by                                  *
*                                                                         *
*                  Java Grande Benchmarking Project                       *
*                                                                         *
*                                at                                       *
*                                                                         *
*                Edinburgh Parallel Computing Centre                      *
*                                                                         *
*                email: epcc-javagrande@epcc.ed.ac.uk                     *
*                                                                         *
*      adapted from SciMark 2.0, author Roldan Pozo (pozo@cam.nist.gov)   *
*                                                                         *
*      This version copyright (c) The University of Edinburgh, 2001.      *
*                         All rights reserved.                            *
*                                                                         *
**************************************************************************/
//package sparsematmult;

//import jgfutil.*;
//import x10.lang.Double;

public class SparseMatmult {

	public int nthreads;

	private int setSize;
	private static final long RANDOM_SEED = 10101010;

	// reduced data sizes for test suite
	//private static final int[] datasizes_M = { 50000, 100000, 500000 };
	private static final int SPARSE_NUM_ITER = 200;

    private void initDataSizes_M(final int [:rank==1] datasizesM)
    {
        datasizesM[0] = 100;
        datasizesM[1] = 100000;
        datasizesM[2] = 500000;
    }


    private void initDataSizes_N(final int [:rank==1] datasizesN)
    {
        datasizesN[0] = 100;
        datasizesN[1] = 100000;
        datasizesN[2] = 500000;
    }

    private void initDataSizes_NZ(final int [:rank==1] datasizesNZ)
    {
        datasizesNZ[0] = 500;
        datasizesNZ[1] = 500000;
        datasizesNZ[2] = 2500000;
    }



        
    private static final Random R = new Random(RANDOM_SEED);

	private double value [:rank==1] x;
	private double value [:rank==1] val;
	private int value [:rank==1] col;
	private int value [:rank==1] row;
	private int value [:rank==1] lowsum;
	private int value [:rank==1] highsum;

	private double [:rank==1] y;

	public SparseMatmult() {
		this.nthreads = place.MAX_PLACES;
	}

	public void JGFsetsize(final int setSize) {
		this.setSize = setSize;
	}

	public void JGFinitialise() {
    	final region (:rank==1) ar = [0:2]; 
    	final dist   (:rank==1) dr = ar->here;
		final int [:rank==1] datasizes_M = new int [dr] (point (:rank==1) p) { 
	        return 0;
    	};
		final int [:rank==1] datasizes_N = new int [dr] (point (:rank==1) p) {
	        return 0;
    	};
		final int [:rank==1] datasizes_nz = new int [dr] (point (:rank==1) p) { 
	        return 0;
    	};
        initDataSizes_M(datasizes_M);
        initDataSizes_N(datasizes_N);
        initDataSizes_NZ(datasizes_nz);
		final int ds_N = datasizes_N[setSize];
		final int ds_M = datasizes_M[setSize];
		final int ds_nz = datasizes_nz[setSize];
		final region (:rank==1) r_nz = [0 : ds_nz-1];
		final region (:rank==1) r_nthreads = [0 : nthreads-1];
		final dist (:rank==1) d_M = (dist (:rank==1)) dist.factory.block([0 : ds_M-1]);
		final region (:rank==1) r_nthreadsPlus1 = [0 : nthreads];

		final region (:rank==1) ds_NReg = [0 : ds_N-1];
        final dist (:rank==1) ds_NRegDist = ds_NReg->here;
		final double[:rank==1] xin = (double [:rank==1])init((double [:rank==1])new double[ds_NRegDist], R);
        final region (:rank==1) xinreg = [0 : xin.distribution.region.size() - 1];
        final dist (:rank==1) xinregDist = xinreg->here;

		x = (double value [:rank==1])new double value[xinreg] (point (:rank==1) p) { return xin[p]; };
		//x = doubleArray.factory.doubleValueArray(xin); // value array.
		y = new double[d_M];      // distributed -- cvp

        final dist (:rank==1) r_nthreadsregDist = r_nthreads->here; 
		int [:rank==1] ilow = (int [:rank==1])new int[r_nthreadsregDist];
		int [:rank==1] iup = (int [:rank==1])new int[r_nthreadsregDist];
        final dist (:rank==1) r_nthreadsplus1regDist = r_nthreadsPlus1->here; 
        final dist (:rank==1) dsnzDist = r_nz->here; 
		final int [:rank==1] rowt = new int[dsnzDist];
		final int [:rank==1] colt = new int[dsnzDist];
		final double [:rank==1] valt = new double[dsnzDist];
		int [:rank==1] sumT = new int[r_nthreadsplus1regDist];
		int sect = (ds_M + nthreads-1)/nthreads;

		int [:rank==1] rowin = new int[dsnzDist];
		int [:rank==1] colin = new int[dsnzDist];
		double [:rank==1] valin = new double[dsnzDist];
		final int[:rank==1] lowsumin = (int [:rank==1])new int[r_nthreadsregDist];
		final int[:rank==1] highsumin = (int [:rank==1])new int[r_nthreadsregDist];

		for (point (:rank==1) p : [0:ds_nz-1]) {
			rowin[p] = Math.abs(R.nextInt()) % ds_M;
			colin[p] = Math.abs(R.nextInt()) % ds_N;
			valin[p] = R.nextDouble();
		}

		// reorder arrays for parallel decomposition

		for (point (:rank==1) i: r_nthreads) {
			ilow[i] = i[0]*sect;
			iup[i] = ((i[0]+1)*sect)-1;
			if (iup[i] > ds_M) iup[i] = ds_M;
		}

		for (point (:rank==1) i: r_nz) {
			for (point (:rank==1) j: r_nthreads) {
				if ((rowin[i] >= ilow[j]) && (rowin[i] <= iup[j])) {
					sumT[j+[1]] = sumT[j+[1]] + 1;
                }
            }
        }

		for (point (:rank==1) [j] : r_nthreads) {
			for (point (:rank==1) [i] : [0:j]) {
				lowsumin[j]  = lowsumin[j]  + sumT[j-i];
				highsumin[j] = highsumin[j] + sumT[j-i];
			}
        }

		for (point (:rank==1) i1: r_nz) {
			for (point (:rank==1) j1: r_nthreads) {
				if ((rowin[i1] >= ilow[j1]) && (rowin[i1] <= iup[j1])) {
					rowt[highsumin[j1]] = rowin[i1];
					colt[highsumin[j1]] = colin[i1];
					valt[highsumin[j1]] = valin[i1];
					highsumin[j1] = highsumin[j1]+1;
				}
            }
        }

        final region (:rank==1) rowtregion = [0:rowt.distribution.region.size() - 1]; 
        final dist (:rank==1)  rowtdist = rowtregion->here; 
		row = (int value [:rank==1]) new int value[rowtregion] (point (:rank==1) i) { return rowt[i]; };

        final region (:rank==1) coltregion = [0:colt.distribution.region.size() - 1]; 
        final dist (:rank==1)  coltdist = coltregion->here; 
		col = (int value[:rank==1]) new int value[coltregion] (point (:rank==1) i) { return colt[i]; };

        final region (:rank==1) valtregion = [0:valt.distribution.region.size() - 1]; 
        final dist (:rank==1)  valtdist = valtregion->here; 
		val = (double value [:rank==1]) new double value[valtregion] (point (:rank==1) i) { return valt[i]; };

        final region (:rank==1) lowsuminregion = [0:lowsumin.distribution.region.size() - 1]; 
        final dist (:rank==1)  lowsumindist = lowsuminregion->here; 
		lowsum = (int value[:rank==1]) new int value[lowsuminregion] (point (:rank==1) i) { return lowsumin[i]; };


        final region (:rank==1) highsuminregion = [0:highsumin.distribution.region.size() - 1]; 
        final dist (:rank==1)  highsumindist = highsuminregion->here; 
		highsum = (int value[:rank==1]) new int value[highsuminregion] (point (:rank==1) i) { return highsumin[i]; };

		//row = intArray.factory.intValueArray(rowt);
		//col = intArray.factory.intValueArray(colt);
		//val = doubleArray.factory.doubleValueArray(valt);
		//lowsum = intArray.factory.intValueArray(lowsumin);
		//highsum = intArray.factory.intValueArray(highsumin);
	}

	public void JGFkernel() {
		test(y, val, row, col, x, SPARSE_NUM_ITER, lowsum, highsum);
	}

    public void initRefVal(final double [:rank==1] refval)
    {
        refval[0] =  0.1436496372119012;
        refval[1] =  150.0130719633895;
        refval[2] =  749.5245870753752;
    }

	public void JGFvalidate() {
		//double refval[] = { 75.02484945753453, 150.0130719633895, 749.5245870753752 };
		//double refval[] = { 0.1436496372119012, 150.0130719633895, 749.5245870753752 };
        region (:rank==1) rtemp = [0:2]; 
        dist (:rank==1) dtemp = rtemp->here;  

        double [:rank==1] refval = new double [dtemp]; 
        initRefVal(refval);
		double dev = Math.abs(ytotal - refval[setSize]);
		if (dev > 1.0e-10) {
			System.out.println("Validation failed");
			System.out.println("ytotal = " + ytotal + "  " + dev + "  " + setSize);
            throw new RuntimeException("Validation failed");
		}
	}

	public void JGFtidyup() {
		//System.gc();
	}

	public void run(final int setSize) {
		//JGFInstrumentor.addTimer("Section2:SparseMatmult:Kernel", "Iterations", setSize);
		JGFsetsize(setSize);
		JGFinitialise();
		JGFkernel();
		JGFvalidate();
		JGFtidyup();

		//JGFInstrumentor.addOpsToTimer("Section2:SparseMatmult:Kernel", (double) (SPARSE_NUM_ITER));

		//JGFInstrumentor.printTimer("Section2:SparseMatmult:Kernel");
	}

	public static double[:rank==1] init (final double[:rank==1] a, final Random R) {
            final region (:rank==1) areg = [0:a.distribution.region.size() - 1]; 
            final dist (:rank==1) adist = areg->here; 
	    for (point (:rank==1) i: areg) {
                a[i] = R.nextDouble() * 1e-6;
            }
	    return a;
	}
	// final checksum -- cvp
	//public static final Double ytotal = new Double(0.0);
	//public static final Double ytotal = new Double(0.0);
	public double ytotal;

	/* 10 iterations used to make kernel have roughly
	   same granulairty as other Scimark kernels. */
	public void test(final double[:rank==1] y, final double value [:rank==1] val, final int value [:rank==1] row,
            final int value [:rank==1] col, final double value [:rank==1] x, final int NUM_ITERATIONS,
            final int value [:rank==1] lowsum, final int value [:rank==1] highsum)
	{
		final int nz = val.region.size();

		//JGFInstrumentor.startTimer("Section2:SparseMatmult:Kernel");
        final dist(:rank==1) dDistU = (dist (:rank==1))dist.UNIQUE;
        ytotal = 0.0;



		//finish foreach (point (:rank==1) id1: dist.factory.unique(place.places))
		finish foreach (point (:rank==1) id1: dDistU)
			for (point (:rank==1) reps: [0: NUM_ITERATIONS-1])
				for (point (:rank==1) i: [lowsum[id1] : highsum[id1]-1])
					// finish async (yt.distribution.get(row[i])) { yt[row[i]] = yt[row[i]] + x[col[i]]*val[i]; }
					//  cvp finish async not necessary because access is place-local
					//  vj. No, thats not the case. Get bad place exception.
					//  cvp - again: finish async not necessary - I just overlooked to check in the change
					//        of the initialization of ilow and iup in JGFSparseMatMultBench.x10.
					finish async (y.distribution.get(row[i])) { y[row[i]] = y[row[i]] + x[col[i]]*val[i]; }

		//JGFInstrumentor.stopTimer("Section2:SparseMatmult:Kernel");
       	//	for (point (:rank==1) i: [0:nz-1]) {
        //			ytotal = ytotal + future (y.distribution.get(row[i])) { y[row[i]] }.force();
        //}

        final place curr_place = here; 
        final region(:rank==1) tempr = [0:0];
        final dist (:rank==1) tempvd =  tempr->here; 
        final double [:rank==1]  tempref = new double[tempvd] (point(:rank==1) p0) { 
                return 0.0;
        };



	for (point (:rank==1) i: [0:nz-1]) {
            finish async (y.distribution.get(row[i]))
            {
                final double temp = y[row[i]];
                async ( curr_place ) 
                {
                    tempref[0] = temp;
                }
            }
            ytotal = ytotal + tempref[0];
        }
	}
}

