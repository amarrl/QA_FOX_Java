package Set;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSett {
    public static void main(String[]args) {
    	LinkedHashSet<Object> h1=new LinkedHashSet();
    	h1.add("Arun");
    	h1.add("Bindhu");
    	h1.add(12.33);
    	h1.add('V');
    	h1.add('V'); 
    	h1.add("last");
    	h1.add("lasst");
    	
    	for(Object gg:h1) {
    		System.out.println(gg);
    	}
    	
    	
    	
    	System.out.println(h1.size()); 
    	
    	Iterator i=h1.iterator();
    	while(i.hasNext()) {
    		System.out.println(i.next());
    	}
    	System.out.println("=======================================");
    	
    	
    	
    	
    	System.out.println("=======================================");
    	
    	System.out.println("Adding all object inro another list");
    	
    	LinkedHashSet<Object> h2=new LinkedHashSet<Object>();
    	
    	h2.add("First");
    	h2.add(null); 
    	h2.addAll(h1);
    	
    	System.out.println(h2);
    	
    	
    	
    	
    }
}
