package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExmp {
	
	public static void main(String[]args) {
		HashSet<Object> h=new HashSet();
		System.out.println(h.add("Arun")); 
		h.add(9);	
		h.add(17.55); 
		h.add("Arun");
		h.add(true); 
		h.add('V');
		System.out.println(h.add("Arun"));  //false //ignored //No compile time error but this object won't be inserted
		
		System.out.println(h);
		
		
	
		
		for(Object d:h) {
			System.out.println(d);
		}
		
	
		
		
		System.out.println("=============Printing using Iterator=========");
		
		Iterator y=h.iterator();
		
		while(y.hasNext()) { 
			System.out.println(y.next());
		}
		
	}

}
