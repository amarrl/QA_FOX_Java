package Programming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class largestandsmallestElementInArray {
	public static void main(String[]args) {
	
		
		 int ar1[] = {1, 2, 3, 4, 9, 6, 7, 8};
	int max=ar1[0]; 
	 
	
		for(int i=0;i<ar1.length;i++) {
		if(ar1[i]<max) {
			max=ar1[i]; 
		} 
		}
		System.out.println(max);
		
}
	
	

	
	
	

}
