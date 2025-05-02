package HashMapp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesClass {
	
	public static void main(String[]args) throws IOException {
		FileInputStream i=new FileInputStream("C:\\Users\\Amar\\eclipse-workspace\\new 2024 ide\\QA_Fox_Java\\Amar new floder\\data.properties");
		
		Properties p=new Properties();
		p.load(i);
		
		String userName=p.getProperty("userName");
		String Password=p.getProperty("password"); 
		String scre=p.getProperty("SceretKey");
		
		System.out.println("To login the \"username\" is "+userName+" Password is\"Password\"is "+Password+"SceretKey is "+scre);
		
		System.out.println("To Retrive all the properties names");
		
		Enumeration e=p.propertyNames();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("Setting new things in propertyfile");
		p.setProperty("SceretKey", "Nig yak beku");
		System.out.println(p);
		
		p.setProperty("SceretKey", "Gotthu");
		System.out.println(p);
		
		FileOutputStream o=new FileOutputStream("data.properties");
		
		p.store(o, "Added new field and updated sceretkey");
	
	
		
		
		
		
		
		
		
		
	}

}
