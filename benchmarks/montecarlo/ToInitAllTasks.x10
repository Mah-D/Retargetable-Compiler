public value ToInitAllTasks {
    private final double dTime;
    private final int returnDefinition;
    private final double expectedReturnRate;
    private final double volatility;
    private final int nTimeSteps;
    private final double pathStartValue;

    public ToInitAllTasks(final ReturnPath r, final int nts, final double psv) {
	dTime = r.getDTime();
	returnDefinition = r.getReturnDefinition();
	expectedReturnRate = r.getExpectedReturnRate();
	volatility = r.getVolatility();
	nTimeSteps = nts;
	pathStartValue = psv;
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

    public int getNTimeSteps() {
	return nTimeSteps;
    }

    public double getPathStartValue() {
	return pathStartValue;
    }
    // PlasmaX10-v1.5 TYPECHECK ERROR 
    public String toString()
    {
        return "";
    }
}
