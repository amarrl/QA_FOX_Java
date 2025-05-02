package Programming_String;

import java.util.HashMap;
import java.util.Map;

public class ShortOccurenceExmp2 {
	public static void main (String[]args){
    	HashMap<Character, Integer> magaHash = new HashMap<>();
    	
    	String expected="Haridwarakumarparvatha";
    	
    	expected=expected.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
    for(char c:expected.toCharArray()) {
    	magaHash.put(c, magaHash.getOrDefault(c,0)+1); 
    	
    	  
    }
    System.out.println(magaHash); 

    
    for(Map.Entry ee:magaHash.entrySet()) {
    	
    	System.out.println("Charcter is "+ee.getKey()+" Value is "+ee.getValue());
    }
    
/*
	System.out.println("---------------------------");
	  for(Map.Entry<Character, Integer> ee:magaHash.entrySet()) {
	    	if(ee.getValue() >1) {
	    	System.out.println("Charcter is "+ee.getKey()+" Value is "+ee.getValue());
	    }
	  }
	  */
	    }
}
