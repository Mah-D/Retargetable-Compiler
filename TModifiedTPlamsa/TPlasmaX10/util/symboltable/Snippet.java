package util.symboltable;
import util.types.X10Type;

public class Snippet {
	public String preface;
	public String returnTemp;
	public X10Type expType;
	public boolean isIdentifier;
	public String symbol;
	
	public Snippet(String preface, String returnTemp, X10Type expType, boolean isIdentifier)
	{
		this.preface = preface;
		this.returnTemp = returnTemp;
		this.expType = expType;
		this.isIdentifier = isIdentifier;
	}
	
	public String toString()
	{
		return this.preface + ":" + this.expType + ":" +this.returnTemp;
	}
}
