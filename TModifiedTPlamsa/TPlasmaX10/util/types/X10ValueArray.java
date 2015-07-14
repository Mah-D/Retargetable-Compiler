package util.types;

import util.symboltable.Constants;

public class X10ValueArray extends X10Array {
	
	public X10ValueArray(int r, X10Type type) {
		super("valueArray");
		rank = r;
		arrayElementType = type;
	}

	public String toString() {
		return this.arrayElementType + "value[:rank==" + this.rank + "]";
		//return this.arrayElementType + "value[:rank==" + this.rank + "]";
	}
	
	public String getTypeName() {
		return this.arrayElementType.getTypeName() + " value[:rank==" + this.rank + "]";
		//return this.arrayElementType + "value[:rank==" + this.rank + "]";
	}
	
	public String getFlatTypeName() {
		return this.arrayElementType.getFlatTypeName() + Constants.valueArray + this.rank;
		//return this.arrayElementType + "value[:rank==" + this.rank + "]";
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof X10ValueArray)
		{
			return ((X10ValueArray)o).rank == this.rank 
				&& ((X10ValueArray)o).arrayElementType.equals(this.arrayElementType);
		}
		return false;
	}
}