package util.types;

public class X10Double extends X10Type {
	public X10Double() {
		super("double");
	}
	
	public X10Double(String type) {
		super(type);
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof X10Double || o instanceof X10Integer)return true;
		return false;
	}
}