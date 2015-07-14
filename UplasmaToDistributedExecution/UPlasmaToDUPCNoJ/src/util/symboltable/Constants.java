package util.symboltable;

public final class Constants {
	public enum Types {INT, BOOL, ARRAY, STRARRAY, IDENT, CLASS, NULL};
	public enum Visibility {PUBLIC, PRIVATE, LOCAL};
	public enum ClassType {REF, VALUE};
	public enum Persistence {STATIC, NONSTATIC, THIS, LOCAL};
	public enum Modifiability {FINAL, NONFINAL};
	public static final String objType = "Object";
	public static final String publicType = "public";
	public static final String privateType = "private";
	public static final String tempVar = "RX10_TEMP";
	
	public static final String distribution = "Dist";
	public static final String distRegName = "dReg";
	public static final String distDistName = "dDist";
	public static final String distDistPlaceName = "placeArray";
	public static final String distDistCountsName = "counts";
	public static final String distDistRunSumName = "runningSum";
	
	public static final String region = "Region";
	public static final String regionRank = "regRank";
	public static final String regionSize = "regSize";
	public static final String regionPointArrayName = "pointArray";
	public static final String regionTypeName = "regType";
	public static final String regionLowOffsetName = "low";
	public static final String regionDimLengthName = "dim";
	
	public static final String regionDefParamName = "v";
	
	public static final String point = "Point";
	public static final String pointVarName = "f";
	
	public static final String valueArray = "ValArray";
	public static final String valArrayRegName = "regionValue";
	public static final String valArrayContentArray = "contents";
	
	public static final String referenceArray = "RefArray";
	public static final String refArrayDistName = "distValue";
	public static final String refArrayContentArray = "contents";
	public static final String refArrayStub = "Stub";
	public static final String refArrayLocalArray = "localArray";
	
	
	/* Methods to be implemented in SPlasmaX10 */
	
	public static final String regular = "Regular";
	public static final String arbitrary = "Arbitrary";
	
	public static final String regionToString = "toString" + region;
	public static final String pointToString = "toString" + point;
	public static final String distToString = "toString" + distribution;
	public static final String distGetPlaceDist = "getPlace" + distribution;
	public static final String distGetBlockCyclic = "getBlockCyclic" + distribution;
	public static final String distGetBlock = "getBlock"+ distribution;
	public static final String distGetUnique = "getUnique"+ distribution;
	public static final String regionContainsPoint = "regionContains"+ point;
	public static final String searchPointInRegion = "searchPointIn" + region;
	public static final String binarySearchRegion = "binarySearch" + region;
	public static final String constantSearchRegion = "constantSearch" + region;
	public static final String distUnion = "union" + distribution;
	public static final String regionUnion = "union" + region;
	public static final String createNewRegion = "createNewRegion";
	public static final String restrictDist = "restrictDist";
	public static final String getCyclic = "getCyclic";
	public static final String comparePoint = "comparePoint";
	public static final String getPlaceFromDist = "getPlaceFromDist";
	public static final String boundsCheck = "boundsCheck";
	public static final String placeCheck = "placeCheck";
	public static final String initDist = "initDist";
	public static final String regionLow = "regionLow";
	public static final String regionHigh = "regionHigh";
	public static final String regionOrdinalPoint = "regionOrdinalPoint";
	public static final String getRefArrayValue = "getRefArrayValue";
	public static final String setRefArrayValue = "setRefArrayValue";
	public static final String getDistLocalCount = "getDistLocalCount";
	public static final String getDistLocalArray = "getDistLocalArray";
	public static final String getRank = "getRank";
	public static final String mergeSort = "mergeSort";
}
