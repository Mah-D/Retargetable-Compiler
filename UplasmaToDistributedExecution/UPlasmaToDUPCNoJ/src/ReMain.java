import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import uplasmax10.UPlasmaX10Parser;
import uplasmax10.visitor.ClassEnumeratorVisitor;
import uplasmax10.visitor.JPlasmaToCPreBuilding;
import uplasmax10.visitor.JPlasmaX10ToCPlasmaX10Visitor;
import uplasmax10.visitor.SymbolTableGeneratorVisitor;


public class ReMain {
	public static void main(String [] args) {
		try {
			
			args = new String[1];
			args[0] = "series";
			//String src = "/r/rfhaque/project/x10/xdk/provinggrounds/benchmarks/"+args[0]+"/jplasma/";
			//String dest = "/r/rfhaque/project/x10/xdk/provinggrounds/benchmarks/"+args[0]+"/jstplasma/";
			//String src = "/Users/orenfreiberg/Desktop/benchmarks/jplasmaBenchmarks/benchmarks/sparsemm/jplasma/";
		    //String src = "/Users/orenfreiberg/Desktop/benchmarks/NewUplasmaBenchmarks/benchmarks/series/uplasma/";
			String src = "/Users/orenfreiberg/Desktop/";
			String des = "/benchmarks/sor/";
			//String src = "/home/atexannamedbob/Desktop"+des;
			//String src = "/Users/orenfreiberg/Desktop/benchmarks/jplasmaBenchmarks/benchmarks/OptimizedPlasma/";
			String dest = "/Users/orenfreiberg/Desktop/Dropbox/Ccode/";
			//String dest = "/home/atexannamedbob/Desktop"+des;
			
			String inFileName = "RunMain.x10";
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