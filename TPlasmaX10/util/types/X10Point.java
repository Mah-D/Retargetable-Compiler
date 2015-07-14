package util.types;

import util.symboltable.Constants;

public class X10Point extends X10Type {
	public int rank;

	public X10Point(int r) {
		super("point");
		this.rank = r;
	}

	public String toString() {
		return this.typeName + "(:rank==" + this.rank + ")";
	}
	
	public boolean equals(Object o)
	{
		if(!(o instanceof X10Point)) return false;
		X10Point ua = (X10Point)o;
		return this.rank == ua.rank; 
	}
	
	public String getTypeName()
	{
		return this.typeName + "(:rank==" + this.rank + ")";
	}
	
	public String getFlatTypeName()
	{
		return Constants.point + this.rank;
	}
}