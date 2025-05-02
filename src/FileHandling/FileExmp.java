package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileExmp {

	public static void main(String[] args) throws IOException {
		
		
		
		//How to create a physical folder and file

		
		File floder=new File("Amar Test Floder");  //Representing folder at object level not physical level
		
		System.out.println(floder.exists());    //flase
		
		floder.mkdir();                        //creates the represented folder at the physical level
		
		System.out.println(floder.exists());   //true
	System.out.println("============================================");
			File flofile=new File(floder,"test.txt");   // Representing file at object level not physical level
			System.out.println(flofile.exists());   //false
			
			flofile.createNewFile();  //creates the represented file at the physical level
			System.out.println(flofile.exists());   //true
			
			System.out.println("-------------------------------");
			System.out.println(flofile.isFile());  //true
			System.out.println(floder.isDirectory());   //true
			
			System.out.println(flofile.length());
			
			flofile.delete();
		
	
		
		

	}

}
