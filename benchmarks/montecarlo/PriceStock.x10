public class PriceStock {
    private final MonteCarloPath mcPath;
    private long randomSeed;
    private double pathStartValue;
    private double expectedReturnRate;
    private double volatility;
    private double volatility2;
    private double finalStockPrice;
    private double[:rank==1] pathValue;

    public PriceStock() { 
	randomSeed = -1;
	mcPath = new MonteCarloPath();
    }

    public void setInitAllTasks(final ToInitAllTasks initAllTasks) {
	finish { 
	    mcPath.setDTime(initAllTasks.getDTime());
	    mcPath.setReturnDefinition(initAllTasks.getReturnDefinition());
	    mcPath.setExpectedReturnRate(initAllTasks.getExpectedReturnRate());
	    mcPath.setVolatility(initAllTasks.getVolatility());
	    
	    final int nTimeSteps = initAllTasks.getNTimeSteps();
	    mcPath.setNTimeSteps(nTimeSteps);
	    pathStartValue = initAllTasks.getPathStartValue();
	    mcPath.setPathStartValue(pathStartValue);

	    final dist(:rank==1) dTS = [0 : nTimeSteps - 1]->here;
	    mcPath.setPathValue(new double[dTS]);
	    mcPath.setFluctuations(new double[dTS]);
	}
    }

    public void setTask(final ToTask task) {
	randomSeed = task.getRandomSeed();
    }

    public void run() {
	mcPath.computeFluctuationsGaussian(randomSeed);
	mcPath.computePathValue(pathStartValue);
	RatePath rateP = new RatePath(mcPath);
	ReturnPath returnP = rateP.getReturnCompounded();
	returnP.estimatePath();
	expectedReturnRate = returnP.getExpectedReturnRate();
	volatility = returnP.getVolatility();
	volatility2 = returnP.getVolatility2();
	finalStockPrice = rateP.getEndPathValue();
	pathValue = mcPath.getPathValue();
    }

    public ToResult getResult() {
	ToResult res = new ToResult(expectedReturnRate, 
				    volatility,
				    volatility2,
				    finalStockPrice,
				    pathValue);
	return res;
    }
}
