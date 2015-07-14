package util.symboltable;

import java.util.ArrayList;
import java.util.HashMap;

import util.symboltable.Symbol.SymIndex;
import util.types.X10Type;

public class SymbolTableMethodEntry
{
	public static final class MethodSignature
    {
		public String methodName;
		public ArrayList<X10Type> formalParameters;
		
		public MethodSignature(String methodName, ArrayList<X10Type> formalParameters)
        {
            this.methodName = methodName;
            this.formalParameters = formalParameters;
      	}		
		
		public boolean equals(MethodSignature methodSig)
		{
            return this.getCompleteMethodSignature().equals(methodSig.getCompleteMethodSignature());
		}		
		
		public String getCompleteMethodSignature()
		{
            String temp = "";
			for(int i=0; i < formalParameters.size() ; ++i)
			{
				String type = formalParameters.get(i).toString();
				if(i==0)
					temp = type;
				else
					temp = temp + "," + type;
			}
			return methodName + "(" + temp + ")";
		}

		public Symbol get(SymIndex symId) {
			// TODO Auto-generated method stub
			return new Symbol(symId, formalParameters.get(formalParameters.indexOf(symId.symbolName)));
		}
	}
	
	public String methodClass;
	public X10Type returnType;
	public MethodSignature methodSignature;
    public HashMap<SymIndex, Symbol> variables;
    public HashMap<Integer, Integer> blockMap;
	
	public SymbolTableMethodEntry(String methodClass, X10Type returnType, String methodName, ArrayList<X10Type> formalParameters) {
		this.methodClass = methodClass;
		this.returnType = returnType;
		this.methodSignature = new MethodSignature(methodName, formalParameters);
		this.variables = new HashMap<SymIndex, Symbol>(0);
		this.blockMap = new HashMap<Integer, Integer>(0);
	}
	
	public String toString()
	{
		String methodInfo = returnType + " " + methodClass+"."+methodSignature.getCompleteMethodSignature();
		String variables = "----------------\nVariables :\n----------------\n";
		for(SymIndex sym : this.variables.keySet())
		{
			variables += this.variables.get(sym);
		}
		return methodInfo + "\n{\n" + variables + "\n----------------\nBlockMap :\n----------------\n" + blockMap + "\n}";
	}	
}