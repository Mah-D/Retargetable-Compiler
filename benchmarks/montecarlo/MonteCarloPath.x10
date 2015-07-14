public class MonteCarloPath {
    private double dTime;
    private double[:rank==1] fluctuations;
    private double[:rank==1] pathValue;
    private int returnDefinition;
    private double expectedReturnRate;
    private double volatility;
    private int nTimeSteps;
    private double pathStartValue;

    public void computeFluctuationsGaussian(final long seed) {
	Random rnd = new Random(seed);
       
	double mean = (expectedReturnRate - 0.5*volatility*volatility) * dTime;
	double sd = volatility * Math.sqrt(dTime);
	double gauss = 0.0;
	double meanGauss = 0.0;
	double variance = 0.0;
	for (point(:rank==1) i: [0 : nTimeSteps - 1]) {
	    gauss = rnd.nextGaussian();
	    meanGauss = meanGauss + gauss;
	    variance  = variance + (gauss * gauss);
	    
	    fluctuations[i] = mean + sd * gauss;
	}
	meanGauss = meanGauss / (double) nTimeSteps;
	variance  = variance  / (double) nTimeSteps;
    }

    public void computePathValue(final double startValue) {
	pathValue[0] = startValue;
	if (returnDefinition == ReturnPath.COMPOUNDED ||
	    returnDefinition == ReturnPath.NONCOMPOUNDED) {
	    for (point(:rank==1) i: [1 : nTimeSteps - 1]) {
                pathValue[i] = pathValue[i+[-1]] * Math.exp(fluctuations[i]);
	    }
	}
    }

    public double getDTime() {
	return dTime;
    }

    public double[:rank==1] getPathValue() {
    	return pathValue;
    }

    public int getNTimeSteps() {
	return nTimeSteps;
    }

    public void setDTime(final double d) {
	dTime = d;
    }

    public void setReturnDefinition(final int r) {
	returnDefinition = r;
    }

    public void setExpectedReturnRate(final double e) {
	expectedReturnRate = e;
    }

    public void setVolatility(final double v) {
	volatility = v;
    }

    public void setNTimeSteps(final int n) {
	nTimeSteps = n;
    }

    public void setPathStartValue(final double p) {
	pathStartValue = p;
    }

    public void setPathValue(final double[:rank==1] p) {
    	pathValue = p;
    }

    public void setFluctuations(final double[:rank==1] f) {
    	fluctuations = f;
    }
}
