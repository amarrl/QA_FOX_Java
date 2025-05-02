package ExceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Finnalyep2 {

	public static void main(String[] args) throws IOException {
		
		
	 File f=new File("C:\\Users\\Amarr\\Desktop\\Presentation\\Additional FAQs.docx");
	 FileReader fr=null;
	 try {
		 System.out.println("Insider try block");
	  fr=new FileReader(f);
	  
	 }catch(Exception e){
		 System.out.println("Insider catch block");
	 }
	 
	 finally {
		 if(fr!=null) {
		 System.out.println("Insider finnaly");
		 fr.close();
	 }
	 }

	}

}
