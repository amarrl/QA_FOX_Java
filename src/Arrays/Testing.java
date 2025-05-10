package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Testing {
	//creating a array and converting to list 
//	returns a fixed-size list backed by the original array. This means:

	//	You can access and modify elements (list.set(0, 10) is okay).
	
	
	public static void main(String[]args) {
		 Integer arr[]={5,6,9,1,2,3,4};
	     
		 
		 List<Integer>list=Arrays.asList(arr);
		 list.set(0, 9);  
		//list.add(3);
		 
		
		List<Integer>listv=new ArrayList<>();  
		listv.addAll(list); 
		listv.add(3,3);
	
		System.out.println(listv);   
		
		Object[]arrr=listv.toArray(); 
		
		System.out.println(arrr[1]);
	      
	     /*
	Iterator<Integer> itr=listv.iterator();
	       
	while(itr.hasNext()) {
		System.out.print(itr.next());  
	} 
	      
	*/
		
		Collections.sort(listv);
		
		System.out.println("Sorted collections is "+listv);
		Collections.reverse(listv);
		
		System.out.println("revresd collections is "+listv);
	
	    
	      Collections.shuffle(listv);
	      
			System.out.println("Shuffele collections is "+listv);
	      
	}

}
