public class Data {
    public static final java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

    public static double[:rank==2] readForce(int y, int x) {
	final region(:rank==2) r = [0:y,0:x];
	final double[:rank==2] d = (double[:rank==2]) new double[r->here];

	for (point pt : d) {
	    d[pt] = readDouble();
	}
	return d;
    }

    public static double readDouble() {
	try {
	    return java.lang.Double.parseDouble(in.readLine());
	} catch (java.io.IOException e) {
	    throw new RuntimeException(e);
	}
    }
}