package util.types;

public class X10Char extends X10Short {
	public X10Char() {
		super("char");
	}
	
	public X10Char(String type)
	{
		super(type);
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof X10Char || o instanceof X10Byte)return true;
		return false;
	}
}