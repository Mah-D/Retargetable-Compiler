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
		
		public MethodSignature()
        {
            this.formalParameters = new ArrayList<X10Type>(0);
      	}
		
		public boolean equals(MethodSignature methodSig)
		{
            return this.getCompleteMethodSignature().equals(methodSig.getCompleteMethodSignature());
		}
		
		public String getMethodSignature()
		{
            return methodName;
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
		
		public boolean equivalentTo(MethodSignature ms)
		{
			if(this.methodName.equals(ms.methodName) 
					&& (this.formalParameters.size()==ms.formalParameters.size()))
			{
				int i = 0;
				for(X10Type type : ms.formalParameters)
				{
					if(!type.equals(this.formalParameters.get(i))) return false;
					i++;
				}
				return true;
			}
			else return false;
		}
	}
	
	public String methodClass;
	public Constants.Visibility visibility;
	public Constants.Persistence persistence;
	public X10Type returnType;
	public MethodSignature methodSignature;
    public HashMap<SymIndex, Symbol> variables;
    public HashMap<Integer, Integer> blockMap;
	
	public SymbolTableMethodEntry() {
		this.methodSignature = new MethodSignature();
		this.variables = new HashMap<SymIndex, Symbol>(0);
	}
	
	public String toString()
	{
		String methodInfo = visibility + " " + persistence + " " + returnType + " "
		+ methodClass+"."+methodSignature.getCompleteMethodSignature();
		String variables = "----------------\n"+"Variables :\n"+"----------------\n";;
		variables +="";
		for(SymIndex sym : this.variables.keySet())
		{
			variables += this.variables.get(sym);
		}
		return methodInfo + "\n{\n" + variables + "\n----------------\nBlockMap : \n----------------\n" + blockMap + "\n}";
	}	
}