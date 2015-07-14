package util.types;

import util.symboltable.Constants;

public class X10Region extends X10Type {
	public int rank;

	public X10Region(int r) {
		super("int");
		this.rank = r;
	}

	public String toString() {
		return this.typeName + "";
	}
	
	public boolean equals(Object o)
	{
		if(!(o instanceof X10Region)) return false;
		X10Region ua = (X10Region)o;
		return this.rank == ua.rank; 
	}
	
	public String getTypeName()
	{
		return this.typeName; //+ "(:rank==" + this.rank + ")";
	}
	
	public String getFlatTypeName()
	{
		return Constants.region + this.rank;
	}
}