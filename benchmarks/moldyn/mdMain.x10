public class mdMain {
    public static void main(String[] args) {
	{	Timer tmr=new Timer();
		int count=0;
	    tmr.start(count);
		md.exec();
	    tmr.stop(count);
		System.out.println("Wall-clock time for moldyn: " + tmr.readTimer(count) + " secs");
    }
	}
}
