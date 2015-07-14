public class CallAppDemoMain {
    public static void main(String[] args) {
	{	Timer tmr=new Timer();
		int count=0;
	    tmr.start(count);
		new CallAppDemo().go();
	    tmr.stop(count);
		System.out.println("Wall-clock time for montecarlo: " + tmr.readTimer(count) + " secs");
    }
	}
}
