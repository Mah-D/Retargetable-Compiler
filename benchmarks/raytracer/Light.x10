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
public value Light {
	public final Vec pos; //Nullable
	public final double	brightness;

	/*public Light() {
		brightness = 0.0;
	}*/

	public Light(final double x, final double y, final double z, final double b) {
		pos = new Vec(x, y, z, false);
		brightness = b;
	}
	
	public String toString()
	{
		return pos + " " + brightness;
	}
}

