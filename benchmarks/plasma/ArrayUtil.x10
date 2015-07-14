/**
 *  A series of methods used in array manipulation for the particle simulation
 *  application.  Note that these methods usually use block star distributions 
 *  as their input distributions.  Additional, all regions are assumed to 
 *  be zero based.
 */
public class ArrayUtil {
    /**
     *  Converts a double array into a complex array of a similar distribution.
     *  It takes two adjacent double values in the last dimension and produces
     *  a complex value from those results.  The resultant array thus has its
     *  final dimension as half the source dimension's size.
     */
    public static
	Complex[:rank==2] doubleToComplex(final double[:rank==2] src) {
	//System.out.println("Double to complex");


	final region(:rank==2) rSrc = src.region;
	final region(:rank==1) rS2 = X10Util.getRank2D(rSrc, 1);

	if (rS2.size() % 2 != 0) {
	    System.err.println("Error: doubleToComplex requires the second " + 
			       "dimension to be of even size");
	    final dist(:rank==2) dResult = 
		(dist(:rank==2)) (region.factory.emptyRegion(2)->here);
	    return new Complex[dResult];
	}
	final region(:rank==1) rD2 = [0 : rS2.size() / 2 - 1]; 
	final dist(:rank==2) dSrc = src.distribution;
	//System.out.println(X10Util.get2DDistRank(dSrc, 0));
	//System.out.println(rS2);
	final dist(:rank==2) dResult = 
	    X10Util.extendDistRank2D(X10Util.get2DDistRank(dSrc, 0), rD2);
	final Complex[:rank==2] result = new Complex[dResult];

	finish ateach (point(:rank==2) pt: dResult) {
	    result[pt] = new Complex(src[pt * [1,2]], src[pt * [1,2] + [0,1]]);
	}

	return result;
    }

    /**
     *  Converts a two-dimensional complex array and produces a double
     *  array of a block star distribution except the second dimension is 
     *  doubled in size.
     */
    public static  
	double[:rank==2] complexToDouble(final Complex[:rank==2] src) {

	final region(:rank==2) rSrc = src.region;
	final region(:rank==1) rS2 = X10Util.getRank2D(rSrc, 1);
	final region(:rank==1) rD2 = [0 : 2*rS2.size() - 1];
	final dist(:rank==2) dSrc = src.distribution;
	final dist(:rank==2) dResult = 
	    X10Util.extendDistRank2D(X10Util.get2DDistRank(dSrc, 0), rD2);

	final double[:rank==2] result = new double[dResult];
	
	finish ateach (point(:rank==2) pt: dResult) {
            final point(:rank==2) ptd2 = pt / [1,2];
	    if (pt[1] % 2 == 0) {
		result[pt] = src[ptd2].getReal(); 
	    } else {
		result[pt] = src[ptd2].getImag();
	    }
	}
	
	return result;
    }

    /**
     *  Takes a two-dimensional block star distributed double array and 
     *  creates a two-dimensional block star array where each dimension is
     *  twice the size.  The newly created array cells are initialized to 
     *  zero.  
     */
//     public static 
// 	double[:rank==2] doubleArrayDimensions(final double[:rank==2] src) {

// 	final region(:rank==2) rS = src.region;
// 	final region(:rank==1) rS1 = X10Util.getRank2D(rS, 0);
// 	final region(:rank==1) rS2 = X10Util.getRank2D(rS, 1);
// 	final region(:rank==1) rD1 = [0 : 2*rS1.size() - 1];
// 	final region(:rank==1) rD2 = [0 : 2*rS2.size() - 1];

// 	final dist(:rank==2) dResult = 
// 	    X10Util.extendDistRank2D((dist(:rank==1)) dist.factory.block(rD1), 
// 				     rD2);
// 	final double[:rank==2] result = 
// 	    new double[dResult] (point pt) { return 0.0; };

// 	finish ateach (point [pl] : dist.UNIQUE) {
// 	    final place pDst = place.places(here.id / 2);
// 	    final dist(:rank==2) dSrc = src.distribution;
// 	    final region(:rank==2) rLocal = X10Util.get2DLRegion(dSrc);

// 	    final double value[:rank==2] sBuffer = 
//                 (double value[:rank==2])
// 		new double value[rLocal] (point pt) {
// 		    return src[pt];
// 		};

// 	    async (pDst) {
// 		foreach (point pt : rLocal) {
// 		    result[pt] = sBuffer[pt];
// 		}
// 	    }
// 	}

// 	return result;
//     }

    /**
     *  This method takes an array and reduces each dimension by two plus one.
     *  Due to the usage of guard cells, the plus one index in the first
     *  dimension maps to the use in the guard cells.  Despite the guard
     *  cells applying to each place, only the last place of the guard is
     *  filled as another method will fill the guard cells.
     */
//     public static final
// 	double[:rank==2] halfArrayDimensions(final double[:rank==2] src,
// 					     final double[:rank==2] guard) {

//     }

    /**
     *  Takes an array that has a block star distribution and then transposes
     *  the array.  The new distribution will also be a block star 
     *  distribution.
     */
    public static  
	Complex[:rank==2] transpose(final Complex[:rank==2] data) {
	final dist(:rank==2) dData = (dist(:rank==2)) data.distribution;
	if (!X10Util.isDistBlockStar(dData)) {
	    X10Util.println("Transpose only works on star block" +
			    "distributed arrays");
	    throw new RuntimeException("transpose: " + data.distribution);
	}

	// TODO : Redo transpose dist
	final dist(:rank==2) dResult = X10Util.transposeBlockStar(dData);
	//System.out.println("transpose");
	//System.out.println(dData);
	//System.out.println(dResult);
	final Complex[:rank==2] result = new Complex[dResult];
	finish ateach (point(:rank==1) pl: dist.UNIQUE) {
	    final region(:rank==2) rLocal = X10Util.get2DLRegion(dData);
	    final region(:rank==2) rTtmp = X10Util.transposeRegion(rLocal); 

	    if (rLocal.size() > 0) {
		// Work around for runtime bug
		final region(:rank==1) rTtmp1 = X10Util.getRank2D(rTtmp,0);
		final region(:rank==1) rTtmp2 = X10Util.getRank2D(rTtmp,1);
		final region(:rank==2) rLocalT = 
		    [rTtmp1.low():rTtmp1.high(),rTtmp2.low():rTtmp2.high()];	

		// Break our region into blocks which 
		// get sent to multiple places
		final region(:rank==1) rRSBuffer = (region(:rank==1))dist.UNIQUE.region;
		final region(:rank==2) value[:rank==1] rSBuffer =
		    (region(:rank==2) value[:rank==1])
		    new region(:rank==2) value[rRSBuffer] 
		    (point(:rank==1) p) {
	  	         final region(:rank==2) rTLocal = 
		            (region(:rank==2)) 
			    (dResult | dist.UNIQUE.get(p)).region;
			 return rLocalT && rTLocal;
	            };
	    
		// Fill send buffer, already transposing the data
		final Complex value[:rank==2] sBuffer =
		    (Complex value[:rank==2])
		    new Complex value[rLocalT] (point(:rank==2) [i,j]) {
		        return data[j,i];
	            };

		// Send transposed values to appropriate place
		foreach (point(:rank==1) i: rSBuffer) {
		    ateach (point(:rank==2) pt: rSBuffer[i]->dist.UNIQUE.get(i)) {
			result[pt] = sBuffer[pt];
		    }
		}
	    }
	}
	return result;
    }
}
