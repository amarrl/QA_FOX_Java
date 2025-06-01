package HashMapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		 String text="Amar uz rajkumarmmm";
	      
	      text=text.toLowerCase().replaceAll("[^a-zA-Z]","");
	      
	      Map<Integer,Character>map=new HashMap<>();
	      
	      char ch[]=text.toCharArray();
	      
	      for(int i=0;i<text.length();i++){
	       map.put(i,text.charAt(i));
	        
	       
	      } 
	      
	    for(Map.Entry ee:map.entrySet()) {
	    	System.out.println(ee.getKey());
	    	System.out.println(ee.getValue());
	    
		/*
		Map<Integer,String>map=new HashMap<>();

		map.put(1,"Amar");
		map.put(2,"raj");
		map.put(3,"kumar");
		map.put(4,"Ravi");



		System.out.println(map);

		for(Map.Entry ee:map.entrySet()){

		System.out.println(ee.getKey() +" "+ee.getValue());

		}

		Set val=map.entrySet();

		Iterator itr=val.iterator();

		while(itr.hasNext()){
			
		Map.Entry entry=(Entry) itr.next();
		
	

		System.out.println(entry.getKey()+" "+entry.getValue() );

		}
		
		int a[] = {1, 2, 3, 4, 6, 7, 8, 9};
		int b[] = {4, 5, 13, 24, 56, 8, 3};


		List<Integer>unique=new ArrayList<>();
		Set<Integer>dup=new HashSet<>();

	
		for(int k:a) {
			unique.add(k);
		}
		
		for(int l:b) {
			if(unique.contains(l)) {
				dup.add(l);
			}
		}

		System.out.println(dup);
		  
		*/

	    	System.out.println("---01-06");
	}
}
}

