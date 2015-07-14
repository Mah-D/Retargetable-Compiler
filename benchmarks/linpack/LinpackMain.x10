public class LinpackMain {
    public static void main(String[] args) {
	{	Timer tmr=new Timer();
		int count=0;
	    tmr.start(count);
	    new Linpack().run();
	    tmr.stop(count);
		System.out.println("Wall-clock time for linpack: " + tmr.readTimer(count) + " secs");
    }
	}
}
