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
*            Florian Doyon (Florian.doyon@sophia.inria.fr)                *
*              and  Wilfried Klauser (wklauser@acm.org)                   *
*                                                                         *
*      This version copyright (c) The University of Edinburgh, 1999.      *
*                         All rights reserved.                            *
*                                                                         *
**************************************************************************/

public class RayTracer {

	private Scene scene;

	/**
	 * Lights for the rendering scene
	 */
	private Light[:rank==1] lights;

	/**
	 * Objects (spheres) for the rendering scene
	 */
	private Sphere[:rank==1] prim;

	/**
	 * The view for the rendering scene
	 */
	private View view;

	/**
	 * Alpha channel
	 */
	private static final int alpha = 255<<24;

	/**
	 * Null vector (for speedup, instead of <code>new Vec(0,0,0)</code>
	 */
	private static final Vec voidVec = new Vec();

	/**
	 * Height of the <code>Image</code> to be rendered
	 */
	private int height;

	/**
	 * Width of the <code>Image</code> to be rendered
	 */
	private int width;

	//int datasizes[] = { 150, 500 };
	//private int datasizes[] = { 20, 500 }; //reducing data size
	private int[:rank==1] datasizes;

	private long checksum;

	long[:rank==1] checkSumArray;
	private int size_t;

	private int numobjects;

    public RayTracer() {
    }


	/**
	 * Create and initialize the scene for the rendering picture.
	 * @return The scene just created
	 */
    // Code brought from the other file 
	public void JGFsetsize(int size_t) {
		checksum = 0;
		dist(:rank==1) d1 = [0:1]->here;
		datasizes = new int[d1];
		datasizes[0] = 20;
		datasizes[1] = 500;
		this.size_t = size_t;
	}

	public void JGFinitialise() {
	    //	JGFInstrumentor.startTimer("Section3:RayTracer:Init");

		// set image size
		width = datasizes[size_t];
		height = datasizes[size_t];

		// create the objects to be rendered
		scene = createScene();

		// get lights, objects etc. from scene.
		setScene(scene);

		//TODO: Change this
		numobjects = scene.getObjects();

		// JGFInstrumentor.stopTimer("Section3:RayTracer:Init");
	}

	public void JGFapplication() {
		// JGFInstrumentor.startTimer("Section3:RayTracer:Run");

		// Set interval to be rendered to the whole picture
		// (overkill, but will be useful to retain this for parallel versions)
		Interval interval = new Interval(0, width, height, 0, height, 1);

		// Do the business!
		render(interval);

		// JGFInstrumentor.stopTimer("Section3:RayTracer:Run");
	}

	public void JGFvalidate() {
		//long refval[] = { 2676692, 29827635 };
		//long refval[] = { 51398, 29827635 }; // reduced data size
		dist(:rank==1) d1 = [0:1]->here;
		long[:rank==1] refval = new long[d1];
		//refval[0] = 51398;
		refval[0] = 51428;
		refval[1] = 29827635;
		long dev = checksum - refval[size_t];
		if (dev != 0) {
			System.out.println("Validation failed");
			System.out.println("Pixel checksum = " + checksum);
			System.out.println("Reference value = " + refval[size_t]);
			throw new RuntimeException("Validation failed");
		}
	}

	public void JGFtidyup() {
		/*
		scene = null;
		lights = null;
		prim = null;
		tRay = null;
		inter = null;
		*/
		// System.gc();
	}

	public void run() {
		//JGFInstrumentor.addTimer("Section3:RayTracer:Total", "Solutions", size);
		//JGFInstrumentor.addTimer("Section3:RayTracer:Init", "Objects", size);
		//JGFInstrumentor.addTimer("Section3:RayTracer:Run", "Pixels", size);
        //The size should be set equal to the data index you are trying to deal with right now 

		//JGFsetsize(size);
		JGFsetsize(0);

		//JGFInstrumentor.startTimer("Section3:RayTracer:Total");

		JGFinitialise();
		JGFapplication();
		JGFvalidate();
		JGFtidyup();

        /*
		JGFInstrumentor.stopTimer("Section3:RayTracer:Total");

		JGFInstrumentor.addOpsToTimer("Section3:RayTracer:Init", (double) numobjects);
		JGFInstrumentor.addOpsToTimer("Section3:RayTracer:Run", (double) (width*height));
		JGFInstrumentor.addOpsToTimer("Section3:RayTracer:Total", 1);

		JGFInstrumentor.printTimer("Section3:RayTracer:Init");
		JGFInstrumentor.printTimer("Section3:RayTracer:Run");
		JGFInstrumentor.printTimer("Section3:RayTracer:Total");
        */
	}
    // End of code brought from the other file 

	private Scene createScene() {
		final int x = 0;
		final int y = 0;

		Scene scene = new Scene(new View(new Vec(x, 20, -30, false),
					new Vec(x, y, 0, false),
					new Vec(0, 1, 0, false),
					1.0,
					35.0 * 3.14159265 / 180.0,
					1.0));

		/* create spheres */
		final int nx = 4;
		final int ny = 4;
		final int nz = 4;
		final region(:rank==3) reg = [0:nx-1,0:ny-1,0:nz-1];
		for (point(:rank==3)[i,j,k]:reg) {
		//for (int i = 0; i<nx; i++) {
			//for (int j = 0; j<ny; j++) {
			//	for (int k = 0; k<nz; k++) {
					double xx = 20.0 / (nx - 1) * i - 10.0;
					double yy = 20.0 / (ny - 1) * j - 10.0;
					double zz = 20.0 / (nz - 1) * k - 10.0;
					Sphere p = new Sphere(new Vec(xx,yy,zz, false), 3,
							new Surface(15.0, 1.5 - 1.0, 1.5 - 1.0,
								new Vec(0,0,(i+j)/(double) (nx+ny-2), false), false));
					// TODO: Change this
					scene.addObject(p);
				//}
			//}
		}

		/* Creates five lights for the scene */
		// TODO: Change this
		scene.addLight(new Light(100, 100, -50, 1.0));
		scene.addLight(new Light(-100, 100, -50, 1.0));
		scene.addLight(new Light(100, -100, -50, 1.0));
		scene.addLight(new Light(-100, -100, -50, 1.0));
		scene.addLight(new Light(200, 200, 0, 1.0));

		return scene;
	}

	public void setScene(Scene scene)
	{
		// Get the objects count
		
		//TODO: Change this
		int nLights = scene.getLights();
		int nObjects = scene.getObjects();
		dist(:rank==1) d1 = [0:nLights]->here;
		dist(:rank==1) d2 = [0:nObjects]->here;
		lights = new Light[d1];
		prim = new Sphere[d2];

		// Get the lights
		//TODO: Change this, let there be light!!!
		
		//for (int l = 0; l < nLights; l++) {
		for (point(:rank==1)[l] : [0:nLights-1]) {
			lights[l] = scene.getLight(l);
		}

		// Get the primitives
		//TODO: Change this, let there be object!!!
		//for (int o = 0; o < nObjects; o++) {
		for (point(:rank==1)[o] : [0:nObjects-1]) {
			prim[o] = scene.getObject(o);
		}

		// Set the view
		view = scene.getView();
	}

	public void render(final Interval interval)
	{

		//final int ub = (interval.width * (interval.yto-interval.yfrom))-1;
		final region(:rank==1) R = [0:(interval.width * (interval.yto-interval.yfrom))-1];
		final dist(:rank==1) DBlock = (dist(:rank==1))dist.factory.block(R);
		final dist(:rank==1) U = (dist(:rank==1))dist.UNIQUE;
		final int[:rank==1] row = new int[DBlock];

		checkSumArray = new long[U];
		finish ateach (point(:rank==1)[pl] : U) {
			final dist(:rank==1)  my_dist = DBlock | here;
			long checksum1 = 0;
			double frustrumwidth = view.distance * (Math.sin(view.angle)/Math.cos(view.angle));
			//double frustrumwidth = view.distance * Math.tan(view.angle);
			Vec viewVec = Vec.sub(view.at, view.from).normalized();
			Vec tmpVec = new Vec(viewVec, false).scale(Vec.dot(view.up, viewVec));
			Vec upVec = Vec.sub(view.up, tmpVec).normalized().scale(-frustrumwidth);
			Vec leftVec = Vec.cross(view.up, viewVec).normalized().scale(view.aspect * frustrumwidth);

			Ray r = new Ray(view.from, voidVec);

			for (point(:rank==1)[pixCounter] : my_dist.region) {
				int y = pixCounter / interval.width;
				int x = pixCounter % interval.width;
				double ylen = (double)(2.0 * y) / (double)interval.width - 1.0;
				double xlen = (double)(2.0 * x) / (double)interval.width - 1.0;
				r = r.d (Vec.comb(xlen, leftVec, ylen, upVec).added(viewVec).normalized());
                                // Bad place access in the next line, in the call:
				Vec col = trace(0, 1.0, r, new Isect(), new Ray());

				// computes the color of the ray
				int red = (int)(col.x * 255.0);
				if (red > 255) red = 255;
				int green = (int)(col.y * 255.0);
				if (green > 255) green = 255;
				int blue = (int)(col.z * 255.0);
				if (blue > 255) blue = 255;

				checksum1 += red + green + blue;
				// RGB values for .ppm file
				// Sets the pixels
				//row[pixCounter/*++*/] =  alpha | (red << 16) | (green << 8) | (blue);
			}
			final long checksumx = checksum1;
			finish async(place.FIRST_PLACE) {
				//atomic { checksum += checksumx; }
				//checksum += checksumx;
				checkSumArray[pl] = checksumx;
			}
		}
		final region(:rank==1) regSum = checkSumArray.distribution.region;
		for(point(:rank==1)[i]:regSum)
		{
			checksum += checkSumArray[i];
		}
	}

	private boolean intersect(Ray r, double maxt, Isect inter) {
		int nhits = 0;
		inter.t = 1e9;
                // Bad place access in the next line:
                final Scene ss = scene;
		for (point(:rank==1)[i] : [0:ss.getObjects()-1]) {
			// uses global temporary Prim (tp) as temp.object for speedup
			Isect tp = prim[i].intersect(r);
			if (!tp.isNull && tp.t < inter.t) {
				inter.t = tp.t;
				inter.prim = tp.prim;
				inter.surf = tp.surf;
				inter.enter = tp.enter;
				nhits++;
			}
		}
		return nhits > 0 ? true : false;
	}

	/**
	 * Checks if there is a shadow
	 * @param r The ray
	 * @return Returns 1 if there is a shadow, 0 if there isn't
	 */
	private int Shadow(Ray r, double tmax, Isect inter) {
		if (intersect(r, tmax, inter))
			return 0;
		return 1;
	}

	/**
	 * Return the Vector's reflection direction
	 * @return The specular direction
	 */
	private Vec SpecularDirection(Vec I, Vec N) {
		return Vec.comb(1.0/Math.abs(Vec.dot(I, N)), I, 2.0, N).normalized();
	}

	/**
	 * Return the Vector's transmission direction
	 */
	private Vec TransDir(Surface m1, Surface m2, Vec I, Vec N) {
		double n1 = m1.isNull ? 1.0 : m1.ior;
		double n2 = m2.isNull ? 1.0 : m2.ior;
		double eta = n1/n2;
		double c1 = -Vec.dot(I, N);
		double cs2 = 1.0 - eta * eta * (1.0 - c1 * c1);
		if (cs2 < 0.0) return new Vec(0.0,0.0,0.0,true);
		return Vec.comb(eta, I, eta * c1 - Math.sqrt(cs2), N).normalized();
	}

	/**
	 * Returns the shaded color
	 * @return The color in Vec form (rgb)
	 */
	private Vec shade(int level, double weight, Vec P, Vec N, Vec I, Isect hit, Ray tRay) {

		Surface surf = hit.surf;
		Vec bigr = new Vec();
		if (surf.shine > 1e-6) {
			bigr = SpecularDirection(I, N);
		}

		// Computes the effectof each light
		Vec col = new Vec();
		for (point(:rank==1)[l] : [0:scene.getLights()-1]) {
			//Vec tempVec = (Vec)lights[l].pos;
            //Nullable lights[l].pos  
            Vec L = Vec.sub((lights[l].pos), P);
			if (Vec.dot(N, L) >= 0.0) {
				L = L.normalized();
				double t = L.length();

				tRay.p = P;
				tRay.d = L;

				// Checks if there is a shadow
				if (Shadow(tRay, t, hit) > 0) {
					double diff = Vec.dot(N, L) * surf.kd *
						lights[l].brightness;

					col = col.addsdb(diff, surf.color);
					if (surf.shine > 1e-6) {
						double spec = Vec.dot(bigr, L);
						if (spec > 1e-6) {
							spec = Math.pow(spec, surf.shine);
							col = col.added(new Vec(spec,spec,spec,false));
						}
					}
				}
			} // if
		} // for

		tRay.p = P;
		if (surf.ks * weight > 1e-3) {
			tRay.d = SpecularDirection(I, N);
			Vec tcol = trace(level + 1, surf.ks * weight, tRay, hit, tRay);
			col = col.addsdb(surf.ks, tcol);
		}
		if (surf.kt * weight > 1e-3) {
			if (hit.enter > 0)
				tRay.d =  (TransDir(new Surface(0,0,0,new Vec(),true), surf, I, N));
			else
				tRay.d =  (TransDir(surf, new Surface(0,0,0,new Vec(),true), I, N));
			Vec tcol = trace(level + 1, surf.kt * weight, tRay, hit, tRay);
			col = col.addsdb(surf.kt, tcol);
		}
		// garbaging...
		// tcol = null;
		// surf = null;

		return col;
	}

	/**
	 * Launches a ray
	 */
	private Vec trace(int level, double weight, Ray r, Isect inter, Ray tRay) {
		// Checks the recursion level
		if (level > 6) {
			return new Vec();
		}

                // Bad place access in the next line, in the call:
		boolean hit = intersect(r, 1e6, inter);

		if (hit) {
			Vec P = r.rayPoint(inter.t);
			Vec N = inter.prim.normal(P);
			if (Vec.dot(r.d, N) >= 0.0) {
				N = N.negate();
			}
			return shade(level, weight, P, N, r.d, inter, tRay);
		}
		// no intersection --> col = 0,0,0
		return voidVec;
	}
}

