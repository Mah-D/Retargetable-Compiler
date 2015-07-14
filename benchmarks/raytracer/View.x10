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
public value View {
	public final Vec    from;
	public final Vec    at;
	public final Vec    up;
	public final double distance;
	public final double angle;
	public final double aspect;

	public View (final Vec from_, final Vec at_, final Vec up_, final double dist_, final double angle_, final double aspect_)
	{
		from = from_;
		at = at_;
		up = up_;
		distance = dist_;
		angle = angle_;
		aspect = aspect_;
	}

	public String toString() {
		return "View { from = " + from + " at = " + at + " up = " + up + " distance = " + distance + " angle = " + angle + " aspect = " + aspect + "}";
	}

}

