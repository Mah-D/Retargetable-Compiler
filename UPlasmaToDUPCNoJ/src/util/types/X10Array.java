package util.types;

import util.symboltable.Constants;

public class X10Array extends X10Type{
	
	public int rank;
	public X10Type arrayElementType;
	
	public X10Array(int r, X10Type type) {
		super("refArray");
		rank = r;
		arrayElementType = type;
	}

	public String toString() {
		return this.arrayElementType + "[:rank==" + this.rank + "]";
	}
	
	public String getTypeName()
	{
		return this.arrayElementType.getTypeName() + "[:rank==" + this.rank + "]";
	}
	
	public String getFlatTypeName()
	{
		return this.arrayElementType.getFlatTypeName() + Constants.referenceArray + this.rank;
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof X10Array)
		{
			return ((X10Array)o).rank == this.rank 
				&& ((X10Array)o).arrayElementType.equals(this.arrayElementType);
		}
		return false;
	}
}