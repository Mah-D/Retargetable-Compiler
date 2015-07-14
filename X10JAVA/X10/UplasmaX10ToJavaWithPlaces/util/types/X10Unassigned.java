package util.types;

import util.symboltable.Constants;

public class X10Unassigned extends X10Type {
	public String className;
	public Constants.Persistence scope;
	public X10Unassigned(String typeName, String className) {
		super(typeName);
		this.className = className;
	}
	
	public boolean equals(Object o)
	{
		if(!(o instanceof X10Unassigned)) return false;
		X10Unassigned ua = (X10Unassigned)o;
		return this.className.equals(ua.className) 
			&& this.typeName.equals(ua.typeName); 
	}
}