package HashMapp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyPractice {
	
	public static void main(String[]args) throws IOException {
		FileInputStream ir=new FileInputStream("C:\\Users\\Amar\\eclipse-workspace\\new 2024 ide\\QA_Fox_Java\\Amar new floder\\Amar.properties");
		
		Properties p=new Properties();
		p.load(ir);
		
		System.out.println(p.getProperty("userName"));
	p.setProperty("userName", "llak");
	System.out.println(p.getProperty("userName"));
	
	
	
	
	}

}
