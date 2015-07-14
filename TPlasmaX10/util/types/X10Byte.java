package util.types;

public class X10Byte extends X10Short {
	public X10Byte() {
		super("byte");
	}
	
	public X10Byte(String type)
	{
		super(type);
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof X10Byte)return true;
		return false;
	}
}