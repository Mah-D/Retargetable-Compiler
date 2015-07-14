value Envelope2 {
	public final int i;
	public final Light value[:rank==1] a;
	public Envelope2(final int i1, final Light value[:rank==1] a1) {
		i = i1;
		a = a1;
	}
	public String toString() {
		return "";
	}
}

class Ray {
	public Vec p;
	public Vec d;
	public Ray(final Vec pnt, final Vec dir) {
		p = new Vec(pnt.x, pnt.y, pnt.z, false);
		d = new Vec(dir.x, dir.y, dir.z, false).normalized();
	}
	public Ray(final Vec pnt, final Vec dir, final boolean normalize) {
		if(normalize) {
			p = new Vec(pnt.x, pnt.y, pnt.z, false);
			d = new Vec(dir.x, dir.y, dir.z, false).normalized();
		}
		else{
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
		return new Vec(p.x + d.x * t, p.y + d.y * t, p.z + d.z * t, false);
	}
	public String toString() {
		return " { " + p.toString() + "->" + d.toString() + " } ";
	}
}

public class RayTracerMain {
	public static void main(String[] args) {
{
			Timer tmr = new Timer();
			int count = 0;
			tmr.start(count);
			new RayTracer().run();
			tmr.stop(count);
			System.out.println("Wall-clock time for raytracer: " + tmr.readTimer(count) + " secs");
		}
	}
}

value Envelope {
	public final int i;
	public final Sphere value[:rank==1] a;
	public Envelope(final int i1, final Sphere value[:rank==1] a1) {
		i = i1;
		a = a1;
	}
	public String toString() {
		return "";
	}
}

value Light {
	public final Vec pos;
	public final double brightness;
	public Light(final double x, final double y, final double z, final double b) {
		pos = new Vec(x, y, z, false);
		brightness = b;
	}
	public String toString() {
		return pos + " " + brightness;
	}
}

value Sphere {
	private final Vec c;
	private final double r;
	private final double r2;
	public final Surface surf;
	public Sphere(final Vec center, final double radius, final Surface s) {
		surf = s;
		c = center;
		r = radius;
		r2 = radius * radius;
	}
	public Sphere(final Vec center, final double radius) {
		c = center;
		r = radius;
		r2 = radius * radius;
		surf = new Surface();
	}
	public Isect intersect(final Ray ry) {
		Vec v = Vec.sub(c, ry.p);
		double b = Vec.dot(v, ry.d);
		double disc = b * b - Vec.dot(v, v) + r2;
		if(disc < 0.0) {
			return new Isect(0.0, 0, true, this, surf);
		}
		disc = Math.sqrt(disc);
		double t = (b - disc < 1e-6)? b + disc : b - disc;
		if(t < 1e-6) {
			return new Isect(0.0, 0, true, this, surf);
		}
		Isect ip = new Isect(t, Vec.dot(v, v) > r2 + 1e-6? 1 : 0, false, this, surf);
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

value Vec {
	public final double x;
	public final double y;
	public final double z;
	public final boolean isNull;
	public Vec(final double a, final double b, final double c, final boolean isNull_) {
		x = a;
		y = b;
		z = c;
		isNull = isNull_;
	}
	public Vec(final Vec a, final boolean isNull_) {
		x = a.x;
		y = a.y;
		z = a.z;
		isNull = isNull_;
	}
	public Vec() {
		x = 0.0;
		y = 0.0;
		z = 0.0;
		isNull = false;
	}
	public Vec added(final Vec a) {
		return new Vec(x + a.x, y + a.y, z + a.z, false);
	}
	public static Vec adds3(final double s, final Vec a, final Vec b) {
		return new Vec(s * a.x + b.x, s * a.y + b.y, s * a.z + b.z, false);
	}
	public Vec adds2(final double s, final Vec b) {
		return new Vec(x + s * b.x, y + s * b.y, z + s * b.z, false);
	}
	public static Vec sub(final Vec a, final Vec b) {
		return new Vec(a.x - b.x, a.y - b.y, a.z - b.z, false);
	}
	public static Vec mult(final Vec a, final Vec b) {
		return new Vec(a.x * b.x, a.y * b.y, a.z * b.z, false);
	}
	public static Vec cross(final Vec a, final Vec b) {
		return new Vec(a.y * b.z - a.z * b.y, a.z * b.x - a.x * b.z, a.x * b.y - a.y * b.x, false);
	}
	public static double dot(final Vec a, final Vec b) {
		return a.x * b.x + a.y * b.y + a.z * b.z;
	}
	public static Vec comb(final double a, final Vec A, final double b, final Vec B) {
		return new Vec(a * A.x + b * B.x, a * A.y + b * B.y, a * A.z + b * B.z, false);
	}
	public Vec scale(final double t) {
		return new Vec(x * t, y * t, z * t, false);
	}
	public Vec negate() {
		return new Vec(-x, -y, -z, false);
	}
	public Vec normalized() {
		double len = Math.sqrt(x * x + y * y + z * z);
		return (len > 0.0)? new Vec(x / len, y / len, z / len, false) : this;
	}
	public double length() {
		return Math.sqrt(x * x + y * y + z * z);
	}
	public String toString() {
		return "<" + x + "," + y + "," + z + ">";
	}
}

class Scene {
	public static final int maxObjects = 64;
	public static final int maxLights = 5;
	public final Light[:rank==1] lights;
	public final Sphere[:rank==1] objects;
	private final View view;
	private int lightCount;
	private int objectCount;
	public Scene(final View v) {
		dist(:rank==1) d1 = [0 : maxLights - 1] -> here;
		lights = getLightArray(d1);
		dist(:rank==1) d2 = [0 : maxObjects - 1] -> here;
		objects = getSphereArray(d2);
		view = v;
		lightCount = 0;
		objectCount = 0;
	}
	public Light[:rank==1] getLightArray(final dist(:rank==1) d) {
		return new Light[d];
	}
	public Sphere[:rank==1] getSphereArray(final dist(:rank==1) d) {
		return new Sphere[d];
	}
	public void addLight(final Light l) {
		if(lightCount > maxLights - 1) {
			throw new RuntimeException("Only " + maxLights + " lights allowed");
		}
		this.lights[lightCount] = l;
		lightCount = lightCount + 1;
	}
	public void addObject(final Sphere object) {
		if(objectCount > maxObjects - 1) {
			throw new RuntimeException("Only " + maxObjects + " objects allowed");
		}
		this.objects[objectCount] = object;
		objectCount = objectCount + 1;
	}
	public View getView() {
		return this.view;
	}
	public Light getLight(final point(:rank==1) number) {
		return this.lights[number];
	}
	public Sphere getObject(final point(:rank==1) number) {
		return this.objects[number];
	}
	public int getLights() {
		return this.lightCount;
	}
	public int getObjects() {
		return this.objectCount;
	}
}

class Timer {
	public static final int max_counters = 64;
	private double[:rank==1] start_time;
	private double[:rank==1] elapsed_time;
	private double[:rank==1] total_time;
	public Timer() {
		final dist(:rank==1) d = [0 : max_counters] -> place.FIRST_PLACE;
		start_time = new double[d](point(:rank==1)p) {
			return 0;
		};
		elapsed_time = new double[d](point(:rank==1)p) {
			return 0;
		};
		total_time = new double[d](point(:rank==1)p) {
			return 0;
		};
	}
	public void start(final int n) {
		start_time[n] = System.currentTimeMillis();
	}
	public void stop(final int n) {
		elapsed_time[n] = System.currentTimeMillis() - start_time[n];
		elapsed_time[n] = elapsed_time[n] / 1000;
		total_time[n] = total_time[n] + elapsed_time[n];
	}
	public double readTimer(final int n) {
		return total_time[n];
	}
	public void resetTimer(final int n) {
		total_time[n] = 0;
		start_time[n] = 0;
		elapsed_time[n] = 0;
	}
	public void resetAllTimers() {
		int i = 0;
		while(i < max_counters){
			resetTimer(i);
			i++;
		}
	}
}

class RayTracer {
	private Scene scene;
	private int lightCount;
	private int objCount;
	private Light value[:rank==1] lights;
	private Sphere value[:rank==1] prim;
	private View view;
	private static final int alpha = 255 << 24;
	private static final Vec voidVec = new Vec();
	private int height;
	private int width;
	private int[:rank==1] datasizes;
	private long checksum;
	private long[:rank==1] checkSumArray;
	private int size_t;
	private int numobjects;
	public RayTracer() {
	}
	public void JGFsetsize(final int size_t) {
		checksum = 0;
		dist(:rank==1) d1 = [0 : 1] -> here;
		datasizes = new int[d1];
		datasizes[0] = 20;
		datasizes[1] = 500;
		this.size_t = size_t;
	}
	public void JGFinitialise() {
		width = datasizes[size_t];
		height = datasizes[size_t];
		scene = createScene();
		setScene(scene);
		numobjects = scene.getObjects();
	}
	public void JGFapplication() {
		Interval interval = new Interval(0, width, height, 0, height, 1);
		render(interval);
	}
	public void JGFvalidate() {
		dist(:rank==1) d1 = [0 : 1] -> here;
		long[:rank==1] refval = new long[d1];
		refval[0] = 51428;
		refval[1] = 29827635;
		long dev = checksum - refval[size_t];
		if(dev != 0) {
			System.out.println("Validation failed");
			System.out.println("Pixel checksum = " + checksum);
			System.out.println("Reference value = " + refval[size_t]);
			throw new RuntimeException("Validation failed");
		}
	}
	public void JGFtidyup() {
	}
	public void run() {
		JGFsetsize(0);
		JGFinitialise();
		JGFapplication();
		JGFvalidate();
		JGFtidyup();
	}
	private Scene createScene() {
		final int x = 0;
		final int y = 0;
		Scene scene = new Scene(new View(new Vec(x, 20, -30, false), new Vec(x, y, 0, false), new Vec(0, 1, 0, false), 1.0, 35.0 * 3.14159265 / 180.0, 1.0));
		final int nx = 4;
		final int ny = 4;
		final int nz = 4;
		final region(:rank==3) reg = [0 : nx - 1, 0 : ny - 1, 0 : nz - 1];
		for(point(:rank==3) pp : reg){
			double xx = 20.0 / (nx - 1) * pp[0] - 10.0;
			double yy = 20.0 / (ny - 1) * pp[1] - 10.0;
			double zz = 20.0 / (nz - 1) * pp[2] - 10.0;
			Sphere p = new Sphere(new Vec(xx, yy, zz, false), 3, new Surface(15.0, 1.5 - 1.0, 1.5 - 1.0, new Vec(0, 0, (pp[0] + pp[1]) / (double)(nx + ny - 2), false), false));
			scene.addObject(p);
		}
		scene.addLight(new Light(100, 100, -50, 1.0));
		scene.addLight(new Light(-100, 100, -50, 1.0));
		scene.addLight(new Light(100, -100, -50, 1.0));
		scene.addLight(new Light(-100, -100, -50, 1.0));
		scene.addLight(new Light(200, 200, 0, 1.0));
		return scene;
	}
	public void setScene(final Scene scene) {
		lightCount = scene.getLights();
		objCount = scene.getObjects();
		final Scene sc = scene;
		final dist(:rank==1) U = (dist(:rank==1))dist.UNIQUE;
		final int mylightCount = lightCount;
		final int myobjCount = objCount;
		finish
			ateach(point(:rank==1) pl : U){
				final place pHere = here;
				region(:rank==1) d1 = [0 : mylightCount - 1];
				region(:rank==1) d2 = [0 : myobjCount - 1];
				final Light value[:rank==1] templights = (Light value[:rank==1])new Light value[d1](point(:rank==1)l) {
					final dist(:rank==1) dTemp = [0 : 0] -> pHere;
					final Light[:rank==1] temp = new Light[dTemp];
					final point(:rank==1) temp_l = l;
					finish
						async(place.FIRST_PLACE) {
							final Light tempLight = sc.getLight(temp_l);
							async(pHere) {
								temp[0] = tempLight;
							}
						}
					return temp[0];
				};
				finish
					async(place.FIRST_PLACE) {
						lights = templights;
					}
				final Sphere value[:rank==1] tempprim = (Sphere value[:rank==1])new Sphere value[d2](point(:rank==1)o) {
					final dist(:rank==1) dTemp1 = [0 : 0] -> pHere;
					final Sphere[:rank==1] temp1 = new Sphere[dTemp1];
					final point(:rank==1) temp_o = o;
					finish
						async(place.FIRST_PLACE) {
							final Sphere tempObject = sc.getObject(temp_o);
							async(pHere) {
								temp1[0] = tempObject;
							}
						}
					return temp1[0];
				};
				finish
					async(place.FIRST_PLACE) {
						prim = tempprim;
					}
			}
		view = scene.getView();
	}
	public void render(final Interval interval) {
		final region(:rank==1) R = [0 : (interval.width * (interval.yto - interval.yfrom)) - 1];
		final dist(:rank==1) DBlock = (dist(:rank==1))dist.factory.block(R);
		final dist(:rank==1) U = (dist(:rank==1))dist.UNIQUE;
		final int[:rank==1] row = new int[DBlock];
		final region(:rank==1) chkSumReg = U.region;
		final place pHere = here;
		final place fp = place.FIRST_PLACE;
		final dist(:rank==1) chkSumDist = chkSumReg -> fp;
		checkSumArray = new long[chkSumDist];
		final View myview = view;
		finish
			ateach(point(:rank==1) pl : U){
				final dist(:rank==1) my_dist = DBlock | here;
				long checksum1 = 0;
				double frustrumwidth = myview.distance * (Math.sin(myview.angle) / Math.cos(myview.angle));
				Vec viewVec = Vec.sub(myview.at, myview.from).normalized();
				Vec tmpVec = new Vec(viewVec, false).scale(Vec.dot(myview.up, viewVec));
				Vec upVec = Vec.sub(myview.up, tmpVec).normalized().scale(-frustrumwidth);
				Vec leftVec = Vec.cross(myview.up, viewVec).normalized().scale(myview.aspect * frustrumwidth);
				Ray r = new Ray(myview.from, voidVec);
				for(point(:rank==1) pixCounter : my_dist.region){
					int y = pixCounter[0] / interval.width;
					int x = pixCounter[0] % interval.width;
					double ylen = (double)(2.0 * y) / (double)interval.width - 1.0;
					double xlen = (double)(2.0 * x) / (double)interval.width - 1.0;
					r = r.d(Vec.comb(xlen, leftVec, ylen, upVec).added(viewVec).normalized());
					Vec col = trace(0, 1.0, r, new Isect(), new Ray());
					int red = (int)(col.x * 255.0);
					if(red > 255)
						red = 255;
					int green = (int)(col.y * 255.0);
					if(green > 255)
						green = 255;
					int blue = (int)(col.z * 255.0);
					if(blue > 255)
						blue = 255;
					checksum1 = checksum1 + red + green + blue;
				}
				final long checksumx = checksum1;
				finish
					async(fp) {
						checkSumArray[pl] = checksumx;
					}
			}
		final region(:rank==1) regSum = checkSumArray.distribution.region;
		for(point(:rank==1) i : chkSumReg){
			checksum = checksum + checkSumArray[i];
		}
	}
	private boolean intersect(final Ray r, final double maxt, final Isect inter) {
		int nhits = 0;
		inter.t = 1e9;
		final place h = here;
		final dist(:rank==1) dTemp = [0 : 0] -> here;
		final Envelope[:rank==1] temp = new Envelope[dTemp];
		finish
			async(place.FIRST_PLACE) {
				final int tempobjCount = objCount;
				final Sphere value[:rank==1] tempprim = prim;
				async(h) {
					temp[0] = new Envelope(tempobjCount, tempprim);
				}
			}
		final int myobjCount = temp[0].i;
		final Sphere value[:rank==1] myprim = (Sphere value[:rank==1])(temp[0].a);
		for(point(:rank==1) i : [0 : myobjCount - 1]){
			Isect tp = myprim[i].intersect(r);
			if(!tp.isNull && tp.t < inter.t) {
				inter.t = tp.t;
				inter.prim = tp.prim;
				inter.surf = tp.surf;
				inter.enter = tp.enter;
				nhits++;
			}
		}
		return nhits > 0? true : false;
	}
	private int Shadow(final Ray r, final double tmax, final Isect inter) {
		if(intersect(r, tmax, inter))
			return 0;
		return 1;
	}
	private Vec SpecularDirection(final Vec I, final Vec N) {
		return Vec.comb(1.0 / Math.abs(Vec.dot(I, N)), I, 2.0, N).normalized();
	}
	private Vec TransDir(final Surface m1, final Surface m2, final Vec I, final Vec N) {
		double n1 = m1.isNull? 1.0 : m1.ior;
		double n2 = m2.isNull? 1.0 : m2.ior;
		double eta = n1 / n2;
		double c1 = -Vec.dot(I, N);
		double cs2 = 1.0 - eta * eta * (1.0 - c1 * c1);
		if(cs2 < 0.0)
			return new Vec(0.0, 0.0, 0.0, true);
		return Vec.comb(eta, I, eta * c1 - Math.sqrt(cs2), N).normalized();
	}
	private Vec shade(final int level, final double weight, final Vec P, final Vec N, final Vec I, final Isect hit, final Ray tRay) {
		Surface surf = hit.surf;
		Vec bigr = new Vec();
		if(surf.shine > 1e-6) {
			bigr = SpecularDirection(I, N);
		}
		final place h = here;
		final dist(:rank==1) dTemp = [0 : 0] -> here;
		final Envelope2[:rank==1] temp = new Envelope2[dTemp];
		finish
			async(place.FIRST_PLACE) {
				final int templightCount = lightCount;
				final Light value[:rank==1] templights = lights;
				async(h) {
					temp[0] = new Envelope2(templightCount, templights);
				}
			}
		final int mylightCount = temp[0].i;
		final Light value[:rank==1] mylights = (Light value[:rank==1])(temp[0].a);
		Vec col = new Vec();
		for(point(:rank==1) l : [0 : mylightCount - 1]){
			Vec L = Vec.sub(mylights[l].pos, P);
			if(Vec.dot(N, L) >= 0.0) {
				L = L.normalized();
				double t = L.length();
				tRay.p = P;
				tRay.d = L;
				if(Shadow(tRay, t, hit) > 0) {
					double diff = Vec.dot(N, L) * surf.kd * mylights[l].brightness;
					col = col.adds2(diff, surf.color);
					if(surf.shine > 1e-6) {
						double spec = Vec.dot(bigr, L);
						if(spec > 1e-6) {
							spec = Math.pow(spec, surf.shine);
							col = col.added(new Vec(spec, spec, spec, false));
						}
					}
				}
			}
		}
		tRay.p = P;
		if(surf.ks * weight > 1e-3) {
			tRay.d = SpecularDirection(I, N);
			Vec tcol = trace(level + 1, surf.ks * weight, tRay, hit, tRay);
			col = col.adds2(surf.ks, tcol);
		}
		if(surf.kt * weight > 1e-3) {
			if(hit.enter > 0)
				tRay.d = TransDir(new Surface(0, 0, 0, new Vec(), true), surf, I, N);
			else{
				tRay.d = TransDir(surf, new Surface(0, 0, 0, new Vec(), true), I, N);
			}
			Vec tcol = trace(level + 1, surf.kt * weight, tRay, hit, tRay);
			col = col.adds2(surf.kt, tcol);
		}
		return col;
	}
	private Vec trace(final int level, final double weight, final Ray r, final Isect inter, final Ray tRay) {
		if(level > 6) {
			return new Vec();
		}
		boolean hit = intersect(r, 1e6, inter);
		if(hit) {
			Vec P = r.rayPoint(inter.t);
			Vec N = inter.prim.normal(P);
			if(Vec.dot(r.d, N) >= 0.0) {
				N = N.negate();
			}
			return shade(level, weight, P, N, r.d, inter, tRay);
		}
		return voidVec;
	}
}

value Surface {
	public final Vec color;
	public final double kd;
	public final double ks;
	public final double shine;
	public final double kt;
	public final double ior;
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

value Interval {
	public final int number;
	public final int width;
	public final int height;
	public final int yfrom;
	public final int yto;
	public final int total;
	public Interval(final int number_, final int width_, final int height_, final int yfrom_, final int yto_, final int total_) {
		number = number_;
		width = width_;
		height = height_;
		yfrom = yfrom_;
		yto = yto_;
		total = total_;
	}
	public String toString() {
		return number + " " + width + " " + height + " " + yfrom + " " + yto + " " + total;
	}
}

class Isect {
	public double t;
	public int enter;
	public Sphere prim;
	public Surface surf;
	public boolean isNull;
	public Isect() {
		t = 0.0;
		enter = 0;
		isNull = false;
	}
	public Isect(final double t_, final int enter_, final boolean isNull_, final Sphere prim_, final Surface surf_) {
		t = t_;
		isNull = isNull_;
		enter = enter_;
		prim = prim_;
		surf = surf_;
	}
}

value View {
	public final Vec from;
	public final Vec at;
	public final Vec up;
	public final double distance;
	public final double angle;
	public final double aspect;
	public View(final Vec from_, final Vec at_, final Vec up_, final double dist_, final double angle_, final double aspect_) {
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

