package libParser;

import java.util.HashMap;

public class LibMethodsSplasma implements ListLibMethods {
	private HashMap <String, String> hashMapTempletedMethods;
	
	public LibMethodsSplasma(HashMap <String, String> hashMapTempletedMethods){
		this.hashMapTempletedMethods = hashMapTempletedMethods;
	}
	
	

	public String getAllocateLocalTArray(String type) {
		String type2 = type.toUpperCase();
		if(hashMapTempletedMethods.containsKey("allocateLocalIntegerArray")){
			String temp =  hashMapTempletedMethods.get("allocateLocalIntegerArray").replace("<TYPE>", type2);
			temp = temp.replace("<TYPEL>", type);
			return temp;
		}else{
			System.out.println("ERROR in getCreateTArray");
		}
		return null;
	}

	public String getClassDist() {
	
		if(hashMapTempletedMethods.containsKey("Dist")){
			return hashMapTempletedMethods.get("Dist");
		}
		return null;
	}

	public String getClassTStub(String type) {
		String type2 = type.toUpperCase();
		
		if(hashMapTempletedMethods.containsKey("IntegerStub")){
			String temp = hashMapTempletedMethods.get("IntegerStub").replace("<TYPE>", type2);
			temp = temp.replace("<TYPEL>", type);
			return temp;
		}
		return null;
	}

	public String getCreateDist() {
		
		if(hashMapTempletedMethods.containsKey("createDist")){
			return hashMapTempletedMethods.get("createDist");
		}
		return null;
	}

	public String getCreateTArray(String type) {
		String type2 = type.toUpperCase();
		if(hashMapTempletedMethods.containsKey("createIntegerArray")){
			String temp = hashMapTempletedMethods.get("createIntegerArray").replace("<TYPE>", type2);
			temp = temp.replace("<TYPEL>", type);
			return temp;
		}else{
			System.out.println("ERROR in createIntegerArray");
		}
		return null;
	}

	public String getCreateTStub(String type) {
		String type2 = type.toUpperCase();
		if(hashMapTempletedMethods.containsKey("createIntegerStub")){
			String temp = hashMapTempletedMethods.get("createIntegerStub").replace("<TYPE>", type2);
			temp = temp.replace("<TYPEL>", type);
			return temp;
		}else{
			System.out.println("ERROR in getCreateTStub");
		}
		return null;
	}

	public String getExtendDist() {
		if(hashMapTempletedMethods.containsKey("extendDist")){
			return hashMapTempletedMethods.get("extendDist");
		}
		return null;
	}

	public String getGetCounts() {
		if(hashMapTempletedMethods.containsKey("getCounts")){
			return hashMapTempletedMethods.get("getCounts");
		}
		return null;
	}

	public String getGetLocalIndex() {
		if(hashMapTempletedMethods.containsKey("getLocalIndex")){
			return hashMapTempletedMethods.get("getLocalIndex");
		}
		return null;
	}

	public String getGetPlaceFromDist() {
		if(hashMapTempletedMethods.containsKey("getPlaceFromDist")){
			return hashMapTempletedMethods.get("getPlaceFromDist");
		}
		return null;
	}

	public String getGetRunningSum() {
		if(hashMapTempletedMethods.containsKey("getRunningSum")){
			return hashMapTempletedMethods.get("getRunningSum");
		}
		return null;
	}

	public String getTGetValue(String type) {
		String type2 = type.toUpperCase();
		if(hashMapTempletedMethods.containsKey("intGetValue")){
			String temp = hashMapTempletedMethods.get("intGetValue").replace("<TYPE>", type2);
			temp = temp.replace("<TYPEL>", type);
			return temp;
		}
		return null;
	}

	public String getTSetValue(String type) {
		String type2 = type.toUpperCase();
		if(hashMapTempletedMethods.containsKey("intSetValue")){
			String temp = hashMapTempletedMethods.get("intSetValue").replace("<TYPE>", type2);
			temp = temp.replace("<TYPEL>", type);
			return temp;
		}
		return null;
	}



	public String getClassTArray(String type) {
		String type2 = type.toUpperCase();
		
		if(hashMapTempletedMethods.containsKey("IntegerArray")){
			String temp =  (hashMapTempletedMethods.get("IntegerArray").replace("<TYPE>", type2));
			temp = temp.replace("<TYPEL>", type);
			return temp;
		}
		return null;
	}

public String generateOnlyOnceAllMethods(){
	String temp= "";
	temp +=	  getCreateDist();
	temp +=	  getExtendDist();
	temp +=	  getGetPlaceFromDist();
		  temp +=  getGetCounts();
		  temp +=	  getGetRunningSum();
		  temp +=	  getGetLocalIndex();
		  
		  temp +=	  getClassDist();
		  return temp;
}
	
	public String getAllMethodsDups(String type) {
	String temp = "";
	temp +=	getCreateTArray(type);
	temp +=	  getCreateTStub( type);
	temp +=	 getAllocateLocalTArray( type);
	temp +=	  getTGetValue( type);
	temp +=	  getTSetValue( type);
	
		  temp += getClassTStub( type);
		  temp += getClassTArray( type);
		return temp;
	}
}
