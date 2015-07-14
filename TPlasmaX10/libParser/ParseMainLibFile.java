package libParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ParseMainLibFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "";
		if(args.length > 0){
			fileName = args[0];
		}
		
		ParseMainLibFile pmlf = new ParseMainLibFile(fileName);
		pmlf.starParsing();
		System.out.print(pmlf.toString());
	}

	public String fileName;
	private HashMap <String, String> hashMapTempletedMethods;
	private ArrayList<String> listMethodNames;
	private int numberOfMethods=0;
	
	
	public ParseMainLibFile(String fileName) {
		this.fileName = fileName;
		hashMapTempletedMethods = new HashMap<String, String>();
		listMethodNames = new ArrayList<String>();
		numberOfMethods = 0;
	}
	public boolean starParsing(){
		File input = new File(fileName);
		FileReader fr;
		try{
			fr = new FileReader(input);
			BufferedReader buffR = new BufferedReader(fr);
			String myLine ="";
			String methodName ="";
			String codeForCurrentMethod = "";
			
			while ((myLine = buffR.readLine()) != null) { 
		    
				if(myLine.contains("/*END*/") || myLine.contains("/*end*/") || myLine.contains("/*End*/")){
					
					listMethodNames.add(methodName);
					numberOfMethods++;
					codeForCurrentMethod = codeForCurrentMethod.replace("Integer", "<TYPE>");
					if(methodName.contains("allocateLocalIntegerArray")){
						codeForCurrentMethod = codeForCurrentMethod.replaceFirst("int", "<TYPEL>");
						int indexOfint = codeForCurrentMethod.lastIndexOf("int");
						codeForCurrentMethod = codeForCurrentMethod.replaceFirst("final int[:rank==1] temp = (int[:rank==1])(new int[localDist]);", "final  <TYPEL>[:rank==1] temp = ( <TYPEL>[:rank==1])(new  <TYPEL>[localDist]);");
						
					}else if(methodName.contains("intGetValue")){
						codeForCurrentMethod = codeForCurrentMethod.replaceFirst("int", "<TYPEL>");
						codeForCurrentMethod = codeForCurrentMethod.replaceFirst("int", "<TYPEL>");
						codeForCurrentMethod = codeForCurrentMethod.replace( "int returnValue", "<TYPEL> returnValue");
					}else if(methodName.contains("intSetValue")){
						codeForCurrentMethod = codeForCurrentMethod.replaceFirst("int", "<TYPEL>");
						codeForCurrentMethod = codeForCurrentMethod.replaceFirst("int val", "<TYPEL> val");
						codeForCurrentMethod = codeForCurrentMethod.replaceFirst("int[:rank==1] localArray", "<TYPEL>[:rank==1] localArray");
					}else if(methodName.contains("IntegerStub")){
						codeForCurrentMethod = codeForCurrentMethod.replaceFirst("int", "<TYPEL>");
					}
					
					hashMapTempletedMethods.put(methodName, codeForCurrentMethod);
					codeForCurrentMethod = "";
					
				}else if(myLine.contains("/*createIntegerArray*/")){
					codeForCurrentMethod="";
					methodName = "createIntegerArray";
					
					
				}else if(myLine.contains("/*createIntegerStub*/")){
					codeForCurrentMethod="";
					methodName = "createIntegerStub";
					
				}else if(myLine.contains("/*allocateLocalIntegerArray*/")){
					codeForCurrentMethod="";
					methodName = "allocateLocalIntegerArray";
				}else if(myLine.contains("/*intGetValue*/")){
					codeForCurrentMethod="";
					methodName = "intGetValue";
				}else if(myLine.contains("/*intSetValue*/")){
					codeForCurrentMethod="";
					methodName = "intSetValue";
				}else if(myLine.contains("/*createDist*/")){
					codeForCurrentMethod="";
					methodName= "createDist";
				}else if(myLine.contains("/*extendDist*/")){
					codeForCurrentMethod="";
					methodName= "extendDist";
				}else if(myLine.contains("/*getPlaceFromDist*/")){
					codeForCurrentMethod="";
					methodName= "getPlaceFromDist";
				}else if(myLine.contains("/*getCounts*/")){
					codeForCurrentMethod="";
					methodName= "getCounts";
				}else if(myLine.contains("/*getRunningSum*/")){
					codeForCurrentMethod="";
					methodName= "getRunningSum";
				}else if(myLine.contains("/*getLocalIndex*/")){
					codeForCurrentMethod="";
					methodName= "getLocalIndex";
					codeForCurrentMethod="";
				}else if(myLine.contains("/*IntegerArray*/")){
					codeForCurrentMethod="";
					methodName= "IntegerArray";
				}else if(myLine.contains("/*IntegerStub*/")){
					codeForCurrentMethod="";
					methodName= "IntegerStub";
				}else if(myLine.contains("/*Dist*/")){
					codeForCurrentMethod="";
					methodName= "Dist";
				}else{
					codeForCurrentMethod+=myLine+"\n";
				}
				
		    } 

			fr.close();
			buffR.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
			return false;
		}catch (IOException e) {
			e.printStackTrace();
			return false;
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}
		
		
		
		return true;	
	}
	public HashMap<String, String> getHashMapTempletedMethods() {
		return hashMapTempletedMethods;
	}
	public ArrayList<String> getListMethodNames() {
		return listMethodNames;
	}
	public int getNumberOfMethods() {
		return numberOfMethods;
	}
	public String toString(){
		String result = "";
		
		result += "number of Methods to be translated =" + numberOfMethods+"\n";
		
		if(listMethodNames != null){
			
			for(String temp : listMethodNames){
				result+=temp+" \n";
				result+="=================================================== \n";
				if(hashMapTempletedMethods !=null){
					if(hashMapTempletedMethods.containsKey(temp)){
						result += hashMapTempletedMethods.get(temp)+"\n";
					}
				}
			}//end for
		}//end if
		
		
		
		
		return result; 
	}
}
