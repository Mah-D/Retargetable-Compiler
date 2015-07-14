package util.types;

public class X10Integer extends X10Long {
	
	public X10Integer() {
		super("int");
	}
	public X10Integer(String type)
	{
		super(type);
	}
	public boolean equals(Object o)
	{
		if(o instanceof X10Integer)return true;
		return false;
	}
}