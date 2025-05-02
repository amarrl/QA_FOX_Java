package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadandWrite {

	public static void main(String[] args) throws IOException {
	File f=new File("abc.txt");
	
	FileWriter w=new FileWriter(f);
	w.write("Hello World\n");
	w.write("How are you\n");
	w.write("Bye");
	
	w.flush();
	w.close();
	
	//Performe Read Operatoions from FileRaeder
	System.out.println("--------------------------");
	
	FileReader r=new FileReader(f);
	
	//System.out.println((char)r.read());
	
	int c=r.read();   //Reading char by charcter
	
	while(c!=-1) {
		System.out.print((char)c);
		
		c=r.read();
		
		
	}
	
	r.close();
	
	
	
	

	}

}
