public class SORMain {
    public static void main(String[] args) {
	{	Timer tmr=new Timer();
		int count=0;
	    tmr.start(count);
		new SOR().run();
	    tmr.stop(count);
		System.out.println("Wall-clock time for sor: " + tmr.readTimer(count) + " secs");
    }
	}
}
