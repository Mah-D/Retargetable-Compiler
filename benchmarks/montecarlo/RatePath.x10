public class RatePath {
    private double[:rank==1] pathValue;
    private int nAcceptedPathValue;
    private double dTime;    

    public RatePath() {
 	dist(:rank==1) dPath = [0 : 2596]->here;
        final double[:rank==1] pv = new double[dPath];
 	pathValue = pv;
	Data0.fill(pv);
	Data1.fill(pv);
	Data2.fill(pv);
	Data3.fill(pv);
	Data4.fill(pv);
	Data5.fill(pv);
	Data6.fill(pv);
	Data7.fill(pv);
	Data8.fill(pv);
 	nAcceptedPathValue = dPath.region.size();
	dTime = (1.0 / 365.0);
    }

    public RatePath(final MonteCarloPath mc) {
	dTime = mc.getDTime();
	pathValue = mc.getPathValue();
	nAcceptedPathValue = mc.getNTimeSteps();	
    }

    public ReturnPath getReturnCompounded() {
 	dist(:rank==1) dAPV = [0 : nAcceptedPathValue - 1]->here;
 	double[:rank==1] returnPathValue = new double[dAPV];
	returnPathValue[0] = 0.0;
	
	for (point(:rank==1) i: [1 : nAcceptedPathValue - 1]) {
	    returnPathValue[i] = Math.log(pathValue[i] / pathValue[i+[-1]]);
	}

	ReturnPath rPath = new ReturnPath(returnPathValue,
					  nAcceptedPathValue,
					  ReturnPath.COMPOUNDED);

	rPath.setDTime(dTime);
	rPath.estimatePath();
	return rPath;
    }

    public double getEndPathValue() {
 	return pathValue[pathValue.region.size() - 1];
    }
}
