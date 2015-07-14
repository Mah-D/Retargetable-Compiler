/**
 *  A collection of commonly used methods involving x10 arrays, regions, and
 *  distributions.  These are various functions that I found useful in the 
 *  translation process don't go together or are fairly generic to begin with.
 *  While I would have liked to keep this file to be largely miscellaneous
 *  functionality and largely pertain to x10 in general, the transpose
 *  function is specific to the fortran code, namely the fast fourier 
 *  transformation code.  However, it does not make sense to place the 
 *  transpose method in the FFT class.  
 */
public class X10Util {
    /**
     *  Flag to enable diagnostic printing.
     */
    public static final boolean DEBUG = true;

    /**
     *  Enables various diagnostic checks.
     */
    public static final boolean ENABLE_CHECKS = true;

    /**
     *  Amount of error tolerance for equality comparisons.  Two double values
     *  are considered equals if the delta is less than the specified value.
     */
    public static final double ERROR = 1.0e-13;

    /**
     *
     */
    public static double maxDouble(final double d1, final double d2) {
	return (d1 >= d2) ? d1 : d2;
    }

    public static double minDouble(final double d1, final double d2) {
	return (d1 >= d2) ? d2 : d1;
    }

    public static int maxInt(final int i1, final int i2) {
	return (i1 >= i2) ? i1 : i2;
    }

    public static int minInt(final int i1, final int i2) {
	return (i1 >= i2) ? i2 : i1;
    }

    /**
     *  The following methods take an existing 1D, 2D, or 3D regions and 
     *  prepends a 1D region.  For example, if we prepend [0:x] with [0:y,0:z],
     *  then the resulting region is [0:x,0:y,0:z].
     */
    public static  
	region(:rank==2) prependRegionRank2D(final region(:rank==1) r1,
					     final region(:rank==1) r2) {
	return extendRegionRank2D(r1,r2);
    }
    
    public static  
	region(:rank==3) prependRegionRank3D(final region(:rank==1) r1,
					     final region(:rank==2) r2) {
	return [r1,getRank2D(r2,0),getRank2D(r2,1)];
    }

//     public static  
// 	region(:rank==4) prependRank4D(final region(:rank==1) r1,
// 				       final region(:rank==3) r2) {
// 	return [r1, getRank(r2,0), getRank(r2,1), getRank(r2,2)];
//     }

    /**
     *  The following methods are take an existing 1D, 2D, or 3D region
     *  and add another dimension.  For example if we extend [0:x,0:y] with
     *  [0:z], then the resulting region is [0:x,0:y,0:z].
     */
    public static  
	region(:rank==2) extendRegionRank2D(final region(:rank==1) r1,
					    final region(:rank==1) r2) {
	return [r1, r2];
    }

    public static  
	region(:rank==3) extendRegionRank3D(final region(:rank==2) r1,
					    final region(:rank==1) r2) {
	return [getRank2D(r1,0), getRank2D(r1,1), r2];
    }

//     public static  
// 	region(:rank==4) extendRank4D(final region(:rank==3) r1,
// 				      final region(:rank==1) r2) { 
// 	return [getRank(r1,0), getRank(r1,1), getRank(r1,2), r2];
//     }

    /**
     *  Takes an existing distribution and adds an extra dimension to it.
     *  If we take the regions mapped to each place, it is equivalent to 
     *  prepending the new region to the each of the seperate regions, while
     *  retaining their original place mapping.  For example if [0:y]->p1 and
     *  [0:z]->p2 is our distribution, then prepending it with [0:x] will 
     *  result in the distribution [0:x,0:y]->p1 and [0:x,0:z]->p2.
     */
    public static  
	dist(:rank==2) prependDistRank2D(final region(:rank==1) r1,
					 final dist(:rank==1) d2) {
	dist(:rank==2) dResult = 
	    (dist(:rank==2)) (region.factory.emptyRegion(2)->here);
	for (point(:rank==1) pl: dist.UNIQUE) {
	    final place p = dist.UNIQUE.get(pl);
	    final region(:rank==1) rLocal = 
		(region(:rank==1)) (d2 | p).region;
	    dResult = dResult || (prependRegionRank2D(r1,rLocal)->p);
	}
	return dResult;
    }

    public static  
	dist(:rank==3) prependDistRank3D(final region(:rank==1) r1, 
					 final dist(:rank==2) d2) {
	dist(:rank==3) dResult = 
	    (dist(:rank==3)) (region.factory.emptyRegion(3)->here);
	for (point(:rank==1) pl: dist.UNIQUE) {
	    final place p = dist.UNIQUE.get(pl);
	    final region(:rank==2) rLocal = 
		(region(:rank==2)) (d2 | p).region;
	    dResult = dResult || (prependRegionRank3D(r1,rLocal)->p);
	}
	return dResult;
    }

//     public static  
// 	dist(:rank==4) extendRank4D(final region(:rank==1) r1,
// 				    final dist(:rank==3) d2) {
// 	dist(:rank==4) dResult = 
// 	    (dist(:rank==4)) (region.factory.emptyRegion(4)->here);
// 	for (point [pl] : [0 : place.MAX_PLACES - 1]) {
// 	    final place p = place.places(pl);
// 	    final region(:rank==3) rLocal = 
// 		(region(:rank==3)) (d2 | p).region;
// 	    dResult = dResult || (prependRank4D(r1,rLocal)->p);
// 	}
// 	return dResult;
//     }

    
    /**
     *  Takes an existing distribution and adds an extra dimension to it.
     *  If we take the regions mapped to each place, it is equivalent to 
     *  prepending the new region to the each of the seperate regions, while
     *  retaining their original place mapping.  For example if [0:x]->p1 and
     *  [0:y]->p2 is our distribution, then extending it with [0:z] will 
     *  result in the distribution [0:x,0:z]->p1 and [0:y,0:z]->p2.
     */
    public static  
	dist(:rank==2) extendDistRank2D(final dist(:rank==1) d1,
					final region(:rank==1) r2) {
	dist(:rank==2) dResult = 
	    (dist(:rank==2)) (region.factory.emptyRegion(2)->here);
	for (point(:rank==1) pl: dist.UNIQUE) {
	    final place p = dist.UNIQUE.get(pl);
	    final region(:rank==1) rLocal = 
		(region(:rank==1)) (d1 | p).region;
	    dResult = dResult || (extendRegionRank2D(rLocal,r2)->p);
	}
	return dResult;
    }

    public static  
	dist(:rank==3) extendDistRank3D(final dist(:rank==2) d1,
					final region(:rank==1) r2) {
	dist(:rank==3) dResult = 
	    (dist(:rank==3)) (region.factory.emptyRegion(3)->here);
	for (point(:rank==1) pl: dist.UNIQUE) {
	    final place p = dist.UNIQUE.get(pl);
	    final region(:rank==2) rLocal = 
		(region(:rank==2)) (d1 | p).region;
	    dResult = dResult || (extendRegionRank3D(rLocal,r2)->p);
	}
	return dResult;
    }

//     public static  
// 	dist(:rank==4) extendRank4D(final dist(:rank==3) d1,
// 				    final region(:rank==1) r2) {
// 	dist(:rank==4) dResult = 
// 	    (dist(:rank==4)) (region.factory.emptyRegion(4)->here);
// 	for (point [pl] : [0 : place.MAX_PLACES - 1]) {
// 	    final place p = place.places(pl);
// 	    final region(:rank==3) rLocal = 
// 		(region(:rank==3)) (d1 | p).region;
// 	    dResult = dResult || (extendRank4D(rLocal,r2)->p);
// 	}
// 	return dResult;
//     }

    /**
     *  Redoing block distribution to fit in line with the original fortran
     *  code.  Whereas if the region doesn't divide evenly, the excess points
     *  get distributed on the first places, this should put all the excess
     *  on the last place.
     */
    public static dist(:rank==1) distBlock(final region(:rank==1) r) {
	if (r.low() != 0) {
	    throw new RuntimeException("distBlock only applies to rails");
	}
	if (r.high() != r.size() - 1) {
	    throw new RuntimeException("distblock only applies to rails");
	}
	
	int blockSize = r.size() / place.MAX_PLACES;

	dist(:rank==1) dResult = 
	    (dist(:rank==1)) (region.factory.emptyRegion(1)->here);
	for (point(:rank==1) pl: dist.UNIQUE) {
	    final place p = dist.UNIQUE.get(pl);
	    dist(:rank==1) ext = 
		(dist(:rank==1)) ([pl[0]*blockSize : ((pl[0]+1)*blockSize) - 1]->p);
	    dResult = dResult || ext;
	}
	
	int diff = r.size() - blockSize * place.MAX_PLACES;
	if (blockSize * place.MAX_PLACES != r.size()) {
	    // place l = place.LAST_PLACE;
	    place l = place.places(place.MAX_PLACES-1);
	    dist(:rank==1) ext = 
		(dist(:rank==1)) ([r.size() - diff : r.size() - 1]->l);
	    dResult = dResult || ext;
	}
// 	System.out.println("distBlock");
// 	System.out.println(dResult);
// 	System.out.println(r);
	return dResult;
    }
    

    /**
     *  Takes a two dimensional region and block distributes it in the first
     *  dimension.  For all x, all points [x,y] map to the same place, for all
     *  y.
     */
    public static dist(:rank==2) distBlockStar1(final region(:rank==2) r) {
	final region(:rank==1) r1 = getRank2D(r,0);
	//final dist(:rank==1) d1 = (dist(:rank==1)) dist.factory.block(r1);
	final dist(:rank==1) d1 = distBlock(r1);
	return extendDistRank2D(d1, getRank2D(r,1));
    }

    public static  
	dist(:rank==2) distBlockStar2(final region(:rank==1) r1,
				      final region(:rank==1) r2) {
	return distBlockStar1([r1,r2]);
    }

    /**
     *  Takes a two dimensional region and block distributes it in the second
     *  dimension.  For all y, all points [x,y] map to the same place, for all
     *  x.
     */
    public static dist(:rank==2) distStarBlock1(final region(:rank==2) r) {
	final region(:rank==1) r2 = getRank2D(r,1);
	//final dist(:rank==1) d2 = 
	//    (dist(:rank==1)) dist.factory.block(getRank2D(r,1));
	final dist(:rank==1) d2 = distBlock(r2);
	return prependDistRank2D(getRank2D(r,0), d2);
    }

    public static 
	dist(:rank==2) distStarBlock2(final region(:rank==1) r1,
				      final region(:rank==1) r2) {
	return distStarBlock1([r1,r2]);
    }

    /**
     *  Checks to see if a given distribution is block distributed in only the 
     *  first dimension. 
     */
    public static boolean isDistBlockStar(final dist(:rank==2) d) {
	if (ENABLE_CHECKS) {
            final region(:rank==2) rd = d.region;
	    final region(:rank==1) r1 = getRank2D(rd, 0);
	    final region(:rank==1) r2 = getRank2D(rd, 1);
	    final dist(:rank==1) dRef = 
		(dist(:rank==1)) dist.factory.block(r1);
	    
	    for (point(:rank==1) pl: dist.UNIQUE) {
	        final place p = dist.UNIQUE.get(pl);
		final region(:rank==2) rLocal = 
		    (region(:rank==2)) (d | p).region;
		final region(:rank==1) rRefLocal = 
		    (region(:rank==1)) (dRef | p).region;
		
		if (!(getRank2D(rLocal,0).equals(rRefLocal))) {
		    return false;
		} else if (!(getRank2D(rLocal,1).equals(r2))) {
		    if (rRefLocal.size() > 0) {
			return false;
		    }	       
		}
	    }
	}
	return true;	
    }

    /**
     *  Checks to see if a given distribution is block distributed in only the 
     *  second dimension. 
     */
    public static boolean isDistStarBlock(final dist(:rank==2) d) {
	if (ENABLE_CHECKS) {
            final region(:rank==2) rd = d.region;
	    final region(:rank==1) r1 = getRank2D(rd, 0);
	    final region(:rank==1) r2 = getRank2D(rd, 1);
	    final dist(:rank==1) dRef = 
		(dist(:rank==1)) dist.factory.block(r2);
	    
	    for (point(:rank==1) pl: dist.UNIQUE) {
	        final place p = dist.UNIQUE.get(pl);
		final region(:rank==2) rLocal = 
		    (region(:rank==2)) (d | p).region;
		final region(:rank==1) rRefLocal = 
		    (region(:rank==1)) (dRef | p).region;
		
		if (!(getRank2D(rLocal,0).equals(r1) && 
		      getRank2D(rLocal,1).equals(rRefLocal))) {
		    return false;
		}
	    }
	}
	return true;
    }

    /**
     *  For any n-dimensional distribution, it creates a 1D distribution which
     *  consists of the distribution along the nth dimension.  If multiple 
     *  places have the same ordinal in the first dimension, creating a point
     *  which maps to multiple places, then the resultant distribution will
     *  use the first place that maps to that point.
     */
    public static dist(:rank==1) get2DDistRank(final dist(:rank==2) d, 
					       final int n) {
	if (n > 2 || n < 0) {
	    throw new RuntimeException("Rank must within bounds");
	}
	dist(:rank==1) dResult = 
	    (dist(:rank==1)) (region.factory.emptyRegion(1)->here);
	for (point(:rank==1) pl: dist.UNIQUE) {
	    final place p = dist.UNIQUE.get(pl);
	    final region(:rank==2) rLocal = (d | p).region;
	    final region(:rank==1) rLocalN = getRank2D(rLocal, n);
	    
	    dResult = dResult || ((rLocalN - dResult.region)->p);
	}
	return dResult;
    }

    /**
     *  Takes a 2D distribution and swaps the ranks.
     */
    public static region(:rank==2) transposeRegion(final region(:rank==2) r) {
	return [getRank2D(r,1), getRank2D(r,0)];
    }

    /**
     *  Takes a 2D distribution and for each place mapping, transposes the 
     *  region.
     */
    public static dist(:rank==2) transposeDist(final dist(:rank==2) d) {
	//System.out.println("td");
	dist(:rank==2) dResult = 
	    (dist(:rank==2)) (region.factory.emptyRegion(2)->here);
	for (point(:rank==1) pl: dist.UNIQUE) {
	    final place p = dist.UNIQUE.get(pl);
	    final region(:rank==2) rLocal = (region(:rank==2)) (d | p).region;
	    //System.out.println(rLocal);
	    dResult = dResult || (transposeRegion(rLocal)->p);
	}
	return dResult;
    }

    /**
     *  Takes a two-dimensional distribution in the block star format, and
     *  creates a new block star with the associated region transposed.
     *  This is different from the transposeDist method in that the resulting
     *  distribution is star block in the above method.
     */
    public static dist(:rank==2) transposeBlockStar(final dist(:rank==2) d) {
        final region(:rank==2) rd = d.region;
	final region(:rank==1) r1 = getRank2D(rd, 0);
	final region(:rank==1) r2 = getRank2D(rd, 1);
	
	// note: dist.factory.block causes place check error
	return extendDistRank2D(distBlock(r2), r1);
    }

    /**
     *  A series of methods to retrieve a single point from an x10 array,
     *  an returns the value.  If the point is located on a different place,
     *  the data is transfered to the local place.
     */
    public static boolean pullBoolean(final boolean[:rank==1] b, 
				      final point(:rank==1) pt) {
	if (!b.region.contains(pt)) {
	    println("pt must be contained in b.region: " + b.region + " " + pt);
	    throw new RuntimeException("pullBoolean Exception: " + pt);
	} 

	final place pHere = here;
	final dist(:rank==1) dDst = [0:0]->here;
	final boolean[:rank==1] result = new boolean[dDst];
	finish async (b.distribution.get(pt)) {
	    final boolean val = b[pt];
	    async (pHere) {
		result[0] = val;
	    }
	}
	return result[0];
    }

    public static Complex pullComplex(final Complex[:rank==1] c, 
				      final point(:rank==1) pt) {
	if (!c.region.contains(pt)) {
	    println("pt must be contained in c.region: " + c.region + " " + pt);
	    throw new RuntimeException("Complex Exception: " + pt);
	} 

	final place pHere = here;
	final dist(:rank==1) dDst = [0:0]->here;
	final Complex[:rank==1] result = new Complex[dDst];
	finish async (c.distribution.get(pt)) {
	    final Complex val = c[pt];
	    async (pHere) {
		result[0] = val;
	    }
	}
	return result[0];
    }

    public static int pullInt(final int[:rank==1] i, final point(:rank==1) pt) {
	if (!i.region.contains(pt)) {
	    println("pt must be contained in i.region: " + i.region + " " + pt);
	    throw new RuntimeException("pullDouble Exception: " + pt);
	} 

	final place pHere = here;
	final dist(:rank==1) dDst = [0:0]->here;
	final int[:rank==1] result = new int[dDst];
	finish async (i.distribution.get(pt)) {
	    final int val = i[pt];
	    async (pHere) {
		result[0] = val;
	    }
	}
	return result[0];
    } 

    public static double pullDouble(final double[:rank==1] d, 
				    final point(:rank==1) pt) {
	if (!d.region.contains(pt)) {
	    println("pt must be contained in d.region: " + d.region + " " + pt);
	    throw new RuntimeException("pullDouble Exception: " + pt);
	} 

	final place pHere = here;
	final dist(:rank==1) dDst = [0:0]->here;
	final double[:rank==1] result = new double[dDst];
	finish async (d.distribution.get(pt)) {
	    final double val = d[pt];
	    async (pHere) {
		result[0] = val;
	    }
	}
	return result[0];
    } 

    /**
     *  Wrapper for the region rank method.  To eliminate some of the 
     *  dependent type casts coming from the rank method.  Eventually, when
     *  the a real dependent type checker implementation works, this method
     *  should be deprecated.
     */
    public static region(:rank==1) getRank2D(final region(:rank==2) r, 
					     final int n) {
	return (region(:rank==1)) r.rank(n);
    }

    public static region(:rank==1) getRank3D(final region(:rank==3) r, 
					     final int n) {
	return (region(:rank==1)) r.rank(n);
    }

    /**
     *  Restricts the distribution to here and returns the nth rank.
     */
    public static region(:rank==1) getLRank2D(final dist(:rank==2) d, 
					      final int n) {
	return getPRank2D(d, here, n);
    }

    public static region(:rank==1) getLRank3D(final dist(:rank==3) d, 
					      final int n) {
	return getPRank3D(d, here, n);
    }

    /**
     *  Gets a specific local rank of a distribution at place p.
     */
    public static region(:rank==1) getPRank2D(final dist(:rank==2) d,
					      final place p,
					      final int n) {
	return getRank2D((d | p).region, n);
    }

    public static region(:rank==1) getPRank3D(final dist(:rank==3) d,
					      final place p,
					      final int n) {
	return getRank3D((d | p).region, n);
    }

    /**
     *  Gets the region of a distribution, restrited to here.
     */
    public static region(:rank==1) get1DLRegion(final dist(:rank==1) d) {
	return (region(:rank==1)) (d | here).region;
    }

    public static region(:rank==1) get1DPRegion(final dist(:rank==1) d,
						final place p) {
	return (region(:rank==1)) (d | p).region;
    }
    
    public static region(:rank==2) get2DLRegion(final dist(:rank==2) d) {
	return (region(:rank==2)) (d | here).region;
    }

    public static region(:rank==2) get2DPRegion(final dist(:rank==2) d,
					      final place p) {
	return (region(:rank==2)) (d | p).region;
    }

    public static region(:rank==3) get3DLRegion(final dist(:rank==3) d) {
	return (region(:rank==3)) (d | here).region;
    }

    public static region(:rank==3) get3DPRegion(final dist(:rank==3) d,
						final place p) {
	return (region(:rank==3)) (d | p).region;
    }


    /**
     *  Takes a region of rank n and returns an array of rank 1 regions, where
     *  the ith region in the array corresponds to the ith rank of the given
     *  region.
     */  
//     public static region(:rank==1)[:rank==1] splitRegion(final region r) {
// 	final dist(:rank==1) dRet = [0:r.rank()-1]->here; 
// 	return (region(:rank==1)[:rank==1]) 
// 	    new region(:rank==1)[dRet] (point [i]) {
// 	        return r.rank(i);
// 	    };
//     }

    /**
     *  The following are a series of diagnostic print functions.  
     */
//     public static void println(boolean b) {
// 	print(b);
// 	newline();
//     }

//     public static void println(int i) {
// 	print(i);
// 	newline();
//     }

//     public static void println(double d) {
// 	print(d);
// 	newline();
//     }

//     public static void print(boolean b) {
// 	print("" + b);
//     }

//     public static void print(int i) {
// 	print("" + i);
//     }

//     public static void print(double d) {
// 	print("" + d);
//     }

    public static void print(final String s) {
	if (DEBUG) {
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
