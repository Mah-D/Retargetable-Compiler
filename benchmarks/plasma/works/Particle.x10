/**
 *  A record that represents a particle.  A particle consists of the x 
 *  coordinate and y coordinate.  As well as a velocity in the x direction
 *  as well as in the y direction.  Particles are values so the fields are 
 *  immutable. 
 */
public value Particle {
    private final double x;
    private final double y;
    private final double xVel;
    private final double yVel;
    private final int pid;

    public Particle() {
	x = 0.0;
	y = 0.0;
	xVel = 0.0;
	yVel = 0.0;
	pid = -1;
    }

    public Particle(final double x, 
		    final double y, 
		    final double xVel, 
		    final double yVel) {
	this.x = x;
	this.y = y;
	this.xVel = xVel;
	this.yVel = yVel;
	pid = -1;
    }

    public Particle(final double x,
		    final double y,
		    final double xVel,
		    final double yVel,
		    final int pid) {
	this.x = x;
	this.y = y;
	this.xVel = xVel;
	this.yVel = yVel;
	this.pid = pid;
	
    }

    /**
     *  Retrieves the x coordinate of the particle.
     */
    public double getX() {
	return x;
    }

    /**
     *  Retrieves the y coordinate of the particle.
     */
    public double getY() {
	return y;
    }

    /**
     *  Retrieves the velocity in the x axis of the particle.
     */
    public double getXVel() {
	return xVel;
    }

    /**
     *  Retrieves the velocity in the y axis of the particle.
     */
    public double getYVel() {
	return yVel;
    }

    public Particle setX(double x) {
	return new Particle(x, y, xVel, yVel, pid);
    }

    public Particle setY(double y) {
	return new Particle(x, y, xVel, yVel, pid);
    }

    public Particle setXVel(double xVel) {
	return new Particle(x, y, xVel, yVel, pid);
    }

    public Particle setYVel(double yVel) {
	return new Particle(x, y, xVel, yVel, pid);
    }

    public Particle setPos(double x, double y) {
	return new Particle(x, y, xVel, yVel, pid);
    }

    public Particle setVel(double xVel, double yVel) {
	return new Particle(x, y, xVel, yVel, pid);
    }

    public String toString() {
	String result = (pid >= 0) ? "p" + pid : "";
	result += "(" + x + "," + y + "," + xVel + "," + yVel + ")";
	return result;
    }

    public boolean particleEquals(Particle p) {
	final double error = X10Util.ERROR; 
	    
	if (pid >= 0 && pid != p.pid) {
	    return false;
	} 
	return ((Math.abs(getX() - p.getX()) < error) &&
		(Math.abs(getY() - p.getY()) < error) &&
		(Math.abs(getXVel() - p.getXVel()) < error) &&
		(Math.abs(getYVel() - p.getYVel()) < error));
    }
}
