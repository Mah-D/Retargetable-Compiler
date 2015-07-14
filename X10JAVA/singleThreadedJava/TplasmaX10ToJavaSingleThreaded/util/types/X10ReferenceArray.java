package util.types;

import util.symboltable.Constants;

public class X10ReferenceArray extends X10Array {
	public X10ReferenceArray(int r, X10Type type) {
		super(type+"[]");
		rank = r;
		arrayElementType = type;
	}

	public String toString() {
		return this.arrayElementType + "[/*:rank==*/" + this.rank + "]";
	}
	
	public String getTypeName()
	{
		return this.arrayElementType.getTypeName()+"[]"; //+ "[:rank==" + this.rank + "]";
	}
	
	public String getFlatTypeName()
	{
		return this.arrayElementType.getFlatTypeName() + Constants.referenceArray + this.rank;
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof X10ReferenceArray)
		{
			return ((X10ReferenceArray)o).rank == this.rank 
				&& ((X10ReferenceArray)o).arrayElementType.equals(this.arrayElementType);
		}
		return false;
	}
	
}