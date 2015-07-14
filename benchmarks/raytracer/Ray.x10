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
public class Ray {
	public Vec p;
    public Vec d; // Changed

	public Ray(final Vec pnt, final Vec dir) {
		//this(pnt, dir, true);
		p = new Vec(pnt.x, pnt.y, pnt.z, false);
		d =  new Vec(dir.x, dir.y, dir.z, false).normalized();
	}

	public Ray(final Vec pnt, final Vec dir, final boolean normalize) {
		if (normalize) {
			p = new Vec(pnt.x, pnt.y, pnt.z, false);
			d =  new Vec(dir.x, dir.y, dir.z, false).normalized();
		} else {
			p = pnt;
			d = dir;
		}
	}

	public Ray() {
		p = new Vec();
		d = new Vec();
	}

	public Ray d(final Vec d_) {
		return new Ray(p, d_, false);
	}

	public Vec rayPoint(final double t) {
	//public Vec point(double t) { // Changed
		return new Vec(p.x + d.x * t, p.y + d.y * t, p.z + d.z * t, false);
	}

	public String toString() {
		return " { " + p.toString() + "->" + d.toString() + " } ";
	}
}

