public class SparseMatmultMain {
    public static void main(String[] args) {
	{	Timer tmr=new Timer();
		int count=0;
	    tmr.start(count);
	    new SparseMatmult().run(0);
	    tmr.stop(count);
		System.out.println("Wall-clock time for sparsemm: " + tmr.readTimer(count) + " secs");
    }
	}
}
