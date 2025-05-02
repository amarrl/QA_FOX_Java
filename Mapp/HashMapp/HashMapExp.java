package HashMapp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExp {
	
	public static void main (String[]args) {
		HashMap <Object,Object>l=new HashMap();
		l.put(101, "Arun");
		l.put(102, "Tharun");
		l.put(102, "Ori");    // Arun will get replaced with the new values
		l.put(194, "remove Object"); 
		l.put(106, "Joker");
		
		
		System.out.println(l);
	
		
		System.out.println(l.get(102));   //ori
		
	
		
		//l.remove(194, "remove Object");
	
		l.remove(194);
		l.replace(106,"King");
		//l.replace(106, "Joker","King");
	
		System.out.println(l);
		
		System.out.println(l.containsKey(106));  //true
		System.out.println(l.containsValue("Joker"));  //false
		System.out.println(l.size());   
		System.out.println(l.isEmpty());  //false
		
		System.out.println(l);
		//l.clear();
		//System.out.println(l.isEmpty());  //true
		
		System.out.println(l.keySet());  //Retrive all the keys from the hashmap
		
		System.out.println(l.values());  //Retrive all the Values from the hashmap
		System.out.println("==========================");
		
		//give th list of sets  in [] 
		
		 
		
		System.out.println(l.entrySet());
		
Set i=l.entrySet();        //list of sets
		
		Iterator itr=i.iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());  //101=Arun 102=Ori 106=King
			
			Entry e=(Entry)itr.next();
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			
			System.out.println("==========================");
			
	if(e.getKey().equals(101)) {
		e.setValue("Amar");
		
		
	}
		
		
		}
		System.out.println(l);
		
			
	

}
}

