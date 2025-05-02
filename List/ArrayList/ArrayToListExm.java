package ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayToListExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[]s= {"kmar","Aumar"}; 
		
		System.out.println(s); 
		
		
		for(String h:s) {
			System.out.println(h);
		}
	 	
	List s1=Arrays.asList(s); 
	System.out.println(s1); 
	
	Object[]aj=s1.toArray();
	System.out.println(aj);
	
	for(Object j:aj) { 
		System.out.println("ksksk "+j);  
	
	}
	
	
	System.out.println(s1.get(1));
		
	}

}
