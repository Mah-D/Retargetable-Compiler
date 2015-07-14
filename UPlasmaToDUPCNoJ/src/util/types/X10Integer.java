package util.types;

public class X10Integer extends X10Long {
	public int value = -1;
	public X10Integer() {
		//super("int");
		super("int32_t");
	}
	public X10Integer(int value)
	{
		super("int32_t");
		//super("int");
		this.value = value;
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