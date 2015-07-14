public class Random {
    private int flag;
    private double r0;
    private int r1;
    private int r2;
    private int r4;
    private int r5;
    private double h1l;
    private double h1u;
    private double h2l;

    public Random() {
	flag = 0;
	r0 = 0.0;
	r1 = 885098780;
	r2 = 1824280461;
	r4 = 1396483093;
	r5 = 55318673;
	h1l = 65531.0;
	h1u = 32767.0;
	h2l = 65525.0;
    }

    public double nextNormal() {
	double ret = 0.0;
	if (flag != 0) {
	    ret = r0;
	    r0 = 0.0;
	    flag = 0;    
	} else {
	    int isc = 65536;
	    double asc = isc;
	    double bsc = asc * asc;
	    int i1 = r1 - (r1 / isc) * isc;
	    double r3 = h1l * r1 + asc * h1u * i1;
	    i1 = (int) (r3 / bsc);
	    r3 -= i1 * bsc;
	    bsc = 0.5 * bsc;
	    i1 = r2 / isc;
	    isc = r2 - i1 * isc;
	    r0 = h1l * r2 + asc * h1u * isc;
	    asc = 1.0 / bsc;
	    isc = (int) (r0 * asc);
	    r2 = (int) (r0 - isc * bsc);
	    r3 += isc + 2.0 * h1u * i1;
	    isc = (int) (r3 * asc);
	    r1 = (int) (r3 - isc * bsc);
	    
	    double temp = Math.sqrt(-2.0 * Math.log((r1 + r2 * asc) * asc));
	    isc = 65536;
	    asc = isc;
	    bsc = asc * asc;
	    i1 = r4 - (r4 / isc) * isc;
	    r3 = h2l * r4 + asc * h1u * i1;
	    i1 = (int) (r3 / bsc);
	    r3 -= i1 * bsc;
	    bsc = 0.5 * bsc;
	    i1 = r5 / isc;
	    isc = r5 - i1 * isc;
	    r0 = h2l * r5 + asc * h1u * isc;
	    asc = 1.0 / bsc;
	    isc = (int) (r0 * asc);
	    r5 = (int) (r0 - isc * bsc);
	    r3 += (isc + 2.0 * h1u * i1);
	    isc = (int) (r3 * asc);
	    r4 = (int) (r3 - isc * bsc);
	    r0 = 6.28318530717959 * ((r4 + r5 * asc) * asc);

	    ret = temp * Math.sin(r0);
	    r0 = temp * Math.cos(r0);
	    flag = 1;
	}
	return ret;
    }
}