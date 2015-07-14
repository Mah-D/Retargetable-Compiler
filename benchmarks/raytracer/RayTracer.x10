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
	
	private int lightCount;
	
	private int objCount;

	/**
	 * Lights for the rendering scene
	 */
	private Light value[:rank==1] lights;

	/**
	 * Objects (spheres) for the rendering scene
	 */
	private Sphere value[:rank==1] prim;

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

	private long[:rank==1] checkSumArray;
	private int size_t;

	private int numobjects;

    public RayTracer() {
    }


	/**
	 * Create and initialize the scene for the rendering picture.
	 * @return The scene just created
	 */
    // Code brought from the other file 
	public void JGFsetsize(final int size_t) {
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
		for (point(:rank==3) pp: reg) {
			double xx = 20.0 / (nx - 1) * pp[0] - 10.0;
			double yy = 20.0 / (ny - 1) * pp[1] - 10.0;
			double zz = 20.0 / (nz - 1) * pp[2] - 10.0;
			Sphere p = new Sphere(new Vec(xx,yy,zz, false), 3,
					new Surface(15.0, 1.5 - 1.0, 1.5 - 1.0,
						new Vec(0,0,(pp[0]+pp[1])/(double) (nx+ny-2), false), false));
			// TODO: Change this
			scene.addObject(p);
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

	public void setScene(final Scene scene)
	{
		// Get the objects count
		
		//TODO: Change this
		lightCount = scene.getLights();
		objCount = scene.getObjects();
		
		final Scene sc = scene;

				
		final dist(:rank==1) U = (dist(:rank==1))dist.UNIQUE;

                final int mylightCount = lightCount;
                final int myobjCount = objCount;

		finish ateach (point(:rank==1) pl: U) {

		  final place pHere = here;
	          region(:rank==1) d1 = [0:mylightCount-1];
    	          region(:rank==1) d2 = [0:myobjCount-1];

                  final Light value[:rank==1] templights = 
        	        (Light value[:rank==1]) new Light value[d1](point(:rank==1) l) {
				final dist(:rank==1) dTemp = [0:0]->pHere;
				final Light[:rank==1] temp = new Light[dTemp];
                                final point(:rank==1) temp_l = l;
				finish async(place.FIRST_PLACE) {
    		                   final Light tempLight = sc.getLight(temp_l);
			           async(pHere) { temp[0] = tempLight; }
				}
				return temp[0];
		  };
                  finish async(place.FIRST_PLACE) { lights = templights; }

                  final Sphere value[:rank==1] tempprim =
	                (Sphere value[:rank==1]) new Sphere value[d2](point(:rank==1) o) {
				final dist(:rank==1) dTemp1 = [0:0]->pHere;
                                final Sphere[:rank==1] temp1 = new Sphere[dTemp1];
                                final point(:rank==1) temp_o = o;
				finish async(place.FIRST_PLACE) {
                                       final Sphere tempObject = sc.getObject(temp_o);
				       async(pHere) { temp1[0] = tempObject; }
            	                }	
				return temp1[0];
		  };
                  finish async(place.FIRST_PLACE) { prim = tempprim; }

			/*lights = new Light value[d1];
			prim = new Sphere value[d2];

 
			// Get the lights
			for (point(:rank==1) l: [0:lightCount-1]) {
				finish async(place.FIRST_PLACE)
				{
					final Light temp = sc.getLight(l);
                                        final point(:rank==1) temp_l = l;
					async(pHere)
					{
						lights[temp_l] = temp;
					}
				}
			}
	
			// Get the primitives
			for (point(:rank==1) o: [0:objCount-1]) {
				finish async(place.FIRST_PLACE)
				{
					final Sphere temp1 = sc.getObject(o);
					async(pHere)
					{
						prim[o] = temp1;
					}
				}
			}*/
		}

		// Set the view
		view = scene.getView();

	}

	public void render(final Interval interval) {

		//final int ub = (interval.width * (interval.yto-interval.yfrom))-1;
		final region(:rank==1) R = [0:(interval.width * (interval.yto-interval.yfrom))-1];
		final dist(:rank==1) DBlock = (dist(:rank==1))dist.factory.block(R);
		final dist(:rank==1) U = (dist(:rank==1))dist.UNIQUE;
		final int[:rank==1] row = new int[DBlock];

		/**********************************************************/
		final region(:rank==1) chkSumReg = U.region;
		final place pHere = here;
		final place fp = place.FIRST_PLACE;
		final dist(:rank==1) chkSumDist = chkSumReg->fp;
		checkSumArray = new long[chkSumDist];
		/**********************************************************/		

                final View myview = view; 

		finish ateach (point(:rank==1) pl: U) {
			final dist(:rank==1)  my_dist = DBlock | here;

			long checksum1 = 0;
			double frustrumwidth = myview.distance * (Math.sin(myview.angle)/Math.cos(myview.angle));
			//double frustrumwidth = myview.distance * Math.tan(myview.angle);
			Vec viewVec = Vec.sub(myview.at, myview.from).normalized();
			Vec tmpVec = new Vec(viewVec, false).scale(Vec.dot(myview.up, viewVec));
			Vec upVec = Vec.sub(myview.up, tmpVec).normalized().scale(-frustrumwidth);
			Vec leftVec = Vec.cross(myview.up, viewVec).normalized().scale(myview.aspect * frustrumwidth);

			Ray r = new Ray(myview.from, voidVec);

			for (point(:rank==1) pixCounter: my_dist.region) {

				int y = pixCounter[0] / interval.width;
				int x = pixCounter[0] % interval.width;

				double ylen = (double)(2.0 * y) / (double)interval.width - 1.0;
				double xlen = (double)(2.0 * x) / (double)interval.width - 1.0;

				r = r.d (Vec.comb(xlen, leftVec, ylen, upVec).added(viewVec).normalized());
				Vec col = trace(0, 1.0, r, new Isect(), new Ray());

				// computes the color of the ray
				int red = (int)(col.x * 255.0);
				if (red > 255) red = 255;
				int green = (int)(col.y * 255.0);
				if (green > 255) green = 255;
				int blue = (int)(col.z * 255.0);
				if (blue > 255) blue = 255;

				checksum1 = checksum1 + red + green + blue;
				// RGB values for .ppm file
				// Sets the pixels
				//row[pixCounter/*++*/] =  alpha | (red << 16) | (green << 8) | (blue);
			}
			final long checksumx = checksum1;
			finish async(fp) {
				//atomic { checksum = checksum + checksumx; }
				//checksum += checksumx;
				checkSumArray[pl] = checksumx;
			}
		}
		
		final region(:rank==1) regSum = checkSumArray.distribution.region;
		for(point(:rank==1) i:chkSumReg)
		{
			checksum = checksum + checkSumArray[i];
		}
	}

	private boolean intersect(final Ray r, final double maxt, final Isect inter) {
		int nhits = 0;
		inter.t = 1e9;

                final place h = here;
                final dist(:rank==1) dTemp = [0:0]->here;
                final Envelope[:rank==1] temp = new Envelope[dTemp];
                finish async(place.FIRST_PLACE) {
                   final int tempobjCount = objCount;
                   final Sphere value[:rank==1] tempprim = prim;
                   async(h) { 
                     temp[0] = new Envelope(tempobjCount, tempprim);
                   }
                }
                final int myobjCount                = temp[0].i;
                final Sphere value[:rank==1] myprim = (Sphere value[:rank==1]) (temp[0].a);

		for (point(:rank==1) i: [0:myobjCount-1]) {
		    // uses global temporary Prim (tp) as temp.object for speedup

		    Isect tp = myprim[i].intersect(r);
 
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
	private int Shadow(final Ray r, final double tmax, final Isect inter) {
		if (intersect(r, tmax, inter))
			return 0;
		return 1;
	}

	/**
	 * Return the Vector's reflection direction
	 * @return The specular direction
	 */
	private Vec SpecularDirection(final Vec I, final Vec N) {
		return Vec.comb(1.0/Math.abs(Vec.dot(I, N)), I, 2.0, N).normalized();
	}

	/**
	 * Return the Vector's transmission direction
	 */
	private Vec TransDir(final Surface m1, final Surface m2, final Vec I, final Vec N) {
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
	private Vec shade(final int level, final double weight, final Vec P, final Vec N, final Vec I, final Isect hit, final Ray tRay) {

	    Surface surf = hit.surf;
	    Vec bigr = new Vec();
	    if (surf.shine > 1e-6) {
	    	bigr = SpecularDirection(I, N);
	    }

            final place h = here;
            final dist(:rank==1) dTemp = [0:0]->here;
            final Envelope2[:rank==1] temp = new Envelope2[dTemp];
            finish async(place.FIRST_PLACE) {
               final int templightCount = lightCount;
               final Light value[:rank==1] templights = lights;
               async(h) { 
                 temp[0] = new Envelope2(templightCount, templights);
               }
            }
            final int mylightCount                = temp[0].i;
            final Light value[:rank==1] mylights = (Light value[:rank==1]) (temp[0].a);

	    // Computes the effect of each light
	    Vec col = new Vec();
	    for (point(:rank==1) l: [0:mylightCount-1]) {
		// Vec tempVec = lights[l].pos;
                //Nullable lights[l].pos  
                Vec L = Vec.sub(mylights[l].pos, P);
		if (Vec.dot(N, L) >= 0.0) {
			L = L.normalized();
			double t = L.length();

			tRay.p = P;
			tRay.d = L;

			// Checks if there is a shadow
			if (Shadow(tRay, t, hit) > 0) {
				double diff = Vec.dot(N, L) * surf.kd *
					mylights[l].brightness;

				col = col.adds2(diff, surf.color);
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
	       col = col.adds2(surf.ks, tcol);
	    }
	    if (surf.kt * weight > 1e-3) {
	       if (hit.enter > 0)
	     	  tRay.d = TransDir(new Surface(0,0,0,new Vec(),true), surf, I, N);
	       else {
	          tRay.d = TransDir(surf, new Surface(0,0,0,new Vec(),true), I, N);
               }
	       Vec tcol = trace(level + 1, surf.kt * weight, tRay, hit, tRay);
	       col = col.adds2(surf.kt, tcol);
	    }
	    // garbaging...
	    // tcol = null;
	    // surf = null;

	    return col;
	}

	/**
	 * Launches a ray
	 */
	private Vec trace(final int level, final double weight, final Ray r, final Isect inter, final Ray tRay) {
     
		// Checks the recursion level
		if (level > 6) {
			return new Vec();
		}
                
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

