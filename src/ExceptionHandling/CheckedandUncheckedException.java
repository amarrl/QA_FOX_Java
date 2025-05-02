package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedandUncheckedException {

	public static void main(String[] args) {
		File in=new File("C:\\Userrs\\Amar\\Desktop\\Presentation\\Additional FAQs.docx");
		try {
		FileReader d=new FileReader(in);
		
	
		}catch(FileNotFoundException e){
			//e.printStackTrace();
	
			System.out.println(e);
			
		}
		
		System.out.println("Correct file path");

	}

}
