package util.types;



public class X10Point extends X10Type{
	public int value = -1;
	public X10Point() {
		super("Point");
	}
	public X10Point(int value)
	{
		super("Point");
		this.value = value;
	}
	public X10Point(String type)
	{
		super(type);
	}
	public boolean equals(Object o)
	{
		if(o instanceof X10Point)return true;
		return false;
	}
}