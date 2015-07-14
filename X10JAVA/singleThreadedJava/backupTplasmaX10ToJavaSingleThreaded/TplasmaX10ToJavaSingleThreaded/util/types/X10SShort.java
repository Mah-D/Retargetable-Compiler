package util.types;

public class X10SShort extends X10Short {
	public X10SShort() {
		super("short");
	}
	
	public X10SShort(String type)
	{
		super(type);
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof X10SShort || o instanceof X10Byte)return true;
		return false;
	}
}