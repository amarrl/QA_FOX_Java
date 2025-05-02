package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.LinkedList;

public class Exmple {

	public static void main(String[] args) {
		LinkedList a=new LinkedList();
		a.add("Amar");
		a.add("Kumar");
		a.add("Amar");
		a.add("Kumar"); 
		
		System.out.println(a);
		
		for(Object h:a) {
			System.out.println(h);
			
		}
		
		System.out.println("==========================");
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("==========================");
		
		Iterator itr=a.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("==========================");
		Object []b=a.toArray();
		
		System.out.println(b[2]);
		
		for(int j=0;j<b.length;j++) {
			System.out.print(b[j]);
		}
		
		
 
	}

}
