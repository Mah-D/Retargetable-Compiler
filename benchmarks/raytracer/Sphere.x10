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


//ok
public value Sphere {
	private final Vec c;
	private final double r; 
	private final double r2;
	public final Surface surf;
	
	public Sphere(final Vec center, final double radius, final Surface s) {
		surf = s;
		c = center;
		r = radius;
		r2 = radius*radius;
	}

	public Sphere(final Vec center, final double radius) {
		//this(center, radius, new Surface());
		c = center;
		r = radius;
		r2 = radius*radius;
		surf = new Surface();
	}
	
	public Isect intersect(final Ray ry) {

		Vec v=Vec.sub(c, ry.p);
		double b = Vec.dot(v, ry.d);
		double disc = b*b - Vec.dot(v, v) + r2;
		if (disc < 0.0) {
			//return null;
			return new Isect(0.0, 0, true, this, surf);
		}
		disc = Math.sqrt(disc);
		double t = (b - disc < 1e-6) ? b + disc : b - disc;
		if (t < 1e-6) {
			//return null;
			return new Isect(0.0, 0, true, this, surf);
		}
		Isect ip = new Isect(t, Vec.dot(v, v) > r2 + 1e-6 ? 1 : 0, false, this, surf );
		return ip;
	}
	
	public Vec normal(final Vec p) {
		return Vec.sub(p, c).normalized();
	}
	
	public String toString() {
		return "Sphere {" + c.toString() + "," + r + "}";
	}
	
	public Vec getCenter() {
		return c;
	}
	
}
