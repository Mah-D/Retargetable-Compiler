package util.types;



public class X10Region extends X10Type{
	public int value = -1;
	public X10Region() {
		super("Region");
	}
	public X10Region(int value)
	{
		super("Region");
		this.value = value;
	}
	public X10Region(String type)
	{
		super(type);
	}
	public boolean equals(Object o)
	{
		if(o instanceof X10Region)return true;
		return false;
	}
	public String getFlatTypeName()
	{
		return "int";
	}
}