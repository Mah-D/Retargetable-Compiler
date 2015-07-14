/**
 *  A rewrite of pfmove2.  Subject to cleansing.
 */
public class PFMove {
    /**
     *  Takes an existing 2D array and copy of that array such that the data
     *  is now distributed by the given distribution
     */
    public double[:rank==2] redistributeField(final double[:rank==2] data,
						    final dist(:rank==2) dDst) {
	final dist(:rank==1) dUnique = (dist(:rank==1)) dist.UNIQUE;
	final int[:rank==1] outLt = new int[dUnique] (point pt) { return 0; };
	final int[:rank==1] outRt = new int[dUnique] (point pt) { return 0; };
	final int[:rank==1] inLt = new int[dUnique] (point pt) { return 0; };
	final int[:rank==1] inRt = new int[dUnique] (point pt) { return 0; };
     
	final double[:rank==2] sBuffer;
	final double[:rank==2] rBuffer;
	final region(:rank==2)[:rank==1] sendRegions;

	// determine number of outgoing grids
	finish ateach (point [pl] : dist.UNIQUE) {
	    outLt[pl] = 0;
	    outRt[pl] = 0;
	    
	}
    }
}