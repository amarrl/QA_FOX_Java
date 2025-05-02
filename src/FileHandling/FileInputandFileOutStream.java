package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

public class FileInputandFileOutStream {

	public static void main(String[] args) throws IOException {
		FileInputStream s=new FileInputStream(new File("abc.txt"));
		
	
		
		int str=s.read();
		
		while(str!=-1) {
			System.out.print((char)s.read());
			
			str=s.read();
		}
		
		

	}

}
