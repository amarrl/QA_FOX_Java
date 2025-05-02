package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class IgnoringCheckedException {

	public static void main(String[] args) throws FileNotFoundException {
		File d=new File("C:\\Users\\Amar\\Desktop\\Presesntation\\Additional FAQs.docx\\");
		
		FileReader g=new FileReader(d); 
		
System.out.println("Exception not terminated");
	}

}
