package HashMapp;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapp {

	public static void main(String[] args) {
		LinkedHashMap u=new LinkedHashMap();
		
		u.put(104, "Amar");
		u.put(103, "Arun"); 
		u.put(102, "Ajay");
		u.put(101, "King");
		System.out.println(u);
		
	Set s=u.entrySet();
	System.out.println(s);
	
	Iterator itr=s.iterator();
	while(itr.hasNext()) {
		Entry e=(Entry)itr.next();
		System.out.println( e.getKey());
		System.out.println( e.getValue());
		
		System.out.println("--------------------------");
		
	}
	
	
		

	}

}
