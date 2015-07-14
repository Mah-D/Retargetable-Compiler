public class SeriesMain {
    public static void main(String[] args) {
	{	Timer tmr=new Timer();
		int count=0;
	    tmr.start(count);
	    new Series().run();
	    tmr.stop(count);
		System.out.println("Wall-clock time for series: " + tmr.readTimer(count) + " secs");
    }
	}
}
