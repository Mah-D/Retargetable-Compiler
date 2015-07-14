package util.types;

public class X10Place extends X10Type {
	public X10Place() {
		super("place");
	}
	
	public boolean equals(Object o)
	{
		if(!(o instanceof X10Place)) return false;
		return true; 
	}
	public String getFlatTypeName()
	{
		return "int";
	}
}