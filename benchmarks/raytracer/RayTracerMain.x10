public class RayTracerMain {
    public static void main(String[] args) {
	{	Timer tmr=new Timer();
		int count=0;
	        tmr.start(count);
	        new RayTracer().run();
	        tmr.stop(count);
		System.out.println("Wall-clock time for raytracer: " + tmr.readTimer(count) + " secs");
        }
    }
}
