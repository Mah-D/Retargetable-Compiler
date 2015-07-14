package util.types;

public class X10String extends X10Type {
	public X10String() {
		super("String");
	}
	public boolean equals(Object o)
	{
		if(o instanceof X10String)return true;
		return false;
	}
}