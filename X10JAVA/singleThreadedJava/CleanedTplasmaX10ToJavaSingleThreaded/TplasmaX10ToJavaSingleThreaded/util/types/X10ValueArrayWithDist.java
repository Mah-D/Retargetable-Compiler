package util.types;

// For future use
public class X10ValueArrayWithDist extends X10ValueArray {
	public String distId;

	public X10ValueArrayWithDist(int r, X10Type elementType, String dist) {
		super(r, elementType);
		distId = dist;
	}

	public String toString() {
		return this.arrayElementType 
		+ " /*value*/[/*:rank==*/" + this.rank + "&&distribution==" 
		+ this.distId + "]";
	}
	
	public String getTypeName() {
		return this.arrayElementType.getTypeName() 
		+ " /*value*/[/*:rank==*/" + this.rank + "&&distribution==" 
		+ this.distId + "]";
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof X10ValueArrayWithDist)
		{
			return ((X10ValueArrayWithDist)o).rank == this.rank &&
				((X10ValueArrayWithDist)o).distId == this.distId &&
				((X10ValueArrayWithDist)o).arrayElementType.equals(this.arrayElementType);
		}
		return false;
	}
}