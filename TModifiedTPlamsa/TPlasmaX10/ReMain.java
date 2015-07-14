import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import plasmax10.parser.PlasmaX10Parser;
import plasmax10.visitor.FieldsGeneratorVisitor;
import plasmax10.visitor.SymbolTableGeneratorVisitor;

import splasmax10.parser.SPlasmaX10Parser;
import splasmax10.visitor.SPlasmaX10ToTPlasmaX10Visitor;

public class ReMain {
	public static void main(String [] args) {
		try {
			
			boolean options[] = {true, true};
			boolean useDistFactoryMethods = false;
			String home = "/r/rfhaque/project/x10/xdk/provinggrounds/benchmarks/";
			String dest[] = {"CG/", "stream/", "FFT/", "HPL/", 
					"RA/", "STREAM/", "mapreduce/", "linpack/", 
					"mg/","montecarlo/", "raytracer/", "sor/", 
					"crypt/", "moldyn/", "plasma/", "series/", "sparsemm/", "mapreduce/Test/"};
			///String rplasma = "rplasma/";
			String rplasma = "";
			//String splasma = "splasma/";
			String splasma = "";
			String tplasma = "tplasma/";
			//String tplasma = "";
			String fileName = "RunMain.x10";
			/*
				00. CG
				01. fragstream
				02. FFT
				03. HPL
				04. RA
				05. STREAM
				06. mapReduce //DONE
				07. linpack //DONE - Reduced size
				08. mg //DONE
			-	09. montecarlo
				10. raytracer //DONE - Reduced Size
				11. sor //DONE
			-	12. crypt //DONE - Reduced Size
				13. moldyn //DONE
			-	14. plasma
			-	15. series //DONE
				16. sparsemm //DONE
				17. test
			 */
			int i = 06;
			
			File input = new File(home+dest[i]+tplasma+fileName);
			FileReader fr;
			try {
				fr = new FileReader(input);
				BufferedReader buffy = new BufferedReader(fr);
				FieldsGeneratorVisitor fgv = new FieldsGeneratorVisitor(null);
				plasmax10.syntaxtree.Node root1 = new PlasmaX10Parser(buffy).File();
				root1.accept(fgv, null);
				SymbolTableGeneratorVisitor stgv = new SymbolTableGeneratorVisitor(fgv.classSymbolTable);
				root1.accept(stgv, null);
				System.out.println(stgv.classSymbolTable);
				fr.close();
				buffy.close();

				fr = new FileReader(input);
				buffy = new BufferedReader(fr);
				splasmax10.syntaxtree.Node root2 = new SPlasmaX10Parser(buffy).File();
				splasmax10.visitor.SPlasmaX10ToTPlasmaX10Visitor tpjsv = new SPlasmaX10ToTPlasmaX10Visitor(stgv.classSymbolTable, null);
				root2.accept(tpjsv, null);
			
				/*File output = new File(home+dest[i]+splasma+"SPlasmaX10"+fileName);
				FileWriter fw = new FileWriter(output);
				for(String className : rtsv.classes.keySet())
				{
					fw.write(rtsv.classes.get(className).toString()+"\n");
				}*/
				//System.out.println(lgv.rankSet);
				//System.out.println("----------------------------------------------------------------------------------------------------");
				//System.out.println(lgv.factorySet);
				fr.close();
				buffy.close();
				//fw.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class DistArray<R> {
	public ArrayList<R> contents;
	public Object distribution;
	
	public DistArray<R> getNewArray(Object dist)
	{
		return new DistArray<R>(new ArrayList<R>());
	}
	
	public DistArray(ArrayList<R> contents) {
		this.contents = contents;
	}
	
}
