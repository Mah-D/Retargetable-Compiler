/*
 *
 * (C) Copyright IBM Corporation 2006
 *
 *  This file is part of X10 Test.
 *
 */
//package moldyn;

public class Random {

    public int iseed;
    public double v1;
    public double v2;

    public Random(int iseed0, double v10, double v20) {
	iseed = iseed0;
	v1 = v10;
	v2 = v20;
    }
    
    public double update() {
	double rand = 0.0;
	double scale = 4.656612875e-10;
	
	int is1 = 0;
	int is2 = 0;
	int iss2 = 0;
	int imult = 16807;
	int imod = 2147483647;
	
	if (iseed <= 0) { iseed = 1; }
	
	is2 = iseed % 32768;
	is1 = (iseed-is2)/32768;
	iss2 = is2 * imult;
	is2 = iss2 % 32768;
	is1 = (is1*imult+(iss2-is2)/32768) % (65536);

	iseed = (is1*32768+is2) % imod;

	rand = scale * iseed;

	return rand;
    }

    public double seed() {
	double s = 0.0;
	double u1 = 0.0;
	double u2 = 0.0;
	double r = 0.0; 

	s = 1.0;
	do {
	    u1 = update();
	    u2 = update();

	    v1 = 2.0 * u1 - 1.0;
	    v2 = 2.0 * u2 - 1.0;
	    s = v1*v1 + v2*v2;
	} while (s >= 1.0);

	r = Math.sqrt(-2.0*Math.log(s)/s);

	return r;
    }
}

