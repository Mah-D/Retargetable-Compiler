package uplasmax10.visitor;

/**
 * @author orenfreiberg
 *
 */
public class PairsTypeName {
	String myName;
	String type;
	boolean inConstructor;
	boolean isValue;
	boolean isArray;
	String specificType = "FAILED TO ASSIGN TYPE";
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public PairsTypeName(String myName, String type, boolean inConstructore) {
		this.myName = myName;
		this.type = type;
		this.inConstructor= inConstructor;
	}
	public PairsTypeName(String myName, String type, boolean inConstructor, String specificType) {
		this.myName = myName;
		this.type = type;
		this.inConstructor= inConstructor;
		this.specificType = specificType;
		
	}
	public PairsTypeName(String myName, String type, boolean inConstructor, String specificType, boolean isArray, boolean isValue) {
		this.myName = myName;
		this.type = type;
		this.inConstructor= inConstructor;
		this.specificType = specificType;
		this.isArray = isArray;
		this.isValue=isValue;
		
		
	}
	public boolean isValue() {
		return isValue;
	}
	public void setValue(boolean isValue) {
		this.isValue = isValue;
	}
	public boolean isArray() {
		return isArray;
	}
	public void setArray(boolean isArray) {
		this.isArray = isArray;
	}
	public boolean isInConstructor() {
		return inConstructor;
	}
	public String getSpecificType() {
		return specificType;
	}
	
	
	
}
