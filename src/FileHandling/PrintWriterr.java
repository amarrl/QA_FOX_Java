package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class PrintWriterr {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pr=new PrintWriter(new File("abc.txt"));
		
		pr.println("Arun");
		pr.println("Amar how are you");
		pr.println("Good");
		pr.print(12);
		
		pr.flush();
		
	
		
		
		

	}

}
