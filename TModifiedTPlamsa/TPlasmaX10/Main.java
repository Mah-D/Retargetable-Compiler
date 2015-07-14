import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

import plasmax10.parser.PlasmaX10Parser;
import plasmax10.visitor.FieldsGeneratorVisitor;
import plasmax10.visitor.SymbolTableGeneratorVisitor;

import splasmax10.parser.SPlasmaX10Parser;

public class Main {

	public enum OPTIONS {
		BOUNDSCHECK, PLACECHECK, DISTFACTORYMETHODS
	};

	public static void main(String[] args) {
		HashMap<OPTIONS, Boolean> optionsMap = new HashMap<OPTIONS, Boolean>(0);
		optionsMap.put(OPTIONS.PLACECHECK, true);
		optionsMap.put(OPTIONS.BOUNDSCHECK, true);
		optionsMap.put(OPTIONS.DISTFACTORYMETHODS, false);

		if (args.length < 1) {
			System.out.println("Please enter the correct input file to the x10 compiler");
			System.exit(0);
		}

		String fileName = args[0];		
		try {
			checkFileExists(fileName);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		translate(optionsMap, fileName);
	}
	
	static public void checkFileExists(String fileName) throws Exception {
		File x10File = new File(fileName);
		if (x10File == null) {
			throw new IllegalArgumentException("File " + fileName
					+ " should not be null.");
		}
		if (!x10File.exists()) {
			throw new FileNotFoundException("File " + fileName
					+ " does not exist: " + x10File);
		}
		if (!x10File.canRead()) {
			throw new Exception("File " + fileName + " is not readable");
		}
		if (!x10File.isFile()) {
			throw new IllegalArgumentException(fileName
					+ " should not be a directory: " + x10File);
		}
		if (!x10File.canRead()) {
			throw new IllegalArgumentException("File " + fileName
					+ " cannot be read: " + x10File);
		}
	}

	public static void translate(HashMap<OPTIONS, Boolean> optionsMap, String fileName) {
		
		File input = new File(fileName);
		FileReader fr;
		try {
			fr = new FileReader(input);
			BufferedReader buffy = new BufferedReader(fr);
			FieldsGeneratorVisitor fgv = new FieldsGeneratorVisitor(null);
			plasmax10.syntaxtree.Node root1 = new PlasmaX10Parser(buffy).File();
			root1.accept(fgv, null);
			SymbolTableGeneratorVisitor stgv = new SymbolTableGeneratorVisitor(fgv.classSymbolTable);
			root1.accept(stgv, null);
			fr.close();
			buffy.close();

			System.out.println("Translating RPlasmaX10 file " + fileName  + " to SPlasmaX10....");			
			fr = new FileReader(input);
			buffy = new BufferedReader(fr);
			splasmax10.syntaxtree.Node root2 = new SPlasmaX10Parser(buffy).File();
			//root2.accept(rtsv, null);
			System.out.println("RPlasmaX10 file " + fileName  + " successfully translated to SPlasmaX10....");		

			//TODO: Change this to be generic
			File output = new File("RunMain.x10");
			FileWriter fw = new FileWriter(output);
			//for (String className : rtsv.classes.keySet()) {
			//	fw.write(rtsv.classes.get(className).toString() + "\n");
			//}
			fr.close();
			buffy.close();
			//fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
