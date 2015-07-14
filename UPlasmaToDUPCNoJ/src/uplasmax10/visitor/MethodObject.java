package uplasmax10.visitor;

import java.util.HashMap;

public class MethodObject {
	String methodName;
	public MethodObject(String methodName,
			HashMap<String, PairsTypeName> myLocalsParams) {
		this.methodName = methodName;
		this.myLocalsParams = myLocalsParams;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	HashMap<String, PairsTypeName> myLocalsParams = new HashMap<String, PairsTypeName>();
}
