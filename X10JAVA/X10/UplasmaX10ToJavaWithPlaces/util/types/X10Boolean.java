package util.types;

public class X10Boolean extends X10Type {
	public X10Boolean() {
		super("boolean");
	}
	public boolean equals(Object o)
	{
		if(o instanceof X10Boolean)return true;
		return false;
	}
}