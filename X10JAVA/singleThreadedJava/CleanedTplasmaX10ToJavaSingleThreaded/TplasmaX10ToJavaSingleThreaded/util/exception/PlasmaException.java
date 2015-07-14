package util.exception;

public class PlasmaException {
    static public int currColumn = -1;
    static public int currLine = -1; 

	public static void throwException(String message, boolean die)
	{
		String errMessage = "At line number : " + currLine + " at column number : " + currColumn + " : " + message;
		System.err.println(errMessage);
		if(die) System.exit(0);
	}
}
