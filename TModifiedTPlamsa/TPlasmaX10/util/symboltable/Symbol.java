package util.symboltable;

import util.types.X10Type;

public class Symbol{

	public enum Declaration { CONSTANT, FIELD, LOCAL, UNDEFINED };
	
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
	public String newSymbolName;
	public Constants.Visibility visibility;
	public Constants.Persistence persistence;
	public Constants.Modifiability modifiability;
	public SymbolTableMethodEntry initializer;
	public boolean initialized;
	public int positionId; // position within code...can be used for flow dependent variable names
	public Declaration decl;
	public String className;
	
	
	public SymIndex symId;
	
	public Symbol(String symbolName, int blockId, String className)
	{
		this.symId = new SymIndex(symbolName, blockId);
		this.symbolType = null;
		this.visibility = null;
		this.persistence = null;
		this.modifiability = null;
		this.initialized = false;
		this.initializer = null;
		this.positionId = -1;
		this.newSymbolName = symbolName;
		this.className = className;
	}
	
	public Symbol(String symbolName, X10Type symbolType, Constants.Visibility visibility,
			Constants.Persistence persistence, Constants.Modifiability modifiability, int positionId, int blockId, String className)
	{
		this.symId = new SymIndex(symbolName, blockId);
		this.symbolType = symbolType;
		this.visibility = visibility;
		this.persistence = persistence;
		this.modifiability = modifiability;
		this.initialized = false;
		this.initializer = null;
		this.positionId = positionId;
		this.newSymbolName = symbolName;
		this.className = className;
	}
	
	public void setInitialized(boolean initialized, SymbolTableMethodEntry intializer)
	{
		this.initialized = initialized;
		this.initializer = intializer;
	}
		
	public String toString()
	{
		return this.visibility + " " + this.persistence + " " + this.modifiability
		+ " " + this.symbolType + " " + this.newSymbolName + " " + this.symId + " " + this.initialized 
		+ "[" + this.initializer + "]\n";
	}
}