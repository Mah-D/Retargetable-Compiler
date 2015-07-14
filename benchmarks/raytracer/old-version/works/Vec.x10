/**************************************************************************
*                                                                         *
*             Java Grande Forum Benchmark Suite - Version 2.0             *
*                                                                         *
*                            produced by                                  *
*                                                                         *
*                  Java Grande Benchmarking Project                       *
*                                                                         *
*                                at                                       *
*                                                                         *
*                Edinburgh Parallel Computing Centre                      *
*                                                                         *
*                email: epcc-javagrande@epcc.ed.ac.uk                     *
*                                                                         *
*                 Original version of this code by                        *
*            Florian Doyon (Florian.Doyon@sophia.inria.fr)                *
*              and  Wilfried Klauser (wklauser@acm.org)                   *
*                                                                         *
*      This version copyright (c) The University of Edinburgh, 1999.      *
*                         All rights reserved.                            *
*                                                                         *
**************************************************************************/
/**
 * This class reflects the 3d vectors used in 3d computations
 */
public value Vec {

	/**
	 * The x coordinate
	 */
	public final double x;

	/**
	 * The y coordinate
	 */
	public final double y;

	/**
	 * The z coordinate
	 */
	public final double z;

	public final boolean isNull;
	
	/**
	 * Constructor
	 * @param a the x coordinate
	 * @param b the y coordinate
	 * @param c the z coordinate
	 */
	public Vec(double a, double b, double c, boolean isNull_) {
		x = a;
		y = b;
		z = c;
		isNull = isNull_;
	}

	/**
	 * Copy constructor
	 */
	public Vec(Vec a, boolean isNull_) {
		x = a.x;
		y = a.y;
		z = a.z;
		isNull = isNull_;
	}

	/**
	 * Default (0,0,0) constructor
	 */
	public Vec() {
		x = 0.0;
		y = 0.0;
		z = 0.0;
		isNull = false;
	}

	/**
	 * Add a vector to the current vector
	 * @param: a The vector to be added
	 */
	public Vec added(Vec a) {
		return new Vec(x+a.x, y+a.y, z+a.z, false);
	}

	/**
	 * adds: Returns a new vector such as
	 * new = sA + B
	 */
	public static Vec adds(double s, Vec a, Vec b) {
		return new Vec(s * a.x + b.x, s * a.y + b.y, s * a.z + b.z, false);
	}

	/**
	 * Adds vector such as:
	 * this += sB
	 * @param: s The multiplier
	 * @param: b The vector to be added
	 */
	public Vec adds(double s, Vec b) {
		return new Vec(x+s*b.x, y+s*b.y, z+s*b.z, false);
	}

	/**
	 * Substracs two vectors
	 */
	public static Vec sub(Vec a, Vec b) {
		return new Vec(a.x - b.x, a.y - b.y, a.z - b.z, false);
	}

	public static Vec mult(Vec a, Vec b) {
		return new Vec(a.x * b.x, a.y * b.y, a.z * b.z, false);
	}

	public static Vec cross(Vec a, Vec b) {
		return
			new Vec(a.y*b.z - a.z*b.y,
					a.z*b.x - a.x*b.z,
					a.x*b.y - a.y*b.x, false);
	}

	public static double dot(Vec a, Vec b) {
		return a.x*b.x + a.y*b.y + a.z*b.z;
	}

	public static Vec comb(double a, Vec A, double b, Vec B) {
		return
			new Vec(a * A.x + b * B.x,
					a * A.y + b * B.y,
					a * A.z + b * B.z, false);
	}

	public Vec scale(double t) {
		return new Vec(x*t, y*t, z*t, false);
	}

	public Vec negate() {
		return new Vec(-x,-y,-z, false);
	}

	public Vec normalized() {
		double len = Math.sqrt(x*x + y*y + z*z);
		return (len > 0.0) ? new Vec(x /len, y/len, z/len, false) : this;
	}

	public double length() {
		return Math.sqrt(x*x+y*y+z*z);
	}

	public String toString() {
		return "<" + x + "," + y + "," + z + ">";
	}
}

