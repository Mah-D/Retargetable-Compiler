package util.types;

public class X10ReferenceArrayWithDist extends X10ReferenceArray {
	public String distId;

	public X10ReferenceArrayWithDist(int r, X10Type elementType, String dist) {
		super(r, elementType);
		distId = dist;
	}

	public String toString() {
		return this.arrayElementType 
		+ "[:rank==" + this.rank + "&&distribution==" 
		+ this.distId + "]";
	}
	
	public String getTypeName() {
		return this.arrayElementType.getTypeName() 
		+ "[:rank==" + this.rank + "&&distribution==" 
		+ this.distId + "]";
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof X10ReferenceArrayWithDist)
		{
			return ((X10ReferenceArrayWithDist)o).rank == this.rank &&
				((X10ReferenceArrayWithDist)o).distId == this.distId &&
				((X10ReferenceArrayWithDist)o).arrayElementType.equals(this.arrayElementType);
		}
		return false;
	}
}