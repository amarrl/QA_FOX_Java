 package FileHandling;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterandBufferedReader {

	public static void main(String[] args) throws IOException {
		File f=new File("ab.txt");  // if we don't menstion also it will be ok
		
		//FileWriter w=new FileWriter("abc.txt");
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("abc.txt"));
		
		bw.write("King");
		bw.newLine();
        bw.write("Khan");
        bw.newLine();
        bw.write("Saruk");
        
        bw.flush();
        bw.close();
        
        BufferedReader br=new BufferedReader(new FileReader("abc.txt"));
        
       // int c=br.read();
        
      // System.out.println(br.readLine());
      // System.out.println(br.readLine());
      // System.out.println(br.readLine());
      // System.out.println(br.readLine());
        /*
        while(c!=-1) {
        	System.out.print((char)c);
        	
        	c=br.read();
        }
        */
System.out.println("----------------------");
       
       String str=br.readLine();
       while(str!=null) {
    	   System.out.println(str);
    	   
    	   str=br.readLine();
    	   
       }
	}

}
