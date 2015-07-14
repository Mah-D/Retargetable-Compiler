/**
 *  X10 does not have complex numbers as primitive types so we must introduce
 *  a class to mimic their behavior.  Complex numbers consists of a real
 *  and imaginary portions.  
 */
public value Complex {
    private final double real;
    private final double imag;

    /**
     *  Creates a complex number of the given real and imaginary portions.
     */
    public Complex(double real, double imag) {
	this.real = real;
	this.imag = imag;
    }

    /**
     *  Retrieves the real part of the complex value.
     */
    public double getReal() {
	return real;
    }

    /**
     *  Retrieves the imaginary part of the complex value.
     */
    public double getImag() {
	return imag;
    }

    /**
     *  Adds a complex number to this complex number to  create a new complex 
     *  value.  If we have a complex number (a + b*i), c1 and another 
     *  complex number (c + d*i), c2, then c1 + c2 = ((a + c) + (b + d)*i).
     */
    public Complex add(Complex n) {
	return new Complex(getReal() + n.getReal(),
			   getImag() + n.getImag());
    }

    /**
     *  Subtracts a complex number from this complex number to create a new
     *  complex value.  If we have a complex number (a + b*i), c1 and another
     *  complex number (c + d*i), c2, then c1 - c2 = ((a - c) + (b - d)*i).
     */
    public Complex sub(Complex n) {
	return new Complex(getReal() - n.getReal(),
			   getImag() - n.getImag());
    }
    
    /** 
     *  Multiplies a complex number to this complex number to create a new
     *  complex value.  If we have a complex number (a + b*i), c1 and another
     *  complex number (c + d*i), c2, then 
     *  c1 * c2 = ((a*c - b*d) + (a*d + b*c)*i)
     */
    public Complex mult(Complex n) {
	final double a = getReal();
	final double b = getImag();
	final double c = n.getReal();
	final double d = n.getImag();
	return new Complex(a*c - b*d, a*d + b*c);
    }

    /**
     *  Multiples a real number to this complex number.  If we multiply a 
     *  real value, r, with a complex number (a + b*i),c, then 
     *  r * c = (r*a + r*b*i) 
     */
    public Complex multS(double r) {
	return new Complex(r * getReal(), r * getImag());
    }

    /**
     *  Returns a new complex value consisting of the conjugate of this 
     *  complex number.  The conjugate of a complex number (a + b*i) is
     *  (a - b*i).
     */
    public Complex getConjg() {
	return new Complex(getReal(), -getImag());
    }

    /**
     *  Returns the real value that results from multiplying this complex 
     *  number with its conjugate.  
     */
    public double multConjg() {
	final double a = getReal();
	final double b = getImag();	
	return (a*a + b*b); 
    }

    /**
     *  Two complex values are equals if the delta of both the real and 
     *  imaginary components is less than ERROR.
     */
    public boolean complexEquals(Complex c) {
	return ((Math.abs(getReal() - c.getReal()) < X10Util.ERROR) &&
		(Math.abs(getImag() - c.getImag()) < X10Util.ERROR));
    }

    /**
     *  Returns a complex number as a string value "(r,i)" where r is the
     *  real component and i is the imaginary component.
     */
    public String toString() {
	final double r = getReal();
	final double i = getImag();
	return "(" + r + "," + i + ")";
    }

//     /**
//      *  Given a complex array of a distStarBlock distribution, this method 
//      *  returns a double array of a similar distribution except the first
//      *  dimension is twice the size.  The double at [2*i,j] corresponds to
//      *  the real component of the complex at [i,j].  The double at [2*i+1,j]
//      *  corresponds to the imaginary component at [i,j].
//      */
//     public static
// 	double[:rank==2] complexToDoubleArray2D(final Complex[:rank==2] c) {
	
// 	if (!X10Util.isDistStarBlock((dist(:rank==2)) c.distribution)) {
// 	    X10Util.println("Conversion of a complex array to double array " +
// 			    "requires a star block distribution.");
// 	    throw new RuntimeException("complexToDouble exception: " + 
// 				       c.distribution);
// 	}

// 	final region(:rank==1) rSrc1 = X10Util.getRank(c.region, 0);
// 	final region(:rank==1) rDst1 = [0 : 2*rSrc1.size() - 1];
// 	final dist(:rank==1) dSrc2 = X10Util.getDistRank(c.distribution, 1);
// 	final dist(:rank==2) dDst = X10Util.prependDistRank2D(rDst1, dSrc2);

// 	return new double[dDst] (point [i,j]) {
// 	    return (i % 2 == 0) ? c[i/2,j].getReal() : c[i/2,j].getImag();
// 	};	
//     }

//     /**
//      *  Given a double array of a distStarBlock distribution, where the size of
//      *  the first dimension is even, returns a Complex array with a similar 
//      *  distribution where the first dimension is half the size.  Each adjacent
//      *  pair of double values are used to form the Complex value.
//      */
//     public static
// 	Complex[:rank==2] doubleToComplexArray2D(final double[:rank==2] d) {
	
// 	if (!X10Util.isDistStarBlock((dist(:rank==2)) d.distribution)) {
// 	    X10Util.println("Conversion of a complex array to double array " +
// 			    "requires a star block distribution.");
// 	    throw new RuntimeException("doubleToComplex exception: " + 
// 				       d.distribution);
// 	}

// 	final region(:rank==1) rSrc1 = X10Util.getRank(d.region, 0);
// 	if (rSrc1.size() % 2 != 0) {
// 	    X10Util.println("Conversion of a double array to a complex array " +
// 			    "requires rank 0 to have an even size.");
// 	    throw new RuntimeException("doubleToComplex exception: " + rSrc1);
// 	}

// 	final region(:rank==1) rDst1 = [0 : rSrc1.size() / 2 - 1];
// 	final dist(:rank==1) dSrc2 = X10Util.getDistRank(d.distribution, 1);
// 	final dist(:rank==2) dDst = X10Util.prependDistRank2D(rDst1, dSrc2);

// 	return new Complex[dDst] (point [i,j]) {
// 	    return new Complex(d[2*i,j], d[2*i+1,j]);
// 	};	
//     }
}