package util.types;

public abstract class X10Type {
	public String typeName; // For storing the name of the type
	public boolean isArrayValue = false;
	public boolean isArrayUpdate = false;
	public X10Type(String typeName) {
		this.typeName = typeName;
	}

	public String toString() {
		return typeName;
	}

	public String getTypeName()
	{
		return typeName;
	}
	
	public String getFlatTypeName()
	{
		return typeName;
	}
}