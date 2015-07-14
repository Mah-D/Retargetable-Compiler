package util.types;

import util.symboltable.Constants;
import util.symboltable.Constants.ClassType;

public class X10Class extends X10Type {
	public Constants.ClassType type;
	public X10Class(String name, ClassType classType) {
		super(name);
		this.type = classType;
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
}