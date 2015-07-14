package util.types;

public class X10Long extends X10Double {
	public X10Long() {
		//super("long");
		super("int64_t");
	}
	public X10Long(String type)
	{
		super(type);
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof X10Long)return true;
		return false;
	}
}