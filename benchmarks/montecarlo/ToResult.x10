public class ToResult {
    private double expectedReturnRate;
    private double volatility;
    private double volatility2;
    private double finalStockPrice;
    private double[:rank==1] pathValue;

    public ToResult(final double e, 
		    final double v,
		    final double v2, 
		    final double f, 
 		    final double[:rank==1] p) {
	expectedReturnRate = e;
	volatility = v;
	volatility2 = v2;
	finalStockPrice = f;
	pathValue = p;
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

    public double getFinalStockPrice() {
	return finalStockPrice;
    }

    public double[:rank==1] getPathValue() {
	return pathValue;
    }
}
