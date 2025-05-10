package String;

import java.util.Arrays;
import java.util.List;

public class PrintthenumberofSpacesInString {
	
	public static void main(String[]args) {
	/*
	String s="Amar";
	
	String res=""; 
	

	
	for(int i=s.length()-1;i>=0;i--) { 
		res+=s.charAt(i);
		
		 
	}
	
	System.out.println(res);
*/
		String s=" Amar kumar is";
	      int count=0;
	     
	    char ch[]= s.toCharArray();
	    
	    Character jk[]=new Character[ch.length];
	    
	    
	    for(int i=0;i<ch.length;i++){
	      jk[i]=ch[i];
	    }
	   
	   
	  List<Character>listis= Arrays.asList(jk);
	   System.out.println(listis);
	  
	  for(Character kk:listis){

	    if(kk.equals(' ')){
	      count++;
	    }
	    
	  }
	  
	  System.out.println(count);
		
	}
}
