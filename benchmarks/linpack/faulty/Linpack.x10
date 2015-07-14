/**************************************************************************
 *                                                                         *
 *             Java Grande Forum Benchmark Suite - Version 2.0             *
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
 *            See below for the previous history of this code              *
 *                                                                         *
 *      This version copyright (c) The University of Edinburgh, 1999.      *
 *                         All rights reserved.                            *
 *                                                                         *
 **************************************************************************/

/*
  Modified 3/3/97 by David M. Doolin (dmd) doolin@cs.utk.edu
  Fixed error in matgen() method. Added some comments.

  Modified 1/22/97 by Paul McMahan mcmahan@cs.utk.edu
  Added more MacOS options to form.

  Optimized by Jonathan Hardwick (jch@cs.cmu.edu), 3/28/96
  Compare to Linkpack.java.
  Optimizations performed:
  - added "final" modifier to performance-critical methods.
  - changed lines of the form "a[i] = a[i] + x" to "a[i] += x".
  - minimized array references using common subexpression elimination.
  - eliminated unused variables.
  - undid an unrolled loop.
  - added temporary 1D arrays to hold frequently-used columns of 2D arrays.
  - wrote my own myabs() method
  See http://www.cs.cmu.edu/~jch/java/linpack.html FOR More details.

  Ported to Java by Reed Wade  (wade@cs.utk.edu) 2/96
  built using JDK 1.0 on solaris
  using "javac -O Linpack.java"

  Translated to C by Bonnie Toy 5/88
  (modified on 2/25/94  to fix a problem with daxpy  for
  unequal increments or equal increments not equal to 1.
  Jack Dongarra)
*/
// package lufact;

// import jgfutil.*;

/**
 * Ported to X10 March 17 2005
 * @author ahk
 * @author cmd
 */
public class Linpack {

	private int setSize;
	//private int datasizes[] = { 150, 1000, 2000 };

    private static final region(:rank==1) r = [0:2];
    // private static final dist (:rank==1) vd =  r->here; 
    private static final dist (:rank==1) vd =  r->place.FIRST_PLACE; 
    private static final int [:rank==1]  datasizes = new int[vd] (point(:rank==1) p0) { 
            return 0; 
    };
	
    public void initdataSizesArray()
    {
        this.datasizes[0] = 150;
        this.datasizes[1] = 1000;
        this.datasizes[2] = 2000;
    }


	public void JGFsetsize(int setSize) {
		this.setSize = setSize;
	}

	public void JGFinitialise() {
                initdataSizesArray();
		n = datasizes[setSize];

		System.out.println("ATTENTION: Running with smaller size (" + n + " instead of 500)");
		ldaa = n;
		lda = ldaa + 1;

		region (:rank==1) vectorRegion = [0:ldaa];
        region (:rank==1) vectorRegionMinus1 = [0:ldaa - 1];
		dist (:rank==1) vectorRegionMinus1Dist = vectorRegionMinus1->here;

		region (:rank==2) rectangularRegion = [0:ldaa, 0:lda];
		region (:rank==2) slimRegion = [0:0, 0:lda]; //fake out because we don't support array sections
		dist (:rank==2) slimRegionDist = slimRegion->here; //fake out because we don't support array sections
		dist (:rank==2) rectangular_distribution = (dist (:rank==2))dist.factory.blockCyclic(rectangularRegion, lda+1);
		//dist (:rank==2) rectangular_distribution = (dist (:rank==2))dist.factory.block(rectangularRegion);
        //kunal change this : How to convert the dist.factory.blockCyclic into a block distribution




		a = new double[rectangular_distribution];
		b = new double[slimRegionDist];
		x = new double[slimRegionDist];
		ipvt = new int[vectorRegionMinus1Dist];


		long nl = (long) n;   //avoid integer overflow
		ops = (2.0*(nl*nl*nl))/3.0 + 2.0*(nl*nl);

		norma = matgen(a, lda, n, b);
	}

	public void JGFkernel() {
		//JGFInstrumentor.startTimer("Section2:LUFact:Kernel");
		info = dgefa(a, lda, n, ipvt);
		dgesl(a, lda, n, ipvt, b, 0);
		//JGFInstrumentor.stopTimer("Section2:LUFact:Kernel");
	}


	public void JGFvalidate() {
		double eps = 0.0;
        double residn = 0.0;

        final double [:rank==1]  ref = new double[vd] (point(:rank==1) p0) { 
                return 0.0; 
        };
        
            
        ref[0] = 6.0;
        ref[1] = 12.0;
        ref[2] = 20.0;

		//final double ref[] = { 6.0, 12.0, 20.0 };

        final region (:rank==2) tempR = [0:0, 0:n];
        final dist (:rank==2) tempdist = tempR->here;
        //final int j = 0;
        for (point (:rank==2) p[j, i] : tempdist ) { 
			x[0,i] = b[0,i];
		}

		norma = matgen(a, lda, n, b);

        for (point (:rank==2) p[j, i] : tempdist ) { 
			b[0,i] = -b[0,i];
		}

		dmxpy(n, b, n, lda, x, a);
		resid = 0.0;
		normx = 0.0;
        for (point (:rank==2) p[j, i] : tempdist ) { 
			resid = (resid > myabs(b[0,i])) ? resid : myabs(b[0,i]);
			normx = (normx > myabs(x[0,i])) ? normx : myabs(x[0,i]);
		}

		eps =  epslon((double)1.0);
		residn = resid / (n*norma*normx*eps);

		if (residn > ref[setSize]) {
			System.out.println("Validation failed");
			System.out.println("Computed Norm Res = " + residn);
			System.out.println("Reference Norm Res = " + ref[setSize]);
            throw new RuntimeException("Validation failed");
		}
	}

	public void JGFtidyup() {
		// Make sure large arrays are gc'd.

		/* CMD
		* this causes problems in X10, and strictly spreaking, is
		* unnecessary

		a = null;
		b = null;
		x = null;
		ipvt = null;
		System.gc();
		*/
	}

	public void run() {
		//JGFInstrumentor.addTimer("Section2:LUFact:Kernel", "Mflops", setSize);

		//JGFsetsize(setSize);
		JGFsetsize(0);

		JGFinitialise();
		JGFkernel();
		JGFvalidate();
		JGFtidyup();

		//JGFInstrumentor.addOpsToTimer("Section2:LUFact:Kernel", ops/1.0e06);
		//JGFInstrumentor.printTimer("Section2:LUFact:Kernel");
	}

    
    private double [:rank==2] a;
    private double [:rank==2] b;
    private double [:rank==2] x;
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
    private int [:rank==1] ipvt;

    private  double read(final double[:rank==2] a, 
		      final int i, 
		      final int j) {
	    //return future (a.distribution.get(i,j)) { a[i,j] }.force();

        final place curr_place = here; 
        final region(:rank==1) tempr = [0:0];
        final dist (:rank==1) tempvd =  tempr->here; 
        final double [:rank==1]  tempref = new double[tempvd] (point(:rank==1) p0) { 
                return 0.0;
        };


        finish async (a.distribution.get(i,j))
        {
            final double temp = a[i,j];
            async ( curr_place ) 
            {
                tempref[0] = temp;
            }
        }
        return tempref[0];
    }
    private void write(final double[:rank==2] a, 
		     final int i, 
		     final int j, 
		     final double val) {
	//async (a.distribution.get(i,j)) atomic a[i,j] = val;
	    async (a.distribution.get(i,j)) { 
            a[i,j] = val;
        }
    }

    private void plusWrite(final double [:rank==2] a, 
			 final int i, 
			 final int j, 
			 final double val) {
	//async (a.distribution.get(i,j)) atomic a[i,j] += val;
	async (a.distribution.get(i,j)) { 
        a[i,j] += val;
    }

    }

    /* This function is never used so commenting it 
    private void plusWrite(final double[:rank==2] a, 
			 final int i, 
			 final double val) {
	async (a.distribution.get(i)) atomic a[i] += val;
    }
    */

    /*
    private void timesWrite(final double[:rank==2] a, 
			  final int i, 
			  final int j, 
			  final double val) {
	//async (a.distribution.get(i,j)) atomic a[i,j] *= val;
	async (a.distribution.get(i,j)) {
        a[i,j] *= val;
    }

    }
    private void timesWrite(final double[:rank==2] a, 
			  final int i, 
			  final double val) {
	//async (a.distribution.get(i)) atomic a[i] *= val;
	async (a.distribution.get(i)) {
        a[i] *= val;
    }

    }
    */

    private double myabs(double d) {
	    return (d >= 0) ? d : -d;
    }

    private double matgen(final double[:rank==2] a, 
			final int lda, 
			final int n, 
			final double[:rank==2] b)
    {
        int init = 1325;
        double norma = 0.0;
        /* Next two for() statements switched.  Solver wants
           matrix in column order. --dmd 3/3/97
        */
        for (point(:rank==2) [i,j] : a) {
            init = 3125*init % 65536;
            double val = (init - 32768.0)/16384.0;
            finish  { 
                write(a, i, j, val);
            }
            norma = val > norma ? val : norma;
        }
        finish ateach (point(:rank==2) [i,j] : b) { 
            b[i,j] = 0.0;
        }
        // finish ateach (point(:rank==2) [i,j] : a.distribution | [0:n-1,0:n-1]) {
        //     plusWrite(b, 0, j, a[i,j]);
        // }
        finish for (point(:rank==2) [i,j] : [0:n-1,0:n-1]) {
          async(a.distribution.get(i,j)) {
               plusWrite(b, 0, j, a[i,j]);
          }
        }                 
        return norma;
    }

    private int infodgefa;
    /**
       dgefa factors a double precision matrix by gaussian elimination.

       dgefa is usually called by dgeco, but it can be called
       directly with a saving in time if  rcond  is not needed.
       (time for dgeco) = (1 + 9/n)*(time for dgefa) .

       on entry

       a       double precision[n,lda]
       the matrix to be factored.

       lda     integer
       the leading dimension of the array  a .

       n       integer
       the order of the matrix  a .

       on return

       a       an upper triangular matrix and the multipliers
       which were used to obtain it.
       the factorization can be written  a = l*u  where
       l  is a product of permutation and unit lower
       triangular matrices and  u  is upper triangular.

       ipvt    integer[n]
       an integer vector of pivot indices.

       info    integer
       = 0  normal value.
       = k  if  u[k,k] .eq. 0.0 .  this is not an error
       condition for this subroutine, but it does
       indicate that dgesl or dgedi will divide by zero
       if called.  use  rcond  in dgeco for a reliable
       indication of singularity.

       linpack. this version dated 08/14/78.
       cleve moler, university of new mexico, argonne national lab.

       functions

       blas daxpy, dscal, idamax
    */
    private int dgefa(final double[:rank==2] a, 
		    final int lda, 
		    final int n, 
		    final int [:rank==1] ipvt) {
	// gaussian elimination with partial pivoting
        infodgefa = 0;
        final int nm1 = n - 1;
        if (nm1 >=  0) {
            // array is distributed along each column,
            
            region (:rank==1) tempr = [0:nm1-1]; 
            dist (:rank==1) temprDist = tempr->here; 

            for (point(:rank==1) [k] : temprDist) {

                final int l = idamax(n - k, a, k, k, 1) + k;
                ipvt[k] = l; // must be distributed same way as a
                finish async(a.distribution.get(k,1)) { // do this on row k
                    final int kp1 = k+1;
                    // would be nice to do this via an X10 reduction on a sub-array
                    // zero pivot implies this column already triangularized
                    if (a[k, l] != 0) {
                        if (l != k) {
                            //    interchange if necessary
                            if (l != k) {
                            double t = a[k,l];
                            a[k,l] = a[k,k];
                            a[k,k] = t;
                            }
                        }
                        // compute multipliers
                        final double tx = -1.0/a[k,k];

                        dscal(n-(kp1), tx, a, k, kp1, 1);

                        // row elimination with column indexing
                        // daxpy on all columns to the right in parallel
                        finish {
                            region (:rank==1) temprkp1 = [kp1:n-1]; 
                            dist (:rank==1) temprkp1Dist = temprkp1->here; 
                            for (point(:rank==1) [j] : temprkp1Dist) {
                            async(a.distribution.get(j,l)) {
                                double t = a[j,l];
                                if (l != k) {
                                a[j,l] = a[j,k];
                                a[j,k] = t;
                                }
                                daxpy(n-(kp1), t, a, k, kp1, 1, a, j, kp1, 1);
                            }
                            }
                        }
                    } 
                    else {
                        infodgefa = k;
                    }
                }
            }
        }

        ipvt[n-1] = n-1;
        double val = read(a, n-1, n-1);
        if (val == 0) {
            info = n-1;
        }
        return infodgefa;
    }

    /**
       dgesl solves the double precision system
       a * x = b  or  trans(a) * x = b
       using the factors computed by dgeco or dgefa.

       on entry

       a       double precision[n,lda]
       the output from dgeco or dgefa.

       lda     integer
       the leading dimension of the array  a .

       n       integer
       the order of the matrix  a .

       ipvt    integer[n]
       the pivot vector from dgeco or dgefa.

       b       double precision[n]
       the right hand side vector.

       job     integer
       = 0         to solve  a*x = b ,
       = nonzero   to solve  trans(a)*x = b  where
       trans(a)  is the transpose.

       on return

       b       the solution vector  x .

       error condition

       a division by zero will occur if the input factor contains a
       zero on the diagonal.  technically this indicates singularity
       but it is often caused by improper arguments or improper
       setting of lda .  it will not occur if the subroutines are
       called correctly and if dgeco has set rcond .gt. 0.0
       or dgefa has set info .eq. 0 .

       to compute  inverse(a) * c  where  c  is a matrix
       with  p  columns
       dgeco(a, lda, n, ipvt, rcond, z)
       if (!rcond is too small) {
       for (j = 0, j < p, j++)
       dgesl(a, lda, n, ipvt, c[j,0], 0);
       }

       linpack. this version dated 08/14/78 .
       cleve moler, university of new mexico, argonne national lab.

       functions

       blas daxpy, ddot
    */
    private void dgesl(final double[:rank==2] a, 
		     final int lda,
		     final int n, 
		     final int [:rank==1] ipvt, 
		     final double[:rank==2] b, 
		     final int job) {
	final int nm1 = n - 1;
	if (job == 0) {
	    // job = 0 , solve  a * x = b.  first solve  l*y = b
	    if (nm1 >= 1) {
        region (:rank==1) tempr = [0:nm1-1]; 
        dist (:rank==1) temprDist = tempr->here; 
		for (point(:rank==1) [k] : temprDist) {
		    final int l = ipvt[k];
		    double t = b[0,l];
		    if (l != k) {
			b[0,l] = b[0,k];
			b[0,k] = t;
		    }
		    final int kp1 = k + 1;
		    daxpy(n-(kp1), t, a, k, kp1, 1, b, 0, kp1, 1); // FIXME: subarrays
		}
	    }

	    // now solve  u*x = y
        region (:rank==1) tempr = [0:n-1]; 
        dist (:rank==1) temprDist = tempr->here; 
	    for (point(:rank==1) [kb] : temprDist) {
		final int k = n - (kb + 1);
		b[0,k] /= read(a, k, k);
		double t = -b[0,k];
		daxpy(k, t, a, k, 0, 1, b, 0, 0, 1); // FIXME: subarrays
	    }
	} else {
	    // job = nonzero, solve  trans(a) * x = n.  first solve  trans(u)*y = b
        region (:rank==1) tempr = [0:n-1]; 
        dist (:rank==1) temprDist = tempr->here; 
	    for (point(:rank==1) [k] : temprDist) {
		double t = ddot(k, a, k, 0, 1, b, 0, 0, 1); // FIXME: subarrays not yet supported
		b[0,k] = (b[0,k] - t) / a[k,k];
	    }

	    // now solve trans(l)*x = y
	    if (nm1 >= 1) {
        region (:rank==1) temprnm1 = [1:nm1-1]; 
        dist (:rank==1) temprnm1Dist = temprnm1->here; 
		for (point(:rank==1) [kb] : temprnm1Dist) {
		    final int k = n - (kb+1);
		    final int kp1 = k + 1;
		    b[0,k] += ddot(n-(kp1), a, k, kp1, 1, b, 0, kp1, 1); //FIXME: subarrays not yet supported
		    final int l = ipvt[k];
		    if (l != k) {
			double t = b[0,l];
			b[0,l] = b[0,k];
			b[0,k] = t;
		    }
		}
	    }
	}
    }

    /**
       constant times a vector plus a vector.
       jack dongarra, linpack, 3/11/78.
    */
    private void daxpy(int n, 
		     double da, 
		     final double[:rank==2] dx, 
		     final int dxCol, 
		     final int dx_off, 
		     int incx,
		     double[:rank==2] dy, 
		     int dyCol, 
		     int dy_off, 
		     int incy) {
	if ((n > 0) && (da != 0)) {
	    if (incx != 1 || incy != 1) {
		// code for unequal increments or equal increments not equal to 1
		int ix = 0;
		int iy = 0;
		if (incx < 0) ix = (-n+1)*incx;
		if (incy < 0) iy = (-n+1)*incy;
        region (:rank==1) tempr = [0:n-1]; 
        dist (:rank==1) temprDist = tempr->here; 
		for (point (:rank==1) [i] : temprDist) {
		    // daxpy is called at dy.distribution.get[dyCol,xx]
		    dy[dyCol,iy+dy_off] += da * read(dx, dxCol, ix+dx_off);
		    ix += incx;
		    iy += incy;
		}
		return;
	    }
	    // code for both increments equal to 1
        region (:rank==1) tempr = [0:n-1]; 
        dist (:rank==1) temprDist = tempr->here; 
	    for (point (:rank==1) [i] : temprDist)
		dy[dyCol,i+dy_off] += da*read(dx, dxCol, i+dx_off);
	}
    }

    /**
       forms the dot product of two vectors.
       jack dongarra, linpack, 3/11/78.
    */
    private  double ddot(final int n, 
		      final double[:rank==2] dx, 
		      final int dxCol, 
		      final int dx_off, 
		      final int incx,
		      final double[:rank==2] dy, 
		      final int dyCol, 
		      final int dy_off, 
		      final int incy) {
	double dtemp = 0;
	if (n > 0) {
	    if (incx != 1 || incy != 1) {
		// code for unequal increments or equal increments not equal to 1
		int ix = 0;
		int iy = 0;
		if (incx < 0) ix = (-n+1)*incx;
		if (incy < 0) iy = (-n+1)*incy;
        region (:rank==1) tempr = [0:n-1]; 
        dist (:rank==1) temprDist = tempr->here; 
		for (point(:rank==1) [i]: temprDist) {
		    dtemp += dx[dxCol,ix+dx_off]*dy[dyCol,iy+dy_off];
		    ix += incx;
		    iy += incy;
		}
	    } else {
		// code for both increments equal to 1
        region (:rank==1) tempr = [0:n-1]; 
        dist (:rank==1) temprDist = tempr->here; 
		for (point (:rank==1) [i]: temprDist)
		    dtemp += dx[dxCol,i+dx_off]*dy[dyCol,i+dy_off];
	    }
	}
	return dtemp;
    }

    /**
       scales a vector by a constant.
       jack dongarra, linpack, 3/11/78.
    */
    private void dscal(int n, double da, double[:rank==2] dx, int currentCol, int dx_off, int incx)
    {
	if (n > 0) {
	    if (incx != 1) {
            // code for increment not equal to 1
            final int nincx = n*incx;
            //for (int i = 0; i < nincx; i += incx)
            //    dx[currentCol,i+dx_off] *= da;
            int i = 0;
            while (i < nincx)   
            {
                dx[currentCol,i+dx_off] *= da;
                i += incx;
            }
	    } else {
		// code for increment equal to 1
            region (:rank==1) tempr = [0:n-1]; 
            dist (:rank==1) temprDist = tempr->here; 
            for (point (:rank==1) [i] : temprDist)
                dx[currentCol,i+dx_off] *= da;
            }
        }
    }

    /**
       finds the index of element having max. myabsolute value.
       jack dongarra, linpack, 3/11/78.

       In X10: dx is now a 2 dimensional array (currently don't support
       sub-sections) so must explicitly address only first element
    */
    private int idamax(final int n, 
		     final double[:rank==2] dx, 
		     final int dxk, 
		     final int dx_off, 
		     final int incx)
    {
	if (n < 1) return -1;
	if (n == 1) return 0;
	if (incx != 1) {
	    // code for increment not equal to 1
	    int itemp = 0;
	    double dmax = myabs(read(dx, dxk, 0+dx_off));
	    int ix = 1 + incx;
	    for (point(:rank==1) [i] : [1:n-1]) {
		double dtemp = myabs(read(dx, dxk, ix+dx_off));
		if (dtemp > dmax)  {
		    itemp = i;
		    dmax = dtemp;
		}
		ix += incx;
	    }
	    return itemp;
	}
	// code for increment equal to 1
	int itemp = 0;
	double dmax = myabs(read(dx, dxk, 0+dx_off));
	for (point(:rank==1) [i] : [1:n-1]) {
	    double dtemp = myabs(read(dx, dxk, i+dx_off));
	    if (dtemp > dmax) {
		itemp = i;
		dmax = dtemp;
	    }
	}
	return itemp;
    }

    /**
       estimate unit roundoff in quantities of size x.

       this program should function properly on all systems
       satisfying the following two assumptions,
       1.  the base used in representing dfloating point
       numbers is not a power of three.
       2.  the quantity  a  in statement 10 is represented to
       the accuracy used in dfloating point variables
       that are stored in memory.
       the statement number 10 and the go to 10 are intended to
       force optimizing compilers to generate code satisfying
       assumption 2.
       under these assumptions, it should be true that,
       a  is not exactly equal to four-thirds,
       b  has a zero for its last bit or digit,
       c  is not exactly equal to one,
       eps  measures the separation of 1.0 from
       the next larger dfloating point number.
       the developers of eispack would appreciate being informed
       about any systems where these assumptions do not hold.

       *****************************************************************
       this routine is one of the auxiliary routines used by eispack iii
       to avoid machine dependencies.
       *****************************************************************

       this version dated 4/6/83.
    */
    private double epslon (final double x) {
	final double a = 4.0e0/3.0e0;
	double eps = 0;
	while (eps == 0) {
	    double b = a - 1.0;
	    double c = b + b + b;
	    eps = myabs(c-1.0);
	}
	return (eps*myabs(x));
    }

    /**
       Function purpose:
       multiply matrix m times vector x and add the result to vector y.

       Function parameters:

       n1 integer, number of elements in vector y, and number of rows in
       matrix m

       y double [n1], vector of length n1 to which is added
       the product m*x

       n2 integer, number of elements in vector x, and number of columns
       in matrix m

       ldm integer, leading dimension of array m

       x double [n2], vector of length n2

       m double [ldm,n2], matrix of n1 rows and n2 columns
    */
    private void dmxpy (final int n1, 
		      final double[:rank==2] y, 
		      final int n2, 
		      final int ldm, 
		      final double[:rank==2] x, 
		      final double[:rank==2] m) {
	// cleanup odd vector
	for (point (:rank==2) [j,i] : [0:n2-1,0:n1-1])
	    y[0,i] += x[0,j]*read(m, j, i);
    }
}

