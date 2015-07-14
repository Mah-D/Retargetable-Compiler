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
// import java.util.Vector; // Changed

public class Scene {
	
	//TODO: Change this
	public static final int maxObjects = 64;
	public static final int maxLights = 5;
	public final Light[:rank==1] lights;
	public final Sphere[:rank==1] objects;
	private final View view;
	private int lightCount;
	private int objectCount;

	public Scene (View v)
	{
		//TODO: Change this
		dist(:rank==1) d1 = [0:maxLights-1]->here;
		lights = new Light[d1];
		dist(:rank==1) d2 = [0:maxObjects-1]->here;
		objects = new Sphere[d2];
		view = v;
		lightCount = 0;
		objectCount = 0;
	}

	//TODO: Change this
	//public void addLight(Light l)
	public void addLight(Light l)
	{
		//this.lights.addElement(l);
		if(lightCount>maxLights-1)
		{  
			throw new RuntimeException("Only " + maxLights +" lights allowed");
		}
		this.lights[lightCount++] = l;
		//lightCount = lightCount + 1;		
	}

	//TODO: Change this
	//public void addObject(Sphere object)
	public void addObject(Sphere object)
	{
		//this.objects.addElement(object);
		if(objectCount>maxObjects-1)
		{   
			throw new RuntimeException("Only " + maxObjects +" objects allowed");
        }
		this.objects[objectCount++] = object;
		//objectCount = objectCount + 1;
	}

	public View getView()
	{
		return this.view;
	}

	//TODO: Change this
	public Light getLight(int number)
	{
		return this.lights[number];
	}

	//TODO: Change this
	public Sphere getObject(int number)
	{
		return this.objects[number];
	}

	//TODO: Change this
	public int getLights()
	{
		return this.lightCount;
	}

	//TODO: Change this
	public int getObjects()
	{
		return this.objectCount;
	}

	/*public void setObject(Sphere object, int pos)
	{
		this.objects.setElementAt(object, pos);
	}*/
}
