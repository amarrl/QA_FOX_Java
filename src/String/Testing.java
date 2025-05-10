package String;

import java.util.Arrays;
import java.util.List;

public class Testing {

	public static void main(String[] args) {
		 String s="Amar kumar is";
	     
		 char ch[]= s.toCharArray(); 
		    
		 
		 Character k[]=new Character[ch.length];
		 
		 for(int i=0;i<ch.length;i++) {
			 k[i]=ch[i];
		 }
		   
				 
		 
		    List<Character>list=Arrays.asList(k);
		    
		    for(Character gh:list){ 
		      System.out.println(gh);
		    }
  
	}

}
