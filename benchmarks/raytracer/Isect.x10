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
public class Isect {
	public double	t;
	public int		enter;
	public Sphere	prim; //Nullable
	public Surface		surf; //Nullable
	public boolean isNull;
	public Isect() {
		t = 0.0;
		enter = 0;
		isNull = false;
	}
	public Isect(final double t_, final int enter_, final boolean isNull_, /*Nullable*/final Sphere prim_, /*Nullable*/final Surface surf_) {
		t = t_;
		isNull = isNull_;
		enter = enter_;
		prim = prim_;
		surf = surf_;
	}
}

