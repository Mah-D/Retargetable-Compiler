import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import uplasmax10.UPlasmaX10Parser;
import uplasmax10.visitor.ClassEnumeratorVisitor;
import uplasmax10.visitor.JPlasmaToCPreBuilding;
import uplasmax10.visitor.JPlasmaX10ToCPlasmaX10Visitor;
import uplasmax10.visitor.SymbolTableGeneratorVisitor;
import java.util.HashMap;


public class Main {
	public static final String inputStage = "tplasma";
	public static final String outputStage = "uplasma";
	public static final String tmpFileName = "RunMain.x10";
	
	public enum OPTIONS {
		MALLOCPROFILER,
		CALLOC,
		DUP,
		GC
	};
	
	public static HashMap<OPTIONS, Boolean> createOptions() {
		HashMap<OPTIONS, Boolean> optionsMap = new HashMap<OPTIONS, Boolean>(0);
		optionsMap.put(OPTIONS.MALLOCPROFILER, false);
		optionsMap.put(OPTIONS.CALLOC, false);
		optionsMap.put(OPTIONS.DUP, false);
		optionsMap.put(OPTIONS.GC, false);
		return optionsMap;
	}
	
	private static String getOptionName(String arg, int equalIndex) {
        if (equalIndex < 0) { // naked option
            return arg.substring(1, arg.length());
        } else {
            return arg.substring(1, equalIndex);
        }
    }
	
    private static String getOptionValue(String arg, int equalIndex) {
        if (equalIndex < 0) { // naked option
            return null;
        } else {
            return arg.substring(equalIndex + 1);
        }
    }
	
	private static int parseOptions(String[] args, HashMap<OPTIONS, Boolean> optionsMap) {
		int cntr = 0;
		for (; cntr < args.length; cntr++) {
			String arg = args[cntr];
			if (arg.charAt(0) == '-') {
				// is the beginning of a valid option.
				boolean invalidOption = false;
				int index = arg.indexOf('=');
				String optName = getOptionName(arg, index);
				if(optName.equals("D"))
				{
					String value = getOptionValue(arg, index);
					if(value != null)
					{
						if(value.equals("true"))
						{
							optionsMap.put(OPTIONS.DUP, true);
						}
						else if(!value.equals("false"))
						{
							invalidOption = true;
						}
					}
				}else if(optName.equals("GC"))
				{
					String value = getOptionValue(arg, index);
					if(value != null)
					{
						if(value.equals("true"))
						{
							optionsMap.put(OPTIONS.GC, true);
						}
						else if(!value.equals("false"))
						{
							invalidOption = true;
						}
					}
				}else if(optName.equals("M"))
				{
					String value = getOptionValue(arg, index);
					if(value != null)
					{
						if(value.equals("true"))
						{
							optionsMap.put(OPTIONS.MALLOCPROFILER, true);
						}
						else if(!value.equals("false"))
						{
							invalidOption = true;
						}
					}
				}
				else if(optName.equals("C"))
				{
					String value = getOptionValue(arg, index);
					if(value != null)
					{
						if(value.equals("true"))
						{
							optionsMap.put(OPTIONS.CALLOC, true);
						}
						else if(!value.equals("false"))
						{
							invalidOption = true;
						}
					}
				}
				if(invalidOption)
				{
					System.out.println("Invalid Compile Option " + arg);
					System.out.println("Valid Options are: ");
					System.out.println("D=[true/false] : Distributed execution or Single threaded execution. ");
					System.out.println("GC=[true/false] : To use garbage collection. ");
					System.out.println("M=[true/false] : To utilize memory/malloc profileing. ");
					System.out.println("C=[true/false] : To use calloc instead of malloc. ");
					System.exit(0);
				}
			} else {
				// is not a valid option, therefore the start of arguments
				break;
			}
		}
		return cntr;
	}

	private static String getInputFile(String fileName) {
		return fileName+"/"+inputStage+"/"+tmpFileName;
	}
	
	static public void checkFileExists(String fileName) throws FileNotFoundException, IOException, Exception {
		File x10File = new File(fileName);
		if ( x10File == null ) {
			throw new IllegalArgumentException("File " + fileName + " should not be null.");
		}
		if (!x10File.exists()) {
			throw new FileNotFoundException ("File "  +  fileName +  " does not exist: " + x10File);
		}
		if (!x10File.canRead())
		{
			throw new Exception("File " + fileName + " is not readable");
		}
		if (!x10File.isFile()) {
			throw new IllegalArgumentException(fileName + " should not be a directory: " + x10File);
		}
		if (!x10File.canRead()) {
			throw new IllegalArgumentException("File " + fileName + " cannot be read: " + x10File);
		}
	}

	public static void main(String[] args) {
		HashMap<OPTIONS, Boolean> optionsMap = createOptions();
		try 
		{
			if (args.length < 1 ) 
			{
				System.out.println("Please enter the input file to the x10 compiler");
				System.exit(0);
			}

			boolean fileDoesNotExist = false;

			int fileIndex = parseOptions(args, optionsMap);
			if(fileIndex >= args.length)
			{
				System.out.println("Please enter the correct input file to the x10 compiler");
				System.exit(0);
			}

			String fileName = getInputFile(args[fileIndex]);
			
			try
			{
				checkFileExists(fileName);
			}
			catch ( Exception e )
			{
				fileDoesNotExist = true;
				e.printStackTrace();
			}

			if (fileDoesNotExist)
			{
				System.err.println("Could not compile. File " + fileName + "does not exist...");
				System.exit(0);
			}
			translate(optionsMap, fileName+"/uplasma/RunMain.x10",fileName+"/c/RunMain");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public static void translate(HashMap<OPTIONS,Boolean> optionsMap, String fileName, String outputName) {
	try {
			
			
			
			//String src = "/r/rfhaque/project/x10/xdk/provinggrounds/benchmarks/"+args[0]+"/jplasma/";
			//String dest = "/r/rfhaque/project/x10/xdk/provinggrounds/benchmarks/"+args[0]+"/jstplasma/";
			//String src = "/Users/orenfreiberg/Desktop/benchmarks/jplasmaBenchmarks/benchmarks/raytracer/jplasma/";
			//String src = "/Users/orenfreiberg/Desktop/benchmarks/jplasmaBenchmarks/benchmarks/stream/jplasma/";
			String src = fileName;
			//String src = "/Users/orenfreiberg/Desktop/benchmarks/jplasmaBenchmarks/benchmarks/OptimizedPlasma/";
			
			String outFileName = outputName+".c";
			String outFileNameH = outputName+".h";
			File input = new File(src);
			FileReader fr;
			try {
				
				fr = new FileReader(input);
				BufferedReader buffy = new BufferedReader(fr);
                 uplasmax10.syntaxtree.Node root = new UPlasmaX10Parser(buffy).File();
                 ClassEnumeratorVisitor cev = new ClassEnumeratorVisitor();
                 root.accept(cev,null);        
                 SymbolTableGeneratorVisitor stgv = new SymbolTableGeneratorVisitor(cev.symbolTable);
                 root.accept(stgv, null);
                 //System.out.println(cev.symbolTable);

				
				JPlasmaToCPreBuilding jpt = new JPlasmaToCPreBuilding();
				jpt.symbolTable = cev.symbolTable;
				root.accept(jpt, null);
				
				
				JPlasmaX10ToCPlasmaX10Visitor jpjstpv = new JPlasmaX10ToCPlasmaX10Visitor();
				jpjstpv.setUseCalloc(optionsMap.get(OPTIONS.CALLOC));
				jpjstpv.setUseMallocProfiler(optionsMap.get(OPTIONS.MALLOCPROFILER));
				jpjstpv.setUseDUPDistributed(optionsMap.get(OPTIONS.DUP));
				jpjstpv.setUseGarbageCollector(optionsMap.get(OPTIONS.GC));
				
				jpjstpv.myConstructorList = jpt.myConstructorNames;
				jpjstpv.myClasses = jpt.myClasses;
				jpjstpv.myListAsyncConstructorClass = jpt.myListAsyncConstructorClass;
				jpjstpv.symbolTable = cev.symbolTable;
				jpjstpv.myListOfClasses = jpt.myListOfClasses;
				jpjstpv.aHashMapClasses = jpt.aHashMapClasses;
				root.accept(jpjstpv, null);
			
				File output = new File(outFileName);
				
				FileWriter fw = new FileWriter(output);
				fw.write(jpjstpv.generateCode());
				File outputH = new File(outFileNameH);
				
				FileWriter fwH = new FileWriter(outputH);
				fwH.write(jpjstpv.generateHCode());
				fr.close();
				buffy.close();
				fw.close();
				fwH.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class OldMain {
	public static void main(String [] args) {
		try {
			
			
			
			//String src = "/r/rfhaque/project/x10/xdk/provinggrounds/benchmarks/"+args[0]+"/jplasma/";
			//String dest = "/r/rfhaque/project/x10/xdk/provinggrounds/benchmarks/"+args[0]+"/jstplasma/";
			//String src = "/Users/orenfreiberg/Desktop/benchmarks/jplasmaBenchmarks/benchmarks/raytracer/jplasma/";
			//String src = "/Users/orenfreiberg/Desktop/benchmarks/jplasmaBenchmarks/benchmarks/stream/jplasma/";
			String src = args[0];
			//String src = "/Users/orenfreiberg/Desktop/benchmarks/jplasmaBenchmarks/benchmarks/OptimizedPlasma/";
			String dest = "";
		
			
			//String inFileName = "RunMain.x10";
			String inFileName = "";
			String outFileName = "RunMain.c";
			String outFileNameH = "RunMain.h";
			File input = new File(src+inFileName);
			FileReader fr;
			try {
				
				fr = new FileReader(input);
				BufferedReader buffy = new BufferedReader(fr);
                 uplasmax10.syntaxtree.Node root = new UPlasmaX10Parser(buffy).File();
                 ClassEnumeratorVisitor cev = new ClassEnumeratorVisitor();
                 root.accept(cev,null);        
                 SymbolTableGeneratorVisitor stgv = new SymbolTableGeneratorVisitor(cev.symbolTable);
                 root.accept(stgv, null);
                 //System.out.println(cev.symbolTable);

				
				JPlasmaToCPreBuilding jpt = new JPlasmaToCPreBuilding();
				jpt.symbolTable = cev.symbolTable;
				root.accept(jpt, null);
				
				/*System.out.println("======================");
				for(String x : jpt.myConstructorNames.keySet()){
					if(jpt.myConstructorNames.get(x).keySet().size() > 0){
						for(Integer y : jpt.myConstructorNames.get(x).keySet()){
						System.out.println(x+"_"+jpt.myConstructorNames.get(x).get(y));
						}
					}
				}
				System.out.println("======================");
				*/
				JPlasmaX10ToCPlasmaX10Visitor jpjstpv = new JPlasmaX10ToCPlasmaX10Visitor();
				jpjstpv.myConstructorList = jpt.myConstructorNames;
				jpjstpv.myClasses = jpt.myClasses;
				jpjstpv.myListAsyncConstructorClass = jpt.myListAsyncConstructorClass;
				jpjstpv.symbolTable = cev.symbolTable;
				jpjstpv.myListOfClasses = jpt.myListOfClasses;
				jpjstpv.aHashMapClasses = jpt.aHashMapClasses;
				root.accept(jpjstpv, null);
			
				File output = new File(dest+outFileName);
				
				FileWriter fw = new FileWriter(output);
				fw.write(jpjstpv.generateCode());
				File outputH = new File(dest+outFileNameH);
				
				FileWriter fwH = new FileWriter(outputH);
				fwH.write(jpjstpv.generateHCode());
				fr.close();
				buffy.close();
				fw.close();
				fwH.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
