package util.types;

import util.symboltable.Constants;

public class X10Class extends X10Type {
	public Constants.Persistence scope;
	public X10Class(String name) {
		super(name);
		scope = Constants.Persistence.NONSTATIC;
	}
	public boolean equals(Object o)
	{
		if(!(o instanceof X10Class)) return false;
		X10Class ua = (X10Class)o;
		return this.typeName.equals(ua.typeName); 
	}
	
	public String toString() {
		return "@" + this.typeName;
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