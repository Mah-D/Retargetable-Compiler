public class LinearESOpenPIC2DMain {
    public static void main(String[] args) {
	{	Timer tmr=new Timer();
		int count=0;
	    tmr.start(count);
		new LinearESOpenPIC2D().run();
	    tmr.stop(count);
		System.out.println("Wall-clock time for plasma: " + tmr.readTimer(count) + " secs");
    }
	}
}
