package util.types;

import util.symboltable.Constants;

public class X10Distribution extends X10Type {
	public int rank;

	public X10Distribution(int r) {
		super("int");
		this.rank = r;
	}

	public String toString() {
		return this.typeName + "(:rank==" + this.rank + ")";
	}
	
	public boolean equals(Object o)
	{
		if(!(o instanceof X10Distribution)) return false;
		X10Distribution ua = (X10Distribution)o;
		return this.rank == ua.rank; 
	}
	
	public String getTypeName()
	{
		return this.typeName;// + "(:rank==" + this.rank + ")";
	}
	
	public String getFlatTypeName()
	{
		return Constants.distribution + this.rank;
	}
}