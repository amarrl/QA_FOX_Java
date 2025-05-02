package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		

	


		        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8,9};
		        int arr2[] = {9, 10, 11, 12, 13, 14}; 
		        int arr3[] = {3, 9, 15, 16, 17, 18};

		        // Convert arrays to sets for easy intersection
		        Set<Integer> set1 = new HashSet<>();
		        for (int i : arr1) set1.add(i);

		        Set<Integer> set2 = new HashSet<>();
		        for (int i : arr2) set2.add(i);

		        Set<Integer> set3 = new HashSet<>();
		        for (int i : arr3) set3.add(i);

		        // Find intersection: common elements in all three sets
		        set1.retainAll(set2); // Now set1 = common between arr1 and arr2
		        set1.retainAll(set3); // Now set1 = common between all three arrays

		        // Store common elements into 4th array
		        List<Integer> arr4 = new ArrayList<>(set1);

		        // Print the result
		        if (arr4.isEmpty()) {
		            System.out.println("No common elements found in all three arrays.");
		        } else {
		            System.out.println("Common elements in all three arrays:");
		            for (int num : arr4) {
		                System.out.println(num);
		            }
		        }
		    }
		


	

	

}
