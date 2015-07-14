public class Series {


	private int setsize;

	// Declare class data.

	public int array_rows;
	public double [:rank==2] testArray;  // Array of arrays.

	/**
	 * buildTestData.
	 * Instantiate array(s) to hold fourier coefficients.
	 */

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

    public void initRefArray(final double [:rank==2] ref)
    {
           ref[0, 0] = 2.8729524964837996;
           ref[0, 1] = 0.0; 
           ref[1, 0] = 1.1161046676147888;
           ref[1, 1] = -1.8819691893398025;
           ref[2, 0] = 0.34429060398168704;
           ref[2, 1] = -1.1645642623320958;
           ref[3, 0] =  0.15238898702519288;
           ref[3, 1] = -0.8143461113044298;
    }

	public void validate() {

        final region(:rank==2) r = [0:3, 0:1];
        final dist (:rank==2) vd =  r->here; 
	    final double [:rank==2]  ref = new double[vd] (point(:rank==2) p0) { 
            return 0.0; 
        };
                           
        initRefArray(ref);

        for (point (:rank==2) [i, j] : vd)
        {
            final int ii = i;
            final int jj = j;
            double cval = 0 ;

            final place curr_place = here; 

            final region(:rank==1) tempr = [0:0];
            final dist (:rank==1) tempvd =  tempr->here; 
            final double [:rank==1]  tempref = new double[tempvd] (point(:rank==1) p0) { 
                return 0.0;
            };

            final double [:rank==2] tA = testArray;
            finish async (testArray.distribution.get(j, i))
            {
                final double temp = tA[jj, ii];
                async ( curr_place ) 
                {
                    tempref[0] = temp;
                }
            }
            
            cval = tempref[0];
             
            double error = Math.abs(cval - ref[i, j]);
            if (error > 1.0e-12) {
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
		//JGFInstrumentor.addTimer("Section2:Series:Kernel", "coefficients", setsize);
        final region(:rank==1) tempregion = [0:0];
        final dist(:rank==1) tempdist = tempregion->here;
        int j = 10000;
        for (point (:rank==1) i: tempdist) 
        {
            
            setSize(0/*i*/);
            initialise((int)(j*Math.pow(100,0/*i*/)));
            kernel();
            validate();
        }
        tidyup();

		//JGFInstrumentor.addOpsToTimer("Section2:Series:Kernel", (double) (array_rows * 2 - 1));
		//JGFInstrumentor.printTimer("Section2:Series:Kernel");
	}

    public Series()
    {

    }

	public void buildTestData()
	{
		// Allocate appropriate length for the double array of doubles.
		final region (:rank==2) R = [0:1,0:array_rows-1];
        final dist (:rank==2)  d = (dist (:rank==2))dist.factory.block(R);
		testArray = (double [:rank==2])new double [d];
	}

	/**
	 * Do.
	 *
	 * This consists of calculating the
	 * first n pairs of fourier coefficients of the function (x+1)^x on
	 * the interval 0,2. n is given by array_rows, the array setsize.
	 * NOTE: The # of integration steps is fixed at 1000.
	 */
	public void Do()
	{
		// Start the stopwatch.
		// JGFInstrumentor.startTimer("Section2:Series:Kernel");
		// Calculate the fourier series. Begin by calculating A[0].

		testArray[0,0] = TrapezoidIntegrate((double)0.0, // Lower bound.
				(double)2.0,            // Upper bound.
				1000,                    // # of steps.
				(double)0.0,            // No omega*n needed.
				0) / (double)2.0;       // 0 = term A[0].

		// Calculate the fundamental frequency.
		// (2 * pi) / period...and since the period
		// is 2, omega is simply pi.

		final double omega = (double) 3.1415926535897932;
		final dist(:rank==1) U = (dist (:rank==1))dist.UNIQUE;
                final double [:rank==2] tA = testArray;
		finish {
			ateach (point(:rank==1) p: U) {
				int ilow = 0;

				if (U.get(p).isFirst()) {
					ilow = 1;
				} else {
					ilow = 0;
				}
				for (point (:rank==2) pp: tA.distribution| here) {
					if (pp[1] >= ilow) {

						// Calculate A[i] terms. Note, once again, that we
						// can ignore the 2/period term outside the integral
						// since the period is 2 and the term cancels itself
						// out.
						if (pp[0] == 0) {
							tA[pp] = TrapezoidIntegrate((double)0.0,
									(double)2.0,
									1000,
									omega * (double)pp[1],
									1);               // 1 = cosine term.
						} else {
							// Calculate the B[i] terms.

							tA[pp] = TrapezoidIntegrate((double)0.0,
									(double)2.0,
									1000,
									omega * (double)pp[1],
									2);               // 2 = sine term.
						}
					}
				}
			}
		}

		//JGFInstrumentor.stopTimer("Section2:Series:Kernel");
	}

	/**
	 * TrapezoidIntegrate.
	 *
	 * Perform a simple trapezoid integration on the function (x+1)**x.
	 * x0,x1 set the lower and upper bounds of the integration.
	 * nsteps indicates # of trapezoidal sections.
	 * omegan is the fundamental frequency times the series member #.
	 * select = 0 for the A[0] term, 1 for cosine terms, and 2 for
	 * sine terms. Returns the value.
	 */
	private double TrapezoidIntegrate (final double x0,     // Lower bound.
									   final double x1,     // Upper bound.
									   final int a_nsteps,    // # of steps.
									   final double omegan, // omega * n.
									   final int select)    // Term type.
	{
		double x = 0.0;               // Independent variable.
		double dx = 0.0;              // Step setsize.
		double rvalue = 0.0;          // Return value.
 
                int nsteps = a_nsteps;

		// Initialize independent variable.

		x = x0;

		// Calculate stepsetsize.

		dx = (x1 - x0) / (double)nsteps;

		// Initialize the return value.

		rvalue = thefunction(x0, omegan, select) / (double)2.0;

		// Compute the other terms of the integral.

		if (nsteps != 1)
		{
			nsteps--;               // Already done 1 step.
			nsteps--;               
			while (nsteps > 0)
			{
				x = x + dx;
				rvalue = rvalue + thefunction(x, omegan, select);
                                nsteps--;
			}
		}

		// Finish computation.

		rvalue = (rvalue + thefunction(x1, omegan, select) / (double)2.0) * dx;
		return (rvalue);
	}

	/**
	 * thefunction.
	 *
	 * This routine selects the function to be used in the Trapezoid
	 * integration. x is the independent variable, omegan is omega * n,
	 * and select chooses which of the sine/cosine functions
	 * are used. Note the special case for select = 0.
	 */
	private double thefunction(final double x,      // Independent variable.
							   final double omegan, // Omega * term.
							   final int select)    // Choose type.
	{
		// Use select to pick which function we call.

		switch (select)
		{
			case 0: return (Math.pow(x+(double)1.0, x));
			case 1: return (Math.pow(x+(double)1.0, x) * Math.cos(omegan*x));
			case 2: return (Math.pow(x+(double)1.0, x) * Math.sin(omegan*x));
		}

		// We should never reach this point, but the following
		// keeps compilers from issuing a warning message.

		return (0.0);
	}

	/**
	 * freeTestData
	 *
	 * Nulls array that is created with every run and forces garbage
	 * collection to free up memory.
	 */
	public void freeTestData()
	{
        //testArray = null;
		//testArray = (double [:rank==2])null;    // Destroy the array.
        //final region(:rank==2) r1 = [0:3, 0:1];
        //final dist (:rank==2) vd1 =  r1->here; 
        //testArray = new double [vd1] (point (:rank==2) p) {
        //    return 0.0;
        //};
		//System.gc();         // Force garbage collection.
	}
}

