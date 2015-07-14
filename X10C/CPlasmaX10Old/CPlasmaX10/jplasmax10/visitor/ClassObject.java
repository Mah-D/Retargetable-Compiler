package jplasmax10.visitor;

import java.util.HashMap;

public class ClassObject {
	String ClassName;
	public ClassObject(String className,
			HashMap<String, MethodObject> myMethods,
			HashMap<String, PairsTypeName> myFields) {
		ClassName = className;
		this.myMethods = myMethods;
		this.myFields = myFields;
	}
	public String getClassName() {
		return ClassName;
	}
	public void setClassName(String className) {
		ClassName = className;
	}
	public HashMap<String, MethodObject> getMyMethods() {
		return myMethods;
	}
	public void setMyMethods(HashMap<String, MethodObject> myMethods) {
		this.myMethods = myMethods;
	}
	public HashMap<String, PairsTypeName> getMyFields() {
		return myFields;
	}
	public void setMyFields(HashMap<String, PairsTypeName> myFields) {
		this.myFields = myFields;
	}
	HashMap<String, MethodObject> myMethods = new HashMap<String, MethodObject>();
	HashMap<String, PairsTypeName> myFields = new HashMap<String, PairsTypeName>();
}
