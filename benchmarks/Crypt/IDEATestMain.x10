public class IDEATestMain {
    public static void main(String[] args) {
	{	Timer tmr=new Timer();
		int count=0;
	    tmr.start(count);
		new IDEATest().run();
	    tmr.stop(count);
		System.out.println("Wall-clock time for crypt: " + tmr.readTimer(count) + " secs");
    }
	}
}
