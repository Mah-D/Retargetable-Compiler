public class MoveToDist {
    public double[:rank==2] moveFieldToDist(final double[:rank==2] data,
					    final dist(:rank==2) dDst) {
	final int MAX_ROWS = 8;
	// Maximum number of iterations -- if zero, unbounded
	final int MAX_ITER = 0; 

	final dist(:rank==1) dUnique = (dist(:rank==1)) dist.UNIQUE;
	final region(:rank==1) rRank1 = X10Util.getRank(data.region, 0);
	final region(:rank==1) rRank2t = X10Util.getRank(data.region, 1);

	// Hack around a cast inside the runtime that causes an error
	final region(:rank==1) rRank2 = [0 : rRank2t.size() - 1];

	final region(:rank==1) rRows = [0:MAX_ROWS - 1];

	final dist(:rank==3) dBuffer = 
	    X10Util.extendRank3D(X10Util.extendRank2D(dUnique, rRows), rRank2);
	final double[:rank==3] srcBuffer = 
	    new double[dBuffer] (point pt) { return 0.0; };
	final double[:rank==3] dstBuffer = 
	    new double[dBuffer] (point pt) { return 0.0; };

	final int[:rank==1] offsets = new int[dUnique] (point pt) { return 0; };
	final int[:rank==1] sizes = new int[dUnique] (point pt) { return 0; };

	final int[:rank==1] inLt = new int[dUnique] (point pt) { return 0; };
	final int[:rank==1] inRt = new int[dUnique] (point pt) { return 0; };
	final int[:rank==1] outLt = new int[dUnique] (point pt) { return 0; };
	final int[:rank==1] outRt = new int[dUnique] (point pt) { return 0; };

	// fill the src buffers with the original data
	finish ateach (point [pl] : dist.UNIQUE) {
	    final region(:rank==2) rLocal = 
		X10Util.getLRegion(data.distribution);
	    final region(:rank==1) rLocal1 = X10Util.getRank(rLocal, 0);
	    if (X10Util.ENABLE_CHECKS && rLocal1.size() == 0) {
		System.err.println("Region empty -- should not happen");
		System.exit(1);
	    }

	    final int offset = rLocal1.low();
	    foreach (point [i,j] : rLocal) {
		srcBuffer[pl,i - offset,j] = data[i,j];
	    }
	    sizes[pl] = rLocal1.size();
	    offsets[pl] = offset;
	}

	int mter = MAX_ITER;
	int iter = 0;
	boolean done = false;
	do {
	    // determine number of outgoing grids
	    finish ateach (point [pl] : dist.UNIQUE) {
		final region(:rank==2) rLocalD = X10Util.getLRegion(dDst);
		final region(:rank==1) rLocalD1 = X10Util.getRank(rLocalD, 0);
		if (X10Util.ENABLE_CHECKS && rLocalD1.size() == 0) {
		    System.err.println("Region empty -- cannot to move grids");
		    System.exit(1);
		}
		outLt[pl] = 0;
		outRt[pl] = 0;

		final int lBorder = rLocalD1.low(); 
		final int rBorder = rLocalD1.high() + 1;
		for (point [i1] : [0 : sizes[pl] - 1]) {
		    final int i2 = i1 + offsets[pl];
		    if (i2 >= rBorder) {
			// grids going up
			outRt[pl]++;
		    } else if (i2 < lBorder) {
			// grids going down
			outLt[pl]++;
		    }
		} 
	    }

	    // copy fields
	    iter++;
	    final int[:rank==1] pr = new int[dUnique] (point pt) { return 0; };
	    final int[:rank==1] ter = new int[dUnique] (point pt) { return 0; };
	    

	    // get fields from below
	    finish ateach (point [pl] : dist.UNIQUE) {
		inLt[pl] = 0;
		inRt[pl] = 0;

		if (outRt[pl] > 0) {
		    final int size = outRt[pl];
		    final region(:rank==2) rBuffer = [0:size - 1,rRank2];
		    final double value[:rank==2] sBuffer = 
			new double value[rBuffer] (point [i,j]) {
			    return srcBuffer[pl,i + sizes[pl] - outRt[pl],j];
		        };

		    async (here.next()) {
			foreach (point [i,j] : rBuffer) {
			    dstBuffer[here.id,i,j] = sBuffer[i,j];
			}
			inLt[here.id] = size;
		    }
		}
	    }
	    
	    finish ateach (point [pl] : dist.UNIQUE) {
		// adjust field size
		sizes[pl] -= outRt[pl];
		
		// do not allow move to overflow field array
		outRt[pl] = Math.max(sizes[pl] + inLt[pl] - MAX_ROWS, 0);
		sizes[pl] -= outRt[pl];

		if (outRt[pl] > 0) {
		    pr[pl] = Math.max(pr[pl], outRt[pl]);
		    
		    // save whatever is possible into the end of dstBuffer
		    final int size = Math.min(outRt[pl], MAX_ROWS - inLt[pl]);
		    finish foreach (point [i,j] : [0 : size - 1,rRank2]) {
			dstBuffer[pl,MAX_ROWS - size + i,j] = 
			    srcBuffer[pl,sizes[pl] + i,j];
		    }
		}

		// shift data which is staying, if necessary
		if (sizes[pl] > 0 && inLt[pl] > 0) {
		    for (point [i1] : [1 : sizes[pl]]) {
			final int i2 = sizes[pl] - i1;
			finish foreach (point [j] : rRank2) {
			    srcBuffer[pl,i2 + inLt[pl],j] = srcBuffer[pl,i2,j];
			}
		    }
		}

		// insert data coming from the left
		finish foreach (point pt : [pl:pl,0:inLt[pl] - 1,rRank2]) {
		    srcBuffer[pt] = dstBuffer[pt];
		}

		sizes[pl] += inLt[pl];
		offsets[pl] -= inLt[pl];
	    }

	    finish ateach (point [pl] : dist.UNIQUE) {
		// get fields from above
		if (outLt[pl] > 0) {
		    final int size = outLt[pl];
		    final region(:rank==2) rBuffer = [0:size - 1,rRank2];
		    final double value[:rank==2] sBuffer =
			new double value[rBuffer] (point [i,j]) {
			    return srcBuffer[pl,i,j];
		        };
		    async (here.prev()) {
			foreach (point [i,j] : rBuffer) {
			    dstBuffer[here.id,i,j] = sBuffer[i,j];
			}
			inRt[here.id] = size;
		    }
		}
	    }

	    finish ateach (point [pl] : dist.UNIQUE) {
		// adjust field size
		sizes[pl] -= outLt[pl];
		offsets[pl] += outLt[pl];
		
		// shift data which is staying, if necessary
		if (sizes[pl] > 0 && outLt[pl] > 0) {
		    for (point [i] : [0 : sizes[pl] - 1]) {
			finish foreach (point [j] : rRank2) {
			    srcBuffer[pl,i,j] = srcBuffer[pl,i + outLt[pl],j];
			}
		    }
		}

		// do not allow move to overflow field array
		outLt[pl] = Math.max(sizes[pl] + inRt[pl] - MAX_ROWS, 0);
		if (outLt[pl] > 0) {
		    pr[pl] = Math.max(pr[pl], outLt[pl]);
		    inRt[pl] -= outLt[pl];
		} else if (outRt[pl] > 0) {
		    // do not process if prior error
		} 
		  
		finish foreach (point [i,j] : [0:inRt[pl] - 1, rRank2]) {
		    srcBuffer[pl,i + sizes[pl],j] = dstBuffer[pl,i,j];
		}
		sizes[pl] += inRt[pl];
	    

		final region(:rank==1) rLocal1 = X10Util.getLRank(dDst,0);
		if (X10Util.ENABLE_CHECKS && rLocal1.size() == 0) {
		    System.err.println("Destination distribution is empty");
		    System.exit(1);
		}
		final int size = rLocal1.size();
		final int offset = rLocal1.low();

		ter[pl] = (Math.abs(sizes[pl] - size) + 
			   Math.abs(offsets[pl] - offset));
	    }

	    int ierr = 0;
	    if (iter <= mter) {
		if (pr.max() != 0) {
		    ierr = pr.max();
		    System.err.println("Local field overflow error, " +
				       "ierr = " + ierr);
		    break;
		}

		if (iter < mter) {
		    continue;
		} else {
		    break;
		}
	    }

	    final int[:rank==1] flags = new int[[0:1]->here];
	    flags[0] = pr.max();
	    flags[1] = ter.max();

	    if (flags[0] != 0) {
		ierr = flags[0];
		System.err.println("Global field overflow error, " +
				   "ierr = " + ierr);
		break;
	    }

	    if (flags[1] != 0) {
		System.err.println("Info: fields being passed " +
				   "further = " + flags[1]);
	    } else {
		mter = iter;
		break;
	    } 
	} while (!done);
		
	// Create result array
	final double[:rank==2] result = new double[dDst];
	finish ateach (point [pl] : dist.UNIQUE) {
	    final region(:rank==1) rLocal1 = X10Util.getLRank(dDst,0);
	    
	    if (X10Util.ENABLE_CHECKS) {
		if (sizes[pl] <= 0) {
		    System.err.println("Cannot make non-existant region");
		    System.exit(1);
		}
		if (sizes[pl] != rLocal1.size() || 
		    offsets[pl] != rLocal1.low()) {
		    System.err.println("Regions don't match result dist");
		    System.exit(1);
		}
	    }

	    foreach (point [i,j] : [0:sizes[pl] - 1,rRank2]) {
		result[offsets[pl] + i,j] = srcBuffer[pl,i,j];
	    }
	}

	return result;
    }
}      