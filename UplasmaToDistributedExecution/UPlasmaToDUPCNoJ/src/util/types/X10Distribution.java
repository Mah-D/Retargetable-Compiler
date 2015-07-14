package util.types;



public class X10Distribution extends X10Type{
	public int value = -1;
	public X10Distribution() {
		super("Distribution");
	}
	public X10Distribution(int value)
	{
		super("Distribution");
		this.value = value;
	}
	public X10Distribution(String type)
	{
		super(type);
	}
	public boolean equals(Object o)
	{
		if(o instanceof X10Distribution)return true;
		return false;
	}
	public String getFlatTypeName()
	{
		return "int";
	}
}