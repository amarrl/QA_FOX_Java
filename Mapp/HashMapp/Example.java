package HashMapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1, "Kmar");
		h.put(2, "Amar");
		h.put(3, "Ajay"); 
		h.put(4, "Raj");
		h.put(5, "Kundra");
		h.put(6, "Kmar");
		
		System.out.println(h);
		System.out.println("-------------------");
		
		System.out.println(h.entrySet());		
		
		System.out.println("-------------------");
		
	 Set i=h.entrySet(); 
	 //System.out.println(i);
	 
	 Iterator itr=i.iterator();
	 
	 while(itr.hasNext()) {
		 //System.out.println( itr.next());
		 
		Entry e=(Entry) itr.next();
		System.out.println(e.getKey());
		System.out.println(e.getValue());
		
		if(e.getKey().equals(3)) {
			e.setValue("Replaced");
		}
	 }
	 System.out.println(h.entrySet());
	 

	}

}
