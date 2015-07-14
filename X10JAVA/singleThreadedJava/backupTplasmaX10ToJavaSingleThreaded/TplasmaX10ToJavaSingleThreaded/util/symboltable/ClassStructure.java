package util.symboltable;





public class ClassStructure {
	public String classDeclaration;
	public String startBrace = "{";
	public String constants;
	public String initConstants;
	public String fields;
	public String constructors;
	public String methods;
	public String endBrace = "}";
	public String placeChecksCode = "public static final HashMap<Integer, HashSet<Integer>> globalPointerHashMap = RunMain.globalPointerHashMap;";
	public String staticBlockInitCode = "public static final int maxPlaces = 4;\n static {for(int i =0; i <maxPlaces; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}}";

	public ClassStructure(String classDeclaration)
	{
		this.classDeclaration = classDeclaration;
		this.constants = "";
		this.initConstants = "";
		this.fields = "";
		this.constructors = "";
		this.methods = "";
	}

	public String toString()
	{
		return classDeclaration + " " + startBrace + "\n \n" + constants 
		+ ((!constants.equals("")) ? "\n\n" : "")
		+ initConstants
		+ ((!initConstants.equals("")) ? "\n\n" : "")
		+ fields
		+ ((!fields.equals("")) ? "\n\n" : "")
		+ constructors
		+ ((!constructors.equals("")) ? "\n\n" : "")
		+ methods
		+ endBrace;
	}
}
