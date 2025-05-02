package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {

	public static void main(String[] args) throws FileNotFoundException {
	
		methodA() ; 

	}
	
	public static void methodA() {
		
		try {
			methodB();		
		
	} catch(Exception e){
		System.out.println("Exception got handled");
	}
	}
	
public static void methodB() throws FileNotFoundException {
	methodC();
	}

public static void methodC() throws FileNotFoundException  {
	FileReader g=new FileReader(new File("C:\\Users\\Amar\\dDesktop\\Presentation\\Additional FAQs.docx\\"));
}

}









