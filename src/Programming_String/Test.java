package Programming_String;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {


	

	    
	    	    public static void main(String[] args) { 
	    	    	String s ="parogramminga"; 
	    	     	
	    	     	char ch[]=s.toCharArray();
	    	     	
	    	     	Map<Integer,Character>map=new HashMap<>();
	    	     	
	    	     	for(int i=0;i<s.length();i++){
	    	     	  map.put(i,ch[i]);
	    	     	}
	    	     
	    	    // System.out.println(map);
	    	     
	    	     Collection<Character>hh=map.values();
	    	     
	    	        Set<Character> unique=new HashSet<>();
	    	       
	    	        Set<Character> duplicate=new HashSet<>();
	    	        
	    	        for(Character gh:hh){
	    	          
	    	        if(!unique.add(gh)){
	    	          duplicate.add(gh);
	    	        }
	    	        }
	    	        
	    	        System.out.println(unique);
	    	        System.out.println(duplicate);
	    	     }
	    	     
	    	  }

	     
	     
	  


