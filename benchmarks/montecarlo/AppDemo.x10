public class AppDemo {
    private dist(:rank==1) D;
    private final double[:rank==1] expectedReturnRate;
    private final double[:rank==1] volatility;
    private ToTask[:rank==1] tasks;
    public final double[:rank==1] result;

    public ToInitAllTasks initAllTasks;

    public PriceStock psMC;

    // public double pathStartValue;
    public double aExpectedReturnRateMC;
    public double aVolatilityMC;
    public int nTimeStepsMC;
    public int nRunsMC;
    public boolean initialised;


    public AppDemo(final int nTimeStepsMC0, final int nRunsMC0) {
	dist(:rank==1) dResult = [0:0]->here;
	result = getDoubleArray(dResult);
	nTimeStepsMC = nTimeStepsMC0;
	nRunsMC = nRunsMC0;
	initialised = false;
	final dist(:rank==1) tempD = (dist(:rank==1)) dist.factory.block([0:(nRunsMC0 - 1)]);
        D = tempD;
	expectedReturnRate = getDoubleArray(tempD);
	volatility = getDoubleArray(tempD);

	final double pathStartValue = 100.0;
	aExpectedReturnRateMC = 0.0;
	aVolatilityMC = 0.0;

	// initSerial()
	RatePath rateP = new RatePath();
	ReturnPath returnP = rateP.getReturnCompounded();
	returnP.estimatePath();

	double eRR = returnP.getExpectedReturnRate();
	double vol = returnP.getVolatility();

	initAllTasks = new ToInitAllTasks(returnP,nTimeStepsMC0,pathStartValue);
	initTasks(nRunsMC0,tempD);
    } 

    public double[:rank==1] getDoubleArray(final dist(:rank==1) d) {
        return new double[d];
    }
     
    public void runSerial() {
	final ToInitAllTasks t = initAllTasks;
        final ToTask[:rank==1] mytasks = tasks;
        final double[:rank==1] myexpectedReturnRate = expectedReturnRate;
        final double[:rank==1] myvolatility = volatility;
	finish ateach (point(:rank==1) i: expectedReturnRate.distribution) {
	    final PriceStock ps = new PriceStock();
	    ps.setInitAllTasks(t);
	    ps.setTask(mytasks[i]); // here was the original BadPlaceExpcetion
	    ps.run();
	    ToResult r = ps.getResult();
	    myexpectedReturnRate[i] = r.getExpectedReturnRate(); // here is a new BadPlaceException
	    myvolatility[i] = r.getVolatility();
	}
    }

    public void presults() {
	processResults();
    }

    private void initTasks(final int nRunsMC, final dist(:rank==1) aD) {
	tasks = new ToTask[aD] (point(:rank==1) p) {
	    return new ToTask((long) p[0] * 11);
	};
    }

    public void processResults() {
	final double avgERRMC = expectedReturnRate.sum() / nRunsMC;
	final double aveVol = volatility.sum() / nRunsMC;
	
	result[0] = avgERRMC;
    }
}
