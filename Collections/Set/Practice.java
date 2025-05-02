package Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String h[]= {"Amar","Kumar","Praveen","Amar","Ravindra"};
		System.out.println(h);

		
		for(String j:h) {
			System.out.println(j);
		}
		
		List l1=Arrays.asList(h);
		System.out.println("Pronting the objects from the list"+l1);
	System.out.println("oooooooooooooo"+l1.get(1));
		
		Set a=new HashSet();
		a.addAll(l1);
		
		System.out.println("==========================");
		for(Object a1:a) {
			System.out.println(a1);
		}
		
		System.out.println("================Linked Hashset insertion order is prevvesed");
		
		LinkedHashSet l2=new LinkedHashSet();
		
		l2.addAll(l1);
		
		for(Object w1:l2) {
			System.out.println(w1);
		}
	
	}

}
