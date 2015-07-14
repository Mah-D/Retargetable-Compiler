package util.symboltable;

import java.util.HashMap;
import java.util.LinkedHashMap;

import util.symboltable.Symbol.SymIndex;

public class SymbolTableClassEntry {

	public String className;
	public Constants.ClassType classType;
	public LinkedHashMap<SymIndex, Symbol> fields;
	public HashMap<String, SymbolTableMethodEntry> methods;

	public SymbolTableClassEntry(String className, Constants.ClassType classType) {
		this.className = className;
		this.classType = classType;
		this.fields = new LinkedHashMap<SymIndex, Symbol>(0);
		this.methods = new HashMap<String, SymbolTableMethodEntry>(0);
	}

	public String getClassName() {
		return className;
	}

	public String toString() {
		String classInfo = this.classType + " class " + this.className;
		String fields = "----------------\nFields: \n----------------\n";
		for (SymIndex id : this.fields.keySet()) {
			fields += this.fields.get(id);
		}
		String methods = "----------------\nMethods: \n----------------\n";
		for (String str : this.methods.keySet()) {
			methods = methods + this.methods.get(str) + "\n";
		}
		return classInfo + "\n{\n" + fields + "\n\n" + methods + "\n}\n";
	}

}