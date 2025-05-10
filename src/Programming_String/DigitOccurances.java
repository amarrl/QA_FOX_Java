package Programming_String;

import java.nio.file.spi.FileSystemProvider;

public class DigitOccurances {

	public static void main(String[] args) {
		 String h="12341234567";
	      
	     char gh[]=h.toCharArray();  
	     
	     int count[]=new int[10];
	     
	     System.out.println(count.length); 
	      
	       
	     for(char charis:gh){
	       if(Character.isDigit(charis)){
	         count[charis-'0']++;
	       } 
	     }
	     
	     for(int i=0;i<count.length;i++){  
	       if(count[i]>0){
	         System.out.println("char at i is "+i+" Count is "+count[i]);
	       }
	     }

	}

}


/*

String text="12345612345678";



int count[]=new int[10];

for(char ch:text.toCharArray()){
  if(Character.isDigit(ch)){
  count[ch-'0']++;
  }
}

char currentcharIs='0';

for(int k:count){
if(k>0){
 System.out.println("Current char is "+currentcharIs+"count is "+k);
}
currentcharIs++;
*/