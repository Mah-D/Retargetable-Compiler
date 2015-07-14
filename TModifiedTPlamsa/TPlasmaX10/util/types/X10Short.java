package util.types;

public abstract class X10Short extends X10Integer {
	
	public X10Short(String type)
	{
		super(type);
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof X10Short)return true;
		return false;
	}
}