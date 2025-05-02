package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Practice {

	public static void main(String[] args) throws IOException {
		/*
		BufferedWriter bw=new BufferedWriter(new FileWriter("abc.txt"));
		bw.write("Amar");
		bw.newLine();
		bw.write("Sujan");
		bw.newLine();
		bw.write("ranjan");
		
		bw.flush();
		bw.close();
	
		
		PrintWriter p=new PrintWriter(new File("abc.txt"));
		p.println("Amar");
		p.println("Sujan");
		p.println("kumar balan");
		p.flush();
		p.close();
		
		
		/*
		BufferedReader br=new BufferedReader(new FileReader("abc.txt"));

		
		for(String str=br.readLine();str!=null;str=br.readLine()) {
			System.out.println(str);
		}
		*/
		String n="Amar out";
		File f=new File("abc.txt");
		FileOutputStream op=new FileOutputStream(f);
		op.write(n.getBytes());
		System.out.println("====");
		
		
		
		
		
		FileInputStream fr=new FileInputStream(new File("abc.txt"));
		
		//char c=(char)fr.read();
	//	System.out.println(c);
		
		for(int c=fr.read();c!=-1;c=fr.read()) {
			char r=(char)c;
			System.out.print(r);
			
		}
		
	
	

		
		
	}

}
