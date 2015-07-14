package util.symboltable;

import java.util.HashMap;

import jplasmax10.syntaxtree.Type;

import util.symboltable.Constants.ClassType;
import util.symboltable.Symbol.SymIndex;
import util.types.X10Class;
import util.types.X10Type;

public class SymbolTable {
	
	public HashMap<String, SymbolTableClassEntry> symbolTable;
	
	public SymbolTable() {
		this.symbolTable = new HashMap<String, SymbolTableClassEntry>(0);
	}
	
	public SymbolTableClassEntry getClassEntry(String className) {
		return symbolTable.get(className);
	}
	
	public void putClassEntry(String className, SymbolTableClassEntry classEntry) {
		symbolTable.put(className, classEntry);
	}
	
	public Symbol lookupVariableInScope(String identifier, int scopeId, String className, String methodName)
	{
		if(scopeId == 0) return null;
		else
		{
			SymIndex symId = new SymIndex(identifier, scopeId);
			SymbolTableClassEntry stce = getClassEntry(className);
			SymbolTableMethodEntry stme = stce.methods.get(methodName);
			if(stme.variables.containsKey(symId))
			{
			 	return stme.variables.get(symId);
			}else if(stme.variables.containsKey(symId)){
				return stme.methodSignature.get(symId);
			}
			else
			{
				return lookupVariableInScope(identifier, stme.blockMap.get(scopeId), className, methodName);
			}
		}
	}
	
	public ClassType getClassType(String className){
		 SymbolTableClassEntry stce = getClassEntry(className);
		 return stce.classType;
	}
	
	public X10Type lookupMethodReturnType(String className, String methodName)
	{
		
		
			SymbolTableClassEntry stce = getClassEntry(className);
			
			SymbolTableMethodEntry stme = stce.methods.get(methodName);
			
			return stme.returnType;
		
	}
	
	public Symbol lookupField(String identifier, String className)
	{
		SymIndex symId = new SymIndex(identifier, 0);
		SymbolTableClassEntry stce = getClassEntry(className);
		if(stce.fields.containsKey(symId))
		{
			return stce.fields.get(symId);
		}
		else
		{
			return null;
		}
	}
	
	public String toString()
	{
		return symbolTable.toString();
	}
}
