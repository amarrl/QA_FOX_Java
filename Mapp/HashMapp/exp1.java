package HashMapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class exp1 {
	public static void main(String[]args) {
		 Map<Integer,Character>map=new HashMap();
		 
		 map.put(1, 'A');
		 map.put(2, 'M');
		 map.put(3, 'A');
		 map.put(4, 'R');
		 
		 System.out.println("-----"+map.get(2)); 
		  	
		    //Traversing Map 
		Set val= map.entrySet(); 	//Converting to Set so that we can traverse
		
		System.out.println(val);
		
	
		Iterator itr=val.iterator();
		
		while(itr.hasNext()) {
	        //Converting to Map.Entry so that we can get key and value separately  

			Map.Entry entry=(Entry) itr.next();
			
		
			System.out.println(entry.getKey()+" "+entry.getValue()); 
			/*
			if(entry.getValue().equals('l')) {
				itr.remove();
			} 
			*/

		}
		
		System.out.println("------------------------------------------");
		
		for(Map.Entry mm:map.entrySet()) {
			System.out.println(mm.getKey()+" "+mm.getValue());
		}
		
		//map.clear();
		
		map.remove(4,'R');
	
		
		
		map.put(4, 'G');
		map.put(4, 'U');
		System.out.println(map.get(4));
	/*	
	Character c=	map.replace(5, 'Z');
	
	System.out.println(c);
		
		*/
		 System.out.println("-----"+map); 
		
	
		
		
	}

}
