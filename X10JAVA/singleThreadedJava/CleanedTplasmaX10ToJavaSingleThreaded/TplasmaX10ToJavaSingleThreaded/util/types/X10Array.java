package util.types;

public abstract class X10Array extends X10Type {
	public int rank;
	public X10Type arrayElementType;
	public X10Array(String typeName) {
		super(typeName);
	}
	/*public boolean equals(Object o)
	{
		if(!(o instanceof X10Array)) return false;
		return true; 
	}*/
}