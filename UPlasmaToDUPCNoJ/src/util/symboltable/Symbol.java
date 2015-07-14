package util.symboltable;

import util.types.X10Type;

public class Symbol{

	public static class SymIndex
	{
		public String symbolName;
		public int blockId; // block id
		public SymIndex(String symbolName, int blockId)
		{
			this.symbolName = symbolName;
			this.blockId = blockId;
		}
		
		public boolean equals(Object o)
		{
			if(!(o instanceof SymIndex)) return false;
			SymIndex sym = (SymIndex) o;
			return sym.symbolName.equals(this.symbolName) && sym.blockId == this.blockId;
		}
		
		public String toString()
		{
			return "{" + this.symbolName + "," + this.blockId + "}";
		}
		
		public int hashCode() 
		{
			return this.symbolName.hashCode()+new Integer(this.blockId).hashCode();
		}
	}
	
	public X10Type symbolType;
	public SymIndex symId;
	
	public Symbol(SymIndex symId, X10Type symbolType)
	{
		this.symId = symId;
		this.symbolType = symbolType;
	}
			
	public String toString()
	{
		return "[" + this.symId + ":" + this.symbolType + "]\n";
	}
}