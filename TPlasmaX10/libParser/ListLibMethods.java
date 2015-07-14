package libParser;

public interface ListLibMethods {
	
	public String getCreateTArray(String type);
	public String getCreateTStub(String type);
	public String getAllocateLocalTArray(String type);
	public String getTGetValue(String type);
	public String getTSetValue(String type);
	public String getCreateDist();
	public String getExtendDist();
	public String getGetPlaceFromDist();
	public String getGetCounts();
	public String getGetRunningSum();
	public String getGetLocalIndex();
	public String getClassDist();
	public String getClassTStub(String type);
	public String getClassTArray(String type);
	public String getAllMethodsDups(String Type);
	public String generateOnlyOnceAllMethods();
}
