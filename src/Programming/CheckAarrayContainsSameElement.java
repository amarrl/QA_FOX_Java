package Programming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckAarrayContainsSameElement {

	public static void main(String[] args) {

	        int a[] = {1, 2, 3, 4, 6, 7, 8, 9};
	        int b[] = {4, 5, 13, 24, 56, 8, 3};

	        List<Integer> all = new ArrayList<>(); 
	       // List<Integer> duplicates = new ArrayList<>();
	        Set<Integer> duplicates = new HashSet<>();
	       // all.addAll(duplicates);

	        // Add elements of array a to all
	        for (int i : a) {
	            all.add(i); 
	        }
	        
	        System.out.println("Array A: " + all);

	        // Check each element in array b; if it's in array a, add to duplicates
	        for (int i : b) {
	            if (all.contains(i)) { 
	                duplicates.add(i); 
	            }
	        }
	        System.out.println("Common elements in both arrays: " + duplicates);
	    }
}
