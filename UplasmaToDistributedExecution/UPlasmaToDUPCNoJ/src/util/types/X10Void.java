package util.types;

public class X10Void extends X10Type {
	public X10Void() {
		super("void");
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof X10Void)return true;
		return false;
	}
}
