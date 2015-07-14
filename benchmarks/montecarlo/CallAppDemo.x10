public class CallAppDemo {
    private AppDemo ap;

    public CallAppDemo() {
	ap = new AppDemo(1000, 1000);
    }

    public void runiters() {
	ap.runSerial();
    }

    public void presults() {
	ap.processResults();
    }

    public void go() {
	init();
	kernel();
	validate();
    }

    public void init() {
    }

    public void kernel() {
	runiters();
	presults();
    }

    public void validate() {
	double ref = -0.03234469082617506;
	double dev = Math.abs(ap.result[0] - ref); // TODO : fix me

	if (dev > 1.0e-12) {
	    System.out.println("Validation failed");
	    System.out.println("ExpectedReturnRate = " +  ap.result[0] + " " + ref + " " + dev);
	    throw new RuntimeException("Validation failed");
	}
    }

    
}