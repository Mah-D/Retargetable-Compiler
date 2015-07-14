public class ReturnPath {
    public static final int COMPOUNDED = 1;
    public static final int NONCOMPOUNDED = 2;

    private double dTime;

    private double[:rank==1] pathValue;
    private int nPathValue;
    private int returnDefinition;
    private double expectedReturnRate;
    private double volatility;
    private double volatility2;
    private double mean;
    private double variance;

    public ReturnPath(final double[:rank==1] pv, final int npv, final int rd) {
	pathValue = pv;
	nPathValue = npv;
	returnDefinition = rd;
    }

    public void setDTime(final double d) {
	dTime = d;
    }

    public double getDTime() {
	return dTime;
    }

    public int getReturnDefinition() {
	return returnDefinition;
    }

    public double getExpectedReturnRate() {
	return expectedReturnRate;
    }

    public double getVolatility() {
	return volatility;
    }

    public double getVolatility2() {
	return volatility2;
    }

    public void estimatePath() {
	computeMean();
	computeVariance();
	computeExpectedReturnRate();
	computeVolatility();
    }
    
    public void computeMean() {
	mean = 0.0;
	for (point(:rank==1) i: [1 : nPathValue - 1]) {
	    mean = mean + pathValue[i];
	}
	mean = mean / ((double) (nPathValue - 1.0));
    }

    public void computeVariance() {
	variance = 0.0;
	for (point(:rank==1) i: [1 : nPathValue - 1]) {
	    variance = variance + ((pathValue[i] - mean) * (pathValue[i] - mean));
	}
	variance = variance / ((double) (nPathValue - 1.0));
    }

    public void computeExpectedReturnRate() {
	expectedReturnRate = mean / dTime + 0.5 * volatility2;
    }

    public void computeVolatility() {
	volatility2 = variance / dTime;
	volatility = Math.sqrt(volatility2);
    }
}
