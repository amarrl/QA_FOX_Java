package Programming_String;

import java.util.Arrays;

public class ShortOcuurneces {

	public static void main(String[] args) {
		
		  String text="Haridwara kumar parvatha";  
		  
		  text=text.toLowerCase().replaceAll("[^a-zA-Z]",""); 
		  
		  System.out.println(text);
		  
		char[]ch=  text.toCharArray(); 
		
		Arrays.sort(ch);    
		 
		
		     
		int count[]=new int[26];
		
		for(char t:ch) {
			count[t-'a']++;
		}
		
		char curenchar='a'; 
		
		for(int kk:count) {
			if(kk>0) {
			System.out.println(curenchar+":="+kk);
			}
			curenchar++;
		}
		
 
	

}
}