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
public value Surface {
	public final Vec	color;
	public final double	kd;
	public final double	ks;
	public final double	shine;
	public final double	kt;
	public final double	ior;
	public final boolean isNull;
	
	public Surface() {
		color = new Vec(1, 0, 0, false);
		kd = 1.0;
		ks = 0.0;
		shine = 0.0;
		kt = 0.0;
		ior = 1.0;
		isNull = false;
	}

	public Surface(final double shine_, final double ks_, final double kt_, final Vec c_, final boolean isNull_) {
		kd = 1.0;
		ks = ks_;
		shine = shine_;
		kt = kt_;
		ior = 1.0;
		color = c_;
		isNull = isNull_;
	}

	public String toString() {
		return "Surface { color = " + color + " }";
	}
}

