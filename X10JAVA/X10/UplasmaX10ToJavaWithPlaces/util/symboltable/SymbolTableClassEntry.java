package util.symboltable;
import java.util.HashMap;
import java.util.LinkedHashMap;

import util.symboltable.Symbol.SymIndex;

public class SymbolTableClassEntry
{

	public String className;
	public String superClassName;
	public Constants.Visibility visibility;
	public Constants.ClassType classType;
	public LinkedHashMap<SymIndex, Symbol> fields;
	//public LinkedHashMap<String, Symbol> constants;
	public HashMap<String, SymbolTableMethodEntry> methods;
	public HashMap<String, SymbolTableMethodEntry> constructors;
	public SymbolTableClassEntry() {
		fields = new LinkedHashMap<SymIndex, Symbol>(0);
		methods = new HashMap<String, SymbolTableMethodEntry>(0);
		constructors = new HashMap<String, SymbolTableMethodEntry>(0);
	//	constants = new LinkedHashMap<String, Symbol>(0);
	}
	public String getClassName()
	{
		return className;
	}
	
	public String toString()
	{
		String classInfo = this.visibility 
		+ " " + this.classType
		+ " class " + this.className 
		+ " extends " + this.superClassName; 
		String fields = "----------------\n" + "Fields: \n" + "----------------\n";;
		for(SymIndex id : this.fields.keySet())
		{
			fields += this.fields.get(id);
		}
		//fields+= "\n----------------\n";
//		String constants = "Constants: \n";
//		for(String str : this.constants.keySet())
//		{
//			constants += this.constants.get(str);
//		}
		String constructors = "----------------\n" + "Constructors: \n"+ "----------------\n"; 
		for(String str : this.constructors.keySet())
		{
			constructors = constructors + this.constructors.get(str)+"\n";
		}
		//constructors+= "\n----------------\n";
		String methods = "----------------\n" + "Methods: \n" + "----------------\n";
		for(String str : this.methods.keySet())
		{
			methods = methods + this.methods.get(str)+"\n";
		}
		//methods+="\n----------------\n";
		return classInfo + "\n{\n" + fields + "\n\n" + constructors + "\n\n" + methods + "\n}\n"; 
	}
	
}